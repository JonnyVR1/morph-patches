package p006l;

import android.app.Application;
import android.graphics.Bitmap;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.common.base.Optional;
import com.p000p1.mobile.putong.account.data.CameraSticker;
import com.p000p1.mobile.putong.account.p002ui.camera.adapter.AccountMakeupPageAdapter;
import com.p000p1.mobile.putong.api.api.Network;
import com.p000p1.mobile.putong.api.api.TantanException;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.api.C0154a;
import com.p000p1.mobile.putong.core.api.C0158c;
import com.p1.mobile.android.app.App;
import com.p1.mobile.putong.core.data.AppealInfo;
import com.p1.mobile.putong.core.data.BreakIce;
import com.p1.mobile.putong.core.data.ChatPartnerScene;
import com.p1.mobile.putong.core.data.CoreData;
import com.p1.mobile.putong.core.data.FakeGuideData;
import com.p1.mobile.putong.core.data.GPTopicCard;
import com.p1.mobile.putong.core.data.GPTopicCardEnvelop;
import com.p1.mobile.putong.core.data.IceBreakQuestion;
import com.p1.mobile.putong.core.data.IdealInfo;
import com.p1.mobile.putong.core.data.Literatures;
import com.p1.mobile.putong.core.data.LiteraturesComments;
import com.p1.mobile.putong.core.data.LoveLetterContent;
import com.p1.mobile.putong.core.data.LoveLetterEntryInfo;
import com.p1.mobile.putong.core.data.MarriageGuide;
import com.p1.mobile.putong.core.data.MatchInfo;
import com.p1.mobile.putong.core.data.MyTabTask;
import com.p1.mobile.putong.core.data.NewTags;
import com.p1.mobile.putong.core.data.ProfileCountInfo;
import com.p1.mobile.putong.core.data.RealFeelInfo;
import com.p1.mobile.putong.core.data.RealPicturesInfo;
import com.p1.mobile.putong.core.data.RegionRule;
import com.p1.mobile.putong.core.data.RegionRulesEnvelop;
import com.p1.mobile.putong.core.data.UrlTag;
import com.p1.mobile.putong.core.data.UserFeedbackInfo;
import com.p1.mobile.putong.core.data.VerificationCenter;
import com.p1.mobile.putong.core.data.WechatNotifySetting;
import com.p1.mobile.putong.data.Answer;
import com.p1.mobile.putong.data.AppealPostData;
import com.p1.mobile.putong.data.AuthData;
import com.p1.mobile.putong.data.CommonData;
import com.p1.mobile.putong.data.Contact;
import com.p1.mobile.putong.data.ConversationStatus;
import com.p1.mobile.putong.data.Converter;
import com.p1.mobile.putong.data.CurrencyTypeData;
import com.p1.mobile.putong.data.CurrencyTypeEnvelop;
import com.p1.mobile.putong.data.Dimension;
import com.p1.mobile.putong.data.Envelope;
import com.p1.mobile.putong.data.Extensions;
import com.p1.mobile.putong.data.GPMemo;
import com.p1.mobile.putong.data.GPMemoEnvelope;
import com.p1.mobile.putong.data.IdealTag;
import com.p1.mobile.putong.data.LiveRegionTag;
import com.p1.mobile.putong.data.MatchFrom;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.Meta;
import com.p1.mobile.putong.data.MomentFeedPushArgs;
import com.p1.mobile.putong.data.PartialIdList;
import com.p1.mobile.putong.data.Picture;
import com.p1.mobile.putong.data.Profile;
import com.p1.mobile.putong.data.ProfileExtensionBasic;
import com.p1.mobile.putong.data.Relationship;
import com.p1.mobile.putong.data.Report;
import com.p1.mobile.putong.data.SettingGroups;
import com.p1.mobile.putong.data.Settings;
import com.p1.mobile.putong.data.TribeSetting;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.UserLiveSettings;
import com.p1.mobile.putong.data.UserPrivacySettings;
import com.p1.mobile.putong.data.UserPushSettings;
import com.p1.mobile.putong.data.UserSettingPatch;
import com.p1.mobile.putong.data.UserStatus;
import com.p1.mobile.putong.data.UserSubscriptionSettings;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.p1.mobile.putong.ui.DialogAct;
import com.tantan.core.base.R;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.data.ProtobufAdapter;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import l.ard0;
import l.d30;
import l.e30;
import l.e51;
import l.eqd0;
import l.fgf0;
import l.ggi;
import l.gl5;
import l.hpd0;
import l.hyx;
import l.jo0;
import l.kpd0;
import l.lsi0;
import l.mkd0;
import l.mqi0;
import l.na30;
import l.o6j0;
import l.ogw;
import l.osi0;
import l.pgm;
import l.rhi;
import l.roj0;
import l.stc0;
import l.tpd0;
import l.uqd0;
import l.utc0;
import l.v9j;
import l.vqd0;
import l.vwb;
import l.w85;
import l.w9j;
import l.xaj0;
import l.zpd0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import rx.c;
import rx.subjects.a;
import rx.subjects.b;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class pib extends C0154a {

    /* JADX INFO: renamed from: A0 */
    public a<MomentFeedPushArgs> f18746A0;

    /* JADX INFO: renamed from: A1 */
    public zpd0 f18747A1;

    /* JADX INFO: renamed from: A2 */
    public tpd0 f18748A2;

    /* JADX INFO: renamed from: A3 */
    public hpd0 f18749A3;

    /* JADX INFO: renamed from: A4 */
    public hpd0 f18750A4;

    /* JADX INFO: renamed from: A5 */
    public zpd0 f18751A5;

    /* JADX INFO: renamed from: A6 */
    public hpd0 f18752A6;

    /* JADX INFO: renamed from: B0 */
    public xaj0<String, String, Integer> f18753B0;

    /* JADX INFO: renamed from: B1 */
    public String f18754B1;

    /* JADX INFO: renamed from: B2 */
    public tpd0 f18755B2;

    /* JADX INFO: renamed from: B3 */
    public hpd0 f18756B3;

    /* JADX INFO: renamed from: B4 */
    public hpd0 f18757B4;

    /* JADX INFO: renamed from: B5 */
    public tpd0 f18758B5;

    /* JADX INFO: renamed from: B6 */
    public hpd0 f18759B6;

    /* JADX INFO: renamed from: C0 */
    public a<AppealInfo> f18760C0;

    /* JADX INFO: renamed from: C1 */
    public hpd0 f18761C1;

    /* JADX INFO: renamed from: C2 */
    public tpd0 f18762C2;

    /* JADX INFO: renamed from: C3 */
    public uqd0 f18763C3;

    /* JADX INFO: renamed from: C4 */
    public zpd0 f18764C4;

    /* JADX INFO: renamed from: C5 */
    public zpd0 f18765C5;

    /* JADX INFO: renamed from: C6 */
    public hpd0 f18766C6;

    /* JADX INFO: renamed from: D0 */
    public a<AppealInfo> f18767D0;

    /* JADX INFO: renamed from: D1 */
    public hpd0 f18768D1;

    /* JADX INFO: renamed from: D2 */
    public tpd0 f18769D2;

    /* JADX INFO: renamed from: D3 */
    public uqd0 f18770D3;

    /* JADX INFO: renamed from: D4 */
    public hpd0 f18771D4;

    /* JADX INFO: renamed from: D5 */
    public zpd0 f18772D5;

    /* JADX INFO: renamed from: D6 */
    public hpd0 f18773D6;

    /* JADX INFO: renamed from: E0 */
    public a<roj0> f18774E0;

    /* JADX INFO: renamed from: E1 */
    public b<Boolean> f18775E1;

    /* JADX INFO: renamed from: E2 */
    public hpd0 f18776E2;

    /* JADX INFO: renamed from: E3 */
    public uqd0 f18777E3;

    /* JADX INFO: renamed from: E4 */
    public hpd0 f18778E4;

    /* JADX INFO: renamed from: E5 */
    public tpd0 f18779E5;

    /* JADX INFO: renamed from: E6 */
    public uqd0 f18780E6;

    /* JADX INFO: renamed from: F0 */
    public a<roj0> f18781F0;

    /* JADX INFO: renamed from: F1 */
    public b<roj0> f18782F1;

    /* JADX INFO: renamed from: F2 */
    public hpd0 f18783F2;

    /* JADX INFO: renamed from: F3 */
    public tpd0 f18784F3;

    /* JADX INFO: renamed from: F4 */
    public hpd0 f18785F4;

    /* JADX INFO: renamed from: F5 */
    public zpd0 f18786F5;

    /* JADX INFO: renamed from: F6 */
    public tpd0 f18787F6;

    /* JADX INFO: renamed from: G0 */
    public tpd0 f18788G0;

    /* JADX INFO: renamed from: G1 */
    public a<roj0> f18789G1;

    /* JADX INFO: renamed from: G2 */
    public uqd0 f18790G2;

    /* JADX INFO: renamed from: G3 */
    public tpd0 f18791G3;

    /* JADX INFO: renamed from: G4 */
    public zpd0 f18792G4;

    /* JADX INFO: renamed from: G5 */
    public hpd0 f18793G5;

    /* JADX INFO: renamed from: G6 */
    public hpd0 f18794G6;

    /* JADX INFO: renamed from: H0 */
    public tpd0 f18795H0;

    /* JADX INFO: renamed from: H1 */
    public b<String> f18796H1;

    /* JADX INFO: renamed from: H2 */
    public zpd0 f18797H2;

    /* JADX INFO: renamed from: H3 */
    public hpd0 f18798H3;

    /* JADX INFO: renamed from: H4 */
    public tpd0 f18799H4;

    /* JADX INFO: renamed from: H6 */
    public hpd0 f18800H6;

    /* JADX INFO: renamed from: I0 */
    public zpd0 f18801I0;

    /* JADX INFO: renamed from: I1 */
    public a<Boolean> f18802I1;

    /* JADX INFO: renamed from: I2 */
    public zpd0 f18803I2;

    /* JADX INFO: renamed from: I3 */
    public hpd0 f18804I3;

    /* JADX INFO: renamed from: I4 */
    public hpd0 f18805I4;

    /* JADX INFO: renamed from: I5 */
    public uqd0 f18806I5;

    /* JADX INFO: renamed from: I6 */
    public zpd0 f18807I6;

    /* JADX INFO: renamed from: J0 */
    public vqd0 f18808J0;

    /* JADX INFO: renamed from: J1 */
    public b<String> f18809J1;

    /* JADX INFO: renamed from: J2 */
    public hpd0 f18810J2;

    /* JADX INFO: renamed from: J3 */
    public uqd0 f18811J3;

    /* JADX INFO: renamed from: J4 */
    public tpd0 f18812J4;

    /* JADX INFO: renamed from: J5 */
    public uqd0 f18813J5;

    /* JADX INFO: renamed from: J6 */
    public hpd0 f18814J6;

    /* JADX INFO: renamed from: K0 */
    public hpd0 f18815K0;

    /* JADX INFO: renamed from: K1 */
    public a<Optional<WechatNotifySetting>> f18816K1;

    /* JADX INFO: renamed from: K2 */
    public hpd0 f18817K2;

    /* JADX INFO: renamed from: K3 */
    public zpd0 f18818K3;

    /* JADX INFO: renamed from: K4 */
    public zpd0 f18819K4;

    /* JADX INFO: renamed from: K5 */
    public uqd0 f18820K5;

    /* JADX INFO: renamed from: K6 */
    public hpd0 f18821K6;

    /* JADX INFO: renamed from: L0 */
    public hpd0 f18822L0;

    /* JADX INFO: renamed from: L1 */
    public a<Optional<WechatNotifySetting>> f18823L1;

    /* JADX INFO: renamed from: L2 */
    public tpd0 f18824L2;

    /* JADX INFO: renamed from: L3 */
    public tpd0 f18825L3;

    /* JADX INFO: renamed from: L4 */
    public hpd0 f18826L4;

    /* JADX INFO: renamed from: L5 */
    public hpd0 f18827L5;

    /* JADX INFO: renamed from: L6 */
    public hpd0 f18828L6;

    /* JADX INFO: renamed from: M0 */
    public a<roj0> f18829M0;

    /* JADX INFO: renamed from: M1 */
    public tpd0 f18830M1;

    /* JADX INFO: renamed from: M2 */
    public zpd0 f18831M2;

    /* JADX INFO: renamed from: M3 */
    public zpd0 f18832M3;

    /* JADX INFO: renamed from: M4 */
    public tpd0 f18833M4;

    /* JADX INFO: renamed from: M5 */
    public hpd0 f18834M5;

    /* JADX INFO: renamed from: M6 */
    public hpd0 f18835M6;

    /* JADX INFO: renamed from: N0 */
    public zpd0 f18836N0;

    /* JADX INFO: renamed from: N1 */
    public hpd0 f18837N1;

    /* JADX INFO: renamed from: N2 */
    public hpd0 f18838N2;

    /* JADX INFO: renamed from: N3 */
    public b<roj0> f18839N3;

    /* JADX INFO: renamed from: N4 */
    public hpd0 f18840N4;

    /* JADX INFO: renamed from: N5 */
    public hpd0 f18841N5;

    /* JADX INFO: renamed from: N6 */
    public zpd0 f18842N6;

    /* JADX INFO: renamed from: O0 */
    public zpd0 f18843O0;

    /* JADX INFO: renamed from: O1 */
    public hpd0 f18844O1;

    /* JADX INFO: renamed from: O2 */
    public hpd0 f18845O2;

    /* JADX INFO: renamed from: O3 */
    public hpd0 f18846O3;

    /* JADX INFO: renamed from: O4 */
    public zpd0 f18847O4;

    /* JADX INFO: renamed from: O5 */
    public tpd0 f18848O5;

    /* JADX INFO: renamed from: O6 */
    public zpd0 f18849O6;

    /* JADX INFO: renamed from: P0 */
    public zpd0 f18850P0;

    /* JADX INFO: renamed from: P1 */
    public hpd0 f18851P1;

    /* JADX INFO: renamed from: P2 */
    public hpd0 f18852P2;

    /* JADX INFO: renamed from: P3 */
    public tpd0 f18853P3;

    /* JADX INFO: renamed from: P4 */
    public zpd0 f18854P4;

    /* JADX INFO: renamed from: P5 */
    public zpd0 f18855P5;

    /* JADX INFO: renamed from: P6 */
    public Map<String, String> f18856P6;

    /* JADX INFO: renamed from: Q */
    public final C0158c f18857Q;

    /* JADX INFO: renamed from: Q0 */
    public zpd0 f18858Q0;

    /* JADX INFO: renamed from: Q1 */
    public zpd0 f18859Q1;

    /* JADX INFO: renamed from: Q2 */
    public zpd0 f18860Q2;

    /* JADX INFO: renamed from: Q3 */
    public tpd0 f18861Q3;

    /* JADX INFO: renamed from: Q4 */
    public zpd0 f18862Q4;

    /* JADX INFO: renamed from: Q5 */
    public zpd0 f18863Q5;

    /* JADX INFO: renamed from: Q6 */
    public HashMap<String, List<LiteraturesComments>> f18864Q6;

    /* JADX INFO: renamed from: R */
    public final eqd0 f18865R;

    /* JADX INFO: renamed from: R0 */
    public zpd0 f18866R0;

    /* JADX INFO: renamed from: R1 */
    public a<roj0> f18867R1;

    /* JADX INFO: renamed from: R2 */
    public zpd0 f18868R2;

    /* JADX INFO: renamed from: R3 */
    public uqd0 f18869R3;

    /* JADX INFO: renamed from: R4 */
    public tpd0 f18870R4;

    /* JADX INFO: renamed from: R5 */
    public zpd0 f18871R5;

    /* JADX INFO: renamed from: R6 */
    public HashMap<String, Literatures> f18872R6;

    /* JADX INFO: renamed from: S */
    public final hpd0 f18873S;

    /* JADX INFO: renamed from: S0 */
    public hpd0 f18874S0;

    /* JADX INFO: renamed from: S1 */
    public a<roj0> f18875S1;

    /* JADX INFO: renamed from: S2 */
    public uqd0 f18876S2;

    /* JADX INFO: renamed from: S3 */
    public hpd0 f18877S3;

    /* JADX INFO: renamed from: S4 */
    public zpd0 f18878S4;

    /* JADX INFO: renamed from: S5 */
    public tpd0 f18879S5;

    /* JADX INFO: renamed from: S6 */
    public ConcurrentHashMap<String, NewTags> f18880S6;

    /* JADX INFO: renamed from: T */
    public tpd0 f18881T;

    /* JADX INFO: renamed from: T0 */
    public tpd0 f18882T0;

    /* JADX INFO: renamed from: T1 */
    public a<roj0> f18883T1;

    /* JADX INFO: renamed from: T2 */
    public zpd0 f18884T2;

    /* JADX INFO: renamed from: T3 */
    public tpd0 f18885T3;

    /* JADX INFO: renamed from: T4 */
    public tpd0 f18886T4;

    /* JADX INFO: renamed from: T5 */
    public tpd0 f18887T5;

    /* JADX INFO: renamed from: T6 */
    public LinkedHashMap<String, NewTags> f18888T6;

    /* JADX INFO: renamed from: U */
    public a<roj0> f18889U;

    /* JADX INFO: renamed from: U0 */
    public tpd0 f18890U0;

    /* JADX INFO: renamed from: U1 */
    public a<LoveLetterEntryInfo> f18891U1;

    /* JADX INFO: renamed from: U2 */
    public zpd0 f18892U2;

    /* JADX INFO: renamed from: U3 */
    public uqd0 f18893U3;

    /* JADX INFO: renamed from: U4 */
    public hpd0 f18894U4;

    /* JADX INFO: renamed from: U5 */
    public tpd0 f18895U5;

    /* JADX INFO: renamed from: U6 */
    public Set<String> f18896U6;

    /* JADX INFO: renamed from: V */
    public a<String> f18897V;

    /* JADX INFO: renamed from: V0 */
    public tpd0 f18898V0;

    /* JADX INFO: renamed from: V1 */
    public tpd0 f18899V1;

    /* JADX INFO: renamed from: V2 */
    public hpd0 f18900V2;

    /* JADX INFO: renamed from: V3 */
    public zpd0 f18901V3;

    /* JADX INFO: renamed from: V4 */
    public hpd0 f18902V4;

    /* JADX INFO: renamed from: V5 */
    public tpd0 f18903V5;

    /* JADX INFO: renamed from: V6 */
    public a<FakeGuideData> f18904V6;

    /* JADX INFO: renamed from: W */
    public a<Boolean> f18905W;

    /* JADX INFO: renamed from: W0 */
    public hpd0 f18906W0;

    /* JADX INFO: renamed from: W1 */
    public uqd0 f18907W1;

    /* JADX INFO: renamed from: W2 */
    public uqd0 f18908W2;

    /* JADX INFO: renamed from: W3 */
    public tpd0 f18909W3;

    /* JADX INFO: renamed from: W4 */
    public zpd0 f18910W4;

    /* JADX INFO: renamed from: W5 */
    public zpd0 f18911W5;

    /* JADX INFO: renamed from: W6 */
    public UserFeedbackInfo f18912W6;

    /* JADX INFO: renamed from: X */
    public zpd0 f18913X;

    /* JADX INFO: renamed from: X0 */
    public hpd0 f18914X0;

    /* JADX INFO: renamed from: X1 */
    public hpd0 f18915X1;

    /* JADX INFO: renamed from: X2 */
    public hpd0 f18916X2;

    /* JADX INFO: renamed from: X3 */
    public zpd0 f18917X3;

    /* JADX INFO: renamed from: X4 */
    public tpd0 f18918X4;

    /* JADX INFO: renamed from: X5 */
    public tpd0 f18919X5;

    /* JADX INFO: renamed from: X6 */
    public String f18920X6;

    /* JADX INFO: renamed from: Y */
    public tpd0 f18921Y;

    /* JADX INFO: renamed from: Y0 */
    public a<Boolean> f18922Y0;

    /* JADX INFO: renamed from: Y1 */
    public a<roj0> f18923Y1;

    /* JADX INFO: renamed from: Y2 */
    public hpd0 f18924Y2;

    /* JADX INFO: renamed from: Y3 */
    public tpd0 f18925Y3;

    /* JADX INFO: renamed from: Y4 */
    public hpd0 f18926Y4;

    /* JADX INFO: renamed from: Y5 */
    public uqd0 f18927Y5;

    /* JADX INFO: renamed from: Y6 */
    public boolean f18928Y6;

    /* JADX INFO: renamed from: Z */
    public zpd0 f18929Z;

    /* JADX INFO: renamed from: Z0 */
    public hpd0 f18930Z0;

    /* JADX INFO: renamed from: Z1 */
    public tpd0 f18931Z1;

    /* JADX INFO: renamed from: Z2 */
    public hpd0 f18932Z2;

    /* JADX INFO: renamed from: Z3 */
    public uqd0 f18933Z3;

    /* JADX INFO: renamed from: Z4 */
    public zpd0 f18934Z4;

    /* JADX INFO: renamed from: Z5 */
    public tpd0 f18935Z5;

    /* JADX INFO: renamed from: Z6 */
    public boolean f18936Z6;

    /* JADX INFO: renamed from: a0 */
    public uqd0 f18937a0;

    /* JADX INFO: renamed from: a1 */
    public hpd0 f18938a1;

    /* JADX INFO: renamed from: a2 */
    public zpd0 f18939a2;

    /* JADX INFO: renamed from: a3 */
    public hpd0 f18940a3;

    /* JADX INFO: renamed from: a4 */
    public hpd0 f18941a4;

    /* JADX INFO: renamed from: a5 */
    public tpd0 f18942a5;

    /* JADX INFO: renamed from: a6 */
    public tpd0 f18943a6;

    /* JADX INFO: renamed from: a7 */
    public boolean f18944a7;

    /* JADX INFO: renamed from: b0 */
    public hpd0 f18945b0;

    /* JADX INFO: renamed from: b1 */
    public a<Integer> f18946b1;

    /* JADX INFO: renamed from: b2 */
    public zpd0 f18947b2;

    /* JADX INFO: renamed from: b3 */
    public hpd0 f18948b3;

    /* JADX INFO: renamed from: b4 */
    public hpd0 f18949b4;

    /* JADX INFO: renamed from: b5 */
    public hpd0 f18950b5;

    /* JADX INFO: renamed from: b6 */
    public zpd0 f18951b6;

    /* JADX INFO: renamed from: b7 */
    public a<List<ProfileCountInfo>> f18952b7;

    /* JADX INFO: renamed from: c0 */
    public hpd0 f18953c0;

    /* JADX INFO: renamed from: c1 */
    public hpd0 f18954c1;

    /* JADX INFO: renamed from: c2 */
    public hpd0 f18955c2;

    /* JADX INFO: renamed from: c3 */
    public hpd0 f18956c3;

    /* JADX INFO: renamed from: c4 */
    public hpd0 f18957c4;

    /* JADX INFO: renamed from: c5 */
    public hpd0 f18958c5;

    /* JADX INFO: renamed from: c6 */
    public zpd0 f18959c6;

    /* JADX INFO: renamed from: c7 */
    public b<roj0> f18960c7;

    /* JADX INFO: renamed from: d0 */
    public hpd0 f18961d0;

    /* JADX INFO: renamed from: d1 */
    public hpd0 f18962d1;

    /* JADX INFO: renamed from: d2 */
    public hpd0 f18963d2;

    /* JADX INFO: renamed from: d3 */
    public uqd0 f18964d3;

    /* JADX INFO: renamed from: d4 */
    public hpd0 f18965d4;

    /* JADX INFO: renamed from: d5 */
    public hpd0 f18966d5;

    /* JADX INFO: renamed from: d6 */
    public uqd0 f18967d6;

    /* JADX INFO: renamed from: d7 */
    public b<Integer> f18968d7;

    /* JADX INFO: renamed from: e0 */
    public hpd0 f18969e0;

    /* JADX INFO: renamed from: e1 */
    public hpd0 f18970e1;

    /* JADX INFO: renamed from: e2 */
    public hpd0 f18971e2;

    /* JADX INFO: renamed from: e3 */
    public uqd0 f18972e3;

    /* JADX INFO: renamed from: e4 */
    public hpd0 f18973e4;

    /* JADX INFO: renamed from: e5 */
    public boolean f18974e5;

    /* JADX INFO: renamed from: e6 */
    public uqd0 f18975e6;

    /* JADX INFO: renamed from: e7 */
    public final C1136l f18976e7;

    /* JADX INFO: renamed from: f0 */
    public hpd0 f18977f0;

    /* JADX INFO: renamed from: f1 */
    public uqd0 f18978f1;

    /* JADX INFO: renamed from: f2 */
    public uqd0 f18979f2;

    /* JADX INFO: renamed from: f3 */
    public long f18980f3;

    /* JADX INFO: renamed from: f4 */
    public hpd0 f18981f4;

    /* JADX INFO: renamed from: f5 */
    public boolean f18982f5;

    /* JADX INFO: renamed from: f6 */
    public uqd0 f18983f6;

    /* JADX INFO: renamed from: f7 */
    public final C1135k f18984f7;

    /* JADX INFO: renamed from: g0 */
    public ard0 f18985g0;

    /* JADX INFO: renamed from: g1 */
    public zpd0 f18986g1;

    /* JADX INFO: renamed from: g2 */
    public zpd0 f18987g2;

    /* JADX INFO: renamed from: g3 */
    public uqd0 f18988g3;

    /* JADX INFO: renamed from: g4 */
    public b<String> f18989g4;

    /* JADX INFO: renamed from: g5 */
    public boolean f18990g5;

    /* JADX INFO: renamed from: g6 */
    public uqd0 f18991g6;

    /* JADX INFO: renamed from: g7 */
    public C1134j f18992g7;

    /* JADX INFO: renamed from: h0 */
    public hpd0 f18993h0;

    /* JADX INFO: renamed from: h1 */
    public hpd0 f18994h1;

    /* JADX INFO: renamed from: h2 */
    public hpd0 f18995h2;

    /* JADX INFO: renamed from: h3 */
    public tpd0 f18996h3;

    /* JADX INFO: renamed from: h4 */
    public b<roj0> f18997h4;

    /* JADX INFO: renamed from: h5 */
    public hpd0 f18998h5;

    /* JADX INFO: renamed from: h6 */
    public hpd0 f18999h6;

    /* JADX INFO: renamed from: h7 */
    public boolean f19000h7;

    /* JADX INFO: renamed from: i0 */
    public tpd0 f19001i0;

    /* JADX INFO: renamed from: i1 */
    public uqd0 f19002i1;

    /* JADX INFO: renamed from: i2 */
    public uqd0 f19003i2;

    /* JADX INFO: renamed from: i3 */
    public zpd0 f19004i3;

    /* JADX INFO: renamed from: i4 */
    public uqd0 f19005i4;

    /* JADX INFO: renamed from: i5 */
    public tpd0 f19006i5;

    /* JADX INFO: renamed from: i6 */
    public tpd0 f19007i6;

    /* JADX INFO: renamed from: i7 */
    public a<List<MyTabTask>> f19008i7;

    /* JADX INFO: renamed from: j0 */
    public zpd0 f19009j0;

    /* JADX INFO: renamed from: j1 */
    public tpd0 f19010j1;

    /* JADX INFO: renamed from: j2 */
    public zpd0 f19011j2;

    /* JADX INFO: renamed from: j3 */
    public long f19012j3;

    /* JADX INFO: renamed from: j4 */
    public uqd0 f19013j4;

    /* JADX INFO: renamed from: j5 */
    public zpd0 f19014j5;

    /* JADX INFO: renamed from: j6 */
    public hpd0 f19015j6;

    /* JADX INFO: renamed from: j7 */
    public a<MyTabTask> f19016j7;

    /* JADX INFO: renamed from: k0 */
    public vqd0 f19017k0;

    /* JADX INFO: renamed from: k1 */
    public hpd0 f19018k1;

    /* JADX INFO: renamed from: k2 */
    public tpd0 f19019k2;

    /* JADX INFO: renamed from: k3 */
    public tpd0 f19020k3;

    /* JADX INFO: renamed from: k4 */
    public uqd0 f19021k4;

    /* JADX INFO: renamed from: k5 */
    public tpd0 f19022k5;

    /* JADX INFO: renamed from: k6 */
    public tpd0 f19023k6;

    /* JADX INFO: renamed from: k7 */
    public a<MyTabTask> f19024k7;

    /* JADX INFO: renamed from: l0 */
    public zpd0 f19025l0;

    /* JADX INFO: renamed from: l1 */
    public zpd0 f19026l1;

    /* JADX INFO: renamed from: l2 */
    public tpd0 f19027l2;

    /* JADX INFO: renamed from: l3 */
    public tpd0 f19028l3;

    /* JADX INFO: renamed from: l4 */
    public uqd0 f19029l4;

    /* JADX INFO: renamed from: l5 */
    public zpd0 f19030l5;

    /* JADX INFO: renamed from: l6 */
    public uqd0 f19031l6;

    /* JADX INFO: renamed from: l7 */
    public a<roj0> f19032l7;

    /* JADX INFO: renamed from: m0 */
    public zpd0 f19033m0;

    /* JADX INFO: renamed from: m1 */
    public a<List<GPTopicCard>> f19034m1;

    /* JADX INFO: renamed from: m2 */
    public zpd0 f19035m2;

    /* JADX INFO: renamed from: m3 */
    public hpd0 f19036m3;

    /* JADX INFO: renamed from: m4 */
    public uqd0 f19037m4;

    /* JADX INFO: renamed from: m5 */
    public tpd0 f19038m5;

    /* JADX INFO: renamed from: m6 */
    public hpd0 f19039m6;

    /* JADX INFO: renamed from: m7 */
    public tpd0 f19040m7;

    /* JADX INFO: renamed from: n0 */
    public zpd0 f19041n0;

    /* JADX INFO: renamed from: n1 */
    public a<HashMap<String, List<User>>> f19042n1;

    /* JADX INFO: renamed from: n2 */
    public zpd0 f19043n2;

    /* JADX INFO: renamed from: n3 */
    public hpd0 f19044n3;

    /* JADX INFO: renamed from: n4 */
    public hpd0 f19045n4;

    /* JADX INFO: renamed from: n5 */
    public zpd0 f19046n5;

    /* JADX INFO: renamed from: n6 */
    public hpd0 f19047n6;

    /* JADX INFO: renamed from: n7 */
    public hpd0 f19048n7;

    /* JADX INFO: renamed from: o0 */
    public vqd0 f19049o0;

    /* JADX INFO: renamed from: o1 */
    public a<roj0> f19050o1;

    /* JADX INFO: renamed from: o2 */
    public tpd0 f19051o2;

    /* JADX INFO: renamed from: o3 */
    public hpd0 f19052o3;

    /* JADX INFO: renamed from: o4 */
    public uqd0 f19053o4;

    /* JADX INFO: renamed from: o5 */
    public tpd0 f19054o5;

    /* JADX INFO: renamed from: o6 */
    public hpd0 f19055o6;

    /* JADX INFO: renamed from: p0 */
    public zpd0 f19056p0;

    /* JADX INFO: renamed from: p1 */
    public zpd0 f19057p1;

    /* JADX INFO: renamed from: p2 */
    public uqd0 f19058p2;

    /* JADX INFO: renamed from: p3 */
    public vqd0 f19059p3;

    /* JADX INFO: renamed from: p4 */
    public uqd0 f19060p4;

    /* JADX INFO: renamed from: p5 */
    public tpd0 f19061p5;

    /* JADX INFO: renamed from: p6 */
    public zpd0 f19062p6;

    /* JADX INFO: renamed from: q0 */
    public vqd0 f19063q0;

    /* JADX INFO: renamed from: q1 */
    public hpd0 f19064q1;

    /* JADX INFO: renamed from: q2 */
    public hpd0 f19065q2;

    /* JADX INFO: renamed from: q3 */
    public vqd0 f19066q3;

    /* JADX INFO: renamed from: q4 */
    public tpd0 f19067q4;

    /* JADX INFO: renamed from: q5 */
    public zpd0 f19068q5;

    /* JADX INFO: renamed from: q6 */
    public zpd0 f19069q6;

    /* JADX INFO: renamed from: r0 */
    public zpd0 f19070r0;

    /* JADX INFO: renamed from: r1 */
    public hpd0 f19071r1;

    /* JADX INFO: renamed from: r2 */
    public hpd0 f19072r2;

    /* JADX INFO: renamed from: r3 */
    public tpd0 f19073r3;

    /* JADX INFO: renamed from: r4 */
    public hpd0 f19074r4;

    /* JADX INFO: renamed from: r5 */
    public zpd0 f19075r5;

    /* JADX INFO: renamed from: r6 */
    public hpd0 f19076r6;

    /* JADX INFO: renamed from: s0 */
    public vqd0 f19077s0;

    /* JADX INFO: renamed from: s1 */
    public hpd0 f19078s1;

    /* JADX INFO: renamed from: s2 */
    public hpd0 f19079s2;

    /* JADX INFO: renamed from: s3 */
    public zpd0 f19080s3;

    /* JADX INFO: renamed from: s4 */
    public zpd0 f19081s4;

    /* JADX INFO: renamed from: s5 */
    public tpd0 f19082s5;

    /* JADX INFO: renamed from: s6 */
    public uqd0 f19083s6;

    /* JADX INFO: renamed from: t0 */
    public hpd0 f19084t0;

    /* JADX INFO: renamed from: t1 */
    public hpd0 f19085t1;

    /* JADX INFO: renamed from: t2 */
    public kpd0 f19086t2;

    /* JADX INFO: renamed from: t3 */
    public uqd0 f19087t3;

    /* JADX INFO: renamed from: t4 */
    public zpd0 f19088t4;

    /* JADX INFO: renamed from: t5 */
    public hpd0 f19089t5;

    /* JADX INFO: renamed from: t6 */
    public hpd0 f19090t6;

    /* JADX INFO: renamed from: u0 */
    public hpd0 f19091u0;

    /* JADX INFO: renamed from: u1 */
    public zpd0 f19092u1;

    /* JADX INFO: renamed from: u2 */
    public hpd0 f19093u2;

    /* JADX INFO: renamed from: u3 */
    public uqd0 f19094u3;

    /* JADX INFO: renamed from: u4 */
    public tpd0 f19095u4;

    /* JADX INFO: renamed from: u5 */
    public uqd0 f19096u5;

    /* JADX INFO: renamed from: u6 */
    public a<roj0> f19097u6;

    /* JADX INFO: renamed from: v0 */
    public hpd0 f19098v0;

    /* JADX INFO: renamed from: v1 */
    public hpd0 f19099v1;

    /* JADX INFO: renamed from: v2 */
    public hpd0 f19100v2;

    /* JADX INFO: renamed from: v3 */
    public hpd0 f19101v3;

    /* JADX INFO: renamed from: v4 */
    public tpd0 f19102v4;

    /* JADX INFO: renamed from: v5 */
    public tpd0 f19103v5;

    /* JADX INFO: renamed from: v6 */
    public hpd0 f19104v6;

    /* JADX INFO: renamed from: w0 */
    public hpd0 f19105w0;

    /* JADX INFO: renamed from: w1 */
    public zpd0 f19106w1;

    /* JADX INFO: renamed from: w2 */
    public hpd0 f19107w2;

    /* JADX INFO: renamed from: w3 */
    public tpd0 f19108w3;

    /* JADX INFO: renamed from: w4 */
    public hpd0 f19109w4;

    /* JADX INFO: renamed from: w5 */
    public uqd0 f19110w5;

    /* JADX INFO: renamed from: w6 */
    public hpd0 f19111w6;

    /* JADX INFO: renamed from: x0 */
    public tpd0 f19112x0;

    /* JADX INFO: renamed from: x1 */
    public zpd0 f19113x1;

    /* JADX INFO: renamed from: x2 */
    public uqd0 f19114x2;

    /* JADX INFO: renamed from: x3 */
    public zpd0 f19115x3;

    /* JADX INFO: renamed from: x4 */
    public hpd0 f19116x4;

    /* JADX INFO: renamed from: x5 */
    public tpd0 f19117x5;

    /* JADX INFO: renamed from: x6 */
    public zpd0 f19118x6;

    /* JADX INFO: renamed from: y0 */
    public hpd0 f19119y0;

    /* JADX INFO: renamed from: y1 */
    public hpd0 f19120y1;

    /* JADX INFO: renamed from: y2 */
    public zpd0 f19121y2;

    /* JADX INFO: renamed from: y3 */
    public zpd0 f19122y3;

    /* JADX INFO: renamed from: y4 */
    public tpd0 f19123y4;

    /* JADX INFO: renamed from: y5 */
    public uqd0 f19124y5;

    /* JADX INFO: renamed from: y6 */
    public hpd0 f19125y6;

    /* JADX INFO: renamed from: z0 */
    public a<Boolean> f19126z0;

    /* JADX INFO: renamed from: z1 */
    public uqd0 f19127z1;

    /* JADX INFO: renamed from: z2 */
    public tpd0 f19128z2;

    /* JADX INFO: renamed from: z3 */
    public hpd0 f19129z3;

    /* JADX INFO: renamed from: z4 */
    public hpd0 f19130z4;

    /* JADX INFO: renamed from: z5 */
    public tpd0 f19131z5;

    /* JADX INFO: renamed from: z6 */
    public hpd0 f19132z6;

    /* JADX INFO: renamed from: l.pib$a */
    public class C1125a implements w9j<Envelope, Boolean> {
        public C1125a() {
        }

        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean call(Envelope envelope) {
            int i = envelope.meta.code;
            return (i == 200 || i == 201) ? Boolean.TRUE : Boolean.FALSE;
        }
    }

    /* JADX INFO: renamed from: l.pib$b */
    public class C1126b implements v9j<c<Envelope>> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f19134a;

        /* JADX INFO: renamed from: l.pib$b$a */
        public class a implements v9j<stc0> {
            public a() {
            }

            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public stc0 call() {
                return C0154a.f3483P.auth().q(C0154a.m3296w2(C1126b.this.f19134a)).f().b();
            }
        }

        public C1126b(String str) {
            this.f19134a = str;
        }

        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public c<Envelope> call() {
            return ia20.m16571e(new a()).compose(mkd0.C());
        }
    }

    /* JADX INFO: renamed from: l.pib$c */
    public class C1127c implements v9j<c<Envelope>> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f19137a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ utc0 f19138b;

        /* JADX INFO: renamed from: l.pib$c$a */
        public class a implements v9j<stc0> {
            public a() {
            }

            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public stc0 call() {
                return C0154a.f3483P.auth().q(C1127c.this.f19137a).l(C1127c.this.f19138b).b();
            }
        }

        public C1127c(String str, utc0 utc0Var) {
            this.f19137a = str;
            this.f19138b = utc0Var;
        }

        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public c<Envelope> call() {
            return ia20.m16571e(new a()).observeOn(jo0.a());
        }
    }

    /* JADX INFO: renamed from: l.pib$d */
    public class C1128d implements v9j<stc0> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f19141a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ utc0 f19142b;

        public C1128d(String str, utc0 utc0Var) {
            this.f19141a = str;
            this.f19142b = utc0Var;
        }

        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public stc0 call() {
            return C0154a.f3483P.auth().q(this.f19141a).l(this.f19142b).b();
        }
    }

    /* JADX INFO: renamed from: l.pib$e */
    public class C1129e implements w9j<UserFeedbackInfo, UserFeedbackInfo> {
        public C1129e() {
        }

        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public UserFeedbackInfo call(UserFeedbackInfo userFeedbackInfo) {
            CoreModule.f1534c.f3628e0.f18912W6 = userFeedbackInfo;
            return userFeedbackInfo;
        }
    }

    /* JADX INFO: renamed from: l.pib$f */
    public class C1130f implements w9j<Envelope, UserFeedbackInfo> {
        public C1130f() {
        }

        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public UserFeedbackInfo call(Envelope envelope) {
            return envelope.getModuleData(CoreData.class).userFeedbackInfo;
        }
    }

    /* JADX INFO: renamed from: l.pib$g */
    public class C1131g implements w9j<UserFeedbackInfo, UserFeedbackInfo> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f19146a;

        public C1131g(String str) {
            this.f19146a = str;
        }

        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public UserFeedbackInfo call(UserFeedbackInfo userFeedbackInfo) {
            if (!TextUtils.equals(this.f19146a, "ai_manual")) {
                CoreModule.f1534c.f3628e0.f18912W6 = userFeedbackInfo;
                return userFeedbackInfo;
            }
            if (userFeedbackInfo.isGetFeedBackAI) {
                CoreModule.f1534c.f3628e0.m21417W9(CoreModule.m1850H().userId());
            }
            return userFeedbackInfo;
        }
    }

    /* JADX INFO: renamed from: l.pib$h */
    public class C1132h implements w9j<Envelope, UserFeedbackInfo> {
        public C1132h() {
        }

        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public UserFeedbackInfo call(Envelope envelope) {
            return envelope.getModuleData(CoreData.class).userFeedbackInfo;
        }
    }

    /* JADX INFO: renamed from: l.pib$i */
    public class C1133i implements w9j<Envelope, roj0> {
        public C1133i() {
        }

        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public roj0 call(Envelope envelope) {
            return roj0.a;
        }
    }

    /* JADX INFO: renamed from: l.pib$j */
    public static class C1134j extends fgf0<Map<String, GPMemo>> {
        public C1134j(pib pibVar) {
            super("gpMemos", new ggi(new qnd("gp_memos", "_v3", CoreModule.m1850H().userId()), -1, ProtobufAdapter.HASH_MAP_ADAPTER(new w9j() { // from class: l.qib
                public final Object call(Object obj) {
                    return ((GPMemo) obj).userId;
                }
            }, GPMemo.PROTOBUF_ADAPTER)), new v9j() { // from class: l.rib
                public final Object call() {
                    return ia20.m16569c(new v9j() { // from class: l.sib
                        public final Object call() {
                            return C0154a.f3483P.auth().q(C0154a.m3296w2("/" + CoreModule.m1850H().userId() + "/memos")).f().b();
                        }
                    }, GPMemoEnvelope.JSON_ADAPTER).map(new w9j() { // from class: l.tib
                        public final Object call(Object obj) {
                            return ((GPMemoEnvelope) obj).data.memos;
                        }
                    }).flatMap(new na8()).toMap(new w9j() { // from class: l.uib
                        public final Object call(Object obj) {
                            return ((GPMemo) obj).userId;
                        }
                    });
                }
            });
        }
    }

    /* JADX INFO: renamed from: l.pib$k */
    public static class C1135k extends fgf0<CurrencyTypeData> {
        public C1135k() {
            super("currencyType", new ggi(new qnd("intl_currency_type", "_1", "_" + CoreModule.m1850H().userId()), -1, CurrencyTypeData.PROTOBUF_ADAPTER), new v9j() { // from class: l.vib
                public final Object call() {
                    return ia20.m16569c(new v9j() { // from class: l.wib
                        public final Object call() {
                            return C0154a.f3483P.auth().q(C0154a.m3130G("/intl-currency-switch")).f().b();
                        }
                    }, CurrencyTypeEnvelop.JSON_ADAPTER).map(new w9j() { // from class: l.xib
                        public final Object call(Object obj) {
                            return pib.C1135k.m21548B((CurrencyTypeEnvelop) obj);
                        }
                    });
                }
            });
        }

        /* JADX INFO: renamed from: B */
        public static /* synthetic */ CurrencyTypeData m21548B(CurrencyTypeEnvelop currencyTypeEnvelop) {
            String str = currencyTypeEnvelop.data.currencyType;
            qib0.f19777D0 = str;
            CoreModule.f1534c.f3628e0.f19031l6.put(str);
            hfw.m16208a("[putong-common][currency_type]", "current currency type = " + str);
            return currencyTypeEnvelop.data;
        }
    }

    /* JADX INFO: renamed from: l.pib$l */
    public static class C1136l extends fgf0<RegionRule> {
        public C1136l() {
            super("regionRules", new ggi(new qnd("region_rule", "_2", "_" + CoreModule.m1850H().userId()), -1, RegionRule.PROTOBUF_ADAPTER), new v9j() { // from class: l.yib
                public final Object call() {
                    return ia20.m16569c(new v9j() { // from class: l.zib
                        public final Object call() {
                            return C0154a.f3483P.auth().q(C0154a.m3292v2("me/region-rules")).f().b();
                        }
                    }, RegionRulesEnvelop.JSON_ADAPTER).map(new w9j() { // from class: l.ajb
                        public final Object call(Object obj) {
                            return pib.C1136l.m21552C((RegionRulesEnvelop) obj);
                        }
                    });
                }
            });
        }

        /* JADX INFO: renamed from: C */
        public static /* synthetic */ RegionRule m21552C(RegionRulesEnvelop regionRulesEnvelop) {
            RegionRule regionRule = (RegionRule) regionRulesEnvelop.data.regionRules.get(0);
            LiveRegionTag liveRegionTag = regionRule.liveRegionTag;
            qib0.f19810h0 = liveRegionTag;
            CoreModule.f1534c.f3628e0.f18937a0.put(liveRegionTag.toString());
            hfw.m16208a("[putong-common][regiontag]", "current live region tag = " + regionRule.liveRegionTag.toString());
            return regionRule;
        }
    }

    public pib(C0158c c0158c, String str) {
        super(c0158c);
        this.f18946b1 = a.c(0);
        this.f18775E1 = b.b();
        this.f18782F1 = b.b();
        this.f18789G1 = a.b();
        this.f18796H1 = b.b();
        Boolean bool = Boolean.TRUE;
        this.f18802I1 = a.c(bool);
        this.f18809J1 = b.b();
        this.f18816K1 = a.b();
        this.f18823L1 = a.b();
        this.f18867R1 = a.b();
        this.f18875S1 = a.b();
        roj0 roj0Var = roj0.a;
        this.f18883T1 = a.c(roj0Var);
        this.f18891U1 = a.b();
        this.f18899V1 = new tpd0("maxAdmobNum" + CoreModule.m1850H().userId(), -1);
        this.f18907W1 = new uqd0("showProfileAdTime" + CoreModule.m1850H().userId(), "");
        this.f18923Y1 = a.b();
        this.f18980f3 = 0L;
        this.f19012j3 = 0L;
        this.f19020k3 = new tpd0("bottombarLocationOnScreenY", 0);
        this.f19028l3 = new tpd0("messageAllSortLayoutLocationOnScreenY", 0);
        this.f18839N3 = b.b();
        this.f18989g4 = b.b();
        this.f18997h4 = b.b();
        this.f18974e5 = false;
        this.f18982f5 = false;
        this.f18990g5 = false;
        this.f19097u6 = a.b();
        this.f18856P6 = new HashMap();
        this.f18864Q6 = new HashMap<>(128);
        this.f18872R6 = new HashMap<>();
        this.f18880S6 = new ConcurrentHashMap<>(512);
        this.f18888T6 = new LinkedHashMap<>();
        this.f18896U6 = new HashSet();
        this.f18904V6 = a.b();
        this.f18928Y6 = false;
        this.f18936Z6 = false;
        this.f18944a7 = false;
        this.f18952b7 = a.b();
        this.f18960c7 = b.b();
        this.f18968d7 = b.b();
        this.f18976e7 = new C1136l();
        this.f18984f7 = new C1135k();
        this.f18992g7 = new C1134j(this);
        this.f19000h7 = false;
        this.f19008i7 = a.b();
        this.f19016j7 = a.b();
        this.f19024k7 = a.c(MyTabTask.new_());
        this.f19032l7 = a.c(roj0Var);
        this.f19040m7 = new tpd0("latest_invite_verify_count_" + CoreModule.m1850H().userId(), 0);
        this.f19048n7 = new hpd0("latest_invite_verify_showed_" + CoreModule.m1850H().userId(), bool);
        this.f18857Q = c0158c;
        this.f18754B1 = str;
        this.f18920X6 = ogw.e(str + mqi0.o());
        StringBuilder sb = new StringBuilder("userSettings_");
        sb.append(CoreModule.m1850H().userId());
        this.f18865R = new eqd0(sb.toString(), true, "putongPref");
        this.f18881T = new tpd0("session_changed_fake_profile" + CoreModule.m1850H().userId(), -1);
        this.f18889U = a.b();
        this.f18897V = a.b();
        Boolean bool2 = Boolean.FALSE;
        this.f18905W = a.c(bool2);
        this.f18889U.onNext(roj0Var);
        this.f18913X = new zpd0("swipe_count_" + CoreModule.m1850H().userId(), 0L);
        this.f18921Y = new tpd0("super_like_shown_count" + CoreModule.m1850H().userId(), 0);
        this.f18929Z = new zpd0("last_superlike_dlg_shown" + CoreModule.m1850H().userId(), 0L);
        this.f18945b0 = new hpd0("signup_al_bind_phone" + CoreModule.m1850H().userId(), bool2);
        this.f18977f0 = new hpd0("new_mine_tab_setting_clicked" + CoreModule.m1850H().userId(), bool2);
        this.f18961d0 = new hpd0("gp_bind_phone_notice" + CoreModule.m1850H().userId(), bool);
        this.f18969e0 = new hpd0("gp_bind_phone_red_dot" + CoreModule.m1850H().userId(), bool);
        this.f19126z0 = a.b();
        this.f18953c0 = new hpd0("all_bind_f_showing_" + CoreModule.m1850H().userId(), bool2);
        this.f18873S = new hpd0("isFromSignUp_" + CoreModule.m1850H().userId(), bool2);
        this.f18985g0 = new ard0("new_user_vip_strategy" + CoreModule.m1850H().userId(), true);
        this.f18746A0 = a.b();
        this.f18760C0 = a.b();
        this.f18767D0 = a.b();
        this.f18774E0 = a.b();
        this.f18781F0 = a.b();
        this.f18993h0 = new hpd0("has_shown_gp_vip_update_guide", bool2);
        this.f19001i0 = new tpd0("vip_update_guide_privilege_display_count" + CoreModule.m1850H().userId(), 0);
        this.f19009j0 = new zpd0("push_guide_dialog_show_time" + CoreModule.m1850H().userId(), 0L);
        this.f19017k0 = new vqd0("push_guide_dialog_close_time_set" + CoreModule.m1850H().userId(), new HashSet());
        this.f19025l0 = new zpd0("push_guide_dialog_close_freezing_time" + CoreModule.m1850H().userId(), 0L);
        this.f19033m0 = new zpd0("push_guide_notify_auth_open_time" + CoreModule.m1850H().userId(), 0L);
        this.f19041n0 = new zpd0("conversation_header_guide_show_time" + CoreModule.m1850H().userId(), 0L);
        this.f19056p0 = new zpd0("push_conv_header_close_freezing_time" + CoreModule.m1850H().userId(), 0L);
        this.f19049o0 = new vqd0("push_conv_header_close_timeSet" + CoreModule.m1850H().userId(), new HashSet());
        this.f19070r0 = new zpd0("msg_main_top_guide_user_update_time" + CoreModule.m1850H().userId(), 0L);
        this.f19063q0 = new vqd0("msg_main_top_guide_userid_set" + CoreModule.m1850H().userId(), new HashSet());
        this.f19077s0 = new vqd0("msg_main_top_guide_userid_close_set" + CoreModule.m1850H().userId(), new HashSet());
        this.f19084t0 = new hpd0("hasDisplaySearch_" + CoreModule.m1850H().userId(), bool2);
        this.f19091u0 = new hpd0("isNewPicPicked" + CoreModule.m1850H().userId(), bool2);
        this.f19098v0 = new hpd0("IsSmartPortraitSwitchCheckedAtFirst" + CoreModule.m1850H().userId(), bool2);
        this.f19105w0 = new hpd0("chatNewMatchShowCloseConfirmDlg", bool2);
        this.f19112x0 = new tpd0("chatNewMatchCountMaxNum", 100);
        this.f19119y0 = new hpd0("NeedOpenSmartPortraitWhenUploadNewPic" + CoreModule.m1850H().userId(), bool2);
        this.f18822L0 = new hpd0("has_patch_india_lady_privacy_" + CoreModule.m1850H().userId(), bool2);
        this.f18795H0 = new tpd0("tantanAuthToastShowTimes_v3_" + CoreModule.m1850H().userId(), 0);
        this.f18801I0 = new zpd0("tantanAuthToastLastShowTime_v3_" + CoreModule.m1850H().userId(), 0L);
        this.f18808J0 = new vqd0("tantanAuthToastShowUser_v3_" + CoreModule.m1850H().userId(), new HashSet());
        this.f18815K0 = new hpd0("chatTantanAuthTipsShown_v3_" + CoreModule.m1850H().userId(), bool2);
        this.f18829M0 = a.b();
        this.f18937a0 = new uqd0("last_live_region_tag_" + CoreModule.m1850H().userId(), "");
        this.f18836N0 = new zpd0("swipe_all_counts_" + CoreModule.m1850H().userId(), 0L);
        this.f18843O0 = new zpd0("today_start_swipe_time_" + CoreModule.m1850H().userId(), 0L);
        this.f18850P0 = new zpd0("today_swipe_count_" + CoreModule.m1850H().userId(), 0L);
        this.f18858Q0 = new zpd0("today_right_swipe_count_" + CoreModule.m1850H().userId(), 0L);
        this.f18866R0 = new zpd0("last_dangerous_user_safety_reminder_time_" + CoreModule.m1850H().userId(), 0L);
        this.f18882T0 = new tpd0("popup_number_" + CoreModule.m1850H().userId(), 0);
        this.f18890U0 = new tpd0("show_fake_dlg_count_4_intl_" + CoreModule.m1850H().userId(), 0);
        this.f18906W0 = new hpd0("profile_blur_cover_show", bool2);
        this.f18898V0 = new tpd0("fakeSwipeDlgShowCount" + CoreModule.m1850H().userId(), 0);
        this.f18914X0 = new hpd0("click_moment_" + CoreModule.m1850H().userId(), bool2);
        this.f18788G0 = new tpd0("see_show_cnt_" + CoreModule.m1850H().userId(), 0);
        this.f18930Z0 = new hpd0("already_merge_dialog_info" + CoreModule.m1850H().userId(), bool2);
        qib0.f19810h0 = LiveRegionTag.get((String) this.f18937a0.get());
        this.f18938a1 = new hpd0("full_card_anim_reset_" + CoreModule.m1850H().userId(), bool2);
        this.f18954c1 = new hpd0("profile_example_tab_dot_show", bool);
        this.f18962d1 = new hpd0("profile_tickle_set_" + CoreModule.m1850H().userId(), bool2);
        this.f18970e1 = new hpd0("profile_tickle_set_tip_show_" + CoreModule.m1850H().userId(), bool2);
        this.f18978f1 = new uqd0("profile_tickle_set_tip_message_show_" + CoreModule.m1850H().userId(), "");
        this.f18986g1 = new zpd0("enter_tickle_group_time_" + CoreModule.m1850H().userId(), 0L);
        this.f18994h1 = new hpd0("local_tickle_tip_show_" + CoreModule.m1850H().userId(), bool2);
        this.f19002i1 = new uqd0("local_tickle_tip_message_" + CoreModule.m1850H().userId(), "");
        this.f19010j1 = new tpd0("main_trans_speed", 1);
        this.f19018k1 = new hpd0("showUser43Crop", bool2);
        this.f19034m1 = a.b();
        this.f19042n1 = a.b();
        this.f19050o1 = a.b();
        this.f19057p1 = new zpd0("latest_theme_show_temp_" + CoreModule.m1850H().userId(), 0L);
        this.f19064q1 = new hpd0("fake_gender_clicked_" + CoreModule.m1850H().userId(), bool2);
        this.f19085t1 = new hpd0("contact_guid" + CoreModule.m1850H().userId(), bool2);
        this.f19092u1 = new zpd0("latest_close_female_chat_guide_time_" + CoreModule.m1850H().userId(), 0L);
        this.f19099v1 = new hpd0("clicked_media_intimate_quetsions", bool2);
        this.f19106w1 = new zpd0("conv_counter_check_time_sync_" + CoreModule.m1850H().userId(), 0L);
        this.f19113x1 = new zpd0("conv_counter_last_check_time_sync_" + CoreModule.m1850H().userId(), 0L);
        this.f19120y1 = new hpd0("profile_optimize_entry" + CoreModule.m1850H().userId(), bool2);
        this.f18874S0 = new hpd0("intl_web_pay_enable_" + CoreModule.m1850H().userId(), bool2);
        this.f19071r1 = new hpd0("card_has_show_pic_verified_anim_" + CoreModule.m1850H().userId(), bool2);
        this.f19078s1 = new hpd0("card_has_show_id_verified_anim_" + CoreModule.m1850H().userId(), bool2);
        this.f19127z1 = new uqd0("question_language_sp", "");
        this.f18747A1 = new zpd0("intl_read_messages_tips_last_show_time_" + CoreModule.m1850H().userId(), 0L);
        this.f18830M1 = new tpd0("sticker_collection_position" + CoreModule.m1850H().userId(), 0);
        this.f18837N1 = new hpd0("multi_need_preload_tag_svga", bool2);
        this.f19079s2 = new hpd0("show_new_chat_warming_up_debug" + CoreModule.m1850H().userId(), bool2);
        this.f19093u2 = new hpd0("new_chat_warming_up_debug" + CoreModule.m1850H().userId(), bool2);
        this.f19086t2 = new kpd0("new_chat_warming_up_num_debug" + CoreModule.m1850H().userId(), 5.0d);
        this.f19100v2 = new hpd0("chat_upgrade_emoji_debug" + CoreModule.m1850H().userId(), bool2);
        this.f18844O1 = new hpd0("use_tantanlist", bool2);
        this.f18851P1 = new hpd0("use_tantanlist_debug", bool2);
        this.f18761C1 = new hpd0("has_share_tip_show" + CoreModule.m1850H().userId(), bool2);
        this.f18768D1 = new hpd0("has_local_share_tip_show" + CoreModule.m1850H().userId(), bool2);
        this.f18859Q1 = new zpd0("fill_info_join_experience_time_" + CoreModule.m1850H().userId(), -1L);
        this.f18939a2 = new zpd0("push_switch_time" + CoreModule.m1850H().userId(), 0L);
        this.f18931Z1 = new tpd0("push_switch_count" + CoreModule.m1850H().userId(), 0);
        this.f18955c2 = new hpd0("push_switch_gender" + CoreModule.m1850H().userId(), bool2);
        this.f18947b2 = new zpd0("push_switch_tips_time" + CoreModule.m1850H().userId(), 0L);
        this.f18963d2 = new hpd0("push_switch_has_show" + CoreModule.m1850H().userId(), bool2);
        this.f18971e2 = new hpd0("push_switch_has_tips_show" + CoreModule.m1850H().userId(), bool2);
        this.f18915X1 = new hpd0("tag_show_click_guide_key" + CoreModule.m1850H().userId(), bool);
        this.f18979f2 = new uqd0("recent_book_movies_dramas_time" + qib0.f19805c0.userId(), "");
        this.f18987g2 = new zpd0("recent_book_movies_dramas_count" + qib0.f19805c0.userId(), 0L);
        this.f18995h2 = new hpd0("first_exposure_book_movies" + qib0.f19805c0.userId(), bool);
        this.f19003i2 = new uqd0("login_user_book_movies_drama_data" + CoreModule.m1850H().userId(), "");
        this.f19011j2 = new zpd0("conversation_tag_guide_time" + CoreModule.m1850H().userId(), 0L);
        this.f19019k2 = new tpd0("conversation_tag_guide_mouth_count" + CoreModule.m1850H().userId(), 0);
        this.f19027l2 = new tpd0("conversation_tag_guide_day_count" + CoreModule.m1850H().userId(), 0);
        this.f19035m2 = new zpd0("conversation_tag_guide_clear_date" + CoreModule.m1850H().userId(), 0L);
        this.f19043n2 = new zpd0("lastShowMomentpostGuideTime_" + CoreModule.m1850H().userId(), 0L);
        this.f19051o2 = new tpd0("me_tab_show_guide_bubble_verification" + CoreModule.m1850H().userId(), 0);
        this.f19058p2 = new uqd0("me_tab_show_guide_bubble_verification_time" + CoreModule.m1850H().userId(), "");
        this.f19065q2 = new hpd0("profile_show_guide_bubble_verification_pic" + CoreModule.m1850H().userId(), bool2);
        this.f19072r2 = new hpd0("profile_show_guide_bubble_verification_pic_idcard" + CoreModule.m1850H().userId(), bool2);
        this.f19107w2 = new hpd0("refresh_chatheat_sticker_" + CoreModule.m1850H().userId(), bool2);
        this.f19114x2 = new uqd0("core_square_debug_lua_url_1", "/core/example2/v-/1.x/sources/indexMua.lua?_bid=1003408", false);
        this.f18748A2 = new tpd0("new_user_count" + CoreModule.m1850H().userId(), 0);
        this.f18755B2 = new tpd0("new_user_right_count" + CoreModule.m1850H().userId(), 0);
        this.f18762C2 = new tpd0("new_user_today_count" + CoreModule.m1850H().userId(), 0);
        this.f18769D2 = new tpd0("new_user_today_match_count" + CoreModule.m1850H().userId(), 0);
        this.f18776E2 = new hpd0("new_user_has_show" + CoreModule.m1850H().userId(), bool2);
        this.f18783F2 = new hpd0("new_user_has_gusture_show" + CoreModule.m1850H().userId(), bool2);
        this.f18810J2 = new hpd0("match_ice_break_exp_debug" + CoreModule.m1850H().userId(), bool2);
        this.f18817K2 = new hpd0("match_ice_break_toggle_gender_debug" + CoreModule.m1850H().userId(), bool2);
        this.f18824L2 = new tpd0("conv_match_ice_break_guide_count" + CoreModule.m1850H().userId(), 0);
        this.f18831M2 = new zpd0("conv_match_ice_break_guide_last_time" + CoreModule.m1850H().userId(), 0L);
        this.f19121y2 = new zpd0("lastShowMomentLikeGuideTime_" + CoreModule.m1850H().userId(), 0L);
        this.f19128z2 = new tpd0("countMaleMomentPostGuideMesage_" + CoreModule.m1850H().userId(), 0);
        this.f18838N2 = new hpd0("jailed_profile_debug" + CoreModule.m1850H().userId(), bool2);
        this.f18845O2 = new hpd0("jailed_swipe_debug" + CoreModule.m1850H().userId(), bool2);
        this.f18852P2 = new hpd0("tt_eco_abtest_debug" + CoreModule.m1850H().userId(), bool2);
        this.f18860Q2 = new zpd0("core_last_show_feed_time" + CoreModule.m1850H().userId(), 0L);
        this.f18868R2 = new zpd0("core_feed_tab_pop_show_last_time" + CoreModule.m1850H().userId(), 0L);
        this.f18876S2 = new uqd0("core_feed_tab_pop_show_times" + CoreModule.m1850H().userId(), "");
        this.f18884T2 = new zpd0("core_feed_tab_pop_next_allow_show_time" + CoreModule.m1850H().userId(), 0L);
        this.f18892U2 = new zpd0("core_feed_tab_pop_next_request_time" + CoreModule.m1850H().userId(), 0L);
        this.f18900V2 = new hpd0("core_feed_tab_pop_debug" + CoreModule.m1850H().userId(), bool2);
        this.f18916X2 = new hpd0("ttt_show_facebook_bind_phone_dlg" + CoreModule.m1850H().userId(), bool);
        this.f18932Z2 = new hpd0("ttt_show_google_bind_phone_dlg" + CoreModule.m1850H().userId(), bool);
        this.f18924Y2 = new hpd0("show_empty_address_book" + CoreModule.m1850H().userId(), bool2);
        this.f18908W2 = new uqd0("show_upload_real_avatar_push" + CoreModule.m1850H().userId(), "");
        this.f18996h3 = new tpd0("ice_break_dlg_no_send_action_count" + CoreModule.m1850H().userId(), 0);
        this.f19004i3 = new zpd0("ice_break_dlg_freezing_time" + CoreModule.m1850H().userId(), 0L);
        this.f18790G2 = new uqd0("growth_exposure_num" + CoreModule.m1850H().userId(), "");
        this.f18797H2 = new zpd0("growth_exposure_tip_time" + CoreModule.m1850H().userId(), 0L);
        this.f18803I2 = new zpd0("growth_exposure_pop_time" + CoreModule.m1850H().userId(), 0L);
        this.f18940a3 = new hpd0("match_success_2_debug" + CoreModule.m1850H().userId(), bool2);
        this.f18948b3 = new hpd0("messageTabFilterDebug" + CoreModule.m1850H().userId(), bool2);
        this.f18988g3 = new uqd0("swipe_superlike_pay_will_" + CoreModule.m1850H().userId(), "high");
        this.f19052o3 = new hpd0("recommend_voice_chat_room_debug" + CoreModule.m1850H().userId(), bool2);
        this.f18956c3 = new hpd0("isHeartSignalVipAlertDebug" + CoreModule.m1850H().userId(), bool2);
        this.f18964d3 = new uqd0("sendMessagePageFlashChatPopupDialogTime" + CoreModule.m1850H().userId(), "");
        this.f19036m3 = new hpd0("msg_game_red_" + CoreModule.m1850H().userId(), bool);
        this.f19044n3 = new hpd0("onlineSmsSwitchDebug" + CoreModule.m1850H().userId(), bool2);
        this.f19059p3 = new vqd0("growth_msg_uids" + CoreModule.m1850H().userId(), new HashSet());
        this.f19066q3 = new vqd0("has_growth_msg_click" + CoreModule.m1850H().userId(), new HashSet());
        this.f19073r3 = new tpd0("has_growth_msg_count" + CoreModule.m1850H().userId(), 0);
        this.f19080s3 = new zpd0("get_new_user_lost_time" + CoreModule.m1850H().userId(), 0L);
        this.f19087t3 = new uqd0("chat_click_set" + CoreModule.m1850H().userId(), "");
        this.f19094u3 = new uqd0("chat_lost_time_set" + CoreModule.m1850H().userId(), "");
        this.f19101v3 = new hpd0("friend_online_notify_showed_" + CoreModule.m1850H().userId(), bool2);
        this.f19108w3 = new tpd0("continuous_click_conv_next_count" + CoreModule.m1850H().userId(), 0);
        this.f19115x3 = new zpd0("silent_time_conv_next" + CoreModule.m1850H().userId(), 0L);
        this.f19122y3 = new zpd0("latest_time_conv_next" + CoreModule.m1850H().userId(), 0L);
        this.f19129z3 = new hpd0("show_filter_veri_msg_tips" + CoreModule.m1850H().userId(), bool);
        this.f18749A3 = new hpd0("dispose_old_invalid_conv+" + CoreModule.m1850H().userId(), bool);
        this.f18756B3 = new hpd0("dispose_old_invalid_conv_del+" + CoreModule.m1850H().userId(), bool);
        this.f18804I3 = new hpd0("has_spam_dialog_show+" + CoreModule.m1850H().userId(), bool2);
        this.f18763C3 = new uqd0("positive_feedback" + CoreModule.m1850H().userId(), "");
        this.f18770D3 = new uqd0("no_remaining_times" + CoreModule.m1850H().userId(), "");
        this.f18777E3 = new uqd0("pairing_restriction+" + CoreModule.m1850H().userId(), "");
        m21390P7();
        this.f18784F3 = new tpd0("ai_picture_pop_guide_count" + CoreModule.m1850H().userId(), 0);
        this.f18791G3 = new tpd0("ai_picture_quick_access_count" + CoreModule.m1850H().userId(), 0);
        this.f18818K3 = new zpd0("today_cold_start_app_time_" + CoreModule.m1850H().userId(), 0L);
        this.f18825L3 = new tpd0("today_cold_start_count_" + CoreModule.m1850H().userId(), 0);
        this.f18832M3 = new zpd0("top_item_red_dot_hide_time_" + CoreModule.m1850H().userId(), 0L);
        this.f18853P3 = new tpd0("profile_ui_upgrade_introduction_count" + CoreModule.m1850H().userId(), 0);
        this.f18861Q3 = new tpd0("profile_ui_upgrade_photo_count" + CoreModule.m1850H().userId(), 0);
        this.f18869R3 = new uqd0("last_show_home_tab+" + CoreModule.m1850H().userId(), "");
        this.f18877S3 = new hpd0("message_recall_show_toast", bool2);
        this.f18885T3 = new tpd0("message_recall_show_toast_count", 0);
        this.f18893U3 = new uqd0("pic_exchange_pw_show_config" + CoreModule.m1850H().userId(), "{}");
        this.f18901V3 = new zpd0("conv_pic_cert_guide_silence_time" + CoreModule.m1850H().userId(), 0L);
        this.f18909W3 = new tpd0("conv_pic_cert_guide_show_count" + CoreModule.m1850H().userId(), 0);
        this.f18917X3 = new zpd0("profile_pic_cert_guide_silence_time" + CoreModule.m1850H().userId(), 0L);
        this.f18933Z3 = new uqd0("user_home_mode" + CoreModule.m1850H().userId(), "loveMode");
        this.f18925Y3 = new tpd0("profile_pic_cert_guide_show_count" + CoreModule.m1850H().userId(), 0);
        this.f18973e4 = new hpd0("has_show_find_user_tip+" + CoreModule.m1850H().userId(), bool2);
        this.f18941a4 = new hpd0("marry_debug_model", bool2);
        this.f18949b4 = new hpd0("marry_model_dot" + CoreModule.m1850H().userId(), bool2);
        this.f18981f4 = new hpd0("has_open_marry_audit_act_first" + CoreModule.m1850H().userId(), bool2);
        this.f19005i4 = new uqd0("marry_edit_cache_declaration" + CoreModule.m1850H().userId(), (String) null);
        this.f19013j4 = new uqd0("marry_edit_cache_mate_description" + CoreModule.m1850H().userId(), (String) null);
        this.f19021k4 = new uqd0("marry_edit_cache_family_background" + CoreModule.m1850H().userId(), (String) null);
        this.f19029l4 = new uqd0("marry_edit_cache_bride_price" + CoreModule.m1850H().userId(), (String) null);
        this.f19037m4 = new uqd0("marry_edit_cache_prologue" + CoreModule.m1850H().userId(), (String) null);
        this.f19045n4 = new hpd0("marry_has_enter_model_" + CoreModule.m1850H().userId(), bool2);
        this.f19053o4 = new uqd0("marry_red_dot_show_key_" + CoreModule.m1850H().userId(), "");
        this.f19060p4 = new uqd0("marry_spring_festival_red_dot_show_key_" + CoreModule.m1850H().userId(), "");
        this.f19067q4 = new tpd0("marry_spring_festival_pop_up_marker_" + CoreModule.m1850H().userId(), -1);
        this.f19081s4 = new zpd0("chat_partner_last_request_time" + CoreModule.m1850H().userId(), 0L);
        this.f19088t4 = new zpd0("chat_partner_last_show_time" + CoreModule.m1850H().userId(), 0L);
        this.f19095u4 = new tpd0("chat_partner_message_passive_count" + CoreModule.m1850H().userId(), 0);
        this.f19102v4 = new tpd0("chat_partner_online_passive_count" + CoreModule.m1850H().userId(), 0);
        this.f18764C4 = new zpd0("friend_tacit_limit_time" + CoreModule.m1850H().userId(), 0L);
        this.f18771D4 = new hpd0("friend_tacit_dialog_show" + CoreModule.m1850H().userId(), bool2);
        this.f18785F4 = new hpd0("marry_protocol_show" + CoreModule.m1850H().userId(), bool2);
        this.f18792G4 = new zpd0("low_photo_last_show_time" + CoreModule.m1850H().userId(), 0L);
        this.f18799H4 = new tpd0("low_photo_show_count_today" + CoreModule.m1850H().userId(), 0);
        this.f18805I4 = new hpd0("marry_guide_dlg_showed_" + CoreModule.m1850H().userId(), bool2);
        this.f18826L4 = new hpd0("marry_label_bubble_showed_" + CoreModule.m1850H().userId(), bool2);
        this.f18812J4 = new tpd0("marry_insert_card_count_" + CoreModule.m1850H().userId(), 0);
        this.f18819K4 = new zpd0("marry_insert_date_" + CoreModule.m1850H().userId(), 0L);
        this.f18833M4 = new tpd0("auto_change_marry_" + CoreModule.m1850H().userId(), 0);
        this.f18840N4 = new hpd0("new_profile_ui" + CoreModule.m1850H().userId(), bool2);
        this.f18847O4 = new zpd0("marry_show_date_time_" + CoreModule.m1850H().userId(), 0L);
        this.f18854P4 = new zpd0("lastet_enter_421_time_" + CoreModule.m1850H().userId(), 0L);
        this.f18878S4 = new zpd0("insert_421_feedback_time_" + CoreModule.m1850H().userId(), 0L);
        this.f18862Q4 = new zpd0("current_inset_421_time_" + CoreModule.m1850H().userId(), 0L);
        this.f18870R4 = new tpd0("today_insert_421_count_" + CoreModule.m1850H().userId(), 0);
        this.f18886T4 = new tpd0("continus_left_421_time_" + CoreModule.m1850H().userId(), 0);
        this.f18958c5 = new hpd0("open_one_click_pairing" + CoreModule.m1850H().userId(), bool);
        this.f18950b5 = new hpd0("game_cp_bottom_dialog_show" + CoreModule.m1850H().userId(), bool2);
        this.f18998h5 = new hpd0("HAS_SHOW_USER_STATE_TIP" + CoreModule.m1850H().userId(), bool2);
        this.f18910W4 = new zpd0("bar_lover_dlg1_last_show_time" + CoreModule.m1850H().userId(), 0L);
        this.f18918X4 = new tpd0("bar_lover_dlg1_last_show_counter" + CoreModule.m1850H().userId(), 0);
        this.f18926Y4 = new hpd0("show_bar_lover_dlg2" + CoreModule.m1850H().userId(), bool2);
        this.f18934Z4 = new zpd0("bar_lover_card_last_show_time" + CoreModule.m1850H().userId(), 0L);
        this.f18942a5 = new tpd0("bar_lover_card_last_show_counter" + CoreModule.m1850H().userId(), 0);
        this.f19006i5 = new tpd0("wechat_notify_banner_count" + CoreModule.m1850H().userId(), 0);
        this.f19014j5 = new zpd0("wechat_notify_banner_last_show_time" + CoreModule.m1850H().userId(), 0L);
        this.f19022k5 = new tpd0("wechat_notify_banner_day_count" + CoreModule.m1850H().userId(), 0);
        this.f19030l5 = new zpd0("wechat_gdlst" + CoreModule.m1850H().userId(), 0L);
        this.f19038m5 = new tpd0("wechat_gdsc" + CoreModule.m1850H().userId(), 0);
        this.f19046n5 = new zpd0("wechat_cgst" + CoreModule.m1850H().userId(), 0L);
        this.f19054o5 = new tpd0("wechat_cgsc" + CoreModule.m1850H().userId(), 0);
        this.f19061p5 = new tpd0("wechat_ctsc" + CoreModule.m1850H().userId(), 0);
        this.f19068q5 = new zpd0("wechat_bctm" + CoreModule.m1850H().userId(), 0L);
        this.f19075r5 = new zpd0("stock_fake_dlg_last_show_time" + CoreModule.m1850H().userId(), 0L);
        this.f19082s5 = new tpd0("stock_fake_dlg_show_count" + CoreModule.m1850H().userId(), 0);
        this.f19089t5 = new hpd0("manual_set_up_distance" + CoreModule.m1850H().userId(), bool2);
        this.f18972e3 = new uqd0("new_match_success_time_sb" + CoreModule.m1850H().userId(), "");
        this.f19096u5 = new uqd0("net_pic_dlg_data" + CoreModule.m1850H().userId(), "");
        this.f19103v5 = new tpd0("net_pic_dlg_count" + CoreModule.m1850H().userId(), 0);
        this.f19110w5 = new uqd0("repeat_pic_dlg_data" + CoreModule.m1850H().userId(), "");
        this.f19117x5 = new tpd0("repeat_pic_dlg_count" + CoreModule.m1850H().userId(), 0);
        this.f19124y5 = new uqd0("ai_pic_dlg_date" + CoreModule.m1850H().userId(), "");
        this.f19131z5 = new tpd0("ai_pic_dlg_count" + CoreModule.m1850H().userId(), 0);
        this.f18758B5 = new tpd0("verification_spam_count" + CoreModule.m1850H().userId(), 0);
        this.f18751A5 = new zpd0("verification_visit_time" + CoreModule.m1850H().userId(), 0L);
        this.f18765C5 = new zpd0("team_group_conv_click_time" + CoreModule.m1850H().userId(), 0L);
        this.f18772D5 = new zpd0("weakened_tips_last_show_time" + CoreModule.m1850H().userId(), 0L);
        this.f18779E5 = new tpd0("weakened_tips_close_count" + CoreModule.m1850H().userId(), 0);
        this.f18786F5 = new zpd0("weakened_tips_force_hide_time" + CoreModule.m1850H().userId(), 0L);
        this.f18806I5 = new uqd0("cannot_reply_immediately_data" + CoreModule.m1850H().userId(), "");
        this.f18813J5 = new uqd0("cannot_reply_immediately_count" + CoreModule.m1850H().userId(), "");
        this.f18820K5 = new uqd0("del_cannot_reply_immediately_count" + CoreModule.m1850H().userId(), "");
        this.f18848O5 = new tpd0("continuous_left_sliding_bubble_count" + CoreModule.m1850H().userId(), 0);
        this.f18855P5 = new zpd0("continuous_left_sliding_bubble_time" + CoreModule.m1850H().userId(), 0L);
        this.f18827L5 = new hpd0("is_high_speed_sliding_left_tips" + CoreModule.m1850H().userId(), bool2);
        this.f18834M5 = new hpd0("is_high_speed_sliding_right_tips" + CoreModule.m1850H().userId(), bool2);
        this.f18841N5 = new hpd0("is_reset_guidance" + CoreModule.m1850H().userId(), bool2);
        this.f18863Q5 = new zpd0("oof_enter_update_time" + CoreModule.m1850H().userId(), 0L);
        this.f18871R5 = new zpd0("show_interval_card_swipe" + CoreModule.m1850H().userId(), -1L);
        this.f18879S5 = new tpd0("fitnes_can_display_the_number_of_times" + CoreModule.m1850H().userId(), 0);
        this.f18887T5 = new tpd0("drink_can_display_the_number_of_times" + CoreModule.m1850H().userId(), 0);
        this.f18895U5 = new tpd0("smoke_can_display_the_number_of_times" + CoreModule.m1850H().userId(), 0);
        this.f18903V5 = new tpd0("game_can_display_the_number_of_times" + CoreModule.m1850H().userId(), 0);
        this.f18911W5 = new zpd0("today_can_display_times" + CoreModule.m1850H().userId(), 0L);
        this.f18919X5 = new tpd0("today_can_display_count" + CoreModule.m1850H().userId(), 0);
        this.f18927Y5 = new uqd0("today_can_display_pre_user_id" + CoreModule.m1850H().userId(), "");
        this.f18967d6 = new uqd0("today_can_display_pre_user_id_fitness" + CoreModule.m1850H().userId(), "");
        this.f18975e6 = new uqd0("today_can_display_pre_user_id_drink" + CoreModule.m1850H().userId(), "");
        this.f18983f6 = new uqd0("today_can_display_pre_user_id_smoke" + CoreModule.m1850H().userId(), "");
        this.f18991g6 = new uqd0("today_can_display_pre_user_id_game" + CoreModule.m1850H().userId(), "");
        this.f19031l6 = new uqd0("intl_currency_type" + CoreModule.m1850H().userId(), "");
        this.f19083s6 = new uqd0("verifiy_swipe_privilege_show_time_" + CoreModule.m1850H().userId(), "");
        qib0.f19777D0 = (String) this.f19031l6.get();
        this.f19062p6 = new zpd0("show_expand_search_time" + CoreModule.m1850H().userId(), 0L);
        this.f19069q6 = new zpd0("show_boost_refactoring_redrot_time" + CoreModule.m1850H().userId(), 0L);
        this.f19076r6 = new hpd0("show_boost_refactoring_redrot" + CoreModule.m1850H().userId(), bool2);
        this.f19111w6 = new hpd0("see_myself_close_enable" + CoreModule.m1850H().userId(), bool2);
        this.f19118x6 = new zpd0("see_myself_first_show_Time" + CoreModule.m1850H().userId(), 0L);
        this.f19125y6 = new hpd0("followTipsSavedValue" + CoreModule.m1850H().userId(), bool2);
        this.f19132z6 = new hpd0("isHavePartner" + CoreModule.m1850H().userId(), bool2);
        this.f18759B6 = new hpd0("exp_debug_new_ui", bool2);
        this.f18752A6 = new hpd0("bubble_odiamond_immediate_match_guide_" + CoreModule.m1850H().userId(), bool2);
        this.f19026l1 = new zpd0("last_show_online_chat_guide_time" + CoreModule.m1850H().userId(), 0L);
        this.f18787F6 = new tpd0("staging_card_user_activity_day", 2);
        this.f18773D6 = new hpd0("has_show_edit_shimmer" + CoreModule.m1850H().userId(), bool2);
        this.f18780E6 = new uqd0("has_show_avatar_shimmer" + CoreModule.m1850H().userId(), "");
        this.f18807I6 = new zpd0("intl_message_read_receipt_tip_last_show_time" + CoreModule.m1850H().userId(), 0L);
        this.f18821K6 = new hpd0("intl_buzz_has_pull" + CoreModule.m1850H().userId(), bool2);
        this.f18814J6 = new hpd0("intl_delete_prompt_message" + CoreModule.m1850H().userId(), bool2);
        this.f18828L6 = new hpd0("intl_edit_friend_purpose" + CoreModule.m1850H().userId(), bool2);
        this.f18835M6 = new hpd0("intl_tribe_guide_showed" + CoreModule.m1850H().userId(), bool2);
        this.f18842N6 = new zpd0("intl_tribe_recall_guide_pop_show_time" + CoreModule.m1850H().userId(), 0L);
        this.f18935Z5 = new tpd0("intl_sl_guide_show_count_men_" + CoreModule.m1850H().userId(), 0);
        this.f18943a6 = new tpd0("intl_sl_guide_show_count_women_" + CoreModule.m1850H().userId(), 0);
        this.f18951b6 = new zpd0("intl_sl_guide_last_show_date_men_" + CoreModule.m1850H().userId(), 0L);
        this.f18959c6 = new zpd0("intl_sl_guide_last_show_date_women_" + CoreModule.m1850H().userId(), 0L);
        this.f18849O6 = new zpd0("last_whisper_viewed_time" + CoreModule.m1850H().userId(), 0L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: E5 */
    public static /* synthetic */ void m21141E5(Throwable th) {
        if (th instanceof TantanException.Client.TantanForbidden) {
            TantanException.Client.TantanForbidden tantanForbidden = (TantanException.Client.TantanForbidden) th;
            if (tantanForbidden.isCannotModify()) {
                String str = tantanForbidden.message;
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                Application application = CoreModule.f1533b;
                application.startActivity(DialogAct.O0(application, 1, str));
            }
        }
    }

    /* JADX INFO: renamed from: F5 */
    public static /* synthetic */ void m21145F5(String str, Picture picture) {
        String str2 = ((Media) picture).url;
        int i = picture.size.width;
        o6j0.m("e_hyper_profile_pic_double_check", "p_edit_profile_view", new o6j0.a[]{o6j0.a.h("pic_trace_id", str), o6j0.a.h("pic_trace_type", "original"), o6j0.a.h("pic_trace_url", ((Media) picture).url), o6j0.a.h("pic_trace_resolution", picture.size.width + "x" + picture.size.height)});
    }

    /* JADX INFO: renamed from: F6 */
    public static /* synthetic */ Boolean m21146F6(List list) {
        Picture picture = (Picture) list.get(0);
        if (NullChecker.a(picture)) {
            File file = new File(rhi.z(((Media) picture).url));
            if (file.exists()) {
                return Boolean.valueOf(file.length() < 8388608);
            }
        }
        return Boolean.FALSE;
    }

    /* JADX INFO: renamed from: H6 */
    public static /* synthetic */ GPMemo m21154H6(String str, Map map) {
        return (GPMemo) map.get(str);
    }

    /* JADX INFO: renamed from: J4 */
    public static /* synthetic */ stc0 m21160J4(String str, boolean z, boolean z2) {
        String str2;
        stc0.a aVarQ = C0154a.f3483P.auth().q(C0154a.m3130G("/my-tab-task/report"));
        hyx hyxVar = Network.JSON;
        StringBuilder sb = new StringBuilder("{    \"task\": \"");
        sb.append(str);
        sb.append("\", \"type\": \"");
        if (z) {
            str2 = "enter";
        } else {
            str2 = z2 ? "click" : "exposure";
        }
        sb.append(str2);
        sb.append("\"}");
        return aVarQ.l(utc0.create(hyxVar, sb.toString())).b();
    }

    /* JADX INFO: renamed from: J5 */
    public static /* synthetic */ stc0 m21161J5(String str, String str2) {
        String string;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("userPopType", str);
            string = jSONObject.toString();
        } catch (JSONException unused) {
            string = "";
        }
        return C0154a.f3483P.auth().q(C0154a.m3130G(str2)).l(utc0.create(Network.JSON, string)).b();
    }

    /* JADX INFO: renamed from: L5 */
    public static /* synthetic */ stc0 m21169L5(String str, boolean z, boolean z2, String str2) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("source", "card");
            jSONObject.put("picUniqueIdentify", str);
            jSONObject.put("isClick", z);
            jSONObject.put("clickType", z2 ? "real" : "unsure");
        } catch (JSONException unused) {
        }
        return C0154a.f3483P.auth().q(C0154a.m3130G(str2)).l(utc0.create(Network.JSON, jSONObject.toString())).b();
    }

    /* JADX INFO: renamed from: M5 */
    public static /* synthetic */ void m21173M5(Unit unit) {
    }

    /* JADX INFO: renamed from: O3 */
    public static /* synthetic */ void m21179O3(SettingGroups settingGroups) {
        TribeSetting tribeSetting;
        if (settingGroups == null || (tribeSetting = settingGroups.tttribe) == null || !TextUtils.isEmpty(tribeSetting.transLang)) {
            return;
        }
        CoreModule.f1534c.f3673t0.m1961r3(rb20.m22791f()).subscribe(mkd0.H(new e30() { // from class: l.rdb
            public final void call(Object obj) {
                pib.m21173M5((Unit) obj);
            }
        }, new e30() { // from class: l.sdb
            public final void call(Object obj) {
                pib.m21320x5((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: P3 */
    public static /* synthetic */ AppealPostData m21183P3(AppealPostData appealPostData, List list) {
        AppealPostData appealPostDataClone = appealPostData.clone();
        appealPostDataClone.material.pictures = vwb.Q(list, new w9j() { // from class: l.teb
            public final Object call(Object obj) {
                return ((Media) obj).url;
            }
        });
        return appealPostDataClone;
    }

    /* JADX INFO: renamed from: P6 */
    public static /* synthetic */ stc0 m21186P6(String str) {
        String str2;
        if (TextUtils.equals(str, "card") || TextUtils.equals(str, "chat")) {
            str2 = "/iceBreakQuestions?search=all&limit=3&source=" + str;
        } else if (TextUtils.equals(str, "match")) {
            str2 = "/iceBreakQuestions?search=all&limit=1&source=" + str;
        } else {
            str2 = "/iceBreakQuestions?search=all";
        }
        return C0154a.f3483P.auth().q(C0154a.m3143J0(str2)).f().b();
    }

    /* JADX INFO: renamed from: S9 */
    public static c<Envelope> m21198S9(final String str, final boolean z, final boolean z2) {
        return new la20(new v9j() { // from class: l.chb
            public final Object call() {
                return pib.m21224a3(z, str, z2);
            }
        });
    }

    /* JADX INFO: renamed from: T9 */
    public static c<Envelope> m21202T9(final String str) {
        return new la20(new v9j() { // from class: l.qcb
            public final Object call() {
                return C0154a.f3483P.auth().q(C0154a.m3125E2(str)).f().b();
            }
        });
    }

    /* JADX INFO: renamed from: U9 */
    public static c<Envelope> m21206U9(final String str) {
        return new la20(new v9j() { // from class: l.bdb
            public final Object call() {
                return C0154a.f3483P.auth().q(C0154a.m3133G2(str)).f().b();
            }
        });
    }

    /* JADX INFO: renamed from: V7 */
    public static boolean m21210V7() {
        VerificationCenter verificationCenterM3542k4 = CoreModule.f1534c.f3541B0.m3542k4();
        return (NullChecker.a(verificationCenterM3542k4) && NullChecker.a(verificationCenterM3542k4.picVerificationInfo) && TEnum.equals(verificationCenterM3542k4.picVerificationInfo.status, "verified")) ? false : true;
    }

    /* JADX INFO: renamed from: a3 */
    public static /* synthetic */ stc0 m21224a3(boolean z, String str, boolean z2) {
        String strM3129F2 = z ? C0154a.m3129F2(str) : C0154a.m3292v2(str);
        if (z2) {
            strM3129F2 = strM3129F2 + "&source=viewer";
        }
        return C0154a.f3483P.auth().q(strM3129F2).f().b();
    }

    /* JADX INFO: renamed from: a5 */
    public static /* synthetic */ void m21226a5(Throwable th) {
    }

    /* JADX INFO: renamed from: d6 */
    public static /* synthetic */ stc0 m21239d6(List list) {
        JSONArray jSONArray = new JSONArray((Collection) list);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("addQuestions", jSONArray);
        } catch (JSONException unused) {
        }
        return C0154a.f3483P.auth().q(C0154a.m3143J0("/iceBreakQuestions")).m(utc0.create(Network.JSON, jSONObject.toString())).b();
    }

    /* JADX INFO: renamed from: d7 */
    public static c<Envelope> m21240d7(final String str) {
        return new la20(new v9j() { // from class: l.wcb
            public final Object call() {
                return C0154a.f3483P.auth().q(C0154a.m3133G2(str)).f().b();
            }
        });
    }

    /* JADX INFO: renamed from: e6 */
    public static /* synthetic */ void m21244e6(String str, long j) {
        User userQuery = qib0.f19813k0.f23551d.query(str);
        if (userQuery == null) {
            return;
        }
        userQuery.localLatestReceivedMessageTime = j;
        qib0.f19813k0.f23551d.upsert(userQuery);
    }

    /* JADX INFO: renamed from: e7 */
    public static c<Envelope> m21245e7(final String str) {
        return new la20(new v9j() { // from class: l.aib
            public final Object call() {
                return C0154a.f3483P.auth().q(C0154a.m3117C2(str)).f().b();
            }
        });
    }

    /* JADX INFO: renamed from: g6 */
    public static /* synthetic */ c m21253g6() {
        final JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("complete", "unknown");
        } catch (JSONException unused) {
        }
        return ia20.m16567a(new v9j() { // from class: l.jdb
            public final Object call() {
                return C0154a.f3483P.auth().q(C0154a.m3143J0("/marriage-info ")).m(utc0.create(Network.JSON, jSONObject.toString())).b();
            }
        }).map(new w9j() { // from class: l.udb
            public final Object call(Object obj) {
                return roj0.a;
            }
        });
    }

    /* JADX INFO: renamed from: i3 */
    public static /* synthetic */ void m21258i3(Throwable th) {
    }

    /* JADX INFO: renamed from: l4 */
    public static /* synthetic */ c m21271l4(String str, String str2) {
        String str3;
        StringBuilder sb = new StringBuilder("/icebreakings/");
        sb.append(str);
        sb.append("?timestamp=");
        sb.append(System.currentTimeMillis() / 1000);
        if (TextUtils.isEmpty(str2)) {
            str3 = "";
        } else {
            str3 = "&source=" + str2;
        }
        sb.append(str3);
        final String string = sb.toString();
        return ia20.m16571e(new v9j() { // from class: l.xcb
            public final Object call() {
                return C0154a.f3483P.auth().q(C0154a.m3143J0(string)).f().b();
            }
        }).compose(mkd0.C());
    }

    /* JADX INFO: renamed from: q3 */
    public static /* synthetic */ AppealPostData m21290q3(List list, AppealPostData appealPostData) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Picture picture = (Media) it.next();
            if (TEnum.equals(((Media) picture).status, "raw") && (picture instanceof Picture)) {
                Picture picture2 = picture;
                if (picture2.size == null || ((Media) picture2).mediaType == null) {
                    pgm pgmVar = new pgm(rhi.z(((Media) picture2).url));
                    picture2.size = new Dimension(pgmVar.d);
                    ((Media) picture2).mediaType = pgmVar.c;
                }
            }
        }
        return appealPostData;
    }

    /* JADX INFO: renamed from: q4 */
    public static /* synthetic */ int m21291q4(List list, String str, String str2) {
        return !list.contains(str) ? -1 : 0;
    }

    /* JADX INFO: renamed from: r5 */
    public static /* synthetic */ c m21296r5(w9j w9jVar, List list, AppealPostData appealPostData) {
        return (c) w9jVar.call(list);
    }

    /* JADX INFO: renamed from: r6 */
    public static /* synthetic */ c m21297r6(String str, final String str2) {
        final String str3 = "/icebreakings/" + str;
        return ia20.m16571e(new v9j() { // from class: l.vdb
            public final Object call() {
                return C0154a.f3483P.auth().q(C0154a.m3143J0(str3)).l(utc0.create(Network.JSON, "{\"tipId\":\"" + str2 + "\"}")).b();
            }
        }).compose(mkd0.C());
    }

    /* JADX INFO: renamed from: u6 */
    public static /* synthetic */ GPMemo m21309u6(String str, GPMemo gPMemo) {
        if (gPMemo != null) {
            return gPMemo;
        }
        GPMemo gPMemoNew_ = GPMemo.new_();
        gPMemoNew_.otherUserId = str;
        gPMemoNew_.userId = str;
        gPMemoNew_.memo = "";
        return gPMemoNew_;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: v6 */
    public static /* synthetic */ void m21313v6(Throwable th) {
        boolean z = th instanceof TantanException.Client.TantanForbidden;
        if (z) {
            TantanException.Client.TantanForbidden tantanForbidden = (TantanException.Client.TantanForbidden) th;
            if (tantanForbidden.isCannotModify()) {
                String str = tantanForbidden.message;
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                Application application = CoreModule.f1533b;
                application.startActivity(DialogAct.O0(application, 1, str));
                return;
            }
        }
        if (z) {
            TantanException.Client.TantanForbidden tantanForbidden2 = (TantanException.Client.TantanForbidden) th;
            if (tantanForbidden2.isCannotModifyExceedLimt()) {
                tantanForbidden2.hasHandle = true;
                osi0.g(CoreModule.f1533b.getString(R.string.N));
                return;
            }
        }
        if (z) {
            TantanException.Client.TantanForbidden tantanForbidden3 = (TantanException.Client.TantanForbidden) th;
            if (tantanForbidden3.code == 40399) {
                osi0.g(tantanForbidden3.message);
            }
        }
    }

    /* JADX INFO: renamed from: x5 */
    public static /* synthetic */ void m21320x5(Throwable th) {
    }

    /* JADX INFO: renamed from: y5 */
    public static /* synthetic */ List m21324y5(Envelope envelope) {
        List<UrlTag> list = envelope.getModuleData(CoreData.class).urlTags;
        if (!vwb.J(list)) {
            ura.m25555e().m25559d().m5603Cf(list);
        }
        return list;
    }

    /* JADX INFO: renamed from: z6 */
    public static /* synthetic */ void m21329z6(String str, User user) {
        if (user == null) {
            CoreModule.f1534c.f3637h0.m25599l3(str);
        }
    }

    /* JADX INFO: renamed from: A7 */
    public c<roj0> m21330A7() {
        return this.f18857Q.scheduled("getMyTabTasks", 0, new v9j() { // from class: l.agb
            public final Object call() {
                return this.f8255a.m21509u8();
            }
        });
    }

    /* JADX INFO: renamed from: A8 */
    public final /* synthetic */ SettingGroups m21331A8(Envelope envelope) {
        m21417W9(qib0.f19804b0.f17706a.userId());
        if (vwb.J(envelope.getModuleData(CoreData.class).settingGroups)) {
            return m21490p9().settings.getSettingGroup();
        }
        this.f18865R.put((SettingGroups) envelope.getModuleData(CoreData.class).settingGroups.get(0));
        return (SettingGroups) envelope.getModuleData(CoreData.class).settingGroups.get(0);
    }

    /* JADX INFO: renamed from: A9 */
    public c<SettingGroups> m21332A9(UserPushSettings userPushSettings) {
        SettingGroups settingGroups = new SettingGroups();
        settingGroups.push = userPushSettings;
        final UserSettingPatch userSettingPatch = new UserSettingPatch();
        userSettingPatch.settingGroups = settingGroups;
        userSettingPatch.type = CameraSticker.CATEGORY_DEFAULT_FILTER;
        return m21394Q7(new v9j() { // from class: l.wbb
            public final Object call() {
                return C0154a.f3483P.auth().q(C0154a.m3267p1()).l(utc0.create(Network.JSON, userSettingPatch.toJson())).b();
            }
        }, -1, "patch_notification_settings");
    }

    /* JADX INFO: renamed from: Aa */
    public boolean m21333Aa(@Nullable User user) {
        Relationship relationship = user.localRelationship;
        return relationship == null || TEnum.equals(relationship.conversationStatus, "dismissed") || TEnum.equals(user.localRelationship.conversationStatus, "blocked") || TEnum.equals(user.localRelationship.conversationStatus, "peeking_blocked");
    }

    /* JADX INFO: renamed from: B7 */
    public c<roj0> m21334B7() {
        return this.f18857Q.scheduled("getMyTabTasksSceneAvatar", 0, new v9j() { // from class: l.sfb
            public final Object call() {
                return this.f21289a.m21517w8();
            }
        });
    }

    /* JADX INFO: renamed from: B8 */
    public final /* synthetic */ SettingGroups m21335B8(Envelope envelope) {
        m21417W9(qib0.f19804b0.f17706a.userId());
        if (vwb.J(envelope.getModuleData(CoreData.class).settingGroups)) {
            return m21490p9().settings.getSettingGroup();
        }
        this.f18865R.put((SettingGroups) envelope.getModuleData(CoreData.class).settingGroups.get(0));
        return (SettingGroups) envelope.getModuleData(CoreData.class).settingGroups.get(0);
    }

    /* JADX INFO: renamed from: B9 */
    public c<roj0> m21336B9(boolean z) {
        SettingGroups settingGroups = new SettingGroups();
        UserPrivacySettings userPrivacySettings = new UserPrivacySettings();
        settingGroups.privacy = userPrivacySettings;
        userPrivacySettings.verifiedUserMsg = Boolean.valueOf(z);
        Settings settings = CoreModule.m1851K().me_().settings;
        if (settings == null) {
            return c.just(roj0.a);
        }
        return CoreModule.m1851K().patchSettings(settingGroups.subtract(settings.getSettingGroup()));
    }

    /* JADX INFO: renamed from: Ba */
    public void m21337Ba(final String str) {
        e51.y(new Runnable() { // from class: l.vfb
            @Override // java.lang.Runnable
            public final void run() {
                this.f24302a.m21443d9(str);
            }
        });
    }

    /* JADX INFO: renamed from: C7 */
    public c<roj0> m21338C7() {
        return this.f18857Q.scheduled("getMyTabTasksSceneEditInformation", 0, new v9j() { // from class: l.dgb
            public final Object call() {
                return this.f10393a.m21525y8();
            }
        });
    }

    /* JADX INFO: renamed from: C8 */
    public final /* synthetic */ c m21339C8(v9j v9jVar) {
        return new la20((v9j<stc0>) v9jVar, true).compose(mkd0.C()).map(new w9j() { // from class: l.vgb
            public final Object call(Object obj) {
                return this.f24313a.m21335B8((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: C9 */
    public c<SettingGroups> m21340C9(UserSubscriptionSettings userSubscriptionSettings) {
        SettingGroups settingGroups = new SettingGroups();
        settingGroups.subscription = userSubscriptionSettings;
        final UserSettingPatch userSettingPatch = new UserSettingPatch();
        userSettingPatch.settingGroups = settingGroups;
        userSettingPatch.type = CameraSticker.CATEGORY_DEFAULT_FILTER;
        return m21394Q7(new v9j() { // from class: l.rfb
            public final Object call() {
                return C0154a.f3483P.auth().q(C0154a.m3267p1()).l(utc0.create(Network.JSON, userSettingPatch.toJson())).b();
            }
        }, -1, "patch_other_settings");
    }

    /* JADX INFO: renamed from: Ca */
    public void m21341Ca(String str, List<User> list) {
        if (NullChecker.a(this.f19034m1)) {
            List<GPTopicCard> list2 = (List) this.f19034m1.e();
            if (vwb.J(list2)) {
                m21480n7();
                return;
            }
            for (GPTopicCard gPTopicCard : list2) {
                if (TextUtils.equals(gPTopicCard.name, str)) {
                    ArrayList arrayList = new ArrayList();
                    if (!vwb.J(list)) {
                        for (User user : vwb.k0(list, 2)) {
                            if (!vwb.J(user.pictures)) {
                                arrayList.add(user.picture(0));
                            }
                        }
                    }
                    gPTopicCard.pictures = arrayList;
                    break;
                }
            }
            this.f19034m1.onNext(list2);
        }
    }

    /* JADX INFO: renamed from: D7 */
    public c<List<UrlTag>> m21342D7(List<String> list) {
        JSONArray jSONArray = new JSONArray();
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next());
        }
        final JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("urls", jSONArray);
        } catch (JSONException unused) {
        }
        return this.f18857Q.scheduled("get_pic_tags", -1, new v9j() { // from class: l.fcb
            public final Object call() {
                return ia20.m16567a(new v9j() { // from class: l.aeb
                    public final Object call() {
                        return C0154a.f3483P.auth().q(C0154a.m3130G("/dating/users/ideal-picture-tag")).l(utc0.create(Network.JSON, jSONObject.toString())).b();
                    }
                });
            }
        }).map(new w9j() { // from class: l.gcb
            public final Object call(Object obj) {
                return pib.m21324y5((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: D8 */
    public final /* synthetic */ roj0 m21343D8(String str, Envelope envelope) {
        User userM21396Q9 = m21396Q9(str);
        userM21396Q9.profile.api_only_mutualContacts = new PartialIdList();
        userM21396Q9.profile.api_only_mutualContacts.ids = vwb.Q(envelope.getModuleData(CoreData.class).contacts, new w9j() { // from class: l.tdb
            public final Object call(Object obj) {
                return ((DbObject) ((Contact) obj)).id;
            }
        });
        userM21396Q9.profile.api_only_mutualContacts.links = envelope.pagination.links;
        envelope.getModuleData(CommonData.class).users = new ArrayList();
        envelope.getModuleData(CommonData.class).users.add(userM21396Q9);
        this.f18857Q.m3422w3(envelope, null);
        return roj0.a;
    }

    /* JADX INFO: renamed from: D9 */
    public c<roj0> m21344D9(SettingGroups settingGroups) {
        final UserSettingPatch userSettingPatch = new UserSettingPatch();
        userSettingPatch.type = CameraSticker.CATEGORY_DEFAULT_FILTER;
        userSettingPatch.settingGroups = settingGroups;
        return this.f18857Q.scheduled("patch_settings", -1, new v9j() { // from class: l.ugb
            public final Object call() {
                return this.f23530a.m21371K8(userSettingPatch);
            }
        });
    }

    /* JADX INFO: renamed from: Da */
    public c<Boolean> m21345Da(List<IdealTag> list) {
        if (vwb.J(list)) {
            return c.just(Boolean.FALSE);
        }
        User userM21490p9 = CoreModule.f1534c.f3628e0.m21490p9();
        final boolean zHasIdealInfo = userM21490p9.hasIdealInfo();
        User userClone = userM21490p9.clone();
        Profile profile = userClone.profile;
        if (profile.extensions == null) {
            profile.extensions = new Extensions();
        }
        Extensions extensions = userClone.profile.extensions;
        if (extensions.basic == null) {
            extensions.basic = new ProfileExtensionBasic();
        }
        ArrayList arrayList = new ArrayList();
        Iterator<IdealTag> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().id);
        }
        List arrayList2 = userClone.profile.extensions.basic.idealType;
        if (arrayList2 == null) {
            arrayList2 = new ArrayList();
        }
        List listH0 = vwb.h0(arrayList, arrayList2);
        if (vwb.J(listH0)) {
            return c.just(Boolean.FALSE);
        }
        if (arrayList2.size() > 0) {
            listH0.addAll(arrayList2);
        }
        userClone.profile.extensions.basic.idealType = listH0;
        User userSubtract = userClone.subtract(userM21490p9);
        return userSubtract == null ? c.just(Boolean.FALSE) : m21510u9(userSubtract).map(new w9j() { // from class: l.nib
            public final Object call(Object obj) {
                return Boolean.valueOf(!zHasIdealInfo);
            }
        }).doOnNext(new e30() { // from class: l.wab
            public final void call(Object obj) {
                CoreModule.f1534c.f3628e0.m21417W9(CoreModule.m1850H().userId());
            }
        });
    }

    /* JADX INFO: renamed from: E7 */
    public c<RealFeelInfo> m21346E7(String str) {
        final String str2 = "/business/real/feel/" + str;
        return this.f18857Q.scheduled("getRealFeelInfo" + str, 0, new v9j() { // from class: l.xab
            public final Object call() {
                return ia20.m16571e(new v9j() { // from class: l.ucb
                    public final Object call() {
                        return C0154a.f3483P.auth().q(C0154a.m3130G(str)).f().b();
                    }
                }).map(new w9j() { // from class: l.vcb
                    public final Object call(Object obj) {
                        return ((Envelope) obj).getModuleData(CoreData.class).realFeelInfo;
                    }
                });
            }
        }).compose(mkd0.C());
    }

    /* JADX INFO: renamed from: E8 */
    public final /* synthetic */ c m21347E8(final String str, final String str2) {
        return new la20(new v9j() { // from class: l.ocb
            public final Object call() {
                return C0154a.f3483P.auth().q(C0154a.m3176S0(str, str2)).f().b();
            }
        }).map(new w9j() { // from class: l.pcb
            public final Object call(Object obj) {
                return this.f18680a.m21343D8(str, (Envelope) obj);
            }
        }).compose(C0154a.m3182T2());
    }

    /* JADX INFO: renamed from: E9 */
    public c<roj0> m21348E9(User user) {
        return m21514v9(user, ura.m25555e().m25559d().m5655Ln() ? "updateInterval" : null);
    }

    /* JADX INFO: renamed from: Ea */
    public void m21349Ea(final String str, final long j) {
        e51.y(new Runnable() { // from class: l.hib
            @Override // java.lang.Runnable
            public final void run() {
                this.f13898a.m21446e9(str, j);
            }
        });
    }

    /* JADX INFO: renamed from: F7 */
    public c<roj0> m21350F7() {
        return this.f18857Q.scheduled("getRealPictureAward", -1, new v9j() { // from class: l.seb
            public final Object call() {
                return ia20.m16567a(new v9j() { // from class: l.zeb
                    public final Object call() {
                        return C0154a.f3483P.auth().q(C0154a.m3130G("/real_pictures/privilege")).l(utc0.create(Network.JSON, "")).b();
                    }
                }).map(new w9j() { // from class: l.afb
                    public final Object call(Object obj) {
                        return roj0.a;
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: F8 */
    public final /* synthetic */ roj0 m21351F8(Envelope envelope) {
        this.f18857Q.m3424y3(envelope, null, false, false, true);
        return roj0.a;
    }

    /* JADX INFO: renamed from: F9 */
    public c<SettingGroups> m21352F9(double d, double d2) {
        final JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("latitude", d);
            jSONObject2.put("longitude", d2);
            jSONObject.put("momentRoamingLocation", jSONObject2);
        } catch (JSONException e) {
            CrashHelper.c(e);
        }
        return m21394Q7(new v9j() { // from class: l.xgb
            public final Object call() {
                return C0154a.f3483P.auth().q(C0154a.m3271q1()).l(utc0.create(Network.JSON, jSONObject.toString())).b();
            }
        }, -1, "patch_vip_search_settings");
    }

    /* JADX INFO: renamed from: Fa */
    public void m21353Fa(String str, String str2) {
        Map<String, GPMemo> mapM21386O7 = m21386O7();
        if (mapM21386O7 == null) {
            mapM21386O7 = new HashMap<>();
        }
        GPMemo gPMemo = mapM21386O7.get(str);
        if (gPMemo == null) {
            GPMemo gPMemoNew_ = GPMemo.new_();
            gPMemoNew_.userId = str;
            gPMemoNew_.otherUserId = str;
            gPMemoNew_.memo = str2;
            mapM21386O7.put(str, gPMemoNew_);
        } else {
            gPMemo.memo = str2;
        }
        this.f18992g7.A(mapM21386O7);
    }

    /* JADX INFO: renamed from: G7 */
    public c<RealPicturesInfo> m21354G7() {
        return this.f18857Q.scheduled("getRealPictureTaskInfo", 0, new v9j() { // from class: l.ohb
            public final Object call() {
                return ia20.m16567a(new v9j() { // from class: l.lbb
                    public final Object call() {
                        return C0154a.f3483P.auth().q(C0154a.m3130G("/real_pictures/info")).f().b();
                    }
                }).map(new w9j() { // from class: l.mbb
                    public final Object call(Object obj) {
                        return ((Envelope) obj).getModuleData(CoreData.class).realPicturesInfo;
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: G8 */
    public final /* synthetic */ c m21355G8(String str) {
        return m21206U9(str).map(new w9j() { // from class: l.zhb
            public final Object call(Object obj) {
                return this.f28759a.m21351F8((Envelope) obj);
            }
        }).compose(C0154a.m3182T2());
    }

    /* JADX INFO: renamed from: G9 */
    public c<Envelope> m21356G9(@NonNull String str, final int i, String str2) {
        String string;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("url", str);
            jSONObject.put("scene", str2);
            string = jSONObject.toString();
        } catch (JSONException unused) {
            string = "";
        }
        final utc0 utc0VarCreate = utc0.create(Network.JSON, string);
        return this.f18857Q.scheduled("photoModelChecking" + mqi0.o(), -1, new v9j() { // from class: l.ndb
            public final Object call() {
                return ia20.m16571e(new v9j() { // from class: l.heb
                    public final Object call() {
                        return C0154a.f3483P.auth().q(C0154a.m3130G("/user/picture/" + i + "/sift")).l(utc0Var).b();
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: Ga */
    public c<roj0> m21357Ga(final String str, final String str2) {
        String string;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("memo", str2);
            string = jSONObject.toString();
        } catch (JSONException e) {
            CrashHelper.c(e);
            string = "";
        }
        final utc0 utc0VarCreate = utc0.create(Network.JSON, string);
        return now("updateMemos_patch/" + str, ia20.m16567a(new v9j() { // from class: l.uhb
            public final Object call() {
                return C0154a.f3483P.auth().q(C0154a.m3121D2(CoreModule.m1850H().userId() + "/memos/" + str)).m(utc0VarCreate).b();
            }
        }).map(new w9j() { // from class: l.vhb
            public final Object call(Object obj) {
                return roj0.a;
            }
        }).doOnNext(new e30() { // from class: l.whb
            public final void call(Object obj) {
                this.f25155a.m21450f9(str, str2, (roj0) obj);
            }
        }), true);
    }

    /* JADX INFO: renamed from: H7 */
    public void m21358H7() {
        if (ura.m25555e().m25559d().m5875vi()) {
            this.f18857Q.scheduled("/users/me/profile/avatar", 0, new v9j() { // from class: l.bib
                public final Object call() {
                    return ia20.m16571e(new v9j() { // from class: l.hcb
                        public final Object call() {
                            return C0154a.f3483P.auth().q(C0154a.m3143J0("/profile/avatar")).f().b();
                        }
                    });
                }
            }).subscribe(new e30() { // from class: l.cib
                public final void call(Object obj) {
                    this.f9671a.m21529z8((Envelope) obj);
                }
            }, new e30() { // from class: l.eib
                public final void call(Object obj) {
                    pib.m21258i3((Throwable) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: H8 */
    public final /* synthetic */ roj0 m21359H8(Envelope envelope) {
        this.f18857Q.m3424y3(envelope, null, false, false, true);
        w85.INSTANCE.k((String) null);
        return roj0.a;
    }

    /* JADX INFO: renamed from: H9 */
    public c<roj0> m21360H9() {
        return this.f18857Q.now(new la20(new v9j() { // from class: l.ccb
            public final Object call() {
                return C0154a.f3483P.auth().q(C0154a.m3304y2(CoreModule.m1850H().userId())).f().b();
            }
        }).map(new w9j() { // from class: l.ncb
            public final Object call(Object obj) {
                return this.f17591a.m21375L8((Envelope) obj);
            }
        }).compose(C0154a.m3182T2()));
    }

    /* JADX INFO: renamed from: Ha */
    public c<roj0> m21361Ha(boolean z) {
        UserLiveSettings userLiveSettingsNew_ = UserLiveSettings.new_();
        userLiveSettingsNew_.hideDiamondTag = Boolean.valueOf(z);
        SettingGroups settingGroupsNew_ = SettingGroups.new_();
        settingGroupsNew_.live = userLiveSettingsNew_;
        final UserSettingPatch userSettingPatchNew_ = UserSettingPatch.new_();
        userSettingPatchNew_.settingGroups = settingGroupsNew_;
        userSettingPatchNew_.type = CameraSticker.CATEGORY_DEFAULT_FILTER;
        return this.f18857Q.now(new la20(new v9j() { // from class: l.pdb
            public final Object call() {
                return C0154a.f3483P.auth().q(C0154a.m3216c2()).k(utc0.create(Network.JSON, userSettingPatchNew_.toJson())).b();
            }
        }).map(new w9j() { // from class: l.qdb
            public final Object call(Object obj) {
                return roj0.a;
            }
        }).compose(C0154a.m3182T2()));
    }

    /* JADX INFO: renamed from: I7 */
    public Integer m21362I7() {
        return (Integer) this.f18881T.get();
    }

    /* JADX INFO: renamed from: I8 */
    public final /* synthetic */ c m21363I8(String str, String str2) {
        return m21413V9(str, str2).map(new w9j() { // from class: l.ogb
            public final Object call(Object obj) {
                return this.f18230a.m21359H8((Envelope) obj);
            }
        }).compose(C0154a.m3182T2());
    }

    /* JADX INFO: renamed from: I9 */
    public c<Envelope> m21364I9(final String str, final String str2) {
        return this.f18857Q.scheduled("icebreakings/userId" + str + "/tipId" + str2, 0, new v9j() { // from class: l.rcb
            public final Object call() {
                return pib.m21297r6(str, str2);
            }
        });
    }

    /* JADX INFO: renamed from: Ia */
    public c<roj0> m21365Ia() {
        return this.f18857Q.scheduled("uploadMarryEditProfileUnSave", -1, new v9j() { // from class: l.vab
            public final Object call() {
                return pib.m21253g6();
            }
        });
    }

    /* JADX INFO: renamed from: J7 */
    public c<SettingGroups> m21366J7() {
        return m21394Q7(new v9j() { // from class: l.gbb
            public final Object call() {
                return C0154a.f3483P.auth().q(C0154a.m3216c2() + "?type=default").f().b();
            }
        }, 0, "get_other_settings");
    }

    /* JADX INFO: renamed from: J8 */
    public final /* synthetic */ roj0 m21367J8(Envelope envelope) {
        m21417W9(qib0.f19804b0.f17706a.userId());
        if (!vwb.J(envelope.getModuleData(CoreData.class).settingGroups)) {
            this.f18865R.put((SettingGroups) envelope.getModuleData(CoreData.class).settingGroups.get(0));
        }
        return roj0.a;
    }

    /* JADX INFO: renamed from: J9 */
    public void m21368J9() {
        this.f18960c7.onNext(roj0.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Ja */
    public void m21369Ja(final String str, final Picture picture) {
        new lsx(vwb.f0(new Media[]{picture}), 10000, 0, Bitmap.CompressFormat.JPEG, true).filter(new w9j() { // from class: l.egb
            public final Object call(Object obj) {
                return pib.m21146F6((List) obj);
            }
        }).flatMap(new w9j() { // from class: l.fgb
            public final Object call(Object obj) {
                return qib0.f19805c0.mo12001Y1(picture);
            }
        }).compose(mkd0.C()).subscribe(mkd0.H(new e30() { // from class: l.ggb
            public final void call(Object obj) {
                pib.m21145F5(str, (Picture) obj);
            }
        }, new e30() { // from class: l.hgb
            public final void call(Object obj) {
                pib.m21226a5((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: K7 */
    public c<SettingGroups> m21370K7() {
        return now("get_other_settings", new la20((v9j<stc0>) new v9j() { // from class: l.ibb
            public final Object call() {
                return C0154a.f3483P.auth().q(C0154a.m3216c2() + "?type=default").f().b();
            }
        }, true).compose(mkd0.C()).map(new w9j() { // from class: l.jbb
            public final Object call(Object obj) {
                return this.f15101a.m21331A8((Envelope) obj);
            }
        }).doOnNext(new e30() { // from class: l.kbb
            public final void call(Object obj) {
                pib.m21179O3((SettingGroups) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: K8 */
    public final /* synthetic */ c m21371K8(UserSettingPatch userSettingPatch) {
        return m21400R9(userSettingPatch.toJson()).map(new w9j() { // from class: l.fib
            public final Object call(Object obj) {
                return this.f12734a.m21367J8((Envelope) obj);
            }
        }).compose(C0154a.m3182T2());
    }

    /* JADX INFO: renamed from: K9 */
    public c<SettingGroups> m21372K9(String str, boolean z, int i, int i2) {
        SettingGroups settingGroups = new SettingGroups();
        UserPushSettings userPushSettings = new UserPushSettings();
        if (TextUtils.equals("livePush", str)) {
            userPushSettings.livePush = Boolean.valueOf(z);
        } else if (TextUtils.equals("momentPush", str)) {
            userPushSettings.momentPush = Boolean.valueOf(z);
        } else if (TextUtils.equals("msgPush", str)) {
            userPushSettings.msgPush = Boolean.valueOf(z);
        } else if (TextUtils.equals("recommendPush", str)) {
            userPushSettings.recommendPush = Boolean.valueOf(z);
        } else if (TextUtils.equals("voiceLivePush", str)) {
            userPushSettings.voiceLivePush = Boolean.valueOf(z);
        } else if (TextUtils.equals("silentSwitch", str)) {
            userPushSettings.silentSwitch = Boolean.valueOf(z);
        } else if (TextUtils.equals("pushTime", str)) {
            userPushSettings.silentEndTime = Integer.valueOf(i2);
            userPushSettings.silentStartTime = Integer.valueOf(i);
        } else if (TextUtils.equals("allPushEnable", str)) {
            userPushSettings.allPush = Boolean.valueOf(z);
        } else if (TextUtils.equals("openWithFriend", str)) {
            userPushSettings.allPush = Boolean.valueOf(z);
            userPushSettings.msgPush = Boolean.valueOf(z);
            Boolean bool = Boolean.FALSE;
            userPushSettings.livePush = bool;
            userPushSettings.momentPush = bool;
            userPushSettings.recommendPush = bool;
            UserLiveSettings userLiveSettings = new UserLiveSettings();
            settingGroups.live = userLiveSettings;
            userLiveSettings.voiceNotification = AccountMakeupPageAdapter.MakeupItem.NONE;
        } else if (TextUtils.equals("openWithAll", str)) {
            userPushSettings.allPush = Boolean.valueOf(z);
            userPushSettings.msgPush = Boolean.valueOf(z);
            userPushSettings.livePush = Boolean.valueOf(z);
            userPushSettings.momentPush = Boolean.valueOf(z);
            userPushSettings.recommendPush = Boolean.valueOf(z);
            UserLiveSettings userLiveSettings2 = new UserLiveSettings();
            settingGroups.live = userLiveSettings2;
            userLiveSettings2.voiceNotification = "all";
        }
        settingGroups.push = userPushSettings;
        final UserSettingPatch userSettingPatch = new UserSettingPatch();
        userSettingPatch.settingGroups = settingGroups;
        userSettingPatch.type = CameraSticker.CATEGORY_DEFAULT_FILTER;
        return m21394Q7(new v9j() { // from class: l.phb
            public final Object call() {
                return C0154a.f3483P.auth().q(C0154a.m3267p1()).l(utc0.create(Network.JSON, userSettingPatch.toJson())).b();
            }
        }, -1, "user_push_settings");
    }

    /* JADX INFO: renamed from: Ka */
    public c<User> m21373Ka(final String str) {
        return qib0.f19813k0.f23551d.uiGet(str).doOnNext(new e30() { // from class: l.cfb
            public final void call(Object obj) {
                this.f9638a.m21454g9(str, (User) obj);
            }
        }).filter(new w9j() { // from class: l.pfb
            public final Object call(Object obj) {
                return Boolean.valueOf(((User) obj) != null);
            }
        });
    }

    /* JADX INFO: renamed from: L7 */
    public c<List<Relationship>> m21374L7(final String str) {
        return this.f18857Q.scheduled("onlineMatchGetUserById/" + str, 0, new v9j() { // from class: l.tfb
            public final Object call() {
                return pib.m21206U9(str).map(new w9j() { // from class: l.yab
                    public final Object call(Object obj) {
                        return ((Envelope) obj).getModuleData(CoreData.class).relationships;
                    }
                }).compose(C0154a.m3182T2());
            }
        });
    }

    /* JADX INFO: renamed from: L8 */
    public final /* synthetic */ roj0 m21375L8(Envelope envelope) {
        ura.m25555e().m25559d().m5724Y7(envelope, "counter");
        this.f18857Q.m3422w3(envelope, null);
        return roj0.a;
    }

    /* JADX INFO: renamed from: L9 */
    public void m21376L9(String str, List<LiteraturesComments> list) {
        if (vwb.J(list)) {
            this.f18864Q6.put(str, new ArrayList());
            if (TextUtils.equals(str, CoreModule.m1850H().userId())) {
                m21411V6();
                return;
            }
            return;
        }
        List<LiteraturesComments> arrayList = new ArrayList<>();
        for (LiteraturesComments literaturesComments : list) {
            if (!NullChecker.a(literaturesComments) || !NullChecker.a(literaturesComments.localLiteratures) || TextUtils.isEmpty(literaturesComments.localLiteratures.id) || arrayList.contains(literaturesComments)) {
                lsi0.m("localLiteratures 数据异常 请联系开发");
            } else {
                arrayList.add(literaturesComments);
            }
        }
        this.f18864Q6.put(str, arrayList);
        if (TextUtils.equals(str, CoreModule.m1850H().userId())) {
            m21495qa();
        }
    }

    /* JADX INFO: renamed from: La */
    public c<GPMemo> m21377La(final String str) {
        return this.f18992g7.k().filter(new w9j() { // from class: l.mfb
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.a((Map) obj));
            }
        }).map(new w9j() { // from class: l.nfb
            public final Object call(Object obj) {
                return pib.m21154H6(str, (Map) obj);
            }
        }).map(new w9j() { // from class: l.ofb
            public final Object call(Object obj) {
                return pib.m21309u6(str, (GPMemo) obj);
            }
        }).distinctUntilChanged(new w9j() { // from class: l.qfb
            public final Object call(Object obj) {
                return ((GPMemo) obj).memo;
            }
        }).observeOn(jo0.a());
    }

    /* JADX INFO: renamed from: M7 */
    public User m21378M7(String str) {
        return e51.D() ? m21393Pa(str) : m21396Q9(str);
    }

    /* JADX INFO: renamed from: M8 */
    public final /* synthetic */ roj0 m21379M8(String str, Envelope envelope) {
        if (ura.m25555e().m25559d().m5739b()) {
            CoreModule.m1855Q().putLiveState(envelope.getModuleData(CommonData.class).users);
        }
        m21494q9(str, envelope);
        this.f18857Q.m3424y3(envelope, null, false, false, true);
        return roj0.a;
    }

    /* JADX INFO: renamed from: M9 */
    public void m21380M9(String str, Literatures literatures) {
        this.f18872R6.put(str, literatures);
    }

    /* JADX INFO: renamed from: Ma */
    public c<User> m21381Ma(final String str) {
        return qib0.f19813k0.f23551d.uiGet(str).doOnNext(new e30() { // from class: l.zfb
            public final void call(Object obj) {
                pib.m21329z6(str, (User) obj);
            }
        });
    }

    /* JADX INFO: renamed from: N7 */
    public c<Map<String, GPMemo>> m21382N7() {
        return this.f18992g7.k();
    }

    /* JADX INFO: renamed from: N8 */
    public final /* synthetic */ c m21383N8(final String str, boolean z, boolean z2) {
        return m21198S9(str, z, z2).map(new w9j() { // from class: l.kgb
            public final Object call(Object obj) {
                return this.f15813a.m21379M8(str, (Envelope) obj);
            }
        }).compose(C0154a.m3182T2());
    }

    @Nullable
    /* JADX INFO: renamed from: N9 */
    public LiteraturesComments m21384N9(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return null;
        }
        List<LiteraturesComments> listM21452g7 = m21452g7(str);
        if (vwb.J(listM21452g7)) {
            return null;
        }
        for (LiteraturesComments literaturesComments : listM21452g7) {
            if (TextUtils.equals(literaturesComments.literatureID, str2)) {
                return literaturesComments;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: Na */
    public c<roj0> m21385Na(final String str) {
        return this.f18857Q.scheduled("users/" + str + "passby", 0, new v9j() { // from class: l.igb
            public final Object call() {
                return this.f14436a.m21462i9(str);
            }
        });
    }

    /* JADX INFO: renamed from: O7 */
    public Map<String, GPMemo> m21386O7() {
        Map<String, GPMemo> map = (Map) this.f18992g7.n();
        return map == null ? new HashMap() : map;
    }

    /* JADX INFO: renamed from: O8 */
    public final /* synthetic */ roj0 m21387O8(Envelope envelope) {
        if (!vwb.J(envelope.getModuleData(CoreData.class).appealInfos)) {
            this.f18760C0.onNext((AppealInfo) envelope.getModuleData(CoreData.class).appealInfos.get(0));
        }
        return roj0.a;
    }

    @NonNull
    /* JADX INFO: renamed from: O9 */
    public List<LiteraturesComments> m21388O9(String str, String str2) {
        ArrayList arrayList = new ArrayList();
        LiteraturesComments literaturesCommentsM21384N9 = m21384N9(str, str2);
        if (literaturesCommentsM21384N9 != null) {
            arrayList.add(literaturesCommentsM21384N9);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: Oa */
    public c<roj0> m21389Oa(final String str) {
        return this.f18857Q.scheduled("userWithRelationship/" + str, 0, new v9j() { // from class: l.tgb
            public final Object call() {
                return this.f22098a.m21470k9(str);
            }
        });
    }

    /* JADX INFO: renamed from: P8 */
    public final /* synthetic */ c m21391P8() {
        return ia20.m16567a(new v9j() { // from class: l.qgb
            public final Object call() {
                return C0154a.f3483P.auth().q(C0154a.m3296w2("/me/appeal-info")).b();
            }
        }).map(new w9j() { // from class: l.rgb
            public final Object call(Object obj) {
                return this.f20544a.m21387O8((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: P9 */
    public User m21392P9() {
        return qib0.f19813k0.f23551d.query(this.f18754B1);
    }

    /* JADX INFO: renamed from: Pa */
    public User m21393Pa(String str) {
        return qib0.f19813k0.f23551d.queryCache(str);
    }

    /* JADX INFO: renamed from: Q7 */
    public final c<SettingGroups> m21394Q7(final v9j<stc0> v9jVar, int i, String str) {
        return scheduled(str, i, new v9j() { // from class: l.lfb
            public final Object call() {
                return this.f16389a.m21339C8(v9jVar);
            }
        });
    }

    /* JADX INFO: renamed from: Q8 */
    public final /* synthetic */ roj0 m21395Q8(Envelope envelope) {
        if (!vwb.J(envelope.getModuleData(CoreData.class).appealInfos)) {
            this.f18767D0.onNext((AppealInfo) envelope.getModuleData(CoreData.class).appealInfos.get(0));
        }
        return roj0.a;
    }

    /* JADX INFO: renamed from: Q9 */
    public User m21396Q9(String str) {
        return qib0.f19813k0.f23551d.query(str);
    }

    /* JADX INFO: renamed from: Qa */
    public c<Meta> m21397Qa(final String str) {
        return this.f18857Q.now(ia20.m16567a(new v9j() { // from class: l.xbb
            public final Object call() {
                return C0154a.f3483P.auth().q(C0154a.m3205a("/qrcode/verify")).l(utc0.create(Network.JSON, "{\"clientId\":\"100032\",\"value\":\"" + str + "\"}")).b();
            }
        }).map(new w9j() { // from class: l.ybb
            public final Object call(Object obj) {
                return ((Envelope) obj).meta;
            }
        }));
    }

    /* JADX INFO: renamed from: R7 */
    public c<CurrencyTypeData> m21398R7() {
        return this.f18984f7.k();
    }

    /* JADX INFO: renamed from: R8 */
    public final /* synthetic */ c m21399R8() {
        return ia20.m16567a(new v9j() { // from class: l.dfb
            public final Object call() {
                return C0154a.f3483P.auth().q(C0154a.m3296w2("/me/appeal-fake-info")).b();
            }
        }).map(new w9j() { // from class: l.efb
            public final Object call(Object obj) {
                return this.f11124a.m21395Q8((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: R9 */
    public final c<Envelope> m21400R9(final String str) {
        return new la20(new v9j() { // from class: l.qbb
            public final Object call() {
                return C0154a.f3483P.auth().q(C0154a.m3267p1()).l(utc0.create(Network.JSON, str)).b();
            }
        }).doOnError(new e30() { // from class: l.sbb
            public final void call(Object obj) {
                pib.m21141E5((Throwable) obj);
            }
        });
    }

    /* JADX INFO: renamed from: Ra */
    public c<WechatNotifySetting> m21401Ra() {
        return this.f18857Q.scheduled("wechat_setting_status", 0, new v9j() { // from class: l.yfb
            public final Object call() {
                return this.f28193a.m21478m9();
            }
        });
    }

    /* JADX INFO: renamed from: S6 */
    public void m21402S6(@NonNull ChatPartnerScene chatPartnerScene) {
        final String string = Uri.parse(C0154a.m3143J0("/chat-partners")).buildUpon().appendQueryParameter("scene", chatPartnerScene.getValue()).build().toString();
        final utc0 utc0VarCreate = utc0.create(Network.JSON, "");
        this.f18857Q.scheduled("chatPartnersDialogShow" + CoreModule.m1850H().userId(), -1, new v9j() { // from class: l.icb
            public final Object call() {
                return ia20.m16571e(new v9j() { // from class: l.deb
                    public final Object call() {
                        return C0154a.f3483P.auth().q(str).l(utc0Var).b();
                    }
                }).compose(mkd0.C());
            }
        });
    }

    /* JADX INFO: renamed from: S7 */
    public c<roj0> m21403S7() {
        return this.f18857Q.now(ia20.m16567a(new v9j() { // from class: l.wfb
            public final Object call() {
                return C0154a.f3483P.auth().q(C0154a.m3296w2("/me/sales")).l(utc0.create(Network.JSON, "")).b();
            }
        }).map(new w9j() { // from class: l.xfb
            public final Object call(Object obj) {
                return roj0.a;
            }
        }).compose(mkd0.C()));
    }

    /* JADX INFO: renamed from: S8 */
    public final /* synthetic */ roj0 m21404S8(Envelope envelope) {
        LoveLetterEntryInfo loveLetterEntryInfo = envelope.getModuleData(CoreData.class).loveLetter;
        if (loveLetterEntryInfo != null) {
            this.f18891U1.onNext(loveLetterEntryInfo);
        }
        return roj0.a;
    }

    /* JADX INFO: renamed from: T6 */
    public c<String> m21405T6() {
        return this.f18897V.onBackpressureLatest().observeOn(jo0.a());
    }

    /* JADX INFO: renamed from: T7 */
    public boolean m21406T7(String str) {
        return !TextUtils.isEmpty(str) && NullChecker.a(m21384N9(CoreModule.m1850H().userId(), str));
    }

    /* JADX INFO: renamed from: T8 */
    public final /* synthetic */ c m21407T8() {
        return ia20.m16567a(new v9j() { // from class: l.qeb
            public final Object call() {
                return C0154a.f3483P.auth().q(C0154a.m3130G("/love_letter/info")).f().b();
            }
        }).map(new w9j() { // from class: l.bfb
            public final Object call(Object obj) {
                return this.f8865a.m21404S8((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: U6 */
    public void m21408U6() {
        this.f18937a0.put("");
    }

    /* JADX INFO: renamed from: U7 */
    public boolean m21409U7() {
        List<LiteraturesComments> listM21452g7 = m21452g7(CoreModule.m1850H().userId());
        boolean z = true;
        if (!vwb.J(listM21452g7) && listM21452g7.size() >= ((Integer) this.f18857Q.f3671s1.f4071S.get()).intValue()) {
            z = false;
        }
        if (!z) {
            lsi0.y("您添加的作品数量已达上限");
        }
        return z;
    }

    /* JADX INFO: renamed from: U8 */
    public final /* synthetic */ c m21410U8(String str, utc0 utc0Var) {
        return ia20.m16571e(new C1128d(str, utc0Var)).observeOn(jo0.a());
    }

    /* JADX INFO: renamed from: V6 */
    public final void m21411V6() {
        CoreModule.f1534c.f3628e0.f19003i2.put("");
    }

    /* JADX INFO: renamed from: V8 */
    public final /* synthetic */ void m21412V8(Boolean bool) {
        m21417W9(CoreModule.m1850H().userId());
    }

    /* JADX INFO: renamed from: V9 */
    public c<Envelope> m21413V9(final String str, String str2) {
        final String strM3180T0;
        if (TextUtils.isEmpty(str2)) {
            strM3180T0 = C0154a.m3180T0();
        } else {
            strM3180T0 = C0154a.m3180T0() + "&with=" + str2;
        }
        return new la20(new v9j() { // from class: l.ygb
            public final Object call() {
                return C0154a.f3483P.auth().q(strM3180T0).l(utc0.create(Network.JSON, str)).b();
            }
        }).doOnError(new e30() { // from class: l.zgb
            public final void call(Object obj) {
                pib.m21313v6((Throwable) obj);
            }
        });
    }

    /* JADX INFO: renamed from: W6 */
    public c<roj0> m21414W6(String str) {
        String string;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("kind", "exclusive");
            jSONObject.put("content", str);
            string = jSONObject.toString();
        } catch (JSONException e) {
            CrashHelper.c(e);
            string = "";
        }
        final utc0 utc0VarCreate = utc0.create(Network.JSON, string);
        return this.f18857Q.scheduled("icebreakings/post/" + CoreModule.m1850H().userId(), -1, new v9j() { // from class: l.oeb
            public final Object call() {
                return ia20.m16571e(new v9j() { // from class: l.veb
                    public final Object call() {
                        return C0154a.f3483P.auth().q(C0154a.m3143J0("/icebreakings")).l(utc0Var).b();
                    }
                }).map(new w9j() { // from class: l.web
                    public final Object call(Object obj) {
                        return roj0.a;
                    }
                }).compose(mkd0.C());
            }
        });
    }

    /* JADX INFO: renamed from: W7 */
    public boolean m21415W7() {
        User userM21483na = m21483na();
        return NullChecker.a(userM21483na) && !vwb.J(userM21483na.status) && userM21483na.status.contains(UserStatus.get("RISK_TAG_FAKE_GENDER")) && !((Integer) App.i.get()).equals(this.f18857Q.f3628e0.m21362I7());
    }

    /* JADX INFO: renamed from: W8 */
    public final /* synthetic */ FakeGuideData m21416W8(Envelope envelope) {
        FakeGuideData fakeGuideData = envelope.getModuleData(CoreData.class).fakeGuideData;
        this.f18904V6.onNext(fakeGuideData);
        return fakeGuideData;
    }

    /* JADX INFO: renamed from: W9 */
    public c<roj0> m21417W9(String str) {
        return m21421X9(str, false);
    }

    /* JADX INFO: renamed from: X6 */
    public void m21418X6(String str, String str2, ConversationStatus conversationStatus) {
        m21422Y6(str, str2, conversationStatus, MatchFrom.get("unknown_"));
    }

    /* JADX INFO: renamed from: X7 */
    public a<Boolean> m21419X7() {
        if (this.f18922Y0 == null) {
            this.f18922Y0 = a.c(Boolean.valueOf(na30.a() && (((Integer) App.i.get()).intValue() <= 3 || ((Boolean) this.f18857Q.f3628e0.f18914X0.get()).booleanValue())));
        }
        return this.f18922Y0;
    }

    /* JADX INFO: renamed from: X8 */
    public final /* synthetic */ c m21420X8() {
        return ia20.m16567a(new v9j() { // from class: l.ghb
            public final Object call() {
                return C0154a.f3483P.auth().q(C0154a.m3130G("/antispam/guide-change-avatar")).f().b();
            }
        }).map(new w9j() { // from class: l.ihb
            public final Object call(Object obj) {
                return this.f14445a.m21416W8((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: X9 */
    public c<roj0> m21421X9(String str, boolean z) {
        return m21425Y9(str, z, false);
    }

    /* JADX INFO: renamed from: Y6 */
    public void m21422Y6(String str, String str2, ConversationStatus conversationStatus, MatchFrom matchFrom) {
        User userQuery = qib0.f19813k0.f23551d.query(str);
        if (userQuery == null) {
            return;
        }
        if (userQuery.localRelationship == null) {
            Relationship relationshipNew_ = Relationship.new_();
            relationshipNew_.conversationStatus = conversationStatus;
            relationshipNew_.convType = str2;
            userQuery.localRelationship = relationshipNew_;
        } else {
            boolean zM5745c = ura.m25555e().m25559d().m5745c();
            boolean zEquals = "quickchat".equals(str2);
            if (!zM5745c || (!zEquals && !TEnum.equals(conversationStatus, "blocked"))) {
                Relationship relationship = userQuery.localRelationship;
                relationship.conversationStatus = conversationStatus;
                relationship.convType = str2;
            } else if (zEquals) {
                if (!TEnum.equals(userQuery.localRelationship.conversationStatus, "peeking") && !TEnum.equals(userQuery.localRelationship.conversationStatus, "peeking_blocked")) {
                    Relationship relationship2 = userQuery.localRelationship;
                    relationship2.conversationStatus = conversationStatus;
                    relationship2.convType = str2;
                }
            } else if (TEnum.equals(conversationStatus, "blocked")) {
                if (TEnum.equals(userQuery.localRelationship.conversationStatus, "peeking") || TEnum.equals(userQuery.localRelationship.conversationStatus, "peeking_blocked")) {
                    userQuery.localRelationship.conversationStatus = ConversationStatus.get("peeking_blocked");
                } else {
                    Relationship relationship3 = userQuery.localRelationship;
                    relationship3.conversationStatus = conversationStatus;
                    relationship3.convType = str2;
                }
            }
        }
        if (!TEnum.equals(matchFrom, "unknown_")) {
            userQuery.localRelationship.status.add(matchFrom);
        }
        qib0.f19813k0.f23551d.upsert(userQuery);
    }

    /* JADX INFO: renamed from: Y7 */
    public boolean m21423Y7() {
        User userM21483na = m21483na();
        return NullChecker.a(userM21483na) && !vwb.J(userM21483na.status) && userM21483na.status.contains(UserStatus.get("RISK_TAG_VIOLATION")) && !((Integer) App.i.get()).equals(this.f18857Q.f3628e0.m21362I7());
    }

    /* JADX INFO: renamed from: Y8 */
    public final /* synthetic */ roj0 m21424Y8(AppealPostData appealPostData, Envelope envelope) {
        if (!TextUtils.equals(appealPostData.appeal_type, "jailed")) {
            this.f18857Q.m3422w3(envelope, null);
        }
        return roj0.a;
    }

    /* JADX INFO: renamed from: Y9 */
    public c<roj0> m21425Y9(final String str, final boolean z, final boolean z2) {
        return this.f18857Q.scheduled("users/" + str, 0, new v9j() { // from class: l.shb
            public final Object call() {
                return this.f21309a.m21383N8(str, z, z2);
            }
        });
    }

    /* JADX INFO: renamed from: Z6 */
    public c<roj0> m21426Z6(String str, String str2) {
        String string;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("tipId", str);
            jSONObject.put("content", str2);
            string = jSONObject.toString();
        } catch (JSONException e) {
            CrashHelper.c(e);
            string = "";
        }
        final utc0 utc0VarCreate = utc0.create(Network.JSON, string);
        return this.f18857Q.scheduled("icebreakings/put/" + CoreModule.m1850H().userId(), -1, new v9j() { // from class: l.ieb
            public final Object call() {
                return ia20.m16571e(new v9j() { // from class: l.xeb
                    public final Object call() {
                        return C0154a.f3483P.auth().q(C0154a.m3143J0("/icebreakings")).m(utc0Var).b();
                    }
                }).map(new w9j() { // from class: l.yeb
                    public final Object call(Object obj) {
                        return roj0.a;
                    }
                }).compose(mkd0.C());
            }
        });
    }

    /* JADX INFO: renamed from: Z7 */
    public boolean m21427Z7() {
        User userM21483na = m21483na();
        return NullChecker.a(userM21483na) && !vwb.J(userM21483na.status) && userM21483na.status.contains(UserStatus.get("RISK_TAG_UNREAL")) && !((Integer) App.i.get()).equals(this.f18857Q.f3628e0.m21362I7());
    }

    /* JADX INFO: renamed from: Z8 */
    public final /* synthetic */ c m21428Z8(final AppealPostData appealPostData, final AppealPostData appealPostData2) {
        return new la20(new v9j() { // from class: l.eeb
            public final Object call() {
                return C0154a.f3483P.auth().q(C0154a.m3296w2("/me/appeal-material")).l(utc0.create(Network.JSON, appealPostData.toJson())).b();
            }
        }).map(new w9j() { // from class: l.geb
            public final Object call(Object obj) {
                return this.f13232a.m21424Y8(appealPostData2, (Envelope) obj);
            }
        }).compose(mkd0.C());
    }

    /* JADX INFO: renamed from: Z9 */
    public c<roj0> m21429Z9() {
        return this.f18857Q.scheduled("me/appeal-info", 0, new v9j() { // from class: l.oib
            public final Object call() {
                return this.f18251a.m21391P8();
            }
        });
    }

    /* JADX INFO: renamed from: a7 */
    public c<UserFeedbackInfo> m21430a7(final String str) {
        final String str2 = "/quality/fake/picture/pop";
        return this.f18857Q.scheduled("/quality/fake/picture/pop" + str, -1, new v9j() { // from class: l.dhb
            public final Object call() {
                return this.f10398a.m21473l8(str, str2);
            }
        });
    }

    /* JADX INFO: renamed from: a8 */
    public boolean m21431a8() {
        return TextUtils.equals((CharSequence) this.f18857Q.f3628e0.f18933Z3.get(), "marryMode");
    }

    /* JADX INFO: renamed from: a9 */
    public final /* synthetic */ c m21432a9(final AppealPostData appealPostData, final AppealPostData appealPostData2) {
        return this.f18857Q.scheduled("/me/appeal-material", -1, new v9j() { // from class: l.odb
            public final Object call() {
                return this.f18162a.m21428Z8(appealPostData2, appealPostData);
            }
        });
    }

    /* JADX INFO: renamed from: aa */
    public c<roj0> m21433aa() {
        return this.f18857Q.scheduled("me/appeal-fake-info", 0, new v9j() { // from class: l.ueb
            public final Object call() {
                return this.f23510a.m21399R8();
            }
        });
    }

    /* JADX INFO: renamed from: b7 */
    public c<roj0> m21434b7(String str, final String str2, final boolean z, final boolean z2) {
        final String str3 = "/quality/feedback/" + str + "/picture";
        return this.f18857Q.scheduled("picture_feed_back:" + str + z, -1, new v9j() { // from class: l.iib
            public final Object call() {
                return ia20.m16571e(new v9j() { // from class: l.cdb
                    public final Object call() {
                        return pib.m21169L5(str, z, z, str);
                    }
                }).map(new w9j() { // from class: l.ddb
                    public final Object call(Object obj) {
                        return roj0.a;
                    }
                }).compose(mkd0.C());
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0041  */
    /* JADX INFO: renamed from: b8 */
    public boolean m21435b8(boolean z) {
        byte b;
        VerificationCenter verificationCenterM3542k4 = CoreModule.f1534c.f3541B0.m3542k4();
        byte b2 = -1;
        if (!NullChecker.a(verificationCenterM3542k4) || !NullChecker.a(verificationCenterM3542k4.picVerificationInfo)) {
            b = -1;
        } else if (TEnum.equals(verificationCenterM3542k4.picVerificationInfo.status, "verified")) {
            b = 1;
        } else if (TEnum.equals(verificationCenterM3542k4.picVerificationInfo.status, "pending") || TEnum.equals(verificationCenterM3542k4.picVerificationInfo.status, "prePending")) {
            b = 0;
        } else {
            b = -1;
        }
        if (NullChecker.a(verificationCenterM3542k4) && NullChecker.a(verificationCenterM3542k4.idCard)) {
            if (TEnum.equals(verificationCenterM3542k4.idCard.status, "verified")) {
                b2 = 1;
            } else if (TEnum.equals(verificationCenterM3542k4.idCard.status, "pending") || TEnum.equals(verificationCenterM3542k4.idCard.status, "prePending")) {
                b2 = 0;
            }
        }
        User userM21483na = m21483na();
        boolean z2 = NullChecker.a(userM21483na) && NullChecker.a(userM21483na.settings) && !(TextUtils.isEmpty(userM21483na.settings.phoneNumber.number) && TextUtils.isEmpty(userM21483na.settings.linkedPhoneNumber.number));
        boolean zEquals = TextUtils.equals((CharSequence) this.f18857Q.f3628e0.f18933Z3.get(), "marryMode");
        if (!z) {
            zEquals = true;
        }
        return b == 1 && b2 == 1 && z2 && zEquals && !userM21483na.isFakeUser() && TextUtils.equals("passed", userM21483na.getUserInfoForMarryStatus());
    }

    /* JADX INFO: renamed from: b9 */
    public final /* synthetic */ c m21436b9(final String str) {
        return ia20.m16571e(new v9j() { // from class: l.ehb
            public final Object call() {
                return C0154a.f3483P.auth().q(C0154a.m3130G(str)).l(utc0.create(Network.JSON, "{\"source\":\"client\"}")).b();
            }
        }).map(new C1125a()).compose(mkd0.C());
    }

    /* JADX INFO: renamed from: ba */
    public c<roj0> m21437ba() {
        return now(this.f18992g7.z());
    }

    /* JADX INFO: renamed from: c7 */
    public c<roj0> m21438c7(final int i, final String str) {
        return this.f18857Q.scheduled("feedback_holiday_mask" + CoreModule.m1850H().userId(), -1, new v9j() { // from class: l.ffb
            public final Object call() {
                return ia20.m16571e(new v9j() { // from class: l.mhb
                    public final Object call() {
                        return C0154a.f3483P.auth().q(C0154a.m3130G("/layer/" + str + "/" + i)).m(utc0.create(Network.JSON, "")).b();
                    }
                }).map(new w9j() { // from class: l.nhb
                    public final Object call(Object obj) {
                        return roj0.a;
                    }
                }).compose(mkd0.C());
            }
        });
    }

    /* JADX INFO: renamed from: c8 */
    public boolean m21439c8() {
        List list;
        User userM21483na = m21483na();
        return (userM21483na == null || (list = userM21483na.status) == null || !list.contains(UserStatus.get("hidden")) || ((Integer) App.i.get()).equals(this.f18857Q.f3628e0.m21362I7())) ? false : true;
    }

    /* JADX INFO: renamed from: c9 */
    public final /* synthetic */ void m21440c9(String str) {
        m21418X6(str, CameraSticker.CATEGORY_DEFAULT_FILTER, ConversationStatus.get("blocked"));
    }

    /* JADX INFO: renamed from: ca */
    public c<roj0> m21441ca() {
        return this.f18984f7.z();
    }

    /* JADX INFO: renamed from: d8 */
    public boolean m21442d8() {
        List list;
        User userM21483na = m21483na();
        return (userM21483na == null || (list = userM21483na.status) == null || !list.contains(UserStatus.get("hidden"))) ? false : true;
    }

    /* JADX INFO: renamed from: d9 */
    public final /* synthetic */ void m21443d9(final String str) {
        this.f18857Q.f3598U.m13685a(new d30() { // from class: l.cbb
            public final void call() {
                this.f9579a.m21440c9(str);
            }
        });
    }

    /* JADX INFO: renamed from: da */
    public c<roj0> m21444da() {
        return this.f18857Q.scheduled("refreshLoveLetterEntry", 0, new v9j() { // from class: l.rbb
            public final Object call() {
                return this.f20474a.m21407T8();
            }
        });
    }

    /* JADX INFO: renamed from: e8 */
    public boolean m21445e8() {
        User userM21483na = m21483na();
        return userM21483na != null && userM21483na.isProfileJailed();
    }

    /* JADX INFO: renamed from: e9 */
    public final /* synthetic */ void m21446e9(final String str, final long j) {
        this.f18857Q.f3598U.m13685a(new d30() { // from class: l.mcb
            public final void call() {
                pib.m21244e6(str, j);
            }
        });
    }

    /* JADX INFO: renamed from: ea */
    public c<roj0> m21447ea() {
        return this.f18976e7.z();
    }

    /* JADX INFO: renamed from: f7 */
    public void m21448f7(String str, String str2, boolean z, String str3, String str4, String str5, String str6, String str7) {
        String string;
        if (TextUtils.isEmpty(str)) {
            str = CoreModule.m1850H().userId();
        }
        String strM3130G = C0154a.m3130G("/cards/feedback");
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("userId", str);
            jSONObject.put("other_user_id", str6);
            jSONObject.put("show", String.valueOf(z));
            jSONObject.put("reason", str3);
            jSONObject.put("action", str2);
            jSONObject.put("page_id", str4);
            jSONObject.put("business", str5);
            jSONObject.put("traceId", str7);
            string = jSONObject.toString();
        } catch (JSONException e) {
            CrashHelper.c(e);
            string = "";
        }
        utc0 utc0VarCreate = utc0.create(Network.JSON, string);
        this.f18857Q.scheduled(strM3130G + str, -1, new C1127c(strM3130G, utc0VarCreate));
    }

    /* JADX INFO: renamed from: f8 */
    public boolean m21449f8() {
        User userM21483na = m21483na();
        return userM21483na != null && userM21483na.isSwipeJailed();
    }

    /* JADX INFO: renamed from: f9 */
    public final /* synthetic */ void m21450f9(String str, String str2, roj0 roj0Var) {
        m21353Fa(str, str2);
    }

    /* JADX INFO: renamed from: fa */
    public c<RegionRule> m21451fa() {
        return this.f18976e7.k();
    }

    /* JADX INFO: renamed from: g7 */
    public List<LiteraturesComments> m21452g7(String str) {
        return this.f18864Q6.get(str);
    }

    /* JADX INFO: renamed from: g8 */
    public boolean m21453g8() {
        VerificationCenter verificationCenterM3548q4 = this.f18857Q.f3541B0.m3548q4();
        return NullChecker.a(verificationCenterM3548q4) && NullChecker.a(verificationCenterM3548q4.picVerificationInfo) && TEnum.equals(verificationCenterM3548q4.picVerificationInfo.status, "verified") && this.f18857Q.f3628e0.m21483na().isOpenFilterVeriMsg();
    }

    /* JADX INFO: renamed from: g9 */
    public final /* synthetic */ void m21454g9(String str, User user) {
        if (user == null) {
            m21417W9(str);
        }
    }

    /* JADX INFO: renamed from: ga */
    public RegionRule m21455ga() {
        return (RegionRule) this.f18976e7.n();
    }

    /* JADX INFO: renamed from: h7 */
    public Literatures m21456h7(String str) {
        return this.f18872R6.get(str);
    }

    /* JADX INFO: renamed from: h8 */
    public boolean m21457h8(long j) {
        return ((double) mqi0.o()) - m21483na().createdTime <= ((double) TimeUnit.MILLISECONDS.convert(j, TimeUnit.HOURS));
    }

    /* JADX INFO: renamed from: h9 */
    public final /* synthetic */ roj0 m21458h9(Envelope envelope) {
        this.f18857Q.m3424y3(envelope, null, false, false, true);
        return roj0.a;
    }

    /* JADX INFO: renamed from: ha */
    public c<roj0> m21459ha(String str, Report report) {
        return this.f18857Q.f3607X.m14303h3(C0154a.m3296w2("/" + str + "/reports"), report);
    }

    /* JADX INFO: renamed from: i7 */
    public c<CoreData> m21460i7(String str) {
        final String str2 = "/" + str + "/literatures";
        return this.f18857Q.scheduled("/users/me/profile/BookMoviesDramas/" + str, 0, new v9j() { // from class: l.ebb
            public final Object call() {
                return ia20.m16571e(new v9j() { // from class: l.fdb
                    public final Object call() {
                        return C0154a.f3483P.auth().q(C0154a.m3296w2(str)).f().b();
                    }
                }).map(new w9j() { // from class: l.gdb
                    public final Object call(Object obj) {
                        return ((Envelope) obj).getModuleData(CoreData.class);
                    }
                });
            }
        }).compose(mkd0.C());
    }

    /* JADX INFO: renamed from: i8 */
    public boolean m21461i8() {
        User userM21483na = m21483na();
        return NullChecker.a(userM21483na) && !vwb.J(userM21483na.status) && userM21483na.status.contains(UserStatus.get("RISK_TAG_GUIDE_CHANGE_AVATAR"));
    }

    /* JADX INFO: renamed from: i9 */
    public final /* synthetic */ c m21462i9(String str) {
        return m21202T9(str).map(new w9j() { // from class: l.thb
            public final Object call(Object obj) {
                return this.f22113a.m21458h9((Envelope) obj);
            }
        }).compose(C0154a.m3182T2());
    }

    /* JADX INFO: renamed from: ia */
    public c<roj0> m21463ia() {
        return this.f18857Q.scheduled("reportLoveLetterShown", -1, new v9j() { // from class: l.zdb
            public final Object call() {
                return ia20.m16567a(new v9j() { // from class: l.peb
                    public final Object call() {
                        return C0154a.f3483P.auth().q(C0154a.m3130G("/love_letter/boost")).l(utc0.create(Network.JSON, "")).b();
                    }
                }).map(new w9j() { // from class: l.reb
                    public final Object call(Object obj) {
                        return roj0.a;
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: j7 */
    public c<List<BreakIce>> m21464j7(String str, String str2, final List<String> list) {
        return CoreModule.m1854P().m11713i().m5451hm() ? CoreModule.f1534c.f3687x2.m28827n3(str, str2).map(new w9j() { // from class: l.hdb
            public final Object call(Object obj) {
                return this.f13840a.m21477m8(list, (Envelope) obj);
            }
        }) : m21496r7(str, str2).map(new w9j() { // from class: l.idb
            public final Object call(Object obj) {
                return this.f14382a.m21481n8(list, (Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: j8 */
    public boolean m21465j8(User user) {
        if (!NullChecker.a(user) || user.isJailed()) {
            return false;
        }
        return !user.status.contains(UserStatus.get("hidden")) || ((Integer) App.i.get()).equals(this.f18857Q.f3628e0.m21362I7());
    }

    /* JADX INFO: renamed from: j9 */
    public final /* synthetic */ roj0 m21466j9(Envelope envelope) {
        this.f18857Q.m3424y3(envelope, null, false, false, true);
        return roj0.a;
    }

    /* JADX INFO: renamed from: ja */
    public c<roj0> m21467ja(String str, String str2, String str3) {
        final JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("task", str);
            jSONObject.put("type", str2);
            jSONObject.put("scene", str3);
        } catch (Exception unused) {
        }
        return this.f18857Q.scheduled("report_task_bh" + str + str2 + str3, -1, new v9j() { // from class: l.ycb
            public final Object call() {
                return ia20.m16567a(new v9j() { // from class: l.gfb
                    public final Object call() {
                        return C0154a.f3483P.auth().q(C0154a.m3130G("/my-tab-task/report")).l(utc0.create(Network.JSON, jSONObject.toString())).b();
                    }
                });
            }
        }).map(new C1133i());
    }

    /* JADX INFO: renamed from: k7 */
    public c<Envelope> m21468k7(String str) {
        final String string;
        if (TextUtils.isEmpty(str)) {
            string = Uri.parse(C0154a.m3143J0("/chat-partners-signals?with=users&limit=20")).buildUpon().appendQueryParameter("until", Converter.dateToApiTimeString(mqi0.o())).build().toString();
        } else {
            string = Uri.parse(C0154a.m3143J0("/chat-partners-signals?with=users&") + str).toString();
        }
        return this.f18857Q.scheduled("getChatPartnerHistory" + CoreModule.m1850H().userId(), 0, new v9j() { // from class: l.jhb
            public final Object call() {
                return ia20.m16571e(new v9j() { // from class: l.kcb
                    public final Object call() {
                        return C0154a.f3483P.auth().q(str).f().b();
                    }
                }).compose(mkd0.C());
            }
        });
    }

    /* JADX INFO: renamed from: k8 */
    public boolean m21469k8() {
        User userM21483na = m21483na();
        return NullChecker.a(userM21483na) && !vwb.J(userM21483na.status) && userM21483na.status.contains(UserStatus.get("RISK_TAG_UNREAL")) && userM21483na.status.contains(UserStatus.get("RISK_TAG_FAKE_YOUNGER_AGE")) && !((Integer) App.i.get()).equals(this.f18857Q.f3628e0.m21362I7());
    }

    /* JADX INFO: renamed from: k9 */
    public final /* synthetic */ c m21470k9(String str) {
        return m21206U9(str).map(new w9j() { // from class: l.bbb
            public final Object call(Object obj) {
                return this.f8805a.m21466j9((Envelope) obj);
            }
        }).compose(C0154a.m3182T2());
    }

    /* JADX INFO: renamed from: ka */
    public void m21471ka(final String str, final boolean z, final boolean z2) {
        this.f18857Q.scheduled("report_task_bh" + str, -1, new v9j() { // from class: l.pgb
            public final Object call() {
                return ia20.m16567a(new v9j() { // from class: l.dbb
                    public final Object call() {
                        return pib.m21160J4(str, z, z);
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: l7 */
    public c<Envelope> m21472l7(@NonNull ChatPartnerScene chatPartnerScene) {
        final String string = Uri.parse(C0154a.m3143J0("/chat-partners?with=users")).buildUpon().appendQueryParameter("scene", chatPartnerScene.getValue()).build().toString();
        return this.f18857Q.scheduled("getChatPartners" + CoreModule.m1850H().userId(), -1, new v9j() { // from class: l.kfb
            public final Object call() {
                return ia20.m16571e(new v9j() { // from class: l.lhb
                    public final Object call() {
                        return C0154a.f3483P.auth().q(str).f().b();
                    }
                }).compose(mkd0.C());
            }
        });
    }

    /* JADX INFO: renamed from: l8 */
    public final /* synthetic */ c m21473l8(final String str, final String str2) {
        return ia20.m16571e(new v9j() { // from class: l.tcb
            public final Object call() {
                return pib.m21161J5(str, str2);
            }
        }).map(new C1132h()).compose(mkd0.C()).map(new C1131g(str));
    }

    /* JADX INFO: renamed from: l9 */
    public final /* synthetic */ WechatNotifySetting m21474l9(Envelope envelope) {
        this.f18816K1.onNext(Optional.fromNullable(envelope.getModuleData(CoreData.class).wechat));
        return envelope.getModuleData(CoreData.class).wechat;
    }

    /* JADX INFO: renamed from: la */
    public c<roj0> m21475la() {
        return this.f18857Q.scheduled("wechat_dialog_show", 0, new v9j() { // from class: l.zab
            public final Object call() {
                return ia20.m16567a(new v9j() { // from class: l.tbb
                    public final Object call() {
                        return C0154a.f3483P.auth().q(C0154a.m3130G("/wechat/dialogpop")).f().b();
                    }
                }).map(new w9j() { // from class: l.ubb
                    public final Object call(Object obj) {
                        return roj0.a;
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: m7 */
    public c<Envelope> m21476m7() {
        String str = "/" + CoreModule.m1850H().userId() + "/popGuide";
        return this.f18857Q.scheduled(str, 0, new C1126b(str));
    }

    /* JADX INFO: renamed from: m9 */
    public final /* synthetic */ c m21478m9() {
        return ia20.m16567a(new v9j() { // from class: l.lib
            public final Object call() {
                return C0154a.f3483P.auth().q(C0154a.m3130G("/wechat/status")).f().b();
            }
        }).map(new w9j() { // from class: l.mib
            public final Object call(Object obj) {
                return this.f16988a.m21474l9((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: ma */
    public User m21479ma() {
        User userM21483na = m21483na();
        return userM21483na.riskAuditUser(CoreModule.m1851K().getUserById("fake_risk_audit_default_" + ((DbObject) userM21483na).id));
    }

    /* JADX INFO: renamed from: n7 */
    public c<roj0> m21480n7() {
        return now("gpTopicCards", ia20.m16569c(new v9j() { // from class: l.lgb
            public final Object call() {
                return C0154a.f3483P.auth().q(C0154a.m3296w2("/" + CoreModule.m1850H().userId() + "/topic-cards")).f().b();
            }
        }, GPTopicCardEnvelop.JSON_ADAPTER).map(new w9j() { // from class: l.wgb
            public final Object call(Object obj) {
                return this.f25143a.m21485o8((GPTopicCardEnvelop) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: n9 */
    public c<MarriageGuide> m21482n9() {
        final String str = ((Boolean) this.f18805I4.get()).booleanValue() ? "moment" : "quality,moment";
        return this.f18857Q.scheduled("marry_dlg_show_check_".concat(str), 0, new v9j() { // from class: l.rhb
            public final Object call() {
                return ia20.m16571e(new v9j() { // from class: l.nbb
                    public final Object call() {
                        return C0154a.f3483P.auth().q(C0154a.m3143J0("/marriage-guide?conditions=" + str)).f().b();
                    }
                }).map(new w9j() { // from class: l.obb
                    public final Object call(Object obj) {
                        return ((Envelope) obj).getModuleData(CoreData.class).marriageGuide;
                    }
                }).filter(new w9j() { // from class: l.pbb
                    public final Object call(Object obj) {
                        return Boolean.valueOf(NullChecker.a((MarriageGuide) obj));
                    }
                }).observeOn(jo0.a());
            }
        });
    }

    /* JADX INFO: renamed from: na */
    public User m21483na() {
        return e51.D() ? m21490p9() : m21392P9();
    }

    /* JADX INFO: renamed from: o7 */
    public c<roj0> m21484o7(final String str) {
        return now("gpGetTopicUsers", ia20.m16569c(new v9j() { // from class: l.mgb
            public final Object call() {
                return C0154a.f3483P.auth().q(C0154a.m3296w2("/" + CoreModule.m1850H().userId() + "/topic-cards/" + str)).f().b();
            }
        }, Envelope.JSON_ADAPTER).map(new w9j() { // from class: l.ngb
            public final Object call(Object obj) {
                return this.f17680a.m21489p8(str, (Envelope) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: o8 */
    public final /* synthetic */ roj0 m21485o8(GPTopicCardEnvelop gPTopicCardEnvelop) {
        this.f19034m1.onNext(ura.m25555e().m25559d().m5822mk(gPTopicCardEnvelop.data.topicCards));
        return roj0.a;
    }

    /* JADX INFO: renamed from: o9 */
    public c<User> m21486o9() {
        return m21373Ka(this.f18754B1);
    }

    /* JADX INFO: renamed from: oa */
    public User m21487oa(String str) {
        return e51.D() ? m21393Pa(str) : m21396Q9(str);
    }

    /* JADX INFO: renamed from: p7 */
    public c<Envelope> m21488p7() {
        return this.f18857Q.scheduled("icebreakings/get/" + CoreModule.m1850H().userId(), 0, new v9j() { // from class: l.khb
            public final Object call() {
                return ia20.m16571e(new v9j() { // from class: l.jcb
                    public final Object call() {
                        return C0154a.f3483P.auth().q(C0154a.m3143J0("/icebreakings?source=matchGuide")).f().b();
                    }
                }).compose(mkd0.C());
            }
        });
    }

    /* JADX INFO: renamed from: p8 */
    public final /* synthetic */ roj0 m21489p8(String str, Envelope envelope) {
        HashMap map = (HashMap) this.f19042n1.e();
        if (map == null) {
            map = new HashMap();
        }
        map.put(str, envelope.getModuleData(CommonData.class).users);
        this.f19042n1.onNext(map);
        return roj0.a;
    }

    /* JADX INFO: renamed from: p9 */
    public User m21490p9() {
        if (this.f18754B1 == null) {
            StringBuilder sb = new StringBuilder("CoreUser me_ CoreModule.account().userId == null");
            if (CoreModule.m1850H().getAuthData().b() == null) {
                sb.append(", CoreModule.account().getAuthData().get == null");
            } else {
                sb.append(", CoreModule.account().getAuthData().get().userId" + ((AuthData) CoreModule.m1850H().getAuthData().b()).userId);
            }
            CrashHelper.c(new NullPointerException(sb.toString()));
        }
        return qib0.f19813k0.f23551d.queryCache(this.f18754B1);
    }

    /* JADX INFO: renamed from: pa */
    public void m21491pa(String str, CoreData coreData) {
        if (TextUtils.isEmpty(str) || coreData == null) {
            return;
        }
        List<Literatures> list = coreData.literatures;
        List<LiteraturesComments> list2 = coreData.literaturesComments;
        if (vwb.J(list2)) {
            m21376L9(str, new ArrayList());
            return;
        }
        if (!vwb.J(list)) {
            for (Literatures literatures : list) {
                if (NullChecker.a(literatures) && !TextUtils.isEmpty(literatures.id)) {
                    m21380M9(literatures.id, literatures);
                }
            }
        }
        for (LiteraturesComments literaturesComments : list2) {
            if (literaturesComments != null) {
                Literatures literaturesM21456h7 = m21456h7(literaturesComments.literatureID);
                if (NullChecker.a(literaturesM21456h7) && !TextUtils.isEmpty(literaturesM21456h7.id)) {
                    literaturesComments.localLiteratures = literaturesM21456h7;
                }
            }
        }
        m21376L9(str, list2);
    }

    /* JADX INFO: renamed from: q7 */
    public c<List<IceBreakQuestion>> m21492q7(final String str) {
        return this.f18857Q.scheduled("get_ice_break_qas" + str, 0, new v9j() { // from class: l.gib
            public final Object call() {
                return ia20.m16567a(new v9j() { // from class: l.zcb
                    public final Object call() {
                        return pib.m21186P6(str);
                    }
                }).map(new w9j() { // from class: l.adb
                    public final Object call(Object obj) {
                        return ((Envelope) obj).getModuleData(CoreData.class).iceBreakQuestions;
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: q8 */
    public final /* synthetic */ c m21493q8(final String str) {
        return ia20.m16571e(new v9j() { // from class: l.mdb
            public final Object call() {
                return C0154a.f3483P.auth().q(C0154a.m3130G(str)).f().b();
            }
        }).map(new C1130f()).compose(mkd0.C()).map(new C1129e());
    }

    /* JADX INFO: renamed from: q9 */
    public final void m21494q9(String str, Envelope envelope) {
        if (!ura.m25555e().m25559d().m5618Er() || TextUtils.equals(str, CoreModule.m1850H().userId())) {
            return;
        }
        m21491pa(str, (CoreData) envelope.getModuleData(CoreData.class));
    }

    /* JADX INFO: renamed from: qa */
    public final void m21495qa() {
        List<LiteraturesComments> listM21452g7 = CoreModule.f1534c.f3628e0.m21452g7(CoreModule.m1850H().userId());
        if (listM21452g7 == null || listM21452g7.isEmpty()) {
            m21411V6();
            return;
        }
        CoreData coreDataNew_ = CoreData.new_();
        coreDataNew_.literaturesComments = listM21452g7;
        CoreModule.f1534c.f3628e0.f19003i2.put(coreDataNew_.toJson());
    }

    /* JADX INFO: renamed from: r7 */
    public c<Envelope> m21496r7(final String str, final String str2) {
        return this.f18857Q.scheduled("icebreakings/" + str, 0, new v9j() { // from class: l.abb
            public final Object call() {
                return pib.m21271l4(str, str2);
            }
        });
    }

    /* JADX INFO: renamed from: r8 */
    public final /* synthetic */ void m21497r8(String str, Envelope envelope) {
        if (NullChecker.a(envelope)) {
            m21491pa(str, (CoreData) envelope.getModuleData(CoreData.class));
        }
    }

    /* JADX INFO: renamed from: r9 */
    public void m21498r9(boolean z) {
        this.f18905W.onNext(Boolean.valueOf(z));
    }

    /* JADX INFO: renamed from: ra */
    public c<Envelope> m21499ra(@NonNull String str, @NonNull List<String> list) {
        String string;
        final String strM3143J0 = C0154a.m3143J0("/chat-partners-signals");
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("userIds", new JSONArray((Collection) list));
            jSONObject.put("textId", str);
            string = jSONObject.toString();
        } catch (JSONException unused) {
            string = "";
        }
        final utc0 utc0VarCreate = utc0.create(Network.JSON, string);
        return this.f18857Q.scheduled(strM3143J0 + str + jSONObject, -1, new v9j() { // from class: l.vbb
            public final Object call() {
                return this.f24244a.m21410U8(strM3143J0, utc0VarCreate);
            }
        });
    }

    /* JADX INFO: renamed from: s7 */
    public c<IdealInfo> m21500s7(final String str, final String str2) {
        return this.f18857Q.scheduled("ideal_match_info_" + str + str2, 0, new v9j() { // from class: l.ahb
            public final Object call() {
                return ia20.m16567a(new v9j() { // from class: l.edb
                    public final Object call() {
                        return C0154a.f3483P.auth().q(C0154a.m3130G("/dating/ideal-guide/" + str + "?scene=" + str)).f().b();
                    }
                });
            }
        }).map(new w9j() { // from class: l.bhb
            public final Object call(Object obj) {
                return ((Envelope) obj).getModuleData(CoreData.class).idealInfo;
            }
        });
    }

    /* JADX INFO: renamed from: s8 */
    public final /* synthetic */ void m21501s8(String str, Throwable th) {
        CoreData coreData;
        try {
            String str2 = (String) this.f19003i2.get();
            if (TextUtils.isEmpty(str2) || (coreData = (CoreData) CoreData.JSON_ADAPTER.parse(str2)) == null) {
                return;
            }
            m21491pa(str, coreData);
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: s9 */
    public c<roj0> m21502s9(final String str) {
        User userM21393Pa = m21393Pa(str);
        if (userM21393Pa == null) {
            return this.f18857Q.just();
        }
        final String str2 = userM21393Pa.profile.contactLookups.next;
        C0158c c0158c = this.f18857Q;
        if (str2 == null) {
            return c0158c.just();
        }
        return c0158c.scheduled("users/" + str + "/contacts/more", 0, new v9j() { // from class: l.qhb
            public final Object call() {
                return this.f19755a.m21347E8(str, str2);
            }
        });
    }

    /* JADX INFO: renamed from: sa */
    public c<roj0> m21503sa(final List<String> list) {
        return this.f18857Q.scheduled("set_ice_break_qas", -1, new v9j() { // from class: l.ecb
            public final Object call() {
                return ia20.m16567a(new v9j() { // from class: l.beb
                    public final Object call() {
                        return pib.m21239d6(list);
                    }
                }).map(new w9j() { // from class: l.ceb
                    public final Object call(Object obj) {
                        return roj0.a;
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: t7 */
    public c<UserFeedbackInfo> m21504t7() {
        final String str = "/inform/pop/info";
        return this.f18857Q.scheduled("/inform/pop/info", 0, new v9j() { // from class: l.scb
            public final Object call() {
                return this.f21256a.m21493q8(str);
            }
        });
    }

    /* JADX INFO: renamed from: t8 */
    public final /* synthetic */ roj0 m21505t8(Envelope envelope) {
        int i;
        List<MyTabTask> list = envelope.getModuleData(CoreData.class).myTabTasks;
        for (MyTabTask myTabTask : list) {
            if (TextUtils.equals(myTabTask.type, "verification")) {
                if (!NullChecker.a(myTabTask.button) || (i = myTabTask.button.counter) == ((Integer) this.f19040m7.get()).intValue()) {
                    break;
                    break;
                }
                this.f19040m7.put(Integer.valueOf(i));
                this.f19048n7.put(Boolean.FALSE);
                this.f19032l7.onNext(roj0.a);
                break;
            }
        }
        this.f19008i7.onNext(list);
        return roj0.a;
    }

    /* JADX INFO: renamed from: t9 */
    public c<roj0> m21506t9(final String str) {
        return this.f18857Q.scheduled("onlineMatchGetUser/" + str, 0, new v9j() { // from class: l.sgb
            public final Object call() {
                return this.f21299a.m21355G8(str);
            }
        });
    }

    /* JADX INFO: renamed from: ta */
    public c<Boolean> m21507ta(List<IdealTag> list) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        JSONObject jSONObject4 = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        User userM21483na = CoreModule.f1534c.f3628e0.m21483na();
        final boolean zHasIdealInfo = userM21483na.hasIdealInfo();
        ArrayList arrayListQ = vwb.Q(list, new w9j() { // from class: l.jeb
            public final Object call(Object obj) {
                return ((IdealTag) obj).id;
            }
        });
        if (zHasIdealInfo) {
            final ArrayList arrayListQ2 = vwb.Q(userM21483na.profile.extensions.basic.ideal, new w9j() { // from class: l.keb
                public final Object call(Object obj) {
                    return ((IdealTag) obj).id;
                }
            });
            vwb.I(arrayListQ, new Comparator() { // from class: l.leb
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return pib.m21291q4(arrayListQ2, (String) obj, (String) obj2);
                }
            });
        }
        if (!vwb.J(arrayListQ)) {
            Iterator it = arrayListQ.iterator();
            while (it.hasNext()) {
                jSONArray.put((String) it.next());
            }
        }
        try {
            jSONObject4.put("idealType", jSONArray);
            jSONObject3.put("basic", jSONObject4);
            jSONObject2.put("extensions", jSONObject3);
            jSONObject.put("profile", jSONObject2);
        } catch (JSONException unused) {
        }
        return m21518w9(jSONObject.toString()).map(new w9j() { // from class: l.meb
            public final Object call(Object obj) {
                return Boolean.valueOf(!zHasIdealInfo);
            }
        }).doOnNext(new e30() { // from class: l.neb
            public final void call(Object obj) {
                this.f17629a.m21412V8((Boolean) obj);
            }
        });
    }

    /* JADX INFO: renamed from: u7, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final List<BreakIce> m21481n8(Envelope envelope, List<String> list) {
        if (envelope.meta.code != 200) {
            return null;
        }
        if (NullChecker.a(envelope.getModuleData(CoreData.class)) && !vwb.J(envelope.getModuleData(CoreData.class).iceBreakings)) {
            return envelope.getModuleData(CoreData.class).iceBreakings;
        }
        if (vwb.J(list)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            BreakIce breakIceNew_ = BreakIce.new_();
            breakIceNew_.content = str;
            breakIceNew_.tipId = str;
            arrayList.add(breakIceNew_);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: u8 */
    public final /* synthetic */ c m21509u8() {
        return ia20.m16567a(new v9j() { // from class: l.bgb
            public final Object call() {
                return C0154a.f3483P.auth().q(C0154a.m3130G("/my-tab-task/list")).f().b();
            }
        }).map(new w9j() { // from class: l.cgb
            public final Object call(Object obj) {
                return this.f9651a.m21505t8((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: u9 */
    public c<roj0> m21510u9(User user) {
        return m21514v9(user, null);
    }

    /* JADX INFO: renamed from: ua */
    public void m21511ua() {
        this.f19048n7.put(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: v7 */
    public c<LoveLetterContent> m21512v7(final String str) {
        return this.f18857Q.scheduled("getLoveLetterMsgContent" + str, 0, new v9j() { // from class: l.lcb
            public final Object call() {
                return ia20.m16567a(new v9j() { // from class: l.wdb
                    public final Object call() {
                        return C0154a.f3483P.auth().q(C0154a.m3130G("/love_letter/card/" + str)).f().b();
                    }
                }).map(new w9j() { // from class: l.xdb
                    public final Object call(Object obj) {
                        return ((Envelope) obj).getModuleData(CoreData.class).loveLetterContent;
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: v8 */
    public final /* synthetic */ roj0 m21513v8(Envelope envelope) {
        List list = envelope.getModuleData(CoreData.class).myTabTasks;
        if (vwb.J(list) || TextUtils.isEmpty(((MyTabTask) list.get(0)).title)) {
            this.f19016j7.onNext(MyTabTask.new_());
        } else {
            this.f19016j7.onNext((MyTabTask) list.get(0));
        }
        return roj0.a;
    }

    /* JADX INFO: renamed from: v9 */
    public c<roj0> m21514v9(User user, String str) {
        if (user == null) {
            return c.just(roj0.a);
        }
        if (NullChecker.a(user.profile) && !vwb.J(user.profile.answers) && TextUtils.isEmpty(((Answer) user.profile.answers.get(0)).question) && TextUtils.isEmpty(((Answer) user.profile.answers.get(0)).value)) {
            CrashHelper.c(new Exception("user question 异常问题"));
        }
        if (NullChecker.a(user.profile) && NullChecker.a(user.profile.extensions) && NullChecker.a(user.profile.extensions.game) && !vwb.J(user.profile.extensions.game.screenshot) && user.profile.extensions.game.screenshot.size() > 3) {
            CrashHelper.c(new RuntimeException("game screenshot error：" + user.profile.extensions.game.screenshot.size()));
        }
        return m21522x9(user.toJson(), str);
    }

    /* JADX INFO: renamed from: va */
    public void m21515va(int i) {
        this.f18881T.put(Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: w7 */
    public c<MatchInfo> m21516w7() {
        return this.f18857Q.scheduled("matchInfo/", 0, new v9j() { // from class: l.fhb
            public final Object call() {
                return new la20(new v9j() { // from class: l.fbb
                    public final Object call() {
                        return C0154a.f3483P.auth().q(C0154a.m3143J0("/matchInfo")).f().b();
                    }
                }).map(new w9j() { // from class: l.hbb
                    public final Object call(Object obj) {
                        return ((Envelope) obj).getModuleData(CoreData.class).todayMatchInfo;
                    }
                }).compose(C0154a.m3182T2());
            }
        });
    }

    /* JADX INFO: renamed from: w8 */
    public final /* synthetic */ c m21517w8() {
        return ia20.m16567a(new v9j() { // from class: l.xhb
            public final Object call() {
                return C0154a.f3483P.auth().q(C0154a.m3130G("/my-tab-task/list?scene=avatar")).f().b();
            }
        }).map(new w9j() { // from class: l.yhb
            public final Object call(Object obj) {
                return this.f28212a.m21513v8((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: w9 */
    public c<roj0> m21518w9(String str) {
        return m21522x9(str, null);
    }

    /* JADX INFO: renamed from: wa */
    public c<roj0> m21519wa() {
        return this.f18960c7;
    }

    /* JADX INFO: renamed from: x7 */
    public void m21520x7() {
        final String strUserId = CoreModule.m1850H().userId();
        final String str = "/" + strUserId + "/literatures";
        CoreModule.f1534c.now(str, ia20.m16571e(new v9j() { // from class: l.hfb
            public final Object call() {
                return C0154a.f3483P.auth().q(C0154a.m3296w2(str)).f().b();
            }
        })).observeOn(jo0.a()).subscribe(mkd0.H(new e30() { // from class: l.ifb
            public final void call(Object obj) {
                this.f14427a.m21497r8(strUserId, (Envelope) obj);
            }
        }, new e30() { // from class: l.jfb
            public final void call(Object obj) {
                this.f15138a.m21501s8(strUserId, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: x8 */
    public final /* synthetic */ roj0 m21521x8(Envelope envelope) {
        List list = envelope.getModuleData(CoreData.class).myTabTasks;
        if (vwb.J(list) || TextUtils.isEmpty(((MyTabTask) list.get(0)).title)) {
            this.f19024k7.onNext(MyTabTask.new_());
        } else {
            this.f19024k7.onNext((MyTabTask) list.get(0));
        }
        return roj0.a;
    }

    /* JADX INFO: renamed from: x9 */
    public c<roj0> m21522x9(final String str, final String str2) {
        return this.f18857Q.scheduled("patch user" + str2, -1, new v9j() { // from class: l.hhb
            public final Object call() {
                return this.f13878a.m21363I8(str, str2);
            }
        });
    }

    /* JADX INFO: renamed from: xa */
    public c<FakeGuideData> m21523xa() {
        return this.f18857Q.scheduled("antispam/guide-change-avatar", 0, new v9j() { // from class: l.jgb
            public final Object call() {
                return this.f15146a.m21420X8();
            }
        });
    }

    @NonNull
    /* JADX INFO: renamed from: y7 */
    public String m21524y7(String str) {
        Map<String, GPMemo> mapM21386O7;
        GPMemo gPMemo;
        return (TextUtils.isEmpty(str) || (mapM21386O7 = m21386O7()) == null || mapM21386O7.isEmpty() || (gPMemo = mapM21386O7.get(str)) == null || TextUtils.isEmpty(gPMemo.memo)) ? "" : gPMemo.memo;
    }

    /* JADX INFO: renamed from: y8 */
    public final /* synthetic */ c m21525y8() {
        return ia20.m16567a(new v9j() { // from class: l.jib
            public final Object call() {
                return C0154a.f3483P.auth().q(C0154a.m3130G("/my-tab-task/list?scene=editInformation")).f().b();
            }
        }).map(new w9j() { // from class: l.kib
            public final Object call(Object obj) {
                return this.f15841a.m21521x8((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: y9 */
    public c<SettingGroups> m21526y9(UserPrivacySettings userPrivacySettings) {
        SettingGroups settingGroups = new SettingGroups();
        settingGroups.privacy = userPrivacySettings;
        final UserSettingPatch userSettingPatch = new UserSettingPatch();
        userSettingPatch.settingGroups = settingGroups;
        userSettingPatch.type = CameraSticker.CATEGORY_DEFAULT_FILTER;
        return m21394Q7(new v9j() { // from class: l.feb
            public final Object call() {
                return C0154a.f3483P.auth().q(C0154a.m3267p1()).l(utc0.create(Network.JSON, userSettingPatch.toJson())).b();
            }
        }, -1, "path_privacy_settings");
    }

    /* JADX INFO: renamed from: ya */
    public c<roj0> m21527ya(final AppealPostData appealPostData, final List<Media> list) {
        v9j v9jVar = new v9j() { // from class: l.zbb
            public final Object call() {
                return c.fromCallable(new Callable() { // from class: l.ydb
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return pib.m21290q3(list, appealPostData);
                    }
                });
            }
        };
        final w9j w9jVar = new w9j() { // from class: l.acb
            public final Object call(Object obj) {
                return new lsx((List) obj, true).flatMap(new w9j() { // from class: l.kdb
                    public final Object call(Object obj2) {
                        return ya5.m28127I((List) obj2, "pic_verification");
                    }
                }).map(new w9j() { // from class: l.ldb
                    public final Object call(Object obj2) {
                        return pib.m21183P3(appealPostData, (List) obj2);
                    }
                });
            }
        };
        return ((c) v9jVar.call()).flatMap(new w9j() { // from class: l.dcb
            public final Object call(Object obj) {
                return pib.m21296r5(w9jVar, list, (AppealPostData) obj);
            }
        }).compose(mkd0.Q()).flatMap(new w9j() { // from class: l.bcb
            public final Object call(Object obj) {
                return this.f8814a.m21432a9(appealPostData, (AppealPostData) obj);
            }
        });
    }

    /* JADX INFO: renamed from: z7 */
    public boolean m21528z7() {
        return ((Boolean) this.f18905W.e()).booleanValue();
    }

    /* JADX INFO: renamed from: z8 */
    public final /* synthetic */ void m21529z8(Envelope envelope) {
        gl5.d.put(envelope.getModuleData(CoreData.class).avatar);
        m21417W9(this.f18754B1);
    }

    /* JADX INFO: renamed from: z9 */
    public c<SettingGroups> m21530z9(UserLiveSettings userLiveSettings) {
        SettingGroups settingGroups = new SettingGroups();
        settingGroups.live = userLiveSettings;
        final UserSettingPatch userSettingPatch = new UserSettingPatch();
        userSettingPatch.settingGroups = settingGroups;
        userSettingPatch.type = CameraSticker.CATEGORY_DEFAULT_FILTER;
        return m21394Q7(new v9j() { // from class: l.dib
            public final Object call() {
                return C0154a.f3483P.auth().q(C0154a.m3216c2()).k(utc0.create(Network.JSON, userSettingPatch.toJson())).b();
            }
        }, -1, "patch_live_settings");
    }

    /* JADX INFO: renamed from: za */
    public c<Boolean> m21531za(String str) {
        if (TextUtils.isEmpty(str)) {
            return c.just(Boolean.FALSE);
        }
        final String str2 = "/users/" + ((DbObject) this.f18857Q.f3628e0.m21490p9()).id + "/marriage-conversation/" + str;
        return this.f18857Q.scheduled(str2, -1, new v9j() { // from class: l.ufb
            public final Object call() {
                return this.f23523a.m21436b9(str2);
            }
        });
    }

    /* JADX INFO: renamed from: P7 */
    public final void m21390P7() {
    }
}
