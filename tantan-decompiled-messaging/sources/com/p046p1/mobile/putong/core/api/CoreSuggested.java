package com.p046p1.mobile.putong.core.api;

import android.app.Activity;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseArray;
import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;
import com.clevertap.android.sdk.Constants;
import com.google.gson.annotations.Expose;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.p047rx.rxthread.FastIoScheduler;
import com.p046p1.mobile.putong.api.ABManager;
import com.p046p1.mobile.putong.api.api.Network;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.C4728a;
import com.p046p1.mobile.putong.core.api.CoreSuggested;
import com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface;
import com.p046p1.mobile.putong.core.data.ActionData;
import com.p046p1.mobile.putong.core.data.ActionInsertPosition;
import com.p046p1.mobile.putong.core.data.ActionPageFormat;
import com.p046p1.mobile.putong.core.data.Active;
import com.p046p1.mobile.putong.core.data.CardCornerMark;
import com.p046p1.mobile.putong.core.data.CardExtraInfo;
import com.p046p1.mobile.putong.core.data.CardInfoRenderFrom;
import com.p046p1.mobile.putong.core.data.CardInfos;
import com.p046p1.mobile.putong.core.data.CardModel;
import com.p046p1.mobile.putong.core.data.CardPattern;
import com.p046p1.mobile.putong.core.data.CardStyle;
import com.p046p1.mobile.putong.core.data.CardsIcons;
import com.p046p1.mobile.putong.core.data.CityCData;
import com.p046p1.mobile.putong.core.data.ConsumeType;
import com.p046p1.mobile.putong.core.data.ControlCardInfo;
import com.p046p1.mobile.putong.core.data.CoreData;
import com.p046p1.mobile.putong.core.data.CoreMomentInfo;
import com.p046p1.mobile.putong.core.data.CreditScoreData;
import com.p046p1.mobile.putong.core.data.DislikedUsers;
import com.p046p1.mobile.putong.core.data.DynamicLable;
import com.p046p1.mobile.putong.core.data.FakePhotoFeedback;
import com.p046p1.mobile.putong.core.data.FourSelectOneAdCardData;
import com.p046p1.mobile.putong.core.data.IPRegion;
import com.p046p1.mobile.putong.core.data.IdealInfo;
import com.p046p1.mobile.putong.core.data.ImpressSignalCardWrapper;
import com.p046p1.mobile.putong.core.data.IntlInsertCardData;
import com.p046p1.mobile.putong.core.data.Literatures;
import com.p046p1.mobile.putong.core.data.LiteraturesComments;
import com.p046p1.mobile.putong.core.data.LiveLivingCardDataWrapper;
import com.p046p1.mobile.putong.core.data.MissMatch;
import com.p046p1.mobile.putong.core.data.MyTabTask;
import com.p046p1.mobile.putong.core.data.NewTags;
import com.p046p1.mobile.putong.core.data.PartialListOpt;
import com.p046p1.mobile.putong.core.data.Portrait;
import com.p046p1.mobile.putong.core.data.ProfileLikeComment;
import com.p046p1.mobile.putong.core.data.ProfileLikesComment;
import com.p046p1.mobile.putong.core.data.QuickChatCardWrapper;
import com.p046p1.mobile.putong.core.data.QuickChatPartyInvitation;
import com.p046p1.mobile.putong.core.data.Reason;
import com.p046p1.mobile.putong.core.data.SamesCardData;
import com.p046p1.mobile.putong.core.data.SeePortrait;
import com.p046p1.mobile.putong.core.data.SuggestReason;
import com.p046p1.mobile.putong.core.data.SuggestedComplimentItem;
import com.p046p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p046p1.mobile.putong.core.data.SuperLikeCount;
import com.p046p1.mobile.putong.core.data.SwipeDirection;
import com.p046p1.mobile.putong.core.data.UserAction;
import com.p046p1.mobile.putong.core.data.UserGreetInfo;
import com.p046p1.mobile.putong.core.data.UserWithRelationShip;
import com.p046p1.mobile.putong.core.data.VerificationCenter;
import com.p046p1.mobile.putong.core.data.VirtualCardType;
import com.p046p1.mobile.putong.core.p053ui.onlinematch.OnlineMatchPushUser;
import com.p046p1.mobile.putong.data.BubbleInfo;
import com.p046p1.mobile.putong.data.CommonData;
import com.p046p1.mobile.putong.data.ConversationStatus;
import com.p046p1.mobile.putong.data.Converter;
import com.p046p1.mobile.putong.data.Counter;
import com.p046p1.mobile.putong.data.CounterLikeLimit;
import com.p046p1.mobile.putong.data.DbLinks;
import com.p046p1.mobile.putong.data.DclExtensions;
import com.p046p1.mobile.putong.data.Device;
import com.p046p1.mobile.putong.data.Envelope;
import com.p046p1.mobile.putong.data.LikeExtraData;
import com.p046p1.mobile.putong.data.LikeFrom;
import com.p046p1.mobile.putong.data.Links;
import com.p046p1.mobile.putong.data.LiveUserLevel;
import com.p046p1.mobile.putong.data.MatchFrom;
import com.p046p1.mobile.putong.data.MatchScData;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.OMSThemeInfo;
import com.p046p1.mobile.putong.data.OMSThemeSuggestStrageryInfo;
import com.p046p1.mobile.putong.data.OmsNewTags;
import com.p046p1.mobile.putong.data.Picture;
import com.p046p1.mobile.putong.data.RecommendMessage;
import com.p046p1.mobile.putong.data.Relationship;
import com.p046p1.mobile.putong.data.RelationshipExtensions;
import com.p046p1.mobile.putong.data.RelationshipStatus;
import com.p046p1.mobile.putong.data.SettingGroups;
import com.p046p1.mobile.putong.data.Settings;
import com.p046p1.mobile.putong.data.StudentVerificationStatus;
import com.p046p1.mobile.putong.data.SwipeCardInfo;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.UserActivityInfo;
import com.p046p1.mobile.putong.data.UserStatus;
import com.p046p1.mobile.putong.data.UssTags;
import com.p046p1.mobile.putong.data.VoiceLiveState;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.feed.data.VoiceLive;
import com.p046p1.mobile.putong.live.base.data.BLiveType;
import com.p046p1.mobile.putong.remote_config.RemoteConfig;
import com.p046p1.mobile.putong.util.launch.LaunchStep;
import com.sina.weibo.sdk.auth.Oauth2AccessToken;
import com.tantanapp.common.data.ValueObject;
import com.tantanapp.common.utils.ConnectivityReceiver;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import com.tantanapp.foxstatistics.entity.EventNameEnum;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p133rx.C22306c;
import p133rx.Notification;
import p133rx.subjects.C22392a;
import p133rx.subjects.C22393b;
import p149l.ax6;
import p149l.bj90;
import p149l.c30;
import p149l.d30;
import p149l.dka;
import p149l.du2;
import p149l.e30;
import p149l.e51;
import p149l.e5l;
import p149l.hpd0;
import p149l.ia20;
import p149l.j2e0;
import p149l.j760;
import p149l.jo0;
import p149l.kj4;
import p149l.l3f;
import p149l.la20;
import p149l.mkd0;
import p149l.mqi0;
import p149l.o6j0;
import p149l.pib;
import p149l.q860;
import p149l.qib0;
import p149l.roj0;
import p149l.rzh0;
import p149l.sb90;
import p149l.sja;
import p149l.sm90;
import p149l.stc0;
import p149l.tpd0;
import p149l.uqd0;
import p149l.ura;
import p149l.utc0;
import p149l.v9j;
import p149l.vqd0;
import p149l.vwb;
import p149l.w9j;
import p149l.xaj0;
import p149l.xma;
import p149l.xob;
import p149l.yki0;
import p149l.yni;
import p149l.zew;
import p149l.zpd0;
import p149l.zvf0;

/* JADX INFO: loaded from: classes9.dex */
public class CoreSuggested extends ax6 {

    /* JADX INFO: renamed from: N2 */
    public static final long f19319N2 = 10000;

    /* JADX INFO: renamed from: A0 */
    public int f19320A0;

    /* JADX INFO: renamed from: A1 */
    public hpd0 f19321A1;

    /* JADX INFO: renamed from: A2 */
    public volatile long f19322A2;

    /* JADX INFO: renamed from: B0 */
    public C22393b<roj0> f19323B0;

    /* JADX INFO: renamed from: B1 */
    public uqd0 f19324B1;

    /* JADX INFO: renamed from: B2 */
    public C22392a<roj0> f19325B2;

    /* JADX INFO: renamed from: C0 */
    public boolean f19326C0;

    /* JADX INFO: renamed from: C1 */
    public hpd0 f19327C1;

    /* JADX INFO: renamed from: C2 */
    public boolean f19328C2;

    /* JADX INFO: renamed from: D0 */
    public tpd0 f19329D0;

    /* JADX INFO: renamed from: D1 */
    public hpd0 f19330D1;

    /* JADX INFO: renamed from: D2 */
    public C22393b<roj0> f19331D2;

    /* JADX INFO: renamed from: E0 */
    public zpd0 f19332E0;

    /* JADX INFO: renamed from: E1 */
    public hpd0 f19333E1;

    /* JADX INFO: renamed from: E2 */
    public C22392a<roj0> f19334E2;

    /* JADX INFO: renamed from: F0 */
    public C22392a<roj0> f19335F0;

    /* JADX INFO: renamed from: F1 */
    public hpd0 f19336F1;

    /* JADX INFO: renamed from: F2 */
    public C22393b<roj0> f19337F2;

    /* JADX INFO: renamed from: G0 */
    public int f19338G0;

    /* JADX INFO: renamed from: G1 */
    public hpd0 f19339G1;

    /* JADX INFO: renamed from: G2 */
    public int f19340G2;

    /* JADX INFO: renamed from: H0 */
    public zpd0 f19341H0;

    /* JADX INFO: renamed from: H1 */
    public hpd0 f19342H1;

    /* JADX INFO: renamed from: H2 */
    public C22392a<q860<String>> f19343H2;

    /* JADX INFO: renamed from: I0 */
    public C22392a<roj0> f19344I0;

    /* JADX INFO: renamed from: I1 */
    public hpd0 f19345I1;

    /* JADX INFO: renamed from: I2 */
    public C22392a<j760<SwipeDirection, HashMap>> f19346I2;

    /* JADX INFO: renamed from: J0 */
    public C22393b<Boolean> f19347J0;

    /* JADX INFO: renamed from: J1 */
    public hpd0 f19348J1;

    /* JADX INFO: renamed from: J2 */
    public long f19349J2;

    /* JADX INFO: renamed from: K0 */
    public C22392a<Boolean> f19350K0;

    /* JADX INFO: renamed from: K1 */
    public zpd0 f19351K1;

    /* JADX INFO: renamed from: K2 */
    public boolean f19352K2;

    /* JADX INFO: renamed from: L0 */
    public C22392a<PartialListOpt<UserInfo>> f19353L0;

    /* JADX INFO: renamed from: L1 */
    public uqd0 f19354L1;

    /* JADX INFO: renamed from: L2 */
    public final C22392a<Object> f19355L2;

    /* JADX INFO: renamed from: M0 */
    public tpd0 f19356M0;

    /* JADX INFO: renamed from: M1 */
    public zpd0 f19357M1;

    /* JADX INFO: renamed from: M2 */
    public String f19358M2;

    /* JADX INFO: renamed from: N0 */
    public tpd0 f19359N0;

    /* JADX INFO: renamed from: N1 */
    public hpd0 f19360N1;

    /* JADX INFO: renamed from: O0 */
    public zpd0 f19361O0;

    /* JADX INFO: renamed from: O1 */
    public int f19362O1;

    /* JADX INFO: renamed from: P0 */
    public zpd0 f19363P0;

    /* JADX INFO: renamed from: P1 */
    public int f19364P1;

    /* JADX INFO: renamed from: Q0 */
    public tpd0 f19365Q0;

    /* JADX INFO: renamed from: Q1 */
    public boolean f19366Q1;

    /* JADX INFO: renamed from: R */
    public C22392a<j760<Links, List<DislikedUsers>>> f19367R;

    /* JADX INFO: renamed from: R0 */
    public C22392a<Boolean> f19368R0;

    /* JADX INFO: renamed from: R1 */
    public HashMap<UserInfo, j760<Integer, Long>> f19369R1;

    /* JADX INFO: renamed from: S */
    public C22392a<j760<String, Long>> f19370S;

    /* JADX INFO: renamed from: S0 */
    public hpd0 f19371S0;

    /* JADX INFO: renamed from: S1 */
    public HashMap<UserInfo, Integer> f19372S1;

    /* JADX INFO: renamed from: T */
    public C22392a<roj0> f19373T;

    /* JADX INFO: renamed from: T0 */
    public tpd0 f19374T0;

    /* JADX INFO: renamed from: T1 */
    public boolean f19375T1;

    /* JADX INFO: renamed from: U */
    public boolean f19376U;

    /* JADX INFO: renamed from: U0 */
    public hpd0 f19377U0;

    /* JADX INFO: renamed from: U1 */
    public boolean f19378U1;

    /* JADX INFO: renamed from: V */
    public C22392a<Boolean> f19379V;

    /* JADX INFO: renamed from: V0 */
    public hpd0 f19380V0;

    /* JADX INFO: renamed from: V1 */
    public C22393b<Integer> f19381V1;

    /* JADX INFO: renamed from: W */
    public long f19382W;

    /* JADX INFO: renamed from: W0 */
    public hpd0 f19383W0;

    /* JADX INFO: renamed from: W1 */
    public C22393b<roj0> f19384W1;

    /* JADX INFO: renamed from: X */
    public int f19385X;

    /* JADX INFO: renamed from: X0 */
    public final HashMap<String, SuggestedComplimentItem> f19386X0;

    /* JADX INFO: renamed from: X1 */
    public C22393b<roj0> f19387X1;

    /* JADX INFO: renamed from: Y */
    public HashSet<String> f19388Y;

    /* JADX INFO: renamed from: Y0 */
    public uqd0 f19389Y0;

    /* JADX INFO: renamed from: Y1 */
    public Map<String, Integer> f19390Y1;

    /* JADX INFO: renamed from: Z */
    public HashSet<String> f19391Z;

    /* JADX INFO: renamed from: Z0 */
    public uqd0 f19392Z0;

    /* JADX INFO: renamed from: Z1 */
    public Map<String, Integer> f19393Z1;

    /* JADX INFO: renamed from: a0 */
    public C22392a<PartialListOpt<UserInfo>> f19394a0;

    /* JADX INFO: renamed from: a1 */
    public uqd0 f19395a1;

    /* JADX INFO: renamed from: a2 */
    public Map<String, Integer> f19396a2;

    /* JADX INFO: renamed from: b0 */
    public C22392a<ActionData> f19397b0;

    /* JADX INFO: renamed from: b1 */
    public uqd0 f19398b1;

    /* JADX INFO: renamed from: b2 */
    public HashSet<String> f19399b2;

    /* JADX INFO: renamed from: c0 */
    public C22392a<roj0> f19400c0;

    /* JADX INFO: renamed from: c1 */
    public uqd0 f19401c1;

    /* JADX INFO: renamed from: c2 */
    public HashSet<String> f19402c2;

    /* JADX INFO: renamed from: d0 */
    public C22393b<HashMap<String, NewTags>> f19403d0;

    /* JADX INFO: renamed from: d1 */
    public zpd0 f19404d1;

    /* JADX INFO: renamed from: d2 */
    public HashSet<String> f19405d2;

    /* JADX INFO: renamed from: e0 */
    public C22393b<roj0> f19406e0;

    /* JADX INFO: renamed from: e1 */
    public hpd0 f19407e1;

    /* JADX INFO: renamed from: e2 */
    public C4746l f19408e2;

    /* JADX INFO: renamed from: f0 */
    public UserInfo f19409f0;

    /* JADX INFO: renamed from: f1 */
    public zpd0 f19410f1;

    /* JADX INFO: renamed from: f2 */
    public C22393b<Boolean> f19411f2;

    /* JADX INFO: renamed from: g0 */
    public zew<String, Object> f19412g0;

    /* JADX INFO: renamed from: g1 */
    public tpd0 f19413g1;

    /* JADX INFO: renamed from: g2 */
    public C22393b<SwipeDirection> f19414g2;

    /* JADX INFO: renamed from: h0 */
    public boolean f19415h0;

    /* JADX INFO: renamed from: h1 */
    public vqd0 f19416h1;

    /* JADX INFO: renamed from: h2 */
    public C22393b<SwipeDirection> f19417h2;

    /* JADX INFO: renamed from: i0 */
    public User f19418i0;

    /* JADX INFO: renamed from: i1 */
    public tpd0 f19419i1;

    /* JADX INFO: renamed from: i2 */
    public C22393b<SwipeDirection> f19420i2;

    /* JADX INFO: renamed from: j0 */
    public UserInfo f19421j0;

    /* JADX INFO: renamed from: j1 */
    public zpd0 f19422j1;

    /* JADX INFO: renamed from: j2 */
    public C22393b<roj0> f19423j2;

    /* JADX INFO: renamed from: k0 */
    public int f19424k0;

    /* JADX INFO: renamed from: k1 */
    public hpd0 f19425k1;

    /* JADX INFO: renamed from: k2 */
    public C22393b<roj0> f19426k2;

    /* JADX INFO: renamed from: l0 */
    public int f19427l0;

    /* JADX INFO: renamed from: l1 */
    public hpd0 f19428l1;

    /* JADX INFO: renamed from: l2 */
    public C22393b<String> f19429l2;

    /* JADX INFO: renamed from: m0 */
    public C22392a<Long> f19430m0;

    /* JADX INFO: renamed from: m1 */
    public hpd0 f19431m1;

    /* JADX INFO: renamed from: m2 */
    public C22393b<roj0> f19432m2;

    /* JADX INFO: renamed from: n0 */
    public long f19433n0;

    /* JADX INFO: renamed from: n1 */
    public hpd0 f19434n1;

    /* JADX INFO: renamed from: n2 */
    public C22393b<roj0> f19435n2;

    /* JADX INFO: renamed from: o0 */
    public long f19436o0;

    /* JADX INFO: renamed from: o1 */
    public hpd0 f19437o1;

    /* JADX INFO: renamed from: o2 */
    public String f19438o2;

    /* JADX INFO: renamed from: p0 */
    public long f19439p0;

    /* JADX INFO: renamed from: p1 */
    public uqd0 f19440p1;

    /* JADX INFO: renamed from: p2 */
    public boolean f19441p2;

    /* JADX INFO: renamed from: q0 */
    public long f19442q0;

    /* JADX INFO: renamed from: q1 */
    public uqd0 f19443q1;

    /* JADX INFO: renamed from: q2 */
    public int[] f19444q2;

    /* JADX INFO: renamed from: r0 */
    public HashSet<String> f19445r0;

    /* JADX INFO: renamed from: r1 */
    public uqd0 f19446r1;

    /* JADX INFO: renamed from: r2 */
    public String f19447r2;

    /* JADX INFO: renamed from: s0 */
    public UserInfo f19448s0;

    /* JADX INFO: renamed from: s1 */
    public hpd0 f19449s1;

    /* JADX INFO: renamed from: s2 */
    public int f19450s2;

    /* JADX INFO: renamed from: t0 */
    public hpd0 f19451t0;

    /* JADX INFO: renamed from: t1 */
    public hpd0 f19452t1;

    /* JADX INFO: renamed from: t2 */
    public final Map<String, Integer> f19453t2;

    /* JADX INFO: renamed from: u0 */
    public hpd0 f19454u0;

    /* JADX INFO: renamed from: u1 */
    public hpd0 f19455u1;

    /* JADX INFO: renamed from: u2 */
    public hpd0 f19456u2;

    /* JADX INFO: renamed from: v0 */
    public hpd0 f19457v0;

    /* JADX INFO: renamed from: v1 */
    public hpd0 f19458v1;

    /* JADX INFO: renamed from: v2 */
    public zpd0 f19459v2;

    /* JADX INFO: renamed from: w0 */
    public hpd0 f19460w0;

    /* JADX INFO: renamed from: w1 */
    public hpd0 f19461w1;

    /* JADX INFO: renamed from: w2 */
    public hpd0 f19462w2;

    /* JADX INFO: renamed from: x0 */
    public hpd0 f19463x0;

    /* JADX INFO: renamed from: x1 */
    public zpd0 f19464x1;

    /* JADX INFO: renamed from: x2 */
    public C22392a<xaj0<String, Boolean, SwipeDirection>> f19465x2;

    /* JADX INFO: renamed from: y0 */
    public int f19466y0;

    /* JADX INFO: renamed from: y1 */
    public hpd0 f19467y1;

    /* JADX INFO: renamed from: y2 */
    public long f19468y2;

    /* JADX INFO: renamed from: z0 */
    public int f19469z0;

    /* JADX INFO: renamed from: z1 */
    public hpd0 f19470z1;

    /* JADX INFO: renamed from: z2 */
    public volatile long f19471z2;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.api.CoreSuggested$a */
    public class C4723a implements w9j<Envelope, UserInfo> {
        public C4723a() {
        }

        @Override // p149l.w9j
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public UserInfo call(Envelope envelope) {
            CommonData commonData = (CommonData) envelope.getModuleData(CommonData.class);
            List<CoreMomentInfo> list = ((CoreData) envelope.getModuleData(CoreData.class)).moments;
            if (!NullChecker.m81303a(commonData) || vwb.m200296J(commonData.users)) {
                return null;
            }
            UserInfo userInfo = new UserInfo();
            userInfo.f19472id = commonData.users.get(0).f56011id;
            if (!vwb.m200296J(list)) {
                userInfo.coreMomentInfoList = list;
            }
            CoreSuggested.this.f19438o2 = commonData.users.get(0).f56011id;
            return userInfo;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.api.CoreSuggested$b */
    public class C4724b implements w9j<Envelope, Envelope> {
        public C4724b() {
        }

        @Override // p149l.w9j
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Envelope call(Envelope envelope) {
            CoreSuggested.this.f72126Q.m31492w3(envelope, null);
            return envelope;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.api.CoreSuggested$c */
    public class C4725c implements w9j<Envelope, roj0> {
        public C4725c() {
        }

        @Override // p149l.w9j
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public roj0 call(Envelope envelope) {
            return roj0.f160388a;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.api.CoreSuggested$d */
    public static /* synthetic */ class C4726d {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f19476a;

        static {
            int[] iArr = new int[SwipeDirection.values().length];
            f19476a = iArr;
            try {
                iArr[SwipeDirection.UP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19476a[SwipeDirection.LEFT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f19476a[SwipeDirection.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.api.CoreSuggested$e */
    public static class C4727e implements Comparable<C4727e> {

        /* JADX INFO: renamed from: a */
        public String f19477a;

        /* JADX INFO: renamed from: b */
        public int f19478b;

        public C4727e(String str, int i) {
            this.f19477a = str;
            this.f19478b = i;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(C4727e c4727e) {
            return c4727e.f19478b - this.f19478b;
        }
    }

    public CoreSuggested(C4732c c4732c) {
        super(c4732c);
        this.f19367R = C22392a.m221512b();
        this.f19370S = C22392a.m221512b();
        this.f19373T = C22392a.m221512b();
        Boolean bool = Boolean.FALSE;
        this.f19379V = C22392a.m221513c(bool);
        this.f19382W = 0L;
        this.f19385X = 2;
        this.f19388Y = new HashSet<>();
        this.f19391Z = new HashSet<>();
        this.f19394a0 = C22392a.m221512b();
        this.f19397b0 = C22392a.m221512b();
        this.f19400c0 = C22392a.m221512b();
        this.f19403d0 = C22393b.m221521b();
        this.f19406e0 = C22393b.m221521b();
        this.f19412g0 = new zew<>(20);
        this.f19415h0 = false;
        this.f19418i0 = null;
        this.f19424k0 = 1;
        this.f19427l0 = -1;
        this.f19430m0 = C22392a.m221512b();
        this.f19433n0 = 0L;
        this.f19436o0 = 0L;
        this.f19439p0 = 0L;
        this.f19442q0 = 0L;
        this.f19445r0 = new HashSet<>();
        this.f19451t0 = new hpd0("has_shown_first_like_alert_" + CoreModule.m29931H().userId(), bool);
        this.f19454u0 = new hpd0("has_shown_first_superlike_alert_" + CoreModule.m29931H().userId(), bool);
        this.f19457v0 = new hpd0("has_shown_first_dislike_alert_" + CoreModule.m29931H().userId(), bool);
        this.f19460w0 = new hpd0("has_shown_first_swipe_cover", bool);
        this.f19463x0 = new hpd0("need_show_upload_photo_btn_" + CoreModule.m29931H().userId(), bool);
        this.f19466y0 = 0;
        this.f19469z0 = 0;
        this.f19320A0 = 0;
        this.f19323B0 = C22393b.m221521b();
        this.f19329D0 = new tpd0("swipe_not_match_see_purchase_guide_times_" + CoreModule.m29931H().userId(), 0);
        this.f19332E0 = new zpd0("swipe_not_match_see_purchase_guide_last_time_" + CoreModule.m29931H().userId(), 0L);
        this.f19335F0 = C22392a.m221512b();
        this.f19338G0 = 0;
        this.f19341H0 = new zpd0("swipe_not_match_count_for_gp_subs_date_" + CoreModule.m29931H().userId(), 0L);
        this.f19344I0 = C22392a.m221512b();
        this.f19347J0 = C22393b.m221521b();
        this.f19350K0 = C22392a.m221512b();
        this.f19353L0 = C22392a.m221512b();
        this.f19356M0 = new tpd0("gp_miss_match_version_" + CoreModule.m29931H().userId(), 0);
        this.f19359N0 = new tpd0("swipe_left_count_" + CoreModule.m29931H().userId(), 0);
        this.f19361O0 = new zpd0("last_swipe_left_date" + CoreModule.m29931H().userId(), 0L);
        this.f19363P0 = new zpd0("gp_miss_match_show_date_" + CoreModule.m29931H().userId(), 0L);
        this.f19365Q0 = new tpd0("gp_miss_match_toast_show_count_" + CoreModule.m29931H().userId(), 0);
        this.f19368R0 = C22392a.m221512b();
        this.f19371S0 = new hpd0("has_show_guide_to_kankan_card" + CoreModule.m29931H().userId(), bool);
        this.f19374T0 = new tpd0("kankan_guide_swipe_count" + CoreModule.m29931H().userId(), 0);
        this.f19377U0 = new hpd0("all_female_show_debug_flag", bool);
        this.f19380V0 = new hpd0("debug_all_user_letter", bool);
        this.f19383W0 = new hpd0("debug_all_user_new_like", bool);
        this.f19386X0 = new HashMap<>();
        this.f19389Y0 = new uqd0("intl_fake_suggest_user_01_" + CoreModule.m29931H().userId(), "");
        this.f19392Z0 = new uqd0("intl_fake_suggest_user_02_" + CoreModule.m29931H().userId(), "");
        this.f19395a1 = new uqd0("intl_fake_suggest_user_03_" + CoreModule.m29931H().userId(), "");
        this.f19398b1 = new uqd0("slide_card_rewards_day_swipe_date" + CoreModule.m29931H().userId(), "");
        this.f19401c1 = new uqd0("show_slide_card_rewards_dlg_day" + CoreModule.m29931H().userId(), "");
        this.f19404d1 = new zpd0("slide_card_rewards_day_swipe_count" + CoreModule.m29931H().userId(), 0L);
        this.f19407e1 = new hpd0("has_show_filter_guide_bubble_" + CoreModule.m29931H().userId(), bool);
        this.f19410f1 = new zpd0("daily_message_mills_" + CoreModule.m29931H().userId(), 0L);
        this.f19413g1 = new tpd0("daily_message_count_" + CoreModule.m29931H().userId(), 0);
        this.f19416h1 = new vqd0("has_show_add_book_movies_dramas_status_dlg_passive_" + CoreModule.m29931H().userId(), new HashSet());
        this.f19419i1 = new tpd0("fake_and_good_upload_photo_dialog_" + CoreModule.m29931H().userId(), 0);
        this.f19422j1 = new zpd0("good_or_fake_upload_photo_" + CoreModule.m29931H().userId(), 0L);
        String str = "show_my_tab_sides_slip_dot_" + CoreModule.m29931H().userId();
        Boolean bool2 = Boolean.TRUE;
        this.f19425k1 = new hpd0(str, bool2);
        this.f19428l1 = new hpd0("show_chat_and_dot_" + CoreModule.m29931H().userId(), bool);
        this.f19431m1 = new hpd0("is_first_click_anti_harass_dlg_" + CoreModule.m29931H().userId(), bool2);
        this.f19434n1 = new hpd0("show_my_tab_sides_slip_share_dot" + CoreModule.m29931H().userId(), bool2);
        this.f19437o1 = new hpd0("show_my_tab_sides_slip_flash_dot" + CoreModule.m29931H().userId(), bool2);
        this.f19440p1 = new uqd0("oms_is_show_dot" + CoreModule.m29931H().userId(), "");
        this.f19443q1 = new uqd0("marry_suggest_user_today_time" + CoreModule.m29931H().userId(), "");
        this.f19446r1 = new uqd0("marry_suggest_user_today_data" + CoreModule.m29931H().userId(), "");
        this.f19449s1 = new hpd0("card_opt_debug", bool);
        this.f19452t1 = new hpd0("mock_america", bool);
        this.f19455u1 = new hpd0("card_opt_debug_view", bool);
        this.f19458v1 = new hpd0("card_live_debug", bool);
        this.f19461w1 = new hpd0("card4To3Debug" + CoreModule.m29931H().userId(), bool);
        this.f19464x1 = new zpd0("oof_bubble_guide_show_time" + CoreModule.m29931H().userId(), 0L);
        this.f19467y1 = new hpd0("dynamicBottomDebug" + CoreModule.m29931H().userId(), bool);
        this.f19470z1 = new hpd0("preload_suggest_list", bool);
        this.f19321A1 = new hpd0("selected_tab_authentication" + CoreModule.m29931H().userId(), bool);
        this.f19324B1 = new uqd0("marry_mode_specific_suggest_user" + CoreModule.m29931H().userId(), "");
        this.f19327C1 = new hpd0("city_c_purchase_success_record" + CoreModule.m29931H().userId(), bool);
        this.f19330D1 = new hpd0("cityCInsertDebug", bool);
        this.f19333E1 = new hpd0("new_old_card", bool);
        this.f19336F1 = new hpd0("user_expanded_card", bool);
        this.f19339G1 = new hpd0("user_expanded_card_intl", bool2);
        this.f19342H1 = new hpd0("user_expanded_card_intl_home", bool2);
        this.f19345I1 = new hpd0("user_expanded_card_close", bool);
        this.f19348J1 = new hpd0("user_expanded_card_idealType_enable", bool);
        this.f19351K1 = new zpd0("card_show_certification_guidance_item" + CoreModule.m29931H().userId(), 0L);
        this.f19354L1 = new uqd0("card_show_certification_guidance_item_user_id" + CoreModule.m29931H().userId(), "");
        this.f19357M1 = new zpd0("show_Certification_Segmentation_dlg_Time" + CoreModule.m29931H().userId(), 0L);
        this.f19360N1 = new hpd0("home_card_only_focus_authentication_guidance" + CoreModule.m29931H().userId(), bool);
        this.f19362O1 = 0;
        this.f19364P1 = 0;
        this.f19366Q1 = false;
        this.f19369R1 = new HashMap<>();
        this.f19372S1 = new HashMap<>();
        this.f19375T1 = false;
        this.f19378U1 = false;
        this.f19381V1 = C22393b.m221521b();
        this.f19384W1 = C22393b.m221521b();
        this.f19387X1 = C22393b.m221521b();
        this.f19390Y1 = new ConcurrentHashMap();
        this.f19393Z1 = new ConcurrentHashMap();
        this.f19396a2 = new ConcurrentHashMap();
        this.f19399b2 = new HashSet<>();
        this.f19402c2 = new HashSet<>();
        this.f19405d2 = new HashSet<>();
        this.f19408e2 = new C4746l(this.f72126Q);
        this.f19411f2 = C22393b.m221521b();
        this.f19414g2 = C22393b.m221521b();
        this.f19417h2 = C22393b.m221521b();
        this.f19420i2 = C22393b.m221521b();
        this.f19423j2 = C22393b.m221521b();
        this.f19426k2 = C22393b.m221521b();
        this.f19429l2 = C22393b.m221521b();
        this.f19432m2 = C22393b.m221521b();
        this.f19435n2 = C22393b.m221521b();
        this.f19438o2 = "";
        this.f19441p2 = false;
        this.f19444q2 = new int[]{-1, -1, -1};
        this.f19447r2 = "default";
        this.f19450s2 = -1;
        this.f19453t2 = new HashMap();
        this.f19456u2 = new hpd0("filter_ideal_suggest_" + CoreModule.m29931H().userId(), bool);
        this.f19459v2 = new zpd0("last_filter_ideal_time" + CoreModule.m29931H().userId(), 0L);
        this.f19462w2 = new hpd0("fake_insert__ideal_suggest_" + CoreModule.m29931H().userId(), bool);
        this.f19465x2 = C22392a.m221512b();
        this.f19325B2 = C22392a.m221512b();
        this.f19328C2 = false;
        this.f19331D2 = C22393b.m221521b();
        this.f19334E2 = C22392a.m221512b();
        this.f19337F2 = C22393b.m221521b();
        this.f19340G2 = 0;
        this.f19343H2 = C22392a.m221512b();
        this.f19346I2 = C22392a.m221513c(j760.m140076a(SwipeDirection.fromValue(0), null));
        this.f19349J2 = 0L;
        this.f19352K2 = false;
        this.f19355L2 = C22392a.m221512b();
        this.f19358M2 = "/users/me/see-portraits-v3";
    }

    /* JADX INFO: renamed from: C3 */
    public static /* synthetic */ int m30851C3(LiteraturesComments literaturesComments, LiteraturesComments literaturesComments2) {
        return (int) (literaturesComments2.updatedTime - literaturesComments.updatedTime);
    }

    /* JADX INFO: renamed from: G3 */
    public static /* synthetic */ User m30859G3(User user) {
        return user;
    }

    /* JADX INFO: renamed from: J4 */
    public static /* synthetic */ void m30866J4(CommonData commonData) {
        if (vwb.m200296J(commonData.users)) {
            return;
        }
        CoreModule.m29934N().mo60314Rf(vwb.m200303Q(commonData.users, new w9j() { // from class: l.c4b
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((User) obj).f56011id;
            }
        }));
    }

    /* JADX INFO: renamed from: K4 */
    public static /* synthetic */ Relationship m30868K4(Envelope envelope) {
        if (!vwb.m200296J(((CoreData) envelope.getModuleData(CoreData.class)).relationships)) {
            return ((CoreData) envelope.getModuleData(CoreData.class)).relationships.get(0);
        }
        Relationship relationshipNew_ = Relationship.new_();
        relationshipNew_.state = RelationshipStatus.get("unknown_");
        return relationshipNew_;
    }

    /* JADX INFO: renamed from: Q3 */
    public static /* synthetic */ Envelope m30879Q3(final String str, String str2, Envelope envelope) {
        if (!vwb.m200296J(((CoreData) envelope.getModuleData(CoreData.class)).relationships)) {
            Relationship relationship = (Relationship) vwb.m200346r(((CoreData) envelope.getModuleData(CoreData.class)).relationships, new w9j() { // from class: l.c0b
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(((Relationship) obj).f38806id.equals(str));
                }
            });
            if (NullChecker.m81303a(relationship) && str.equals(relationship.f38806id) && relationship.relationshipExtensions == null) {
                RelationshipExtensions relationshipExtensionsNew_ = RelationshipExtensions.new_();
                relationshipExtensionsNew_.otherLetter = str2;
                relationship.relationshipExtensions = relationshipExtensionsNew_;
            }
        }
        return envelope;
    }

    /* JADX INFO: renamed from: V3 */
    public static /* synthetic */ int m30889V3(ProfileLikeComment profileLikeComment, ProfileLikeComment profileLikeComment2) {
        return (int) (profileLikeComment2.createdTime - profileLikeComment.createdTime);
    }

    /* JADX INFO: renamed from: X3 */
    public static /* synthetic */ int m30893X3(User user, User user2) {
        return user2.popLevel - user.popLevel;
    }

    /* JADX INFO: renamed from: Z4 */
    public static /* synthetic */ void m30898Z4(PartialListOpt partialListOpt) {
        if (!NullChecker.m81303a(partialListOpt) || partialListOpt.loaded.isEmpty() || ura.m195053e().m195057d().mo33801ar()) {
            return;
        }
        ura.m195053e().m195057d().mo33862jo(partialListOpt.loaded);
    }

    /* JADX INFO: renamed from: a3 */
    public static /* synthetic */ void m30899a3(User user) {
        if (user.hasPic()) {
            qib0.f154691G.m102374u0(ura.m195053e().m195057d().mo33782Xf(user.media(0)));
        }
    }

    /* JADX INFO: renamed from: b5 */
    public static /* synthetic */ String m30904b5(String str, String str2) {
        return "tantanapp://userCard?uid=" + str;
    }

    /* JADX INFO: renamed from: c4 */
    public static /* synthetic */ void m30906c4() {
        CoreModule.f17545c.f19558D0.m34842R4();
        CoreModule.f17545c.f19558D0.f20134Y = true;
    }

    /* JADX INFO: renamed from: g5 */
    public static /* synthetic */ C22306c m30919g5(C22306c c22306c) {
        return c22306c;
    }

    /* JADX INFO: renamed from: i3 */
    public static /* synthetic */ void m30923i3(Throwable th) {
    }

    /* JADX INFO: renamed from: l5 */
    public static /* synthetic */ void m30934l5(Throwable th) {
    }

    /* JADX INFO: renamed from: m5 */
    public static /* synthetic */ stc0 m30937m5(String str, boolean z) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("userID", str);
            jSONObject.put(NotificationCompat.CATEGORY_STATUS, z ? "accept" : "reject");
        } catch (JSONException unused) {
        }
        return C4728a.f19494P.auth().m185893l(utc0.create(Network.JSON, jSONObject.toString())).m185898q(C4728a.m31200G("/users/" + CoreModule.m29931H().userId() + "/fake-suggest")).m185883b();
    }

    /* JADX INFO: renamed from: n4 */
    public static /* synthetic */ void m30939n4() {
    }

    /* JADX INFO: renamed from: s5 */
    public static /* synthetic */ void m30955s5(User user) {
        if (user.hasPic()) {
            qib0.f154691G.m102374u0(ura.m195053e().m195057d().mo33782Xf(user.media(0)));
        }
    }

    /* JADX INFO: renamed from: t8 */
    private void m30959t8(List<User> list) {
        vwb.m200354z(vwb.m200291E(list), new e30() { // from class: l.y1b
            @Override // p149l.e30
            public final void call(Object obj) {
                CoreSuggested.m30955s5((User) obj);
            }
        });
    }

    /* JADX INFO: renamed from: x3 */
    public static /* synthetic */ void m30969x3(User user) {
        if (user.hasPic()) {
            qib0.f154691G.m102374u0(ura.m195053e().m195057d().mo33782Xf(user.media(0)));
        }
    }

    /* JADX INFO: renamed from: A5 */
    public final String m30975A5(String str) {
        if (ura.m195053e().m195057d().mo33821er() && !CoreModule.m29932K().me_().isFemale()) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(String.format("&male_show_like=%s", Boolean.valueOf(CoreModule.m29932K().mo30814rg() && CoreModule.m29932K().mo30680Dh() && CoreModule.m29932K().mo30682Dp())));
            str = sb.toString();
        }
        if (ura.m195053e().m195057d().mo33904q0()) {
            str = str + "&authentication=" + this.f19321A1.get();
        }
        if (ura.m195053e().m195057d().mo33716Lc()) {
            str = str + "&pickzone=true";
        }
        if (ura.m195053e().m195057d().mo33947xh()) {
            if (this.f19456u2.get().booleanValue() && mqi0.m155929D(this.f19459v2.get().longValue())) {
                return str + "&filter_ideal=true";
            }
            if (this.f19328C2) {
                return str + "&show_ideal=true";
            }
        }
        return str;
    }

    /* JADX INFO: renamed from: A6 */
    public final void m30976A6(List<UserInfo> list, List<User> list2) {
        int iM30980B6 = m31028N6() ? m30980B6() : 3;
        if (iM30980B6 <= 0 || this.f19366Q1 || vwb.m200296J(list) || vwb.m200296J(list2)) {
            return;
        }
        ArrayList<User> arrayList = new ArrayList(list2);
        Collections.sort(arrayList, new Comparator() { // from class: l.x3b
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return CoreSuggested.m30893X3((User) obj, (User) obj2);
            }
        });
        ArrayList arrayList2 = new ArrayList();
        for (User user : arrayList) {
            for (UserInfo userInfo : list) {
                if (userInfo.f19472id.equals(user.f56011id)) {
                    arrayList2.add(userInfo);
                    break;
                }
            }
            if (arrayList2.size() == iM30980B6 || arrayList2.size() >= list.size()) {
                break;
            }
        }
        for (int i = 0; i < arrayList2.size(); i++) {
            int iIndexOf = list.indexOf(arrayList2.get(i));
            if (iIndexOf != i) {
                Collections.swap(list, i, iIndexOf);
            }
        }
    }

    /* JADX INFO: renamed from: A7 */
    public final /* synthetic */ void m30977A7(Notification notification, UserInfo userInfo, User user, ConversationStatus conversationStatus, boolean z) {
        if (vwb.m200296J(((CoreData) ((Envelope) notification.m221295f()).getModuleData(CoreData.class)).relationships)) {
            return;
        }
        boolean z2 = false;
        Relationship relationship = ((CoreData) ((Envelope) notification.m221295f()).getModuleData(CoreData.class)).relationships.get(0);
        User userM169433Q9 = this.f72126Q.f19639e0.m169433Q9(userInfo.f19472id);
        if (userM169433Q9 == null) {
            if (user == null) {
                return;
            } else {
                userM169433Q9 = user;
            }
        }
        if (ura.m195053e().m195057d().mo33808c() && relationship != null) {
            relationship.conversationStatus = conversationStatus;
        }
        if (z && NullChecker.m81303a(relationship) && NullChecker.m81303a(relationship.relationshipExtensions) && !TEnum.equals(relationship.relationshipExtensions.relationType, RelationshipStatus.SUPERLIKED)) {
            relationship.relationshipExtensions.relationType = RelationshipStatus.get(RelationshipStatus.SUPERLIKED);
            z2 = true;
        }
        userM169433Q9.localRelationship = relationship;
        if (!TEnum.equals(relationship.state, "matched")) {
            if (z2) {
                qib0.f154722k0.f176631d.upsert(userM169433Q9);
            }
        } else {
            if (user != null) {
                user.localRelationship = userM169433Q9.localRelationship;
            }
            qib0.f154722k0.f176631d.upsert(userM169433Q9);
            this.f72126Q.f19642f0.m33156vf(userM169433Q9);
        }
    }

    /* JADX INFO: renamed from: A8 */
    public void m30978A8(VirtualCardType virtualCardType) {
        if (!NullChecker.m81303a(this.f19394a0.m221515e()) || vwb.m200296J(this.f19394a0.m221515e().loaded)) {
            return;
        }
        ListIterator<UserInfo> listIterator = this.f19394a0.m221515e().loaded.listIterator();
        while (listIterator.hasNext()) {
            UserInfo next = listIterator.next();
            if (NullChecker.m81303a(next) && virtualCardType == next.virtualCardType) {
                listIterator.remove();
            }
        }
        this.f19394a0.m221515e().setRefreshValue(true);
        C22392a<PartialListOpt<UserInfo>> c22392a = this.f19394a0;
        c22392a.onNext(c22392a.m221515e().setReasonStr(PartialListOpt.RefreshReason.REMOVE_LOCAL_CARD.getReason() + "_" + virtualCardType.getId()));
    }

    /* JADX INFO: renamed from: B5 */
    public final String m30979B5(String str) {
        if (yki0.m215127b().m215136h()) {
            OMSThemeInfo oMSThemeInfoM215130a = yki0.m215127b().m215130a();
            if (NullChecker.m81303a(oMSThemeInfoM215130a)) {
                OMSThemeSuggestStrageryInfo oMSThemeSuggestStrageryInfo = oMSThemeInfoM215130a.suggestStrategy;
                if (!TextUtils.isEmpty(oMSThemeSuggestStrageryInfo.groupID) && !vwb.m200296J(oMSThemeSuggestStrageryInfo.tags)) {
                    if (!str.contains("groupid")) {
                        str = str + "&groupid=" + oMSThemeSuggestStrageryInfo.groupID;
                    }
                    if (!str.contains("tags")) {
                        List<String> list = oMSThemeSuggestStrageryInfo.tags;
                        StringBuilder sb = new StringBuilder(str);
                        if (!list.isEmpty()) {
                            sb.append("&tags=");
                            for (int i = 0; i < list.size(); i++) {
                                sb.append(list.get(i));
                                if (i < list.size() - 1) {
                                    sb.append(Constants.SEPARATOR_COMMA);
                                }
                            }
                            return sb.toString();
                        }
                    }
                }
            }
        }
        return str;
    }

    /* JADX INFO: renamed from: B6 */
    public final int m30980B6() {
        if (this.f19450s2 == -1) {
            try {
                int iOptInt = new JSONObject(RemoteConfig.m79298x().m79302F("low_active_hight_pop")).optInt("count");
                if (iOptInt <= 0) {
                    iOptInt = 0;
                }
                this.f19450s2 = iOptInt;
            } catch (Exception unused) {
            }
        }
        return this.f19450s2;
    }

    /* JADX INFO: renamed from: B7 */
    public final /* synthetic */ void m30981B7(boolean z, roj0 roj0Var) {
        if (z) {
            return;
        }
        m31165z5(true);
    }

    /* JADX INFO: renamed from: B8 */
    public void m30982B8(String str) {
        QuickChatCardWrapper quickChatCardWrapper;
        OnlineMatchPushUser broadcastCard;
        if (TextUtils.isEmpty(str) || this.f19394a0.m221515e() == null || vwb.m200296J(this.f19394a0.m221515e().loaded)) {
            return;
        }
        Iterator<UserInfo> it = this.f19394a0.m221515e().loaded.iterator();
        while (it.hasNext()) {
            UserInfo next = it.next();
            if (next != null && (quickChatCardWrapper = next.quickChatCardWrapper) != null && quickChatCardWrapper.isPeiLiao() && (broadcastCard = next.quickChatCardWrapper.getBroadcastCard()) != null && NullChecker.m81303a(broadcastCard.user) && str.equals(broadcastCard.user.f56011id)) {
                this.f19388Y.remove(next.f19472id);
                it.remove();
                this.f19394a0.m221515e().setRefreshValue(true);
                C22392a<PartialListOpt<UserInfo>> c22392a = this.f19394a0;
                c22392a.onNext(c22392a.m221515e().setReason(PartialListOpt.RefreshReason.removePeiLiaoUsersByIdIfNeed));
                return;
            }
        }
    }

    /* JADX INFO: renamed from: C5 */
    public void m30983C5() {
        this.f19376U = true;
        m31039Q5();
        m31043R5();
        this.f72126Q.f19687u0.m30456m5();
        this.f72126Q.f19687u0.m30453l5();
        this.f19379V.onNext(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: C6 */
    public final void m30984C6(List<UserInfo> list, UserInfo userInfo) {
        Iterator<UserInfo> it = list.iterator();
        while (it.hasNext()) {
            if (TextUtils.equals(userInfo.f19472id, it.next().f19472id)) {
                it.remove();
            }
        }
    }

    /* JADX INFO: renamed from: C7 */
    public final /* synthetic */ void m30985C7(boolean z, Throwable th) {
        if (z) {
            return;
        }
        m31165z5(false);
    }

    /* JADX INFO: renamed from: C8 */
    public void m30986C8(String str) {
        if (NullChecker.m81303a(this.f19394a0.m221515e()) && !vwb.m200296J(this.f19394a0.m221515e().loaded)) {
            if (NullChecker.m81303a(this.f19397b0.m221515e())) {
                CardPattern cardPattern = (CardPattern) vwb.m200346r(this.f19397b0.m221515e().pageFormat.cardPatterns, new w9j() { // from class: l.d0b
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return this.f83163a.m31001G7((CardPattern) obj);
                    }
                });
                if (NullChecker.m81303a(cardPattern)) {
                    this.f19397b0.m221515e().pageFormat.cardPatterns.remove(cardPattern);
                }
            }
            this.f19394a0.m221515e().loaded.remove(0);
        }
        this.f19394a0.m221515e().setRefreshValue(true);
        C22392a<PartialListOpt<UserInfo>> c22392a = this.f19394a0;
        c22392a.onNext(c22392a.m221515e().setReasonStr(PartialListOpt.RefreshReason.REMOVE_TOP.getReason() + "_" + str));
        m31083b6(true);
    }

    /* JADX WARN: Code duplicated, block: B:277:0x078f  */
    /* JADX WARN: Code duplicated, block: B:464:0x0d10  */
    /* JADX WARN: Code duplicated, block: B:477:0x0d66  */
    /* JADX WARN: Code duplicated, block: B:479:0x0d70  */
    /* JADX WARN: Code duplicated, block: B:480:0x0d7d  */
    /* JADX WARN: Code duplicated, block: B:483:0x0d8d  */
    /* JADX WARN: Code duplicated, block: B:485:0x0d97  */
    /* JADX WARN: Code duplicated, block: B:486:0x0da5  */
    /* JADX WARN: Code duplicated, block: B:489:0x0db1  */
    /* JADX WARN: Code duplicated, block: B:491:0x0dc8  */
    /* JADX WARN: Code duplicated, block: B:494:0x0dd3  */
    /* JADX WARN: Code duplicated, block: B:496:0x0de9  */
    /* JADX WARN: Code duplicated, block: B:499:0x0df6  */
    /* JADX WARN: Code duplicated, block: B:501:0x0dfe  */
    /* JADX WARN: Code duplicated, block: B:504:0x0e16  */
    /* JADX WARN: Code duplicated, block: B:659:0x0dec A[SYNTHETIC] */
    /* JADX INFO: renamed from: D5 */
    public List<UserInfo> m30987D5(Envelope envelope, List<User> list) {
        HashMap map;
        ArrayList arrayList;
        HashMap<String, String> map2;
        HashMap map3;
        HashMap map4;
        HashSet hashSet;
        HashMap map5;
        boolean z;
        HashMap map6;
        HashMap map7;
        HashMap<String, List<Media>> map8;
        List list2;
        ArrayList arrayList2;
        int i;
        DynamicLable dynamicLable;
        HashMap map9;
        Iterator<Relationship> it;
        HashSet hashSet2;
        HashMap map10;
        HashMap map11;
        HashMap map12;
        HashMap map13;
        Iterator<DynamicLable> it2;
        CoreSuggested coreSuggested = this;
        coreSuggested.m31059V5(((CoreData) envelope.getModuleData(CoreData.class)).superLikeCount);
        HashMap<String, List<Media>> map14 = new HashMap<>();
        HashMap<String, String> map15 = new HashMap<>();
        CoreModule.m29934N().mo60406zd(envelope, map15);
        if (ura.m195053e().m195057d().mo33918s()) {
            CoreModule.m29934N().mo60273Ee(envelope, map14);
        }
        HashMap map16 = new HashMap();
        if (ura.m195053e().m195057d().mo33940w()) {
            List<CoreMomentInfo> listMo60266Ca = CoreModule.m29934N().mo60266Ca(envelope, CoreMomentInfo.JSON_ADAPTER);
            if (!vwb.m200296J(listMo60266Ca)) {
                for (CoreMomentInfo coreMomentInfo : listMo60266Ca) {
                    if (map16.containsKey(coreMomentInfo.owner)) {
                        ((List) map16.get(coreMomentInfo.owner)).add(coreMomentInfo);
                    } else {
                        ArrayList arrayList3 = new ArrayList();
                        arrayList3.add(coreMomentInfo);
                        map16.put(coreMomentInfo.owner, arrayList3);
                    }
                }
            }
        }
        HashMap<String, NewTags> map17 = new HashMap<>();
        if (!vwb.m200296J(((CommonData) envelope.getModuleData(CommonData.class)).users)) {
            for (User user : ((CommonData) envelope.getModuleData(CommonData.class)).users) {
                if (NullChecker.m81303a(user.settings) && NullChecker.m81303a(user.settings.omsSetting) && !vwb.m200296J(user.settings.omsSetting.tags)) {
                    for (OmsNewTags omsNewTags : user.settings.omsSetting.tags) {
                        NewTags newTagsNew_ = NewTags.new_();
                        String str = omsNewTags.f38801id;
                        newTagsNew_.f20457id = str;
                        newTagsNew_.name = omsNewTags.name;
                        newTagsNew_.categories = omsNewTags.categories;
                        newTagsNew_.icon = omsNewTags.icon;
                        newTagsNew_.status = omsNewTags.status;
                        newTagsNew_.localTagUserCounts = omsNewTags.count;
                        map17.put(str, newTagsNew_);
                    }
                }
            }
            coreSuggested.f19403d0.onNext(map17);
        }
        HashMap map18 = new HashMap();
        if (!vwb.m200296J(((CoreData) envelope.getModuleData(CoreData.class)).cardsIcons)) {
            for (CardsIcons cardsIcons : ((CoreData) envelope.getModuleData(CoreData.class)).cardsIcons) {
                if (NullChecker.m81303a(cardsIcons) && cardsIcons.likedMeBottomIcon.icon.contains("liked_me")) {
                    map18.put(cardsIcons.userId, cardsIcons.likedMeBottomIcon.context);
                }
            }
        }
        List<CardCornerMark> list3 = ((CoreData) envelope.getModuleData(CoreData.class)).cardCornerMarks;
        HashMap map19 = new HashMap();
        List<SuggestedComplimentItem> list4 = ((CoreData) envelope.getModuleData(CoreData.class)).compliments;
        if (!vwb.m200296J(list4)) {
            for (SuggestedComplimentItem suggestedComplimentItem : list4) {
                if (NullChecker.m81303a(suggestedComplimentItem) && !TextUtils.isEmpty(suggestedComplimentItem.senderId)) {
                    map19.putIfAbsent(suggestedComplimentItem.senderId, suggestedComplimentItem);
                }
            }
        }
        HashMap map20 = new HashMap();
        if (CoreModule.m29934N().mo60294M8() && !vwb.m200296J(((CoreData) envelope.getModuleData(CoreData.class)).states)) {
            for (BubbleInfo bubbleInfo : ((CoreData) envelope.getModuleData(CoreData.class)).states) {
                if (NullChecker.m81303a(bubbleInfo) && NullChecker.m81303a(bubbleInfo.owner)) {
                    map20.put(bubbleInfo.owner.f38803id, bubbleInfo);
                }
            }
        }
        HashMap map21 = new HashMap();
        if (!vwb.m200296J(((CoreData) envelope.getModuleData(CoreData.class)).cardStyles)) {
            for (CardStyle cardStyle : ((CoreData) envelope.getModuleData(CoreData.class)).cardStyles) {
                if (NullChecker.m81303a(cardStyle) && cardStyle.label.contains("liked_me")) {
                    String str2 = cardStyle.userId;
                    map21.put(str2, str2);
                }
            }
        }
        HashMap map22 = new HashMap();
        if (!vwb.m200296J(((CoreData) envelope.getModuleData(CoreData.class)).cardModels)) {
            for (CardModel cardModel : ((CoreData) envelope.getModuleData(CoreData.class)).cardModels) {
                if (NullChecker.m81303a(cardModel) && !vwb.m200296J(cardModel.dynamicLabels)) {
                    map22.put(cardModel.userId, cardModel.dynamicLabels);
                }
            }
        }
        HashMap map23 = new HashMap();
        if (!vwb.m200296J(((CoreData) envelope.getModuleData(CoreData.class)).dynamicLabels)) {
            Iterator<DynamicLable> it3 = ((CoreData) envelope.getModuleData(CoreData.class)).dynamicLabels.iterator();
            while (it3.hasNext()) {
                DynamicLable next = it3.next();
                if (NullChecker.m81303a(next)) {
                    it2 = it3;
                    if (!TextUtils.isEmpty(next.type)) {
                        map23.put(next.type, next);
                    }
                } else {
                    it2 = it3;
                }
                it3 = it2;
            }
        }
        new HashMap();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        HashMap map24 = map23;
        HashMap map25 = new HashMap();
        HashMap map26 = map22;
        HashMap map27 = new HashMap();
        HashMap map28 = map16;
        if (!vwb.m200296J(((CoreData) envelope.getModuleData(CoreData.class)).likedMes)) {
            Iterator<CardStyle> it4 = ((CoreData) envelope.getModuleData(CoreData.class)).likedMes.iterator();
            while (it4.hasNext()) {
                Iterator<CardStyle> it5 = it4;
                CardStyle next2 = it4.next();
                if (NullChecker.m81303a(next2)) {
                    map13 = map19;
                    if (next2.label.contains("liked_me")) {
                        String str3 = next2.userId;
                        map27.put(str3, str3);
                    }
                } else {
                    map13 = map19;
                }
                map19 = map13;
                it4 = it5;
            }
        }
        HashMap map29 = map19;
        HashMap map30 = new HashMap();
        if (ura.m195053e().m195057d().mo33681Er() && !vwb.m200296J(((CoreData) envelope.getModuleData(CoreData.class)).literatures)) {
            for (Iterator<Literatures> it6 = ((CoreData) envelope.getModuleData(CoreData.class)).literatures.iterator(); it6.hasNext(); it6 = it6) {
                Literatures next3 = it6.next();
                if (NullChecker.m81303a(next3)) {
                    map30.put(next3.f20433id, next3);
                }
            }
        }
        HashMap map31 = new HashMap();
        if (ura.m195053e().m195057d().mo33681Er() && !vwb.m200296J(((CoreData) envelope.getModuleData(CoreData.class)).literaturesComments)) {
            Iterator<LiteraturesComments> it7 = ((CoreData) envelope.getModuleData(CoreData.class)).literaturesComments.iterator();
            while (it7.hasNext()) {
                it7 = it7;
                LiteraturesComments next4 = it7.next();
                if (next4 != null) {
                    HashMap map32 = map30;
                    HashMap<String, List<Media>> map33 = map14;
                    if (CoreModule.f17545c.f19639e0.m169443T7(next4.literatureID)) {
                        HashMap map34 = map18;
                        LiteraturesComments literaturesCommentsM169421N9 = CoreModule.f17545c.f19639e0.m169421N9(CoreModule.m29931H().userId(), next4.literatureID);
                        if (NullChecker.m81303a(literaturesCommentsM169421N9)) {
                            next4.updatedTime = literaturesCommentsM169421N9.updatedTime;
                        }
                        ArrayList arrayList4 = (ArrayList) map31.get(next4.userID);
                        if (arrayList4 == null) {
                            ArrayList arrayList5 = new ArrayList();
                            arrayList5.add(next4);
                            map31.put(next4.userID, arrayList5);
                        } else {
                            arrayList4.add(next4);
                            map31.put(next4.userID, arrayList4);
                        }
                        map30 = map32;
                        map14 = map33;
                        map18 = map34;
                    } else {
                        map30 = map32;
                        map14 = map33;
                    }
                }
            }
        }
        HashMap<String, List<Media>> map35 = map14;
        HashMap map36 = map30;
        HashMap map37 = map18;
        HashMap map38 = new HashMap();
        if (ura.m195053e().m195057d().mo33940w() && !vwb.m200296J(((CoreData) envelope.getModuleData(CoreData.class)).literaturesComments)) {
            for (LiteraturesComments literaturesComments : ((CoreData) envelope.getModuleData(CoreData.class)).literaturesComments) {
                ArrayList arrayList6 = (ArrayList) map38.get(literaturesComments.userID);
                if (arrayList6 == null) {
                    ArrayList arrayList7 = new ArrayList();
                    arrayList7.add(literaturesComments);
                    map38.put(literaturesComments.userID, arrayList7);
                } else {
                    arrayList6.add(literaturesComments);
                    map38.put(literaturesComments.userID, arrayList6);
                }
            }
        }
        HashMap map39 = new HashMap();
        if (ura.m195053e().m195057d().mo33855is() && !vwb.m200296J(((CoreData) envelope.getModuleData(CoreData.class)).profileLikesComments)) {
            Iterator<ProfileLikeComment> it8 = ((CoreData) envelope.getModuleData(CoreData.class)).profileLikesComments.iterator();
            while (it8.hasNext()) {
                ProfileLikeComment next5 = it8.next();
                if (next5 != null) {
                    Iterator<ProfileLikeComment> it9 = it8;
                    ArrayList arrayList8 = (ArrayList) map39.get(next5.userId);
                    if (arrayList8 == null) {
                        ArrayList arrayList9 = new ArrayList();
                        arrayList9.add(next5);
                        map39.put(next5.userId, arrayList9);
                    } else {
                        arrayList8.add(next5);
                        map39.put(next5.userId, arrayList8);
                    }
                    it8 = it9;
                }
            }
        }
        HashMap map40 = new HashMap();
        List<RecommendMessage> list5 = ((CommonData) envelope.getModuleData(CommonData.class)).recommendMessage;
        if (!vwb.m200296J(list5)) {
            Iterator<RecommendMessage> it10 = list5.iterator();
            while (it10.hasNext()) {
                Iterator<RecommendMessage> it11 = it10;
                RecommendMessage next6 = it10.next();
                if (NullChecker.m81303a(next6)) {
                    List arrayList10 = (List) map40.get(next6.userId);
                    if (arrayList10 == null) {
                        arrayList10 = new ArrayList();
                    }
                    arrayList10.add(next6);
                    map40.put(next6.userId, arrayList10);
                }
                map39 = map39;
                it10 = it11;
            }
        }
        HashMap map41 = map39;
        HashMap map42 = new HashMap();
        List<UserGreetInfo> list6 = ((CoreData) envelope.getModuleData(CoreData.class)).greets;
        if (!vwb.m200296J(list6)) {
            Iterator<UserGreetInfo> it12 = list6.iterator();
            while (it12.hasNext()) {
                Iterator<UserGreetInfo> it13 = it12;
                UserGreetInfo next7 = it12.next();
                if (NullChecker.m81303a(next7)) {
                    map42.put(next7.userId, next7);
                }
                map38 = map38;
                it12 = it13;
            }
        }
        HashMap map43 = map38;
        HashMap map44 = new HashMap();
        List<UserActivityInfo> list7 = ((CoreData) envelope.getModuleData(CoreData.class)).userActivityInfos;
        if (list7 != null) {
            Iterator<UserActivityInfo> it14 = list7.iterator();
            while (it14.hasNext()) {
                Iterator<UserActivityInfo> it15 = it14;
                UserActivityInfo next8 = it14.next();
                map44.put(next8.userId, next8);
                map42 = map42;
                it14 = it15;
            }
        }
        HashMap map45 = map42;
        HashMap map46 = new HashMap();
        if (!vwb.m200296J(((CoreData) envelope.getModuleData(CoreData.class)).cardExtraInfos)) {
            Iterator<CardExtraInfo> it16 = ((CoreData) envelope.getModuleData(CoreData.class)).cardExtraInfos.iterator();
            while (it16.hasNext()) {
                Iterator<CardExtraInfo> it17 = it16;
                CardExtraInfo next9 = it16.next();
                if (NullChecker.m81303a(next9)) {
                    map12 = map31;
                    if (!TextUtils.isEmpty(next9.userId) && !TextUtils.isEmpty(next9.descriptionId) && !map46.containsKey(next9.userId)) {
                        map46.put(next9.userId, next9);
                    }
                } else {
                    map12 = map31;
                }
                map31 = map12;
                it16 = it17;
            }
        }
        HashMap map47 = map31;
        HashSet hashSet5 = new HashSet();
        if (!vwb.m200296J(((CoreData) envelope.getModuleData(CoreData.class)).cardModels)) {
            Iterator<CardModel> it18 = ((CoreData) envelope.getModuleData(CoreData.class)).cardModels.iterator();
            while (it18.hasNext()) {
                Iterator<CardModel> it19 = it18;
                CardModel next10 = it18.next();
                if (NullChecker.m81303a(next10)) {
                    map10 = map46;
                    map11 = map20;
                    if (next10.borderModel.style.contains("themeMode")) {
                        hashSet5.add(next10.userId);
                    }
                } else {
                    map10 = map46;
                    map11 = map20;
                }
                map46 = map10;
                it18 = it19;
                map20 = map11;
            }
        }
        HashMap map48 = map46;
        HashMap map49 = map20;
        HashMap map50 = new HashMap();
        if (!vwb.m200296J(((CoreData) envelope.getModuleData(CoreData.class)).moments)) {
            for (Iterator<CoreMomentInfo> it20 = ((CoreData) envelope.getModuleData(CoreData.class)).moments.iterator(); it20.hasNext(); it20 = it20) {
                CoreMomentInfo next11 = it20.next();
                if (NullChecker.m81303a(next11)) {
                    map50.put(next11.f56008id, next11);
                }
            }
        }
        HashMap map51 = new HashMap();
        if (!vwb.m200296J(((CoreData) envelope.getModuleData(CoreData.class)).cardInfos)) {
            Iterator<CardInfos> it21 = ((CoreData) envelope.getModuleData(CoreData.class)).cardInfos.iterator();
            while (it21.hasNext()) {
                Iterator<CardInfos> it22 = it21;
                CardInfos next12 = it21.next();
                if (NullChecker.m81303a(next12)) {
                    map51.put(next12.userId, next12);
                }
                map44 = map44;
                it21 = it22;
            }
        }
        HashMap map52 = map44;
        HashMap map53 = new HashMap();
        if (!vwb.m200296J(((CoreData) envelope.getModuleData(CoreData.class)).idealInfos)) {
            Iterator<IdealInfo> it23 = ((CoreData) envelope.getModuleData(CoreData.class)).idealInfos.iterator();
            while (it23.hasNext()) {
                Iterator<IdealInfo> it24 = it23;
                IdealInfo next13 = it23.next();
                if (NullChecker.m81303a(next13)) {
                    map53.put(next13.f20421id, next13);
                }
                map25 = map25;
                it23 = it24;
            }
        }
        HashMap map54 = map25;
        HashMap map55 = new HashMap();
        HashMap map56 = new HashMap();
        HashSet hashSet6 = hashSet3;
        if (!vwb.m200296J(((CoreData) envelope.getModuleData(CoreData.class)).cardModels)) {
            Iterator<CardModel> it25 = ((CoreData) envelope.getModuleData(CoreData.class)).cardModels.iterator();
            while (it25.hasNext()) {
                Iterator<CardModel> it26 = it25;
                CardModel next14 = it25.next();
                if (NullChecker.m81303a(next14) && next14.isRecommendMomentCard() && ura.m195053e().m195057d().mo33807bq()) {
                    hashSet2 = hashSet4;
                    if (map51.containsKey(next14.userId)) {
                        CardInfos cardInfos = (CardInfos) map51.get(next14.userId);
                        if (NullChecker.m81303a(cardInfos)) {
                            cardInfos.momentLikedYou = next14.momentLikedYou || !TextUtils.isEmpty((CharSequence) map27.get(next14.userId));
                            map51.put(next14.userId, cardInfos);
                        }
                    }
                    map55.put(next14.userId, Boolean.valueOf(next14.isRecommendMomentCard()));
                    if (NullChecker.m81303a(next14.extraData)) {
                        map56.put(next14.userId, next14.extraData.momentId);
                    }
                } else {
                    map21 = map21;
                    hashSet2 = hashSet4;
                }
                if (CoreModule.m29935P().m94654e().mo34990wq() && map51.containsKey(next14.userId)) {
                    CardInfos cardInfos2 = (CardInfos) map51.get(next14.userId);
                    cardInfos2.boostLikeYou = next14.boostLikeYou;
                    map51.put(next14.userId, cardInfos2);
                }
                hashSet4 = hashSet2;
                it25 = it26;
                map21 = map21;
            }
        }
        HashMap map57 = map21;
        HashSet hashSet7 = hashSet4;
        HashMap map58 = new HashMap();
        if (CoreModule.m29935P().m94656g().mo35048b8()) {
            List<Relationship> list8 = ((CoreData) envelope.getModuleData(CoreData.class)).relationships;
            if (!vwb.m200296J(list8)) {
                Iterator<Relationship> it27 = list8.iterator();
                while (it27.hasNext()) {
                    Relationship next15 = it27.next();
                    if (NullChecker.m81303a(next15)) {
                        it = it27;
                        if (vwb.m200296J(next15.status)) {
                            map9 = map27;
                        } else {
                            map9 = map27;
                            if (next15.status.contains(MatchFrom.get("pinLike"))) {
                                map58.put(next15.f38806id, next15);
                            }
                        }
                    } else {
                        map9 = map27;
                        it = it27;
                    }
                    it27 = it;
                    map27 = map9;
                }
            }
        }
        HashMap map59 = map27;
        HashSet hashSet8 = new HashSet();
        if (CoreModule.f17557o.m195057d().mo33716Lc()) {
            List<CardModel> list9 = ((CoreData) envelope.getModuleData(CoreData.class)).cardModels;
            if (!vwb.m200296J(list9)) {
                Iterator<CardModel> it28 = list9.iterator();
                while (it28.hasNext()) {
                    CardModel next16 = it28.next();
                    Iterator<CardModel> it29 = it28;
                    if (next16.selectionUser) {
                        hashSet8.add(next16.userId);
                    }
                    it28 = it29;
                }
            }
        }
        HashMap<String, ValueObject> map60 = new HashMap<>();
        HashMap<String, ValueObject> map61 = new HashMap<>();
        HashSet hashSet9 = hashSet8;
        CoreModule.m29936Q().mo67221He(map60, map61, envelope);
        HashSet hashSet10 = new HashSet();
        if (CoreModule.f17557o.m195057d().mo33798ak() || ura.m195053e().m195057d().mo33953yg()) {
            map = map58;
            List<FakePhotoFeedback> list10 = ((CoreData) envelope.getModuleData(CoreData.class)).fakePhotoFeedback;
            if (!vwb.m200296J(list10)) {
                Iterator<FakePhotoFeedback> it30 = list10.iterator();
                while (it30.hasNext()) {
                    Iterator<FakePhotoFeedback> it31 = it30;
                    FakePhotoFeedback next17 = it30.next();
                    HashMap<String, ValueObject> map62 = map61;
                    HashMap<String, ValueObject> map63 = map60;
                    if (next17.show == 1) {
                        hashSet10.add(next17.f20390id);
                    }
                    map61 = map62;
                    it30 = it31;
                    map60 = map63;
                }
            }
        } else {
            map = map58;
        }
        HashMap<String, ValueObject> map64 = map60;
        HashMap<String, ValueObject> map65 = map61;
        HashMap<String, String> map66 = new HashMap<>();
        HashMap<String, IPRegion> map67 = new HashMap<>();
        if (ura.m195053e().m195057d().mo33940w()) {
            List<Device> list11 = ((CommonData) envelope.getModuleData(CommonData.class)).devices;
            if (!vwb.m200296J(list11)) {
                for (Iterator<Device> it32 = list11.iterator(); it32.hasNext(); it32 = it32) {
                    Device next18 = it32.next();
                    map66.put(next18.f38738id, next18.name);
                }
            }
            List<IPRegion> list12 = ((CoreData) envelope.getModuleData(CoreData.class)).ipRegion;
            if (!vwb.m200296J(list12)) {
                for (Iterator<IPRegion> it33 = list12.iterator(); it33.hasNext(); it33 = it33) {
                    IPRegion next19 = it33.next();
                    map67.put(next19.f20418id, next19);
                }
            }
        }
        HashMap map68 = new HashMap();
        if (CoreModule.m29935P().m94651a().mo33543m7()) {
            List<CreditScoreData> list13 = ((CoreData) envelope.getModuleData(CoreData.class)).creditScores;
            if (!vwb.m200296J(list13)) {
                for (CreditScoreData creditScoreData : list13) {
                    map68.put(creditScoreData.f20384id, creditScoreData);
                }
            }
        }
        ArrayList arrayList11 = new ArrayList();
        if (!vwb.m200296J(list)) {
            Iterator<User> it34 = list.iterator();
            while (it34.hasNext()) {
                User next20 = it34.next();
                it34 = it34;
                if (NullChecker.m81303a(next20)) {
                    ArrayList arrayList12 = arrayList11;
                    if (coreSuggested.f19388Y.contains(next20.f56011id)) {
                        arrayList = arrayList12;
                    } else if (coreSuggested.f19343H2.m221515e() == null || vwb.m200296J(coreSuggested.f19343H2.m221515e().f153135a) || !coreSuggested.f19343H2.m221515e().f153135a.get(0).equals(next20.f56011id)) {
                        UserInfo userInfo = new UserInfo();
                        CardInfos cardInfos3 = (CardInfos) map51.get(next20.f56011id);
                        String str4 = next20.f56011id;
                        userInfo.f19472id = str4;
                        userInfo.ussTags = next20.ussTags;
                        userInfo.hierarchy = next20.hierarchy;
                        userInfo.recommendMessage = (List) map40.get(str4);
                        userInfo.hasMoment = map15.containsKey(userInfo.f19472id);
                        userInfo.isThemeCard = hashSet5.contains(userInfo.f19472id);
                        userInfo.isCoreMomentCard = map55.containsKey(userInfo.f19472id);
                        userInfo.idealInfo = (IdealInfo) map53.get(userInfo.f19472id);
                        String str5 = (String) map56.get(userInfo.f19472id);
                        if (TextUtils.isEmpty(str5)) {
                            userInfo.coreMomentInfo = null;
                        } else {
                            userInfo.coreMomentInfo = (CoreMomentInfo) map50.get(str5);
                        }
                        CardInfos cardInfosNew_ = cardInfos3 == null ? CardInfos.new_() : cardInfos3;
                        cardInfosNew_.momentId = str5;
                        userInfo.cardInfos = cardInfosNew_;
                        if (ura.m195053e().m195055b().mo33649wf() && (!next20.isFemale() || next20.superLikedMe() || next20.letter())) {
                            map5 = map57;
                            z = true;
                        } else {
                            map5 = map57;
                            z = true;
                            userInfo.hasLikeMeSlideCardTop = !TextUtils.isEmpty((CharSequence) map5.get(userInfo.f19472id));
                        }
                        map57 = map5;
                        HashSet hashSet11 = hashSet7;
                        if (hashSet11.contains(userInfo.f19472id)) {
                            userInfo.meetAgain = z;
                        }
                        hashSet7 = hashSet11;
                        HashSet hashSet12 = hashSet6;
                        if (hashSet12.contains(userInfo.f19472id)) {
                            userInfo.newUser = true;
                        }
                        hashSet6 = hashSet12;
                        map54 = map54;
                        if (map54.containsKey(userInfo.f19472id)) {
                            userInfo.friendSenseExamLikeCnt = ((Integer) map54.get(userInfo.f19472id)).intValue();
                        }
                        if (CoreModule.m29935P().m94656g().mo35087yc()) {
                            map52 = map52;
                            userInfo.userActivityInfo = (UserActivityInfo) map52.get(userInfo.f19472id);
                        } else {
                            map52 = map52;
                        }
                        if (CoreModule.m29934N().mo60294M8()) {
                            map6 = map49;
                            userInfo.userState = (BubbleInfo) map6.get(userInfo.f19472id);
                        } else {
                            map6 = map49;
                        }
                        map49 = map6;
                        HashMap map69 = map37;
                        userInfo.hasLikeMeFrom = (String) map69.get(userInfo.f19472id);
                        if (NullChecker.m81303a(null)) {
                            throw null;
                        }
                        if (ura.m195053e().m195057d().mo33821er()) {
                            map37 = map69;
                            map7 = map59;
                            if (ura.m195053e().m195057d().mo33894oe()) {
                                userInfo.hasLikeMeSlideCardReward = !TextUtils.isEmpty((CharSequence) map7.get(userInfo.f19472id));
                            }
                        } else {
                            map37 = map69;
                            map7 = map59;
                            userInfo.hasLikeMeSlideCardBottom = !TextUtils.isEmpty((CharSequence) map7.get(userInfo.f19472id));
                        }
                        if (ura.m195053e().m195057d().mo33918s()) {
                            map59 = map7;
                            map8 = map35;
                            if (map8.containsKey(userInfo.f19472id)) {
                                userInfo.userMedia = map8.get(userInfo.f19472id);
                            }
                        } else {
                            map59 = map7;
                            map8 = map35;
                        }
                        map35 = map8;
                        userInfo.compliment = (SuggestedComplimentItem) map29.get(userInfo.f19472id);
                        HashMap map70 = map28;
                        if (map70.containsKey(userInfo.f19472id)) {
                            userInfo.coreMomentInfoList = (List) map70.get(userInfo.f19472id);
                        }
                        map28 = map70;
                        map48 = map48;
                        if (map48.containsKey(userInfo.f19472id)) {
                            userInfo.descriptionContent = ((CardExtraInfo) map48.get(userInfo.f19472id)).descriptionContent;
                            userInfo.descriptionId = ((CardExtraInfo) map48.get(userInfo.f19472id)).descriptionId;
                        }
                        if (map68.containsKey(userInfo.f19472id)) {
                            userInfo.creditScore = (CreditScoreData) map68.get(userInfo.f19472id);
                        } else {
                            userInfo.creditScore = null;
                        }
                        if (ura.m195053e().m195057d().mo33681Er()) {
                            HashMap map71 = map47;
                            if (map71.containsKey(userInfo.f19472id)) {
                                ArrayList arrayList13 = (ArrayList) map71.get(userInfo.f19472id);
                                if (!vwb.m200296J(arrayList13)) {
                                    Collections.sort(arrayList13, new Comparator() { // from class: l.i4b
                                        @Override // java.util.Comparator
                                        public final int compare(Object obj, Object obj2) {
                                            return CoreSuggested.m30851C3((LiteraturesComments) obj, (LiteraturesComments) obj2);
                                        }
                                    });
                                }
                                List<LiteraturesComments> list14 = (List) map71.get(userInfo.f19472id);
                                userInfo.literaturesComments = list14;
                                if (!vwb.m200296J(list14)) {
                                    Iterator<LiteraturesComments> it35 = userInfo.literaturesComments.iterator();
                                    while (it35.hasNext()) {
                                        LiteraturesComments next21 = it35.next();
                                        if (NullChecker.m81303a(next21)) {
                                            next21.localLiteratures = (Literatures) map36.get(next21.literatureID);
                                            it35 = it35;
                                            map71 = map71;
                                        }
                                    }
                                }
                                map47 = map71;
                            } else {
                                map47 = map71;
                                map53 = map53;
                            }
                        } else {
                            map47 = map47;
                            map53 = map53;
                        }
                        if (ura.m195053e().m195057d().mo33940w()) {
                            map2 = map15;
                            HashMap<String, ValueObject> map72 = map65;
                            map65 = map72;
                            map3 = map50;
                            ura.m195053e().m195057d().mo33698Hq(userInfo.f19472id, map64.get(userInfo.f19472id), map72.get(userInfo.f19472id));
                            HashMap map73 = map43;
                            if (map73.containsKey(userInfo.f19472id)) {
                                ArrayList<LiteraturesComments> arrayList14 = (ArrayList) map73.get(userInfo.f19472id);
                                if (vwb.m200296J(arrayList14)) {
                                    map43 = map73;
                                } else {
                                    for (LiteraturesComments literaturesComments2 : arrayList14) {
                                        if (NullChecker.m81303a(literaturesComments2)) {
                                            literaturesComments2.localLiteratures = (Literatures) map36.get(literaturesComments2.literatureID);
                                            map73 = map73;
                                        }
                                    }
                                    map43 = map73;
                                    CoreModule.f17545c.f19639e0.m169413L9(userInfo.f19472id, arrayList14);
                                }
                            } else {
                                map43 = map73;
                            }
                        } else {
                            map2 = map15;
                            map65 = map65;
                            map3 = map50;
                        }
                        if (ura.m195053e().m195057d().mo33855is()) {
                            map41 = map41;
                            if (map41.containsKey(userInfo.f19472id)) {
                                ArrayList arrayList15 = (ArrayList) map41.get(userInfo.f19472id);
                                if (!vwb.m200296J(arrayList15)) {
                                    Collections.sort(arrayList15, new Comparator() { // from class: l.j4b
                                        @Override // java.util.Comparator
                                        public final int compare(Object obj, Object obj2) {
                                            return CoreSuggested.m30889V3((ProfileLikeComment) obj, (ProfileLikeComment) obj2);
                                        }
                                    });
                                    userInfo.profileLikeCommentId = ((ProfileLikeComment) arrayList15.get(0)).f20475id;
                                }
                            }
                            if (ura.m195053e().m195057d().mo33951y()) {
                                map4 = map45;
                                if (map4.containsKey(userInfo.f19472id)) {
                                    userInfo.canGreet = ((UserGreetInfo) map4.get(userInfo.f19472id)).canGreet;
                                }
                            } else {
                                map4 = map45;
                            }
                            if (CoreModule.m29935P().m94656g().mo35048b8()) {
                                map = map;
                                if (map.containsKey(userInfo.f19472id)) {
                                    userInfo.isPinLike = true;
                                    userInfo.topLikeRelationship = (Relationship) map.get(userInfo.f19472id);
                                }
                            } else {
                                map = map;
                            }
                            userInfo.localRelationship = next20.localRelationship;
                            if (map26.size() > 0) {
                                map26 = map26;
                                list2 = (List) map26.get(userInfo.f19472id);
                                arrayList2 = new ArrayList();
                                if (!vwb.m200296J(list2)) {
                                    i = 0;
                                    while (i < list2.size()) {
                                        String str6 = (String) list2.get(i);
                                        List list15 = list2;
                                        HashMap map74 = map24;
                                        dynamicLable = (DynamicLable) map74.get(str6);
                                        if (NullChecker.m81303a(dynamicLable)) {
                                            arrayList2.add(dynamicLable);
                                        }
                                        i++;
                                        map24 = map74;
                                        list2 = list15;
                                    }
                                }
                                map24 = map24;
                                userInfo.dynamicLabelList = arrayList2;
                            } else {
                                map41 = map41;
                                map = map;
                                map24 = map24;
                                map26 = map26;
                            }
                            if (ura.m195053e().m195057d().mo33940w()) {
                                ura.m195053e().m195057d().mo33660Bf(userInfo.f19472id, map66, map67);
                            }
                            userInfo.isShowFakePhotoFeedback = hashSet10.contains(userInfo.f19472id);
                            hashSet = hashSet9;
                            userInfo.selectionUser = hashSet.contains(userInfo.f19472id);
                            arrayList = arrayList12;
                            arrayList.add(userInfo);
                            map24 = map24;
                            arrayList11 = arrayList;
                            hashSet9 = hashSet;
                            map45 = map4;
                            map15 = map2;
                            map53 = map53;
                            map50 = map3;
                            map47 = map47;
                            map65 = map65;
                            coreSuggested = this;
                            map36 = map36;
                            map26 = map26;
                        } else {
                            map41 = map41;
                        }
                        if (ura.m195053e().m195057d().mo33951y()) {
                            map4 = map45;
                            if (map4.containsKey(userInfo.f19472id)) {
                                userInfo.canGreet = ((UserGreetInfo) map4.get(userInfo.f19472id)).canGreet;
                            }
                        } else {
                            map4 = map45;
                        }
                        if (CoreModule.m29935P().m94656g().mo35048b8()) {
                            map = map;
                            if (map.containsKey(userInfo.f19472id)) {
                                userInfo.isPinLike = true;
                                userInfo.topLikeRelationship = (Relationship) map.get(userInfo.f19472id);
                            }
                        } else {
                            map = map;
                        }
                        userInfo.localRelationship = next20.localRelationship;
                        if (map26.size() > 0) {
                            map26 = map26;
                            list2 = (List) map26.get(userInfo.f19472id);
                            arrayList2 = new ArrayList();
                            if (!vwb.m200296J(list2)) {
                                i = 0;
                                while (i < list2.size()) {
                                    String str7 = (String) list2.get(i);
                                    List list16 = list2;
                                    HashMap map75 = map24;
                                    dynamicLable = (DynamicLable) map75.get(str7);
                                    if (NullChecker.m81303a(dynamicLable)) {
                                        arrayList2.add(dynamicLable);
                                    }
                                    i++;
                                    map24 = map75;
                                    list2 = list16;
                                }
                            }
                            map24 = map24;
                            userInfo.dynamicLabelList = arrayList2;
                        } else {
                            map41 = map41;
                            map = map;
                            map24 = map24;
                            map26 = map26;
                        }
                        if (ura.m195053e().m195057d().mo33940w()) {
                            ura.m195053e().m195057d().mo33660Bf(userInfo.f19472id, map66, map67);
                        }
                        userInfo.isShowFakePhotoFeedback = hashSet10.contains(userInfo.f19472id);
                        hashSet = hashSet9;
                        userInfo.selectionUser = hashSet.contains(userInfo.f19472id);
                        arrayList = arrayList12;
                        arrayList.add(userInfo);
                        map24 = map24;
                        arrayList11 = arrayList;
                        hashSet9 = hashSet;
                        map45 = map4;
                        map15 = map2;
                        map53 = map53;
                        map50 = map3;
                        map47 = map47;
                        map65 = map65;
                        coreSuggested = this;
                        map36 = map36;
                        map26 = map26;
                    } else {
                        arrayList11 = arrayList12;
                    }
                } else {
                    arrayList = arrayList11;
                }
                map53 = map53;
                map2 = map15;
                map3 = map50;
                map4 = map45;
                hashSet = hashSet9;
                map24 = map24;
                arrayList11 = arrayList;
                hashSet9 = hashSet;
                map45 = map4;
                map15 = map2;
                map53 = map53;
                map50 = map3;
                map47 = map47;
                map65 = map65;
                coreSuggested = this;
                map36 = map36;
                map26 = map26;
            }
        }
        return arrayList11;
    }

    /* JADX INFO: renamed from: D6 */
    public final void m30988D6(List<UserInfo> list, List<User> list2) {
        CoreModule.f17545c.f19592O1.f96586S.toString();
        boolean z = m31016K6() && !xma.m210071e4();
        HashSet hashSet = new HashSet();
        for (User user : list2) {
            if ((z && user.isIntlFaceless()) || user.isIntlSpammerOrScammer() || CoreModule.f17545c.f19592O1.f96586S.contains(user.f56011id)) {
                hashSet.add(user.f56011id);
            }
        }
        Iterator<UserInfo> it = list.iterator();
        while (it.hasNext()) {
            if (hashSet.contains(it.next().f19472id)) {
                it.remove();
            }
        }
    }

    /* JADX INFO: renamed from: D7 */
    public final /* synthetic */ void m30989D7(boolean z, C22392a c22392a, Notification notification) {
        if (notification.m221299j() || notification.m221298i()) {
            m31075Z5(z).subscribe(c22392a);
        }
    }

    /* JADX INFO: renamed from: D8 */
    public void m30990D8(String str) {
        this.f72126Q.f19687u0.m30491x7(str);
        m30994E8(str);
        if (CoreModule.m29935P().m94656g().mo35048b8()) {
            this.f72126Q.f19641e2.m112213v3(str);
        }
    }

    /* JADX INFO: renamed from: E5 */
    public final int m30991E5() {
        if (NullChecker.m81303a(CoreModule.f17545c.f19663m0.f19394a0.m221515e())) {
            List<UserInfo> list = CoreModule.f17545c.f19663m0.f19394a0.m221515e().loaded;
            if (!vwb.m200296J(list)) {
                for (int i = 1; i < list.size(); i += 2) {
                    if (!CoreModule.f17545c.f19663m0.f19445r0.contains(list.get(i).f19472id)) {
                        return i;
                    }
                }
            }
        }
        return 1;
    }

    /* JADX INFO: renamed from: E6 */
    public boolean m30992E6(VoiceLiveState voiceLiveState) {
        return (!NullChecker.m81303a(voiceLiveState) || TextUtils.isEmpty(voiceLiveState.voiceLiveId) || TextUtils.isEmpty(voiceLiveState.anchorId) || TextUtils.isEmpty(voiceLiveState.topDesc) || TextUtils.isEmpty(voiceLiveState.title) || vwb.m200296J(voiceLiveState.messages) || vwb.m200296J(voiceLiveState.avatars)) ? false : true;
    }

    /* JADX INFO: renamed from: E7 */
    public final /* synthetic */ void m30993E7(Envelope envelope) {
        CoreData coreData = (CoreData) envelope.getModuleData(CoreData.class);
        if (TextUtils.isEmpty(coreData.payWill)) {
            return;
        }
        this.f72126Q.f19639e0.f149376g3.put(coreData.payWill);
    }

    /* JADX INFO: renamed from: E8 */
    public void m30994E8(final String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        m30998F8(new w9j() { // from class: l.sza
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((CoreSuggested.UserInfo) obj).f19472id.equals(str));
            }
        });
        if (CoreModule.m29935P().m94656g().mo35048b8()) {
            this.f72126Q.f19641e2.m112213v3(str);
        }
    }

    /* JADX INFO: renamed from: F5 */
    public void m30995F5(boolean z) {
        if (z || !NullChecker.m81303a(this.f19430m0.m221515e()) || mqi0.m155944o() - this.f19430m0.m221515e().longValue() >= Constants.ONE_MIN_IN_MILLIS) {
            if (m30996F6()) {
                this.f19430m0.onNext(Long.valueOf(mqi0.m155944o()));
                return;
            }
            scheduled("verified-isolation/likedby-info" + mqi0.m155944o(), 0, new v9j() { // from class: l.l3b
                @Override // p149l.v9j, java.util.concurrent.Callable
                public final Object call() {
                    return this.f125857a.m31044R6();
                }
            }).doOnError(new e30() { // from class: l.m3b
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f131031a.m31048S6((Throwable) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: F6 */
    public boolean m30996F6() {
        return m31125m6() >= ura.m195053e().m195057d().mo33952y6();
    }

    /* JADX INFO: renamed from: F7 */
    public final /* synthetic */ C22306c m30997F7() {
        return ia20.m135121e(new v9j() { // from class: l.u0b
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4728a.f19494P.auth().m185898q(C4728a.m31200G("/pay-will")).m185887f().m185883b();
            }
        }).doOnNext(new e30() { // from class: l.v0b
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f179085a.m30993E7((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: F8 */
    public void m30998F8(w9j<UserInfo, Boolean> w9jVar) {
        if (this.f19394a0.m221515e() == null || vwb.m200296J(this.f19394a0.m221515e().loaded)) {
            return;
        }
        Iterator<UserInfo> it = this.f19394a0.m221515e().loaded.iterator();
        while (it.hasNext()) {
            UserInfo next = it.next();
            if (w9jVar.call(next).booleanValue()) {
                this.f19388Y.remove(next.f19472id);
                it.remove();
                this.f19394a0.m221515e().setRefreshValue(true);
                C22392a<PartialListOpt<UserInfo>> c22392a = this.f19394a0;
                c22392a.onNext(c22392a.m221515e().setReason(PartialListOpt.RefreshReason.removeUserFromSuggested));
                return;
            }
        }
    }

    /* JADX INFO: renamed from: G5 */
    public void m30999G5(Envelope envelope) {
        if (ura.m195053e().m195057d().mo33704Is()) {
            List<User> list = ((CommonData) envelope.getModuleData(CommonData.class)).users;
            if (vwb.m200296J(list)) {
                return;
            }
            ListIterator<User> listIterator = list.listIterator();
            while (listIterator.hasNext()) {
                if (m31012J6(listIterator.next())) {
                    listIterator.remove();
                }
            }
        }
    }

    /* JADX INFO: renamed from: G6 */
    public boolean m31000G6() {
        return this.f19394a0.m221515e() == null || vwb.m200296J(this.f19394a0.m221515e().loaded);
    }

    /* JADX INFO: renamed from: G7 */
    public final /* synthetic */ Boolean m31001G7(CardPattern cardPattern) {
        return Boolean.valueOf(cardPattern.userId.equals(this.f19394a0.m221515e().loaded.get(0).f19472id));
    }

    /* JADX INFO: renamed from: G8 */
    public void m31002G8(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (this.f19394a0.m221515e() != null && !vwb.m200296J(this.f19394a0.m221515e().loaded)) {
            Iterator<UserInfo> it = this.f19394a0.m221515e().loaded.iterator();
            while (it.hasNext()) {
                UserInfo next = it.next();
                if (NullChecker.m81303a(next) && str.equals(next.f19472id)) {
                    this.f19388Y.remove(next.f19472id);
                    it.remove();
                    this.f19394a0.m221515e().setRefreshValue(true);
                    C22392a<PartialListOpt<UserInfo>> c22392a = this.f19394a0;
                    c22392a.onNext(c22392a.m221515e().setReason(PartialListOpt.RefreshReason.removeUserWhenOnlineMatchSuccess));
                    break;
                }
            }
        }
        Act.C4299r c4299rForeground_ = Act.foreground_();
        if (c4299rForeground_ != null) {
            Activity activity = c4299rForeground_.f15343a.get();
            if (NullChecker.m81303a(activity) && ura.m195053e().m195057d().mo33665Ce(activity)) {
                this.f72126Q.f19687u0.m30491x7(str);
            }
        }
        this.f72126Q.f19687u0.m30488w7(str);
    }

    /* JADX INFO: renamed from: H5 */
    public void m31003H5() {
        if (ura.m195053e().m195057d().mo33704Is() && NullChecker.m81303a(this.f19394a0.m221515e())) {
            List<UserInfo> list = this.f19394a0.m221515e().loaded;
            ArrayList arrayList = new ArrayList();
            if (vwb.m200296J(list)) {
                return;
            }
            int iMo33826fd = ura.m195053e().m195057d().mo33826fd();
            ListIterator<UserInfo> listIterator = list.listIterator();
            while (listIterator.hasNext()) {
                UserInfo next = listIterator.next();
                if (!next.isVirtualCard() && !TextUtils.isEmpty(next.f19472id) && next.checkPointTime > 0 && mqi0.m155944o() - next.checkPointTime >= ((long) iMo33826fd) * Constants.ONE_MIN_IN_MILLIS) {
                    arrayList.add(next.f19472id);
                }
            }
            if (vwb.m200296J(arrayList)) {
                return;
            }
            m31007I5(arrayList);
        }
    }

    /* JADX INFO: renamed from: H6 */
    public final boolean m31004H6(LikeExtraData likeExtraData) {
        return NullChecker.m81303a(likeExtraData) && NullChecker.m81303a(likeExtraData.matchScData) && TextUtils.equals(likeExtraData.matchScData.actionname, "like") && TextUtils.equals(likeExtraData.matchScData.updateRelationshipsModuleId, MatchScData.ModuleId.boost_result_rev);
    }

    /* JADX INFO: renamed from: H7 */
    public final /* synthetic */ C22306c m31005H7(String str, String str2) {
        final String str3 = "/me/marriage-info/" + str + "/report";
        final JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("action", str2);
        } catch (Exception unused) {
        }
        return ia20.m135121e(new v9j() { // from class: l.g1b
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4728a.f19494P.auth().m185898q(C4728a.m31366w2(str3)).m185893l(utc0.create(Network.JSON, jSONObject.toString())).m185883b();
            }
        }).map(new C4725c()).compose(mkd0.m154951C());
    }

    /* JADX INFO: renamed from: H8 */
    public void m31006H8(List<String> list) {
        if (list == null || list.size() == 0) {
            return;
        }
        boolean z = false;
        if (this.f19394a0.m221515e() != null && !vwb.m200296J(this.f19394a0.m221515e().loaded)) {
            Iterator<UserInfo> it = this.f19394a0.m221515e().loaded.iterator();
            while (it.hasNext()) {
                UserInfo next = it.next();
                if (NullChecker.m81303a(next) && list.contains(next.f19472id)) {
                    this.f19388Y.remove(next.f19472id);
                    it.remove();
                    z = true;
                }
            }
        }
        if (z) {
            this.f19394a0.m221515e().setRefreshValue(true);
            C22392a<PartialListOpt<UserInfo>> c22392a = this.f19394a0;
            c22392a.onNext(c22392a.m221515e().setReason(PartialListOpt.RefreshReason.removeUsersById));
        }
    }

    /* JADX INFO: renamed from: I5 */
    public final void m31007I5(final List<String> list) {
        final HashSet hashSet = new HashSet();
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            hashSet.add(it.next());
        }
        scheduled("check_card_user_invalid", 0, new v9j() { // from class: l.u1b
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f172982a.m31056U6(list, hashSet);
            }
        });
    }

    /* JADX INFO: renamed from: I6 */
    public final boolean m31008I6(LikeExtraData likeExtraData) {
        if (!CoreModule.f17545c.f19635c2.m99148t3() || !CoreModule.m29935P().m94654e().mo34990wq() || !NullChecker.m81303a(likeExtraData) || !NullChecker.m81303a(likeExtraData.matchScData)) {
            return false;
        }
        if (TextUtils.equals(likeExtraData.matchScData.actionname, "like") || TextUtils.equals(likeExtraData.matchScData.actionname, "superlike")) {
            return TextUtils.equals(likeExtraData.matchScData.updateRelationshipsSource, "suggest_user_profile_info") || TextUtils.equals(likeExtraData.matchScData.updateRelationshipsSource, "suggest_users_home");
        }
        return false;
    }

    /* JADX INFO: renamed from: I7 */
    public final /* synthetic */ C22306c m31009I7(final String str) {
        return ia20.m135121e(new v9j() { // from class: l.h1b
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4728a.f19494P.auth().m185898q(C4728a.m31366w2(str)).m185887f().m185883b();
            }
        }).map(new C4724b()).compose(mkd0.m154951C());
    }

    /* JADX INFO: renamed from: I8 */
    public void m31010I8(List<String> list) {
        if (list == null || list.size() == 0 || this.f19394a0.m221515e() == null || vwb.m200296J(this.f19394a0.m221515e().loaded)) {
            return;
        }
        Iterator<UserInfo> it = this.f19394a0.m221515e().loaded.iterator();
        while (it.hasNext()) {
            UserInfo next = it.next();
            if (NullChecker.m81303a(next) && list.contains(next.f19472id)) {
                this.f19388Y.remove(next.f19472id);
                it.remove();
            }
        }
    }

    /* JADX INFO: renamed from: J5 */
    public final boolean m31011J5(User user) {
        if (NullChecker.m81303a(user)) {
            return true;
        }
        return NullChecker.m81303a(this.f19394a0.m221515e()) && !vwb.m200296J(this.f19394a0.m221515e().loaded);
    }

    /* JADX INFO: renamed from: J6 */
    public final boolean m31012J6(User user) {
        if (user.isBannedNew() || user.isBanned()) {
            return true;
        }
        if (vwb.m200296J(user.status)) {
            return false;
        }
        return user.status.contains(UserStatus.get(UserStatus.RISK_TAG_LIKE_EXPOSE)) || user.status.contains(UserStatus.get(UserStatus.RISK_TAG_MOMENT_EXPOSE)) || user.status.contains(UserStatus.get(UserStatus.RISK_TAG_COMMENT_EXPOSE)) || user.status.contains(UserStatus.get(UserStatus.RISK_TAG_GREETING_DISABLED)) || user.status.contains(UserStatus.get(UserStatus.RISK_TAG_GROUP_CHAT_EXPOSE));
    }

    /* JADX INFO: renamed from: J7 */
    public final /* synthetic */ void m31013J7() {
        m31130n8(false);
    }

    /* JADX INFO: renamed from: J8 */
    public boolean m31014J8(UserInfo userInfo) {
        boolean z = false;
        if (this.f19394a0.m221515e() != null && !vwb.m200296J(this.f19394a0.m221515e().loaded)) {
            Iterator<UserInfo> it = this.f19394a0.m221515e().loaded.iterator();
            while (it.hasNext()) {
                UserInfo next = it.next();
                if (NullChecker.m81303a(next) && (next.equals(userInfo) || ((TextUtils.equals(userInfo.f19472id, next.f19472id) && !userInfo.isVirtualCard()) || (next.isVirtualCard() && userInfo.isVirtualCard() && next.virtualCardType == userInfo.virtualCardType)))) {
                    it.remove();
                    this.f19394a0.m221515e().loaded.size();
                    du2.m113670a("BifrostLayout", "删除List数据：" + next.f19472id + ", " + this.f19394a0.m221515e().loaded.size());
                    z = true;
                    break;
                }
            }
            this.f19394a0.m221515e().setRefreshValue(vwb.m200296J(this.f19394a0.m221515e().loaded));
            C22392a<PartialListOpt<UserInfo>> c22392a = this.f19394a0;
            c22392a.onNext(c22392a.m221515e().setReason(PartialListOpt.RefreshReason.REMOVE_BY_BIFROST));
        }
        return z;
    }

    /* JADX INFO: renamed from: K5 */
    public void m31015K5() {
        this.f19331D2.onNext(roj0.f160388a);
        m31079a6(false, true);
    }

    /* JADX INFO: renamed from: K6 */
    public final boolean m31016K6() {
        return "_Test".equals(ABManager.m29352j0("IntlPremiumCards"));
    }

    /* JADX INFO: renamed from: K7 */
    public final /* synthetic */ void m31017K7() {
        if (this.f19376U) {
            return;
        }
        if (this.f19394a0.m221515e() == null || this.f19394a0.m221515e().loaded.isEmpty()) {
            e51.m114748M(new Runnable() { // from class: l.o3b
                @Override // java.lang.Runnable
                public final void run() {
                    this.f141646a.m31013J7();
                }
            });
        }
    }

    /* JADX INFO: renamed from: K8 */
    public void m31018K8(final User user, final User user2, final int i) {
        this.f72126Q.scheduled("user-boost_cancel", -1, new v9j() { // from class: l.p0b
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return ia20.m135121e(new v9j() { // from class: l.q0b
                    @Override // p149l.v9j, java.util.concurrent.Callable
                    public final Object call() {
                        return C4728a.f19494P.auth().m185898q(C4728a.m31299g(user.f56011id, user.f56011id, String.valueOf(qib0.f154717f0), i)).m185887f().m185883b();
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: L5 */
    public void m31019L5() {
        m31027N5();
        m31127m8();
    }

    /* JADX INFO: renamed from: L6 */
    public boolean m31020L6(String str) {
        return this.f19390Y1.containsKey(str);
    }

    /* JADX INFO: renamed from: L7 */
    public final /* synthetic */ Boolean m31021L7(PartialListOpt partialListOpt) {
        if (NullChecker.m81303a(partialListOpt)) {
            return Boolean.TRUE;
        }
        m31026M8();
        return Boolean.FALSE;
    }

    /* JADX INFO: renamed from: L8 */
    public void m31022L8(final User user, final User user2, final int i) {
        this.f72126Q.scheduled("user-boost_like", -1, new v9j() { // from class: l.k0b
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return ia20.m135121e(new v9j() { // from class: l.r0b
                    @Override // p149l.v9j, java.util.concurrent.Callable
                    public final Object call() {
                        return C4728a.f19494P.auth().m185898q(C4728a.m31303h(user.f56011id, user.f56011id, String.valueOf(qib0.f154717f0), i)).m185887f().m185883b();
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: M5 */
    public C22306c<roj0> m31023M5() {
        m31027N5();
        return m31127m8();
    }

    /* JADX INFO: renamed from: M6 */
    public boolean m31024M6(String str) {
        return this.f19393Z1.containsKey(str);
    }

    /* JADX INFO: renamed from: M7 */
    public final /* synthetic */ stc0 m31025M7(boolean z, String str) {
        return C4728a.f19494P.auth().m185898q(z ? m31157x5(str) : C4728a.m31179A2(str)).m185887f().m185883b();
    }

    /* JADX INFO: renamed from: M8 */
    public final void m31026M8() {
        CrashHelper.m81296c(new RuntimeException("推荐列表Null异常:标记位:" + this.f19444q2[0] + Constants.SEPARATOR_COMMA + this.f19444q2[1] + Constants.SEPARATOR_COMMA + this.f19444q2[2]));
    }

    /* JADX INFO: renamed from: N5 */
    public final void m31027N5() {
        if (NullChecker.m81303a(this.f19394a0.m221515e()) && !vwb.m200296J(this.f19394a0.m221515e().loaded)) {
            ListIterator<UserInfo> listIterator = this.f19394a0.m221515e().loaded.listIterator();
            while (listIterator.hasNext()) {
                UserInfo next = listIterator.next();
                if (!TextUtils.isEmpty(next.f19472id)) {
                    this.f19388Y.remove(next.f19472id);
                }
                listIterator.remove();
            }
            this.f19394a0.m221515e().setRefreshValue(true);
            C22392a<PartialListOpt<UserInfo>> c22392a = this.f19394a0;
            c22392a.onNext(c22392a.m221515e().setReason(PartialListOpt.RefreshReason.CLEAR_OLD_DATA));
        }
        m31127m8();
    }

    /* JADX INFO: renamed from: N6 */
    public final boolean m31028N6() {
        return "INTL_LOWACTIVITY_TEST_1".equals(ABManager.m29352j0("INTL_LOWACTIVITY")) || "INTL_LOWACTIVITY_2".equals(ABManager.m29352j0("INTL_LOWACTIVITY")) || "INTL_LOWACTIVITY_1".equals(ABManager.m29352j0("INTL_LOWACTIVITY"));
    }

    /* JADX INFO: renamed from: N7 */
    public final /* synthetic */ void m31029N7(Envelope envelope) {
        m30999G5(envelope);
        if (ConnectivityReceiver.m81286i()) {
            vwb.m200354z(vwb.m200291E(((CommonData) envelope.getModuleData(CommonData.class)).users), new e30() { // from class: l.w3b
                @Override // p149l.e30
                public final void call(Object obj) {
                    CoreSuggested.m30969x3((User) obj);
                }
            });
        }
        this.f72126Q.m31492w3(envelope, null);
    }

    /* JADX INFO: renamed from: N8 */
    public C22306c<roj0> m31030N8(final String str, final String str2) {
        if (TextUtils.isEmpty(str)) {
            return C22306c.just(roj0.f160388a);
        }
        return this.f72126Q.scheduled("reportSuggestMarryUser+" + str, -1, new v9j() { // from class: l.h3b
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f105588a.m31005H7(str, str2);
            }
        });
    }

    /* JADX INFO: renamed from: O5 */
    public void m31031O5() {
        this.f19418i0 = null;
        this.f19421j0 = null;
        this.f19424k0 = 1;
    }

    /* JADX INFO: renamed from: O6 */
    public boolean m31032O6() {
        return this.f19379V.m221515e().booleanValue();
    }

    /* JADX INFO: renamed from: O7 */
    public final /* synthetic */ roj0 m31033O7(int i, String str, Envelope envelope) {
        int iIntValue;
        RelationshipStatus relationshipStatus = RelationshipStatus.get("unknown_");
        if (!vwb.m200296J(((CoreData) envelope.getModuleData(CoreData.class)).relationships)) {
            relationshipStatus = ((CoreData) envelope.getModuleData(CoreData.class)).relationships.get(0).state;
        }
        HashMap<String, String> map = new HashMap<>();
        CoreModule.m29934N().mo60406zd(envelope, map);
        if (!TEnum.equals(relationshipStatus, "matched") && !vwb.m200296J(((CommonData) envelope.getModuleData(CommonData.class)).users)) {
            User user = ((CommonData) envelope.getModuleData(CommonData.class)).users.get(0);
            if (NullChecker.m81303a(user)) {
                UserInfo userInfo = new UserInfo();
                String str2 = user.f56011id;
                userInfo.f19472id = str2;
                userInfo.hasMoment = map.containsKey(str2);
                if (!ura.m195053e().m195057d().mo33867k6() || i <= 1) {
                    userInfo.preSwipedDirection = SwipeDirection.LEFT;
                }
                HashMap<String, String> mapM139448o = j2e0.m139448o(Uri.parse(str));
                if (!TextUtils.isEmpty(mapM139448o.get("pushtype"))) {
                    try {
                        userInfo.userCardPushType = Integer.parseInt(mapM139448o.get("pushtype"));
                        if (!TextUtils.isEmpty(mapM139448o.get(Reason.TYPE))) {
                            userInfo.userCardPushReason = Integer.parseInt(mapM139448o.get(Reason.TYPE));
                        }
                        userInfo.userCardPushTag = mapM139448o.get("tag");
                    } catch (NumberFormatException unused) {
                    }
                    userInfo.isUserCardPush = true;
                }
                String str3 = mapM139448o.get(Oauth2AccessToken.KEY_UID);
                String str4 = mapM139448o.get("showType");
                if (TextUtils.isEmpty(mapM139448o.get("pictureIndex"))) {
                    iIntValue = 0;
                } else {
                    try {
                        iIntValue = Integer.valueOf(mapM139448o.get("pictureIndex")).intValue();
                    } catch (NumberFormatException e) {
                        CrashHelper.m81296c(e);
                        iIntValue = 0;
                    }
                }
                if (ura.m195053e().m195057d().mo33867k6()) {
                    this.f19445r0.add(user.f56011id);
                }
                if (!TextUtils.isEmpty(str3)) {
                    List<Media> list = user.pictures;
                    if (!TextUtils.isEmpty(str4)) {
                        int i2 = 0;
                        for (int i3 = 0; i3 < list.size(); i3++) {
                            if ("video".equals(str4) && list.get(i3).mediaType.startsWith("video/")) {
                                if (i2 == iIntValue) {
                                    CoreModule.f17545c.f19639e0.f149141B0 = xaj0.m207578a(str3, str4, Integer.valueOf(i3));
                                    break;
                                }
                                i2++;
                            } else {
                                if ("picture".equals(str4) && list.get(i3).mediaType.startsWith("image/")) {
                                    if (i2 == iIntValue) {
                                        CoreModule.f17545c.f19639e0.f149141B0 = xaj0.m207578a(str3, str4, Integer.valueOf(i3));
                                        break;
                                    }
                                    i2++;
                                }
                            }
                        }
                    } else if (iIntValue > 0) {
                        CoreModule.f17545c.f19639e0.f149141B0 = xaj0.m207578a(str3, str4, Integer.valueOf(iIntValue));
                    }
                }
                CardInfos cardInfosNew_ = CardInfos.new_();
                cardInfosNew_.userId = userInfo.f19472id;
                if (TextUtils.isEmpty(mapM139448o.get("widget_content"))) {
                    cardInfosNew_.cardName = "idlepush";
                } else {
                    cardInfosNew_.cardName = "phone_widget";
                }
                userInfo.cardInfos = cardInfosNew_;
                m31154w6(userInfo, i);
                if (ura.m195053e().m195057d().mo33802b()) {
                    CoreModule.m29936Q().putLiveState(((CommonData) envelope.getModuleData(CommonData.class)).users);
                }
            }
        }
        return roj0.f160388a;
    }

    /* JADX INFO: renamed from: O8 */
    public C22306c<roj0> m31034O8(String str) {
        return m31030N8(str, "dislike");
    }

    /* JADX INFO: renamed from: P5 */
    public void m31035P5() {
        CoreModule.f17545c.clearRequests("users/suggested", 0);
    }

    /* JADX INFO: renamed from: P6 */
    public final /* synthetic */ void m31036P6(boolean z) {
        this.f19379V.onNext(Boolean.FALSE);
        this.f19376U = false;
        if (CoreModule.f17545c == null || CoreModule.m29931H().userId() == null) {
            return;
        }
        if (z) {
            this.f19337F2.onNext(roj0.f160388a);
        }
        m31039Q5();
        m31127m8();
    }

    /* JADX INFO: renamed from: P7 */
    public final /* synthetic */ stc0 m31037P7() {
        return C4728a.f19494P.auth().m185893l(utc0.create(Network.JSON, "")).m185898q(C4728a.m31200G(this.f19358M2)).m185883b();
    }

    /* JADX INFO: renamed from: P8 */
    public C22306c<roj0> m31038P8(String str) {
        return m31030N8(str, "show");
    }

    /* JADX INFO: renamed from: Q5 */
    public void m31039Q5() {
        CoreModule.f17545c.clearRequests("users/suggested", 0);
        CoreModule.f17545c.clearRequests("users/suggested/insert", 0);
        CoreModule.f17545c.clearRequests("users/suggested/active/insert", 0);
        CoreModule.f17545c.clearRequests("users/suggested/passive/insert", 0);
    }

    /* JADX INFO: renamed from: Q6 */
    public final /* synthetic */ Integer m31040Q6(Envelope envelope) {
        this.f19427l0 = ((CoreData) envelope.getModuleData(CoreData.class)).likedByToday;
        this.f19430m0.onNext(Long.valueOf(mqi0.m155944o()));
        return 0;
    }

    /* JADX INFO: renamed from: Q7 */
    public final /* synthetic */ C22306c m31041Q7() {
        return ia20.m135117a(new v9j() { // from class: l.f1b
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f94062a.m31037P7();
            }
        });
    }

    /* JADX INFO: renamed from: Q8 */
    public void m31042Q8(UserInfo userInfo, int i, SwipeDirection swipeDirection) {
        this.f19418i0 = CoreModule.f17545c.f19639e0.m169430Pa(userInfo.f19472id);
        this.f19424k0 = i;
        this.f19421j0 = userInfo;
        userInfo.preSwipedDirection = swipeDirection;
        userInfo.canUndo = true;
    }

    /* JADX INFO: renamed from: R5 */
    public void m31043R5() {
        if (this.f19394a0.m221515e() == null || vwb.m200296J(this.f19394a0.m221515e().loaded)) {
            return;
        }
        vwb.m200354z(this.f19394a0.m221515e().loaded, new e30() { // from class: l.o4b
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f141759a.m31060V6((CoreSuggested.UserInfo) obj);
            }
        });
        this.f19394a0.onNext(new PartialListOpt(new ArrayList(), this.f19394a0.m221515e().links).setReason(PartialListOpt.RefreshReason.clearSuggestedData));
    }

    /* JADX INFO: renamed from: R6 */
    public final /* synthetic */ C22306c m31044R6() {
        return ia20.m135121e(new v9j() { // from class: l.e4b
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4728a.f19494P.auth().m185887f().m185898q(C4728a.m31200G("/verified-isolation/likedby-info")).m185883b();
            }
        }).map(new w9j() { // from class: l.f4b
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f94751a.m31040Q6((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: R7 */
    public final /* synthetic */ void m31045R7(Envelope envelope, User user, UserInfo userInfo, boolean z) {
        if (vwb.m200296J(((CoreData) envelope.getModuleData(CoreData.class)).relationships)) {
            CrashHelper.m81302i(new Exception("return null relationships"), "core_undo", CrashHelper.ReportLevel.p5, 100);
            return;
        }
        if (TEnum.equals(((CoreData) envelope.getModuleData(CoreData.class)).relationships.get(0).state, "default")) {
            qib0.f154722k0.f176631d.insert(user);
            userInfo.isUndo = true;
            if (!z) {
                userInfo.preSwipedDirection = null;
            }
            this.f72126Q.f19628a1.m134575A(userInfo.f19472id);
            m31154w6(userInfo, 0);
            m31031O5();
        }
    }

    /* JADX INFO: renamed from: R8 */
    public C22306c<roj0> m31046R8() {
        return this.f19331D2.asObservable();
    }

    /* JADX INFO: renamed from: S5 */
    public void m31047S5() {
        this.f72126Q.clearRequests("get_dis_liked_users", 0);
    }

    /* JADX INFO: renamed from: S6 */
    public final /* synthetic */ void m31048S6(Throwable th) {
        this.f19430m0.onNext(Long.valueOf(mqi0.m155944o()));
    }

    /* JADX INFO: renamed from: S7 */
    public final /* synthetic */ Relationship m31049S7(final User user, final UserInfo userInfo, final boolean z, final Envelope envelope) {
        this.f72126Q.m31492w3(envelope, new d30() { // from class: l.m0b
            @Override // p149l.d30
            public final void call() {
                this.f130723a.m31045R7(envelope, user, userInfo, z);
            }
        });
        if (!vwb.m200296J(((CoreData) envelope.getModuleData(CoreData.class)).relationships)) {
            return ((CoreData) envelope.getModuleData(CoreData.class)).relationships.get(0);
        }
        Relationship relationship = new Relationship();
        relationship.state = RelationshipStatus.get("unknown_");
        return relationship;
    }

    /* JADX INFO: renamed from: S8 */
    public void m31050S8() {
        m31035P5();
        m31019L5();
    }

    /* JADX INFO: renamed from: T5 */
    public boolean m31051T5(final UserInfo userInfo) {
        if (!NullChecker.m81303a(this.f19394a0.m221515e())) {
            return false;
        }
        List<UserInfo> list = this.f19394a0.m221515e().loaded;
        if (vwb.m200296J(list)) {
            return false;
        }
        return NullChecker.m81303a((UserInfo) vwb.m200346r(list, new w9j() { // from class: l.j0b
            @Override // p149l.w9j
            public final Object call(Object obj) {
                CoreSuggested.UserInfo userInfo2 = userInfo;
                CoreSuggested.UserInfo userInfo3 = (CoreSuggested.UserInfo) obj;
                return Boolean.valueOf(TextUtils.equals(userInfo3.f19472id, userInfo2.f19472id) && userInfo3.virtualCardType == userInfo2.virtualCardType);
            }
        }));
    }

    /* JADX INFO: renamed from: T6 */
    public final /* synthetic */ void m31052T6(HashSet hashSet, List list) {
        if (vwb.m200296J(list)) {
            return;
        }
        ura.m195053e().m195057d().mo33673Dg("remove ban user: " + list.toString());
        HashSet hashSet2 = new HashSet();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            hashSet2.add((String) it.next());
        }
        if (NullChecker.m81303a(this.f19394a0.m221515e())) {
            ListIterator<UserInfo> listIterator = this.f19394a0.m221515e().loaded.listIterator();
            while (listIterator.hasNext()) {
                UserInfo next = listIterator.next();
                if (hashSet2.contains(next.f19472id)) {
                    listIterator.remove();
                } else if (hashSet.contains(next.f19472id)) {
                    next.checkPointTime = mqi0.m155944o();
                }
            }
            this.f19394a0.m221515e().setRefreshValue(true);
            C22392a<PartialListOpt<UserInfo>> c22392a = this.f19394a0;
            c22392a.onNext(c22392a.m221515e().setReason(PartialListOpt.RefreshReason.checkCardOnce));
        }
    }

    /* JADX INFO: renamed from: T7 */
    public final /* synthetic */ C22306c m31053T7(final User user, Relationship relationship, Map map, final UserInfo userInfo, final boolean z) {
        return C4759y.m34905m3(user.f56011id, relationship, map).map(new w9j() { // from class: l.xza
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f195177a.m31049S7(user, userInfo, z, (Envelope) obj);
            }
        }).compose(C4728a.m31252T2());
    }

    /* JADX INFO: renamed from: T8 */
    public C22306c<roj0> m31054T8() {
        return this.f19334E2.asObservable();
    }

    /* JADX INFO: renamed from: U5 */
    public final Relationship m31055U5(boolean z, boolean z2, boolean z3, boolean z4, int i, UserInfo userInfo, String str, LikeFrom likeFrom, String str2, LikeExtraData likeExtraData, String str3) {
        DclExtensions dclExtensions;
        int iIntValue;
        Relationship relationship = new Relationship();
        relationship.localLikeFrom = likeFrom.toString();
        if (z) {
            relationship.state = RelationshipStatus.get(z2 ? "blocked" : "default");
        } else {
            relationship.state = RelationshipStatus.get(z3 ? "liked" : RelationshipStatus.disliked);
        }
        User userM169430Pa = CoreModule.f17545c.f19639e0.m169430Pa(userInfo.f19472id);
        ArrayList arrayList = new ArrayList();
        if (z) {
            arrayList.add(MatchFrom.get(MatchFrom.relationUnion));
        }
        if (TEnum.equals(likeFrom, "partner")) {
            arrayList.add(MatchFrom.get("partner"));
        }
        if (NullChecker.m81303a(likeExtraData) && NullChecker.m81303a(likeExtraData.status) && !TEnum.equals(likeExtraData.status, "unknown_")) {
            arrayList.add(likeExtraData.status);
        }
        if (z4 && !TextUtils.isEmpty(str) && (ura.m195053e().m195057d().mo33922t() || ura.m195053e().m195057d().mo33658B())) {
            arrayList.add(MatchFrom.get("letter"));
            if (TEnum.equals(likeFrom, "myLiked")) {
                arrayList.add(MatchFrom.get("myLiked"));
            }
            RelationshipExtensions relationshipExtensionsNew_ = RelationshipExtensions.new_();
            relationshipExtensionsNew_.letter = str;
            relationship.relationshipExtensions = relationshipExtensionsNew_;
            userInfo.letter = str;
            relationship.coinSign = CoreModule.f17545c.f19570H0.m210376s4(SummarizedPrivilegesId.get("letter"));
        } else if (z4) {
            arrayList.add(MatchFrom.get(MatchFrom.superLiked));
            if (TEnum.equals(likeFrom, "myLiked")) {
                arrayList.add(MatchFrom.get("myLiked"));
            }
            RelationshipExtensions relationshipExtensionsNew_2 = RelationshipExtensions.new_();
            relationshipExtensionsNew_2.letter = str;
            relationshipExtensionsNew_2.sendSuperLikedNum = String.valueOf(i);
            relationship.relationshipExtensions = relationshipExtensionsNew_2;
            if (CoreModule.m29932K().mo30835xf()) {
                relationship.diamondSign = CoreModule.f17545c.f19573I0.m140273x3(SummarizedPrivilegesId.get("superLike"));
            } else {
                relationship.coinSign = CoreModule.f17545c.f19570H0.m210376s4(SummarizedPrivilegesId.get("superLike"));
            }
        }
        if (!TextUtils.isEmpty(str2)) {
            relationship.picksTracker = str2;
        }
        if (CoreModule.m29935P().m94654e().mo34990wq() && (m31008I6(likeExtraData) || m31004H6(likeExtraData))) {
            arrayList.add(MatchFrom.get(MatchFrom.boostV2));
        }
        if (relationship.relationshipExtensions == null) {
            RelationshipExtensions relationshipExtensionsNew_3 = RelationshipExtensions.new_();
            relationshipExtensionsNew_3.letter = str;
            relationship.relationshipExtensions = relationshipExtensionsNew_3;
        }
        if ((z3 || z4) && TEnum.equals(likeFrom, "moment") && !TextUtils.isEmpty(str3)) {
            RelationshipExtensions relationshipExtensions = relationship.relationshipExtensions;
            relationshipExtensions.momentId = str3;
            relationship.relationshipExtensions = relationshipExtensions;
        }
        if (CoreModule.m29934N().mo60389so() && z3 && TEnum.equals(likeFrom, "moment")) {
            arrayList.add(MatchFrom.get("moment"));
        }
        if (z3 && TEnum.equals(likeFrom, "kankan")) {
            arrayList.add(MatchFrom.get("kankan"));
        }
        if (ura.m195053e().m195057d().mo33855is() && z3 && !TextUtils.isEmpty(userInfo.profileLikeCommentId) && !z4) {
            arrayList.add(MatchFrom.get(MatchFrom.profileLiked));
            try {
                iIntValue = Integer.valueOf(userInfo.profileLikeCommentId).intValue();
            } catch (Exception unused) {
                iIntValue = 0;
            }
            relationship.likeProfileId = iIntValue;
        }
        if (this.f72126Q.f19687u0.m30492y5(userM169430Pa) || TEnum.equals(likeFrom, LikeFrom.get("instantChat"))) {
            arrayList.add(MatchFrom.get(MatchFrom.seeUpgraded));
        }
        if (CoreModule.m29935P().m94656g().mo35051cf() && z3 && TEnum.equals(likeFrom, "pinLike")) {
            userInfo.sendPinLike = true;
            arrayList.add(MatchFrom.get("pinLike"));
        }
        if (ura.m195053e().m195057d().mo33716Lc() && NullChecker.m81303a(likeExtraData) && likeExtraData.isSelectedUser) {
            if (ura.m195053e().m195057d().mo33805bn() && !xma.m210044G3()) {
                arrayList.add(MatchFrom.get(MatchFrom.selectionPending));
                if (z4) {
                    arrayList.remove(MatchFrom.get(MatchFrom.superLiked));
                }
            } else if (!CoreModule.m29935P().m94656g().mo35007Ed() || sja.m184461r3() > 0) {
                arrayList.add(MatchFrom.get("selection"));
            }
        }
        relationship.status = arrayList;
        if (userM169430Pa != null) {
            if (!TextUtils.isEmpty(userM169430Pa.ussTracker)) {
                relationship.ussTracker = userM169430Pa.ussTracker;
            }
            UssTags ussTags = userM169430Pa.ussTags;
            if (ussTags != null && !TextUtils.isEmpty(ussTags.avatarIdentifier)) {
                relationship.avatarIdentifier = userM169430Pa.ussTags.avatarIdentifier;
            }
            if (NullChecker.m81303a(userM169430Pa.anonymousLike)) {
                relationship.anonymousLikeItemId = userM169430Pa.anonymousLike.itemId;
            }
        }
        CardInfos cardInfos = userInfo.cardInfos;
        if (cardInfos != null && !TextUtils.isEmpty(cardInfos.cardName)) {
            SwipeCardInfo swipeCardInfoNew_ = SwipeCardInfo.new_();
            relationship.cardInfo = swipeCardInfoNew_;
            swipeCardInfoNew_.cardTypes.addAll(vwb.m200324f0(userInfo.cardInfos.cardName.split(Constants.SEPARATOR_COMMA)));
        }
        if (likeExtraData != null && (dclExtensions = likeExtraData.liveExtraInfo) != null && relationship.relationshipExtensions != null && TextUtils.equals(dclExtensions.businessType, BLiveType.voiceLive)) {
            relationship.localLikeFrom = VoiceLive.TYPE;
            relationship.relationshipExtensions.roomID = likeExtraData.liveExtraInfo.voiceRoomId;
        }
        return relationship;
    }

    /* JADX INFO: renamed from: U6 */
    public final /* synthetic */ C22306c m31056U6(List list, final HashSet hashSet) {
        final JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            jSONArray.put((String) it.next());
        }
        try {
            jSONObject.put("ids", jSONArray);
        } catch (Exception unused) {
        }
        return ia20.m135121e(new v9j() { // from class: l.q3b
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4728a.f19494P.auth().m185898q(C4728a.m31200G("/filter-users")).m185893l(utc0.create(Network.JSON, jSONObject.toString())).m185883b();
            }
        }).map(new w9j() { // from class: l.r3b
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((CoreData) ((Envelope) obj).getModuleData(CoreData.class)).invalidCardList;
            }
        }).observeOn(jo0.m142408a()).doOnNext(new e30() { // from class: l.t3b
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f167606a.m31052T6(hashSet, (List) obj);
            }
        });
    }

    /* JADX INFO: renamed from: U7 */
    public C22306c<Relationship> m31057U7(boolean z, boolean z2, Map<String, String> map, User user, LikeExtraData likeExtraData, LikeFrom likeFrom) {
        return m31065W7(z, z2, map, user, null, likeFrom, true, likeExtraData);
    }

    /* JADX INFO: renamed from: U8 */
    public boolean m31058U8() {
        return C4728a.f19494P.guessedCurrentServerTime() - this.f19382W >= TimeUnit.MINUTES.toMillis(10L);
    }

    /* JADX INFO: renamed from: V5 */
    public final void m31059V5(List<SuperLikeCount> list) {
        if (vwb.m200296J(list)) {
            return;
        }
        vwb.m200354z(list, new e30() { // from class: l.h0b
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f105206a.m31064W6((SuperLikeCount) obj);
            }
        });
    }

    /* JADX INFO: renamed from: V6 */
    public final /* synthetic */ void m31060V6(UserInfo userInfo) {
        this.f19388Y.remove(userInfo.f19472id);
    }

    @Deprecated
    /* JADX INFO: renamed from: V7 */
    public C22306c<Relationship> m31061V7(boolean z, boolean z2, Map<String, String> map, User user, String str) {
        return m31065W7(z, z2, map, user, str, LikeFrom.get("unknown_"), true, null);
    }

    /* JADX INFO: renamed from: V8 */
    public C22306c<Envelope> m31062V8() {
        final String str = "/me/marriage-info";
        return this.f72126Q.scheduled("suggestMarryUser", 0, new v9j() { // from class: l.l2b
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f125766a.m31009I7(str);
            }
        });
    }

    /* JADX INFO: renamed from: W5 */
    public void m31063W5(int i) {
        this.f19394a0.m221515e().setRefreshValue(true);
        List<UserInfo> list = this.f19394a0.m221515e().loaded;
        if (i >= 0 && !vwb.m200296J(list) && list.size() > i) {
            list.remove(i);
        }
        C22392a<PartialListOpt<UserInfo>> c22392a = this.f19394a0;
        c22392a.onNext(c22392a.m221515e().setReason(PartialListOpt.RefreshReason.debugRefreshLoad));
    }

    /* JADX INFO: renamed from: W6 */
    public final /* synthetic */ void m31064W6(SuperLikeCount superLikeCount) {
        this.f19453t2.put(superLikeCount.userId, Integer.valueOf(superLikeCount.receiveTotalCount));
    }

    /* JADX INFO: renamed from: W7 */
    public C22306c<Relationship> m31065W7(boolean z, boolean z2, @Nullable Map<String, String> map, User user, String str, LikeFrom likeFrom, boolean z3, @Nullable LikeExtraData likeExtraData) {
        return m31069X7(z, z2, map, user, str, likeFrom, z3, likeExtraData, 0);
    }

    /* JADX INFO: renamed from: W8 */
    public C22306c<PartialListOpt<UserInfo>> m31066W8() {
        return this.f19394a0.doOnSubscribe(new d30() { // from class: l.m1b
            @Override // p149l.d30
            public final void call() {
                this.f130820a.m31017K7();
            }
        }).doOnNext(new e30() { // from class: l.n1b
            @Override // p149l.e30
            public final void call(Object obj) {
                CoreSuggested.m30898Z4((PartialListOpt) obj);
            }
        }).filter(new w9j() { // from class: l.o1b
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f141419a.m31021L7((PartialListOpt) obj);
            }
        });
    }

    /* JADX INFO: renamed from: X5 */
    public final UserInfo m31067X5(boolean z, boolean z2, boolean z3, final User user, LikeFrom likeFrom, int i, boolean z4) {
        SwipeDirection swipeDirection;
        if (user != null) {
            UserInfo userInfo = new UserInfo();
            userInfo.f19472id = user.f56011id;
            if (this.f19394a0.m221515e() != null && !vwb.m200296J(this.f19394a0.m221515e().loaded)) {
                UserInfo userInfo2 = (UserInfo) vwb.m200346r(this.f19394a0.m221515e().loaded, new w9j() { // from class: l.f3b
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return Boolean.valueOf(user.f56011id.equals(((CoreSuggested.UserInfo) obj).f19472id));
                    }
                });
                if (!ura.m195053e().m195057d().mo33762V6() && userInfo2 != null && z4) {
                    this.f19394a0.m221515e().loaded.remove(userInfo2);
                    this.f19394a0.m221515e().setRefreshValue(true);
                    C22392a<PartialListOpt<UserInfo>> c22392a = this.f19394a0;
                    c22392a.onNext(c22392a.m221515e().setReason(PartialListOpt.RefreshReason.DO_BEFORE_LIKE));
                }
            }
            if (!z) {
                String string = likeFrom.toString();
                string.getClass();
                if (string.equals("likers")) {
                    this.f72126Q.f19687u0.m30485v7(user.f56011id);
                } else if (string.equals("myLiked")) {
                    this.f72126Q.f19625Z0.m163929d4(user.f56011id);
                    this.f72126Q.f19625Z0.m163930e4(user.f56011id);
                    this.f72126Q.f19628a1.m134575A(user.f56011id);
                    return userInfo;
                }
            }
            return userInfo;
        }
        UserInfo userInfo3 = (this.f19394a0.m221515e() == null || vwb.m200296J(this.f19394a0.m221515e().loaded)) ? null : this.f19394a0.m221515e().loaded.get(0);
        if (!ura.m195053e().m195057d().mo33762V6()) {
            m30986C8("doBeforeLike");
        }
        if (CoreModule.f17554l.m94651a().mo33489e2() && NullChecker.m81303a(userInfo3)) {
            String originUserId = userInfo3.f19472id;
            LiveLivingCardDataWrapper liveLivingCardDataWrapper = userInfo3.liveLivingCardDataWrapper;
            if (liveLivingCardDataWrapper != null) {
                originUserId = liveLivingCardDataWrapper.getOriginUserId();
            }
            if (z2) {
                C4729a0.m31387j().m31389f(originUserId);
            } else {
                C4729a0.m31387j().m31388e(originUserId);
            }
        }
        if (!NullChecker.m81303a(userInfo3)) {
            return new UserInfo();
        }
        String originUserId2 = userInfo3.f19472id;
        LiveLivingCardDataWrapper liveLivingCardDataWrapper2 = userInfo3.liveLivingCardDataWrapper;
        if (liveLivingCardDataWrapper2 != null) {
            originUserId2 = liveLivingCardDataWrapper2.getOriginUserId();
        }
        if (!userInfo3.disableUndo) {
            this.f19418i0 = CoreModule.f17545c.f19639e0.m169430Pa(originUserId2);
            this.f19424k0 = i;
            this.f19421j0 = userInfo3;
            if (z3) {
                swipeDirection = SwipeDirection.UP;
            } else {
                swipeDirection = z2 ? SwipeDirection.RIGHT : SwipeDirection.LEFT;
            }
            userInfo3.preSwipedDirection = swipeDirection;
        }
        return userInfo3;
    }

    /* JADX INFO: renamed from: X6 */
    public final /* synthetic */ Relationship m31068X6(Envelope envelope) {
        this.f72126Q.m31492w3(envelope, new d30() { // from class: l.i0b
            @Override // p149l.d30
            public final void call() {
                CoreSuggested.m30939n4();
            }
        });
        List<Relationship> list = ((CoreData) envelope.getModuleData(CoreData.class)).relationships;
        if (vwb.m200296J(list)) {
            return null;
        }
        return list.get(0);
    }

    /* JADX INFO: renamed from: X7 */
    public C22306c<Relationship> m31069X7(boolean z, boolean z2, @Nullable Map<String, String> map, User user, String str, LikeFrom likeFrom, boolean z3, @Nullable LikeExtraData likeExtraData, int i) {
        return m31073Y7(z, z2, map, user, str, likeFrom, z3, likeExtraData, i, null);
    }

    /* JADX INFO: renamed from: X8 */
    public C22306c<UserInfo> m31070X8(final String str, final String str2) {
        return m31158x6(pib.m169277d7(str).map(new w9j() { // from class: l.a3b
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return CoreSuggested.m30879Q3(str, str2, (Envelope) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: Y5 */
    public C22306c<Relationship> m31071Y5(final User user, final Map<String, String> map) {
        final Relationship relationship = new Relationship();
        relationship.state = RelationshipStatus.get("default");
        User userM169430Pa = CoreModule.f17545c.f19639e0.m169430Pa(user.f56011id);
        if (NullChecker.m81303a(userM169430Pa) && !TextUtils.isEmpty(userM169430Pa.ussTracker)) {
            relationship.ussTracker = userM169430Pa.ussTracker;
        }
        return this.f72126Q.scheduled("undo_feed_poi" + user.f56011id, -1, new v9j() { // from class: l.n3b
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f136924a.m31072Y6(user, relationship, map);
            }
        });
    }

    /* JADX INFO: renamed from: Y6 */
    public final /* synthetic */ C22306c m31072Y6(User user, Relationship relationship, Map map) {
        return C4759y.m34905m3(user.f56011id, relationship, map).map(new w9j() { // from class: l.b0b
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f72421a.m31068X6((Envelope) obj);
            }
        }).compose(C4728a.m31252T2());
    }

    /* JADX INFO: renamed from: Y7 */
    public C22306c<Relationship> m31073Y7(boolean z, boolean z2, @Nullable Map<String, String> map, User user, String str, LikeFrom likeFrom, boolean z3, @Nullable LikeExtraData likeExtraData, int i, String str2) {
        return m31077Z7(z, z2, map, user, str, likeFrom, z3, likeExtraData, i, str2, true);
    }

    /* JADX INFO: renamed from: Y8 */
    public C22306c<roj0> m31074Y8(String str) {
        return m31078Z8(str, 0, false);
    }

    /* JADX INFO: renamed from: Z5 */
    public final C22306c<roj0> m31075Z5(boolean z) {
        ura.m195053e().m195057d().mo33673Dg("actually do poll");
        return m31079a6(z, false);
    }

    /* JADX INFO: renamed from: Z6 */
    public final /* synthetic */ C22306c m31076Z6(Envelope envelope) {
        return !this.f19441p2 ? this.f19408e2.m34216u3(envelope, this.f19390Y1, this.f19393Z1, this.f19396a2) : C22306c.just(vwb.m200311Y(envelope, new SparseArray()));
    }

    /* JADX INFO: renamed from: Z7 */
    public C22306c<Relationship> m31077Z7(boolean z, boolean z2, @Nullable Map<String, String> map, User user, String str, LikeFrom likeFrom, boolean z3, @Nullable LikeExtraData likeExtraData, int i, String str2, boolean z4) {
        return m31081a8(z, z2, map, user, str, likeFrom, z3, likeExtraData, i, str2, z4, 1, false);
    }

    /* JADX INFO: renamed from: Z8 */
    public C22306c<roj0> m31078Z8(final String str, final int i, final boolean z) {
        return this.f72126Q.now(str, new la20(new v9j() { // from class: l.c3b
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f78464a.m31025M7(z, str);
            }
        }).doOnNext(new e30() { // from class: l.d3b
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f83486a.m31029N7((Envelope) obj);
            }
        }).compose(C4728a.m31252T2()).map(new w9j() { // from class: l.e3b
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f89000a.m31033O7(i, str, (Envelope) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: a6 */
    public final C22306c<roj0> m31079a6(boolean z, final boolean z2) {
        this.f72126Q.f19663m0.f19444q2[2] = 0;
        this.f19415h0 = this.f19415h0 || z;
        this.f19441p2 = ura.m195053e().m195057d().mo33834gm().get();
        if (ura.m195053e().m195057d().mo33697Hg()) {
            CoreModule.f17545c.f19592O1.m120178p3();
        }
        final String strM31312j0 = this.f19441p2 ? C4728a.m31312j0(CoreModule.f17545c.f19639e0.m169527p9().f56011id) : m31134p6();
        this.f19433n0 = this.f19439p0;
        this.f19439p0 = System.currentTimeMillis();
        this.f19447r2 = "requesting";
        String strConcat = "users/suggested";
        if (ura.m195053e().m195057d().mo33904q0()) {
            strConcat = "users/suggested" + this.f19321A1.get();
        }
        if (ura.m195053e().m195057d().mo33879lk() && strM31312j0.contains("search=selected&mode=free_real_user")) {
            strConcat = strConcat.concat("just_real_user");
        }
        final C22306c map = new la20(new v9j() { // from class: l.w0b
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4728a.f19494P.auth().m185898q(strM31312j0).m185887f().m185883b();
            }
        }).flatMap(new w9j() { // from class: l.x0b
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f188945a.m31076Z6((Envelope) obj);
            }
        }).doOnNext(new e30() { // from class: l.y0b
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f195287a.m31080a7((j760) obj);
            }
        }).doOnError(new e30() { // from class: l.z0b
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f200950a.m31084b7((Throwable) obj);
            }
        }).subscribeOn(FastIoScheduler.f15630b).observeOn(jo0.m142408a()).map(new w9j() { // from class: l.a1b
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f67116a.m31092d7(z2, (j760) obj);
            }
        });
        if (!RemoteConfig.m79298x().m79330s("cold_start_opt")) {
            return this.f72126Q.scheduled(strConcat, 0, new v9j() { // from class: l.b1b
                @Override // p149l.v9j, java.util.concurrent.Callable
                public final Object call() {
                    return CoreSuggested.m30919g5(map);
                }
            });
        }
        ura.m195053e().m195057d().mo33673Dg("start use now schedule");
        yni.m215417f(LaunchStep.PreNet_Request);
        return this.f72126Q.now(strConcat, map, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a7 */
    public final /* synthetic */ void m31080a7(j760 j760Var) {
        yni.m215415d(LaunchStep.PreNet_Request);
        yni.m215417f(LaunchStep.PreNet_Op);
        this.f19447r2 = "parseing";
        Envelope envelope = (Envelope) j760Var.f116564a;
        CommonData commonData = (CommonData) envelope.getModuleData(CommonData.class);
        ura.m195053e().m195057d().mo33673Dg("suggested data back");
        if (ConnectivityReceiver.m81286i()) {
            yni.f199174o = true;
            ura.m195053e().m195057d().mo33673Dg("prefetch image to disk");
            if (!vwb.m200296J(commonData.users)) {
                m30959t8(((CommonData) envelope.getModuleData(CommonData.class)).users);
            }
        }
        if (ura.m195053e().m195057d().mo33802b() && !vwb.m200296J(commonData.users)) {
            CoreModule.m29936Q().putLiveState(((CommonData) envelope.getModuleData(CommonData.class)).users);
        }
        if (!ura.m195053e().m195057d().mo33813d7()) {
            m31101f8(envelope, commonData);
        }
        if (this.f19441p2 && vwb.m200296J(commonData.users)) {
            ura.m195053e().m195057d().mo33834gm().set(false);
        }
        if (ura.m195053e().m195057d().mo33780X9()) {
            this.f72126Q.f19614V1.f83479R = ((CoreData) envelope.getModuleData(CoreData.class)).greetingNewPeople;
        }
    }

    /* JADX INFO: renamed from: a8 */
    public C22306c<Relationship> m31081a8(boolean z, boolean z2, @Nullable Map<String, String> map, User user, String str, LikeFrom likeFrom, boolean z3, @Nullable LikeExtraData likeExtraData, int i, String str2, boolean z4, int i2, boolean z5) {
        return m31085b8(false, false, z, z2, map, user, str, likeFrom, z3, likeExtraData, i, str2, z4, i2, null, z5);
    }

    /* JADX INFO: renamed from: a9 */
    public C22306c<UserInfo> m31082a9(String str) {
        return m31158x6(pib.m169282e7(str));
    }

    /* JADX INFO: renamed from: b6 */
    public void m31083b6(boolean z) {
        PartialListOpt<UserInfo> partialListOptM221515e = this.f19353L0.m221515e();
        if (partialListOptM221515e == null || vwb.m200296J(partialListOptM221515e.loaded)) {
            return;
        }
        PartialListOpt<UserInfo> partialListOptM221515e2 = this.f19394a0.m221515e();
        if (partialListOptM221515e2 == null || vwb.m200296J(partialListOptM221515e2.loaded)) {
            partialListOptM221515e.setRefreshValue(true);
            this.f19394a0.onNext(partialListOptM221515e);
            this.f19353L0.onNext(null);
            return;
        }
        if (!e5l.m114832a() || z) {
            UserInfo userInfo = partialListOptM221515e2.loaded.get(0);
            ArrayList arrayList = new ArrayList();
            arrayList.add(userInfo);
            for (UserInfo userInfo2 : partialListOptM221515e.loaded) {
                if (userInfo2 != null) {
                    if (userInfo == null) {
                        break;
                    } else if (TextUtils.equals(userInfo2.f19472id, userInfo.f19472id)) {
                        userInfo.ussTags = userInfo2.ussTags;
                    } else {
                        arrayList.add(userInfo2);
                    }
                }
            }
            this.f19394a0.onNext(new PartialListOpt<>(arrayList, partialListOptM221515e.links));
            this.f19353L0.onNext(null);
        }
    }

    /* JADX INFO: renamed from: b7 */
    public final /* synthetic */ void m31084b7(Throwable th) {
        this.f72126Q.f19663m0.f19444q2[2] = 2;
        this.f19436o0 = this.f19442q0;
        this.f19442q0 = System.currentTimeMillis();
        long jGuessedCurrentServerTime = qib0.f154693H.guessedCurrentServerTime();
        int size = 0;
        if (NullChecker.m81303a(this.f19394a0.m221515e()) && NullChecker.m81303a(this.f19394a0.m221515e().loaded)) {
            size = this.f19394a0.m221515e().loaded.size();
        }
        m31086b9(th, size, jGuessedCurrentServerTime);
        this.f19334E2.onNext(roj0.f160388a);
    }

    /* JADX INFO: renamed from: b8 */
    public C22306c<Relationship> m31085b8(boolean z, boolean z2, final boolean z3, final boolean z4, @Nullable Map<String, String> map, final User user, String str, final LikeFrom likeFrom, boolean z5, @Nullable final LikeExtraData likeExtraData, int i, String str2, boolean z6, int i2, String str3, final boolean z7) {
        Map<String, String> map2;
        DclExtensions dclExtensions;
        if (likeExtraData == null || !NullChecker.m81303a(likeExtraData.matchScData)) {
            map2 = map;
        } else {
            Map<String, String> map3 = !NullChecker.m81303a(map) ? new HashMap<>() : map;
            map3.put("receiver_user_id", likeExtraData.matchScData.receiverUserId);
            map2 = map3;
        }
        final UserInfo userInfoM31067X5 = m31011J5(user) ? m31067X5(z, z3, z4, user, likeFrom, i, z6) : this.f19409f0;
        if (userInfoM31067X5 == null) {
            CrashHelper.m81296c(new Exception("Like Api Error: Perhaps suggested users were cleared or reset when doing Swipe Card Animation"));
            return C22306c.just(Relationship.new_());
        }
        if (userInfoM31067X5.liveLivingCardDataWrapper != null && userInfoM31067X5.isVirtualCard()) {
            userInfoM31067X5.f19472id = userInfoM31067X5.liveLivingCardDataWrapper.getOriginUserId();
        }
        final Relationship relationshipM31055U5 = m31055U5(z, z2, z3, z4, i2, userInfoM31067X5, str, likeFrom, str2, likeExtraData, str3);
        if (likeExtraData != null && (dclExtensions = likeExtraData.liveExtraInfo) != null) {
            relationshipM31055U5.dclExtensions = dclExtensions;
        }
        if (likeExtraData != null && !TextUtils.isEmpty(likeExtraData.profileLikeId)) {
            try {
                relationshipM31055U5.likeProfileId = Integer.parseInt(likeExtraData.profileLikeId);
                relationshipM31055U5.status.add(MatchFrom.get(MatchFrom.profileLiked));
            } catch (Exception unused) {
            }
        }
        if (TEnum.equals(likeFrom, "poi")) {
            if (relationshipM31055U5.dclExtensions == null) {
                relationshipM31055U5.dclExtensions = DclExtensions.new_();
            }
            relationshipM31055U5.dclExtensions.businessType = DclExtensions.DCL_EXT_BUSINESS_TYPE_POI;
        }
        if (TEnum.equals(likeFrom, LikeFrom.get("instantChat"))) {
            if (relationshipM31055U5.relationshipExtensions == null) {
                relationshipM31055U5.relationshipExtensions = RelationshipExtensions.new_();
            }
            relationshipM31055U5.relationshipExtensions.business_type = "instantChat";
        }
        final Long lM31095e6 = m31095e6(relationshipM31055U5, likeFrom, i2, userInfoM31067X5.f19472id);
        final Map<String, String> map4 = map2;
        return this.f72126Q.scheduled("cardlike", -1, new v9j() { // from class: l.v1b
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f179214a.m31167z7(z3, userInfoM31067X5, relationshipM31055U5, map4, lM31095e6, z4, user, z7, likeExtraData, likeFrom);
            }
        }, z5);
    }

    /* JADX INFO: renamed from: b9 */
    public final void m31086b9(Throwable th, int i, long j) {
        o6j0.m162870n("e_suggested_user_refresh", "p_suggest_users_home_view", o6j0.C18854a.m162878h("if_error", "YES"), o6j0.C18854a.m162878h("error_types", NullChecker.m81303a(th) ? th.getMessage() : ""), o6j0.C18854a.m162876f("card_origin_count", 0), o6j0.C18854a.m162876f("card_filter_count", i), o6j0.C18854a.m162878h("last_start_refresh_timestamp", String.valueOf(this.f19433n0)), o6j0.C18854a.m162878h("last_end_refresh_timestamp", String.valueOf(this.f19436o0)), o6j0.C18854a.m162878h("start_refresh_timestamp", String.valueOf(this.f19439p0)), o6j0.C18854a.m162878h("end_refresh_timestamp", String.valueOf(this.f19442q0)), o6j0.C18854a.m162878h("end_refresh_server_timestamp", String.valueOf(j)), o6j0.C18854a.m162876f("card_available_count", 0));
    }

    /* JADX INFO: renamed from: c6 */
    public final String m31087c6(String str) {
        if (!ura.m195053e().m195057d().mo33798ak() && !ura.m195053e().m195057d().mo33953yg()) {
            return str;
        }
        return str + "&fake_photo_feedback=true";
    }

    /* JADX INFO: renamed from: c7 */
    public final /* synthetic */ void m31088c7(Envelope envelope) {
        m31101f8(envelope, (CommonData) envelope.getModuleData(CommonData.class));
    }

    /* JADX INFO: renamed from: c8 */
    public C22306c<roj0> m31089c8(final String str) {
        return this.f72126Q.scheduled("live_user_card_cancel_" + str, 0, new v9j() { // from class: l.b3b
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return ia20.m135117a(new v9j() { // from class: l.u3b
                    @Override // p149l.v9j, java.util.concurrent.Callable
                    public final Object call() {
                        return C4728a.f19494P.auth().m185898q(C4728a.m31185C0(CoreModule.m29931H().userId(), str)).m185883b();
                    }
                }).map(new w9j() { // from class: l.v3b
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return roj0.f160388a;
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: c9 */
    public final void m31090c9(int i, int i2, long j, int i3) {
        o6j0.m162870n("e_suggested_user_refresh", "p_suggest_users_home_view", o6j0.C18854a.m162878h("if_error", "NO"), o6j0.C18854a.m162878h("error_types", ""), o6j0.C18854a.m162876f("card_origin_count", i), o6j0.C18854a.m162876f("card_filter_count", i2), o6j0.C18854a.m162878h("last_start_refresh_timestamp", String.valueOf(this.f19433n0)), o6j0.C18854a.m162878h("last_end_refresh_timestamp", String.valueOf(this.f19436o0)), o6j0.C18854a.m162878h("start_refresh_timestamp", String.valueOf(this.f19439p0)), o6j0.C18854a.m162878h("end_refresh_timestamp", String.valueOf(this.f19442q0)), o6j0.C18854a.m162878h("end_refresh_server_timestamp", String.valueOf(j)), o6j0.C18854a.m162876f("card_available_count", i3));
    }

    /* JADX INFO: renamed from: d6 */
    public final String m31091d6(String str) {
        return (!CoreModule.m29935P().m94658i().mo158272N() || !ura.m195053e().m195057d().mo33870kc() || TextUtils.isEmpty(str) || str.contains("fake_scene")) ? str : str.concat("&fake_scene=top_pop_max");
    }

    /* JADX WARN: Code duplicated, block: B:123:0x02e6  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: d7 */
    public final /* synthetic */ roj0 m31092d7(boolean z, j760 j760Var) {
        int size;
        boolean z2;
        long j;
        List<UserInfo> list;
        String str;
        long j2;
        this.f19328C2 = false;
        char c = 2;
        this.f72126Q.f19663m0.f19444q2[2] = 1;
        final Envelope envelope = (Envelope) j760Var.f116564a;
        if (ura.m195053e().m195057d().mo33813d7()) {
            List<User> list2 = ((CommonData) envelope.getModuleData(CommonData.class)).users;
            if (!vwb.m200296J(list2)) {
                vwb.m200354z(list2, new e30() { // from class: l.z1b
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        User user = (User) obj;
                        qib0.f154722k0.f176631d.cache(user.f56011id, user);
                    }
                });
            }
            Counter counterM31484o3 = CoreModule.f17545c.m31484o3();
            Counter counter = envelope.counters;
            if (counterM31484o3 == null) {
                CoreModule.f17545c.m31474F3(counter);
            } else {
                counter.mergeData(CoreModule.f17545c.m31484o3());
                CoreModule.f17545c.m31474F3(envelope.counters);
            }
            C4732c c4732c = CoreModule.f17545c;
            c4732c.f19610U0.onNext(c4732c.m31484o3());
            e51.m114768s(new Runnable() { // from class: l.b2b
                @Override // java.lang.Runnable
                public final void run() {
                    this.f72681a.m31088c7(envelope);
                }
            });
        }
        yni.m215415d(LaunchStep.PreNet);
        ura.m195053e().m195057d().mo33673Dg("suggested data transform to MainThread");
        this.f19436o0 = this.f19442q0;
        this.f19442q0 = System.currentTimeMillis();
        long jGuessedCurrentServerTime = qib0.f154693H.guessedCurrentServerTime();
        PartialListOpt<UserInfo> partialListOptM221515e = this.f19394a0.m221515e();
        List<UserInfo> arrayList = partialListOptM221515e == null ? new ArrayList<>() : partialListOptM221515e.loaded;
        int size2 = arrayList.size();
        if (z) {
            arrayList = new ArrayList<>();
            if (!vwb.m200296J(((CommonData) envelope.getModuleData(CommonData.class)).users)) {
                for (User user : ((CommonData) envelope.getModuleData(CommonData.class)).users) {
                    if (user != null && this.f19388Y.contains(user.f56011id)) {
                        this.f19388Y.remove(user.f56011id);
                    }
                }
            }
        } else if (!vwb.m200296J(((CommonData) envelope.getModuleData(CommonData.class)).users)) {
            for (final User user2 : ((CommonData) envelope.getModuleData(CommonData.class)).users) {
                if (user2 != null && user2.isRepeatUser() && !vwb.m200337m(arrayList, new w9j() { // from class: l.c2b
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return Boolean.valueOf(((CoreSuggested.UserInfo) obj).f19472id.equals(user2.f56011id));
                    }
                }) && this.f19388Y.contains(user2.f56011id)) {
                    this.f19388Y.remove(user2.f56011id);
                }
            }
        }
        if (this.f19415h0) {
            int iMin = Math.min(arrayList.size(), Math.max(this.f19385X, arrayList.size() - ((CommonData) envelope.getModuleData(CommonData.class)).users.size()));
            if (iMin >= 0 && iMin <= arrayList.size()) {
                Iterator<UserInfo> it = arrayList.subList(iMin, arrayList.size()).iterator();
                while (it.hasNext()) {
                    this.f19388Y.remove(it.next().f19472id);
                }
            }
            if (iMin == 0 && !vwb.m200296J(arrayList) && C4730b.m31408b(arrayList.get(0).virtualCardType)) {
                this.f19420i2.onNext(SwipeDirection.REMOVE);
            }
            arrayList = arrayList.subList(0, iMin);
            this.f19415h0 = false;
        }
        this.f19385X = 2;
        this.f19382W = C4728a.f19494P.guessedCurrentServerTime();
        List<User> listM31391h = C4729a0.m31387j().m31391h(((CommonData) envelope.getModuleData(CommonData.class)).users);
        List<SuggestedComplimentItem> list3 = ((CoreData) envelope.getModuleData(CoreData.class)).compliments;
        this.f19386X0.clear();
        if (!vwb.m200296J(list3)) {
            for (SuggestedComplimentItem suggestedComplimentItem : list3) {
                if (NullChecker.m81303a(suggestedComplimentItem) && !TextUtils.isEmpty(suggestedComplimentItem.senderId)) {
                    this.f19386X0.putIfAbsent(suggestedComplimentItem.senderId, suggestedComplimentItem);
                }
                c = c;
            }
        }
        char c2 = c;
        List<UserInfo> listM30987D5 = m30987D5(envelope, listM31391h);
        if (vwb.m200296J(listM30987D5)) {
            size = 0;
            z2 = false;
        } else {
            arrayList.addAll(listM30987D5);
            Iterator<UserInfo> it2 = listM30987D5.iterator();
            while (it2.hasNext()) {
                this.f19388Y.add(it2.next().f19472id);
            }
            size = listM30987D5.size();
            z2 = true;
        }
        m30976A6(arrayList, listM31391h);
        this.f19448s0 = null;
        if (vwb.m200296J(listM31391h)) {
            j = jGuessedCurrentServerTime;
        } else {
            SparseArray sparseArray = (SparseArray) j760Var.f116565b;
            int i = 0;
            boolean z3 = false;
            boolean z4 = false;
            while (i < sparseArray.size()) {
                int iKeyAt = sparseArray.keyAt(i);
                UserInfo userInfo = (UserInfo) sparseArray.get(iKeyAt);
                if (userInfo.isIntlLikeLimitInsert) {
                    this.f19448s0 = userInfo;
                    j2 = jGuessedCurrentServerTime;
                } else {
                    j2 = jGuessedCurrentServerTime;
                    if (!this.f19388Y.contains(userInfo.f19472id)) {
                        int i2 = iKeyAt + size2;
                        if (arrayList.size() > i2) {
                            arrayList.add(i2, userInfo);
                        } else {
                            arrayList.add((UserInfo) sparseArray.get(iKeyAt));
                        }
                        if (!userInfo.isVirtualCard()) {
                            this.f19388Y.add(userInfo.f19472id);
                        }
                        if (userInfo.isVirtualCard() && userInfo.virtualCardType == VirtualCardType.IntlSeeCard) {
                            z3 = true;
                        }
                        if (userInfo.isVirtualCard() && userInfo.virtualCardType == VirtualCardType.NativeAdViewCard) {
                            z4 = true;
                        }
                        size2++;
                    }
                }
                i++;
                jGuessedCurrentServerTime = j2;
            }
            j = jGuessedCurrentServerTime;
            if (z3) {
                m31115j6();
            }
            if (z4) {
                this.f19411f2.onNext(Boolean.TRUE);
            }
        }
        if (vwb.m200296J(arrayList)) {
            list = arrayList;
        } else {
            List<UserInfo> listM184945c = sm90.m184943b().m184945c(this.f72126Q.f19639e0.m169527p9(), arrayList, this.f19388Y, listM31391h);
            if (vwb.m200296J(listM184945c)) {
                list = arrayList;
            } else {
                list = listM184945c;
            }
        }
        m31139q8(list, listM31391h);
        m30988D6(list, listM31391h);
        if (!NullChecker.m81303a(this.f19448s0) || vwb.m200296J(list) || CoreModule.m29932K().counter_().likeLimit.remaining > 0) {
            str = null;
        } else {
            m30984C6(list, this.f19448s0);
            list.add(0, this.f19448s0);
            str = null;
            this.f19448s0 = null;
        }
        m31090c9(vwb.m200296J(((CommonData) envelope.getModuleData(CommonData.class)).users) ? 0 : ((CommonData) envelope.getModuleData(CommonData.class)).users.size(), list.size(), j, size);
        DbLinks dbLinksNew_ = DbLinks.new_();
        dbLinksNew_.links.next = z2 ? "" : str;
        if (z) {
            this.f19353L0.onNext(new PartialListOpt<>(list, dbLinksNew_));
            m31083b6(false);
        } else {
            if (ura.m195053e().m195057d().mo33801ar()) {
                if (!ura.m195053e().m195057d().mo33954yh()) {
                    ura.m195053e().m195057d().mo33880ll(list);
                    this.f19400c0.onNext(roj0.f160388a);
                    ura.m195053e().m195057d().mo33809cp();
                } else if (!vwb.m200296J(list)) {
                    ura.m195053e().m195057d().mo33844hh(list);
                }
            }
            ura.m195053e().m195057d().mo33673Dg("suggested data emmit");
            ura.m195053e().m195057d().mo33886nj(list, ((CoreData) envelope.getModuleData(CoreData.class)).lives);
            ura.m195053e().m195057d().mo33962zs(list, ((CoreData) envelope.getModuleData(CoreData.class)).voices);
            this.f19447r2 = "requested" + (System.currentTimeMillis() - this.f19439p0);
            CoreProviderInterface coreProviderInterfaceM195057d = ura.m195053e().m195057d();
            if (coreProviderInterfaceM195057d.mo33879lk() || coreProviderInterfaceM195057d.mo33714Kl()) {
                if (!CoreModule.f17545c.f19704z2.m30253p3() || ((pib.m169247V7() && !xma.m210047L3()) || vwb.m200296J(list) || CoreModule.f17545c.f19704z2.f19226e0.get().booleanValue())) {
                    CoreModule.f17545c.f19704z2.f19222a0 = false;
                } else {
                    e51.m114742G(new Runnable() { // from class: l.d2b
                        @Override // java.lang.Runnable
                        public final void run() {
                            lsi0.m151595y("只为你推荐完成头像认证的用户");
                        }
                    });
                    CoreModule.f17545c.f19704z2.f19226e0.put(Boolean.TRUE);
                    CoreModule.f17545c.f19704z2.f19222a0 = true;
                }
            }
            yni.m215415d(LaunchStep.PreNet_Op);
            this.f19394a0.onNext(new PartialListOpt(list, dbLinksNew_).setReason(PartialListOpt.RefreshReason.SUGGEST_LOAD));
        }
        if (ura.m195053e().m195057d().mo33931u()) {
            if (ura.m195053e().m195057d().mo33808c() && NullChecker.m81303a(CoreModule.f17545c.f19639e0.m169527p9()) && CoreModule.f17545c.f19639e0.m169527p9().isFemale() && !CoreModule.f17545c.f19558D0.f20134Y && !ura.m195053e().m195057d().mo33896oq()) {
                CoreModule.f17545c.f19558D0.f20134Y = true;
                C22306c.timer(5L, TimeUnit.SECONDS).subscribe(new e30() { // from class: l.e2b
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        CoreModule.f17545c.f19558D0.m34842R4();
                    }
                });
            }
        } else if (ura.m195053e().m195057d().mo33808c() && NullChecker.m81303a(CoreModule.f17545c.f19639e0.m169527p9()) && CoreModule.f17545c.f19639e0.m169527p9().isFemale() && !CoreModule.f17545c.f19558D0.f20134Y && !ura.m195053e().m195057d().mo33896oq()) {
            e51.m114742G(new Runnable() { // from class: l.f2b
                @Override // java.lang.Runnable
                public final void run() {
                    CoreSuggested.m30906c4();
                }
            });
        }
        if (CoreModule.m29935P().m94656g().mo35048b8()) {
            this.f72126Q.f19641e2.f86632U = new ArrayList();
            for (UserInfo userInfo2 : list) {
                if (userInfo2.isPinLike) {
                    UserWithRelationShip userWithRelationShipNew_ = UserWithRelationShip.new_();
                    userWithRelationShipNew_.userId = userInfo2.f19472id;
                    userWithRelationShipNew_.relationship = userInfo2.topLikeRelationship;
                    this.f72126Q.f19641e2.f86632U.add(userWithRelationShipNew_);
                }
            }
            dka dkaVar = this.f72126Q.f19641e2;
            Collections.sort(dkaVar.f86632U, dkaVar.f86641d0);
            this.f72126Q.f19641e2.m112212u3();
        }
        C22392a<roj0> c22392a = this.f19373T;
        roj0 roj0Var = roj0.f160388a;
        c22392a.onNext(roj0Var);
        this.f72126Q.f19663m0.f19444q2[c2] = 3;
        if (list.size() > 0 && this.f72126Q.f19663m0.f19322A2 == 0) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            CoreSuggested coreSuggested = this.f72126Q.f19663m0;
            coreSuggested.f19322A2 = jCurrentTimeMillis - coreSuggested.f19468y2;
            if (this.f72126Q.f19663m0.f19322A2 > 0 && this.f72126Q.f19663m0.f19471z2 > 0) {
                zvf0.m220369B("e_homepage_network_and_layout", "p_suggest_users_home_view", new j760("suggest_network_time", Long.valueOf(this.f72126Q.f19663m0.f19322A2)), new j760("card_layout_time", Long.valueOf(this.f72126Q.f19663m0.f19471z2)), new j760("suggest_network_time_diff_card_layout_time", Long.valueOf(this.f72126Q.f19663m0.f19322A2 - this.f72126Q.f19663m0.f19471z2)));
            }
        }
        return roj0Var;
    }

    /* JADX INFO: renamed from: d8 */
    public C22306c<roj0> m31093d8(final String str) {
        return this.f72126Q.scheduled("live_user_card_enter_" + str, 0, new v9j() { // from class: l.p2b
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return ia20.m135117a(new v9j() { // from class: l.vza
                    @Override // p149l.v9j, java.util.concurrent.Callable
                    public final Object call() {
                        return C4728a.f19494P.auth().m185898q(C4728a.m31189D0(CoreModule.m29931H().userId(), str)).m185883b();
                    }
                }).map(new w9j() { // from class: l.wza
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return roj0.f160388a;
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: d9 */
    public void m31094d9() {
        if (this.f19394a0.m221515e() != null) {
            Iterator<UserInfo> it = this.f19394a0.m221515e().loaded.iterator();
            while (it.hasNext()) {
                UserInfo next = it.next();
                if (next.picksGuideUser) {
                    this.f19388Y.remove(next.f19472id);
                    it.remove();
                }
            }
        }
        this.f19394a0.m221515e().setRefreshValue(true);
        C22392a<PartialListOpt<UserInfo>> c22392a = this.f19394a0;
        c22392a.onNext(c22392a.m221515e().setReason(PartialListOpt.RefreshReason.tryRemoveInsertedPicksUser));
    }

    /* JADX INFO: renamed from: e6 */
    public final Long m31095e6(Relationship relationship, LikeFrom likeFrom, int i, String str) {
        if (!NullChecker.m81303a(relationship)) {
            return 0L;
        }
        boolean z = false;
        boolean z2 = !vwb.m200296J(relationship.status) && relationship.status.contains(MatchFrom.get(MatchFrom.superLiked));
        boolean z3 = z2 && ura.m195053e().m195057d().mo33851ig();
        if (!vwb.m200296J(relationship.status) && relationship.status.contains(MatchFrom.get("letter"))) {
            z = true;
        }
        if (z2 && i > 1) {
            int iMo33705J8 = ura.m195053e().m195057d().mo33705J8();
            int iMo33816dq = ura.m195053e().m195057d().mo33816dq();
            if (ura.m195053e().m195057d().mo33911qr(str) && i <= 3) {
                relationship.consumeType = ConsumeType.handsel;
            } else if (i <= iMo33705J8 || ura.m195053e().m195057d().mo33882m3()) {
                relationship.consumeType = "privilege";
            } else if (iMo33705J8 <= 0 || i > iMo33816dq) {
                relationship.consumeType = "coin";
            } else {
                relationship.consumeType = "all";
            }
        } else if (TEnum.equals(likeFrom, "greet")) {
            relationship.consumeType = "free";
        } else if (z) {
            if (xma.m210041D3()) {
                relationship.consumeType = "privilege";
            } else {
                relationship.consumeType = "coin";
            }
        } else if (TEnum.equals(likeFrom, "instantChat")) {
            relationship.consumeType = "privilege";
        } else {
            relationship.consumeType = xob.m210300i4(z3);
        }
        if (z2) {
            return CoreModule.f17545c.f19570H0.m210377s5(relationship.consumeType, SummarizedPrivilegesId.get("superLike"));
        }
        if (z) {
            return CoreModule.f17545c.f19570H0.m210377s5(relationship.consumeType, SummarizedPrivilegesId.get("letter"));
        }
        return null;
    }

    /* JADX INFO: renamed from: e7 */
    public final /* synthetic */ j760 m31096e7(String str, Envelope envelope) {
        j760<Links, List<DislikedUsers>> j760Var;
        HashMap mapM200319d = vwb.m200319d(((CommonData) envelope.getModuleData(CommonData.class)).users, new w9j() { // from class: l.n2b
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((User) obj).f56011id;
            }
        }, new w9j() { // from class: l.o2b
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return CoreSuggested.m30859G3((User) obj);
            }
        });
        List<DislikedUsers> list = ((CoreData) envelope.getModuleData(CoreData.class)).dislikedUsers;
        ArrayList arrayList = new ArrayList();
        if (TextUtils.isEmpty(str)) {
            this.f19391Z = new HashSet<>();
        }
        for (DislikedUsers dislikedUsers : list) {
            User user = (User) mapM200319d.get(dislikedUsers.f20387id);
            if (this.f19391Z.add(dislikedUsers.f20387id) && NullChecker.m81303a(user)) {
                dislikedUsers.userInfo = user;
                arrayList.add(dislikedUsers);
            }
        }
        j760<Links, List<DislikedUsers>> j760VarM221515e = this.f19367R.m221515e();
        if (TextUtils.isEmpty(str) || !NullChecker.m81303a(j760VarM221515e) || vwb.m200296J(j760VarM221515e.f116565b)) {
            j760Var = new j760<>(envelope.pagination.links, arrayList);
        } else {
            j760VarM221515e.f116565b.addAll(arrayList);
            j760Var = new j760<>(envelope.pagination.links, j760VarM221515e.f116565b);
        }
        this.f19367R.onNext(j760Var);
        return j760Var;
    }

    /* JADX INFO: renamed from: e8 */
    public void m31097e8() {
        this.f19328C2 = true;
    }

    /* JADX INFO: renamed from: e9 */
    public void m31098e9() {
        scheduled("post_try_to_increase_see_list", -1, new v9j() { // from class: l.a2b
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f67245a.m31041Q7();
            }
        });
    }

    /* JADX INFO: renamed from: f6 */
    public void m31099f6(Links links) {
        final String str = (!NullChecker.m81303a(links) || TextUtils.isEmpty(links.next)) ? "" : String.format("?%s", links.next);
        scheduled("get_dis_liked_users".concat(str), 0, new v9j() { // from class: l.w2b
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f184122a.m31100f7(str);
            }
        });
    }

    /* JADX INFO: renamed from: f7 */
    public final /* synthetic */ C22306c m31100f7(final String str) {
        return ia20.m135117a(new v9j() { // from class: l.c1b
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4728a.f19494P.auth().m185887f().m185898q(C4728a.m31200G("/disliked-users" + str)).m185883b();
            }
        }).map(new w9j() { // from class: l.d1b
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f83254a.m31096e7(str, (Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: f8 */
    public final void m31101f8(Envelope envelope, final CommonData commonData) {
        ura.m195053e().m195057d().mo33673Dg("database merge suggested data start");
        LaunchStep launchStep = LaunchStep.PreNet_Db;
        yni.m215417f(launchStep);
        this.f72126Q.m31494y3(envelope, new d30() { // from class: l.j3b
            @Override // p149l.d30
            public final void call() {
                CoreSuggested.m30866J4(commonData);
            }
        }, true, false, true);
        yni.m215415d(launchStep);
        ura.m195053e().m195057d().mo33673Dg("database merge suggested data end");
    }

    /* JADX INFO: renamed from: f9 */
    public C22306c<Relationship> m31102f9(Map<String, String> map) {
        return m31106g9(true, null, map);
    }

    /* JADX INFO: renamed from: g6 */
    public C22392a<j760<Links, List<DislikedUsers>>> m31103g6() {
        return this.f19367R;
    }

    /* JADX INFO: renamed from: g7 */
    public final /* synthetic */ void m31104g7(String str) {
        CoreModule.f17545c.f19663m0.m31078Z8(str, m30991E5(), true);
    }

    /* JADX INFO: renamed from: g8 */
    public final boolean m31105g8(UserInfo userInfo, UserInfo userInfo2) {
        return NullChecker.m81303a(userInfo2) && NullChecker.m81303a(userInfo) && userInfo2.f19472id.equals(UserInfo.VIRTUAL_CARD) && userInfo2.virtualCardType != userInfo.virtualCardType;
    }

    /* JADX INFO: renamed from: g9 */
    public C22306c<Relationship> m31106g9(final boolean z, e30<String> e30Var, final Map<String, String> map) {
        User user = this.f19418i0;
        if (user == null || this.f19421j0 == null) {
            return null;
        }
        final User userMo223809clone = user.mo223809clone();
        final UserInfo userInfoM223816clone = this.f19421j0.m223816clone();
        if (e30Var != null) {
            e30Var.call(userInfoM223816clone.f19472id);
        }
        if (userInfoM223816clone.meetAgain) {
            userInfoM223816clone.isUndo = true;
            if (!z) {
                userInfoM223816clone.preSwipedDirection = null;
            }
            m31154w6(userInfoM223816clone, 0);
            m31031O5();
            return C22306c.just(userMo223809clone.localRelationship);
        }
        final Relationship relationship = new Relationship();
        relationship.state = RelationshipStatus.get("default");
        User userM169430Pa = CoreModule.f17545c.f19639e0.m169430Pa(userMo223809clone.f56011id);
        if (NullChecker.m81303a(userM169430Pa) && !TextUtils.isEmpty(userM169430Pa.ussTracker)) {
            relationship.ussTracker = userM169430Pa.ussTracker;
        }
        return this.f72126Q.scheduled("undo", -1, new v9j() { // from class: l.x2b
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f189143a.m31053T7(userMo223809clone, relationship, map, userInfoM223816clone, z);
            }
        });
    }

    /* JADX INFO: renamed from: h6 */
    public HashMap<String, SuggestedComplimentItem> m31107h6() {
        return this.f19386X0;
    }

    /* JADX INFO: renamed from: h7 */
    public final /* synthetic */ void m31108h7(Envelope envelope) {
        this.f72126Q.m31494y3(envelope, null, true, false, true);
    }

    /* JADX INFO: renamed from: h8 */
    public final void m31109h8(String str) {
        if (this.f19394a0.m221515e() == null) {
            return;
        }
        this.f19394a0.m221515e().setRefreshValue(true);
        C22392a<PartialListOpt<UserInfo>> c22392a = this.f19394a0;
        c22392a.onNext(c22392a.m221515e().setReasonStr(PartialListOpt.RefreshReason.NOTIFY_INNER.getReason() + "_" + str));
    }

    /* JADX INFO: renamed from: h9 */
    public C22306c<roj0> m31110h9() {
        return this.f19337F2;
    }

    /* JADX INFO: renamed from: i6 */
    public void m31111i6(final String str) {
        C22306c.just(str).filter(new w9j() { // from class: l.i1b
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(!CoreModule.f17545c.f19663m0.f19445r0.contains((String) obj));
            }
        }).map(new w9j() { // from class: l.j1b
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return CoreSuggested.m30904b5(str, (String) obj);
            }
        }).subscribe(mkd0.m154956H(new e30() { // from class: l.k1b
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f120556a.m31104g7((String) obj);
            }
        }, new e30() { // from class: l.l1b
            @Override // p149l.e30
            public final void call(Object obj) {
                CoreSuggested.m30923i3((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: i7 */
    public final /* synthetic */ Envelope m31112i7(Envelope envelope) {
        this.f72126Q.m31492w3(envelope, null);
        return envelope;
    }

    /* JADX INFO: renamed from: i8 */
    public void m31113i8() {
        this.f19334E2.onNext(roj0.f160388a);
    }

    /* JADX INFO: renamed from: i9 */
    public C22306c<roj0> m31114i9(final String str) {
        return this.f72126Q.scheduled("voice_user_card_cancel_" + str, 0, new v9j() { // from class: l.p3b
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return ia20.m135117a(new v9j() { // from class: l.g4b
                    @Override // p149l.v9j, java.util.concurrent.Callable
                    public final Object call() {
                        return C4728a.f19494P.auth().m185898q(C4728a.m31185C0(CoreModule.m29931H().userId(), str) + "?type=voice").m185883b();
                    }
                }).map(new w9j() { // from class: l.h4b
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return roj0.f160388a;
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: j6 */
    public final void m31115j6() {
        CoreModule.f17545c.f19687u0.m30403N6(25, true).subscribe(mkd0.m154956H(new e30() { // from class: l.f0b
            @Override // p149l.e30
            public final void call(Object obj) {
                CoreModule.f17545c.f19687u0.f19235R = (List) ((j760) obj).f116565b;
            }
        }, new e30() { // from class: l.g0b
            @Override // p149l.e30
            public final void call(Object obj) {
                CoreSuggested.m30934l5((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: j7 */
    public final /* synthetic */ roj0 m31116j7(Envelope envelope) {
        ArrayList arrayList = new ArrayList();
        for (User user : ((CommonData) envelope.getModuleData(CommonData.class)).users) {
            arrayList.add(new C4727e(user.f56011id, user.popLevel));
        }
        Collections.sort(arrayList);
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((C4727e) it.next()).f19477a);
        }
        DbLinks dbLinksNew_ = DbLinks.new_();
        dbLinksNew_.links.next = "";
        this.f19343H2.onNext(new q860<>(arrayList2, dbLinksNew_));
        if (!vwb.m200296J(this.f19388Y) && !vwb.m200296J(arrayList)) {
            this.f19388Y.remove(((C4727e) arrayList.get(0)).f19477a);
        }
        return roj0.f160388a;
    }

    /* JADX INFO: renamed from: j8 */
    public final void m31117j8(final Notification<Envelope> notification, boolean z, final boolean z2, final UserInfo userInfo, final User user) {
        Relationship relationship;
        if (!notification.m221299j() && notification.m221300k()) {
            User userM169433Q9 = CoreModule.f17545c.f19639e0.m169433Q9(userInfo.f19472id);
            final ConversationStatus conversationStatus = (userM169433Q9 == null || (relationship = userM169433Q9.localRelationship) == null) ? ConversationStatus.get("default") : relationship.conversationStatus;
            RelationshipStatus relationshipStatus = RelationshipStatus.get("unknown_");
            if (vwb.m200296J(((CoreData) notification.m221295f().getModuleData(CoreData.class)).relationships)) {
                CrashHelper.m81302i(new Exception("return null relationships"), "core_like", CrashHelper.ReportLevel.p5, 100);
            } else {
                relationshipStatus = ((CoreData) notification.m221295f().getModuleData(CoreData.class)).relationships.get(0).state;
            }
            if (TEnum.equals(relationshipStatus, "matched")) {
                ArrayList arrayList = new ArrayList();
                boolean z3 = (vwb.m200296J(((CoreData) notification.m221295f().getModuleData(CoreData.class)).relationships) || vwb.m200296J(((CoreData) notification.m221295f().getModuleData(CoreData.class)).relationships.get(0).status)) ? false : true;
                if (z3 && ((CoreData) notification.m221295f().getModuleData(CoreData.class)).relationships.get(0).status.contains(MatchFrom.get("letter"))) {
                    arrayList.add(MatchFrom.get("letter"));
                }
                if (z2 && userM169433Q9 != null && userM169433Q9.superLikedMe()) {
                    arrayList.add(MatchFrom.get(MatchFrom.superLikedEach));
                } else if (z2 || (userM169433Q9 != null && userM169433Q9.superLikedMe())) {
                    arrayList.add(MatchFrom.get(MatchFrom.superLiked));
                }
                if (userM169433Q9 != null && userM169433Q9.boosted()) {
                    arrayList.add(MatchFrom.get("boosted"));
                }
                if (ura.m195053e().m195057d().mo33808c() && userM169433Q9 != null && userM169433Q9.onlineMatch()) {
                    arrayList.add(MatchFrom.get("quickchat"));
                }
                if (z3 && ((CoreData) notification.m221295f().getModuleData(CoreData.class)).relationships.get(0).status.contains(MatchFrom.get("secretcrush"))) {
                    arrayList.add(MatchFrom.get("secretcrush"));
                }
                if (z3 && ((CoreData) notification.m221295f().getModuleData(CoreData.class)).relationships.get(0).status.contains(MatchFrom.get("online")) && !arrayList.contains(MatchFrom.get("online"))) {
                    arrayList.add(MatchFrom.get("online"));
                }
                if (z3 && ((CoreData) notification.m221295f().getModuleData(CoreData.class)).relationships.get(0).status.contains(MatchFrom.get("boosted")) && !arrayList.contains(MatchFrom.get("boosted"))) {
                    arrayList.add(MatchFrom.get("boosted"));
                }
                if (z3 && ((CoreData) notification.m221295f().getModuleData(CoreData.class)).relationships.get(0).status.contains(MatchFrom.get(MatchFrom.vipseen)) && !arrayList.contains(MatchFrom.get(MatchFrom.vipseen))) {
                    arrayList.add(MatchFrom.get(MatchFrom.vipseen));
                }
                if (z3 && ((CoreData) notification.m221295f().getModuleData(CoreData.class)).relationships.get(0).status.contains(MatchFrom.get(MatchFrom.diamondReceived)) && !arrayList.contains(MatchFrom.get(MatchFrom.diamondReceived))) {
                    arrayList.add(MatchFrom.get(MatchFrom.diamondReceived));
                }
                if (z3 && ((CoreData) notification.m221295f().getModuleData(CoreData.class)).relationships.get(0).status.contains(MatchFrom.get(MatchFrom.diamondGiven)) && !arrayList.contains(MatchFrom.get(MatchFrom.diamondGiven))) {
                    arrayList.add(MatchFrom.get(MatchFrom.diamondGiven));
                }
                if (z3) {
                    ((CoreData) notification.m221295f().getModuleData(CoreData.class)).relationships.get(0).status = arrayList;
                }
                if (user == null && this.f19418i0 != null && !vwb.m200296J(((CoreData) notification.m221295f().getModuleData(CoreData.class)).relationships) && this.f19418i0.f56011id.equals(((CoreData) notification.m221295f().getModuleData(CoreData.class)).relationships.get(0).f38806id)) {
                    m31031O5();
                }
            } else if (user == null && this.f19418i0 != null && !vwb.m200296J(((CoreData) notification.m221295f().getModuleData(CoreData.class)).relationships) && this.f19418i0.f56011id.equals(((CoreData) notification.m221295f().getModuleData(CoreData.class)).relationships.get(0).f38806id)) {
                this.f19421j0.canUndo = true;
            }
            if (z2) {
                ura.m195053e().m195057d().mo33787Y7(notification.m221295f(), "relationship");
            }
            this.f72126Q.m31492w3(notification.m221295f(), new d30() { // from class: l.y3b
                @Override // p149l.d30
                public final void call() {
                    this.f195783a.m30977A7(notification, userInfo, user, conversationStatus, z2);
                }
            });
            this.f72126Q.f19687u0.m30488w7(userInfo.f19472id);
        }
    }

    /* JADX INFO: renamed from: j9 */
    public C22306c<roj0> m31118j9() {
        return CoreModule.f17545c.wait(Settings.TYPE, -1);
    }

    /* JADX INFO: renamed from: k6 */
    public C22306c<UserInfo> m31119k6() {
        return scheduled("getLiveDiversionCardInfo", 0, new v9j() { // from class: l.y2b
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return ia20.m135121e(new v9j() { // from class: l.e0b
                    @Override // p149l.v9j, java.util.concurrent.Callable
                    public final Object call() {
                        return C4728a.f19494P.auth().m185887f().m185898q(C4728a.m31200G("/users?search=liveInsert")).m185883b();
                    }
                });
            }
        }).doOnNext(new e30() { // from class: l.z2b
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f201174a.m31108h7((Envelope) obj);
            }
        }).map(new C4723a()).compose(C4728a.m31252T2());
    }

    /* JADX INFO: renamed from: k7 */
    public final /* synthetic */ C22306c m31120k7() {
        return new la20(new v9j() { // from class: l.l4b
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4728a.f19494P.auth().m185898q(C4728a.m31294e2(CoreModule.m29931H().userId())).m185883b();
            }
        }).map(new w9j() { // from class: l.m4b
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f131270a.m31112i7((Envelope) obj);
            }
        }).compose(mkd0.m154951C()).map(new w9j() { // from class: l.n4b
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f137056a.m31116j7((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: k8 */
    public C22306c<roj0> m31121k8(SettingGroups settingGroups) {
        return m31124l8(settingGroups, false);
    }

    /* JADX INFO: renamed from: l6 */
    public final int m31122l6() {
        return this.f19424k0;
    }

    /* JADX INFO: renamed from: l7 */
    public final /* synthetic */ roj0 m31123l7(StringBuilder sb, long j, Envelope envelope) {
        ActionData actionData = ((CoreData) envelope.getModuleData(CoreData.class)).action;
        ArrayList arrayList = new ArrayList();
        du2.m113670a("[See_Toast]", "net work back data done");
        if (NullChecker.m81303a(actionData)) {
            du2.m113670a("[See_Toast]", "net work back data detail: " + sb.toString() + " , " + actionData.traceId);
            ActionPageFormat actionPageFormat = actionData.pageFormat;
            List<CardPattern> list = actionPageFormat.cardPatterns;
            List<UserAction> list2 = actionPageFormat.cardOptions;
            List<User> list3 = ((CommonData) envelope.getModuleData(CommonData.class)).users;
            List<CardExtraInfo> list4 = ((CoreData) envelope.getModuleData(CoreData.class)).cardExtraInfos;
            List<CardStyle> list5 = ((CoreData) envelope.getModuleData(CoreData.class)).cardStyles;
            List<CardStyle> list6 = ((CoreData) envelope.getModuleData(CoreData.class)).likedMes;
            List<CityCData> list7 = ((CoreData) envelope.getModuleData(CoreData.class)).cityCData;
            for (final CardPattern cardPattern : list) {
                User user = (User) vwb.m200346r(list3, new w9j() { // from class: l.q2b
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return Boolean.valueOf(((User) obj).f56011id.equals(cardPattern.userId));
                    }
                });
                UserAction userAction = (UserAction) vwb.m200346r(list2, new w9j() { // from class: l.r2b
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return Boolean.valueOf(((UserAction) obj).userId.equals(cardPattern.userId));
                    }
                });
                if (NullChecker.m81303a(user)) {
                    cardPattern.cover = user.m60124fp().profileMiddle().formatted();
                    if (NullChecker.m81303a(userAction)) {
                        cardPattern.cardOptions = userAction.options;
                    }
                    arrayList.add(cardPattern);
                }
            }
            for (final ActionInsertPosition actionInsertPosition : actionData.insertFormat.insertPosition) {
                CardExtraInfo cardExtraInfo = (CardExtraInfo) vwb.m200346r(list4, new w9j() { // from class: l.s2b
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return Boolean.valueOf(((CardExtraInfo) obj).userId.equals(actionInsertPosition.userId));
                    }
                });
                CardStyle cardStyle = (CardStyle) vwb.m200346r(list5, new w9j() { // from class: l.t2b
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return Boolean.valueOf(((CardStyle) obj).userId.equals(actionInsertPosition.userId));
                    }
                });
                CardStyle cardStyle2 = (CardStyle) vwb.m200346r(list6, new w9j() { // from class: l.u2b
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return Boolean.valueOf(((CardStyle) obj).userId.equals(actionInsertPosition.userId));
                    }
                });
                CityCData cityCData = (CityCData) vwb.m200346r(list7, new w9j() { // from class: l.v2b
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return Boolean.valueOf(((CityCData) obj).userId.equals(actionInsertPosition.userId));
                    }
                });
                if (NullChecker.m81303a(cardStyle)) {
                    actionInsertPosition.cardStyle = cardStyle;
                }
                if (NullChecker.m81303a(cardStyle2)) {
                    actionInsertPosition.likedMe = cardStyle2;
                }
                if (NullChecker.m81303a(cardExtraInfo)) {
                    actionInsertPosition.cardExtraInfo = cardExtraInfo;
                }
                actionInsertPosition.cityCData = cityCData;
            }
            if (NullChecker.m81303a(actionData.toastStyle) && !vwb.m200296J(list3)) {
                actionData.toastStyle.localReportId = list3.get(0).f56011id;
            }
            actionData.pageFormat.cardPatterns = arrayList;
            actionData.dataTime = j;
            this.f19397b0.onNext(actionData);
        }
        return roj0.f160388a;
    }

    /* JADX INFO: renamed from: l8 */
    public C22306c<roj0> m31124l8(SettingGroups settingGroups, final boolean z) {
        m30983C5();
        return CoreModule.f17545c.f19639e0.m169381D9(settingGroups).doOnNext(new e30() { // from class: l.s3b
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f162090a.m30981B7(z, (roj0) obj);
            }
        }).doOnError(new e30() { // from class: l.d4b
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f84287a.m30985C7(z, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: renamed from: m6 */
    public int m31125m6() {
        return Integer.min(this.f19427l0, ura.m195053e().m195057d().mo33952y6());
    }

    /* JADX INFO: renamed from: m7 */
    public final /* synthetic */ C22306c m31126m7(final StringBuilder sb, final String str, final long j) {
        return new la20(new v9j() { // from class: l.r1b
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4728a.f19494P.auth().m185898q(C4728a.m31200G(sb.toString())).m185893l(utc0.create(Network.JSON, str)).m185883b();
            }
        }).doOnNext(new e30() { // from class: l.s1b
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f161872a.m31129n7((Envelope) obj);
            }
        }).compose(C4728a.m31252T2()).map(new w9j() { // from class: l.t1b
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f167300a.m31123l7(sb, j, (Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: m8 */
    public C22306c<roj0> m31127m8() {
        return m31130n8(false);
    }

    /* JADX INFO: renamed from: n6 */
    public C22306c<roj0> m31128n6() {
        C4729a0.m31387j().m31394l();
        return this.f72126Q.scheduled("get_see_special_card", 0, new v9j() { // from class: l.k3b
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f120810a.m31120k7();
            }
        });
    }

    /* JADX INFO: renamed from: n7 */
    public final /* synthetic */ void m31129n7(Envelope envelope) {
        this.f72126Q.m31494y3(envelope, null, true, false, true);
    }

    /* JADX INFO: renamed from: n8 */
    public final C22306c<roj0> m31130n8(final boolean z) {
        ura.m195053e().m195057d().mo33673Dg("startPoll");
        this.f19331D2.onNext(roj0.f160388a);
        if (z) {
            return m31075Z5(z);
        }
        CoreLikers.LikersTriggerBy likersTriggerBy = CoreLikers.LikersTriggerBy.home_new_liker_float;
        long jLongValue = this.f72126Q.f19687u0.f19256m0.get().longValue();
        if (ura.m195053e().m195057d().mo33831g8()) {
            likersTriggerBy = CoreLikers.LikersTriggerBy.home_total_liker_float;
        }
        final C22392a c22392aM221512b = C22392a.m221512b();
        this.f72126Q.f19687u0.m30431b7(jLongValue, likersTriggerBy, false).materialize().subscribe(mkd0.m154955G(new e30() { // from class: l.p1b
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f146662a.m30989D7(z, c22392aM221512b, (Notification) obj);
            }
        }));
        return c22392aM221512b;
    }

    /* JADX INFO: renamed from: o6 */
    public int m31131o6() {
        if (m31000G6()) {
            return 0;
        }
        return this.f19394a0.m221515e().loaded.size();
    }

    /* JADX INFO: renamed from: o8 */
    public void m31133o8() {
        this.f19328C2 = true;
        m31019L5();
    }

    /* JADX INFO: renamed from: p6 */
    public final String m31134p6() {
        String strM31087c6 = m31087c6(m30975A5(m30979B5(m31091d6(C4728a.m31326m2(this.f19378U1)))));
        return (ura.m195053e().m195057d().mo33879lk() && CoreModule.f17545c.f19704z2.m30255r3()) ? C4728a.m31200G("/users?search=selected&mode=free_real_user") : strM31087c6;
    }

    /* JADX INFO: renamed from: p7 */
    public final /* synthetic */ void m31135p7(boolean[] zArr, Portrait portrait) {
        if (TextUtils.isEmpty(portrait.userId)) {
            return;
        }
        m30994E8(portrait.userId);
        zArr[0] = true;
    }

    /* JADX INFO: renamed from: p8 */
    public C22306c<roj0> m31136p8(boolean z) {
        return (this.f19394a0.m221515e() == null || !z) ? just() : m31130n8(true);
    }

    /* JADX INFO: renamed from: q6 */
    public String m31137q6() {
        return (!NullChecker.m81303a(this.f19394a0.m221515e()) || vwb.m200296J(this.f19394a0.m221515e().loaded)) ? "" : this.f19394a0.m221515e().loaded.get(0).f19472id;
    }

    /* JADX INFO: renamed from: q7 */
    public final /* synthetic */ void m31138q7(final boolean[] zArr, SeePortrait seePortrait) {
        if (!vwb.m200296J(seePortrait.portraits)) {
            vwb.m200354z(seePortrait.portraits, new e30() { // from class: l.t0b
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f167137a.m31135p7(zArr, (Portrait) obj);
                }
            });
        }
        zArr[0] = zArr[0] && !seePortrait.reachedMaxNum;
    }

    /* JADX INFO: renamed from: q8 */
    public final void m31139q8(List<UserInfo> list, List<User> list2) {
        int iIndexOf;
        if (this.f19366Q1 || vwb.m200296J(list)) {
            return;
        }
        this.f19366Q1 = true;
        Counter counter = this.f72126Q.f19607T0;
        CounterLikeLimit counterLikeLimit = counter == null ? null : counter.likeLimit;
        if (counterLikeLimit == null || counterLikeLimit.remaining != 0 || counterLikeLimit.resetNowMillis() <= 0) {
            return;
        }
        String str = "";
        int i = 0;
        for (User user : list2) {
            int i2 = user.popLevel;
            if (i2 > i) {
                str = user.f56011id;
                i = i2;
            }
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        Iterator<UserInfo> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                iIndexOf = 0;
                break;
            }
            UserInfo next = it.next();
            if (!next.isVirtualCard() && next.f19472id.equals(str)) {
                iIndexOf = list.indexOf(next);
                break;
            }
        }
        if (iIndexOf != 0) {
            Collections.swap(list, 0, iIndexOf);
        }
    }

    /* JADX INFO: renamed from: r6 */
    public UserInfo m31140r6() {
        if (!NullChecker.m81303a(this.f19394a0.m221515e()) || vwb.m200296J(this.f19394a0.m221515e().loaded)) {
            return null;
        }
        return this.f19394a0.m221515e().loaded.get(0);
    }

    /* JADX INFO: renamed from: r7 */
    public final /* synthetic */ Boolean m31141r7(Envelope envelope) {
        List<SeePortrait> list = ((CoreData) envelope.getModuleData(CoreData.class)).seePortraits;
        final boolean[] zArr = {false};
        if (!vwb.m200296J(list)) {
            vwb.m200354z(list, new e30() { // from class: l.l0b
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f125483a.m31138q7(zArr, (SeePortrait) obj);
                }
            });
        }
        return Boolean.valueOf(zArr[0]);
    }

    /* JADX INFO: renamed from: r8 */
    public final User m31142r8() {
        return this.f19418i0;
    }

    /* JADX INFO: renamed from: s6 */
    public C22306c<roj0> m31143s6(String str, String str2, String str3) {
        String str4;
        String strMo30681Dm;
        final long jGuessedCurrentServerTime = qib0.f154693H.guessedCurrentServerTime();
        final StringBuilder sb = new StringBuilder();
        if (TextUtils.isEmpty(str2)) {
            sb.append(String.format("/cards?mode=%s", str));
            str4 = "users/suggested/passive/insert";
        } else {
            if (jGuessedCurrentServerTime - this.f19349J2 < f19319N2) {
                return C22306c.just(roj0.f160388a);
            }
            sb.append(String.format("/cards?mode=%s&type=%s", str, str2));
            this.f19349J2 = qib0.f154693H.guessedCurrentServerTime();
            str4 = "users/suggested/active/insert";
        }
        Act actM104962d = c30.m104962d();
        if (actM104962d != null || this.f19352K2) {
            strMo30681Dm = CoreModule.m29932K().isMainPage(actM104962d) ? CoreModule.m29932K().mo30681Dm() : "other";
        } else {
            this.f19352K2 = true;
            strMo30681Dm = "cold";
        }
        sb.append(String.format("&tab=%s", strMo30681Dm));
        if (str3 == null) {
            str3 = "";
        }
        final String str5 = str3;
        return this.f72126Q.scheduled(str4, 0, new v9j() { // from class: l.e1b
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f88741a.m31126m7(sb, str5, jGuessedCurrentServerTime);
            }
        });
    }

    /* JADX INFO: renamed from: s7 */
    public final /* synthetic */ C22306c m31144s7(final int i, final UserInfo userInfo) {
        return C22306c.fromCallable(new Callable() { // from class: l.k2b
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f120704a.m31147t7(i, userInfo);
            }
        }).compose(C4728a.m31252T2()).doOnNext(new e30() { // from class: l.m2b
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f130914a.m31149u7(i, userInfo, (roj0) obj);
            }
        });
    }

    /* JADX INFO: renamed from: s8 */
    public final UserInfo m31145s8() {
        return this.f19421j0;
    }

    /* JADX INFO: renamed from: t6 */
    public void m31146t6(final UserInfo userInfo, final int i, final boolean z) {
        e51.m114742G(new Runnable() { // from class: l.o0b
            @Override // java.lang.Runnable
            public final void run() {
                this.f141307a.m31132o7(userInfo, i, z);
            }
        });
    }

    /* JADX INFO: renamed from: t7 */
    public final /* synthetic */ roj0 m31147t7(int i, UserInfo userInfo) throws Exception {
        User userM169433Q9;
        if (!userInfo.isVirtualCard() && (userM169433Q9 = this.f72126Q.f19639e0.m169433Q9(userInfo.f19472id)) != null && userM169433Q9.hasPic()) {
            Picture.ImageUri imageUriMo33782Xf = ura.m195053e().m195057d().mo33782Xf(userM169433Q9.media(0));
            if (i == 0) {
                qib0.f154691G.m102374u0(imageUriMo33782Xf);
            } else {
                qib0.f154691G.m102379z0(imageUriMo33782Xf);
            }
        }
        return roj0.f160388a;
    }

    /* JADX INFO: renamed from: u6, reason: merged with bridge method [inline-methods] */
    public final void m31132o7(UserInfo userInfo, int i, boolean z) {
        if (!NullChecker.m81303a(this.f19394a0.m221515e()) || vwb.m200296J(this.f19394a0.m221515e().loaded)) {
            return;
        }
        this.f19394a0.m221515e().setRefreshValue(true);
        List<UserInfo> list = this.f19394a0.m221515e().loaded;
        if (z && !vwb.m200296J(list)) {
            ListIterator<UserInfo> listIterator = list.listIterator();
            while (listIterator.hasNext()) {
                UserInfo next = listIterator.next();
                if (NullChecker.m81303a(next) && TextUtils.equals(next.f19472id, userInfo.f19472id) && userInfo.virtualCardType == next.virtualCardType) {
                    listIterator.remove();
                }
            }
        }
        if (i < 0 || i > list.size()) {
            this.f19394a0.m221515e().setRefreshValue(true);
            C22392a<PartialListOpt<UserInfo>> c22392a = this.f19394a0;
            c22392a.onNext(c22392a.m221515e().setReason(PartialListOpt.RefreshReason.INSERT_LOCAL_BREAK));
        } else {
            list.add(i, userInfo);
            this.f19394a0.m221515e().setRefreshValue(true);
            C22392a<PartialListOpt<UserInfo>> c22392a2 = this.f19394a0;
            c22392a2.onNext(c22392a2.m221515e().setReason(PartialListOpt.RefreshReason.INSERT_LOCAL_FINAL));
        }
    }

    /* JADX INFO: renamed from: u7 */
    public final /* synthetic */ void m31149u7(int i, UserInfo userInfo, roj0 roj0Var) {
        boolean z;
        this.f19415h0 = false;
        PartialListOpt<UserInfo> partialListOptM221515e = this.f19394a0.m221515e();
        List arrayList = partialListOptM221515e == null ? new ArrayList() : partialListOptM221515e.loaded;
        if (userInfo.isVirtualCard()) {
            z = false;
        } else {
            Iterator it = arrayList.iterator();
            z = false;
            while (it.hasNext()) {
                UserInfo userInfo2 = (UserInfo) it.next();
                if (NullChecker.m81303a(userInfo2) && userInfo2.f19472id.equals(userInfo.f19472id) && !m31105g8(userInfo, userInfo2)) {
                    it.remove();
                    z = true;
                }
            }
        }
        if (!userInfo.isVirtualCard()) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                if (TextUtils.equals(userInfo.f19472id, ((UserInfo) it2.next()).f19472id)) {
                    CrashHelper.m81296c(new Exception("repeat suggested card"));
                    if (z && ura.m195053e().m195057d().mo33762V6()) {
                        m31109h8("repeat suggested card");
                        return;
                    }
                    return;
                }
            }
        }
        if (ura.m195053e().m195057d().mo33762V6() && userInfo.isVirtualCard()) {
            VirtualCardType virtualCardType = userInfo.virtualCardType;
            VirtualCardType virtualCardType2 = VirtualCardType.OnlineMatchBroadcastCard;
            if (virtualCardType == virtualCardType2 && !vwb.m200296J(arrayList) && ((UserInfo) arrayList.get(0)).isVirtualCard() && ((UserInfo) arrayList.get(0)).virtualCardType == virtualCardType2) {
                if (z && ura.m195053e().m195057d().mo33762V6()) {
                    m31109h8("same quickChat Insert");
                    return;
                }
                return;
            }
        }
        if (arrayList.size() >= i) {
            arrayList.add(i, userInfo);
        } else {
            arrayList.add(userInfo);
        }
        this.f19388Y.add(userInfo.f19472id);
        if (CoreModule.m29935P().m94656g().mo35048b8()) {
            if (vwb.m200296J(this.f72126Q.f19641e2.f86632U)) {
                this.f72126Q.f19641e2.f86632U = new ArrayList();
            }
            if (userInfo.isPinLike) {
                UserWithRelationShip userWithRelationShipNew_ = UserWithRelationShip.new_();
                userWithRelationShipNew_.userId = userInfo.f19472id;
                userWithRelationShipNew_.relationship = userInfo.topLikeRelationship;
                this.f72126Q.f19641e2.f86632U.add(userWithRelationShipNew_);
            }
            dka dkaVar = this.f72126Q.f19641e2;
            Collections.sort(dkaVar.f86632U, dkaVar.f86641d0);
            this.f72126Q.f19641e2.m112212u3();
        }
        DbLinks dbLinksNew_ = DbLinks.new_();
        dbLinksNew_.links.next = "";
        this.f19394a0.onNext(new PartialListOpt(arrayList, dbLinksNew_).setReason(PartialListOpt.RefreshReason.INSERT_USER_CARD));
    }

    /* JADX INFO: renamed from: u8 */
    public C22306c<roj0> m31150u8(final User user, boolean z) {
        final String str = String.format("{\"status\":\"%s\",\"swipedTime\":\"%s\"}", z ? "liked" : RelationshipStatus.disliked, Converter.dateToApiTimeString(mqi0.m155944o()));
        return scheduled("reSwipe_" + user.f56011id, -1, new v9j() { // from class: l.g2b
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return ia20.m135121e(new v9j() { // from class: l.tza
                    @Override // p149l.v9j, java.util.concurrent.Callable
                    public final Object call() {
                        return C4728a.f19494P.auth().m185898q(C4728a.m31211I2("/chat-relations/" + user.f56011id)).m185894m(utc0.create(Network.JSON, str)).m185883b();
                    }
                }).map(new w9j() { // from class: l.uza
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return roj0.f160388a;
                    }
                }).observeOn(jo0.m142408a());
            }
        });
    }

    /* JADX INFO: renamed from: v6 */
    public C22306c<Boolean> m31151v6() {
        return this.f72126Q.scheduled("see-portraits-post", 0, new v9j() { // from class: l.yza
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return ia20.m135117a(new v9j() { // from class: l.n0b
                    @Override // p149l.v9j, java.util.concurrent.Callable
                    public final Object call() {
                        return C4728a.f19494P.auth().m185898q(C4728a.m31213J0("/see-portraits")).m185893l(utc0.create(Network.JSON, "")).m185883b();
                    }
                });
            }
        }).doOnError(new e30() { // from class: l.zza
            @Override // p149l.e30
            public final void call(Object obj) {
                ((Throwable) obj).getMessage();
            }
        }).map(new w9j() { // from class: l.a0b
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f67018a.m31141r7((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: v7 */
    public final /* synthetic */ void m31152v7(Envelope envelope) {
        m30999G5(envelope);
        if (ConnectivityReceiver.m81286i()) {
            vwb.m200354z(vwb.m200291E(((CommonData) envelope.getModuleData(CommonData.class)).users), new e30() { // from class: l.z3b
                @Override // p149l.e30
                public final void call(Object obj) {
                    CoreSuggested.m30899a3((User) obj);
                }
            });
        }
        this.f72126Q.m31492w3(envelope, null);
    }

    /* JADX INFO: renamed from: v8 */
    public void m31153v8(MissMatch missMatch) {
        if (missMatch.version > this.f19356M0.get().intValue()) {
            this.f19356M0.put(Integer.valueOf(missMatch.version));
            this.f19365Q0.put(0);
            this.f19363P0.put(0L);
        }
    }

    /* JADX INFO: renamed from: w6 */
    public C22306c<roj0> m31154w6(final UserInfo userInfo, final int i) {
        if (i == 0 && C4737e0.m31949a().m31954e()) {
            i = 1;
        }
        return this.f72126Q.scheduled("users/suggested/insert", 0, new v9j() { // from class: l.w1b
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f183983a.m31144s7(i, userInfo);
            }
        });
    }

    /* JADX INFO: renamed from: w7 */
    public final /* synthetic */ UserInfo m31155w7(Envelope envelope) {
        User user = !vwb.m200296J(((CommonData) envelope.getModuleData(CommonData.class)).users) ? ((CommonData) envelope.getModuleData(CommonData.class)).users.get(0) : null;
        Relationship relationship = !vwb.m200296J(((CoreData) envelope.getModuleData(CoreData.class)).relationships) ? ((CoreData) envelope.getModuleData(CoreData.class)).relationships.get(0) : null;
        HashMap<String, String> map = new HashMap<>();
        CoreModule.m29934N().mo60406zd(envelope, map);
        if ((relationship != null && TEnum.equals(relationship.state, "matched")) || user == null) {
            return null;
        }
        UserInfo userInfo = new UserInfo();
        String str = user.f56011id;
        userInfo.f19472id = str;
        userInfo.preSwipedDirection = SwipeDirection.LEFT;
        userInfo.hasMoment = map.containsKey(str);
        m31154w6(userInfo, 0);
        return userInfo;
    }

    /* JADX INFO: renamed from: w8 */
    public void m31156w8() {
        scheduled("refresh_swipe_pay_will", 0, new v9j() { // from class: l.s0b
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f161763a.m30997F7();
            }
        });
    }

    /* JADX INFO: renamed from: x5 */
    public final String m31157x5(String str) {
        return C4728a.m31362v2(j2e0.m139448o(Uri.parse(str)).get(Oauth2AccessToken.KEY_UID) + "?search=like-relationship");
    }

    /* JADX INFO: renamed from: x6 */
    public final C22306c<UserInfo> m31158x6(C22306c<Envelope> c22306c) {
        return c22306c.doOnNext(new e30() { // from class: l.g3b
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f100374a.m31152v7((Envelope) obj);
            }
        }).compose(C4728a.m31252T2()).map(new w9j() { // from class: l.i3b
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f110634a.m31155w7((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: x7 */
    public final /* synthetic */ Notification m31159x7(boolean z, UserInfo userInfo, boolean z2, User user, Notification notification) {
        if (z || !userInfo.f19472id.equals(C4729a0.m31387j().f19525d.get())) {
            m31117j8(notification, z, z2, userInfo, user);
            return notification;
        }
        C4729a0.m31387j().f19525d.put("");
        return notification;
    }

    /* JADX INFO: renamed from: x8 */
    public C22306c<Boolean> m31160x8(String str) {
        return m31164y8(str, false);
    }

    /* JADX INFO: renamed from: y5 */
    public C22306c<Boolean> m31161y5(String str) {
        return m31164y8(str, true);
    }

    /* JADX INFO: renamed from: y6 */
    public boolean m31162y6(List<j760<UserInfo, Integer>> list) {
        if (list == null) {
            return false;
        }
        PartialListOpt<UserInfo> partialListOptM221515e = this.f19394a0.m221515e();
        if (!NullChecker.m81303a(partialListOptM221515e)) {
            return false;
        }
        List<UserInfo> list2 = partialListOptM221515e.loaded;
        for (j760<UserInfo, Integer> j760Var : list) {
            if (j760Var != null && j760Var.f116564a != null) {
                if (!NullChecker.m81303a(j760Var.f116565b) || j760Var.f116565b.intValue() < 0 || list2.size() < j760Var.f116565b.intValue()) {
                    list2.add(j760Var.f116564a);
                } else {
                    list2.add(j760Var.f116565b.intValue(), j760Var.f116564a);
                }
                if (NullChecker.m81303a(j760Var.f116564a)) {
                    this.f19388Y.add(j760Var.f116564a.f19472id);
                }
            }
        }
        DbLinks dbLinksNew_ = DbLinks.new_();
        dbLinksNew_.links.next = "";
        this.f19394a0.onNext(new PartialListOpt(list2, dbLinksNew_).setReason(PartialListOpt.RefreshReason.INSERT_VIRTUAL_CARD));
        return true;
    }

    /* JADX INFO: renamed from: y7 */
    public final /* synthetic */ void m31163y7(boolean z, UserInfo userInfo, boolean z2, Relationship relationship, LikeExtraData likeExtraData, LikeFrom likeFrom, Relationship relationship2) {
        if (z && !TEnum.equals(relationship2.state, "matched")) {
            CrashHelper.m81296c(new Exception("Reply to the greeting of instant-chat, but no match, relationship id = " + relationship2.f38806id + ", user id = " + CoreModule.m29931H().userId()));
        }
        if (TEnum.equals(relationship2.state, "matched")) {
            CoreModule.f17545c.f19622Y0.f94272q = 0;
            this.f72126Q.f19687u0.m30491x7(userInfo.f19472id);
            if (ura.m195053e().m195057d().mo33755U9()) {
                this.f72126Q.f19644f2.m148606K3(userInfo.f19472id);
            }
            if (this.f72126Q.f19701y2.m155330E3()) {
                this.f72126Q.f19701y2.m155348W3(userInfo.f19472id);
            }
        } else if (ura.m195053e().m195057d().mo33755U9() && z2) {
            this.f72126Q.f19644f2.m148606K3(userInfo.f19472id);
        } else if (this.f72126Q.f19701y2.m155330E3() && z2) {
            this.f72126Q.f19701y2.m155348W3(userInfo.f19472id);
        }
        if (TEnum.equals(relationship2.state, "matched")) {
            C4729a0.m31387j().m31390g();
            String str = C4729a0.m31387j().f19525d.get();
            if (!str.isEmpty() && userInfo.f19472id.equals(C4729a0.m31387j().m31392i())) {
                m31010I8(vwb.m200324f0(str));
            }
            qib0.m174815e1("home_user_matched", "user_id", CoreModule.m29931H().userId(), "other_user_id", userInfo.f19472id);
        }
        if (CoreModule.m29934N().mo60267Co()) {
            if (TEnum.equals(relationship.state, "matched")) {
                this.f72126Q.f19678r0.f20027h0.onNext(j760.m140076a(userInfo.f19472id, relationship.state));
            } else {
                C4732c c4732c = this.f72126Q;
                if (z2) {
                    c4732c.f19678r0.f20027h0.onNext(j760.m140076a(userInfo.f19472id, RelationshipStatus.get("superliked")));
                } else {
                    c4732c.f19678r0.f20027h0.onNext(j760.m140076a(userInfo.f19472id, relationship.state));
                }
            }
        }
        if (TEnum.equals(relationship2.state, "matched") && likeExtraData != null && NullChecker.m81303a(likeExtraData.matchScData)) {
            l3f l3fVar = new l3f();
            l3fVar.f125900s = MatchScData.MID;
            l3fVar.f125885d = EventNameEnum.USER_BEHAVIOR_COMPLEMENT;
            MatchScData matchScData = likeExtraData.matchScData;
            l3fVar.f125895n = matchScData.pageId;
            zvf0.m220392n(l3fVar, matchScData.toTrackParamMap());
        }
        if (TEnum.equals(relationship2.state, "matched") && TEnum.equals(likeFrom, LikeFrom.fakeMatch) && !ura.m195053e().m195055b().mo33649wf() && !xma.m210077h4()) {
            CoreModule.m29935P().m94654e().mo34965Fb();
        }
        if (TEnum.equals(relationship2.state, "matched") && ura.m195053e().m195055b().mo33649wf() && TEnum.equals(likeFrom, LikeFrom.fakeMatch) && !xma.m210071e4()) {
            CoreModule.m29935P().m94654e().mo34972Qo();
        }
    }

    /* JADX INFO: renamed from: y8 */
    public final C22306c<Boolean> m31164y8(final String str, final boolean z) {
        return scheduled("reject_or_accept_fake_quick_chat", -1, new v9j() { // from class: l.x1b
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return ia20.m135121e(new v9j() { // from class: l.a4b
                    @Override // p149l.v9j, java.util.concurrent.Callable
                    public final Object call() {
                        return CoreSuggested.m30937m5(str, z);
                    }
                }).map(new w9j() { // from class: l.b4b
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return Boolean.valueOf(((Envelope) obj).meta.code == 200);
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: z5 */
    public void m31165z5(final boolean z) {
        e51.m114743H(CoreModule.f17544b, new Runnable() { // from class: l.q1b
            @Override // java.lang.Runnable
            public final void run() {
                this.f152119a.m31036P6(z);
            }
        }, 1000L);
    }

    /* JADX INFO: renamed from: z6 */
    public int m31166z6(String str) {
        if (NullChecker.m81303a(this.f19390Y1.get(str))) {
            return this.f19390Y1.get(str).intValue();
        }
        return -1;
    }

    /* JADX INFO: renamed from: z7 */
    public final /* synthetic */ C22306c m31167z7(final boolean z, final UserInfo userInfo, final Relationship relationship, Map map, Long l2, final boolean z2, final User user, final boolean z3, final LikeExtraData likeExtraData, final LikeFrom likeFrom) {
        C22306c<Envelope> c22306cM34905m3;
        if (z || !userInfo.f19472id.equals(C4729a0.m31387j().f19525d.get())) {
            c22306cM34905m3 = C4759y.m34905m3(userInfo.f19472id, relationship, map);
        } else {
            c22306cM34905m3 = C4759y.m34907o3(C4729a0.m31387j().f19525d.get());
            C4729a0.m31387j().f19526e.put(Boolean.FALSE);
            zvf0.m220396r("e_special_card_swiped_left", "p_suggest_users_home_view");
            C4729a0.m31387j().m31405w(userInfo.f19472id);
        }
        return c22306cM34905m3.compose(rzh0.m181751e(l2)).materialize().map(new w9j() { // from class: l.h2b
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f105506a.m31159x7(z, userInfo, z2, user, (Notification) obj);
            }
        }).dematerialize().take(1).compose(C4728a.m31252T2()).map(new w9j() { // from class: l.i2b
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return CoreSuggested.m30868K4((Envelope) obj);
            }
        }).doOnNext(new e30() { // from class: l.j2b
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f115899a.m31163y7(z3, userInfo, z2, relationship, likeExtraData, likeFrom, (Relationship) obj);
            }
        });
    }

    /* JADX INFO: renamed from: z8 */
    public void m31168z8(final String str) {
        if (NullChecker.m81303a(this.f19367R.m221515e()) && NullChecker.m81303a(this.f19367R.m221515e().f116565b) && NullChecker.m81303a(this.f19367R.m221515e().f116564a)) {
            vwb.m200322e0(this.f19367R.m221515e().f116565b, new w9j() { // from class: l.k4b
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(((DislikedUsers) obj).f20387id.equals(str));
                }
            });
        }
        this.f72126Q.f19688u1.m195051b3(str);
    }

    public static class UserInfo implements Parcelable, kj4 {
        public static final Parcelable.Creator<UserInfo> CREATOR = new C4722a();
        public static final String VIRTUAL_CARD = "VirtualCard";
        public Active active;
        public int autoAvatarIndex;
        public boolean canGreet;
        public boolean canUndo;
        public String cardExtInfo;
        public String cardId;
        public CardInfos cardInfos;
        public long checkPointTime;
        public CityCData cityCData;
        public SuggestedComplimentItem compliment;
        public ControlCardInfo controlCardInfo;
        public CoreMomentInfo coreMomentInfo;
        public List<CoreMomentInfo> coreMomentInfoList;
        public CreditScoreData creditScore;
        public String descriptionContent;
        public String descriptionId;
        public boolean disableUndo;
        public List<DynamicLable> dynamicLabelList;
        public Object extensionObject;
        public String extraInfo;
        public FourSelectOneAdCardData fourSelectOneAdCardData;
        public int friendSenseExamLikeCnt;
        public String from;
        public boolean hasDescTagShow;
        public boolean hasLikeMe;
        public String hasLikeMeFrom;
        public boolean hasLikeMeSlideCardBottom;
        public boolean hasLikeMeSlideCardReward;
        public boolean hasLikeMeSlideCardTop;
        public boolean hasMoment;
        public LiveUserLevel hierarchy;

        /* JADX INFO: renamed from: id */
        public String f19472id;
        public IdealInfo idealInfo;
        public ImpressSignalCardWrapper impressSignalCardWrapper;
        public IntlInsertCardData intlInsertCardData;
        public LiveLivingCardDataWrapper intlLiveCardPartDataWrapper;
        public boolean isCoreMomentCard;
        public boolean isCoreMomentThemeCard;
        public boolean isExportCard;
        public boolean isIntlLikeLimitInsert;
        public boolean isLikeMe;
        public boolean isPinLike;
        public boolean isShowFakePhotoFeedback;
        public boolean isThemeCard;
        public boolean isUndo;
        public boolean isUserCardPush;
        public boolean jumpSwipe;
        public String letter;
        public List<String> likeIdentifiersList;
        public List<LiteraturesComments> literaturesComments;
        public LiveLivingCardDataWrapper liveLivingCardDataWrapper;
        public String liveRoomInfo;
        public Relationship localRelationship;
        public boolean meetAgain;
        public MyTabTask myTabTask;
        public boolean newUser;
        public String operationUrl;
        public String orderMsg;
        public String payCardStyle;
        public boolean picksGuideUser;
        public SwipeDirection preSwipedDirection;
        public bj90 profileContext;
        public String profileLikeCommentId;
        public List<ProfileLikesComment> profileLikesComments;
        public QuickChatCardWrapper quickChatCardWrapper;
        public QuickChatPartyInvitation quickChatPartyInvitation;
        private List<RecommendMessage> recommendMessage;
        public CardInfoRenderFrom renderFrom;

        @Expose
        private User renderUser;
        public SamesCardData samesCardData;
        public boolean selectionUser;
        public boolean sendPinLike;
        public ArrayList<SuggestReason> suggestReasons;
        public Relationship topLikeRelationship;
        public Map<String, String> trackMap;
        public UserActivityInfo userActivityInfo;
        public int userCardPushReason;
        public String userCardPushTag;
        public int userCardPushType;
        public List<Media> userMedia;
        public BubbleInfo userState;
        public UssTags ussTags;
        public VirtualCardType virtualCardType;

        /* JADX INFO: renamed from: com.p1.mobile.putong.core.api.CoreSuggested$UserInfo$a */
        public class C4722a implements Parcelable.Creator<UserInfo> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public UserInfo createFromParcel(Parcel parcel) {
                return new UserInfo(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public UserInfo[] newArray(int i) {
                return new UserInfo[i];
            }
        }

        public UserInfo(Parcel parcel) {
            this.checkPointTime = -1L;
            this.hasDescTagShow = false;
            this.isCoreMomentThemeCard = false;
            this.isCoreMomentCard = false;
            this.disableUndo = false;
            this.isPinLike = false;
            this.sendPinLike = false;
            this.renderUser = null;
            this.autoAvatarIndex = -1;
            this.jumpSwipe = false;
            this.creditScore = null;
            this.isIntlLikeLimitInsert = false;
            this.myTabTask = null;
            this.renderFrom = CardInfoRenderFrom.UNKNOWN;
            this.trackMap = new HashMap();
            this.hasMoment = false;
            this.isShowFakePhotoFeedback = false;
            this.f19472id = parcel.readString();
            this.letter = parcel.readString();
            this.isUndo = parcel.readByte() != 0;
            this.canUndo = parcel.readByte() != 0;
            this.orderMsg = parcel.readString();
            this.cardId = parcel.readString();
            this.cardExtInfo = parcel.readString();
            this.renderFrom = CardInfoRenderFrom.valueOf(parcel.readString());
        }

        /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
        public UserInfo m223816clone() {
            UserInfo userInfo = new UserInfo();
            userInfo.f19472id = this.f19472id;
            userInfo.isUndo = this.isUndo;
            userInfo.canUndo = this.canUndo;
            userInfo.preSwipedDirection = this.preSwipedDirection;
            userInfo.letter = this.letter;
            userInfo.virtualCardType = this.virtualCardType;
            userInfo.orderMsg = this.orderMsg;
            userInfo.cardId = this.cardId;
            userInfo.cardExtInfo = this.cardExtInfo;
            userInfo.suggestReasons = this.suggestReasons;
            userInfo.ussTags = this.ussTags;
            userInfo.hierarchy = this.hierarchy;
            userInfo.hasMoment = this.hasMoment;
            userInfo.userMedia = this.userMedia;
            userInfo.descriptionContent = this.descriptionContent;
            userInfo.descriptionId = this.descriptionId;
            userInfo.isThemeCard = this.isThemeCard;
            userInfo.hasLikeMe = this.hasLikeMe;
            userInfo.quickChatCardWrapper = this.quickChatCardWrapper;
            userInfo.picksGuideUser = this.picksGuideUser;
            userInfo.literaturesComments = this.literaturesComments;
            userInfo.liveLivingCardDataWrapper = this.liveLivingCardDataWrapper;
            userInfo.intlLiveCardPartDataWrapper = this.intlLiveCardPartDataWrapper;
            userInfo.recommendMessage = this.recommendMessage;
            userInfo.active = this.active;
            userInfo.canGreet = this.canGreet;
            userInfo.impressSignalCardWrapper = this.impressSignalCardWrapper;
            userInfo.likeIdentifiersList = this.likeIdentifiersList;
            userInfo.samesCardData = this.samesCardData;
            userInfo.intlInsertCardData = this.intlInsertCardData;
            userInfo.cardInfos = this.cardInfos;
            userInfo.extraInfo = this.extraInfo;
            userInfo.controlCardInfo = this.controlCardInfo;
            userInfo.hasDescTagShow = this.hasDescTagShow;
            userInfo.renderUser = this.renderUser;
            userInfo.coreMomentInfo = this.coreMomentInfo;
            userInfo.isCoreMomentThemeCard = this.isCoreMomentThemeCard;
            userInfo.isCoreMomentCard = this.isCoreMomentCard;
            userInfo.compliment = this.compliment;
            userInfo.disableUndo = this.disableUndo;
            userInfo.newUser = this.newUser;
            userInfo.quickChatPartyInvitation = this.quickChatPartyInvitation;
            userInfo.isPinLike = this.isPinLike;
            userInfo.sendPinLike = this.sendPinLike;
            userInfo.topLikeRelationship = this.topLikeRelationship;
            userInfo.meetAgain = this.meetAgain;
            userInfo.payCardStyle = this.payCardStyle;
            userInfo.cityCData = this.cityCData;
            userInfo.friendSenseExamLikeCnt = this.friendSenseExamLikeCnt;
            userInfo.operationUrl = this.operationUrl;
            userInfo.fourSelectOneAdCardData = this.fourSelectOneAdCardData;
            userInfo.dynamicLabelList = this.dynamicLabelList;
            userInfo.selectionUser = this.selectionUser;
            userInfo.hasLikeMeSlideCardTop = this.hasLikeMeSlideCardTop;
            userInfo.idealInfo = this.idealInfo;
            userInfo.autoAvatarIndex = this.autoAvatarIndex;
            userInfo.jumpSwipe = this.jumpSwipe;
            userInfo.isIntlLikeLimitInsert = this.isIntlLikeLimitInsert;
            CreditScoreData creditScoreData = this.creditScore;
            if (creditScoreData != null) {
                userInfo.creditScore = creditScoreData.mo223809clone();
            }
            userInfo.from = this.from;
            UserActivityInfo userActivityInfo = this.userActivityInfo;
            if (userActivityInfo != null) {
                userInfo.userActivityInfo = userActivityInfo.mo223809clone();
            }
            return userInfo;
        }

        public void debugRecommendMessage() {
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // p149l.kj4
        public int getPreBackOperation() {
            SwipeDirection swipeDirection = this.preSwipedDirection;
            if (swipeDirection == null) {
                return -1;
            }
            int i = C4726d.f19476a[swipeDirection.ordinal()];
            if (i == 1) {
                return 2;
            }
            if (i != 2) {
                return i != 3 ? -1 : 1;
            }
            return 0;
        }

        public List<RecommendMessage> getRecommendMessage() {
            return this.recommendMessage;
        }

        @Nullable
        public User getRenderUser() {
            return this.renderUser;
        }

        public boolean isHasMoment() {
            return this.hasMoment;
        }

        public boolean isHuman() {
            CoreMomentInfo coreMomentInfo = this.coreMomentInfo;
            return coreMomentInfo != null && TextUtils.equals(coreMomentInfo.sourceType, "human");
        }

        public boolean isImpressSignal() {
            return this.virtualCardType == VirtualCardType.ImpressSignalCard;
        }

        public boolean isInitiateQuickChat() {
            return this.virtualCardType == VirtualCardType.OnlineMatchBroadcastCard && NullChecker.m81303a(this.quickChatCardWrapper) && this.quickChatCardWrapper.cardType == 1;
        }

        public boolean isLivingCard() {
            if (!NullChecker.m81303a(this.virtualCardType)) {
                return false;
            }
            VirtualCardType virtualCardType = this.virtualCardType;
            return virtualCardType == VirtualCardType.LiveLivingCard || virtualCardType == VirtualCardType.LiveVoiceCard;
        }

        public boolean isMomentInfoCard() {
            if (!NullChecker.m81303a(this.coreMomentInfo) || !NullChecker.m81303a(this.cardInfos) || TextUtils.isEmpty(this.cardInfos.momentId) || sb90.m183207c(CoreModule.f17545c.f19639e0.m169430Pa(this.f19472id))) {
                return false;
            }
            return ura.m195053e().m195057d().mo33933ui() || !vwb.m200296J(this.coreMomentInfo.media);
        }

        public boolean isNativeAdViewCard() {
            return this.virtualCardType == VirtualCardType.NativeAdViewCard;
        }

        public boolean isNewSpecialLike() {
            return false;
        }

        public boolean isOffsetUpRightBottom() {
            return (!CoreModule.f17545c.f19639e0.f149284U6.contains(this.f19472id) && this.isShowFakePhotoFeedback) || ura.m195053e().m195057d().mo33775Wc(this);
        }

        public boolean isOffsetUpRightBottomValue() {
            return (!CoreModule.f17545c.f19639e0.f149284U6.contains(this.f19472id) && this.isShowFakePhotoFeedback) || ura.m195053e().m195057d().mo33775Wc(this) || isShowCertificationGuidanceItem() || ura.m195053e().m195057d().mo33655Ae(this);
        }

        public boolean isOnlineMatchChatBoot() {
            return this.virtualCardType == VirtualCardType.OnlineMatchChatBootCard;
        }

        public boolean isPassiveQucikAudio() {
            return this.virtualCardType == VirtualCardType.QuickAudioBroadcastCard && NullChecker.m81303a(this.quickChatCardWrapper) && this.quickChatCardWrapper.cardType == 2;
        }

        public boolean isPassiveQuickChat() {
            VirtualCardType virtualCardType = this.virtualCardType;
            return (virtualCardType == VirtualCardType.OnlineMatchBroadcastCard || virtualCardType == VirtualCardType.QuickAudioBroadcastCard) && NullChecker.m81303a(this.quickChatCardWrapper) && this.quickChatCardWrapper.cardType == 2;
        }

        public boolean isQuickChatPartyInvitationCard() {
            VirtualCardType virtualCardType = this.virtualCardType;
            return virtualCardType == VirtualCardType.AudioQuickChatPartyInvitationCard || virtualCardType == VirtualCardType.TextQuickChatPartyInvitationCard;
        }

        public boolean isRepeatUser() {
            if (NullChecker.m81303a(this.ussTags)) {
                return this.ussTags.repeatedUser;
            }
            return false;
        }

        public boolean isShowCertificationGuidanceItem() {
            if (!isShowOnlyLookingAuthentication()) {
                return false;
            }
            if (ura.m195053e().m195057d().mo33709Je()) {
                return true;
            }
            CoreSuggested coreSuggested = CoreModule.f17545c.f19663m0;
            zpd0 zpd0Var = coreSuggested.f19351K1;
            uqd0 uqd0Var = coreSuggested.f19354L1;
            if (mqi0.m155928C(mqi0.m155944o(), zpd0Var.get().longValue())) {
                return TextUtils.equals(uqd0Var.get(), this.f19472id);
            }
            zpd0Var.put(Long.valueOf(mqi0.m155944o()));
            uqd0Var.put(this.f19472id);
            return true;
        }

        public boolean isShowOnlyLookingAuthentication() {
            User userM169430Pa = CoreModule.f17545c.f19639e0.m169430Pa(this.f19472id);
            if (userM169430Pa != null && NullChecker.m81303a(userM169430Pa.settings) && !vwb.m200296J(userM169430Pa.settings.settingGroups) && NullChecker.m81303a(userM169430Pa.settings.settingGroups.get(0).svipSearch) && userM169430Pa.settings.settingGroups.get(0).svipSearch.realUser && userM169430Pa.isPicVerificationVerified() && !CoreModule.f17545c.f19639e0.m169527p9().isPicVerificationVerified()) {
                StudentVerificationStatus studentVerificationStatus = StudentVerificationStatus.get("unknown_");
                VerificationCenter verificationCenterM31612k4 = CoreModule.f17545c.f19552B0.m31612k4();
                if (NullChecker.m81303a(verificationCenterM31612k4) && NullChecker.m81303a(verificationCenterM31612k4.picVerificationInfo)) {
                    studentVerificationStatus = CoreModule.f17545c.f19552B0.m31612k4().picVerificationInfo.status;
                }
                if (!TEnum.equals(studentVerificationStatus, "verified") && !TEnum.equals(studentVerificationStatus, "pending")) {
                    return true;
                }
            }
            return false;
        }

        public boolean isSpecialLike() {
            return false;
        }

        public boolean isSpecialLikeShowStyle() {
            return false;
        }

        public boolean isUserLikeMe() {
            return this.hasLikeMe;
        }

        public boolean isVirtualCard() {
            return TextUtils.equals(this.f19472id, VIRTUAL_CARD);
        }

        @Override // p149l.kj4
        public void resetPreAction() {
            this.preSwipedDirection = null;
            this.isUndo = false;
        }

        public void setRenderUser(User user) {
            this.renderUser = user;
        }

        public void setUserLikeMe(boolean z) {
            this.hasLikeMe = z;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f19472id);
            parcel.writeString(this.letter);
            parcel.writeByte(this.isUndo ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.canUndo ? (byte) 1 : (byte) 0);
            parcel.writeString(this.orderMsg);
            parcel.writeString(this.cardId);
            parcel.writeString(this.cardExtInfo);
            parcel.writeString(this.renderFrom.name());
        }

        public UserInfo() {
            this.checkPointTime = -1L;
            this.hasDescTagShow = false;
            this.isCoreMomentThemeCard = false;
            this.isCoreMomentCard = false;
            this.disableUndo = false;
            this.isPinLike = false;
            this.sendPinLike = false;
            this.renderUser = null;
            this.autoAvatarIndex = -1;
            this.jumpSwipe = false;
            this.creditScore = null;
            this.isIntlLikeLimitInsert = false;
            this.myTabTask = null;
            this.renderFrom = CardInfoRenderFrom.UNKNOWN;
            this.trackMap = new HashMap();
            this.hasMoment = false;
            this.isShowFakePhotoFeedback = false;
            this.checkPointTime = mqi0.m155944o();
        }
    }
}
