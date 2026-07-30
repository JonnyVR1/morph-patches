package com.p046p1.mobile.putong.core.api;

import android.app.Activity;
import android.graphics.BitmapFactory;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.LruCache;
import androidx.core.app.NotificationCompat;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.google.common.base.Optional;
import com.google.common.collect.Lists;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.Constants;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.google.gson.JsonObject;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.App;
import com.p046p1.mobile.putong.api.api.Network;
import com.p046p1.mobile.putong.api.api.TantanException;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.C4728a;
import com.p046p1.mobile.putong.core.api.C4740g;
import com.p046p1.mobile.putong.core.api.RunnableC4733c0;
import com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface;
import com.p046p1.mobile.putong.core.data.AiPicture;
import com.p046p1.mobile.putong.core.data.AudioText;
import com.p046p1.mobile.putong.core.data.BreakIce;
import com.p046p1.mobile.putong.core.data.ChatAssistantQuestion;
import com.p046p1.mobile.putong.core.data.ChatGameInfo;
import com.p046p1.mobile.putong.core.data.ChatHeatActionData;
import com.p046p1.mobile.putong.core.data.ChatMM;
import com.p046p1.mobile.putong.core.data.ChatNewMatchEnvelope;
import com.p046p1.mobile.putong.core.data.ChatProfile;
import com.p046p1.mobile.putong.core.data.CipherId;
import com.p046p1.mobile.putong.core.data.Conversation;
import com.p046p1.mobile.putong.core.data.ConversationAdditional;
import com.p046p1.mobile.putong.core.data.ConversationAdditionalTag;
import com.p046p1.mobile.putong.core.data.ConversationBatchPatchIds;
import com.p046p1.mobile.putong.core.data.ConversationGame;
import com.p046p1.mobile.putong.core.data.ConversationIceBreaking;
import com.p046p1.mobile.putong.core.data.ConversationPatchRecord;
import com.p046p1.mobile.putong.core.data.ConversationPatchState;
import com.p046p1.mobile.putong.core.data.ConversationQuickChat;
import com.p046p1.mobile.putong.core.data.ConversationType;
import com.p046p1.mobile.putong.core.data.CoreData;
import com.p046p1.mobile.putong.core.data.CoreMomentInfo;
import com.p046p1.mobile.putong.core.data.CountdownItem;
import com.p046p1.mobile.putong.core.data.CounterVerification;
import com.p046p1.mobile.putong.core.data.ExchangePicture;
import com.p046p1.mobile.putong.core.data.ExposureNewMatch;
import com.p046p1.mobile.putong.core.data.FriendInfo;
import com.p046p1.mobile.putong.core.data.HarassAlertInfo;
import com.p046p1.mobile.putong.core.data.IceBreakingQuestion;
import com.p046p1.mobile.putong.core.data.InsertConversationUser;
import com.p046p1.mobile.putong.core.data.LimitTimePicture;
import com.p046p1.mobile.putong.core.data.LimitTimePictureStatus;
import com.p046p1.mobile.putong.core.data.LocalPlaceBan;
import com.p046p1.mobile.putong.core.data.LogoutCounterEnvelope;
import com.p046p1.mobile.putong.core.data.LogoutRecommendEnvelope;
import com.p046p1.mobile.putong.core.data.LogoutRecommendUser;
import com.p046p1.mobile.putong.core.data.LoveLetterMessageState;
import com.p046p1.mobile.putong.core.data.Message;
import com.p046p1.mobile.putong.core.data.MessageAdditionalData;
import com.p046p1.mobile.putong.core.data.MessageChannel;
import com.p046p1.mobile.putong.core.data.MessageFeedbackStatus;
import com.p046p1.mobile.putong.core.data.MessageSetting;
import com.p046p1.mobile.putong.core.data.MessageType;
import com.p046p1.mobile.putong.core.data.NotificationStatus;
import com.p046p1.mobile.putong.core.data.OfficialAccount;
import com.p046p1.mobile.putong.core.data.OfficialAccountsMenu;
import com.p046p1.mobile.putong.core.data.OfficialAccountsSubMenu;
import com.p046p1.mobile.putong.core.data.OnlineLiveChatPair;
import com.p046p1.mobile.putong.core.data.Prologue;
import com.p046p1.mobile.putong.core.data.Questionnaire;
import com.p046p1.mobile.putong.core.data.ReadMessage;
import com.p046p1.mobile.putong.core.data.SogouGifEnvelope;
import com.p046p1.mobile.putong.core.data.SogouGifPicture;
import com.p046p1.mobile.putong.core.data.StickStatus;
import com.p046p1.mobile.putong.core.data.Sticker;
import com.p046p1.mobile.putong.core.data.StickerSource;
import com.p046p1.mobile.putong.core.data.Surveys;
import com.p046p1.mobile.putong.data.Answer;
import com.p046p1.mobile.putong.data.Audio;
import com.p046p1.mobile.putong.data.CommonData;
import com.p046p1.mobile.putong.data.ConversationCounter;
import com.p046p1.mobile.putong.data.ConversationStatus;
import com.p046p1.mobile.putong.data.Converter;
import com.p046p1.mobile.putong.data.CounterConversations;
import com.p046p1.mobile.putong.data.CounterMessages;
import com.p046p1.mobile.putong.data.Data;
import com.p046p1.mobile.putong.data.DbLinks;
import com.p046p1.mobile.putong.data.Dimension;
import com.p046p1.mobile.putong.data.Envelope;
import com.p046p1.mobile.putong.data.Links;
import com.p046p1.mobile.putong.data.Location;
import com.p046p1.mobile.putong.data.MatchFrom;
import com.p046p1.mobile.putong.data.MatchScData;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.MediaLocalStatus;
import com.p046p1.mobile.putong.data.Meta;
import com.p046p1.mobile.putong.data.PartialIdList;
import com.p046p1.mobile.putong.data.Picture;
import com.p046p1.mobile.putong.data.ProfileCompletion;
import com.p046p1.mobile.putong.data.PushMessageCustom;
import com.p046p1.mobile.putong.data.Relationship;
import com.p046p1.mobile.putong.data.RelationshipStatus;
import com.p046p1.mobile.putong.data.Report;
import com.p046p1.mobile.putong.data.SchemeKey;
import com.p046p1.mobile.putong.data.UnreadDetail;
import com.p046p1.mobile.putong.data.UploadSource;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.UserLiveLabel;
import com.p046p1.mobile.putong.data.Video;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.data.tenum.TEnumColumn;
import com.p046p1.mobile.putong.p065ui.share.ShareHelper;
import com.p046p1.mobile.putong.remote_config.RemoteConfig;
import com.p046p1.mobile.putong.util.TrackMediaUploadUtil;
import com.p046p1.mobile.putong.wxapi.WXEntryActivity;
import com.p069ss.bytertc.audio.device.webrtc.WebRtcAudioTrack;
import com.tantan.core.base.R$string;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.data.ProtobufAdapter;
import com.tantanapp.common.data.orm.BooleanColumn;
import com.tantanapp.common.data.orm.DoubleColumn;
import com.tantanapp.common.data.orm.Filter;
import com.tantanapp.common.data.orm.IntegerColumn;
import com.tantanapp.common.data.orm.StringColumn;
import com.tantanapp.common.network.ApiExcep;
import com.tantanapp.common.utils.ConnectivityReceiver;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import com.tantanapp.foxstatistics.entity.EventNameEnum;
import com.tencent.could.huiyansdk.overseas.HuiYanOsConfig;
import com.tencent.mmkv.MMKV;
import com.tencent.p101mm.opensdk.modelmsg.SendMessageToWX;
import com.tencent.p101mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.p101mm.opensdk.modelmsg.WXWebpageObject;
import com.tencent.p101mm.opensdk.openapi.IWXAPI;
import com.tencent.p101mm.opensdk.openapi.WXAPIFactory;
import com.tencent.youtu.sdkkitframework.common.WeJson;
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
import org.fourthline.cling.support.model.dlna.DLNAProfiles;
import org.jetbrains.annotations.TestOnly;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p133rx.C22306c;
import p133rx.schedulers.Schedulers;
import p133rx.subjects.C22392a;
import p133rx.subjects.C22393b;
import p149l.adk0;
import p149l.ax6;
import p149l.bud0;
import p149l.c4g0;
import p149l.cm10;
import p149l.d30;
import p149l.du2;
import p149l.e30;
import p149l.e51;
import p149l.f8c;
import p149l.fgf0;
import p149l.fu7;
import p149l.ggi;
import p149l.hmb;
import p149l.hpd0;
import p149l.hyx;
import p149l.ia20;
import p149l.j760;
import p149l.jl6;
import p149l.jo0;
import p149l.juk;
import p149l.jx50;
import p149l.k9j;
import p149l.ka20;
import p149l.kc30;
import p149l.knb0;
import p149l.kpd0;
import p149l.l3f;
import p149l.la20;
import p149l.lsi0;
import p149l.lsx;
import p149l.lz4;
import p149l.mcr;
import p149l.mkd0;
import p149l.mqi0;
import p149l.n11;
import p149l.na8;
import p149l.oa8;
import p149l.ogw;
import p149l.orh0;
import p149l.pgm;
import p149l.pxz;
import p149l.q860;
import p149l.qib0;
import p149l.qjd0;
import p149l.qnd;
import p149l.qqi0;
import p149l.qtm;
import p149l.r5l0;
import p149l.rhi;
import p149l.roj0;
import p149l.s5l0;
import p149l.stc0;
import p149l.t38;
import p149l.tpd0;
import p149l.uqd0;
import p149l.ura;
import p149l.utc0;
import p149l.v9j;
import p149l.vwb;
import p149l.vx6;
import p149l.w9j;
import p149l.wf6;
import p149l.wxz;
import p149l.x9j;
import p149l.xaj0;
import p149l.xh5;
import p149l.y9j;
import p149l.zpd0;
import p149l.zvf0;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.api.g */
/* JADX INFO: loaded from: classes9.dex */
public class C4740g extends ax6 {

    /* JADX INFO: renamed from: R2 */
    public static final LinkedHashMap<String, UserLiveLabel> f19829R2 = new LinkedHashMap<>();

    /* JADX INFO: renamed from: S2 */
    public static String f19830S2 = "message";

    /* JADX INFO: renamed from: T2 */
    public static hpd0 f19831T2 = new hpd0("has_in_feed_interaction_" + CoreModule.m29931H().userId(), Boolean.TRUE);

    /* JADX INFO: renamed from: U2 */
    public static int f19832U2 = 1;

    /* JADX INFO: renamed from: V2 */
    public static int f19833V2 = 2;

    /* JADX INFO: renamed from: W2 */
    public static int f19834W2 = 3;

    /* JADX INFO: renamed from: X2 */
    public static int f19835X2 = 4;

    /* JADX INFO: renamed from: Y2 */
    public static String f19836Y2;

    /* JADX INFO: renamed from: Z2 */
    public static final String f19837Z2;

    /* JADX INFO: renamed from: a3 */
    public static int f19838a3;

    /* JADX INFO: renamed from: b3 */
    public static bud0 f19839b3;

    /* JADX INFO: renamed from: c3 */
    public static final Filter<Conversation> f19840c3;

    /* JADX INFO: renamed from: A0 */
    public C22392a<Boolean> f19841A0;

    /* JADX INFO: renamed from: A1 */
    public hpd0 f19842A1;

    /* JADX INFO: renamed from: A2 */
    public c4g0 f19843A2;

    /* JADX INFO: renamed from: B0 */
    public C22392a<ChatProfile> f19844B0;

    /* JADX INFO: renamed from: B1 */
    public hpd0 f19845B1;

    /* JADX INFO: renamed from: B2 */
    public C22392a<LinkedHashMap<String, UserLiveLabel>> f19846B2;

    /* JADX INFO: renamed from: C0 */
    public C22392a<List<IceBreakingQuestion>> f19847C0;

    /* JADX INFO: renamed from: C1 */
    public zpd0 f19848C1;

    /* JADX INFO: renamed from: C2 */
    public C22392a<LinkedHashMap<String, UserLiveLabel>> f19849C2;

    /* JADX INFO: renamed from: D0 */
    public final C22392a<j760<List<Conversation>, Integer>> f19850D0;

    /* JADX INFO: renamed from: D1 */
    public tpd0 f19851D1;

    /* JADX INFO: renamed from: D2 */
    public long f19852D2;

    /* JADX INFO: renamed from: E0 */
    public uqd0 f19853E0;

    /* JADX INFO: renamed from: E1 */
    public tpd0 f19854E1;

    /* JADX INFO: renamed from: E2 */
    public LruCache<String, CoreMomentInfo> f19855E2;

    /* JADX INFO: renamed from: F0 */
    public C22392a<Boolean> f19856F0;

    /* JADX INFO: renamed from: F1 */
    public final hpd0 f19857F1;

    /* JADX INFO: renamed from: F2 */
    public HashSet<String> f19858F2;

    /* JADX INFO: renamed from: G0 */
    public hpd0 f19859G0;

    /* JADX INFO: renamed from: G1 */
    public hpd0 f19860G1;

    /* JADX INFO: renamed from: G2 */
    public HashSet<String> f19861G2;

    /* JADX INFO: renamed from: H0 */
    public zpd0 f19862H0;

    /* JADX INFO: renamed from: H1 */
    public tpd0 f19863H1;

    /* JADX INFO: renamed from: H2 */
    public C22392a<roj0> f19864H2;

    /* JADX INFO: renamed from: I0 */
    public zpd0 f19865I0;

    /* JADX INFO: renamed from: I1 */
    public zpd0 f19866I1;

    /* JADX INFO: renamed from: I2 */
    public C22392a<Integer> f19867I2;

    /* JADX INFO: renamed from: J0 */
    public uqd0 f19868J0;

    /* JADX INFO: renamed from: J1 */
    public tpd0 f19869J1;

    /* JADX INFO: renamed from: J2 */
    public C22392a<List<Conversation>> f19870J2;

    /* JADX INFO: renamed from: K0 */
    public hpd0 f19871K0;

    /* JADX INFO: renamed from: K1 */
    public zpd0 f19872K1;

    /* JADX INFO: renamed from: K2 */
    public C22392a<List<Conversation>> f19873K2;

    /* JADX INFO: renamed from: L0 */
    public tpd0 f19874L0;

    /* JADX INFO: renamed from: L1 */
    public tpd0 f19875L1;

    /* JADX INFO: renamed from: L2 */
    public C22393b<String> f19876L2;

    /* JADX INFO: renamed from: M0 */
    public zpd0 f19877M0;

    /* JADX INFO: renamed from: M1 */
    public zpd0 f19878M1;

    /* JADX INFO: renamed from: M2 */
    public d f19879M2;

    /* JADX INFO: renamed from: N0 */
    public tpd0 f19880N0;

    /* JADX INFO: renamed from: N1 */
    public tpd0 f19881N1;

    /* JADX INFO: renamed from: N2 */
    public Map<String, Message> f19882N2;

    /* JADX INFO: renamed from: O0 */
    public zpd0 f19883O0;

    /* JADX INFO: renamed from: O1 */
    public zpd0 f19884O1;

    /* JADX INFO: renamed from: O2 */
    public C22392a<roj0> f19885O2;

    /* JADX INFO: renamed from: P0 */
    public tpd0 f19886P0;

    /* JADX INFO: renamed from: P1 */
    public String f19887P1;

    /* JADX INFO: renamed from: P2 */
    public boolean f19888P2;

    /* JADX INFO: renamed from: Q0 */
    public boolean f19889Q0;

    /* JADX INFO: renamed from: Q1 */
    public boolean f19890Q1;

    /* JADX INFO: renamed from: Q2 */
    public boolean f19891Q2;

    /* JADX INFO: renamed from: R */
    public jx50 f19892R;

    /* JADX INFO: renamed from: R0 */
    public uqd0 f19893R0;

    /* JADX INFO: renamed from: R1 */
    public c4g0 f19894R1;

    /* JADX INFO: renamed from: S */
    public kc30 f19895S;

    /* JADX INFO: renamed from: S0 */
    public uqd0 f19896S0;

    /* JADX INFO: renamed from: S1 */
    public C22392a<User> f19897S1;

    /* JADX INFO: renamed from: T */
    public Boolean f19898T;

    /* JADX INFO: renamed from: T0 */
    public uqd0 f19899T0;

    /* JADX INFO: renamed from: T1 */
    public C22393b<roj0> f19900T1;

    /* JADX INFO: renamed from: U */
    public StringBuilder f19901U;

    /* JADX INFO: renamed from: U0 */
    public uqd0 f19902U0;

    /* JADX INFO: renamed from: U1 */
    public C22392a<roj0> f19903U1;

    /* JADX INFO: renamed from: V */
    public long f19904V;

    /* JADX INFO: renamed from: V0 */
    public uqd0 f19905V0;

    /* JADX INFO: renamed from: V1 */
    public C22393b<roj0> f19906V1;

    /* JADX INFO: renamed from: W */
    public C22393b<Throwable> f19907W;

    /* JADX INFO: renamed from: W0 */
    public hpd0 f19908W0;

    /* JADX INFO: renamed from: W1 */
    public C22393b<roj0> f19909W1;

    /* JADX INFO: renamed from: X */
    public C22393b<Message> f19910X;

    /* JADX INFO: renamed from: X0 */
    public hpd0 f19911X0;

    /* JADX INFO: renamed from: X1 */
    public C22392a<q860<Conversation>> f19912X1;

    /* JADX INFO: renamed from: Y */
    public C22393b<Message> f19913Y;

    /* JADX INFO: renamed from: Y0 */
    public hpd0 f19914Y0;

    /* JADX INFO: renamed from: Y1 */
    public boolean f19915Y1;

    /* JADX INFO: renamed from: Z */
    public C22392a<String> f19916Z;

    /* JADX INFO: renamed from: Z0 */
    public hpd0 f19917Z0;

    /* JADX INFO: renamed from: Z1 */
    public boolean f19918Z1;

    /* JADX INFO: renamed from: a0 */
    public double f19919a0;

    /* JADX INFO: renamed from: a1 */
    public uqd0 f19920a1;

    /* JADX INFO: renamed from: a2 */
    public String f19921a2;

    /* JADX INFO: renamed from: b0 */
    public C22393b<Message> f19922b0;

    /* JADX INFO: renamed from: b1 */
    public uqd0 f19923b1;

    /* JADX INFO: renamed from: b2 */
    public C22393b<Boolean> f19924b2;

    /* JADX INFO: renamed from: c0 */
    public C22393b<Message> f19925c0;

    /* JADX INFO: renamed from: c1 */
    public uqd0 f19926c1;

    /* JADX INFO: renamed from: c2 */
    public C22392a<j760<String, String>> f19927c2;

    /* JADX INFO: renamed from: d0 */
    public C22393b<roj0> f19928d0;

    /* JADX INFO: renamed from: d1 */
    public hpd0 f19929d1;

    /* JADX INFO: renamed from: d2 */
    public c4g0 f19930d2;

    /* JADX INFO: renamed from: e0 */
    public C22393b<roj0> f19931e0;

    /* JADX INFO: renamed from: e1 */
    public uqd0 f19932e1;

    /* JADX INFO: renamed from: e2 */
    public C22393b<String> f19933e2;

    /* JADX INFO: renamed from: f0 */
    public C22392a<Boolean> f19934f0;

    /* JADX INFO: renamed from: f1 */
    public hpd0 f19935f1;

    /* JADX INFO: renamed from: f2 */
    public C22393b<String> f19936f2;

    /* JADX INFO: renamed from: g0 */
    public C22393b<roj0> f19937g0;

    /* JADX INFO: renamed from: g1 */
    public hpd0 f19938g1;

    /* JADX INFO: renamed from: g2 */
    public double f19939g2;

    /* JADX INFO: renamed from: h0 */
    public C22392a<xaj0<String, PushMessageCustom, Long>> f19940h0;

    /* JADX INFO: renamed from: h1 */
    public zpd0 f19941h1;

    /* JADX INFO: renamed from: h2 */
    public C22393b<knb0<String, Integer, Integer, Integer>> f19942h2;

    /* JADX INFO: renamed from: i0 */
    public long f19943i0;

    /* JADX INFO: renamed from: i1 */
    public tpd0 f19944i1;

    /* JADX INFO: renamed from: i2 */
    public uqd0 f19945i2;

    /* JADX INFO: renamed from: j0 */
    public zpd0 f19946j0;

    /* JADX INFO: renamed from: j1 */
    public zpd0 f19947j1;

    /* JADX INFO: renamed from: j2 */
    public volatile ChatGameInfo f19948j2;

    /* JADX INFO: renamed from: k0 */
    public long f19949k0;

    /* JADX INFO: renamed from: k1 */
    public uqd0 f19950k1;

    /* JADX INFO: renamed from: k2 */
    public final Set<String> f19951k2;

    /* JADX INFO: renamed from: l0 */
    public zpd0 f19952l0;

    /* JADX INFO: renamed from: l1 */
    public hpd0 f19953l1;

    /* JADX INFO: renamed from: l2 */
    public String f19954l2;

    /* JADX INFO: renamed from: m0 */
    public final tpd0 f19955m0;

    /* JADX INFO: renamed from: m1 */
    public kpd0 f19956m1;

    /* JADX INFO: renamed from: m2 */
    public Set<String> f19957m2;

    /* JADX INFO: renamed from: n0 */
    public zpd0 f19958n0;

    /* JADX INFO: renamed from: n1 */
    public hpd0 f19959n1;

    /* JADX INFO: renamed from: n2 */
    public volatile List<String> f19960n2;

    /* JADX INFO: renamed from: o0 */
    public hpd0 f19961o0;

    /* JADX INFO: renamed from: o1 */
    public hpd0 f19962o1;

    /* JADX INFO: renamed from: o2 */
    public volatile List<Message> f19963o2;

    /* JADX INFO: renamed from: p0 */
    public hpd0 f19964p0;

    /* JADX INFO: renamed from: p1 */
    public hpd0 f19965p1;

    /* JADX INFO: renamed from: p2 */
    public C22392a<roj0> f19966p2;

    /* JADX INFO: renamed from: q0 */
    public hpd0 f19967q0;

    /* JADX INFO: renamed from: q1 */
    public hpd0 f19968q1;

    /* JADX INFO: renamed from: q2 */
    public C22392a<j760<Integer, Integer>> f19969q2;

    /* JADX INFO: renamed from: r0 */
    public hpd0 f19970r0;

    /* JADX INFO: renamed from: r1 */
    public zpd0 f19971r1;

    /* JADX INFO: renamed from: r2 */
    public C22392a<Boolean> f19972r2;

    /* JADX INFO: renamed from: s0 */
    public hpd0 f19973s0;

    /* JADX INFO: renamed from: s1 */
    public zpd0 f19974s1;

    /* JADX INFO: renamed from: s2 */
    public volatile int f19975s2;

    /* JADX INFO: renamed from: t0 */
    public tpd0 f19976t0;

    /* JADX INFO: renamed from: t1 */
    public zpd0 f19977t1;

    /* JADX INFO: renamed from: t2 */
    public C22392a<xaj0<Integer, Integer, Integer>> f19978t2;

    /* JADX INFO: renamed from: u0 */
    public zpd0 f19979u0;

    /* JADX INFO: renamed from: u1 */
    public tpd0 f19980u1;

    /* JADX INFO: renamed from: u2 */
    public tpd0 f19981u2;

    /* JADX INFO: renamed from: v0 */
    public hpd0 f19982v0;

    /* JADX INFO: renamed from: v1 */
    public hpd0 f19983v1;

    /* JADX INFO: renamed from: v2 */
    public zpd0 f19984v2;

    /* JADX INFO: renamed from: w0 */
    public hpd0 f19985w0;

    /* JADX INFO: renamed from: w1 */
    public zpd0 f19986w1;

    /* JADX INFO: renamed from: w2 */
    public C22392a<ConversationCounter> f19987w2;

    /* JADX INFO: renamed from: x0 */
    public boolean f19988x0;

    /* JADX INFO: renamed from: x1 */
    public hpd0 f19989x1;

    /* JADX INFO: renamed from: x2 */
    public boolean f19990x2;

    /* JADX INFO: renamed from: y0 */
    public hpd0 f19991y0;

    /* JADX INFO: renamed from: y1 */
    public hpd0 f19992y1;

    /* JADX INFO: renamed from: y2 */
    public boolean f19993y2;

    /* JADX INFO: renamed from: z0 */
    public tpd0 f19994z0;

    /* JADX INFO: renamed from: z1 */
    public hpd0 f19995z1;

    /* JADX INFO: renamed from: z2 */
    public C22392a<Double> f19996z2;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.api.g$a */
    public class a implements Consumer<String> {
        public a() {
        }

        @Override // java.util.function.Consumer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(String str) {
            C4740g.this.m32628Ef(str);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.api.g$b */
    public class b implements d30 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ double f19998a;

        public b(double d) {
            this.f19998a = d;
        }

        @Override // p149l.d30
        public void call() {
            if (this.f19998a == -1.0d) {
                CoreModule.f17553k.f91950m.delete("fake_conversation_local_team_group_conversation");
                return;
            }
            Conversation conversationQuery = CoreModule.f17553k.f91950m.query("fake_conversation_local_team_group_conversation");
            if (conversationQuery == null) {
                conversationQuery = Conversation.new_();
                conversationQuery.f56011id = "fake_conversation_local_team_group_conversation";
                double d = this.f19998a;
                conversationQuery.createdTime = d;
                conversationQuery.latestTime = d;
                conversationQuery.convType = "default";
                conversationQuery.localEverHasMessage = true;
                conversationQuery.unreadMessages = 0;
            } else {
                double d2 = conversationQuery.latestTime;
                double d3 = this.f19998a;
                if (d2 != d3) {
                    conversationQuery.latestTime = d3;
                }
            }
            CoreModule.f17545c.f19642f0.m33050mq(conversationQuery);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.api.g$c */
    public class c implements d30 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ double f20000a;

        public c(double d) {
            this.f20000a = d;
        }

        /* JADX WARN: Code duplicated, block: B:14:0x0043  */
        /* JADX WARN: Code duplicated, block: B:16:? A[RETURN, SYNTHETIC] */
        @Override // p149l.d30
        public void call() {
            if (this.f20000a == -1.0d) {
                CoreModule.f17553k.f91950m.delete("fake_conversation_local_limited_trial_see_fold");
                return;
            }
            Conversation conversationQuery = CoreModule.f17553k.f91950m.query("fake_conversation_local_limited_trial_see_fold");
            boolean z = false;
            if (conversationQuery != null) {
                double d = conversationQuery.latestTime;
                double d2 = this.f20000a;
                if (d != d2) {
                    conversationQuery.latestTime = d2;
                }
                if (z) {
                    CoreModule.f17545c.f19642f0.m33050mq(conversationQuery);
                }
            }
            conversationQuery = Conversation.new_();
            conversationQuery.f56011id = "fake_conversation_local_limited_trial_see_fold";
            double d3 = this.f20000a;
            conversationQuery.createdTime = d3;
            conversationQuery.latestTime = d3;
            conversationQuery.convType = "default";
            conversationQuery.localEverHasMessage = true;
            conversationQuery.unreadMessages = 0;
            z = true;
            if (z) {
                CoreModule.f17545c.f19642f0.m33050mq(conversationQuery);
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.api.g$d */
    public static class d extends fgf0<List<OfficialAccount>> {
        public d() {
            super("OfficialAccountsApi", new ggi(new qnd("officialAccounts", "2", qib0.f154713b0.f139230a.userId()), 7, ProtobufAdapter.ARRAY_ADAPTER(OfficialAccount.PROTOBUF_ADAPTER)), new v9j() { // from class: l.xb8
                @Override // p149l.v9j, java.util.concurrent.Callable
                public final Object call() {
                    return new la20(new v9j() { // from class: l.yb8
                        @Override // p149l.v9j, java.util.concurrent.Callable
                        public final Object call() {
                            return C4728a.f19494P.auth().m185898q(C4728a.m31200G("/official-accounts?with=menus")).m185887f().m185883b();
                        }
                    }).map(new w9j() { // from class: l.zb8
                        @Override // p149l.w9j
                        public final Object call(Object obj) {
                            return C4740g.d.m33221D((Envelope) obj);
                        }
                    });
                }
            });
        }

        /* JADX INFO: renamed from: D */
        public static /* synthetic */ List m33221D(Envelope envelope) {
            if (NullChecker.m81303a(((CoreData) envelope.getModuleData(CoreData.class)).officialAccounts) && NullChecker.m81303a(((CoreData) envelope.getModuleData(CoreData.class)).menus)) {
                for (OfficialAccount officialAccount : ((CoreData) envelope.getModuleData(CoreData.class)).officialAccounts) {
                    for (final String str : officialAccount.menuIds) {
                        OfficialAccountsMenu officialAccountsMenu = (OfficialAccountsMenu) vwb.m200346r(((CoreData) envelope.getModuleData(CoreData.class)).menus, new w9j() { // from class: l.ac8
                            @Override // p149l.w9j
                            public final Object call(Object obj) {
                                return Boolean.valueOf(str.equals(((OfficialAccountsMenu) obj).f20460id));
                            }
                        });
                        if (NullChecker.m81303a(officialAccountsMenu)) {
                            if (officialAccount.localMenus == null) {
                                officialAccount.localMenus = new ArrayList();
                            }
                            officialAccount.localMenus.add(officialAccountsMenu);
                            if (NullChecker.m81303a(officialAccountsMenu.children)) {
                                for (final String str2 : officialAccountsMenu.children) {
                                    OfficialAccountsMenu officialAccountsMenu2 = (OfficialAccountsMenu) vwb.m200346r(((CoreData) envelope.getModuleData(CoreData.class)).menus, new w9j() { // from class: l.bc8
                                        @Override // p149l.w9j
                                        public final Object call(Object obj) {
                                            return Boolean.valueOf(str2.equals(((OfficialAccountsMenu) obj).f20460id));
                                        }
                                    });
                                    if (NullChecker.m81303a(officialAccountsMenu2)) {
                                        OfficialAccountsSubMenu officialAccountsSubMenu = new OfficialAccountsSubMenu();
                                        officialAccountsSubMenu.f20461id = officialAccountsMenu2.f20460id;
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
            return ((CoreData) envelope.getModuleData(CoreData.class)).officialAccounts;
        }
    }

    static {
        f19837Z2 = juk.m143323e() ? "https://m.staging2.p1staff.com/fep/tantan/frontend/tantan-frontend-app-pages-v2/src/pages/core/warming/index.html?speed=true&_bid=1003197&hideNavigationBar=1&hideNotch=1" : "https://m.tantanapp.com/fep/tantan/frontend/tantan-frontend-app-pages-v2/src/pages/core/warming/index.html?speed=true&_bid=1003197&hideNavigationBar=1&hideNotch=1";
        f19838a3 = 500;
        f19839b3 = Schedulers.from(Executors.newSingleThreadScheduledExecutor());
        Filter<Conversation> filterMo60175EQ = Conversation.CONVTYPE.mo60175EQ(ConversationType.swiper);
        Filter<Conversation> filterNOT_STARTS_WITH = Conversation.f20372ID.NOT_STARTS_WITH("fake_conversation");
        TEnumColumn<Conversation, ConversationStatus> tEnumColumn = Conversation.STATUS;
        f19840c3 = Filter.AND(filterMo60175EQ, filterNOT_STARTS_WITH, tEnumColumn.NEQ("dismissed"), tEnumColumn.NEQ("deleted"), tEnumColumn.NEQ("removed"));
    }

    public C4740g(C4732c c4732c) {
        super(c4732c);
        this.f19892R = new jx50();
        this.f19895S = new kc30();
        Boolean bool = Boolean.FALSE;
        this.f19898T = bool;
        this.f19901U = new StringBuilder("");
        this.f19904V = RemoteConfig.m79298x().m79300B("intl_text_buzz_auto_delete_interval", 86400L) * 1000;
        this.f19907W = C22393b.m221521b();
        this.f19910X = C22393b.m221521b();
        this.f19913Y = C22393b.m221521b();
        this.f19916Z = C22392a.m221513c("");
        this.f19919a0 = -1.0d;
        this.f19922b0 = C22393b.m221521b();
        this.f19925c0 = C22393b.m221521b();
        this.f19928d0 = C22393b.m221521b();
        this.f19931e0 = C22393b.m221521b();
        this.f19934f0 = C22392a.m221513c(bool);
        this.f19937g0 = C22393b.m221521b();
        this.f19940h0 = C22392a.m221513c(new xaj0("impress_conv_state_default", null, -1L));
        this.f19943i0 = 0L;
        this.f19946j0 = new zpd0("fold_conversation_split_time_saved" + CoreModule.m29931H().userId(), 0L);
        this.f19949k0 = 0L;
        this.f19952l0 = new zpd0("weaken_conv_time_saved" + CoreModule.m29931H().userId(), 0L);
        this.f19955m0 = new tpd0("localConversationId" + CoreModule.m29931H().userId(), 0);
        this.f19958n0 = new zpd0("last_chat_button_safety_reminder_time_" + CoreModule.m29931H().userId(), 0L);
        this.f19961o0 = new hpd0("hide_chat_button_safety_reminder_" + CoreModule.m29931H().userId(), bool);
        this.f19964p0 = new hpd0("is_show_all_match_pop_window" + CoreModule.m29931H().userId(), bool);
        this.f19967q0 = null;
        this.f19970r0 = null;
        String str = "conv_cell_weaken_fun_warn" + CoreModule.m29931H().userId();
        Boolean bool2 = Boolean.TRUE;
        this.f19973s0 = new hpd0(str, bool2);
        this.f19976t0 = new tpd0("conv_weaken_show_count" + CoreModule.m29931H().userId(), 0);
        this.f19979u0 = new zpd0("conv_cell_weaken_fun_warn_close_time" + CoreModule.m29931H().userId(), 0L);
        this.f19982v0 = new hpd0("conv_cell_fold_switch_open" + CoreModule.m29931H().userId(), bool2);
        this.f19985w0 = new hpd0("conv_cell_fold_fun_open" + CoreModule.m29931H().userId(), bool);
        this.f19988x0 = true;
        this.f19991y0 = new hpd0("conv_cell_fold_fun_is_open_save" + CoreModule.m29931H().userId(), bool);
        this.f19994z0 = new tpd0("hideChatButtonSafetyReminderCount" + CoreModule.m29931H().userId(), 0);
        this.f19841A0 = C22392a.m221513c(bool);
        this.f19844B0 = C22392a.m221512b();
        this.f19847C0 = C22392a.m221512b();
        this.f19850D0 = C22392a.m221513c(j760.m140076a(null, 0));
        this.f19853E0 = new uqd0("message_new_match_op_back" + CoreModule.m29931H().userId(), "");
        this.f19856F0 = C22392a.m221512b();
        this.f19859G0 = new hpd0("male_like_limit_is_req" + CoreModule.m29931H().userId(), bool);
        this.f19862H0 = new zpd0("male_like_limit_star_time_" + CoreModule.m29931H().userId(), 0L);
        this.f19865I0 = new zpd0("male_like_limit_end_time_" + CoreModule.m29931H().userId(), 0L);
        this.f19868J0 = new uqd0("male_like_limit_user_id_" + CoreModule.m29931H().userId(), "");
        this.f19871K0 = new hpd0("male_like_limit_hidden_" + CoreModule.m29931H().userId(), bool);
        this.f19874L0 = new tpd0("clean_unread_notification" + CoreModule.m29931H().userId(), -1);
        this.f19877M0 = new zpd0("last_show_ice_emoji_no_reply_time" + CoreModule.m29931H().userId(), 0L);
        this.f19880N0 = new tpd0("last_show_ice_emoji_noreply_show_count" + CoreModule.m29931H().userId(), 0);
        this.f19883O0 = new zpd0("last_show_ice_emoji_message_time_limit_time" + CoreModule.m29931H().userId(), 0L);
        this.f19886P0 = new tpd0("last_show_ice_emoji_message_time_count" + CoreModule.m29931H().userId(), 0);
        this.f19889Q0 = false;
        this.f19893R0 = new uqd0("special_guest_last_message" + CoreModule.m29931H().userId(), "Hi，我是探探特邀嘉宾，很开心遇见你！");
        this.f19896S0 = new uqd0("special_guest_avatar_url" + CoreModule.m29931H().userId(), "");
        this.f19899T0 = new uqd0("special_guest_avatar_name" + CoreModule.m29931H().userId(), "");
        this.f19902U0 = new uqd0("greet_accessory_Text" + CoreModule.m29931H().userId(), "叮咚！已经为你找到匹配度98.9%的人啦，点击卡片去打个招呼吧");
        this.f19905V0 = new uqd0("special_guest_h5_url" + CoreModule.m29931H().userId(), "");
        this.f19908W0 = new hpd0("special_guest_finish_info_fail" + CoreModule.m29931H().userId(), bool);
        this.f19911X0 = new hpd0("special_guest_end_word" + CoreModule.m29931H().userId(), bool);
        this.f19914Y0 = new hpd0("special_guest_fill_finished" + CoreModule.m29931H().userId(), bool);
        this.f19917Z0 = new hpd0("special_guest_show_red_dot" + CoreModule.m29931H().userId(), bool);
        this.f19920a1 = new uqd0("special_guest_user_info_name" + CoreModule.m29931H().userId(), "");
        this.f19923b1 = new uqd0("special_guest_user_info_avatar" + CoreModule.m29931H().userId(), "");
        this.f19926c1 = new uqd0("special_guest_user_info_age" + CoreModule.m29931H().userId(), "");
        this.f19929d1 = new hpd0("special_guest_user_hide_age" + CoreModule.m29931H().userId(), bool);
        this.f19932e1 = new uqd0("special_guest_user_info_uid" + CoreModule.m29931H().userId(), "");
        this.f19935f1 = new hpd0("countdown_like_open", bool);
        this.f19938g1 = new hpd0("warming_level_guide_show" + CoreModule.m29931H().userId(), bool);
        this.f19941h1 = new zpd0("last_pull_conversation_exposure_time_" + CoreModule.m29931H().userId(), 0L);
        this.f19944i1 = new tpd0("pull_conversation_exposure_counter" + CoreModule.m29931H().userId(), 0);
        this.f19947j1 = new zpd0("enter_address_book_matchp_agertimer" + CoreModule.m29931H().userId(), 0L);
        this.f19950k1 = new uqd0("land_priorities" + CoreModule.m29931H().userId(), f19830S2);
        this.f19953l1 = new hpd0("has_show_all_match_pop_window" + CoreModule.m29931H().userId(), bool);
        this.f19956m1 = new kpd0("enter_unread_new_match_timer" + CoreModule.m29931H().userId(), FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);
        this.f19959n1 = new hpd0("red_dot_test_one_debug_open", bool);
        this.f19962o1 = new hpd0("red_dot_test_two_debug_open", bool);
        this.f19965p1 = new hpd0("cht_cell_active_debug_open", bool);
        this.f19968q1 = new hpd0("femaleHeartBeatShortPath", bool);
        this.f19971r1 = new zpd0("oof_enter_click_time" + CoreModule.m29931H().userId(), 0L);
        this.f19974s1 = new zpd0("last_show_oof_enter_time" + CoreModule.m29931H().userId(), 0L);
        this.f19977t1 = new zpd0("last_show_switch_pic_tip_time" + CoreModule.m29931H().userId(), 0L);
        this.f19980u1 = new tpd0("show_switch_pic_tip_counter" + CoreModule.m29931H().userId(), 0);
        this.f19983v1 = new hpd0("show_switch_pic_guide" + CoreModule.m29931H().userId(), bool);
        this.f19986w1 = new zpd0("friend_active_remind_female" + CoreModule.m29931H().userId(), 0L);
        this.f19989x1 = new hpd0("continuous_chat_sp_debug" + CoreModule.m29931H().userId(), bool);
        this.f19992y1 = new hpd0("new_user_show_guide_pop_sp" + CoreModule.m29931H().userId(), bool);
        this.f19995z1 = new hpd0("recommend_new_match_pop_sp" + CoreModule.m29931H().userId(), bool);
        this.f19842A1 = new hpd0("message_media_item_new_pic" + CoreModule.m29931H().userId(), bool);
        this.f19845B1 = new hpd0("message_media_item_swap_anwser" + CoreModule.m29931H().userId(), bool);
        this.f19848C1 = new zpd0("message_sensitive_tips_show_time" + CoreModule.m29931H().userId(), 0L);
        this.f19851D1 = new tpd0("message_sensitive_tips_show_num" + CoreModule.m29931H().userId(), 0);
        this.f19854E1 = new tpd0("associate_show_count_limit" + CoreModule.m29931H().userId(), 0);
        this.f19857F1 = new hpd0("limited_trial_see_fold_conversation_should_deleted_" + CoreModule.m29931H().userId(), bool2);
        this.f19860G1 = new hpd0("hasOpenedPrologueSettingPage" + CoreModule.m29931H().userId(), bool);
        this.f19863H1 = new tpd0("prologuesModuleViewCountToday" + CoreModule.m29931H().userId(), 0);
        this.f19866I1 = new zpd0("lastProloguesModuleViewTime" + CoreModule.m29931H().userId(), 0L);
        this.f19869J1 = new tpd0("prologuesModuleViewDayCount" + CoreModule.m29931H().userId(), 0);
        this.f19872K1 = new zpd0("lastProloguesCloseTime" + CoreModule.m29931H().userId(), 0L);
        this.f19875L1 = new tpd0("prologuesModuleViewCountTodayForNRP" + CoreModule.m29931H().userId(), 0);
        this.f19878M1 = new zpd0("lastProloguesModuleViewTimeForNRP" + CoreModule.m29931H().userId(), 0L);
        this.f19881N1 = new tpd0("prologuesModuleViewDayCountForNRP" + CoreModule.m29931H().userId(), 0);
        this.f19884O1 = new zpd0("lastProloguesCloseTimeForNRP" + CoreModule.m29931H().userId(), 0L);
        this.f19887P1 = null;
        this.f19890Q1 = false;
        this.f19894R1 = null;
        this.f19897S1 = C22392a.m221512b();
        this.f19900T1 = C22393b.m221521b();
        roj0 roj0Var = roj0.f160388a;
        this.f19903U1 = C22392a.m221513c(roj0Var);
        this.f19906V1 = C22393b.m221521b();
        this.f19909W1 = C22393b.m221521b();
        this.f19912X1 = C22392a.m221512b();
        this.f19915Y1 = false;
        this.f19918Z1 = false;
        this.f19921a2 = "";
        this.f19924b2 = C22393b.m221521b();
        this.f19927c2 = C22392a.m221512b();
        this.f19933e2 = C22393b.m221521b();
        this.f19936f2 = C22393b.m221521b();
        this.f19939g2 = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
        this.f19942h2 = C22393b.m221521b();
        this.f19945i2 = new uqd0("chat_game_info" + CoreModule.m29931H().userId(), "");
        this.f19948j2 = null;
        this.f19951k2 = new HashSet();
        this.f19954l2 = "";
        this.f19957m2 = new HashSet();
        this.f19960n2 = new ArrayList();
        this.f19963o2 = new ArrayList();
        this.f19966p2 = C22392a.m221513c(roj0Var);
        this.f19969q2 = C22392a.m221513c(j760.m140076a(0, 0));
        this.f19972r2 = C22392a.m221513c(bool);
        this.f19975s2 = 0;
        this.f19978t2 = C22392a.m221513c(new xaj0(0, 0, 0));
        this.f19981u2 = new tpd0("build_version_code", 0);
        this.f19984v2 = new zpd0("lastLoadTime_" + CoreModule.m29931H().userId(), 0L);
        this.f19987w2 = C22392a.m221512b();
        C22392a<Double> c22392aM221512b = C22392a.m221512b();
        this.f19996z2 = c22392aM221512b;
        this.f19843A2 = c22392aM221512b.throttleLast(1000L, TimeUnit.MILLISECONDS).onBackpressureLatest().observeOn(Schedulers.m221493io()).map(new w9j() { // from class: l.ab8
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f68633a.m32607Ck((Double) obj);
            }
        }).filter(new w9j() { // from class: l.lb8
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((ConversationCounter) obj) != null);
            }
        }).map(new w9j() { // from class: l.wb8
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return C4740g.m32358ga((ConversationCounter) obj);
            }
        }).onBackpressureLatest().compose(mkd0.m154951C()).subscribe(mkd0.m154955G(new e30() { // from class: l.up7
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f177577a.m32620Dk((ConversationCounter) obj);
            }
        }));
        this.f19846B2 = C22392a.m221513c(new LinkedHashMap());
        this.f19849C2 = C22392a.m221513c(new LinkedHashMap());
        this.f19852D2 = -1L;
        this.f19855E2 = new LruCache<>(100);
        this.f19858F2 = new HashSet<>();
        this.f19861G2 = new HashSet<>();
        this.f19864H2 = C22392a.m221513c(roj0Var);
        this.f19867I2 = C22392a.m221513c(0);
        this.f19870J2 = C22392a.m221513c(new ArrayList());
        this.f19873K2 = C22392a.m221513c(new ArrayList());
        this.f19876L2 = C22393b.m221521b();
        this.f19879M2 = new d();
        this.f19882N2 = new HashMap();
        this.f19885O2 = C22392a.m221513c(roj0Var);
        this.f19888P2 = false;
        this.f19891Q2 = false;
        if (this.f19985w0.get().booleanValue()) {
            return;
        }
        this.f19985w0.put(bool2);
        this.f19988x0 = false;
    }

    /* JADX INFO: renamed from: A3 */
    public static /* synthetic */ stc0 m31992A3(String str) {
        stc0.C20027a c20027aAuth = C4728a.f19494P.auth();
        if (TextUtils.isEmpty(str)) {
            str = C4728a.m31355u();
        }
        return c20027aAuth.m185898q(str).m185887f().m185883b();
    }

    /* JADX INFO: renamed from: B7 */
    public static /* synthetic */ void m32007B7(String str) {
        Conversation conversationQuery = CoreModule.f17553k.f91950m.query(str);
        if (conversationQuery == null) {
            return;
        }
        List<Message> listQuery = CoreModule.f17553k.f91940c.query(Filter.AND(Message.CID.mo60175EQ(str), Message.MESSAGETYPE.m60176EQ(MessageType.ai_chat_analysis_guide)), Message.CREATEDTIME.ASC, 0);
        if (!vwb.m200296J(listQuery)) {
            Iterator<Message> it = listQuery.iterator();
            while (it.hasNext()) {
                CoreModule.f17553k.f91940c.delete(it.next().f56011id);
            }
        }
        CoreModule.f17553k.f91950m.upsert(conversationQuery);
    }

    /* JADX INFO: renamed from: Bb */
    public static /* synthetic */ void m32011Bb(roj0 roj0Var) {
    }

    /* JADX INFO: renamed from: Bd */
    public static /* synthetic */ void m32013Bd(Throwable th) {
    }

    /* JADX INFO: renamed from: C4 */
    public static /* synthetic */ Boolean m32015C4(Boolean bool) {
        if (bool.booleanValue()) {
            return Boolean.TRUE;
        }
        e51.m114742G(new Runnable() { // from class: l.iq7
            @Override // java.lang.Runnable
            public final void run() {
                lsi0.m151595y("该用户未开启分享功能");
            }
        });
        return Boolean.FALSE;
    }

    /* JADX INFO: renamed from: Cb */
    public static /* synthetic */ void m32022Cb(Message message, boolean z) {
        long j = message._id;
        if (j != 0) {
            Message messageQuery = CoreModule.f17553k.f91940c.query(j);
            messageQuery.localCreatedSession = -App.f15373i.get().intValue();
            messageQuery.localNotificationStatus = NotificationStatus.get("pending");
            if (z) {
                messageQuery.localFailType = 4;
            } else {
                messageQuery.localFailType = 3;
            }
            CoreModule.f17553k.f91940c.updateBy_id(messageQuery);
        }
    }

    /* JADX INFO: renamed from: D6 */
    public static /* synthetic */ void m32028D6(Throwable th) {
    }

    /* JADX INFO: renamed from: Dd */
    public static /* synthetic */ void m32035Dd(Message message) {
        long j = message._id;
        if (j != 0) {
            CoreModule.f17553k.f91940c.delete(j);
        }
    }

    /* JADX INFO: renamed from: E3 */
    public static /* synthetic */ void m32036E3(String str) {
        DbLinks dbLinks = new DbLinks();
        dbLinks.f56011id = str;
        dbLinks.links = new Links();
        CoreModule.f17553k.f91941d.upsert(dbLinks);
    }

    /* JADX INFO: renamed from: E5 */
    public static /* synthetic */ Boolean m32038E5(Message message) {
        int i = message.localFailType;
        return Boolean.valueOf((i == 3 || i == 4) ? false : true);
    }

    /* JADX INFO: renamed from: E6 */
    public static /* synthetic */ stc0 m32039E6(Message message, String str, Message message2) {
        String strM31213J0;
        stc0.C20027a c20027aDebug_noAuth = C4728a.f19494P.debug_noAuth();
        if (message.moment != null) {
            strM31213J0 = C4728a.m31366w2("/" + CoreModule.m29931H().userId() + "/moments/" + message.moment + "/messages?user_id=" + str);
        } else {
            strM31213J0 = C4728a.m31213J0("/conversations/" + CoreModule.m29931H().userId() + "/messages?with=moments,questions&user_id=" + str);
        }
        return c20027aDebug_noAuth.m185898q(strM31213J0).m185893l(utc0.create(Network.JSON, message2.toJson())).m185883b();
    }

    /* JADX INFO: renamed from: E7 */
    public static /* synthetic */ Boolean m32040E7(Conversation conversation) {
        if (ura.m195053e().m195057d().mo33676E()) {
            return Boolean.valueOf(TEnum.equals(conversation.status, "default") && !ura.m195053e().m195057d().mo33727Nd(conversation));
        }
        return Boolean.valueOf(TEnum.equals(conversation.status, "default"));
    }

    /* JADX INFO: renamed from: Ec */
    public static /* synthetic */ Sticker m32045Ec(List list, String str, SogouGifEnvelope sogouGifEnvelope) throws Throwable {
        String strM179382z = vwb.m200296J(list) ? "" : rhi.m179382z(((Media) list.get(0)).url);
        if (sogouGifEnvelope.data.media.isEmpty()) {
            rhi.m179369m(strM179382z);
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < sogouGifEnvelope.data.media.size(); i++) {
            SogouGifPicture sogouGifPicture = sogouGifEnvelope.data.media.get(i);
            Picture pictureNew_ = Picture.new_();
            pictureNew_.name = sogouGifPicture.name;
            pictureNew_.url = sogouGifPicture.url;
            pictureNew_.mediaType = ((Media) list.get(i)).mediaType;
            arrayList.add(pictureNew_);
        }
        Sticker stickerNew_ = Sticker.new_();
        stickerNew_.name = str;
        stickerNew_.source = StickerSource.get("sogou");
        stickerNew_.pictures = arrayList;
        String strM164283d = ogw.m164283d(new File(strM179382z));
        if (TextUtils.isEmpty(strM164283d)) {
            stickerNew_.hash = "";
        } else {
            stickerNew_.hash = strM164283d;
        }
        rhi.m179369m(strM179382z);
        return stickerNew_;
    }

    /* JADX INFO: renamed from: F8 */
    public static /* synthetic */ j760 m32052F8(List list, List list2, Conversation conversation) {
        Message message;
        if (vwb.m200296J(list) && vwb.m200296J(list2)) {
            message = null;
        } else if (vwb.m200296J(list)) {
            message = (Message) list2.get(0);
        } else if (vwb.m200296J(list2)) {
            message = (Message) list.get(0);
        } else {
            message = (Message) list.get(0);
            Message message2 = (Message) list2.get(0);
            if (message.createdTime <= message2.createdTime) {
                message = message2;
            }
        }
        return j760.m140076a(Integer.valueOf((conversation.f20374mm * 100) / 10), message);
    }

    /* JADX INFO: renamed from: F9 */
    public static /* synthetic */ void m32053F9() {
        CoreModule.f17553k.f91950m.delete(Conversation.CONVTYPE.mo60175EQ(ura.m195053e().m195057d().mo33772W7()));
        C4736e c4736e = CoreModule.f17545c.f19645g0;
        C4736e.f19768F0.put(Boolean.FALSE);
    }

    /* JADX INFO: renamed from: G4 */
    public static /* synthetic */ void m32059G4(Throwable th) {
    }

    /* JADX INFO: renamed from: G6 */
    public static /* synthetic */ void m32061G6(Throwable th) {
    }

    /* JADX INFO: renamed from: G7 */
    public static /* synthetic */ void m32062G7(String str, d30 d30Var) {
        CoreModule.f17553k.f91940c.delete(str);
        if (NullChecker.m81303a(d30Var)) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: G9 */
    public static /* synthetic */ stc0 m32064G9(List list) {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONArray jSONArray = new JSONArray();
            if (NullChecker.m81303a(list)) {
                if (list.size() > 1) {
                    Conversation conversation = (Conversation) list.get(0);
                    Conversation conversation2 = (Conversation) list.get(1);
                    if (NullChecker.m81303a(conversation) && NullChecker.m81303a(conversation2) && !TextUtils.isEmpty(conversation.otherUser) && !TextUtils.isEmpty(conversation2.otherUser)) {
                        jSONArray.put(0, conversation.otherUser);
                        jSONArray.put(1, conversation2.otherUser);
                    }
                } else if (list.size() == 1) {
                    Conversation conversation3 = (Conversation) list.get(0);
                    if (NullChecker.m81303a(conversation3) && !TextUtils.isEmpty(conversation3.otherUser)) {
                        jSONArray.put(0, conversation3.otherUser);
                    }
                }
            }
            jSONObject.put("userIDs", jSONArray);
        } catch (Exception unused) {
        }
        return C4728a.f19494P.auth().m185898q(C4728a.m31268Y("/persuade/users")).m185893l(utc0.create(Network.JSON, jSONObject.toString())).m185883b();
    }

    /* JADX INFO: renamed from: H9 */
    public static /* synthetic */ OnlineLiveChatPair m32075H9(Throwable th) {
        return null;
    }

    /* JADX INFO: renamed from: Ha */
    public static /* synthetic */ j760 m32076Ha(List list, List list2, Integer num) {
        return new j760(Integer.valueOf(Math.min(num.intValue(), 100)), Boolean.valueOf((list.size() == 0 && list2.size() == 0) ? false : true));
    }

    /* JADX INFO: renamed from: I5 */
    public static /* synthetic */ List m32082I5(LogoutRecommendEnvelope logoutRecommendEnvelope) {
        List<LogoutRecommendUser> list = logoutRecommendEnvelope.data.users;
        if (vwb.m200296J(list)) {
            return null;
        }
        return list;
    }

    /* JADX INFO: renamed from: I8 */
    public static /* synthetic */ void m32085I8(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Conversation conversation = (Conversation) it.next();
            if (conversation.additional == null) {
                conversation.additional = ConversationAdditional.new_();
            }
            conversation.additional.newMatch = ExposureNewMatch.new_();
            conversation.additional.newMatch.labelExposureTime = mqi0.m155944o();
            CoreModule.f17553k.f91950m.upsert(conversation);
        }
    }

    /* JADX INFO: renamed from: I9 */
    public static /* synthetic */ Boolean m32086I9(CipherId cipherId) {
        if (NullChecker.m81303a(cipherId) && !TextUtils.isEmpty(cipherId.userId)) {
            return Boolean.TRUE;
        }
        e51.m114742G(new Runnable() { // from class: l.ib8
            @Override // java.lang.Runnable
            public final void run() {
                lsi0.m151595y("分享失败，稍后重试");
            }
        });
        return Boolean.FALSE;
    }

    /* JADX INFO: renamed from: Ia */
    public static /* synthetic */ C22306c m32087Ia(String str) {
        final JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("msgType", str);
        } catch (Exception unused) {
        }
        return ia20.m135118b(new v9j() { // from class: l.t88
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4728a.f19494P.auth().m185898q(C4728a.m31200G("/picture-verify/righted/reject")).m185893l(utc0.create(Network.JSON, jSONObject.toString())).m185883b();
            }
        }, 0);
    }

    /* JADX INFO: renamed from: J7 */
    public static /* synthetic */ stc0 m32095J7(boolean z, String str) {
        String string;
        try {
            JSONObject jSONObject = new JSONObject();
            if (z) {
                jSONObject.put(NotificationCompat.CATEGORY_STATUS, ConversationStatus.invisible);
            } else {
                jSONObject.put(NotificationCompat.CATEGORY_STATUS, "hidden");
            }
            string = jSONObject.toString();
        } catch (JSONException unused) {
            string = WeJson.EMPTY_MAP;
        }
        return C4728a.f19494P.auth().m185898q(C4728a.m31254U0("/conversations/" + str)).m185892k(utc0.create(Network.JSON, string)).m185883b();
    }

    /* JADX INFO: renamed from: J8 */
    public static /* synthetic */ void m32096J8(Throwable th) {
        if (th.getMessage().contains("share limit run out")) {
            lsi0.m151595y("您今日已达到分享用户次数的上线啦~明天再来吧");
        } else {
            lsi0.m151595y("分享失败");
        }
    }

    /* JADX INFO: renamed from: Jd */
    public static /* synthetic */ void m32101Jd(ConversationPatchRecord conversationPatchRecord, Conversation conversation) {
        CoreModule.f17553k.f91949l.upsert(conversationPatchRecord);
        conversation.read = Boolean.TRUE;
        conversation.unreadMessages = 0;
        CoreModule.f17553k.f91950m.upsert(conversation);
    }

    /* JADX INFO: renamed from: K7 */
    public static /* synthetic */ List m32106K7(List list, Message message, List list2) {
        if (!vwb.m200296J(list)) {
            for (int i = 0; i < list.size(); i++) {
                Media media = (Media) list.get(i);
                if (media instanceof Audio) {
                    rhi.m179369m(rhi.m179382z(media.url));
                } else if (media instanceof Video) {
                    k9j.m145075G(k9j.f122027c, message.f56011id);
                }
            }
        }
        return list2;
    }

    /* JADX INFO: renamed from: K8 */
    public static /* synthetic */ void m32107K8(List list) {
        if (vwb.m200296J(list)) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Message messageQuery = CoreModule.f17553k.f91940c.query((String) it.next());
            if (TEnum.equals(messageQuery.messageType, MessageType.common_tip) && NullChecker.m81303a(messageQuery.extData) && TextUtils.equals(messageQuery.extData.extra, "pat")) {
                messageQuery.extData.extra2 = "pat_grey";
                CoreModule.f17553k.f91940c.upsert(messageQuery);
            }
        }
    }

    /* JADX INFO: renamed from: Ka */
    public static /* synthetic */ JSONArray m32109Ka(List list) {
        try {
            JSONArray jSONArray = new JSONArray();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Message message = (Message) it.next();
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("id", message.f56011id);
                } catch (JSONException e) {
                    CrashHelper.m81296c(e);
                }
                jSONArray.put(jSONObject);
            }
            return jSONArray;
        } catch (Exception e2) {
            CrashHelper.m81296c(e2);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0075  */
    /* JADX INFO: renamed from: Kd */
    public static /* synthetic */ void m32112Kd(Message message, String str, String str2, long j, Envelope envelope) {
        String str3;
        if (!NullChecker.m81303a(envelope)) {
            str3 = str;
        } else {
            if (vwb.m200296J(((CoreData) envelope.getModuleData(CoreData.class)).messages)) {
                CrashHelper.m81302i(new Exception("return null messages"), "core_raw_message_post", CrashHelper.ReportLevel.p5, 100);
                return;
            }
            Message message2 = ((CoreData) envelope.getModuleData(CoreData.class)).messages.get(0);
            message2.fromConvType = message.fromConvType;
            if (message.moment == null || TEnum.equals(message.messageType, "moment_chat")) {
                str3 = str;
                pxz.m171970g(message2, str2, "success", str3, 1, SystemClock.elapsedRealtime() - j);
            } else if (User.isMatched(CoreModule.f17545c.f19639e0.m169415M7(str))) {
                str3 = str;
                pxz.m171970g(message2, str2, "success", str3, 1, SystemClock.elapsedRealtime() - j);
            } else {
                str3 = str;
            }
        }
        if (message.moment != null || User.isTeamAccount(str3)) {
            return;
        }
        qib0.m174815e1("message_sent", new Object[0]);
    }

    /* JADX INFO: renamed from: L7 */
    public static /* synthetic */ void m32117L7(ConversationPatchRecord conversationPatchRecord, String str) {
        int i = conversationPatchRecord.retryCount + 1;
        conversationPatchRecord.retryCount = i;
        if (i >= 3) {
            CoreModule.f17553k.f91949l.delete(str);
        } else {
            CoreModule.f17553k.f91949l.updateBy_id(conversationPatchRecord);
        }
    }

    /* JADX INFO: renamed from: L9 */
    public static /* synthetic */ void m32119L9(Throwable th) {
    }

    /* JADX INFO: renamed from: Ld */
    public static /* synthetic */ List m32123Ld(String str, Envelope envelope) {
        ChatProfile next;
        if (!vwb.m200296J(((CoreData) envelope.getModuleData(CoreData.class)).chatProfiles)) {
            Iterator<ChatProfile> it = ((CoreData) envelope.getModuleData(CoreData.class)).chatProfiles.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!TextUtils.equals(next.userId, str));
        } else {
            next = null;
            break;
        }
        return NullChecker.m81303a(next) ? next.iceBreakingQuestions : Collections.EMPTY_LIST;
    }

    /* JADX INFO: renamed from: M4 */
    public static /* synthetic */ Double m32125M4(Double d2, Envelope envelope) {
        return d2;
    }

    /* JADX INFO: renamed from: M7 */
    public static /* synthetic */ stc0 m32128M7(String str, boolean z) {
        stc0.C20027a c20027aM185898q = C4728a.f19494P.auth().m185898q(C4728a.m31200G("/love_letter/reply"));
        hyx hyxVar = Network.JSON;
        StringBuilder sb = new StringBuilder("{\"id\":\"");
        sb.append(str);
        sb.append("\", \"state\":\"");
        sb.append(z ? "opened" : LoveLetterMessageState.replied);
        sb.append("\"}");
        return c20027aM185898q.m185892k(utc0.create(hyxVar, sb.toString())).m185883b();
    }

    /* JADX INFO: renamed from: Mc */
    public static /* synthetic */ ConversationBatchPatchIds m32133Mc() {
        List<Conversation> listM32962fq = CoreModule.f17545c.f19642f0.m32962fq();
        ArrayList arrayList = new ArrayList();
        Iterator<Conversation> it = listM32962fq.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().f56011id);
        }
        ConversationBatchPatchIds conversationBatchPatchIdsNew_ = ConversationBatchPatchIds.new_();
        conversationBatchPatchIdsNew_.ids = arrayList;
        return conversationBatchPatchIdsNew_;
    }

    /* JADX INFO: renamed from: N4 */
    public static /* synthetic */ stc0 m32136N4(String str, String str2, boolean z) {
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
        return C4728a.f19494P.auth().m185898q(C4728a.m31268Y("/outside/userid")).m185893l(utc0.create(Network.JSON, jSONObject.toString())).m185883b();
    }

    /* JADX INFO: renamed from: N5 */
    public static /* synthetic */ Double m32137N5(Double d2, Message message) {
        return d2;
    }

    /* JADX INFO: renamed from: N6 */
    public static /* synthetic */ Message m32138N6(List list) {
        if (vwb.m200296J(list)) {
            return null;
        }
        return (Message) list.get(0);
    }

    /* JADX INFO: renamed from: Na */
    public static /* synthetic */ void m32142Na(String str, double d2) {
        Conversation conversationQuery = CoreModule.f17553k.f91950m.query(str);
        if (NullChecker.m81303a(conversationQuery)) {
            conversationQuery.localBotherCodeTime = d2;
            CoreModule.f17553k.f91950m.upsert(conversationQuery);
        }
    }

    /* JADX INFO: renamed from: Nc */
    public static /* synthetic */ void m32144Nc(Message message, boolean z) {
        Message messageMo223809clone = message.mo223809clone();
        HarassAlertInfo harassAlertInfoNew_ = messageMo223809clone.additionalData.harassAlertInfo;
        if (harassAlertInfoNew_ == null) {
            harassAlertInfoNew_ = HarassAlertInfo.new_();
        }
        harassAlertInfoNew_.status = z ? "reported" : "ignored";
        CoreModule.f17553k.f91940c.upsert(messageMo223809clone);
    }

    /* JADX INFO: renamed from: O7 */
    public static /* synthetic */ j760 m32150O7(String str) {
        List<T> listM165617j = CoreModule.f17553k.f91940c.m206080l0(str).m165617j();
        Message message = (listM165617j == 0 || listM165617j.isEmpty()) ? null : (Message) listM165617j.get(0);
        return vwb.m200311Y(listM165617j == 0 ? null : (Message) vwb.m200346r(listM165617j, new w9j() { // from class: l.h58
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(TEnum.equals(((Message) obj).status(), "normal"));
            }
        }), message != null ? Double.valueOf(message.createdTime) : null);
    }

    /* JADX INFO: renamed from: Oa */
    public static /* synthetic */ void m32153Oa(String str) {
        Message messageQuery = CoreModule.f17553k.f91940c.query(str);
        if (NullChecker.m81303a(messageQuery)) {
            CoreModule.f17553k.f91940c.delete(messageQuery._id);
        }
    }

    /* JADX INFO: renamed from: Pb */
    public static /* synthetic */ j760 m32165Pb(Boolean bool) {
        String strDateToApiTimeString;
        jl6 jl6Var = CoreModule.f17553k.f91950m;
        TEnumColumn<Conversation, ConversationStatus> tEnumColumn = Conversation.STATUS;
        int iCount = jl6Var.count(Filter.m81261OR(tEnumColumn.m60176EQ("default"), tEnumColumn.m60176EQ("blocked")), -1);
        DbLinks dbLinks = (DbLinks) qib0.f154722k0.f176630c.query(SchemeKey.conversations);
        if (NullChecker.m81303a(dbLinks)) {
            strDateToApiTimeString = Uri.parse(C4728a.m31372y0(dbLinks.links.previous)).getQueryParameter("since");
        } else {
            List<Conversation> listQuery = CoreModule.f17553k.f91950m.query(Filter.m81261OR(tEnumColumn.m60176EQ("default"), tEnumColumn.m60176EQ("blocked")), Conversation.UPDATEDTIME.DESC, 1);
            strDateToApiTimeString = !vwb.m200296J(listQuery) ? Converter.dateToApiTimeString(listQuery.get(0).updatedTime) : "";
        }
        final JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("total", iCount);
            jSONObject.put("statuses", new JSONArray(ConversationStatus.JSON_ADAPTER.ARRAY_ADAPTER().serialize(vwb.m200324f0(ConversationStatus.get("default"), ConversationStatus.get("blocked")))));
            jSONObject.put("latestUpdatedTime", strDateToApiTimeString);
        } catch (JSONException e) {
            CrashHelper.m81296c(e);
        }
        Envelope envelopeM212771c = ia20.m135117a(new v9j() { // from class: l.p18
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4728a.f19494P.auth().m185898q(C4728a.m31211I2("/counter-verifications")).m185893l(utc0.create(Network.JSON, jSONObject.toString())).m185883b();
            }
        }).toBlocking().m212771c(null);
        if (NullChecker.m81303a(envelopeM212771c)) {
            return j760.m140076a(((CoreData) envelopeM212771c.getModuleData(CoreData.class)).counterVerification, strDateToApiTimeString);
        }
        return null;
    }

    /* JADX INFO: renamed from: R4 */
    public static /* synthetic */ j760 m32180R4(List list, List list2, Conversation conversation) {
        Message message;
        if (vwb.m200296J(list) && vwb.m200296J(list2)) {
            message = null;
        } else if (vwb.m200296J(list)) {
            message = (Message) list2.get(list2.size() - 1);
        } else if (vwb.m200296J(list2)) {
            message = (Message) list.get(list.size() - 1);
        } else {
            message = (Message) list.get(list.size() - 1);
            Message message2 = (Message) list2.get(list2.size() - 1);
            if (message.createdTime <= message2.createdTime) {
                message = message2;
            }
        }
        return j760.m140076a(Integer.valueOf((conversation.f20374mm * 100) / 20), message);
    }

    /* JADX INFO: renamed from: R7 */
    public static /* synthetic */ j760 m32183R7(List list, List list2, Integer num) {
        return new j760(Integer.valueOf(Math.min((int) ((num.intValue() / 20.0f) * 100.0f), 100)), Boolean.valueOf((list.size() == 0 && list2.size() == 0) ? false : true));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x000e  */
    /* JADX INFO: renamed from: R9 */
    public static /* synthetic */ Boolean m32185R9(List list) {
        boolean z;
        if (!list.isEmpty()) {
            z = list.size() == 1;
        }
        return Boolean.valueOf(z);
    }

    /* JADX INFO: renamed from: Ro */
    public static C22306c<Envelope> m32190Ro(final String str, final Message message) {
        final Message messageMo223809clone = message.mo223809clone();
        if (messageMo223809clone.moment != null) {
            messageMo223809clone.moment = null;
            if (!CoreModule.m29934N().mo60340bt() || (!TEnum.equals(messageMo223809clone.messageType, "sticker") && !TEnum.equals(messageMo223809clone.messageType, "picture"))) {
                messageMo223809clone.messageType = null;
            }
        }
        final String strM171966c = pxz.m171966c();
        final long jElapsedRealtime = SystemClock.elapsedRealtime();
        return new la20((v9j<stc0>) new v9j() { // from class: l.ew7
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4740g.m32443o5(message, str, strM171966c, messageMo223809clone);
            }
        }, (message.moment == null || TEnum.equals(message.messageType, "moment_chat")) ? C4728a.f19490L | C4728a.f19491M : C4728a.f19491M).doOnNext(new e30() { // from class: l.pw7
            @Override // p149l.e30
            public final void call(Object obj) {
                C4740g.m32112Kd(message, str, strM171966c, jElapsedRealtime, (Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: S3 */
    public static /* synthetic */ void m32191S3(Envelope envelope) {
        DbLinks dbLinksNew_ = DbLinks.new_();
        dbLinksNew_.f56011id = "conversations_deleted";
        dbLinksNew_.links = envelope.pagination.links;
        qib0.f154722k0.f176630c.upsert(dbLinksNew_);
    }

    /* JADX INFO: renamed from: T6 */
    public static /* synthetic */ Conversation m32205T6(List list) {
        if (vwb.m200296J(list)) {
            return null;
        }
        return (Conversation) list.get(0);
    }

    /* JADX INFO: renamed from: U6 */
    public static /* synthetic */ stc0 m32216U6(String str) {
        String string;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(NotificationCompat.CATEGORY_STATUS, "hidden");
            string = jSONObject.toString();
        } catch (JSONException unused) {
            string = WeJson.EMPTY_MAP;
        }
        return C4728a.f19494P.auth().m185898q(C4728a.m31254U0("/conversations/" + str)).m185892k(utc0.create(Network.JSON, string)).m185883b();
    }

    /* JADX INFO: renamed from: V8 */
    public static /* synthetic */ void m32229V8() {
        CoreModule.f17553k.f91950m.delete(Conversation.CONVTYPE.mo60175EQ(ConversationType.feedinteraction));
        C4740g c4740g = CoreModule.f17545c.f19642f0;
        f19831T2.put(Boolean.FALSE);
    }

    /* JADX INFO: renamed from: W5 */
    public static /* synthetic */ JSONObject m32237W5(String str, List list, Message message) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("localId", str);
        jSONObject.put("toUserIds", new JSONArray((Collection) list));
        jSONObject.put("message", new JSONObject(message.toJson()));
        return jSONObject;
    }

    /* JADX INFO: renamed from: X4 */
    public static /* synthetic */ Message m32247X4(List list) {
        return (Message) list.get(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: X8 */
    public static /* synthetic */ List m32251X8(Message message, List list, xaj0 xaj0Var) {
        if (((Boolean) xaj0Var.f191751a).booleanValue()) {
            message.riskTags = (List) xaj0Var.f191752b;
        }
        message.localExtraInfo = TextUtils.isEmpty((CharSequence) xaj0Var.f191753c) ? "" : (String) xaj0Var.f191753c;
        return list;
    }

    /* JADX INFO: renamed from: Xb */
    public static /* synthetic */ void m32254Xb(String str, double d2) {
        Conversation conversationQuery = CoreModule.f17553k.f91950m.query("fake_conversation_profile_featured");
        if (TextUtils.isEmpty(str) && conversationQuery == null) {
            return;
        }
        long jM155944o = mqi0.m155944o();
        if (conversationQuery == null) {
            conversationQuery = Conversation.new_();
            conversationQuery.f56011id = "fake_conversation_profile_featured";
            conversationQuery.createdTime = jM155944o;
            conversationQuery.convType = "default";
            conversationQuery.otherUser = str;
            conversationQuery.localEverHasMessage = true;
        } else if (NullChecker.m81303a(str)) {
            conversationQuery.otherUser = str;
        }
        conversationQuery.latestTime = d2;
        CoreModule.f17545c.f19642f0.m33050mq(conversationQuery);
    }

    /* JADX INFO: renamed from: Y5 */
    public static /* synthetic */ void m32259Y5() {
        CoreModule.f17553k.f91950m.deleteAll();
        qib0.f154722k0.f176630c.delete(SchemeKey.conversations);
        CoreModule.f17553k.f91941d.deleteAll();
    }

    /* JADX INFO: renamed from: Y6 */
    public static /* synthetic */ void m32260Y6(String str) {
        Conversation conversationQuery = CoreModule.f17553k.f91950m.query(str);
        if (conversationQuery == null || !TextUtils.equals(conversationQuery.convType, ConversationType.intlSeeChatRequest)) {
            return;
        }
        CoreModule.f17553k.f91950m.delete(str);
    }

    /* JADX INFO: renamed from: Z7 */
    public static /* synthetic */ void m32272Z7(String str, double d2) {
        Conversation conversationQuery = CoreModule.f17553k.f91950m.query(str);
        if (NullChecker.m81303a(conversationQuery)) {
            conversationQuery.localBotherWxTime = d2;
            CoreModule.f17553k.f91950m.upsert(conversationQuery);
        }
    }

    /* JADX INFO: renamed from: Z8 */
    public static /* synthetic */ j760 m32273Z8(List list, List list2, Conversation conversation) {
        Message message;
        int i = conversation.quickChatProgress;
        int i2 = conversation.additional.quickChat.progress;
        if (i <= i2) {
            i = i2;
        }
        if (vwb.m200296J(list) && vwb.m200296J(list2)) {
            message = null;
        } else if (vwb.m200296J(list)) {
            message = (Message) list2.get(list2.size() - 1);
        } else if (vwb.m200296J(list2)) {
            message = (Message) list.get(list.size() - 1);
        } else {
            message = (Message) list.get(list.size() - 1);
            Message message2 = (Message) list2.get(list2.size() - 1);
            if (message.createdTime <= message2.createdTime) {
                message = message2;
            }
        }
        return j760.m140076a(Integer.valueOf(i), message);
    }

    /* JADX INFO: renamed from: Z9 */
    public static /* synthetic */ void m32274Z9(User user, Message message) {
        if (ura.m195053e().m195057d().mo33808c() && user.onlineMatch() && user.onlineMatchLocked()) {
            message.localFailType = 2;
        }
    }

    /* JADX INFO: renamed from: Zb */
    public static /* synthetic */ void m32276Zb(List list, final User user) {
        FriendInfo friendInfo = (FriendInfo) vwb.m200346r(list, new w9j() { // from class: l.a98
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((FriendInfo) obj).userId, user.f56011id));
            }
        });
        if (NullChecker.m81303a(user) && NullChecker.m81303a(friendInfo)) {
            Location location = user.location;
            location.updatedTime = Math.max(friendInfo.lastActivity, location.updatedTime);
        }
    }

    /* JADX INFO: renamed from: a7 */
    public static /* synthetic */ C22306c m32283a7(final Message message, final List list) {
        return (!vwb.m200296J(list) && (list.get(0) instanceof Picture) && qib0.f154703R.m94727c()) ? qib0.f154703R.m94726b(Uri.parse(((Media) list.get(0)).url).getPath()).map(new w9j() { // from class: l.ow7
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return C4740g.m32251X8(message, list, (xaj0) obj);
            }
        }) : C22306c.just(list);
    }

    /* JADX INFO: renamed from: ae */
    public static /* synthetic */ stc0 m32290ae(String str, String str2, String str3, String str4) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("feedback_id", str);
            jSONObject.put("feedback_category", str2);
            jSONObject.put(Answer.TYPE, str3);
            jSONObject.put(Constants.MessagePayloadKeys.MSGID_SERVER, str4);
        } catch (JSONException unused) {
        }
        return C4728a.f19494P.auth().m185898q(C4728a.m31200G("/restapi/feedback/satisfaction")).m185893l(utc0.create(Network.JSON, jSONObject.toString())).m185883b();
    }

    /* JADX INFO: renamed from: ba */
    public static /* synthetic */ stc0 m32298ba(boolean z, Message message, String str) {
        String string;
        try {
            JSONObject jSONObject = new JSONObject();
            if (z) {
                jSONObject.put(NotificationCompat.CATEGORY_STATUS, "removed");
            } else {
                jSONObject.put(NotificationCompat.CATEGORY_STATUS, "hidden");
            }
            if (NullChecker.m81303a(message)) {
                jSONObject.put("clearedUntil", message.f56011id);
            }
            string = jSONObject.toString();
        } catch (JSONException unused) {
            string = WeJson.EMPTY_MAP;
        }
        return C4728a.f19494P.auth().m185898q(C4728a.m31254U0("/conversations/" + str)).m185892k(utc0.create(Network.JSON, string)).m185883b();
    }

    /* JADX INFO: renamed from: c4 */
    public static /* synthetic */ DbLinks m32304c4() {
        return (DbLinks) qib0.f154722k0.f176630c.query(SchemeKey.conversations);
    }

    /* JADX INFO: renamed from: c9 */
    public static /* synthetic */ roj0 m32309c9(Set set, Set set2, Throwable th) {
        set.removeAll(set2);
        return null;
    }

    /* JADX INFO: renamed from: cd */
    public static /* synthetic */ void m32313cd(Throwable th) {
    }

    /* JADX INFO: renamed from: e4 */
    public static /* synthetic */ void m32328e4(Conversation conversation, boolean z) {
        if (!TextUtils.isEmpty(conversation.localExtraInfo) || z) {
            try {
                JSONObject jSONObject = new JSONObject(!TextUtils.isEmpty(conversation.localExtraInfo) ? conversation.localExtraInfo : WeJson.EMPTY_MAP);
                jSONObject.put("keep_message_history", z);
                conversation.localExtraInfo = jSONObject.toString();
                CoreModule.f17553k.f91950m.updateBy_id(conversation);
            } catch (JSONException unused) {
            }
        }
    }

    /* JADX INFO: renamed from: e6 */
    public static /* synthetic */ void m32330e6(String str, double d2) {
        Conversation conversationQuery = CoreModule.f17553k.f91950m.query(str);
        if (NullChecker.m81303a(conversationQuery)) {
            conversationQuery.localBotheringTime = d2;
            CoreModule.f17553k.f91950m.upsert(conversationQuery);
        }
    }

    /* JADX INFO: renamed from: f9 */
    public static /* synthetic */ void m32345f9(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            CoreModule.f17553k.f91940c.delete(((Message) it.next()).f56011id);
        }
    }

    /* JADX INFO: renamed from: g6 */
    public static /* synthetic */ void m32354g6(Message message, boolean z) {
        long j = message._id;
        if (j != 0) {
            Message messageQuery = CoreModule.f17553k.f91940c.query(j);
            messageQuery.localCreatedSession = -App.f15373i.get().intValue();
            messageQuery.localNotificationStatus = NotificationStatus.get("pending");
            if (!z) {
                messageQuery.localExtraInfo = "ms_vr_ct_tg";
            }
            CoreModule.f17553k.f91940c.updateBy_id(messageQuery);
        }
    }

    /* JADX INFO: renamed from: ga */
    public static /* synthetic */ ConversationCounter m32358ga(ConversationCounter conversationCounter) {
        return conversationCounter;
    }

    /* JADX INFO: renamed from: gb */
    public static /* synthetic */ void m32359gb(Throwable th) {
    }

    /* JADX INFO: renamed from: ge */
    public static /* synthetic */ Boolean m32362ge(String str) {
        List<T> listM165617j = CoreModule.f17553k.f91940c.m206065W(str).m165617j();
        for (int i = 0; i < listM165617j.size(); i++) {
            Message message = (Message) listM165617j.get(i);
            if (NullChecker.m81303a(message) && !message.f56011id.startsWith("fake_id_")) {
                return Boolean.TRUE;
            }
        }
        return Boolean.FALSE;
    }

    /* JADX INFO: renamed from: hc */
    public static /* synthetic */ void m32372hc(Message message, int i, e30 e30Var) {
        long j = message._id;
        if (j != 0) {
            Message messageQuery = CoreModule.f17553k.f91940c.query(j);
            if (NullChecker.m81303a(messageQuery)) {
                messageQuery.localCreatedSession = -App.f15373i.get().intValue();
                messageQuery.localNotificationStatus = NotificationStatus.get("pending");
                messageQuery.localFailType = i;
                if (NullChecker.m81303a(e30Var)) {
                    e30Var.call(messageQuery);
                }
                CoreModule.f17553k.f91940c.updateBy_id(messageQuery);
            }
        }
    }

    /* JADX INFO: renamed from: i3 */
    public static /* synthetic */ Surveys m32375i3(Envelope envelope) {
        if (envelope == null || envelope.data == null || ((CoreData) envelope.getModuleData(CoreData.class)).surveys == null || ((CoreData) envelope.getModuleData(CoreData.class)).surveys.isEmpty()) {
            return null;
        }
        return ((CoreData) envelope.getModuleData(CoreData.class)).surveys.get(0);
    }

    /* JADX INFO: renamed from: i6 */
    public static /* synthetic */ ConversationBatchPatchIds m32378i6() {
        List<Conversation> listM33060nn = CoreModule.f17545c.f19642f0.m33060nn();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < listM33060nn.size() && arrayList.size() < 500; i++) {
            Conversation conversation = listM33060nn.get(i);
            if (conversation.unreadMessages > 0) {
                arrayList.add(conversation.f56011id);
            }
        }
        ConversationBatchPatchIds conversationBatchPatchIdsNew_ = ConversationBatchPatchIds.new_();
        conversationBatchPatchIdsNew_.ids = arrayList;
        return conversationBatchPatchIdsNew_;
    }

    /* JADX INFO: renamed from: id */
    public static /* synthetic */ void m32385id(final String str) {
        if (((DbLinks) CoreModule.f17553k.f91941d.query(str)) == null) {
            f8c.m119878o().m119881B(new d30() { // from class: l.da8
                @Override // p149l.d30
                public final void call() {
                    C4740g.m32036E3(str);
                }
            });
        }
    }

    /* JADX INFO: renamed from: j6 */
    public static /* synthetic */ JSONObject m32389j6(List list) {
        try {
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Message message = (Message) it.next();
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put("id", message.f56011id);
                    jSONObject2.put(NotificationCompat.CATEGORY_STATUS, "deleted");
                } catch (JSONException e) {
                    CrashHelper.m81296c(e);
                    e.printStackTrace();
                }
                jSONArray.put(jSONObject2);
            }
            jSONObject.put("messages", jSONArray);
            return jSONObject;
        } catch (Exception e2) {
            CrashHelper.m81296c(e2);
            return null;
        }
    }

    /* JADX INFO: renamed from: jb */
    public static /* synthetic */ void m32394jb(Message message, AtomicBoolean atomicBoolean) {
        DbLinks dbLinksMo60301Oj;
        if (message._id != 0) {
            atomicBoolean.set(true);
            CoreModule.f17553k.f91940c.delete(message._id);
        }
        if (message.moment == null || (dbLinksMo60301Oj = CoreModule.m29934N().mo60301Oj(message.moment)) == null) {
            return;
        }
        dbLinksMo60301Oj.total--;
        CoreModule.m29934N().mo60350f6(dbLinksMo60301Oj);
    }

    /* JADX INFO: renamed from: k7 */
    public static /* synthetic */ void m32401k7(Throwable th) {
    }

    /* JADX INFO: renamed from: ka */
    public static /* synthetic */ List m32404ka(Envelope envelope) {
        return ((CoreData) envelope.getModuleData(CoreData.class)).liveLabels == null ? new ArrayList() : ((CoreData) envelope.getModuleData(CoreData.class)).liveLabels;
    }

    /* JADX INFO: renamed from: kc */
    public static /* synthetic */ void m32406kc(Throwable th) {
    }

    /* JADX INFO: renamed from: l4 */
    public static /* synthetic */ void m32409l4(Envelope envelope, List list) {
        List<ReadMessage> list2 = ((CoreData) envelope.getModuleData(CoreData.class)).readMessages;
        if (vwb.m200296J(list2)) {
            return;
        }
        for (ReadMessage readMessage : list2) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Message message = (Message) it.next();
                if (readMessage.f20487id.equals(message.f56011id)) {
                    message.read = true;
                    CoreModule.f17553k.f91940c.update(vwb.m200324f0(vwb.m200311Y(Message.READ, Boolean.TRUE)), Message.f20441ID.mo60175EQ(message.f56011id));
                }
            }
        }
    }

    /* JADX INFO: renamed from: l5 */
    public static /* synthetic */ void m32410l5(String str, double d2, int i) {
        Conversation conversationQuery = CoreModule.f17553k.f91950m.query(str);
        if (NullChecker.m81303a(conversationQuery)) {
            conversationQuery.localBotheringTime = d2;
            conversationQuery.localBotherStatus = i;
            CoreModule.f17553k.f91950m.upsert(conversationQuery);
        }
    }

    /* JADX INFO: renamed from: l7 */
    public static /* synthetic */ void m32412l7(Throwable th) {
    }

    /* JADX INFO: renamed from: m9 */
    public static /* synthetic */ void m32425m9(String str) {
        Message messageQuery = CoreModule.f17553k.f91940c.query(str);
        messageQuery.audio().audioRead = true;
        CoreModule.f17553k.f91940c.upsert(messageQuery);
    }

    /* JADX INFO: renamed from: mc */
    public static /* synthetic */ roj0 m32428mc(Envelope envelope) {
        CoreModule.f17545c.m31492w3(envelope, null);
        return roj0.f160388a;
    }

    /* JADX INFO: renamed from: md */
    public static /* synthetic */ void m32429md(Message message, String str, Envelope envelope) {
        JSONObject jSONObject;
        if (qib0.f154703R.m94727c() && !vwb.m200296J(message.media) && (message.media.get(0) instanceof Picture)) {
            try {
                jSONObject = TextUtils.isEmpty(message.localExtraInfo) ? new JSONObject(WeJson.EMPTY_MAP) : new JSONObject(message.localExtraInfo);
            } catch (Exception unused) {
                jSONObject = null;
            }
            zvf0.m220369B("e_abnormal_image", "", j760.m140076a("to_uid", str), j760.m140076a("abnormal_image_url", message.media.get(0).url), j760.m140076a("predict_info", jSONObject));
        }
    }

    /* JADX INFO: renamed from: n6 */
    public static /* synthetic */ Integer m32433n6(Conversation conversation) {
        int i = conversation.quickChatProgress;
        int i2 = conversation.additional.quickChat.progress;
        if (i <= i2) {
            i = i2;
        }
        return Integer.valueOf(i);
    }

    /* JADX INFO: renamed from: na */
    public static /* synthetic */ String m32437na(Message message, Envelope envelope) {
        if (envelope.meta.code != 0) {
            return "";
        }
        MessageFeedbackStatus messageFeedbackStatus = ((CoreData) envelope.getModuleData(CoreData.class)).msgData;
        CoreModule.f17545c.f19642f0.m32626Dq(messageFeedbackStatus, message);
        if (NullChecker.m81303a(messageFeedbackStatus)) {
            return messageFeedbackStatus.question.answer;
        }
        return null;
    }

    /* JADX INFO: renamed from: o3 */
    public static /* synthetic */ void m32441o3() {
        CoreModule.f17553k.f91950m.deleteAll();
        qib0.f154722k0.f176630c.delete(SchemeKey.conversations);
        CoreModule.f17553k.f91941d.deleteAll();
    }

    /* JADX INFO: renamed from: o5 */
    public static /* synthetic */ stc0 m32443o5(Message message, String str, String str2, Message message2) {
        if (message.moment == null || TEnum.equals(message.messageType, "moment_chat") || (TEnum.equals(message.messageType, "moment_comment") && NullChecker.m81303a(message.api_only_reference) && TEnum.equals(message.api_only_reference.action, "comment"))) {
            return C4728a.f19494P.auth().m185898q(C4728a.m31238Q0(str) + "&page_id=" + str2).m185893l(utc0.create(Network.JSON, message2.toJson())).m185883b();
        }
        stc0.C20027a c20027aAuth = C4728a.f19494P.auth();
        StringBuilder sb = new StringBuilder();
        sb.append(C4728a.m31258V0(str, message.moment, str2));
        sb.append("&source=");
        sb.append(message.getMomentShowFromType());
        sb.append(message.isFromKanKan ? "&page=kankan" : "");
        return c20027aAuth.m185898q(sb.toString()).m185893l(utc0.create(Network.JSON, message2.toJson())).m185883b();
    }

    /* JADX INFO: renamed from: o6 */
    public static /* synthetic */ Conversation m32444o6(boolean z, boolean z2) {
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
    public static /* synthetic */ void m32445o7(double d2) {
        Conversation conversationQuery = CoreModule.f17553k.f91950m.query("fake_conversation_surprise_gift_box");
        if (conversationQuery == null) {
            conversationQuery = Conversation.new_();
            conversationQuery.f56011id = "fake_conversation_surprise_gift_box";
            conversationQuery.createdTime = d2;
            conversationQuery.latestTime = d2;
            conversationQuery.convType = "default";
            conversationQuery.localEverHasMessage = true;
            conversationQuery.level = 10;
        } else {
            conversationQuery.latestTime = d2;
        }
        CoreModule.f17545c.f19642f0.m33050mq(conversationQuery);
    }

    /* JADX INFO: renamed from: p3 */
    public static /* synthetic */ void m32452p3(String str) {
        Conversation conversationQuery = CoreModule.f17553k.f91950m.query(str);
        if (conversationQuery == null) {
            return;
        }
        List<Message> listQuery = CoreModule.f17553k.f91940c.query(Filter.AND(Message.CID.mo60175EQ(str), Message.MESSAGETYPE.m60176EQ(MessageType.local_break_ice)), Message.CREATEDTIME.ASC, 0);
        if (!vwb.m200296J(listQuery)) {
            Iterator<Message> it = listQuery.iterator();
            while (it.hasNext()) {
                CoreModule.f17553k.f91940c.delete(it.next().f56011id);
            }
        }
        conversationQuery.hasLocalBreakIce = false;
        CoreModule.f17553k.f91950m.upsert(conversationQuery);
    }

    /* JADX INFO: renamed from: p6 */
    public static /* synthetic */ void m32455p6(boolean z, NotificationStatus notificationStatus, NotificationStatus notificationStatus2, boolean z2) {
        if (z) {
            CoreModule.f17553k.f91950m.m141995k1(notificationStatus, notificationStatus2);
        }
        if (z2) {
            CoreModule.f17553k.f91940c.m206093y0(notificationStatus, notificationStatus2);
        }
    }

    /* JADX INFO: renamed from: p7 */
    public static /* synthetic */ Boolean m32456p7(Envelope envelope) {
        return !vwb.m200296J(((CoreData) envelope.getModuleData(CoreData.class)).settingGroups) ? Boolean.valueOf(((CoreData) envelope.getModuleData(CoreData.class)).settingGroups.get(0).share.userShare) : Boolean.FALSE;
    }

    /* JADX INFO: renamed from: pa */
    public static /* synthetic */ JSONObject m32459pa(List list) {
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
            CrashHelper.m81296c(e);
            return null;
        }
    }

    /* JADX INFO: renamed from: pc */
    public static /* synthetic */ void m32461pc(String str) {
        Message messageQuery = CoreModule.f17553k.f91940c.query(str);
        if (NullChecker.m81303a(messageQuery) && NullChecker.m81303a(messageQuery.additionalData) && NullChecker.m81303a(messageQuery.additionalData.exchangePicture) && !TextUtils.equals(messageQuery.additionalData.exchangePicture.status, ExchangePicture.finished)) {
            MessageAdditionalData messageAdditionalDataMo223809clone = messageQuery.additionalData.mo223809clone();
            if (messageAdditionalDataMo223809clone.exchangePicture == null) {
                messageAdditionalDataMo223809clone.exchangePicture = ExchangePicture.new_();
            }
            messageAdditionalDataMo223809clone.exchangePicture.status = ExchangePicture.finished;
            messageQuery.additionalData = messageAdditionalDataMo223809clone;
            CoreModule.f17553k.f91940c.upsert(messageQuery);
        }
    }

    /* JADX INFO: renamed from: qc */
    public static /* synthetic */ void m32472qc(Conversation conversation, List list, Message message) {
        if (conversation.f56011id.equals(message.cid)) {
            list.add(message);
        }
    }

    /* JADX INFO: renamed from: r3 */
    public static /* synthetic */ void m32474r3() {
    }

    /* JADX INFO: renamed from: s8 */
    public static /* synthetic */ void m32490s8(Sticker sticker, Sticker sticker2, Message message) {
        CoreModule.f17553k.f91944g.delete(sticker.f56011id);
        CoreModule.f17553k.f91944g.insert(sticker2);
        CoreModule.f17553k.f91940c.updateBy_id(message);
    }

    /* JADX INFO: renamed from: ta */
    public static /* synthetic */ List m32503ta(Message message) {
        if (NullChecker.m81303a(message)) {
            return message.media;
        }
        return null;
    }

    /* JADX INFO: renamed from: u8 */
    public static /* synthetic */ void m32512u8(Throwable th) {
    }

    /* JADX INFO: renamed from: v3 */
    public static /* synthetic */ AudioText m32518v3(Envelope envelope) {
        List<AudioText> list = ((CoreData) envelope.getModuleData(CoreData.class)).audioTexts;
        if (vwb.m200296J(list)) {
            return null;
        }
        return list.get(0);
    }

    /* JADX INFO: renamed from: v5 */
    public static /* synthetic */ String m32520v5(String str) {
        DbLinks dbLinks = (DbLinks) CoreModule.f17553k.f91941d.queryCache(str);
        if (dbLinks == null || !NullChecker.m81303a(dbLinks.links)) {
            return null;
        }
        return dbLinks.links.previous;
    }

    /* JADX INFO: renamed from: v8 */
    public static /* synthetic */ C22306c m32523v8(w9j w9jVar, Message message) {
        return (C22306c) w9jVar.call(message);
    }

    /* JADX INFO: renamed from: vd */
    public static /* synthetic */ stc0 m32528vd(List list) {
        cm10.C16191a c16191aM107600f = new cm10.C16191a().m107600f(cm10.f81492j);
        if (!vwb.m200296J(list)) {
            for (int i = 0; i < list.size(); i++) {
                Media media = (Media) list.get(i);
                File file = new File(rhi.m179382z(media.url));
                c16191aM107600f.m107596b("sogou_gif_" + i, ogw.m164283d(file) + (TextUtils.equals(media.mediaType, "image/gif") ? ".gif" : TextUtils.equals(media.mediaType, "image/webp") ? ".webp" : ".jpeg"), utc0.create(hyx.m133628d(media.mediaType), file));
            }
        }
        return C4728a.f19494P.auth().m185898q(C4728a.m31363w("/upload/image")).m185893l(c16191aM107600f.m107599e()).m185883b();
    }

    /* JADX INFO: renamed from: w7 */
    public static /* synthetic */ j760 m32533w7(String str) {
        List<T> listM165617j = CoreModule.f17553k.f91940c.m206080l0(str).m165617j();
        Message message = (listM165617j == 0 || listM165617j.isEmpty()) ? null : (Message) listM165617j.get(0);
        return vwb.m200311Y(listM165617j == 0 ? null : (Message) vwb.m200346r(listM165617j, new w9j() { // from class: l.x98
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(TEnum.equals(((Message) obj).status(), "normal"));
            }
        }), message != null ? Double.valueOf(message.createdTime) : null);
    }

    /* JADX INFO: renamed from: wf */
    public static C22306c<roj0> m32540wf(final String str, final Message message) {
        final Message messageMo223809clone = message.mo223809clone();
        if (messageMo223809clone.moment != null) {
            messageMo223809clone.moment = null;
        }
        return new ka20(new v9j() { // from class: l.tb8
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4740g.m32039E6(message, str, messageMo223809clone);
            }
        }, Envelope.JSON_ADAPTER).map(new w9j() { // from class: l.ub8
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return C4740g.m32428mc((Envelope) obj);
            }
        }).compose(C4728a.m31252T2());
    }

    /* JADX INFO: renamed from: x3 */
    public static /* synthetic */ void m32541x3(Message message) {
        long j = message._id;
        if (j != 0) {
            Message messageQuery = CoreModule.f17553k.f91940c.query(j);
            messageQuery.localFailType = 0;
            CoreModule.f17553k.f91940c.updateBy_id(messageQuery);
        }
    }

    /* JADX INFO: renamed from: x4 */
    public static /* synthetic */ void m32542x4() {
        CoreModule.f17553k.f91950m.deleteAll();
        qib0.f154722k0.f176630c.delete(SchemeKey.conversations);
        CoreModule.f17553k.f91941d.deleteAll();
    }

    /* JADX INFO: renamed from: x7 */
    public static /* synthetic */ stc0 m32545x7(int i, String str) {
        String string;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(FirebaseAnalytics.Param.LEVEL, i);
            string = jSONObject.toString();
        } catch (JSONException unused) {
            string = WeJson.EMPTY_MAP;
        }
        return C4728a.f19494P.auth().m185898q(C4728a.m31254U0("/conversations/" + str)).m185892k(utc0.create(Network.JSON, string)).m185883b();
    }

    /* JADX INFO: renamed from: xd */
    public static /* synthetic */ stc0 m32551xd(String str, String str2, String str3, String str4, String str5) {
        String string;
        try {
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            if (!TextUtils.equals(str, str2)) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("receiver", CoreModule.m29931H().userId());
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
            string = WeJson.EMPTY_MAP;
        }
        return C4728a.f19494P.auth().m185898q(C4728a.m31213J0("/tickles")).m185893l(utc0.create(Network.JSON, string)).m185883b();
    }

    /* JADX INFO: renamed from: xf */
    public static C22306c<roj0> m32552xf(final Message message) {
        final Message message2 = new Message();
        message2.recalled = Boolean.TRUE;
        return new ka20(new v9j() { // from class: l.h48
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                Message message3 = message;
                return C4728a.f19494P.debug_noAuth().m185898q(C4728a.m31213J0("/conversations/" + CoreModule.m29931H().userId() + "/messages/" + message3.f56011id + "?method=patch&user_id=" + message3.cid)).m185893l(utc0.create(Network.JSON, message2.toJson())).m185883b();
            }
        }, Envelope.JSON_ADAPTER).compose(C4728a.m31252T2()).map(new w9j() { // from class: l.s48
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return roj0.f160388a;
            }
        });
    }

    /* JADX INFO: renamed from: z8 */
    public static /* synthetic */ Meta m32569z8(Envelope envelope) {
        if (envelope == null) {
            return null;
        }
        return envelope.meta;
    }

    /* JADX INFO: renamed from: Ae */
    public void m32575Ae() {
        m33073on().map(new fu7()).filter(new w9j() { // from class: l.gu7
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(!((Boolean) obj).booleanValue());
            }
        }).first().observeOn(Schedulers.m221493io()).map(new w9j() { // from class: l.hu7
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return C4740g.m32165Pb((Boolean) obj);
            }
        }).filter(new w9j() { // from class: l.iu7
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f114977a.m32788Rh((j760) obj);
            }
        }).subscribe(mkd0.m154956H(new e30() { // from class: l.ju7
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f119744a.m32799Sh((j760) obj);
            }
        }, new e30() { // from class: l.ku7
            @Override // p149l.e30
            public final void call(Object obj) {
                C4740g.m32512u8((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: Af */
    public void m32576Af() {
        e51.m114774y(new Runnable() { // from class: l.ax7
            @Override // java.lang.Runnable
            public final void run() {
                this.f72128a.m32954fi();
            }
        });
    }

    /* JADX INFO: renamed from: Ag */
    public double m32577Ag() {
        long timeInMillis;
        if (ura.m195053e().m195057d().mo33764Vb()) {
            timeInMillis = this.f19952l0.get().longValue();
        } else {
            long j = this.f19949k0;
            if (j >= 1) {
                return j;
            }
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(mqi0.m155944o());
            calendar.set(calendar.get(1), calendar.get(2), calendar.get(5), 0, 0, 0);
            timeInMillis = calendar.getTimeInMillis() - (((long) (ura.m195053e().m195057d().mo33788Ye() - 1)) * 86400000);
        }
        return timeInMillis;
    }

    /* JADX INFO: renamed from: Ah */
    public boolean m32578Ah(String str, String str2) {
        if (User.isTeamAccount(str2) || TextUtils.isEmpty(str)) {
            return false;
        }
        ArrayList arrayList = new ArrayList(Arrays.asList("微信", "v信", "wx", "wechat", "加v", "加徽", "加微", "加徵", "+v", "+微", "+徽", "+徵"));
        int i = 14;
        try {
            String strM79302F = RemoteConfig.m79298x().m79302F("wechat_delay_send_info");
            if (!TextUtils.isEmpty(strM79302F)) {
                arrayList.clear();
                JSONObject jSONObject = new JSONObject(strM79302F);
                i = jSONObject.getInt("mm");
                JSONArray jSONArray = jSONObject.getJSONArray("words");
                for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                    arrayList.add((String) jSONArray.get(i2));
                }
            }
        } catch (Exception unused) {
        }
        Conversation conversationM32856Xe = Looper.getMainLooper() == Looper.myLooper() ? m32856Xe(str2) : m32735Mo(str2);
        if (conversationM32856Xe != null && conversationM32856Xe.f20374mm <= i) {
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
    public final /* synthetic */ C22306c m32579Ai(final String str) {
        return ia20.m135121e(new v9j() { // from class: l.v28
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4728a.f19494P.auth().m185898q(C4728a.m31367x(str)).m185885d().m185883b();
            }
        }).map(new w9j() { // from class: l.w28
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f184096a.m33196yi((Envelope) obj);
            }
        }).observeOn(jo0.m142408a()).map(new w9j() { // from class: l.x28
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f189135a.m33209zi((roj0) obj);
            }
        });
    }

    /* JADX INFO: renamed from: Aj */
    public final /* synthetic */ roj0 m32580Aj(final String str, Boolean bool) {
        if (bool.booleanValue()) {
            e51.m114743H(CoreModule.f17544b, new Runnable() { // from class: l.p78
                @Override // java.lang.Runnable
                public final void run() {
                    this.f147482a.m33210zj(str);
                }
            }, 100L);
        }
        return roj0.f160388a;
    }

    /* JADX INFO: renamed from: Ak */
    public final /* synthetic */ q860 m32581Ak(List list, DbLinks dbLinks) {
        return m99390Z2(list, dbLinks);
    }

    /* JADX INFO: renamed from: Al */
    public final /* synthetic */ C22306c m32582Al(final double d2) {
        return C22306c.fromCallable(new Callable() { // from class: l.p88
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f147570a.m33212zl(d2);
            }
        }).flatMap(new w9j() { // from class: l.q88
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return new la20(new v9j() { // from class: l.n98
                    @Override // p149l.v9j, java.util.concurrent.Callable
                    public final Object call() {
                        return C4728a.f19494P.auth().m185898q(ura.m195053e().m195057d().mo33676E() ? C4728a.m31254U0("/conversation-counters") : C4728a.m31213J0("/conversation-counters")).m185894m(utc0.create(Network.JSON, conversationCounter.toJson())).m185883b();
                    }
                }).map(new w9j() { // from class: l.o98
                    @Override // p149l.w9j
                    public final Object call(Object obj2) {
                        return roj0.f160388a;
                    }
                });
            }
        }).compose(mkd0.m154951C());
    }

    /* JADX INFO: renamed from: Am */
    public final /* synthetic */ void m32583Am(final double d2) {
        this.f72126Q.f19609U.m109085a(new d30() { // from class: l.bv7
            @Override // p149l.d30
            public final void call() {
                C4740g.m32445o7(d2);
            }
        });
    }

    /* JADX INFO: renamed from: An */
    public C22306c<roj0> m32584An(final String str) {
        return this.f72126Q.now(C22306c.fromCallable(new Callable() { // from class: l.at7
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f71587a.m32801Sj(str);
            }
        }).compose(C4728a.m31252T2()));
    }

    /* JADX INFO: renamed from: Ao */
    public C22306c<roj0> m32585Ao(final String str, final List<Message> list) {
        return this.f72126Q.scheduled("users/me/patch/" + str, -1, new v9j() { // from class: l.qw7
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f156661a.m33006jl(list, str);
            }
        });
    }

    /* JADX INFO: renamed from: Ap */
    public C22306c<q860<Conversation>> m32586Ap() {
        return m32749Oe(m32725Me().m141989h1());
    }

    /* JADX INFO: renamed from: Aq */
    public void m32587Aq(String str, double d2, int i) {
        Conversation conversationQuery = CoreModule.f17553k.f91950m.query(str);
        if (NullChecker.m81303a(conversationQuery)) {
            conversationQuery.conversationUserUpdatedTime = d2;
            conversationQuery.conversationUserDistance = i;
            CoreModule.f17553k.f91950m.upsert(conversationQuery);
        }
    }

    /* JADX INFO: renamed from: Be */
    public void m32588Be(final User user, final Conversation conversation) {
        this.f72126Q.f19609U.m109085a(new d30() { // from class: l.z58
            @Override // p149l.d30
            public final void call() {
                this.f201762a.m32811Th(user, conversation);
            }
        });
    }

    /* JADX INFO: renamed from: Bf */
    public void m32589Bf() {
        e51.m114774y(new Runnable() { // from class: l.uv7
            @Override // java.lang.Runnable
            public final void run() {
                this.f178508a.m32966gi();
            }
        });
    }

    /* JADX INFO: renamed from: Bg */
    public double m32590Bg() {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(mqi0.m155944o());
        calendar.set(calendar.get(1), calendar.get(2), calendar.get(5), 0, 0, 0);
        return (calendar.getTimeInMillis() - (((long) (ura.m195053e().m195057d().mo33788Ye() - 1)) * 86400000)) - 1;
    }

    /* JADX INFO: renamed from: Bh */
    public void m32591Bh(Boolean bool) {
        this.f19891Q2 = bool.booleanValue();
    }

    /* JADX INFO: renamed from: Bi */
    public final /* synthetic */ roj0 m32592Bi(final List list, Envelope envelope) {
        this.f72126Q.f19609U.m109085a(new d30() { // from class: l.z98
            @Override // p149l.d30
            public final void call() {
                C4740g.m32085I8(list);
            }
        });
        return roj0.f160388a;
    }

    /* JADX INFO: renamed from: Bj */
    public final /* synthetic */ C22306c m32593Bj(final String str, final String str2) {
        return new la20(new v9j() { // from class: l.t48
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4728a.f19494P.auth().m185898q(C4728a.m31235P0(str, str2)).m185887f().m185883b();
            }
        }).map(new w9j() { // from class: l.u48
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f173706a.m33197yj(str, (Envelope) obj);
            }
        }).delay(200L, TimeUnit.MILLISECONDS).map(new w9j() { // from class: l.v48
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f179886a.m32580Aj(str, (Boolean) obj);
            }
        }).compose(C4728a.m31252T2());
    }

    /* JADX INFO: renamed from: Bk */
    public final /* synthetic */ q860 m32594Bk(List list, DbLinks dbLinks) {
        return m99390Z2(list, dbLinks);
    }

    /* JADX INFO: renamed from: Bl */
    public final /* synthetic */ void m32595Bl(String str, Message message) {
        Conversation conversationQuery = CoreModule.f17553k.f91950m.query(str);
        if (NullChecker.m81303a(conversationQuery)) {
            CoreModule.f17553k.f91950m.upsert(conversationQuery);
            Iterator<Message> it = CoreModule.f17553k.f91940c.query(Filter.AND(Message.CID.mo60175EQ(str), Message.MESSAGETYPE.m60176EQ(MessageType.ai_chat_analysis_guide)), Message.CREATEDTIME.DESC, 0).iterator();
            while (it.hasNext()) {
                CoreModule.f17553k.f91940c.delete(it.next().f56011id);
            }
            m32941eh(message);
        }
    }

    /* JADX INFO: renamed from: Bm */
    public final /* synthetic */ void m32596Bm(String str, String str2) {
        Conversation conversationM32735Mo = m32735Mo(str);
        if (conversationM32735Mo == null) {
            return;
        }
        if ((TextUtils.isEmpty(str2) ? 0L : hmb.m131720y1(str2)) > (TextUtils.isEmpty(conversationM32735Mo.otherReadUntil) ? 0L : hmb.m131720y1(conversationM32735Mo.otherReadUntil))) {
            conversationM32735Mo.otherReadUntil = str2;
            CoreModule.f17553k.f91950m.upsert(conversationM32735Mo);
        }
    }

    /* JADX INFO: renamed from: Bn */
    public C22306c<roj0> m32597Bn(String str) {
        return m32610Cn(str, null);
    }

    /* JADX INFO: renamed from: Bo */
    public C22306c<Optional<ConversationPatchRecord>> m32598Bo(final String str) {
        return this.f72126Q.now("patchOffline" + str, C22306c.fromCallable(new Callable() { // from class: l.fq7
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f98767a.m33019kl(str);
            }
        }).compose(C4728a.m31252T2()).doOnNext(new e30() { // from class: l.qq7
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f155870a.m33045ml((Optional) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: Bp */
    public void m32599Bp(String str, String str2, String str3) {
        Message messageNew_ = Message.new_();
        messageNew_.messageType = MessageType.get("tickle");
        messageNew_.msgData = ura.m195053e().m195057d().mo33746Rg(str2, str3);
        m32636En(str, messageNew_, null, false);
    }

    /* JADX INFO: renamed from: Bq */
    public C22306c<roj0> m32600Bq(final String str) {
        return this.f72126Q.scheduled("upgradeCompliment_" + str, -1, new v9j() { // from class: l.l28
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f125752a.m32804Sm(str);
            }
        });
    }

    /* JADX INFO: renamed from: Ce */
    public void m32601Ce(String str) {
        User userM169520na = CoreModule.f17545c.f19639e0.m169520na();
        if (NullChecker.m81303a(userM169520na) && userM169520na.isFemale()) {
            CrashHelper.m81296c(new RuntimeException("limit like error for female from " + str + ", errorId" + this.f72126Q.f19642f0.f19868J0.get()));
        }
    }

    /* JADX INFO: renamed from: Cf */
    public C22306c<roj0> m32602Cf(final String str) {
        return TextUtils.isEmpty(str) ? C22306c.just(roj0.f160388a) : this.f72126Q.now(C22306c.fromCallable(new Callable() { // from class: l.jq7
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f119252a.m32990ii(str);
            }
        }).compose(C4728a.m31252T2()));
    }

    /* JADX INFO: renamed from: Cg */
    public C22306c<Boolean> m32603Cg(String str, String str2) {
        return CoreModule.f17553k.f91940c.m206055M(str, str2).m165620m().map(new w9j() { // from class: l.h08
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(!vwb.m200296J((List) obj));
            }
        });
    }

    /* JADX INFO: renamed from: Ch */
    public final /* synthetic */ void m32604Ch(String str, Conversation conversation) {
        if (!TextUtils.isEmpty(m33194yg())) {
            l3f l3fVar = new l3f();
            l3fVar.f125900s = "e_matched_time_left";
            l3fVar.f125895n = m33194yg();
            EventNameEnum eventNameEnum = EventNameEnum.USER_BEHAVIOR_COMPLEMENT;
            l3fVar.f125885d = eventNameEnum;
            int iLongValue = (int) (this.f72126Q.f19642f0.f19865I0.get().longValue() - mqi0.m155944o());
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm:ss");
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
            Date date = new Date();
            date.setTime(iLongValue);
            HashMap map = new HashMap();
            map.put("left_time", simpleDateFormat.format(date));
            zvf0.m220392n(l3fVar, map);
            l3f l3fVar2 = new l3f();
            l3fVar2.f125900s = MatchScData.MID;
            l3fVar2.f125885d = eventNameEnum;
            l3fVar2.f125895n = m33194yg();
            HashMap map2 = new HashMap();
            map2.put("receiver_user_id", str);
            map2.put("actiontype", "swipe");
            map2.put("actionname", "like");
            map2.put("update_relationships_module_id", MatchScData.ModuleId.mid_e_card);
            map2.put("update_relationships_source", "limited_time_match");
            map2.put("created_time", String.valueOf(mqi0.m155944o() / 1000));
            zvf0.m220392n(l3fVar2, map2);
        }
        mkd0.m154992z(this.f19894R1);
        this.f19868J0.put("");
        this.f19862H0.put(0L);
        this.f19865I0.put(0L);
        boolean zEquals = TextUtils.equals(this.f72126Q.f19642f0.f19887P1, str);
        C4732c c4732c = this.f72126Q;
        if (zEquals) {
            c4732c.f19687u0.m30491x7(str);
        } else {
            c4732c.f19663m0.m30990D8(str);
        }
    }

    /* JADX INFO: renamed from: Ci */
    public final /* synthetic */ C22306c m32605Ci(final JSONObject jSONObject, final List list, final Set set, final Set set2) {
        return ia20.m135121e(new v9j() { // from class: l.c98
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4728a.f19494P.auth().m185898q(C4728a.m31375z() + "?method=patch&search=newMatch").m185893l(utc0.create(Network.JSON, jSONObject.toString())).m185883b();
            }
        }).map(new w9j() { // from class: l.d98
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f84940a.m32592Bi(list, (Envelope) obj);
            }
        }).onErrorReturn(new w9j() { // from class: l.e98
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return C4740g.m32309c9(set, set2, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: renamed from: Cj */
    public final /* synthetic */ stc0 m32606Cj(Links links) {
        return C4728a.f19494P.auth().m185898q(m33052nf(links)).m185883b();
    }

    /* JADX INFO: renamed from: Ck */
    public final /* synthetic */ ConversationCounter m32607Ck(Double d2) {
        return m33212zl(d2.doubleValue());
    }

    /* JADX INFO: renamed from: Cl */
    public final /* synthetic */ roj0 m32608Cl(final String str, final Message message) throws Exception {
        this.f72126Q.f19609U.m109085a(new d30() { // from class: l.lt7
            @Override // p149l.d30
            public final void call() {
                this.f129940a.m32595Bl(str, message);
            }
        });
        return roj0.f160388a;
    }

    /* JADX INFO: renamed from: Cm */
    public final /* synthetic */ void m32609Cm(final String str, final String str2) {
        this.f72126Q.f19609U.m109085a(new d30() { // from class: l.q18
            @Override // p149l.d30
            public final void call() {
                this.f152111a.m32596Bm(str, str2);
            }
        });
    }

    /* JADX INFO: renamed from: Cn */
    public C22306c<roj0> m32610Cn(final String str, final String str2) {
        if (!ura.m195053e().m195057d().mo33676E() || TextUtils.isEmpty(str2)) {
            DbLinks dbLinks = (DbLinks) CoreModule.f17553k.f91941d.queryCache(str);
            str2 = (dbLinks == null || !NullChecker.m81303a(dbLinks.links)) ? null : dbLinks.links.next;
        }
        C4732c c4732c = this.f72126Q;
        if (str2 == null) {
            return c4732c.just();
        }
        return c4732c.scheduled("conversations/" + str + "/next", 0, new v9j() { // from class: l.op7
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f144953a.m32837Vj(str, str2);
            }
        });
    }

    /* JADX INFO: renamed from: Co */
    public C22306c<roj0> m32611Co() {
        return this.f72126Q.scheduled("patchRecord", -1, new v9j() { // from class: l.ps7
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f150976a.m33084pl();
            }
        });
    }

    /* JADX INFO: renamed from: Cp */
    public void m32612Cp(long j) {
        this.f72126Q.f19642f0.f19947j1.put(Long.valueOf(j));
    }

    /* JADX INFO: renamed from: Cq */
    public final boolean m32613Cq() {
        return this.f19981u2.get().intValue() == 0;
    }

    /* JADX INFO: renamed from: De */
    public void m32614De(final String str) {
        e51.m114774y(new Runnable() { // from class: l.br7
            @Override // java.lang.Runnable
            public final void run() {
                C4740g.m32385id(str);
            }
        });
    }

    /* JADX INFO: renamed from: Df, reason: merged with bridge method [inline-methods] */
    public void m32978hi(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        CoreModule.f17553k.f91940c.delete(Filter.AND(Message.CID.mo60175EQ(str), Message.MESSAGETYPE.m60176EQ(MessageType.local_chat_assistant_question_new)));
    }

    /* JADX INFO: renamed from: Dg */
    public C22306c<Conversation> m32616Dg(String str) {
        return CoreModule.f17553k.f91950m.m142014y0(str).m165620m().map(new w9j() { // from class: l.fb8
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return C4740g.m32205T6((List) obj);
            }
        });
    }

    /* JADX INFO: renamed from: Dh */
    public final /* synthetic */ roj0 m32617Dh(Envelope envelope) {
        this.f72126Q.m31492w3(envelope, null);
        return roj0.f160388a;
    }

    /* JADX INFO: renamed from: Di */
    public final /* synthetic */ C22306c m32618Di(int i, List list) {
        int iMin = Math.min(i, list.size());
        String[] strArr = new String[iMin];
        for (int i2 = 0; i2 < iMin; i2++) {
            strArr[i2] = ((Conversation) list.get(i2)).otherUser;
        }
        return m32857Xf(LocalPlaceBan.matchList, "match", strArr);
    }

    /* JADX INFO: renamed from: Dj */
    public final /* synthetic */ Envelope m32619Dj(final Envelope envelope) {
        this.f72126Q.m31493x3(envelope, new d30() { // from class: l.wy7
            @Override // p149l.d30
            public final void call() {
                C4740g.m32191S3(envelope);
            }
        }, true);
        return envelope;
    }

    /* JADX INFO: renamed from: Dk */
    public final /* synthetic */ void m32620Dk(ConversationCounter conversationCounter) {
        if (this.f19987w2.m221515e() == null || (!conversationCounter.equalsIgnoreTime(this.f19987w2.m221515e()) && conversationCounter.updatedTime >= this.f19987w2.m221515e().updatedTime)) {
            this.f19987w2.m132487l(conversationCounter);
            this.f19990x2 = true;
        }
    }

    /* JADX INFO: renamed from: Dl */
    public final /* synthetic */ void m32621Dl(String str, Message message) {
        Conversation conversationQuery = CoreModule.f17553k.f91950m.query(str);
        if (NullChecker.m81303a(conversationQuery)) {
            conversationQuery.hasLocalBreakIce = true;
            CoreModule.f17553k.f91950m.upsert(conversationQuery);
            Iterator<Message> it = CoreModule.f17553k.f91940c.query(Filter.AND(Message.CID.mo60175EQ(str), Message.MESSAGETYPE.m60176EQ(MessageType.local_break_ice)), Message.CREATEDTIME.DESC, 0).iterator();
            while (it.hasNext()) {
                CoreModule.f17553k.f91940c.delete(it.next().f56011id);
            }
            m32941eh(message);
        }
    }

    /* JADX INFO: renamed from: Dm */
    public final /* synthetic */ void m32622Dm(String str, Message message) {
        this.f72126Q.f19639e0.m169386Ea(str, (long) message.createdTime);
    }

    /* JADX INFO: renamed from: Dn */
    public C22306c<Message> m32623Dn(String str, Message message, Sticker sticker) {
        return m32636En(str, message, sticker, false);
    }

    /* JADX INFO: renamed from: Do */
    public C22306c<roj0> m32624Do(final String str, final String str2, final Message message, final String str3) {
        return this.f72126Q.scheduled("patch_msg_" + str2 + str3, -1, new v9j() { // from class: l.q78
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f153015a.m33123sl(message, str3, str, str2);
            }
        });
    }

    /* JADX INFO: renamed from: Dp */
    public void m32625Dp(String str, final boolean z) {
        final Conversation conversationM33216zp = m33216zp(str);
        if (conversationM33216zp == null) {
            return;
        }
        Runnable runnable = new Runnable() { // from class: l.g98
            @Override // java.lang.Runnable
            public final void run() {
                this.f101548a.m32946em(conversationM33216zp, z);
            }
        };
        if (Looper.myLooper() == Looper.getMainLooper()) {
            e51.m114774y(runnable);
        } else {
            runnable.run();
        }
    }

    /* JADX INFO: renamed from: Dq */
    public void m32626Dq(MessageFeedbackStatus messageFeedbackStatus, Message message) {
        if (NullChecker.m81303a(message) && NullChecker.m81303a(messageFeedbackStatus)) {
            final Message messageMo223809clone = message.mo223809clone();
            messageMo223809clone.msgData = messageFeedbackStatus.toJson();
            this.f72126Q.f19609U.m109085a(new d30() { // from class: l.r78
                @Override // p149l.d30
                public final void call() {
                    CoreModule.f17553k.f91940c.upsert(messageMo223809clone);
                }
            });
        }
    }

    /* JADX INFO: renamed from: Ee */
    public void m32627Ee() {
        int iIntValue = this.f19874L0.get().intValue();
        if (iIntValue == 1) {
            return;
        }
        if (iIntValue == 0 && this.f19889Q0) {
            return;
        }
        this.f19889Q0 = true;
        this.f19874L0.put(0);
        this.f72126Q.scheduled("clean_unread_notification", -1, new v9j() { // from class: l.s78
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return ia20.m135117a(new v9j() { // from class: l.os7
                    @Override // p149l.v9j, java.util.concurrent.Callable
                    public final Object call() {
                        return C4728a.f19494P.auth().m185898q(C4728a.m31213J0("/clean-unread-notification")).m185893l(utc0.create(Network.JSON, "")).m185883b();
                    }
                });
            }
        }).delay(200L, TimeUnit.MILLISECONDS).subscribe(mkd0.m154956H(new e30() { // from class: l.d88
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f84836a.m32823Uh((Envelope) obj);
            }
        }, new e30() { // from class: l.o88
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f142603a.m32835Vh((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: Ef */
    public void m32628Ef(String str) {
        CoreModule.f17553k.f91950m.delete(str);
    }

    /* JADX INFO: renamed from: Eg */
    public int m32629Eg(String str) {
        Message messageQuery;
        return (TextUtils.isEmpty(str) || (messageQuery = CoreModule.f17553k.f91940c.query(str)) == null) ? CoreModule.f17553k.f91940c.count(Filter.AND(Message.CID.mo60175EQ(ura.m195053e().m195057d().mo33840h()), Message.MESSAGETYPE.m60176EQ("live_vip_greet")), 1) : CoreModule.f17553k.f91940c.count(Filter.AND(Message.CID.mo60175EQ(ura.m195053e().m195057d().mo33840h()), Message.MESSAGETYPE.m60176EQ("live_vip_greet"), Message.CREATEDTIME.REQ(Double.valueOf(messageQuery.createdTime))), 1);
    }

    /* JADX INFO: renamed from: Eh */
    public final /* synthetic */ C22306c m32630Eh(final ConversationBatchPatchIds conversationBatchPatchIds) {
        return vwb.m200296J(conversationBatchPatchIds.ids) ? C22306c.empty() : new la20(new v9j() { // from class: l.c38
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4728a.f19494P.auth().m185898q(C4728a.m31375z() + "?method=patch&search=batch").m185893l(utc0.create(Network.JSON, conversationBatchPatchIds.toJson())).m185883b();
            }
        }).map(new w9j() { // from class: l.d38
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f83474a.m32617Dh((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: Ei */
    public final /* synthetic */ void m32631Ei(List list) {
        LinkedHashMap<String, UserLiveLabel> linkedHashMap = new LinkedHashMap<>();
        if (!vwb.m200296J(list)) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                UserLiveLabel userLiveLabel = (UserLiveLabel) it.next();
                linkedHashMap.put(userLiveLabel.userId, userLiveLabel);
            }
        }
        this.f19846B2.m132487l(linkedHashMap);
    }

    /* JADX INFO: renamed from: Ej */
    public final /* synthetic */ C22306c m32632Ej(final Links links) {
        return new la20(new v9j() { // from class: l.zw7
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f205157a.m32606Cj(links);
            }
        }).map(new w9j() { // from class: l.bx7
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f77769a.m32619Dj((Envelope) obj);
            }
        }).compose(mkd0.m154951C()).map(new w9j() { // from class: l.cx7
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((Envelope) obj).pagination.links;
            }
        });
    }

    /* JADX INFO: renamed from: Ek */
    public final /* synthetic */ Conversation m32633Ek(String str) throws Exception {
        Conversation conversationM32735Mo = m32735Mo(str);
        List<Message> listM165617j = CoreModule.f17553k.f91940c.m206080l0(str).m165617j();
        if (!m32736Mp(conversationM32735Mo, listM165617j) || TEnum.equals(conversationM32735Mo.status, "dismissed")) {
            return null;
        }
        Message message = (Message) vwb.m200346r(listM165617j, new w9j() { // from class: l.g78
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(TEnum.equals(((Message) obj).status(), "normal"));
            }
        });
        Conversation conversation = new Conversation();
        conversation.readUntil = message == null ? "" : message.f56011id;
        return conversation;
    }

    /* JADX INFO: renamed from: El */
    public final /* synthetic */ roj0 m32634El(final String str, final Message message) throws Exception {
        this.f72126Q.f19609U.m109085a(new d30() { // from class: l.kx7
            @Override // p149l.d30
            public final void call() {
                this.f125065a.m32621Dl(str, message);
            }
        });
        return roj0.f160388a;
    }

    /* JADX INFO: renamed from: Em */
    public final /* synthetic */ void m32635Em(double d2) {
        this.f72126Q.f19609U.m109085a(new c(d2));
    }

    /* JADX INFO: renamed from: En */
    public C22306c<Message> m32636En(String str, Message message, Sticker sticker, boolean z) {
        return m32649Fn(str, message, sticker, z, true);
    }

    /* JADX INFO: renamed from: Eo */
    public C22306c<roj0> m32637Eo(final String str, final boolean z, final boolean z2) {
        return this.f72126Q.scheduled("patchSparkAndPartnerSwitch", -1, new v9j() { // from class: l.v08
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f179075a.m33174wl(z, z2, str);
            }
        });
    }

    /* JADX INFO: renamed from: Ep */
    public void m32638Ep(boolean z) {
        this.f19857F1.put(Boolean.valueOf(z));
    }

    /* JADX INFO: renamed from: Eq */
    public C22306c<List<IceBreakingQuestion>> m32639Eq(final String str) {
        return scheduled("users/" + str + "/chat-profiles", 0, new v9j() { // from class: l.nt7
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                String str2 = str;
                return ia20.m135117a(new v9j() { // from class: l.m18
                    @Override // p149l.v9j, java.util.concurrent.Callable
                    public final Object call() {
                        return C4728a.f19494P.auth().m185898q(C4728a.m31366w2("/" + str2 + "/chat-profiles")).m185883b();
                    }
                }).map(new w9j() { // from class: l.n18
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return C4740g.m32123Ld(str2, (Envelope) obj);
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: Fe */
    public void m32640Fe() {
        mkd0.m154992z(this.f19894R1);
    }

    /* JADX INFO: renamed from: Ff */
    public void m32641Ff(final List<Conversation> list) {
        e51.m114774y(new Runnable() { // from class: l.xt7
            @Override // java.lang.Runnable
            public final void run() {
                this.f194355a.m33016ki(list);
            }
        });
    }

    /* JADX INFO: renamed from: Fg */
    public boolean m32642Fg(String str) {
        return !vwb.m200296J(CoreModule.f17553k.f91940c.m206083o0(str, MessageType.local_match_ice_break));
    }

    /* JADX INFO: renamed from: Fh */
    public final /* synthetic */ C22306c m32643Fh() {
        return C22306c.fromCallable(new Callable() { // from class: l.zz7
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C4740g.m32378i6();
            }
        }).flatMap(new w9j() { // from class: l.b08
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f72413a.m32630Eh((ConversationBatchPatchIds) obj);
            }
        }).compose(C4728a.m31252T2()).doOnError(new e30() { // from class: l.c08
            @Override // p149l.e30
            public final void call(Object obj) {
                C4740g.m32028D6((Throwable) obj);
            }
        });
    }

    /* JADX INFO: renamed from: Fi */
    public final /* synthetic */ C22306c m32644Fi(int i, List list) {
        int iMin = Math.min(i, list.size());
        String[] strArr = new String[iMin];
        for (int i2 = 0; i2 < iMin; i2++) {
            Conversation conversation = (Conversation) list.get(i2);
            if ("group".equals(conversation.convType)) {
                strArr[i2] = this.f72126Q.f19645g0.m31886h7(conversation.otherUser).ownerUserId;
            } else {
                strArr[i2] = conversation.otherUser;
            }
        }
        return m32857Xf("messageList", "match", strArr);
    }

    /* JADX INFO: renamed from: Fj */
    public final /* synthetic */ xaj0 m32645Fj(Boolean bool) {
        String str;
        String str2;
        jl6 jl6Var = CoreModule.f17553k.f91950m;
        StringColumn<Conversation> stringColumn = Conversation.CONVTYPE;
        int iCount = jl6Var.count(stringColumn.mo60175EQ("default"), -1);
        CounterVerification counterVerification = new CounterVerification();
        counterVerification.total = iCount;
        counterVerification.lastVerifyTime = this.f72126Q.f19639e0.f149501x1.get().longValue();
        jl6 jl6Var2 = CoreModule.f17553k.f91950m;
        Filter<Conversation> filterMo60175EQ = stringColumn.mo60175EQ("default");
        DoubleColumn<Conversation> doubleColumn = Conversation.UPDATEDTIME;
        List<Conversation> listQuery = jl6Var2.query(filterMo60175EQ, doubleColumn.DESC, 1);
        String str3 = "null";
        if (vwb.m200296J(listQuery)) {
            str = "null";
        } else {
            Conversation conversation = listQuery.get(0);
            counterVerification.latestUpdatedTime = conversation.updatedTime;
            str = conversation.f56011id;
        }
        List<Conversation> listQuery2 = CoreModule.f17553k.f91950m.query(stringColumn.mo60175EQ("default"), doubleColumn.ASC, 1);
        if (vwb.m200296J(listQuery2)) {
            str2 = "null";
        } else {
            Conversation conversation2 = listQuery2.get(0);
            counterVerification.latestUpdatedTime = conversation2.updatedTime;
            str3 = conversation2.f56011id;
            str2 = ((long) conversation2.updatedTime) + "";
        }
        final CoreData coreData = new CoreData();
        coreData.counterVerification = counterVerification;
        return xaj0.m207578a(new la20(new v9j() { // from class: l.oz7
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4728a.f19494P.auth().m185898q(C4728a.m31213J0("/counter-verifications")).m185893l(utc0.create(Network.JSON, coreData.toJson())).m185883b();
            }
        }).toBlocking().m212771c(null), Integer.valueOf(iCount), "timeInfo: firstCid:" + str + "|firstTime:" + ((long) counterVerification.latestUpdatedTime) + "|lastCid:" + str3 + "|lastTime:" + str2 + "|");
    }

    /* JADX INFO: renamed from: Fk */
    public final /* synthetic */ roj0 m32646Fk(Envelope envelope) {
        this.f72126Q.m31492w3(envelope, null);
        return roj0.f160388a;
    }

    /* JADX INFO: renamed from: Fl */
    public final /* synthetic */ Message m32647Fl(String str, Message message, roj0 roj0Var) {
        return (message == null && NullChecker.m81303a(this.f19882N2.get(str))) ? this.f19882N2.get(str) : message;
    }

    /* JADX INFO: renamed from: Fm */
    public final /* synthetic */ roj0 m32648Fm(final String str, final double d2) throws Exception {
        this.f72126Q.f19609U.m109085a(new d30() { // from class: l.g68
            @Override // p149l.d30
            public final void call() {
                C4740g.m32142Na(str, d2);
            }
        });
        return roj0.f160388a;
    }

    /* JADX INFO: renamed from: Fn */
    public C22306c<Message> m32649Fn(final String str, final Message message, final Sticker sticker, final boolean z, final boolean z2) {
        final CoreProviderInterface coreProviderInterfaceM195057d = ura.m195053e().m195057d();
        coreProviderInterfaceM195057d.mo33689Ga(str);
        if (sticker != null) {
            String strGENERATE_UNIQUE_FAKE_ID = DbObject.GENERATE_UNIQUE_FAKE_ID(App.f15373i.get().intValue());
            sticker.f56011id = strGENERATE_UNIQUE_FAKE_ID;
            message.sticker = strGENERATE_UNIQUE_FAKE_ID;
        }
        final String strMo33708Jd = ura.m195053e().m195057d().mo33708Jd();
        final long jElapsedRealtime = SystemClock.elapsedRealtime();
        boolean zEquals = ura.m195053e().m195057d().mo33676E() ? true ^ TEnum.equals(message.channel, "group") : true;
        if (TextUtils.equals(this.f19868J0.get(), str)) {
            zEquals = false;
        }
        final HashMap map = new HashMap();
        if (!TEnum.equals(message.channel, "group") && !vwb.m200296J(message.media)) {
            Iterator<Media> it = message.media.iterator();
            while (it.hasNext()) {
                if (it.next() instanceof Picture) {
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
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f135337a.m32873Yj(message, str, z4, z3, sticker, coreProviderInterfaceM195057d);
            }
        };
        final w9j w9jVar = new w9j() { // from class: l.xr7
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f194093a.m32921ck(map, sticker, message, (Message) obj);
            }
        };
        final e30<Throwable> e30Var = new e30() { // from class: l.is7
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f114736a.m32956fk(str, message, coreProviderInterfaceM195057d, z2, strMo33708Jd, jElapsedRealtime, (Throwable) obj);
            }
        };
        w9j w9jVar2 = new w9j() { // from class: l.ts7
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f171910a.m33005jk(str, z, z4, z3, e30Var, (Message) obj);
            }
        };
        w9j w9jVar3 = new w9j() { // from class: l.et7
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f93086a.m33018kk(str, message, strMo33708Jd, jElapsedRealtime, (Message) obj);
            }
        };
        w9j w9jVar4 = new w9j() { // from class: l.pt7
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f151120a.m33031lk(message, str, (Message) obj);
            }
        };
        final long jElapsedRealtime2 = SystemClock.elapsedRealtime();
        return this.f72126Q.now(null, ((C22306c) v9jVar.call()).observeOn(Schedulers.m221493io()).flatMap(new w9j() { // from class: l.bu7
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return C4740g.m32523v8(w9jVar, (Message) obj);
            }
        }).compose(TrackMediaUploadUtil.m80306f0("chat", message.media, new w9j() { // from class: l.mu7
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return C4740g.m32503ta((Message) obj);
            }
        })).doOnError(e30Var).filter(w9jVar3).map(w9jVar4).filter(new w9j() { // from class: l.xu7
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return C4740g.m32038E5((Message) obj);
            }
        }).observeOn(jo0.m142408a()).flatMap(w9jVar2).doOnNext(new e30() { // from class: l.iv7
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f115096a.m33044mk(message, jElapsedRealtime2, str, (Message) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: Fo */
    public C22306c<roj0> m32650Fo() {
        return (!ura.m195053e().m195057d().mo33869ka() || this.f72126Q.findRequest("conversations/get", 0) == null) ? m33069oj(null) : m32876Ym();
    }

    /* JADX INFO: renamed from: Fp */
    public C22306c<roj0> m32651Fp(final String str, final String str2, final String str3, final String str4, final String str5) {
        return this.f72126Q.now(new la20(new v9j() { // from class: l.ms7
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4740g.m32551xd(str2, str4, str5, str3, str);
            }
        }).map(new w9j() { // from class: l.ns7
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return roj0.f160388a;
            }
        }).compose(C4728a.m31252T2()));
    }

    /* JADX INFO: renamed from: Fq */
    public C22306c<LinkedHashMap<String, UserLiveLabel>> m32652Fq() {
        return this.f19846B2.asObservable().observeOn(jo0.m142408a());
    }

    /* JADX INFO: renamed from: Ge */
    public void m32653Ge(final String str) {
        e51.m114774y(new Runnable() { // from class: l.hy7
            @Override // java.lang.Runnable
            public final void run() {
                this.f110033a.m32859Xh(str);
            }
        });
    }

    /* JADX INFO: renamed from: Gf */
    public void m32654Gf() {
        e51.m114774y(new Runnable() { // from class: l.vb8
            @Override // java.lang.Runnable
            public final void run() {
                this.f180821a.m33029li();
            }
        });
    }

    /* JADX INFO: renamed from: Gg */
    public C22306c<Boolean> m32655Gg(String str, MessageType messageType) {
        return CoreModule.f17553k.f91940c.m206085q0(str, messageType.toString()).m165620m().map(new w9j() { // from class: l.lp7
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(!vwb.m200296J((List) obj));
            }
        });
    }

    /* JADX INFO: renamed from: Gh */
    public final /* synthetic */ roj0 m32656Gh(Envelope envelope) {
        this.f72126Q.m31492w3(envelope, null);
        return roj0.f160388a;
    }

    /* JADX INFO: renamed from: Gi */
    public final /* synthetic */ void m32657Gi(List list) {
        LinkedHashMap<String, UserLiveLabel> linkedHashMap = new LinkedHashMap<>();
        if (!vwb.m200296J(list)) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                UserLiveLabel userLiveLabel = (UserLiveLabel) it.next();
                linkedHashMap.put(userLiveLabel.userId, userLiveLabel);
            }
        }
        this.f19849C2.m132487l(linkedHashMap);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Gj */
    public final /* synthetic */ void m32658Gj(xaj0 xaj0Var) {
        Envelope envelope = (Envelope) xaj0Var.f191751a;
        if (NullChecker.m81303a(((CoreData) envelope.getModuleData(CoreData.class)).counterVerification) && ((CoreData) envelope.getModuleData(CoreData.class)).counterVerification.nextVerifyTime > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            this.f72126Q.f19639e0.f149494w1.put(Long.valueOf((long) ((CoreData) envelope.getModuleData(CoreData.class)).counterVerification.nextVerifyTime));
        }
        this.f72126Q.f19639e0.f149501x1.put(Long.valueOf(mqi0.m155944o()));
        if (NullChecker.m81303a(((CoreData) envelope.getModuleData(CoreData.class)).counterVerification) && ((CoreData) envelope.getModuleData(CoreData.class)).counterVerification.needSync) {
            jl6 jl6Var = CoreModule.f17553k.f91950m;
            StringColumn<Conversation> stringColumn = Conversation.CONVTYPE;
            List<Conversation> listQuery = jl6Var.query(stringColumn.mo60175EQ("default"), Conversation.UPDATEDTIME.DESC, 200);
            int iCount = CoreModule.f17553k.f91950m.count(Filter.TRUE, -1);
            int iCount2 = CoreModule.f17553k.f91950m.count(stringColumn.NEQ("group"), -1);
            StringBuilder sb = new StringBuilder("Conversation Counter Error userId: ");
            sb.append(CoreModule.m29931H().userId());
            sb.append("\nlocalCounter: ");
            sb.append(xaj0Var.f191752b);
            sb.append("\nremoteCounter: ");
            sb.append(((CoreData) envelope.getModuleData(CoreData.class)).counterVerification.total);
            sb.append("\ndefaultCount: ");
            sb.append(iCount);
            sb.append("\nwithoutGroup: ");
            sb.append(iCount2);
            sb.append("\ncheckTime: ");
            sb.append((String) xaj0Var.f191753c);
            sb.append(" | localCids:");
            if (!vwb.m200296J(listQuery)) {
                for (Conversation conversation : listQuery) {
                    sb.append(conversation.f56011id);
                    sb.append("|");
                    sb.append(conversation.status.toString());
                    sb.append("|");
                    sb.append(conversation.convType);
                    sb.append(com.clevertap.android.sdk.Constants.SEPARATOR_COMMA);
                }
            }
            sb.append("\ndefaultIds:\n");
            List<Conversation> listQuery2 = CoreModule.f17553k.f91950m.query(Filter.TRUE, Conversation.UPDATEDTIME.DESC, 200);
            if (!vwb.m200296J(listQuery2)) {
                for (Conversation conversation2 : listQuery2) {
                    sb.append(conversation2.f56011id);
                    sb.append("|");
                    sb.append(conversation2.status.toString());
                    sb.append("|");
                    sb.append(conversation2.convType);
                    sb.append(com.clevertap.android.sdk.Constants.SEPARATOR_COMMA);
                }
            }
            String strM202948c = wf6.m202948c();
            sb.append("\nrequestList:\n");
            sb.append(strM202948c);
            sb.append(SignParameters.NEW_LINE);
            CrashHelper.m81296c(new Exception(sb.toString()));
        }
    }

    /* JADX INFO: renamed from: Gk */
    public final /* synthetic */ C22306c m32659Gk(final String str, final Conversation conversation) {
        return conversation != null ? new la20(new v9j() { // from class: l.i68
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4728a.f19494P.auth().m185898q(C4728a.m31176A(str) + "&method=patch").m185893l(utc0.create(Network.JSON, conversation.toJson())).m185883b();
            }
        }).map(new w9j() { // from class: l.j68
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f116393a.m32646Fk((Envelope) obj);
            }
        }) : C22306c.empty();
    }

    /* JADX INFO: renamed from: Gl */
    public final /* synthetic */ void m32660Gl(String str, String str2, Message message) {
        if (message == null) {
            m32746Nn(str, str2, false, true, null);
        }
    }

    /* JADX INFO: renamed from: Gm */
    public final /* synthetic */ roj0 m32661Gm(final String str, final double d2) throws Exception {
        this.f72126Q.f19609U.m109085a(new d30() { // from class: l.a68
            @Override // p149l.d30
            public final void call() {
                C4740g.m32272Z7(str, d2);
            }
        });
        return roj0.f160388a;
    }

    /* JADX INFO: renamed from: Gn */
    public C22306c<roj0> m32662Gn(String str, Message message) {
        return m32674Hn(str, message, false, null);
    }

    /* JADX INFO: renamed from: Go */
    public void m32663Go(Throwable th, final String str) {
        if (th instanceof ApiExcep.Client.NotFound) {
            e51.m114742G(new Runnable() { // from class: l.b28
                @Override // java.lang.Runnable
                public final void run() {
                    this.f72659a.m33186xl(str);
                }
            });
        }
    }

    /* JADX INFO: renamed from: Gp */
    public void m32664Gp(Act act, boolean z, String str, Picture.ImageUri imageUri) {
        m32676Hp(act, z, str, "", imageUri, "");
    }

    /* JADX INFO: renamed from: He */
    public void m32665He() {
        this.f72126Q.f19685t1.m31516u("countdown_conv_list_key");
        this.f72126Q.f19685t1.m31516u("countdown_card_conv_key");
        if (!TextUtils.isEmpty(this.f72126Q.f19642f0.f19868J0.get())) {
            C4732c c4732c = this.f72126Q;
            c4732c.f19663m0.m30990D8(c4732c.f19642f0.f19868J0.get());
        }
        this.f72126Q.f19642f0.f19868J0.put("");
        this.f72126Q.f19642f0.f19862H0.put(0L);
        this.f72126Q.f19642f0.f19865I0.put(0L);
        this.f72126Q.f19642f0.f19871K0.put(Boolean.FALSE);
        this.f72126Q.f19642f0.m32640Fe();
        this.f19900T1.m132487l(roj0.f160388a);
    }

    /* JADX INFO: renamed from: Hf */
    public void m32666Hf(final String str) {
        this.f72126Q.f19609U.m109085a(new d30() { // from class: l.lv7
            @Override // p149l.d30
            public final void call() {
                String str2 = str;
                CoreModule.f17553k.f91940c.delete(Filter.AND(Message.CID.mo60175EQ(str2), Message.f20441ID.mo60175EQ("fake_id_filter_veification" + str2)));
            }
        });
    }

    /* JADX INFO: renamed from: Hg */
    public C22306c<Boolean> m32667Hg(final String str) {
        return this.f72126Q.now(C22306c.fromCallable(new Callable() { // from class: l.xw7
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C4740g.m32362ge(str);
            }
        }).compose(C4728a.m31252T2()));
    }

    /* JADX INFO: renamed from: Hh */
    public final /* synthetic */ C22306c m32668Hh(final ConversationBatchPatchIds conversationBatchPatchIds) {
        return vwb.m200296J(conversationBatchPatchIds.ids) ? C22306c.empty() : new la20(new v9j() { // from class: l.rw7
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4728a.f19494P.auth().m185898q(C4728a.m31375z() + "?method=patch&search=batch").m185893l(utc0.create(Network.JSON, conversationBatchPatchIds.toJson())).m185883b();
            }
        }).map(new w9j() { // from class: l.sw7
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f166636a.m32656Gh((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: Hj */
    public final /* synthetic */ void m32670Hj(Message message) {
        Conversation conversationM32735Mo;
        Message messageQuery = CoreModule.f17553k.f91940c.query(message.f56011id);
        if (messageQuery == null || (conversationM32735Mo = m32735Mo(message.cid)) == null || conversationM32735Mo.localSafetyReminderTime > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            return;
        }
        conversationM32735Mo.localSafetyReminderTime = message.createdTime;
        CoreModule.f17553k.f91950m.upsert(conversationM32735Mo);
        messageQuery.localSafetyReminder = true;
        CoreModule.f17553k.f91940c.upsert(messageQuery);
    }

    /* JADX INFO: renamed from: Hk */
    public final /* synthetic */ void m32671Hk(String str, Throwable th) {
        StringBuilder sb = new StringBuilder("cid:");
        sb.append(str);
        sb.append(" errorMessage:");
        sb.append(NullChecker.m81303a(th.getMessage()) ? th.getMessage() : "");
        du2.m113670a("ConversationPatchDelete", sb.toString());
        m32663Go(th, str);
    }

    /* JADX INFO: renamed from: Hl */
    public final /* synthetic */ void m32672Hl(Conversation conversation) {
        m32728Mh(conversation.f56011id);
    }

    /* JADX INFO: renamed from: Hm */
    public final /* synthetic */ roj0 m32673Hm(final String str, final double d2) throws Exception {
        this.f72126Q.f19609U.m109085a(new d30() { // from class: l.h68
            @Override // p149l.d30
            public final void call() {
                C4740g.m32330e6(str, d2);
            }
        });
        return roj0.f160388a;
    }

    /* JADX INFO: renamed from: Hn */
    public final C22306c<roj0> m32674Hn(final String str, final Message message, final boolean z, final d30 d30Var) {
        return this.f72126Q.scheduled("messagePostSimple", -1, new v9j() { // from class: l.i08
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f110260a.m33083pk(str, message, d30Var, z);
            }
        });
    }

    /* JADX INFO: renamed from: Ho */
    public C22306c<roj0> m32675Ho(final String str, final List<String> list, final Message message) {
        return C22306c.fromCallable(new Callable() { // from class: l.y18
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C4740g.m32237W5(str, list, message);
            }
        }).flatMap(new w9j() { // from class: l.z18
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f201053a.m33199yl(str, (JSONObject) obj);
            }
        });
    }

    /* JADX INFO: renamed from: Hp */
    public void m32676Hp(Act act, final boolean z, final String str, final String str2, final Picture.ImageUri imageUri, final String str3) {
        act.duringCreated(m33105rg(str).filter(new w9j() { // from class: l.ty7
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return C4740g.m32015C4((Boolean) obj);
            }
        }).flatMap(new w9j() { // from class: l.ez7
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f93873a.m32958fm((Boolean) obj);
            }
        }).filter(new w9j() { // from class: l.pz7
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f151919a.m32970gm((roj0) obj);
            }
        }).flatMap(new w9j() { // from class: l.a08
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f67009a.m32982hm(str, str2, z, (roj0) obj);
            }
        }).filter(new w9j() { // from class: l.l08
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return C4740g.m32086I9((CipherId) obj);
            }
        })).subscribe(mkd0.m154956H(new e30() { // from class: l.w08
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f183729a.m32994im(str, str2, imageUri, z, str3, (CipherId) obj);
            }
        }, new e30() { // from class: l.h18
            @Override // p149l.e30
            public final void call(Object obj) {
                C4740g.m32096J8((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: Ie */
    public void m32677Ie() {
        this.f19858F2.clear();
    }

    /* JADX INFO: renamed from: If */
    public void m32678If() {
        e51.m114774y(new Runnable() { // from class: l.sq7
            @Override // java.lang.Runnable
            public final void run() {
                this.f165943a.m33042mi();
            }
        });
    }

    /* JADX INFO: renamed from: Ig */
    public C22306c<Boolean> m32679Ig(String str) {
        return CoreModule.f17553k.f91940c.m206073e0(str).m165620m().map(new w9j() { // from class: l.l38
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(!vwb.m200296J((List) obj));
            }
        });
    }

    /* JADX INFO: renamed from: Ih */
    public final /* synthetic */ C22306c m32680Ih() {
        return C22306c.fromCallable(new Callable() { // from class: l.oq7
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C4740g.m32133Mc();
            }
        }).flatMap(new w9j() { // from class: l.pq7
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f150763a.m32668Hh((ConversationBatchPatchIds) obj);
            }
        }).compose(C4728a.m31252T2()).doOnError(new e30() { // from class: l.rq7
            @Override // p149l.e30
            public final void call(Object obj) {
                C4740g.m32059G4((Throwable) obj);
            }
        });
    }

    /* JADX INFO: renamed from: Ii */
    public final /* synthetic */ C22306c m32681Ii(final String str, final String str2) {
        return ia20.m135121e(new v9j() { // from class: l.my7
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4728a.f19494P.auth().m185898q(C4728a.m31211I2("/conversations/" + str + "/messages/" + str2 + "/audiotexts")).m185887f().m185883b();
            }
        }).map(new w9j() { // from class: l.ny7
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return C4740g.m32518v3((Envelope) obj);
            }
        }).doOnNext(new e30() { // from class: l.oy7
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f146293a.m32669Hi(str2, (AudioText) obj);
            }
        });
    }

    /* JADX INFO: renamed from: Ij */
    public final /* synthetic */ void m32682Ij(final Message message) {
        this.f72126Q.f19609U.m109085a(new d30() { // from class: l.e48
            @Override // p149l.d30
            public final void call() {
                this.f89256a.m32670Hj(message);
            }
        });
    }

    /* JADX INFO: renamed from: Ik */
    public final /* synthetic */ C22306c m32683Ik(final String str) {
        return C22306c.fromCallable(new Callable() { // from class: l.b58
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f73457a.m32633Ek(str);
            }
        }).flatMap(new w9j() { // from class: l.c58
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f79343a.m32659Gk(str, (Conversation) obj);
            }
        }).compose(C4728a.m31252T2()).doOnError(new e30() { // from class: l.e58
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f89353a.m32671Hk(str, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: renamed from: Il */
    public final /* synthetic */ void m32684Il(Conversation conversation) {
        m33117sf(conversation.f56011id);
    }

    /* JADX INFO: renamed from: Im */
    public final /* synthetic */ roj0 m32685Im(final String str, final double d2, final int i) throws Exception {
        this.f72126Q.f19609U.m109085a(new d30() { // from class: l.w48
            @Override // p149l.d30
            public final void call() {
                C4740g.m32410l5(str, d2, i);
            }
        });
        return roj0.f160388a;
    }

    /* JADX INFO: renamed from: In */
    public C22306c<roj0> m32686In(Message message) {
        return m32698Jn(message, null);
    }

    /* JADX INFO: renamed from: Io */
    public final C22306c<roj0> m32687Io(final double d2) {
        return this.f72126Q.scheduled("postCounter", -1, new v9j() { // from class: l.v58
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f180009a.m32582Al(d2);
            }
        });
    }

    /* JADX INFO: renamed from: Ip, reason: merged with bridge method [inline-methods] */
    public void m33007jm(IWXAPI iwxapi, String str, String str2, boolean z, String str3, boolean z2) {
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
            wXMediaMessage.thumbData = adk0.m95903a(BitmapFactory.decodeFile(ShareHelper.m79956W("share_ab_icon.png")));
        } else {
            wXMediaMessage.thumbData = adk0.m95903a(BitmapFactory.decodeFile(str2));
        }
        SendMessageToWX.Req req = new SendMessageToWX.Req();
        req.message = wXMediaMessage;
        req.transaction = "ab_share_profile";
        if (z) {
            req.scene = 1;
        } else {
            req.scene = 0;
        }
        iwxapi.sendReq(req);
    }

    /* JADX INFO: renamed from: Je */
    public void m32689Je() {
        this.f19861G2.clear();
    }

    /* JADX INFO: renamed from: Jf */
    public void m32690Jf() {
        e51.m114774y(new Runnable() { // from class: l.mb8
            @Override // java.lang.Runnable
            public final void run() {
                this.f132995a.m33055ni();
            }
        });
    }

    /* JADX INFO: renamed from: Jg */
    public C22306c<Boolean> m32691Jg(String str) {
        return CoreModule.f17553k.f91940c.m206074f0(str).m165620m().map(new w9j() { // from class: l.fr7
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(!((List) obj).isEmpty());
            }
        });
    }

    /* JADX INFO: renamed from: Jh */
    public final /* synthetic */ void m32692Jh(String str) {
        m33104rf(str, false);
    }

    /* JADX INFO: renamed from: Ji */
    public final /* synthetic */ void m32693Ji(Envelope envelope) {
        m32821Uf();
        List<FriendInfo> list = ((CoreData) envelope.getModuleData(CoreData.class)).friends;
        if (vwb.m200296J(list)) {
            return;
        }
        this.f19944i1.put(Integer.valueOf(this.f19944i1.get().intValue() + 1));
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            arrayList.add(list.get(i).userId);
        }
        m32999je(arrayList);
    }

    /* JADX INFO: renamed from: Jj */
    public final /* synthetic */ q860 m32694Jj(List list, DbLinks dbLinks) {
        if (dbLinks == null) {
            m32650Fo();
        }
        return m99390Z2(list, dbLinks);
    }

    /* JADX INFO: renamed from: Jk */
    public final /* synthetic */ ConversationPatchRecord m32695Jk(ConversationPatchRecord conversationPatchRecord) throws Exception {
        final ConversationPatchRecord conversationPatchRecordQuery = CoreModule.f17553k.f91949l.query(conversationPatchRecord.f56011id);
        if (conversationPatchRecordQuery == null || TEnum.equals(conversationPatchRecordQuery.state, ConversationPatchState.patching)) {
            return null;
        }
        conversationPatchRecordQuery.state = ConversationPatchState.get(ConversationPatchState.patching);
        this.f72126Q.f19609U.m109085a(new d30() { // from class: l.v38
            @Override // p149l.d30
            public final void call() {
                CoreModule.f17553k.f91949l.updateBy_id(conversationPatchRecordQuery);
            }
        });
        return conversationPatchRecordQuery;
    }

    /* JADX INFO: renamed from: Jl */
    public final /* synthetic */ void m32696Jl(List list, ArrayList arrayList, Envelope envelope) {
        vwb.m200354z(list, new e30() { // from class: l.q38
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f152386a.m32672Hl((Conversation) obj);
            }
        });
        if (!vwb.m200296J(arrayList)) {
            vwb.m200354z(arrayList, new e30() { // from class: l.r38
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f157511a.m32684Il((Conversation) obj);
                }
            });
        }
        m33130tf(envelope);
    }

    /* JADX INFO: renamed from: Jm */
    public final /* synthetic */ void m32697Jm(final Message message, final boolean z, roj0 roj0Var) {
        this.f72126Q.f19609U.m109085a(new d30() { // from class: l.e78
            @Override // p149l.d30
            public final void call() {
                C4740g.m32144Nc(message, z);
            }
        });
    }

    /* JADX INFO: renamed from: Jn */
    public C22306c<roj0> m32698Jn(final Message message, final d30 d30Var) {
        return this.f72126Q.scheduled("messageRecall", -1, new v9j() { // from class: l.r58
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f157762a.m33109rk(message, d30Var);
            }
        });
    }

    /* JADX INFO: renamed from: Jo */
    public C22306c<Message> m32699Jo() {
        return this.f19910X.observeOn(jo0.m142408a());
    }

    /* JADX INFO: renamed from: Jp */
    public void m32700Jp(final String str, String str2, final boolean z, final String str3, final boolean z2) {
        final IWXAPI iwxapiCreateWXAPI = WXAPIFactory.createWXAPI(CoreModule.f17544b, null);
        iwxapiCreateWXAPI.registerApp(WXEntryActivity.APPID);
        if (!iwxapiCreateWXAPI.isWXAppInstalled()) {
            lsi0.m151595y("未检测到可分享平台");
            return;
        }
        if (TextUtils.isEmpty(str2) || !(str2.toLowerCase().startsWith("http") || str2.toLowerCase().startsWith("https"))) {
            m33007jm(iwxapiCreateWXAPI, str, "", z, str3, z2);
            return;
        }
        if (str.contains("&f=true")) {
            str2 = "https://auto.tancdn.com/v1/images/eyJpZCI6IktQQ0VDSlZVUkZQMzVPSlBWRVJCSUhVVjJFSk5BWDA4IiwidyI6NzAwLCJoIjo3MDAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoxNTk3MDY2OTU1MTc5NDg3ODI4Nn0";
        }
        qib0.f154691G.m184720i(str2, new e30() { // from class: l.ga8
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f101638a.m33007jm(iwxapiCreateWXAPI, str, z, str3, z2, (String) obj);
            }
        });
    }

    /* JADX INFO: renamed from: Ke */
    public void m32701Ke() {
        final List<Conversation> listQuery = CoreModule.f17553k.f91950m.query(Filter.AND(f19840c3, Conversation.UNREADMESSAGES.REQ(1)), Conversation.LATESTTIME.DESC, 500);
        if (vwb.m200296J(listQuery)) {
            return;
        }
        this.f72126Q.f19609U.m109085a(new d30() { // from class: l.wt7
            @Override // p149l.d30
            public final void call() {
                this.f188000a.m32871Yh(listQuery);
            }
        });
        m32938dq(qib0.f154693H.guessedCurrentServerTime());
    }

    /* JADX INFO: renamed from: Kf */
    public C22306c<roj0> m32702Kf(final String str) {
        return TextUtils.isEmpty(str) ? C22306c.just(roj0.f160388a) : this.f72126Q.now(C22306c.fromCallable(new Callable() { // from class: l.l68
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f126234a.m33068oi(str);
            }
        }).compose(C4728a.m31252T2()));
    }

    /* JADX INFO: renamed from: Kg */
    public C22306c<Boolean> m32703Kg(String str) {
        return CoreModule.f17553k.f91940c.m206074f0(str).m165620m().map(new w9j() { // from class: l.kw7
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return C4740g.m32185R9((List) obj);
            }
        });
    }

    /* JADX INFO: renamed from: Kh */
    public final /* synthetic */ roj0 m32704Kh(final String str, Act act, Envelope envelope) {
        if (vwb.m200296J(((CoreData) envelope.getModuleData(CoreData.class)).relationships)) {
            Relationship.new_();
        } else if (CoreModule.m29934N().mo60389so()) {
            final User userQuery = qib0.f154722k0.f176631d.query(str);
            final Relationship relationship = ((CoreData) envelope.getModuleData(CoreData.class)).relationships.get(0);
            userQuery.localRelationship = relationship;
            if (act == null) {
                e51.m114742G(new Runnable() { // from class: l.t68
                    @Override // java.lang.Runnable
                    public final void run() {
                        CoreModule.m29934N().processMomentLikeStatusChanged(relationship, userQuery, false, false);
                    }
                });
            } else {
                e51.m114741F(act, new Runnable() { // from class: l.u68
                    @Override // java.lang.Runnable
                    public final void run() {
                        CoreModule.m29934N().processMomentLikeStatusChanged(relationship, userQuery, false, false);
                    }
                });
            }
        }
        this.f72126Q.f19609U.m109085a(new d30() { // from class: l.v68
            @Override // p149l.d30
            public final void call() {
                this.f180165a.m32692Jh(str);
            }
        });
        if (ura.m195053e().m195057d().mo33942x()) {
            e51.m114743H(CoreModule.f17544b, new t38(this), 500L);
        }
        if (ura.m195053e().m195057d().mo33828g()) {
            ura.m195053e().m195057d().mo33842h6(str);
        }
        return roj0.f160388a;
    }

    /* JADX INFO: renamed from: Ki */
    public final /* synthetic */ roj0 m32705Ki(final Envelope envelope) {
        this.f72126Q.m31492w3(envelope, null);
        this.f19941h1.put(Long.valueOf(mqi0.m155944o()));
        this.f72126Q.f19609U.m109085a(new d30() { // from class: l.n48
            @Override // p149l.d30
            public final void call() {
                this.f137048a.m32693Ji(envelope);
            }
        });
        return roj0.f160388a;
    }

    /* JADX INFO: renamed from: Kj */
    public final /* synthetic */ Double m32706Kj(Double d2, Envelope envelope) {
        this.f72126Q.m31492w3(envelope, null);
        return d2;
    }

    /* JADX INFO: renamed from: Kk */
    public final /* synthetic */ roj0 m32707Kk(final ConversationPatchRecord conversationPatchRecord, Envelope envelope) {
        this.f72126Q.m31492w3(envelope, new d30() { // from class: l.c68
            @Override // p149l.d30
            public final void call() {
                CoreModule.f17553k.f91949l.delete(conversationPatchRecord.f56011id);
            }
        });
        return roj0.f160388a;
    }

    /* JADX INFO: renamed from: Kl */
    public final /* synthetic */ Data m32708Kl(String str, final Envelope envelope) {
        final ArrayList arrayList = new ArrayList();
        final ArrayList arrayList2 = new ArrayList();
        StringBuilder sb = null;
        if (!vwb.m200296J(((CoreData) envelope.getModuleData(CoreData.class)).conversations)) {
            for (Conversation conversation : ((CoreData) envelope.getModuleData(CoreData.class)).conversations) {
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
                        sb.append(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
                        sb.append(conversation.createdTime);
                        sb.append(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
                        sb.append((NullChecker.m81303a(conversation.status) && NullChecker.m81303a(conversation.status.toString())) ? conversation.status.toString() : "status_null");
                        sb.append(SignParameters.NEW_LINE);
                    }
                }
            }
        }
        if (NullChecker.m81303a(sb)) {
            du2.m113670a("conversations/" + str + "/refresh", sb.toString());
        }
        if (!vwb.m200296J(((CoreData) envelope.getModuleData(CoreData.class)).conversations)) {
            ((CoreData) envelope.getModuleData(CoreData.class)).conversations.removeAll(arrayList);
        }
        this.f72126Q.m31492w3(envelope, new d30() { // from class: l.px7
            @Override // p149l.d30
            public final void call() {
                this.f151643a.m32696Jl(arrayList, arrayList2, envelope);
            }
        });
        return envelope.data;
    }

    /* JADX INFO: renamed from: Km */
    public final /* synthetic */ C22306c m32709Km(Message message, boolean z, roj0 roj0Var) {
        return m32624Do(message.cid, message.f56011id, message, z ? "reported" : "ignored");
    }

    /* JADX INFO: renamed from: Kn */
    public C22306c<Message> m32710Kn(String str, String str2) {
        return m32722Ln(str, str2, false);
    }

    /* JADX INFO: renamed from: Ko */
    public void m32711Ko(final String str, final String str2) {
        this.f72126Q.now(new la20(new v9j() { // from class: l.du7
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4728a.f19494P.auth().m185898q(C4728a.m31200G("/official-accounts/" + str + "/menus/" + str2 + "/clicks")).m185893l(utc0.create(Network.JSON, "")).m185883b();
            }
        }).map(new w9j() { // from class: l.eu7
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return roj0.f160388a;
            }
        }).compose(C4728a.m31252T2()));
    }

    /* JADX INFO: renamed from: Kp */
    public final boolean m32712Kp(Conversation conversation) {
        return "lovebuzz".equals(conversation.convType) && NullChecker.m81303a(conversation.property) && "textBuzz".equals(conversation.property.intl_love_buzz.biz) && "passive".equals(conversation.property.intl_love_buzz.mode) && conversation.property.intl_love_buzz.expire - mqi0.m155944o() > this.f19904V;
    }

    /* JADX INFO: renamed from: Le */
    public C22306c<roj0> m32713Le(final String str, final String str2, final String str3, final d30 d30Var) {
        return this.f72126Q.scheduled("messageRecall", -1, new v9j() { // from class: l.r88
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f158157a.m32895ai(str, str2, str3, d30Var);
            }
        });
    }

    /* JADX INFO: renamed from: Lf */
    public C22306c<roj0> m32714Lf(final String str) {
        return TextUtils.isEmpty(str) ? C22306c.just(roj0.f160388a) : this.f72126Q.now(C22306c.fromCallable(new Callable() { // from class: l.w38
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f184314a.m33081pi(str);
            }
        }).compose(C4728a.m31252T2()));
    }

    /* JADX INFO: renamed from: Lg */
    public C22306c<Boolean> m32715Lg(String str) {
        return CoreModule.f17553k.f91940c.m206080l0(str).m165620m().map(new w9j() { // from class: l.v98
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(!vwb.m200296J((List) obj));
            }
        });
    }

    /* JADX INFO: renamed from: Lh */
    public final /* synthetic */ C22306c m32716Lh(final String str, final Act act) {
        Relationship relationship = new Relationship();
        relationship.state = RelationshipStatus.get("blocked");
        if (CoreModule.m29934N().mo60389so()) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(MatchFrom.get(MatchFrom.relationUnion));
            relationship.status = arrayList;
        }
        Conversation conversationM32856Xe = CoreModule.f17545c.f19642f0.m32856Xe(str);
        if (NullChecker.m81303a(conversationM32856Xe) && TextUtils.equals("kankan", conversationM32856Xe.convType)) {
            relationship.scene = "kankan";
        }
        return C4759y.m34904l3(str, relationship).map(new w9j() { // from class: l.u38
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f173580a.m32704Kh(str, act, (Envelope) obj);
            }
        }).compose(C4728a.m31252T2());
    }

    /* JADX INFO: renamed from: Li */
    public final /* synthetic */ C22306c m32717Li(final String str) {
        return ia20.m135121e(new v9j() { // from class: l.wz7
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4728a.f19494P.auth().m185898q(str).m185887f().m185883b();
            }
        }).map(new w9j() { // from class: l.xz7
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f195168a.m32705Ki((Envelope) obj);
            }
        }).compose(C4728a.m31252T2());
    }

    /* JADX INFO: renamed from: Lj */
    public final /* synthetic */ Message m32718Lj(Message message, Envelope envelope) {
        this.f72126Q.m31492w3(envelope, null);
        return message;
    }

    /* JADX INFO: renamed from: Lk */
    public final /* synthetic */ C22306c m32719Lk(final ConversationPatchRecord conversationPatchRecord, final ConversationPatchRecord conversationPatchRecord2) {
        return conversationPatchRecord2 != null ? new la20(new v9j() { // from class: l.s28
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4728a.f19494P.auth().m185898q(C4728a.m31176A(conversationPatchRecord.f56011id) + "&method=patch").m185893l(utc0.create(Network.JSON, conversationPatchRecord2.createConversation().toJson())).m185883b();
            }
        }).map(new w9j() { // from class: l.t28
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f167445a.m32707Kk(conversationPatchRecord, (Envelope) obj);
            }
        }) : C22306c.empty();
    }

    /* JADX INFO: renamed from: Ll */
    public final /* synthetic */ C22306c m32720Ll(final String str) {
        return new la20(new v9j() { // from class: l.mv7
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4728a.f19494P.auth().m185898q(C4728a.m31367x(str)).m185887f().m185883b();
            }
        }).map(new w9j() { // from class: l.nv7
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f140688a.m32708Kl(str, (Envelope) obj);
            }
        }).compose(C4728a.m31252T2());
    }

    /* JADX INFO: renamed from: Lm */
    public final /* synthetic */ C22306c m32721Lm(final Message message, final boolean z) {
        return C22306c.just(roj0.f160388a).observeOn(Schedulers.m221493io()).doOnNext(new e30() { // from class: l.o38
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f141628a.m32697Jm(message, z, (roj0) obj);
            }
        }).flatMap(new w9j() { // from class: l.p38
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f146966a.m32709Km(message, z, (roj0) obj);
            }
        });
    }

    /* JADX INFO: renamed from: Ln */
    public C22306c<Message> m32722Ln(String str, String str2, boolean z) {
        return m32746Nn(str, str2, z, false, null);
    }

    /* JADX INFO: renamed from: Lo */
    public C22306c<Sticker> m32723Lo(final List<Media> list, final String str) {
        return scheduled("sogou_gif", -1, new v9j() { // from class: l.z68
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                List list2 = list;
                return ia20.m135119c(new v9j() { // from class: l.m88
                    @Override // p149l.v9j, java.util.concurrent.Callable
                    public final Object call() {
                        return C4740g.m32528vd(list2);
                    }
                }, SogouGifEnvelope.JSON_ADAPTER).map(new w9j() { // from class: l.n88
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return C4740g.m32045Ec(list2, str, (SogouGifEnvelope) obj);
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: Lp */
    public boolean m32724Lp() {
        return this.f19857F1.get().booleanValue();
    }

    /* JADX INFO: renamed from: Me */
    public jl6 m32725Me() {
        return CoreModule.f17553k.f91950m;
    }

    /* JADX INFO: renamed from: Mf */
    public C22306c<roj0> m32726Mf(final String str) {
        return TextUtils.isEmpty(str) ? C22306c.just(roj0.f160388a) : this.f72126Q.now(C22306c.fromCallable(new Callable() { // from class: l.hb8
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f106910a.m33094qi(str);
            }
        }).compose(C4728a.m31252T2()));
    }

    /* JADX INFO: renamed from: Mg */
    public C22306c<Boolean> m32727Mg(String str) {
        return CoreModule.f17553k.f91940c.m206070b0(str).m165620m().map(new w9j() { // from class: l.mp7
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(!vwb.m200296J((List) obj));
            }
        });
    }

    /* JADX INFO: renamed from: Mi */
    public final /* synthetic */ q860 m32729Mi(Envelope envelope) {
        this.f72126Q.m31492w3(envelope, null);
        DbLinks dbLinksNew_ = DbLinks.new_();
        if (!TextUtils.isEmpty(envelope.pagination.links.next)) {
            dbLinksNew_.links.next = envelope.pagination.links.next;
        }
        return new q860(((CoreData) envelope.getModuleData(CoreData.class)).conversations, dbLinksNew_);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Mj */
    public final /* synthetic */ C22306c m32730Mj(final String str, j760 j760Var) {
        final Message message = (Message) j760Var.f116564a;
        final Double d2 = (Double) j760Var.f116565b;
        if (message != null) {
            return new la20(new v9j() { // from class: l.r98
                @Override // p149l.v9j, java.util.concurrent.Callable
                public final Object call() {
                    return C4728a.f19494P.auth().m185898q(C4728a.m31238Q0(str) + "&until=" + message.f56011id).m185885d().m185883b();
                }
            }).map(new w9j() { // from class: l.s98
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return this.f163154a.m32718Lj(message, (Envelope) obj);
                }
            }).map(new w9j() { // from class: l.t98
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return C4740g.m32137N5(d2, (Message) obj);
                }
            });
        }
        final Conversation conversation = new Conversation();
        conversation.f56011id = str;
        conversation.readUntil = "";
        return new la20(new v9j() { // from class: l.p98
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                Conversation conversation2 = conversation;
                return C4728a.f19494P.auth().m185898q(C4728a.m31176A(conversation2.f56011id) + "&method=patch").m185893l(utc0.create(Network.JSON, conversation2.toJson())).m185883b();
            }
        }).map(new w9j() { // from class: l.q98
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f153375a.m32706Kj(d2, (Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: Mk */
    public final /* synthetic */ void m32731Mk(roj0 roj0Var) {
        m32611Co();
    }

    /* JADX INFO: renamed from: Ml */
    public final /* synthetic */ void m32732Ml(Runnable runnable, boolean z, Envelope envelope) {
        List<CountdownItem> list = ((CoreData) envelope.getModuleData(CoreData.class)).countdownLikes;
        if (!vwb.m200296J(list)) {
            CountdownItem countdownItem = list.get(0);
            if (NullChecker.m81303a(countdownItem) && !TextUtils.isEmpty(countdownItem.otherUserId) && countdownItem.expire > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                this.f19868J0.put(countdownItem.otherUserId);
                long jLongValue = Double.valueOf(countdownItem.expire).longValue();
                this.f19865I0.put(Long.valueOf(jLongValue));
                m32601Ce("like sync");
                long jM79299A = RemoteConfig.m79298x().m79299A("countdownLikeDuration");
                if (jM79299A <= 0) {
                    jM79299A = 86400;
                }
                this.f19862H0.put(Long.valueOf(jLongValue - (jM79299A * 1000)));
                this.f19871K0.put(Boolean.valueOf(countdownItem.hidden));
            }
            if (NullChecker.m81303a(runnable)) {
                runnable.run();
            }
        }
        if (z) {
            this.f19859G0.put(Boolean.TRUE);
        }
    }

    /* JADX INFO: renamed from: Mm */
    public final /* synthetic */ roj0 m32733Mm(final String str) throws Exception {
        final ConversationPatchRecord conversationPatchRecordQuery = CoreModule.f17553k.f91949l.query(str);
        if (conversationPatchRecordQuery != null) {
            this.f72126Q.f19609U.m109085a(new d30() { // from class: l.f98
                @Override // p149l.d30
                public final void call() {
                    C4740g.m32117L7(conversationPatchRecordQuery, str);
                }
            });
        }
        return roj0.f160388a;
    }

    /* JADX INFO: renamed from: Mn */
    public C22306c<Message> m32734Mn(String str, String str2, boolean z, String str3) {
        return m32746Nn(str, str2, z, false, str3);
    }

    /* JADX INFO: renamed from: Mo */
    public Conversation m32735Mo(String str) {
        return CoreModule.f17553k.f91950m.query(str);
    }

    /* JADX INFO: renamed from: Mp */
    public final boolean m32736Mp(Conversation conversation, List<Message> list) {
        if (conversation == null || list == null) {
            return false;
        }
        if (!conversation.read.booleanValue()) {
            return true;
        }
        Message next = null;
        if (!vwb.m200296J(list)) {
            int size = list.size();
            Iterator<Message> it = list.iterator();
            int i = -1;
            while (it.hasNext()) {
                i++;
                try {
                    next = it.next();
                } catch (NoSuchElementException unused) {
                    CrashHelper.m81296c(new NoSuchElementException("ConversationItemView NoSuchElementException currentThread = " + Thread.currentThread().getName() + ",  userId = " + CoreModule.m29932K().me_().f56011id + ",  conversation = " + conversation.f56011id + ",  oldSize = " + size + ",  currentSize = " + list.size() + ",  index = " + i + ",  list = " + list.toString()));
                }
                if (TEnum.equals(next.status(), "normal")) {
                }
            }
            return false;
        }
        return NullChecker.m81303a(next) && !TextUtils.equals(conversation.readUntil, next.f56011id);
    }

    /* JADX INFO: renamed from: Ne */
    public C22306c<Conversation> m32737Ne(String str) {
        return CoreModule.f17553k.f91950m.uiGet(str).filter(new w9j() { // from class: l.kq7
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((Conversation) obj) != null);
            }
        });
    }

    /* JADX INFO: renamed from: Nf */
    public void m32738Nf(String str) {
        Conversation conversationQuery = CoreModule.f17553k.f91950m.query(str);
        if (conversationQuery == null) {
            return;
        }
        List<Message> listQuery = CoreModule.f17553k.f91940c.query(Filter.AND(Message.CID.mo60175EQ(str), Message.MESSAGETYPE.m60176EQ(MessageType.local_break_ice)), Message.CREATEDTIME.ASC, 0);
        if (!vwb.m200296J(listQuery)) {
            Iterator<Message> it = listQuery.iterator();
            while (it.hasNext()) {
                CoreModule.f17553k.f91940c.delete(it.next().f56011id);
            }
        }
        conversationQuery.hasLocalBreakIce = false;
        CoreModule.f17553k.f91950m.upsert(conversationQuery);
    }

    /* JADX INFO: renamed from: Ng */
    public C22306c<List<Conversation>> m32739Ng() {
        return CoreModule.f17553k.f91950m.f118450C.m165620m();
    }

    /* JADX INFO: renamed from: Nh */
    public final /* synthetic */ roj0 m32740Nh(final String str) throws Exception {
        this.f72126Q.f19609U.m109085a(new d30() { // from class: l.o78
            @Override // p149l.d30
            public final void call() {
                this.f142472a.m32728Mh(str);
            }
        });
        return roj0.f160388a;
    }

    /* JADX INFO: renamed from: Ni */
    public final /* synthetic */ C22306c m32741Ni(final String str) {
        return ia20.m135121e(new v9j() { // from class: l.f28
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4728a.f19494P.auth().m185898q(str).m185887f().m185883b();
            }
        }).map(new w9j() { // from class: l.g28
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f100243a.m32729Mi((Envelope) obj);
            }
        }).compose(C4728a.m31252T2());
    }

    /* JADX INFO: renamed from: Nj */
    public final /* synthetic */ void m32742Nj(String str) {
        DbLinks dbLinksM32747No = m32747No(str);
        if (NullChecker.m81303a(dbLinksM32747No)) {
            dbLinksM32747No.links.next = null;
            CoreModule.f17553k.f91941d.upsert(dbLinksM32747No);
        }
        CoreModule.f17553k.f91940c.m206050H(str, Double.MAX_VALUE);
        m32818To(str, true, str);
    }

    /* JADX INFO: renamed from: Nk */
    public final /* synthetic */ void m32743Nk(ConversationPatchRecord conversationPatchRecord, Throwable th) {
        StringBuilder sb = new StringBuilder("recordid:");
        sb.append(conversationPatchRecord.f56011id);
        sb.append(" errorMessage:");
        sb.append(NullChecker.m81303a(th.getMessage()) ? th.getMessage() : "");
        du2.m113670a("ConversationPatchDelete", sb.toString());
        m32663Go(th, conversationPatchRecord.f56011id);
        m33179wq(conversationPatchRecord.f56011id);
    }

    /* JADX INFO: renamed from: Nl */
    public final /* synthetic */ void m32744Nl(Envelope envelope) {
        ChatProfile chatProfileNew_;
        if (!vwb.m200296J(((CoreData) envelope.getModuleData(CoreData.class)).chatProfiles)) {
            Iterator<ChatProfile> it = ((CoreData) envelope.getModuleData(CoreData.class)).chatProfiles.iterator();
            do {
                if (!it.hasNext()) {
                    chatProfileNew_ = null;
                    break;
                }
                chatProfileNew_ = it.next();
            } while (!TextUtils.equals(chatProfileNew_.userId, CoreModule.m29931H().userId()));
        } else {
            chatProfileNew_ = null;
            break;
        }
        if (chatProfileNew_ == null) {
            chatProfileNew_ = ChatProfile.new_();
        }
        this.f19844B0.m132487l(chatProfileNew_);
        boolean zM200296J = vwb.m200296J(((CoreData) envelope.getModuleData(CoreData.class)).systemQuestions);
        C22392a<List<IceBreakingQuestion>> c22392a = this.f19847C0;
        if (zM200296J) {
            c22392a.m132487l(Collections.EMPTY_LIST);
        } else {
            c22392a.m132487l(((CoreData) envelope.getModuleData(CoreData.class)).systemQuestions);
        }
    }

    /* JADX INFO: renamed from: Nm */
    public final /* synthetic */ C22306c m32745Nm(final String str) {
        return C22306c.fromCallable(new Callable() { // from class: l.m68
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f131448a.m32733Mm(str);
            }
        }).compose(C4728a.m31252T2());
    }

    /* JADX INFO: renamed from: Nn */
    public C22306c<Message> m32746Nn(final String str, final String str2, final boolean z, final boolean z2, final String str3) {
        return this.f72126Q.scheduled("messageRefresh", -1, new v9j() { // from class: l.bt7
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f77185a.m33148uk(str, str2, z, str3, z2);
            }
        });
    }

    /* JADX INFO: renamed from: No */
    public DbLinks m32747No(String str) {
        return (DbLinks) CoreModule.f17553k.f91941d.query(str);
    }

    /* JADX INFO: renamed from: Np */
    public void m32748Np(boolean z) {
        this.f19898T = Boolean.valueOf(z);
    }

    /* JADX INFO: renamed from: Oe */
    public final C22306c<q860<Conversation>> m32749Oe(orh0<Conversation>.C19008a c19008a) {
        return mkd0.m154984r(c19008a.m165620m(), qib0.f154722k0.f176630c.uiGet(SchemeKey.conversations), new x9j() { // from class: l.fa8
            @Override // p149l.x9j
            public final Object call(Object obj, Object obj2) {
                return this.f96574a.m32832Ve((List) obj, (DbLinks) obj2);
            }
        });
    }

    /* JADX INFO: renamed from: Of */
    public C22306c<roj0> m32750Of(final String str) {
        return this.f72126Q.now(C22306c.fromCallable(new Callable() { // from class: l.ea8
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f90177a.m33107ri(str);
            }
        }).compose(C4728a.m31252T2()));
    }

    /* JADX INFO: renamed from: Og */
    public final boolean m32751Og(String str, String str2, boolean z, int i) {
        if (!z) {
            return false;
        }
        Message messageNew_ = Message.new_();
        messageNew_.messageType = MessageType.get(MessageType.local_normal_tips);
        messageNew_.cid = str;
        messageNew_.value = str2;
        messageNew_.localInConversation = true;
        long jM155944o = mqi0.m155944o();
        messageNew_.owner = CoreModule.m29931H().userId();
        messageNew_.createdTime = jM155944o;
        messageNew_.localCreatedTime = jM155944o;
        messageNew_.recalled = Boolean.FALSE;
        messageNew_.hostId = CoreModule.m29931H().userId();
        tpd0 tpd0Var = App.f15373i;
        messageNew_.localCreatedSession = tpd0Var.get().intValue();
        messageNew_.msgData = String.valueOf(i);
        messageNew_.f56011id = DbObject.GENERATE_UNIQUE_FAKE_ID(tpd0Var.get().intValue());
        CoreModule.f17545c.f19642f0.m32882Zg(messageNew_);
        return false;
    }

    /* JADX INFO: renamed from: Oh */
    public final /* synthetic */ C22306c m32752Oh(final String str) {
        return C22306c.fromCallable(new Callable() { // from class: l.k38
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f120799a.m32740Nh(str);
            }
        }).compose(C4728a.m31252T2());
    }

    /* JADX INFO: renamed from: Oi */
    public final /* synthetic */ q860 m32753Oi(Envelope envelope) {
        this.f72126Q.m31492w3(envelope, null);
        DbLinks dbLinksNew_ = DbLinks.new_();
        if (!TextUtils.isEmpty(envelope.pagination.links.next)) {
            dbLinksNew_.links.next = envelope.pagination.links.next;
        }
        return new q860(((CoreData) envelope.getModuleData(CoreData.class)).conversations, dbLinksNew_);
    }

    /* JADX INFO: renamed from: Oj */
    public final /* synthetic */ roj0 m32754Oj(final String str, Double d2) {
        this.f72126Q.f19609U.m109085a(new d30() { // from class: l.m98
            @Override // p149l.d30
            public final void call() {
                this.f132682a.m32742Nj(str);
            }
        });
        return roj0.f160388a;
    }

    /* JADX INFO: renamed from: Ok */
    public final /* synthetic */ C22306c m32755Ok(final ConversationPatchRecord conversationPatchRecord) {
        return C22306c.fromCallable(new Callable() { // from class: l.cz7
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f83064a.m32695Jk(conversationPatchRecord);
            }
        }).flatMap(new w9j() { // from class: l.dz7
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f88457a.m32719Lk(conversationPatchRecord, (ConversationPatchRecord) obj);
            }
        }).compose(C4728a.m31252T2()).doOnNext(new e30() { // from class: l.fz7
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f99937a.m32731Mk((roj0) obj);
            }
        }).doOnError(new e30() { // from class: l.gz7
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f105108a.m32743Nk(conversationPatchRecord, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: renamed from: Ol */
    public final /* synthetic */ C22306c m32756Ol() {
        return ia20.m135117a(new v9j() { // from class: l.o08
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4728a.f19494P.auth().m185898q(C4728a.m31213J0("/chat-profiles")).m185883b();
            }
        }).doOnNext(new e30() { // from class: l.p08
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f146563a.m32744Nl((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: Om */
    public final /* synthetic */ void m32757Om(final String str) {
        this.f72126Q.f19609U.m109085a(new d30() { // from class: l.pu7
            @Override // p149l.d30
            public final void call() {
                C4740g.m32461pc(str);
            }
        });
    }

    /* JADX INFO: renamed from: On */
    public C22306c<roj0> m32758On(final String str, final String str2) {
        return this.f72126Q.scheduled("messageRefreshOnlyFeed" + str + str2, -1, new v9j() { // from class: l.l18
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f125619a.m33173wk(str, str2);
            }
        });
    }

    /* JADX INFO: renamed from: Oo */
    public Message m32759Oo(String str) {
        return CoreModule.f17553k.f91940c.queryCache(str);
    }

    /* JADX INFO: renamed from: Op */
    public C22306c<roj0> m32760Op(final String str) {
        return this.f72126Q.scheduled("conversation_recover_deleted", 0, new v9j() { // from class: l.jx7
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f120201a.m33124sm(str);
            }
        });
    }

    /* JADX INFO: renamed from: Pe */
    public C22306c<Integer> m32761Pe(String str) {
        return mkd0.m154984r(CoreModule.f17553k.f91940c.m206075g0(str).m165620m(), CoreModule.f17553k.f91940c.m206069a0(str).m165620m(), new x9j() { // from class: l.z88
            @Override // p149l.x9j
            public final Object call(Object obj, Object obj2) {
                return Integer.valueOf(((List) obj).size() + ((List) obj2).size());
            }
        }).throttleWithTimeout(300L, TimeUnit.MILLISECONDS);
    }

    /* JADX INFO: renamed from: Pf */
    public void m32762Pf(final String str, final String str2) {
        e51.m114774y(new Runnable() { // from class: l.jp7
            @Override // java.lang.Runnable
            public final void run() {
                this.f119130a.m33120si(str, str2);
            }
        });
    }

    /* JADX INFO: renamed from: Pg */
    public void m32763Pg(final double d2) {
        e51.m114774y(new Runnable() { // from class: l.uw7
            @Override // java.lang.Runnable
            public final void run() {
                this.f178626a.m32800Si(d2);
            }
        });
    }

    /* JADX INFO: renamed from: Ph */
    public final /* synthetic */ xaj0 m32764Ph(Boolean bool) {
        jl6 jl6Var = CoreModule.f17553k.f91950m;
        StringColumn<Conversation> stringColumn = Conversation.CONVTYPE;
        int iCount = jl6Var.count(stringColumn.mo60175EQ("default"), -1);
        CounterVerification counterVerification = new CounterVerification();
        counterVerification.total = iCount;
        counterVerification.lastVerifyTime = this.f72126Q.f19639e0.f149501x1.get().longValue();
        List<Conversation> listQuery = CoreModule.f17553k.f91950m.query(stringColumn.mo60175EQ("default"), Conversation.UPDATEDTIME.DESC, 1);
        if (!vwb.m200296J(listQuery)) {
            counterVerification.latestUpdatedTime = listQuery.get(0).updatedTime;
        }
        final CoreData coreData = new CoreData();
        coreData.counterVerification = counterVerification;
        return xaj0.m207578a(new la20(new v9j() { // from class: l.sy7
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4728a.f19494P.auth().m185898q(C4728a.m31213J0("/counter-verifications")).m185893l(utc0.create(Network.JSON, coreData.toJson())).m185883b();
            }
        }).toBlocking().m212771c(null), Integer.valueOf(iCount), Double.valueOf(counterVerification.latestUpdatedTime));
    }

    /* JADX INFO: renamed from: Pi */
    public final /* synthetic */ C22306c m32765Pi(final String str) {
        return ia20.m135121e(new v9j() { // from class: l.x08
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4728a.f19494P.auth().m185898q(str).m185887f().m185883b();
            }
        }).map(new w9j() { // from class: l.y08
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f195280a.m32753Oi((Envelope) obj);
            }
        }).compose(C4728a.m31252T2());
    }

    /* JADX INFO: renamed from: Pj */
    public final /* synthetic */ C22306c m32766Pj(final String str) {
        return C22306c.fromCallable(new Callable() { // from class: l.z78
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C4740g.m32533w7(str);
            }
        }).flatMap(new w9j() { // from class: l.a88
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f68003a.m32730Mj(str, (j760) obj);
            }
        }).map(new w9j() { // from class: l.b88
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f74073a.m32754Oj(str, (Double) obj);
            }
        }).compose(C4728a.m31252T2());
    }

    /* JADX INFO: renamed from: Pk */
    public final /* synthetic */ roj0 m32767Pk(Message message, Envelope envelope) {
        if (!vwb.m200296J(((CoreData) envelope.getModuleData(CoreData.class)).messages) && TextUtils.equals(((CoreData) envelope.getModuleData(CoreData.class)).messages.get(0).f56011id, message.f56011id)) {
            ((CoreData) envelope.getModuleData(CoreData.class)).messages.get(0).cid = message.cid;
        }
        this.f72126Q.m31492w3(envelope, null);
        return roj0.f160388a;
    }

    /* JADX INFO: renamed from: Pl */
    public final /* synthetic */ roj0 m32768Pl(Envelope envelope) {
        this.f72126Q.m31492w3(envelope, null);
        return roj0.f160388a;
    }

    /* JADX INFO: renamed from: Pm */
    public final /* synthetic */ void m32769Pm(long j, String str) {
        if (j != 0) {
            Message messageQuery = CoreModule.f17553k.f91940c.query(j);
            messageQuery.localCreatedSession = -App.f15373i.get().intValue();
            messageQuery.localNotificationStatus = NotificationStatus.get("pending");
            CoreModule.f17553k.f91940c.updateBy_id(messageQuery);
            this.f72126Q.f19639e0.m169455X6(str, "default", ConversationStatus.get("blocked"));
        }
    }

    /* JADX INFO: renamed from: Pn */
    public C22306c<List<Message>> m32770Pn() {
        return CoreModule.f17553k.f91940c.f188535n.m165620m();
    }

    /* JADX INFO: renamed from: Po */
    public C22306c<roj0> m32771Po(final String str, final boolean z) {
        return this.f72126Q.scheduled("quickReplyLoveLetter" + str, -1, new v9j() { // from class: l.c18
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return ia20.m135118b(new v9j() { // from class: l.m38
                    @Override // p149l.v9j, java.util.concurrent.Callable
                    public final Object call() {
                        return C4740g.m32128M7(str, z);
                    }
                }, 0).map(new w9j() { // from class: l.n38
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return roj0.f160388a;
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: Pp */
    public C22306c<String> m32772Pp() {
        return this.f19876L2;
    }

    /* JADX INFO: renamed from: Qe */
    public C22306c<ConversationCounter> m32773Qe() {
        return this.f19987w2.asObservable();
    }

    /* JADX INFO: renamed from: Qf */
    public void m32774Qf(final String str, final List<String> list) {
        if (TextUtils.isEmpty(str) || vwb.m200296J(list)) {
            return;
        }
        e51.m114774y(new Runnable() { // from class: l.kr7
            @Override // java.lang.Runnable
            public final void run() {
                this.f124325a.m33133ti(str, list);
            }
        });
    }

    /* JADX INFO: renamed from: Qg */
    public void m32775Qg(final String str, final double d2, final int i, final int i2) {
        e51.m114774y(new Runnable() { // from class: l.j18
            @Override // java.lang.Runnable
            public final void run() {
                this.f115769a.m32824Ui(i2, str, i, d2);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Qh */
    public final /* synthetic */ void m32776Qh(xaj0 xaj0Var) {
        Envelope envelope = (Envelope) xaj0Var.f191751a;
        if (((CoreData) envelope.getModuleData(CoreData.class)).counterVerification.nextVerifyTime > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            this.f72126Q.f19639e0.f149494w1.put(Long.valueOf((long) ((CoreData) envelope.getModuleData(CoreData.class)).counterVerification.nextVerifyTime));
        }
        this.f72126Q.f19639e0.f149501x1.put(Long.valueOf(mqi0.m155944o()));
        if (((CoreData) envelope.getModuleData(CoreData.class)).counterVerification.needSync) {
            CrashHelper.m81296c(new Exception("Conversation Counter Error userId: " + CoreModule.m29931H().userId() + "\nlocalCounter: " + xaj0Var.f191752b + "\nremoteCounter: " + ((CoreData) envelope.getModuleData(CoreData.class)).counterVerification.total + "\ncheckTime: " + xaj0Var.f191753c));
        }
    }

    /* JADX INFO: renamed from: Qi */
    public final /* synthetic */ List m32777Qi(Envelope envelope) {
        this.f72126Q.m31492w3(envelope, null);
        List<User> list = ((CommonData) envelope.getModuleData(CommonData.class)).users;
        if (!vwb.m200296J(list)) {
            this.f19901U.setLength(0);
            for (User user : list) {
                StringBuilder sb = this.f19901U;
                if (user == null) {
                    sb.append("null");
                } else {
                    sb.append(user.f56011id);
                }
                this.f19901U.append(com.clevertap.android.sdk.Constants.SEPARATOR_COMMA);
            }
        }
        return ((CoreData) envelope.getModuleData(CoreData.class)).friends;
    }

    /* JADX INFO: renamed from: Qj */
    public final /* synthetic */ void m32778Qj(long j) {
        DbLinks dbLinksMo60301Oj;
        Message messageQuery = CoreModule.f17553k.f91940c.query(j);
        if (messageQuery.moment != null && (dbLinksMo60301Oj = CoreModule.m29934N().mo60301Oj(messageQuery.moment)) != null) {
            dbLinksMo60301Oj.total--;
            CoreModule.m29934N().mo60350f6(dbLinksMo60301Oj);
        }
        CoreModule.f17553k.f91940c.delete(j);
        m32806So(messageQuery.cid, false);
    }

    /* JADX INFO: renamed from: Qk */
    public final /* synthetic */ C22306c m32779Qk(final Message message) {
        return new la20((v9j<stc0>) new v9j() { // from class: l.m78
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                Message message2 = message;
                return C4728a.f19494P.auth().m185898q(C4728a.m31242R0(message2.cid, message2.f56011id) + "&method=patch&action=updateLikeStatus").m185893l(utc0.create(Network.JSON, message2.toJson())).m185883b();
            }
        }, 0).map(new w9j() { // from class: l.n78
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f137488a.m32767Pk(message, (Envelope) obj);
            }
        }).compose(C4728a.m31252T2());
    }

    /* JADX INFO: renamed from: Ql */
    public final /* synthetic */ C22306c m32780Ql(final String str) {
        return new la20(new v9j() { // from class: l.p68
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4728a.f19494P.auth().m185898q(C4728a.m31238Q0(str) + "&limit=10").m185887f().m185883b();
            }
        }).map(new w9j() { // from class: l.q68
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f152857a.m32768Pl((Envelope) obj);
            }
        }).compose(C4728a.m31252T2());
    }

    /* JADX INFO: renamed from: Qm */
    public final /* synthetic */ void m32781Qm(Conversation conversation) {
        if (ura.m195053e().m195057d().mo33727Nd(conversation)) {
            return;
        }
        this.f72126Q.f19639e0.m169455X6(conversation.otherUser, conversation.convType, conversation.status);
    }

    /* JADX INFO: renamed from: Qn */
    public int m32782Qn(String str) {
        return CoreModule.f17553k.f91940c.m206090v0(str);
    }

    /* JADX INFO: renamed from: Qo */
    public final Conversation m32783Qo(Message message) {
        Conversation conversationNew_ = Conversation.new_();
        conversationNew_.f56011id = message.cid;
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
    public void m32784Qp() {
        if (!ura.m195053e().m195057d().mo33764Vb()) {
            this.f19988x0 = !this.f19988x0;
        } else {
            hpd0 hpd0Var = this.f19991y0;
            hpd0Var.put(Boolean.valueOf(!hpd0Var.get().booleanValue()));
        }
    }

    /* JADX INFO: renamed from: Re */
    public void m32785Re() {
        if (NullChecker.m81303a(this.f19987w2.m221515e())) {
            C22392a<ConversationCounter> c22392a = this.f19987w2;
            c22392a.m132487l(c22392a.m221515e());
        }
    }

    /* JADX INFO: renamed from: Rf */
    public C22306c<roj0> m32786Rf(final String str, final List<Message> list) {
        return this.f72126Q.scheduled("users/me/chat-profiles/patch", -1, new v9j() { // from class: l.e08
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f88550a.m33171wi(list, str);
            }
        });
    }

    /* JADX INFO: renamed from: Rg */
    public void m32787Rg(final List<InsertConversationUser> list) {
        e51.m114774y(new Runnable() { // from class: l.rv7
            @Override // java.lang.Runnable
            public final void run() {
                this.f161175a.m32848Wi(list);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Rh */
    public final /* synthetic */ Boolean m32788Rh(j760 j760Var) {
        return Boolean.valueOf(NullChecker.m81303a(j760Var) && NullChecker.m81303a(j760Var.f116564a) && (this.f19891Q2 || ((CounterVerification) j760Var.f116564a).needSync));
    }

    /* JADX INFO: renamed from: Ri */
    public final /* synthetic */ C22306c m32789Ri(final String str) {
        return new la20(new v9j() { // from class: l.x38
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4728a.f19494P.auth().m185898q(str).m185887f().m185883b();
            }
        }).map(new w9j() { // from class: l.y38
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f195776a.m32777Qi((Envelope) obj);
            }
        }).compose(C4728a.m31252T2());
    }

    /* JADX INFO: renamed from: Rj */
    public final /* synthetic */ roj0 m32790Rj(final long j) throws Exception {
        this.f72126Q.f19609U.m109085a(new d30() { // from class: l.s88
            @Override // p149l.d30
            public final void call() {
                this.f163018a.m32778Qj(j);
            }
        });
        return roj0.f160388a;
    }

    /* JADX INFO: renamed from: Rk */
    public final /* synthetic */ void m32791Rk(Envelope envelope) {
        this.f72126Q.m31492w3(envelope, null);
    }

    /* JADX INFO: renamed from: Rl */
    public final /* synthetic */ void m32792Rl(RunnableC4733c0.b bVar) {
        m32665He();
    }

    /* JADX INFO: renamed from: Rm */
    public final /* synthetic */ roj0 m32793Rm(Envelope envelope) {
        this.f72126Q.m31492w3(envelope, null);
        return roj0.f160388a;
    }

    /* JADX INFO: renamed from: Rn */
    public int m32794Rn(String str) {
        return CoreModule.f17553k.f91940c.m206092x0(str);
    }

    /* JADX INFO: renamed from: Rp */
    public final void m32795Rp(String str) {
        List<String> listM141985e1 = CoreModule.f17553k.f91950m.m141985e1();
        listM141985e1.size();
        final JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("conversationIds", new JSONArray((Collection) listM141985e1));
            jSONObject.put("statuses", new JSONArray(ConversationStatus.JSON_ADAPTER.ARRAY_ADAPTER().serialize(vwb.m200324f0(ConversationStatus.get("default"), ConversationStatus.get("blocked")))));
            jSONObject.put("latestUpdatedTime", str);
        } catch (Exception e) {
            CrashHelper.m81296c(e);
        }
        Envelope envelopeM212771c = ia20.m135117a(new v9j() { // from class: l.z38
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4728a.f19494P.auth().m185898q(C4728a.m31211I2("/conversation-diffs")).m185893l(utc0.create(Network.JSON, jSONObject.toString())).m185883b();
            }
        }).toBlocking().m212771c(null);
        if (!NullChecker.m81303a(envelopeM212771c) || TextUtils.isEmpty(((CoreData) envelopeM212771c.getModuleData(CoreData.class)).conversationDiff.syncUrl)) {
            return;
        }
        Links linksNew_ = Links.new_();
        linksNew_.next = Links.normalizeUrl(((CoreData) envelopeM212771c.getModuleData(CoreData.class)).conversationDiff.syncUrl);
        m32807Sp(linksNew_);
    }

    /* JADX INFO: renamed from: Se */
    public ConversationCounter m32796Se() {
        return this.f19987w2.m221515e();
    }

    /* JADX INFO: renamed from: Sf */
    public void m32797Sf() {
        e51.m114774y(new Runnable() { // from class: l.p28
            @Override // java.lang.Runnable
            public final void run() {
                this.f146819a.m33183xi();
            }
        });
    }

    /* JADX INFO: renamed from: Sg */
    public void m32798Sg(String str, double d2) {
        m32965gh(m33078pf(str, MessageType.get(MessageType.local_intl_read_receipts_guide), ""), true, d2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Sh */
    public final /* synthetic */ void m32799Sh(j760 j760Var) {
        if (this.f19891Q2) {
            this.f72126Q.f19609U.m109085a(new d30() { // from class: l.z08
                @Override // p149l.d30
                public final void call() {
                    C4740g.m32441o3();
                }
            });
            m32795Rp((String) j760Var.f116565b);
            this.f19891Q2 = false;
        } else if (!((CounterVerification) j760Var.f116564a).syncAll) {
            m32795Rp((String) j760Var.f116565b);
        } else {
            this.f72126Q.f19609U.m109085a(new d30() { // from class: l.a18
                @Override // p149l.d30
                public final void call() {
                    C4740g.m32542x4();
                }
            });
            m32650Fo();
        }
    }

    /* JADX INFO: renamed from: Si */
    public final /* synthetic */ void m32800Si(double d2) {
        this.f72126Q.f19609U.m109085a(new b(d2));
    }

    /* JADX INFO: renamed from: Sj */
    public final /* synthetic */ roj0 m32801Sj(final String str) throws Exception {
        this.f72126Q.f19609U.m109085a(new d30() { // from class: l.j08
            @Override // p149l.d30
            public final void call() {
                C4740g.m32425m9(str);
            }
        });
        return roj0.f160388a;
    }

    /* JADX INFO: renamed from: Sk */
    public final /* synthetic */ j760 m32802Sk(String str, Envelope envelope) {
        return new j760(envelope.meta, !vwb.m200296J(((CoreData) envelope.getModuleData(CoreData.class)).conversations) ? ((CoreData) envelope.getModuleData(CoreData.class)).conversations.get(0) : this.f72126Q.f19642f0.m32735Mo(str));
    }

    /* JADX INFO: renamed from: Sl */
    public final /* synthetic */ void m32803Sl() {
        if (NullChecker.m81303a(CoreModule.f17553k.f91950m.query("fake_conversation_fold_conversation"))) {
            this.f72126Q.f19609U.m109085a(new d30() { // from class: l.vs7
                @Override // p149l.d30
                public final void call() {
                    CoreModule.f17545c.f19642f0.m32628Ef("fake_conversation_fold_conversation");
                }
            });
        }
    }

    /* JADX INFO: renamed from: Sm */
    public final /* synthetic */ C22306c m32804Sm(final String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("isActor", true);
            jSONObject.put("type", "paid");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("compliment", jSONObject);
            final JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("additional", jSONObject2);
            return new la20(new v9j() { // from class: l.x68
                @Override // p149l.v9j, java.util.concurrent.Callable
                public final Object call() {
                    return C4728a.f19494P.auth().m185898q(C4728a.m31219K2(str)).m185893l(utc0.create(Network.JSON, jSONObject3.toString())).m185883b();
                }
            }).map(new w9j() { // from class: l.y68
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return this.f196526a.m32793Rm((Envelope) obj);
                }
            }).compose(C4728a.m31252T2());
        } catch (JSONException unused) {
            return C22306c.error(new RuntimeException("JSON构建失败"));
        }
    }

    /* JADX INFO: renamed from: Sn */
    public void m32805Sn(final List<String> list) {
        scheduled("messageUpdataCommonTipPat", 0, new v9j() { // from class: l.db8
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f85299a.m33198yk(list);
            }
        });
    }

    /* JADX INFO: renamed from: So */
    public final void m32806So(String str, boolean z) {
        boolean z2 = !CoreModule.f17553k.f91940c.m206065W(str).m165613f();
        Conversation conversationM32735Mo = m32735Mo(str);
        if (conversationM32735Mo != null) {
            conversationM32735Mo.localHasMessage = z2;
            if (z) {
                conversationM32735Mo.read = Boolean.TRUE;
            }
            CoreModule.f17553k.f91950m.upsert(conversationM32735Mo);
        }
    }

    /* JADX INFO: renamed from: Sp */
    public final void m32807Sp(Links links) {
        String str;
        if (links == null || (str = links.next) == null) {
            return;
        }
        final String strM31287d = C4728a.m31287d(str);
        final Envelope envelopeM212771c = ia20.m135117a(new v9j() { // from class: l.l58
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4728a.f19494P.auth().m185898q(strM31287d).m185887f().m185883b();
            }
        }).toBlocking().m212771c(null);
        if (NullChecker.m81303a(envelopeM212771c)) {
            this.f72126Q.m31492w3(envelopeM212771c, new d30() { // from class: l.m58
                @Override // p149l.d30
                public final void call() {
                    this.f131374a.m33137tm(envelopeM212771c);
                }
            });
            if (TextUtils.isEmpty(envelopeM212771c.pagination.links.next)) {
                return;
            }
            C22306c.timer(100L, TimeUnit.MILLISECONDS).subscribe(mkd0.m154956H(new e30() { // from class: l.n58
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f137195a.m33150um(envelopeM212771c, (Long) obj);
                }
            }, new e30() { // from class: l.p58
                @Override // p149l.e30
                public final void call(Object obj) {
                    CrashHelper.m81296c((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: Te */
    public C22306c<List<Conversation>> m32808Te() {
        return m32725Me().m141988h0(mqi0.m155944o()).m165620m();
    }

    /* JADX INFO: renamed from: Tf */
    public C22306c<roj0> m32809Tf(final String str) {
        return this.f72126Q.scheduled("conversation_delete_unmatch", -1, new v9j() { // from class: l.ly7
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f130496a.m32579Ai(str);
            }
        });
    }

    /* JADX INFO: renamed from: Tg */
    public void m32810Tg(final User user) {
        e51.m114774y(new Runnable() { // from class: l.gq7
            @Override // java.lang.Runnable
            public final void run() {
                this.f103888a.m32860Xi(user);
            }
        });
    }

    /* JADX INFO: renamed from: Th */
    public final /* synthetic */ void m32811Th(User user, Conversation conversation) {
        String str = "fake_id_filter_veification" + user.f56011id;
        CoreModule.f17553k.f91940c.delete(Filter.AND(Message.CID.mo60175EQ(user.f56011id), Message.f20441ID.mo60175EQ(str)));
        if (user.isPicVerificationVerified() || TEnum.equals(conversation.status, "deleted") || TEnum.equals(conversation.status, "dismissed") || !this.f72126Q.f19639e0.m169490g8() || user.isBanedOrInactivated()) {
            return;
        }
        Message messageM33065of = this.f72126Q.f19642f0.m33065of(user.f56011id, MessageType.get(MessageType.common_tip));
        messageM33065of.f56011id = str;
        messageM33065of.value = "你设置了只和认证用户聊天，他还未完成照片认证，你可以更改<a href = \"tantan://chat/receive_message_setting\">信息接收设置</a>";
        this.f72126Q.f19642f0.m32882Zg(messageM33065of);
    }

    /* JADX INFO: renamed from: Ti */
    public final /* synthetic */ void m32812Ti(int i, String str, int i2, double d2) {
        Conversation conversationQuery = CoreModule.f17553k.f91950m.query("fake_conversation_city_centre_enter");
        if (conversationQuery == null && i == 0) {
            return;
        }
        long jM155944o = mqi0.m155944o();
        if (conversationQuery == null) {
            conversationQuery = Conversation.new_();
            conversationQuery.f56011id = "fake_conversation_city_centre_enter";
            double d3 = jM155944o;
            conversationQuery.createdTime = d3;
            conversationQuery.latestTime = d3;
            conversationQuery.convType = "default";
            conversationQuery.localEverHasMessage = true;
            conversationQuery.localNotificationStatus = NotificationStatus.get("removed");
        }
        conversationQuery.otherUser = str;
        conversationQuery.unreadMessages = i2;
        if (i2 > 0) {
            conversationQuery.latestTime = d2;
        }
        CoreModule.f17545c.f19642f0.m33050mq(conversationQuery);
        this.f72126Q.f19650h2.f118820X.put(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: Tj */
    public final /* synthetic */ void m32813Tj(String str, Envelope envelope) {
        DbLinks dbLinksM32747No = m32747No(str);
        if (NullChecker.m81303a(dbLinksM32747No)) {
            dbLinksM32747No.links.next = envelope.pagination.links.next;
            CoreModule.f17553k.f91941d.upsert(dbLinksM32747No);
        }
        for (Message message : ((CoreData) envelope.getModuleData(CoreData.class)).messages) {
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
    public final /* synthetic */ void m32814Tk(Envelope envelope) {
        this.f72126Q.m31492w3(envelope, null);
    }

    /* JADX INFO: renamed from: Tl */
    public final /* synthetic */ Boolean m32815Tl(String str) {
        return Boolean.valueOf(NullChecker.m81303a(m32735Mo(str)));
    }

    /* JADX INFO: renamed from: Tm */
    public C22306c<List<Conversation>> m32816Tm() {
        return m32725Me().f118482v.m167769b().m165620m();
    }

    /* JADX INFO: renamed from: Tn */
    public C22306c<q860<Message>> m32817Tn(String str) {
        return m32829Un(str, -1.0d);
    }

    /* JADX INFO: renamed from: To */
    public final void m32818To(String str, boolean z, String str2) {
        boolean zM165613f = CoreModule.f17553k.f91940c.m206065W(str).m165613f();
        boolean z2 = !zM165613f;
        Conversation conversationM32735Mo = m32735Mo(str);
        if (conversationM32735Mo != null) {
            conversationM32735Mo.localHasMessage = z2;
            if (zM165613f) {
                conversationM32735Mo.unreadMessages = 0;
            }
            if (z) {
                conversationM32735Mo.read = Boolean.TRUE;
            }
            conversationM32735Mo.clearedUntil = str2;
            conversationM32735Mo.localSafetyReminderTime = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
            conversationM32735Mo.localSpoofingReminderTime = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
            CoreModule.f17553k.f91950m.upsert(conversationM32735Mo);
        }
    }

    /* JADX INFO: renamed from: Tp */
    public C22306c<List<Conversation>> m32819Tp() {
        return CoreModule.f17553k.f91950m.f118475o.m167769b().m165620m();
    }

    /* JADX INFO: renamed from: Ue */
    public C22306c<Conversation> m32820Ue(String str) {
        return CoreModule.f17553k.f91950m.uiGet(str);
    }

    /* JADX INFO: renamed from: Uf */
    public void m32821Uf() {
        n11.m157333f();
        Collection collectionM165617j = CoreModule.f17553k.f91950m.f118455H.m165617j();
        if (vwb.m200296J(collectionM165617j)) {
            return;
        }
        ArrayList arrayList = new ArrayList(collectionM165617j);
        for (int i = 0; i < arrayList.size(); i++) {
            Conversation conversation = (Conversation) arrayList.get(i);
            conversation.level = 0;
            CoreModule.f17553k.f91950m.upsert(conversation);
        }
    }

    /* JADX INFO: renamed from: Ug */
    public void m32822Ug(String str, String str2) {
        m32842Vo(str, m33038me(str, str2));
    }

    /* JADX INFO: renamed from: Uh */
    public final /* synthetic */ void m32823Uh(Envelope envelope) {
        this.f19889Q0 = false;
        this.f19874L0.put(1);
        m32650Fo();
    }

    /* JADX INFO: renamed from: Ui */
    public final /* synthetic */ void m32824Ui(final int i, final String str, final int i2, final double d2) {
        this.f72126Q.f19609U.m109085a(new d30() { // from class: l.j38
            @Override // p149l.d30
            public final void call() {
                this.f116012a.m32812Ti(i, str, i2, d2);
            }
        });
    }

    /* JADX INFO: renamed from: Uj */
    public final /* synthetic */ roj0 m32825Uj(final String str, final Envelope envelope) {
        CoreModule.f17545c.f19648h0.m196254m3(envelope);
        this.f72126Q.m31492w3(envelope, new d30() { // from class: l.k18
            @Override // p149l.d30
            public final void call() {
                this.f120544a.m32813Tj(str, envelope);
            }
        });
        return roj0.f160388a;
    }

    /* JADX INFO: renamed from: Uk */
    public final /* synthetic */ j760 m32826Uk(String str, Envelope envelope) {
        return new j760(envelope.meta, !vwb.m200296J(((CoreData) envelope.getModuleData(CoreData.class)).conversations) ? ((CoreData) envelope.getModuleData(CoreData.class)).conversations.get(0) : this.f72126Q.f19642f0.m32735Mo(str));
    }

    /* JADX INFO: renamed from: Ul */
    public final /* synthetic */ void m32827Ul(boolean z, String str) {
        m32628Ef(str);
        if (z) {
            if (TextUtils.equals(str, this.f72126Q.f19663m0.f19389Y0.get())) {
                this.f72126Q.f19663m0.f19389Y0.clear();
            }
            if (TextUtils.equals(str, this.f72126Q.f19663m0.f19392Z0.get())) {
                this.f72126Q.f19663m0.f19392Z0.clear();
            }
            if (TextUtils.equals(str, this.f72126Q.f19663m0.f19395a1.get())) {
                this.f72126Q.f19663m0.f19395a1.clear();
            }
        }
    }

    /* JADX INFO: renamed from: Um */
    public List<Message> m32828Um(String str) {
        return CoreModule.f17553k.f91940c.m206062T(str);
    }

    /* JADX INFO: renamed from: Un */
    public C22306c<q860<Message>> m32829Un(String str, double d2) {
        Conversation conversationM33216zp = m33216zp(str);
        double d3 = NullChecker.m81303a(conversationM33216zp) ? conversationM33216zp.clearedTime : 0.0d;
        if (TextUtils.equals(str, User.ID_TEAM_ACCOUNT) && d2 <= FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE && CoreModule.m29935P().m94651a().mo33450Yd()) {
            d2 = CoreModule.m29935P().m94651a().mo33540ls();
        }
        return d2 > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE ? m32841Vn(str, Message.CREATEDTIME.REQ(Double.valueOf(d2)), String.valueOf(d2), d3, false) : mkd0.m154984r(CoreModule.f17553k.f91940c.m206068Z(str, d3, false).m165620m(), CoreModule.f17553k.f91941d.uiGet(str), new x9j() { // from class: l.k98
            @Override // p149l.x9j
            public final Object call(Object obj, Object obj2) {
                return this.f121917a.m33211zk((List) obj, (DbLinks) obj2);
            }
        });
    }

    /* JADX INFO: renamed from: Uo */
    public List<Conversation> m32830Uo() {
        return CoreModule.f17553k.f91950m.m141993j1();
    }

    /* JADX INFO: renamed from: Up */
    public List<Message> m32831Up() {
        return CoreModule.f17553k.f91940c.m206091w0();
    }

    /* JADX INFO: renamed from: Ve */
    public final q860<Conversation> m32832Ve(List<Conversation> list, DbLinks dbLinks) {
        if (dbLinks == null) {
            m32650Fo();
        }
        return m99390Z2(list, dbLinks);
    }

    /* JADX INFO: renamed from: Vf */
    public void m32833Vf(final List<Conversation> list, final Set<String> set) {
        final JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        final HashSet hashSet = new HashSet();
        for (Conversation conversation : list) {
            jSONArray.put(conversation.f56011id);
            hashSet.add(conversation.f56011id);
        }
        try {
            jSONObject.put("ids", jSONArray);
            jSONObject.put("newLabelExposureTime", Converter.dateToApiTimeString(mqi0.m155944o()));
        } catch (JSONException unused) {
        }
        this.f72126Q.scheduled("newMatchNewTag" + jSONObject, -1, new v9j() { // from class: l.d78
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f84711a.m32605Ci(jSONObject, list, set, hashSet);
            }
        });
    }

    /* JADX INFO: renamed from: Vg */
    public void m32834Vg(String str) {
        m32882Zg(m33065of(str, MessageType.get(MessageType.local_birthday_tip)));
    }

    /* JADX INFO: renamed from: Vh */
    public final /* synthetic */ void m32835Vh(Throwable th) {
        this.f19874L0.put(-1);
    }

    /* JADX INFO: renamed from: Vi */
    public final /* synthetic */ void m32836Vi(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            InsertConversationUser insertConversationUser = (InsertConversationUser) it.next();
            Conversation conversationQuery = CoreModule.f17553k.f91950m.query(insertConversationUser.userId);
            if (conversationQuery == null) {
                Conversation conversationNew_ = Conversation.new_();
                String str = insertConversationUser.userId;
                conversationNew_.f56011id = str;
                conversationNew_.otherUser = str;
                conversationNew_.createdTime = insertConversationUser.timeStamp.longValue();
                conversationNew_.latestTime = insertConversationUser.timeStamp.longValue();
                conversationNew_.convType = ConversationType.intlSeeChatRequest;
                conversationNew_.localEverHasMessage = true;
                m33050mq(conversationNew_);
            } else if (TextUtils.equals(conversationQuery.convType, ConversationType.intlSeeChatRequest)) {
                String str2 = insertConversationUser.userId;
                conversationQuery.f56011id = str2;
                conversationQuery.otherUser = str2;
                conversationQuery.createdTime = insertConversationUser.timeStamp.longValue();
                conversationQuery.latestTime = insertConversationUser.timeStamp.longValue();
                conversationQuery.convType = ConversationType.intlSeeChatRequest;
                conversationQuery.localEverHasMessage = true;
                m33050mq(conversationQuery);
            }
        }
    }

    /* JADX INFO: renamed from: Vj */
    public final /* synthetic */ C22306c m32837Vj(final String str, final String str2) {
        return new la20(new v9j() { // from class: l.yt7
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4728a.f19494P.auth().m185898q(C4728a.m31235P0(str, str2)).m185887f().m185883b();
            }
        }).map(new w9j() { // from class: l.zt7
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f204701a.m32825Uj(str, (Envelope) obj);
            }
        }).compose(C4728a.m31252T2());
    }

    /* JADX INFO: renamed from: Vk */
    public final /* synthetic */ void m32838Vk(Envelope envelope) {
        this.f72126Q.m31492w3(envelope, null);
    }

    /* JADX INFO: renamed from: Vl */
    public final /* synthetic */ void m32839Vl(List list, final boolean z) {
        vwb.m200354z(list, new e30() { // from class: l.yz7
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f200851a.m32827Ul(z, (String) obj);
            }
        });
    }

    /* JADX INFO: renamed from: Vm */
    public C22306c<List<Conversation>> m32840Vm() {
        return CoreModule.f17553k.f91950m.m142004p0().m165620m();
    }

    /* JADX INFO: renamed from: Vn */
    public final C22306c<q860<Message>> m32841Vn(String str, Filter<Message> filter, String str2, double d2, boolean z) {
        return mkd0.m154984r(CoreModule.f17553k.f91940c.m206066X(str, filter, str2, d2, z).m165620m(), CoreModule.f17553k.f91941d.uiGet(str), new x9j() { // from class: l.ix7
            @Override // p149l.x9j
            public final Object call(Object obj, Object obj2) {
                return this.f115333a.m32581Ak((List) obj, (DbLinks) obj2);
            }
        });
    }

    /* JADX INFO: renamed from: Vo */
    public final C22306c<roj0> m32842Vo(final String str, final Message message) {
        return this.f72126Q.now(C22306c.fromCallable(new Callable() { // from class: l.d58
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f84389a.m32608Cl(str, message);
            }
        }).compose(C4728a.m31252T2()));
    }

    /* JADX INFO: renamed from: Vp */
    public C22306c<roj0> m32843Vp(final NotificationStatus notificationStatus, final NotificationStatus notificationStatus2, final String str) {
        return this.f72126Q.now(C22306c.fromCallable(new Callable() { // from class: l.gs7
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f104150a.m33175wm(notificationStatus, notificationStatus2, str);
            }
        }).compose(C4728a.m31252T2()));
    }

    /* JADX INFO: renamed from: We */
    public C22306c<List<Message>> m32844We(String str) {
        return CoreModule.f17553k.f91940c.m206076h0(str).m165620m();
    }

    /* JADX INFO: renamed from: Wf */
    public C22306c<String> m32845Wf(final String str, final String str2, final String str3, final String str4, final Message message) {
        return scheduled("feedback/" + str + "/" + str2, -1, new v9j() { // from class: l.d08
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return ia20.m135121e(new v9j() { // from class: l.z28
                    @Override // p149l.v9j, java.util.concurrent.Callable
                    public final Object call() {
                        return C4740g.m32290ae(str, str, str, str);
                    }
                }).map(new w9j() { // from class: l.b38
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return C4740g.m32437na(message, (Envelope) obj);
                    }
                }).observeOn(jo0.m142408a());
            }
        });
    }

    /* JADX INFO: renamed from: Wg */
    public void m32846Wg(String str, double d2) {
        Message messageNew_ = Message.new_();
        messageNew_.cid = str;
        tpd0 tpd0Var = App.f15373i;
        messageNew_.f56011id = DbObject.GENERATE_UNIQUE_FAKE_ID(tpd0Var.get().intValue());
        messageNew_.messageType = MessageType.get(MessageType.local_blindbox_guide);
        messageNew_.localCreatedTime = mqi0.m155944o();
        messageNew_.createdTime = d2;
        messageNew_.localCreatedSession = tpd0Var.get().intValue();
        messageNew_.localInConversation = true;
        messageNew_.owner = CoreModule.m29931H().userId();
        messageNew_.recalled = Boolean.FALSE;
        messageNew_.value = "";
        m32894ah(messageNew_, false);
    }

    /* JADX INFO: renamed from: Wh */
    public final /* synthetic */ void m32847Wh(String str) {
        Conversation conversationM32735Mo = this.f72126Q.f19642f0.m32735Mo(str);
        if (NullChecker.m81303a(conversationM32735Mo)) {
            ConversationGame conversationGame = conversationM32735Mo.additional.game;
            if (NullChecker.m81303a(conversationGame)) {
                conversationGame.gameUnread = 0;
                conversationGame.gameText = "";
                this.f72126Q.f19642f0.m33050mq(conversationM32735Mo);
            }
        }
    }

    /* JADX INFO: renamed from: Wi */
    public final /* synthetic */ void m32848Wi(final List list) {
        this.f72126Q.f19609U.m109085a(new d30() { // from class: l.g18
            @Override // p149l.d30
            public final void call() {
                this.f100124a.m32836Vi(list);
            }
        });
    }

    /* JADX INFO: renamed from: Wj */
    public final /* synthetic */ void m32849Wj(String str, boolean z, boolean z2, Message message, Sticker sticker, CoreProviderInterface coreProviderInterface) {
        DbLinks dbLinksMo60301Oj;
        if (!CoreModule.m29931H().userId().equals(str) && z && m33182xh(str)) {
            Conversation conversationM32735Mo = m32735Mo(str);
            if (conversationM32735Mo == null && z2) {
                if (ura.m195053e().m195057d().mo33808c() && m32747No(str) == null) {
                    DbLinks dbLinks = new DbLinks();
                    dbLinks.f56011id = message.cid;
                    dbLinks.links = Links.new_();
                    CoreModule.f17553k.f91941d.upsert(dbLinks);
                }
                conversationM32735Mo = m32783Qo(message);
            }
            if (NullChecker.m81303a(conversationM32735Mo)) {
                conversationM32735Mo.latestTime = message.createdTime;
                conversationM32735Mo.localHasMessage = true;
                CoreModule.f17553k.f91950m.upsert(conversationM32735Mo);
            }
        }
        message.localCreatedSession = App.f15373i.get().intValue();
        message.localCreatedTime = System.nanoTime();
        if (message.moment != null && (dbLinksMo60301Oj = CoreModule.m29934N().mo60301Oj(message.moment)) != null) {
            dbLinksMo60301Oj.total++;
            CoreModule.m29934N().mo60350f6(dbLinksMo60301Oj);
        }
        if (sticker != null) {
            CoreModule.f17553k.f91944g.insert(sticker);
        }
        CoreModule.f17553k.f91940c.insert(message);
        if (coreProviderInterface.mo33847i()) {
            m32738Nf(str);
        }
        if (coreProviderInterface.mo33955ym()) {
            m32978hi(str);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Wk */
    public final /* synthetic */ C22306c m32850Wk(final boolean z, final String str, j760 j760Var) {
        final Message message = (Message) j760Var.f116564a;
        final Double d2 = (Double) j760Var.f116565b;
        return ia20.m135121e(new v9j() { // from class: l.u78
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4740g.m32298ba(z, message, str);
            }
        }).doOnNext(new e30() { // from class: l.v78
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f180314a.m32838Vk((Envelope) obj);
            }
        }).map(new w9j() { // from class: l.w78
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return C4740g.m32125M4(d2, (Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: Wl */
    public final /* synthetic */ void m32851Wl(List list, final boolean z) {
        final ArrayList arrayListM200339n = vwb.m200339n(list, new w9j() { // from class: l.cv7
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f82647a.m32815Tl((String) obj);
            }
        });
        if (arrayListM200339n.isEmpty()) {
            return;
        }
        this.f72126Q.f19609U.m109085a(new d30() { // from class: l.dv7
            @Override // p149l.d30
            public final void call() {
                this.f88040a.m32839Vl(arrayListM200339n, z);
            }
        });
    }

    /* JADX INFO: renamed from: Wm */
    public final C22306c<roj0> m32852Wm(DbLinks dbLinks) {
        return m32864Xm(dbLinks, true);
    }

    /* JADX INFO: renamed from: Wn */
    public C22306c<q860<Message>> m32853Wn(String str, String str2) {
        return mkd0.m154984r(CoreModule.f17553k.f91940c.m206067Y(str, str2).m165620m(), CoreModule.f17553k.f91941d.uiGet(str), new x9j() { // from class: l.lr7
            @Override // p149l.x9j
            public final Object call(Object obj, Object obj2) {
                return this.f129466a.m99390Z2((List) obj, (DbLinks) obj2);
            }
        });
    }

    /* JADX INFO: renamed from: Wo */
    public final C22306c<roj0> m32854Wo(final String str, final Message message) {
        return this.f72126Q.now(C22306c.fromCallable(new Callable() { // from class: l.sb8
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f163506a.m32634El(str, message);
            }
        }).compose(C4728a.m31252T2()));
    }

    /* JADX INFO: renamed from: Wp */
    public C22306c<roj0> m32855Wp(final NotificationStatus notificationStatus, final NotificationStatus notificationStatus2, final boolean z, final boolean z2) {
        return this.f72126Q.now(C22306c.fromCallable(new Callable() { // from class: l.jw7
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f120055a.m33163vm(z, notificationStatus, notificationStatus2, z2);
            }
        }).compose(C4728a.m31252T2()));
    }

    /* JADX INFO: renamed from: Xe */
    public Conversation m32856Xe(String str) {
        return CoreModule.f17553k.f91950m.queryCache(str);
    }

    /* JADX INFO: renamed from: Xf */
    public C22306c<List<UserLiveLabel>> m32857Xf(String str, String str2, String... strArr) {
        if (strArr == null || strArr.length == 0) {
            return C22306c.just(new ArrayList());
        }
        StringBuffer stringBuffer = new StringBuffer();
        if (strArr.length != 0) {
            stringBuffer.append(strArr[0]);
            for (int i = 1; i < strArr.length; i++) {
                stringBuffer.append(com.clevertap.android.sdk.Constants.SEPARATOR_COMMA);
                stringBuffer.append(strArr[i]);
            }
        }
        final JsonObject jsonObject = new JsonObject();
        try {
            jsonObject.addProperty("source", str2);
            jsonObject.addProperty("userIds", stringBuffer.toString());
        } catch (Exception unused) {
        }
        return this.f72126Q.scheduled("live-labels/" + str2 + "/" + str, 0, new v9j() { // from class: l.hs7
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return ia20.m135117a(new v9j() { // from class: l.t08
                    @Override // p149l.v9j, java.util.concurrent.Callable
                    public final Object call() {
                        return C4728a.f19494P.auth().m185898q(C4728a.m31200G("/live-labels")).m185893l(utc0.create(Network.JSON, jsonObject.toString())).m185883b();
                    }
                });
            }
        }).map(new w9j() { // from class: l.js7
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return C4740g.m32404ka((Envelope) obj);
            }
        }).flatMap(new na8()).filter(new w9j() { // from class: l.ks7
            @Override // p149l.w9j
            public final Object call(Object obj) {
                UserLiveLabel userLiveLabel = (UserLiveLabel) obj;
                return Boolean.valueOf((userLiveLabel.isLiveChat() && qib0.f154713b0.f139232c.mo67236Qc()) || (userLiveLabel.isVoiceChat() && qib0.f154713b0.f139232c.mo67254Zr()));
            }
        }).toList();
    }

    /* JADX INFO: renamed from: Xg */
    public void m32858Xg(String str, List<BreakIce> list) {
        if (vwb.m200296J(list)) {
            return;
        }
        m32854Wo(str, m33129te(str, list));
    }

    /* JADX INFO: renamed from: Xh */
    public final /* synthetic */ void m32859Xh(final String str) {
        this.f72126Q.f19609U.m109085a(new d30() { // from class: l.u18
            @Override // p149l.d30
            public final void call() {
                this.f172976a.m32847Wh(str);
            }
        });
    }

    /* JADX INFO: renamed from: Xi */
    public final /* synthetic */ void m32860Xi(User user) {
        final Message messageNew_ = Message.new_();
        messageNew_.messageType = MessageType.get("live_vip_greet");
        messageNew_.cid = ura.m195053e().m195057d().mo33840h();
        messageNew_.createdTime = mqi0.m155944o();
        messageNew_.value = ura.m195053e().m195057d().mo33963zt();
        messageNew_.owner = user == null ? CoreModule.m29931H().userId() : user.f56011id;
        messageNew_.f56011id = "fake_id_" + mqi0.m155943n();
        messageNew_.localInConversation = true;
        messageNew_.recalled = Boolean.FALSE;
        messageNew_.localNotificationStatus = NotificationStatus.get("removed");
        messageNew_.localCreatedSession = App.f15373i.get().intValue();
        this.f72126Q.f19609U.m109085a(new d30() { // from class: l.vw7
            @Override // p149l.d30
            public final void call() {
                CoreModule.f17553k.f91940c.insert(messageNew_);
            }
        });
    }

    /* JADX INFO: renamed from: Xj */
    public final /* synthetic */ Message m32861Xj(final Message message, final String str, final boolean z, final boolean z2, final Sticker sticker, final CoreProviderInterface coreProviderInterface) throws Exception {
        Picture picture;
        if (message._id != 0) {
            final Message messageMo223809clone = message.mo223809clone();
            messageMo223809clone.localCreatedSession = App.f15373i.get().intValue();
            this.f72126Q.f19609U.m109085a(new d30() { // from class: l.kv7
                @Override // p149l.d30
                public final void call() {
                    CoreModule.f17553k.f91940c.updateBy_id(messageMo223809clone);
                }
            });
            return messageMo223809clone;
        }
        Conversation conversationM32735Mo = m32735Mo(str);
        if (NullChecker.m81303a(conversationM32735Mo) && ura.m195053e().m195057d().mo33727Nd(conversationM32735Mo)) {
            message.api_only_otherUser = conversationM32735Mo.otherUser;
            message.channel = MessageChannel.get("group");
            message.hostId = conversationM32735Mo.otherUser;
        }
        List<T> listM165617j = CoreModule.f17553k.f91940c.m206065W(str).m165617j();
        message.createdTime = (vwb.m200296J(listM165617j) || listM165617j.size() <= 0) ? C4728a.m31263W2() : C4728a.m31267X2(((Message) listM165617j.get(0)).createdTime);
        message.owner = CoreModule.m29931H().userId();
        message.localInConversation = !User.isTeamAccount(str) || message.moment == null;
        message.localInMoment = message.moment != null;
        message.cid = str;
        message.recalled = Boolean.FALSE;
        message.localNotificationStatus = NotificationStatus.get("removed");
        message.f56011id = DbObject.GENERATE_UNIQUE_FAKE_ID(App.f15373i.get().intValue());
        if (message.value == null) {
            message.value = "";
        }
        List<Media> list = message.media;
        if (list != null && list.size() > 9) {
            message.media = message.media.subList(0, 9);
        }
        List<Media> list2 = message.media;
        if (list2 != null) {
            for (Media media : list2) {
                TrackMediaUploadUtil.m80296a0(media);
                if (TEnum.equals(media.status, "raw")) {
                    if (media instanceof Video) {
                        Video video = (Video) media;
                        if (video.size == null || (picture = video.cover) == null || picture.size == null || video.mediaType == null || picture.mediaType == null) {
                            s5l0 s5l0Var = new s5l0(new r5l0(rhi.m179382z(video.url)), false, false);
                            video.mediaType = DLNAProfiles.DLNAMimeTypes.MIME_VIDEO_MPEG_4;
                            video.size = new Dimension(s5l0Var.m182364m());
                            video.duration = s5l0Var.f162561b;
                            if (video.cover == null) {
                                Picture pictureNew_ = Picture.new_();
                                pictureNew_.size = new Dimension(1, 1);
                                video.cover = pictureNew_;
                            }
                            Picture picture2 = video.cover;
                            picture2.mediaType = DLNAProfiles.DLNAMimeTypes.MIME_IMAGE_JPEG;
                            picture2.size = new Dimension(s5l0Var.m182362k());
                            video.status = MediaLocalStatus.get("raw");
                        }
                        if (!TextUtils.isEmpty(video.url) && video.url.contains(k9j.m145077I().getAbsolutePath())) {
                            try {
                                String[] strArrM145082N = k9j.m145082N(video.url, video.cover().url, k9j.f122027c, message.f56011id, false);
                                video.url = strArrM145082N[0];
                                video.cover().url = strArrM145082N[1];
                            } catch (Exception e) {
                                CrashHelper.m81296c(e);
                            }
                        }
                    } else if (media instanceof Audio) {
                        media.status = MediaLocalStatus.get(MediaLocalStatus.preprocessed);
                    } else if (media instanceof Picture) {
                        Picture picture3 = (Picture) media;
                        if (picture3.size == null || media.mediaType == null) {
                            pgm pgmVar = new pgm(rhi.m179382z(media.url));
                            picture3.size = new Dimension(pgmVar.f148730d);
                            media.mediaType = pgmVar.f148729c;
                        }
                    }
                }
            }
        } else {
            message.media = new ArrayList();
        }
        this.f72126Q.f19609U.m109085a(new d30() { // from class: l.jv7
            @Override // p149l.d30
            public final void call() {
                this.f119882a.m32849Wj(str, z, z2, message, sticker, coreProviderInterface);
            }
        });
        return message;
    }

    /* JADX INFO: renamed from: Xk */
    public final /* synthetic */ void m32862Xk(String str) {
        DbLinks dbLinksM32747No = m32747No(str);
        if (NullChecker.m81303a(dbLinksM32747No)) {
            dbLinksM32747No.links.next = null;
            CoreModule.f17553k.f91941d.upsert(dbLinksM32747No);
        }
        CoreModule.f17553k.f91940c.m206050H(str, Double.MAX_VALUE);
    }

    /* JADX INFO: renamed from: Xl */
    public final /* synthetic */ roj0 m32863Xl(final MessageType messageType) throws Exception {
        this.f72126Q.f19609U.m109085a(new d30() { // from class: l.k08
            @Override // p149l.d30
            public final void call() {
                CoreModule.f17553k.f91940c.delete(Message.MESSAGETYPE.mo60175EQ((TEnum) messageType));
            }
        });
        return roj0.f160388a;
    }

    /* JADX INFO: renamed from: Xm */
    public final C22306c<roj0> m32864Xm(final DbLinks dbLinks, final boolean z) {
        return C22306c.fromCallable(new Callable() { // from class: l.k68
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f121268a.m32943ej(dbLinks, z);
            }
        });
    }

    /* JADX INFO: renamed from: Xn */
    public C22306c<q860<Message>> m32865Xn(String str) {
        return mkd0.m154984r(CoreModule.f17553k.f91940c.m206079k0(str).m165620m(), CoreModule.f17553k.f91941d.uiGet(str), new x9j() { // from class: l.bb8
            @Override // p149l.x9j
            public final Object call(Object obj, Object obj2) {
                return this.f74786a.m32594Bk((List) obj, (DbLinks) obj2);
            }
        });
    }

    /* JADX INFO: renamed from: Xo */
    public C22306c<List<Message>> m32866Xo() {
        return CoreModule.f17553k.f91940c.f188534m.m165620m();
    }

    /* JADX INFO: renamed from: Xp */
    public C22306c<roj0> m32867Xp(final NotificationStatus notificationStatus, final NotificationStatus notificationStatus2, final String str) {
        return this.f72126Q.now(C22306c.fromCallable(new Callable() { // from class: l.h78
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f106200a.m33187xm(notificationStatus, notificationStatus2, str);
            }
        }).compose(C4728a.m31252T2()));
    }

    /* JADX INFO: renamed from: Ye */
    public C22306c<q860<Conversation>> m32868Ye() {
        return m32749Oe(CoreModule.f17553k.f91950m.f118451D);
    }

    /* JADX INFO: renamed from: Yf */
    public void m32869Yf(mcr mcrVar) {
        if (!ura.m195053e().m195057d().mo33802b() || mcrVar == null) {
            return;
        }
        if (this.f19852D2 <= mqi0.m155944o() || ura.m195053e().m195057d().mo33898p()) {
            this.f19852D2 = mqi0.m155944o() + HuiYanOsConfig.LONG_CHECK_OVERSEAS_DEFAULT_TIME_OUT;
            this.f19858F2.clear();
            final int i = 40;
            mcrVar.duringCreated(CoreModule.f17545c.f19642f0.m32960fo()).take(1).observeOn(jo0.m142408a()).map(new w9j() { // from class: l.yp7
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((q860) obj).f153135a;
                }
            }).filter(new w9j() { // from class: l.zp7
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(!vwb.m200296J((List) obj));
                }
            }).flatMap(new na8()).filter(new oa8()).filter(new w9j() { // from class: l.aq7
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return C4740g.m32040E7((Conversation) obj);
                }
            }).filter(new w9j() { // from class: l.bq7
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(!User.isTeamAccount(((Conversation) obj).otherUser));
                }
            }).take(40).buffer(40).flatMap(new w9j() { // from class: l.cq7
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return this.f82043a.m32618Di(i, (List) obj);
                }
            }).subscribe(mkd0.m154956H(new e30() { // from class: l.dq7
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f87394a.m32631Ei((List) obj);
                }
            }, new e30() { // from class: l.eq7
                @Override // p149l.e30
                public final void call(Object obj) {
                    C4740g.m32013Bd((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: Yg */
    public void m32870Yg(String str, List<ChatAssistantQuestion> list) {
        if (vwb.m200296J(list)) {
            return;
        }
        Message messageNew_ = Message.new_();
        messageNew_.messageType = MessageType.get(MessageType.local_chat_assistant_question_new);
        messageNew_.cid = str;
        messageNew_.localInConversation = true;
        long jM155944o = mqi0.m155944o();
        messageNew_.owner = CoreModule.m29931H().userId();
        messageNew_.createdTime = jM155944o;
        messageNew_.localCreatedTime = jM155944o;
        messageNew_.recalled = Boolean.FALSE;
        messageNew_.hostId = CoreModule.m29931H().userId();
        tpd0 tpd0Var = App.f15373i;
        messageNew_.localCreatedSession = tpd0Var.get().intValue();
        messageNew_.f56011id = DbObject.GENERATE_UNIQUE_FAKE_ID(tpd0Var.get().intValue());
        MessageAdditionalData messageAdditionalDataNew_ = MessageAdditionalData.new_();
        messageNew_.additionalData = messageAdditionalDataNew_;
        messageAdditionalDataNew_.chatAssistantQuestions = list;
        messageNew_.value = "";
        m32882Zg(messageNew_);
    }

    /* JADX INFO: renamed from: Yh */
    public final /* synthetic */ void m32871Yh(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Conversation conversation = (Conversation) it.next();
            conversation.unreadMessages = 0;
            conversation.read = Boolean.TRUE;
            m33050mq(conversation);
        }
    }

    /* JADX INFO: renamed from: Yi */
    public final /* synthetic */ void m32872Yi(Message message, boolean z) {
        Objects.toString(message.messageType);
        m32953fh(message, z);
    }

    /* JADX INFO: renamed from: Yj */
    public final /* synthetic */ C22306c m32873Yj(final Message message, final String str, final boolean z, final boolean z2, final Sticker sticker, final CoreProviderInterface coreProviderInterface) {
        return C22306c.fromCallable(new Callable() { // from class: l.cb8
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f80108a.m32861Xj(message, str, z, z2, sticker, coreProviderInterface);
            }
        }).compose(qjd0.m174993e(f19839b3));
    }

    /* JADX INFO: renamed from: Yk */
    public final /* synthetic */ roj0 m32874Yk(final String str, Double d2) {
        this.f72126Q.f19609U.m109085a(new d30() { // from class: l.q58
            @Override // p149l.d30
            public final void call() {
                this.f152740a.m32862Xk(str);
            }
        });
        return roj0.f160388a;
    }

    /* JADX INFO: renamed from: Yl */
    public final /* synthetic */ void m32875Yl() {
        if (NullChecker.m81303a(CoreModule.f17553k.f91950m.query("fake_conversation_weaken_conversation"))) {
            this.f72126Q.f19609U.m109085a(new d30() { // from class: l.mw7
                @Override // p149l.d30
                public final void call() {
                    CoreModule.f17545c.f19642f0.m32628Ef("fake_conversation_weaken_conversation");
                }
            });
        }
    }

    /* JADX INFO: renamed from: Ym */
    public final C22306c<roj0> m32876Ym() {
        return this.f72126Q.scheduled("conversations/get/only", 0, new v9j() { // from class: l.xx7
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f194815a.m32955fj();
            }
        });
    }

    /* JADX INFO: renamed from: Yn */
    public CoreMomentInfo m32877Yn(String str) {
        return (CoreMomentInfo) CoreModule.m29934N().mo60300Oh(str, CoreMomentInfo.JSON_ADAPTER);
    }

    /* JADX INFO: renamed from: Yo */
    public C22306c<Message> m32878Yo(String str) {
        return CoreModule.f17553k.f91940c.m206087s0(str).m165620m().map(new w9j() { // from class: l.o58
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return C4740g.m32138N6((List) obj);
            }
        });
    }

    /* JADX INFO: renamed from: Yp */
    public C22392a<List<IceBreakingQuestion>> m32879Yp() {
        return this.f19847C0;
    }

    /* JADX INFO: renamed from: Ze */
    public C22306c<q860<Conversation>> m32880Ze() {
        return m32749Oe(m32725Me().m141992j0());
    }

    /* JADX INFO: renamed from: Zf */
    public void m32881Zf(mcr mcrVar) {
        if (ura.m195053e().m195057d().mo33802b() && mcrVar != null && ura.m195053e().m195057d().mo33898p()) {
            this.f19861G2.clear();
            final int i = 40;
            mcrVar.duringCreated(CoreModule.f17545c.f19642f0.m32963gf()).take(1).observeOn(jo0.m142408a()).filter(new w9j() { // from class: l.ma8
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(!vwb.m200296J((List) obj));
                }
            }).flatMap(new na8()).filter(new oa8()).filter(new w9j() { // from class: l.qa8
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(TEnum.equals(((Conversation) obj).status, "default"));
                }
            }).filter(new w9j() { // from class: l.ra8
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(!User.isTeamAccount(((Conversation) obj).otherUser));
                }
            }).take(40).buffer(40).flatMap(new w9j() { // from class: l.sa8
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return this.f163312a.m32644Fi(i, (List) obj);
                }
            }).subscribe(mkd0.m154956H(new e30() { // from class: l.ta8
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f169100a.m32657Gi((List) obj);
                }
            }, new e30() { // from class: l.ua8
                @Override // p149l.e30
                public final void call(Object obj) {
                    C4740g.m32119L9((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: Zg */
    public C22306c<roj0> m32882Zg(Message message) {
        return m32894ah(message, true);
    }

    /* JADX INFO: renamed from: Zh */
    public final /* synthetic */ roj0 m32883Zh(final String str, final d30 d30Var, Envelope envelope) {
        this.f72126Q.f19609U.m109085a(new d30() { // from class: l.ba8
            @Override // p149l.d30
            public final void call() {
                C4740g.m32062G7(str, d30Var);
            }
        });
        return roj0.f160388a;
    }

    /* JADX INFO: renamed from: Zi */
    public final /* synthetic */ roj0 m32884Zi(final Message message, final boolean z) throws Exception {
        this.f72126Q.f19609U.m109085a(new d30() { // from class: l.ia8
            @Override // p149l.d30
            public final void call() {
                this.f112286a.m32872Yi(message, z);
            }
        });
        return roj0.f160388a;
    }

    /* JADX INFO: renamed from: Zj */
    public final /* synthetic */ void m32885Zj(Message message, List list) {
        final Message messageMo223809clone = message.mo223809clone();
        if (!vwb.m200296J(list) && list.get(0) != null && (list.get(0) instanceof Video) && TEnum.equals(((Media) list.get(0)).status, MediaLocalStatus.preprocessed)) {
            try {
                String[] strArrM145082N = k9j.m145082N(((Media) list.get(0)).url, ((Media) list.get(0)).cover().url, k9j.f122027c, message.f56011id, true);
                ((Media) list.get(0)).url = strArrM145082N[0];
                ((Media) list.get(0)).cover().url = strArrM145082N[1];
            } catch (Exception e) {
                CrashHelper.m81296c(e);
            }
        }
        messageMo223809clone.media = list;
        this.f72126Q.f19609U.m109085a(new d30() { // from class: l.hv7
            @Override // p149l.d30
            public final void call() {
                CoreModule.f17553k.f91940c.updateBy_id(messageMo223809clone);
            }
        });
        if (vwb.m200296J(message.media)) {
            return;
        }
        for (Media media : message.media) {
            if (media.url.startsWith("file") && media.url.endsWith(".copy")) {
                new File(rhi.m179382z(media.url)).delete();
            }
        }
    }

    /* JADX INFO: renamed from: Zk */
    public final /* synthetic */ C22306c m32886Zk(final String str, final boolean z) {
        return C22306c.fromCallable(new Callable() { // from class: l.p48
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C4740g.m32150O7(str);
            }
        }).flatMap(new w9j() { // from class: l.q48
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f152551a.m32850Wk(z, str, (j760) obj);
            }
        }).map(new w9j() { // from class: l.r48
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f157641a.m32874Yk(str, (Double) obj);
            }
        }).compose(C4728a.m31252T2());
    }

    /* JADX INFO: renamed from: Zl */
    public final /* synthetic */ void m32887Zl() {
        this.f72126Q.f19609U.m109085a(new d30() { // from class: l.dx7
            @Override // p149l.d30
            public final void call() {
                this.f88271a.m32821Uf();
            }
        });
    }

    /* JADX INFO: renamed from: Zm, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final C22306c<roj0> m33069oj(final DbLinks dbLinks) {
        return this.f72126Q.scheduled("conversations/get", 0, new v9j() { // from class: l.tv7
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f172267a.m32979hj(dbLinks);
            }
        });
    }

    /* JADX INFO: renamed from: Zn */
    public C22306c<ChatProfile> m32889Zn() {
        return this.f19844B0.asObservable();
    }

    /* JADX INFO: renamed from: Zo */
    public C22306c<Message> m32890Zo(final String str, final String str2) {
        return mkd0.m154984r(CoreModule.f17553k.f91940c.uiGet(str2), this.f19885O2.observeOn(jo0.m142408a()), new x9j() { // from class: l.uz7
            @Override // p149l.x9j
            public final Object call(Object obj, Object obj2) {
                return this.f178961a.m32647Fl(str2, (Message) obj, (roj0) obj2);
            }
        }).doOnNext(new e30() { // from class: l.vz7
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f183589a.m32660Gl(str, str2, (Message) obj);
            }
        });
    }

    /* JADX INFO: renamed from: Zp */
    public C22306c<List<Conversation>> m32891Zp() {
        return CoreModule.f17553k.f91950m.f118471X.m167769b().m165620m();
    }

    /* JADX INFO: renamed from: af */
    public j760<List<Conversation>, List<User>> m32892af(String str) {
        return CoreModule.f17553k.f91950m.m141987g1(str);
    }

    /* JADX INFO: renamed from: ag */
    public C22306c<AudioText> m32893ag(final String str, final String str2) {
        return scheduled("users/me/conversations/" + str + "/" + str2 + "/audioTexts", -1, new v9j() { // from class: l.cs7
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f82328a.m32681Ii(str, str2);
            }
        });
    }

    /* JADX INFO: renamed from: ah */
    public C22306c<roj0> m32894ah(final Message message, final boolean z) {
        return this.f72126Q.now(C22306c.fromCallable(new Callable() { // from class: l.qt7
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f156308a.m32884Zi(message, z);
            }
        }).compose(C4728a.m31252T2()));
    }

    /* JADX INFO: renamed from: ai */
    public final /* synthetic */ C22306c m32895ai(final String str, final String str2, final String str3, final d30 d30Var) {
        new Message().recalled = Boolean.TRUE;
        return new la20((v9j<stc0>) new v9j() { // from class: l.j98
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4728a.f19494P.auth().m185898q(C4728a.m31216K(str, str2, str3)).m185885d().m185883b();
            }
        }, 0).map(new w9j() { // from class: l.l98
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f126924a.m32883Zh(str3, d30Var, (Envelope) obj);
            }
        }).compose(C4728a.m31252T2());
    }

    /* JADX INFO: renamed from: aj */
    public final /* synthetic */ Boolean m32896aj(String str) throws Exception {
        return Boolean.valueOf(m33182xh(str));
    }

    /* JADX INFO: renamed from: ak */
    public final /* synthetic */ Message m32897ak(Message message, List list) {
        final Message messageMo223809clone = message.mo223809clone();
        messageMo223809clone.media = list;
        this.f72126Q.f19609U.m109085a(new d30() { // from class: l.nw7
            @Override // p149l.d30
            public final void call() {
                CoreModule.f17553k.f91940c.updateBy_id(messageMo223809clone);
            }
        });
        return messageMo223809clone;
    }

    /* JADX INFO: renamed from: al */
    public final /* synthetic */ void m32898al(Envelope envelope) {
        this.f72126Q.m31492w3(envelope, null);
    }

    /* JADX INFO: renamed from: am */
    public final /* synthetic */ void m32899am(String str) {
        Conversation conversationM32735Mo = m32735Mo(str);
        if (NullChecker.m81303a(conversationM32735Mo) && NullChecker.m81303a(conversationM32735Mo.additional) && NullChecker.m81303a(conversationM32735Mo.additional.pinChat) && conversationM32735Mo.level == 90 && conversationM32735Mo.additional.pinChat.expireTime <= mqi0.m155944o()) {
            conversationM32735Mo.level = CoreModule.m29935P().m94655f().mo36021ba(str);
            m33050mq(conversationM32735Mo);
        }
    }

    /* JADX INFO: renamed from: an */
    public C22306c<roj0> m32900an(final String str) {
        final String str2;
        if (TextUtils.isEmpty(str)) {
            str2 = "/conversations?with=users,friends&search=loveLetterSuggested&filter=default&sort=latestMessageTime&limit=50";
        } else {
            str2 = "/conversations?with=users,friends&search=loveLetterSuggested&filter=default&sort=latestMessageTime&" + str;
        }
        return this.f72126Q.scheduled("loadLoveLetterUsers" + str, 0, new v9j() { // from class: l.st7
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f166301a.m33017kj(str2, str);
            }
        });
    }

    /* JADX INFO: renamed from: ao */
    public ChatProfile m32901ao() {
        return this.f19844B0.m221515e();
    }

    /* JADX INFO: renamed from: ap */
    public C22306c<roj0> m32902ap(String str) {
        return m32914bp(str).map(new w9j() { // from class: l.pr7
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return roj0.f160388a;
            }
        });
    }

    /* JADX INFO: renamed from: aq */
    public C22306c<q860<Conversation>> m32903aq(long j) {
        return m32749Oe(m32725Me().m141997l1(j));
    }

    /* JADX INFO: renamed from: bf */
    public C22306c<q860<Conversation>> m32904bf() {
        return m32749Oe(m32725Me().f118462O.m167769b());
    }

    /* JADX INFO: renamed from: bg */
    public boolean m32905bg() {
        return ura.m195053e().m195057d().mo33764Vb() ? this.f19991y0.get().booleanValue() : this.f19988x0;
    }

    /* JADX INFO: renamed from: bh */
    public C22306c<roj0> m32906bh(String str, MessageType messageType, String str2, e30<Message> e30Var) {
        Message messageM33078pf = m33078pf(str, messageType, str2);
        if (NullChecker.m81303a(e30Var)) {
            e30Var.call(messageM33078pf);
        }
        return m32882Zg(messageM33078pf);
    }

    /* JADX INFO: renamed from: bi */
    public final /* synthetic */ q860 m32907bi(List list, DbLinks dbLinks) {
        if (dbLinks == null) {
            m32650Fo();
        }
        return m99390Z2(list, dbLinks);
    }

    /* JADX INFO: renamed from: bj */
    public final /* synthetic */ void m32908bj(boolean z, DbLinks dbLinks, Envelope envelope) {
        if (z) {
            qib0.f154722k0.f176630c.upsert(dbLinks);
            m33143uf(envelope, true);
        }
        m33217zq(((CoreData) envelope.getModuleData(CoreData.class)).conversations);
    }

    /* JADX INFO: renamed from: bk */
    public final /* synthetic */ C22306c m32909bk(Message message, final Sticker sticker, Envelope envelope) {
        final Sticker sticker2;
        if (vwb.m200296J(((CoreData) envelope.getModuleData(CoreData.class)).stickers)) {
            CrashHelper.m81302i(new Exception("return null sticker"), "core_send_sticker", CrashHelper.ReportLevel.p5, 100);
            sticker2 = null;
        } else {
            sticker2 = ((CoreData) envelope.getModuleData(CoreData.class)).stickers.get(0);
        }
        if (!NullChecker.m81303a(sticker2)) {
            return C22306c.just(message);
        }
        final Message messageMo223809clone = message.mo223809clone();
        messageMo223809clone.sticker = sticker2.f56011id;
        this.f72126Q.f19609U.m109085a(new d30() { // from class: l.ss7
            @Override // p149l.d30
            public final void call() {
                C4740g.m32490s8(sticker, sticker2, messageMo223809clone);
            }
        });
        return C22306c.just(messageMo223809clone);
    }

    /* JADX INFO: renamed from: bl */
    public final /* synthetic */ C22306c m32910bl(final String str) {
        return ia20.m135121e(new v9j() { // from class: l.u88
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4740g.m32216U6(str);
            }
        }).doOnNext(new e30() { // from class: l.v88
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f180453a.m32898al((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: bm */
    public final /* synthetic */ void m32911bm(final String str) {
        this.f72126Q.f19609U.m109085a(new d30() { // from class: l.tw7
            @Override // p149l.d30
            public final void call() {
                this.f172372a.m32899am(str);
            }
        });
    }

    /* JADX INFO: renamed from: bn */
    public final C22306c<roj0> m32912bn(final DbLinks dbLinks) {
        return C22306c.fromCallable(new Callable() { // from class: l.ls7
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f129809a.m33108rj(dbLinks);
            }
        });
    }

    /* JADX INFO: renamed from: bo */
    public boolean m32913bo(User user, Conversation conversation) {
        return m32948eo(user, conversation, "");
    }

    /* JADX INFO: renamed from: bp */
    public C22306c<Data> m32914bp(final String str) {
        return this.f72126Q.scheduled("conversations/" + str + "/refresh", 0, new v9j() { // from class: l.pb8
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f148067a.m32720Ll(str);
            }
        });
    }

    /* JADX INFO: renamed from: bq */
    public List<Conversation> m32915bq() {
        return CoreModule.f17553k.f91950m.query(Filter.AND(Conversation.SUGGESTIONSCORE.NEQ(Double.valueOf(FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE)), Conversation.LOCALEVERHASMESSAGE.m81223F()), Conversation.LATESTTIME.DESC, -1);
    }

    /* JADX INFO: renamed from: cf */
    public C22306c<q860<Conversation>> m32916cf() {
        return mkd0.m154984r(CoreModule.f17553k.f91950m.f118460M.m167769b().m165620m(), C22306c.just(DbLinks.new_()), new x9j() { // from class: l.ja8
            @Override // p149l.x9j
            public final Object call(Object obj, Object obj2) {
                return this.f117067a.m32907bi((List) obj, (DbLinks) obj2);
            }
        });
    }

    /* JADX INFO: renamed from: cg */
    public hpd0 m32917cg() {
        if (this.f19967q0 == null) {
            boolean zMo33717Li = ura.m195053e().m195057d().mo33717Li();
            if (this.f19970r0 == null) {
                this.f19970r0 = new hpd0("conv_cell_weaken_fun_open" + CoreModule.m29931H().userId(), Boolean.valueOf(zMo33717Li));
            }
            Boolean bool = this.f19970r0.get();
            bool.booleanValue();
            this.f19967q0 = new hpd0("conv_cell_weaken_fun_open_new" + CoreModule.m29931H().userId(), bool);
        }
        return this.f19967q0;
    }

    /* JADX INFO: renamed from: ch */
    public C22306c<roj0> m32918ch(String str, MessageType messageType, e30<Message> e30Var) {
        return m32906bh(str, messageType, "", e30Var);
    }

    /* JADX INFO: renamed from: ci */
    public final /* synthetic */ q860 m32919ci(List list, DbLinks dbLinks) {
        if (dbLinks == null) {
            m32650Fo();
        }
        return m99390Z2(list, dbLinks);
    }

    /* JADX INFO: renamed from: ck */
    public final /* synthetic */ C22306c m32921ck(final Map map, final Sticker sticker, Message message, final Message message2) {
        List<Media> list = message2.media;
        if (list != null && list.size() > 0) {
            return new lsx(message2.media, false).flatMap(new w9j() { // from class: l.sr7
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return C4740g.m32283a7(message2, (List) obj);
                }
            }).doOnNext(new e30() { // from class: l.tr7
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f171793a.m32885Zj(message2, (List) obj);
                }
            }).last().flatMap(new w9j() { // from class: l.ur7
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    List list2 = (List) obj;
                    return ya5.m213796L(list2, "message", "chat", map, UploadSource.get("chat")).map(new w9j() { // from class: l.lw7
                        @Override // p149l.w9j
                        public final Object call(Object obj2) {
                            return C4740g.m32106K7(list2, message, (List) obj2);
                        }
                    });
                }
            }).map(new w9j() { // from class: l.vr7
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return this.f182702a.m32897ak(message2, (List) obj);
                }
            });
        }
        if (sticker == null && (TextUtils.isEmpty(message.sticker) || message.sticker.indexOf("fake_id_") != 0)) {
            return C22306c.just(message2);
        }
        if (sticker == null) {
            sticker = (Sticker) CoreModule.f17553k.f91944g.query(message.sticker);
        }
        return new la20(new v9j() { // from class: l.wr7
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                Sticker sticker2 = sticker;
                return C4728a.f19494P.auth().m185898q(C4728a.m31200G("/stickers")).m185893l(utc0.create(Network.JSON, sticker2 == null ? "" : sticker2.toJson())).m185883b();
            }
        }).flatMap(new w9j() { // from class: l.yr7
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f199641a.m32909bk(message2, sticker, (Envelope) obj);
            }
        }).delay(TEnum.equals(sticker.source, "sogou") ? 500L : 0L, TimeUnit.MILLISECONDS);
    }

    /* JADX INFO: renamed from: cl */
    public final /* synthetic */ roj0 m32922cl(Envelope envelope) {
        if (!vwb.m200296J(((CoreData) envelope.getModuleData(CoreData.class)).chatProfiles)) {
            for (ChatProfile chatProfile : ((CoreData) envelope.getModuleData(CoreData.class)).chatProfiles) {
                if (TextUtils.equals(chatProfile.userId, CoreModule.m29931H().userId())) {
                    this.f19844B0.m132487l(chatProfile);
                    break;
                }
            }
        }
        return roj0.f160388a;
    }

    /* JADX INFO: renamed from: cm */
    public final /* synthetic */ void m32923cm(String str) {
        Conversation conversationM32735Mo = m32735Mo(str);
        if (NullChecker.m81303a(conversationM32735Mo) && NullChecker.m81303a(conversationM32735Mo.additional) && NullChecker.m81303a(conversationM32735Mo.additional.tag) && conversationM32735Mo.level == 55 && conversationM32735Mo.additional.tag.expireTime * 1000 <= mqi0.m155944o()) {
            conversationM32735Mo.level = 0;
            m33050mq(conversationM32735Mo);
        }
    }

    /* JADX INFO: renamed from: cn */
    public C22306c<roj0> m32924cn(final String str, final List<String> list, final String str2, final String str3, final int i) {
        clearRequests("loadNewMatchChat", 0);
        return this.f72126Q.scheduled("loadNewMatchChat", 0, new v9j() { // from class: l.pa8
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f147951a.m33147uj(str, str2, str3, list, i);
            }
        });
    }

    /* JADX INFO: renamed from: co */
    public boolean m32925co(User user, Conversation conversation) {
        return m32948eo(user, conversation, "birthday");
    }

    /* JADX INFO: renamed from: cp */
    public void m32926cp() {
    }

    /* JADX INFO: renamed from: cq */
    public C22306c<AudioText> m32927cq(final String str, final String str2) {
        return scheduled("users/me/conversations/" + str + "/" + str2 + "/audioTexts", -1, new v9j() { // from class: l.ut7
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f178236a.m33213zm(str, str2);
            }
        });
    }

    /* JADX INFO: renamed from: df */
    public C22306c<q860<Conversation>> m32928df() {
        return mkd0.m154984r(CoreModule.f17553k.f91950m.f118472Y.m167769b().m165620m(), C22306c.just(DbLinks.new_()), new x9j() { // from class: l.eb8
            @Override // p149l.x9j
            public final Object call(Object obj, Object obj2) {
                return this.f90306a.m32919ci((List) obj, (DbLinks) obj2);
            }
        });
    }

    /* JADX INFO: renamed from: dg */
    public List<Conversation> m32929dg(boolean z) {
        List<Conversation> listM221515e = z ? this.f19870J2.m221515e() : this.f19873K2.m221515e();
        return listM221515e == null ? new ArrayList() : listM221515e;
    }

    /* JADX INFO: renamed from: dh */
    public void m32930dh(String str, MessageType messageType) {
        m32918ch(str, messageType, null);
    }

    /* JADX INFO: renamed from: di */
    public final /* synthetic */ void m32931di(Conversation conversation, String str) {
        m32610Cn(conversation.f56011id, str);
    }

    /* JADX INFO: renamed from: dk */
    public final /* synthetic */ void m32933dk(Message message, AtomicBoolean atomicBoolean) {
        if (message._id != 0) {
            atomicBoolean.set(true);
            CoreModule.f17553k.f91940c.delete(message._id);
        }
        if (TextUtils.isEmpty(message.cid)) {
            return;
        }
        Conversation conversationM32735Mo = m32735Mo(message.cid);
        if (CoreModule.f17553k.f91940c.m206065W(message.cid).m165612e() == 0 && NullChecker.m81303a(conversationM32735Mo) && !conversationM32735Mo.isForceDropDownCell()) {
            conversationM32735Mo.localHasMessage = false;
            if (TextUtils.isEmpty(conversationM32735Mo.clearedUntil) || "0".equals(conversationM32735Mo.clearedUntil)) {
                conversationM32735Mo.localEverHasMessage = false;
            }
            CoreModule.f17553k.f91950m.upsert(conversationM32735Mo);
        }
    }

    /* JADX INFO: renamed from: dl */
    public final /* synthetic */ C22306c m32934dl(final JSONObject jSONObject) {
        return NullChecker.m81303a(jSONObject) ? ia20.m135117a(new v9j() { // from class: l.h98
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4728a.f19494P.auth().m185898q(C4728a.m31213J0("/chat-profiles") + "?method=patch").m185893l(utc0.create(Network.JSON, jSONObject.toString())).m185883b();
            }
        }).map(new w9j() { // from class: l.i98
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f112128a.m32922cl((Envelope) obj);
            }
        }) : C22306c.empty();
    }

    /* JADX INFO: renamed from: dm */
    public final /* synthetic */ void m32935dm(final String str) {
        this.f72126Q.f19609U.m109085a(new d30() { // from class: l.kt7
            @Override // p149l.d30
            public final void call() {
                this.f124566a.m32923cm(str);
            }
        });
    }

    /* JADX INFO: renamed from: dn, reason: merged with bridge method [inline-methods] */
    public C22306c<roj0> m33210zj(final String str) {
        return this.f72126Q.scheduled("group_message_pre_load/" + str, 0, new v9j() { // from class: l.bs7
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f77009a.m33172wj(str);
            }
        });
    }

    /* JADX INFO: renamed from: dp */
    public void m32937dp(Runnable runnable) {
        m32949ep(runnable, true);
    }

    /* JADX INFO: renamed from: dq */
    public void m32938dq(double d2) {
        this.f19996z2.m132487l(Double.valueOf(d2));
    }

    /* JADX INFO: renamed from: ef */
    public C22306c<q860<Conversation>> m32939ef() {
        return m32749Oe(m32725Me().f118459L.m167769b());
    }

    /* JADX INFO: renamed from: eg */
    public long m32940eg() {
        return this.f72126Q.f19642f0.f19947j1.get().longValue();
    }

    /* JADX INFO: renamed from: eh */
    public void m32941eh(Message message) {
        m32953fh(message, true);
    }

    /* JADX INFO: renamed from: ei */
    public final /* synthetic */ void m32942ei(final String str) {
        this.f72126Q.f19609U.m109085a(new d30() { // from class: l.az7
            @Override // p149l.d30
            public final void call() {
                C4740g.m32260Y6(str);
            }
        });
    }

    /* JADX INFO: renamed from: ej */
    public final /* synthetic */ roj0 m32943ej(final DbLinks dbLinks, final boolean z) throws Exception {
        final String strM31371y = C4728a.m31371y(dbLinks.links.next);
        final Envelope envelopeM212771c = new la20(new v9j() { // from class: l.ws7
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4728a.f19494P.auth().m185898q(strM31371y).m185887f().m185883b();
            }
        }).toBlocking().m212771c(null);
        CoreModule.f17545c.f19648h0.m196254m3(envelopeM212771c);
        Links links = dbLinks.links;
        if (links.previous == null) {
            links.previous = envelopeM212771c.pagination.links.previous;
        }
        links.next = envelopeM212771c.pagination.links.next;
        if (ura.m195053e().m195057d().mo33869ka() && z) {
            wf6.m202949d(dbLinks, envelopeM212771c);
        } else {
            if (wf6.m202951f()) {
                wf6.m202947b(envelopeM212771c, strM31371y, true);
            }
            this.f72126Q.m31492w3(envelopeM212771c, new d30() { // from class: l.xs7
                @Override // p149l.d30
                public final void call() {
                    this.f194205a.m32908bj(z, dbLinks, envelopeM212771c);
                }
            });
        }
        this.f19984v2.put(Long.valueOf(qib0.f154693H.guessedCurrentServerTime()));
        if (dbLinks.links.next != null && z) {
            if (ura.m195053e().m195057d().mo33869ka()) {
                e51.m114743H(CoreModule.f17544b, new Runnable() { // from class: l.ys7
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f199749a.m32920cj(dbLinks);
                    }
                }, Math.max(wf6.m202953h(), f19838a3));
                int i = f19838a3;
                if (i > 0) {
                    f19838a3 = i + WebRtcAudioTrack.AudioTrackErrorCode.AUDIO_TRACK_INIT_MINBUFFER_ERROR;
                }
            } else {
                e51.m114743H(CoreModule.f17544b, new Runnable() { // from class: l.zs7
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f204570a.m32932dj(dbLinks);
                    }
                }, f19838a3);
                int i2 = f19838a3;
                if (i2 > 100) {
                    f19838a3 = i2 + WebRtcAudioTrack.AudioTrackErrorCode.AUDIO_TRACK_INIT_MINBUFFER_ERROR;
                }
                if (f19838a3 < 100) {
                    f19838a3 = 100;
                }
            }
        }
        this.f19981u2.put(Integer.valueOf(qib0.f154732t));
        return roj0.f160388a;
    }

    /* JADX INFO: renamed from: ek */
    public final /* synthetic */ void m32944ek(Message message, TantanException.Client.TantanForbidden tantanForbidden) {
        if (TextUtils.isEmpty(message.cid)) {
            return;
        }
        du2.m113670a("TantanForbiddenConversation", "messageid:" + message._id + " errorCode:" + tantanForbidden.code);
        m32728Mh(message.cid);
    }

    /* JADX INFO: renamed from: el */
    public final /* synthetic */ C22306c m32945el(final List list) {
        return C22306c.fromCallable(new Callable() { // from class: l.b78
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C4740g.m32459pa(list);
            }
        }).flatMap(new w9j() { // from class: l.c78
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f79598a.m32934dl((JSONObject) obj);
            }
        });
    }

    /* JADX INFO: renamed from: em */
    public final /* synthetic */ void m32946em(final Conversation conversation, final boolean z) {
        this.f72126Q.f19609U.m109085a(new d30() { // from class: l.aa8
            @Override // p149l.d30
            public final void call() {
                C4740g.m32328e4(conversation, z);
            }
        });
    }

    /* JADX INFO: renamed from: en, reason: merged with bridge method [inline-methods] */
    public C22306c<roj0> m33160vj(final String str, final String str2) {
        C4732c c4732c = this.f72126Q;
        if (str == null) {
            return c4732c.just();
        }
        return c4732c.scheduled("conversations/" + str2 + "/previous", 0, new v9j() { // from class: l.fy7
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f99836a.m32593Bj(str2, str);
            }
        });
    }

    /* JADX INFO: renamed from: eo */
    public final boolean m32948eo(User user, Conversation conversation, String str) {
        ConversationAdditional conversationAdditional;
        ConversationAdditionalTag conversationAdditionalTag;
        return (!ura.m195053e().m195057d().mo33890o() || conversation == null || user == null || this.f72126Q.f19639e0.m169370Aa(user) || user.isBanned() || user.isBannedNew() || user.isJailed() || user.inactivated || user.isFakeUser() || !TEnum.equals(conversation.status, "default") || this.f19951k2.size() >= ura.m195053e().m195057d().mo33748Ro() || (conversationAdditional = conversation.additional) == null || (conversationAdditionalTag = conversationAdditional.tag) == null || conversationAdditionalTag.type == null || (TextUtils.isEmpty(str) && TEnum.equals(conversation.additional.tag.type, "unknown_")) || ((!TextUtils.isEmpty(str) && !TEnum.equals(conversation.additional.tag.type, str)) || (conversation.additional.tag.expireTime > 0 && mqi0.m155944o() > conversation.additional.tag.expireTime * 1000))) ? false : true;
    }

    /* JADX INFO: renamed from: ep */
    public void m32949ep(final Runnable runnable, final boolean z) {
        User userM169527p9 = CoreModule.f17545c.f19639e0.m169527p9();
        if (userM169527p9 != null && !userM169527p9.isFemale() && (!z || !this.f19859G0.get().booleanValue())) {
            scheduled("conversation/countdown/like/refresh", 0, new v9j() { // from class: l.ov7
                @Override // p149l.v9j, java.util.concurrent.Callable
                public final Object call() {
                    return ia20.m135117a(new v9j() { // from class: l.u08
                        @Override // p149l.v9j, java.util.concurrent.Callable
                        public final Object call() {
                            return C4728a.f19494P.auth().m185898q(C4728a.m31213J0("/countdown-likes?filter=latest")).m185887f().m185883b();
                        }
                    });
                }
            }).subscribe(new e30() { // from class: l.pv7
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f151423a.m32732Ml(runnable, z, (Envelope) obj);
                }
            }, new e30() { // from class: l.qv7
                @Override // p149l.e30
                public final void call(Object obj) {
                    C4740g.m32406kc((Throwable) obj);
                }
            });
        } else if (NullChecker.m81303a(runnable)) {
            runnable.run();
        }
    }

    /* JADX INFO: renamed from: eq */
    public C22306c<List<Conversation>> m32950eq() {
        return CoreModule.f17553k.f91950m.m141999m1(100).m165620m();
    }

    /* JADX INFO: renamed from: ff */
    public C22306c<List<Conversation>> m32951ff() {
        return m32725Me().f118464Q.m167769b().m165620m();
    }

    /* JADX INFO: renamed from: fg */
    public C22306c<roj0> m32952fg() {
        final String strM208765m = xh5.m208765m("search=exposure&with=users");
        return this.f72126Q.scheduled("conversations/get/exposure", 0, new v9j() { // from class: l.us7
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f177944a.m32717Li(strM208765m);
            }
        });
    }

    /* JADX INFO: renamed from: fh */
    public final void m32953fh(Message message, boolean z) {
        m32965gh(message, z, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);
    }

    /* JADX INFO: renamed from: fi */
    public final /* synthetic */ void m32954fi() {
        this.f72126Q.f19609U.m109085a(new d30() { // from class: l.ka8
            @Override // p149l.d30
            public final void call() {
                CoreModule.f17545c.f19642f0.m32628Ef("fake_conversation_surprise_gift_box");
            }
        });
    }

    /* JADX INFO: renamed from: fj */
    public final /* synthetic */ C22306c m32955fj() {
        DbLinks dbLinksNew_ = DbLinks.new_();
        dbLinksNew_.f56011id = SchemeKey.conversations;
        dbLinksNew_.links.next = C4728a.f19486H;
        return m32864Xm(dbLinksNew_, false).compose(mkd0.m154951C());
    }

    /* JADX WARN: Code duplicated, block: B:88:0x01b6  */
    /* JADX INFO: renamed from: fk */
    public final /* synthetic */ void m32956fk(String str, final Message message, final CoreProviderInterface coreProviderInterface, boolean z, String str2, long j, final Throwable th) {
        String str3;
        String str4;
        int i;
        final boolean z2 = false;
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.f19907W.m132487l(th);
        boolean z3 = th instanceof TantanException.Client.TantanForbidden;
        if (z3 && ((TantanException.Client.TantanForbidden) th).code == 40344) {
            ChatHeatActionData chatHeatActionData = new ChatHeatActionData(str, ChatHeatActionData.ExclusiveAction.CHECK, false, new j760[0]);
            chatHeatActionData.setThrowable(th);
            CoreModule.f17545c.f19586M1.f198866S.m132487l(chatHeatActionData);
            m33155ve(message, 0, null);
            return;
        }
        if (z3 && ((TantanException.Client.TantanForbidden) th).code == 40338) {
            m33155ve(message, 6, null);
            this.f72126Q.f19571H1.f184098R.m132487l(message);
            return;
        }
        if (z3 && ((TantanException.Client.TantanForbidden) th).code == 40337) {
            m33155ve(message, 5, null);
            return;
        }
        if (z3 && ((TantanException.Client.TantanForbidden) th).code == 40342) {
            m33155ve(message, 7, new e30() { // from class: l.tq7
                @Override // p149l.e30
                public final void call(Object obj) {
                    ((Message) obj).localExtraInfo = ((TantanException.Client.TantanForbidden) th).message;
                }
            });
            return;
        }
        if (z3 && ((TantanException.Client.TantanForbidden) th).code == 40345) {
            m33155ve(message, 9, new e30() { // from class: l.vq7
                @Override // p149l.e30
                public final void call(Object obj) {
                    ((Message) obj).localExtraInfo = ((TantanException.Client.TantanForbidden) th).message;
                }
            });
            return;
        }
        e51.m114748M(new Runnable() { // from class: l.wq7
            @Override // java.lang.Runnable
            public final void run() {
                coreProviderInterface.mo33811d(th);
            }
        });
        boolean zM32751Og = true;
        if (!(th instanceof TantanException.Client.CoreService)) {
            if (z3) {
                final TantanException.Client.TantanForbidden tantanForbidden = (TantanException.Client.TantanForbidden) th;
                str3 = "" + tantanForbidden.code;
                if (tantanForbidden.code == 40346) {
                    final String str5 = tantanForbidden.message;
                    if (!TextUtils.isEmpty(str5)) {
                        e51.m114748M(new Runnable() { // from class: l.yq7
                            @Override // java.lang.Runnable
                            public final void run() {
                                osi0.m165783g(str5);
                            }
                        });
                    }
                    this.f72126Q.f19609U.m109085a(new d30() { // from class: l.zq7
                        @Override // p149l.d30
                        public final void call() {
                            CoreModule.f17553k.f91940c.delete(message._id);
                        }
                    });
                } else if (tantanForbidden.isBlocked()) {
                    m33204yq(message._id, message.cid);
                } else if (coreProviderInterface.mo33752Te(tantanForbidden) || coreProviderInterface.mo33710Ji(tantanForbidden) || coreProviderInterface.mo33653Aa(tantanForbidden) || tantanForbidden.isIdCardAuthing() || tantanForbidden.isOtherNotVerify() || tantanForbidden.isRejectedContact() || tantanForbidden.isLetterNotEnough() || coreProviderInterface.mo33763V8(tantanForbidden)) {
                    this.f72126Q.f19609U.m109085a(new d30() { // from class: l.ar7
                        @Override // p149l.d30
                        public final void call() {
                            C4740g.m32394jb(message, atomicBoolean);
                        }
                    });
                    if (coreProviderInterface.mo33710Ji(tantanForbidden)) {
                        this.f72126Q.f19624Z.f20143T.m121236q();
                    }
                    if (coreProviderInterface.mo33763V8(tantanForbidden)) {
                        this.f72126Q.f19646g1.m153051d3(message.cid);
                    }
                } else {
                    int i2 = tantanForbidden.code;
                    if (i2 == 40325 || i2 == 40339) {
                        String string = CoreModule.f17544b.getString(R$string.f55778o);
                        int i3 = tantanForbidden.code;
                        if (i3 == 40339) {
                            string = tantanForbidden.message;
                        }
                        zM32751Og = m32751Og(str, string, z, i3);
                        str4 = str3;
                    } else {
                        this.f72126Q.f19609U.m109085a(new d30() { // from class: l.cr7
                            @Override // p149l.d30
                            public final void call() {
                                this.f82186a.m32944ek(message, tantanForbidden);
                            }
                        });
                    }
                }
                str4 = str3;
                z2 = true;
            } else {
                str3 = "unknown";
            }
            if (!zM32751Og) {
                this.f72126Q.f19609U.m109085a(new d30() { // from class: l.dr7
                    @Override // p149l.d30
                    public final void call() {
                        C4740g.m32354g6(message, z2);
                    }
                });
            }
            if (TEnum.equals(message.messageType, "contact_info_rejection") && !atomicBoolean.get()) {
                this.f72126Q.f19609U.m109085a(new d30() { // from class: l.er7
                    @Override // p149l.d30
                    public final void call() {
                        C4740g.m32035Dd(message);
                    }
                });
            }
            if (TEnum.equals(message.messageType, "tickle") && message._id != 0) {
                this.f72126Q.f19609U.m109085a(new d30() { // from class: l.uq7
                    @Override // p149l.d30
                    public final void call() {
                        CoreModule.f17553k.f91940c.delete(message._id);
                    }
                });
            }
            pxz.m171970g(message, str2, str4, str, 0, SystemClock.elapsedRealtime() - j);
        }
        TantanException.Client.CoreService coreService = (TantanException.Client.CoreService) th;
        str3 = "" + coreService.code;
        int i4 = coreService.code;
        if (i4 == 40042 || coreProviderInterface.mo33785Xl(i4) || (i = coreService.code) == 40041 || i == 40044 || i == 40045) {
            this.f72126Q.f19609U.m109085a(new d30() { // from class: l.xq7
                @Override // p149l.d30
                public final void call() {
                    this.f193988a.m32933dk(message, atomicBoolean);
                }
            });
            z2 = true;
        }
        zM32751Og = z2;
        z2 = true;
        str4 = str3;
        if (!zM32751Og) {
            this.f72126Q.f19609U.m109085a(new d30() { // from class: l.dr7
                @Override // p149l.d30
                public final void call() {
                    C4740g.m32354g6(message, z2);
                }
            });
        }
        if (TEnum.equals(message.messageType, "contact_info_rejection")) {
            this.f72126Q.f19609U.m109085a(new d30() { // from class: l.er7
                @Override // p149l.d30
                public final void call() {
                    C4740g.m32035Dd(message);
                }
            });
        }
        if (TEnum.equals(message.messageType, "tickle")) {
            this.f72126Q.f19609U.m109085a(new d30() { // from class: l.uq7
                @Override // p149l.d30
                public final void call() {
                    CoreModule.f17553k.f91940c.delete(message._id);
                }
            });
        }
        pxz.m171970g(message, str2, str4, str, 0, SystemClock.elapsedRealtime() - j);
    }

    /* JADX INFO: renamed from: fl */
    public final /* synthetic */ roj0 m32957fl(Message message, Envelope envelope) {
        if (!vwb.m200296J(((CoreData) envelope.getModuleData(CoreData.class)).messages) && TextUtils.equals(((CoreData) envelope.getModuleData(CoreData.class)).messages.get(0).f56011id, message.f56011id)) {
            ((CoreData) envelope.getModuleData(CoreData.class)).messages.get(0).cid = message.cid;
        }
        this.f72126Q.m31492w3(envelope, null);
        return roj0.f160388a;
    }

    /* JADX INFO: renamed from: fm */
    public final /* synthetic */ C22306c m32958fm(Boolean bool) {
        return this.f72126Q.f19639e0.m169397H9();
    }

    /* JADX INFO: renamed from: fn */
    public C22306c<Links> m32959fn(final Links links) {
        return this.f72126Q.scheduled("conversation_delete_list", 0, new v9j() { // from class: l.va8
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f180714a.m32632Ej(links);
            }
        });
    }

    /* JADX INFO: renamed from: fo */
    public C22306c<q860<Conversation>> m32960fo() {
        return m32749Oe(m32725Me().f118482v.m167769b());
    }

    /* JADX INFO: renamed from: fp */
    public void m32961fp() {
        scheduled("users/me/chat-profiles", 0, new v9j() { // from class: l.mt7
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f135555a.m32756Ol();
            }
        });
    }

    /* JADX INFO: renamed from: fq */
    public List<Conversation> m32962fq() {
        Filter<Conversation> filterNEQ = Filter.TRUE;
        if (ura.m195053e().m195057d().mo33808c()) {
            filterNEQ = Conversation.CONVTYPE.NEQ("quickchat");
        }
        Filter<Conversation> filter = filterNEQ;
        jl6 jl6Var = CoreModule.f17553k.f91950m;
        Filter<Conversation> filterNOT_STARTS_WITH = Conversation.f20372ID.NOT_STARTS_WITH("fake_conversation");
        Filter<Conversation> filterM81223F = Conversation.READ.m81223F();
        TEnumColumn<Conversation, ConversationStatus> tEnumColumn = Conversation.STATUS;
        return jl6Var.query(Filter.AND(filterNOT_STARTS_WITH, filterM81223F, Filter.AND(tEnumColumn.NEQ("dismissed"), tEnumColumn.NEQ(ConversationStatus.local_fake), tEnumColumn.NEQ("removed"), tEnumColumn.NEQ(ConversationStatus.invisible), tEnumColumn.NEQ("deleted")), CoreModule.f17553k.f91950m.f118481u.m167769b(), Conversation.LOCALEVERHASMESSAGE.m81223F(), filter), Conversation.LATESTTIME.DESC, ura.m195053e().m195057d().mo33719Mg());
    }

    /* JADX INFO: renamed from: gf */
    public C22306c<List<Conversation>> m32963gf() {
        return m32725Me().f118458K.m167769b().m165620m();
    }

    /* JADX INFO: renamed from: gg */
    public C22306c<q860<Conversation>> m32964gg(final String str) {
        return this.f72126Q.scheduled("getFilterConversationList/" + str, 0, new v9j() { // from class: l.zy7
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f205665a.m32741Ni(str);
            }
        });
    }

    /* JADX INFO: renamed from: gh */
    public final void m32965gh(Message message, boolean z, double d2) {
        if (z) {
            List<T> listM165617j = CoreModule.f17553k.f91940c.m206065W(message.cid).m165617j();
            if (!vwb.m200296J(listM165617j)) {
                double d3 = ((Message) listM165617j.get(0)).createdTime + 1.0d;
                message.createdTime = d3;
                if (d2 > d3) {
                    double d4 = d2 + 10.0d;
                    message.createdTime = d4;
                    message.localCreatedTime = (long) d4;
                }
            }
        }
        CoreModule.f17553k.f91940c.upsert(message);
    }

    /* JADX INFO: renamed from: gi */
    public final /* synthetic */ void m32966gi() {
        this.f72126Q.f19609U.m109085a(new d30() { // from class: l.kz7
            @Override // p149l.d30
            public final void call() {
                CoreModule.f17553k.f91950m.delete(Conversation.f20372ID.STARTS_WITH("fake_conversation_anim"));
            }
        });
    }

    /* JADX INFO: renamed from: gj */
    public final /* synthetic */ C22306c m32967gj(DbLinks dbLinks) {
        if (dbLinks == null || TextUtils.isEmpty(dbLinks.links.previous)) {
            DbLinks dbLinksNew_ = DbLinks.new_();
            dbLinksNew_.f56011id = SchemeKey.conversations;
            dbLinksNew_.links.next = C4728a.f19486H;
            return m32852Wm(dbLinksNew_);
        }
        if (dbLinks.links.next != null) {
            return m32852Wm(dbLinks);
        }
        if (this.f19984v2.get().longValue() != 0 && qqi0.m175940h(qib0.f154693H.guessedCurrentServerTime(), this.f19984v2.get().longValue(), 60)) {
            this.f72126Q.f19609U.m109085a(new d30() { // from class: l.vu7
                @Override // p149l.d30
                public final void call() {
                    C4740g.m32259Y5();
                }
            });
            DbLinks dbLinksNew_2 = DbLinks.new_();
            dbLinksNew_2.f56011id = SchemeKey.conversations;
            dbLinksNew_2.links.next = C4728a.f19486H;
            return m32852Wm(dbLinksNew_2);
        }
        if (!m32613Cq()) {
            return m32912bn(dbLinks);
        }
        DbLinks dbLinksNew_3 = DbLinks.new_();
        dbLinksNew_3.f56011id = SchemeKey.conversations;
        dbLinksNew_3.links.next = C4728a.f19486H;
        return m32852Wm(dbLinksNew_3);
    }

    /* JADX INFO: renamed from: gk */
    public final /* synthetic */ void m32968gk(Message message, String str, Envelope envelope, boolean z, boolean z2, boolean z3) {
        message.cid = str;
        CoreModule.f17553k.f91940c.updateBy_id(message);
        ((CoreData) envelope.getModuleData(CoreData.class)).messages.clear();
        if (!CoreModule.m29931H().userId().equals(str) && z && m33182xh(str)) {
            Conversation conversationM32735Mo = m32735Mo(message.cid);
            if (conversationM32735Mo == null && z2) {
                conversationM32735Mo = m32783Qo(message);
            }
            if (NullChecker.m81303a(conversationM32735Mo)) {
                conversationM32735Mo.latestTime = message.createdTime;
                CoreModule.f17553k.f91950m.upsert(conversationM32735Mo);
            }
        }
        if (z3 && !TextUtils.isEmpty(message.moment)) {
            CoreModule.m29934N().mo60269D8(message.moment, message.f56011id);
        }
        if (TEnum.equals(message.messageType, MessageType.ice_breaking)) {
            Conversation conversationM32735Mo2 = m32735Mo(str);
            if (NullChecker.m81303a(conversationM32735Mo2) && NullChecker.m81303a(conversationM32735Mo2.property)) {
                ConversationIceBreaking conversationIceBreaking = conversationM32735Mo2.property.iceBreaking;
                if (conversationIceBreaking == null || TextUtils.isEmpty(conversationIceBreaking.answeredMsgId)) {
                    conversationM32735Mo2.property.iceBreaking = ConversationIceBreaking.new_();
                    conversationM32735Mo2.property.iceBreaking.answeredMsgId = message.f56011id;
                    CoreModule.f17553k.f91950m.upsert(conversationM32735Mo2);
                }
            }
        }
    }

    /* JADX INFO: renamed from: gl */
    public final /* synthetic */ C22306c m32969gl(final Message message) {
        return new la20((v9j<stc0>) new v9j() { // from class: l.xv7
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                Message message2 = message;
                return C4728a.f19494P.auth().m185898q(C4728a.m31242R0(message2.hostId, message2.f56011id) + "&action=readDetail").m185892k(utc0.create(Network.JSON, message2.toJson())).m185883b();
            }
        }, 0).map(new w9j() { // from class: l.yv7
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f200238a.m32957fl(message, (Envelope) obj);
            }
        }).compose(C4728a.m31252T2());
    }

    /* JADX INFO: renamed from: gm */
    public final /* synthetic */ Boolean m32970gm(roj0 roj0Var) {
        if (!NullChecker.m81303a(this.f72126Q.m31484o3().growth)) {
            return Boolean.FALSE;
        }
        if (this.f72126Q.m31484o3().growth.remaining > 0) {
            return Boolean.TRUE;
        }
        e51.m114742G(new Runnable() { // from class: l.sp7
            @Override // java.lang.Runnable
            public final void run() {
                lsi0.m151595y("您今日已达到分享用户次数的上线啦~明天再来吧");
            }
        });
        return Boolean.FALSE;
    }

    /* JADX INFO: renamed from: gn */
    public void m32971gn() {
        if (wf6.m202951f() && mqi0.m155944o() >= this.f72126Q.f19639e0.f149494w1.get().longValue()) {
            CoreModule.f17545c.f19642f0.m33073on().map(new w9j() { // from class: l.cw7
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(((q860) obj).m173343c());
                }
            }).filter(new w9j() { // from class: l.dw7
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(!((Boolean) obj).booleanValue());
                }
            }).first().observeOn(Schedulers.m221493io()).map(new w9j() { // from class: l.fw7
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return this.f99624a.m32645Fj((Boolean) obj);
                }
            }).subscribe(mkd0.m154956H(new e30() { // from class: l.gw7
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f104682a.m32658Gj((xaj0) obj);
                }
            }, new e30() { // from class: l.hw7
                @Override // p149l.e30
                public final void call(Object obj) {
                    C4740g.m32412l7((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: go */
    public void m32972go() {
        this.f19864H2.m132487l(roj0.f160388a);
    }

    /* JADX INFO: renamed from: gp */
    public C22306c<roj0> m32973gp(final String str) {
        return this.f72126Q.scheduled("refreshRecentMessages_" + str, 0, new v9j() { // from class: l.r28
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f157388a.m32780Ql(str);
            }
        });
    }

    /* JADX INFO: renamed from: gq */
    public void m32974gq() {
        this.f19843A2.unsubscribe();
    }

    /* JADX INFO: renamed from: hf */
    public C22306c<q860<Conversation>> m32975hf() {
        return m32749Oe(m32725Me().f118453F);
    }

    /* JADX INFO: renamed from: hg */
    public double m32976hg() {
        long timeInMillis;
        if (ura.m195053e().m195057d().mo33764Vb()) {
            timeInMillis = this.f19946j0.get().longValue();
        } else {
            long j = this.f19943i0;
            if (j >= 1) {
                return j;
            }
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(mqi0.m155944o());
            calendar.set(calendar.get(1), calendar.get(2), calendar.get(5), 0, 0, 0);
            timeInMillis = calendar.getTimeInMillis() - (((long) (ura.m195053e().m195057d().mo33675Dt() - 1)) * 86400000);
        }
        return timeInMillis;
    }

    /* JADX INFO: renamed from: hh */
    public void m32977hh(String str) {
        m32930dh(str, MessageType.get(MessageType.local_pic_cert_guide));
    }

    /* JADX INFO: renamed from: hj */
    public final /* synthetic */ C22306c m32979hj(DbLinks dbLinks) {
        if (dbLinks == null) {
            return C22306c.fromCallable(new Callable() { // from class: l.wp7
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return C4740g.m32304c4();
                }
            }).flatMap(new w9j() { // from class: l.xp7
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return this.f193901a.m32967gj((DbLinks) obj);
                }
            }).compose(mkd0.m154951C());
        }
        return dbLinks.links.next != null ? m32852Wm(dbLinks).compose(mkd0.m154951C()) : m32912bn(dbLinks).compose(mkd0.m154951C());
    }

    /* JADX INFO: renamed from: hk */
    public final /* synthetic */ Message m32980hk(Message message, final String str, final boolean z, final boolean z2, final boolean z3, final Envelope envelope) {
        if (vwb.m200296J(((CoreData) envelope.getModuleData(CoreData.class)).messages)) {
            CrashHelper.m81302i(new Exception("return null messages"), "core_post_message", CrashHelper.ReportLevel.p5, 100);
            return message;
        }
        final Message message2 = ((CoreData) envelope.getModuleData(CoreData.class)).messages.get(0);
        message2.localCreatedTime = message.localCreatedTime;
        message2._id = message._id;
        message2.cid = str;
        if (z) {
            message2.messageType = MessageType.get("moment_comment");
        }
        String strM200493u = vx6.m200493u(message2.value);
        if (!TextUtils.isEmpty(strM200493u)) {
            message2.localAnimationKey = strM200493u;
        }
        this.f72126Q.m31492w3(envelope, new d30() { // from class: l.cy7
            @Override // p149l.d30
            public final void call() {
                this.f82924a.m32968gk(message2, str, envelope, z2, z3, z);
            }
        });
        if (!z && !User.isTeamAccount(str)) {
            ura.m195053e().m195057d().mo33781Xb(1);
            if (ura.m195053e().m195057d().mo33730O()) {
                this.f19910X.m132487l(message2);
            }
            CoreModule.f17545c.f19655j1.m30133j(message2);
        }
        this.f19913Y.m132487l(message2);
        return message2;
    }

    /* JADX INFO: renamed from: hl */
    public final /* synthetic */ void m32981hl(final List list, final Envelope envelope) {
        this.f72126Q.f19609U.m109085a(new d30() { // from class: l.s68
            @Override // p149l.d30
            public final void call() {
                C4740g.m32409l4(envelope, list);
            }
        });
    }

    /* JADX INFO: renamed from: hm */
    public final /* synthetic */ C22306c m32982hm(String str, String str2, boolean z, roj0 roj0Var) {
        return m33169wg(str, str2, z);
    }

    /* JADX INFO: renamed from: hn, reason: merged with bridge method [inline-methods] */
    public final void m32669Hi(String str, AudioText audioText) {
        if (NullChecker.m81303a(audioText)) {
            final Message messageQuery = CoreModule.f17553k.f91940c.query(str);
            if (NullChecker.m81303a(messageQuery)) {
                messageQuery.localAudioText = audioText;
                this.f72126Q.f19609U.m109085a(new d30() { // from class: l.q28
                    @Override // p149l.d30
                    public final void call() {
                        CoreModule.f17553k.f91940c.upsert(messageQuery);
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: ho */
    public void m32984ho(boolean z, List<Conversation> list) {
        if (z) {
            this.f19870J2.m132487l(list);
        } else {
            this.f19873K2.m132487l(list);
        }
    }

    /* JADX INFO: renamed from: hp */
    public void m32985hp(boolean z) {
        this.f72126Q.f19642f0.f19856F0.m132487l(Boolean.valueOf(z));
    }

    /* JADX INFO: renamed from: hq */
    public List<Conversation> m32986hq() {
        return CoreModule.f17553k.f91950m.m142001n1();
    }

    /* JADX INFO: renamed from: ie */
    public int m32987ie(List<String> list) {
        return CoreModule.f17553k.f91950m.m141994k0(list);
    }

    /* JADX INFO: renamed from: ig */
    public double m32988ig() {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(mqi0.m155944o());
        calendar.set(calendar.get(1), calendar.get(2), calendar.get(5), 0, 0, 0);
        return calendar.getTimeInMillis() - (((long) (ura.m195053e().m195057d().mo33675Dt() - 1)) * 86400000);
    }

    /* JADX INFO: renamed from: ih */
    public void m32989ih(String str, String str2) {
        m32882Zg(m33078pf(str, MessageType.get(MessageType.local_ux_questionnaire_tip), str2));
    }

    /* JADX INFO: renamed from: ii */
    public final /* synthetic */ roj0 m32990ii(final String str) throws Exception {
        this.f72126Q.f19609U.m109085a(new d30() { // from class: l.yu7
            @Override // p149l.d30
            public final void call() {
                this.f200052a.m32978hi(str);
            }
        });
        return roj0.f160388a;
    }

    /* JADX INFO: renamed from: ij */
    public final /* synthetic */ Envelope m32991ij(Envelope envelope) {
        if (!vwb.m200296J(((CoreData) envelope.getModuleData(CoreData.class)).conversations)) {
            final List<User> list = ((CommonData) envelope.getModuleData(CommonData.class)).users;
            final List<FriendInfo> list2 = ((CoreData) envelope.getModuleData(CoreData.class)).friends;
            this.f72126Q.m31492w3(envelope, new d30() { // from class: l.f48
                @Override // p149l.d30
                public final void call() {
                    vwb.m200354z(list, new e30() { // from class: l.t78
                        @Override // p149l.e30
                        public final void call(Object obj) {
                            C4740g.m32276Zb(list, (User) obj);
                        }
                    });
                }
            });
        }
        return envelope;
    }

    /* JADX INFO: renamed from: ik */
    public final /* synthetic */ C22306c m32992ik(final String str, final Message message, final boolean z, final boolean z2, final boolean z3, e30 e30Var) {
        return m32190Ro(str, message).doOnNext(new e30() { // from class: l.gt7
            @Override // p149l.e30
            public final void call(Object obj) {
                C4740g.m32429md(message, str, (Envelope) obj);
            }
        }).map(new w9j() { // from class: l.ht7
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f109369a.m32980hk(message, str, z, z2, z3, (Envelope) obj);
            }
        }).doOnError(e30Var).compose(C4728a.m31252T2());
    }

    /* JADX INFO: renamed from: il */
    public final /* synthetic */ C22306c m32993il(final String str, final List list, final JSONArray jSONArray) {
        return NullChecker.m81303a(jSONArray) ? ia20.m135121e(new v9j() { // from class: l.g48
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4728a.f19494P.auth().m185898q(C4728a.m31213J0("/conversations/" + str + "/read-messages")).m185893l(utc0.create(Network.JSON, jSONArray.toString())).m185883b();
            }
        }).doOnNext(new e30() { // from class: l.i48
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f111415a.m32981hl(list, (Envelope) obj);
            }
        }).map(new w9j() { // from class: l.j48
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return roj0.f160388a;
            }
        }) : C22306c.empty();
    }

    /* JADX INFO: renamed from: im */
    public final /* synthetic */ void m32994im(String str, String str2, Picture.ImageUri imageUri, boolean z, String str3, CipherId cipherId) {
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
        User userM169524oa = this.f72126Q.f19639e0.m169524oa(str);
        boolean z2 = NullChecker.m81303a(userM169524oa) && TextUtils.isEmpty(str2) && userM169524oa.onlineMatchLocked();
        if (juk.m143323e()) {
            str4 = "http://m.staging2.p1staff.com/fep/tantan/frontend/tantan-frontend-app-pages-v2/src/pages/core/userShare/index.html?u=" + cipherId.userId + "&f=" + z2 + "&m=" + cipherId.momentId;
        } else {
            str4 = "https://wechat.tantanapp.com/uni-fep/tantan/frontend/tantan-frontend-app-pages-v2/src/pages/core/userShare/index.html?u=" + cipherId.userId + "&f=" + z2 + "&m=" + cipherId.momentId;
        }
        String str5 = str4;
        if (NullChecker.m81303a(imageUri)) {
            m32700Jp(str5, imageUri.formatted(), z, str3, NullChecker.m81303a(userM169524oa) ? userM169524oa.isFemale() : false);
        } else {
            m32700Jp(str5, "", z, str3, NullChecker.m81303a(userM169524oa) ? userM169524oa.isFemale() : false);
        }
    }

    /* JADX INFO: renamed from: in */
    public C22306c<j760<Integer, Message>> m32995in(String str, String str2) {
        return mkd0.m154985s(CoreModule.f17553k.f91940c.m206077i0(str).m165620m(), CoreModule.f17553k.f91940c.m206072d0(str).m165620m(), CoreModule.f17545c.f19642f0.m32737Ne(str2), new y9j() { // from class: l.au7
            @Override // p149l.y9j
            /* JADX INFO: renamed from: a */
            public final Object mo94599a(Object obj, Object obj2, Object obj3) {
                return C4740g.m32052F8((List) obj, (List) obj2, (Conversation) obj3);
            }
        });
    }

    /* JADX INFO: renamed from: io */
    public void m32996io(int i) {
        this.f19867I2.m132487l(Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: ip */
    public C22306c<roj0> m32997ip() {
        return this.f19966p2;
    }

    /* JADX INFO: renamed from: iq */
    public C22306c<List<Message>> m32998iq(String str) {
        return CoreModule.f17553k.f91940c.m206078j0(str).m165620m();
    }

    /* JADX INFO: renamed from: je */
    public void m32999je(List<String> list) {
        n11.m157333f();
        if (vwb.m200296J(list)) {
            return;
        }
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            Conversation conversationQuery = CoreModule.f17553k.f91950m.query(it.next());
            if (NullChecker.m81303a(conversationQuery)) {
                conversationQuery.level = 50;
                CoreModule.f17553k.f91950m.upsert(conversationQuery);
            }
        }
    }

    /* JADX INFO: renamed from: jf */
    public int m33000jf() {
        return CoreModule.f17553k.f91950m.m141990i0();
    }

    /* JADX INFO: renamed from: jg */
    public boolean m33001jg(String str, boolean z) {
        String str2;
        Conversation conversationM33216zp = m33216zp(str);
        if (conversationM33216zp != null && (str2 = conversationM33216zp.localExtraInfo) != null && !TextUtils.isEmpty(str2) && (z || TEnum.equals(conversationM33216zp.status, "dismissed"))) {
            try {
                return new JSONObject(conversationM33216zp.localExtraInfo).getBoolean("keep_message_history");
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: jh */
    public void m33002jh(String str) {
        Message messageNew_ = Message.new_();
        messageNew_.messageType = MessageType.get(MessageType.local_match_ice_break);
        messageNew_.cid = str;
        messageNew_.localInConversation = true;
        long jGuessedCurrentServerTime = qib0.f154693H.guessedCurrentServerTime();
        messageNew_.owner = CoreModule.m29931H().userId();
        messageNew_.createdTime = jGuessedCurrentServerTime;
        messageNew_.localCreatedTime = jGuessedCurrentServerTime;
        messageNew_.recalled = Boolean.FALSE;
        messageNew_.hostId = CoreModule.m29931H().userId();
        tpd0 tpd0Var = App.f15373i;
        messageNew_.localCreatedSession = tpd0Var.get().intValue();
        messageNew_.f56011id = DbObject.GENERATE_UNIQUE_FAKE_ID(tpd0Var.get().intValue());
        messageNew_.value = "";
        m32894ah(messageNew_, false);
    }

    /* JADX INFO: renamed from: ji */
    public final /* synthetic */ void m33003ji(Set set) {
        set.forEach(new a());
    }

    /* JADX INFO: renamed from: jj */
    public final /* synthetic */ roj0 m33004jj(String str, Envelope envelope) {
        List<Conversation> list = ((CoreData) envelope.getModuleData(CoreData.class)).conversations;
        q860<Conversation> q860VarM221515e = this.f19912X1.m221515e();
        if (q860VarM221515e == null || TextUtils.isEmpty(str)) {
            DbLinks dbLinks = new DbLinks();
            dbLinks.links = envelope.pagination.links;
            q860VarM221515e = new q860<>(list, dbLinks);
        } else if (!TextUtils.isEmpty(str)) {
            q860VarM221515e.f153135a.addAll(list);
            q860VarM221515e.f153136b.links = envelope.pagination.links;
        }
        this.f19912X1.m132487l(q860VarM221515e);
        return roj0.f160388a;
    }

    /* JADX INFO: renamed from: jk */
    public final /* synthetic */ C22306c m33005jk(final String str, final boolean z, final boolean z2, final boolean z3, final e30 e30Var, final Message message) {
        return this.f72126Q.scheduled("postTheMessage", -1, new v9j() { // from class: l.lq7
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f129298a.m32992ik(str, message, z, z2, z3, e30Var);
            }
        });
    }

    /* JADX INFO: renamed from: jl */
    public final /* synthetic */ C22306c m33006jl(final List list, final String str) {
        return C22306c.fromCallable(new Callable() { // from class: l.jy7
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C4740g.m32109Ka(list);
            }
        }).flatMap(new w9j() { // from class: l.ky7
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f125253a.m32993il(str, list, (JSONArray) obj);
            }
        });
    }

    /* JADX INFO: renamed from: jn */
    public C22306c<List<Conversation>> m33008jn(boolean z) {
        return m33021kn(z).m165620m();
    }

    /* JADX INFO: renamed from: jo */
    public void m33009jo() {
        this.f72126Q.scheduled("notifyServerChangeToConversationTab", 0, new v9j() { // from class: l.pp7
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return ia20.m135117a(new v9j() { // from class: l.ft7
                    @Override // p149l.v9j, java.util.concurrent.Callable
                    public final Object call() {
                        return C4728a.f19494P.auth().m185898q(C4728a.m31200G("/live-chat-tab-report")).m185893l(utc0.create(Network.JSON, "")).m185883b();
                    }
                });
            }
        }).map(new w9j() { // from class: l.qp7
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((CoreData) ((Envelope) obj).getModuleData(CoreData.class)).onlineLiveChatPair;
            }
        }).onErrorReturn(new w9j() { // from class: l.rp7
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return C4740g.m32075H9((Throwable) obj);
            }
        }).subscribe();
    }

    /* JADX INFO: renamed from: jp */
    public void m33010jp() {
        this.f72126Q.f19685t1.m31510o(vwb.m200324f0("countdown_card_conv_key", "countdown_conv_list_key")).filter(new w9j() { // from class: l.it7
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((RunnableC4733c0.b) obj).f19721a);
            }
        }).subscribe(new e30() { // from class: l.jt7
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f119576a.m32792Rl((RunnableC4733c0.b) obj);
            }
        });
    }

    /* JADX INFO: renamed from: jq */
    public C22306c<List<Conversation>> m33011jq() {
        return CoreModule.f17553k.f91950m.f118474n.m165620m();
    }

    /* JADX INFO: renamed from: ke */
    public void m33012ke() {
        User userM169527p9 = this.f72126Q.f19639e0.m169527p9();
        final String str = this.f72126Q.f19642f0.f19868J0.get();
        if (!NullChecker.m81303a(userM169527p9) || userM169527p9.isFemale() || TextUtils.isEmpty(str)) {
            return;
        }
        mkd0.m154992z(this.f19894R1);
        this.f19894R1 = this.f72126Q.f19642f0.m32737Ne(str).subscribe(new e30() { // from class: l.cu7
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f82530a.m32604Ch(str, (Conversation) obj);
            }
        });
    }

    /* JADX INFO: renamed from: kf */
    public int m33013kf() {
        return CoreModule.f17553k.f91950m.f118448A.m165612e();
    }

    /* JADX INFO: renamed from: kg */
    public C22306c<LogoutCounterEnvelope> m33014kg() {
        final v9j v9jVar = new v9j() { // from class: l.ev7
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return qib0.f154693H.auth().m185898q(C4728a.m31268Y("/persuade/counter")).m185887f().m185883b();
            }
        };
        return scheduled("logout_persuade_counter", 0, new v9j() { // from class: l.fv7
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return new ka20(v9jVar, LogoutCounterEnvelope.JSON_ADAPTER).compose(mkd0.m154951C());
            }
        }, false);
    }

    /* JADX INFO: renamed from: kh */
    public void m33015kh(String str) {
        Message messageNew_ = Message.new_();
        messageNew_.messageType = MessageType.get(MessageType.local_moment_post_guide);
        messageNew_.cid = str;
        messageNew_.localInConversation = true;
        long jGuessedCurrentServerTime = qib0.f154693H.guessedCurrentServerTime();
        messageNew_.owner = CoreModule.m29931H().userId();
        messageNew_.createdTime = jGuessedCurrentServerTime;
        messageNew_.localCreatedTime = jGuessedCurrentServerTime;
        messageNew_.recalled = Boolean.FALSE;
        messageNew_.hostId = CoreModule.m29931H().userId();
        tpd0 tpd0Var = App.f15373i;
        messageNew_.localCreatedSession = tpd0Var.get().intValue();
        messageNew_.f56011id = DbObject.GENERATE_UNIQUE_FAKE_ID(tpd0Var.get().intValue());
        messageNew_.value = "";
        m32894ah(messageNew_, false);
    }

    /* JADX INFO: renamed from: ki */
    public final /* synthetic */ void m33016ki(List list) {
        try {
            final HashSet hashSet = new HashSet();
            if (list != null) {
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    Conversation conversation = (Conversation) list.get(i);
                    if (m32712Kp(conversation)) {
                        hashSet.add(conversation.f56011id);
                    }
                }
            }
            if (hashSet.isEmpty()) {
                return;
            }
            this.f72126Q.f19609U.m109085a(new d30() { // from class: l.bz7
                @Override // p149l.d30
                public final void call() {
                    this.f78005a.m33003ji(hashSet);
                }
            });
        } catch (Exception e) {
            CrashHelper.m81296c(e);
        }
    }

    /* JADX INFO: renamed from: kj */
    public final /* synthetic */ C22306c m33017kj(final String str, final String str2) {
        return ia20.m135121e(new v9j() { // from class: l.q08
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4728a.f19494P.auth().m185898q(C4728a.m31211I2(str)).m185883b();
            }
        }).map(new w9j() { // from class: l.r08
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f157151a.m32991ij((Envelope) obj);
            }
        }).observeOn(jo0.m142408a()).map(new w9j() { // from class: l.s08
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f161755a.m33004jj(str2, (Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: kk */
    public final /* synthetic */ Boolean m33018kk(String str, Message message, String str2, long j, Message message2) {
        Conversation conversationM32735Mo = m32735Mo(str);
        if (ura.m195053e().m195057d().mo33676E() && NullChecker.m81303a(conversationM32735Mo) && ura.m195053e().m195057d().mo33727Nd(conversationM32735Mo)) {
            return Boolean.TRUE;
        }
        final User userQuery = qib0.f154722k0.f176631d.query(message2.cid);
        if (userQuery == null ? false : userQuery.unilateralBlock()) {
            pxz.m171970g(message, str2, "lift_match", str, 0, SystemClock.elapsedRealtime() - j);
            m33168we(message2, new e30() { // from class: l.ca8
                @Override // p149l.e30
                public final void call(Object obj) {
                    C4740g.m32274Z9(userQuery, (Message) obj);
                }
            });
            this.f19907W.m132487l(new Exception("You've been unmatched"));
            if (ura.m195053e().m195057d().mo33931u() && NullChecker.m81303a(conversationM32735Mo) && conversationM32735Mo.isHeartbeatConv()) {
                this.f72126Q.f19571H1.f184098R.m132487l(message);
            }
            return Boolean.FALSE;
        }
        if (ura.m195053e().m195057d().mo33745R8() && NullChecker.m81303a(conversationM32735Mo) && "lovebuzz".equals(conversationM32735Mo.convType)) {
            int i = conversationM32735Mo.f20374mm;
            if (((NullChecker.m81303a(conversationM32735Mo.property) && NullChecker.m81303a(conversationM32735Mo.property.intl_love_buzz) && TextUtils.equals("textBuzz", conversationM32735Mo.property.intl_love_buzz.biz)) ? conversationM32735Mo.property.intl_love_buzz.expire - mqi0.m155944o() : 1000L) <= 0 && i < 10) {
                m33155ve(message, 8, null);
                return Boolean.FALSE;
            }
        }
        return Boolean.TRUE;
    }

    /* JADX INFO: renamed from: kl */
    public final /* synthetic */ Optional m33019kl(String str) throws Exception {
        final Conversation conversationM32735Mo = m32735Mo(str);
        List<Message> listM165617j = CoreModule.f17553k.f91940c.m206080l0(str).m165617j();
        if (!m32736Mp(conversationM32735Mo, listM165617j)) {
            return Optional.absent();
        }
        Message message = (Message) vwb.m200346r(listM165617j, new w9j() { // from class: l.s18
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(TEnum.equals(((Message) obj).status(), "normal"));
            }
        });
        final ConversationPatchRecord conversationPatchRecordNew_ = ConversationPatchRecord.new_();
        conversationPatchRecordNew_.state = ConversationPatchState.get("default");
        conversationPatchRecordNew_.f56011id = str;
        conversationPatchRecordNew_.readUtil = message == null ? "" : message.f56011id;
        this.f72126Q.f19609U.m109085a(new d30() { // from class: l.d28
            @Override // p149l.d30
            public final void call() {
                C4740g.m32101Jd(conversationPatchRecordNew_, conversationM32735Mo);
            }
        });
        return Optional.m15413of(conversationPatchRecordNew_);
    }

    /* JADX INFO: renamed from: km */
    public final /* synthetic */ void m33020km(String str) {
        Conversation conversationM32735Mo = m32735Mo(str);
        if (NullChecker.m81303a(conversationM32735Mo)) {
            CoreModule.f17553k.f91950m.delete(str);
        }
        m33114rp(conversationM32735Mo);
    }

    /* JADX INFO: renamed from: kn */
    public final orh0.C19008a m33021kn(boolean z) {
        return (z && this.f72126Q.f19642f0.f19982v0.get().booleanValue() && this.f72126Q.f19642f0.m32905bg()) ? m32725Me().f118463P.m167769b() : m32725Me().f118458K.m167769b();
    }

    /* JADX INFO: renamed from: ko */
    public C22306c<j760<Integer, Message>> m33022ko(String str, String str2) {
        return ura.m195053e().m195057d().mo33935v() ? m33035lo(str, str2) : mkd0.m154985s(CoreModule.f17553k.f91940c.m206076h0(str).m165620m(), CoreModule.f17553k.f91940c.m206071c0(str).m165620m(), CoreModule.f17545c.f19642f0.m32737Ne(str2), new y9j() { // from class: l.a38
            @Override // p149l.y9j
            /* JADX INFO: renamed from: a */
            public final Object mo94599a(Object obj, Object obj2, Object obj3) {
                return C4740g.m32180R4((List) obj, (List) obj2, (Conversation) obj3);
            }
        });
    }

    /* JADX INFO: renamed from: kp */
    public void m33023kp(final String str) {
        this.f72126Q.scheduled("reject_receive_msg_" + str, -1, new v9j() { // from class: l.s58
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4740g.m32087Ia(str);
            }
        }, false).subscribe(new e30() { // from class: l.t58
            @Override // p149l.e30
            public final void call(Object obj) {
                lsi0.m151595y("已拒收");
            }
        }, new e30() { // from class: l.u58
            @Override // p149l.e30
            public final void call(Object obj) {
                lsi0.m151595y("再试一次");
            }
        });
    }

    /* JADX INFO: renamed from: kq */
    public void m33024kq(final String str, final double d2) {
        this.f72126Q.f19609U.m109085a(new d30() { // from class: l.m08
            @Override // p149l.d30
            public final void call() {
                C4740g.m32254Xb(str, d2);
            }
        });
    }

    /* JADX INFO: renamed from: le */
    public C22306c<List<Conversation>> m33025le() {
        return CoreModule.f17553k.f91950m.f118480t.m165620m();
    }

    /* JADX INFO: renamed from: lf */
    public int m33026lf() {
        return CoreModule.f17553k.f91950m.m141996l0();
    }

    /* JADX INFO: renamed from: lg */
    public C22306c<List<LogoutRecommendUser>> m33027lg(final List<Conversation> list) {
        return this.f72126Q.scheduled("logout_persuade_users", -1, new v9j() { // from class: l.vv7
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return ia20.m135119c(new v9j() { // from class: l.ey7
                    @Override // p149l.v9j, java.util.concurrent.Callable
                    public final Object call() {
                        return C4740g.m32064G9(list);
                    }
                }, LogoutRecommendEnvelope.JSON_ADAPTER);
            }
        }).map(new w9j() { // from class: l.wv7
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return C4740g.m32082I5((LogoutRecommendEnvelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: lh */
    public void m33028lh(String str) {
        Message messageNew_ = Message.new_();
        messageNew_.messageType = MessageType.get(MessageType.tag_guide);
        messageNew_.cid = str;
        messageNew_.localInConversation = true;
        long jGuessedCurrentServerTime = qib0.f154693H.guessedCurrentServerTime();
        messageNew_.owner = CoreModule.m29931H().userId();
        messageNew_.createdTime = jGuessedCurrentServerTime;
        messageNew_.localCreatedTime = jGuessedCurrentServerTime;
        messageNew_.recalled = Boolean.FALSE;
        messageNew_.hostId = CoreModule.m29931H().userId();
        tpd0 tpd0Var = App.f15373i;
        messageNew_.localCreatedSession = tpd0Var.get().intValue();
        messageNew_.f56011id = DbObject.GENERATE_UNIQUE_FAKE_ID(tpd0Var.get().intValue());
        messageNew_.value = "";
        m32894ah(messageNew_, false);
    }

    /* JADX INFO: renamed from: li */
    public final /* synthetic */ void m33029li() {
        this.f72126Q.f19609U.m109085a(new d30() { // from class: l.ex7
            @Override // p149l.d30
            public final void call() {
                C4740g.m32229V8();
            }
        });
    }

    /* JADX INFO: renamed from: lj */
    public final /* synthetic */ void m33030lj(Envelope envelope, final Conversation conversation) {
        if (!ura.m195053e().m195057d().mo33727Nd(conversation)) {
            m32728Mh(conversation.f56011id);
            return;
        }
        final ArrayList arrayList = new ArrayList();
        if (!vwb.m200296J(((CoreData) envelope.getModuleData(CoreData.class)).messages)) {
            vwb.m200354z(((CoreData) envelope.getModuleData(CoreData.class)).messages, new e30() { // from class: l.d68
                @Override // p149l.e30
                public final void call(Object obj) {
                    C4740g.m32472qc(conversation, arrayList, (Message) obj);
                }
            });
            ((CoreData) envelope.getModuleData(CoreData.class)).messages.removeAll(arrayList);
        }
        m32728Mh(conversation.f56011id);
    }

    /* JADX INFO: renamed from: lk */
    public final /* synthetic */ Message m33031lk(Message message, String str, final Message message2) {
        final boolean z = (this.f19898T.booleanValue() && m32578Ah(message.value, str)) || message.localFailType == 4;
        if (!qib0.f154711Z.m119125K(message2.value) && !qib0.f154711Z.m119127M(message2.value) && !z) {
            return message2;
        }
        if (this.f19898T.booleanValue()) {
            this.f19898T = Boolean.FALSE;
            this.f72126Q.f19609U.m109085a(new d30() { // from class: l.tp7
                @Override // p149l.d30
                public final void call() {
                    C4740g.m32022Cb(message2, z);
                }
            });
        } else {
            this.f72126Q.f19609U.m109085a(new d30() { // from class: l.vp7
                @Override // p149l.d30
                public final void call() {
                    C4740g.m32541x3(message2);
                }
            });
        }
        return CoreModule.f17553k.f91940c.query(message2._id);
    }

    /* JADX INFO: renamed from: ll */
    public final /* synthetic */ void m33032ll(NetworkInfo networkInfo) {
        m32611Co();
    }

    /* JADX INFO: renamed from: lm */
    public final /* synthetic */ void m33033lm() {
        this.f72126Q.f19642f0.m32959fn(null);
        this.f72126Q.f19642f0.m32650Fo();
        CoreModule.f17545c.f19642f0.m32938dq(qib0.f154693H.guessedCurrentServerTime());
    }

    /* JADX INFO: renamed from: ln */
    public void m33034ln() {
        User userMo223809clone = CoreModule.f17545c.f19639e0.m169520na().mo223809clone();
        ProfileCompletion profileCompletion = userMo223809clone.profile.extensions.profileCompletion;
        List list = Collections.EMPTY_LIST;
        profileCompletion.briefIntroduction = vwb.m200317c(list, "测试输入数据");
        userMo223809clone.profile.extensions.profileCompletion.progress = vwb.m200317c(list, "finished");
        CoreModule.f17545c.f19639e0.m169547u9(userMo223809clone.subtract(CoreModule.f17545c.f19639e0.m169520na()));
    }

    /* JADX INFO: renamed from: lo */
    public C22306c<j760<Integer, Message>> m33035lo(String str, String str2) {
        return mkd0.m154985s(CoreModule.f17553k.f91940c.m206076h0(str).m165620m(), CoreModule.f17553k.f91940c.m206071c0(str).m165620m(), CoreModule.f17545c.f19642f0.m32737Ne(str2), new y9j() { // from class: l.zu7
            @Override // p149l.y9j
            /* JADX INFO: renamed from: a */
            public final Object mo94599a(Object obj, Object obj2, Object obj3) {
                return C4740g.m32273Z8((List) obj, (List) obj2, (Conversation) obj3);
            }
        }).doOnError(new e30() { // from class: l.av7
            @Override // p149l.e30
            public final void call(Object obj) {
                C4740g.m32061G6((Throwable) obj);
            }
        });
    }

    /* JADX INFO: renamed from: lp */
    public void m33036lp() {
        e51.m114775z(new Runnable() { // from class: l.jr7
            @Override // java.lang.Runnable
            public final void run() {
                this.f119382a.m32803Sl();
            }
        }, false);
    }

    /* JADX INFO: renamed from: lq */
    public void m33037lq(final double d2) {
        e51.m114774y(new Runnable() { // from class: l.hq7
            @Override // java.lang.Runnable
            public final void run() {
                this.f109035a.m32583Am(d2);
            }
        });
    }

    /* JADX INFO: renamed from: me */
    public final Message m33038me(String str, String str2) {
        Message messageNew_ = Message.new_();
        messageNew_.messageType = MessageType.get(MessageType.ai_chat_analysis_guide);
        messageNew_.cid = str;
        messageNew_.localInConversation = true;
        long jM155944o = mqi0.m155944o();
        messageNew_.owner = CoreModule.m29931H().userId();
        messageNew_.createdTime = jM155944o;
        messageNew_.localCreatedTime = jM155944o;
        messageNew_.recalled = Boolean.FALSE;
        messageNew_.hostId = CoreModule.m29931H().userId();
        tpd0 tpd0Var = App.f15373i;
        messageNew_.localCreatedSession = tpd0Var.get().intValue();
        messageNew_.f56011id = DbObject.GENERATE_UNIQUE_FAKE_ID(tpd0Var.get().intValue());
        MessageAdditionalData messageAdditionalDataNew_ = MessageAdditionalData.new_();
        messageNew_.additionalData = messageAdditionalDataNew_;
        messageNew_.value = "";
        messageAdditionalDataNew_.aiChatGuideType = str2;
        return messageNew_;
    }

    /* JADX INFO: renamed from: mf */
    public int m33039mf(int i) {
        return CoreModule.f17553k.f91950m.m142003o1(i).m165612e();
    }

    /* JADX INFO: renamed from: mg */
    public C22306c<q860<Conversation>> m33040mg(final String str) {
        return this.f72126Q.scheduled("getMessageTabFilterList/" + str, 0, new v9j() { // from class: l.ww7
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f188341a.m32765Pi(str);
            }
        });
    }

    /* JADX INFO: renamed from: mh */
    public void m33041mh(String str) {
        Message messageNew_ = Message.new_();
        messageNew_.cid = str;
        tpd0 tpd0Var = App.f15373i;
        messageNew_.f56011id = DbObject.GENERATE_UNIQUE_FAKE_ID(tpd0Var.get().intValue());
        messageNew_.messageType = MessageType.get("local_tickle_tip");
        messageNew_.localCreatedTime = mqi0.m155944o();
        messageNew_.createdTime = mqi0.m155944o();
        messageNew_.localCreatedSession = tpd0Var.get().intValue();
        messageNew_.localInConversation = true;
        messageNew_.owner = CoreModule.m29931H().userId();
        Boolean bool = Boolean.FALSE;
        messageNew_.recalled = bool;
        this.f72126Q.f19642f0.m32882Zg(messageNew_);
        this.f72126Q.f19639e0.f149382h1.put(Boolean.TRUE);
        this.f72126Q.f19631b1.f121928T.put(bool);
        this.f72126Q.f19639e0.f149390i1.put(messageNew_.f56011id);
    }

    /* JADX INFO: renamed from: mi */
    public final /* synthetic */ void m33042mi() {
        this.f72126Q.f19609U.m109085a(new d30() { // from class: l.iw7
            @Override // p149l.d30
            public final void call() {
                C4740g.m32053F9();
            }
        });
    }

    /* JADX INFO: renamed from: mj */
    public final /* synthetic */ void m33043mj(Conversation conversation) {
        m33117sf(conversation.f56011id);
    }

    /* JADX INFO: renamed from: mk */
    public final /* synthetic */ void m33044mk(Message message, long j, String str, Message message2) {
        pxz.m171971h(message, SystemClock.elapsedRealtime() - j);
        Conversation conversationM32856Xe = m32856Xe(str);
        if (NullChecker.m81303a(conversationM32856Xe)) {
            if (conversationM32856Xe.userMessageCount == 1) {
                String strMo33906qc = ura.m195053e().m195057d().mo33906qc(str);
                if (!TextUtils.isEmpty(strMo33906qc)) {
                    ConversationQuickChat conversationQuickChat = conversationM32856Xe.property.quickchat;
                    if (conversationQuickChat.bell) {
                        CoreModule.f17545c.f19558D0.m34862y4(strMo33906qc);
                    } else if (conversationQuickChat.speed) {
                        CoreModule.f17545c.f19558D0.m34827C4(strMo33906qc);
                    } else if (conversationQuickChat.oneside) {
                        User userM169520na = this.f72126Q.f19639e0.m169520na();
                        boolean z = ura.m195053e().m195057d().mo33732Od() && NullChecker.m81303a(conversationM32856Xe) && conversationM32856Xe.isFakeQuickChatConv();
                        if ((NullChecker.m81303a(userM169520na) && !userM169520na.isFemale()) || z) {
                            CoreModule.f17545c.f19558D0.m34826B4(strMo33906qc, "");
                        }
                    }
                }
            }
        }
        if (NullChecker.m81303a(conversationM32856Xe) && "lovebuzz".equals(conversationM32856Xe.convType) && conversationM32856Xe.userMessageCount <= 3) {
            String strM34577s5 = CoreModule.f17545c.f19577J1.m34577s5(str);
            if (!TextUtils.isEmpty(strM34577s5)) {
                CoreModule.f17545c.f19577J1.m34548C5(conversationM32856Xe, strM34577s5);
            }
        }
        if (ura.m195053e().m195057d().mo33940w()) {
            qtm.m176470g(str);
        }
    }

    /* JADX INFO: renamed from: ml */
    public final /* synthetic */ void m33045ml(Optional optional) {
        if (optional.isPresent()) {
            if (Network.isConnected(CoreModule.f17544b)) {
                m33058nl((ConversationPatchRecord) optional.get());
            } else if (this.f19930d2 == null) {
                this.f19930d2 = ConnectivityReceiver.m81290m().skip(1).distinctUntilChanged().filter(new w9j() { // from class: l.qb8
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        NetworkInfo networkInfo = (NetworkInfo) obj;
                        return Boolean.valueOf(networkInfo != null && networkInfo.isConnected());
                    }
                }).observeOn(jo0.m142408a()).subscribe(mkd0.m154955G(new e30() { // from class: l.rb8
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        this.f158590a.m33032ll((NetworkInfo) obj);
                    }
                }));
            }
        }
    }

    /* JADX INFO: renamed from: mm */
    public final /* synthetic */ void m33046mm(final String str, Throwable th) {
        if ((th instanceof TantanException.Client.CoreService) && ((TantanException.Client.CoreService) th).code == 40043) {
            this.f72126Q.f19609U.m109085a(new d30() { // from class: l.h28
                @Override // p149l.d30
                public final void call() {
                    this.f105499a.m33020km(str);
                }
            });
            if ("zh".equals(Locale.getDefault().getLanguage()) && "CN".equals(Locale.getDefault().getCountry())) {
                e51.m114742G(new Runnable() { // from class: l.i28
                    @Override // java.lang.Runnable
                    public final void run() {
                        lsi0.m151595y("恢复失败，对方可能账号异常或者已与您解除配对");
                    }
                });
            }
            e51.m114743H(CoreModule.f17544b, new Runnable() { // from class: l.j28
                @Override // java.lang.Runnable
                public final void run() {
                    this.f115895a.m33033lm();
                }
            }, 500L);
            du2.m113670a("svipRecoverConvFail", "code:40043;status:deleted;uid:" + str);
        }
    }

    /* JADX INFO: renamed from: mn */
    public void m33047mn(final Message message) {
        if (message == null) {
            return;
        }
        e51.m114774y(new Runnable() { // from class: l.xy7
            @Override // java.lang.Runnable
            public final void run() {
                this.f195030a.m32682Ij(message);
            }
        });
    }

    /* JADX INFO: renamed from: mo */
    public C22306c<j760<Integer, Boolean>> m33048mo(String str) {
        if (ura.m195053e().m195057d().mo33935v()) {
            return m33061no(str);
        }
        return mkd0.m154985s(CoreModule.f17553k.f91940c.m206076h0(str).m165620m(), CoreModule.f17553k.f91940c.m206071c0(str).m165620m(), NullChecker.m81303a(str) ? CoreModule.f17545c.f19642f0.m32737Ne(str).map(new w9j() { // from class: l.ds7
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Integer.valueOf(((Conversation) obj).f20374mm);
            }
        }) : C22306c.just(0), new y9j() { // from class: l.es7
            @Override // p149l.y9j
            /* JADX INFO: renamed from: a */
            public final Object mo94599a(Object obj, Object obj2, Object obj3) {
                return C4740g.m32183R7((List) obj, (List) obj2, (Integer) obj3);
            }
        });
    }

    /* JADX INFO: renamed from: mp */
    public void m33049mp(final boolean z) {
        final ArrayList arrayListM200339n = vwb.m200339n(vwb.m200324f0(this.f72126Q.f19663m0.f19389Y0.get(), this.f72126Q.f19663m0.f19392Z0.get(), this.f72126Q.f19663m0.f19395a1.get()), new w9j() { // from class: l.nb8
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(!TextUtils.isEmpty((String) obj));
            }
        });
        if (arrayListM200339n.isEmpty()) {
            return;
        }
        e51.m114774y(new Runnable() { // from class: l.ob8
            @Override // java.lang.Runnable
            public final void run() {
                this.f142889a.m32851Wl(arrayListM200339n, z);
            }
        });
    }

    /* JADX INFO: renamed from: mq */
    public void m33050mq(Conversation conversation) {
        CoreModule.f17553k.f91950m.upsert(conversation);
    }

    /* JADX INFO: renamed from: ne */
    public C22306c<Meta> m33051ne(final String str, final String str2) {
        return this.f72126Q.scheduled(C4728a.m31272Z("/v2/surveys/" + str + "/answers"), -1, new v9j() { // from class: l.k58
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return ia20.m135121e(new v9j() { // from class: l.x88
                    @Override // p149l.v9j, java.util.concurrent.Callable
                    public final Object call() {
                        return C4728a.f19494P.auth().m185898q(C4728a.m31272Z("/v2/surveys/" + str + "/answers")).m185893l(utc0.create(Network.JSON, str)).m185883b();
                    }
                }).compose(mkd0.m154951C()).map(new w9j() { // from class: l.y88
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return C4740g.m32569z8((Envelope) obj);
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: nf */
    public final String m33052nf(Links links) {
        return (links == null || TextUtils.isEmpty(links.next)) ? C4728a.m31180B("limit=10") : C4728a.m31180B(links.next);
    }

    /* JADX INFO: renamed from: ng */
    public C22306c<List<Conversation>> m33053ng() {
        return CoreModule.f17553k.f91950m.f118483w.m167769b().m165620m();
    }

    /* JADX INFO: renamed from: nh */
    public void m33054nh(String str, Questionnaire questionnaire) {
        if (questionnaire == null) {
            return;
        }
        Message messageNew_ = Message.new_();
        messageNew_.messageType = MessageType.get(MessageType.local_ux_questionnaire);
        messageNew_.cid = str;
        messageNew_.localInConversation = true;
        long jM155944o = mqi0.m155944o();
        messageNew_.owner = CoreModule.m29931H().userId();
        messageNew_.createdTime = jM155944o;
        messageNew_.localCreatedTime = jM155944o;
        messageNew_.recalled = Boolean.FALSE;
        messageNew_.hostId = CoreModule.m29931H().userId();
        tpd0 tpd0Var = App.f15373i;
        messageNew_.localCreatedSession = tpd0Var.get().intValue();
        messageNew_.f56011id = DbObject.GENERATE_UNIQUE_FAKE_ID(tpd0Var.get().intValue());
        MessageAdditionalData messageAdditionalDataNew_ = MessageAdditionalData.new_();
        messageNew_.additionalData = messageAdditionalDataNew_;
        messageAdditionalDataNew_.localUXQuestionnaire = questionnaire;
        messageNew_.value = questionnaire.title;
        m32854Wo(str, messageNew_);
    }

    /* JADX INFO: renamed from: ni */
    public final /* synthetic */ void m33055ni() {
        this.f72126Q.f19609U.m109085a(new d30() { // from class: l.tt7
            @Override // p149l.d30
            public final void call() {
                CoreModule.f17553k.f91940c.delete(Message.MESSAGETYPE.m60176EQ("live_vip_greet"));
            }
        });
    }

    /* JADX INFO: renamed from: nj */
    public final /* synthetic */ void m33056nj(final Envelope envelope, ArrayList arrayList, ArrayList arrayList2, DbLinks dbLinks) {
        m33217zq(((CoreData) envelope.getModuleData(CoreData.class)).conversations);
        vwb.m200354z(arrayList, new e30() { // from class: l.x48
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f190947a.m33030lj(envelope, (Conversation) obj);
            }
        });
        if (!vwb.m200296J(arrayList2)) {
            vwb.m200354z(arrayList2, new e30() { // from class: l.y48
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f195918a.m33043mj((Conversation) obj);
                }
            });
        }
        qib0.f154722k0.f176630c.upsert(dbLinks);
        m33130tf(envelope);
    }

    /* JADX INFO: renamed from: nk */
    public final /* synthetic */ void m33057nk(Envelope envelope, d30 d30Var, boolean z, String str, Message message) {
        if (vwb.m200296J(((CoreData) envelope.getModuleData(CoreData.class)).messages)) {
            CrashHelper.m81302i(new Exception("return null messages"), "core_post_simple", CrashHelper.ReportLevel.p5, 100);
            return;
        }
        if (d30Var != null) {
            d30Var.call();
        }
        Message message2 = ((CoreData) envelope.getModuleData(CoreData.class)).messages.get(0);
        if (z) {
            message2.localInConversation = true;
            message2.localInMoment = true;
        }
        Conversation conversationM32735Mo = m32735Mo(str);
        if (conversationM32735Mo == null) {
            if (ura.m195053e().m195057d().mo33808c()) {
                if (message.cid == null) {
                    message.cid = str;
                }
                if (m32747No(message.cid) == null) {
                    DbLinks dbLinks = new DbLinks();
                    dbLinks.f56011id = message.cid;
                    dbLinks.links = Links.new_();
                    CoreModule.f17553k.f91941d.upsert(dbLinks);
                }
            }
            conversationM32735Mo = m32783Qo(message);
        }
        conversationM32735Mo.latestTime = message2.createdTime;
        if (!z) {
            conversationM32735Mo.localHasMessage = true;
        }
        CoreModule.f17553k.f91950m.upsert(conversationM32735Mo);
    }

    /* JADX INFO: renamed from: nm */
    public final /* synthetic */ void m33059nm(String str) {
        Conversation conversationM32735Mo = m32735Mo(str);
        if (NullChecker.m81303a(conversationM32735Mo)) {
            CoreModule.f17553k.f91950m.delete(str);
        }
        m33114rp(conversationM32735Mo);
    }

    /* JADX INFO: renamed from: nn */
    public List<Conversation> m33060nn() {
        return CoreModule.f17553k.f91950m.f118461N.m167769b().m165617j();
    }

    /* JADX INFO: renamed from: no */
    public C22306c<j760<Integer, Boolean>> m33061no(String str) {
        return mkd0.m154985s(CoreModule.f17553k.f91940c.m206076h0(str).m165620m(), CoreModule.f17553k.f91940c.m206071c0(str).m165620m(), NullChecker.m81303a(str) ? CoreModule.f17545c.f19642f0.m32737Ne(str).map(new w9j() { // from class: l.hz7
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return C4740g.m32433n6((Conversation) obj);
            }
        }) : C22306c.just(0), new y9j() { // from class: l.iz7
            @Override // p149l.y9j
            /* JADX INFO: renamed from: a */
            public final Object mo94599a(Object obj, Object obj2, Object obj3) {
                return C4740g.m32076Ha((List) obj, (List) obj2, (Integer) obj3);
            }
        });
    }

    /* JADX INFO: renamed from: np */
    public C22306c<roj0> m33062np(final MessageType messageType) {
        return this.f72126Q.now(C22306c.fromCallable(new Callable() { // from class: l.hx7
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f109835a.m32863Xl(messageType);
            }
        }).compose(C4728a.m31252T2()));
    }

    /* JADX INFO: renamed from: nq */
    public void m33063nq(final String str, final String str2) {
        e51.m114774y(new Runnable() { // from class: l.f08
            @Override // java.lang.Runnable
            public final void run() {
                this.f93962a.m32609Cm(str, str2);
            }
        });
    }

    /* JADX INFO: renamed from: oe */
    public C22306c<roj0> m33064oe() {
        return this.f72126Q.scheduled("batchMarriagePatch", -1, new v9j() { // from class: l.lu7
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f130032a.m32643Fh();
            }
        });
    }

    /* JADX INFO: renamed from: of */
    public Message m33065of(String str, MessageType messageType) {
        return m33078pf(str, messageType, "");
    }

    /* JADX INFO: renamed from: og */
    public C22306c<Boolean> m33066og() {
        return this.f19841A0.asObservable();
    }

    /* JADX INFO: renamed from: oh */
    public void m33067oh(String str, String str2) {
        Message messageNew_ = Message.new_();
        messageNew_.messageType = MessageType.get(MessageType.local_user_moment_message);
        messageNew_.cid = str;
        messageNew_.localInConversation = true;
        long jGuessedCurrentServerTime = qib0.f154693H.guessedCurrentServerTime();
        messageNew_.owner = CoreModule.m29931H().userId();
        messageNew_.createdTime = jGuessedCurrentServerTime;
        messageNew_.localCreatedTime = jGuessedCurrentServerTime;
        messageNew_.recalled = Boolean.FALSE;
        messageNew_.hostId = CoreModule.m29931H().userId();
        tpd0 tpd0Var = App.f15373i;
        messageNew_.localCreatedSession = tpd0Var.get().intValue();
        messageNew_.f56011id = DbObject.GENERATE_UNIQUE_FAKE_ID(tpd0Var.get().intValue());
        messageNew_.value = "";
        messageNew_.msgData = str2;
        m32894ah(messageNew_, false);
    }

    /* JADX INFO: renamed from: oi */
    public final /* synthetic */ roj0 m33068oi(final String str) throws Exception {
        this.f72126Q.f19609U.m109085a(new d30() { // from class: l.kp7
            @Override // p149l.d30
            public final void call() {
                C4740g.m32007B7(str);
            }
        });
        return roj0.f160388a;
    }

    /* JADX INFO: renamed from: ok */
    public final /* synthetic */ roj0 m33070ok(final d30 d30Var, final boolean z, final String str, final Message message, final Envelope envelope) {
        this.f72126Q.m31492w3(envelope, new d30() { // from class: l.b68
            @Override // p149l.d30
            public final void call() {
                this.f73754a.m33057nk(envelope, d30Var, z, str, message);
            }
        });
        return roj0.f160388a;
    }

    /* JADX INFO: renamed from: ol */
    public final /* synthetic */ roj0 m33071ol() throws Exception {
        List<T> listM165617j = CoreModule.f17553k.f91949l.m112021F().m165617j();
        if (vwb.m200296J(listM165617j) || listM165617j.get(0) == null) {
            this.f19993y2 = false;
        } else {
            this.f19993y2 = true;
            final ConversationPatchRecord conversationPatchRecord = (ConversationPatchRecord) listM165617j.get(0);
            e51.m114742G(new Runnable() { // from class: l.k28
                @Override // java.lang.Runnable
                public final void run() {
                    this.f120697a.m33058nl(conversationPatchRecord);
                }
            });
        }
        return roj0.f160388a;
    }

    /* JADX INFO: renamed from: om */
    public final /* synthetic */ void m33072om(String str) {
        Conversation conversationM32735Mo = m32735Mo(str);
        if (NullChecker.m81303a(conversationM32735Mo)) {
            conversationM32735Mo.unmatchConversation = false;
            CoreModule.f17553k.f91950m.upsert(conversationM32735Mo);
        }
    }

    /* JADX INFO: renamed from: on */
    public C22306c<q860<Conversation>> m33073on() {
        return m32749Oe(m32725Me().f118476p);
    }

    /* JADX INFO: renamed from: oo */
    public C22306c<Message> m33074oo() {
        return this.f19925c0.observeOn(jo0.m142408a());
    }

    /* JADX INFO: renamed from: op */
    public C22306c<roj0> m33075op(String str) {
        final String strM208768p = xh5.m208768p("/friends");
        final JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(str);
        try {
            jSONObject.put("userIds", jSONArray);
            jSONObject.put("action", "block");
        } catch (JSONException unused) {
        }
        return this.f72126Q.scheduled("conversations/remove/recommend", -1, new v9j() { // from class: l.r68
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return new la20(new v9j() { // from class: l.x78
                    @Override // p149l.v9j, java.util.concurrent.Callable
                    public final Object call() {
                        return C4728a.f19494P.auth().m185898q(str).m185893l(utc0.create(Network.JSON, jSONObject.toString())).m185883b();
                    }
                }).map(new w9j() { // from class: l.y78
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return roj0.f160388a;
                    }
                }).compose(C4728a.m31252T2());
            }
        });
    }

    @TestOnly
    /* JADX INFO: renamed from: oq */
    public void m33076oq(ChatGameInfo chatGameInfo) {
        this.f19948j2 = chatGameInfo;
        this.f19945i2.put(chatGameInfo.toJson());
    }

    /* JADX INFO: renamed from: pe */
    public C22306c<roj0> m33077pe() {
        return this.f72126Q.scheduled("batchNewMatchPatch", -1, new v9j() { // from class: l.iy7
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f115432a.m32680Ih();
            }
        });
    }

    /* JADX INFO: renamed from: pf */
    public Message m33078pf(String str, MessageType messageType, String str2) {
        Message messageNew_ = Message.new_();
        messageNew_.cid = str;
        tpd0 tpd0Var = App.f15373i;
        messageNew_.f56011id = DbObject.GENERATE_UNIQUE_FAKE_ID(tpd0Var.get().intValue());
        messageNew_.messageType = messageType;
        messageNew_.localCreatedTime = mqi0.m155944o();
        messageNew_.createdTime = mqi0.m155944o();
        messageNew_.localCreatedSession = tpd0Var.get().intValue();
        messageNew_.localInConversation = true;
        messageNew_.owner = CoreModule.m29931H().userId();
        messageNew_.recalled = Boolean.FALSE;
        messageNew_.value = str2;
        return messageNew_;
    }

    /* JADX INFO: renamed from: pg */
    public C22306c<Surveys> m33079pg(final String str) {
        return scheduled(C4728a.m31272Z("/v2/surveys/" + str), 0, new v9j() { // from class: l.y28
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return ia20.m135117a(new v9j() { // from class: l.f58
                    @Override // p149l.v9j, java.util.concurrent.Callable
                    public final Object call() {
                        return C4728a.f19494P.auth().m185898q(C4728a.m31272Z("/v2/surveys/" + str)).m185883b();
                    }
                }).map(new w9j() { // from class: l.g58
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return C4740g.m32375i3((Envelope) obj);
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: ph */
    public C22306c<q860<Conversation>> m33080ph() {
        return m32749Oe(m32725Me().m142015z0());
    }

    /* JADX INFO: renamed from: pi */
    public final /* synthetic */ roj0 m33081pi(final String str) throws Exception {
        this.f72126Q.f19609U.m109085a(new d30() { // from class: l.yw7
            @Override // p149l.d30
            public final void call() {
                CoreModule.f17553k.f91940c.delete(Filter.AND(Message.CID.mo60175EQ(str), Message.MESSAGETYPE.m60176EQ(MessageType.local_birthday_tip)));
            }
        });
        return roj0.f160388a;
    }

    /* JADX INFO: renamed from: pj */
    public final /* synthetic */ void m33082pj(roj0 roj0Var) {
        this.f19990x2 = false;
    }

    /* JADX INFO: renamed from: pk */
    public final /* synthetic */ C22306c m33083pk(final String str, final Message message, final d30 d30Var, final boolean z) {
        return m32190Ro(str, message).map(new w9j() { // from class: l.u28
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f173082a.m33070ok(d30Var, z, str, message, (Envelope) obj);
            }
        }).compose(C4728a.m31252T2());
    }

    /* JADX INFO: renamed from: pl */
    public final /* synthetic */ C22306c m33084pl() {
        return C22306c.fromCallable(new Callable() { // from class: l.i18
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f110430a.m33071ol();
            }
        }).compose(C4728a.m31252T2());
    }

    /* JADX INFO: renamed from: pm */
    public final /* synthetic */ roj0 m33085pm(final String str, Envelope envelope) {
        if (envelope.meta.code != 40043) {
            this.f72126Q.m31493x3(envelope, new d30() { // from class: l.g38
                @Override // p149l.d30
                public final void call() {
                    this.f100363a.m33072om(str);
                }
            }, true);
            return roj0.f160388a;
        }
        du2.m113670a("svipRecoverConvFail", "code:40043;status:deleted;uid:" + str);
        this.f72126Q.f19609U.m109085a(new d30() { // from class: l.e38
            @Override // p149l.d30
            public final void call() {
                this.f88997a.m33059nm(str);
            }
        });
        if ("zh".equals(Locale.getDefault().getLanguage()) && "CN".equals(Locale.getDefault().getCountry())) {
            e51.m114742G(new Runnable() { // from class: l.f38
                @Override // java.lang.Runnable
                public final void run() {
                    lsi0.m151595y("恢复失败，对方可能账号异常或者已与您解除配对");
                }
            });
        }
        return roj0.f160388a;
    }

    /* JADX INFO: renamed from: pn */
    public C22306c<q860<Conversation>> m33086pn(List<String> list) {
        return m32749Oe(m32725Me().m141977W0(list));
    }

    /* JADX INFO: renamed from: po */
    public int m33087po() {
        jl6 jl6Var = CoreModule.f17553k.f91950m;
        Filter<Conversation> filterM60176EQ = Conversation.LOCALPLACEBAN.m60176EQ("both");
        TEnumColumn<Conversation, ConversationStatus> tEnumColumn = Conversation.STATUS;
        return jl6Var.sum(Filter.AND(filterM60176EQ, tEnumColumn.NEQ(ConversationStatus.local_fake), tEnumColumn.NEQ("deleted"), tEnumColumn.NEQ("removed"), tEnumColumn.NEQ(ConversationStatus.invisible), tEnumColumn.NEQ("dismissed")), Conversation.UNREADMESSAGES);
    }

    /* JADX INFO: renamed from: pp */
    public void m33088pp() {
        e51.m114775z(new Runnable() { // from class: l.jb8
            @Override // java.lang.Runnable
            public final void run() {
                this.f117164a.m32875Yl();
            }
        }, false);
    }

    /* JADX INFO: renamed from: pq */
    public void m33089pq(final String str) {
        CoreModule.f17553k.f91940c.m206070b0(str).m165620m().filter(new w9j() { // from class: l.xa8
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(!vwb.m200296J((List) obj));
            }
        }).map(new w9j() { // from class: l.ya8
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return C4740g.m32247X4((List) obj);
            }
        }).take(1).subscribe(mkd0.m154955G(new e30() { // from class: l.za8
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f202332a.m32622Dm(str, (Message) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: qe */
    public C22306c<roj0> m33090qe(final String str, final Act act) {
        return this.f72126Q.scheduled("block", -1, new v9j() { // from class: l.b18
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f72496a.m32716Lh(str, act);
            }
        });
    }

    /* JADX INFO: renamed from: qf, reason: merged with bridge method [inline-methods] */
    public void m32728Mh(String str) {
        m33104rf(str, false);
    }

    /* JADX INFO: renamed from: qg */
    public List<Message> m33092qg(String str, double d2) {
        wxz wxzVar = CoreModule.f17553k.f91940c;
        Filter<Message> filterMo60175EQ = Message.CID.mo60175EQ(str);
        DoubleColumn<Message> doubleColumn = Message.CREATEDTIME;
        return Lists.m15930q(wxzVar.query(Filter.AND(filterMo60175EQ, doubleColumn.REQ(Double.valueOf(d2 + 1.0d))), doubleColumn.DESC, -1));
    }

    /* JADX INFO: renamed from: qh */
    public C22306c<q860<Conversation>> m33093qh() {
        return m32749Oe(m32725Me().m141955A0());
    }

    /* JADX INFO: renamed from: qi */
    public final /* synthetic */ roj0 m33094qi(final String str) throws Exception {
        this.f72126Q.f19609U.m109085a(new d30() { // from class: l.mx7
            @Override // p149l.d30
            public final void call() {
                C4740g.m32452p3(str);
            }
        });
        return roj0.f160388a;
    }

    /* JADX INFO: renamed from: qj */
    public final /* synthetic */ void m33095qj(DbLinks dbLinks) {
        if (this.f19990x2 && !this.f19993y2) {
            m32687Io(Links.decodedApiTime(dbLinks.links.previous, "since")).subscribe(mkd0.m154956H(new e30() { // from class: l.n28
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f136774a.m33082pj((roj0) obj);
                }
            }, new e30() { // from class: l.o28
                @Override // p149l.e30
                public final void call(Object obj) {
                    C4740g.m32313cd((Throwable) obj);
                }
            }));
        }
        if (this.f19888P2) {
            return;
        }
        m32575Ae();
        this.f19888P2 = true;
    }

    /* JADX INFO: renamed from: qk */
    public final /* synthetic */ roj0 m33096qk(Message message, d30 d30Var, Envelope envelope) {
        if (!vwb.m200296J(((CoreData) envelope.getModuleData(CoreData.class)).messages) && TextUtils.equals(((CoreData) envelope.getModuleData(CoreData.class)).messages.get(0).f56011id, message.f56011id)) {
            ((CoreData) envelope.getModuleData(CoreData.class)).messages.get(0).cid = message.cid;
        }
        this.f72126Q.m31492w3(envelope, d30Var);
        return roj0.f160388a;
    }

    /* JADX INFO: renamed from: ql */
    public final /* synthetic */ void m33097ql(Envelope envelope) {
        this.f72126Q.m31492w3(envelope, new d30() { // from class: l.y98
            @Override // p149l.d30
            public final void call() {
                C4740g.m32474r3();
            }
        });
    }

    /* JADX INFO: renamed from: qm */
    public final /* synthetic */ void m33098qm() {
        this.f72126Q.f19642f0.m32959fn(null);
        this.f72126Q.f19642f0.m32650Fo();
        CoreModule.f17545c.f19642f0.m32938dq(qib0.f154693H.guessedCurrentServerTime());
    }

    /* JADX INFO: renamed from: qn */
    public C22306c<List<Conversation>> m33099qn() {
        return CoreModule.f17553k.f91950m.m141978X0(mqi0.m155943n()).m165620m();
    }

    /* JADX INFO: renamed from: qo */
    public C22306c<List<Conversation>> m33100qo() {
        return CoreModule.f17553k.f91950m.f118486z.m165620m();
    }

    /* JADX INFO: renamed from: qp */
    public C22306c<roj0> m33101qp(String str, String str2, Report report) {
        return this.f72126Q.f19618X.m113772h3(C4728a.m31213J0("/conversations/" + str + "/messages/" + str2 + "/reports"), report);
    }

    /* JADX INFO: renamed from: qq */
    public void m33102qq(final double d2) {
        e51.m114774y(new Runnable() { // from class: l.wa8
            @Override // java.lang.Runnable
            public final void run() {
                this.f185445a.m32635Em(d2);
            }
        });
    }

    /* JADX INFO: renamed from: re, reason: merged with bridge method [inline-methods] */
    public C22306c<roj0> m33186xl(final String str) {
        return this.f72126Q.scheduled("blocked", -1, new v9j() { // from class: l.o18
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f141412a.m32752Oh(str);
            }
        });
    }

    /* JADX INFO: renamed from: rf */
    public void m33104rf(String str, boolean z) {
        du2.m113670a("db_deleteConversationAndRelated", "id:" + str);
        if (z) {
            return;
        }
        CoreModule.f17553k.f91950m.delete(Conversation.f20372ID.mo60175EQ(str));
        CoreModule.f17553k.f91940c.m206052J(str);
        CoreModule.f17553k.f91941d.delete(str);
        CoreModule.m29934N().mo60404yj(str);
        CoreModule.f17553k.f91949l.delete(str);
        if (ura.m195053e().m195057d().mo33808c() && TextUtils.equals(str, ura.m195053e().m195057d().mo33777Wj())) {
            qib0.f154722k0.f176631d.delete(str);
        }
    }

    /* JADX INFO: renamed from: rg */
    public C22306c<Boolean> m33105rg(final String str) {
        return this.f72126Q.scheduled("get_other_share_status" + str, 0, new v9j() { // from class: l.w68
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return ia20.m135117a(new v9j() { // from class: l.fx7
                    @Override // p149l.v9j, java.util.concurrent.Callable
                    public final Object call() {
                        return C4728a.f19494P.auth().m185898q(C4728a.m31200G("/users/" + str + "/settings?&type=default")).m185887f().m185883b();
                    }
                }).map(new w9j() { // from class: l.gx7
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return C4740g.m32456p7((Envelope) obj);
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: rh */
    public C22306c<q860<Conversation>> m33106rh() {
        return m32749Oe(m32725Me().m141956B0());
    }

    /* JADX INFO: renamed from: ri */
    public final /* synthetic */ roj0 m33107ri(final String str) throws Exception {
        this.f72126Q.f19609U.m109085a(new d30() { // from class: l.or7
            @Override // p149l.d30
            public final void call() {
                C4740g.m32153Oa(str);
            }
        });
        return roj0.f160388a;
    }

    /* JADX INFO: renamed from: rj */
    public final /* synthetic */ roj0 m33108rj(final DbLinks dbLinks) throws Exception {
        DbLinks dbLinksM32747No;
        Envelope envelopeM212771c;
        final String strM31372y0 = C4728a.m31372y0(dbLinks.links.previous);
        final Envelope envelopeM212770b = new la20(new v9j() { // from class: l.tx7
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4728a.f19494P.auth().m185898q(strM31372y0).m185887f().m185883b();
            }
        }).toBlocking().m212770b();
        CoreModule.f17545c.f19648h0.m196254m3(envelopeM212770b);
        final ArrayList arrayList = new ArrayList();
        final ArrayList arrayList2 = new ArrayList();
        StringBuilder sb = null;
        if (!vwb.m200296J(((CoreData) envelopeM212770b.getModuleData(CoreData.class)).conversations)) {
            StringBuilder sb2 = null;
            for (int i = 0; i < ((CoreData) envelopeM212770b.getModuleData(CoreData.class)).conversations.size(); i++) {
                final Conversation conversation = ((CoreData) envelopeM212770b.getModuleData(CoreData.class)).conversations.get(i);
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
                        sb2.append(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
                        sb2.append(conversation.createdTime);
                        sb2.append(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
                        sb2.append((NullChecker.m81303a(conversation.status) && NullChecker.m81303a(conversation.status.toString())) ? conversation.status.toString() : "status_null");
                        sb2.append(SignParameters.NEW_LINE);
                    }
                    if (TEnum.equals(conversation.status, "default") && vwb.m200346r(CoreModule.f17553k.f91940c.m206065W(conversation.f56011id).m165617j(), new w9j() { // from class: l.ux7
                        @Override // p149l.w9j
                        public final Object call(Object obj) {
                            return Boolean.valueOf(TEnum.equals(((Message) obj).status(), "normal"));
                        }
                    }) != null) {
                        if (!ura.m195053e().m195057d().mo33676E() || !ura.m195053e().m195057d().mo33727Nd(conversation)) {
                            PartialIdList partialIdList = conversation.api_only_messages;
                            String str = partialIdList == null ? null : (String) vwb.m200302P(partialIdList.ids);
                            while (true) {
                                PartialIdList partialIdList2 = conversation.api_only_messages;
                                if (partialIdList2 == null || partialIdList2.links.next == null || CoreModule.f17553k.f91940c.query(str) != null || (envelopeM212771c = new la20(new v9j() { // from class: l.vx7
                                    @Override // p149l.v9j, java.util.concurrent.Callable
                                    public final Object call() {
                                        Conversation conversation2 = conversation;
                                        return C4728a.f19494P.auth().m185898q(C4728a.m31235P0(conversation2.f56011id, conversation2.api_only_messages.links.next)).m185887f().m185883b();
                                    }
                                }).toBlocking().m212771c(null)) == null) {
                                    break;
                                }
                                conversation.api_only_messages.links.next = envelopeM212771c.pagination.links.next;
                                envelopeM212770b.addAll(envelopeM212771c);
                                List<Message> list = ((CoreData) envelopeM212771c.getModuleData(CoreData.class)).messages;
                                if (list.isEmpty()) {
                                    break;
                                }
                                str = ((CoreData) envelopeM212771c.getModuleData(CoreData.class)).messages.get(list.size() - 1).f56011id;
                            }
                            PartialIdList partialIdList3 = conversation.api_only_messages;
                            if (partialIdList3 != null && partialIdList3.links.next != null && CoreModule.f17553k.f91940c.query(str) != null && (dbLinksM32747No = m32747No(conversation.f56011id)) != null) {
                                conversation.api_only_messages.links.next = dbLinksM32747No.links.next;
                            }
                        } else if (TextUtils.equals(ura.m195053e().m195057d().mo33796af(), conversation.otherUser)) {
                            m33210zj(conversation.f56011id);
                        }
                    }
                }
            }
            sb = sb2;
        }
        if (NullChecker.m81303a(sb)) {
            du2.m113670a("loadNewConversationsDeleted", sb.toString());
        }
        String str2 = envelopeM212770b.pagination.links.previous;
        if (str2 != null) {
            dbLinks.links.previous = str2;
        }
        if (!vwb.m200296J(((CoreData) envelopeM212770b.getModuleData(CoreData.class)).conversations)) {
            ((CoreData) envelopeM212770b.getModuleData(CoreData.class)).conversations.removeAll(arrayList);
        }
        if (ura.m195053e().m195057d().mo33731Oc()) {
            ura.m195053e().m195057d().mo33733Oe(envelopeM212770b, strM31372y0, false);
        }
        this.f72126Q.m31494y3(envelopeM212770b, new d30() { // from class: l.yx7
            @Override // p149l.d30
            public final void call() {
                this.f200573a.m33056nj(envelopeM212770b, arrayList, arrayList2, dbLinks);
            }
        }, false, false, false);
        this.f19984v2.put(Long.valueOf(qib0.f154693H.guessedCurrentServerTime()));
        if (vwb.m200296J(((CoreData) envelopeM212770b.getModuleData(CoreData.class)).conversations) || ((CoreData) envelopeM212770b.getModuleData(CoreData.class)).conversations.size() < envelopeM212770b.pagination.limit) {
            e51.m114743H(CoreModule.f17544b, new Runnable() { // from class: l.ay7
                @Override // java.lang.Runnable
                public final void run() {
                    this.f72254a.m33095qj(dbLinks);
                }
            }, 100L);
        } else {
            e51.m114743H(CoreModule.f17544b, new Runnable() { // from class: l.zx7
                @Override // java.lang.Runnable
                public final void run() {
                    this.f205384a.m33069oj(dbLinks);
                }
            }, 100L);
        }
        return roj0.f160388a;
    }

    /* JADX INFO: renamed from: rk */
    public final /* synthetic */ C22306c m33109rk(final Message message, final d30 d30Var) {
        final Message message2 = new Message();
        message2.recalled = Boolean.TRUE;
        return new la20((v9j<stc0>) new v9j() { // from class: l.h88
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                Message message3 = message;
                return C4728a.f19494P.auth().m185898q(C4728a.m31242R0(message3.cid, message3.f56011id) + "&method=patch").m185893l(utc0.create(Network.JSON, message2.toJson())).m185883b();
            }
        }, 0).map(new w9j() { // from class: l.i88
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f111992a.m33096qk(message, d30Var, (Envelope) obj);
            }
        }).compose(C4728a.m31252T2());
    }

    /* JADX INFO: renamed from: rl */
    public final /* synthetic */ void m33110rl(Message message, Throwable th) {
        final Message messageMo223809clone = message.mo223809clone();
        this.f72126Q.f19609U.m109085a(new d30() { // from class: l.w98
            @Override // p149l.d30
            public final void call() {
                CoreModule.f17553k.f91940c.upsert(messageMo223809clone);
            }
        });
    }

    /* JADX INFO: renamed from: rm */
    public final /* synthetic */ roj0 m33111rm(String str, roj0 roj0Var) {
        this.f19876L2.m132487l(str);
        CoreModule.f17545c.f19663m0.m30994E8(str);
        e51.m114743H(CoreModule.f17544b, new Runnable() { // from class: l.k48
            @Override // java.lang.Runnable
            public final void run() {
                this.f120953a.m33098qm();
            }
        }, 500L);
        return roj0Var;
    }

    /* JADX INFO: renamed from: rn */
    public C22306c<List<Conversation>> m33112rn() {
        return (ura.m195053e().m195057d().mo33802b() ? m32725Me().m141979Y0() : m32725Me().m141980Z0()).m165620m();
    }

    /* JADX INFO: renamed from: ro, reason: merged with bridge method [inline-methods] */
    public C22306c<roj0> m33058nl(final ConversationPatchRecord conversationPatchRecord) {
        return this.f72126Q.scheduled("patch_record_" + conversationPatchRecord.f56011id, -1, new v9j() { // from class: l.ot7
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f145549a.m32755Ok(conversationPatchRecord);
            }
        });
    }

    /* JADX INFO: renamed from: rp */
    public final void m33114rp(Conversation conversation) {
        CrashHelper.m81296c(new Exception("Conv Banned change Error detail:" + conversation.toJson()));
    }

    /* JADX INFO: renamed from: rq */
    public C22306c<roj0> m33115rq(final String str, final double d2) {
        return this.f72126Q.now(C22306c.fromCallable(new Callable() { // from class: l.m28
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f130894a.m32648Fm(str, d2);
            }
        }).compose(C4728a.m31252T2()));
    }

    /* JADX INFO: renamed from: se */
    public C22306c<roj0> m33116se(String str) {
        return CoreModule.m29931H().userId().equals(str) ? C22306c.empty() : m32725Me().uiGet(str).filter(new w9j() { // from class: l.lx7
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((Conversation) obj) == null);
            }
        }).map(new w9j() { // from class: l.wx7
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return roj0.f160388a;
            }
        });
    }

    /* JADX INFO: renamed from: sf */
    public void m33117sf(String str) {
        if (m33001jg(str, true)) {
            return;
        }
        CoreModule.f17553k.f91940c.m206052J(str);
        CoreModule.f17553k.f91941d.delete(str);
        CoreModule.f17553k.f91949l.delete(str);
    }

    /* JADX INFO: renamed from: sg */
    public C22306c<List<Prologue>> m33118sg(final String str, final String str2) {
        return this.f72126Q.scheduled("getPrologues", 0, new v9j() { // from class: l.a28
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return ia20.m135117a(new v9j() { // from class: l.x58
                    @Override // p149l.v9j, java.util.concurrent.Callable
                    public final Object call() {
                        return C4728a.f19494P.auth().m185898q(C4728a.m31207H2("/users/me/prologues/" + str + "?scene=" + str)).m185887f().m185883b();
                    }
                }).map(new w9j() { // from class: l.y58
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return ((CoreData) ((Envelope) obj).getModuleData(CoreData.class)).prologues;
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: sh */
    public C22306c<List<Conversation>> m33119sh() {
        return CoreModule.f17553k.f91950m.m141957C0().m167769b().m165620m();
    }

    /* JADX INFO: renamed from: si */
    public final /* synthetic */ void m33120si(final String str, final String str2) {
        this.f72126Q.f19609U.m109085a(new d30() { // from class: l.rr7
            @Override // p149l.d30
            public final void call() {
                CoreModule.f17553k.f91940c.delete(Filter.AND(Message.CID.mo60175EQ(str), Message.MESSAGETYPE.m60176EQ(str2)));
            }
        });
    }

    /* JADX INFO: renamed from: sj */
    public final /* synthetic */ void m33121sj(ChatNewMatchEnvelope chatNewMatchEnvelope, List list, String str, String str2, int i) {
        m32924cn(chatNewMatchEnvelope.pagination.links.next, list, str, str2, i);
    }

    /* JADX INFO: renamed from: sk */
    public final /* synthetic */ void m33122sk(Envelope envelope, String str, String str2, boolean z, String str3) {
        if (!vwb.m200296J(((CoreData) envelope.getModuleData(CoreData.class)).messages)) {
            for (Message message : ((CoreData) envelope.getModuleData(CoreData.class)).messages) {
                if (TextUtils.equals(str, message.f56011id) && !TextUtils.isEmpty(str2) && NullChecker.m81303a(message.getAiChatMessageExtraInfo())) {
                    message.getAiChatMessageExtraInfo().scene = str2;
                }
                if (TextUtils.equals(str, message.f56011id) && TEnum.equals(message.status, "deleted") && z) {
                    this.f19882N2.put(str, message);
                    this.f19885O2.m132487l(roj0.f160388a);
                }
                if (message.isGroupMessage()) {
                    message.cid = str3;
                }
            }
        }
        m33130tf(envelope);
    }

    /* JADX INFO: renamed from: sl */
    public final /* synthetic */ C22306c m33123sl(final Message message, String str, final String str2, final String str3) {
        final Message messageMo223809clone = message.mo223809clone();
        if (messageMo223809clone.additionalData == null) {
            messageMo223809clone.additionalData = MessageAdditionalData.new_();
        }
        MessageAdditionalData messageAdditionalData = messageMo223809clone.additionalData;
        if (messageAdditionalData.harassAlertInfo == null) {
            messageAdditionalData.harassAlertInfo = HarassAlertInfo.new_();
        }
        messageMo223809clone.additionalData.harassAlertInfo.status = str;
        return ia20.m135121e(new v9j() { // from class: l.c88
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4728a.f19494P.auth().m185898q(C4728a.m31254U0("/conversations/" + str2 + "/messages/" + str3 + "?action=feedbackHarassAlert&method=patch")).m185893l(utc0.create(Network.JSON, messageMo223809clone.toJson())).m185883b();
            }
        }).doOnNext(new e30() { // from class: l.e88
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f89811a.m33097ql((Envelope) obj);
            }
        }).doOnError(new e30() { // from class: l.f88
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f96321a.m33110rl(message, (Throwable) obj);
            }
        }).map(new w9j() { // from class: l.g88
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return roj0.f160388a;
            }
        });
    }

    /* JADX INFO: renamed from: sm */
    public final /* synthetic */ C22306c m33124sm(final String str) {
        return new la20(new v9j() { // from class: l.qz7
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4728a.f19494P.auth().m185898q(C4728a.m31367x(str)).m185892k(utc0.create(Network.JSON, "{\"status\":\"default\"}")).m185883b();
            }
        }).doOnError(new e30() { // from class: l.rz7
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f161610a.m33046mm(str, (Throwable) obj);
            }
        }).map(new w9j() { // from class: l.sz7
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f167020a.m33085pm(str, (Envelope) obj);
            }
        }).compose(mkd0.m154951C()).map(new w9j() { // from class: l.tz7
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f172686a.m33111rm(str, (roj0) obj);
            }
        });
    }

    /* JADX INFO: renamed from: sn */
    public C22306c<q860<Conversation>> m33125sn() {
        return mkd0.m154984r(m33138tn(), qib0.f154722k0.f176630c.uiGet(SchemeKey.conversations), new x9j() { // from class: l.kb8
            @Override // p149l.x9j
            public final Object call(Object obj, Object obj2) {
                return this.f122221a.m32694Jj((List) obj, (DbLinks) obj2);
            }
        });
    }

    /* JADX INFO: renamed from: so */
    public C22306c<roj0> m33126so(final String str) {
        return this.f72126Q.scheduled("patch", -1, new v9j() { // from class: l.ox7
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f146154a.m32683Ik(str);
            }
        });
    }

    /* JADX INFO: renamed from: sp */
    public void m33127sp() {
        final String str = this.f19868J0.get();
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f72126Q.scheduled("remote/male/countdownlike/" + str, -1, new v9j() { // from class: l.d48
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return ia20.m135117a(new v9j() { // from class: l.w58
                    @Override // p149l.v9j, java.util.concurrent.Callable
                    public final Object call() {
                        return C4728a.f19494P.auth().m185898q(C4728a.m31213J0("/countdown-likes/" + str)).m185885d().m185883b();
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: sq */
    public C22306c<roj0> m33128sq(final String str, final double d2) {
        return this.f72126Q.now(C22306c.fromCallable(new Callable() { // from class: l.l48
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f125976a.m32661Gm(str, d2);
            }
        }).compose(C4728a.m31252T2()));
    }

    /* JADX INFO: renamed from: te */
    public Message m33129te(String str, List<BreakIce> list) {
        Message messageNew_ = Message.new_();
        messageNew_.messageType = MessageType.get(MessageType.local_break_ice);
        messageNew_.cid = str;
        messageNew_.localInConversation = true;
        long jM155944o = mqi0.m155944o();
        messageNew_.owner = CoreModule.m29931H().userId();
        messageNew_.createdTime = jM155944o;
        messageNew_.localCreatedTime = jM155944o;
        messageNew_.recalled = Boolean.FALSE;
        messageNew_.hostId = CoreModule.m29931H().userId();
        tpd0 tpd0Var = App.f15373i;
        messageNew_.localCreatedSession = tpd0Var.get().intValue();
        messageNew_.f56011id = DbObject.GENERATE_UNIQUE_FAKE_ID(tpd0Var.get().intValue());
        MessageAdditionalData messageAdditionalDataNew_ = MessageAdditionalData.new_();
        messageNew_.additionalData = messageAdditionalDataNew_;
        messageAdditionalDataNew_.localBreakIce = list;
        messageNew_.value = String.format("帮你准备了%d句开场白，点击发送", Integer.valueOf(list.size() > 2 ? list.size() : 2));
        return messageNew_;
    }

    /* JADX INFO: renamed from: tf */
    public void m33130tf(Envelope envelope) {
        m33143uf(envelope, false);
    }

    /* JADX INFO: renamed from: tg */
    public List<Message> m33131tg(String str) {
        return Lists.m15930q(CoreModule.f17553k.f91940c.query(Message.CID.mo60175EQ(str), Message.CREATEDTIME.DESC, 20));
    }

    /* JADX INFO: renamed from: th */
    public C22306c<roj0> m33132th(String str) {
        final JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        try {
            jSONObject3.put("inviteOther", true);
            jSONObject2.put("verify", jSONObject3);
            jSONObject.put("additional", jSONObject2);
        } catch (Exception e) {
            CrashHelper.m81296c(e);
        }
        final String str2 = String.format("/conversations/%s?method=patch", str);
        return this.f72126Q.scheduled(str2, -1, new v9j() { // from class: l.ct7
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return ia20.m135121e(new v9j() { // from class: l.sx7
                    @Override // p149l.v9j, java.util.concurrent.Callable
                    public final Object call() {
                        return C4728a.f19494P.auth().m185898q(C4728a.m31254U0(str)).m185893l(utc0.create(Network.JSON, jSONObject.toString())).m185883b();
                    }
                });
            }
        }).compose(mkd0.m154951C()).map(new w9j() { // from class: l.dt7
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return roj0.f160388a;
            }
        });
    }

    /* JADX INFO: renamed from: ti */
    public final /* synthetic */ void m33133ti(final String str, final List list) {
        this.f72126Q.f19609U.m109085a(new d30() { // from class: l.nx7
            @Override // p149l.d30
            public final void call() {
                CoreModule.f17553k.f91940c.delete(Filter.AND(Message.CID.mo60175EQ(str), Message.MESSAGETYPE.m60177IN(list)));
            }
        });
    }

    /* JADX INFO: renamed from: tj */
    public final /* synthetic */ roj0 m33134tj(final String str, final String str2, final List list, final int i, final ChatNewMatchEnvelope chatNewMatchEnvelope) {
        if (!vwb.m200296J(chatNewMatchEnvelope.data.users)) {
            for (User user : chatNewMatchEnvelope.data.users) {
                if (!TextUtils.equals(user.f56011id, str) && !TextUtils.equals(user.f56011id, str2)) {
                    list.add(user.f56011id);
                }
            }
        }
        if (TextUtils.isEmpty(chatNewMatchEnvelope.pagination.links.next) || vwb.m200296J(chatNewMatchEnvelope.data.users) || list.size() >= i) {
            lz4.m152319h().m152337u(list.subList(0, Math.min(list.size(), i)));
        } else {
            e51.m114743H(CoreModule.f17544b, new Runnable() { // from class: l.fs7
                @Override // java.lang.Runnable
                public final void run() {
                    this.f99043a.m33121sj(chatNewMatchEnvelope, list, str, str2, i);
                }
            }, 10L);
        }
        return roj0.f160388a;
    }

    /* JADX INFO: renamed from: tk */
    public final /* synthetic */ Message m33135tk(final String str, final String str2, final boolean z, final String str3, final Envelope envelope) {
        this.f72126Q.m31492w3(envelope, new d30() { // from class: l.s38
            @Override // p149l.d30
            public final void call() {
                this.f162076a.m33122sk(envelope, str, str2, z, str3);
            }
        });
        if (vwb.m200296J(((CoreData) envelope.getModuleData(CoreData.class)).messages)) {
            return null;
        }
        Message message = ((CoreData) envelope.getModuleData(CoreData.class)).messages.get(0);
        if (message != null && message.recalled.booleanValue()) {
            e51.m114742G(new t38(this));
        }
        return message;
    }

    /* JADX INFO: renamed from: tl */
    public final /* synthetic */ roj0 m33136tl(Envelope envelope) {
        this.f72126Q.m31492w3(envelope, null);
        return roj0.f160388a;
    }

    /* JADX INFO: renamed from: tm */
    public final /* synthetic */ void m33137tm(Envelope envelope) {
        m33192ye(envelope);
        m33143uf(envelope, false);
        m33217zq(((CoreData) envelope.getModuleData(CoreData.class)).conversations);
    }

    /* JADX INFO: renamed from: tn */
    public C22306c<List<Conversation>> m33138tn() {
        return ura.m195053e().m195057d().mo33802b() ? m32725Me().f118478r.m165620m() : m32725Me().f118479s.m165620m();
    }

    /* JADX INFO: renamed from: to */
    public C22306c<roj0> m33139to(Message message, String str) {
        if (message == null) {
            return null;
        }
        final Message messageMo223809clone = message.mo223809clone();
        if (messageMo223809clone.additionalData == null) {
            messageMo223809clone.additionalData = MessageAdditionalData.new_();
        }
        MessageAdditionalData messageAdditionalData = messageMo223809clone.additionalData;
        if (messageAdditionalData.aiPicture == null) {
            messageAdditionalData.aiPicture = AiPicture.new_();
        }
        messageMo223809clone.additionalData.aiPicture.likeStatus = str;
        return this.f72126Q.scheduled("patchAiPictureMessage" + messageMo223809clone.f56011id, -1, new v9j() { // from class: l.m48
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f131258a.m32779Qk(messageMo223809clone);
            }
        });
    }

    /* JADX INFO: renamed from: tp */
    public void m33140tp() {
        final String strM31211I2 = C4728a.m31211I2("/chat-page");
        final JsonObject jsonObject = new JsonObject();
        try {
            jsonObject.addProperty("enterNewMatchPage", Boolean.TRUE);
        } catch (Exception unused) {
        }
        this.f72126Q.scheduled("/me/chat-page/post", -1, new v9j() { // from class: l.gb8
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return ia20.m135121e(new v9j() { // from class: l.sv7
                    @Override // p149l.v9j, java.util.concurrent.Callable
                    public final Object call() {
                        return C4728a.f19494P.auth().m185898q(str).m185893l(utc0.create(Network.JSON, jsonObject.toString())).m185883b();
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: tq */
    public C22306c<roj0> m33141tq(final String str, final double d2) {
        return this.f72126Q.now(C22306c.fromCallable(new Callable() { // from class: l.r18
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f157246a.m32673Hm(str, d2);
            }
        }).compose(C4728a.m31252T2()));
    }

    /* JADX INFO: renamed from: ue, reason: merged with bridge method [inline-methods] */
    public final ConversationCounter m33212zl(double d2) {
        Filter filterAND;
        Integer num;
        this.f19939g2 = d2;
        if (f8c.m119878o().m119890l()) {
            return this.f19987w2.m221515e();
        }
        System.nanoTime();
        if (ura.m195053e().m195057d().mo33802b()) {
            StringColumn<Conversation> stringColumn = Conversation.f20372ID;
            Filter filterM81261OR = Filter.m81261OR(stringColumn.NOT_STARTS_WITH("fake_conversation"), stringColumn.STARTS_WITH("fake_conversation_profile_like_enter"), stringColumn.STARTS_WITH("fake_conversation_city_centre_enter"));
            TEnumColumn<Conversation, ConversationStatus> tEnumColumn = Conversation.STATUS;
            filterAND = Filter.AND(filterM81261OR, tEnumColumn.NEQ("removed"), tEnumColumn.NEQ(ConversationStatus.invisible), tEnumColumn.NEQ("deleted"));
        } else {
            StringColumn<Conversation> stringColumn2 = Conversation.f20372ID;
            Filter<Conversation> filterNOT_STARTS_WITH = stringColumn2.NOT_STARTS_WITH("fake_conversation");
            Filter<Conversation> filterNEQ = stringColumn2.NEQ(User.ID_LIVE_VIP_SERVICE);
            Filter<Conversation> filterNEQ2 = stringColumn2.NEQ(User.ID_LIVE_SERVICE);
            TEnumColumn<Conversation, ConversationStatus> tEnumColumn2 = Conversation.STATUS;
            filterAND = Filter.AND(filterNOT_STARTS_WITH, filterNEQ, filterNEQ2, tEnumColumn2.NEQ("removed"), tEnumColumn2.NEQ(ConversationStatus.invisible), tEnumColumn2.NEQ("deleted"));
        }
        Filter<Conversation> filterNEQ3 = ura.m195053e().m195057d().mo33658B() ? Conversation.f20372ID.NEQ(User.LOCAL_ID_INTL_SEE_LETTER) : Filter.TRUE;
        Filter<Conversation> filterM141991i1 = CoreModule.f17553k.f91950m.m141991i1();
        Filter<Conversation> filterM81223F = Filter.TRUE;
        if (ura.m195053e().m195057d().mo33676E()) {
            filterM81223F = Conversation.MUTED.m81223F();
        }
        jl6 jl6Var = CoreModule.f17553k.f91950m;
        TEnumColumn<Conversation, ConversationStatus> tEnumColumn3 = Conversation.STATUS;
        int iCount = jl6Var.count(Filter.AND(Filter.AND(tEnumColumn3.NEQ("dismissed"), tEnumColumn3.NEQ(ConversationStatus.local_fake), tEnumColumn3.NEQ("removed"), tEnumColumn3.NEQ(ConversationStatus.invisible), tEnumColumn3.NEQ("deleted")), filterAND, filterNEQ3), -1);
        int iM165612e = CoreModule.f17553k.f91950m.m141986f1().m165612e();
        jl6 jl6Var2 = CoreModule.f17553k.f91950m;
        StringColumn<Conversation> stringColumn3 = Conversation.f20372ID;
        Filter<Conversation> filterNOT_STARTS_WITH2 = stringColumn3.NOT_STARTS_WITH("fake_conversation");
        BooleanColumn<Conversation> booleanColumn = Conversation.READ;
        Filter<Conversation> filterM81223F2 = booleanColumn.m81223F();
        Filter filterAND2 = Filter.AND(tEnumColumn3.NEQ("dismissed"), tEnumColumn3.NEQ(ConversationStatus.local_fake), tEnumColumn3.NEQ("removed"), tEnumColumn3.NEQ(ConversationStatus.invisible), tEnumColumn3.NEQ("deleted"));
        Filter<Conversation> filterM167769b = CoreModule.f17553k.f91950m.f118481u.m167769b();
        BooleanColumn<Conversation> booleanColumn2 = Conversation.LOCALEVERHASMESSAGE;
        int iCount2 = jl6Var2.count(Filter.AND(filterNOT_STARTS_WITH2, filterM81223F2, filterAND2, filterM167769b, booleanColumn2.m81223F(), filterM141991i1), -1);
        double dM155944o = mqi0.m155944o() - (((long) ura.m195053e().m195057d().mo33701Ih()) * com.clevertap.android.sdk.Constants.ONE_MIN_IN_MILLIS);
        Filter filterAND3 = Filter.AND(CoreModule.f17553k.f91950m.m141981a1().toFilters());
        Filter<Conversation> filterM81223F3 = booleanColumn.m81223F();
        Filter<Conversation> filterM81223F4 = booleanColumn2.m81223F();
        Filter<Conversation> filterREQ = Conversation.CREATEDTIME.REQ(Double.valueOf(m32940eg()));
        DoubleColumn<Conversation> doubleColumn = Conversation.ADDITIONAL_NEWMATCH_LABELEXPOSURETIME;
        int iCount3 = CoreModule.f17553k.f91950m.count(Filter.AND(filterAND3, filterM81223F3, filterM81223F4, filterREQ, Filter.m81261OR(doubleColumn.LEQ(Double.valueOf(1.0d)), doubleColumn.REQ(Double.valueOf(dM155944o)))), -1);
        Filter filterAND4 = ura.m195053e().m195057d().mo33939vp() ? Filter.AND(filterAND, filterM81223F, filterNEQ3, stringColumn3.NEQ(User.ID_TEAM_ACCOUNT)) : Filter.AND(filterAND, filterM81223F, filterNEQ3);
        Filter<Conversation> filterNEQ4 = stringColumn3.NEQ(User.ID_TEAM_ACCOUNT);
        StringColumn<Conversation> stringColumn4 = Conversation.CONVTYPE;
        Filter<Conversation> filterMo60175EQ = stringColumn4.mo60175EQ("heartbeatMatch");
        Filter<Conversation> filterMo60175EQ2 = stringColumn4.mo60175EQ("quickchat");
        DoubleColumn<Conversation> doubleColumn2 = Conversation.LATESTTIME;
        Filter filterM81261OR2 = Filter.m81261OR(filterMo60175EQ, filterMo60175EQ2, doubleColumn2.REQ(Double.valueOf(this.f19939g2 - (((long) (ura.m195053e().m195057d().mo33932uc() * MMKV.ExpireInHour)) * 1000))));
        if (ura.m195053e().m195057d().mo33824f8()) {
            filterAND4 = Filter.AND(filterAND4, filterNEQ4);
        } else if (ura.m195053e().m195057d().mo33663Bt()) {
            filterAND4 = Filter.AND(filterAND4, filterNEQ4, filterM81261OR2);
        }
        double dMo33897os = ura.m195053e().m195057d().mo33897os();
        if (dMo33897os > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            num = 1;
            filterAND4 = Filter.AND(filterAND4, Filter.m81261OR(Conversation.LEVEL.REQ(1), doubleColumn2.REQ(Double.valueOf(dMo33897os))));
        } else {
            num = 1;
        }
        if (ura.m195053e().m195057d().mo33920sa()) {
            filterAND4 = Filter.AND(filterAND4, m32725Me().f118470W);
        }
        jl6 jl6Var3 = CoreModule.f17553k.f91950m;
        IntegerColumn<Conversation> integerColumn = Conversation.UNREADMESSAGES;
        int iSum = jl6Var3.sum(filterAND4, integerColumn);
        this.f19975s2 = CoreModule.f17553k.f91950m.sum(f19840c3, integerColumn);
        if (dMo33897os > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            filterAND = Filter.AND(filterAND, Filter.m81261OR(Conversation.LEVEL.REQ(num), doubleColumn2.REQ(Double.valueOf(dMo33897os))));
        }
        int iSum2 = CoreModule.f17553k.f91950m.sum(Filter.AND(Conversation.OTHERUSER.mo60175EQ(User.ID_TEAM_ACCOUNT), filterAND), integerColumn);
        List<Conversation> listQuery = CoreModule.f17553k.f91950m.query(filterAND4, doubleColumn2.DESC, ura.m195053e().m195057d().mo33719Mg());
        ArrayList arrayList = new ArrayList();
        for (Conversation conversation : listQuery) {
            UnreadDetail unreadDetailNew_ = UnreadDetail.new_();
            unreadDetailNew_.unread = conversation.unreadMessages;
            unreadDetailNew_.userID = conversation.otherUser;
            arrayList.add(unreadDetailNew_);
        }
        int iSum3 = CoreModule.f17553k.f91950m.sum(Filter.AND(Conversation.CONVTYPE.mo60175EQ("marriage"), filterAND), Conversation.UNREADMESSAGES);
        ConversationCounter conversationCounterNew_ = ConversationCounter.new_();
        CounterConversations counterConversations = conversationCounterNew_.conversations;
        counterConversations.total = iCount;
        counterConversations.unread = iM165612e;
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
    public final void m33143uf(Envelope envelope, boolean z) {
        if (vwb.m200296J(((CoreData) envelope.getModuleData(CoreData.class)).conversations)) {
            return;
        }
        for (final Conversation conversation : ((CoreData) envelope.getModuleData(CoreData.class)).conversations) {
            if (conversation != null) {
                DbLinks dbLinksM32747No = m32747No(conversation.f56011id);
                if (dbLinksM32747No == null) {
                    dbLinksM32747No = new DbLinks();
                    dbLinksM32747No.f56011id = conversation.f56011id;
                }
                if (!ura.m195053e().m195057d().mo33676E() || !ura.m195053e().m195057d().mo33727Nd(conversation) || z) {
                    PartialIdList partialIdList = conversation.api_only_messages;
                    dbLinksM32747No.links = partialIdList == null ? new Links() : partialIdList.links;
                } else if (!NullChecker.m81303a(dbLinksM32747No.links)) {
                    PartialIdList partialIdList2 = conversation.api_only_messages;
                    dbLinksM32747No.links = partialIdList2 == null ? new Links() : partialIdList2.links;
                }
                CoreModule.f17553k.f91941d.upsert(dbLinksM32747No);
                if (ura.m195053e().m195057d().mo33676E() && ura.m195053e().m195057d().mo33727Nd(conversation) && NullChecker.m81303a(dbLinksM32747No.links) && !TextUtils.isEmpty(dbLinksM32747No.links.next) && z) {
                    final String str = dbLinksM32747No.links.next;
                    e51.m114742G(new Runnable() { // from class: l.rx7
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f161396a.m32931di(conversation, str);
                        }
                    });
                }
            }
        }
    }

    /* JADX INFO: renamed from: ug */
    public C22306c<List<FriendInfo>> m33144ug() {
        this.f19919a0 = mqi0.m155944o();
        final String strM208765m = xh5.m208765m("search=suggested&with=users");
        return this.f72126Q.scheduled("conversations/get/online", 0, new v9j() { // from class: l.dy7
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f88351a.m32789Ri(strM208765m);
            }
        });
    }

    /* JADX INFO: renamed from: uh */
    public boolean m33145uh(String str) {
        Conversation conversationM33216zp = m33216zp(str);
        return NullChecker.m81303a(conversationM33216zp) && TEnum.equals(conversationM33216zp.status, "blocked");
    }

    /* JADX INFO: renamed from: ui */
    public final /* synthetic */ void m33146ui(final List list, Envelope envelope) {
        this.f72126Q.f19609U.m109085a(new d30() { // from class: l.w88
            @Override // p149l.d30
            public final void call() {
                C4740g.m32345f9(list);
            }
        });
    }

    /* JADX INFO: renamed from: uj */
    public final /* synthetic */ C22306c m33147uj(final String str, final String str2, final String str3, final List list, final int i) {
        return ia20.m135119c(new v9j() { // from class: l.zr7
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4740g.m31992A3(str);
            }
        }, ChatNewMatchEnvelope.JSON_ADAPTER).map(new w9j() { // from class: l.as7
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f71391a.m33134tj(str2, str3, list, i, (ChatNewMatchEnvelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: uk */
    public final /* synthetic */ C22306c m33148uk(final String str, final String str2, final boolean z, final String str3, final boolean z2) {
        return ia20.m135121e(new v9j() { // from class: l.qy7
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4728a.f19494P.auth().m185898q(C4728a.m31232O0(str, str2, z)).m185887f().m185883b();
            }
        }).map(new w9j() { // from class: l.ry7
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f161539a.m33135tk(str2, str3, z2, str, (Envelope) obj);
            }
        }).compose(C4728a.m31252T2());
    }

    /* JADX INFO: renamed from: ul */
    public final /* synthetic */ C22306c m33149ul(final String str, final Conversation conversation) {
        return conversation != null ? new la20(new v9j() { // from class: l.n68
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4728a.f19494P.auth().m185898q(C4728a.m31176A(str) + "&method=patch").m185893l(utc0.create(Network.JSON, conversation.toJson())).m185883b();
            }
        }).map(new w9j() { // from class: l.o68
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f141986a.m33136tl((Envelope) obj);
            }
        }) : C22306c.empty();
    }

    /* JADX INFO: renamed from: um */
    public final /* synthetic */ void m33150um(Envelope envelope, Long l2) {
        m32807Sp(envelope.pagination.links);
    }

    /* JADX INFO: renamed from: un */
    public C22306c<q860<Conversation>> m33151un() {
        return m32749Oe(m32725Me().f118477q);
    }

    /* JADX INFO: renamed from: uo */
    public C22306c<j760<Meta, Conversation>> m33152uo(final String str, final boolean z) {
        return scheduled("hide_conversation/" + str, -1, new v9j() { // from class: l.j88
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return ia20.m135121e(new v9j() { // from class: l.u98
                    @Override // p149l.v9j, java.util.concurrent.Callable
                    public final Object call() {
                        return C4740g.m32095J7(z, str);
                    }
                });
            }
        }).doOnNext(new e30() { // from class: l.k88
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f121783a.m32791Rk((Envelope) obj);
            }
        }).map(new w9j() { // from class: l.l88
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f126791a.m32802Sk(str, (Envelope) obj);
            }
        }).observeOn(jo0.m142408a());
    }

    /* JADX INFO: renamed from: up */
    public C22306c<Envelope> m33153up() {
        return this.f72126Q.scheduled("report_suggest_conv_online_notifications", -1, new v9j() { // from class: l.nu7
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return ia20.m135117a(new v9j() { // from class: l.g08
                    @Override // p149l.v9j, java.util.concurrent.Callable
                    public final Object call() {
                        return C4728a.f19494P.auth().m185898q(C4728a.m31213J0("/online-notifications")).m185893l(utc0.create(Network.JSON, "")).m185883b();
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: uq */
    public C22306c<roj0> m33154uq(final String str, final double d2, final int i) {
        return this.f72126Q.now(C22306c.fromCallable(new Callable() { // from class: l.qx7
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f156812a.m32685Im(str, d2, i);
            }
        }).compose(C4728a.m31252T2()));
    }

    /* JADX INFO: renamed from: ve */
    public final void m33155ve(final Message message, final int i, final e30<Message> e30Var) {
        this.f72126Q.f19609U.m109085a(new d30() { // from class: l.zv7
            @Override // p149l.d30
            public final void call() {
                C4740g.m32372hc(message, i, e30Var);
            }
        });
    }

    /* JADX INFO: renamed from: vf */
    public void m33156vf(User user) {
        if (m32735Mo(user.f56011id) == null) {
            Conversation conversationNew_ = Conversation.new_();
            double d2 = user.localRelationship.createdTime;
            conversationNew_.createdTime = d2;
            conversationNew_.latestTime = d2;
            String str = user.f56011id;
            conversationNew_.otherUser = str;
            conversationNew_.f56011id = str;
            conversationNew_.convType = "default";
            conversationNew_.read = Boolean.FALSE;
            conversationNew_.isFake = true;
            conversationNew_.readUntil = "";
            conversationNew_.localNotificationStatus = NotificationStatus.get("removed");
            conversationNew_.importance = StickStatus.get("normal");
            DbLinks dbLinks = new DbLinks();
            dbLinks.f56011id = user.f56011id;
            dbLinks.links = new Links();
            CoreModule.f17553k.f91941d.upsert(dbLinks);
            CoreModule.f17553k.f91950m.upsert(conversationNew_);
        }
    }

    /* JADX INFO: renamed from: vg */
    public HashSet<String> m33157vg(boolean z) {
        return z ? this.f19858F2 : this.f19861G2;
    }

    /* JADX INFO: renamed from: vh */
    public boolean m33158vh(String str) {
        Conversation conversationM33216zp = m33216zp(str);
        return NullChecker.m81303a(conversationM33216zp) && TEnum.equals(conversationM33216zp.status, "dismissed");
    }

    /* JADX INFO: renamed from: vi */
    public final /* synthetic */ C22306c m33159vi(final String str, final List list, final JSONObject jSONObject) {
        return NullChecker.m81303a(jSONObject) ? ia20.m135121e(new v9j() { // from class: l.i78
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4728a.f19494P.auth().m185898q(C4728a.m31211I2("/conversations/" + str + "/messages?method=patch")).m185893l(utc0.create(Network.JSON, jSONObject.toString())).m185883b();
            }
        }).doOnNext(new e30() { // from class: l.j78
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f116570a.m33146ui(list, (Envelope) obj);
            }
        }).compose(mkd0.m154951C()).map(new w9j() { // from class: l.k78
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return roj0.f160388a;
            }
        }) : C22306c.empty();
    }

    /* JADX INFO: renamed from: vk */
    public final /* synthetic */ roj0 m33161vk(Envelope envelope) {
        if (!vwb.m200296J(((CoreData) envelope.getModuleData(CoreData.class)).messages)) {
            ((CoreData) envelope.getModuleData(CoreData.class)).messages.clear();
        }
        this.f72126Q.m31492w3(envelope, null);
        return roj0.f160388a;
    }

    /* JADX INFO: renamed from: vl */
    public final /* synthetic */ void m33162vl(String str, Throwable th) {
        StringBuilder sb = new StringBuilder("cid:");
        sb.append(str);
        sb.append(" errorMessage:");
        sb.append(NullChecker.m81303a(th.getMessage()) ? th.getMessage() : "");
        du2.m113670a("ConversationPatchDelete", sb.toString());
        m32663Go(th, str);
    }

    /* JADX INFO: renamed from: vm */
    public final /* synthetic */ roj0 m33163vm(final boolean z, final NotificationStatus notificationStatus, final NotificationStatus notificationStatus2, final boolean z2) throws Exception {
        this.f72126Q.f19609U.m109085a(new d30() { // from class: l.nz7
            @Override // p149l.d30
            public final void call() {
                C4740g.m32455p6(z, notificationStatus, notificationStatus2, z2);
            }
        });
        return roj0.f160388a;
    }

    /* JADX INFO: renamed from: vn */
    public C22306c<q860<Conversation>> m33164vn() {
        return m32749Oe(m32725Me().f118485y);
    }

    /* JADX INFO: renamed from: vo */
    public C22306c<j760<Meta, Conversation>> m33165vo(final String str, final int i) {
        return scheduled("stick_top_conversation/" + str, -1, new v9j() { // from class: l.d18
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return ia20.m135121e(new v9j() { // from class: l.x18
                    @Override // p149l.v9j, java.util.concurrent.Callable
                    public final Object call() {
                        return C4740g.m32545x7(i, str);
                    }
                });
            }
        }).doOnNext(new e30() { // from class: l.e18
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f88715a.m32814Tk((Envelope) obj);
            }
        }).map(new w9j() { // from class: l.f18
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f94053a.m32826Uk(str, (Envelope) obj);
            }
        }).observeOn(jo0.m142408a());
    }

    /* JADX INFO: renamed from: vp */
    public void m33166vp(boolean z, int i, int i2, boolean z2) {
        if (!z) {
            this.f19944i1.put(0);
            this.f19941h1.put(0L);
        }
        if (this.f19944i1.get().intValue() >= i) {
            e51.m114774y(new Runnable() { // from class: l.gr7
                @Override // java.lang.Runnable
                public final void run() {
                    this.f104034a.m32887Zl();
                }
            });
        } else if (mqi0.m155944o() - this.f19941h1.get().longValue() > ((long) i2) * com.clevertap.android.sdk.Constants.ONE_MIN_IN_MILLIS || z2) {
            m32952fg().subscribe(new e30() { // from class: l.hr7
                @Override // p149l.e30
                public final void call(Object obj) {
                    C4740g.m32011Bb((roj0) obj);
                }
            }, new e30() { // from class: l.ir7
                @Override // p149l.e30
                public final void call(Object obj) {
                    C4740g.m32359gb((Throwable) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: vq */
    public C22306c<roj0> m33167vq(final Message message, final boolean z) {
        return scheduled("msg_risk_operation_" + message.f56011id, 0, new v9j() { // from class: l.n08
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f136476a.m32721Lm(message, z);
            }
        });
    }

    /* JADX INFO: renamed from: we */
    public final void m33168we(Message message, e30<Message> e30Var) {
        m33155ve(message, 1, e30Var);
    }

    /* JADX INFO: renamed from: wg */
    public C22306c<CipherId> m33169wg(final String str, final String str2, final boolean z) {
        return this.f72126Q.scheduled("cipher_userid_ab", -1, new v9j() { // from class: l.mq7
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return ia20.m135117a(new v9j() { // from class: l.rt7
                    @Override // p149l.v9j, java.util.concurrent.Callable
                    public final Object call() {
                        return C4740g.m32136N4(str, str, z);
                    }
                });
            }
        }).map(new w9j() { // from class: l.nq7
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((CoreData) ((Envelope) obj).getModuleData(CoreData.class)).cipherId;
            }
        });
    }

    /* JADX INFO: renamed from: wh */
    public C22306c<Boolean> m33170wh(final String str) {
        return C22306c.fromCallable(new Callable() { // from class: l.e28
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f88895a.m32896aj(str);
            }
        });
    }

    /* JADX INFO: renamed from: wi */
    public final /* synthetic */ C22306c m33171wi(final List list, final String str) {
        return C22306c.fromCallable(new Callable() { // from class: l.z48
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C4740g.m32389j6(list);
            }
        }).flatMap(new w9j() { // from class: l.a58
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f67637a.m33159vi(str, list, (JSONObject) obj);
            }
        });
    }

    /* JADX INFO: renamed from: wj */
    public final /* synthetic */ C22306c m33172wj(final String str) {
        return C22306c.fromCallable(new Callable() { // from class: l.aw7
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C4740g.m32520v5(str);
            }
        }).compose(mkd0.m154966R()).flatMap(new w9j() { // from class: l.bw7
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f77592a.m33160vj(str, (String) obj);
            }
        });
    }

    /* JADX INFO: renamed from: wk */
    public final /* synthetic */ C22306c m33173wk(final String str, final String str2) {
        return new la20(new v9j() { // from class: l.h38
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4728a.f19494P.auth().m185898q(C4728a.m31232O0(str, str2, false)).m185887f().m185883b();
            }
        }).map(new w9j() { // from class: l.i38
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f110623a.m33161vk((Envelope) obj);
            }
        }).compose(C4728a.m31252T2());
    }

    /* JADX INFO: renamed from: wl */
    public final /* synthetic */ C22306c m33174wl(final boolean z, final boolean z2, final String str) {
        return C22306c.fromCallable(new Callable() { // from class: l.a48
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C4740g.m32444o6(z, z2);
            }
        }).flatMap(new w9j() { // from class: l.b48
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f73320a.m33149ul(str, (Conversation) obj);
            }
        }).compose(C4728a.m31252T2()).doOnError(new e30() { // from class: l.c48
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f79158a.m33162vl(str, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: renamed from: wm */
    public final /* synthetic */ roj0 m33175wm(final NotificationStatus notificationStatus, final NotificationStatus notificationStatus2, final String str) throws Exception {
        this.f72126Q.f19609U.m109085a(new d30() { // from class: l.gy7
            @Override // p149l.d30
            public final void call() {
                CoreModule.f17553k.f91940c.m206094z0(notificationStatus, notificationStatus2, str);
            }
        });
        return roj0.f160388a;
    }

    /* JADX INFO: renamed from: wn */
    public C22306c<Message> m33176wn() {
        return this.f19922b0.observeOn(jo0.m142408a());
    }

    /* JADX INFO: renamed from: wo */
    public C22306c<roj0> m33177wo(final String str, final boolean z) {
        return this.f72126Q.scheduled("remove_conversation/" + str, -1, new v9j() { // from class: l.by7
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f77884a.m32886Zk(str, z);
            }
        });
    }

    /* JADX INFO: renamed from: wp */
    public C22306c<Envelope> m33178wp(String str, boolean z) {
        if (TextUtils.isEmpty(str)) {
            return C22306c.error(new RuntimeException("empty extra"));
        }
        StringBuilder sb = new StringBuilder("/live-schemas?search=");
        sb.append(str);
        sb.append(!z ? "" : "&action=cancel");
        final String strM31200G = C4728a.m31200G(sb.toString());
        return this.f72126Q.now(ia20.m135117a(new v9j() { // from class: l.c28
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4728a.f19494P.auth().m185898q(strM31200G).m185883b();
            }
        }));
    }

    /* JADX INFO: renamed from: wq */
    public final C22306c<roj0> m33179wq(final String str) {
        return this.f72126Q.scheduled("retryCount" + str, -1, new v9j() { // from class: l.t18
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f167295a.m32745Nm(str);
            }
        });
    }

    /* JADX INFO: renamed from: xe */
    public C22306c<roj0> m33180xe() {
        return this.f19864H2.asObservable().observeOn(jo0.m142408a());
    }

    /* JADX INFO: renamed from: xg */
    public C22306c<Envelope> m33181xg(final String str) {
        return this.f72126Q.now(new la20(new v9j() { // from class: l.qr7
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4728a.f19494P.auth().m185898q(C4728a.m31213J0("/tickles/" + str)).m185887f().m185883b();
            }
        }).compose(C4728a.m31252T2()));
    }

    /* JADX INFO: renamed from: xh */
    public boolean m33182xh(String str) {
        if (!ura.m195053e().m195057d().mo33808c()) {
            return CoreModule.f17553k.f91950m.m141976V0(str).m165612e() > 0;
        }
        User userM169430Pa = this.f72126Q.f19639e0.m169430Pa(str);
        return (userM169430Pa == null || !userM169430Pa.onlineMatchLocked()) && CoreModule.f17553k.f91950m.m141976V0(str).m165612e() > 0;
    }

    /* JADX INFO: renamed from: xi */
    public final /* synthetic */ void m33183xi() {
        this.f72126Q.f19609U.m109085a(new d30() { // from class: l.qs7
            @Override // p149l.d30
            public final void call() {
                CoreModule.f17553k.f91950m.delete("conversation_picture_like");
            }
        });
    }

    /* JADX INFO: renamed from: xj */
    public final /* synthetic */ void m33184xj(String str, Envelope envelope) {
        DbLinks dbLinksM32747No = m32747No(str);
        if (!TextUtils.isEmpty(envelope.pagination.links.previous) && NullChecker.m81303a(dbLinksM32747No)) {
            dbLinksM32747No.links.previous = envelope.pagination.links.previous;
            CoreModule.f17553k.f91941d.upsert(dbLinksM32747No);
        }
        for (Message message : ((CoreData) envelope.getModuleData(CoreData.class)).messages) {
            message.localNotificationStatus = NotificationStatus.get(NotificationStatus.muting);
            message.cid = str;
        }
    }

    /* JADX INFO: renamed from: xk */
    public final /* synthetic */ roj0 m33185xk(final List list, roj0 roj0Var) {
        this.f72126Q.f19609U.m109085a(new d30() { // from class: l.py7
            @Override // p149l.d30
            public final void call() {
                C4740g.m32107K8(list);
            }
        });
        CoreModule.f17545c.f19642f0.f19960n2.clear();
        return roj0.f160388a;
    }

    /* JADX INFO: renamed from: xm */
    public final /* synthetic */ roj0 m33187xm(final NotificationStatus notificationStatus, final NotificationStatus notificationStatus2, final String str) throws Exception {
        this.f72126Q.f19609U.m109085a(new d30() { // from class: l.rs7
            @Override // p149l.d30
            public final void call() {
                CoreModule.f17553k.f91940c.m206047A0(notificationStatus, notificationStatus2, str);
            }
        });
        return roj0.f160388a;
    }

    /* JADX INFO: renamed from: xn */
    public C22306c<roj0> m33188xn(final String str) {
        m32625Dp(str, false);
        return this.f72126Q.scheduled("messageClear", -1, new v9j() { // from class: l.l78
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f126698a.m32766Pj(str);
            }
        });
    }

    /* JADX INFO: renamed from: xo */
    public C22306c<roj0> m33189xo(final String str) {
        return scheduled("patch_filter_del_or_hidden/" + str, -1, new v9j() { // from class: l.i58
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f111533a.m32910bl(str);
            }
        }).map(new w9j() { // from class: l.j58
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return roj0.f160388a;
            }
        }).observeOn(jo0.m142408a());
    }

    /* JADX INFO: renamed from: xp */
    public void m33190xp(final String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        e51.m114774y(new Runnable() { // from class: l.la8
            @Override // java.lang.Runnable
            public final void run() {
                this.f127172a.m32911bm(str);
            }
        });
    }

    /* JADX INFO: renamed from: xq */
    public void m33191xq(final String str) {
        e51.m114774y(new Runnable() { // from class: l.ha8
            @Override // java.lang.Runnable
            public final void run() {
                this.f106712a.m32757Om(str);
            }
        });
    }

    /* JADX INFO: renamed from: ye */
    public final void m33192ye(Envelope envelope) {
        List<Conversation> list = ((CoreData) envelope.getModuleData(CoreData.class)).conversations;
        if (vwb.m200296J(list)) {
            return;
        }
        Iterator<Conversation> it = list.iterator();
        while (it.hasNext()) {
            TEnum.equals(it.next().status, "deleted");
        }
    }

    /* JADX INFO: renamed from: yf */
    public C22306c<List<Conversation>> m33193yf() {
        return CoreModule.f17553k.f91950m.f118449B.m165620m();
    }

    /* JADX WARN: Code duplicated, block: B:11:0x004b  */
    /* JADX INFO: renamed from: yg */
    public final String m33194yg() {
        PutongAct putongAct;
        if (Act.globalLifeCycle_().isEmpty() || Act.globalLifeCycle_().values().isEmpty()) {
            putongAct = null;
        } else {
            ArrayList<Act.C4299r> next = Act.globalLifeCycle_().values().iterator().next();
            if (vwb.m200296J(next)) {
                putongAct = null;
            } else {
                Activity activity = next.get(next.size() - 1).f15343a.get();
                if (activity instanceof PutongAct) {
                    putongAct = (PutongAct) activity;
                } else {
                    putongAct = null;
                }
            }
        }
        return NullChecker.m81303a(putongAct) ? putongAct.pageId() : "";
    }

    /* JADX INFO: renamed from: yh */
    public C22306c<Boolean> m33195yh(final String str, final String str2, final String str3, final String str4) {
        return scheduled("conversation/" + str3 + "/report-hint", 0, new v9j() { // from class: l.jz7
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return ia20.m135117a(new v9j() { // from class: l.v18
                    @Override // p149l.v9j, java.util.concurrent.Callable
                    public final Object call() {
                        return C4728a.f19494P.auth().m185898q(C4728a.m31200G("/antispam/sender/" + str + "/conversation/" + str + "/message/" + str + "/report-hint?hitWord=" + str)).m185887f().m185883b();
                    }
                }).map(new w9j() { // from class: l.w18
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return Boolean.valueOf(((CoreData) ((Envelope) obj).getModuleData(CoreData.class)).hint);
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: yi */
    public final /* synthetic */ roj0 m33196yi(Envelope envelope) {
        this.f72126Q.m31492w3(envelope, null);
        return roj0.f160388a;
    }

    /* JADX INFO: renamed from: yj */
    public final /* synthetic */ Boolean m33197yj(final String str, final Envelope envelope) {
        boolean z;
        if (vwb.m200296J(((CoreData) envelope.getModuleData(CoreData.class)).messages)) {
            z = false;
        } else {
            CoreModule.f17545c.f19648h0.m196254m3(envelope);
            z = !TextUtils.isEmpty(envelope.pagination.links.previous);
            this.f72126Q.m31492w3(envelope, new d30() { // from class: l.f78
                @Override // p149l.d30
                public final void call() {
                    this.f96220a.m33184xj(str, envelope);
                }
            });
        }
        return Boolean.valueOf(z);
    }

    /* JADX INFO: renamed from: yk */
    public final /* synthetic */ C22306c m33198yk(final List list) {
        return C22306c.just(roj0.f160388a).observeOn(Schedulers.m221493io()).map(new w9j() { // from class: l.wu7
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f188092a.m33185xk(list, (roj0) obj);
            }
        });
    }

    /* JADX INFO: renamed from: yl */
    public final /* synthetic */ C22306c m33199yl(String str, final JSONObject jSONObject) {
        return this.f72126Q.scheduled("post/bulk/messages/" + str, -1, new v9j() { // from class: l.e68
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return ia20.m135117a(new v9j() { // from class: l.b98
                    @Override // p149l.v9j, java.util.concurrent.Callable
                    public final Object call() {
                        return C4728a.f19494P.auth().m185898q(C4728a.m31213J0("/bulk-messages")).m185893l(utc0.create(Network.JSON, jSONObject.toString())).m185883b();
                    }
                });
            }
        }).map(new w9j() { // from class: l.f68
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return roj0.f160388a;
            }
        });
    }

    /* JADX INFO: renamed from: ym */
    public final /* synthetic */ C22306c m33200ym(String str, String str2, Envelope envelope) {
        List<AudioText> list = ((CoreData) envelope.getModuleData(CoreData.class)).audioTexts;
        if (vwb.m200296J(list)) {
            return m32893ag(str2, str);
        }
        m32669Hi(str, list.get(0));
        return C22306c.just(list.get(0));
    }

    /* JADX INFO: renamed from: yn */
    public C22306c<roj0> m33201yn(final long j) {
        return this.f72126Q.now(C22306c.fromCallable(new Callable() { // from class: l.a78
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f67845a.m32790Rj(j);
            }
        }).compose(C4728a.m31252T2()));
    }

    /* JADX INFO: renamed from: yo */
    public C22306c<roj0> m33202yo(final List<IceBreakingQuestion> list) {
        return this.f72126Q.scheduled("users/me/chat-profiles/patch", -1, new v9j() { // from class: l.o48
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f141754a.m32945el(list);
            }
        });
    }

    /* JADX INFO: renamed from: yp */
    public void m33203yp(final String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        e51.m114774y(new Runnable() { // from class: l.nr7
            @Override // java.lang.Runnable
            public final void run() {
                this.f140161a.m32935dm(str);
            }
        });
    }

    /* JADX INFO: renamed from: yq */
    public final void m33204yq(final long j, final String str) {
        this.f72126Q.f19609U.m109085a(new d30() { // from class: l.gv7
            @Override // p149l.d30
            public final void call() {
                this.f104537a.m32769Pm(j, str);
            }
        });
    }

    /* JADX INFO: renamed from: ze */
    public void m33205ze(boolean z) {
        if (ura.m195053e().m195057d().mo33869ka() || z) {
            if (mqi0.m155944o() >= this.f72126Q.f19639e0.f149494w1.get().longValue() || z) {
                boolean z2 = false;
                try {
                    if (Long.parseLong(CoreModule.m29931H().userId()) % ((long) ura.m195053e().m195057d().mo33909qi()) == 0) {
                        z2 = true;
                    }
                } catch (Exception e) {
                    CrashHelper.m81296c(e);
                }
                if (z ? true : z2) {
                    CoreModule.f17545c.f19642f0.m33073on().map(new w9j() { // from class: l.qu7
                        @Override // p149l.w9j
                        public final Object call(Object obj) {
                            return Boolean.valueOf(((q860) obj).m173343c());
                        }
                    }).filter(new w9j() { // from class: l.ru7
                        @Override // p149l.w9j
                        public final Object call(Object obj) {
                            return Boolean.valueOf(!((Boolean) obj).booleanValue());
                        }
                    }).first().observeOn(Schedulers.m221493io()).map(new w9j() { // from class: l.su7
                        @Override // p149l.w9j
                        public final Object call(Object obj) {
                            return this.f166453a.m32764Ph((Boolean) obj);
                        }
                    }).subscribe(mkd0.m154956H(new e30() { // from class: l.tu7
                        @Override // p149l.e30
                        public final void call(Object obj) {
                            this.f172152a.m32776Qh((xaj0) obj);
                        }
                    }, new e30() { // from class: l.uu7
                        @Override // p149l.e30
                        public final void call(Object obj) {
                            C4740g.m32401k7((Throwable) obj);
                        }
                    }));
                }
            }
        }
    }

    /* JADX INFO: renamed from: zf */
    public void m33206zf(final String str) {
        e51.m114774y(new Runnable() { // from class: l.vt7
            @Override // java.lang.Runnable
            public final void run() {
                this.f182906a.m32942ei(str);
            }
        });
    }

    /* JADX INFO: renamed from: zg */
    public LinkedHashMap<String, UserLiveLabel> m33207zg(boolean z) {
        LinkedHashMap<String, UserLiveLabel> linkedHashMapM221515e = z ? this.f19846B2.m221515e() : this.f19849C2.m221515e();
        return linkedHashMapM221515e == null ? f19829R2 : linkedHashMapM221515e;
    }

    /* JADX INFO: renamed from: zh */
    public C22306c<Boolean> m33208zh(final String str, final String str2, final String str3) {
        return scheduled("conversation/" + str2 + "/harass-hint", 0, new v9j() { // from class: l.ou7
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return ia20.m135117a(new v9j() { // from class: l.lz7
                    @Override // p149l.v9j, java.util.concurrent.Callable
                    public final Object call() {
                        return C4728a.f19494P.auth().m185898q(C4728a.m31200G("/antispam/receiver/" + str + "/conversation/" + str + "/harass-hint?hitWord=" + str)).m185887f().m185883b();
                    }
                }).map(new w9j() { // from class: l.mz7
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return Boolean.valueOf(((CoreData) ((Envelope) obj).getModuleData(CoreData.class)).hint);
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: zi */
    public final /* synthetic */ roj0 m33209zi(roj0 roj0Var) {
        m32650Fo();
        return roj0.f160388a;
    }

    /* JADX INFO: renamed from: zk */
    public final /* synthetic */ q860 m33211zk(List list, DbLinks dbLinks) {
        return m99390Z2(list, dbLinks);
    }

    /* JADX INFO: renamed from: zm */
    public final /* synthetic */ C22306c m33213zm(final String str, final String str2) {
        return ia20.m135121e(new v9j() { // from class: l.uy7
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4728a.f19494P.auth().m185898q(C4728a.m31211I2("/conversations/" + str + "/messages/" + str2 + "/audiotexts")).m185893l(utc0.create(Network.JSON, "")).m185883b();
            }
        }).flatMap(new w9j() { // from class: l.vy7
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f183500a.m33200ym(str2, str, (Envelope) obj);
            }
        }).observeOn(jo0.m142408a());
    }

    /* JADX INFO: renamed from: zn */
    public C22306c<LinkedHashMap<String, UserLiveLabel>> m33214zn() {
        return this.f19849C2.asObservable().observeOn(jo0.m142408a());
    }

    /* JADX INFO: renamed from: zo */
    public C22306c<roj0> m33215zo(Message message) {
        if (message == null) {
            return null;
        }
        final Message messageMo223809clone = message.mo223809clone();
        if (messageMo223809clone.additionalData == null) {
            messageMo223809clone.additionalData = MessageAdditionalData.new_();
        }
        MessageAdditionalData messageAdditionalData = messageMo223809clone.additionalData;
        if (messageAdditionalData.limitTimePicture == null) {
            messageAdditionalData.limitTimePicture = LimitTimePicture.new_();
        }
        messageMo223809clone.additionalData.limitTimePicture.status = LimitTimePictureStatus.get("read");
        return this.f72126Q.scheduled("patchLimitTimePictureMessage" + messageMo223809clone.f56011id, -1, new v9j() { // from class: l.np7
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f139934a.m32969gl(messageMo223809clone);
            }
        });
    }

    /* JADX INFO: renamed from: zp */
    public Conversation m33216zp(String str) {
        return e51.m114739D() ? m32856Xe(str) : m32735Mo(str);
    }

    /* JADX INFO: renamed from: zq */
    public void m33217zq(List<Conversation> list) {
        if (vwb.m200296J(list)) {
            return;
        }
        vwb.m200354z(list, new e30() { // from class: l.yy7
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f200715a.m32781Qm((Conversation) obj);
            }
        });
    }
}
