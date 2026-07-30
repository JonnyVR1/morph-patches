package com.p000p1.mobile.putong.core.api;

import android.app.Activity;
import android.graphics.BitmapFactory;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.LruCache;
import com.google.common.base.Optional;
import com.google.common.collect.Lists;
import com.google.gson.JsonObject;
import com.p000p1.mobile.putong.account.data.CameraSticker;
import com.p000p1.mobile.putong.api.api.Network;
import com.p000p1.mobile.putong.api.api.TantanException;
import com.p000p1.mobile.putong.app.PutongAct;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.api.C0154a;
import com.p000p1.mobile.putong.core.api.C0166g;
import com.p000p1.mobile.putong.core.api.RunnableC0159c0;
import com.p000p1.mobile.putong.core.api.inject.provider.CoreProviderInterface;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.App;
import com.p1.mobile.putong.core.data.AiPicture;
import com.p1.mobile.putong.core.data.AudioText;
import com.p1.mobile.putong.core.data.BreakIce;
import com.p1.mobile.putong.core.data.ChatAssistantQuestion;
import com.p1.mobile.putong.core.data.ChatGameInfo;
import com.p1.mobile.putong.core.data.ChatHeatActionData;
import com.p1.mobile.putong.core.data.ChatMM;
import com.p1.mobile.putong.core.data.ChatNewMatchEnvelope;
import com.p1.mobile.putong.core.data.ChatProfile;
import com.p1.mobile.putong.core.data.CipherId;
import com.p1.mobile.putong.core.data.Conversation;
import com.p1.mobile.putong.core.data.ConversationAdditional;
import com.p1.mobile.putong.core.data.ConversationAdditionalTag;
import com.p1.mobile.putong.core.data.ConversationBatchPatchIds;
import com.p1.mobile.putong.core.data.ConversationGame;
import com.p1.mobile.putong.core.data.ConversationIceBreaking;
import com.p1.mobile.putong.core.data.ConversationPatchRecord;
import com.p1.mobile.putong.core.data.ConversationPatchState;
import com.p1.mobile.putong.core.data.ConversationQuickChat;
import com.p1.mobile.putong.core.data.CoreData;
import com.p1.mobile.putong.core.data.CoreMomentInfo;
import com.p1.mobile.putong.core.data.CountdownItem;
import com.p1.mobile.putong.core.data.CounterVerification;
import com.p1.mobile.putong.core.data.ExchangePicture;
import com.p1.mobile.putong.core.data.ExposureNewMatch;
import com.p1.mobile.putong.core.data.FriendInfo;
import com.p1.mobile.putong.core.data.HarassAlertInfo;
import com.p1.mobile.putong.core.data.IceBreakingQuestion;
import com.p1.mobile.putong.core.data.InsertConversationUser;
import com.p1.mobile.putong.core.data.LimitTimePicture;
import com.p1.mobile.putong.core.data.LimitTimePictureStatus;
import com.p1.mobile.putong.core.data.LogoutCounterEnvelope;
import com.p1.mobile.putong.core.data.LogoutRecommendEnvelope;
import com.p1.mobile.putong.core.data.LogoutRecommendUser;
import com.p1.mobile.putong.core.data.Message;
import com.p1.mobile.putong.core.data.MessageAdditionalData;
import com.p1.mobile.putong.core.data.MessageChannel;
import com.p1.mobile.putong.core.data.MessageFeedbackStatus;
import com.p1.mobile.putong.core.data.MessageSetting;
import com.p1.mobile.putong.core.data.MessageType;
import com.p1.mobile.putong.core.data.NotificationStatus;
import com.p1.mobile.putong.core.data.OfficialAccount;
import com.p1.mobile.putong.core.data.OfficialAccountsMenu;
import com.p1.mobile.putong.core.data.OfficialAccountsSubMenu;
import com.p1.mobile.putong.core.data.OnlineLiveChatPair;
import com.p1.mobile.putong.core.data.Prologue;
import com.p1.mobile.putong.core.data.Questionnaire;
import com.p1.mobile.putong.core.data.ReadMessage;
import com.p1.mobile.putong.core.data.SogouGifEnvelope;
import com.p1.mobile.putong.core.data.SogouGifPicture;
import com.p1.mobile.putong.core.data.StickStatus;
import com.p1.mobile.putong.core.data.Sticker;
import com.p1.mobile.putong.core.data.StickerSource;
import com.p1.mobile.putong.core.data.Surveys;
import com.p1.mobile.putong.data.Audio;
import com.p1.mobile.putong.data.CommonData;
import com.p1.mobile.putong.data.ConversationCounter;
import com.p1.mobile.putong.data.ConversationStatus;
import com.p1.mobile.putong.data.Converter;
import com.p1.mobile.putong.data.CounterConversations;
import com.p1.mobile.putong.data.CounterMessages;
import com.p1.mobile.putong.data.Data;
import com.p1.mobile.putong.data.DbLinks;
import com.p1.mobile.putong.data.Dimension;
import com.p1.mobile.putong.data.Envelope;
import com.p1.mobile.putong.data.Links;
import com.p1.mobile.putong.data.Location;
import com.p1.mobile.putong.data.MatchFrom;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.MediaLocalStatus;
import com.p1.mobile.putong.data.Meta;
import com.p1.mobile.putong.data.PartialIdList;
import com.p1.mobile.putong.data.Picture;
import com.p1.mobile.putong.data.ProfileCompletion;
import com.p1.mobile.putong.data.PushMessageCustom;
import com.p1.mobile.putong.data.Relationship;
import com.p1.mobile.putong.data.RelationshipStatus;
import com.p1.mobile.putong.data.Report;
import com.p1.mobile.putong.data.SettingGroups;
import com.p1.mobile.putong.data.UnreadDetail;
import com.p1.mobile.putong.data.UploadSource;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.UserLiveLabel;
import com.p1.mobile.putong.data.Video;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.p1.mobile.putong.data.tenum.TEnumColumn;
import com.p1.mobile.putong.remote_config.RemoteConfig;
import com.p1.mobile.putong.ui.share.ShareHelper;
import com.p1.mobile.putong.util.TrackMediaUploadUtil;
import com.tantan.core.base.R;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.data.ProtobufAdapter;
import com.tantanapp.common.data.orm.BooleanColumn;
import com.tantanapp.common.data.orm.DoubleColumn;
import com.tantanapp.common.data.orm.Filter;
import com.tantanapp.common.data.orm.IntegerColumn;
import com.tantanapp.common.data.orm.OrderedColumn;
import com.tantanapp.common.data.orm.StringColumn;
import com.tantanapp.common.network.ApiExcep;
import com.tantanapp.common.utils.ConnectivityReceiver;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import com.tantanapp.foxstatistics.entity.EventNameEnum;
import com.tencent.mm.opensdk.modelbase.BaseReq;
import com.tencent.mm.opensdk.modelmsg.SendMessageToWX;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.mm.opensdk.modelmsg.WXWebpageObject;
import com.tencent.mm.opensdk.openapi.IWXAPI;
import com.tencent.mm.opensdk.openapi.WXAPIFactory;
import java.io.File;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Random;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Consumer;
import l.adk0;
import l.bud0;
import l.c4g0;
import l.cm10;
import l.d30;
import l.du2;
import l.e30;
import l.e51;
import l.f8c;
import l.fgf0;
import l.ggi;
import l.hmb;
import l.hpd0;
import l.hyx;
import l.j760;
import l.jo0;
import l.juk;
import l.jx50;
import l.k9j;
import l.kc30;
import l.knb0;
import l.kpd0;
import l.l3f;
import l.lsi0;
import l.lz4;
import l.mcr;
import l.mkd0;
import l.mqi0;
import l.n11;
import l.ogw;
import l.orh0;
import l.osi0;
import l.pgm;
import l.pxz;
import l.q860;
import l.qjd0;
import l.qqi0;
import l.qtm;
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
import l.wf6;
import l.x9j;
import l.xaj0;
import l.y9j;
import l.zpd0;
import l.zvf0;
import org.jetbrains.annotations.TestOnly;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p006l.ax6;
import p006l.ia20;
import p006l.jl6;
import p006l.ka20;
import p006l.la20;
import p006l.lsx;
import p006l.na8;
import p006l.oa8;
import p006l.qib0;
import p006l.qnd;
import p006l.t38;
import p006l.ura;
import p006l.vx6;
import p006l.wxz;
import p006l.xh5;
import rx.schedulers.Schedulers;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.api.g */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class C0166g extends ax6 {

    /* JADX INFO: renamed from: R2 */
    public static final LinkedHashMap<String, UserLiveLabel> f3818R2 = new LinkedHashMap<>();

    /* JADX INFO: renamed from: S2 */
    public static String f3819S2 = "message";

    /* JADX INFO: renamed from: T2 */
    public static hpd0 f3820T2 = new hpd0("has_in_feed_interaction_" + CoreModule.m1850H().userId(), Boolean.TRUE);

    /* JADX INFO: renamed from: U2 */
    public static int f3821U2 = 1;

    /* JADX INFO: renamed from: V2 */
    public static int f3822V2 = 2;

    /* JADX INFO: renamed from: W2 */
    public static int f3823W2 = 3;

    /* JADX INFO: renamed from: X2 */
    public static int f3824X2 = 4;

    /* JADX INFO: renamed from: Y2 */
    public static String f3825Y2;

    /* JADX INFO: renamed from: Z2 */
    public static final String f3826Z2;

    /* JADX INFO: renamed from: a3 */
    public static int f3827a3;

    /* JADX INFO: renamed from: b3 */
    public static bud0 f3828b3;

    /* JADX INFO: renamed from: c3 */
    public static final Filter<Conversation> f3829c3;

    /* JADX INFO: renamed from: A0 */
    public rx.subjects.a<Boolean> f3830A0;

    /* JADX INFO: renamed from: A1 */
    public hpd0 f3831A1;

    /* JADX INFO: renamed from: A2 */
    public c4g0 f3832A2;

    /* JADX INFO: renamed from: B0 */
    public rx.subjects.a<ChatProfile> f3833B0;

    /* JADX INFO: renamed from: B1 */
    public hpd0 f3834B1;

    /* JADX INFO: renamed from: B2 */
    public rx.subjects.a<LinkedHashMap<String, UserLiveLabel>> f3835B2;

    /* JADX INFO: renamed from: C0 */
    public rx.subjects.a<List<IceBreakingQuestion>> f3836C0;

    /* JADX INFO: renamed from: C1 */
    public zpd0 f3837C1;

    /* JADX INFO: renamed from: C2 */
    public rx.subjects.a<LinkedHashMap<String, UserLiveLabel>> f3838C2;

    /* JADX INFO: renamed from: D0 */
    public final rx.subjects.a<j760<List<Conversation>, Integer>> f3839D0;

    /* JADX INFO: renamed from: D1 */
    public tpd0 f3840D1;

    /* JADX INFO: renamed from: D2 */
    public long f3841D2;

    /* JADX INFO: renamed from: E0 */
    public uqd0 f3842E0;

    /* JADX INFO: renamed from: E1 */
    public tpd0 f3843E1;

    /* JADX INFO: renamed from: E2 */
    public LruCache<String, CoreMomentInfo> f3844E2;

    /* JADX INFO: renamed from: F0 */
    public rx.subjects.a<Boolean> f3845F0;

    /* JADX INFO: renamed from: F1 */
    public final hpd0 f3846F1;

    /* JADX INFO: renamed from: F2 */
    public HashSet<String> f3847F2;

    /* JADX INFO: renamed from: G0 */
    public hpd0 f3848G0;

    /* JADX INFO: renamed from: G1 */
    public hpd0 f3849G1;

    /* JADX INFO: renamed from: G2 */
    public HashSet<String> f3850G2;

    /* JADX INFO: renamed from: H0 */
    public zpd0 f3851H0;

    /* JADX INFO: renamed from: H1 */
    public tpd0 f3852H1;

    /* JADX INFO: renamed from: H2 */
    public rx.subjects.a<roj0> f3853H2;

    /* JADX INFO: renamed from: I0 */
    public zpd0 f3854I0;

    /* JADX INFO: renamed from: I1 */
    public zpd0 f3855I1;

    /* JADX INFO: renamed from: I2 */
    public rx.subjects.a<Integer> f3856I2;

    /* JADX INFO: renamed from: J0 */
    public uqd0 f3857J0;

    /* JADX INFO: renamed from: J1 */
    public tpd0 f3858J1;

    /* JADX INFO: renamed from: J2 */
    public rx.subjects.a<List<Conversation>> f3859J2;

    /* JADX INFO: renamed from: K0 */
    public hpd0 f3860K0;

    /* JADX INFO: renamed from: K1 */
    public zpd0 f3861K1;

    /* JADX INFO: renamed from: K2 */
    public rx.subjects.a<List<Conversation>> f3862K2;

    /* JADX INFO: renamed from: L0 */
    public tpd0 f3863L0;

    /* JADX INFO: renamed from: L1 */
    public tpd0 f3864L1;

    /* JADX INFO: renamed from: L2 */
    public rx.subjects.b<String> f3865L2;

    /* JADX INFO: renamed from: M0 */
    public zpd0 f3866M0;

    /* JADX INFO: renamed from: M1 */
    public zpd0 f3867M1;

    /* JADX INFO: renamed from: M2 */
    public d f3868M2;

    /* JADX INFO: renamed from: N0 */
    public tpd0 f3869N0;

    /* JADX INFO: renamed from: N1 */
    public tpd0 f3870N1;

    /* JADX INFO: renamed from: N2 */
    public Map<String, Message> f3871N2;

    /* JADX INFO: renamed from: O0 */
    public zpd0 f3872O0;

    /* JADX INFO: renamed from: O1 */
    public zpd0 f3873O1;

    /* JADX INFO: renamed from: O2 */
    public rx.subjects.a<roj0> f3874O2;

    /* JADX INFO: renamed from: P0 */
    public tpd0 f3875P0;

    /* JADX INFO: renamed from: P1 */
    public String f3876P1;

    /* JADX INFO: renamed from: P2 */
    public boolean f3877P2;

    /* JADX INFO: renamed from: Q0 */
    public boolean f3878Q0;

    /* JADX INFO: renamed from: Q1 */
    public boolean f3879Q1;

    /* JADX INFO: renamed from: Q2 */
    public boolean f3880Q2;

    /* JADX INFO: renamed from: R */
    public jx50 f3881R;

    /* JADX INFO: renamed from: R0 */
    public uqd0 f3882R0;

    /* JADX INFO: renamed from: R1 */
    public c4g0 f3883R1;

    /* JADX INFO: renamed from: S */
    public kc30 f3884S;

    /* JADX INFO: renamed from: S0 */
    public uqd0 f3885S0;

    /* JADX INFO: renamed from: S1 */
    public rx.subjects.a<User> f3886S1;

    /* JADX INFO: renamed from: T */
    public Boolean f3887T;

    /* JADX INFO: renamed from: T0 */
    public uqd0 f3888T0;

    /* JADX INFO: renamed from: T1 */
    public rx.subjects.b<roj0> f3889T1;

    /* JADX INFO: renamed from: U */
    public StringBuilder f3890U;

    /* JADX INFO: renamed from: U0 */
    public uqd0 f3891U0;

    /* JADX INFO: renamed from: U1 */
    public rx.subjects.a<roj0> f3892U1;

    /* JADX INFO: renamed from: V */
    public long f3893V;

    /* JADX INFO: renamed from: V0 */
    public uqd0 f3894V0;

    /* JADX INFO: renamed from: V1 */
    public rx.subjects.b<roj0> f3895V1;

    /* JADX INFO: renamed from: W */
    public rx.subjects.b<Throwable> f3896W;

    /* JADX INFO: renamed from: W0 */
    public hpd0 f3897W0;

    /* JADX INFO: renamed from: W1 */
    public rx.subjects.b<roj0> f3898W1;

    /* JADX INFO: renamed from: X */
    public rx.subjects.b<Message> f3899X;

    /* JADX INFO: renamed from: X0 */
    public hpd0 f3900X0;

    /* JADX INFO: renamed from: X1 */
    public rx.subjects.a<q860<Conversation>> f3901X1;

    /* JADX INFO: renamed from: Y */
    public rx.subjects.b<Message> f3902Y;

    /* JADX INFO: renamed from: Y0 */
    public hpd0 f3903Y0;

    /* JADX INFO: renamed from: Y1 */
    public boolean f3904Y1;

    /* JADX INFO: renamed from: Z */
    public rx.subjects.a<String> f3905Z;

    /* JADX INFO: renamed from: Z0 */
    public hpd0 f3906Z0;

    /* JADX INFO: renamed from: Z1 */
    public boolean f3907Z1;

    /* JADX INFO: renamed from: a0 */
    public double f3908a0;

    /* JADX INFO: renamed from: a1 */
    public uqd0 f3909a1;

    /* JADX INFO: renamed from: a2 */
    public String f3910a2;

    /* JADX INFO: renamed from: b0 */
    public rx.subjects.b<Message> f3911b0;

    /* JADX INFO: renamed from: b1 */
    public uqd0 f3912b1;

    /* JADX INFO: renamed from: b2 */
    public rx.subjects.b<Boolean> f3913b2;

    /* JADX INFO: renamed from: c0 */
    public rx.subjects.b<Message> f3914c0;

    /* JADX INFO: renamed from: c1 */
    public uqd0 f3915c1;

    /* JADX INFO: renamed from: c2 */
    public rx.subjects.a<j760<String, String>> f3916c2;

    /* JADX INFO: renamed from: d0 */
    public rx.subjects.b<roj0> f3917d0;

    /* JADX INFO: renamed from: d1 */
    public hpd0 f3918d1;

    /* JADX INFO: renamed from: d2 */
    public c4g0 f3919d2;

    /* JADX INFO: renamed from: e0 */
    public rx.subjects.b<roj0> f3920e0;

    /* JADX INFO: renamed from: e1 */
    public uqd0 f3921e1;

    /* JADX INFO: renamed from: e2 */
    public rx.subjects.b<String> f3922e2;

    /* JADX INFO: renamed from: f0 */
    public rx.subjects.a<Boolean> f3923f0;

    /* JADX INFO: renamed from: f1 */
    public hpd0 f3924f1;

    /* JADX INFO: renamed from: f2 */
    public rx.subjects.b<String> f3925f2;

    /* JADX INFO: renamed from: g0 */
    public rx.subjects.b<roj0> f3926g0;

    /* JADX INFO: renamed from: g1 */
    public hpd0 f3927g1;

    /* JADX INFO: renamed from: g2 */
    public double f3928g2;

    /* JADX INFO: renamed from: h0 */
    public rx.subjects.a<xaj0<String, PushMessageCustom, Long>> f3929h0;

    /* JADX INFO: renamed from: h1 */
    public zpd0 f3930h1;

    /* JADX INFO: renamed from: h2 */
    public rx.subjects.b<knb0<String, Integer, Integer, Integer>> f3931h2;

    /* JADX INFO: renamed from: i0 */
    public long f3932i0;

    /* JADX INFO: renamed from: i1 */
    public tpd0 f3933i1;

    /* JADX INFO: renamed from: i2 */
    public uqd0 f3934i2;

    /* JADX INFO: renamed from: j0 */
    public zpd0 f3935j0;

    /* JADX INFO: renamed from: j1 */
    public zpd0 f3936j1;

    /* JADX INFO: renamed from: j2 */
    public volatile ChatGameInfo f3937j2;

    /* JADX INFO: renamed from: k0 */
    public long f3938k0;

    /* JADX INFO: renamed from: k1 */
    public uqd0 f3939k1;

    /* JADX INFO: renamed from: k2 */
    public final Set<String> f3940k2;

    /* JADX INFO: renamed from: l0 */
    public zpd0 f3941l0;

    /* JADX INFO: renamed from: l1 */
    public hpd0 f3942l1;

    /* JADX INFO: renamed from: l2 */
    public String f3943l2;

    /* JADX INFO: renamed from: m0 */
    public final tpd0 f3944m0;

    /* JADX INFO: renamed from: m1 */
    public kpd0 f3945m1;

    /* JADX INFO: renamed from: m2 */
    public Set<String> f3946m2;

    /* JADX INFO: renamed from: n0 */
    public zpd0 f3947n0;

    /* JADX INFO: renamed from: n1 */
    public hpd0 f3948n1;

    /* JADX INFO: renamed from: n2 */
    public volatile List<String> f3949n2;

    /* JADX INFO: renamed from: o0 */
    public hpd0 f3950o0;

    /* JADX INFO: renamed from: o1 */
    public hpd0 f3951o1;

    /* JADX INFO: renamed from: o2 */
    public volatile List<Message> f3952o2;

    /* JADX INFO: renamed from: p0 */
    public hpd0 f3953p0;

    /* JADX INFO: renamed from: p1 */
    public hpd0 f3954p1;

    /* JADX INFO: renamed from: p2 */
    public rx.subjects.a<roj0> f3955p2;

    /* JADX INFO: renamed from: q0 */
    public hpd0 f3956q0;

    /* JADX INFO: renamed from: q1 */
    public hpd0 f3957q1;

    /* JADX INFO: renamed from: q2 */
    public rx.subjects.a<j760<Integer, Integer>> f3958q2;

    /* JADX INFO: renamed from: r0 */
    public hpd0 f3959r0;

    /* JADX INFO: renamed from: r1 */
    public zpd0 f3960r1;

    /* JADX INFO: renamed from: r2 */
    public rx.subjects.a<Boolean> f3961r2;

    /* JADX INFO: renamed from: s0 */
    public hpd0 f3962s0;

    /* JADX INFO: renamed from: s1 */
    public zpd0 f3963s1;

    /* JADX INFO: renamed from: s2 */
    public volatile int f3964s2;

    /* JADX INFO: renamed from: t0 */
    public tpd0 f3965t0;

    /* JADX INFO: renamed from: t1 */
    public zpd0 f3966t1;

    /* JADX INFO: renamed from: t2 */
    public rx.subjects.a<xaj0<Integer, Integer, Integer>> f3967t2;

    /* JADX INFO: renamed from: u0 */
    public zpd0 f3968u0;

    /* JADX INFO: renamed from: u1 */
    public tpd0 f3969u1;

    /* JADX INFO: renamed from: u2 */
    public tpd0 f3970u2;

    /* JADX INFO: renamed from: v0 */
    public hpd0 f3971v0;

    /* JADX INFO: renamed from: v1 */
    public hpd0 f3972v1;

    /* JADX INFO: renamed from: v2 */
    public zpd0 f3973v2;

    /* JADX INFO: renamed from: w0 */
    public hpd0 f3974w0;

    /* JADX INFO: renamed from: w1 */
    public zpd0 f3975w1;

    /* JADX INFO: renamed from: w2 */
    public rx.subjects.a<ConversationCounter> f3976w2;

    /* JADX INFO: renamed from: x0 */
    public boolean f3977x0;

    /* JADX INFO: renamed from: x1 */
    public hpd0 f3978x1;

    /* JADX INFO: renamed from: x2 */
    public boolean f3979x2;

    /* JADX INFO: renamed from: y0 */
    public hpd0 f3980y0;

    /* JADX INFO: renamed from: y1 */
    public hpd0 f3981y1;

    /* JADX INFO: renamed from: y2 */
    public boolean f3982y2;

    /* JADX INFO: renamed from: z0 */
    public tpd0 f3983z0;

    /* JADX INFO: renamed from: z1 */
    public hpd0 f3984z1;

    /* JADX INFO: renamed from: z2 */
    public rx.subjects.a<Double> f3985z2;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.api.g$a */
    public class a implements Consumer<String> {
        public a() {
        }

        @Override // java.util.function.Consumer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(String str) {
            C0166g.this.m4558Ef(str);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.api.g$b */
    public class b implements d30 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ double f3987a;

        public b(double d) {
            this.f3987a = d;
        }

        public void call() {
            if (this.f3987a == -1.0d) {
                CoreModule.f1542k.f11205m.delete("fake_conversation_local_team_group_conversation");
                return;
            }
            Conversation conversationQuery = CoreModule.f1542k.f11205m.query("fake_conversation_local_team_group_conversation");
            if (conversationQuery == null) {
                conversationQuery = Conversation.new_();
                ((DbObject) conversationQuery).id = "fake_conversation_local_team_group_conversation";
                double d = this.f3987a;
                conversationQuery.createdTime = d;
                conversationQuery.latestTime = d;
                conversationQuery.convType = CameraSticker.CATEGORY_DEFAULT_FILTER;
                conversationQuery.localEverHasMessage = true;
                conversationQuery.unreadMessages = 0;
            } else {
                double d2 = conversationQuery.latestTime;
                double d3 = this.f3987a;
                if (d2 != d3) {
                    conversationQuery.latestTime = d3;
                }
            }
            CoreModule.f1534c.f3631f0.m4980mq(conversationQuery);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.api.g$c */
    public class c implements d30 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ double f3989a;

        public c(double d) {
            this.f3989a = d;
        }

        /* JADX WARN: Code duplicated, block: B:14:0x0043  */
        /* JADX WARN: Code duplicated, block: B:16:? A[RETURN, SYNTHETIC] */
        public void call() {
            if (this.f3989a == -1.0d) {
                CoreModule.f1542k.f11205m.delete("fake_conversation_local_limited_trial_see_fold");
                return;
            }
            Conversation conversationQuery = CoreModule.f1542k.f11205m.query("fake_conversation_local_limited_trial_see_fold");
            boolean z = false;
            if (conversationQuery != null) {
                double d = conversationQuery.latestTime;
                double d2 = this.f3989a;
                if (d != d2) {
                    conversationQuery.latestTime = d2;
                }
                if (z) {
                    CoreModule.f1534c.f3631f0.m4980mq(conversationQuery);
                }
            }
            conversationQuery = Conversation.new_();
            ((DbObject) conversationQuery).id = "fake_conversation_local_limited_trial_see_fold";
            double d3 = this.f3989a;
            conversationQuery.createdTime = d3;
            conversationQuery.latestTime = d3;
            conversationQuery.convType = CameraSticker.CATEGORY_DEFAULT_FILTER;
            conversationQuery.localEverHasMessage = true;
            conversationQuery.unreadMessages = 0;
            z = true;
            if (z) {
                CoreModule.f1534c.f3631f0.m4980mq(conversationQuery);
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.api.g$d */
    public static class d extends fgf0<List<OfficialAccount>> {
        public d() {
            super("OfficialAccountsApi", new ggi(new qnd("officialAccounts", "2", qib0.f19804b0.f17706a.userId()), 7, ProtobufAdapter.ARRAY_ADAPTER(OfficialAccount.PROTOBUF_ADAPTER)), new v9j() { // from class: l.xb8
                public final Object call() {
                    return new la20(new v9j() { // from class: l.yb8
                        public final Object call() {
                            return C0154a.f3483P.auth().q(C0154a.m3130G("/official-accounts?with=menus")).f().b();
                        }
                    }).map(new w9j() { // from class: l.zb8
                        public final Object call(Object obj) {
                            return C0166g.d.m5151D((Envelope) obj);
                        }
                    });
                }
            });
        }

        /* JADX INFO: renamed from: D */
        public static /* synthetic */ List m5151D(Envelope envelope) {
            if (NullChecker.a(envelope.getModuleData(CoreData.class).officialAccounts) && NullChecker.a(envelope.getModuleData(CoreData.class).menus)) {
                for (OfficialAccount officialAccount : envelope.getModuleData(CoreData.class).officialAccounts) {
                    for (final String str : officialAccount.menuIds) {
                        OfficialAccountsMenu officialAccountsMenu = (OfficialAccountsMenu) vwb.r(envelope.getModuleData(CoreData.class).menus, new w9j() { // from class: l.ac8
                            public final Object call(Object obj) {
                                return Boolean.valueOf(str.equals(((OfficialAccountsMenu) obj).id));
                            }
                        });
                        if (NullChecker.a(officialAccountsMenu)) {
                            if (officialAccount.localMenus == null) {
                                officialAccount.localMenus = new ArrayList();
                            }
                            officialAccount.localMenus.add(officialAccountsMenu);
                            if (NullChecker.a(officialAccountsMenu.children)) {
                                for (final String str2 : officialAccountsMenu.children) {
                                    OfficialAccountsMenu officialAccountsMenu2 = (OfficialAccountsMenu) vwb.r(envelope.getModuleData(CoreData.class).menus, new w9j() { // from class: l.bc8
                                        public final Object call(Object obj) {
                                            return Boolean.valueOf(str2.equals(((OfficialAccountsMenu) obj).id));
                                        }
                                    });
                                    if (NullChecker.a(officialAccountsMenu2)) {
                                        OfficialAccountsSubMenu officialAccountsSubMenu = new OfficialAccountsSubMenu();
                                        officialAccountsSubMenu.id = officialAccountsMenu2.id;
                                        officialAccountsSubMenu.text = officialAccountsMenu2.text;
                                        officialAccountsSubMenu.action = officialAccountsMenu2.action;
                                        officialAccountsSubMenu.needTracking = officialAccountsMenu2.needTracking;
                                        if (officialAccountsMenu.localMenus == null) {
                                            officialAccountsMenu.localMenus = new ArrayList();
                                        }
                                        officialAccountsMenu.localMenus.add(officialAccountsSubMenu);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return envelope.getModuleData(CoreData.class).officialAccounts;
        }
    }

    static {
        f3826Z2 = juk.e() ? "https://m.staging2.p1staff.com/fep/tantan/frontend/tantan-frontend-app-pages-v2/src/pages/core/warming/index.html?speed=true&_bid=1003197&hideNavigationBar=1&hideNotch=1" : "https://m.tantanapp.com/fep/tantan/frontend/tantan-frontend-app-pages-v2/src/pages/core/warming/index.html?speed=true&_bid=1003197&hideNavigationBar=1&hideNotch=1";
        f3827a3 = 500;
        f3828b3 = Schedulers.from(Executors.newSingleThreadScheduledExecutor());
        Filter filterEQ = Conversation.CONVTYPE.EQ("swiper");
        Filter filterNOT_STARTS_WITH = Conversation.ID.NOT_STARTS_WITH("fake_conversation");
        TEnumColumn tEnumColumn = Conversation.STATUS;
        f3829c3 = Filter.AND(new Filter[]{filterEQ, filterNOT_STARTS_WITH, tEnumColumn.NEQ("dismissed"), tEnumColumn.NEQ("deleted"), tEnumColumn.NEQ("removed")});
    }

    public C0166g(C0158c c0158c) {
        super(c0158c);
        this.f3881R = new jx50();
        this.f3884S = new kc30();
        Boolean bool = Boolean.FALSE;
        this.f3887T = bool;
        this.f3890U = new StringBuilder("");
        this.f3893V = RemoteConfig.x().B("intl_text_buzz_auto_delete_interval", 86400L) * 1000;
        this.f3896W = rx.subjects.b.b();
        this.f3899X = rx.subjects.b.b();
        this.f3902Y = rx.subjects.b.b();
        this.f3905Z = rx.subjects.a.c("");
        this.f3908a0 = -1.0d;
        this.f3911b0 = rx.subjects.b.b();
        this.f3914c0 = rx.subjects.b.b();
        this.f3917d0 = rx.subjects.b.b();
        this.f3920e0 = rx.subjects.b.b();
        this.f3923f0 = rx.subjects.a.c(bool);
        this.f3926g0 = rx.subjects.b.b();
        this.f3929h0 = rx.subjects.a.c(new xaj0("impress_conv_state_default", (Object) null, -1L));
        this.f3932i0 = 0L;
        this.f3935j0 = new zpd0("fold_conversation_split_time_saved" + CoreModule.m1850H().userId(), 0L);
        this.f3938k0 = 0L;
        this.f3941l0 = new zpd0("weaken_conv_time_saved" + CoreModule.m1850H().userId(), 0L);
        this.f3944m0 = new tpd0("localConversationId" + CoreModule.m1850H().userId(), 0);
        this.f3947n0 = new zpd0("last_chat_button_safety_reminder_time_" + CoreModule.m1850H().userId(), 0L);
        this.f3950o0 = new hpd0("hide_chat_button_safety_reminder_" + CoreModule.m1850H().userId(), bool);
        this.f3953p0 = new hpd0("is_show_all_match_pop_window" + CoreModule.m1850H().userId(), bool);
        this.f3956q0 = null;
        this.f3959r0 = null;
        String str = "conv_cell_weaken_fun_warn" + CoreModule.m1850H().userId();
        Boolean bool2 = Boolean.TRUE;
        this.f3962s0 = new hpd0(str, bool2);
        this.f3965t0 = new tpd0("conv_weaken_show_count" + CoreModule.m1850H().userId(), 0);
        this.f3968u0 = new zpd0("conv_cell_weaken_fun_warn_close_time" + CoreModule.m1850H().userId(), 0L);
        this.f3971v0 = new hpd0("conv_cell_fold_switch_open" + CoreModule.m1850H().userId(), bool2);
        this.f3974w0 = new hpd0("conv_cell_fold_fun_open" + CoreModule.m1850H().userId(), bool);
        this.f3977x0 = true;
        this.f3980y0 = new hpd0("conv_cell_fold_fun_is_open_save" + CoreModule.m1850H().userId(), bool);
        this.f3983z0 = new tpd0("hideChatButtonSafetyReminderCount" + CoreModule.m1850H().userId(), 0);
        this.f3830A0 = rx.subjects.a.c(bool);
        this.f3833B0 = rx.subjects.a.b();
        this.f3836C0 = rx.subjects.a.b();
        this.f3839D0 = rx.subjects.a.c(j760.a((Object) null, 0));
        this.f3842E0 = new uqd0("message_new_match_op_back" + CoreModule.m1850H().userId(), "");
        this.f3845F0 = rx.subjects.a.b();
        this.f3848G0 = new hpd0("male_like_limit_is_req" + CoreModule.m1850H().userId(), bool);
        this.f3851H0 = new zpd0("male_like_limit_star_time_" + CoreModule.m1850H().userId(), 0L);
        this.f3854I0 = new zpd0("male_like_limit_end_time_" + CoreModule.m1850H().userId(), 0L);
        this.f3857J0 = new uqd0("male_like_limit_user_id_" + CoreModule.m1850H().userId(), "");
        this.f3860K0 = new hpd0("male_like_limit_hidden_" + CoreModule.m1850H().userId(), bool);
        this.f3863L0 = new tpd0("clean_unread_notification" + CoreModule.m1850H().userId(), -1);
        this.f3866M0 = new zpd0("last_show_ice_emoji_no_reply_time" + CoreModule.m1850H().userId(), 0L);
        this.f3869N0 = new tpd0("last_show_ice_emoji_noreply_show_count" + CoreModule.m1850H().userId(), 0);
        this.f3872O0 = new zpd0("last_show_ice_emoji_message_time_limit_time" + CoreModule.m1850H().userId(), 0L);
        this.f3875P0 = new tpd0("last_show_ice_emoji_message_time_count" + CoreModule.m1850H().userId(), 0);
        this.f3878Q0 = false;
        this.f3882R0 = new uqd0("special_guest_last_message" + CoreModule.m1850H().userId(), "Hi，我是探探特邀嘉宾，很开心遇见你！");
        this.f3885S0 = new uqd0("special_guest_avatar_url" + CoreModule.m1850H().userId(), "");
        this.f3888T0 = new uqd0("special_guest_avatar_name" + CoreModule.m1850H().userId(), "");
        this.f3891U0 = new uqd0("greet_accessory_Text" + CoreModule.m1850H().userId(), "叮咚！已经为你找到匹配度98.9%的人啦，点击卡片去打个招呼吧");
        this.f3894V0 = new uqd0("special_guest_h5_url" + CoreModule.m1850H().userId(), "");
        this.f3897W0 = new hpd0("special_guest_finish_info_fail" + CoreModule.m1850H().userId(), bool);
        this.f3900X0 = new hpd0("special_guest_end_word" + CoreModule.m1850H().userId(), bool);
        this.f3903Y0 = new hpd0("special_guest_fill_finished" + CoreModule.m1850H().userId(), bool);
        this.f3906Z0 = new hpd0("special_guest_show_red_dot" + CoreModule.m1850H().userId(), bool);
        this.f3909a1 = new uqd0("special_guest_user_info_name" + CoreModule.m1850H().userId(), "");
        this.f3912b1 = new uqd0("special_guest_user_info_avatar" + CoreModule.m1850H().userId(), "");
        this.f3915c1 = new uqd0("special_guest_user_info_age" + CoreModule.m1850H().userId(), "");
        this.f3918d1 = new hpd0("special_guest_user_hide_age" + CoreModule.m1850H().userId(), bool);
        this.f3921e1 = new uqd0("special_guest_user_info_uid" + CoreModule.m1850H().userId(), "");
        this.f3924f1 = new hpd0("countdown_like_open", bool);
        this.f3927g1 = new hpd0("warming_level_guide_show" + CoreModule.m1850H().userId(), bool);
        this.f3930h1 = new zpd0("last_pull_conversation_exposure_time_" + CoreModule.m1850H().userId(), 0L);
        this.f3933i1 = new tpd0("pull_conversation_exposure_counter" + CoreModule.m1850H().userId(), 0);
        this.f3936j1 = new zpd0("enter_address_book_matchp_agertimer" + CoreModule.m1850H().userId(), 0L);
        this.f3939k1 = new uqd0("land_priorities" + CoreModule.m1850H().userId(), f3819S2);
        this.f3942l1 = new hpd0("has_show_all_match_pop_window" + CoreModule.m1850H().userId(), bool);
        this.f3945m1 = new kpd0("enter_unread_new_match_timer" + CoreModule.m1850H().userId(), 0.0d);
        this.f3948n1 = new hpd0("red_dot_test_one_debug_open", bool);
        this.f3951o1 = new hpd0("red_dot_test_two_debug_open", bool);
        this.f3954p1 = new hpd0("cht_cell_active_debug_open", bool);
        this.f3957q1 = new hpd0("femaleHeartBeatShortPath", bool);
        this.f3960r1 = new zpd0("oof_enter_click_time" + CoreModule.m1850H().userId(), 0L);
        this.f3963s1 = new zpd0("last_show_oof_enter_time" + CoreModule.m1850H().userId(), 0L);
        this.f3966t1 = new zpd0("last_show_switch_pic_tip_time" + CoreModule.m1850H().userId(), 0L);
        this.f3969u1 = new tpd0("show_switch_pic_tip_counter" + CoreModule.m1850H().userId(), 0);
        this.f3972v1 = new hpd0("show_switch_pic_guide" + CoreModule.m1850H().userId(), bool);
        this.f3975w1 = new zpd0("friend_active_remind_female" + CoreModule.m1850H().userId(), 0L);
        this.f3978x1 = new hpd0("continuous_chat_sp_debug" + CoreModule.m1850H().userId(), bool);
        this.f3981y1 = new hpd0("new_user_show_guide_pop_sp" + CoreModule.m1850H().userId(), bool);
        this.f3984z1 = new hpd0("recommend_new_match_pop_sp" + CoreModule.m1850H().userId(), bool);
        this.f3831A1 = new hpd0("message_media_item_new_pic" + CoreModule.m1850H().userId(), bool);
        this.f3834B1 = new hpd0("message_media_item_swap_anwser" + CoreModule.m1850H().userId(), bool);
        this.f3837C1 = new zpd0("message_sensitive_tips_show_time" + CoreModule.m1850H().userId(), 0L);
        this.f3840D1 = new tpd0("message_sensitive_tips_show_num" + CoreModule.m1850H().userId(), 0);
        this.f3843E1 = new tpd0("associate_show_count_limit" + CoreModule.m1850H().userId(), 0);
        this.f3846F1 = new hpd0("limited_trial_see_fold_conversation_should_deleted_" + CoreModule.m1850H().userId(), bool2);
        this.f3849G1 = new hpd0("hasOpenedPrologueSettingPage" + CoreModule.m1850H().userId(), bool);
        this.f3852H1 = new tpd0("prologuesModuleViewCountToday" + CoreModule.m1850H().userId(), 0);
        this.f3855I1 = new zpd0("lastProloguesModuleViewTime" + CoreModule.m1850H().userId(), 0L);
        this.f3858J1 = new tpd0("prologuesModuleViewDayCount" + CoreModule.m1850H().userId(), 0);
        this.f3861K1 = new zpd0("lastProloguesCloseTime" + CoreModule.m1850H().userId(), 0L);
        this.f3864L1 = new tpd0("prologuesModuleViewCountTodayForNRP" + CoreModule.m1850H().userId(), 0);
        this.f3867M1 = new zpd0("lastProloguesModuleViewTimeForNRP" + CoreModule.m1850H().userId(), 0L);
        this.f3870N1 = new tpd0("prologuesModuleViewDayCountForNRP" + CoreModule.m1850H().userId(), 0);
        this.f3873O1 = new zpd0("lastProloguesCloseTimeForNRP" + CoreModule.m1850H().userId(), 0L);
        this.f3876P1 = null;
        this.f3879Q1 = false;
        this.f3883R1 = null;
        this.f3886S1 = rx.subjects.a.b();
        this.f3889T1 = rx.subjects.b.b();
        roj0 roj0Var = roj0.a;
        this.f3892U1 = rx.subjects.a.c(roj0Var);
        this.f3895V1 = rx.subjects.b.b();
        this.f3898W1 = rx.subjects.b.b();
        this.f3901X1 = rx.subjects.a.b();
        this.f3904Y1 = false;
        this.f3907Z1 = false;
        this.f3910a2 = "";
        this.f3913b2 = rx.subjects.b.b();
        this.f3916c2 = rx.subjects.a.b();
        this.f3922e2 = rx.subjects.b.b();
        this.f3925f2 = rx.subjects.b.b();
        this.f3928g2 = 0.0d;
        this.f3931h2 = rx.subjects.b.b();
        this.f3934i2 = new uqd0("chat_game_info" + CoreModule.m1850H().userId(), "");
        this.f3937j2 = null;
        this.f3940k2 = new HashSet();
        this.f3943l2 = "";
        this.f3946m2 = new HashSet();
        this.f3949n2 = new ArrayList();
        this.f3952o2 = new ArrayList();
        this.f3955p2 = rx.subjects.a.c(roj0Var);
        this.f3958q2 = rx.subjects.a.c(j760.a(0, 0));
        this.f3961r2 = rx.subjects.a.c(bool);
        this.f3964s2 = 0;
        this.f3967t2 = rx.subjects.a.c(new xaj0(0, 0, 0));
        this.f3970u2 = new tpd0("build_version_code", 0);
        this.f3973v2 = new zpd0("lastLoadTime_" + CoreModule.m1850H().userId(), 0L);
        this.f3976w2 = rx.subjects.a.b();
        rx.subjects.a<Double> aVarB = rx.subjects.a.b();
        this.f3985z2 = aVarB;
        this.f3832A2 = aVarB.throttleLast(1000L, TimeUnit.MILLISECONDS).onBackpressureLatest().observeOn(Schedulers.io()).map(new w9j() { // from class: l.ab8
            public final Object call(Object obj) {
                return this.f8189a.m4537Ck((Double) obj);
            }
        }).filter(new w9j() { // from class: l.lb8
            public final Object call(Object obj) {
                return Boolean.valueOf(((ConversationCounter) obj) != null);
            }
        }).map(new w9j() { // from class: l.wb8
            public final Object call(Object obj) {
                return C0166g.m4288ga((ConversationCounter) obj);
            }
        }).onBackpressureLatest().compose(mkd0.C()).subscribe(mkd0.G(new e30() { // from class: l.up7
            public final void call(Object obj) {
                this.f23692a.m4550Dk((ConversationCounter) obj);
            }
        }));
        this.f3835B2 = rx.subjects.a.c(new LinkedHashMap());
        this.f3838C2 = rx.subjects.a.c(new LinkedHashMap());
        this.f3841D2 = -1L;
        this.f3844E2 = new LruCache<>(100);
        this.f3847F2 = new HashSet<>();
        this.f3850G2 = new HashSet<>();
        this.f3853H2 = rx.subjects.a.c(roj0Var);
        this.f3856I2 = rx.subjects.a.c(0);
        this.f3859J2 = rx.subjects.a.c(new ArrayList());
        this.f3862K2 = rx.subjects.a.c(new ArrayList());
        this.f3865L2 = rx.subjects.b.b();
        this.f3868M2 = new d();
        this.f3871N2 = new HashMap();
        this.f3874O2 = rx.subjects.a.c(roj0Var);
        this.f3877P2 = false;
        this.f3880Q2 = false;
        if (((Boolean) this.f3974w0.get()).booleanValue()) {
            return;
        }
        this.f3974w0.put(bool2);
        this.f3977x0 = false;
    }

    /* JADX INFO: renamed from: A3 */
    public static /* synthetic */ stc0 m3922A3(String str) {
        stc0.a aVarAuth = C0154a.f3483P.auth();
        if (TextUtils.isEmpty(str)) {
            str = C0154a.m3285u();
        }
        return aVarAuth.q(str).f().b();
    }

    /* JADX INFO: renamed from: B7 */
    public static /* synthetic */ void m3937B7(String str) {
        Conversation conversationQuery = CoreModule.f1542k.f11205m.query(str);
        if (conversationQuery == null) {
            return;
        }
        List listQuery = CoreModule.f1542k.f11195c.query(Filter.AND(new Filter[]{Message.CID.EQ(str), Message.MESSAGETYPE.EQ("ai_chat_analysis_guide")}), ((OrderedColumn) Message.CREATEDTIME).ASC, 0);
        if (!vwb.J(listQuery)) {
            Iterator it = listQuery.iterator();
            while (it.hasNext()) {
                CoreModule.f1542k.f11195c.delete(((DbObject) ((Message) it.next())).id);
            }
        }
        CoreModule.f1542k.f11205m.upsert(conversationQuery);
    }

    /* JADX INFO: renamed from: Bb */
    public static /* synthetic */ void m3941Bb(roj0 roj0Var) {
    }

    /* JADX INFO: renamed from: Bd */
    public static /* synthetic */ void m3943Bd(Throwable th) {
    }

    /* JADX INFO: renamed from: C4 */
    public static /* synthetic */ Boolean m3945C4(Boolean bool) {
        if (bool.booleanValue()) {
            return Boolean.TRUE;
        }
        e51.G(new Runnable() { // from class: l.iq7
            @Override // java.lang.Runnable
            public final void run() {
                lsi0.y("该用户未开启分享功能");
            }
        });
        return Boolean.FALSE;
    }

    /* JADX INFO: renamed from: Cb */
    public static /* synthetic */ void m3952Cb(Message message, boolean z) {
        long j = ((DbObject) message)._id;
        if (j != 0) {
            Message messageQuery = CoreModule.f1542k.f11195c.query(j);
            messageQuery.localCreatedSession = -((Integer) App.i.get()).intValue();
            messageQuery.localNotificationStatus = NotificationStatus.get("pending");
            if (z) {
                messageQuery.localFailType = 4;
            } else {
                messageQuery.localFailType = 3;
            }
            CoreModule.f1542k.f11195c.updateBy_id(messageQuery);
        }
    }

    /* JADX INFO: renamed from: D6 */
    public static /* synthetic */ void m3958D6(Throwable th) {
    }

    /* JADX INFO: renamed from: Dd */
    public static /* synthetic */ void m3965Dd(Message message) {
        long j = ((DbObject) message)._id;
        if (j != 0) {
            CoreModule.f1542k.f11195c.delete(j);
        }
    }

    /* JADX INFO: renamed from: E3 */
    public static /* synthetic */ void m3966E3(String str) {
        DbLinks dbLinks = new DbLinks();
        ((DbObject) dbLinks).id = str;
        dbLinks.links = new Links();
        CoreModule.f1542k.f11196d.upsert(dbLinks);
    }

    /* JADX INFO: renamed from: E5 */
    public static /* synthetic */ Boolean m3968E5(Message message) {
        int i = message.localFailType;
        return Boolean.valueOf((i == 3 || i == 4) ? false : true);
    }

    /* JADX INFO: renamed from: E6 */
    public static /* synthetic */ stc0 m3969E6(Message message, String str, Message message2) {
        String strM3143J0;
        stc0.a aVarDebug_noAuth = C0154a.f3483P.debug_noAuth();
        if (message.moment != null) {
            strM3143J0 = C0154a.m3296w2("/" + CoreModule.m1850H().userId() + "/moments/" + message.moment + "/messages?user_id=" + str);
        } else {
            strM3143J0 = C0154a.m3143J0("/conversations/" + CoreModule.m1850H().userId() + "/messages?with=moments,questions&user_id=" + str);
        }
        return aVarDebug_noAuth.q(strM3143J0).l(utc0.create(Network.JSON, message2.toJson())).b();
    }

    /* JADX INFO: renamed from: E7 */
    public static /* synthetic */ Boolean m3970E7(Conversation conversation) {
        if (ura.m25555e().m25559d().m5613E()) {
            return Boolean.valueOf(TEnum.equals(conversation.status, CameraSticker.CATEGORY_DEFAULT_FILTER) && !ura.m25555e().m25559d().m5664Nd(conversation));
        }
        return Boolean.valueOf(TEnum.equals(conversation.status, CameraSticker.CATEGORY_DEFAULT_FILTER));
    }

    /* JADX INFO: renamed from: Ec */
    public static /* synthetic */ Sticker m3975Ec(List list, String str, SogouGifEnvelope sogouGifEnvelope) {
        String strZ = vwb.J(list) ? "" : rhi.z(((Media) list.get(0)).url);
        if (sogouGifEnvelope.data.media.isEmpty()) {
            rhi.m(strZ);
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < sogouGifEnvelope.data.media.size(); i++) {
            SogouGifPicture sogouGifPicture = (SogouGifPicture) sogouGifEnvelope.data.media.get(i);
            Picture pictureNew_ = Picture.new_();
            ((Media) pictureNew_).name = sogouGifPicture.name;
            ((Media) pictureNew_).url = sogouGifPicture.url;
            ((Media) pictureNew_).mediaType = ((Media) list.get(i)).mediaType;
            arrayList.add(pictureNew_);
        }
        Sticker stickerNew_ = Sticker.new_();
        stickerNew_.name = str;
        stickerNew_.source = StickerSource.get("sogou");
        stickerNew_.pictures = arrayList;
        String strD = ogw.d(new File(strZ));
        if (TextUtils.isEmpty(strD)) {
            stickerNew_.hash = "";
        } else {
            stickerNew_.hash = strD;
        }
        rhi.m(strZ);
        return stickerNew_;
    }

    /* JADX INFO: renamed from: F8 */
    public static /* synthetic */ j760 m3982F8(List list, List list2, Conversation conversation) {
        Message message;
        if (vwb.J(list) && vwb.J(list2)) {
            message = null;
        } else if (vwb.J(list)) {
            message = (Message) list2.get(0);
        } else if (vwb.J(list2)) {
            message = (Message) list.get(0);
        } else {
            message = (Message) list.get(0);
            Message message2 = (Message) list2.get(0);
            if (message.createdTime <= message2.createdTime) {
                message = message2;
            }
        }
        return j760.a(Integer.valueOf((conversation.mm * 100) / 10), message);
    }

    /* JADX INFO: renamed from: F9 */
    public static /* synthetic */ void m3983F9() {
        CoreModule.f1542k.f11205m.delete(Conversation.CONVTYPE.EQ(ura.m25555e().m25559d().m5709W7()));
        C0162e c0162e = CoreModule.f1534c.f3634g0;
        C0162e.f3757F0.put(Boolean.FALSE);
    }

    /* JADX INFO: renamed from: G4 */
    public static /* synthetic */ void m3989G4(Throwable th) {
    }

    /* JADX INFO: renamed from: G6 */
    public static /* synthetic */ void m3991G6(Throwable th) {
    }

    /* JADX INFO: renamed from: G7 */
    public static /* synthetic */ void m3992G7(String str, d30 d30Var) {
        CoreModule.f1542k.f11195c.delete(str);
        if (NullChecker.a(d30Var)) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: G9 */
    public static /* synthetic */ stc0 m3994G9(List list) {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONArray jSONArray = new JSONArray();
            if (NullChecker.a(list)) {
                if (list.size() > 1) {
                    Conversation conversation = (Conversation) list.get(0);
                    Conversation conversation2 = (Conversation) list.get(1);
                    if (NullChecker.a(conversation) && NullChecker.a(conversation2) && !TextUtils.isEmpty(conversation.otherUser) && !TextUtils.isEmpty(conversation2.otherUser)) {
                        jSONArray.put(0, conversation.otherUser);
                        jSONArray.put(1, conversation2.otherUser);
                    }
                } else if (list.size() == 1) {
                    Conversation conversation3 = (Conversation) list.get(0);
                    if (NullChecker.a(conversation3) && !TextUtils.isEmpty(conversation3.otherUser)) {
                        jSONArray.put(0, conversation3.otherUser);
                    }
                }
            }
            jSONObject.put("userIDs", jSONArray);
        } catch (Exception unused) {
        }
        return C0154a.f3483P.auth().q(C0154a.m3198Y("/persuade/users")).l(utc0.create(Network.JSON, jSONObject.toString())).b();
    }

    /* JADX INFO: renamed from: H9 */
    public static /* synthetic */ OnlineLiveChatPair m4005H9(Throwable th) {
        return null;
    }

    /* JADX INFO: renamed from: Ha */
    public static /* synthetic */ j760 m4006Ha(List list, List list2, Integer num) {
        return new j760(Integer.valueOf(Math.min(num.intValue(), 100)), Boolean.valueOf((list.size() == 0 && list2.size() == 0) ? false : true));
    }

    /* JADX INFO: renamed from: I5 */
    public static /* synthetic */ List m4012I5(LogoutRecommendEnvelope logoutRecommendEnvelope) {
        List list = logoutRecommendEnvelope.data.users;
        if (vwb.J(list)) {
            return null;
        }
        return list;
    }

    /* JADX INFO: renamed from: I8 */
    public static /* synthetic */ void m4015I8(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Conversation conversation = (Conversation) it.next();
            if (conversation.additional == null) {
                conversation.additional = ConversationAdditional.new_();
            }
            conversation.additional.newMatch = ExposureNewMatch.new_();
            conversation.additional.newMatch.labelExposureTime = mqi0.o();
            CoreModule.f1542k.f11205m.upsert(conversation);
        }
    }

    /* JADX INFO: renamed from: I9 */
    public static /* synthetic */ Boolean m4016I9(CipherId cipherId) {
        if (NullChecker.a(cipherId) && !TextUtils.isEmpty(cipherId.userId)) {
            return Boolean.TRUE;
        }
        e51.G(new Runnable() { // from class: l.ib8
            @Override // java.lang.Runnable
            public final void run() {
                lsi0.y("分享失败，稍后重试");
            }
        });
        return Boolean.FALSE;
    }

    /* JADX INFO: renamed from: Ia */
    public static /* synthetic */ rx.c m4017Ia(String str) {
        final JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("msgType", str);
        } catch (Exception unused) {
        }
        return ia20.m16568b(new v9j() { // from class: l.t88
            public final Object call() {
                return C0154a.f3483P.auth().q(C0154a.m3130G("/picture-verify/righted/reject")).l(utc0.create(Network.JSON, jSONObject.toString())).b();
            }
        }, 0);
    }

    /* JADX INFO: renamed from: J7 */
    public static /* synthetic */ stc0 m4025J7(boolean z, String str) {
        String string;
        try {
            JSONObject jSONObject = new JSONObject();
            if (z) {
                jSONObject.put("status", "invisible");
            } else {
                jSONObject.put("status", "hidden");
            }
            string = jSONObject.toString();
        } catch (JSONException unused) {
            string = "{}";
        }
        return C0154a.f3483P.auth().q(C0154a.m3184U0("/conversations/" + str)).k(utc0.create(Network.JSON, string)).b();
    }

    /* JADX INFO: renamed from: J8 */
    public static /* synthetic */ void m4026J8(Throwable th) {
        if (th.getMessage().contains("share limit run out")) {
            lsi0.y("您今日已达到分享用户次数的上线啦~明天再来吧");
        } else {
            lsi0.y("分享失败");
        }
    }

    /* JADX INFO: renamed from: Jd */
    public static /* synthetic */ void m4031Jd(ConversationPatchRecord conversationPatchRecord, Conversation conversation) {
        CoreModule.f1542k.f11204l.upsert(conversationPatchRecord);
        conversation.read = Boolean.TRUE;
        conversation.unreadMessages = 0;
        CoreModule.f1542k.f11205m.upsert(conversation);
    }

    /* JADX INFO: renamed from: K7 */
    public static /* synthetic */ List m4036K7(List list, Message message, List list2) {
        if (!vwb.J(list)) {
            for (int i = 0; i < list.size(); i++) {
                Media media = (Media) list.get(i);
                if (media instanceof Audio) {
                    rhi.m(rhi.z(media.url));
                } else if (media instanceof Video) {
                    k9j.G(k9j.c, ((DbObject) message).id);
                }
            }
        }
        return list2;
    }

    /* JADX INFO: renamed from: K8 */
    public static /* synthetic */ void m4037K8(List list) {
        if (vwb.J(list)) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Message messageQuery = CoreModule.f1542k.f11195c.query((String) it.next());
            if (TEnum.equals(messageQuery.messageType, "common_tip") && NullChecker.a(messageQuery.extData) && TextUtils.equals(messageQuery.extData.extra, "pat")) {
                messageQuery.extData.extra2 = "pat_grey";
                CoreModule.f1542k.f11195c.upsert(messageQuery);
            }
        }
    }

    /* JADX INFO: renamed from: Ka */
    public static /* synthetic */ JSONArray m4039Ka(List list) {
        try {
            JSONArray jSONArray = new JSONArray();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Message message = (Message) it.next();
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("id", ((DbObject) message).id);
                } catch (JSONException e) {
                    CrashHelper.c(e);
                }
                jSONArray.put(jSONObject);
            }
            return jSONArray;
        } catch (Exception e2) {
            CrashHelper.c(e2);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0075  */
    /* JADX INFO: renamed from: Kd */
    public static /* synthetic */ void m4042Kd(Message message, String str, String str2, long j, Envelope envelope) {
        String str3;
        if (!NullChecker.a(envelope)) {
            str3 = str;
        } else {
            if (vwb.J(envelope.getModuleData(CoreData.class).messages)) {
                CrashHelper.i(new Exception("return null messages"), "core_raw_message_post", CrashHelper.ReportLevel.p5, 100);
                return;
            }
            Message message2 = (Message) envelope.getModuleData(CoreData.class).messages.get(0);
            message2.fromConvType = message.fromConvType;
            if (message.moment == null || TEnum.equals(message.messageType, "moment_chat")) {
                str3 = str;
                pxz.g(message2, str2, "success", str3, 1, SystemClock.elapsedRealtime() - j);
            } else if (User.isMatched(CoreModule.f1534c.f3628e0.m21378M7(str))) {
                str3 = str;
                pxz.g(message2, str2, "success", str3, 1, SystemClock.elapsedRealtime() - j);
            } else {
                str3 = str;
            }
        }
        if (message.moment != null || User.isTeamAccount(str3)) {
            return;
        }
        qib0.m22159e1("message_sent", new Object[0]);
    }

    /* JADX INFO: renamed from: L7 */
    public static /* synthetic */ void m4047L7(ConversationPatchRecord conversationPatchRecord, String str) {
        int i = conversationPatchRecord.retryCount + 1;
        conversationPatchRecord.retryCount = i;
        if (i >= 3) {
            CoreModule.f1542k.f11204l.delete(str);
        } else {
            CoreModule.f1542k.f11204l.updateBy_id(conversationPatchRecord);
        }
    }

    /* JADX INFO: renamed from: L9 */
    public static /* synthetic */ void m4049L9(Throwable th) {
    }

    /* JADX INFO: renamed from: Ld */
    public static /* synthetic */ List m4053Ld(String str, Envelope envelope) {
        ChatProfile chatProfile;
        if (!vwb.J(envelope.getModuleData(CoreData.class).chatProfiles)) {
            Iterator it = envelope.getModuleData(CoreData.class).chatProfiles.iterator();
            do {
                if (!it.hasNext()) {
                    chatProfile = null;
                    break;
                }
                chatProfile = (ChatProfile) it.next();
            } while (!TextUtils.equals(chatProfile.userId, str));
        } else {
            chatProfile = null;
            break;
        }
        return NullChecker.a(chatProfile) ? chatProfile.iceBreakingQuestions : Collections.EMPTY_LIST;
    }

    /* JADX INFO: renamed from: M4 */
    public static /* synthetic */ Double m4055M4(Double d2, Envelope envelope) {
        return d2;
    }

    /* JADX INFO: renamed from: M7 */
    public static /* synthetic */ stc0 m4058M7(String str, boolean z) {
        stc0.a aVarQ = C0154a.f3483P.auth().q(C0154a.m3130G("/love_letter/reply"));
        hyx hyxVar = Network.JSON;
        StringBuilder sb = new StringBuilder("{\"id\":\"");
        sb.append(str);
        sb.append("\", \"state\":\"");
        sb.append(z ? "opened" : "replied");
        sb.append("\"}");
        return aVarQ.k(utc0.create(hyxVar, sb.toString())).b();
    }

    /* JADX INFO: renamed from: Mc */
    public static /* synthetic */ ConversationBatchPatchIds m4063Mc() {
        List<Conversation> listM4892fq = CoreModule.f1534c.f3631f0.m4892fq();
        ArrayList arrayList = new ArrayList();
        Iterator<Conversation> it = listM4892fq.iterator();
        while (it.hasNext()) {
            arrayList.add(((DbObject) it.next()).id);
        }
        ConversationBatchPatchIds conversationBatchPatchIdsNew_ = ConversationBatchPatchIds.new_();
        conversationBatchPatchIdsNew_.ids = arrayList;
        return conversationBatchPatchIdsNew_;
    }

    /* JADX INFO: renamed from: N4 */
    public static /* synthetic */ stc0 m4066N4(String str, String str2, boolean z) {
        JSONObject jSONObject = new JSONObject();
        try {
            if (!TextUtils.isEmpty(str)) {
                jSONObject.put("userId", str);
            }
            if (!TextUtils.isEmpty(str2)) {
                jSONObject.put("momentId", str2);
            }
            jSONObject.put("channel", z ? "wechattimeline" : "wechat");
        } catch (Exception unused) {
        }
        return C0154a.f3483P.auth().q(C0154a.m3198Y("/outside/userid")).l(utc0.create(Network.JSON, jSONObject.toString())).b();
    }

    /* JADX INFO: renamed from: N5 */
    public static /* synthetic */ Double m4067N5(Double d2, Message message) {
        return d2;
    }

    /* JADX INFO: renamed from: N6 */
    public static /* synthetic */ Message m4068N6(List list) {
        if (vwb.J(list)) {
            return null;
        }
        return (Message) list.get(0);
    }

    /* JADX INFO: renamed from: Na */
    public static /* synthetic */ void m4072Na(String str, double d2) {
        Conversation conversationQuery = CoreModule.f1542k.f11205m.query(str);
        if (NullChecker.a(conversationQuery)) {
            conversationQuery.localBotherCodeTime = d2;
            CoreModule.f1542k.f11205m.upsert(conversationQuery);
        }
    }

    /* JADX INFO: renamed from: Nc */
    public static /* synthetic */ void m4074Nc(Message message, boolean z) {
        Message messageClone = message.clone();
        HarassAlertInfo harassAlertInfoNew_ = messageClone.additionalData.harassAlertInfo;
        if (harassAlertInfoNew_ == null) {
            harassAlertInfoNew_ = HarassAlertInfo.new_();
        }
        harassAlertInfoNew_.status = z ? "reported" : "ignored";
        CoreModule.f1542k.f11195c.upsert(messageClone);
    }

    /* JADX INFO: renamed from: O7 */
    public static /* synthetic */ j760 m4080O7(String str) {
        List listJ = CoreModule.f1542k.f11195c.m26911l0(str).j();
        Message message = (listJ == null || listJ.isEmpty()) ? null : (Message) listJ.get(0);
        return vwb.Y(listJ == null ? null : (Message) vwb.r(listJ, new w9j() { // from class: l.h58
            public final Object call(Object obj) {
                return Boolean.valueOf(TEnum.equals(((Message) obj).status(), "normal"));
            }
        }), message != null ? Double.valueOf(message.createdTime) : null);
    }

    /* JADX INFO: renamed from: Oa */
    public static /* synthetic */ void m4083Oa(String str) {
        Message messageQuery = CoreModule.f1542k.f11195c.query(str);
        if (NullChecker.a(messageQuery)) {
            CoreModule.f1542k.f11195c.delete(((DbObject) messageQuery)._id);
        }
    }

    /* JADX INFO: renamed from: Pb */
    public static /* synthetic */ j760 m4095Pb(Boolean bool) {
        String strDateToApiTimeString;
        jl6 jl6Var = CoreModule.f1542k.f11205m;
        TEnumColumn tEnumColumn = Conversation.STATUS;
        int iCount = jl6Var.count(Filter.OR(new Filter[]{tEnumColumn.EQ(CameraSticker.CATEGORY_DEFAULT_FILTER), tEnumColumn.EQ("blocked")}), -1);
        DbLinks dbLinksQuery = qib0.f19813k0.f23550c.query("conversations");
        if (NullChecker.a(dbLinksQuery)) {
            strDateToApiTimeString = Uri.parse(C0154a.m3302y0(dbLinksQuery.links.previous)).getQueryParameter("since");
        } else {
            List listQuery = CoreModule.f1542k.f11205m.query(Filter.OR(new Filter[]{tEnumColumn.EQ(CameraSticker.CATEGORY_DEFAULT_FILTER), tEnumColumn.EQ("blocked")}), ((OrderedColumn) Conversation.UPDATEDTIME).DESC, 1);
            strDateToApiTimeString = !vwb.J(listQuery) ? Converter.dateToApiTimeString(((Conversation) listQuery.get(0)).updatedTime) : "";
        }
        final JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("total", iCount);
            jSONObject.put("statuses", new JSONArray(ConversationStatus.JSON_ADAPTER.ARRAY_ADAPTER().serialize(vwb.f0(new ConversationStatus[]{ConversationStatus.get(CameraSticker.CATEGORY_DEFAULT_FILTER), ConversationStatus.get("blocked")}))));
            jSONObject.put("latestUpdatedTime", strDateToApiTimeString);
        } catch (JSONException e) {
            CrashHelper.c(e);
        }
        Envelope envelope = (Envelope) ia20.m16567a(new v9j() { // from class: l.p18
            public final Object call() {
                return C0154a.f3483P.auth().q(C0154a.m3141I2("/counter-verifications")).l(utc0.create(Network.JSON, jSONObject.toString())).b();
            }
        }).toBlocking().c((Object) null);
        if (NullChecker.a(envelope)) {
            return j760.a(envelope.getModuleData(CoreData.class).counterVerification, strDateToApiTimeString);
        }
        return null;
    }

    /* JADX INFO: renamed from: R4 */
    public static /* synthetic */ j760 m4110R4(List list, List list2, Conversation conversation) {
        Message message;
        if (vwb.J(list) && vwb.J(list2)) {
            message = null;
        } else if (vwb.J(list)) {
            message = (Message) list2.get(list2.size() - 1);
        } else if (vwb.J(list2)) {
            message = (Message) list.get(list.size() - 1);
        } else {
            message = (Message) list.get(list.size() - 1);
            Message message2 = (Message) list2.get(list2.size() - 1);
            if (message.createdTime <= message2.createdTime) {
                message = message2;
            }
        }
        return j760.a(Integer.valueOf((conversation.mm * 100) / 20), message);
    }

    /* JADX INFO: renamed from: R7 */
    public static /* synthetic */ j760 m4113R7(List list, List list2, Integer num) {
        return new j760(Integer.valueOf(Math.min((int) ((num.intValue() / 20.0f) * 100.0f), 100)), Boolean.valueOf((list.size() == 0 && list2.size() == 0) ? false : true));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x000e  */
    /* JADX INFO: renamed from: R9 */
    public static /* synthetic */ Boolean m4115R9(List list) {
        boolean z;
        if (!list.isEmpty()) {
            z = list.size() == 1;
        }
        return Boolean.valueOf(z);
    }

    /* JADX INFO: renamed from: Ro */
    public static rx.c<Envelope> m4120Ro(final String str, final Message message) {
        final Message messageClone = message.clone();
        if (messageClone.moment != null) {
            messageClone.moment = null;
            if (!CoreModule.m1853N().bt() || (!TEnum.equals(messageClone.messageType, "sticker") && !TEnum.equals(messageClone.messageType, "picture"))) {
                messageClone.messageType = null;
            }
        }
        final String strC = pxz.c();
        final long jElapsedRealtime = SystemClock.elapsedRealtime();
        return new la20((v9j<stc0>) new v9j() { // from class: l.ew7
            public final Object call() {
                return C0166g.m4373o5(message, str, strC, messageClone);
            }
        }, (message.moment == null || TEnum.equals(message.messageType, "moment_chat")) ? C0154a.f3479L | C0154a.f3480M : C0154a.f3480M).doOnNext(new e30() { // from class: l.pw7
            public final void call(Object obj) {
                C0166g.m4042Kd(message, str, strC, jElapsedRealtime, (Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: S3 */
    public static /* synthetic */ void m4121S3(Envelope envelope) {
        DbLinks dbLinksNew_ = DbLinks.new_();
        ((DbObject) dbLinksNew_).id = "conversations_deleted";
        dbLinksNew_.links = envelope.pagination.links;
        qib0.f19813k0.f23550c.upsert(dbLinksNew_);
    }

    /* JADX INFO: renamed from: T6 */
    public static /* synthetic */ Conversation m4135T6(List list) {
        if (vwb.J(list)) {
            return null;
        }
        return (Conversation) list.get(0);
    }

    /* JADX INFO: renamed from: U6 */
    public static /* synthetic */ stc0 m4146U6(String str) {
        String string;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("status", "hidden");
            string = jSONObject.toString();
        } catch (JSONException unused) {
            string = "{}";
        }
        return C0154a.f3483P.auth().q(C0154a.m3184U0("/conversations/" + str)).k(utc0.create(Network.JSON, string)).b();
    }

    /* JADX INFO: renamed from: V8 */
    public static /* synthetic */ void m4159V8() {
        CoreModule.f1542k.f11205m.delete(Conversation.CONVTYPE.EQ("feedinteraction"));
        C0166g c0166g = CoreModule.f1534c.f3631f0;
        f3820T2.put(Boolean.FALSE);
    }

    /* JADX INFO: renamed from: W5 */
    public static /* synthetic */ JSONObject m4167W5(String str, List list, Message message) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("localId", str);
        jSONObject.put("toUserIds", new JSONArray((Collection) list));
        jSONObject.put("message", new JSONObject(message.toJson()));
        return jSONObject;
    }

    /* JADX INFO: renamed from: X4 */
    public static /* synthetic */ Message m4177X4(List list) {
        return (Message) list.get(0);
    }

    /* JADX INFO: renamed from: X8 */
    public static /* synthetic */ List m4181X8(Message message, List list, xaj0 xaj0Var) {
        if (((Boolean) xaj0Var.a).booleanValue()) {
            message.riskTags = (List) xaj0Var.b;
        }
        message.localExtraInfo = TextUtils.isEmpty((CharSequence) xaj0Var.c) ? "" : (String) xaj0Var.c;
        return list;
    }

    /* JADX INFO: renamed from: Xb */
    public static /* synthetic */ void m4184Xb(String str, double d2) {
        Conversation conversationQuery = CoreModule.f1542k.f11205m.query("fake_conversation_profile_featured");
        if (TextUtils.isEmpty(str) && conversationQuery == null) {
            return;
        }
        long jO = mqi0.o();
        if (conversationQuery == null) {
            conversationQuery = Conversation.new_();
            ((DbObject) conversationQuery).id = "fake_conversation_profile_featured";
            conversationQuery.createdTime = jO;
            conversationQuery.convType = CameraSticker.CATEGORY_DEFAULT_FILTER;
            conversationQuery.otherUser = str;
            conversationQuery.localEverHasMessage = true;
        } else if (NullChecker.a(str)) {
            conversationQuery.otherUser = str;
        }
        conversationQuery.latestTime = d2;
        CoreModule.f1534c.f3631f0.m4980mq(conversationQuery);
    }

    /* JADX INFO: renamed from: Y5 */
    public static /* synthetic */ void m4189Y5() {
        CoreModule.f1542k.f11205m.deleteAll();
        qib0.f19813k0.f23550c.delete("conversations");
        CoreModule.f1542k.f11196d.deleteAll();
    }

    /* JADX INFO: renamed from: Y6 */
    public static /* synthetic */ void m4190Y6(String str) {
        Conversation conversationQuery = CoreModule.f1542k.f11205m.query(str);
        if (conversationQuery == null || !TextUtils.equals(conversationQuery.convType, "intlSeeChatRequest")) {
            return;
        }
        CoreModule.f1542k.f11205m.delete(str);
    }

    /* JADX INFO: renamed from: Z7 */
    public static /* synthetic */ void m4202Z7(String str, double d2) {
        Conversation conversationQuery = CoreModule.f1542k.f11205m.query(str);
        if (NullChecker.a(conversationQuery)) {
            conversationQuery.localBotherWxTime = d2;
            CoreModule.f1542k.f11205m.upsert(conversationQuery);
        }
    }

    /* JADX INFO: renamed from: Z8 */
    public static /* synthetic */ j760 m4203Z8(List list, List list2, Conversation conversation) {
        Message message;
        int i = conversation.quickChatProgress;
        int i2 = conversation.additional.quickChat.progress;
        if (i <= i2) {
            i = i2;
        }
        if (vwb.J(list) && vwb.J(list2)) {
            message = null;
        } else if (vwb.J(list)) {
            message = (Message) list2.get(list2.size() - 1);
        } else if (vwb.J(list2)) {
            message = (Message) list.get(list.size() - 1);
        } else {
            message = (Message) list.get(list.size() - 1);
            Message message2 = (Message) list2.get(list2.size() - 1);
            if (message.createdTime <= message2.createdTime) {
                message = message2;
            }
        }
        return j760.a(Integer.valueOf(i), message);
    }

    /* JADX INFO: renamed from: Z9 */
    public static /* synthetic */ void m4204Z9(User user, Message message) {
        if (ura.m25555e().m25559d().m5745c() && user.onlineMatch() && user.onlineMatchLocked()) {
            message.localFailType = 2;
        }
    }

    /* JADX INFO: renamed from: Zb */
    public static /* synthetic */ void m4206Zb(List list, final User user) {
        FriendInfo friendInfo = (FriendInfo) vwb.r(list, new w9j() { // from class: l.a98
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((FriendInfo) obj).userId, ((DbObject) user).id));
            }
        });
        if (NullChecker.a(user) && NullChecker.a(friendInfo)) {
            Location location = user.location;
            location.updatedTime = Math.max(friendInfo.lastActivity, location.updatedTime);
        }
    }

    /* JADX INFO: renamed from: a7 */
    public static /* synthetic */ rx.c m4213a7(final Message message, final List list) {
        return (!vwb.J(list) && (list.get(0) instanceof Picture) && qib0.f19794R.m11716c()) ? qib0.f19794R.m11715b(Uri.parse(((Media) list.get(0)).url).getPath()).map(new w9j() { // from class: l.ow7
            public final Object call(Object obj) {
                return C0166g.m4181X8(message, list, (xaj0) obj);
            }
        }) : rx.c.just(list);
    }

    /* JADX INFO: renamed from: ae */
    public static /* synthetic */ stc0 m4220ae(String str, String str2, String str3, String str4) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("feedback_id", str);
            jSONObject.put("feedback_category", str2);
            jSONObject.put("answer", str3);
            jSONObject.put("message_id", str4);
        } catch (JSONException unused) {
        }
        return C0154a.f3483P.auth().q(C0154a.m3130G("/restapi/feedback/satisfaction")).l(utc0.create(Network.JSON, jSONObject.toString())).b();
    }

    /* JADX INFO: renamed from: ba */
    public static /* synthetic */ stc0 m4228ba(boolean z, Message message, String str) {
        String string;
        try {
            JSONObject jSONObject = new JSONObject();
            if (z) {
                jSONObject.put("status", "removed");
            } else {
                jSONObject.put("status", "hidden");
            }
            if (NullChecker.a(message)) {
                jSONObject.put("clearedUntil", ((DbObject) message).id);
            }
            string = jSONObject.toString();
        } catch (JSONException unused) {
            string = "{}";
        }
        return C0154a.f3483P.auth().q(C0154a.m3184U0("/conversations/" + str)).k(utc0.create(Network.JSON, string)).b();
    }

    /* JADX INFO: renamed from: c9 */
    public static /* synthetic */ roj0 m4239c9(Set set, Set set2, Throwable th) {
        set.removeAll(set2);
        return null;
    }

    /* JADX INFO: renamed from: cd */
    public static /* synthetic */ void m4243cd(Throwable th) {
    }

    /* JADX INFO: renamed from: e4 */
    public static /* synthetic */ void m4258e4(Conversation conversation, boolean z) {
        if (!TextUtils.isEmpty(conversation.localExtraInfo) || z) {
            try {
                JSONObject jSONObject = new JSONObject(!TextUtils.isEmpty(conversation.localExtraInfo) ? conversation.localExtraInfo : "{}");
                jSONObject.put("keep_message_history", z);
                conversation.localExtraInfo = jSONObject.toString();
                CoreModule.f1542k.f11205m.updateBy_id(conversation);
            } catch (JSONException unused) {
            }
        }
    }

    /* JADX INFO: renamed from: e6 */
    public static /* synthetic */ void m4260e6(String str, double d2) {
        Conversation conversationQuery = CoreModule.f1542k.f11205m.query(str);
        if (NullChecker.a(conversationQuery)) {
            conversationQuery.localBotheringTime = d2;
            CoreModule.f1542k.f11205m.upsert(conversationQuery);
        }
    }

    /* JADX INFO: renamed from: f9 */
    public static /* synthetic */ void m4275f9(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            CoreModule.f1542k.f11195c.delete(((DbObject) ((Message) it.next())).id);
        }
    }

    /* JADX INFO: renamed from: g6 */
    public static /* synthetic */ void m4284g6(Message message, boolean z) {
        long j = ((DbObject) message)._id;
        if (j != 0) {
            Message messageQuery = CoreModule.f1542k.f11195c.query(j);
            messageQuery.localCreatedSession = -((Integer) App.i.get()).intValue();
            messageQuery.localNotificationStatus = NotificationStatus.get("pending");
            if (!z) {
                messageQuery.localExtraInfo = "ms_vr_ct_tg";
            }
            CoreModule.f1542k.f11195c.updateBy_id(messageQuery);
        }
    }

    /* JADX INFO: renamed from: ga */
    public static /* synthetic */ ConversationCounter m4288ga(ConversationCounter conversationCounter) {
        return conversationCounter;
    }

    /* JADX INFO: renamed from: gb */
    public static /* synthetic */ void m4289gb(Throwable th) {
    }

    /* JADX INFO: renamed from: ge */
    public static /* synthetic */ Boolean m4292ge(String str) {
        List listJ = CoreModule.f1542k.f11195c.m26896W(str).j();
        for (int i = 0; i < listJ.size(); i++) {
            Message message = (Message) listJ.get(i);
            if (NullChecker.a(message) && !((DbObject) message).id.startsWith("fake_id_")) {
                return Boolean.TRUE;
            }
        }
        return Boolean.FALSE;
    }

    /* JADX INFO: renamed from: hc */
    public static /* synthetic */ void m4302hc(Message message, int i, e30 e30Var) {
        long j = ((DbObject) message)._id;
        if (j != 0) {
            Message messageQuery = CoreModule.f1542k.f11195c.query(j);
            if (NullChecker.a(messageQuery)) {
                messageQuery.localCreatedSession = -((Integer) App.i.get()).intValue();
                messageQuery.localNotificationStatus = NotificationStatus.get("pending");
                messageQuery.localFailType = i;
                if (NullChecker.a(e30Var)) {
                    e30Var.call(messageQuery);
                }
                CoreModule.f1542k.f11195c.updateBy_id(messageQuery);
            }
        }
    }

    /* JADX INFO: renamed from: i3 */
    public static /* synthetic */ Surveys m4305i3(Envelope envelope) {
        if (envelope == null || envelope.data == null || envelope.getModuleData(CoreData.class).surveys == null || envelope.getModuleData(CoreData.class).surveys.isEmpty()) {
            return null;
        }
        return (Surveys) envelope.getModuleData(CoreData.class).surveys.get(0);
    }

    /* JADX INFO: renamed from: i6 */
    public static /* synthetic */ ConversationBatchPatchIds m4308i6() {
        List<Conversation> listM4990nn = CoreModule.f1534c.f3631f0.m4990nn();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < listM4990nn.size() && arrayList.size() < 500; i++) {
            Conversation conversation = listM4990nn.get(i);
            if (conversation.unreadMessages > 0) {
                arrayList.add(((DbObject) conversation).id);
            }
        }
        ConversationBatchPatchIds conversationBatchPatchIdsNew_ = ConversationBatchPatchIds.new_();
        conversationBatchPatchIdsNew_.ids = arrayList;
        return conversationBatchPatchIdsNew_;
    }

    /* JADX INFO: renamed from: id */
    public static /* synthetic */ void m4315id(final String str) {
        if (CoreModule.f1542k.f11196d.query(str) == null) {
            f8c.o().B(new d30() { // from class: l.da8
                public final void call() {
                    C0166g.m3966E3(str);
                }
            });
        }
    }

    /* JADX INFO: renamed from: j6 */
    public static /* synthetic */ JSONObject m4319j6(List list) {
        try {
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Message message = (Message) it.next();
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put("id", ((DbObject) message).id);
                    jSONObject2.put("status", "deleted");
                } catch (JSONException e) {
                    CrashHelper.c(e);
                    e.printStackTrace();
                }
                jSONArray.put(jSONObject2);
            }
            jSONObject.put("messages", jSONArray);
            return jSONObject;
        } catch (Exception e2) {
            CrashHelper.c(e2);
            return null;
        }
    }

    /* JADX INFO: renamed from: jb */
    public static /* synthetic */ void m4324jb(Message message, AtomicBoolean atomicBoolean) {
        DbLinks dbLinksOj;
        if (((DbObject) message)._id != 0) {
            atomicBoolean.set(true);
            CoreModule.f1542k.f11195c.delete(((DbObject) message)._id);
        }
        if (message.moment == null || (dbLinksOj = CoreModule.m1853N().Oj(message.moment)) == null) {
            return;
        }
        dbLinksOj.total--;
        CoreModule.m1853N().f6(dbLinksOj);
    }

    /* JADX INFO: renamed from: k7 */
    public static /* synthetic */ void m4331k7(Throwable th) {
    }

    /* JADX INFO: renamed from: ka */
    public static /* synthetic */ List m4334ka(Envelope envelope) {
        return envelope.getModuleData(CoreData.class).liveLabels == null ? new ArrayList() : envelope.getModuleData(CoreData.class).liveLabels;
    }

    /* JADX INFO: renamed from: kc */
    public static /* synthetic */ void m4336kc(Throwable th) {
    }

    /* JADX INFO: renamed from: l4 */
    public static /* synthetic */ void m4339l4(Envelope envelope, List list) {
        List<ReadMessage> list2 = envelope.getModuleData(CoreData.class).readMessages;
        if (vwb.J(list2)) {
            return;
        }
        for (ReadMessage readMessage : list2) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Message message = (Message) it.next();
                if (readMessage.id.equals(((DbObject) message).id)) {
                    message.read = true;
                    CoreModule.f1542k.f11195c.update(vwb.f0(new j760[]{vwb.Y(Message.READ, Boolean.TRUE)}), Message.ID.EQ(((DbObject) message).id));
                }
            }
        }
    }

    /* JADX INFO: renamed from: l5 */
    public static /* synthetic */ void m4340l5(String str, double d2, int i) {
        Conversation conversationQuery = CoreModule.f1542k.f11205m.query(str);
        if (NullChecker.a(conversationQuery)) {
            conversationQuery.localBotheringTime = d2;
            conversationQuery.localBotherStatus = i;
            CoreModule.f1542k.f11205m.upsert(conversationQuery);
        }
    }

    /* JADX INFO: renamed from: l7 */
    public static /* synthetic */ void m4342l7(Throwable th) {
    }

    /* JADX INFO: renamed from: m9 */
    public static /* synthetic */ void m4355m9(String str) {
        Message messageQuery = CoreModule.f1542k.f11195c.query(str);
        messageQuery.audio().audioRead = true;
        CoreModule.f1542k.f11195c.upsert(messageQuery);
    }

    /* JADX INFO: renamed from: mc */
    public static /* synthetic */ roj0 m4358mc(Envelope envelope) {
        CoreModule.f1534c.m3422w3(envelope, null);
        return roj0.a;
    }

    /* JADX INFO: renamed from: md */
    public static /* synthetic */ void m4359md(Message message, String str, Envelope envelope) {
        JSONObject jSONObject;
        if (qib0.f19794R.m11716c() && !vwb.J(message.media) && (message.media.get(0) instanceof Picture)) {
            try {
                jSONObject = TextUtils.isEmpty(message.localExtraInfo) ? new JSONObject("{}") : new JSONObject(message.localExtraInfo);
            } catch (Exception unused) {
                jSONObject = null;
            }
            zvf0.B("e_abnormal_image", "", new j760[]{j760.a("to_uid", str), j760.a("abnormal_image_url", ((Media) message.media.get(0)).url), j760.a("predict_info", jSONObject)});
        }
    }

    /* JADX INFO: renamed from: n6 */
    public static /* synthetic */ Integer m4363n6(Conversation conversation) {
        int i = conversation.quickChatProgress;
        int i2 = conversation.additional.quickChat.progress;
        if (i <= i2) {
            i = i2;
        }
        return Integer.valueOf(i);
    }

    /* JADX INFO: renamed from: na */
    public static /* synthetic */ String m4367na(Message message, Envelope envelope) {
        if (envelope.meta.code != 0) {
            return "";
        }
        MessageFeedbackStatus messageFeedbackStatus = envelope.getModuleData(CoreData.class).msgData;
        CoreModule.f1534c.f3631f0.m4556Dq(messageFeedbackStatus, message);
        if (NullChecker.a(messageFeedbackStatus)) {
            return messageFeedbackStatus.question.answer;
        }
        return null;
    }

    /* JADX INFO: renamed from: o3 */
    public static /* synthetic */ void m4371o3() {
        CoreModule.f1542k.f11205m.deleteAll();
        qib0.f19813k0.f23550c.delete("conversations");
        CoreModule.f1542k.f11196d.deleteAll();
    }

    /* JADX INFO: renamed from: o5 */
    public static /* synthetic */ stc0 m4373o5(Message message, String str, String str2, Message message2) {
        if (message.moment == null || TEnum.equals(message.messageType, "moment_chat") || (TEnum.equals(message.messageType, "moment_comment") && NullChecker.a(message.api_only_reference) && TEnum.equals(message.api_only_reference.action, "comment"))) {
            return C0154a.f3483P.auth().q(C0154a.m3168Q0(str) + "&page_id=" + str2).l(utc0.create(Network.JSON, message2.toJson())).b();
        }
        stc0.a aVarAuth = C0154a.f3483P.auth();
        StringBuilder sb = new StringBuilder();
        sb.append(C0154a.m3188V0(str, message.moment, str2));
        sb.append("&source=");
        sb.append(message.getMomentShowFromType());
        sb.append(message.isFromKanKan ? "&page=kankan" : "");
        return aVarAuth.q(sb.toString()).l(utc0.create(Network.JSON, message2.toJson())).b();
    }

    /* JADX INFO: renamed from: o6 */
    public static /* synthetic */ Conversation m4374o6(boolean z, boolean z2) {
        Conversation conversation = new Conversation();
        ConversationAdditional conversationAdditional = new ConversationAdditional();
        conversation.additional = conversationAdditional;
        conversationAdditional.chatMM = new ChatMM();
        ChatMM chatMM = conversation.additional.chatMM;
        chatMM.sparkSwitch = z;
        chatMM.partnerSwitch = z2;
        return conversation;
    }

    /* JADX INFO: renamed from: o7 */
    public static /* synthetic */ void m4375o7(double d2) {
        Conversation conversationQuery = CoreModule.f1542k.f11205m.query("fake_conversation_surprise_gift_box");
        if (conversationQuery == null) {
            conversationQuery = Conversation.new_();
            ((DbObject) conversationQuery).id = "fake_conversation_surprise_gift_box";
            conversationQuery.createdTime = d2;
            conversationQuery.latestTime = d2;
            conversationQuery.convType = CameraSticker.CATEGORY_DEFAULT_FILTER;
            conversationQuery.localEverHasMessage = true;
            conversationQuery.level = 10;
        } else {
            conversationQuery.latestTime = d2;
        }
        CoreModule.f1534c.f3631f0.m4980mq(conversationQuery);
    }

    /* JADX INFO: renamed from: p3 */
    public static /* synthetic */ void m4382p3(String str) {
        Conversation conversationQuery = CoreModule.f1542k.f11205m.query(str);
        if (conversationQuery == null) {
            return;
        }
        List listQuery = CoreModule.f1542k.f11195c.query(Filter.AND(new Filter[]{Message.CID.EQ(str), Message.MESSAGETYPE.EQ("local_break_ice")}), ((OrderedColumn) Message.CREATEDTIME).ASC, 0);
        if (!vwb.J(listQuery)) {
            Iterator it = listQuery.iterator();
            while (it.hasNext()) {
                CoreModule.f1542k.f11195c.delete(((DbObject) ((Message) it.next())).id);
            }
        }
        conversationQuery.hasLocalBreakIce = false;
        CoreModule.f1542k.f11205m.upsert(conversationQuery);
    }

    /* JADX INFO: renamed from: p6 */
    public static /* synthetic */ void m4385p6(boolean z, NotificationStatus notificationStatus, NotificationStatus notificationStatus2, boolean z2) {
        if (z) {
            CoreModule.f1542k.f11205m.m17595k1(notificationStatus, notificationStatus2);
        }
        if (z2) {
            CoreModule.f1542k.f11195c.m26924y0(notificationStatus, notificationStatus2);
        }
    }

    /* JADX INFO: renamed from: p7 */
    public static /* synthetic */ Boolean m4386p7(Envelope envelope) {
        return !vwb.J(envelope.getModuleData(CoreData.class).settingGroups) ? Boolean.valueOf(((SettingGroups) envelope.getModuleData(CoreData.class).settingGroups.get(0)).share.userShare) : Boolean.FALSE;
    }

    /* JADX INFO: renamed from: pa */
    public static /* synthetic */ JSONObject m4389pa(List list) {
        try {
            JSONArray jSONArray = new JSONArray();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                jSONArray.put(new JSONObject(((IceBreakingQuestion) it.next()).toJson()));
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("iceBreakingQuestions", jSONArray);
            return jSONObject;
        } catch (Exception e) {
            CrashHelper.c(e);
            return null;
        }
    }

    /* JADX INFO: renamed from: pc */
    public static /* synthetic */ void m4391pc(String str) {
        Message messageQuery = CoreModule.f1542k.f11195c.query(str);
        if (NullChecker.a(messageQuery) && NullChecker.a(messageQuery.additionalData) && NullChecker.a(messageQuery.additionalData.exchangePicture) && !TextUtils.equals(messageQuery.additionalData.exchangePicture.status, ExchangePicture.finished)) {
            MessageAdditionalData messageAdditionalDataClone = messageQuery.additionalData.clone();
            if (messageAdditionalDataClone.exchangePicture == null) {
                messageAdditionalDataClone.exchangePicture = ExchangePicture.new_();
            }
            messageAdditionalDataClone.exchangePicture.status = ExchangePicture.finished;
            messageQuery.additionalData = messageAdditionalDataClone;
            CoreModule.f1542k.f11195c.upsert(messageQuery);
        }
    }

    /* JADX INFO: renamed from: qc */
    public static /* synthetic */ void m4402qc(Conversation conversation, List list, Message message) {
        if (((DbObject) conversation).id.equals(message.cid)) {
            list.add(message);
        }
    }

    /* JADX INFO: renamed from: r3 */
    public static /* synthetic */ void m4404r3() {
    }

    /* JADX INFO: renamed from: s8 */
    public static /* synthetic */ void m4420s8(Sticker sticker, Sticker sticker2, Message message) {
        CoreModule.f1542k.f11199g.delete(((DbObject) sticker).id);
        CoreModule.f1542k.f11199g.insert(sticker2);
        CoreModule.f1542k.f11195c.updateBy_id(message);
    }

    /* JADX INFO: renamed from: ta */
    public static /* synthetic */ List m4433ta(Message message) {
        if (NullChecker.a(message)) {
            return message.media;
        }
        return null;
    }

    /* JADX INFO: renamed from: u8 */
    public static /* synthetic */ void m4442u8(Throwable th) {
    }

    /* JADX INFO: renamed from: v3 */
    public static /* synthetic */ AudioText m4448v3(Envelope envelope) {
        List list = envelope.getModuleData(CoreData.class).audioTexts;
        if (vwb.J(list)) {
            return null;
        }
        return (AudioText) list.get(0);
    }

    /* JADX INFO: renamed from: v5 */
    public static /* synthetic */ String m4450v5(String str) {
        DbLinks dbLinksQueryCache = CoreModule.f1542k.f11196d.queryCache(str);
        if (dbLinksQueryCache == null || !NullChecker.a(dbLinksQueryCache.links)) {
            return null;
        }
        return dbLinksQueryCache.links.previous;
    }

    /* JADX INFO: renamed from: v8 */
    public static /* synthetic */ rx.c m4453v8(w9j w9jVar, Message message) {
        return (rx.c) w9jVar.call(message);
    }

    /* JADX INFO: renamed from: vd */
    public static /* synthetic */ stc0 m4458vd(List list) {
        cm10.a aVarF = new cm10.a().f(cm10.j);
        if (!vwb.J(list)) {
            for (int i = 0; i < list.size(); i++) {
                Media media = (Media) list.get(i);
                File file = new File(rhi.z(media.url));
                aVarF.b("sogou_gif_" + i, ogw.d(file) + (TextUtils.equals(media.mediaType, "image/gif") ? ".gif" : TextUtils.equals(media.mediaType, "image/webp") ? ".webp" : ".jpeg"), utc0.create(hyx.d(media.mediaType), file));
            }
        }
        return C0154a.f3483P.auth().q(C0154a.m3293w("/upload/image")).l(aVarF.e()).b();
    }

    /* JADX INFO: renamed from: w7 */
    public static /* synthetic */ j760 m4463w7(String str) {
        List listJ = CoreModule.f1542k.f11195c.m26911l0(str).j();
        Message message = (listJ == null || listJ.isEmpty()) ? null : (Message) listJ.get(0);
        return vwb.Y(listJ == null ? null : (Message) vwb.r(listJ, new w9j() { // from class: l.x98
            public final Object call(Object obj) {
                return Boolean.valueOf(TEnum.equals(((Message) obj).status(), "normal"));
            }
        }), message != null ? Double.valueOf(message.createdTime) : null);
    }

    /* JADX INFO: renamed from: wf */
    public static rx.c<roj0> m4470wf(final String str, final Message message) {
        final Message messageClone = message.clone();
        if (messageClone.moment != null) {
            messageClone.moment = null;
        }
        return new ka20(new v9j() { // from class: l.tb8
            public final Object call() {
                return C0166g.m3969E6(message, str, messageClone);
            }
        }, Envelope.JSON_ADAPTER).map(new w9j() { // from class: l.ub8
            public final Object call(Object obj) {
                return C0166g.m4358mc((Envelope) obj);
            }
        }).compose(C0154a.m3182T2());
    }

    /* JADX INFO: renamed from: x3 */
    public static /* synthetic */ void m4471x3(Message message) {
        long j = ((DbObject) message)._id;
        if (j != 0) {
            Message messageQuery = CoreModule.f1542k.f11195c.query(j);
            messageQuery.localFailType = 0;
            CoreModule.f1542k.f11195c.updateBy_id(messageQuery);
        }
    }

    /* JADX INFO: renamed from: x4 */
    public static /* synthetic */ void m4472x4() {
        CoreModule.f1542k.f11205m.deleteAll();
        qib0.f19813k0.f23550c.delete("conversations");
        CoreModule.f1542k.f11196d.deleteAll();
    }

    /* JADX INFO: renamed from: x7 */
    public static /* synthetic */ stc0 m4475x7(int i, String str) {
        String string;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("level", i);
            string = jSONObject.toString();
        } catch (JSONException unused) {
            string = "{}";
        }
        return C0154a.f3483P.auth().q(C0154a.m3184U0("/conversations/" + str)).k(utc0.create(Network.JSON, string)).b();
    }

    /* JADX INFO: renamed from: xd */
    public static /* synthetic */ stc0 m4481xd(String str, String str2, String str3, String str4, String str5) {
        String string;
        try {
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            if (!TextUtils.equals(str, str2)) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("receiver", CoreModule.m1850H().userId());
                jSONObject2.put("receiverSuffix", str);
                jSONArray.put(jSONObject2);
            }
            if (!TextUtils.equals(str3, str4)) {
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("receiver", str5);
                jSONObject3.put("receiverSuffix", str4);
                jSONArray.put(jSONObject3);
            }
            jSONObject.put("tickles", jSONArray);
            string = jSONObject.toString();
        } catch (JSONException unused) {
            string = "{}";
        }
        return C0154a.f3483P.auth().q(C0154a.m3143J0("/tickles")).l(utc0.create(Network.JSON, string)).b();
    }

    /* JADX INFO: renamed from: xf */
    public static rx.c<roj0> m4482xf(final Message message) {
        final Message message2 = new Message();
        message2.recalled = Boolean.TRUE;
        return new ka20(new v9j() { // from class: l.h48
            public final Object call() {
                Message message3 = message;
                return C0154a.f3483P.debug_noAuth().q(C0154a.m3143J0("/conversations/" + CoreModule.m1850H().userId() + "/messages/" + ((DbObject) message3).id + "?method=patch&user_id=" + message3.cid)).l(utc0.create(Network.JSON, message2.toJson())).b();
            }
        }, Envelope.JSON_ADAPTER).compose(C0154a.m3182T2()).map(new w9j() { // from class: l.s48
            public final Object call(Object obj) {
                return roj0.a;
            }
        });
    }

    /* JADX INFO: renamed from: z8 */
    public static /* synthetic */ Meta m4499z8(Envelope envelope) {
        if (envelope == null) {
            return null;
        }
        return envelope.meta;
    }

    /* JADX INFO: renamed from: Ae */
    public void m4505Ae() {
        m5003on().map(new w9j() { // from class: l.fu7
            public final Object call(Object obj) {
                return Boolean.valueOf(((q860) obj).c());
            }
        }).filter(new w9j() { // from class: l.gu7
            public final Object call(Object obj) {
                return Boolean.valueOf(!((Boolean) obj).booleanValue());
            }
        }).first().observeOn(Schedulers.io()).map(new w9j() { // from class: l.hu7
            public final Object call(Object obj) {
                return C0166g.m4095Pb((Boolean) obj);
            }
        }).filter(new w9j() { // from class: l.iu7
            public final Object call(Object obj) {
                return this.f14786a.m4718Rh((j760) obj);
            }
        }).subscribe(mkd0.H(new e30() { // from class: l.ju7
            public final void call(Object obj) {
                this.f15427a.m4729Sh((j760) obj);
            }
        }, new e30() { // from class: l.ku7
            public final void call(Object obj) {
                C0166g.m4442u8((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: Af */
    public void m4506Af() {
        e51.y(new Runnable() { // from class: l.ax7
            @Override // java.lang.Runnable
            public final void run() {
                this.f8581a.m4884fi();
            }
        });
    }

    /* JADX INFO: renamed from: Ag */
    public double m4507Ag() {
        long timeInMillis;
        if (ura.m25555e().m25559d().m5701Vb()) {
            timeInMillis = ((Long) this.f3941l0.get()).longValue();
        } else {
            long j = this.f3938k0;
            if (j >= 1) {
                return j;
            }
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(mqi0.o());
            calendar.set(calendar.get(1), calendar.get(2), calendar.get(5), 0, 0, 0);
            timeInMillis = calendar.getTimeInMillis() - (((long) (ura.m25555e().m25559d().m5725Ye() - 1)) * 86400000);
        }
        return timeInMillis;
    }

    /* JADX INFO: renamed from: Ah */
    public boolean m4508Ah(String str, String str2) {
        if (User.isTeamAccount(str2) || TextUtils.isEmpty(str)) {
            return false;
        }
        ArrayList arrayList = new ArrayList(Arrays.asList("微信", "v信", "wx", "wechat", "加v", "加徽", "加微", "加徵", "+v", "+微", "+徽", "+徵"));
        int i = 14;
        try {
            String strF = RemoteConfig.x().F("wechat_delay_send_info");
            if (!TextUtils.isEmpty(strF)) {
                arrayList.clear();
                JSONObject jSONObject = new JSONObject(strF);
                i = jSONObject.getInt("mm");
                JSONArray jSONArray = jSONObject.getJSONArray("words");
                for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                    arrayList.add((String) jSONArray.get(i2));
                }
            }
        } catch (Exception unused) {
        }
        Conversation conversationM4786Xe = Looper.getMainLooper() == Looper.myLooper() ? m4786Xe(str2) : m4665Mo(str2);
        if (conversationM4786Xe != null && conversationM4786Xe.mm <= i) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (str.contains((String) it.next())) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: Ai */
    public final /* synthetic */ rx.c m4509Ai(final String str) {
        return ia20.m16571e(new v9j() { // from class: l.v28
            public final Object call() {
                return C0154a.f3483P.auth().q(C0154a.m3297x(str)).d().b();
            }
        }).map(new w9j() { // from class: l.w28
            public final Object call(Object obj) {
                return this.f24765a.m5126yi((Envelope) obj);
            }
        }).observeOn(jo0.a()).map(new w9j() { // from class: l.x28
            public final Object call(Object obj) {
                return this.f25673a.m5139zi((roj0) obj);
            }
        });
    }

    /* JADX INFO: renamed from: Aj */
    public final /* synthetic */ roj0 m4510Aj(final String str, Boolean bool) {
        if (bool.booleanValue()) {
            e51.H(CoreModule.f1533b, new Runnable() { // from class: l.p78
                @Override // java.lang.Runnable
                public final void run() {
                    this.f18616a.m5140zj(str);
                }
            }, 100L);
        }
        return roj0.a;
    }

    /* JADX INFO: renamed from: Ak */
    public final /* synthetic */ q860 m4511Ak(List list, DbLinks dbLinks) {
        return m12325Z2(list, dbLinks);
    }

    /* JADX INFO: renamed from: Al */
    public final /* synthetic */ rx.c m4512Al(final double d2) {
        return rx.c.fromCallable(new Callable() { // from class: l.p88
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f18625a.m5142zl(d2);
            }
        }).flatMap(new w9j() { // from class: l.q88
            public final Object call(Object obj) {
                return new la20(new v9j() { // from class: l.n98
                    public final Object call() {
                        return C0154a.f3483P.auth().q(ura.m25555e().m25559d().m5613E() ? C0154a.m3184U0("/conversation-counters") : C0154a.m3143J0("/conversation-counters")).m(utc0.create(Network.JSON, conversationCounter.toJson())).b();
                    }
                }).map(new w9j() { // from class: l.o98
                    public final Object call(Object obj2) {
                        return roj0.a;
                    }
                });
            }
        }).compose(mkd0.C());
    }

    /* JADX INFO: renamed from: Am */
    public final /* synthetic */ void m4513Am(final double d2) {
        this.f8580Q.f3598U.m13685a(new d30() { // from class: l.bv7
            public final void call() {
                C0166g.m4375o7(d2);
            }
        });
    }

    /* JADX INFO: renamed from: An */
    public rx.c<roj0> m4514An(final String str) {
        return this.f8580Q.now(rx.c.fromCallable(new Callable() { // from class: l.at7
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f8507a.m4731Sj(str);
            }
        }).compose(C0154a.m3182T2()));
    }

    /* JADX INFO: renamed from: Ao */
    public rx.c<roj0> m4515Ao(final String str, final List<Message> list) {
        return this.f8580Q.scheduled("users/me/patch/" + str, -1, new v9j() { // from class: l.qw7
            public final Object call() {
                return this.f20096a.m4936jl(list, str);
            }
        });
    }

    /* JADX INFO: renamed from: Ap */
    public rx.c<q860<Conversation>> m4516Ap() {
        return m4679Oe(m4655Me().m17589h1());
    }

    /* JADX INFO: renamed from: Aq */
    public void m4517Aq(String str, double d2, int i) {
        Conversation conversationQuery = CoreModule.f1542k.f11205m.query(str);
        if (NullChecker.a(conversationQuery)) {
            conversationQuery.conversationUserUpdatedTime = d2;
            conversationQuery.conversationUserDistance = i;
            CoreModule.f1542k.f11205m.upsert(conversationQuery);
        }
    }

    /* JADX INFO: renamed from: Be */
    public void m4518Be(final User user, final Conversation conversation) {
        this.f8580Q.f3598U.m13685a(new d30() { // from class: l.z58
            public final void call() {
                this.f28631a.m4741Th(user, conversation);
            }
        });
    }

    /* JADX INFO: renamed from: Bf */
    public void m4519Bf() {
        e51.y(new Runnable() { // from class: l.uv7
            @Override // java.lang.Runnable
            public final void run() {
                this.f23760a.m4896gi();
            }
        });
    }

    /* JADX INFO: renamed from: Bg */
    public double m4520Bg() {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(mqi0.o());
        calendar.set(calendar.get(1), calendar.get(2), calendar.get(5), 0, 0, 0);
        return (calendar.getTimeInMillis() - (((long) (ura.m25555e().m25559d().m5725Ye() - 1)) * 86400000)) - 1;
    }

    /* JADX INFO: renamed from: Bh */
    public void m4521Bh(Boolean bool) {
        this.f3880Q2 = bool.booleanValue();
    }

    /* JADX INFO: renamed from: Bi */
    public final /* synthetic */ roj0 m4522Bi(final List list, Envelope envelope) {
        this.f8580Q.f3598U.m13685a(new d30() { // from class: l.z98
            public final void call() {
                C0166g.m4015I8(list);
            }
        });
        return roj0.a;
    }

    /* JADX INFO: renamed from: Bj */
    public final /* synthetic */ rx.c m4523Bj(final String str, final String str2) {
        return new la20(new v9j() { // from class: l.t48
            public final Object call() {
                return C0154a.f3483P.auth().q(C0154a.m3165P0(str, str2)).f().b();
            }
        }).map(new w9j() { // from class: l.u48
            public final Object call(Object obj) {
                return this.f22459a.m5127yj(str, (Envelope) obj);
            }
        }).delay(200L, TimeUnit.MILLISECONDS).map(new w9j() { // from class: l.v48
            public final Object call(Object obj) {
                return this.f24118a.m4510Aj(str, (Boolean) obj);
            }
        }).compose(C0154a.m3182T2());
    }

    /* JADX INFO: renamed from: Bk */
    public final /* synthetic */ q860 m4524Bk(List list, DbLinks dbLinks) {
        return m12325Z2(list, dbLinks);
    }

    /* JADX INFO: renamed from: Bl */
    public final /* synthetic */ void m4525Bl(String str, Message message) {
        Conversation conversationQuery = CoreModule.f1542k.f11205m.query(str);
        if (NullChecker.a(conversationQuery)) {
            CoreModule.f1542k.f11205m.upsert(conversationQuery);
            Iterator it = CoreModule.f1542k.f11195c.query(Filter.AND(new Filter[]{Message.CID.EQ(str), Message.MESSAGETYPE.EQ("ai_chat_analysis_guide")}), ((OrderedColumn) Message.CREATEDTIME).DESC, 0).iterator();
            while (it.hasNext()) {
                CoreModule.f1542k.f11195c.delete(((DbObject) ((Message) it.next())).id);
            }
            m4871eh(message);
        }
    }

    /* JADX INFO: renamed from: Bm */
    public final /* synthetic */ void m4526Bm(String str, String str2) {
        Conversation conversationM4665Mo = m4665Mo(str);
        if (conversationM4665Mo == null) {
            return;
        }
        if ((TextUtils.isEmpty(str2) ? 0L : hmb.y1(str2)) > (TextUtils.isEmpty(conversationM4665Mo.otherReadUntil) ? 0L : hmb.y1(conversationM4665Mo.otherReadUntil))) {
            conversationM4665Mo.otherReadUntil = str2;
            CoreModule.f1542k.f11205m.upsert(conversationM4665Mo);
        }
    }

    /* JADX INFO: renamed from: Bn */
    public rx.c<roj0> m4527Bn(String str) {
        return m4540Cn(str, null);
    }

    /* JADX INFO: renamed from: Bo */
    public rx.c<Optional<ConversationPatchRecord>> m4528Bo(final String str) {
        return this.f8580Q.now("patchOffline" + str, rx.c.fromCallable(new Callable() { // from class: l.fq7
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f12852a.m4949kl(str);
            }
        }).compose(C0154a.m3182T2()).doOnNext(new e30() { // from class: l.qq7
            public final void call(Object obj) {
                this.f19975a.m4975ml((Optional) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: Bp */
    public void m4529Bp(String str, String str2, String str3) {
        Message messageNew_ = Message.new_();
        messageNew_.messageType = MessageType.get("tickle");
        messageNew_.msgData = ura.m25555e().m25559d().m5683Rg(str2, str3);
        m4566En(str, messageNew_, null, false);
    }

    /* JADX INFO: renamed from: Bq */
    public rx.c<roj0> m4530Bq(final String str) {
        return this.f8580Q.scheduled("upgradeCompliment_" + str, -1, new v9j() { // from class: l.l28
            public final Object call() {
                return this.f16188a.m4734Sm(str);
            }
        });
    }

    /* JADX INFO: renamed from: Ce */
    public void m4531Ce(String str) {
        User userM21483na = CoreModule.f1534c.f3628e0.m21483na();
        if (NullChecker.a(userM21483na) && userM21483na.isFemale()) {
            CrashHelper.c(new RuntimeException("limit like error for female from " + str + ", errorId" + ((String) this.f8580Q.f3631f0.f3857J0.get())));
        }
    }

    /* JADX INFO: renamed from: Cf */
    public rx.c<roj0> m4532Cf(final String str) {
        return TextUtils.isEmpty(str) ? rx.c.just(roj0.a) : this.f8580Q.now(rx.c.fromCallable(new Callable() { // from class: l.jq7
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f15322a.m4920ii(str);
            }
        }).compose(C0154a.m3182T2()));
    }

    /* JADX INFO: renamed from: Cg */
    public rx.c<Boolean> m4533Cg(String str, String str2) {
        return CoreModule.f1542k.f11195c.m26886M(str, str2).m().map(new w9j() { // from class: l.h08
            public final Object call(Object obj) {
                return Boolean.valueOf(!vwb.J((List) obj));
            }
        });
    }

    /* JADX INFO: renamed from: Ch */
    public final /* synthetic */ void m4534Ch(String str, Conversation conversation) {
        if (!TextUtils.isEmpty(m5124yg())) {
            l3f l3fVar = new l3f();
            l3fVar.s = "e_matched_time_left";
            l3fVar.n = m5124yg();
            EventNameEnum eventNameEnum = EventNameEnum.USER_BEHAVIOR_COMPLEMENT;
            l3fVar.d = eventNameEnum;
            int iLongValue = (int) (((Long) this.f8580Q.f3631f0.f3854I0.get()).longValue() - mqi0.o());
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm:ss");
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
            Date date = new Date();
            date.setTime(iLongValue);
            HashMap map = new HashMap();
            map.put("left_time", simpleDateFormat.format(date));
            zvf0.n(l3fVar, map);
            l3f l3fVar2 = new l3f();
            l3fVar2.s = "e_gotmatch";
            l3fVar2.d = eventNameEnum;
            l3fVar2.n = m5124yg();
            HashMap map2 = new HashMap();
            map2.put("receiver_user_id", str);
            map2.put("actiontype", "swipe");
            map2.put("actionname", "like");
            map2.put("update_relationships_module_id", "e_card");
            map2.put("update_relationships_source", "limited_time_match");
            map2.put("created_time", String.valueOf(mqi0.o() / 1000));
            zvf0.n(l3fVar2, map2);
        }
        mkd0.z(this.f3883R1);
        this.f3857J0.put("");
        this.f3851H0.put(0L);
        this.f3854I0.put(0L);
        boolean zEquals = TextUtils.equals(this.f8580Q.f3631f0.f3876P1, str);
        C0158c c0158c = this.f8580Q;
        if (zEquals) {
            c0158c.f3676u0.m2419x7(str);
        } else {
            c0158c.f3652m0.m2920D8(str);
        }
    }

    /* JADX INFO: renamed from: Ci */
    public final /* synthetic */ rx.c m4535Ci(final JSONObject jSONObject, final List list, final Set set, final Set set2) {
        return ia20.m16571e(new v9j() { // from class: l.c98
            public final Object call() {
                return C0154a.f3483P.auth().q(C0154a.m3305z() + "?method=patch&search=newMatch").l(utc0.create(Network.JSON, jSONObject.toString())).b();
            }
        }).map(new w9j() { // from class: l.d98
            public final Object call(Object obj) {
                return this.f10069a.m4522Bi(list, (Envelope) obj);
            }
        }).onErrorReturn(new w9j() { // from class: l.e98
            public final Object call(Object obj) {
                return C0166g.m4239c9(set, set2, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: renamed from: Cj */
    public final /* synthetic */ stc0 m4536Cj(Links links) {
        return C0154a.f3483P.auth().q(m4982nf(links)).b();
    }

    /* JADX INFO: renamed from: Ck */
    public final /* synthetic */ ConversationCounter m4537Ck(Double d2) {
        return m5142zl(d2.doubleValue());
    }

    /* JADX INFO: renamed from: Cl */
    public final /* synthetic */ roj0 m4538Cl(final String str, final Message message) throws Exception {
        this.f8580Q.f3598U.m13685a(new d30() { // from class: l.lt7
            public final void call() {
                this.f16635a.m4525Bl(str, message);
            }
        });
        return roj0.a;
    }

    /* JADX INFO: renamed from: Cm */
    public final /* synthetic */ void m4539Cm(final String str, final String str2) {
        this.f8580Q.f3598U.m13685a(new d30() { // from class: l.q18
            public final void call() {
                this.f19509a.m4526Bm(str, str2);
            }
        });
    }

    /* JADX INFO: renamed from: Cn */
    public rx.c<roj0> m4540Cn(final String str, final String str2) {
        if (!ura.m25555e().m25559d().m5613E() || TextUtils.isEmpty(str2)) {
            DbLinks dbLinksQueryCache = CoreModule.f1542k.f11196d.queryCache(str);
            str2 = (dbLinksQueryCache == null || !NullChecker.a(dbLinksQueryCache.links)) ? null : dbLinksQueryCache.links.next;
        }
        C0158c c0158c = this.f8580Q;
        if (str2 == null) {
            return c0158c.just();
        }
        return c0158c.scheduled("conversations/" + str + "/next", 0, new v9j() { // from class: l.op7
            public final Object call() {
                return this.f18312a.m4767Vj(str, str2);
            }
        });
    }

    /* JADX INFO: renamed from: Co */
    public rx.c<roj0> m4541Co() {
        return this.f8580Q.scheduled("patchRecord", -1, new v9j() { // from class: l.ps7
            public final Object call() {
                return this.f19280a.m5014pl();
            }
        });
    }

    /* JADX INFO: renamed from: Cp */
    public void m4542Cp(long j) {
        this.f8580Q.f3631f0.f3936j1.put(Long.valueOf(j));
    }

    /* JADX INFO: renamed from: Cq */
    public final boolean m4543Cq() {
        return ((Integer) this.f3970u2.get()).intValue() == 0;
    }

    /* JADX INFO: renamed from: De */
    public void m4544De(final String str) {
        e51.y(new Runnable() { // from class: l.br7
            @Override // java.lang.Runnable
            public final void run() {
                C0166g.m4315id(str);
            }
        });
    }

    /* JADX INFO: renamed from: Df, reason: merged with bridge method [inline-methods] */
    public void m4908hi(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        CoreModule.f1542k.f11195c.delete(Filter.AND(new Filter[]{Message.CID.EQ(str), Message.MESSAGETYPE.EQ("local_chat_assistant_question_new")}));
    }

    /* JADX INFO: renamed from: Dg */
    public rx.c<Conversation> m4546Dg(String str) {
        return CoreModule.f1542k.f11205m.m17614y0(str).m().map(new w9j() { // from class: l.fb8
            public final Object call(Object obj) {
                return C0166g.m4135T6((List) obj);
            }
        });
    }

    /* JADX INFO: renamed from: Dh */
    public final /* synthetic */ roj0 m4547Dh(Envelope envelope) {
        this.f8580Q.m3422w3(envelope, null);
        return roj0.a;
    }

    /* JADX INFO: renamed from: Di */
    public final /* synthetic */ rx.c m4548Di(int i, List list) {
        int iMin = Math.min(i, list.size());
        String[] strArr = new String[iMin];
        for (int i2 = 0; i2 < iMin; i2++) {
            strArr[i2] = ((Conversation) list.get(i2)).otherUser;
        }
        return m4787Xf("matchList", "match", strArr);
    }

    /* JADX INFO: renamed from: Dj */
    public final /* synthetic */ Envelope m4549Dj(final Envelope envelope) {
        this.f8580Q.m3423x3(envelope, new d30() { // from class: l.wy7
            public final void call() {
                C0166g.m4121S3(envelope);
            }
        }, true);
        return envelope;
    }

    /* JADX INFO: renamed from: Dk */
    public final /* synthetic */ void m4550Dk(ConversationCounter conversationCounter) {
        if (this.f3976w2.e() == null || (!conversationCounter.equalsIgnoreTime(this.f3976w2.e()) && conversationCounter.updatedTime >= ((ConversationCounter) this.f3976w2.e()).updatedTime)) {
            this.f3976w2.onNext(conversationCounter);
            this.f3979x2 = true;
        }
    }

    /* JADX INFO: renamed from: Dl */
    public final /* synthetic */ void m4551Dl(String str, Message message) {
        Conversation conversationQuery = CoreModule.f1542k.f11205m.query(str);
        if (NullChecker.a(conversationQuery)) {
            conversationQuery.hasLocalBreakIce = true;
            CoreModule.f1542k.f11205m.upsert(conversationQuery);
            Iterator it = CoreModule.f1542k.f11195c.query(Filter.AND(new Filter[]{Message.CID.EQ(str), Message.MESSAGETYPE.EQ("local_break_ice")}), ((OrderedColumn) Message.CREATEDTIME).DESC, 0).iterator();
            while (it.hasNext()) {
                CoreModule.f1542k.f11195c.delete(((DbObject) ((Message) it.next())).id);
            }
            m4871eh(message);
        }
    }

    /* JADX INFO: renamed from: Dm */
    public final /* synthetic */ void m4552Dm(String str, Message message) {
        this.f8580Q.f3628e0.m21349Ea(str, (long) message.createdTime);
    }

    /* JADX INFO: renamed from: Dn */
    public rx.c<Message> m4553Dn(String str, Message message, Sticker sticker) {
        return m4566En(str, message, sticker, false);
    }

    /* JADX INFO: renamed from: Do */
    public rx.c<roj0> m4554Do(final String str, final String str2, final Message message, final String str3) {
        return this.f8580Q.scheduled("patch_msg_" + str2 + str3, -1, new v9j() { // from class: l.q78
            public final Object call() {
                return this.f19650a.m5053sl(message, str3, str, str2);
            }
        });
    }

    /* JADX INFO: renamed from: Dp */
    public void m4555Dp(String str, final boolean z) {
        final Conversation conversationM5146zp = m5146zp(str);
        if (conversationM5146zp == null) {
            return;
        }
        Runnable runnable = new Runnable() { // from class: l.g98
            @Override // java.lang.Runnable
            public final void run() {
                this.f13109a.m4876em(conversationM5146zp, z);
            }
        };
        if (Looper.myLooper() == Looper.getMainLooper()) {
            e51.y(runnable);
        } else {
            runnable.run();
        }
    }

    /* JADX INFO: renamed from: Dq */
    public void m4556Dq(MessageFeedbackStatus messageFeedbackStatus, Message message) {
        if (NullChecker.a(message) && NullChecker.a(messageFeedbackStatus)) {
            final Message messageClone = message.clone();
            messageClone.msgData = messageFeedbackStatus.toJson();
            this.f8580Q.f3598U.m13685a(new d30() { // from class: l.r78
                public final void call() {
                    CoreModule.f1542k.f11195c.upsert(messageClone);
                }
            });
        }
    }

    /* JADX INFO: renamed from: Ee */
    public void m4557Ee() {
        int iIntValue = ((Integer) this.f3863L0.get()).intValue();
        if (iIntValue == 1) {
            return;
        }
        if (iIntValue == 0 && this.f3878Q0) {
            return;
        }
        this.f3878Q0 = true;
        this.f3863L0.put(0);
        this.f8580Q.scheduled("clean_unread_notification", -1, new v9j() { // from class: l.s78
            public final Object call() {
                return ia20.m16567a(new v9j() { // from class: l.os7
                    public final Object call() {
                        return C0154a.f3483P.auth().q(C0154a.m3143J0("/clean-unread-notification")).l(utc0.create(Network.JSON, "")).b();
                    }
                });
            }
        }).delay(200L, TimeUnit.MILLISECONDS).subscribe(mkd0.H(new e30() { // from class: l.d88
            public final void call(Object obj) {
                this.f10061a.m4753Uh((Envelope) obj);
            }
        }, new e30() { // from class: l.o88
            public final void call(Object obj) {
                this.f18068a.m4765Vh((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: Ef */
    public void m4558Ef(String str) {
        CoreModule.f1542k.f11205m.delete(str);
    }

    /* JADX INFO: renamed from: Eg */
    public int m4559Eg(String str) {
        Message messageQuery;
        return (TextUtils.isEmpty(str) || (messageQuery = CoreModule.f1542k.f11195c.query(str)) == null) ? CoreModule.f1542k.f11195c.count(Filter.AND(new Filter[]{Message.CID.EQ(ura.m25555e().m25559d().m5777h()), Message.MESSAGETYPE.EQ("live_vip_greet")}), 1) : CoreModule.f1542k.f11195c.count(Filter.AND(new Filter[]{Message.CID.EQ(ura.m25555e().m25559d().m5777h()), Message.MESSAGETYPE.EQ("live_vip_greet"), Message.CREATEDTIME.REQ(Double.valueOf(messageQuery.createdTime))}), 1);
    }

    /* JADX INFO: renamed from: Eh */
    public final /* synthetic */ rx.c m4560Eh(final ConversationBatchPatchIds conversationBatchPatchIds) {
        return vwb.J(conversationBatchPatchIds.ids) ? rx.c.empty() : new la20(new v9j() { // from class: l.c38
            public final Object call() {
                return C0154a.f3483P.auth().q(C0154a.m3305z() + "?method=patch&search=batch").l(utc0.create(Network.JSON, conversationBatchPatchIds.toJson())).b();
            }
        }).map(new w9j() { // from class: l.d38
            public final Object call(Object obj) {
                return this.f9991a.m4547Dh((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: Ei */
    public final /* synthetic */ void m4561Ei(List list) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (!vwb.J(list)) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                UserLiveLabel userLiveLabel = (UserLiveLabel) it.next();
                linkedHashMap.put(userLiveLabel.userId, userLiveLabel);
            }
        }
        this.f3835B2.onNext(linkedHashMap);
    }

    /* JADX INFO: renamed from: Ej */
    public final /* synthetic */ rx.c m4562Ej(final Links links) {
        return new la20(new v9j() { // from class: l.zw7
            public final Object call() {
                return this.f29005a.m4536Cj(links);
            }
        }).map(new w9j() { // from class: l.bx7
            public final Object call(Object obj) {
                return this.f9199a.m4549Dj((Envelope) obj);
            }
        }).compose(mkd0.C()).map(new w9j() { // from class: l.cx7
            public final Object call(Object obj) {
                return ((Envelope) obj).pagination.links;
            }
        });
    }

    /* JADX INFO: renamed from: Ek */
    public final /* synthetic */ Conversation m4563Ek(String str) throws Exception {
        Conversation conversationM4665Mo = m4665Mo(str);
        List<Message> listJ = CoreModule.f1542k.f11195c.m26911l0(str).j();
        if (!m4666Mp(conversationM4665Mo, listJ) || TEnum.equals(conversationM4665Mo.status, "dismissed")) {
            return null;
        }
        Message message = (Message) vwb.r(listJ, new w9j() { // from class: l.g78
            public final Object call(Object obj) {
                return Boolean.valueOf(TEnum.equals(((Message) obj).status(), "normal"));
            }
        });
        Conversation conversation = new Conversation();
        conversation.readUntil = message == null ? "" : ((DbObject) message).id;
        return conversation;
    }

    /* JADX INFO: renamed from: El */
    public final /* synthetic */ roj0 m4564El(final String str, final Message message) throws Exception {
        this.f8580Q.f3598U.m13685a(new d30() { // from class: l.kx7
            public final void call() {
                this.f16039a.m4551Dl(str, message);
            }
        });
        return roj0.a;
    }

    /* JADX INFO: renamed from: Em */
    public final /* synthetic */ void m4565Em(double d2) {
        this.f8580Q.f3598U.m13685a(new c(d2));
    }

    /* JADX INFO: renamed from: En */
    public rx.c<Message> m4566En(String str, Message message, Sticker sticker, boolean z) {
        return m4579Fn(str, message, sticker, z, true);
    }

    /* JADX INFO: renamed from: Eo */
    public rx.c<roj0> m4567Eo(final String str, final boolean z, final boolean z2) {
        return this.f8580Q.scheduled("patchSparkAndPartnerSwitch", -1, new v9j() { // from class: l.v08
            public final Object call() {
                return this.f23838a.m5104wl(z, z2, str);
            }
        });
    }

    /* JADX INFO: renamed from: Ep */
    public void m4568Ep(boolean z) {
        this.f3846F1.put(Boolean.valueOf(z));
    }

    /* JADX INFO: renamed from: Eq */
    public rx.c<List<IceBreakingQuestion>> m4569Eq(final String str) {
        return scheduled("users/" + str + "/chat-profiles", 0, new v9j() { // from class: l.nt7
            public final Object call() {
                String str2 = str;
                return ia20.m16567a(new v9j() { // from class: l.m18
                    public final Object call() {
                        return C0154a.f3483P.auth().q(C0154a.m3296w2("/" + str2 + "/chat-profiles")).b();
                    }
                }).map(new w9j() { // from class: l.n18
                    public final Object call(Object obj) {
                        return C0166g.m4053Ld(str2, (Envelope) obj);
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: Fe */
    public void m4570Fe() {
        mkd0.z(this.f3883R1);
    }

    /* JADX INFO: renamed from: Ff */
    public void m4571Ff(final List<Conversation> list) {
        e51.y(new Runnable() { // from class: l.xt7
            @Override // java.lang.Runnable
            public final void run() {
                this.f27716a.m4946ki(list);
            }
        });
    }

    /* JADX INFO: renamed from: Fg */
    public boolean m4572Fg(String str) {
        return !vwb.J(CoreModule.f1542k.f11195c.m26914o0(str, "local_match_ice_break"));
    }

    /* JADX INFO: renamed from: Fh */
    public final /* synthetic */ rx.c m4573Fh() {
        return rx.c.fromCallable(new Callable() { // from class: l.zz7
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C0166g.m4308i6();
            }
        }).flatMap(new w9j() { // from class: l.b08
            public final Object call(Object obj) {
                return this.f8638a.m4560Eh((ConversationBatchPatchIds) obj);
            }
        }).compose(C0154a.m3182T2()).doOnError(new e30() { // from class: l.c08
            public final void call(Object obj) {
                C0166g.m3958D6((Throwable) obj);
            }
        });
    }

    /* JADX INFO: renamed from: Fi */
    public final /* synthetic */ rx.c m4574Fi(int i, List list) {
        int iMin = Math.min(i, list.size());
        String[] strArr = new String[iMin];
        for (int i2 = 0; i2 < iMin; i2++) {
            Conversation conversation = (Conversation) list.get(i2);
            if ("group".equals(conversation.convType)) {
                strArr[i2] = this.f8580Q.f3634g0.m3816h7(conversation.otherUser).ownerUserId;
            } else {
                strArr[i2] = conversation.otherUser;
            }
        }
        return m4787Xf("messageList", "match", strArr);
    }

    /* JADX INFO: renamed from: Fj */
    public final /* synthetic */ xaj0 m4575Fj(Boolean bool) {
        String str;
        String str2;
        jl6 jl6Var = CoreModule.f1542k.f11205m;
        StringColumn stringColumn = Conversation.CONVTYPE;
        int iCount = jl6Var.count(stringColumn.EQ(CameraSticker.CATEGORY_DEFAULT_FILTER), -1);
        CounterVerification counterVerification = new CounterVerification();
        counterVerification.total = iCount;
        counterVerification.lastVerifyTime = ((Long) this.f8580Q.f3628e0.f19113x1.get()).longValue();
        jl6 jl6Var2 = CoreModule.f1542k.f11205m;
        Filter filterEQ = stringColumn.EQ(CameraSticker.CATEGORY_DEFAULT_FILTER);
        DoubleColumn doubleColumn = Conversation.UPDATEDTIME;
        List listQuery = jl6Var2.query(filterEQ, ((OrderedColumn) doubleColumn).DESC, 1);
        String str3 = "null";
        if (vwb.J(listQuery)) {
            str = "null";
        } else {
            Conversation conversation = (Conversation) listQuery.get(0);
            counterVerification.latestUpdatedTime = conversation.updatedTime;
            str = ((DbObject) conversation).id;
        }
        List listQuery2 = CoreModule.f1542k.f11205m.query(stringColumn.EQ(CameraSticker.CATEGORY_DEFAULT_FILTER), ((OrderedColumn) doubleColumn).ASC, 1);
        if (vwb.J(listQuery2)) {
            str2 = "null";
        } else {
            Conversation conversation2 = (Conversation) listQuery2.get(0);
            counterVerification.latestUpdatedTime = conversation2.updatedTime;
            str3 = ((DbObject) conversation2).id;
            str2 = ((long) conversation2.updatedTime) + "";
        }
        final CoreData coreData = new CoreData();
        coreData.counterVerification = counterVerification;
        return xaj0.a((Envelope) new la20(new v9j() { // from class: l.oz7
            public final Object call() {
                return C0154a.f3483P.auth().q(C0154a.m3143J0("/counter-verifications")).l(utc0.create(Network.JSON, coreData.toJson())).b();
            }
        }).toBlocking().c((Object) null), Integer.valueOf(iCount), "timeInfo: firstCid:" + str + "|firstTime:" + ((long) counterVerification.latestUpdatedTime) + "|lastCid:" + str3 + "|lastTime:" + str2 + "|");
    }

    /* JADX INFO: renamed from: Fk */
    public final /* synthetic */ roj0 m4576Fk(Envelope envelope) {
        this.f8580Q.m3422w3(envelope, null);
        return roj0.a;
    }

    /* JADX INFO: renamed from: Fl */
    public final /* synthetic */ Message m4577Fl(String str, Message message, roj0 roj0Var) {
        return (message == null && NullChecker.a(this.f3871N2.get(str))) ? this.f3871N2.get(str) : message;
    }

    /* JADX INFO: renamed from: Fm */
    public final /* synthetic */ roj0 m4578Fm(final String str, final double d2) throws Exception {
        this.f8580Q.f3598U.m13685a(new d30() { // from class: l.g68
            public final void call() {
                C0166g.m4072Na(str, d2);
            }
        });
        return roj0.a;
    }

    /* JADX INFO: renamed from: Fn */
    public rx.c<Message> m4579Fn(final String str, final Message message, final Sticker sticker, final boolean z, final boolean z2) {
        final CoreProviderInterface coreProviderInterfaceM25559d = ura.m25555e().m25559d();
        coreProviderInterfaceM25559d.m5626Ga(str);
        if (sticker != null) {
            String strGENERATE_UNIQUE_FAKE_ID = DbObject.GENERATE_UNIQUE_FAKE_ID(((Integer) App.i.get()).intValue());
            ((DbObject) sticker).id = strGENERATE_UNIQUE_FAKE_ID;
            message.sticker = strGENERATE_UNIQUE_FAKE_ID;
        }
        final String strM5645Jd = ura.m25555e().m25559d().m5645Jd();
        final long jElapsedRealtime = SystemClock.elapsedRealtime();
        boolean zEquals = ura.m25555e().m25559d().m5613E() ? true ^ TEnum.equals(message.channel, "group") : true;
        if (TextUtils.equals((CharSequence) this.f3857J0.get(), str)) {
            zEquals = false;
        }
        final HashMap map = new HashMap();
        if (!TEnum.equals(message.channel, "group") && !vwb.J(message.media)) {
            Iterator it = message.media.iterator();
            while (it.hasNext()) {
                if (((Media) it.next()) instanceof Picture) {
                    map.put("direct", "true");
                    break;
                }
            }
        }
        final boolean z3 = zEquals;
        final boolean z4 = !z;
        if (message.settings == null) {
            message.settings = MessageSetting.new_();
        }
        v9j v9jVar = new v9j() { // from class: l.mr7
            public final Object call() {
                return this.f17197a.m4803Yj(message, str, z4, z3, sticker, coreProviderInterfaceM25559d);
            }
        };
        final w9j w9jVar = new w9j() { // from class: l.xr7
            public final Object call(Object obj) {
                return this.f27686a.m4851ck(map, sticker, message, (Message) obj);
            }
        };
        final e30 e30Var = new e30() { // from class: l.is7
            public final void call(Object obj) {
                this.f14729a.m4886fk(str, message, coreProviderInterfaceM25559d, z2, strM5645Jd, jElapsedRealtime, (Throwable) obj);
            }
        };
        w9j w9jVar2 = new w9j() { // from class: l.ts7
            public final Object call(Object obj) {
                return this.f22257a.m4935jk(str, z, z4, z3, e30Var, (Message) obj);
            }
        };
        w9j w9jVar3 = new w9j() { // from class: l.et7
            public final Object call(Object obj) {
                return this.f11428a.m4948kk(str, message, strM5645Jd, jElapsedRealtime, (Message) obj);
            }
        };
        w9j w9jVar4 = new w9j() { // from class: l.pt7
            public final Object call(Object obj) {
                return this.f19298a.m4961lk(message, str, (Message) obj);
            }
        };
        final long jElapsedRealtime2 = SystemClock.elapsedRealtime();
        return this.f8580Q.now((String) null, ((rx.c) v9jVar.call()).observeOn(Schedulers.io()).flatMap(new w9j() { // from class: l.bu7
            public final Object call(Object obj) {
                return C0166g.m4453v8(w9jVar, (Message) obj);
            }
        }).compose(TrackMediaUploadUtil.f0("chat", message.media, new w9j() { // from class: l.mu7
            public final Object call(Object obj) {
                return C0166g.m4433ta((Message) obj);
            }
        })).doOnError(e30Var).filter(w9jVar3).map(w9jVar4).filter(new w9j() { // from class: l.xu7
            public final Object call(Object obj) {
                return C0166g.m3968E5((Message) obj);
            }
        }).observeOn(jo0.a()).flatMap(w9jVar2).doOnNext(new e30() { // from class: l.iv7
            public final void call(Object obj) {
                this.f14798a.m4974mk(message, jElapsedRealtime2, str, (Message) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: Fo */
    public rx.c<roj0> m4580Fo() {
        return (!ura.m25555e().m25559d().m5806ka() || this.f8580Q.findRequest("conversations/get", 0) == null) ? m4999oj(null) : m4806Ym();
    }

    /* JADX INFO: renamed from: Fp */
    public rx.c<roj0> m4581Fp(final String str, final String str2, final String str3, final String str4, final String str5) {
        return this.f8580Q.now(new la20(new v9j() { // from class: l.ms7
            public final Object call() {
                return C0166g.m4481xd(str2, str4, str5, str3, str);
            }
        }).map(new w9j() { // from class: l.ns7
            public final Object call(Object obj) {
                return roj0.a;
            }
        }).compose(C0154a.m3182T2()));
    }

    /* JADX INFO: renamed from: Fq */
    public rx.c<LinkedHashMap<String, UserLiveLabel>> m4582Fq() {
        return this.f3835B2.asObservable().observeOn(jo0.a());
    }

    /* JADX INFO: renamed from: Ge */
    public void m4583Ge(final String str) {
        e51.y(new Runnable() { // from class: l.hy7
            @Override // java.lang.Runnable
            public final void run() {
                this.f14127a.m4789Xh(str);
            }
        });
    }

    /* JADX INFO: renamed from: Gf */
    public void m4584Gf() {
        e51.y(new Runnable() { // from class: l.vb8
            @Override // java.lang.Runnable
            public final void run() {
                this.f24242a.m4959li();
            }
        });
    }

    /* JADX INFO: renamed from: Gg */
    public rx.c<Boolean> m4585Gg(String str, MessageType messageType) {
        return CoreModule.f1542k.f11195c.m26916q0(str, messageType.toString()).m().map(new w9j() { // from class: l.lp7
            public final Object call(Object obj) {
                return Boolean.valueOf(!vwb.J((List) obj));
            }
        });
    }

    /* JADX INFO: renamed from: Gh */
    public final /* synthetic */ roj0 m4586Gh(Envelope envelope) {
        this.f8580Q.m3422w3(envelope, null);
        return roj0.a;
    }

    /* JADX INFO: renamed from: Gi */
    public final /* synthetic */ void m4587Gi(List list) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (!vwb.J(list)) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                UserLiveLabel userLiveLabel = (UserLiveLabel) it.next();
                linkedHashMap.put(userLiveLabel.userId, userLiveLabel);
            }
        }
        this.f3838C2.onNext(linkedHashMap);
    }

    /* JADX INFO: renamed from: Gj */
    public final /* synthetic */ void m4588Gj(xaj0 xaj0Var) {
        Envelope envelope = (Envelope) xaj0Var.a;
        if (NullChecker.a(envelope.getModuleData(CoreData.class).counterVerification) && envelope.getModuleData(CoreData.class).counterVerification.nextVerifyTime > 0.0d) {
            this.f8580Q.f3628e0.f19106w1.put(Long.valueOf((long) envelope.getModuleData(CoreData.class).counterVerification.nextVerifyTime));
        }
        this.f8580Q.f3628e0.f19113x1.put(Long.valueOf(mqi0.o()));
        if (NullChecker.a(envelope.getModuleData(CoreData.class).counterVerification) && envelope.getModuleData(CoreData.class).counterVerification.needSync) {
            jl6 jl6Var = CoreModule.f1542k.f11205m;
            StringColumn stringColumn = Conversation.CONVTYPE;
            List<Conversation> listQuery = jl6Var.query(stringColumn.EQ(CameraSticker.CATEGORY_DEFAULT_FILTER), ((OrderedColumn) Conversation.UPDATEDTIME).DESC, 200);
            int iCount = CoreModule.f1542k.f11205m.count(Filter.TRUE, -1);
            int iCount2 = CoreModule.f1542k.f11205m.count(stringColumn.NEQ("group"), -1);
            StringBuilder sb = new StringBuilder("Conversation Counter Error userId: ");
            sb.append(CoreModule.m1850H().userId());
            sb.append("\nlocalCounter: ");
            sb.append(xaj0Var.b);
            sb.append("\nremoteCounter: ");
            sb.append(envelope.getModuleData(CoreData.class).counterVerification.total);
            sb.append("\ndefaultCount: ");
            sb.append(iCount);
            sb.append("\nwithoutGroup: ");
            sb.append(iCount2);
            sb.append("\ncheckTime: ");
            sb.append((String) xaj0Var.c);
            sb.append(" | localCids:");
            if (!vwb.J(listQuery)) {
                for (Conversation conversation : listQuery) {
                    sb.append(((DbObject) conversation).id);
                    sb.append("|");
                    sb.append(conversation.status.toString());
                    sb.append("|");
                    sb.append(conversation.convType);
                    sb.append(",");
                }
            }
            sb.append("\ndefaultIds:\n");
            List<Conversation> listQuery2 = CoreModule.f1542k.f11205m.query(Filter.TRUE, ((OrderedColumn) Conversation.UPDATEDTIME).DESC, 200);
            if (!vwb.J(listQuery2)) {
                for (Conversation conversation2 : listQuery2) {
                    sb.append(((DbObject) conversation2).id);
                    sb.append("|");
                    sb.append(conversation2.status.toString());
                    sb.append("|");
                    sb.append(conversation2.convType);
                    sb.append(",");
                }
            }
            String strC = wf6.c();
            sb.append("\nrequestList:\n");
            sb.append(strC);
            sb.append("\n");
            CrashHelper.c(new Exception(sb.toString()));
        }
    }

    /* JADX INFO: renamed from: Gk */
    public final /* synthetic */ rx.c m4589Gk(final String str, final Conversation conversation) {
        return conversation != null ? new la20(new v9j() { // from class: l.i68
            public final Object call() {
                return C0154a.f3483P.auth().q(C0154a.m3106A(str) + "&method=patch").l(utc0.create(Network.JSON, conversation.toJson())).b();
            }
        }).map(new w9j() { // from class: l.j68
            public final Object call(Object obj) {
                return this.f15005a.m4576Fk((Envelope) obj);
            }
        }) : rx.c.empty();
    }

    /* JADX INFO: renamed from: Gl */
    public final /* synthetic */ void m4590Gl(String str, String str2, Message message) {
        if (message == null) {
            m4676Nn(str, str2, false, true, null);
        }
    }

    /* JADX INFO: renamed from: Gm */
    public final /* synthetic */ roj0 m4591Gm(final String str, final double d2) throws Exception {
        this.f8580Q.f3598U.m13685a(new d30() { // from class: l.a68
            public final void call() {
                C0166g.m4202Z7(str, d2);
            }
        });
        return roj0.a;
    }

    /* JADX INFO: renamed from: Gn */
    public rx.c<roj0> m4592Gn(String str, Message message) {
        return m4604Hn(str, message, false, null);
    }

    /* JADX INFO: renamed from: Go */
    public void m4593Go(Throwable th, final String str) {
        if (th instanceof ApiExcep.Client.NotFound) {
            e51.G(new Runnable() { // from class: l.b28
                @Override // java.lang.Runnable
                public final void run() {
                    this.f8676a.m5116xl(str);
                }
            });
        }
    }

    /* JADX INFO: renamed from: Gp */
    public void m4594Gp(Act act, boolean z, String str, Picture.ImageUri imageUri) {
        m4606Hp(act, z, str, "", imageUri, "");
    }

    /* JADX INFO: renamed from: He */
    public void m4595He() {
        this.f8580Q.f3674t1.m3446u("countdown_conv_list_key");
        this.f8580Q.f3674t1.m3446u("countdown_card_conv_key");
        if (!TextUtils.isEmpty((CharSequence) this.f8580Q.f3631f0.f3857J0.get())) {
            C0158c c0158c = this.f8580Q;
            c0158c.f3652m0.m2920D8((String) c0158c.f3631f0.f3857J0.get());
        }
        this.f8580Q.f3631f0.f3857J0.put("");
        this.f8580Q.f3631f0.f3851H0.put(0L);
        this.f8580Q.f3631f0.f3854I0.put(0L);
        this.f8580Q.f3631f0.f3860K0.put(Boolean.FALSE);
        this.f8580Q.f3631f0.m4570Fe();
        this.f3889T1.onNext(roj0.a);
    }

    /* JADX INFO: renamed from: Hf */
    public void m4596Hf(final String str) {
        this.f8580Q.f3598U.m13685a(new d30() { // from class: l.lv7
            public final void call() {
                String str2 = str;
                CoreModule.f1542k.f11195c.delete(Filter.AND(new Filter[]{Message.CID.EQ(str2), Message.ID.EQ("fake_id_filter_veification" + str2)}));
            }
        });
    }

    /* JADX INFO: renamed from: Hg */
    public rx.c<Boolean> m4597Hg(final String str) {
        return this.f8580Q.now(rx.c.fromCallable(new Callable() { // from class: l.xw7
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C0166g.m4292ge(str);
            }
        }).compose(C0154a.m3182T2()));
    }

    /* JADX INFO: renamed from: Hh */
    public final /* synthetic */ rx.c m4598Hh(final ConversationBatchPatchIds conversationBatchPatchIds) {
        return vwb.J(conversationBatchPatchIds.ids) ? rx.c.empty() : new la20(new v9j() { // from class: l.rw7
            public final Object call() {
                return C0154a.f3483P.auth().q(C0154a.m3305z() + "?method=patch&search=batch").l(utc0.create(Network.JSON, conversationBatchPatchIds.toJson())).b();
            }
        }).map(new w9j() { // from class: l.sw7
            public final Object call(Object obj) {
                return this.f21695a.m4586Gh((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: Hj */
    public final /* synthetic */ void m4600Hj(Message message) {
        Conversation conversationM4665Mo;
        Message messageQuery = CoreModule.f1542k.f11195c.query(((DbObject) message).id);
        if (messageQuery == null || (conversationM4665Mo = m4665Mo(message.cid)) == null || conversationM4665Mo.localSafetyReminderTime > 0.0d) {
            return;
        }
        conversationM4665Mo.localSafetyReminderTime = message.createdTime;
        CoreModule.f1542k.f11205m.upsert(conversationM4665Mo);
        messageQuery.localSafetyReminder = true;
        CoreModule.f1542k.f11195c.upsert(messageQuery);
    }

    /* JADX INFO: renamed from: Hk */
    public final /* synthetic */ void m4601Hk(String str, Throwable th) {
        StringBuilder sb = new StringBuilder("cid:");
        sb.append(str);
        sb.append(" errorMessage:");
        sb.append(NullChecker.a(th.getMessage()) ? th.getMessage() : "");
        du2.a("ConversationPatchDelete", sb.toString());
        m4593Go(th, str);
    }

    /* JADX INFO: renamed from: Hl */
    public final /* synthetic */ void m4602Hl(Conversation conversation) {
        m4658Mh(((DbObject) conversation).id);
    }

    /* JADX INFO: renamed from: Hm */
    public final /* synthetic */ roj0 m4603Hm(final String str, final double d2) throws Exception {
        this.f8580Q.f3598U.m13685a(new d30() { // from class: l.h68
            public final void call() {
                C0166g.m4260e6(str, d2);
            }
        });
        return roj0.a;
    }

    /* JADX INFO: renamed from: Hn */
    public final rx.c<roj0> m4604Hn(final String str, final Message message, final boolean z, final d30 d30Var) {
        return this.f8580Q.scheduled("messagePostSimple", -1, new v9j() { // from class: l.i08
            public final Object call() {
                return this.f14155a.m5013pk(str, message, d30Var, z);
            }
        });
    }

    /* JADX INFO: renamed from: Ho */
    public rx.c<roj0> m4605Ho(final String str, final List<String> list, final Message message) {
        return rx.c.fromCallable(new Callable() { // from class: l.y18
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C0166g.m4167W5(str, list, message);
            }
        }).flatMap(new w9j() { // from class: l.z18
            public final Object call(Object obj) {
                return this.f28551a.m5129yl(str, (JSONObject) obj);
            }
        });
    }

    /* JADX INFO: renamed from: Hp */
    public void m4606Hp(Act act, final boolean z, final String str, final String str2, final Picture.ImageUri imageUri, final String str3) {
        act.duringCreated(m5035rg(str).filter(new w9j() { // from class: l.ty7
            public final Object call(Object obj) {
                return C0166g.m3945C4((Boolean) obj);
            }
        }).flatMap(new w9j() { // from class: l.ez7
            public final Object call(Object obj) {
                return this.f11526a.m4888fm((Boolean) obj);
            }
        }).filter(new w9j() { // from class: l.pz7
            public final Object call(Object obj) {
                return this.f19460a.m4900gm((roj0) obj);
            }
        }).flatMap(new w9j() { // from class: l.a08
            public final Object call(Object obj) {
                return this.f8034a.m4912hm(str, str2, z, (roj0) obj);
            }
        }).filter(new w9j() { // from class: l.l08
            public final Object call(Object obj) {
                return C0166g.m4016I9((CipherId) obj);
            }
        })).subscribe(mkd0.H(new e30() { // from class: l.w08
            public final void call(Object obj) {
                this.f24573a.m4924im(str, str2, imageUri, z, str3, (CipherId) obj);
            }
        }, new e30() { // from class: l.h18
            public final void call(Object obj) {
                C0166g.m4026J8((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: Ie */
    public void m4607Ie() {
        this.f3847F2.clear();
    }

    /* JADX INFO: renamed from: If */
    public void m4608If() {
        e51.y(new Runnable() { // from class: l.sq7
            @Override // java.lang.Runnable
            public final void run() {
                this.f21572a.m4972mi();
            }
        });
    }

    /* JADX INFO: renamed from: Ig */
    public rx.c<Boolean> m4609Ig(String str) {
        return CoreModule.f1542k.f11195c.m26904e0(str).m().map(new w9j() { // from class: l.l38
            public final Object call(Object obj) {
                return Boolean.valueOf(!vwb.J((List) obj));
            }
        });
    }

    /* JADX INFO: renamed from: Ih */
    public final /* synthetic */ rx.c m4610Ih() {
        return rx.c.fromCallable(new Callable() { // from class: l.oq7
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C0166g.m4063Mc();
            }
        }).flatMap(new w9j() { // from class: l.pq7
            public final Object call(Object obj) {
                return this.f19262a.m4598Hh((ConversationBatchPatchIds) obj);
            }
        }).compose(C0154a.m3182T2()).doOnError(new e30() { // from class: l.rq7
            public final void call(Object obj) {
                C0166g.m3989G4((Throwable) obj);
            }
        });
    }

    /* JADX INFO: renamed from: Ii */
    public final /* synthetic */ rx.c m4611Ii(final String str, final String str2) {
        return ia20.m16571e(new v9j() { // from class: l.my7
            public final Object call() {
                return C0154a.f3483P.auth().q(C0154a.m3141I2("/conversations/" + str + "/messages/" + str2 + "/audiotexts")).f().b();
            }
        }).map(new w9j() { // from class: l.ny7
            public final Object call(Object obj) {
                return C0166g.m4448v3((Envelope) obj);
            }
        }).doOnNext(new e30() { // from class: l.oy7
            public final void call(Object obj) {
                this.f18487a.m4599Hi(str2, (AudioText) obj);
            }
        });
    }

    /* JADX INFO: renamed from: Ij */
    public final /* synthetic */ void m4612Ij(final Message message) {
        this.f8580Q.f3598U.m13685a(new d30() { // from class: l.e48
            public final void call() {
                this.f10756a.m4600Hj(message);
            }
        });
    }

    /* JADX INFO: renamed from: Ik */
    public final /* synthetic */ rx.c m4613Ik(final String str) {
        return rx.c.fromCallable(new Callable() { // from class: l.b58
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f8731a.m4563Ek(str);
            }
        }).flatMap(new w9j() { // from class: l.c58
            public final Object call(Object obj) {
                return this.f9369a.m4589Gk(str, (Conversation) obj);
            }
        }).compose(C0154a.m3182T2()).doOnError(new e30() { // from class: l.e58
            public final void call(Object obj) {
                this.f10766a.m4601Hk(str, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: renamed from: Il */
    public final /* synthetic */ void m4614Il(Conversation conversation) {
        m5047sf(((DbObject) conversation).id);
    }

    /* JADX INFO: renamed from: Im */
    public final /* synthetic */ roj0 m4615Im(final String str, final double d2, final int i) throws Exception {
        this.f8580Q.f3598U.m13685a(new d30() { // from class: l.w48
            public final void call() {
                C0166g.m4340l5(str, d2, i);
            }
        });
        return roj0.a;
    }

    /* JADX INFO: renamed from: In */
    public rx.c<roj0> m4616In(Message message) {
        return m4628Jn(message, null);
    }

    /* JADX INFO: renamed from: Io */
    public final rx.c<roj0> m4617Io(final double d2) {
        return this.f8580Q.scheduled("postCounter", -1, new v9j() { // from class: l.v58
            public final Object call() {
                return this.f24148a.m4512Al(d2);
            }
        });
    }

    /* JADX INFO: renamed from: Ip, reason: merged with bridge method [inline-methods] */
    public void m4937jm(IWXAPI iwxapi, String str, String str2, boolean z, String str3, boolean z2) {
        WXWebpageObject wXWebpageObject = new WXWebpageObject();
        wXWebpageObject.webpageUrl = str;
        WXMediaMessage wXMediaMessage = new WXMediaMessage(wXWebpageObject);
        if (TextUtils.isEmpty(Uri.parse(str).getQueryParameter("m"))) {
            String str4 = z2 ? "她好像还可以" : "他好像还可以";
            HashMap map = new HashMap();
            map.put(0, "这个条件真心不错，不想再错过了");
            map.put(1, "你也来看看");
            map.put(2, "真心分享心动瞬间！");
            int iNextInt = new Random().nextInt(3);
            wXMediaMessage.title = new String[]{"我发现一个不错的，帮我参谋一下～", str4, "再也不想错过了"}[iNextInt];
            wXMediaMessage.description = (String) map.get(Integer.valueOf(iNextInt));
        } else if (TextUtils.isEmpty(str3)) {
            HashMap map2 = new HashMap();
            map2.put(0, "好久没刷到过这么有意思的动态了");
            map2.put(1, "这个动态好好玩啊 你觉得呢?");
            map2.put(2, "分享给你 去看看吧>>");
            map2.put(3, "你也觉得有意思吧~");
            map2.put(4, "分享给你！");
            int iNextInt2 = new Random().nextInt(5);
            wXMediaMessage.title = new String[]{"这个动态也太吸引人了 你要不要看看", "给你看个东西的～", "今天刷到一个动态挺有意思", "优质的动态不过如此", "我知道这是你的菜"}[iNextInt2];
            wXMediaMessage.description = (String) map2.get(Integer.valueOf(iNextInt2));
        } else {
            int iNextInt3 = new Random().nextInt(3);
            wXMediaMessage.title = str3;
            wXMediaMessage.description = new String[]{"真心有趣，分享给你", "这条动态也太有趣了", "好东西得分享"}[iNextInt3];
        }
        if (TextUtils.isEmpty(str2)) {
            wXMediaMessage.thumbData = adk0.a(BitmapFactory.decodeFile(ShareHelper.W("share_ab_icon.png")));
        } else {
            wXMediaMessage.thumbData = adk0.a(BitmapFactory.decodeFile(str2));
        }
        SendMessageToWX.Req req = new SendMessageToWX.Req();
        req.message = wXMediaMessage;
        ((BaseReq) req).transaction = "ab_share_profile";
        if (z) {
            req.scene = 1;
        } else {
            req.scene = 0;
        }
        iwxapi.sendReq(req);
    }

    /* JADX INFO: renamed from: Je */
    public void m4619Je() {
        this.f3850G2.clear();
    }

    /* JADX INFO: renamed from: Jf */
    public void m4620Jf() {
        e51.y(new Runnable() { // from class: l.mb8
            @Override // java.lang.Runnable
            public final void run() {
                this.f16886a.m4985ni();
            }
        });
    }

    /* JADX INFO: renamed from: Jg */
    public rx.c<Boolean> m4621Jg(String str) {
        return CoreModule.f1542k.f11195c.m26905f0(str).m().map(new w9j() { // from class: l.fr7
            public final Object call(Object obj) {
                return Boolean.valueOf(!((List) obj).isEmpty());
            }
        });
    }

    /* JADX INFO: renamed from: Jh */
    public final /* synthetic */ void m4622Jh(String str) {
        m5034rf(str, false);
    }

    /* JADX INFO: renamed from: Ji */
    public final /* synthetic */ void m4623Ji(Envelope envelope) {
        m4751Uf();
        List list = envelope.getModuleData(CoreData.class).friends;
        if (vwb.J(list)) {
            return;
        }
        this.f3933i1.put(Integer.valueOf(((Integer) this.f3933i1.get()).intValue() + 1));
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            arrayList.add(((FriendInfo) list.get(i)).userId);
        }
        m4929je(arrayList);
    }

    /* JADX INFO: renamed from: Jj */
    public final /* synthetic */ q860 m4624Jj(List list, DbLinks dbLinks) {
        if (dbLinks == null) {
            m4580Fo();
        }
        return m12325Z2(list, dbLinks);
    }

    /* JADX INFO: renamed from: Jk */
    public final /* synthetic */ ConversationPatchRecord m4625Jk(ConversationPatchRecord conversationPatchRecord) throws Exception {
        final ConversationPatchRecord conversationPatchRecordQuery = CoreModule.f1542k.f11204l.query(((DbObject) conversationPatchRecord).id);
        if (conversationPatchRecordQuery == null || TEnum.equals(conversationPatchRecordQuery.state, "patching")) {
            return null;
        }
        conversationPatchRecordQuery.state = ConversationPatchState.get("patching");
        this.f8580Q.f3598U.m13685a(new d30() { // from class: l.v38
            public final void call() {
                CoreModule.f1542k.f11204l.updateBy_id(conversationPatchRecordQuery);
            }
        });
        return conversationPatchRecordQuery;
    }

    /* JADX INFO: renamed from: Jl */
    public final /* synthetic */ void m4626Jl(List list, ArrayList arrayList, Envelope envelope) {
        vwb.z(list, new e30() { // from class: l.q38
            public final void call(Object obj) {
                this.f19549a.m4602Hl((Conversation) obj);
            }
        });
        if (!vwb.J(arrayList)) {
            vwb.z(arrayList, new e30() { // from class: l.r38
                public final void call(Object obj) {
                    this.f20280a.m4614Il((Conversation) obj);
                }
            });
        }
        m5060tf(envelope);
    }

    /* JADX INFO: renamed from: Jm */
    public final /* synthetic */ void m4627Jm(final Message message, final boolean z, roj0 roj0Var) {
        this.f8580Q.f3598U.m13685a(new d30() { // from class: l.e78
            public final void call() {
                C0166g.m4074Nc(message, z);
            }
        });
    }

    /* JADX INFO: renamed from: Jn */
    public rx.c<roj0> m4628Jn(final Message message, final d30 d30Var) {
        return this.f8580Q.scheduled("messageRecall", -1, new v9j() { // from class: l.r58
            public final Object call() {
                return this.f20346a.m5039rk(message, d30Var);
            }
        });
    }

    /* JADX INFO: renamed from: Jo */
    public rx.c<Message> m4629Jo() {
        return this.f3899X.observeOn(jo0.a());
    }

    /* JADX INFO: renamed from: Jp */
    public void m4630Jp(final String str, String str2, final boolean z, final String str3, final boolean z2) {
        final IWXAPI iwxapiCreateWXAPI = WXAPIFactory.createWXAPI(CoreModule.f1533b, (String) null);
        iwxapiCreateWXAPI.registerApp("wx67f59443a9c801bb");
        if (!iwxapiCreateWXAPI.isWXAppInstalled()) {
            lsi0.y("未检测到可分享平台");
            return;
        }
        if (TextUtils.isEmpty(str2) || !(str2.toLowerCase().startsWith("http") || str2.toLowerCase().startsWith("https"))) {
            m4937jm(iwxapiCreateWXAPI, str, "", z, str3, z2);
            return;
        }
        if (str.contains("&f=true")) {
            str2 = "https://auto.tancdn.com/v1/images/eyJpZCI6IktQQ0VDSlZVUkZQMzVPSlBWRVJCSUhVVjJFSk5BWDA4IiwidyI6NzAwLCJoIjo3MDAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoxNTk3MDY2OTU1MTc5NDg3ODI4Nn0";
        }
        qib0.f19782G.i(str2, new e30() { // from class: l.ga8
            public final void call(Object obj) {
                this.f13121a.m4937jm(iwxapiCreateWXAPI, str, z, str3, z2, (String) obj);
            }
        });
    }

    /* JADX INFO: renamed from: Ke */
    public void m4631Ke() {
        final List listQuery = CoreModule.f1542k.f11205m.query(Filter.AND(new Filter[]{f3829c3, Conversation.UNREADMESSAGES.REQ(1)}), ((OrderedColumn) Conversation.LATESTTIME).DESC, 500);
        if (vwb.J(listQuery)) {
            return;
        }
        this.f8580Q.f3598U.m13685a(new d30() { // from class: l.wt7
            public final void call() {
                this.f25397a.m4801Yh(listQuery);
            }
        });
        m4868dq(qib0.f19784H.guessedCurrentServerTime());
    }

    /* JADX INFO: renamed from: Kf */
    public rx.c<roj0> m4632Kf(final String str) {
        return TextUtils.isEmpty(str) ? rx.c.just(roj0.a) : this.f8580Q.now(rx.c.fromCallable(new Callable() { // from class: l.l68
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f16243a.m4998oi(str);
            }
        }).compose(C0154a.m3182T2()));
    }

    /* JADX INFO: renamed from: Kg */
    public rx.c<Boolean> m4633Kg(String str) {
        return CoreModule.f1542k.f11195c.m26905f0(str).m().map(new w9j() { // from class: l.kw7
            public final Object call(Object obj) {
                return C0166g.m4115R9((List) obj);
            }
        });
    }

    /* JADX INFO: renamed from: Kh */
    public final /* synthetic */ roj0 m4634Kh(final String str, Act act, Envelope envelope) {
        if (vwb.J(envelope.getModuleData(CoreData.class).relationships)) {
            Relationship.new_();
        } else if (CoreModule.m1853N().so()) {
            final User userQuery = qib0.f19813k0.f23551d.query(str);
            final Relationship relationship = (Relationship) envelope.getModuleData(CoreData.class).relationships.get(0);
            userQuery.localRelationship = relationship;
            if (act == null) {
                e51.G(new Runnable() { // from class: l.t68
                    @Override // java.lang.Runnable
                    public final void run() {
                        CoreModule.m1853N().processMomentLikeStatusChanged(relationship, userQuery, false, false);
                    }
                });
            } else {
                e51.F(act, new Runnable() { // from class: l.u68
                    @Override // java.lang.Runnable
                    public final void run() {
                        CoreModule.m1853N().processMomentLikeStatusChanged(relationship, userQuery, false, false);
                    }
                });
            }
        }
        this.f8580Q.f3598U.m13685a(new d30() { // from class: l.v68
            public final void call() {
                this.f24163a.m4622Jh(str);
            }
        });
        if (ura.m25555e().m25559d().m5879x()) {
            e51.H(CoreModule.f1533b, new t38(this), 500L);
        }
        if (ura.m25555e().m25559d().m5765g()) {
            ura.m25555e().m25559d().m5779h6(str);
        }
        return roj0.a;
    }

    /* JADX INFO: renamed from: Ki */
    public final /* synthetic */ roj0 m4635Ki(final Envelope envelope) {
        this.f8580Q.m3422w3(envelope, null);
        this.f3930h1.put(Long.valueOf(mqi0.o()));
        this.f8580Q.f3598U.m13685a(new d30() { // from class: l.n48
            public final void call() {
                this.f17469a.m4623Ji(envelope);
            }
        });
        return roj0.a;
    }

    /* JADX INFO: renamed from: Kj */
    public final /* synthetic */ Double m4636Kj(Double d2, Envelope envelope) {
        this.f8580Q.m3422w3(envelope, null);
        return d2;
    }

    /* JADX INFO: renamed from: Kk */
    public final /* synthetic */ roj0 m4637Kk(final ConversationPatchRecord conversationPatchRecord, Envelope envelope) {
        this.f8580Q.m3422w3(envelope, new d30() { // from class: l.c68
            public final void call() {
                CoreModule.f1542k.f11204l.delete(((DbObject) conversationPatchRecord).id);
            }
        });
        return roj0.a;
    }

    /* JADX INFO: renamed from: Kl */
    public final /* synthetic */ Data m4638Kl(String str, final Envelope envelope) {
        final ArrayList arrayList = new ArrayList();
        final ArrayList arrayList2 = new ArrayList();
        StringBuilder sb = null;
        if (!vwb.J(envelope.getModuleData(CoreData.class).conversations)) {
            for (Conversation conversation : envelope.getModuleData(CoreData.class).conversations) {
                if (conversation != null) {
                    if (TEnum.equals(conversation.status, "deleted")) {
                        arrayList.add(conversation);
                    } else if (TEnum.equals(conversation.status, "dismissed")) {
                        arrayList2.add(conversation);
                    }
                    if (TEnum.equals(conversation.status, "dismissed") || TEnum.equals(conversation.status, "deleted")) {
                        if (sb == null) {
                            sb = new StringBuilder();
                        }
                        sb.append(conversation.otherUser);
                        sb.append(" ");
                        sb.append(conversation.createdTime);
                        sb.append(" ");
                        sb.append((NullChecker.a(conversation.status) && NullChecker.a(conversation.status.toString())) ? conversation.status.toString() : "status_null");
                        sb.append("\n");
                    }
                }
            }
        }
        if (NullChecker.a(sb)) {
            du2.a("conversations/" + str + "/refresh", sb.toString());
        }
        if (!vwb.J(envelope.getModuleData(CoreData.class).conversations)) {
            envelope.getModuleData(CoreData.class).conversations.removeAll(arrayList);
        }
        this.f8580Q.m3422w3(envelope, new d30() { // from class: l.px7
            public final void call() {
                this.f19402a.m4626Jl(arrayList, arrayList2, envelope);
            }
        });
        return envelope.data;
    }

    /* JADX INFO: renamed from: Km */
    public final /* synthetic */ rx.c m4639Km(Message message, boolean z, roj0 roj0Var) {
        return m4554Do(message.cid, ((DbObject) message).id, message, z ? "reported" : "ignored");
    }

    /* JADX INFO: renamed from: Kn */
    public rx.c<Message> m4640Kn(String str, String str2) {
        return m4652Ln(str, str2, false);
    }

    /* JADX INFO: renamed from: Ko */
    public void m4641Ko(final String str, final String str2) {
        this.f8580Q.now(new la20(new v9j() { // from class: l.du7
            public final Object call() {
                return C0154a.f3483P.auth().q(C0154a.m3130G("/official-accounts/" + str + "/menus/" + str2 + "/clicks")).l(utc0.create(Network.JSON, "")).b();
            }
        }).map(new w9j() { // from class: l.eu7
            public final Object call(Object obj) {
                return roj0.a;
            }
        }).compose(C0154a.m3182T2()));
    }

    /* JADX INFO: renamed from: Kp */
    public final boolean m4642Kp(Conversation conversation) {
        return "lovebuzz".equals(conversation.convType) && NullChecker.a(conversation.property) && "textBuzz".equals(conversation.property.intl_love_buzz.biz) && "passive".equals(conversation.property.intl_love_buzz.mode) && conversation.property.intl_love_buzz.expire - mqi0.o() > this.f3893V;
    }

    /* JADX INFO: renamed from: Le */
    public rx.c<roj0> m4643Le(final String str, final String str2, final String str3, final d30 d30Var) {
        return this.f8580Q.scheduled("messageRecall", -1, new v9j() { // from class: l.r88
            public final Object call() {
                return this.f20400a.m4825ai(str, str2, str3, d30Var);
            }
        });
    }

    /* JADX INFO: renamed from: Lf */
    public rx.c<roj0> m4644Lf(final String str) {
        return TextUtils.isEmpty(str) ? rx.c.just(roj0.a) : this.f8580Q.now(rx.c.fromCallable(new Callable() { // from class: l.w38
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f24905a.m5011pi(str);
            }
        }).compose(C0154a.m3182T2()));
    }

    /* JADX INFO: renamed from: Lg */
    public rx.c<Boolean> m4645Lg(String str) {
        return CoreModule.f1542k.f11195c.m26911l0(str).m().map(new w9j() { // from class: l.v98
            public final Object call(Object obj) {
                return Boolean.valueOf(!vwb.J((List) obj));
            }
        });
    }

    /* JADX INFO: renamed from: Lh */
    public final /* synthetic */ rx.c m4646Lh(final String str, final Act act) {
        Relationship relationship = new Relationship();
        relationship.state = RelationshipStatus.get("blocked");
        if (CoreModule.m1853N().so()) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(MatchFrom.get("relationUnion"));
            relationship.status = arrayList;
        }
        Conversation conversationM4786Xe = CoreModule.f1534c.f3631f0.m4786Xe(str);
        if (NullChecker.a(conversationM4786Xe) && TextUtils.equals("kankan", conversationM4786Xe.convType)) {
            relationship.scene = "kankan";
        }
        return C0185y.m6841l3(str, relationship).map(new w9j() { // from class: l.u38
            public final Object call(Object obj) {
                return this.f22447a.m4634Kh(str, act, (Envelope) obj);
            }
        }).compose(C0154a.m3182T2());
    }

    /* JADX INFO: renamed from: Li */
    public final /* synthetic */ rx.c m4647Li(final String str) {
        return ia20.m16571e(new v9j() { // from class: l.wz7
            public final Object call() {
                return C0154a.f3483P.auth().q(str).f().b();
            }
        }).map(new w9j() { // from class: l.xz7
            public final Object call(Object obj) {
                return this.f27814a.m4635Ki((Envelope) obj);
            }
        }).compose(C0154a.m3182T2());
    }

    /* JADX INFO: renamed from: Lj */
    public final /* synthetic */ Message m4648Lj(Message message, Envelope envelope) {
        this.f8580Q.m3422w3(envelope, null);
        return message;
    }

    /* JADX INFO: renamed from: Lk */
    public final /* synthetic */ rx.c m4649Lk(final ConversationPatchRecord conversationPatchRecord, final ConversationPatchRecord conversationPatchRecord2) {
        return conversationPatchRecord2 != null ? new la20(new v9j() { // from class: l.s28
            public final Object call() {
                return C0154a.f3483P.auth().q(C0154a.m3106A(((DbObject) conversationPatchRecord).id) + "&method=patch").l(utc0.create(Network.JSON, conversationPatchRecord2.createConversation().toJson())).b();
            }
        }).map(new w9j() { // from class: l.t28
            public final Object call(Object obj) {
                return this.f21835a.m4637Kk(conversationPatchRecord, (Envelope) obj);
            }
        }) : rx.c.empty();
    }

    /* JADX INFO: renamed from: Ll */
    public final /* synthetic */ rx.c m4650Ll(final String str) {
        return new la20(new v9j() { // from class: l.mv7
            public final Object call() {
                return C0154a.f3483P.auth().q(C0154a.m3297x(str)).f().b();
            }
        }).map(new w9j() { // from class: l.nv7
            public final Object call(Object obj) {
                return this.f17877a.m4638Kl(str, (Envelope) obj);
            }
        }).compose(C0154a.m3182T2());
    }

    /* JADX INFO: renamed from: Lm */
    public final /* synthetic */ rx.c m4651Lm(final Message message, final boolean z) {
        return rx.c.just(roj0.a).observeOn(Schedulers.io()).doOnNext(new e30() { // from class: l.o38
            public final void call(Object obj) {
                this.f17992a.m4627Jm(message, z, (roj0) obj);
            }
        }).flatMap(new w9j() { // from class: l.p38
            public final Object call(Object obj) {
                return this.f18574a.m4639Km(message, z, (roj0) obj);
            }
        });
    }

    /* JADX INFO: renamed from: Ln */
    public rx.c<Message> m4652Ln(String str, String str2, boolean z) {
        return m4676Nn(str, str2, z, false, null);
    }

    /* JADX INFO: renamed from: Lo */
    public rx.c<Sticker> m4653Lo(final List<Media> list, final String str) {
        return scheduled("sogou_gif", -1, new v9j() { // from class: l.z68
            public final Object call() {
                List list2 = list;
                return ia20.m16569c(new v9j() { // from class: l.m88
                    public final Object call() {
                        return C0166g.m4458vd(list2);
                    }
                }, SogouGifEnvelope.JSON_ADAPTER).map(new w9j() { // from class: l.n88
                    public final Object call(Object obj) {
                        return C0166g.m3975Ec(list2, str, (SogouGifEnvelope) obj);
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: Lp */
    public boolean m4654Lp() {
        return ((Boolean) this.f3846F1.get()).booleanValue();
    }

    /* JADX INFO: renamed from: Me */
    public jl6 m4655Me() {
        return CoreModule.f1542k.f11205m;
    }

    /* JADX INFO: renamed from: Mf */
    public rx.c<roj0> m4656Mf(final String str) {
        return TextUtils.isEmpty(str) ? rx.c.just(roj0.a) : this.f8580Q.now(rx.c.fromCallable(new Callable() { // from class: l.hb8
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f13780a.m5024qi(str);
            }
        }).compose(C0154a.m3182T2()));
    }

    /* JADX INFO: renamed from: Mg */
    public rx.c<Boolean> m4657Mg(String str) {
        return CoreModule.f1542k.f11195c.m26901b0(str).m().map(new w9j() { // from class: l.mp7
            public final Object call(Object obj) {
                return Boolean.valueOf(!vwb.J((List) obj));
            }
        });
    }

    /* JADX INFO: renamed from: Mi */
    public final /* synthetic */ q860 m4659Mi(Envelope envelope) {
        this.f8580Q.m3422w3(envelope, null);
        DbLinks dbLinksNew_ = DbLinks.new_();
        if (!TextUtils.isEmpty(envelope.pagination.links.next)) {
            dbLinksNew_.links.next = envelope.pagination.links.next;
        }
        return new q860(envelope.getModuleData(CoreData.class).conversations, dbLinksNew_);
    }

    /* JADX INFO: renamed from: Mj */
    public final /* synthetic */ rx.c m4660Mj(final String str, j760 j760Var) {
        final Message message = (Message) j760Var.a;
        final Double d2 = (Double) j760Var.b;
        if (message != null) {
            return new la20(new v9j() { // from class: l.r98
                public final Object call() {
                    return C0154a.f3483P.auth().q(C0154a.m3168Q0(str) + "&until=" + ((DbObject) message).id).d().b();
                }
            }).map(new w9j() { // from class: l.s98
                public final Object call(Object obj) {
                    return this.f21149a.m4648Lj(message, (Envelope) obj);
                }
            }).map(new w9j() { // from class: l.t98
                public final Object call(Object obj) {
                    return C0166g.m4067N5(d2, (Message) obj);
                }
            });
        }
        final Conversation conversation = new Conversation();
        ((DbObject) conversation).id = str;
        conversation.readUntil = "";
        return new la20(new v9j() { // from class: l.p98
            public final Object call() {
                Conversation conversation2 = conversation;
                return C0154a.f3483P.auth().q(C0154a.m3106A(((DbObject) conversation2).id) + "&method=patch").l(utc0.create(Network.JSON, conversation2.toJson())).b();
            }
        }).map(new w9j() { // from class: l.q98
            public final Object call(Object obj) {
                return this.f19676a.m4636Kj(d2, (Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: Mk */
    public final /* synthetic */ void m4661Mk(roj0 roj0Var) {
        m4541Co();
    }

    /* JADX INFO: renamed from: Ml */
    public final /* synthetic */ void m4662Ml(Runnable runnable, boolean z, Envelope envelope) {
        List list = envelope.getModuleData(CoreData.class).countdownLikes;
        if (!vwb.J(list)) {
            CountdownItem countdownItem = (CountdownItem) list.get(0);
            if (NullChecker.a(countdownItem) && !TextUtils.isEmpty(countdownItem.otherUserId) && countdownItem.expire > 0.0d) {
                this.f3857J0.put(countdownItem.otherUserId);
                long jLongValue = Double.valueOf(countdownItem.expire).longValue();
                this.f3854I0.put(Long.valueOf(jLongValue));
                m4531Ce("like sync");
                long jA = RemoteConfig.x().A("countdownLikeDuration");
                if (jA <= 0) {
                    jA = 86400;
                }
                this.f3851H0.put(Long.valueOf(jLongValue - (jA * 1000)));
                this.f3860K0.put(Boolean.valueOf(countdownItem.hidden));
            }
            if (NullChecker.a(runnable)) {
                runnable.run();
            }
        }
        if (z) {
            this.f3848G0.put(Boolean.TRUE);
        }
    }

    /* JADX INFO: renamed from: Mm */
    public final /* synthetic */ roj0 m4663Mm(final String str) throws Exception {
        final ConversationPatchRecord conversationPatchRecordQuery = CoreModule.f1542k.f11204l.query(str);
        if (conversationPatchRecordQuery != null) {
            this.f8580Q.f3598U.m13685a(new d30() { // from class: l.f98
                public final void call() {
                    C0166g.m4047L7(conversationPatchRecordQuery, str);
                }
            });
        }
        return roj0.a;
    }

    /* JADX INFO: renamed from: Mn */
    public rx.c<Message> m4664Mn(String str, String str2, boolean z, String str3) {
        return m4676Nn(str, str2, z, false, str3);
    }

    /* JADX INFO: renamed from: Mo */
    public Conversation m4665Mo(String str) {
        return CoreModule.f1542k.f11205m.query(str);
    }

    /* JADX INFO: renamed from: Mp */
    public final boolean m4666Mp(Conversation conversation, List<Message> list) {
        if (conversation == null || list == null) {
            return false;
        }
        if (!conversation.read.booleanValue()) {
            return true;
        }
        Message next = null;
        if (!vwb.J(list)) {
            int size = list.size();
            Iterator<Message> it = list.iterator();
            int i = -1;
            while (it.hasNext()) {
                i++;
                try {
                    next = it.next();
                } catch (NoSuchElementException unused) {
                    CrashHelper.c(new NoSuchElementException("ConversationItemView NoSuchElementException currentThread = " + Thread.currentThread().getName() + ",  userId = " + ((DbObject) CoreModule.m1851K().me_()).id + ",  conversation = " + ((DbObject) conversation).id + ",  oldSize = " + size + ",  currentSize = " + list.size() + ",  index = " + i + ",  list = " + list.toString()));
                }
                if (TEnum.equals(next.status(), "normal")) {
                }
            }
            return false;
        }
        return NullChecker.a(next) && !TextUtils.equals(conversation.readUntil, ((DbObject) next).id);
    }

    /* JADX INFO: renamed from: Ne */
    public rx.c<Conversation> m4667Ne(String str) {
        return CoreModule.f1542k.f11205m.uiGet(str).filter(new w9j() { // from class: l.kq7
            public final Object call(Object obj) {
                return Boolean.valueOf(((Conversation) obj) != null);
            }
        });
    }

    /* JADX INFO: renamed from: Nf */
    public void m4668Nf(String str) {
        Conversation conversationQuery = CoreModule.f1542k.f11205m.query(str);
        if (conversationQuery == null) {
            return;
        }
        List listQuery = CoreModule.f1542k.f11195c.query(Filter.AND(new Filter[]{Message.CID.EQ(str), Message.MESSAGETYPE.EQ("local_break_ice")}), ((OrderedColumn) Message.CREATEDTIME).ASC, 0);
        if (!vwb.J(listQuery)) {
            Iterator it = listQuery.iterator();
            while (it.hasNext()) {
                CoreModule.f1542k.f11195c.delete(((DbObject) ((Message) it.next())).id);
            }
        }
        conversationQuery.hasLocalBreakIce = false;
        CoreModule.f1542k.f11205m.upsert(conversationQuery);
    }

    /* JADX INFO: renamed from: Ng */
    public rx.c<List<Conversation>> m4669Ng() {
        return CoreModule.f1542k.f11205m.f15210C.m();
    }

    /* JADX INFO: renamed from: Nh */
    public final /* synthetic */ roj0 m4670Nh(final String str) throws Exception {
        this.f8580Q.f3598U.m13685a(new d30() { // from class: l.o78
            public final void call() {
                this.f18045a.m4658Mh(str);
            }
        });
        return roj0.a;
    }

    /* JADX INFO: renamed from: Ni */
    public final /* synthetic */ rx.c m4671Ni(final String str) {
        return ia20.m16571e(new v9j() { // from class: l.f28
            public final Object call() {
                return C0154a.f3483P.auth().q(str).f().b();
            }
        }).map(new w9j() { // from class: l.g28
            public final Object call(Object obj) {
                return this.f13029a.m4659Mi((Envelope) obj);
            }
        }).compose(C0154a.m3182T2());
    }

    /* JADX INFO: renamed from: Nj */
    public final /* synthetic */ void m4672Nj(String str) {
        DbLinks dbLinksM4677No = m4677No(str);
        if (NullChecker.a(dbLinksM4677No)) {
            dbLinksM4677No.links.next = null;
            CoreModule.f1542k.f11196d.upsert(dbLinksM4677No);
        }
        CoreModule.f1542k.f11195c.m26881H(str, Double.MAX_VALUE);
        m4748To(str, true, str);
    }

    /* JADX INFO: renamed from: Nk */
    public final /* synthetic */ void m4673Nk(ConversationPatchRecord conversationPatchRecord, Throwable th) {
        StringBuilder sb = new StringBuilder("recordid:");
        sb.append(((DbObject) conversationPatchRecord).id);
        sb.append(" errorMessage:");
        sb.append(NullChecker.a(th.getMessage()) ? th.getMessage() : "");
        du2.a("ConversationPatchDelete", sb.toString());
        m4593Go(th, ((DbObject) conversationPatchRecord).id);
        m5109wq(((DbObject) conversationPatchRecord).id);
    }

    /* JADX INFO: renamed from: Nl */
    public final /* synthetic */ void m4674Nl(Envelope envelope) {
        ChatProfile chatProfileNew_;
        if (!vwb.J(envelope.getModuleData(CoreData.class).chatProfiles)) {
            Iterator it = envelope.getModuleData(CoreData.class).chatProfiles.iterator();
            do {
                if (!it.hasNext()) {
                    chatProfileNew_ = null;
                    break;
                }
                chatProfileNew_ = (ChatProfile) it.next();
            } while (!TextUtils.equals(chatProfileNew_.userId, CoreModule.m1850H().userId()));
        } else {
            chatProfileNew_ = null;
            break;
        }
        if (chatProfileNew_ == null) {
            chatProfileNew_ = ChatProfile.new_();
        }
        this.f3833B0.onNext(chatProfileNew_);
        boolean zJ = vwb.J(envelope.getModuleData(CoreData.class).systemQuestions);
        rx.subjects.a<List<IceBreakingQuestion>> aVar = this.f3836C0;
        if (zJ) {
            aVar.onNext(Collections.EMPTY_LIST);
        } else {
            aVar.onNext(envelope.getModuleData(CoreData.class).systemQuestions);
        }
    }

    /* JADX INFO: renamed from: Nm */
    public final /* synthetic */ rx.c m4675Nm(final String str) {
        return rx.c.fromCallable(new Callable() { // from class: l.m68
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f16811a.m4663Mm(str);
            }
        }).compose(C0154a.m3182T2());
    }

    /* JADX INFO: renamed from: Nn */
    public rx.c<Message> m4676Nn(final String str, final String str2, final boolean z, final boolean z2, final String str3) {
        return this.f8580Q.scheduled("messageRefresh", -1, new v9j() { // from class: l.bt7
            public final Object call() {
                return this.f9076a.m5078uk(str, str2, z, str3, z2);
            }
        });
    }

    /* JADX INFO: renamed from: No */
    public DbLinks m4677No(String str) {
        return CoreModule.f1542k.f11196d.query(str);
    }

    /* JADX INFO: renamed from: Np */
    public void m4678Np(boolean z) {
        this.f3887T = Boolean.valueOf(z);
    }

    /* JADX INFO: renamed from: Oe */
    public final rx.c<q860<Conversation>> m4679Oe(orh0<Conversation>.a aVar) {
        return mkd0.r(aVar.m(), qib0.f19813k0.f23550c.uiGet("conversations"), new x9j() { // from class: l.fa8
            public final Object call(Object obj, Object obj2) {
                return this.f12614a.m4762Ve((List) obj, (DbLinks) obj2);
            }
        });
    }

    /* JADX INFO: renamed from: Of */
    public rx.c<roj0> m4680Of(final String str) {
        return this.f8580Q.now(rx.c.fromCallable(new Callable() { // from class: l.ea8
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f11027a.m5037ri(str);
            }
        }).compose(C0154a.m3182T2()));
    }

    /* JADX INFO: renamed from: Og */
    public final boolean m4681Og(String str, String str2, boolean z, int i) {
        if (!z) {
            return false;
        }
        Message messageNew_ = Message.new_();
        messageNew_.messageType = MessageType.get("local_normal_tips");
        messageNew_.cid = str;
        messageNew_.value = str2;
        messageNew_.localInConversation = true;
        long jO = mqi0.o();
        messageNew_.owner = CoreModule.m1850H().userId();
        messageNew_.createdTime = jO;
        messageNew_.localCreatedTime = jO;
        messageNew_.recalled = Boolean.FALSE;
        messageNew_.hostId = CoreModule.m1850H().userId();
        tpd0 tpd0Var = App.i;
        messageNew_.localCreatedSession = ((Integer) tpd0Var.get()).intValue();
        messageNew_.msgData = String.valueOf(i);
        ((DbObject) messageNew_).id = DbObject.GENERATE_UNIQUE_FAKE_ID(((Integer) tpd0Var.get()).intValue());
        CoreModule.f1534c.f3631f0.m4812Zg(messageNew_);
        return false;
    }

    /* JADX INFO: renamed from: Oh */
    public final /* synthetic */ rx.c m4682Oh(final String str) {
        return rx.c.fromCallable(new Callable() { // from class: l.k38
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f15575a.m4670Nh(str);
            }
        }).compose(C0154a.m3182T2());
    }

    /* JADX INFO: renamed from: Oi */
    public final /* synthetic */ q860 m4683Oi(Envelope envelope) {
        this.f8580Q.m3422w3(envelope, null);
        DbLinks dbLinksNew_ = DbLinks.new_();
        if (!TextUtils.isEmpty(envelope.pagination.links.next)) {
            dbLinksNew_.links.next = envelope.pagination.links.next;
        }
        return new q860(envelope.getModuleData(CoreData.class).conversations, dbLinksNew_);
    }

    /* JADX INFO: renamed from: Oj */
    public final /* synthetic */ roj0 m4684Oj(final String str, Double d2) {
        this.f8580Q.f3598U.m13685a(new d30() { // from class: l.m98
            public final void call() {
                this.f16868a.m4672Nj(str);
            }
        });
        return roj0.a;
    }

    /* JADX INFO: renamed from: Ok */
    public final /* synthetic */ rx.c m4685Ok(final ConversationPatchRecord conversationPatchRecord) {
        return rx.c.fromCallable(new Callable() { // from class: l.cz7
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f9938a.m4625Jk(conversationPatchRecord);
            }
        }).flatMap(new w9j() { // from class: l.dz7
            public final Object call(Object obj) {
                return this.f10662a.m4649Lk(conversationPatchRecord, (ConversationPatchRecord) obj);
            }
        }).compose(C0154a.m3182T2()).doOnNext(new e30() { // from class: l.fz7
            public final void call(Object obj) {
                this.f12991a.m4661Mk((roj0) obj);
            }
        }).doOnError(new e30() { // from class: l.gz7
            public final void call(Object obj) {
                this.f13598a.m4673Nk(conversationPatchRecord, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: renamed from: Ol */
    public final /* synthetic */ rx.c m4686Ol() {
        return ia20.m16567a(new v9j() { // from class: l.o08
            public final Object call() {
                return C0154a.f3483P.auth().q(C0154a.m3143J0("/chat-profiles")).b();
            }
        }).doOnNext(new e30() { // from class: l.p08
            public final void call(Object obj) {
                this.f18529a.m4674Nl((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: Om */
    public final /* synthetic */ void m4687Om(final String str) {
        this.f8580Q.f3598U.m13685a(new d30() { // from class: l.pu7
            public final void call() {
                C0166g.m4391pc(str);
            }
        });
    }

    /* JADX INFO: renamed from: On */
    public rx.c<roj0> m4688On(final String str, final String str2) {
        return this.f8580Q.scheduled("messageRefreshOnlyFeed" + str + str2, -1, new v9j() { // from class: l.l18
            public final Object call() {
                return this.f16174a.m5103wk(str, str2);
            }
        });
    }

    /* JADX INFO: renamed from: Oo */
    public Message m4689Oo(String str) {
        return CoreModule.f1542k.f11195c.queryCache(str);
    }

    /* JADX INFO: renamed from: Op */
    public rx.c<roj0> m4690Op(final String str) {
        return this.f8580Q.scheduled("conversation_recover_deleted", 0, new v9j() { // from class: l.jx7
            public final Object call() {
                return this.f15480a.m5054sm(str);
            }
        });
    }

    /* JADX INFO: renamed from: Pe */
    public rx.c<Integer> m4691Pe(String str) {
        return mkd0.r(CoreModule.f1542k.f11195c.m26906g0(str).m(), CoreModule.f1542k.f11195c.m26900a0(str).m(), new x9j() { // from class: l.z88
            public final Object call(Object obj, Object obj2) {
                return Integer.valueOf(((List) obj).size() + ((List) obj2).size());
            }
        }).throttleWithTimeout(300L, TimeUnit.MILLISECONDS);
    }

    /* JADX INFO: renamed from: Pf */
    public void m4692Pf(final String str, final String str2) {
        e51.y(new Runnable() { // from class: l.jp7
            @Override // java.lang.Runnable
            public final void run() {
                this.f15313a.m5050si(str, str2);
            }
        });
    }

    /* JADX INFO: renamed from: Pg */
    public void m4693Pg(final double d2) {
        e51.y(new Runnable() { // from class: l.uw7
            @Override // java.lang.Runnable
            public final void run() {
                this.f23776a.m4730Si(d2);
            }
        });
    }

    /* JADX INFO: renamed from: Ph */
    public final /* synthetic */ xaj0 m4694Ph(Boolean bool) {
        jl6 jl6Var = CoreModule.f1542k.f11205m;
        StringColumn stringColumn = Conversation.CONVTYPE;
        int iCount = jl6Var.count(stringColumn.EQ(CameraSticker.CATEGORY_DEFAULT_FILTER), -1);
        CounterVerification counterVerification = new CounterVerification();
        counterVerification.total = iCount;
        counterVerification.lastVerifyTime = ((Long) this.f8580Q.f3628e0.f19113x1.get()).longValue();
        List listQuery = CoreModule.f1542k.f11205m.query(stringColumn.EQ(CameraSticker.CATEGORY_DEFAULT_FILTER), ((OrderedColumn) Conversation.UPDATEDTIME).DESC, 1);
        if (!vwb.J(listQuery)) {
            counterVerification.latestUpdatedTime = ((Conversation) listQuery.get(0)).updatedTime;
        }
        final CoreData coreData = new CoreData();
        coreData.counterVerification = counterVerification;
        return xaj0.a((Envelope) new la20(new v9j() { // from class: l.sy7
            public final Object call() {
                return C0154a.f3483P.auth().q(C0154a.m3143J0("/counter-verifications")).l(utc0.create(Network.JSON, coreData.toJson())).b();
            }
        }).toBlocking().c((Object) null), Integer.valueOf(iCount), Double.valueOf(counterVerification.latestUpdatedTime));
    }

    /* JADX INFO: renamed from: Pi */
    public final /* synthetic */ rx.c m4695Pi(final String str) {
        return ia20.m16571e(new v9j() { // from class: l.x08
            public final Object call() {
                return C0154a.f3483P.auth().q(str).f().b();
            }
        }).map(new w9j() { // from class: l.y08
            public final Object call(Object obj) {
                return this.f27833a.m4683Oi((Envelope) obj);
            }
        }).compose(C0154a.m3182T2());
    }

    /* JADX INFO: renamed from: Pj */
    public final /* synthetic */ rx.c m4696Pj(final String str) {
        return rx.c.fromCallable(new Callable() { // from class: l.z78
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C0166g.m4463w7(str);
            }
        }).flatMap(new w9j() { // from class: l.a88
            public final Object call(Object obj) {
                return this.f8156a.m4660Mj(str, (j760) obj);
            }
        }).map(new w9j() { // from class: l.b88
            public final Object call(Object obj) {
                return this.f8770a.m4684Oj(str, (Double) obj);
            }
        }).compose(C0154a.m3182T2());
    }

    /* JADX INFO: renamed from: Pk */
    public final /* synthetic */ roj0 m4697Pk(Message message, Envelope envelope) {
        if (!vwb.J(envelope.getModuleData(CoreData.class).messages) && TextUtils.equals(((DbObject) ((Message) envelope.getModuleData(CoreData.class).messages.get(0))).id, ((DbObject) message).id)) {
            ((Message) envelope.getModuleData(CoreData.class).messages.get(0)).cid = message.cid;
        }
        this.f8580Q.m3422w3(envelope, null);
        return roj0.a;
    }

    /* JADX INFO: renamed from: Pl */
    public final /* synthetic */ roj0 m4698Pl(Envelope envelope) {
        this.f8580Q.m3422w3(envelope, null);
        return roj0.a;
    }

    /* JADX INFO: renamed from: Pm */
    public final /* synthetic */ void m4699Pm(long j, String str) {
        if (j != 0) {
            Message messageQuery = CoreModule.f1542k.f11195c.query(j);
            messageQuery.localCreatedSession = -((Integer) App.i.get()).intValue();
            messageQuery.localNotificationStatus = NotificationStatus.get("pending");
            CoreModule.f1542k.f11195c.updateBy_id(messageQuery);
            this.f8580Q.f3628e0.m21418X6(str, CameraSticker.CATEGORY_DEFAULT_FILTER, ConversationStatus.get("blocked"));
        }
    }

    /* JADX INFO: renamed from: Pn */
    public rx.c<List<Message>> m4700Pn() {
        return CoreModule.f1542k.f11195c.f25493n.m();
    }

    /* JADX INFO: renamed from: Po */
    public rx.c<roj0> m4701Po(final String str, final boolean z) {
        return this.f8580Q.scheduled("quickReplyLoveLetter" + str, -1, new v9j() { // from class: l.c18
            public final Object call() {
                return ia20.m16568b(new v9j() { // from class: l.m38
                    public final Object call() {
                        return C0166g.m4058M7(str, z);
                    }
                }, 0).map(new w9j() { // from class: l.n38
                    public final Object call(Object obj) {
                        return roj0.a;
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: Pp */
    public rx.c<String> m4702Pp() {
        return this.f3865L2;
    }

    /* JADX INFO: renamed from: Qe */
    public rx.c<ConversationCounter> m4703Qe() {
        return this.f3976w2.asObservable();
    }

    /* JADX INFO: renamed from: Qf */
    public void m4704Qf(final String str, final List<String> list) {
        if (TextUtils.isEmpty(str) || vwb.J(list)) {
            return;
        }
        e51.y(new Runnable() { // from class: l.kr7
            @Override // java.lang.Runnable
            public final void run() {
                this.f15968a.m5063ti(str, list);
            }
        });
    }

    /* JADX INFO: renamed from: Qg */
    public void m4705Qg(final String str, final double d2, final int i, final int i2) {
        e51.y(new Runnable() { // from class: l.j18
            @Override // java.lang.Runnable
            public final void run() {
                this.f14950a.m4754Ui(i2, str, i, d2);
            }
        });
    }

    /* JADX INFO: renamed from: Qh */
    public final /* synthetic */ void m4706Qh(xaj0 xaj0Var) {
        Envelope envelope = (Envelope) xaj0Var.a;
        if (envelope.getModuleData(CoreData.class).counterVerification.nextVerifyTime > 0.0d) {
            this.f8580Q.f3628e0.f19106w1.put(Long.valueOf((long) envelope.getModuleData(CoreData.class).counterVerification.nextVerifyTime));
        }
        this.f8580Q.f3628e0.f19113x1.put(Long.valueOf(mqi0.o()));
        if (envelope.getModuleData(CoreData.class).counterVerification.needSync) {
            CrashHelper.c(new Exception("Conversation Counter Error userId: " + CoreModule.m1850H().userId() + "\nlocalCounter: " + xaj0Var.b + "\nremoteCounter: " + envelope.getModuleData(CoreData.class).counterVerification.total + "\ncheckTime: " + xaj0Var.c));
        }
    }

    /* JADX INFO: renamed from: Qi */
    public final /* synthetic */ List m4707Qi(Envelope envelope) {
        this.f8580Q.m3422w3(envelope, null);
        List<User> list = envelope.getModuleData(CommonData.class).users;
        if (!vwb.J(list)) {
            this.f3890U.setLength(0);
            for (User user : list) {
                StringBuilder sb = this.f3890U;
                if (user == null) {
                    sb.append("null");
                } else {
                    sb.append(((DbObject) user).id);
                }
                this.f3890U.append(",");
            }
        }
        return envelope.getModuleData(CoreData.class).friends;
    }

    /* JADX INFO: renamed from: Qj */
    public final /* synthetic */ void m4708Qj(long j) {
        DbLinks dbLinksOj;
        Message messageQuery = CoreModule.f1542k.f11195c.query(j);
        if (messageQuery.moment != null && (dbLinksOj = CoreModule.m1853N().Oj(messageQuery.moment)) != null) {
            dbLinksOj.total--;
            CoreModule.m1853N().f6(dbLinksOj);
        }
        CoreModule.f1542k.f11195c.delete(j);
        m4736So(messageQuery.cid, false);
    }

    /* JADX INFO: renamed from: Qk */
    public final /* synthetic */ rx.c m4709Qk(final Message message) {
        return new la20((v9j<stc0>) new v9j() { // from class: l.m78
            public final Object call() {
                Message message2 = message;
                return C0154a.f3483P.auth().q(C0154a.m3172R0(message2.cid, ((DbObject) message2).id) + "&method=patch&action=updateLikeStatus").l(utc0.create(Network.JSON, message2.toJson())).b();
            }
        }, 0).map(new w9j() { // from class: l.n78
            public final Object call(Object obj) {
                return this.f17520a.m4697Pk(message, (Envelope) obj);
            }
        }).compose(C0154a.m3182T2());
    }

    /* JADX INFO: renamed from: Ql */
    public final /* synthetic */ rx.c m4710Ql(final String str) {
        return new la20(new v9j() { // from class: l.p68
            public final Object call() {
                return C0154a.f3483P.auth().q(C0154a.m3168Q0(str) + "&limit=10").f().b();
            }
        }).map(new w9j() { // from class: l.q68
            public final Object call(Object obj) {
                return this.f19645a.m4698Pl((Envelope) obj);
            }
        }).compose(C0154a.m3182T2());
    }

    /* JADX INFO: renamed from: Qm */
    public final /* synthetic */ void m4711Qm(Conversation conversation) {
        if (ura.m25555e().m25559d().m5664Nd(conversation)) {
            return;
        }
        this.f8580Q.f3628e0.m21418X6(conversation.otherUser, conversation.convType, conversation.status);
    }

    /* JADX INFO: renamed from: Qn */
    public int m4712Qn(String str) {
        return CoreModule.f1542k.f11195c.m26921v0(str);
    }

    /* JADX INFO: renamed from: Qo */
    public final Conversation m4713Qo(Message message) {
        Conversation conversationNew_ = Conversation.new_();
        ((DbObject) conversationNew_).id = message.cid;
        double d2 = message.createdTime;
        conversationNew_.createdTime = d2;
        conversationNew_.latestTime = d2;
        conversationNew_.localHasMessage = true;
        conversationNew_.localNotificationStatus = NotificationStatus.get("removed");
        conversationNew_.otherUser = message.cid;
        conversationNew_.read = Boolean.TRUE;
        conversationNew_.readUntil = "";
        conversationNew_.importance = StickStatus.get("normal");
        return conversationNew_;
    }

    /* JADX INFO: renamed from: Qp */
    public void m4714Qp() {
        if (!ura.m25555e().m25559d().m5701Vb()) {
            this.f3977x0 = !this.f3977x0;
        } else {
            hpd0 hpd0Var = this.f3980y0;
            hpd0Var.put(Boolean.valueOf(!((Boolean) hpd0Var.get()).booleanValue()));
        }
    }

    /* JADX INFO: renamed from: Re */
    public void m4715Re() {
        if (NullChecker.a(this.f3976w2.e())) {
            rx.subjects.a<ConversationCounter> aVar = this.f3976w2;
            aVar.onNext((ConversationCounter) aVar.e());
        }
    }

    /* JADX INFO: renamed from: Rf */
    public rx.c<roj0> m4716Rf(final String str, final List<Message> list) {
        return this.f8580Q.scheduled("users/me/chat-profiles/patch", -1, new v9j() { // from class: l.e08
            public final Object call() {
                return this.f10678a.m5101wi(list, str);
            }
        });
    }

    /* JADX INFO: renamed from: Rg */
    public void m4717Rg(final List<InsertConversationUser> list) {
        e51.y(new Runnable() { // from class: l.rv7
            @Override // java.lang.Runnable
            public final void run() {
                this.f20805a.m4778Wi(list);
            }
        });
    }

    /* JADX INFO: renamed from: Rh */
    public final /* synthetic */ Boolean m4718Rh(j760 j760Var) {
        return Boolean.valueOf(NullChecker.a(j760Var) && NullChecker.a(j760Var.a) && (this.f3880Q2 || ((CounterVerification) j760Var.a).needSync));
    }

    /* JADX INFO: renamed from: Ri */
    public final /* synthetic */ rx.c m4719Ri(final String str) {
        return new la20(new v9j() { // from class: l.x38
            public final Object call() {
                return C0154a.f3483P.auth().q(str).f().b();
            }
        }).map(new w9j() { // from class: l.y38
            public final Object call(Object obj) {
                return this.f27990a.m4707Qi((Envelope) obj);
            }
        }).compose(C0154a.m3182T2());
    }

    /* JADX INFO: renamed from: Rj */
    public final /* synthetic */ roj0 m4720Rj(final long j) throws Exception {
        this.f8580Q.f3598U.m13685a(new d30() { // from class: l.s88
            public final void call() {
                this.f21135a.m4708Qj(j);
            }
        });
        return roj0.a;
    }

    /* JADX INFO: renamed from: Rk */
    public final /* synthetic */ void m4721Rk(Envelope envelope) {
        this.f8580Q.m3422w3(envelope, null);
    }

    /* JADX INFO: renamed from: Rl */
    public final /* synthetic */ void m4722Rl(RunnableC0159c0.b bVar) {
        m4595He();
    }

    /* JADX INFO: renamed from: Rm */
    public final /* synthetic */ roj0 m4723Rm(Envelope envelope) {
        this.f8580Q.m3422w3(envelope, null);
        return roj0.a;
    }

    /* JADX INFO: renamed from: Rn */
    public int m4724Rn(String str) {
        return CoreModule.f1542k.f11195c.m26923x0(str);
    }

    /* JADX INFO: renamed from: Rp */
    public final void m4725Rp(String str) {
        List<String> listM17585e1 = CoreModule.f1542k.f11205m.m17585e1();
        listM17585e1.size();
        final JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("conversationIds", new JSONArray((Collection) listM17585e1));
            jSONObject.put("statuses", new JSONArray(ConversationStatus.JSON_ADAPTER.ARRAY_ADAPTER().serialize(vwb.f0(new ConversationStatus[]{ConversationStatus.get(CameraSticker.CATEGORY_DEFAULT_FILTER), ConversationStatus.get("blocked")}))));
            jSONObject.put("latestUpdatedTime", str);
        } catch (Exception e) {
            CrashHelper.c(e);
        }
        Envelope envelope = (Envelope) ia20.m16567a(new v9j() { // from class: l.z38
            public final Object call() {
                return C0154a.f3483P.auth().q(C0154a.m3141I2("/conversation-diffs")).l(utc0.create(Network.JSON, jSONObject.toString())).b();
            }
        }).toBlocking().c((Object) null);
        if (!NullChecker.a(envelope) || TextUtils.isEmpty(envelope.getModuleData(CoreData.class).conversationDiff.syncUrl)) {
            return;
        }
        Links linksNew_ = Links.new_();
        linksNew_.next = Links.normalizeUrl(envelope.getModuleData(CoreData.class).conversationDiff.syncUrl);
        m4737Sp(linksNew_);
    }

    /* JADX INFO: renamed from: Se */
    public ConversationCounter m4726Se() {
        return (ConversationCounter) this.f3976w2.e();
    }

    /* JADX INFO: renamed from: Sf */
    public void m4727Sf() {
        e51.y(new Runnable() { // from class: l.p28
            @Override // java.lang.Runnable
            public final void run() {
                this.f18560a.m5113xi();
            }
        });
    }

    /* JADX INFO: renamed from: Sg */
    public void m4728Sg(String str, double d2) {
        m4895gh(m5008pf(str, MessageType.get("local_intl_read_receipts_guide"), ""), true, d2);
    }

    /* JADX INFO: renamed from: Sh */
    public final /* synthetic */ void m4729Sh(j760 j760Var) {
        if (this.f3880Q2) {
            this.f8580Q.f3598U.m13685a(new d30() { // from class: l.z08
                public final void call() {
                    C0166g.m4371o3();
                }
            });
            m4725Rp((String) j760Var.b);
            this.f3880Q2 = false;
        } else if (!((CounterVerification) j760Var.a).syncAll) {
            m4725Rp((String) j760Var.b);
        } else {
            this.f8580Q.f3598U.m13685a(new d30() { // from class: l.a18
                public final void call() {
                    C0166g.m4472x4();
                }
            });
            m4580Fo();
        }
    }

    /* JADX INFO: renamed from: Si */
    public final /* synthetic */ void m4730Si(double d2) {
        this.f8580Q.f3598U.m13685a(new b(d2));
    }

    /* JADX INFO: renamed from: Sj */
    public final /* synthetic */ roj0 m4731Sj(final String str) throws Exception {
        this.f8580Q.f3598U.m13685a(new d30() { // from class: l.j08
            public final void call() {
                C0166g.m4355m9(str);
            }
        });
        return roj0.a;
    }

    /* JADX INFO: renamed from: Sk */
    public final /* synthetic */ j760 m4732Sk(String str, Envelope envelope) {
        return new j760(envelope.meta, !vwb.J(envelope.getModuleData(CoreData.class).conversations) ? (Conversation) envelope.getModuleData(CoreData.class).conversations.get(0) : this.f8580Q.f3631f0.m4665Mo(str));
    }

    /* JADX INFO: renamed from: Sl */
    public final /* synthetic */ void m4733Sl() {
        if (NullChecker.a(CoreModule.f1542k.f11205m.query("fake_conversation_fold_conversation"))) {
            this.f8580Q.f3598U.m13685a(new d30() { // from class: l.vs7
                public final void call() {
                    CoreModule.f1534c.f3631f0.m4558Ef("fake_conversation_fold_conversation");
                }
            });
        }
    }

    /* JADX INFO: renamed from: Sm */
    public final /* synthetic */ rx.c m4734Sm(final String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("isActor", true);
            jSONObject.put("type", "paid");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("compliment", jSONObject);
            final JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("additional", jSONObject2);
            return new la20(new v9j() { // from class: l.x68
                public final Object call() {
                    return C0154a.f3483P.auth().q(C0154a.m3149K2(str)).l(utc0.create(Network.JSON, jSONObject3.toString())).b();
                }
            }).map(new w9j() { // from class: l.y68
                public final Object call(Object obj) {
                    return this.f28057a.m4723Rm((Envelope) obj);
                }
            }).compose(C0154a.m3182T2());
        } catch (JSONException unused) {
            return rx.c.error(new RuntimeException("JSON构建失败"));
        }
    }

    /* JADX INFO: renamed from: Sn */
    public void m4735Sn(final List<String> list) {
        scheduled("messageUpdataCommonTipPat", 0, new v9j() { // from class: l.db8
            public final Object call() {
                return this.f10272a.m5128yk(list);
            }
        });
    }

    /* JADX INFO: renamed from: So */
    public final void m4736So(String str, boolean z) {
        boolean z2 = !CoreModule.f1542k.f11195c.m26896W(str).f();
        Conversation conversationM4665Mo = m4665Mo(str);
        if (conversationM4665Mo != null) {
            conversationM4665Mo.localHasMessage = z2;
            if (z) {
                conversationM4665Mo.read = Boolean.TRUE;
            }
            CoreModule.f1542k.f11205m.upsert(conversationM4665Mo);
        }
    }

    /* JADX INFO: renamed from: Sp */
    public final void m4737Sp(Links links) {
        String str;
        if (links == null || (str = links.next) == null) {
            return;
        }
        final String strM3217d = C0154a.m3217d(str);
        final Envelope envelope = (Envelope) ia20.m16567a(new v9j() { // from class: l.l58
            public final Object call() {
                return C0154a.f3483P.auth().q(strM3217d).f().b();
            }
        }).toBlocking().c((Object) null);
        if (NullChecker.a(envelope)) {
            this.f8580Q.m3422w3(envelope, new d30() { // from class: l.m58
                public final void call() {
                    this.f16801a.m5067tm(envelope);
                }
            });
            if (TextUtils.isEmpty(envelope.pagination.links.next)) {
                return;
            }
            rx.c.timer(100L, TimeUnit.MILLISECONDS).subscribe(mkd0.H(new e30() { // from class: l.n58
                public final void call(Object obj) {
                    this.f17498a.m5080um(envelope, (Long) obj);
                }
            }, new e30() { // from class: l.p58
                public final void call(Object obj) {
                    CrashHelper.c((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: Te */
    public rx.c<List<Conversation>> m4738Te() {
        return m4655Me().m17588h0(mqi0.o()).m();
    }

    /* JADX INFO: renamed from: Tf */
    public rx.c<roj0> m4739Tf(final String str) {
        return this.f8580Q.scheduled("conversation_delete_unmatch", -1, new v9j() { // from class: l.ly7
            public final Object call() {
                return this.f16708a.m4509Ai(str);
            }
        });
    }

    /* JADX INFO: renamed from: Tg */
    public void m4740Tg(final User user) {
        e51.y(new Runnable() { // from class: l.gq7
            @Override // java.lang.Runnable
            public final void run() {
                this.f13437a.m4790Xi(user);
            }
        });
    }

    /* JADX INFO: renamed from: Th */
    public final /* synthetic */ void m4741Th(User user, Conversation conversation) {
        String str = "fake_id_filter_veification" + ((DbObject) user).id;
        CoreModule.f1542k.f11195c.delete(Filter.AND(new Filter[]{Message.CID.EQ(((DbObject) user).id), Message.ID.EQ(str)}));
        if (user.isPicVerificationVerified() || TEnum.equals(conversation.status, "deleted") || TEnum.equals(conversation.status, "dismissed") || !this.f8580Q.f3628e0.m21453g8() || user.isBanedOrInactivated()) {
            return;
        }
        Message messageM4995of = this.f8580Q.f3631f0.m4995of(((DbObject) user).id, MessageType.get("common_tip"));
        ((DbObject) messageM4995of).id = str;
        messageM4995of.value = "你设置了只和认证用户聊天，他还未完成照片认证，你可以更改<a href = \"tantan://chat/receive_message_setting\">信息接收设置</a>";
        this.f8580Q.f3631f0.m4812Zg(messageM4995of);
    }

    /* JADX INFO: renamed from: Ti */
    public final /* synthetic */ void m4742Ti(int i, String str, int i2, double d2) {
        Conversation conversationQuery = CoreModule.f1542k.f11205m.query("fake_conversation_city_centre_enter");
        if (conversationQuery == null && i == 0) {
            return;
        }
        long jO = mqi0.o();
        if (conversationQuery == null) {
            conversationQuery = Conversation.new_();
            ((DbObject) conversationQuery).id = "fake_conversation_city_centre_enter";
            double d3 = jO;
            conversationQuery.createdTime = d3;
            conversationQuery.latestTime = d3;
            conversationQuery.convType = CameraSticker.CATEGORY_DEFAULT_FILTER;
            conversationQuery.localEverHasMessage = true;
            conversationQuery.localNotificationStatus = NotificationStatus.get("removed");
        }
        conversationQuery.otherUser = str;
        conversationQuery.unreadMessages = i2;
        if (i2 > 0) {
            conversationQuery.latestTime = d2;
        }
        CoreModule.f1534c.f3631f0.m4980mq(conversationQuery);
        this.f8580Q.f3639h2.f15278X.put(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: Tj */
    public final /* synthetic */ void m4743Tj(String str, Envelope envelope) {
        DbLinks dbLinksM4677No = m4677No(str);
        if (NullChecker.a(dbLinksM4677No)) {
            dbLinksM4677No.links.next = envelope.pagination.links.next;
            CoreModule.f1542k.f11196d.upsert(dbLinksM4677No);
        }
        for (Message message : envelope.getModuleData(CoreData.class).messages) {
            if (message != null) {
                message.localNotificationStatus = NotificationStatus.get("removed");
                message.cid = str;
                Audio audio = message.audio();
                if (audio != null) {
                    audio.audioRead = true;
                }
            }
        }
    }

    /* JADX INFO: renamed from: Tk */
    public final /* synthetic */ void m4744Tk(Envelope envelope) {
        this.f8580Q.m3422w3(envelope, null);
    }

    /* JADX INFO: renamed from: Tl */
    public final /* synthetic */ Boolean m4745Tl(String str) {
        return Boolean.valueOf(NullChecker.a(m4665Mo(str)));
    }

    /* JADX INFO: renamed from: Tm */
    public rx.c<List<Conversation>> m4746Tm() {
        return ((orh0.a) m4655Me().f15242v.b()).m();
    }

    /* JADX INFO: renamed from: Tn */
    public rx.c<q860<Message>> m4747Tn(String str) {
        return m4759Un(str, -1.0d);
    }

    /* JADX INFO: renamed from: To */
    public final void m4748To(String str, boolean z, String str2) {
        boolean zF = CoreModule.f1542k.f11195c.m26896W(str).f();
        boolean z2 = !zF;
        Conversation conversationM4665Mo = m4665Mo(str);
        if (conversationM4665Mo != null) {
            conversationM4665Mo.localHasMessage = z2;
            if (zF) {
                conversationM4665Mo.unreadMessages = 0;
            }
            if (z) {
                conversationM4665Mo.read = Boolean.TRUE;
            }
            conversationM4665Mo.clearedUntil = str2;
            conversationM4665Mo.localSafetyReminderTime = 0.0d;
            conversationM4665Mo.localSpoofingReminderTime = 0.0d;
            CoreModule.f1542k.f11205m.upsert(conversationM4665Mo);
        }
    }

    /* JADX INFO: renamed from: Tp */
    public rx.c<List<Conversation>> m4749Tp() {
        return ((orh0.a) CoreModule.f1542k.f11205m.f15235o.b()).m();
    }

    /* JADX INFO: renamed from: Ue */
    public rx.c<Conversation> m4750Ue(String str) {
        return CoreModule.f1542k.f11205m.uiGet(str);
    }

    /* JADX INFO: renamed from: Uf */
    public void m4751Uf() {
        n11.f();
        List listJ = CoreModule.f1542k.f11205m.f15215H.j();
        if (vwb.J(listJ)) {
            return;
        }
        ArrayList arrayList = new ArrayList(listJ);
        for (int i = 0; i < arrayList.size(); i++) {
            Conversation conversation = (Conversation) arrayList.get(i);
            conversation.level = 0;
            CoreModule.f1542k.f11205m.upsert(conversation);
        }
    }

    /* JADX INFO: renamed from: Ug */
    public void m4752Ug(String str, String str2) {
        m4772Vo(str, m4968me(str, str2));
    }

    /* JADX INFO: renamed from: Uh */
    public final /* synthetic */ void m4753Uh(Envelope envelope) {
        this.f3878Q0 = false;
        this.f3863L0.put(1);
        m4580Fo();
    }

    /* JADX INFO: renamed from: Ui */
    public final /* synthetic */ void m4754Ui(final int i, final String str, final int i2, final double d2) {
        this.f8580Q.f3598U.m13685a(new d30() { // from class: l.j38
            public final void call() {
                this.f14979a.m4742Ti(i, str, i2, d2);
            }
        });
    }

    /* JADX INFO: renamed from: Uj */
    public final /* synthetic */ roj0 m4755Uj(final String str, final Envelope envelope) {
        CoreModule.f1534c.f3637h0.m25600m3(envelope);
        this.f8580Q.m3422w3(envelope, new d30() { // from class: l.k18
            public final void call() {
                this.f15536a.m4743Tj(str, envelope);
            }
        });
        return roj0.a;
    }

    /* JADX INFO: renamed from: Uk */
    public final /* synthetic */ j760 m4756Uk(String str, Envelope envelope) {
        return new j760(envelope.meta, !vwb.J(envelope.getModuleData(CoreData.class).conversations) ? (Conversation) envelope.getModuleData(CoreData.class).conversations.get(0) : this.f8580Q.f3631f0.m4665Mo(str));
    }

    /* JADX INFO: renamed from: Ul */
    public final /* synthetic */ void m4757Ul(boolean z, String str) {
        m4558Ef(str);
        if (z) {
            if (TextUtils.equals(str, (CharSequence) this.f8580Q.f3652m0.f3378Y0.get())) {
                this.f8580Q.f3652m0.f3378Y0.clear();
            }
            if (TextUtils.equals(str, (CharSequence) this.f8580Q.f3652m0.f3381Z0.get())) {
                this.f8580Q.f3652m0.f3381Z0.clear();
            }
            if (TextUtils.equals(str, (CharSequence) this.f8580Q.f3652m0.f3384a1.get())) {
                this.f8580Q.f3652m0.f3384a1.clear();
            }
        }
    }

    /* JADX INFO: renamed from: Um */
    public List<Message> m4758Um(String str) {
        return CoreModule.f1542k.f11195c.m26893T(str);
    }

    /* JADX INFO: renamed from: Un */
    public rx.c<q860<Message>> m4759Un(String str, double d2) {
        Conversation conversationM5146zp = m5146zp(str);
        double d3 = NullChecker.a(conversationM5146zp) ? conversationM5146zp.clearedTime : 0.0d;
        if (TextUtils.equals(str, "-1") && d2 <= 0.0d && CoreModule.m1854P().m11706a().m5387Yd()) {
            d2 = CoreModule.m1854P().m11706a().m5477ls();
        }
        return d2 > 0.0d ? m4771Vn(str, Message.CREATEDTIME.REQ(Double.valueOf(d2)), String.valueOf(d2), d3, false) : mkd0.r(CoreModule.f1542k.f11195c.m26899Z(str, d3, false).m(), CoreModule.f1542k.f11196d.uiGet(str), new x9j() { // from class: l.k98
            public final Object call(Object obj, Object obj2) {
                return this.f15659a.m5141zk((List) obj, (DbLinks) obj2);
            }
        });
    }

    /* JADX INFO: renamed from: Uo */
    public List<Conversation> m4760Uo() {
        return CoreModule.f1542k.f11205m.m17593j1();
    }

    /* JADX INFO: renamed from: Up */
    public List<Message> m4761Up() {
        return CoreModule.f1542k.f11195c.m26922w0();
    }

    /* JADX INFO: renamed from: Ve */
    public final q860<Conversation> m4762Ve(List<Conversation> list, DbLinks dbLinks) {
        if (dbLinks == null) {
            m4580Fo();
        }
        return m12325Z2(list, dbLinks);
    }

    /* JADX INFO: renamed from: Vf */
    public void m4763Vf(final List<Conversation> list, final Set<String> set) {
        final JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        final HashSet hashSet = new HashSet();
        for (Conversation conversation : list) {
            jSONArray.put(((DbObject) conversation).id);
            hashSet.add(((DbObject) conversation).id);
        }
        try {
            jSONObject.put("ids", jSONArray);
            jSONObject.put("newLabelExposureTime", Converter.dateToApiTimeString(mqi0.o()));
        } catch (JSONException unused) {
        }
        this.f8580Q.scheduled("newMatchNewTag" + jSONObject, -1, new v9j() { // from class: l.d78
            public final Object call() {
                return this.f10043a.m4535Ci(jSONObject, list, set, hashSet);
            }
        });
    }

    /* JADX INFO: renamed from: Vg */
    public void m4764Vg(String str) {
        m4812Zg(m4995of(str, MessageType.get("local_birthday_tip")));
    }

    /* JADX INFO: renamed from: Vh */
    public final /* synthetic */ void m4765Vh(Throwable th) {
        this.f3863L0.put(-1);
    }

    /* JADX INFO: renamed from: Vi */
    public final /* synthetic */ void m4766Vi(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            InsertConversationUser insertConversationUser = (InsertConversationUser) it.next();
            Conversation conversation = (Conversation) CoreModule.f1542k.f11205m.query(insertConversationUser.userId);
            if (conversation == null) {
                Conversation conversationNew_ = Conversation.new_();
                String str = insertConversationUser.userId;
                ((DbObject) conversationNew_).id = str;
                conversationNew_.otherUser = str;
                conversationNew_.createdTime = insertConversationUser.timeStamp.longValue();
                conversationNew_.latestTime = insertConversationUser.timeStamp.longValue();
                conversationNew_.convType = "intlSeeChatRequest";
                conversationNew_.localEverHasMessage = true;
                m4980mq(conversationNew_);
            } else if (TextUtils.equals(conversation.convType, "intlSeeChatRequest")) {
                String str2 = insertConversationUser.userId;
                ((DbObject) conversation).id = str2;
                conversation.otherUser = str2;
                conversation.createdTime = insertConversationUser.timeStamp.longValue();
                conversation.latestTime = insertConversationUser.timeStamp.longValue();
                conversation.convType = "intlSeeChatRequest";
                conversation.localEverHasMessage = true;
                m4980mq(conversation);
            }
        }
    }

    /* JADX INFO: renamed from: Vj */
    public final /* synthetic */ rx.c m4767Vj(final String str, final String str2) {
        return new la20(new v9j() { // from class: l.yt7
            public final Object call() {
                return C0154a.f3483P.auth().q(C0154a.m3165P0(str, str2)).f().b();
            }
        }).map(new w9j() { // from class: l.zt7
            public final Object call(Object obj) {
                return this.f28970a.m4755Uj(str, (Envelope) obj);
            }
        }).compose(C0154a.m3182T2());
    }

    /* JADX INFO: renamed from: Vk */
    public final /* synthetic */ void m4768Vk(Envelope envelope) {
        this.f8580Q.m3422w3(envelope, null);
    }

    /* JADX INFO: renamed from: Vl */
    public final /* synthetic */ void m4769Vl(List list, final boolean z) {
        vwb.z(list, new e30() { // from class: l.yz7
            public final void call(Object obj) {
                this.f28509a.m4757Ul(z, (String) obj);
            }
        });
    }

    /* JADX INFO: renamed from: Vm */
    public rx.c<List<Conversation>> m4770Vm() {
        return CoreModule.f1542k.f11205m.m17604p0().m();
    }

    /* JADX INFO: renamed from: Vn */
    public final rx.c<q860<Message>> m4771Vn(String str, Filter<Message> filter, String str2, double d2, boolean z) {
        return mkd0.r(CoreModule.f1542k.f11195c.m26897X(str, filter, str2, d2, z).m(), CoreModule.f1542k.f11196d.uiGet(str), new x9j() { // from class: l.ix7
            public final Object call(Object obj, Object obj2) {
                return this.f14857a.m4511Ak((List) obj, (DbLinks) obj2);
            }
        });
    }

    /* JADX INFO: renamed from: Vo */
    public final rx.c<roj0> m4772Vo(final String str, final Message message) {
        return this.f8580Q.now(rx.c.fromCallable(new Callable() { // from class: l.d58
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f10016a.m4538Cl(str, message);
            }
        }).compose(C0154a.m3182T2()));
    }

    /* JADX INFO: renamed from: Vp */
    public rx.c<roj0> m4773Vp(final NotificationStatus notificationStatus, final NotificationStatus notificationStatus2, final String str) {
        return this.f8580Q.now(rx.c.fromCallable(new Callable() { // from class: l.gs7
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f13469a.m5105wm(notificationStatus, notificationStatus2, str);
            }
        }).compose(C0154a.m3182T2()));
    }

    /* JADX INFO: renamed from: We */
    public rx.c<List<Message>> m4774We(String str) {
        return CoreModule.f1542k.f11195c.m26907h0(str).m();
    }

    /* JADX INFO: renamed from: Wf */
    public rx.c<String> m4775Wf(final String str, final String str2, final String str3, final String str4, final Message message) {
        return scheduled("feedback/" + str + "/" + str2, -1, new v9j() { // from class: l.d08
            public final Object call() {
                return ia20.m16571e(new v9j() { // from class: l.z28
                    public final Object call() {
                        return C0166g.m4220ae(str, str, str, str);
                    }
                }).map(new w9j() { // from class: l.b38
                    public final Object call(Object obj) {
                        return C0166g.m4367na(message, (Envelope) obj);
                    }
                }).observeOn(jo0.a());
            }
        });
    }

    /* JADX INFO: renamed from: Wg */
    public void m4776Wg(String str, double d2) {
        Message messageNew_ = Message.new_();
        messageNew_.cid = str;
        tpd0 tpd0Var = App.i;
        ((DbObject) messageNew_).id = DbObject.GENERATE_UNIQUE_FAKE_ID(((Integer) tpd0Var.get()).intValue());
        messageNew_.messageType = MessageType.get("local_blindbox_guide");
        messageNew_.localCreatedTime = mqi0.o();
        messageNew_.createdTime = d2;
        messageNew_.localCreatedSession = ((Integer) tpd0Var.get()).intValue();
        messageNew_.localInConversation = true;
        messageNew_.owner = CoreModule.m1850H().userId();
        messageNew_.recalled = Boolean.FALSE;
        messageNew_.value = "";
        m4824ah(messageNew_, false);
    }

    /* JADX INFO: renamed from: Wh */
    public final /* synthetic */ void m4777Wh(String str) {
        Conversation conversationM4665Mo = this.f8580Q.f3631f0.m4665Mo(str);
        if (NullChecker.a(conversationM4665Mo)) {
            ConversationGame conversationGame = conversationM4665Mo.additional.game;
            if (NullChecker.a(conversationGame)) {
                conversationGame.gameUnread = 0;
                conversationGame.gameText = "";
                this.f8580Q.f3631f0.m4980mq(conversationM4665Mo);
            }
        }
    }

    /* JADX INFO: renamed from: Wi */
    public final /* synthetic */ void m4778Wi(final List list) {
        this.f8580Q.f3598U.m13685a(new d30() { // from class: l.g18
            public final void call() {
                this.f13018a.m4766Vi(list);
            }
        });
    }

    /* JADX INFO: renamed from: Wj */
    public final /* synthetic */ void m4779Wj(String str, boolean z, boolean z2, Message message, Sticker sticker, CoreProviderInterface coreProviderInterface) {
        DbLinks dbLinksOj;
        if (!CoreModule.m1850H().userId().equals(str) && z && m5112xh(str)) {
            Conversation conversationM4665Mo = m4665Mo(str);
            if (conversationM4665Mo == null && z2) {
                if (ura.m25555e().m25559d().m5745c() && m4677No(str) == null) {
                    DbLinks dbLinks = new DbLinks();
                    ((DbObject) dbLinks).id = message.cid;
                    dbLinks.links = Links.new_();
                    CoreModule.f1542k.f11196d.upsert(dbLinks);
                }
                conversationM4665Mo = m4713Qo(message);
            }
            if (NullChecker.a(conversationM4665Mo)) {
                conversationM4665Mo.latestTime = message.createdTime;
                conversationM4665Mo.localHasMessage = true;
                CoreModule.f1542k.f11205m.upsert(conversationM4665Mo);
            }
        }
        message.localCreatedSession = ((Integer) App.i.get()).intValue();
        message.localCreatedTime = System.nanoTime();
        if (message.moment != null && (dbLinksOj = CoreModule.m1853N().Oj(message.moment)) != null) {
            dbLinksOj.total++;
            CoreModule.m1853N().f6(dbLinksOj);
        }
        if (sticker != null) {
            CoreModule.f1542k.f11199g.insert(sticker);
        }
        CoreModule.f1542k.f11195c.insert(message);
        if (coreProviderInterface.m5784i()) {
            m4668Nf(str);
        }
        if (coreProviderInterface.m5892ym()) {
            m4908hi(str);
        }
    }

    /* JADX INFO: renamed from: Wk */
    public final /* synthetic */ rx.c m4780Wk(final boolean z, final String str, j760 j760Var) {
        final Message message = (Message) j760Var.a;
        final Double d2 = (Double) j760Var.b;
        return ia20.m16571e(new v9j() { // from class: l.u78
            public final Object call() {
                return C0166g.m4228ba(z, message, str);
            }
        }).doOnNext(new e30() { // from class: l.v78
            public final void call(Object obj) {
                this.f24171a.m4768Vk((Envelope) obj);
            }
        }).map(new w9j() { // from class: l.w78
            public final Object call(Object obj) {
                return C0166g.m4055M4(d2, (Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: Wl */
    public final /* synthetic */ void m4781Wl(List list, final boolean z) {
        final ArrayList arrayListN = vwb.n(list, new w9j() { // from class: l.cv7
            public final Object call(Object obj) {
                return this.f9868a.m4745Tl((String) obj);
            }
        });
        if (arrayListN.isEmpty()) {
            return;
        }
        this.f8580Q.f3598U.m13685a(new d30() { // from class: l.dv7
            public final void call() {
                this.f10607a.m4769Vl(arrayListN, z);
            }
        });
    }

    /* JADX INFO: renamed from: Wm */
    public final rx.c<roj0> m4782Wm(DbLinks dbLinks) {
        return m4794Xm(dbLinks, true);
    }

    /* JADX INFO: renamed from: Wn */
    public rx.c<q860<Message>> m4783Wn(String str, String str2) {
        return mkd0.r(CoreModule.f1542k.f11195c.m26898Y(str, str2).m(), CoreModule.f1542k.f11196d.uiGet(str), new x9j() { // from class: l.lr7
            public final Object call(Object obj, Object obj2) {
                return this.f16586a.m12325Z2((List) obj, (DbLinks) obj2);
            }
        });
    }

    /* JADX INFO: renamed from: Wo */
    public final rx.c<roj0> m4784Wo(final String str, final Message message) {
        return this.f8580Q.now(rx.c.fromCallable(new Callable() { // from class: l.sb8
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f21233a.m4564El(str, message);
            }
        }).compose(C0154a.m3182T2()));
    }

    /* JADX INFO: renamed from: Wp */
    public rx.c<roj0> m4785Wp(final NotificationStatus notificationStatus, final NotificationStatus notificationStatus2, final boolean z, final boolean z2) {
        return this.f8580Q.now(rx.c.fromCallable(new Callable() { // from class: l.jw7
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f15458a.m5093vm(z, notificationStatus, notificationStatus2, z2);
            }
        }).compose(C0154a.m3182T2()));
    }

    /* JADX INFO: renamed from: Xe */
    public Conversation m4786Xe(String str) {
        return CoreModule.f1542k.f11205m.queryCache(str);
    }

    /* JADX INFO: renamed from: Xf */
    public rx.c<List<UserLiveLabel>> m4787Xf(String str, String str2, String... strArr) {
        if (strArr == null || strArr.length == 0) {
            return rx.c.just(new ArrayList());
        }
        StringBuffer stringBuffer = new StringBuffer();
        if (strArr.length != 0) {
            stringBuffer.append(strArr[0]);
            for (int i = 1; i < strArr.length; i++) {
                stringBuffer.append(",");
                stringBuffer.append(strArr[i]);
            }
        }
        final JsonObject jsonObject = new JsonObject();
        try {
            jsonObject.addProperty("source", str2);
            jsonObject.addProperty("userIds", stringBuffer.toString());
        } catch (Exception unused) {
        }
        return this.f8580Q.scheduled("live-labels/" + str2 + "/" + str, 0, new v9j() { // from class: l.hs7
            public final Object call() {
                return ia20.m16567a(new v9j() { // from class: l.t08
                    public final Object call() {
                        return C0154a.f3483P.auth().q(C0154a.m3130G("/live-labels")).l(utc0.create(Network.JSON, jsonObject.toString())).b();
                    }
                });
            }
        }).map(new w9j() { // from class: l.js7
            public final Object call(Object obj) {
                return C0166g.m4334ka((Envelope) obj);
            }
        }).flatMap(new na8()).filter(new w9j() { // from class: l.ks7
            public final Object call(Object obj) {
                UserLiveLabel userLiveLabel = (UserLiveLabel) obj;
                return Boolean.valueOf((userLiveLabel.isLiveChat() && qib0.f19804b0.f17708c.Qc()) || (userLiveLabel.isVoiceChat() && qib0.f19804b0.f17708c.Zr()));
            }
        }).toList();
    }

    /* JADX INFO: renamed from: Xg */
    public void m4788Xg(String str, List<BreakIce> list) {
        if (vwb.J(list)) {
            return;
        }
        m4784Wo(str, m5059te(str, list));
    }

    /* JADX INFO: renamed from: Xh */
    public final /* synthetic */ void m4789Xh(final String str) {
        this.f8580Q.f3598U.m13685a(new d30() { // from class: l.u18
            public final void call() {
                this.f22419a.m4777Wh(str);
            }
        });
    }

    /* JADX INFO: renamed from: Xi */
    public final /* synthetic */ void m4790Xi(User user) {
        final Message messageNew_ = Message.new_();
        messageNew_.messageType = MessageType.get("live_vip_greet");
        messageNew_.cid = ura.m25555e().m25559d().m5777h();
        messageNew_.createdTime = mqi0.o();
        messageNew_.value = ura.m25555e().m25559d().m5900zt();
        messageNew_.owner = user == null ? CoreModule.m1850H().userId() : ((DbObject) user).id;
        ((DbObject) messageNew_).id = "fake_id_" + mqi0.n();
        messageNew_.localInConversation = true;
        messageNew_.recalled = Boolean.FALSE;
        messageNew_.localNotificationStatus = NotificationStatus.get("removed");
        messageNew_.localCreatedSession = ((Integer) App.i.get()).intValue();
        this.f8580Q.f3598U.m13685a(new d30() { // from class: l.vw7
            public final void call() {
                CoreModule.f1542k.f11195c.insert(messageNew_);
            }
        });
    }

    /* JADX INFO: renamed from: Xj */
    public final /* synthetic */ Message m4791Xj(final Message message, final String str, final boolean z, final boolean z2, final Sticker sticker, final CoreProviderInterface coreProviderInterface) throws Exception {
        Picture picture;
        if (((DbObject) message)._id != 0) {
            final Message messageClone = message.clone();
            messageClone.localCreatedSession = ((Integer) App.i.get()).intValue();
            this.f8580Q.f3598U.m13685a(new d30() { // from class: l.kv7
                public final void call() {
                    CoreModule.f1542k.f11195c.updateBy_id(messageClone);
                }
            });
            return messageClone;
        }
        Conversation conversationM4665Mo = m4665Mo(str);
        if (NullChecker.a(conversationM4665Mo) && ura.m25555e().m25559d().m5664Nd(conversationM4665Mo)) {
            message.api_only_otherUser = conversationM4665Mo.otherUser;
            message.channel = MessageChannel.get("group");
            message.hostId = conversationM4665Mo.otherUser;
        }
        List listJ = CoreModule.f1542k.f11195c.m26896W(str).j();
        message.createdTime = (vwb.J(listJ) || listJ.size() <= 0) ? C0154a.m3193W2() : C0154a.m3197X2(((Message) listJ.get(0)).createdTime);
        message.owner = CoreModule.m1850H().userId();
        message.localInConversation = !User.isTeamAccount(str) || message.moment == null;
        message.localInMoment = message.moment != null;
        message.cid = str;
        message.recalled = Boolean.FALSE;
        message.localNotificationStatus = NotificationStatus.get("removed");
        ((DbObject) message).id = DbObject.GENERATE_UNIQUE_FAKE_ID(((Integer) App.i.get()).intValue());
        if (message.value == null) {
            message.value = "";
        }
        List list = message.media;
        if (list != null && list.size() > 9) {
            message.media = message.media.subList(0, 9);
        }
        List<Picture> list2 = message.media;
        if (list2 != null) {
            for (Picture picture2 : list2) {
                TrackMediaUploadUtil.a0(picture2);
                if (TEnum.equals(((Media) picture2).status, "raw")) {
                    if (picture2 instanceof Video) {
                        Video video = (Video) picture2;
                        if (video.size == null || (picture = video.cover) == null || picture.size == null || ((Media) video).mediaType == null || ((Media) picture).mediaType == null) {
                            s5l0 s5l0Var = new s5l0(new r5l0(rhi.z(((Media) video).url)), false, false);
                            ((Media) video).mediaType = "video/mp4";
                            video.size = new Dimension(s5l0Var.m());
                            video.duration = s5l0Var.b;
                            if (video.cover == null) {
                                Picture pictureNew_ = Picture.new_();
                                pictureNew_.size = new Dimension(1, 1);
                                video.cover = pictureNew_;
                            }
                            Picture picture3 = video.cover;
                            ((Media) picture3).mediaType = "image/jpeg";
                            picture3.size = new Dimension(s5l0Var.k());
                            ((Media) video).status = MediaLocalStatus.get("raw");
                        }
                        if (!TextUtils.isEmpty(((Media) video).url) && ((Media) video).url.contains(k9j.I().getAbsolutePath())) {
                            try {
                                String[] strArrN = k9j.N(((Media) video).url, ((Media) video.cover()).url, k9j.c, ((DbObject) message).id, false);
                                ((Media) video).url = strArrN[0];
                                ((Media) video.cover()).url = strArrN[1];
                            } catch (Exception e) {
                                CrashHelper.c(e);
                            }
                        }
                    } else if (picture2 instanceof Audio) {
                        ((Media) picture2).status = MediaLocalStatus.get("preprocessed");
                    } else if (picture2 instanceof Picture) {
                        Picture picture4 = picture2;
                        if (picture4.size == null || ((Media) picture2).mediaType == null) {
                            pgm pgmVar = new pgm(rhi.z(((Media) picture2).url));
                            picture4.size = new Dimension(pgmVar.d);
                            ((Media) picture2).mediaType = pgmVar.c;
                        }
                    }
                }
            }
        } else {
            message.media = new ArrayList();
        }
        this.f8580Q.f3598U.m13685a(new d30() { // from class: l.jv7
            public final void call() {
                this.f15436a.m4779Wj(str, z, z2, message, sticker, coreProviderInterface);
            }
        });
        return message;
    }

    /* JADX INFO: renamed from: Xk */
    public final /* synthetic */ void m4792Xk(String str) {
        DbLinks dbLinksM4677No = m4677No(str);
        if (NullChecker.a(dbLinksM4677No)) {
            dbLinksM4677No.links.next = null;
            CoreModule.f1542k.f11196d.upsert(dbLinksM4677No);
        }
        CoreModule.f1542k.f11195c.m26881H(str, Double.MAX_VALUE);
    }

    /* JADX INFO: renamed from: Xl */
    public final /* synthetic */ roj0 m4793Xl(final MessageType messageType) throws Exception {
        this.f8580Q.f3598U.m13685a(new d30() { // from class: l.k08
            public final void call() {
                CoreModule.f1542k.f11195c.delete(Message.MESSAGETYPE.EQ(messageType));
            }
        });
        return roj0.a;
    }

    /* JADX INFO: renamed from: Xm */
    public final rx.c<roj0> m4794Xm(final DbLinks dbLinks, final boolean z) {
        return rx.c.fromCallable(new Callable() { // from class: l.k68
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f15623a.m4873ej(dbLinks, z);
            }
        });
    }

    /* JADX INFO: renamed from: Xn */
    public rx.c<q860<Message>> m4795Xn(String str) {
        return mkd0.r(CoreModule.f1542k.f11195c.m26910k0(str).m(), CoreModule.f1542k.f11196d.uiGet(str), new x9j() { // from class: l.bb8
            public final Object call(Object obj, Object obj2) {
                return this.f8803a.m4524Bk((List) obj, (DbLinks) obj2);
            }
        });
    }

    /* JADX INFO: renamed from: Xo */
    public rx.c<List<Message>> m4796Xo() {
        return CoreModule.f1542k.f11195c.f25492m.m();
    }

    /* JADX INFO: renamed from: Xp */
    public rx.c<roj0> m4797Xp(final NotificationStatus notificationStatus, final NotificationStatus notificationStatus2, final String str) {
        return this.f8580Q.now(rx.c.fromCallable(new Callable() { // from class: l.h78
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f13725a.m5117xm(notificationStatus, notificationStatus2, str);
            }
        }).compose(C0154a.m3182T2()));
    }

    /* JADX INFO: renamed from: Ye */
    public rx.c<q860<Conversation>> m4798Ye() {
        return m4679Oe(CoreModule.f1542k.f11205m.f15211D);
    }

    /* JADX INFO: renamed from: Yf */
    public void m4799Yf(mcr mcrVar) {
        if (!ura.m25555e().m25559d().m5739b() || mcrVar == null) {
            return;
        }
        if (this.f3841D2 <= mqi0.o() || ura.m25555e().m25559d().m5835p()) {
            this.f3841D2 = mqi0.o() + 30000;
            this.f3847F2.clear();
            final int i = 40;
            mcrVar.duringCreated(CoreModule.f1534c.f3631f0.m4890fo()).take(1).observeOn(jo0.a()).map(new w9j() { // from class: l.yp7
                public final Object call(Object obj) {
                    return ((q860) obj).a;
                }
            }).filter(new w9j() { // from class: l.zp7
                public final Object call(Object obj) {
                    return Boolean.valueOf(!vwb.J((List) obj));
                }
            }).flatMap(new na8()).filter(new oa8()).filter(new w9j() { // from class: l.aq7
                public final Object call(Object obj) {
                    return C0166g.m3970E7((Conversation) obj);
                }
            }).filter(new w9j() { // from class: l.bq7
                public final Object call(Object obj) {
                    return Boolean.valueOf(!User.isTeamAccount(((Conversation) obj).otherUser));
                }
            }).take(40).buffer(40).flatMap(new w9j() { // from class: l.cq7
                public final Object call(Object obj) {
                    return this.f9785a.m4548Di(i, (List) obj);
                }
            }).subscribe(mkd0.H(new e30() { // from class: l.dq7
                public final void call(Object obj) {
                    this.f10523a.m4561Ei((List) obj);
                }
            }, new e30() { // from class: l.eq7
                public final void call(Object obj) {
                    C0166g.m3943Bd((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: Yg */
    public void m4800Yg(String str, List<ChatAssistantQuestion> list) {
        if (vwb.J(list)) {
            return;
        }
        Message messageNew_ = Message.new_();
        messageNew_.messageType = MessageType.get("local_chat_assistant_question_new");
        messageNew_.cid = str;
        messageNew_.localInConversation = true;
        long jO = mqi0.o();
        messageNew_.owner = CoreModule.m1850H().userId();
        messageNew_.createdTime = jO;
        messageNew_.localCreatedTime = jO;
        messageNew_.recalled = Boolean.FALSE;
        messageNew_.hostId = CoreModule.m1850H().userId();
        tpd0 tpd0Var = App.i;
        messageNew_.localCreatedSession = ((Integer) tpd0Var.get()).intValue();
        ((DbObject) messageNew_).id = DbObject.GENERATE_UNIQUE_FAKE_ID(((Integer) tpd0Var.get()).intValue());
        MessageAdditionalData messageAdditionalDataNew_ = MessageAdditionalData.new_();
        messageNew_.additionalData = messageAdditionalDataNew_;
        messageAdditionalDataNew_.chatAssistantQuestions = list;
        messageNew_.value = "";
        m4812Zg(messageNew_);
    }

    /* JADX INFO: renamed from: Yh */
    public final /* synthetic */ void m4801Yh(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Conversation conversation = (Conversation) it.next();
            conversation.unreadMessages = 0;
            conversation.read = Boolean.TRUE;
            m4980mq(conversation);
        }
    }

    /* JADX INFO: renamed from: Yi */
    public final /* synthetic */ void m4802Yi(Message message, boolean z) {
        Objects.toString(message.messageType);
        m4883fh(message, z);
    }

    /* JADX INFO: renamed from: Yj */
    public final /* synthetic */ rx.c m4803Yj(final Message message, final String str, final boolean z, final boolean z2, final Sticker sticker, final CoreProviderInterface coreProviderInterface) {
        return rx.c.fromCallable(new Callable() { // from class: l.cb8
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f9566a.m4791Xj(message, str, z, z2, sticker, coreProviderInterface);
            }
        }).compose(qjd0.e(f3828b3));
    }

    /* JADX INFO: renamed from: Yk */
    public final /* synthetic */ roj0 m4804Yk(final String str, Double d2) {
        this.f8580Q.f3598U.m13685a(new d30() { // from class: l.q58
            public final void call() {
                this.f19634a.m4792Xk(str);
            }
        });
        return roj0.a;
    }

    /* JADX INFO: renamed from: Yl */
    public final /* synthetic */ void m4805Yl() {
        if (NullChecker.a(CoreModule.f1542k.f11205m.query("fake_conversation_weaken_conversation"))) {
            this.f8580Q.f3598U.m13685a(new d30() { // from class: l.mw7
                public final void call() {
                    CoreModule.f1534c.f3631f0.m4558Ef("fake_conversation_weaken_conversation");
                }
            });
        }
    }

    /* JADX INFO: renamed from: Ym */
    public final rx.c<roj0> m4806Ym() {
        return this.f8580Q.scheduled("conversations/get/only", 0, new v9j() { // from class: l.xx7
            public final Object call() {
                return this.f27773a.m4885fj();
            }
        });
    }

    /* JADX INFO: renamed from: Yn */
    public CoreMomentInfo m4807Yn(String str) {
        return CoreModule.m1853N().Oh(str, CoreMomentInfo.JSON_ADAPTER);
    }

    /* JADX INFO: renamed from: Yo */
    public rx.c<Message> m4808Yo(String str) {
        return CoreModule.f1542k.f11195c.m26918s0(str).m().map(new w9j() { // from class: l.o58
            public final Object call(Object obj) {
                return C0166g.m4068N6((List) obj);
            }
        });
    }

    /* JADX INFO: renamed from: Yp */
    public rx.subjects.a<List<IceBreakingQuestion>> m4809Yp() {
        return this.f3836C0;
    }

    /* JADX INFO: renamed from: Ze */
    public rx.c<q860<Conversation>> m4810Ze() {
        return m4679Oe(m4655Me().m17592j0());
    }

    /* JADX INFO: renamed from: Zf */
    public void m4811Zf(mcr mcrVar) {
        if (ura.m25555e().m25559d().m5739b() && mcrVar != null && ura.m25555e().m25559d().m5835p()) {
            this.f3850G2.clear();
            final int i = 40;
            mcrVar.duringCreated(CoreModule.f1534c.f3631f0.m4893gf()).take(1).observeOn(jo0.a()).filter(new w9j() { // from class: l.ma8
                public final Object call(Object obj) {
                    return Boolean.valueOf(!vwb.J((List) obj));
                }
            }).flatMap(new na8()).filter(new oa8()).filter(new w9j() { // from class: l.qa8
                public final Object call(Object obj) {
                    return Boolean.valueOf(TEnum.equals(((Conversation) obj).status, CameraSticker.CATEGORY_DEFAULT_FILTER));
                }
            }).filter(new w9j() { // from class: l.ra8
                public final Object call(Object obj) {
                    return Boolean.valueOf(!User.isTeamAccount(((Conversation) obj).otherUser));
                }
            }).take(40).buffer(40).flatMap(new w9j() { // from class: l.sa8
                public final Object call(Object obj) {
                    return this.f21168a.m4574Fi(i, (List) obj);
                }
            }).subscribe(mkd0.H(new e30() { // from class: l.ta8
                public final void call(Object obj) {
                    this.f21972a.m4587Gi((List) obj);
                }
            }, new e30() { // from class: l.ua8
                public final void call(Object obj) {
                    C0166g.m4049L9((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: Zg */
    public rx.c<roj0> m4812Zg(Message message) {
        return m4824ah(message, true);
    }

    /* JADX INFO: renamed from: Zh */
    public final /* synthetic */ roj0 m4813Zh(final String str, final d30 d30Var, Envelope envelope) {
        this.f8580Q.f3598U.m13685a(new d30() { // from class: l.ba8
            public final void call() {
                C0166g.m3992G7(str, d30Var);
            }
        });
        return roj0.a;
    }

    /* JADX INFO: renamed from: Zi */
    public final /* synthetic */ roj0 m4814Zi(final Message message, final boolean z) throws Exception {
        this.f8580Q.f3598U.m13685a(new d30() { // from class: l.ia8
            public final void call() {
                this.f14336a.m4802Yi(message, z);
            }
        });
        return roj0.a;
    }

    /* JADX INFO: renamed from: Zj */
    public final /* synthetic */ void m4815Zj(Message message, List list) {
        final Message messageClone = message.clone();
        if (!vwb.J(list) && list.get(0) != null && (list.get(0) instanceof Video) && TEnum.equals(((Media) list.get(0)).status, "preprocessed")) {
            try {
                String[] strArrN = k9j.N(((Media) list.get(0)).url, ((Media) ((Media) list.get(0)).cover()).url, k9j.c, ((DbObject) message).id, true);
                ((Media) list.get(0)).url = strArrN[0];
                ((Media) ((Media) list.get(0)).cover()).url = strArrN[1];
            } catch (Exception e) {
                CrashHelper.c(e);
            }
        }
        messageClone.media = list;
        this.f8580Q.f3598U.m13685a(new d30() { // from class: l.hv7
            public final void call() {
                CoreModule.f1542k.f11195c.updateBy_id(messageClone);
            }
        });
        if (vwb.J(message.media)) {
            return;
        }
        for (Media media : message.media) {
            if (media.url.startsWith("file") && media.url.endsWith(".copy")) {
                new File(rhi.z(media.url)).delete();
            }
        }
    }

    /* JADX INFO: renamed from: Zk */
    public final /* synthetic */ rx.c m4816Zk(final String str, final boolean z) {
        return rx.c.fromCallable(new Callable() { // from class: l.p48
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C0166g.m4080O7(str);
            }
        }).flatMap(new w9j() { // from class: l.q48
            public final Object call(Object obj) {
                return this.f19563a.m4780Wk(z, str, (j760) obj);
            }
        }).map(new w9j() { // from class: l.r48
            public final Object call(Object obj) {
                return this.f20288a.m4804Yk(str, (Double) obj);
            }
        }).compose(C0154a.m3182T2());
    }

    /* JADX INFO: renamed from: Zl */
    public final /* synthetic */ void m4817Zl() {
        this.f8580Q.f3598U.m13685a(new d30() { // from class: l.dx7
            public final void call() {
                this.f10636a.m4751Uf();
            }
        });
    }

    /* JADX INFO: renamed from: Zm, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final rx.c<roj0> m4999oj(final DbLinks dbLinks) {
        return this.f8580Q.scheduled("conversations/get", 0, new v9j() { // from class: l.tv7
            public final Object call() {
                return this.f22289a.m4909hj(dbLinks);
            }
        });
    }

    /* JADX INFO: renamed from: Zn */
    public rx.c<ChatProfile> m4819Zn() {
        return this.f3833B0.asObservable();
    }

    /* JADX INFO: renamed from: Zo */
    public rx.c<Message> m4820Zo(final String str, final String str2) {
        return mkd0.r(CoreModule.f1542k.f11195c.uiGet(str2), this.f3874O2.observeOn(jo0.a()), new x9j() { // from class: l.uz7
            public final Object call(Object obj, Object obj2) {
                return this.f23822a.m4577Fl(str2, (Message) obj, (roj0) obj2);
            }
        }).doOnNext(new e30() { // from class: l.vz7
            public final void call(Object obj) {
                this.f24548a.m4590Gl(str, str2, (Message) obj);
            }
        });
    }

    /* JADX INFO: renamed from: Zp */
    public rx.c<List<Conversation>> m4821Zp() {
        return ((orh0.a) CoreModule.f1542k.f11205m.f15231X.b()).m();
    }

    /* JADX INFO: renamed from: af */
    public j760<List<Conversation>, List<User>> m4822af(String str) {
        return CoreModule.f1542k.f11205m.m17587g1(str);
    }

    /* JADX INFO: renamed from: ag */
    public rx.c<AudioText> m4823ag(final String str, final String str2) {
        return scheduled("users/me/conversations/" + str + "/" + str2 + "/audioTexts", -1, new v9j() { // from class: l.cs7
            public final Object call() {
                return this.f9807a.m4611Ii(str, str2);
            }
        });
    }

    /* JADX INFO: renamed from: ah */
    public rx.c<roj0> m4824ah(final Message message, final boolean z) {
        return this.f8580Q.now(rx.c.fromCallable(new Callable() { // from class: l.qt7
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f20050a.m4814Zi(message, z);
            }
        }).compose(C0154a.m3182T2()));
    }

    /* JADX INFO: renamed from: ai */
    public final /* synthetic */ rx.c m4825ai(final String str, final String str2, final String str3, final d30 d30Var) {
        new Message().recalled = Boolean.TRUE;
        return new la20((v9j<stc0>) new v9j() { // from class: l.j98
            public final Object call() {
                return C0154a.f3483P.auth().q(C0154a.m3146K(str, str2, str3)).d().b();
            }
        }, 0).map(new w9j() { // from class: l.l98
            public final Object call(Object obj) {
                return this.f16276a.m4813Zh(str3, d30Var, (Envelope) obj);
            }
        }).compose(C0154a.m3182T2());
    }

    /* JADX INFO: renamed from: aj */
    public final /* synthetic */ Boolean m4826aj(String str) throws Exception {
        return Boolean.valueOf(m5112xh(str));
    }

    /* JADX INFO: renamed from: ak */
    public final /* synthetic */ Message m4827ak(Message message, List list) {
        final Message messageClone = message.clone();
        messageClone.media = list;
        this.f8580Q.f3598U.m13685a(new d30() { // from class: l.nw7
            public final void call() {
                CoreModule.f1542k.f11195c.updateBy_id(messageClone);
            }
        });
        return messageClone;
    }

    /* JADX INFO: renamed from: al */
    public final /* synthetic */ void m4828al(Envelope envelope) {
        this.f8580Q.m3422w3(envelope, null);
    }

    /* JADX INFO: renamed from: am */
    public final /* synthetic */ void m4829am(String str) {
        Conversation conversationM4665Mo = m4665Mo(str);
        if (NullChecker.a(conversationM4665Mo) && NullChecker.a(conversationM4665Mo.additional) && NullChecker.a(conversationM4665Mo.additional.pinChat) && conversationM4665Mo.level == 90 && conversationM4665Mo.additional.pinChat.expireTime <= mqi0.o()) {
            conversationM4665Mo.level = CoreModule.m1854P().m11710f().ba(str);
            m4980mq(conversationM4665Mo);
        }
    }

    /* JADX INFO: renamed from: an */
    public rx.c<roj0> m4830an(final String str) {
        final String str2;
        if (TextUtils.isEmpty(str)) {
            str2 = "/conversations?with=users,friends&search=loveLetterSuggested&filter=default&sort=latestMessageTime&limit=50";
        } else {
            str2 = "/conversations?with=users,friends&search=loveLetterSuggested&filter=default&sort=latestMessageTime&" + str;
        }
        return this.f8580Q.scheduled("loadLoveLetterUsers" + str, 0, new v9j() { // from class: l.st7
            public final Object call() {
                return this.f21642a.m4947kj(str2, str);
            }
        });
    }

    /* JADX INFO: renamed from: ao */
    public ChatProfile m4831ao() {
        return (ChatProfile) this.f3833B0.e();
    }

    /* JADX INFO: renamed from: ap */
    public rx.c<roj0> m4832ap(String str) {
        return m4844bp(str).map(new w9j() { // from class: l.pr7
            public final Object call(Object obj) {
                return roj0.a;
            }
        });
    }

    /* JADX INFO: renamed from: aq */
    public rx.c<q860<Conversation>> m4833aq(long j) {
        return m4679Oe(m4655Me().m17597l1(j));
    }

    /* JADX INFO: renamed from: bf */
    public rx.c<q860<Conversation>> m4834bf() {
        return m4679Oe((orh0.a) m4655Me().f15222O.b());
    }

    /* JADX INFO: renamed from: bg */
    public boolean m4835bg() {
        return ura.m25555e().m25559d().m5701Vb() ? ((Boolean) this.f3980y0.get()).booleanValue() : this.f3977x0;
    }

    /* JADX INFO: renamed from: bh */
    public rx.c<roj0> m4836bh(String str, MessageType messageType, String str2, e30<Message> e30Var) {
        Message messageM5008pf = m5008pf(str, messageType, str2);
        if (NullChecker.a(e30Var)) {
            e30Var.call(messageM5008pf);
        }
        return m4812Zg(messageM5008pf);
    }

    /* JADX INFO: renamed from: bi */
    public final /* synthetic */ q860 m4837bi(List list, DbLinks dbLinks) {
        if (dbLinks == null) {
            m4580Fo();
        }
        return m12325Z2(list, dbLinks);
    }

    /* JADX INFO: renamed from: bj */
    public final /* synthetic */ void m4838bj(boolean z, DbLinks dbLinks, Envelope envelope) {
        if (z) {
            qib0.f19813k0.f23550c.upsert(dbLinks);
            m5073uf(envelope, true);
        }
        m5147zq(envelope.getModuleData(CoreData.class).conversations);
    }

    /* JADX INFO: renamed from: bk */
    public final /* synthetic */ rx.c m4839bk(Message message, final Sticker sticker, Envelope envelope) {
        final Sticker sticker2;
        if (vwb.J(envelope.getModuleData(CoreData.class).stickers)) {
            CrashHelper.i(new Exception("return null sticker"), "core_send_sticker", CrashHelper.ReportLevel.p5, 100);
            sticker2 = null;
        } else {
            sticker2 = (Sticker) envelope.getModuleData(CoreData.class).stickers.get(0);
        }
        if (!NullChecker.a(sticker2)) {
            return rx.c.just(message);
        }
        final Message messageClone = message.clone();
        messageClone.sticker = ((DbObject) sticker2).id;
        this.f8580Q.f3598U.m13685a(new d30() { // from class: l.ss7
            public final void call() {
                C0166g.m4420s8(sticker, sticker2, messageClone);
            }
        });
        return rx.c.just(messageClone);
    }

    /* JADX INFO: renamed from: bl */
    public final /* synthetic */ rx.c m4840bl(final String str) {
        return ia20.m16571e(new v9j() { // from class: l.u88
            public final Object call() {
                return C0166g.m4146U6(str);
            }
        }).doOnNext(new e30() { // from class: l.v88
            public final void call(Object obj) {
                this.f24213a.m4828al((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: bm */
    public final /* synthetic */ void m4841bm(final String str) {
        this.f8580Q.f3598U.m13685a(new d30() { // from class: l.tw7
            public final void call() {
                this.f22302a.m4829am(str);
            }
        });
    }

    /* JADX INFO: renamed from: bn */
    public final rx.c<roj0> m4842bn(final DbLinks dbLinks) {
        return rx.c.fromCallable(new Callable() { // from class: l.ls7
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f16614a.m5038rj(dbLinks);
            }
        });
    }

    /* JADX INFO: renamed from: bo */
    public boolean m4843bo(User user, Conversation conversation) {
        return m4878eo(user, conversation, "");
    }

    /* JADX INFO: renamed from: bp */
    public rx.c<Data> m4844bp(final String str) {
        return this.f8580Q.scheduled("conversations/" + str + "/refresh", 0, new v9j() { // from class: l.pb8
            public final Object call() {
                return this.f18664a.m4650Ll(str);
            }
        });
    }

    /* JADX INFO: renamed from: bq */
    public List<Conversation> m4845bq() {
        return CoreModule.f1542k.f11205m.query(Filter.AND(new Filter[]{Conversation.SUGGESTIONSCORE.NEQ(Double.valueOf(0.0d)), Conversation.LOCALEVERHASMESSAGE.F()}), ((OrderedColumn) Conversation.LATESTTIME).DESC, -1);
    }

    /* JADX INFO: renamed from: cf */
    public rx.c<q860<Conversation>> m4846cf() {
        return mkd0.r(((orh0.a) CoreModule.f1542k.f11205m.f15220M.b()).m(), rx.c.just(DbLinks.new_()), new x9j() { // from class: l.ja8
            public final Object call(Object obj, Object obj2) {
                return this.f15084a.m4837bi((List) obj, (DbLinks) obj2);
            }
        });
    }

    /* JADX INFO: renamed from: cg */
    public hpd0 m4847cg() {
        if (this.f3956q0 == null) {
            boolean zM5654Li = ura.m25555e().m25559d().m5654Li();
            if (this.f3959r0 == null) {
                this.f3959r0 = new hpd0("conv_cell_weaken_fun_open" + CoreModule.m1850H().userId(), Boolean.valueOf(zM5654Li));
            }
            Boolean bool = (Boolean) this.f3959r0.get();
            bool.booleanValue();
            this.f3956q0 = new hpd0("conv_cell_weaken_fun_open_new" + CoreModule.m1850H().userId(), bool);
        }
        return this.f3956q0;
    }

    /* JADX INFO: renamed from: ch */
    public rx.c<roj0> m4848ch(String str, MessageType messageType, e30<Message> e30Var) {
        return m4836bh(str, messageType, "", e30Var);
    }

    /* JADX INFO: renamed from: ci */
    public final /* synthetic */ q860 m4849ci(List list, DbLinks dbLinks) {
        if (dbLinks == null) {
            m4580Fo();
        }
        return m12325Z2(list, dbLinks);
    }

    /* JADX INFO: renamed from: ck */
    public final /* synthetic */ rx.c m4851ck(final Map map, final Sticker sticker, Message message, final Message message2) {
        List list = message2.media;
        if (list != null && list.size() > 0) {
            return new lsx(message2.media, false).flatMap(new w9j() { // from class: l.sr7
                public final Object call(Object obj) {
                    return C0166g.m4213a7(message2, (List) obj);
                }
            }).doOnNext(new e30() { // from class: l.tr7
                public final void call(Object obj) {
                    this.f22243a.m4815Zj(message2, (List) obj);
                }
            }).last().flatMap(new w9j() { // from class: l.ur7
                public final Object call(Object obj) {
                    List list2 = (List) obj;
                    return ya5.m28130L(list2, "message", "chat", map, UploadSource.get("chat")).map(new w9j() { // from class: l.lw7
                        public final Object call(Object obj2) {
                            return C0166g.m4036K7(list2, message, (List) obj2);
                        }
                    });
                }
            }).map(new w9j() { // from class: l.vr7
                public final Object call(Object obj) {
                    return this.f24426a.m4827ak(message2, (List) obj);
                }
            });
        }
        if (sticker == null && (TextUtils.isEmpty(message.sticker) || message.sticker.indexOf("fake_id_") != 0)) {
            return rx.c.just(message2);
        }
        if (sticker == null) {
            sticker = (Sticker) CoreModule.f1542k.f11199g.query(message.sticker);
        }
        return new la20(new v9j() { // from class: l.wr7
            public final Object call() {
                Sticker sticker2 = sticker;
                return C0154a.f3483P.auth().q(C0154a.m3130G("/stickers")).l(utc0.create(Network.JSON, sticker2 == null ? "" : sticker2.toJson())).b();
            }
        }).flatMap(new w9j() { // from class: l.yr7
            public final Object call(Object obj) {
                return this.f28351a.m4839bk(message2, sticker, (Envelope) obj);
            }
        }).delay(TEnum.equals(sticker.source, "sogou") ? 500L : 0L, TimeUnit.MILLISECONDS);
    }

    /* JADX INFO: renamed from: cl */
    public final /* synthetic */ roj0 m4852cl(Envelope envelope) {
        if (!vwb.J(envelope.getModuleData(CoreData.class).chatProfiles)) {
            for (ChatProfile chatProfile : envelope.getModuleData(CoreData.class).chatProfiles) {
                if (TextUtils.equals(chatProfile.userId, CoreModule.m1850H().userId())) {
                    this.f3833B0.onNext(chatProfile);
                    break;
                }
            }
        }
        return roj0.a;
    }

    /* JADX INFO: renamed from: cm */
    public final /* synthetic */ void m4853cm(String str) {
        Conversation conversationM4665Mo = m4665Mo(str);
        if (NullChecker.a(conversationM4665Mo) && NullChecker.a(conversationM4665Mo.additional) && NullChecker.a(conversationM4665Mo.additional.tag) && conversationM4665Mo.level == 55 && conversationM4665Mo.additional.tag.expireTime * 1000 <= mqi0.o()) {
            conversationM4665Mo.level = 0;
            m4980mq(conversationM4665Mo);
        }
    }

    /* JADX INFO: renamed from: cn */
    public rx.c<roj0> m4854cn(final String str, final List<String> list, final String str2, final String str3, final int i) {
        clearRequests("loadNewMatchChat", 0);
        return this.f8580Q.scheduled("loadNewMatchChat", 0, new v9j() { // from class: l.pa8
            public final Object call() {
                return this.f18650a.m5077uj(str, str2, str3, list, i);
            }
        });
    }

    /* JADX INFO: renamed from: co */
    public boolean m4855co(User user, Conversation conversation) {
        return m4878eo(user, conversation, "birthday");
    }

    /* JADX INFO: renamed from: cp */
    public void m4856cp() {
    }

    /* JADX INFO: renamed from: cq */
    public rx.c<AudioText> m4857cq(final String str, final String str2) {
        return scheduled("users/me/conversations/" + str + "/" + str2 + "/audioTexts", -1, new v9j() { // from class: l.ut7
            public final Object call() {
                return this.f23734a.m5143zm(str, str2);
            }
        });
    }

    /* JADX INFO: renamed from: df */
    public rx.c<q860<Conversation>> m4858df() {
        return mkd0.r(((orh0.a) CoreModule.f1542k.f11205m.f15232Y.b()).m(), rx.c.just(DbLinks.new_()), new x9j() { // from class: l.eb8
            public final Object call(Object obj, Object obj2) {
                return this.f11038a.m4849ci((List) obj, (DbLinks) obj2);
            }
        });
    }

    /* JADX INFO: renamed from: dg */
    public List<Conversation> m4859dg(boolean z) {
        List<Conversation> list = z ? (List) this.f3859J2.e() : (List) this.f3862K2.e();
        return list == null ? new ArrayList() : list;
    }

    /* JADX INFO: renamed from: dh */
    public void m4860dh(String str, MessageType messageType) {
        m4848ch(str, messageType, null);
    }

    /* JADX INFO: renamed from: di */
    public final /* synthetic */ void m4861di(Conversation conversation, String str) {
        m4540Cn(((DbObject) conversation).id, str);
    }

    /* JADX INFO: renamed from: dk */
    public final /* synthetic */ void m4863dk(Message message, AtomicBoolean atomicBoolean) {
        if (((DbObject) message)._id != 0) {
            atomicBoolean.set(true);
            CoreModule.f1542k.f11195c.delete(((DbObject) message)._id);
        }
        if (TextUtils.isEmpty(message.cid)) {
            return;
        }
        Conversation conversationM4665Mo = m4665Mo(message.cid);
        if (CoreModule.f1542k.f11195c.m26896W(message.cid).e() == 0 && NullChecker.a(conversationM4665Mo) && !conversationM4665Mo.isForceDropDownCell()) {
            conversationM4665Mo.localHasMessage = false;
            if (TextUtils.isEmpty(conversationM4665Mo.clearedUntil) || "0".equals(conversationM4665Mo.clearedUntil)) {
                conversationM4665Mo.localEverHasMessage = false;
            }
            CoreModule.f1542k.f11205m.upsert(conversationM4665Mo);
        }
    }

    /* JADX INFO: renamed from: dl */
    public final /* synthetic */ rx.c m4864dl(final JSONObject jSONObject) {
        return NullChecker.a(jSONObject) ? ia20.m16567a(new v9j() { // from class: l.h98
            public final Object call() {
                return C0154a.f3483P.auth().q(C0154a.m3143J0("/chat-profiles") + "?method=patch").l(utc0.create(Network.JSON, jSONObject.toString())).b();
            }
        }).map(new w9j() { // from class: l.i98
            public final Object call(Object obj) {
                return this.f14320a.m4852cl((Envelope) obj);
            }
        }) : rx.c.empty();
    }

    /* JADX INFO: renamed from: dm */
    public final /* synthetic */ void m4865dm(final String str) {
        this.f8580Q.f3598U.m13685a(new d30() { // from class: l.kt7
            public final void call() {
                this.f15989a.m4853cm(str);
            }
        });
    }

    /* JADX INFO: renamed from: dn, reason: merged with bridge method [inline-methods] */
    public rx.c<roj0> m5140zj(final String str) {
        return this.f8580Q.scheduled("group_message_pre_load/" + str, 0, new v9j() { // from class: l.bs7
            public final Object call() {
                return this.f9063a.m5102wj(str);
            }
        });
    }

    /* JADX INFO: renamed from: dp */
    public void m4867dp(Runnable runnable) {
        m4879ep(runnable, true);
    }

    /* JADX INFO: renamed from: dq */
    public void m4868dq(double d2) {
        this.f3985z2.onNext(Double.valueOf(d2));
    }

    /* JADX INFO: renamed from: ef */
    public rx.c<q860<Conversation>> m4869ef() {
        return m4679Oe((orh0.a) m4655Me().f15219L.b());
    }

    /* JADX INFO: renamed from: eg */
    public long m4870eg() {
        return ((Long) this.f8580Q.f3631f0.f3936j1.get()).longValue();
    }

    /* JADX INFO: renamed from: eh */
    public void m4871eh(Message message) {
        m4883fh(message, true);
    }

    /* JADX INFO: renamed from: ei */
    public final /* synthetic */ void m4872ei(final String str) {
        this.f8580Q.f3598U.m13685a(new d30() { // from class: l.az7
            public final void call() {
                C0166g.m4190Y6(str);
            }
        });
    }

    /* JADX INFO: renamed from: ej */
    public final /* synthetic */ roj0 m4873ej(final DbLinks dbLinks, final boolean z) throws Exception {
        final String strM3301y = C0154a.m3301y(dbLinks.links.next);
        final Envelope envelope = (Envelope) new la20(new v9j() { // from class: l.ws7
            public final Object call() {
                return C0154a.f3483P.auth().q(strM3301y).f().b();
            }
        }).toBlocking().c((Object) null);
        CoreModule.f1534c.f3637h0.m25600m3(envelope);
        Links links = dbLinks.links;
        if (links.previous == null) {
            links.previous = envelope.pagination.links.previous;
        }
        links.next = envelope.pagination.links.next;
        if (ura.m25555e().m25559d().m5806ka() && z) {
            wf6.d(dbLinks, envelope);
        } else {
            if (wf6.f()) {
                wf6.b(envelope, strM3301y, true);
            }
            this.f8580Q.m3422w3(envelope, new d30() { // from class: l.xs7
                public final void call() {
                    this.f27700a.m4838bj(z, dbLinks, envelope);
                }
            });
        }
        this.f3973v2.put(Long.valueOf(qib0.f19784H.guessedCurrentServerTime()));
        if (dbLinks.links.next != null && z) {
            if (ura.m25555e().m25559d().m5806ka()) {
                e51.H(CoreModule.f1533b, new Runnable() { // from class: l.ys7
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f28366a.m4850cj(dbLinks);
                    }
                }, Math.max(wf6.h(), f3827a3));
                int i = f3827a3;
                if (i > 0) {
                    f3827a3 = i - 200;
                }
            } else {
                e51.H(CoreModule.f1533b, new Runnable() { // from class: l.zs7
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f28953a.m4862dj(dbLinks);
                    }
                }, f3827a3);
                int i2 = f3827a3;
                if (i2 > 100) {
                    f3827a3 = i2 - 200;
                }
                if (f3827a3 < 100) {
                    f3827a3 = 100;
                }
            }
        }
        this.f3970u2.put(Integer.valueOf(qib0.f19823t));
        return roj0.a;
    }

    /* JADX INFO: renamed from: ek */
    public final /* synthetic */ void m4874ek(Message message, TantanException.Client.TantanForbidden tantanForbidden) {
        if (TextUtils.isEmpty(message.cid)) {
            return;
        }
        du2.a("TantanForbiddenConversation", "messageid:" + ((DbObject) message)._id + " errorCode:" + tantanForbidden.code);
        m4658Mh(message.cid);
    }

    /* JADX INFO: renamed from: el */
    public final /* synthetic */ rx.c m4875el(final List list) {
        return rx.c.fromCallable(new Callable() { // from class: l.b78
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C0166g.m4389pa(list);
            }
        }).flatMap(new w9j() { // from class: l.c78
            public final Object call(Object obj) {
                return this.f9471a.m4864dl((JSONObject) obj);
            }
        });
    }

    /* JADX INFO: renamed from: em */
    public final /* synthetic */ void m4876em(final Conversation conversation, final boolean z) {
        this.f8580Q.f3598U.m13685a(new d30() { // from class: l.aa8
            public final void call() {
                C0166g.m4258e4(conversation, z);
            }
        });
    }

    /* JADX INFO: renamed from: en, reason: merged with bridge method [inline-methods] */
    public rx.c<roj0> m5090vj(final String str, final String str2) {
        C0158c c0158c = this.f8580Q;
        if (str == null) {
            return c0158c.just();
        }
        return c0158c.scheduled("conversations/" + str2 + "/previous", 0, new v9j() { // from class: l.fy7
            public final Object call() {
                return this.f12969a.m4523Bj(str2, str);
            }
        });
    }

    /* JADX INFO: renamed from: eo */
    public final boolean m4878eo(User user, Conversation conversation, String str) {
        ConversationAdditional conversationAdditional;
        ConversationAdditionalTag conversationAdditionalTag;
        return (!ura.m25555e().m25559d().m5827o() || conversation == null || user == null || this.f8580Q.f3628e0.m21333Aa(user) || user.isBanned() || user.isBannedNew() || user.isJailed() || user.inactivated || user.isFakeUser() || !TEnum.equals(conversation.status, CameraSticker.CATEGORY_DEFAULT_FILTER) || this.f3940k2.size() >= ura.m25555e().m25559d().m5685Ro() || (conversationAdditional = conversation.additional) == null || (conversationAdditionalTag = conversationAdditional.tag) == null || conversationAdditionalTag.type == null || (TextUtils.isEmpty(str) && TEnum.equals(conversation.additional.tag.type, "unknown_")) || ((!TextUtils.isEmpty(str) && !TEnum.equals(conversation.additional.tag.type, str)) || (conversation.additional.tag.expireTime > 0 && mqi0.o() > conversation.additional.tag.expireTime * 1000))) ? false : true;
    }

    /* JADX INFO: renamed from: ep */
    public void m4879ep(final Runnable runnable, final boolean z) {
        User userM21490p9 = CoreModule.f1534c.f3628e0.m21490p9();
        if (userM21490p9 != null && !userM21490p9.isFemale() && (!z || !((Boolean) this.f3848G0.get()).booleanValue())) {
            scheduled("conversation/countdown/like/refresh", 0, new v9j() { // from class: l.ov7
                public final Object call() {
                    return ia20.m16567a(new v9j() { // from class: l.u08
                        public final Object call() {
                            return C0154a.f3483P.auth().q(C0154a.m3143J0("/countdown-likes?filter=latest")).f().b();
                        }
                    });
                }
            }).subscribe(new e30() { // from class: l.pv7
                public final void call(Object obj) {
                    this.f19371a.m4662Ml(runnable, z, (Envelope) obj);
                }
            }, new e30() { // from class: l.qv7
                public final void call(Object obj) {
                    C0166g.m4336kc((Throwable) obj);
                }
            });
        } else if (NullChecker.a(runnable)) {
            runnable.run();
        }
    }

    /* JADX INFO: renamed from: eq */
    public rx.c<List<Conversation>> m4880eq() {
        return CoreModule.f1542k.f11205m.m17599m1(100).m();
    }

    /* JADX INFO: renamed from: ff */
    public rx.c<List<Conversation>> m4881ff() {
        return ((orh0.a) m4655Me().f15224Q.b()).m();
    }

    /* JADX INFO: renamed from: fg */
    public rx.c<roj0> m4882fg() {
        final String strM27254m = xh5.m27254m("search=exposure&with=users");
        return this.f8580Q.scheduled("conversations/get/exposure", 0, new v9j() { // from class: l.us7
            public final Object call() {
                return this.f23726a.m4647Li(strM27254m);
            }
        });
    }

    /* JADX INFO: renamed from: fh */
    public final void m4883fh(Message message, boolean z) {
        m4895gh(message, z, 0.0d);
    }

    /* JADX INFO: renamed from: fi */
    public final /* synthetic */ void m4884fi() {
        this.f8580Q.f3598U.m13685a(new d30() { // from class: l.ka8
            public final void call() {
                CoreModule.f1534c.f3631f0.m4558Ef("fake_conversation_surprise_gift_box");
            }
        });
    }

    /* JADX INFO: renamed from: fj */
    public final /* synthetic */ rx.c m4885fj() {
        DbLinks dbLinksNew_ = DbLinks.new_();
        ((DbObject) dbLinksNew_).id = "conversations";
        dbLinksNew_.links.next = C0154a.f3475H;
        return m4794Xm(dbLinksNew_, false).compose(mkd0.C());
    }

    /* JADX WARN: Code duplicated, block: B:88:0x01b6  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: fk */
    public final /* synthetic */ void m4886fk(String str, final Message message, final CoreProviderInterface coreProviderInterface, boolean z, String str2, long j, final Throwable th) {
        String str3;
        String str4;
        int i;
        final boolean z2 = false;
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.f3896W.onNext(th);
        boolean z3 = th instanceof TantanException.Client.TantanForbidden;
        if (z3 && ((TantanException.Client.TantanForbidden) th).code == 40344) {
            ChatHeatActionData chatHeatActionData = new ChatHeatActionData(str, ChatHeatActionData.ExclusiveAction.CHECK, false, new j760[0]);
            chatHeatActionData.setThrowable(th);
            CoreModule.f1534c.f3575M1.f28284S.onNext(chatHeatActionData);
            m5085ve(message, 0, null);
            return;
        }
        if (z3 && ((TantanException.Client.TantanForbidden) th).code == 40338) {
            m5085ve(message, 6, null);
            this.f8580Q.f3560H1.f24766R.onNext(message);
            return;
        }
        if (z3 && ((TantanException.Client.TantanForbidden) th).code == 40337) {
            m5085ve(message, 5, null);
            return;
        }
        if (z3 && ((TantanException.Client.TantanForbidden) th).code == 40342) {
            m5085ve(message, 7, new e30() { // from class: l.tq7
                public final void call(Object obj) {
                    ((Message) obj).localExtraInfo = ((TantanException.Client.TantanForbidden) th).message;
                }
            });
            return;
        }
        if (z3 && ((TantanException.Client.TantanForbidden) th).code == 40345) {
            m5085ve(message, 9, new e30() { // from class: l.vq7
                public final void call(Object obj) {
                    ((Message) obj).localExtraInfo = ((TantanException.Client.TantanForbidden) th).message;
                }
            });
            return;
        }
        e51.M(new Runnable() { // from class: l.wq7
            @Override // java.lang.Runnable
            public final void run() {
                coreProviderInterface.m5748d(th);
            }
        });
        boolean zM4681Og = true;
        if (!(th instanceof TantanException.Client.CoreService)) {
            if (z3) {
                final TantanException.Client.TantanForbidden tantanForbidden = (TantanException.Client.TantanForbidden) th;
                str3 = "" + tantanForbidden.code;
                if (tantanForbidden.code == 40346) {
                    final String str5 = tantanForbidden.message;
                    if (!TextUtils.isEmpty(str5)) {
                        e51.M(new Runnable() { // from class: l.yq7
                            @Override // java.lang.Runnable
                            public final void run() {
                                osi0.g(str5);
                            }
                        });
                    }
                    this.f8580Q.f3598U.m13685a(new d30() { // from class: l.zq7
                        public final void call() {
                            CoreModule.f1542k.f11195c.delete(((DbObject) message)._id);
                        }
                    });
                } else if (tantanForbidden.isBlocked()) {
                    m5134yq(((DbObject) message)._id, message.cid);
                } else if (coreProviderInterface.m5689Te(tantanForbidden) || coreProviderInterface.m5647Ji(tantanForbidden) || coreProviderInterface.m5590Aa(tantanForbidden) || tantanForbidden.isIdCardAuthing() || tantanForbidden.isOtherNotVerify() || tantanForbidden.isRejectedContact() || tantanForbidden.isLetterNotEnough() || coreProviderInterface.m5700V8(tantanForbidden)) {
                    this.f8580Q.f3598U.m13685a(new d30() { // from class: l.ar7
                        public final void call() {
                            C0166g.m4324jb(message, atomicBoolean);
                        }
                    });
                    if (coreProviderInterface.m5647Ji(tantanForbidden)) {
                        this.f8580Q.f3613Z.f4132T.z();
                    }
                    if (coreProviderInterface.m5700V8(tantanForbidden)) {
                        this.f8580Q.f3635g1.m19120d3(message.cid);
                    }
                } else {
                    int i2 = tantanForbidden.code;
                    if (i2 == 40325 || i2 == 40339) {
                        String string = CoreModule.f1533b.getString(R.string.o);
                        int i3 = tantanForbidden.code;
                        if (i3 == 40339) {
                            string = tantanForbidden.message;
                        }
                        zM4681Og = m4681Og(str, string, z, i3);
                        str4 = str3;
                    } else {
                        this.f8580Q.f3598U.m13685a(new d30() { // from class: l.cr7
                            public final void call() {
                                this.f9797a.m4874ek(message, tantanForbidden);
                            }
                        });
                    }
                }
                str4 = str3;
                z2 = true;
            } else {
                str3 = "unknown";
            }
            if (!zM4681Og) {
                this.f8580Q.f3598U.m13685a(new d30() { // from class: l.dr7
                    public final void call() {
                        C0166g.m4284g6(message, z2);
                    }
                });
            }
            if (TEnum.equals(message.messageType, "contact_info_rejection") && !atomicBoolean.get()) {
                this.f8580Q.f3598U.m13685a(new d30() { // from class: l.er7
                    public final void call() {
                        C0166g.m3965Dd(message);
                    }
                });
            }
            if (TEnum.equals(message.messageType, "tickle") && ((DbObject) message)._id != 0) {
                this.f8580Q.f3598U.m13685a(new d30() { // from class: l.uq7
                    public final void call() {
                        CoreModule.f1542k.f11195c.delete(((DbObject) message)._id);
                    }
                });
            }
            pxz.g(message, str2, str4, str, 0, SystemClock.elapsedRealtime() - j);
        }
        TantanException.Client.CoreService coreService = (TantanException.Client.CoreService) th;
        str3 = "" + coreService.code;
        int i4 = coreService.code;
        if (i4 == 40042 || coreProviderInterface.m5722Xl(i4) || (i = coreService.code) == 40041 || i == 40044 || i == 40045) {
            this.f8580Q.f3598U.m13685a(new d30() { // from class: l.xq7
                public final void call() {
                    this.f27678a.m4863dk(message, atomicBoolean);
                }
            });
            z2 = true;
        }
        zM4681Og = z2;
        z2 = true;
        str4 = str3;
        if (!zM4681Og) {
            this.f8580Q.f3598U.m13685a(new d30() { // from class: l.dr7
                public final void call() {
                    C0166g.m4284g6(message, z2);
                }
            });
        }
        if (TEnum.equals(message.messageType, "contact_info_rejection")) {
            this.f8580Q.f3598U.m13685a(new d30() { // from class: l.er7
                public final void call() {
                    C0166g.m3965Dd(message);
                }
            });
        }
        if (TEnum.equals(message.messageType, "tickle")) {
            this.f8580Q.f3598U.m13685a(new d30() { // from class: l.uq7
                public final void call() {
                    CoreModule.f1542k.f11195c.delete(((DbObject) message)._id);
                }
            });
        }
        pxz.g(message, str2, str4, str, 0, SystemClock.elapsedRealtime() - j);
    }

    /* JADX INFO: renamed from: fl */
    public final /* synthetic */ roj0 m4887fl(Message message, Envelope envelope) {
        if (!vwb.J(envelope.getModuleData(CoreData.class).messages) && TextUtils.equals(((DbObject) ((Message) envelope.getModuleData(CoreData.class).messages.get(0))).id, ((DbObject) message).id)) {
            ((Message) envelope.getModuleData(CoreData.class).messages.get(0)).cid = message.cid;
        }
        this.f8580Q.m3422w3(envelope, null);
        return roj0.a;
    }

    /* JADX INFO: renamed from: fm */
    public final /* synthetic */ rx.c m4888fm(Boolean bool) {
        return this.f8580Q.f3628e0.m21360H9();
    }

    /* JADX INFO: renamed from: fn */
    public rx.c<Links> m4889fn(final Links links) {
        return this.f8580Q.scheduled("conversation_delete_list", 0, new v9j() { // from class: l.va8
            public final Object call() {
                return this.f24234a.m4562Ej(links);
            }
        });
    }

    /* JADX INFO: renamed from: fo */
    public rx.c<q860<Conversation>> m4890fo() {
        return m4679Oe((orh0.a) m4655Me().f15242v.b());
    }

    /* JADX INFO: renamed from: fp */
    public void m4891fp() {
        scheduled("users/me/chat-profiles", 0, new v9j() { // from class: l.mt7
            public final Object call() {
                return this.f17236a.m4686Ol();
            }
        });
    }

    /* JADX INFO: renamed from: fq */
    public List<Conversation> m4892fq() {
        Filter filterNEQ = Filter.TRUE;
        if (ura.m25555e().m25559d().m5745c()) {
            filterNEQ = Conversation.CONVTYPE.NEQ("quickchat");
        }
        Filter filter = filterNEQ;
        jl6 jl6Var = CoreModule.f1542k.f11205m;
        Filter filterNOT_STARTS_WITH = Conversation.ID.NOT_STARTS_WITH("fake_conversation");
        Filter filterF = Conversation.READ.F();
        TEnumColumn tEnumColumn = Conversation.STATUS;
        return jl6Var.query(Filter.AND(new Filter[]{filterNOT_STARTS_WITH, filterF, Filter.AND(new Filter[]{tEnumColumn.NEQ("dismissed"), tEnumColumn.NEQ("local_fake"), tEnumColumn.NEQ("removed"), tEnumColumn.NEQ("invisible"), tEnumColumn.NEQ("deleted")}), (Filter) CoreModule.f1542k.f11205m.f15241u.b(), Conversation.LOCALEVERHASMESSAGE.F(), filter}), ((OrderedColumn) Conversation.LATESTTIME).DESC, ura.m25555e().m25559d().m5656Mg());
    }

    /* JADX INFO: renamed from: gf */
    public rx.c<List<Conversation>> m4893gf() {
        return ((orh0.a) m4655Me().f15218K.b()).m();
    }

    /* JADX INFO: renamed from: gg */
    public rx.c<q860<Conversation>> m4894gg(final String str) {
        return this.f8580Q.scheduled("getFilterConversationList/" + str, 0, new v9j() { // from class: l.zy7
            public final Object call() {
                return this.f29032a.m4671Ni(str);
            }
        });
    }

    /* JADX INFO: renamed from: gh */
    public final void m4895gh(Message message, boolean z, double d2) {
        if (z) {
            List listJ = CoreModule.f1542k.f11195c.m26896W(message.cid).j();
            if (!vwb.J(listJ)) {
                double d3 = ((Message) listJ.get(0)).createdTime + 1.0d;
                message.createdTime = d3;
                if (d2 > d3) {
                    double d4 = d2 + 10.0d;
                    message.createdTime = d4;
                    message.localCreatedTime = (long) d4;
                }
            }
        }
        CoreModule.f1542k.f11195c.upsert(message);
    }

    /* JADX INFO: renamed from: gi */
    public final /* synthetic */ void m4896gi() {
        this.f8580Q.f3598U.m13685a(new d30() { // from class: l.kz7
            public final void call() {
                CoreModule.f1542k.f11205m.delete(Conversation.ID.STARTS_WITH("fake_conversation_anim"));
            }
        });
    }

    /* JADX INFO: renamed from: gj */
    public final /* synthetic */ rx.c m4897gj(DbLinks dbLinks) {
        if (dbLinks == null || TextUtils.isEmpty(dbLinks.links.previous)) {
            DbLinks dbLinksNew_ = DbLinks.new_();
            ((DbObject) dbLinksNew_).id = "conversations";
            dbLinksNew_.links.next = C0154a.f3475H;
            return m4782Wm(dbLinksNew_);
        }
        if (dbLinks.links.next != null) {
            return m4782Wm(dbLinks);
        }
        if (((Long) this.f3973v2.get()).longValue() != 0 && qqi0.h(qib0.f19784H.guessedCurrentServerTime(), ((Long) this.f3973v2.get()).longValue(), 60)) {
            this.f8580Q.f3598U.m13685a(new d30() { // from class: l.vu7
                public final void call() {
                    C0166g.m4189Y5();
                }
            });
            DbLinks dbLinksNew_2 = DbLinks.new_();
            ((DbObject) dbLinksNew_2).id = "conversations";
            dbLinksNew_2.links.next = C0154a.f3475H;
            return m4782Wm(dbLinksNew_2);
        }
        if (!m4543Cq()) {
            return m4842bn(dbLinks);
        }
        DbLinks dbLinksNew_3 = DbLinks.new_();
        ((DbObject) dbLinksNew_3).id = "conversations";
        dbLinksNew_3.links.next = C0154a.f3475H;
        return m4782Wm(dbLinksNew_3);
    }

    /* JADX INFO: renamed from: gk */
    public final /* synthetic */ void m4898gk(Message message, String str, Envelope envelope, boolean z, boolean z2, boolean z3) {
        message.cid = str;
        CoreModule.f1542k.f11195c.updateBy_id(message);
        envelope.getModuleData(CoreData.class).messages.clear();
        if (!CoreModule.m1850H().userId().equals(str) && z && m5112xh(str)) {
            Conversation conversationM4665Mo = m4665Mo(message.cid);
            if (conversationM4665Mo == null && z2) {
                conversationM4665Mo = m4713Qo(message);
            }
            if (NullChecker.a(conversationM4665Mo)) {
                conversationM4665Mo.latestTime = message.createdTime;
                CoreModule.f1542k.f11205m.upsert(conversationM4665Mo);
            }
        }
        if (z3 && !TextUtils.isEmpty(message.moment)) {
            CoreModule.m1853N().D8(message.moment, ((DbObject) message).id);
        }
        if (TEnum.equals(message.messageType, "ice_breaking")) {
            Conversation conversationM4665Mo2 = m4665Mo(str);
            if (NullChecker.a(conversationM4665Mo2) && NullChecker.a(conversationM4665Mo2.property)) {
                ConversationIceBreaking conversationIceBreaking = conversationM4665Mo2.property.iceBreaking;
                if (conversationIceBreaking == null || TextUtils.isEmpty(conversationIceBreaking.answeredMsgId)) {
                    conversationM4665Mo2.property.iceBreaking = ConversationIceBreaking.new_();
                    conversationM4665Mo2.property.iceBreaking.answeredMsgId = ((DbObject) message).id;
                    CoreModule.f1542k.f11205m.upsert(conversationM4665Mo2);
                }
            }
        }
    }

    /* JADX INFO: renamed from: gl */
    public final /* synthetic */ rx.c m4899gl(final Message message) {
        return new la20((v9j<stc0>) new v9j() { // from class: l.xv7
            public final Object call() {
                Message message2 = message;
                return C0154a.f3483P.auth().q(C0154a.m3172R0(message2.hostId, ((DbObject) message2).id) + "&action=readDetail").k(utc0.create(Network.JSON, message2.toJson())).b();
            }
        }, 0).map(new w9j() { // from class: l.yv7
            public final Object call(Object obj) {
                return this.f28419a.m4887fl(message, (Envelope) obj);
            }
        }).compose(C0154a.m3182T2());
    }

    /* JADX INFO: renamed from: gm */
    public final /* synthetic */ Boolean m4900gm(roj0 roj0Var) {
        if (!NullChecker.a(this.f8580Q.m3414o3().growth)) {
            return Boolean.FALSE;
        }
        if (this.f8580Q.m3414o3().growth.remaining > 0) {
            return Boolean.TRUE;
        }
        e51.G(new Runnable() { // from class: l.sp7
            @Override // java.lang.Runnable
            public final void run() {
                lsi0.y("您今日已达到分享用户次数的上线啦~明天再来吧");
            }
        });
        return Boolean.FALSE;
    }

    /* JADX INFO: renamed from: gn */
    public void m4901gn() {
        if (wf6.f() && mqi0.o() >= ((Long) this.f8580Q.f3628e0.f19106w1.get()).longValue()) {
            CoreModule.f1534c.f3631f0.m5003on().map(new w9j() { // from class: l.cw7
                public final Object call(Object obj) {
                    return Boolean.valueOf(((q860) obj).c());
                }
            }).filter(new w9j() { // from class: l.dw7
                public final Object call(Object obj) {
                    return Boolean.valueOf(!((Boolean) obj).booleanValue());
                }
            }).first().observeOn(Schedulers.io()).map(new w9j() { // from class: l.fw7
                public final Object call(Object obj) {
                    return this.f12939a.m4575Fj((Boolean) obj);
                }
            }).subscribe(mkd0.H(new e30() { // from class: l.gw7
                public final void call(Object obj) {
                    this.f13540a.m4588Gj((xaj0) obj);
                }
            }, new e30() { // from class: l.hw7
                public final void call(Object obj) {
                    C0166g.m4342l7((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: go */
    public void m4902go() {
        this.f3853H2.onNext(roj0.a);
    }

    /* JADX INFO: renamed from: gp */
    public rx.c<roj0> m4903gp(final String str) {
        return this.f8580Q.scheduled("refreshRecentMessages_" + str, 0, new v9j() { // from class: l.r28
            public final Object call() {
                return this.f20263a.m4710Ql(str);
            }
        });
    }

    /* JADX INFO: renamed from: gq */
    public void m4904gq() {
        this.f3832A2.unsubscribe();
    }

    /* JADX INFO: renamed from: hf */
    public rx.c<q860<Conversation>> m4905hf() {
        return m4679Oe(m4655Me().f15213F);
    }

    /* JADX INFO: renamed from: hg */
    public double m4906hg() {
        long timeInMillis;
        if (ura.m25555e().m25559d().m5701Vb()) {
            timeInMillis = ((Long) this.f3935j0.get()).longValue();
        } else {
            long j = this.f3932i0;
            if (j >= 1) {
                return j;
            }
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(mqi0.o());
            calendar.set(calendar.get(1), calendar.get(2), calendar.get(5), 0, 0, 0);
            timeInMillis = calendar.getTimeInMillis() - (((long) (ura.m25555e().m25559d().m5612Dt() - 1)) * 86400000);
        }
        return timeInMillis;
    }

    /* JADX INFO: renamed from: hh */
    public void m4907hh(String str) {
        m4860dh(str, MessageType.get("local_pic_cert_guide"));
    }

    /* JADX INFO: renamed from: hj */
    public final /* synthetic */ rx.c m4909hj(DbLinks dbLinks) {
        if (dbLinks == null) {
            return rx.c.fromCallable(new Callable() { // from class: l.wp7
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return qib0.f19813k0.f23550c.query("conversations");
                }
            }).flatMap(new w9j() { // from class: l.xp7
                public final Object call(Object obj) {
                    return this.f27670a.m4897gj((DbLinks) obj);
                }
            }).compose(mkd0.C());
        }
        return dbLinks.links.next != null ? m4782Wm(dbLinks).compose(mkd0.C()) : m4842bn(dbLinks).compose(mkd0.C());
    }

    /* JADX INFO: renamed from: hk */
    public final /* synthetic */ Message m4910hk(Message message, final String str, final boolean z, final boolean z2, final boolean z3, final Envelope envelope) {
        if (vwb.J(envelope.getModuleData(CoreData.class).messages)) {
            CrashHelper.i(new Exception("return null messages"), "core_post_message", CrashHelper.ReportLevel.p5, 100);
            return message;
        }
        final Message message2 = (Message) envelope.getModuleData(CoreData.class).messages.get(0);
        message2.localCreatedTime = message.localCreatedTime;
        ((DbObject) message2)._id = ((DbObject) message)._id;
        message2.cid = str;
        if (z) {
            message2.messageType = MessageType.get("moment_comment");
        }
        String strM25972u = vx6.m25972u(message2.value);
        if (!TextUtils.isEmpty(strM25972u)) {
            message2.localAnimationKey = strM25972u;
        }
        this.f8580Q.m3422w3(envelope, new d30() { // from class: l.cy7
            public final void call() {
                this.f9908a.m4898gk(message2, str, envelope, z2, z3, z);
            }
        });
        if (!z && !User.isTeamAccount(str)) {
            ura.m25555e().m25559d().m5718Xb(1);
            if (ura.m25555e().m25559d().m5667O()) {
                this.f3899X.onNext(message2);
            }
            CoreModule.f1534c.f3644j1.m2061j(message2);
        }
        this.f3902Y.onNext(message2);
        return message2;
    }

    /* JADX INFO: renamed from: hl */
    public final /* synthetic */ void m4911hl(final List list, final Envelope envelope) {
        this.f8580Q.f3598U.m13685a(new d30() { // from class: l.s68
            public final void call() {
                C0166g.m4339l4(envelope, list);
            }
        });
    }

    /* JADX INFO: renamed from: hm */
    public final /* synthetic */ rx.c m4912hm(String str, String str2, boolean z, roj0 roj0Var) {
        return m5099wg(str, str2, z);
    }

    /* JADX INFO: renamed from: hn, reason: merged with bridge method [inline-methods] */
    public final void m4599Hi(String str, AudioText audioText) {
        if (NullChecker.a(audioText)) {
            final Message messageQuery = CoreModule.f1542k.f11195c.query(str);
            if (NullChecker.a(messageQuery)) {
                messageQuery.localAudioText = audioText;
                this.f8580Q.f3598U.m13685a(new d30() { // from class: l.q28
                    public final void call() {
                        CoreModule.f1542k.f11195c.upsert(messageQuery);
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: ho */
    public void m4914ho(boolean z, List<Conversation> list) {
        if (z) {
            this.f3859J2.onNext(list);
        } else {
            this.f3862K2.onNext(list);
        }
    }

    /* JADX INFO: renamed from: hp */
    public void m4915hp(boolean z) {
        this.f8580Q.f3631f0.f3845F0.onNext(Boolean.valueOf(z));
    }

    /* JADX INFO: renamed from: hq */
    public List<Conversation> m4916hq() {
        return CoreModule.f1542k.f11205m.m17601n1();
    }

    /* JADX INFO: renamed from: ie */
    public int m4917ie(List<String> list) {
        return CoreModule.f1542k.f11205m.m17594k0(list);
    }

    /* JADX INFO: renamed from: ig */
    public double m4918ig() {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(mqi0.o());
        calendar.set(calendar.get(1), calendar.get(2), calendar.get(5), 0, 0, 0);
        return calendar.getTimeInMillis() - (((long) (ura.m25555e().m25559d().m5612Dt() - 1)) * 86400000);
    }

    /* JADX INFO: renamed from: ih */
    public void m4919ih(String str, String str2) {
        m4812Zg(m5008pf(str, MessageType.get("local_ux_questionnaire_tip"), str2));
    }

    /* JADX INFO: renamed from: ii */
    public final /* synthetic */ roj0 m4920ii(final String str) throws Exception {
        this.f8580Q.f3598U.m13685a(new d30() { // from class: l.yu7
            public final void call() {
                this.f28391a.m4908hi(str);
            }
        });
        return roj0.a;
    }

    /* JADX INFO: renamed from: ij */
    public final /* synthetic */ Envelope m4921ij(Envelope envelope) {
        if (!vwb.J(envelope.getModuleData(CoreData.class).conversations)) {
            final List list = envelope.getModuleData(CommonData.class).users;
            final List list2 = envelope.getModuleData(CoreData.class).friends;
            this.f8580Q.m3422w3(envelope, new d30() { // from class: l.f48
                public final void call() {
                    vwb.z(list, new e30() { // from class: l.t78
                        public final void call(Object obj) {
                            C0166g.m4206Zb(list, (User) obj);
                        }
                    });
                }
            });
        }
        return envelope;
    }

    /* JADX INFO: renamed from: ik */
    public final /* synthetic */ rx.c m4922ik(final String str, final Message message, final boolean z, final boolean z2, final boolean z3, e30 e30Var) {
        return m4120Ro(str, message).doOnNext(new e30() { // from class: l.gt7
            public final void call(Object obj) {
                C0166g.m4359md(message, str, (Envelope) obj);
            }
        }).map(new w9j() { // from class: l.ht7
            public final Object call(Object obj) {
                return this.f14043a.m4910hk(message, str, z, z2, z3, (Envelope) obj);
            }
        }).doOnError(e30Var).compose(C0154a.m3182T2());
    }

    /* JADX INFO: renamed from: il */
    public final /* synthetic */ rx.c m4923il(final String str, final List list, final JSONArray jSONArray) {
        return NullChecker.a(jSONArray) ? ia20.m16571e(new v9j() { // from class: l.g48
            public final Object call() {
                return C0154a.f3483P.auth().q(C0154a.m3143J0("/conversations/" + str + "/read-messages")).l(utc0.create(Network.JSON, jSONArray.toString())).b();
            }
        }).doOnNext(new e30() { // from class: l.i48
            public final void call(Object obj) {
                this.f14221a.m4911hl(list, (Envelope) obj);
            }
        }).map(new w9j() { // from class: l.j48
            public final Object call(Object obj) {
                return roj0.a;
            }
        }) : rx.c.empty();
    }

    /* JADX INFO: renamed from: im */
    public final /* synthetic */ void m4924im(String str, String str2, Picture.ImageUri imageUri, boolean z, String str3, CipherId cipherId) {
        String str4;
        try {
            cipherId.userId = URLEncoder.encode(cipherId.userId, "UTF-8");
            if (!TextUtils.isEmpty(cipherId.momentId)) {
                cipherId.momentId = URLEncoder.encode(cipherId.momentId, "UTF-8");
            }
        } catch (Exception unused) {
            cipherId.userId = "";
            cipherId.momentId = "";
        }
        User userM21487oa = this.f8580Q.f3628e0.m21487oa(str);
        boolean z2 = NullChecker.a(userM21487oa) && TextUtils.isEmpty(str2) && userM21487oa.onlineMatchLocked();
        if (juk.e()) {
            str4 = "http://m.staging2.p1staff.com/fep/tantan/frontend/tantan-frontend-app-pages-v2/src/pages/core/userShare/index.html?u=" + cipherId.userId + "&f=" + z2 + "&m=" + cipherId.momentId;
        } else {
            str4 = "https://wechat.tantanapp.com/uni-fep/tantan/frontend/tantan-frontend-app-pages-v2/src/pages/core/userShare/index.html?u=" + cipherId.userId + "&f=" + z2 + "&m=" + cipherId.momentId;
        }
        String str5 = str4;
        if (NullChecker.a(imageUri)) {
            m4630Jp(str5, imageUri.formatted(), z, str3, NullChecker.a(userM21487oa) ? userM21487oa.isFemale() : false);
        } else {
            m4630Jp(str5, "", z, str3, NullChecker.a(userM21487oa) ? userM21487oa.isFemale() : false);
        }
    }

    /* JADX INFO: renamed from: in */
    public rx.c<j760<Integer, Message>> m4925in(String str, String str2) {
        return mkd0.s(CoreModule.f1542k.f11195c.m26908i0(str).m(), CoreModule.f1542k.f11195c.m26903d0(str).m(), CoreModule.f1534c.f3631f0.m4667Ne(str2), new y9j() { // from class: l.au7
            /* JADX INFO: renamed from: a */
            public final Object m12250a(Object obj, Object obj2, Object obj3) {
                return C0166g.m3982F8((List) obj, (List) obj2, (Conversation) obj3);
            }
        });
    }

    /* JADX INFO: renamed from: io */
    public void m4926io(int i) {
        this.f3856I2.onNext(Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: ip */
    public rx.c<roj0> m4927ip() {
        return this.f3955p2;
    }

    /* JADX INFO: renamed from: iq */
    public rx.c<List<Message>> m4928iq(String str) {
        return CoreModule.f1542k.f11195c.m26909j0(str).m();
    }

    /* JADX INFO: renamed from: je */
    public void m4929je(List<String> list) {
        n11.f();
        if (vwb.J(list)) {
            return;
        }
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            Conversation conversationQuery = CoreModule.f1542k.f11205m.query(it.next());
            if (NullChecker.a(conversationQuery)) {
                conversationQuery.level = 50;
                CoreModule.f1542k.f11205m.upsert(conversationQuery);
            }
        }
    }

    /* JADX INFO: renamed from: jf */
    public int m4930jf() {
        return CoreModule.f1542k.f11205m.m17590i0();
    }

    /* JADX INFO: renamed from: jg */
    public boolean m4931jg(String str, boolean z) {
        String str2;
        Conversation conversationM5146zp = m5146zp(str);
        if (conversationM5146zp != null && (str2 = conversationM5146zp.localExtraInfo) != null && !TextUtils.isEmpty(str2) && (z || TEnum.equals(conversationM5146zp.status, "dismissed"))) {
            try {
                return new JSONObject(conversationM5146zp.localExtraInfo).getBoolean("keep_message_history");
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: jh */
    public void m4932jh(String str) {
        Message messageNew_ = Message.new_();
        messageNew_.messageType = MessageType.get("local_match_ice_break");
        messageNew_.cid = str;
        messageNew_.localInConversation = true;
        long jGuessedCurrentServerTime = qib0.f19784H.guessedCurrentServerTime();
        messageNew_.owner = CoreModule.m1850H().userId();
        messageNew_.createdTime = jGuessedCurrentServerTime;
        messageNew_.localCreatedTime = jGuessedCurrentServerTime;
        messageNew_.recalled = Boolean.FALSE;
        messageNew_.hostId = CoreModule.m1850H().userId();
        tpd0 tpd0Var = App.i;
        messageNew_.localCreatedSession = ((Integer) tpd0Var.get()).intValue();
        ((DbObject) messageNew_).id = DbObject.GENERATE_UNIQUE_FAKE_ID(((Integer) tpd0Var.get()).intValue());
        messageNew_.value = "";
        m4824ah(messageNew_, false);
    }

    /* JADX INFO: renamed from: ji */
    public final /* synthetic */ void m4933ji(Set set) {
        set.forEach(new a());
    }

    /* JADX INFO: renamed from: jj */
    public final /* synthetic */ roj0 m4934jj(String str, Envelope envelope) {
        List list = envelope.getModuleData(CoreData.class).conversations;
        q860 q860Var = (q860) this.f3901X1.e();
        if (q860Var == null || TextUtils.isEmpty(str)) {
            DbLinks dbLinks = new DbLinks();
            dbLinks.links = envelope.pagination.links;
            q860Var = new q860(list, dbLinks);
        } else if (!TextUtils.isEmpty(str)) {
            q860Var.a.addAll(list);
            q860Var.b.links = envelope.pagination.links;
        }
        this.f3901X1.onNext(q860Var);
        return roj0.a;
    }

    /* JADX INFO: renamed from: jk */
    public final /* synthetic */ rx.c m4935jk(final String str, final boolean z, final boolean z2, final boolean z3, final e30 e30Var, final Message message) {
        return this.f8580Q.scheduled("postTheMessage", -1, new v9j() { // from class: l.lq7
            public final Object call() {
                return this.f16571a.m4922ik(str, message, z, z2, z3, e30Var);
            }
        });
    }

    /* JADX INFO: renamed from: jl */
    public final /* synthetic */ rx.c m4936jl(final List list, final String str) {
        return rx.c.fromCallable(new Callable() { // from class: l.jy7
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C0166g.m4039Ka(list);
            }
        }).flatMap(new w9j() { // from class: l.ky7
            public final Object call(Object obj) {
                return this.f16083a.m4923il(str, list, (JSONArray) obj);
            }
        });
    }

    /* JADX INFO: renamed from: jn */
    public rx.c<List<Conversation>> m4938jn(boolean z) {
        return m4951kn(z).m();
    }

    /* JADX INFO: renamed from: jo */
    public void m4939jo() {
        this.f8580Q.scheduled("notifyServerChangeToConversationTab", 0, new v9j() { // from class: l.pp7
            public final Object call() {
                return ia20.m16567a(new v9j() { // from class: l.ft7
                    public final Object call() {
                        return C0154a.f3483P.auth().q(C0154a.m3130G("/live-chat-tab-report")).l(utc0.create(Network.JSON, "")).b();
                    }
                });
            }
        }).map(new w9j() { // from class: l.qp7
            public final Object call(Object obj) {
                return ((Envelope) obj).getModuleData(CoreData.class).onlineLiveChatPair;
            }
        }).onErrorReturn(new w9j() { // from class: l.rp7
            public final Object call(Object obj) {
                return C0166g.m4005H9((Throwable) obj);
            }
        }).subscribe();
    }

    /* JADX INFO: renamed from: jp */
    public void m4940jp() {
        this.f8580Q.f3674t1.m3440o(vwb.f0(new String[]{"countdown_card_conv_key", "countdown_conv_list_key"})).filter(new w9j() { // from class: l.it7
            public final Object call(Object obj) {
                return Boolean.valueOf(((RunnableC0159c0.b) obj).f3710a);
            }
        }).subscribe(new e30() { // from class: l.jt7
            public final void call(Object obj) {
                this.f15385a.m4722Rl((RunnableC0159c0.b) obj);
            }
        });
    }

    /* JADX INFO: renamed from: jq */
    public rx.c<List<Conversation>> m4941jq() {
        return CoreModule.f1542k.f11205m.f15234n.m();
    }

    /* JADX INFO: renamed from: ke */
    public void m4942ke() {
        User userM21490p9 = this.f8580Q.f3628e0.m21490p9();
        final String str = (String) this.f8580Q.f3631f0.f3857J0.get();
        if (!NullChecker.a(userM21490p9) || userM21490p9.isFemale() || TextUtils.isEmpty(str)) {
            return;
        }
        mkd0.z(this.f3883R1);
        this.f3883R1 = this.f8580Q.f3631f0.m4667Ne(str).subscribe(new e30() { // from class: l.cu7
            public final void call(Object obj) {
                this.f9847a.m4534Ch(str, (Conversation) obj);
            }
        });
    }

    /* JADX INFO: renamed from: kf */
    public int m4943kf() {
        return CoreModule.f1542k.f11205m.f15208A.e();
    }

    /* JADX INFO: renamed from: kg */
    public rx.c<LogoutCounterEnvelope> m4944kg() {
        final v9j v9jVar = new v9j() { // from class: l.ev7
            public final Object call() {
                return qib0.f19784H.auth().q(C0154a.m3198Y("/persuade/counter")).f().b();
            }
        };
        return scheduled("logout_persuade_counter", 0, new v9j() { // from class: l.fv7
            public final Object call() {
                return new ka20(v9jVar, LogoutCounterEnvelope.JSON_ADAPTER).compose(mkd0.C());
            }
        }, false);
    }

    /* JADX INFO: renamed from: kh */
    public void m4945kh(String str) {
        Message messageNew_ = Message.new_();
        messageNew_.messageType = MessageType.get("local_moment_post_guide");
        messageNew_.cid = str;
        messageNew_.localInConversation = true;
        long jGuessedCurrentServerTime = qib0.f19784H.guessedCurrentServerTime();
        messageNew_.owner = CoreModule.m1850H().userId();
        messageNew_.createdTime = jGuessedCurrentServerTime;
        messageNew_.localCreatedTime = jGuessedCurrentServerTime;
        messageNew_.recalled = Boolean.FALSE;
        messageNew_.hostId = CoreModule.m1850H().userId();
        tpd0 tpd0Var = App.i;
        messageNew_.localCreatedSession = ((Integer) tpd0Var.get()).intValue();
        ((DbObject) messageNew_).id = DbObject.GENERATE_UNIQUE_FAKE_ID(((Integer) tpd0Var.get()).intValue());
        messageNew_.value = "";
        m4824ah(messageNew_, false);
    }

    /* JADX INFO: renamed from: ki */
    public final /* synthetic */ void m4946ki(List list) {
        try {
            final HashSet hashSet = new HashSet();
            if (list != null) {
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    Conversation conversation = (Conversation) list.get(i);
                    if (m4642Kp(conversation)) {
                        hashSet.add(((DbObject) conversation).id);
                    }
                }
            }
            if (hashSet.isEmpty()) {
                return;
            }
            this.f8580Q.f3598U.m13685a(new d30() { // from class: l.bz7
                public final void call() {
                    this.f9233a.m4933ji(hashSet);
                }
            });
        } catch (Exception e) {
            CrashHelper.c(e);
        }
    }

    /* JADX INFO: renamed from: kj */
    public final /* synthetic */ rx.c m4947kj(final String str, final String str2) {
        return ia20.m16571e(new v9j() { // from class: l.q08
            public final Object call() {
                return C0154a.f3483P.auth().q(C0154a.m3141I2(str)).b();
            }
        }).map(new w9j() { // from class: l.r08
            public final Object call(Object obj) {
                return this.f20211a.m4921ij((Envelope) obj);
            }
        }).observeOn(jo0.a()).map(new w9j() { // from class: l.s08
            public final Object call(Object obj) {
                return this.f20961a.m4934jj(str2, (Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: kk */
    public final /* synthetic */ Boolean m4948kk(String str, Message message, String str2, long j, Message message2) {
        Conversation conversationM4665Mo = m4665Mo(str);
        if (ura.m25555e().m25559d().m5613E() && NullChecker.a(conversationM4665Mo) && ura.m25555e().m25559d().m5664Nd(conversationM4665Mo)) {
            return Boolean.TRUE;
        }
        final User userQuery = qib0.f19813k0.f23551d.query(message2.cid);
        if (userQuery == null ? false : userQuery.unilateralBlock()) {
            pxz.g(message, str2, "lift_match", str, 0, SystemClock.elapsedRealtime() - j);
            m5098we(message2, new e30() { // from class: l.ca8
                public final void call(Object obj) {
                    C0166g.m4204Z9(userQuery, (Message) obj);
                }
            });
            this.f3896W.onNext(new Exception("You've been unmatched"));
            if (ura.m25555e().m25559d().m5868u() && NullChecker.a(conversationM4665Mo) && conversationM4665Mo.isHeartbeatConv()) {
                this.f8580Q.f3560H1.f24766R.onNext(message);
            }
            return Boolean.FALSE;
        }
        if (ura.m25555e().m25559d().m5682R8() && NullChecker.a(conversationM4665Mo) && "lovebuzz".equals(conversationM4665Mo.convType)) {
            int i = conversationM4665Mo.mm;
            if (((NullChecker.a(conversationM4665Mo.property) && NullChecker.a(conversationM4665Mo.property.intl_love_buzz) && TextUtils.equals("textBuzz", conversationM4665Mo.property.intl_love_buzz.biz)) ? conversationM4665Mo.property.intl_love_buzz.expire - mqi0.o() : 1000L) <= 0 && i < 10) {
                m5085ve(message, 8, null);
                return Boolean.FALSE;
            }
        }
        return Boolean.TRUE;
    }

    /* JADX INFO: renamed from: kl */
    public final /* synthetic */ Optional m4949kl(String str) throws Exception {
        final Conversation conversationM4665Mo = m4665Mo(str);
        List<Message> listJ = CoreModule.f1542k.f11195c.m26911l0(str).j();
        if (!m4666Mp(conversationM4665Mo, listJ)) {
            return Optional.absent();
        }
        Message message = (Message) vwb.r(listJ, new w9j() { // from class: l.s18
            public final Object call(Object obj) {
                return Boolean.valueOf(TEnum.equals(((Message) obj).status(), "normal"));
            }
        });
        final ConversationPatchRecord conversationPatchRecordNew_ = ConversationPatchRecord.new_();
        conversationPatchRecordNew_.state = ConversationPatchState.get(CameraSticker.CATEGORY_DEFAULT_FILTER);
        ((DbObject) conversationPatchRecordNew_).id = str;
        conversationPatchRecordNew_.readUtil = message == null ? "" : ((DbObject) message).id;
        this.f8580Q.f3598U.m13685a(new d30() { // from class: l.d28
            public final void call() {
                C0166g.m4031Jd(conversationPatchRecordNew_, conversationM4665Mo);
            }
        });
        return Optional.of(conversationPatchRecordNew_);
    }

    /* JADX INFO: renamed from: km */
    public final /* synthetic */ void m4950km(String str) {
        Conversation conversationM4665Mo = m4665Mo(str);
        if (NullChecker.a(conversationM4665Mo)) {
            CoreModule.f1542k.f11205m.delete(str);
        }
        m5044rp(conversationM4665Mo);
    }

    /* JADX INFO: renamed from: kn */
    public final orh0.a m4951kn(boolean z) {
        return (z && ((Boolean) this.f8580Q.f3631f0.f3971v0.get()).booleanValue() && this.f8580Q.f3631f0.m4835bg()) ? (orh0.a) m4655Me().f15223P.b() : (orh0.a) m4655Me().f15218K.b();
    }

    /* JADX INFO: renamed from: ko */
    public rx.c<j760<Integer, Message>> m4952ko(String str, String str2) {
        return ura.m25555e().m25559d().m5872v() ? m4965lo(str, str2) : mkd0.s(CoreModule.f1542k.f11195c.m26907h0(str).m(), CoreModule.f1542k.f11195c.m26902c0(str).m(), CoreModule.f1534c.f3631f0.m4667Ne(str2), new y9j() { // from class: l.a38
            /* JADX INFO: renamed from: a */
            public final Object m11704a(Object obj, Object obj2, Object obj3) {
                return C0166g.m4110R4((List) obj, (List) obj2, (Conversation) obj3);
            }
        });
    }

    /* JADX INFO: renamed from: kp */
    public void m4953kp(final String str) {
        this.f8580Q.scheduled("reject_receive_msg_" + str, -1, new v9j() { // from class: l.s58
            public final Object call() {
                return C0166g.m4017Ia(str);
            }
        }, false).subscribe(new e30() { // from class: l.t58
            public final void call(Object obj) {
                lsi0.y("已拒收");
            }
        }, new e30() { // from class: l.u58
            public final void call(Object obj) {
                lsi0.y("再试一次");
            }
        });
    }

    /* JADX INFO: renamed from: kq */
    public void m4954kq(final String str, final double d2) {
        this.f8580Q.f3598U.m13685a(new d30() { // from class: l.m08
            public final void call() {
                C0166g.m4184Xb(str, d2);
            }
        });
    }

    /* JADX INFO: renamed from: le */
    public rx.c<List<Conversation>> m4955le() {
        return CoreModule.f1542k.f11205m.f15240t.m();
    }

    /* JADX INFO: renamed from: lf */
    public int m4956lf() {
        return CoreModule.f1542k.f11205m.m17596l0();
    }

    /* JADX INFO: renamed from: lg */
    public rx.c<List<LogoutRecommendUser>> m4957lg(final List<Conversation> list) {
        return this.f8580Q.scheduled("logout_persuade_users", -1, new v9j() { // from class: l.vv7
            public final Object call() {
                return ia20.m16569c(new v9j() { // from class: l.ey7
                    public final Object call() {
                        return C0166g.m3994G9(list);
                    }
                }, LogoutRecommendEnvelope.JSON_ADAPTER);
            }
        }).map(new w9j() { // from class: l.wv7
            public final Object call(Object obj) {
                return C0166g.m4012I5((LogoutRecommendEnvelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: lh */
    public void m4958lh(String str) {
        Message messageNew_ = Message.new_();
        messageNew_.messageType = MessageType.get("tag_guide");
        messageNew_.cid = str;
        messageNew_.localInConversation = true;
        long jGuessedCurrentServerTime = qib0.f19784H.guessedCurrentServerTime();
        messageNew_.owner = CoreModule.m1850H().userId();
        messageNew_.createdTime = jGuessedCurrentServerTime;
        messageNew_.localCreatedTime = jGuessedCurrentServerTime;
        messageNew_.recalled = Boolean.FALSE;
        messageNew_.hostId = CoreModule.m1850H().userId();
        tpd0 tpd0Var = App.i;
        messageNew_.localCreatedSession = ((Integer) tpd0Var.get()).intValue();
        ((DbObject) messageNew_).id = DbObject.GENERATE_UNIQUE_FAKE_ID(((Integer) tpd0Var.get()).intValue());
        messageNew_.value = "";
        m4824ah(messageNew_, false);
    }

    /* JADX INFO: renamed from: li */
    public final /* synthetic */ void m4959li() {
        this.f8580Q.f3598U.m13685a(new d30() { // from class: l.ex7
            public final void call() {
                C0166g.m4159V8();
            }
        });
    }

    /* JADX INFO: renamed from: lj */
    public final /* synthetic */ void m4960lj(Envelope envelope, final Conversation conversation) {
        if (!ura.m25555e().m25559d().m5664Nd(conversation)) {
            m4658Mh(((DbObject) conversation).id);
            return;
        }
        final ArrayList arrayList = new ArrayList();
        if (!vwb.J(envelope.getModuleData(CoreData.class).messages)) {
            vwb.z(envelope.getModuleData(CoreData.class).messages, new e30() { // from class: l.d68
                public final void call(Object obj) {
                    C0166g.m4402qc(conversation, arrayList, (Message) obj);
                }
            });
            envelope.getModuleData(CoreData.class).messages.removeAll(arrayList);
        }
        m4658Mh(((DbObject) conversation).id);
    }

    /* JADX INFO: renamed from: lk */
    public final /* synthetic */ Message m4961lk(Message message, String str, final Message message2) {
        final boolean z = (this.f3887T.booleanValue() && m4508Ah(message.value, str)) || message.localFailType == 4;
        if (!qib0.f19802Z.m14990K(message2.value) && !qib0.f19802Z.m14992M(message2.value) && !z) {
            return message2;
        }
        if (this.f3887T.booleanValue()) {
            this.f3887T = Boolean.FALSE;
            this.f8580Q.f3598U.m13685a(new d30() { // from class: l.tp7
                public final void call() {
                    C0166g.m3952Cb(message2, z);
                }
            });
        } else {
            this.f8580Q.f3598U.m13685a(new d30() { // from class: l.vp7
                public final void call() {
                    C0166g.m4471x3(message2);
                }
            });
        }
        return CoreModule.f1542k.f11195c.query(((DbObject) message2)._id);
    }

    /* JADX INFO: renamed from: ll */
    public final /* synthetic */ void m4962ll(NetworkInfo networkInfo) {
        m4541Co();
    }

    /* JADX INFO: renamed from: lm */
    public final /* synthetic */ void m4963lm() {
        this.f8580Q.f3631f0.m4889fn(null);
        this.f8580Q.f3631f0.m4580Fo();
        CoreModule.f1534c.f3631f0.m4868dq(qib0.f19784H.guessedCurrentServerTime());
    }

    /* JADX INFO: renamed from: ln */
    public void m4964ln() {
        User userClone = CoreModule.f1534c.f3628e0.m21483na().clone();
        ProfileCompletion profileCompletion = userClone.profile.extensions.profileCompletion;
        List list = Collections.EMPTY_LIST;
        profileCompletion.briefIntroduction = vwb.c(list, "测试输入数据");
        userClone.profile.extensions.profileCompletion.progress = vwb.c(list, "finished");
        CoreModule.f1534c.f3628e0.m21510u9(userClone.subtract(CoreModule.f1534c.f3628e0.m21483na()));
    }

    /* JADX INFO: renamed from: lo */
    public rx.c<j760<Integer, Message>> m4965lo(String str, String str2) {
        return mkd0.s(CoreModule.f1542k.f11195c.m26907h0(str).m(), CoreModule.f1542k.f11195c.m26902c0(str).m(), CoreModule.f1534c.f3631f0.m4667Ne(str2), new y9j() { // from class: l.zu7
            /* JADX INFO: renamed from: a */
            public final Object m28837a(Object obj, Object obj2, Object obj3) {
                return C0166g.m4203Z8((List) obj, (List) obj2, (Conversation) obj3);
            }
        }).doOnError(new e30() { // from class: l.av7
            public final void call(Object obj) {
                C0166g.m3991G6((Throwable) obj);
            }
        });
    }

    /* JADX INFO: renamed from: lp */
    public void m4966lp() {
        e51.z(new Runnable() { // from class: l.jr7
            @Override // java.lang.Runnable
            public final void run() {
                this.f15361a.m4733Sl();
            }
        }, false);
    }

    /* JADX INFO: renamed from: lq */
    public void m4967lq(final double d2) {
        e51.y(new Runnable() { // from class: l.hq7
            @Override // java.lang.Runnable
            public final void run() {
                this.f14015a.m4513Am(d2);
            }
        });
    }

    /* JADX INFO: renamed from: me */
    public final Message m4968me(String str, String str2) {
        Message messageNew_ = Message.new_();
        messageNew_.messageType = MessageType.get("ai_chat_analysis_guide");
        messageNew_.cid = str;
        messageNew_.localInConversation = true;
        long jO = mqi0.o();
        messageNew_.owner = CoreModule.m1850H().userId();
        messageNew_.createdTime = jO;
        messageNew_.localCreatedTime = jO;
        messageNew_.recalled = Boolean.FALSE;
        messageNew_.hostId = CoreModule.m1850H().userId();
        tpd0 tpd0Var = App.i;
        messageNew_.localCreatedSession = ((Integer) tpd0Var.get()).intValue();
        ((DbObject) messageNew_).id = DbObject.GENERATE_UNIQUE_FAKE_ID(((Integer) tpd0Var.get()).intValue());
        MessageAdditionalData messageAdditionalDataNew_ = MessageAdditionalData.new_();
        messageNew_.additionalData = messageAdditionalDataNew_;
        messageNew_.value = "";
        messageAdditionalDataNew_.aiChatGuideType = str2;
        return messageNew_;
    }

    /* JADX INFO: renamed from: mf */
    public int m4969mf(int i) {
        return CoreModule.f1542k.f11205m.m17603o1(i).e();
    }

    /* JADX INFO: renamed from: mg */
    public rx.c<q860<Conversation>> m4970mg(final String str) {
        return this.f8580Q.scheduled("getMessageTabFilterList/" + str, 0, new v9j() { // from class: l.ww7
            public final Object call() {
                return this.f25432a.m4695Pi(str);
            }
        });
    }

    /* JADX INFO: renamed from: mh */
    public void m4971mh(String str) {
        Message messageNew_ = Message.new_();
        messageNew_.cid = str;
        tpd0 tpd0Var = App.i;
        ((DbObject) messageNew_).id = DbObject.GENERATE_UNIQUE_FAKE_ID(((Integer) tpd0Var.get()).intValue());
        messageNew_.messageType = MessageType.get("local_tickle_tip");
        messageNew_.localCreatedTime = mqi0.o();
        messageNew_.createdTime = mqi0.o();
        messageNew_.localCreatedSession = ((Integer) tpd0Var.get()).intValue();
        messageNew_.localInConversation = true;
        messageNew_.owner = CoreModule.m1850H().userId();
        Boolean bool = Boolean.FALSE;
        messageNew_.recalled = bool;
        this.f8580Q.f3631f0.m4812Zg(messageNew_);
        this.f8580Q.f3628e0.f18994h1.put(Boolean.TRUE);
        this.f8580Q.f3620b1.f15663T.put(bool);
        this.f8580Q.f3628e0.f19002i1.put(((DbObject) messageNew_).id);
    }

    /* JADX INFO: renamed from: mi */
    public final /* synthetic */ void m4972mi() {
        this.f8580Q.f3598U.m13685a(new d30() { // from class: l.iw7
            public final void call() {
                C0166g.m3983F9();
            }
        });
    }

    /* JADX INFO: renamed from: mj */
    public final /* synthetic */ void m4973mj(Conversation conversation) {
        m5047sf(((DbObject) conversation).id);
    }

    /* JADX INFO: renamed from: mk */
    public final /* synthetic */ void m4974mk(Message message, long j, String str, Message message2) {
        pxz.h(message, SystemClock.elapsedRealtime() - j);
        Conversation conversationM4786Xe = m4786Xe(str);
        if (NullChecker.a(conversationM4786Xe)) {
            if (conversationM4786Xe.userMessageCount == 1) {
                String strM5843qc = ura.m25555e().m25559d().m5843qc(str);
                if (!TextUtils.isEmpty(strM5843qc)) {
                    ConversationQuickChat conversationQuickChat = conversationM4786Xe.property.quickchat;
                    if (conversationQuickChat.bell) {
                        CoreModule.f1534c.f3547D0.m6799y4(strM5843qc);
                    } else if (conversationQuickChat.speed) {
                        CoreModule.f1534c.f3547D0.m6764C4(strM5843qc);
                    } else if (conversationQuickChat.oneside) {
                        User userM21483na = this.f8580Q.f3628e0.m21483na();
                        boolean z = ura.m25555e().m25559d().m5669Od() && NullChecker.a(conversationM4786Xe) && conversationM4786Xe.isFakeQuickChatConv();
                        if ((NullChecker.a(userM21483na) && !userM21483na.isFemale()) || z) {
                            CoreModule.f1534c.f3547D0.m6763B4(strM5843qc, "");
                        }
                    }
                }
            }
        }
        if (NullChecker.a(conversationM4786Xe) && "lovebuzz".equals(conversationM4786Xe.convType) && conversationM4786Xe.userMessageCount <= 3) {
            String strM6514s5 = CoreModule.f1534c.f3566J1.m6514s5(str);
            if (!TextUtils.isEmpty(strM6514s5)) {
                CoreModule.f1534c.f3566J1.m6485C5(conversationM4786Xe, strM6514s5);
            }
        }
        if (ura.m25555e().m25559d().m5877w()) {
            qtm.g(str);
        }
    }

    /* JADX INFO: renamed from: ml */
    public final /* synthetic */ void m4975ml(Optional optional) {
        if (optional.isPresent()) {
            if (Network.isConnected(CoreModule.f1533b)) {
                m4988nl((ConversationPatchRecord) optional.get());
            } else if (this.f3919d2 == null) {
                this.f3919d2 = ConnectivityReceiver.m().skip(1).distinctUntilChanged().filter(new w9j() { // from class: l.qb8
                    public final Object call(Object obj) {
                        NetworkInfo networkInfo = (NetworkInfo) obj;
                        return Boolean.valueOf(networkInfo != null && networkInfo.isConnected());
                    }
                }).observeOn(jo0.a()).subscribe(mkd0.G(new e30() { // from class: l.rb8
                    public final void call(Object obj) {
                        this.f20472a.m4962ll((NetworkInfo) obj);
                    }
                }));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: mm */
    public final /* synthetic */ void m4976mm(final String str, Throwable th) {
        if ((th instanceof TantanException.Client.CoreService) && ((TantanException.Client.CoreService) th).code == 40043) {
            this.f8580Q.f3598U.m13685a(new d30() { // from class: l.h28
                public final void call() {
                    this.f13643a.m4950km(str);
                }
            });
            if ("zh".equals(Locale.getDefault().getLanguage()) && "CN".equals(Locale.getDefault().getCountry())) {
                e51.G(new Runnable() { // from class: l.i28
                    @Override // java.lang.Runnable
                    public final void run() {
                        lsi0.y("恢复失败，对方可能账号异常或者已与您解除配对");
                    }
                });
            }
            e51.H(CoreModule.f1533b, new Runnable() { // from class: l.j28
                @Override // java.lang.Runnable
                public final void run() {
                    this.f14963a.m4963lm();
                }
            }, 500L);
            du2.a("svipRecoverConvFail", "code:40043;status:deleted;uid:" + str);
        }
    }

    /* JADX INFO: renamed from: mn */
    public void m4977mn(final Message message) {
        if (message == null) {
            return;
        }
        e51.y(new Runnable() { // from class: l.xy7
            @Override // java.lang.Runnable
            public final void run() {
                this.f27782a.m4612Ij(message);
            }
        });
    }

    /* JADX INFO: renamed from: mo */
    public rx.c<j760<Integer, Boolean>> m4978mo(String str) {
        if (ura.m25555e().m25559d().m5872v()) {
            return m4991no(str);
        }
        return mkd0.s(CoreModule.f1542k.f11195c.m26907h0(str).m(), CoreModule.f1542k.f11195c.m26902c0(str).m(), NullChecker.a(str) ? CoreModule.f1534c.f3631f0.m4667Ne(str).map(new w9j() { // from class: l.ds7
            public final Object call(Object obj) {
                return Integer.valueOf(((Conversation) obj).mm);
            }
        }) : rx.c.just(0), new y9j() { // from class: l.es7
            /* JADX INFO: renamed from: a */
            public final Object m14808a(Object obj, Object obj2, Object obj3) {
                return C0166g.m4113R7((List) obj, (List) obj2, (Integer) obj3);
            }
        });
    }

    /* JADX INFO: renamed from: mp */
    public void m4979mp(final boolean z) {
        final ArrayList arrayListN = vwb.n(vwb.f0(new String[]{(String) this.f8580Q.f3652m0.f3378Y0.get(), (String) this.f8580Q.f3652m0.f3381Z0.get(), (String) this.f8580Q.f3652m0.f3384a1.get()}), new w9j() { // from class: l.nb8
            public final Object call(Object obj) {
                return Boolean.valueOf(!TextUtils.isEmpty((String) obj));
            }
        });
        if (arrayListN.isEmpty()) {
            return;
        }
        e51.y(new Runnable() { // from class: l.ob8
            @Override // java.lang.Runnable
            public final void run() {
                this.f18127a.m4781Wl(arrayListN, z);
            }
        });
    }

    /* JADX INFO: renamed from: mq */
    public void m4980mq(Conversation conversation) {
        CoreModule.f1542k.f11205m.upsert(conversation);
    }

    /* JADX INFO: renamed from: ne */
    public rx.c<Meta> m4981ne(final String str, final String str2) {
        return this.f8580Q.scheduled(C0154a.m3202Z("/v2/surveys/" + str + "/answers"), -1, new v9j() { // from class: l.k58
            public final Object call() {
                return ia20.m16571e(new v9j() { // from class: l.x88
                    public final Object call() {
                        return C0154a.f3483P.auth().q(C0154a.m3202Z("/v2/surveys/" + str + "/answers")).l(utc0.create(Network.JSON, str)).b();
                    }
                }).compose(mkd0.C()).map(new w9j() { // from class: l.y88
                    public final Object call(Object obj) {
                        return C0166g.m4499z8((Envelope) obj);
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: nf */
    public final String m4982nf(Links links) {
        return (links == null || TextUtils.isEmpty(links.next)) ? C0154a.m3110B("limit=10") : C0154a.m3110B(links.next);
    }

    /* JADX INFO: renamed from: ng */
    public rx.c<List<Conversation>> m4983ng() {
        return ((orh0.a) CoreModule.f1542k.f11205m.f15243w.b()).m();
    }

    /* JADX INFO: renamed from: nh */
    public void m4984nh(String str, Questionnaire questionnaire) {
        if (questionnaire == null) {
            return;
        }
        Message messageNew_ = Message.new_();
        messageNew_.messageType = MessageType.get("local_ux_questionnaire");
        messageNew_.cid = str;
        messageNew_.localInConversation = true;
        long jO = mqi0.o();
        messageNew_.owner = CoreModule.m1850H().userId();
        messageNew_.createdTime = jO;
        messageNew_.localCreatedTime = jO;
        messageNew_.recalled = Boolean.FALSE;
        messageNew_.hostId = CoreModule.m1850H().userId();
        tpd0 tpd0Var = App.i;
        messageNew_.localCreatedSession = ((Integer) tpd0Var.get()).intValue();
        ((DbObject) messageNew_).id = DbObject.GENERATE_UNIQUE_FAKE_ID(((Integer) tpd0Var.get()).intValue());
        MessageAdditionalData messageAdditionalDataNew_ = MessageAdditionalData.new_();
        messageNew_.additionalData = messageAdditionalDataNew_;
        messageAdditionalDataNew_.localUXQuestionnaire = questionnaire;
        messageNew_.value = questionnaire.title;
        m4784Wo(str, messageNew_);
    }

    /* JADX INFO: renamed from: ni */
    public final /* synthetic */ void m4985ni() {
        this.f8580Q.f3598U.m13685a(new d30() { // from class: l.tt7
            public final void call() {
                CoreModule.f1542k.f11195c.delete(Message.MESSAGETYPE.EQ("live_vip_greet"));
            }
        });
    }

    /* JADX INFO: renamed from: nj */
    public final /* synthetic */ void m4986nj(final Envelope envelope, ArrayList arrayList, ArrayList arrayList2, DbLinks dbLinks) {
        m5147zq(envelope.getModuleData(CoreData.class).conversations);
        vwb.z(arrayList, new e30() { // from class: l.x48
            public final void call(Object obj) {
                this.f27341a.m4960lj(envelope, (Conversation) obj);
            }
        });
        if (!vwb.J(arrayList2)) {
            vwb.z(arrayList2, new e30() { // from class: l.y48
                public final void call(Object obj) {
                    this.f28002a.m4973mj((Conversation) obj);
                }
            });
        }
        qib0.f19813k0.f23550c.upsert(dbLinks);
        m5060tf(envelope);
    }

    /* JADX INFO: renamed from: nk */
    public final /* synthetic */ void m4987nk(Envelope envelope, d30 d30Var, boolean z, String str, Message message) {
        if (vwb.J(envelope.getModuleData(CoreData.class).messages)) {
            CrashHelper.i(new Exception("return null messages"), "core_post_simple", CrashHelper.ReportLevel.p5, 100);
            return;
        }
        if (d30Var != null) {
            d30Var.call();
        }
        Message message2 = (Message) envelope.getModuleData(CoreData.class).messages.get(0);
        if (z) {
            message2.localInConversation = true;
            message2.localInMoment = true;
        }
        Conversation conversationM4665Mo = m4665Mo(str);
        if (conversationM4665Mo == null) {
            if (ura.m25555e().m25559d().m5745c()) {
                if (message.cid == null) {
                    message.cid = str;
                }
                if (m4677No(message.cid) == null) {
                    DbLinks dbLinks = new DbLinks();
                    ((DbObject) dbLinks).id = message.cid;
                    dbLinks.links = Links.new_();
                    CoreModule.f1542k.f11196d.upsert(dbLinks);
                }
            }
            conversationM4665Mo = m4713Qo(message);
        }
        conversationM4665Mo.latestTime = message2.createdTime;
        if (!z) {
            conversationM4665Mo.localHasMessage = true;
        }
        CoreModule.f1542k.f11205m.upsert(conversationM4665Mo);
    }

    /* JADX INFO: renamed from: nm */
    public final /* synthetic */ void m4989nm(String str) {
        Conversation conversationM4665Mo = m4665Mo(str);
        if (NullChecker.a(conversationM4665Mo)) {
            CoreModule.f1542k.f11205m.delete(str);
        }
        m5044rp(conversationM4665Mo);
    }

    /* JADX INFO: renamed from: nn */
    public List<Conversation> m4990nn() {
        return ((orh0.a) CoreModule.f1542k.f11205m.f15221N.b()).j();
    }

    /* JADX INFO: renamed from: no */
    public rx.c<j760<Integer, Boolean>> m4991no(String str) {
        return mkd0.s(CoreModule.f1542k.f11195c.m26907h0(str).m(), CoreModule.f1542k.f11195c.m26902c0(str).m(), NullChecker.a(str) ? CoreModule.f1534c.f3631f0.m4667Ne(str).map(new w9j() { // from class: l.hz7
            public final Object call(Object obj) {
                return C0166g.m4363n6((Conversation) obj);
            }
        }) : rx.c.just(0), new y9j() { // from class: l.iz7
            /* JADX INFO: renamed from: a */
            public final Object m17148a(Object obj, Object obj2, Object obj3) {
                return C0166g.m4006Ha((List) obj, (List) obj2, (Integer) obj3);
            }
        });
    }

    /* JADX INFO: renamed from: np */
    public rx.c<roj0> m4992np(final MessageType messageType) {
        return this.f8580Q.now(rx.c.fromCallable(new Callable() { // from class: l.hx7
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f14114a.m4793Xl(messageType);
            }
        }).compose(C0154a.m3182T2()));
    }

    /* JADX INFO: renamed from: nq */
    public void m4993nq(final String str, final String str2) {
        e51.y(new Runnable() { // from class: l.f08
            @Override // java.lang.Runnable
            public final void run() {
                this.f11547a.m4539Cm(str, str2);
            }
        });
    }

    /* JADX INFO: renamed from: oe */
    public rx.c<roj0> m4994oe() {
        return this.f8580Q.scheduled("batchMarriagePatch", -1, new v9j() { // from class: l.lu7
            public final Object call() {
                return this.f16647a.m4573Fh();
            }
        });
    }

    /* JADX INFO: renamed from: of */
    public Message m4995of(String str, MessageType messageType) {
        return m5008pf(str, messageType, "");
    }

    /* JADX INFO: renamed from: og */
    public rx.c<Boolean> m4996og() {
        return this.f3830A0.asObservable();
    }

    /* JADX INFO: renamed from: oh */
    public void m4997oh(String str, String str2) {
        Message messageNew_ = Message.new_();
        messageNew_.messageType = MessageType.get("local_user_moment_message");
        messageNew_.cid = str;
        messageNew_.localInConversation = true;
        long jGuessedCurrentServerTime = qib0.f19784H.guessedCurrentServerTime();
        messageNew_.owner = CoreModule.m1850H().userId();
        messageNew_.createdTime = jGuessedCurrentServerTime;
        messageNew_.localCreatedTime = jGuessedCurrentServerTime;
        messageNew_.recalled = Boolean.FALSE;
        messageNew_.hostId = CoreModule.m1850H().userId();
        tpd0 tpd0Var = App.i;
        messageNew_.localCreatedSession = ((Integer) tpd0Var.get()).intValue();
        ((DbObject) messageNew_).id = DbObject.GENERATE_UNIQUE_FAKE_ID(((Integer) tpd0Var.get()).intValue());
        messageNew_.value = "";
        messageNew_.msgData = str2;
        m4824ah(messageNew_, false);
    }

    /* JADX INFO: renamed from: oi */
    public final /* synthetic */ roj0 m4998oi(final String str) throws Exception {
        this.f8580Q.f3598U.m13685a(new d30() { // from class: l.kp7
            public final void call() {
                C0166g.m3937B7(str);
            }
        });
        return roj0.a;
    }

    /* JADX INFO: renamed from: ok */
    public final /* synthetic */ roj0 m5000ok(final d30 d30Var, final boolean z, final String str, final Message message, final Envelope envelope) {
        this.f8580Q.m3422w3(envelope, new d30() { // from class: l.b68
            public final void call() {
                this.f8737a.m4987nk(envelope, d30Var, z, str, message);
            }
        });
        return roj0.a;
    }

    /* JADX INFO: renamed from: ol */
    public final /* synthetic */ roj0 m5001ol() throws Exception {
        List listJ = CoreModule.f1542k.f11204l.m14042F().j();
        if (vwb.J(listJ) || listJ.get(0) == null) {
            this.f3982y2 = false;
        } else {
            this.f3982y2 = true;
            final ConversationPatchRecord conversationPatchRecord = (ConversationPatchRecord) listJ.get(0);
            e51.G(new Runnable() { // from class: l.k28
                @Override // java.lang.Runnable
                public final void run() {
                    this.f15559a.m4988nl(conversationPatchRecord);
                }
            });
        }
        return roj0.a;
    }

    /* JADX INFO: renamed from: om */
    public final /* synthetic */ void m5002om(String str) {
        Conversation conversationM4665Mo = m4665Mo(str);
        if (NullChecker.a(conversationM4665Mo)) {
            conversationM4665Mo.unmatchConversation = false;
            CoreModule.f1542k.f11205m.upsert(conversationM4665Mo);
        }
    }

    /* JADX INFO: renamed from: on */
    public rx.c<q860<Conversation>> m5003on() {
        return m4679Oe(m4655Me().f15236p);
    }

    /* JADX INFO: renamed from: oo */
    public rx.c<Message> m5004oo() {
        return this.f3914c0.observeOn(jo0.a());
    }

    /* JADX INFO: renamed from: op */
    public rx.c<roj0> m5005op(String str) {
        final String strM27257p = xh5.m27257p("/friends");
        final JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(str);
        try {
            jSONObject.put("userIds", jSONArray);
            jSONObject.put("action", "block");
        } catch (JSONException unused) {
        }
        return this.f8580Q.scheduled("conversations/remove/recommend", -1, new v9j() { // from class: l.r68
            public final Object call() {
                return new la20(new v9j() { // from class: l.x78
                    public final Object call() {
                        return C0154a.f3483P.auth().q(str).l(utc0.create(Network.JSON, jSONObject.toString())).b();
                    }
                }).map(new w9j() { // from class: l.y78
                    public final Object call(Object obj) {
                        return roj0.a;
                    }
                }).compose(C0154a.m3182T2());
            }
        });
    }

    @TestOnly
    /* JADX INFO: renamed from: oq */
    public void m5006oq(ChatGameInfo chatGameInfo) {
        this.f3937j2 = chatGameInfo;
        this.f3934i2.put(chatGameInfo.toJson());
    }

    /* JADX INFO: renamed from: pe */
    public rx.c<roj0> m5007pe() {
        return this.f8580Q.scheduled("batchNewMatchPatch", -1, new v9j() { // from class: l.iy7
            public final Object call() {
                return this.f14874a.m4610Ih();
            }
        });
    }

    /* JADX INFO: renamed from: pf */
    public Message m5008pf(String str, MessageType messageType, String str2) {
        Message messageNew_ = Message.new_();
        messageNew_.cid = str;
        tpd0 tpd0Var = App.i;
        ((DbObject) messageNew_).id = DbObject.GENERATE_UNIQUE_FAKE_ID(((Integer) tpd0Var.get()).intValue());
        messageNew_.messageType = messageType;
        messageNew_.localCreatedTime = mqi0.o();
        messageNew_.createdTime = mqi0.o();
        messageNew_.localCreatedSession = ((Integer) tpd0Var.get()).intValue();
        messageNew_.localInConversation = true;
        messageNew_.owner = CoreModule.m1850H().userId();
        messageNew_.recalled = Boolean.FALSE;
        messageNew_.value = str2;
        return messageNew_;
    }

    /* JADX INFO: renamed from: pg */
    public rx.c<Surveys> m5009pg(final String str) {
        return scheduled(C0154a.m3202Z("/v2/surveys/" + str), 0, new v9j() { // from class: l.y28
            public final Object call() {
                return ia20.m16567a(new v9j() { // from class: l.f58
                    public final Object call() {
                        return C0154a.f3483P.auth().q(C0154a.m3202Z("/v2/surveys/" + str)).b();
                    }
                }).map(new w9j() { // from class: l.g58
                    public final Object call(Object obj) {
                        return C0166g.m4305i3((Envelope) obj);
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: ph */
    public rx.c<q860<Conversation>> m5010ph() {
        return m4679Oe(m4655Me().m17615z0());
    }

    /* JADX INFO: renamed from: pi */
    public final /* synthetic */ roj0 m5011pi(final String str) throws Exception {
        this.f8580Q.f3598U.m13685a(new d30() { // from class: l.yw7
            public final void call() {
                CoreModule.f1542k.f11195c.delete(Filter.AND(new Filter[]{Message.CID.EQ(str), Message.MESSAGETYPE.EQ("local_birthday_tip")}));
            }
        });
        return roj0.a;
    }

    /* JADX INFO: renamed from: pj */
    public final /* synthetic */ void m5012pj(roj0 roj0Var) {
        this.f3979x2 = false;
    }

    /* JADX INFO: renamed from: pk */
    public final /* synthetic */ rx.c m5013pk(final String str, final Message message, final d30 d30Var, final boolean z) {
        return m4120Ro(str, message).map(new w9j() { // from class: l.u28
            public final Object call(Object obj) {
                return this.f22427a.m5000ok(d30Var, z, str, message, (Envelope) obj);
            }
        }).compose(C0154a.m3182T2());
    }

    /* JADX INFO: renamed from: pl */
    public final /* synthetic */ rx.c m5014pl() {
        return rx.c.fromCallable(new Callable() { // from class: l.i18
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f14190a.m5001ol();
            }
        }).compose(C0154a.m3182T2());
    }

    /* JADX INFO: renamed from: pm */
    public final /* synthetic */ roj0 m5015pm(final String str, Envelope envelope) {
        if (envelope.meta.code != 40043) {
            this.f8580Q.m3423x3(envelope, new d30() { // from class: l.g38
                public final void call() {
                    this.f13038a.m5002om(str);
                }
            }, true);
            return roj0.a;
        }
        du2.a("svipRecoverConvFail", "code:40043;status:deleted;uid:" + str);
        this.f8580Q.f3598U.m13685a(new d30() { // from class: l.e38
            public final void call() {
                this.f10741a.m4989nm(str);
            }
        });
        if ("zh".equals(Locale.getDefault().getLanguage()) && "CN".equals(Locale.getDefault().getCountry())) {
            e51.G(new Runnable() { // from class: l.f38
                @Override // java.lang.Runnable
                public final void run() {
                    lsi0.y("恢复失败，对方可能账号异常或者已与您解除配对");
                }
            });
        }
        return roj0.a;
    }

    /* JADX INFO: renamed from: pn */
    public rx.c<q860<Conversation>> m5016pn(List<String> list) {
        return m4679Oe(m4655Me().m17577W0(list));
    }

    /* JADX INFO: renamed from: po */
    public int m5017po() {
        jl6 jl6Var = CoreModule.f1542k.f11205m;
        Filter filterEQ = Conversation.LOCALPLACEBAN.EQ("both");
        TEnumColumn tEnumColumn = Conversation.STATUS;
        return jl6Var.sum(Filter.AND(new Filter[]{filterEQ, tEnumColumn.NEQ("local_fake"), tEnumColumn.NEQ("deleted"), tEnumColumn.NEQ("removed"), tEnumColumn.NEQ("invisible"), tEnumColumn.NEQ("dismissed")}), Conversation.UNREADMESSAGES);
    }

    /* JADX INFO: renamed from: pp */
    public void m5018pp() {
        e51.z(new Runnable() { // from class: l.jb8
            @Override // java.lang.Runnable
            public final void run() {
                this.f15099a.m4805Yl();
            }
        }, false);
    }

    /* JADX INFO: renamed from: pq */
    public void m5019pq(final String str) {
        CoreModule.f1542k.f11195c.m26901b0(str).m().filter(new w9j() { // from class: l.xa8
            public final Object call(Object obj) {
                return Boolean.valueOf(!vwb.J((List) obj));
            }
        }).map(new w9j() { // from class: l.ya8
            public final Object call(Object obj) {
                return C0166g.m4177X4((List) obj);
            }
        }).take(1).subscribe(mkd0.G(new e30() { // from class: l.za8
            public final void call(Object obj) {
                this.f28682a.m4552Dm(str, (Message) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: qe */
    public rx.c<roj0> m5020qe(final String str, final Act act) {
        return this.f8580Q.scheduled("block", -1, new v9j() { // from class: l.b18
            public final Object call() {
                return this.f8654a.m4646Lh(str, act);
            }
        });
    }

    /* JADX INFO: renamed from: qf, reason: merged with bridge method [inline-methods] */
    public void m4658Mh(String str) {
        m5034rf(str, false);
    }

    /* JADX INFO: renamed from: qg */
    public List<Message> m5022qg(String str, double d2) {
        wxz wxzVar = CoreModule.f1542k.f11195c;
        Filter filterEQ = Message.CID.EQ(str);
        DoubleColumn doubleColumn = Message.CREATEDTIME;
        return Lists.q(wxzVar.query(Filter.AND(new Filter[]{filterEQ, doubleColumn.REQ(Double.valueOf(d2 + 1.0d))}), ((OrderedColumn) doubleColumn).DESC, -1));
    }

    /* JADX INFO: renamed from: qh */
    public rx.c<q860<Conversation>> m5023qh() {
        return m4679Oe(m4655Me().m17555A0());
    }

    /* JADX INFO: renamed from: qi */
    public final /* synthetic */ roj0 m5024qi(final String str) throws Exception {
        this.f8580Q.f3598U.m13685a(new d30() { // from class: l.mx7
            public final void call() {
                C0166g.m4382p3(str);
            }
        });
        return roj0.a;
    }

    /* JADX INFO: renamed from: qj */
    public final /* synthetic */ void m5025qj(DbLinks dbLinks) {
        if (this.f3979x2 && !this.f3982y2) {
            m4617Io(Links.decodedApiTime(dbLinks.links.previous, "since")).subscribe(mkd0.H(new e30() { // from class: l.n28
                public final void call(Object obj) {
                    this.f17448a.m5012pj((roj0) obj);
                }
            }, new e30() { // from class: l.o28
                public final void call(Object obj) {
                    C0166g.m4243cd((Throwable) obj);
                }
            }));
        }
        if (this.f3877P2) {
            return;
        }
        m4505Ae();
        this.f3877P2 = true;
    }

    /* JADX INFO: renamed from: qk */
    public final /* synthetic */ roj0 m5026qk(Message message, d30 d30Var, Envelope envelope) {
        if (!vwb.J(envelope.getModuleData(CoreData.class).messages) && TextUtils.equals(((DbObject) ((Message) envelope.getModuleData(CoreData.class).messages.get(0))).id, ((DbObject) message).id)) {
            ((Message) envelope.getModuleData(CoreData.class).messages.get(0)).cid = message.cid;
        }
        this.f8580Q.m3422w3(envelope, d30Var);
        return roj0.a;
    }

    /* JADX INFO: renamed from: ql */
    public final /* synthetic */ void m5027ql(Envelope envelope) {
        this.f8580Q.m3422w3(envelope, new d30() { // from class: l.y98
            public final void call() {
                C0166g.m4404r3();
            }
        });
    }

    /* JADX INFO: renamed from: qm */
    public final /* synthetic */ void m5028qm() {
        this.f8580Q.f3631f0.m4889fn(null);
        this.f8580Q.f3631f0.m4580Fo();
        CoreModule.f1534c.f3631f0.m4868dq(qib0.f19784H.guessedCurrentServerTime());
    }

    /* JADX INFO: renamed from: qn */
    public rx.c<List<Conversation>> m5029qn() {
        return CoreModule.f1542k.f11205m.m17578X0(mqi0.n()).m();
    }

    /* JADX INFO: renamed from: qo */
    public rx.c<List<Conversation>> m5030qo() {
        return CoreModule.f1542k.f11205m.f15246z.m();
    }

    /* JADX INFO: renamed from: qp */
    public rx.c<roj0> m5031qp(String str, String str2, Report report) {
        return this.f8580Q.f3607X.m14303h3(C0154a.m3143J0("/conversations/" + str + "/messages/" + str2 + "/reports"), report);
    }

    /* JADX INFO: renamed from: qq */
    public void m5032qq(final double d2) {
        e51.y(new Runnable() { // from class: l.wa8
            @Override // java.lang.Runnable
            public final void run() {
                this.f25059a.m4565Em(d2);
            }
        });
    }

    /* JADX INFO: renamed from: re, reason: merged with bridge method [inline-methods] */
    public rx.c<roj0> m5116xl(final String str) {
        return this.f8580Q.scheduled("blocked", -1, new v9j() { // from class: l.o18
            public final Object call() {
                return this.f17974a.m4682Oh(str);
            }
        });
    }

    /* JADX INFO: renamed from: rf */
    public void m5034rf(String str, boolean z) {
        du2.a("db_deleteConversationAndRelated", "id:" + str);
        if (z) {
            return;
        }
        CoreModule.f1542k.f11205m.delete(Conversation.ID.EQ(str));
        CoreModule.f1542k.f11195c.m26883J(str);
        CoreModule.f1542k.f11196d.delete(str);
        CoreModule.m1853N().yj(str);
        CoreModule.f1542k.f11204l.delete(str);
        if (ura.m25555e().m25559d().m5745c() && TextUtils.equals(str, ura.m25555e().m25559d().m5714Wj())) {
            qib0.f19813k0.f23551d.delete(str);
        }
    }

    /* JADX INFO: renamed from: rg */
    public rx.c<Boolean> m5035rg(final String str) {
        return this.f8580Q.scheduled("get_other_share_status" + str, 0, new v9j() { // from class: l.w68
            public final Object call() {
                return ia20.m16567a(new v9j() { // from class: l.fx7
                    public final Object call() {
                        return C0154a.f3483P.auth().q(C0154a.m3130G("/users/" + str + "/settings?&type=default")).f().b();
                    }
                }).map(new w9j() { // from class: l.gx7
                    public final Object call(Object obj) {
                        return C0166g.m4386p7((Envelope) obj);
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: rh */
    public rx.c<q860<Conversation>> m5036rh() {
        return m4679Oe(m4655Me().m17556B0());
    }

    /* JADX INFO: renamed from: ri */
    public final /* synthetic */ roj0 m5037ri(final String str) throws Exception {
        this.f8580Q.f3598U.m13685a(new d30() { // from class: l.or7
            public final void call() {
                C0166g.m4083Oa(str);
            }
        });
        return roj0.a;
    }

    /* JADX INFO: renamed from: rj */
    public final /* synthetic */ roj0 m5038rj(final DbLinks dbLinks) throws Exception {
        DbLinks dbLinksM4677No;
        Envelope envelope;
        final String strM3302y0 = C0154a.m3302y0(dbLinks.links.previous);
        final Envelope envelope2 = (Envelope) new la20(new v9j() { // from class: l.tx7
            public final Object call() {
                return C0154a.f3483P.auth().q(strM3302y0).f().b();
            }
        }).toBlocking().b();
        CoreModule.f1534c.f3637h0.m25600m3(envelope2);
        final ArrayList arrayList = new ArrayList();
        final ArrayList arrayList2 = new ArrayList();
        StringBuilder sb = null;
        if (!vwb.J(envelope2.getModuleData(CoreData.class).conversations)) {
            StringBuilder sb2 = null;
            for (int i = 0; i < envelope2.getModuleData(CoreData.class).conversations.size(); i++) {
                final Conversation conversation = (Conversation) envelope2.getModuleData(CoreData.class).conversations.get(i);
                if (conversation != null) {
                    if (TEnum.equals(conversation.status, "deleted")) {
                        arrayList.add(conversation);
                    } else if (TEnum.equals(conversation.status, "dismissed")) {
                        arrayList2.add(conversation);
                    }
                    if (TEnum.equals(conversation.status, "dismissed") || TEnum.equals(conversation.status, "deleted")) {
                        if (sb2 == null) {
                            sb2 = new StringBuilder();
                        }
                        sb2.append(conversation.otherUser);
                        sb2.append(" ");
                        sb2.append(conversation.createdTime);
                        sb2.append(" ");
                        sb2.append((NullChecker.a(conversation.status) && NullChecker.a(conversation.status.toString())) ? conversation.status.toString() : "status_null");
                        sb2.append("\n");
                    }
                    if (TEnum.equals(conversation.status, CameraSticker.CATEGORY_DEFAULT_FILTER) && vwb.r(CoreModule.f1542k.f11195c.m26896W(((DbObject) conversation).id).j(), new w9j() { // from class: l.ux7
                        public final Object call(Object obj) {
                            return Boolean.valueOf(TEnum.equals(((Message) obj).status(), "normal"));
                        }
                    }) != null) {
                        if (!ura.m25555e().m25559d().m5613E() || !ura.m25555e().m25559d().m5664Nd(conversation)) {
                            PartialIdList partialIdList = conversation.api_only_messages;
                            String str = partialIdList == null ? null : (String) vwb.P(partialIdList.ids);
                            while (true) {
                                PartialIdList partialIdList2 = conversation.api_only_messages;
                                if (partialIdList2 == null || partialIdList2.links.next == null || CoreModule.f1542k.f11195c.query(str) != null || (envelope = (Envelope) new la20(new v9j() { // from class: l.vx7
                                    public final Object call() {
                                        Conversation conversation2 = conversation;
                                        return C0154a.f3483P.auth().q(C0154a.m3165P0(((DbObject) conversation2).id, conversation2.api_only_messages.links.next)).f().b();
                                    }
                                }).toBlocking().c((Object) null)) == null) {
                                    break;
                                }
                                conversation.api_only_messages.links.next = envelope.pagination.links.next;
                                envelope2.addAll(envelope);
                                List list = envelope.getModuleData(CoreData.class).messages;
                                if (list.isEmpty()) {
                                    break;
                                }
                                str = ((DbObject) ((Message) envelope.getModuleData(CoreData.class).messages.get(list.size() - 1))).id;
                            }
                            PartialIdList partialIdList3 = conversation.api_only_messages;
                            if (partialIdList3 != null && partialIdList3.links.next != null && CoreModule.f1542k.f11195c.query(str) != null && (dbLinksM4677No = m4677No(((DbObject) conversation).id)) != null) {
                                conversation.api_only_messages.links.next = dbLinksM4677No.links.next;
                            }
                        } else if (TextUtils.equals(ura.m25555e().m25559d().m5733af(), conversation.otherUser)) {
                            m5140zj(((DbObject) conversation).id);
                        }
                    }
                }
            }
            sb = sb2;
        }
        if (NullChecker.a(sb)) {
            du2.a("loadNewConversationsDeleted", sb.toString());
        }
        String str2 = envelope2.pagination.links.previous;
        if (str2 != null) {
            dbLinks.links.previous = str2;
        }
        if (!vwb.J(envelope2.getModuleData(CoreData.class).conversations)) {
            envelope2.getModuleData(CoreData.class).conversations.removeAll(arrayList);
        }
        if (ura.m25555e().m25559d().m5668Oc()) {
            ura.m25555e().m25559d().m5670Oe(envelope2, strM3302y0, false);
        }
        this.f8580Q.m3424y3(envelope2, new d30() { // from class: l.yx7
            public final void call() {
                this.f28466a.m4986nj(envelope2, arrayList, arrayList2, dbLinks);
            }
        }, false, false, false);
        this.f3973v2.put(Long.valueOf(qib0.f19784H.guessedCurrentServerTime()));
        if (vwb.J(envelope2.getModuleData(CoreData.class).conversations) || envelope2.getModuleData(CoreData.class).conversations.size() < envelope2.pagination.limit) {
            e51.H(CoreModule.f1533b, new Runnable() { // from class: l.ay7
                @Override // java.lang.Runnable
                public final void run() {
                    this.f8594a.m5025qj(dbLinks);
                }
            }, 100L);
        } else {
            e51.H(CoreModule.f1533b, new Runnable() { // from class: l.zx7
                @Override // java.lang.Runnable
                public final void run() {
                    this.f29019a.m4999oj(dbLinks);
                }
            }, 100L);
        }
        return roj0.a;
    }

    /* JADX INFO: renamed from: rk */
    public final /* synthetic */ rx.c m5039rk(final Message message, final d30 d30Var) {
        final Message message2 = new Message();
        message2.recalled = Boolean.TRUE;
        return new la20((v9j<stc0>) new v9j() { // from class: l.h88
            public final Object call() {
                Message message3 = message;
                return C0154a.f3483P.auth().q(C0154a.m3172R0(message3.cid, ((DbObject) message3).id) + "&method=patch").l(utc0.create(Network.JSON, message2.toJson())).b();
            }
        }, 0).map(new w9j() { // from class: l.i88
            public final Object call(Object obj) {
                return this.f14297a.m5026qk(message, d30Var, (Envelope) obj);
            }
        }).compose(C0154a.m3182T2());
    }

    /* JADX INFO: renamed from: rl */
    public final /* synthetic */ void m5040rl(Message message, Throwable th) {
        final Message messageClone = message.clone();
        this.f8580Q.f3598U.m13685a(new d30() { // from class: l.w98
            public final void call() {
                CoreModule.f1542k.f11195c.upsert(messageClone);
            }
        });
    }

    /* JADX INFO: renamed from: rm */
    public final /* synthetic */ roj0 m5041rm(String str, roj0 roj0Var) {
        this.f3865L2.onNext(str);
        CoreModule.f1534c.f3652m0.m2924E8(str);
        e51.H(CoreModule.f1533b, new Runnable() { // from class: l.k48
            @Override // java.lang.Runnable
            public final void run() {
                this.f15608a.m5028qm();
            }
        }, 500L);
        return roj0Var;
    }

    /* JADX INFO: renamed from: rn */
    public rx.c<List<Conversation>> m5042rn() {
        return (ura.m25555e().m25559d().m5739b() ? m4655Me().m17579Y0() : m4655Me().m17580Z0()).m();
    }

    /* JADX INFO: renamed from: ro, reason: merged with bridge method [inline-methods] */
    public rx.c<roj0> m4988nl(final ConversationPatchRecord conversationPatchRecord) {
        return this.f8580Q.scheduled("patch_record_" + ((DbObject) conversationPatchRecord).id, -1, new v9j() { // from class: l.ot7
            public final Object call() {
                return this.f18362a.m4685Ok(conversationPatchRecord);
            }
        });
    }

    /* JADX INFO: renamed from: rp */
    public final void m5044rp(Conversation conversation) {
        CrashHelper.c(new Exception("Conv Banned change Error detail:" + conversation.toJson()));
    }

    /* JADX INFO: renamed from: rq */
    public rx.c<roj0> m5045rq(final String str, final double d2) {
        return this.f8580Q.now(rx.c.fromCallable(new Callable() { // from class: l.m28
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f16755a.m4578Fm(str, d2);
            }
        }).compose(C0154a.m3182T2()));
    }

    /* JADX INFO: renamed from: se */
    public rx.c<roj0> m5046se(String str) {
        return CoreModule.m1850H().userId().equals(str) ? rx.c.empty() : m4655Me().uiGet(str).filter(new w9j() { // from class: l.lx7
            public final Object call(Object obj) {
                return Boolean.valueOf(((Conversation) obj) == null);
            }
        }).map(new w9j() { // from class: l.wx7
            public final Object call(Object obj) {
                return roj0.a;
            }
        });
    }

    /* JADX INFO: renamed from: sf */
    public void m5047sf(String str) {
        if (m4931jg(str, true)) {
            return;
        }
        CoreModule.f1542k.f11195c.m26883J(str);
        CoreModule.f1542k.f11196d.delete(str);
        CoreModule.f1542k.f11204l.delete(str);
    }

    /* JADX INFO: renamed from: sg */
    public rx.c<List<Prologue>> m5048sg(final String str, final String str2) {
        return this.f8580Q.scheduled("getPrologues", 0, new v9j() { // from class: l.a28
            public final Object call() {
                return ia20.m16567a(new v9j() { // from class: l.x58
                    public final Object call() {
                        return C0154a.f3483P.auth().q(C0154a.m3137H2("/users/me/prologues/" + str + "?scene=" + str)).f().b();
                    }
                }).map(new w9j() { // from class: l.y58
                    public final Object call(Object obj) {
                        return ((Envelope) obj).getModuleData(CoreData.class).prologues;
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: sh */
    public rx.c<List<Conversation>> m5049sh() {
        return ((orh0.a) CoreModule.f1542k.f11205m.m17557C0().b()).m();
    }

    /* JADX INFO: renamed from: si */
    public final /* synthetic */ void m5050si(final String str, final String str2) {
        this.f8580Q.f3598U.m13685a(new d30() { // from class: l.rr7
            public final void call() {
                CoreModule.f1542k.f11195c.delete(Filter.AND(new Filter[]{Message.CID.EQ(str), Message.MESSAGETYPE.EQ(str2)}));
            }
        });
    }

    /* JADX INFO: renamed from: sj */
    public final /* synthetic */ void m5051sj(ChatNewMatchEnvelope chatNewMatchEnvelope, List list, String str, String str2, int i) {
        m4854cn(chatNewMatchEnvelope.pagination.links.next, list, str, str2, i);
    }

    /* JADX INFO: renamed from: sk */
    public final /* synthetic */ void m5052sk(Envelope envelope, String str, String str2, boolean z, String str3) {
        if (!vwb.J(envelope.getModuleData(CoreData.class).messages)) {
            for (Message message : envelope.getModuleData(CoreData.class).messages) {
                if (TextUtils.equals(str, ((DbObject) message).id) && !TextUtils.isEmpty(str2) && NullChecker.a(message.getAiChatMessageExtraInfo())) {
                    message.getAiChatMessageExtraInfo().scene = str2;
                }
                if (TextUtils.equals(str, ((DbObject) message).id) && TEnum.equals(message.status, "deleted") && z) {
                    this.f3871N2.put(str, message);
                    this.f3874O2.onNext(roj0.a);
                }
                if (message.isGroupMessage()) {
                    message.cid = str3;
                }
            }
        }
        m5060tf(envelope);
    }

    /* JADX INFO: renamed from: sl */
    public final /* synthetic */ rx.c m5053sl(final Message message, String str, final String str2, final String str3) {
        final Message messageClone = message.clone();
        if (messageClone.additionalData == null) {
            messageClone.additionalData = MessageAdditionalData.new_();
        }
        MessageAdditionalData messageAdditionalData = messageClone.additionalData;
        if (messageAdditionalData.harassAlertInfo == null) {
            messageAdditionalData.harassAlertInfo = HarassAlertInfo.new_();
        }
        messageClone.additionalData.harassAlertInfo.status = str;
        return ia20.m16571e(new v9j() { // from class: l.c88
            public final Object call() {
                return C0154a.f3483P.auth().q(C0154a.m3184U0("/conversations/" + str2 + "/messages/" + str3 + "?action=feedbackHarassAlert&method=patch")).l(utc0.create(Network.JSON, messageClone.toJson())).b();
            }
        }).doOnNext(new e30() { // from class: l.e88
            public final void call(Object obj) {
                this.f10841a.m5027ql((Envelope) obj);
            }
        }).doOnError(new e30() { // from class: l.f88
            public final void call(Object obj) {
                this.f12550a.m5040rl(message, (Throwable) obj);
            }
        }).map(new w9j() { // from class: l.g88
            public final Object call(Object obj) {
                return roj0.a;
            }
        });
    }

    /* JADX INFO: renamed from: sm */
    public final /* synthetic */ rx.c m5054sm(final String str) {
        return new la20(new v9j() { // from class: l.qz7
            public final Object call() {
                return C0154a.f3483P.auth().q(C0154a.m3297x(str)).k(utc0.create(Network.JSON, "{\"status\":\"default\"}")).b();
            }
        }).doOnError(new e30() { // from class: l.rz7
            public final void call(Object obj) {
                this.f20925a.m4976mm(str, (Throwable) obj);
            }
        }).map(new w9j() { // from class: l.sz7
            public final Object call(Object obj) {
                return this.f21773a.m5015pm(str, (Envelope) obj);
            }
        }).compose(mkd0.C()).map(new w9j() { // from class: l.tz7
            public final Object call(Object obj) {
                return this.f22355a.m5041rm(str, (roj0) obj);
            }
        });
    }

    /* JADX INFO: renamed from: sn */
    public rx.c<q860<Conversation>> m5055sn() {
        return mkd0.r(m5068tn(), qib0.f19813k0.f23550c.uiGet("conversations"), new x9j() { // from class: l.kb8
            public final Object call(Object obj, Object obj2) {
                return this.f15684a.m4624Jj((List) obj, (DbLinks) obj2);
            }
        });
    }

    /* JADX INFO: renamed from: so */
    public rx.c<roj0> m5056so(final String str) {
        return this.f8580Q.scheduled("patch", -1, new v9j() { // from class: l.ox7
            public final Object call() {
                return this.f18471a.m4613Ik(str);
            }
        });
    }

    /* JADX INFO: renamed from: sp */
    public void m5057sp() {
        final String str = (String) this.f3857J0.get();
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f8580Q.scheduled("remote/male/countdownlike/" + str, -1, new v9j() { // from class: l.d48
            public final Object call() {
                return ia20.m16567a(new v9j() { // from class: l.w58
                    public final Object call() {
                        return C0154a.f3483P.auth().q(C0154a.m3143J0("/countdown-likes/" + str)).d().b();
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: sq */
    public rx.c<roj0> m5058sq(final String str, final double d2) {
        return this.f8580Q.now(rx.c.fromCallable(new Callable() { // from class: l.l48
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f16222a.m4591Gm(str, d2);
            }
        }).compose(C0154a.m3182T2()));
    }

    /* JADX INFO: renamed from: te */
    public Message m5059te(String str, List<BreakIce> list) {
        Message messageNew_ = Message.new_();
        messageNew_.messageType = MessageType.get("local_break_ice");
        messageNew_.cid = str;
        messageNew_.localInConversation = true;
        long jO = mqi0.o();
        messageNew_.owner = CoreModule.m1850H().userId();
        messageNew_.createdTime = jO;
        messageNew_.localCreatedTime = jO;
        messageNew_.recalled = Boolean.FALSE;
        messageNew_.hostId = CoreModule.m1850H().userId();
        tpd0 tpd0Var = App.i;
        messageNew_.localCreatedSession = ((Integer) tpd0Var.get()).intValue();
        ((DbObject) messageNew_).id = DbObject.GENERATE_UNIQUE_FAKE_ID(((Integer) tpd0Var.get()).intValue());
        MessageAdditionalData messageAdditionalDataNew_ = MessageAdditionalData.new_();
        messageNew_.additionalData = messageAdditionalDataNew_;
        messageAdditionalDataNew_.localBreakIce = list;
        messageNew_.value = String.format("帮你准备了%d句开场白，点击发送", Integer.valueOf(list.size() > 2 ? list.size() : 2));
        return messageNew_;
    }

    /* JADX INFO: renamed from: tf */
    public void m5060tf(Envelope envelope) {
        m5073uf(envelope, false);
    }

    /* JADX INFO: renamed from: tg */
    public List<Message> m5061tg(String str) {
        return Lists.q(CoreModule.f1542k.f11195c.query(Message.CID.EQ(str), ((OrderedColumn) Message.CREATEDTIME).DESC, 20));
    }

    /* JADX INFO: renamed from: th */
    public rx.c<roj0> m5062th(String str) {
        final JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        try {
            jSONObject3.put("inviteOther", true);
            jSONObject2.put("verify", jSONObject3);
            jSONObject.put("additional", jSONObject2);
        } catch (Exception e) {
            CrashHelper.c(e);
        }
        final String str2 = String.format("/conversations/%s?method=patch", str);
        return this.f8580Q.scheduled(str2, -1, new v9j() { // from class: l.ct7
            public final Object call() {
                return ia20.m16571e(new v9j() { // from class: l.sx7
                    public final Object call() {
                        return C0154a.f3483P.auth().q(C0154a.m3184U0(str)).l(utc0.create(Network.JSON, jSONObject.toString())).b();
                    }
                });
            }
        }).compose(mkd0.C()).map(new w9j() { // from class: l.dt7
            public final Object call(Object obj) {
                return roj0.a;
            }
        });
    }

    /* JADX INFO: renamed from: ti */
    public final /* synthetic */ void m5063ti(final String str, final List list) {
        this.f8580Q.f3598U.m13685a(new d30() { // from class: l.nx7
            public final void call() {
                CoreModule.f1542k.f11195c.delete(Filter.AND(new Filter[]{Message.CID.EQ(str), Message.MESSAGETYPE.IN(list)}));
            }
        });
    }

    /* JADX INFO: renamed from: tj */
    public final /* synthetic */ roj0 m5064tj(final String str, final String str2, final List list, final int i, final ChatNewMatchEnvelope chatNewMatchEnvelope) {
        if (!vwb.J(chatNewMatchEnvelope.data.users)) {
            for (User user : chatNewMatchEnvelope.data.users) {
                if (!TextUtils.equals(((DbObject) user).id, str) && !TextUtils.equals(((DbObject) user).id, str2)) {
                    list.add(((DbObject) user).id);
                }
            }
        }
        if (TextUtils.isEmpty(chatNewMatchEnvelope.pagination.links.next) || vwb.J(chatNewMatchEnvelope.data.users) || list.size() >= i) {
            lz4.h().u(list.subList(0, Math.min(list.size(), i)));
        } else {
            e51.H(CoreModule.f1533b, new Runnable() { // from class: l.fs7
                @Override // java.lang.Runnable
                public final void run() {
                    this.f12879a.m5051sj(chatNewMatchEnvelope, list, str, str2, i);
                }
            }, 10L);
        }
        return roj0.a;
    }

    /* JADX INFO: renamed from: tk */
    public final /* synthetic */ Message m5065tk(final String str, final String str2, final boolean z, final String str3, final Envelope envelope) {
        this.f8580Q.m3422w3(envelope, new d30() { // from class: l.s38
            public final void call() {
                this.f20989a.m5052sk(envelope, str, str2, z, str3);
            }
        });
        if (vwb.J(envelope.getModuleData(CoreData.class).messages)) {
            return null;
        }
        Message message = (Message) envelope.getModuleData(CoreData.class).messages.get(0);
        if (message != null && message.recalled.booleanValue()) {
            e51.G(new t38(this));
        }
        return message;
    }

    /* JADX INFO: renamed from: tl */
    public final /* synthetic */ roj0 m5066tl(Envelope envelope) {
        this.f8580Q.m3422w3(envelope, null);
        return roj0.a;
    }

    /* JADX INFO: renamed from: tm */
    public final /* synthetic */ void m5067tm(Envelope envelope) {
        m5122ye(envelope);
        m5073uf(envelope, false);
        m5147zq(envelope.getModuleData(CoreData.class).conversations);
    }

    /* JADX INFO: renamed from: tn */
    public rx.c<List<Conversation>> m5068tn() {
        return ura.m25555e().m25559d().m5739b() ? m4655Me().f15238r.m() : m4655Me().f15239s.m();
    }

    /* JADX INFO: renamed from: to */
    public rx.c<roj0> m5069to(Message message, String str) {
        if (message == null) {
            return null;
        }
        final Message messageClone = message.clone();
        if (messageClone.additionalData == null) {
            messageClone.additionalData = MessageAdditionalData.new_();
        }
        MessageAdditionalData messageAdditionalData = messageClone.additionalData;
        if (messageAdditionalData.aiPicture == null) {
            messageAdditionalData.aiPicture = AiPicture.new_();
        }
        messageClone.additionalData.aiPicture.likeStatus = str;
        return this.f8580Q.scheduled("patchAiPictureMessage" + ((DbObject) messageClone).id, -1, new v9j() { // from class: l.m48
            public final Object call() {
                return this.f16787a.m4709Qk(messageClone);
            }
        });
    }

    /* JADX INFO: renamed from: tp */
    public void m5070tp() {
        final String strM3141I2 = C0154a.m3141I2("/chat-page");
        final JsonObject jsonObject = new JsonObject();
        try {
            jsonObject.addProperty("enterNewMatchPage", Boolean.TRUE);
        } catch (Exception unused) {
        }
        this.f8580Q.scheduled("/me/chat-page/post", -1, new v9j() { // from class: l.gb8
            public final Object call() {
                return ia20.m16571e(new v9j() { // from class: l.sv7
                    public final Object call() {
                        return C0154a.f3483P.auth().q(str).l(utc0.create(Network.JSON, jsonObject.toString())).b();
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: tq */
    public rx.c<roj0> m5071tq(final String str, final double d2) {
        return this.f8580Q.now(rx.c.fromCallable(new Callable() { // from class: l.r18
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f20228a.m4603Hm(str, d2);
            }
        }).compose(C0154a.m3182T2()));
    }

    /* JADX INFO: renamed from: ue, reason: merged with bridge method [inline-methods] */
    public final ConversationCounter m5142zl(double d2) {
        Filter filterAND;
        Integer num;
        this.f3928g2 = d2;
        if (f8c.o().l()) {
            return (ConversationCounter) this.f3976w2.e();
        }
        System.nanoTime();
        if (ura.m25555e().m25559d().m5739b()) {
            StringColumn stringColumn = Conversation.ID;
            Filter filterOR = Filter.OR(new Filter[]{stringColumn.NOT_STARTS_WITH("fake_conversation"), stringColumn.STARTS_WITH("fake_conversation_profile_like_enter"), stringColumn.STARTS_WITH("fake_conversation_city_centre_enter")});
            TEnumColumn tEnumColumn = Conversation.STATUS;
            filterAND = Filter.AND(new Filter[]{filterOR, tEnumColumn.NEQ("removed"), tEnumColumn.NEQ("invisible"), tEnumColumn.NEQ("deleted")});
        } else {
            StringColumn stringColumn2 = Conversation.ID;
            Filter filterNOT_STARTS_WITH = stringColumn2.NOT_STARTS_WITH("fake_conversation");
            Filter filterNEQ = stringColumn2.NEQ("-11000");
            Filter filterNEQ2 = stringColumn2.NEQ("-11001");
            TEnumColumn tEnumColumn2 = Conversation.STATUS;
            filterAND = Filter.AND(new Filter[]{filterNOT_STARTS_WITH, filterNEQ, filterNEQ2, tEnumColumn2.NEQ("removed"), tEnumColumn2.NEQ("invisible"), tEnumColumn2.NEQ("deleted")});
        }
        Filter filterNEQ3 = ura.m25555e().m25559d().m5595B() ? Conversation.ID.NEQ("-770011") : Filter.TRUE;
        Filter<Conversation> filterM17591i1 = CoreModule.f1542k.f11205m.m17591i1();
        Filter filterF = Filter.TRUE;
        if (ura.m25555e().m25559d().m5613E()) {
            filterF = Conversation.MUTED.F();
        }
        jl6 jl6Var = CoreModule.f1542k.f11205m;
        TEnumColumn tEnumColumn3 = Conversation.STATUS;
        int iCount = jl6Var.count(Filter.AND(new Filter[]{Filter.AND(new Filter[]{tEnumColumn3.NEQ("dismissed"), tEnumColumn3.NEQ("local_fake"), tEnumColumn3.NEQ("removed"), tEnumColumn3.NEQ("invisible"), tEnumColumn3.NEQ("deleted")}), filterAND, filterNEQ3}), -1);
        int iE = CoreModule.f1542k.f11205m.m17586f1().e();
        jl6 jl6Var2 = CoreModule.f1542k.f11205m;
        StringColumn stringColumn3 = Conversation.ID;
        Filter filterNOT_STARTS_WITH2 = stringColumn3.NOT_STARTS_WITH("fake_conversation");
        BooleanColumn booleanColumn = Conversation.READ;
        Filter filterF2 = booleanColumn.F();
        Filter filterAND2 = Filter.AND(new Filter[]{tEnumColumn3.NEQ("dismissed"), tEnumColumn3.NEQ("local_fake"), tEnumColumn3.NEQ("removed"), tEnumColumn3.NEQ("invisible"), tEnumColumn3.NEQ("deleted")});
        Filter filter = (Filter) CoreModule.f1542k.f11205m.f15241u.b();
        BooleanColumn booleanColumn2 = Conversation.LOCALEVERHASMESSAGE;
        int iCount2 = jl6Var2.count(Filter.AND(new Filter[]{filterNOT_STARTS_WITH2, filterF2, filterAND2, filter, booleanColumn2.F(), filterM17591i1}), -1);
        double dO = mqi0.o() - (((long) ura.m25555e().m25559d().m5638Ih()) * 60000);
        Filter filterAND3 = Filter.AND(CoreModule.f1542k.f11205m.m17581a1().toFilters());
        Filter filterF3 = booleanColumn.F();
        Filter filterF4 = booleanColumn2.F();
        Filter filterREQ = Conversation.CREATEDTIME.REQ(Double.valueOf(m4870eg()));
        DoubleColumn doubleColumn = Conversation.ADDITIONAL_NEWMATCH_LABELEXPOSURETIME;
        int iCount3 = CoreModule.f1542k.f11205m.count(Filter.AND(new Filter[]{filterAND3, filterF3, filterF4, filterREQ, Filter.OR(new Filter[]{doubleColumn.LEQ(Double.valueOf(1.0d)), doubleColumn.REQ(Double.valueOf(dO))})}), -1);
        Filter filterAND4 = ura.m25555e().m25559d().m5876vp() ? Filter.AND(new Filter[]{filterAND, filterF, filterNEQ3, stringColumn3.NEQ("-1")}) : Filter.AND(new Filter[]{filterAND, filterF, filterNEQ3});
        Filter filterNEQ4 = stringColumn3.NEQ("-1");
        StringColumn stringColumn4 = Conversation.CONVTYPE;
        Filter filterEQ = stringColumn4.EQ("heartbeatMatch");
        Filter filterEQ2 = stringColumn4.EQ("quickchat");
        DoubleColumn doubleColumn2 = Conversation.LATESTTIME;
        Filter filterOR2 = Filter.OR(new Filter[]{filterEQ, filterEQ2, doubleColumn2.REQ(Double.valueOf(this.f3928g2 - (((long) (ura.m25555e().m25559d().m5869uc() * 3600)) * 1000)))});
        if (ura.m25555e().m25559d().m5761f8()) {
            filterAND4 = Filter.AND(new Filter[]{filterAND4, filterNEQ4});
        } else if (ura.m25555e().m25559d().m5600Bt()) {
            filterAND4 = Filter.AND(new Filter[]{filterAND4, filterNEQ4, filterOR2});
        }
        double dM5834os = ura.m25555e().m25559d().m5834os();
        if (dM5834os > 0.0d) {
            num = 1;
            filterAND4 = Filter.AND(new Filter[]{filterAND4, Filter.OR(new Filter[]{Conversation.LEVEL.REQ((Comparable) 1), doubleColumn2.REQ(Double.valueOf(dM5834os))})});
        } else {
            num = 1;
        }
        if (ura.m25555e().m25559d().m5857sa()) {
            filterAND4 = Filter.AND(new Filter[]{filterAND4, m4655Me().f15230W});
        }
        jl6 jl6Var3 = CoreModule.f1542k.f11205m;
        IntegerColumn integerColumn = Conversation.UNREADMESSAGES;
        int iSum = jl6Var3.sum(filterAND4, integerColumn);
        this.f3964s2 = CoreModule.f1542k.f11205m.sum(f3829c3, integerColumn);
        if (dM5834os > 0.0d) {
            filterAND = Filter.AND(new Filter[]{filterAND, Filter.OR(new Filter[]{Conversation.LEVEL.REQ(num), doubleColumn2.REQ(Double.valueOf(dM5834os))})});
        }
        int iSum2 = CoreModule.f1542k.f11205m.sum(Filter.AND(new Filter[]{Conversation.OTHERUSER.EQ("-1"), filterAND}), integerColumn);
        List<Conversation> listQuery = CoreModule.f1542k.f11205m.query(filterAND4, ((OrderedColumn) doubleColumn2).DESC, ura.m25555e().m25559d().m5656Mg());
        ArrayList arrayList = new ArrayList();
        for (Conversation conversation : listQuery) {
            UnreadDetail unreadDetailNew_ = UnreadDetail.new_();
            unreadDetailNew_.unread = conversation.unreadMessages;
            unreadDetailNew_.userID = conversation.otherUser;
            arrayList.add(unreadDetailNew_);
        }
        int iSum3 = CoreModule.f1542k.f11205m.sum(Filter.AND(new Filter[]{Conversation.CONVTYPE.EQ("marriage"), filterAND}), Conversation.UNREADMESSAGES);
        ConversationCounter conversationCounterNew_ = ConversationCounter.new_();
        CounterConversations counterConversations = conversationCounterNew_.conversations;
        counterConversations.total = iCount;
        counterConversations.unread = iE;
        counterConversations.unseen = iCount2;
        counterConversations.addressBookUnseen = iCount3;
        CounterMessages counterMessages = conversationCounterNew_.messages;
        counterMessages.unread = iSum;
        counterMessages.unReadOnlyMarriage = iSum3;
        counterMessages.liunread = iSum2;
        conversationCounterNew_.updatedTime = d2;
        counterMessages.unreadDetails = arrayList;
        return conversationCounterNew_;
    }

    /* JADX INFO: renamed from: uf */
    public final void m5073uf(Envelope envelope, boolean z) {
        if (vwb.J(envelope.getModuleData(CoreData.class).conversations)) {
            return;
        }
        for (final Conversation conversation : envelope.getModuleData(CoreData.class).conversations) {
            if (conversation != null) {
                DbLinks dbLinksM4677No = m4677No(((DbObject) conversation).id);
                if (dbLinksM4677No == null) {
                    dbLinksM4677No = new DbLinks();
                    ((DbObject) dbLinksM4677No).id = ((DbObject) conversation).id;
                }
                if (!ura.m25555e().m25559d().m5613E() || !ura.m25555e().m25559d().m5664Nd(conversation) || z) {
                    PartialIdList partialIdList = conversation.api_only_messages;
                    dbLinksM4677No.links = partialIdList == null ? new Links() : partialIdList.links;
                } else if (!NullChecker.a(dbLinksM4677No.links)) {
                    PartialIdList partialIdList2 = conversation.api_only_messages;
                    dbLinksM4677No.links = partialIdList2 == null ? new Links() : partialIdList2.links;
                }
                CoreModule.f1542k.f11196d.upsert(dbLinksM4677No);
                if (ura.m25555e().m25559d().m5613E() && ura.m25555e().m25559d().m5664Nd(conversation) && NullChecker.a(dbLinksM4677No.links) && !TextUtils.isEmpty(dbLinksM4677No.links.next) && z) {
                    final String str = dbLinksM4677No.links.next;
                    e51.G(new Runnable() { // from class: l.rx7
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f20837a.m4861di(conversation, str);
                        }
                    });
                }
            }
        }
    }

    /* JADX INFO: renamed from: ug */
    public rx.c<List<FriendInfo>> m5074ug() {
        this.f3908a0 = mqi0.o();
        final String strM27254m = xh5.m27254m("search=suggested&with=users");
        return this.f8580Q.scheduled("conversations/get/online", 0, new v9j() { // from class: l.dy7
            public final Object call() {
                return this.f10647a.m4719Ri(strM27254m);
            }
        });
    }

    /* JADX INFO: renamed from: uh */
    public boolean m5075uh(String str) {
        Conversation conversationM5146zp = m5146zp(str);
        return NullChecker.a(conversationM5146zp) && TEnum.equals(conversationM5146zp.status, "blocked");
    }

    /* JADX INFO: renamed from: ui */
    public final /* synthetic */ void m5076ui(final List list, Envelope envelope) {
        this.f8580Q.f3598U.m13685a(new d30() { // from class: l.w88
            public final void call() {
                C0166g.m4275f9(list);
            }
        });
    }

    /* JADX INFO: renamed from: uj */
    public final /* synthetic */ rx.c m5077uj(final String str, final String str2, final String str3, final List list, final int i) {
        return ia20.m16569c(new v9j() { // from class: l.zr7
            public final Object call() {
                return C0166g.m3922A3(str);
            }
        }, ChatNewMatchEnvelope.JSON_ADAPTER).map(new w9j() { // from class: l.as7
            public final Object call(Object obj) {
                return this.f8466a.m5064tj(str2, str3, list, i, (ChatNewMatchEnvelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: uk */
    public final /* synthetic */ rx.c m5078uk(final String str, final String str2, final boolean z, final String str3, final boolean z2) {
        return ia20.m16571e(new v9j() { // from class: l.qy7
            public final Object call() {
                return C0154a.f3483P.auth().q(C0154a.m3162O0(str, str2, z)).f().b();
            }
        }).map(new w9j() { // from class: l.ry7
            public final Object call(Object obj) {
                return this.f20905a.m5065tk(str2, str3, z2, str, (Envelope) obj);
            }
        }).compose(C0154a.m3182T2());
    }

    /* JADX INFO: renamed from: ul */
    public final /* synthetic */ rx.c m5079ul(final String str, final Conversation conversation) {
        return conversation != null ? new la20(new v9j() { // from class: l.n68
            public final Object call() {
                return C0154a.f3483P.auth().q(C0154a.m3106A(str) + "&method=patch").l(utc0.create(Network.JSON, conversation.toJson())).b();
            }
        }).map(new w9j() { // from class: l.o68
            public final Object call(Object obj) {
                return this.f18027a.m5066tl((Envelope) obj);
            }
        }) : rx.c.empty();
    }

    /* JADX INFO: renamed from: um */
    public final /* synthetic */ void m5080um(Envelope envelope, Long l2) {
        m4737Sp(envelope.pagination.links);
    }

    /* JADX INFO: renamed from: un */
    public rx.c<q860<Conversation>> m5081un() {
        return m4679Oe(m4655Me().f15237q);
    }

    /* JADX INFO: renamed from: uo */
    public rx.c<j760<Meta, Conversation>> m5082uo(final String str, final boolean z) {
        return scheduled("hide_conversation/" + str, -1, new v9j() { // from class: l.j88
            public final Object call() {
                return ia20.m16571e(new v9j() { // from class: l.u98
                    public final Object call() {
                        return C0166g.m4025J7(z, str);
                    }
                });
            }
        }).doOnNext(new e30() { // from class: l.k88
            public final void call(Object obj) {
                this.f15647a.m4721Rk((Envelope) obj);
            }
        }).map(new w9j() { // from class: l.l88
            public final Object call(Object obj) {
                return this.f16261a.m4732Sk(str, (Envelope) obj);
            }
        }).observeOn(jo0.a());
    }

    /* JADX INFO: renamed from: up */
    public rx.c<Envelope> m5083up() {
        return this.f8580Q.scheduled("report_suggest_conv_online_notifications", -1, new v9j() { // from class: l.nu7
            public final Object call() {
                return ia20.m16567a(new v9j() { // from class: l.g08
                    public final Object call() {
                        return C0154a.f3483P.auth().q(C0154a.m3143J0("/online-notifications")).l(utc0.create(Network.JSON, "")).b();
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: uq */
    public rx.c<roj0> m5084uq(final String str, final double d2, final int i) {
        return this.f8580Q.now(rx.c.fromCallable(new Callable() { // from class: l.qx7
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f20123a.m4615Im(str, d2, i);
            }
        }).compose(C0154a.m3182T2()));
    }

    /* JADX INFO: renamed from: ve */
    public final void m5085ve(final Message message, final int i, final e30<Message> e30Var) {
        this.f8580Q.f3598U.m13685a(new d30() { // from class: l.zv7
            public final void call() {
                C0166g.m4302hc(message, i, e30Var);
            }
        });
    }

    /* JADX INFO: renamed from: vf */
    public void m5086vf(User user) {
        if (m4665Mo(((DbObject) user).id) == null) {
            Conversation conversationNew_ = Conversation.new_();
            double d2 = user.localRelationship.createdTime;
            conversationNew_.createdTime = d2;
            conversationNew_.latestTime = d2;
            String str = ((DbObject) user).id;
            conversationNew_.otherUser = str;
            ((DbObject) conversationNew_).id = str;
            conversationNew_.convType = CameraSticker.CATEGORY_DEFAULT_FILTER;
            conversationNew_.read = Boolean.FALSE;
            conversationNew_.isFake = true;
            conversationNew_.readUntil = "";
            conversationNew_.localNotificationStatus = NotificationStatus.get("removed");
            conversationNew_.importance = StickStatus.get("normal");
            DbLinks dbLinks = new DbLinks();
            ((DbObject) dbLinks).id = ((DbObject) user).id;
            dbLinks.links = new Links();
            CoreModule.f1542k.f11196d.upsert(dbLinks);
            CoreModule.f1542k.f11205m.upsert(conversationNew_);
        }
    }

    /* JADX INFO: renamed from: vg */
    public HashSet<String> m5087vg(boolean z) {
        return z ? this.f3847F2 : this.f3850G2;
    }

    /* JADX INFO: renamed from: vh */
    public boolean m5088vh(String str) {
        Conversation conversationM5146zp = m5146zp(str);
        return NullChecker.a(conversationM5146zp) && TEnum.equals(conversationM5146zp.status, "dismissed");
    }

    /* JADX INFO: renamed from: vi */
    public final /* synthetic */ rx.c m5089vi(final String str, final List list, final JSONObject jSONObject) {
        return NullChecker.a(jSONObject) ? ia20.m16571e(new v9j() { // from class: l.i78
            public final Object call() {
                return C0154a.f3483P.auth().q(C0154a.m3141I2("/conversations/" + str + "/messages?method=patch")).l(utc0.create(Network.JSON, jSONObject.toString())).b();
            }
        }).doOnNext(new e30() { // from class: l.j78
            public final void call(Object obj) {
                this.f15043a.m5076ui(list, (Envelope) obj);
            }
        }).compose(mkd0.C()).map(new w9j() { // from class: l.k78
            public final Object call(Object obj) {
                return roj0.a;
            }
        }) : rx.c.empty();
    }

    /* JADX INFO: renamed from: vk */
    public final /* synthetic */ roj0 m5091vk(Envelope envelope) {
        if (!vwb.J(envelope.getModuleData(CoreData.class).messages)) {
            envelope.getModuleData(CoreData.class).messages.clear();
        }
        this.f8580Q.m3422w3(envelope, null);
        return roj0.a;
    }

    /* JADX INFO: renamed from: vl */
    public final /* synthetic */ void m5092vl(String str, Throwable th) {
        StringBuilder sb = new StringBuilder("cid:");
        sb.append(str);
        sb.append(" errorMessage:");
        sb.append(NullChecker.a(th.getMessage()) ? th.getMessage() : "");
        du2.a("ConversationPatchDelete", sb.toString());
        m4593Go(th, str);
    }

    /* JADX INFO: renamed from: vm */
    public final /* synthetic */ roj0 m5093vm(final boolean z, final NotificationStatus notificationStatus, final NotificationStatus notificationStatus2, final boolean z2) throws Exception {
        this.f8580Q.f3598U.m13685a(new d30() { // from class: l.nz7
            public final void call() {
                C0166g.m4385p6(z, notificationStatus, notificationStatus2, z2);
            }
        });
        return roj0.a;
    }

    /* JADX INFO: renamed from: vn */
    public rx.c<q860<Conversation>> m5094vn() {
        return m4679Oe(m4655Me().f15245y);
    }

    /* JADX INFO: renamed from: vo */
    public rx.c<j760<Meta, Conversation>> m5095vo(final String str, final int i) {
        return scheduled("stick_top_conversation/" + str, -1, new v9j() { // from class: l.d18
            public final Object call() {
                return ia20.m16571e(new v9j() { // from class: l.x18
                    public final Object call() {
                        return C0166g.m4475x7(i, str);
                    }
                });
            }
        }).doOnNext(new e30() { // from class: l.e18
            public final void call(Object obj) {
                this.f10719a.m4744Tk((Envelope) obj);
            }
        }).map(new w9j() { // from class: l.f18
            public final Object call(Object obj) {
                return this.f11560a.m4756Uk(str, (Envelope) obj);
            }
        }).observeOn(jo0.a());
    }

    /* JADX INFO: renamed from: vp */
    public void m5096vp(boolean z, int i, int i2, boolean z2) {
        if (!z) {
            this.f3933i1.put(0);
            this.f3930h1.put(0L);
        }
        if (((Integer) this.f3933i1.get()).intValue() >= i) {
            e51.y(new Runnable() { // from class: l.gr7
                @Override // java.lang.Runnable
                public final void run() {
                    this.f13455a.m4817Zl();
                }
            });
        } else if (mqi0.o() - ((Long) this.f3930h1.get()).longValue() > ((long) i2) * 60000 || z2) {
            m4882fg().subscribe(new e30() { // from class: l.hr7
                public final void call(Object obj) {
                    C0166g.m3941Bb((roj0) obj);
                }
            }, new e30() { // from class: l.ir7
                public final void call(Object obj) {
                    C0166g.m4289gb((Throwable) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: vq */
    public rx.c<roj0> m5097vq(final Message message, final boolean z) {
        return scheduled("msg_risk_operation_" + ((DbObject) message).id, 0, new v9j() { // from class: l.n08
            public final Object call() {
                return this.f17426a.m4651Lm(message, z);
            }
        });
    }

    /* JADX INFO: renamed from: we */
    public final void m5098we(Message message, e30<Message> e30Var) {
        m5085ve(message, 1, e30Var);
    }

    /* JADX INFO: renamed from: wg */
    public rx.c<CipherId> m5099wg(final String str, final String str2, final boolean z) {
        return this.f8580Q.scheduled("cipher_userid_ab", -1, new v9j() { // from class: l.mq7
            public final Object call() {
                return ia20.m16567a(new v9j() { // from class: l.rt7
                    public final Object call() {
                        return C0166g.m4066N4(str, str, z);
                    }
                });
            }
        }).map(new w9j() { // from class: l.nq7
            public final Object call(Object obj) {
                return ((Envelope) obj).getModuleData(CoreData.class).cipherId;
            }
        });
    }

    /* JADX INFO: renamed from: wh */
    public rx.c<Boolean> m5100wh(final String str) {
        return rx.c.fromCallable(new Callable() { // from class: l.e28
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f10730a.m4826aj(str);
            }
        });
    }

    /* JADX INFO: renamed from: wi */
    public final /* synthetic */ rx.c m5101wi(final List list, final String str) {
        return rx.c.fromCallable(new Callable() { // from class: l.z48
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C0166g.m4319j6(list);
            }
        }).flatMap(new w9j() { // from class: l.a58
            public final Object call(Object obj) {
                return this.f8108a.m5089vi(str, list, (JSONObject) obj);
            }
        });
    }

    /* JADX INFO: renamed from: wj */
    public final /* synthetic */ rx.c m5102wj(final String str) {
        return rx.c.fromCallable(new Callable() { // from class: l.aw7
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C0166g.m4450v5(str);
            }
        }).compose(mkd0.R()).flatMap(new w9j() { // from class: l.bw7
            public final Object call(Object obj) {
                return this.f9123a.m5090vj(str, (String) obj);
            }
        });
    }

    /* JADX INFO: renamed from: wk */
    public final /* synthetic */ rx.c m5103wk(final String str, final String str2) {
        return new la20(new v9j() { // from class: l.h38
            public final Object call() {
                return C0154a.f3483P.auth().q(C0154a.m3162O0(str, str2, false)).f().b();
            }
        }).map(new w9j() { // from class: l.i38
            public final Object call(Object obj) {
                return this.f14213a.m5091vk((Envelope) obj);
            }
        }).compose(C0154a.m3182T2());
    }

    /* JADX INFO: renamed from: wl */
    public final /* synthetic */ rx.c m5104wl(final boolean z, final boolean z2, final String str) {
        return rx.c.fromCallable(new Callable() { // from class: l.a48
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C0166g.m4374o6(z, z2);
            }
        }).flatMap(new w9j() { // from class: l.b48
            public final Object call(Object obj) {
                return this.f8711a.m5079ul(str, (Conversation) obj);
            }
        }).compose(C0154a.m3182T2()).doOnError(new e30() { // from class: l.c48
            public final void call(Object obj) {
                this.f9344a.m5092vl(str, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: renamed from: wm */
    public final /* synthetic */ roj0 m5105wm(final NotificationStatus notificationStatus, final NotificationStatus notificationStatus2, final String str) throws Exception {
        this.f8580Q.f3598U.m13685a(new d30() { // from class: l.gy7
            public final void call() {
                CoreModule.f1542k.f11195c.m26925z0(notificationStatus, notificationStatus2, str);
            }
        });
        return roj0.a;
    }

    /* JADX INFO: renamed from: wn */
    public rx.c<Message> m5106wn() {
        return this.f3911b0.observeOn(jo0.a());
    }

    /* JADX INFO: renamed from: wo */
    public rx.c<roj0> m5107wo(final String str, final boolean z) {
        return this.f8580Q.scheduled("remove_conversation/" + str, -1, new v9j() { // from class: l.by7
            public final Object call() {
                return this.f9221a.m4816Zk(str, z);
            }
        });
    }

    /* JADX INFO: renamed from: wp */
    public rx.c<Envelope> m5108wp(String str, boolean z) {
        if (TextUtils.isEmpty(str)) {
            return rx.c.error(new RuntimeException("empty extra"));
        }
        StringBuilder sb = new StringBuilder("/live-schemas?search=");
        sb.append(str);
        sb.append(!z ? "" : "&action=cancel");
        final String strM3130G = C0154a.m3130G(sb.toString());
        return this.f8580Q.now(ia20.m16567a(new v9j() { // from class: l.c28
            public final Object call() {
                return C0154a.f3483P.auth().q(strM3130G).b();
            }
        }));
    }

    /* JADX INFO: renamed from: wq */
    public final rx.c<roj0> m5109wq(final String str) {
        return this.f8580Q.scheduled("retryCount" + str, -1, new v9j() { // from class: l.t18
            public final Object call() {
                return this.f21800a.m4675Nm(str);
            }
        });
    }

    /* JADX INFO: renamed from: xe */
    public rx.c<roj0> m5110xe() {
        return this.f3853H2.asObservable().observeOn(jo0.a());
    }

    /* JADX INFO: renamed from: xg */
    public rx.c<Envelope> m5111xg(final String str) {
        return this.f8580Q.now(new la20(new v9j() { // from class: l.qr7
            public final Object call() {
                return C0154a.f3483P.auth().q(C0154a.m3143J0("/tickles/" + str)).f().b();
            }
        }).compose(C0154a.m3182T2()));
    }

    /* JADX INFO: renamed from: xh */
    public boolean m5112xh(String str) {
        if (!ura.m25555e().m25559d().m5745c()) {
            return CoreModule.f1542k.f11205m.m17576V0(str).e() > 0;
        }
        User userM21393Pa = this.f8580Q.f3628e0.m21393Pa(str);
        return (userM21393Pa == null || !userM21393Pa.onlineMatchLocked()) && CoreModule.f1542k.f11205m.m17576V0(str).e() > 0;
    }

    /* JADX INFO: renamed from: xi */
    public final /* synthetic */ void m5113xi() {
        this.f8580Q.f3598U.m13685a(new d30() { // from class: l.qs7
            public final void call() {
                CoreModule.f1542k.f11205m.delete("conversation_picture_like");
            }
        });
    }

    /* JADX INFO: renamed from: xj */
    public final /* synthetic */ void m5114xj(String str, Envelope envelope) {
        DbLinks dbLinksM4677No = m4677No(str);
        if (!TextUtils.isEmpty(envelope.pagination.links.previous) && NullChecker.a(dbLinksM4677No)) {
            dbLinksM4677No.links.previous = envelope.pagination.links.previous;
            CoreModule.f1542k.f11196d.upsert(dbLinksM4677No);
        }
        for (Message message : envelope.getModuleData(CoreData.class).messages) {
            message.localNotificationStatus = NotificationStatus.get("muting");
            message.cid = str;
        }
    }

    /* JADX INFO: renamed from: xk */
    public final /* synthetic */ roj0 m5115xk(final List list, roj0 roj0Var) {
        this.f8580Q.f3598U.m13685a(new d30() { // from class: l.py7
            public final void call() {
                C0166g.m4037K8(list);
            }
        });
        CoreModule.f1534c.f3631f0.f3949n2.clear();
        return roj0.a;
    }

    /* JADX INFO: renamed from: xm */
    public final /* synthetic */ roj0 m5117xm(final NotificationStatus notificationStatus, final NotificationStatus notificationStatus2, final String str) throws Exception {
        this.f8580Q.f3598U.m13685a(new d30() { // from class: l.rs7
            public final void call() {
                CoreModule.f1542k.f11195c.m26878A0(notificationStatus, notificationStatus2, str);
            }
        });
        return roj0.a;
    }

    /* JADX INFO: renamed from: xn */
    public rx.c<roj0> m5118xn(final String str) {
        m4555Dp(str, false);
        return this.f8580Q.scheduled("messageClear", -1, new v9j() { // from class: l.l78
            public final Object call() {
                return this.f16250a.m4696Pj(str);
            }
        });
    }

    /* JADX INFO: renamed from: xo */
    public rx.c<roj0> m5119xo(final String str) {
        return scheduled("patch_filter_del_or_hidden/" + str, -1, new v9j() { // from class: l.i58
            public final Object call() {
                return this.f14227a.m4840bl(str);
            }
        }).map(new w9j() { // from class: l.j58
            public final Object call(Object obj) {
                return roj0.a;
            }
        }).observeOn(jo0.a());
    }

    /* JADX INFO: renamed from: xp */
    public void m5120xp(final String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        e51.y(new Runnable() { // from class: l.la8
            @Override // java.lang.Runnable
            public final void run() {
                this.f16298a.m4841bm(str);
            }
        });
    }

    /* JADX INFO: renamed from: xq */
    public void m5121xq(final String str) {
        e51.y(new Runnable() { // from class: l.ha8
            @Override // java.lang.Runnable
            public final void run() {
                this.f13768a.m4687Om(str);
            }
        });
    }

    /* JADX INFO: renamed from: ye */
    public final void m5122ye(Envelope envelope) {
        List list = envelope.getModuleData(CoreData.class).conversations;
        if (vwb.J(list)) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            TEnum.equals(((Conversation) it.next()).status, "deleted");
        }
    }

    /* JADX INFO: renamed from: yf */
    public rx.c<List<Conversation>> m5123yf() {
        return CoreModule.f1542k.f11205m.f15209B.m();
    }

    /* JADX WARN: Code duplicated, block: B:11:0x004b  */
    /* JADX INFO: renamed from: yg */
    public final String m5124yg() {
        PutongAct putongAct;
        if (Act.globalLifeCycle_().isEmpty() || Act.globalLifeCycle_().values().isEmpty()) {
            putongAct = null;
        } else {
            List list = (List) Act.globalLifeCycle_().values().iterator().next();
            if (vwb.J(list)) {
                putongAct = null;
            } else {
                Object obj = (Activity) ((Act.r) list.get(list.size() - 1)).a.get();
                if (obj instanceof PutongAct) {
                    putongAct = (PutongAct) obj;
                } else {
                    putongAct = null;
                }
            }
        }
        return NullChecker.a(putongAct) ? putongAct.pageId() : "";
    }

    /* JADX INFO: renamed from: yh */
    public rx.c<Boolean> m5125yh(final String str, final String str2, final String str3, final String str4) {
        return scheduled("conversation/" + str3 + "/report-hint", 0, new v9j() { // from class: l.jz7
            public final Object call() {
                return ia20.m16567a(new v9j() { // from class: l.v18
                    public final Object call() {
                        return C0154a.f3483P.auth().q(C0154a.m3130G("/antispam/sender/" + str + "/conversation/" + str + "/message/" + str + "/report-hint?hitWord=" + str)).f().b();
                    }
                }).map(new w9j() { // from class: l.w18
                    public final Object call(Object obj) {
                        return Boolean.valueOf(((Envelope) obj).getModuleData(CoreData.class).hint);
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: yi */
    public final /* synthetic */ roj0 m5126yi(Envelope envelope) {
        this.f8580Q.m3422w3(envelope, null);
        return roj0.a;
    }

    /* JADX INFO: renamed from: yj */
    public final /* synthetic */ Boolean m5127yj(final String str, final Envelope envelope) {
        boolean z;
        if (vwb.J(envelope.getModuleData(CoreData.class).messages)) {
            z = false;
        } else {
            CoreModule.f1534c.f3637h0.m25600m3(envelope);
            z = !TextUtils.isEmpty(envelope.pagination.links.previous);
            this.f8580Q.m3422w3(envelope, new d30() { // from class: l.f78
                public final void call() {
                    this.f12541a.m5114xj(str, envelope);
                }
            });
        }
        return Boolean.valueOf(z);
    }

    /* JADX INFO: renamed from: yk */
    public final /* synthetic */ rx.c m5128yk(final List list) {
        return rx.c.just(roj0.a).observeOn(Schedulers.io()).map(new w9j() { // from class: l.wu7
            public final Object call(Object obj) {
                return this.f25410a.m5115xk(list, (roj0) obj);
            }
        });
    }

    /* JADX INFO: renamed from: yl */
    public final /* synthetic */ rx.c m5129yl(String str, final JSONObject jSONObject) {
        return this.f8580Q.scheduled("post/bulk/messages/" + str, -1, new v9j() { // from class: l.e68
            public final Object call() {
                return ia20.m16567a(new v9j() { // from class: l.b98
                    public final Object call() {
                        return C0154a.f3483P.auth().q(C0154a.m3143J0("/bulk-messages")).l(utc0.create(Network.JSON, jSONObject.toString())).b();
                    }
                });
            }
        }).map(new w9j() { // from class: l.f68
            public final Object call(Object obj) {
                return roj0.a;
            }
        });
    }

    /* JADX INFO: renamed from: ym */
    public final /* synthetic */ rx.c m5130ym(String str, String str2, Envelope envelope) {
        List list = envelope.getModuleData(CoreData.class).audioTexts;
        if (vwb.J(list)) {
            return m4823ag(str2, str);
        }
        m4599Hi(str, (AudioText) list.get(0));
        return rx.c.just((AudioText) list.get(0));
    }

    /* JADX INFO: renamed from: yn */
    public rx.c<roj0> m5131yn(final long j) {
        return this.f8580Q.now(rx.c.fromCallable(new Callable() { // from class: l.a78
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f8130a.m4720Rj(j);
            }
        }).compose(C0154a.m3182T2()));
    }

    /* JADX INFO: renamed from: yo */
    public rx.c<roj0> m5132yo(final List<IceBreakingQuestion> list) {
        return this.f8580Q.scheduled("users/me/chat-profiles/patch", -1, new v9j() { // from class: l.o48
            public final Object call() {
                return this.f18008a.m4875el(list);
            }
        });
    }

    /* JADX INFO: renamed from: yp */
    public void m5133yp(final String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        e51.y(new Runnable() { // from class: l.nr7
            @Override // java.lang.Runnable
            public final void run() {
                this.f17815a.m4865dm(str);
            }
        });
    }

    /* JADX INFO: renamed from: yq */
    public final void m5134yq(final long j, final String str) {
        this.f8580Q.f3598U.m13685a(new d30() { // from class: l.gv7
            public final void call() {
                this.f13519a.m4699Pm(j, str);
            }
        });
    }

    /* JADX INFO: renamed from: ze */
    public void m5135ze(boolean z) {
        if (ura.m25555e().m25559d().m5806ka() || z) {
            if (mqi0.o() >= ((Long) this.f8580Q.f3628e0.f19106w1.get()).longValue() || z) {
                boolean z2 = false;
                try {
                    if (Long.parseLong(CoreModule.m1850H().userId()) % ((long) ura.m25555e().m25559d().m5846qi()) == 0) {
                        z2 = true;
                    }
                } catch (Exception e) {
                    CrashHelper.c(e);
                }
                if (z ? true : z2) {
                    CoreModule.f1534c.f3631f0.m5003on().map(new w9j() { // from class: l.qu7
                        public final Object call(Object obj) {
                            return Boolean.valueOf(((q860) obj).c());
                        }
                    }).filter(new w9j() { // from class: l.ru7
                        public final Object call(Object obj) {
                            return Boolean.valueOf(!((Boolean) obj).booleanValue());
                        }
                    }).first().observeOn(Schedulers.io()).map(new w9j() { // from class: l.su7
                        public final Object call(Object obj) {
                            return this.f21659a.m4694Ph((Boolean) obj);
                        }
                    }).subscribe(mkd0.H(new e30() { // from class: l.tu7
                        public final void call(Object obj) {
                            this.f22278a.m4706Qh((xaj0) obj);
                        }
                    }, new e30() { // from class: l.uu7
                        public final void call(Object obj) {
                            C0166g.m4331k7((Throwable) obj);
                        }
                    }));
                }
            }
        }
    }

    /* JADX INFO: renamed from: zf */
    public void m5136zf(final String str) {
        e51.y(new Runnable() { // from class: l.vt7
            @Override // java.lang.Runnable
            public final void run() {
                this.f24449a.m4872ei(str);
            }
        });
    }

    /* JADX INFO: renamed from: zg */
    public LinkedHashMap<String, UserLiveLabel> m5137zg(boolean z) {
        LinkedHashMap<String, UserLiveLabel> linkedHashMap = z ? (LinkedHashMap) this.f3835B2.e() : (LinkedHashMap) this.f3838C2.e();
        return linkedHashMap == null ? f3818R2 : linkedHashMap;
    }

    /* JADX INFO: renamed from: zh */
    public rx.c<Boolean> m5138zh(final String str, final String str2, final String str3) {
        return scheduled("conversation/" + str2 + "/harass-hint", 0, new v9j() { // from class: l.ou7
            public final Object call() {
                return ia20.m16567a(new v9j() { // from class: l.lz7
                    public final Object call() {
                        return C0154a.f3483P.auth().q(C0154a.m3130G("/antispam/receiver/" + str + "/conversation/" + str + "/harass-hint?hitWord=" + str)).f().b();
                    }
                }).map(new w9j() { // from class: l.mz7
                    public final Object call(Object obj) {
                        return Boolean.valueOf(((Envelope) obj).getModuleData(CoreData.class).hint);
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: zi */
    public final /* synthetic */ roj0 m5139zi(roj0 roj0Var) {
        m4580Fo();
        return roj0.a;
    }

    /* JADX INFO: renamed from: zk */
    public final /* synthetic */ q860 m5141zk(List list, DbLinks dbLinks) {
        return m12325Z2(list, dbLinks);
    }

    /* JADX INFO: renamed from: zm */
    public final /* synthetic */ rx.c m5143zm(final String str, final String str2) {
        return ia20.m16571e(new v9j() { // from class: l.uy7
            public final Object call() {
                return C0154a.f3483P.auth().q(C0154a.m3141I2("/conversations/" + str + "/messages/" + str2 + "/audiotexts")).l(utc0.create(Network.JSON, "")).b();
            }
        }).flatMap(new w9j() { // from class: l.vy7
            public final Object call(Object obj) {
                return this.f24532a.m5130ym(str2, str, (Envelope) obj);
            }
        }).observeOn(jo0.a());
    }

    /* JADX INFO: renamed from: zn */
    public rx.c<LinkedHashMap<String, UserLiveLabel>> m5144zn() {
        return this.f3838C2.asObservable().observeOn(jo0.a());
    }

    /* JADX INFO: renamed from: zo */
    public rx.c<roj0> m5145zo(Message message) {
        if (message == null) {
            return null;
        }
        final Message messageClone = message.clone();
        if (messageClone.additionalData == null) {
            messageClone.additionalData = MessageAdditionalData.new_();
        }
        MessageAdditionalData messageAdditionalData = messageClone.additionalData;
        if (messageAdditionalData.limitTimePicture == null) {
            messageAdditionalData.limitTimePicture = LimitTimePicture.new_();
        }
        messageClone.additionalData.limitTimePicture.status = LimitTimePictureStatus.get("read");
        return this.f8580Q.scheduled("patchLimitTimePictureMessage" + ((DbObject) messageClone).id, -1, new v9j() { // from class: l.np7
            public final Object call() {
                return this.f17788a.m4899gl(messageClone);
            }
        });
    }

    /* JADX INFO: renamed from: zp */
    public Conversation m5146zp(String str) {
        return e51.D() ? m4786Xe(str) : m4665Mo(str);
    }

    /* JADX INFO: renamed from: zq */
    public void m5147zq(List<Conversation> list) {
        if (vwb.J(list)) {
            return;
        }
        vwb.z(list, new e30() { // from class: l.yy7
            public final void call(Object obj) {
                this.f28492a.m4711Qm((Conversation) obj);
            }
        });
    }
}
