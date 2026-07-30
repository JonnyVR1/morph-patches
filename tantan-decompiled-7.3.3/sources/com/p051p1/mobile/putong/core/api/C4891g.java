package com.p051p1.mobile.putong.core.api;

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
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.App;
import com.p051p1.mobile.putong.api.api.Network;
import com.p051p1.mobile.putong.api.api.TantanException;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.C4879a;
import com.p051p1.mobile.putong.core.api.C4891g;
import com.p051p1.mobile.putong.core.api.RunnableC4884c0;
import com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface;
import com.p051p1.mobile.putong.core.data.AiPicture;
import com.p051p1.mobile.putong.core.data.AudioText;
import com.p051p1.mobile.putong.core.data.BreakIce;
import com.p051p1.mobile.putong.core.data.ChatAssistantQuestion;
import com.p051p1.mobile.putong.core.data.ChatGameInfo;
import com.p051p1.mobile.putong.core.data.ChatHeatActionData;
import com.p051p1.mobile.putong.core.data.ChatMM;
import com.p051p1.mobile.putong.core.data.ChatNewMatchEnvelope;
import com.p051p1.mobile.putong.core.data.ChatProfile;
import com.p051p1.mobile.putong.core.data.CipherId;
import com.p051p1.mobile.putong.core.data.Conversation;
import com.p051p1.mobile.putong.core.data.ConversationAdditional;
import com.p051p1.mobile.putong.core.data.ConversationAdditionalTag;
import com.p051p1.mobile.putong.core.data.ConversationBatchPatchIds;
import com.p051p1.mobile.putong.core.data.ConversationGame;
import com.p051p1.mobile.putong.core.data.ConversationIceBreaking;
import com.p051p1.mobile.putong.core.data.ConversationPatchRecord;
import com.p051p1.mobile.putong.core.data.ConversationPatchState;
import com.p051p1.mobile.putong.core.data.ConversationQuickChat;
import com.p051p1.mobile.putong.core.data.ConversationType;
import com.p051p1.mobile.putong.core.data.CoreData;
import com.p051p1.mobile.putong.core.data.CoreMomentInfo;
import com.p051p1.mobile.putong.core.data.CountdownItem;
import com.p051p1.mobile.putong.core.data.CounterVerification;
import com.p051p1.mobile.putong.core.data.ExchangePicture;
import com.p051p1.mobile.putong.core.data.ExposureNewMatch;
import com.p051p1.mobile.putong.core.data.FriendInfo;
import com.p051p1.mobile.putong.core.data.HarassAlertInfo;
import com.p051p1.mobile.putong.core.data.IceBreakingQuestion;
import com.p051p1.mobile.putong.core.data.InsertConversationUser;
import com.p051p1.mobile.putong.core.data.LimitTimePicture;
import com.p051p1.mobile.putong.core.data.LimitTimePictureStatus;
import com.p051p1.mobile.putong.core.data.LocalPlaceBan;
import com.p051p1.mobile.putong.core.data.LogoutCounterEnvelope;
import com.p051p1.mobile.putong.core.data.LogoutRecommendEnvelope;
import com.p051p1.mobile.putong.core.data.LogoutRecommendUser;
import com.p051p1.mobile.putong.core.data.LoveLetterMessageState;
import com.p051p1.mobile.putong.core.data.Message;
import com.p051p1.mobile.putong.core.data.MessageAdditionalData;
import com.p051p1.mobile.putong.core.data.MessageChannel;
import com.p051p1.mobile.putong.core.data.MessageFeedbackStatus;
import com.p051p1.mobile.putong.core.data.MessageSetting;
import com.p051p1.mobile.putong.core.data.MessageType;
import com.p051p1.mobile.putong.core.data.NotificationStatus;
import com.p051p1.mobile.putong.core.data.OfficialAccount;
import com.p051p1.mobile.putong.core.data.OfficialAccountsMenu;
import com.p051p1.mobile.putong.core.data.OfficialAccountsSubMenu;
import com.p051p1.mobile.putong.core.data.OnlineLiveChatPair;
import com.p051p1.mobile.putong.core.data.Prologue;
import com.p051p1.mobile.putong.core.data.Questionnaire;
import com.p051p1.mobile.putong.core.data.ReadMessage;
import com.p051p1.mobile.putong.core.data.SogouGifEnvelope;
import com.p051p1.mobile.putong.core.data.SogouGifPicture;
import com.p051p1.mobile.putong.core.data.StickStatus;
import com.p051p1.mobile.putong.core.data.Sticker;
import com.p051p1.mobile.putong.core.data.StickerSource;
import com.p051p1.mobile.putong.core.data.Surveys;
import com.p051p1.mobile.putong.data.Answer;
import com.p051p1.mobile.putong.data.Audio;
import com.p051p1.mobile.putong.data.CommonData;
import com.p051p1.mobile.putong.data.ConversationCounter;
import com.p051p1.mobile.putong.data.ConversationStatus;
import com.p051p1.mobile.putong.data.Converter;
import com.p051p1.mobile.putong.data.CounterConversations;
import com.p051p1.mobile.putong.data.CounterMessages;
import com.p051p1.mobile.putong.data.Data;
import com.p051p1.mobile.putong.data.DbLinks;
import com.p051p1.mobile.putong.data.Dimension;
import com.p051p1.mobile.putong.data.Envelope;
import com.p051p1.mobile.putong.data.Links;
import com.p051p1.mobile.putong.data.Location;
import com.p051p1.mobile.putong.data.MatchFrom;
import com.p051p1.mobile.putong.data.MatchScData;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.MediaLocalStatus;
import com.p051p1.mobile.putong.data.Meta;
import com.p051p1.mobile.putong.data.PartialIdList;
import com.p051p1.mobile.putong.data.Picture;
import com.p051p1.mobile.putong.data.ProfileCompletion;
import com.p051p1.mobile.putong.data.PushMessageCustom;
import com.p051p1.mobile.putong.data.Relationship;
import com.p051p1.mobile.putong.data.RelationshipStatus;
import com.p051p1.mobile.putong.data.Report;
import com.p051p1.mobile.putong.data.SchemeKey;
import com.p051p1.mobile.putong.data.UnreadDetail;
import com.p051p1.mobile.putong.data.UploadSource;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.UserLiveLabel;
import com.p051p1.mobile.putong.data.Video;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.data.tenum.TEnumColumn;
import com.p051p1.mobile.putong.p070ui.share.ShareHelper;
import com.p051p1.mobile.putong.remote_config.RemoteConfig;
import com.p051p1.mobile.putong.util.TrackMediaUploadUtil;
import com.p051p1.mobile.putong.wxapi.WXEntryActivity;
import com.p074ss.bytertc.audio.device.webrtc.WebRtcAudioTrack;
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
import com.tencent.p106mm.opensdk.modelmsg.SendMessageToWX;
import com.tencent.p106mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.p106mm.opensdk.modelmsg.WXWebpageObject;
import com.tencent.p106mm.opensdk.openapi.IWXAPI;
import com.tencent.p106mm.opensdk.openapi.WXAPIFactory;
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
import p137rx.C22421c;
import p137rx.schedulers.Schedulers;
import p137rx.subjects.C22507a;
import p137rx.subjects.C22508b;
import p153l.bkj0;
import p153l.byd0;
import p153l.dji;
import p153l.dy6;
import p153l.e7y;
import p153l.ecj;
import p153l.f2e0;
import p153l.fo0;
import p153l.gmk0;
import p153l.gta;
import p153l.i1y;
import p153l.i4g0;
import p153l.jv7;
import p153l.jxd0;
import p153l.jyb;
import p153l.k05;
import p153l.kcg0;
import p153l.ku10;
import p153l.l51;
import p153l.l9c;
import p153l.m600;
import p153l.mm6;
import p153l.mof0;
import p153l.mxd0;
import p153l.ner;
import p153l.niw;
import p153l.o1j0;
import p153l.oki;
import p153l.ovb0;
import p153l.p560;
import p153l.pcj;
import p153l.pf60;
import p153l.psd0;
import p153l.pzi0;
import p153l.q4f;
import p153l.qcj;
import p153l.qi20;
import p153l.rb8;
import p153l.rcj;
import p153l.rvm;
import p153l.sb8;
import p153l.scj;
import p153l.si20;
import p153l.sim;
import p153l.t600;
import p153l.ti20;
import p153l.trd0;
import p153l.tu2;
import p153l.tzi0;
import p153l.u11;
import p153l.uqb0;
import p153l.uxj0;
import p153l.vel0;
import p153l.vg60;
import p153l.vnb;
import p153l.vod;
import p153l.vxd0;
import p153l.wel0;
import p153l.wyd0;
import p153l.wzh0;
import p153l.x1d0;
import p153l.x20;
import p153l.x48;
import p153l.xi5;
import p153l.y20;
import p153l.yk30;
import p153l.yy6;
import p153l.z1d0;
import p153l.zg6;
import p153l.zwk;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.api.g */
/* JADX INFO: loaded from: classes9.dex */
public class C4891g extends dy6 {

    /* JADX INFO: renamed from: R2 */
    public static final LinkedHashMap<String, UserLiveLabel> f20571R2 = new LinkedHashMap<>();

    /* JADX INFO: renamed from: S2 */
    public static String f20572S2 = "message";

    /* JADX INFO: renamed from: T2 */
    public static jxd0 f20573T2 = new jxd0("has_in_feed_interaction_" + CoreModule.m30929H().userId(), Boolean.TRUE);

    /* JADX INFO: renamed from: U2 */
    public static int f20574U2 = 1;

    /* JADX INFO: renamed from: V2 */
    public static int f20575V2 = 2;

    /* JADX INFO: renamed from: W2 */
    public static int f20576W2 = 3;

    /* JADX INFO: renamed from: X2 */
    public static int f20577X2 = 4;

    /* JADX INFO: renamed from: Y2 */
    public static String f20578Y2;

    /* JADX INFO: renamed from: Z2 */
    public static final String f20579Z2;

    /* JADX INFO: renamed from: a3 */
    public static int f20580a3;

    /* JADX INFO: renamed from: b3 */
    public static f2e0 f20581b3;

    /* JADX INFO: renamed from: c3 */
    public static final Filter<Conversation> f20582c3;

    /* JADX INFO: renamed from: A0 */
    public C22507a<Boolean> f20583A0;

    /* JADX INFO: renamed from: A1 */
    public jxd0 f20584A1;

    /* JADX INFO: renamed from: A2 */
    public kcg0 f20585A2;

    /* JADX INFO: renamed from: B0 */
    public C22507a<ChatProfile> f20586B0;

    /* JADX INFO: renamed from: B1 */
    public jxd0 f20587B1;

    /* JADX INFO: renamed from: B2 */
    public C22507a<LinkedHashMap<String, UserLiveLabel>> f20588B2;

    /* JADX INFO: renamed from: C0 */
    public C22507a<List<IceBreakingQuestion>> f20589C0;

    /* JADX INFO: renamed from: C1 */
    public byd0 f20590C1;

    /* JADX INFO: renamed from: C2 */
    public C22507a<LinkedHashMap<String, UserLiveLabel>> f20591C2;

    /* JADX INFO: renamed from: D0 */
    public final C22507a<pf60<List<Conversation>, Integer>> f20592D0;

    /* JADX INFO: renamed from: D1 */
    public vxd0 f20593D1;

    /* JADX INFO: renamed from: D2 */
    public long f20594D2;

    /* JADX INFO: renamed from: E0 */
    public wyd0 f20595E0;

    /* JADX INFO: renamed from: E1 */
    public vxd0 f20596E1;

    /* JADX INFO: renamed from: E2 */
    public LruCache<String, CoreMomentInfo> f20597E2;

    /* JADX INFO: renamed from: F0 */
    public C22507a<Boolean> f20598F0;

    /* JADX INFO: renamed from: F1 */
    public final jxd0 f20599F1;

    /* JADX INFO: renamed from: F2 */
    public HashSet<String> f20600F2;

    /* JADX INFO: renamed from: G0 */
    public jxd0 f20601G0;

    /* JADX INFO: renamed from: G1 */
    public jxd0 f20602G1;

    /* JADX INFO: renamed from: G2 */
    public HashSet<String> f20603G2;

    /* JADX INFO: renamed from: H0 */
    public byd0 f20604H0;

    /* JADX INFO: renamed from: H1 */
    public vxd0 f20605H1;

    /* JADX INFO: renamed from: H2 */
    public C22507a<uxj0> f20606H2;

    /* JADX INFO: renamed from: I0 */
    public byd0 f20607I0;

    /* JADX INFO: renamed from: I1 */
    public byd0 f20608I1;

    /* JADX INFO: renamed from: I2 */
    public C22507a<Integer> f20609I2;

    /* JADX INFO: renamed from: J0 */
    public wyd0 f20610J0;

    /* JADX INFO: renamed from: J1 */
    public vxd0 f20611J1;

    /* JADX INFO: renamed from: J2 */
    public C22507a<List<Conversation>> f20612J2;

    /* JADX INFO: renamed from: K0 */
    public jxd0 f20613K0;

    /* JADX INFO: renamed from: K1 */
    public byd0 f20614K1;

    /* JADX INFO: renamed from: K2 */
    public C22507a<List<Conversation>> f20615K2;

    /* JADX INFO: renamed from: L0 */
    public vxd0 f20616L0;

    /* JADX INFO: renamed from: L1 */
    public vxd0 f20617L1;

    /* JADX INFO: renamed from: L2 */
    public C22508b<String> f20618L2;

    /* JADX INFO: renamed from: M0 */
    public byd0 f20619M0;

    /* JADX INFO: renamed from: M1 */
    public byd0 f20620M1;

    /* JADX INFO: renamed from: M2 */
    public d f20621M2;

    /* JADX INFO: renamed from: N0 */
    public vxd0 f20622N0;

    /* JADX INFO: renamed from: N1 */
    public vxd0 f20623N1;

    /* JADX INFO: renamed from: N2 */
    public Map<String, Message> f20624N2;

    /* JADX INFO: renamed from: O0 */
    public byd0 f20625O0;

    /* JADX INFO: renamed from: O1 */
    public byd0 f20626O1;

    /* JADX INFO: renamed from: O2 */
    public C22507a<uxj0> f20627O2;

    /* JADX INFO: renamed from: P0 */
    public vxd0 f20628P0;

    /* JADX INFO: renamed from: P1 */
    public String f20629P1;

    /* JADX INFO: renamed from: P2 */
    public boolean f20630P2;

    /* JADX INFO: renamed from: Q0 */
    public boolean f20631Q0;

    /* JADX INFO: renamed from: Q1 */
    public boolean f20632Q1;

    /* JADX INFO: renamed from: Q2 */
    public boolean f20633Q2;

    /* JADX INFO: renamed from: R */
    public p560 f20634R;

    /* JADX INFO: renamed from: R0 */
    public wyd0 f20635R0;

    /* JADX INFO: renamed from: R1 */
    public kcg0 f20636R1;

    /* JADX INFO: renamed from: S */
    public yk30 f20637S;

    /* JADX INFO: renamed from: S0 */
    public wyd0 f20638S0;

    /* JADX INFO: renamed from: S1 */
    public C22507a<User> f20639S1;

    /* JADX INFO: renamed from: T */
    public Boolean f20640T;

    /* JADX INFO: renamed from: T0 */
    public wyd0 f20641T0;

    /* JADX INFO: renamed from: T1 */
    public C22508b<uxj0> f20642T1;

    /* JADX INFO: renamed from: U */
    public StringBuilder f20643U;

    /* JADX INFO: renamed from: U0 */
    public wyd0 f20644U0;

    /* JADX INFO: renamed from: U1 */
    public C22507a<uxj0> f20645U1;

    /* JADX INFO: renamed from: V */
    public long f20646V;

    /* JADX INFO: renamed from: V0 */
    public wyd0 f20647V0;

    /* JADX INFO: renamed from: V1 */
    public C22508b<uxj0> f20648V1;

    /* JADX INFO: renamed from: W */
    public C22508b<Throwable> f20649W;

    /* JADX INFO: renamed from: W0 */
    public jxd0 f20650W0;

    /* JADX INFO: renamed from: W1 */
    public C22508b<uxj0> f20651W1;

    /* JADX INFO: renamed from: X */
    public C22508b<Message> f20652X;

    /* JADX INFO: renamed from: X0 */
    public jxd0 f20653X0;

    /* JADX INFO: renamed from: X1 */
    public C22507a<vg60<Conversation>> f20654X1;

    /* JADX INFO: renamed from: Y */
    public C22508b<Message> f20655Y;

    /* JADX INFO: renamed from: Y0 */
    public jxd0 f20656Y0;

    /* JADX INFO: renamed from: Y1 */
    public boolean f20657Y1;

    /* JADX INFO: renamed from: Z */
    public C22507a<String> f20658Z;

    /* JADX INFO: renamed from: Z0 */
    public jxd0 f20659Z0;

    /* JADX INFO: renamed from: Z1 */
    public boolean f20660Z1;

    /* JADX INFO: renamed from: a0 */
    public double f20661a0;

    /* JADX INFO: renamed from: a1 */
    public wyd0 f20662a1;

    /* JADX INFO: renamed from: a2 */
    public String f20663a2;

    /* JADX INFO: renamed from: b0 */
    public C22508b<Message> f20664b0;

    /* JADX INFO: renamed from: b1 */
    public wyd0 f20665b1;

    /* JADX INFO: renamed from: b2 */
    public C22508b<Boolean> f20666b2;

    /* JADX INFO: renamed from: c0 */
    public C22508b<Message> f20667c0;

    /* JADX INFO: renamed from: c1 */
    public wyd0 f20668c1;

    /* JADX INFO: renamed from: c2 */
    public C22507a<pf60<String, String>> f20669c2;

    /* JADX INFO: renamed from: d0 */
    public C22508b<uxj0> f20670d0;

    /* JADX INFO: renamed from: d1 */
    public jxd0 f20671d1;

    /* JADX INFO: renamed from: d2 */
    public kcg0 f20672d2;

    /* JADX INFO: renamed from: e0 */
    public C22508b<uxj0> f20673e0;

    /* JADX INFO: renamed from: e1 */
    public wyd0 f20674e1;

    /* JADX INFO: renamed from: e2 */
    public C22508b<String> f20675e2;

    /* JADX INFO: renamed from: f0 */
    public C22507a<Boolean> f20676f0;

    /* JADX INFO: renamed from: f1 */
    public jxd0 f20677f1;

    /* JADX INFO: renamed from: f2 */
    public C22508b<String> f20678f2;

    /* JADX INFO: renamed from: g0 */
    public C22508b<uxj0> f20679g0;

    /* JADX INFO: renamed from: g1 */
    public jxd0 f20680g1;

    /* JADX INFO: renamed from: g2 */
    public double f20681g2;

    /* JADX INFO: renamed from: h0 */
    public C22507a<bkj0<String, PushMessageCustom, Long>> f20682h0;

    /* JADX INFO: renamed from: h1 */
    public byd0 f20683h1;

    /* JADX INFO: renamed from: h2 */
    public C22508b<ovb0<String, Integer, Integer, Integer>> f20684h2;

    /* JADX INFO: renamed from: i0 */
    public long f20685i0;

    /* JADX INFO: renamed from: i1 */
    public vxd0 f20686i1;

    /* JADX INFO: renamed from: i2 */
    public wyd0 f20687i2;

    /* JADX INFO: renamed from: j0 */
    public byd0 f20688j0;

    /* JADX INFO: renamed from: j1 */
    public byd0 f20689j1;

    /* JADX INFO: renamed from: j2 */
    public volatile ChatGameInfo f20690j2;

    /* JADX INFO: renamed from: k0 */
    public long f20691k0;

    /* JADX INFO: renamed from: k1 */
    public wyd0 f20692k1;

    /* JADX INFO: renamed from: k2 */
    public final Set<String> f20693k2;

    /* JADX INFO: renamed from: l0 */
    public byd0 f20694l0;

    /* JADX INFO: renamed from: l1 */
    public jxd0 f20695l1;

    /* JADX INFO: renamed from: l2 */
    public String f20696l2;

    /* JADX INFO: renamed from: m0 */
    public final vxd0 f20697m0;

    /* JADX INFO: renamed from: m1 */
    public mxd0 f20698m1;

    /* JADX INFO: renamed from: m2 */
    public Set<String> f20699m2;

    /* JADX INFO: renamed from: n0 */
    public byd0 f20700n0;

    /* JADX INFO: renamed from: n1 */
    public jxd0 f20701n1;

    /* JADX INFO: renamed from: n2 */
    public volatile List<String> f20702n2;

    /* JADX INFO: renamed from: o0 */
    public jxd0 f20703o0;

    /* JADX INFO: renamed from: o1 */
    public jxd0 f20704o1;

    /* JADX INFO: renamed from: o2 */
    public volatile List<Message> f20705o2;

    /* JADX INFO: renamed from: p0 */
    public jxd0 f20706p0;

    /* JADX INFO: renamed from: p1 */
    public jxd0 f20707p1;

    /* JADX INFO: renamed from: p2 */
    public C22507a<uxj0> f20708p2;

    /* JADX INFO: renamed from: q0 */
    public jxd0 f20709q0;

    /* JADX INFO: renamed from: q1 */
    public jxd0 f20710q1;

    /* JADX INFO: renamed from: q2 */
    public C22507a<pf60<Integer, Integer>> f20711q2;

    /* JADX INFO: renamed from: r0 */
    public jxd0 f20712r0;

    /* JADX INFO: renamed from: r1 */
    public byd0 f20713r1;

    /* JADX INFO: renamed from: r2 */
    public C22507a<Boolean> f20714r2;

    /* JADX INFO: renamed from: s0 */
    public jxd0 f20715s0;

    /* JADX INFO: renamed from: s1 */
    public byd0 f20716s1;

    /* JADX INFO: renamed from: s2 */
    public volatile int f20717s2;

    /* JADX INFO: renamed from: t0 */
    public vxd0 f20718t0;

    /* JADX INFO: renamed from: t1 */
    public byd0 f20719t1;

    /* JADX INFO: renamed from: t2 */
    public C22507a<bkj0<Integer, Integer, Integer>> f20720t2;

    /* JADX INFO: renamed from: u0 */
    public byd0 f20721u0;

    /* JADX INFO: renamed from: u1 */
    public vxd0 f20722u1;

    /* JADX INFO: renamed from: u2 */
    public vxd0 f20723u2;

    /* JADX INFO: renamed from: v0 */
    public jxd0 f20724v0;

    /* JADX INFO: renamed from: v1 */
    public jxd0 f20725v1;

    /* JADX INFO: renamed from: v2 */
    public byd0 f20726v2;

    /* JADX INFO: renamed from: w0 */
    public jxd0 f20727w0;

    /* JADX INFO: renamed from: w1 */
    public byd0 f20728w1;

    /* JADX INFO: renamed from: w2 */
    public C22507a<ConversationCounter> f20729w2;

    /* JADX INFO: renamed from: x0 */
    public boolean f20730x0;

    /* JADX INFO: renamed from: x1 */
    public jxd0 f20731x1;

    /* JADX INFO: renamed from: x2 */
    public boolean f20732x2;

    /* JADX INFO: renamed from: y0 */
    public jxd0 f20733y0;

    /* JADX INFO: renamed from: y1 */
    public jxd0 f20734y1;

    /* JADX INFO: renamed from: y2 */
    public boolean f20735y2;

    /* JADX INFO: renamed from: z0 */
    public vxd0 f20736z0;

    /* JADX INFO: renamed from: z1 */
    public jxd0 f20737z1;

    /* JADX INFO: renamed from: z2 */
    public C22507a<Double> f20738z2;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.api.g$a */
    public class a implements Consumer<String> {
        public a() {
        }

        @Override // java.util.function.Consumer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(String str) {
            C4891g.this.m33631Ef(str);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.api.g$b */
    public class b implements x20 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ double f20740a;

        public b(double d) {
            this.f20740a = d;
        }

        @Override // p153l.x20
        public void call() {
            if (this.f20740a == -1.0d) {
                CoreModule.f18272k.f115545m.delete("fake_conversation_local_team_group_conversation");
                return;
            }
            Conversation conversationQuery = CoreModule.f18272k.f115545m.query("fake_conversation_local_team_group_conversation");
            if (conversationQuery == null) {
                conversationQuery = Conversation.new_();
                conversationQuery.f56859id = "fake_conversation_local_team_group_conversation";
                double d = this.f20740a;
                conversationQuery.createdTime = d;
                conversationQuery.latestTime = d;
                conversationQuery.convType = "default";
                conversationQuery.localEverHasMessage = true;
                conversationQuery.unreadMessages = 0;
            } else {
                double d2 = conversationQuery.latestTime;
                double d3 = this.f20740a;
                if (d2 != d3) {
                    conversationQuery.latestTime = d3;
                }
            }
            CoreModule.f18264c.f20384f0.m34053mq(conversationQuery);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.api.g$c */
    public class c implements x20 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ double f20742a;

        public c(double d) {
            this.f20742a = d;
        }

        /* JADX WARN: Code duplicated, block: B:14:0x0043  */
        /* JADX WARN: Code duplicated, block: B:16:? A[RETURN, SYNTHETIC] */
        @Override // p153l.x20
        public void call() {
            if (this.f20742a == -1.0d) {
                CoreModule.f18272k.f115545m.delete("fake_conversation_local_limited_trial_see_fold");
                return;
            }
            Conversation conversationQuery = CoreModule.f18272k.f115545m.query("fake_conversation_local_limited_trial_see_fold");
            boolean z = false;
            if (conversationQuery != null) {
                double d = conversationQuery.latestTime;
                double d2 = this.f20742a;
                if (d != d2) {
                    conversationQuery.latestTime = d2;
                }
                if (z) {
                    CoreModule.f18264c.f20384f0.m34053mq(conversationQuery);
                }
            }
            conversationQuery = Conversation.new_();
            conversationQuery.f56859id = "fake_conversation_local_limited_trial_see_fold";
            double d3 = this.f20742a;
            conversationQuery.createdTime = d3;
            conversationQuery.latestTime = d3;
            conversationQuery.convType = "default";
            conversationQuery.localEverHasMessage = true;
            conversationQuery.unreadMessages = 0;
            z = true;
            if (z) {
                CoreModule.f18264c.f20384f0.m34053mq(conversationQuery);
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.api.g$d */
    public static class d extends mof0<List<OfficialAccount>> {
        public d() {
            super("OfficialAccountsApi", new dji(new vod("officialAccounts", "2", uqb0.f180396b0.f170324a.userId()), 7, ProtobufAdapter.ARRAY_ADAPTER(OfficialAccount.PROTOBUF_ADAPTER)), new pcj() { // from class: l.bd8
                @Override // p153l.pcj, java.util.concurrent.Callable
                public final Object call() {
                    return new ti20(new pcj() { // from class: l.cd8
                        @Override // p153l.pcj, java.util.concurrent.Callable
                        public final Object call() {
                            return C4879a.f20236P.auth().m209043q(C4879a.m32203G("/official-accounts?with=menus")).m209032f().m209028b();
                        }
                    }).map(new qcj() { // from class: l.dd8
                        @Override // p153l.qcj
                        public final Object call(Object obj) {
                            return C4891g.d.m34224D((Envelope) obj);
                        }
                    });
                }
            });
        }

        /* JADX INFO: renamed from: D */
        public static /* synthetic */ List m34224D(Envelope envelope) {
            if (NullChecker.m82486a(((CoreData) envelope.getModuleData(CoreData.class)).officialAccounts) && NullChecker.m82486a(((CoreData) envelope.getModuleData(CoreData.class)).menus)) {
                for (OfficialAccount officialAccount : ((CoreData) envelope.getModuleData(CoreData.class)).officialAccounts) {
                    for (final String str : officialAccount.menuIds) {
                        OfficialAccountsMenu officialAccountsMenu = (OfficialAccountsMenu) jyb.m147529r(((CoreData) envelope.getModuleData(CoreData.class)).menus, new qcj() { // from class: l.ed8
                            @Override // p153l.qcj
                            public final Object call(Object obj) {
                                return Boolean.valueOf(str.equals(((OfficialAccountsMenu) obj).f21202id));
                            }
                        });
                        if (NullChecker.m82486a(officialAccountsMenu)) {
                            if (officialAccount.localMenus == null) {
                                officialAccount.localMenus = new ArrayList();
                            }
                            officialAccount.localMenus.add(officialAccountsMenu);
                            if (NullChecker.m82486a(officialAccountsMenu.children)) {
                                for (final String str2 : officialAccountsMenu.children) {
                                    OfficialAccountsMenu officialAccountsMenu2 = (OfficialAccountsMenu) jyb.m147529r(((CoreData) envelope.getModuleData(CoreData.class)).menus, new qcj() { // from class: l.fd8
                                        @Override // p153l.qcj
                                        public final Object call(Object obj) {
                                            return Boolean.valueOf(str2.equals(((OfficialAccountsMenu) obj).f21202id));
                                        }
                                    });
                                    if (NullChecker.m82486a(officialAccountsMenu2)) {
                                        OfficialAccountsSubMenu officialAccountsSubMenu = new OfficialAccountsSubMenu();
                                        officialAccountsSubMenu.f21203id = officialAccountsMenu2.f21202id;
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
        f20579Z2 = zwk.m221905e() ? "https://m.staging2.p1staff.com/fep/tantan/frontend/tantan-frontend-app-pages-v2/src/pages/core/warming/index.html?speed=true&_bid=1003197&hideNavigationBar=1&hideNotch=1" : "https://m.tantanapp.com/fep/tantan/frontend/tantan-frontend-app-pages-v2/src/pages/core/warming/index.html?speed=true&_bid=1003197&hideNavigationBar=1&hideNotch=1";
        f20580a3 = 500;
        f20581b3 = Schedulers.from(Executors.newSingleThreadScheduledExecutor());
        Filter<Conversation> filterMo61359EQ = Conversation.CONVTYPE.mo61359EQ(ConversationType.swiper);
        Filter<Conversation> filterNOT_STARTS_WITH = Conversation.f21114ID.NOT_STARTS_WITH("fake_conversation");
        TEnumColumn<Conversation, ConversationStatus> tEnumColumn = Conversation.STATUS;
        f20582c3 = Filter.AND(filterMo61359EQ, filterNOT_STARTS_WITH, tEnumColumn.NEQ("dismissed"), tEnumColumn.NEQ("deleted"), tEnumColumn.NEQ("removed"));
    }

    public C4891g(C4883c c4883c) {
        super(c4883c);
        this.f20634R = new p560();
        this.f20637S = new yk30();
        Boolean bool = Boolean.FALSE;
        this.f20640T = bool;
        this.f20643U = new StringBuilder("");
        this.f20646V = RemoteConfig.m80481x().m80483B("intl_text_buzz_auto_delete_interval", 86400L) * 1000;
        this.f20649W = C22508b.m222767b();
        this.f20652X = C22508b.m222767b();
        this.f20655Y = C22508b.m222767b();
        this.f20658Z = C22507a.m222759c("");
        this.f20661a0 = -1.0d;
        this.f20664b0 = C22508b.m222767b();
        this.f20667c0 = C22508b.m222767b();
        this.f20670d0 = C22508b.m222767b();
        this.f20673e0 = C22508b.m222767b();
        this.f20676f0 = C22507a.m222759c(bool);
        this.f20679g0 = C22508b.m222767b();
        this.f20682h0 = C22507a.m222759c(new bkj0("impress_conv_state_default", null, -1L));
        this.f20685i0 = 0L;
        this.f20688j0 = new byd0("fold_conversation_split_time_saved" + CoreModule.m30929H().userId(), 0L);
        this.f20691k0 = 0L;
        this.f20694l0 = new byd0("weaken_conv_time_saved" + CoreModule.m30929H().userId(), 0L);
        this.f20697m0 = new vxd0("localConversationId" + CoreModule.m30929H().userId(), 0);
        this.f20700n0 = new byd0("last_chat_button_safety_reminder_time_" + CoreModule.m30929H().userId(), 0L);
        this.f20703o0 = new jxd0("hide_chat_button_safety_reminder_" + CoreModule.m30929H().userId(), bool);
        this.f20706p0 = new jxd0("is_show_all_match_pop_window" + CoreModule.m30929H().userId(), bool);
        this.f20709q0 = null;
        this.f20712r0 = null;
        String str = "conv_cell_weaken_fun_warn" + CoreModule.m30929H().userId();
        Boolean bool2 = Boolean.TRUE;
        this.f20715s0 = new jxd0(str, bool2);
        this.f20718t0 = new vxd0("conv_weaken_show_count" + CoreModule.m30929H().userId(), 0);
        this.f20721u0 = new byd0("conv_cell_weaken_fun_warn_close_time" + CoreModule.m30929H().userId(), 0L);
        this.f20724v0 = new jxd0("conv_cell_fold_switch_open" + CoreModule.m30929H().userId(), bool2);
        this.f20727w0 = new jxd0("conv_cell_fold_fun_open" + CoreModule.m30929H().userId(), bool);
        this.f20730x0 = true;
        this.f20733y0 = new jxd0("conv_cell_fold_fun_is_open_save" + CoreModule.m30929H().userId(), bool);
        this.f20736z0 = new vxd0("hideChatButtonSafetyReminderCount" + CoreModule.m30929H().userId(), 0);
        this.f20583A0 = C22507a.m222759c(bool);
        this.f20586B0 = C22507a.m222758b();
        this.f20589C0 = C22507a.m222758b();
        this.f20592D0 = C22507a.m222759c(pf60.m172085a(null, 0));
        this.f20595E0 = new wyd0("message_new_match_op_back" + CoreModule.m30929H().userId(), "");
        this.f20598F0 = C22507a.m222758b();
        this.f20601G0 = new jxd0("male_like_limit_is_req" + CoreModule.m30929H().userId(), bool);
        this.f20604H0 = new byd0("male_like_limit_star_time_" + CoreModule.m30929H().userId(), 0L);
        this.f20607I0 = new byd0("male_like_limit_end_time_" + CoreModule.m30929H().userId(), 0L);
        this.f20610J0 = new wyd0("male_like_limit_user_id_" + CoreModule.m30929H().userId(), "");
        this.f20613K0 = new jxd0("male_like_limit_hidden_" + CoreModule.m30929H().userId(), bool);
        this.f20616L0 = new vxd0("clean_unread_notification" + CoreModule.m30929H().userId(), -1);
        this.f20619M0 = new byd0("last_show_ice_emoji_no_reply_time" + CoreModule.m30929H().userId(), 0L);
        this.f20622N0 = new vxd0("last_show_ice_emoji_noreply_show_count" + CoreModule.m30929H().userId(), 0);
        this.f20625O0 = new byd0("last_show_ice_emoji_message_time_limit_time" + CoreModule.m30929H().userId(), 0L);
        this.f20628P0 = new vxd0("last_show_ice_emoji_message_time_count" + CoreModule.m30929H().userId(), 0);
        this.f20631Q0 = false;
        this.f20635R0 = new wyd0("special_guest_last_message" + CoreModule.m30929H().userId(), "Hi，我是探探特邀嘉宾，很开心遇见你！");
        this.f20638S0 = new wyd0("special_guest_avatar_url" + CoreModule.m30929H().userId(), "");
        this.f20641T0 = new wyd0("special_guest_avatar_name" + CoreModule.m30929H().userId(), "");
        this.f20644U0 = new wyd0("greet_accessory_Text" + CoreModule.m30929H().userId(), "叮咚！已经为你找到匹配度98.9%的人啦，点击卡片去打个招呼吧");
        this.f20647V0 = new wyd0("special_guest_h5_url" + CoreModule.m30929H().userId(), "");
        this.f20650W0 = new jxd0("special_guest_finish_info_fail" + CoreModule.m30929H().userId(), bool);
        this.f20653X0 = new jxd0("special_guest_end_word" + CoreModule.m30929H().userId(), bool);
        this.f20656Y0 = new jxd0("special_guest_fill_finished" + CoreModule.m30929H().userId(), bool);
        this.f20659Z0 = new jxd0("special_guest_show_red_dot" + CoreModule.m30929H().userId(), bool);
        this.f20662a1 = new wyd0("special_guest_user_info_name" + CoreModule.m30929H().userId(), "");
        this.f20665b1 = new wyd0("special_guest_user_info_avatar" + CoreModule.m30929H().userId(), "");
        this.f20668c1 = new wyd0("special_guest_user_info_age" + CoreModule.m30929H().userId(), "");
        this.f20671d1 = new jxd0("special_guest_user_hide_age" + CoreModule.m30929H().userId(), bool);
        this.f20674e1 = new wyd0("special_guest_user_info_uid" + CoreModule.m30929H().userId(), "");
        this.f20677f1 = new jxd0("countdown_like_open", bool);
        this.f20680g1 = new jxd0("warming_level_guide_show" + CoreModule.m30929H().userId(), bool);
        this.f20683h1 = new byd0("last_pull_conversation_exposure_time_" + CoreModule.m30929H().userId(), 0L);
        this.f20686i1 = new vxd0("pull_conversation_exposure_counter" + CoreModule.m30929H().userId(), 0);
        this.f20689j1 = new byd0("enter_address_book_matchp_agertimer" + CoreModule.m30929H().userId(), 0L);
        this.f20692k1 = new wyd0("land_priorities" + CoreModule.m30929H().userId(), f20572S2);
        this.f20695l1 = new jxd0("has_show_all_match_pop_window" + CoreModule.m30929H().userId(), bool);
        this.f20698m1 = new mxd0("enter_unread_new_match_timer" + CoreModule.m30929H().userId(), FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);
        this.f20701n1 = new jxd0("red_dot_test_one_debug_open", bool);
        this.f20704o1 = new jxd0("red_dot_test_two_debug_open", bool);
        this.f20707p1 = new jxd0("cht_cell_active_debug_open", bool);
        this.f20710q1 = new jxd0("femaleHeartBeatShortPath", bool);
        this.f20713r1 = new byd0("oof_enter_click_time" + CoreModule.m30929H().userId(), 0L);
        this.f20716s1 = new byd0("last_show_oof_enter_time" + CoreModule.m30929H().userId(), 0L);
        this.f20719t1 = new byd0("last_show_switch_pic_tip_time" + CoreModule.m30929H().userId(), 0L);
        this.f20722u1 = new vxd0("show_switch_pic_tip_counter" + CoreModule.m30929H().userId(), 0);
        this.f20725v1 = new jxd0("show_switch_pic_guide" + CoreModule.m30929H().userId(), bool);
        this.f20728w1 = new byd0("friend_active_remind_female" + CoreModule.m30929H().userId(), 0L);
        this.f20731x1 = new jxd0("continuous_chat_sp_debug" + CoreModule.m30929H().userId(), bool);
        this.f20734y1 = new jxd0("new_user_show_guide_pop_sp" + CoreModule.m30929H().userId(), bool);
        this.f20737z1 = new jxd0("recommend_new_match_pop_sp" + CoreModule.m30929H().userId(), bool);
        this.f20584A1 = new jxd0("message_media_item_new_pic" + CoreModule.m30929H().userId(), bool);
        this.f20587B1 = new jxd0("message_media_item_swap_anwser" + CoreModule.m30929H().userId(), bool);
        this.f20590C1 = new byd0("message_sensitive_tips_show_time" + CoreModule.m30929H().userId(), 0L);
        this.f20593D1 = new vxd0("message_sensitive_tips_show_num" + CoreModule.m30929H().userId(), 0);
        this.f20596E1 = new vxd0("associate_show_count_limit" + CoreModule.m30929H().userId(), 0);
        this.f20599F1 = new jxd0("limited_trial_see_fold_conversation_should_deleted_" + CoreModule.m30929H().userId(), bool2);
        this.f20602G1 = new jxd0("hasOpenedPrologueSettingPage" + CoreModule.m30929H().userId(), bool);
        this.f20605H1 = new vxd0("prologuesModuleViewCountToday" + CoreModule.m30929H().userId(), 0);
        this.f20608I1 = new byd0("lastProloguesModuleViewTime" + CoreModule.m30929H().userId(), 0L);
        this.f20611J1 = new vxd0("prologuesModuleViewDayCount" + CoreModule.m30929H().userId(), 0);
        this.f20614K1 = new byd0("lastProloguesCloseTime" + CoreModule.m30929H().userId(), 0L);
        this.f20617L1 = new vxd0("prologuesModuleViewCountTodayForNRP" + CoreModule.m30929H().userId(), 0);
        this.f20620M1 = new byd0("lastProloguesModuleViewTimeForNRP" + CoreModule.m30929H().userId(), 0L);
        this.f20623N1 = new vxd0("prologuesModuleViewDayCountForNRP" + CoreModule.m30929H().userId(), 0);
        this.f20626O1 = new byd0("lastProloguesCloseTimeForNRP" + CoreModule.m30929H().userId(), 0L);
        this.f20629P1 = null;
        this.f20632Q1 = false;
        this.f20636R1 = null;
        this.f20639S1 = C22507a.m222758b();
        this.f20642T1 = C22508b.m222767b();
        uxj0 uxj0Var = uxj0.f181467a;
        this.f20645U1 = C22507a.m222759c(uxj0Var);
        this.f20648V1 = C22508b.m222767b();
        this.f20651W1 = C22508b.m222767b();
        this.f20654X1 = C22507a.m222758b();
        this.f20657Y1 = false;
        this.f20660Z1 = false;
        this.f20663a2 = "";
        this.f20666b2 = C22508b.m222767b();
        this.f20669c2 = C22507a.m222758b();
        this.f20675e2 = C22508b.m222767b();
        this.f20678f2 = C22508b.m222767b();
        this.f20681g2 = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
        this.f20684h2 = C22508b.m222767b();
        this.f20687i2 = new wyd0("chat_game_info" + CoreModule.m30929H().userId(), "");
        this.f20690j2 = null;
        this.f20693k2 = new HashSet();
        this.f20696l2 = "";
        this.f20699m2 = new HashSet();
        this.f20702n2 = new ArrayList();
        this.f20705o2 = new ArrayList();
        this.f20708p2 = C22507a.m222759c(uxj0Var);
        this.f20711q2 = C22507a.m222759c(pf60.m172085a(0, 0));
        this.f20714r2 = C22507a.m222759c(bool);
        this.f20717s2 = 0;
        this.f20720t2 = C22507a.m222759c(new bkj0(0, 0, 0));
        this.f20723u2 = new vxd0("build_version_code", 0);
        this.f20726v2 = new byd0("lastLoadTime_" + CoreModule.m30929H().userId(), 0L);
        this.f20729w2 = C22507a.m222758b();
        C22507a<Double> c22507aM222758b = C22507a.m222758b();
        this.f20738z2 = c22507aM222758b;
        this.f20585A2 = c22507aM222758b.throttleLast(1000L, TimeUnit.MILLISECONDS).onBackpressureLatest().observeOn(Schedulers.m222739io()).map(new qcj() { // from class: l.ec8
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f93018a.m33610Ck((Double) obj);
            }
        }).filter(new qcj() { // from class: l.pc8
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((ConversationCounter) obj) != null);
            }
        }).map(new qcj() { // from class: l.ad8
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return C4891g.m33361ga((ConversationCounter) obj);
            }
        }).onBackpressureLatest().compose(psd0.m173592C()).subscribe(psd0.m173596G(new y20() { // from class: l.yq7
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f201155a.m33623Dk((ConversationCounter) obj);
            }
        }));
        this.f20588B2 = C22507a.m222759c(new LinkedHashMap());
        this.f20591C2 = C22507a.m222759c(new LinkedHashMap());
        this.f20594D2 = -1L;
        this.f20597E2 = new LruCache<>(100);
        this.f20600F2 = new HashSet<>();
        this.f20603G2 = new HashSet<>();
        this.f20606H2 = C22507a.m222759c(uxj0Var);
        this.f20609I2 = C22507a.m222759c(0);
        this.f20612J2 = C22507a.m222759c(new ArrayList());
        this.f20615K2 = C22507a.m222759c(new ArrayList());
        this.f20618L2 = C22508b.m222767b();
        this.f20621M2 = new d();
        this.f20624N2 = new HashMap();
        this.f20627O2 = C22507a.m222759c(uxj0Var);
        this.f20630P2 = false;
        this.f20633Q2 = false;
        if (this.f20727w0.get().booleanValue()) {
            return;
        }
        this.f20727w0.put(bool2);
        this.f20730x0 = false;
    }

    /* JADX INFO: renamed from: A3 */
    public static /* synthetic */ x1d0 m32995A3(String str) {
        x1d0.C21228a c21228aAuth = C4879a.f20236P.auth();
        if (TextUtils.isEmpty(str)) {
            str = C4879a.m32358u();
        }
        return c21228aAuth.m209043q(str).m209032f().m209028b();
    }

    /* JADX INFO: renamed from: B7 */
    public static /* synthetic */ void m33010B7(String str) {
        Conversation conversationQuery = CoreModule.f18272k.f115545m.query(str);
        if (conversationQuery == null) {
            return;
        }
        List<Message> listQuery = CoreModule.f18272k.f115535c.query(Filter.AND(Message.CID.mo61359EQ(str), Message.MESSAGETYPE.m61360EQ(MessageType.ai_chat_analysis_guide)), Message.CREATEDTIME.ASC, 0);
        if (!jyb.m147479J(listQuery)) {
            Iterator<Message> it = listQuery.iterator();
            while (it.hasNext()) {
                CoreModule.f18272k.f115535c.delete(it.next().f56859id);
            }
        }
        CoreModule.f18272k.f115545m.upsert(conversationQuery);
    }

    /* JADX INFO: renamed from: Bb */
    public static /* synthetic */ void m33014Bb(uxj0 uxj0Var) {
    }

    /* JADX INFO: renamed from: Bd */
    public static /* synthetic */ void m33016Bd(Throwable th) {
    }

    /* JADX INFO: renamed from: C4 */
    public static /* synthetic */ Boolean m33018C4(Boolean bool) {
        if (bool.booleanValue()) {
            return Boolean.TRUE;
        }
        l51.m152887G(new Runnable() { // from class: l.mr7
            @Override // java.lang.Runnable
            public final void run() {
                o1j0.m165651y("该用户未开启分享功能");
            }
        });
        return Boolean.FALSE;
    }

    /* JADX INFO: renamed from: Cb */
    public static /* synthetic */ void m33025Cb(Message message, boolean z) {
        long j = message._id;
        if (j != 0) {
            Message messageQuery = CoreModule.f18272k.f115535c.query(j);
            messageQuery.localCreatedSession = -App.f16092i.get().intValue();
            messageQuery.localNotificationStatus = NotificationStatus.get("pending");
            if (z) {
                messageQuery.localFailType = 4;
            } else {
                messageQuery.localFailType = 3;
            }
            CoreModule.f18272k.f115535c.updateBy_id(messageQuery);
        }
    }

    /* JADX INFO: renamed from: D6 */
    public static /* synthetic */ void m33031D6(Throwable th) {
    }

    /* JADX INFO: renamed from: Dd */
    public static /* synthetic */ void m33038Dd(Message message) {
        long j = message._id;
        if (j != 0) {
            CoreModule.f18272k.f115535c.delete(j);
        }
    }

    /* JADX INFO: renamed from: E3 */
    public static /* synthetic */ void m33039E3(String str) {
        DbLinks dbLinks = new DbLinks();
        dbLinks.f56859id = str;
        dbLinks.links = new Links();
        CoreModule.f18272k.f115536d.upsert(dbLinks);
    }

    /* JADX INFO: renamed from: E5 */
    public static /* synthetic */ Boolean m33041E5(Message message) {
        int i = message.localFailType;
        return Boolean.valueOf((i == 3 || i == 4) ? false : true);
    }

    /* JADX INFO: renamed from: E6 */
    public static /* synthetic */ x1d0 m33042E6(Message message, String str, Message message2) {
        String strM32216J0;
        x1d0.C21228a c21228aDebug_noAuth = C4879a.f20236P.debug_noAuth();
        if (message.moment != null) {
            strM32216J0 = C4879a.m32369w2("/" + CoreModule.m30929H().userId() + "/moments/" + message.moment + "/messages?user_id=" + str);
        } else {
            strM32216J0 = C4879a.m32216J0("/conversations/" + CoreModule.m30929H().userId() + "/messages?with=moments,questions&user_id=" + str);
        }
        return c21228aDebug_noAuth.m209043q(strM32216J0).m209038l(z1d0.create(Network.JSON, message2.toJson())).m209028b();
    }

    /* JADX INFO: renamed from: E7 */
    public static /* synthetic */ Boolean m33043E7(Conversation conversation) {
        if (gta.m132210e().m132214d().mo34679E()) {
            return Boolean.valueOf(TEnum.equals(conversation.status, "default") && !gta.m132210e().m132214d().mo34730Nd(conversation));
        }
        return Boolean.valueOf(TEnum.equals(conversation.status, "default"));
    }

    /* JADX INFO: renamed from: Ec */
    public static /* synthetic */ Sticker m33048Ec(List list, String str, SogouGifEnvelope sogouGifEnvelope) throws Throwable {
        String strM168038z = jyb.m147479J(list) ? "" : oki.m168038z(((Media) list.get(0)).url);
        if (sogouGifEnvelope.data.media.isEmpty()) {
            oki.m168025m(strM168038z);
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
        String strM163314d = niw.m163314d(new File(strM168038z));
        if (TextUtils.isEmpty(strM163314d)) {
            stickerNew_.hash = "";
        } else {
            stickerNew_.hash = strM163314d;
        }
        oki.m168025m(strM168038z);
        return stickerNew_;
    }

    /* JADX INFO: renamed from: F8 */
    public static /* synthetic */ pf60 m33055F8(List list, List list2, Conversation conversation) {
        Message message;
        if (jyb.m147479J(list) && jyb.m147479J(list2)) {
            message = null;
        } else if (jyb.m147479J(list)) {
            message = (Message) list2.get(0);
        } else if (jyb.m147479J(list2)) {
            message = (Message) list.get(0);
        } else {
            message = (Message) list.get(0);
            Message message2 = (Message) list2.get(0);
            if (message.createdTime <= message2.createdTime) {
                message = message2;
            }
        }
        return pf60.m172085a(Integer.valueOf((conversation.f21116mm * 100) / 10), message);
    }

    /* JADX INFO: renamed from: F9 */
    public static /* synthetic */ void m33056F9() {
        CoreModule.f18272k.f115545m.delete(Conversation.CONVTYPE.mo61359EQ(gta.m132210e().m132214d().mo34775W7()));
        C4887e c4887e = CoreModule.f18264c.f20387g0;
        C4887e.f20510F0.put(Boolean.FALSE);
    }

    /* JADX INFO: renamed from: G4 */
    public static /* synthetic */ void m33062G4(Throwable th) {
    }

    /* JADX INFO: renamed from: G6 */
    public static /* synthetic */ void m33064G6(Throwable th) {
    }

    /* JADX INFO: renamed from: G7 */
    public static /* synthetic */ void m33065G7(String str, x20 x20Var) {
        CoreModule.f18272k.f115535c.delete(str);
        if (NullChecker.m82486a(x20Var)) {
            x20Var.call();
        }
    }

    /* JADX INFO: renamed from: G9 */
    public static /* synthetic */ x1d0 m33067G9(List list) {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONArray jSONArray = new JSONArray();
            if (NullChecker.m82486a(list)) {
                if (list.size() > 1) {
                    Conversation conversation = (Conversation) list.get(0);
                    Conversation conversation2 = (Conversation) list.get(1);
                    if (NullChecker.m82486a(conversation) && NullChecker.m82486a(conversation2) && !TextUtils.isEmpty(conversation.otherUser) && !TextUtils.isEmpty(conversation2.otherUser)) {
                        jSONArray.put(0, conversation.otherUser);
                        jSONArray.put(1, conversation2.otherUser);
                    }
                } else if (list.size() == 1) {
                    Conversation conversation3 = (Conversation) list.get(0);
                    if (NullChecker.m82486a(conversation3) && !TextUtils.isEmpty(conversation3.otherUser)) {
                        jSONArray.put(0, conversation3.otherUser);
                    }
                }
            }
            jSONObject.put("userIDs", jSONArray);
        } catch (Exception unused) {
        }
        return C4879a.f20236P.auth().m209043q(C4879a.m32271Y("/persuade/users")).m209038l(z1d0.create(Network.JSON, jSONObject.toString())).m209028b();
    }

    /* JADX INFO: renamed from: H9 */
    public static /* synthetic */ OnlineLiveChatPair m33078H9(Throwable th) {
        return null;
    }

    /* JADX INFO: renamed from: Ha */
    public static /* synthetic */ pf60 m33079Ha(List list, List list2, Integer num) {
        return new pf60(Integer.valueOf(Math.min(num.intValue(), 100)), Boolean.valueOf((list.size() == 0 && list2.size() == 0) ? false : true));
    }

    /* JADX INFO: renamed from: I5 */
    public static /* synthetic */ List m33085I5(LogoutRecommendEnvelope logoutRecommendEnvelope) {
        List<LogoutRecommendUser> list = logoutRecommendEnvelope.data.users;
        if (jyb.m147479J(list)) {
            return null;
        }
        return list;
    }

    /* JADX INFO: renamed from: I8 */
    public static /* synthetic */ void m33088I8(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Conversation conversation = (Conversation) it.next();
            if (conversation.additional == null) {
                conversation.additional = ConversationAdditional.new_();
            }
            conversation.additional.newMatch = ExposureNewMatch.new_();
            conversation.additional.newMatch.labelExposureTime = pzi0.m174454o();
            CoreModule.f18272k.f115545m.upsert(conversation);
        }
    }

    /* JADX INFO: renamed from: I9 */
    public static /* synthetic */ Boolean m33089I9(CipherId cipherId) {
        if (NullChecker.m82486a(cipherId) && !TextUtils.isEmpty(cipherId.userId)) {
            return Boolean.TRUE;
        }
        l51.m152887G(new Runnable() { // from class: l.mc8
            @Override // java.lang.Runnable
            public final void run() {
                o1j0.m165651y("分享失败，稍后重试");
            }
        });
        return Boolean.FALSE;
    }

    /* JADX INFO: renamed from: Ia */
    public static /* synthetic */ C22421c m33090Ia(String str) {
        final JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("msgType", str);
        } catch (Exception unused) {
        }
        return qi20.m176655b(new pcj() { // from class: l.x98
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4879a.f20236P.auth().m209043q(C4879a.m32203G("/picture-verify/righted/reject")).m209038l(z1d0.create(Network.JSON, jSONObject.toString())).m209028b();
            }
        }, 0);
    }

    /* JADX INFO: renamed from: J7 */
    public static /* synthetic */ x1d0 m33098J7(boolean z, String str) {
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
        return C4879a.f20236P.auth().m209043q(C4879a.m32257U0("/conversations/" + str)).m209037k(z1d0.create(Network.JSON, string)).m209028b();
    }

    /* JADX INFO: renamed from: J8 */
    public static /* synthetic */ void m33099J8(Throwable th) {
        if (th.getMessage().contains("share limit run out")) {
            o1j0.m165651y("您今日已达到分享用户次数的上线啦~明天再来吧");
        } else {
            o1j0.m165651y("分享失败");
        }
    }

    /* JADX INFO: renamed from: Jd */
    public static /* synthetic */ void m33104Jd(ConversationPatchRecord conversationPatchRecord, Conversation conversation) {
        CoreModule.f18272k.f115544l.upsert(conversationPatchRecord);
        conversation.read = Boolean.TRUE;
        conversation.unreadMessages = 0;
        CoreModule.f18272k.f115545m.upsert(conversation);
    }

    /* JADX INFO: renamed from: K7 */
    public static /* synthetic */ List m33109K7(List list, Message message, List list2) {
        if (!jyb.m147479J(list)) {
            for (int i = 0; i < list.size(); i++) {
                Media media = (Media) list.get(i);
                if (media instanceof Audio) {
                    oki.m168025m(oki.m168038z(media.url));
                } else if (media instanceof Video) {
                    ecj.m120373G(ecj.f93065c, message.f56859id);
                }
            }
        }
        return list2;
    }

    /* JADX INFO: renamed from: K8 */
    public static /* synthetic */ void m33110K8(List list) {
        if (jyb.m147479J(list)) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Message messageQuery = CoreModule.f18272k.f115535c.query((String) it.next());
            if (TEnum.equals(messageQuery.messageType, MessageType.common_tip) && NullChecker.m82486a(messageQuery.extData) && TextUtils.equals(messageQuery.extData.extra, "pat")) {
                messageQuery.extData.extra2 = "pat_grey";
                CoreModule.f18272k.f115535c.upsert(messageQuery);
            }
        }
    }

    /* JADX INFO: renamed from: Ka */
    public static /* synthetic */ JSONArray m33112Ka(List list) {
        try {
            JSONArray jSONArray = new JSONArray();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Message message = (Message) it.next();
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("id", message.f56859id);
                } catch (JSONException e) {
                    CrashHelper.m82479c(e);
                }
                jSONArray.put(jSONObject);
            }
            return jSONArray;
        } catch (Exception e2) {
            CrashHelper.m82479c(e2);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0075  */
    /* JADX INFO: renamed from: Kd */
    public static /* synthetic */ void m33115Kd(Message message, String str, String str2, long j, Envelope envelope) {
        String str3;
        if (!NullChecker.m82486a(envelope)) {
            str3 = str;
        } else {
            if (jyb.m147479J(((CoreData) envelope.getModuleData(CoreData.class)).messages)) {
                CrashHelper.m82485i(new Exception("return null messages"), "core_raw_message_post", CrashHelper.ReportLevel.p5, 100);
                return;
            }
            Message message2 = ((CoreData) envelope.getModuleData(CoreData.class)).messages.get(0);
            message2.fromConvType = message.fromConvType;
            if (message.moment == null || TEnum.equals(message.messageType, "moment_chat")) {
                str3 = str;
                m600.m157134g(message2, str2, "success", str3, 1, SystemClock.elapsedRealtime() - j);
            } else if (User.isMatched(CoreModule.f18264c.f20381e0.m116488M7(str))) {
                str3 = str;
                m600.m157134g(message2, str2, "success", str3, 1, SystemClock.elapsedRealtime() - j);
            } else {
                str3 = str;
            }
        }
        if (message.moment != null || User.isTeamAccount(str3)) {
            return;
        }
        uqb0.m197269e1("message_sent", new Object[0]);
    }

    /* JADX INFO: renamed from: L7 */
    public static /* synthetic */ void m33120L7(ConversationPatchRecord conversationPatchRecord, String str) {
        int i = conversationPatchRecord.retryCount + 1;
        conversationPatchRecord.retryCount = i;
        if (i >= 3) {
            CoreModule.f18272k.f115544l.delete(str);
        } else {
            CoreModule.f18272k.f115544l.updateBy_id(conversationPatchRecord);
        }
    }

    /* JADX INFO: renamed from: L9 */
    public static /* synthetic */ void m33122L9(Throwable th) {
    }

    /* JADX INFO: renamed from: Ld */
    public static /* synthetic */ List m33126Ld(String str, Envelope envelope) {
        ChatProfile next;
        if (!jyb.m147479J(((CoreData) envelope.getModuleData(CoreData.class)).chatProfiles)) {
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
        return NullChecker.m82486a(next) ? next.iceBreakingQuestions : Collections.EMPTY_LIST;
    }

    /* JADX INFO: renamed from: M4 */
    public static /* synthetic */ Double m33128M4(Double d2, Envelope envelope) {
        return d2;
    }

    /* JADX INFO: renamed from: M7 */
    public static /* synthetic */ x1d0 m33131M7(String str, boolean z) {
        x1d0.C21228a c21228aM209043q = C4879a.f20236P.auth().m209043q(C4879a.m32203G("/love_letter/reply"));
        e7y e7yVar = Network.JSON;
        StringBuilder sb = new StringBuilder("{\"id\":\"");
        sb.append(str);
        sb.append("\", \"state\":\"");
        sb.append(z ? "opened" : LoveLetterMessageState.replied);
        sb.append("\"}");
        return c21228aM209043q.m209037k(z1d0.create(e7yVar, sb.toString())).m209028b();
    }

    /* JADX INFO: renamed from: Mc */
    public static /* synthetic */ ConversationBatchPatchIds m33136Mc() {
        List<Conversation> listM33965fq = CoreModule.f18264c.f20384f0.m33965fq();
        ArrayList arrayList = new ArrayList();
        Iterator<Conversation> it = listM33965fq.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().f56859id);
        }
        ConversationBatchPatchIds conversationBatchPatchIdsNew_ = ConversationBatchPatchIds.new_();
        conversationBatchPatchIdsNew_.ids = arrayList;
        return conversationBatchPatchIdsNew_;
    }

    /* JADX INFO: renamed from: N4 */
    public static /* synthetic */ x1d0 m33139N4(String str, String str2, boolean z) {
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
        return C4879a.f20236P.auth().m209043q(C4879a.m32271Y("/outside/userid")).m209038l(z1d0.create(Network.JSON, jSONObject.toString())).m209028b();
    }

    /* JADX INFO: renamed from: N5 */
    public static /* synthetic */ Double m33140N5(Double d2, Message message) {
        return d2;
    }

    /* JADX INFO: renamed from: N6 */
    public static /* synthetic */ Message m33141N6(List list) {
        if (jyb.m147479J(list)) {
            return null;
        }
        return (Message) list.get(0);
    }

    /* JADX INFO: renamed from: Na */
    public static /* synthetic */ void m33145Na(String str, double d2) {
        Conversation conversationQuery = CoreModule.f18272k.f115545m.query(str);
        if (NullChecker.m82486a(conversationQuery)) {
            conversationQuery.localBotherCodeTime = d2;
            CoreModule.f18272k.f115545m.upsert(conversationQuery);
        }
    }

    /* JADX INFO: renamed from: Nc */
    public static /* synthetic */ void m33147Nc(Message message, boolean z) {
        Message messageMo225055clone = message.mo225055clone();
        HarassAlertInfo harassAlertInfoNew_ = messageMo225055clone.additionalData.harassAlertInfo;
        if (harassAlertInfoNew_ == null) {
            harassAlertInfoNew_ = HarassAlertInfo.new_();
        }
        harassAlertInfoNew_.status = z ? "reported" : "ignored";
        CoreModule.f18272k.f115535c.upsert(messageMo225055clone);
    }

    /* JADX INFO: renamed from: O7 */
    public static /* synthetic */ pf60 m33153O7(String str) {
        List<T> listM208674j = CoreModule.f18272k.f115535c.m189476l0(str).m208674j();
        Message message = (listM208674j == 0 || listM208674j.isEmpty()) ? null : (Message) listM208674j.get(0);
        return jyb.m147494Y(listM208674j == 0 ? null : (Message) jyb.m147529r(listM208674j, new qcj() { // from class: l.l68
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(TEnum.equals(((Message) obj).status(), "normal"));
            }
        }), message != null ? Double.valueOf(message.createdTime) : null);
    }

    /* JADX INFO: renamed from: Oa */
    public static /* synthetic */ void m33156Oa(String str) {
        Message messageQuery = CoreModule.f18272k.f115535c.query(str);
        if (NullChecker.m82486a(messageQuery)) {
            CoreModule.f18272k.f115535c.delete(messageQuery._id);
        }
    }

    /* JADX INFO: renamed from: Pb */
    public static /* synthetic */ pf60 m33168Pb(Boolean bool) {
        String strDateToApiTimeString;
        mm6 mm6Var = CoreModule.f18272k.f115545m;
        TEnumColumn<Conversation, ConversationStatus> tEnumColumn = Conversation.STATUS;
        int iCount = mm6Var.count(Filter.m82444OR(tEnumColumn.m61360EQ("default"), tEnumColumn.m61360EQ("blocked")), -1);
        DbLinks dbLinks = (DbLinks) uqb0.f180405k0.f184354c.query(SchemeKey.conversations);
        if (NullChecker.m82486a(dbLinks)) {
            strDateToApiTimeString = Uri.parse(C4879a.m32375y0(dbLinks.links.previous)).getQueryParameter("since");
        } else {
            List<Conversation> listQuery = CoreModule.f18272k.f115545m.query(Filter.m82444OR(tEnumColumn.m61360EQ("default"), tEnumColumn.m61360EQ("blocked")), Conversation.UPDATEDTIME.DESC, 1);
            strDateToApiTimeString = !jyb.m147479J(listQuery) ? Converter.dateToApiTimeString(listQuery.get(0).updatedTime) : "";
        }
        final JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("total", iCount);
            jSONObject.put("statuses", new JSONArray(ConversationStatus.JSON_ADAPTER.ARRAY_ADAPTER().serialize(jyb.m147507f0(ConversationStatus.get("default"), ConversationStatus.get("blocked")))));
            jSONObject.put("latestUpdatedTime", strDateToApiTimeString);
        } catch (JSONException e) {
            CrashHelper.m82479c(e);
        }
        Envelope envelopeM165964c = qi20.m176654a(new pcj() { // from class: l.t28
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4879a.f20236P.auth().m209043q(C4879a.m32214I2("/counter-verifications")).m209038l(z1d0.create(Network.JSON, jSONObject.toString())).m209028b();
            }
        }).toBlocking().m165964c(null);
        if (NullChecker.m82486a(envelopeM165964c)) {
            return pf60.m172085a(((CoreData) envelopeM165964c.getModuleData(CoreData.class)).counterVerification, strDateToApiTimeString);
        }
        return null;
    }

    /* JADX INFO: renamed from: R4 */
    public static /* synthetic */ pf60 m33183R4(List list, List list2, Conversation conversation) {
        Message message;
        if (jyb.m147479J(list) && jyb.m147479J(list2)) {
            message = null;
        } else if (jyb.m147479J(list)) {
            message = (Message) list2.get(list2.size() - 1);
        } else if (jyb.m147479J(list2)) {
            message = (Message) list.get(list.size() - 1);
        } else {
            message = (Message) list.get(list.size() - 1);
            Message message2 = (Message) list2.get(list2.size() - 1);
            if (message.createdTime <= message2.createdTime) {
                message = message2;
            }
        }
        return pf60.m172085a(Integer.valueOf((conversation.f21116mm * 100) / 20), message);
    }

    /* JADX INFO: renamed from: R7 */
    public static /* synthetic */ pf60 m33186R7(List list, List list2, Integer num) {
        return new pf60(Integer.valueOf(Math.min((int) ((num.intValue() / 20.0f) * 100.0f), 100)), Boolean.valueOf((list.size() == 0 && list2.size() == 0) ? false : true));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x000e  */
    /* JADX INFO: renamed from: R9 */
    public static /* synthetic */ Boolean m33188R9(List list) {
        boolean z;
        if (!list.isEmpty()) {
            z = list.size() == 1;
        }
        return Boolean.valueOf(z);
    }

    /* JADX INFO: renamed from: Ro */
    public static C22421c<Envelope> m33193Ro(final String str, final Message message) {
        final Message messageMo225055clone = message.mo225055clone();
        if (messageMo225055clone.moment != null) {
            messageMo225055clone.moment = null;
            if (!CoreModule.m30932N().mo61524bt() || (!TEnum.equals(messageMo225055clone.messageType, "sticker") && !TEnum.equals(messageMo225055clone.messageType, "picture"))) {
                messageMo225055clone.messageType = null;
            }
        }
        final String strM157130c = m600.m157130c();
        final long jElapsedRealtime = SystemClock.elapsedRealtime();
        return new ti20((pcj<x1d0>) new pcj() { // from class: l.ix7
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4891g.m33446o5(message, str, strM157130c, messageMo225055clone);
            }
        }, (message.moment == null || TEnum.equals(message.messageType, "moment_chat")) ? C4879a.f20232L | C4879a.f20233M : C4879a.f20233M).doOnNext(new y20() { // from class: l.tx7
            @Override // p153l.y20
            public final void call(Object obj) {
                C4891g.m33115Kd(message, str, strM157130c, jElapsedRealtime, (Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: S3 */
    public static /* synthetic */ void m33194S3(Envelope envelope) {
        DbLinks dbLinksNew_ = DbLinks.new_();
        dbLinksNew_.f56859id = "conversations_deleted";
        dbLinksNew_.links = envelope.pagination.links;
        uqb0.f180405k0.f184354c.upsert(dbLinksNew_);
    }

    /* JADX INFO: renamed from: T6 */
    public static /* synthetic */ Conversation m33208T6(List list) {
        if (jyb.m147479J(list)) {
            return null;
        }
        return (Conversation) list.get(0);
    }

    /* JADX INFO: renamed from: U6 */
    public static /* synthetic */ x1d0 m33219U6(String str) {
        String string;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(NotificationCompat.CATEGORY_STATUS, "hidden");
            string = jSONObject.toString();
        } catch (JSONException unused) {
            string = WeJson.EMPTY_MAP;
        }
        return C4879a.f20236P.auth().m209043q(C4879a.m32257U0("/conversations/" + str)).m209037k(z1d0.create(Network.JSON, string)).m209028b();
    }

    /* JADX INFO: renamed from: V8 */
    public static /* synthetic */ void m33232V8() {
        CoreModule.f18272k.f115545m.delete(Conversation.CONVTYPE.mo61359EQ(ConversationType.feedinteraction));
        C4891g c4891g = CoreModule.f18264c.f20384f0;
        f20573T2.put(Boolean.FALSE);
    }

    /* JADX INFO: renamed from: W5 */
    public static /* synthetic */ JSONObject m33240W5(String str, List list, Message message) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("localId", str);
        jSONObject.put("toUserIds", new JSONArray((Collection) list));
        jSONObject.put("message", new JSONObject(message.toJson()));
        return jSONObject;
    }

    /* JADX INFO: renamed from: X4 */
    public static /* synthetic */ Message m33250X4(List list) {
        return (Message) list.get(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: X8 */
    public static /* synthetic */ List m33254X8(Message message, List list, bkj0 bkj0Var) {
        if (((Boolean) bkj0Var.f77081a).booleanValue()) {
            message.riskTags = (List) bkj0Var.f77082b;
        }
        message.localExtraInfo = TextUtils.isEmpty((CharSequence) bkj0Var.f77083c) ? "" : (String) bkj0Var.f77083c;
        return list;
    }

    /* JADX INFO: renamed from: Xb */
    public static /* synthetic */ void m33257Xb(String str, double d2) {
        Conversation conversationQuery = CoreModule.f18272k.f115545m.query("fake_conversation_profile_featured");
        if (TextUtils.isEmpty(str) && conversationQuery == null) {
            return;
        }
        long jM174454o = pzi0.m174454o();
        if (conversationQuery == null) {
            conversationQuery = Conversation.new_();
            conversationQuery.f56859id = "fake_conversation_profile_featured";
            conversationQuery.createdTime = jM174454o;
            conversationQuery.convType = "default";
            conversationQuery.otherUser = str;
            conversationQuery.localEverHasMessage = true;
        } else if (NullChecker.m82486a(str)) {
            conversationQuery.otherUser = str;
        }
        conversationQuery.latestTime = d2;
        CoreModule.f18264c.f20384f0.m34053mq(conversationQuery);
    }

    /* JADX INFO: renamed from: Y5 */
    public static /* synthetic */ void m33262Y5() {
        CoreModule.f18272k.f115545m.deleteAll();
        uqb0.f180405k0.f184354c.delete(SchemeKey.conversations);
        CoreModule.f18272k.f115536d.deleteAll();
    }

    /* JADX INFO: renamed from: Y6 */
    public static /* synthetic */ void m33263Y6(String str) {
        Conversation conversationQuery = CoreModule.f18272k.f115545m.query(str);
        if (conversationQuery == null || !TextUtils.equals(conversationQuery.convType, ConversationType.intlSeeChatRequest)) {
            return;
        }
        CoreModule.f18272k.f115545m.delete(str);
    }

    /* JADX INFO: renamed from: Z7 */
    public static /* synthetic */ void m33275Z7(String str, double d2) {
        Conversation conversationQuery = CoreModule.f18272k.f115545m.query(str);
        if (NullChecker.m82486a(conversationQuery)) {
            conversationQuery.localBotherWxTime = d2;
            CoreModule.f18272k.f115545m.upsert(conversationQuery);
        }
    }

    /* JADX INFO: renamed from: Z8 */
    public static /* synthetic */ pf60 m33276Z8(List list, List list2, Conversation conversation) {
        Message message;
        int i = conversation.quickChatProgress;
        int i2 = conversation.additional.quickChat.progress;
        if (i <= i2) {
            i = i2;
        }
        if (jyb.m147479J(list) && jyb.m147479J(list2)) {
            message = null;
        } else if (jyb.m147479J(list)) {
            message = (Message) list2.get(list2.size() - 1);
        } else if (jyb.m147479J(list2)) {
            message = (Message) list.get(list.size() - 1);
        } else {
            message = (Message) list.get(list.size() - 1);
            Message message2 = (Message) list2.get(list2.size() - 1);
            if (message.createdTime <= message2.createdTime) {
                message = message2;
            }
        }
        return pf60.m172085a(Integer.valueOf(i), message);
    }

    /* JADX INFO: renamed from: Z9 */
    public static /* synthetic */ void m33277Z9(User user, Message message) {
        if (gta.m132210e().m132214d().mo34811c() && user.onlineMatch() && user.onlineMatchLocked()) {
            message.localFailType = 2;
        }
    }

    /* JADX INFO: renamed from: Zb */
    public static /* synthetic */ void m33279Zb(List list, final User user) {
        FriendInfo friendInfo = (FriendInfo) jyb.m147529r(list, new qcj() { // from class: l.ea8
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((FriendInfo) obj).userId, user.f56859id));
            }
        });
        if (NullChecker.m82486a(user) && NullChecker.m82486a(friendInfo)) {
            Location location = user.location;
            location.updatedTime = Math.max(friendInfo.lastActivity, location.updatedTime);
        }
    }

    /* JADX INFO: renamed from: a7 */
    public static /* synthetic */ C22421c m33286a7(final Message message, final List list) {
        return (!jyb.m147479J(list) && (list.get(0) instanceof Picture) && uqb0.f180386R.m184740c()) ? uqb0.f180386R.m184739b(Uri.parse(((Media) list.get(0)).url).getPath()).map(new qcj() { // from class: l.sx7
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return C4891g.m33254X8(message, list, (bkj0) obj);
            }
        }) : C22421c.just(list);
    }

    /* JADX INFO: renamed from: ae */
    public static /* synthetic */ x1d0 m33293ae(String str, String str2, String str3, String str4) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("feedback_id", str);
            jSONObject.put("feedback_category", str2);
            jSONObject.put(Answer.TYPE, str3);
            jSONObject.put(Constants.MessagePayloadKeys.MSGID_SERVER, str4);
        } catch (JSONException unused) {
        }
        return C4879a.f20236P.auth().m209043q(C4879a.m32203G("/restapi/feedback/satisfaction")).m209038l(z1d0.create(Network.JSON, jSONObject.toString())).m209028b();
    }

    /* JADX INFO: renamed from: ba */
    public static /* synthetic */ x1d0 m33301ba(boolean z, Message message, String str) {
        String string;
        try {
            JSONObject jSONObject = new JSONObject();
            if (z) {
                jSONObject.put(NotificationCompat.CATEGORY_STATUS, "removed");
            } else {
                jSONObject.put(NotificationCompat.CATEGORY_STATUS, "hidden");
            }
            if (NullChecker.m82486a(message)) {
                jSONObject.put("clearedUntil", message.f56859id);
            }
            string = jSONObject.toString();
        } catch (JSONException unused) {
            string = WeJson.EMPTY_MAP;
        }
        return C4879a.f20236P.auth().m209043q(C4879a.m32257U0("/conversations/" + str)).m209037k(z1d0.create(Network.JSON, string)).m209028b();
    }

    /* JADX INFO: renamed from: c4 */
    public static /* synthetic */ DbLinks m33307c4() {
        return (DbLinks) uqb0.f180405k0.f184354c.query(SchemeKey.conversations);
    }

    /* JADX INFO: renamed from: c9 */
    public static /* synthetic */ uxj0 m33312c9(Set set, Set set2, Throwable th) {
        set.removeAll(set2);
        return null;
    }

    /* JADX INFO: renamed from: cd */
    public static /* synthetic */ void m33316cd(Throwable th) {
    }

    /* JADX INFO: renamed from: e4 */
    public static /* synthetic */ void m33331e4(Conversation conversation, boolean z) {
        if (!TextUtils.isEmpty(conversation.localExtraInfo) || z) {
            try {
                JSONObject jSONObject = new JSONObject(!TextUtils.isEmpty(conversation.localExtraInfo) ? conversation.localExtraInfo : WeJson.EMPTY_MAP);
                jSONObject.put("keep_message_history", z);
                conversation.localExtraInfo = jSONObject.toString();
                CoreModule.f18272k.f115545m.updateBy_id(conversation);
            } catch (JSONException unused) {
            }
        }
    }

    /* JADX INFO: renamed from: e6 */
    public static /* synthetic */ void m33333e6(String str, double d2) {
        Conversation conversationQuery = CoreModule.f18272k.f115545m.query(str);
        if (NullChecker.m82486a(conversationQuery)) {
            conversationQuery.localBotheringTime = d2;
            CoreModule.f18272k.f115545m.upsert(conversationQuery);
        }
    }

    /* JADX INFO: renamed from: f9 */
    public static /* synthetic */ void m33348f9(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            CoreModule.f18272k.f115535c.delete(((Message) it.next()).f56859id);
        }
    }

    /* JADX INFO: renamed from: g6 */
    public static /* synthetic */ void m33357g6(Message message, boolean z) {
        long j = message._id;
        if (j != 0) {
            Message messageQuery = CoreModule.f18272k.f115535c.query(j);
            messageQuery.localCreatedSession = -App.f16092i.get().intValue();
            messageQuery.localNotificationStatus = NotificationStatus.get("pending");
            if (!z) {
                messageQuery.localExtraInfo = "ms_vr_ct_tg";
            }
            CoreModule.f18272k.f115535c.updateBy_id(messageQuery);
        }
    }

    /* JADX INFO: renamed from: ga */
    public static /* synthetic */ ConversationCounter m33361ga(ConversationCounter conversationCounter) {
        return conversationCounter;
    }

    /* JADX INFO: renamed from: gb */
    public static /* synthetic */ void m33362gb(Throwable th) {
    }

    /* JADX INFO: renamed from: ge */
    public static /* synthetic */ Boolean m33365ge(String str) {
        List<T> listM208674j = CoreModule.f18272k.f115535c.m189461W(str).m208674j();
        for (int i = 0; i < listM208674j.size(); i++) {
            Message message = (Message) listM208674j.get(i);
            if (NullChecker.m82486a(message) && !message.f56859id.startsWith("fake_id_")) {
                return Boolean.TRUE;
            }
        }
        return Boolean.FALSE;
    }

    /* JADX INFO: renamed from: hc */
    public static /* synthetic */ void m33375hc(Message message, int i, y20 y20Var) {
        long j = message._id;
        if (j != 0) {
            Message messageQuery = CoreModule.f18272k.f115535c.query(j);
            if (NullChecker.m82486a(messageQuery)) {
                messageQuery.localCreatedSession = -App.f16092i.get().intValue();
                messageQuery.localNotificationStatus = NotificationStatus.get("pending");
                messageQuery.localFailType = i;
                if (NullChecker.m82486a(y20Var)) {
                    y20Var.call(messageQuery);
                }
                CoreModule.f18272k.f115535c.updateBy_id(messageQuery);
            }
        }
    }

    /* JADX INFO: renamed from: i3 */
    public static /* synthetic */ Surveys m33378i3(Envelope envelope) {
        if (envelope == null || envelope.data == null || ((CoreData) envelope.getModuleData(CoreData.class)).surveys == null || ((CoreData) envelope.getModuleData(CoreData.class)).surveys.isEmpty()) {
            return null;
        }
        return ((CoreData) envelope.getModuleData(CoreData.class)).surveys.get(0);
    }

    /* JADX INFO: renamed from: i6 */
    public static /* synthetic */ ConversationBatchPatchIds m33381i6() {
        List<Conversation> listM34063nn = CoreModule.f18264c.f20384f0.m34063nn();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < listM34063nn.size() && arrayList.size() < 500; i++) {
            Conversation conversation = listM34063nn.get(i);
            if (conversation.unreadMessages > 0) {
                arrayList.add(conversation.f56859id);
            }
        }
        ConversationBatchPatchIds conversationBatchPatchIdsNew_ = ConversationBatchPatchIds.new_();
        conversationBatchPatchIdsNew_.ids = arrayList;
        return conversationBatchPatchIdsNew_;
    }

    /* JADX INFO: renamed from: id */
    public static /* synthetic */ void m33388id(final String str) {
        if (((DbLinks) CoreModule.f18272k.f115536d.query(str)) == null) {
            l9c.m153394o().m153397B(new x20() { // from class: l.hb8
                @Override // p153l.x20
                public final void call() {
                    C4891g.m33039E3(str);
                }
            });
        }
    }

    /* JADX INFO: renamed from: j6 */
    public static /* synthetic */ JSONObject m33392j6(List list) {
        try {
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Message message = (Message) it.next();
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put("id", message.f56859id);
                    jSONObject2.put(NotificationCompat.CATEGORY_STATUS, "deleted");
                } catch (JSONException e) {
                    CrashHelper.m82479c(e);
                    e.printStackTrace();
                }
                jSONArray.put(jSONObject2);
            }
            jSONObject.put("messages", jSONArray);
            return jSONObject;
        } catch (Exception e2) {
            CrashHelper.m82479c(e2);
            return null;
        }
    }

    /* JADX INFO: renamed from: jb */
    public static /* synthetic */ void m33397jb(Message message, AtomicBoolean atomicBoolean) {
        DbLinks dbLinksMo61485Oj;
        if (message._id != 0) {
            atomicBoolean.set(true);
            CoreModule.f18272k.f115535c.delete(message._id);
        }
        if (message.moment == null || (dbLinksMo61485Oj = CoreModule.m30932N().mo61485Oj(message.moment)) == null) {
            return;
        }
        dbLinksMo61485Oj.total--;
        CoreModule.m30932N().mo61534f6(dbLinksMo61485Oj);
    }

    /* JADX INFO: renamed from: k7 */
    public static /* synthetic */ void m33404k7(Throwable th) {
    }

    /* JADX INFO: renamed from: ka */
    public static /* synthetic */ List m33407ka(Envelope envelope) {
        return ((CoreData) envelope.getModuleData(CoreData.class)).liveLabels == null ? new ArrayList() : ((CoreData) envelope.getModuleData(CoreData.class)).liveLabels;
    }

    /* JADX INFO: renamed from: kc */
    public static /* synthetic */ void m33409kc(Throwable th) {
    }

    /* JADX INFO: renamed from: l4 */
    public static /* synthetic */ void m33412l4(Envelope envelope, List list) {
        List<ReadMessage> list2 = ((CoreData) envelope.getModuleData(CoreData.class)).readMessages;
        if (jyb.m147479J(list2)) {
            return;
        }
        for (ReadMessage readMessage : list2) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Message message = (Message) it.next();
                if (readMessage.f21229id.equals(message.f56859id)) {
                    message.read = true;
                    CoreModule.f18272k.f115535c.update(jyb.m147507f0(jyb.m147494Y(Message.READ, Boolean.TRUE)), Message.f21183ID.mo61359EQ(message.f56859id));
                }
            }
        }
    }

    /* JADX INFO: renamed from: l5 */
    public static /* synthetic */ void m33413l5(String str, double d2, int i) {
        Conversation conversationQuery = CoreModule.f18272k.f115545m.query(str);
        if (NullChecker.m82486a(conversationQuery)) {
            conversationQuery.localBotheringTime = d2;
            conversationQuery.localBotherStatus = i;
            CoreModule.f18272k.f115545m.upsert(conversationQuery);
        }
    }

    /* JADX INFO: renamed from: l7 */
    public static /* synthetic */ void m33415l7(Throwable th) {
    }

    /* JADX INFO: renamed from: m9 */
    public static /* synthetic */ void m33428m9(String str) {
        Message messageQuery = CoreModule.f18272k.f115535c.query(str);
        messageQuery.audio().audioRead = true;
        CoreModule.f18272k.f115535c.upsert(messageQuery);
    }

    /* JADX INFO: renamed from: mc */
    public static /* synthetic */ uxj0 m33431mc(Envelope envelope) {
        CoreModule.f18264c.m32495w3(envelope, null);
        return uxj0.f181467a;
    }

    /* JADX INFO: renamed from: md */
    public static /* synthetic */ void m33432md(Message message, String str, Envelope envelope) {
        JSONObject jSONObject;
        if (uqb0.f180386R.m184740c() && !jyb.m147479J(message.media) && (message.media.get(0) instanceof Picture)) {
            try {
                jSONObject = TextUtils.isEmpty(message.localExtraInfo) ? new JSONObject(WeJson.EMPTY_MAP) : new JSONObject(message.localExtraInfo);
            } catch (Exception unused) {
                jSONObject = null;
            }
            i4g0.m138493B("e_abnormal_image", "", pf60.m172085a("to_uid", str), pf60.m172085a("abnormal_image_url", message.media.get(0).url), pf60.m172085a("predict_info", jSONObject));
        }
    }

    /* JADX INFO: renamed from: n6 */
    public static /* synthetic */ Integer m33436n6(Conversation conversation) {
        int i = conversation.quickChatProgress;
        int i2 = conversation.additional.quickChat.progress;
        if (i <= i2) {
            i = i2;
        }
        return Integer.valueOf(i);
    }

    /* JADX INFO: renamed from: na */
    public static /* synthetic */ String m33440na(Message message, Envelope envelope) {
        if (envelope.meta.code != 0) {
            return "";
        }
        MessageFeedbackStatus messageFeedbackStatus = ((CoreData) envelope.getModuleData(CoreData.class)).msgData;
        CoreModule.f18264c.f20384f0.m33629Dq(messageFeedbackStatus, message);
        if (NullChecker.m82486a(messageFeedbackStatus)) {
            return messageFeedbackStatus.question.answer;
        }
        return null;
    }

    /* JADX INFO: renamed from: o3 */
    public static /* synthetic */ void m33444o3() {
        CoreModule.f18272k.f115545m.deleteAll();
        uqb0.f180405k0.f184354c.delete(SchemeKey.conversations);
        CoreModule.f18272k.f115536d.deleteAll();
    }

    /* JADX INFO: renamed from: o5 */
    public static /* synthetic */ x1d0 m33446o5(Message message, String str, String str2, Message message2) {
        if (message.moment == null || TEnum.equals(message.messageType, "moment_chat") || (TEnum.equals(message.messageType, "moment_comment") && NullChecker.m82486a(message.api_only_reference) && TEnum.equals(message.api_only_reference.action, "comment"))) {
            return C4879a.f20236P.auth().m209043q(C4879a.m32241Q0(str) + "&page_id=" + str2).m209038l(z1d0.create(Network.JSON, message2.toJson())).m209028b();
        }
        x1d0.C21228a c21228aAuth = C4879a.f20236P.auth();
        StringBuilder sb = new StringBuilder();
        sb.append(C4879a.m32261V0(str, message.moment, str2));
        sb.append("&source=");
        sb.append(message.getMomentShowFromType());
        sb.append(message.isFromKanKan ? "&page=kankan" : "");
        return c21228aAuth.m209043q(sb.toString()).m209038l(z1d0.create(Network.JSON, message2.toJson())).m209028b();
    }

    /* JADX INFO: renamed from: o6 */
    public static /* synthetic */ Conversation m33447o6(boolean z, boolean z2) {
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
    public static /* synthetic */ void m33448o7(double d2) {
        Conversation conversationQuery = CoreModule.f18272k.f115545m.query("fake_conversation_surprise_gift_box");
        if (conversationQuery == null) {
            conversationQuery = Conversation.new_();
            conversationQuery.f56859id = "fake_conversation_surprise_gift_box";
            conversationQuery.createdTime = d2;
            conversationQuery.latestTime = d2;
            conversationQuery.convType = "default";
            conversationQuery.localEverHasMessage = true;
            conversationQuery.level = 10;
        } else {
            conversationQuery.latestTime = d2;
        }
        CoreModule.f18264c.f20384f0.m34053mq(conversationQuery);
    }

    /* JADX INFO: renamed from: p3 */
    public static /* synthetic */ void m33455p3(String str) {
        Conversation conversationQuery = CoreModule.f18272k.f115545m.query(str);
        if (conversationQuery == null) {
            return;
        }
        List<Message> listQuery = CoreModule.f18272k.f115535c.query(Filter.AND(Message.CID.mo61359EQ(str), Message.MESSAGETYPE.m61360EQ(MessageType.local_break_ice)), Message.CREATEDTIME.ASC, 0);
        if (!jyb.m147479J(listQuery)) {
            Iterator<Message> it = listQuery.iterator();
            while (it.hasNext()) {
                CoreModule.f18272k.f115535c.delete(it.next().f56859id);
            }
        }
        conversationQuery.hasLocalBreakIce = false;
        CoreModule.f18272k.f115545m.upsert(conversationQuery);
    }

    /* JADX INFO: renamed from: p6 */
    public static /* synthetic */ void m33458p6(boolean z, NotificationStatus notificationStatus, NotificationStatus notificationStatus2, boolean z2) {
        if (z) {
            CoreModule.f18272k.f115545m.m159024k1(notificationStatus, notificationStatus2);
        }
        if (z2) {
            CoreModule.f18272k.f115535c.m189489y0(notificationStatus, notificationStatus2);
        }
    }

    /* JADX INFO: renamed from: p7 */
    public static /* synthetic */ Boolean m33459p7(Envelope envelope) {
        return !jyb.m147479J(((CoreData) envelope.getModuleData(CoreData.class)).settingGroups) ? Boolean.valueOf(((CoreData) envelope.getModuleData(CoreData.class)).settingGroups.get(0).share.userShare) : Boolean.FALSE;
    }

    /* JADX INFO: renamed from: pa */
    public static /* synthetic */ JSONObject m33462pa(List list) {
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
            CrashHelper.m82479c(e);
            return null;
        }
    }

    /* JADX INFO: renamed from: pc */
    public static /* synthetic */ void m33464pc(String str) {
        Message messageQuery = CoreModule.f18272k.f115535c.query(str);
        if (NullChecker.m82486a(messageQuery) && NullChecker.m82486a(messageQuery.additionalData) && NullChecker.m82486a(messageQuery.additionalData.exchangePicture) && !TextUtils.equals(messageQuery.additionalData.exchangePicture.status, ExchangePicture.finished)) {
            MessageAdditionalData messageAdditionalDataMo225055clone = messageQuery.additionalData.mo225055clone();
            if (messageAdditionalDataMo225055clone.exchangePicture == null) {
                messageAdditionalDataMo225055clone.exchangePicture = ExchangePicture.new_();
            }
            messageAdditionalDataMo225055clone.exchangePicture.status = ExchangePicture.finished;
            messageQuery.additionalData = messageAdditionalDataMo225055clone;
            CoreModule.f18272k.f115535c.upsert(messageQuery);
        }
    }

    /* JADX INFO: renamed from: qc */
    public static /* synthetic */ void m33475qc(Conversation conversation, List list, Message message) {
        if (conversation.f56859id.equals(message.cid)) {
            list.add(message);
        }
    }

    /* JADX INFO: renamed from: r3 */
    public static /* synthetic */ void m33477r3() {
    }

    /* JADX INFO: renamed from: s8 */
    public static /* synthetic */ void m33493s8(Sticker sticker, Sticker sticker2, Message message) {
        CoreModule.f18272k.f115539g.delete(sticker.f56859id);
        CoreModule.f18272k.f115539g.insert(sticker2);
        CoreModule.f18272k.f115535c.updateBy_id(message);
    }

    /* JADX INFO: renamed from: ta */
    public static /* synthetic */ List m33506ta(Message message) {
        if (NullChecker.m82486a(message)) {
            return message.media;
        }
        return null;
    }

    /* JADX INFO: renamed from: u8 */
    public static /* synthetic */ void m33515u8(Throwable th) {
    }

    /* JADX INFO: renamed from: v3 */
    public static /* synthetic */ AudioText m33521v3(Envelope envelope) {
        List<AudioText> list = ((CoreData) envelope.getModuleData(CoreData.class)).audioTexts;
        if (jyb.m147479J(list)) {
            return null;
        }
        return list.get(0);
    }

    /* JADX INFO: renamed from: v5 */
    public static /* synthetic */ String m33523v5(String str) {
        DbLinks dbLinks = (DbLinks) CoreModule.f18272k.f115536d.queryCache(str);
        if (dbLinks == null || !NullChecker.m82486a(dbLinks.links)) {
            return null;
        }
        return dbLinks.links.previous;
    }

    /* JADX INFO: renamed from: v8 */
    public static /* synthetic */ C22421c m33526v8(qcj qcjVar, Message message) {
        return (C22421c) qcjVar.call(message);
    }

    /* JADX INFO: renamed from: vd */
    public static /* synthetic */ x1d0 m33531vd(List list) {
        ku10.C18260a c18260aM151432f = new ku10.C18260a().m151432f(ku10.f128786j);
        if (!jyb.m147479J(list)) {
            for (int i = 0; i < list.size(); i++) {
                Media media = (Media) list.get(i);
                File file = new File(oki.m168038z(media.url));
                c18260aM151432f.m151428b("sogou_gif_" + i, niw.m163314d(file) + (TextUtils.equals(media.mediaType, "image/gif") ? ".gif" : TextUtils.equals(media.mediaType, "image/webp") ? ".webp" : ".jpeg"), z1d0.create(e7y.m119773d(media.mediaType), file));
            }
        }
        return C4879a.f20236P.auth().m209043q(C4879a.m32366w("/upload/image")).m209038l(c18260aM151432f.m151431e()).m209028b();
    }

    /* JADX INFO: renamed from: w7 */
    public static /* synthetic */ pf60 m33536w7(String str) {
        List<T> listM208674j = CoreModule.f18272k.f115535c.m189476l0(str).m208674j();
        Message message = (listM208674j == 0 || listM208674j.isEmpty()) ? null : (Message) listM208674j.get(0);
        return jyb.m147494Y(listM208674j == 0 ? null : (Message) jyb.m147529r(listM208674j, new qcj() { // from class: l.bb8
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(TEnum.equals(((Message) obj).status(), "normal"));
            }
        }), message != null ? Double.valueOf(message.createdTime) : null);
    }

    /* JADX INFO: renamed from: wf */
    public static C22421c<uxj0> m33543wf(final String str, final Message message) {
        final Message messageMo225055clone = message.mo225055clone();
        if (messageMo225055clone.moment != null) {
            messageMo225055clone.moment = null;
        }
        return new si20(new pcj() { // from class: l.xc8
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4891g.m33042E6(message, str, messageMo225055clone);
            }
        }, Envelope.JSON_ADAPTER).map(new qcj() { // from class: l.yc8
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return C4891g.m33431mc((Envelope) obj);
            }
        }).compose(C4879a.m32255T2());
    }

    /* JADX INFO: renamed from: x3 */
    public static /* synthetic */ void m33544x3(Message message) {
        long j = message._id;
        if (j != 0) {
            Message messageQuery = CoreModule.f18272k.f115535c.query(j);
            messageQuery.localFailType = 0;
            CoreModule.f18272k.f115535c.updateBy_id(messageQuery);
        }
    }

    /* JADX INFO: renamed from: x4 */
    public static /* synthetic */ void m33545x4() {
        CoreModule.f18272k.f115545m.deleteAll();
        uqb0.f180405k0.f184354c.delete(SchemeKey.conversations);
        CoreModule.f18272k.f115536d.deleteAll();
    }

    /* JADX INFO: renamed from: x7 */
    public static /* synthetic */ x1d0 m33548x7(int i, String str) {
        String string;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(FirebaseAnalytics.Param.LEVEL, i);
            string = jSONObject.toString();
        } catch (JSONException unused) {
            string = WeJson.EMPTY_MAP;
        }
        return C4879a.f20236P.auth().m209043q(C4879a.m32257U0("/conversations/" + str)).m209037k(z1d0.create(Network.JSON, string)).m209028b();
    }

    /* JADX INFO: renamed from: xd */
    public static /* synthetic */ x1d0 m33554xd(String str, String str2, String str3, String str4, String str5) {
        String string;
        try {
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            if (!TextUtils.equals(str, str2)) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("receiver", CoreModule.m30929H().userId());
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
        return C4879a.f20236P.auth().m209043q(C4879a.m32216J0("/tickles")).m209038l(z1d0.create(Network.JSON, string)).m209028b();
    }

    /* JADX INFO: renamed from: xf */
    public static C22421c<uxj0> m33555xf(final Message message) {
        final Message message2 = new Message();
        message2.recalled = Boolean.TRUE;
        return new si20(new pcj() { // from class: l.l58
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                Message message3 = message;
                return C4879a.f20236P.debug_noAuth().m209043q(C4879a.m32216J0("/conversations/" + CoreModule.m30929H().userId() + "/messages/" + message3.f56859id + "?method=patch&user_id=" + message3.cid)).m209038l(z1d0.create(Network.JSON, message2.toJson())).m209028b();
            }
        }, Envelope.JSON_ADAPTER).compose(C4879a.m32255T2()).map(new qcj() { // from class: l.w58
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return uxj0.f181467a;
            }
        });
    }

    /* JADX INFO: renamed from: z8 */
    public static /* synthetic */ Meta m33572z8(Envelope envelope) {
        if (envelope == null) {
            return null;
        }
        return envelope.meta;
    }

    /* JADX INFO: renamed from: Ae */
    public void m33578Ae() {
        m34076on().map(new jv7()).filter(new qcj() { // from class: l.kv7
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(!((Boolean) obj).booleanValue());
            }
        }).first().observeOn(Schedulers.m222739io()).map(new qcj() { // from class: l.lv7
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return C4891g.m33168Pb((Boolean) obj);
            }
        }).filter(new qcj() { // from class: l.mv7
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f138877a.m33791Rh((pf60) obj);
            }
        }).subscribe(psd0.m173597H(new y20() { // from class: l.nv7
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f143780a.m33802Sh((pf60) obj);
            }
        }, new y20() { // from class: l.ov7
            @Override // p153l.y20
            public final void call(Object obj) {
                C4891g.m33515u8((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: Af */
    public void m33579Af() {
        l51.m152919y(new Runnable() { // from class: l.ey7
            @Override // java.lang.Runnable
            public final void run() {
                this.f96403a.m33957fi();
            }
        });
    }

    /* JADX INFO: renamed from: Ag */
    public double m33580Ag() {
        long timeInMillis;
        if (gta.m132210e().m132214d().mo34767Vb()) {
            timeInMillis = this.f20694l0.get().longValue();
        } else {
            long j = this.f20691k0;
            if (j >= 1) {
                return j;
            }
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(pzi0.m174454o());
            calendar.set(calendar.get(1), calendar.get(2), calendar.get(5), 0, 0, 0);
            timeInMillis = calendar.getTimeInMillis() - (((long) (gta.m132210e().m132214d().mo34791Ye() - 1)) * 86400000);
        }
        return timeInMillis;
    }

    /* JADX INFO: renamed from: Ah */
    public boolean m33581Ah(String str, String str2) {
        if (User.isTeamAccount(str2) || TextUtils.isEmpty(str)) {
            return false;
        }
        ArrayList arrayList = new ArrayList(Arrays.asList("微信", "v信", "wx", "wechat", "加v", "加徽", "加微", "加徵", "+v", "+微", "+徽", "+徵"));
        int i = 14;
        try {
            String strM80485F = RemoteConfig.m80481x().m80485F("wechat_delay_send_info");
            if (!TextUtils.isEmpty(strM80485F)) {
                arrayList.clear();
                JSONObject jSONObject = new JSONObject(strM80485F);
                i = jSONObject.getInt("mm");
                JSONArray jSONArray = jSONObject.getJSONArray("words");
                for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                    arrayList.add((String) jSONArray.get(i2));
                }
            }
        } catch (Exception unused) {
        }
        Conversation conversationM33859Xe = Looper.getMainLooper() == Looper.myLooper() ? m33859Xe(str2) : m33738Mo(str2);
        if (conversationM33859Xe != null && conversationM33859Xe.f21116mm <= i) {
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
    public final /* synthetic */ C22421c m33582Ai(final String str) {
        return qi20.m176658e(new pcj() { // from class: l.z38
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4879a.f20236P.auth().m209043q(C4879a.m32370x(str)).m209030d().m209028b();
            }
        }).map(new qcj() { // from class: l.a48
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f68364a.m34199yi((Envelope) obj);
            }
        }).observeOn(fo0.m126432a()).map(new qcj() { // from class: l.b48
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f74887a.m34212zi((uxj0) obj);
            }
        });
    }

    /* JADX INFO: renamed from: Aj */
    public final /* synthetic */ uxj0 m33583Aj(final String str, Boolean bool) {
        if (bool.booleanValue()) {
            l51.m152888H(CoreModule.f18263b, new Runnable() { // from class: l.t88
                @Override // java.lang.Runnable
                public final void run() {
                    this.f172499a.m34213zj(str);
                }
            }, 100L);
        }
        return uxj0.f181467a;
    }

    /* JADX INFO: renamed from: Ak */
    public final /* synthetic */ vg60 m33584Ak(List list, DbLinks dbLinks) {
        return m118618Z2(list, dbLinks);
    }

    /* JADX INFO: renamed from: Al */
    public final /* synthetic */ C22421c m33585Al(final double d2) {
        return C22421c.fromCallable(new Callable() { // from class: l.t98
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f172613a.m34215zl(d2);
            }
        }).flatMap(new qcj() { // from class: l.u98
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return new ti20(new pcj() { // from class: l.ra8
                    @Override // p153l.pcj, java.util.concurrent.Callable
                    public final Object call() {
                        return C4879a.f20236P.auth().m209043q(gta.m132210e().m132214d().mo34679E() ? C4879a.m32257U0("/conversation-counters") : C4879a.m32216J0("/conversation-counters")).m209039m(z1d0.create(Network.JSON, conversationCounter.toJson())).m209028b();
                    }
                }).map(new qcj() { // from class: l.sa8
                    @Override // p153l.qcj
                    public final Object call(Object obj2) {
                        return uxj0.f181467a;
                    }
                });
            }
        }).compose(psd0.m173592C());
    }

    /* JADX INFO: renamed from: Am */
    public final /* synthetic */ void m33586Am(final double d2) {
        this.f91137Q.f20351U.m128074a(new x20() { // from class: l.fw7
            @Override // p153l.x20
            public final void call() {
                C4891g.m33448o7(d2);
            }
        });
    }

    /* JADX INFO: renamed from: An */
    public C22421c<uxj0> m33587An(final String str) {
        return this.f91137Q.now(C22421c.fromCallable(new Callable() { // from class: l.eu7
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f95846a.m33804Sj(str);
            }
        }).compose(C4879a.m32255T2()));
    }

    /* JADX INFO: renamed from: Ao */
    public C22421c<uxj0> m33588Ao(final String str, final List<Message> list) {
        return this.f91137Q.scheduled("users/me/patch/" + str, -1, new pcj() { // from class: l.ux7
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f181350a.m34009jl(list, str);
            }
        });
    }

    /* JADX INFO: renamed from: Ap */
    public C22421c<vg60<Conversation>> m33589Ap() {
        return m33752Oe(m33728Me().m159018h1());
    }

    /* JADX INFO: renamed from: Aq */
    public void m33590Aq(String str, double d2, int i) {
        Conversation conversationQuery = CoreModule.f18272k.f115545m.query(str);
        if (NullChecker.m82486a(conversationQuery)) {
            conversationQuery.conversationUserUpdatedTime = d2;
            conversationQuery.conversationUserDistance = i;
            CoreModule.f18272k.f115545m.upsert(conversationQuery);
        }
    }

    /* JADX INFO: renamed from: Be */
    public void m33591Be(final User user, final Conversation conversation) {
        this.f91137Q.f20351U.m128074a(new x20() { // from class: l.d78
            @Override // p153l.x20
            public final void call() {
                this.f85464a.m33814Th(user, conversation);
            }
        });
    }

    /* JADX INFO: renamed from: Bf */
    public void m33592Bf() {
        l51.m152919y(new Runnable() { // from class: l.yw7
            @Override // java.lang.Runnable
            public final void run() {
                this.f201802a.m33969gi();
            }
        });
    }

    /* JADX INFO: renamed from: Bg */
    public double m33593Bg() {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(pzi0.m174454o());
        calendar.set(calendar.get(1), calendar.get(2), calendar.get(5), 0, 0, 0);
        return (calendar.getTimeInMillis() - (((long) (gta.m132210e().m132214d().mo34791Ye() - 1)) * 86400000)) - 1;
    }

    /* JADX INFO: renamed from: Bh */
    public void m33594Bh(Boolean bool) {
        this.f20633Q2 = bool.booleanValue();
    }

    /* JADX INFO: renamed from: Bi */
    public final /* synthetic */ uxj0 m33595Bi(final List list, Envelope envelope) {
        this.f91137Q.f20351U.m128074a(new x20() { // from class: l.db8
            @Override // p153l.x20
            public final void call() {
                C4891g.m33088I8(list);
            }
        });
        return uxj0.f181467a;
    }

    /* JADX INFO: renamed from: Bj */
    public final /* synthetic */ C22421c m33596Bj(final String str, final String str2) {
        return new ti20(new pcj() { // from class: l.x58
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4879a.f20236P.auth().m209043q(C4879a.m32238P0(str, str2)).m209032f().m209028b();
            }
        }).map(new qcj() { // from class: l.y58
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f197543a.m34200yj(str, (Envelope) obj);
            }
        }).delay(200L, TimeUnit.MILLISECONDS).map(new qcj() { // from class: l.z58
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f203012a.m33583Aj(str, (Boolean) obj);
            }
        }).compose(C4879a.m32255T2());
    }

    /* JADX INFO: renamed from: Bk */
    public final /* synthetic */ vg60 m33597Bk(List list, DbLinks dbLinks) {
        return m118618Z2(list, dbLinks);
    }

    /* JADX INFO: renamed from: Bl */
    public final /* synthetic */ void m33598Bl(String str, Message message) {
        Conversation conversationQuery = CoreModule.f18272k.f115545m.query(str);
        if (NullChecker.m82486a(conversationQuery)) {
            CoreModule.f18272k.f115545m.upsert(conversationQuery);
            Iterator<Message> it = CoreModule.f18272k.f115535c.query(Filter.AND(Message.CID.mo61359EQ(str), Message.MESSAGETYPE.m61360EQ(MessageType.ai_chat_analysis_guide)), Message.CREATEDTIME.DESC, 0).iterator();
            while (it.hasNext()) {
                CoreModule.f18272k.f115535c.delete(it.next().f56859id);
            }
            m33944eh(message);
        }
    }

    /* JADX INFO: renamed from: Bm */
    public final /* synthetic */ void m33599Bm(String str, String str2) {
        Conversation conversationM33738Mo = m33738Mo(str);
        if (conversationM33738Mo == null) {
            return;
        }
        if ((TextUtils.isEmpty(str2) ? 0L : vnb.m201965y1(str2)) > (TextUtils.isEmpty(conversationM33738Mo.otherReadUntil) ? 0L : vnb.m201965y1(conversationM33738Mo.otherReadUntil))) {
            conversationM33738Mo.otherReadUntil = str2;
            CoreModule.f18272k.f115545m.upsert(conversationM33738Mo);
        }
    }

    /* JADX INFO: renamed from: Bn */
    public C22421c<uxj0> m33600Bn(String str) {
        return m33613Cn(str, null);
    }

    /* JADX INFO: renamed from: Bo */
    public C22421c<Optional<ConversationPatchRecord>> m33601Bo(final String str) {
        return this.f91137Q.now("patchOffline" + str, C22421c.fromCallable(new Callable() { // from class: l.jr7
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f122315a.m34022kl(str);
            }
        }).compose(C4879a.m32255T2()).doOnNext(new y20() { // from class: l.ur7
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f180573a.m34048ml((Optional) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: Bp */
    public void m33602Bp(String str, String str2, String str3) {
        Message messageNew_ = Message.new_();
        messageNew_.messageType = MessageType.get("tickle");
        messageNew_.msgData = gta.m132210e().m132214d().mo34749Rg(str2, str3);
        m33639En(str, messageNew_, null, false);
    }

    /* JADX INFO: renamed from: Bq */
    public C22421c<uxj0> m33603Bq(final String str) {
        return this.f91137Q.scheduled("upgradeCompliment_" + str, -1, new pcj() { // from class: l.p38
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f150362a.m33807Sm(str);
            }
        });
    }

    /* JADX INFO: renamed from: Ce */
    public void m33604Ce(String str) {
        User userM116593na = CoreModule.f18264c.f20381e0.m116593na();
        if (NullChecker.m82486a(userM116593na) && userM116593na.isFemale()) {
            CrashHelper.m82479c(new RuntimeException("limit like error for female from " + str + ", errorId" + this.f91137Q.f20384f0.f20610J0.get()));
        }
    }

    /* JADX INFO: renamed from: Cf */
    public C22421c<uxj0> m33605Cf(final String str) {
        return TextUtils.isEmpty(str) ? C22421c.just(uxj0.f181467a) : this.f91137Q.now(C22421c.fromCallable(new Callable() { // from class: l.nr7
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f143382a.m33993ii(str);
            }
        }).compose(C4879a.m32255T2()));
    }

    /* JADX INFO: renamed from: Cg */
    public C22421c<Boolean> m33606Cg(String str, String str2) {
        return CoreModule.f18272k.f115535c.m189451M(str, str2).m208677m().map(new qcj() { // from class: l.l18
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(!jyb.m147479J((List) obj));
            }
        });
    }

    /* JADX INFO: renamed from: Ch */
    public final /* synthetic */ void m33607Ch(String str, Conversation conversation) {
        if (!TextUtils.isEmpty(m34197yg())) {
            q4f q4fVar = new q4f();
            q4fVar.f155581s = "e_matched_time_left";
            q4fVar.f155576n = m34197yg();
            EventNameEnum eventNameEnum = EventNameEnum.USER_BEHAVIOR_COMPLEMENT;
            q4fVar.f155566d = eventNameEnum;
            int iLongValue = (int) (this.f91137Q.f20384f0.f20607I0.get().longValue() - pzi0.m174454o());
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm:ss");
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
            Date date = new Date();
            date.setTime(iLongValue);
            HashMap map = new HashMap();
            map.put("left_time", simpleDateFormat.format(date));
            i4g0.m138516n(q4fVar, map);
            q4f q4fVar2 = new q4f();
            q4fVar2.f155581s = MatchScData.MID;
            q4fVar2.f155566d = eventNameEnum;
            q4fVar2.f155576n = m34197yg();
            HashMap map2 = new HashMap();
            map2.put("receiver_user_id", str);
            map2.put("actiontype", "swipe");
            map2.put("actionname", "like");
            map2.put("update_relationships_module_id", MatchScData.ModuleId.mid_e_card);
            map2.put("update_relationships_source", "limited_time_match");
            map2.put("created_time", String.valueOf(pzi0.m174454o() / 1000));
            i4g0.m138516n(q4fVar2, map2);
        }
        psd0.m173633z(this.f20636R1);
        this.f20610J0.put("");
        this.f20604H0.put(0L);
        this.f20607I0.put(0L);
        boolean zEquals = TextUtils.equals(this.f91137Q.f20384f0.f20629P1, str);
        C4883c c4883c = this.f91137Q;
        if (zEquals) {
            c4883c.f20429u0.m31383C7(str);
        } else {
            c4883c.f20405m0.m31993D8(str);
        }
    }

    /* JADX INFO: renamed from: Ci */
    public final /* synthetic */ C22421c m33608Ci(final JSONObject jSONObject, final List list, final Set set, final Set set2) {
        return qi20.m176658e(new pcj() { // from class: l.ga8
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4879a.f20236P.auth().m209043q(C4879a.m32378z() + "?method=patch&search=newMatch").m209038l(z1d0.create(Network.JSON, jSONObject.toString())).m209028b();
            }
        }).map(new qcj() { // from class: l.ha8
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f108476a.m33595Bi(list, (Envelope) obj);
            }
        }).onErrorReturn(new qcj() { // from class: l.ia8
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return C4891g.m33312c9(set, set2, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: renamed from: Cj */
    public final /* synthetic */ x1d0 m33609Cj(Links links) {
        return C4879a.f20236P.auth().m209043q(m34055nf(links)).m209028b();
    }

    /* JADX INFO: renamed from: Ck */
    public final /* synthetic */ ConversationCounter m33610Ck(Double d2) {
        return m34215zl(d2.doubleValue());
    }

    /* JADX INFO: renamed from: Cl */
    public final /* synthetic */ uxj0 m33611Cl(final String str, final Message message) throws Exception {
        this.f91137Q.f20351U.m128074a(new x20() { // from class: l.pu7
            @Override // p153l.x20
            public final void call() {
                this.f154152a.m33598Bl(str, message);
            }
        });
        return uxj0.f181467a;
    }

    /* JADX INFO: renamed from: Cm */
    public final /* synthetic */ void m33612Cm(final String str, final String str2) {
        this.f91137Q.f20351U.m128074a(new x20() { // from class: l.u28
            @Override // p153l.x20
            public final void call() {
                this.f177188a.m33599Bm(str, str2);
            }
        });
    }

    /* JADX INFO: renamed from: Cn */
    public C22421c<uxj0> m33613Cn(final String str, final String str2) {
        if (!gta.m132210e().m132214d().mo34679E() || TextUtils.isEmpty(str2)) {
            DbLinks dbLinks = (DbLinks) CoreModule.f18272k.f115536d.queryCache(str);
            str2 = (dbLinks == null || !NullChecker.m82486a(dbLinks.links)) ? null : dbLinks.links.next;
        }
        C4883c c4883c = this.f91137Q;
        if (str2 == null) {
            return c4883c.just();
        }
        return c4883c.scheduled("conversations/" + str + "/next", 0, new pcj() { // from class: l.sq7
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f170148a.m33840Vj(str, str2);
            }
        });
    }

    /* JADX INFO: renamed from: Co */
    public C22421c<uxj0> m33614Co() {
        return this.f91137Q.scheduled("patchRecord", -1, new pcj() { // from class: l.tt7
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f176060a.m34087pl();
            }
        });
    }

    /* JADX INFO: renamed from: Cp */
    public void m33615Cp(long j) {
        this.f91137Q.f20384f0.f20689j1.put(Long.valueOf(j));
    }

    /* JADX INFO: renamed from: Cq */
    public final boolean m33616Cq() {
        return this.f20723u2.get().intValue() == 0;
    }

    /* JADX INFO: renamed from: De */
    public void m33617De(final String str) {
        l51.m152919y(new Runnable() { // from class: l.fs7
            @Override // java.lang.Runnable
            public final void run() {
                C4891g.m33388id(str);
            }
        });
    }

    /* JADX INFO: renamed from: Df, reason: merged with bridge method [inline-methods] */
    public void m33981hi(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        CoreModule.f18272k.f115535c.delete(Filter.AND(Message.CID.mo61359EQ(str), Message.MESSAGETYPE.m61360EQ(MessageType.local_chat_assistant_question_new)));
    }

    /* JADX INFO: renamed from: Dg */
    public C22421c<Conversation> m33619Dg(String str) {
        return CoreModule.f18272k.f115545m.m159043y0(str).m208677m().map(new qcj() { // from class: l.jc8
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return C4891g.m33208T6((List) obj);
            }
        });
    }

    /* JADX INFO: renamed from: Dh */
    public final /* synthetic */ uxj0 m33620Dh(Envelope envelope) {
        this.f91137Q.m32495w3(envelope, null);
        return uxj0.f181467a;
    }

    /* JADX INFO: renamed from: Di */
    public final /* synthetic */ C22421c m33621Di(int i, List list) {
        int iMin = Math.min(i, list.size());
        String[] strArr = new String[iMin];
        for (int i2 = 0; i2 < iMin; i2++) {
            strArr[i2] = ((Conversation) list.get(i2)).otherUser;
        }
        return m33860Xf(LocalPlaceBan.matchList, "match", strArr);
    }

    /* JADX INFO: renamed from: Dj */
    public final /* synthetic */ Envelope m33622Dj(final Envelope envelope) {
        this.f91137Q.m32496x3(envelope, new x20() { // from class: l.a08
            @Override // p153l.x20
            public final void call() {
                C4891g.m33194S3(envelope);
            }
        }, true);
        return envelope;
    }

    /* JADX INFO: renamed from: Dk */
    public final /* synthetic */ void m33623Dk(ConversationCounter conversationCounter) {
        if (this.f20729w2.m222761e() == null || (!conversationCounter.equalsIgnoreTime(this.f20729w2.m222761e()) && conversationCounter.updatedTime >= this.f20729w2.m222761e().updatedTime)) {
            this.f20729w2.m137019l(conversationCounter);
            this.f20732x2 = true;
        }
    }

    /* JADX INFO: renamed from: Dl */
    public final /* synthetic */ void m33624Dl(String str, Message message) {
        Conversation conversationQuery = CoreModule.f18272k.f115545m.query(str);
        if (NullChecker.m82486a(conversationQuery)) {
            conversationQuery.hasLocalBreakIce = true;
            CoreModule.f18272k.f115545m.upsert(conversationQuery);
            Iterator<Message> it = CoreModule.f18272k.f115535c.query(Filter.AND(Message.CID.mo61359EQ(str), Message.MESSAGETYPE.m61360EQ(MessageType.local_break_ice)), Message.CREATEDTIME.DESC, 0).iterator();
            while (it.hasNext()) {
                CoreModule.f18272k.f115535c.delete(it.next().f56859id);
            }
            m33944eh(message);
        }
    }

    /* JADX INFO: renamed from: Dm */
    public final /* synthetic */ void m33625Dm(String str, Message message) {
        this.f91137Q.f20381e0.m116459Ea(str, (long) message.createdTime);
    }

    /* JADX INFO: renamed from: Dn */
    public C22421c<Message> m33626Dn(String str, Message message, Sticker sticker) {
        return m33639En(str, message, sticker, false);
    }

    /* JADX INFO: renamed from: Do */
    public C22421c<uxj0> m33627Do(final String str, final String str2, final Message message, final String str3) {
        return this.f91137Q.scheduled("patch_msg_" + str2 + str3, -1, new pcj() { // from class: l.u88
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f177986a.m34126sl(message, str3, str, str2);
            }
        });
    }

    /* JADX INFO: renamed from: Dp */
    public void m33628Dp(String str, final boolean z) {
        final Conversation conversationM34219zp = m34219zp(str);
        if (conversationM34219zp == null) {
            return;
        }
        Runnable runnable = new Runnable() { // from class: l.ka8
            @Override // java.lang.Runnable
            public final void run() {
                this.f124630a.m33949em(conversationM34219zp, z);
            }
        };
        if (Looper.myLooper() == Looper.getMainLooper()) {
            l51.m152919y(runnable);
        } else {
            runnable.run();
        }
    }

    /* JADX INFO: renamed from: Dq */
    public void m33629Dq(MessageFeedbackStatus messageFeedbackStatus, Message message) {
        if (NullChecker.m82486a(message) && NullChecker.m82486a(messageFeedbackStatus)) {
            final Message messageMo225055clone = message.mo225055clone();
            messageMo225055clone.msgData = messageFeedbackStatus.toJson();
            this.f91137Q.f20351U.m128074a(new x20() { // from class: l.v88
                @Override // p153l.x20
                public final void call() {
                    CoreModule.f18272k.f115535c.upsert(messageMo225055clone);
                }
            });
        }
    }

    /* JADX INFO: renamed from: Ee */
    public void m33630Ee() {
        int iIntValue = this.f20616L0.get().intValue();
        if (iIntValue == 1) {
            return;
        }
        if (iIntValue == 0 && this.f20631Q0) {
            return;
        }
        this.f20631Q0 = true;
        this.f20616L0.put(0);
        this.f91137Q.scheduled("clean_unread_notification", -1, new pcj() { // from class: l.w88
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return qi20.m176654a(new pcj() { // from class: l.st7
                    @Override // p153l.pcj, java.util.concurrent.Callable
                    public final Object call() {
                        return C4879a.f20236P.auth().m209043q(C4879a.m32216J0("/clean-unread-notification")).m209038l(z1d0.create(Network.JSON, "")).m209028b();
                    }
                });
            }
        }).delay(200L, TimeUnit.MILLISECONDS).subscribe(psd0.m173597H(new y20() { // from class: l.h98
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f108324a.m33826Uh((Envelope) obj);
            }
        }, new y20() { // from class: l.s98
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f166913a.m33838Vh((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: Ef */
    public void m33631Ef(String str) {
        CoreModule.f18272k.f115545m.delete(str);
    }

    /* JADX INFO: renamed from: Eg */
    public int m33632Eg(String str) {
        Message messageQuery;
        return (TextUtils.isEmpty(str) || (messageQuery = CoreModule.f18272k.f115535c.query(str)) == null) ? CoreModule.f18272k.f115535c.count(Filter.AND(Message.CID.mo61359EQ(gta.m132210e().m132214d().mo34843h()), Message.MESSAGETYPE.m61360EQ("live_vip_greet")), 1) : CoreModule.f18272k.f115535c.count(Filter.AND(Message.CID.mo61359EQ(gta.m132210e().m132214d().mo34843h()), Message.MESSAGETYPE.m61360EQ("live_vip_greet"), Message.CREATEDTIME.REQ(Double.valueOf(messageQuery.createdTime))), 1);
    }

    /* JADX INFO: renamed from: Eh */
    public final /* synthetic */ C22421c m33633Eh(final ConversationBatchPatchIds conversationBatchPatchIds) {
        return jyb.m147479J(conversationBatchPatchIds.ids) ? C22421c.empty() : new ti20(new pcj() { // from class: l.g48
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4879a.f20236P.auth().m209043q(C4879a.m32378z() + "?method=patch&search=batch").m209038l(z1d0.create(Network.JSON, conversationBatchPatchIds.toJson())).m209028b();
            }
        }).map(new qcj() { // from class: l.h48
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f107766a.m33620Dh((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: Ei */
    public final /* synthetic */ void m33634Ei(List list) {
        LinkedHashMap<String, UserLiveLabel> linkedHashMap = new LinkedHashMap<>();
        if (!jyb.m147479J(list)) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                UserLiveLabel userLiveLabel = (UserLiveLabel) it.next();
                linkedHashMap.put(userLiveLabel.userId, userLiveLabel);
            }
        }
        this.f20588B2.m137019l(linkedHashMap);
    }

    /* JADX INFO: renamed from: Ej */
    public final /* synthetic */ C22421c m33635Ej(final Links links) {
        return new ti20(new pcj() { // from class: l.dy7
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f91139a.m33609Cj(links);
            }
        }).map(new qcj() { // from class: l.fy7
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f101344a.m33622Dj((Envelope) obj);
            }
        }).compose(psd0.m173592C()).map(new qcj() { // from class: l.gy7
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((Envelope) obj).pagination.links;
            }
        });
    }

    /* JADX INFO: renamed from: Ek */
    public final /* synthetic */ Conversation m33636Ek(String str) throws Exception {
        Conversation conversationM33738Mo = m33738Mo(str);
        List<Message> listM208674j = CoreModule.f18272k.f115535c.m189476l0(str).m208674j();
        if (!m33739Mp(conversationM33738Mo, listM208674j) || TEnum.equals(conversationM33738Mo.status, "dismissed")) {
            return null;
        }
        Message message = (Message) jyb.m147529r(listM208674j, new qcj() { // from class: l.k88
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(TEnum.equals(((Message) obj).status(), "normal"));
            }
        });
        Conversation conversation = new Conversation();
        conversation.readUntil = message == null ? "" : message.f56859id;
        return conversation;
    }

    /* JADX INFO: renamed from: El */
    public final /* synthetic */ uxj0 m33637El(final String str, final Message message) throws Exception {
        this.f91137Q.f20351U.m128074a(new x20() { // from class: l.oy7
            @Override // p153l.x20
            public final void call() {
                this.f149754a.m33624Dl(str, message);
            }
        });
        return uxj0.f181467a;
    }

    /* JADX INFO: renamed from: Em */
    public final /* synthetic */ void m33638Em(double d2) {
        this.f91137Q.f20351U.m128074a(new c(d2));
    }

    /* JADX INFO: renamed from: En */
    public C22421c<Message> m33639En(String str, Message message, Sticker sticker, boolean z) {
        return m33652Fn(str, message, sticker, z, true);
    }

    /* JADX INFO: renamed from: Eo */
    public C22421c<uxj0> m33640Eo(final String str, final boolean z, final boolean z2) {
        return this.f91137Q.scheduled("patchSparkAndPartnerSwitch", -1, new pcj() { // from class: l.z18
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f202487a.m34177wl(z, z2, str);
            }
        });
    }

    /* JADX INFO: renamed from: Ep */
    public void m33641Ep(boolean z) {
        this.f20599F1.put(Boolean.valueOf(z));
    }

    /* JADX INFO: renamed from: Eq */
    public C22421c<List<IceBreakingQuestion>> m33642Eq(final String str) {
        return scheduled("users/" + str + "/chat-profiles", 0, new pcj() { // from class: l.ru7
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                String str2 = str;
                return qi20.m176654a(new pcj() { // from class: l.q28
                    @Override // p153l.pcj, java.util.concurrent.Callable
                    public final Object call() {
                        return C4879a.f20236P.auth().m209043q(C4879a.m32369w2("/" + str2 + "/chat-profiles")).m209028b();
                    }
                }).map(new qcj() { // from class: l.r28
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return C4891g.m33126Ld(str2, (Envelope) obj);
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: Fe */
    public void m33643Fe() {
        psd0.m173633z(this.f20636R1);
    }

    /* JADX INFO: renamed from: Ff */
    public void m33644Ff(final List<Conversation> list) {
        l51.m152919y(new Runnable() { // from class: l.bv7
            @Override // java.lang.Runnable
            public final void run() {
                this.f78573a.m34019ki(list);
            }
        });
    }

    /* JADX INFO: renamed from: Fg */
    public boolean m33645Fg(String str) {
        return !jyb.m147479J(CoreModule.f18272k.f115535c.m189479o0(str, MessageType.local_match_ice_break));
    }

    /* JADX INFO: renamed from: Fh */
    public final /* synthetic */ C22421c m33646Fh() {
        return C22421c.fromCallable(new Callable() { // from class: l.d18
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C4891g.m33381i6();
            }
        }).flatMap(new qcj() { // from class: l.f18
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f96771a.m33633Eh((ConversationBatchPatchIds) obj);
            }
        }).compose(C4879a.m32255T2()).doOnError(new y20() { // from class: l.g18
            @Override // p153l.y20
            public final void call(Object obj) {
                C4891g.m33031D6((Throwable) obj);
            }
        });
    }

    /* JADX INFO: renamed from: Fi */
    public final /* synthetic */ C22421c m33647Fi(int i, List list) {
        int iMin = Math.min(i, list.size());
        String[] strArr = new String[iMin];
        for (int i2 = 0; i2 < iMin; i2++) {
            Conversation conversation = (Conversation) list.get(i2);
            if ("group".equals(conversation.convType)) {
                strArr[i2] = this.f91137Q.f20387g0.m32889h7(conversation.otherUser).ownerUserId;
            } else {
                strArr[i2] = conversation.otherUser;
            }
        }
        return m33860Xf("messageList", "match", strArr);
    }

    /* JADX INFO: renamed from: Fj */
    public final /* synthetic */ bkj0 m33648Fj(Boolean bool) {
        String str;
        String str2;
        mm6 mm6Var = CoreModule.f18272k.f115545m;
        StringColumn<Conversation> stringColumn = Conversation.CONVTYPE;
        int iCount = mm6Var.count(stringColumn.mo61359EQ("default"), -1);
        CounterVerification counterVerification = new CounterVerification();
        counterVerification.total = iCount;
        counterVerification.lastVerifyTime = this.f91137Q.f20381e0.f89358x1.get().longValue();
        mm6 mm6Var2 = CoreModule.f18272k.f115545m;
        Filter<Conversation> filterMo61359EQ = stringColumn.mo61359EQ("default");
        DoubleColumn<Conversation> doubleColumn = Conversation.UPDATEDTIME;
        List<Conversation> listQuery = mm6Var2.query(filterMo61359EQ, doubleColumn.DESC, 1);
        String str3 = "null";
        if (jyb.m147479J(listQuery)) {
            str = "null";
        } else {
            Conversation conversation = listQuery.get(0);
            counterVerification.latestUpdatedTime = conversation.updatedTime;
            str = conversation.f56859id;
        }
        List<Conversation> listQuery2 = CoreModule.f18272k.f115545m.query(stringColumn.mo61359EQ("default"), doubleColumn.ASC, 1);
        if (jyb.m147479J(listQuery2)) {
            str2 = "null";
        } else {
            Conversation conversation2 = listQuery2.get(0);
            counterVerification.latestUpdatedTime = conversation2.updatedTime;
            str3 = conversation2.f56859id;
            str2 = ((long) conversation2.updatedTime) + "";
        }
        final CoreData coreData = new CoreData();
        coreData.counterVerification = counterVerification;
        return bkj0.m104818a(new ti20(new pcj() { // from class: l.s08
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4879a.f20236P.auth().m209043q(C4879a.m32216J0("/counter-verifications")).m209038l(z1d0.create(Network.JSON, coreData.toJson())).m209028b();
            }
        }).toBlocking().m165964c(null), Integer.valueOf(iCount), "timeInfo: firstCid:" + str + "|firstTime:" + ((long) counterVerification.latestUpdatedTime) + "|lastCid:" + str3 + "|lastTime:" + str2 + "|");
    }

    /* JADX INFO: renamed from: Fk */
    public final /* synthetic */ uxj0 m33649Fk(Envelope envelope) {
        this.f91137Q.m32495w3(envelope, null);
        return uxj0.f181467a;
    }

    /* JADX INFO: renamed from: Fl */
    public final /* synthetic */ Message m33650Fl(String str, Message message, uxj0 uxj0Var) {
        return (message == null && NullChecker.m82486a(this.f20624N2.get(str))) ? this.f20624N2.get(str) : message;
    }

    /* JADX INFO: renamed from: Fm */
    public final /* synthetic */ uxj0 m33651Fm(final String str, final double d2) throws Exception {
        this.f91137Q.f20351U.m128074a(new x20() { // from class: l.k78
            @Override // p153l.x20
            public final void call() {
                C4891g.m33145Na(str, d2);
            }
        });
        return uxj0.f181467a;
    }

    /* JADX INFO: renamed from: Fn */
    public C22421c<Message> m33652Fn(final String str, final Message message, final Sticker sticker, final boolean z, final boolean z2) {
        final CoreProviderInterface coreProviderInterfaceM132214d = gta.m132210e().m132214d();
        coreProviderInterfaceM132214d.mo34692Ga(str);
        if (sticker != null) {
            String strGENERATE_UNIQUE_FAKE_ID = DbObject.GENERATE_UNIQUE_FAKE_ID(App.f16092i.get().intValue());
            sticker.f56859id = strGENERATE_UNIQUE_FAKE_ID;
            message.sticker = strGENERATE_UNIQUE_FAKE_ID;
        }
        final String strMo34711Jd = gta.m132210e().m132214d().mo34711Jd();
        final long jElapsedRealtime = SystemClock.elapsedRealtime();
        boolean zEquals = gta.m132210e().m132214d().mo34679E() ? true ^ TEnum.equals(message.channel, "group") : true;
        if (TextUtils.equals(this.f20610J0.get(), str)) {
            zEquals = false;
        }
        final HashMap map = new HashMap();
        if (!TEnum.equals(message.channel, "group") && !jyb.m147479J(message.media)) {
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
        pcj pcjVar = new pcj() { // from class: l.qs7
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f159250a.m33876Yj(message, str, z4, z3, sticker, coreProviderInterfaceM132214d);
            }
        };
        final qcj qcjVar = new qcj() { // from class: l.bt7
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f78335a.m33924ck(map, sticker, message, (Message) obj);
            }
        };
        final y20<Throwable> y20Var = new y20() { // from class: l.mt7
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f138548a.m33959fk(str, message, coreProviderInterfaceM132214d, z2, strMo34711Jd, jElapsedRealtime, (Throwable) obj);
            }
        };
        qcj qcjVar2 = new qcj() { // from class: l.xt7
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f196188a.m34008jk(str, z, z4, z3, y20Var, (Message) obj);
            }
        };
        qcj qcjVar3 = new qcj() { // from class: l.iu7
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f116902a.m34021kk(str, message, strMo34711Jd, jElapsedRealtime, (Message) obj);
            }
        };
        qcj qcjVar4 = new qcj() { // from class: l.tu7
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f176169a.m34034lk(message, str, (Message) obj);
            }
        };
        final long jElapsedRealtime2 = SystemClock.elapsedRealtime();
        return this.f91137Q.now(null, ((C22421c) pcjVar.call()).observeOn(Schedulers.m222739io()).flatMap(new qcj() { // from class: l.fv7
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return C4891g.m33526v8(qcjVar, (Message) obj);
            }
        }).compose(TrackMediaUploadUtil.m81489f0("chat", message.media, new qcj() { // from class: l.qv7
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return C4891g.m33506ta((Message) obj);
            }
        })).doOnError(y20Var).filter(qcjVar3).map(qcjVar4).filter(new qcj() { // from class: l.bw7
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return C4891g.m33041E5((Message) obj);
            }
        }).observeOn(fo0.m126432a()).flatMap(qcjVar2).doOnNext(new y20() { // from class: l.mw7
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f139031a.m34047mk(message, jElapsedRealtime2, str, (Message) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: Fo */
    public C22421c<uxj0> m33653Fo() {
        return (!gta.m132210e().m132214d().mo34872ka() || this.f91137Q.findRequest("conversations/get", 0) == null) ? m34072oj(null) : m33879Ym();
    }

    /* JADX INFO: renamed from: Fp */
    public C22421c<uxj0> m33654Fp(final String str, final String str2, final String str3, final String str4, final String str5) {
        return this.f91137Q.now(new ti20(new pcj() { // from class: l.qt7
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4891g.m33554xd(str2, str4, str5, str3, str);
            }
        }).map(new qcj() { // from class: l.rt7
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return uxj0.f181467a;
            }
        }).compose(C4879a.m32255T2()));
    }

    /* JADX INFO: renamed from: Fq */
    public C22421c<LinkedHashMap<String, UserLiveLabel>> m33655Fq() {
        return this.f20588B2.asObservable().observeOn(fo0.m126432a());
    }

    /* JADX INFO: renamed from: Ge */
    public void m33656Ge(final String str) {
        l51.m152919y(new Runnable() { // from class: l.lz7
            @Override // java.lang.Runnable
            public final void run() {
                this.f134160a.m33862Xh(str);
            }
        });
    }

    /* JADX INFO: renamed from: Gf */
    public void m33657Gf() {
        l51.m152919y(new Runnable() { // from class: l.zc8
            @Override // java.lang.Runnable
            public final void run() {
                this.f203740a.m34032li();
            }
        });
    }

    /* JADX INFO: renamed from: Gg */
    public C22421c<Boolean> m33658Gg(String str, MessageType messageType) {
        return CoreModule.f18272k.f115535c.m189481q0(str, messageType.toString()).m208677m().map(new qcj() { // from class: l.pq7
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(!jyb.m147479J((List) obj));
            }
        });
    }

    /* JADX INFO: renamed from: Gh */
    public final /* synthetic */ uxj0 m33659Gh(Envelope envelope) {
        this.f91137Q.m32495w3(envelope, null);
        return uxj0.f181467a;
    }

    /* JADX INFO: renamed from: Gi */
    public final /* synthetic */ void m33660Gi(List list) {
        LinkedHashMap<String, UserLiveLabel> linkedHashMap = new LinkedHashMap<>();
        if (!jyb.m147479J(list)) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                UserLiveLabel userLiveLabel = (UserLiveLabel) it.next();
                linkedHashMap.put(userLiveLabel.userId, userLiveLabel);
            }
        }
        this.f20591C2.m137019l(linkedHashMap);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Gj */
    public final /* synthetic */ void m33661Gj(bkj0 bkj0Var) {
        Envelope envelope = (Envelope) bkj0Var.f77081a;
        if (NullChecker.m82486a(((CoreData) envelope.getModuleData(CoreData.class)).counterVerification) && ((CoreData) envelope.getModuleData(CoreData.class)).counterVerification.nextVerifyTime > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            this.f91137Q.f20381e0.f89351w1.put(Long.valueOf((long) ((CoreData) envelope.getModuleData(CoreData.class)).counterVerification.nextVerifyTime));
        }
        this.f91137Q.f20381e0.f89358x1.put(Long.valueOf(pzi0.m174454o()));
        if (NullChecker.m82486a(((CoreData) envelope.getModuleData(CoreData.class)).counterVerification) && ((CoreData) envelope.getModuleData(CoreData.class)).counterVerification.needSync) {
            mm6 mm6Var = CoreModule.f18272k.f115545m;
            StringColumn<Conversation> stringColumn = Conversation.CONVTYPE;
            List<Conversation> listQuery = mm6Var.query(stringColumn.mo61359EQ("default"), Conversation.UPDATEDTIME.DESC, 200);
            int iCount = CoreModule.f18272k.f115545m.count(Filter.TRUE, -1);
            int iCount2 = CoreModule.f18272k.f115545m.count(stringColumn.NEQ("group"), -1);
            StringBuilder sb = new StringBuilder("Conversation Counter Error userId: ");
            sb.append(CoreModule.m30929H().userId());
            sb.append("\nlocalCounter: ");
            sb.append(bkj0Var.f77082b);
            sb.append("\nremoteCounter: ");
            sb.append(((CoreData) envelope.getModuleData(CoreData.class)).counterVerification.total);
            sb.append("\ndefaultCount: ");
            sb.append(iCount);
            sb.append("\nwithoutGroup: ");
            sb.append(iCount2);
            sb.append("\ncheckTime: ");
            sb.append((String) bkj0Var.f77083c);
            sb.append(" | localCids:");
            if (!jyb.m147479J(listQuery)) {
                for (Conversation conversation : listQuery) {
                    sb.append(conversation.f56859id);
                    sb.append("|");
                    sb.append(conversation.status.toString());
                    sb.append("|");
                    sb.append(conversation.convType);
                    sb.append(com.clevertap.android.sdk.Constants.SEPARATOR_COMMA);
                }
            }
            sb.append("\ndefaultIds:\n");
            List<Conversation> listQuery2 = CoreModule.f18272k.f115545m.query(Filter.TRUE, Conversation.UPDATEDTIME.DESC, 200);
            if (!jyb.m147479J(listQuery2)) {
                for (Conversation conversation2 : listQuery2) {
                    sb.append(conversation2.f56859id);
                    sb.append("|");
                    sb.append(conversation2.status.toString());
                    sb.append("|");
                    sb.append(conversation2.convType);
                    sb.append(com.clevertap.android.sdk.Constants.SEPARATOR_COMMA);
                }
            }
            String strM219592c = zg6.m219592c();
            sb.append("\nrequestList:\n");
            sb.append(strM219592c);
            sb.append(SignParameters.NEW_LINE);
            CrashHelper.m82479c(new Exception(sb.toString()));
        }
    }

    /* JADX INFO: renamed from: Gk */
    public final /* synthetic */ C22421c m33662Gk(final String str, final Conversation conversation) {
        return conversation != null ? new ti20(new pcj() { // from class: l.m78
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4879a.f20236P.auth().m209043q(C4879a.m32179A(str) + "&method=patch").m209038l(z1d0.create(Network.JSON, conversation.toJson())).m209028b();
            }
        }).map(new qcj() { // from class: l.n78
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f140582a.m33649Fk((Envelope) obj);
            }
        }) : C22421c.empty();
    }

    /* JADX INFO: renamed from: Gl */
    public final /* synthetic */ void m33663Gl(String str, String str2, Message message) {
        if (message == null) {
            m33749Nn(str, str2, false, true, null);
        }
    }

    /* JADX INFO: renamed from: Gm */
    public final /* synthetic */ uxj0 m33664Gm(final String str, final double d2) throws Exception {
        this.f91137Q.f20351U.m128074a(new x20() { // from class: l.e78
            @Override // p153l.x20
            public final void call() {
                C4891g.m33275Z7(str, d2);
            }
        });
        return uxj0.f181467a;
    }

    /* JADX INFO: renamed from: Gn */
    public C22421c<uxj0> m33665Gn(String str, Message message) {
        return m33677Hn(str, message, false, null);
    }

    /* JADX INFO: renamed from: Go */
    public void m33666Go(Throwable th, final String str) {
        if (th instanceof ApiExcep.Client.NotFound) {
            l51.m152887G(new Runnable() { // from class: l.f38
                @Override // java.lang.Runnable
                public final void run() {
                    this.f96972a.m34189xl(str);
                }
            });
        }
    }

    /* JADX INFO: renamed from: Gp */
    public void m33667Gp(Act act, boolean z, String str, Picture.ImageUri imageUri) {
        m33679Hp(act, z, str, "", imageUri, "");
    }

    /* JADX INFO: renamed from: He */
    public void m33668He() {
        this.f91137Q.f20427t1.m32519u("countdown_conv_list_key");
        this.f91137Q.f20427t1.m32519u("countdown_card_conv_key");
        if (!TextUtils.isEmpty(this.f91137Q.f20384f0.f20610J0.get())) {
            C4883c c4883c = this.f91137Q;
            c4883c.f20405m0.m31993D8(c4883c.f20384f0.f20610J0.get());
        }
        this.f91137Q.f20384f0.f20610J0.put("");
        this.f91137Q.f20384f0.f20604H0.put(0L);
        this.f91137Q.f20384f0.f20607I0.put(0L);
        this.f91137Q.f20384f0.f20613K0.put(Boolean.FALSE);
        this.f91137Q.f20384f0.m33643Fe();
        this.f20642T1.m137019l(uxj0.f181467a);
    }

    /* JADX INFO: renamed from: Hf */
    public void m33669Hf(final String str) {
        this.f91137Q.f20351U.m128074a(new x20() { // from class: l.pw7
            @Override // p153l.x20
            public final void call() {
                String str2 = str;
                CoreModule.f18272k.f115535c.delete(Filter.AND(Message.CID.mo61359EQ(str2), Message.f21183ID.mo61359EQ("fake_id_filter_veification" + str2)));
            }
        });
    }

    /* JADX INFO: renamed from: Hg */
    public C22421c<Boolean> m33670Hg(final String str) {
        return this.f91137Q.now(C22421c.fromCallable(new Callable() { // from class: l.by7
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C4891g.m33365ge(str);
            }
        }).compose(C4879a.m32255T2()));
    }

    /* JADX INFO: renamed from: Hh */
    public final /* synthetic */ C22421c m33671Hh(final ConversationBatchPatchIds conversationBatchPatchIds) {
        return jyb.m147479J(conversationBatchPatchIds.ids) ? C22421c.empty() : new ti20(new pcj() { // from class: l.vx7
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4879a.f20236P.auth().m209043q(C4879a.m32378z() + "?method=patch&search=batch").m209038l(z1d0.create(Network.JSON, conversationBatchPatchIds.toJson())).m209028b();
            }
        }).map(new qcj() { // from class: l.wx7
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f191374a.m33659Gh((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: Hj */
    public final /* synthetic */ void m33673Hj(Message message) {
        Conversation conversationM33738Mo;
        Message messageQuery = CoreModule.f18272k.f115535c.query(message.f56859id);
        if (messageQuery == null || (conversationM33738Mo = m33738Mo(message.cid)) == null || conversationM33738Mo.localSafetyReminderTime > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            return;
        }
        conversationM33738Mo.localSafetyReminderTime = message.createdTime;
        CoreModule.f18272k.f115545m.upsert(conversationM33738Mo);
        messageQuery.localSafetyReminder = true;
        CoreModule.f18272k.f115535c.upsert(messageQuery);
    }

    /* JADX INFO: renamed from: Hk */
    public final /* synthetic */ void m33674Hk(String str, Throwable th) {
        StringBuilder sb = new StringBuilder("cid:");
        sb.append(str);
        sb.append(" errorMessage:");
        sb.append(NullChecker.m82486a(th.getMessage()) ? th.getMessage() : "");
        tu2.m192703a("ConversationPatchDelete", sb.toString());
        m33666Go(th, str);
    }

    /* JADX INFO: renamed from: Hl */
    public final /* synthetic */ void m33675Hl(Conversation conversation) {
        m33731Mh(conversation.f56859id);
    }

    /* JADX INFO: renamed from: Hm */
    public final /* synthetic */ uxj0 m33676Hm(final String str, final double d2) throws Exception {
        this.f91137Q.f20351U.m128074a(new x20() { // from class: l.l78
            @Override // p153l.x20
            public final void call() {
                C4891g.m33333e6(str, d2);
            }
        });
        return uxj0.f181467a;
    }

    /* JADX INFO: renamed from: Hn */
    public final C22421c<uxj0> m33677Hn(final String str, final Message message, final boolean z, final x20 x20Var) {
        return this.f91137Q.scheduled("messagePostSimple", -1, new pcj() { // from class: l.m18
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f134391a.m34086pk(str, message, x20Var, z);
            }
        });
    }

    /* JADX INFO: renamed from: Ho */
    public C22421c<uxj0> m33678Ho(final String str, final List<String> list, final Message message) {
        return C22421c.fromCallable(new Callable() { // from class: l.c38
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C4891g.m33240W5(str, list, message);
            }
        }).flatMap(new qcj() { // from class: l.d38
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f84872a.m34202yl(str, (JSONObject) obj);
            }
        });
    }

    /* JADX INFO: renamed from: Hp */
    public void m33679Hp(Act act, final boolean z, final String str, final String str2, final Picture.ImageUri imageUri, final String str3) {
        act.duringCreated(m34108rg(str).filter(new qcj() { // from class: l.xz7
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return C4891g.m33018C4((Boolean) obj);
            }
        }).flatMap(new qcj() { // from class: l.i08
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f112339a.m33961fm((Boolean) obj);
            }
        }).filter(new qcj() { // from class: l.t08
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f171471a.m33973gm((uxj0) obj);
            }
        }).flatMap(new qcj() { // from class: l.e18
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f91567a.m33985hm(str, str2, z, (uxj0) obj);
            }
        }).filter(new qcj() { // from class: l.p18
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return C4891g.m33089I9((CipherId) obj);
            }
        })).subscribe(psd0.m173597H(new y20() { // from class: l.a28
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f67938a.m33997im(str, str2, imageUri, z, str3, (CipherId) obj);
            }
        }, new y20() { // from class: l.l28
            @Override // p153l.y20
            public final void call(Object obj) {
                C4891g.m33099J8((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: Ie */
    public void m33680Ie() {
        this.f20600F2.clear();
    }

    /* JADX INFO: renamed from: If */
    public void m33681If() {
        l51.m152919y(new Runnable() { // from class: l.wr7
            @Override // java.lang.Runnable
            public final void run() {
                this.f190486a.m34045mi();
            }
        });
    }

    /* JADX INFO: renamed from: Ig */
    public C22421c<Boolean> m33682Ig(String str) {
        return CoreModule.f18272k.f115535c.m189469e0(str).m208677m().map(new qcj() { // from class: l.p48
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(!jyb.m147479J((List) obj));
            }
        });
    }

    /* JADX INFO: renamed from: Ih */
    public final /* synthetic */ C22421c m33683Ih() {
        return C22421c.fromCallable(new Callable() { // from class: l.sr7
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C4891g.m33136Mc();
            }
        }).flatMap(new qcj() { // from class: l.tr7
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f175810a.m33671Hh((ConversationBatchPatchIds) obj);
            }
        }).compose(C4879a.m32255T2()).doOnError(new y20() { // from class: l.vr7
            @Override // p153l.y20
            public final void call(Object obj) {
                C4891g.m33062G4((Throwable) obj);
            }
        });
    }

    /* JADX INFO: renamed from: Ii */
    public final /* synthetic */ C22421c m33684Ii(final String str, final String str2) {
        return qi20.m176658e(new pcj() { // from class: l.qz7
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4879a.f20236P.auth().m209043q(C4879a.m32214I2("/conversations/" + str + "/messages/" + str2 + "/audiotexts")).m209032f().m209028b();
            }
        }).map(new qcj() { // from class: l.rz7
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return C4891g.m33521v3((Envelope) obj);
            }
        }).doOnNext(new y20() { // from class: l.sz7
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f171361a.m33672Hi(str2, (AudioText) obj);
            }
        });
    }

    /* JADX INFO: renamed from: Ij */
    public final /* synthetic */ void m33685Ij(final Message message) {
        this.f91137Q.f20351U.m128074a(new x20() { // from class: l.i58
            @Override // p153l.x20
            public final void call() {
                this.f113015a.m33673Hj(message);
            }
        });
    }

    /* JADX INFO: renamed from: Ik */
    public final /* synthetic */ C22421c m33686Ik(final String str) {
        return C22421c.fromCallable(new Callable() { // from class: l.f68
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f97380a.m33636Ek(str);
            }
        }).flatMap(new qcj() { // from class: l.g68
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f102398a.m33662Gk(str, (Conversation) obj);
            }
        }).compose(C4879a.m32255T2()).doOnError(new y20() { // from class: l.i68
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f113147a.m33674Hk(str, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: renamed from: Il */
    public final /* synthetic */ void m33687Il(Conversation conversation) {
        m34120sf(conversation.f56859id);
    }

    /* JADX INFO: renamed from: Im */
    public final /* synthetic */ uxj0 m33688Im(final String str, final double d2, final int i) throws Exception {
        this.f91137Q.f20351U.m128074a(new x20() { // from class: l.a68
            @Override // p153l.x20
            public final void call() {
                C4891g.m33413l5(str, d2, i);
            }
        });
        return uxj0.f181467a;
    }

    /* JADX INFO: renamed from: In */
    public C22421c<uxj0> m33689In(Message message) {
        return m33701Jn(message, null);
    }

    /* JADX INFO: renamed from: Io */
    public final C22421c<uxj0> m33690Io(final double d2) {
        return this.f91137Q.scheduled("postCounter", -1, new pcj() { // from class: l.z68
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f203127a.m33585Al(d2);
            }
        });
    }

    /* JADX INFO: renamed from: Ip, reason: merged with bridge method [inline-methods] */
    public void m34010jm(IWXAPI iwxapi, String str, String str2, boolean z, String str3, boolean z2) {
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
            wXMediaMessage.thumbData = gmk0.m130799a(BitmapFactory.decodeFile(ShareHelper.m81139W("share_ab_icon.png")));
        } else {
            wXMediaMessage.thumbData = gmk0.m130799a(BitmapFactory.decodeFile(str2));
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
    public void m33692Je() {
        this.f20603G2.clear();
    }

    /* JADX INFO: renamed from: Jf */
    public void m33693Jf() {
        l51.m152919y(new Runnable() { // from class: l.qc8
            @Override // java.lang.Runnable
            public final void run() {
                this.f156560a.m34058ni();
            }
        });
    }

    /* JADX INFO: renamed from: Jg */
    public C22421c<Boolean> m33694Jg(String str) {
        return CoreModule.f18272k.f115535c.m189470f0(str).m208677m().map(new qcj() { // from class: l.js7
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(!((List) obj).isEmpty());
            }
        });
    }

    /* JADX INFO: renamed from: Jh */
    public final /* synthetic */ void m33695Jh(String str) {
        m34107rf(str, false);
    }

    /* JADX INFO: renamed from: Ji */
    public final /* synthetic */ void m33696Ji(Envelope envelope) {
        m33824Uf();
        List<FriendInfo> list = ((CoreData) envelope.getModuleData(CoreData.class)).friends;
        if (jyb.m147479J(list)) {
            return;
        }
        this.f20686i1.put(Integer.valueOf(this.f20686i1.get().intValue() + 1));
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            arrayList.add(list.get(i).userId);
        }
        m34002je(arrayList);
    }

    /* JADX INFO: renamed from: Jj */
    public final /* synthetic */ vg60 m33697Jj(List list, DbLinks dbLinks) {
        if (dbLinks == null) {
            m33653Fo();
        }
        return m118618Z2(list, dbLinks);
    }

    /* JADX INFO: renamed from: Jk */
    public final /* synthetic */ ConversationPatchRecord m33698Jk(ConversationPatchRecord conversationPatchRecord) throws Exception {
        final ConversationPatchRecord conversationPatchRecordQuery = CoreModule.f18272k.f115544l.query(conversationPatchRecord.f56859id);
        if (conversationPatchRecordQuery == null || TEnum.equals(conversationPatchRecordQuery.state, ConversationPatchState.patching)) {
            return null;
        }
        conversationPatchRecordQuery.state = ConversationPatchState.get(ConversationPatchState.patching);
        this.f91137Q.f20351U.m128074a(new x20() { // from class: l.z48
            @Override // p153l.x20
            public final void call() {
                CoreModule.f18272k.f115544l.updateBy_id(conversationPatchRecordQuery);
            }
        });
        return conversationPatchRecordQuery;
    }

    /* JADX INFO: renamed from: Jl */
    public final /* synthetic */ void m33699Jl(List list, ArrayList arrayList, Envelope envelope) {
        jyb.m147537z(list, new y20() { // from class: l.u48
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f177441a.m33675Hl((Conversation) obj);
            }
        });
        if (!jyb.m147479J(arrayList)) {
            jyb.m147537z(arrayList, new y20() { // from class: l.v48
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f182340a.m33687Il((Conversation) obj);
                }
            });
        }
        m34133tf(envelope);
    }

    /* JADX INFO: renamed from: Jm */
    public final /* synthetic */ void m33700Jm(final Message message, final boolean z, uxj0 uxj0Var) {
        this.f91137Q.f20351U.m128074a(new x20() { // from class: l.i88
            @Override // p153l.x20
            public final void call() {
                C4891g.m33147Nc(message, z);
            }
        });
    }

    /* JADX INFO: renamed from: Jn */
    public C22421c<uxj0> m33701Jn(final Message message, final x20 x20Var) {
        return this.f91137Q.scheduled("messageRecall", -1, new pcj() { // from class: l.v68
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f182621a.m34112rk(message, x20Var);
            }
        });
    }

    /* JADX INFO: renamed from: Jo */
    public C22421c<Message> m33702Jo() {
        return this.f20652X.observeOn(fo0.m126432a());
    }

    /* JADX INFO: renamed from: Jp */
    public void m33703Jp(final String str, String str2, final boolean z, final String str3, final boolean z2) {
        final IWXAPI iwxapiCreateWXAPI = WXAPIFactory.createWXAPI(CoreModule.f18263b, null);
        iwxapiCreateWXAPI.registerApp(WXEntryActivity.APPID);
        if (!iwxapiCreateWXAPI.isWXAppInstalled()) {
            o1j0.m165651y("未检测到可分享平台");
            return;
        }
        if (TextUtils.isEmpty(str2) || !(str2.toLowerCase().startsWith("http") || str2.toLowerCase().startsWith("https"))) {
            m34010jm(iwxapiCreateWXAPI, str, "", z, str3, z2);
            return;
        }
        if (str.contains("&f=true")) {
            str2 = "https://auto.tancdn.com/v1/images/eyJpZCI6IktQQ0VDSlZVUkZQMzVPSlBWRVJCSUhVVjJFSk5BWDA4IiwidyI6NzAwLCJoIjo3MDAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoxNTk3MDY2OTU1MTc5NDg3ODI4Nn0";
        }
        uqb0.f180374G.m98793i(str2, new y20() { // from class: l.kb8
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f124757a.m34010jm(iwxapiCreateWXAPI, str, z, str3, z2, (String) obj);
            }
        });
    }

    /* JADX INFO: renamed from: Ke */
    public void m33704Ke() {
        final List<Conversation> listQuery = CoreModule.f18272k.f115545m.query(Filter.AND(f20582c3, Conversation.UNREADMESSAGES.REQ(1)), Conversation.LATESTTIME.DESC, 500);
        if (jyb.m147479J(listQuery)) {
            return;
        }
        this.f91137Q.f20351U.m128074a(new x20() { // from class: l.av7
            @Override // p153l.x20
            public final void call() {
                this.f73589a.m33874Yh(listQuery);
            }
        });
        m33941dq(uqb0.f180376H.guessedCurrentServerTime());
    }

    /* JADX INFO: renamed from: Kf */
    public C22421c<uxj0> m33705Kf(final String str) {
        return TextUtils.isEmpty(str) ? C22421c.just(uxj0.f181467a) : this.f91137Q.now(C22421c.fromCallable(new Callable() { // from class: l.p78
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f150903a.m34071oi(str);
            }
        }).compose(C4879a.m32255T2()));
    }

    /* JADX INFO: renamed from: Kg */
    public C22421c<Boolean> m33706Kg(String str) {
        return CoreModule.f18272k.f115535c.m189470f0(str).m208677m().map(new qcj() { // from class: l.ox7
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return C4891g.m33188R9((List) obj);
            }
        });
    }

    /* JADX INFO: renamed from: Kh */
    public final /* synthetic */ uxj0 m33707Kh(final String str, Act act, Envelope envelope) {
        if (jyb.m147479J(((CoreData) envelope.getModuleData(CoreData.class)).relationships)) {
            Relationship.new_();
        } else if (CoreModule.m30932N().mo61573so()) {
            final User userQuery = uqb0.f180405k0.f184355d.query(str);
            final Relationship relationship = ((CoreData) envelope.getModuleData(CoreData.class)).relationships.get(0);
            userQuery.localRelationship = relationship;
            if (act == null) {
                l51.m152887G(new Runnable() { // from class: l.x78
                    @Override // java.lang.Runnable
                    public final void run() {
                        CoreModule.m30932N().processMomentLikeStatusChanged(relationship, userQuery, false, false);
                    }
                });
            } else {
                l51.m152886F(act, new Runnable() { // from class: l.y78
                    @Override // java.lang.Runnable
                    public final void run() {
                        CoreModule.m30932N().processMomentLikeStatusChanged(relationship, userQuery, false, false);
                    }
                });
            }
        }
        this.f91137Q.f20351U.m128074a(new x20() { // from class: l.z78
            @Override // p153l.x20
            public final void call() {
                this.f203223a.m33695Jh(str);
            }
        });
        if (gta.m132210e().m132214d().mo34945x()) {
            l51.m152888H(CoreModule.f18263b, new x48(this), 500L);
        }
        if (gta.m132210e().m132214d().mo34831g()) {
            gta.m132210e().m132214d().mo34845h6(str);
        }
        return uxj0.f181467a;
    }

    /* JADX INFO: renamed from: Ki */
    public final /* synthetic */ uxj0 m33708Ki(final Envelope envelope) {
        this.f91137Q.m32495w3(envelope, null);
        this.f20683h1.put(Long.valueOf(pzi0.m174454o()));
        this.f91137Q.f20351U.m128074a(new x20() { // from class: l.r58
            @Override // p153l.x20
            public final void call() {
                this.f161326a.m33696Ji(envelope);
            }
        });
        return uxj0.f181467a;
    }

    /* JADX INFO: renamed from: Kj */
    public final /* synthetic */ Double m33709Kj(Double d2, Envelope envelope) {
        this.f91137Q.m32495w3(envelope, null);
        return d2;
    }

    /* JADX INFO: renamed from: Kk */
    public final /* synthetic */ uxj0 m33710Kk(final ConversationPatchRecord conversationPatchRecord, Envelope envelope) {
        this.f91137Q.m32495w3(envelope, new x20() { // from class: l.g78
            @Override // p153l.x20
            public final void call() {
                CoreModule.f18272k.f115544l.delete(conversationPatchRecord.f56859id);
            }
        });
        return uxj0.f181467a;
    }

    /* JADX INFO: renamed from: Kl */
    public final /* synthetic */ Data m33711Kl(String str, final Envelope envelope) {
        final ArrayList arrayList = new ArrayList();
        final ArrayList arrayList2 = new ArrayList();
        StringBuilder sb = null;
        if (!jyb.m147479J(((CoreData) envelope.getModuleData(CoreData.class)).conversations)) {
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
                        sb.append((NullChecker.m82486a(conversation.status) && NullChecker.m82486a(conversation.status.toString())) ? conversation.status.toString() : "status_null");
                        sb.append(SignParameters.NEW_LINE);
                    }
                }
            }
        }
        if (NullChecker.m82486a(sb)) {
            tu2.m192703a("conversations/" + str + "/refresh", sb.toString());
        }
        if (!jyb.m147479J(((CoreData) envelope.getModuleData(CoreData.class)).conversations)) {
            ((CoreData) envelope.getModuleData(CoreData.class)).conversations.removeAll(arrayList);
        }
        this.f91137Q.m32495w3(envelope, new x20() { // from class: l.ty7
            @Override // p153l.x20
            public final void call() {
                this.f176637a.m33699Jl(arrayList, arrayList2, envelope);
            }
        });
        return envelope.data;
    }

    /* JADX INFO: renamed from: Km */
    public final /* synthetic */ C22421c m33712Km(Message message, boolean z, uxj0 uxj0Var) {
        return m33627Do(message.cid, message.f56859id, message, z ? "reported" : "ignored");
    }

    /* JADX INFO: renamed from: Kn */
    public C22421c<Message> m33713Kn(String str, String str2) {
        return m33725Ln(str, str2, false);
    }

    /* JADX INFO: renamed from: Ko */
    public void m33714Ko(final String str, final String str2) {
        this.f91137Q.now(new ti20(new pcj() { // from class: l.hv7
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4879a.f20236P.auth().m209043q(C4879a.m32203G("/official-accounts/" + str + "/menus/" + str2 + "/clicks")).m209038l(z1d0.create(Network.JSON, "")).m209028b();
            }
        }).map(new qcj() { // from class: l.iv7
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return uxj0.f181467a;
            }
        }).compose(C4879a.m32255T2()));
    }

    /* JADX INFO: renamed from: Kp */
    public final boolean m33715Kp(Conversation conversation) {
        return "lovebuzz".equals(conversation.convType) && NullChecker.m82486a(conversation.property) && "textBuzz".equals(conversation.property.intl_love_buzz.biz) && "passive".equals(conversation.property.intl_love_buzz.mode) && conversation.property.intl_love_buzz.expire - pzi0.m174454o() > this.f20646V;
    }

    /* JADX INFO: renamed from: Le */
    public C22421c<uxj0> m33716Le(final String str, final String str2, final String str3, final x20 x20Var) {
        return this.f91137Q.scheduled("messageRecall", -1, new pcj() { // from class: l.v98
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f182962a.m33898ai(str, str2, str3, x20Var);
            }
        });
    }

    /* JADX INFO: renamed from: Lf */
    public C22421c<uxj0> m33717Lf(final String str) {
        return TextUtils.isEmpty(str) ? C22421c.just(uxj0.f181467a) : this.f91137Q.now(C22421c.fromCallable(new Callable() { // from class: l.a58
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f68514a.m34084pi(str);
            }
        }).compose(C4879a.m32255T2()));
    }

    /* JADX INFO: renamed from: Lg */
    public C22421c<Boolean> m33718Lg(String str) {
        return CoreModule.f18272k.f115535c.m189476l0(str).m208677m().map(new qcj() { // from class: l.za8
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(!jyb.m147479J((List) obj));
            }
        });
    }

    /* JADX INFO: renamed from: Lh */
    public final /* synthetic */ C22421c m33719Lh(final String str, final Act act) {
        Relationship relationship = new Relationship();
        relationship.state = RelationshipStatus.get("blocked");
        if (CoreModule.m30932N().mo61573so()) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(MatchFrom.get(MatchFrom.relationUnion));
            relationship.status = arrayList;
        }
        Conversation conversationM33859Xe = CoreModule.f18264c.f20384f0.m33859Xe(str);
        if (NullChecker.m82486a(conversationM33859Xe) && TextUtils.equals("kankan", conversationM33859Xe.convType)) {
            relationship.scene = "kankan";
        }
        return C4910y.m35907l3(str, relationship).map(new qcj() { // from class: l.y48
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f197433a.m33707Kh(str, act, (Envelope) obj);
            }
        }).compose(C4879a.m32255T2());
    }

    /* JADX INFO: renamed from: Li */
    public final /* synthetic */ C22421c m33720Li(final String str) {
        return qi20.m176658e(new pcj() { // from class: l.a18
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4879a.f20236P.auth().m209043q(str).m209032f().m209028b();
            }
        }).map(new qcj() { // from class: l.b18
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f74327a.m33708Ki((Envelope) obj);
            }
        }).compose(C4879a.m32255T2());
    }

    /* JADX INFO: renamed from: Lj */
    public final /* synthetic */ Message m33721Lj(Message message, Envelope envelope) {
        this.f91137Q.m32495w3(envelope, null);
        return message;
    }

    /* JADX INFO: renamed from: Lk */
    public final /* synthetic */ C22421c m33722Lk(final ConversationPatchRecord conversationPatchRecord, final ConversationPatchRecord conversationPatchRecord2) {
        return conversationPatchRecord2 != null ? new ti20(new pcj() { // from class: l.w38
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4879a.f20236P.auth().m209043q(C4879a.m32179A(conversationPatchRecord.f56859id) + "&method=patch").m209038l(z1d0.create(Network.JSON, conversationPatchRecord2.createConversation().toJson())).m209028b();
            }
        }).map(new qcj() { // from class: l.x38
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f192234a.m33710Kk(conversationPatchRecord, (Envelope) obj);
            }
        }) : C22421c.empty();
    }

    /* JADX INFO: renamed from: Ll */
    public final /* synthetic */ C22421c m33723Ll(final String str) {
        return new ti20(new pcj() { // from class: l.qw7
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4879a.f20236P.auth().m209043q(C4879a.m32370x(str)).m209032f().m209028b();
            }
        }).map(new qcj() { // from class: l.rw7
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f165117a.m33711Kl(str, (Envelope) obj);
            }
        }).compose(C4879a.m32255T2());
    }

    /* JADX INFO: renamed from: Lm */
    public final /* synthetic */ C22421c m33724Lm(final Message message, final boolean z) {
        return C22421c.just(uxj0.f181467a).observeOn(Schedulers.m222739io()).doOnNext(new y20() { // from class: l.s48
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f166178a.m33700Jm(message, z, (uxj0) obj);
            }
        }).flatMap(new qcj() { // from class: l.t48
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f172026a.m33712Km(message, z, (uxj0) obj);
            }
        });
    }

    /* JADX INFO: renamed from: Ln */
    public C22421c<Message> m33725Ln(String str, String str2, boolean z) {
        return m33749Nn(str, str2, z, false, null);
    }

    /* JADX INFO: renamed from: Lo */
    public C22421c<Sticker> m33726Lo(final List<Media> list, final String str) {
        return scheduled("sogou_gif", -1, new pcj() { // from class: l.d88
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                List list2 = list;
                return qi20.m176656c(new pcj() { // from class: l.q98
                    @Override // p153l.pcj, java.util.concurrent.Callable
                    public final Object call() {
                        return C4891g.m33531vd(list2);
                    }
                }, SogouGifEnvelope.JSON_ADAPTER).map(new qcj() { // from class: l.r98
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return C4891g.m33048Ec(list2, str, (SogouGifEnvelope) obj);
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: Lp */
    public boolean m33727Lp() {
        return this.f20599F1.get().booleanValue();
    }

    /* JADX INFO: renamed from: Me */
    public mm6 m33728Me() {
        return CoreModule.f18272k.f115545m;
    }

    /* JADX INFO: renamed from: Mf */
    public C22421c<uxj0> m33729Mf(final String str) {
        return TextUtils.isEmpty(str) ? C22421c.just(uxj0.f181467a) : this.f91137Q.now(C22421c.fromCallable(new Callable() { // from class: l.lc8
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f131279a.m34097qi(str);
            }
        }).compose(C4879a.m32255T2()));
    }

    /* JADX INFO: renamed from: Mg */
    public C22421c<Boolean> m33730Mg(String str) {
        return CoreModule.f18272k.f115535c.m189466b0(str).m208677m().map(new qcj() { // from class: l.qq7
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(!jyb.m147479J((List) obj));
            }
        });
    }

    /* JADX INFO: renamed from: Mi */
    public final /* synthetic */ vg60 m33732Mi(Envelope envelope) {
        this.f91137Q.m32495w3(envelope, null);
        DbLinks dbLinksNew_ = DbLinks.new_();
        if (!TextUtils.isEmpty(envelope.pagination.links.next)) {
            dbLinksNew_.links.next = envelope.pagination.links.next;
        }
        return new vg60(((CoreData) envelope.getModuleData(CoreData.class)).conversations, dbLinksNew_);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Mj */
    public final /* synthetic */ C22421c m33733Mj(final String str, pf60 pf60Var) {
        final Message message = (Message) pf60Var.f152156a;
        final Double d2 = (Double) pf60Var.f152157b;
        if (message != null) {
            return new ti20(new pcj() { // from class: l.va8
                @Override // p153l.pcj, java.util.concurrent.Callable
                public final Object call() {
                    return C4879a.f20236P.auth().m209043q(C4879a.m32241Q0(str) + "&until=" + message.f56859id).m209030d().m209028b();
                }
            }).map(new qcj() { // from class: l.wa8
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return this.f188094a.m33721Lj(message, (Envelope) obj);
                }
            }).map(new qcj() { // from class: l.xa8
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return C4891g.m33140N5(d2, (Message) obj);
                }
            });
        }
        final Conversation conversation = new Conversation();
        conversation.f56859id = str;
        conversation.readUntil = "";
        return new ti20(new pcj() { // from class: l.ta8
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                Conversation conversation2 = conversation;
                return C4879a.f20236P.auth().m209043q(C4879a.m32179A(conversation2.f56859id) + "&method=patch").m209038l(z1d0.create(Network.JSON, conversation2.toJson())).m209028b();
            }
        }).map(new qcj() { // from class: l.ua8
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f178184a.m33709Kj(d2, (Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: Mk */
    public final /* synthetic */ void m33734Mk(uxj0 uxj0Var) {
        m33614Co();
    }

    /* JADX INFO: renamed from: Ml */
    public final /* synthetic */ void m33735Ml(Runnable runnable, boolean z, Envelope envelope) {
        List<CountdownItem> list = ((CoreData) envelope.getModuleData(CoreData.class)).countdownLikes;
        if (!jyb.m147479J(list)) {
            CountdownItem countdownItem = list.get(0);
            if (NullChecker.m82486a(countdownItem) && !TextUtils.isEmpty(countdownItem.otherUserId) && countdownItem.expire > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                this.f20610J0.put(countdownItem.otherUserId);
                long jLongValue = Double.valueOf(countdownItem.expire).longValue();
                this.f20607I0.put(Long.valueOf(jLongValue));
                m33604Ce("like sync");
                long jM80482A = RemoteConfig.m80481x().m80482A("countdownLikeDuration");
                if (jM80482A <= 0) {
                    jM80482A = 86400;
                }
                this.f20604H0.put(Long.valueOf(jLongValue - (jM80482A * 1000)));
                this.f20613K0.put(Boolean.valueOf(countdownItem.hidden));
            }
            if (NullChecker.m82486a(runnable)) {
                runnable.run();
            }
        }
        if (z) {
            this.f20601G0.put(Boolean.TRUE);
        }
    }

    /* JADX INFO: renamed from: Mm */
    public final /* synthetic */ uxj0 m33736Mm(final String str) throws Exception {
        final ConversationPatchRecord conversationPatchRecordQuery = CoreModule.f18272k.f115544l.query(str);
        if (conversationPatchRecordQuery != null) {
            this.f91137Q.f20351U.m128074a(new x20() { // from class: l.ja8
                @Override // p153l.x20
                public final void call() {
                    C4891g.m33120L7(conversationPatchRecordQuery, str);
                }
            });
        }
        return uxj0.f181467a;
    }

    /* JADX INFO: renamed from: Mn */
    public C22421c<Message> m33737Mn(String str, String str2, boolean z, String str3) {
        return m33749Nn(str, str2, z, false, str3);
    }

    /* JADX INFO: renamed from: Mo */
    public Conversation m33738Mo(String str) {
        return CoreModule.f18272k.f115545m.query(str);
    }

    /* JADX INFO: renamed from: Mp */
    public final boolean m33739Mp(Conversation conversation, List<Message> list) {
        if (conversation == null || list == null) {
            return false;
        }
        if (!conversation.read.booleanValue()) {
            return true;
        }
        Message next = null;
        if (!jyb.m147479J(list)) {
            int size = list.size();
            Iterator<Message> it = list.iterator();
            int i = -1;
            while (it.hasNext()) {
                i++;
                try {
                    next = it.next();
                } catch (NoSuchElementException unused) {
                    CrashHelper.m82479c(new NoSuchElementException("ConversationItemView NoSuchElementException currentThread = " + Thread.currentThread().getName() + ",  userId = " + CoreModule.m30930K().me_().f56859id + ",  conversation = " + conversation.f56859id + ",  oldSize = " + size + ",  currentSize = " + list.size() + ",  index = " + i + ",  list = " + list.toString()));
                }
                if (TEnum.equals(next.status(), "normal")) {
                }
            }
            return false;
        }
        return NullChecker.m82486a(next) && !TextUtils.equals(conversation.readUntil, next.f56859id);
    }

    /* JADX INFO: renamed from: Ne */
    public C22421c<Conversation> m33740Ne(String str) {
        return CoreModule.f18272k.f115545m.uiGet(str).filter(new qcj() { // from class: l.or7
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((Conversation) obj) != null);
            }
        });
    }

    /* JADX INFO: renamed from: Nf */
    public void m33741Nf(String str) {
        Conversation conversationQuery = CoreModule.f18272k.f115545m.query(str);
        if (conversationQuery == null) {
            return;
        }
        List<Message> listQuery = CoreModule.f18272k.f115535c.query(Filter.AND(Message.CID.mo61359EQ(str), Message.MESSAGETYPE.m61360EQ(MessageType.local_break_ice)), Message.CREATEDTIME.ASC, 0);
        if (!jyb.m147479J(listQuery)) {
            Iterator<Message> it = listQuery.iterator();
            while (it.hasNext()) {
                CoreModule.f18272k.f115535c.delete(it.next().f56859id);
            }
        }
        conversationQuery.hasLocalBreakIce = false;
        CoreModule.f18272k.f115545m.upsert(conversationQuery);
    }

    /* JADX INFO: renamed from: Ng */
    public C22421c<List<Conversation>> m33742Ng() {
        return CoreModule.f18272k.f115545m.f137472C.m208677m();
    }

    /* JADX INFO: renamed from: Nh */
    public final /* synthetic */ uxj0 m33743Nh(final String str) throws Exception {
        this.f91137Q.f20351U.m128074a(new x20() { // from class: l.s88
            @Override // p153l.x20
            public final void call() {
                this.f166746a.m33731Mh(str);
            }
        });
        return uxj0.f181467a;
    }

    /* JADX INFO: renamed from: Ni */
    public final /* synthetic */ C22421c m33744Ni(final String str) {
        return qi20.m176658e(new pcj() { // from class: l.j38
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4879a.f20236P.auth().m209043q(str).m209032f().m209028b();
            }
        }).map(new qcj() { // from class: l.k38
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f123696a.m33732Mi((Envelope) obj);
            }
        }).compose(C4879a.m32255T2());
    }

    /* JADX INFO: renamed from: Nj */
    public final /* synthetic */ void m33745Nj(String str) {
        DbLinks dbLinksM33750No = m33750No(str);
        if (NullChecker.m82486a(dbLinksM33750No)) {
            dbLinksM33750No.links.next = null;
            CoreModule.f18272k.f115536d.upsert(dbLinksM33750No);
        }
        CoreModule.f18272k.f115535c.m189446H(str, Double.MAX_VALUE);
        m33821To(str, true, str);
    }

    /* JADX INFO: renamed from: Nk */
    public final /* synthetic */ void m33746Nk(ConversationPatchRecord conversationPatchRecord, Throwable th) {
        StringBuilder sb = new StringBuilder("recordid:");
        sb.append(conversationPatchRecord.f56859id);
        sb.append(" errorMessage:");
        sb.append(NullChecker.m82486a(th.getMessage()) ? th.getMessage() : "");
        tu2.m192703a("ConversationPatchDelete", sb.toString());
        m33666Go(th, conversationPatchRecord.f56859id);
        m34182wq(conversationPatchRecord.f56859id);
    }

    /* JADX INFO: renamed from: Nl */
    public final /* synthetic */ void m33747Nl(Envelope envelope) {
        ChatProfile chatProfileNew_;
        if (!jyb.m147479J(((CoreData) envelope.getModuleData(CoreData.class)).chatProfiles)) {
            Iterator<ChatProfile> it = ((CoreData) envelope.getModuleData(CoreData.class)).chatProfiles.iterator();
            do {
                if (!it.hasNext()) {
                    chatProfileNew_ = null;
                    break;
                }
                chatProfileNew_ = it.next();
            } while (!TextUtils.equals(chatProfileNew_.userId, CoreModule.m30929H().userId()));
        } else {
            chatProfileNew_ = null;
            break;
        }
        if (chatProfileNew_ == null) {
            chatProfileNew_ = ChatProfile.new_();
        }
        this.f20586B0.m137019l(chatProfileNew_);
        boolean zM147479J = jyb.m147479J(((CoreData) envelope.getModuleData(CoreData.class)).systemQuestions);
        C22507a<List<IceBreakingQuestion>> c22507a = this.f20589C0;
        if (zM147479J) {
            c22507a.m137019l(Collections.EMPTY_LIST);
        } else {
            c22507a.m137019l(((CoreData) envelope.getModuleData(CoreData.class)).systemQuestions);
        }
    }

    /* JADX INFO: renamed from: Nm */
    public final /* synthetic */ C22421c m33748Nm(final String str) {
        return C22421c.fromCallable(new Callable() { // from class: l.q78
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f155940a.m33736Mm(str);
            }
        }).compose(C4879a.m32255T2());
    }

    /* JADX INFO: renamed from: Nn */
    public C22421c<Message> m33749Nn(final String str, final String str2, final boolean z, final boolean z2, final String str3) {
        return this.f91137Q.scheduled("messageRefresh", -1, new pcj() { // from class: l.fu7
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f100883a.m34151uk(str, str2, z, str3, z2);
            }
        });
    }

    /* JADX INFO: renamed from: No */
    public DbLinks m33750No(String str) {
        return (DbLinks) CoreModule.f18272k.f115536d.query(str);
    }

    /* JADX INFO: renamed from: Np */
    public void m33751Np(boolean z) {
        this.f20640T = Boolean.valueOf(z);
    }

    /* JADX INFO: renamed from: Oe */
    public final C22421c<vg60<Conversation>> m33752Oe(wzh0<Conversation>.C21213a c21213a) {
        return psd0.m173625r(c21213a.m208677m(), uqb0.f180405k0.f184354c.uiGet(SchemeKey.conversations), new rcj() { // from class: l.jb8
            @Override // p153l.rcj
            public final Object call(Object obj, Object obj2) {
                return this.f119135a.m33835Ve((List) obj, (DbLinks) obj2);
            }
        });
    }

    /* JADX INFO: renamed from: Of */
    public C22421c<uxj0> m33753Of(final String str) {
        return this.f91137Q.now(C22421c.fromCallable(new Callable() { // from class: l.ib8
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f113737a.m34110ri(str);
            }
        }).compose(C4879a.m32255T2()));
    }

    /* JADX INFO: renamed from: Og */
    public final boolean m33754Og(String str, String str2, boolean z, int i) {
        if (!z) {
            return false;
        }
        Message messageNew_ = Message.new_();
        messageNew_.messageType = MessageType.get(MessageType.local_normal_tips);
        messageNew_.cid = str;
        messageNew_.value = str2;
        messageNew_.localInConversation = true;
        long jM174454o = pzi0.m174454o();
        messageNew_.owner = CoreModule.m30929H().userId();
        messageNew_.createdTime = jM174454o;
        messageNew_.localCreatedTime = jM174454o;
        messageNew_.recalled = Boolean.FALSE;
        messageNew_.hostId = CoreModule.m30929H().userId();
        vxd0 vxd0Var = App.f16092i;
        messageNew_.localCreatedSession = vxd0Var.get().intValue();
        messageNew_.msgData = String.valueOf(i);
        messageNew_.f56859id = DbObject.GENERATE_UNIQUE_FAKE_ID(vxd0Var.get().intValue());
        CoreModule.f18264c.f20384f0.m33885Zg(messageNew_);
        return false;
    }

    /* JADX INFO: renamed from: Oh */
    public final /* synthetic */ C22421c m33755Oh(final String str) {
        return C22421c.fromCallable(new Callable() { // from class: l.o48
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f144950a.m33743Nh(str);
            }
        }).compose(C4879a.m32255T2());
    }

    /* JADX INFO: renamed from: Oi */
    public final /* synthetic */ vg60 m33756Oi(Envelope envelope) {
        this.f91137Q.m32495w3(envelope, null);
        DbLinks dbLinksNew_ = DbLinks.new_();
        if (!TextUtils.isEmpty(envelope.pagination.links.next)) {
            dbLinksNew_.links.next = envelope.pagination.links.next;
        }
        return new vg60(((CoreData) envelope.getModuleData(CoreData.class)).conversations, dbLinksNew_);
    }

    /* JADX INFO: renamed from: Oj */
    public final /* synthetic */ uxj0 m33757Oj(final String str, Double d2) {
        this.f91137Q.f20351U.m128074a(new x20() { // from class: l.qa8
            @Override // p153l.x20
            public final void call() {
                this.f156352a.m33745Nj(str);
            }
        });
        return uxj0.f181467a;
    }

    /* JADX INFO: renamed from: Ok */
    public final /* synthetic */ C22421c m33758Ok(final ConversationPatchRecord conversationPatchRecord) {
        return C22421c.fromCallable(new Callable() { // from class: l.g08
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f101615a.m33698Jk(conversationPatchRecord);
            }
        }).flatMap(new qcj() { // from class: l.h08
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f107275a.m33722Lk(conversationPatchRecord, (ConversationPatchRecord) obj);
            }
        }).compose(C4879a.m32255T2()).doOnNext(new y20() { // from class: l.j08
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f117791a.m33734Mk((uxj0) obj);
            }
        }).doOnError(new y20() { // from class: l.k08
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f123371a.m33746Nk(conversationPatchRecord, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: renamed from: Ol */
    public final /* synthetic */ C22421c m33759Ol() {
        return qi20.m176654a(new pcj() { // from class: l.s18
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4879a.f20236P.auth().m209043q(C4879a.m32216J0("/chat-profiles")).m209028b();
            }
        }).doOnNext(new y20() { // from class: l.t18
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f171607a.m33747Nl((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: Om */
    public final /* synthetic */ void m33760Om(final String str) {
        this.f91137Q.f20351U.m128074a(new x20() { // from class: l.tv7
            @Override // p153l.x20
            public final void call() {
                C4891g.m33464pc(str);
            }
        });
    }

    /* JADX INFO: renamed from: On */
    public C22421c<uxj0> m33761On(final String str, final String str2) {
        return this.f91137Q.scheduled("messageRefreshOnlyFeed" + str + str2, -1, new pcj() { // from class: l.p28
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f150248a.m34176wk(str, str2);
            }
        });
    }

    /* JADX INFO: renamed from: Oo */
    public Message m33762Oo(String str) {
        return CoreModule.f18272k.f115535c.queryCache(str);
    }

    /* JADX INFO: renamed from: Op */
    public C22421c<uxj0> m33763Op(final String str) {
        return this.f91137Q.scheduled("conversation_recover_deleted", 0, new pcj() { // from class: l.ny7
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f144292a.m34127sm(str);
            }
        });
    }

    /* JADX INFO: renamed from: Pe */
    public C22421c<Integer> m33764Pe(String str) {
        return psd0.m173625r(CoreModule.f18272k.f115535c.m189471g0(str).m208677m(), CoreModule.f18272k.f115535c.m189465a0(str).m208677m(), new rcj() { // from class: l.da8
            @Override // p153l.rcj
            public final Object call(Object obj, Object obj2) {
                return Integer.valueOf(((List) obj).size() + ((List) obj2).size());
            }
        }).throttleWithTimeout(300L, TimeUnit.MILLISECONDS);
    }

    /* JADX INFO: renamed from: Pf */
    public void m33765Pf(final String str, final String str2) {
        l51.m152919y(new Runnable() { // from class: l.nq7
            @Override // java.lang.Runnable
            public final void run() {
                this.f143178a.m34123si(str, str2);
            }
        });
    }

    /* JADX INFO: renamed from: Pg */
    public void m33766Pg(final double d2) {
        l51.m152919y(new Runnable() { // from class: l.yx7
            @Override // java.lang.Runnable
            public final void run() {
                this.f201935a.m33803Si(d2);
            }
        });
    }

    /* JADX INFO: renamed from: Ph */
    public final /* synthetic */ bkj0 m33767Ph(Boolean bool) {
        mm6 mm6Var = CoreModule.f18272k.f115545m;
        StringColumn<Conversation> stringColumn = Conversation.CONVTYPE;
        int iCount = mm6Var.count(stringColumn.mo61359EQ("default"), -1);
        CounterVerification counterVerification = new CounterVerification();
        counterVerification.total = iCount;
        counterVerification.lastVerifyTime = this.f91137Q.f20381e0.f89358x1.get().longValue();
        List<Conversation> listQuery = CoreModule.f18272k.f115545m.query(stringColumn.mo61359EQ("default"), Conversation.UPDATEDTIME.DESC, 1);
        if (!jyb.m147479J(listQuery)) {
            counterVerification.latestUpdatedTime = listQuery.get(0).updatedTime;
        }
        final CoreData coreData = new CoreData();
        coreData.counterVerification = counterVerification;
        return bkj0.m104818a(new ti20(new pcj() { // from class: l.wz7
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4879a.f20236P.auth().m209043q(C4879a.m32216J0("/counter-verifications")).m209038l(z1d0.create(Network.JSON, coreData.toJson())).m209028b();
            }
        }).toBlocking().m165964c(null), Integer.valueOf(iCount), Double.valueOf(counterVerification.latestUpdatedTime));
    }

    /* JADX INFO: renamed from: Pi */
    public final /* synthetic */ C22421c m33768Pi(final String str) {
        return qi20.m176658e(new pcj() { // from class: l.b28
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4879a.f20236P.auth().m209043q(str).m209032f().m209028b();
            }
        }).map(new qcj() { // from class: l.c28
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f79454a.m33756Oi((Envelope) obj);
            }
        }).compose(C4879a.m32255T2());
    }

    /* JADX INFO: renamed from: Pj */
    public final /* synthetic */ C22421c m33769Pj(final String str) {
        return C22421c.fromCallable(new Callable() { // from class: l.d98
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C4891g.m33536w7(str);
            }
        }).flatMap(new qcj() { // from class: l.e98
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f92599a.m33733Mj(str, (pf60) obj);
            }
        }).map(new qcj() { // from class: l.f98
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f97833a.m33757Oj(str, (Double) obj);
            }
        }).compose(C4879a.m32255T2());
    }

    /* JADX INFO: renamed from: Pk */
    public final /* synthetic */ uxj0 m33770Pk(Message message, Envelope envelope) {
        if (!jyb.m147479J(((CoreData) envelope.getModuleData(CoreData.class)).messages) && TextUtils.equals(((CoreData) envelope.getModuleData(CoreData.class)).messages.get(0).f56859id, message.f56859id)) {
            ((CoreData) envelope.getModuleData(CoreData.class)).messages.get(0).cid = message.cid;
        }
        this.f91137Q.m32495w3(envelope, null);
        return uxj0.f181467a;
    }

    /* JADX INFO: renamed from: Pl */
    public final /* synthetic */ uxj0 m33771Pl(Envelope envelope) {
        this.f91137Q.m32495w3(envelope, null);
        return uxj0.f181467a;
    }

    /* JADX INFO: renamed from: Pm */
    public final /* synthetic */ void m33772Pm(long j, String str) {
        if (j != 0) {
            Message messageQuery = CoreModule.f18272k.f115535c.query(j);
            messageQuery.localCreatedSession = -App.f16092i.get().intValue();
            messageQuery.localNotificationStatus = NotificationStatus.get("pending");
            CoreModule.f18272k.f115535c.updateBy_id(messageQuery);
            this.f91137Q.f20381e0.m116528X6(str, "default", ConversationStatus.get("blocked"));
        }
    }

    /* JADX INFO: renamed from: Pn */
    public C22421c<List<Message>> m33773Pn() {
        return CoreModule.f18272k.f115535c.f172281n.m208677m();
    }

    /* JADX INFO: renamed from: Po */
    public C22421c<uxj0> m33774Po(final String str, final boolean z) {
        return this.f91137Q.scheduled("quickReplyLoveLetter" + str, -1, new pcj() { // from class: l.g28
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return qi20.m176655b(new pcj() { // from class: l.q48
                    @Override // p153l.pcj, java.util.concurrent.Callable
                    public final Object call() {
                        return C4891g.m33131M7(str, z);
                    }
                }, 0).map(new qcj() { // from class: l.r48
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return uxj0.f181467a;
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: Pp */
    public C22421c<String> m33775Pp() {
        return this.f20618L2;
    }

    /* JADX INFO: renamed from: Qe */
    public C22421c<ConversationCounter> m33776Qe() {
        return this.f20729w2.asObservable();
    }

    /* JADX INFO: renamed from: Qf */
    public void m33777Qf(final String str, final List<String> list) {
        if (TextUtils.isEmpty(str) || jyb.m147479J(list)) {
            return;
        }
        l51.m152919y(new Runnable() { // from class: l.os7
            @Override // java.lang.Runnable
            public final void run() {
                this.f148788a.m34136ti(str, list);
            }
        });
    }

    /* JADX INFO: renamed from: Qg */
    public void m33778Qg(final String str, final double d2, final int i, final int i2) {
        l51.m152919y(new Runnable() { // from class: l.n28
            @Override // java.lang.Runnable
            public final void run() {
                this.f139818a.m33827Ui(i2, str, i, d2);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Qh */
    public final /* synthetic */ void m33779Qh(bkj0 bkj0Var) {
        Envelope envelope = (Envelope) bkj0Var.f77081a;
        if (((CoreData) envelope.getModuleData(CoreData.class)).counterVerification.nextVerifyTime > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            this.f91137Q.f20381e0.f89351w1.put(Long.valueOf((long) ((CoreData) envelope.getModuleData(CoreData.class)).counterVerification.nextVerifyTime));
        }
        this.f91137Q.f20381e0.f89358x1.put(Long.valueOf(pzi0.m174454o()));
        if (((CoreData) envelope.getModuleData(CoreData.class)).counterVerification.needSync) {
            CrashHelper.m82479c(new Exception("Conversation Counter Error userId: " + CoreModule.m30929H().userId() + "\nlocalCounter: " + bkj0Var.f77082b + "\nremoteCounter: " + ((CoreData) envelope.getModuleData(CoreData.class)).counterVerification.total + "\ncheckTime: " + bkj0Var.f77083c));
        }
    }

    /* JADX INFO: renamed from: Qi */
    public final /* synthetic */ List m33780Qi(Envelope envelope) {
        this.f91137Q.m32495w3(envelope, null);
        List<User> list = ((CommonData) envelope.getModuleData(CommonData.class)).users;
        if (!jyb.m147479J(list)) {
            this.f20643U.setLength(0);
            for (User user : list) {
                StringBuilder sb = this.f20643U;
                if (user == null) {
                    sb.append("null");
                } else {
                    sb.append(user.f56859id);
                }
                this.f20643U.append(com.clevertap.android.sdk.Constants.SEPARATOR_COMMA);
            }
        }
        return ((CoreData) envelope.getModuleData(CoreData.class)).friends;
    }

    /* JADX INFO: renamed from: Qj */
    public final /* synthetic */ void m33781Qj(long j) {
        DbLinks dbLinksMo61485Oj;
        Message messageQuery = CoreModule.f18272k.f115535c.query(j);
        if (messageQuery.moment != null && (dbLinksMo61485Oj = CoreModule.m30932N().mo61485Oj(messageQuery.moment)) != null) {
            dbLinksMo61485Oj.total--;
            CoreModule.m30932N().mo61534f6(dbLinksMo61485Oj);
        }
        CoreModule.f18272k.f115535c.delete(j);
        m33809So(messageQuery.cid, false);
    }

    /* JADX INFO: renamed from: Qk */
    public final /* synthetic */ C22421c m33782Qk(final Message message) {
        return new ti20((pcj<x1d0>) new pcj() { // from class: l.q88
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                Message message2 = message;
                return C4879a.f20236P.auth().m209043q(C4879a.m32245R0(message2.cid, message2.f56859id) + "&method=patch&action=updateLikeStatus").m209038l(z1d0.create(Network.JSON, message2.toJson())).m209028b();
            }
        }, 0).map(new qcj() { // from class: l.r88
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f161673a.m33770Pk(message, (Envelope) obj);
            }
        }).compose(C4879a.m32255T2());
    }

    /* JADX INFO: renamed from: Ql */
    public final /* synthetic */ C22421c m33783Ql(final String str) {
        return new ti20(new pcj() { // from class: l.t78
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4879a.f20236P.auth().m209043q(C4879a.m32241Q0(str) + "&limit=10").m209032f().m209028b();
            }
        }).map(new qcj() { // from class: l.u78
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f177885a.m33771Pl((Envelope) obj);
            }
        }).compose(C4879a.m32255T2());
    }

    /* JADX INFO: renamed from: Qm */
    public final /* synthetic */ void m33784Qm(Conversation conversation) {
        if (gta.m132210e().m132214d().mo34730Nd(conversation)) {
            return;
        }
        this.f91137Q.f20381e0.m116528X6(conversation.otherUser, conversation.convType, conversation.status);
    }

    /* JADX INFO: renamed from: Qn */
    public int m33785Qn(String str) {
        return CoreModule.f18272k.f115535c.m189486v0(str);
    }

    /* JADX INFO: renamed from: Qo */
    public final Conversation m33786Qo(Message message) {
        Conversation conversationNew_ = Conversation.new_();
        conversationNew_.f56859id = message.cid;
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
    public void m33787Qp() {
        if (!gta.m132210e().m132214d().mo34767Vb()) {
            this.f20730x0 = !this.f20730x0;
        } else {
            jxd0 jxd0Var = this.f20733y0;
            jxd0Var.put(Boolean.valueOf(!jxd0Var.get().booleanValue()));
        }
    }

    /* JADX INFO: renamed from: Re */
    public void m33788Re() {
        if (NullChecker.m82486a(this.f20729w2.m222761e())) {
            C22507a<ConversationCounter> c22507a = this.f20729w2;
            c22507a.m137019l(c22507a.m222761e());
        }
    }

    /* JADX INFO: renamed from: Rf */
    public C22421c<uxj0> m33789Rf(final String str, final List<Message> list) {
        return this.f91137Q.scheduled("users/me/chat-profiles/patch", -1, new pcj() { // from class: l.i18
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f112495a.m34174wi(list, str);
            }
        });
    }

    /* JADX INFO: renamed from: Rg */
    public void m33790Rg(final List<InsertConversationUser> list) {
        l51.m152919y(new Runnable() { // from class: l.vw7
            @Override // java.lang.Runnable
            public final void run() {
                this.f186104a.m33851Wi(list);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Rh */
    public final /* synthetic */ Boolean m33791Rh(pf60 pf60Var) {
        return Boolean.valueOf(NullChecker.m82486a(pf60Var) && NullChecker.m82486a(pf60Var.f152156a) && (this.f20633Q2 || ((CounterVerification) pf60Var.f152156a).needSync));
    }

    /* JADX INFO: renamed from: Ri */
    public final /* synthetic */ C22421c m33792Ri(final String str) {
        return new ti20(new pcj() { // from class: l.b58
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4879a.f20236P.auth().m209043q(str).m209032f().m209028b();
            }
        }).map(new qcj() { // from class: l.c58
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f79811a.m33780Qi((Envelope) obj);
            }
        }).compose(C4879a.m32255T2());
    }

    /* JADX INFO: renamed from: Rj */
    public final /* synthetic */ uxj0 m33793Rj(final long j) throws Exception {
        this.f91137Q.f20351U.m128074a(new x20() { // from class: l.w98
            @Override // p153l.x20
            public final void call() {
                this.f187982a.m33781Qj(j);
            }
        });
        return uxj0.f181467a;
    }

    /* JADX INFO: renamed from: Rk */
    public final /* synthetic */ void m33794Rk(Envelope envelope) {
        this.f91137Q.m32495w3(envelope, null);
    }

    /* JADX INFO: renamed from: Rl */
    public final /* synthetic */ void m33795Rl(RunnableC4884c0.b bVar) {
        m33668He();
    }

    /* JADX INFO: renamed from: Rm */
    public final /* synthetic */ uxj0 m33796Rm(Envelope envelope) {
        this.f91137Q.m32495w3(envelope, null);
        return uxj0.f181467a;
    }

    /* JADX INFO: renamed from: Rn */
    public int m33797Rn(String str) {
        return CoreModule.f18272k.f115535c.m189488x0(str);
    }

    /* JADX INFO: renamed from: Rp */
    public final void m33798Rp(String str) {
        List<String> listM159014e1 = CoreModule.f18272k.f115545m.m159014e1();
        listM159014e1.size();
        final JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("conversationIds", new JSONArray((Collection) listM159014e1));
            jSONObject.put("statuses", new JSONArray(ConversationStatus.JSON_ADAPTER.ARRAY_ADAPTER().serialize(jyb.m147507f0(ConversationStatus.get("default"), ConversationStatus.get("blocked")))));
            jSONObject.put("latestUpdatedTime", str);
        } catch (Exception e) {
            CrashHelper.m82479c(e);
        }
        Envelope envelopeM165964c = qi20.m176654a(new pcj() { // from class: l.d58
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4879a.f20236P.auth().m209043q(C4879a.m32214I2("/conversation-diffs")).m209038l(z1d0.create(Network.JSON, jSONObject.toString())).m209028b();
            }
        }).toBlocking().m165964c(null);
        if (!NullChecker.m82486a(envelopeM165964c) || TextUtils.isEmpty(((CoreData) envelopeM165964c.getModuleData(CoreData.class)).conversationDiff.syncUrl)) {
            return;
        }
        Links linksNew_ = Links.new_();
        linksNew_.next = Links.normalizeUrl(((CoreData) envelopeM165964c.getModuleData(CoreData.class)).conversationDiff.syncUrl);
        m33810Sp(linksNew_);
    }

    /* JADX INFO: renamed from: Se */
    public ConversationCounter m33799Se() {
        return this.f20729w2.m222761e();
    }

    /* JADX INFO: renamed from: Sf */
    public void m33800Sf() {
        l51.m152919y(new Runnable() { // from class: l.t38
            @Override // java.lang.Runnable
            public final void run() {
                this.f171905a.m34186xi();
            }
        });
    }

    /* JADX INFO: renamed from: Sg */
    public void m33801Sg(String str, double d2) {
        m33968gh(m34081pf(str, MessageType.get(MessageType.local_intl_read_receipts_guide), ""), true, d2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Sh */
    public final /* synthetic */ void m33802Sh(pf60 pf60Var) {
        if (this.f20633Q2) {
            this.f91137Q.f20351U.m128074a(new x20() { // from class: l.d28
                @Override // p153l.x20
                public final void call() {
                    C4891g.m33444o3();
                }
            });
            m33798Rp((String) pf60Var.f152157b);
            this.f20633Q2 = false;
        } else if (!((CounterVerification) pf60Var.f152156a).syncAll) {
            m33798Rp((String) pf60Var.f152157b);
        } else {
            this.f91137Q.f20351U.m128074a(new x20() { // from class: l.e28
                @Override // p153l.x20
                public final void call() {
                    C4891g.m33545x4();
                }
            });
            m33653Fo();
        }
    }

    /* JADX INFO: renamed from: Si */
    public final /* synthetic */ void m33803Si(double d2) {
        this.f91137Q.f20351U.m128074a(new b(d2));
    }

    /* JADX INFO: renamed from: Sj */
    public final /* synthetic */ uxj0 m33804Sj(final String str) throws Exception {
        this.f91137Q.f20351U.m128074a(new x20() { // from class: l.n18
            @Override // p153l.x20
            public final void call() {
                C4891g.m33428m9(str);
            }
        });
        return uxj0.f181467a;
    }

    /* JADX INFO: renamed from: Sk */
    public final /* synthetic */ pf60 m33805Sk(String str, Envelope envelope) {
        return new pf60(envelope.meta, !jyb.m147479J(((CoreData) envelope.getModuleData(CoreData.class)).conversations) ? ((CoreData) envelope.getModuleData(CoreData.class)).conversations.get(0) : this.f91137Q.f20384f0.m33738Mo(str));
    }

    /* JADX INFO: renamed from: Sl */
    public final /* synthetic */ void m33806Sl() {
        if (NullChecker.m82486a(CoreModule.f18272k.f115545m.query("fake_conversation_fold_conversation"))) {
            this.f91137Q.f20351U.m128074a(new x20() { // from class: l.zt7
                @Override // p153l.x20
                public final void call() {
                    CoreModule.f18264c.f20384f0.m33631Ef("fake_conversation_fold_conversation");
                }
            });
        }
    }

    /* JADX INFO: renamed from: Sm */
    public final /* synthetic */ C22421c m33807Sm(final String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("isActor", true);
            jSONObject.put("type", "paid");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("compliment", jSONObject);
            final JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("additional", jSONObject2);
            return new ti20(new pcj() { // from class: l.b88
                @Override // p153l.pcj, java.util.concurrent.Callable
                public final Object call() {
                    return C4879a.f20236P.auth().m209043q(C4879a.m32222K2(str)).m209038l(z1d0.create(Network.JSON, jSONObject3.toString())).m209028b();
                }
            }).map(new qcj() { // from class: l.c88
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return this.f80185a.m33796Rm((Envelope) obj);
                }
            }).compose(C4879a.m32255T2());
        } catch (JSONException unused) {
            return C22421c.error(new RuntimeException("JSON构建失败"));
        }
    }

    /* JADX INFO: renamed from: Sn */
    public void m33808Sn(final List<String> list) {
        scheduled("messageUpdataCommonTipPat", 0, new pcj() { // from class: l.hc8
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f108680a.m34201yk(list);
            }
        });
    }

    /* JADX INFO: renamed from: So */
    public final void m33809So(String str, boolean z) {
        boolean z2 = !CoreModule.f18272k.f115535c.m189461W(str).m208670f();
        Conversation conversationM33738Mo = m33738Mo(str);
        if (conversationM33738Mo != null) {
            conversationM33738Mo.localHasMessage = z2;
            if (z) {
                conversationM33738Mo.read = Boolean.TRUE;
            }
            CoreModule.f18272k.f115545m.upsert(conversationM33738Mo);
        }
    }

    /* JADX INFO: renamed from: Sp */
    public final void m33810Sp(Links links) {
        String str;
        if (links == null || (str = links.next) == null) {
            return;
        }
        final String strM32290d = C4879a.m32290d(str);
        final Envelope envelopeM165964c = qi20.m176654a(new pcj() { // from class: l.p68
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4879a.f20236P.auth().m209043q(strM32290d).m209032f().m209028b();
            }
        }).toBlocking().m165964c(null);
        if (NullChecker.m82486a(envelopeM165964c)) {
            this.f91137Q.m32495w3(envelopeM165964c, new x20() { // from class: l.q68
                @Override // p153l.x20
                public final void call() {
                    this.f155788a.m34140tm(envelopeM165964c);
                }
            });
            if (TextUtils.isEmpty(envelopeM165964c.pagination.links.next)) {
                return;
            }
            C22421c.timer(100L, TimeUnit.MILLISECONDS).subscribe(psd0.m173597H(new y20() { // from class: l.r68
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f161455a.m34153um(envelopeM165964c, (Long) obj);
                }
            }, new y20() { // from class: l.t68
                @Override // p153l.y20
                public final void call(Object obj) {
                    CrashHelper.m82479c((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: Te */
    public C22421c<List<Conversation>> m33811Te() {
        return m33728Me().m159017h0(pzi0.m174454o()).m208677m();
    }

    /* JADX INFO: renamed from: Tf */
    public C22421c<uxj0> m33812Tf(final String str) {
        return this.f91137Q.scheduled("conversation_delete_unmatch", -1, new pcj() { // from class: l.pz7
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f154723a.m33582Ai(str);
            }
        });
    }

    /* JADX INFO: renamed from: Tg */
    public void m33813Tg(final User user) {
        l51.m152919y(new Runnable() { // from class: l.kr7
            @Override // java.lang.Runnable
            public final void run() {
                this.f128425a.m33863Xi(user);
            }
        });
    }

    /* JADX INFO: renamed from: Th */
    public final /* synthetic */ void m33814Th(User user, Conversation conversation) {
        String str = "fake_id_filter_veification" + user.f56859id;
        CoreModule.f18272k.f115535c.delete(Filter.AND(Message.CID.mo61359EQ(user.f56859id), Message.f21183ID.mo61359EQ(str)));
        if (user.isPicVerificationVerified() || TEnum.equals(conversation.status, "deleted") || TEnum.equals(conversation.status, "dismissed") || !this.f91137Q.f20381e0.m116563g8() || user.isBanedOrInactivated()) {
            return;
        }
        Message messageM34068of = this.f91137Q.f20384f0.m34068of(user.f56859id, MessageType.get(MessageType.common_tip));
        messageM34068of.f56859id = str;
        messageM34068of.value = "你设置了只和认证用户聊天，他还未完成照片认证，你可以更改<a href = \"tantan://chat/receive_message_setting\">信息接收设置</a>";
        this.f91137Q.f20384f0.m33885Zg(messageM34068of);
    }

    /* JADX INFO: renamed from: Ti */
    public final /* synthetic */ void m33815Ti(int i, String str, int i2, double d2) {
        Conversation conversationQuery = CoreModule.f18272k.f115545m.query("fake_conversation_city_centre_enter");
        if (conversationQuery == null && i == 0) {
            return;
        }
        long jM174454o = pzi0.m174454o();
        if (conversationQuery == null) {
            conversationQuery = Conversation.new_();
            conversationQuery.f56859id = "fake_conversation_city_centre_enter";
            double d3 = jM174454o;
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
        CoreModule.f18264c.f20384f0.m34053mq(conversationQuery);
        this.f91137Q.f20392h2.f142921X.put(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: Tj */
    public final /* synthetic */ void m33816Tj(String str, Envelope envelope) {
        DbLinks dbLinksM33750No = m33750No(str);
        if (NullChecker.m82486a(dbLinksM33750No)) {
            dbLinksM33750No.links.next = envelope.pagination.links.next;
            CoreModule.f18272k.f115536d.upsert(dbLinksM33750No);
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
    public final /* synthetic */ void m33817Tk(Envelope envelope) {
        this.f91137Q.m32495w3(envelope, null);
    }

    /* JADX INFO: renamed from: Tl */
    public final /* synthetic */ Boolean m33818Tl(String str) {
        return Boolean.valueOf(NullChecker.m82486a(m33738Mo(str)));
    }

    /* JADX INFO: renamed from: Tm */
    public C22421c<List<Conversation>> m33819Tm() {
        return m33728Me().f137504v.m180655b().m208677m();
    }

    /* JADX INFO: renamed from: Tn */
    public C22421c<vg60<Message>> m33820Tn(String str) {
        return m33832Un(str, -1.0d);
    }

    /* JADX INFO: renamed from: To */
    public final void m33821To(String str, boolean z, String str2) {
        boolean zM208670f = CoreModule.f18272k.f115535c.m189461W(str).m208670f();
        boolean z2 = !zM208670f;
        Conversation conversationM33738Mo = m33738Mo(str);
        if (conversationM33738Mo != null) {
            conversationM33738Mo.localHasMessage = z2;
            if (zM208670f) {
                conversationM33738Mo.unreadMessages = 0;
            }
            if (z) {
                conversationM33738Mo.read = Boolean.TRUE;
            }
            conversationM33738Mo.clearedUntil = str2;
            conversationM33738Mo.localSafetyReminderTime = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
            conversationM33738Mo.localSpoofingReminderTime = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
            CoreModule.f18272k.f115545m.upsert(conversationM33738Mo);
        }
    }

    /* JADX INFO: renamed from: Tp */
    public C22421c<List<Conversation>> m33822Tp() {
        return CoreModule.f18272k.f115545m.f137497o.m180655b().m208677m();
    }

    /* JADX INFO: renamed from: Ue */
    public C22421c<Conversation> m33823Ue(String str) {
        return CoreModule.f18272k.f115545m.uiGet(str);
    }

    /* JADX INFO: renamed from: Uf */
    public void m33824Uf() {
        u11.m193892f();
        Collection collectionM208674j = CoreModule.f18272k.f115545m.f137477H.m208674j();
        if (jyb.m147479J(collectionM208674j)) {
            return;
        }
        ArrayList arrayList = new ArrayList(collectionM208674j);
        for (int i = 0; i < arrayList.size(); i++) {
            Conversation conversation = (Conversation) arrayList.get(i);
            conversation.level = 0;
            CoreModule.f18272k.f115545m.upsert(conversation);
        }
    }

    /* JADX INFO: renamed from: Ug */
    public void m33825Ug(String str, String str2) {
        m33845Vo(str, m34041me(str, str2));
    }

    /* JADX INFO: renamed from: Uh */
    public final /* synthetic */ void m33826Uh(Envelope envelope) {
        this.f20631Q0 = false;
        this.f20616L0.put(1);
        m33653Fo();
    }

    /* JADX INFO: renamed from: Ui */
    public final /* synthetic */ void m33827Ui(final int i, final String str, final int i2, final double d2) {
        this.f91137Q.f20351U.m128074a(new x20() { // from class: l.n48
            @Override // p153l.x20
            public final void call() {
                this.f140205a.m33815Ti(i, str, i2, d2);
            }
        });
    }

    /* JADX INFO: renamed from: Uj */
    public final /* synthetic */ uxj0 m33828Uj(final String str, final Envelope envelope) {
        CoreModule.f18264c.f20390h0.m107384m3(envelope);
        this.f91137Q.m32495w3(envelope, new x20() { // from class: l.o28
            @Override // p153l.x20
            public final void call() {
                this.f144726a.m33816Tj(str, envelope);
            }
        });
        return uxj0.f181467a;
    }

    /* JADX INFO: renamed from: Uk */
    public final /* synthetic */ pf60 m33829Uk(String str, Envelope envelope) {
        return new pf60(envelope.meta, !jyb.m147479J(((CoreData) envelope.getModuleData(CoreData.class)).conversations) ? ((CoreData) envelope.getModuleData(CoreData.class)).conversations.get(0) : this.f91137Q.f20384f0.m33738Mo(str));
    }

    /* JADX INFO: renamed from: Ul */
    public final /* synthetic */ void m33830Ul(boolean z, String str) {
        m33631Ef(str);
        if (z) {
            if (TextUtils.equals(str, this.f91137Q.f20405m0.f20131Y0.get())) {
                this.f91137Q.f20405m0.f20131Y0.clear();
            }
            if (TextUtils.equals(str, this.f91137Q.f20405m0.f20134Z0.get())) {
                this.f91137Q.f20405m0.f20134Z0.clear();
            }
            if (TextUtils.equals(str, this.f91137Q.f20405m0.f20137a1.get())) {
                this.f91137Q.f20405m0.f20137a1.clear();
            }
        }
    }

    /* JADX INFO: renamed from: Um */
    public List<Message> m33831Um(String str) {
        return CoreModule.f18272k.f115535c.m189458T(str);
    }

    /* JADX INFO: renamed from: Un */
    public C22421c<vg60<Message>> m33832Un(String str, double d2) {
        Conversation conversationM34219zp = m34219zp(str);
        double d3 = NullChecker.m82486a(conversationM34219zp) ? conversationM34219zp.clearedTime : 0.0d;
        if (TextUtils.equals(str, User.ID_TEAM_ACCOUNT) && d2 <= FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE && CoreModule.m30933P().m143405a().mo34453Yd()) {
            d2 = CoreModule.m30933P().m143405a().mo34543ls();
        }
        return d2 > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE ? m33844Vn(str, Message.CREATEDTIME.REQ(Double.valueOf(d2)), String.valueOf(d2), d3, false) : psd0.m173625r(CoreModule.f18272k.f115535c.m189464Z(str, d3, false).m208677m(), CoreModule.f18272k.f115536d.uiGet(str), new rcj() { // from class: l.oa8
            @Override // p153l.rcj
            public final Object call(Object obj, Object obj2) {
                return this.f145669a.m34214zk((List) obj, (DbLinks) obj2);
            }
        });
    }

    /* JADX INFO: renamed from: Uo */
    public List<Conversation> m33833Uo() {
        return CoreModule.f18272k.f115545m.m159022j1();
    }

    /* JADX INFO: renamed from: Up */
    public List<Message> m33834Up() {
        return CoreModule.f18272k.f115535c.m189487w0();
    }

    /* JADX INFO: renamed from: Ve */
    public final vg60<Conversation> m33835Ve(List<Conversation> list, DbLinks dbLinks) {
        if (dbLinks == null) {
            m33653Fo();
        }
        return m118618Z2(list, dbLinks);
    }

    /* JADX INFO: renamed from: Vf */
    public void m33836Vf(final List<Conversation> list, final Set<String> set) {
        final JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        final HashSet hashSet = new HashSet();
        for (Conversation conversation : list) {
            jSONArray.put(conversation.f56859id);
            hashSet.add(conversation.f56859id);
        }
        try {
            jSONObject.put("ids", jSONArray);
            jSONObject.put("newLabelExposureTime", Converter.dateToApiTimeString(pzi0.m174454o()));
        } catch (JSONException unused) {
        }
        this.f91137Q.scheduled("newMatchNewTag" + jSONObject, -1, new pcj() { // from class: l.h88
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f108213a.m33608Ci(jSONObject, list, set, hashSet);
            }
        });
    }

    /* JADX INFO: renamed from: Vg */
    public void m33837Vg(String str) {
        m33885Zg(m34068of(str, MessageType.get(MessageType.local_birthday_tip)));
    }

    /* JADX INFO: renamed from: Vh */
    public final /* synthetic */ void m33838Vh(Throwable th) {
        this.f20616L0.put(-1);
    }

    /* JADX INFO: renamed from: Vi */
    public final /* synthetic */ void m33839Vi(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            InsertConversationUser insertConversationUser = (InsertConversationUser) it.next();
            Conversation conversationQuery = CoreModule.f18272k.f115545m.query(insertConversationUser.userId);
            if (conversationQuery == null) {
                Conversation conversationNew_ = Conversation.new_();
                String str = insertConversationUser.userId;
                conversationNew_.f56859id = str;
                conversationNew_.otherUser = str;
                conversationNew_.createdTime = insertConversationUser.timeStamp.longValue();
                conversationNew_.latestTime = insertConversationUser.timeStamp.longValue();
                conversationNew_.convType = ConversationType.intlSeeChatRequest;
                conversationNew_.localEverHasMessage = true;
                m34053mq(conversationNew_);
            } else if (TextUtils.equals(conversationQuery.convType, ConversationType.intlSeeChatRequest)) {
                String str2 = insertConversationUser.userId;
                conversationQuery.f56859id = str2;
                conversationQuery.otherUser = str2;
                conversationQuery.createdTime = insertConversationUser.timeStamp.longValue();
                conversationQuery.latestTime = insertConversationUser.timeStamp.longValue();
                conversationQuery.convType = ConversationType.intlSeeChatRequest;
                conversationQuery.localEverHasMessage = true;
                m34053mq(conversationQuery);
            }
        }
    }

    /* JADX INFO: renamed from: Vj */
    public final /* synthetic */ C22421c m33840Vj(final String str, final String str2) {
        return new ti20(new pcj() { // from class: l.cv7
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4879a.f20236P.auth().m209043q(C4879a.m32238P0(str, str2)).m209032f().m209028b();
            }
        }).map(new qcj() { // from class: l.dv7
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f90912a.m33828Uj(str, (Envelope) obj);
            }
        }).compose(C4879a.m32255T2());
    }

    /* JADX INFO: renamed from: Vk */
    public final /* synthetic */ void m33841Vk(Envelope envelope) {
        this.f91137Q.m32495w3(envelope, null);
    }

    /* JADX INFO: renamed from: Vl */
    public final /* synthetic */ void m33842Vl(List list, final boolean z) {
        jyb.m147537z(list, new y20() { // from class: l.c18
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f79375a.m33830Ul(z, (String) obj);
            }
        });
    }

    /* JADX INFO: renamed from: Vm */
    public C22421c<List<Conversation>> m33843Vm() {
        return CoreModule.f18272k.f115545m.m159033p0().m208677m();
    }

    /* JADX INFO: renamed from: Vn */
    public final C22421c<vg60<Message>> m33844Vn(String str, Filter<Message> filter, String str2, double d2, boolean z) {
        return psd0.m173625r(CoreModule.f18272k.f115535c.m189462X(str, filter, str2, d2, z).m208677m(), CoreModule.f18272k.f115536d.uiGet(str), new rcj() { // from class: l.my7
            @Override // p153l.rcj
            public final Object call(Object obj, Object obj2) {
                return this.f139318a.m33584Ak((List) obj, (DbLinks) obj2);
            }
        });
    }

    /* JADX INFO: renamed from: Vo */
    public final C22421c<uxj0> m33845Vo(final String str, final Message message) {
        return this.f91137Q.now(C22421c.fromCallable(new Callable() { // from class: l.h68
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f108015a.m33611Cl(str, message);
            }
        }).compose(C4879a.m32255T2()));
    }

    /* JADX INFO: renamed from: Vp */
    public C22421c<uxj0> m33846Vp(final NotificationStatus notificationStatus, final NotificationStatus notificationStatus2, final String str) {
        return this.f91137Q.now(C22421c.fromCallable(new Callable() { // from class: l.kt7
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f128655a.m34178wm(notificationStatus, notificationStatus2, str);
            }
        }).compose(C4879a.m32255T2()));
    }

    /* JADX INFO: renamed from: We */
    public C22421c<List<Message>> m33847We(String str) {
        return CoreModule.f18272k.f115535c.m189472h0(str).m208677m();
    }

    /* JADX INFO: renamed from: Wf */
    public C22421c<String> m33848Wf(final String str, final String str2, final String str3, final String str4, final Message message) {
        return scheduled("feedback/" + str + "/" + str2, -1, new pcj() { // from class: l.h18
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return qi20.m176658e(new pcj() { // from class: l.d48
                    @Override // p153l.pcj, java.util.concurrent.Callable
                    public final Object call() {
                        return C4891g.m33293ae(str, str, str, str);
                    }
                }).map(new qcj() { // from class: l.f48
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return C4891g.m33440na(message, (Envelope) obj);
                    }
                }).observeOn(fo0.m126432a());
            }
        });
    }

    /* JADX INFO: renamed from: Wg */
    public void m33849Wg(String str, double d2) {
        Message messageNew_ = Message.new_();
        messageNew_.cid = str;
        vxd0 vxd0Var = App.f16092i;
        messageNew_.f56859id = DbObject.GENERATE_UNIQUE_FAKE_ID(vxd0Var.get().intValue());
        messageNew_.messageType = MessageType.get(MessageType.local_blindbox_guide);
        messageNew_.localCreatedTime = pzi0.m174454o();
        messageNew_.createdTime = d2;
        messageNew_.localCreatedSession = vxd0Var.get().intValue();
        messageNew_.localInConversation = true;
        messageNew_.owner = CoreModule.m30929H().userId();
        messageNew_.recalled = Boolean.FALSE;
        messageNew_.value = "";
        m33897ah(messageNew_, false);
    }

    /* JADX INFO: renamed from: Wh */
    public final /* synthetic */ void m33850Wh(String str) {
        Conversation conversationM33738Mo = this.f91137Q.f20384f0.m33738Mo(str);
        if (NullChecker.m82486a(conversationM33738Mo)) {
            ConversationGame conversationGame = conversationM33738Mo.additional.game;
            if (NullChecker.m82486a(conversationGame)) {
                conversationGame.gameUnread = 0;
                conversationGame.gameText = "";
                this.f91137Q.f20384f0.m34053mq(conversationM33738Mo);
            }
        }
    }

    /* JADX INFO: renamed from: Wi */
    public final /* synthetic */ void m33851Wi(final List list) {
        this.f91137Q.f20351U.m128074a(new x20() { // from class: l.k28
            @Override // p153l.x20
            public final void call() {
                this.f123579a.m33839Vi(list);
            }
        });
    }

    /* JADX INFO: renamed from: Wj */
    public final /* synthetic */ void m33852Wj(String str, boolean z, boolean z2, Message message, Sticker sticker, CoreProviderInterface coreProviderInterface) {
        DbLinks dbLinksMo61485Oj;
        if (!CoreModule.m30929H().userId().equals(str) && z && m34185xh(str)) {
            Conversation conversationM33738Mo = m33738Mo(str);
            if (conversationM33738Mo == null && z2) {
                if (gta.m132210e().m132214d().mo34811c() && m33750No(str) == null) {
                    DbLinks dbLinks = new DbLinks();
                    dbLinks.f56859id = message.cid;
                    dbLinks.links = Links.new_();
                    CoreModule.f18272k.f115536d.upsert(dbLinks);
                }
                conversationM33738Mo = m33786Qo(message);
            }
            if (NullChecker.m82486a(conversationM33738Mo)) {
                conversationM33738Mo.latestTime = message.createdTime;
                conversationM33738Mo.localHasMessage = true;
                CoreModule.f18272k.f115545m.upsert(conversationM33738Mo);
            }
        }
        message.localCreatedSession = App.f16092i.get().intValue();
        message.localCreatedTime = System.nanoTime();
        if (message.moment != null && (dbLinksMo61485Oj = CoreModule.m30932N().mo61485Oj(message.moment)) != null) {
            dbLinksMo61485Oj.total++;
            CoreModule.m30932N().mo61534f6(dbLinksMo61485Oj);
        }
        if (sticker != null) {
            CoreModule.f18272k.f115539g.insert(sticker);
        }
        CoreModule.f18272k.f115535c.insert(message);
        if (coreProviderInterface.mo34850i()) {
            m33741Nf(str);
        }
        if (coreProviderInterface.mo34958ym()) {
            m33981hi(str);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Wk */
    public final /* synthetic */ C22421c m33853Wk(final boolean z, final String str, pf60 pf60Var) {
        final Message message = (Message) pf60Var.f152156a;
        final Double d2 = (Double) pf60Var.f152157b;
        return qi20.m176658e(new pcj() { // from class: l.y88
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4891g.m33301ba(z, message, str);
            }
        }).doOnNext(new y20() { // from class: l.z88
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f203325a.m33841Vk((Envelope) obj);
            }
        }).map(new qcj() { // from class: l.a98
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return C4891g.m33128M4(d2, (Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: Wl */
    public final /* synthetic */ void m33854Wl(List list, final boolean z) {
        final ArrayList arrayListM147522n = jyb.m147522n(list, new qcj() { // from class: l.gw7
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f106735a.m33818Tl((String) obj);
            }
        });
        if (arrayListM147522n.isEmpty()) {
            return;
        }
        this.f91137Q.f20351U.m128074a(new x20() { // from class: l.hw7
            @Override // p153l.x20
            public final void call() {
                this.f111869a.m33842Vl(arrayListM147522n, z);
            }
        });
    }

    /* JADX INFO: renamed from: Wm */
    public final C22421c<uxj0> m33855Wm(DbLinks dbLinks) {
        return m33867Xm(dbLinks, true);
    }

    /* JADX INFO: renamed from: Wn */
    public C22421c<vg60<Message>> m33856Wn(String str, String str2) {
        return psd0.m173625r(CoreModule.f18272k.f115535c.m189463Y(str, str2).m208677m(), CoreModule.f18272k.f115536d.uiGet(str), new rcj() { // from class: l.ps7
            @Override // p153l.rcj
            public final Object call(Object obj, Object obj2) {
                return this.f153876a.m118618Z2((List) obj, (DbLinks) obj2);
            }
        });
    }

    /* JADX INFO: renamed from: Wo */
    public final C22421c<uxj0> m33857Wo(final String str, final Message message) {
        return this.f91137Q.now(C22421c.fromCallable(new Callable() { // from class: l.wc8
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f188395a.m33637El(str, message);
            }
        }).compose(C4879a.m32255T2()));
    }

    /* JADX INFO: renamed from: Wp */
    public C22421c<uxj0> m33858Wp(final NotificationStatus notificationStatus, final NotificationStatus notificationStatus2, final boolean z, final boolean z2) {
        return this.f91137Q.now(C22421c.fromCallable(new Callable() { // from class: l.nx7
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f144088a.m34166vm(z, notificationStatus, notificationStatus2, z2);
            }
        }).compose(C4879a.m32255T2()));
    }

    /* JADX INFO: renamed from: Xe */
    public Conversation m33859Xe(String str) {
        return CoreModule.f18272k.f115545m.queryCache(str);
    }

    /* JADX INFO: renamed from: Xf */
    public C22421c<List<UserLiveLabel>> m33860Xf(String str, String str2, String... strArr) {
        if (strArr == null || strArr.length == 0) {
            return C22421c.just(new ArrayList());
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
        return this.f91137Q.scheduled("live-labels/" + str2 + "/" + str, 0, new pcj() { // from class: l.lt7
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return qi20.m176654a(new pcj() { // from class: l.x18
                    @Override // p153l.pcj, java.util.concurrent.Callable
                    public final Object call() {
                        return C4879a.f20236P.auth().m209043q(C4879a.m32203G("/live-labels")).m209038l(z1d0.create(Network.JSON, jsonObject.toString())).m209028b();
                    }
                });
            }
        }).map(new qcj() { // from class: l.nt7
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return C4891g.m33407ka((Envelope) obj);
            }
        }).flatMap(new rb8()).filter(new qcj() { // from class: l.ot7
            @Override // p153l.qcj
            public final Object call(Object obj) {
                UserLiveLabel userLiveLabel = (UserLiveLabel) obj;
                return Boolean.valueOf((userLiveLabel.isLiveChat() && uqb0.f180396b0.f170326c.mo68419Qc()) || (userLiveLabel.isVoiceChat() && uqb0.f180396b0.f170326c.mo68437Zr()));
            }
        }).toList();
    }

    /* JADX INFO: renamed from: Xg */
    public void m33861Xg(String str, List<BreakIce> list) {
        if (jyb.m147479J(list)) {
            return;
        }
        m33857Wo(str, m34132te(str, list));
    }

    /* JADX INFO: renamed from: Xh */
    public final /* synthetic */ void m33862Xh(final String str) {
        this.f91137Q.f20351U.m128074a(new x20() { // from class: l.y28
            @Override // p153l.x20
            public final void call() {
                this.f197195a.m33850Wh(str);
            }
        });
    }

    /* JADX INFO: renamed from: Xi */
    public final /* synthetic */ void m33863Xi(User user) {
        final Message messageNew_ = Message.new_();
        messageNew_.messageType = MessageType.get("live_vip_greet");
        messageNew_.cid = gta.m132210e().m132214d().mo34843h();
        messageNew_.createdTime = pzi0.m174454o();
        messageNew_.value = gta.m132210e().m132214d().mo34966zt();
        messageNew_.owner = user == null ? CoreModule.m30929H().userId() : user.f56859id;
        messageNew_.f56859id = "fake_id_" + pzi0.m174453n();
        messageNew_.localInConversation = true;
        messageNew_.recalled = Boolean.FALSE;
        messageNew_.localNotificationStatus = NotificationStatus.get("removed");
        messageNew_.localCreatedSession = App.f16092i.get().intValue();
        this.f91137Q.f20351U.m128074a(new x20() { // from class: l.zx7
            @Override // p153l.x20
            public final void call() {
                CoreModule.f18272k.f115535c.insert(messageNew_);
            }
        });
    }

    /* JADX INFO: renamed from: Xj */
    public final /* synthetic */ Message m33864Xj(final Message message, final String str, final boolean z, final boolean z2, final Sticker sticker, final CoreProviderInterface coreProviderInterface) throws Exception {
        Picture picture;
        if (message._id != 0) {
            final Message messageMo225055clone = message.mo225055clone();
            messageMo225055clone.localCreatedSession = App.f16092i.get().intValue();
            this.f91137Q.f20351U.m128074a(new x20() { // from class: l.ow7
                @Override // p153l.x20
                public final void call() {
                    CoreModule.f18272k.f115535c.updateBy_id(messageMo225055clone);
                }
            });
            return messageMo225055clone;
        }
        Conversation conversationM33738Mo = m33738Mo(str);
        if (NullChecker.m82486a(conversationM33738Mo) && gta.m132210e().m132214d().mo34730Nd(conversationM33738Mo)) {
            message.api_only_otherUser = conversationM33738Mo.otherUser;
            message.channel = MessageChannel.get("group");
            message.hostId = conversationM33738Mo.otherUser;
        }
        List<T> listM208674j = CoreModule.f18272k.f115535c.m189461W(str).m208674j();
        message.createdTime = (jyb.m147479J(listM208674j) || listM208674j.size() <= 0) ? C4879a.m32266W2() : C4879a.m32270X2(((Message) listM208674j.get(0)).createdTime);
        message.owner = CoreModule.m30929H().userId();
        message.localInConversation = !User.isTeamAccount(str) || message.moment == null;
        message.localInMoment = message.moment != null;
        message.cid = str;
        message.recalled = Boolean.FALSE;
        message.localNotificationStatus = NotificationStatus.get("removed");
        message.f56859id = DbObject.GENERATE_UNIQUE_FAKE_ID(App.f16092i.get().intValue());
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
                TrackMediaUploadUtil.m81479a0(media);
                if (TEnum.equals(media.status, "raw")) {
                    if (media instanceof Video) {
                        Video video = (Video) media;
                        if (video.size == null || (picture = video.cover) == null || picture.size == null || video.mediaType == null || picture.mediaType == null) {
                            wel0 wel0Var = new wel0(new vel0(oki.m168038z(video.url)), false, false);
                            video.mediaType = DLNAProfiles.DLNAMimeTypes.MIME_VIDEO_MPEG_4;
                            video.size = new Dimension(wel0Var.m206021m());
                            video.duration = wel0Var.f188702b;
                            if (video.cover == null) {
                                Picture pictureNew_ = Picture.new_();
                                pictureNew_.size = new Dimension(1, 1);
                                video.cover = pictureNew_;
                            }
                            Picture picture2 = video.cover;
                            picture2.mediaType = DLNAProfiles.DLNAMimeTypes.MIME_IMAGE_JPEG;
                            picture2.size = new Dimension(wel0Var.m206019k());
                            video.status = MediaLocalStatus.get("raw");
                        }
                        if (!TextUtils.isEmpty(video.url) && video.url.contains(ecj.m120375I().getAbsolutePath())) {
                            try {
                                String[] strArrM120380N = ecj.m120380N(video.url, video.cover().url, ecj.f93065c, message.f56859id, false);
                                video.url = strArrM120380N[0];
                                video.cover().url = strArrM120380N[1];
                            } catch (Exception e) {
                                CrashHelper.m82479c(e);
                            }
                        }
                    } else if (media instanceof Audio) {
                        media.status = MediaLocalStatus.get(MediaLocalStatus.preprocessed);
                    } else if (media instanceof Picture) {
                        Picture picture3 = (Picture) media;
                        if (picture3.size == null || media.mediaType == null) {
                            sim simVar = new sim(oki.m168038z(media.url));
                            picture3.size = new Dimension(simVar.f168843d);
                            media.mediaType = simVar.f168842c;
                        }
                    }
                }
            }
        } else {
            message.media = new ArrayList();
        }
        this.f91137Q.f20351U.m128074a(new x20() { // from class: l.nw7
            @Override // p153l.x20
            public final void call() {
                this.f143925a.m33852Wj(str, z, z2, message, sticker, coreProviderInterface);
            }
        });
        return message;
    }

    /* JADX INFO: renamed from: Xk */
    public final /* synthetic */ void m33865Xk(String str) {
        DbLinks dbLinksM33750No = m33750No(str);
        if (NullChecker.m82486a(dbLinksM33750No)) {
            dbLinksM33750No.links.next = null;
            CoreModule.f18272k.f115536d.upsert(dbLinksM33750No);
        }
        CoreModule.f18272k.f115535c.m189446H(str, Double.MAX_VALUE);
    }

    /* JADX INFO: renamed from: Xl */
    public final /* synthetic */ uxj0 m33866Xl(final MessageType messageType) throws Exception {
        this.f91137Q.f20351U.m128074a(new x20() { // from class: l.o18
            @Override // p153l.x20
            public final void call() {
                CoreModule.f18272k.f115535c.delete(Message.MESSAGETYPE.mo61359EQ((TEnum) messageType));
            }
        });
        return uxj0.f181467a;
    }

    /* JADX INFO: renamed from: Xm */
    public final C22421c<uxj0> m33867Xm(final DbLinks dbLinks, final boolean z) {
        return C22421c.fromCallable(new Callable() { // from class: l.o78
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f145240a.m33946ej(dbLinks, z);
            }
        });
    }

    /* JADX INFO: renamed from: Xn */
    public C22421c<vg60<Message>> m33868Xn(String str) {
        return psd0.m173625r(CoreModule.f18272k.f115535c.m189475k0(str).m208677m(), CoreModule.f18272k.f115536d.uiGet(str), new rcj() { // from class: l.fc8
            @Override // p153l.rcj
            public final Object call(Object obj, Object obj2) {
                return this.f98200a.m33597Bk((List) obj, (DbLinks) obj2);
            }
        });
    }

    /* JADX INFO: renamed from: Xo */
    public C22421c<List<Message>> m33869Xo() {
        return CoreModule.f18272k.f115535c.f172280m.m208677m();
    }

    /* JADX INFO: renamed from: Xp */
    public C22421c<uxj0> m33870Xp(final NotificationStatus notificationStatus, final NotificationStatus notificationStatus2, final String str) {
        return this.f91137Q.now(C22421c.fromCallable(new Callable() { // from class: l.l88
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f130422a.m34190xm(notificationStatus, notificationStatus2, str);
            }
        }).compose(C4879a.m32255T2()));
    }

    /* JADX INFO: renamed from: Ye */
    public C22421c<vg60<Conversation>> m33871Ye() {
        return m33752Oe(CoreModule.f18272k.f115545m.f137473D);
    }

    /* JADX INFO: renamed from: Yf */
    public void m33872Yf(ner nerVar) {
        if (!gta.m132210e().m132214d().mo34805b() || nerVar == null) {
            return;
        }
        if (this.f20594D2 <= pzi0.m174454o() || gta.m132210e().m132214d().mo34901p()) {
            this.f20594D2 = pzi0.m174454o() + HuiYanOsConfig.LONG_CHECK_OVERSEAS_DEFAULT_TIME_OUT;
            this.f20600F2.clear();
            final int i = 40;
            nerVar.duringCreated(CoreModule.f18264c.f20384f0.m33963fo()).take(1).observeOn(fo0.m126432a()).map(new qcj() { // from class: l.cr7
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((vg60) obj).f184001a;
                }
            }).filter(new qcj() { // from class: l.dr7
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(!jyb.m147479J((List) obj));
                }
            }).flatMap(new rb8()).filter(new sb8()).filter(new qcj() { // from class: l.er7
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return C4891g.m33043E7((Conversation) obj);
                }
            }).filter(new qcj() { // from class: l.fr7
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(!User.isTeamAccount(((Conversation) obj).otherUser));
                }
            }).take(40).buffer(40).flatMap(new qcj() { // from class: l.gr7
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return this.f106011a.m33621Di(i, (List) obj);
                }
            }).subscribe(psd0.m173597H(new y20() { // from class: l.hr7
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f111291a.m33634Ei((List) obj);
                }
            }, new y20() { // from class: l.ir7
                @Override // p153l.y20
                public final void call(Object obj) {
                    C4891g.m33016Bd((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: Yg */
    public void m33873Yg(String str, List<ChatAssistantQuestion> list) {
        if (jyb.m147479J(list)) {
            return;
        }
        Message messageNew_ = Message.new_();
        messageNew_.messageType = MessageType.get(MessageType.local_chat_assistant_question_new);
        messageNew_.cid = str;
        messageNew_.localInConversation = true;
        long jM174454o = pzi0.m174454o();
        messageNew_.owner = CoreModule.m30929H().userId();
        messageNew_.createdTime = jM174454o;
        messageNew_.localCreatedTime = jM174454o;
        messageNew_.recalled = Boolean.FALSE;
        messageNew_.hostId = CoreModule.m30929H().userId();
        vxd0 vxd0Var = App.f16092i;
        messageNew_.localCreatedSession = vxd0Var.get().intValue();
        messageNew_.f56859id = DbObject.GENERATE_UNIQUE_FAKE_ID(vxd0Var.get().intValue());
        MessageAdditionalData messageAdditionalDataNew_ = MessageAdditionalData.new_();
        messageNew_.additionalData = messageAdditionalDataNew_;
        messageAdditionalDataNew_.chatAssistantQuestions = list;
        messageNew_.value = "";
        m33885Zg(messageNew_);
    }

    /* JADX INFO: renamed from: Yh */
    public final /* synthetic */ void m33874Yh(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Conversation conversation = (Conversation) it.next();
            conversation.unreadMessages = 0;
            conversation.read = Boolean.TRUE;
            m34053mq(conversation);
        }
    }

    /* JADX INFO: renamed from: Yi */
    public final /* synthetic */ void m33875Yi(Message message, boolean z) {
        Objects.toString(message.messageType);
        m33956fh(message, z);
    }

    /* JADX INFO: renamed from: Yj */
    public final /* synthetic */ C22421c m33876Yj(final Message message, final String str, final boolean z, final boolean z2, final Sticker sticker, final CoreProviderInterface coreProviderInterface) {
        return C22421c.fromCallable(new Callable() { // from class: l.gc8
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f103543a.m33864Xj(message, str, z, z2, sticker, coreProviderInterface);
            }
        }).compose(trd0.m192475e(f20581b3));
    }

    /* JADX INFO: renamed from: Yk */
    public final /* synthetic */ uxj0 m33877Yk(final String str, Double d2) {
        this.f91137Q.f20351U.m128074a(new x20() { // from class: l.u68
            @Override // p153l.x20
            public final void call() {
                this.f177740a.m33865Xk(str);
            }
        });
        return uxj0.f181467a;
    }

    /* JADX INFO: renamed from: Yl */
    public final /* synthetic */ void m33878Yl() {
        if (NullChecker.m82486a(CoreModule.f18272k.f115545m.query("fake_conversation_weaken_conversation"))) {
            this.f91137Q.f20351U.m128074a(new x20() { // from class: l.qx7
                @Override // p153l.x20
                public final void call() {
                    CoreModule.f18264c.f20384f0.m33631Ef("fake_conversation_weaken_conversation");
                }
            });
        }
    }

    /* JADX INFO: renamed from: Ym */
    public final C22421c<uxj0> m33879Ym() {
        return this.f91137Q.scheduled("conversations/get/only", 0, new pcj() { // from class: l.bz7
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f79097a.m33958fj();
            }
        });
    }

    /* JADX INFO: renamed from: Yn */
    public CoreMomentInfo m33880Yn(String str) {
        return (CoreMomentInfo) CoreModule.m30932N().mo61484Oh(str, CoreMomentInfo.JSON_ADAPTER);
    }

    /* JADX INFO: renamed from: Yo */
    public C22421c<Message> m33881Yo(String str) {
        return CoreModule.f18272k.f115535c.m189483s0(str).m208677m().map(new qcj() { // from class: l.s68
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return C4891g.m33141N6((List) obj);
            }
        });
    }

    /* JADX INFO: renamed from: Yp */
    public C22507a<List<IceBreakingQuestion>> m33882Yp() {
        return this.f20589C0;
    }

    /* JADX INFO: renamed from: Ze */
    public C22421c<vg60<Conversation>> m33883Ze() {
        return m33752Oe(m33728Me().m159021j0());
    }

    /* JADX INFO: renamed from: Zf */
    public void m33884Zf(ner nerVar) {
        if (gta.m132210e().m132214d().mo34805b() && nerVar != null && gta.m132210e().m132214d().mo34901p()) {
            this.f20603G2.clear();
            final int i = 40;
            nerVar.duringCreated(CoreModule.f18264c.f20384f0.m33966gf()).take(1).observeOn(fo0.m126432a()).filter(new qcj() { // from class: l.qb8
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(!jyb.m147479J((List) obj));
                }
            }).flatMap(new rb8()).filter(new sb8()).filter(new qcj() { // from class: l.ub8
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(TEnum.equals(((Conversation) obj).status, "default"));
                }
            }).filter(new qcj() { // from class: l.vb8
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(!User.isTeamAccount(((Conversation) obj).otherUser));
                }
            }).take(40).buffer(40).flatMap(new qcj() { // from class: l.wb8
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return this.f188210a.m33647Fi(i, (List) obj);
                }
            }).subscribe(psd0.m173597H(new y20() { // from class: l.xb8
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f193135a.m33660Gi((List) obj);
                }
            }, new y20() { // from class: l.yb8
                @Override // p153l.y20
                public final void call(Object obj) {
                    C4891g.m33122L9((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: Zg */
    public C22421c<uxj0> m33885Zg(Message message) {
        return m33897ah(message, true);
    }

    /* JADX INFO: renamed from: Zh */
    public final /* synthetic */ uxj0 m33886Zh(final String str, final x20 x20Var, Envelope envelope) {
        this.f91137Q.f20351U.m128074a(new x20() { // from class: l.fb8
            @Override // p153l.x20
            public final void call() {
                C4891g.m33065G7(str, x20Var);
            }
        });
        return uxj0.f181467a;
    }

    /* JADX INFO: renamed from: Zi */
    public final /* synthetic */ uxj0 m33887Zi(final Message message, final boolean z) throws Exception {
        this.f91137Q.f20351U.m128074a(new x20() { // from class: l.mb8
            @Override // p153l.x20
            public final void call() {
                this.f135621a.m33875Yi(message, z);
            }
        });
        return uxj0.f181467a;
    }

    /* JADX INFO: renamed from: Zj */
    public final /* synthetic */ void m33888Zj(Message message, List list) {
        final Message messageMo225055clone = message.mo225055clone();
        if (!jyb.m147479J(list) && list.get(0) != null && (list.get(0) instanceof Video) && TEnum.equals(((Media) list.get(0)).status, MediaLocalStatus.preprocessed)) {
            try {
                String[] strArrM120380N = ecj.m120380N(((Media) list.get(0)).url, ((Media) list.get(0)).cover().url, ecj.f93065c, message.f56859id, true);
                ((Media) list.get(0)).url = strArrM120380N[0];
                ((Media) list.get(0)).cover().url = strArrM120380N[1];
            } catch (Exception e) {
                CrashHelper.m82479c(e);
            }
        }
        messageMo225055clone.media = list;
        this.f91137Q.f20351U.m128074a(new x20() { // from class: l.lw7
            @Override // p153l.x20
            public final void call() {
                CoreModule.f18272k.f115535c.updateBy_id(messageMo225055clone);
            }
        });
        if (jyb.m147479J(message.media)) {
            return;
        }
        for (Media media : message.media) {
            if (media.url.startsWith("file") && media.url.endsWith(".copy")) {
                new File(oki.m168038z(media.url)).delete();
            }
        }
    }

    /* JADX INFO: renamed from: Zk */
    public final /* synthetic */ C22421c m33889Zk(final String str, final boolean z) {
        return C22421c.fromCallable(new Callable() { // from class: l.t58
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C4891g.m33153O7(str);
            }
        }).flatMap(new qcj() { // from class: l.u58
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f177584a.m33853Wk(z, str, (pf60) obj);
            }
        }).map(new qcj() { // from class: l.v58
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f182486a.m33877Yk(str, (Double) obj);
            }
        }).compose(C4879a.m32255T2());
    }

    /* JADX INFO: renamed from: Zl */
    public final /* synthetic */ void m33890Zl() {
        this.f91137Q.f20351U.m128074a(new x20() { // from class: l.hy7
            @Override // p153l.x20
            public final void call() {
                this.f112101a.m33824Uf();
            }
        });
    }

    /* JADX INFO: renamed from: Zm, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final C22421c<uxj0> m34072oj(final DbLinks dbLinks) {
        return this.f91137Q.scheduled("conversations/get", 0, new pcj() { // from class: l.xw7
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f196469a.m33982hj(dbLinks);
            }
        });
    }

    /* JADX INFO: renamed from: Zn */
    public C22421c<ChatProfile> m33892Zn() {
        return this.f20586B0.asObservable();
    }

    /* JADX INFO: renamed from: Zo */
    public C22421c<Message> m33893Zo(final String str, final String str2) {
        return psd0.m173625r(CoreModule.f18272k.f115535c.uiGet(str2), this.f20627O2.observeOn(fo0.m126432a()), new rcj() { // from class: l.y08
            @Override // p153l.rcj
            public final Object call(Object obj, Object obj2) {
                return this.f196951a.m33650Fl(str2, (Message) obj, (uxj0) obj2);
            }
        }).doOnNext(new y20() { // from class: l.z08
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f202287a.m33663Gl(str, str2, (Message) obj);
            }
        });
    }

    /* JADX INFO: renamed from: Zp */
    public C22421c<List<Conversation>> m33894Zp() {
        return CoreModule.f18272k.f115545m.f137493X.m180655b().m208677m();
    }

    /* JADX INFO: renamed from: af */
    public pf60<List<Conversation>, List<User>> m33895af(String str) {
        return CoreModule.f18272k.f115545m.m159016g1(str);
    }

    /* JADX INFO: renamed from: ag */
    public C22421c<AudioText> m33896ag(final String str, final String str2) {
        return scheduled("users/me/conversations/" + str + "/" + str2 + "/audioTexts", -1, new pcj() { // from class: l.gt7
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f106386a.m33684Ii(str, str2);
            }
        });
    }

    /* JADX INFO: renamed from: ah */
    public C22421c<uxj0> m33897ah(final Message message, final boolean z) {
        return this.f91137Q.now(C22421c.fromCallable(new Callable() { // from class: l.uu7
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f181045a.m33887Zi(message, z);
            }
        }).compose(C4879a.m32255T2()));
    }

    /* JADX INFO: renamed from: ai */
    public final /* synthetic */ C22421c m33898ai(final String str, final String str2, final String str3, final x20 x20Var) {
        new Message().recalled = Boolean.TRUE;
        return new ti20((pcj<x1d0>) new pcj() { // from class: l.na8
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4879a.f20236P.auth().m209043q(C4879a.m32219K(str, str2, str3)).m209030d().m209028b();
            }
        }, 0).map(new qcj() { // from class: l.pa8
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f151248a.m33886Zh(str3, x20Var, (Envelope) obj);
            }
        }).compose(C4879a.m32255T2());
    }

    /* JADX INFO: renamed from: aj */
    public final /* synthetic */ Boolean m33899aj(String str) throws Exception {
        return Boolean.valueOf(m34185xh(str));
    }

    /* JADX INFO: renamed from: ak */
    public final /* synthetic */ Message m33900ak(Message message, List list) {
        final Message messageMo225055clone = message.mo225055clone();
        messageMo225055clone.media = list;
        this.f91137Q.f20351U.m128074a(new x20() { // from class: l.rx7
            @Override // p153l.x20
            public final void call() {
                CoreModule.f18272k.f115535c.updateBy_id(messageMo225055clone);
            }
        });
        return messageMo225055clone;
    }

    /* JADX INFO: renamed from: al */
    public final /* synthetic */ void m33901al(Envelope envelope) {
        this.f91137Q.m32495w3(envelope, null);
    }

    /* JADX INFO: renamed from: am */
    public final /* synthetic */ void m33902am(String str) {
        Conversation conversationM33738Mo = m33738Mo(str);
        if (NullChecker.m82486a(conversationM33738Mo) && NullChecker.m82486a(conversationM33738Mo.additional) && NullChecker.m82486a(conversationM33738Mo.additional.pinChat) && conversationM33738Mo.level == 90 && conversationM33738Mo.additional.pinChat.expireTime <= pzi0.m174454o()) {
            conversationM33738Mo.level = CoreModule.m30933P().m143409f().mo37024ba(str);
            m34053mq(conversationM33738Mo);
        }
    }

    /* JADX INFO: renamed from: an */
    public C22421c<uxj0> m33903an(final String str) {
        final String str2;
        if (TextUtils.isEmpty(str)) {
            str2 = "/conversations?with=users,friends&search=loveLetterSuggested&filter=default&sort=latestMessageTime&limit=50";
        } else {
            str2 = "/conversations?with=users,friends&search=loveLetterSuggested&filter=default&sort=latestMessageTime&" + str;
        }
        return this.f91137Q.scheduled("loadLoveLetterUsers" + str, 0, new pcj() { // from class: l.wu7
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f190843a.m34020kj(str2, str);
            }
        });
    }

    /* JADX INFO: renamed from: ao */
    public ChatProfile m33904ao() {
        return this.f20586B0.m222761e();
    }

    /* JADX INFO: renamed from: ap */
    public C22421c<uxj0> m33905ap(String str) {
        return m33917bp(str).map(new qcj() { // from class: l.ts7
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return uxj0.f181467a;
            }
        });
    }

    /* JADX INFO: renamed from: aq */
    public C22421c<vg60<Conversation>> m33906aq(long j) {
        return m33752Oe(m33728Me().m159026l1(j));
    }

    /* JADX INFO: renamed from: bf */
    public C22421c<vg60<Conversation>> m33907bf() {
        return m33752Oe(m33728Me().f137484O.m180655b());
    }

    /* JADX INFO: renamed from: bg */
    public boolean m33908bg() {
        return gta.m132210e().m132214d().mo34767Vb() ? this.f20733y0.get().booleanValue() : this.f20730x0;
    }

    /* JADX INFO: renamed from: bh */
    public C22421c<uxj0> m33909bh(String str, MessageType messageType, String str2, y20<Message> y20Var) {
        Message messageM34081pf = m34081pf(str, messageType, str2);
        if (NullChecker.m82486a(y20Var)) {
            y20Var.call(messageM34081pf);
        }
        return m33885Zg(messageM34081pf);
    }

    /* JADX INFO: renamed from: bi */
    public final /* synthetic */ vg60 m33910bi(List list, DbLinks dbLinks) {
        if (dbLinks == null) {
            m33653Fo();
        }
        return m118618Z2(list, dbLinks);
    }

    /* JADX INFO: renamed from: bj */
    public final /* synthetic */ void m33911bj(boolean z, DbLinks dbLinks, Envelope envelope) {
        if (z) {
            uqb0.f180405k0.f184354c.upsert(dbLinks);
            m34146uf(envelope, true);
        }
        m34220zq(((CoreData) envelope.getModuleData(CoreData.class)).conversations);
    }

    /* JADX INFO: renamed from: bk */
    public final /* synthetic */ C22421c m33912bk(Message message, final Sticker sticker, Envelope envelope) {
        final Sticker sticker2;
        if (jyb.m147479J(((CoreData) envelope.getModuleData(CoreData.class)).stickers)) {
            CrashHelper.m82485i(new Exception("return null sticker"), "core_send_sticker", CrashHelper.ReportLevel.p5, 100);
            sticker2 = null;
        } else {
            sticker2 = ((CoreData) envelope.getModuleData(CoreData.class)).stickers.get(0);
        }
        if (!NullChecker.m82486a(sticker2)) {
            return C22421c.just(message);
        }
        final Message messageMo225055clone = message.mo225055clone();
        messageMo225055clone.sticker = sticker2.f56859id;
        this.f91137Q.f20351U.m128074a(new x20() { // from class: l.wt7
            @Override // p153l.x20
            public final void call() {
                C4891g.m33493s8(sticker, sticker2, messageMo225055clone);
            }
        });
        return C22421c.just(messageMo225055clone);
    }

    /* JADX INFO: renamed from: bl */
    public final /* synthetic */ C22421c m33913bl(final String str) {
        return qi20.m176658e(new pcj() { // from class: l.y98
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4891g.m33219U6(str);
            }
        }).doOnNext(new y20() { // from class: l.z98
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f203450a.m33901al((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: bm */
    public final /* synthetic */ void m33914bm(final String str) {
        this.f91137Q.f20351U.m128074a(new x20() { // from class: l.xx7
            @Override // p153l.x20
            public final void call() {
                this.f196609a.m33902am(str);
            }
        });
    }

    /* JADX INFO: renamed from: bn */
    public final C22421c<uxj0> m33915bn(final DbLinks dbLinks) {
        return C22421c.fromCallable(new Callable() { // from class: l.pt7
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f153990a.m34111rj(dbLinks);
            }
        });
    }

    /* JADX INFO: renamed from: bo */
    public boolean m33916bo(User user, Conversation conversation) {
        return m33951eo(user, conversation, "");
    }

    /* JADX INFO: renamed from: bp */
    public C22421c<Data> m33917bp(final String str) {
        return this.f91137Q.scheduled("conversations/" + str + "/refresh", 0, new pcj() { // from class: l.tc8
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f173214a.m33723Ll(str);
            }
        });
    }

    /* JADX INFO: renamed from: bq */
    public List<Conversation> m33918bq() {
        return CoreModule.f18272k.f115545m.query(Filter.AND(Conversation.SUGGESTIONSCORE.NEQ(Double.valueOf(FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE)), Conversation.LOCALEVERHASMESSAGE.m82406F()), Conversation.LATESTTIME.DESC, -1);
    }

    /* JADX INFO: renamed from: cf */
    public C22421c<vg60<Conversation>> m33919cf() {
        return psd0.m173625r(CoreModule.f18272k.f115545m.f137482M.m180655b().m208677m(), C22421c.just(DbLinks.new_()), new rcj() { // from class: l.nb8
            @Override // p153l.rcj
            public final Object call(Object obj, Object obj2) {
                return this.f141076a.m33910bi((List) obj, (DbLinks) obj2);
            }
        });
    }

    /* JADX INFO: renamed from: cg */
    public jxd0 m33920cg() {
        if (this.f20709q0 == null) {
            boolean zMo34720Li = gta.m132210e().m132214d().mo34720Li();
            if (this.f20712r0 == null) {
                this.f20712r0 = new jxd0("conv_cell_weaken_fun_open" + CoreModule.m30929H().userId(), Boolean.valueOf(zMo34720Li));
            }
            Boolean bool = this.f20712r0.get();
            bool.booleanValue();
            this.f20709q0 = new jxd0("conv_cell_weaken_fun_open_new" + CoreModule.m30929H().userId(), bool);
        }
        return this.f20709q0;
    }

    /* JADX INFO: renamed from: ch */
    public C22421c<uxj0> m33921ch(String str, MessageType messageType, y20<Message> y20Var) {
        return m33909bh(str, messageType, "", y20Var);
    }

    /* JADX INFO: renamed from: ci */
    public final /* synthetic */ vg60 m33922ci(List list, DbLinks dbLinks) {
        if (dbLinks == null) {
            m33653Fo();
        }
        return m118618Z2(list, dbLinks);
    }

    /* JADX INFO: renamed from: ck */
    public final /* synthetic */ C22421c m33924ck(final Map map, final Sticker sticker, Message message, final Message message2) {
        List<Media> list = message2.media;
        if (list != null && list.size() > 0) {
            return new i1y(message2.media, false).flatMap(new qcj() { // from class: l.ws7
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return C4891g.m33286a7(message2, (List) obj);
                }
            }).doOnNext(new y20() { // from class: l.xs7
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f196063a.m33888Zj(message2, (List) obj);
                }
            }).last().flatMap(new qcj() { // from class: l.ys7
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    List list2 = (List) obj;
                    return yb5.m214983L(list2, "message", "chat", map, UploadSource.get("chat")).map(new qcj() { // from class: l.px7
                        @Override // p153l.qcj
                        public final Object call(Object obj2) {
                            return C4891g.m33109K7(list2, message, (List) obj2);
                        }
                    });
                }
            }).map(new qcj() { // from class: l.zs7
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return this.f205849a.m33900ak(message2, (List) obj);
                }
            });
        }
        if (sticker == null && (TextUtils.isEmpty(message.sticker) || message.sticker.indexOf("fake_id_") != 0)) {
            return C22421c.just(message2);
        }
        if (sticker == null) {
            sticker = (Sticker) CoreModule.f18272k.f115539g.query(message.sticker);
        }
        return new ti20(new pcj() { // from class: l.at7
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                Sticker sticker2 = sticker;
                return C4879a.f20236P.auth().m209043q(C4879a.m32203G("/stickers")).m209038l(z1d0.create(Network.JSON, sticker2 == null ? "" : sticker2.toJson())).m209028b();
            }
        }).flatMap(new qcj() { // from class: l.ct7
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f83669a.m33912bk(message2, sticker, (Envelope) obj);
            }
        }).delay(TEnum.equals(sticker.source, "sogou") ? 500L : 0L, TimeUnit.MILLISECONDS);
    }

    /* JADX INFO: renamed from: cl */
    public final /* synthetic */ uxj0 m33925cl(Envelope envelope) {
        if (!jyb.m147479J(((CoreData) envelope.getModuleData(CoreData.class)).chatProfiles)) {
            for (ChatProfile chatProfile : ((CoreData) envelope.getModuleData(CoreData.class)).chatProfiles) {
                if (TextUtils.equals(chatProfile.userId, CoreModule.m30929H().userId())) {
                    this.f20586B0.m137019l(chatProfile);
                    break;
                }
            }
        }
        return uxj0.f181467a;
    }

    /* JADX INFO: renamed from: cm */
    public final /* synthetic */ void m33926cm(String str) {
        Conversation conversationM33738Mo = m33738Mo(str);
        if (NullChecker.m82486a(conversationM33738Mo) && NullChecker.m82486a(conversationM33738Mo.additional) && NullChecker.m82486a(conversationM33738Mo.additional.tag) && conversationM33738Mo.level == 55 && conversationM33738Mo.additional.tag.expireTime * 1000 <= pzi0.m174454o()) {
            conversationM33738Mo.level = 0;
            m34053mq(conversationM33738Mo);
        }
    }

    /* JADX INFO: renamed from: cn */
    public C22421c<uxj0> m33927cn(final String str, final List<String> list, final String str2, final String str3, final int i) {
        clearRequests("loadNewMatchChat", 0);
        return this.f91137Q.scheduled("loadNewMatchChat", 0, new pcj() { // from class: l.tb8
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f172839a.m34150uj(str, str2, str3, list, i);
            }
        });
    }

    /* JADX INFO: renamed from: co */
    public boolean m33928co(User user, Conversation conversation) {
        return m33951eo(user, conversation, "birthday");
    }

    /* JADX INFO: renamed from: cp */
    public void m33929cp() {
    }

    /* JADX INFO: renamed from: cq */
    public C22421c<AudioText> m33930cq(final String str, final String str2) {
        return scheduled("users/me/conversations/" + str + "/" + str2 + "/audioTexts", -1, new pcj() { // from class: l.yu7
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f201592a.m34216zm(str, str2);
            }
        });
    }

    /* JADX INFO: renamed from: df */
    public C22421c<vg60<Conversation>> m33931df() {
        return psd0.m173625r(CoreModule.f18272k.f115545m.f137494Y.m180655b().m208677m(), C22421c.just(DbLinks.new_()), new rcj() { // from class: l.ic8
            @Override // p153l.rcj
            public final Object call(Object obj, Object obj2) {
                return this.f114288a.m33922ci((List) obj, (DbLinks) obj2);
            }
        });
    }

    /* JADX INFO: renamed from: dg */
    public List<Conversation> m33932dg(boolean z) {
        List<Conversation> listM222761e = z ? this.f20612J2.m222761e() : this.f20615K2.m222761e();
        return listM222761e == null ? new ArrayList() : listM222761e;
    }

    /* JADX INFO: renamed from: dh */
    public void m33933dh(String str, MessageType messageType) {
        m33921ch(str, messageType, null);
    }

    /* JADX INFO: renamed from: di */
    public final /* synthetic */ void m33934di(Conversation conversation, String str) {
        m33613Cn(conversation.f56859id, str);
    }

    /* JADX INFO: renamed from: dk */
    public final /* synthetic */ void m33936dk(Message message, AtomicBoolean atomicBoolean) {
        if (message._id != 0) {
            atomicBoolean.set(true);
            CoreModule.f18272k.f115535c.delete(message._id);
        }
        if (TextUtils.isEmpty(message.cid)) {
            return;
        }
        Conversation conversationM33738Mo = m33738Mo(message.cid);
        if (CoreModule.f18272k.f115535c.m189461W(message.cid).m208669e() == 0 && NullChecker.m82486a(conversationM33738Mo) && !conversationM33738Mo.isForceDropDownCell()) {
            conversationM33738Mo.localHasMessage = false;
            if (TextUtils.isEmpty(conversationM33738Mo.clearedUntil) || "0".equals(conversationM33738Mo.clearedUntil)) {
                conversationM33738Mo.localEverHasMessage = false;
            }
            CoreModule.f18272k.f115545m.upsert(conversationM33738Mo);
        }
    }

    /* JADX INFO: renamed from: dl */
    public final /* synthetic */ C22421c m33937dl(final JSONObject jSONObject) {
        return NullChecker.m82486a(jSONObject) ? qi20.m176654a(new pcj() { // from class: l.la8
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4879a.f20236P.auth().m209043q(C4879a.m32216J0("/chat-profiles") + "?method=patch").m209038l(z1d0.create(Network.JSON, jSONObject.toString())).m209028b();
            }
        }).map(new qcj() { // from class: l.ma8
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f135488a.m33925cl((Envelope) obj);
            }
        }) : C22421c.empty();
    }

    /* JADX INFO: renamed from: dm */
    public final /* synthetic */ void m33938dm(final String str) {
        this.f91137Q.f20351U.m128074a(new x20() { // from class: l.ou7
            @Override // p153l.x20
            public final void call() {
                this.f149065a.m33926cm(str);
            }
        });
    }

    /* JADX INFO: renamed from: dn, reason: merged with bridge method [inline-methods] */
    public C22421c<uxj0> m34213zj(final String str) {
        return this.f91137Q.scheduled("group_message_pre_load/" + str, 0, new pcj() { // from class: l.ft7
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f100719a.m34175wj(str);
            }
        });
    }

    /* JADX INFO: renamed from: dp */
    public void m33940dp(Runnable runnable) {
        m33952ep(runnable, true);
    }

    /* JADX INFO: renamed from: dq */
    public void m33941dq(double d2) {
        this.f20738z2.m137019l(Double.valueOf(d2));
    }

    /* JADX INFO: renamed from: ef */
    public C22421c<vg60<Conversation>> m33942ef() {
        return m33752Oe(m33728Me().f137481L.m180655b());
    }

    /* JADX INFO: renamed from: eg */
    public long m33943eg() {
        return this.f91137Q.f20384f0.f20689j1.get().longValue();
    }

    /* JADX INFO: renamed from: eh */
    public void m33944eh(Message message) {
        m33956fh(message, true);
    }

    /* JADX INFO: renamed from: ei */
    public final /* synthetic */ void m33945ei(final String str) {
        this.f91137Q.f20351U.m128074a(new x20() { // from class: l.e08
            @Override // p153l.x20
            public final void call() {
                C4891g.m33263Y6(str);
            }
        });
    }

    /* JADX INFO: renamed from: ej */
    public final /* synthetic */ uxj0 m33946ej(final DbLinks dbLinks, final boolean z) throws Exception {
        final String strM32374y = C4879a.m32374y(dbLinks.links.next);
        final Envelope envelopeM165964c = new ti20(new pcj() { // from class: l.au7
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4879a.f20236P.auth().m209043q(strM32374y).m209032f().m209028b();
            }
        }).toBlocking().m165964c(null);
        CoreModule.f18264c.f20390h0.m107384m3(envelopeM165964c);
        Links links = dbLinks.links;
        if (links.previous == null) {
            links.previous = envelopeM165964c.pagination.links.previous;
        }
        links.next = envelopeM165964c.pagination.links.next;
        if (gta.m132210e().m132214d().mo34872ka() && z) {
            zg6.m219593d(dbLinks, envelopeM165964c);
        } else {
            if (zg6.m219595f()) {
                zg6.m219591b(envelopeM165964c, strM32374y, true);
            }
            this.f91137Q.m32495w3(envelopeM165964c, new x20() { // from class: l.bu7
                @Override // p153l.x20
                public final void call() {
                    this.f78432a.m33911bj(z, dbLinks, envelopeM165964c);
                }
            });
        }
        this.f20726v2.put(Long.valueOf(uqb0.f180376H.guessedCurrentServerTime()));
        if (dbLinks.links.next != null && z) {
            if (gta.m132210e().m132214d().mo34872ka()) {
                l51.m152888H(CoreModule.f18263b, new Runnable() { // from class: l.cu7
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f83819a.m33923cj(dbLinks);
                    }
                }, Math.max(zg6.m219597h(), f20580a3));
                int i = f20580a3;
                if (i > 0) {
                    f20580a3 = i + WebRtcAudioTrack.AudioTrackErrorCode.AUDIO_TRACK_INIT_MINBUFFER_ERROR;
                }
            } else {
                l51.m152888H(CoreModule.f18263b, new Runnable() { // from class: l.du7
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f90757a.m33935dj(dbLinks);
                    }
                }, f20580a3);
                int i2 = f20580a3;
                if (i2 > 100) {
                    f20580a3 = i2 + WebRtcAudioTrack.AudioTrackErrorCode.AUDIO_TRACK_INIT_MINBUFFER_ERROR;
                }
                if (f20580a3 < 100) {
                    f20580a3 = 100;
                }
            }
        }
        this.f20723u2.put(Integer.valueOf(uqb0.f180415t));
        return uxj0.f181467a;
    }

    /* JADX INFO: renamed from: ek */
    public final /* synthetic */ void m33947ek(Message message, TantanException.Client.TantanForbidden tantanForbidden) {
        if (TextUtils.isEmpty(message.cid)) {
            return;
        }
        tu2.m192703a("TantanForbiddenConversation", "messageid:" + message._id + " errorCode:" + tantanForbidden.code);
        m33731Mh(message.cid);
    }

    /* JADX INFO: renamed from: el */
    public final /* synthetic */ C22421c m33948el(final List list) {
        return C22421c.fromCallable(new Callable() { // from class: l.f88
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C4891g.m33462pa(list);
            }
        }).flatMap(new qcj() { // from class: l.g88
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f102649a.m33937dl((JSONObject) obj);
            }
        });
    }

    /* JADX INFO: renamed from: em */
    public final /* synthetic */ void m33949em(final Conversation conversation, final boolean z) {
        this.f91137Q.f20351U.m128074a(new x20() { // from class: l.eb8
            @Override // p153l.x20
            public final void call() {
                C4891g.m33331e4(conversation, z);
            }
        });
    }

    /* JADX INFO: renamed from: en, reason: merged with bridge method [inline-methods] */
    public C22421c<uxj0> m34163vj(final String str, final String str2) {
        C4883c c4883c = this.f91137Q;
        if (str == null) {
            return c4883c.just();
        }
        return c4883c.scheduled("conversations/" + str2 + "/previous", 0, new pcj() { // from class: l.jz7
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f123234a.m33596Bj(str2, str);
            }
        });
    }

    /* JADX INFO: renamed from: eo */
    public final boolean m33951eo(User user, Conversation conversation, String str) {
        ConversationAdditional conversationAdditional;
        ConversationAdditionalTag conversationAdditionalTag;
        return (!gta.m132210e().m132214d().mo34893o() || conversation == null || user == null || this.f91137Q.f20381e0.m116443Aa(user) || user.isBanned() || user.isBannedNew() || user.isJailed() || user.inactivated || user.isFakeUser() || !TEnum.equals(conversation.status, "default") || this.f20693k2.size() >= gta.m132210e().m132214d().mo34751Ro() || (conversationAdditional = conversation.additional) == null || (conversationAdditionalTag = conversationAdditional.tag) == null || conversationAdditionalTag.type == null || (TextUtils.isEmpty(str) && TEnum.equals(conversation.additional.tag.type, "unknown_")) || ((!TextUtils.isEmpty(str) && !TEnum.equals(conversation.additional.tag.type, str)) || (conversation.additional.tag.expireTime > 0 && pzi0.m174454o() > conversation.additional.tag.expireTime * 1000))) ? false : true;
    }

    /* JADX INFO: renamed from: ep */
    public void m33952ep(final Runnable runnable, final boolean z) {
        User userM116600p9 = CoreModule.f18264c.f20381e0.m116600p9();
        if (userM116600p9 != null && !userM116600p9.isFemale() && (!z || !this.f20601G0.get().booleanValue())) {
            scheduled("conversation/countdown/like/refresh", 0, new pcj() { // from class: l.sw7
                @Override // p153l.pcj, java.util.concurrent.Callable
                public final Object call() {
                    return qi20.m176654a(new pcj() { // from class: l.y18
                        @Override // p153l.pcj, java.util.concurrent.Callable
                        public final Object call() {
                            return C4879a.f20236P.auth().m209043q(C4879a.m32216J0("/countdown-likes?filter=latest")).m209032f().m209028b();
                        }
                    });
                }
            }).subscribe(new y20() { // from class: l.tw7
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f176379a.m33735Ml(runnable, z, (Envelope) obj);
                }
            }, new y20() { // from class: l.uw7
                @Override // p153l.y20
                public final void call(Object obj) {
                    C4891g.m33409kc((Throwable) obj);
                }
            });
        } else if (NullChecker.m82486a(runnable)) {
            runnable.run();
        }
    }

    /* JADX INFO: renamed from: eq */
    public C22421c<List<Conversation>> m33953eq() {
        return CoreModule.f18272k.f115545m.m159028m1(100).m208677m();
    }

    /* JADX INFO: renamed from: ff */
    public C22421c<List<Conversation>> m33954ff() {
        return m33728Me().f137486Q.m180655b().m208677m();
    }

    /* JADX INFO: renamed from: fg */
    public C22421c<uxj0> m33955fg() {
        final String strM211111m = xi5.m211111m("search=exposure&with=users");
        return this.f91137Q.scheduled("conversations/get/exposure", 0, new pcj() { // from class: l.yt7
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f201490a.m33720Li(strM211111m);
            }
        });
    }

    /* JADX INFO: renamed from: fh */
    public final void m33956fh(Message message, boolean z) {
        m33968gh(message, z, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);
    }

    /* JADX INFO: renamed from: fi */
    public final /* synthetic */ void m33957fi() {
        this.f91137Q.f20351U.m128074a(new x20() { // from class: l.ob8
            @Override // p153l.x20
            public final void call() {
                CoreModule.f18264c.f20384f0.m33631Ef("fake_conversation_surprise_gift_box");
            }
        });
    }

    /* JADX INFO: renamed from: fj */
    public final /* synthetic */ C22421c m33958fj() {
        DbLinks dbLinksNew_ = DbLinks.new_();
        dbLinksNew_.f56859id = SchemeKey.conversations;
        dbLinksNew_.links.next = C4879a.f20228H;
        return m33867Xm(dbLinksNew_, false).compose(psd0.m173592C());
    }

    /* JADX WARN: Code duplicated, block: B:88:0x01b6  */
    /* JADX INFO: renamed from: fk */
    public final /* synthetic */ void m33959fk(String str, final Message message, final CoreProviderInterface coreProviderInterface, boolean z, String str2, long j, final Throwable th) {
        String str3;
        String str4;
        int i;
        final boolean z2 = false;
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.f20649W.m137019l(th);
        boolean z3 = th instanceof TantanException.Client.TantanForbidden;
        if (z3 && ((TantanException.Client.TantanForbidden) th).code == 40344) {
            ChatHeatActionData chatHeatActionData = new ChatHeatActionData(str, ChatHeatActionData.ExclusiveAction.CHECK, false, new pf60[0]);
            chatHeatActionData.setThrowable(th);
            CoreModule.f18264c.f20328M1.f82694S.m137019l(chatHeatActionData);
            m34158ve(message, 0, null);
            return;
        }
        if (z3 && ((TantanException.Client.TantanForbidden) th).code == 40338) {
            m34158ve(message, 6, null);
            this.f91137Q.f20313H1.f97064R.m137019l(message);
            return;
        }
        if (z3 && ((TantanException.Client.TantanForbidden) th).code == 40337) {
            m34158ve(message, 5, null);
            return;
        }
        if (z3 && ((TantanException.Client.TantanForbidden) th).code == 40342) {
            m34158ve(message, 7, new y20() { // from class: l.xr7
                @Override // p153l.y20
                public final void call(Object obj) {
                    ((Message) obj).localExtraInfo = ((TantanException.Client.TantanForbidden) th).message;
                }
            });
            return;
        }
        if (z3 && ((TantanException.Client.TantanForbidden) th).code == 40345) {
            m34158ve(message, 9, new y20() { // from class: l.zr7
                @Override // p153l.y20
                public final void call(Object obj) {
                    ((Message) obj).localExtraInfo = ((TantanException.Client.TantanForbidden) th).message;
                }
            });
            return;
        }
        l51.m152893M(new Runnable() { // from class: l.as7
            @Override // java.lang.Runnable
            public final void run() {
                coreProviderInterface.mo34814d(th);
            }
        });
        boolean zM33754Og = true;
        if (!(th instanceof TantanException.Client.CoreService)) {
            if (z3) {
                final TantanException.Client.TantanForbidden tantanForbidden = (TantanException.Client.TantanForbidden) th;
                str3 = "" + tantanForbidden.code;
                if (tantanForbidden.code == 40346) {
                    final String str5 = tantanForbidden.message;
                    if (!TextUtils.isEmpty(str5)) {
                        l51.m152893M(new Runnable() { // from class: l.cs7
                            @Override // java.lang.Runnable
                            public final void run() {
                                r1j0.m179420g(str5);
                            }
                        });
                    }
                    this.f91137Q.f20351U.m128074a(new x20() { // from class: l.ds7
                        @Override // p153l.x20
                        public final void call() {
                            CoreModule.f18272k.f115535c.delete(message._id);
                        }
                    });
                } else if (tantanForbidden.isBlocked()) {
                    m34207yq(message._id, message.cid);
                } else if (coreProviderInterface.mo34755Te(tantanForbidden) || coreProviderInterface.mo34713Ji(tantanForbidden) || coreProviderInterface.mo34656Aa(tantanForbidden) || tantanForbidden.isIdCardAuthing() || tantanForbidden.isOtherNotVerify() || tantanForbidden.isRejectedContact() || tantanForbidden.isLetterNotEnough() || coreProviderInterface.mo34766V8(tantanForbidden)) {
                    this.f91137Q.f20351U.m128074a(new x20() { // from class: l.es7
                        @Override // p153l.x20
                        public final void call() {
                            C4891g.m33397jb(message, atomicBoolean);
                        }
                    });
                    if (coreProviderInterface.mo34713Ji(tantanForbidden)) {
                        this.f91137Q.f20366Z.f20885T.m159280q();
                    }
                    if (coreProviderInterface.mo34766V8(tantanForbidden)) {
                        this.f91137Q.f20388g1.m157239d3(message.cid);
                    }
                } else {
                    int i2 = tantanForbidden.code;
                    if (i2 == 40325 || i2 == 40339) {
                        String string = CoreModule.f18263b.getString(R$string.f56626o);
                        int i3 = tantanForbidden.code;
                        if (i3 == 40339) {
                            string = tantanForbidden.message;
                        }
                        zM33754Og = m33754Og(str, string, z, i3);
                        str4 = str3;
                    } else {
                        this.f91137Q.f20351U.m128074a(new x20() { // from class: l.gs7
                            @Override // p153l.x20
                            public final void call() {
                                this.f106237a.m33947ek(message, tantanForbidden);
                            }
                        });
                    }
                }
                str4 = str3;
                z2 = true;
            } else {
                str3 = "unknown";
            }
            if (!zM33754Og) {
                this.f91137Q.f20351U.m128074a(new x20() { // from class: l.hs7
                    @Override // p153l.x20
                    public final void call() {
                        C4891g.m33357g6(message, z2);
                    }
                });
            }
            if (TEnum.equals(message.messageType, "contact_info_rejection") && !atomicBoolean.get()) {
                this.f91137Q.f20351U.m128074a(new x20() { // from class: l.is7
                    @Override // p153l.x20
                    public final void call() {
                        C4891g.m33038Dd(message);
                    }
                });
            }
            if (TEnum.equals(message.messageType, "tickle") && message._id != 0) {
                this.f91137Q.f20351U.m128074a(new x20() { // from class: l.yr7
                    @Override // p153l.x20
                    public final void call() {
                        CoreModule.f18272k.f115535c.delete(message._id);
                    }
                });
            }
            m600.m157134g(message, str2, str4, str, 0, SystemClock.elapsedRealtime() - j);
        }
        TantanException.Client.CoreService coreService = (TantanException.Client.CoreService) th;
        str3 = "" + coreService.code;
        int i4 = coreService.code;
        if (i4 == 40042 || coreProviderInterface.mo34788Xl(i4) || (i = coreService.code) == 40041 || i == 40044 || i == 40045) {
            this.f91137Q.f20351U.m128074a(new x20() { // from class: l.bs7
                @Override // p153l.x20
                public final void call() {
                    this.f78127a.m33936dk(message, atomicBoolean);
                }
            });
            z2 = true;
        }
        zM33754Og = z2;
        z2 = true;
        str4 = str3;
        if (!zM33754Og) {
            this.f91137Q.f20351U.m128074a(new x20() { // from class: l.hs7
                @Override // p153l.x20
                public final void call() {
                    C4891g.m33357g6(message, z2);
                }
            });
        }
        if (TEnum.equals(message.messageType, "contact_info_rejection")) {
            this.f91137Q.f20351U.m128074a(new x20() { // from class: l.is7
                @Override // p153l.x20
                public final void call() {
                    C4891g.m33038Dd(message);
                }
            });
        }
        if (TEnum.equals(message.messageType, "tickle")) {
            this.f91137Q.f20351U.m128074a(new x20() { // from class: l.yr7
                @Override // p153l.x20
                public final void call() {
                    CoreModule.f18272k.f115535c.delete(message._id);
                }
            });
        }
        m600.m157134g(message, str2, str4, str, 0, SystemClock.elapsedRealtime() - j);
    }

    /* JADX INFO: renamed from: fl */
    public final /* synthetic */ uxj0 m33960fl(Message message, Envelope envelope) {
        if (!jyb.m147479J(((CoreData) envelope.getModuleData(CoreData.class)).messages) && TextUtils.equals(((CoreData) envelope.getModuleData(CoreData.class)).messages.get(0).f56859id, message.f56859id)) {
            ((CoreData) envelope.getModuleData(CoreData.class)).messages.get(0).cid = message.cid;
        }
        this.f91137Q.m32495w3(envelope, null);
        return uxj0.f181467a;
    }

    /* JADX INFO: renamed from: fm */
    public final /* synthetic */ C22421c m33961fm(Boolean bool) {
        return this.f91137Q.f20381e0.m116470H9();
    }

    /* JADX INFO: renamed from: fn */
    public C22421c<Links> m33962fn(final Links links) {
        return this.f91137Q.scheduled("conversation_delete_list", 0, new pcj() { // from class: l.zb8
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f203633a.m33635Ej(links);
            }
        });
    }

    /* JADX INFO: renamed from: fo */
    public C22421c<vg60<Conversation>> m33963fo() {
        return m33752Oe(m33728Me().f137504v.m180655b());
    }

    /* JADX INFO: renamed from: fp */
    public void m33964fp() {
        scheduled("users/me/chat-profiles", 0, new pcj() { // from class: l.qu7
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f159529a.m33759Ol();
            }
        });
    }

    /* JADX INFO: renamed from: fq */
    public List<Conversation> m33965fq() {
        Filter<Conversation> filterNEQ = Filter.TRUE;
        if (gta.m132210e().m132214d().mo34811c()) {
            filterNEQ = Conversation.CONVTYPE.NEQ("quickchat");
        }
        Filter<Conversation> filter = filterNEQ;
        mm6 mm6Var = CoreModule.f18272k.f115545m;
        Filter<Conversation> filterNOT_STARTS_WITH = Conversation.f21114ID.NOT_STARTS_WITH("fake_conversation");
        Filter<Conversation> filterM82406F = Conversation.READ.m82406F();
        TEnumColumn<Conversation, ConversationStatus> tEnumColumn = Conversation.STATUS;
        return mm6Var.query(Filter.AND(filterNOT_STARTS_WITH, filterM82406F, Filter.AND(tEnumColumn.NEQ("dismissed"), tEnumColumn.NEQ(ConversationStatus.local_fake), tEnumColumn.NEQ("removed"), tEnumColumn.NEQ(ConversationStatus.invisible), tEnumColumn.NEQ("deleted")), CoreModule.f18272k.f115545m.f137503u.m180655b(), Conversation.LOCALEVERHASMESSAGE.m82406F(), filter), Conversation.LATESTTIME.DESC, gta.m132210e().m132214d().mo34722Mg());
    }

    /* JADX INFO: renamed from: gf */
    public C22421c<List<Conversation>> m33966gf() {
        return m33728Me().f137480K.m180655b().m208677m();
    }

    /* JADX INFO: renamed from: gg */
    public C22421c<vg60<Conversation>> m33967gg(final String str) {
        return this.f91137Q.scheduled("getFilterConversationList/" + str, 0, new pcj() { // from class: l.d08
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f84536a.m33744Ni(str);
            }
        });
    }

    /* JADX INFO: renamed from: gh */
    public final void m33968gh(Message message, boolean z, double d2) {
        if (z) {
            List<T> listM208674j = CoreModule.f18272k.f115535c.m189461W(message.cid).m208674j();
            if (!jyb.m147479J(listM208674j)) {
                double d3 = ((Message) listM208674j.get(0)).createdTime + 1.0d;
                message.createdTime = d3;
                if (d2 > d3) {
                    double d4 = d2 + 10.0d;
                    message.createdTime = d4;
                    message.localCreatedTime = (long) d4;
                }
            }
        }
        CoreModule.f18272k.f115535c.upsert(message);
    }

    /* JADX INFO: renamed from: gi */
    public final /* synthetic */ void m33969gi() {
        this.f91137Q.f20351U.m128074a(new x20() { // from class: l.o08
            @Override // p153l.x20
            public final void call() {
                CoreModule.f18272k.f115545m.delete(Conversation.f21114ID.STARTS_WITH("fake_conversation_anim"));
            }
        });
    }

    /* JADX INFO: renamed from: gj */
    public final /* synthetic */ C22421c m33970gj(DbLinks dbLinks) {
        if (dbLinks == null || TextUtils.isEmpty(dbLinks.links.previous)) {
            DbLinks dbLinksNew_ = DbLinks.new_();
            dbLinksNew_.f56859id = SchemeKey.conversations;
            dbLinksNew_.links.next = C4879a.f20228H;
            return m33855Wm(dbLinksNew_);
        }
        if (dbLinks.links.next != null) {
            return m33855Wm(dbLinks);
        }
        if (this.f20726v2.get().longValue() != 0 && tzi0.m193670h(uqb0.f180376H.guessedCurrentServerTime(), this.f20726v2.get().longValue(), 60)) {
            this.f91137Q.f20351U.m128074a(new x20() { // from class: l.zv7
                @Override // p153l.x20
                public final void call() {
                    C4891g.m33262Y5();
                }
            });
            DbLinks dbLinksNew_2 = DbLinks.new_();
            dbLinksNew_2.f56859id = SchemeKey.conversations;
            dbLinksNew_2.links.next = C4879a.f20228H;
            return m33855Wm(dbLinksNew_2);
        }
        if (!m33616Cq()) {
            return m33915bn(dbLinks);
        }
        DbLinks dbLinksNew_3 = DbLinks.new_();
        dbLinksNew_3.f56859id = SchemeKey.conversations;
        dbLinksNew_3.links.next = C4879a.f20228H;
        return m33855Wm(dbLinksNew_3);
    }

    /* JADX INFO: renamed from: gk */
    public final /* synthetic */ void m33971gk(Message message, String str, Envelope envelope, boolean z, boolean z2, boolean z3) {
        message.cid = str;
        CoreModule.f18272k.f115535c.updateBy_id(message);
        ((CoreData) envelope.getModuleData(CoreData.class)).messages.clear();
        if (!CoreModule.m30929H().userId().equals(str) && z && m34185xh(str)) {
            Conversation conversationM33738Mo = m33738Mo(message.cid);
            if (conversationM33738Mo == null && z2) {
                conversationM33738Mo = m33786Qo(message);
            }
            if (NullChecker.m82486a(conversationM33738Mo)) {
                conversationM33738Mo.latestTime = message.createdTime;
                CoreModule.f18272k.f115545m.upsert(conversationM33738Mo);
            }
        }
        if (z3 && !TextUtils.isEmpty(message.moment)) {
            CoreModule.m30932N().mo61453D8(message.moment, message.f56859id);
        }
        if (TEnum.equals(message.messageType, MessageType.ice_breaking)) {
            Conversation conversationM33738Mo2 = m33738Mo(str);
            if (NullChecker.m82486a(conversationM33738Mo2) && NullChecker.m82486a(conversationM33738Mo2.property)) {
                ConversationIceBreaking conversationIceBreaking = conversationM33738Mo2.property.iceBreaking;
                if (conversationIceBreaking == null || TextUtils.isEmpty(conversationIceBreaking.answeredMsgId)) {
                    conversationM33738Mo2.property.iceBreaking = ConversationIceBreaking.new_();
                    conversationM33738Mo2.property.iceBreaking.answeredMsgId = message.f56859id;
                    CoreModule.f18272k.f115545m.upsert(conversationM33738Mo2);
                }
            }
        }
    }

    /* JADX INFO: renamed from: gl */
    public final /* synthetic */ C22421c m33972gl(final Message message) {
        return new ti20((pcj<x1d0>) new pcj() { // from class: l.bx7
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                Message message2 = message;
                return C4879a.f20236P.auth().m209043q(C4879a.m32245R0(message2.hostId, message2.f56859id) + "&action=readDetail").m209037k(z1d0.create(Network.JSON, message2.toJson())).m209028b();
            }
        }, 0).map(new qcj() { // from class: l.cx7
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f84179a.m33960fl(message, (Envelope) obj);
            }
        }).compose(C4879a.m32255T2());
    }

    /* JADX INFO: renamed from: gm */
    public final /* synthetic */ Boolean m33973gm(uxj0 uxj0Var) {
        if (!NullChecker.m82486a(this.f91137Q.m32487o3().growth)) {
            return Boolean.FALSE;
        }
        if (this.f91137Q.m32487o3().growth.remaining > 0) {
            return Boolean.TRUE;
        }
        l51.m152887G(new Runnable() { // from class: l.wq7
            @Override // java.lang.Runnable
            public final void run() {
                o1j0.m165651y("您今日已达到分享用户次数的上线啦~明天再来吧");
            }
        });
        return Boolean.FALSE;
    }

    /* JADX INFO: renamed from: gn */
    public void m33974gn() {
        if (zg6.m219595f() && pzi0.m174454o() >= this.f91137Q.f20381e0.f89351w1.get().longValue()) {
            CoreModule.f18264c.f20384f0.m34076on().map(new qcj() { // from class: l.gx7
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(((vg60) obj).m201221c());
                }
            }).filter(new qcj() { // from class: l.hx7
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(!((Boolean) obj).booleanValue());
                }
            }).first().observeOn(Schedulers.m222739io()).map(new qcj() { // from class: l.jx7
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return this.f123008a.m33648Fj((Boolean) obj);
                }
            }).subscribe(psd0.m173597H(new y20() { // from class: l.kx7
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f129171a.m33661Gj((bkj0) obj);
                }
            }, new y20() { // from class: l.lx7
                @Override // p153l.y20
                public final void call(Object obj) {
                    C4891g.m33415l7((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: go */
    public void m33975go() {
        this.f20606H2.m137019l(uxj0.f181467a);
    }

    /* JADX INFO: renamed from: gp */
    public C22421c<uxj0> m33976gp(final String str) {
        return this.f91137Q.scheduled("refreshRecentMessages_" + str, 0, new pcj() { // from class: l.v38
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f182169a.m33783Ql(str);
            }
        });
    }

    /* JADX INFO: renamed from: gq */
    public void m33977gq() {
        this.f20585A2.unsubscribe();
    }

    /* JADX INFO: renamed from: hf */
    public C22421c<vg60<Conversation>> m33978hf() {
        return m33752Oe(m33728Me().f137475F);
    }

    /* JADX INFO: renamed from: hg */
    public double m33979hg() {
        long timeInMillis;
        if (gta.m132210e().m132214d().mo34767Vb()) {
            timeInMillis = this.f20688j0.get().longValue();
        } else {
            long j = this.f20685i0;
            if (j >= 1) {
                return j;
            }
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(pzi0.m174454o());
            calendar.set(calendar.get(1), calendar.get(2), calendar.get(5), 0, 0, 0);
            timeInMillis = calendar.getTimeInMillis() - (((long) (gta.m132210e().m132214d().mo34678Dt() - 1)) * 86400000);
        }
        return timeInMillis;
    }

    /* JADX INFO: renamed from: hh */
    public void m33980hh(String str) {
        m33933dh(str, MessageType.get(MessageType.local_pic_cert_guide));
    }

    /* JADX INFO: renamed from: hj */
    public final /* synthetic */ C22421c m33982hj(DbLinks dbLinks) {
        if (dbLinks == null) {
            return C22421c.fromCallable(new Callable() { // from class: l.ar7
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return C4891g.m33307c4();
                }
            }).flatMap(new qcj() { // from class: l.br7
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return this.f77988a.m33970gj((DbLinks) obj);
                }
            }).compose(psd0.m173592C());
        }
        return dbLinks.links.next != null ? m33855Wm(dbLinks).compose(psd0.m173592C()) : m33915bn(dbLinks).compose(psd0.m173592C());
    }

    /* JADX INFO: renamed from: hk */
    public final /* synthetic */ Message m33983hk(Message message, final String str, final boolean z, final boolean z2, final boolean z3, final Envelope envelope) {
        if (jyb.m147479J(((CoreData) envelope.getModuleData(CoreData.class)).messages)) {
            CrashHelper.m82485i(new Exception("return null messages"), "core_post_message", CrashHelper.ReportLevel.p5, 100);
            return message;
        }
        final Message message2 = ((CoreData) envelope.getModuleData(CoreData.class)).messages.get(0);
        message2.localCreatedTime = message.localCreatedTime;
        message2._id = message._id;
        message2.cid = str;
        if (z) {
            message2.messageType = MessageType.get("moment_comment");
        }
        String strM217939u = yy6.m217939u(message2.value);
        if (!TextUtils.isEmpty(strM217939u)) {
            message2.localAnimationKey = strM217939u;
        }
        this.f91137Q.m32495w3(envelope, new x20() { // from class: l.gz7
            @Override // p153l.x20
            public final void call() {
                this.f107169a.m33971gk(message2, str, envelope, z2, z3, z);
            }
        });
        if (!z && !User.isTeamAccount(str)) {
            gta.m132210e().m132214d().mo34784Xb(1);
            if (gta.m132210e().m132214d().mo34733O()) {
                this.f20652X.m137019l(message2);
            }
            CoreModule.f18264c.f20397j1.m31131j(message2);
        }
        this.f20655Y.m137019l(message2);
        return message2;
    }

    /* JADX INFO: renamed from: hl */
    public final /* synthetic */ void m33984hl(final List list, final Envelope envelope) {
        this.f91137Q.f20351U.m128074a(new x20() { // from class: l.w78
            @Override // p153l.x20
            public final void call() {
                C4891g.m33412l4(envelope, list);
            }
        });
    }

    /* JADX INFO: renamed from: hm */
    public final /* synthetic */ C22421c m33985hm(String str, String str2, boolean z, uxj0 uxj0Var) {
        return m34172wg(str, str2, z);
    }

    /* JADX INFO: renamed from: hn, reason: merged with bridge method [inline-methods] */
    public final void m33672Hi(String str, AudioText audioText) {
        if (NullChecker.m82486a(audioText)) {
            final Message messageQuery = CoreModule.f18272k.f115535c.query(str);
            if (NullChecker.m82486a(messageQuery)) {
                messageQuery.localAudioText = audioText;
                this.f91137Q.f20351U.m128074a(new x20() { // from class: l.u38
                    @Override // p153l.x20
                    public final void call() {
                        CoreModule.f18272k.f115535c.upsert(messageQuery);
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: ho */
    public void m33987ho(boolean z, List<Conversation> list) {
        if (z) {
            this.f20612J2.m137019l(list);
        } else {
            this.f20615K2.m137019l(list);
        }
    }

    /* JADX INFO: renamed from: hp */
    public void m33988hp(boolean z) {
        this.f91137Q.f20384f0.f20598F0.m137019l(Boolean.valueOf(z));
    }

    /* JADX INFO: renamed from: hq */
    public List<Conversation> m33989hq() {
        return CoreModule.f18272k.f115545m.m159030n1();
    }

    /* JADX INFO: renamed from: ie */
    public int m33990ie(List<String> list) {
        return CoreModule.f18272k.f115545m.m159023k0(list);
    }

    /* JADX INFO: renamed from: ig */
    public double m33991ig() {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(pzi0.m174454o());
        calendar.set(calendar.get(1), calendar.get(2), calendar.get(5), 0, 0, 0);
        return calendar.getTimeInMillis() - (((long) (gta.m132210e().m132214d().mo34678Dt() - 1)) * 86400000);
    }

    /* JADX INFO: renamed from: ih */
    public void m33992ih(String str, String str2) {
        m33885Zg(m34081pf(str, MessageType.get(MessageType.local_ux_questionnaire_tip), str2));
    }

    /* JADX INFO: renamed from: ii */
    public final /* synthetic */ uxj0 m33993ii(final String str) throws Exception {
        this.f91137Q.f20351U.m128074a(new x20() { // from class: l.cw7
            @Override // p153l.x20
            public final void call() {
                this.f84103a.m33981hi(str);
            }
        });
        return uxj0.f181467a;
    }

    /* JADX INFO: renamed from: ij */
    public final /* synthetic */ Envelope m33994ij(Envelope envelope) {
        if (!jyb.m147479J(((CoreData) envelope.getModuleData(CoreData.class)).conversations)) {
            final List<User> list = ((CommonData) envelope.getModuleData(CommonData.class)).users;
            final List<FriendInfo> list2 = ((CoreData) envelope.getModuleData(CoreData.class)).friends;
            this.f91137Q.m32495w3(envelope, new x20() { // from class: l.j58
                @Override // p153l.x20
                public final void call() {
                    jyb.m147537z(list, new y20() { // from class: l.x88
                        @Override // p153l.y20
                        public final void call(Object obj) {
                            C4891g.m33279Zb(list, (User) obj);
                        }
                    });
                }
            });
        }
        return envelope;
    }

    /* JADX INFO: renamed from: ik */
    public final /* synthetic */ C22421c m33995ik(final String str, final Message message, final boolean z, final boolean z2, final boolean z3, y20 y20Var) {
        return m33193Ro(str, message).doOnNext(new y20() { // from class: l.ku7
            @Override // p153l.y20
            public final void call(Object obj) {
                C4891g.m33432md(message, str, (Envelope) obj);
            }
        }).map(new qcj() { // from class: l.lu7
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f133595a.m33983hk(message, str, z, z2, z3, (Envelope) obj);
            }
        }).doOnError(y20Var).compose(C4879a.m32255T2());
    }

    /* JADX INFO: renamed from: il */
    public final /* synthetic */ C22421c m33996il(final String str, final List list, final JSONArray jSONArray) {
        return NullChecker.m82486a(jSONArray) ? qi20.m176658e(new pcj() { // from class: l.k58
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4879a.f20236P.auth().m209043q(C4879a.m32216J0("/conversations/" + str + "/read-messages")).m209038l(z1d0.create(Network.JSON, jSONArray.toString())).m209028b();
            }
        }).doOnNext(new y20() { // from class: l.m58
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f134878a.m33984hl(list, (Envelope) obj);
            }
        }).map(new qcj() { // from class: l.n58
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return uxj0.f181467a;
            }
        }) : C22421c.empty();
    }

    /* JADX INFO: renamed from: im */
    public final /* synthetic */ void m33997im(String str, String str2, Picture.ImageUri imageUri, boolean z, String str3, CipherId cipherId) {
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
        User userM116597oa = this.f91137Q.f20381e0.m116597oa(str);
        boolean z2 = NullChecker.m82486a(userM116597oa) && TextUtils.isEmpty(str2) && userM116597oa.onlineMatchLocked();
        if (zwk.m221905e()) {
            str4 = "http://m.staging2.p1staff.com/fep/tantan/frontend/tantan-frontend-app-pages-v2/src/pages/core/userShare/index.html?u=" + cipherId.userId + "&f=" + z2 + "&m=" + cipherId.momentId;
        } else {
            str4 = "https://wechat.tantanapp.com/uni-fep/tantan/frontend/tantan-frontend-app-pages-v2/src/pages/core/userShare/index.html?u=" + cipherId.userId + "&f=" + z2 + "&m=" + cipherId.momentId;
        }
        String str5 = str4;
        if (NullChecker.m82486a(imageUri)) {
            m33703Jp(str5, imageUri.formatted(), z, str3, NullChecker.m82486a(userM116597oa) ? userM116597oa.isFemale() : false);
        } else {
            m33703Jp(str5, "", z, str3, NullChecker.m82486a(userM116597oa) ? userM116597oa.isFemale() : false);
        }
    }

    /* JADX INFO: renamed from: in */
    public C22421c<pf60<Integer, Message>> m33998in(String str, String str2) {
        return psd0.m173626s(CoreModule.f18272k.f115535c.m189473i0(str).m208677m(), CoreModule.f18272k.f115535c.m189468d0(str).m208677m(), CoreModule.f18264c.f20384f0.m33740Ne(str2), new scj() { // from class: l.ev7
            @Override // p153l.scj
            /* JADX INFO: renamed from: a */
            public final Object mo95332a(Object obj, Object obj2, Object obj3) {
                return C4891g.m33055F8((List) obj, (List) obj2, (Conversation) obj3);
            }
        });
    }

    /* JADX INFO: renamed from: io */
    public void m33999io(int i) {
        this.f20609I2.m137019l(Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: ip */
    public C22421c<uxj0> m34000ip() {
        return this.f20708p2;
    }

    /* JADX INFO: renamed from: iq */
    public C22421c<List<Message>> m34001iq(String str) {
        return CoreModule.f18272k.f115535c.m189474j0(str).m208677m();
    }

    /* JADX INFO: renamed from: je */
    public void m34002je(List<String> list) {
        u11.m193892f();
        if (jyb.m147479J(list)) {
            return;
        }
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            Conversation conversationQuery = CoreModule.f18272k.f115545m.query(it.next());
            if (NullChecker.m82486a(conversationQuery)) {
                conversationQuery.level = 50;
                CoreModule.f18272k.f115545m.upsert(conversationQuery);
            }
        }
    }

    /* JADX INFO: renamed from: jf */
    public int m34003jf() {
        return CoreModule.f18272k.f115545m.m159019i0();
    }

    /* JADX INFO: renamed from: jg */
    public boolean m34004jg(String str, boolean z) {
        String str2;
        Conversation conversationM34219zp = m34219zp(str);
        if (conversationM34219zp != null && (str2 = conversationM34219zp.localExtraInfo) != null && !TextUtils.isEmpty(str2) && (z || TEnum.equals(conversationM34219zp.status, "dismissed"))) {
            try {
                return new JSONObject(conversationM34219zp.localExtraInfo).getBoolean("keep_message_history");
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: jh */
    public void m34005jh(String str) {
        Message messageNew_ = Message.new_();
        messageNew_.messageType = MessageType.get(MessageType.local_match_ice_break);
        messageNew_.cid = str;
        messageNew_.localInConversation = true;
        long jGuessedCurrentServerTime = uqb0.f180376H.guessedCurrentServerTime();
        messageNew_.owner = CoreModule.m30929H().userId();
        messageNew_.createdTime = jGuessedCurrentServerTime;
        messageNew_.localCreatedTime = jGuessedCurrentServerTime;
        messageNew_.recalled = Boolean.FALSE;
        messageNew_.hostId = CoreModule.m30929H().userId();
        vxd0 vxd0Var = App.f16092i;
        messageNew_.localCreatedSession = vxd0Var.get().intValue();
        messageNew_.f56859id = DbObject.GENERATE_UNIQUE_FAKE_ID(vxd0Var.get().intValue());
        messageNew_.value = "";
        m33897ah(messageNew_, false);
    }

    /* JADX INFO: renamed from: ji */
    public final /* synthetic */ void m34006ji(Set set) {
        set.forEach(new a());
    }

    /* JADX INFO: renamed from: jj */
    public final /* synthetic */ uxj0 m34007jj(String str, Envelope envelope) {
        List<Conversation> list = ((CoreData) envelope.getModuleData(CoreData.class)).conversations;
        vg60<Conversation> vg60VarM222761e = this.f20654X1.m222761e();
        if (vg60VarM222761e == null || TextUtils.isEmpty(str)) {
            DbLinks dbLinks = new DbLinks();
            dbLinks.links = envelope.pagination.links;
            vg60VarM222761e = new vg60<>(list, dbLinks);
        } else if (!TextUtils.isEmpty(str)) {
            vg60VarM222761e.f184001a.addAll(list);
            vg60VarM222761e.f184002b.links = envelope.pagination.links;
        }
        this.f20654X1.m137019l(vg60VarM222761e);
        return uxj0.f181467a;
    }

    /* JADX INFO: renamed from: jk */
    public final /* synthetic */ C22421c m34008jk(final String str, final boolean z, final boolean z2, final boolean z3, final y20 y20Var, final Message message) {
        return this.f91137Q.scheduled("postTheMessage", -1, new pcj() { // from class: l.pr7
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f153730a.m33995ik(str, message, z, z2, z3, y20Var);
            }
        });
    }

    /* JADX INFO: renamed from: jl */
    public final /* synthetic */ C22421c m34009jl(final List list, final String str) {
        return C22421c.fromCallable(new Callable() { // from class: l.nz7
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C4891g.m33112Ka(list);
            }
        }).flatMap(new qcj() { // from class: l.oz7
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f149844a.m33996il(str, list, (JSONArray) obj);
            }
        });
    }

    /* JADX INFO: renamed from: jn */
    public C22421c<List<Conversation>> m34011jn(boolean z) {
        return m34024kn(z).m208677m();
    }

    /* JADX INFO: renamed from: jo */
    public void m34012jo() {
        this.f91137Q.scheduled("notifyServerChangeToConversationTab", 0, new pcj() { // from class: l.tq7
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return qi20.m176654a(new pcj() { // from class: l.ju7
                    @Override // p153l.pcj, java.util.concurrent.Callable
                    public final Object call() {
                        return C4879a.f20236P.auth().m209043q(C4879a.m32203G("/live-chat-tab-report")).m209038l(z1d0.create(Network.JSON, "")).m209028b();
                    }
                });
            }
        }).map(new qcj() { // from class: l.uq7
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((CoreData) ((Envelope) obj).getModuleData(CoreData.class)).onlineLiveChatPair;
            }
        }).onErrorReturn(new qcj() { // from class: l.vq7
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return C4891g.m33078H9((Throwable) obj);
            }
        }).subscribe();
    }

    /* JADX INFO: renamed from: jp */
    public void m34013jp() {
        this.f91137Q.f20427t1.m32513o(jyb.m147507f0("countdown_card_conv_key", "countdown_conv_list_key")).filter(new qcj() { // from class: l.mu7
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((RunnableC4884c0.b) obj).f20463a);
            }
        }).subscribe(new y20() { // from class: l.nu7
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f143681a.m33795Rl((RunnableC4884c0.b) obj);
            }
        });
    }

    /* JADX INFO: renamed from: jq */
    public C22421c<List<Conversation>> m34014jq() {
        return CoreModule.f18272k.f115545m.f137496n.m208677m();
    }

    /* JADX INFO: renamed from: ke */
    public void m34015ke() {
        User userM116600p9 = this.f91137Q.f20381e0.m116600p9();
        final String str = this.f91137Q.f20384f0.f20610J0.get();
        if (!NullChecker.m82486a(userM116600p9) || userM116600p9.isFemale() || TextUtils.isEmpty(str)) {
            return;
        }
        psd0.m173633z(this.f20636R1);
        this.f20636R1 = this.f91137Q.f20384f0.m33740Ne(str).subscribe(new y20() { // from class: l.gv7
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f106606a.m33607Ch(str, (Conversation) obj);
            }
        });
    }

    /* JADX INFO: renamed from: kf */
    public int m34016kf() {
        return CoreModule.f18272k.f115545m.f137470A.m208669e();
    }

    /* JADX INFO: renamed from: kg */
    public C22421c<LogoutCounterEnvelope> m34017kg() {
        final pcj pcjVar = new pcj() { // from class: l.iw7
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return uqb0.f180376H.auth().m209043q(C4879a.m32271Y("/persuade/counter")).m209032f().m209028b();
            }
        };
        return scheduled("logout_persuade_counter", 0, new pcj() { // from class: l.jw7
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return new si20(pcjVar, LogoutCounterEnvelope.JSON_ADAPTER).compose(psd0.m173592C());
            }
        }, false);
    }

    /* JADX INFO: renamed from: kh */
    public void m34018kh(String str) {
        Message messageNew_ = Message.new_();
        messageNew_.messageType = MessageType.get(MessageType.local_moment_post_guide);
        messageNew_.cid = str;
        messageNew_.localInConversation = true;
        long jGuessedCurrentServerTime = uqb0.f180376H.guessedCurrentServerTime();
        messageNew_.owner = CoreModule.m30929H().userId();
        messageNew_.createdTime = jGuessedCurrentServerTime;
        messageNew_.localCreatedTime = jGuessedCurrentServerTime;
        messageNew_.recalled = Boolean.FALSE;
        messageNew_.hostId = CoreModule.m30929H().userId();
        vxd0 vxd0Var = App.f16092i;
        messageNew_.localCreatedSession = vxd0Var.get().intValue();
        messageNew_.f56859id = DbObject.GENERATE_UNIQUE_FAKE_ID(vxd0Var.get().intValue());
        messageNew_.value = "";
        m33897ah(messageNew_, false);
    }

    /* JADX INFO: renamed from: ki */
    public final /* synthetic */ void m34019ki(List list) {
        try {
            final HashSet hashSet = new HashSet();
            if (list != null) {
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    Conversation conversation = (Conversation) list.get(i);
                    if (m33715Kp(conversation)) {
                        hashSet.add(conversation.f56859id);
                    }
                }
            }
            if (hashSet.isEmpty()) {
                return;
            }
            this.f91137Q.f20351U.m128074a(new x20() { // from class: l.f08
                @Override // p153l.x20
                public final void call() {
                    this.f96662a.m34006ji(hashSet);
                }
            });
        } catch (Exception e) {
            CrashHelper.m82479c(e);
        }
    }

    /* JADX INFO: renamed from: kj */
    public final /* synthetic */ C22421c m34020kj(final String str, final String str2) {
        return qi20.m176658e(new pcj() { // from class: l.u18
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4879a.f20236P.auth().m209043q(C4879a.m32214I2(str)).m209028b();
            }
        }).map(new qcj() { // from class: l.v18
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f181937a.m33994ij((Envelope) obj);
            }
        }).observeOn(fo0.m126432a()).map(new qcj() { // from class: l.w18
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f186770a.m34007jj(str2, (Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: kk */
    public final /* synthetic */ Boolean m34021kk(String str, Message message, String str2, long j, Message message2) {
        Conversation conversationM33738Mo = m33738Mo(str);
        if (gta.m132210e().m132214d().mo34679E() && NullChecker.m82486a(conversationM33738Mo) && gta.m132210e().m132214d().mo34730Nd(conversationM33738Mo)) {
            return Boolean.TRUE;
        }
        final User userQuery = uqb0.f180405k0.f184355d.query(message2.cid);
        if (userQuery == null ? false : userQuery.unilateralBlock()) {
            m600.m157134g(message, str2, "lift_match", str, 0, SystemClock.elapsedRealtime() - j);
            m34171we(message2, new y20() { // from class: l.gb8
                @Override // p153l.y20
                public final void call(Object obj) {
                    C4891g.m33277Z9(userQuery, (Message) obj);
                }
            });
            this.f20649W.m137019l(new Exception("You've been unmatched"));
            if (gta.m132210e().m132214d().mo34934u() && NullChecker.m82486a(conversationM33738Mo) && conversationM33738Mo.isHeartbeatConv()) {
                this.f91137Q.f20313H1.f97064R.m137019l(message);
            }
            return Boolean.FALSE;
        }
        if (gta.m132210e().m132214d().mo34748R8() && NullChecker.m82486a(conversationM33738Mo) && "lovebuzz".equals(conversationM33738Mo.convType)) {
            int i = conversationM33738Mo.f21116mm;
            if (((NullChecker.m82486a(conversationM33738Mo.property) && NullChecker.m82486a(conversationM33738Mo.property.intl_love_buzz) && TextUtils.equals("textBuzz", conversationM33738Mo.property.intl_love_buzz.biz)) ? conversationM33738Mo.property.intl_love_buzz.expire - pzi0.m174454o() : 1000L) <= 0 && i < 10) {
                m34158ve(message, 8, null);
                return Boolean.FALSE;
            }
        }
        return Boolean.TRUE;
    }

    /* JADX INFO: renamed from: kl */
    public final /* synthetic */ Optional m34022kl(String str) throws Exception {
        final Conversation conversationM33738Mo = m33738Mo(str);
        List<Message> listM208674j = CoreModule.f18272k.f115535c.m189476l0(str).m208674j();
        if (!m33739Mp(conversationM33738Mo, listM208674j)) {
            return Optional.absent();
        }
        Message message = (Message) jyb.m147529r(listM208674j, new qcj() { // from class: l.w28
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(TEnum.equals(((Message) obj).status(), "normal"));
            }
        });
        final ConversationPatchRecord conversationPatchRecordNew_ = ConversationPatchRecord.new_();
        conversationPatchRecordNew_.state = ConversationPatchState.get("default");
        conversationPatchRecordNew_.f56859id = str;
        conversationPatchRecordNew_.readUtil = message == null ? "" : message.f56859id;
        this.f91137Q.f20351U.m128074a(new x20() { // from class: l.h38
            @Override // p153l.x20
            public final void call() {
                C4891g.m33104Jd(conversationPatchRecordNew_, conversationM33738Mo);
            }
        });
        return Optional.m15467of(conversationPatchRecordNew_);
    }

    /* JADX INFO: renamed from: km */
    public final /* synthetic */ void m34023km(String str) {
        Conversation conversationM33738Mo = m33738Mo(str);
        if (NullChecker.m82486a(conversationM33738Mo)) {
            CoreModule.f18272k.f115545m.delete(str);
        }
        m34117rp(conversationM33738Mo);
    }

    /* JADX INFO: renamed from: kn */
    public final wzh0.C21213a m34024kn(boolean z) {
        return (z && this.f91137Q.f20384f0.f20724v0.get().booleanValue() && this.f91137Q.f20384f0.m33908bg()) ? m33728Me().f137485P.m180655b() : m33728Me().f137480K.m180655b();
    }

    /* JADX INFO: renamed from: ko */
    public C22421c<pf60<Integer, Message>> m34025ko(String str, String str2) {
        return gta.m132210e().m132214d().mo34938v() ? m34038lo(str, str2) : psd0.m173626s(CoreModule.f18272k.f115535c.m189472h0(str).m208677m(), CoreModule.f18272k.f115535c.m189467c0(str).m208677m(), CoreModule.f18264c.f20384f0.m33740Ne(str2), new scj() { // from class: l.e48
            @Override // p153l.scj
            /* JADX INFO: renamed from: a */
            public final Object mo95332a(Object obj, Object obj2, Object obj3) {
                return C4891g.m33183R4((List) obj, (List) obj2, (Conversation) obj3);
            }
        });
    }

    /* JADX INFO: renamed from: kp */
    public void m34026kp(final String str) {
        this.f91137Q.scheduled("reject_receive_msg_" + str, -1, new pcj() { // from class: l.w68
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4891g.m33090Ia(str);
            }
        }, false).subscribe(new y20() { // from class: l.x68
            @Override // p153l.y20
            public final void call(Object obj) {
                o1j0.m165651y("已拒收");
            }
        }, new y20() { // from class: l.y68
            @Override // p153l.y20
            public final void call(Object obj) {
                o1j0.m165651y("再试一次");
            }
        });
    }

    /* JADX INFO: renamed from: kq */
    public void m34027kq(final String str, final double d2) {
        this.f91137Q.f20351U.m128074a(new x20() { // from class: l.q18
            @Override // p153l.x20
            public final void call() {
                C4891g.m33257Xb(str, d2);
            }
        });
    }

    /* JADX INFO: renamed from: le */
    public C22421c<List<Conversation>> m34028le() {
        return CoreModule.f18272k.f115545m.f137502t.m208677m();
    }

    /* JADX INFO: renamed from: lf */
    public int m34029lf() {
        return CoreModule.f18272k.f115545m.m159025l0();
    }

    /* JADX INFO: renamed from: lg */
    public C22421c<List<LogoutRecommendUser>> m34030lg(final List<Conversation> list) {
        return this.f91137Q.scheduled("logout_persuade_users", -1, new pcj() { // from class: l.zw7
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return qi20.m176656c(new pcj() { // from class: l.iz7
                    @Override // p153l.pcj, java.util.concurrent.Callable
                    public final Object call() {
                        return C4891g.m33067G9(list);
                    }
                }, LogoutRecommendEnvelope.JSON_ADAPTER);
            }
        }).map(new qcj() { // from class: l.ax7
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return C4891g.m33085I5((LogoutRecommendEnvelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: lh */
    public void m34031lh(String str) {
        Message messageNew_ = Message.new_();
        messageNew_.messageType = MessageType.get(MessageType.tag_guide);
        messageNew_.cid = str;
        messageNew_.localInConversation = true;
        long jGuessedCurrentServerTime = uqb0.f180376H.guessedCurrentServerTime();
        messageNew_.owner = CoreModule.m30929H().userId();
        messageNew_.createdTime = jGuessedCurrentServerTime;
        messageNew_.localCreatedTime = jGuessedCurrentServerTime;
        messageNew_.recalled = Boolean.FALSE;
        messageNew_.hostId = CoreModule.m30929H().userId();
        vxd0 vxd0Var = App.f16092i;
        messageNew_.localCreatedSession = vxd0Var.get().intValue();
        messageNew_.f56859id = DbObject.GENERATE_UNIQUE_FAKE_ID(vxd0Var.get().intValue());
        messageNew_.value = "";
        m33897ah(messageNew_, false);
    }

    /* JADX INFO: renamed from: li */
    public final /* synthetic */ void m34032li() {
        this.f91137Q.f20351U.m128074a(new x20() { // from class: l.iy7
            @Override // p153l.x20
            public final void call() {
                C4891g.m33232V8();
            }
        });
    }

    /* JADX INFO: renamed from: lj */
    public final /* synthetic */ void m34033lj(Envelope envelope, final Conversation conversation) {
        if (!gta.m132210e().m132214d().mo34730Nd(conversation)) {
            m33731Mh(conversation.f56859id);
            return;
        }
        final ArrayList arrayList = new ArrayList();
        if (!jyb.m147479J(((CoreData) envelope.getModuleData(CoreData.class)).messages)) {
            jyb.m147537z(((CoreData) envelope.getModuleData(CoreData.class)).messages, new y20() { // from class: l.h78
                @Override // p153l.y20
                public final void call(Object obj) {
                    C4891g.m33475qc(conversation, arrayList, (Message) obj);
                }
            });
            ((CoreData) envelope.getModuleData(CoreData.class)).messages.removeAll(arrayList);
        }
        m33731Mh(conversation.f56859id);
    }

    /* JADX INFO: renamed from: lk */
    public final /* synthetic */ Message m34034lk(Message message, String str, final Message message2) {
        final boolean z = (this.f20640T.booleanValue() && m33581Ah(message.value, str)) || message.localFailType == 4;
        if (!uqb0.f180394Z.m95954K(message2.value) && !uqb0.f180394Z.m95956M(message2.value) && !z) {
            return message2;
        }
        if (this.f20640T.booleanValue()) {
            this.f20640T = Boolean.FALSE;
            this.f91137Q.f20351U.m128074a(new x20() { // from class: l.xq7
                @Override // p153l.x20
                public final void call() {
                    C4891g.m33025Cb(message2, z);
                }
            });
        } else {
            this.f91137Q.f20351U.m128074a(new x20() { // from class: l.zq7
                @Override // p153l.x20
                public final void call() {
                    C4891g.m33544x3(message2);
                }
            });
        }
        return CoreModule.f18272k.f115535c.query(message2._id);
    }

    /* JADX INFO: renamed from: ll */
    public final /* synthetic */ void m34035ll(NetworkInfo networkInfo) {
        m33614Co();
    }

    /* JADX INFO: renamed from: lm */
    public final /* synthetic */ void m34036lm() {
        this.f91137Q.f20384f0.m33962fn(null);
        this.f91137Q.f20384f0.m33653Fo();
        CoreModule.f18264c.f20384f0.m33941dq(uqb0.f180376H.guessedCurrentServerTime());
    }

    /* JADX INFO: renamed from: ln */
    public void m34037ln() {
        User userMo225055clone = CoreModule.f18264c.f20381e0.m116593na().mo225055clone();
        ProfileCompletion profileCompletion = userMo225055clone.profile.extensions.profileCompletion;
        List list = Collections.EMPTY_LIST;
        profileCompletion.briefIntroduction = jyb.m147500c(list, "测试输入数据");
        userMo225055clone.profile.extensions.profileCompletion.progress = jyb.m147500c(list, "finished");
        CoreModule.f18264c.f20381e0.m116620u9(userMo225055clone.subtract(CoreModule.f18264c.f20381e0.m116593na()));
    }

    /* JADX INFO: renamed from: lo */
    public C22421c<pf60<Integer, Message>> m34038lo(String str, String str2) {
        return psd0.m173626s(CoreModule.f18272k.f115535c.m189472h0(str).m208677m(), CoreModule.f18272k.f115535c.m189467c0(str).m208677m(), CoreModule.f18264c.f20384f0.m33740Ne(str2), new scj() { // from class: l.dw7
            @Override // p153l.scj
            /* JADX INFO: renamed from: a */
            public final Object mo95332a(Object obj, Object obj2, Object obj3) {
                return C4891g.m33276Z8((List) obj, (List) obj2, (Conversation) obj3);
            }
        }).doOnError(new y20() { // from class: l.ew7
            @Override // p153l.y20
            public final void call(Object obj) {
                C4891g.m33064G6((Throwable) obj);
            }
        });
    }

    /* JADX INFO: renamed from: lp */
    public void m34039lp() {
        l51.m152920z(new Runnable() { // from class: l.ns7
            @Override // java.lang.Runnable
            public final void run() {
                this.f143472a.m33806Sl();
            }
        }, false);
    }

    /* JADX INFO: renamed from: lq */
    public void m34040lq(final double d2) {
        l51.m152919y(new Runnable() { // from class: l.lr7
            @Override // java.lang.Runnable
            public final void run() {
                this.f133300a.m33586Am(d2);
            }
        });
    }

    /* JADX INFO: renamed from: me */
    public final Message m34041me(String str, String str2) {
        Message messageNew_ = Message.new_();
        messageNew_.messageType = MessageType.get(MessageType.ai_chat_analysis_guide);
        messageNew_.cid = str;
        messageNew_.localInConversation = true;
        long jM174454o = pzi0.m174454o();
        messageNew_.owner = CoreModule.m30929H().userId();
        messageNew_.createdTime = jM174454o;
        messageNew_.localCreatedTime = jM174454o;
        messageNew_.recalled = Boolean.FALSE;
        messageNew_.hostId = CoreModule.m30929H().userId();
        vxd0 vxd0Var = App.f16092i;
        messageNew_.localCreatedSession = vxd0Var.get().intValue();
        messageNew_.f56859id = DbObject.GENERATE_UNIQUE_FAKE_ID(vxd0Var.get().intValue());
        MessageAdditionalData messageAdditionalDataNew_ = MessageAdditionalData.new_();
        messageNew_.additionalData = messageAdditionalDataNew_;
        messageNew_.value = "";
        messageAdditionalDataNew_.aiChatGuideType = str2;
        return messageNew_;
    }

    /* JADX INFO: renamed from: mf */
    public int m34042mf(int i) {
        return CoreModule.f18272k.f115545m.m159032o1(i).m208669e();
    }

    /* JADX INFO: renamed from: mg */
    public C22421c<vg60<Conversation>> m34043mg(final String str) {
        return this.f91137Q.scheduled("getMessageTabFilterList/" + str, 0, new pcj() { // from class: l.ay7
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f73949a.m33768Pi(str);
            }
        });
    }

    /* JADX INFO: renamed from: mh */
    public void m34044mh(String str) {
        Message messageNew_ = Message.new_();
        messageNew_.cid = str;
        vxd0 vxd0Var = App.f16092i;
        messageNew_.f56859id = DbObject.GENERATE_UNIQUE_FAKE_ID(vxd0Var.get().intValue());
        messageNew_.messageType = MessageType.get("local_tickle_tip");
        messageNew_.localCreatedTime = pzi0.m174454o();
        messageNew_.createdTime = pzi0.m174454o();
        messageNew_.localCreatedSession = vxd0Var.get().intValue();
        messageNew_.localInConversation = true;
        messageNew_.owner = CoreModule.m30929H().userId();
        Boolean bool = Boolean.FALSE;
        messageNew_.recalled = bool;
        this.f91137Q.f20384f0.m33885Zg(messageNew_);
        this.f91137Q.f20381e0.f89239h1.put(Boolean.TRUE);
        this.f91137Q.f20373b1.f193006T.put(bool);
        this.f91137Q.f20381e0.f89247i1.put(messageNew_.f56859id);
    }

    /* JADX INFO: renamed from: mi */
    public final /* synthetic */ void m34045mi() {
        this.f91137Q.f20351U.m128074a(new x20() { // from class: l.mx7
            @Override // p153l.x20
            public final void call() {
                C4891g.m33056F9();
            }
        });
    }

    /* JADX INFO: renamed from: mj */
    public final /* synthetic */ void m34046mj(Conversation conversation) {
        m34120sf(conversation.f56859id);
    }

    /* JADX INFO: renamed from: mk */
    public final /* synthetic */ void m34047mk(Message message, long j, String str, Message message2) {
        m600.m157135h(message, SystemClock.elapsedRealtime() - j);
        Conversation conversationM33859Xe = m33859Xe(str);
        if (NullChecker.m82486a(conversationM33859Xe)) {
            if (conversationM33859Xe.userMessageCount == 1) {
                String strMo34909qc = gta.m132210e().m132214d().mo34909qc(str);
                if (!TextUtils.isEmpty(strMo34909qc)) {
                    ConversationQuickChat conversationQuickChat = conversationM33859Xe.property.quickchat;
                    if (conversationQuickChat.bell) {
                        CoreModule.f18264c.f20300D0.m35865y4(strMo34909qc);
                    } else if (conversationQuickChat.speed) {
                        CoreModule.f18264c.f20300D0.m35830C4(strMo34909qc);
                    } else if (conversationQuickChat.oneside) {
                        User userM116593na = this.f91137Q.f20381e0.m116593na();
                        boolean z = gta.m132210e().m132214d().mo34735Od() && NullChecker.m82486a(conversationM33859Xe) && conversationM33859Xe.isFakeQuickChatConv();
                        if ((NullChecker.m82486a(userM116593na) && !userM116593na.isFemale()) || z) {
                            CoreModule.f18264c.f20300D0.m35829B4(strMo34909qc, "");
                        }
                    }
                }
            }
        }
        if (NullChecker.m82486a(conversationM33859Xe) && "lovebuzz".equals(conversationM33859Xe.convType) && conversationM33859Xe.userMessageCount <= 3) {
            String strM35580s5 = CoreModule.f18264c.f20319J1.m35580s5(str);
            if (!TextUtils.isEmpty(strM35580s5)) {
                CoreModule.f18264c.f20319J1.m35551C5(conversationM33859Xe, strM35580s5);
            }
        }
        if (gta.m132210e().m132214d().mo34943w()) {
            rvm.m183279g(str);
        }
    }

    /* JADX INFO: renamed from: ml */
    public final /* synthetic */ void m34048ml(Optional optional) {
        if (optional.isPresent()) {
            if (Network.isConnected(CoreModule.f18263b)) {
                m34061nl((ConversationPatchRecord) optional.get());
            } else if (this.f20672d2 == null) {
                this.f20672d2 = ConnectivityReceiver.m82473m().skip(1).distinctUntilChanged().filter(new qcj() { // from class: l.uc8
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        NetworkInfo networkInfo = (NetworkInfo) obj;
                        return Boolean.valueOf(networkInfo != null && networkInfo.isConnected());
                    }
                }).observeOn(fo0.m126432a()).subscribe(psd0.m173596G(new y20() { // from class: l.vc8
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        this.f183342a.m34035ll((NetworkInfo) obj);
                    }
                }));
            }
        }
    }

    /* JADX INFO: renamed from: mm */
    public final /* synthetic */ void m34049mm(final String str, Throwable th) {
        if ((th instanceof TantanException.Client.CoreService) && ((TantanException.Client.CoreService) th).code == 40043) {
            this.f91137Q.f20351U.m128074a(new x20() { // from class: l.l38
                @Override // p153l.x20
                public final void call() {
                    this.f129851a.m34023km(str);
                }
            });
            if ("zh".equals(Locale.getDefault().getLanguage()) && "CN".equals(Locale.getDefault().getCountry())) {
                l51.m152887G(new Runnable() { // from class: l.m38
                    @Override // java.lang.Runnable
                    public final void run() {
                        o1j0.m165651y("恢复失败，对方可能账号异常或者已与您解除配对");
                    }
                });
            }
            l51.m152888H(CoreModule.f18263b, new Runnable() { // from class: l.n38
                @Override // java.lang.Runnable
                public final void run() {
                    this.f139951a.m34036lm();
                }
            }, 500L);
            tu2.m192703a("svipRecoverConvFail", "code:40043;status:deleted;uid:" + str);
        }
    }

    /* JADX INFO: renamed from: mn */
    public void m34050mn(final Message message) {
        if (message == null) {
            return;
        }
        l51.m152919y(new Runnable() { // from class: l.b08
            @Override // java.lang.Runnable
            public final void run() {
                this.f74252a.m33685Ij(message);
            }
        });
    }

    /* JADX INFO: renamed from: mo */
    public C22421c<pf60<Integer, Boolean>> m34051mo(String str) {
        if (gta.m132210e().m132214d().mo34938v()) {
            return m34064no(str);
        }
        return psd0.m173626s(CoreModule.f18272k.f115535c.m189472h0(str).m208677m(), CoreModule.f18272k.f115535c.m189467c0(str).m208677m(), NullChecker.m82486a(str) ? CoreModule.f18264c.f20384f0.m33740Ne(str).map(new qcj() { // from class: l.ht7
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Integer.valueOf(((Conversation) obj).f21116mm);
            }
        }) : C22421c.just(0), new scj() { // from class: l.it7
            @Override // p153l.scj
            /* JADX INFO: renamed from: a */
            public final Object mo95332a(Object obj, Object obj2, Object obj3) {
                return C4891g.m33186R7((List) obj, (List) obj2, (Integer) obj3);
            }
        });
    }

    /* JADX INFO: renamed from: mp */
    public void m34052mp(final boolean z) {
        final ArrayList arrayListM147522n = jyb.m147522n(jyb.m147507f0(this.f91137Q.f20405m0.f20131Y0.get(), this.f91137Q.f20405m0.f20134Z0.get(), this.f91137Q.f20405m0.f20137a1.get()), new qcj() { // from class: l.rc8
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(!TextUtils.isEmpty((String) obj));
            }
        });
        if (arrayListM147522n.isEmpty()) {
            return;
        }
        l51.m152919y(new Runnable() { // from class: l.sc8
            @Override // java.lang.Runnable
            public final void run() {
                this.f167199a.m33854Wl(arrayListM147522n, z);
            }
        });
    }

    /* JADX INFO: renamed from: mq */
    public void m34053mq(Conversation conversation) {
        CoreModule.f18272k.f115545m.upsert(conversation);
    }

    /* JADX INFO: renamed from: ne */
    public C22421c<Meta> m34054ne(final String str, final String str2) {
        return this.f91137Q.scheduled(C4879a.m32275Z("/v2/surveys/" + str + "/answers"), -1, new pcj() { // from class: l.o68
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return qi20.m176658e(new pcj() { // from class: l.ba8
                    @Override // p153l.pcj, java.util.concurrent.Callable
                    public final Object call() {
                        return C4879a.f20236P.auth().m209043q(C4879a.m32275Z("/v2/surveys/" + str + "/answers")).m209038l(z1d0.create(Network.JSON, str)).m209028b();
                    }
                }).compose(psd0.m173592C()).map(new qcj() { // from class: l.ca8
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return C4891g.m33572z8((Envelope) obj);
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: nf */
    public final String m34055nf(Links links) {
        return (links == null || TextUtils.isEmpty(links.next)) ? C4879a.m32183B("limit=10") : C4879a.m32183B(links.next);
    }

    /* JADX INFO: renamed from: ng */
    public C22421c<List<Conversation>> m34056ng() {
        return CoreModule.f18272k.f115545m.f137505w.m180655b().m208677m();
    }

    /* JADX INFO: renamed from: nh */
    public void m34057nh(String str, Questionnaire questionnaire) {
        if (questionnaire == null) {
            return;
        }
        Message messageNew_ = Message.new_();
        messageNew_.messageType = MessageType.get(MessageType.local_ux_questionnaire);
        messageNew_.cid = str;
        messageNew_.localInConversation = true;
        long jM174454o = pzi0.m174454o();
        messageNew_.owner = CoreModule.m30929H().userId();
        messageNew_.createdTime = jM174454o;
        messageNew_.localCreatedTime = jM174454o;
        messageNew_.recalled = Boolean.FALSE;
        messageNew_.hostId = CoreModule.m30929H().userId();
        vxd0 vxd0Var = App.f16092i;
        messageNew_.localCreatedSession = vxd0Var.get().intValue();
        messageNew_.f56859id = DbObject.GENERATE_UNIQUE_FAKE_ID(vxd0Var.get().intValue());
        MessageAdditionalData messageAdditionalDataNew_ = MessageAdditionalData.new_();
        messageNew_.additionalData = messageAdditionalDataNew_;
        messageAdditionalDataNew_.localUXQuestionnaire = questionnaire;
        messageNew_.value = questionnaire.title;
        m33857Wo(str, messageNew_);
    }

    /* JADX INFO: renamed from: ni */
    public final /* synthetic */ void m34058ni() {
        this.f91137Q.f20351U.m128074a(new x20() { // from class: l.xu7
            @Override // p153l.x20
            public final void call() {
                CoreModule.f18272k.f115535c.delete(Message.MESSAGETYPE.m61360EQ("live_vip_greet"));
            }
        });
    }

    /* JADX INFO: renamed from: nj */
    public final /* synthetic */ void m34059nj(final Envelope envelope, ArrayList arrayList, ArrayList arrayList2, DbLinks dbLinks) {
        m34220zq(((CoreData) envelope.getModuleData(CoreData.class)).conversations);
        jyb.m147537z(arrayList, new y20() { // from class: l.b68
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f75141a.m34033lj(envelope, (Conversation) obj);
            }
        });
        if (!jyb.m147479J(arrayList2)) {
            jyb.m147537z(arrayList2, new y20() { // from class: l.c68
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f79946a.m34046mj((Conversation) obj);
                }
            });
        }
        uqb0.f180405k0.f184354c.upsert(dbLinks);
        m34133tf(envelope);
    }

    /* JADX INFO: renamed from: nk */
    public final /* synthetic */ void m34060nk(Envelope envelope, x20 x20Var, boolean z, String str, Message message) {
        if (jyb.m147479J(((CoreData) envelope.getModuleData(CoreData.class)).messages)) {
            CrashHelper.m82485i(new Exception("return null messages"), "core_post_simple", CrashHelper.ReportLevel.p5, 100);
            return;
        }
        if (x20Var != null) {
            x20Var.call();
        }
        Message message2 = ((CoreData) envelope.getModuleData(CoreData.class)).messages.get(0);
        if (z) {
            message2.localInConversation = true;
            message2.localInMoment = true;
        }
        Conversation conversationM33738Mo = m33738Mo(str);
        if (conversationM33738Mo == null) {
            if (gta.m132210e().m132214d().mo34811c()) {
                if (message.cid == null) {
                    message.cid = str;
                }
                if (m33750No(message.cid) == null) {
                    DbLinks dbLinks = new DbLinks();
                    dbLinks.f56859id = message.cid;
                    dbLinks.links = Links.new_();
                    CoreModule.f18272k.f115536d.upsert(dbLinks);
                }
            }
            conversationM33738Mo = m33786Qo(message);
        }
        conversationM33738Mo.latestTime = message2.createdTime;
        if (!z) {
            conversationM33738Mo.localHasMessage = true;
        }
        CoreModule.f18272k.f115545m.upsert(conversationM33738Mo);
    }

    /* JADX INFO: renamed from: nm */
    public final /* synthetic */ void m34062nm(String str) {
        Conversation conversationM33738Mo = m33738Mo(str);
        if (NullChecker.m82486a(conversationM33738Mo)) {
            CoreModule.f18272k.f115545m.delete(str);
        }
        m34117rp(conversationM33738Mo);
    }

    /* JADX INFO: renamed from: nn */
    public List<Conversation> m34063nn() {
        return CoreModule.f18272k.f115545m.f137483N.m180655b().m208674j();
    }

    /* JADX INFO: renamed from: no */
    public C22421c<pf60<Integer, Boolean>> m34064no(String str) {
        return psd0.m173626s(CoreModule.f18272k.f115535c.m189472h0(str).m208677m(), CoreModule.f18272k.f115535c.m189467c0(str).m208677m(), NullChecker.m82486a(str) ? CoreModule.f18264c.f20384f0.m33740Ne(str).map(new qcj() { // from class: l.l08
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return C4891g.m33436n6((Conversation) obj);
            }
        }) : C22421c.just(0), new scj() { // from class: l.m08
            @Override // p153l.scj
            /* JADX INFO: renamed from: a */
            public final Object mo95332a(Object obj, Object obj2, Object obj3) {
                return C4891g.m33079Ha((List) obj, (List) obj2, (Integer) obj3);
            }
        });
    }

    /* JADX INFO: renamed from: np */
    public C22421c<uxj0> m34065np(final MessageType messageType) {
        return this.f91137Q.now(C22421c.fromCallable(new Callable() { // from class: l.ly7
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f134033a.m33866Xl(messageType);
            }
        }).compose(C4879a.m32255T2()));
    }

    /* JADX INFO: renamed from: nq */
    public void m34066nq(final String str, final String str2) {
        l51.m152919y(new Runnable() { // from class: l.j18
            @Override // java.lang.Runnable
            public final void run() {
                this.f117937a.m33612Cm(str, str2);
            }
        });
    }

    /* JADX INFO: renamed from: oe */
    public C22421c<uxj0> m34067oe() {
        return this.f91137Q.scheduled("batchMarriagePatch", -1, new pcj() { // from class: l.pv7
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f154264a.m33646Fh();
            }
        });
    }

    /* JADX INFO: renamed from: of */
    public Message m34068of(String str, MessageType messageType) {
        return m34081pf(str, messageType, "");
    }

    /* JADX INFO: renamed from: og */
    public C22421c<Boolean> m34069og() {
        return this.f20583A0.asObservable();
    }

    /* JADX INFO: renamed from: oh */
    public void m34070oh(String str, String str2) {
        Message messageNew_ = Message.new_();
        messageNew_.messageType = MessageType.get(MessageType.local_user_moment_message);
        messageNew_.cid = str;
        messageNew_.localInConversation = true;
        long jGuessedCurrentServerTime = uqb0.f180376H.guessedCurrentServerTime();
        messageNew_.owner = CoreModule.m30929H().userId();
        messageNew_.createdTime = jGuessedCurrentServerTime;
        messageNew_.localCreatedTime = jGuessedCurrentServerTime;
        messageNew_.recalled = Boolean.FALSE;
        messageNew_.hostId = CoreModule.m30929H().userId();
        vxd0 vxd0Var = App.f16092i;
        messageNew_.localCreatedSession = vxd0Var.get().intValue();
        messageNew_.f56859id = DbObject.GENERATE_UNIQUE_FAKE_ID(vxd0Var.get().intValue());
        messageNew_.value = "";
        messageNew_.msgData = str2;
        m33897ah(messageNew_, false);
    }

    /* JADX INFO: renamed from: oi */
    public final /* synthetic */ uxj0 m34071oi(final String str) throws Exception {
        this.f91137Q.f20351U.m128074a(new x20() { // from class: l.oq7
            @Override // p153l.x20
            public final void call() {
                C4891g.m33010B7(str);
            }
        });
        return uxj0.f181467a;
    }

    /* JADX INFO: renamed from: ok */
    public final /* synthetic */ uxj0 m34073ok(final x20 x20Var, final boolean z, final String str, final Message message, final Envelope envelope) {
        this.f91137Q.m32495w3(envelope, new x20() { // from class: l.f78
            @Override // p153l.x20
            public final void call() {
                this.f97540a.m34060nk(envelope, x20Var, z, str, message);
            }
        });
        return uxj0.f181467a;
    }

    /* JADX INFO: renamed from: ol */
    public final /* synthetic */ uxj0 m34074ol() throws Exception {
        List<T> listM208674j = CoreModule.f18272k.f115544l.m130567F().m208674j();
        if (jyb.m147479J(listM208674j) || listM208674j.get(0) == null) {
            this.f20735y2 = false;
        } else {
            this.f20735y2 = true;
            final ConversationPatchRecord conversationPatchRecord = (ConversationPatchRecord) listM208674j.get(0);
            l51.m152887G(new Runnable() { // from class: l.o38
                @Override // java.lang.Runnable
                public final void run() {
                    this.f144821a.m34061nl(conversationPatchRecord);
                }
            });
        }
        return uxj0.f181467a;
    }

    /* JADX INFO: renamed from: om */
    public final /* synthetic */ void m34075om(String str) {
        Conversation conversationM33738Mo = m33738Mo(str);
        if (NullChecker.m82486a(conversationM33738Mo)) {
            conversationM33738Mo.unmatchConversation = false;
            CoreModule.f18272k.f115545m.upsert(conversationM33738Mo);
        }
    }

    /* JADX INFO: renamed from: on */
    public C22421c<vg60<Conversation>> m34076on() {
        return m33752Oe(m33728Me().f137498p);
    }

    /* JADX INFO: renamed from: oo */
    public C22421c<Message> m34077oo() {
        return this.f20667c0.observeOn(fo0.m126432a());
    }

    /* JADX INFO: renamed from: op */
    public C22421c<uxj0> m34078op(String str) {
        final String strM211114p = xi5.m211114p("/friends");
        final JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(str);
        try {
            jSONObject.put("userIds", jSONArray);
            jSONObject.put("action", "block");
        } catch (JSONException unused) {
        }
        return this.f91137Q.scheduled("conversations/remove/recommend", -1, new pcj() { // from class: l.v78
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return new ti20(new pcj() { // from class: l.b98
                    @Override // p153l.pcj, java.util.concurrent.Callable
                    public final Object call() {
                        return C4879a.f20236P.auth().m209043q(str).m209038l(z1d0.create(Network.JSON, jSONObject.toString())).m209028b();
                    }
                }).map(new qcj() { // from class: l.c98
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return uxj0.f181467a;
                    }
                }).compose(C4879a.m32255T2());
            }
        });
    }

    @TestOnly
    /* JADX INFO: renamed from: oq */
    public void m34079oq(ChatGameInfo chatGameInfo) {
        this.f20690j2 = chatGameInfo;
        this.f20687i2.put(chatGameInfo.toJson());
    }

    /* JADX INFO: renamed from: pe */
    public C22421c<uxj0> m34080pe() {
        return this.f91137Q.scheduled("batchNewMatchPatch", -1, new pcj() { // from class: l.mz7
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f139482a.m33683Ih();
            }
        });
    }

    /* JADX INFO: renamed from: pf */
    public Message m34081pf(String str, MessageType messageType, String str2) {
        Message messageNew_ = Message.new_();
        messageNew_.cid = str;
        vxd0 vxd0Var = App.f16092i;
        messageNew_.f56859id = DbObject.GENERATE_UNIQUE_FAKE_ID(vxd0Var.get().intValue());
        messageNew_.messageType = messageType;
        messageNew_.localCreatedTime = pzi0.m174454o();
        messageNew_.createdTime = pzi0.m174454o();
        messageNew_.localCreatedSession = vxd0Var.get().intValue();
        messageNew_.localInConversation = true;
        messageNew_.owner = CoreModule.m30929H().userId();
        messageNew_.recalled = Boolean.FALSE;
        messageNew_.value = str2;
        return messageNew_;
    }

    /* JADX INFO: renamed from: pg */
    public C22421c<Surveys> m34082pg(final String str) {
        return scheduled(C4879a.m32275Z("/v2/surveys/" + str), 0, new pcj() { // from class: l.c48
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return qi20.m176654a(new pcj() { // from class: l.j68
                    @Override // p153l.pcj, java.util.concurrent.Callable
                    public final Object call() {
                        return C4879a.f20236P.auth().m209043q(C4879a.m32275Z("/v2/surveys/" + str)).m209028b();
                    }
                }).map(new qcj() { // from class: l.k68
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return C4891g.m33378i3((Envelope) obj);
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: ph */
    public C22421c<vg60<Conversation>> m34083ph() {
        return m33752Oe(m33728Me().m159044z0());
    }

    /* JADX INFO: renamed from: pi */
    public final /* synthetic */ uxj0 m34084pi(final String str) throws Exception {
        this.f91137Q.f20351U.m128074a(new x20() { // from class: l.cy7
            @Override // p153l.x20
            public final void call() {
                CoreModule.f18272k.f115535c.delete(Filter.AND(Message.CID.mo61359EQ(str), Message.MESSAGETYPE.m61360EQ(MessageType.local_birthday_tip)));
            }
        });
        return uxj0.f181467a;
    }

    /* JADX INFO: renamed from: pj */
    public final /* synthetic */ void m34085pj(uxj0 uxj0Var) {
        this.f20732x2 = false;
    }

    /* JADX INFO: renamed from: pk */
    public final /* synthetic */ C22421c m34086pk(final String str, final Message message, final x20 x20Var, final boolean z) {
        return m33193Ro(str, message).map(new qcj() { // from class: l.y38
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f197324a.m34073ok(x20Var, z, str, message, (Envelope) obj);
            }
        }).compose(C4879a.m32255T2());
    }

    /* JADX INFO: renamed from: pl */
    public final /* synthetic */ C22421c m34087pl() {
        return C22421c.fromCallable(new Callable() { // from class: l.m28
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f134530a.m34074ol();
            }
        }).compose(C4879a.m32255T2());
    }

    /* JADX INFO: renamed from: pm */
    public final /* synthetic */ uxj0 m34088pm(final String str, Envelope envelope) {
        if (envelope.meta.code != 40043) {
            this.f91137Q.m32496x3(envelope, new x20() { // from class: l.k48
                @Override // p153l.x20
                public final void call() {
                    this.f123865a.m34075om(str);
                }
            }, true);
            return uxj0.f181467a;
        }
        tu2.m192703a("svipRecoverConvFail", "code:40043;status:deleted;uid:" + str);
        this.f91137Q.f20351U.m128074a(new x20() { // from class: l.i48
            @Override // p153l.x20
            public final void call() {
                this.f112847a.m34062nm(str);
            }
        });
        if ("zh".equals(Locale.getDefault().getLanguage()) && "CN".equals(Locale.getDefault().getCountry())) {
            l51.m152887G(new Runnable() { // from class: l.j48
                @Override // java.lang.Runnable
                public final void run() {
                    o1j0.m165651y("恢复失败，对方可能账号异常或者已与您解除配对");
                }
            });
        }
        return uxj0.f181467a;
    }

    /* JADX INFO: renamed from: pn */
    public C22421c<vg60<Conversation>> m34089pn(List<String> list) {
        return m33752Oe(m33728Me().m159006W0(list));
    }

    /* JADX INFO: renamed from: po */
    public int m34090po() {
        mm6 mm6Var = CoreModule.f18272k.f115545m;
        Filter<Conversation> filterM61360EQ = Conversation.LOCALPLACEBAN.m61360EQ("both");
        TEnumColumn<Conversation, ConversationStatus> tEnumColumn = Conversation.STATUS;
        return mm6Var.sum(Filter.AND(filterM61360EQ, tEnumColumn.NEQ(ConversationStatus.local_fake), tEnumColumn.NEQ("deleted"), tEnumColumn.NEQ("removed"), tEnumColumn.NEQ(ConversationStatus.invisible), tEnumColumn.NEQ("dismissed")), Conversation.UNREADMESSAGES);
    }

    /* JADX INFO: renamed from: pp */
    public void m34091pp() {
        l51.m152920z(new Runnable() { // from class: l.nc8
            @Override // java.lang.Runnable
            public final void run() {
                this.f141322a.m33878Yl();
            }
        }, false);
    }

    /* JADX INFO: renamed from: pq */
    public void m34092pq(final String str) {
        CoreModule.f18272k.f115535c.m189466b0(str).m208677m().filter(new qcj() { // from class: l.bc8
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(!jyb.m147479J((List) obj));
            }
        }).map(new qcj() { // from class: l.cc8
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return C4891g.m33250X4((List) obj);
            }
        }).take(1).subscribe(psd0.m173596G(new y20() { // from class: l.dc8
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f87757a.m33625Dm(str, (Message) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: qe */
    public C22421c<uxj0> m34093qe(final String str, final Act act) {
        return this.f91137Q.scheduled("block", -1, new pcj() { // from class: l.f28
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f96860a.m33719Lh(str, act);
            }
        });
    }

    /* JADX INFO: renamed from: qf, reason: merged with bridge method [inline-methods] */
    public void m33731Mh(String str) {
        m34107rf(str, false);
    }

    /* JADX INFO: renamed from: qg */
    public List<Message> m34095qg(String str, double d2) {
        t600 t600Var = CoreModule.f18272k.f115535c;
        Filter<Message> filterMo61359EQ = Message.CID.mo61359EQ(str);
        DoubleColumn<Message> doubleColumn = Message.CREATEDTIME;
        return Lists.m15984q(t600Var.query(Filter.AND(filterMo61359EQ, doubleColumn.REQ(Double.valueOf(d2 + 1.0d))), doubleColumn.DESC, -1));
    }

    /* JADX INFO: renamed from: qh */
    public C22421c<vg60<Conversation>> m34096qh() {
        return m33752Oe(m33728Me().m158984A0());
    }

    /* JADX INFO: renamed from: qi */
    public final /* synthetic */ uxj0 m34097qi(final String str) throws Exception {
        this.f91137Q.f20351U.m128074a(new x20() { // from class: l.qy7
            @Override // p153l.x20
            public final void call() {
                C4891g.m33455p3(str);
            }
        });
        return uxj0.f181467a;
    }

    /* JADX INFO: renamed from: qj */
    public final /* synthetic */ void m34098qj(DbLinks dbLinks) {
        if (this.f20732x2 && !this.f20735y2) {
            m33690Io(Links.decodedApiTime(dbLinks.links.previous, "since")).subscribe(psd0.m173597H(new y20() { // from class: l.r38
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f161015a.m34085pj((uxj0) obj);
                }
            }, new y20() { // from class: l.s38
                @Override // p153l.y20
                public final void call(Object obj) {
                    C4891g.m33316cd((Throwable) obj);
                }
            }));
        }
        if (this.f20630P2) {
            return;
        }
        m33578Ae();
        this.f20630P2 = true;
    }

    /* JADX INFO: renamed from: qk */
    public final /* synthetic */ uxj0 m34099qk(Message message, x20 x20Var, Envelope envelope) {
        if (!jyb.m147479J(((CoreData) envelope.getModuleData(CoreData.class)).messages) && TextUtils.equals(((CoreData) envelope.getModuleData(CoreData.class)).messages.get(0).f56859id, message.f56859id)) {
            ((CoreData) envelope.getModuleData(CoreData.class)).messages.get(0).cid = message.cid;
        }
        this.f91137Q.m32495w3(envelope, x20Var);
        return uxj0.f181467a;
    }

    /* JADX INFO: renamed from: ql */
    public final /* synthetic */ void m34100ql(Envelope envelope) {
        this.f91137Q.m32495w3(envelope, new x20() { // from class: l.cb8
            @Override // p153l.x20
            public final void call() {
                C4891g.m33477r3();
            }
        });
    }

    /* JADX INFO: renamed from: qm */
    public final /* synthetic */ void m34101qm() {
        this.f91137Q.f20384f0.m33962fn(null);
        this.f91137Q.f20384f0.m33653Fo();
        CoreModule.f18264c.f20384f0.m33941dq(uqb0.f180376H.guessedCurrentServerTime());
    }

    /* JADX INFO: renamed from: qn */
    public C22421c<List<Conversation>> m34102qn() {
        return CoreModule.f18272k.f115545m.m159007X0(pzi0.m174453n()).m208677m();
    }

    /* JADX INFO: renamed from: qo */
    public C22421c<List<Conversation>> m34103qo() {
        return CoreModule.f18272k.f115545m.f137508z.m208677m();
    }

    /* JADX INFO: renamed from: qp */
    public C22421c<uxj0> m34104qp(String str, String str2, Report report) {
        return this.f91137Q.f20360X.m174051h3(C4879a.m32216J0("/conversations/" + str + "/messages/" + str2 + "/reports"), report);
    }

    /* JADX INFO: renamed from: qq */
    public void m34105qq(final double d2) {
        l51.m152919y(new Runnable() { // from class: l.ac8
            @Override // java.lang.Runnable
            public final void run() {
                this.f69682a.m33638Em(d2);
            }
        });
    }

    /* JADX INFO: renamed from: re, reason: merged with bridge method [inline-methods] */
    public C22421c<uxj0> m34189xl(final String str) {
        return this.f91137Q.scheduled("blocked", -1, new pcj() { // from class: l.s28
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f165868a.m33755Oh(str);
            }
        });
    }

    /* JADX INFO: renamed from: rf */
    public void m34107rf(String str, boolean z) {
        tu2.m192703a("db_deleteConversationAndRelated", "id:" + str);
        if (z) {
            return;
        }
        CoreModule.f18272k.f115545m.delete(Conversation.f21114ID.mo61359EQ(str));
        CoreModule.f18272k.f115535c.m189448J(str);
        CoreModule.f18272k.f115536d.delete(str);
        CoreModule.m30932N().mo61588yj(str);
        CoreModule.f18272k.f115544l.delete(str);
        if (gta.m132210e().m132214d().mo34811c() && TextUtils.equals(str, gta.m132210e().m132214d().mo34780Wj())) {
            uqb0.f180405k0.f184355d.delete(str);
        }
    }

    /* JADX INFO: renamed from: rg */
    public C22421c<Boolean> m34108rg(final String str) {
        return this.f91137Q.scheduled("get_other_share_status" + str, 0, new pcj() { // from class: l.a88
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return qi20.m176654a(new pcj() { // from class: l.jy7
                    @Override // p153l.pcj, java.util.concurrent.Callable
                    public final Object call() {
                        return C4879a.f20236P.auth().m209043q(C4879a.m32203G("/users/" + str + "/settings?&type=default")).m209032f().m209028b();
                    }
                }).map(new qcj() { // from class: l.ky7
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return C4891g.m33459p7((Envelope) obj);
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: rh */
    public C22421c<vg60<Conversation>> m34109rh() {
        return m33752Oe(m33728Me().m158985B0());
    }

    /* JADX INFO: renamed from: ri */
    public final /* synthetic */ uxj0 m34110ri(final String str) throws Exception {
        this.f91137Q.f20351U.m128074a(new x20() { // from class: l.ss7
            @Override // p153l.x20
            public final void call() {
                C4891g.m33156Oa(str);
            }
        });
        return uxj0.f181467a;
    }

    /* JADX INFO: renamed from: rj */
    public final /* synthetic */ uxj0 m34111rj(final DbLinks dbLinks) throws Exception {
        DbLinks dbLinksM33750No;
        Envelope envelopeM165964c;
        final String strM32375y0 = C4879a.m32375y0(dbLinks.links.previous);
        final Envelope envelopeM165963b = new ti20(new pcj() { // from class: l.xy7
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4879a.f20236P.auth().m209043q(strM32375y0).m209032f().m209028b();
            }
        }).toBlocking().m165963b();
        CoreModule.f18264c.f20390h0.m107384m3(envelopeM165963b);
        final ArrayList arrayList = new ArrayList();
        final ArrayList arrayList2 = new ArrayList();
        StringBuilder sb = null;
        if (!jyb.m147479J(((CoreData) envelopeM165963b.getModuleData(CoreData.class)).conversations)) {
            StringBuilder sb2 = null;
            for (int i = 0; i < ((CoreData) envelopeM165963b.getModuleData(CoreData.class)).conversations.size(); i++) {
                final Conversation conversation = ((CoreData) envelopeM165963b.getModuleData(CoreData.class)).conversations.get(i);
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
                        sb2.append((NullChecker.m82486a(conversation.status) && NullChecker.m82486a(conversation.status.toString())) ? conversation.status.toString() : "status_null");
                        sb2.append(SignParameters.NEW_LINE);
                    }
                    if (TEnum.equals(conversation.status, "default") && jyb.m147529r(CoreModule.f18272k.f115535c.m189461W(conversation.f56859id).m208674j(), new qcj() { // from class: l.yy7
                        @Override // p153l.qcj
                        public final Object call(Object obj) {
                            return Boolean.valueOf(TEnum.equals(((Message) obj).status(), "normal"));
                        }
                    }) != null) {
                        if (!gta.m132210e().m132214d().mo34679E() || !gta.m132210e().m132214d().mo34730Nd(conversation)) {
                            PartialIdList partialIdList = conversation.api_only_messages;
                            String str = partialIdList == null ? null : (String) jyb.m147485P(partialIdList.ids);
                            while (true) {
                                PartialIdList partialIdList2 = conversation.api_only_messages;
                                if (partialIdList2 == null || partialIdList2.links.next == null || CoreModule.f18272k.f115535c.query(str) != null || (envelopeM165964c = new ti20(new pcj() { // from class: l.zy7
                                    @Override // p153l.pcj, java.util.concurrent.Callable
                                    public final Object call() {
                                        Conversation conversation2 = conversation;
                                        return C4879a.f20236P.auth().m209043q(C4879a.m32238P0(conversation2.f56859id, conversation2.api_only_messages.links.next)).m209032f().m209028b();
                                    }
                                }).toBlocking().m165964c(null)) == null) {
                                    break;
                                }
                                conversation.api_only_messages.links.next = envelopeM165964c.pagination.links.next;
                                envelopeM165963b.addAll(envelopeM165964c);
                                List<Message> list = ((CoreData) envelopeM165964c.getModuleData(CoreData.class)).messages;
                                if (list.isEmpty()) {
                                    break;
                                }
                                str = ((CoreData) envelopeM165964c.getModuleData(CoreData.class)).messages.get(list.size() - 1).f56859id;
                            }
                            PartialIdList partialIdList3 = conversation.api_only_messages;
                            if (partialIdList3 != null && partialIdList3.links.next != null && CoreModule.f18272k.f115535c.query(str) != null && (dbLinksM33750No = m33750No(conversation.f56859id)) != null) {
                                conversation.api_only_messages.links.next = dbLinksM33750No.links.next;
                            }
                        } else if (TextUtils.equals(gta.m132210e().m132214d().mo34799af(), conversation.otherUser)) {
                            m34213zj(conversation.f56859id);
                        }
                    }
                }
            }
            sb = sb2;
        }
        if (NullChecker.m82486a(sb)) {
            tu2.m192703a("loadNewConversationsDeleted", sb.toString());
        }
        String str2 = envelopeM165963b.pagination.links.previous;
        if (str2 != null) {
            dbLinks.links.previous = str2;
        }
        if (!jyb.m147479J(((CoreData) envelopeM165963b.getModuleData(CoreData.class)).conversations)) {
            ((CoreData) envelopeM165963b.getModuleData(CoreData.class)).conversations.removeAll(arrayList);
        }
        if (gta.m132210e().m132214d().mo34734Oc()) {
            gta.m132210e().m132214d().mo34736Oe(envelopeM165963b, strM32375y0, false);
        }
        this.f91137Q.m32497y3(envelopeM165963b, new x20() { // from class: l.cz7
            @Override // p153l.x20
            public final void call() {
                this.f84429a.m34059nj(envelopeM165963b, arrayList, arrayList2, dbLinks);
            }
        }, false, false, false);
        this.f20726v2.put(Long.valueOf(uqb0.f180376H.guessedCurrentServerTime()));
        if (jyb.m147479J(((CoreData) envelopeM165963b.getModuleData(CoreData.class)).conversations) || ((CoreData) envelopeM165963b.getModuleData(CoreData.class)).conversations.size() < envelopeM165963b.pagination.limit) {
            l51.m152888H(CoreModule.f18263b, new Runnable() { // from class: l.ez7
                @Override // java.lang.Runnable
                public final void run() {
                    this.f96567a.m34098qj(dbLinks);
                }
            }, 100L);
        } else {
            l51.m152888H(CoreModule.f18263b, new Runnable() { // from class: l.dz7
                @Override // java.lang.Runnable
                public final void run() {
                    this.f91327a.m34072oj(dbLinks);
                }
            }, 100L);
        }
        return uxj0.f181467a;
    }

    /* JADX INFO: renamed from: rk */
    public final /* synthetic */ C22421c m34112rk(final Message message, final x20 x20Var) {
        final Message message2 = new Message();
        message2.recalled = Boolean.TRUE;
        return new ti20((pcj<x1d0>) new pcj() { // from class: l.l98
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                Message message3 = message;
                return C4879a.f20236P.auth().m209043q(C4879a.m32245R0(message3.cid, message3.f56859id) + "&method=patch").m209038l(z1d0.create(Network.JSON, message2.toJson())).m209028b();
            }
        }, 0).map(new qcj() { // from class: l.m98
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f135356a.m34099qk(message, x20Var, (Envelope) obj);
            }
        }).compose(C4879a.m32255T2());
    }

    /* JADX INFO: renamed from: rl */
    public final /* synthetic */ void m34113rl(Message message, Throwable th) {
        final Message messageMo225055clone = message.mo225055clone();
        this.f91137Q.f20351U.m128074a(new x20() { // from class: l.ab8
            @Override // p153l.x20
            public final void call() {
                CoreModule.f18272k.f115535c.upsert(messageMo225055clone);
            }
        });
    }

    /* JADX INFO: renamed from: rm */
    public final /* synthetic */ uxj0 m34114rm(String str, uxj0 uxj0Var) {
        this.f20618L2.m137019l(str);
        CoreModule.f18264c.f20405m0.m31997E8(str);
        l51.m152888H(CoreModule.f18263b, new Runnable() { // from class: l.o58
            @Override // java.lang.Runnable
            public final void run() {
                this.f145040a.m34101qm();
            }
        }, 500L);
        return uxj0Var;
    }

    /* JADX INFO: renamed from: rn */
    public C22421c<List<Conversation>> m34115rn() {
        return (gta.m132210e().m132214d().mo34805b() ? m33728Me().m159008Y0() : m33728Me().m159009Z0()).m208677m();
    }

    /* JADX INFO: renamed from: ro, reason: merged with bridge method [inline-methods] */
    public C22421c<uxj0> m34061nl(final ConversationPatchRecord conversationPatchRecord) {
        return this.f91137Q.scheduled("patch_record_" + conversationPatchRecord.f56859id, -1, new pcj() { // from class: l.su7
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f170653a.m33758Ok(conversationPatchRecord);
            }
        });
    }

    /* JADX INFO: renamed from: rp */
    public final void m34117rp(Conversation conversation) {
        CrashHelper.m82479c(new Exception("Conv Banned change Error detail:" + conversation.toJson()));
    }

    /* JADX INFO: renamed from: rq */
    public C22421c<uxj0> m34118rq(final String str, final double d2) {
        return this.f91137Q.now(C22421c.fromCallable(new Callable() { // from class: l.q38
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f155430a.m33651Fm(str, d2);
            }
        }).compose(C4879a.m32255T2()));
    }

    /* JADX INFO: renamed from: se */
    public C22421c<uxj0> m34119se(String str) {
        return CoreModule.m30929H().userId().equals(str) ? C22421c.empty() : m33728Me().uiGet(str).filter(new qcj() { // from class: l.py7
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((Conversation) obj) == null);
            }
        }).map(new qcj() { // from class: l.az7
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return uxj0.f181467a;
            }
        });
    }

    /* JADX INFO: renamed from: sf */
    public void m34120sf(String str) {
        if (m34004jg(str, true)) {
            return;
        }
        CoreModule.f18272k.f115535c.m189448J(str);
        CoreModule.f18272k.f115536d.delete(str);
        CoreModule.f18272k.f115544l.delete(str);
    }

    /* JADX INFO: renamed from: sg */
    public C22421c<List<Prologue>> m34121sg(final String str, final String str2) {
        return this.f91137Q.scheduled("getPrologues", 0, new pcj() { // from class: l.e38
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return qi20.m176654a(new pcj() { // from class: l.b78
                    @Override // p153l.pcj, java.util.concurrent.Callable
                    public final Object call() {
                        return C4879a.f20236P.auth().m209043q(C4879a.m32210H2("/users/me/prologues/" + str + "?scene=" + str)).m209032f().m209028b();
                    }
                }).map(new qcj() { // from class: l.c78
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return ((CoreData) ((Envelope) obj).getModuleData(CoreData.class)).prologues;
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: sh */
    public C22421c<List<Conversation>> m34122sh() {
        return CoreModule.f18272k.f115545m.m158986C0().m180655b().m208677m();
    }

    /* JADX INFO: renamed from: si */
    public final /* synthetic */ void m34123si(final String str, final String str2) {
        this.f91137Q.f20351U.m128074a(new x20() { // from class: l.vs7
            @Override // p153l.x20
            public final void call() {
                CoreModule.f18272k.f115535c.delete(Filter.AND(Message.CID.mo61359EQ(str), Message.MESSAGETYPE.m61360EQ(str2)));
            }
        });
    }

    /* JADX INFO: renamed from: sj */
    public final /* synthetic */ void m34124sj(ChatNewMatchEnvelope chatNewMatchEnvelope, List list, String str, String str2, int i) {
        m33927cn(chatNewMatchEnvelope.pagination.links.next, list, str, str2, i);
    }

    /* JADX INFO: renamed from: sk */
    public final /* synthetic */ void m34125sk(Envelope envelope, String str, String str2, boolean z, String str3) {
        if (!jyb.m147479J(((CoreData) envelope.getModuleData(CoreData.class)).messages)) {
            for (Message message : ((CoreData) envelope.getModuleData(CoreData.class)).messages) {
                if (TextUtils.equals(str, message.f56859id) && !TextUtils.isEmpty(str2) && NullChecker.m82486a(message.getAiChatMessageExtraInfo())) {
                    message.getAiChatMessageExtraInfo().scene = str2;
                }
                if (TextUtils.equals(str, message.f56859id) && TEnum.equals(message.status, "deleted") && z) {
                    this.f20624N2.put(str, message);
                    this.f20627O2.m137019l(uxj0.f181467a);
                }
                if (message.isGroupMessage()) {
                    message.cid = str3;
                }
            }
        }
        m34133tf(envelope);
    }

    /* JADX INFO: renamed from: sl */
    public final /* synthetic */ C22421c m34126sl(final Message message, String str, final String str2, final String str3) {
        final Message messageMo225055clone = message.mo225055clone();
        if (messageMo225055clone.additionalData == null) {
            messageMo225055clone.additionalData = MessageAdditionalData.new_();
        }
        MessageAdditionalData messageAdditionalData = messageMo225055clone.additionalData;
        if (messageAdditionalData.harassAlertInfo == null) {
            messageAdditionalData.harassAlertInfo = HarassAlertInfo.new_();
        }
        messageMo225055clone.additionalData.harassAlertInfo.status = str;
        return qi20.m176658e(new pcj() { // from class: l.g98
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4879a.f20236P.auth().m209043q(C4879a.m32257U0("/conversations/" + str2 + "/messages/" + str3 + "?action=feedbackHarassAlert&method=patch")).m209038l(z1d0.create(Network.JSON, messageMo225055clone.toJson())).m209028b();
            }
        }).doOnNext(new y20() { // from class: l.i98
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f113430a.m34100ql((Envelope) obj);
            }
        }).doOnError(new y20() { // from class: l.j98
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f118856a.m34113rl(message, (Throwable) obj);
            }
        }).map(new qcj() { // from class: l.k98
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return uxj0.f181467a;
            }
        });
    }

    /* JADX INFO: renamed from: sm */
    public final /* synthetic */ C22421c m34127sm(final String str) {
        return new ti20(new pcj() { // from class: l.u08
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4879a.f20236P.auth().m209043q(C4879a.m32370x(str)).m209037k(z1d0.create(Network.JSON, "{\"status\":\"default\"}")).m209028b();
            }
        }).doOnError(new y20() { // from class: l.v08
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f181840a.m34049mm(str, (Throwable) obj);
            }
        }).map(new qcj() { // from class: l.w08
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f186546a.m34088pm(str, (Envelope) obj);
            }
        }).compose(psd0.m173592C()).map(new qcj() { // from class: l.x08
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f191873a.m34114rm(str, (uxj0) obj);
            }
        });
    }

    /* JADX INFO: renamed from: sn */
    public C22421c<vg60<Conversation>> m34128sn() {
        return psd0.m173625r(m34141tn(), uqb0.f180405k0.f184354c.uiGet(SchemeKey.conversations), new rcj() { // from class: l.oc8
            @Override // p153l.rcj
            public final Object call(Object obj, Object obj2) {
                return this.f146666a.m33697Jj((List) obj, (DbLinks) obj2);
            }
        });
    }

    /* JADX INFO: renamed from: so */
    public C22421c<uxj0> m34129so(final String str) {
        return this.f91137Q.scheduled("patch", -1, new pcj() { // from class: l.sy7
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f171213a.m33686Ik(str);
            }
        });
    }

    /* JADX INFO: renamed from: sp */
    public void m34130sp() {
        final String str = this.f20610J0.get();
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f91137Q.scheduled("remote/male/countdownlike/" + str, -1, new pcj() { // from class: l.h58
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return qi20.m176654a(new pcj() { // from class: l.a78
                    @Override // p153l.pcj, java.util.concurrent.Callable
                    public final Object call() {
                        return C4879a.f20236P.auth().m209043q(C4879a.m32216J0("/countdown-likes/" + str)).m209030d().m209028b();
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: sq */
    public C22421c<uxj0> m34131sq(final String str, final double d2) {
        return this.f91137Q.now(C22421c.fromCallable(new Callable() { // from class: l.p58
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f150623a.m33664Gm(str, d2);
            }
        }).compose(C4879a.m32255T2()));
    }

    /* JADX INFO: renamed from: te */
    public Message m34132te(String str, List<BreakIce> list) {
        Message messageNew_ = Message.new_();
        messageNew_.messageType = MessageType.get(MessageType.local_break_ice);
        messageNew_.cid = str;
        messageNew_.localInConversation = true;
        long jM174454o = pzi0.m174454o();
        messageNew_.owner = CoreModule.m30929H().userId();
        messageNew_.createdTime = jM174454o;
        messageNew_.localCreatedTime = jM174454o;
        messageNew_.recalled = Boolean.FALSE;
        messageNew_.hostId = CoreModule.m30929H().userId();
        vxd0 vxd0Var = App.f16092i;
        messageNew_.localCreatedSession = vxd0Var.get().intValue();
        messageNew_.f56859id = DbObject.GENERATE_UNIQUE_FAKE_ID(vxd0Var.get().intValue());
        MessageAdditionalData messageAdditionalDataNew_ = MessageAdditionalData.new_();
        messageNew_.additionalData = messageAdditionalDataNew_;
        messageAdditionalDataNew_.localBreakIce = list;
        messageNew_.value = String.format("帮你准备了%d句开场白，点击发送", Integer.valueOf(list.size() > 2 ? list.size() : 2));
        return messageNew_;
    }

    /* JADX INFO: renamed from: tf */
    public void m34133tf(Envelope envelope) {
        m34146uf(envelope, false);
    }

    /* JADX INFO: renamed from: tg */
    public List<Message> m34134tg(String str) {
        return Lists.m15984q(CoreModule.f18272k.f115535c.query(Message.CID.mo61359EQ(str), Message.CREATEDTIME.DESC, 20));
    }

    /* JADX INFO: renamed from: th */
    public C22421c<uxj0> m34135th(String str) {
        final JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        try {
            jSONObject3.put("inviteOther", true);
            jSONObject2.put("verify", jSONObject3);
            jSONObject.put("additional", jSONObject2);
        } catch (Exception e) {
            CrashHelper.m82479c(e);
        }
        final String str2 = String.format("/conversations/%s?method=patch", str);
        return this.f91137Q.scheduled(str2, -1, new pcj() { // from class: l.gu7
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return qi20.m176658e(new pcj() { // from class: l.wy7
                    @Override // p153l.pcj, java.util.concurrent.Callable
                    public final Object call() {
                        return C4879a.f20236P.auth().m209043q(C4879a.m32257U0(str)).m209038l(z1d0.create(Network.JSON, jSONObject.toString())).m209028b();
                    }
                });
            }
        }).compose(psd0.m173592C()).map(new qcj() { // from class: l.hu7
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return uxj0.f181467a;
            }
        });
    }

    /* JADX INFO: renamed from: ti */
    public final /* synthetic */ void m34136ti(final String str, final List list) {
        this.f91137Q.f20351U.m128074a(new x20() { // from class: l.ry7
            @Override // p153l.x20
            public final void call() {
                CoreModule.f18272k.f115535c.delete(Filter.AND(Message.CID.mo61359EQ(str), Message.MESSAGETYPE.m61361IN(list)));
            }
        });
    }

    /* JADX INFO: renamed from: tj */
    public final /* synthetic */ uxj0 m34137tj(final String str, final String str2, final List list, final int i, final ChatNewMatchEnvelope chatNewMatchEnvelope) {
        if (!jyb.m147479J(chatNewMatchEnvelope.data.users)) {
            for (User user : chatNewMatchEnvelope.data.users) {
                if (!TextUtils.equals(user.f56859id, str) && !TextUtils.equals(user.f56859id, str2)) {
                    list.add(user.f56859id);
                }
            }
        }
        if (TextUtils.isEmpty(chatNewMatchEnvelope.pagination.links.next) || jyb.m147479J(chatNewMatchEnvelope.data.users) || list.size() >= i) {
            k05.m147755h().m147773u(list.subList(0, Math.min(list.size(), i)));
        } else {
            l51.m152888H(CoreModule.f18263b, new Runnable() { // from class: l.jt7
                @Override // java.lang.Runnable
                public final void run() {
                    this.f122555a.m34124sj(chatNewMatchEnvelope, list, str, str2, i);
                }
            }, 10L);
        }
        return uxj0.f181467a;
    }

    /* JADX INFO: renamed from: tk */
    public final /* synthetic */ Message m34138tk(final String str, final String str2, final boolean z, final String str3, final Envelope envelope) {
        this.f91137Q.m32495w3(envelope, new x20() { // from class: l.w48
            @Override // p153l.x20
            public final void call() {
                this.f187355a.m34125sk(envelope, str, str2, z, str3);
            }
        });
        if (jyb.m147479J(((CoreData) envelope.getModuleData(CoreData.class)).messages)) {
            return null;
        }
        Message message = ((CoreData) envelope.getModuleData(CoreData.class)).messages.get(0);
        if (message != null && message.recalled.booleanValue()) {
            l51.m152887G(new x48(this));
        }
        return message;
    }

    /* JADX INFO: renamed from: tl */
    public final /* synthetic */ uxj0 m34139tl(Envelope envelope) {
        this.f91137Q.m32495w3(envelope, null);
        return uxj0.f181467a;
    }

    /* JADX INFO: renamed from: tm */
    public final /* synthetic */ void m34140tm(Envelope envelope) {
        m34195ye(envelope);
        m34146uf(envelope, false);
        m34220zq(((CoreData) envelope.getModuleData(CoreData.class)).conversations);
    }

    /* JADX INFO: renamed from: tn */
    public C22421c<List<Conversation>> m34141tn() {
        return gta.m132210e().m132214d().mo34805b() ? m33728Me().f137500r.m208677m() : m33728Me().f137501s.m208677m();
    }

    /* JADX INFO: renamed from: to */
    public C22421c<uxj0> m34142to(Message message, String str) {
        if (message == null) {
            return null;
        }
        final Message messageMo225055clone = message.mo225055clone();
        if (messageMo225055clone.additionalData == null) {
            messageMo225055clone.additionalData = MessageAdditionalData.new_();
        }
        MessageAdditionalData messageAdditionalData = messageMo225055clone.additionalData;
        if (messageAdditionalData.aiPicture == null) {
            messageAdditionalData.aiPicture = AiPicture.new_();
        }
        messageMo225055clone.additionalData.aiPicture.likeStatus = str;
        return this.f91137Q.scheduled("patchAiPictureMessage" + messageMo225055clone.f56859id, -1, new pcj() { // from class: l.q58
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f155675a.m33782Qk(messageMo225055clone);
            }
        });
    }

    /* JADX INFO: renamed from: tp */
    public void m34143tp() {
        final String strM32214I2 = C4879a.m32214I2("/chat-page");
        final JsonObject jsonObject = new JsonObject();
        try {
            jsonObject.addProperty("enterNewMatchPage", Boolean.TRUE);
        } catch (Exception unused) {
        }
        this.f91137Q.scheduled("/me/chat-page/post", -1, new pcj() { // from class: l.kc8
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return qi20.m176658e(new pcj() { // from class: l.ww7
                    @Override // p153l.pcj, java.util.concurrent.Callable
                    public final Object call() {
                        return C4879a.f20236P.auth().m209043q(str).m209038l(z1d0.create(Network.JSON, jsonObject.toString())).m209028b();
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: tq */
    public C22421c<uxj0> m34144tq(final String str, final double d2) {
        return this.f91137Q.now(C22421c.fromCallable(new Callable() { // from class: l.v28
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f182081a.m33676Hm(str, d2);
            }
        }).compose(C4879a.m32255T2()));
    }

    /* JADX INFO: renamed from: ue, reason: merged with bridge method [inline-methods] */
    public final ConversationCounter m34215zl(double d2) {
        Filter filterAND;
        Integer num;
        this.f20681g2 = d2;
        if (l9c.m153394o().m153406l()) {
            return this.f20729w2.m222761e();
        }
        System.nanoTime();
        if (gta.m132210e().m132214d().mo34805b()) {
            StringColumn<Conversation> stringColumn = Conversation.f21114ID;
            Filter filterM82444OR = Filter.m82444OR(stringColumn.NOT_STARTS_WITH("fake_conversation"), stringColumn.STARTS_WITH("fake_conversation_profile_like_enter"), stringColumn.STARTS_WITH("fake_conversation_city_centre_enter"));
            TEnumColumn<Conversation, ConversationStatus> tEnumColumn = Conversation.STATUS;
            filterAND = Filter.AND(filterM82444OR, tEnumColumn.NEQ("removed"), tEnumColumn.NEQ(ConversationStatus.invisible), tEnumColumn.NEQ("deleted"));
        } else {
            StringColumn<Conversation> stringColumn2 = Conversation.f21114ID;
            Filter<Conversation> filterNOT_STARTS_WITH = stringColumn2.NOT_STARTS_WITH("fake_conversation");
            Filter<Conversation> filterNEQ = stringColumn2.NEQ(User.ID_LIVE_VIP_SERVICE);
            Filter<Conversation> filterNEQ2 = stringColumn2.NEQ(User.ID_LIVE_SERVICE);
            TEnumColumn<Conversation, ConversationStatus> tEnumColumn2 = Conversation.STATUS;
            filterAND = Filter.AND(filterNOT_STARTS_WITH, filterNEQ, filterNEQ2, tEnumColumn2.NEQ("removed"), tEnumColumn2.NEQ(ConversationStatus.invisible), tEnumColumn2.NEQ("deleted"));
        }
        Filter<Conversation> filterNEQ3 = gta.m132210e().m132214d().mo34661B() ? Conversation.f21114ID.NEQ(User.LOCAL_ID_INTL_SEE_LETTER) : Filter.TRUE;
        Filter<Conversation> filterM159020i1 = CoreModule.f18272k.f115545m.m159020i1();
        Filter<Conversation> filterM82406F = Filter.TRUE;
        if (gta.m132210e().m132214d().mo34679E()) {
            filterM82406F = Conversation.MUTED.m82406F();
        }
        mm6 mm6Var = CoreModule.f18272k.f115545m;
        TEnumColumn<Conversation, ConversationStatus> tEnumColumn3 = Conversation.STATUS;
        int iCount = mm6Var.count(Filter.AND(Filter.AND(tEnumColumn3.NEQ("dismissed"), tEnumColumn3.NEQ(ConversationStatus.local_fake), tEnumColumn3.NEQ("removed"), tEnumColumn3.NEQ(ConversationStatus.invisible), tEnumColumn3.NEQ("deleted")), filterAND, filterNEQ3), -1);
        int iM208669e = CoreModule.f18272k.f115545m.m159015f1().m208669e();
        mm6 mm6Var2 = CoreModule.f18272k.f115545m;
        StringColumn<Conversation> stringColumn3 = Conversation.f21114ID;
        Filter<Conversation> filterNOT_STARTS_WITH2 = stringColumn3.NOT_STARTS_WITH("fake_conversation");
        BooleanColumn<Conversation> booleanColumn = Conversation.READ;
        Filter<Conversation> filterM82406F2 = booleanColumn.m82406F();
        Filter filterAND2 = Filter.AND(tEnumColumn3.NEQ("dismissed"), tEnumColumn3.NEQ(ConversationStatus.local_fake), tEnumColumn3.NEQ("removed"), tEnumColumn3.NEQ(ConversationStatus.invisible), tEnumColumn3.NEQ("deleted"));
        Filter<Conversation> filterM180655b = CoreModule.f18272k.f115545m.f137503u.m180655b();
        BooleanColumn<Conversation> booleanColumn2 = Conversation.LOCALEVERHASMESSAGE;
        int iCount2 = mm6Var2.count(Filter.AND(filterNOT_STARTS_WITH2, filterM82406F2, filterAND2, filterM180655b, booleanColumn2.m82406F(), filterM159020i1), -1);
        double dM174454o = pzi0.m174454o() - (((long) gta.m132210e().m132214d().mo34704Ih()) * com.clevertap.android.sdk.Constants.ONE_MIN_IN_MILLIS);
        Filter filterAND3 = Filter.AND(CoreModule.f18272k.f115545m.m159010a1().toFilters());
        Filter<Conversation> filterM82406F3 = booleanColumn.m82406F();
        Filter<Conversation> filterM82406F4 = booleanColumn2.m82406F();
        Filter<Conversation> filterREQ = Conversation.CREATEDTIME.REQ(Double.valueOf(m33943eg()));
        DoubleColumn<Conversation> doubleColumn = Conversation.ADDITIONAL_NEWMATCH_LABELEXPOSURETIME;
        int iCount3 = CoreModule.f18272k.f115545m.count(Filter.AND(filterAND3, filterM82406F3, filterM82406F4, filterREQ, Filter.m82444OR(doubleColumn.LEQ(Double.valueOf(1.0d)), doubleColumn.REQ(Double.valueOf(dM174454o)))), -1);
        Filter filterAND4 = gta.m132210e().m132214d().mo34942vp() ? Filter.AND(filterAND, filterM82406F, filterNEQ3, stringColumn3.NEQ(User.ID_TEAM_ACCOUNT)) : Filter.AND(filterAND, filterM82406F, filterNEQ3);
        Filter<Conversation> filterNEQ4 = stringColumn3.NEQ(User.ID_TEAM_ACCOUNT);
        StringColumn<Conversation> stringColumn4 = Conversation.CONVTYPE;
        Filter<Conversation> filterMo61359EQ = stringColumn4.mo61359EQ("heartbeatMatch");
        Filter<Conversation> filterMo61359EQ2 = stringColumn4.mo61359EQ("quickchat");
        DoubleColumn<Conversation> doubleColumn2 = Conversation.LATESTTIME;
        Filter filterM82444OR2 = Filter.m82444OR(filterMo61359EQ, filterMo61359EQ2, doubleColumn2.REQ(Double.valueOf(this.f20681g2 - (((long) (gta.m132210e().m132214d().mo34935uc() * MMKV.ExpireInHour)) * 1000))));
        if (gta.m132210e().m132214d().mo34827f8()) {
            filterAND4 = Filter.AND(filterAND4, filterNEQ4);
        } else if (gta.m132210e().m132214d().mo34666Bt()) {
            filterAND4 = Filter.AND(filterAND4, filterNEQ4, filterM82444OR2);
        }
        double dMo34900os = gta.m132210e().m132214d().mo34900os();
        if (dMo34900os > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            num = 1;
            filterAND4 = Filter.AND(filterAND4, Filter.m82444OR(Conversation.LEVEL.REQ(1), doubleColumn2.REQ(Double.valueOf(dMo34900os))));
        } else {
            num = 1;
        }
        if (gta.m132210e().m132214d().mo34923sa()) {
            filterAND4 = Filter.AND(filterAND4, m33728Me().f137492W);
        }
        mm6 mm6Var3 = CoreModule.f18272k.f115545m;
        IntegerColumn<Conversation> integerColumn = Conversation.UNREADMESSAGES;
        int iSum = mm6Var3.sum(filterAND4, integerColumn);
        this.f20717s2 = CoreModule.f18272k.f115545m.sum(f20582c3, integerColumn);
        if (dMo34900os > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            filterAND = Filter.AND(filterAND, Filter.m82444OR(Conversation.LEVEL.REQ(num), doubleColumn2.REQ(Double.valueOf(dMo34900os))));
        }
        int iSum2 = CoreModule.f18272k.f115545m.sum(Filter.AND(Conversation.OTHERUSER.mo61359EQ(User.ID_TEAM_ACCOUNT), filterAND), integerColumn);
        List<Conversation> listQuery = CoreModule.f18272k.f115545m.query(filterAND4, doubleColumn2.DESC, gta.m132210e().m132214d().mo34722Mg());
        ArrayList arrayList = new ArrayList();
        for (Conversation conversation : listQuery) {
            UnreadDetail unreadDetailNew_ = UnreadDetail.new_();
            unreadDetailNew_.unread = conversation.unreadMessages;
            unreadDetailNew_.userID = conversation.otherUser;
            arrayList.add(unreadDetailNew_);
        }
        int iSum3 = CoreModule.f18272k.f115545m.sum(Filter.AND(Conversation.CONVTYPE.mo61359EQ("marriage"), filterAND), Conversation.UNREADMESSAGES);
        ConversationCounter conversationCounterNew_ = ConversationCounter.new_();
        CounterConversations counterConversations = conversationCounterNew_.conversations;
        counterConversations.total = iCount;
        counterConversations.unread = iM208669e;
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
    public final void m34146uf(Envelope envelope, boolean z) {
        if (jyb.m147479J(((CoreData) envelope.getModuleData(CoreData.class)).conversations)) {
            return;
        }
        for (final Conversation conversation : ((CoreData) envelope.getModuleData(CoreData.class)).conversations) {
            if (conversation != null) {
                DbLinks dbLinksM33750No = m33750No(conversation.f56859id);
                if (dbLinksM33750No == null) {
                    dbLinksM33750No = new DbLinks();
                    dbLinksM33750No.f56859id = conversation.f56859id;
                }
                if (!gta.m132210e().m132214d().mo34679E() || !gta.m132210e().m132214d().mo34730Nd(conversation) || z) {
                    PartialIdList partialIdList = conversation.api_only_messages;
                    dbLinksM33750No.links = partialIdList == null ? new Links() : partialIdList.links;
                } else if (!NullChecker.m82486a(dbLinksM33750No.links)) {
                    PartialIdList partialIdList2 = conversation.api_only_messages;
                    dbLinksM33750No.links = partialIdList2 == null ? new Links() : partialIdList2.links;
                }
                CoreModule.f18272k.f115536d.upsert(dbLinksM33750No);
                if (gta.m132210e().m132214d().mo34679E() && gta.m132210e().m132214d().mo34730Nd(conversation) && NullChecker.m82486a(dbLinksM33750No.links) && !TextUtils.isEmpty(dbLinksM33750No.links.next) && z) {
                    final String str = dbLinksM33750No.links.next;
                    l51.m152887G(new Runnable() { // from class: l.vy7
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f186342a.m33934di(conversation, str);
                        }
                    });
                }
            }
        }
    }

    /* JADX INFO: renamed from: ug */
    public C22421c<List<FriendInfo>> m34147ug() {
        this.f20661a0 = pzi0.m174454o();
        final String strM211111m = xi5.m211111m("search=suggested&with=users");
        return this.f91137Q.scheduled("conversations/get/online", 0, new pcj() { // from class: l.hz7
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f112214a.m33792Ri(strM211111m);
            }
        });
    }

    /* JADX INFO: renamed from: uh */
    public boolean m34148uh(String str) {
        Conversation conversationM34219zp = m34219zp(str);
        return NullChecker.m82486a(conversationM34219zp) && TEnum.equals(conversationM34219zp.status, "blocked");
    }

    /* JADX INFO: renamed from: ui */
    public final /* synthetic */ void m34149ui(final List list, Envelope envelope) {
        this.f91137Q.f20351U.m128074a(new x20() { // from class: l.aa8
            @Override // p153l.x20
            public final void call() {
                C4891g.m33348f9(list);
            }
        });
    }

    /* JADX INFO: renamed from: uj */
    public final /* synthetic */ C22421c m34150uj(final String str, final String str2, final String str3, final List list, final int i) {
        return qi20.m176656c(new pcj() { // from class: l.dt7
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4891g.m32995A3(str);
            }
        }, ChatNewMatchEnvelope.JSON_ADAPTER).map(new qcj() { // from class: l.et7
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f95697a.m34137tj(str2, str3, list, i, (ChatNewMatchEnvelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: uk */
    public final /* synthetic */ C22421c m34151uk(final String str, final String str2, final boolean z, final String str3, final boolean z2) {
        return qi20.m176658e(new pcj() { // from class: l.uz7
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4879a.f20236P.auth().m209043q(C4879a.m32235O0(str, str2, z)).m209032f().m209028b();
            }
        }).map(new qcj() { // from class: l.vz7
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f186447a.m34138tk(str2, str3, z2, str, (Envelope) obj);
            }
        }).compose(C4879a.m32255T2());
    }

    /* JADX INFO: renamed from: ul */
    public final /* synthetic */ C22421c m34152ul(final String str, final Conversation conversation) {
        return conversation != null ? new ti20(new pcj() { // from class: l.r78
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4879a.f20236P.auth().m209043q(C4879a.m32179A(str) + "&method=patch").m209038l(z1d0.create(Network.JSON, conversation.toJson())).m209028b();
            }
        }).map(new qcj() { // from class: l.s78
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f166649a.m34139tl((Envelope) obj);
            }
        }) : C22421c.empty();
    }

    /* JADX INFO: renamed from: um */
    public final /* synthetic */ void m34153um(Envelope envelope, Long l2) {
        m33810Sp(envelope.pagination.links);
    }

    /* JADX INFO: renamed from: un */
    public C22421c<vg60<Conversation>> m34154un() {
        return m33752Oe(m33728Me().f137499q);
    }

    /* JADX INFO: renamed from: uo */
    public C22421c<pf60<Meta, Conversation>> m34155uo(final String str, final boolean z) {
        return scheduled("hide_conversation/" + str, -1, new pcj() { // from class: l.n98
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return qi20.m176658e(new pcj() { // from class: l.ya8
                    @Override // p153l.pcj, java.util.concurrent.Callable
                    public final Object call() {
                        return C4891g.m33098J7(z, str);
                    }
                });
            }
        }).doOnNext(new y20() { // from class: l.o98
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f145505a.m33794Rk((Envelope) obj);
            }
        }).map(new qcj() { // from class: l.p98
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f151115a.m33805Sk(str, (Envelope) obj);
            }
        }).observeOn(fo0.m126432a());
    }

    /* JADX INFO: renamed from: up */
    public C22421c<Envelope> m34156up() {
        return this.f91137Q.scheduled("report_suggest_conv_online_notifications", -1, new pcj() { // from class: l.rv7
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return qi20.m176654a(new pcj() { // from class: l.k18
                    @Override // p153l.pcj, java.util.concurrent.Callable
                    public final Object call() {
                        return C4879a.f20236P.auth().m209043q(C4879a.m32216J0("/online-notifications")).m209038l(z1d0.create(Network.JSON, "")).m209028b();
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: uq */
    public C22421c<uxj0> m34157uq(final String str, final double d2, final int i) {
        return this.f91137Q.now(C22421c.fromCallable(new Callable() { // from class: l.uy7
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f181541a.m33688Im(str, d2, i);
            }
        }).compose(C4879a.m32255T2()));
    }

    /* JADX INFO: renamed from: ve */
    public final void m34158ve(final Message message, final int i, final y20<Message> y20Var) {
        this.f91137Q.f20351U.m128074a(new x20() { // from class: l.dx7
            @Override // p153l.x20
            public final void call() {
                C4891g.m33375hc(message, i, y20Var);
            }
        });
    }

    /* JADX INFO: renamed from: vf */
    public void m34159vf(User user) {
        if (m33738Mo(user.f56859id) == null) {
            Conversation conversationNew_ = Conversation.new_();
            double d2 = user.localRelationship.createdTime;
            conversationNew_.createdTime = d2;
            conversationNew_.latestTime = d2;
            String str = user.f56859id;
            conversationNew_.otherUser = str;
            conversationNew_.f56859id = str;
            conversationNew_.convType = "default";
            conversationNew_.read = Boolean.FALSE;
            conversationNew_.isFake = true;
            conversationNew_.readUntil = "";
            conversationNew_.localNotificationStatus = NotificationStatus.get("removed");
            conversationNew_.importance = StickStatus.get("normal");
            DbLinks dbLinks = new DbLinks();
            dbLinks.f56859id = user.f56859id;
            dbLinks.links = new Links();
            CoreModule.f18272k.f115536d.upsert(dbLinks);
            CoreModule.f18272k.f115545m.upsert(conversationNew_);
        }
    }

    /* JADX INFO: renamed from: vg */
    public HashSet<String> m34160vg(boolean z) {
        return z ? this.f20600F2 : this.f20603G2;
    }

    /* JADX INFO: renamed from: vh */
    public boolean m34161vh(String str) {
        Conversation conversationM34219zp = m34219zp(str);
        return NullChecker.m82486a(conversationM34219zp) && TEnum.equals(conversationM34219zp.status, "dismissed");
    }

    /* JADX INFO: renamed from: vi */
    public final /* synthetic */ C22421c m34162vi(final String str, final List list, final JSONObject jSONObject) {
        return NullChecker.m82486a(jSONObject) ? qi20.m176658e(new pcj() { // from class: l.m88
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4879a.f20236P.auth().m209043q(C4879a.m32214I2("/conversations/" + str + "/messages?method=patch")).m209038l(z1d0.create(Network.JSON, jSONObject.toString())).m209028b();
            }
        }).doOnNext(new y20() { // from class: l.n88
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f140657a.m34149ui(list, (Envelope) obj);
            }
        }).compose(psd0.m173592C()).map(new qcj() { // from class: l.o88
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return uxj0.f181467a;
            }
        }) : C22421c.empty();
    }

    /* JADX INFO: renamed from: vk */
    public final /* synthetic */ uxj0 m34164vk(Envelope envelope) {
        if (!jyb.m147479J(((CoreData) envelope.getModuleData(CoreData.class)).messages)) {
            ((CoreData) envelope.getModuleData(CoreData.class)).messages.clear();
        }
        this.f91137Q.m32495w3(envelope, null);
        return uxj0.f181467a;
    }

    /* JADX INFO: renamed from: vl */
    public final /* synthetic */ void m34165vl(String str, Throwable th) {
        StringBuilder sb = new StringBuilder("cid:");
        sb.append(str);
        sb.append(" errorMessage:");
        sb.append(NullChecker.m82486a(th.getMessage()) ? th.getMessage() : "");
        tu2.m192703a("ConversationPatchDelete", sb.toString());
        m33666Go(th, str);
    }

    /* JADX INFO: renamed from: vm */
    public final /* synthetic */ uxj0 m34166vm(final boolean z, final NotificationStatus notificationStatus, final NotificationStatus notificationStatus2, final boolean z2) throws Exception {
        this.f91137Q.f20351U.m128074a(new x20() { // from class: l.r08
            @Override // p153l.x20
            public final void call() {
                C4891g.m33458p6(z, notificationStatus, notificationStatus2, z2);
            }
        });
        return uxj0.f181467a;
    }

    /* JADX INFO: renamed from: vn */
    public C22421c<vg60<Conversation>> m34167vn() {
        return m33752Oe(m33728Me().f137507y);
    }

    /* JADX INFO: renamed from: vo */
    public C22421c<pf60<Meta, Conversation>> m34168vo(final String str, final int i) {
        return scheduled("stick_top_conversation/" + str, -1, new pcj() { // from class: l.h28
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return qi20.m176658e(new pcj() { // from class: l.b38
                    @Override // p153l.pcj, java.util.concurrent.Callable
                    public final Object call() {
                        return C4891g.m33548x7(i, str);
                    }
                });
            }
        }).doOnNext(new y20() { // from class: l.i28
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f112588a.m33817Tk((Envelope) obj);
            }
        }).map(new qcj() { // from class: l.j28
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f118036a.m33829Uk(str, (Envelope) obj);
            }
        }).observeOn(fo0.m126432a());
    }

    /* JADX INFO: renamed from: vp */
    public void m34169vp(boolean z, int i, int i2, boolean z2) {
        if (!z) {
            this.f20686i1.put(0);
            this.f20683h1.put(0L);
        }
        if (this.f20686i1.get().intValue() >= i) {
            l51.m152919y(new Runnable() { // from class: l.ks7
                @Override // java.lang.Runnable
                public final void run() {
                    this.f128540a.m33890Zl();
                }
            });
        } else if (pzi0.m174454o() - this.f20683h1.get().longValue() > ((long) i2) * com.clevertap.android.sdk.Constants.ONE_MIN_IN_MILLIS || z2) {
            m33955fg().subscribe(new y20() { // from class: l.ls7
                @Override // p153l.y20
                public final void call(Object obj) {
                    C4891g.m33014Bb((uxj0) obj);
                }
            }, new y20() { // from class: l.ms7
                @Override // p153l.y20
                public final void call(Object obj) {
                    C4891g.m33362gb((Throwable) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: vq */
    public C22421c<uxj0> m34170vq(final Message message, final boolean z) {
        return scheduled("msg_risk_operation_" + message.f56859id, 0, new pcj() { // from class: l.r18
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f160780a.m33724Lm(message, z);
            }
        });
    }

    /* JADX INFO: renamed from: we */
    public final void m34171we(Message message, y20<Message> y20Var) {
        m34158ve(message, 1, y20Var);
    }

    /* JADX INFO: renamed from: wg */
    public C22421c<CipherId> m34172wg(final String str, final String str2, final boolean z) {
        return this.f91137Q.scheduled("cipher_userid_ab", -1, new pcj() { // from class: l.qr7
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return qi20.m176654a(new pcj() { // from class: l.vu7
                    @Override // p153l.pcj, java.util.concurrent.Callable
                    public final Object call() {
                        return C4891g.m33139N4(str, str, z);
                    }
                });
            }
        }).map(new qcj() { // from class: l.rr7
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((CoreData) ((Envelope) obj).getModuleData(CoreData.class)).cipherId;
            }
        });
    }

    /* JADX INFO: renamed from: wh */
    public C22421c<Boolean> m34173wh(final String str) {
        return C22421c.fromCallable(new Callable() { // from class: l.i38
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f112699a.m33899aj(str);
            }
        });
    }

    /* JADX INFO: renamed from: wi */
    public final /* synthetic */ C22421c m34174wi(final List list, final String str) {
        return C22421c.fromCallable(new Callable() { // from class: l.d68
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C4891g.m33392j6(list);
            }
        }).flatMap(new qcj() { // from class: l.e68
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f92261a.m34162vi(str, list, (JSONObject) obj);
            }
        });
    }

    /* JADX INFO: renamed from: wj */
    public final /* synthetic */ C22421c m34175wj(final String str) {
        return C22421c.fromCallable(new Callable() { // from class: l.ex7
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C4891g.m33523v5(str);
            }
        }).compose(psd0.m173607R()).flatMap(new qcj() { // from class: l.fx7
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f101238a.m34163vj(str, (String) obj);
            }
        });
    }

    /* JADX INFO: renamed from: wk */
    public final /* synthetic */ C22421c m34176wk(final String str, final String str2) {
        return new ti20(new pcj() { // from class: l.l48
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4879a.f20236P.auth().m209043q(C4879a.m32235O0(str, str2, false)).m209032f().m209028b();
            }
        }).map(new qcj() { // from class: l.m48
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f134773a.m34164vk((Envelope) obj);
            }
        }).compose(C4879a.m32255T2());
    }

    /* JADX INFO: renamed from: wl */
    public final /* synthetic */ C22421c m34177wl(final boolean z, final boolean z2, final String str) {
        return C22421c.fromCallable(new Callable() { // from class: l.e58
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C4891g.m33447o6(z, z2);
            }
        }).flatMap(new qcj() { // from class: l.f58
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f97202a.m34152ul(str, (Conversation) obj);
            }
        }).compose(C4879a.m32255T2()).doOnError(new y20() { // from class: l.g58
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f102294a.m34165vl(str, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: renamed from: wm */
    public final /* synthetic */ uxj0 m34178wm(final NotificationStatus notificationStatus, final NotificationStatus notificationStatus2, final String str) throws Exception {
        this.f91137Q.f20351U.m128074a(new x20() { // from class: l.kz7
            @Override // p153l.x20
            public final void call() {
                CoreModule.f18272k.f115535c.m189490z0(notificationStatus, notificationStatus2, str);
            }
        });
        return uxj0.f181467a;
    }

    /* JADX INFO: renamed from: wn */
    public C22421c<Message> m34179wn() {
        return this.f20664b0.observeOn(fo0.m126432a());
    }

    /* JADX INFO: renamed from: wo */
    public C22421c<uxj0> m34180wo(final String str, final boolean z) {
        return this.f91137Q.scheduled("remove_conversation/" + str, -1, new pcj() { // from class: l.fz7
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f101447a.m33889Zk(str, z);
            }
        });
    }

    /* JADX INFO: renamed from: wp */
    public C22421c<Envelope> m34181wp(String str, boolean z) {
        if (TextUtils.isEmpty(str)) {
            return C22421c.error(new RuntimeException("empty extra"));
        }
        StringBuilder sb = new StringBuilder("/live-schemas?search=");
        sb.append(str);
        sb.append(!z ? "" : "&action=cancel");
        final String strM32203G = C4879a.m32203G(sb.toString());
        return this.f91137Q.now(qi20.m176654a(new pcj() { // from class: l.g38
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4879a.f20236P.auth().m209043q(strM32203G).m209028b();
            }
        }));
    }

    /* JADX INFO: renamed from: wq */
    public final C22421c<uxj0> m34182wq(final String str) {
        return this.f91137Q.scheduled("retryCount" + str, -1, new pcj() { // from class: l.x28
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f192129a.m33748Nm(str);
            }
        });
    }

    /* JADX INFO: renamed from: xe */
    public C22421c<uxj0> m34183xe() {
        return this.f20606H2.asObservable().observeOn(fo0.m126432a());
    }

    /* JADX INFO: renamed from: xg */
    public C22421c<Envelope> m34184xg(final String str) {
        return this.f91137Q.now(new ti20(new pcj() { // from class: l.us7
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4879a.f20236P.auth().m209043q(C4879a.m32216J0("/tickles/" + str)).m209032f().m209028b();
            }
        }).compose(C4879a.m32255T2()));
    }

    /* JADX INFO: renamed from: xh */
    public boolean m34185xh(String str) {
        if (!gta.m132210e().m132214d().mo34811c()) {
            return CoreModule.f18272k.f115545m.m159005V0(str).m208669e() > 0;
        }
        User userM116503Pa = this.f91137Q.f20381e0.m116503Pa(str);
        return (userM116503Pa == null || !userM116503Pa.onlineMatchLocked()) && CoreModule.f18272k.f115545m.m159005V0(str).m208669e() > 0;
    }

    /* JADX INFO: renamed from: xi */
    public final /* synthetic */ void m34186xi() {
        this.f91137Q.f20351U.m128074a(new x20() { // from class: l.ut7
            @Override // p153l.x20
            public final void call() {
                CoreModule.f18272k.f115545m.delete("conversation_picture_like");
            }
        });
    }

    /* JADX INFO: renamed from: xj */
    public final /* synthetic */ void m34187xj(String str, Envelope envelope) {
        DbLinks dbLinksM33750No = m33750No(str);
        if (!TextUtils.isEmpty(envelope.pagination.links.previous) && NullChecker.m82486a(dbLinksM33750No)) {
            dbLinksM33750No.links.previous = envelope.pagination.links.previous;
            CoreModule.f18272k.f115536d.upsert(dbLinksM33750No);
        }
        for (Message message : ((CoreData) envelope.getModuleData(CoreData.class)).messages) {
            message.localNotificationStatus = NotificationStatus.get(NotificationStatus.muting);
            message.cid = str;
        }
    }

    /* JADX INFO: renamed from: xk */
    public final /* synthetic */ uxj0 m34188xk(final List list, uxj0 uxj0Var) {
        this.f91137Q.f20351U.m128074a(new x20() { // from class: l.tz7
            @Override // p153l.x20
            public final void call() {
                C4891g.m33110K8(list);
            }
        });
        CoreModule.f18264c.f20384f0.f20702n2.clear();
        return uxj0.f181467a;
    }

    /* JADX INFO: renamed from: xm */
    public final /* synthetic */ uxj0 m34190xm(final NotificationStatus notificationStatus, final NotificationStatus notificationStatus2, final String str) throws Exception {
        this.f91137Q.f20351U.m128074a(new x20() { // from class: l.vt7
            @Override // p153l.x20
            public final void call() {
                CoreModule.f18272k.f115535c.m189443A0(notificationStatus, notificationStatus2, str);
            }
        });
        return uxj0.f181467a;
    }

    /* JADX INFO: renamed from: xn */
    public C22421c<uxj0> m34191xn(final String str) {
        m33628Dp(str, false);
        return this.f91137Q.scheduled("messageClear", -1, new pcj() { // from class: l.p88
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f150991a.m33769Pj(str);
            }
        });
    }

    /* JADX INFO: renamed from: xo */
    public C22421c<uxj0> m34192xo(final String str) {
        return scheduled("patch_filter_del_or_hidden/" + str, -1, new pcj() { // from class: l.m68
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f134976a.m33913bl(str);
            }
        }).map(new qcj() { // from class: l.n68
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return uxj0.f181467a;
            }
        }).observeOn(fo0.m126432a());
    }

    /* JADX INFO: renamed from: xp */
    public void m34193xp(final String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        l51.m152919y(new Runnable() { // from class: l.pb8
            @Override // java.lang.Runnable
            public final void run() {
                this.f151351a.m33914bm(str);
            }
        });
    }

    /* JADX INFO: renamed from: xq */
    public void m34194xq(final String str) {
        l51.m152919y(new Runnable() { // from class: l.lb8
            @Override // java.lang.Runnable
            public final void run() {
                this.f130786a.m33760Om(str);
            }
        });
    }

    /* JADX INFO: renamed from: ye */
    public final void m34195ye(Envelope envelope) {
        List<Conversation> list = ((CoreData) envelope.getModuleData(CoreData.class)).conversations;
        if (jyb.m147479J(list)) {
            return;
        }
        Iterator<Conversation> it = list.iterator();
        while (it.hasNext()) {
            TEnum.equals(it.next().status, "deleted");
        }
    }

    /* JADX INFO: renamed from: yf */
    public C22421c<List<Conversation>> m34196yf() {
        return CoreModule.f18272k.f115545m.f137471B.m208677m();
    }

    /* JADX WARN: Code duplicated, block: B:11:0x004b  */
    /* JADX INFO: renamed from: yg */
    public final String m34197yg() {
        PutongAct putongAct;
        if (Act.globalLifeCycle_().isEmpty() || Act.globalLifeCycle_().values().isEmpty()) {
            putongAct = null;
        } else {
            ArrayList<Act.C4450r> next = Act.globalLifeCycle_().values().iterator().next();
            if (jyb.m147479J(next)) {
                putongAct = null;
            } else {
                Activity activity = next.get(next.size() - 1).f16062a.get();
                if (activity instanceof PutongAct) {
                    putongAct = (PutongAct) activity;
                } else {
                    putongAct = null;
                }
            }
        }
        return NullChecker.m82486a(putongAct) ? putongAct.pageId() : "";
    }

    /* JADX INFO: renamed from: yh */
    public C22421c<Boolean> m34198yh(final String str, final String str2, final String str3, final String str4) {
        return scheduled("conversation/" + str3 + "/report-hint", 0, new pcj() { // from class: l.n08
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return qi20.m176654a(new pcj() { // from class: l.z28
                    @Override // p153l.pcj, java.util.concurrent.Callable
                    public final Object call() {
                        return C4879a.f20236P.auth().m209043q(C4879a.m32203G("/antispam/sender/" + str + "/conversation/" + str + "/message/" + str + "/report-hint?hitWord=" + str)).m209032f().m209028b();
                    }
                }).map(new qcj() { // from class: l.a38
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return Boolean.valueOf(((CoreData) ((Envelope) obj).getModuleData(CoreData.class)).hint);
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: yi */
    public final /* synthetic */ uxj0 m34199yi(Envelope envelope) {
        this.f91137Q.m32495w3(envelope, null);
        return uxj0.f181467a;
    }

    /* JADX INFO: renamed from: yj */
    public final /* synthetic */ Boolean m34200yj(final String str, final Envelope envelope) {
        boolean z;
        if (jyb.m147479J(((CoreData) envelope.getModuleData(CoreData.class)).messages)) {
            z = false;
        } else {
            CoreModule.f18264c.f20390h0.m107384m3(envelope);
            z = !TextUtils.isEmpty(envelope.pagination.links.previous);
            this.f91137Q.m32495w3(envelope, new x20() { // from class: l.j88
                @Override // p153l.x20
                public final void call() {
                    this.f118758a.m34187xj(str, envelope);
                }
            });
        }
        return Boolean.valueOf(z);
    }

    /* JADX INFO: renamed from: yk */
    public final /* synthetic */ C22421c m34201yk(final List list) {
        return C22421c.just(uxj0.f181467a).observeOn(Schedulers.m222739io()).map(new qcj() { // from class: l.aw7
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f73693a.m34188xk(list, (uxj0) obj);
            }
        });
    }

    /* JADX INFO: renamed from: yl */
    public final /* synthetic */ C22421c m34202yl(String str, final JSONObject jSONObject) {
        return this.f91137Q.scheduled("post/bulk/messages/" + str, -1, new pcj() { // from class: l.i78
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return qi20.m176654a(new pcj() { // from class: l.fa8
                    @Override // p153l.pcj, java.util.concurrent.Callable
                    public final Object call() {
                        return C4879a.f20236P.auth().m209043q(C4879a.m32216J0("/bulk-messages")).m209038l(z1d0.create(Network.JSON, jSONObject.toString())).m209028b();
                    }
                });
            }
        }).map(new qcj() { // from class: l.j78
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return uxj0.f181467a;
            }
        });
    }

    /* JADX INFO: renamed from: ym */
    public final /* synthetic */ C22421c m34203ym(String str, String str2, Envelope envelope) {
        List<AudioText> list = ((CoreData) envelope.getModuleData(CoreData.class)).audioTexts;
        if (jyb.m147479J(list)) {
            return m33896ag(str2, str);
        }
        m33672Hi(str, list.get(0));
        return C22421c.just(list.get(0));
    }

    /* JADX INFO: renamed from: yn */
    public C22421c<uxj0> m34204yn(final long j) {
        return this.f91137Q.now(C22421c.fromCallable(new Callable() { // from class: l.e88
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f92525a.m33793Rj(j);
            }
        }).compose(C4879a.m32255T2()));
    }

    /* JADX INFO: renamed from: yo */
    public C22421c<uxj0> m34205yo(final List<IceBreakingQuestion> list) {
        return this.f91137Q.scheduled("users/me/chat-profiles/patch", -1, new pcj() { // from class: l.s58
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f166317a.m33948el(list);
            }
        });
    }

    /* JADX INFO: renamed from: yp */
    public void m34206yp(final String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        l51.m152919y(new Runnable() { // from class: l.rs7
            @Override // java.lang.Runnable
            public final void run() {
                this.f164638a.m33938dm(str);
            }
        });
    }

    /* JADX INFO: renamed from: yq */
    public final void m34207yq(final long j, final String str) {
        this.f91137Q.f20351U.m128074a(new x20() { // from class: l.kw7
            @Override // p153l.x20
            public final void call() {
                this.f129035a.m33772Pm(j, str);
            }
        });
    }

    /* JADX INFO: renamed from: ze */
    public void m34208ze(boolean z) {
        if (gta.m132210e().m132214d().mo34872ka() || z) {
            if (pzi0.m174454o() >= this.f91137Q.f20381e0.f89351w1.get().longValue() || z) {
                boolean z2 = false;
                try {
                    if (Long.parseLong(CoreModule.m30929H().userId()) % ((long) gta.m132210e().m132214d().mo34912qi()) == 0) {
                        z2 = true;
                    }
                } catch (Exception e) {
                    CrashHelper.m82479c(e);
                }
                if (z ? true : z2) {
                    CoreModule.f18264c.f20384f0.m34076on().map(new qcj() { // from class: l.uv7
                        @Override // p153l.qcj
                        public final Object call(Object obj) {
                            return Boolean.valueOf(((vg60) obj).m201221c());
                        }
                    }).filter(new qcj() { // from class: l.vv7
                        @Override // p153l.qcj
                        public final Object call(Object obj) {
                            return Boolean.valueOf(!((Boolean) obj).booleanValue());
                        }
                    }).first().observeOn(Schedulers.m222739io()).map(new qcj() { // from class: l.wv7
                        @Override // p153l.qcj
                        public final Object call(Object obj) {
                            return this.f190928a.m33767Ph((Boolean) obj);
                        }
                    }).subscribe(psd0.m173597H(new y20() { // from class: l.xv7
                        @Override // p153l.y20
                        public final void call(Object obj) {
                            this.f196355a.m33779Qh((bkj0) obj);
                        }
                    }, new y20() { // from class: l.yv7
                        @Override // p153l.y20
                        public final void call(Object obj) {
                            C4891g.m33404k7((Throwable) obj);
                        }
                    }));
                }
            }
        }
    }

    /* JADX INFO: renamed from: zf */
    public void m34209zf(final String str) {
        l51.m152919y(new Runnable() { // from class: l.zu7
            @Override // java.lang.Runnable
            public final void run() {
                this.f206094a.m33945ei(str);
            }
        });
    }

    /* JADX INFO: renamed from: zg */
    public LinkedHashMap<String, UserLiveLabel> m34210zg(boolean z) {
        LinkedHashMap<String, UserLiveLabel> linkedHashMapM222761e = z ? this.f20588B2.m222761e() : this.f20591C2.m222761e();
        return linkedHashMapM222761e == null ? f20571R2 : linkedHashMapM222761e;
    }

    /* JADX INFO: renamed from: zh */
    public C22421c<Boolean> m34211zh(final String str, final String str2, final String str3) {
        return scheduled("conversation/" + str2 + "/harass-hint", 0, new pcj() { // from class: l.sv7
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return qi20.m176654a(new pcj() { // from class: l.p08
                    @Override // p153l.pcj, java.util.concurrent.Callable
                    public final Object call() {
                        return C4879a.f20236P.auth().m209043q(C4879a.m32203G("/antispam/receiver/" + str + "/conversation/" + str + "/harass-hint?hitWord=" + str)).m209032f().m209028b();
                    }
                }).map(new qcj() { // from class: l.q08
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return Boolean.valueOf(((CoreData) ((Envelope) obj).getModuleData(CoreData.class)).hint);
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: zi */
    public final /* synthetic */ uxj0 m34212zi(uxj0 uxj0Var) {
        m33653Fo();
        return uxj0.f181467a;
    }

    /* JADX INFO: renamed from: zk */
    public final /* synthetic */ vg60 m34214zk(List list, DbLinks dbLinks) {
        return m118618Z2(list, dbLinks);
    }

    /* JADX INFO: renamed from: zm */
    public final /* synthetic */ C22421c m34216zm(final String str, final String str2) {
        return qi20.m176658e(new pcj() { // from class: l.yz7
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4879a.f20236P.auth().m209043q(C4879a.m32214I2("/conversations/" + str + "/messages/" + str2 + "/audiotexts")).m209038l(z1d0.create(Network.JSON, "")).m209028b();
            }
        }).flatMap(new qcj() { // from class: l.zz7
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f206677a.m34203ym(str2, str, (Envelope) obj);
            }
        }).observeOn(fo0.m126432a());
    }

    /* JADX INFO: renamed from: zn */
    public C22421c<LinkedHashMap<String, UserLiveLabel>> m34217zn() {
        return this.f20591C2.asObservable().observeOn(fo0.m126432a());
    }

    /* JADX INFO: renamed from: zo */
    public C22421c<uxj0> m34218zo(Message message) {
        if (message == null) {
            return null;
        }
        final Message messageMo225055clone = message.mo225055clone();
        if (messageMo225055clone.additionalData == null) {
            messageMo225055clone.additionalData = MessageAdditionalData.new_();
        }
        MessageAdditionalData messageAdditionalData = messageMo225055clone.additionalData;
        if (messageAdditionalData.limitTimePicture == null) {
            messageAdditionalData.limitTimePicture = LimitTimePicture.new_();
        }
        messageMo225055clone.additionalData.limitTimePicture.status = LimitTimePictureStatus.get("read");
        return this.f91137Q.scheduled("patchLimitTimePictureMessage" + messageMo225055clone.f56859id, -1, new pcj() { // from class: l.rq7
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f164433a.m33972gl(messageMo225055clone);
            }
        });
    }

    /* JADX INFO: renamed from: zp */
    public Conversation m34219zp(String str) {
        return l51.m152884D() ? m33859Xe(str) : m33738Mo(str);
    }

    /* JADX INFO: renamed from: zq */
    public void m34220zq(List<Conversation> list) {
        if (jyb.m147479J(list)) {
            return;
        }
        jyb.m147537z(list, new y20() { // from class: l.c08
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f79233a.m33784Qm((Conversation) obj);
            }
        });
    }
}
