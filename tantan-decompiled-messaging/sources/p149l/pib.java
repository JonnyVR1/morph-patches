package p149l;

import android.app.Application;
import android.graphics.Bitmap;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.clevertap.android.sdk.Constants;
import com.google.common.base.Optional;
import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.android.app.App;
import com.p046p1.mobile.putong.api.api.Network;
import com.p046p1.mobile.putong.api.api.TantanException;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.C4728a;
import com.p046p1.mobile.putong.core.api.C4732c;
import com.p046p1.mobile.putong.core.data.AppealInfo;
import com.p046p1.mobile.putong.core.data.BreakIce;
import com.p046p1.mobile.putong.core.data.ChatPartnerScene;
import com.p046p1.mobile.putong.core.data.CoreData;
import com.p046p1.mobile.putong.core.data.FakeGuideData;
import com.p046p1.mobile.putong.core.data.GPTopicCard;
import com.p046p1.mobile.putong.core.data.GPTopicCardEnvelop;
import com.p046p1.mobile.putong.core.data.IceBreakQuestion;
import com.p046p1.mobile.putong.core.data.IdealInfo;
import com.p046p1.mobile.putong.core.data.Literatures;
import com.p046p1.mobile.putong.core.data.LiteraturesComments;
import com.p046p1.mobile.putong.core.data.LoveLetterContent;
import com.p046p1.mobile.putong.core.data.LoveLetterEntryInfo;
import com.p046p1.mobile.putong.core.data.MarriageGuide;
import com.p046p1.mobile.putong.core.data.MatchInfo;
import com.p046p1.mobile.putong.core.data.MyTabTask;
import com.p046p1.mobile.putong.core.data.NewTags;
import com.p046p1.mobile.putong.core.data.ProfileCountInfo;
import com.p046p1.mobile.putong.core.data.RealFeelInfo;
import com.p046p1.mobile.putong.core.data.RealPicturesInfo;
import com.p046p1.mobile.putong.core.data.Reason;
import com.p046p1.mobile.putong.core.data.RegionRule;
import com.p046p1.mobile.putong.core.data.RegionRulesEnvelop;
import com.p046p1.mobile.putong.core.data.UrlTag;
import com.p046p1.mobile.putong.core.data.UserFeedbackInfo;
import com.p046p1.mobile.putong.core.data.UserHomeMode;
import com.p046p1.mobile.putong.core.data.VerificationCenter;
import com.p046p1.mobile.putong.core.data.WechatNotifySetting;
import com.p046p1.mobile.putong.data.AppealPostData;
import com.p046p1.mobile.putong.data.CommonData;
import com.p046p1.mobile.putong.data.Contact;
import com.p046p1.mobile.putong.data.ConversationStatus;
import com.p046p1.mobile.putong.data.Converter;
import com.p046p1.mobile.putong.data.Counter;
import com.p046p1.mobile.putong.data.CurrencyTypeData;
import com.p046p1.mobile.putong.data.CurrencyTypeEnvelop;
import com.p046p1.mobile.putong.data.Dimension;
import com.p046p1.mobile.putong.data.Envelope;
import com.p046p1.mobile.putong.data.Extensions;
import com.p046p1.mobile.putong.data.GPMemo;
import com.p046p1.mobile.putong.data.GPMemoEnvelope;
import com.p046p1.mobile.putong.data.IdealTag;
import com.p046p1.mobile.putong.data.LiveRegionTag;
import com.p046p1.mobile.putong.data.MatchFrom;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.Meta;
import com.p046p1.mobile.putong.data.MomentFeedPushArgs;
import com.p046p1.mobile.putong.data.PartialIdList;
import com.p046p1.mobile.putong.data.Passby;
import com.p046p1.mobile.putong.data.Picture;
import com.p046p1.mobile.putong.data.Profile;
import com.p046p1.mobile.putong.data.ProfileExtensionBasic;
import com.p046p1.mobile.putong.data.Relationship;
import com.p046p1.mobile.putong.data.Report;
import com.p046p1.mobile.putong.data.SettingGroups;
import com.p046p1.mobile.putong.data.Settings;
import com.p046p1.mobile.putong.data.StudentVerificationStatus;
import com.p046p1.mobile.putong.data.TribeSetting;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.UserLiveSettings;
import com.p046p1.mobile.putong.data.UserPrivacySettings;
import com.p046p1.mobile.putong.data.UserPushSettings;
import com.p046p1.mobile.putong.data.UserSettingPatch;
import com.p046p1.mobile.putong.data.UserStatus;
import com.p046p1.mobile.putong.data.UserSubscriptionSettings;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.p065ui.DialogAct;
import com.tantan.core.base.R$string;
import com.tantanapp.common.data.ProtobufAdapter;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import com.tencent.youtu.sdkkitframework.common.WeJson;
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
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p133rx.C22306c;
import p133rx.subjects.C22392a;
import p133rx.subjects.C22393b;

/* JADX INFO: loaded from: classes9.dex */
public class pib extends C4728a {

    /* JADX INFO: renamed from: A0 */
    public C22392a<MomentFeedPushArgs> f149134A0;

    /* JADX INFO: renamed from: A1 */
    public zpd0 f149135A1;

    /* JADX INFO: renamed from: A2 */
    public tpd0 f149136A2;

    /* JADX INFO: renamed from: A3 */
    public hpd0 f149137A3;

    /* JADX INFO: renamed from: A4 */
    public hpd0 f149138A4;

    /* JADX INFO: renamed from: A5 */
    public zpd0 f149139A5;

    /* JADX INFO: renamed from: A6 */
    public hpd0 f149140A6;

    /* JADX INFO: renamed from: B0 */
    public xaj0<String, String, Integer> f149141B0;

    /* JADX INFO: renamed from: B1 */
    public String f149142B1;

    /* JADX INFO: renamed from: B2 */
    public tpd0 f149143B2;

    /* JADX INFO: renamed from: B3 */
    public hpd0 f149144B3;

    /* JADX INFO: renamed from: B4 */
    public hpd0 f149145B4;

    /* JADX INFO: renamed from: B5 */
    public tpd0 f149146B5;

    /* JADX INFO: renamed from: B6 */
    public hpd0 f149147B6;

    /* JADX INFO: renamed from: C0 */
    public C22392a<AppealInfo> f149148C0;

    /* JADX INFO: renamed from: C1 */
    public hpd0 f149149C1;

    /* JADX INFO: renamed from: C2 */
    public tpd0 f149150C2;

    /* JADX INFO: renamed from: C3 */
    public uqd0 f149151C3;

    /* JADX INFO: renamed from: C4 */
    public zpd0 f149152C4;

    /* JADX INFO: renamed from: C5 */
    public zpd0 f149153C5;

    /* JADX INFO: renamed from: C6 */
    public hpd0 f149154C6;

    /* JADX INFO: renamed from: D0 */
    public C22392a<AppealInfo> f149155D0;

    /* JADX INFO: renamed from: D1 */
    public hpd0 f149156D1;

    /* JADX INFO: renamed from: D2 */
    public tpd0 f149157D2;

    /* JADX INFO: renamed from: D3 */
    public uqd0 f149158D3;

    /* JADX INFO: renamed from: D4 */
    public hpd0 f149159D4;

    /* JADX INFO: renamed from: D5 */
    public zpd0 f149160D5;

    /* JADX INFO: renamed from: D6 */
    public hpd0 f149161D6;

    /* JADX INFO: renamed from: E0 */
    public C22392a<roj0> f149162E0;

    /* JADX INFO: renamed from: E1 */
    public C22393b<Boolean> f149163E1;

    /* JADX INFO: renamed from: E2 */
    public hpd0 f149164E2;

    /* JADX INFO: renamed from: E3 */
    public uqd0 f149165E3;

    /* JADX INFO: renamed from: E4 */
    public hpd0 f149166E4;

    /* JADX INFO: renamed from: E5 */
    public tpd0 f149167E5;

    /* JADX INFO: renamed from: E6 */
    public uqd0 f149168E6;

    /* JADX INFO: renamed from: F0 */
    public C22392a<roj0> f149169F0;

    /* JADX INFO: renamed from: F1 */
    public C22393b<roj0> f149170F1;

    /* JADX INFO: renamed from: F2 */
    public hpd0 f149171F2;

    /* JADX INFO: renamed from: F3 */
    public tpd0 f149172F3;

    /* JADX INFO: renamed from: F4 */
    public hpd0 f149173F4;

    /* JADX INFO: renamed from: F5 */
    public zpd0 f149174F5;

    /* JADX INFO: renamed from: F6 */
    public tpd0 f149175F6;

    /* JADX INFO: renamed from: G0 */
    public tpd0 f149176G0;

    /* JADX INFO: renamed from: G1 */
    public C22392a<roj0> f149177G1;

    /* JADX INFO: renamed from: G2 */
    public uqd0 f149178G2;

    /* JADX INFO: renamed from: G3 */
    public tpd0 f149179G3;

    /* JADX INFO: renamed from: G4 */
    public zpd0 f149180G4;

    /* JADX INFO: renamed from: G5 */
    public hpd0 f149181G5;

    /* JADX INFO: renamed from: G6 */
    public hpd0 f149182G6;

    /* JADX INFO: renamed from: H0 */
    public tpd0 f149183H0;

    /* JADX INFO: renamed from: H1 */
    public C22393b<String> f149184H1;

    /* JADX INFO: renamed from: H2 */
    public zpd0 f149185H2;

    /* JADX INFO: renamed from: H3 */
    public hpd0 f149186H3;

    /* JADX INFO: renamed from: H4 */
    public tpd0 f149187H4;

    /* JADX INFO: renamed from: H6 */
    public hpd0 f149188H6;

    /* JADX INFO: renamed from: I0 */
    public zpd0 f149189I0;

    /* JADX INFO: renamed from: I1 */
    public C22392a<Boolean> f149190I1;

    /* JADX INFO: renamed from: I2 */
    public zpd0 f149191I2;

    /* JADX INFO: renamed from: I3 */
    public hpd0 f149192I3;

    /* JADX INFO: renamed from: I4 */
    public hpd0 f149193I4;

    /* JADX INFO: renamed from: I5 */
    public uqd0 f149194I5;

    /* JADX INFO: renamed from: I6 */
    public zpd0 f149195I6;

    /* JADX INFO: renamed from: J0 */
    public vqd0 f149196J0;

    /* JADX INFO: renamed from: J1 */
    public C22393b<String> f149197J1;

    /* JADX INFO: renamed from: J2 */
    public hpd0 f149198J2;

    /* JADX INFO: renamed from: J3 */
    public uqd0 f149199J3;

    /* JADX INFO: renamed from: J4 */
    public tpd0 f149200J4;

    /* JADX INFO: renamed from: J5 */
    public uqd0 f149201J5;

    /* JADX INFO: renamed from: J6 */
    public hpd0 f149202J6;

    /* JADX INFO: renamed from: K0 */
    public hpd0 f149203K0;

    /* JADX INFO: renamed from: K1 */
    public C22392a<Optional<WechatNotifySetting>> f149204K1;

    /* JADX INFO: renamed from: K2 */
    public hpd0 f149205K2;

    /* JADX INFO: renamed from: K3 */
    public zpd0 f149206K3;

    /* JADX INFO: renamed from: K4 */
    public zpd0 f149207K4;

    /* JADX INFO: renamed from: K5 */
    public uqd0 f149208K5;

    /* JADX INFO: renamed from: K6 */
    public hpd0 f149209K6;

    /* JADX INFO: renamed from: L0 */
    public hpd0 f149210L0;

    /* JADX INFO: renamed from: L1 */
    public C22392a<Optional<WechatNotifySetting>> f149211L1;

    /* JADX INFO: renamed from: L2 */
    public tpd0 f149212L2;

    /* JADX INFO: renamed from: L3 */
    public tpd0 f149213L3;

    /* JADX INFO: renamed from: L4 */
    public hpd0 f149214L4;

    /* JADX INFO: renamed from: L5 */
    public hpd0 f149215L5;

    /* JADX INFO: renamed from: L6 */
    public hpd0 f149216L6;

    /* JADX INFO: renamed from: M0 */
    public C22392a<roj0> f149217M0;

    /* JADX INFO: renamed from: M1 */
    public tpd0 f149218M1;

    /* JADX INFO: renamed from: M2 */
    public zpd0 f149219M2;

    /* JADX INFO: renamed from: M3 */
    public zpd0 f149220M3;

    /* JADX INFO: renamed from: M4 */
    public tpd0 f149221M4;

    /* JADX INFO: renamed from: M5 */
    public hpd0 f149222M5;

    /* JADX INFO: renamed from: M6 */
    public hpd0 f149223M6;

    /* JADX INFO: renamed from: N0 */
    public zpd0 f149224N0;

    /* JADX INFO: renamed from: N1 */
    public hpd0 f149225N1;

    /* JADX INFO: renamed from: N2 */
    public hpd0 f149226N2;

    /* JADX INFO: renamed from: N3 */
    public C22393b<roj0> f149227N3;

    /* JADX INFO: renamed from: N4 */
    public hpd0 f149228N4;

    /* JADX INFO: renamed from: N5 */
    public hpd0 f149229N5;

    /* JADX INFO: renamed from: N6 */
    public zpd0 f149230N6;

    /* JADX INFO: renamed from: O0 */
    public zpd0 f149231O0;

    /* JADX INFO: renamed from: O1 */
    public hpd0 f149232O1;

    /* JADX INFO: renamed from: O2 */
    public hpd0 f149233O2;

    /* JADX INFO: renamed from: O3 */
    public hpd0 f149234O3;

    /* JADX INFO: renamed from: O4 */
    public zpd0 f149235O4;

    /* JADX INFO: renamed from: O5 */
    public tpd0 f149236O5;

    /* JADX INFO: renamed from: O6 */
    public zpd0 f149237O6;

    /* JADX INFO: renamed from: P0 */
    public zpd0 f149238P0;

    /* JADX INFO: renamed from: P1 */
    public hpd0 f149239P1;

    /* JADX INFO: renamed from: P2 */
    public hpd0 f149240P2;

    /* JADX INFO: renamed from: P3 */
    public tpd0 f149241P3;

    /* JADX INFO: renamed from: P4 */
    public zpd0 f149242P4;

    /* JADX INFO: renamed from: P5 */
    public zpd0 f149243P5;

    /* JADX INFO: renamed from: P6 */
    public Map<String, String> f149244P6;

    /* JADX INFO: renamed from: Q */
    public final C4732c f149245Q;

    /* JADX INFO: renamed from: Q0 */
    public zpd0 f149246Q0;

    /* JADX INFO: renamed from: Q1 */
    public zpd0 f149247Q1;

    /* JADX INFO: renamed from: Q2 */
    public zpd0 f149248Q2;

    /* JADX INFO: renamed from: Q3 */
    public tpd0 f149249Q3;

    /* JADX INFO: renamed from: Q4 */
    public zpd0 f149250Q4;

    /* JADX INFO: renamed from: Q5 */
    public zpd0 f149251Q5;

    /* JADX INFO: renamed from: Q6 */
    public HashMap<String, List<LiteraturesComments>> f149252Q6;

    /* JADX INFO: renamed from: R */
    public final eqd0 f149253R;

    /* JADX INFO: renamed from: R0 */
    public zpd0 f149254R0;

    /* JADX INFO: renamed from: R1 */
    public C22392a<roj0> f149255R1;

    /* JADX INFO: renamed from: R2 */
    public zpd0 f149256R2;

    /* JADX INFO: renamed from: R3 */
    public uqd0 f149257R3;

    /* JADX INFO: renamed from: R4 */
    public tpd0 f149258R4;

    /* JADX INFO: renamed from: R5 */
    public zpd0 f149259R5;

    /* JADX INFO: renamed from: R6 */
    public HashMap<String, Literatures> f149260R6;

    /* JADX INFO: renamed from: S */
    public final hpd0 f149261S;

    /* JADX INFO: renamed from: S0 */
    public hpd0 f149262S0;

    /* JADX INFO: renamed from: S1 */
    public C22392a<roj0> f149263S1;

    /* JADX INFO: renamed from: S2 */
    public uqd0 f149264S2;

    /* JADX INFO: renamed from: S3 */
    public hpd0 f149265S3;

    /* JADX INFO: renamed from: S4 */
    public zpd0 f149266S4;

    /* JADX INFO: renamed from: S5 */
    public tpd0 f149267S5;

    /* JADX INFO: renamed from: S6 */
    public ConcurrentHashMap<String, NewTags> f149268S6;

    /* JADX INFO: renamed from: T */
    public tpd0 f149269T;

    /* JADX INFO: renamed from: T0 */
    public tpd0 f149270T0;

    /* JADX INFO: renamed from: T1 */
    public C22392a<roj0> f149271T1;

    /* JADX INFO: renamed from: T2 */
    public zpd0 f149272T2;

    /* JADX INFO: renamed from: T3 */
    public tpd0 f149273T3;

    /* JADX INFO: renamed from: T4 */
    public tpd0 f149274T4;

    /* JADX INFO: renamed from: T5 */
    public tpd0 f149275T5;

    /* JADX INFO: renamed from: T6 */
    public LinkedHashMap<String, NewTags> f149276T6;

    /* JADX INFO: renamed from: U */
    public C22392a<roj0> f149277U;

    /* JADX INFO: renamed from: U0 */
    public tpd0 f149278U0;

    /* JADX INFO: renamed from: U1 */
    public C22392a<LoveLetterEntryInfo> f149279U1;

    /* JADX INFO: renamed from: U2 */
    public zpd0 f149280U2;

    /* JADX INFO: renamed from: U3 */
    public uqd0 f149281U3;

    /* JADX INFO: renamed from: U4 */
    public hpd0 f149282U4;

    /* JADX INFO: renamed from: U5 */
    public tpd0 f149283U5;

    /* JADX INFO: renamed from: U6 */
    public Set<String> f149284U6;

    /* JADX INFO: renamed from: V */
    public C22392a<String> f149285V;

    /* JADX INFO: renamed from: V0 */
    public tpd0 f149286V0;

    /* JADX INFO: renamed from: V1 */
    public tpd0 f149287V1;

    /* JADX INFO: renamed from: V2 */
    public hpd0 f149288V2;

    /* JADX INFO: renamed from: V3 */
    public zpd0 f149289V3;

    /* JADX INFO: renamed from: V4 */
    public hpd0 f149290V4;

    /* JADX INFO: renamed from: V5 */
    public tpd0 f149291V5;

    /* JADX INFO: renamed from: V6 */
    public C22392a<FakeGuideData> f149292V6;

    /* JADX INFO: renamed from: W */
    public C22392a<Boolean> f149293W;

    /* JADX INFO: renamed from: W0 */
    public hpd0 f149294W0;

    /* JADX INFO: renamed from: W1 */
    public uqd0 f149295W1;

    /* JADX INFO: renamed from: W2 */
    public uqd0 f149296W2;

    /* JADX INFO: renamed from: W3 */
    public tpd0 f149297W3;

    /* JADX INFO: renamed from: W4 */
    public zpd0 f149298W4;

    /* JADX INFO: renamed from: W5 */
    public zpd0 f149299W5;

    /* JADX INFO: renamed from: W6 */
    public UserFeedbackInfo f149300W6;

    /* JADX INFO: renamed from: X */
    public zpd0 f149301X;

    /* JADX INFO: renamed from: X0 */
    public hpd0 f149302X0;

    /* JADX INFO: renamed from: X1 */
    public hpd0 f149303X1;

    /* JADX INFO: renamed from: X2 */
    public hpd0 f149304X2;

    /* JADX INFO: renamed from: X3 */
    public zpd0 f149305X3;

    /* JADX INFO: renamed from: X4 */
    public tpd0 f149306X4;

    /* JADX INFO: renamed from: X5 */
    public tpd0 f149307X5;

    /* JADX INFO: renamed from: X6 */
    public String f149308X6;

    /* JADX INFO: renamed from: Y */
    public tpd0 f149309Y;

    /* JADX INFO: renamed from: Y0 */
    public C22392a<Boolean> f149310Y0;

    /* JADX INFO: renamed from: Y1 */
    public C22392a<roj0> f149311Y1;

    /* JADX INFO: renamed from: Y2 */
    public hpd0 f149312Y2;

    /* JADX INFO: renamed from: Y3 */
    public tpd0 f149313Y3;

    /* JADX INFO: renamed from: Y4 */
    public hpd0 f149314Y4;

    /* JADX INFO: renamed from: Y5 */
    public uqd0 f149315Y5;

    /* JADX INFO: renamed from: Y6 */
    public boolean f149316Y6;

    /* JADX INFO: renamed from: Z */
    public zpd0 f149317Z;

    /* JADX INFO: renamed from: Z0 */
    public hpd0 f149318Z0;

    /* JADX INFO: renamed from: Z1 */
    public tpd0 f149319Z1;

    /* JADX INFO: renamed from: Z2 */
    public hpd0 f149320Z2;

    /* JADX INFO: renamed from: Z3 */
    public uqd0 f149321Z3;

    /* JADX INFO: renamed from: Z4 */
    public zpd0 f149322Z4;

    /* JADX INFO: renamed from: Z5 */
    public tpd0 f149323Z5;

    /* JADX INFO: renamed from: Z6 */
    public boolean f149324Z6;

    /* JADX INFO: renamed from: a0 */
    public uqd0 f149325a0;

    /* JADX INFO: renamed from: a1 */
    public hpd0 f149326a1;

    /* JADX INFO: renamed from: a2 */
    public zpd0 f149327a2;

    /* JADX INFO: renamed from: a3 */
    public hpd0 f149328a3;

    /* JADX INFO: renamed from: a4 */
    public hpd0 f149329a4;

    /* JADX INFO: renamed from: a5 */
    public tpd0 f149330a5;

    /* JADX INFO: renamed from: a6 */
    public tpd0 f149331a6;

    /* JADX INFO: renamed from: a7 */
    public boolean f149332a7;

    /* JADX INFO: renamed from: b0 */
    public hpd0 f149333b0;

    /* JADX INFO: renamed from: b1 */
    public C22392a<Integer> f149334b1;

    /* JADX INFO: renamed from: b2 */
    public zpd0 f149335b2;

    /* JADX INFO: renamed from: b3 */
    public hpd0 f149336b3;

    /* JADX INFO: renamed from: b4 */
    public hpd0 f149337b4;

    /* JADX INFO: renamed from: b5 */
    public hpd0 f149338b5;

    /* JADX INFO: renamed from: b6 */
    public zpd0 f149339b6;

    /* JADX INFO: renamed from: b7 */
    public C22392a<List<ProfileCountInfo>> f149340b7;

    /* JADX INFO: renamed from: c0 */
    public hpd0 f149341c0;

    /* JADX INFO: renamed from: c1 */
    public hpd0 f149342c1;

    /* JADX INFO: renamed from: c2 */
    public hpd0 f149343c2;

    /* JADX INFO: renamed from: c3 */
    public hpd0 f149344c3;

    /* JADX INFO: renamed from: c4 */
    public hpd0 f149345c4;

    /* JADX INFO: renamed from: c5 */
    public hpd0 f149346c5;

    /* JADX INFO: renamed from: c6 */
    public zpd0 f149347c6;

    /* JADX INFO: renamed from: c7 */
    public C22393b<roj0> f149348c7;

    /* JADX INFO: renamed from: d0 */
    public hpd0 f149349d0;

    /* JADX INFO: renamed from: d1 */
    public hpd0 f149350d1;

    /* JADX INFO: renamed from: d2 */
    public hpd0 f149351d2;

    /* JADX INFO: renamed from: d3 */
    public uqd0 f149352d3;

    /* JADX INFO: renamed from: d4 */
    public hpd0 f149353d4;

    /* JADX INFO: renamed from: d5 */
    public hpd0 f149354d5;

    /* JADX INFO: renamed from: d6 */
    public uqd0 f149355d6;

    /* JADX INFO: renamed from: d7 */
    public C22393b<Integer> f149356d7;

    /* JADX INFO: renamed from: e0 */
    public hpd0 f149357e0;

    /* JADX INFO: renamed from: e1 */
    public hpd0 f149358e1;

    /* JADX INFO: renamed from: e2 */
    public hpd0 f149359e2;

    /* JADX INFO: renamed from: e3 */
    public uqd0 f149360e3;

    /* JADX INFO: renamed from: e4 */
    public hpd0 f149361e4;

    /* JADX INFO: renamed from: e5 */
    public boolean f149362e5;

    /* JADX INFO: renamed from: e6 */
    public uqd0 f149363e6;

    /* JADX INFO: renamed from: e7 */
    public final C19232l f149364e7;

    /* JADX INFO: renamed from: f0 */
    public hpd0 f149365f0;

    /* JADX INFO: renamed from: f1 */
    public uqd0 f149366f1;

    /* JADX INFO: renamed from: f2 */
    public uqd0 f149367f2;

    /* JADX INFO: renamed from: f3 */
    public long f149368f3;

    /* JADX INFO: renamed from: f4 */
    public hpd0 f149369f4;

    /* JADX INFO: renamed from: f5 */
    public boolean f149370f5;

    /* JADX INFO: renamed from: f6 */
    public uqd0 f149371f6;

    /* JADX INFO: renamed from: f7 */
    public final C19231k f149372f7;

    /* JADX INFO: renamed from: g0 */
    public ard0 f149373g0;

    /* JADX INFO: renamed from: g1 */
    public zpd0 f149374g1;

    /* JADX INFO: renamed from: g2 */
    public zpd0 f149375g2;

    /* JADX INFO: renamed from: g3 */
    public uqd0 f149376g3;

    /* JADX INFO: renamed from: g4 */
    public C22393b<String> f149377g4;

    /* JADX INFO: renamed from: g5 */
    public boolean f149378g5;

    /* JADX INFO: renamed from: g6 */
    public uqd0 f149379g6;

    /* JADX INFO: renamed from: g7 */
    public C19230j f149380g7;

    /* JADX INFO: renamed from: h0 */
    public hpd0 f149381h0;

    /* JADX INFO: renamed from: h1 */
    public hpd0 f149382h1;

    /* JADX INFO: renamed from: h2 */
    public hpd0 f149383h2;

    /* JADX INFO: renamed from: h3 */
    public tpd0 f149384h3;

    /* JADX INFO: renamed from: h4 */
    public C22393b<roj0> f149385h4;

    /* JADX INFO: renamed from: h5 */
    public hpd0 f149386h5;

    /* JADX INFO: renamed from: h6 */
    public hpd0 f149387h6;

    /* JADX INFO: renamed from: h7 */
    public boolean f149388h7;

    /* JADX INFO: renamed from: i0 */
    public tpd0 f149389i0;

    /* JADX INFO: renamed from: i1 */
    public uqd0 f149390i1;

    /* JADX INFO: renamed from: i2 */
    public uqd0 f149391i2;

    /* JADX INFO: renamed from: i3 */
    public zpd0 f149392i3;

    /* JADX INFO: renamed from: i4 */
    public uqd0 f149393i4;

    /* JADX INFO: renamed from: i5 */
    public tpd0 f149394i5;

    /* JADX INFO: renamed from: i6 */
    public tpd0 f149395i6;

    /* JADX INFO: renamed from: i7 */
    public C22392a<List<MyTabTask>> f149396i7;

    /* JADX INFO: renamed from: j0 */
    public zpd0 f149397j0;

    /* JADX INFO: renamed from: j1 */
    public tpd0 f149398j1;

    /* JADX INFO: renamed from: j2 */
    public zpd0 f149399j2;

    /* JADX INFO: renamed from: j3 */
    public long f149400j3;

    /* JADX INFO: renamed from: j4 */
    public uqd0 f149401j4;

    /* JADX INFO: renamed from: j5 */
    public zpd0 f149402j5;

    /* JADX INFO: renamed from: j6 */
    public hpd0 f149403j6;

    /* JADX INFO: renamed from: j7 */
    public C22392a<MyTabTask> f149404j7;

    /* JADX INFO: renamed from: k0 */
    public vqd0 f149405k0;

    /* JADX INFO: renamed from: k1 */
    public hpd0 f149406k1;

    /* JADX INFO: renamed from: k2 */
    public tpd0 f149407k2;

    /* JADX INFO: renamed from: k3 */
    public tpd0 f149408k3;

    /* JADX INFO: renamed from: k4 */
    public uqd0 f149409k4;

    /* JADX INFO: renamed from: k5 */
    public tpd0 f149410k5;

    /* JADX INFO: renamed from: k6 */
    public tpd0 f149411k6;

    /* JADX INFO: renamed from: k7 */
    public C22392a<MyTabTask> f149412k7;

    /* JADX INFO: renamed from: l0 */
    public zpd0 f149413l0;

    /* JADX INFO: renamed from: l1 */
    public zpd0 f149414l1;

    /* JADX INFO: renamed from: l2 */
    public tpd0 f149415l2;

    /* JADX INFO: renamed from: l3 */
    public tpd0 f149416l3;

    /* JADX INFO: renamed from: l4 */
    public uqd0 f149417l4;

    /* JADX INFO: renamed from: l5 */
    public zpd0 f149418l5;

    /* JADX INFO: renamed from: l6 */
    public uqd0 f149419l6;

    /* JADX INFO: renamed from: l7 */
    public C22392a<roj0> f149420l7;

    /* JADX INFO: renamed from: m0 */
    public zpd0 f149421m0;

    /* JADX INFO: renamed from: m1 */
    public C22392a<List<GPTopicCard>> f149422m1;

    /* JADX INFO: renamed from: m2 */
    public zpd0 f149423m2;

    /* JADX INFO: renamed from: m3 */
    public hpd0 f149424m3;

    /* JADX INFO: renamed from: m4 */
    public uqd0 f149425m4;

    /* JADX INFO: renamed from: m5 */
    public tpd0 f149426m5;

    /* JADX INFO: renamed from: m6 */
    public hpd0 f149427m6;

    /* JADX INFO: renamed from: m7 */
    public tpd0 f149428m7;

    /* JADX INFO: renamed from: n0 */
    public zpd0 f149429n0;

    /* JADX INFO: renamed from: n1 */
    public C22392a<HashMap<String, List<User>>> f149430n1;

    /* JADX INFO: renamed from: n2 */
    public zpd0 f149431n2;

    /* JADX INFO: renamed from: n3 */
    public hpd0 f149432n3;

    /* JADX INFO: renamed from: n4 */
    public hpd0 f149433n4;

    /* JADX INFO: renamed from: n5 */
    public zpd0 f149434n5;

    /* JADX INFO: renamed from: n6 */
    public hpd0 f149435n6;

    /* JADX INFO: renamed from: n7 */
    public hpd0 f149436n7;

    /* JADX INFO: renamed from: o0 */
    public vqd0 f149437o0;

    /* JADX INFO: renamed from: o1 */
    public C22392a<roj0> f149438o1;

    /* JADX INFO: renamed from: o2 */
    public tpd0 f149439o2;

    /* JADX INFO: renamed from: o3 */
    public hpd0 f149440o3;

    /* JADX INFO: renamed from: o4 */
    public uqd0 f149441o4;

    /* JADX INFO: renamed from: o5 */
    public tpd0 f149442o5;

    /* JADX INFO: renamed from: o6 */
    public hpd0 f149443o6;

    /* JADX INFO: renamed from: p0 */
    public zpd0 f149444p0;

    /* JADX INFO: renamed from: p1 */
    public zpd0 f149445p1;

    /* JADX INFO: renamed from: p2 */
    public uqd0 f149446p2;

    /* JADX INFO: renamed from: p3 */
    public vqd0 f149447p3;

    /* JADX INFO: renamed from: p4 */
    public uqd0 f149448p4;

    /* JADX INFO: renamed from: p5 */
    public tpd0 f149449p5;

    /* JADX INFO: renamed from: p6 */
    public zpd0 f149450p6;

    /* JADX INFO: renamed from: q0 */
    public vqd0 f149451q0;

    /* JADX INFO: renamed from: q1 */
    public hpd0 f149452q1;

    /* JADX INFO: renamed from: q2 */
    public hpd0 f149453q2;

    /* JADX INFO: renamed from: q3 */
    public vqd0 f149454q3;

    /* JADX INFO: renamed from: q4 */
    public tpd0 f149455q4;

    /* JADX INFO: renamed from: q5 */
    public zpd0 f149456q5;

    /* JADX INFO: renamed from: q6 */
    public zpd0 f149457q6;

    /* JADX INFO: renamed from: r0 */
    public zpd0 f149458r0;

    /* JADX INFO: renamed from: r1 */
    public hpd0 f149459r1;

    /* JADX INFO: renamed from: r2 */
    public hpd0 f149460r2;

    /* JADX INFO: renamed from: r3 */
    public tpd0 f149461r3;

    /* JADX INFO: renamed from: r4 */
    public hpd0 f149462r4;

    /* JADX INFO: renamed from: r5 */
    public zpd0 f149463r5;

    /* JADX INFO: renamed from: r6 */
    public hpd0 f149464r6;

    /* JADX INFO: renamed from: s0 */
    public vqd0 f149465s0;

    /* JADX INFO: renamed from: s1 */
    public hpd0 f149466s1;

    /* JADX INFO: renamed from: s2 */
    public hpd0 f149467s2;

    /* JADX INFO: renamed from: s3 */
    public zpd0 f149468s3;

    /* JADX INFO: renamed from: s4 */
    public zpd0 f149469s4;

    /* JADX INFO: renamed from: s5 */
    public tpd0 f149470s5;

    /* JADX INFO: renamed from: s6 */
    public uqd0 f149471s6;

    /* JADX INFO: renamed from: t0 */
    public hpd0 f149472t0;

    /* JADX INFO: renamed from: t1 */
    public hpd0 f149473t1;

    /* JADX INFO: renamed from: t2 */
    public kpd0 f149474t2;

    /* JADX INFO: renamed from: t3 */
    public uqd0 f149475t3;

    /* JADX INFO: renamed from: t4 */
    public zpd0 f149476t4;

    /* JADX INFO: renamed from: t5 */
    public hpd0 f149477t5;

    /* JADX INFO: renamed from: t6 */
    public hpd0 f149478t6;

    /* JADX INFO: renamed from: u0 */
    public hpd0 f149479u0;

    /* JADX INFO: renamed from: u1 */
    public zpd0 f149480u1;

    /* JADX INFO: renamed from: u2 */
    public hpd0 f149481u2;

    /* JADX INFO: renamed from: u3 */
    public uqd0 f149482u3;

    /* JADX INFO: renamed from: u4 */
    public tpd0 f149483u4;

    /* JADX INFO: renamed from: u5 */
    public uqd0 f149484u5;

    /* JADX INFO: renamed from: u6 */
    public C22392a<roj0> f149485u6;

    /* JADX INFO: renamed from: v0 */
    public hpd0 f149486v0;

    /* JADX INFO: renamed from: v1 */
    public hpd0 f149487v1;

    /* JADX INFO: renamed from: v2 */
    public hpd0 f149488v2;

    /* JADX INFO: renamed from: v3 */
    public hpd0 f149489v3;

    /* JADX INFO: renamed from: v4 */
    public tpd0 f149490v4;

    /* JADX INFO: renamed from: v5 */
    public tpd0 f149491v5;

    /* JADX INFO: renamed from: v6 */
    public hpd0 f149492v6;

    /* JADX INFO: renamed from: w0 */
    public hpd0 f149493w0;

    /* JADX INFO: renamed from: w1 */
    public zpd0 f149494w1;

    /* JADX INFO: renamed from: w2 */
    public hpd0 f149495w2;

    /* JADX INFO: renamed from: w3 */
    public tpd0 f149496w3;

    /* JADX INFO: renamed from: w4 */
    public hpd0 f149497w4;

    /* JADX INFO: renamed from: w5 */
    public uqd0 f149498w5;

    /* JADX INFO: renamed from: w6 */
    public hpd0 f149499w6;

    /* JADX INFO: renamed from: x0 */
    public tpd0 f149500x0;

    /* JADX INFO: renamed from: x1 */
    public zpd0 f149501x1;

    /* JADX INFO: renamed from: x2 */
    public uqd0 f149502x2;

    /* JADX INFO: renamed from: x3 */
    public zpd0 f149503x3;

    /* JADX INFO: renamed from: x4 */
    public hpd0 f149504x4;

    /* JADX INFO: renamed from: x5 */
    public tpd0 f149505x5;

    /* JADX INFO: renamed from: x6 */
    public zpd0 f149506x6;

    /* JADX INFO: renamed from: y0 */
    public hpd0 f149507y0;

    /* JADX INFO: renamed from: y1 */
    public hpd0 f149508y1;

    /* JADX INFO: renamed from: y2 */
    public zpd0 f149509y2;

    /* JADX INFO: renamed from: y3 */
    public zpd0 f149510y3;

    /* JADX INFO: renamed from: y4 */
    public tpd0 f149511y4;

    /* JADX INFO: renamed from: y5 */
    public uqd0 f149512y5;

    /* JADX INFO: renamed from: y6 */
    public hpd0 f149513y6;

    /* JADX INFO: renamed from: z0 */
    public C22392a<Boolean> f149514z0;

    /* JADX INFO: renamed from: z1 */
    public uqd0 f149515z1;

    /* JADX INFO: renamed from: z2 */
    public tpd0 f149516z2;

    /* JADX INFO: renamed from: z3 */
    public hpd0 f149517z3;

    /* JADX INFO: renamed from: z4 */
    public hpd0 f149518z4;

    /* JADX INFO: renamed from: z5 */
    public tpd0 f149519z5;

    /* JADX INFO: renamed from: z6 */
    public hpd0 f149520z6;

    /* JADX INFO: renamed from: l.pib$a */
    public class C19221a implements w9j<Envelope, Boolean> {
        public C19221a() {
        }

        @Override // p149l.w9j
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean call(Envelope envelope) {
            int i = envelope.meta.code;
            return (i == 200 || i == 201) ? Boolean.TRUE : Boolean.FALSE;
        }
    }

    /* JADX INFO: renamed from: l.pib$b */
    public class C19222b implements v9j<C22306c<Envelope>> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f149522a;

        /* JADX INFO: renamed from: l.pib$b$a */
        public class a implements v9j<stc0> {
            public a() {
            }

            @Override // p149l.v9j, java.util.concurrent.Callable
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public stc0 call() {
                return C4728a.f19494P.auth().m185898q(C4728a.m31366w2(C19222b.this.f149522a)).m185887f().m185883b();
            }
        }

        public C19222b(String str) {
            this.f149522a = str;
        }

        @Override // p149l.v9j, java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public C22306c<Envelope> call() {
            return ia20.m135121e(new a()).compose(mkd0.m154951C());
        }
    }

    /* JADX INFO: renamed from: l.pib$c */
    public class C19223c implements v9j<C22306c<Envelope>> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f149525a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ utc0 f149526b;

        /* JADX INFO: renamed from: l.pib$c$a */
        public class a implements v9j<stc0> {
            public a() {
            }

            @Override // p149l.v9j, java.util.concurrent.Callable
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public stc0 call() {
                return C4728a.f19494P.auth().m185898q(C19223c.this.f149525a).m185893l(C19223c.this.f149526b).m185883b();
            }
        }

        public C19223c(String str, utc0 utc0Var) {
            this.f149525a = str;
            this.f149526b = utc0Var;
        }

        @Override // p149l.v9j, java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public C22306c<Envelope> call() {
            return ia20.m135121e(new a()).observeOn(jo0.m142408a());
        }
    }

    /* JADX INFO: renamed from: l.pib$d */
    public class C19224d implements v9j<stc0> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f149529a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ utc0 f149530b;

        public C19224d(String str, utc0 utc0Var) {
            this.f149529a = str;
            this.f149530b = utc0Var;
        }

        @Override // p149l.v9j, java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public stc0 call() {
            return C4728a.f19494P.auth().m185898q(this.f149529a).m185893l(this.f149530b).m185883b();
        }
    }

    /* JADX INFO: renamed from: l.pib$e */
    public class C19225e implements w9j<UserFeedbackInfo, UserFeedbackInfo> {
        public C19225e() {
        }

        @Override // p149l.w9j
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public UserFeedbackInfo call(UserFeedbackInfo userFeedbackInfo) {
            CoreModule.f17545c.f19639e0.f149300W6 = userFeedbackInfo;
            return userFeedbackInfo;
        }
    }

    /* JADX INFO: renamed from: l.pib$f */
    public class C19226f implements w9j<Envelope, UserFeedbackInfo> {
        public C19226f() {
        }

        @Override // p149l.w9j
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public UserFeedbackInfo call(Envelope envelope) {
            return ((CoreData) envelope.getModuleData(CoreData.class)).userFeedbackInfo;
        }
    }

    /* JADX INFO: renamed from: l.pib$g */
    public class C19227g implements w9j<UserFeedbackInfo, UserFeedbackInfo> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f149534a;

        public C19227g(String str) {
            this.f149534a = str;
        }

        @Override // p149l.w9j
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public UserFeedbackInfo call(UserFeedbackInfo userFeedbackInfo) {
            if (!TextUtils.equals(this.f149534a, "ai_manual")) {
                CoreModule.f17545c.f19639e0.f149300W6 = userFeedbackInfo;
                return userFeedbackInfo;
            }
            if (userFeedbackInfo.isGetFeedBackAI) {
                CoreModule.f17545c.f19639e0.m169454W9(CoreModule.m29931H().userId());
            }
            return userFeedbackInfo;
        }
    }

    /* JADX INFO: renamed from: l.pib$h */
    public class C19228h implements w9j<Envelope, UserFeedbackInfo> {
        public C19228h() {
        }

        @Override // p149l.w9j
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public UserFeedbackInfo call(Envelope envelope) {
            return ((CoreData) envelope.getModuleData(CoreData.class)).userFeedbackInfo;
        }
    }

    /* JADX INFO: renamed from: l.pib$i */
    public class C19229i implements w9j<Envelope, roj0> {
        public C19229i() {
        }

        @Override // p149l.w9j
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public roj0 call(Envelope envelope) {
            return roj0.f160388a;
        }
    }

    /* JADX INFO: renamed from: l.pib$j */
    public static class C19230j extends fgf0<Map<String, GPMemo>> {
        public C19230j(pib pibVar) {
            super("gpMemos", new ggi(new qnd("gp_memos", "_v3", CoreModule.m29931H().userId()), -1, ProtobufAdapter.HASH_MAP_ADAPTER(new w9j() { // from class: l.qib
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((GPMemo) obj).userId;
                }
            }, GPMemo.PROTOBUF_ADAPTER)), new v9j() { // from class: l.rib
                @Override // p149l.v9j, java.util.concurrent.Callable
                public final Object call() {
                    return ia20.m135119c(new v9j() { // from class: l.sib
                        @Override // p149l.v9j, java.util.concurrent.Callable
                        public final Object call() {
                            return C4728a.f19494P.auth().m185898q(C4728a.m31366w2("/" + CoreModule.m29931H().userId() + "/memos")).m185887f().m185883b();
                        }
                    }, GPMemoEnvelope.JSON_ADAPTER).map(new w9j() { // from class: l.tib
                        @Override // p149l.w9j
                        public final Object call(Object obj) {
                            return ((GPMemoEnvelope) obj).data.memos;
                        }
                    }).flatMap(new na8()).toMap(new w9j() { // from class: l.uib
                        @Override // p149l.w9j
                        public final Object call(Object obj) {
                            return ((GPMemo) obj).userId;
                        }
                    });
                }
            });
        }
    }

    /* JADX INFO: renamed from: l.pib$k */
    public static class C19231k extends fgf0<CurrencyTypeData> {
        public C19231k() {
            super("currencyType", new ggi(new qnd("intl_currency_type", "_1", "_" + CoreModule.m29931H().userId()), -1, CurrencyTypeData.PROTOBUF_ADAPTER), new v9j() { // from class: l.vib
                @Override // p149l.v9j, java.util.concurrent.Callable
                public final Object call() {
                    return ia20.m135119c(new v9j() { // from class: l.wib
                        @Override // p149l.v9j, java.util.concurrent.Callable
                        public final Object call() {
                            return C4728a.f19494P.auth().m185898q(C4728a.m31200G("/intl-currency-switch")).m185887f().m185883b();
                        }
                    }, CurrencyTypeEnvelop.JSON_ADAPTER).map(new w9j() { // from class: l.xib
                        @Override // p149l.w9j
                        public final Object call(Object obj) {
                            return pib.C19231k.m169585B((CurrencyTypeEnvelop) obj);
                        }
                    });
                }
            });
        }

        /* JADX INFO: renamed from: B */
        public static /* synthetic */ CurrencyTypeData m169585B(CurrencyTypeEnvelop currencyTypeEnvelop) {
            String str = currencyTypeEnvelop.data.currencyType;
            qib0.f154686D0 = str;
            CoreModule.f17545c.f19639e0.f149419l6.put(str);
            hfw.m130790a("[putong-common][currency_type]", "current currency type = " + str);
            return currencyTypeEnvelop.data;
        }
    }

    /* JADX INFO: renamed from: l.pib$l */
    public static class C19232l extends fgf0<RegionRule> {
        public C19232l() {
            super("regionRules", new ggi(new qnd("region_rule", "_2", "_" + CoreModule.m29931H().userId()), -1, RegionRule.PROTOBUF_ADAPTER), new v9j() { // from class: l.yib
                @Override // p149l.v9j, java.util.concurrent.Callable
                public final Object call() {
                    return ia20.m135119c(new v9j() { // from class: l.zib
                        @Override // p149l.v9j, java.util.concurrent.Callable
                        public final Object call() {
                            return C4728a.f19494P.auth().m185898q(C4728a.m31362v2("me/region-rules")).m185887f().m185883b();
                        }
                    }, RegionRulesEnvelop.JSON_ADAPTER).map(new w9j() { // from class: l.ajb
                        @Override // p149l.w9j
                        public final Object call(Object obj) {
                            return pib.C19232l.m169589C((RegionRulesEnvelop) obj);
                        }
                    });
                }
            });
        }

        /* JADX INFO: renamed from: C */
        public static /* synthetic */ RegionRule m169589C(RegionRulesEnvelop regionRulesEnvelop) {
            RegionRule regionRule = regionRulesEnvelop.data.regionRules.get(0);
            LiveRegionTag liveRegionTag = regionRule.liveRegionTag;
            qib0.f154719h0 = liveRegionTag;
            CoreModule.f17545c.f19639e0.f149325a0.put(liveRegionTag.toString());
            hfw.m130790a("[putong-common][regiontag]", "current live region tag = " + regionRule.liveRegionTag.toString());
            return regionRule;
        }
    }

    public pib(C4732c c4732c, String str) {
        super(c4732c);
        this.f149334b1 = C22392a.m221513c(0);
        this.f149163E1 = C22393b.m221521b();
        this.f149170F1 = C22393b.m221521b();
        this.f149177G1 = C22392a.m221512b();
        this.f149184H1 = C22393b.m221521b();
        Boolean bool = Boolean.TRUE;
        this.f149190I1 = C22392a.m221513c(bool);
        this.f149197J1 = C22393b.m221521b();
        this.f149204K1 = C22392a.m221512b();
        this.f149211L1 = C22392a.m221512b();
        this.f149255R1 = C22392a.m221512b();
        this.f149263S1 = C22392a.m221512b();
        roj0 roj0Var = roj0.f160388a;
        this.f149271T1 = C22392a.m221513c(roj0Var);
        this.f149279U1 = C22392a.m221512b();
        this.f149287V1 = new tpd0("maxAdmobNum" + CoreModule.m29931H().userId(), -1);
        this.f149295W1 = new uqd0("showProfileAdTime" + CoreModule.m29931H().userId(), "");
        this.f149311Y1 = C22392a.m221512b();
        this.f149368f3 = 0L;
        this.f149400j3 = 0L;
        this.f149408k3 = new tpd0("bottombarLocationOnScreenY", 0);
        this.f149416l3 = new tpd0("messageAllSortLayoutLocationOnScreenY", 0);
        this.f149227N3 = C22393b.m221521b();
        this.f149377g4 = C22393b.m221521b();
        this.f149385h4 = C22393b.m221521b();
        this.f149362e5 = false;
        this.f149370f5 = false;
        this.f149378g5 = false;
        this.f149485u6 = C22392a.m221512b();
        this.f149244P6 = new HashMap();
        this.f149252Q6 = new HashMap<>(128);
        this.f149260R6 = new HashMap<>();
        this.f149268S6 = new ConcurrentHashMap<>(512);
        this.f149276T6 = new LinkedHashMap<>();
        this.f149284U6 = new HashSet();
        this.f149292V6 = C22392a.m221512b();
        this.f149316Y6 = false;
        this.f149324Z6 = false;
        this.f149332a7 = false;
        this.f149340b7 = C22392a.m221512b();
        this.f149348c7 = C22393b.m221521b();
        this.f149356d7 = C22393b.m221521b();
        this.f149364e7 = new C19232l();
        this.f149372f7 = new C19231k();
        this.f149380g7 = new C19230j(this);
        this.f149388h7 = false;
        this.f149396i7 = C22392a.m221512b();
        this.f149404j7 = C22392a.m221512b();
        this.f149412k7 = C22392a.m221513c(MyTabTask.new_());
        this.f149420l7 = C22392a.m221513c(roj0Var);
        this.f149428m7 = new tpd0("latest_invite_verify_count_" + CoreModule.m29931H().userId(), 0);
        this.f149436n7 = new hpd0("latest_invite_verify_showed_" + CoreModule.m29931H().userId(), bool);
        this.f149245Q = c4732c;
        this.f149142B1 = str;
        this.f149308X6 = ogw.m164284e(str + mqi0.m155944o());
        StringBuilder sb = new StringBuilder("userSettings_");
        sb.append(CoreModule.m29931H().userId());
        this.f149253R = new eqd0(sb.toString(), true, "putongPref");
        this.f149269T = new tpd0("session_changed_fake_profile" + CoreModule.m29931H().userId(), -1);
        this.f149277U = C22392a.m221512b();
        this.f149285V = C22392a.m221512b();
        Boolean bool2 = Boolean.FALSE;
        this.f149293W = C22392a.m221513c(bool2);
        this.f149277U.m132487l(roj0Var);
        this.f149301X = new zpd0("swipe_count_" + CoreModule.m29931H().userId(), 0L);
        this.f149309Y = new tpd0("super_like_shown_count" + CoreModule.m29931H().userId(), 0);
        this.f149317Z = new zpd0("last_superlike_dlg_shown" + CoreModule.m29931H().userId(), 0L);
        this.f149333b0 = new hpd0("signup_al_bind_phone" + CoreModule.m29931H().userId(), bool2);
        this.f149365f0 = new hpd0("new_mine_tab_setting_clicked" + CoreModule.m29931H().userId(), bool2);
        this.f149349d0 = new hpd0("gp_bind_phone_notice" + CoreModule.m29931H().userId(), bool);
        this.f149357e0 = new hpd0("gp_bind_phone_red_dot" + CoreModule.m29931H().userId(), bool);
        this.f149514z0 = C22392a.m221512b();
        this.f149341c0 = new hpd0("all_bind_f_showing_" + CoreModule.m29931H().userId(), bool2);
        this.f149261S = new hpd0("isFromSignUp_" + CoreModule.m29931H().userId(), bool2);
        this.f149373g0 = new ard0("new_user_vip_strategy" + CoreModule.m29931H().userId(), true);
        this.f149134A0 = C22392a.m221512b();
        this.f149148C0 = C22392a.m221512b();
        this.f149155D0 = C22392a.m221512b();
        this.f149162E0 = C22392a.m221512b();
        this.f149169F0 = C22392a.m221512b();
        this.f149381h0 = new hpd0("has_shown_gp_vip_update_guide", bool2);
        this.f149389i0 = new tpd0("vip_update_guide_privilege_display_count" + CoreModule.m29931H().userId(), 0);
        this.f149397j0 = new zpd0("push_guide_dialog_show_time" + CoreModule.m29931H().userId(), 0L);
        this.f149405k0 = new vqd0("push_guide_dialog_close_time_set" + CoreModule.m29931H().userId(), new HashSet());
        this.f149413l0 = new zpd0("push_guide_dialog_close_freezing_time" + CoreModule.m29931H().userId(), 0L);
        this.f149421m0 = new zpd0("push_guide_notify_auth_open_time" + CoreModule.m29931H().userId(), 0L);
        this.f149429n0 = new zpd0("conversation_header_guide_show_time" + CoreModule.m29931H().userId(), 0L);
        this.f149444p0 = new zpd0("push_conv_header_close_freezing_time" + CoreModule.m29931H().userId(), 0L);
        this.f149437o0 = new vqd0("push_conv_header_close_timeSet" + CoreModule.m29931H().userId(), new HashSet());
        this.f149458r0 = new zpd0("msg_main_top_guide_user_update_time" + CoreModule.m29931H().userId(), 0L);
        this.f149451q0 = new vqd0("msg_main_top_guide_userid_set" + CoreModule.m29931H().userId(), new HashSet());
        this.f149465s0 = new vqd0("msg_main_top_guide_userid_close_set" + CoreModule.m29931H().userId(), new HashSet());
        this.f149472t0 = new hpd0("hasDisplaySearch_" + CoreModule.m29931H().userId(), bool2);
        this.f149479u0 = new hpd0("isNewPicPicked" + CoreModule.m29931H().userId(), bool2);
        this.f149486v0 = new hpd0("IsSmartPortraitSwitchCheckedAtFirst" + CoreModule.m29931H().userId(), bool2);
        this.f149493w0 = new hpd0("chatNewMatchShowCloseConfirmDlg", bool2);
        this.f149500x0 = new tpd0("chatNewMatchCountMaxNum", 100);
        this.f149507y0 = new hpd0("NeedOpenSmartPortraitWhenUploadNewPic" + CoreModule.m29931H().userId(), bool2);
        this.f149210L0 = new hpd0("has_patch_india_lady_privacy_" + CoreModule.m29931H().userId(), bool2);
        this.f149183H0 = new tpd0("tantanAuthToastShowTimes_v3_" + CoreModule.m29931H().userId(), 0);
        this.f149189I0 = new zpd0("tantanAuthToastLastShowTime_v3_" + CoreModule.m29931H().userId(), 0L);
        this.f149196J0 = new vqd0("tantanAuthToastShowUser_v3_" + CoreModule.m29931H().userId(), new HashSet());
        this.f149203K0 = new hpd0("chatTantanAuthTipsShown_v3_" + CoreModule.m29931H().userId(), bool2);
        this.f149217M0 = C22392a.m221512b();
        this.f149325a0 = new uqd0("last_live_region_tag_" + CoreModule.m29931H().userId(), "");
        this.f149224N0 = new zpd0("swipe_all_counts_" + CoreModule.m29931H().userId(), 0L);
        this.f149231O0 = new zpd0("today_start_swipe_time_" + CoreModule.m29931H().userId(), 0L);
        this.f149238P0 = new zpd0("today_swipe_count_" + CoreModule.m29931H().userId(), 0L);
        this.f149246Q0 = new zpd0("today_right_swipe_count_" + CoreModule.m29931H().userId(), 0L);
        this.f149254R0 = new zpd0("last_dangerous_user_safety_reminder_time_" + CoreModule.m29931H().userId(), 0L);
        this.f149270T0 = new tpd0("popup_number_" + CoreModule.m29931H().userId(), 0);
        this.f149278U0 = new tpd0("show_fake_dlg_count_4_intl_" + CoreModule.m29931H().userId(), 0);
        this.f149294W0 = new hpd0("profile_blur_cover_show", bool2);
        this.f149286V0 = new tpd0("fakeSwipeDlgShowCount" + CoreModule.m29931H().userId(), 0);
        this.f149302X0 = new hpd0("click_moment_" + CoreModule.m29931H().userId(), bool2);
        this.f149176G0 = new tpd0("see_show_cnt_" + CoreModule.m29931H().userId(), 0);
        this.f149318Z0 = new hpd0("already_merge_dialog_info" + CoreModule.m29931H().userId(), bool2);
        qib0.f154719h0 = LiveRegionTag.get(this.f149325a0.get());
        this.f149326a1 = new hpd0("full_card_anim_reset_" + CoreModule.m29931H().userId(), bool2);
        this.f149342c1 = new hpd0("profile_example_tab_dot_show", bool);
        this.f149350d1 = new hpd0("profile_tickle_set_" + CoreModule.m29931H().userId(), bool2);
        this.f149358e1 = new hpd0("profile_tickle_set_tip_show_" + CoreModule.m29931H().userId(), bool2);
        this.f149366f1 = new uqd0("profile_tickle_set_tip_message_show_" + CoreModule.m29931H().userId(), "");
        this.f149374g1 = new zpd0("enter_tickle_group_time_" + CoreModule.m29931H().userId(), 0L);
        this.f149382h1 = new hpd0("local_tickle_tip_show_" + CoreModule.m29931H().userId(), bool2);
        this.f149390i1 = new uqd0("local_tickle_tip_message_" + CoreModule.m29931H().userId(), "");
        this.f149398j1 = new tpd0("main_trans_speed", 1);
        this.f149406k1 = new hpd0("showUser43Crop", bool2);
        this.f149422m1 = C22392a.m221512b();
        this.f149430n1 = C22392a.m221512b();
        this.f149438o1 = C22392a.m221512b();
        this.f149445p1 = new zpd0("latest_theme_show_temp_" + CoreModule.m29931H().userId(), 0L);
        this.f149452q1 = new hpd0("fake_gender_clicked_" + CoreModule.m29931H().userId(), bool2);
        this.f149473t1 = new hpd0("contact_guid" + CoreModule.m29931H().userId(), bool2);
        this.f149480u1 = new zpd0("latest_close_female_chat_guide_time_" + CoreModule.m29931H().userId(), 0L);
        this.f149487v1 = new hpd0("clicked_media_intimate_quetsions", bool2);
        this.f149494w1 = new zpd0("conv_counter_check_time_sync_" + CoreModule.m29931H().userId(), 0L);
        this.f149501x1 = new zpd0("conv_counter_last_check_time_sync_" + CoreModule.m29931H().userId(), 0L);
        this.f149508y1 = new hpd0("profile_optimize_entry" + CoreModule.m29931H().userId(), bool2);
        this.f149262S0 = new hpd0("intl_web_pay_enable_" + CoreModule.m29931H().userId(), bool2);
        this.f149459r1 = new hpd0("card_has_show_pic_verified_anim_" + CoreModule.m29931H().userId(), bool2);
        this.f149466s1 = new hpd0("card_has_show_id_verified_anim_" + CoreModule.m29931H().userId(), bool2);
        this.f149515z1 = new uqd0("question_language_sp", "");
        this.f149135A1 = new zpd0("intl_read_messages_tips_last_show_time_" + CoreModule.m29931H().userId(), 0L);
        this.f149218M1 = new tpd0("sticker_collection_position" + CoreModule.m29931H().userId(), 0);
        this.f149225N1 = new hpd0("multi_need_preload_tag_svga", bool2);
        this.f149467s2 = new hpd0("show_new_chat_warming_up_debug" + CoreModule.m29931H().userId(), bool2);
        this.f149481u2 = new hpd0("new_chat_warming_up_debug" + CoreModule.m29931H().userId(), bool2);
        this.f149474t2 = new kpd0("new_chat_warming_up_num_debug" + CoreModule.m29931H().userId(), 5.0d);
        this.f149488v2 = new hpd0("chat_upgrade_emoji_debug" + CoreModule.m29931H().userId(), bool2);
        this.f149232O1 = new hpd0("use_tantanlist", bool2);
        this.f149239P1 = new hpd0("use_tantanlist_debug", bool2);
        this.f149149C1 = new hpd0("has_share_tip_show" + CoreModule.m29931H().userId(), bool2);
        this.f149156D1 = new hpd0("has_local_share_tip_show" + CoreModule.m29931H().userId(), bool2);
        this.f149247Q1 = new zpd0("fill_info_join_experience_time_" + CoreModule.m29931H().userId(), -1L);
        this.f149327a2 = new zpd0("push_switch_time" + CoreModule.m29931H().userId(), 0L);
        this.f149319Z1 = new tpd0("push_switch_count" + CoreModule.m29931H().userId(), 0);
        this.f149343c2 = new hpd0("push_switch_gender" + CoreModule.m29931H().userId(), bool2);
        this.f149335b2 = new zpd0("push_switch_tips_time" + CoreModule.m29931H().userId(), 0L);
        this.f149351d2 = new hpd0("push_switch_has_show" + CoreModule.m29931H().userId(), bool2);
        this.f149359e2 = new hpd0("push_switch_has_tips_show" + CoreModule.m29931H().userId(), bool2);
        this.f149303X1 = new hpd0("tag_show_click_guide_key" + CoreModule.m29931H().userId(), bool);
        this.f149367f2 = new uqd0("recent_book_movies_dramas_time" + qib0.f154714c0.userId(), "");
        this.f149375g2 = new zpd0("recent_book_movies_dramas_count" + qib0.f154714c0.userId(), 0L);
        this.f149383h2 = new hpd0("first_exposure_book_movies" + qib0.f154714c0.userId(), bool);
        this.f149391i2 = new uqd0("login_user_book_movies_drama_data" + CoreModule.m29931H().userId(), "");
        this.f149399j2 = new zpd0("conversation_tag_guide_time" + CoreModule.m29931H().userId(), 0L);
        this.f149407k2 = new tpd0("conversation_tag_guide_mouth_count" + CoreModule.m29931H().userId(), 0);
        this.f149415l2 = new tpd0("conversation_tag_guide_day_count" + CoreModule.m29931H().userId(), 0);
        this.f149423m2 = new zpd0("conversation_tag_guide_clear_date" + CoreModule.m29931H().userId(), 0L);
        this.f149431n2 = new zpd0("lastShowMomentpostGuideTime_" + CoreModule.m29931H().userId(), 0L);
        this.f149439o2 = new tpd0("me_tab_show_guide_bubble_verification" + CoreModule.m29931H().userId(), 0);
        this.f149446p2 = new uqd0("me_tab_show_guide_bubble_verification_time" + CoreModule.m29931H().userId(), "");
        this.f149453q2 = new hpd0("profile_show_guide_bubble_verification_pic" + CoreModule.m29931H().userId(), bool2);
        this.f149460r2 = new hpd0("profile_show_guide_bubble_verification_pic_idcard" + CoreModule.m29931H().userId(), bool2);
        this.f149495w2 = new hpd0("refresh_chatheat_sticker_" + CoreModule.m29931H().userId(), bool2);
        this.f149502x2 = new uqd0("core_square_debug_lua_url_1", "/core/example2/v-/1.x/sources/indexMua.lua?_bid=1003408", false);
        this.f149136A2 = new tpd0("new_user_count" + CoreModule.m29931H().userId(), 0);
        this.f149143B2 = new tpd0("new_user_right_count" + CoreModule.m29931H().userId(), 0);
        this.f149150C2 = new tpd0("new_user_today_count" + CoreModule.m29931H().userId(), 0);
        this.f149157D2 = new tpd0("new_user_today_match_count" + CoreModule.m29931H().userId(), 0);
        this.f149164E2 = new hpd0("new_user_has_show" + CoreModule.m29931H().userId(), bool2);
        this.f149171F2 = new hpd0("new_user_has_gusture_show" + CoreModule.m29931H().userId(), bool2);
        this.f149198J2 = new hpd0("match_ice_break_exp_debug" + CoreModule.m29931H().userId(), bool2);
        this.f149205K2 = new hpd0("match_ice_break_toggle_gender_debug" + CoreModule.m29931H().userId(), bool2);
        this.f149212L2 = new tpd0("conv_match_ice_break_guide_count" + CoreModule.m29931H().userId(), 0);
        this.f149219M2 = new zpd0("conv_match_ice_break_guide_last_time" + CoreModule.m29931H().userId(), 0L);
        this.f149509y2 = new zpd0("lastShowMomentLikeGuideTime_" + CoreModule.m29931H().userId(), 0L);
        this.f149516z2 = new tpd0("countMaleMomentPostGuideMesage_" + CoreModule.m29931H().userId(), 0);
        this.f149226N2 = new hpd0("jailed_profile_debug" + CoreModule.m29931H().userId(), bool2);
        this.f149233O2 = new hpd0("jailed_swipe_debug" + CoreModule.m29931H().userId(), bool2);
        this.f149240P2 = new hpd0("tt_eco_abtest_debug" + CoreModule.m29931H().userId(), bool2);
        this.f149248Q2 = new zpd0("core_last_show_feed_time" + CoreModule.m29931H().userId(), 0L);
        this.f149256R2 = new zpd0("core_feed_tab_pop_show_last_time" + CoreModule.m29931H().userId(), 0L);
        this.f149264S2 = new uqd0("core_feed_tab_pop_show_times" + CoreModule.m29931H().userId(), "");
        this.f149272T2 = new zpd0("core_feed_tab_pop_next_allow_show_time" + CoreModule.m29931H().userId(), 0L);
        this.f149280U2 = new zpd0("core_feed_tab_pop_next_request_time" + CoreModule.m29931H().userId(), 0L);
        this.f149288V2 = new hpd0("core_feed_tab_pop_debug" + CoreModule.m29931H().userId(), bool2);
        this.f149304X2 = new hpd0("ttt_show_facebook_bind_phone_dlg" + CoreModule.m29931H().userId(), bool);
        this.f149320Z2 = new hpd0("ttt_show_google_bind_phone_dlg" + CoreModule.m29931H().userId(), bool);
        this.f149312Y2 = new hpd0("show_empty_address_book" + CoreModule.m29931H().userId(), bool2);
        this.f149296W2 = new uqd0("show_upload_real_avatar_push" + CoreModule.m29931H().userId(), "");
        this.f149384h3 = new tpd0("ice_break_dlg_no_send_action_count" + CoreModule.m29931H().userId(), 0);
        this.f149392i3 = new zpd0("ice_break_dlg_freezing_time" + CoreModule.m29931H().userId(), 0L);
        this.f149178G2 = new uqd0("growth_exposure_num" + CoreModule.m29931H().userId(), "");
        this.f149185H2 = new zpd0("growth_exposure_tip_time" + CoreModule.m29931H().userId(), 0L);
        this.f149191I2 = new zpd0("growth_exposure_pop_time" + CoreModule.m29931H().userId(), 0L);
        this.f149328a3 = new hpd0("match_success_2_debug" + CoreModule.m29931H().userId(), bool2);
        this.f149336b3 = new hpd0("messageTabFilterDebug" + CoreModule.m29931H().userId(), bool2);
        this.f149376g3 = new uqd0("swipe_superlike_pay_will_" + CoreModule.m29931H().userId(), Constants.PRIORITY_HIGH);
        this.f149440o3 = new hpd0("recommend_voice_chat_room_debug" + CoreModule.m29931H().userId(), bool2);
        this.f149344c3 = new hpd0("isHeartSignalVipAlertDebug" + CoreModule.m29931H().userId(), bool2);
        this.f149352d3 = new uqd0("sendMessagePageFlashChatPopupDialogTime" + CoreModule.m29931H().userId(), "");
        this.f149424m3 = new hpd0("msg_game_red_" + CoreModule.m29931H().userId(), bool);
        this.f149432n3 = new hpd0("onlineSmsSwitchDebug" + CoreModule.m29931H().userId(), bool2);
        this.f149447p3 = new vqd0("growth_msg_uids" + CoreModule.m29931H().userId(), new HashSet());
        this.f149454q3 = new vqd0("has_growth_msg_click" + CoreModule.m29931H().userId(), new HashSet());
        this.f149461r3 = new tpd0("has_growth_msg_count" + CoreModule.m29931H().userId(), 0);
        this.f149468s3 = new zpd0("get_new_user_lost_time" + CoreModule.m29931H().userId(), 0L);
        this.f149475t3 = new uqd0("chat_click_set" + CoreModule.m29931H().userId(), "");
        this.f149482u3 = new uqd0("chat_lost_time_set" + CoreModule.m29931H().userId(), "");
        this.f149489v3 = new hpd0("friend_online_notify_showed_" + CoreModule.m29931H().userId(), bool2);
        this.f149496w3 = new tpd0("continuous_click_conv_next_count" + CoreModule.m29931H().userId(), 0);
        this.f149503x3 = new zpd0("silent_time_conv_next" + CoreModule.m29931H().userId(), 0L);
        this.f149510y3 = new zpd0("latest_time_conv_next" + CoreModule.m29931H().userId(), 0L);
        this.f149517z3 = new hpd0("show_filter_veri_msg_tips" + CoreModule.m29931H().userId(), bool);
        this.f149137A3 = new hpd0("dispose_old_invalid_conv+" + CoreModule.m29931H().userId(), bool);
        this.f149144B3 = new hpd0("dispose_old_invalid_conv_del+" + CoreModule.m29931H().userId(), bool);
        this.f149192I3 = new hpd0("has_spam_dialog_show+" + CoreModule.m29931H().userId(), bool2);
        this.f149151C3 = new uqd0("positive_feedback" + CoreModule.m29931H().userId(), "");
        this.f149158D3 = new uqd0("no_remaining_times" + CoreModule.m29931H().userId(), "");
        this.f149165E3 = new uqd0("pairing_restriction+" + CoreModule.m29931H().userId(), "");
        m169427P7();
        this.f149172F3 = new tpd0("ai_picture_pop_guide_count" + CoreModule.m29931H().userId(), 0);
        this.f149179G3 = new tpd0("ai_picture_quick_access_count" + CoreModule.m29931H().userId(), 0);
        this.f149206K3 = new zpd0("today_cold_start_app_time_" + CoreModule.m29931H().userId(), 0L);
        this.f149213L3 = new tpd0("today_cold_start_count_" + CoreModule.m29931H().userId(), 0);
        this.f149220M3 = new zpd0("top_item_red_dot_hide_time_" + CoreModule.m29931H().userId(), 0L);
        this.f149241P3 = new tpd0("profile_ui_upgrade_introduction_count" + CoreModule.m29931H().userId(), 0);
        this.f149249Q3 = new tpd0("profile_ui_upgrade_photo_count" + CoreModule.m29931H().userId(), 0);
        this.f149257R3 = new uqd0("last_show_home_tab+" + CoreModule.m29931H().userId(), "");
        this.f149265S3 = new hpd0("message_recall_show_toast", bool2);
        this.f149273T3 = new tpd0("message_recall_show_toast_count", 0);
        this.f149281U3 = new uqd0("pic_exchange_pw_show_config" + CoreModule.m29931H().userId(), WeJson.EMPTY_MAP);
        this.f149289V3 = new zpd0("conv_pic_cert_guide_silence_time" + CoreModule.m29931H().userId(), 0L);
        this.f149297W3 = new tpd0("conv_pic_cert_guide_show_count" + CoreModule.m29931H().userId(), 0);
        this.f149305X3 = new zpd0("profile_pic_cert_guide_silence_time" + CoreModule.m29931H().userId(), 0L);
        this.f149321Z3 = new uqd0("user_home_mode" + CoreModule.m29931H().userId(), UserHomeMode.loveMode);
        this.f149313Y3 = new tpd0("profile_pic_cert_guide_show_count" + CoreModule.m29931H().userId(), 0);
        this.f149361e4 = new hpd0("has_show_find_user_tip+" + CoreModule.m29931H().userId(), bool2);
        this.f149329a4 = new hpd0("marry_debug_model", bool2);
        this.f149337b4 = new hpd0("marry_model_dot" + CoreModule.m29931H().userId(), bool2);
        this.f149369f4 = new hpd0("has_open_marry_audit_act_first" + CoreModule.m29931H().userId(), bool2);
        this.f149393i4 = new uqd0("marry_edit_cache_declaration" + CoreModule.m29931H().userId(), null);
        this.f149401j4 = new uqd0("marry_edit_cache_mate_description" + CoreModule.m29931H().userId(), null);
        this.f149409k4 = new uqd0("marry_edit_cache_family_background" + CoreModule.m29931H().userId(), null);
        this.f149417l4 = new uqd0("marry_edit_cache_bride_price" + CoreModule.m29931H().userId(), null);
        this.f149425m4 = new uqd0("marry_edit_cache_prologue" + CoreModule.m29931H().userId(), null);
        this.f149433n4 = new hpd0("marry_has_enter_model_" + CoreModule.m29931H().userId(), bool2);
        this.f149441o4 = new uqd0("marry_red_dot_show_key_" + CoreModule.m29931H().userId(), "");
        this.f149448p4 = new uqd0("marry_spring_festival_red_dot_show_key_" + CoreModule.m29931H().userId(), "");
        this.f149455q4 = new tpd0("marry_spring_festival_pop_up_marker_" + CoreModule.m29931H().userId(), -1);
        this.f149469s4 = new zpd0("chat_partner_last_request_time" + CoreModule.m29931H().userId(), 0L);
        this.f149476t4 = new zpd0("chat_partner_last_show_time" + CoreModule.m29931H().userId(), 0L);
        this.f149483u4 = new tpd0("chat_partner_message_passive_count" + CoreModule.m29931H().userId(), 0);
        this.f149490v4 = new tpd0("chat_partner_online_passive_count" + CoreModule.m29931H().userId(), 0);
        this.f149152C4 = new zpd0("friend_tacit_limit_time" + CoreModule.m29931H().userId(), 0L);
        this.f149159D4 = new hpd0("friend_tacit_dialog_show" + CoreModule.m29931H().userId(), bool2);
        this.f149173F4 = new hpd0("marry_protocol_show" + CoreModule.m29931H().userId(), bool2);
        this.f149180G4 = new zpd0("low_photo_last_show_time" + CoreModule.m29931H().userId(), 0L);
        this.f149187H4 = new tpd0("low_photo_show_count_today" + CoreModule.m29931H().userId(), 0);
        this.f149193I4 = new hpd0("marry_guide_dlg_showed_" + CoreModule.m29931H().userId(), bool2);
        this.f149214L4 = new hpd0("marry_label_bubble_showed_" + CoreModule.m29931H().userId(), bool2);
        this.f149200J4 = new tpd0("marry_insert_card_count_" + CoreModule.m29931H().userId(), 0);
        this.f149207K4 = new zpd0("marry_insert_date_" + CoreModule.m29931H().userId(), 0L);
        this.f149221M4 = new tpd0("auto_change_marry_" + CoreModule.m29931H().userId(), 0);
        this.f149228N4 = new hpd0("new_profile_ui" + CoreModule.m29931H().userId(), bool2);
        this.f149235O4 = new zpd0("marry_show_date_time_" + CoreModule.m29931H().userId(), 0L);
        this.f149242P4 = new zpd0("lastet_enter_421_time_" + CoreModule.m29931H().userId(), 0L);
        this.f149266S4 = new zpd0("insert_421_feedback_time_" + CoreModule.m29931H().userId(), 0L);
        this.f149250Q4 = new zpd0("current_inset_421_time_" + CoreModule.m29931H().userId(), 0L);
        this.f149258R4 = new tpd0("today_insert_421_count_" + CoreModule.m29931H().userId(), 0);
        this.f149274T4 = new tpd0("continus_left_421_time_" + CoreModule.m29931H().userId(), 0);
        this.f149346c5 = new hpd0("open_one_click_pairing" + CoreModule.m29931H().userId(), bool);
        this.f149338b5 = new hpd0("game_cp_bottom_dialog_show" + CoreModule.m29931H().userId(), bool2);
        this.f149386h5 = new hpd0("HAS_SHOW_USER_STATE_TIP" + CoreModule.m29931H().userId(), bool2);
        this.f149298W4 = new zpd0("bar_lover_dlg1_last_show_time" + CoreModule.m29931H().userId(), 0L);
        this.f149306X4 = new tpd0("bar_lover_dlg1_last_show_counter" + CoreModule.m29931H().userId(), 0);
        this.f149314Y4 = new hpd0("show_bar_lover_dlg2" + CoreModule.m29931H().userId(), bool2);
        this.f149322Z4 = new zpd0("bar_lover_card_last_show_time" + CoreModule.m29931H().userId(), 0L);
        this.f149330a5 = new tpd0("bar_lover_card_last_show_counter" + CoreModule.m29931H().userId(), 0);
        this.f149394i5 = new tpd0("wechat_notify_banner_count" + CoreModule.m29931H().userId(), 0);
        this.f149402j5 = new zpd0("wechat_notify_banner_last_show_time" + CoreModule.m29931H().userId(), 0L);
        this.f149410k5 = new tpd0("wechat_notify_banner_day_count" + CoreModule.m29931H().userId(), 0);
        this.f149418l5 = new zpd0("wechat_gdlst" + CoreModule.m29931H().userId(), 0L);
        this.f149426m5 = new tpd0("wechat_gdsc" + CoreModule.m29931H().userId(), 0);
        this.f149434n5 = new zpd0("wechat_cgst" + CoreModule.m29931H().userId(), 0L);
        this.f149442o5 = new tpd0("wechat_cgsc" + CoreModule.m29931H().userId(), 0);
        this.f149449p5 = new tpd0("wechat_ctsc" + CoreModule.m29931H().userId(), 0);
        this.f149456q5 = new zpd0("wechat_bctm" + CoreModule.m29931H().userId(), 0L);
        this.f149463r5 = new zpd0("stock_fake_dlg_last_show_time" + CoreModule.m29931H().userId(), 0L);
        this.f149470s5 = new tpd0("stock_fake_dlg_show_count" + CoreModule.m29931H().userId(), 0);
        this.f149477t5 = new hpd0("manual_set_up_distance" + CoreModule.m29931H().userId(), bool2);
        this.f149360e3 = new uqd0("new_match_success_time_sb" + CoreModule.m29931H().userId(), "");
        this.f149484u5 = new uqd0("net_pic_dlg_data" + CoreModule.m29931H().userId(), "");
        this.f149491v5 = new tpd0("net_pic_dlg_count" + CoreModule.m29931H().userId(), 0);
        this.f149498w5 = new uqd0("repeat_pic_dlg_data" + CoreModule.m29931H().userId(), "");
        this.f149505x5 = new tpd0("repeat_pic_dlg_count" + CoreModule.m29931H().userId(), 0);
        this.f149512y5 = new uqd0("ai_pic_dlg_date" + CoreModule.m29931H().userId(), "");
        this.f149519z5 = new tpd0("ai_pic_dlg_count" + CoreModule.m29931H().userId(), 0);
        this.f149146B5 = new tpd0("verification_spam_count" + CoreModule.m29931H().userId(), 0);
        this.f149139A5 = new zpd0("verification_visit_time" + CoreModule.m29931H().userId(), 0L);
        this.f149153C5 = new zpd0("team_group_conv_click_time" + CoreModule.m29931H().userId(), 0L);
        this.f149160D5 = new zpd0("weakened_tips_last_show_time" + CoreModule.m29931H().userId(), 0L);
        this.f149167E5 = new tpd0("weakened_tips_close_count" + CoreModule.m29931H().userId(), 0);
        this.f149174F5 = new zpd0("weakened_tips_force_hide_time" + CoreModule.m29931H().userId(), 0L);
        this.f149194I5 = new uqd0("cannot_reply_immediately_data" + CoreModule.m29931H().userId(), "");
        this.f149201J5 = new uqd0("cannot_reply_immediately_count" + CoreModule.m29931H().userId(), "");
        this.f149208K5 = new uqd0("del_cannot_reply_immediately_count" + CoreModule.m29931H().userId(), "");
        this.f149236O5 = new tpd0("continuous_left_sliding_bubble_count" + CoreModule.m29931H().userId(), 0);
        this.f149243P5 = new zpd0("continuous_left_sliding_bubble_time" + CoreModule.m29931H().userId(), 0L);
        this.f149215L5 = new hpd0("is_high_speed_sliding_left_tips" + CoreModule.m29931H().userId(), bool2);
        this.f149222M5 = new hpd0("is_high_speed_sliding_right_tips" + CoreModule.m29931H().userId(), bool2);
        this.f149229N5 = new hpd0("is_reset_guidance" + CoreModule.m29931H().userId(), bool2);
        this.f149251Q5 = new zpd0("oof_enter_update_time" + CoreModule.m29931H().userId(), 0L);
        this.f149259R5 = new zpd0("show_interval_card_swipe" + CoreModule.m29931H().userId(), -1L);
        this.f149267S5 = new tpd0("fitnes_can_display_the_number_of_times" + CoreModule.m29931H().userId(), 0);
        this.f149275T5 = new tpd0("drink_can_display_the_number_of_times" + CoreModule.m29931H().userId(), 0);
        this.f149283U5 = new tpd0("smoke_can_display_the_number_of_times" + CoreModule.m29931H().userId(), 0);
        this.f149291V5 = new tpd0("game_can_display_the_number_of_times" + CoreModule.m29931H().userId(), 0);
        this.f149299W5 = new zpd0("today_can_display_times" + CoreModule.m29931H().userId(), 0L);
        this.f149307X5 = new tpd0("today_can_display_count" + CoreModule.m29931H().userId(), 0);
        this.f149315Y5 = new uqd0("today_can_display_pre_user_id" + CoreModule.m29931H().userId(), "");
        this.f149355d6 = new uqd0("today_can_display_pre_user_id_fitness" + CoreModule.m29931H().userId(), "");
        this.f149363e6 = new uqd0("today_can_display_pre_user_id_drink" + CoreModule.m29931H().userId(), "");
        this.f149371f6 = new uqd0("today_can_display_pre_user_id_smoke" + CoreModule.m29931H().userId(), "");
        this.f149379g6 = new uqd0("today_can_display_pre_user_id_game" + CoreModule.m29931H().userId(), "");
        this.f149419l6 = new uqd0("intl_currency_type" + CoreModule.m29931H().userId(), "");
        this.f149471s6 = new uqd0("verifiy_swipe_privilege_show_time_" + CoreModule.m29931H().userId(), "");
        qib0.f154686D0 = this.f149419l6.get();
        this.f149450p6 = new zpd0("show_expand_search_time" + CoreModule.m29931H().userId(), 0L);
        this.f149457q6 = new zpd0("show_boost_refactoring_redrot_time" + CoreModule.m29931H().userId(), 0L);
        this.f149464r6 = new hpd0("show_boost_refactoring_redrot" + CoreModule.m29931H().userId(), bool2);
        this.f149499w6 = new hpd0("see_myself_close_enable" + CoreModule.m29931H().userId(), bool2);
        this.f149506x6 = new zpd0("see_myself_first_show_Time" + CoreModule.m29931H().userId(), 0L);
        this.f149513y6 = new hpd0("followTipsSavedValue" + CoreModule.m29931H().userId(), bool2);
        this.f149520z6 = new hpd0("isHavePartner" + CoreModule.m29931H().userId(), bool2);
        this.f149147B6 = new hpd0("exp_debug_new_ui", bool2);
        this.f149140A6 = new hpd0("bubble_odiamond_immediate_match_guide_" + CoreModule.m29931H().userId(), bool2);
        this.f149414l1 = new zpd0("last_show_online_chat_guide_time" + CoreModule.m29931H().userId(), 0L);
        this.f149175F6 = new tpd0("staging_card_user_activity_day", 2);
        this.f149161D6 = new hpd0("has_show_edit_shimmer" + CoreModule.m29931H().userId(), bool2);
        this.f149168E6 = new uqd0("has_show_avatar_shimmer" + CoreModule.m29931H().userId(), "");
        this.f149195I6 = new zpd0("intl_message_read_receipt_tip_last_show_time" + CoreModule.m29931H().userId(), 0L);
        this.f149209K6 = new hpd0("intl_buzz_has_pull" + CoreModule.m29931H().userId(), bool2);
        this.f149202J6 = new hpd0("intl_delete_prompt_message" + CoreModule.m29931H().userId(), bool2);
        this.f149216L6 = new hpd0("intl_edit_friend_purpose" + CoreModule.m29931H().userId(), bool2);
        this.f149223M6 = new hpd0("intl_tribe_guide_showed" + CoreModule.m29931H().userId(), bool2);
        this.f149230N6 = new zpd0("intl_tribe_recall_guide_pop_show_time" + CoreModule.m29931H().userId(), 0L);
        this.f149323Z5 = new tpd0("intl_sl_guide_show_count_men_" + CoreModule.m29931H().userId(), 0);
        this.f149331a6 = new tpd0("intl_sl_guide_show_count_women_" + CoreModule.m29931H().userId(), 0);
        this.f149339b6 = new zpd0("intl_sl_guide_last_show_date_men_" + CoreModule.m29931H().userId(), 0L);
        this.f149347c6 = new zpd0("intl_sl_guide_last_show_date_women_" + CoreModule.m29931H().userId(), 0L);
        this.f149237O6 = new zpd0("last_whisper_viewed_time" + CoreModule.m29931H().userId(), 0L);
    }

    /* JADX INFO: renamed from: E5 */
    public static /* synthetic */ void m169178E5(Throwable th) {
        if (th instanceof TantanException.Client.TantanForbidden) {
            TantanException.Client.TantanForbidden tantanForbidden = (TantanException.Client.TantanForbidden) th;
            if (tantanForbidden.isCannotModify()) {
                String str = tantanForbidden.message;
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                Application application = CoreModule.f17544b;
                application.startActivity(DialogAct.m79377O0(application, 1, str));
            }
        }
    }

    /* JADX INFO: renamed from: F5 */
    public static /* synthetic */ void m169182F5(String str, Picture picture) {
        String str2 = picture.url;
        int i = picture.size.width;
        o6j0.m162869m("e_hyper_profile_pic_double_check", "p_edit_profile_view", o6j0.C18854a.m162878h("pic_trace_id", str), o6j0.C18854a.m162878h("pic_trace_type", "original"), o6j0.C18854a.m162878h("pic_trace_url", picture.url), o6j0.C18854a.m162878h("pic_trace_resolution", picture.size.width + BaseSei.f13930X + picture.size.height));
    }

    /* JADX INFO: renamed from: F6 */
    public static /* synthetic */ Boolean m169183F6(List list) {
        Picture picture = (Picture) list.get(0);
        if (NullChecker.m81303a(picture)) {
            File file = new File(rhi.m179382z(picture.url));
            if (file.exists()) {
                return Boolean.valueOf(file.length() < 8388608);
            }
        }
        return Boolean.FALSE;
    }

    /* JADX INFO: renamed from: H6 */
    public static /* synthetic */ GPMemo m169191H6(String str, Map map) {
        return (GPMemo) map.get(str);
    }

    /* JADX INFO: renamed from: J4 */
    public static /* synthetic */ stc0 m169197J4(String str, boolean z, boolean z2) {
        String str2;
        stc0.C20027a c20027aM185898q = C4728a.f19494P.auth().m185898q(C4728a.m31200G("/my-tab-task/report"));
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
        return c20027aM185898q.m185893l(utc0.create(hyxVar, sb.toString())).m185883b();
    }

    /* JADX INFO: renamed from: J5 */
    public static /* synthetic */ stc0 m169198J5(String str, String str2) {
        String string;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("userPopType", str);
            string = jSONObject.toString();
        } catch (JSONException unused) {
            string = "";
        }
        return C4728a.f19494P.auth().m185898q(C4728a.m31200G(str2)).m185893l(utc0.create(Network.JSON, string)).m185883b();
    }

    /* JADX INFO: renamed from: L5 */
    public static /* synthetic */ stc0 m169206L5(String str, boolean z, boolean z2, String str2) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("source", "card");
            jSONObject.put("picUniqueIdentify", str);
            jSONObject.put("isClick", z);
            jSONObject.put("clickType", z2 ? "real" : "unsure");
        } catch (JSONException unused) {
        }
        return C4728a.f19494P.auth().m185898q(C4728a.m31200G(str2)).m185893l(utc0.create(Network.JSON, jSONObject.toString())).m185883b();
    }

    /* JADX INFO: renamed from: M5 */
    public static /* synthetic */ void m169210M5(Unit unit) {
    }

    /* JADX INFO: renamed from: O3 */
    public static /* synthetic */ void m169216O3(SettingGroups settingGroups) {
        TribeSetting tribeSetting;
        if (settingGroups == null || (tribeSetting = settingGroups.tttribe) == null || !TextUtils.isEmpty(tribeSetting.transLang)) {
            return;
        }
        CoreModule.f17545c.f19684t0.m30033r3(rb20.m178557f()).subscribe(mkd0.m154956H(new e30() { // from class: l.rdb
            @Override // p149l.e30
            public final void call(Object obj) {
                pib.m169210M5((Unit) obj);
            }
        }, new e30() { // from class: l.sdb
            @Override // p149l.e30
            public final void call(Object obj) {
                pib.m169357x5((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: O5 */
    public static /* synthetic */ CoreData m169218O5(Envelope envelope) {
        return (CoreData) envelope.getModuleData(CoreData.class);
    }

    /* JADX INFO: renamed from: P3 */
    public static /* synthetic */ AppealPostData m169220P3(AppealPostData appealPostData, List list) {
        AppealPostData appealPostDataMo223809clone = appealPostData.mo223809clone();
        appealPostDataMo223809clone.material.pictures = vwb.m200303Q(list, new w9j() { // from class: l.teb
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((Media) obj).url;
            }
        });
        return appealPostDataMo223809clone;
    }

    /* JADX INFO: renamed from: P6 */
    public static /* synthetic */ stc0 m169223P6(String str) {
        String str2;
        if (TextUtils.equals(str, "card") || TextUtils.equals(str, "chat")) {
            str2 = "/iceBreakQuestions?search=all&limit=3&source=" + str;
        } else if (TextUtils.equals(str, "match")) {
            str2 = "/iceBreakQuestions?search=all&limit=1&source=" + str;
        } else {
            str2 = "/iceBreakQuestions?search=all";
        }
        return C4728a.f19494P.auth().m185898q(C4728a.m31213J0(str2)).m185887f().m185883b();
    }

    /* JADX INFO: renamed from: S9 */
    public static C22306c<Envelope> m169235S9(final String str, final boolean z, final boolean z2) {
        return new la20(new v9j() { // from class: l.chb
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return pib.m169261a3(z, str, z2);
            }
        });
    }

    /* JADX INFO: renamed from: T9 */
    public static C22306c<Envelope> m169239T9(final String str) {
        return new la20(new v9j() { // from class: l.qcb
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4728a.f19494P.auth().m185898q(C4728a.m31195E2(str)).m185887f().m185883b();
            }
        });
    }

    /* JADX INFO: renamed from: U9 */
    public static C22306c<Envelope> m169243U9(final String str) {
        return new la20(new v9j() { // from class: l.bdb
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4728a.f19494P.auth().m185898q(C4728a.m31203G2(str)).m185887f().m185883b();
            }
        });
    }

    /* JADX INFO: renamed from: V7 */
    public static boolean m169247V7() {
        VerificationCenter verificationCenterM31612k4 = CoreModule.f17545c.f19552B0.m31612k4();
        return (NullChecker.m81303a(verificationCenterM31612k4) && NullChecker.m81303a(verificationCenterM31612k4.picVerificationInfo) && TEnum.equals(verificationCenterM31612k4.picVerificationInfo.status, "verified")) ? false : true;
    }

    /* JADX INFO: renamed from: a3 */
    public static /* synthetic */ stc0 m169261a3(boolean z, String str, boolean z2) {
        String strM31199F2 = z ? C4728a.m31199F2(str) : C4728a.m31362v2(str);
        if (z2) {
            strM31199F2 = strM31199F2 + "&source=viewer";
        }
        return C4728a.f19494P.auth().m185898q(strM31199F2).m185887f().m185883b();
    }

    /* JADX INFO: renamed from: a5 */
    public static /* synthetic */ void m169263a5(Throwable th) {
    }

    /* JADX INFO: renamed from: d6 */
    public static /* synthetic */ stc0 m169276d6(List list) {
        JSONArray jSONArray = new JSONArray((Collection) list);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("addQuestions", jSONArray);
        } catch (JSONException unused) {
        }
        return C4728a.f19494P.auth().m185898q(C4728a.m31213J0("/iceBreakQuestions")).m185894m(utc0.create(Network.JSON, jSONObject.toString())).m185883b();
    }

    /* JADX INFO: renamed from: d7 */
    public static C22306c<Envelope> m169277d7(final String str) {
        return new la20(new v9j() { // from class: l.wcb
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4728a.f19494P.auth().m185898q(C4728a.m31203G2(str)).m185887f().m185883b();
            }
        });
    }

    /* JADX INFO: renamed from: e6 */
    public static /* synthetic */ void m169281e6(String str, long j) {
        User userQuery = qib0.f154722k0.f176631d.query(str);
        if (userQuery == null) {
            return;
        }
        userQuery.localLatestReceivedMessageTime = j;
        qib0.f154722k0.f176631d.upsert(userQuery);
    }

    /* JADX INFO: renamed from: e7 */
    public static C22306c<Envelope> m169282e7(final String str) {
        return new la20(new v9j() { // from class: l.aib
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4728a.f19494P.auth().m185898q(C4728a.m31187C2(str)).m185887f().m185883b();
            }
        });
    }

    /* JADX INFO: renamed from: g6 */
    public static /* synthetic */ C22306c m169290g6() {
        final JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("complete", "unknown");
        } catch (JSONException unused) {
        }
        return ia20.m135117a(new v9j() { // from class: l.jdb
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4728a.f19494P.auth().m185898q(C4728a.m31213J0("/marriage-info ")).m185894m(utc0.create(Network.JSON, jSONObject.toString())).m185883b();
            }
        }).map(new w9j() { // from class: l.udb
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return roj0.f160388a;
            }
        });
    }

    /* JADX INFO: renamed from: i3 */
    public static /* synthetic */ void m169295i3(Throwable th) {
    }

    /* JADX INFO: renamed from: l4 */
    public static /* synthetic */ C22306c m169308l4(String str, String str2) {
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
        return ia20.m135121e(new v9j() { // from class: l.xcb
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4728a.f19494P.auth().m185898q(C4728a.m31213J0(string)).m185887f().m185883b();
            }
        }).compose(mkd0.m154951C());
    }

    /* JADX INFO: renamed from: q3 */
    public static /* synthetic */ AppealPostData m169327q3(List list, AppealPostData appealPostData) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Media media = (Media) it.next();
            if (TEnum.equals(media.status, "raw") && (media instanceof Picture)) {
                Picture picture = (Picture) media;
                if (picture.size == null || picture.mediaType == null) {
                    pgm pgmVar = new pgm(rhi.m179382z(picture.url));
                    picture.size = new Dimension(pgmVar.f148730d);
                    picture.mediaType = pgmVar.f148729c;
                }
            }
        }
        return appealPostData;
    }

    /* JADX INFO: renamed from: q4 */
    public static /* synthetic */ int m169328q4(List list, String str, String str2) {
        return !list.contains(str) ? -1 : 0;
    }

    /* JADX INFO: renamed from: r5 */
    public static /* synthetic */ C22306c m169333r5(w9j w9jVar, List list, AppealPostData appealPostData) {
        return (C22306c) w9jVar.call(list);
    }

    /* JADX INFO: renamed from: r6 */
    public static /* synthetic */ C22306c m169334r6(String str, final String str2) {
        final String str3 = "/icebreakings/" + str;
        return ia20.m135121e(new v9j() { // from class: l.vdb
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4728a.f19494P.auth().m185898q(C4728a.m31213J0(str3)).m185893l(utc0.create(Network.JSON, "{\"tipId\":\"" + str2 + "\"}")).m185883b();
            }
        }).compose(mkd0.m154951C());
    }

    /* JADX INFO: renamed from: u6 */
    public static /* synthetic */ GPMemo m169346u6(String str, GPMemo gPMemo) {
        if (gPMemo != null) {
            return gPMemo;
        }
        GPMemo gPMemoNew_ = GPMemo.new_();
        gPMemoNew_.otherUserId = str;
        gPMemoNew_.userId = str;
        gPMemoNew_.memo = "";
        return gPMemoNew_;
    }

    /* JADX INFO: renamed from: v6 */
    public static /* synthetic */ void m169350v6(Throwable th) {
        boolean z = th instanceof TantanException.Client.TantanForbidden;
        if (z) {
            TantanException.Client.TantanForbidden tantanForbidden = (TantanException.Client.TantanForbidden) th;
            if (tantanForbidden.isCannotModify()) {
                String str = tantanForbidden.message;
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                Application application = CoreModule.f17544b;
                application.startActivity(DialogAct.m79377O0(application, 1, str));
                return;
            }
        }
        if (z) {
            TantanException.Client.TantanForbidden tantanForbidden2 = (TantanException.Client.TantanForbidden) th;
            if (tantanForbidden2.isCannotModifyExceedLimt()) {
                tantanForbidden2.hasHandle = true;
                osi0.m165783g(CoreModule.f17544b.getString(R$string.f55762N));
                return;
            }
        }
        if (z) {
            TantanException.Client.TantanForbidden tantanForbidden3 = (TantanException.Client.TantanForbidden) th;
            if (tantanForbidden3.code == 40399) {
                osi0.m165783g(tantanForbidden3.message);
            }
        }
    }

    /* JADX INFO: renamed from: x5 */
    public static /* synthetic */ void m169357x5(Throwable th) {
    }

    /* JADX INFO: renamed from: y5 */
    public static /* synthetic */ List m169361y5(Envelope envelope) {
        List<UrlTag> list = ((CoreData) envelope.getModuleData(CoreData.class)).urlTags;
        if (!vwb.m200296J(list)) {
            ura.m195053e().m195057d().mo33666Cf(list);
        }
        return list;
    }

    /* JADX INFO: renamed from: z6 */
    public static /* synthetic */ void m169366z6(String str, User user) {
        if (user == null) {
            CoreModule.f17545c.f19648h0.m196253l3(str);
        }
    }

    /* JADX INFO: renamed from: A7 */
    public C22306c<roj0> m169367A7() {
        return this.f149245Q.scheduled("getMyTabTasks", 0, new v9j() { // from class: l.agb
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f69345a.m169546u8();
            }
        });
    }

    /* JADX INFO: renamed from: A8 */
    public final /* synthetic */ SettingGroups m169368A8(Envelope envelope) {
        m169454W9(qib0.f154713b0.f139230a.userId());
        if (vwb.m200296J(((CoreData) envelope.getModuleData(CoreData.class)).settingGroups)) {
            return m169527p9().settings.getSettingGroup();
        }
        this.f149253R.put(((CoreData) envelope.getModuleData(CoreData.class)).settingGroups.get(0));
        return ((CoreData) envelope.getModuleData(CoreData.class)).settingGroups.get(0);
    }

    /* JADX INFO: renamed from: A9 */
    public C22306c<SettingGroups> m169369A9(UserPushSettings userPushSettings) {
        SettingGroups settingGroups = new SettingGroups();
        settingGroups.push = userPushSettings;
        final UserSettingPatch userSettingPatch = new UserSettingPatch();
        userSettingPatch.settingGroups = settingGroups;
        userSettingPatch.type = "default";
        return m169431Q7(new v9j() { // from class: l.wbb
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4728a.f19494P.auth().m185898q(C4728a.m31337p1()).m185893l(utc0.create(Network.JSON, userSettingPatch.toJson())).m185883b();
            }
        }, -1, "patch_notification_settings");
    }

    /* JADX INFO: renamed from: Aa */
    public boolean m169370Aa(@Nullable User user) {
        Relationship relationship = user.localRelationship;
        return relationship == null || TEnum.equals(relationship.conversationStatus, "dismissed") || TEnum.equals(user.localRelationship.conversationStatus, "blocked") || TEnum.equals(user.localRelationship.conversationStatus, ConversationStatus.peeking_blocked);
    }

    /* JADX INFO: renamed from: B7 */
    public C22306c<roj0> m169371B7() {
        return this.f149245Q.scheduled("getMyTabTasksSceneAvatar", 0, new v9j() { // from class: l.sfb
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f164271a.m169554w8();
            }
        });
    }

    /* JADX INFO: renamed from: B8 */
    public final /* synthetic */ SettingGroups m169372B8(Envelope envelope) {
        m169454W9(qib0.f154713b0.f139230a.userId());
        if (vwb.m200296J(((CoreData) envelope.getModuleData(CoreData.class)).settingGroups)) {
            return m169527p9().settings.getSettingGroup();
        }
        this.f149253R.put(((CoreData) envelope.getModuleData(CoreData.class)).settingGroups.get(0));
        return ((CoreData) envelope.getModuleData(CoreData.class)).settingGroups.get(0);
    }

    /* JADX INFO: renamed from: B9 */
    public C22306c<roj0> m169373B9(boolean z) {
        SettingGroups settingGroups = new SettingGroups();
        UserPrivacySettings userPrivacySettings = new UserPrivacySettings();
        settingGroups.privacy = userPrivacySettings;
        userPrivacySettings.verifiedUserMsg = Boolean.valueOf(z);
        Settings settings = CoreModule.m29932K().me_().settings;
        if (settings == null) {
            return C22306c.just(roj0.f160388a);
        }
        return CoreModule.m29932K().patchSettings(settingGroups.subtract(settings.getSettingGroup()));
    }

    /* JADX INFO: renamed from: Ba */
    public void m169374Ba(final String str) {
        e51.m114774y(new Runnable() { // from class: l.vfb
            @Override // java.lang.Runnable
            public final void run() {
                this.f181257a.m169480d9(str);
            }
        });
    }

    /* JADX INFO: renamed from: C7 */
    public C22306c<roj0> m169375C7() {
        return this.f149245Q.scheduled("getMyTabTasksSceneEditInformation", 0, new v9j() { // from class: l.dgb
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f86068a.m169562y8();
            }
        });
    }

    /* JADX INFO: renamed from: C8 */
    public final /* synthetic */ C22306c m169376C8(v9j v9jVar) {
        return new la20((v9j<stc0>) v9jVar, true).compose(mkd0.m154951C()).map(new w9j() { // from class: l.vgb
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f181361a.m169372B8((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: C9 */
    public C22306c<SettingGroups> m169377C9(UserSubscriptionSettings userSubscriptionSettings) {
        SettingGroups settingGroups = new SettingGroups();
        settingGroups.subscription = userSubscriptionSettings;
        final UserSettingPatch userSettingPatch = new UserSettingPatch();
        userSettingPatch.settingGroups = settingGroups;
        userSettingPatch.type = "default";
        return m169431Q7(new v9j() { // from class: l.rfb
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4728a.f19494P.auth().m185898q(C4728a.m31337p1()).m185893l(utc0.create(Network.JSON, userSettingPatch.toJson())).m185883b();
            }
        }, -1, "patch_other_settings");
    }

    /* JADX INFO: renamed from: Ca */
    public void m169378Ca(String str, List<User> list) {
        if (NullChecker.m81303a(this.f149422m1)) {
            List<GPTopicCard> listM221515e = this.f149422m1.m221515e();
            if (vwb.m200296J(listM221515e)) {
                m169517n7();
                return;
            }
            for (GPTopicCard gPTopicCard : listM221515e) {
                if (TextUtils.equals(gPTopicCard.name, str)) {
                    ArrayList arrayList = new ArrayList();
                    if (!vwb.m200296J(list)) {
                        for (User user : vwb.m200334k0(list, 2)) {
                            if (!vwb.m200296J(user.pictures)) {
                                arrayList.add(user.picture(0));
                            }
                        }
                    }
                    gPTopicCard.pictures = arrayList;
                    break;
                }
            }
            this.f149422m1.m132487l(listM221515e);
        }
    }

    /* JADX INFO: renamed from: D7 */
    public C22306c<List<UrlTag>> m169379D7(List<String> list) {
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
        return this.f149245Q.scheduled("get_pic_tags", -1, new v9j() { // from class: l.fcb
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return ia20.m135117a(new v9j() { // from class: l.aeb
                    @Override // p149l.v9j, java.util.concurrent.Callable
                    public final Object call() {
                        return C4728a.f19494P.auth().m185898q(C4728a.m31200G("/dating/users/ideal-picture-tag")).m185893l(utc0.create(Network.JSON, jSONObject.toString())).m185883b();
                    }
                });
            }
        }).map(new w9j() { // from class: l.gcb
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return pib.m169361y5((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: D8 */
    public final /* synthetic */ roj0 m169380D8(String str, Envelope envelope) {
        User userM169433Q9 = m169433Q9(str);
        userM169433Q9.profile.api_only_mutualContacts = new PartialIdList();
        userM169433Q9.profile.api_only_mutualContacts.ids = vwb.m200303Q(((CoreData) envelope.getModuleData(CoreData.class)).contacts, new w9j() { // from class: l.tdb
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((Contact) obj).f56011id;
            }
        });
        userM169433Q9.profile.api_only_mutualContacts.links = envelope.pagination.links;
        ((CommonData) envelope.getModuleData(CommonData.class)).users = new ArrayList();
        ((CommonData) envelope.getModuleData(CommonData.class)).users.add(userM169433Q9);
        this.f149245Q.m31492w3(envelope, null);
        return roj0.f160388a;
    }

    /* JADX INFO: renamed from: D9 */
    public C22306c<roj0> m169381D9(SettingGroups settingGroups) {
        final UserSettingPatch userSettingPatch = new UserSettingPatch();
        userSettingPatch.type = "default";
        userSettingPatch.settingGroups = settingGroups;
        return this.f149245Q.scheduled("patch_settings", -1, new v9j() { // from class: l.ugb
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f176367a.m169408K8(userSettingPatch);
            }
        });
    }

    /* JADX INFO: renamed from: Da */
    public C22306c<Boolean> m169382Da(List<IdealTag> list) {
        if (vwb.m200296J(list)) {
            return C22306c.just(Boolean.FALSE);
        }
        User userM169527p9 = CoreModule.f17545c.f19639e0.m169527p9();
        final boolean zHasIdealInfo = userM169527p9.hasIdealInfo();
        User userMo223809clone = userM169527p9.mo223809clone();
        Profile profile = userMo223809clone.profile;
        if (profile.extensions == null) {
            profile.extensions = new Extensions();
        }
        Extensions extensions = userMo223809clone.profile.extensions;
        if (extensions.basic == null) {
            extensions.basic = new ProfileExtensionBasic();
        }
        ArrayList arrayList = new ArrayList();
        Iterator<IdealTag> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().f38760id);
        }
        List arrayList2 = userMo223809clone.profile.extensions.basic.idealType;
        if (arrayList2 == null) {
            arrayList2 = new ArrayList();
        }
        List<String> listM200328h0 = vwb.m200328h0(arrayList, arrayList2);
        if (vwb.m200296J(listM200328h0)) {
            return C22306c.just(Boolean.FALSE);
        }
        if (arrayList2.size() > 0) {
            listM200328h0.addAll(arrayList2);
        }
        userMo223809clone.profile.extensions.basic.idealType = listM200328h0;
        User userSubtract = userMo223809clone.subtract(userM169527p9);
        return userSubtract == null ? C22306c.just(Boolean.FALSE) : m169547u9(userSubtract).map(new w9j() { // from class: l.nib
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(!zHasIdealInfo);
            }
        }).doOnNext(new e30() { // from class: l.wab
            @Override // p149l.e30
            public final void call(Object obj) {
                CoreModule.f17545c.f19639e0.m169454W9(CoreModule.m29931H().userId());
            }
        });
    }

    /* JADX INFO: renamed from: E7 */
    public C22306c<RealFeelInfo> m169383E7(String str) {
        final String str2 = "/business/real/feel/" + str;
        return this.f149245Q.scheduled("getRealFeelInfo" + str, 0, new v9j() { // from class: l.xab
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return ia20.m135121e(new v9j() { // from class: l.ucb
                    @Override // p149l.v9j, java.util.concurrent.Callable
                    public final Object call() {
                        return C4728a.f19494P.auth().m185898q(C4728a.m31200G(str)).m185887f().m185883b();
                    }
                }).map(new w9j() { // from class: l.vcb
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return ((CoreData) ((Envelope) obj).getModuleData(CoreData.class)).realFeelInfo;
                    }
                });
            }
        }).compose(mkd0.m154951C());
    }

    /* JADX INFO: renamed from: E8 */
    public final /* synthetic */ C22306c m169384E8(final String str, final String str2) {
        return new la20(new v9j() { // from class: l.ocb
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4728a.f19494P.auth().m185898q(C4728a.m31246S0(str, str2)).m185887f().m185883b();
            }
        }).map(new w9j() { // from class: l.pcb
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f148163a.m169380D8(str, (Envelope) obj);
            }
        }).compose(C4728a.m31252T2());
    }

    /* JADX INFO: renamed from: E9 */
    public C22306c<roj0> m169385E9(User user) {
        return m169551v9(user, ura.m195053e().m195057d().mo33718Ln() ? "updateInterval" : null);
    }

    /* JADX INFO: renamed from: Ea */
    public void m169386Ea(final String str, final long j) {
        e51.m114774y(new Runnable() { // from class: l.hib
            @Override // java.lang.Runnable
            public final void run() {
                this.f107897a.m169483e9(str, j);
            }
        });
    }

    /* JADX INFO: renamed from: F7 */
    public C22306c<roj0> m169387F7() {
        return this.f149245Q.scheduled("getRealPictureAward", -1, new v9j() { // from class: l.seb
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return ia20.m135117a(new v9j() { // from class: l.zeb
                    @Override // p149l.v9j, java.util.concurrent.Callable
                    public final Object call() {
                        return C4728a.f19494P.auth().m185898q(C4728a.m31200G("/real_pictures/privilege")).m185893l(utc0.create(Network.JSON, "")).m185883b();
                    }
                }).map(new w9j() { // from class: l.afb
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return roj0.f160388a;
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: F8 */
    public final /* synthetic */ roj0 m169388F8(Envelope envelope) {
        this.f149245Q.m31494y3(envelope, null, false, false, true);
        return roj0.f160388a;
    }

    /* JADX INFO: renamed from: F9 */
    public C22306c<SettingGroups> m169389F9(double d, double d2) {
        final JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("latitude", d);
            jSONObject2.put("longitude", d2);
            jSONObject.put("momentRoamingLocation", jSONObject2);
        } catch (JSONException e) {
            CrashHelper.m81296c(e);
        }
        return m169431Q7(new v9j() { // from class: l.xgb
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4728a.f19494P.auth().m185898q(C4728a.m31341q1()).m185893l(utc0.create(Network.JSON, jSONObject.toString())).m185883b();
            }
        }, -1, "patch_vip_search_settings");
    }

    /* JADX INFO: renamed from: Fa */
    public void m169390Fa(String str, String str2) {
        Map<String, GPMemo> mapM169423O7 = m169423O7();
        if (mapM169423O7 == null) {
            mapM169423O7 = new HashMap<>();
        }
        GPMemo gPMemo = mapM169423O7.get(str);
        if (gPMemo == null) {
            GPMemo gPMemoNew_ = GPMemo.new_();
            gPMemoNew_.userId = str;
            gPMemoNew_.otherUserId = str;
            gPMemoNew_.memo = str2;
            mapM169423O7.put(str, gPMemoNew_);
        } else {
            gPMemo.memo = str2;
        }
        this.f149380g7.m121229A(mapM169423O7);
    }

    /* JADX INFO: renamed from: G7 */
    public C22306c<RealPicturesInfo> m169391G7() {
        return this.f149245Q.scheduled("getRealPictureTaskInfo", 0, new v9j() { // from class: l.ohb
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return ia20.m135117a(new v9j() { // from class: l.lbb
                    @Override // p149l.v9j, java.util.concurrent.Callable
                    public final Object call() {
                        return C4728a.f19494P.auth().m185898q(C4728a.m31200G("/real_pictures/info")).m185887f().m185883b();
                    }
                }).map(new w9j() { // from class: l.mbb
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return ((CoreData) ((Envelope) obj).getModuleData(CoreData.class)).realPicturesInfo;
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: G8 */
    public final /* synthetic */ C22306c m169392G8(String str) {
        return m169243U9(str).map(new w9j() { // from class: l.zhb
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f203157a.m169388F8((Envelope) obj);
            }
        }).compose(C4728a.m31252T2());
    }

    /* JADX INFO: renamed from: G9 */
    public C22306c<Envelope> m169393G9(@NonNull String str, final int i, String str2) {
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
        return this.f149245Q.scheduled("photoModelChecking" + mqi0.m155944o(), -1, new v9j() { // from class: l.ndb
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return ia20.m135121e(new v9j() { // from class: l.heb
                    @Override // p149l.v9j, java.util.concurrent.Callable
                    public final Object call() {
                        return C4728a.f19494P.auth().m185898q(C4728a.m31200G("/user/picture/" + i + "/sift")).m185893l(utc0Var).m185883b();
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: Ga */
    public C22306c<roj0> m169394Ga(final String str, final String str2) {
        String string;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("memo", str2);
            string = jSONObject.toString();
        } catch (JSONException e) {
            CrashHelper.m81296c(e);
            string = "";
        }
        final utc0 utc0VarCreate = utc0.create(Network.JSON, string);
        return now("updateMemos_patch/" + str, ia20.m135117a(new v9j() { // from class: l.uhb
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4728a.f19494P.auth().m185898q(C4728a.m31191D2(CoreModule.m29931H().userId() + "/memos/" + str)).m185894m(utc0VarCreate).m185883b();
            }
        }).map(new w9j() { // from class: l.vhb
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return roj0.f160388a;
            }
        }).doOnNext(new e30() { // from class: l.whb
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f186378a.m169487f9(str, str2, (roj0) obj);
            }
        }), true);
    }

    /* JADX INFO: renamed from: H7 */
    public void m169395H7() {
        if (ura.m195053e().m195057d().mo33938vi()) {
            this.f149245Q.scheduled("/users/me/profile/avatar", 0, new v9j() { // from class: l.bib
                @Override // p149l.v9j, java.util.concurrent.Callable
                public final Object call() {
                    return ia20.m135121e(new v9j() { // from class: l.hcb
                        @Override // p149l.v9j, java.util.concurrent.Callable
                        public final Object call() {
                            return C4728a.f19494P.auth().m185898q(C4728a.m31213J0("/profile/avatar")).m185887f().m185883b();
                        }
                    });
                }
            }).subscribe(new e30() { // from class: l.cib
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f81051a.m169566z8((Envelope) obj);
                }
            }, new e30() { // from class: l.eib
                @Override // p149l.e30
                public final void call(Object obj) {
                    pib.m169295i3((Throwable) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: H8 */
    public final /* synthetic */ roj0 m169396H8(Envelope envelope) {
        this.f149245Q.m31494y3(envelope, null, false, false, true);
        w85.INSTANCE.m202144k(null);
        return roj0.f160388a;
    }

    /* JADX INFO: renamed from: H9 */
    public C22306c<roj0> m169397H9() {
        return this.f149245Q.now(new la20(new v9j() { // from class: l.ccb
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4728a.f19494P.auth().m185898q(C4728a.m31374y2(CoreModule.m29931H().userId())).m185887f().m185883b();
            }
        }).map(new w9j() { // from class: l.ncb
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f138146a.m169412L8((Envelope) obj);
            }
        }).compose(C4728a.m31252T2()));
    }

    /* JADX INFO: renamed from: Ha */
    public C22306c<roj0> m169398Ha(boolean z) {
        UserLiveSettings userLiveSettingsNew_ = UserLiveSettings.new_();
        userLiveSettingsNew_.hideDiamondTag = Boolean.valueOf(z);
        SettingGroups settingGroupsNew_ = SettingGroups.new_();
        settingGroupsNew_.live = userLiveSettingsNew_;
        final UserSettingPatch userSettingPatchNew_ = UserSettingPatch.new_();
        userSettingPatchNew_.settingGroups = settingGroupsNew_;
        userSettingPatchNew_.type = "default";
        return this.f149245Q.now(new la20(new v9j() { // from class: l.pdb
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4728a.f19494P.auth().m185898q(C4728a.m31286c2()).m185892k(utc0.create(Network.JSON, userSettingPatchNew_.toJson())).m185883b();
            }
        }).map(new w9j() { // from class: l.qdb
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return roj0.f160388a;
            }
        }).compose(C4728a.m31252T2()));
    }

    /* JADX INFO: renamed from: I7 */
    public Integer m169399I7() {
        return this.f149269T.get();
    }

    /* JADX INFO: renamed from: I8 */
    public final /* synthetic */ C22306c m169400I8(String str, String str2) {
        return m169450V9(str, str2).map(new w9j() { // from class: l.ogb
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f143851a.m169396H8((Envelope) obj);
            }
        }).compose(C4728a.m31252T2());
    }

    /* JADX INFO: renamed from: I9 */
    public C22306c<Envelope> m169401I9(final String str, final String str2) {
        return this.f149245Q.scheduled("icebreakings/userId" + str + "/tipId" + str2, 0, new v9j() { // from class: l.rcb
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return pib.m169334r6(str, str2);
            }
        });
    }

    /* JADX INFO: renamed from: Ia */
    public C22306c<roj0> m169402Ia() {
        return this.f149245Q.scheduled("uploadMarryEditProfileUnSave", -1, new v9j() { // from class: l.vab
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return pib.m169290g6();
            }
        });
    }

    /* JADX INFO: renamed from: J7 */
    public C22306c<SettingGroups> m169403J7() {
        return m169431Q7(new v9j() { // from class: l.gbb
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4728a.f19494P.auth().m185898q(C4728a.m31286c2() + "?type=default").m185887f().m185883b();
            }
        }, 0, "get_other_settings");
    }

    /* JADX INFO: renamed from: J8 */
    public final /* synthetic */ roj0 m169404J8(Envelope envelope) {
        m169454W9(qib0.f154713b0.f139230a.userId());
        if (!vwb.m200296J(((CoreData) envelope.getModuleData(CoreData.class)).settingGroups)) {
            this.f149253R.put(((CoreData) envelope.getModuleData(CoreData.class)).settingGroups.get(0));
        }
        return roj0.f160388a;
    }

    /* JADX INFO: renamed from: J9 */
    public void m169405J9() {
        this.f149348c7.m132487l(roj0.f160388a);
    }

    /* JADX INFO: renamed from: Ja */
    public void m169406Ja(final String str, final Picture picture) {
        new lsx(vwb.m200324f0(picture), 10000, 0, Bitmap.CompressFormat.JPEG, true).filter(new w9j() { // from class: l.egb
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return pib.m169183F6((List) obj);
            }
        }).flatMap(new w9j() { // from class: l.fgb
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return qib0.f154714c0.mo97509Y1(picture);
            }
        }).compose(mkd0.m154951C()).subscribe(mkd0.m154956H(new e30() { // from class: l.ggb
            @Override // p149l.e30
            public final void call(Object obj) {
                pib.m169182F5(str, (Picture) obj);
            }
        }, new e30() { // from class: l.hgb
            @Override // p149l.e30
            public final void call(Object obj) {
                pib.m169263a5((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: K7 */
    public C22306c<SettingGroups> m169407K7() {
        return now("get_other_settings", new la20((v9j<stc0>) new v9j() { // from class: l.ibb
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4728a.f19494P.auth().m185898q(C4728a.m31286c2() + "?type=default").m185887f().m185883b();
            }
        }, true).compose(mkd0.m154951C()).map(new w9j() { // from class: l.jbb
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f117171a.m169368A8((Envelope) obj);
            }
        }).doOnNext(new e30() { // from class: l.kbb
            @Override // p149l.e30
            public final void call(Object obj) {
                pib.m169216O3((SettingGroups) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: K8 */
    public final /* synthetic */ C22306c m169408K8(UserSettingPatch userSettingPatch) {
        return m169437R9(userSettingPatch.toJson()).map(new w9j() { // from class: l.fib
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f97649a.m169404J8((Envelope) obj);
            }
        }).compose(C4728a.m31252T2());
    }

    /* JADX INFO: renamed from: K9 */
    public C22306c<SettingGroups> m169409K9(String str, boolean z, int i, int i2) {
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
            userLiveSettings.voiceNotification = "none";
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
        userSettingPatch.type = "default";
        return m169431Q7(new v9j() { // from class: l.phb
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4728a.f19494P.auth().m185898q(C4728a.m31337p1()).m185893l(utc0.create(Network.JSON, userSettingPatch.toJson())).m185883b();
            }
        }, -1, "user_push_settings");
    }

    /* JADX INFO: renamed from: Ka */
    public C22306c<User> m169410Ka(final String str) {
        return qib0.f154722k0.f176631d.uiGet(str).doOnNext(new e30() { // from class: l.cfb
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f80548a.m169491g9(str, (User) obj);
            }
        }).filter(new w9j() { // from class: l.pfb
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((User) obj) != null);
            }
        });
    }

    /* JADX INFO: renamed from: L7 */
    public C22306c<List<Relationship>> m169411L7(final String str) {
        return this.f149245Q.scheduled("onlineMatchGetUserById/" + str, 0, new v9j() { // from class: l.tfb
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return pib.m169243U9(str).map(new w9j() { // from class: l.yab
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return ((CoreData) ((Envelope) obj).getModuleData(CoreData.class)).relationships;
                    }
                }).compose(C4728a.m31252T2());
            }
        });
    }

    /* JADX INFO: renamed from: L8 */
    public final /* synthetic */ roj0 m169412L8(Envelope envelope) {
        ura.m195053e().m195057d().mo33787Y7(envelope, Counter.TYPE);
        this.f149245Q.m31492w3(envelope, null);
        return roj0.f160388a;
    }

    /* JADX INFO: renamed from: L9 */
    public void m169413L9(String str, List<LiteraturesComments> list) {
        if (vwb.m200296J(list)) {
            this.f149252Q6.put(str, new ArrayList());
            if (TextUtils.equals(str, CoreModule.m29931H().userId())) {
                m169448V6();
                return;
            }
            return;
        }
        List<LiteraturesComments> arrayList = new ArrayList<>();
        for (LiteraturesComments literaturesComments : list) {
            if (!NullChecker.m81303a(literaturesComments) || !NullChecker.m81303a(literaturesComments.localLiteratures) || TextUtils.isEmpty(literaturesComments.localLiteratures.f20433id) || arrayList.contains(literaturesComments)) {
                lsi0.m151583m("localLiteratures 数据异常 请联系开发");
            } else {
                arrayList.add(literaturesComments);
            }
        }
        this.f149252Q6.put(str, arrayList);
        if (TextUtils.equals(str, CoreModule.m29931H().userId())) {
            m169532qa();
        }
    }

    /* JADX INFO: renamed from: La */
    public C22306c<GPMemo> m169414La(final String str) {
        return this.f149380g7.m121230k().filter(new w9j() { // from class: l.mfb
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m81303a((Map) obj));
            }
        }).map(new w9j() { // from class: l.nfb
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return pib.m169191H6(str, (Map) obj);
            }
        }).map(new w9j() { // from class: l.ofb
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return pib.m169346u6(str, (GPMemo) obj);
            }
        }).distinctUntilChanged(new w9j() { // from class: l.qfb
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((GPMemo) obj).memo;
            }
        }).observeOn(jo0.m142408a());
    }

    /* JADX INFO: renamed from: M7 */
    public User m169415M7(String str) {
        return e51.m114739D() ? m169430Pa(str) : m169433Q9(str);
    }

    /* JADX INFO: renamed from: M8 */
    public final /* synthetic */ roj0 m169416M8(String str, Envelope envelope) {
        if (ura.m195053e().m195057d().mo33802b()) {
            CoreModule.m29936Q().putLiveState(((CommonData) envelope.getModuleData(CommonData.class)).users);
        }
        m169531q9(str, envelope);
        this.f149245Q.m31494y3(envelope, null, false, false, true);
        return roj0.f160388a;
    }

    /* JADX INFO: renamed from: M9 */
    public void m169417M9(String str, Literatures literatures) {
        this.f149260R6.put(str, literatures);
    }

    /* JADX INFO: renamed from: Ma */
    public C22306c<User> m169418Ma(final String str) {
        return qib0.f154722k0.f176631d.uiGet(str).doOnNext(new e30() { // from class: l.zfb
            @Override // p149l.e30
            public final void call(Object obj) {
                pib.m169366z6(str, (User) obj);
            }
        });
    }

    /* JADX INFO: renamed from: N7 */
    public C22306c<Map<String, GPMemo>> m169419N7() {
        return this.f149380g7.m121230k();
    }

    /* JADX INFO: renamed from: N8 */
    public final /* synthetic */ C22306c m169420N8(final String str, boolean z, boolean z2) {
        return m169235S9(str, z, z2).map(new w9j() { // from class: l.kgb
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f123019a.m169416M8(str, (Envelope) obj);
            }
        }).compose(C4728a.m31252T2());
    }

    @Nullable
    /* JADX INFO: renamed from: N9 */
    public LiteraturesComments m169421N9(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return null;
        }
        List<LiteraturesComments> listM169489g7 = m169489g7(str);
        if (vwb.m200296J(listM169489g7)) {
            return null;
        }
        for (LiteraturesComments literaturesComments : listM169489g7) {
            if (TextUtils.equals(literaturesComments.literatureID, str2)) {
                return literaturesComments;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: Na */
    public C22306c<roj0> m169422Na(final String str) {
        return this.f149245Q.scheduled("users/" + str + Passby.TYPE, 0, new v9j() { // from class: l.igb
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f113094a.m169499i9(str);
            }
        });
    }

    /* JADX INFO: renamed from: O7 */
    public Map<String, GPMemo> m169423O7() {
        Map<String, GPMemo> mapM121233n = this.f149380g7.m121233n();
        return mapM121233n == null ? new HashMap() : mapM121233n;
    }

    /* JADX INFO: renamed from: O8 */
    public final /* synthetic */ roj0 m169424O8(Envelope envelope) {
        if (!vwb.m200296J(((CoreData) envelope.getModuleData(CoreData.class)).appealInfos)) {
            this.f149148C0.m132487l(((CoreData) envelope.getModuleData(CoreData.class)).appealInfos.get(0));
        }
        return roj0.f160388a;
    }

    @NonNull
    /* JADX INFO: renamed from: O9 */
    public List<LiteraturesComments> m169425O9(String str, String str2) {
        ArrayList arrayList = new ArrayList();
        LiteraturesComments literaturesCommentsM169421N9 = m169421N9(str, str2);
        if (literaturesCommentsM169421N9 != null) {
            arrayList.add(literaturesCommentsM169421N9);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: Oa */
    public C22306c<roj0> m169426Oa(final String str) {
        return this.f149245Q.scheduled("userWithRelationship/" + str, 0, new v9j() { // from class: l.tgb
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f170080a.m169507k9(str);
            }
        });
    }

    /* JADX INFO: renamed from: P8 */
    public final /* synthetic */ C22306c m169428P8() {
        return ia20.m135117a(new v9j() { // from class: l.qgb
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4728a.f19494P.auth().m185898q(C4728a.m31366w2("/me/appeal-info")).m185883b();
            }
        }).map(new w9j() { // from class: l.rgb
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f159236a.m169424O8((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: P9 */
    public User m169429P9() {
        return qib0.f154722k0.f176631d.query(this.f149142B1);
    }

    /* JADX INFO: renamed from: Pa */
    public User m169430Pa(String str) {
        return qib0.f154722k0.f176631d.queryCache(str);
    }

    /* JADX INFO: renamed from: Q7 */
    public final C22306c<SettingGroups> m169431Q7(final v9j<stc0> v9jVar, int i, String str) {
        return scheduled(str, i, new v9j() { // from class: l.lfb
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f127860a.m169376C8(v9jVar);
            }
        });
    }

    /* JADX INFO: renamed from: Q8 */
    public final /* synthetic */ roj0 m169432Q8(Envelope envelope) {
        if (!vwb.m200296J(((CoreData) envelope.getModuleData(CoreData.class)).appealInfos)) {
            this.f149155D0.m132487l(((CoreData) envelope.getModuleData(CoreData.class)).appealInfos.get(0));
        }
        return roj0.f160388a;
    }

    /* JADX INFO: renamed from: Q9 */
    public User m169433Q9(String str) {
        return qib0.f154722k0.f176631d.query(str);
    }

    /* JADX INFO: renamed from: Qa */
    public C22306c<Meta> m169434Qa(final String str) {
        return this.f149245Q.now(ia20.m135117a(new v9j() { // from class: l.xbb
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4728a.f19494P.auth().m185898q(C4728a.m31275a("/qrcode/verify")).m185893l(utc0.create(Network.JSON, "{\"clientId\":\"100032\",\"value\":\"" + str + "\"}")).m185883b();
            }
        }).map(new w9j() { // from class: l.ybb
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((Envelope) obj).meta;
            }
        }));
    }

    /* JADX INFO: renamed from: R7 */
    public C22306c<CurrencyTypeData> m169435R7() {
        return this.f149372f7.m121230k();
    }

    /* JADX INFO: renamed from: R8 */
    public final /* synthetic */ C22306c m169436R8() {
        return ia20.m135117a(new v9j() { // from class: l.dfb
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4728a.f19494P.auth().m185898q(C4728a.m31366w2("/me/appeal-fake-info")).m185883b();
            }
        }).map(new w9j() { // from class: l.efb
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f90816a.m169432Q8((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: R9 */
    public final C22306c<Envelope> m169437R9(final String str) {
        return new la20(new v9j() { // from class: l.qbb
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4728a.f19494P.auth().m185898q(C4728a.m31337p1()).m185893l(utc0.create(Network.JSON, str)).m185883b();
            }
        }).doOnError(new e30() { // from class: l.sbb
            @Override // p149l.e30
            public final void call(Object obj) {
                pib.m169178E5((Throwable) obj);
            }
        });
    }

    /* JADX INFO: renamed from: Ra */
    public C22306c<WechatNotifySetting> m169438Ra() {
        return this.f149245Q.scheduled("wechat_setting_status", 0, new v9j() { // from class: l.yfb
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f198026a.m169515m9();
            }
        });
    }

    /* JADX INFO: renamed from: S6 */
    public void m169439S6(@NonNull ChatPartnerScene chatPartnerScene) {
        final String string = Uri.parse(C4728a.m31213J0("/chat-partners")).buildUpon().appendQueryParameter("scene", chatPartnerScene.getValue()).build().toString();
        final utc0 utc0VarCreate = utc0.create(Network.JSON, "");
        this.f149245Q.scheduled("chatPartnersDialogShow" + CoreModule.m29931H().userId(), -1, new v9j() { // from class: l.icb
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return ia20.m135121e(new v9j() { // from class: l.deb
                    @Override // p149l.v9j, java.util.concurrent.Callable
                    public final Object call() {
                        return C4728a.f19494P.auth().m185898q(str).m185893l(utc0Var).m185883b();
                    }
                }).compose(mkd0.m154951C());
            }
        });
    }

    /* JADX INFO: renamed from: S7 */
    public C22306c<roj0> m169440S7() {
        return this.f149245Q.now(ia20.m135117a(new v9j() { // from class: l.wfb
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4728a.f19494P.auth().m185898q(C4728a.m31366w2("/me/sales")).m185893l(utc0.create(Network.JSON, "")).m185883b();
            }
        }).map(new w9j() { // from class: l.xfb
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return roj0.f160388a;
            }
        }).compose(mkd0.m154951C()));
    }

    /* JADX INFO: renamed from: S8 */
    public final /* synthetic */ roj0 m169441S8(Envelope envelope) {
        LoveLetterEntryInfo loveLetterEntryInfo = ((CoreData) envelope.getModuleData(CoreData.class)).loveLetter;
        if (loveLetterEntryInfo != null) {
            this.f149279U1.m132487l(loveLetterEntryInfo);
        }
        return roj0.f160388a;
    }

    /* JADX INFO: renamed from: T6 */
    public C22306c<String> m169442T6() {
        return this.f149285V.onBackpressureLatest().observeOn(jo0.m142408a());
    }

    /* JADX INFO: renamed from: T7 */
    public boolean m169443T7(String str) {
        return !TextUtils.isEmpty(str) && NullChecker.m81303a(m169421N9(CoreModule.m29931H().userId(), str));
    }

    /* JADX INFO: renamed from: T8 */
    public final /* synthetic */ C22306c m169444T8() {
        return ia20.m135117a(new v9j() { // from class: l.qeb
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4728a.f19494P.auth().m185898q(C4728a.m31200G("/love_letter/info")).m185887f().m185883b();
            }
        }).map(new w9j() { // from class: l.bfb
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f75288a.m169441S8((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: U6 */
    public void m169445U6() {
        this.f149325a0.put("");
    }

    /* JADX INFO: renamed from: U7 */
    public boolean m169446U7() {
        List<LiteraturesComments> listM169489g7 = m169489g7(CoreModule.m29931H().userId());
        boolean z = true;
        if (!vwb.m200296J(listM169489g7) && listM169489g7.size() >= this.f149245Q.f19682s1.f20082S.get().intValue()) {
            z = false;
        }
        if (!z) {
            lsi0.m151595y("您添加的作品数量已达上限");
        }
        return z;
    }

    /* JADX INFO: renamed from: U8 */
    public final /* synthetic */ C22306c m169447U8(String str, utc0 utc0Var) {
        return ia20.m135121e(new C19224d(str, utc0Var)).observeOn(jo0.m142408a());
    }

    /* JADX INFO: renamed from: V6 */
    public final void m169448V6() {
        CoreModule.f17545c.f19639e0.f149391i2.put("");
    }

    /* JADX INFO: renamed from: V8 */
    public final /* synthetic */ void m169449V8(Boolean bool) {
        m169454W9(CoreModule.m29931H().userId());
    }

    /* JADX INFO: renamed from: V9 */
    public C22306c<Envelope> m169450V9(final String str, String str2) {
        final String strM31250T0;
        if (TextUtils.isEmpty(str2)) {
            strM31250T0 = C4728a.m31250T0();
        } else {
            strM31250T0 = C4728a.m31250T0() + "&with=" + str2;
        }
        return new la20(new v9j() { // from class: l.ygb
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4728a.f19494P.auth().m185898q(strM31250T0).m185893l(utc0.create(Network.JSON, str)).m185883b();
            }
        }).doOnError(new e30() { // from class: l.zgb
            @Override // p149l.e30
            public final void call(Object obj) {
                pib.m169350v6((Throwable) obj);
            }
        });
    }

    /* JADX INFO: renamed from: W6 */
    public C22306c<roj0> m169451W6(String str) {
        String string;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("kind", "exclusive");
            jSONObject.put("content", str);
            string = jSONObject.toString();
        } catch (JSONException e) {
            CrashHelper.m81296c(e);
            string = "";
        }
        final utc0 utc0VarCreate = utc0.create(Network.JSON, string);
        return this.f149245Q.scheduled("icebreakings/post/" + CoreModule.m29931H().userId(), -1, new v9j() { // from class: l.oeb
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return ia20.m135121e(new v9j() { // from class: l.veb
                    @Override // p149l.v9j, java.util.concurrent.Callable
                    public final Object call() {
                        return C4728a.f19494P.auth().m185898q(C4728a.m31213J0("/icebreakings")).m185893l(utc0Var).m185883b();
                    }
                }).map(new w9j() { // from class: l.web
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return roj0.f160388a;
                    }
                }).compose(mkd0.m154951C());
            }
        });
    }

    /* JADX INFO: renamed from: W7 */
    public boolean m169452W7() {
        User userM169520na = m169520na();
        return NullChecker.m81303a(userM169520na) && !vwb.m200296J(userM169520na.status) && userM169520na.status.contains(UserStatus.get(UserStatus.RISK_TAG_FAKE_GENDER)) && !App.f15373i.get().equals(this.f149245Q.f19639e0.m169399I7());
    }

    /* JADX INFO: renamed from: W8 */
    public final /* synthetic */ FakeGuideData m169453W8(Envelope envelope) {
        FakeGuideData fakeGuideData = ((CoreData) envelope.getModuleData(CoreData.class)).fakeGuideData;
        this.f149292V6.m132487l(fakeGuideData);
        return fakeGuideData;
    }

    /* JADX INFO: renamed from: W9 */
    public C22306c<roj0> m169454W9(String str) {
        return m169458X9(str, false);
    }

    /* JADX INFO: renamed from: X6 */
    public void m169455X6(String str, String str2, ConversationStatus conversationStatus) {
        m169459Y6(str, str2, conversationStatus, MatchFrom.get("unknown_"));
    }

    /* JADX INFO: renamed from: X7 */
    public C22392a<Boolean> m169456X7() {
        if (this.f149310Y0 == null) {
            this.f149310Y0 = C22392a.m221513c(Boolean.valueOf(na30.m158578a() && (App.f15373i.get().intValue() <= 3 || this.f149245Q.f19639e0.f149302X0.get().booleanValue())));
        }
        return this.f149310Y0;
    }

    /* JADX INFO: renamed from: X8 */
    public final /* synthetic */ C22306c m169457X8() {
        return ia20.m135117a(new v9j() { // from class: l.ghb
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4728a.f19494P.auth().m185898q(C4728a.m31200G("/antispam/guide-change-avatar")).m185887f().m185883b();
            }
        }).map(new w9j() { // from class: l.ihb
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f113227a.m169453W8((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: X9 */
    public C22306c<roj0> m169458X9(String str, boolean z) {
        return m169462Y9(str, z, false);
    }

    /* JADX INFO: renamed from: Y6 */
    public void m169459Y6(String str, String str2, ConversationStatus conversationStatus, MatchFrom matchFrom) {
        User userQuery = qib0.f154722k0.f176631d.query(str);
        if (userQuery == null) {
            return;
        }
        if (userQuery.localRelationship == null) {
            Relationship relationshipNew_ = Relationship.new_();
            relationshipNew_.conversationStatus = conversationStatus;
            relationshipNew_.convType = str2;
            userQuery.localRelationship = relationshipNew_;
        } else {
            boolean zMo33808c = ura.m195053e().m195057d().mo33808c();
            boolean zEquals = "quickchat".equals(str2);
            if (!zMo33808c || (!zEquals && !TEnum.equals(conversationStatus, "blocked"))) {
                Relationship relationship = userQuery.localRelationship;
                relationship.conversationStatus = conversationStatus;
                relationship.convType = str2;
            } else if (zEquals) {
                if (!TEnum.equals(userQuery.localRelationship.conversationStatus, ConversationStatus.peeking) && !TEnum.equals(userQuery.localRelationship.conversationStatus, ConversationStatus.peeking_blocked)) {
                    Relationship relationship2 = userQuery.localRelationship;
                    relationship2.conversationStatus = conversationStatus;
                    relationship2.convType = str2;
                }
            } else if (TEnum.equals(conversationStatus, "blocked")) {
                if (TEnum.equals(userQuery.localRelationship.conversationStatus, ConversationStatus.peeking) || TEnum.equals(userQuery.localRelationship.conversationStatus, ConversationStatus.peeking_blocked)) {
                    userQuery.localRelationship.conversationStatus = ConversationStatus.get(ConversationStatus.peeking_blocked);
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
        qib0.f154722k0.f176631d.upsert(userQuery);
    }

    /* JADX INFO: renamed from: Y7 */
    public boolean m169460Y7() {
        User userM169520na = m169520na();
        return NullChecker.m81303a(userM169520na) && !vwb.m200296J(userM169520na.status) && userM169520na.status.contains(UserStatus.get(UserStatus.RISK_TAG_VIOLATION)) && !App.f15373i.get().equals(this.f149245Q.f19639e0.m169399I7());
    }

    /* JADX INFO: renamed from: Y8 */
    public final /* synthetic */ roj0 m169461Y8(AppealPostData appealPostData, Envelope envelope) {
        if (!TextUtils.equals(appealPostData.appeal_type, "jailed")) {
            this.f149245Q.m31492w3(envelope, null);
        }
        return roj0.f160388a;
    }

    /* JADX INFO: renamed from: Y9 */
    public C22306c<roj0> m169462Y9(final String str, final boolean z, final boolean z2) {
        return this.f149245Q.scheduled("users/" + str, 0, new v9j() { // from class: l.shb
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f164536a.m169420N8(str, z, z2);
            }
        });
    }

    /* JADX INFO: renamed from: Z6 */
    public C22306c<roj0> m169463Z6(String str, String str2) {
        String string;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("tipId", str);
            jSONObject.put("content", str2);
            string = jSONObject.toString();
        } catch (JSONException e) {
            CrashHelper.m81296c(e);
            string = "";
        }
        final utc0 utc0VarCreate = utc0.create(Network.JSON, string);
        return this.f149245Q.scheduled("icebreakings/put/" + CoreModule.m29931H().userId(), -1, new v9j() { // from class: l.ieb
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return ia20.m135121e(new v9j() { // from class: l.xeb
                    @Override // p149l.v9j, java.util.concurrent.Callable
                    public final Object call() {
                        return C4728a.f19494P.auth().m185898q(C4728a.m31213J0("/icebreakings")).m185894m(utc0Var).m185883b();
                    }
                }).map(new w9j() { // from class: l.yeb
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return roj0.f160388a;
                    }
                }).compose(mkd0.m154951C());
            }
        });
    }

    /* JADX INFO: renamed from: Z7 */
    public boolean m169464Z7() {
        User userM169520na = m169520na();
        return NullChecker.m81303a(userM169520na) && !vwb.m200296J(userM169520na.status) && userM169520na.status.contains(UserStatus.get(UserStatus.RISK_TAG_UNREAL)) && !App.f15373i.get().equals(this.f149245Q.f19639e0.m169399I7());
    }

    /* JADX INFO: renamed from: Z8 */
    public final /* synthetic */ C22306c m169465Z8(final AppealPostData appealPostData, final AppealPostData appealPostData2) {
        return new la20(new v9j() { // from class: l.eeb
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4728a.f19494P.auth().m185898q(C4728a.m31366w2("/me/appeal-material")).m185893l(utc0.create(Network.JSON, appealPostData.toJson())).m185883b();
            }
        }).map(new w9j() { // from class: l.geb
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f102180a.m169461Y8(appealPostData2, (Envelope) obj);
            }
        }).compose(mkd0.m154951C());
    }

    /* JADX INFO: renamed from: Z9 */
    public C22306c<roj0> m169466Z9() {
        return this.f149245Q.scheduled("me/appeal-info", 0, new v9j() { // from class: l.oib
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f144101a.m169428P8();
            }
        });
    }

    /* JADX INFO: renamed from: a7 */
    public C22306c<UserFeedbackInfo> m169467a7(final String str) {
        final String str2 = "/quality/fake/picture/pop";
        return this.f149245Q.scheduled("/quality/fake/picture/pop" + str, -1, new v9j() { // from class: l.dhb
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f86249a.m169510l8(str, str2);
            }
        });
    }

    /* JADX INFO: renamed from: a8 */
    public boolean m169468a8() {
        return TextUtils.equals(this.f149245Q.f19639e0.f149321Z3.get(), UserHomeMode.marryMode);
    }

    /* JADX INFO: renamed from: a9 */
    public final /* synthetic */ C22306c m169469a9(final AppealPostData appealPostData, final AppealPostData appealPostData2) {
        return this.f149245Q.scheduled("/me/appeal-material", -1, new v9j() { // from class: l.odb
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f143194a.m169465Z8(appealPostData2, appealPostData);
            }
        });
    }

    /* JADX INFO: renamed from: aa */
    public C22306c<roj0> m169470aa() {
        return this.f149245Q.scheduled("me/appeal-fake-info", 0, new v9j() { // from class: l.ueb
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f176021a.m169436R8();
            }
        });
    }

    /* JADX INFO: renamed from: b7 */
    public C22306c<roj0> m169471b7(String str, final String str2, final boolean z, final boolean z2) {
        final String str3 = "/quality/feedback/" + str + "/picture";
        return this.f149245Q.scheduled("picture_feed_back:" + str + z, -1, new v9j() { // from class: l.iib
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return ia20.m135121e(new v9j() { // from class: l.cdb
                    @Override // p149l.v9j, java.util.concurrent.Callable
                    public final Object call() {
                        return pib.m169206L5(str, z, z, str);
                    }
                }).map(new w9j() { // from class: l.ddb
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return roj0.f160388a;
                    }
                }).compose(mkd0.m154951C());
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0041  */
    /* JADX INFO: renamed from: b8 */
    public boolean m169472b8(boolean z) {
        byte b;
        VerificationCenter verificationCenterM31612k4 = CoreModule.f17545c.f19552B0.m31612k4();
        byte b2 = -1;
        if (!NullChecker.m81303a(verificationCenterM31612k4) || !NullChecker.m81303a(verificationCenterM31612k4.picVerificationInfo)) {
            b = -1;
        } else if (TEnum.equals(verificationCenterM31612k4.picVerificationInfo.status, "verified")) {
            b = 1;
        } else if (TEnum.equals(verificationCenterM31612k4.picVerificationInfo.status, "pending") || TEnum.equals(verificationCenterM31612k4.picVerificationInfo.status, StudentVerificationStatus.prePending)) {
            b = 0;
        } else {
            b = -1;
        }
        if (NullChecker.m81303a(verificationCenterM31612k4) && NullChecker.m81303a(verificationCenterM31612k4.idCard)) {
            if (TEnum.equals(verificationCenterM31612k4.idCard.status, "verified")) {
                b2 = 1;
            } else if (TEnum.equals(verificationCenterM31612k4.idCard.status, "pending") || TEnum.equals(verificationCenterM31612k4.idCard.status, StudentVerificationStatus.prePending)) {
                b2 = 0;
            }
        }
        User userM169520na = m169520na();
        boolean z2 = NullChecker.m81303a(userM169520na) && NullChecker.m81303a(userM169520na.settings) && !(TextUtils.isEmpty(userM169520na.settings.phoneNumber.number) && TextUtils.isEmpty(userM169520na.settings.linkedPhoneNumber.number));
        boolean zEquals = TextUtils.equals(this.f149245Q.f19639e0.f149321Z3.get(), UserHomeMode.marryMode);
        if (!z) {
            zEquals = true;
        }
        return b == 1 && b2 == 1 && z2 && zEquals && !userM169520na.isFakeUser() && TextUtils.equals("passed", userM169520na.getUserInfoForMarryStatus());
    }

    /* JADX INFO: renamed from: b9 */
    public final /* synthetic */ C22306c m169473b9(final String str) {
        return ia20.m135121e(new v9j() { // from class: l.ehb
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4728a.f19494P.auth().m185898q(C4728a.m31200G(str)).m185893l(utc0.create(Network.JSON, "{\"source\":\"client\"}")).m185883b();
            }
        }).map(new C19221a()).compose(mkd0.m154951C());
    }

    /* JADX INFO: renamed from: ba */
    public C22306c<roj0> m169474ba() {
        return now(this.f149380g7.m121236q());
    }

    /* JADX INFO: renamed from: c7 */
    public C22306c<roj0> m169475c7(final int i, final String str) {
        return this.f149245Q.scheduled("feedback_holiday_mask" + CoreModule.m29931H().userId(), -1, new v9j() { // from class: l.ffb
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return ia20.m135121e(new v9j() { // from class: l.mhb
                    @Override // p149l.v9j, java.util.concurrent.Callable
                    public final Object call() {
                        return C4728a.f19494P.auth().m185898q(C4728a.m31200G("/layer/" + str + "/" + i)).m185894m(utc0.create(Network.JSON, "")).m185883b();
                    }
                }).map(new w9j() { // from class: l.nhb
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return roj0.f160388a;
                    }
                }).compose(mkd0.m154951C());
            }
        });
    }

    /* JADX INFO: renamed from: c8 */
    public boolean m169476c8() {
        List<UserStatus> list;
        User userM169520na = m169520na();
        return (userM169520na == null || (list = userM169520na.status) == null || !list.contains(UserStatus.get("hidden")) || App.f15373i.get().equals(this.f149245Q.f19639e0.m169399I7())) ? false : true;
    }

    /* JADX INFO: renamed from: c9 */
    public final /* synthetic */ void m169477c9(String str) {
        m169455X6(str, "default", ConversationStatus.get("blocked"));
    }

    /* JADX INFO: renamed from: ca */
    public C22306c<roj0> m169478ca() {
        return this.f149372f7.m121236q();
    }

    /* JADX INFO: renamed from: d8 */
    public boolean m169479d8() {
        List<UserStatus> list;
        User userM169520na = m169520na();
        return (userM169520na == null || (list = userM169520na.status) == null || !list.contains(UserStatus.get("hidden"))) ? false : true;
    }

    /* JADX INFO: renamed from: d9 */
    public final /* synthetic */ void m169480d9(final String str) {
        this.f149245Q.f19609U.m109085a(new d30() { // from class: l.cbb
            @Override // p149l.d30
            public final void call() {
                this.f80125a.m169477c9(str);
            }
        });
    }

    /* JADX INFO: renamed from: da */
    public C22306c<roj0> m169481da() {
        return this.f149245Q.scheduled("refreshLoveLetterEntry", 0, new v9j() { // from class: l.rbb
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f158594a.m169444T8();
            }
        });
    }

    /* JADX INFO: renamed from: e8 */
    public boolean m169482e8() {
        User userM169520na = m169520na();
        return userM169520na != null && userM169520na.isProfileJailed();
    }

    /* JADX INFO: renamed from: e9 */
    public final /* synthetic */ void m169483e9(final String str, final long j) {
        this.f149245Q.f19609U.m109085a(new d30() { // from class: l.mcb
            @Override // p149l.d30
            public final void call() {
                pib.m169281e6(str, j);
            }
        });
    }

    /* JADX INFO: renamed from: ea */
    public C22306c<roj0> m169484ea() {
        return this.f149364e7.m121236q();
    }

    /* JADX INFO: renamed from: f7 */
    public void m169485f7(String str, String str2, boolean z, String str3, String str4, String str5, String str6, String str7) {
        String string;
        if (TextUtils.isEmpty(str)) {
            str = CoreModule.m29931H().userId();
        }
        String strM31200G = C4728a.m31200G("/cards/feedback");
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("userId", str);
            jSONObject.put("other_user_id", str6);
            jSONObject.put("show", String.valueOf(z));
            jSONObject.put(Reason.TYPE, str3);
            jSONObject.put("action", str2);
            jSONObject.put("page_id", str4);
            jSONObject.put("business", str5);
            jSONObject.put("traceId", str7);
            string = jSONObject.toString();
        } catch (JSONException e) {
            CrashHelper.m81296c(e);
            string = "";
        }
        utc0 utc0VarCreate = utc0.create(Network.JSON, string);
        this.f149245Q.scheduled(strM31200G + str, -1, new C19223c(strM31200G, utc0VarCreate));
    }

    /* JADX INFO: renamed from: f8 */
    public boolean m169486f8() {
        User userM169520na = m169520na();
        return userM169520na != null && userM169520na.isSwipeJailed();
    }

    /* JADX INFO: renamed from: f9 */
    public final /* synthetic */ void m169487f9(String str, String str2, roj0 roj0Var) {
        m169390Fa(str, str2);
    }

    /* JADX INFO: renamed from: fa */
    public C22306c<RegionRule> m169488fa() {
        return this.f149364e7.m121230k();
    }

    /* JADX INFO: renamed from: g7 */
    public List<LiteraturesComments> m169489g7(String str) {
        return this.f149252Q6.get(str);
    }

    /* JADX INFO: renamed from: g8 */
    public boolean m169490g8() {
        VerificationCenter verificationCenterM31618q4 = this.f149245Q.f19552B0.m31618q4();
        return NullChecker.m81303a(verificationCenterM31618q4) && NullChecker.m81303a(verificationCenterM31618q4.picVerificationInfo) && TEnum.equals(verificationCenterM31618q4.picVerificationInfo.status, "verified") && this.f149245Q.f19639e0.m169520na().isOpenFilterVeriMsg();
    }

    /* JADX INFO: renamed from: g9 */
    public final /* synthetic */ void m169491g9(String str, User user) {
        if (user == null) {
            m169454W9(str);
        }
    }

    /* JADX INFO: renamed from: ga */
    public RegionRule m169492ga() {
        return this.f149364e7.m121233n();
    }

    /* JADX INFO: renamed from: h7 */
    public Literatures m169493h7(String str) {
        return this.f149260R6.get(str);
    }

    /* JADX INFO: renamed from: h8 */
    public boolean m169494h8(long j) {
        return ((double) mqi0.m155944o()) - m169520na().createdTime <= ((double) TimeUnit.MILLISECONDS.convert(j, TimeUnit.HOURS));
    }

    /* JADX INFO: renamed from: h9 */
    public final /* synthetic */ roj0 m169495h9(Envelope envelope) {
        this.f149245Q.m31494y3(envelope, null, false, false, true);
        return roj0.f160388a;
    }

    /* JADX INFO: renamed from: ha */
    public C22306c<roj0> m169496ha(String str, Report report) {
        return this.f149245Q.f19618X.m113772h3(C4728a.m31366w2("/" + str + "/reports"), report);
    }

    /* JADX INFO: renamed from: i7 */
    public C22306c<CoreData> m169497i7(String str) {
        final String str2 = "/" + str + "/literatures";
        return this.f149245Q.scheduled("/users/me/profile/BookMoviesDramas/" + str, 0, new v9j() { // from class: l.ebb
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return ia20.m135121e(new v9j() { // from class: l.fdb
                    @Override // p149l.v9j, java.util.concurrent.Callable
                    public final Object call() {
                        return C4728a.f19494P.auth().m185898q(C4728a.m31366w2(str)).m185887f().m185883b();
                    }
                }).map(new w9j() { // from class: l.gdb
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return pib.m169218O5((Envelope) obj);
                    }
                });
            }
        }).compose(mkd0.m154951C());
    }

    /* JADX INFO: renamed from: i8 */
    public boolean m169498i8() {
        User userM169520na = m169520na();
        return NullChecker.m81303a(userM169520na) && !vwb.m200296J(userM169520na.status) && userM169520na.status.contains(UserStatus.get(UserStatus.RISK_TAG_GUIDE_CHANGE_AVATAR));
    }

    /* JADX INFO: renamed from: i9 */
    public final /* synthetic */ C22306c m169499i9(String str) {
        return m169239T9(str).map(new w9j() { // from class: l.thb
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f170215a.m169495h9((Envelope) obj);
            }
        }).compose(C4728a.m31252T2());
    }

    /* JADX INFO: renamed from: ia */
    public C22306c<roj0> m169500ia() {
        return this.f149245Q.scheduled("reportLoveLetterShown", -1, new v9j() { // from class: l.zdb
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return ia20.m135117a(new v9j() { // from class: l.peb
                    @Override // p149l.v9j, java.util.concurrent.Callable
                    public final Object call() {
                        return C4728a.f19494P.auth().m185898q(C4728a.m31200G("/love_letter/boost")).m185893l(utc0.create(Network.JSON, "")).m185883b();
                    }
                }).map(new w9j() { // from class: l.reb
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return roj0.f160388a;
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: j7 */
    public C22306c<List<BreakIce>> m169501j7(String str, String str2, final List<String> list) {
        return CoreModule.m29935P().m94658i().mo33514hm() ? CoreModule.f17545c.f19698x2.m220107n3(str, str2).map(new w9j() { // from class: l.hdb
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f107226a.m169514m8(list, (Envelope) obj);
            }
        }) : m169533r7(str, str2).map(new w9j() { // from class: l.idb
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f112542a.m169518n8(list, (Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: j8 */
    public boolean m169502j8(User user) {
        if (!NullChecker.m81303a(user) || user.isJailed()) {
            return false;
        }
        return !user.status.contains(UserStatus.get("hidden")) || App.f15373i.get().equals(this.f149245Q.f19639e0.m169399I7());
    }

    /* JADX INFO: renamed from: j9 */
    public final /* synthetic */ roj0 m169503j9(Envelope envelope) {
        this.f149245Q.m31494y3(envelope, null, false, false, true);
        return roj0.f160388a;
    }

    /* JADX INFO: renamed from: ja */
    public C22306c<roj0> m169504ja(String str, String str2, String str3) {
        final JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("task", str);
            jSONObject.put("type", str2);
            jSONObject.put("scene", str3);
        } catch (Exception unused) {
        }
        return this.f149245Q.scheduled("report_task_bh" + str + str2 + str3, -1, new v9j() { // from class: l.ycb
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return ia20.m135117a(new v9j() { // from class: l.gfb
                    @Override // p149l.v9j, java.util.concurrent.Callable
                    public final Object call() {
                        return C4728a.f19494P.auth().m185898q(C4728a.m31200G("/my-tab-task/report")).m185893l(utc0.create(Network.JSON, jSONObject.toString())).m185883b();
                    }
                });
            }
        }).map(new C19229i());
    }

    /* JADX INFO: renamed from: k7 */
    public C22306c<Envelope> m169505k7(String str) {
        final String string;
        if (TextUtils.isEmpty(str)) {
            string = Uri.parse(C4728a.m31213J0("/chat-partners-signals?with=users&limit=20")).buildUpon().appendQueryParameter("until", Converter.dateToApiTimeString(mqi0.m155944o())).build().toString();
        } else {
            string = Uri.parse(C4728a.m31213J0("/chat-partners-signals?with=users&") + str).toString();
        }
        return this.f149245Q.scheduled("getChatPartnerHistory" + CoreModule.m29931H().userId(), 0, new v9j() { // from class: l.jhb
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return ia20.m135121e(new v9j() { // from class: l.kcb
                    @Override // p149l.v9j, java.util.concurrent.Callable
                    public final Object call() {
                        return C4728a.f19494P.auth().m185898q(str).m185887f().m185883b();
                    }
                }).compose(mkd0.m154951C());
            }
        });
    }

    /* JADX INFO: renamed from: k8 */
    public boolean m169506k8() {
        User userM169520na = m169520na();
        return NullChecker.m81303a(userM169520na) && !vwb.m200296J(userM169520na.status) && userM169520na.status.contains(UserStatus.get(UserStatus.RISK_TAG_UNREAL)) && userM169520na.status.contains(UserStatus.get(UserStatus.RISK_TAG_FAKE_YOUNGER_AGE)) && !App.f15373i.get().equals(this.f149245Q.f19639e0.m169399I7());
    }

    /* JADX INFO: renamed from: k9 */
    public final /* synthetic */ C22306c m169507k9(String str) {
        return m169243U9(str).map(new w9j() { // from class: l.bbb
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f74791a.m169503j9((Envelope) obj);
            }
        }).compose(C4728a.m31252T2());
    }

    /* JADX INFO: renamed from: ka */
    public void m169508ka(final String str, final boolean z, final boolean z2) {
        this.f149245Q.scheduled("report_task_bh" + str, -1, new v9j() { // from class: l.pgb
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return ia20.m135117a(new v9j() { // from class: l.dbb
                    @Override // p149l.v9j, java.util.concurrent.Callable
                    public final Object call() {
                        return pib.m169197J4(str, z, z);
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: l7 */
    public C22306c<Envelope> m169509l7(@NonNull ChatPartnerScene chatPartnerScene) {
        final String string = Uri.parse(C4728a.m31213J0("/chat-partners?with=users")).buildUpon().appendQueryParameter("scene", chatPartnerScene.getValue()).build().toString();
        return this.f149245Q.scheduled("getChatPartners" + CoreModule.m29931H().userId(), -1, new v9j() { // from class: l.kfb
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return ia20.m135121e(new v9j() { // from class: l.lhb
                    @Override // p149l.v9j, java.util.concurrent.Callable
                    public final Object call() {
                        return C4728a.f19494P.auth().m185898q(str).m185887f().m185883b();
                    }
                }).compose(mkd0.m154951C());
            }
        });
    }

    /* JADX INFO: renamed from: l8 */
    public final /* synthetic */ C22306c m169510l8(final String str, final String str2) {
        return ia20.m135121e(new v9j() { // from class: l.tcb
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return pib.m169198J5(str, str2);
            }
        }).map(new C19228h()).compose(mkd0.m154951C()).map(new C19227g(str));
    }

    /* JADX INFO: renamed from: l9 */
    public final /* synthetic */ WechatNotifySetting m169511l9(Envelope envelope) {
        this.f149204K1.m132487l(Optional.fromNullable(((CoreData) envelope.getModuleData(CoreData.class)).wechat));
        return ((CoreData) envelope.getModuleData(CoreData.class)).wechat;
    }

    /* JADX INFO: renamed from: la */
    public C22306c<roj0> m169512la() {
        return this.f149245Q.scheduled("wechat_dialog_show", 0, new v9j() { // from class: l.zab
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return ia20.m135117a(new v9j() { // from class: l.tbb
                    @Override // p149l.v9j, java.util.concurrent.Callable
                    public final Object call() {
                        return C4728a.f19494P.auth().m185898q(C4728a.m31200G("/wechat/dialogpop")).m185887f().m185883b();
                    }
                }).map(new w9j() { // from class: l.ubb
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return roj0.f160388a;
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: m7 */
    public C22306c<Envelope> m169513m7() {
        String str = "/" + CoreModule.m29931H().userId() + "/popGuide";
        return this.f149245Q.scheduled(str, 0, new C19222b(str));
    }

    /* JADX INFO: renamed from: m9 */
    public final /* synthetic */ C22306c m169515m9() {
        return ia20.m135117a(new v9j() { // from class: l.lib
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4728a.f19494P.auth().m185898q(C4728a.m31200G("/wechat/status")).m185887f().m185883b();
            }
        }).map(new w9j() { // from class: l.mib
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f133955a.m169511l9((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: ma */
    public User m169516ma() {
        User userM169520na = m169520na();
        return userM169520na.riskAuditUser(CoreModule.m29932K().getUserById("fake_risk_audit_default_" + userM169520na.f56011id));
    }

    /* JADX INFO: renamed from: n7 */
    public C22306c<roj0> m169517n7() {
        return now("gpTopicCards", ia20.m135119c(new v9j() { // from class: l.lgb
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4728a.f19494P.auth().m185898q(C4728a.m31366w2("/" + CoreModule.m29931H().userId() + "/topic-cards")).m185887f().m185883b();
            }
        }, GPTopicCardEnvelop.JSON_ADAPTER).map(new w9j() { // from class: l.wgb
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f186177a.m169522o8((GPTopicCardEnvelop) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: n9 */
    public C22306c<MarriageGuide> m169519n9() {
        final String str = this.f149193I4.get().booleanValue() ? "moment" : "quality,moment";
        return this.f149245Q.scheduled("marry_dlg_show_check_".concat(str), 0, new v9j() { // from class: l.rhb
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return ia20.m135121e(new v9j() { // from class: l.nbb
                    @Override // p149l.v9j, java.util.concurrent.Callable
                    public final Object call() {
                        return C4728a.f19494P.auth().m185898q(C4728a.m31213J0("/marriage-guide?conditions=" + str)).m185887f().m185883b();
                    }
                }).map(new w9j() { // from class: l.obb
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return ((CoreData) ((Envelope) obj).getModuleData(CoreData.class)).marriageGuide;
                    }
                }).filter(new w9j() { // from class: l.pbb
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return Boolean.valueOf(NullChecker.m81303a((MarriageGuide) obj));
                    }
                }).observeOn(jo0.m142408a());
            }
        });
    }

    /* JADX INFO: renamed from: na */
    public User m169520na() {
        return e51.m114739D() ? m169527p9() : m169429P9();
    }

    /* JADX INFO: renamed from: o7 */
    public C22306c<roj0> m169521o7(final String str) {
        return now("gpGetTopicUsers", ia20.m135119c(new v9j() { // from class: l.mgb
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4728a.f19494P.auth().m185898q(C4728a.m31366w2("/" + CoreModule.m29931H().userId() + "/topic-cards/" + str)).m185887f().m185883b();
            }
        }, Envelope.JSON_ADAPTER).map(new w9j() { // from class: l.ngb
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f138852a.m169526p8(str, (Envelope) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: o8 */
    public final /* synthetic */ roj0 m169522o8(GPTopicCardEnvelop gPTopicCardEnvelop) {
        this.f149422m1.m132487l(ura.m195053e().m195057d().mo33885mk(gPTopicCardEnvelop.data.topicCards));
        return roj0.f160388a;
    }

    /* JADX INFO: renamed from: o9 */
    public C22306c<User> m169523o9() {
        return m169410Ka(this.f149142B1);
    }

    /* JADX INFO: renamed from: oa */
    public User m169524oa(String str) {
        return e51.m114739D() ? m169430Pa(str) : m169433Q9(str);
    }

    /* JADX INFO: renamed from: p7 */
    public C22306c<Envelope> m169525p7() {
        return this.f149245Q.scheduled("icebreakings/get/" + CoreModule.m29931H().userId(), 0, new v9j() { // from class: l.khb
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return ia20.m135121e(new v9j() { // from class: l.jcb
                    @Override // p149l.v9j, java.util.concurrent.Callable
                    public final Object call() {
                        return C4728a.f19494P.auth().m185898q(C4728a.m31213J0("/icebreakings?source=matchGuide")).m185887f().m185883b();
                    }
                }).compose(mkd0.m154951C());
            }
        });
    }

    /* JADX INFO: renamed from: p8 */
    public final /* synthetic */ roj0 m169526p8(String str, Envelope envelope) {
        HashMap<String, List<User>> mapM221515e = this.f149430n1.m221515e();
        if (mapM221515e == null) {
            mapM221515e = new HashMap<>();
        }
        mapM221515e.put(str, ((CommonData) envelope.getModuleData(CommonData.class)).users);
        this.f149430n1.m132487l(mapM221515e);
        return roj0.f160388a;
    }

    /* JADX INFO: renamed from: p9 */
    public User m169527p9() {
        if (this.f149142B1 == null) {
            StringBuilder sb = new StringBuilder("CoreUser me_ CoreModule.account().userId == null");
            if (CoreModule.m29931H().getAuthData().mo108248b() == null) {
                sb.append(", CoreModule.account().getAuthData().get == null");
            } else {
                sb.append(", CoreModule.account().getAuthData().get().userId" + CoreModule.m29931H().getAuthData().mo108248b().userId);
            }
            CrashHelper.m81296c(new NullPointerException(sb.toString()));
        }
        return qib0.f154722k0.f176631d.queryCache(this.f149142B1);
    }

    /* JADX INFO: renamed from: pa */
    public void m169528pa(String str, CoreData coreData) {
        if (TextUtils.isEmpty(str) || coreData == null) {
            return;
        }
        List<Literatures> list = coreData.literatures;
        List<LiteraturesComments> list2 = coreData.literaturesComments;
        if (vwb.m200296J(list2)) {
            m169413L9(str, new ArrayList());
            return;
        }
        if (!vwb.m200296J(list)) {
            for (Literatures literatures : list) {
                if (NullChecker.m81303a(literatures) && !TextUtils.isEmpty(literatures.f20433id)) {
                    m169417M9(literatures.f20433id, literatures);
                }
            }
        }
        for (LiteraturesComments literaturesComments : list2) {
            if (literaturesComments != null) {
                Literatures literaturesM169493h7 = m169493h7(literaturesComments.literatureID);
                if (NullChecker.m81303a(literaturesM169493h7) && !TextUtils.isEmpty(literaturesM169493h7.f20433id)) {
                    literaturesComments.localLiteratures = literaturesM169493h7;
                }
            }
        }
        m169413L9(str, list2);
    }

    /* JADX INFO: renamed from: q7 */
    public C22306c<List<IceBreakQuestion>> m169529q7(final String str) {
        return this.f149245Q.scheduled("get_ice_break_qas" + str, 0, new v9j() { // from class: l.gib
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return ia20.m135117a(new v9j() { // from class: l.zcb
                    @Override // p149l.v9j, java.util.concurrent.Callable
                    public final Object call() {
                        return pib.m169223P6(str);
                    }
                }).map(new w9j() { // from class: l.adb
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return ((CoreData) ((Envelope) obj).getModuleData(CoreData.class)).iceBreakQuestions;
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: q8 */
    public final /* synthetic */ C22306c m169530q8(final String str) {
        return ia20.m135121e(new v9j() { // from class: l.mdb
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4728a.f19494P.auth().m185898q(C4728a.m31200G(str)).m185887f().m185883b();
            }
        }).map(new C19226f()).compose(mkd0.m154951C()).map(new C19225e());
    }

    /* JADX INFO: renamed from: q9 */
    public final void m169531q9(String str, Envelope envelope) {
        if (!ura.m195053e().m195057d().mo33681Er() || TextUtils.equals(str, CoreModule.m29931H().userId())) {
            return;
        }
        m169528pa(str, (CoreData) envelope.getModuleData(CoreData.class));
    }

    /* JADX INFO: renamed from: qa */
    public final void m169532qa() {
        List<LiteraturesComments> listM169489g7 = CoreModule.f17545c.f19639e0.m169489g7(CoreModule.m29931H().userId());
        if (listM169489g7 == null || listM169489g7.isEmpty()) {
            m169448V6();
            return;
        }
        CoreData coreDataNew_ = CoreData.new_();
        coreDataNew_.literaturesComments = listM169489g7;
        CoreModule.f17545c.f19639e0.f149391i2.put(coreDataNew_.toJson());
    }

    /* JADX INFO: renamed from: r7 */
    public C22306c<Envelope> m169533r7(final String str, final String str2) {
        return this.f149245Q.scheduled("icebreakings/" + str, 0, new v9j() { // from class: l.abb
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return pib.m169308l4(str, str2);
            }
        });
    }

    /* JADX INFO: renamed from: r8 */
    public final /* synthetic */ void m169534r8(String str, Envelope envelope) {
        if (NullChecker.m81303a(envelope)) {
            m169528pa(str, (CoreData) envelope.getModuleData(CoreData.class));
        }
    }

    /* JADX INFO: renamed from: r9 */
    public void m169535r9(boolean z) {
        this.f149293W.m132487l(Boolean.valueOf(z));
    }

    /* JADX INFO: renamed from: ra */
    public C22306c<Envelope> m169536ra(@NonNull String str, @NonNull List<String> list) {
        String string;
        final String strM31213J0 = C4728a.m31213J0("/chat-partners-signals");
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("userIds", new JSONArray((Collection) list));
            jSONObject.put("textId", str);
            string = jSONObject.toString();
        } catch (JSONException unused) {
            string = "";
        }
        final utc0 utc0VarCreate = utc0.create(Network.JSON, string);
        return this.f149245Q.scheduled(strM31213J0 + str + jSONObject, -1, new v9j() { // from class: l.vbb
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f180831a.m169447U8(strM31213J0, utc0VarCreate);
            }
        });
    }

    /* JADX INFO: renamed from: s7 */
    public C22306c<IdealInfo> m169537s7(final String str, final String str2) {
        return this.f149245Q.scheduled("ideal_match_info_" + str + str2, 0, new v9j() { // from class: l.ahb
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return ia20.m135117a(new v9j() { // from class: l.edb
                    @Override // p149l.v9j, java.util.concurrent.Callable
                    public final Object call() {
                        return C4728a.f19494P.auth().m185898q(C4728a.m31200G("/dating/ideal-guide/" + str + "?scene=" + str)).m185887f().m185883b();
                    }
                });
            }
        }).map(new w9j() { // from class: l.bhb
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((CoreData) ((Envelope) obj).getModuleData(CoreData.class)).idealInfo;
            }
        });
    }

    /* JADX INFO: renamed from: s8 */
    public final /* synthetic */ void m169538s8(String str, Throwable th) {
        CoreData coreData;
        try {
            String str2 = this.f149391i2.get();
            if (TextUtils.isEmpty(str2) || (coreData = CoreData.JSON_ADAPTER.parse(str2)) == null) {
                return;
            }
            m169528pa(str, coreData);
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: s9 */
    public C22306c<roj0> m169539s9(final String str) {
        User userM169430Pa = m169430Pa(str);
        if (userM169430Pa == null) {
            return this.f149245Q.just();
        }
        final String str2 = userM169430Pa.profile.contactLookups.next;
        C4732c c4732c = this.f149245Q;
        if (str2 == null) {
            return c4732c.just();
        }
        return c4732c.scheduled("users/" + str + "/contacts/more", 0, new v9j() { // from class: l.qhb
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f154448a.m169384E8(str, str2);
            }
        });
    }

    /* JADX INFO: renamed from: sa */
    public C22306c<roj0> m169540sa(final List<String> list) {
        return this.f149245Q.scheduled("set_ice_break_qas", -1, new v9j() { // from class: l.ecb
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return ia20.m135117a(new v9j() { // from class: l.beb
                    @Override // p149l.v9j, java.util.concurrent.Callable
                    public final Object call() {
                        return pib.m169276d6(list);
                    }
                }).map(new w9j() { // from class: l.ceb
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return roj0.f160388a;
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: t7 */
    public C22306c<UserFeedbackInfo> m169541t7() {
        final String str = "/inform/pop/info";
        return this.f149245Q.scheduled("/inform/pop/info", 0, new v9j() { // from class: l.scb
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f163719a.m169530q8(str);
            }
        });
    }

    /* JADX INFO: renamed from: t8 */
    public final /* synthetic */ roj0 m169542t8(Envelope envelope) {
        int i;
        List<MyTabTask> list = ((CoreData) envelope.getModuleData(CoreData.class)).myTabTasks;
        for (MyTabTask myTabTask : list) {
            if (TextUtils.equals(myTabTask.type, "verification")) {
                if (!NullChecker.m81303a(myTabTask.button) || (i = myTabTask.button.counter) == this.f149428m7.get().intValue()) {
                    break;
                    break;
                }
                this.f149428m7.put(Integer.valueOf(i));
                this.f149436n7.put(Boolean.FALSE);
                this.f149420l7.m132487l(roj0.f160388a);
                break;
            }
        }
        this.f149396i7.m132487l(list);
        return roj0.f160388a;
    }

    /* JADX INFO: renamed from: t9 */
    public C22306c<roj0> m169543t9(final String str) {
        return this.f149245Q.scheduled("onlineMatchGetUser/" + str, 0, new v9j() { // from class: l.sgb
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f164380a.m169392G8(str);
            }
        });
    }

    /* JADX INFO: renamed from: ta */
    public C22306c<Boolean> m169544ta(List<IdealTag> list) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        JSONObject jSONObject4 = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        User userM169520na = CoreModule.f17545c.f19639e0.m169520na();
        final boolean zHasIdealInfo = userM169520na.hasIdealInfo();
        ArrayList arrayListM200303Q = vwb.m200303Q(list, new w9j() { // from class: l.jeb
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((IdealTag) obj).f38760id;
            }
        });
        if (zHasIdealInfo) {
            final ArrayList arrayListM200303Q2 = vwb.m200303Q(userM169520na.profile.extensions.basic.ideal, new w9j() { // from class: l.keb
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((IdealTag) obj).f38760id;
                }
            });
            vwb.m200295I(arrayListM200303Q, new Comparator() { // from class: l.leb
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return pib.m169328q4(arrayListM200303Q2, (String) obj, (String) obj2);
                }
            });
        }
        if (!vwb.m200296J(arrayListM200303Q)) {
            Iterator it = arrayListM200303Q.iterator();
            while (it.hasNext()) {
                jSONArray.put((String) it.next());
            }
        }
        try {
            jSONObject4.put("idealType", jSONArray);
            jSONObject3.put("basic", jSONObject4);
            jSONObject2.put(Extensions.TYPE, jSONObject3);
            jSONObject.put("profile", jSONObject2);
        } catch (JSONException unused) {
        }
        return m169555w9(jSONObject.toString()).map(new w9j() { // from class: l.meb
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(!zHasIdealInfo);
            }
        }).doOnNext(new e30() { // from class: l.neb
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f138599a.m169449V8((Boolean) obj);
            }
        });
    }

    /* JADX INFO: renamed from: u7, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final List<BreakIce> m169518n8(Envelope envelope, List<String> list) {
        if (envelope.meta.code != 200) {
            return null;
        }
        if (NullChecker.m81303a(envelope.getModuleData(CoreData.class)) && !vwb.m200296J(((CoreData) envelope.getModuleData(CoreData.class)).iceBreakings)) {
            return ((CoreData) envelope.getModuleData(CoreData.class)).iceBreakings;
        }
        if (vwb.m200296J(list)) {
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
    public final /* synthetic */ C22306c m169546u8() {
        return ia20.m135117a(new v9j() { // from class: l.bgb
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4728a.f19494P.auth().m185898q(C4728a.m31200G("/my-tab-task/list")).m185887f().m185883b();
            }
        }).map(new w9j() { // from class: l.cgb
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f80732a.m169542t8((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: u9 */
    public C22306c<roj0> m169547u9(User user) {
        return m169551v9(user, null);
    }

    /* JADX INFO: renamed from: ua */
    public void m169548ua() {
        this.f149436n7.put(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: v7 */
    public C22306c<LoveLetterContent> m169549v7(final String str) {
        return this.f149245Q.scheduled("getLoveLetterMsgContent" + str, 0, new v9j() { // from class: l.lcb
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return ia20.m135117a(new v9j() { // from class: l.wdb
                    @Override // p149l.v9j, java.util.concurrent.Callable
                    public final Object call() {
                        return C4728a.f19494P.auth().m185898q(C4728a.m31200G("/love_letter/card/" + str)).m185887f().m185883b();
                    }
                }).map(new w9j() { // from class: l.xdb
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return ((CoreData) ((Envelope) obj).getModuleData(CoreData.class)).loveLetterContent;
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: v8 */
    public final /* synthetic */ roj0 m169550v8(Envelope envelope) {
        List<MyTabTask> list = ((CoreData) envelope.getModuleData(CoreData.class)).myTabTasks;
        if (vwb.m200296J(list) || TextUtils.isEmpty(list.get(0).title)) {
            this.f149404j7.m132487l(MyTabTask.new_());
        } else {
            this.f149404j7.m132487l(list.get(0));
        }
        return roj0.f160388a;
    }

    /* JADX INFO: renamed from: v9 */
    public C22306c<roj0> m169551v9(User user, String str) {
        if (user == null) {
            return C22306c.just(roj0.f160388a);
        }
        if (NullChecker.m81303a(user.profile) && !vwb.m200296J(user.profile.answers) && TextUtils.isEmpty(user.profile.answers.get(0).question) && TextUtils.isEmpty(user.profile.answers.get(0).value)) {
            CrashHelper.m81296c(new Exception("user question 异常问题"));
        }
        if (NullChecker.m81303a(user.profile) && NullChecker.m81303a(user.profile.extensions) && NullChecker.m81303a(user.profile.extensions.game) && !vwb.m200296J(user.profile.extensions.game.screenshot) && user.profile.extensions.game.screenshot.size() > 3) {
            CrashHelper.m81296c(new RuntimeException("game screenshot error：" + user.profile.extensions.game.screenshot.size()));
        }
        return m169559x9(user.toJson(), str);
    }

    /* JADX INFO: renamed from: va */
    public void m169552va(int i) {
        this.f149269T.put(Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: w7 */
    public C22306c<MatchInfo> m169553w7() {
        return this.f149245Q.scheduled("matchInfo/", 0, new v9j() { // from class: l.fhb
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return new la20(new v9j() { // from class: l.fbb
                    @Override // p149l.v9j, java.util.concurrent.Callable
                    public final Object call() {
                        return C4728a.f19494P.auth().m185898q(C4728a.m31213J0("/matchInfo")).m185887f().m185883b();
                    }
                }).map(new w9j() { // from class: l.hbb
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return ((CoreData) ((Envelope) obj).getModuleData(CoreData.class)).todayMatchInfo;
                    }
                }).compose(C4728a.m31252T2());
            }
        });
    }

    /* JADX INFO: renamed from: w8 */
    public final /* synthetic */ C22306c m169554w8() {
        return ia20.m135117a(new v9j() { // from class: l.xhb
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4728a.f19494P.auth().m185898q(C4728a.m31200G("/my-tab-task/list?scene=avatar")).m185887f().m185883b();
            }
        }).map(new w9j() { // from class: l.yhb
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f198289a.m169550v8((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: w9 */
    public C22306c<roj0> m169555w9(String str) {
        return m169559x9(str, null);
    }

    /* JADX INFO: renamed from: wa */
    public C22306c<roj0> m169556wa() {
        return this.f149348c7;
    }

    /* JADX INFO: renamed from: x7 */
    public void m169557x7() {
        final String strUserId = CoreModule.m29931H().userId();
        final String str = "/" + strUserId + "/literatures";
        CoreModule.f17545c.now(str, ia20.m135121e(new v9j() { // from class: l.hfb
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4728a.f19494P.auth().m185898q(C4728a.m31366w2(str)).m185887f().m185883b();
            }
        })).observeOn(jo0.m142408a()).subscribe(mkd0.m154956H(new e30() { // from class: l.ifb
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f112971a.m169534r8(strUserId, (Envelope) obj);
            }
        }, new e30() { // from class: l.jfb
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f117649a.m169538s8(strUserId, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: x8 */
    public final /* synthetic */ roj0 m169558x8(Envelope envelope) {
        List<MyTabTask> list = ((CoreData) envelope.getModuleData(CoreData.class)).myTabTasks;
        if (vwb.m200296J(list) || TextUtils.isEmpty(list.get(0).title)) {
            this.f149412k7.m132487l(MyTabTask.new_());
        } else {
            this.f149412k7.m132487l(list.get(0));
        }
        return roj0.f160388a;
    }

    /* JADX INFO: renamed from: x9 */
    public C22306c<roj0> m169559x9(final String str, final String str2) {
        return this.f149245Q.scheduled("patch user" + str2, -1, new v9j() { // from class: l.hhb
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f107695a.m169400I8(str, str2);
            }
        });
    }

    /* JADX INFO: renamed from: xa */
    public C22306c<FakeGuideData> m169560xa() {
        return this.f149245Q.scheduled("antispam/guide-change-avatar", 0, new v9j() { // from class: l.jgb
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f117766a.m169457X8();
            }
        });
    }

    @NonNull
    /* JADX INFO: renamed from: y7 */
    public String m169561y7(String str) {
        Map<String, GPMemo> mapM169423O7;
        GPMemo gPMemo;
        return (TextUtils.isEmpty(str) || (mapM169423O7 = m169423O7()) == null || mapM169423O7.isEmpty() || (gPMemo = mapM169423O7.get(str)) == null || TextUtils.isEmpty(gPMemo.memo)) ? "" : gPMemo.memo;
    }

    /* JADX INFO: renamed from: y8 */
    public final /* synthetic */ C22306c m169562y8() {
        return ia20.m135117a(new v9j() { // from class: l.jib
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4728a.f19494P.auth().m185898q(C4728a.m31200G("/my-tab-task/list?scene=editInformation")).m185887f().m185883b();
            }
        }).map(new w9j() { // from class: l.kib
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f123285a.m169558x8((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: y9 */
    public C22306c<SettingGroups> m169563y9(UserPrivacySettings userPrivacySettings) {
        SettingGroups settingGroups = new SettingGroups();
        settingGroups.privacy = userPrivacySettings;
        final UserSettingPatch userSettingPatch = new UserSettingPatch();
        userSettingPatch.settingGroups = settingGroups;
        userSettingPatch.type = "default";
        return m169431Q7(new v9j() { // from class: l.feb
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4728a.f19494P.auth().m185898q(C4728a.m31337p1()).m185893l(utc0.create(Network.JSON, userSettingPatch.toJson())).m185883b();
            }
        }, -1, "path_privacy_settings");
    }

    /* JADX INFO: renamed from: ya */
    public C22306c<roj0> m169564ya(final AppealPostData appealPostData, final List<Media> list) {
        v9j v9jVar = new v9j() { // from class: l.zbb
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C22306c.fromCallable(new Callable() { // from class: l.ydb
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return pib.m169327q3(list, appealPostData);
                    }
                });
            }
        };
        final w9j w9jVar = new w9j() { // from class: l.acb
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return new lsx((List) obj, true).flatMap(new w9j() { // from class: l.kdb
                    @Override // p149l.w9j
                    public final Object call(Object obj2) {
                        return ya5.m213793I((List) obj2, "pic_verification");
                    }
                }).map(new w9j() { // from class: l.ldb
                    @Override // p149l.w9j
                    public final Object call(Object obj2) {
                        return pib.m169220P3(appealPostData, (List) obj2);
                    }
                });
            }
        };
        return ((C22306c) v9jVar.call()).flatMap(new w9j() { // from class: l.dcb
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return pib.m169333r5(w9jVar, list, (AppealPostData) obj);
            }
        }).compose(mkd0.m154965Q()).flatMap(new w9j() { // from class: l.bcb
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f74912a.m169469a9(appealPostData, (AppealPostData) obj);
            }
        });
    }

    /* JADX INFO: renamed from: z7 */
    public boolean m169565z7() {
        return this.f149293W.m221515e().booleanValue();
    }

    /* JADX INFO: renamed from: z8 */
    public final /* synthetic */ void m169566z8(Envelope envelope) {
        gl5.f103296d.put(((CoreData) envelope.getModuleData(CoreData.class)).avatar);
        m169454W9(this.f149142B1);
    }

    /* JADX INFO: renamed from: z9 */
    public C22306c<SettingGroups> m169567z9(UserLiveSettings userLiveSettings) {
        SettingGroups settingGroups = new SettingGroups();
        settingGroups.live = userLiveSettings;
        final UserSettingPatch userSettingPatch = new UserSettingPatch();
        userSettingPatch.settingGroups = settingGroups;
        userSettingPatch.type = "default";
        return m169431Q7(new v9j() { // from class: l.dib
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4728a.f19494P.auth().m185898q(C4728a.m31286c2()).m185892k(utc0.create(Network.JSON, userSettingPatch.toJson())).m185883b();
            }
        }, -1, "patch_live_settings");
    }

    /* JADX INFO: renamed from: za */
    public C22306c<Boolean> m169568za(String str) {
        if (TextUtils.isEmpty(str)) {
            return C22306c.just(Boolean.FALSE);
        }
        final String str2 = "/users/" + this.f149245Q.f19639e0.m169527p9().f56011id + "/marriage-conversation/" + str;
        return this.f149245Q.scheduled(str2, -1, new v9j() { // from class: l.ufb
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f176244a.m169473b9(str2);
            }
        });
    }

    /* JADX INFO: renamed from: P7 */
    public final void m169427P7() {
    }
}
