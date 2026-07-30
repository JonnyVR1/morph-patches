package p007l;

import android.os.SystemClock;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.alibaba.fastjson.JSON;
import com.google.gson.JsonObject;
import com.p000p1.mobile.putong.data.AudioMedia;
import com.p000p1.mobile.putong.data.BubbleInfo;
import com.p000p1.mobile.putong.data.CommonData;
import com.p000p1.mobile.putong.data.ConversationStatus;
import com.p000p1.mobile.putong.data.DetectRequest;
import com.p000p1.mobile.putong.data.Dimension;
import com.p000p1.mobile.putong.data.Envelope;
import com.p000p1.mobile.putong.data.Followship;
import com.p000p1.mobile.putong.data.FollowshipCounter;
import com.p000p1.mobile.putong.data.FollowshipStatus;
import com.p000p1.mobile.putong.data.GifMedia;
import com.p000p1.mobile.putong.data.Links;
import com.p000p1.mobile.putong.data.Live;
import com.p000p1.mobile.putong.data.LiveUserMask;
import com.p000p1.mobile.putong.data.MatchScData;
import com.p000p1.mobile.putong.data.Media;
import com.p000p1.mobile.putong.data.MediaLocalStatus;
import com.p000p1.mobile.putong.data.Moments;
import com.p000p1.mobile.putong.data.Music;
import com.p000p1.mobile.putong.data.NearbyLocation;
import com.p000p1.mobile.putong.data.OMSTemplateModeType;
import com.p000p1.mobile.putong.data.Owner;
import com.p000p1.mobile.putong.data.Pagination;
import com.p000p1.mobile.putong.data.PartialIdList;
import com.p000p1.mobile.putong.data.Picture;
import com.p000p1.mobile.putong.data.Profile;
import com.p000p1.mobile.putong.data.Relationship;
import com.p000p1.mobile.putong.data.RelationshipStatus;
import com.p000p1.mobile.putong.data.Room;
import com.p000p1.mobile.putong.data.StickerInfo;
import com.p000p1.mobile.putong.data.UploadSource;
import com.p000p1.mobile.putong.data.User;
import com.p000p1.mobile.putong.data.Video;
import com.p000p1.mobile.putong.data.VoiceLiveGame;
import com.p000p1.mobile.putong.data.VoiceRoomInfo;
import com.p000p1.mobile.putong.data.tenum.TEnum;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.R$string;
import com.p000p1.mobile.putong.feed.data.AttitudeSourceCatCount;
import com.p000p1.mobile.putong.feed.data.CommentInfo;
import com.p000p1.mobile.putong.feed.data.FeedData;
import com.p000p1.mobile.putong.feed.data.FeedLiterature;
import com.p000p1.mobile.putong.feed.data.FeedLiteraturesComment;
import com.p000p1.mobile.putong.feed.data.FeedUserLiveLabel;
import com.p000p1.mobile.putong.feed.data.Group;
import com.p000p1.mobile.putong.feed.data.GroupType;
import com.p000p1.mobile.putong.feed.data.GuideStatePostConfig;
import com.p000p1.mobile.putong.feed.data.LiveCircleBanner;
import com.p000p1.mobile.putong.feed.data.LiveCircleExtInfo;
import com.p000p1.mobile.putong.feed.data.LiveExtraInFeed;
import com.p000p1.mobile.putong.feed.data.LiveMultiCallLiveSchema;
import com.p000p1.mobile.putong.feed.data.LiveRecommendCard;
import com.p000p1.mobile.putong.feed.data.Moment;
import com.p000p1.mobile.putong.feed.data.MomentAllowForwardState;
import com.p000p1.mobile.putong.feed.data.MomentFeedsExtra;
import com.p000p1.mobile.putong.feed.data.MomentForwards;
import com.p000p1.mobile.putong.feed.data.MomentLevelGuides;
import com.p000p1.mobile.putong.feed.data.MomentMessage;
import com.p000p1.mobile.putong.feed.data.MomentMessageType;
import com.p000p1.mobile.putong.feed.data.MomentSettings;
import com.p000p1.mobile.putong.feed.data.MomentViewerBox;
import com.p000p1.mobile.putong.feed.data.MomentVisibilityStatus;
import com.p000p1.mobile.putong.feed.data.MomentVoiceLiveInfos;
import com.p000p1.mobile.putong.feed.data.NotifyUsers;
import com.p000p1.mobile.putong.feed.data.OnVoiceCall;
import com.p000p1.mobile.putong.feed.data.OperationType;
import com.p000p1.mobile.putong.feed.data.PersonAlbumBgInfo;
import com.p000p1.mobile.putong.feed.data.PostBasePopWindow;
import com.p000p1.mobile.putong.feed.data.RawFeed;
import com.p000p1.mobile.putong.feed.data.TopicCategorie;
import com.p000p1.mobile.putong.feed.data.TopicMoment;
import com.p000p1.mobile.putong.feed.data.TopicOperations;
import com.p000p1.mobile.putong.feed.data.UserSetVisibility;
import com.p000p1.mobile.putong.feed.data.ViewersBox;
import com.p000p1.mobile.putong.feed.data.VoiceLive;
import com.p000p1.mobile.putong.feed.data.VoiceLiveMomentFeed;
import com.p000p1.mobile.putong.feed.data.VoteOptions;
import com.p000p1.mobile.putong.feed.helper.MomentUserNullException;
import com.p000p1.mobile.putong.feed.helper.exception.MomentPostFailedExcepion;
import com.p000p1.mobile.putong.feed.newui.photoalbum.discovery.FriendsFeedViewPagerFrag;
import com.p000p1.mobile.putong.feed.newui.photoalbum.feed.PhotoAlbumFeedAct;
import com.p1.mobile.android.app.App;
import com.p1.mobile.putong.api.api.Network;
import com.p1.mobile.putong.util.TrackMediaUploadUtil;
import com.tantanapp.common.data.CopyObject;
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
import l.aai;
import l.bkn0;
import l.cll;
import l.d30;
import l.e30;
import l.e51;
import l.hpd0;
import l.ia20;
import l.j760;
import l.jo0;
import l.kpd0;
import l.l3f;
import l.la20;
import l.lsi0;
import l.lsx;
import l.mkd0;
import l.mqi0;
import l.o660;
import l.p660;
import l.pgm;
import l.qib0;
import l.r5l0;
import l.rhi;
import l.roj0;
import l.s5l0;
import l.stc0;
import l.tpd0;
import l.uqd0;
import l.utc0;
import l.v9j;
import l.vwb;
import l.w9j;
import l.xaj0;
import l.xh5;
import l.yij0;
import l.zpd0;
import l.zvf0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import rx.Notification;
import rx.c;
import rx.subjects.a;
import rx.subjects.b;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class xia extends omg {

    /* JADX INFO: renamed from: L1 */
    public static j760<String, Integer> f14907L1;

    /* JADX INFO: renamed from: M1 */
    public static b<Boolean> f14908M1 = b.b();

    /* JADX INFO: renamed from: N1 */
    public static Throwable f14909N1 = new Throwable("对方取消了关注，暂时无法聊天");

    /* JADX INFO: renamed from: A0 */
    public final Map<String, User> f14910A0;

    /* JADX INFO: renamed from: A1 */
    public a<roj0> f14911A1;

    /* JADX INFO: renamed from: B0 */
    public b<String> f14912B0;

    /* JADX INFO: renamed from: B1 */
    public b<String> f14913B1;

    /* JADX INFO: renamed from: C0 */
    public b<Map<String, User>> f14914C0;

    /* JADX INFO: renamed from: C1 */
    public b<roj0> f14915C1;

    /* JADX INFO: renamed from: D0 */
    public List<String> f14916D0;

    /* JADX INFO: renamed from: D1 */
    public zpd0 f14917D1;

    /* JADX INFO: renamed from: E0 */
    public List<String> f14918E0;

    /* JADX INFO: renamed from: E1 */
    public zpd0 f14919E1;

    /* JADX INFO: renamed from: F0 */
    public List<String> f14920F0;

    /* JADX INFO: renamed from: F1 */
    public ConcurrentHashMap<String, String> f14921F1;

    /* JADX INFO: renamed from: G0 */
    public long f14922G0;

    /* JADX INFO: renamed from: G1 */
    public String f14923G1;

    /* JADX INFO: renamed from: H */
    public boolean f14924H;

    /* JADX INFO: renamed from: H0 */
    public final Map<String, MomentMessage> f14925H0;

    /* JADX INFO: renamed from: H1 */
    public TopicOperations f14926H1;

    /* JADX INFO: renamed from: I */
    public hpd0 f14927I;

    /* JADX INFO: renamed from: I0 */
    public final Map<String, StickerInfo> f14928I0;

    /* JADX INFO: renamed from: I1 */
    public String f14929I1;

    /* JADX INFO: renamed from: J */
    public uqd0 f14930J;

    /* JADX INFO: renamed from: J0 */
    public b<MomentMessage> f14931J0;

    /* JADX INFO: renamed from: J1 */
    public Map<String, ei00> f14932J1;

    /* JADX INFO: renamed from: K */
    public tpd0 f14933K;

    /* JADX INFO: renamed from: K0 */
    public b<MomentMessage> f14934K0;

    /* JADX INFO: renamed from: K1 */
    public a<List<User>> f14935K1;

    /* JADX INFO: renamed from: L */
    public zpd0 f14936L;

    /* JADX INFO: renamed from: L0 */
    public final Map<String, Group> f14937L0;

    /* JADX INFO: renamed from: M */
    public zpd0 f14938M;

    /* JADX INFO: renamed from: M0 */
    public final Map<String, BubbleInfo> f14939M0;

    /* JADX INFO: renamed from: N */
    public zpd0 f14940N;

    /* JADX INFO: renamed from: N0 */
    public GuideStatePostConfig f14941N0;

    /* JADX INFO: renamed from: O */
    public zpd0 f14942O;

    /* JADX INFO: renamed from: O0 */
    public a<GuideStatePostConfig> f14943O0;

    /* JADX INFO: renamed from: P */
    public zpd0 f14944P;

    /* JADX INFO: renamed from: P0 */
    public b<j760<String, Boolean>> f14945P0;

    /* JADX INFO: renamed from: Q */
    public tpd0 f14946Q;

    /* JADX INFO: renamed from: Q0 */
    public b<j760<User, Boolean>> f14947Q0;

    /* JADX INFO: renamed from: R0 */
    public b<String> f14949R0;

    /* JADX INFO: renamed from: S0 */
    public b<j760<User, Boolean>> f14951S0;

    /* JADX INFO: renamed from: T0 */
    public LinkedHashMap<String, Moment> f14953T0;

    /* JADX INFO: renamed from: U */
    public hpd0 f14954U;

    /* JADX INFO: renamed from: U0 */
    public Map<String, PersonAlbumBgInfo> f14955U0;

    /* JADX INFO: renamed from: V */
    public hpd0 f14956V;

    /* JADX INFO: renamed from: V0 */
    public b<Map<String, PersonAlbumBgInfo>> f14957V0;

    /* JADX INFO: renamed from: W */
    public hpd0 f14958W;

    /* JADX INFO: renamed from: W0 */
    public b<xaj0<List<User>, Integer, Boolean>> f14959W0;

    /* JADX INFO: renamed from: X */
    public hpd0 f14960X;

    /* JADX INFO: renamed from: X0 */
    public b<List<String>> f14961X0;

    /* JADX INFO: renamed from: Y */
    public hpd0 f14962Y;

    /* JADX INFO: renamed from: Y0 */
    public a<Boolean> f14963Y0;

    /* JADX INFO: renamed from: Z */
    public hpd0 f14964Z;

    /* JADX INFO: renamed from: Z0 */
    public zpd0 f14965Z0;

    /* JADX INFO: renamed from: a0 */
    public uqd0 f14966a0;

    /* JADX INFO: renamed from: a1 */
    public kpd0 f14967a1;

    /* JADX INFO: renamed from: b0 */
    public hpd0 f14968b0;

    /* JADX INFO: renamed from: b1 */
    public a<j760<Links, List<TopicMoment>>> f14969b1;

    /* JADX INFO: renamed from: c0 */
    public tpd0 f14970c0;

    /* JADX INFO: renamed from: c1 */
    public b<Map<String, TopicMoment>> f14971c1;

    /* JADX INFO: renamed from: d0 */
    public tpd0 f14972d0;

    /* JADX INFO: renamed from: d1 */
    public a<j760<Links, List<TopicMoment>>> f14973d1;

    /* JADX INFO: renamed from: e0 */
    public hpd0 f14974e0;

    /* JADX INFO: renamed from: e1 */
    public a<j760<Links, List<TopicMoment>>> f14975e1;

    /* JADX INFO: renamed from: f0 */
    public Map<String, Boolean> f14976f0;

    /* JADX INFO: renamed from: f1 */
    public a<TopicOperations> f14977f1;

    /* JADX INFO: renamed from: g0 */
    public Map<String, List<PostBasePopWindow>> f14978g0;

    /* JADX INFO: renamed from: g1 */
    public a<j760<List<TopicCategorie>, List<TopicMoment>>> f14979g1;

    /* JADX INFO: renamed from: h0 */
    public Map<String, MomentVoiceLiveInfos> f14980h0;

    /* JADX INFO: renamed from: h1 */
    public a<Double> f14981h1;

    /* JADX INFO: renamed from: i0 */
    public Map<String, Moment> f14982i0;

    /* JADX INFO: renamed from: i1 */
    public a<Map<String, BubbleInfo>> f14983i1;

    /* JADX INFO: renamed from: j0 */
    public Map<String, NotifyUsers> f14984j0;

    /* JADX INFO: renamed from: j1 */
    public a<List<BubbleInfo>> f14985j1;

    /* JADX INFO: renamed from: k0 */
    public List<NotifyUsers> f14986k0;

    /* JADX INFO: renamed from: k1 */
    public kpd0 f14987k1;

    /* JADX INFO: renamed from: l0 */
    public b<Map<String, Moment>> f14988l0;

    /* JADX INFO: renamed from: l1 */
    public ConcurrentHashMap<String, Live> f14989l1;

    /* JADX INFO: renamed from: m0 */
    public b<Moment> f14990m0;

    /* JADX INFO: renamed from: m1 */
    public ConcurrentHashMap<String, VoiceLive> f14991m1;

    /* JADX INFO: renamed from: n0 */
    public b<Moment> f14992n0;

    /* JADX INFO: renamed from: n1 */
    public ConcurrentHashMap<String, VoiceRoomInfo> f14993n1;

    /* JADX INFO: renamed from: o0 */
    public b<Moment> f14994o0;

    /* JADX INFO: renamed from: o1 */
    public ConcurrentHashMap<String, VoiceLiveGame> f14995o1;

    /* JADX INFO: renamed from: p0 */
    public b<Moment> f14996p0;

    /* JADX INFO: renamed from: p1 */
    public ConcurrentHashMap<String, VoiceLiveMomentFeed> f14997p1;

    /* JADX INFO: renamed from: q0 */
    public b<Moment> f14998q0;

    /* JADX INFO: renamed from: q1 */
    public ConcurrentHashMap<String, LiveCircleExtInfo> f14999q1;

    /* JADX INFO: renamed from: r0 */
    public b<Moment> f15000r0;

    /* JADX INFO: renamed from: r1 */
    public ConcurrentHashMap<String, LiveCircleBanner> f15001r1;

    /* JADX INFO: renamed from: s0 */
    public a<List<Moment>> f15002s0;

    /* JADX INFO: renamed from: s1 */
    public vdh f15003s1;

    /* JADX INFO: renamed from: t0 */
    public a<List<User>> f15004t0;

    /* JADX INFO: renamed from: t1 */
    public b<Boolean> f15005t1;

    /* JADX INFO: renamed from: u0 */
    public a<List<Moment>> f15006u0;

    /* JADX INFO: renamed from: u1 */
    public b<MomentLevelGuides> f15007u1;

    /* JADX INFO: renamed from: v0 */
    public a<xaj0<List<User>, List<Live>, Links>> f15008v0;

    /* JADX INFO: renamed from: v1 */
    public b<Boolean> f15009v1;

    /* JADX INFO: renamed from: w0 */
    public a<Boolean> f15010w0;

    /* JADX INFO: renamed from: w1 */
    public b<Boolean> f15011w1;

    /* JADX INFO: renamed from: x0 */
    public a<List<BubbleInfo>> f15012x0;

    /* JADX INFO: renamed from: x1 */
    public b<Followship> f15013x1;

    /* JADX INFO: renamed from: y0 */
    public b<roj0> f15014y0;

    /* JADX INFO: renamed from: y1 */
    public b<Relationship> f15015y1;

    /* JADX INFO: renamed from: z0 */
    public a<Boolean> f15016z0;

    /* JADX INFO: renamed from: z1 */
    public b<String> f15017z1;

    /* JADX INFO: renamed from: R */
    public final int f14948R = 20101;

    /* JADX INFO: renamed from: S */
    public final int f14950S = 20102;

    /* JADX INFO: renamed from: T */
    public zpd0 f14952T = new zpd0("like_show_bubble_number" + FeedModule.m1139F().userId(), 0L);

    public xia() {
        String str = "new_moment_draft_media" + FeedModule.m1139F().userId();
        Boolean bool = Boolean.FALSE;
        this.f14954U = new hpd0(str, bool);
        this.f14956V = new hpd0("new_moment_draft_text" + FeedModule.m1139F().userId(), bool);
        this.f14958W = new hpd0("near_by_feed_show_follow_tips_" + FeedModule.m1139F().userId(), bool);
        this.f14960X = new hpd0("has_show_follow_fans_tips_" + FeedModule.m1139F().userId(), bool);
        this.f14962Y = new hpd0("live_show_follow" + FeedModule.m1139F().userId(), bool);
        this.f14964Z = new hpd0("show_pop_window" + FeedModule.m1139F().userId(), bool);
        this.f14966a0 = new uqd0("first_like_moment" + FeedModule.m1139F().userId(), "");
        this.f14968b0 = new hpd0("default_sync_moment" + FeedModule.m1139F().userId(), bool);
        this.f14970c0 = new tpd0("fans_enter_count", 0);
        this.f14972d0 = new tpd0("following_enter_count", 0);
        this.f14974e0 = new hpd0("discovery_show_new_user_tips_" + FeedModule.m1139F().userId(), bool);
        this.f14976f0 = new HashMap();
        this.f14978g0 = new HashMap();
        this.f14980h0 = new HashMap();
        this.f14982i0 = new HashMap();
        this.f14984j0 = new HashMap();
        this.f14986k0 = vwb.f0(new NotifyUsers[0]);
        this.f14988l0 = b.b();
        this.f14990m0 = b.b();
        this.f14992n0 = b.b();
        this.f14994o0 = b.b();
        this.f14996p0 = b.b();
        this.f14998q0 = b.b();
        this.f15000r0 = b.b();
        this.f15002s0 = a.c(new ArrayList());
        this.f15004t0 = a.c(new ArrayList());
        this.f15006u0 = a.c(new ArrayList());
        this.f15008v0 = a.b();
        this.f15010w0 = a.b();
        this.f15012x0 = a.b();
        this.f15014y0 = b.b();
        this.f15016z0 = a.b();
        this.f14910A0 = new HashMap();
        this.f14912B0 = b.b();
        this.f14914C0 = b.b();
        this.f14916D0 = vwb.f0(new String[0]);
        this.f14918E0 = vwb.f0(new String[0]);
        this.f14920F0 = vwb.f0(new String[0]);
        this.f14922G0 = vqg.m15481I("feedTime");
        this.f14925H0 = new HashMap();
        this.f14928I0 = new HashMap();
        this.f14931J0 = b.b();
        this.f14934K0 = b.b();
        this.f14937L0 = new HashMap();
        this.f14939M0 = new HashMap();
        this.f14943O0 = a.b();
        this.f14945P0 = b.b();
        this.f14947Q0 = b.b();
        this.f14949R0 = b.b();
        this.f14951S0 = b.b();
        this.f14953T0 = new LinkedHashMap<>();
        this.f14955U0 = new HashMap();
        this.f14957V0 = b.b();
        this.f14959W0 = b.b();
        this.f14961X0 = b.b();
        this.f14963Y0 = a.b();
        this.f14965Z0 = new zpd0("nearby_fix_time_dot_show_time", 0L);
        this.f14967a1 = new kpd0("follow_moment_latest_create_time_" + FeedModule.m1139F().userId(), 0.0d);
        this.f14969b1 = a.b();
        this.f14971c1 = b.b();
        this.f14973d1 = a.b();
        this.f14975e1 = a.b();
        this.f14977f1 = a.b();
        this.f14979g1 = a.b();
        this.f14981h1 = a.c(Double.valueOf(0.0d));
        this.f14983i1 = a.c(new HashMap());
        this.f14985j1 = a.b();
        this.f14987k1 = new kpd0("moment_topic_latest_create_time_" + FeedModule.m1139F().userId(), 0.0d);
        this.f14989l1 = new ConcurrentHashMap<>();
        this.f14991m1 = new ConcurrentHashMap<>();
        this.f14993n1 = new ConcurrentHashMap<>();
        this.f14995o1 = new ConcurrentHashMap<>();
        this.f14997p1 = new ConcurrentHashMap<>();
        this.f14999q1 = new ConcurrentHashMap<>();
        this.f15001r1 = new ConcurrentHashMap<>();
        this.f15003s1 = new vdh();
        this.f15005t1 = b.b();
        this.f15007u1 = b.b();
        this.f15009v1 = b.b();
        this.f15011w1 = b.b();
        this.f15013x1 = b.b();
        this.f15015y1 = b.b();
        this.f15017z1 = b.b();
        this.f14911A1 = a.b();
        this.f14913B1 = b.b();
        this.f14915C1 = b.b();
        this.f14917D1 = new zpd0("have_new_user_ai_moment_award_time_" + FeedModule.m1139F().userId(), 0L);
        this.f14919E1 = new zpd0("last_show_my_tab_man_post_guide_time_" + FeedModule.m1139F().userId(), 0L);
        this.f14921F1 = new ConcurrentHashMap<>();
        this.f14923G1 = "";
        this.f14926H1 = null;
        this.f14929I1 = "dating";
        this.f14932J1 = new HashMap();
        this.f14935K1 = a.b();
        rpq.m13943b().m13948f("live", LiveExtraInFeed.JSON_ADAPTER);
        this.f14924H = !nkg.m12200A0();
        this.f14927I = new hpd0("has_showed_voice_mute_tips" + FeedModule.m1139F().userId(), bool);
        this.f14930J = new uqd0("feed_search_history_" + FeedModule.m1139F().userId(), "");
        this.f14933K = new tpd0("feed_like_tab_success_tips_count_" + FeedModule.m1139F().userId(), 0);
        this.f14936L = new zpd0("show_guide_time_for_thanks_in_interest_people" + FeedModule.m1139F().userId(), 0L);
        this.f14938M = new zpd0("last_show_poi_seek_guide_dialog_time_" + FeedModule.m1139F().userId(), 0L);
        this.f14940N = new zpd0("last_show_poi_share_guide_dialog_time_" + FeedModule.m1139F().userId(), 0L);
        this.f14942O = new zpd0("last_show_feed_activity_tips_time_" + FeedModule.m1139F().userId(), 0L);
        this.f14944P = new zpd0("last_show_topic_activity_tips_time_" + FeedModule.m1139F().userId(), 0L);
        this.f14946Q = new tpd0("feed_topic_activity_tips_count_" + FeedModule.m1139F().userId(), 0);
    }

    /* JADX INFO: renamed from: B1 */
    public static /* synthetic */ c m16104B1(w9j w9jVar, Moment moment) {
        return (c) w9jVar.call(moment);
    }

    /* JADX INFO: renamed from: B2 */
    public static /* synthetic */ c m16105B2(w9j w9jVar, Moment moment) {
        return (c) w9jVar.call(moment);
    }

    /* JADX INFO: renamed from: D3 */
    public static /* synthetic */ void m16118D3(Moment moment) {
        moment.localCreatedSession = ((Integer) App.i.get()).intValue();
        FeedModule.f321i.f6464c.insert(moment);
    }

    /* JADX INFO: renamed from: D4 */
    public static /* synthetic */ int m16119D4(TopicMoment topicMoment, TopicMoment topicMoment2) {
        double d = topicMoment.createdTime - topicMoment2.createdTime;
        if (d > 0.0d) {
            return -1;
        }
        return d < 0.0d ? 1 : 0;
    }

    /* JADX INFO: renamed from: Db */
    private boolean m16121Db(String str) {
        return FeedModule.m1139F().signedIn_() && TextUtils.equals(str, FeedModule.m1139F().userId());
    }

    /* JADX INFO: renamed from: G3 */
    public static /* synthetic */ stc0 m16137G3(boolean z) {
        stc0.a aVarAuth = omg.f11509G.auth();
        StringBuilder sb = new StringBuilder();
        sb.append(omg.m12703k("/followConfigs"));
        sb.append(z ? "?with=defaultTab" : "");
        return aVarAuth.q(sb.toString()).f().b();
    }

    /* JADX INFO: renamed from: J0 */
    public static /* synthetic */ Envelope m16152J0(final Moment moment, Envelope envelope) {
        if (((DbObject) moment)._id != 0) {
            f8c.m10082o().m10085B(new d30() { // from class: l.rda
                public final void call() {
                    FeedModule.f321i.f6464c.delete(((DbObject) moment)._id);
                }
            });
        }
        return envelope;
    }

    /* JADX INFO: renamed from: J1 */
    public static /* synthetic */ stc0 m16153J1(String str, String str2, String str3, boolean z, JSONObject jSONObject) {
        stc0.a aVarQ = omg.f11509G.auth().q(omg.m12662F(str, str2, str3, z));
        return (z ? aVarQ.m(utc0.create(Network.JSON, jSONObject.toString())) : aVarQ.d()).b();
    }

    /* JADX INFO: renamed from: N4 */
    public static /* synthetic */ void m16180N4(roj0 roj0Var) {
    }

    /* JADX INFO: renamed from: O2 */
    public static /* synthetic */ c m16184O2(w9j w9jVar, MomentMessage momentMessage) {
        return (c) w9jVar.call(momentMessage);
    }

    /* JADX INFO: renamed from: T3 */
    public static /* synthetic */ void m16215T3(Throwable th) {
        if (th == f14909N1) {
            return;
        }
        yij0.D(th);
    }

    /* JADX INFO: renamed from: U1 */
    public static /* synthetic */ void m16219U1(Moment moment) {
        moment.localCreatedSession = ((Integer) App.i.get()).intValue();
        FeedModule.f321i.f6464c.insert(moment);
    }

    /* JADX INFO: renamed from: X0 */
    public static /* synthetic */ c m16236X0(w9j w9jVar, MomentMessage momentMessage) {
        return (c) w9jVar.call(momentMessage);
    }

    /* JADX INFO: renamed from: X5 */
    public static /* synthetic */ stc0 m16241X5(String str, String str2, String str3, boolean z) {
        stc0.a aVarQ = omg.f11509G.auth().q(omg.m12708m0(str, str2, str3));
        return (z ? aVarQ.m(utc0.create(Network.JSON, "")) : aVarQ.d()).b();
    }

    /* JADX INFO: renamed from: Y2 */
    public static /* synthetic */ int m16244Y2(MomentMessage momentMessage, MomentMessage momentMessage2) {
        return (int) (momentMessage.createdTime - momentMessage2.createdTime);
    }

    /* JADX INFO: renamed from: a2 */
    public static /* synthetic */ void m16255a2(Throwable th) {
    }

    /* JADX INFO: renamed from: c5 */
    public static /* synthetic */ void m16270c5(HashMap map, HashMap map2, OnVoiceCall onVoiceCall) {
        if (NullChecker.a(map.get(onVoiceCall.user.f705id))) {
            String str = onVoiceCall.user.f705id;
            map2.put(str, (LiveUserMask) map.get(str));
        }
    }

    /* JADX INFO: renamed from: c6 */
    public static /* synthetic */ Envelope m16271c6(an00 an00Var, String str, Envelope envelope) {
        if (NullChecker.a(an00Var)) {
            an00Var.mo8582d(str, envelope);
        }
        return envelope;
    }

    /* JADX INFO: renamed from: d1 */
    public static /* synthetic */ stc0 m16272d1(String str, String str2, String str3, String str4, String str5) {
        stc0.a aVarAuth = omg.f11509G.auth();
        if (!TextUtils.isEmpty(str)) {
            str5 = omg.m12718s(str2, str3, str4, str);
        }
        return aVarAuth.q(str5).f().b();
    }

    /* JADX INFO: renamed from: e1 */
    public static /* synthetic */ c m16278e1(Envelope envelope) {
        return (envelope == null || vwb.J(((FeedData) envelope.getModuleData(FeedData.class)).messages)) ? c.error(new Throwable("Envelope return onNext is null")) : c.just(envelope);
    }

    /* JADX INFO: renamed from: e4 */
    public static /* synthetic */ c m16281e4(w9j w9jVar, Moment moment) {
        return (c) w9jVar.call(moment);
    }

    /* JADX INFO: renamed from: f1 */
    public static /* synthetic */ Envelope m16284f1(Envelope envelope) {
        FriendsFeedViewPagerFrag.f2958J0 = true;
        ijb0.m10920g();
        vqg.m15488L0();
        return envelope;
    }

    /* JADX INFO: renamed from: f4 */
    public static /* synthetic */ stc0 m16287f4(String str, String str2) {
        String str3;
        stc0.a aVarAuth = omg.f11509G.auth();
        StringBuilder sb = new StringBuilder("/popWindows?page_id=");
        sb.append(str);
        if (TextUtils.isEmpty(str2)) {
            str3 = "";
        } else {
            str3 = "&scene=" + str2;
        }
        sb.append(str3);
        return aVarAuth.q(omg.m12720t(sb.toString())).f().b();
    }

    /* JADX INFO: renamed from: g1 */
    public static /* synthetic */ stc0 m16290g1(String str, String str2, String str3, boolean z) {
        stc0.a aVarQ = omg.f11509G.auth().q(omg.m12661E(str, str2, str3));
        return (z ? aVarQ.m(utc0.create(Network.JSON, "")) : aVarQ.d()).b();
    }

    /* JADX INFO: renamed from: h3 */
    public static /* synthetic */ stc0 m16298h3(String str, String str2, User user, String str3, String str4, Followship followship) {
        stc0.a aVarQ = omg.f11509G.auth().q(!TextUtils.isEmpty(str) ? omg.m12681Y(str2, ((DbObject) user).id, str, str3, str4) : omg.m12679W(str2, ((DbObject) user).id, str4));
        aVarQ.m(utc0.create(Network.JSON, followship.toJson()));
        return aVarQ.b();
    }

    /* JADX INFO: renamed from: h4 */
    public static /* synthetic */ List m16299h4(Moment moment) {
        if (NullChecker.a(moment)) {
            return moment.media;
        }
        return null;
    }

    /* JADX INFO: renamed from: i2 */
    public static /* synthetic */ Envelope m16303i2(an00 an00Var, String str, Envelope envelope) {
        if (NullChecker.a(an00Var)) {
            an00Var.mo8581b(str, envelope);
        }
        return envelope;
    }

    /* JADX INFO: renamed from: j2 */
    public static /* synthetic */ stc0 m16309j2(String str, String str2, String str3, String str4, String str5) {
        stc0.a aVarAuth = omg.f11509G.auth();
        if (!TextUtils.isEmpty(str)) {
            str5 = omg.m12716r(str2, str3, str4, str);
        }
        return aVarAuth.q(str5).f().b();
    }

    /* JADX INFO: renamed from: k6 */
    public static /* synthetic */ stc0 m16319k6(String str, User user, Followship followship) {
        stc0.a aVarQ = omg.f11509G.auth().q(omg.m12682Z(str, ((DbObject) user).id));
        aVarQ.m(utc0.create(Network.JSON, followship.toJson()));
        return aVarQ.b();
    }

    /* JADX INFO: renamed from: l3 */
    public static /* synthetic */ MomentMessage m16322l3(MomentMessage momentMessage, String str) {
        momentMessage.owner = FeedModule.m1139F().userId();
        momentMessage.createdTime = omg.m12717r0() + 10000.0d;
        if (TextUtils.isEmpty(momentMessage.api_only_otherUser)) {
            momentMessage.cid = str;
        } else {
            momentMessage.cid = momentMessage.api_only_otherUser;
        }
        tpd0 tpd0Var = App.i;
        ((CopyObject) momentMessage).id = DbObject.GENERATE_UNIQUE_FAKE_ID(((Integer) tpd0Var.get()).intValue());
        if (momentMessage.value == null) {
            momentMessage.value = "";
        }
        momentMessage.localCreatedSession = ((Integer) tpd0Var.get()).intValue();
        return momentMessage;
    }

    /* JADX INFO: renamed from: p4 */
    public static /* synthetic */ void m16347p4(String str, long j, j760 j760Var) {
        String str2;
        if ("following/moments/next".equals(str)) {
            str2 = "follow";
        } else if ("nearby/next".equals(str)) {
            str2 = "nearby";
        } else {
            str2 = "like/next".equals(str) ? "like" : "";
        }
        TrackMediaUploadUtil.b0(str2, SystemClock.elapsedRealtime() - j);
    }

    /* JADX INFO: renamed from: q2 */
    public static /* synthetic */ Envelope m16351q2(final Moment moment, Envelope envelope) {
        if (((DbObject) moment)._id != 0) {
            f8c.m10082o().m10085B(new d30() { // from class: l.oaa
                public final void call() {
                    FeedModule.f321i.f6464c.delete(((DbObject) moment)._id);
                }
            });
        }
        return envelope;
    }

    /* JADX INFO: renamed from: t1 */
    public static /* synthetic */ void m16369t1(Throwable th) {
        if (oe40.m12547L(th)) {
            yij0.D(th);
        }
    }

    /* JADX INFO: renamed from: u1 */
    public static /* synthetic */ roj0 m16376u1(final Moment moment) {
        f8c.m10082o().m10085B(new d30() { // from class: l.x9a
            public final void call() {
                FeedModule.f321i.f6464c.updateBy_id(moment);
            }
        });
        return roj0.a;
    }

    /* JADX INFO: renamed from: u6 */
    public static /* synthetic */ List m16381u6(Envelope envelope) {
        return ((FeedData) envelope.getModuleData(FeedData.class)).liveLabels == null ? new ArrayList() : ((FeedData) envelope.getModuleData(FeedData.class)).liveLabels;
    }

    /* JADX INFO: renamed from: x0 */
    public static /* synthetic */ Envelope m16396x0(Envelope envelope) {
        return envelope;
    }

    /* JADX INFO: renamed from: x5 */
    public static /* synthetic */ roj0 m16401x5(Envelope envelope) {
        ijb0.m10919f();
        return roj0.a;
    }

    /* JADX INFO: renamed from: y5 */
    public static /* synthetic */ Envelope m16407y5(Envelope envelope) {
        return envelope;
    }

    /* JADX INFO: renamed from: z1 */
    public static /* synthetic */ Envelope m16409z1(Envelope envelope) {
        return envelope;
    }

    /* JADX INFO: renamed from: z2 */
    public static /* synthetic */ c m16410z2(final String str, final String str2, final MomentMessage momentMessage) {
        new MomentMessage().recalled = Boolean.TRUE;
        return new la20(new v9j() { // from class: l.u8a
            public final Object call() {
                return omg.f11509G.auth().q(omg.m12700i0(str, str2, ((CopyObject) momentMessage).id)).d().b();
            }
        }, 0).compose(omg.m12710n0()).map(new w9j() { // from class: l.v8a
            public final Object call(Object obj) {
                return roj0.a;
            }
        });
    }

    /* JADX INFO: renamed from: A6, reason: merged with bridge method [inline-methods] */
    public void m16449Ea(Moment moment) {
        if (moment == null) {
            return;
        }
        this.f14982i0.put(((DbObject) moment).id, moment);
        if (((DbObject) moment).id.startsWith("fake_id_")) {
            this.f14953T0.put(((DbObject) moment).id, moment);
        }
    }

    /* JADX INFO: renamed from: A7 */
    public c<Envelope> m16415A7(final String str) {
        final String strM12703k;
        if (TextUtils.isEmpty(str)) {
            strM12703k = omg.m12703k("/states?with=users&limit=20");
        } else {
            strM12703k = omg.m12703k("/states?with=users&limit=20&" + str);
        }
        return scheduled("getFriendState", 0, new v9j() { // from class: l.vea
            public final Object call() {
                return this.f14154a.m16636f9(strM12703k, str);
            }
        }, true);
    }

    /* JADX INFO: renamed from: A8 */
    public final /* synthetic */ c m16416A8(final String str) {
        return ia20.a(new v9j() { // from class: l.dca
            public final Object call() {
                return omg.f11509G.auth().q(omg.m12701j()).l(utc0.create(Network.JSON, str)).b();
            }
        }).map(new w9j() { // from class: l.eca
            public final Object call(Object obj) {
                return this.f7328a.m16778z8((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: A9 */
    public final /* synthetic */ BubbleInfo m16417A9(String str, Envelope envelope) {
        m16731sd(envelope);
        List<BubbleInfo> list = ((FeedData) envelope.data.getModuleData(FeedData.class)).states;
        if (list.size() <= 0 || !TextUtils.equals(list.get(0).owner.f264id, str)) {
            return null;
        }
        return list.get(0);
    }

    /* JADX INFO: renamed from: Aa */
    public final /* synthetic */ Boolean m16418Aa(String str, Moment moment) {
        return Boolean.valueOf(m16121Db(str));
    }

    /* JADX INFO: renamed from: Ab */
    public final /* synthetic */ c m16419Ab(String str, String str2, final String str3) {
        final String strM12703k = omg.m12703k("/users/" + str + "/moments/" + str2);
        return new la20(new v9j() { // from class: l.uea
            public final Object call() {
                return omg.f11509G.auth().k(utc0.create(Network.JSON, "{\"userSetVisibility\": \"" + str3 + "\"}")).q(strM12703k).b();
            }
        }).compose(omg.m12710n0()).map(new w9j() { // from class: l.wea
            public final Object call(Object obj) {
                return this.f14515a.m16781zb((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: Ac */
    public c<j760<Links, List<Moment>>> m16420Ac(String str, an00 an00Var) {
        return m16604ac(omg.m12692e0(str, "limit=20"), "poi_location_feeds_pre", false, FeedModule.m1139F().userId(), an00Var);
    }

    /* JADX INFO: renamed from: Ad */
    public void m16421Ad(User user) {
        if (user == null) {
            return;
        }
        User user2 = this.f14910A0.get(((DbObject) user).id);
        if (user2 == null) {
            this.f14910A0.put(((DbObject) user).id, user);
        } else {
            if (user2.equals(user)) {
                return;
            }
            this.f14910A0.put(((DbObject) user).id, user);
            this.f14914C0.onNext(this.f14910A0);
        }
    }

    /* JADX INFO: renamed from: B6 */
    public c<List<Group>> m16422B6(final String str, String str2) {
        return scheduled(str2, 0, new v9j() { // from class: l.uga
            public final Object call() {
                return this.f13831a.m16698o8(str);
            }
        });
    }

    /* JADX INFO: renamed from: B7 */
    public c<Envelope> m16423B7(String str) {
        final String strM12703k = omg.m12703k("/groups/" + str);
        return scheduled("getGroupDetailByGroupId" + str, -1, new v9j() { // from class: l.hga
            public final Object call() {
                return this.f8713a.m16650h9(strM12703k);
            }
        });
    }

    /* JADX INFO: renamed from: B8 */
    public final /* synthetic */ void m16424B8(RawFeed rawFeed) {
        if (rawFeed.type.equals("live")) {
            this.f14989l1.remove(rawFeed.f704id);
        } else if (rawFeed.type.equals("voiceLive")) {
            this.f14997p1.remove(rawFeed.f704id);
        } else if (rawFeed.type.equals("liveCircleMomentBanner")) {
            this.f15001r1.remove(rawFeed.f704id);
        }
    }

    /* JADX INFO: renamed from: B9 */
    public final /* synthetic */ c m16425B9(final String str, final String str2) {
        return ia20.a(new v9j() { // from class: l.v7a
            public final Object call() {
                return omg.f11509G.auth().q(str).f().b();
            }
        }).map(new w9j() { // from class: l.w7a
            public final Object call(Object obj) {
                return this.f14436a.m16417A9(str2, (Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: Ba */
    public final /* synthetic */ Boolean m16426Ba(String str, Moment moment) {
        return Boolean.valueOf(m16121Db(str));
    }

    /* JADX INFO: renamed from: Bb */
    public final /* synthetic */ j760 m16427Bb(Envelope envelope) {
        m16731sd(envelope);
        ijb0.m10908S(envelope);
        return new j760(envelope.pagination.links, ((CommonData) envelope.getModuleData(CommonData.class)).users);
    }

    /* JADX INFO: renamed from: Bc */
    public c<roj0> m16428Bc(final Moment moment, final boolean z, final boolean z2) {
        final String strUserId = FeedModule.m1139F().userId();
        m16783zd(z, 0, moment);
        MomentSettings momentSettings = new MomentSettings();
        momentSettings.visibility = MomentVisibilityStatus.get("everyone");
        momentSettings.muted = false;
        moment.settings = momentSettings;
        if (TEnum.equals(moment.allowForward, "unknown_")) {
            moment.allowForward = null;
        }
        v9j v9jVar = new v9j() { // from class: l.d7a
            public final Object call() {
                return this.f6859a.m16721ra(moment, z);
            }
        };
        final w9j w9jVar = new w9j() { // from class: l.f7a
            public final Object call(Object obj) {
                return this.f8011a.m16749va(strUserId, z, moment, (Moment) obj);
            }
        };
        final e30 e30Var = new e30() { // from class: l.g7a
            public final void call(Object obj) {
                this.f8375a.m16756wa(strUserId, z, moment, (Throwable) obj);
            }
        };
        final w9j w9jVar2 = new w9j() { // from class: l.h7a
            public final Object call(Object obj) {
                return this.f8608a.m16780za(z2, moment, z, e30Var, (Moment) obj);
            }
        };
        return now(((c) v9jVar.call()).compose(mkd0.Q()).filter(new w9j() { // from class: l.i7a
            public final Object call(Object obj) {
                return this.f8918a.m16418Aa(strUserId, (Moment) obj);
            }
        }).flatMap(new w9j() { // from class: l.j7a
            public final Object call(Object obj) {
                return xia.m16281e4(w9jVar, (Moment) obj);
            }
        }).filter(new w9j() { // from class: l.k7a
            public final Object call(Object obj) {
                return this.f9628a.m16426Ba(strUserId, (Moment) obj);
            }
        }).compose(TrackMediaUploadUtil.f0("moment", moment.media, new w9j() { // from class: l.l7a
            public final Object call(Object obj) {
                return xia.m16299h4((Moment) obj);
            }
        })).doOnError(e30Var).filter(new w9j() { // from class: l.m7a
            public final Object call(Object obj) {
                return this.f10248a.m16434Ca(strUserId, (Moment) obj);
            }
        }).flatMap(new w9j() { // from class: l.n7a
            public final Object call(Object obj) {
                return xia.m16105B2(w9jVar2, (Moment) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: Bd */
    public void m16429Bd(String str) {
        User userM16628e8 = m16628e8(str);
        if (NullChecker.a(userM16628e8.localFollowship)) {
            if (TEnum.equals(userM16628e8.localFollowship.state, "matched") || TEnum.equals(userM16628e8.localFollowship.state, FollowshipStatus.following)) {
                boolean zEquals = TEnum.equals(userM16628e8.localFollowship.state, "matched");
                Followship followship = userM16628e8.localFollowship;
                if (zEquals) {
                    followship.state = FollowshipStatus.get(FollowshipStatus.followed);
                } else if (TEnum.equals(followship.state, FollowshipStatus.following)) {
                    userM16628e8.localFollowship.state = FollowshipStatus.get("default");
                }
                this.f14910A0.put(((DbObject) userM16628e8).id, userM16628e8);
                this.f14914C0.onNext(this.f14910A0);
                this.f14947Q0.onNext(new j760(userM16628e8, Boolean.FALSE));
            }
        }
    }

    /* JADX INFO: renamed from: C6 */
    public Moment m16430C6(Live live) {
        Moment momentNew_ = Moment.new_();
        ((DbObject) momentNew_).id = live.f228id;
        momentNew_.isLive = true;
        momentNew_.live = live;
        LiveExtraInFeed fromLive = LiveExtraInFeed.getFromLive(live);
        if (fromLive == null || !fromLive.isMultiCallType() || TextUtils.isEmpty(fromLive.momentOwner.f264id)) {
            momentNew_.owner = live.anchor.f264id;
            return momentNew_;
        }
        momentNew_.owner = fromLive.momentOwner.f264id;
        return momentNew_;
    }

    /* JADX INFO: renamed from: C7 */
    public c<Envelope> m16431C7(String str, int i, String str2) {
        StringBuilder sb = new StringBuilder(omg.m12703k("/groups/" + str + "/users?search=recommend&with=users,followships,relationships"));
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
            public final Object call() {
                return ia20.a(new v9j() { // from class: l.jca
                    public final Object call() {
                        return omg.f11509G.auth().q(str).f().b();
                    }
                }).map(new w9j() { // from class: l.kca
                    public final Object call(Object obj) {
                        return xia.m16409z1((Envelope) obj);
                    }
                });
            }
        }, true);
    }

    /* JADX INFO: renamed from: C8 */
    public final /* synthetic */ Boolean m16432C8(RawFeed rawFeed) {
        return Boolean.valueOf((rawFeed.type.equals("live") && this.f14989l1.get(rawFeed.f704id) != null) || (rawFeed.type.equals("voiceLive") && this.f14997p1.get(rawFeed.f704id) != null));
    }

    /* JADX INFO: renamed from: C9 */
    public final /* synthetic */ j760 m16433C9(Envelope envelope) {
        m16731sd(envelope);
        ijb0.m10908S(envelope);
        ArrayList arrayListF0 = vwb.f0(new ViewersBox[0]);
        MomentViewerBox momentViewerBox = ((FeedData) envelope.getModuleData(FeedData.class)).momentViewer;
        if (momentViewerBox != null && !vwb.J(momentViewerBox.viewers)) {
            arrayListF0.addAll(momentViewerBox.viewers);
        }
        return new j760(envelope.pagination.links, arrayListF0);
    }

    /* JADX INFO: renamed from: Ca */
    public final /* synthetic */ Boolean m16434Ca(String str, Moment moment) {
        return Boolean.valueOf(m16121Db(str));
    }

    /* JADX INFO: renamed from: Cb */
    public final /* synthetic */ c m16435Cb(final String str) {
        return new la20(new v9j() { // from class: l.bha
            public final Object call() {
                return omg.f11509G.auth().q(str).f().b();
            }
        }, omg.f11506D).compose(omg.m12710n0()).map(new w9j() { // from class: l.cha
            public final Object call(Object obj) {
                return this.f6648a.m16427Bb((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: Cc */
    public c<roj0> m16436Cc(final Moment moment) {
        final String strUserId = FeedModule.m1139F().userId();
        MomentSettings momentSettings = new MomentSettings();
        momentSettings.visibility = MomentVisibilityStatus.get("everyone");
        momentSettings.muted = false;
        moment.settings = momentSettings;
        if (TEnum.equals(moment.allowForward, "unknown_")) {
            moment.allowForward = null;
        }
        v9j v9jVar = new v9j() { // from class: l.lfa
            public final Object call() {
                return this.f10020a.m16463Ga(moment);
            }
        };
        final e30 e30Var = new e30() { // from class: l.mfa
            public final void call(Object obj) {
                this.f10453a.m16470Ha(strUserId, moment, (Throwable) obj);
            }
        };
        final w9j w9jVar = new w9j() { // from class: l.nfa
            public final Object call(Object obj) {
                return this.f10766a.m16491Ka(moment, e30Var, (Moment) obj);
            }
        };
        return now(((c) v9jVar.call()).compose(mkd0.Q()).filter(new w9j() { // from class: l.ofa
            public final Object call(Object obj) {
                return this.f11464a.m16498La(strUserId, (Moment) obj);
            }
        }).doOnError(e30Var).filter(new w9j() { // from class: l.pfa
            public final Object call(Object obj) {
                return this.f11824a.m16505Ma(strUserId, (Moment) obj);
            }
        }).flatMap(new w9j() { // from class: l.qfa
            public final Object call(Object obj) {
                return xia.m16104B1(w9jVar, (Moment) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: Cd */
    public c<j760<Links, List<User>>> m16437Cd(final String str, String str2) {
        return scheduled(str2, 0, new v9j() { // from class: l.rga
            public final Object call() {
                return this.f12644a.m16435Cb(str);
            }
        });
    }

    /* JADX INFO: renamed from: D6 */
    public Moment m16438D6(LiveCircleBanner liveCircleBanner) {
        Moment momentNew_ = Moment.new_();
        ((DbObject) momentNew_).id = liveCircleBanner.f685id;
        momentNew_.liveCircleBanner = liveCircleBanner;
        return momentNew_;
    }

    /* JADX INFO: renamed from: D7 */
    public c<xaj0<List<Group>, List<User>, Links>> m16439D7(String str, int i, String str2) {
        return m16431C7(str, i, str2).map(new w9j() { // from class: l.sia
            public final Object call(Object obj) {
                return this.f12964a.m16657i9((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: D8 */
    public final /* synthetic */ void m16440D8(Map map, List list, Map map2, Map map3, final HashMap map4, Envelope envelope, RawFeed rawFeed) {
        LiveCircleBanner liveCircleBanner;
        if ("moment".equals(rawFeed.type) && NullChecker.a(map.get(rawFeed.f704id))) {
            Moment moment = (Moment) map.get(rawFeed.f704id);
            double d = rawFeed.recommendTime;
            if (d != 0.0d) {
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
            if (vqg.m15502Z(moment) && !map.containsKey(moment.thirdShareSource.sourceId)) {
                m16724rd(moment.thirdShareSource.sourceId);
            }
            if (this.f14999q1.get(((DbObject) moment).id) != null) {
                moment.liveCircleExtInfo = this.f14999q1.get(((DbObject) moment).id);
            }
            list.add(moment);
            return;
        }
        if ("liveRecommendCard".equals(rawFeed.type)) {
            LiveRecommendCard liveRecommendCard = (LiveRecommendCard) map2.get(rawFeed.f704id);
            if (NullChecker.a(liveRecommendCard)) {
                list.add(m16445E6(liveRecommendCard));
                return;
            }
            return;
        }
        if ("live".equals(rawFeed.type)) {
            Live live = this.f14989l1.get(rawFeed.f704id);
            Moment momentM16430C6 = m16430C6(live);
            if (NullChecker.a(map3.get(live.room.f264id))) {
                momentM16430C6.value = ((Room) map3.get(live.room.f264id)).title;
                momentM16430C6.liveRoom = (Room) map3.get(live.room.f264id);
            }
            list.add(momentM16430C6);
            return;
        }
        if (!"voiceLive".equals(rawFeed.type)) {
            if (!"liveCircleMomentBanner".equals(rawFeed.type) || ((FeedData) envelope.getModuleData(FeedData.class)).liveGroupCircleMomentBanners.size() <= 0 || (liveCircleBanner = this.f15001r1.get(rawFeed.f704id)) == null) {
                return;
            }
            list.add(m16438D6(liveCircleBanner));
            return;
        }
        VoiceLiveMomentFeed voiceLiveMomentFeed = this.f14997p1.get(rawFeed.f704id);
        if (NullChecker.a(voiceLiveMomentFeed)) {
            VoiceLive voiceLive = this.f14991m1.get(voiceLiveMomentFeed.liveId);
            final HashMap map5 = new HashMap();
            vwb.z(voiceLive.callInfo.onVoiceCalls, new e30() { // from class: l.xca
                public final void call(Object obj) {
                    xia.m16270c5(map4, map5, (OnVoiceCall) obj);
                }
            });
            voiceLive.masksMap = map5;
            VoiceRoomInfo voiceRoomInfo = this.f14993n1.get(voiceLive.room.f264id);
            if (NullChecker.a(voiceRoomInfo)) {
                voiceLive.voiceRoomInfo = voiceRoomInfo;
            }
            voiceLive.voiceLiveGame = this.f14995o1.get(voiceLive.f711id);
            voiceLiveMomentFeed.voiceLive = voiceLive;
            list.add(m16452F6(voiceLiveMomentFeed));
        }
    }

    /* JADX INFO: renamed from: D9 */
    public final /* synthetic */ c m16441D9(String str, String str2, String str3) {
        final String strM12703k;
        if (TextUtils.isEmpty(str)) {
            strM12703k = omg.m12703k("/users/" + str2 + "/moments/" + str3 + "/viewers?with=users&limit=20");
        } else {
            strM12703k = omg.m12703k("/users/" + str2 + "/moments/" + str3 + "/viewers?with=users&limit=20&" + str);
        }
        return new la20(new v9j() { // from class: l.xea
            public final Object call() {
                return omg.f11509G.auth().q(strM12703k).f().b();
            }
        }).compose(omg.m12710n0()).map(new w9j() { // from class: l.yea
            public final Object call(Object obj) {
                return this.f15408a.m16433C9((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: Da */
    public final /* synthetic */ void m16442Da(Moment moment) {
        m16449Ea(moment);
        this.f14998q0.onNext(moment);
    }

    /* JADX INFO: renamed from: Dc */
    public c<roj0> m16443Dc(final String str, final String str2, final String str3, final int i) {
        final v9j v9jVar = new v9j() { // from class: l.k9a
            public final Object call() {
                return qib0.H.auth().q(omg.m12698h0(str, str2, str3)).m(utc0.create(Network.JSON, "")).b();
            }
        };
        return scheduled("postVote", -1, new v9j() { // from class: l.l9a
            public final Object call() {
                return this.f9959a.m16519Oa(v9jVar, str2, i);
            }
        }, false);
    }

    /* JADX INFO: renamed from: Dd */
    public c<Envelope> m16444Dd(boolean z) {
        String str = z ? "show" : "reject";
        final String strM12703k = omg.m12703k("/voice-nearby-feedback?type=".concat(str));
        return scheduled("VoiceFeedBack".concat(str), -1, new v9j() { // from class: l.xba
            public final Object call() {
                return ia20.a(new v9j() { // from class: l.dea
                    public final Object call() {
                        return omg.f11509G.auth().q(str).l(utc0.create(Network.JSON, "")).b();
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: E6 */
    public Moment m16445E6(LiveRecommendCard liveRecommendCard) {
        Moment momentNew_ = Moment.new_();
        ((DbObject) momentNew_).id = liveRecommendCard.f689id;
        momentNew_.isLive = true;
        momentNew_.liveRecommendCard = liveRecommendCard;
        return momentNew_;
    }

    /* JADX INFO: renamed from: E7 */
    public c<roj0> m16446E7() {
        return scheduled("get_guide_state_post_config", 0, new v9j() { // from class: l.x7a
            public final Object call() {
                return this.f14789a.m16671k9();
            }
        });
    }

    /* JADX INFO: renamed from: E8 */
    public final /* synthetic */ TopicMoment m16447E8(Envelope envelope) {
        m16731sd(envelope);
        FeedData feedData = (FeedData) envelope.getModuleData(FeedData.class);
        if (feedData == null || vwb.J(feedData.momentTopics)) {
            return null;
        }
        return feedData.momentTopics.get(0);
    }

    /* JADX INFO: renamed from: E9 */
    public final /* synthetic */ roj0 m16448E9(boolean z, Envelope envelope) {
        FeedModule.f320h.followConfigSub.onNext(((FeedData) envelope.getModuleData(FeedData.class)).extra);
        FeedModule.f320h.followConfig = ((FeedData) envelope.getModuleData(FeedData.class)).extra;
        sti.f13075a.put(Boolean.valueOf(((FeedData) envelope.getModuleData(FeedData.class)).extra.bindPhone));
        vqg.m15474E0(Boolean.valueOf(((FeedData) envelope.getModuleData(FeedData.class)).extra.momentMedia.audio));
        this.f14962Y.put(Boolean.valueOf(((FeedData) envelope.getModuleData(FeedData.class)).extra.liveShowFollowButton));
        sti.f13076b.put(((FeedData) envelope.getModuleData(FeedData.class)).extra.feedDefaultPage);
        if (u2h.m14716a() || nkg.m12275y()) {
            sti.f13077c.put(Boolean.valueOf(((FeedData) envelope.getModuleData(FeedData.class)).extra.feedShowAccostButton));
        } else {
            sti.f13077c.put(Boolean.TRUE);
        }
        sti.f13078d.put(((FeedData) envelope.getModuleData(FeedData.class)).extra.topicH5RedirectURL);
        sti.f13081g.put(JSON.toJSONString(((FeedData) envelope.getModuleData(FeedData.class)).extra.stateEmotion));
        this.f14964Z.put(Boolean.valueOf(((FeedData) envelope.getModuleData(FeedData.class)).extra.showPopWindow));
        this.f14968b0.put(Boolean.valueOf(((FeedData) envelope.getModuleData(FeedData.class)).extra.defaultSyncMoment));
        sti.f13079e.put(Boolean.valueOf(((FeedData) envelope.getModuleData(FeedData.class)).extra.showAudit.moment));
        sti.f13080f.put(Boolean.valueOf(((FeedData) envelope.getModuleData(FeedData.class)).extra.showAudit.comment));
        sti.f13082h.put(JSON.toJSONString(((FeedData) envelope.getModuleData(FeedData.class)).extra.stateGuide));
        if (z) {
            sti.f13086l.put(((FeedData) envelope.getModuleData(FeedData.class)).extra.defaultTab);
        }
        sti.f13087m.put(Boolean.valueOf(((FeedData) envelope.getModuleData(FeedData.class)).extra.activityShowReadButton));
        jlg.m11182f().m11194n(((FeedData) envelope.getModuleData(FeedData.class)).extra.explorePostBubble);
        sti.f13088n.put(((FeedData) envelope.getModuleData(FeedData.class)).extra.stateWindow.title);
        sti.f13089o.put(((FeedData) envelope.getModuleData(FeedData.class)).extra.stateWindow.subTitle);
        return roj0.a;
    }

    /* JADX INFO: renamed from: Eb */
    public c<roj0> m16450Eb(final String str, final String str2, final String str3, final boolean z) {
        return scheduled("/moments/" + str2 + "/messages/" + str3 + "/likes/me", -1, new v9j() { // from class: l.vba
            public final Object call() {
                return new la20(new v9j() { // from class: l.mda
                    public final Object call() {
                        return xia.m16290g1(str, str, str, z);
                    }
                }).compose(mkd0.C()).map(new w9j() { // from class: l.nda
                    public final Object call(Object obj) {
                        return roj0.a;
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: Ec */
    public c<j760<Links, List<Moment>>> m16451Ec(an00 an00Var) {
        return m16604ac(omg.m12684a0("limit=20&query=preload"), "friends/previous/preload", false, null, an00Var);
    }

    /* JADX INFO: renamed from: F6 */
    public Moment m16452F6(VoiceLiveMomentFeed voiceLiveMomentFeed) {
        Moment momentNew_ = Moment.new_();
        ((DbObject) momentNew_).id = voiceLiveMomentFeed.f712id;
        momentNew_.isVoiceLive = true;
        VoiceLive voiceLive = voiceLiveMomentFeed.voiceLive;
        momentNew_.voiceLive = voiceLive;
        momentNew_.headImage = voiceLiveMomentFeed.image;
        momentNew_.owner = voiceLive.anchor.f264id;
        return momentNew_;
    }

    /* JADX INFO: renamed from: F7 */
    public a<Double> m16453F7() {
        return this.f14981h1;
    }

    /* JADX INFO: renamed from: F8 */
    public final /* synthetic */ c m16454F8(final String str) {
        return new la20(new v9j() { // from class: l.uda
            public final Object call() {
                return omg.f11509G.auth().q(omg.m12703k("/topics")).l(utc0.create(Network.JSON, str)).b();
            }
        }).compose(omg.m12710n0()).map(new w9j() { // from class: l.vda
            public final Object call(Object obj) {
                return this.f14150a.m16447E8((Envelope) obj);
            }
        }).doOnError(new e30() { // from class: l.wda
            public final void call(Object obj) {
                t2h.m14427g((Throwable) obj);
            }
        });
    }

    /* JADX INFO: renamed from: F9 */
    public final /* synthetic */ c m16455F9(final boolean z) {
        return new la20(new v9j() { // from class: l.dga
            public final Object call() {
                return xia.m16137G3(z);
            }
        }).map(new w9j() { // from class: l.ega
            public final Object call(Object obj) {
                return this.f7351a.m16448E9(z, (Envelope) obj);
            }
        }).compose(omg.m12710n0());
    }

    /* JADX INFO: renamed from: Fa */
    public final /* synthetic */ Moment m16456Fa(final Moment moment) throws Exception {
        if (!TextUtils.isEmpty(((DbObject) moment).id)) {
            final Moment momentM19592clone = moment.m19592clone();
            momentM19592clone.localCreatedSession = ((Integer) App.i.get()).intValue();
            f8c.m10082o().m10085B(new d30() { // from class: l.l8a
                public final void call() {
                    FeedModule.f321i.f6464c.updateBy_id(momentM19592clone);
                }
            });
            e51.M(new Runnable() { // from class: l.w8a
                @Override // java.lang.Runnable
                public final void run() {
                    this.f14461a.m16449Ea(momentM19592clone);
                }
            });
            return momentM19592clone;
        }
        moment.createdTime = omg.m12717r0();
        moment.owner = FeedModule.m1139F().userId();
        if (moment.value == null) {
            moment.value = "";
        }
        moment.likes = PartialIdList.new_();
        ((DbObject) moment).id = DbObject.GENERATE_UNIQUE_FAKE_ID(((Integer) App.i.get()).intValue());
        if (TEnum.equals(moment.userSetVisibility, "unknown_")) {
            moment.userSetVisibility = UserSetVisibility.get(el00.m9903k().m9912p(moment));
        }
        moment.media = new ArrayList();
        f8c.m10082o().m10085B(new d30() { // from class: l.p7a
            public final void call() {
                xia.m16219U1(moment);
            }
        });
        e51.M(new Runnable() { // from class: l.a8a
            @Override // java.lang.Runnable
            public final void run() {
                this.f5630a.m16442Da(moment);
            }
        });
        return moment;
    }

    /* JADX INFO: renamed from: Fb */
    public c<Envelope> m16457Fb(String str, String str2, boolean z, String str3) {
        return m16464Gb(str, str2, z, str3, 0);
    }

    /* JADX INFO: renamed from: Fc */
    public c<j760<Links, List<Moment>>> m16458Fc(an00 an00Var) {
        return m16604ac(omg.m12686b0("limit=20", "recommend"), "liked/previous", false, null, an00Var);
    }

    /* JADX INFO: renamed from: G6 */
    public Moment m16459G6(aai aaiVar) {
        Moment momentNew_ = Moment.new_();
        ((DbObject) momentNew_).id = "";
        momentNew_.feedVoiceUserEntryInfo = aaiVar;
        return momentNew_;
    }

    /* JADX INFO: renamed from: G7 */
    public c<j760<FeedLiterature, FeedLiteraturesComment>> m16460G7(String str) {
        final String str2 = "/literature/" + str + "?user_id=" + FeedModule.m1139F().userId();
        return scheduled(str2, 0, new v9j() { // from class: l.saa
            public final Object call() {
                return this.f12855a.m16685m9(str2);
            }
        }, false);
    }

    /* JADX INFO: renamed from: G8 */
    public final /* synthetic */ Notification m16461G8(Moment moment, Notification notification) {
        if (!notification.k() && (!notification.j() || !(notification.e() instanceof ApiExcep.Client.NotFound))) {
            return notification;
        }
        ijb0.m10903N(FeedModule.m1139F().userId(), false);
        this.f14996p0.onNext(moment);
        m16724rd(((DbObject) moment).id);
        return Notification.c(roj0.a);
    }

    /* JADX INFO: renamed from: G9 */
    public final /* synthetic */ Envelope m16462G9(String str, String str2, boolean z, int i, Envelope envelope) {
        if (nkg.m12221S() && NullChecker.a(envelope) && envelope.meta.code == 20101) {
            User userM16628e8 = m16628e8(str);
            if (NullChecker.a(userM16628e8)) {
                Relationship relationshipNew_ = userM16628e8.localRelationship;
                if (relationshipNew_ == null) {
                    relationshipNew_ = Relationship.new_();
                }
                if (userM16628e8.letter() || userM16628e8.likedMe() || TEnum.equals(relationshipNew_.state, "blocked") || ((NullChecker.a(relationshipNew_.relationshipExtensions) && TEnum.equals(relationshipNew_.relationshipExtensions.otherRelationType, RelationshipStatus.LIKED)) || (NullChecker.a(relationshipNew_.relationshipExtensions) && TEnum.equals(relationshipNew_.relationshipExtensions.otherRelationType, "liked")))) {
                    relationshipNew_.state = RelationshipStatus.get("matched");
                    userM16628e8.localRelationship = relationshipNew_;
                    m16421Ad(userM16628e8);
                } else {
                    relationshipNew_.state = RelationshipStatus.get("liked");
                    userM16628e8.localRelationship = relationshipNew_;
                    m16421Ad(userM16628e8);
                    m16493Kc(relationshipNew_, userM16628e8, true, false);
                }
            }
            this.f15017z1.onNext(str2);
        }
        Moment moment = this.f14982i0.get(str2);
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
            partialIdList.ids = vwb.c0(partialIdList.ids, FeedModule.m1139F().userId());
        } else if (!z2 && z) {
            if (i > 0) {
                moment.attitudeId = i;
                moment.attitudes.count++;
            }
            PartialIdList partialIdList2 = moment.likes;
            partialIdList2.count++;
            partialIdList2.ids = vwb.c(partialIdList2.ids, FeedModule.m1139F().userId());
        } else if (z2 && z && i > 0) {
            if (moment.attitudeId <= 0) {
                moment.attitudes.count++;
            }
            moment.attitudeId = i;
        }
        moment.haveLiked = z;
        this.f14982i0.put(str2, moment);
        f14907L1 = vwb.Y(((DbObject) moment).id, 0);
        this.f14988l0.onNext(this.f14982i0);
        if (z) {
            ijb0.m10908S(envelope);
        }
        FeedModule.f320h.m13955A0(moment);
        return envelope;
    }

    /* JADX INFO: renamed from: Ga */
    public final /* synthetic */ c m16463Ga(final Moment moment) {
        return c.fromCallable(new Callable() { // from class: l.rfa
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f12637a.m16456Fa(moment);
            }
        });
    }

    /* JADX INFO: renamed from: Gb */
    public c<Envelope> m16464Gb(final String str, final String str2, final boolean z, final String str3, final int i) {
        final JSONObject jSONObject = new JSONObject();
        if (i > 0) {
            try {
                jSONObject.put("attitudeId", i);
            } catch (JSONException e) {
                CrashHelper.c(e);
            }
        }
        return scheduled("/moments/" + str2 + "/likes/me", -1, new v9j() { // from class: l.lha
            public final Object call() {
                return this.f10034a.m16469H9(str, str2, str3, z, jSONObject, i);
            }
        });
    }

    /* JADX INFO: renamed from: Gc */
    public c<j760<Links, List<Moment>>> m16465Gc(an00 an00Var) {
        return m16604ac(omg.m12690d0("limit=20&query=preload"), "preload/nearby/previous", false, null, an00Var);
    }

    /* JADX INFO: renamed from: H6 */
    public Moment m16466H6(bkn0.a aVar) {
        Moment momentNew_ = Moment.new_();
        ((DbObject) momentNew_).id = "";
        momentNew_.voiceLiveApiInfo = aVar;
        return momentNew_;
    }

    /* JADX INFO: renamed from: H7 */
    public final String m16467H7() {
        return "/live-circle-moments";
    }

    /* JADX INFO: renamed from: H8 */
    public final /* synthetic */ c m16468H8(final Moment moment) {
        return new la20(new v9j() { // from class: l.eia
            public final Object call() {
                return omg.f11509G.auth().q(omg.m12722v(((DbObject) moment).id)).d().b();
            }
        }).materialize().compose(omg.m12710n0()).map(new w9j() { // from class: l.fia
            public final Object call(Object obj) {
                return this.f8109a.m16461G8(moment, (Notification) obj);
            }
        }).dematerialize().take(1);
    }

    /* JADX INFO: renamed from: H9 */
    public final /* synthetic */ c m16469H9(final String str, final String str2, final String str3, final boolean z, final JSONObject jSONObject, final int i) {
        return new la20(new v9j() { // from class: l.faa
            public final Object call() {
                return xia.m16153J1(str, str2, str3, z, jSONObject);
            }
        }).compose(mkd0.C()).map(new w9j() { // from class: l.gaa
            public final Object call(Object obj) {
                return this.f8404a.m16462G9(str, str2, z, i, (Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: Ha */
    public final /* synthetic */ void m16470Ha(String str, Moment moment, final Throwable th) {
        MomentPostFailedExcepion.reportMomentPostFailed(th, true);
        zvf0.B("e_post_moment_error", "post_error_feed_moments", new j760[]{vwb.Y("error", th == null ? "unknow" : th.toString())});
        if (m16121Db(str)) {
            Moment momentM19592clone = this.f14982i0.get(((DbObject) moment).id).m19592clone();
            momentM19592clone.localCreatedSession--;
            m16759wd(momentM19592clone);
            m16449Ea(momentM19592clone);
            e51.M(new Runnable() { // from class: l.vfa
                @Override // java.lang.Runnable
                public final void run() {
                    yij0.D(th);
                }
            });
        }
    }

    /* JADX INFO: renamed from: Hb */
    public c<Envelope> m16471Hb(final String str, final String str2, final boolean z) {
        final String strM12703k = omg.m12703k(String.format("/users/%s/states/%s/likes/me", str2, str));
        return scheduled("likeState", -1, new v9j() { // from class: l.mha
            public final Object call() {
                return this.f10466a.m16490K9(strM12703k, z, str2, str);
            }
        }, true);
    }

    /* JADX INFO: renamed from: Hc */
    public void m16472Hc(User user) {
        if (user.localFollowship == null) {
            user.localFollowship = new Followship();
        }
        if (!TEnum.equals(user.localFollowship.state, "matched")) {
            if (!TEnum.equals(user.localFollowship.state, FollowshipStatus.following)) {
                user.profile.followships.counters.followers++;
            }
            user.localFollowship.state = FollowshipStatus.get("matched");
        }
        hpd0 hpd0Var = PhotoAlbumFeedAct.f3082e;
        if (!((Boolean) hpd0Var.get()).booleanValue() && !m16677l8()) {
            lsi0.w(R$string.f385K2);
            hpd0Var.put(Boolean.TRUE);
        }
        this.f14910A0.put(((DbObject) user).id, user);
        this.f14914C0.onNext(this.f14910A0);
        this.f14947Q0.onNext(new j760(user, Boolean.TRUE));
        ijb0.m10903N(FeedModule.m1139F().userId(), false);
    }

    /* JADX INFO: renamed from: I6 */
    public c<roj0> m16473I6(final String str, final String str2, final String str3) {
        final v9j v9jVar = new v9j() { // from class: l.zba
            public final Object call() {
                return qib0.H.auth().q(omg.m12698h0(str, str2, str3)).d().b();
            }
        };
        return scheduled("cancelVote", -1, new v9j() { // from class: l.aca
            public final Object call() {
                return new la20(v9jVar).compose(mkd0.C()).map(new w9j() { // from class: l.tda
                    public final Object call(Object obj) {
                        return roj0.a;
                    }
                });
            }
        }, false);
    }

    /* JADX INFO: renamed from: I7 */
    public BubbleInfo m16474I7() {
        return (BubbleInfo) ((Map) this.f14983i1.e()).get(((DbObject) FeedModule.m1140H().me_()).id);
    }

    /* JADX INFO: renamed from: I8 */
    public final /* synthetic */ Envelope m16475I8(Envelope envelope) {
        m16731sd(envelope);
        return envelope;
    }

    /* JADX INFO: renamed from: I9 */
    public final /* synthetic */ void m16476I9(String str, String str2, ConversationStatus conversationStatus) {
        if (TEnum.equals(conversationStatus, "default")) {
            FeedModule.m1140H().ci(str, str2, "", true);
            return;
        }
        if (TEnum.equals(conversationStatus, "deleted") || TEnum.equals(conversationStatus, "blocked")) {
            this.f15005t1.onNext(Boolean.TRUE);
            lsi0.j("配对已解除");
        } else {
            this.f15005t1.onNext(Boolean.TRUE);
            lsi0.j("对方账号异常");
        }
    }

    /* JADX INFO: renamed from: Ia */
    public final /* synthetic */ roj0 m16477Ia(Moment moment, Moment moment2, Envelope envelope) {
        Moment moment3 = ((FeedData) envelope.getModuleData(FeedData.class)).moments.get(0);
        this.f14982i0.remove(((DbObject) moment).id);
        if (((DbObject) moment).id.startsWith("fake_id_")) {
            this.f14953T0.remove(((DbObject) moment).id);
        }
        m16731sd(envelope);
        this.f15000r0.onNext(moment2);
        this.f14982i0.put(((DbObject) moment3).id, moment3);
        this.f14998q0.onNext(moment3);
        ijb0.m10903N(FeedModule.m1139F().userId(), false);
        ijb0.m10908S(envelope);
        ((DbObject) moment).id = ((DbObject) moment3).id;
        return roj0.a;
    }

    /* JADX INFO: renamed from: Ib */
    public c<roj0> m16478Ib(final String str, final String str2, final String str3, final boolean z) {
        return scheduled("/topics/" + str2 + "/comments/" + str3 + "/likes/me", -1, new v9j() { // from class: l.xaa
            public final Object call() {
                return new la20(new v9j() { // from class: l.kda
                    public final Object call() {
                        return xia.m16241X5(str, str, str, z);
                    }
                }).compose(mkd0.C()).map(new w9j() { // from class: l.lda
                    public final Object call(Object obj) {
                        return roj0.a;
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: Ic */
    public void m16479Ic(User user, boolean z) {
        m16486Jc(user, z, null);
    }

    /* JADX INFO: renamed from: J6 */
    public synchronized void m16480J6() {
        synchronized (xia.class) {
            if (vwb.J(this.f14920F0)) {
                return;
            }
            ArrayList arrayListF0 = vwb.f0(new String[0]);
            for (int i = 0; i < this.f14920F0.size(); i++) {
                Moment momentM16753w7 = m16753w7(this.f14920F0.get(i));
                if (momentM16753w7 != null && momentM16753w7.momentViewTime != -1 && mqi0.o() - momentM16753w7.momentViewTime >= this.f14922G0 * 1000 && !this.f14916D0.contains(((DbObject) momentM16753w7).id)) {
                    arrayListF0.add(this.f14920F0.get(i));
                }
            }
            if (!vwb.J(arrayListF0)) {
                this.f14920F0.clear();
                m16716qc(arrayListF0);
            }
        }
    }

    /* JADX INFO: renamed from: J7 */
    public c<Envelope> m16481J7() {
        final String strM12703k = omg.m12703k("/users/" + ((DbObject) FeedModule.m1140H().me_()).id + "/states");
        return scheduled("getMineStateObs", 0, new v9j() { // from class: l.gha
            public final Object call() {
                return this.f8451a.m16699o9(strM12703k);
            }
        }, true);
    }

    /* JADX INFO: renamed from: J8 */
    public final /* synthetic */ c m16482J8(final String str) {
        return new la20(new v9j() { // from class: l.haa
            public final Object call() {
                return omg.f11509G.auth().q(omg.m12703k("/activity-users/" + str)).d().b();
            }
        }).compose(omg.m12710n0()).map(new w9j() { // from class: l.iaa
            public final Object call(Object obj) {
                return this.f8972a.m16475I8((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: J9 */
    public final /* synthetic */ Envelope m16483J9(boolean z, final String str, final String str2, Envelope envelope) {
        if (envelope == null) {
            this.f15005t1.onNext(Boolean.TRUE);
            return Envelope.new_();
        }
        m16731sd(envelope);
        if (!z) {
            FeedModule.m1140H().ab(str).first().subscribe(mkd0.G(new e30() { // from class: l.nca
                public final void call(Object obj) {
                    this.f10740a.m16476I9(str, str2, (ConversationStatus) obj);
                }
            }));
        }
        return envelope;
    }

    /* JADX INFO: renamed from: Ja */
    public final /* synthetic */ c m16484Ja(final Moment moment, final Moment moment2, e30 e30Var) {
        return new la20(new v9j() { // from class: l.h9a
            public final Object call() {
                return omg.f11509G.auth().q(omg.m12725y()).l(utc0.create(Network.JSON, moment.toJson())).b();
            }
        }, omg.f11507E).map(new w9j() { // from class: l.s9a
            public final Object call(Object obj) {
                return xia.m16351q2(moment2, (Envelope) obj);
            }
        }).compose(omg.m12710n0()).map(new w9j() { // from class: l.daa
            public final Object call(Object obj) {
                return this.f6877a.m16477Ia(moment2, moment, (Envelope) obj);
            }
        }).doOnError(e30Var);
    }

    /* JADX INFO: renamed from: Jb */
    public c<j760<Links, List<Moment>>> m16485Jb(Links links, an00 an00Var) {
        return m16590Yb(omg.m12686b0(links.next, this.f14923G1), "like/next", an00Var);
    }

    /* JADX INFO: renamed from: Jc */
    public void m16486Jc(final User user, boolean z, @Nullable MatchScData matchScData) {
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
            ijb0.m10898I();
            if (TEnum.equals(user.localFollowship.state, "matched")) {
                hpd0 hpd0Var = PhotoAlbumFeedAct.f3082e;
                if (!((Boolean) hpd0Var.get()).booleanValue() && !m16677l8()) {
                    lsi0.w(R$string.f385K2);
                    hpd0Var.put(Boolean.TRUE);
                }
                if (NullChecker.a(matchScData)) {
                    l3f l3fVar = new l3f();
                    l3fVar.s = MatchScData.MID;
                    l3fVar.d = EventNameEnum.USER_BEHAVIOR_COMPLEMENT;
                    l3fVar.n = matchScData.pageId;
                    zvf0.n(l3fVar, matchScData.toTrackParamMap());
                }
            } else {
                Relationship relationship = user.localRelationship;
                if (relationship == null || !TEnum.equals(relationship.state, "matched")) {
                    e51.y(new Runnable() { // from class: l.oda
                        @Override // java.lang.Runnable
                        public final void run() {
                            ijb0.m10925l(user);
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
        this.f14910A0.put(((DbObject) user).id, user);
        this.f14914C0.onNext(this.f14910A0);
        this.f14947Q0.onNext(new j760(user, Boolean.valueOf(z)));
        ijb0.m10903N(FeedModule.m1139F().userId(), false);
        if (u2h.m14718c()) {
            ijb0.m10903N(((DbObject) user).id, false);
        }
    }

    /* JADX INFO: renamed from: K6 */
    public final List<String> m16487K6(List<String> list) {
        if (vwb.J(list)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            if (NullChecker.a(list.get(i)) && !this.f14916D0.contains(list.get(i))) {
                arrayList.add(list.get(i));
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: K7 */
    public a<Map<String, BubbleInfo>> m16488K7() {
        return this.f14983i1;
    }

    /* JADX INFO: renamed from: K8 */
    public final /* synthetic */ Envelope m16489K8(Envelope envelope) {
        if (envelope == null) {
            this.f15005t1.onNext(Boolean.TRUE);
            return Envelope.new_();
        }
        m16731sd(envelope);
        return envelope;
    }

    /* JADX INFO: renamed from: K9 */
    public final /* synthetic */ c m16490K9(final String str, final boolean z, final String str2, final String str3) {
        return ia20.a(new v9j() { // from class: l.t9a
            public final Object call() {
                return omg.f11509G.auth().q(str).m(utc0.create(Network.JSON, "")).b();
            }
        }).map(new w9j() { // from class: l.u9a
            public final Object call(Object obj) {
                return this.f13598a.m16483J9(z, str2, str3, (Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: Ka */
    public final /* synthetic */ c m16491Ka(final Moment moment, final e30 e30Var, final Moment moment2) {
        return scheduled("postTheMoment", -1, new v9j() { // from class: l.ufa
            public final Object call() {
                return this.f13824a.m16484Ja(moment2, moment, e30Var);
            }
        });
    }

    /* JADX INFO: renamed from: Kb */
    public c<j760<Links, List<Moment>>> m16492Kb(an00 an00Var) {
        return m16604ac(omg.m12686b0(nah.m12132b() ? "limit=10" : "limit=20", this.f14923G1), "liked/previous", false, null, an00Var);
    }

    /* JADX INFO: renamed from: Kc */
    public void m16493Kc(Relationship relationship, User user, boolean z, boolean z2) {
        if (relationship != null && vwb.J(relationship.status)) {
            relationship.status = new ArrayList();
        }
        user.localRelationship = relationship;
        this.f14910A0.put(((DbObject) user).id, user);
        this.f14914C0.onNext(this.f14910A0);
        this.f14951S0.onNext(new j760(user, Boolean.valueOf(z)));
    }

    @Deprecated
    /* JADX INFO: renamed from: L6 */
    public c<roj0> m16494L6(final MomentMessage momentMessage) {
        if (!TEnum.equals(momentMessage.status(), "failed")) {
            return scheduled("commentDelete", -1, new v9j() { // from class: l.ida
                public final Object call() {
                    return this.f8990a.m16712q8(momentMessage);
                }
            });
        }
        this.f14934K0.onNext(momentMessage);
        return c.just(roj0.a);
    }

    /* JADX INFO: renamed from: L7 */
    public MomentVoiceLiveInfos m16495L7(String str) {
        return this.f14980h0.get(str);
    }

    /* JADX INFO: renamed from: L8 */
    public final /* synthetic */ c m16496L8(final String str) {
        return ia20.a(new v9j() { // from class: l.n8a
            public final Object call() {
                return omg.f11509G.auth().q(str).d().b();
            }
        }).map(new w9j() { // from class: l.o8a
            public final Object call(Object obj) {
                return this.f11380a.m16489K8((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: L9 */
    public final /* synthetic */ j760 m16497L9(String str, Envelope envelope) {
        FeedData feedData = (FeedData) envelope.getModuleData(FeedData.class);
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(feedData.messages);
        for (int i = 0; i < arrayList.size(); i++) {
            ((MomentMessage) arrayList.get(i)).moment = str;
        }
        m16738td(envelope, false);
        return new j760(envelope.pagination.links, arrayList);
    }

    /* JADX INFO: renamed from: La */
    public final /* synthetic */ Boolean m16498La(String str, Moment moment) {
        return Boolean.valueOf(m16121Db(str));
    }

    /* JADX INFO: renamed from: Lb */
    public c<j760<Links, List<Moment>>> m16499Lb(Links links) {
        return m16590Yb(omg.m12715q(links.next), m16467H7() + "next", null);
    }

    /* JADX INFO: renamed from: Lc */
    public final void m16500Lc(List<TopicMoment> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList(list);
        Collections.sort(arrayList, new Comparator() { // from class: l.r7a
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return xia.m16119D4((TopicMoment) obj, (TopicMoment) obj2);
            }
        });
        double d = ((TopicMoment) arrayList.get(0)).createdTime;
        if (d > ((Double) this.f14987k1.get()).doubleValue()) {
            this.f14981h1.onNext(Double.valueOf(d));
        }
    }

    /* JADX INFO: renamed from: M6 */
    public c<xaj0<Links, List<MomentMessage>, List<StickerInfo>>> m16501M6(final String str, final String str2, final Links links) {
        return scheduled("moments/" + str2 + "/comments/next", 0, new v9j() { // from class: l.p8a
            public final Object call() {
                return this.f11726a.m16726s8(str, str2, links);
            }
        });
    }

    /* JADX INFO: renamed from: M7 */
    public c<List<LiveMultiCallLiveSchema>> m16502M7(String str) {
        final cll.a aVarP = cll.l(omg.m12703k("/live-schemas")).p();
        if (!TextUtils.isEmpty(str)) {
            aVarP.c("search", str);
        }
        return scheduled("getMultiCallLiveSchema", 0, new v9j() { // from class: l.yba
            public final Object call() {
                return new la20(new v9j() { // from class: l.aea
                    public final Object call() {
                        return omg.f11509G.auth().s(aVar.d()).f().b();
                    }
                }).compose(omg.m12710n0()).map(new w9j() { // from class: l.bea
                    public final Object call(Object obj) {
                        return ((FeedData) ((Envelope) obj).getModuleData(FeedData.class)).liveSchemas;
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: M8 */
    public final /* synthetic */ Envelope m16503M8(Moment moment, Envelope envelope) {
        Moment moment2 = ((FeedData) envelope.getModuleData(FeedData.class)).moments.get(0);
        this.f14982i0.put(((DbObject) moment2).id, moment2);
        ijb0.m10903N(FeedModule.m1139F().userId(), false);
        ijb0.m10908S(envelope);
        ((DbObject) moment).id = ((DbObject) moment2).id;
        if (vqg.m15502Z(moment2)) {
            this.f14994o0.onNext(moment2);
            return envelope;
        }
        this.f14992n0.onNext(moment2);
        return envelope;
    }

    /* JADX INFO: renamed from: M9 */
    public final /* synthetic */ c m16504M9(final String str, final String str2, final String str3, final String str4, final String str5) {
        return new la20(new v9j() { // from class: l.caa
            public final Object call() {
                return xia.m16309j2(str, str2, str3, str4, str5);
            }
        }).compose(mkd0.C()).map(new w9j() { // from class: l.eaa
            public final Object call(Object obj) {
                return this.f7266a.m16497L9(str3, (Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: Ma */
    public final /* synthetic */ Boolean m16505Ma(String str, Moment moment) {
        return Boolean.valueOf(m16121Db(str));
    }

    /* JADX INFO: renamed from: Mb */
    public c<j760<Links, List<Moment>>> m16506Mb(String str) {
        return m16604ac(omg.m12713p(), m16467H7(), true, str, null);
    }

    /* JADX INFO: renamed from: Mc */
    public c<TopicOperations> m16507Mc() {
        return scheduled("publishGuide", 0, new v9j() { // from class: l.sfa
            public final Object call() {
                return this.f12946a.m16533Qa();
            }
        });
    }

    /* JADX INFO: renamed from: N6 */
    public c<MomentMessage> m16508N6(final String str, final MomentMessage momentMessage) {
        momentMessage.messageType = MomentMessageType.get(MomentMessageType.moment_comment);
        v9j v9jVar = new v9j() { // from class: l.fea
            public final Object call() {
                return this.f8075a.m16740u8(momentMessage, str);
            }
        };
        o660 o660VarD = p660.d();
        final String strC = NullChecker.a(o660VarD) ? o660VarD.c() : "";
        final e30 e30Var = new e30() { // from class: l.gea
            public final void call(Object obj) {
                this.f8432a.m16747v8(momentMessage, str, strC, (Throwable) obj);
            }
        };
        final w9j w9jVar = new w9j() { // from class: l.hea
            public final Object call(Object obj) {
                return this.f8680a.m16770y8(str, momentMessage, strC, e30Var, (MomentMessage) obj);
            }
        };
        return now(((c) v9jVar.call()).doOnError(e30Var).flatMap(new w9j() { // from class: l.iea
            public final Object call(Object obj) {
                return xia.m16184O2(w9jVar, (MomentMessage) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: N7 */
    public c<NearbyLocation> m16509N7(String str, String str2) {
        return m16516O7(str, str2, "", "");
    }

    /* JADX INFO: renamed from: N8 */
    public final /* synthetic */ c m16510N8(final String str, final Moment moment) {
        return ia20.b(new v9j() { // from class: l.oea
            public final Object call() {
                String str2 = str;
                return omg.f11509G.auth().q(TextUtils.isEmpty(str2) ? omg.m12725y() : omg.m12726z(str2)).l(utc0.create(Network.JSON, moment.toJson())).b();
            }
        }, omg.f11507E).map(new w9j() { // from class: l.pea
            public final Object call(Object obj) {
                return this.f11818a.m16503M8(moment, (Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: N9 */
    public final /* synthetic */ j760 m16511N9(Envelope envelope) {
        FeedData feedData = (FeedData) envelope.getModuleData(FeedData.class);
        m16731sd(envelope);
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(feedData.comments);
        return new j760(envelope.pagination.links, arrayList);
    }

    /* JADX INFO: renamed from: Na */
    public final /* synthetic */ roj0 m16512Na(String str, int i, Envelope envelope) {
        HashSet hashSet = new HashSet();
        Iterator<String> it = this.f14982i0.keySet().iterator();
        while (it.hasNext()) {
            Moment moment = this.f14982i0.get(it.next());
            if (NullChecker.a(moment) && !vwb.J(moment.mTopicList) && TextUtils.equals(moment.mTopicList.get(0).f708id, str) && !hashSet.contains(moment.mTopicList.get(0))) {
                hashSet.add(moment.mTopicList.get(0));
                List<VoteOptions> list = moment.mTopicList.get(0).options;
                moment.mTopicList.get(0).voteCounter++;
                if (!vwb.J(list)) {
                    list.get(i).haveliked = true;
                    list.get(i).counter++;
                }
            }
        }
        this.f14988l0.onNext(this.f14982i0);
        return roj0.a;
    }

    /* JADX INFO: renamed from: Nb */
    public c<j760<Links, List<MomentMessage>>> m16513Nb(final String str, final String str2, final String str3, final String str4, final String str5) {
        return scheduled("/moments/" + str3 + "/messages/" + str4 + "/subMessages", 0, new v9j() { // from class: l.iia
            public final Object call() {
                return this.f9025a.m16504M9(str5, str2, str3, str4, str);
            }
        });
    }

    /* JADX INFO: renamed from: Nc */
    public void m16514Nc(List<String> list) {
        List<String> listM16487K6 = m16487K6(list);
        if (vwb.J(listM16487K6)) {
            return;
        }
        m16716qc(listM16487K6);
    }

    /* JADX INFO: renamed from: O6 */
    public List<MomentMessage> m16515O6(Moment moment) {
        ArrayList arrayList = new ArrayList();
        if (NullChecker.a(moment.messages) && NullChecker.a(moment.messages.ids)) {
            Iterator<String> it = moment.messages.ids.iterator();
            while (it.hasNext()) {
                MomentMessage momentMessage = this.f14925H0.get(it.next());
                if (NullChecker.a(momentMessage)) {
                    arrayList.add(momentMessage);
                }
            }
            vwb.I(arrayList, new Comparator() { // from class: l.cda
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return xia.m16244Y2((MomentMessage) obj, (MomentMessage) obj2);
                }
            });
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: O7 */
    public c<NearbyLocation> m16516O7(String str, String str2, String str3, String str4) {
        final String strR = xh5.r(str, str2, str3, str4);
        return scheduled("map_nearby_local" + str3 + str4, 0, new v9j() { // from class: l.q9a
            public final Object call() {
                return ia20.c(new v9j() { // from class: l.fda
                    public final Object call() {
                        return omg.f11509G.auth().q(str).f().b();
                    }
                }, NearbyLocation.JSON_ADAPTER);
            }
        });
    }

    /* JADX INFO: renamed from: O8 */
    public final /* synthetic */ Envelope m16517O8(Envelope envelope) {
        if (envelope != null) {
            m16731sd(envelope);
        }
        return envelope;
    }

    /* JADX INFO: renamed from: O9 */
    public final /* synthetic */ c m16518O9(final String str, final String str2, final String str3, final String str4, final String str5) {
        return new la20(new v9j() { // from class: l.j8a
            public final Object call() {
                return xia.m16272d1(str, str2, str3, str4, str5);
            }
        }).compose(mkd0.C()).map(new w9j() { // from class: l.k8a
            public final Object call(Object obj) {
                return this.f9633a.m16511N9((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: Oa */
    public final /* synthetic */ c m16519Oa(v9j v9jVar, final String str, final int i) {
        return new la20(v9jVar).compose(mkd0.C()).map(new w9j() { // from class: l.sba
            public final Object call(Object obj) {
                return this.f12869a.m16512Na(str, i, (Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: Ob */
    public c<j760<Links, List<MomentMessage>>> m16520Ob(final String str, final String str2, final String str3, final String str4, final String str5) {
        return scheduled("/topics/" + str3 + "/comments/" + str4 + "/subComments", 0, new v9j() { // from class: l.jia
            public final Object call() {
                return this.f9368a.m16518O9(str5, str2, str3, str4, str);
            }
        });
    }

    /* JADX INFO: renamed from: Oc */
    public final void m16521Oc(List<LiveCircleBanner> list) {
        this.f15001r1.clear();
        if (NullChecker.a(list)) {
            vwb.z(list, new e30() { // from class: l.tca
                public final void call(Object obj) {
                    this.f13259a.m16540Ra((LiveCircleBanner) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: P6 */
    public c<Envelope> m16522P6(DetectRequest detectRequest) {
        final String json = detectRequest.toJson();
        return scheduled("contentDetect", -1, new v9j() { // from class: l.v9a
            public final Object call() {
                return this.f14110a.m16416A8(json);
            }
        }, false);
    }

    /* JADX INFO: renamed from: P7 */
    public b<Map<String, TopicMoment>> m16523P7() {
        return this.f14971c1;
    }

    /* JADX INFO: renamed from: P8 */
    public final /* synthetic */ c m16524P8(final String str) {
        return new la20(new v9j() { // from class: l.sea
            public final Object call() {
                return omg.f11509G.auth().q(str).d().b();
            }
        }, 0).compose(omg.m12710n0()).map(new w9j() { // from class: l.tea
            public final Object call(Object obj) {
                return this.f13271a.m16517O8((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: P9 */
    public final /* synthetic */ xaj0 m16525P9(Envelope envelope) {
        FeedData feedData = (FeedData) envelope.getModuleData(FeedData.class);
        List<StickerInfo> list = feedData.stickers;
        Moment moment = vwb.J(feedData.moments) ? null : feedData.moments.get(0);
        Music music = !vwb.J(((FeedData) envelope.getModuleData(FeedData.class)).musics) ? ((FeedData) envelope.getModuleData(FeedData.class)).musics.get(0) : null;
        RawFeed rawFeed = vwb.J(((FeedData) envelope.getModuleData(FeedData.class)).feeds) ? null : ((FeedData) envelope.getModuleData(FeedData.class)).feeds.get(0);
        if (vqg.m15502Z(moment) && feedData.moments.size() < 2) {
            m16724rd(moment.thirdShareSource.sourceId);
        }
        m16731sd(envelope);
        ijb0.m10908S(envelope);
        return new xaj0(moment, new j760(list, feedData.messages), new j760(music, rawFeed));
    }

    /* JADX INFO: renamed from: Pa */
    public final /* synthetic */ TopicOperations m16526Pa(Envelope envelope) {
        m16738td(envelope, false);
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(((FeedData) envelope.getModuleData(FeedData.class)).topicOperations);
        TopicOperations topicOperations = (TopicOperations) vwb.r(arrayList, new w9j() { // from class: l.d9a
            public final Object call(Object obj) {
                return Boolean.valueOf(TEnum.equals(((TopicOperations) obj).operationType, OperationType.newUserAIMoment));
            }
        });
        this.f14926H1 = topicOperations;
        return topicOperations;
    }

    /* JADX INFO: renamed from: Pb */
    public udh m16527Pb() {
        return this.f15003s1.m15426a();
    }

    /* JADX INFO: renamed from: Pc */
    public final void m16528Pc(List<LiveCircleExtInfo> list) {
        this.f14999q1.clear();
        if (NullChecker.a(list)) {
            vwb.z(list, new e30() { // from class: l.nba
                public final void call(Object obj) {
                    this.f10735a.m16547Sa((LiveCircleExtInfo) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: Q6 */
    public List<Moment> m16529Q6(final Envelope envelope, boolean z) {
        final HashMap map = new HashMap();
        vwb.z(((FeedData) envelope.getModuleData(FeedData.class)).moments, new e30() { // from class: l.jaa
            public final void call(Object obj) {
                Moment moment = (Moment) obj;
                map.put(((DbObject) moment).id, moment);
            }
        });
        final HashMap map2 = new HashMap();
        if (NullChecker.a(((FeedData) envelope.getModuleData(FeedData.class)).rooms)) {
            vwb.z(((FeedData) envelope.getModuleData(FeedData.class)).rooms, new e30() { // from class: l.kaa
                public final void call(Object obj) {
                    Room room = (Room) obj;
                    map2.put(room.f271id, room);
                }
            });
        }
        final HashMap map3 = new HashMap();
        if (NullChecker.a(((FeedData) envelope.getModuleData(FeedData.class)).liveRecommendCards)) {
            vwb.z(((FeedData) envelope.getModuleData(FeedData.class)).liveRecommendCards, new e30() { // from class: l.laa
                public final void call(Object obj) {
                    LiveRecommendCard liveRecommendCard = (LiveRecommendCard) obj;
                    map3.put(liveRecommendCard.f689id, liveRecommendCard);
                }
            });
        }
        final ArrayList arrayList = new ArrayList();
        if (((FeedData) envelope.getModuleData(FeedData.class)).feeds == null) {
            return arrayList;
        }
        if (z) {
            vwb.z(((FeedData) envelope.getModuleData(FeedData.class)).feeds, new e30() { // from class: l.maa
                public final void call(Object obj) {
                    this.f10371a.m16424B8((RawFeed) obj);
                }
            });
        } else {
            vwb.d0(((FeedData) envelope.getModuleData(FeedData.class)).feeds, new w9j() { // from class: l.naa
                public final Object call(Object obj) {
                    return this.f10727a.m16432C8((RawFeed) obj);
                }
            });
        }
        m16535Qc(((FeedData) envelope.getModuleData(FeedData.class)).lives);
        m16556Tc(((FeedData) envelope.getModuleData(FeedData.class)).voiceLives);
        m16570Vc(((FeedData) envelope.getModuleData(FeedData.class)).voiceRooms);
        m16542Rc(((FeedData) envelope.getModuleData(FeedData.class)).voiceLiveGames);
        m16549Sc(((FeedData) envelope.getModuleData(FeedData.class)).voiceLiveMomentFeeds);
        m16528Pc(((FeedData) envelope.getModuleData(FeedData.class)).liveCircleMomentExtInfos);
        m16521Oc(((FeedData) envelope.getModuleData(FeedData.class)).liveGroupCircleMomentBanners);
        final HashMap<String, LiveUserMask> mapM16563Uc = m16563Uc(((FeedData) envelope.getModuleData(FeedData.class)).masks);
        vwb.z(((FeedData) envelope.getModuleData(FeedData.class)).feeds, new e30() { // from class: l.paa
            public final void call(Object obj) {
                this.f11746a.m16440D8(map, arrayList, map3, map2, mapM16563Uc, envelope, (RawFeed) obj);
            }
        });
        return arrayList;
    }

    /* JADX INFO: renamed from: Q7 */
    public c<roj0> m16530Q7(String str) {
        final String strM12703k = omg.m12703k("/notify-users?search=" + str + "&with=" + omg.f11529t + ",topic");
        return scheduled("getNotifyUsers" + str, 0, new v9j() { // from class: l.m8a
            public final Object call() {
                return this.f10267a.m16713q9(strM12703k);
            }
        });
    }

    /* JADX INFO: renamed from: Q8 */
    public final /* synthetic */ roj0 m16531Q8(MomentMessage momentMessage, String str, Envelope envelope) {
        CommentInfo commentInfo = momentMessage.commentInfo;
        String str2 = commentInfo.parentMessageId;
        List<String> list = commentInfo.subMessageIds;
        Moment moment = this.f14982i0.get(str);
        if (moment == null) {
            return roj0.a;
        }
        if (TextUtils.isEmpty(str2) || str2.equals("0")) {
            PartialIdList partialIdList = moment.messages;
            partialIdList.count--;
            partialIdList.ids.remove(((CopyObject) momentMessage).id);
            f14907L1 = vwb.Y(str, 2);
            this.f14934K0.onNext(momentMessage);
            this.f14925H0.remove(((CopyObject) momentMessage).id);
            if (NullChecker.b(list)) {
                for (int i = 0; i < list.size(); i++) {
                    String str3 = list.get(i);
                    MomentMessage momentMessage2 = this.f14925H0.get(str3);
                    if (NullChecker.a(momentMessage2)) {
                        PartialIdList partialIdList2 = moment.messages;
                        partialIdList2.count--;
                        partialIdList2.ids.remove(str3);
                        this.f14934K0.onNext(momentMessage2);
                        this.f14925H0.remove(str3);
                    }
                }
            }
            this.f14982i0.put(str, moment);
            this.f14988l0.onNext(this.f14982i0);
        } else {
            PartialIdList partialIdList3 = moment.messages;
            partialIdList3.count--;
            partialIdList3.ids.remove(((CopyObject) momentMessage).id);
            this.f14934K0.onNext(momentMessage);
            this.f14925H0.remove(((CopyObject) momentMessage).id);
            MomentMessage momentMessage3 = this.f14925H0.get(str2);
            if (NullChecker.b(momentMessage3)) {
                momentMessage3.commentInfo.subMessageIds.remove(((CopyObject) momentMessage).id);
                this.f14925H0.put(str2, momentMessage3);
            }
            this.f14982i0.put(str, moment);
            this.f14988l0.onNext(this.f14982i0);
        }
        return roj0.a;
    }

    /* JADX INFO: renamed from: Q9 */
    public final /* synthetic */ void m16532Q9(String str, Throwable th) {
        if ((th instanceof ApiExcep.Client.Forbidden) || (th instanceof ApiExcep.Client.NotFound)) {
            m16724rd(str);
        }
    }

    /* JADX INFO: renamed from: Qa */
    public final /* synthetic */ c m16533Qa() {
        return new la20(new v9j() { // from class: l.dha
            public final Object call() {
                return omg.f11509G.auth().q(omg.m12720t("/publishGuide?scene=newUserAIMoment")).f().b();
            }
        }).compose(omg.m12710n0()).map(new w9j() { // from class: l.fha
            public final Object call(Object obj) {
                return this.f8102a.m16526Pa((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: Qb */
    public void m16534Qb(Moment moment) {
        if (moment == null) {
            return;
        }
        if (moment.forwards == null) {
            moment.forwards = MomentForwards.new_();
        }
        moment.forwards.count++;
        this.f14982i0.put(((DbObject) moment).id, moment);
        this.f14988l0.onNext(this.f14982i0);
    }

    /* JADX INFO: renamed from: Qc */
    public void m16535Qc(List<Live> list) {
        if (u2h.m14719d() && NullChecker.a(list)) {
            vwb.z(list, new e30() { // from class: l.rca
                public final void call(Object obj) {
                    this.f12591a.m16554Ta((Live) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: R6 */
    public c<TopicMoment> m16536R6(String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("id", str);
            jSONObject.put("name", str2);
            jSONObject.put(Owner.TYPE, jSONObject2);
        } catch (JSONException e) {
            CrashHelper.c(e);
        }
        final String string = jSONObject.toString();
        return scheduled("createTopicNew", -1, new v9j() { // from class: l.pca
            public final Object call() {
                return this.f11789a.m16454F8(string);
            }
        }, false);
    }

    /* JADX INFO: renamed from: R7 */
    public NotifyUsers m16537R7(String str) {
        return this.f14984j0.get(str);
    }

    /* JADX INFO: renamed from: R8 */
    public final /* synthetic */ c m16538R8(final String str, final String str2, final MomentMessage momentMessage) {
        new MomentMessage().recalled = Boolean.TRUE;
        return new la20(new v9j() { // from class: l.xda
            public final Object call() {
                return omg.f11509G.auth().q(omg.m12705l(str, str2, ((CopyObject) momentMessage).id)).d().b();
            }
        }, 0).compose(omg.m12710n0()).map(new w9j() { // from class: l.yda
            public final Object call(Object obj) {
                return this.f15403a.m16531Q8(momentMessage, str2, (Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: R9 */
    public final /* synthetic */ c m16539R9(final String str, final String str2, final boolean z, final String str3) {
        return new la20(new v9j() { // from class: l.tia
            public final Object call() {
                return omg.f11509G.auth().q(omg.m12669M(str, str2, z, str3) + "&" + omg.f11535z + "&source=viewer").b();
            }
        }, omg.f11506D).compose(omg.m12710n0()).map(new w9j() { // from class: l.uia
            public final Object call(Object obj) {
                return this.f13840a.m16525P9((Envelope) obj);
            }
        }).doOnError(new e30() { // from class: l.via
            public final void call(Object obj) {
                this.f14173a.m16532Q9(str2, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: renamed from: Ra */
    public final /* synthetic */ void m16540Ra(LiveCircleBanner liveCircleBanner) {
        this.f15001r1.put(liveCircleBanner.f685id, liveCircleBanner);
    }

    /* JADX INFO: renamed from: Rb */
    public c<xaj0<Moment, j760<List<StickerInfo>, List<MomentMessage>>, j760<Music, RawFeed>>> m16541Rb(String str, String str2) {
        return m16555Tb(str, str2, true);
    }

    /* JADX INFO: renamed from: Rc */
    public final void m16542Rc(List<VoiceLiveGame> list) {
        if (u2h.m14719d()) {
            this.f14995o1.clear();
            if (NullChecker.a(list)) {
                vwb.z(list, new e30() { // from class: l.taa
                    public final void call(Object obj) {
                        this.f13246a.m16561Ua((VoiceLiveGame) obj);
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: S6 */
    public c<roj0> m16543S6(final Moment moment) {
        boolean zEquals = TEnum.equals(moment.status(), "failed");
        String str = ((DbObject) moment).id;
        if (!zEquals) {
            return !str.startsWith("fake_id_") ? scheduled("momentDelete", -1, new v9j() { // from class: l.sca
                public final Object call() {
                    return this.f12884a.m16468H8(moment);
                }
            }) : c.just(roj0.a);
        }
        if (str.startsWith("fake_id_")) {
            this.f14953T0.remove(((DbObject) moment).id);
        }
        this.f14996p0.onNext(moment);
        return c.just(roj0.a);
    }

    /* JADX INFO: renamed from: S7 */
    public final String m16544S7(String str, String str2) {
        return str + "/personal/media/previous" + str2;
    }

    /* JADX INFO: renamed from: S8 */
    public final /* synthetic */ List m16545S8(Envelope envelope) {
        m16738td(envelope, false);
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(((FeedData) envelope.getModuleData(FeedData.class)).momentPopWindows);
        return arrayList;
    }

    /* JADX INFO: renamed from: S9 */
    public final /* synthetic */ j760 m16546S9(Envelope envelope) {
        m16731sd(envelope);
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(((FeedData) envelope.getModuleData(FeedData.class)).momentTopics);
        return new j760(envelope.pagination.links, arrayList);
    }

    /* JADX INFO: renamed from: Sa */
    public final /* synthetic */ void m16547Sa(LiveCircleExtInfo liveCircleExtInfo) {
        this.f14999q1.put(liveCircleExtInfo.f686id, liveCircleExtInfo);
    }

    /* JADX INFO: renamed from: Sb */
    public c<xaj0<Moment, j760<List<StickerInfo>, List<MomentMessage>>, j760<Music, RawFeed>>> m16548Sb(String str, String str2, String str3) {
        return m16562Ub(str, str2, true, str3);
    }

    /* JADX INFO: renamed from: Sc */
    public final void m16549Sc(List<VoiceLiveMomentFeed> list) {
        if (u2h.m14719d()) {
            this.f14997p1.clear();
            if (NullChecker.a(list)) {
                vwb.z(list, new e30() { // from class: l.fca
                    public final void call(Object obj) {
                        this.f8067a.m16568Va((VoiceLiveMomentFeed) obj);
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: T6 */
    public c<Envelope> m16550T6(final String str) {
        return scheduled("activity-users/delete" + str, -1, new v9j() { // from class: l.qha
            public final Object call() {
                return this.f12238a.m16482J8(str);
            }
        });
    }

    /* JADX INFO: renamed from: T7 */
    public final String m16551T7(String str) {
        return str + "/personal/feed/previous";
    }

    /* JADX INFO: renamed from: T8 */
    public final /* synthetic */ c m16552T8(final String str, final String str2) {
        return new la20(new v9j() { // from class: l.yca
            public final Object call() {
                return xia.m16287f4(str, str2);
            }
        }).compose(omg.m12710n0()).map(new w9j() { // from class: l.zca
            public final Object call(Object obj) {
                return this.f15689a.m16545S8((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: T9 */
    public final /* synthetic */ c m16553T9(final String str, final String str2) {
        return new la20(new v9j() { // from class: l.c8a
            public final Object call() {
                return omg.f11509G.auth().q(omg.m12667K(str, str2)).f().b();
            }
        }).compose(omg.m12710n0()).map(new w9j() { // from class: l.d8a
            public final Object call(Object obj) {
                return this.f6865a.m16546S9((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: Ta */
    public final /* synthetic */ void m16554Ta(Live live) {
        this.f14989l1.put(live.f228id, live);
    }

    /* JADX INFO: renamed from: Tb */
    public c<xaj0<Moment, j760<List<StickerInfo>, List<MomentMessage>>, j760<Music, RawFeed>>> m16555Tb(String str, String str2, boolean z) {
        return m16562Ub(str, str2, true, "");
    }

    /* JADX INFO: renamed from: Tc */
    public void m16556Tc(List<VoiceLive> list) {
        if (u2h.m14719d() && NullChecker.a(list)) {
            vwb.z(list, new e30() { // from class: l.yaa
                public final void call(Object obj) {
                    this.f15371a.m16575Wa((VoiceLive) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: U6 */
    public c<j760<Links, List<Moment>>> m16557U6(Links links, an00 an00Var) {
        return m16590Yb(omg.m12678V(links.next), "discussion/next", an00Var);
    }

    /* JADX INFO: renamed from: U7 */
    public c<Envelope> m16558U7(String str) {
        final String strM12694f0 = omg.m12694f0(str, "limit=20");
        return scheduled("getPoiTraceCardInfoData" + str, 0, new v9j() { // from class: l.cga
            public final Object call() {
                return this.f6640a.m16727s9(strM12694f0);
            }
        });
    }

    /* JADX INFO: renamed from: U8 */
    public final /* synthetic */ Followship m16559U8(boolean z, User user, MatchScData matchScData, Envelope envelope) {
        a<List<User>> aVar = this.f15004t0;
        if (z) {
            ((List) aVar.e()).add(user);
        } else {
            ((List) aVar.e()).remove(user);
        }
        a<List<User>> aVar2 = this.f15004t0;
        aVar2.onNext((List) aVar2.e());
        ijb0.m10908S(envelope);
        if (nkg.m12213K()) {
            ijb0.m10898I();
        }
        m16486Jc(user, z, matchScData);
        if (u2h.m14719d() || u2h.m14718c()) {
            ijb0.m10910U(user, true);
        }
        Followship followshipNew_ = vwb.J(((FeedData) envelope.getModuleData(FeedData.class)).followships) ? Followship.new_() : ((FeedData) envelope.getModuleData(FeedData.class)).followships.get(0);
        this.f15013x1.onNext(followshipNew_);
        return followshipNew_;
    }

    /* JADX INFO: renamed from: U9 */
    public final /* synthetic */ j760 m16560U9(Envelope envelope) {
        FeedData feedData = (FeedData) envelope.getModuleData(FeedData.class);
        m16731sd(envelope);
        ijb0.m10908S(envelope);
        return new j760(feedData.stickers, feedData.messages);
    }

    /* JADX INFO: renamed from: Ua */
    public final /* synthetic */ void m16561Ua(VoiceLiveGame voiceLiveGame) {
        this.f14995o1.put(voiceLiveGame.voiceLiveId, voiceLiveGame);
    }

    /* JADX INFO: renamed from: Ub */
    public c<xaj0<Moment, j760<List<StickerInfo>, List<MomentMessage>>, j760<Music, RawFeed>>> m16562Ub(final String str, final String str2, final boolean z, final String str3) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && !"null".equals(str) && !"null".equals(str2)) {
            return scheduled("moment/refresh/" + str2, 0, new v9j() { // from class: l.oga
                public final Object call() {
                    return this.f11472a.m16539R9(str, str2, z, str3);
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
        return c.error(new Throwable(sb.toString()));
    }

    /* JADX INFO: renamed from: Uc */
    public HashMap<String, LiveUserMask> m16563Uc(List<LiveUserMask> list) {
        if (!u2h.m14719d()) {
            return new HashMap<>();
        }
        final HashMap<String, LiveUserMask> map = new HashMap<>();
        if (NullChecker.a(list)) {
            vwb.z(list, new e30() { // from class: l.waa
                public final void call(Object obj) {
                    LiveUserMask liveUserMask = (LiveUserMask) obj;
                    map.put(liveUserMask.userId, liveUserMask);
                }
            });
        }
        return map;
    }

    /* JADX INFO: renamed from: V6 */
    public c<j760<Links, List<Moment>>> m16564V6(an00 an00Var) {
        return m16604ac(omg.m12678V("limit=20"), "discussion/previous", false, null, an00Var);
    }

    /* JADX INFO: renamed from: V7 */
    public final String m16565V7(BubbleInfo bubbleInfo, hf00 hf00Var) {
        if (!NullChecker.a(bubbleInfo) || TextUtils.isEmpty(bubbleInfo.f191id) || !NullChecker.a(hf00Var)) {
            return null;
        }
        RawFeed rawFeedM10602c = hf00Var.m10602c(bubbleInfo.f191id);
        if (!NullChecker.a(rawFeedM10602c) || TextUtils.isEmpty(rawFeedM10602c.locationName)) {
            return null;
        }
        return rawFeedM10602c.locationName;
    }

    /* JADX INFO: renamed from: V8 */
    public final /* synthetic */ c m16566V8(final String str, final String str2, final User user, final String str3, final String str4, final Followship followship, final boolean z, final MatchScData matchScData) {
        return new la20(new v9j() { // from class: l.zaa
            public final Object call() {
                return xia.m16298h3(str, str2, user, str3, str4, followship);
            }
        }).compose(mkd0.C()).map(new w9j() { // from class: l.lba
            public final Object call(Object obj) {
                return this.f9995a.m16559U8(z, user, matchScData, (Envelope) obj);
            }
        }).doOnError(new e30() { // from class: l.wba
            public final void call(Object obj) {
                t2h.m14428h((Throwable) obj, z);
            }
        });
    }

    /* JADX INFO: renamed from: V9 */
    public final /* synthetic */ c m16567V9(final String str, final String str2, final String str3) {
        return new la20(new v9j() { // from class: l.tba
            public final Object call() {
                return omg.f11509G.auth().q(omg.m12668L(str, str2, str3)).b();
            }
        }).compose(omg.m12710n0()).map(new w9j() { // from class: l.uba
            public final Object call(Object obj) {
                return this.f13793a.m16560U9((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: Va */
    public final /* synthetic */ void m16568Va(VoiceLiveMomentFeed voiceLiveMomentFeed) {
        this.f14997p1.put(voiceLiveMomentFeed.f712id, voiceLiveMomentFeed);
    }

    /* JADX INFO: renamed from: Vb */
    public c<j760<Links, List<TopicMoment>>> m16569Vb(String str, final String str2, final String str3) {
        return scheduled(str, 0, new v9j() { // from class: l.t7a
            public final Object call() {
                return this.f13206a.m16553T9(str2, str3);
            }
        });
    }

    /* JADX INFO: renamed from: Vc */
    public void m16570Vc(List<VoiceRoomInfo> list) {
        if (u2h.m14719d() && NullChecker.a(list)) {
            vwb.z(list, new e30() { // from class: l.gba
                public final void call(Object obj) {
                    this.f8415a.m16582Xa((VoiceRoomInfo) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: W6 */
    public c<Envelope> m16571W6(String str, String str2) {
        final String strM12703k = omg.m12703k(String.format("/users/%s/states/%s/likes/me", str2, str));
        return scheduled("dislikeState", -1, new v9j() { // from class: l.c7a
            public final Object call() {
                return this.f6551a.m16496L8(strM12703k);
            }
        }, true);
    }

    /* JADX INFO: renamed from: W7 */
    public final String m16572W7(BubbleInfo bubbleInfo, hf00 hf00Var) {
        if (!NullChecker.a(bubbleInfo) || TextUtils.isEmpty(bubbleInfo.f191id) || !NullChecker.a(hf00Var)) {
            return null;
        }
        RawFeed rawFeedM10602c = hf00Var.m10602c(bubbleInfo.f191id);
        if (!NullChecker.a(rawFeedM10602c) || TextUtils.isEmpty(rawFeedM10602c.recommendReason)) {
            return null;
        }
        return rawFeedM10602c.recommendReason;
    }

    /* JADX INFO: renamed from: W8 */
    public final /* synthetic */ c m16573W8(User user, Envelope envelope) {
        if (vwb.J(((FeedData) envelope.getModuleData(FeedData.class)).followships) || TEnum.equals(((FeedData) envelope.getModuleData(FeedData.class)).followships.get(0).state, "matched")) {
            ijb0.m10898I();
            ijb0.m10908S(envelope);
            m16472Hc(user);
            return c.just(user.localFollowship);
        }
        user.localFollowship = ((FeedData) envelope.getModuleData(FeedData.class)).followships.get(0);
        this.f14910A0.put(((DbObject) user).id, user);
        this.f14914C0.onNext(this.f14910A0);
        this.f14947Q0.onNext(new j760(user, Boolean.TRUE));
        ijb0.m10903N(FeedModule.m1139F().userId(), false);
        lsi0.j("对方取消了关注，暂时无法聊天");
        return c.error(f14909N1);
    }

    /* JADX INFO: renamed from: W9 */
    public final /* synthetic */ j760 m16574W9(an00 an00Var, Envelope envelope) {
        if (NullChecker.a(an00Var)) {
            an00Var.mo6842a(envelope);
        }
        List<RawFeed> list = ((FeedData) envelope.getModuleData(FeedData.class)).feeds;
        List<BubbleInfo> list2 = ((FeedData) envelope.getModuleData(FeedData.class)).states;
        if (nkg.m12248k0() && NullChecker.a(list) && !vwb.J(list2)) {
            for (int i = 0; i < list.size(); i++) {
                list.get(i).states.addAll(list2);
            }
        }
        m16731sd(envelope);
        ijb0.m10908S(envelope);
        ArrayList arrayList = new ArrayList();
        if (u2h.m14719d() && NullChecker.a(((FeedData) envelope.getModuleData(FeedData.class)).feeds)) {
            arrayList.addAll(m16529Q6(envelope, false));
        } else {
            arrayList.addAll(((FeedData) envelope.getModuleData(FeedData.class)).moments);
        }
        return new j760(envelope.pagination.links, arrayList);
    }

    /* JADX INFO: renamed from: Wa */
    public final /* synthetic */ void m16575Wa(VoiceLive voiceLive) {
        this.f14991m1.put(voiceLive.f711id, voiceLive);
    }

    /* JADX INFO: renamed from: Wb */
    public c<j760<List<StickerInfo>, List<MomentMessage>>> m16576Wb(final String str, final String str2, final String str3) {
        return scheduled("moment/get/message" + str3, 0, new v9j() { // from class: l.z8a
            public final Object call() {
                return this.f15645a.m16567V9(str, str2, str3);
            }
        });
    }

    /* JADX INFO: renamed from: Wc */
    public c<j760<Links, List<Moment>>> m16577Wc(boolean z) {
        return m16583Xb(omg.m12665I("limit=20", z), "recommend/next");
    }

    /* JADX INFO: renamed from: X6 */
    public c<Envelope> m16578X6(Moment moment) {
        return m16585Y6(moment, null);
    }

    /* JADX INFO: renamed from: X7 */
    public c<j760<List<Moment>, List<RawFeed>>> m16579X7(String str, String str2, String str3) {
        final String strM12703k = omg.m12703k("/moments?search=interaction&pagesource=" + str + "&query=" + str2 + "&interaction=" + str3);
        return scheduled("moments/interaction/" + str2, 0, new v9j() { // from class: l.e9a
            public final Object call() {
                return this.f7257a.m16741u9(strM12703k);
            }
        });
    }

    /* JADX INFO: renamed from: X8 */
    public final /* synthetic */ c m16580X8(final String str, final User user, final Followship followship) {
        return new la20(new v9j() { // from class: l.kga
            public final Object call() {
                return xia.m16319k6(str, user, followship);
            }
        }).compose(mkd0.C()).flatMap(new w9j() { // from class: l.lga
            public final Object call(Object obj) {
                return this.f10028a.m16573W8(user, (Envelope) obj);
            }
        }).doOnError(new e30() { // from class: l.mga
            public final void call(Object obj) {
                xia.m16215T3((Throwable) obj);
            }
        });
    }

    /* JADX INFO: renamed from: X9 */
    public final /* synthetic */ c m16581X9(final String str, final an00 an00Var, final String str2, final long j) {
        return new la20(new v9j() { // from class: l.rha
            public final Object call() {
                return omg.f11509G.auth().q(str).f().b();
            }
        }, omg.f11506D | omg.f11507E).map(new w9j() { // from class: l.sha
            public final Object call(Object obj) {
                return xia.m16303i2(an00Var, str2, (Envelope) obj);
            }
        }).compose(omg.m12710n0()).map(new w9j() { // from class: l.tha
            public final Object call(Object obj) {
                return this.f13303a.m16574W9(an00Var, (Envelope) obj);
            }
        }).doOnNext(new e30() { // from class: l.uha
            public final void call(Object obj) {
                xia.m16347p4(str2, j, (j760) obj);
            }
        });
    }

    /* JADX INFO: renamed from: Xa */
    public final /* synthetic */ void m16582Xa(VoiceRoomInfo voiceRoomInfo) {
        this.f14993n1.put(voiceRoomInfo.f299id, voiceRoomInfo);
    }

    /* JADX INFO: renamed from: Xb */
    public c<j760<Links, List<Moment>>> m16583Xb(String str, String str2) {
        return m16590Yb(str, str2, null);
    }

    /* JADX INFO: renamed from: Xc */
    public c<j760<Links, List<Moment>>> m16584Xc(boolean z) {
        return m16597Zb(omg.m12665I("limit=20", z), "recommend/previous", false, null);
    }

    /* JADX INFO: renamed from: Y6 */
    public c<Envelope> m16585Y6(final Moment moment, final String str) {
        MomentSettings momentSettings = new MomentSettings();
        momentSettings.visibility = MomentVisibilityStatus.get("everyone");
        momentSettings.muted = false;
        moment.settings = momentSettings;
        moment.allowForward = MomentAllowForwardState.get(MomentAllowForwardState.allow);
        if (moment.createdTime <= 0.0d) {
            moment.createdTime = omg.m12717r0();
        }
        if (TextUtils.isEmpty(moment.owner)) {
            moment.owner = FeedModule.m1139F().userId();
        }
        if (TEnum.equals(moment.userSetVisibility, "unknown_")) {
            moment.userSetVisibility = UserSetVisibility.get("everyone");
        }
        return scheduled("postTheMoment", -1, new v9j() { // from class: l.bba
            public final Object call() {
                return this.f6216a.m16510N8(str, moment);
            }
        });
    }

    /* JADX INFO: renamed from: Y7 */
    public c<Envelope> m16586Y7(String str, final an00 an00Var) {
        final String strM12703k;
        if (TextUtils.isEmpty(str)) {
            strM12703k = omg.m12703k("/states?search=square&with=users");
        } else {
            strM12703k = omg.m12703k("/states?search=square&with=users&" + str);
        }
        return scheduled("getSquareStateData", 0, new v9j() { // from class: l.s7a
            public final Object call() {
                return this.f12815a.m16755w9(strM12703k, an00Var);
            }
        }, true);
    }

    /* JADX INFO: renamed from: Y8 */
    public final /* synthetic */ j760 m16587Y8(Envelope envelope) {
        m16731sd(envelope);
        ijb0.m10908S(envelope);
        CommonData commonData = (CommonData) envelope.getModuleData(CommonData.class);
        Pagination pagination = envelope.pagination;
        return commonData == null ? new j760(pagination.links, (Object) null) : new j760(pagination.links, commonData.users);
    }

    /* JADX INFO: renamed from: Y9 */
    public final /* synthetic */ j760 m16588Y9(an00 an00Var, String str, String str2, boolean z, Envelope envelope) {
        if (NullChecker.a(an00Var)) {
            an00Var.mo6843c(envelope);
        }
        List<RawFeed> list = ((FeedData) envelope.getModuleData(FeedData.class)).feeds;
        List<BubbleInfo> list2 = ((FeedData) envelope.getModuleData(FeedData.class)).states;
        if (nkg.m12248k0() && NullChecker.a(list) && !vwb.J(list2)) {
            for (int i = 0; i < list.size(); i++) {
                list.get(i).states.addAll(list2);
            }
        }
        ijb0.m10907R(envelope.counters);
        m16731sd(envelope);
        m16684m8(envelope, str, str2);
        ArrayList arrayList = new ArrayList();
        if (z) {
            for (Moment moment : this.f14953T0.values()) {
                if (moment.owner.equals(str)) {
                    arrayList.add(moment);
                }
            }
        }
        if (u2h.m14719d() && NullChecker.a(((FeedData) envelope.getModuleData(FeedData.class)).feeds)) {
            arrayList.addAll(m16529Q6(envelope, true));
        } else {
            arrayList.addAll(((FeedData) envelope.getModuleData(FeedData.class)).moments);
        }
        ijb0.m10908S(envelope);
        return new j760(envelope.pagination.links, arrayList);
    }

    /* JADX INFO: renamed from: Ya */
    public final /* synthetic */ Envelope m16589Ya(Envelope envelope) {
        m16731sd(envelope);
        return envelope;
    }

    /* JADX INFO: renamed from: Yb */
    public c<j760<Links, List<Moment>>> m16590Yb(final String str, final String str2, final an00 an00Var) {
        final long jElapsedRealtime = SystemClock.elapsedRealtime();
        return scheduled(str2, 0, new v9j() { // from class: l.gga
            public final Object call() {
                return this.f8444a.m16581X9(str, an00Var, str2, jElapsedRealtime);
            }
        });
    }

    /* JADX INFO: renamed from: Yc */
    public void m16591Yc(String str) {
        m16682ld(str).subscribe(mkd0.H(new e30() { // from class: l.t6a
            public final void call(Object obj) {
                xia.m16180N4((roj0) obj);
            }
        }, new e30() { // from class: l.aba
            public final void call(Object obj) {
                xia.m16255a2((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: Z6 */
    public c<Envelope> m16592Z6(String str, String str2) {
        final String strM12703k = omg.m12703k(String.format("/users/%s/states/%s", str2, str));
        return scheduled("endState", -1, new v9j() { // from class: l.r9a
            public final Object call() {
                return ia20.a(new v9j() { // from class: l.gca
                    public final Object call() {
                        return omg.f11509G.auth().q(str).d().b();
                    }
                }).map(new w9j() { // from class: l.ica
                    public final Object call(Object obj) {
                        return xia.m16407y5((Envelope) obj);
                    }
                });
            }
        }, true);
    }

    /* JADX INFO: renamed from: Z7 */
    public c<Envelope> m16593Z7(String str, String str2) {
        final String strM12703k = omg.m12703k(String.format("/users/%s/states/%s", str2, str));
        return scheduled("endState", 0, new v9j() { // from class: l.jga
            public final Object call() {
                return ia20.a(new v9j() { // from class: l.hha
                    public final Object call() {
                        return omg.f11509G.auth().q(str).f().b();
                    }
                }).map(new w9j() { // from class: l.iha
                    public final Object call(Object obj) {
                        return xia.m16396x0((Envelope) obj);
                    }
                });
            }
        }, true);
    }

    /* JADX INFO: renamed from: Z8 */
    public final /* synthetic */ c m16594Z8(final String str) {
        return ia20.a(new v9j() { // from class: l.wia
            public final Object call() {
                return omg.f11509G.auth().q(omg.m12703k(str)).f().b();
            }
        }).map(new w9j() { // from class: l.e7a
            public final Object call(Object obj) {
                return this.f7243a.m16587Y8((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: Z9 */
    public final /* synthetic */ c m16595Z9(final String str, final an00 an00Var, final String str2, final String str3, final boolean z) {
        return new la20(new v9j() { // from class: l.pia
            public final Object call() {
                return omg.f11509G.auth().q(str).f().b();
            }
        }, omg.f11506D | omg.f11507E).map(new w9j() { // from class: l.qia
            public final Object call(Object obj) {
                return xia.m16271c6(an00Var, str2, (Envelope) obj);
            }
        }).compose(omg.m12710n0()).map(new w9j() { // from class: l.ria
            public final Object call(Object obj) {
                return this.f12651a.m16588Y9(an00Var, str3, str, z, (Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: Za */
    public final /* synthetic */ c m16596Za(final String str) {
        return ia20.a(new v9j() { // from class: l.w6a
            public final Object call() {
                return omg.f11509G.auth().q(str).f().b();
            }
        }).map(new w9j() { // from class: l.x6a
            public final Object call(Object obj) {
                return this.f14779a.m16589Ya((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: Zb */
    public c<j760<Links, List<Moment>>> m16597Zb(String str, String str2, boolean z, String str3) {
        return m16604ac(str, str2, z, str3, null);
    }

    /* JADX INFO: renamed from: Zc */
    public c<Envelope> m16598Zc(String str) {
        final String strM12703k = omg.m12703k("/users/" + str + "/topics?search=profile");
        return scheduled("requestAllProfileTopic", 0, new v9j() { // from class: l.sga
            public final Object call() {
                return this.f12950a.m16596Za(strM12703k);
            }
        }, true);
    }

    /* JADX INFO: renamed from: a7 */
    public c<Envelope> m16599a7(String str, String str2) {
        final String strM12703k = omg.m12703k("/groups/" + str + "/users/" + str2);
        return scheduled("exitTheGroup" + str, -1, new v9j() { // from class: l.sda
            public final Object call() {
                return this.f12888a.m16524P8(strM12703k);
            }
        });
    }

    /* JADX INFO: renamed from: a8 */
    public c<List<BubbleInfo>> m16600a8() {
        return scheduled("states?search=quickchat", 0, new v9j() { // from class: l.bga
            public final Object call() {
                return this.f6290a.m16771y9();
            }
        });
    }

    /* JADX INFO: renamed from: a9 */
    public final /* synthetic */ xaj0 m16601a9(Envelope envelope) {
        m16731sd(envelope);
        ijb0.m10908S(envelope);
        CommonData commonData = (CommonData) envelope.getModuleData(CommonData.class);
        FeedData feedData = (FeedData) envelope.getModuleData(FeedData.class);
        return (commonData == null || feedData == null) ? new xaj0(envelope.pagination.links, (Object) null, (Object) null) : new xaj0(envelope.pagination.links, commonData.users, feedData.sourceCatCount);
    }

    /* JADX INFO: renamed from: aa */
    public final /* synthetic */ j760 m16602aa(Envelope envelope) {
        ijb0.m10907R(envelope.counters);
        m16731sd(envelope);
        ArrayList arrayList = new ArrayList();
        if (u2h.m14719d() && NullChecker.a(((FeedData) envelope.getModuleData(FeedData.class)).feeds)) {
            arrayList.addAll(m16529Q6(envelope, true));
        } else {
            arrayList.addAll(((FeedData) envelope.getModuleData(FeedData.class)).moments);
        }
        ijb0.m10908S(envelope);
        return new j760(envelope.pagination.links, arrayList);
    }

    /* JADX INFO: renamed from: ab */
    public final /* synthetic */ Envelope m16603ab(Envelope envelope) {
        m16731sd(envelope);
        return envelope;
    }

    /* JADX INFO: renamed from: ac */
    public c<j760<Links, List<Moment>>> m16604ac(final String str, final String str2, final boolean z, final String str3, final an00 an00Var) {
        return scheduled(str2, 0, new v9j() { // from class: l.fga
            public final Object call() {
                return this.f8095a.m16595Z9(str, an00Var, str2, str3, z);
            }
        });
    }

    /* JADX INFO: renamed from: ad */
    public c<Envelope> m16605ad(String str, int i) {
        final String str2;
        String strM12703k = omg.m12703k("/moments?search=recommend&with=musics&filter=video");
        if (TextUtils.isEmpty(str)) {
            str2 = strM12703k + "&limit=" + i;
        } else {
            str2 = strM12703k + "&" + str;
        }
        return scheduled("/moments?search=recommend&filter=video", 0, new v9j() { // from class: l.qaa
            public final Object call() {
                return this.f12177a.m16610bb(str2);
            }
        });
    }

    /* JADX INFO: renamed from: b7 */
    public c<roj0> m16606b7(final String str, final String str2, final MomentMessage momentMessage) {
        if (TEnum.equals(momentMessage.status(), "failed")) {
            this.f14934K0.onNext(momentMessage);
            return c.just(roj0.a);
        }
        return scheduled("/moments/" + str2 + "/messages/" + ((CopyObject) momentMessage).id, -1, new v9j() { // from class: l.hba
            public final Object call() {
                return this.f8665a.m16538R8(str, str2, momentMessage);
            }
        });
    }

    /* JADX INFO: renamed from: b8 */
    public a<j760<List<TopicCategorie>, List<TopicMoment>>> m16607b8() {
        return this.f14979g1;
    }

    /* JADX INFO: renamed from: b9 */
    public final /* synthetic */ c m16608b9(final String str) {
        return ia20.a(new v9j() { // from class: l.aia
            public final Object call() {
                return omg.f11509G.auth().q(omg.m12703k(str)).f().b();
            }
        }).map(new w9j() { // from class: l.lia
            public final Object call(Object obj) {
                return this.f10049a.m16601a9((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: ba */
    public final /* synthetic */ c m16609ba(final String str) {
        return new la20(new v9j() { // from class: l.qba
            public final Object call() {
                return omg.f11509G.auth().q(str).f().b();
            }
        }, omg.f11506D | omg.f11507E).compose(omg.m12710n0()).map(new w9j() { // from class: l.rba
            public final Object call(Object obj) {
                return this.f12587a.m16602aa((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: bb */
    public final /* synthetic */ c m16610bb(final String str) {
        return ia20.a(new v9j() { // from class: l.ada
            public final Object call() {
                return omg.f11509G.auth().q(str).f().b();
            }
        }).map(new w9j() { // from class: l.bda
            public final Object call(Object obj) {
                return this.f6266a.m16603ab((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: bc */
    public c<j760<Links, List<Moment>>> m16611bc(final String str, String str2, boolean z, String str3, an00 an00Var) {
        return scheduled(str2, 0, new v9j() { // from class: l.y7a
            public final Object call() {
                return this.f15285a.m16609ba(str);
            }
        });
    }

    /* JADX INFO: renamed from: bd */
    public c<Envelope> m16612bd(String str, int i, String str2, String str3) {
        String str4;
        final String str5;
        if ("from_nearby_falls_feed".equals(str2)) {
            str4 = "nearby";
        } else if ("from_discover_discussion".equals(str2)) {
            str4 = "discussion";
        } else {
            str4 = "from_discover_dating".equals(str2) ? "dating" : "recommend";
        }
        String strM12703k = omg.m12703k("/moments?search=immersion&pagesource=" + str4 + "&query=" + str3);
        if (TextUtils.isEmpty(str)) {
            str5 = strM12703k + "&limit=" + i;
        } else {
            str5 = strM12703k + "&" + str;
        }
        return scheduled("/moments?search=immersion", 0, new v9j() { // from class: l.m9a
            public final Object call() {
                return this.f10279a.m16624db(str5);
            }
        });
    }

    /* JADX INFO: renamed from: c7 */
    public c<j760<Links, List<User>>> m16613c7() {
        return m16437Cd(omg.m12709n(""), "fans/list/previous");
    }

    /* JADX INFO: renamed from: c8 */
    public a<j760<Links, List<TopicMoment>>> m16614c8() {
        return this.f14973d1;
    }

    /* JADX INFO: renamed from: c9 */
    public final /* synthetic */ Envelope m16615c9(Envelope envelope) {
        m16731sd(envelope);
        return envelope;
    }

    /* JADX INFO: renamed from: ca */
    public final /* synthetic */ roj0 m16616ca(Envelope envelope) {
        m16731sd(envelope);
        ijb0.m10908S(envelope);
        b<roj0> bVar = this.f14915C1;
        roj0 roj0Var = roj0.a;
        bVar.onNext(roj0Var);
        this.f14917D1.put(Long.valueOf(mqi0.o()));
        return roj0Var;
    }

    /* JADX INFO: renamed from: cb */
    public final /* synthetic */ Envelope m16617cb(Envelope envelope) {
        m16731sd(envelope);
        return envelope;
    }

    /* JADX INFO: renamed from: cc */
    public c<roj0> m16618cc(String str, boolean z) {
        this.f14945P0.onNext(vwb.Y(str, Boolean.valueOf(z)));
        return c.just(roj0.a);
    }

    /* JADX INFO: renamed from: cd */
    public c<j760<Links, List<TopicMoment>>> m16619cd(final String str) {
        return scheduled("searchTopics_" + str, 0, new v9j() { // from class: l.baa
            public final Object call() {
                return this.f6203a.m16638fb(str);
            }
        });
    }

    public void clearRequestsAndStop() {
        super.clearRequestsAndStop();
        Iterator<ei00> it = this.f14932J1.values().iterator();
        while (it.hasNext()) {
            it.next().m9891a();
        }
    }

    /* JADX INFO: renamed from: d7 */
    public c<List<PostBasePopWindow>> m16620d7(final String str, final String str2) {
        return scheduled("feedPostPopWindow_" + str + str2, 0, new v9j() { // from class: l.x8a
            public final Object call() {
                return this.f14796a.m16552T8(str, str2);
            }
        });
    }

    /* JADX INFO: renamed from: d8 */
    public a<j760<Links, List<TopicMoment>>> m16621d8() {
        return this.f14975e1;
    }

    /* JADX INFO: renamed from: d9 */
    public final /* synthetic */ c m16622d9() {
        return new la20(new v9j() { // from class: l.jha
            public final Object call() {
                return omg.f11509G.auth().q(omg.m12703k("/meets")).f().b();
            }
        }).compose(omg.m12710n0()).map(new w9j() { // from class: l.kha
            public final Object call(Object obj) {
                return this.f9718a.m16615c9((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: da */
    public final /* synthetic */ c m16623da(final String str) {
        return ia20.a(new v9j() { // from class: l.zea
            public final Object call() {
                return omg.f11509G.auth().q(omg.m12720t("/award")).l(utc0.create(Network.JSON, str)).b();
            }
        }).map(new w9j() { // from class: l.afa
            public final Object call(Object obj) {
                return this.f5731a.m16616ca((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: db */
    public final /* synthetic */ c m16624db(final String str) {
        return ia20.a(new v9j() { // from class: l.cba
            public final Object call() {
                return omg.f11509G.auth().q(str).f().b();
            }
        }).map(new w9j() { // from class: l.dba
            public final Object call(Object obj) {
                return this.f6887a.m16617cb((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: dc */
    public c<List<Moment>> m16625dc() {
        return this.f15006u0;
    }

    /* JADX INFO: renamed from: dd */
    public void m16626dd(double d) {
        if (((Double) this.f14967a1.get()).doubleValue() < d) {
            this.f14967a1.put(Double.valueOf(d));
        }
    }

    /* JADX INFO: renamed from: e7 */
    public c<List<FeedUserLiveLabel>> m16627e7(String str, HashSet<String> hashSet) {
        if (hashSet.size() == 0) {
            return c.just(new ArrayList());
        }
        StringBuilder sb = new StringBuilder();
        Iterator<String> it = hashSet.iterator();
        sb.append(it.next());
        while (it.hasNext()) {
            sb.append(",");
            sb.append(it.next());
        }
        final JsonObject jsonObject = new JsonObject();
        try {
            jsonObject.addProperty("source", str);
            jsonObject.addProperty("userIds", sb.toString());
        } catch (Exception unused) {
        }
        return scheduled("live-labels".concat(sb.toString()), -1, new v9j() { // from class: l.gia
            public final Object call() {
                return ia20.a(new v9j() { // from class: l.aaa
                    public final Object call() {
                        return omg.f11509G.auth().q(omg.m12703k("/live-labels")).l(utc0.create(Network.JSON, jsonObject.toString())).b();
                    }
                });
            }
        }).map(new w9j() { // from class: l.hia
            public final Object call(Object obj) {
                return xia.m16381u6((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: e8 */
    public User m16628e8(String str) {
        User userM10926m = this.f14910A0.get(str);
        if (userM10926m == null) {
            if (u2h.m14719d() || u2h.m14718c()) {
                userM10926m = ijb0.m10926m(str);
            }
            if (userM10926m == null) {
                userM10926m = FeedModule.f320h.m13964z0(str);
            }
            if (userM10926m == null) {
                userM10926m = ijb0.m10913X(str);
            }
        }
        this.f14910A0.put(str, userM10926m);
        return userM10926m;
    }

    /* JADX INFO: renamed from: e9 */
    public final /* synthetic */ Envelope m16629e9(String str, Envelope envelope) {
        m16731sd(envelope);
        List<BubbleInfo> list = ((FeedData) envelope.data.getModuleData(FeedData.class)).states;
        if (list.size() > 0 && ((DbObject) FeedModule.m1140H().me_()).id.equals(list.get(0).owner.f264id)) {
            m16681lc(list.get(0));
            return envelope;
        }
        if (TextUtils.isEmpty(str)) {
            m16681lc(null);
        }
        return envelope;
    }

    /* JADX INFO: renamed from: ea */
    public final /* synthetic */ xaj0 m16630ea(String str, Envelope envelope) {
        m16738td(envelope, false);
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(((FeedData) envelope.getModuleData(FeedData.class)).momentTopics);
        ArrayList arrayList2 = new ArrayList();
        arrayList2.addAll(((FeedData) envelope.getModuleData(FeedData.class)).topicOperations);
        ArrayList arrayList3 = new ArrayList();
        arrayList3.addAll(((FeedData) envelope.getModuleData(FeedData.class)).moments);
        if (nkg.m12207E()) {
            List<BubbleInfo> list = ((FeedData) envelope.getModuleData(FeedData.class)).states;
            if (NullChecker.a(list) && list.size() != 0) {
                this.f15012x0.onNext(list);
            }
        }
        if ("follow".equals(str) || "like".equals(str) || "dating".equals(str)) {
            this.f14977f1.onNext((TopicOperations) vwb.r(arrayList2, new w9j() { // from class: l.b8a
                public final Object call(Object obj) {
                    return Boolean.valueOf(TEnum.equals(((TopicOperations) obj).operationType, OperationType.draft));
                }
            }));
        }
        return new xaj0(arrayList2, arrayList, arrayList3);
    }

    /* JADX INFO: renamed from: eb */
    public final /* synthetic */ j760 m16631eb(Envelope envelope) {
        m16731sd(envelope);
        return new j760(envelope.pagination.links, ((FeedData) envelope.getModuleData(FeedData.class)).momentTopics);
    }

    /* JADX INFO: renamed from: ec */
    public c<j760<Links, List<Moment>>> m16632ec(Links links) {
        return m16639fc(links, null);
    }

    /* JADX INFO: renamed from: ed */
    public c<Envelope> m16633ed() {
        final String strM12703k = omg.m12703k("/activity-entrance/nearby?interUser=false");
        return scheduled("showChristmasEntrance", 0, new v9j() { // from class: l.dia
            public final Object call() {
                return this.f6947a.m16652hb(strM12703k);
            }
        }, true);
    }

    /* JADX INFO: renamed from: f7 */
    public c<Followship> m16634f7(String str, User user, boolean z) {
        return m16641g7(str, user, z, null, null);
    }

    /* JADX INFO: renamed from: f8 */
    public c<User> m16635f8(final String str) {
        return now(new la20(new v9j() { // from class: l.zha
            public final Object call() {
                return omg.f11509G.auth().q(omg.m12704k0(str)).f().b();
            }
        }).compose(omg.m12710n0()).map(new w9j() { // from class: l.bia
            public final Object call(Object obj) {
                return this.f6333a.m16779z9(str, (Envelope) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: f9 */
    public final /* synthetic */ c m16636f9(final String str, final String str2) {
        return ia20.a(new v9j() { // from class: l.nia
            public final Object call() {
                return omg.f11509G.auth().q(str).f().b();
            }
        }).map(new w9j() { // from class: l.oia
            public final Object call(Object obj) {
                return this.f11486a.m16629e9(str2, (Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: fa */
    public final /* synthetic */ c m16637fa(final String str, final String str2) {
        return new la20(new v9j() { // from class: l.y6a
            public final Object call() {
                return omg.f11509G.auth().q(omg.m12671O(str, str2)).f().b();
            }
        }).compose(omg.m12710n0()).map(new w9j() { // from class: l.z6a
            public final Object call(Object obj) {
                return this.f15606a.m16630ea(str, (Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: fb */
    public final /* synthetic */ c m16638fb(final String str) {
        return new la20(new v9j() { // from class: l.oba
            public final Object call() {
                return omg.f11509G.auth().q(omg.m12703k("/search/topics?limit=20&query=" + str)).f().b();
            }
        }).compose(omg.m12710n0()).map(new w9j() { // from class: l.pba
            public final Object call(Object obj) {
                return this.f11779a.m16631eb((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: fc */
    public c<j760<Links, List<Moment>>> m16639fc(Links links, an00 an00Var) {
        return m16590Yb(omg.m12690d0(links.next), "nearby/next", an00Var);
    }

    /* JADX INFO: renamed from: fd */
    public c<j760<Links, List<Moment>>> m16640fd(String str, Links links, an00 an00Var, String str2) {
        return m16590Yb(omg.m12696g0(str, links.next, str2), "/moments/topicAggregation/next/" + str + str2, an00Var);
    }

    /* JADX INFO: renamed from: g7 */
    public c<Followship> m16641g7(String str, User user, boolean z, String str2, String str3) {
        return m16648h7(str, user, z, str2, str3, null);
    }

    /* JADX INFO: renamed from: g8 */
    public c<BubbleInfo> m16642g8(final String str) {
        final String strM12703k = omg.m12703k("/users/" + str + "/states");
        return scheduled("getUserState", 0, new v9j() { // from class: l.dda
            public final Object call() {
                return this.f6896a.m16425B9(strM12703k, str);
            }
        }, true);
    }

    /* JADX INFO: renamed from: g9 */
    public final /* synthetic */ Envelope m16643g9(Envelope envelope) {
        m16731sd(envelope);
        return envelope;
    }

    /* JADX INFO: renamed from: ga */
    public final /* synthetic */ Envelope m16644ga(List list, Envelope envelope) {
        this.f14916D0.addAll(list);
        for (int i = 0; i < list.size(); i++) {
            if (this.f14920F0.contains(list.get(i))) {
                this.f14920F0.remove(list.get(i));
            }
        }
        return envelope;
    }

    /* JADX INFO: renamed from: gb */
    public final /* synthetic */ Envelope m16645gb(Envelope envelope) {
        m16731sd(envelope);
        return envelope;
    }

    /* JADX INFO: renamed from: gc */
    public c<j760<Links, List<Moment>>> m16646gc() {
        return m16653hc(null);
    }

    /* JADX INFO: renamed from: gd */
    public c<xaj0<Links, List<Moment>, List<TopicMoment>>> m16647gd(String str, an00 an00Var, String str2) {
        return m16689md(omg.m12696g0(str, "limit=20", str2), "/moments/topicAggregation/prev/" + str + str2, an00Var);
    }

    /* JADX INFO: renamed from: h7 */
    public c<Followship> m16648h7(final String str, final User user, final boolean z, final String str2, final String str3, @Nullable final String str4) {
        MatchScData matchScDataBuild;
        if (z) {
            o660 o660VarD = p660.d();
            matchScDataBuild = new MatchScData.MatchBuilder().isLike(true).matchSource("follow").isSuperLiked(false).isFromButton(true).isFromFollow(true).user(user).pageId(o660VarD != null ? o660VarD.c() : "").build();
        } else {
            matchScDataBuild = null;
        }
        final MatchScData matchScData = matchScDataBuild;
        final Followship followship = new Followship();
        followship.state = FollowshipStatus.get(z ? FollowshipStatus.following : FollowshipStatus.unfollow);
        followship.userTime = qib0.H.guessedCurrentServerTime();
        followship.toJson();
        return scheduled(FollowshipStatus.following + ((DbObject) user).id, -1, new v9j() { // from class: l.tga
            public final Object call() {
                return this.f13287a.m16566V8(str2, str, user, str3, str4, followship, z, matchScData);
            }
        });
    }

    /* JADX INFO: renamed from: h8 */
    public c<j760<Links, List<ViewersBox>>> m16649h8(final String str, final String str2, final String str3) {
        return scheduled("getUserViewsHistoryList", 0, new v9j() { // from class: l.cea
            public final Object call() {
                return this.f6613a.m16441D9(str3, str, str2);
            }
        });
    }

    /* JADX INFO: renamed from: h9 */
    public final /* synthetic */ c m16650h9(final String str) {
        return new la20(new v9j() { // from class: l.xga
            public final Object call() {
                return omg.f11509G.auth().q(str).f().b();
            }
        }, 0).compose(omg.m12710n0()).map(new w9j() { // from class: l.yga
            public final Object call(Object obj) {
                return this.f15426a.m16643g9((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: ha */
    public final /* synthetic */ c m16651ha(final String str, final List list) {
        return ia20.a(new v9j() { // from class: l.zfa
            public final Object call() {
                return omg.f11509G.auth().q(omg.m12703k("/moment-viewers")).l(utc0.create(Network.JSON, str)).b();
            }
        }).map(new w9j() { // from class: l.aga
            public final Object call(Object obj) {
                return this.f5740a.m16644ga(list, (Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: hb */
    public final /* synthetic */ c m16652hb(final String str) {
        return ia20.a(new v9j() { // from class: l.i9a
            public final Object call() {
                return omg.f11509G.auth().q(str).f().b();
            }
        }).map(new w9j() { // from class: l.j9a
            public final Object call(Object obj) {
                return this.f9267a.m16645gb((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: hc */
    public c<j760<Links, List<Moment>>> m16653hc(an00 an00Var) {
        return m16604ac(omg.m12690d0("limit=20"), "nearby/previous", false, null, an00Var);
    }

    /* JADX INFO: renamed from: hd */
    public c<roj0> m16654hd(final String str) {
        return scheduled("topicCategories" + str, 0, new v9j() { // from class: l.eda
            public final Object call() {
                return this.f7331a.m16666jb(str);
            }
        });
    }

    /* JADX INFO: renamed from: i7 */
    public c<j760<Links, List<Moment>>> m16655i7(Links links, an00 an00Var) {
        return m16590Yb(omg.m12680X(links.next), "following/moments/next", an00Var);
    }

    /* JADX INFO: renamed from: i8 */
    public c<roj0> m16656i8(final boolean z) {
        return scheduled("get_follow_configs", 0, new v9j() { // from class: l.iga
            public final Object call() {
                return this.f9013a.m16455F9(z);
            }
        });
    }

    /* JADX INFO: renamed from: i9 */
    public final /* synthetic */ xaj0 m16657i9(Envelope envelope) {
        m16731sd(envelope);
        return new xaj0(((FeedData) envelope.data.getModuleData(FeedData.class)).groups, ((CommonData) envelope.data.getModuleData(CommonData.class)).users, envelope.pagination.links);
    }

    /* JADX INFO: renamed from: ia */
    public final /* synthetic */ xaj0 m16658ia(Envelope envelope) {
        m16731sd(envelope);
        return new xaj0(envelope.pagination.links, ((CommonData) envelope.getModuleData(CommonData.class)).users, Integer.valueOf(envelope.pagination.total));
    }

    /* JADX INFO: renamed from: ib */
    public final /* synthetic */ roj0 m16659ib(Envelope envelope) {
        m16731sd(envelope);
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(((FeedData) envelope.getModuleData(FeedData.class)).momentTopics);
        ArrayList arrayList2 = new ArrayList();
        arrayList2.addAll(((FeedData) envelope.getModuleData(FeedData.class)).topicCategories);
        this.f14979g1.onNext(new j760(arrayList2, arrayList));
        return roj0.a;
    }

    /* JADX INFO: renamed from: ic */
    public c<j760<Links, List<Moment>>> m16660ic(Links links, an00 an00Var) {
        return m16590Yb(omg.m12688c0(links.next), "nearbyOnline/next", an00Var);
    }

    /* JADX INFO: renamed from: id */
    public c<roj0> m16661id(final MomentMessage momentMessage, final String str, final String str2) {
        return TEnum.equals(momentMessage.status(), "failed") ? c.just(roj0.a) : scheduled("topicCommentDelete", -1, new v9j() { // from class: l.b7a
            public final Object call() {
                return xia.m16410z2(str, str2, momentMessage);
            }
        });
    }

    /* JADX INFO: renamed from: j7 */
    public c<j760<Links, List<Moment>>> m16662j7(an00 an00Var) {
        return m16604ac(omg.m12680X("limit=20"), "following/previous", true, FeedModule.m1139F().userId(), an00Var);
    }

    /* JADX INFO: renamed from: j8 */
    public c<j760<Links, List<Moment>>> m16663j8(an00 an00Var, String str, String str2, Links links) {
        return m16611bc(omg.m12703k("/moments?search=group&sort=" + str + "&query=" + str2 + "&" + links.next), "group/previous" + str2, false, null, an00Var);
    }

    /* JADX INFO: renamed from: j9 */
    public final /* synthetic */ roj0 m16664j9(Envelope envelope) {
        GuideStatePostConfig guideStatePostConfig = ((FeedData) envelope.getModuleData(FeedData.class)).guideStatePostConfig;
        this.f14941N0 = guideStatePostConfig;
        this.f14943O0.onNext(guideStatePostConfig);
        return roj0.a;
    }

    /* JADX INFO: renamed from: ja */
    public final /* synthetic */ c m16665ja(final String str) {
        return new la20(new v9j() { // from class: l.nha
            public final Object call() {
                return omg.f11509G.auth().q(str).f().b();
            }
        }).compose(omg.m12710n0()).map(new w9j() { // from class: l.oha
            public final Object call(Object obj) {
                return this.f11481a.m16658ia((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: jb */
    public final /* synthetic */ c m16666jb(final String str) {
        return new la20(new v9j() { // from class: l.mea
            public final Object call() {
                return omg.f11509G.auth().q(omg.m12666J(str)).f().b();
            }
        }).compose(omg.m12710n0()).map(new w9j() { // from class: l.nea
            public final Object call(Object obj) {
                return this.f10758a.m16659ib((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: jc */
    public c<j760<Links, List<Moment>>> m16667jc(an00 an00Var) {
        return m16604ac(omg.m12688c0("limit=20"), "nearbyOnline/previous", false, null, an00Var);
    }

    /* JADX INFO: renamed from: jd */
    public c<MomentMessage> m16668jd(final MomentMessage momentMessage, final String str, final String str2) {
        v9j v9jVar = new v9j() { // from class: l.e8a
            public final Object call() {
                return c.fromCallable(new Callable() { // from class: l.raa
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return xia.m16322l3(momentMessage, str);
                    }
                });
            }
        };
        final w9j w9jVar = new w9j() { // from class: l.f8a
            public final Object call(Object obj) {
                return this.f8018a.m16687mb(str, str2, (MomentMessage) obj);
            }
        };
        return now(((c) v9jVar.call()).flatMap(new w9j() { // from class: l.g8a
            public final Object call(Object obj) {
                return xia.m16236X0(w9jVar, (MomentMessage) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: k7 */
    public c<j760<Links, List<Moment>>> m16669k7(an00 an00Var) {
        return m16604ac(omg.m12680X("limit=20&pagesource=dating"), "following/previous", true, FeedModule.m1139F().userId(), an00Var);
    }

    /* JADX INFO: renamed from: k8 */
    public c<j760<Links, List<Moment>>> m16670k8(an00 an00Var, String str, String str2) {
        return m16611bc(omg.m12703k("/moments?search=group&sort=" + str + "&query=" + str2), "/moments?search=group&sort=" + str + "&query=" + str2, false, null, an00Var);
    }

    /* JADX INFO: renamed from: k9 */
    public final /* synthetic */ c m16671k9() {
        return new la20(new v9j() { // from class: l.uaa
            public final Object call() {
                return omg.f11509G.auth().q(omg.m12720t("/guideState")).f().b();
            }
        }).map(new w9j() { // from class: l.vaa
            public final Object call(Object obj) {
                return this.f14126a.m16664j9((Envelope) obj);
            }
        }).compose(omg.m12710n0());
    }

    /* JADX INFO: renamed from: ka */
    public final /* synthetic */ xaj0 m16672ka(Envelope envelope) {
        m16731sd(envelope);
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
            x8hVar.m16041f(user);
            x8hVar.m16040e((List) map.get(((DbObject) user).id));
            arrayList2.add(x8hVar);
        }
        Pagination pagination = envelope.pagination;
        return new xaj0(pagination.links, arrayList2, Integer.valueOf(pagination.total));
    }

    /* JADX INFO: renamed from: kb */
    public final /* synthetic */ MomentMessage m16673kb(Envelope envelope) {
        m16731sd(envelope);
        return ((FeedData) envelope.getModuleData(FeedData.class)).comments.get(0);
    }

    /* JADX INFO: renamed from: kc */
    public c<roj0> m16674kc(String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("type", OperationType.newUserAIMoment);
            jSONObject.put("momentId", str);
        } catch (JSONException e) {
            CrashHelper.c(e);
        }
        final String string = jSONObject.toString();
        return scheduled("newUserAIMomentAward", -1, new v9j() { // from class: l.eea
            public final Object call() {
                return this.f7335a.m16623da(string);
            }
        }, false);
    }

    /* JADX INFO: renamed from: kd */
    public c<roj0> m16675kd(final String str, String str2) {
        return m16569Vb("moment/topics/next/" + str, str, str2).map(new w9j() { // from class: l.g9a
            public final Object call(Object obj) {
                return this.f8396a.m16694nb(str, (j760) obj);
            }
        });
    }

    /* JADX INFO: renamed from: l7 */
    public c<Followship> m16676l7(final String str, final User user) {
        final Followship followship = new Followship();
        followship.state = FollowshipStatus.get(FollowshipStatus.following);
        followship.userTime = qib0.H.guessedCurrentServerTime();
        return scheduled("followingToChat", -1, new v9j() { // from class: l.hfa
            public final Object call() {
                return this.f8689a.m16580X8(str, user, followship);
            }
        });
    }

    /* JADX INFO: renamed from: l8 */
    public final boolean m16677l8() {
        return kjb0.m11467s();
    }

    /* JADX INFO: renamed from: l9 */
    public final /* synthetic */ j760 m16678l9(Envelope envelope) {
        m16731sd(envelope);
        ijb0.m10908S(envelope);
        FeedData feedData = (FeedData) envelope.getModuleData(FeedData.class);
        return new j760(vwb.J(feedData.literatures) ? null : feedData.literatures.get(0), vwb.J(feedData.literaturesComments) ? null : feedData.literaturesComments.get(0));
    }

    /* JADX INFO: renamed from: la */
    public final /* synthetic */ c m16679la(final String str) {
        return new la20(new v9j() { // from class: l.h8a
            public final Object call() {
                return omg.f11509G.auth().q(str).f().b();
            }
        }).compose(omg.m12710n0()).map(new w9j() { // from class: l.i8a
            public final Object call(Object obj) {
                return this.f8957a.m16672ka((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: lb */
    public final /* synthetic */ c m16680lb(MomentMessage momentMessage, final String str, final String str2) {
        final MomentMessage momentMessageM19632clone = momentMessage.m19632clone();
        return new la20(new v9j() { // from class: l.pda
            public final Object call() {
                return omg.f11509G.auth().q(omg.m12700i0(str, str2, null)).l(utc0.create(Network.JSON, momentMessageM19632clone.toJson())).b();
            }
        }).compose(omg.m12710n0()).map(new w9j() { // from class: l.qda
            public final Object call(Object obj) {
                return this.f12208a.m16673kb((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: lc */
    public void m16681lc(BubbleInfo bubbleInfo) {
        Map map = (Map) this.f14983i1.e();
        map.put(((DbObject) FeedModule.m1140H().me_()).id, bubbleInfo);
        this.f14983i1.onNext(map);
    }

    /* JADX INFO: renamed from: ld */
    public c<roj0> m16682ld(final String str) {
        return m16569Vb("moment/topics/prev/" + str, str, "limit=20").map(new w9j() { // from class: l.gfa
            public final Object call(Object obj) {
                return this.f8439a.m16701ob(str, (j760) obj);
            }
        });
    }

    /* JADX INFO: renamed from: m7 */
    public c<Followship> m16683m7(String str, User user, boolean z, String str2) {
        return m16690n7(str, user, z, null, null, str2);
    }

    /* JADX INFO: renamed from: m8 */
    public final void m16684m8(Envelope envelope, String str, String str2) {
        if (((CommonData) envelope.getModuleData(CommonData.class)).users == null || ((CommonData) envelope.getModuleData(CommonData.class)).users.size() == 0) {
            MomentUserNullException.reportNulAlllUserMoment(str, str2);
            return;
        }
        if (!NullChecker.a(((FeedData) envelope.getModuleData(FeedData.class)).moments) || ((FeedData) envelope.getModuleData(FeedData.class)).moments.size() <= 0) {
            return;
        }
        for (int i = 0; i < ((FeedData) envelope.getModuleData(FeedData.class)).moments.size(); i++) {
            Moment moment = ((FeedData) envelope.getModuleData(FeedData.class)).moments.get(i);
            if (m16628e8(moment.owner) == null) {
                String str3 = ((DbObject) moment).id;
                if ("1".equals(str3.substring(str3.length() - 1))) {
                    MomentUserNullException.reportNullUserMoment(((DbObject) moment).id, str, str2);
                }
            }
        }
    }

    /* JADX INFO: renamed from: m9 */
    public final /* synthetic */ c m16685m9(final String str) {
        return ia20.a(new v9j() { // from class: l.jea
            public final Object call() {
                return omg.f11509G.auth().q(omg.m12703k(str)).f().b();
            }
        }).map(new w9j() { // from class: l.lea
            public final Object call(Object obj) {
                return this.f10016a.m16678l9((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: ma */
    public final /* synthetic */ Envelope m16686ma(Envelope envelope) {
        m16731sd(envelope);
        return envelope;
    }

    /* JADX INFO: renamed from: mb */
    public final /* synthetic */ c m16687mb(final String str, final String str2, final MomentMessage momentMessage) {
        return scheduled("postTheTopicComment", -1, new v9j() { // from class: l.oca
            public final Object call() {
                return this.f11421a.m16680lb(momentMessage, str, str2);
            }
        });
    }

    /* JADX INFO: renamed from: mc */
    public c<xaj0<List<TopicOperations>, List<TopicMoment>, List<Moment>>> m16688mc(String str) {
        return m16695nc(str, "");
    }

    /* JADX INFO: renamed from: md */
    public c<xaj0<Links, List<Moment>, List<TopicMoment>>> m16689md(final String str, String str2, final an00 an00Var) {
        return scheduled(str2, 0, new v9j() { // from class: l.c9a
            public final Object call() {
                return this.f6573a.m16715qb(str, an00Var);
            }
        });
    }

    /* JADX INFO: renamed from: n7 */
    public c<Followship> m16690n7(String str, User user, boolean z, String str2, String str3, @Nullable String str4) {
        JSONObject jSONObject = new JSONObject();
        try {
            if (!TextUtils.isEmpty(str4)) {
                jSONObject.put("page_id", str4);
            }
        } catch (Exception e) {
            CrashHelper.c(e);
        }
        return m16648h7(str, user, z, str2, str3, "pagesource=" + jSONObject.toString());
    }

    /* JADX INFO: renamed from: n8 */
    public final /* synthetic */ List m16691n8(Envelope envelope) {
        ijb0.m10907R(envelope.counters);
        m16731sd(envelope);
        ijb0.m10908S(envelope);
        List<Group> list = ((FeedData) envelope.getModuleData(FeedData.class)).groups;
        ArrayList arrayList = new ArrayList();
        for (Group group : list) {
            if (TEnum.equals(group.groupType, "group")) {
                arrayList.add(group);
            }
            if (nkg.m12217O() && TEnum.equals(group.groupType, GroupType.anonymous_group)) {
                arrayList.add(group);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: n9 */
    public final /* synthetic */ Envelope m16692n9(Envelope envelope) {
        m16731sd(envelope);
        List<BubbleInfo> list = ((FeedData) envelope.data.getModuleData(FeedData.class)).states;
        Map map = (Map) this.f14983i1.e();
        if (list.size() <= 0) {
            this.f14983i1.onNext(map);
            return envelope;
        }
        map.put(((DbObject) FeedModule.m1140H().me_()).id, list.get(0));
        this.f14983i1.onNext(map);
        return envelope;
    }

    /* JADX INFO: renamed from: na */
    public final /* synthetic */ c m16693na(final String str) {
        return new la20(new v9j() { // from class: l.o9a
            public final Object call() {
                return omg.f11509G.auth().q(str).f().b();
            }
        }).compose(omg.m12710n0()).map(new w9j() { // from class: l.p9a
            public final Object call(Object obj) {
                return this.f11738a.m16686ma((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: nb */
    public final /* synthetic */ roj0 m16694nb(String str, j760 j760Var) {
        j760 j760Var2 = str.equals("suggest") ? (j760) this.f14975e1.e() : (j760) this.f14969b1.e();
        final List arrayList = j760Var2 == null ? new ArrayList() : (List) j760Var2.b;
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        arrayList.addAll(vwb.n((Collection) j760Var.b, new w9j() { // from class: l.qca
            public final Object call(Object obj) {
                return Boolean.valueOf(!arrayList.contains((TopicMoment) obj));
            }
        }));
        if (str.equals("suggest")) {
            this.f14975e1.onNext(new j760((Links) j760Var.a, arrayList));
        } else {
            this.f14969b1.onNext(new j760((Links) j760Var.a, arrayList));
        }
        return roj0.a;
    }

    /* JADX INFO: renamed from: nc */
    public c<xaj0<List<TopicOperations>, List<TopicMoment>, List<Moment>>> m16695nc(final String str, final String str2) {
        return scheduled("operationGuides/search" + str, 0, new v9j() { // from class: l.vga
            public final Object call() {
                return this.f14166a.m16637fa(str, str2);
            }
        });
    }

    /* JADX INFO: renamed from: nd */
    public c<j760<Links, List<MomentMessage>>> m16696nd(final String str, final String str2, final Links links) {
        return scheduled("topic_vote_comment_next", 0, new v9j() { // from class: l.wga
            public final Object call() {
                return this.f14539a.m16729sb(str, str2, links);
            }
        });
    }

    /* JADX INFO: renamed from: o7 */
    public c<j760<Links, List<Moment>>> m16697o7(Links links, an00 an00Var) {
        String string;
        String str;
        if (TextUtils.isEmpty(FriendsFeedViewPagerFrag.f2954F0) || !nkg.m12205D()) {
            string = null;
        } else {
            string = FriendsFeedViewPagerFrag.f2954F0;
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("gender", FriendsFeedViewPagerFrag.f2954F0);
                string = jSONObject.toString();
            } catch (JSONException e) {
                CrashHelper.c(e);
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append(omg.m12684a0(links.next));
        if (TextUtils.isEmpty(string)) {
            str = "";
        } else {
            str = "&settings=" + string;
        }
        sb.append(str);
        return m16590Yb(sb.toString(), "friends/next", an00Var);
    }

    /* JADX INFO: renamed from: o8 */
    public final /* synthetic */ c m16698o8(final String str) {
        return new la20(new v9j() { // from class: l.kia
            public final Object call() {
                return omg.f11509G.auth().q(str).f().b();
            }
        }).compose(omg.m12710n0()).map(new w9j() { // from class: l.mia
            public final Object call(Object obj) {
                return this.f10474a.m16691n8((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: o9 */
    public final /* synthetic */ c m16699o9(final String str) {
        return ia20.a(new v9j() { // from class: l.y9a
            public final Object call() {
                return omg.f11509G.auth().q(str).f().b();
            }
        }).map(new w9j() { // from class: l.z9a
            public final Object call(Object obj) {
                return this.f15667a.m16692n9((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: oa */
    public final /* synthetic */ void m16700oa(Moment moment) {
        m16449Ea(moment);
        this.f14992n0.onNext(moment);
    }

    /* JADX INFO: renamed from: ob */
    public final /* synthetic */ roj0 m16701ob(String str, j760 j760Var) {
        if (NullChecker.b(j760Var.b)) {
            if (str.equals("nearby") || str.equals("recommend")) {
                this.f14973d1.onNext(j760Var);
            } else if (str.equals("suggest")) {
                this.f14975e1.onNext(j760Var);
            } else {
                this.f14969b1.onNext(j760Var);
                m16500Lc((List) j760Var.b);
            }
        }
        return roj0.a;
    }

    /* JADX INFO: renamed from: oc */
    public c<Envelope> m16702oc() {
        return scheduled("feed-counters", -1, new v9j() { // from class: l.hca
            public final Object call() {
                return ia20.a(new v9j() { // from class: l.vha
                    public final Object call() {
                        return omg.f11509G.auth().q(omg.m12720t("/feed-counters")).k(utc0.create(Network.JSON, "{\"unreadLikeFeeds\": 0}")).b();
                    }
                }).map(new w9j() { // from class: l.wha
                    public final Object call(Object obj) {
                        return xia.m16284f1((Envelope) obj);
                    }
                });
            }
        }, false);
    }

    /* JADX INFO: renamed from: od */
    public c<xaj0<Links, List<TopicMoment>, List<MomentMessage>>> m16703od(final String str, final String str2) {
        return scheduled("topic_vote_comment_pre", 0, new v9j() { // from class: l.zda
            public final Object call() {
                return this.f15694a.m16743ub(str, str2);
            }
        });
    }

    /* JADX INFO: renamed from: p7 */
    public c<j760<Links, List<Moment>>> m16704p7(an00 an00Var) {
        String string;
        String str;
        if (TextUtils.isEmpty(FriendsFeedViewPagerFrag.f2954F0) || !nkg.m12205D()) {
            string = null;
        } else {
            string = FriendsFeedViewPagerFrag.f2954F0;
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("gender", string);
                string = jSONObject.toString();
            } catch (JSONException e) {
                CrashHelper.c(e);
            }
        }
        String str2 = "";
        if (FeedModule.m1140H().Md()) {
            String strQp = FeedModule.m1140H().qp();
            if (TextUtils.isEmpty(strQp)) {
                str = "";
            } else {
                str = "&query=" + strQp;
            }
            FeedModule.m1140H().B6();
        } else {
            str = "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(omg.m12684a0("limit=20"));
        if (!TextUtils.isEmpty(string)) {
            str2 = "&settings=" + string;
        }
        sb.append(str2);
        sb.append(str);
        return m16604ac(sb.toString(), "friends/previous", false, null, an00Var);
    }

    /* JADX INFO: renamed from: p8 */
    public final /* synthetic */ roj0 m16705p8(MomentMessage momentMessage, Envelope envelope) {
        Moment moment = this.f14982i0.get(momentMessage.moment);
        PartialIdList partialIdList = moment.messages;
        partialIdList.count--;
        partialIdList.ids.remove(((CopyObject) momentMessage).id);
        this.f14982i0.put(momentMessage.moment, moment);
        f14907L1 = vwb.Y(momentMessage.moment, 2);
        this.f14988l0.onNext(this.f14982i0);
        this.f14934K0.onNext(momentMessage);
        ijb0.m10908S(envelope);
        return roj0.a;
    }

    /* JADX INFO: renamed from: p9 */
    public final /* synthetic */ roj0 m16706p9(Envelope envelope) {
        ijb0.m10907R(envelope.counters);
        m16731sd(envelope);
        ijb0.m10908S(envelope);
        return roj0.a;
    }

    /* JADX INFO: renamed from: pa */
    public final /* synthetic */ void m16707pa(Moment moment) {
        m16449Ea(moment);
        this.f14988l0.onNext(this.f14982i0);
    }

    /* JADX INFO: renamed from: pb */
    public final /* synthetic */ xaj0 m16708pb(an00 an00Var, Envelope envelope) {
        if (NullChecker.a(an00Var)) {
            an00Var.mo6843c(envelope);
        }
        List<RawFeed> list = ((FeedData) envelope.getModuleData(FeedData.class)).feeds;
        List<BubbleInfo> list2 = ((FeedData) envelope.getModuleData(FeedData.class)).states;
        if (nkg.m12248k0() && NullChecker.a(list) && !vwb.J(list2)) {
            for (int i = 0; i < list.size(); i++) {
                list.get(i).states.addAll(list2);
            }
        }
        m16731sd(envelope);
        ijb0.m10908S(envelope);
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(m16529Q6(envelope, false));
        return new xaj0(envelope.pagination.links, arrayList, ((FeedData) envelope.getModuleData(FeedData.class)).momentTopics);
    }

    /* JADX INFO: renamed from: pc */
    public c<Envelope> m16709pc(String str) {
        return m16716qc(vwb.f0(new String[]{str}));
    }

    /* JADX INFO: renamed from: pd */
    public c<roj0> m16710pd() {
        return scheduled("un/read/fans/patch", -1, new v9j() { // from class: l.pha
            public final Object call() {
                return new la20(new v9j() { // from class: l.pga
                    public final Object call() {
                        return omg.f11509G.auth().q(omg.m12699i() + "&method=patch").l(utc0.create(Network.JSON, "{\"read\": true}")).b();
                    }
                }).compose(omg.m12710n0()).map(new w9j() { // from class: l.qga
                    public final Object call(Object obj) {
                        return xia.m16401x5((Envelope) obj);
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: q7 */
    public c<List<Group>> m16711q7(String str, int i) {
        return m16422B6(omg.m12677U(str, i), "get/all/group" + str + i);
    }

    /* JADX INFO: renamed from: q8 */
    public final /* synthetic */ c m16712q8(final MomentMessage momentMessage) {
        final MomentMessage momentMessage2 = new MomentMessage();
        momentMessage2.recalled = Boolean.TRUE;
        return new la20(new v9j() { // from class: l.bfa
            public final Object call() {
                MomentMessage momentMessage3 = momentMessage;
                return omg.f11509G.auth().q(omg.m12721u(momentMessage3.cid, ((CopyObject) momentMessage3).id) + "&method=patch").l(utc0.create(Network.JSON, momentMessage2.toJson())).b();
            }
        }, 0).compose(omg.m12710n0()).map(new w9j() { // from class: l.cfa
            public final Object call(Object obj) {
                return this.f6618a.m16705p8(momentMessage, (Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: q9 */
    public final /* synthetic */ c m16713q9(final String str) {
        return new la20(new v9j() { // from class: l.lca
            public final Object call() {
                return omg.f11509G.auth().q(str).f().b();
            }
        }).compose(omg.m12710n0()).map(new w9j() { // from class: l.mca
            public final Object call(Object obj) {
                return this.f10426a.m16706p9((Envelope) obj);
            }
        });
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.p1.mobile.putong.util.TrackMediaUploadUtil$GetVideoFrameException */
    /* JADX INFO: renamed from: qa */
    public final /* synthetic */ Moment m16714qa(final Moment moment, boolean z) throws Exception {
        Picture picture;
        if (!TextUtils.isEmpty(((DbObject) moment).id)) {
            final Moment momentM19592clone = moment.m19592clone();
            momentM19592clone.localCreatedSession = ((Integer) App.i.get()).intValue();
            f8c.m10082o().m10085B(new d30() { // from class: l.kba
                public final void call() {
                    FeedModule.f321i.f6464c.updateBy_id(momentM19592clone);
                }
            });
            e51.M(new Runnable() { // from class: l.mba
                @Override // java.lang.Runnable
                public final void run() {
                    this.f10411a.m16707pa(momentM19592clone);
                }
            });
            return momentM19592clone;
        }
        moment.createdTime = omg.m12717r0();
        moment.owner = FeedModule.m1139F().userId();
        if (moment.value == null) {
            moment.value = "";
        }
        moment.likes = PartialIdList.new_();
        ((DbObject) moment).id = DbObject.GENERATE_UNIQUE_FAKE_ID(((Integer) App.i.get()).intValue());
        if (TEnum.equals(moment.userSetVisibility, "unknown_")) {
            moment.userSetVisibility = UserSetVisibility.get(el00.m9903k().m9912p(moment));
        }
        if (NullChecker.b(moment.media)) {
            for (Media media : moment.media) {
                TrackMediaUploadUtil.a0(media);
                if (TEnum.equals(media.status, MediaLocalStatus.raw)) {
                    if (media instanceof Picture) {
                        Picture picture2 = (Picture) media;
                        if (picture2.size == null || media.mediaType == null) {
                            pgm pgmVar = new pgm(rhi.z(media.url));
                            picture2.size = new Dimension(pgmVar.d);
                            media.mediaType = pgmVar.c;
                        }
                    } else if (media instanceof Video) {
                        Video video = (Video) media;
                        r5l0 r5l0Var = new r5l0(rhi.z(video.url));
                        if (!r5l0Var.g && video.isFromNewCamera) {
                            video.hasOriginalSound = false;
                        }
                        if (video.size == null || (picture = video.cover) == null || picture.size == null || video.mediaType == null || picture.mediaType == null) {
                            s5l0 s5l0Var = new s5l0(r5l0Var, false, false);
                            video.mediaType = "video/mp4";
                            video.size = new Dimension(s5l0Var.m());
                            video.duration = s5l0Var.b;
                            Picture picture3 = video.cover;
                            if (picture3 == null || picture3.url == null) {
                                video.processStartTime = SystemClock.uptimeMillis();
                                video.cover = new Picture();
                                try {
                                    boolean zA = NullChecker.a(video.cutting);
                                    Picture picture4 = video.cover;
                                    if (zA) {
                                        picture4.url = rhi.B(s5l0Var.e((int) video.cutting.start));
                                    } else {
                                        picture4.url = rhi.B(s5l0Var.c(0));
                                    }
                                    video.cover.size = new Dimension(s5l0Var.k());
                                    video.cover.mediaType = "image/jpeg";
                                    qib0.G.x0(video.url);
                                } catch (Exception e) {
                                    CrashHelper.c(e);
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
        m16783zd(z, 1, moment);
        f8c.m10082o().m10085B(new d30() { // from class: l.iba
            public final void call() {
                xia.m16118D3(moment);
            }
        });
        e51.M(new Runnable() { // from class: l.jba
            @Override // java.lang.Runnable
            public final void run() {
                this.f9302a.m16700oa(moment);
            }
        });
        return moment;
    }

    /* JADX INFO: renamed from: qb */
    public final /* synthetic */ c m16715qb(final String str, final an00 an00Var) {
        return new la20(new v9j() { // from class: l.gda
            public final Object call() {
                return omg.f11509G.auth().q(str).f().b();
            }
        }, omg.f11506D | omg.f11507E).compose(omg.m12710n0()).map(new w9j() { // from class: l.hda
            public final Object call(Object obj) {
                return this.f8673a.m16708pb(an00Var, (Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: qc */
    public final c<Envelope> m16716qc(final List<String> list) {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONArray jSONArray = new JSONArray();
            for (int i = 0; i < list.size(); i++) {
                jSONArray.put(list.get(i));
            }
            jSONObject.put("momentIds", jSONArray);
        } catch (JSONException e) {
            CrashHelper.c(e);
        }
        final String string = jSONObject.toString();
        return scheduled("view-record", -1, new v9j() { // from class: l.eha
            public final Object call() {
                return this.f7372a.m16651ha(string, list);
            }
        }, false);
    }

    /* JADX INFO: renamed from: qd */
    public c<roj0> m16717qd(String str, String str2, String str3, String str4) {
        final JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("sourceId", str);
            jSONObject.put("sourceOwnerId", str2);
            jSONObject.put("sourceType", str4);
            jSONObject.put(OMSTemplateModeType.page, str3);
        } catch (JSONException e) {
            CrashHelper.c(e);
        }
        final String strM12703k = omg.m12703k("/moment-feedback");
        return FeedModule.f316d.scheduled("uninterested/moment", -1, new v9j() { // from class: l.rea
            public final Object call() {
                return this.f12625a.m16757wb(jSONObject, strM12703k);
            }
        });
    }

    /* JADX INFO: renamed from: r7 */
    public c<j760<Links, List<User>>> m16718r7(String str, String str2, int i, String str3) {
        final String str4 = "/users/" + str + "/moments/" + str2 + "/likes?search=attitude&query=" + i + "&" + str3;
        return scheduled(str4, 0, new v9j() { // from class: l.tfa
            public final Object call() {
                return this.f13274a.m16594Z8(str4);
            }
        }, false);
    }

    /* JADX INFO: renamed from: r8 */
    public final /* synthetic */ xaj0 m16719r8(Envelope envelope) {
        m16738td(envelope, false);
        ijb0.m10908S(envelope);
        FeedData feedData = (FeedData) envelope.getModuleData(FeedData.class);
        return new xaj0(envelope.pagination.links, feedData.messages, feedData.stickers);
    }

    /* JADX INFO: renamed from: r9 */
    public final /* synthetic */ Envelope m16720r9(Envelope envelope) {
        m16731sd(envelope);
        ijb0.m10908S(envelope);
        return envelope;
    }

    /* JADX INFO: renamed from: ra */
    public final /* synthetic */ c m16721ra(final Moment moment, final boolean z) {
        return c.fromCallable(new Callable() { // from class: l.y8a
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f15295a.m16714qa(moment, z);
            }
        });
    }

    /* JADX INFO: renamed from: rb */
    public final /* synthetic */ j760 m16722rb(Envelope envelope) {
        m16731sd(envelope);
        FeedData feedData = (FeedData) envelope.getModuleData(FeedData.class);
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(feedData.comments);
        return new j760(envelope.pagination.links, arrayList);
    }

    /* JADX INFO: renamed from: rc */
    public c<j760<Links, List<Moment>>> m16723rc(String str, boolean z, String str2) {
        return m16597Zb(omg.m12674R(str, omg.f11535z, z, str2), m16544S7(str, str2), true, str);
    }

    /* JADX INFO: renamed from: rd */
    public void m16724rd(String str) {
        Moment moment = this.f14982i0.get(str);
        if (!NullChecker.a(moment) || TEnum.equals(moment.userSetVisibility, "selfOnly")) {
            return;
        }
        moment.userSetVisibility = UserSetVisibility.get("selfOnly");
        this.f14982i0.put(((DbObject) moment).id, moment);
        this.f14988l0.onNext(this.f14982i0);
    }

    /* JADX INFO: renamed from: s7 */
    public c<xaj0<Links, List<User>, AttitudeSourceCatCount>> m16725s7(String str, String str2, int i) {
        final String str3 = "/users/" + str + "/moments/" + str2 + "/likes?search=attitude&query=" + i + "&limit=50";
        return scheduled(str3, 0, new v9j() { // from class: l.wfa
            public final Object call() {
                return this.f14532a.m16608b9(str3);
            }
        }, false);
    }

    /* JADX INFO: renamed from: s8 */
    public final /* synthetic */ c m16726s8(final String str, final String str2, final Links links) {
        return new la20(new v9j() { // from class: l.bca
            public final Object call() {
                return omg.f11509G.auth().q(omg.m12658B(str, str2, links.next)).f().b();
            }
        }, omg.f11506D).compose(omg.m12710n0()).map(new w9j() { // from class: l.cca
            public final Object call(Object obj) {
                return this.f6608a.m16719r8((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: s9 */
    public final /* synthetic */ c m16727s9(final String str) {
        return new la20(new v9j() { // from class: l.u6a
            public final Object call() {
                return omg.f11509G.auth().q(str).f().b();
            }
        }, omg.f11506D | omg.f11507E).compose(omg.m12710n0()).map(new w9j() { // from class: l.v6a
            public final Object call(Object obj) {
                return this.f14077a.m16720r9((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: sa */
    public final /* synthetic */ void m16728sa(Moment moment, List list) {
        Moment momentM19592clone = moment.m19592clone();
        momentM19592clone.media = new ArrayList(list);
        m16449Ea(momentM19592clone);
        this.f14988l0.onNext(this.f14982i0);
    }

    /* JADX INFO: renamed from: sb */
    public final /* synthetic */ c m16729sb(final String str, final String str2, final Links links) {
        return new la20(new v9j() { // from class: l.xha
            public final Object call() {
                return omg.f11509G.auth().q(omg.m12702j0(str, str2, links.next)).f().b();
            }
        }).compose(omg.m12710n0()).map(new w9j() { // from class: l.yha
            public final Object call(Object obj) {
                return this.f15430a.m16722rb((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: sc */
    public c<j760<Links, List<Moment>>> m16730sc(String str, Links links, boolean z, an00 an00Var) {
        return m16590Yb(omg.m12672P(str, links.next, z), str + "/personal/feed/next", an00Var);
    }

    /* JADX INFO: renamed from: sd */
    public void m16731sd(Envelope envelope) {
        m16738td(envelope, true);
    }

    /* JADX INFO: renamed from: t7 */
    public a<TopicOperations> m16732t7() {
        return this.f14977f1;
    }

    /* JADX INFO: renamed from: t8 */
    public final /* synthetic */ MomentMessage m16733t8(MomentMessage momentMessage, String str) throws Exception {
        momentMessage.owner = FeedModule.m1139F().userId();
        momentMessage.createdTime = omg.m12717r0() + 10000.0d;
        if (TextUtils.isEmpty(momentMessage.api_only_otherUser)) {
            momentMessage.cid = str;
        } else {
            momentMessage.cid = momentMessage.api_only_otherUser;
        }
        tpd0 tpd0Var = App.i;
        ((CopyObject) momentMessage).id = DbObject.GENERATE_UNIQUE_FAKE_ID(((Integer) tpd0Var.get()).intValue());
        if (momentMessage.value == null) {
            momentMessage.value = "";
        }
        momentMessage.localCreatedSession = ((Integer) tpd0Var.get()).intValue();
        this.f14925H0.put(((CopyObject) momentMessage).id, momentMessage);
        Moment momentM13962x0 = this.f14982i0.get(momentMessage.moment);
        if (momentM13962x0 == null && FeedModule.f320h.m13958t0(Moments.TYPE, momentMessage.moment)) {
            momentM13962x0 = FeedModule.f320h.m13962x0(momentMessage.moment);
        }
        PartialIdList partialIdList = momentM13962x0.messages;
        partialIdList.count++;
        partialIdList.ids.add(((CopyObject) momentMessage).id);
        this.f14982i0.put(momentMessage.moment, momentM13962x0);
        f14907L1 = vwb.Y(momentMessage.moment, 1);
        this.f14988l0.onNext(this.f14982i0);
        this.f14931J0.onNext(momentMessage);
        return momentMessage;
    }

    /* JADX INFO: renamed from: t9 */
    public final /* synthetic */ j760 m16734t9(Envelope envelope) {
        m16731sd(envelope);
        if (!NullChecker.a(envelope.getModuleData(FeedData.class)) || vwb.J(((FeedData) envelope.getModuleData(FeedData.class)).moments) || vwb.J(((FeedData) envelope.getModuleData(FeedData.class)).feeds)) {
            return null;
        }
        ArrayList arrayList = new ArrayList(((FeedData) envelope.getModuleData(FeedData.class)).moments);
        ArrayList arrayList2 = new ArrayList(((FeedData) envelope.getModuleData(FeedData.class)).feeds);
        if (NullChecker.a(envelope.getModuleData(CommonData.class)) && !vwb.J(((CommonData) envelope.getModuleData(CommonData.class)).users)) {
            ArrayList arrayList3 = new ArrayList(((CommonData) envelope.getModuleData(CommonData.class)).users);
            if (!vwb.J(arrayList3)) {
                Iterator it = arrayList3.iterator();
                while (it.hasNext()) {
                    m16421Ad((User) it.next());
                }
            }
        }
        return new j760(arrayList, arrayList2);
    }

    /* JADX INFO: renamed from: ta */
    public final /* synthetic */ Boolean m16735ta(String str, List list) {
        return Boolean.valueOf(m16121Db(str));
    }

    /* JADX INFO: renamed from: tb */
    public final /* synthetic */ xaj0 m16736tb(Envelope envelope) {
        m16731sd(envelope);
        FeedData feedData = (FeedData) envelope.getModuleData(FeedData.class);
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(((FeedData) envelope.getModuleData(FeedData.class)).momentTopics);
        ArrayList arrayList2 = new ArrayList();
        arrayList2.addAll(feedData.comments);
        return new xaj0(envelope.pagination.links, arrayList, arrayList2);
    }

    /* JADX INFO: renamed from: tc */
    public c<j760<Links, List<Moment>>> m16737tc(String str, Links links, String str2) {
        return m16583Xb(omg.m12673Q(str, links.next, str2), str + "/personal/feed/next" + System.currentTimeMillis());
    }

    /* JADX INFO: renamed from: td */
    public void m16738td(Envelope envelope, boolean z) {
        boolean z2;
        boolean z3;
        Map<String, List<PostBasePopWindow>> map;
        FeedData feedData = (FeedData) envelope.getModuleData(FeedData.class);
        List<RawFeed> list = feedData.feeds;
        if (!vwb.J(list)) {
            for (RawFeed rawFeed : list) {
                if (NullChecker.a(rawFeed.extra) && NullChecker.a(rawFeed.extra.report)) {
                    this.f14921F1.put(rawFeed.f704id, rawFeed.extra.report);
                }
            }
        }
        if (!NullChecker.b(((FeedData) envelope.getModuleData(FeedData.class)).moments) || ((FeedData) envelope.getModuleData(FeedData.class)).moments.size() <= 0) {
            z2 = false;
        } else {
            z2 = false;
            for (int i = 0; i < ((FeedData) envelope.getModuleData(FeedData.class)).moments.size(); i++) {
                Moment moment = ((FeedData) envelope.getModuleData(FeedData.class)).moments.get(i);
                Moment moment2 = this.f14982i0.get(((DbObject) moment).id);
                if (moment2 != null) {
                    if (moment.views <= 0 && NullChecker.a(moment2)) {
                        moment.views = moment2.views;
                    }
                    if (moment.getRecommendTime() == 0.0d && NullChecker.a(moment2) && moment2.getRecommendTime() != 0.0d) {
                        moment.setRecommendTime(moment2.getRecommendTime());
                    }
                    if (NullChecker.a(moment2.thirdShareSource) && !TextUtils.isEmpty(moment2.thirdShareSource.sourceId)) {
                        moment.thirdShareSource = moment2.thirdShareSource;
                    }
                    MomentViewerBox momentViewerBoxM19655clone = moment.momentViewer.m19656clone();
                    moment.mergeData(moment2, moment2.momentValue);
                    moment.momentViewer = momentViewerBoxM19655clone;
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
                this.f14982i0.put(((DbObject) moment).id, moment);
                if (FeedModule.f320h.m13958t0(Moments.TYPE, ((DbObject) moment).id)) {
                    FeedModule.f320h.m13955A0(moment);
                }
            }
        }
        if (NullChecker.b(feedData.messages) && feedData.messages.size() > 0) {
            for (int i2 = 0; i2 < feedData.messages.size(); i2++) {
                MomentMessage momentMessage = feedData.messages.get(i2);
                MomentMessage momentMessage2 = this.f14925H0.get(((CopyObject) momentMessage).id);
                if (momentMessage2 != null) {
                    momentMessage.mergeData(momentMessage2);
                }
                this.f14925H0.put(((CopyObject) momentMessage).id, momentMessage);
            }
        }
        if (NullChecker.b(feedData.stickers) && feedData.stickers.size() > 0) {
            for (int i3 = 0; i3 < feedData.stickers.size(); i3++) {
                StickerInfo stickerInfo = feedData.stickers.get(i3);
                StickerInfo stickerInfo2 = this.f14928I0.get(((DbObject) stickerInfo).id);
                if (stickerInfo2 != null) {
                    stickerInfo.mergeData(stickerInfo2);
                }
                this.f14928I0.put(((DbObject) stickerInfo).id, stickerInfo);
            }
        }
        if (NullChecker.a(feedData.groups) && feedData.groups.size() > 0) {
            for (int i4 = 0; i4 < feedData.groups.size(); i4++) {
                Group group = feedData.groups.get(i4);
                Group group2 = this.f14937L0.get(((DbObject) group).id);
                if (group2 != null) {
                    group.mergeData(group2);
                }
                this.f14937L0.put(((DbObject) group).id, group);
            }
        }
        if (!vwb.J(feedData.notifyUsers)) {
            this.f14986k0.clear();
            for (int i5 = 0; i5 < feedData.notifyUsers.size(); i5++) {
                NotifyUsers notifyUsers = feedData.notifyUsers.get(i5);
                this.f14986k0.add(notifyUsers);
                NotifyUsers notifyUsers2 = this.f14984j0.get(notifyUsers.userId);
                if (notifyUsers2 != null) {
                    notifyUsers.mergeData(notifyUsers2);
                }
                this.f14984j0.put(notifyUsers.userId, notifyUsers);
            }
        }
        if (NullChecker.a(feedData.states) && feedData.states.size() > 0) {
            for (int i6 = 0; i6 < feedData.states.size(); i6++) {
                BubbleInfo bubbleInfo = feedData.states.get(i6);
                BubbleInfo bubbleInfo2 = this.f14939M0.get(bubbleInfo.owner.f264id);
                if (bubbleInfo2 != null) {
                    bubbleInfo.mergeData(bubbleInfo2);
                }
                this.f14939M0.put(bubbleInfo.owner.f264id, bubbleInfo);
            }
        }
        if (!NullChecker.b(((CommonData) envelope.getModuleData(CommonData.class)).users) || ((CommonData) envelope.getModuleData(CommonData.class)).users.size() <= 0) {
            z3 = false;
        } else {
            z3 = false;
            for (int i7 = 0; i7 < ((CommonData) envelope.getModuleData(CommonData.class)).users.size(); i7++) {
                User user = ((CommonData) envelope.getModuleData(CommonData.class)).users.get(i7);
                Map<String, User> map2 = this.f14910A0;
                if (z) {
                    User user2 = map2.get(((DbObject) user).id);
                    if (user2 != null) {
                        if (user.localFollowship == null && NullChecker.a(user2)) {
                            user.localFollowship = this.f14910A0.get(((DbObject) user).id).localFollowship;
                        }
                        if (user.localRelationship == null && NullChecker.a(this.f14910A0.get(((DbObject) user).id))) {
                            user.localRelationship = this.f14910A0.get(((DbObject) user).id).localRelationship;
                        }
                        if (NullChecker.a(this.f14910A0.get(((DbObject) user).id))) {
                            user.mergeData(this.f14910A0.get(((DbObject) user).id));
                        }
                        if (!user.equals(this.f14910A0.get(((DbObject) user).id))) {
                            z3 = true;
                        }
                    }
                    this.f14910A0.put(((DbObject) user).id, user);
                } else if (!map2.containsKey(((DbObject) user).id)) {
                    this.f14910A0.put(((DbObject) user).id, user);
                }
            }
        }
        if (NullChecker.b(((FeedData) envelope.getModuleData(FeedData.class)).momentVoiceLiveInfos) && ((FeedData) envelope.getModuleData(FeedData.class)).momentVoiceLiveInfos.size() > 0) {
            for (int i8 = 0; i8 < ((FeedData) envelope.getModuleData(FeedData.class)).momentVoiceLiveInfos.size(); i8++) {
                MomentVoiceLiveInfos momentVoiceLiveInfos = ((FeedData) envelope.getModuleData(FeedData.class)).momentVoiceLiveInfos.get(i8);
                MomentVoiceLiveInfos momentVoiceLiveInfos2 = this.f14980h0.get(momentVoiceLiveInfos.roomID);
                if (momentVoiceLiveInfos2 != null) {
                    momentVoiceLiveInfos.mergeData(momentVoiceLiveInfos2);
                }
                this.f14980h0.put(momentVoiceLiveInfos.roomID, momentVoiceLiveInfos);
            }
        }
        if (!vwb.J(((FeedData) envelope.getModuleData(FeedData.class)).momentPopWindows)) {
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
                    map = this.f14978g0;
                    if (i11 < size) {
                        arrayList2 = map.get(str2);
                        if (arrayList2 == null) {
                            arrayList2 = new ArrayList<>();
                        }
                        final PostBasePopWindow postBasePopWindow = list2.get(i11);
                        PostBasePopWindow postBasePopWindow2 = (PostBasePopWindow) vwb.r(arrayList2, new w9j() { // from class: l.n9a
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
            this.f14988l0.onNext(this.f14982i0);
        }
        if (z3) {
            this.f14914C0.onNext(this.f14910A0);
        }
    }

    /* JADX INFO: renamed from: u7 */
    public Group m16739u7(String str) {
        return this.f14937L0.get(str);
    }

    /* JADX INFO: renamed from: u8 */
    public final /* synthetic */ c m16740u8(final MomentMessage momentMessage, final String str) {
        return c.fromCallable(new Callable() { // from class: l.qea
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f12216a.m16733t8(momentMessage, str);
            }
        });
    }

    /* JADX INFO: renamed from: u9 */
    public final /* synthetic */ c m16741u9(final String str) {
        return new la20(new v9j() { // from class: l.eba
            public final Object call() {
                return omg.f11509G.auth().q(str).f().b();
            }
        }, omg.f11506D | omg.f11507E).compose(omg.m12710n0()).map(new w9j() { // from class: l.fba
            public final Object call(Object obj) {
                return this.f8063a.m16734t9((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: ua */
    public final /* synthetic */ Moment m16742ua(Moment moment, boolean z, Moment moment2, List list) {
        if (moment.media.size() > 0 && (moment.media.get(0) instanceof Video)) {
            Video video = (Video) moment.media.get(0);
            if (video.isFromNewCamera) {
                if (NullChecker.a(video.audio)) {
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
        m16783zd(z, 3, moment2);
        Moment momentM19592clone = moment.m19592clone();
        momentM19592clone.media = new ArrayList(list);
        m16449Ea(momentM19592clone);
        this.f14988l0.onNext(this.f14982i0);
        return momentM19592clone;
    }

    /* JADX INFO: renamed from: ub */
    public final /* synthetic */ c m16743ub(final String str, final String str2) {
        return new la20(new v9j() { // from class: l.zga
            public final Object call() {
                return omg.f11509G.auth().q(omg.m12702j0(str, str2, null)).f().b();
            }
        }).compose(omg.m12710n0()).map(new w9j() { // from class: l.aha
            public final Object call(Object obj) {
                return this.f5746a.m16736tb((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: uc */
    public c<j760<Links, List<Moment>>> m16744uc(String str, boolean z, an00 an00Var, String str2) {
        return m16604ac(omg.m12675S(str, omg.f11535z, z, str2), m16551T7(str), true, str, an00Var);
    }

    /* JADX INFO: renamed from: ud */
    public void m16745ud(long j) {
        this.f14965Z0.put(Long.valueOf(j));
    }

    /* JADX INFO: renamed from: v7 */
    public c<Envelope> m16746v7() {
        return scheduled("meets", 0, new v9j() { // from class: l.nga
            public final Object call() {
                return this.f10800a.m16622d9();
            }
        }, true);
    }

    /* JADX INFO: renamed from: v8 */
    public final /* synthetic */ void m16747v8(MomentMessage momentMessage, String str, String str2, Throwable th) {
        kyg.m11538g(false, th);
        MomentMessage momentMessage2 = this.f14925H0.get(((CopyObject) momentMessage).id);
        momentMessage2.localCreatedSession = -((Integer) App.i.get()).intValue();
        this.f14925H0.put(((CopyObject) momentMessage).id, momentMessage2);
        Moment moment = this.f14982i0.get(momentMessage2.moment);
        moment.messages.ids.remove(((CopyObject) momentMessage2).id);
        PartialIdList partialIdList = moment.messages;
        int i = partialIdList.count;
        if (i > 0) {
            partialIdList.count = i - 1;
        }
        this.f14982i0.put(momentMessage2.moment, moment);
        f14907L1 = vwb.Y(momentMessage2.moment, 2);
        this.f14988l0.onNext(this.f14982i0);
        User userM16628e8 = FeedModule.f316d.m16628e8(str);
        zvf0.D("e_message_send", str2, new j760[]{new j760("page_id", str2), new j760("message_id", ((CopyObject) momentMessage).id), new j760("message_send_status", "fail"), new j760("message_type", MomentMessageType.moment_comment), new j760("receiver_user_id", str), new j760("code", 0), new j760("duration", ""), new j760("matchfrom", NullChecker.a(userM16628e8) ? userM16628e8.matchFromForTrack() : ""), new j760("message_origin", NullChecker.a(momentMessage.messageType) ? momentMessage.messageType : "")});
    }

    /* JADX INFO: renamed from: v9 */
    public final /* synthetic */ Envelope m16748v9(an00 an00Var, Envelope envelope) {
        if (NullChecker.a(an00Var)) {
            an00Var.mo6842a(envelope);
        }
        m16731sd(envelope);
        List<BubbleInfo> list = ((FeedData) envelope.data.getModuleData(FeedData.class)).states;
        if (list.size() > 0 && ((DbObject) FeedModule.m1140H().me_()).id.equals(list.get(0).owner.f264id)) {
            m16681lc(list.get(0));
        }
        return envelope;
    }

    /* JADX INFO: renamed from: va */
    public final /* synthetic */ c m16749va(final String str, final boolean z, final Moment moment, final Moment moment2) {
        if (NullChecker.b(moment2.media) && moment2.media.size() > 0) {
            return new lsx(new ArrayList(moment2.media), false, str, true).observeOn(jo0.a()).doOnNext(new e30() { // from class: l.q8a
                public final void call(Object obj) {
                    this.f12151a.m16728sa(moment2, (List) obj);
                }
            }).last().compose(mkd0.Q()).filter(new w9j() { // from class: l.r8a
                public final Object call(Object obj) {
                    return this.f12543a.m16735ta(str, (List) obj);
                }
            }).flatMap(new w9j() { // from class: l.s8a
                public final Object call(Object obj) {
                    return ijb0.m10901L((List) obj, "moment", null, UploadSource.get("moment"));
                }
            }).compose(omg.m12710n0()).map(new w9j() { // from class: l.t8a
                public final Object call(Object obj) {
                    return this.f13225a.m16742ua(moment2, z, moment, (List) obj);
                }
            });
        }
        m16783zd(z, 3, moment);
        return c.just(moment2);
    }

    /* JADX INFO: renamed from: vb */
    public final /* synthetic */ roj0 m16750vb(Envelope envelope) {
        m16731sd(envelope);
        ijb0.m10908S(envelope);
        return roj0.a;
    }

    /* JADX INFO: renamed from: vc */
    public c<j760<Links, List<Moment>>> m16751vc(String str, String str2) {
        return m16597Zb(omg.m12673Q(str, omg.f11535z, str2), m16551T7(str) + System.currentTimeMillis(), true, str);
    }

    /* JADX INFO: renamed from: vd */
    public void m16752vd() {
        Double d = (Double) this.f14981h1.e();
        if (!NullChecker.b(d) || d.doubleValue() <= ((Double) this.f14987k1.get()).doubleValue()) {
            return;
        }
        this.f14987k1.put(d);
    }

    /* JADX INFO: renamed from: w7 */
    public Moment m16753w7(String str) {
        MomentFeedsExtra momentFeedsExtra;
        Moment momentM13962x0 = this.f14982i0.get(str);
        if (momentM13962x0 == null) {
            momentM13962x0 = FeedModule.f320h.m13962x0(str);
        }
        if (momentM13962x0 != null) {
            RawFeed rawFeedM13961w0 = FeedModule.f320h.m13961w0(str);
            if (rawFeedM13961w0 != null && (momentFeedsExtra = rawFeedM13961w0.extra) != null && !TextUtils.isEmpty(momentFeedsExtra.report)) {
                momentM13962x0.report = rawFeedM13961w0.extra.report;
                return momentM13962x0;
            }
            String str2 = this.f14921F1.get(str);
            if (!TextUtils.isEmpty(str2)) {
                momentM13962x0.report = str2;
            }
        }
        return momentM13962x0;
    }

    /* JADX INFO: renamed from: w8 */
    public final /* synthetic */ MomentMessage m16754w8(MomentMessage momentMessage, MomentMessage momentMessage2, String str, String str2, Envelope envelope) {
        String str3;
        boolean z;
        String str4;
        FeedData feedData = (FeedData) envelope.getModuleData(FeedData.class);
        m16731sd(envelope);
        MomentMessage momentMessage3 = feedData.messages.get(0);
        this.f14925H0.remove(((CopyObject) momentMessage).id);
        this.f14934K0.onNext(momentMessage);
        this.f14925H0.put(((CopyObject) momentMessage3).id, momentMessage3);
        if (momentMessage3.isChildComment()) {
            momentMessage3.replyCommentId = momentMessage2.replyCommentId;
            if (NullChecker.b(momentMessage3.commentInfo) && !TextUtils.isEmpty(momentMessage3.commentInfo.parentMessageId) && !momentMessage3.commentInfo.parentMessageId.equals("0")) {
                str4 = momentMessage3.commentInfo.parentMessageId;
                z = true;
            } else if (TextUtils.isEmpty(momentMessage3.parentCommentId) || momentMessage3.parentCommentId.equals("0")) {
                z = false;
                str4 = null;
            } else {
                str4 = momentMessage3.parentCommentId;
                z = false;
            }
            if (NullChecker.a(str4)) {
                MomentMessage momentMessage4 = this.f14925H0.get(str4);
                if (NullChecker.a(momentMessage4)) {
                    if (z) {
                        momentMessage4.commentInfo.subMessageIds.add(0, ((CopyObject) momentMessage3).id);
                    } else {
                        momentMessage4.subCommentIds.add(0, ((CopyObject) momentMessage3).id);
                    }
                    this.f14925H0.put(str4, momentMessage4);
                }
            }
        }
        this.f14931J0.onNext(momentMessage3);
        Moment moment = this.f14982i0.get(momentMessage2.moment);
        moment.messages.ids.remove(((CopyObject) momentMessage).id);
        moment.messages.ids.add(((CopyObject) momentMessage3).id);
        this.f14982i0.put(momentMessage2.moment, moment);
        f14907L1 = vwb.Y(momentMessage3.moment, 3);
        this.f14988l0.onNext(this.f14982i0);
        ijb0.m10908S(envelope);
        User userM16628e8 = FeedModule.f316d.m16628e8(str);
        if (!User.isMatched(userM16628e8)) {
            zvf0.D("e_message_send", str2, new j760[]{new j760("page_id", str2), new j760("message_id", ((CopyObject) momentMessage2).id), new j760("message_send_status", "success"), new j760("message_type", MomentMessageType.moment_comment), new j760("receiver_user_id", str), new j760("code", 1), new j760("duration", ""), new j760("matchfrom", NullChecker.a(userM16628e8) ? userM16628e8.matchFromForTrack() : ""), new j760("message_origin", NullChecker.a(momentMessage2.messageType) ? momentMessage2.messageType : "")});
        }
        if (TextUtils.isEmpty(momentMessage2.api_only_otherUser)) {
            str3 = !TextUtils.isEmpty(str) ? str : null;
        } else {
            str3 = momentMessage2.api_only_otherUser;
        }
        TextUtils.equals(FeedModule.m1139F().userId(), str3);
        FeedModule.f320h.m13955A0(moment);
        return momentMessage3;
    }

    /* JADX INFO: renamed from: w9 */
    public final /* synthetic */ c m16755w9(final String str, final an00 an00Var) {
        return ia20.a(new v9j() { // from class: l.a9a
            public final Object call() {
                return omg.f11509G.auth().q(str).f().b();
            }
        }).map(new w9j() { // from class: l.b9a
            public final Object call(Object obj) {
                return this.f6188a.m16748v9(an00Var, (Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: wa */
    public final /* synthetic */ void m16756wa(String str, boolean z, Moment moment, final Throwable th) {
        MomentPostFailedExcepion.reportMomentPostFailed(th, true);
        zvf0.B("e_post_moment_error", "post_error_feed_moments", new j760[]{vwb.Y("error", th == null ? "unknow" : th.toString())});
        if (m16121Db(str)) {
            m16783zd(z, 5, null);
            Moment momentM19592clone = this.f14982i0.get(((DbObject) moment).id).m19592clone();
            momentM19592clone.localCreatedSession--;
            m16759wd(momentM19592clone);
            m16449Ea(momentM19592clone);
            this.f14988l0.onNext(this.f14982i0);
            e51.M(new Runnable() { // from class: l.z7a
                @Override // java.lang.Runnable
                public final void run() {
                    xia.m16369t1(th);
                }
            });
        }
    }

    /* JADX INFO: renamed from: wb */
    public final /* synthetic */ c m16757wb(final JSONObject jSONObject, final String str) {
        return new la20(new v9j() { // from class: l.efa
            public final Object call() {
                return omg.f11509G.auth().l(utc0.create(Network.JSON, jSONObject.toString())).q(str).b();
            }
        }).compose(omg.m12710n0()).map(new w9j() { // from class: l.ffa
            public final Object call(Object obj) {
                return this.f8081a.m16750vb((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: wc */
    public c<xaj0<Links, List<User>, Integer>> m16758wc(final String str) {
        return scheduled("photo/album/activity/user/poll", 0, new v9j() { // from class: l.kea
            public final Object call() {
                return this.f9689a.m16665ja(str);
            }
        });
    }

    /* JADX INFO: renamed from: wd */
    public void m16759wd(final Moment moment) {
        if (NullChecker.b(moment)) {
            now(c.fromCallable(new Callable() { // from class: l.a7a
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return xia.m16376u1(moment);
                }
            }).compose(omg.m12710n0()));
        }
    }

    /* JADX INFO: renamed from: x6 */
    public c<j760<Links, List<Moment>>> m16760x6(Links links, an00 an00Var, String str) {
        return m16590Yb(omg.m12676T(links.next, str), "activity/" + str + "/next", an00Var);
    }

    /* JADX INFO: renamed from: x7 */
    public List<PostBasePopWindow> m16761x7(String str) {
        return this.f14978g0.get(str);
    }

    /* JADX INFO: renamed from: x8 */
    public final /* synthetic */ c m16762x8(final String str, final MomentMessage momentMessage, final MomentMessage momentMessage2, final String str2, e30 e30Var) {
        return ijb0.m10899J(str, momentMessage).compose(omg.m12710n0()).flatMap(new w9j() { // from class: l.ifa
            public final Object call(Object obj) {
                return xia.m16278e1((Envelope) obj);
            }
        }).map(new w9j() { // from class: l.jfa
            public final Object call(Object obj) {
                return this.f9333a.m16754w8(momentMessage, momentMessage2, str, str2, (Envelope) obj);
            }
        }).doOnError(e30Var);
    }

    /* JADX INFO: renamed from: x9 */
    public final /* synthetic */ List m16763x9(Envelope envelope) {
        m16731sd(envelope);
        hf00 hf00Var = new hf00(12);
        hf00Var.m10608i(((FeedData) envelope.getModuleData(FeedData.class)).feeds);
        List<BubbleInfo> list = ((FeedData) envelope.getModuleData(FeedData.class)).states;
        if (!vwb.J(list)) {
            for (int i = 0; i < list.size(); i++) {
                list.get(i).setLocationName(m16565V7(list.get(i), hf00Var));
                list.get(i).setRecommendReason(m16572W7(list.get(i), hf00Var));
            }
        }
        return list;
    }

    /* JADX INFO: renamed from: xa */
    public final /* synthetic */ roj0 m16764xa(boolean z, Moment moment, Moment moment2, Envelope envelope) {
        Moment moment3 = ((FeedData) envelope.getModuleData(FeedData.class)).moments.get(0);
        m16783zd(z, 41, moment3);
        m16783zd(z, 4, null);
        this.f14982i0.remove(((DbObject) moment).id);
        if (((DbObject) moment).id.startsWith("fake_id_")) {
            this.f14953T0.remove(((DbObject) moment).id);
        }
        this.f14996p0.onNext(moment2);
        this.f14982i0.put(((DbObject) moment3).id, moment3);
        this.f14992n0.onNext(moment3);
        ijb0.m10903N(FeedModule.m1139F().userId(), false);
        ijb0.m10908S(envelope);
        ((DbObject) moment).id = ((DbObject) moment3).id;
        if (NullChecker.a(envelope)) {
            int i = envelope.meta.code;
            Objects.requireNonNull(FeedModule.f316d);
            if (i == 20102) {
                this.f14913B1.onNext(((DbObject) moment3).id);
            }
        }
        return roj0.a;
    }

    /* JADX INFO: renamed from: xb */
    public final /* synthetic */ roj0 m16765xb(Envelope envelope) {
        m16731sd(envelope);
        return roj0.a;
    }

    /* JADX INFO: renamed from: xc */
    public c<xaj0<Links, List<x8h>, Integer>> m16766xc(final String str) {
        return scheduled("photo/album/activity/user/poll/moment", 0, new v9j() { // from class: l.cia
            public final Object call() {
                return this.f6655a.m16679la(str);
            }
        });
    }

    /* JADX INFO: renamed from: xd */
    public c<roj0> m16767xd(final String str, final String str2, final String str3) {
        return scheduled("updateMomentAllowForward" + str + str2, -1, new v9j() { // from class: l.kfa
            public final Object call() {
                return this.f9699a.m16773yb(str, str2, str3);
            }
        });
    }

    /* JADX INFO: renamed from: y6 */
    public c<j760<Links, List<Moment>>> m16768y6(an00 an00Var, String str) {
        return m16604ac(omg.m12676T("limit=20", str), "activity/" + str + "/previous", false, null, an00Var);
    }

    /* JADX INFO: renamed from: y7 */
    public BubbleInfo m16769y7(String str) {
        return this.f14939M0.get(str);
    }

    /* JADX INFO: renamed from: y8 */
    public final /* synthetic */ c m16770y8(final String str, final MomentMessage momentMessage, final String str2, final e30 e30Var, final MomentMessage momentMessage2) {
        return scheduled("postTheMessage", -1, new v9j() { // from class: l.dfa
            public final Object call() {
                return this.f6909a.m16762x8(str, momentMessage2, momentMessage, str2, e30Var);
            }
        });
    }

    /* JADX INFO: renamed from: y9 */
    public final /* synthetic */ c m16771y9() {
        return new la20(new v9j() { // from class: l.o7a
            public final Object call() {
                return omg.f11509G.auth().q(omg.m12703k("/states?search=quickchat&with=users")).f().b();
            }
        }).compose(omg.m12710n0()).map(new w9j() { // from class: l.q7a
            public final Object call(Object obj) {
                return this.f12144a.m16763x9((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: ya */
    public final /* synthetic */ c m16772ya(final boolean z, final Moment moment, final Moment moment2, final boolean z2, e30 e30Var) {
        return new la20(new v9j() { // from class: l.uca
            public final Object call() {
                boolean z3 = z;
                Moment moment3 = moment;
                return omg.f11509G.auth().q(omg.m12657A(z3, moment3.isNewUserAIMoment)).l(utc0.create(Network.JSON, moment3.toJson())).b();
            }
        }, omg.f11507E).map(new w9j() { // from class: l.vca
            public final Object call(Object obj) {
                return xia.m16152J0(moment2, (Envelope) obj);
            }
        }).compose(omg.m12710n0()).map(new w9j() { // from class: l.wca
            public final Object call(Object obj) {
                return this.f14504a.m16764xa(z2, moment2, moment, (Envelope) obj);
            }
        }).doOnError(e30Var);
    }

    /* JADX INFO: renamed from: yb */
    public final /* synthetic */ c m16773yb(String str, String str2, final String str3) {
        final String strM12703k = omg.m12703k("/users/" + str + "/moments/" + str2);
        return new la20(new v9j() { // from class: l.xfa
            public final Object call() {
                return omg.f11509G.auth().k(utc0.create(Network.JSON, "{\"allowForward\": \"" + str3 + "\"}")).q(strM12703k).b();
            }
        }).compose(omg.m12710n0()).map(new w9j() { // from class: l.yfa
            public final Object call(Object obj) {
                return this.f15419a.m16765xb((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: yc */
    public c<Envelope> m16774yc(final String str) {
        return scheduled("photo/album/activity/user/poll/moment", 0, new v9j() { // from class: l.u7a
            public final Object call() {
                return this.f13574a.m16693na(str);
            }
        });
    }

    /* JADX INFO: renamed from: yd */
    public c<roj0> m16775yd(final String str, final String str2, final String str3) {
        return scheduled("updateMomentUserSetVisibility" + str + str2, -1, new v9j() { // from class: l.jda
            public final Object call() {
                return this.f9315a.m16419Ab(str, str2, str3);
            }
        });
    }

    /* JADX INFO: renamed from: z6 */
    public void m16776z6(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (!this.f14918E0.contains(str)) {
            this.f14918E0.add(str);
        }
        if (this.f14918E0.size() >= 3) {
            ArrayList arrayList = new ArrayList(this.f14918E0);
            this.f14918E0.clear();
            m16514Nc(arrayList);
        }
    }

    /* JADX INFO: renamed from: z7 */
    public Long m16777z7() {
        return (Long) this.f14965Z0.get();
    }

    /* JADX INFO: renamed from: z8 */
    public final /* synthetic */ Envelope m16778z8(Envelope envelope) {
        m16731sd(envelope);
        return envelope;
    }

    /* JADX INFO: renamed from: z9 */
    public final /* synthetic */ User m16779z9(String str, Envelope envelope) {
        if (((CommonData) envelope.getModuleData(CommonData.class)).users.size() <= 0) {
            return m16628e8(str);
        }
        m16731sd(envelope);
        return m16628e8(((DbObject) ((CommonData) envelope.getModuleData(CommonData.class)).users.get(0)).id);
    }

    /* JADX INFO: renamed from: za */
    public final /* synthetic */ c m16780za(final boolean z, final Moment moment, final boolean z2, final e30 e30Var, final Moment moment2) {
        return scheduled("postTheMoment", -1, new v9j() { // from class: l.f9a
            public final Object call() {
                return this.f8037a.m16772ya(z, moment2, moment, z2, e30Var);
            }
        });
    }

    /* JADX INFO: renamed from: zb */
    public final /* synthetic */ roj0 m16781zb(Envelope envelope) {
        m16731sd(envelope);
        return roj0.a;
    }

    /* JADX INFO: renamed from: zc */
    public c<j760<Links, List<Moment>>> m16782zc(String str, Links links, an00 an00Var) {
        return m16590Yb(omg.m12692e0(str, links.next), "poi_location_feeds_next", an00Var);
    }

    /* JADX INFO: renamed from: zd */
    public final void m16783zd(boolean z, int i, Moment moment) {
        if (z) {
            oe40.m12613z0(new j760(Integer.valueOf(i), moment));
        } else {
            oe40.m12536A0(new j760(Integer.valueOf(i), moment));
        }
    }
}
