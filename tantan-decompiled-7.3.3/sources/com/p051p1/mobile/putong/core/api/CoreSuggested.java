package com.p051p1.mobile.putong.core.api;

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
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.p052rx.rxthread.FastIoScheduler;
import com.p051p1.mobile.putong.api.ABManager;
import com.p051p1.mobile.putong.api.api.Network;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.C4879a;
import com.p051p1.mobile.putong.core.api.CoreSuggested;
import com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface;
import com.p051p1.mobile.putong.core.data.ActionData;
import com.p051p1.mobile.putong.core.data.ActionInsertPosition;
import com.p051p1.mobile.putong.core.data.ActionPageFormat;
import com.p051p1.mobile.putong.core.data.Active;
import com.p051p1.mobile.putong.core.data.CardCornerMark;
import com.p051p1.mobile.putong.core.data.CardExtraInfo;
import com.p051p1.mobile.putong.core.data.CardInfoRenderFrom;
import com.p051p1.mobile.putong.core.data.CardInfos;
import com.p051p1.mobile.putong.core.data.CardModel;
import com.p051p1.mobile.putong.core.data.CardPattern;
import com.p051p1.mobile.putong.core.data.CardStyle;
import com.p051p1.mobile.putong.core.data.CardsIcons;
import com.p051p1.mobile.putong.core.data.CityCData;
import com.p051p1.mobile.putong.core.data.ConsumeType;
import com.p051p1.mobile.putong.core.data.ControlCardInfo;
import com.p051p1.mobile.putong.core.data.CoreData;
import com.p051p1.mobile.putong.core.data.CoreMomentInfo;
import com.p051p1.mobile.putong.core.data.CreditScoreData;
import com.p051p1.mobile.putong.core.data.DislikedUsers;
import com.p051p1.mobile.putong.core.data.DynamicLable;
import com.p051p1.mobile.putong.core.data.FakePhotoFeedback;
import com.p051p1.mobile.putong.core.data.FourSelectOneAdCardData;
import com.p051p1.mobile.putong.core.data.IPRegion;
import com.p051p1.mobile.putong.core.data.IdealInfo;
import com.p051p1.mobile.putong.core.data.ImpressSignalCardWrapper;
import com.p051p1.mobile.putong.core.data.IntlInsertCardData;
import com.p051p1.mobile.putong.core.data.Literatures;
import com.p051p1.mobile.putong.core.data.LiteraturesComments;
import com.p051p1.mobile.putong.core.data.LiveLivingCardDataWrapper;
import com.p051p1.mobile.putong.core.data.MissMatch;
import com.p051p1.mobile.putong.core.data.MyTabTask;
import com.p051p1.mobile.putong.core.data.NewTags;
import com.p051p1.mobile.putong.core.data.PartialListOpt;
import com.p051p1.mobile.putong.core.data.Portrait;
import com.p051p1.mobile.putong.core.data.ProfileLikeComment;
import com.p051p1.mobile.putong.core.data.ProfileLikesComment;
import com.p051p1.mobile.putong.core.data.QuickChatCardWrapper;
import com.p051p1.mobile.putong.core.data.QuickChatPartyInvitation;
import com.p051p1.mobile.putong.core.data.Reason;
import com.p051p1.mobile.putong.core.data.SamesCardData;
import com.p051p1.mobile.putong.core.data.SeePortrait;
import com.p051p1.mobile.putong.core.data.SuggestReason;
import com.p051p1.mobile.putong.core.data.SuggestedComplimentItem;
import com.p051p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p051p1.mobile.putong.core.data.SuperLikeCount;
import com.p051p1.mobile.putong.core.data.SwipeDirection;
import com.p051p1.mobile.putong.core.data.UserAction;
import com.p051p1.mobile.putong.core.data.UserGreetInfo;
import com.p051p1.mobile.putong.core.data.UserWithRelationShip;
import com.p051p1.mobile.putong.core.data.VerificationCenter;
import com.p051p1.mobile.putong.core.data.VirtualCardType;
import com.p051p1.mobile.putong.core.p058ui.onlinematch.OnlineMatchPushUser;
import com.p051p1.mobile.putong.data.BubbleInfo;
import com.p051p1.mobile.putong.data.CommonData;
import com.p051p1.mobile.putong.data.ConversationStatus;
import com.p051p1.mobile.putong.data.Converter;
import com.p051p1.mobile.putong.data.Counter;
import com.p051p1.mobile.putong.data.CounterLikeLimit;
import com.p051p1.mobile.putong.data.DbLinks;
import com.p051p1.mobile.putong.data.DclExtensions;
import com.p051p1.mobile.putong.data.Device;
import com.p051p1.mobile.putong.data.Envelope;
import com.p051p1.mobile.putong.data.LikeExtraData;
import com.p051p1.mobile.putong.data.LikeFrom;
import com.p051p1.mobile.putong.data.Links;
import com.p051p1.mobile.putong.data.LiveUserLevel;
import com.p051p1.mobile.putong.data.MatchFrom;
import com.p051p1.mobile.putong.data.MatchScData;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.OMSThemeInfo;
import com.p051p1.mobile.putong.data.OMSThemeSuggestStrageryInfo;
import com.p051p1.mobile.putong.data.OmsNewTags;
import com.p051p1.mobile.putong.data.Picture;
import com.p051p1.mobile.putong.data.RecommendMessage;
import com.p051p1.mobile.putong.data.Relationship;
import com.p051p1.mobile.putong.data.RelationshipExtensions;
import com.p051p1.mobile.putong.data.RelationshipStatus;
import com.p051p1.mobile.putong.data.SettingGroups;
import com.p051p1.mobile.putong.data.Settings;
import com.p051p1.mobile.putong.data.StudentVerificationStatus;
import com.p051p1.mobile.putong.data.SwipeCardInfo;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.UserActivityInfo;
import com.p051p1.mobile.putong.data.UserStatus;
import com.p051p1.mobile.putong.data.UssTags;
import com.p051p1.mobile.putong.data.VoiceLiveState;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.feed.data.VoiceLive;
import com.p051p1.mobile.putong.live.base.data.BLiveType;
import com.p051p1.mobile.putong.remote_config.RemoteConfig;
import com.p051p1.mobile.putong.util.launch.LaunchStep;
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
import p137rx.C22421c;
import p137rx.Notification;
import p137rx.subjects.C22507a;
import p137rx.subjects.C22508b;
import p153l.bkj0;
import p153l.byd0;
import p153l.dkb;
import p153l.dy6;
import p153l.ela;
import p153l.fo0;
import p153l.fr90;
import p153l.gta;
import p153l.i4g0;
import p153l.jk4;
import p153l.joa;
import p153l.jxd0;
import p153l.jyb;
import p153l.l51;
import p153l.lqb;
import p153l.nae0;
import p153l.pcj;
import p153l.pf60;
import p153l.pla;
import p153l.psd0;
import p153l.pzi0;
import p153l.q4f;
import p153l.qcj;
import p153l.qi20;
import p153l.sfj0;
import p153l.ti20;
import p153l.tu2;
import p153l.u7l;
import p153l.uqb0;
import p153l.uqi;
import p153l.uxj0;
import p153l.vg60;
import p153l.vxd0;
import p153l.w20;
import p153l.wj90;
import p153l.wu90;
import p153l.wyd0;
import p153l.x1d0;
import p153l.x20;
import p153l.xgw;
import p153l.xyd0;
import p153l.y20;
import p153l.yti0;
import p153l.z1d0;
import p153l.z7i0;

/* JADX INFO: loaded from: classes9.dex */
public class CoreSuggested extends dy6 {

    /* JADX INFO: renamed from: N2 */
    public static final long f20061N2 = 10000;

    /* JADX INFO: renamed from: A0 */
    public int f20062A0;

    /* JADX INFO: renamed from: A1 */
    public jxd0 f20063A1;

    /* JADX INFO: renamed from: A2 */
    public volatile long f20064A2;

    /* JADX INFO: renamed from: B0 */
    public C22508b<uxj0> f20065B0;

    /* JADX INFO: renamed from: B1 */
    public wyd0 f20066B1;

    /* JADX INFO: renamed from: B2 */
    public C22507a<uxj0> f20067B2;

    /* JADX INFO: renamed from: C0 */
    public boolean f20068C0;

    /* JADX INFO: renamed from: C1 */
    public jxd0 f20069C1;

    /* JADX INFO: renamed from: C2 */
    public boolean f20070C2;

    /* JADX INFO: renamed from: D0 */
    public vxd0 f20071D0;

    /* JADX INFO: renamed from: D1 */
    public jxd0 f20072D1;

    /* JADX INFO: renamed from: D2 */
    public C22508b<uxj0> f20073D2;

    /* JADX INFO: renamed from: E0 */
    public byd0 f20074E0;

    /* JADX INFO: renamed from: E1 */
    public jxd0 f20075E1;

    /* JADX INFO: renamed from: E2 */
    public C22507a<uxj0> f20076E2;

    /* JADX INFO: renamed from: F0 */
    public C22507a<uxj0> f20077F0;

    /* JADX INFO: renamed from: F1 */
    public jxd0 f20078F1;

    /* JADX INFO: renamed from: F2 */
    public C22508b<uxj0> f20079F2;

    /* JADX INFO: renamed from: G0 */
    public int f20080G0;

    /* JADX INFO: renamed from: G1 */
    public jxd0 f20081G1;

    /* JADX INFO: renamed from: G2 */
    public int f20082G2;

    /* JADX INFO: renamed from: H0 */
    public byd0 f20083H0;

    /* JADX INFO: renamed from: H1 */
    public jxd0 f20084H1;

    /* JADX INFO: renamed from: H2 */
    public C22507a<vg60<String>> f20085H2;

    /* JADX INFO: renamed from: I0 */
    public C22507a<uxj0> f20086I0;

    /* JADX INFO: renamed from: I1 */
    public jxd0 f20087I1;

    /* JADX INFO: renamed from: I2 */
    public C22507a<pf60<SwipeDirection, HashMap>> f20088I2;

    /* JADX INFO: renamed from: J0 */
    public C22508b<Boolean> f20089J0;

    /* JADX INFO: renamed from: J1 */
    public jxd0 f20090J1;

    /* JADX INFO: renamed from: J2 */
    public long f20091J2;

    /* JADX INFO: renamed from: K0 */
    public C22507a<Boolean> f20092K0;

    /* JADX INFO: renamed from: K1 */
    public byd0 f20093K1;

    /* JADX INFO: renamed from: K2 */
    public boolean f20094K2;

    /* JADX INFO: renamed from: L0 */
    public C22507a<PartialListOpt<UserInfo>> f20095L0;

    /* JADX INFO: renamed from: L1 */
    public wyd0 f20096L1;

    /* JADX INFO: renamed from: L2 */
    public final C22507a<Object> f20097L2;

    /* JADX INFO: renamed from: M0 */
    public vxd0 f20098M0;

    /* JADX INFO: renamed from: M1 */
    public byd0 f20099M1;

    /* JADX INFO: renamed from: M2 */
    public String f20100M2;

    /* JADX INFO: renamed from: N0 */
    public vxd0 f20101N0;

    /* JADX INFO: renamed from: N1 */
    public jxd0 f20102N1;

    /* JADX INFO: renamed from: O0 */
    public byd0 f20103O0;

    /* JADX INFO: renamed from: O1 */
    public int f20104O1;

    /* JADX INFO: renamed from: P0 */
    public byd0 f20105P0;

    /* JADX INFO: renamed from: P1 */
    public int f20106P1;

    /* JADX INFO: renamed from: Q0 */
    public vxd0 f20107Q0;

    /* JADX INFO: renamed from: Q1 */
    public boolean f20108Q1;

    /* JADX INFO: renamed from: R */
    public C22507a<pf60<Links, List<DislikedUsers>>> f20109R;

    /* JADX INFO: renamed from: R0 */
    public C22507a<Boolean> f20110R0;

    /* JADX INFO: renamed from: R1 */
    public HashMap<UserInfo, pf60<Integer, Long>> f20111R1;

    /* JADX INFO: renamed from: S */
    public C22507a<pf60<String, Long>> f20112S;

    /* JADX INFO: renamed from: S0 */
    public jxd0 f20113S0;

    /* JADX INFO: renamed from: S1 */
    public HashMap<UserInfo, Integer> f20114S1;

    /* JADX INFO: renamed from: T */
    public C22507a<uxj0> f20115T;

    /* JADX INFO: renamed from: T0 */
    public vxd0 f20116T0;

    /* JADX INFO: renamed from: T1 */
    public boolean f20117T1;

    /* JADX INFO: renamed from: U */
    public boolean f20118U;

    /* JADX INFO: renamed from: U0 */
    public jxd0 f20119U0;

    /* JADX INFO: renamed from: U1 */
    public boolean f20120U1;

    /* JADX INFO: renamed from: V */
    public C22507a<Boolean> f20121V;

    /* JADX INFO: renamed from: V0 */
    public jxd0 f20122V0;

    /* JADX INFO: renamed from: V1 */
    public C22508b<Integer> f20123V1;

    /* JADX INFO: renamed from: W */
    public long f20124W;

    /* JADX INFO: renamed from: W0 */
    public jxd0 f20125W0;

    /* JADX INFO: renamed from: W1 */
    public C22508b<uxj0> f20126W1;

    /* JADX INFO: renamed from: X */
    public int f20127X;

    /* JADX INFO: renamed from: X0 */
    public final HashMap<String, SuggestedComplimentItem> f20128X0;

    /* JADX INFO: renamed from: X1 */
    public C22508b<uxj0> f20129X1;

    /* JADX INFO: renamed from: Y */
    public HashSet<String> f20130Y;

    /* JADX INFO: renamed from: Y0 */
    public wyd0 f20131Y0;

    /* JADX INFO: renamed from: Y1 */
    public Map<String, Integer> f20132Y1;

    /* JADX INFO: renamed from: Z */
    public HashSet<String> f20133Z;

    /* JADX INFO: renamed from: Z0 */
    public wyd0 f20134Z0;

    /* JADX INFO: renamed from: Z1 */
    public Map<String, Integer> f20135Z1;

    /* JADX INFO: renamed from: a0 */
    public C22507a<PartialListOpt<UserInfo>> f20136a0;

    /* JADX INFO: renamed from: a1 */
    public wyd0 f20137a1;

    /* JADX INFO: renamed from: a2 */
    public Map<String, Integer> f20138a2;

    /* JADX INFO: renamed from: b0 */
    public C22507a<ActionData> f20139b0;

    /* JADX INFO: renamed from: b1 */
    public wyd0 f20140b1;

    /* JADX INFO: renamed from: b2 */
    public HashSet<String> f20141b2;

    /* JADX INFO: renamed from: c0 */
    public C22507a<uxj0> f20142c0;

    /* JADX INFO: renamed from: c1 */
    public wyd0 f20143c1;

    /* JADX INFO: renamed from: c2 */
    public HashSet<String> f20144c2;

    /* JADX INFO: renamed from: d0 */
    public C22508b<HashMap<String, NewTags>> f20145d0;

    /* JADX INFO: renamed from: d1 */
    public byd0 f20146d1;

    /* JADX INFO: renamed from: d2 */
    public HashSet<String> f20147d2;

    /* JADX INFO: renamed from: e0 */
    public C22508b<uxj0> f20148e0;

    /* JADX INFO: renamed from: e1 */
    public jxd0 f20149e1;

    /* JADX INFO: renamed from: e2 */
    public C4897l f20150e2;

    /* JADX INFO: renamed from: f0 */
    public UserInfo f20151f0;

    /* JADX INFO: renamed from: f1 */
    public byd0 f20152f1;

    /* JADX INFO: renamed from: f2 */
    public C22508b<Boolean> f20153f2;

    /* JADX INFO: renamed from: g0 */
    public xgw<String, Object> f20154g0;

    /* JADX INFO: renamed from: g1 */
    public vxd0 f20155g1;

    /* JADX INFO: renamed from: g2 */
    public C22508b<SwipeDirection> f20156g2;

    /* JADX INFO: renamed from: h0 */
    public boolean f20157h0;

    /* JADX INFO: renamed from: h1 */
    public xyd0 f20158h1;

    /* JADX INFO: renamed from: h2 */
    public C22508b<SwipeDirection> f20159h2;

    /* JADX INFO: renamed from: i0 */
    public User f20160i0;

    /* JADX INFO: renamed from: i1 */
    public vxd0 f20161i1;

    /* JADX INFO: renamed from: i2 */
    public C22508b<SwipeDirection> f20162i2;

    /* JADX INFO: renamed from: j0 */
    public UserInfo f20163j0;

    /* JADX INFO: renamed from: j1 */
    public byd0 f20164j1;

    /* JADX INFO: renamed from: j2 */
    public C22508b<uxj0> f20165j2;

    /* JADX INFO: renamed from: k0 */
    public int f20166k0;

    /* JADX INFO: renamed from: k1 */
    public jxd0 f20167k1;

    /* JADX INFO: renamed from: k2 */
    public C22508b<uxj0> f20168k2;

    /* JADX INFO: renamed from: l0 */
    public int f20169l0;

    /* JADX INFO: renamed from: l1 */
    public jxd0 f20170l1;

    /* JADX INFO: renamed from: l2 */
    public C22508b<String> f20171l2;

    /* JADX INFO: renamed from: m0 */
    public C22507a<Long> f20172m0;

    /* JADX INFO: renamed from: m1 */
    public jxd0 f20173m1;

    /* JADX INFO: renamed from: m2 */
    public C22508b<uxj0> f20174m2;

    /* JADX INFO: renamed from: n0 */
    public long f20175n0;

    /* JADX INFO: renamed from: n1 */
    public jxd0 f20176n1;

    /* JADX INFO: renamed from: n2 */
    public C22508b<uxj0> f20177n2;

    /* JADX INFO: renamed from: o0 */
    public long f20178o0;

    /* JADX INFO: renamed from: o1 */
    public jxd0 f20179o1;

    /* JADX INFO: renamed from: o2 */
    public String f20180o2;

    /* JADX INFO: renamed from: p0 */
    public long f20181p0;

    /* JADX INFO: renamed from: p1 */
    public wyd0 f20182p1;

    /* JADX INFO: renamed from: p2 */
    public boolean f20183p2;

    /* JADX INFO: renamed from: q0 */
    public long f20184q0;

    /* JADX INFO: renamed from: q1 */
    public wyd0 f20185q1;

    /* JADX INFO: renamed from: q2 */
    public int[] f20186q2;

    /* JADX INFO: renamed from: r0 */
    public HashSet<String> f20187r0;

    /* JADX INFO: renamed from: r1 */
    public wyd0 f20188r1;

    /* JADX INFO: renamed from: r2 */
    public String f20189r2;

    /* JADX INFO: renamed from: s0 */
    public UserInfo f20190s0;

    /* JADX INFO: renamed from: s1 */
    public jxd0 f20191s1;

    /* JADX INFO: renamed from: s2 */
    public int f20192s2;

    /* JADX INFO: renamed from: t0 */
    public jxd0 f20193t0;

    /* JADX INFO: renamed from: t1 */
    public jxd0 f20194t1;

    /* JADX INFO: renamed from: t2 */
    public final Map<String, Integer> f20195t2;

    /* JADX INFO: renamed from: u0 */
    public jxd0 f20196u0;

    /* JADX INFO: renamed from: u1 */
    public jxd0 f20197u1;

    /* JADX INFO: renamed from: u2 */
    public jxd0 f20198u2;

    /* JADX INFO: renamed from: v0 */
    public jxd0 f20199v0;

    /* JADX INFO: renamed from: v1 */
    public jxd0 f20200v1;

    /* JADX INFO: renamed from: v2 */
    public byd0 f20201v2;

    /* JADX INFO: renamed from: w0 */
    public jxd0 f20202w0;

    /* JADX INFO: renamed from: w1 */
    public jxd0 f20203w1;

    /* JADX INFO: renamed from: w2 */
    public jxd0 f20204w2;

    /* JADX INFO: renamed from: x0 */
    public jxd0 f20205x0;

    /* JADX INFO: renamed from: x1 */
    public byd0 f20206x1;

    /* JADX INFO: renamed from: x2 */
    public C22507a<bkj0<String, Boolean, SwipeDirection>> f20207x2;

    /* JADX INFO: renamed from: y0 */
    public int f20208y0;

    /* JADX INFO: renamed from: y1 */
    public jxd0 f20209y1;

    /* JADX INFO: renamed from: y2 */
    public long f20210y2;

    /* JADX INFO: renamed from: z0 */
    public int f20211z0;

    /* JADX INFO: renamed from: z1 */
    public jxd0 f20212z1;

    /* JADX INFO: renamed from: z2 */
    public volatile long f20213z2;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.api.CoreSuggested$a */
    public class C4874a implements qcj<Envelope, UserInfo> {
        public C4874a() {
        }

        @Override // p153l.qcj
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public UserInfo call(Envelope envelope) {
            CommonData commonData = (CommonData) envelope.getModuleData(CommonData.class);
            List<CoreMomentInfo> list = ((CoreData) envelope.getModuleData(CoreData.class)).moments;
            if (!NullChecker.m82486a(commonData) || jyb.m147479J(commonData.users)) {
                return null;
            }
            UserInfo userInfo = new UserInfo();
            userInfo.f20214id = commonData.users.get(0).f56859id;
            if (!jyb.m147479J(list)) {
                userInfo.coreMomentInfoList = list;
            }
            CoreSuggested.this.f20180o2 = commonData.users.get(0).f56859id;
            return userInfo;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.api.CoreSuggested$b */
    public class C4875b implements qcj<Envelope, Envelope> {
        public C4875b() {
        }

        @Override // p153l.qcj
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Envelope call(Envelope envelope) {
            CoreSuggested.this.f91137Q.m32495w3(envelope, null);
            return envelope;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.api.CoreSuggested$c */
    public class C4876c implements qcj<Envelope, uxj0> {
        public C4876c() {
        }

        @Override // p153l.qcj
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public uxj0 call(Envelope envelope) {
            return uxj0.f181467a;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.api.CoreSuggested$d */
    public static /* synthetic */ class C4877d {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f20218a;

        static {
            int[] iArr = new int[SwipeDirection.values().length];
            f20218a = iArr;
            try {
                iArr[SwipeDirection.UP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f20218a[SwipeDirection.LEFT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f20218a[SwipeDirection.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.api.CoreSuggested$e */
    public static class C4878e implements Comparable<C4878e> {

        /* JADX INFO: renamed from: a */
        public String f20219a;

        /* JADX INFO: renamed from: b */
        public int f20220b;

        public C4878e(String str, int i) {
            this.f20219a = str;
            this.f20220b = i;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(C4878e c4878e) {
            return c4878e.f20220b - this.f20220b;
        }
    }

    public CoreSuggested(C4883c c4883c) {
        super(c4883c);
        this.f20109R = C22507a.m222758b();
        this.f20112S = C22507a.m222758b();
        this.f20115T = C22507a.m222758b();
        Boolean bool = Boolean.FALSE;
        this.f20121V = C22507a.m222759c(bool);
        this.f20124W = 0L;
        this.f20127X = 2;
        this.f20130Y = new HashSet<>();
        this.f20133Z = new HashSet<>();
        this.f20136a0 = C22507a.m222758b();
        this.f20139b0 = C22507a.m222758b();
        this.f20142c0 = C22507a.m222758b();
        this.f20145d0 = C22508b.m222767b();
        this.f20148e0 = C22508b.m222767b();
        this.f20154g0 = new xgw<>(20);
        this.f20157h0 = false;
        this.f20160i0 = null;
        this.f20166k0 = 1;
        this.f20169l0 = -1;
        this.f20172m0 = C22507a.m222758b();
        this.f20175n0 = 0L;
        this.f20178o0 = 0L;
        this.f20181p0 = 0L;
        this.f20184q0 = 0L;
        this.f20187r0 = new HashSet<>();
        this.f20193t0 = new jxd0("has_shown_first_like_alert_" + CoreModule.m30929H().userId(), bool);
        this.f20196u0 = new jxd0("has_shown_first_superlike_alert_" + CoreModule.m30929H().userId(), bool);
        this.f20199v0 = new jxd0("has_shown_first_dislike_alert_" + CoreModule.m30929H().userId(), bool);
        this.f20202w0 = new jxd0("has_shown_first_swipe_cover", bool);
        this.f20205x0 = new jxd0("need_show_upload_photo_btn_" + CoreModule.m30929H().userId(), bool);
        this.f20208y0 = 0;
        this.f20211z0 = 0;
        this.f20062A0 = 0;
        this.f20065B0 = C22508b.m222767b();
        this.f20071D0 = new vxd0("swipe_not_match_see_purchase_guide_times_" + CoreModule.m30929H().userId(), 0);
        this.f20074E0 = new byd0("swipe_not_match_see_purchase_guide_last_time_" + CoreModule.m30929H().userId(), 0L);
        this.f20077F0 = C22507a.m222758b();
        this.f20080G0 = 0;
        this.f20083H0 = new byd0("swipe_not_match_count_for_gp_subs_date_" + CoreModule.m30929H().userId(), 0L);
        this.f20086I0 = C22507a.m222758b();
        this.f20089J0 = C22508b.m222767b();
        this.f20092K0 = C22507a.m222758b();
        this.f20095L0 = C22507a.m222758b();
        this.f20098M0 = new vxd0("gp_miss_match_version_" + CoreModule.m30929H().userId(), 0);
        this.f20101N0 = new vxd0("swipe_left_count_" + CoreModule.m30929H().userId(), 0);
        this.f20103O0 = new byd0("last_swipe_left_date" + CoreModule.m30929H().userId(), 0L);
        this.f20105P0 = new byd0("gp_miss_match_show_date_" + CoreModule.m30929H().userId(), 0L);
        this.f20107Q0 = new vxd0("gp_miss_match_toast_show_count_" + CoreModule.m30929H().userId(), 0);
        this.f20110R0 = C22507a.m222758b();
        this.f20113S0 = new jxd0("has_show_guide_to_kankan_card" + CoreModule.m30929H().userId(), bool);
        this.f20116T0 = new vxd0("kankan_guide_swipe_count" + CoreModule.m30929H().userId(), 0);
        this.f20119U0 = new jxd0("all_female_show_debug_flag", bool);
        this.f20122V0 = new jxd0("debug_all_user_letter", bool);
        this.f20125W0 = new jxd0("debug_all_user_new_like", bool);
        this.f20128X0 = new HashMap<>();
        this.f20131Y0 = new wyd0("intl_fake_suggest_user_01_" + CoreModule.m30929H().userId(), "");
        this.f20134Z0 = new wyd0("intl_fake_suggest_user_02_" + CoreModule.m30929H().userId(), "");
        this.f20137a1 = new wyd0("intl_fake_suggest_user_03_" + CoreModule.m30929H().userId(), "");
        this.f20140b1 = new wyd0("slide_card_rewards_day_swipe_date" + CoreModule.m30929H().userId(), "");
        this.f20143c1 = new wyd0("show_slide_card_rewards_dlg_day" + CoreModule.m30929H().userId(), "");
        this.f20146d1 = new byd0("slide_card_rewards_day_swipe_count" + CoreModule.m30929H().userId(), 0L);
        this.f20149e1 = new jxd0("has_show_filter_guide_bubble_" + CoreModule.m30929H().userId(), bool);
        this.f20152f1 = new byd0("daily_message_mills_" + CoreModule.m30929H().userId(), 0L);
        this.f20155g1 = new vxd0("daily_message_count_" + CoreModule.m30929H().userId(), 0);
        this.f20158h1 = new xyd0("has_show_add_book_movies_dramas_status_dlg_passive_" + CoreModule.m30929H().userId(), new HashSet());
        this.f20161i1 = new vxd0("fake_and_good_upload_photo_dialog_" + CoreModule.m30929H().userId(), 0);
        this.f20164j1 = new byd0("good_or_fake_upload_photo_" + CoreModule.m30929H().userId(), 0L);
        String str = "show_my_tab_sides_slip_dot_" + CoreModule.m30929H().userId();
        Boolean bool2 = Boolean.TRUE;
        this.f20167k1 = new jxd0(str, bool2);
        this.f20170l1 = new jxd0("show_chat_and_dot_" + CoreModule.m30929H().userId(), bool);
        this.f20173m1 = new jxd0("is_first_click_anti_harass_dlg_" + CoreModule.m30929H().userId(), bool2);
        this.f20176n1 = new jxd0("show_my_tab_sides_slip_share_dot" + CoreModule.m30929H().userId(), bool2);
        this.f20179o1 = new jxd0("show_my_tab_sides_slip_flash_dot" + CoreModule.m30929H().userId(), bool2);
        this.f20182p1 = new wyd0("oms_is_show_dot" + CoreModule.m30929H().userId(), "");
        this.f20185q1 = new wyd0("marry_suggest_user_today_time" + CoreModule.m30929H().userId(), "");
        this.f20188r1 = new wyd0("marry_suggest_user_today_data" + CoreModule.m30929H().userId(), "");
        this.f20191s1 = new jxd0("card_opt_debug", bool);
        this.f20194t1 = new jxd0("mock_america", bool);
        this.f20197u1 = new jxd0("card_opt_debug_view", bool);
        this.f20200v1 = new jxd0("card_live_debug", bool);
        this.f20203w1 = new jxd0("card4To3Debug" + CoreModule.m30929H().userId(), bool);
        this.f20206x1 = new byd0("oof_bubble_guide_show_time" + CoreModule.m30929H().userId(), 0L);
        this.f20209y1 = new jxd0("dynamicBottomDebug" + CoreModule.m30929H().userId(), bool);
        this.f20212z1 = new jxd0("preload_suggest_list", bool);
        this.f20063A1 = new jxd0("selected_tab_authentication" + CoreModule.m30929H().userId(), bool);
        this.f20066B1 = new wyd0("marry_mode_specific_suggest_user" + CoreModule.m30929H().userId(), "");
        this.f20069C1 = new jxd0("city_c_purchase_success_record" + CoreModule.m30929H().userId(), bool);
        this.f20072D1 = new jxd0("cityCInsertDebug", bool);
        this.f20075E1 = new jxd0("new_old_card", bool);
        this.f20078F1 = new jxd0("user_expanded_card", bool);
        this.f20081G1 = new jxd0("user_expanded_card_intl", bool2);
        this.f20084H1 = new jxd0("user_expanded_card_intl_home", bool2);
        this.f20087I1 = new jxd0("user_expanded_card_close", bool);
        this.f20090J1 = new jxd0("user_expanded_card_idealType_enable", bool);
        this.f20093K1 = new byd0("card_show_certification_guidance_item" + CoreModule.m30929H().userId(), 0L);
        this.f20096L1 = new wyd0("card_show_certification_guidance_item_user_id" + CoreModule.m30929H().userId(), "");
        this.f20099M1 = new byd0("show_Certification_Segmentation_dlg_Time" + CoreModule.m30929H().userId(), 0L);
        this.f20102N1 = new jxd0("home_card_only_focus_authentication_guidance" + CoreModule.m30929H().userId(), bool);
        this.f20104O1 = 0;
        this.f20106P1 = 0;
        this.f20108Q1 = false;
        this.f20111R1 = new HashMap<>();
        this.f20114S1 = new HashMap<>();
        this.f20117T1 = false;
        this.f20120U1 = false;
        this.f20123V1 = C22508b.m222767b();
        this.f20126W1 = C22508b.m222767b();
        this.f20129X1 = C22508b.m222767b();
        this.f20132Y1 = new ConcurrentHashMap();
        this.f20135Z1 = new ConcurrentHashMap();
        this.f20138a2 = new ConcurrentHashMap();
        this.f20141b2 = new HashSet<>();
        this.f20144c2 = new HashSet<>();
        this.f20147d2 = new HashSet<>();
        this.f20150e2 = new C4897l(this.f91137Q);
        this.f20153f2 = C22508b.m222767b();
        this.f20156g2 = C22508b.m222767b();
        this.f20159h2 = C22508b.m222767b();
        this.f20162i2 = C22508b.m222767b();
        this.f20165j2 = C22508b.m222767b();
        this.f20168k2 = C22508b.m222767b();
        this.f20171l2 = C22508b.m222767b();
        this.f20174m2 = C22508b.m222767b();
        this.f20177n2 = C22508b.m222767b();
        this.f20180o2 = "";
        this.f20183p2 = false;
        this.f20186q2 = new int[]{-1, -1, -1};
        this.f20189r2 = "default";
        this.f20192s2 = -1;
        this.f20195t2 = new HashMap();
        this.f20198u2 = new jxd0("filter_ideal_suggest_" + CoreModule.m30929H().userId(), bool);
        this.f20201v2 = new byd0("last_filter_ideal_time" + CoreModule.m30929H().userId(), 0L);
        this.f20204w2 = new jxd0("fake_insert__ideal_suggest_" + CoreModule.m30929H().userId(), bool);
        this.f20207x2 = C22507a.m222758b();
        this.f20067B2 = C22507a.m222758b();
        this.f20070C2 = false;
        this.f20073D2 = C22508b.m222767b();
        this.f20076E2 = C22507a.m222758b();
        this.f20079F2 = C22508b.m222767b();
        this.f20082G2 = 0;
        this.f20085H2 = C22507a.m222758b();
        this.f20088I2 = C22507a.m222759c(pf60.m172085a(SwipeDirection.fromValue(0), null));
        this.f20091J2 = 0L;
        this.f20094K2 = false;
        this.f20097L2 = C22507a.m222758b();
        this.f20100M2 = "/users/me/see-portraits-v3";
    }

    /* JADX INFO: renamed from: C3 */
    public static /* synthetic */ int m31854C3(LiteraturesComments literaturesComments, LiteraturesComments literaturesComments2) {
        return (int) (literaturesComments2.updatedTime - literaturesComments.updatedTime);
    }

    /* JADX INFO: renamed from: G3 */
    public static /* synthetic */ User m31862G3(User user) {
        return user;
    }

    /* JADX INFO: renamed from: J4 */
    public static /* synthetic */ void m31869J4(CommonData commonData) {
        if (jyb.m147479J(commonData.users)) {
            return;
        }
        CoreModule.m30932N().mo61498Rf(jyb.m147486Q(commonData.users, new qcj() { // from class: l.p5b
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((User) obj).f56859id;
            }
        }));
    }

    /* JADX INFO: renamed from: K4 */
    public static /* synthetic */ Relationship m31871K4(Envelope envelope) {
        if (!jyb.m147479J(((CoreData) envelope.getModuleData(CoreData.class)).relationships)) {
            return ((CoreData) envelope.getModuleData(CoreData.class)).relationships.get(0);
        }
        Relationship relationshipNew_ = Relationship.new_();
        relationshipNew_.state = RelationshipStatus.get("unknown_");
        return relationshipNew_;
    }

    /* JADX INFO: renamed from: Q3 */
    public static /* synthetic */ Envelope m31882Q3(final String str, String str2, Envelope envelope) {
        if (!jyb.m147479J(((CoreData) envelope.getModuleData(CoreData.class)).relationships)) {
            Relationship relationship = (Relationship) jyb.m147529r(((CoreData) envelope.getModuleData(CoreData.class)).relationships, new qcj() { // from class: l.p1b
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(((Relationship) obj).f39654id.equals(str));
                }
            });
            if (NullChecker.m82486a(relationship) && str.equals(relationship.f39654id) && relationship.relationshipExtensions == null) {
                RelationshipExtensions relationshipExtensionsNew_ = RelationshipExtensions.new_();
                relationshipExtensionsNew_.otherLetter = str2;
                relationship.relationshipExtensions = relationshipExtensionsNew_;
            }
        }
        return envelope;
    }

    /* JADX INFO: renamed from: V3 */
    public static /* synthetic */ int m31892V3(ProfileLikeComment profileLikeComment, ProfileLikeComment profileLikeComment2) {
        return (int) (profileLikeComment2.createdTime - profileLikeComment.createdTime);
    }

    /* JADX INFO: renamed from: X3 */
    public static /* synthetic */ int m31896X3(User user, User user2) {
        return user2.popLevel - user.popLevel;
    }

    /* JADX INFO: renamed from: Z4 */
    public static /* synthetic */ void m31901Z4(PartialListOpt partialListOpt) {
        if (!NullChecker.m82486a(partialListOpt) || partialListOpt.loaded.isEmpty() || gta.m132210e().m132214d().mo34804ar()) {
            return;
        }
        gta.m132210e().m132214d().mo34865jo(partialListOpt.loaded);
    }

    /* JADX INFO: renamed from: a3 */
    public static /* synthetic */ void m31902a3(User user) {
        if (user.hasPic()) {
            uqb0.f180374G.m127157u0(gta.m132210e().m132214d().mo34785Xf(user.media(0)));
        }
    }

    /* JADX INFO: renamed from: b5 */
    public static /* synthetic */ String m31907b5(String str, String str2) {
        return "tantanapp://userCard?uid=" + str;
    }

    /* JADX INFO: renamed from: c4 */
    public static /* synthetic */ void m31909c4() {
        CoreModule.f18264c.f20300D0.m35845R4();
        CoreModule.f18264c.f20300D0.f20876Y = true;
    }

    /* JADX INFO: renamed from: g5 */
    public static /* synthetic */ C22421c m31922g5(C22421c c22421c) {
        return c22421c;
    }

    /* JADX INFO: renamed from: i3 */
    public static /* synthetic */ void m31926i3(Throwable th) {
    }

    /* JADX INFO: renamed from: l5 */
    public static /* synthetic */ void m31937l5(Throwable th) {
    }

    /* JADX INFO: renamed from: m5 */
    public static /* synthetic */ x1d0 m31940m5(String str, boolean z) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("userID", str);
            jSONObject.put(NotificationCompat.CATEGORY_STATUS, z ? "accept" : "reject");
        } catch (JSONException unused) {
        }
        return C4879a.f20236P.auth().m209038l(z1d0.create(Network.JSON, jSONObject.toString())).m209043q(C4879a.m32203G("/users/" + CoreModule.m30929H().userId() + "/fake-suggest")).m209028b();
    }

    /* JADX INFO: renamed from: n4 */
    public static /* synthetic */ void m31942n4() {
    }

    /* JADX INFO: renamed from: s5 */
    public static /* synthetic */ void m31958s5(User user) {
        if (user.hasPic()) {
            uqb0.f180374G.m127157u0(gta.m132210e().m132214d().mo34785Xf(user.media(0)));
        }
    }

    /* JADX INFO: renamed from: t8 */
    private void m31962t8(List<User> list) {
        jyb.m147537z(jyb.m147474E(list), new y20() { // from class: l.l3b
            @Override // p153l.y20
            public final void call(Object obj) {
                CoreSuggested.m31958s5((User) obj);
            }
        });
    }

    /* JADX INFO: renamed from: x3 */
    public static /* synthetic */ void m31972x3(User user) {
        if (user.hasPic()) {
            uqb0.f180374G.m127157u0(gta.m132210e().m132214d().mo34785Xf(user.media(0)));
        }
    }

    /* JADX INFO: renamed from: A5 */
    public final String m31978A5(String str) {
        if (gta.m132210e().m132214d().mo34824er() && !CoreModule.m30930K().me_().isFemale()) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(String.format("&male_show_like=%s", Boolean.valueOf(CoreModule.m30930K().mo31817rg() && CoreModule.m30930K().mo31683Dh() && CoreModule.m30930K().mo31685Dp())));
            str = sb.toString();
        }
        if (gta.m132210e().m132214d().mo34907q0()) {
            str = str + "&authentication=" + this.f20063A1.get();
        }
        if (gta.m132210e().m132214d().mo34719Lc()) {
            str = str + "&pickzone=true";
        }
        if (gta.m132210e().m132214d().mo34950xh()) {
            if (this.f20198u2.get().booleanValue() && pzi0.m174439D(this.f20201v2.get().longValue())) {
                return str + "&filter_ideal=true";
            }
            if (this.f20070C2) {
                return str + "&show_ideal=true";
            }
        }
        return str;
    }

    /* JADX INFO: renamed from: A6 */
    public final void m31979A6(List<UserInfo> list, List<User> list2) {
        int iM31983B6 = m32031N6() ? m31983B6() : 3;
        if (iM31983B6 <= 0 || this.f20108Q1 || jyb.m147479J(list) || jyb.m147479J(list2)) {
            return;
        }
        ArrayList<User> arrayList = new ArrayList(list2);
        Collections.sort(arrayList, new Comparator() { // from class: l.k5b
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return CoreSuggested.m31896X3((User) obj, (User) obj2);
            }
        });
        ArrayList arrayList2 = new ArrayList();
        for (User user : arrayList) {
            for (UserInfo userInfo : list) {
                if (userInfo.f20214id.equals(user.f56859id)) {
                    arrayList2.add(userInfo);
                    break;
                }
            }
            if (arrayList2.size() == iM31983B6 || arrayList2.size() >= list.size()) {
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
    public final /* synthetic */ void m31980A7(Notification notification, UserInfo userInfo, User user, ConversationStatus conversationStatus, boolean z) {
        if (jyb.m147479J(((CoreData) ((Envelope) notification.m222541f()).getModuleData(CoreData.class)).relationships)) {
            return;
        }
        boolean z2 = false;
        Relationship relationship = ((CoreData) ((Envelope) notification.m222541f()).getModuleData(CoreData.class)).relationships.get(0);
        User userM116506Q9 = this.f91137Q.f20381e0.m116506Q9(userInfo.f20214id);
        if (userM116506Q9 == null) {
            if (user == null) {
                return;
            } else {
                userM116506Q9 = user;
            }
        }
        if (gta.m132210e().m132214d().mo34811c() && relationship != null) {
            relationship.conversationStatus = conversationStatus;
        }
        if (z && NullChecker.m82486a(relationship) && NullChecker.m82486a(relationship.relationshipExtensions) && !TEnum.equals(relationship.relationshipExtensions.relationType, RelationshipStatus.SUPERLIKED)) {
            relationship.relationshipExtensions.relationType = RelationshipStatus.get(RelationshipStatus.SUPERLIKED);
            z2 = true;
        }
        userM116506Q9.localRelationship = relationship;
        if (!TEnum.equals(relationship.state, "matched")) {
            if (z2) {
                uqb0.f180405k0.f184355d.upsert(userM116506Q9);
            }
        } else {
            if (user != null) {
                user.localRelationship = userM116506Q9.localRelationship;
            }
            uqb0.f180405k0.f184355d.upsert(userM116506Q9);
            this.f91137Q.f20384f0.m34159vf(userM116506Q9);
        }
    }

    /* JADX INFO: renamed from: A8 */
    public void m31981A8(VirtualCardType virtualCardType) {
        if (!NullChecker.m82486a(this.f20136a0.m222761e()) || jyb.m147479J(this.f20136a0.m222761e().loaded)) {
            return;
        }
        ListIterator<UserInfo> listIterator = this.f20136a0.m222761e().loaded.listIterator();
        while (listIterator.hasNext()) {
            UserInfo next = listIterator.next();
            if (NullChecker.m82486a(next) && virtualCardType == next.virtualCardType) {
                listIterator.remove();
            }
        }
        this.f20136a0.m222761e().setRefreshValue(true);
        C22507a<PartialListOpt<UserInfo>> c22507a = this.f20136a0;
        c22507a.onNext(c22507a.m222761e().setReasonStr(PartialListOpt.RefreshReason.REMOVE_LOCAL_CARD.getReason() + "_" + virtualCardType.getId()));
    }

    /* JADX INFO: renamed from: B5 */
    public final String m31982B5(String str) {
        if (yti0.m217322b().m217331h()) {
            OMSThemeInfo oMSThemeInfoM217325a = yti0.m217322b().m217325a();
            if (NullChecker.m82486a(oMSThemeInfoM217325a)) {
                OMSThemeSuggestStrageryInfo oMSThemeSuggestStrageryInfo = oMSThemeInfoM217325a.suggestStrategy;
                if (!TextUtils.isEmpty(oMSThemeSuggestStrageryInfo.groupID) && !jyb.m147479J(oMSThemeSuggestStrageryInfo.tags)) {
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
    public final int m31983B6() {
        if (this.f20192s2 == -1) {
            try {
                int iOptInt = new JSONObject(RemoteConfig.m80481x().m80485F("low_active_hight_pop")).optInt("count");
                if (iOptInt <= 0) {
                    iOptInt = 0;
                }
                this.f20192s2 = iOptInt;
            } catch (Exception unused) {
            }
        }
        return this.f20192s2;
    }

    /* JADX INFO: renamed from: B7 */
    public final /* synthetic */ void m31984B7(boolean z, uxj0 uxj0Var) {
        if (z) {
            return;
        }
        m32168z5(true);
    }

    /* JADX INFO: renamed from: B8 */
    public void m31985B8(String str) {
        QuickChatCardWrapper quickChatCardWrapper;
        OnlineMatchPushUser broadcastCard;
        if (TextUtils.isEmpty(str) || this.f20136a0.m222761e() == null || jyb.m147479J(this.f20136a0.m222761e().loaded)) {
            return;
        }
        Iterator<UserInfo> it = this.f20136a0.m222761e().loaded.iterator();
        while (it.hasNext()) {
            UserInfo next = it.next();
            if (next != null && (quickChatCardWrapper = next.quickChatCardWrapper) != null && quickChatCardWrapper.isPeiLiao() && (broadcastCard = next.quickChatCardWrapper.getBroadcastCard()) != null && NullChecker.m82486a(broadcastCard.user) && str.equals(broadcastCard.user.f56859id)) {
                this.f20130Y.remove(next.f20214id);
                it.remove();
                this.f20136a0.m222761e().setRefreshValue(true);
                C22507a<PartialListOpt<UserInfo>> c22507a = this.f20136a0;
                c22507a.onNext(c22507a.m222761e().setReason(PartialListOpt.RefreshReason.removePeiLiaoUsersByIdIfNeed));
                return;
            }
        }
    }

    /* JADX INFO: renamed from: C5 */
    public void m31986C5() {
        this.f20118U = true;
        m32042Q5();
        m32046R5();
        this.f91137Q.f20429u0.m31458m5();
        this.f91137Q.f20429u0.m31455l5();
        this.f20121V.onNext(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: C6 */
    public final void m31987C6(List<UserInfo> list, UserInfo userInfo) {
        Iterator<UserInfo> it = list.iterator();
        while (it.hasNext()) {
            if (TextUtils.equals(userInfo.f20214id, it.next().f20214id)) {
                it.remove();
            }
        }
    }

    /* JADX INFO: renamed from: C7 */
    public final /* synthetic */ void m31988C7(boolean z, Throwable th) {
        if (z) {
            return;
        }
        m32168z5(false);
    }

    /* JADX INFO: renamed from: C8 */
    public void m31989C8(String str) {
        if (NullChecker.m82486a(this.f20136a0.m222761e()) && !jyb.m147479J(this.f20136a0.m222761e().loaded)) {
            if (NullChecker.m82486a(this.f20139b0.m222761e())) {
                CardPattern cardPattern = (CardPattern) jyb.m147529r(this.f20139b0.m222761e().pageFormat.cardPatterns, new qcj() { // from class: l.q1b
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return this.f155165a.m32004G7((CardPattern) obj);
                    }
                });
                if (NullChecker.m82486a(cardPattern)) {
                    this.f20139b0.m222761e().pageFormat.cardPatterns.remove(cardPattern);
                }
            }
            this.f20136a0.m222761e().loaded.remove(0);
        }
        this.f20136a0.m222761e().setRefreshValue(true);
        C22507a<PartialListOpt<UserInfo>> c22507a = this.f20136a0;
        c22507a.onNext(c22507a.m222761e().setReasonStr(PartialListOpt.RefreshReason.REMOVE_TOP.getReason() + "_" + str));
        m32086b6(true);
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
    public List<UserInfo> m31990D5(Envelope envelope, List<User> list) {
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
        coreSuggested.m32062V5(((CoreData) envelope.getModuleData(CoreData.class)).superLikeCount);
        HashMap<String, List<Media>> map14 = new HashMap<>();
        HashMap<String, String> map15 = new HashMap<>();
        CoreModule.m30932N().mo61590zd(envelope, map15);
        if (gta.m132210e().m132214d().mo34921s()) {
            CoreModule.m30932N().mo61457Ee(envelope, map14);
        }
        HashMap map16 = new HashMap();
        if (gta.m132210e().m132214d().mo34943w()) {
            List<CoreMomentInfo> listMo61450Ca = CoreModule.m30932N().mo61450Ca(envelope, CoreMomentInfo.JSON_ADAPTER);
            if (!jyb.m147479J(listMo61450Ca)) {
                for (CoreMomentInfo coreMomentInfo : listMo61450Ca) {
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
        if (!jyb.m147479J(((CommonData) envelope.getModuleData(CommonData.class)).users)) {
            for (User user : ((CommonData) envelope.getModuleData(CommonData.class)).users) {
                if (NullChecker.m82486a(user.settings) && NullChecker.m82486a(user.settings.omsSetting) && !jyb.m147479J(user.settings.omsSetting.tags)) {
                    for (OmsNewTags omsNewTags : user.settings.omsSetting.tags) {
                        NewTags newTagsNew_ = NewTags.new_();
                        String str = omsNewTags.f39649id;
                        newTagsNew_.f21199id = str;
                        newTagsNew_.name = omsNewTags.name;
                        newTagsNew_.categories = omsNewTags.categories;
                        newTagsNew_.icon = omsNewTags.icon;
                        newTagsNew_.status = omsNewTags.status;
                        newTagsNew_.localTagUserCounts = omsNewTags.count;
                        map17.put(str, newTagsNew_);
                    }
                }
            }
            coreSuggested.f20145d0.onNext(map17);
        }
        HashMap map18 = new HashMap();
        if (!jyb.m147479J(((CoreData) envelope.getModuleData(CoreData.class)).cardsIcons)) {
            for (CardsIcons cardsIcons : ((CoreData) envelope.getModuleData(CoreData.class)).cardsIcons) {
                if (NullChecker.m82486a(cardsIcons) && cardsIcons.likedMeBottomIcon.icon.contains("liked_me")) {
                    map18.put(cardsIcons.userId, cardsIcons.likedMeBottomIcon.context);
                }
            }
        }
        List<CardCornerMark> list3 = ((CoreData) envelope.getModuleData(CoreData.class)).cardCornerMarks;
        HashMap map19 = new HashMap();
        List<SuggestedComplimentItem> list4 = ((CoreData) envelope.getModuleData(CoreData.class)).compliments;
        if (!jyb.m147479J(list4)) {
            for (SuggestedComplimentItem suggestedComplimentItem : list4) {
                if (NullChecker.m82486a(suggestedComplimentItem) && !TextUtils.isEmpty(suggestedComplimentItem.senderId)) {
                    map19.putIfAbsent(suggestedComplimentItem.senderId, suggestedComplimentItem);
                }
            }
        }
        HashMap map20 = new HashMap();
        if (CoreModule.m30932N().mo61478M8() && !jyb.m147479J(((CoreData) envelope.getModuleData(CoreData.class)).states)) {
            for (BubbleInfo bubbleInfo : ((CoreData) envelope.getModuleData(CoreData.class)).states) {
                if (NullChecker.m82486a(bubbleInfo) && NullChecker.m82486a(bubbleInfo.owner)) {
                    map20.put(bubbleInfo.owner.f39651id, bubbleInfo);
                }
            }
        }
        HashMap map21 = new HashMap();
        if (!jyb.m147479J(((CoreData) envelope.getModuleData(CoreData.class)).cardStyles)) {
            for (CardStyle cardStyle : ((CoreData) envelope.getModuleData(CoreData.class)).cardStyles) {
                if (NullChecker.m82486a(cardStyle) && cardStyle.label.contains("liked_me")) {
                    String str2 = cardStyle.userId;
                    map21.put(str2, str2);
                }
            }
        }
        HashMap map22 = new HashMap();
        if (!jyb.m147479J(((CoreData) envelope.getModuleData(CoreData.class)).cardModels)) {
            for (CardModel cardModel : ((CoreData) envelope.getModuleData(CoreData.class)).cardModels) {
                if (NullChecker.m82486a(cardModel) && !jyb.m147479J(cardModel.dynamicLabels)) {
                    map22.put(cardModel.userId, cardModel.dynamicLabels);
                }
            }
        }
        HashMap map23 = new HashMap();
        if (!jyb.m147479J(((CoreData) envelope.getModuleData(CoreData.class)).dynamicLabels)) {
            Iterator<DynamicLable> it3 = ((CoreData) envelope.getModuleData(CoreData.class)).dynamicLabels.iterator();
            while (it3.hasNext()) {
                DynamicLable next = it3.next();
                if (NullChecker.m82486a(next)) {
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
        if (!jyb.m147479J(((CoreData) envelope.getModuleData(CoreData.class)).likedMes)) {
            Iterator<CardStyle> it4 = ((CoreData) envelope.getModuleData(CoreData.class)).likedMes.iterator();
            while (it4.hasNext()) {
                Iterator<CardStyle> it5 = it4;
                CardStyle next2 = it4.next();
                if (NullChecker.m82486a(next2)) {
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
        if (gta.m132210e().m132214d().mo34684Er() && !jyb.m147479J(((CoreData) envelope.getModuleData(CoreData.class)).literatures)) {
            for (Iterator<Literatures> it6 = ((CoreData) envelope.getModuleData(CoreData.class)).literatures.iterator(); it6.hasNext(); it6 = it6) {
                Literatures next3 = it6.next();
                if (NullChecker.m82486a(next3)) {
                    map30.put(next3.f21175id, next3);
                }
            }
        }
        HashMap map31 = new HashMap();
        if (gta.m132210e().m132214d().mo34684Er() && !jyb.m147479J(((CoreData) envelope.getModuleData(CoreData.class)).literaturesComments)) {
            Iterator<LiteraturesComments> it7 = ((CoreData) envelope.getModuleData(CoreData.class)).literaturesComments.iterator();
            while (it7.hasNext()) {
                it7 = it7;
                LiteraturesComments next4 = it7.next();
                if (next4 != null) {
                    HashMap map32 = map30;
                    HashMap<String, List<Media>> map33 = map14;
                    if (CoreModule.f18264c.f20381e0.m116516T7(next4.literatureID)) {
                        HashMap map34 = map18;
                        LiteraturesComments literaturesCommentsM116494N9 = CoreModule.f18264c.f20381e0.m116494N9(CoreModule.m30929H().userId(), next4.literatureID);
                        if (NullChecker.m82486a(literaturesCommentsM116494N9)) {
                            next4.updatedTime = literaturesCommentsM116494N9.updatedTime;
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
        if (gta.m132210e().m132214d().mo34943w() && !jyb.m147479J(((CoreData) envelope.getModuleData(CoreData.class)).literaturesComments)) {
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
        if (gta.m132210e().m132214d().mo34858is() && !jyb.m147479J(((CoreData) envelope.getModuleData(CoreData.class)).profileLikesComments)) {
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
        if (!jyb.m147479J(list5)) {
            Iterator<RecommendMessage> it10 = list5.iterator();
            while (it10.hasNext()) {
                Iterator<RecommendMessage> it11 = it10;
                RecommendMessage next6 = it10.next();
                if (NullChecker.m82486a(next6)) {
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
        if (!jyb.m147479J(list6)) {
            Iterator<UserGreetInfo> it12 = list6.iterator();
            while (it12.hasNext()) {
                Iterator<UserGreetInfo> it13 = it12;
                UserGreetInfo next7 = it12.next();
                if (NullChecker.m82486a(next7)) {
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
        if (!jyb.m147479J(((CoreData) envelope.getModuleData(CoreData.class)).cardExtraInfos)) {
            Iterator<CardExtraInfo> it16 = ((CoreData) envelope.getModuleData(CoreData.class)).cardExtraInfos.iterator();
            while (it16.hasNext()) {
                Iterator<CardExtraInfo> it17 = it16;
                CardExtraInfo next9 = it16.next();
                if (NullChecker.m82486a(next9)) {
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
        if (!jyb.m147479J(((CoreData) envelope.getModuleData(CoreData.class)).cardModels)) {
            Iterator<CardModel> it18 = ((CoreData) envelope.getModuleData(CoreData.class)).cardModels.iterator();
            while (it18.hasNext()) {
                Iterator<CardModel> it19 = it18;
                CardModel next10 = it18.next();
                if (NullChecker.m82486a(next10)) {
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
        if (!jyb.m147479J(((CoreData) envelope.getModuleData(CoreData.class)).moments)) {
            for (Iterator<CoreMomentInfo> it20 = ((CoreData) envelope.getModuleData(CoreData.class)).moments.iterator(); it20.hasNext(); it20 = it20) {
                CoreMomentInfo next11 = it20.next();
                if (NullChecker.m82486a(next11)) {
                    map50.put(next11.f56856id, next11);
                }
            }
        }
        HashMap map51 = new HashMap();
        if (!jyb.m147479J(((CoreData) envelope.getModuleData(CoreData.class)).cardInfos)) {
            Iterator<CardInfos> it21 = ((CoreData) envelope.getModuleData(CoreData.class)).cardInfos.iterator();
            while (it21.hasNext()) {
                Iterator<CardInfos> it22 = it21;
                CardInfos next12 = it21.next();
                if (NullChecker.m82486a(next12)) {
                    map51.put(next12.userId, next12);
                }
                map44 = map44;
                it21 = it22;
            }
        }
        HashMap map52 = map44;
        HashMap map53 = new HashMap();
        if (!jyb.m147479J(((CoreData) envelope.getModuleData(CoreData.class)).idealInfos)) {
            Iterator<IdealInfo> it23 = ((CoreData) envelope.getModuleData(CoreData.class)).idealInfos.iterator();
            while (it23.hasNext()) {
                Iterator<IdealInfo> it24 = it23;
                IdealInfo next13 = it23.next();
                if (NullChecker.m82486a(next13)) {
                    map53.put(next13.f21163id, next13);
                }
                map25 = map25;
                it23 = it24;
            }
        }
        HashMap map54 = map25;
        HashMap map55 = new HashMap();
        HashMap map56 = new HashMap();
        HashSet hashSet6 = hashSet3;
        if (!jyb.m147479J(((CoreData) envelope.getModuleData(CoreData.class)).cardModels)) {
            Iterator<CardModel> it25 = ((CoreData) envelope.getModuleData(CoreData.class)).cardModels.iterator();
            while (it25.hasNext()) {
                Iterator<CardModel> it26 = it25;
                CardModel next14 = it25.next();
                if (NullChecker.m82486a(next14) && next14.isRecommendMomentCard() && gta.m132210e().m132214d().mo34810bq()) {
                    hashSet2 = hashSet4;
                    if (map51.containsKey(next14.userId)) {
                        CardInfos cardInfos = (CardInfos) map51.get(next14.userId);
                        if (NullChecker.m82486a(cardInfos)) {
                            cardInfos.momentLikedYou = next14.momentLikedYou || !TextUtils.isEmpty((CharSequence) map27.get(next14.userId));
                            map51.put(next14.userId, cardInfos);
                        }
                    }
                    map55.put(next14.userId, Boolean.valueOf(next14.isRecommendMomentCard()));
                    if (NullChecker.m82486a(next14.extraData)) {
                        map56.put(next14.userId, next14.extraData.momentId);
                    }
                } else {
                    map21 = map21;
                    hashSet2 = hashSet4;
                }
                if (CoreModule.m30933P().m143408e().mo35993wq() && map51.containsKey(next14.userId)) {
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
        if (CoreModule.m30933P().m143410g().mo36051b8()) {
            List<Relationship> list8 = ((CoreData) envelope.getModuleData(CoreData.class)).relationships;
            if (!jyb.m147479J(list8)) {
                Iterator<Relationship> it27 = list8.iterator();
                while (it27.hasNext()) {
                    Relationship next15 = it27.next();
                    if (NullChecker.m82486a(next15)) {
                        it = it27;
                        if (jyb.m147479J(next15.status)) {
                            map9 = map27;
                        } else {
                            map9 = map27;
                            if (next15.status.contains(MatchFrom.get("pinLike"))) {
                                map58.put(next15.f39654id, next15);
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
        if (CoreModule.f18276o.m132214d().mo34719Lc()) {
            List<CardModel> list9 = ((CoreData) envelope.getModuleData(CoreData.class)).cardModels;
            if (!jyb.m147479J(list9)) {
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
        CoreModule.m30934Q().mo68404He(map60, map61, envelope);
        HashSet hashSet10 = new HashSet();
        if (CoreModule.f18276o.m132214d().mo34801ak() || gta.m132210e().m132214d().mo34956yg()) {
            map = map58;
            List<FakePhotoFeedback> list10 = ((CoreData) envelope.getModuleData(CoreData.class)).fakePhotoFeedback;
            if (!jyb.m147479J(list10)) {
                Iterator<FakePhotoFeedback> it30 = list10.iterator();
                while (it30.hasNext()) {
                    Iterator<FakePhotoFeedback> it31 = it30;
                    FakePhotoFeedback next17 = it30.next();
                    HashMap<String, ValueObject> map62 = map61;
                    HashMap<String, ValueObject> map63 = map60;
                    if (next17.show == 1) {
                        hashSet10.add(next17.f21132id);
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
        if (gta.m132210e().m132214d().mo34943w()) {
            List<Device> list11 = ((CommonData) envelope.getModuleData(CommonData.class)).devices;
            if (!jyb.m147479J(list11)) {
                for (Iterator<Device> it32 = list11.iterator(); it32.hasNext(); it32 = it32) {
                    Device next18 = it32.next();
                    map66.put(next18.f39586id, next18.name);
                }
            }
            List<IPRegion> list12 = ((CoreData) envelope.getModuleData(CoreData.class)).ipRegion;
            if (!jyb.m147479J(list12)) {
                for (Iterator<IPRegion> it33 = list12.iterator(); it33.hasNext(); it33 = it33) {
                    IPRegion next19 = it33.next();
                    map67.put(next19.f21160id, next19);
                }
            }
        }
        HashMap map68 = new HashMap();
        if (CoreModule.m30933P().m143405a().mo34546m7()) {
            List<CreditScoreData> list13 = ((CoreData) envelope.getModuleData(CoreData.class)).creditScores;
            if (!jyb.m147479J(list13)) {
                for (CreditScoreData creditScoreData : list13) {
                    map68.put(creditScoreData.f21126id, creditScoreData);
                }
            }
        }
        ArrayList arrayList11 = new ArrayList();
        if (!jyb.m147479J(list)) {
            Iterator<User> it34 = list.iterator();
            while (it34.hasNext()) {
                User next20 = it34.next();
                it34 = it34;
                if (NullChecker.m82486a(next20)) {
                    ArrayList arrayList12 = arrayList11;
                    if (coreSuggested.f20130Y.contains(next20.f56859id)) {
                        arrayList = arrayList12;
                    } else if (coreSuggested.f20085H2.m222761e() == null || jyb.m147479J(coreSuggested.f20085H2.m222761e().f184001a) || !coreSuggested.f20085H2.m222761e().f184001a.get(0).equals(next20.f56859id)) {
                        UserInfo userInfo = new UserInfo();
                        CardInfos cardInfos3 = (CardInfos) map51.get(next20.f56859id);
                        String str4 = next20.f56859id;
                        userInfo.f20214id = str4;
                        userInfo.ussTags = next20.ussTags;
                        userInfo.hierarchy = next20.hierarchy;
                        userInfo.recommendMessage = (List) map40.get(str4);
                        userInfo.hasMoment = map15.containsKey(userInfo.f20214id);
                        userInfo.isThemeCard = hashSet5.contains(userInfo.f20214id);
                        userInfo.isCoreMomentCard = map55.containsKey(userInfo.f20214id);
                        userInfo.idealInfo = (IdealInfo) map53.get(userInfo.f20214id);
                        String str5 = (String) map56.get(userInfo.f20214id);
                        if (TextUtils.isEmpty(str5)) {
                            userInfo.coreMomentInfo = null;
                        } else {
                            userInfo.coreMomentInfo = (CoreMomentInfo) map50.get(str5);
                        }
                        CardInfos cardInfosNew_ = cardInfos3 == null ? CardInfos.new_() : cardInfos3;
                        cardInfosNew_.momentId = str5;
                        userInfo.cardInfos = cardInfosNew_;
                        if (gta.m132210e().m132212b().mo34652wf() && (!next20.isFemale() || next20.superLikedMe() || next20.letter())) {
                            map5 = map57;
                            z = true;
                        } else {
                            map5 = map57;
                            z = true;
                            userInfo.hasLikeMeSlideCardTop = !TextUtils.isEmpty((CharSequence) map5.get(userInfo.f20214id));
                        }
                        map57 = map5;
                        HashSet hashSet11 = hashSet7;
                        if (hashSet11.contains(userInfo.f20214id)) {
                            userInfo.meetAgain = z;
                        }
                        hashSet7 = hashSet11;
                        HashSet hashSet12 = hashSet6;
                        if (hashSet12.contains(userInfo.f20214id)) {
                            userInfo.newUser = true;
                        }
                        hashSet6 = hashSet12;
                        map54 = map54;
                        if (map54.containsKey(userInfo.f20214id)) {
                            userInfo.friendSenseExamLikeCnt = ((Integer) map54.get(userInfo.f20214id)).intValue();
                        }
                        if (CoreModule.m30933P().m143410g().mo36090yc()) {
                            map52 = map52;
                            userInfo.userActivityInfo = (UserActivityInfo) map52.get(userInfo.f20214id);
                        } else {
                            map52 = map52;
                        }
                        if (CoreModule.m30932N().mo61478M8()) {
                            map6 = map49;
                            userInfo.userState = (BubbleInfo) map6.get(userInfo.f20214id);
                        } else {
                            map6 = map49;
                        }
                        map49 = map6;
                        HashMap map69 = map37;
                        userInfo.hasLikeMeFrom = (String) map69.get(userInfo.f20214id);
                        if (NullChecker.m82486a(null)) {
                            throw null;
                        }
                        if (gta.m132210e().m132214d().mo34824er()) {
                            map37 = map69;
                            map7 = map59;
                            if (gta.m132210e().m132214d().mo34897oe()) {
                                userInfo.hasLikeMeSlideCardReward = !TextUtils.isEmpty((CharSequence) map7.get(userInfo.f20214id));
                            }
                        } else {
                            map37 = map69;
                            map7 = map59;
                            userInfo.hasLikeMeSlideCardBottom = !TextUtils.isEmpty((CharSequence) map7.get(userInfo.f20214id));
                        }
                        if (gta.m132210e().m132214d().mo34921s()) {
                            map59 = map7;
                            map8 = map35;
                            if (map8.containsKey(userInfo.f20214id)) {
                                userInfo.userMedia = map8.get(userInfo.f20214id);
                            }
                        } else {
                            map59 = map7;
                            map8 = map35;
                        }
                        map35 = map8;
                        userInfo.compliment = (SuggestedComplimentItem) map29.get(userInfo.f20214id);
                        HashMap map70 = map28;
                        if (map70.containsKey(userInfo.f20214id)) {
                            userInfo.coreMomentInfoList = (List) map70.get(userInfo.f20214id);
                        }
                        map28 = map70;
                        map48 = map48;
                        if (map48.containsKey(userInfo.f20214id)) {
                            userInfo.descriptionContent = ((CardExtraInfo) map48.get(userInfo.f20214id)).descriptionContent;
                            userInfo.descriptionId = ((CardExtraInfo) map48.get(userInfo.f20214id)).descriptionId;
                        }
                        if (map68.containsKey(userInfo.f20214id)) {
                            userInfo.creditScore = (CreditScoreData) map68.get(userInfo.f20214id);
                        } else {
                            userInfo.creditScore = null;
                        }
                        if (gta.m132210e().m132214d().mo34684Er()) {
                            HashMap map71 = map47;
                            if (map71.containsKey(userInfo.f20214id)) {
                                ArrayList arrayList13 = (ArrayList) map71.get(userInfo.f20214id);
                                if (!jyb.m147479J(arrayList13)) {
                                    Collections.sort(arrayList13, new Comparator() { // from class: l.v5b
                                        @Override // java.util.Comparator
                                        public final int compare(Object obj, Object obj2) {
                                            return CoreSuggested.m31854C3((LiteraturesComments) obj, (LiteraturesComments) obj2);
                                        }
                                    });
                                }
                                List<LiteraturesComments> list14 = (List) map71.get(userInfo.f20214id);
                                userInfo.literaturesComments = list14;
                                if (!jyb.m147479J(list14)) {
                                    Iterator<LiteraturesComments> it35 = userInfo.literaturesComments.iterator();
                                    while (it35.hasNext()) {
                                        LiteraturesComments next21 = it35.next();
                                        if (NullChecker.m82486a(next21)) {
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
                        if (gta.m132210e().m132214d().mo34943w()) {
                            map2 = map15;
                            HashMap<String, ValueObject> map72 = map65;
                            map65 = map72;
                            map3 = map50;
                            gta.m132210e().m132214d().mo34701Hq(userInfo.f20214id, map64.get(userInfo.f20214id), map72.get(userInfo.f20214id));
                            HashMap map73 = map43;
                            if (map73.containsKey(userInfo.f20214id)) {
                                ArrayList<LiteraturesComments> arrayList14 = (ArrayList) map73.get(userInfo.f20214id);
                                if (jyb.m147479J(arrayList14)) {
                                    map43 = map73;
                                } else {
                                    for (LiteraturesComments literaturesComments2 : arrayList14) {
                                        if (NullChecker.m82486a(literaturesComments2)) {
                                            literaturesComments2.localLiteratures = (Literatures) map36.get(literaturesComments2.literatureID);
                                            map73 = map73;
                                        }
                                    }
                                    map43 = map73;
                                    CoreModule.f18264c.f20381e0.m116486L9(userInfo.f20214id, arrayList14);
                                }
                            } else {
                                map43 = map73;
                            }
                        } else {
                            map2 = map15;
                            map65 = map65;
                            map3 = map50;
                        }
                        if (gta.m132210e().m132214d().mo34858is()) {
                            map41 = map41;
                            if (map41.containsKey(userInfo.f20214id)) {
                                ArrayList arrayList15 = (ArrayList) map41.get(userInfo.f20214id);
                                if (!jyb.m147479J(arrayList15)) {
                                    Collections.sort(arrayList15, new Comparator() { // from class: l.w5b
                                        @Override // java.util.Comparator
                                        public final int compare(Object obj, Object obj2) {
                                            return CoreSuggested.m31892V3((ProfileLikeComment) obj, (ProfileLikeComment) obj2);
                                        }
                                    });
                                    userInfo.profileLikeCommentId = ((ProfileLikeComment) arrayList15.get(0)).f21217id;
                                }
                            }
                            if (gta.m132210e().m132214d().mo34954y()) {
                                map4 = map45;
                                if (map4.containsKey(userInfo.f20214id)) {
                                    userInfo.canGreet = ((UserGreetInfo) map4.get(userInfo.f20214id)).canGreet;
                                }
                            } else {
                                map4 = map45;
                            }
                            if (CoreModule.m30933P().m143410g().mo36051b8()) {
                                map = map;
                                if (map.containsKey(userInfo.f20214id)) {
                                    userInfo.isPinLike = true;
                                    userInfo.topLikeRelationship = (Relationship) map.get(userInfo.f20214id);
                                }
                            } else {
                                map = map;
                            }
                            userInfo.localRelationship = next20.localRelationship;
                            if (map26.size() > 0) {
                                map26 = map26;
                                list2 = (List) map26.get(userInfo.f20214id);
                                arrayList2 = new ArrayList();
                                if (!jyb.m147479J(list2)) {
                                    i = 0;
                                    while (i < list2.size()) {
                                        String str6 = (String) list2.get(i);
                                        List list15 = list2;
                                        HashMap map74 = map24;
                                        dynamicLable = (DynamicLable) map74.get(str6);
                                        if (NullChecker.m82486a(dynamicLable)) {
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
                            if (gta.m132210e().m132214d().mo34943w()) {
                                gta.m132210e().m132214d().mo34663Bf(userInfo.f20214id, map66, map67);
                            }
                            userInfo.isShowFakePhotoFeedback = hashSet10.contains(userInfo.f20214id);
                            hashSet = hashSet9;
                            userInfo.selectionUser = hashSet.contains(userInfo.f20214id);
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
                        if (gta.m132210e().m132214d().mo34954y()) {
                            map4 = map45;
                            if (map4.containsKey(userInfo.f20214id)) {
                                userInfo.canGreet = ((UserGreetInfo) map4.get(userInfo.f20214id)).canGreet;
                            }
                        } else {
                            map4 = map45;
                        }
                        if (CoreModule.m30933P().m143410g().mo36051b8()) {
                            map = map;
                            if (map.containsKey(userInfo.f20214id)) {
                                userInfo.isPinLike = true;
                                userInfo.topLikeRelationship = (Relationship) map.get(userInfo.f20214id);
                            }
                        } else {
                            map = map;
                        }
                        userInfo.localRelationship = next20.localRelationship;
                        if (map26.size() > 0) {
                            map26 = map26;
                            list2 = (List) map26.get(userInfo.f20214id);
                            arrayList2 = new ArrayList();
                            if (!jyb.m147479J(list2)) {
                                i = 0;
                                while (i < list2.size()) {
                                    String str7 = (String) list2.get(i);
                                    List list16 = list2;
                                    HashMap map75 = map24;
                                    dynamicLable = (DynamicLable) map75.get(str7);
                                    if (NullChecker.m82486a(dynamicLable)) {
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
                        if (gta.m132210e().m132214d().mo34943w()) {
                            gta.m132210e().m132214d().mo34663Bf(userInfo.f20214id, map66, map67);
                        }
                        userInfo.isShowFakePhotoFeedback = hashSet10.contains(userInfo.f20214id);
                        hashSet = hashSet9;
                        userInfo.selectionUser = hashSet.contains(userInfo.f20214id);
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
    public final void m31991D6(List<UserInfo> list, List<User> list2) {
        CoreModule.f18264c.f20334O1.f167127S.toString();
        boolean z = m32019K6() && !joa.m146386f4();
        HashSet hashSet = new HashSet();
        for (User user : list2) {
            if ((z && user.isIntlFaceless()) || user.isIntlSpammerOrScammer() || CoreModule.f18264c.f20334O1.f167127S.contains(user.f56859id)) {
                hashSet.add(user.f56859id);
            }
        }
        Iterator<UserInfo> it = list.iterator();
        while (it.hasNext()) {
            if (hashSet.contains(it.next().f20214id)) {
                it.remove();
            }
        }
    }

    /* JADX INFO: renamed from: D7 */
    public final /* synthetic */ void m31992D7(boolean z, C22507a c22507a, Notification notification) {
        if (notification.m222545j() || notification.m222544i()) {
            m32078Z5(z).subscribe(c22507a);
        }
    }

    /* JADX INFO: renamed from: D8 */
    public void m31993D8(String str) {
        this.f91137Q.f20429u0.m31383C7(str);
        m31997E8(str);
        if (CoreModule.m30933P().m143410g().mo36051b8()) {
            this.f91137Q.f20383e2.m172822v3(str);
        }
    }

    /* JADX INFO: renamed from: E5 */
    public final int m31994E5() {
        if (NullChecker.m82486a(CoreModule.f18264c.f20405m0.f20136a0.m222761e())) {
            List<UserInfo> list = CoreModule.f18264c.f20405m0.f20136a0.m222761e().loaded;
            if (!jyb.m147479J(list)) {
                for (int i = 1; i < list.size(); i += 2) {
                    if (!CoreModule.f18264c.f20405m0.f20187r0.contains(list.get(i).f20214id)) {
                        return i;
                    }
                }
            }
        }
        return 1;
    }

    /* JADX INFO: renamed from: E6 */
    public boolean m31995E6(VoiceLiveState voiceLiveState) {
        return (!NullChecker.m82486a(voiceLiveState) || TextUtils.isEmpty(voiceLiveState.voiceLiveId) || TextUtils.isEmpty(voiceLiveState.anchorId) || TextUtils.isEmpty(voiceLiveState.topDesc) || TextUtils.isEmpty(voiceLiveState.title) || jyb.m147479J(voiceLiveState.messages) || jyb.m147479J(voiceLiveState.avatars)) ? false : true;
    }

    /* JADX INFO: renamed from: E7 */
    public final /* synthetic */ void m31996E7(Envelope envelope) {
        CoreData coreData = (CoreData) envelope.getModuleData(CoreData.class);
        if (TextUtils.isEmpty(coreData.payWill)) {
            return;
        }
        this.f91137Q.f20381e0.f89233g3.put(coreData.payWill);
    }

    /* JADX INFO: renamed from: E8 */
    public void m31997E8(final String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        m32001F8(new qcj() { // from class: l.f1b
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((CoreSuggested.UserInfo) obj).f20214id.equals(str));
            }
        });
        if (CoreModule.m30933P().m143410g().mo36051b8()) {
            this.f91137Q.f20383e2.m172822v3(str);
        }
    }

    /* JADX INFO: renamed from: F5 */
    public void m31998F5(boolean z) {
        if (z || !NullChecker.m82486a(this.f20172m0.m222761e()) || pzi0.m174454o() - this.f20172m0.m222761e().longValue() >= Constants.ONE_MIN_IN_MILLIS) {
            if (m31999F6()) {
                this.f20172m0.onNext(Long.valueOf(pzi0.m174454o()));
                return;
            }
            scheduled("verified-isolation/likedby-info" + pzi0.m174454o(), 0, new pcj() { // from class: l.y4b
                @Override // p153l.pcj, java.util.concurrent.Callable
                public final Object call() {
                    return this.f197443a.m32047R6();
                }
            }).doOnError(new y20() { // from class: l.z4b
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f202920a.m32051S6((Throwable) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: F6 */
    public boolean m31999F6() {
        return m32128m6() >= gta.m132210e().m132214d().mo34955y6();
    }

    /* JADX INFO: renamed from: F7 */
    public final /* synthetic */ C22421c m32000F7() {
        return qi20.m176658e(new pcj() { // from class: l.h2b
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4879a.f20236P.auth().m209043q(C4879a.m32203G("/pay-will")).m209032f().m209028b();
            }
        }).doOnNext(new y20() { // from class: l.i2b
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f112595a.m31996E7((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: F8 */
    public void m32001F8(qcj<UserInfo, Boolean> qcjVar) {
        if (this.f20136a0.m222761e() == null || jyb.m147479J(this.f20136a0.m222761e().loaded)) {
            return;
        }
        Iterator<UserInfo> it = this.f20136a0.m222761e().loaded.iterator();
        while (it.hasNext()) {
            UserInfo next = it.next();
            if (qcjVar.call(next).booleanValue()) {
                this.f20130Y.remove(next.f20214id);
                it.remove();
                this.f20136a0.m222761e().setRefreshValue(true);
                C22507a<PartialListOpt<UserInfo>> c22507a = this.f20136a0;
                c22507a.onNext(c22507a.m222761e().setReason(PartialListOpt.RefreshReason.removeUserFromSuggested));
                return;
            }
        }
    }

    /* JADX INFO: renamed from: G5 */
    public void m32002G5(Envelope envelope) {
        if (gta.m132210e().m132214d().mo34707Is()) {
            List<User> list = ((CommonData) envelope.getModuleData(CommonData.class)).users;
            if (jyb.m147479J(list)) {
                return;
            }
            ListIterator<User> listIterator = list.listIterator();
            while (listIterator.hasNext()) {
                if (m32015J6(listIterator.next())) {
                    listIterator.remove();
                }
            }
        }
    }

    /* JADX INFO: renamed from: G6 */
    public boolean m32003G6() {
        return this.f20136a0.m222761e() == null || jyb.m147479J(this.f20136a0.m222761e().loaded);
    }

    /* JADX INFO: renamed from: G7 */
    public final /* synthetic */ Boolean m32004G7(CardPattern cardPattern) {
        return Boolean.valueOf(cardPattern.userId.equals(this.f20136a0.m222761e().loaded.get(0).f20214id));
    }

    /* JADX INFO: renamed from: G8 */
    public void m32005G8(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (this.f20136a0.m222761e() != null && !jyb.m147479J(this.f20136a0.m222761e().loaded)) {
            Iterator<UserInfo> it = this.f20136a0.m222761e().loaded.iterator();
            while (it.hasNext()) {
                UserInfo next = it.next();
                if (NullChecker.m82486a(next) && str.equals(next.f20214id)) {
                    this.f20130Y.remove(next.f20214id);
                    it.remove();
                    this.f20136a0.m222761e().setRefreshValue(true);
                    C22507a<PartialListOpt<UserInfo>> c22507a = this.f20136a0;
                    c22507a.onNext(c22507a.m222761e().setReason(PartialListOpt.RefreshReason.removeUserWhenOnlineMatchSuccess));
                    break;
                }
            }
        }
        Act.C4450r c4450rForeground_ = Act.foreground_();
        if (c4450rForeground_ != null) {
            Activity activity = c4450rForeground_.f16062a.get();
            if (NullChecker.m82486a(activity) && gta.m132210e().m132214d().mo34668Ce(activity)) {
                this.f91137Q.f20429u0.m31383C7(str);
            }
        }
        this.f91137Q.f20429u0.m31380B7(str);
    }

    /* JADX INFO: renamed from: H5 */
    public void m32006H5() {
        if (gta.m132210e().m132214d().mo34707Is() && NullChecker.m82486a(this.f20136a0.m222761e())) {
            List<UserInfo> list = this.f20136a0.m222761e().loaded;
            ArrayList arrayList = new ArrayList();
            if (jyb.m147479J(list)) {
                return;
            }
            int iMo34829fd = gta.m132210e().m132214d().mo34829fd();
            ListIterator<UserInfo> listIterator = list.listIterator();
            while (listIterator.hasNext()) {
                UserInfo next = listIterator.next();
                if (!next.isVirtualCard() && !TextUtils.isEmpty(next.f20214id) && next.checkPointTime > 0 && pzi0.m174454o() - next.checkPointTime >= ((long) iMo34829fd) * Constants.ONE_MIN_IN_MILLIS) {
                    arrayList.add(next.f20214id);
                }
            }
            if (jyb.m147479J(arrayList)) {
                return;
            }
            m32010I5(arrayList);
        }
    }

    /* JADX INFO: renamed from: H6 */
    public final boolean m32007H6(LikeExtraData likeExtraData) {
        return NullChecker.m82486a(likeExtraData) && NullChecker.m82486a(likeExtraData.matchScData) && TextUtils.equals(likeExtraData.matchScData.actionname, "like") && TextUtils.equals(likeExtraData.matchScData.updateRelationshipsModuleId, MatchScData.ModuleId.boost_result_rev);
    }

    /* JADX INFO: renamed from: H7 */
    public final /* synthetic */ C22421c m32008H7(String str, String str2) {
        final String str3 = "/me/marriage-info/" + str + "/report";
        final JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("action", str2);
        } catch (Exception unused) {
        }
        return qi20.m176658e(new pcj() { // from class: l.t2b
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4879a.f20236P.auth().m209043q(C4879a.m32369w2(str3)).m209038l(z1d0.create(Network.JSON, jSONObject.toString())).m209028b();
            }
        }).map(new C4876c()).compose(psd0.m173592C());
    }

    /* JADX INFO: renamed from: H8 */
    public void m32009H8(List<String> list) {
        if (list == null || list.size() == 0) {
            return;
        }
        boolean z = false;
        if (this.f20136a0.m222761e() != null && !jyb.m147479J(this.f20136a0.m222761e().loaded)) {
            Iterator<UserInfo> it = this.f20136a0.m222761e().loaded.iterator();
            while (it.hasNext()) {
                UserInfo next = it.next();
                if (NullChecker.m82486a(next) && list.contains(next.f20214id)) {
                    this.f20130Y.remove(next.f20214id);
                    it.remove();
                    z = true;
                }
            }
        }
        if (z) {
            this.f20136a0.m222761e().setRefreshValue(true);
            C22507a<PartialListOpt<UserInfo>> c22507a = this.f20136a0;
            c22507a.onNext(c22507a.m222761e().setReason(PartialListOpt.RefreshReason.removeUsersById));
        }
    }

    /* JADX INFO: renamed from: I5 */
    public final void m32010I5(final List<String> list) {
        final HashSet hashSet = new HashSet();
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            hashSet.add(it.next());
        }
        scheduled("check_card_user_invalid", 0, new pcj() { // from class: l.h3b
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f107631a.m32059U6(list, hashSet);
            }
        });
    }

    /* JADX INFO: renamed from: I6 */
    public final boolean m32011I6(LikeExtraData likeExtraData) {
        if (!CoreModule.f18264c.f20377c2.m118408t3() || !CoreModule.m30933P().m143408e().mo35993wq() || !NullChecker.m82486a(likeExtraData) || !NullChecker.m82486a(likeExtraData.matchScData)) {
            return false;
        }
        if (TextUtils.equals(likeExtraData.matchScData.actionname, "like") || TextUtils.equals(likeExtraData.matchScData.actionname, "superlike")) {
            return TextUtils.equals(likeExtraData.matchScData.updateRelationshipsSource, "suggest_user_profile_info") || TextUtils.equals(likeExtraData.matchScData.updateRelationshipsSource, "suggest_users_home");
        }
        return false;
    }

    /* JADX INFO: renamed from: I7 */
    public final /* synthetic */ C22421c m32012I7(final String str) {
        return qi20.m176658e(new pcj() { // from class: l.u2b
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4879a.f20236P.auth().m209043q(C4879a.m32369w2(str)).m209032f().m209028b();
            }
        }).map(new C4875b()).compose(psd0.m173592C());
    }

    /* JADX INFO: renamed from: I8 */
    public void m32013I8(List<String> list) {
        if (list == null || list.size() == 0 || this.f20136a0.m222761e() == null || jyb.m147479J(this.f20136a0.m222761e().loaded)) {
            return;
        }
        Iterator<UserInfo> it = this.f20136a0.m222761e().loaded.iterator();
        while (it.hasNext()) {
            UserInfo next = it.next();
            if (NullChecker.m82486a(next) && list.contains(next.f20214id)) {
                this.f20130Y.remove(next.f20214id);
                it.remove();
            }
        }
    }

    /* JADX INFO: renamed from: J5 */
    public final boolean m32014J5(User user) {
        if (NullChecker.m82486a(user)) {
            return true;
        }
        return NullChecker.m82486a(this.f20136a0.m222761e()) && !jyb.m147479J(this.f20136a0.m222761e().loaded);
    }

    /* JADX INFO: renamed from: J6 */
    public final boolean m32015J6(User user) {
        if (user.isBannedNew() || user.isBanned()) {
            return true;
        }
        if (jyb.m147479J(user.status)) {
            return false;
        }
        return user.status.contains(UserStatus.get(UserStatus.RISK_TAG_LIKE_EXPOSE)) || user.status.contains(UserStatus.get(UserStatus.RISK_TAG_MOMENT_EXPOSE)) || user.status.contains(UserStatus.get(UserStatus.RISK_TAG_COMMENT_EXPOSE)) || user.status.contains(UserStatus.get(UserStatus.RISK_TAG_GREETING_DISABLED)) || user.status.contains(UserStatus.get(UserStatus.RISK_TAG_GROUP_CHAT_EXPOSE));
    }

    /* JADX INFO: renamed from: J7 */
    public final /* synthetic */ void m32016J7() {
        m32133n8(false);
    }

    /* JADX INFO: renamed from: J8 */
    public boolean m32017J8(UserInfo userInfo) {
        boolean z = false;
        if (this.f20136a0.m222761e() != null && !jyb.m147479J(this.f20136a0.m222761e().loaded)) {
            Iterator<UserInfo> it = this.f20136a0.m222761e().loaded.iterator();
            while (it.hasNext()) {
                UserInfo next = it.next();
                if (NullChecker.m82486a(next) && (next.equals(userInfo) || ((TextUtils.equals(userInfo.f20214id, next.f20214id) && !userInfo.isVirtualCard()) || (next.isVirtualCard() && userInfo.isVirtualCard() && next.virtualCardType == userInfo.virtualCardType)))) {
                    it.remove();
                    this.f20136a0.m222761e().loaded.size();
                    tu2.m192703a("BifrostLayout", "删除List数据：" + next.f20214id + ", " + this.f20136a0.m222761e().loaded.size());
                    z = true;
                    break;
                }
            }
            this.f20136a0.m222761e().setRefreshValue(jyb.m147479J(this.f20136a0.m222761e().loaded));
            C22507a<PartialListOpt<UserInfo>> c22507a = this.f20136a0;
            c22507a.onNext(c22507a.m222761e().setReason(PartialListOpt.RefreshReason.REMOVE_BY_BIFROST));
        }
        return z;
    }

    /* JADX INFO: renamed from: K5 */
    public void m32018K5() {
        this.f20073D2.onNext(uxj0.f181467a);
        m32082a6(false, true);
    }

    /* JADX INFO: renamed from: K6 */
    public final boolean m32019K6() {
        return "_Test".equals(ABManager.m30350j0("IntlPremiumCards"));
    }

    /* JADX INFO: renamed from: K7 */
    public final /* synthetic */ void m32020K7() {
        if (this.f20118U) {
            return;
        }
        if (this.f20136a0.m222761e() == null || this.f20136a0.m222761e().loaded.isEmpty()) {
            l51.m152893M(new Runnable() { // from class: l.b5b
                @Override // java.lang.Runnable
                public final void run() {
                    this.f75045a.m32016J7();
                }
            });
        }
    }

    /* JADX INFO: renamed from: K8 */
    public void m32021K8(final User user, final User user2, final int i) {
        this.f91137Q.scheduled("user-boost_cancel", -1, new pcj() { // from class: l.c2b
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return qi20.m176658e(new pcj() { // from class: l.d2b
                    @Override // p153l.pcj, java.util.concurrent.Callable
                    public final Object call() {
                        return C4879a.f20236P.auth().m209043q(C4879a.m32302g(user.f56859id, user.f56859id, String.valueOf(uqb0.f180400f0), i)).m209032f().m209028b();
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: L5 */
    public void m32022L5() {
        m32030N5();
        m32130m8();
    }

    /* JADX INFO: renamed from: L6 */
    public boolean m32023L6(String str) {
        return this.f20132Y1.containsKey(str);
    }

    /* JADX INFO: renamed from: L7 */
    public final /* synthetic */ Boolean m32024L7(PartialListOpt partialListOpt) {
        if (NullChecker.m82486a(partialListOpt)) {
            return Boolean.TRUE;
        }
        m32029M8();
        return Boolean.FALSE;
    }

    /* JADX INFO: renamed from: L8 */
    public void m32025L8(final User user, final User user2, final int i) {
        this.f91137Q.scheduled("user-boost_like", -1, new pcj() { // from class: l.x1b
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return qi20.m176658e(new pcj() { // from class: l.e2b
                    @Override // p153l.pcj, java.util.concurrent.Callable
                    public final Object call() {
                        return C4879a.f20236P.auth().m209043q(C4879a.m32306h(user.f56859id, user.f56859id, String.valueOf(uqb0.f180400f0), i)).m209032f().m209028b();
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: M5 */
    public C22421c<uxj0> m32026M5() {
        m32030N5();
        return m32130m8();
    }

    /* JADX INFO: renamed from: M6 */
    public boolean m32027M6(String str) {
        return this.f20135Z1.containsKey(str);
    }

    /* JADX INFO: renamed from: M7 */
    public final /* synthetic */ x1d0 m32028M7(boolean z, String str) {
        return C4879a.f20236P.auth().m209043q(z ? m32160x5(str) : C4879a.m32182A2(str)).m209032f().m209028b();
    }

    /* JADX INFO: renamed from: M8 */
    public final void m32029M8() {
        CrashHelper.m82479c(new RuntimeException("推荐列表Null异常:标记位:" + this.f20186q2[0] + Constants.SEPARATOR_COMMA + this.f20186q2[1] + Constants.SEPARATOR_COMMA + this.f20186q2[2]));
    }

    /* JADX INFO: renamed from: N5 */
    public final void m32030N5() {
        if (NullChecker.m82486a(this.f20136a0.m222761e()) && !jyb.m147479J(this.f20136a0.m222761e().loaded)) {
            ListIterator<UserInfo> listIterator = this.f20136a0.m222761e().loaded.listIterator();
            while (listIterator.hasNext()) {
                UserInfo next = listIterator.next();
                if (!TextUtils.isEmpty(next.f20214id)) {
                    this.f20130Y.remove(next.f20214id);
                }
                listIterator.remove();
            }
            this.f20136a0.m222761e().setRefreshValue(true);
            C22507a<PartialListOpt<UserInfo>> c22507a = this.f20136a0;
            c22507a.onNext(c22507a.m222761e().setReason(PartialListOpt.RefreshReason.CLEAR_OLD_DATA));
        }
        m32130m8();
    }

    /* JADX INFO: renamed from: N6 */
    public final boolean m32031N6() {
        return "INTL_LOWACTIVITY_TEST_1".equals(ABManager.m30350j0("INTL_LOWACTIVITY")) || "INTL_LOWACTIVITY_2".equals(ABManager.m30350j0("INTL_LOWACTIVITY")) || "INTL_LOWACTIVITY_1".equals(ABManager.m30350j0("INTL_LOWACTIVITY"));
    }

    /* JADX INFO: renamed from: N7 */
    public final /* synthetic */ void m32032N7(Envelope envelope) {
        m32002G5(envelope);
        if (ConnectivityReceiver.m82469i()) {
            jyb.m147537z(jyb.m147474E(((CommonData) envelope.getModuleData(CommonData.class)).users), new y20() { // from class: l.j5b
                @Override // p153l.y20
                public final void call(Object obj) {
                    CoreSuggested.m31972x3((User) obj);
                }
            });
        }
        this.f91137Q.m32495w3(envelope, null);
    }

    /* JADX INFO: renamed from: N8 */
    public C22421c<uxj0> m32033N8(final String str, final String str2) {
        if (TextUtils.isEmpty(str)) {
            return C22421c.just(uxj0.f181467a);
        }
        return this.f91137Q.scheduled("reportSuggestMarryUser+" + str, -1, new pcj() { // from class: l.u4b
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f177445a.m32008H7(str, str2);
            }
        });
    }

    /* JADX INFO: renamed from: O5 */
    public void m32034O5() {
        this.f20160i0 = null;
        this.f20163j0 = null;
        this.f20166k0 = 1;
    }

    /* JADX INFO: renamed from: O6 */
    public boolean m32035O6() {
        return this.f20121V.m222761e().booleanValue();
    }

    /* JADX INFO: renamed from: O7 */
    public final /* synthetic */ uxj0 m32036O7(int i, String str, Envelope envelope) {
        int iIntValue;
        RelationshipStatus relationshipStatus = RelationshipStatus.get("unknown_");
        if (!jyb.m147479J(((CoreData) envelope.getModuleData(CoreData.class)).relationships)) {
            relationshipStatus = ((CoreData) envelope.getModuleData(CoreData.class)).relationships.get(0).state;
        }
        HashMap<String, String> map = new HashMap<>();
        CoreModule.m30932N().mo61590zd(envelope, map);
        if (!TEnum.equals(relationshipStatus, "matched") && !jyb.m147479J(((CommonData) envelope.getModuleData(CommonData.class)).users)) {
            User user = ((CommonData) envelope.getModuleData(CommonData.class)).users.get(0);
            if (NullChecker.m82486a(user)) {
                UserInfo userInfo = new UserInfo();
                String str2 = user.f56859id;
                userInfo.f20214id = str2;
                userInfo.hasMoment = map.containsKey(str2);
                if (!gta.m132210e().m132214d().mo34870k6() || i <= 1) {
                    userInfo.preSwipedDirection = SwipeDirection.LEFT;
                }
                HashMap<String, String> mapM162085o = nae0.m162085o(Uri.parse(str));
                if (!TextUtils.isEmpty(mapM162085o.get("pushtype"))) {
                    try {
                        userInfo.userCardPushType = Integer.parseInt(mapM162085o.get("pushtype"));
                        if (!TextUtils.isEmpty(mapM162085o.get(Reason.TYPE))) {
                            userInfo.userCardPushReason = Integer.parseInt(mapM162085o.get(Reason.TYPE));
                        }
                        userInfo.userCardPushTag = mapM162085o.get("tag");
                    } catch (NumberFormatException unused) {
                    }
                    userInfo.isUserCardPush = true;
                }
                String str3 = mapM162085o.get(Oauth2AccessToken.KEY_UID);
                String str4 = mapM162085o.get("showType");
                if (TextUtils.isEmpty(mapM162085o.get("pictureIndex"))) {
                    iIntValue = 0;
                } else {
                    try {
                        iIntValue = Integer.valueOf(mapM162085o.get("pictureIndex")).intValue();
                    } catch (NumberFormatException e) {
                        CrashHelper.m82479c(e);
                        iIntValue = 0;
                    }
                }
                if (gta.m132210e().m132214d().mo34870k6()) {
                    this.f20187r0.add(user.f56859id);
                }
                if (!TextUtils.isEmpty(str3)) {
                    List<Media> list = user.pictures;
                    if (!TextUtils.isEmpty(str4)) {
                        int i2 = 0;
                        for (int i3 = 0; i3 < list.size(); i3++) {
                            if ("video".equals(str4) && list.get(i3).mediaType.startsWith("video/")) {
                                if (i2 == iIntValue) {
                                    CoreModule.f18264c.f20381e0.f88998B0 = bkj0.m104818a(str3, str4, Integer.valueOf(i3));
                                    break;
                                }
                                i2++;
                            } else {
                                if ("picture".equals(str4) && list.get(i3).mediaType.startsWith("image/")) {
                                    if (i2 == iIntValue) {
                                        CoreModule.f18264c.f20381e0.f88998B0 = bkj0.m104818a(str3, str4, Integer.valueOf(i3));
                                        break;
                                    }
                                    i2++;
                                }
                            }
                        }
                    } else if (iIntValue > 0) {
                        CoreModule.f18264c.f20381e0.f88998B0 = bkj0.m104818a(str3, str4, Integer.valueOf(iIntValue));
                    }
                }
                CardInfos cardInfosNew_ = CardInfos.new_();
                cardInfosNew_.userId = userInfo.f20214id;
                if (TextUtils.isEmpty(mapM162085o.get("widget_content"))) {
                    cardInfosNew_.cardName = "idlepush";
                } else {
                    cardInfosNew_.cardName = "phone_widget";
                }
                userInfo.cardInfos = cardInfosNew_;
                m32157w6(userInfo, i);
                if (gta.m132210e().m132214d().mo34805b()) {
                    CoreModule.m30934Q().putLiveState(((CommonData) envelope.getModuleData(CommonData.class)).users);
                }
            }
        }
        return uxj0.f181467a;
    }

    /* JADX INFO: renamed from: O8 */
    public C22421c<uxj0> m32037O8(String str) {
        return m32033N8(str, "dislike");
    }

    /* JADX INFO: renamed from: P5 */
    public void m32038P5() {
        CoreModule.f18264c.clearRequests("users/suggested", 0);
    }

    /* JADX INFO: renamed from: P6 */
    public final /* synthetic */ void m32039P6(boolean z) {
        this.f20121V.onNext(Boolean.FALSE);
        this.f20118U = false;
        if (CoreModule.f18264c == null || CoreModule.m30929H().userId() == null) {
            return;
        }
        if (z) {
            this.f20079F2.onNext(uxj0.f181467a);
        }
        m32042Q5();
        m32130m8();
    }

    /* JADX INFO: renamed from: P7 */
    public final /* synthetic */ x1d0 m32040P7() {
        return C4879a.f20236P.auth().m209038l(z1d0.create(Network.JSON, "")).m209043q(C4879a.m32203G(this.f20100M2)).m209028b();
    }

    /* JADX INFO: renamed from: P8 */
    public C22421c<uxj0> m32041P8(String str) {
        return m32033N8(str, "show");
    }

    /* JADX INFO: renamed from: Q5 */
    public void m32042Q5() {
        CoreModule.f18264c.clearRequests("users/suggested", 0);
        CoreModule.f18264c.clearRequests("users/suggested/insert", 0);
        CoreModule.f18264c.clearRequests("users/suggested/active/insert", 0);
        CoreModule.f18264c.clearRequests("users/suggested/passive/insert", 0);
    }

    /* JADX INFO: renamed from: Q6 */
    public final /* synthetic */ Integer m32043Q6(Envelope envelope) {
        this.f20169l0 = ((CoreData) envelope.getModuleData(CoreData.class)).likedByToday;
        this.f20172m0.onNext(Long.valueOf(pzi0.m174454o()));
        return 0;
    }

    /* JADX INFO: renamed from: Q7 */
    public final /* synthetic */ C22421c m32044Q7() {
        return qi20.m176654a(new pcj() { // from class: l.s2b
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f165873a.m32040P7();
            }
        });
    }

    /* JADX INFO: renamed from: Q8 */
    public void m32045Q8(UserInfo userInfo, int i, SwipeDirection swipeDirection) {
        this.f20160i0 = CoreModule.f18264c.f20381e0.m116503Pa(userInfo.f20214id);
        this.f20166k0 = i;
        this.f20163j0 = userInfo;
        userInfo.preSwipedDirection = swipeDirection;
        userInfo.canUndo = true;
    }

    /* JADX INFO: renamed from: R5 */
    public void m32046R5() {
        if (this.f20136a0.m222761e() == null || jyb.m147479J(this.f20136a0.m222761e().loaded)) {
            return;
        }
        jyb.m147537z(this.f20136a0.m222761e().loaded, new y20() { // from class: l.b6b
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f75170a.m32063V6((CoreSuggested.UserInfo) obj);
            }
        });
        this.f20136a0.onNext(new PartialListOpt(new ArrayList(), this.f20136a0.m222761e().links).setReason(PartialListOpt.RefreshReason.clearSuggestedData));
    }

    /* JADX INFO: renamed from: R6 */
    public final /* synthetic */ C22421c m32047R6() {
        return qi20.m176658e(new pcj() { // from class: l.r5b
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4879a.f20236P.auth().m209032f().m209043q(C4879a.m32203G("/verified-isolation/likedby-info")).m209028b();
            }
        }).map(new qcj() { // from class: l.s5b
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f166320a.m32043Q6((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: R7 */
    public final /* synthetic */ void m32048R7(Envelope envelope, User user, UserInfo userInfo, boolean z) {
        if (jyb.m147479J(((CoreData) envelope.getModuleData(CoreData.class)).relationships)) {
            CrashHelper.m82485i(new Exception("return null relationships"), "core_undo", CrashHelper.ReportLevel.p5, 100);
            return;
        }
        if (TEnum.equals(((CoreData) envelope.getModuleData(CoreData.class)).relationships.get(0).state, "default")) {
            uqb0.f180405k0.f184355d.insert(user);
            userInfo.isUndo = true;
            if (!z) {
                userInfo.preSwipedDirection = null;
            }
            this.f91137Q.f20370a1.m180094A(userInfo.f20214id);
            m32157w6(userInfo, 0);
            m32034O5();
        }
    }

    /* JADX INFO: renamed from: R8 */
    public C22421c<uxj0> m32049R8() {
        return this.f20073D2.asObservable();
    }

    /* JADX INFO: renamed from: S5 */
    public void m32050S5() {
        this.f91137Q.clearRequests("get_dis_liked_users", 0);
    }

    /* JADX INFO: renamed from: S6 */
    public final /* synthetic */ void m32051S6(Throwable th) {
        this.f20172m0.onNext(Long.valueOf(pzi0.m174454o()));
    }

    /* JADX INFO: renamed from: S7 */
    public final /* synthetic */ Relationship m32052S7(final User user, final UserInfo userInfo, final boolean z, final Envelope envelope) {
        this.f91137Q.m32495w3(envelope, new x20() { // from class: l.z1b
            @Override // p153l.x20
            public final void call() {
                this.f202495a.m32048R7(envelope, user, userInfo, z);
            }
        });
        if (!jyb.m147479J(((CoreData) envelope.getModuleData(CoreData.class)).relationships)) {
            return ((CoreData) envelope.getModuleData(CoreData.class)).relationships.get(0);
        }
        Relationship relationship = new Relationship();
        relationship.state = RelationshipStatus.get("unknown_");
        return relationship;
    }

    /* JADX INFO: renamed from: S8 */
    public void m32053S8() {
        m32038P5();
        m32022L5();
    }

    /* JADX INFO: renamed from: T5 */
    public boolean m32054T5(final UserInfo userInfo) {
        if (!NullChecker.m82486a(this.f20136a0.m222761e())) {
            return false;
        }
        List<UserInfo> list = this.f20136a0.m222761e().loaded;
        if (jyb.m147479J(list)) {
            return false;
        }
        return NullChecker.m82486a((UserInfo) jyb.m147529r(list, new qcj() { // from class: l.w1b
            @Override // p153l.qcj
            public final Object call(Object obj) {
                CoreSuggested.UserInfo userInfo2 = userInfo;
                CoreSuggested.UserInfo userInfo3 = (CoreSuggested.UserInfo) obj;
                return Boolean.valueOf(TextUtils.equals(userInfo3.f20214id, userInfo2.f20214id) && userInfo3.virtualCardType == userInfo2.virtualCardType);
            }
        }));
    }

    /* JADX INFO: renamed from: T6 */
    public final /* synthetic */ void m32055T6(HashSet hashSet, List list) {
        if (jyb.m147479J(list)) {
            return;
        }
        gta.m132210e().m132214d().mo34676Dg("remove ban user: " + list.toString());
        HashSet hashSet2 = new HashSet();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            hashSet2.add((String) it.next());
        }
        if (NullChecker.m82486a(this.f20136a0.m222761e())) {
            ListIterator<UserInfo> listIterator = this.f20136a0.m222761e().loaded.listIterator();
            while (listIterator.hasNext()) {
                UserInfo next = listIterator.next();
                if (hashSet2.contains(next.f20214id)) {
                    listIterator.remove();
                } else if (hashSet.contains(next.f20214id)) {
                    next.checkPointTime = pzi0.m174454o();
                }
            }
            this.f20136a0.m222761e().setRefreshValue(true);
            C22507a<PartialListOpt<UserInfo>> c22507a = this.f20136a0;
            c22507a.onNext(c22507a.m222761e().setReason(PartialListOpt.RefreshReason.checkCardOnce));
        }
    }

    /* JADX INFO: renamed from: T7 */
    public final /* synthetic */ C22421c m32056T7(final User user, Relationship relationship, Map map, final UserInfo userInfo, final boolean z) {
        return C4910y.m35908m3(user.f56859id, relationship, map).map(new qcj() { // from class: l.k1b
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f123466a.m32052S7(user, userInfo, z, (Envelope) obj);
            }
        }).compose(C4879a.m32255T2());
    }

    /* JADX INFO: renamed from: T8 */
    public C22421c<uxj0> m32057T8() {
        return this.f20076E2.asObservable();
    }

    /* JADX INFO: renamed from: U5 */
    public final Relationship m32058U5(boolean z, boolean z2, boolean z3, boolean z4, int i, UserInfo userInfo, String str, LikeFrom likeFrom, String str2, LikeExtraData likeExtraData, String str3) {
        DclExtensions dclExtensions;
        int iIntValue;
        Relationship relationship = new Relationship();
        relationship.localLikeFrom = likeFrom.toString();
        if (z) {
            relationship.state = RelationshipStatus.get(z2 ? "blocked" : "default");
        } else {
            relationship.state = RelationshipStatus.get(z3 ? "liked" : RelationshipStatus.disliked);
        }
        User userM116503Pa = CoreModule.f18264c.f20381e0.m116503Pa(userInfo.f20214id);
        ArrayList arrayList = new ArrayList();
        if (z) {
            arrayList.add(MatchFrom.get(MatchFrom.relationUnion));
        }
        if (TEnum.equals(likeFrom, "partner")) {
            arrayList.add(MatchFrom.get("partner"));
        }
        if (NullChecker.m82486a(likeExtraData) && NullChecker.m82486a(likeExtraData.status) && !TEnum.equals(likeExtraData.status, "unknown_")) {
            arrayList.add(likeExtraData.status);
        }
        if (z4 && !TextUtils.isEmpty(str) && (gta.m132210e().m132214d().mo34925t() || gta.m132210e().m132214d().mo34661B())) {
            arrayList.add(MatchFrom.get("letter"));
            if (TEnum.equals(likeFrom, "myLiked")) {
                arrayList.add(MatchFrom.get("myLiked"));
            }
            RelationshipExtensions relationshipExtensionsNew_ = RelationshipExtensions.new_();
            relationshipExtensionsNew_.letter = str;
            relationship.relationshipExtensions = relationshipExtensionsNew_;
            userInfo.letter = str;
            relationship.coinSign = CoreModule.f18264c.f20312H0.m155464s4(SummarizedPrivilegesId.get("letter"));
        } else if (z4) {
            arrayList.add(MatchFrom.get(MatchFrom.superLiked));
            if (TEnum.equals(likeFrom, "myLiked")) {
                arrayList.add(MatchFrom.get("myLiked"));
            }
            RelationshipExtensions relationshipExtensionsNew_2 = RelationshipExtensions.new_();
            relationshipExtensionsNew_2.letter = str;
            relationshipExtensionsNew_2.sendSuperLikedNum = String.valueOf(i);
            relationship.relationshipExtensions = relationshipExtensionsNew_2;
            if (CoreModule.m30930K().mo31838xf()) {
                relationship.diamondSign = CoreModule.f18264c.f20315I0.m144070x3(SummarizedPrivilegesId.get("superLike"));
            } else {
                relationship.coinSign = CoreModule.f18264c.f20312H0.m155464s4(SummarizedPrivilegesId.get("superLike"));
            }
        }
        if (!TextUtils.isEmpty(str2)) {
            relationship.picksTracker = str2;
        }
        if (CoreModule.m30933P().m143408e().mo35993wq() && (m32011I6(likeExtraData) || m32007H6(likeExtraData))) {
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
        if (CoreModule.m30932N().mo61573so() && z3 && TEnum.equals(likeFrom, "moment")) {
            arrayList.add(MatchFrom.get("moment"));
        }
        if (z3 && TEnum.equals(likeFrom, "kankan")) {
            arrayList.add(MatchFrom.get("kankan"));
        }
        if (gta.m132210e().m132214d().mo34858is() && z3 && !TextUtils.isEmpty(userInfo.profileLikeCommentId) && !z4) {
            arrayList.add(MatchFrom.get(MatchFrom.profileLiked));
            try {
                iIntValue = Integer.valueOf(userInfo.profileLikeCommentId).intValue();
            } catch (Exception unused) {
                iIntValue = 0;
            }
            relationship.likeProfileId = iIntValue;
        }
        if (this.f91137Q.f20429u0.m31381C5(userM116503Pa) || TEnum.equals(likeFrom, LikeFrom.get("instantChat"))) {
            arrayList.add(MatchFrom.get(MatchFrom.seeUpgraded));
        }
        if (CoreModule.m30933P().m143410g().mo36054cf() && z3 && TEnum.equals(likeFrom, "pinLike")) {
            userInfo.sendPinLike = true;
            arrayList.add(MatchFrom.get("pinLike"));
        }
        if (gta.m132210e().m132214d().mo34719Lc() && NullChecker.m82486a(likeExtraData) && likeExtraData.isSelectedUser) {
            if (gta.m132210e().m132214d().mo34808bn() && !joa.m146358H3()) {
                arrayList.add(MatchFrom.get(MatchFrom.selectionPending));
                if (z4) {
                    arrayList.remove(MatchFrom.get(MatchFrom.superLiked));
                }
            } else if (!CoreModule.m30933P().m143410g().mo36010Ed() || ela.m121122r3() > 0) {
                arrayList.add(MatchFrom.get("selection"));
            }
        }
        relationship.status = arrayList;
        if (userM116503Pa != null) {
            if (!TextUtils.isEmpty(userM116503Pa.ussTracker)) {
                relationship.ussTracker = userM116503Pa.ussTracker;
            }
            UssTags ussTags = userM116503Pa.ussTags;
            if (ussTags != null && !TextUtils.isEmpty(ussTags.avatarIdentifier)) {
                relationship.avatarIdentifier = userM116503Pa.ussTags.avatarIdentifier;
            }
            if (NullChecker.m82486a(userM116503Pa.anonymousLike)) {
                relationship.anonymousLikeItemId = userM116503Pa.anonymousLike.itemId;
            }
        }
        CardInfos cardInfos = userInfo.cardInfos;
        if (cardInfos != null && !TextUtils.isEmpty(cardInfos.cardName)) {
            SwipeCardInfo swipeCardInfoNew_ = SwipeCardInfo.new_();
            relationship.cardInfo = swipeCardInfoNew_;
            swipeCardInfoNew_.cardTypes.addAll(jyb.m147507f0(userInfo.cardInfos.cardName.split(Constants.SEPARATOR_COMMA)));
        }
        if (likeExtraData != null && (dclExtensions = likeExtraData.liveExtraInfo) != null && relationship.relationshipExtensions != null && TextUtils.equals(dclExtensions.businessType, BLiveType.voiceLive)) {
            relationship.localLikeFrom = VoiceLive.TYPE;
            relationship.relationshipExtensions.roomID = likeExtraData.liveExtraInfo.voiceRoomId;
        }
        return relationship;
    }

    /* JADX INFO: renamed from: U6 */
    public final /* synthetic */ C22421c m32059U6(List list, final HashSet hashSet) {
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
        return qi20.m176658e(new pcj() { // from class: l.d5b
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4879a.f20236P.auth().m209043q(C4879a.m32203G("/filter-users")).m209038l(z1d0.create(Network.JSON, jSONObject.toString())).m209028b();
            }
        }).map(new qcj() { // from class: l.e5b
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((CoreData) ((Envelope) obj).getModuleData(CoreData.class)).invalidCardList;
            }
        }).observeOn(fo0.m126432a()).doOnNext(new y20() { // from class: l.g5b
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f102302a.m32055T6(hashSet, (List) obj);
            }
        });
    }

    /* JADX INFO: renamed from: U7 */
    public C22421c<Relationship> m32060U7(boolean z, boolean z2, Map<String, String> map, User user, LikeExtraData likeExtraData, LikeFrom likeFrom) {
        return m32068W7(z, z2, map, user, null, likeFrom, true, likeExtraData);
    }

    /* JADX INFO: renamed from: U8 */
    public boolean m32061U8() {
        return C4879a.f20236P.guessedCurrentServerTime() - this.f20124W >= TimeUnit.MINUTES.toMillis(10L);
    }

    /* JADX INFO: renamed from: V5 */
    public final void m32062V5(List<SuperLikeCount> list) {
        if (jyb.m147479J(list)) {
            return;
        }
        jyb.m147537z(list, new y20() { // from class: l.u1b
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f176982a.m32067W6((SuperLikeCount) obj);
            }
        });
    }

    /* JADX INFO: renamed from: V6 */
    public final /* synthetic */ void m32063V6(UserInfo userInfo) {
        this.f20130Y.remove(userInfo.f20214id);
    }

    @Deprecated
    /* JADX INFO: renamed from: V7 */
    public C22421c<Relationship> m32064V7(boolean z, boolean z2, Map<String, String> map, User user, String str) {
        return m32068W7(z, z2, map, user, str, LikeFrom.get("unknown_"), true, null);
    }

    /* JADX INFO: renamed from: V8 */
    public C22421c<Envelope> m32065V8() {
        final String str = "/me/marriage-info";
        return this.f91137Q.scheduled("suggestMarryUser", 0, new pcj() { // from class: l.y3b
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f197337a.m32012I7(str);
            }
        });
    }

    /* JADX INFO: renamed from: W5 */
    public void m32066W5(int i) {
        this.f20136a0.m222761e().setRefreshValue(true);
        List<UserInfo> list = this.f20136a0.m222761e().loaded;
        if (i >= 0 && !jyb.m147479J(list) && list.size() > i) {
            list.remove(i);
        }
        C22507a<PartialListOpt<UserInfo>> c22507a = this.f20136a0;
        c22507a.onNext(c22507a.m222761e().setReason(PartialListOpt.RefreshReason.debugRefreshLoad));
    }

    /* JADX INFO: renamed from: W6 */
    public final /* synthetic */ void m32067W6(SuperLikeCount superLikeCount) {
        this.f20195t2.put(superLikeCount.userId, Integer.valueOf(superLikeCount.receiveTotalCount));
    }

    /* JADX INFO: renamed from: W7 */
    public C22421c<Relationship> m32068W7(boolean z, boolean z2, @Nullable Map<String, String> map, User user, String str, LikeFrom likeFrom, boolean z3, @Nullable LikeExtraData likeExtraData) {
        return m32072X7(z, z2, map, user, str, likeFrom, z3, likeExtraData, 0);
    }

    /* JADX INFO: renamed from: W8 */
    public C22421c<PartialListOpt<UserInfo>> m32069W8() {
        return this.f20136a0.doOnSubscribe(new x20() { // from class: l.z2b
            @Override // p153l.x20
            public final void call() {
                this.f202668a.m32020K7();
            }
        }).doOnNext(new y20() { // from class: l.a3b
            @Override // p153l.y20
            public final void call(Object obj) {
                CoreSuggested.m31901Z4((PartialListOpt) obj);
            }
        }).filter(new qcj() { // from class: l.b3b
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f74720a.m32024L7((PartialListOpt) obj);
            }
        });
    }

    /* JADX INFO: renamed from: X5 */
    public final UserInfo m32070X5(boolean z, boolean z2, boolean z3, final User user, LikeFrom likeFrom, int i, boolean z4) {
        SwipeDirection swipeDirection;
        if (user != null) {
            UserInfo userInfo = new UserInfo();
            userInfo.f20214id = user.f56859id;
            if (this.f20136a0.m222761e() != null && !jyb.m147479J(this.f20136a0.m222761e().loaded)) {
                UserInfo userInfo2 = (UserInfo) jyb.m147529r(this.f20136a0.m222761e().loaded, new qcj() { // from class: l.s4b
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return Boolean.valueOf(user.f56859id.equals(((CoreSuggested.UserInfo) obj).f20214id));
                    }
                });
                if (!gta.m132210e().m132214d().mo34765V6() && userInfo2 != null && z4) {
                    this.f20136a0.m222761e().loaded.remove(userInfo2);
                    this.f20136a0.m222761e().setRefreshValue(true);
                    C22507a<PartialListOpt<UserInfo>> c22507a = this.f20136a0;
                    c22507a.onNext(c22507a.m222761e().setReason(PartialListOpt.RefreshReason.DO_BEFORE_LIKE));
                }
            }
            if (!z) {
                String string = likeFrom.toString();
                string.getClass();
                if (string.equals("likers")) {
                    this.f91137Q.f20429u0.m31377A7(user.f56859id);
                } else if (string.equals("myLiked")) {
                    this.f91137Q.f20367Z0.m210787d4(user.f56859id);
                    this.f91137Q.f20367Z0.m210788e4(user.f56859id);
                    this.f91137Q.f20370a1.m180094A(user.f56859id);
                    return userInfo;
                }
            }
            return userInfo;
        }
        UserInfo userInfo3 = (this.f20136a0.m222761e() == null || jyb.m147479J(this.f20136a0.m222761e().loaded)) ? null : this.f20136a0.m222761e().loaded.get(0);
        if (!gta.m132210e().m132214d().mo34765V6()) {
            m31989C8("doBeforeLike");
        }
        if (CoreModule.f18273l.m143405a().mo34492e2() && NullChecker.m82486a(userInfo3)) {
            String originUserId = userInfo3.f20214id;
            LiveLivingCardDataWrapper liveLivingCardDataWrapper = userInfo3.liveLivingCardDataWrapper;
            if (liveLivingCardDataWrapper != null) {
                originUserId = liveLivingCardDataWrapper.getOriginUserId();
            }
            if (z2) {
                C4880a0.m32390j().m32392f(originUserId);
            } else {
                C4880a0.m32390j().m32391e(originUserId);
            }
        }
        if (!NullChecker.m82486a(userInfo3)) {
            return new UserInfo();
        }
        String originUserId2 = userInfo3.f20214id;
        LiveLivingCardDataWrapper liveLivingCardDataWrapper2 = userInfo3.liveLivingCardDataWrapper;
        if (liveLivingCardDataWrapper2 != null) {
            originUserId2 = liveLivingCardDataWrapper2.getOriginUserId();
        }
        if (!userInfo3.disableUndo) {
            this.f20160i0 = CoreModule.f18264c.f20381e0.m116503Pa(originUserId2);
            this.f20166k0 = i;
            this.f20163j0 = userInfo3;
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
    public final /* synthetic */ Relationship m32071X6(Envelope envelope) {
        this.f91137Q.m32495w3(envelope, new x20() { // from class: l.v1b
            @Override // p153l.x20
            public final void call() {
                CoreSuggested.m31942n4();
            }
        });
        List<Relationship> list = ((CoreData) envelope.getModuleData(CoreData.class)).relationships;
        if (jyb.m147479J(list)) {
            return null;
        }
        return list.get(0);
    }

    /* JADX INFO: renamed from: X7 */
    public C22421c<Relationship> m32072X7(boolean z, boolean z2, @Nullable Map<String, String> map, User user, String str, LikeFrom likeFrom, boolean z3, @Nullable LikeExtraData likeExtraData, int i) {
        return m32076Y7(z, z2, map, user, str, likeFrom, z3, likeExtraData, i, null);
    }

    /* JADX INFO: renamed from: X8 */
    public C22421c<UserInfo> m32073X8(final String str, final String str2) {
        return m32161x6(dkb.m116350d7(str).map(new qcj() { // from class: l.n4b
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return CoreSuggested.m31882Q3(str, str2, (Envelope) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: Y5 */
    public C22421c<Relationship> m32074Y5(final User user, final Map<String, String> map) {
        final Relationship relationship = new Relationship();
        relationship.state = RelationshipStatus.get("default");
        User userM116503Pa = CoreModule.f18264c.f20381e0.m116503Pa(user.f56859id);
        if (NullChecker.m82486a(userM116503Pa) && !TextUtils.isEmpty(userM116503Pa.ussTracker)) {
            relationship.ussTracker = userM116503Pa.ussTracker;
        }
        return this.f91137Q.scheduled("undo_feed_poi" + user.f56859id, -1, new pcj() { // from class: l.a5b
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f68528a.m32075Y6(user, relationship, map);
            }
        });
    }

    /* JADX INFO: renamed from: Y6 */
    public final /* synthetic */ C22421c m32075Y6(User user, Relationship relationship, Map map) {
        return C4910y.m35908m3(user.f56859id, relationship, map).map(new qcj() { // from class: l.o1b
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f144631a.m32071X6((Envelope) obj);
            }
        }).compose(C4879a.m32255T2());
    }

    /* JADX INFO: renamed from: Y7 */
    public C22421c<Relationship> m32076Y7(boolean z, boolean z2, @Nullable Map<String, String> map, User user, String str, LikeFrom likeFrom, boolean z3, @Nullable LikeExtraData likeExtraData, int i, String str2) {
        return m32080Z7(z, z2, map, user, str, likeFrom, z3, likeExtraData, i, str2, true);
    }

    /* JADX INFO: renamed from: Y8 */
    public C22421c<uxj0> m32077Y8(String str) {
        return m32081Z8(str, 0, false);
    }

    /* JADX INFO: renamed from: Z5 */
    public final C22421c<uxj0> m32078Z5(boolean z) {
        gta.m132210e().m132214d().mo34676Dg("actually do poll");
        return m32082a6(z, false);
    }

    /* JADX INFO: renamed from: Z6 */
    public final /* synthetic */ C22421c m32079Z6(Envelope envelope) {
        return !this.f20183p2 ? this.f20150e2.m35219u3(envelope, this.f20132Y1, this.f20135Z1, this.f20138a2) : C22421c.just(jyb.m147494Y(envelope, new SparseArray()));
    }

    /* JADX INFO: renamed from: Z7 */
    public C22421c<Relationship> m32080Z7(boolean z, boolean z2, @Nullable Map<String, String> map, User user, String str, LikeFrom likeFrom, boolean z3, @Nullable LikeExtraData likeExtraData, int i, String str2, boolean z4) {
        return m32084a8(z, z2, map, user, str, likeFrom, z3, likeExtraData, i, str2, z4, 1, false);
    }

    /* JADX INFO: renamed from: Z8 */
    public C22421c<uxj0> m32081Z8(final String str, final int i, final boolean z) {
        return this.f91137Q.now(str, new ti20(new pcj() { // from class: l.p4b
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f150522a.m32028M7(z, str);
            }
        }).doOnNext(new y20() { // from class: l.q4b
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f155549a.m32032N7((Envelope) obj);
            }
        }).compose(C4879a.m32255T2()).map(new qcj() { // from class: l.r4b
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f161183a.m32036O7(i, str, (Envelope) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: a6 */
    public final C22421c<uxj0> m32082a6(boolean z, final boolean z2) {
        this.f91137Q.f20405m0.f20186q2[2] = 0;
        this.f20157h0 = this.f20157h0 || z;
        this.f20183p2 = gta.m132210e().m132214d().mo34837gm().get();
        if (gta.m132210e().m132214d().mo34700Hg()) {
            CoreModule.f18264c.f20334O1.m185317p3();
        }
        final String strM32315j0 = this.f20183p2 ? C4879a.m32315j0(CoreModule.f18264c.f20381e0.m116600p9().f56859id) : m32137p6();
        this.f20175n0 = this.f20181p0;
        this.f20181p0 = System.currentTimeMillis();
        this.f20189r2 = "requesting";
        String strConcat = "users/suggested";
        if (gta.m132210e().m132214d().mo34907q0()) {
            strConcat = "users/suggested" + this.f20063A1.get();
        }
        if (gta.m132210e().m132214d().mo34882lk() && strM32315j0.contains("search=selected&mode=free_real_user")) {
            strConcat = strConcat.concat("just_real_user");
        }
        final C22421c map = new ti20(new pcj() { // from class: l.j2b
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4879a.f20236P.auth().m209043q(strM32315j0).m209032f().m209028b();
            }
        }).flatMap(new qcj() { // from class: l.k2b
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f123589a.m32079Z6((Envelope) obj);
            }
        }).doOnNext(new y20() { // from class: l.l2b
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f129760a.m32083a7((pf60) obj);
            }
        }).doOnError(new y20() { // from class: l.m2b
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f134533a.m32087b7((Throwable) obj);
            }
        }).subscribeOn(FastIoScheduler.f16349b).observeOn(fo0.m126432a()).map(new qcj() { // from class: l.n2b
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f139853a.m32095d7(z2, (pf60) obj);
            }
        });
        if (!RemoteConfig.m80481x().m80513s("cold_start_opt")) {
            return this.f91137Q.scheduled(strConcat, 0, new pcj() { // from class: l.o2b
                @Override // p153l.pcj, java.util.concurrent.Callable
                public final Object call() {
                    return CoreSuggested.m31922g5(map);
                }
            });
        }
        gta.m132210e().m132214d().mo34676Dg("start use now schedule");
        uqi.m197339f(LaunchStep.PreNet_Request);
        return this.f91137Q.now(strConcat, map, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a7 */
    public final /* synthetic */ void m32083a7(pf60 pf60Var) {
        uqi.m197337d(LaunchStep.PreNet_Request);
        uqi.m197339f(LaunchStep.PreNet_Op);
        this.f20189r2 = "parseing";
        Envelope envelope = (Envelope) pf60Var.f152156a;
        CommonData commonData = (CommonData) envelope.getModuleData(CommonData.class);
        gta.m132210e().m132214d().mo34676Dg("suggested data back");
        if (ConnectivityReceiver.m82469i()) {
            uqi.f180472o = true;
            gta.m132210e().m132214d().mo34676Dg("prefetch image to disk");
            if (!jyb.m147479J(commonData.users)) {
                m31962t8(((CommonData) envelope.getModuleData(CommonData.class)).users);
            }
        }
        if (gta.m132210e().m132214d().mo34805b() && !jyb.m147479J(commonData.users)) {
            CoreModule.m30934Q().putLiveState(((CommonData) envelope.getModuleData(CommonData.class)).users);
        }
        if (!gta.m132210e().m132214d().mo34816d7()) {
            m32104f8(envelope, commonData);
        }
        if (this.f20183p2 && jyb.m147479J(commonData.users)) {
            gta.m132210e().m132214d().mo34837gm().set(false);
        }
        if (gta.m132210e().m132214d().mo34783X9()) {
            this.f91137Q.f20356V1.f150515R = ((CoreData) envelope.getModuleData(CoreData.class)).greetingNewPeople;
        }
    }

    /* JADX INFO: renamed from: a8 */
    public C22421c<Relationship> m32084a8(boolean z, boolean z2, @Nullable Map<String, String> map, User user, String str, LikeFrom likeFrom, boolean z3, @Nullable LikeExtraData likeExtraData, int i, String str2, boolean z4, int i2, boolean z5) {
        return m32088b8(false, false, z, z2, map, user, str, likeFrom, z3, likeExtraData, i, str2, z4, i2, null, z5);
    }

    /* JADX INFO: renamed from: a9 */
    public C22421c<UserInfo> m32085a9(String str) {
        return m32161x6(dkb.m116355e7(str));
    }

    /* JADX INFO: renamed from: b6 */
    public void m32086b6(boolean z) {
        PartialListOpt<UserInfo> partialListOptM222761e = this.f20095L0.m222761e();
        if (partialListOptM222761e == null || jyb.m147479J(partialListOptM222761e.loaded)) {
            return;
        }
        PartialListOpt<UserInfo> partialListOptM222761e2 = this.f20136a0.m222761e();
        if (partialListOptM222761e2 == null || jyb.m147479J(partialListOptM222761e2.loaded)) {
            partialListOptM222761e.setRefreshValue(true);
            this.f20136a0.onNext(partialListOptM222761e);
            this.f20095L0.onNext(null);
            return;
        }
        if (!u7l.m194874a() || z) {
            UserInfo userInfo = partialListOptM222761e2.loaded.get(0);
            ArrayList arrayList = new ArrayList();
            arrayList.add(userInfo);
            for (UserInfo userInfo2 : partialListOptM222761e.loaded) {
                if (userInfo2 != null) {
                    if (userInfo == null) {
                        break;
                    } else if (TextUtils.equals(userInfo2.f20214id, userInfo.f20214id)) {
                        userInfo.ussTags = userInfo2.ussTags;
                    } else {
                        arrayList.add(userInfo2);
                    }
                }
            }
            this.f20136a0.onNext(new PartialListOpt<>(arrayList, partialListOptM222761e.links));
            this.f20095L0.onNext(null);
        }
    }

    /* JADX INFO: renamed from: b7 */
    public final /* synthetic */ void m32087b7(Throwable th) {
        this.f91137Q.f20405m0.f20186q2[2] = 2;
        this.f20178o0 = this.f20184q0;
        this.f20184q0 = System.currentTimeMillis();
        long jGuessedCurrentServerTime = uqb0.f180376H.guessedCurrentServerTime();
        int size = 0;
        if (NullChecker.m82486a(this.f20136a0.m222761e()) && NullChecker.m82486a(this.f20136a0.m222761e().loaded)) {
            size = this.f20136a0.m222761e().loaded.size();
        }
        m32089b9(th, size, jGuessedCurrentServerTime);
        this.f20076E2.onNext(uxj0.f181467a);
    }

    /* JADX INFO: renamed from: b8 */
    public C22421c<Relationship> m32088b8(boolean z, boolean z2, final boolean z3, final boolean z4, @Nullable Map<String, String> map, final User user, String str, final LikeFrom likeFrom, boolean z5, @Nullable final LikeExtraData likeExtraData, int i, String str2, boolean z6, int i2, String str3, final boolean z7) {
        Map<String, String> map2;
        DclExtensions dclExtensions;
        if (likeExtraData == null || !NullChecker.m82486a(likeExtraData.matchScData)) {
            map2 = map;
        } else {
            Map<String, String> map3 = !NullChecker.m82486a(map) ? new HashMap<>() : map;
            map3.put("receiver_user_id", likeExtraData.matchScData.receiverUserId);
            map2 = map3;
        }
        final UserInfo userInfoM32070X5 = m32014J5(user) ? m32070X5(z, z3, z4, user, likeFrom, i, z6) : this.f20151f0;
        if (userInfoM32070X5 == null) {
            CrashHelper.m82479c(new Exception("Like Api Error: Perhaps suggested users were cleared or reset when doing Swipe Card Animation"));
            return C22421c.just(Relationship.new_());
        }
        if (userInfoM32070X5.liveLivingCardDataWrapper != null && userInfoM32070X5.isVirtualCard()) {
            userInfoM32070X5.f20214id = userInfoM32070X5.liveLivingCardDataWrapper.getOriginUserId();
        }
        final Relationship relationshipM32058U5 = m32058U5(z, z2, z3, z4, i2, userInfoM32070X5, str, likeFrom, str2, likeExtraData, str3);
        if (likeExtraData != null && (dclExtensions = likeExtraData.liveExtraInfo) != null) {
            relationshipM32058U5.dclExtensions = dclExtensions;
        }
        if (likeExtraData != null && !TextUtils.isEmpty(likeExtraData.profileLikeId)) {
            try {
                relationshipM32058U5.likeProfileId = Integer.parseInt(likeExtraData.profileLikeId);
                relationshipM32058U5.status.add(MatchFrom.get(MatchFrom.profileLiked));
            } catch (Exception unused) {
            }
        }
        if (TEnum.equals(likeFrom, "poi")) {
            if (relationshipM32058U5.dclExtensions == null) {
                relationshipM32058U5.dclExtensions = DclExtensions.new_();
            }
            relationshipM32058U5.dclExtensions.businessType = DclExtensions.DCL_EXT_BUSINESS_TYPE_POI;
        }
        if (TEnum.equals(likeFrom, LikeFrom.get("instantChat"))) {
            if (relationshipM32058U5.relationshipExtensions == null) {
                relationshipM32058U5.relationshipExtensions = RelationshipExtensions.new_();
            }
            relationshipM32058U5.relationshipExtensions.business_type = "instantChat";
        }
        final Long lM32098e6 = m32098e6(relationshipM32058U5, likeFrom, i2, userInfoM32070X5.f20214id);
        final Map<String, String> map4 = map2;
        return this.f91137Q.scheduled("cardlike", -1, new pcj() { // from class: l.i3b
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f112702a.m32170z7(z3, userInfoM32070X5, relationshipM32058U5, map4, lM32098e6, z4, user, z7, likeExtraData, likeFrom);
            }
        }, z5);
    }

    /* JADX INFO: renamed from: b9 */
    public final void m32089b9(Throwable th, int i, long j) {
        sfj0.m185607n("e_suggested_user_refresh", "p_suggest_users_home_view", sfj0.C20032a.m185615h("if_error", "YES"), sfj0.C20032a.m185615h("error_types", NullChecker.m82486a(th) ? th.getMessage() : ""), sfj0.C20032a.m185613f("card_origin_count", 0), sfj0.C20032a.m185613f("card_filter_count", i), sfj0.C20032a.m185615h("last_start_refresh_timestamp", String.valueOf(this.f20175n0)), sfj0.C20032a.m185615h("last_end_refresh_timestamp", String.valueOf(this.f20178o0)), sfj0.C20032a.m185615h("start_refresh_timestamp", String.valueOf(this.f20181p0)), sfj0.C20032a.m185615h("end_refresh_timestamp", String.valueOf(this.f20184q0)), sfj0.C20032a.m185615h("end_refresh_server_timestamp", String.valueOf(j)), sfj0.C20032a.m185613f("card_available_count", 0));
    }

    /* JADX INFO: renamed from: c6 */
    public final String m32090c6(String str) {
        if (!gta.m132210e().m132214d().mo34801ak() && !gta.m132210e().m132214d().mo34956yg()) {
            return str;
        }
        return str + "&fake_photo_feedback=true";
    }

    /* JADX INFO: renamed from: c7 */
    public final /* synthetic */ void m32091c7(Envelope envelope) {
        m32104f8(envelope, (CommonData) envelope.getModuleData(CommonData.class));
    }

    /* JADX INFO: renamed from: c8 */
    public C22421c<uxj0> m32092c8(final String str) {
        return this.f91137Q.scheduled("live_user_card_cancel_" + str, 0, new pcj() { // from class: l.o4b
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return qi20.m176654a(new pcj() { // from class: l.h5b
                    @Override // p153l.pcj, java.util.concurrent.Callable
                    public final Object call() {
                        return C4879a.f20236P.auth().m209043q(C4879a.m32188C0(CoreModule.m30929H().userId(), str)).m209028b();
                    }
                }).map(new qcj() { // from class: l.i5b
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return uxj0.f181467a;
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: c9 */
    public final void m32093c9(int i, int i2, long j, int i3) {
        sfj0.m185607n("e_suggested_user_refresh", "p_suggest_users_home_view", sfj0.C20032a.m185615h("if_error", "NO"), sfj0.C20032a.m185615h("error_types", ""), sfj0.C20032a.m185613f("card_origin_count", i), sfj0.C20032a.m185613f("card_filter_count", i2), sfj0.C20032a.m185615h("last_start_refresh_timestamp", String.valueOf(this.f20175n0)), sfj0.C20032a.m185615h("last_end_refresh_timestamp", String.valueOf(this.f20178o0)), sfj0.C20032a.m185615h("start_refresh_timestamp", String.valueOf(this.f20181p0)), sfj0.C20032a.m185615h("end_refresh_timestamp", String.valueOf(this.f20184q0)), sfj0.C20032a.m185615h("end_refresh_server_timestamp", String.valueOf(j)), sfj0.C20032a.m185613f("card_available_count", i3));
    }

    /* JADX INFO: renamed from: d6 */
    public final String m32094d6(String str) {
        return (!CoreModule.m30933P().m143412i().mo180364N() || !gta.m132210e().m132214d().mo34873kc() || TextUtils.isEmpty(str) || str.contains("fake_scene")) ? str : str.concat("&fake_scene=top_pop_max");
    }

    /* JADX WARN: Code duplicated, block: B:123:0x02e6  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: d7 */
    public final /* synthetic */ uxj0 m32095d7(boolean z, pf60 pf60Var) {
        int size;
        boolean z2;
        long j;
        List<UserInfo> list;
        String str;
        long j2;
        this.f20070C2 = false;
        char c = 2;
        this.f91137Q.f20405m0.f20186q2[2] = 1;
        final Envelope envelope = (Envelope) pf60Var.f152156a;
        if (gta.m132210e().m132214d().mo34816d7()) {
            List<User> list2 = ((CommonData) envelope.getModuleData(CommonData.class)).users;
            if (!jyb.m147479J(list2)) {
                jyb.m147537z(list2, new y20() { // from class: l.m3b
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        User user = (User) obj;
                        uqb0.f180405k0.f184355d.cache(user.f56859id, user);
                    }
                });
            }
            Counter counterM32487o3 = CoreModule.f18264c.m32487o3();
            Counter counter = envelope.counters;
            if (counterM32487o3 == null) {
                CoreModule.f18264c.m32477F3(counter);
            } else {
                counter.mergeData(CoreModule.f18264c.m32487o3());
                CoreModule.f18264c.m32477F3(envelope.counters);
            }
            C4883c c4883c = CoreModule.f18264c;
            c4883c.f20352U0.onNext(c4883c.m32487o3());
            l51.m152913s(new Runnable() { // from class: l.o3b
                @Override // java.lang.Runnable
                public final void run() {
                    this.f144826a.m32091c7(envelope);
                }
            });
        }
        uqi.m197337d(LaunchStep.PreNet);
        gta.m132210e().m132214d().mo34676Dg("suggested data transform to MainThread");
        this.f20178o0 = this.f20184q0;
        this.f20184q0 = System.currentTimeMillis();
        long jGuessedCurrentServerTime = uqb0.f180376H.guessedCurrentServerTime();
        PartialListOpt<UserInfo> partialListOptM222761e = this.f20136a0.m222761e();
        List<UserInfo> arrayList = partialListOptM222761e == null ? new ArrayList<>() : partialListOptM222761e.loaded;
        int size2 = arrayList.size();
        if (z) {
            arrayList = new ArrayList<>();
            if (!jyb.m147479J(((CommonData) envelope.getModuleData(CommonData.class)).users)) {
                for (User user : ((CommonData) envelope.getModuleData(CommonData.class)).users) {
                    if (user != null && this.f20130Y.contains(user.f56859id)) {
                        this.f20130Y.remove(user.f56859id);
                    }
                }
            }
        } else if (!jyb.m147479J(((CommonData) envelope.getModuleData(CommonData.class)).users)) {
            for (final User user2 : ((CommonData) envelope.getModuleData(CommonData.class)).users) {
                if (user2 != null && user2.isRepeatUser() && !jyb.m147520m(arrayList, new qcj() { // from class: l.p3b
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return Boolean.valueOf(((CoreSuggested.UserInfo) obj).f20214id.equals(user2.f56859id));
                    }
                }) && this.f20130Y.contains(user2.f56859id)) {
                    this.f20130Y.remove(user2.f56859id);
                }
            }
        }
        if (this.f20157h0) {
            int iMin = Math.min(arrayList.size(), Math.max(this.f20127X, arrayList.size() - ((CommonData) envelope.getModuleData(CommonData.class)).users.size()));
            if (iMin >= 0 && iMin <= arrayList.size()) {
                Iterator<UserInfo> it = arrayList.subList(iMin, arrayList.size()).iterator();
                while (it.hasNext()) {
                    this.f20130Y.remove(it.next().f20214id);
                }
            }
            if (iMin == 0 && !jyb.m147479J(arrayList) && C4881b.m32411b(arrayList.get(0).virtualCardType)) {
                this.f20162i2.onNext(SwipeDirection.REMOVE);
            }
            arrayList = arrayList.subList(0, iMin);
            this.f20157h0 = false;
        }
        this.f20127X = 2;
        this.f20124W = C4879a.f20236P.guessedCurrentServerTime();
        List<User> listM32394h = C4880a0.m32390j().m32394h(((CommonData) envelope.getModuleData(CommonData.class)).users);
        List<SuggestedComplimentItem> list3 = ((CoreData) envelope.getModuleData(CoreData.class)).compliments;
        this.f20128X0.clear();
        if (!jyb.m147479J(list3)) {
            for (SuggestedComplimentItem suggestedComplimentItem : list3) {
                if (NullChecker.m82486a(suggestedComplimentItem) && !TextUtils.isEmpty(suggestedComplimentItem.senderId)) {
                    this.f20128X0.putIfAbsent(suggestedComplimentItem.senderId, suggestedComplimentItem);
                }
                c = c;
            }
        }
        char c2 = c;
        List<UserInfo> listM31990D5 = m31990D5(envelope, listM32394h);
        if (jyb.m147479J(listM31990D5)) {
            size = 0;
            z2 = false;
        } else {
            arrayList.addAll(listM31990D5);
            Iterator<UserInfo> it2 = listM31990D5.iterator();
            while (it2.hasNext()) {
                this.f20130Y.add(it2.next().f20214id);
            }
            size = listM31990D5.size();
            z2 = true;
        }
        m31979A6(arrayList, listM32394h);
        this.f20190s0 = null;
        if (jyb.m147479J(listM32394h)) {
            j = jGuessedCurrentServerTime;
        } else {
            SparseArray sparseArray = (SparseArray) pf60Var.f152157b;
            int i = 0;
            boolean z3 = false;
            boolean z4 = false;
            while (i < sparseArray.size()) {
                int iKeyAt = sparseArray.keyAt(i);
                UserInfo userInfo = (UserInfo) sparseArray.get(iKeyAt);
                if (userInfo.isIntlLikeLimitInsert) {
                    this.f20190s0 = userInfo;
                    j2 = jGuessedCurrentServerTime;
                } else {
                    j2 = jGuessedCurrentServerTime;
                    if (!this.f20130Y.contains(userInfo.f20214id)) {
                        int i2 = iKeyAt + size2;
                        if (arrayList.size() > i2) {
                            arrayList.add(i2, userInfo);
                        } else {
                            arrayList.add((UserInfo) sparseArray.get(iKeyAt));
                        }
                        if (!userInfo.isVirtualCard()) {
                            this.f20130Y.add(userInfo.f20214id);
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
                m32118j6();
            }
            if (z4) {
                this.f20153f2.onNext(Boolean.TRUE);
            }
        }
        if (jyb.m147479J(arrayList)) {
            list = arrayList;
        } else {
            List<UserInfo> listM207941c = wu90.m207939b().m207941c(this.f91137Q.f20381e0.m116600p9(), arrayList, this.f20130Y, listM32394h);
            if (jyb.m147479J(listM207941c)) {
                list = arrayList;
            } else {
                list = listM207941c;
            }
        }
        m32142q8(list, listM32394h);
        m31991D6(list, listM32394h);
        if (!NullChecker.m82486a(this.f20190s0) || jyb.m147479J(list) || CoreModule.m30930K().counter_().likeLimit.remaining > 0) {
            str = null;
        } else {
            m31987C6(list, this.f20190s0);
            list.add(0, this.f20190s0);
            str = null;
            this.f20190s0 = null;
        }
        m32093c9(jyb.m147479J(((CommonData) envelope.getModuleData(CommonData.class)).users) ? 0 : ((CommonData) envelope.getModuleData(CommonData.class)).users.size(), list.size(), j, size);
        DbLinks dbLinksNew_ = DbLinks.new_();
        dbLinksNew_.links.next = z2 ? "" : str;
        if (z) {
            this.f20095L0.onNext(new PartialListOpt<>(list, dbLinksNew_));
            m32086b6(false);
        } else {
            if (gta.m132210e().m132214d().mo34804ar()) {
                if (!gta.m132210e().m132214d().mo34957yh()) {
                    gta.m132210e().m132214d().mo34883ll(list);
                    this.f20142c0.onNext(uxj0.f181467a);
                    gta.m132210e().m132214d().mo34812cp();
                } else if (!jyb.m147479J(list)) {
                    gta.m132210e().m132214d().mo34847hh(list);
                }
            }
            gta.m132210e().m132214d().mo34676Dg("suggested data emmit");
            gta.m132210e().m132214d().mo34889nj(list, ((CoreData) envelope.getModuleData(CoreData.class)).lives);
            gta.m132210e().m132214d().mo34965zs(list, ((CoreData) envelope.getModuleData(CoreData.class)).voices);
            this.f20189r2 = "requested" + (System.currentTimeMillis() - this.f20181p0);
            CoreProviderInterface coreProviderInterfaceM132214d = gta.m132210e().m132214d();
            if (coreProviderInterfaceM132214d.mo34882lk() || coreProviderInterfaceM132214d.mo34717Kl()) {
                if (!CoreModule.f18264c.f20446z2.m31251p3() || ((dkb.m116320V7() && !joa.m146361M3()) || jyb.m147479J(list) || CoreModule.f18264c.f20446z2.f19967e0.get().booleanValue())) {
                    CoreModule.f18264c.f20446z2.f19963a0 = false;
                } else {
                    l51.m152887G(new Runnable() { // from class: l.q3b
                        @Override // java.lang.Runnable
                        public final void run() {
                            o1j0.m165651y("只为你推荐完成头像认证的用户");
                        }
                    });
                    CoreModule.f18264c.f20446z2.f19967e0.put(Boolean.TRUE);
                    CoreModule.f18264c.f20446z2.f19963a0 = true;
                }
            }
            uqi.m197337d(LaunchStep.PreNet_Op);
            this.f20136a0.onNext(new PartialListOpt(list, dbLinksNew_).setReason(PartialListOpt.RefreshReason.SUGGEST_LOAD));
        }
        if (gta.m132210e().m132214d().mo34934u()) {
            if (gta.m132210e().m132214d().mo34811c() && NullChecker.m82486a(CoreModule.f18264c.f20381e0.m116600p9()) && CoreModule.f18264c.f20381e0.m116600p9().isFemale() && !CoreModule.f18264c.f20300D0.f20876Y && !gta.m132210e().m132214d().mo34899oq()) {
                CoreModule.f18264c.f20300D0.f20876Y = true;
                C22421c.timer(5L, TimeUnit.SECONDS).subscribe(new y20() { // from class: l.r3b
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        CoreModule.f18264c.f20300D0.m35845R4();
                    }
                });
            }
        } else if (gta.m132210e().m132214d().mo34811c() && NullChecker.m82486a(CoreModule.f18264c.f20381e0.m116600p9()) && CoreModule.f18264c.f20381e0.m116600p9().isFemale() && !CoreModule.f18264c.f20300D0.f20876Y && !gta.m132210e().m132214d().mo34899oq()) {
            l51.m152887G(new Runnable() { // from class: l.s3b
                @Override // java.lang.Runnable
                public final void run() {
                    CoreSuggested.m31909c4();
                }
            });
        }
        if (CoreModule.m30933P().m143410g().mo36051b8()) {
            this.f91137Q.f20383e2.f153006U = new ArrayList();
            for (UserInfo userInfo2 : list) {
                if (userInfo2.isPinLike) {
                    UserWithRelationShip userWithRelationShipNew_ = UserWithRelationShip.new_();
                    userWithRelationShipNew_.userId = userInfo2.f20214id;
                    userWithRelationShipNew_.relationship = userInfo2.topLikeRelationship;
                    this.f91137Q.f20383e2.f153006U.add(userWithRelationShipNew_);
                }
            }
            pla plaVar = this.f91137Q.f20383e2;
            Collections.sort(plaVar.f153006U, plaVar.f153015d0);
            this.f91137Q.f20383e2.m172821u3();
        }
        C22507a<uxj0> c22507a = this.f20115T;
        uxj0 uxj0Var = uxj0.f181467a;
        c22507a.onNext(uxj0Var);
        this.f91137Q.f20405m0.f20186q2[c2] = 3;
        if (list.size() > 0 && this.f91137Q.f20405m0.f20064A2 == 0) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            CoreSuggested coreSuggested = this.f91137Q.f20405m0;
            coreSuggested.f20064A2 = jCurrentTimeMillis - coreSuggested.f20210y2;
            if (this.f91137Q.f20405m0.f20064A2 > 0 && this.f91137Q.f20405m0.f20213z2 > 0) {
                i4g0.m138493B("e_homepage_network_and_layout", "p_suggest_users_home_view", new pf60("suggest_network_time", Long.valueOf(this.f91137Q.f20405m0.f20064A2)), new pf60("card_layout_time", Long.valueOf(this.f91137Q.f20405m0.f20213z2)), new pf60("suggest_network_time_diff_card_layout_time", Long.valueOf(this.f91137Q.f20405m0.f20064A2 - this.f91137Q.f20405m0.f20213z2)));
            }
        }
        return uxj0Var;
    }

    /* JADX INFO: renamed from: d8 */
    public C22421c<uxj0> m32096d8(final String str) {
        return this.f91137Q.scheduled("live_user_card_enter_" + str, 0, new pcj() { // from class: l.c4b
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return qi20.m176654a(new pcj() { // from class: l.i1b
                    @Override // p153l.pcj, java.util.concurrent.Callable
                    public final Object call() {
                        return C4879a.f20236P.auth().m209043q(C4879a.m32192D0(CoreModule.m30929H().userId(), str)).m209028b();
                    }
                }).map(new qcj() { // from class: l.j1b
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return uxj0.f181467a;
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: d9 */
    public void m32097d9() {
        if (this.f20136a0.m222761e() != null) {
            Iterator<UserInfo> it = this.f20136a0.m222761e().loaded.iterator();
            while (it.hasNext()) {
                UserInfo next = it.next();
                if (next.picksGuideUser) {
                    this.f20130Y.remove(next.f20214id);
                    it.remove();
                }
            }
        }
        this.f20136a0.m222761e().setRefreshValue(true);
        C22507a<PartialListOpt<UserInfo>> c22507a = this.f20136a0;
        c22507a.onNext(c22507a.m222761e().setReason(PartialListOpt.RefreshReason.tryRemoveInsertedPicksUser));
    }

    /* JADX INFO: renamed from: e6 */
    public final Long m32098e6(Relationship relationship, LikeFrom likeFrom, int i, String str) {
        if (!NullChecker.m82486a(relationship)) {
            return 0L;
        }
        boolean z = false;
        boolean z2 = !jyb.m147479J(relationship.status) && relationship.status.contains(MatchFrom.get(MatchFrom.superLiked));
        boolean z3 = z2 && gta.m132210e().m132214d().mo34854ig();
        if (!jyb.m147479J(relationship.status) && relationship.status.contains(MatchFrom.get("letter"))) {
            z = true;
        }
        if (z2 && i > 1) {
            int iMo34708J8 = gta.m132210e().m132214d().mo34708J8();
            int iMo34819dq = gta.m132210e().m132214d().mo34819dq();
            if (gta.m132210e().m132214d().mo34914qr(str) && i <= 3) {
                relationship.consumeType = ConsumeType.handsel;
            } else if (i <= iMo34708J8 || gta.m132210e().m132214d().mo34885m3()) {
                relationship.consumeType = "privilege";
            } else if (iMo34708J8 <= 0 || i > iMo34819dq) {
                relationship.consumeType = "coin";
            } else {
                relationship.consumeType = "all";
            }
        } else if (TEnum.equals(likeFrom, "greet")) {
            relationship.consumeType = "free";
        } else if (z) {
            if (joa.m146355E3()) {
                relationship.consumeType = "privilege";
            } else {
                relationship.consumeType = "coin";
            }
        } else if (TEnum.equals(likeFrom, "instantChat")) {
            relationship.consumeType = "privilege";
        } else {
            relationship.consumeType = lqb.m155388i4(z3);
        }
        if (z2) {
            return CoreModule.f18264c.f20312H0.m155465s5(relationship.consumeType, SummarizedPrivilegesId.get("superLike"));
        }
        if (z) {
            return CoreModule.f18264c.f20312H0.m155465s5(relationship.consumeType, SummarizedPrivilegesId.get("letter"));
        }
        return null;
    }

    /* JADX INFO: renamed from: e7 */
    public final /* synthetic */ pf60 m32099e7(String str, Envelope envelope) {
        pf60<Links, List<DislikedUsers>> pf60Var;
        HashMap mapM147502d = jyb.m147502d(((CommonData) envelope.getModuleData(CommonData.class)).users, new qcj() { // from class: l.a4b
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((User) obj).f56859id;
            }
        }, new qcj() { // from class: l.b4b
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return CoreSuggested.m31862G3((User) obj);
            }
        });
        List<DislikedUsers> list = ((CoreData) envelope.getModuleData(CoreData.class)).dislikedUsers;
        ArrayList arrayList = new ArrayList();
        if (TextUtils.isEmpty(str)) {
            this.f20133Z = new HashSet<>();
        }
        for (DislikedUsers dislikedUsers : list) {
            User user = (User) mapM147502d.get(dislikedUsers.f21129id);
            if (this.f20133Z.add(dislikedUsers.f21129id) && NullChecker.m82486a(user)) {
                dislikedUsers.userInfo = user;
                arrayList.add(dislikedUsers);
            }
        }
        pf60<Links, List<DislikedUsers>> pf60VarM222761e = this.f20109R.m222761e();
        if (TextUtils.isEmpty(str) || !NullChecker.m82486a(pf60VarM222761e) || jyb.m147479J(pf60VarM222761e.f152157b)) {
            pf60Var = new pf60<>(envelope.pagination.links, arrayList);
        } else {
            pf60VarM222761e.f152157b.addAll(arrayList);
            pf60Var = new pf60<>(envelope.pagination.links, pf60VarM222761e.f152157b);
        }
        this.f20109R.onNext(pf60Var);
        return pf60Var;
    }

    /* JADX INFO: renamed from: e8 */
    public void m32100e8() {
        this.f20070C2 = true;
    }

    /* JADX INFO: renamed from: e9 */
    public void m32101e9() {
        scheduled("post_try_to_increase_see_list", -1, new pcj() { // from class: l.n3b
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f139958a.m32044Q7();
            }
        });
    }

    /* JADX INFO: renamed from: f6 */
    public void m32102f6(Links links) {
        final String str = (!NullChecker.m82486a(links) || TextUtils.isEmpty(links.next)) ? "" : String.format("?%s", links.next);
        scheduled("get_dis_liked_users".concat(str), 0, new pcj() { // from class: l.j4b
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f118281a.m32103f7(str);
            }
        });
    }

    /* JADX INFO: renamed from: f7 */
    public final /* synthetic */ C22421c m32103f7(final String str) {
        return qi20.m176654a(new pcj() { // from class: l.p2b
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4879a.f20236P.auth().m209032f().m209043q(C4879a.m32203G("/disliked-users" + str)).m209028b();
            }
        }).map(new qcj() { // from class: l.q2b
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f155314a.m32099e7(str, (Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: f8 */
    public final void m32104f8(Envelope envelope, final CommonData commonData) {
        gta.m132210e().m132214d().mo34676Dg("database merge suggested data start");
        LaunchStep launchStep = LaunchStep.PreNet_Db;
        uqi.m197339f(launchStep);
        this.f91137Q.m32497y3(envelope, new x20() { // from class: l.w4b
            @Override // p153l.x20
            public final void call() {
                CoreSuggested.m31869J4(commonData);
            }
        }, true, false, true);
        uqi.m197337d(launchStep);
        gta.m132210e().m132214d().mo34676Dg("database merge suggested data end");
    }

    /* JADX INFO: renamed from: f9 */
    public C22421c<Relationship> m32105f9(Map<String, String> map) {
        return m32109g9(true, null, map);
    }

    /* JADX INFO: renamed from: g6 */
    public C22507a<pf60<Links, List<DislikedUsers>>> m32106g6() {
        return this.f20109R;
    }

    /* JADX INFO: renamed from: g7 */
    public final /* synthetic */ void m32107g7(String str) {
        CoreModule.f18264c.f20405m0.m32081Z8(str, m31994E5(), true);
    }

    /* JADX INFO: renamed from: g8 */
    public final boolean m32108g8(UserInfo userInfo, UserInfo userInfo2) {
        return NullChecker.m82486a(userInfo2) && NullChecker.m82486a(userInfo) && userInfo2.f20214id.equals(UserInfo.VIRTUAL_CARD) && userInfo2.virtualCardType != userInfo.virtualCardType;
    }

    /* JADX INFO: renamed from: g9 */
    public C22421c<Relationship> m32109g9(final boolean z, y20<String> y20Var, final Map<String, String> map) {
        User user = this.f20160i0;
        if (user == null || this.f20163j0 == null) {
            return null;
        }
        final User userMo225055clone = user.mo225055clone();
        final UserInfo userInfoM225062clone = this.f20163j0.m225062clone();
        if (y20Var != null) {
            y20Var.call(userInfoM225062clone.f20214id);
        }
        if (userInfoM225062clone.meetAgain) {
            userInfoM225062clone.isUndo = true;
            if (!z) {
                userInfoM225062clone.preSwipedDirection = null;
            }
            m32157w6(userInfoM225062clone, 0);
            m32034O5();
            return C22421c.just(userMo225055clone.localRelationship);
        }
        final Relationship relationship = new Relationship();
        relationship.state = RelationshipStatus.get("default");
        User userM116503Pa = CoreModule.f18264c.f20381e0.m116503Pa(userMo225055clone.f56859id);
        if (NullChecker.m82486a(userM116503Pa) && !TextUtils.isEmpty(userM116503Pa.ussTracker)) {
            relationship.ussTracker = userM116503Pa.ussTracker;
        }
        return this.f91137Q.scheduled("undo", -1, new pcj() { // from class: l.k4b
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f123873a.m32056T7(userMo225055clone, relationship, map, userInfoM225062clone, z);
            }
        });
    }

    /* JADX INFO: renamed from: h6 */
    public HashMap<String, SuggestedComplimentItem> m32110h6() {
        return this.f20128X0;
    }

    /* JADX INFO: renamed from: h7 */
    public final /* synthetic */ void m32111h7(Envelope envelope) {
        this.f91137Q.m32497y3(envelope, null, true, false, true);
    }

    /* JADX INFO: renamed from: h8 */
    public final void m32112h8(String str) {
        if (this.f20136a0.m222761e() == null) {
            return;
        }
        this.f20136a0.m222761e().setRefreshValue(true);
        C22507a<PartialListOpt<UserInfo>> c22507a = this.f20136a0;
        c22507a.onNext(c22507a.m222761e().setReasonStr(PartialListOpt.RefreshReason.NOTIFY_INNER.getReason() + "_" + str));
    }

    /* JADX INFO: renamed from: h9 */
    public C22421c<uxj0> m32113h9() {
        return this.f20079F2;
    }

    /* JADX INFO: renamed from: i6 */
    public void m32114i6(final String str) {
        C22421c.just(str).filter(new qcj() { // from class: l.v2b
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(!CoreModule.f18264c.f20405m0.f20187r0.contains((String) obj));
            }
        }).map(new qcj() { // from class: l.w2b
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return CoreSuggested.m31907b5(str, (String) obj);
            }
        }).subscribe(psd0.m173597H(new y20() { // from class: l.x2b
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f192136a.m32107g7((String) obj);
            }
        }, new y20() { // from class: l.y2b
            @Override // p153l.y20
            public final void call(Object obj) {
                CoreSuggested.m31926i3((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: i7 */
    public final /* synthetic */ Envelope m32115i7(Envelope envelope) {
        this.f91137Q.m32495w3(envelope, null);
        return envelope;
    }

    /* JADX INFO: renamed from: i8 */
    public void m32116i8() {
        this.f20076E2.onNext(uxj0.f181467a);
    }

    /* JADX INFO: renamed from: i9 */
    public C22421c<uxj0> m32117i9(final String str) {
        return this.f91137Q.scheduled("voice_user_card_cancel_" + str, 0, new pcj() { // from class: l.c5b
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return qi20.m176654a(new pcj() { // from class: l.t5b
                    @Override // p153l.pcj, java.util.concurrent.Callable
                    public final Object call() {
                        return C4879a.f20236P.auth().m209043q(C4879a.m32188C0(CoreModule.m30929H().userId(), str) + "?type=voice").m209028b();
                    }
                }).map(new qcj() { // from class: l.u5b
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return uxj0.f181467a;
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: j6 */
    public final void m32118j6() {
        CoreModule.f18264c.f20429u0.m31413R6(25, true).subscribe(psd0.m173597H(new y20() { // from class: l.s1b
            @Override // p153l.y20
            public final void call(Object obj) {
                CoreModule.f18264c.f20429u0.f19976R = (List) ((pf60) obj).f152157b;
            }
        }, new y20() { // from class: l.t1b
            @Override // p153l.y20
            public final void call(Object obj) {
                CoreSuggested.m31937l5((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: j7 */
    public final /* synthetic */ uxj0 m32119j7(Envelope envelope) {
        ArrayList arrayList = new ArrayList();
        for (User user : ((CommonData) envelope.getModuleData(CommonData.class)).users) {
            arrayList.add(new C4878e(user.f56859id, user.popLevel));
        }
        Collections.sort(arrayList);
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((C4878e) it.next()).f20219a);
        }
        DbLinks dbLinksNew_ = DbLinks.new_();
        dbLinksNew_.links.next = "";
        this.f20085H2.onNext(new vg60<>(arrayList2, dbLinksNew_));
        if (!jyb.m147479J(this.f20130Y) && !jyb.m147479J(arrayList)) {
            this.f20130Y.remove(((C4878e) arrayList.get(0)).f20219a);
        }
        return uxj0.f181467a;
    }

    /* JADX INFO: renamed from: j8 */
    public final void m32120j8(final Notification<Envelope> notification, boolean z, final boolean z2, final UserInfo userInfo, final User user) {
        Relationship relationship;
        if (!notification.m222545j() && notification.m222546k()) {
            User userM116506Q9 = CoreModule.f18264c.f20381e0.m116506Q9(userInfo.f20214id);
            final ConversationStatus conversationStatus = (userM116506Q9 == null || (relationship = userM116506Q9.localRelationship) == null) ? ConversationStatus.get("default") : relationship.conversationStatus;
            RelationshipStatus relationshipStatus = RelationshipStatus.get("unknown_");
            if (jyb.m147479J(((CoreData) notification.m222541f().getModuleData(CoreData.class)).relationships)) {
                CrashHelper.m82485i(new Exception("return null relationships"), "core_like", CrashHelper.ReportLevel.p5, 100);
            } else {
                relationshipStatus = ((CoreData) notification.m222541f().getModuleData(CoreData.class)).relationships.get(0).state;
            }
            if (TEnum.equals(relationshipStatus, "matched")) {
                ArrayList arrayList = new ArrayList();
                boolean z3 = (jyb.m147479J(((CoreData) notification.m222541f().getModuleData(CoreData.class)).relationships) || jyb.m147479J(((CoreData) notification.m222541f().getModuleData(CoreData.class)).relationships.get(0).status)) ? false : true;
                if (z3 && ((CoreData) notification.m222541f().getModuleData(CoreData.class)).relationships.get(0).status.contains(MatchFrom.get("letter"))) {
                    arrayList.add(MatchFrom.get("letter"));
                }
                if (z2 && userM116506Q9 != null && userM116506Q9.superLikedMe()) {
                    arrayList.add(MatchFrom.get(MatchFrom.superLikedEach));
                } else if (z2 || (userM116506Q9 != null && userM116506Q9.superLikedMe())) {
                    arrayList.add(MatchFrom.get(MatchFrom.superLiked));
                }
                if (userM116506Q9 != null && userM116506Q9.boosted()) {
                    arrayList.add(MatchFrom.get("boosted"));
                }
                if (gta.m132210e().m132214d().mo34811c() && userM116506Q9 != null && userM116506Q9.onlineMatch()) {
                    arrayList.add(MatchFrom.get("quickchat"));
                }
                if (z3 && ((CoreData) notification.m222541f().getModuleData(CoreData.class)).relationships.get(0).status.contains(MatchFrom.get("secretcrush"))) {
                    arrayList.add(MatchFrom.get("secretcrush"));
                }
                if (z3 && ((CoreData) notification.m222541f().getModuleData(CoreData.class)).relationships.get(0).status.contains(MatchFrom.get("online")) && !arrayList.contains(MatchFrom.get("online"))) {
                    arrayList.add(MatchFrom.get("online"));
                }
                if (z3 && ((CoreData) notification.m222541f().getModuleData(CoreData.class)).relationships.get(0).status.contains(MatchFrom.get("boosted")) && !arrayList.contains(MatchFrom.get("boosted"))) {
                    arrayList.add(MatchFrom.get("boosted"));
                }
                if (z3 && ((CoreData) notification.m222541f().getModuleData(CoreData.class)).relationships.get(0).status.contains(MatchFrom.get(MatchFrom.vipseen)) && !arrayList.contains(MatchFrom.get(MatchFrom.vipseen))) {
                    arrayList.add(MatchFrom.get(MatchFrom.vipseen));
                }
                if (z3 && ((CoreData) notification.m222541f().getModuleData(CoreData.class)).relationships.get(0).status.contains(MatchFrom.get(MatchFrom.diamondReceived)) && !arrayList.contains(MatchFrom.get(MatchFrom.diamondReceived))) {
                    arrayList.add(MatchFrom.get(MatchFrom.diamondReceived));
                }
                if (z3 && ((CoreData) notification.m222541f().getModuleData(CoreData.class)).relationships.get(0).status.contains(MatchFrom.get(MatchFrom.diamondGiven)) && !arrayList.contains(MatchFrom.get(MatchFrom.diamondGiven))) {
                    arrayList.add(MatchFrom.get(MatchFrom.diamondGiven));
                }
                if (z3) {
                    ((CoreData) notification.m222541f().getModuleData(CoreData.class)).relationships.get(0).status = arrayList;
                }
                if (user == null && this.f20160i0 != null && !jyb.m147479J(((CoreData) notification.m222541f().getModuleData(CoreData.class)).relationships) && this.f20160i0.f56859id.equals(((CoreData) notification.m222541f().getModuleData(CoreData.class)).relationships.get(0).f39654id)) {
                    m32034O5();
                }
            } else if (user == null && this.f20160i0 != null && !jyb.m147479J(((CoreData) notification.m222541f().getModuleData(CoreData.class)).relationships) && this.f20160i0.f56859id.equals(((CoreData) notification.m222541f().getModuleData(CoreData.class)).relationships.get(0).f39654id)) {
                this.f20163j0.canUndo = true;
            }
            if (z2) {
                gta.m132210e().m132214d().mo34790Y7(notification.m222541f(), "relationship");
            }
            this.f91137Q.m32495w3(notification.m222541f(), new x20() { // from class: l.l5b
                @Override // p153l.x20
                public final void call() {
                    this.f130088a.m31980A7(notification, userInfo, user, conversationStatus, z2);
                }
            });
            this.f91137Q.f20429u0.m31380B7(userInfo.f20214id);
        }
    }

    /* JADX INFO: renamed from: j9 */
    public C22421c<uxj0> m32121j9() {
        return CoreModule.f18264c.wait(Settings.TYPE, -1);
    }

    /* JADX INFO: renamed from: k6 */
    public C22421c<UserInfo> m32122k6() {
        return scheduled("getLiveDiversionCardInfo", 0, new pcj() { // from class: l.l4b
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return qi20.m176658e(new pcj() { // from class: l.r1b
                    @Override // p153l.pcj, java.util.concurrent.Callable
                    public final Object call() {
                        return C4879a.f20236P.auth().m209032f().m209043q(C4879a.m32203G("/users?search=liveInsert")).m209028b();
                    }
                });
            }
        }).doOnNext(new y20() { // from class: l.m4b
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f134776a.m32111h7((Envelope) obj);
            }
        }).map(new C4874a()).compose(C4879a.m32255T2());
    }

    /* JADX INFO: renamed from: k7 */
    public final /* synthetic */ C22421c m32123k7() {
        return new ti20(new pcj() { // from class: l.y5b
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4879a.f20236P.auth().m209043q(C4879a.m32297e2(CoreModule.m30929H().userId())).m209028b();
            }
        }).map(new qcj() { // from class: l.z5b
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f203020a.m32115i7((Envelope) obj);
            }
        }).compose(psd0.m173592C()).map(new qcj() { // from class: l.a6b
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f68715a.m32119j7((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: k8 */
    public C22421c<uxj0> m32124k8(SettingGroups settingGroups) {
        return m32127l8(settingGroups, false);
    }

    /* JADX INFO: renamed from: l6 */
    public final int m32125l6() {
        return this.f20166k0;
    }

    /* JADX INFO: renamed from: l7 */
    public final /* synthetic */ uxj0 m32126l7(StringBuilder sb, long j, Envelope envelope) {
        ActionData actionData = ((CoreData) envelope.getModuleData(CoreData.class)).action;
        ArrayList arrayList = new ArrayList();
        tu2.m192703a("[See_Toast]", "net work back data done");
        if (NullChecker.m82486a(actionData)) {
            tu2.m192703a("[See_Toast]", "net work back data detail: " + sb.toString() + " , " + actionData.traceId);
            ActionPageFormat actionPageFormat = actionData.pageFormat;
            List<CardPattern> list = actionPageFormat.cardPatterns;
            List<UserAction> list2 = actionPageFormat.cardOptions;
            List<User> list3 = ((CommonData) envelope.getModuleData(CommonData.class)).users;
            List<CardExtraInfo> list4 = ((CoreData) envelope.getModuleData(CoreData.class)).cardExtraInfos;
            List<CardStyle> list5 = ((CoreData) envelope.getModuleData(CoreData.class)).cardStyles;
            List<CardStyle> list6 = ((CoreData) envelope.getModuleData(CoreData.class)).likedMes;
            List<CityCData> list7 = ((CoreData) envelope.getModuleData(CoreData.class)).cityCData;
            for (final CardPattern cardPattern : list) {
                User user = (User) jyb.m147529r(list3, new qcj() { // from class: l.d4b
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return Boolean.valueOf(((User) obj).f56859id.equals(cardPattern.userId));
                    }
                });
                UserAction userAction = (UserAction) jyb.m147529r(list2, new qcj() { // from class: l.e4b
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return Boolean.valueOf(((UserAction) obj).userId.equals(cardPattern.userId));
                    }
                });
                if (NullChecker.m82486a(user)) {
                    cardPattern.cover = user.m61308fp().profileMiddle().formatted();
                    if (NullChecker.m82486a(userAction)) {
                        cardPattern.cardOptions = userAction.options;
                    }
                    arrayList.add(cardPattern);
                }
            }
            for (final ActionInsertPosition actionInsertPosition : actionData.insertFormat.insertPosition) {
                CardExtraInfo cardExtraInfo = (CardExtraInfo) jyb.m147529r(list4, new qcj() { // from class: l.f4b
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return Boolean.valueOf(((CardExtraInfo) obj).userId.equals(actionInsertPosition.userId));
                    }
                });
                CardStyle cardStyle = (CardStyle) jyb.m147529r(list5, new qcj() { // from class: l.g4b
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return Boolean.valueOf(((CardStyle) obj).userId.equals(actionInsertPosition.userId));
                    }
                });
                CardStyle cardStyle2 = (CardStyle) jyb.m147529r(list6, new qcj() { // from class: l.h4b
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return Boolean.valueOf(((CardStyle) obj).userId.equals(actionInsertPosition.userId));
                    }
                });
                CityCData cityCData = (CityCData) jyb.m147529r(list7, new qcj() { // from class: l.i4b
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return Boolean.valueOf(((CityCData) obj).userId.equals(actionInsertPosition.userId));
                    }
                });
                if (NullChecker.m82486a(cardStyle)) {
                    actionInsertPosition.cardStyle = cardStyle;
                }
                if (NullChecker.m82486a(cardStyle2)) {
                    actionInsertPosition.likedMe = cardStyle2;
                }
                if (NullChecker.m82486a(cardExtraInfo)) {
                    actionInsertPosition.cardExtraInfo = cardExtraInfo;
                }
                actionInsertPosition.cityCData = cityCData;
            }
            if (NullChecker.m82486a(actionData.toastStyle) && !jyb.m147479J(list3)) {
                actionData.toastStyle.localReportId = list3.get(0).f56859id;
            }
            actionData.pageFormat.cardPatterns = arrayList;
            actionData.dataTime = j;
            this.f20139b0.onNext(actionData);
        }
        return uxj0.f181467a;
    }

    /* JADX INFO: renamed from: l8 */
    public C22421c<uxj0> m32127l8(SettingGroups settingGroups, final boolean z) {
        m31986C5();
        return CoreModule.f18264c.f20381e0.m116454D9(settingGroups).doOnNext(new y20() { // from class: l.f5b
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f97210a.m31984B7(z, (uxj0) obj);
            }
        }).doOnError(new y20() { // from class: l.q5b
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f155698a.m31988C7(z, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: renamed from: m6 */
    public int m32128m6() {
        return Integer.min(this.f20169l0, gta.m132210e().m132214d().mo34955y6());
    }

    /* JADX INFO: renamed from: m7 */
    public final /* synthetic */ C22421c m32129m7(final StringBuilder sb, final String str, final long j) {
        return new ti20(new pcj() { // from class: l.e3b
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4879a.f20236P.auth().m209043q(C4879a.m32203G(sb.toString())).m209038l(z1d0.create(Network.JSON, str)).m209028b();
            }
        }).doOnNext(new y20() { // from class: l.f3b
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f96978a.m32132n7((Envelope) obj);
            }
        }).compose(C4879a.m32255T2()).map(new qcj() { // from class: l.g3b
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f101972a.m32126l7(sb, j, (Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: m8 */
    public C22421c<uxj0> m32130m8() {
        return m32133n8(false);
    }

    /* JADX INFO: renamed from: n6 */
    public C22421c<uxj0> m32131n6() {
        C4880a0.m32390j().m32397l();
        return this.f91137Q.scheduled("get_see_special_card", 0, new pcj() { // from class: l.x4b
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f192360a.m32123k7();
            }
        });
    }

    /* JADX INFO: renamed from: n7 */
    public final /* synthetic */ void m32132n7(Envelope envelope) {
        this.f91137Q.m32497y3(envelope, null, true, false, true);
    }

    /* JADX INFO: renamed from: n8 */
    public final C22421c<uxj0> m32133n8(final boolean z) {
        gta.m132210e().m132214d().mo34676Dg("startPoll");
        this.f20073D2.onNext(uxj0.f181467a);
        if (z) {
            return m32078Z5(z);
        }
        CoreLikers.LikersTriggerBy likersTriggerBy = CoreLikers.LikersTriggerBy.home_new_liker_float;
        long jLongValue = this.f91137Q.f20429u0.f19998n0.get().longValue();
        if (gta.m132210e().m132214d().mo34834g8()) {
            likersTriggerBy = CoreLikers.LikersTriggerBy.home_total_liker_float;
        }
        final C22507a c22507aM222758b = C22507a.m222758b();
        this.f91137Q.f20429u0.m31441f7(jLongValue, likersTriggerBy, false).materialize().subscribe(psd0.m173596G(new y20() { // from class: l.c3b
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f79586a.m31992D7(z, c22507aM222758b, (Notification) obj);
            }
        }));
        return c22507aM222758b;
    }

    /* JADX INFO: renamed from: o6 */
    public int m32134o6() {
        if (m32003G6()) {
            return 0;
        }
        return this.f20136a0.m222761e().loaded.size();
    }

    /* JADX INFO: renamed from: o8 */
    public void m32136o8() {
        this.f20070C2 = true;
        m32022L5();
    }

    /* JADX INFO: renamed from: p6 */
    public final String m32137p6() {
        String strM32090c6 = m32090c6(m31978A5(m31982B5(m32094d6(C4879a.m32329m2(this.f20120U1)))));
        return (gta.m132210e().m132214d().mo34882lk() && CoreModule.f18264c.f20446z2.m31253r3()) ? C4879a.m32203G("/users?search=selected&mode=free_real_user") : strM32090c6;
    }

    /* JADX INFO: renamed from: p7 */
    public final /* synthetic */ void m32138p7(boolean[] zArr, Portrait portrait) {
        if (TextUtils.isEmpty(portrait.userId)) {
            return;
        }
        m31997E8(portrait.userId);
        zArr[0] = true;
    }

    /* JADX INFO: renamed from: p8 */
    public C22421c<uxj0> m32139p8(boolean z) {
        return (this.f20136a0.m222761e() == null || !z) ? just() : m32133n8(true);
    }

    /* JADX INFO: renamed from: q6 */
    public String m32140q6() {
        return (!NullChecker.m82486a(this.f20136a0.m222761e()) || jyb.m147479J(this.f20136a0.m222761e().loaded)) ? "" : this.f20136a0.m222761e().loaded.get(0).f20214id;
    }

    /* JADX INFO: renamed from: q7 */
    public final /* synthetic */ void m32141q7(final boolean[] zArr, SeePortrait seePortrait) {
        if (!jyb.m147479J(seePortrait.portraits)) {
            jyb.m147537z(seePortrait.portraits, new y20() { // from class: l.g2b
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f101817a.m32138p7(zArr, (Portrait) obj);
                }
            });
        }
        zArr[0] = zArr[0] && !seePortrait.reachedMaxNum;
    }

    /* JADX INFO: renamed from: q8 */
    public final void m32142q8(List<UserInfo> list, List<User> list2) {
        int iIndexOf;
        if (this.f20108Q1 || jyb.m147479J(list)) {
            return;
        }
        this.f20108Q1 = true;
        Counter counter = this.f91137Q.f20349T0;
        CounterLikeLimit counterLikeLimit = counter == null ? null : counter.likeLimit;
        if (counterLikeLimit == null || counterLikeLimit.remaining != 0 || counterLikeLimit.resetNowMillis() <= 0) {
            return;
        }
        String str = "";
        int i = 0;
        for (User user : list2) {
            int i2 = user.popLevel;
            if (i2 > i) {
                str = user.f56859id;
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
            if (!next.isVirtualCard() && next.f20214id.equals(str)) {
                iIndexOf = list.indexOf(next);
                break;
            }
        }
        if (iIndexOf != 0) {
            Collections.swap(list, 0, iIndexOf);
        }
    }

    /* JADX INFO: renamed from: r6 */
    public UserInfo m32143r6() {
        if (!NullChecker.m82486a(this.f20136a0.m222761e()) || jyb.m147479J(this.f20136a0.m222761e().loaded)) {
            return null;
        }
        return this.f20136a0.m222761e().loaded.get(0);
    }

    /* JADX INFO: renamed from: r7 */
    public final /* synthetic */ Boolean m32144r7(Envelope envelope) {
        List<SeePortrait> list = ((CoreData) envelope.getModuleData(CoreData.class)).seePortraits;
        final boolean[] zArr = {false};
        if (!jyb.m147479J(list)) {
            jyb.m147537z(list, new y20() { // from class: l.y1b
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f197087a.m32141q7(zArr, (SeePortrait) obj);
                }
            });
        }
        return Boolean.valueOf(zArr[0]);
    }

    /* JADX INFO: renamed from: r8 */
    public final User m32145r8() {
        return this.f20160i0;
    }

    /* JADX INFO: renamed from: s6 */
    public C22421c<uxj0> m32146s6(String str, String str2, String str3) {
        String str4;
        String strMo31684Dm;
        final long jGuessedCurrentServerTime = uqb0.f180376H.guessedCurrentServerTime();
        final StringBuilder sb = new StringBuilder();
        if (TextUtils.isEmpty(str2)) {
            sb.append(String.format("/cards?mode=%s", str));
            str4 = "users/suggested/passive/insert";
        } else {
            if (jGuessedCurrentServerTime - this.f20091J2 < f20061N2) {
                return C22421c.just(uxj0.f181467a);
            }
            sb.append(String.format("/cards?mode=%s&type=%s", str, str2));
            this.f20091J2 = uqb0.f180376H.guessedCurrentServerTime();
            str4 = "users/suggested/active/insert";
        }
        Act actM204489d = w20.m204489d();
        if (actM204489d != null || this.f20094K2) {
            strMo31684Dm = CoreModule.m30930K().isMainPage(actM204489d) ? CoreModule.m30930K().mo31684Dm() : "other";
        } else {
            this.f20094K2 = true;
            strMo31684Dm = "cold";
        }
        sb.append(String.format("&tab=%s", strMo31684Dm));
        if (str3 == null) {
            str3 = "";
        }
        final String str5 = str3;
        return this.f91137Q.scheduled(str4, 0, new pcj() { // from class: l.r2b
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f160924a.m32129m7(sb, str5, jGuessedCurrentServerTime);
            }
        });
    }

    /* JADX INFO: renamed from: s7 */
    public final /* synthetic */ C22421c m32147s7(final int i, final UserInfo userInfo) {
        return C22421c.fromCallable(new Callable() { // from class: l.x3b
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f192240a.m32150t7(i, userInfo);
            }
        }).compose(C4879a.m32255T2()).doOnNext(new y20() { // from class: l.z3b
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f202813a.m32152u7(i, userInfo, (uxj0) obj);
            }
        });
    }

    /* JADX INFO: renamed from: s8 */
    public final UserInfo m32148s8() {
        return this.f20163j0;
    }

    /* JADX INFO: renamed from: t6 */
    public void m32149t6(final UserInfo userInfo, final int i, final boolean z) {
        l51.m152887G(new Runnable() { // from class: l.b2b
            @Override // java.lang.Runnable
            public final void run() {
                this.f74595a.m32135o7(userInfo, i, z);
            }
        });
    }

    /* JADX INFO: renamed from: t7 */
    public final /* synthetic */ uxj0 m32150t7(int i, UserInfo userInfo) throws Exception {
        User userM116506Q9;
        if (!userInfo.isVirtualCard() && (userM116506Q9 = this.f91137Q.f20381e0.m116506Q9(userInfo.f20214id)) != null && userM116506Q9.hasPic()) {
            Picture.ImageUri imageUriMo34785Xf = gta.m132210e().m132214d().mo34785Xf(userM116506Q9.media(0));
            if (i == 0) {
                uqb0.f180374G.m127157u0(imageUriMo34785Xf);
            } else {
                uqb0.f180374G.m127162z0(imageUriMo34785Xf);
            }
        }
        return uxj0.f181467a;
    }

    /* JADX INFO: renamed from: u6, reason: merged with bridge method [inline-methods] */
    public final void m32135o7(UserInfo userInfo, int i, boolean z) {
        if (!NullChecker.m82486a(this.f20136a0.m222761e()) || jyb.m147479J(this.f20136a0.m222761e().loaded)) {
            return;
        }
        this.f20136a0.m222761e().setRefreshValue(true);
        List<UserInfo> list = this.f20136a0.m222761e().loaded;
        if (z && !jyb.m147479J(list)) {
            ListIterator<UserInfo> listIterator = list.listIterator();
            while (listIterator.hasNext()) {
                UserInfo next = listIterator.next();
                if (NullChecker.m82486a(next) && TextUtils.equals(next.f20214id, userInfo.f20214id) && userInfo.virtualCardType == next.virtualCardType) {
                    listIterator.remove();
                }
            }
        }
        if (i < 0 || i > list.size()) {
            this.f20136a0.m222761e().setRefreshValue(true);
            C22507a<PartialListOpt<UserInfo>> c22507a = this.f20136a0;
            c22507a.onNext(c22507a.m222761e().setReason(PartialListOpt.RefreshReason.INSERT_LOCAL_BREAK));
        } else {
            list.add(i, userInfo);
            this.f20136a0.m222761e().setRefreshValue(true);
            C22507a<PartialListOpt<UserInfo>> c22507a2 = this.f20136a0;
            c22507a2.onNext(c22507a2.m222761e().setReason(PartialListOpt.RefreshReason.INSERT_LOCAL_FINAL));
        }
    }

    /* JADX INFO: renamed from: u7 */
    public final /* synthetic */ void m32152u7(int i, UserInfo userInfo, uxj0 uxj0Var) {
        boolean z;
        this.f20157h0 = false;
        PartialListOpt<UserInfo> partialListOptM222761e = this.f20136a0.m222761e();
        List arrayList = partialListOptM222761e == null ? new ArrayList() : partialListOptM222761e.loaded;
        if (userInfo.isVirtualCard()) {
            z = false;
        } else {
            Iterator it = arrayList.iterator();
            z = false;
            while (it.hasNext()) {
                UserInfo userInfo2 = (UserInfo) it.next();
                if (NullChecker.m82486a(userInfo2) && userInfo2.f20214id.equals(userInfo.f20214id) && !m32108g8(userInfo, userInfo2)) {
                    it.remove();
                    z = true;
                }
            }
        }
        if (!userInfo.isVirtualCard()) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                if (TextUtils.equals(userInfo.f20214id, ((UserInfo) it2.next()).f20214id)) {
                    CrashHelper.m82479c(new Exception("repeat suggested card"));
                    if (z && gta.m132210e().m132214d().mo34765V6()) {
                        m32112h8("repeat suggested card");
                        return;
                    }
                    return;
                }
            }
        }
        if (gta.m132210e().m132214d().mo34765V6() && userInfo.isVirtualCard()) {
            VirtualCardType virtualCardType = userInfo.virtualCardType;
            VirtualCardType virtualCardType2 = VirtualCardType.OnlineMatchBroadcastCard;
            if (virtualCardType == virtualCardType2 && !jyb.m147479J(arrayList) && ((UserInfo) arrayList.get(0)).isVirtualCard() && ((UserInfo) arrayList.get(0)).virtualCardType == virtualCardType2) {
                if (z && gta.m132210e().m132214d().mo34765V6()) {
                    m32112h8("same quickChat Insert");
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
        this.f20130Y.add(userInfo.f20214id);
        if (CoreModule.m30933P().m143410g().mo36051b8()) {
            if (jyb.m147479J(this.f91137Q.f20383e2.f153006U)) {
                this.f91137Q.f20383e2.f153006U = new ArrayList();
            }
            if (userInfo.isPinLike) {
                UserWithRelationShip userWithRelationShipNew_ = UserWithRelationShip.new_();
                userWithRelationShipNew_.userId = userInfo.f20214id;
                userWithRelationShipNew_.relationship = userInfo.topLikeRelationship;
                this.f91137Q.f20383e2.f153006U.add(userWithRelationShipNew_);
            }
            pla plaVar = this.f91137Q.f20383e2;
            Collections.sort(plaVar.f153006U, plaVar.f153015d0);
            this.f91137Q.f20383e2.m172821u3();
        }
        DbLinks dbLinksNew_ = DbLinks.new_();
        dbLinksNew_.links.next = "";
        this.f20136a0.onNext(new PartialListOpt(arrayList, dbLinksNew_).setReason(PartialListOpt.RefreshReason.INSERT_USER_CARD));
    }

    /* JADX INFO: renamed from: u8 */
    public C22421c<uxj0> m32153u8(final User user, boolean z) {
        final String str = String.format("{\"status\":\"%s\",\"swipedTime\":\"%s\"}", z ? "liked" : RelationshipStatus.disliked, Converter.dateToApiTimeString(pzi0.m174454o()));
        return scheduled("reSwipe_" + user.f56859id, -1, new pcj() { // from class: l.t3b
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return qi20.m176658e(new pcj() { // from class: l.g1b
                    @Override // p153l.pcj, java.util.concurrent.Callable
                    public final Object call() {
                        return C4879a.f20236P.auth().m209043q(C4879a.m32214I2("/chat-relations/" + user.f56859id)).m209039m(z1d0.create(Network.JSON, str)).m209028b();
                    }
                }).map(new qcj() { // from class: l.h1b
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return uxj0.f181467a;
                    }
                }).observeOn(fo0.m126432a());
            }
        });
    }

    /* JADX INFO: renamed from: v6 */
    public C22421c<Boolean> m32154v6() {
        return this.f91137Q.scheduled("see-portraits-post", 0, new pcj() { // from class: l.l1b
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return qi20.m176654a(new pcj() { // from class: l.a2b
                    @Override // p153l.pcj, java.util.concurrent.Callable
                    public final Object call() {
                        return C4879a.f20236P.auth().m209043q(C4879a.m32216J0("/see-portraits")).m209038l(z1d0.create(Network.JSON, "")).m209028b();
                    }
                });
            }
        }).doOnError(new y20() { // from class: l.m1b
            @Override // p153l.y20
            public final void call(Object obj) {
                ((Throwable) obj).getMessage();
            }
        }).map(new qcj() { // from class: l.n1b
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f139734a.m32144r7((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: v7 */
    public final /* synthetic */ void m32155v7(Envelope envelope) {
        m32002G5(envelope);
        if (ConnectivityReceiver.m82469i()) {
            jyb.m147537z(jyb.m147474E(((CommonData) envelope.getModuleData(CommonData.class)).users), new y20() { // from class: l.m5b
                @Override // p153l.y20
                public final void call(Object obj) {
                    CoreSuggested.m31902a3((User) obj);
                }
            });
        }
        this.f91137Q.m32495w3(envelope, null);
    }

    /* JADX INFO: renamed from: v8 */
    public void m32156v8(MissMatch missMatch) {
        if (missMatch.version > this.f20098M0.get().intValue()) {
            this.f20098M0.put(Integer.valueOf(missMatch.version));
            this.f20107Q0.put(0);
            this.f20105P0.put(0L);
        }
    }

    /* JADX INFO: renamed from: w6 */
    public C22421c<uxj0> m32157w6(final UserInfo userInfo, final int i) {
        if (i == 0 && C4888e0.m32952a().m32957e()) {
            i = 1;
        }
        return this.f91137Q.scheduled("users/suggested/insert", 0, new pcj() { // from class: l.j3b
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f118170a.m32147s7(i, userInfo);
            }
        });
    }

    /* JADX INFO: renamed from: w7 */
    public final /* synthetic */ UserInfo m32158w7(Envelope envelope) {
        User user = !jyb.m147479J(((CommonData) envelope.getModuleData(CommonData.class)).users) ? ((CommonData) envelope.getModuleData(CommonData.class)).users.get(0) : null;
        Relationship relationship = !jyb.m147479J(((CoreData) envelope.getModuleData(CoreData.class)).relationships) ? ((CoreData) envelope.getModuleData(CoreData.class)).relationships.get(0) : null;
        HashMap<String, String> map = new HashMap<>();
        CoreModule.m30932N().mo61590zd(envelope, map);
        if ((relationship != null && TEnum.equals(relationship.state, "matched")) || user == null) {
            return null;
        }
        UserInfo userInfo = new UserInfo();
        String str = user.f56859id;
        userInfo.f20214id = str;
        userInfo.preSwipedDirection = SwipeDirection.LEFT;
        userInfo.hasMoment = map.containsKey(str);
        m32157w6(userInfo, 0);
        return userInfo;
    }

    /* JADX INFO: renamed from: w8 */
    public void m32159w8() {
        scheduled("refresh_swipe_pay_will", 0, new pcj() { // from class: l.f2b
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f96864a.m32000F7();
            }
        });
    }

    /* JADX INFO: renamed from: x5 */
    public final String m32160x5(String str) {
        return C4879a.m32365v2(nae0.m162085o(Uri.parse(str)).get(Oauth2AccessToken.KEY_UID) + "?search=like-relationship");
    }

    /* JADX INFO: renamed from: x6 */
    public final C22421c<UserInfo> m32161x6(C22421c<Envelope> c22421c) {
        return c22421c.doOnNext(new y20() { // from class: l.t4b
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f172060a.m32155v7((Envelope) obj);
            }
        }).compose(C4879a.m32255T2()).map(new qcj() { // from class: l.v4b
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f182344a.m32158w7((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: x7 */
    public final /* synthetic */ Notification m32162x7(boolean z, UserInfo userInfo, boolean z2, User user, Notification notification) {
        if (z || !userInfo.f20214id.equals(C4880a0.m32390j().f20267d.get())) {
            m32120j8(notification, z, z2, userInfo, user);
            return notification;
        }
        C4880a0.m32390j().f20267d.put("");
        return notification;
    }

    /* JADX INFO: renamed from: x8 */
    public C22421c<Boolean> m32163x8(String str) {
        return m32167y8(str, false);
    }

    /* JADX INFO: renamed from: y5 */
    public C22421c<Boolean> m32164y5(String str) {
        return m32167y8(str, true);
    }

    /* JADX INFO: renamed from: y6 */
    public boolean m32165y6(List<pf60<UserInfo, Integer>> list) {
        if (list == null) {
            return false;
        }
        PartialListOpt<UserInfo> partialListOptM222761e = this.f20136a0.m222761e();
        if (!NullChecker.m82486a(partialListOptM222761e)) {
            return false;
        }
        List<UserInfo> list2 = partialListOptM222761e.loaded;
        for (pf60<UserInfo, Integer> pf60Var : list) {
            if (pf60Var != null && pf60Var.f152156a != null) {
                if (!NullChecker.m82486a(pf60Var.f152157b) || pf60Var.f152157b.intValue() < 0 || list2.size() < pf60Var.f152157b.intValue()) {
                    list2.add(pf60Var.f152156a);
                } else {
                    list2.add(pf60Var.f152157b.intValue(), pf60Var.f152156a);
                }
                if (NullChecker.m82486a(pf60Var.f152156a)) {
                    this.f20130Y.add(pf60Var.f152156a.f20214id);
                }
            }
        }
        DbLinks dbLinksNew_ = DbLinks.new_();
        dbLinksNew_.links.next = "";
        this.f20136a0.onNext(new PartialListOpt(list2, dbLinksNew_).setReason(PartialListOpt.RefreshReason.INSERT_VIRTUAL_CARD));
        return true;
    }

    /* JADX INFO: renamed from: y7 */
    public final /* synthetic */ void m32166y7(boolean z, UserInfo userInfo, boolean z2, Relationship relationship, LikeExtraData likeExtraData, LikeFrom likeFrom, Relationship relationship2) {
        if (z && !TEnum.equals(relationship2.state, "matched")) {
            CrashHelper.m82479c(new Exception("Reply to the greeting of instant-chat, but no match, relationship id = " + relationship2.f39654id + ", user id = " + CoreModule.m30929H().userId()));
        }
        if (TEnum.equals(relationship2.state, "matched")) {
            CoreModule.f18264c.f20364Y0.f161175q = 0;
            this.f91137Q.f20429u0.m31383C7(userInfo.f20214id);
            if (gta.m132210e().m132214d().mo34758U9()) {
                this.f91137Q.f20386f2.m214434K3(userInfo.f20214id);
            }
            if (this.f91137Q.f20443y2.m216799E3()) {
                this.f91137Q.f20443y2.m216817W3(userInfo.f20214id);
            }
        } else if (gta.m132210e().m132214d().mo34758U9() && z2) {
            this.f91137Q.f20386f2.m214434K3(userInfo.f20214id);
        } else if (this.f91137Q.f20443y2.m216799E3() && z2) {
            this.f91137Q.f20443y2.m216817W3(userInfo.f20214id);
        }
        if (TEnum.equals(relationship2.state, "matched")) {
            C4880a0.m32390j().m32393g();
            String str = C4880a0.m32390j().f20267d.get();
            if (!str.isEmpty() && userInfo.f20214id.equals(C4880a0.m32390j().m32395i())) {
                m32013I8(jyb.m147507f0(str));
            }
            uqb0.m197269e1("home_user_matched", "user_id", CoreModule.m30929H().userId(), "other_user_id", userInfo.f20214id);
        }
        if (CoreModule.m30932N().mo61451Co()) {
            if (TEnum.equals(relationship.state, "matched")) {
                this.f91137Q.f20420r0.f20769h0.onNext(pf60.m172085a(userInfo.f20214id, relationship.state));
            } else {
                C4883c c4883c = this.f91137Q;
                if (z2) {
                    c4883c.f20420r0.f20769h0.onNext(pf60.m172085a(userInfo.f20214id, RelationshipStatus.get("superliked")));
                } else {
                    c4883c.f20420r0.f20769h0.onNext(pf60.m172085a(userInfo.f20214id, relationship.state));
                }
            }
        }
        if (TEnum.equals(relationship2.state, "matched") && likeExtraData != null && NullChecker.m82486a(likeExtraData.matchScData)) {
            q4f q4fVar = new q4f();
            q4fVar.f155581s = MatchScData.MID;
            q4fVar.f155566d = EventNameEnum.USER_BEHAVIOR_COMPLEMENT;
            MatchScData matchScData = likeExtraData.matchScData;
            q4fVar.f155576n = matchScData.pageId;
            i4g0.m138516n(q4fVar, matchScData.toTrackParamMap());
        }
        if (TEnum.equals(relationship2.state, "matched") && TEnum.equals(likeFrom, LikeFrom.fakeMatch) && !gta.m132210e().m132212b().mo34652wf() && !joa.m146392i4()) {
            CoreModule.m30933P().m143408e().mo35968Fb();
        }
        if (TEnum.equals(relationship2.state, "matched") && gta.m132210e().m132212b().mo34652wf() && TEnum.equals(likeFrom, LikeFrom.fakeMatch) && !joa.m146386f4()) {
            CoreModule.m30933P().m143408e().mo35975Qo();
        }
    }

    /* JADX INFO: renamed from: y8 */
    public final C22421c<Boolean> m32167y8(final String str, final boolean z) {
        return scheduled("reject_or_accept_fake_quick_chat", -1, new pcj() { // from class: l.k3b
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return qi20.m176658e(new pcj() { // from class: l.n5b
                    @Override // p153l.pcj, java.util.concurrent.Callable
                    public final Object call() {
                        return CoreSuggested.m31940m5(str, z);
                    }
                }).map(new qcj() { // from class: l.o5b
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return Boolean.valueOf(((Envelope) obj).meta.code == 200);
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: z5 */
    public void m32168z5(final boolean z) {
        l51.m152888H(CoreModule.f18263b, new Runnable() { // from class: l.d3b
            @Override // java.lang.Runnable
            public final void run() {
                this.f84881a.m32039P6(z);
            }
        }, 1000L);
    }

    /* JADX INFO: renamed from: z6 */
    public int m32169z6(String str) {
        if (NullChecker.m82486a(this.f20132Y1.get(str))) {
            return this.f20132Y1.get(str).intValue();
        }
        return -1;
    }

    /* JADX INFO: renamed from: z7 */
    public final /* synthetic */ C22421c m32170z7(final boolean z, final UserInfo userInfo, final Relationship relationship, Map map, Long l2, final boolean z2, final User user, final boolean z3, final LikeExtraData likeExtraData, final LikeFrom likeFrom) {
        C22421c<Envelope> c22421cM35908m3;
        if (z || !userInfo.f20214id.equals(C4880a0.m32390j().f20267d.get())) {
            c22421cM35908m3 = C4910y.m35908m3(userInfo.f20214id, relationship, map);
        } else {
            c22421cM35908m3 = C4910y.m35910o3(C4880a0.m32390j().f20267d.get());
            C4880a0.m32390j().f20268e.put(Boolean.FALSE);
            i4g0.m138520r("e_special_card_swiped_left", "p_suggest_users_home_view");
            C4880a0.m32390j().m32408w(userInfo.f20214id);
        }
        return c22421cM35908m3.compose(z7i0.m218893e(l2)).materialize().map(new qcj() { // from class: l.u3b
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f177323a.m32162x7(z, userInfo, z2, user, (Notification) obj);
            }
        }).dematerialize().take(1).compose(C4879a.m32255T2()).map(new qcj() { // from class: l.v3b
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return CoreSuggested.m31871K4((Envelope) obj);
            }
        }).doOnNext(new y20() { // from class: l.w3b
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f187119a.m32166y7(z3, userInfo, z2, relationship, likeExtraData, likeFrom, (Relationship) obj);
            }
        });
    }

    /* JADX INFO: renamed from: z8 */
    public void m32171z8(final String str) {
        if (NullChecker.m82486a(this.f20109R.m222761e()) && NullChecker.m82486a(this.f20109R.m222761e().f152157b) && NullChecker.m82486a(this.f20109R.m222761e().f152156a)) {
            jyb.m147505e0(this.f20109R.m222761e().f152157b, new qcj() { // from class: l.x5b
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(((DislikedUsers) obj).f21129id.equals(str));
                }
            });
        }
        this.f91137Q.f20430u1.m127303b3(str);
    }

    public static class UserInfo implements Parcelable, jk4 {
        public static final Parcelable.Creator<UserInfo> CREATOR = new C4873a();
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
        public String f20214id;
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
        public fr90 profileContext;
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
        public class C4873a implements Parcelable.Creator<UserInfo> {
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
            this.f20214id = parcel.readString();
            this.letter = parcel.readString();
            this.isUndo = parcel.readByte() != 0;
            this.canUndo = parcel.readByte() != 0;
            this.orderMsg = parcel.readString();
            this.cardId = parcel.readString();
            this.cardExtInfo = parcel.readString();
            this.renderFrom = CardInfoRenderFrom.valueOf(parcel.readString());
        }

        /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
        public UserInfo m225062clone() {
            UserInfo userInfo = new UserInfo();
            userInfo.f20214id = this.f20214id;
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
                userInfo.creditScore = creditScoreData.mo225055clone();
            }
            userInfo.from = this.from;
            UserActivityInfo userActivityInfo = this.userActivityInfo;
            if (userActivityInfo != null) {
                userInfo.userActivityInfo = userActivityInfo.mo225055clone();
            }
            return userInfo;
        }

        public void debugRecommendMessage() {
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // p153l.jk4
        public int getPreBackOperation() {
            SwipeDirection swipeDirection = this.preSwipedDirection;
            if (swipeDirection == null) {
                return -1;
            }
            int i = C4877d.f20218a[swipeDirection.ordinal()];
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
            return this.virtualCardType == VirtualCardType.OnlineMatchBroadcastCard && NullChecker.m82486a(this.quickChatCardWrapper) && this.quickChatCardWrapper.cardType == 1;
        }

        public boolean isLivingCard() {
            if (!NullChecker.m82486a(this.virtualCardType)) {
                return false;
            }
            VirtualCardType virtualCardType = this.virtualCardType;
            return virtualCardType == VirtualCardType.LiveLivingCard || virtualCardType == VirtualCardType.LiveVoiceCard;
        }

        public boolean isMomentInfoCard() {
            if (!NullChecker.m82486a(this.coreMomentInfo) || !NullChecker.m82486a(this.cardInfos) || TextUtils.isEmpty(this.cardInfos.momentId) || wj90.m206620c(CoreModule.f18264c.f20381e0.m116503Pa(this.f20214id))) {
                return false;
            }
            return gta.m132210e().m132214d().mo34936ui() || !jyb.m147479J(this.coreMomentInfo.media);
        }

        public boolean isNativeAdViewCard() {
            return this.virtualCardType == VirtualCardType.NativeAdViewCard;
        }

        public boolean isNewSpecialLike() {
            return false;
        }

        public boolean isOffsetUpRightBottom() {
            return (!CoreModule.f18264c.f20381e0.f89141U6.contains(this.f20214id) && this.isShowFakePhotoFeedback) || gta.m132210e().m132214d().mo34778Wc(this);
        }

        public boolean isOffsetUpRightBottomValue() {
            return (!CoreModule.f18264c.f20381e0.f89141U6.contains(this.f20214id) && this.isShowFakePhotoFeedback) || gta.m132210e().m132214d().mo34778Wc(this) || isShowCertificationGuidanceItem() || gta.m132210e().m132214d().mo34658Ae(this);
        }

        public boolean isOnlineMatchChatBoot() {
            return this.virtualCardType == VirtualCardType.OnlineMatchChatBootCard;
        }

        public boolean isPassiveQucikAudio() {
            return this.virtualCardType == VirtualCardType.QuickAudioBroadcastCard && NullChecker.m82486a(this.quickChatCardWrapper) && this.quickChatCardWrapper.cardType == 2;
        }

        public boolean isPassiveQuickChat() {
            VirtualCardType virtualCardType = this.virtualCardType;
            return (virtualCardType == VirtualCardType.OnlineMatchBroadcastCard || virtualCardType == VirtualCardType.QuickAudioBroadcastCard) && NullChecker.m82486a(this.quickChatCardWrapper) && this.quickChatCardWrapper.cardType == 2;
        }

        public boolean isQuickChatPartyInvitationCard() {
            VirtualCardType virtualCardType = this.virtualCardType;
            return virtualCardType == VirtualCardType.AudioQuickChatPartyInvitationCard || virtualCardType == VirtualCardType.TextQuickChatPartyInvitationCard;
        }

        public boolean isRepeatUser() {
            if (NullChecker.m82486a(this.ussTags)) {
                return this.ussTags.repeatedUser;
            }
            return false;
        }

        public boolean isShowCertificationGuidanceItem() {
            if (!isShowOnlyLookingAuthentication()) {
                return false;
            }
            if (gta.m132210e().m132214d().mo34712Je()) {
                return true;
            }
            CoreSuggested coreSuggested = CoreModule.f18264c.f20405m0;
            byd0 byd0Var = coreSuggested.f20093K1;
            wyd0 wyd0Var = coreSuggested.f20096L1;
            if (pzi0.m174438C(pzi0.m174454o(), byd0Var.get().longValue())) {
                return TextUtils.equals(wyd0Var.get(), this.f20214id);
            }
            byd0Var.put(Long.valueOf(pzi0.m174454o()));
            wyd0Var.put(this.f20214id);
            return true;
        }

        public boolean isShowOnlyLookingAuthentication() {
            User userM116503Pa = CoreModule.f18264c.f20381e0.m116503Pa(this.f20214id);
            if (userM116503Pa != null && NullChecker.m82486a(userM116503Pa.settings) && !jyb.m147479J(userM116503Pa.settings.settingGroups) && NullChecker.m82486a(userM116503Pa.settings.settingGroups.get(0).svipSearch) && userM116503Pa.settings.settingGroups.get(0).svipSearch.realUser && userM116503Pa.isPicVerificationVerified() && !CoreModule.f18264c.f20381e0.m116600p9().isPicVerificationVerified()) {
                StudentVerificationStatus studentVerificationStatus = StudentVerificationStatus.get("unknown_");
                VerificationCenter verificationCenterM32615k4 = CoreModule.f18264c.f20294B0.m32615k4();
                if (NullChecker.m82486a(verificationCenterM32615k4) && NullChecker.m82486a(verificationCenterM32615k4.picVerificationInfo)) {
                    studentVerificationStatus = CoreModule.f18264c.f20294B0.m32615k4().picVerificationInfo.status;
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
            return TextUtils.equals(this.f20214id, VIRTUAL_CARD);
        }

        @Override // p153l.jk4
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
            parcel.writeString(this.f20214id);
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
            this.checkPointTime = pzi0.m174454o();
        }
    }
}
