package com.p000p1.mobile.putong.core.api;

import android.app.Activity;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseArray;
import androidx.annotation.Nullable;
import com.google.gson.annotations.Expose;
import com.p000p1.mobile.putong.account.data.CameraSticker;
import com.p000p1.mobile.putong.api.ABManager;
import com.p000p1.mobile.putong.api.api.Network;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.api.C0154a;
import com.p000p1.mobile.putong.core.api.CoreSuggested;
import com.p000p1.mobile.putong.core.api.inject.provider.CoreProviderInterface;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.rx.rxthread.FastIoScheduler;
import com.p1.mobile.putong.core.data.ActionData;
import com.p1.mobile.putong.core.data.ActionInsertPosition;
import com.p1.mobile.putong.core.data.ActionPageFormat;
import com.p1.mobile.putong.core.data.Active;
import com.p1.mobile.putong.core.data.CardExtraInfo;
import com.p1.mobile.putong.core.data.CardInfoRenderFrom;
import com.p1.mobile.putong.core.data.CardInfos;
import com.p1.mobile.putong.core.data.CardModel;
import com.p1.mobile.putong.core.data.CardPattern;
import com.p1.mobile.putong.core.data.CardStyle;
import com.p1.mobile.putong.core.data.CardsIcons;
import com.p1.mobile.putong.core.data.CityCData;
import com.p1.mobile.putong.core.data.ControlCardInfo;
import com.p1.mobile.putong.core.data.CoreData;
import com.p1.mobile.putong.core.data.CoreMomentInfo;
import com.p1.mobile.putong.core.data.CreditScoreData;
import com.p1.mobile.putong.core.data.DislikedUsers;
import com.p1.mobile.putong.core.data.DynamicLable;
import com.p1.mobile.putong.core.data.FakePhotoFeedback;
import com.p1.mobile.putong.core.data.FourSelectOneAdCardData;
import com.p1.mobile.putong.core.data.IPRegion;
import com.p1.mobile.putong.core.data.IdealInfo;
import com.p1.mobile.putong.core.data.ImpressSignalCardWrapper;
import com.p1.mobile.putong.core.data.IntlInsertCardData;
import com.p1.mobile.putong.core.data.Literatures;
import com.p1.mobile.putong.core.data.LiteraturesComments;
import com.p1.mobile.putong.core.data.LiveLivingCardDataWrapper;
import com.p1.mobile.putong.core.data.MissMatch;
import com.p1.mobile.putong.core.data.MyTabTask;
import com.p1.mobile.putong.core.data.NewTags;
import com.p1.mobile.putong.core.data.PartialListOpt;
import com.p1.mobile.putong.core.data.Portrait;
import com.p1.mobile.putong.core.data.ProfileLikeComment;
import com.p1.mobile.putong.core.data.ProfileLikesComment;
import com.p1.mobile.putong.core.data.QuickChatCardWrapper;
import com.p1.mobile.putong.core.data.QuickChatPartyInvitation;
import com.p1.mobile.putong.core.data.SamesCardData;
import com.p1.mobile.putong.core.data.SeePortrait;
import com.p1.mobile.putong.core.data.SuggestReason;
import com.p1.mobile.putong.core.data.SuggestedComplimentItem;
import com.p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p1.mobile.putong.core.data.SuperLikeCount;
import com.p1.mobile.putong.core.data.SwipeDirection;
import com.p1.mobile.putong.core.data.UserAction;
import com.p1.mobile.putong.core.data.UserGreetInfo;
import com.p1.mobile.putong.core.data.UserWithRelationShip;
import com.p1.mobile.putong.core.data.VerificationCenter;
import com.p1.mobile.putong.core.data.VirtualCardType;
import com.p1.mobile.putong.core.ui.onlinematch.OnlineMatchPushUser;
import com.p1.mobile.putong.data.BubbleInfo;
import com.p1.mobile.putong.data.CommonData;
import com.p1.mobile.putong.data.ConversationStatus;
import com.p1.mobile.putong.data.Converter;
import com.p1.mobile.putong.data.Counter;
import com.p1.mobile.putong.data.CounterLikeLimit;
import com.p1.mobile.putong.data.DbLinks;
import com.p1.mobile.putong.data.DclExtensions;
import com.p1.mobile.putong.data.Device;
import com.p1.mobile.putong.data.Envelope;
import com.p1.mobile.putong.data.LikeExtraData;
import com.p1.mobile.putong.data.LikeFrom;
import com.p1.mobile.putong.data.Links;
import com.p1.mobile.putong.data.LiveUserLevel;
import com.p1.mobile.putong.data.MatchFrom;
import com.p1.mobile.putong.data.MatchScData;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.OMSThemeInfo;
import com.p1.mobile.putong.data.OMSThemeSuggestStrageryInfo;
import com.p1.mobile.putong.data.OmsNewTags;
import com.p1.mobile.putong.data.Picture;
import com.p1.mobile.putong.data.RecommendMessage;
import com.p1.mobile.putong.data.Relationship;
import com.p1.mobile.putong.data.RelationshipExtensions;
import com.p1.mobile.putong.data.RelationshipStatus;
import com.p1.mobile.putong.data.SettingGroups;
import com.p1.mobile.putong.data.StudentVerificationStatus;
import com.p1.mobile.putong.data.SwipeCardInfo;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.UserActivityInfo;
import com.p1.mobile.putong.data.UserStatus;
import com.p1.mobile.putong.data.UssTags;
import com.p1.mobile.putong.data.VoiceLiveState;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.p1.mobile.putong.remote_config.RemoteConfig;
import com.p1.mobile.putong.util.launch.LaunchStep;
import com.tantanapp.common.data.CopyObject;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.data.ValueObject;
import com.tantanapp.common.utils.ConnectivityReceiver;
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
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import l.bj90;
import l.c30;
import l.d30;
import l.du2;
import l.e30;
import l.e51;
import l.e5l;
import l.hpd0;
import l.j760;
import l.jo0;
import l.kj4;
import l.l3f;
import l.lsi0;
import l.mkd0;
import l.mqi0;
import l.o6j0;
import l.q860;
import l.roj0;
import l.rzh0;
import l.sb90;
import l.sm90;
import l.stc0;
import l.tpd0;
import l.uqd0;
import l.utc0;
import l.v9j;
import l.vqd0;
import l.vwb;
import l.w9j;
import l.xaj0;
import l.yki0;
import l.yni;
import l.zew;
import l.zpd0;
import l.zvf0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p006l.ax6;
import p006l.dka;
import p006l.ia20;
import p006l.j2e0;
import p006l.la20;
import p006l.pib;
import p006l.qib0;
import p006l.sja;
import p006l.ura;
import p006l.xma;
import p006l.xob;
import rx.Notification;
import rx.c;
import rx.subjects.a;
import rx.subjects.b;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class CoreSuggested extends ax6 {

    /* JADX INFO: renamed from: N2 */
    public static final long f3308N2 = 10000;

    /* JADX INFO: renamed from: A0 */
    public int f3309A0;

    /* JADX INFO: renamed from: A1 */
    public hpd0 f3310A1;

    /* JADX INFO: renamed from: A2 */
    public volatile long f3311A2;

    /* JADX INFO: renamed from: B0 */
    public b<roj0> f3312B0;

    /* JADX INFO: renamed from: B1 */
    public uqd0 f3313B1;

    /* JADX INFO: renamed from: B2 */
    public a<roj0> f3314B2;

    /* JADX INFO: renamed from: C0 */
    public boolean f3315C0;

    /* JADX INFO: renamed from: C1 */
    public hpd0 f3316C1;

    /* JADX INFO: renamed from: C2 */
    public boolean f3317C2;

    /* JADX INFO: renamed from: D0 */
    public tpd0 f3318D0;

    /* JADX INFO: renamed from: D1 */
    public hpd0 f3319D1;

    /* JADX INFO: renamed from: D2 */
    public b<roj0> f3320D2;

    /* JADX INFO: renamed from: E0 */
    public zpd0 f3321E0;

    /* JADX INFO: renamed from: E1 */
    public hpd0 f3322E1;

    /* JADX INFO: renamed from: E2 */
    public a<roj0> f3323E2;

    /* JADX INFO: renamed from: F0 */
    public a<roj0> f3324F0;

    /* JADX INFO: renamed from: F1 */
    public hpd0 f3325F1;

    /* JADX INFO: renamed from: F2 */
    public b<roj0> f3326F2;

    /* JADX INFO: renamed from: G0 */
    public int f3327G0;

    /* JADX INFO: renamed from: G1 */
    public hpd0 f3328G1;

    /* JADX INFO: renamed from: G2 */
    public int f3329G2;

    /* JADX INFO: renamed from: H0 */
    public zpd0 f3330H0;

    /* JADX INFO: renamed from: H1 */
    public hpd0 f3331H1;

    /* JADX INFO: renamed from: H2 */
    public a<q860<String>> f3332H2;

    /* JADX INFO: renamed from: I0 */
    public a<roj0> f3333I0;

    /* JADX INFO: renamed from: I1 */
    public hpd0 f3334I1;

    /* JADX INFO: renamed from: I2 */
    public a<j760<SwipeDirection, HashMap>> f3335I2;

    /* JADX INFO: renamed from: J0 */
    public b<Boolean> f3336J0;

    /* JADX INFO: renamed from: J1 */
    public hpd0 f3337J1;

    /* JADX INFO: renamed from: J2 */
    public long f3338J2;

    /* JADX INFO: renamed from: K0 */
    public a<Boolean> f3339K0;

    /* JADX INFO: renamed from: K1 */
    public zpd0 f3340K1;

    /* JADX INFO: renamed from: K2 */
    public boolean f3341K2;

    /* JADX INFO: renamed from: L0 */
    public a<PartialListOpt<UserInfo>> f3342L0;

    /* JADX INFO: renamed from: L1 */
    public uqd0 f3343L1;

    /* JADX INFO: renamed from: L2 */
    public final a<Object> f3344L2;

    /* JADX INFO: renamed from: M0 */
    public tpd0 f3345M0;

    /* JADX INFO: renamed from: M1 */
    public zpd0 f3346M1;

    /* JADX INFO: renamed from: M2 */
    public String f3347M2;

    /* JADX INFO: renamed from: N0 */
    public tpd0 f3348N0;

    /* JADX INFO: renamed from: N1 */
    public hpd0 f3349N1;

    /* JADX INFO: renamed from: O0 */
    public zpd0 f3350O0;

    /* JADX INFO: renamed from: O1 */
    public int f3351O1;

    /* JADX INFO: renamed from: P0 */
    public zpd0 f3352P0;

    /* JADX INFO: renamed from: P1 */
    public int f3353P1;

    /* JADX INFO: renamed from: Q0 */
    public tpd0 f3354Q0;

    /* JADX INFO: renamed from: Q1 */
    public boolean f3355Q1;

    /* JADX INFO: renamed from: R */
    public a<j760<Links, List<DislikedUsers>>> f3356R;

    /* JADX INFO: renamed from: R0 */
    public a<Boolean> f3357R0;

    /* JADX INFO: renamed from: R1 */
    public HashMap<UserInfo, j760<Integer, Long>> f3358R1;

    /* JADX INFO: renamed from: S */
    public a<j760<String, Long>> f3359S;

    /* JADX INFO: renamed from: S0 */
    public hpd0 f3360S0;

    /* JADX INFO: renamed from: S1 */
    public HashMap<UserInfo, Integer> f3361S1;

    /* JADX INFO: renamed from: T */
    public a<roj0> f3362T;

    /* JADX INFO: renamed from: T0 */
    public tpd0 f3363T0;

    /* JADX INFO: renamed from: T1 */
    public boolean f3364T1;

    /* JADX INFO: renamed from: U */
    public boolean f3365U;

    /* JADX INFO: renamed from: U0 */
    public hpd0 f3366U0;

    /* JADX INFO: renamed from: U1 */
    public boolean f3367U1;

    /* JADX INFO: renamed from: V */
    public a<Boolean> f3368V;

    /* JADX INFO: renamed from: V0 */
    public hpd0 f3369V0;

    /* JADX INFO: renamed from: V1 */
    public b<Integer> f3370V1;

    /* JADX INFO: renamed from: W */
    public long f3371W;

    /* JADX INFO: renamed from: W0 */
    public hpd0 f3372W0;

    /* JADX INFO: renamed from: W1 */
    public b<roj0> f3373W1;

    /* JADX INFO: renamed from: X */
    public int f3374X;

    /* JADX INFO: renamed from: X0 */
    public final HashMap<String, SuggestedComplimentItem> f3375X0;

    /* JADX INFO: renamed from: X1 */
    public b<roj0> f3376X1;

    /* JADX INFO: renamed from: Y */
    public HashSet<String> f3377Y;

    /* JADX INFO: renamed from: Y0 */
    public uqd0 f3378Y0;

    /* JADX INFO: renamed from: Y1 */
    public Map<String, Integer> f3379Y1;

    /* JADX INFO: renamed from: Z */
    public HashSet<String> f3380Z;

    /* JADX INFO: renamed from: Z0 */
    public uqd0 f3381Z0;

    /* JADX INFO: renamed from: Z1 */
    public Map<String, Integer> f3382Z1;

    /* JADX INFO: renamed from: a0 */
    public a<PartialListOpt<UserInfo>> f3383a0;

    /* JADX INFO: renamed from: a1 */
    public uqd0 f3384a1;

    /* JADX INFO: renamed from: a2 */
    public Map<String, Integer> f3385a2;

    /* JADX INFO: renamed from: b0 */
    public a<ActionData> f3386b0;

    /* JADX INFO: renamed from: b1 */
    public uqd0 f3387b1;

    /* JADX INFO: renamed from: b2 */
    public HashSet<String> f3388b2;

    /* JADX INFO: renamed from: c0 */
    public a<roj0> f3389c0;

    /* JADX INFO: renamed from: c1 */
    public uqd0 f3390c1;

    /* JADX INFO: renamed from: c2 */
    public HashSet<String> f3391c2;

    /* JADX INFO: renamed from: d0 */
    public b<HashMap<String, NewTags>> f3392d0;

    /* JADX INFO: renamed from: d1 */
    public zpd0 f3393d1;

    /* JADX INFO: renamed from: d2 */
    public HashSet<String> f3394d2;

    /* JADX INFO: renamed from: e0 */
    public b<roj0> f3395e0;

    /* JADX INFO: renamed from: e1 */
    public hpd0 f3396e1;

    /* JADX INFO: renamed from: e2 */
    public C0172l f3397e2;

    /* JADX INFO: renamed from: f0 */
    public UserInfo f3398f0;

    /* JADX INFO: renamed from: f1 */
    public zpd0 f3399f1;

    /* JADX INFO: renamed from: f2 */
    public b<Boolean> f3400f2;

    /* JADX INFO: renamed from: g0 */
    public zew<String, Object> f3401g0;

    /* JADX INFO: renamed from: g1 */
    public tpd0 f3402g1;

    /* JADX INFO: renamed from: g2 */
    public b<SwipeDirection> f3403g2;

    /* JADX INFO: renamed from: h0 */
    public boolean f3404h0;

    /* JADX INFO: renamed from: h1 */
    public vqd0 f3405h1;

    /* JADX INFO: renamed from: h2 */
    public b<SwipeDirection> f3406h2;

    /* JADX INFO: renamed from: i0 */
    public User f3407i0;

    /* JADX INFO: renamed from: i1 */
    public tpd0 f3408i1;

    /* JADX INFO: renamed from: i2 */
    public b<SwipeDirection> f3409i2;

    /* JADX INFO: renamed from: j0 */
    public UserInfo f3410j0;

    /* JADX INFO: renamed from: j1 */
    public zpd0 f3411j1;

    /* JADX INFO: renamed from: j2 */
    public b<roj0> f3412j2;

    /* JADX INFO: renamed from: k0 */
    public int f3413k0;

    /* JADX INFO: renamed from: k1 */
    public hpd0 f3414k1;

    /* JADX INFO: renamed from: k2 */
    public b<roj0> f3415k2;

    /* JADX INFO: renamed from: l0 */
    public int f3416l0;

    /* JADX INFO: renamed from: l1 */
    public hpd0 f3417l1;

    /* JADX INFO: renamed from: l2 */
    public b<String> f3418l2;

    /* JADX INFO: renamed from: m0 */
    public a<Long> f3419m0;

    /* JADX INFO: renamed from: m1 */
    public hpd0 f3420m1;

    /* JADX INFO: renamed from: m2 */
    public b<roj0> f3421m2;

    /* JADX INFO: renamed from: n0 */
    public long f3422n0;

    /* JADX INFO: renamed from: n1 */
    public hpd0 f3423n1;

    /* JADX INFO: renamed from: n2 */
    public b<roj0> f3424n2;

    /* JADX INFO: renamed from: o0 */
    public long f3425o0;

    /* JADX INFO: renamed from: o1 */
    public hpd0 f3426o1;

    /* JADX INFO: renamed from: o2 */
    public String f3427o2;

    /* JADX INFO: renamed from: p0 */
    public long f3428p0;

    /* JADX INFO: renamed from: p1 */
    public uqd0 f3429p1;

    /* JADX INFO: renamed from: p2 */
    public boolean f3430p2;

    /* JADX INFO: renamed from: q0 */
    public long f3431q0;

    /* JADX INFO: renamed from: q1 */
    public uqd0 f3432q1;

    /* JADX INFO: renamed from: q2 */
    public int[] f3433q2;

    /* JADX INFO: renamed from: r0 */
    public HashSet<String> f3434r0;

    /* JADX INFO: renamed from: r1 */
    public uqd0 f3435r1;

    /* JADX INFO: renamed from: r2 */
    public String f3436r2;

    /* JADX INFO: renamed from: s0 */
    public UserInfo f3437s0;

    /* JADX INFO: renamed from: s1 */
    public hpd0 f3438s1;

    /* JADX INFO: renamed from: s2 */
    public int f3439s2;

    /* JADX INFO: renamed from: t0 */
    public hpd0 f3440t0;

    /* JADX INFO: renamed from: t1 */
    public hpd0 f3441t1;

    /* JADX INFO: renamed from: t2 */
    public final Map<String, Integer> f3442t2;

    /* JADX INFO: renamed from: u0 */
    public hpd0 f3443u0;

    /* JADX INFO: renamed from: u1 */
    public hpd0 f3444u1;

    /* JADX INFO: renamed from: u2 */
    public hpd0 f3445u2;

    /* JADX INFO: renamed from: v0 */
    public hpd0 f3446v0;

    /* JADX INFO: renamed from: v1 */
    public hpd0 f3447v1;

    /* JADX INFO: renamed from: v2 */
    public zpd0 f3448v2;

    /* JADX INFO: renamed from: w0 */
    public hpd0 f3449w0;

    /* JADX INFO: renamed from: w1 */
    public hpd0 f3450w1;

    /* JADX INFO: renamed from: w2 */
    public hpd0 f3451w2;

    /* JADX INFO: renamed from: x0 */
    public hpd0 f3452x0;

    /* JADX INFO: renamed from: x1 */
    public zpd0 f3453x1;

    /* JADX INFO: renamed from: x2 */
    public a<xaj0<String, Boolean, SwipeDirection>> f3454x2;

    /* JADX INFO: renamed from: y0 */
    public int f3455y0;

    /* JADX INFO: renamed from: y1 */
    public hpd0 f3456y1;

    /* JADX INFO: renamed from: y2 */
    public long f3457y2;

    /* JADX INFO: renamed from: z0 */
    public int f3458z0;

    /* JADX INFO: renamed from: z1 */
    public hpd0 f3459z1;

    /* JADX INFO: renamed from: z2 */
    public volatile long f3460z2;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.api.CoreSuggested$a */
    public class C0149a implements w9j<Envelope, UserInfo> {
        public C0149a() {
        }

        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public UserInfo call(Envelope envelope) {
            CommonData moduleData = envelope.getModuleData(CommonData.class);
            List<CoreMomentInfo> list = envelope.getModuleData(CoreData.class).moments;
            if (!NullChecker.a(moduleData) || vwb.J(moduleData.users)) {
                return null;
            }
            UserInfo userInfo = new UserInfo();
            userInfo.f3461id = ((DbObject) ((User) moduleData.users.get(0))).id;
            if (!vwb.J(list)) {
                userInfo.coreMomentInfoList = list;
            }
            CoreSuggested.this.f3427o2 = ((DbObject) ((User) moduleData.users.get(0))).id;
            return userInfo;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.api.CoreSuggested$b */
    public class C0150b implements w9j<Envelope, Envelope> {
        public C0150b() {
        }

        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Envelope call(Envelope envelope) {
            CoreSuggested.this.f8580Q.m3422w3(envelope, null);
            return envelope;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.api.CoreSuggested$c */
    public class C0151c implements w9j<Envelope, roj0> {
        public C0151c() {
        }

        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public roj0 call(Envelope envelope) {
            return roj0.a;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.api.CoreSuggested$d */
    public static /* synthetic */ class C0152d {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f3465a;

        static {
            int[] iArr = new int[SwipeDirection.values().length];
            f3465a = iArr;
            try {
                iArr[SwipeDirection.UP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3465a[SwipeDirection.LEFT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3465a[SwipeDirection.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.api.CoreSuggested$e */
    public static class C0153e implements Comparable<C0153e> {

        /* JADX INFO: renamed from: a */
        public String f3466a;

        /* JADX INFO: renamed from: b */
        public int f3467b;

        public C0153e(String str, int i) {
            this.f3466a = str;
            this.f3467b = i;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(C0153e c0153e) {
            return c0153e.f3467b - this.f3467b;
        }
    }

    public CoreSuggested(C0158c c0158c) {
        super(c0158c);
        this.f3356R = a.b();
        this.f3359S = a.b();
        this.f3362T = a.b();
        Boolean bool = Boolean.FALSE;
        this.f3368V = a.c(bool);
        this.f3371W = 0L;
        this.f3374X = 2;
        this.f3377Y = new HashSet<>();
        this.f3380Z = new HashSet<>();
        this.f3383a0 = a.b();
        this.f3386b0 = a.b();
        this.f3389c0 = a.b();
        this.f3392d0 = b.b();
        this.f3395e0 = b.b();
        this.f3401g0 = new zew<>(20);
        this.f3404h0 = false;
        this.f3407i0 = null;
        this.f3413k0 = 1;
        this.f3416l0 = -1;
        this.f3419m0 = a.b();
        this.f3422n0 = 0L;
        this.f3425o0 = 0L;
        this.f3428p0 = 0L;
        this.f3431q0 = 0L;
        this.f3434r0 = new HashSet<>();
        this.f3440t0 = new hpd0("has_shown_first_like_alert_" + CoreModule.m1850H().userId(), bool);
        this.f3443u0 = new hpd0("has_shown_first_superlike_alert_" + CoreModule.m1850H().userId(), bool);
        this.f3446v0 = new hpd0("has_shown_first_dislike_alert_" + CoreModule.m1850H().userId(), bool);
        this.f3449w0 = new hpd0("has_shown_first_swipe_cover", bool);
        this.f3452x0 = new hpd0("need_show_upload_photo_btn_" + CoreModule.m1850H().userId(), bool);
        this.f3455y0 = 0;
        this.f3458z0 = 0;
        this.f3309A0 = 0;
        this.f3312B0 = b.b();
        this.f3318D0 = new tpd0("swipe_not_match_see_purchase_guide_times_" + CoreModule.m1850H().userId(), 0);
        this.f3321E0 = new zpd0("swipe_not_match_see_purchase_guide_last_time_" + CoreModule.m1850H().userId(), 0L);
        this.f3324F0 = a.b();
        this.f3327G0 = 0;
        this.f3330H0 = new zpd0("swipe_not_match_count_for_gp_subs_date_" + CoreModule.m1850H().userId(), 0L);
        this.f3333I0 = a.b();
        this.f3336J0 = b.b();
        this.f3339K0 = a.b();
        this.f3342L0 = a.b();
        this.f3345M0 = new tpd0("gp_miss_match_version_" + CoreModule.m1850H().userId(), 0);
        this.f3348N0 = new tpd0("swipe_left_count_" + CoreModule.m1850H().userId(), 0);
        this.f3350O0 = new zpd0("last_swipe_left_date" + CoreModule.m1850H().userId(), 0L);
        this.f3352P0 = new zpd0("gp_miss_match_show_date_" + CoreModule.m1850H().userId(), 0L);
        this.f3354Q0 = new tpd0("gp_miss_match_toast_show_count_" + CoreModule.m1850H().userId(), 0);
        this.f3357R0 = a.b();
        this.f3360S0 = new hpd0("has_show_guide_to_kankan_card" + CoreModule.m1850H().userId(), bool);
        this.f3363T0 = new tpd0("kankan_guide_swipe_count" + CoreModule.m1850H().userId(), 0);
        this.f3366U0 = new hpd0("all_female_show_debug_flag", bool);
        this.f3369V0 = new hpd0("debug_all_user_letter", bool);
        this.f3372W0 = new hpd0("debug_all_user_new_like", bool);
        this.f3375X0 = new HashMap<>();
        this.f3378Y0 = new uqd0("intl_fake_suggest_user_01_" + CoreModule.m1850H().userId(), "");
        this.f3381Z0 = new uqd0("intl_fake_suggest_user_02_" + CoreModule.m1850H().userId(), "");
        this.f3384a1 = new uqd0("intl_fake_suggest_user_03_" + CoreModule.m1850H().userId(), "");
        this.f3387b1 = new uqd0("slide_card_rewards_day_swipe_date" + CoreModule.m1850H().userId(), "");
        this.f3390c1 = new uqd0("show_slide_card_rewards_dlg_day" + CoreModule.m1850H().userId(), "");
        this.f3393d1 = new zpd0("slide_card_rewards_day_swipe_count" + CoreModule.m1850H().userId(), 0L);
        this.f3396e1 = new hpd0("has_show_filter_guide_bubble_" + CoreModule.m1850H().userId(), bool);
        this.f3399f1 = new zpd0("daily_message_mills_" + CoreModule.m1850H().userId(), 0L);
        this.f3402g1 = new tpd0("daily_message_count_" + CoreModule.m1850H().userId(), 0);
        this.f3405h1 = new vqd0("has_show_add_book_movies_dramas_status_dlg_passive_" + CoreModule.m1850H().userId(), new HashSet());
        this.f3408i1 = new tpd0("fake_and_good_upload_photo_dialog_" + CoreModule.m1850H().userId(), 0);
        this.f3411j1 = new zpd0("good_or_fake_upload_photo_" + CoreModule.m1850H().userId(), 0L);
        String str = "show_my_tab_sides_slip_dot_" + CoreModule.m1850H().userId();
        Boolean bool2 = Boolean.TRUE;
        this.f3414k1 = new hpd0(str, bool2);
        this.f3417l1 = new hpd0("show_chat_and_dot_" + CoreModule.m1850H().userId(), bool);
        this.f3420m1 = new hpd0("is_first_click_anti_harass_dlg_" + CoreModule.m1850H().userId(), bool2);
        this.f3423n1 = new hpd0("show_my_tab_sides_slip_share_dot" + CoreModule.m1850H().userId(), bool2);
        this.f3426o1 = new hpd0("show_my_tab_sides_slip_flash_dot" + CoreModule.m1850H().userId(), bool2);
        this.f3429p1 = new uqd0("oms_is_show_dot" + CoreModule.m1850H().userId(), "");
        this.f3432q1 = new uqd0("marry_suggest_user_today_time" + CoreModule.m1850H().userId(), "");
        this.f3435r1 = new uqd0("marry_suggest_user_today_data" + CoreModule.m1850H().userId(), "");
        this.f3438s1 = new hpd0("card_opt_debug", bool);
        this.f3441t1 = new hpd0("mock_america", bool);
        this.f3444u1 = new hpd0("card_opt_debug_view", bool);
        this.f3447v1 = new hpd0("card_live_debug", bool);
        this.f3450w1 = new hpd0("card4To3Debug" + CoreModule.m1850H().userId(), bool);
        this.f3453x1 = new zpd0("oof_bubble_guide_show_time" + CoreModule.m1850H().userId(), 0L);
        this.f3456y1 = new hpd0("dynamicBottomDebug" + CoreModule.m1850H().userId(), bool);
        this.f3459z1 = new hpd0("preload_suggest_list", bool);
        this.f3310A1 = new hpd0("selected_tab_authentication" + CoreModule.m1850H().userId(), bool);
        this.f3313B1 = new uqd0("marry_mode_specific_suggest_user" + CoreModule.m1850H().userId(), "");
        this.f3316C1 = new hpd0("city_c_purchase_success_record" + CoreModule.m1850H().userId(), bool);
        this.f3319D1 = new hpd0("cityCInsertDebug", bool);
        this.f3322E1 = new hpd0("new_old_card", bool);
        this.f3325F1 = new hpd0("user_expanded_card", bool);
        this.f3328G1 = new hpd0("user_expanded_card_intl", bool2);
        this.f3331H1 = new hpd0("user_expanded_card_intl_home", bool2);
        this.f3334I1 = new hpd0("user_expanded_card_close", bool);
        this.f3337J1 = new hpd0("user_expanded_card_idealType_enable", bool);
        this.f3340K1 = new zpd0("card_show_certification_guidance_item" + CoreModule.m1850H().userId(), 0L);
        this.f3343L1 = new uqd0("card_show_certification_guidance_item_user_id" + CoreModule.m1850H().userId(), "");
        this.f3346M1 = new zpd0("show_Certification_Segmentation_dlg_Time" + CoreModule.m1850H().userId(), 0L);
        this.f3349N1 = new hpd0("home_card_only_focus_authentication_guidance" + CoreModule.m1850H().userId(), bool);
        this.f3351O1 = 0;
        this.f3353P1 = 0;
        this.f3355Q1 = false;
        this.f3358R1 = new HashMap<>();
        this.f3361S1 = new HashMap<>();
        this.f3364T1 = false;
        this.f3367U1 = false;
        this.f3370V1 = b.b();
        this.f3373W1 = b.b();
        this.f3376X1 = b.b();
        this.f3379Y1 = new ConcurrentHashMap();
        this.f3382Z1 = new ConcurrentHashMap();
        this.f3385a2 = new ConcurrentHashMap();
        this.f3388b2 = new HashSet<>();
        this.f3391c2 = new HashSet<>();
        this.f3394d2 = new HashSet<>();
        this.f3397e2 = new C0172l(this.f8580Q);
        this.f3400f2 = b.b();
        this.f3403g2 = b.b();
        this.f3406h2 = b.b();
        this.f3409i2 = b.b();
        this.f3412j2 = b.b();
        this.f3415k2 = b.b();
        this.f3418l2 = b.b();
        this.f3421m2 = b.b();
        this.f3424n2 = b.b();
        this.f3427o2 = "";
        this.f3430p2 = false;
        this.f3433q2 = new int[]{-1, -1, -1};
        this.f3436r2 = CameraSticker.CATEGORY_DEFAULT_FILTER;
        this.f3439s2 = -1;
        this.f3442t2 = new HashMap();
        this.f3445u2 = new hpd0("filter_ideal_suggest_" + CoreModule.m1850H().userId(), bool);
        this.f3448v2 = new zpd0("last_filter_ideal_time" + CoreModule.m1850H().userId(), 0L);
        this.f3451w2 = new hpd0("fake_insert__ideal_suggest_" + CoreModule.m1850H().userId(), bool);
        this.f3454x2 = a.b();
        this.f3314B2 = a.b();
        this.f3317C2 = false;
        this.f3320D2 = b.b();
        this.f3323E2 = a.b();
        this.f3326F2 = b.b();
        this.f3329G2 = 0;
        this.f3332H2 = a.b();
        this.f3335I2 = a.c(j760.a(SwipeDirection.fromValue(0), (Object) null));
        this.f3338J2 = 0L;
        this.f3341K2 = false;
        this.f3344L2 = a.b();
        this.f3347M2 = "/users/me/see-portraits-v3";
    }

    /* JADX INFO: renamed from: C3 */
    public static /* synthetic */ int m2781C3(LiteraturesComments literaturesComments, LiteraturesComments literaturesComments2) {
        return (int) (literaturesComments2.updatedTime - literaturesComments.updatedTime);
    }

    /* JADX INFO: renamed from: G3 */
    public static /* synthetic */ User m2789G3(User user) {
        return user;
    }

    /* JADX INFO: renamed from: J4 */
    public static /* synthetic */ void m2796J4(CommonData commonData) {
        if (vwb.J(commonData.users)) {
            return;
        }
        CoreModule.m1853N().Rf(vwb.Q(commonData.users, new w9j() { // from class: l.c4b
            public final Object call(Object obj) {
                return ((DbObject) ((User) obj)).id;
            }
        }));
    }

    /* JADX INFO: renamed from: K4 */
    public static /* synthetic */ Relationship m2798K4(Envelope envelope) {
        if (!vwb.J(envelope.getModuleData(CoreData.class).relationships)) {
            return (Relationship) envelope.getModuleData(CoreData.class).relationships.get(0);
        }
        Relationship relationshipNew_ = Relationship.new_();
        relationshipNew_.state = RelationshipStatus.get("unknown_");
        return relationshipNew_;
    }

    /* JADX INFO: renamed from: Q3 */
    public static /* synthetic */ Envelope m2809Q3(final String str, String str2, Envelope envelope) {
        if (!vwb.J(envelope.getModuleData(CoreData.class).relationships)) {
            Relationship relationship = (Relationship) vwb.r(envelope.getModuleData(CoreData.class).relationships, new w9j() { // from class: l.c0b
                public final Object call(Object obj) {
                    return Boolean.valueOf(((Relationship) obj).id.equals(str));
                }
            });
            if (NullChecker.a(relationship) && str.equals(relationship.id) && relationship.relationshipExtensions == null) {
                RelationshipExtensions relationshipExtensionsNew_ = RelationshipExtensions.new_();
                relationshipExtensionsNew_.otherLetter = str2;
                relationship.relationshipExtensions = relationshipExtensionsNew_;
            }
        }
        return envelope;
    }

    /* JADX INFO: renamed from: V3 */
    public static /* synthetic */ int m2819V3(ProfileLikeComment profileLikeComment, ProfileLikeComment profileLikeComment2) {
        return (int) (profileLikeComment2.createdTime - profileLikeComment.createdTime);
    }

    /* JADX INFO: renamed from: X3 */
    public static /* synthetic */ int m2823X3(User user, User user2) {
        return user2.popLevel - user.popLevel;
    }

    /* JADX INFO: renamed from: Z4 */
    public static /* synthetic */ void m2828Z4(PartialListOpt partialListOpt) {
        if (!NullChecker.a(partialListOpt) || partialListOpt.loaded.isEmpty() || ura.m25555e().m25559d().m5738ar()) {
            return;
        }
        ura.m25555e().m25559d().m5799jo(partialListOpt.loaded);
    }

    /* JADX INFO: renamed from: a3 */
    public static /* synthetic */ void m2829a3(User user) {
        if (user.hasPic()) {
            qib0.f19782G.m12787u0(ura.m25555e().m25559d().m5719Xf(user.media(0)));
        }
    }

    /* JADX INFO: renamed from: b5 */
    public static /* synthetic */ String m2834b5(String str, String str2) {
        return "tantanapp://userCard?uid=" + str;
    }

    /* JADX INFO: renamed from: c4 */
    public static /* synthetic */ void m2836c4() {
        CoreModule.f1534c.f3547D0.m6779R4();
        CoreModule.f1534c.f3547D0.f4123Y = true;
    }

    /* JADX INFO: renamed from: g5 */
    public static /* synthetic */ c m2849g5(c cVar) {
        return cVar;
    }

    /* JADX INFO: renamed from: i3 */
    public static /* synthetic */ void m2853i3(Throwable th) {
    }

    /* JADX INFO: renamed from: l5 */
    public static /* synthetic */ void m2864l5(Throwable th) {
    }

    /* JADX INFO: renamed from: m5 */
    public static /* synthetic */ stc0 m2867m5(String str, boolean z) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("userID", str);
            jSONObject.put("status", z ? "accept" : "reject");
        } catch (JSONException unused) {
        }
        return C0154a.f3483P.auth().l(utc0.create(Network.JSON, jSONObject.toString())).q(C0154a.m3130G("/users/" + CoreModule.m1850H().userId() + "/fake-suggest")).b();
    }

    /* JADX INFO: renamed from: n4 */
    public static /* synthetic */ void m2869n4() {
    }

    /* JADX INFO: renamed from: s5 */
    public static /* synthetic */ void m2885s5(User user) {
        if (user.hasPic()) {
            qib0.f19782G.m12787u0(ura.m25555e().m25559d().m5719Xf(user.media(0)));
        }
    }

    /* JADX INFO: renamed from: t8 */
    private void m2889t8(List<User> list) {
        vwb.z(vwb.E(list), new e30() { // from class: l.y1b
            public final void call(Object obj) {
                CoreSuggested.m2885s5((User) obj);
            }
        });
    }

    /* JADX INFO: renamed from: x3 */
    public static /* synthetic */ void m2899x3(User user) {
        if (user.hasPic()) {
            qib0.f19782G.m12787u0(ura.m25555e().m25559d().m5719Xf(user.media(0)));
        }
    }

    /* JADX INFO: renamed from: A5 */
    public final String m2905A5(String str) {
        if (ura.m25555e().m25559d().m5758er() && !CoreModule.m1851K().me_().isFemale()) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(String.format("&male_show_like=%s", Boolean.valueOf(CoreModule.m1851K().rg() && CoreModule.m1851K().Dh() && CoreModule.m1851K().Dp())));
            str = sb.toString();
        }
        if (ura.m25555e().m25559d().m5841q0()) {
            str = str + "&authentication=" + this.f3310A1.get();
        }
        if (ura.m25555e().m25559d().m5653Lc()) {
            str = str + "&pickzone=true";
        }
        if (ura.m25555e().m25559d().m5884xh()) {
            if (((Boolean) this.f3445u2.get()).booleanValue() && mqi0.D(((Long) this.f3448v2.get()).longValue())) {
                return str + "&filter_ideal=true";
            }
            if (this.f3317C2) {
                return str + "&show_ideal=true";
            }
        }
        return str;
    }

    /* JADX INFO: renamed from: A6 */
    public final void m2906A6(List<UserInfo> list, List<User> list2) {
        int iM2910B6 = m2958N6() ? m2910B6() : 3;
        if (iM2910B6 <= 0 || this.f3355Q1 || vwb.J(list) || vwb.J(list2)) {
            return;
        }
        ArrayList<User> arrayList = new ArrayList(list2);
        Collections.sort(arrayList, new Comparator() { // from class: l.x3b
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return CoreSuggested.m2823X3((User) obj, (User) obj2);
            }
        });
        ArrayList arrayList2 = new ArrayList();
        for (User user : arrayList) {
            for (UserInfo userInfo : list) {
                if (userInfo.f3461id.equals(((DbObject) user).id)) {
                    arrayList2.add(userInfo);
                    break;
                }
            }
            if (arrayList2.size() == iM2910B6 || arrayList2.size() >= list.size()) {
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
    public final /* synthetic */ void m2907A7(Notification notification, UserInfo userInfo, User user, ConversationStatus conversationStatus, boolean z) {
        if (vwb.J(((Envelope) notification.f()).getModuleData(CoreData.class).relationships)) {
            return;
        }
        boolean z2 = false;
        Relationship relationship = (Relationship) ((Envelope) notification.f()).getModuleData(CoreData.class).relationships.get(0);
        User userM21396Q9 = this.f8580Q.f3628e0.m21396Q9(userInfo.f3461id);
        if (userM21396Q9 == null) {
            if (user == null) {
                return;
            } else {
                userM21396Q9 = user;
            }
        }
        if (ura.m25555e().m25559d().m5745c() && relationship != null) {
            relationship.conversationStatus = conversationStatus;
        }
        if (z && NullChecker.a(relationship) && NullChecker.a(relationship.relationshipExtensions) && !TEnum.equals(relationship.relationshipExtensions.relationType, "SUPERLIKED")) {
            relationship.relationshipExtensions.relationType = RelationshipStatus.get("SUPERLIKED");
            z2 = true;
        }
        userM21396Q9.localRelationship = relationship;
        if (!TEnum.equals(relationship.state, "matched")) {
            if (z2) {
                qib0.f19813k0.f23551d.upsert(userM21396Q9);
            }
        } else {
            if (user != null) {
                user.localRelationship = userM21396Q9.localRelationship;
            }
            qib0.f19813k0.f23551d.upsert(userM21396Q9);
            this.f8580Q.f3631f0.m5086vf(userM21396Q9);
        }
    }

    /* JADX INFO: renamed from: A8 */
    public void m2908A8(VirtualCardType virtualCardType) {
        if (!NullChecker.a(this.f3383a0.e()) || vwb.J(((PartialListOpt) this.f3383a0.e()).loaded)) {
            return;
        }
        ListIterator listIterator = ((PartialListOpt) this.f3383a0.e()).loaded.listIterator();
        while (listIterator.hasNext()) {
            UserInfo userInfo = (UserInfo) listIterator.next();
            if (NullChecker.a(userInfo) && virtualCardType == userInfo.virtualCardType) {
                listIterator.remove();
            }
        }
        ((PartialListOpt) this.f3383a0.e()).setRefreshValue(true);
        a<PartialListOpt<UserInfo>> aVar = this.f3383a0;
        aVar.onNext(((PartialListOpt) aVar.e()).setReasonStr(PartialListOpt.RefreshReason.REMOVE_LOCAL_CARD.getReason() + "_" + virtualCardType.getId()));
    }

    /* JADX INFO: renamed from: B5 */
    public final String m2909B5(String str) {
        if (yki0.b().h()) {
            OMSThemeInfo oMSThemeInfoA = yki0.b().a();
            if (NullChecker.a(oMSThemeInfoA)) {
                OMSThemeSuggestStrageryInfo oMSThemeSuggestStrageryInfo = oMSThemeInfoA.suggestStrategy;
                if (!TextUtils.isEmpty(oMSThemeSuggestStrageryInfo.groupID) && !vwb.J(oMSThemeSuggestStrageryInfo.tags)) {
                    if (!str.contains("groupid")) {
                        str = str + "&groupid=" + oMSThemeSuggestStrageryInfo.groupID;
                    }
                    if (!str.contains("tags")) {
                        List list = oMSThemeSuggestStrageryInfo.tags;
                        StringBuilder sb = new StringBuilder(str);
                        if (!list.isEmpty()) {
                            sb.append("&tags=");
                            for (int i = 0; i < list.size(); i++) {
                                sb.append((String) list.get(i));
                                if (i < list.size() - 1) {
                                    sb.append(",");
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
    public final int m2910B6() {
        if (this.f3439s2 == -1) {
            try {
                int iOptInt = new JSONObject(RemoteConfig.x().F("low_active_hight_pop")).optInt("count");
                if (iOptInt <= 0) {
                    iOptInt = 0;
                }
                this.f3439s2 = iOptInt;
            } catch (Exception unused) {
            }
        }
        return this.f3439s2;
    }

    /* JADX INFO: renamed from: B7 */
    public final /* synthetic */ void m2911B7(boolean z, roj0 roj0Var) {
        if (z) {
            return;
        }
        m3095z5(true);
    }

    /* JADX INFO: renamed from: B8 */
    public void m2912B8(String str) {
        QuickChatCardWrapper quickChatCardWrapper;
        OnlineMatchPushUser broadcastCard;
        if (TextUtils.isEmpty(str) || this.f3383a0.e() == null || vwb.J(((PartialListOpt) this.f3383a0.e()).loaded)) {
            return;
        }
        Iterator it = ((PartialListOpt) this.f3383a0.e()).loaded.iterator();
        while (it.hasNext()) {
            UserInfo userInfo = (UserInfo) it.next();
            if (userInfo != null && (quickChatCardWrapper = userInfo.quickChatCardWrapper) != null && quickChatCardWrapper.isPeiLiao() && (broadcastCard = userInfo.quickChatCardWrapper.getBroadcastCard()) != null && NullChecker.a(broadcastCard.user) && str.equals(((DbObject) broadcastCard.user).id)) {
                this.f3377Y.remove(userInfo.f3461id);
                it.remove();
                ((PartialListOpt) this.f3383a0.e()).setRefreshValue(true);
                a<PartialListOpt<UserInfo>> aVar = this.f3383a0;
                aVar.onNext(((PartialListOpt) aVar.e()).setReason(PartialListOpt.RefreshReason.removePeiLiaoUsersByIdIfNeed));
                return;
            }
        }
    }

    /* JADX INFO: renamed from: C5 */
    public void m2913C5() {
        this.f3365U = true;
        m2969Q5();
        m2973R5();
        this.f8580Q.f3676u0.m2384m5();
        this.f8580Q.f3676u0.m2381l5();
        this.f3368V.onNext(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: C6 */
    public final void m2914C6(List<UserInfo> list, UserInfo userInfo) {
        Iterator<UserInfo> it = list.iterator();
        while (it.hasNext()) {
            if (TextUtils.equals(userInfo.f3461id, it.next().f3461id)) {
                it.remove();
            }
        }
    }

    /* JADX INFO: renamed from: C7 */
    public final /* synthetic */ void m2915C7(boolean z, Throwable th) {
        if (z) {
            return;
        }
        m3095z5(false);
    }

    /* JADX INFO: renamed from: C8 */
    public void m2916C8(String str) {
        if (NullChecker.a(this.f3383a0.e()) && !vwb.J(((PartialListOpt) this.f3383a0.e()).loaded)) {
            if (NullChecker.a(this.f3386b0.e())) {
                CardPattern cardPattern = (CardPattern) vwb.r(((ActionData) this.f3386b0.e()).pageFormat.cardPatterns, new w9j() { // from class: l.d0b
                    public final Object call(Object obj) {
                        return this.f9962a.m2931G7((CardPattern) obj);
                    }
                });
                if (NullChecker.a(cardPattern)) {
                    ((ActionData) this.f3386b0.e()).pageFormat.cardPatterns.remove(cardPattern);
                }
            }
            ((PartialListOpt) this.f3383a0.e()).loaded.remove(0);
        }
        ((PartialListOpt) this.f3383a0.e()).setRefreshValue(true);
        a<PartialListOpt<UserInfo>> aVar = this.f3383a0;
        aVar.onNext(((PartialListOpt) aVar.e()).setReasonStr(PartialListOpt.RefreshReason.REMOVE_TOP.getReason() + "_" + str));
        m3013b6(true);
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
    public List<UserInfo> m2917D5(Envelope envelope, List<User> list) {
        HashMap map;
        ArrayList arrayList;
        HashMap map2;
        HashMap map3;
        HashMap map4;
        HashSet hashSet;
        HashMap map5;
        boolean z;
        HashMap map6;
        HashMap map7;
        HashMap map8;
        List list2;
        ArrayList arrayList2;
        int i;
        DynamicLable dynamicLable;
        HashMap map9;
        Iterator it;
        HashSet hashSet2;
        HashMap map10;
        HashMap map11;
        HashMap map12;
        HashMap map13;
        Iterator it2;
        CoreSuggested coreSuggested = this;
        coreSuggested.m2989V5(envelope.getModuleData(CoreData.class).superLikeCount);
        HashMap map14 = new HashMap();
        HashMap map15 = new HashMap();
        CoreModule.m1853N().zd(envelope, map15);
        if (ura.m25555e().m25559d().m5855s()) {
            CoreModule.m1853N().Ee(envelope, map14);
        }
        HashMap map16 = new HashMap();
        if (ura.m25555e().m25559d().m5877w()) {
            List<CoreMomentInfo> listCa = CoreModule.m1853N().Ca(envelope, CoreMomentInfo.JSON_ADAPTER);
            if (!vwb.J(listCa)) {
                for (CoreMomentInfo coreMomentInfo : listCa) {
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
        HashMap map17 = new HashMap();
        if (!vwb.J(envelope.getModuleData(CommonData.class).users)) {
            for (User user : envelope.getModuleData(CommonData.class).users) {
                if (NullChecker.a(user.settings) && NullChecker.a(user.settings.omsSetting) && !vwb.J(user.settings.omsSetting.tags)) {
                    for (OmsNewTags omsNewTags : user.settings.omsSetting.tags) {
                        NewTags newTagsNew_ = NewTags.new_();
                        String str = omsNewTags.id;
                        newTagsNew_.id = str;
                        newTagsNew_.name = omsNewTags.name;
                        newTagsNew_.categories = omsNewTags.categories;
                        newTagsNew_.icon = omsNewTags.icon;
                        newTagsNew_.status = omsNewTags.status;
                        newTagsNew_.localTagUserCounts = omsNewTags.count;
                        map17.put(str, newTagsNew_);
                    }
                }
            }
            coreSuggested.f3392d0.onNext(map17);
        }
        HashMap map18 = new HashMap();
        if (!vwb.J(envelope.getModuleData(CoreData.class).cardsIcons)) {
            for (CardsIcons cardsIcons : envelope.getModuleData(CoreData.class).cardsIcons) {
                if (NullChecker.a(cardsIcons) && cardsIcons.likedMeBottomIcon.icon.contains("liked_me")) {
                    map18.put(cardsIcons.userId, cardsIcons.likedMeBottomIcon.context);
                }
            }
        }
        List list3 = envelope.getModuleData(CoreData.class).cardCornerMarks;
        HashMap map19 = new HashMap();
        List<SuggestedComplimentItem> list4 = envelope.getModuleData(CoreData.class).compliments;
        if (!vwb.J(list4)) {
            for (SuggestedComplimentItem suggestedComplimentItem : list4) {
                if (NullChecker.a(suggestedComplimentItem) && !TextUtils.isEmpty(suggestedComplimentItem.senderId)) {
                    map19.putIfAbsent(suggestedComplimentItem.senderId, suggestedComplimentItem);
                }
            }
        }
        HashMap map20 = new HashMap();
        if (CoreModule.m1853N().M8() && !vwb.J(envelope.getModuleData(CoreData.class).states)) {
            for (BubbleInfo bubbleInfo : envelope.getModuleData(CoreData.class).states) {
                if (NullChecker.a(bubbleInfo) && NullChecker.a(bubbleInfo.owner)) {
                    map20.put(bubbleInfo.owner.id, bubbleInfo);
                }
            }
        }
        HashMap map21 = new HashMap();
        if (!vwb.J(envelope.getModuleData(CoreData.class).cardStyles)) {
            for (CardStyle cardStyle : envelope.getModuleData(CoreData.class).cardStyles) {
                if (NullChecker.a(cardStyle) && cardStyle.label.contains("liked_me")) {
                    String str2 = cardStyle.userId;
                    map21.put(str2, str2);
                }
            }
        }
        HashMap map22 = new HashMap();
        if (!vwb.J(envelope.getModuleData(CoreData.class).cardModels)) {
            for (CardModel cardModel : envelope.getModuleData(CoreData.class).cardModels) {
                if (NullChecker.a(cardModel) && !vwb.J(cardModel.dynamicLabels)) {
                    map22.put(cardModel.userId, cardModel.dynamicLabels);
                }
            }
        }
        HashMap map23 = new HashMap();
        if (!vwb.J(envelope.getModuleData(CoreData.class).dynamicLabels)) {
            Iterator it3 = envelope.getModuleData(CoreData.class).dynamicLabels.iterator();
            while (it3.hasNext()) {
                DynamicLable dynamicLable2 = (DynamicLable) it3.next();
                if (NullChecker.a(dynamicLable2)) {
                    it2 = it3;
                    if (!TextUtils.isEmpty(dynamicLable2.type)) {
                        map23.put(dynamicLable2.type, dynamicLable2);
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
        if (!vwb.J(envelope.getModuleData(CoreData.class).likedMes)) {
            Iterator it4 = envelope.getModuleData(CoreData.class).likedMes.iterator();
            while (it4.hasNext()) {
                Iterator it5 = it4;
                CardStyle cardStyle2 = (CardStyle) it4.next();
                if (NullChecker.a(cardStyle2)) {
                    map13 = map19;
                    if (cardStyle2.label.contains("liked_me")) {
                        String str3 = cardStyle2.userId;
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
        if (ura.m25555e().m25559d().m5618Er() && !vwb.J(envelope.getModuleData(CoreData.class).literatures)) {
            for (Iterator it6 = envelope.getModuleData(CoreData.class).literatures.iterator(); it6.hasNext(); it6 = it6) {
                Literatures literatures = (Literatures) it6.next();
                if (NullChecker.a(literatures)) {
                    map30.put(literatures.id, literatures);
                }
            }
        }
        HashMap map31 = new HashMap();
        if (ura.m25555e().m25559d().m5618Er() && !vwb.J(envelope.getModuleData(CoreData.class).literaturesComments)) {
            Iterator it7 = envelope.getModuleData(CoreData.class).literaturesComments.iterator();
            while (it7.hasNext()) {
                it7 = it7;
                LiteraturesComments literaturesComments = (LiteraturesComments) it7.next();
                if (literaturesComments != null) {
                    HashMap map32 = map30;
                    HashMap map33 = map14;
                    if (CoreModule.f1534c.f3628e0.m21406T7(literaturesComments.literatureID)) {
                        HashMap map34 = map18;
                        LiteraturesComments literaturesCommentsM21384N9 = CoreModule.f1534c.f3628e0.m21384N9(CoreModule.m1850H().userId(), literaturesComments.literatureID);
                        if (NullChecker.a(literaturesCommentsM21384N9)) {
                            literaturesComments.updatedTime = literaturesCommentsM21384N9.updatedTime;
                        }
                        ArrayList arrayList4 = (ArrayList) map31.get(literaturesComments.userID);
                        if (arrayList4 == null) {
                            ArrayList arrayList5 = new ArrayList();
                            arrayList5.add(literaturesComments);
                            map31.put(literaturesComments.userID, arrayList5);
                        } else {
                            arrayList4.add(literaturesComments);
                            map31.put(literaturesComments.userID, arrayList4);
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
        HashMap map35 = map14;
        HashMap map36 = map30;
        HashMap map37 = map18;
        HashMap map38 = new HashMap();
        if (ura.m25555e().m25559d().m5877w() && !vwb.J(envelope.getModuleData(CoreData.class).literaturesComments)) {
            for (LiteraturesComments literaturesComments2 : envelope.getModuleData(CoreData.class).literaturesComments) {
                ArrayList arrayList6 = (ArrayList) map38.get(literaturesComments2.userID);
                if (arrayList6 == null) {
                    ArrayList arrayList7 = new ArrayList();
                    arrayList7.add(literaturesComments2);
                    map38.put(literaturesComments2.userID, arrayList7);
                } else {
                    arrayList6.add(literaturesComments2);
                    map38.put(literaturesComments2.userID, arrayList6);
                }
            }
        }
        HashMap map39 = new HashMap();
        if (ura.m25555e().m25559d().m5792is() && !vwb.J(envelope.getModuleData(CoreData.class).profileLikesComments)) {
            Iterator it8 = envelope.getModuleData(CoreData.class).profileLikesComments.iterator();
            while (it8.hasNext()) {
                ProfileLikeComment profileLikeComment = (ProfileLikeComment) it8.next();
                if (profileLikeComment != null) {
                    Iterator it9 = it8;
                    ArrayList arrayList8 = (ArrayList) map39.get(profileLikeComment.userId);
                    if (arrayList8 == null) {
                        ArrayList arrayList9 = new ArrayList();
                        arrayList9.add(profileLikeComment);
                        map39.put(profileLikeComment.userId, arrayList9);
                    } else {
                        arrayList8.add(profileLikeComment);
                        map39.put(profileLikeComment.userId, arrayList8);
                    }
                    it8 = it9;
                }
            }
        }
        HashMap map40 = new HashMap();
        List list5 = envelope.getModuleData(CommonData.class).recommendMessage;
        if (!vwb.J(list5)) {
            Iterator it10 = list5.iterator();
            while (it10.hasNext()) {
                Iterator it11 = it10;
                RecommendMessage recommendMessage = (RecommendMessage) it10.next();
                if (NullChecker.a(recommendMessage)) {
                    List arrayList10 = (List) map40.get(recommendMessage.userId);
                    if (arrayList10 == null) {
                        arrayList10 = new ArrayList();
                    }
                    arrayList10.add(recommendMessage);
                    map40.put(recommendMessage.userId, arrayList10);
                }
                map39 = map39;
                it10 = it11;
            }
        }
        HashMap map41 = map39;
        HashMap map42 = new HashMap();
        List list6 = envelope.getModuleData(CoreData.class).greets;
        if (!vwb.J(list6)) {
            Iterator it12 = list6.iterator();
            while (it12.hasNext()) {
                Iterator it13 = it12;
                UserGreetInfo userGreetInfo = (UserGreetInfo) it12.next();
                if (NullChecker.a(userGreetInfo)) {
                    map42.put(userGreetInfo.userId, userGreetInfo);
                }
                map38 = map38;
                it12 = it13;
            }
        }
        HashMap map43 = map38;
        HashMap map44 = new HashMap();
        List list7 = envelope.getModuleData(CoreData.class).userActivityInfos;
        if (list7 != null) {
            Iterator it14 = list7.iterator();
            while (it14.hasNext()) {
                Iterator it15 = it14;
                UserActivityInfo userActivityInfo = (UserActivityInfo) it14.next();
                map44.put(userActivityInfo.userId, userActivityInfo);
                map42 = map42;
                it14 = it15;
            }
        }
        HashMap map45 = map42;
        HashMap map46 = new HashMap();
        if (!vwb.J(envelope.getModuleData(CoreData.class).cardExtraInfos)) {
            Iterator it16 = envelope.getModuleData(CoreData.class).cardExtraInfos.iterator();
            while (it16.hasNext()) {
                Iterator it17 = it16;
                CardExtraInfo cardExtraInfo = (CardExtraInfo) it16.next();
                if (NullChecker.a(cardExtraInfo)) {
                    map12 = map31;
                    if (!TextUtils.isEmpty(cardExtraInfo.userId) && !TextUtils.isEmpty(cardExtraInfo.descriptionId) && !map46.containsKey(cardExtraInfo.userId)) {
                        map46.put(cardExtraInfo.userId, cardExtraInfo);
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
        if (!vwb.J(envelope.getModuleData(CoreData.class).cardModels)) {
            Iterator it18 = envelope.getModuleData(CoreData.class).cardModels.iterator();
            while (it18.hasNext()) {
                Iterator it19 = it18;
                CardModel cardModel2 = (CardModel) it18.next();
                if (NullChecker.a(cardModel2)) {
                    map10 = map46;
                    map11 = map20;
                    if (cardModel2.borderModel.style.contains("themeMode")) {
                        hashSet5.add(cardModel2.userId);
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
        if (!vwb.J(envelope.getModuleData(CoreData.class).moments)) {
            for (Iterator it20 = envelope.getModuleData(CoreData.class).moments.iterator(); it20.hasNext(); it20 = it20) {
                CoreMomentInfo coreMomentInfo2 = (CoreMomentInfo) it20.next();
                if (NullChecker.a(coreMomentInfo2)) {
                    map50.put(((CopyObject) coreMomentInfo2).id, coreMomentInfo2);
                }
            }
        }
        HashMap map51 = new HashMap();
        if (!vwb.J(envelope.getModuleData(CoreData.class).cardInfos)) {
            Iterator it21 = envelope.getModuleData(CoreData.class).cardInfos.iterator();
            while (it21.hasNext()) {
                Iterator it22 = it21;
                CardInfos cardInfos = (CardInfos) it21.next();
                if (NullChecker.a(cardInfos)) {
                    map51.put(cardInfos.userId, cardInfos);
                }
                map44 = map44;
                it21 = it22;
            }
        }
        HashMap map52 = map44;
        HashMap map53 = new HashMap();
        if (!vwb.J(envelope.getModuleData(CoreData.class).idealInfos)) {
            Iterator it23 = envelope.getModuleData(CoreData.class).idealInfos.iterator();
            while (it23.hasNext()) {
                Iterator it24 = it23;
                IdealInfo idealInfo = (IdealInfo) it23.next();
                if (NullChecker.a(idealInfo)) {
                    map53.put(idealInfo.id, idealInfo);
                }
                map25 = map25;
                it23 = it24;
            }
        }
        HashMap map54 = map25;
        HashMap map55 = new HashMap();
        HashMap map56 = new HashMap();
        HashSet hashSet6 = hashSet3;
        if (!vwb.J(envelope.getModuleData(CoreData.class).cardModels)) {
            Iterator it25 = envelope.getModuleData(CoreData.class).cardModels.iterator();
            while (it25.hasNext()) {
                Iterator it26 = it25;
                CardModel cardModel3 = (CardModel) it25.next();
                if (NullChecker.a(cardModel3) && cardModel3.isRecommendMomentCard() && ura.m25555e().m25559d().m5744bq()) {
                    hashSet2 = hashSet4;
                    if (map51.containsKey(cardModel3.userId)) {
                        CardInfos cardInfos2 = (CardInfos) map51.get(cardModel3.userId);
                        if (NullChecker.a(cardInfos2)) {
                            cardInfos2.momentLikedYou = cardModel3.momentLikedYou || !TextUtils.isEmpty((CharSequence) map27.get(cardModel3.userId));
                            map51.put(cardModel3.userId, cardInfos2);
                        }
                    }
                    map55.put(cardModel3.userId, Boolean.valueOf(cardModel3.isRecommendMomentCard()));
                    if (NullChecker.a(cardModel3.extraData)) {
                        map56.put(cardModel3.userId, cardModel3.extraData.momentId);
                    }
                } else {
                    map21 = map21;
                    hashSet2 = hashSet4;
                }
                if (CoreModule.m1854P().m11709e().m6927wq() && map51.containsKey(cardModel3.userId)) {
                    CardInfos cardInfos3 = (CardInfos) map51.get(cardModel3.userId);
                    cardInfos3.boostLikeYou = cardModel3.boostLikeYou;
                    map51.put(cardModel3.userId, cardInfos3);
                }
                hashSet4 = hashSet2;
                it25 = it26;
                map21 = map21;
            }
        }
        HashMap map57 = map21;
        HashSet hashSet7 = hashSet4;
        HashMap map58 = new HashMap();
        if (CoreModule.m1854P().m11711g().m6985b8()) {
            List list8 = envelope.getModuleData(CoreData.class).relationships;
            if (!vwb.J(list8)) {
                Iterator it27 = list8.iterator();
                while (it27.hasNext()) {
                    Relationship relationship = (Relationship) it27.next();
                    if (NullChecker.a(relationship)) {
                        it = it27;
                        if (vwb.J(relationship.status)) {
                            map9 = map27;
                        } else {
                            map9 = map27;
                            if (relationship.status.contains(MatchFrom.get("pinLike"))) {
                                map58.put(relationship.id, relationship);
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
        if (CoreModule.f1546o.m25559d().m5653Lc()) {
            List list9 = envelope.getModuleData(CoreData.class).cardModels;
            if (!vwb.J(list9)) {
                Iterator it28 = list9.iterator();
                while (it28.hasNext()) {
                    CardModel cardModel4 = (CardModel) it28.next();
                    Iterator it29 = it28;
                    if (cardModel4.selectionUser) {
                        hashSet8.add(cardModel4.userId);
                    }
                    it28 = it29;
                }
            }
        }
        HashMap map60 = new HashMap();
        HashMap map61 = new HashMap();
        HashSet hashSet9 = hashSet8;
        CoreModule.m1855Q().He(map60, map61, envelope);
        HashSet hashSet10 = new HashSet();
        if (CoreModule.f1546o.m25559d().m5735ak() || ura.m25555e().m25559d().m5890yg()) {
            map = map58;
            List list10 = envelope.getModuleData(CoreData.class).fakePhotoFeedback;
            if (!vwb.J(list10)) {
                Iterator it30 = list10.iterator();
                while (it30.hasNext()) {
                    Iterator it31 = it30;
                    FakePhotoFeedback fakePhotoFeedback = (FakePhotoFeedback) it30.next();
                    HashMap map62 = map61;
                    HashMap map63 = map60;
                    if (fakePhotoFeedback.show == 1) {
                        hashSet10.add(fakePhotoFeedback.id);
                    }
                    map61 = map62;
                    it30 = it31;
                    map60 = map63;
                }
            }
        } else {
            map = map58;
        }
        HashMap map64 = map60;
        HashMap map65 = map61;
        HashMap<String, String> map66 = new HashMap<>();
        HashMap<String, IPRegion> map67 = new HashMap<>();
        if (ura.m25555e().m25559d().m5877w()) {
            List list11 = envelope.getModuleData(CommonData.class).devices;
            if (!vwb.J(list11)) {
                for (Iterator it32 = list11.iterator(); it32.hasNext(); it32 = it32) {
                    Device device = (Device) it32.next();
                    map66.put(device.id, device.name);
                }
            }
            List list12 = envelope.getModuleData(CoreData.class).ipRegion;
            if (!vwb.J(list12)) {
                for (Iterator it33 = list12.iterator(); it33.hasNext(); it33 = it33) {
                    IPRegion iPRegion = (IPRegion) it33.next();
                    map67.put(iPRegion.id, iPRegion);
                }
            }
        }
        HashMap map68 = new HashMap();
        if (CoreModule.m1854P().m11706a().m5480m7()) {
            List<CreditScoreData> list13 = envelope.getModuleData(CoreData.class).creditScores;
            if (!vwb.J(list13)) {
                for (CreditScoreData creditScoreData : list13) {
                    map68.put(creditScoreData.id, creditScoreData);
                }
            }
        }
        ArrayList arrayList11 = new ArrayList();
        if (!vwb.J(list)) {
            Iterator<User> it34 = list.iterator();
            while (it34.hasNext()) {
                User next = it34.next();
                it34 = it34;
                if (NullChecker.a(next)) {
                    ArrayList arrayList12 = arrayList11;
                    if (coreSuggested.f3377Y.contains(((DbObject) next).id)) {
                        arrayList = arrayList12;
                    } else if (coreSuggested.f3332H2.e() == null || vwb.J(((q860) coreSuggested.f3332H2.e()).a) || !((String) ((q860) coreSuggested.f3332H2.e()).a.get(0)).equals(((DbObject) next).id)) {
                        UserInfo userInfo = new UserInfo();
                        CardInfos cardInfos4 = (CardInfos) map51.get(((DbObject) next).id);
                        String str4 = ((DbObject) next).id;
                        userInfo.f3461id = str4;
                        userInfo.ussTags = next.ussTags;
                        userInfo.hierarchy = next.hierarchy;
                        userInfo.recommendMessage = (List) map40.get(str4);
                        userInfo.hasMoment = map15.containsKey(userInfo.f3461id);
                        userInfo.isThemeCard = hashSet5.contains(userInfo.f3461id);
                        userInfo.isCoreMomentCard = map55.containsKey(userInfo.f3461id);
                        userInfo.idealInfo = (IdealInfo) map53.get(userInfo.f3461id);
                        String str5 = (String) map56.get(userInfo.f3461id);
                        if (TextUtils.isEmpty(str5)) {
                            userInfo.coreMomentInfo = null;
                        } else {
                            userInfo.coreMomentInfo = (CoreMomentInfo) map50.get(str5);
                        }
                        CardInfos cardInfosNew_ = cardInfos4 == null ? CardInfos.new_() : cardInfos4;
                        cardInfosNew_.momentId = str5;
                        userInfo.cardInfos = cardInfosNew_;
                        if (ura.m25555e().m25557b().m5586wf() && (!next.isFemale() || next.superLikedMe() || next.letter())) {
                            map5 = map57;
                            z = true;
                        } else {
                            map5 = map57;
                            z = true;
                            userInfo.hasLikeMeSlideCardTop = !TextUtils.isEmpty((CharSequence) map5.get(userInfo.f3461id));
                        }
                        map57 = map5;
                        HashSet hashSet11 = hashSet7;
                        if (hashSet11.contains(userInfo.f3461id)) {
                            userInfo.meetAgain = z;
                        }
                        hashSet7 = hashSet11;
                        HashSet hashSet12 = hashSet6;
                        if (hashSet12.contains(userInfo.f3461id)) {
                            userInfo.newUser = true;
                        }
                        hashSet6 = hashSet12;
                        map54 = map54;
                        if (map54.containsKey(userInfo.f3461id)) {
                            userInfo.friendSenseExamLikeCnt = ((Integer) map54.get(userInfo.f3461id)).intValue();
                        }
                        if (CoreModule.m1854P().m11711g().m7024yc()) {
                            map52 = map52;
                            userInfo.userActivityInfo = (UserActivityInfo) map52.get(userInfo.f3461id);
                        } else {
                            map52 = map52;
                        }
                        if (CoreModule.m1853N().M8()) {
                            map6 = map49;
                            userInfo.userState = (BubbleInfo) map6.get(userInfo.f3461id);
                        } else {
                            map6 = map49;
                        }
                        map49 = map6;
                        HashMap map69 = map37;
                        userInfo.hasLikeMeFrom = (String) map69.get(userInfo.f3461id);
                        if (NullChecker.a((Object) null)) {
                            throw null;
                        }
                        if (ura.m25555e().m25559d().m5758er()) {
                            map37 = map69;
                            map7 = map59;
                            if (ura.m25555e().m25559d().m5831oe()) {
                                userInfo.hasLikeMeSlideCardReward = !TextUtils.isEmpty((CharSequence) map7.get(userInfo.f3461id));
                            }
                        } else {
                            map37 = map69;
                            map7 = map59;
                            userInfo.hasLikeMeSlideCardBottom = !TextUtils.isEmpty((CharSequence) map7.get(userInfo.f3461id));
                        }
                        if (ura.m25555e().m25559d().m5855s()) {
                            map59 = map7;
                            map8 = map35;
                            if (map8.containsKey(userInfo.f3461id)) {
                                userInfo.userMedia = (List) map8.get(userInfo.f3461id);
                            }
                        } else {
                            map59 = map7;
                            map8 = map35;
                        }
                        map35 = map8;
                        userInfo.compliment = (SuggestedComplimentItem) map29.get(userInfo.f3461id);
                        HashMap map70 = map28;
                        if (map70.containsKey(userInfo.f3461id)) {
                            userInfo.coreMomentInfoList = (List) map70.get(userInfo.f3461id);
                        }
                        map28 = map70;
                        map48 = map48;
                        if (map48.containsKey(userInfo.f3461id)) {
                            userInfo.descriptionContent = ((CardExtraInfo) map48.get(userInfo.f3461id)).descriptionContent;
                            userInfo.descriptionId = ((CardExtraInfo) map48.get(userInfo.f3461id)).descriptionId;
                        }
                        if (map68.containsKey(userInfo.f3461id)) {
                            userInfo.creditScore = (CreditScoreData) map68.get(userInfo.f3461id);
                        } else {
                            userInfo.creditScore = null;
                        }
                        if (ura.m25555e().m25559d().m5618Er()) {
                            HashMap map71 = map47;
                            if (map71.containsKey(userInfo.f3461id)) {
                                ArrayList arrayList13 = (ArrayList) map71.get(userInfo.f3461id);
                                if (!vwb.J(arrayList13)) {
                                    Collections.sort(arrayList13, new Comparator() { // from class: l.i4b
                                        @Override // java.util.Comparator
                                        public final int compare(Object obj, Object obj2) {
                                            return CoreSuggested.m2781C3((LiteraturesComments) obj, (LiteraturesComments) obj2);
                                        }
                                    });
                                }
                                List<LiteraturesComments> list14 = (List) map71.get(userInfo.f3461id);
                                userInfo.literaturesComments = list14;
                                if (!vwb.J(list14)) {
                                    Iterator<LiteraturesComments> it35 = userInfo.literaturesComments.iterator();
                                    while (it35.hasNext()) {
                                        LiteraturesComments next2 = it35.next();
                                        if (NullChecker.a(next2)) {
                                            next2.localLiteratures = (Literatures) map36.get(next2.literatureID);
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
                        if (ura.m25555e().m25559d().m5877w()) {
                            map2 = map15;
                            HashMap map72 = map65;
                            map65 = map72;
                            map3 = map50;
                            ura.m25555e().m25559d().m5635Hq(userInfo.f3461id, (ValueObject) map64.get(userInfo.f3461id), (ValueObject) map72.get(userInfo.f3461id));
                            HashMap map73 = map43;
                            if (map73.containsKey(userInfo.f3461id)) {
                                ArrayList<LiteraturesComments> arrayList14 = (ArrayList) map73.get(userInfo.f3461id);
                                if (vwb.J(arrayList14)) {
                                    map43 = map73;
                                } else {
                                    for (LiteraturesComments literaturesComments3 : arrayList14) {
                                        if (NullChecker.a(literaturesComments3)) {
                                            literaturesComments3.localLiteratures = (Literatures) map36.get(literaturesComments3.literatureID);
                                            map73 = map73;
                                        }
                                    }
                                    map43 = map73;
                                    CoreModule.f1534c.f3628e0.m21376L9(userInfo.f3461id, arrayList14);
                                }
                            } else {
                                map43 = map73;
                            }
                        } else {
                            map2 = map15;
                            map65 = map65;
                            map3 = map50;
                        }
                        if (ura.m25555e().m25559d().m5792is()) {
                            map41 = map41;
                            if (map41.containsKey(userInfo.f3461id)) {
                                ArrayList arrayList15 = (ArrayList) map41.get(userInfo.f3461id);
                                if (!vwb.J(arrayList15)) {
                                    Collections.sort(arrayList15, new Comparator() { // from class: l.j4b
                                        @Override // java.util.Comparator
                                        public final int compare(Object obj, Object obj2) {
                                            return CoreSuggested.m2819V3((ProfileLikeComment) obj, (ProfileLikeComment) obj2);
                                        }
                                    });
                                    userInfo.profileLikeCommentId = ((ProfileLikeComment) arrayList15.get(0)).id;
                                }
                            }
                            if (ura.m25555e().m25559d().m5888y()) {
                                map4 = map45;
                                if (map4.containsKey(userInfo.f3461id)) {
                                    userInfo.canGreet = ((UserGreetInfo) map4.get(userInfo.f3461id)).canGreet;
                                }
                            } else {
                                map4 = map45;
                            }
                            if (CoreModule.m1854P().m11711g().m6985b8()) {
                                map = map;
                                if (map.containsKey(userInfo.f3461id)) {
                                    userInfo.isPinLike = true;
                                    userInfo.topLikeRelationship = (Relationship) map.get(userInfo.f3461id);
                                }
                            } else {
                                map = map;
                            }
                            userInfo.localRelationship = next.localRelationship;
                            if (map26.size() > 0) {
                                map26 = map26;
                                list2 = (List) map26.get(userInfo.f3461id);
                                arrayList2 = new ArrayList();
                                if (!vwb.J(list2)) {
                                    i = 0;
                                    while (i < list2.size()) {
                                        String str6 = (String) list2.get(i);
                                        List list15 = list2;
                                        HashMap map74 = map24;
                                        dynamicLable = (DynamicLable) map74.get(str6);
                                        if (NullChecker.a(dynamicLable)) {
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
                            if (ura.m25555e().m25559d().m5877w()) {
                                ura.m25555e().m25559d().m5597Bf(userInfo.f3461id, map66, map67);
                            }
                            userInfo.isShowFakePhotoFeedback = hashSet10.contains(userInfo.f3461id);
                            hashSet = hashSet9;
                            userInfo.selectionUser = hashSet.contains(userInfo.f3461id);
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
                        if (ura.m25555e().m25559d().m5888y()) {
                            map4 = map45;
                            if (map4.containsKey(userInfo.f3461id)) {
                                userInfo.canGreet = ((UserGreetInfo) map4.get(userInfo.f3461id)).canGreet;
                            }
                        } else {
                            map4 = map45;
                        }
                        if (CoreModule.m1854P().m11711g().m6985b8()) {
                            map = map;
                            if (map.containsKey(userInfo.f3461id)) {
                                userInfo.isPinLike = true;
                                userInfo.topLikeRelationship = (Relationship) map.get(userInfo.f3461id);
                            }
                        } else {
                            map = map;
                        }
                        userInfo.localRelationship = next.localRelationship;
                        if (map26.size() > 0) {
                            map26 = map26;
                            list2 = (List) map26.get(userInfo.f3461id);
                            arrayList2 = new ArrayList();
                            if (!vwb.J(list2)) {
                                i = 0;
                                while (i < list2.size()) {
                                    String str7 = (String) list2.get(i);
                                    List list16 = list2;
                                    HashMap map75 = map24;
                                    dynamicLable = (DynamicLable) map75.get(str7);
                                    if (NullChecker.a(dynamicLable)) {
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
                        if (ura.m25555e().m25559d().m5877w()) {
                            ura.m25555e().m25559d().m5597Bf(userInfo.f3461id, map66, map67);
                        }
                        userInfo.isShowFakePhotoFeedback = hashSet10.contains(userInfo.f3461id);
                        hashSet = hashSet9;
                        userInfo.selectionUser = hashSet.contains(userInfo.f3461id);
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
    public final void m2918D6(List<UserInfo> list, List<User> list2) {
        CoreModule.f1534c.f3581O1.f12617S.toString();
        boolean z = m2946K6() && !xma.m27379e4();
        HashSet hashSet = new HashSet();
        for (User user : list2) {
            if ((z && user.isIntlFaceless()) || user.isIntlSpammerOrScammer() || CoreModule.f1534c.f3581O1.f12617S.contains(((DbObject) user).id)) {
                hashSet.add(((DbObject) user).id);
            }
        }
        Iterator<UserInfo> it = list.iterator();
        while (it.hasNext()) {
            if (hashSet.contains(it.next().f3461id)) {
                it.remove();
            }
        }
    }

    /* JADX INFO: renamed from: D7 */
    public final /* synthetic */ void m2919D7(boolean z, a aVar, Notification notification) {
        if (notification.j() || notification.i()) {
            m3005Z5(z).subscribe(aVar);
        }
    }

    /* JADX INFO: renamed from: D8 */
    public void m2920D8(String str) {
        this.f8580Q.f3676u0.m2419x7(str);
        m2924E8(str);
        if (CoreModule.m1854P().m11711g().m6985b8()) {
            this.f8580Q.f3630e2.m14078v3(str);
        }
    }

    /* JADX INFO: renamed from: E5 */
    public final int m2921E5() {
        if (NullChecker.a(CoreModule.f1534c.f3652m0.f3383a0.e())) {
            List list = ((PartialListOpt) CoreModule.f1534c.f3652m0.f3383a0.e()).loaded;
            if (!vwb.J(list)) {
                for (int i = 1; i < list.size(); i += 2) {
                    if (!CoreModule.f1534c.f3652m0.f3434r0.contains(((UserInfo) list.get(i)).f3461id)) {
                        return i;
                    }
                }
            }
        }
        return 1;
    }

    /* JADX INFO: renamed from: E6 */
    public boolean m2922E6(VoiceLiveState voiceLiveState) {
        return (!NullChecker.a(voiceLiveState) || TextUtils.isEmpty(voiceLiveState.voiceLiveId) || TextUtils.isEmpty(voiceLiveState.anchorId) || TextUtils.isEmpty(voiceLiveState.topDesc) || TextUtils.isEmpty(voiceLiveState.title) || vwb.J(voiceLiveState.messages) || vwb.J(voiceLiveState.avatars)) ? false : true;
    }

    /* JADX INFO: renamed from: E7 */
    public final /* synthetic */ void m2923E7(Envelope envelope) {
        CoreData moduleData = envelope.getModuleData(CoreData.class);
        if (TextUtils.isEmpty(moduleData.payWill)) {
            return;
        }
        this.f8580Q.f3628e0.f18988g3.put(moduleData.payWill);
    }

    /* JADX INFO: renamed from: E8 */
    public void m2924E8(final String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        m2928F8(new w9j() { // from class: l.sza
            public final Object call(Object obj) {
                return Boolean.valueOf(((CoreSuggested.UserInfo) obj).f3461id.equals(str));
            }
        });
        if (CoreModule.m1854P().m11711g().m6985b8()) {
            this.f8580Q.f3630e2.m14078v3(str);
        }
    }

    /* JADX INFO: renamed from: F5 */
    public void m2925F5(boolean z) {
        if (z || !NullChecker.a(this.f3419m0.e()) || mqi0.o() - ((Long) this.f3419m0.e()).longValue() >= 60000) {
            if (m2926F6()) {
                this.f3419m0.onNext(Long.valueOf(mqi0.o()));
                return;
            }
            scheduled("verified-isolation/likedby-info" + mqi0.o(), 0, new v9j() { // from class: l.l3b
                public final Object call() {
                    return this.f16207a.m2974R6();
                }
            }).doOnError(new e30() { // from class: l.m3b
                public final void call(Object obj) {
                    this.f16782a.m2978S6((Throwable) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: F6 */
    public boolean m2926F6() {
        return m3055m6() >= ura.m25555e().m25559d().m5889y6();
    }

    /* JADX INFO: renamed from: F7 */
    public final /* synthetic */ c m2927F7() {
        return ia20.m16571e(new v9j() { // from class: l.u0b
            public final Object call() {
                return C0154a.f3483P.auth().q(C0154a.m3130G("/pay-will")).f().b();
            }
        }).doOnNext(new e30() { // from class: l.v0b
            public final void call(Object obj) {
                this.f23844a.m2923E7((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: F8 */
    public void m2928F8(w9j<UserInfo, Boolean> w9jVar) {
        if (this.f3383a0.e() == null || vwb.J(((PartialListOpt) this.f3383a0.e()).loaded)) {
            return;
        }
        Iterator it = ((PartialListOpt) this.f3383a0.e()).loaded.iterator();
        while (it.hasNext()) {
            UserInfo userInfo = (UserInfo) it.next();
            if (((Boolean) w9jVar.call(userInfo)).booleanValue()) {
                this.f3377Y.remove(userInfo.f3461id);
                it.remove();
                ((PartialListOpt) this.f3383a0.e()).setRefreshValue(true);
                a<PartialListOpt<UserInfo>> aVar = this.f3383a0;
                aVar.onNext(((PartialListOpt) aVar.e()).setReason(PartialListOpt.RefreshReason.removeUserFromSuggested));
                return;
            }
        }
    }

    /* JADX INFO: renamed from: G5 */
    public void m2929G5(Envelope envelope) {
        if (ura.m25555e().m25559d().m5641Is()) {
            List list = envelope.getModuleData(CommonData.class).users;
            if (vwb.J(list)) {
                return;
            }
            ListIterator listIterator = list.listIterator();
            while (listIterator.hasNext()) {
                if (m2942J6((User) listIterator.next())) {
                    listIterator.remove();
                }
            }
        }
    }

    /* JADX INFO: renamed from: G6 */
    public boolean m2930G6() {
        return this.f3383a0.e() == null || vwb.J(((PartialListOpt) this.f3383a0.e()).loaded);
    }

    /* JADX INFO: renamed from: G7 */
    public final /* synthetic */ Boolean m2931G7(CardPattern cardPattern) {
        return Boolean.valueOf(cardPattern.userId.equals(((UserInfo) ((PartialListOpt) this.f3383a0.e()).loaded.get(0)).f3461id));
    }

    /* JADX INFO: renamed from: G8 */
    public void m2932G8(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (this.f3383a0.e() != null && !vwb.J(((PartialListOpt) this.f3383a0.e()).loaded)) {
            Iterator it = ((PartialListOpt) this.f3383a0.e()).loaded.iterator();
            while (it.hasNext()) {
                UserInfo userInfo = (UserInfo) it.next();
                if (NullChecker.a(userInfo) && str.equals(userInfo.f3461id)) {
                    this.f3377Y.remove(userInfo.f3461id);
                    it.remove();
                    ((PartialListOpt) this.f3383a0.e()).setRefreshValue(true);
                    a<PartialListOpt<UserInfo>> aVar = this.f3383a0;
                    aVar.onNext(((PartialListOpt) aVar.e()).setReason(PartialListOpt.RefreshReason.removeUserWhenOnlineMatchSuccess));
                    break;
                }
            }
        }
        Act.r rVarForeground_ = Act.foreground_();
        if (rVarForeground_ != null) {
            Activity activity = (Activity) rVarForeground_.a.get();
            if (NullChecker.a(activity) && ura.m25555e().m25559d().m5602Ce(activity)) {
                this.f8580Q.f3676u0.m2419x7(str);
            }
        }
        this.f8580Q.f3676u0.m2416w7(str);
    }

    /* JADX INFO: renamed from: H5 */
    public void m2933H5() {
        if (ura.m25555e().m25559d().m5641Is() && NullChecker.a(this.f3383a0.e())) {
            List list = ((PartialListOpt) this.f3383a0.e()).loaded;
            ArrayList arrayList = new ArrayList();
            if (vwb.J(list)) {
                return;
            }
            int iM5763fd = ura.m25555e().m25559d().m5763fd();
            ListIterator listIterator = list.listIterator();
            while (listIterator.hasNext()) {
                UserInfo userInfo = (UserInfo) listIterator.next();
                if (!userInfo.isVirtualCard() && !TextUtils.isEmpty(userInfo.f3461id) && userInfo.checkPointTime > 0 && mqi0.o() - userInfo.checkPointTime >= ((long) iM5763fd) * 60000) {
                    arrayList.add(userInfo.f3461id);
                }
            }
            if (vwb.J(arrayList)) {
                return;
            }
            m2937I5(arrayList);
        }
    }

    /* JADX INFO: renamed from: H6 */
    public final boolean m2934H6(LikeExtraData likeExtraData) {
        return NullChecker.a(likeExtraData) && NullChecker.a(likeExtraData.matchScData) && TextUtils.equals(likeExtraData.matchScData.actionname, "like") && TextUtils.equals(likeExtraData.matchScData.updateRelationshipsModuleId, "e_boost_result_rev");
    }

    /* JADX INFO: renamed from: H7 */
    public final /* synthetic */ c m2935H7(String str, String str2) {
        final String str3 = "/me/marriage-info/" + str + "/report";
        final JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("action", str2);
        } catch (Exception unused) {
        }
        return ia20.m16571e(new v9j() { // from class: l.g1b
            public final Object call() {
                return C0154a.f3483P.auth().q(C0154a.m3296w2(str3)).l(utc0.create(Network.JSON, jSONObject.toString())).b();
            }
        }).map(new C0151c()).compose(mkd0.C());
    }

    /* JADX INFO: renamed from: H8 */
    public void m2936H8(List<String> list) {
        if (list == null || list.size() == 0) {
            return;
        }
        boolean z = false;
        if (this.f3383a0.e() != null && !vwb.J(((PartialListOpt) this.f3383a0.e()).loaded)) {
            Iterator it = ((PartialListOpt) this.f3383a0.e()).loaded.iterator();
            while (it.hasNext()) {
                UserInfo userInfo = (UserInfo) it.next();
                if (NullChecker.a(userInfo) && list.contains(userInfo.f3461id)) {
                    this.f3377Y.remove(userInfo.f3461id);
                    it.remove();
                    z = true;
                }
            }
        }
        if (z) {
            ((PartialListOpt) this.f3383a0.e()).setRefreshValue(true);
            a<PartialListOpt<UserInfo>> aVar = this.f3383a0;
            aVar.onNext(((PartialListOpt) aVar.e()).setReason(PartialListOpt.RefreshReason.removeUsersById));
        }
    }

    /* JADX INFO: renamed from: I5 */
    public final void m2937I5(final List<String> list) {
        final HashSet hashSet = new HashSet();
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            hashSet.add(it.next());
        }
        scheduled("check_card_user_invalid", 0, new v9j() { // from class: l.u1b
            public final Object call() {
                return this.f22422a.m2986U6(list, hashSet);
            }
        });
    }

    /* JADX INFO: renamed from: I6 */
    public final boolean m2938I6(LikeExtraData likeExtraData) {
        if (!CoreModule.f1534c.f3624c2.m12284t3() || !CoreModule.m1854P().m11709e().m6927wq() || !NullChecker.a(likeExtraData) || !NullChecker.a(likeExtraData.matchScData)) {
            return false;
        }
        if (TextUtils.equals(likeExtraData.matchScData.actionname, "like") || TextUtils.equals(likeExtraData.matchScData.actionname, "superlike")) {
            return TextUtils.equals(likeExtraData.matchScData.updateRelationshipsSource, "suggest_user_profile_info") || TextUtils.equals(likeExtraData.matchScData.updateRelationshipsSource, "suggest_users_home");
        }
        return false;
    }

    /* JADX INFO: renamed from: I7 */
    public final /* synthetic */ c m2939I7(final String str) {
        return ia20.m16571e(new v9j() { // from class: l.h1b
            public final Object call() {
                return C0154a.f3483P.auth().q(C0154a.m3296w2(str)).f().b();
            }
        }).map(new C0150b()).compose(mkd0.C());
    }

    /* JADX INFO: renamed from: I8 */
    public void m2940I8(List<String> list) {
        if (list == null || list.size() == 0 || this.f3383a0.e() == null || vwb.J(((PartialListOpt) this.f3383a0.e()).loaded)) {
            return;
        }
        Iterator it = ((PartialListOpt) this.f3383a0.e()).loaded.iterator();
        while (it.hasNext()) {
            UserInfo userInfo = (UserInfo) it.next();
            if (NullChecker.a(userInfo) && list.contains(userInfo.f3461id)) {
                this.f3377Y.remove(userInfo.f3461id);
                it.remove();
            }
        }
    }

    /* JADX INFO: renamed from: J5 */
    public final boolean m2941J5(User user) {
        if (NullChecker.a(user)) {
            return true;
        }
        return NullChecker.a(this.f3383a0.e()) && !vwb.J(((PartialListOpt) this.f3383a0.e()).loaded);
    }

    /* JADX INFO: renamed from: J6 */
    public final boolean m2942J6(User user) {
        if (user.isBannedNew() || user.isBanned()) {
            return true;
        }
        if (vwb.J(user.status)) {
            return false;
        }
        return user.status.contains(UserStatus.get("RISK_TAG_LIKE_EXPOSE")) || user.status.contains(UserStatus.get("RISK_TAG_MOMENT_EXPOSE")) || user.status.contains(UserStatus.get("RISK_TAG_COMMENT_EXPOSE")) || user.status.contains(UserStatus.get("RISK_TAG_GREETING_DISABLED")) || user.status.contains(UserStatus.get("RISK_TAG_GROUP_CHAT_EXPOSE"));
    }

    /* JADX INFO: renamed from: J7 */
    public final /* synthetic */ void m2943J7() {
        m3060n8(false);
    }

    /* JADX INFO: renamed from: J8 */
    public boolean m2944J8(UserInfo userInfo) {
        boolean z = false;
        if (this.f3383a0.e() != null && !vwb.J(((PartialListOpt) this.f3383a0.e()).loaded)) {
            Iterator it = ((PartialListOpt) this.f3383a0.e()).loaded.iterator();
            while (it.hasNext()) {
                UserInfo userInfo2 = (UserInfo) it.next();
                if (NullChecker.a(userInfo2) && (userInfo2.equals(userInfo) || ((TextUtils.equals(userInfo.f3461id, userInfo2.f3461id) && !userInfo.isVirtualCard()) || (userInfo2.isVirtualCard() && userInfo.isVirtualCard() && userInfo2.virtualCardType == userInfo.virtualCardType)))) {
                    it.remove();
                    ((PartialListOpt) this.f3383a0.e()).loaded.size();
                    du2.a("BifrostLayout", "删除List数据：" + userInfo2.f3461id + ", " + ((PartialListOpt) this.f3383a0.e()).loaded.size());
                    z = true;
                    break;
                }
            }
            ((PartialListOpt) this.f3383a0.e()).setRefreshValue(vwb.J(((PartialListOpt) this.f3383a0.e()).loaded));
            a<PartialListOpt<UserInfo>> aVar = this.f3383a0;
            aVar.onNext(((PartialListOpt) aVar.e()).setReason(PartialListOpt.RefreshReason.REMOVE_BY_BIFROST));
        }
        return z;
    }

    /* JADX INFO: renamed from: K5 */
    public void m2945K5() {
        this.f3320D2.onNext(roj0.a);
        m3009a6(false, true);
    }

    /* JADX INFO: renamed from: K6 */
    public final boolean m2946K6() {
        return "_Test".equals(ABManager.m1258j0("IntlPremiumCards"));
    }

    /* JADX INFO: renamed from: K7 */
    public final /* synthetic */ void m2947K7() {
        if (this.f3365U) {
            return;
        }
        if (this.f3383a0.e() == null || ((PartialListOpt) this.f3383a0.e()).loaded.isEmpty()) {
            e51.M(new Runnable() { // from class: l.o3b
                @Override // java.lang.Runnable
                public final void run() {
                    this.f18004a.m2943J7();
                }
            });
        }
    }

    /* JADX INFO: renamed from: K8 */
    public void m2948K8(final User user, final User user2, final int i) {
        this.f8580Q.scheduled("user-boost_cancel", -1, new v9j() { // from class: l.p0b
            public final Object call() {
                return ia20.m16571e(new v9j() { // from class: l.q0b
                    public final Object call() {
                        return C0154a.f3483P.auth().q(C0154a.m3229g(((DbObject) user).id, ((DbObject) user).id, String.valueOf(qib0.f19808f0), i)).f().b();
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: L5 */
    public void m2949L5() {
        m2957N5();
        m3057m8();
    }

    /* JADX INFO: renamed from: L6 */
    public boolean m2950L6(String str) {
        return this.f3379Y1.containsKey(str);
    }

    /* JADX INFO: renamed from: L7 */
    public final /* synthetic */ Boolean m2951L7(PartialListOpt partialListOpt) {
        if (NullChecker.a(partialListOpt)) {
            return Boolean.TRUE;
        }
        m2956M8();
        return Boolean.FALSE;
    }

    /* JADX INFO: renamed from: L8 */
    public void m2952L8(final User user, final User user2, final int i) {
        this.f8580Q.scheduled("user-boost_like", -1, new v9j() { // from class: l.k0b
            public final Object call() {
                return ia20.m16571e(new v9j() { // from class: l.r0b
                    public final Object call() {
                        return C0154a.f3483P.auth().q(C0154a.m3233h(((DbObject) user).id, ((DbObject) user).id, String.valueOf(qib0.f19808f0), i)).f().b();
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: M5 */
    public c<roj0> m2953M5() {
        m2957N5();
        return m3057m8();
    }

    /* JADX INFO: renamed from: M6 */
    public boolean m2954M6(String str) {
        return this.f3382Z1.containsKey(str);
    }

    /* JADX INFO: renamed from: M7 */
    public final /* synthetic */ stc0 m2955M7(boolean z, String str) {
        return C0154a.f3483P.auth().q(z ? m3087x5(str) : C0154a.m3109A2(str)).f().b();
    }

    /* JADX INFO: renamed from: M8 */
    public final void m2956M8() {
        CrashHelper.c(new RuntimeException("推荐列表Null异常:标记位:" + this.f3433q2[0] + "," + this.f3433q2[1] + "," + this.f3433q2[2]));
    }

    /* JADX INFO: renamed from: N5 */
    public final void m2957N5() {
        if (NullChecker.a(this.f3383a0.e()) && !vwb.J(((PartialListOpt) this.f3383a0.e()).loaded)) {
            ListIterator listIterator = ((PartialListOpt) this.f3383a0.e()).loaded.listIterator();
            while (listIterator.hasNext()) {
                UserInfo userInfo = (UserInfo) listIterator.next();
                if (!TextUtils.isEmpty(userInfo.f3461id)) {
                    this.f3377Y.remove(userInfo.f3461id);
                }
                listIterator.remove();
            }
            ((PartialListOpt) this.f3383a0.e()).setRefreshValue(true);
            a<PartialListOpt<UserInfo>> aVar = this.f3383a0;
            aVar.onNext(((PartialListOpt) aVar.e()).setReason(PartialListOpt.RefreshReason.CLEAR_OLD_DATA));
        }
        m3057m8();
    }

    /* JADX INFO: renamed from: N6 */
    public final boolean m2958N6() {
        return "INTL_LOWACTIVITY_TEST_1".equals(ABManager.m1258j0("INTL_LOWACTIVITY")) || "INTL_LOWACTIVITY_2".equals(ABManager.m1258j0("INTL_LOWACTIVITY")) || "INTL_LOWACTIVITY_1".equals(ABManager.m1258j0("INTL_LOWACTIVITY"));
    }

    /* JADX INFO: renamed from: N7 */
    public final /* synthetic */ void m2959N7(Envelope envelope) {
        m2929G5(envelope);
        if (ConnectivityReceiver.i()) {
            vwb.z(vwb.E(envelope.getModuleData(CommonData.class).users), new e30() { // from class: l.w3b
                public final void call(Object obj) {
                    CoreSuggested.m2899x3((User) obj);
                }
            });
        }
        this.f8580Q.m3422w3(envelope, null);
    }

    /* JADX INFO: renamed from: N8 */
    public c<roj0> m2960N8(final String str, final String str2) {
        if (TextUtils.isEmpty(str)) {
            return c.just(roj0.a);
        }
        return this.f8580Q.scheduled("reportSuggestMarryUser+" + str, -1, new v9j() { // from class: l.h3b
            public final Object call() {
                return this.f13666a.m2935H7(str, str2);
            }
        });
    }

    /* JADX INFO: renamed from: O5 */
    public void m2961O5() {
        this.f3407i0 = null;
        this.f3410j0 = null;
        this.f3413k0 = 1;
    }

    /* JADX INFO: renamed from: O6 */
    public boolean m2962O6() {
        return ((Boolean) this.f3368V.e()).booleanValue();
    }

    /* JADX INFO: renamed from: O7 */
    public final /* synthetic */ roj0 m2963O7(int i, String str, Envelope envelope) {
        int iIntValue;
        RelationshipStatus relationshipStatus = RelationshipStatus.get("unknown_");
        if (!vwb.J(envelope.getModuleData(CoreData.class).relationships)) {
            relationshipStatus = ((Relationship) envelope.getModuleData(CoreData.class).relationships.get(0)).state;
        }
        HashMap map = new HashMap();
        CoreModule.m1853N().zd(envelope, map);
        if (!TEnum.equals(relationshipStatus, "matched") && !vwb.J(envelope.getModuleData(CommonData.class).users)) {
            User user = (User) envelope.getModuleData(CommonData.class).users.get(0);
            if (NullChecker.a(user)) {
                UserInfo userInfo = new UserInfo();
                String str2 = ((DbObject) user).id;
                userInfo.f3461id = str2;
                userInfo.hasMoment = map.containsKey(str2);
                if (!ura.m25555e().m25559d().m5804k6() || i <= 1) {
                    userInfo.preSwipedDirection = SwipeDirection.LEFT;
                }
                HashMap<String, String> mapM17250o = j2e0.m17250o(Uri.parse(str));
                if (!TextUtils.isEmpty(mapM17250o.get("pushtype"))) {
                    try {
                        userInfo.userCardPushType = Integer.parseInt(mapM17250o.get("pushtype"));
                        if (!TextUtils.isEmpty(mapM17250o.get("reason"))) {
                            userInfo.userCardPushReason = Integer.parseInt(mapM17250o.get("reason"));
                        }
                        userInfo.userCardPushTag = mapM17250o.get("tag");
                    } catch (NumberFormatException unused) {
                    }
                    userInfo.isUserCardPush = true;
                }
                String str3 = mapM17250o.get("uid");
                String str4 = mapM17250o.get("showType");
                if (TextUtils.isEmpty(mapM17250o.get("pictureIndex"))) {
                    iIntValue = 0;
                } else {
                    try {
                        iIntValue = Integer.valueOf(mapM17250o.get("pictureIndex")).intValue();
                    } catch (NumberFormatException e) {
                        CrashHelper.c(e);
                        iIntValue = 0;
                    }
                }
                if (ura.m25555e().m25559d().m5804k6()) {
                    this.f3434r0.add(((DbObject) user).id);
                }
                if (!TextUtils.isEmpty(str3)) {
                    List list = user.pictures;
                    if (!TextUtils.isEmpty(str4)) {
                        int i2 = 0;
                        for (int i3 = 0; i3 < list.size(); i3++) {
                            if ("video".equals(str4) && ((Media) list.get(i3)).mediaType.startsWith("video/")) {
                                if (i2 == iIntValue) {
                                    CoreModule.f1534c.f3628e0.f18753B0 = xaj0.a(str3, str4, Integer.valueOf(i3));
                                    break;
                                }
                                i2++;
                            } else {
                                if ("picture".equals(str4) && ((Media) list.get(i3)).mediaType.startsWith("image/")) {
                                    if (i2 == iIntValue) {
                                        CoreModule.f1534c.f3628e0.f18753B0 = xaj0.a(str3, str4, Integer.valueOf(i3));
                                        break;
                                    }
                                    i2++;
                                }
                            }
                        }
                    } else if (iIntValue > 0) {
                        CoreModule.f1534c.f3628e0.f18753B0 = xaj0.a(str3, str4, Integer.valueOf(iIntValue));
                    }
                }
                CardInfos cardInfosNew_ = CardInfos.new_();
                cardInfosNew_.userId = userInfo.f3461id;
                if (TextUtils.isEmpty(mapM17250o.get("widget_content"))) {
                    cardInfosNew_.cardName = "idlepush";
                } else {
                    cardInfosNew_.cardName = "phone_widget";
                }
                userInfo.cardInfos = cardInfosNew_;
                m3084w6(userInfo, i);
                if (ura.m25555e().m25559d().m5739b()) {
                    CoreModule.m1855Q().putLiveState(envelope.getModuleData(CommonData.class).users);
                }
            }
        }
        return roj0.a;
    }

    /* JADX INFO: renamed from: O8 */
    public c<roj0> m2964O8(String str) {
        return m2960N8(str, "dislike");
    }

    /* JADX INFO: renamed from: P5 */
    public void m2965P5() {
        CoreModule.f1534c.clearRequests("users/suggested", 0);
    }

    /* JADX INFO: renamed from: P6 */
    public final /* synthetic */ void m2966P6(boolean z) {
        this.f3368V.onNext(Boolean.FALSE);
        this.f3365U = false;
        if (CoreModule.f1534c == null || CoreModule.m1850H().userId() == null) {
            return;
        }
        if (z) {
            this.f3326F2.onNext(roj0.a);
        }
        m2969Q5();
        m3057m8();
    }

    /* JADX INFO: renamed from: P7 */
    public final /* synthetic */ stc0 m2967P7() {
        return C0154a.f3483P.auth().l(utc0.create(Network.JSON, "")).q(C0154a.m3130G(this.f3347M2)).b();
    }

    /* JADX INFO: renamed from: P8 */
    public c<roj0> m2968P8(String str) {
        return m2960N8(str, "show");
    }

    /* JADX INFO: renamed from: Q5 */
    public void m2969Q5() {
        CoreModule.f1534c.clearRequests("users/suggested", 0);
        CoreModule.f1534c.clearRequests("users/suggested/insert", 0);
        CoreModule.f1534c.clearRequests("users/suggested/active/insert", 0);
        CoreModule.f1534c.clearRequests("users/suggested/passive/insert", 0);
    }

    /* JADX INFO: renamed from: Q6 */
    public final /* synthetic */ Integer m2970Q6(Envelope envelope) {
        this.f3416l0 = envelope.getModuleData(CoreData.class).likedByToday;
        this.f3419m0.onNext(Long.valueOf(mqi0.o()));
        return 0;
    }

    /* JADX INFO: renamed from: Q7 */
    public final /* synthetic */ c m2971Q7() {
        return ia20.m16567a(new v9j() { // from class: l.f1b
            public final Object call() {
                return this.f11562a.m2967P7();
            }
        });
    }

    /* JADX INFO: renamed from: Q8 */
    public void m2972Q8(UserInfo userInfo, int i, SwipeDirection swipeDirection) {
        this.f3407i0 = CoreModule.f1534c.f3628e0.m21393Pa(userInfo.f3461id);
        this.f3413k0 = i;
        this.f3410j0 = userInfo;
        userInfo.preSwipedDirection = swipeDirection;
        userInfo.canUndo = true;
    }

    /* JADX INFO: renamed from: R5 */
    public void m2973R5() {
        if (this.f3383a0.e() == null || vwb.J(((PartialListOpt) this.f3383a0.e()).loaded)) {
            return;
        }
        vwb.z(((PartialListOpt) this.f3383a0.e()).loaded, new e30() { // from class: l.o4b
            public final void call(Object obj) {
                this.f18010a.m2990V6((CoreSuggested.UserInfo) obj);
            }
        });
        this.f3383a0.onNext(new PartialListOpt(new ArrayList(), ((PartialListOpt) this.f3383a0.e()).links).setReason(PartialListOpt.RefreshReason.clearSuggestedData));
    }

    /* JADX INFO: renamed from: R6 */
    public final /* synthetic */ c m2974R6() {
        return ia20.m16571e(new v9j() { // from class: l.e4b
            public final Object call() {
                return C0154a.f3483P.auth().f().q(C0154a.m3130G("/verified-isolation/likedby-info")).b();
            }
        }).map(new w9j() { // from class: l.f4b
            public final Object call(Object obj) {
                return this.f11609a.m2970Q6((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: R7 */
    public final /* synthetic */ void m2975R7(Envelope envelope, User user, UserInfo userInfo, boolean z) {
        if (vwb.J(envelope.getModuleData(CoreData.class).relationships)) {
            CrashHelper.i(new Exception("return null relationships"), "core_undo", CrashHelper.ReportLevel.p5, 100);
            return;
        }
        if (TEnum.equals(((Relationship) envelope.getModuleData(CoreData.class).relationships.get(0)).state, CameraSticker.CATEGORY_DEFAULT_FILTER)) {
            qib0.f19813k0.f23551d.insert(user);
            userInfo.isUndo = true;
            if (!z) {
                userInfo.preSwipedDirection = null;
            }
            this.f8580Q.f3617a1.m16471A(userInfo.f3461id);
            m3084w6(userInfo, 0);
            m2961O5();
        }
    }

    /* JADX INFO: renamed from: R8 */
    public c<roj0> m2976R8() {
        return this.f3320D2.asObservable();
    }

    /* JADX INFO: renamed from: S5 */
    public void m2977S5() {
        this.f8580Q.clearRequests("get_dis_liked_users", 0);
    }

    /* JADX INFO: renamed from: S6 */
    public final /* synthetic */ void m2978S6(Throwable th) {
        this.f3419m0.onNext(Long.valueOf(mqi0.o()));
    }

    /* JADX INFO: renamed from: S7 */
    public final /* synthetic */ Relationship m2979S7(final User user, final UserInfo userInfo, final boolean z, final Envelope envelope) {
        this.f8580Q.m3422w3(envelope, new d30() { // from class: l.m0b
            public final void call() {
                this.f16736a.m2975R7(envelope, user, userInfo, z);
            }
        });
        if (!vwb.J(envelope.getModuleData(CoreData.class).relationships)) {
            return (Relationship) envelope.getModuleData(CoreData.class).relationships.get(0);
        }
        Relationship relationship = new Relationship();
        relationship.state = RelationshipStatus.get("unknown_");
        return relationship;
    }

    /* JADX INFO: renamed from: S8 */
    public void m2980S8() {
        m2965P5();
        m2949L5();
    }

    /* JADX INFO: renamed from: T5 */
    public boolean m2981T5(final UserInfo userInfo) {
        if (!NullChecker.a(this.f3383a0.e())) {
            return false;
        }
        List list = ((PartialListOpt) this.f3383a0.e()).loaded;
        if (vwb.J(list)) {
            return false;
        }
        return NullChecker.a((UserInfo) vwb.r(list, new w9j() { // from class: l.j0b
            public final Object call(Object obj) {
                CoreSuggested.UserInfo userInfo2 = userInfo;
                CoreSuggested.UserInfo userInfo3 = (CoreSuggested.UserInfo) obj;
                return Boolean.valueOf(TextUtils.equals(userInfo3.f3461id, userInfo2.f3461id) && userInfo3.virtualCardType == userInfo2.virtualCardType);
            }
        }));
    }

    /* JADX INFO: renamed from: T6 */
    public final /* synthetic */ void m2982T6(HashSet hashSet, List list) {
        if (vwb.J(list)) {
            return;
        }
        ura.m25555e().m25559d().m5610Dg("remove ban user: " + list.toString());
        HashSet hashSet2 = new HashSet();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            hashSet2.add((String) it.next());
        }
        if (NullChecker.a(this.f3383a0.e())) {
            ListIterator listIterator = ((PartialListOpt) this.f3383a0.e()).loaded.listIterator();
            while (listIterator.hasNext()) {
                UserInfo userInfo = (UserInfo) listIterator.next();
                if (hashSet2.contains(userInfo.f3461id)) {
                    listIterator.remove();
                } else if (hashSet.contains(userInfo.f3461id)) {
                    userInfo.checkPointTime = mqi0.o();
                }
            }
            ((PartialListOpt) this.f3383a0.e()).setRefreshValue(true);
            a<PartialListOpt<UserInfo>> aVar = this.f3383a0;
            aVar.onNext(((PartialListOpt) aVar.e()).setReason(PartialListOpt.RefreshReason.checkCardOnce));
        }
    }

    /* JADX INFO: renamed from: T7 */
    public final /* synthetic */ c m2983T7(final User user, Relationship relationship, Map map, final UserInfo userInfo, final boolean z) {
        return C0185y.m6842m3(((DbObject) user).id, relationship, map).map(new w9j() { // from class: l.xza
            public final Object call(Object obj) {
                return this.f27815a.m2979S7(user, userInfo, z, (Envelope) obj);
            }
        }).compose(C0154a.m3182T2());
    }

    /* JADX INFO: renamed from: T8 */
    public c<roj0> m2984T8() {
        return this.f3323E2.asObservable();
    }

    /* JADX INFO: renamed from: U5 */
    public final Relationship m2985U5(boolean z, boolean z2, boolean z3, boolean z4, int i, UserInfo userInfo, String str, LikeFrom likeFrom, String str2, LikeExtraData likeExtraData, String str3) {
        DclExtensions dclExtensions;
        int iIntValue;
        Relationship relationship = new Relationship();
        relationship.localLikeFrom = likeFrom.toString();
        if (z) {
            relationship.state = RelationshipStatus.get(z2 ? "blocked" : CameraSticker.CATEGORY_DEFAULT_FILTER);
        } else {
            relationship.state = RelationshipStatus.get(z3 ? "liked" : "disliked");
        }
        User userM21393Pa = CoreModule.f1534c.f3628e0.m21393Pa(userInfo.f3461id);
        ArrayList arrayList = new ArrayList();
        if (z) {
            arrayList.add(MatchFrom.get("relationUnion"));
        }
        if (TEnum.equals(likeFrom, "partner")) {
            arrayList.add(MatchFrom.get("partner"));
        }
        if (NullChecker.a(likeExtraData) && NullChecker.a(likeExtraData.status) && !TEnum.equals(likeExtraData.status, "unknown_")) {
            arrayList.add(likeExtraData.status);
        }
        if (z4 && !TextUtils.isEmpty(str) && (ura.m25555e().m25559d().m5859t() || ura.m25555e().m25559d().m5595B())) {
            arrayList.add(MatchFrom.get("letter"));
            if (TEnum.equals(likeFrom, "myLiked")) {
                arrayList.add(MatchFrom.get("myLiked"));
            }
            RelationshipExtensions relationshipExtensionsNew_ = RelationshipExtensions.new_();
            relationshipExtensionsNew_.letter = str;
            relationship.relationshipExtensions = relationshipExtensionsNew_;
            userInfo.letter = str;
            relationship.coinSign = CoreModule.f1534c.f3559H0.m27551s4(SummarizedPrivilegesId.get("letter"));
        } else if (z4) {
            arrayList.add(MatchFrom.get("superLiked"));
            if (TEnum.equals(likeFrom, "myLiked")) {
                arrayList.add(MatchFrom.get("myLiked"));
            }
            RelationshipExtensions relationshipExtensionsNew_2 = RelationshipExtensions.new_();
            relationshipExtensionsNew_2.letter = str;
            relationshipExtensionsNew_2.sendSuperLikedNum = String.valueOf(i);
            relationship.relationshipExtensions = relationshipExtensionsNew_2;
            if (CoreModule.m1851K().xf()) {
                relationship.diamondSign = CoreModule.f1534c.f3562I0.m17389x3(SummarizedPrivilegesId.get("superLike"));
            } else {
                relationship.coinSign = CoreModule.f1534c.f3559H0.m27551s4(SummarizedPrivilegesId.get("superLike"));
            }
        }
        if (!TextUtils.isEmpty(str2)) {
            relationship.picksTracker = str2;
        }
        if (CoreModule.m1854P().m11709e().m6927wq() && (m2938I6(likeExtraData) || m2934H6(likeExtraData))) {
            arrayList.add(MatchFrom.get("boostV2"));
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
        if (CoreModule.m1853N().so() && z3 && TEnum.equals(likeFrom, "moment")) {
            arrayList.add(MatchFrom.get("moment"));
        }
        if (z3 && TEnum.equals(likeFrom, "kankan")) {
            arrayList.add(MatchFrom.get("kankan"));
        }
        if (ura.m25555e().m25559d().m5792is() && z3 && !TextUtils.isEmpty(userInfo.profileLikeCommentId) && !z4) {
            arrayList.add(MatchFrom.get("profileLiked"));
            try {
                iIntValue = Integer.valueOf(userInfo.profileLikeCommentId).intValue();
            } catch (Exception unused) {
                iIntValue = 0;
            }
            relationship.likeProfileId = iIntValue;
        }
        if (this.f8580Q.f3676u0.m2420y5(userM21393Pa) || TEnum.equals(likeFrom, LikeFrom.get("instantChat"))) {
            arrayList.add(MatchFrom.get("seeUpgraded"));
        }
        if (CoreModule.m1854P().m11711g().m6988cf() && z3 && TEnum.equals(likeFrom, "pinLike")) {
            userInfo.sendPinLike = true;
            arrayList.add(MatchFrom.get("pinLike"));
        }
        if (ura.m25555e().m25559d().m5653Lc() && NullChecker.a(likeExtraData) && likeExtraData.isSelectedUser) {
            if (ura.m25555e().m25559d().m5742bn() && !xma.m27352G3()) {
                arrayList.add(MatchFrom.get("selectionPending"));
                if (z4) {
                    arrayList.remove(MatchFrom.get("superLiked"));
                }
            } else if (!CoreModule.m1854P().m11711g().m6944Ed() || sja.m23841r3() > 0) {
                arrayList.add(MatchFrom.get("selection"));
            }
        }
        relationship.status = arrayList;
        if (userM21393Pa != null) {
            if (!TextUtils.isEmpty(userM21393Pa.ussTracker)) {
                relationship.ussTracker = userM21393Pa.ussTracker;
            }
            UssTags ussTags = userM21393Pa.ussTags;
            if (ussTags != null && !TextUtils.isEmpty(ussTags.avatarIdentifier)) {
                relationship.avatarIdentifier = userM21393Pa.ussTags.avatarIdentifier;
            }
            if (NullChecker.a(userM21393Pa.anonymousLike)) {
                relationship.anonymousLikeItemId = userM21393Pa.anonymousLike.itemId;
            }
        }
        CardInfos cardInfos = userInfo.cardInfos;
        if (cardInfos != null && !TextUtils.isEmpty(cardInfos.cardName)) {
            SwipeCardInfo swipeCardInfoNew_ = SwipeCardInfo.new_();
            relationship.cardInfo = swipeCardInfoNew_;
            swipeCardInfoNew_.cardTypes.addAll(vwb.f0(userInfo.cardInfos.cardName.split(",")));
        }
        if (likeExtraData != null && (dclExtensions = likeExtraData.liveExtraInfo) != null && relationship.relationshipExtensions != null && TextUtils.equals(dclExtensions.businessType, "voiceLive")) {
            relationship.localLikeFrom = "voicelive";
            relationship.relationshipExtensions.roomID = likeExtraData.liveExtraInfo.voiceRoomId;
        }
        return relationship;
    }

    /* JADX INFO: renamed from: U6 */
    public final /* synthetic */ c m2986U6(List list, final HashSet hashSet) {
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
        return ia20.m16571e(new v9j() { // from class: l.q3b
            public final Object call() {
                return C0154a.f3483P.auth().q(C0154a.m3130G("/filter-users")).l(utc0.create(Network.JSON, jSONObject.toString())).b();
            }
        }).map(new w9j() { // from class: l.r3b
            public final Object call(Object obj) {
                return ((Envelope) obj).getModuleData(CoreData.class).invalidCardList;
            }
        }).observeOn(jo0.a()).doOnNext(new e30() { // from class: l.t3b
            public final void call(Object obj) {
                this.f21860a.m2982T6(hashSet, (List) obj);
            }
        });
    }

    /* JADX INFO: renamed from: U7 */
    public c<Relationship> m2987U7(boolean z, boolean z2, Map<String, String> map, User user, LikeExtraData likeExtraData, LikeFrom likeFrom) {
        return m2995W7(z, z2, map, user, null, likeFrom, true, likeExtraData);
    }

    /* JADX INFO: renamed from: U8 */
    public boolean m2988U8() {
        return C0154a.f3483P.guessedCurrentServerTime() - this.f3371W >= TimeUnit.MINUTES.toMillis(10L);
    }

    /* JADX INFO: renamed from: V5 */
    public final void m2989V5(List<SuperLikeCount> list) {
        if (vwb.J(list)) {
            return;
        }
        vwb.z(list, new e30() { // from class: l.h0b
            public final void call(Object obj) {
                this.f13620a.m2994W6((SuperLikeCount) obj);
            }
        });
    }

    /* JADX INFO: renamed from: V6 */
    public final /* synthetic */ void m2990V6(UserInfo userInfo) {
        this.f3377Y.remove(userInfo.f3461id);
    }

    @Deprecated
    /* JADX INFO: renamed from: V7 */
    public c<Relationship> m2991V7(boolean z, boolean z2, Map<String, String> map, User user, String str) {
        return m2995W7(z, z2, map, user, str, LikeFrom.get("unknown_"), true, null);
    }

    /* JADX INFO: renamed from: V8 */
    public c<Envelope> m2992V8() {
        final String str = "/me/marriage-info";
        return this.f8580Q.scheduled("suggestMarryUser", 0, new v9j() { // from class: l.l2b
            public final Object call() {
                return this.f16196a.m2939I7(str);
            }
        });
    }

    /* JADX INFO: renamed from: W5 */
    public void m2993W5(int i) {
        ((PartialListOpt) this.f3383a0.e()).setRefreshValue(true);
        List list = ((PartialListOpt) this.f3383a0.e()).loaded;
        if (i >= 0 && !vwb.J(list) && list.size() > i) {
            list.remove(i);
        }
        a<PartialListOpt<UserInfo>> aVar = this.f3383a0;
        aVar.onNext(((PartialListOpt) aVar.e()).setReason(PartialListOpt.RefreshReason.debugRefreshLoad));
    }

    /* JADX INFO: renamed from: W6 */
    public final /* synthetic */ void m2994W6(SuperLikeCount superLikeCount) {
        this.f3442t2.put(superLikeCount.userId, Integer.valueOf(superLikeCount.receiveTotalCount));
    }

    /* JADX INFO: renamed from: W7 */
    public c<Relationship> m2995W7(boolean z, boolean z2, @Nullable Map<String, String> map, User user, String str, LikeFrom likeFrom, boolean z3, @Nullable LikeExtraData likeExtraData) {
        return m2999X7(z, z2, map, user, str, likeFrom, z3, likeExtraData, 0);
    }

    /* JADX INFO: renamed from: W8 */
    public c<PartialListOpt<UserInfo>> m2996W8() {
        return this.f3383a0.doOnSubscribe(new d30() { // from class: l.m1b
            public final void call() {
                this.f16748a.m2947K7();
            }
        }).doOnNext(new e30() { // from class: l.n1b
            public final void call(Object obj) {
                CoreSuggested.m2828Z4((PartialListOpt) obj);
            }
        }).filter(new w9j() { // from class: l.o1b
            public final Object call(Object obj) {
                return this.f17978a.m2951L7((PartialListOpt) obj);
            }
        });
    }

    /* JADX INFO: renamed from: X5 */
    public final UserInfo m2997X5(boolean z, boolean z2, boolean z3, final User user, LikeFrom likeFrom, int i, boolean z4) {
        SwipeDirection swipeDirection;
        if (user != null) {
            UserInfo userInfo = new UserInfo();
            userInfo.f3461id = ((DbObject) user).id;
            if (this.f3383a0.e() != null && !vwb.J(((PartialListOpt) this.f3383a0.e()).loaded)) {
                UserInfo userInfo2 = (UserInfo) vwb.r(((PartialListOpt) this.f3383a0.e()).loaded, new w9j() { // from class: l.f3b
                    public final Object call(Object obj) {
                        return Boolean.valueOf(((DbObject) user).id.equals(((CoreSuggested.UserInfo) obj).f3461id));
                    }
                });
                if (!ura.m25555e().m25559d().m5699V6() && userInfo2 != null && z4) {
                    ((PartialListOpt) this.f3383a0.e()).loaded.remove(userInfo2);
                    ((PartialListOpt) this.f3383a0.e()).setRefreshValue(true);
                    a<PartialListOpt<UserInfo>> aVar = this.f3383a0;
                    aVar.onNext(((PartialListOpt) aVar.e()).setReason(PartialListOpt.RefreshReason.DO_BEFORE_LIKE));
                }
            }
            if (!z) {
                String string = likeFrom.toString();
                string.getClass();
                if (string.equals("likers")) {
                    this.f8580Q.f3676u0.m2413v7(((DbObject) user).id);
                } else if (string.equals("myLiked")) {
                    this.f8580Q.f3614Z0.m20587d4(((DbObject) user).id);
                    this.f8580Q.f3614Z0.m20588e4(((DbObject) user).id);
                    this.f8580Q.f3617a1.m16471A(((DbObject) user).id);
                    return userInfo;
                }
            }
            return userInfo;
        }
        UserInfo userInfo3 = (this.f3383a0.e() == null || vwb.J(((PartialListOpt) this.f3383a0.e()).loaded)) ? null : (UserInfo) ((PartialListOpt) this.f3383a0.e()).loaded.get(0);
        if (!ura.m25555e().m25559d().m5699V6()) {
            m2916C8("doBeforeLike");
        }
        if (CoreModule.f1543l.m11706a().m5426e2() && NullChecker.a(userInfo3)) {
            String originUserId = userInfo3.f3461id;
            LiveLivingCardDataWrapper liveLivingCardDataWrapper = userInfo3.liveLivingCardDataWrapper;
            if (liveLivingCardDataWrapper != null) {
                originUserId = liveLivingCardDataWrapper.getOriginUserId();
            }
            if (z2) {
                C0155a0.m3317j().m3319f(originUserId);
            } else {
                C0155a0.m3317j().m3318e(originUserId);
            }
        }
        if (!NullChecker.a(userInfo3)) {
            return new UserInfo();
        }
        String originUserId2 = userInfo3.f3461id;
        LiveLivingCardDataWrapper liveLivingCardDataWrapper2 = userInfo3.liveLivingCardDataWrapper;
        if (liveLivingCardDataWrapper2 != null) {
            originUserId2 = liveLivingCardDataWrapper2.getOriginUserId();
        }
        if (!userInfo3.disableUndo) {
            this.f3407i0 = CoreModule.f1534c.f3628e0.m21393Pa(originUserId2);
            this.f3413k0 = i;
            this.f3410j0 = userInfo3;
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
    public final /* synthetic */ Relationship m2998X6(Envelope envelope) {
        this.f8580Q.m3422w3(envelope, new d30() { // from class: l.i0b
            public final void call() {
                CoreSuggested.m2869n4();
            }
        });
        List list = envelope.getModuleData(CoreData.class).relationships;
        if (vwb.J(list)) {
            return null;
        }
        return (Relationship) list.get(0);
    }

    /* JADX INFO: renamed from: X7 */
    public c<Relationship> m2999X7(boolean z, boolean z2, @Nullable Map<String, String> map, User user, String str, LikeFrom likeFrom, boolean z3, @Nullable LikeExtraData likeExtraData, int i) {
        return m3003Y7(z, z2, map, user, str, likeFrom, z3, likeExtraData, i, null);
    }

    /* JADX INFO: renamed from: X8 */
    public c<UserInfo> m3000X8(final String str, final String str2) {
        return m3088x6(pib.m21240d7(str).map(new w9j() { // from class: l.a3b
            public final Object call(Object obj) {
                return CoreSuggested.m2809Q3(str, str2, (Envelope) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: Y5 */
    public c<Relationship> m3001Y5(final User user, final Map<String, String> map) {
        final Relationship relationship = new Relationship();
        relationship.state = RelationshipStatus.get(CameraSticker.CATEGORY_DEFAULT_FILTER);
        User userM21393Pa = CoreModule.f1534c.f3628e0.m21393Pa(((DbObject) user).id);
        if (NullChecker.a(userM21393Pa) && !TextUtils.isEmpty(userM21393Pa.ussTracker)) {
            relationship.ussTracker = userM21393Pa.ussTracker;
        }
        return this.f8580Q.scheduled("undo_feed_poi" + ((DbObject) user).id, -1, new v9j() { // from class: l.n3b
            public final Object call() {
                return this.f17458a.m3002Y6(user, relationship, map);
            }
        });
    }

    /* JADX INFO: renamed from: Y6 */
    public final /* synthetic */ c m3002Y6(User user, Relationship relationship, Map map) {
        return C0185y.m6842m3(((DbObject) user).id, relationship, map).map(new w9j() { // from class: l.b0b
            public final Object call(Object obj) {
                return this.f8641a.m2998X6((Envelope) obj);
            }
        }).compose(C0154a.m3182T2());
    }

    /* JADX INFO: renamed from: Y7 */
    public c<Relationship> m3003Y7(boolean z, boolean z2, @Nullable Map<String, String> map, User user, String str, LikeFrom likeFrom, boolean z3, @Nullable LikeExtraData likeExtraData, int i, String str2) {
        return m3007Z7(z, z2, map, user, str, likeFrom, z3, likeExtraData, i, str2, true);
    }

    /* JADX INFO: renamed from: Y8 */
    public c<roj0> m3004Y8(String str) {
        return m3008Z8(str, 0, false);
    }

    /* JADX INFO: renamed from: Z5 */
    public final c<roj0> m3005Z5(boolean z) {
        ura.m25555e().m25559d().m5610Dg("actually do poll");
        return m3009a6(z, false);
    }

    /* JADX INFO: renamed from: Z6 */
    public final /* synthetic */ c m3006Z6(Envelope envelope) {
        return !this.f3430p2 ? this.f3397e2.m6153u3(envelope, this.f3379Y1, this.f3382Z1, this.f3385a2) : c.just(vwb.Y(envelope, new SparseArray()));
    }

    /* JADX INFO: renamed from: Z7 */
    public c<Relationship> m3007Z7(boolean z, boolean z2, @Nullable Map<String, String> map, User user, String str, LikeFrom likeFrom, boolean z3, @Nullable LikeExtraData likeExtraData, int i, String str2, boolean z4) {
        return m3011a8(z, z2, map, user, str, likeFrom, z3, likeExtraData, i, str2, z4, 1, false);
    }

    /* JADX INFO: renamed from: Z8 */
    public c<roj0> m3008Z8(final String str, final int i, final boolean z) {
        return this.f8580Q.now(str, new la20(new v9j() { // from class: l.c3b
            public final Object call() {
                return this.f9320a.m2955M7(z, str);
            }
        }).doOnNext(new e30() { // from class: l.d3b
            public final void call(Object obj) {
                this.f10001a.m2959N7((Envelope) obj);
            }
        }).compose(C0154a.m3182T2()).map(new w9j() { // from class: l.e3b
            public final Object call(Object obj) {
                return this.f10743a.m2963O7(i, str, (Envelope) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: a6 */
    public final c<roj0> m3009a6(boolean z, final boolean z2) {
        this.f8580Q.f3652m0.f3433q2[2] = 0;
        this.f3404h0 = this.f3404h0 || z;
        this.f3430p2 = ura.m25555e().m25559d().m5771gm().get();
        if (ura.m25555e().m25559d().m5634Hg()) {
            CoreModule.f1534c.f3581O1.m15264p3();
        }
        final String strM3242j0 = this.f3430p2 ? C0154a.m3242j0(((DbObject) CoreModule.f1534c.f3628e0.m21490p9()).id) : m3064p6();
        this.f3422n0 = this.f3428p0;
        this.f3428p0 = System.currentTimeMillis();
        this.f3436r2 = "requesting";
        String strConcat = "users/suggested";
        if (ura.m25555e().m25559d().m5841q0()) {
            strConcat = "users/suggested" + this.f3310A1.get();
        }
        if (ura.m25555e().m25559d().m5816lk() && strM3242j0.contains("search=selected&mode=free_real_user")) {
            strConcat = strConcat.concat("just_real_user");
        }
        final c map = new la20(new v9j() { // from class: l.w0b
            public final Object call() {
                return C0154a.f3483P.auth().q(strM3242j0).f().b();
            }
        }).flatMap(new w9j() { // from class: l.x0b
            public final Object call(Object obj) {
                return this.f25644a.m3006Z6((Envelope) obj);
            }
        }).doOnNext(new e30() { // from class: l.y0b
            public final void call(Object obj) {
                this.f27835a.m3010a7((j760) obj);
            }
        }).doOnError(new e30() { // from class: l.z0b
            public final void call(Object obj) {
                this.f28533a.m3014b7((Throwable) obj);
            }
        }).subscribeOn(FastIoScheduler.b).observeOn(jo0.a()).map(new w9j() { // from class: l.a1b
            public final Object call(Object obj) {
                return this.f8052a.m3022d7(z2, (j760) obj);
            }
        });
        if (!RemoteConfig.x().s("cold_start_opt")) {
            return this.f8580Q.scheduled(strConcat, 0, new v9j() { // from class: l.b1b
                public final Object call() {
                    return CoreSuggested.m2849g5(map);
                }
            });
        }
        ura.m25555e().m25559d().m5610Dg("start use now schedule");
        yni.f(new LaunchStep[]{LaunchStep.PreNet_Request});
        return this.f8580Q.now(strConcat, map, true);
    }

    /* JADX INFO: renamed from: a7 */
    public final /* synthetic */ void m3010a7(j760 j760Var) {
        yni.d(LaunchStep.PreNet_Request);
        yni.f(new LaunchStep[]{LaunchStep.PreNet_Op});
        this.f3436r2 = "parseing";
        Envelope envelope = (Envelope) j760Var.a;
        CommonData commonData = (CommonData) envelope.getModuleData(CommonData.class);
        ura.m25555e().m25559d().m5610Dg("suggested data back");
        if (ConnectivityReceiver.i()) {
            yni.o = true;
            ura.m25555e().m25559d().m5610Dg("prefetch image to disk");
            if (!vwb.J(commonData.users)) {
                m2889t8(envelope.getModuleData(CommonData.class).users);
            }
        }
        if (ura.m25555e().m25559d().m5739b() && !vwb.J(commonData.users)) {
            CoreModule.m1855Q().putLiveState(envelope.getModuleData(CommonData.class).users);
        }
        if (!ura.m25555e().m25559d().m5750d7()) {
            m3031f8(envelope, commonData);
        }
        if (this.f3430p2 && vwb.J(commonData.users)) {
            ura.m25555e().m25559d().m5771gm().set(false);
        }
        if (ura.m25555e().m25559d().m5717X9()) {
            this.f8580Q.f3603V1.f9995R = envelope.getModuleData(CoreData.class).greetingNewPeople;
        }
    }

    /* JADX INFO: renamed from: a8 */
    public c<Relationship> m3011a8(boolean z, boolean z2, @Nullable Map<String, String> map, User user, String str, LikeFrom likeFrom, boolean z3, @Nullable LikeExtraData likeExtraData, int i, String str2, boolean z4, int i2, boolean z5) {
        return m3015b8(false, false, z, z2, map, user, str, likeFrom, z3, likeExtraData, i, str2, z4, i2, null, z5);
    }

    /* JADX INFO: renamed from: a9 */
    public c<UserInfo> m3012a9(String str) {
        return m3088x6(pib.m21245e7(str));
    }

    /* JADX INFO: renamed from: b6 */
    public void m3013b6(boolean z) {
        PartialListOpt partialListOpt = (PartialListOpt) this.f3342L0.e();
        if (partialListOpt == null || vwb.J(partialListOpt.loaded)) {
            return;
        }
        PartialListOpt partialListOpt2 = (PartialListOpt) this.f3383a0.e();
        if (partialListOpt2 == null || vwb.J(partialListOpt2.loaded)) {
            partialListOpt.setRefreshValue(true);
            this.f3383a0.onNext(partialListOpt);
            this.f3342L0.onNext((Object) null);
            return;
        }
        if (!e5l.a() || z) {
            UserInfo userInfo = (UserInfo) partialListOpt2.loaded.get(0);
            ArrayList arrayList = new ArrayList();
            arrayList.add(userInfo);
            for (UserInfo userInfo2 : partialListOpt.loaded) {
                if (userInfo2 != null) {
                    if (userInfo == null) {
                        break;
                    } else if (TextUtils.equals(userInfo2.f3461id, userInfo.f3461id)) {
                        userInfo.ussTags = userInfo2.ussTags;
                    } else {
                        arrayList.add(userInfo2);
                    }
                }
            }
            this.f3383a0.onNext(new PartialListOpt(arrayList, partialListOpt.links));
            this.f3342L0.onNext((Object) null);
        }
    }

    /* JADX INFO: renamed from: b7 */
    public final /* synthetic */ void m3014b7(Throwable th) {
        this.f8580Q.f3652m0.f3433q2[2] = 2;
        this.f3425o0 = this.f3431q0;
        this.f3431q0 = System.currentTimeMillis();
        long jGuessedCurrentServerTime = qib0.f19784H.guessedCurrentServerTime();
        int size = 0;
        if (NullChecker.a(this.f3383a0.e()) && NullChecker.a(((PartialListOpt) this.f3383a0.e()).loaded)) {
            size = ((PartialListOpt) this.f3383a0.e()).loaded.size();
        }
        m3016b9(th, size, jGuessedCurrentServerTime);
        this.f3323E2.onNext(roj0.a);
    }

    /* JADX INFO: renamed from: b8 */
    public c<Relationship> m3015b8(boolean z, boolean z2, final boolean z3, final boolean z4, @Nullable Map<String, String> map, final User user, String str, final LikeFrom likeFrom, boolean z5, @Nullable final LikeExtraData likeExtraData, int i, String str2, boolean z6, int i2, String str3, final boolean z7) {
        Map<String, String> map2;
        DclExtensions dclExtensions;
        if (likeExtraData == null || !NullChecker.a(likeExtraData.matchScData)) {
            map2 = map;
        } else {
            Map<String, String> map3 = !NullChecker.a(map) ? new HashMap<>() : map;
            map3.put("receiver_user_id", likeExtraData.matchScData.receiverUserId);
            map2 = map3;
        }
        final UserInfo userInfoM2997X5 = m2941J5(user) ? m2997X5(z, z3, z4, user, likeFrom, i, z6) : this.f3398f0;
        if (userInfoM2997X5 == null) {
            CrashHelper.c(new Exception("Like Api Error: Perhaps suggested users were cleared or reset when doing Swipe Card Animation"));
            return c.just(Relationship.new_());
        }
        if (userInfoM2997X5.liveLivingCardDataWrapper != null && userInfoM2997X5.isVirtualCard()) {
            userInfoM2997X5.f3461id = userInfoM2997X5.liveLivingCardDataWrapper.getOriginUserId();
        }
        final Relationship relationshipM2985U5 = m2985U5(z, z2, z3, z4, i2, userInfoM2997X5, str, likeFrom, str2, likeExtraData, str3);
        if (likeExtraData != null && (dclExtensions = likeExtraData.liveExtraInfo) != null) {
            relationshipM2985U5.dclExtensions = dclExtensions;
        }
        if (likeExtraData != null && !TextUtils.isEmpty(likeExtraData.profileLikeId)) {
            try {
                relationshipM2985U5.likeProfileId = Integer.parseInt(likeExtraData.profileLikeId);
                relationshipM2985U5.status.add(MatchFrom.get("profileLiked"));
            } catch (Exception unused) {
            }
        }
        if (TEnum.equals(likeFrom, "poi")) {
            if (relationshipM2985U5.dclExtensions == null) {
                relationshipM2985U5.dclExtensions = DclExtensions.new_();
            }
            relationshipM2985U5.dclExtensions.businessType = "Poi";
        }
        if (TEnum.equals(likeFrom, LikeFrom.get("instantChat"))) {
            if (relationshipM2985U5.relationshipExtensions == null) {
                relationshipM2985U5.relationshipExtensions = RelationshipExtensions.new_();
            }
            relationshipM2985U5.relationshipExtensions.business_type = "instantChat";
        }
        final Long lM3025e6 = m3025e6(relationshipM2985U5, likeFrom, i2, userInfoM2997X5.f3461id);
        final Map<String, String> map4 = map2;
        return this.f8580Q.scheduled("cardlike", -1, new v9j() { // from class: l.v1b
            public final Object call() {
                return this.f23908a.m3097z7(z3, userInfoM2997X5, relationshipM2985U5, map4, lM3025e6, z4, user, z7, likeExtraData, likeFrom);
            }
        }, z5);
    }

    /* JADX INFO: renamed from: b9 */
    public final void m3016b9(Throwable th, int i, long j) {
        o6j0.n("e_suggested_user_refresh", "p_suggest_users_home_view", new o6j0.a[]{o6j0.a.h("if_error", "YES"), o6j0.a.h("error_types", NullChecker.a(th) ? th.getMessage() : ""), o6j0.a.f("card_origin_count", 0), o6j0.a.f("card_filter_count", i), o6j0.a.h("last_start_refresh_timestamp", String.valueOf(this.f3422n0)), o6j0.a.h("last_end_refresh_timestamp", String.valueOf(this.f3425o0)), o6j0.a.h("start_refresh_timestamp", String.valueOf(this.f3428p0)), o6j0.a.h("end_refresh_timestamp", String.valueOf(this.f3431q0)), o6j0.a.h("end_refresh_server_timestamp", String.valueOf(j)), o6j0.a.f("card_available_count", 0)});
    }

    /* JADX INFO: renamed from: c6 */
    public final String m3017c6(String str) {
        if (!ura.m25555e().m25559d().m5735ak() && !ura.m25555e().m25559d().m5890yg()) {
            return str;
        }
        return str + "&fake_photo_feedback=true";
    }

    /* JADX INFO: renamed from: c7 */
    public final /* synthetic */ void m3018c7(Envelope envelope) {
        m3031f8(envelope, (CommonData) envelope.getModuleData(CommonData.class));
    }

    /* JADX INFO: renamed from: c8 */
    public c<roj0> m3019c8(final String str) {
        return this.f8580Q.scheduled("live_user_card_cancel_" + str, 0, new v9j() { // from class: l.b3b
            public final Object call() {
                return ia20.m16567a(new v9j() { // from class: l.u3b
                    public final Object call() {
                        return C0154a.f3483P.auth().q(C0154a.m3115C0(CoreModule.m1850H().userId(), str)).b();
                    }
                }).map(new w9j() { // from class: l.v3b
                    public final Object call(Object obj) {
                        return roj0.a;
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: c9 */
    public final void m3020c9(int i, int i2, long j, int i3) {
        o6j0.n("e_suggested_user_refresh", "p_suggest_users_home_view", new o6j0.a[]{o6j0.a.h("if_error", "NO"), o6j0.a.h("error_types", ""), o6j0.a.f("card_origin_count", i), o6j0.a.f("card_filter_count", i2), o6j0.a.h("last_start_refresh_timestamp", String.valueOf(this.f3422n0)), o6j0.a.h("last_end_refresh_timestamp", String.valueOf(this.f3425o0)), o6j0.a.h("start_refresh_timestamp", String.valueOf(this.f3428p0)), o6j0.a.h("end_refresh_timestamp", String.valueOf(this.f3431q0)), o6j0.a.h("end_refresh_server_timestamp", String.valueOf(j)), o6j0.a.f("card_available_count", i3)});
    }

    /* JADX INFO: renamed from: d6 */
    public final String m3021d6(String str) {
        return (!CoreModule.m1854P().m11713i().m19779N() || !ura.m25555e().m25559d().m5807kc() || TextUtils.isEmpty(str) || str.contains("fake_scene")) ? str : str.concat("&fake_scene=top_pop_max");
    }

    /* JADX WARN: Code duplicated, block: B:123:0x02e6  */
    /* JADX INFO: renamed from: d7 */
    public final /* synthetic */ roj0 m3022d7(boolean z, j760 j760Var) {
        int size;
        boolean z2;
        long j;
        List<UserInfo> list;
        String str;
        long j2;
        this.f3317C2 = false;
        char c = 2;
        this.f8580Q.f3652m0.f3433q2[2] = 1;
        final Envelope envelope = (Envelope) j760Var.a;
        if (ura.m25555e().m25559d().m5750d7()) {
            List list2 = envelope.getModuleData(CommonData.class).users;
            if (!vwb.J(list2)) {
                vwb.z(list2, new e30() { // from class: l.z1b
                    public final void call(Object obj) {
                        User user = (User) obj;
                        qib0.f19813k0.f23551d.cache(((DbObject) user).id, user);
                    }
                });
            }
            Counter counterM3414o3 = CoreModule.f1534c.m3414o3();
            Counter counter = envelope.counters;
            if (counterM3414o3 == null) {
                CoreModule.f1534c.m3404F3(counter);
            } else {
                counter.mergeData(CoreModule.f1534c.m3414o3());
                CoreModule.f1534c.m3404F3(envelope.counters);
            }
            C0158c c0158c = CoreModule.f1534c;
            c0158c.f3599U0.onNext(c0158c.m3414o3());
            e51.s(new Runnable() { // from class: l.b2b
                @Override // java.lang.Runnable
                public final void run() {
                    this.f8691a.m3018c7(envelope);
                }
            });
        }
        yni.d(LaunchStep.PreNet);
        ura.m25555e().m25559d().m5610Dg("suggested data transform to MainThread");
        this.f3425o0 = this.f3431q0;
        this.f3431q0 = System.currentTimeMillis();
        long jGuessedCurrentServerTime = qib0.f19784H.guessedCurrentServerTime();
        PartialListOpt partialListOpt = (PartialListOpt) this.f3383a0.e();
        List<UserInfo> arrayList = partialListOpt == null ? new ArrayList<>() : partialListOpt.loaded;
        int size2 = arrayList.size();
        if (z) {
            arrayList = new ArrayList<>();
            if (!vwb.J(envelope.getModuleData(CommonData.class).users)) {
                for (User user : envelope.getModuleData(CommonData.class).users) {
                    if (user != null && this.f3377Y.contains(((DbObject) user).id)) {
                        this.f3377Y.remove(((DbObject) user).id);
                    }
                }
            }
        } else if (!vwb.J(envelope.getModuleData(CommonData.class).users)) {
            for (final User user2 : envelope.getModuleData(CommonData.class).users) {
                if (user2 != null && user2.isRepeatUser() && !vwb.m(arrayList, new w9j() { // from class: l.c2b
                    public final Object call(Object obj) {
                        return Boolean.valueOf(((CoreSuggested.UserInfo) obj).f3461id.equals(((DbObject) user2).id));
                    }
                }) && this.f3377Y.contains(((DbObject) user2).id)) {
                    this.f3377Y.remove(((DbObject) user2).id);
                }
            }
        }
        if (this.f3404h0) {
            int iMin = Math.min(arrayList.size(), Math.max(this.f3374X, arrayList.size() - envelope.getModuleData(CommonData.class).users.size()));
            if (iMin >= 0 && iMin <= arrayList.size()) {
                Iterator<UserInfo> it = arrayList.subList(iMin, arrayList.size()).iterator();
                while (it.hasNext()) {
                    this.f3377Y.remove(it.next().f3461id);
                }
            }
            if (iMin == 0 && !vwb.J(arrayList) && C0156b.m3338b(arrayList.get(0).virtualCardType)) {
                this.f3409i2.onNext(SwipeDirection.REMOVE);
            }
            arrayList = arrayList.subList(0, iMin);
            this.f3404h0 = false;
        }
        this.f3374X = 2;
        this.f3371W = C0154a.f3483P.guessedCurrentServerTime();
        List<User> listM3321h = C0155a0.m3317j().m3321h(envelope.getModuleData(CommonData.class).users);
        List<SuggestedComplimentItem> list3 = envelope.getModuleData(CoreData.class).compliments;
        this.f3375X0.clear();
        if (!vwb.J(list3)) {
            for (SuggestedComplimentItem suggestedComplimentItem : list3) {
                if (NullChecker.a(suggestedComplimentItem) && !TextUtils.isEmpty(suggestedComplimentItem.senderId)) {
                    this.f3375X0.putIfAbsent(suggestedComplimentItem.senderId, suggestedComplimentItem);
                }
                c = c;
            }
        }
        char c2 = c;
        List<UserInfo> listM2917D5 = m2917D5(envelope, listM3321h);
        if (vwb.J(listM2917D5)) {
            size = 0;
            z2 = false;
        } else {
            arrayList.addAll(listM2917D5);
            Iterator<UserInfo> it2 = listM2917D5.iterator();
            while (it2.hasNext()) {
                this.f3377Y.add(it2.next().f3461id);
            }
            size = listM2917D5.size();
            z2 = true;
        }
        m2906A6(arrayList, listM3321h);
        this.f3437s0 = null;
        if (vwb.J(listM3321h)) {
            j = jGuessedCurrentServerTime;
        } else {
            SparseArray sparseArray = (SparseArray) j760Var.b;
            int i = 0;
            boolean z3 = false;
            boolean z4 = false;
            while (i < sparseArray.size()) {
                int iKeyAt = sparseArray.keyAt(i);
                UserInfo userInfo = (UserInfo) sparseArray.get(iKeyAt);
                if (userInfo.isIntlLikeLimitInsert) {
                    this.f3437s0 = userInfo;
                    j2 = jGuessedCurrentServerTime;
                } else {
                    j2 = jGuessedCurrentServerTime;
                    if (!this.f3377Y.contains(userInfo.f3461id)) {
                        int i2 = iKeyAt + size2;
                        if (arrayList.size() > i2) {
                            arrayList.add(i2, userInfo);
                        } else {
                            arrayList.add((UserInfo) sparseArray.get(iKeyAt));
                        }
                        if (!userInfo.isVirtualCard()) {
                            this.f3377Y.add(userInfo.f3461id);
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
                m3045j6();
            }
            if (z4) {
                this.f3400f2.onNext(Boolean.TRUE);
            }
        }
        if (vwb.J(arrayList)) {
            list = arrayList;
        } else {
            List<UserInfo> listC = sm90.b().c(this.f8580Q.f3628e0.m21490p9(), arrayList, this.f3377Y, listM3321h);
            if (vwb.J(listC)) {
                list = arrayList;
            } else {
                list = listC;
            }
        }
        m3069q8(list, listM3321h);
        m2918D6(list, listM3321h);
        if (!NullChecker.a(this.f3437s0) || vwb.J(list) || CoreModule.m1851K().counter_().likeLimit.remaining > 0) {
            str = null;
        } else {
            m2914C6(list, this.f3437s0);
            list.add(0, this.f3437s0);
            str = null;
            this.f3437s0 = null;
        }
        m3020c9(vwb.J(envelope.getModuleData(CommonData.class).users) ? 0 : envelope.getModuleData(CommonData.class).users.size(), list.size(), j, size);
        DbLinks dbLinksNew_ = DbLinks.new_();
        dbLinksNew_.links.next = z2 ? "" : str;
        if (z) {
            this.f3342L0.onNext(new PartialListOpt(list, dbLinksNew_));
            m3013b6(false);
        } else {
            if (ura.m25555e().m25559d().m5738ar()) {
                if (!ura.m25555e().m25559d().m5891yh()) {
                    ura.m25555e().m25559d().m5817ll(list);
                    this.f3389c0.onNext(roj0.a);
                    ura.m25555e().m25559d().m5746cp();
                } else if (!vwb.J(list)) {
                    ura.m25555e().m25559d().m5781hh(list);
                }
            }
            ura.m25555e().m25559d().m5610Dg("suggested data emmit");
            ura.m25555e().m25559d().m5823nj(list, envelope.getModuleData(CoreData.class).lives);
            ura.m25555e().m25559d().m5899zs(list, envelope.getModuleData(CoreData.class).voices);
            this.f3436r2 = "requested" + (System.currentTimeMillis() - this.f3428p0);
            CoreProviderInterface coreProviderInterfaceM25559d = ura.m25555e().m25559d();
            if (coreProviderInterfaceM25559d.m5816lk() || coreProviderInterfaceM25559d.m5651Kl()) {
                if (!CoreModule.f1534c.f3693z2.m2181p3() || ((pib.m21210V7() && !xma.m27355L3()) || vwb.J(list) || ((Boolean) CoreModule.f1534c.f3693z2.f3215e0.get()).booleanValue())) {
                    CoreModule.f1534c.f3693z2.f3211a0 = false;
                } else {
                    e51.G(new Runnable() { // from class: l.d2b
                        @Override // java.lang.Runnable
                        public final void run() {
                            lsi0.y("只为你推荐完成头像认证的用户");
                        }
                    });
                    CoreModule.f1534c.f3693z2.f3215e0.put(Boolean.TRUE);
                    CoreModule.f1534c.f3693z2.f3211a0 = true;
                }
            }
            yni.d(LaunchStep.PreNet_Op);
            this.f3383a0.onNext(new PartialListOpt(list, dbLinksNew_).setReason(PartialListOpt.RefreshReason.SUGGEST_LOAD));
        }
        if (ura.m25555e().m25559d().m5868u()) {
            if (ura.m25555e().m25559d().m5745c() && NullChecker.a(CoreModule.f1534c.f3628e0.m21490p9()) && CoreModule.f1534c.f3628e0.m21490p9().isFemale() && !CoreModule.f1534c.f3547D0.f4123Y && !ura.m25555e().m25559d().m5833oq()) {
                CoreModule.f1534c.f3547D0.f4123Y = true;
                c.timer(5L, TimeUnit.SECONDS).subscribe(new e30() { // from class: l.e2b
                    public final void call(Object obj) {
                        CoreModule.f1534c.f3547D0.m6779R4();
                    }
                });
            }
        } else if (ura.m25555e().m25559d().m5745c() && NullChecker.a(CoreModule.f1534c.f3628e0.m21490p9()) && CoreModule.f1534c.f3628e0.m21490p9().isFemale() && !CoreModule.f1534c.f3547D0.f4123Y && !ura.m25555e().m25559d().m5833oq()) {
            e51.G(new Runnable() { // from class: l.f2b
                @Override // java.lang.Runnable
                public final void run() {
                    CoreSuggested.m2836c4();
                }
            });
        }
        if (CoreModule.m1854P().m11711g().m6985b8()) {
            this.f8580Q.f3630e2.f10440U = new ArrayList();
            for (UserInfo userInfo2 : list) {
                if (userInfo2.isPinLike) {
                    UserWithRelationShip userWithRelationShipNew_ = UserWithRelationShip.new_();
                    userWithRelationShipNew_.userId = userInfo2.f3461id;
                    userWithRelationShipNew_.relationship = userInfo2.topLikeRelationship;
                    this.f8580Q.f3630e2.f10440U.add(userWithRelationShipNew_);
                }
            }
            dka dkaVar = this.f8580Q.f3630e2;
            Collections.sort(dkaVar.f10440U, dkaVar.f10449d0);
            this.f8580Q.f3630e2.m14077u3();
        }
        a<roj0> aVar = this.f3362T;
        roj0 roj0Var = roj0.a;
        aVar.onNext(roj0Var);
        this.f8580Q.f3652m0.f3433q2[c2] = 3;
        if (list.size() > 0 && this.f8580Q.f3652m0.f3311A2 == 0) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            CoreSuggested coreSuggested = this.f8580Q.f3652m0;
            coreSuggested.f3311A2 = jCurrentTimeMillis - coreSuggested.f3457y2;
            if (this.f8580Q.f3652m0.f3311A2 > 0 && this.f8580Q.f3652m0.f3460z2 > 0) {
                zvf0.B("e_homepage_network_and_layout", "p_suggest_users_home_view", new j760[]{new j760("suggest_network_time", Long.valueOf(this.f8580Q.f3652m0.f3311A2)), new j760("card_layout_time", Long.valueOf(this.f8580Q.f3652m0.f3460z2)), new j760("suggest_network_time_diff_card_layout_time", Long.valueOf(this.f8580Q.f3652m0.f3311A2 - this.f8580Q.f3652m0.f3460z2))});
            }
        }
        return roj0Var;
    }

    /* JADX INFO: renamed from: d8 */
    public c<roj0> m3023d8(final String str) {
        return this.f8580Q.scheduled("live_user_card_enter_" + str, 0, new v9j() { // from class: l.p2b
            public final Object call() {
                return ia20.m16567a(new v9j() { // from class: l.vza
                    public final Object call() {
                        return C0154a.f3483P.auth().q(C0154a.m3119D0(CoreModule.m1850H().userId(), str)).b();
                    }
                }).map(new w9j() { // from class: l.wza
                    public final Object call(Object obj) {
                        return roj0.a;
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: d9 */
    public void m3024d9() {
        if (this.f3383a0.e() != null) {
            Iterator it = ((PartialListOpt) this.f3383a0.e()).loaded.iterator();
            while (it.hasNext()) {
                UserInfo userInfo = (UserInfo) it.next();
                if (userInfo.picksGuideUser) {
                    this.f3377Y.remove(userInfo.f3461id);
                    it.remove();
                }
            }
        }
        ((PartialListOpt) this.f3383a0.e()).setRefreshValue(true);
        a<PartialListOpt<UserInfo>> aVar = this.f3383a0;
        aVar.onNext(((PartialListOpt) aVar.e()).setReason(PartialListOpt.RefreshReason.tryRemoveInsertedPicksUser));
    }

    /* JADX INFO: renamed from: e6 */
    public final Long m3025e6(Relationship relationship, LikeFrom likeFrom, int i, String str) {
        if (!NullChecker.a(relationship)) {
            return 0L;
        }
        boolean z = false;
        boolean z2 = !vwb.J(relationship.status) && relationship.status.contains(MatchFrom.get("superLiked"));
        boolean z3 = z2 && ura.m25555e().m25559d().m5788ig();
        if (!vwb.J(relationship.status) && relationship.status.contains(MatchFrom.get("letter"))) {
            z = true;
        }
        if (z2 && i > 1) {
            int iM5642J8 = ura.m25555e().m25559d().m5642J8();
            int iM5753dq = ura.m25555e().m25559d().m5753dq();
            if (ura.m25555e().m25559d().m5848qr(str) && i <= 3) {
                relationship.consumeType = "handsel";
            } else if (i <= iM5642J8 || ura.m25555e().m25559d().m5819m3()) {
                relationship.consumeType = "privilege";
            } else if (iM5642J8 <= 0 || i > iM5753dq) {
                relationship.consumeType = "coin";
            } else {
                relationship.consumeType = "all";
            }
        } else if (TEnum.equals(likeFrom, "greet")) {
            relationship.consumeType = "free";
        } else if (z) {
            if (xma.m27349D3()) {
                relationship.consumeType = "privilege";
            } else {
                relationship.consumeType = "coin";
            }
        } else if (TEnum.equals(likeFrom, "instantChat")) {
            relationship.consumeType = "privilege";
        } else {
            relationship.consumeType = xob.m27475i4(z3);
        }
        if (z2) {
            return CoreModule.f1534c.f3559H0.m27552s5(relationship.consumeType, SummarizedPrivilegesId.get("superLike"));
        }
        if (z) {
            return CoreModule.f1534c.f3559H0.m27552s5(relationship.consumeType, SummarizedPrivilegesId.get("letter"));
        }
        return null;
    }

    /* JADX INFO: renamed from: e7 */
    public final /* synthetic */ j760 m3026e7(String str, Envelope envelope) {
        j760 j760Var;
        HashMap mapD = vwb.d(envelope.getModuleData(CommonData.class).users, new w9j() { // from class: l.n2b
            public final Object call(Object obj) {
                return ((DbObject) ((User) obj)).id;
            }
        }, new w9j() { // from class: l.o2b
            public final Object call(Object obj) {
                return CoreSuggested.m2789G3((User) obj);
            }
        });
        List<DislikedUsers> list = envelope.getModuleData(CoreData.class).dislikedUsers;
        ArrayList arrayList = new ArrayList();
        if (TextUtils.isEmpty(str)) {
            this.f3380Z = new HashSet<>();
        }
        for (DislikedUsers dislikedUsers : list) {
            User user = (User) mapD.get(dislikedUsers.id);
            if (this.f3380Z.add(dislikedUsers.id) && NullChecker.a(user)) {
                dislikedUsers.userInfo = user;
                arrayList.add(dislikedUsers);
            }
        }
        j760 j760Var2 = (j760) this.f3356R.e();
        if (TextUtils.isEmpty(str) || !NullChecker.a(j760Var2) || vwb.J((Collection) j760Var2.b)) {
            j760Var = new j760(envelope.pagination.links, arrayList);
        } else {
            ((List) j760Var2.b).addAll(arrayList);
            j760Var = new j760(envelope.pagination.links, (List) j760Var2.b);
        }
        this.f3356R.onNext(j760Var);
        return j760Var;
    }

    /* JADX INFO: renamed from: e8 */
    public void m3027e8() {
        this.f3317C2 = true;
    }

    /* JADX INFO: renamed from: e9 */
    public void m3028e9() {
        scheduled("post_try_to_increase_see_list", -1, new v9j() { // from class: l.a2b
            public final Object call() {
                return this.f8072a.m2971Q7();
            }
        });
    }

    /* JADX INFO: renamed from: f6 */
    public void m3029f6(Links links) {
        final String str = (!NullChecker.a(links) || TextUtils.isEmpty(links.next)) ? "" : String.format("?%s", links.next);
        scheduled("get_dis_liked_users".concat(str), 0, new v9j() { // from class: l.w2b
            public final Object call() {
                return this.f24786a.m3030f7(str);
            }
        });
    }

    /* JADX INFO: renamed from: f7 */
    public final /* synthetic */ c m3030f7(final String str) {
        return ia20.m16567a(new v9j() { // from class: l.c1b
            public final Object call() {
                return C0154a.f3483P.auth().f().q(C0154a.m3130G("/disliked-users" + str)).b();
            }
        }).map(new w9j() { // from class: l.d1b
            public final Object call(Object obj) {
                return this.f9978a.m3026e7(str, (Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: f8 */
    public final void m3031f8(Envelope envelope, final CommonData commonData) {
        ura.m25555e().m25559d().m5610Dg("database merge suggested data start");
        LaunchStep launchStep = LaunchStep.PreNet_Db;
        yni.f(new LaunchStep[]{launchStep});
        this.f8580Q.m3424y3(envelope, new d30() { // from class: l.j3b
            public final void call() {
                CoreSuggested.m2796J4(commonData);
            }
        }, true, false, true);
        yni.d(launchStep);
        ura.m25555e().m25559d().m5610Dg("database merge suggested data end");
    }

    /* JADX INFO: renamed from: f9 */
    public c<Relationship> m3032f9(Map<String, String> map) {
        return m3036g9(true, null, map);
    }

    /* JADX INFO: renamed from: g6 */
    public a<j760<Links, List<DislikedUsers>>> m3033g6() {
        return this.f3356R;
    }

    /* JADX INFO: renamed from: g7 */
    public final /* synthetic */ void m3034g7(String str) {
        CoreModule.f1534c.f3652m0.m3008Z8(str, m2921E5(), true);
    }

    /* JADX INFO: renamed from: g8 */
    public final boolean m3035g8(UserInfo userInfo, UserInfo userInfo2) {
        return NullChecker.a(userInfo2) && NullChecker.a(userInfo) && userInfo2.f3461id.equals(UserInfo.VIRTUAL_CARD) && userInfo2.virtualCardType != userInfo.virtualCardType;
    }

    /* JADX INFO: renamed from: g9 */
    public c<Relationship> m3036g9(final boolean z, e30<String> e30Var, final Map<String, String> map) {
        User user = this.f3407i0;
        if (user == null || this.f3410j0 == null) {
            return null;
        }
        final User userClone = user.clone();
        final UserInfo userInfoM28959clone = this.f3410j0.m28959clone();
        if (e30Var != null) {
            e30Var.call(userInfoM28959clone.f3461id);
        }
        if (userInfoM28959clone.meetAgain) {
            userInfoM28959clone.isUndo = true;
            if (!z) {
                userInfoM28959clone.preSwipedDirection = null;
            }
            m3084w6(userInfoM28959clone, 0);
            m2961O5();
            return c.just(userClone.localRelationship);
        }
        final Relationship relationship = new Relationship();
        relationship.state = RelationshipStatus.get(CameraSticker.CATEGORY_DEFAULT_FILTER);
        User userM21393Pa = CoreModule.f1534c.f3628e0.m21393Pa(((DbObject) userClone).id);
        if (NullChecker.a(userM21393Pa) && !TextUtils.isEmpty(userM21393Pa.ussTracker)) {
            relationship.ussTracker = userM21393Pa.ussTracker;
        }
        return this.f8580Q.scheduled("undo", -1, new v9j() { // from class: l.x2b
            public final Object call() {
                return this.f25679a.m2983T7(userClone, relationship, map, userInfoM28959clone, z);
            }
        });
    }

    /* JADX INFO: renamed from: h6 */
    public HashMap<String, SuggestedComplimentItem> m3037h6() {
        return this.f3375X0;
    }

    /* JADX INFO: renamed from: h7 */
    public final /* synthetic */ void m3038h7(Envelope envelope) {
        this.f8580Q.m3424y3(envelope, null, true, false, true);
    }

    /* JADX INFO: renamed from: h8 */
    public final void m3039h8(String str) {
        if (this.f3383a0.e() == null) {
            return;
        }
        ((PartialListOpt) this.f3383a0.e()).setRefreshValue(true);
        a<PartialListOpt<UserInfo>> aVar = this.f3383a0;
        aVar.onNext(((PartialListOpt) aVar.e()).setReasonStr(PartialListOpt.RefreshReason.NOTIFY_INNER.getReason() + "_" + str));
    }

    /* JADX INFO: renamed from: h9 */
    public c<roj0> m3040h9() {
        return this.f3326F2;
    }

    /* JADX INFO: renamed from: i6 */
    public void m3041i6(final String str) {
        c.just(str).filter(new w9j() { // from class: l.i1b
            public final Object call(Object obj) {
                return Boolean.valueOf(!CoreModule.f1534c.f3652m0.f3434r0.contains((String) obj));
            }
        }).map(new w9j() { // from class: l.j1b
            public final Object call(Object obj) {
                return CoreSuggested.m2834b5(str, (String) obj);
            }
        }).subscribe(mkd0.H(new e30() { // from class: l.k1b
            public final void call(Object obj) {
                this.f15545a.m3034g7((String) obj);
            }
        }, new e30() { // from class: l.l1b
            public final void call(Object obj) {
                CoreSuggested.m2853i3((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: i7 */
    public final /* synthetic */ Envelope m3042i7(Envelope envelope) {
        this.f8580Q.m3422w3(envelope, null);
        return envelope;
    }

    /* JADX INFO: renamed from: i8 */
    public void m3043i8() {
        this.f3323E2.onNext(roj0.a);
    }

    /* JADX INFO: renamed from: i9 */
    public c<roj0> m3044i9(final String str) {
        return this.f8580Q.scheduled("voice_user_card_cancel_" + str, 0, new v9j() { // from class: l.p3b
            public final Object call() {
                return ia20.m16567a(new v9j() { // from class: l.g4b
                    public final Object call() {
                        return C0154a.f3483P.auth().q(C0154a.m3115C0(CoreModule.m1850H().userId(), str) + "?type=voice").b();
                    }
                }).map(new w9j() { // from class: l.h4b
                    public final Object call(Object obj) {
                        return roj0.a;
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: j6 */
    public final void m3045j6() {
        CoreModule.f1534c.f3676u0.m2331N6(25, true).subscribe(mkd0.H(new e30() { // from class: l.f0b
            public final void call(Object obj) {
                CoreModule.f1534c.f3676u0.f3224R = (List) ((j760) obj).b;
            }
        }, new e30() { // from class: l.g0b
            public final void call(Object obj) {
                CoreSuggested.m2864l5((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: j7 */
    public final /* synthetic */ roj0 m3046j7(Envelope envelope) {
        ArrayList arrayList = new ArrayList();
        for (User user : envelope.getModuleData(CommonData.class).users) {
            arrayList.add(new C0153e(((DbObject) user).id, user.popLevel));
        }
        Collections.sort(arrayList);
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((C0153e) it.next()).f3466a);
        }
        DbLinks dbLinksNew_ = DbLinks.new_();
        dbLinksNew_.links.next = "";
        this.f3332H2.onNext(new q860(arrayList2, dbLinksNew_));
        if (!vwb.J(this.f3377Y) && !vwb.J(arrayList)) {
            this.f3377Y.remove(((C0153e) arrayList.get(0)).f3466a);
        }
        return roj0.a;
    }

    /* JADX INFO: renamed from: j8 */
    public final void m3047j8(final Notification<Envelope> notification, boolean z, final boolean z2, final UserInfo userInfo, final User user) {
        Relationship relationship;
        if (!notification.j() && notification.k()) {
            User userM21396Q9 = CoreModule.f1534c.f3628e0.m21396Q9(userInfo.f3461id);
            final ConversationStatus conversationStatus = (userM21396Q9 == null || (relationship = userM21396Q9.localRelationship) == null) ? ConversationStatus.get(CameraSticker.CATEGORY_DEFAULT_FILTER) : relationship.conversationStatus;
            RelationshipStatus relationshipStatus = RelationshipStatus.get("unknown_");
            if (vwb.J(((Envelope) notification.f()).getModuleData(CoreData.class).relationships)) {
                CrashHelper.i(new Exception("return null relationships"), "core_like", CrashHelper.ReportLevel.p5, 100);
            } else {
                relationshipStatus = ((Relationship) ((Envelope) notification.f()).getModuleData(CoreData.class).relationships.get(0)).state;
            }
            if (TEnum.equals(relationshipStatus, "matched")) {
                ArrayList arrayList = new ArrayList();
                boolean z3 = (vwb.J(((Envelope) notification.f()).getModuleData(CoreData.class).relationships) || vwb.J(((Relationship) ((Envelope) notification.f()).getModuleData(CoreData.class).relationships.get(0)).status)) ? false : true;
                if (z3 && ((Relationship) ((Envelope) notification.f()).getModuleData(CoreData.class).relationships.get(0)).status.contains(MatchFrom.get("letter"))) {
                    arrayList.add(MatchFrom.get("letter"));
                }
                if (z2 && userM21396Q9 != null && userM21396Q9.superLikedMe()) {
                    arrayList.add(MatchFrom.get("superLikedEach"));
                } else if (z2 || (userM21396Q9 != null && userM21396Q9.superLikedMe())) {
                    arrayList.add(MatchFrom.get("superLiked"));
                }
                if (userM21396Q9 != null && userM21396Q9.boosted()) {
                    arrayList.add(MatchFrom.get("boosted"));
                }
                if (ura.m25555e().m25559d().m5745c() && userM21396Q9 != null && userM21396Q9.onlineMatch()) {
                    arrayList.add(MatchFrom.get("quickchat"));
                }
                if (z3 && ((Relationship) ((Envelope) notification.f()).getModuleData(CoreData.class).relationships.get(0)).status.contains(MatchFrom.get("secretcrush"))) {
                    arrayList.add(MatchFrom.get("secretcrush"));
                }
                if (z3 && ((Relationship) ((Envelope) notification.f()).getModuleData(CoreData.class).relationships.get(0)).status.contains(MatchFrom.get("online")) && !arrayList.contains(MatchFrom.get("online"))) {
                    arrayList.add(MatchFrom.get("online"));
                }
                if (z3 && ((Relationship) ((Envelope) notification.f()).getModuleData(CoreData.class).relationships.get(0)).status.contains(MatchFrom.get("boosted")) && !arrayList.contains(MatchFrom.get("boosted"))) {
                    arrayList.add(MatchFrom.get("boosted"));
                }
                if (z3 && ((Relationship) ((Envelope) notification.f()).getModuleData(CoreData.class).relationships.get(0)).status.contains(MatchFrom.get("vipseen")) && !arrayList.contains(MatchFrom.get("vipseen"))) {
                    arrayList.add(MatchFrom.get("vipseen"));
                }
                if (z3 && ((Relationship) ((Envelope) notification.f()).getModuleData(CoreData.class).relationships.get(0)).status.contains(MatchFrom.get("diamondReceived")) && !arrayList.contains(MatchFrom.get("diamondReceived"))) {
                    arrayList.add(MatchFrom.get("diamondReceived"));
                }
                if (z3 && ((Relationship) ((Envelope) notification.f()).getModuleData(CoreData.class).relationships.get(0)).status.contains(MatchFrom.get("diamondGiven")) && !arrayList.contains(MatchFrom.get("diamondGiven"))) {
                    arrayList.add(MatchFrom.get("diamondGiven"));
                }
                if (z3) {
                    ((Relationship) ((Envelope) notification.f()).getModuleData(CoreData.class).relationships.get(0)).status = arrayList;
                }
                if (user == null && this.f3407i0 != null && !vwb.J(((Envelope) notification.f()).getModuleData(CoreData.class).relationships) && ((DbObject) this.f3407i0).id.equals(((Relationship) ((Envelope) notification.f()).getModuleData(CoreData.class).relationships.get(0)).id)) {
                    m2961O5();
                }
            } else if (user == null && this.f3407i0 != null && !vwb.J(((Envelope) notification.f()).getModuleData(CoreData.class).relationships) && ((DbObject) this.f3407i0).id.equals(((Relationship) ((Envelope) notification.f()).getModuleData(CoreData.class).relationships.get(0)).id)) {
                this.f3410j0.canUndo = true;
            }
            if (z2) {
                ura.m25555e().m25559d().m5724Y7((Envelope) notification.f(), "relationship");
            }
            this.f8580Q.m3422w3((Envelope) notification.f(), new d30() { // from class: l.y3b
                public final void call() {
                    this.f27992a.m2907A7(notification, userInfo, user, conversationStatus, z2);
                }
            });
            this.f8580Q.f3676u0.m2416w7(userInfo.f3461id);
        }
    }

    /* JADX INFO: renamed from: j9 */
    public c<roj0> m3048j9() {
        return CoreModule.f1534c.wait("settings", -1);
    }

    /* JADX INFO: renamed from: k6 */
    public c<UserInfo> m3049k6() {
        return scheduled("getLiveDiversionCardInfo", 0, new v9j() { // from class: l.y2b
            public final Object call() {
                return ia20.m16571e(new v9j() { // from class: l.e0b
                    public final Object call() {
                        return C0154a.f3483P.auth().f().q(C0154a.m3130G("/users?search=liveInsert")).b();
                    }
                });
            }
        }).doOnNext(new e30() { // from class: l.z2b
            public final void call(Object obj) {
                this.f28564a.m3038h7((Envelope) obj);
            }
        }).map(new C0149a()).compose(C0154a.m3182T2());
    }

    /* JADX INFO: renamed from: k7 */
    public final /* synthetic */ c m3050k7() {
        return new la20(new v9j() { // from class: l.l4b
            public final Object call() {
                return C0154a.f3483P.auth().q(C0154a.m3224e2(CoreModule.m1850H().userId())).b();
            }
        }).map(new w9j() { // from class: l.m4b
            public final Object call(Object obj) {
                return this.f16794a.m3042i7((Envelope) obj);
            }
        }).compose(mkd0.C()).map(new w9j() { // from class: l.n4b
            public final Object call(Object obj) {
                return this.f17475a.m3046j7((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: k8 */
    public c<roj0> m3051k8(SettingGroups settingGroups) {
        return m3054l8(settingGroups, false);
    }

    /* JADX INFO: renamed from: l6 */
    public final int m3052l6() {
        return this.f3413k0;
    }

    /* JADX INFO: renamed from: l7 */
    public final /* synthetic */ roj0 m3053l7(StringBuilder sb, long j, Envelope envelope) {
        ActionData actionData = envelope.getModuleData(CoreData.class).action;
        ArrayList arrayList = new ArrayList();
        du2.a("[See_Toast]", "net work back data done");
        if (NullChecker.a(actionData)) {
            du2.a("[See_Toast]", "net work back data detail: " + sb.toString() + " , " + actionData.traceId);
            ActionPageFormat actionPageFormat = actionData.pageFormat;
            List<CardPattern> list = actionPageFormat.cardPatterns;
            List list2 = actionPageFormat.cardOptions;
            List list3 = envelope.getModuleData(CommonData.class).users;
            List list4 = envelope.getModuleData(CoreData.class).cardExtraInfos;
            List list5 = envelope.getModuleData(CoreData.class).cardStyles;
            List list6 = envelope.getModuleData(CoreData.class).likedMes;
            List list7 = envelope.getModuleData(CoreData.class).cityCData;
            for (final CardPattern cardPattern : list) {
                User user = (User) vwb.r(list3, new w9j() { // from class: l.q2b
                    public final Object call(Object obj) {
                        return Boolean.valueOf(((DbObject) ((User) obj)).id.equals(cardPattern.userId));
                    }
                });
                UserAction userAction = (UserAction) vwb.r(list2, new w9j() { // from class: l.r2b
                    public final Object call(Object obj) {
                        return Boolean.valueOf(((UserAction) obj).userId.equals(cardPattern.userId));
                    }
                });
                if (NullChecker.a(user)) {
                    cardPattern.cover = user.fp().profileMiddle().formatted();
                    if (NullChecker.a(userAction)) {
                        cardPattern.cardOptions = userAction.options;
                    }
                    arrayList.add(cardPattern);
                }
            }
            for (final ActionInsertPosition actionInsertPosition : actionData.insertFormat.insertPosition) {
                CardExtraInfo cardExtraInfo = (CardExtraInfo) vwb.r(list4, new w9j() { // from class: l.s2b
                    public final Object call(Object obj) {
                        return Boolean.valueOf(((CardExtraInfo) obj).userId.equals(actionInsertPosition.userId));
                    }
                });
                CardStyle cardStyle = (CardStyle) vwb.r(list5, new w9j() { // from class: l.t2b
                    public final Object call(Object obj) {
                        return Boolean.valueOf(((CardStyle) obj).userId.equals(actionInsertPosition.userId));
                    }
                });
                CardStyle cardStyle2 = (CardStyle) vwb.r(list6, new w9j() { // from class: l.u2b
                    public final Object call(Object obj) {
                        return Boolean.valueOf(((CardStyle) obj).userId.equals(actionInsertPosition.userId));
                    }
                });
                CityCData cityCData = (CityCData) vwb.r(list7, new w9j() { // from class: l.v2b
                    public final Object call(Object obj) {
                        return Boolean.valueOf(((CityCData) obj).userId.equals(actionInsertPosition.userId));
                    }
                });
                if (NullChecker.a(cardStyle)) {
                    actionInsertPosition.cardStyle = cardStyle;
                }
                if (NullChecker.a(cardStyle2)) {
                    actionInsertPosition.likedMe = cardStyle2;
                }
                if (NullChecker.a(cardExtraInfo)) {
                    actionInsertPosition.cardExtraInfo = cardExtraInfo;
                }
                actionInsertPosition.cityCData = cityCData;
            }
            if (NullChecker.a(actionData.toastStyle) && !vwb.J(list3)) {
                actionData.toastStyle.localReportId = ((DbObject) ((User) list3.get(0))).id;
            }
            actionData.pageFormat.cardPatterns = arrayList;
            actionData.dataTime = j;
            this.f3386b0.onNext(actionData);
        }
        return roj0.a;
    }

    /* JADX INFO: renamed from: l8 */
    public c<roj0> m3054l8(SettingGroups settingGroups, final boolean z) {
        m2913C5();
        return CoreModule.f1534c.f3628e0.m21344D9(settingGroups).doOnNext(new e30() { // from class: l.s3b
            public final void call(Object obj) {
                this.f21001a.m2911B7(z, (roj0) obj);
            }
        }).doOnError(new e30() { // from class: l.d4b
            public final void call(Object obj) {
                this.f10012a.m2915C7(z, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: renamed from: m6 */
    public int m3055m6() {
        return Integer.min(this.f3416l0, ura.m25555e().m25559d().m5889y6());
    }

    /* JADX INFO: renamed from: m7 */
    public final /* synthetic */ c m3056m7(final StringBuilder sb, final String str, final long j) {
        return new la20(new v9j() { // from class: l.r1b
            public final Object call() {
                return C0154a.f3483P.auth().q(C0154a.m3130G(sb.toString())).l(utc0.create(Network.JSON, str)).b();
            }
        }).doOnNext(new e30() { // from class: l.s1b
            public final void call(Object obj) {
                this.f20974a.m3059n7((Envelope) obj);
            }
        }).compose(C0154a.m3182T2()).map(new w9j() { // from class: l.t1b
            public final Object call(Object obj) {
                return this.f21803a.m3053l7(sb, j, (Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: m8 */
    public c<roj0> m3057m8() {
        return m3060n8(false);
    }

    /* JADX INFO: renamed from: n6 */
    public c<roj0> m3058n6() {
        C0155a0.m3317j().m3324l();
        return this.f8580Q.scheduled("get_see_special_card", 0, new v9j() { // from class: l.k3b
            public final Object call() {
                return this.f15583a.m3050k7();
            }
        });
    }

    /* JADX INFO: renamed from: n7 */
    public final /* synthetic */ void m3059n7(Envelope envelope) {
        this.f8580Q.m3424y3(envelope, null, true, false, true);
    }

    /* JADX INFO: renamed from: n8 */
    public final c<roj0> m3060n8(final boolean z) {
        ura.m25555e().m25559d().m5610Dg("startPoll");
        this.f3320D2.onNext(roj0.a);
        if (z) {
            return m3005Z5(z);
        }
        CoreLikers.LikersTriggerBy likersTriggerBy = CoreLikers.LikersTriggerBy.home_new_liker_float;
        long jLongValue = ((Long) this.f8580Q.f3676u0.f3245m0.get()).longValue();
        if (ura.m25555e().m25559d().m5768g8()) {
            likersTriggerBy = CoreLikers.LikersTriggerBy.home_total_liker_float;
        }
        final a aVarB = a.b();
        this.f8580Q.f3676u0.m2359b7(jLongValue, likersTriggerBy, false).materialize().subscribe(mkd0.G(new e30() { // from class: l.p1b
            public final void call(Object obj) {
                this.f18549a.m2919D7(z, aVarB, (Notification) obj);
            }
        }));
        return aVarB;
    }

    /* JADX INFO: renamed from: o6 */
    public int m3061o6() {
        if (m2930G6()) {
            return 0;
        }
        return ((PartialListOpt) this.f3383a0.e()).loaded.size();
    }

    /* JADX INFO: renamed from: o8 */
    public void m3063o8() {
        this.f3317C2 = true;
        m2949L5();
    }

    /* JADX INFO: renamed from: p6 */
    public final String m3064p6() {
        String strM3017c6 = m3017c6(m2905A5(m2909B5(m3021d6(C0154a.m3256m2(this.f3367U1)))));
        return (ura.m25555e().m25559d().m5816lk() && CoreModule.f1534c.f3693z2.m2183r3()) ? C0154a.m3130G("/users?search=selected&mode=free_real_user") : strM3017c6;
    }

    /* JADX INFO: renamed from: p7 */
    public final /* synthetic */ void m3065p7(boolean[] zArr, Portrait portrait) {
        if (TextUtils.isEmpty(portrait.userId)) {
            return;
        }
        m2924E8(portrait.userId);
        zArr[0] = true;
    }

    /* JADX INFO: renamed from: p8 */
    public c<roj0> m3066p8(boolean z) {
        return (this.f3383a0.e() == null || !z) ? just() : m3060n8(true);
    }

    /* JADX INFO: renamed from: q6 */
    public String m3067q6() {
        return (!NullChecker.a(this.f3383a0.e()) || vwb.J(((PartialListOpt) this.f3383a0.e()).loaded)) ? "" : ((UserInfo) ((PartialListOpt) this.f3383a0.e()).loaded.get(0)).f3461id;
    }

    /* JADX INFO: renamed from: q7 */
    public final /* synthetic */ void m3068q7(final boolean[] zArr, SeePortrait seePortrait) {
        if (!vwb.J(seePortrait.portraits)) {
            vwb.z(seePortrait.portraits, new e30() { // from class: l.t0b
                public final void call(Object obj) {
                    this.f21790a.m3065p7(zArr, (Portrait) obj);
                }
            });
        }
        zArr[0] = zArr[0] && !seePortrait.reachedMaxNum;
    }

    /* JADX INFO: renamed from: q8 */
    public final void m3069q8(List<UserInfo> list, List<User> list2) {
        int iIndexOf;
        if (this.f3355Q1 || vwb.J(list)) {
            return;
        }
        this.f3355Q1 = true;
        Counter counter = this.f8580Q.f3596T0;
        CounterLikeLimit counterLikeLimit = counter == null ? null : counter.likeLimit;
        if (counterLikeLimit == null || counterLikeLimit.remaining != 0 || counterLikeLimit.resetNowMillis() <= 0) {
            return;
        }
        String str = "";
        int i = 0;
        for (User user : list2) {
            int i2 = user.popLevel;
            if (i2 > i) {
                str = ((DbObject) user).id;
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
            if (!next.isVirtualCard() && next.f3461id.equals(str)) {
                iIndexOf = list.indexOf(next);
                break;
            }
        }
        if (iIndexOf != 0) {
            Collections.swap(list, 0, iIndexOf);
        }
    }

    /* JADX INFO: renamed from: r6 */
    public UserInfo m3070r6() {
        if (!NullChecker.a(this.f3383a0.e()) || vwb.J(((PartialListOpt) this.f3383a0.e()).loaded)) {
            return null;
        }
        return (UserInfo) ((PartialListOpt) this.f3383a0.e()).loaded.get(0);
    }

    /* JADX INFO: renamed from: r7 */
    public final /* synthetic */ Boolean m3071r7(Envelope envelope) {
        List list = envelope.getModuleData(CoreData.class).seePortraits;
        final boolean[] zArr = {false};
        if (!vwb.J(list)) {
            vwb.z(list, new e30() { // from class: l.l0b
                public final void call(Object obj) {
                    this.f16129a.m3068q7(zArr, (SeePortrait) obj);
                }
            });
        }
        return Boolean.valueOf(zArr[0]);
    }

    /* JADX INFO: renamed from: r8 */
    public final User m3072r8() {
        return this.f3407i0;
    }

    /* JADX INFO: renamed from: s6 */
    public c<roj0> m3073s6(String str, String str2, String str3) {
        String str4;
        String strDm;
        final long jGuessedCurrentServerTime = qib0.f19784H.guessedCurrentServerTime();
        final StringBuilder sb = new StringBuilder();
        if (TextUtils.isEmpty(str2)) {
            sb.append(String.format("/cards?mode=%s", str));
            str4 = "users/suggested/passive/insert";
        } else {
            if (jGuessedCurrentServerTime - this.f3338J2 < f3308N2) {
                return c.just(roj0.a);
            }
            sb.append(String.format("/cards?mode=%s&type=%s", str, str2));
            this.f3338J2 = qib0.f19784H.guessedCurrentServerTime();
            str4 = "users/suggested/active/insert";
        }
        Act actD = c30.d();
        if (actD != null || this.f3341K2) {
            strDm = CoreModule.m1851K().isMainPage(actD) ? CoreModule.m1851K().Dm() : "other";
        } else {
            this.f3341K2 = true;
            strDm = "cold";
        }
        sb.append(String.format("&tab=%s", strDm));
        if (str3 == null) {
            str3 = "";
        }
        final String str5 = str3;
        return this.f8580Q.scheduled(str4, 0, new v9j() { // from class: l.e1b
            public final Object call() {
                return this.f10720a.m3056m7(sb, str5, jGuessedCurrentServerTime);
            }
        });
    }

    /* JADX INFO: renamed from: s7 */
    public final /* synthetic */ c m3074s7(final int i, final UserInfo userInfo) {
        return c.fromCallable(new Callable() { // from class: l.k2b
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f15563a.m3077t7(i, userInfo);
            }
        }).compose(C0154a.m3182T2()).doOnNext(new e30() { // from class: l.m2b
            public final void call(Object obj) {
                this.f16769a.m3079u7(i, userInfo, (roj0) obj);
            }
        });
    }

    /* JADX INFO: renamed from: s8 */
    public final UserInfo m3075s8() {
        return this.f3410j0;
    }

    /* JADX INFO: renamed from: t6 */
    public void m3076t6(final UserInfo userInfo, final int i, final boolean z) {
        e51.G(new Runnable() { // from class: l.o0b
            @Override // java.lang.Runnable
            public final void run() {
                this.f17958a.m3062o7(userInfo, i, z);
            }
        });
    }

    /* JADX INFO: renamed from: t7 */
    public final /* synthetic */ roj0 m3077t7(int i, UserInfo userInfo) throws Exception {
        User userM21396Q9;
        if (!userInfo.isVirtualCard() && (userM21396Q9 = this.f8580Q.f3628e0.m21396Q9(userInfo.f3461id)) != null && userM21396Q9.hasPic()) {
            Picture.ImageUri imageUriM5719Xf = ura.m25555e().m25559d().m5719Xf(userM21396Q9.media(0));
            if (i == 0) {
                qib0.f19782G.m12787u0(imageUriM5719Xf);
            } else {
                qib0.f19782G.m12792z0(imageUriM5719Xf);
            }
        }
        return roj0.a;
    }

    /* JADX INFO: renamed from: u6, reason: merged with bridge method [inline-methods] */
    public final void m3062o7(UserInfo userInfo, int i, boolean z) {
        if (!NullChecker.a(this.f3383a0.e()) || vwb.J(((PartialListOpt) this.f3383a0.e()).loaded)) {
            return;
        }
        ((PartialListOpt) this.f3383a0.e()).setRefreshValue(true);
        List list = ((PartialListOpt) this.f3383a0.e()).loaded;
        if (z && !vwb.J(list)) {
            ListIterator listIterator = list.listIterator();
            while (listIterator.hasNext()) {
                UserInfo userInfo2 = (UserInfo) listIterator.next();
                if (NullChecker.a(userInfo2) && TextUtils.equals(userInfo2.f3461id, userInfo.f3461id) && userInfo.virtualCardType == userInfo2.virtualCardType) {
                    listIterator.remove();
                }
            }
        }
        if (i < 0 || i > list.size()) {
            ((PartialListOpt) this.f3383a0.e()).setRefreshValue(true);
            a<PartialListOpt<UserInfo>> aVar = this.f3383a0;
            aVar.onNext(((PartialListOpt) aVar.e()).setReason(PartialListOpt.RefreshReason.INSERT_LOCAL_BREAK));
        } else {
            list.add(i, userInfo);
            ((PartialListOpt) this.f3383a0.e()).setRefreshValue(true);
            a<PartialListOpt<UserInfo>> aVar2 = this.f3383a0;
            aVar2.onNext(((PartialListOpt) aVar2.e()).setReason(PartialListOpt.RefreshReason.INSERT_LOCAL_FINAL));
        }
    }

    /* JADX INFO: renamed from: u7 */
    public final /* synthetic */ void m3079u7(int i, UserInfo userInfo, roj0 roj0Var) {
        boolean z;
        this.f3404h0 = false;
        PartialListOpt partialListOpt = (PartialListOpt) this.f3383a0.e();
        List arrayList = partialListOpt == null ? new ArrayList() : partialListOpt.loaded;
        if (userInfo.isVirtualCard()) {
            z = false;
        } else {
            Iterator it = arrayList.iterator();
            z = false;
            while (it.hasNext()) {
                UserInfo userInfo2 = (UserInfo) it.next();
                if (NullChecker.a(userInfo2) && userInfo2.f3461id.equals(userInfo.f3461id) && !m3035g8(userInfo, userInfo2)) {
                    it.remove();
                    z = true;
                }
            }
        }
        if (!userInfo.isVirtualCard()) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                if (TextUtils.equals(userInfo.f3461id, ((UserInfo) it2.next()).f3461id)) {
                    CrashHelper.c(new Exception("repeat suggested card"));
                    if (z && ura.m25555e().m25559d().m5699V6()) {
                        m3039h8("repeat suggested card");
                        return;
                    }
                    return;
                }
            }
        }
        if (ura.m25555e().m25559d().m5699V6() && userInfo.isVirtualCard()) {
            VirtualCardType virtualCardType = userInfo.virtualCardType;
            VirtualCardType virtualCardType2 = VirtualCardType.OnlineMatchBroadcastCard;
            if (virtualCardType == virtualCardType2 && !vwb.J(arrayList) && ((UserInfo) arrayList.get(0)).isVirtualCard() && ((UserInfo) arrayList.get(0)).virtualCardType == virtualCardType2) {
                if (z && ura.m25555e().m25559d().m5699V6()) {
                    m3039h8("same quickChat Insert");
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
        this.f3377Y.add(userInfo.f3461id);
        if (CoreModule.m1854P().m11711g().m6985b8()) {
            if (vwb.J(this.f8580Q.f3630e2.f10440U)) {
                this.f8580Q.f3630e2.f10440U = new ArrayList();
            }
            if (userInfo.isPinLike) {
                UserWithRelationShip userWithRelationShipNew_ = UserWithRelationShip.new_();
                userWithRelationShipNew_.userId = userInfo.f3461id;
                userWithRelationShipNew_.relationship = userInfo.topLikeRelationship;
                this.f8580Q.f3630e2.f10440U.add(userWithRelationShipNew_);
            }
            dka dkaVar = this.f8580Q.f3630e2;
            Collections.sort(dkaVar.f10440U, dkaVar.f10449d0);
            this.f8580Q.f3630e2.m14077u3();
        }
        DbLinks dbLinksNew_ = DbLinks.new_();
        dbLinksNew_.links.next = "";
        this.f3383a0.onNext(new PartialListOpt(arrayList, dbLinksNew_).setReason(PartialListOpt.RefreshReason.INSERT_USER_CARD));
    }

    /* JADX INFO: renamed from: u8 */
    public c<roj0> m3080u8(final User user, boolean z) {
        final String str = String.format("{\"status\":\"%s\",\"swipedTime\":\"%s\"}", z ? "liked" : "disliked", Converter.dateToApiTimeString(mqi0.o()));
        return scheduled("reSwipe_" + ((DbObject) user).id, -1, new v9j() { // from class: l.g2b
            public final Object call() {
                return ia20.m16571e(new v9j() { // from class: l.tza
                    public final Object call() {
                        return C0154a.f3483P.auth().q(C0154a.m3141I2("/chat-relations/" + ((DbObject) user).id)).m(utc0.create(Network.JSON, str)).b();
                    }
                }).map(new w9j() { // from class: l.uza
                    public final Object call(Object obj) {
                        return roj0.a;
                    }
                }).observeOn(jo0.a());
            }
        });
    }

    /* JADX INFO: renamed from: v6 */
    public c<Boolean> m3081v6() {
        return this.f8580Q.scheduled("see-portraits-post", 0, new v9j() { // from class: l.yza
            public final Object call() {
                return ia20.m16567a(new v9j() { // from class: l.n0b
                    public final Object call() {
                        return C0154a.f3483P.auth().q(C0154a.m3143J0("/see-portraits")).l(utc0.create(Network.JSON, "")).b();
                    }
                });
            }
        }).doOnError(new e30() { // from class: l.zza
            public final void call(Object obj) {
                ((Throwable) obj).getMessage();
            }
        }).map(new w9j() { // from class: l.a0b
            public final Object call(Object obj) {
                return this.f8039a.m3071r7((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: v7 */
    public final /* synthetic */ void m3082v7(Envelope envelope) {
        m2929G5(envelope);
        if (ConnectivityReceiver.i()) {
            vwb.z(vwb.E(envelope.getModuleData(CommonData.class).users), new e30() { // from class: l.z3b
                public final void call(Object obj) {
                    CoreSuggested.m2829a3((User) obj);
                }
            });
        }
        this.f8580Q.m3422w3(envelope, null);
    }

    /* JADX INFO: renamed from: v8 */
    public void m3083v8(MissMatch missMatch) {
        if (missMatch.version > ((Integer) this.f3345M0.get()).intValue()) {
            this.f3345M0.put(Integer.valueOf(missMatch.version));
            this.f3354Q0.put(0);
            this.f3352P0.put(0L);
        }
    }

    /* JADX INFO: renamed from: w6 */
    public c<roj0> m3084w6(final UserInfo userInfo, final int i) {
        if (i == 0 && C0163e0.m3879a().m3884e()) {
            i = 1;
        }
        return this.f8580Q.scheduled("users/suggested/insert", 0, new v9j() { // from class: l.w1b
            public final Object call() {
                return this.f24758a.m3074s7(i, userInfo);
            }
        });
    }

    /* JADX INFO: renamed from: w7 */
    public final /* synthetic */ UserInfo m3085w7(Envelope envelope) {
        User user = !vwb.J(envelope.getModuleData(CommonData.class).users) ? (User) envelope.getModuleData(CommonData.class).users.get(0) : null;
        Relationship relationship = !vwb.J(envelope.getModuleData(CoreData.class).relationships) ? (Relationship) envelope.getModuleData(CoreData.class).relationships.get(0) : null;
        HashMap map = new HashMap();
        CoreModule.m1853N().zd(envelope, map);
        if ((relationship != null && TEnum.equals(relationship.state, "matched")) || user == null) {
            return null;
        }
        UserInfo userInfo = new UserInfo();
        String str = ((DbObject) user).id;
        userInfo.f3461id = str;
        userInfo.preSwipedDirection = SwipeDirection.LEFT;
        userInfo.hasMoment = map.containsKey(str);
        m3084w6(userInfo, 0);
        return userInfo;
    }

    /* JADX INFO: renamed from: w8 */
    public void m3086w8() {
        scheduled("refresh_swipe_pay_will", 0, new v9j() { // from class: l.s0b
            public final Object call() {
                return this.f20966a.m2927F7();
            }
        });
    }

    /* JADX INFO: renamed from: x5 */
    public final String m3087x5(String str) {
        return C0154a.m3292v2(j2e0.m17250o(Uri.parse(str)).get("uid") + "?search=like-relationship");
    }

    /* JADX INFO: renamed from: x6 */
    public final c<UserInfo> m3088x6(c<Envelope> cVar) {
        return cVar.doOnNext(new e30() { // from class: l.g3b
            public final void call(Object obj) {
                this.f13042a.m3082v7((Envelope) obj);
            }
        }).compose(C0154a.m3182T2()).map(new w9j() { // from class: l.i3b
            public final Object call(Object obj) {
                return this.f14216a.m3085w7((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: x7 */
    public final /* synthetic */ Notification m3089x7(boolean z, UserInfo userInfo, boolean z2, User user, Notification notification) {
        if (z || !userInfo.f3461id.equals(C0155a0.m3317j().f3514d.get())) {
            m3047j8(notification, z, z2, userInfo, user);
            return notification;
        }
        C0155a0.m3317j().f3514d.put("");
        return notification;
    }

    /* JADX INFO: renamed from: x8 */
    public c<Boolean> m3090x8(String str) {
        return m3094y8(str, false);
    }

    /* JADX INFO: renamed from: y5 */
    public c<Boolean> m3091y5(String str) {
        return m3094y8(str, true);
    }

    /* JADX INFO: renamed from: y6 */
    public boolean m3092y6(List<j760<UserInfo, Integer>> list) {
        if (list == null) {
            return false;
        }
        PartialListOpt partialListOpt = (PartialListOpt) this.f3383a0.e();
        if (!NullChecker.a(partialListOpt)) {
            return false;
        }
        List list2 = partialListOpt.loaded;
        for (j760<UserInfo, Integer> j760Var : list) {
            if (j760Var != null && j760Var.a != null) {
                if (!NullChecker.a(j760Var.b) || ((Integer) j760Var.b).intValue() < 0 || list2.size() < ((Integer) j760Var.b).intValue()) {
                    list2.add((UserInfo) j760Var.a);
                } else {
                    list2.add(((Integer) j760Var.b).intValue(), (UserInfo) j760Var.a);
                }
                if (NullChecker.a(j760Var.a)) {
                    this.f3377Y.add(((UserInfo) j760Var.a).f3461id);
                }
            }
        }
        DbLinks dbLinksNew_ = DbLinks.new_();
        dbLinksNew_.links.next = "";
        this.f3383a0.onNext(new PartialListOpt(list2, dbLinksNew_).setReason(PartialListOpt.RefreshReason.INSERT_VIRTUAL_CARD));
        return true;
    }

    /* JADX INFO: renamed from: y7 */
    public final /* synthetic */ void m3093y7(boolean z, UserInfo userInfo, boolean z2, Relationship relationship, LikeExtraData likeExtraData, LikeFrom likeFrom, Relationship relationship2) {
        if (z && !TEnum.equals(relationship2.state, "matched")) {
            CrashHelper.c(new Exception("Reply to the greeting of instant-chat, but no match, relationship id = " + relationship2.id + ", user id = " + CoreModule.m1850H().userId()));
        }
        if (TEnum.equals(relationship2.state, "matched")) {
            CoreModule.f1534c.f3611Y0.f11593q = 0;
            this.f8580Q.f3676u0.m2419x7(userInfo.f3461id);
            if (ura.m25555e().m25559d().m5692U9()) {
                this.f8580Q.f3633f2.m18592K3(userInfo.f3461id);
            }
            if (this.f8580Q.f3690y2.m19347E3()) {
                this.f8580Q.f3690y2.m19365W3(userInfo.f3461id);
            }
        } else if (ura.m25555e().m25559d().m5692U9() && z2) {
            this.f8580Q.f3633f2.m18592K3(userInfo.f3461id);
        } else if (this.f8580Q.f3690y2.m19347E3() && z2) {
            this.f8580Q.f3690y2.m19365W3(userInfo.f3461id);
        }
        if (TEnum.equals(relationship2.state, "matched")) {
            C0155a0.m3317j().m3320g();
            String str = (String) C0155a0.m3317j().f3514d.get();
            if (!str.isEmpty() && userInfo.f3461id.equals(C0155a0.m3317j().m3322i())) {
                m2940I8(vwb.f0(new String[]{str}));
            }
            qib0.m22159e1("home_user_matched", "user_id", CoreModule.m1850H().userId(), "other_user_id", userInfo.f3461id);
        }
        if (CoreModule.m1853N().Co()) {
            if (TEnum.equals(relationship.state, "matched")) {
                this.f8580Q.f3667r0.f4016h0.onNext(j760.a(userInfo.f3461id, relationship.state));
            } else {
                C0158c c0158c = this.f8580Q;
                if (z2) {
                    c0158c.f3667r0.f4016h0.onNext(j760.a(userInfo.f3461id, RelationshipStatus.get("superliked")));
                } else {
                    c0158c.f3667r0.f4016h0.onNext(j760.a(userInfo.f3461id, relationship.state));
                }
            }
        }
        if (TEnum.equals(relationship2.state, "matched") && likeExtraData != null && NullChecker.a(likeExtraData.matchScData)) {
            l3f l3fVar = new l3f();
            l3fVar.s = "e_gotmatch";
            l3fVar.d = EventNameEnum.USER_BEHAVIOR_COMPLEMENT;
            MatchScData matchScData = likeExtraData.matchScData;
            l3fVar.n = matchScData.pageId;
            zvf0.n(l3fVar, matchScData.toTrackParamMap());
        }
        if (TEnum.equals(relationship2.state, "matched") && TEnum.equals(likeFrom, "fakeMatch") && !ura.m25555e().m25557b().m5586wf() && !xma.m27385h4()) {
            CoreModule.m1854P().m11709e().m6902Fb();
        }
        if (TEnum.equals(relationship2.state, "matched") && ura.m25555e().m25557b().m5586wf() && TEnum.equals(likeFrom, "fakeMatch") && !xma.m27379e4()) {
            CoreModule.m1854P().m11709e().m6909Qo();
        }
    }

    /* JADX INFO: renamed from: y8 */
    public final c<Boolean> m3094y8(final String str, final boolean z) {
        return scheduled("reject_or_accept_fake_quick_chat", -1, new v9j() { // from class: l.x1b
            public final Object call() {
                return ia20.m16571e(new v9j() { // from class: l.a4b
                    public final Object call() {
                        return CoreSuggested.m2867m5(str, z);
                    }
                }).map(new w9j() { // from class: l.b4b
                    public final Object call(Object obj) {
                        return Boolean.valueOf(((Envelope) obj).meta.code == 200);
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: z5 */
    public void m3095z5(final boolean z) {
        e51.H(CoreModule.f1533b, new Runnable() { // from class: l.q1b
            @Override // java.lang.Runnable
            public final void run() {
                this.f19512a.m2966P6(z);
            }
        }, 1000L);
    }

    /* JADX INFO: renamed from: z6 */
    public int m3096z6(String str) {
        if (NullChecker.a(this.f3379Y1.get(str))) {
            return this.f3379Y1.get(str).intValue();
        }
        return -1;
    }

    /* JADX INFO: renamed from: z7 */
    public final /* synthetic */ c m3097z7(final boolean z, final UserInfo userInfo, final Relationship relationship, Map map, Long l2, final boolean z2, final User user, final boolean z3, final LikeExtraData likeExtraData, final LikeFrom likeFrom) {
        c<Envelope> cVarM6842m3;
        if (z || !userInfo.f3461id.equals(C0155a0.m3317j().f3514d.get())) {
            cVarM6842m3 = C0185y.m6842m3(userInfo.f3461id, relationship, map);
        } else {
            cVarM6842m3 = C0185y.m6844o3((String) C0155a0.m3317j().f3514d.get());
            C0155a0.m3317j().f3515e.put(Boolean.FALSE);
            zvf0.r("e_special_card_swiped_left", "p_suggest_users_home_view");
            C0155a0.m3317j().m3335w(userInfo.f3461id);
        }
        return cVarM6842m3.compose(rzh0.e(l2)).materialize().map(new w9j() { // from class: l.h2b
            public final Object call(Object obj) {
                return this.f13649a.m3089x7(z, userInfo, z2, user, (Notification) obj);
            }
        }).dematerialize().take(1).compose(C0154a.m3182T2()).map(new w9j() { // from class: l.i2b
            public final Object call(Object obj) {
                return CoreSuggested.m2798K4((Envelope) obj);
            }
        }).doOnNext(new e30() { // from class: l.j2b
            public final void call(Object obj) {
                this.f14966a.m3093y7(z3, userInfo, z2, relationship, likeExtraData, likeFrom, (Relationship) obj);
            }
        });
    }

    /* JADX INFO: renamed from: z8 */
    public void m3098z8(final String str) {
        if (NullChecker.a(this.f3356R.e()) && NullChecker.a(((j760) this.f3356R.e()).b) && NullChecker.a(((j760) this.f3356R.e()).a)) {
            vwb.e0((List) ((j760) this.f3356R.e()).b, new w9j() { // from class: l.k4b
                public final Object call(Object obj) {
                    return Boolean.valueOf(((DislikedUsers) obj).id.equals(str));
                }
            });
        }
        this.f8580Q.f3677u1.m25553b3(str);
    }

    public static class UserInfo implements Parcelable, kj4 {
        public static final Parcelable.Creator<UserInfo> CREATOR = new C0148a();
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
        public String f3461id;
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
        public class C0148a implements Parcelable.Creator<UserInfo> {
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
            this.f3461id = parcel.readString();
            this.letter = parcel.readString();
            this.isUndo = parcel.readByte() != 0;
            this.canUndo = parcel.readByte() != 0;
            this.orderMsg = parcel.readString();
            this.cardId = parcel.readString();
            this.cardExtInfo = parcel.readString();
            this.renderFrom = CardInfoRenderFrom.valueOf(parcel.readString());
        }

        /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
        public UserInfo m28959clone() {
            UserInfo userInfo = new UserInfo();
            userInfo.f3461id = this.f3461id;
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
                userInfo.creditScore = creditScoreData.clone();
            }
            userInfo.from = this.from;
            UserActivityInfo userActivityInfo = this.userActivityInfo;
            if (userActivityInfo != null) {
                userInfo.userActivityInfo = userActivityInfo.clone();
            }
            return userInfo;
        }

        public void debugRecommendMessage() {
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public int getPreBackOperation() {
            SwipeDirection swipeDirection = this.preSwipedDirection;
            if (swipeDirection == null) {
                return -1;
            }
            int i = C0152d.f3465a[swipeDirection.ordinal()];
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
            return this.virtualCardType == VirtualCardType.OnlineMatchBroadcastCard && NullChecker.a(this.quickChatCardWrapper) && this.quickChatCardWrapper.cardType == 1;
        }

        public boolean isLivingCard() {
            if (!NullChecker.a(this.virtualCardType)) {
                return false;
            }
            VirtualCardType virtualCardType = this.virtualCardType;
            return virtualCardType == VirtualCardType.LiveLivingCard || virtualCardType == VirtualCardType.LiveVoiceCard;
        }

        public boolean isMomentInfoCard() {
            if (!NullChecker.a(this.coreMomentInfo) || !NullChecker.a(this.cardInfos) || TextUtils.isEmpty(this.cardInfos.momentId) || sb90.c(CoreModule.f1534c.f3628e0.m21393Pa(this.f3461id))) {
                return false;
            }
            return ura.m25555e().m25559d().m5870ui() || !vwb.J(this.coreMomentInfo.media);
        }

        public boolean isNativeAdViewCard() {
            return this.virtualCardType == VirtualCardType.NativeAdViewCard;
        }

        public boolean isNewSpecialLike() {
            return false;
        }

        public boolean isOffsetUpRightBottom() {
            return (!CoreModule.f1534c.f3628e0.f18896U6.contains(this.f3461id) && this.isShowFakePhotoFeedback) || ura.m25555e().m25559d().m5712Wc(this);
        }

        public boolean isOffsetUpRightBottomValue() {
            return (!CoreModule.f1534c.f3628e0.f18896U6.contains(this.f3461id) && this.isShowFakePhotoFeedback) || ura.m25555e().m25559d().m5712Wc(this) || isShowCertificationGuidanceItem() || ura.m25555e().m25559d().m5592Ae(this);
        }

        public boolean isOnlineMatchChatBoot() {
            return this.virtualCardType == VirtualCardType.OnlineMatchChatBootCard;
        }

        public boolean isPassiveQucikAudio() {
            return this.virtualCardType == VirtualCardType.QuickAudioBroadcastCard && NullChecker.a(this.quickChatCardWrapper) && this.quickChatCardWrapper.cardType == 2;
        }

        public boolean isPassiveQuickChat() {
            VirtualCardType virtualCardType = this.virtualCardType;
            return (virtualCardType == VirtualCardType.OnlineMatchBroadcastCard || virtualCardType == VirtualCardType.QuickAudioBroadcastCard) && NullChecker.a(this.quickChatCardWrapper) && this.quickChatCardWrapper.cardType == 2;
        }

        public boolean isQuickChatPartyInvitationCard() {
            VirtualCardType virtualCardType = this.virtualCardType;
            return virtualCardType == VirtualCardType.AudioQuickChatPartyInvitationCard || virtualCardType == VirtualCardType.TextQuickChatPartyInvitationCard;
        }

        public boolean isRepeatUser() {
            if (NullChecker.a(this.ussTags)) {
                return this.ussTags.repeatedUser;
            }
            return false;
        }

        public boolean isShowCertificationGuidanceItem() {
            if (!isShowOnlyLookingAuthentication()) {
                return false;
            }
            if (ura.m25555e().m25559d().m5646Je()) {
                return true;
            }
            CoreSuggested coreSuggested = CoreModule.f1534c.f3652m0;
            zpd0 zpd0Var = coreSuggested.f3340K1;
            uqd0 uqd0Var = coreSuggested.f3343L1;
            if (mqi0.C(mqi0.o(), ((Long) zpd0Var.get()).longValue())) {
                return TextUtils.equals((CharSequence) uqd0Var.get(), this.f3461id);
            }
            zpd0Var.put(Long.valueOf(mqi0.o()));
            uqd0Var.put(this.f3461id);
            return true;
        }

        public boolean isShowOnlyLookingAuthentication() {
            User userM21393Pa = CoreModule.f1534c.f3628e0.m21393Pa(this.f3461id);
            if (userM21393Pa != null && NullChecker.a(userM21393Pa.settings) && !vwb.J(userM21393Pa.settings.settingGroups) && NullChecker.a(((SettingGroups) userM21393Pa.settings.settingGroups.get(0)).svipSearch) && ((SettingGroups) userM21393Pa.settings.settingGroups.get(0)).svipSearch.realUser && userM21393Pa.isPicVerificationVerified() && !CoreModule.f1534c.f3628e0.m21490p9().isPicVerificationVerified()) {
                StudentVerificationStatus studentVerificationStatus = StudentVerificationStatus.get("unknown_");
                VerificationCenter verificationCenterM3542k4 = CoreModule.f1534c.f3541B0.m3542k4();
                if (NullChecker.a(verificationCenterM3542k4) && NullChecker.a(verificationCenterM3542k4.picVerificationInfo)) {
                    studentVerificationStatus = CoreModule.f1534c.f3541B0.m3542k4().picVerificationInfo.status;
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
            return TextUtils.equals(this.f3461id, VIRTUAL_CARD);
        }

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
            parcel.writeString(this.f3461id);
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
            this.checkPointTime = mqi0.o();
        }
    }
}
