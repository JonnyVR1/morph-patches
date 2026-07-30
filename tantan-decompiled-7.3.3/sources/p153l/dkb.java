package p153l;

import android.app.Application;
import android.graphics.Bitmap;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.clevertap.android.sdk.Constants;
import com.google.common.base.Optional;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.android.app.App;
import com.p051p1.mobile.putong.api.api.Network;
import com.p051p1.mobile.putong.api.api.TantanException;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.C4879a;
import com.p051p1.mobile.putong.core.api.C4883c;
import com.p051p1.mobile.putong.core.data.AppealInfo;
import com.p051p1.mobile.putong.core.data.BreakIce;
import com.p051p1.mobile.putong.core.data.ChatPartnerScene;
import com.p051p1.mobile.putong.core.data.CoreData;
import com.p051p1.mobile.putong.core.data.FakeGuideData;
import com.p051p1.mobile.putong.core.data.GPTopicCard;
import com.p051p1.mobile.putong.core.data.GPTopicCardEnvelop;
import com.p051p1.mobile.putong.core.data.IceBreakQuestion;
import com.p051p1.mobile.putong.core.data.IdealInfo;
import com.p051p1.mobile.putong.core.data.Literatures;
import com.p051p1.mobile.putong.core.data.LiteraturesComments;
import com.p051p1.mobile.putong.core.data.LoveLetterContent;
import com.p051p1.mobile.putong.core.data.LoveLetterEntryInfo;
import com.p051p1.mobile.putong.core.data.MarriageGuide;
import com.p051p1.mobile.putong.core.data.MatchInfo;
import com.p051p1.mobile.putong.core.data.MyTabTask;
import com.p051p1.mobile.putong.core.data.NewTags;
import com.p051p1.mobile.putong.core.data.ProfileCountInfo;
import com.p051p1.mobile.putong.core.data.RealFeelInfo;
import com.p051p1.mobile.putong.core.data.RealPicturesInfo;
import com.p051p1.mobile.putong.core.data.Reason;
import com.p051p1.mobile.putong.core.data.RegionRule;
import com.p051p1.mobile.putong.core.data.RegionRulesEnvelop;
import com.p051p1.mobile.putong.core.data.UrlTag;
import com.p051p1.mobile.putong.core.data.UserFeedbackInfo;
import com.p051p1.mobile.putong.core.data.UserHomeMode;
import com.p051p1.mobile.putong.core.data.VerificationCenter;
import com.p051p1.mobile.putong.core.data.WechatNotifySetting;
import com.p051p1.mobile.putong.data.AppealPostData;
import com.p051p1.mobile.putong.data.CommonData;
import com.p051p1.mobile.putong.data.Contact;
import com.p051p1.mobile.putong.data.ConversationStatus;
import com.p051p1.mobile.putong.data.Converter;
import com.p051p1.mobile.putong.data.Counter;
import com.p051p1.mobile.putong.data.CurrencyTypeData;
import com.p051p1.mobile.putong.data.CurrencyTypeEnvelop;
import com.p051p1.mobile.putong.data.Dimension;
import com.p051p1.mobile.putong.data.Envelope;
import com.p051p1.mobile.putong.data.Extensions;
import com.p051p1.mobile.putong.data.GPMemo;
import com.p051p1.mobile.putong.data.GPMemoEnvelope;
import com.p051p1.mobile.putong.data.IdealTag;
import com.p051p1.mobile.putong.data.LiveRegionTag;
import com.p051p1.mobile.putong.data.MatchFrom;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.Meta;
import com.p051p1.mobile.putong.data.MomentFeedPushArgs;
import com.p051p1.mobile.putong.data.PartialIdList;
import com.p051p1.mobile.putong.data.Passby;
import com.p051p1.mobile.putong.data.Picture;
import com.p051p1.mobile.putong.data.Profile;
import com.p051p1.mobile.putong.data.ProfileExtensionBasic;
import com.p051p1.mobile.putong.data.Relationship;
import com.p051p1.mobile.putong.data.Report;
import com.p051p1.mobile.putong.data.SettingGroups;
import com.p051p1.mobile.putong.data.Settings;
import com.p051p1.mobile.putong.data.StudentVerificationStatus;
import com.p051p1.mobile.putong.data.TribeSetting;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.UserLiveSettings;
import com.p051p1.mobile.putong.data.UserPrivacySettings;
import com.p051p1.mobile.putong.data.UserPushSettings;
import com.p051p1.mobile.putong.data.UserSettingPatch;
import com.p051p1.mobile.putong.data.UserStatus;
import com.p051p1.mobile.putong.data.UserSubscriptionSettings;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.p070ui.DialogAct;
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
import p137rx.C22421c;
import p137rx.subjects.C22507a;
import p137rx.subjects.C22508b;

/* JADX INFO: loaded from: classes9.dex */
public class dkb extends C4879a {

    /* JADX INFO: renamed from: A0 */
    public C22507a<MomentFeedPushArgs> f88991A0;

    /* JADX INFO: renamed from: A1 */
    public byd0 f88992A1;

    /* JADX INFO: renamed from: A2 */
    public vxd0 f88993A2;

    /* JADX INFO: renamed from: A3 */
    public jxd0 f88994A3;

    /* JADX INFO: renamed from: A4 */
    public jxd0 f88995A4;

    /* JADX INFO: renamed from: A5 */
    public byd0 f88996A5;

    /* JADX INFO: renamed from: A6 */
    public jxd0 f88997A6;

    /* JADX INFO: renamed from: B0 */
    public bkj0<String, String, Integer> f88998B0;

    /* JADX INFO: renamed from: B1 */
    public String f88999B1;

    /* JADX INFO: renamed from: B2 */
    public vxd0 f89000B2;

    /* JADX INFO: renamed from: B3 */
    public jxd0 f89001B3;

    /* JADX INFO: renamed from: B4 */
    public jxd0 f89002B4;

    /* JADX INFO: renamed from: B5 */
    public vxd0 f89003B5;

    /* JADX INFO: renamed from: B6 */
    public jxd0 f89004B6;

    /* JADX INFO: renamed from: C0 */
    public C22507a<AppealInfo> f89005C0;

    /* JADX INFO: renamed from: C1 */
    public jxd0 f89006C1;

    /* JADX INFO: renamed from: C2 */
    public vxd0 f89007C2;

    /* JADX INFO: renamed from: C3 */
    public wyd0 f89008C3;

    /* JADX INFO: renamed from: C4 */
    public byd0 f89009C4;

    /* JADX INFO: renamed from: C5 */
    public byd0 f89010C5;

    /* JADX INFO: renamed from: C6 */
    public jxd0 f89011C6;

    /* JADX INFO: renamed from: D0 */
    public C22507a<AppealInfo> f89012D0;

    /* JADX INFO: renamed from: D1 */
    public jxd0 f89013D1;

    /* JADX INFO: renamed from: D2 */
    public vxd0 f89014D2;

    /* JADX INFO: renamed from: D3 */
    public wyd0 f89015D3;

    /* JADX INFO: renamed from: D4 */
    public jxd0 f89016D4;

    /* JADX INFO: renamed from: D5 */
    public byd0 f89017D5;

    /* JADX INFO: renamed from: D6 */
    public jxd0 f89018D6;

    /* JADX INFO: renamed from: E0 */
    public C22507a<uxj0> f89019E0;

    /* JADX INFO: renamed from: E1 */
    public C22508b<Boolean> f89020E1;

    /* JADX INFO: renamed from: E2 */
    public jxd0 f89021E2;

    /* JADX INFO: renamed from: E3 */
    public wyd0 f89022E3;

    /* JADX INFO: renamed from: E4 */
    public jxd0 f89023E4;

    /* JADX INFO: renamed from: E5 */
    public vxd0 f89024E5;

    /* JADX INFO: renamed from: E6 */
    public wyd0 f89025E6;

    /* JADX INFO: renamed from: F0 */
    public C22507a<uxj0> f89026F0;

    /* JADX INFO: renamed from: F1 */
    public C22508b<uxj0> f89027F1;

    /* JADX INFO: renamed from: F2 */
    public jxd0 f89028F2;

    /* JADX INFO: renamed from: F3 */
    public vxd0 f89029F3;

    /* JADX INFO: renamed from: F4 */
    public jxd0 f89030F4;

    /* JADX INFO: renamed from: F5 */
    public byd0 f89031F5;

    /* JADX INFO: renamed from: F6 */
    public vxd0 f89032F6;

    /* JADX INFO: renamed from: G0 */
    public vxd0 f89033G0;

    /* JADX INFO: renamed from: G1 */
    public C22507a<uxj0> f89034G1;

    /* JADX INFO: renamed from: G2 */
    public wyd0 f89035G2;

    /* JADX INFO: renamed from: G3 */
    public vxd0 f89036G3;

    /* JADX INFO: renamed from: G4 */
    public byd0 f89037G4;

    /* JADX INFO: renamed from: G5 */
    public jxd0 f89038G5;

    /* JADX INFO: renamed from: G6 */
    public jxd0 f89039G6;

    /* JADX INFO: renamed from: H0 */
    public vxd0 f89040H0;

    /* JADX INFO: renamed from: H1 */
    public C22508b<String> f89041H1;

    /* JADX INFO: renamed from: H2 */
    public byd0 f89042H2;

    /* JADX INFO: renamed from: H3 */
    public jxd0 f89043H3;

    /* JADX INFO: renamed from: H4 */
    public vxd0 f89044H4;

    /* JADX INFO: renamed from: H6 */
    public jxd0 f89045H6;

    /* JADX INFO: renamed from: I0 */
    public byd0 f89046I0;

    /* JADX INFO: renamed from: I1 */
    public C22507a<Boolean> f89047I1;

    /* JADX INFO: renamed from: I2 */
    public byd0 f89048I2;

    /* JADX INFO: renamed from: I3 */
    public jxd0 f89049I3;

    /* JADX INFO: renamed from: I4 */
    public jxd0 f89050I4;

    /* JADX INFO: renamed from: I5 */
    public wyd0 f89051I5;

    /* JADX INFO: renamed from: I6 */
    public byd0 f89052I6;

    /* JADX INFO: renamed from: J0 */
    public xyd0 f89053J0;

    /* JADX INFO: renamed from: J1 */
    public C22508b<String> f89054J1;

    /* JADX INFO: renamed from: J2 */
    public jxd0 f89055J2;

    /* JADX INFO: renamed from: J3 */
    public wyd0 f89056J3;

    /* JADX INFO: renamed from: J4 */
    public vxd0 f89057J4;

    /* JADX INFO: renamed from: J5 */
    public wyd0 f89058J5;

    /* JADX INFO: renamed from: J6 */
    public jxd0 f89059J6;

    /* JADX INFO: renamed from: K0 */
    public jxd0 f89060K0;

    /* JADX INFO: renamed from: K1 */
    public C22507a<Optional<WechatNotifySetting>> f89061K1;

    /* JADX INFO: renamed from: K2 */
    public jxd0 f89062K2;

    /* JADX INFO: renamed from: K3 */
    public byd0 f89063K3;

    /* JADX INFO: renamed from: K4 */
    public byd0 f89064K4;

    /* JADX INFO: renamed from: K5 */
    public wyd0 f89065K5;

    /* JADX INFO: renamed from: K6 */
    public jxd0 f89066K6;

    /* JADX INFO: renamed from: L0 */
    public jxd0 f89067L0;

    /* JADX INFO: renamed from: L1 */
    public C22507a<Optional<WechatNotifySetting>> f89068L1;

    /* JADX INFO: renamed from: L2 */
    public vxd0 f89069L2;

    /* JADX INFO: renamed from: L3 */
    public vxd0 f89070L3;

    /* JADX INFO: renamed from: L4 */
    public jxd0 f89071L4;

    /* JADX INFO: renamed from: L5 */
    public jxd0 f89072L5;

    /* JADX INFO: renamed from: L6 */
    public jxd0 f89073L6;

    /* JADX INFO: renamed from: M0 */
    public C22507a<uxj0> f89074M0;

    /* JADX INFO: renamed from: M1 */
    public vxd0 f89075M1;

    /* JADX INFO: renamed from: M2 */
    public byd0 f89076M2;

    /* JADX INFO: renamed from: M3 */
    public byd0 f89077M3;

    /* JADX INFO: renamed from: M4 */
    public vxd0 f89078M4;

    /* JADX INFO: renamed from: M5 */
    public jxd0 f89079M5;

    /* JADX INFO: renamed from: M6 */
    public jxd0 f89080M6;

    /* JADX INFO: renamed from: N0 */
    public byd0 f89081N0;

    /* JADX INFO: renamed from: N1 */
    public jxd0 f89082N1;

    /* JADX INFO: renamed from: N2 */
    public jxd0 f89083N2;

    /* JADX INFO: renamed from: N3 */
    public C22508b<uxj0> f89084N3;

    /* JADX INFO: renamed from: N4 */
    public jxd0 f89085N4;

    /* JADX INFO: renamed from: N5 */
    public jxd0 f89086N5;

    /* JADX INFO: renamed from: N6 */
    public byd0 f89087N6;

    /* JADX INFO: renamed from: O0 */
    public byd0 f89088O0;

    /* JADX INFO: renamed from: O1 */
    public jxd0 f89089O1;

    /* JADX INFO: renamed from: O2 */
    public jxd0 f89090O2;

    /* JADX INFO: renamed from: O3 */
    public jxd0 f89091O3;

    /* JADX INFO: renamed from: O4 */
    public byd0 f89092O4;

    /* JADX INFO: renamed from: O5 */
    public vxd0 f89093O5;

    /* JADX INFO: renamed from: O6 */
    public byd0 f89094O6;

    /* JADX INFO: renamed from: P0 */
    public byd0 f89095P0;

    /* JADX INFO: renamed from: P1 */
    public jxd0 f89096P1;

    /* JADX INFO: renamed from: P2 */
    public jxd0 f89097P2;

    /* JADX INFO: renamed from: P3 */
    public vxd0 f89098P3;

    /* JADX INFO: renamed from: P4 */
    public byd0 f89099P4;

    /* JADX INFO: renamed from: P5 */
    public byd0 f89100P5;

    /* JADX INFO: renamed from: P6 */
    public Map<String, String> f89101P6;

    /* JADX INFO: renamed from: Q */
    public final C4883c f89102Q;

    /* JADX INFO: renamed from: Q0 */
    public byd0 f89103Q0;

    /* JADX INFO: renamed from: Q1 */
    public byd0 f89104Q1;

    /* JADX INFO: renamed from: Q2 */
    public byd0 f89105Q2;

    /* JADX INFO: renamed from: Q3 */
    public vxd0 f89106Q3;

    /* JADX INFO: renamed from: Q4 */
    public byd0 f89107Q4;

    /* JADX INFO: renamed from: Q5 */
    public byd0 f89108Q5;

    /* JADX INFO: renamed from: Q6 */
    public HashMap<String, List<LiteraturesComments>> f89109Q6;

    /* JADX INFO: renamed from: R */
    public final gyd0 f89110R;

    /* JADX INFO: renamed from: R0 */
    public byd0 f89111R0;

    /* JADX INFO: renamed from: R1 */
    public C22507a<uxj0> f89112R1;

    /* JADX INFO: renamed from: R2 */
    public byd0 f89113R2;

    /* JADX INFO: renamed from: R3 */
    public wyd0 f89114R3;

    /* JADX INFO: renamed from: R4 */
    public vxd0 f89115R4;

    /* JADX INFO: renamed from: R5 */
    public byd0 f89116R5;

    /* JADX INFO: renamed from: R6 */
    public HashMap<String, Literatures> f89117R6;

    /* JADX INFO: renamed from: S */
    public final jxd0 f89118S;

    /* JADX INFO: renamed from: S0 */
    public jxd0 f89119S0;

    /* JADX INFO: renamed from: S1 */
    public C22507a<uxj0> f89120S1;

    /* JADX INFO: renamed from: S2 */
    public wyd0 f89121S2;

    /* JADX INFO: renamed from: S3 */
    public jxd0 f89122S3;

    /* JADX INFO: renamed from: S4 */
    public byd0 f89123S4;

    /* JADX INFO: renamed from: S5 */
    public vxd0 f89124S5;

    /* JADX INFO: renamed from: S6 */
    public ConcurrentHashMap<String, NewTags> f89125S6;

    /* JADX INFO: renamed from: T */
    public vxd0 f89126T;

    /* JADX INFO: renamed from: T0 */
    public vxd0 f89127T0;

    /* JADX INFO: renamed from: T1 */
    public C22507a<uxj0> f89128T1;

    /* JADX INFO: renamed from: T2 */
    public byd0 f89129T2;

    /* JADX INFO: renamed from: T3 */
    public vxd0 f89130T3;

    /* JADX INFO: renamed from: T4 */
    public vxd0 f89131T4;

    /* JADX INFO: renamed from: T5 */
    public vxd0 f89132T5;

    /* JADX INFO: renamed from: T6 */
    public LinkedHashMap<String, NewTags> f89133T6;

    /* JADX INFO: renamed from: U */
    public C22507a<uxj0> f89134U;

    /* JADX INFO: renamed from: U0 */
    public vxd0 f89135U0;

    /* JADX INFO: renamed from: U1 */
    public C22507a<LoveLetterEntryInfo> f89136U1;

    /* JADX INFO: renamed from: U2 */
    public byd0 f89137U2;

    /* JADX INFO: renamed from: U3 */
    public wyd0 f89138U3;

    /* JADX INFO: renamed from: U4 */
    public jxd0 f89139U4;

    /* JADX INFO: renamed from: U5 */
    public vxd0 f89140U5;

    /* JADX INFO: renamed from: U6 */
    public Set<String> f89141U6;

    /* JADX INFO: renamed from: V */
    public C22507a<String> f89142V;

    /* JADX INFO: renamed from: V0 */
    public vxd0 f89143V0;

    /* JADX INFO: renamed from: V1 */
    public vxd0 f89144V1;

    /* JADX INFO: renamed from: V2 */
    public jxd0 f89145V2;

    /* JADX INFO: renamed from: V3 */
    public byd0 f89146V3;

    /* JADX INFO: renamed from: V4 */
    public jxd0 f89147V4;

    /* JADX INFO: renamed from: V5 */
    public vxd0 f89148V5;

    /* JADX INFO: renamed from: V6 */
    public C22507a<FakeGuideData> f89149V6;

    /* JADX INFO: renamed from: W */
    public C22507a<Boolean> f89150W;

    /* JADX INFO: renamed from: W0 */
    public jxd0 f89151W0;

    /* JADX INFO: renamed from: W1 */
    public wyd0 f89152W1;

    /* JADX INFO: renamed from: W2 */
    public wyd0 f89153W2;

    /* JADX INFO: renamed from: W3 */
    public vxd0 f89154W3;

    /* JADX INFO: renamed from: W4 */
    public byd0 f89155W4;

    /* JADX INFO: renamed from: W5 */
    public byd0 f89156W5;

    /* JADX INFO: renamed from: W6 */
    public UserFeedbackInfo f89157W6;

    /* JADX INFO: renamed from: X */
    public byd0 f89158X;

    /* JADX INFO: renamed from: X0 */
    public jxd0 f89159X0;

    /* JADX INFO: renamed from: X1 */
    public jxd0 f89160X1;

    /* JADX INFO: renamed from: X2 */
    public jxd0 f89161X2;

    /* JADX INFO: renamed from: X3 */
    public byd0 f89162X3;

    /* JADX INFO: renamed from: X4 */
    public vxd0 f89163X4;

    /* JADX INFO: renamed from: X5 */
    public vxd0 f89164X5;

    /* JADX INFO: renamed from: X6 */
    public String f89165X6;

    /* JADX INFO: renamed from: Y */
    public vxd0 f89166Y;

    /* JADX INFO: renamed from: Y0 */
    public C22507a<Boolean> f89167Y0;

    /* JADX INFO: renamed from: Y1 */
    public C22507a<uxj0> f89168Y1;

    /* JADX INFO: renamed from: Y2 */
    public jxd0 f89169Y2;

    /* JADX INFO: renamed from: Y3 */
    public vxd0 f89170Y3;

    /* JADX INFO: renamed from: Y4 */
    public jxd0 f89171Y4;

    /* JADX INFO: renamed from: Y5 */
    public wyd0 f89172Y5;

    /* JADX INFO: renamed from: Y6 */
    public boolean f89173Y6;

    /* JADX INFO: renamed from: Z */
    public byd0 f89174Z;

    /* JADX INFO: renamed from: Z0 */
    public jxd0 f89175Z0;

    /* JADX INFO: renamed from: Z1 */
    public vxd0 f89176Z1;

    /* JADX INFO: renamed from: Z2 */
    public jxd0 f89177Z2;

    /* JADX INFO: renamed from: Z3 */
    public wyd0 f89178Z3;

    /* JADX INFO: renamed from: Z4 */
    public byd0 f89179Z4;

    /* JADX INFO: renamed from: Z5 */
    public vxd0 f89180Z5;

    /* JADX INFO: renamed from: Z6 */
    public boolean f89181Z6;

    /* JADX INFO: renamed from: a0 */
    public wyd0 f89182a0;

    /* JADX INFO: renamed from: a1 */
    public jxd0 f89183a1;

    /* JADX INFO: renamed from: a2 */
    public byd0 f89184a2;

    /* JADX INFO: renamed from: a3 */
    public jxd0 f89185a3;

    /* JADX INFO: renamed from: a4 */
    public jxd0 f89186a4;

    /* JADX INFO: renamed from: a5 */
    public vxd0 f89187a5;

    /* JADX INFO: renamed from: a6 */
    public vxd0 f89188a6;

    /* JADX INFO: renamed from: a7 */
    public boolean f89189a7;

    /* JADX INFO: renamed from: b0 */
    public jxd0 f89190b0;

    /* JADX INFO: renamed from: b1 */
    public C22507a<Integer> f89191b1;

    /* JADX INFO: renamed from: b2 */
    public byd0 f89192b2;

    /* JADX INFO: renamed from: b3 */
    public jxd0 f89193b3;

    /* JADX INFO: renamed from: b4 */
    public jxd0 f89194b4;

    /* JADX INFO: renamed from: b5 */
    public jxd0 f89195b5;

    /* JADX INFO: renamed from: b6 */
    public byd0 f89196b6;

    /* JADX INFO: renamed from: b7 */
    public C22507a<List<ProfileCountInfo>> f89197b7;

    /* JADX INFO: renamed from: c0 */
    public jxd0 f89198c0;

    /* JADX INFO: renamed from: c1 */
    public jxd0 f89199c1;

    /* JADX INFO: renamed from: c2 */
    public jxd0 f89200c2;

    /* JADX INFO: renamed from: c3 */
    public jxd0 f89201c3;

    /* JADX INFO: renamed from: c4 */
    public jxd0 f89202c4;

    /* JADX INFO: renamed from: c5 */
    public jxd0 f89203c5;

    /* JADX INFO: renamed from: c6 */
    public byd0 f89204c6;

    /* JADX INFO: renamed from: c7 */
    public C22508b<uxj0> f89205c7;

    /* JADX INFO: renamed from: d0 */
    public jxd0 f89206d0;

    /* JADX INFO: renamed from: d1 */
    public jxd0 f89207d1;

    /* JADX INFO: renamed from: d2 */
    public jxd0 f89208d2;

    /* JADX INFO: renamed from: d3 */
    public wyd0 f89209d3;

    /* JADX INFO: renamed from: d4 */
    public jxd0 f89210d4;

    /* JADX INFO: renamed from: d5 */
    public jxd0 f89211d5;

    /* JADX INFO: renamed from: d6 */
    public wyd0 f89212d6;

    /* JADX INFO: renamed from: d7 */
    public C22508b<Integer> f89213d7;

    /* JADX INFO: renamed from: e0 */
    public jxd0 f89214e0;

    /* JADX INFO: renamed from: e1 */
    public jxd0 f89215e1;

    /* JADX INFO: renamed from: e2 */
    public jxd0 f89216e2;

    /* JADX INFO: renamed from: e3 */
    public wyd0 f89217e3;

    /* JADX INFO: renamed from: e4 */
    public jxd0 f89218e4;

    /* JADX INFO: renamed from: e5 */
    public boolean f89219e5;

    /* JADX INFO: renamed from: e6 */
    public wyd0 f89220e6;

    /* JADX INFO: renamed from: e7 */
    public final C16565l f89221e7;

    /* JADX INFO: renamed from: f0 */
    public jxd0 f89222f0;

    /* JADX INFO: renamed from: f1 */
    public wyd0 f89223f1;

    /* JADX INFO: renamed from: f2 */
    public wyd0 f89224f2;

    /* JADX INFO: renamed from: f3 */
    public long f89225f3;

    /* JADX INFO: renamed from: f4 */
    public jxd0 f89226f4;

    /* JADX INFO: renamed from: f5 */
    public boolean f89227f5;

    /* JADX INFO: renamed from: f6 */
    public wyd0 f89228f6;

    /* JADX INFO: renamed from: f7 */
    public final C16564k f89229f7;

    /* JADX INFO: renamed from: g0 */
    public czd0 f89230g0;

    /* JADX INFO: renamed from: g1 */
    public byd0 f89231g1;

    /* JADX INFO: renamed from: g2 */
    public byd0 f89232g2;

    /* JADX INFO: renamed from: g3 */
    public wyd0 f89233g3;

    /* JADX INFO: renamed from: g4 */
    public C22508b<String> f89234g4;

    /* JADX INFO: renamed from: g5 */
    public boolean f89235g5;

    /* JADX INFO: renamed from: g6 */
    public wyd0 f89236g6;

    /* JADX INFO: renamed from: g7 */
    public C16563j f89237g7;

    /* JADX INFO: renamed from: h0 */
    public jxd0 f89238h0;

    /* JADX INFO: renamed from: h1 */
    public jxd0 f89239h1;

    /* JADX INFO: renamed from: h2 */
    public jxd0 f89240h2;

    /* JADX INFO: renamed from: h3 */
    public vxd0 f89241h3;

    /* JADX INFO: renamed from: h4 */
    public C22508b<uxj0> f89242h4;

    /* JADX INFO: renamed from: h5 */
    public jxd0 f89243h5;

    /* JADX INFO: renamed from: h6 */
    public jxd0 f89244h6;

    /* JADX INFO: renamed from: h7 */
    public boolean f89245h7;

    /* JADX INFO: renamed from: i0 */
    public vxd0 f89246i0;

    /* JADX INFO: renamed from: i1 */
    public wyd0 f89247i1;

    /* JADX INFO: renamed from: i2 */
    public wyd0 f89248i2;

    /* JADX INFO: renamed from: i3 */
    public byd0 f89249i3;

    /* JADX INFO: renamed from: i4 */
    public wyd0 f89250i4;

    /* JADX INFO: renamed from: i5 */
    public vxd0 f89251i5;

    /* JADX INFO: renamed from: i6 */
    public vxd0 f89252i6;

    /* JADX INFO: renamed from: i7 */
    public C22507a<List<MyTabTask>> f89253i7;

    /* JADX INFO: renamed from: j0 */
    public byd0 f89254j0;

    /* JADX INFO: renamed from: j1 */
    public vxd0 f89255j1;

    /* JADX INFO: renamed from: j2 */
    public byd0 f89256j2;

    /* JADX INFO: renamed from: j3 */
    public long f89257j3;

    /* JADX INFO: renamed from: j4 */
    public wyd0 f89258j4;

    /* JADX INFO: renamed from: j5 */
    public byd0 f89259j5;

    /* JADX INFO: renamed from: j6 */
    public jxd0 f89260j6;

    /* JADX INFO: renamed from: j7 */
    public C22507a<MyTabTask> f89261j7;

    /* JADX INFO: renamed from: k0 */
    public xyd0 f89262k0;

    /* JADX INFO: renamed from: k1 */
    public jxd0 f89263k1;

    /* JADX INFO: renamed from: k2 */
    public vxd0 f89264k2;

    /* JADX INFO: renamed from: k3 */
    public vxd0 f89265k3;

    /* JADX INFO: renamed from: k4 */
    public wyd0 f89266k4;

    /* JADX INFO: renamed from: k5 */
    public vxd0 f89267k5;

    /* JADX INFO: renamed from: k6 */
    public vxd0 f89268k6;

    /* JADX INFO: renamed from: k7 */
    public C22507a<MyTabTask> f89269k7;

    /* JADX INFO: renamed from: l0 */
    public byd0 f89270l0;

    /* JADX INFO: renamed from: l1 */
    public byd0 f89271l1;

    /* JADX INFO: renamed from: l2 */
    public vxd0 f89272l2;

    /* JADX INFO: renamed from: l3 */
    public vxd0 f89273l3;

    /* JADX INFO: renamed from: l4 */
    public wyd0 f89274l4;

    /* JADX INFO: renamed from: l5 */
    public byd0 f89275l5;

    /* JADX INFO: renamed from: l6 */
    public wyd0 f89276l6;

    /* JADX INFO: renamed from: l7 */
    public C22507a<uxj0> f89277l7;

    /* JADX INFO: renamed from: m0 */
    public byd0 f89278m0;

    /* JADX INFO: renamed from: m1 */
    public C22507a<List<GPTopicCard>> f89279m1;

    /* JADX INFO: renamed from: m2 */
    public byd0 f89280m2;

    /* JADX INFO: renamed from: m3 */
    public jxd0 f89281m3;

    /* JADX INFO: renamed from: m4 */
    public wyd0 f89282m4;

    /* JADX INFO: renamed from: m5 */
    public vxd0 f89283m5;

    /* JADX INFO: renamed from: m6 */
    public jxd0 f89284m6;

    /* JADX INFO: renamed from: m7 */
    public vxd0 f89285m7;

    /* JADX INFO: renamed from: n0 */
    public byd0 f89286n0;

    /* JADX INFO: renamed from: n1 */
    public C22507a<HashMap<String, List<User>>> f89287n1;

    /* JADX INFO: renamed from: n2 */
    public byd0 f89288n2;

    /* JADX INFO: renamed from: n3 */
    public jxd0 f89289n3;

    /* JADX INFO: renamed from: n4 */
    public jxd0 f89290n4;

    /* JADX INFO: renamed from: n5 */
    public byd0 f89291n5;

    /* JADX INFO: renamed from: n6 */
    public jxd0 f89292n6;

    /* JADX INFO: renamed from: n7 */
    public jxd0 f89293n7;

    /* JADX INFO: renamed from: o0 */
    public xyd0 f89294o0;

    /* JADX INFO: renamed from: o1 */
    public C22507a<uxj0> f89295o1;

    /* JADX INFO: renamed from: o2 */
    public vxd0 f89296o2;

    /* JADX INFO: renamed from: o3 */
    public jxd0 f89297o3;

    /* JADX INFO: renamed from: o4 */
    public wyd0 f89298o4;

    /* JADX INFO: renamed from: o5 */
    public vxd0 f89299o5;

    /* JADX INFO: renamed from: o6 */
    public jxd0 f89300o6;

    /* JADX INFO: renamed from: p0 */
    public byd0 f89301p0;

    /* JADX INFO: renamed from: p1 */
    public byd0 f89302p1;

    /* JADX INFO: renamed from: p2 */
    public wyd0 f89303p2;

    /* JADX INFO: renamed from: p3 */
    public xyd0 f89304p3;

    /* JADX INFO: renamed from: p4 */
    public wyd0 f89305p4;

    /* JADX INFO: renamed from: p5 */
    public vxd0 f89306p5;

    /* JADX INFO: renamed from: p6 */
    public byd0 f89307p6;

    /* JADX INFO: renamed from: q0 */
    public xyd0 f89308q0;

    /* JADX INFO: renamed from: q1 */
    public jxd0 f89309q1;

    /* JADX INFO: renamed from: q2 */
    public jxd0 f89310q2;

    /* JADX INFO: renamed from: q3 */
    public xyd0 f89311q3;

    /* JADX INFO: renamed from: q4 */
    public vxd0 f89312q4;

    /* JADX INFO: renamed from: q5 */
    public byd0 f89313q5;

    /* JADX INFO: renamed from: q6 */
    public byd0 f89314q6;

    /* JADX INFO: renamed from: r0 */
    public byd0 f89315r0;

    /* JADX INFO: renamed from: r1 */
    public jxd0 f89316r1;

    /* JADX INFO: renamed from: r2 */
    public jxd0 f89317r2;

    /* JADX INFO: renamed from: r3 */
    public vxd0 f89318r3;

    /* JADX INFO: renamed from: r4 */
    public jxd0 f89319r4;

    /* JADX INFO: renamed from: r5 */
    public byd0 f89320r5;

    /* JADX INFO: renamed from: r6 */
    public jxd0 f89321r6;

    /* JADX INFO: renamed from: s0 */
    public xyd0 f89322s0;

    /* JADX INFO: renamed from: s1 */
    public jxd0 f89323s1;

    /* JADX INFO: renamed from: s2 */
    public jxd0 f89324s2;

    /* JADX INFO: renamed from: s3 */
    public byd0 f89325s3;

    /* JADX INFO: renamed from: s4 */
    public byd0 f89326s4;

    /* JADX INFO: renamed from: s5 */
    public vxd0 f89327s5;

    /* JADX INFO: renamed from: s6 */
    public wyd0 f89328s6;

    /* JADX INFO: renamed from: t0 */
    public jxd0 f89329t0;

    /* JADX INFO: renamed from: t1 */
    public jxd0 f89330t1;

    /* JADX INFO: renamed from: t2 */
    public mxd0 f89331t2;

    /* JADX INFO: renamed from: t3 */
    public wyd0 f89332t3;

    /* JADX INFO: renamed from: t4 */
    public byd0 f89333t4;

    /* JADX INFO: renamed from: t5 */
    public jxd0 f89334t5;

    /* JADX INFO: renamed from: t6 */
    public jxd0 f89335t6;

    /* JADX INFO: renamed from: u0 */
    public jxd0 f89336u0;

    /* JADX INFO: renamed from: u1 */
    public byd0 f89337u1;

    /* JADX INFO: renamed from: u2 */
    public jxd0 f89338u2;

    /* JADX INFO: renamed from: u3 */
    public wyd0 f89339u3;

    /* JADX INFO: renamed from: u4 */
    public vxd0 f89340u4;

    /* JADX INFO: renamed from: u5 */
    public wyd0 f89341u5;

    /* JADX INFO: renamed from: u6 */
    public C22507a<uxj0> f89342u6;

    /* JADX INFO: renamed from: v0 */
    public jxd0 f89343v0;

    /* JADX INFO: renamed from: v1 */
    public jxd0 f89344v1;

    /* JADX INFO: renamed from: v2 */
    public jxd0 f89345v2;

    /* JADX INFO: renamed from: v3 */
    public jxd0 f89346v3;

    /* JADX INFO: renamed from: v4 */
    public vxd0 f89347v4;

    /* JADX INFO: renamed from: v5 */
    public vxd0 f89348v5;

    /* JADX INFO: renamed from: v6 */
    public jxd0 f89349v6;

    /* JADX INFO: renamed from: w0 */
    public jxd0 f89350w0;

    /* JADX INFO: renamed from: w1 */
    public byd0 f89351w1;

    /* JADX INFO: renamed from: w2 */
    public jxd0 f89352w2;

    /* JADX INFO: renamed from: w3 */
    public vxd0 f89353w3;

    /* JADX INFO: renamed from: w4 */
    public jxd0 f89354w4;

    /* JADX INFO: renamed from: w5 */
    public wyd0 f89355w5;

    /* JADX INFO: renamed from: w6 */
    public jxd0 f89356w6;

    /* JADX INFO: renamed from: x0 */
    public vxd0 f89357x0;

    /* JADX INFO: renamed from: x1 */
    public byd0 f89358x1;

    /* JADX INFO: renamed from: x2 */
    public wyd0 f89359x2;

    /* JADX INFO: renamed from: x3 */
    public byd0 f89360x3;

    /* JADX INFO: renamed from: x4 */
    public jxd0 f89361x4;

    /* JADX INFO: renamed from: x5 */
    public vxd0 f89362x5;

    /* JADX INFO: renamed from: x6 */
    public byd0 f89363x6;

    /* JADX INFO: renamed from: y0 */
    public jxd0 f89364y0;

    /* JADX INFO: renamed from: y1 */
    public jxd0 f89365y1;

    /* JADX INFO: renamed from: y2 */
    public byd0 f89366y2;

    /* JADX INFO: renamed from: y3 */
    public byd0 f89367y3;

    /* JADX INFO: renamed from: y4 */
    public vxd0 f89368y4;

    /* JADX INFO: renamed from: y5 */
    public wyd0 f89369y5;

    /* JADX INFO: renamed from: y6 */
    public jxd0 f89370y6;

    /* JADX INFO: renamed from: z0 */
    public C22507a<Boolean> f89371z0;

    /* JADX INFO: renamed from: z1 */
    public wyd0 f89372z1;

    /* JADX INFO: renamed from: z2 */
    public vxd0 f89373z2;

    /* JADX INFO: renamed from: z3 */
    public jxd0 f89374z3;

    /* JADX INFO: renamed from: z4 */
    public jxd0 f89375z4;

    /* JADX INFO: renamed from: z5 */
    public vxd0 f89376z5;

    /* JADX INFO: renamed from: z6 */
    public jxd0 f89377z6;

    /* JADX INFO: renamed from: l.dkb$a */
    public class C16554a implements qcj<Envelope, Boolean> {
        public C16554a() {
        }

        @Override // p153l.qcj
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean call(Envelope envelope) {
            int i = envelope.meta.code;
            return (i == 200 || i == 201) ? Boolean.TRUE : Boolean.FALSE;
        }
    }

    /* JADX INFO: renamed from: l.dkb$b */
    public class C16555b implements pcj<C22421c<Envelope>> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f89379a;

        /* JADX INFO: renamed from: l.dkb$b$a */
        public class a implements pcj<x1d0> {
            public a() {
            }

            @Override // p153l.pcj, java.util.concurrent.Callable
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public x1d0 call() {
                return C4879a.f20236P.auth().m209043q(C4879a.m32369w2(C16555b.this.f89379a)).m209032f().m209028b();
            }
        }

        public C16555b(String str) {
            this.f89379a = str;
        }

        @Override // p153l.pcj, java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public C22421c<Envelope> call() {
            return qi20.m176658e(new a()).compose(psd0.m173592C());
        }
    }

    /* JADX INFO: renamed from: l.dkb$c */
    public class C16556c implements pcj<C22421c<Envelope>> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f89382a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ z1d0 f89383b;

        /* JADX INFO: renamed from: l.dkb$c$a */
        public class a implements pcj<x1d0> {
            public a() {
            }

            @Override // p153l.pcj, java.util.concurrent.Callable
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public x1d0 call() {
                return C4879a.f20236P.auth().m209043q(C16556c.this.f89382a).m209038l(C16556c.this.f89383b).m209028b();
            }
        }

        public C16556c(String str, z1d0 z1d0Var) {
            this.f89382a = str;
            this.f89383b = z1d0Var;
        }

        @Override // p153l.pcj, java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public C22421c<Envelope> call() {
            return qi20.m176658e(new a()).observeOn(fo0.m126432a());
        }
    }

    /* JADX INFO: renamed from: l.dkb$d */
    public class C16557d implements pcj<x1d0> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f89386a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ z1d0 f89387b;

        public C16557d(String str, z1d0 z1d0Var) {
            this.f89386a = str;
            this.f89387b = z1d0Var;
        }

        @Override // p153l.pcj, java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public x1d0 call() {
            return C4879a.f20236P.auth().m209043q(this.f89386a).m209038l(this.f89387b).m209028b();
        }
    }

    /* JADX INFO: renamed from: l.dkb$e */
    public class C16558e implements qcj<UserFeedbackInfo, UserFeedbackInfo> {
        public C16558e() {
        }

        @Override // p153l.qcj
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public UserFeedbackInfo call(UserFeedbackInfo userFeedbackInfo) {
            CoreModule.f18264c.f20381e0.f89157W6 = userFeedbackInfo;
            return userFeedbackInfo;
        }
    }

    /* JADX INFO: renamed from: l.dkb$f */
    public class C16559f implements qcj<Envelope, UserFeedbackInfo> {
        public C16559f() {
        }

        @Override // p153l.qcj
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public UserFeedbackInfo call(Envelope envelope) {
            return ((CoreData) envelope.getModuleData(CoreData.class)).userFeedbackInfo;
        }
    }

    /* JADX INFO: renamed from: l.dkb$g */
    public class C16560g implements qcj<UserFeedbackInfo, UserFeedbackInfo> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f89391a;

        public C16560g(String str) {
            this.f89391a = str;
        }

        @Override // p153l.qcj
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public UserFeedbackInfo call(UserFeedbackInfo userFeedbackInfo) {
            if (!TextUtils.equals(this.f89391a, "ai_manual")) {
                CoreModule.f18264c.f20381e0.f89157W6 = userFeedbackInfo;
                return userFeedbackInfo;
            }
            if (userFeedbackInfo.isGetFeedBackAI) {
                CoreModule.f18264c.f20381e0.m116527W9(CoreModule.m30929H().userId());
            }
            return userFeedbackInfo;
        }
    }

    /* JADX INFO: renamed from: l.dkb$h */
    public class C16561h implements qcj<Envelope, UserFeedbackInfo> {
        public C16561h() {
        }

        @Override // p153l.qcj
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public UserFeedbackInfo call(Envelope envelope) {
            return ((CoreData) envelope.getModuleData(CoreData.class)).userFeedbackInfo;
        }
    }

    /* JADX INFO: renamed from: l.dkb$i */
    public class C16562i implements qcj<Envelope, uxj0> {
        public C16562i() {
        }

        @Override // p153l.qcj
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public uxj0 call(Envelope envelope) {
            return uxj0.f181467a;
        }
    }

    /* JADX INFO: renamed from: l.dkb$j */
    public static class C16563j extends mof0<Map<String, GPMemo>> {
        public C16563j(dkb dkbVar) {
            super("gpMemos", new dji(new vod("gp_memos", "_v3", CoreModule.m30929H().userId()), -1, ProtobufAdapter.HASH_MAP_ADAPTER(new qcj() { // from class: l.ekb
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((GPMemo) obj).userId;
                }
            }, GPMemo.PROTOBUF_ADAPTER)), new pcj() { // from class: l.fkb
                @Override // p153l.pcj, java.util.concurrent.Callable
                public final Object call() {
                    return qi20.m176656c(new pcj() { // from class: l.gkb
                        @Override // p153l.pcj, java.util.concurrent.Callable
                        public final Object call() {
                            return C4879a.f20236P.auth().m209043q(C4879a.m32369w2("/" + CoreModule.m30929H().userId() + "/memos")).m209032f().m209028b();
                        }
                    }, GPMemoEnvelope.JSON_ADAPTER).map(new qcj() { // from class: l.hkb
                        @Override // p153l.qcj
                        public final Object call(Object obj) {
                            return ((GPMemoEnvelope) obj).data.memos;
                        }
                    }).flatMap(new rb8()).toMap(new qcj() { // from class: l.ikb
                        @Override // p153l.qcj
                        public final Object call(Object obj) {
                            return ((GPMemo) obj).userId;
                        }
                    });
                }
            });
        }
    }

    /* JADX INFO: renamed from: l.dkb$k */
    public static class C16564k extends mof0<CurrencyTypeData> {
        public C16564k() {
            super("currencyType", new dji(new vod("intl_currency_type", "_1", "_" + CoreModule.m30929H().userId()), -1, CurrencyTypeData.PROTOBUF_ADAPTER), new pcj() { // from class: l.jkb
                @Override // p153l.pcj, java.util.concurrent.Callable
                public final Object call() {
                    return qi20.m176656c(new pcj() { // from class: l.kkb
                        @Override // p153l.pcj, java.util.concurrent.Callable
                        public final Object call() {
                            return C4879a.f20236P.auth().m209043q(C4879a.m32203G("/intl-currency-switch")).m209032f().m209028b();
                        }
                    }, CurrencyTypeEnvelop.JSON_ADAPTER).map(new qcj() { // from class: l.lkb
                        @Override // p153l.qcj
                        public final Object call(Object obj) {
                            return dkb.C16564k.m116658B((CurrencyTypeEnvelop) obj);
                        }
                    });
                }
            });
        }

        /* JADX INFO: renamed from: B */
        public static /* synthetic */ CurrencyTypeData m116658B(CurrencyTypeEnvelop currencyTypeEnvelop) {
            String str = currencyTypeEnvelop.data.currencyType;
            uqb0.f180369D0 = str;
            CoreModule.f18264c.f20381e0.f89276l6.put(str);
            fhw.m125605a("[putong-common][currency_type]", "current currency type = " + str);
            return currencyTypeEnvelop.data;
        }
    }

    /* JADX INFO: renamed from: l.dkb$l */
    public static class C16565l extends mof0<RegionRule> {
        public C16565l() {
            super("regionRules", new dji(new vod("region_rule", "_2", "_" + CoreModule.m30929H().userId()), -1, RegionRule.PROTOBUF_ADAPTER), new pcj() { // from class: l.mkb
                @Override // p153l.pcj, java.util.concurrent.Callable
                public final Object call() {
                    return qi20.m176656c(new pcj() { // from class: l.nkb
                        @Override // p153l.pcj, java.util.concurrent.Callable
                        public final Object call() {
                            return C4879a.f20236P.auth().m209043q(C4879a.m32365v2("me/region-rules")).m209032f().m209028b();
                        }
                    }, RegionRulesEnvelop.JSON_ADAPTER).map(new qcj() { // from class: l.okb
                        @Override // p153l.qcj
                        public final Object call(Object obj) {
                            return dkb.C16565l.m116662C((RegionRulesEnvelop) obj);
                        }
                    });
                }
            });
        }

        /* JADX INFO: renamed from: C */
        public static /* synthetic */ RegionRule m116662C(RegionRulesEnvelop regionRulesEnvelop) {
            RegionRule regionRule = regionRulesEnvelop.data.regionRules.get(0);
            LiveRegionTag liveRegionTag = regionRule.liveRegionTag;
            uqb0.f180402h0 = liveRegionTag;
            CoreModule.f18264c.f20381e0.f89182a0.put(liveRegionTag.toString());
            fhw.m125605a("[putong-common][regiontag]", "current live region tag = " + regionRule.liveRegionTag.toString());
            return regionRule;
        }
    }

    public dkb(C4883c c4883c, String str) {
        super(c4883c);
        this.f89191b1 = C22507a.m222759c(0);
        this.f89020E1 = C22508b.m222767b();
        this.f89027F1 = C22508b.m222767b();
        this.f89034G1 = C22507a.m222758b();
        this.f89041H1 = C22508b.m222767b();
        Boolean bool = Boolean.TRUE;
        this.f89047I1 = C22507a.m222759c(bool);
        this.f89054J1 = C22508b.m222767b();
        this.f89061K1 = C22507a.m222758b();
        this.f89068L1 = C22507a.m222758b();
        this.f89112R1 = C22507a.m222758b();
        this.f89120S1 = C22507a.m222758b();
        uxj0 uxj0Var = uxj0.f181467a;
        this.f89128T1 = C22507a.m222759c(uxj0Var);
        this.f89136U1 = C22507a.m222758b();
        this.f89144V1 = new vxd0("maxAdmobNum" + CoreModule.m30929H().userId(), -1);
        this.f89152W1 = new wyd0("showProfileAdTime" + CoreModule.m30929H().userId(), "");
        this.f89168Y1 = C22507a.m222758b();
        this.f89225f3 = 0L;
        this.f89257j3 = 0L;
        this.f89265k3 = new vxd0("bottombarLocationOnScreenY", 0);
        this.f89273l3 = new vxd0("messageAllSortLayoutLocationOnScreenY", 0);
        this.f89084N3 = C22508b.m222767b();
        this.f89234g4 = C22508b.m222767b();
        this.f89242h4 = C22508b.m222767b();
        this.f89219e5 = false;
        this.f89227f5 = false;
        this.f89235g5 = false;
        this.f89342u6 = C22507a.m222758b();
        this.f89101P6 = new HashMap();
        this.f89109Q6 = new HashMap<>(128);
        this.f89117R6 = new HashMap<>();
        this.f89125S6 = new ConcurrentHashMap<>(512);
        this.f89133T6 = new LinkedHashMap<>();
        this.f89141U6 = new HashSet();
        this.f89149V6 = C22507a.m222758b();
        this.f89173Y6 = false;
        this.f89181Z6 = false;
        this.f89189a7 = false;
        this.f89197b7 = C22507a.m222758b();
        this.f89205c7 = C22508b.m222767b();
        this.f89213d7 = C22508b.m222767b();
        this.f89221e7 = new C16565l();
        this.f89229f7 = new C16564k();
        this.f89237g7 = new C16563j(this);
        this.f89245h7 = false;
        this.f89253i7 = C22507a.m222758b();
        this.f89261j7 = C22507a.m222758b();
        this.f89269k7 = C22507a.m222759c(MyTabTask.new_());
        this.f89277l7 = C22507a.m222759c(uxj0Var);
        this.f89285m7 = new vxd0("latest_invite_verify_count_" + CoreModule.m30929H().userId(), 0);
        this.f89293n7 = new jxd0("latest_invite_verify_showed_" + CoreModule.m30929H().userId(), bool);
        this.f89102Q = c4883c;
        this.f88999B1 = str;
        this.f89165X6 = niw.m163315e(str + pzi0.m174454o());
        StringBuilder sb = new StringBuilder("userSettings_");
        sb.append(CoreModule.m30929H().userId());
        this.f89110R = new gyd0(sb.toString(), true, "putongPref");
        this.f89126T = new vxd0("session_changed_fake_profile" + CoreModule.m30929H().userId(), -1);
        this.f89134U = C22507a.m222758b();
        this.f89142V = C22507a.m222758b();
        Boolean bool2 = Boolean.FALSE;
        this.f89150W = C22507a.m222759c(bool2);
        this.f89134U.m137019l(uxj0Var);
        this.f89158X = new byd0("swipe_count_" + CoreModule.m30929H().userId(), 0L);
        this.f89166Y = new vxd0("super_like_shown_count" + CoreModule.m30929H().userId(), 0);
        this.f89174Z = new byd0("last_superlike_dlg_shown" + CoreModule.m30929H().userId(), 0L);
        this.f89190b0 = new jxd0("signup_al_bind_phone" + CoreModule.m30929H().userId(), bool2);
        this.f89222f0 = new jxd0("new_mine_tab_setting_clicked" + CoreModule.m30929H().userId(), bool2);
        this.f89206d0 = new jxd0("gp_bind_phone_notice" + CoreModule.m30929H().userId(), bool);
        this.f89214e0 = new jxd0("gp_bind_phone_red_dot" + CoreModule.m30929H().userId(), bool);
        this.f89371z0 = C22507a.m222758b();
        this.f89198c0 = new jxd0("all_bind_f_showing_" + CoreModule.m30929H().userId(), bool2);
        this.f89118S = new jxd0("isFromSignUp_" + CoreModule.m30929H().userId(), bool2);
        this.f89230g0 = new czd0("new_user_vip_strategy" + CoreModule.m30929H().userId(), true);
        this.f88991A0 = C22507a.m222758b();
        this.f89005C0 = C22507a.m222758b();
        this.f89012D0 = C22507a.m222758b();
        this.f89019E0 = C22507a.m222758b();
        this.f89026F0 = C22507a.m222758b();
        this.f89238h0 = new jxd0("has_shown_gp_vip_update_guide", bool2);
        this.f89246i0 = new vxd0("vip_update_guide_privilege_display_count" + CoreModule.m30929H().userId(), 0);
        this.f89254j0 = new byd0("push_guide_dialog_show_time" + CoreModule.m30929H().userId(), 0L);
        this.f89262k0 = new xyd0("push_guide_dialog_close_time_set" + CoreModule.m30929H().userId(), new HashSet());
        this.f89270l0 = new byd0("push_guide_dialog_close_freezing_time" + CoreModule.m30929H().userId(), 0L);
        this.f89278m0 = new byd0("push_guide_notify_auth_open_time" + CoreModule.m30929H().userId(), 0L);
        this.f89286n0 = new byd0("conversation_header_guide_show_time" + CoreModule.m30929H().userId(), 0L);
        this.f89301p0 = new byd0("push_conv_header_close_freezing_time" + CoreModule.m30929H().userId(), 0L);
        this.f89294o0 = new xyd0("push_conv_header_close_timeSet" + CoreModule.m30929H().userId(), new HashSet());
        this.f89315r0 = new byd0("msg_main_top_guide_user_update_time" + CoreModule.m30929H().userId(), 0L);
        this.f89308q0 = new xyd0("msg_main_top_guide_userid_set" + CoreModule.m30929H().userId(), new HashSet());
        this.f89322s0 = new xyd0("msg_main_top_guide_userid_close_set" + CoreModule.m30929H().userId(), new HashSet());
        this.f89329t0 = new jxd0("hasDisplaySearch_" + CoreModule.m30929H().userId(), bool2);
        this.f89336u0 = new jxd0("isNewPicPicked" + CoreModule.m30929H().userId(), bool2);
        this.f89343v0 = new jxd0("IsSmartPortraitSwitchCheckedAtFirst" + CoreModule.m30929H().userId(), bool2);
        this.f89350w0 = new jxd0("chatNewMatchShowCloseConfirmDlg", bool2);
        this.f89357x0 = new vxd0("chatNewMatchCountMaxNum", 100);
        this.f89364y0 = new jxd0("NeedOpenSmartPortraitWhenUploadNewPic" + CoreModule.m30929H().userId(), bool2);
        this.f89067L0 = new jxd0("has_patch_india_lady_privacy_" + CoreModule.m30929H().userId(), bool2);
        this.f89040H0 = new vxd0("tantanAuthToastShowTimes_v3_" + CoreModule.m30929H().userId(), 0);
        this.f89046I0 = new byd0("tantanAuthToastLastShowTime_v3_" + CoreModule.m30929H().userId(), 0L);
        this.f89053J0 = new xyd0("tantanAuthToastShowUser_v3_" + CoreModule.m30929H().userId(), new HashSet());
        this.f89060K0 = new jxd0("chatTantanAuthTipsShown_v3_" + CoreModule.m30929H().userId(), bool2);
        this.f89074M0 = C22507a.m222758b();
        this.f89182a0 = new wyd0("last_live_region_tag_" + CoreModule.m30929H().userId(), "");
        this.f89081N0 = new byd0("swipe_all_counts_" + CoreModule.m30929H().userId(), 0L);
        this.f89088O0 = new byd0("today_start_swipe_time_" + CoreModule.m30929H().userId(), 0L);
        this.f89095P0 = new byd0("today_swipe_count_" + CoreModule.m30929H().userId(), 0L);
        this.f89103Q0 = new byd0("today_right_swipe_count_" + CoreModule.m30929H().userId(), 0L);
        this.f89111R0 = new byd0("last_dangerous_user_safety_reminder_time_" + CoreModule.m30929H().userId(), 0L);
        this.f89127T0 = new vxd0("popup_number_" + CoreModule.m30929H().userId(), 0);
        this.f89135U0 = new vxd0("show_fake_dlg_count_4_intl_" + CoreModule.m30929H().userId(), 0);
        this.f89151W0 = new jxd0("profile_blur_cover_show", bool2);
        this.f89143V0 = new vxd0("fakeSwipeDlgShowCount" + CoreModule.m30929H().userId(), 0);
        this.f89159X0 = new jxd0("click_moment_" + CoreModule.m30929H().userId(), bool2);
        this.f89033G0 = new vxd0("see_show_cnt_" + CoreModule.m30929H().userId(), 0);
        this.f89175Z0 = new jxd0("already_merge_dialog_info" + CoreModule.m30929H().userId(), bool2);
        uqb0.f180402h0 = LiveRegionTag.get(this.f89182a0.get());
        this.f89183a1 = new jxd0("full_card_anim_reset_" + CoreModule.m30929H().userId(), bool2);
        this.f89199c1 = new jxd0("profile_example_tab_dot_show", bool);
        this.f89207d1 = new jxd0("profile_tickle_set_" + CoreModule.m30929H().userId(), bool2);
        this.f89215e1 = new jxd0("profile_tickle_set_tip_show_" + CoreModule.m30929H().userId(), bool2);
        this.f89223f1 = new wyd0("profile_tickle_set_tip_message_show_" + CoreModule.m30929H().userId(), "");
        this.f89231g1 = new byd0("enter_tickle_group_time_" + CoreModule.m30929H().userId(), 0L);
        this.f89239h1 = new jxd0("local_tickle_tip_show_" + CoreModule.m30929H().userId(), bool2);
        this.f89247i1 = new wyd0("local_tickle_tip_message_" + CoreModule.m30929H().userId(), "");
        this.f89255j1 = new vxd0("main_trans_speed", 1);
        this.f89263k1 = new jxd0("showUser43Crop", bool2);
        this.f89279m1 = C22507a.m222758b();
        this.f89287n1 = C22507a.m222758b();
        this.f89295o1 = C22507a.m222758b();
        this.f89302p1 = new byd0("latest_theme_show_temp_" + CoreModule.m30929H().userId(), 0L);
        this.f89309q1 = new jxd0("fake_gender_clicked_" + CoreModule.m30929H().userId(), bool2);
        this.f89330t1 = new jxd0("contact_guid" + CoreModule.m30929H().userId(), bool2);
        this.f89337u1 = new byd0("latest_close_female_chat_guide_time_" + CoreModule.m30929H().userId(), 0L);
        this.f89344v1 = new jxd0("clicked_media_intimate_quetsions", bool2);
        this.f89351w1 = new byd0("conv_counter_check_time_sync_" + CoreModule.m30929H().userId(), 0L);
        this.f89358x1 = new byd0("conv_counter_last_check_time_sync_" + CoreModule.m30929H().userId(), 0L);
        this.f89365y1 = new jxd0("profile_optimize_entry" + CoreModule.m30929H().userId(), bool2);
        this.f89119S0 = new jxd0("intl_web_pay_enable_" + CoreModule.m30929H().userId(), bool2);
        this.f89316r1 = new jxd0("card_has_show_pic_verified_anim_" + CoreModule.m30929H().userId(), bool2);
        this.f89323s1 = new jxd0("card_has_show_id_verified_anim_" + CoreModule.m30929H().userId(), bool2);
        this.f89372z1 = new wyd0("question_language_sp", "");
        this.f88992A1 = new byd0("intl_read_messages_tips_last_show_time_" + CoreModule.m30929H().userId(), 0L);
        this.f89075M1 = new vxd0("sticker_collection_position" + CoreModule.m30929H().userId(), 0);
        this.f89082N1 = new jxd0("multi_need_preload_tag_svga", bool2);
        this.f89324s2 = new jxd0("show_new_chat_warming_up_debug" + CoreModule.m30929H().userId(), bool2);
        this.f89338u2 = new jxd0("new_chat_warming_up_debug" + CoreModule.m30929H().userId(), bool2);
        this.f89331t2 = new mxd0("new_chat_warming_up_num_debug" + CoreModule.m30929H().userId(), 5.0d);
        this.f89345v2 = new jxd0("chat_upgrade_emoji_debug" + CoreModule.m30929H().userId(), bool2);
        this.f89089O1 = new jxd0("use_tantanlist", bool2);
        this.f89096P1 = new jxd0("use_tantanlist_debug", bool2);
        this.f89006C1 = new jxd0("has_share_tip_show" + CoreModule.m30929H().userId(), bool2);
        this.f89013D1 = new jxd0("has_local_share_tip_show" + CoreModule.m30929H().userId(), bool2);
        this.f89104Q1 = new byd0("fill_info_join_experience_time_" + CoreModule.m30929H().userId(), -1L);
        this.f89184a2 = new byd0("push_switch_time" + CoreModule.m30929H().userId(), 0L);
        this.f89176Z1 = new vxd0("push_switch_count" + CoreModule.m30929H().userId(), 0);
        this.f89200c2 = new jxd0("push_switch_gender" + CoreModule.m30929H().userId(), bool2);
        this.f89192b2 = new byd0("push_switch_tips_time" + CoreModule.m30929H().userId(), 0L);
        this.f89208d2 = new jxd0("push_switch_has_show" + CoreModule.m30929H().userId(), bool2);
        this.f89216e2 = new jxd0("push_switch_has_tips_show" + CoreModule.m30929H().userId(), bool2);
        this.f89160X1 = new jxd0("tag_show_click_guide_key" + CoreModule.m30929H().userId(), bool);
        this.f89224f2 = new wyd0("recent_book_movies_dramas_time" + uqb0.f180397c0.userId(), "");
        this.f89232g2 = new byd0("recent_book_movies_dramas_count" + uqb0.f180397c0.userId(), 0L);
        this.f89240h2 = new jxd0("first_exposure_book_movies" + uqb0.f180397c0.userId(), bool);
        this.f89248i2 = new wyd0("login_user_book_movies_drama_data" + CoreModule.m30929H().userId(), "");
        this.f89256j2 = new byd0("conversation_tag_guide_time" + CoreModule.m30929H().userId(), 0L);
        this.f89264k2 = new vxd0("conversation_tag_guide_mouth_count" + CoreModule.m30929H().userId(), 0);
        this.f89272l2 = new vxd0("conversation_tag_guide_day_count" + CoreModule.m30929H().userId(), 0);
        this.f89280m2 = new byd0("conversation_tag_guide_clear_date" + CoreModule.m30929H().userId(), 0L);
        this.f89288n2 = new byd0("lastShowMomentpostGuideTime_" + CoreModule.m30929H().userId(), 0L);
        this.f89296o2 = new vxd0("me_tab_show_guide_bubble_verification" + CoreModule.m30929H().userId(), 0);
        this.f89303p2 = new wyd0("me_tab_show_guide_bubble_verification_time" + CoreModule.m30929H().userId(), "");
        this.f89310q2 = new jxd0("profile_show_guide_bubble_verification_pic" + CoreModule.m30929H().userId(), bool2);
        this.f89317r2 = new jxd0("profile_show_guide_bubble_verification_pic_idcard" + CoreModule.m30929H().userId(), bool2);
        this.f89352w2 = new jxd0("refresh_chatheat_sticker_" + CoreModule.m30929H().userId(), bool2);
        this.f89359x2 = new wyd0("core_square_debug_lua_url_1", "/core/example2/v-/1.x/sources/indexMua.lua?_bid=1003408", false);
        this.f88993A2 = new vxd0("new_user_count" + CoreModule.m30929H().userId(), 0);
        this.f89000B2 = new vxd0("new_user_right_count" + CoreModule.m30929H().userId(), 0);
        this.f89007C2 = new vxd0("new_user_today_count" + CoreModule.m30929H().userId(), 0);
        this.f89014D2 = new vxd0("new_user_today_match_count" + CoreModule.m30929H().userId(), 0);
        this.f89021E2 = new jxd0("new_user_has_show" + CoreModule.m30929H().userId(), bool2);
        this.f89028F2 = new jxd0("new_user_has_gusture_show" + CoreModule.m30929H().userId(), bool2);
        this.f89055J2 = new jxd0("match_ice_break_exp_debug" + CoreModule.m30929H().userId(), bool2);
        this.f89062K2 = new jxd0("match_ice_break_toggle_gender_debug" + CoreModule.m30929H().userId(), bool2);
        this.f89069L2 = new vxd0("conv_match_ice_break_guide_count" + CoreModule.m30929H().userId(), 0);
        this.f89076M2 = new byd0("conv_match_ice_break_guide_last_time" + CoreModule.m30929H().userId(), 0L);
        this.f89366y2 = new byd0("lastShowMomentLikeGuideTime_" + CoreModule.m30929H().userId(), 0L);
        this.f89373z2 = new vxd0("countMaleMomentPostGuideMesage_" + CoreModule.m30929H().userId(), 0);
        this.f89083N2 = new jxd0("jailed_profile_debug" + CoreModule.m30929H().userId(), bool2);
        this.f89090O2 = new jxd0("jailed_swipe_debug" + CoreModule.m30929H().userId(), bool2);
        this.f89097P2 = new jxd0("tt_eco_abtest_debug" + CoreModule.m30929H().userId(), bool2);
        this.f89105Q2 = new byd0("core_last_show_feed_time" + CoreModule.m30929H().userId(), 0L);
        this.f89113R2 = new byd0("core_feed_tab_pop_show_last_time" + CoreModule.m30929H().userId(), 0L);
        this.f89121S2 = new wyd0("core_feed_tab_pop_show_times" + CoreModule.m30929H().userId(), "");
        this.f89129T2 = new byd0("core_feed_tab_pop_next_allow_show_time" + CoreModule.m30929H().userId(), 0L);
        this.f89137U2 = new byd0("core_feed_tab_pop_next_request_time" + CoreModule.m30929H().userId(), 0L);
        this.f89145V2 = new jxd0("core_feed_tab_pop_debug" + CoreModule.m30929H().userId(), bool2);
        this.f89161X2 = new jxd0("ttt_show_facebook_bind_phone_dlg" + CoreModule.m30929H().userId(), bool);
        this.f89177Z2 = new jxd0("ttt_show_google_bind_phone_dlg" + CoreModule.m30929H().userId(), bool);
        this.f89169Y2 = new jxd0("show_empty_address_book" + CoreModule.m30929H().userId(), bool2);
        this.f89153W2 = new wyd0("show_upload_real_avatar_push" + CoreModule.m30929H().userId(), "");
        this.f89241h3 = new vxd0("ice_break_dlg_no_send_action_count" + CoreModule.m30929H().userId(), 0);
        this.f89249i3 = new byd0("ice_break_dlg_freezing_time" + CoreModule.m30929H().userId(), 0L);
        this.f89035G2 = new wyd0("growth_exposure_num" + CoreModule.m30929H().userId(), "");
        this.f89042H2 = new byd0("growth_exposure_tip_time" + CoreModule.m30929H().userId(), 0L);
        this.f89048I2 = new byd0("growth_exposure_pop_time" + CoreModule.m30929H().userId(), 0L);
        this.f89185a3 = new jxd0("match_success_2_debug" + CoreModule.m30929H().userId(), bool2);
        this.f89193b3 = new jxd0("messageTabFilterDebug" + CoreModule.m30929H().userId(), bool2);
        this.f89233g3 = new wyd0("swipe_superlike_pay_will_" + CoreModule.m30929H().userId(), Constants.PRIORITY_HIGH);
        this.f89297o3 = new jxd0("recommend_voice_chat_room_debug" + CoreModule.m30929H().userId(), bool2);
        this.f89201c3 = new jxd0("isHeartSignalVipAlertDebug" + CoreModule.m30929H().userId(), bool2);
        this.f89209d3 = new wyd0("sendMessagePageFlashChatPopupDialogTime" + CoreModule.m30929H().userId(), "");
        this.f89281m3 = new jxd0("msg_game_red_" + CoreModule.m30929H().userId(), bool);
        this.f89289n3 = new jxd0("onlineSmsSwitchDebug" + CoreModule.m30929H().userId(), bool2);
        this.f89304p3 = new xyd0("growth_msg_uids" + CoreModule.m30929H().userId(), new HashSet());
        this.f89311q3 = new xyd0("has_growth_msg_click" + CoreModule.m30929H().userId(), new HashSet());
        this.f89318r3 = new vxd0("has_growth_msg_count" + CoreModule.m30929H().userId(), 0);
        this.f89325s3 = new byd0("get_new_user_lost_time" + CoreModule.m30929H().userId(), 0L);
        this.f89332t3 = new wyd0("chat_click_set" + CoreModule.m30929H().userId(), "");
        this.f89339u3 = new wyd0("chat_lost_time_set" + CoreModule.m30929H().userId(), "");
        this.f89346v3 = new jxd0("friend_online_notify_showed_" + CoreModule.m30929H().userId(), bool2);
        this.f89353w3 = new vxd0("continuous_click_conv_next_count" + CoreModule.m30929H().userId(), 0);
        this.f89360x3 = new byd0("silent_time_conv_next" + CoreModule.m30929H().userId(), 0L);
        this.f89367y3 = new byd0("latest_time_conv_next" + CoreModule.m30929H().userId(), 0L);
        this.f89374z3 = new jxd0("show_filter_veri_msg_tips" + CoreModule.m30929H().userId(), bool);
        this.f88994A3 = new jxd0("dispose_old_invalid_conv+" + CoreModule.m30929H().userId(), bool);
        this.f89001B3 = new jxd0("dispose_old_invalid_conv_del+" + CoreModule.m30929H().userId(), bool);
        this.f89049I3 = new jxd0("has_spam_dialog_show+" + CoreModule.m30929H().userId(), bool2);
        this.f89008C3 = new wyd0("positive_feedback" + CoreModule.m30929H().userId(), "");
        this.f89015D3 = new wyd0("no_remaining_times" + CoreModule.m30929H().userId(), "");
        this.f89022E3 = new wyd0("pairing_restriction+" + CoreModule.m30929H().userId(), "");
        m116500P7();
        this.f89029F3 = new vxd0("ai_picture_pop_guide_count" + CoreModule.m30929H().userId(), 0);
        this.f89036G3 = new vxd0("ai_picture_quick_access_count" + CoreModule.m30929H().userId(), 0);
        this.f89063K3 = new byd0("today_cold_start_app_time_" + CoreModule.m30929H().userId(), 0L);
        this.f89070L3 = new vxd0("today_cold_start_count_" + CoreModule.m30929H().userId(), 0);
        this.f89077M3 = new byd0("top_item_red_dot_hide_time_" + CoreModule.m30929H().userId(), 0L);
        this.f89098P3 = new vxd0("profile_ui_upgrade_introduction_count" + CoreModule.m30929H().userId(), 0);
        this.f89106Q3 = new vxd0("profile_ui_upgrade_photo_count" + CoreModule.m30929H().userId(), 0);
        this.f89114R3 = new wyd0("last_show_home_tab+" + CoreModule.m30929H().userId(), "");
        this.f89122S3 = new jxd0("message_recall_show_toast", bool2);
        this.f89130T3 = new vxd0("message_recall_show_toast_count", 0);
        this.f89138U3 = new wyd0("pic_exchange_pw_show_config" + CoreModule.m30929H().userId(), WeJson.EMPTY_MAP);
        this.f89146V3 = new byd0("conv_pic_cert_guide_silence_time" + CoreModule.m30929H().userId(), 0L);
        this.f89154W3 = new vxd0("conv_pic_cert_guide_show_count" + CoreModule.m30929H().userId(), 0);
        this.f89162X3 = new byd0("profile_pic_cert_guide_silence_time" + CoreModule.m30929H().userId(), 0L);
        this.f89178Z3 = new wyd0("user_home_mode" + CoreModule.m30929H().userId(), UserHomeMode.loveMode);
        this.f89170Y3 = new vxd0("profile_pic_cert_guide_show_count" + CoreModule.m30929H().userId(), 0);
        this.f89218e4 = new jxd0("has_show_find_user_tip+" + CoreModule.m30929H().userId(), bool2);
        this.f89186a4 = new jxd0("marry_debug_model", bool2);
        this.f89194b4 = new jxd0("marry_model_dot" + CoreModule.m30929H().userId(), bool2);
        this.f89226f4 = new jxd0("has_open_marry_audit_act_first" + CoreModule.m30929H().userId(), bool2);
        this.f89250i4 = new wyd0("marry_edit_cache_declaration" + CoreModule.m30929H().userId(), null);
        this.f89258j4 = new wyd0("marry_edit_cache_mate_description" + CoreModule.m30929H().userId(), null);
        this.f89266k4 = new wyd0("marry_edit_cache_family_background" + CoreModule.m30929H().userId(), null);
        this.f89274l4 = new wyd0("marry_edit_cache_bride_price" + CoreModule.m30929H().userId(), null);
        this.f89282m4 = new wyd0("marry_edit_cache_prologue" + CoreModule.m30929H().userId(), null);
        this.f89290n4 = new jxd0("marry_has_enter_model_" + CoreModule.m30929H().userId(), bool2);
        this.f89298o4 = new wyd0("marry_red_dot_show_key_" + CoreModule.m30929H().userId(), "");
        this.f89305p4 = new wyd0("marry_spring_festival_red_dot_show_key_" + CoreModule.m30929H().userId(), "");
        this.f89312q4 = new vxd0("marry_spring_festival_pop_up_marker_" + CoreModule.m30929H().userId(), -1);
        this.f89326s4 = new byd0("chat_partner_last_request_time" + CoreModule.m30929H().userId(), 0L);
        this.f89333t4 = new byd0("chat_partner_last_show_time" + CoreModule.m30929H().userId(), 0L);
        this.f89340u4 = new vxd0("chat_partner_message_passive_count" + CoreModule.m30929H().userId(), 0);
        this.f89347v4 = new vxd0("chat_partner_online_passive_count" + CoreModule.m30929H().userId(), 0);
        this.f89009C4 = new byd0("friend_tacit_limit_time" + CoreModule.m30929H().userId(), 0L);
        this.f89016D4 = new jxd0("friend_tacit_dialog_show" + CoreModule.m30929H().userId(), bool2);
        this.f89030F4 = new jxd0("marry_protocol_show" + CoreModule.m30929H().userId(), bool2);
        this.f89037G4 = new byd0("low_photo_last_show_time" + CoreModule.m30929H().userId(), 0L);
        this.f89044H4 = new vxd0("low_photo_show_count_today" + CoreModule.m30929H().userId(), 0);
        this.f89050I4 = new jxd0("marry_guide_dlg_showed_" + CoreModule.m30929H().userId(), bool2);
        this.f89071L4 = new jxd0("marry_label_bubble_showed_" + CoreModule.m30929H().userId(), bool2);
        this.f89057J4 = new vxd0("marry_insert_card_count_" + CoreModule.m30929H().userId(), 0);
        this.f89064K4 = new byd0("marry_insert_date_" + CoreModule.m30929H().userId(), 0L);
        this.f89078M4 = new vxd0("auto_change_marry_" + CoreModule.m30929H().userId(), 0);
        this.f89085N4 = new jxd0("new_profile_ui" + CoreModule.m30929H().userId(), bool2);
        this.f89092O4 = new byd0("marry_show_date_time_" + CoreModule.m30929H().userId(), 0L);
        this.f89099P4 = new byd0("lastet_enter_421_time_" + CoreModule.m30929H().userId(), 0L);
        this.f89123S4 = new byd0("insert_421_feedback_time_" + CoreModule.m30929H().userId(), 0L);
        this.f89107Q4 = new byd0("current_inset_421_time_" + CoreModule.m30929H().userId(), 0L);
        this.f89115R4 = new vxd0("today_insert_421_count_" + CoreModule.m30929H().userId(), 0);
        this.f89131T4 = new vxd0("continus_left_421_time_" + CoreModule.m30929H().userId(), 0);
        this.f89203c5 = new jxd0("open_one_click_pairing" + CoreModule.m30929H().userId(), bool);
        this.f89195b5 = new jxd0("game_cp_bottom_dialog_show" + CoreModule.m30929H().userId(), bool2);
        this.f89243h5 = new jxd0("HAS_SHOW_USER_STATE_TIP" + CoreModule.m30929H().userId(), bool2);
        this.f89155W4 = new byd0("bar_lover_dlg1_last_show_time" + CoreModule.m30929H().userId(), 0L);
        this.f89163X4 = new vxd0("bar_lover_dlg1_last_show_counter" + CoreModule.m30929H().userId(), 0);
        this.f89171Y4 = new jxd0("show_bar_lover_dlg2" + CoreModule.m30929H().userId(), bool2);
        this.f89179Z4 = new byd0("bar_lover_card_last_show_time" + CoreModule.m30929H().userId(), 0L);
        this.f89187a5 = new vxd0("bar_lover_card_last_show_counter" + CoreModule.m30929H().userId(), 0);
        this.f89251i5 = new vxd0("wechat_notify_banner_count" + CoreModule.m30929H().userId(), 0);
        this.f89259j5 = new byd0("wechat_notify_banner_last_show_time" + CoreModule.m30929H().userId(), 0L);
        this.f89267k5 = new vxd0("wechat_notify_banner_day_count" + CoreModule.m30929H().userId(), 0);
        this.f89275l5 = new byd0("wechat_gdlst" + CoreModule.m30929H().userId(), 0L);
        this.f89283m5 = new vxd0("wechat_gdsc" + CoreModule.m30929H().userId(), 0);
        this.f89291n5 = new byd0("wechat_cgst" + CoreModule.m30929H().userId(), 0L);
        this.f89299o5 = new vxd0("wechat_cgsc" + CoreModule.m30929H().userId(), 0);
        this.f89306p5 = new vxd0("wechat_ctsc" + CoreModule.m30929H().userId(), 0);
        this.f89313q5 = new byd0("wechat_bctm" + CoreModule.m30929H().userId(), 0L);
        this.f89320r5 = new byd0("stock_fake_dlg_last_show_time" + CoreModule.m30929H().userId(), 0L);
        this.f89327s5 = new vxd0("stock_fake_dlg_show_count" + CoreModule.m30929H().userId(), 0);
        this.f89334t5 = new jxd0("manual_set_up_distance" + CoreModule.m30929H().userId(), bool2);
        this.f89217e3 = new wyd0("new_match_success_time_sb" + CoreModule.m30929H().userId(), "");
        this.f89341u5 = new wyd0("net_pic_dlg_data" + CoreModule.m30929H().userId(), "");
        this.f89348v5 = new vxd0("net_pic_dlg_count" + CoreModule.m30929H().userId(), 0);
        this.f89355w5 = new wyd0("repeat_pic_dlg_data" + CoreModule.m30929H().userId(), "");
        this.f89362x5 = new vxd0("repeat_pic_dlg_count" + CoreModule.m30929H().userId(), 0);
        this.f89369y5 = new wyd0("ai_pic_dlg_date" + CoreModule.m30929H().userId(), "");
        this.f89376z5 = new vxd0("ai_pic_dlg_count" + CoreModule.m30929H().userId(), 0);
        this.f89003B5 = new vxd0("verification_spam_count" + CoreModule.m30929H().userId(), 0);
        this.f88996A5 = new byd0("verification_visit_time" + CoreModule.m30929H().userId(), 0L);
        this.f89010C5 = new byd0("team_group_conv_click_time" + CoreModule.m30929H().userId(), 0L);
        this.f89017D5 = new byd0("weakened_tips_last_show_time" + CoreModule.m30929H().userId(), 0L);
        this.f89024E5 = new vxd0("weakened_tips_close_count" + CoreModule.m30929H().userId(), 0);
        this.f89031F5 = new byd0("weakened_tips_force_hide_time" + CoreModule.m30929H().userId(), 0L);
        this.f89051I5 = new wyd0("cannot_reply_immediately_data" + CoreModule.m30929H().userId(), "");
        this.f89058J5 = new wyd0("cannot_reply_immediately_count" + CoreModule.m30929H().userId(), "");
        this.f89065K5 = new wyd0("del_cannot_reply_immediately_count" + CoreModule.m30929H().userId(), "");
        this.f89093O5 = new vxd0("continuous_left_sliding_bubble_count" + CoreModule.m30929H().userId(), 0);
        this.f89100P5 = new byd0("continuous_left_sliding_bubble_time" + CoreModule.m30929H().userId(), 0L);
        this.f89072L5 = new jxd0("is_high_speed_sliding_left_tips" + CoreModule.m30929H().userId(), bool2);
        this.f89079M5 = new jxd0("is_high_speed_sliding_right_tips" + CoreModule.m30929H().userId(), bool2);
        this.f89086N5 = new jxd0("is_reset_guidance" + CoreModule.m30929H().userId(), bool2);
        this.f89108Q5 = new byd0("oof_enter_update_time" + CoreModule.m30929H().userId(), 0L);
        this.f89116R5 = new byd0("show_interval_card_swipe" + CoreModule.m30929H().userId(), -1L);
        this.f89124S5 = new vxd0("fitnes_can_display_the_number_of_times" + CoreModule.m30929H().userId(), 0);
        this.f89132T5 = new vxd0("drink_can_display_the_number_of_times" + CoreModule.m30929H().userId(), 0);
        this.f89140U5 = new vxd0("smoke_can_display_the_number_of_times" + CoreModule.m30929H().userId(), 0);
        this.f89148V5 = new vxd0("game_can_display_the_number_of_times" + CoreModule.m30929H().userId(), 0);
        this.f89156W5 = new byd0("today_can_display_times" + CoreModule.m30929H().userId(), 0L);
        this.f89164X5 = new vxd0("today_can_display_count" + CoreModule.m30929H().userId(), 0);
        this.f89172Y5 = new wyd0("today_can_display_pre_user_id" + CoreModule.m30929H().userId(), "");
        this.f89212d6 = new wyd0("today_can_display_pre_user_id_fitness" + CoreModule.m30929H().userId(), "");
        this.f89220e6 = new wyd0("today_can_display_pre_user_id_drink" + CoreModule.m30929H().userId(), "");
        this.f89228f6 = new wyd0("today_can_display_pre_user_id_smoke" + CoreModule.m30929H().userId(), "");
        this.f89236g6 = new wyd0("today_can_display_pre_user_id_game" + CoreModule.m30929H().userId(), "");
        this.f89276l6 = new wyd0("intl_currency_type" + CoreModule.m30929H().userId(), "");
        this.f89328s6 = new wyd0("verifiy_swipe_privilege_show_time_" + CoreModule.m30929H().userId(), "");
        uqb0.f180369D0 = this.f89276l6.get();
        this.f89307p6 = new byd0("show_expand_search_time" + CoreModule.m30929H().userId(), 0L);
        this.f89314q6 = new byd0("show_boost_refactoring_redrot_time" + CoreModule.m30929H().userId(), 0L);
        this.f89321r6 = new jxd0("show_boost_refactoring_redrot" + CoreModule.m30929H().userId(), bool2);
        this.f89356w6 = new jxd0("see_myself_close_enable" + CoreModule.m30929H().userId(), bool2);
        this.f89363x6 = new byd0("see_myself_first_show_Time" + CoreModule.m30929H().userId(), 0L);
        this.f89370y6 = new jxd0("followTipsSavedValue" + CoreModule.m30929H().userId(), bool2);
        this.f89377z6 = new jxd0("isHavePartner" + CoreModule.m30929H().userId(), bool2);
        this.f89004B6 = new jxd0("exp_debug_new_ui", bool2);
        this.f88997A6 = new jxd0("bubble_odiamond_immediate_match_guide_" + CoreModule.m30929H().userId(), bool2);
        this.f89271l1 = new byd0("last_show_online_chat_guide_time" + CoreModule.m30929H().userId(), 0L);
        this.f89032F6 = new vxd0("staging_card_user_activity_day", 2);
        this.f89018D6 = new jxd0("has_show_edit_shimmer" + CoreModule.m30929H().userId(), bool2);
        this.f89025E6 = new wyd0("has_show_avatar_shimmer" + CoreModule.m30929H().userId(), "");
        this.f89052I6 = new byd0("intl_message_read_receipt_tip_last_show_time" + CoreModule.m30929H().userId(), 0L);
        this.f89066K6 = new jxd0("intl_buzz_has_pull" + CoreModule.m30929H().userId(), bool2);
        this.f89059J6 = new jxd0("intl_delete_prompt_message" + CoreModule.m30929H().userId(), bool2);
        this.f89073L6 = new jxd0("intl_edit_friend_purpose" + CoreModule.m30929H().userId(), bool2);
        this.f89080M6 = new jxd0("intl_tribe_guide_showed" + CoreModule.m30929H().userId(), bool2);
        this.f89087N6 = new byd0("intl_tribe_recall_guide_pop_show_time" + CoreModule.m30929H().userId(), 0L);
        this.f89180Z5 = new vxd0("intl_sl_guide_show_count_men_" + CoreModule.m30929H().userId(), 0);
        this.f89188a6 = new vxd0("intl_sl_guide_show_count_women_" + CoreModule.m30929H().userId(), 0);
        this.f89196b6 = new byd0("intl_sl_guide_last_show_date_men_" + CoreModule.m30929H().userId(), 0L);
        this.f89204c6 = new byd0("intl_sl_guide_last_show_date_women_" + CoreModule.m30929H().userId(), 0L);
        this.f89094O6 = new byd0("last_whisper_viewed_time" + CoreModule.m30929H().userId(), 0L);
    }

    /* JADX INFO: renamed from: E5 */
    public static /* synthetic */ void m116251E5(Throwable th) {
        if (th instanceof TantanException.Client.TantanForbidden) {
            TantanException.Client.TantanForbidden tantanForbidden = (TantanException.Client.TantanForbidden) th;
            if (tantanForbidden.isCannotModify()) {
                String str = tantanForbidden.message;
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                Application application = CoreModule.f18263b;
                application.startActivity(DialogAct.m80560P0(application, 1, str));
            }
        }
    }

    /* JADX INFO: renamed from: F5 */
    public static /* synthetic */ void m116255F5(String str, Picture picture) {
        String str2 = picture.url;
        int i = picture.size.width;
        sfj0.m185606m("e_hyper_profile_pic_double_check", "p_edit_profile_view", sfj0.C20032a.m185615h("pic_trace_id", str), sfj0.C20032a.m185615h("pic_trace_type", "original"), sfj0.C20032a.m185615h("pic_trace_url", picture.url), sfj0.C20032a.m185615h("pic_trace_resolution", picture.size.width + BaseSei.f14624X + picture.size.height));
    }

    /* JADX INFO: renamed from: F6 */
    public static /* synthetic */ Boolean m116256F6(List list) {
        Picture picture = (Picture) list.get(0);
        if (NullChecker.m82486a(picture)) {
            File file = new File(oki.m168038z(picture.url));
            if (file.exists()) {
                return Boolean.valueOf(file.length() < 8388608);
            }
        }
        return Boolean.FALSE;
    }

    /* JADX INFO: renamed from: H6 */
    public static /* synthetic */ GPMemo m116264H6(String str, Map map) {
        return (GPMemo) map.get(str);
    }

    /* JADX INFO: renamed from: J4 */
    public static /* synthetic */ x1d0 m116270J4(String str, boolean z, boolean z2) {
        String str2;
        x1d0.C21228a c21228aM209043q = C4879a.f20236P.auth().m209043q(C4879a.m32203G("/my-tab-task/report"));
        e7y e7yVar = Network.JSON;
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
        return c21228aM209043q.m209038l(z1d0.create(e7yVar, sb.toString())).m209028b();
    }

    /* JADX INFO: renamed from: J5 */
    public static /* synthetic */ x1d0 m116271J5(String str, String str2) {
        String string;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("userPopType", str);
            string = jSONObject.toString();
        } catch (JSONException unused) {
            string = "";
        }
        return C4879a.f20236P.auth().m209043q(C4879a.m32203G(str2)).m209038l(z1d0.create(Network.JSON, string)).m209028b();
    }

    /* JADX INFO: renamed from: L5 */
    public static /* synthetic */ x1d0 m116279L5(String str, boolean z, boolean z2, String str2) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("source", "card");
            jSONObject.put("picUniqueIdentify", str);
            jSONObject.put("isClick", z);
            jSONObject.put("clickType", z2 ? "real" : "unsure");
        } catch (JSONException unused) {
        }
        return C4879a.f20236P.auth().m209043q(C4879a.m32203G(str2)).m209038l(z1d0.create(Network.JSON, jSONObject.toString())).m209028b();
    }

    /* JADX INFO: renamed from: M5 */
    public static /* synthetic */ void m116283M5(Unit unit) {
    }

    /* JADX INFO: renamed from: O3 */
    public static /* synthetic */ void m116289O3(SettingGroups settingGroups) {
        TribeSetting tribeSetting;
        if (settingGroups == null || (tribeSetting = settingGroups.tttribe) == null || !TextUtils.isEmpty(tribeSetting.transLang)) {
            return;
        }
        CoreModule.f18264c.f20426t0.m31031r3(ak20.m98546f()).subscribe(psd0.m173597H(new y20() { // from class: l.ffb
            @Override // p153l.y20
            public final void call(Object obj) {
                dkb.m116283M5((Unit) obj);
            }
        }, new y20() { // from class: l.gfb
            @Override // p153l.y20
            public final void call(Object obj) {
                dkb.m116430x5((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: O5 */
    public static /* synthetic */ CoreData m116291O5(Envelope envelope) {
        return (CoreData) envelope.getModuleData(CoreData.class);
    }

    /* JADX INFO: renamed from: P3 */
    public static /* synthetic */ AppealPostData m116293P3(AppealPostData appealPostData, List list) {
        AppealPostData appealPostDataMo225055clone = appealPostData.mo225055clone();
        appealPostDataMo225055clone.material.pictures = jyb.m147486Q(list, new qcj() { // from class: l.hgb
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((Media) obj).url;
            }
        });
        return appealPostDataMo225055clone;
    }

    /* JADX INFO: renamed from: P6 */
    public static /* synthetic */ x1d0 m116296P6(String str) {
        String str2;
        if (TextUtils.equals(str, "card") || TextUtils.equals(str, "chat")) {
            str2 = "/iceBreakQuestions?search=all&limit=3&source=" + str;
        } else if (TextUtils.equals(str, "match")) {
            str2 = "/iceBreakQuestions?search=all&limit=1&source=" + str;
        } else {
            str2 = "/iceBreakQuestions?search=all";
        }
        return C4879a.f20236P.auth().m209043q(C4879a.m32216J0(str2)).m209032f().m209028b();
    }

    /* JADX INFO: renamed from: S9 */
    public static C22421c<Envelope> m116308S9(final String str, final boolean z, final boolean z2) {
        return new ti20(new pcj() { // from class: l.qib
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return dkb.m116334a3(z, str, z2);
            }
        });
    }

    /* JADX INFO: renamed from: T9 */
    public static C22421c<Envelope> m116312T9(final String str) {
        return new ti20(new pcj() { // from class: l.eeb
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4879a.f20236P.auth().m209043q(C4879a.m32198E2(str)).m209032f().m209028b();
            }
        });
    }

    /* JADX INFO: renamed from: U9 */
    public static C22421c<Envelope> m116316U9(final String str) {
        return new ti20(new pcj() { // from class: l.peb
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4879a.f20236P.auth().m209043q(C4879a.m32206G2(str)).m209032f().m209028b();
            }
        });
    }

    /* JADX INFO: renamed from: V7 */
    public static boolean m116320V7() {
        VerificationCenter verificationCenterM32615k4 = CoreModule.f18264c.f20294B0.m32615k4();
        return (NullChecker.m82486a(verificationCenterM32615k4) && NullChecker.m82486a(verificationCenterM32615k4.picVerificationInfo) && TEnum.equals(verificationCenterM32615k4.picVerificationInfo.status, "verified")) ? false : true;
    }

    /* JADX INFO: renamed from: a3 */
    public static /* synthetic */ x1d0 m116334a3(boolean z, String str, boolean z2) {
        String strM32202F2 = z ? C4879a.m32202F2(str) : C4879a.m32365v2(str);
        if (z2) {
            strM32202F2 = strM32202F2 + "&source=viewer";
        }
        return C4879a.f20236P.auth().m209043q(strM32202F2).m209032f().m209028b();
    }

    /* JADX INFO: renamed from: a5 */
    public static /* synthetic */ void m116336a5(Throwable th) {
    }

    /* JADX INFO: renamed from: d6 */
    public static /* synthetic */ x1d0 m116349d6(List list) {
        JSONArray jSONArray = new JSONArray((Collection) list);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("addQuestions", jSONArray);
        } catch (JSONException unused) {
        }
        return C4879a.f20236P.auth().m209043q(C4879a.m32216J0("/iceBreakQuestions")).m209039m(z1d0.create(Network.JSON, jSONObject.toString())).m209028b();
    }

    /* JADX INFO: renamed from: d7 */
    public static C22421c<Envelope> m116350d7(final String str) {
        return new ti20(new pcj() { // from class: l.keb
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4879a.f20236P.auth().m209043q(C4879a.m32206G2(str)).m209032f().m209028b();
            }
        });
    }

    /* JADX INFO: renamed from: e6 */
    public static /* synthetic */ void m116354e6(String str, long j) {
        User userQuery = uqb0.f180405k0.f184355d.query(str);
        if (userQuery == null) {
            return;
        }
        userQuery.localLatestReceivedMessageTime = j;
        uqb0.f180405k0.f184355d.upsert(userQuery);
    }

    /* JADX INFO: renamed from: e7 */
    public static C22421c<Envelope> m116355e7(final String str) {
        return new ti20(new pcj() { // from class: l.ojb
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4879a.f20236P.auth().m209043q(C4879a.m32190C2(str)).m209032f().m209028b();
            }
        });
    }

    /* JADX INFO: renamed from: g6 */
    public static /* synthetic */ C22421c m116363g6() {
        final JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("complete", "unknown");
        } catch (JSONException unused) {
        }
        return qi20.m176654a(new pcj() { // from class: l.xeb
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4879a.f20236P.auth().m209043q(C4879a.m32216J0("/marriage-info ")).m209039m(z1d0.create(Network.JSON, jSONObject.toString())).m209028b();
            }
        }).map(new qcj() { // from class: l.ifb
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return uxj0.f181467a;
            }
        });
    }

    /* JADX INFO: renamed from: i3 */
    public static /* synthetic */ void m116368i3(Throwable th) {
    }

    /* JADX INFO: renamed from: l4 */
    public static /* synthetic */ C22421c m116381l4(String str, String str2) {
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
        return qi20.m176658e(new pcj() { // from class: l.leb
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4879a.f20236P.auth().m209043q(C4879a.m32216J0(string)).m209032f().m209028b();
            }
        }).compose(psd0.m173592C());
    }

    /* JADX INFO: renamed from: q3 */
    public static /* synthetic */ AppealPostData m116400q3(List list, AppealPostData appealPostData) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Media media = (Media) it.next();
            if (TEnum.equals(media.status, "raw") && (media instanceof Picture)) {
                Picture picture = (Picture) media;
                if (picture.size == null || picture.mediaType == null) {
                    sim simVar = new sim(oki.m168038z(picture.url));
                    picture.size = new Dimension(simVar.f168843d);
                    picture.mediaType = simVar.f168842c;
                }
            }
        }
        return appealPostData;
    }

    /* JADX INFO: renamed from: q4 */
    public static /* synthetic */ int m116401q4(List list, String str, String str2) {
        return !list.contains(str) ? -1 : 0;
    }

    /* JADX INFO: renamed from: r5 */
    public static /* synthetic */ C22421c m116406r5(qcj qcjVar, List list, AppealPostData appealPostData) {
        return (C22421c) qcjVar.call(list);
    }

    /* JADX INFO: renamed from: r6 */
    public static /* synthetic */ C22421c m116407r6(String str, final String str2) {
        final String str3 = "/icebreakings/" + str;
        return qi20.m176658e(new pcj() { // from class: l.jfb
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4879a.f20236P.auth().m209043q(C4879a.m32216J0(str3)).m209038l(z1d0.create(Network.JSON, "{\"tipId\":\"" + str2 + "\"}")).m209028b();
            }
        }).compose(psd0.m173592C());
    }

    /* JADX INFO: renamed from: u6 */
    public static /* synthetic */ GPMemo m116419u6(String str, GPMemo gPMemo) {
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
    public static /* synthetic */ void m116423v6(Throwable th) {
        boolean z = th instanceof TantanException.Client.TantanForbidden;
        if (z) {
            TantanException.Client.TantanForbidden tantanForbidden = (TantanException.Client.TantanForbidden) th;
            if (tantanForbidden.isCannotModify()) {
                String str = tantanForbidden.message;
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                Application application = CoreModule.f18263b;
                application.startActivity(DialogAct.m80560P0(application, 1, str));
                return;
            }
        }
        if (z) {
            TantanException.Client.TantanForbidden tantanForbidden2 = (TantanException.Client.TantanForbidden) th;
            if (tantanForbidden2.isCannotModifyExceedLimt()) {
                tantanForbidden2.hasHandle = true;
                r1j0.m179420g(CoreModule.f18263b.getString(R$string.f56610N));
                return;
            }
        }
        if (z) {
            TantanException.Client.TantanForbidden tantanForbidden3 = (TantanException.Client.TantanForbidden) th;
            if (tantanForbidden3.code == 40399) {
                r1j0.m179420g(tantanForbidden3.message);
            }
        }
    }

    /* JADX INFO: renamed from: x5 */
    public static /* synthetic */ void m116430x5(Throwable th) {
    }

    /* JADX INFO: renamed from: y5 */
    public static /* synthetic */ List m116434y5(Envelope envelope) {
        List<UrlTag> list = ((CoreData) envelope.getModuleData(CoreData.class)).urlTags;
        if (!jyb.m147479J(list)) {
            gta.m132210e().m132214d().mo34669Cf(list);
        }
        return list;
    }

    /* JADX INFO: renamed from: z6 */
    public static /* synthetic */ void m116439z6(String str, User user) {
        if (user == null) {
            CoreModule.f18264c.f20390h0.m107383l3(str);
        }
    }

    /* JADX INFO: renamed from: A7 */
    public C22421c<uxj0> m116440A7() {
        return this.f89102Q.scheduled("getMyTabTasks", 0, new pcj() { // from class: l.ohb
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f147353a.m116619u8();
            }
        });
    }

    /* JADX INFO: renamed from: A8 */
    public final /* synthetic */ SettingGroups m116441A8(Envelope envelope) {
        m116527W9(uqb0.f180396b0.f170324a.userId());
        if (jyb.m147479J(((CoreData) envelope.getModuleData(CoreData.class)).settingGroups)) {
            return m116600p9().settings.getSettingGroup();
        }
        this.f89110R.put(((CoreData) envelope.getModuleData(CoreData.class)).settingGroups.get(0));
        return ((CoreData) envelope.getModuleData(CoreData.class)).settingGroups.get(0);
    }

    /* JADX INFO: renamed from: A9 */
    public C22421c<SettingGroups> m116442A9(UserPushSettings userPushSettings) {
        SettingGroups settingGroups = new SettingGroups();
        settingGroups.push = userPushSettings;
        final UserSettingPatch userSettingPatch = new UserSettingPatch();
        userSettingPatch.settingGroups = settingGroups;
        userSettingPatch.type = "default";
        return m116504Q7(new pcj() { // from class: l.kdb
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4879a.f20236P.auth().m209043q(C4879a.m32340p1()).m209038l(z1d0.create(Network.JSON, userSettingPatch.toJson())).m209028b();
            }
        }, -1, "patch_notification_settings");
    }

    /* JADX INFO: renamed from: Aa */
    public boolean m116443Aa(@Nullable User user) {
        Relationship relationship = user.localRelationship;
        return relationship == null || TEnum.equals(relationship.conversationStatus, "dismissed") || TEnum.equals(user.localRelationship.conversationStatus, "blocked") || TEnum.equals(user.localRelationship.conversationStatus, ConversationStatus.peeking_blocked);
    }

    /* JADX INFO: renamed from: B7 */
    public C22421c<uxj0> m116444B7() {
        return this.f89102Q.scheduled("getMyTabTasksSceneAvatar", 0, new pcj() { // from class: l.ghb
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f104089a.m116627w8();
            }
        });
    }

    /* JADX INFO: renamed from: B8 */
    public final /* synthetic */ SettingGroups m116445B8(Envelope envelope) {
        m116527W9(uqb0.f180396b0.f170324a.userId());
        if (jyb.m147479J(((CoreData) envelope.getModuleData(CoreData.class)).settingGroups)) {
            return m116600p9().settings.getSettingGroup();
        }
        this.f89110R.put(((CoreData) envelope.getModuleData(CoreData.class)).settingGroups.get(0));
        return ((CoreData) envelope.getModuleData(CoreData.class)).settingGroups.get(0);
    }

    /* JADX INFO: renamed from: B9 */
    public C22421c<uxj0> m116446B9(boolean z) {
        SettingGroups settingGroups = new SettingGroups();
        UserPrivacySettings userPrivacySettings = new UserPrivacySettings();
        settingGroups.privacy = userPrivacySettings;
        userPrivacySettings.verifiedUserMsg = Boolean.valueOf(z);
        Settings settings = CoreModule.m30930K().me_().settings;
        if (settings == null) {
            return C22421c.just(uxj0.f181467a);
        }
        return CoreModule.m30930K().patchSettings(settingGroups.subtract(settings.getSettingGroup()));
    }

    /* JADX INFO: renamed from: Ba */
    public void m116447Ba(final String str) {
        l51.m152919y(new Runnable() { // from class: l.jhb
            @Override // java.lang.Runnable
            public final void run() {
                this.f120831a.m116553d9(str);
            }
        });
    }

    /* JADX INFO: renamed from: C7 */
    public C22421c<uxj0> m116448C7() {
        return this.f89102Q.scheduled("getMyTabTasksSceneEditInformation", 0, new pcj() { // from class: l.rhb
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f163091a.m116635y8();
            }
        });
    }

    /* JADX INFO: renamed from: C8 */
    public final /* synthetic */ C22421c m116449C8(pcj pcjVar) {
        return new ti20((pcj<x1d0>) pcjVar, true).compose(psd0.m173592C()).map(new qcj() { // from class: l.jib
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f121058a.m116445B8((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: C9 */
    public C22421c<SettingGroups> m116450C9(UserSubscriptionSettings userSubscriptionSettings) {
        SettingGroups settingGroups = new SettingGroups();
        settingGroups.subscription = userSubscriptionSettings;
        final UserSettingPatch userSettingPatch = new UserSettingPatch();
        userSettingPatch.settingGroups = settingGroups;
        userSettingPatch.type = "default";
        return m116504Q7(new pcj() { // from class: l.fhb
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4879a.f20236P.auth().m209043q(C4879a.m32340p1()).m209038l(z1d0.create(Network.JSON, userSettingPatch.toJson())).m209028b();
            }
        }, -1, "patch_other_settings");
    }

    /* JADX INFO: renamed from: Ca */
    public void m116451Ca(String str, List<User> list) {
        if (NullChecker.m82486a(this.f89279m1)) {
            List<GPTopicCard> listM222761e = this.f89279m1.m222761e();
            if (jyb.m147479J(listM222761e)) {
                m116590n7();
                return;
            }
            for (GPTopicCard gPTopicCard : listM222761e) {
                if (TextUtils.equals(gPTopicCard.name, str)) {
                    ArrayList arrayList = new ArrayList();
                    if (!jyb.m147479J(list)) {
                        for (User user : jyb.m147517k0(list, 2)) {
                            if (!jyb.m147479J(user.pictures)) {
                                arrayList.add(user.picture(0));
                            }
                        }
                    }
                    gPTopicCard.pictures = arrayList;
                    break;
                }
            }
            this.f89279m1.m137019l(listM222761e);
        }
    }

    /* JADX INFO: renamed from: D7 */
    public C22421c<List<UrlTag>> m116452D7(List<String> list) {
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
        return this.f89102Q.scheduled("get_pic_tags", -1, new pcj() { // from class: l.tdb
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return qi20.m176654a(new pcj() { // from class: l.ofb
                    @Override // p153l.pcj, java.util.concurrent.Callable
                    public final Object call() {
                        return C4879a.f20236P.auth().m209043q(C4879a.m32203G("/dating/users/ideal-picture-tag")).m209038l(z1d0.create(Network.JSON, jSONObject.toString())).m209028b();
                    }
                });
            }
        }).map(new qcj() { // from class: l.udb
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return dkb.m116434y5((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: D8 */
    public final /* synthetic */ uxj0 m116453D8(String str, Envelope envelope) {
        User userM116506Q9 = m116506Q9(str);
        userM116506Q9.profile.api_only_mutualContacts = new PartialIdList();
        userM116506Q9.profile.api_only_mutualContacts.ids = jyb.m147486Q(((CoreData) envelope.getModuleData(CoreData.class)).contacts, new qcj() { // from class: l.hfb
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((Contact) obj).f56859id;
            }
        });
        userM116506Q9.profile.api_only_mutualContacts.links = envelope.pagination.links;
        ((CommonData) envelope.getModuleData(CommonData.class)).users = new ArrayList();
        ((CommonData) envelope.getModuleData(CommonData.class)).users.add(userM116506Q9);
        this.f89102Q.m32495w3(envelope, null);
        return uxj0.f181467a;
    }

    /* JADX INFO: renamed from: D9 */
    public C22421c<uxj0> m116454D9(SettingGroups settingGroups) {
        final UserSettingPatch userSettingPatch = new UserSettingPatch();
        userSettingPatch.type = "default";
        userSettingPatch.settingGroups = settingGroups;
        return this.f89102Q.scheduled("patch_settings", -1, new pcj() { // from class: l.iib
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f115069a.m116481K8(userSettingPatch);
            }
        });
    }

    /* JADX INFO: renamed from: Da */
    public C22421c<Boolean> m116455Da(List<IdealTag> list) {
        if (jyb.m147479J(list)) {
            return C22421c.just(Boolean.FALSE);
        }
        User userM116600p9 = CoreModule.f18264c.f20381e0.m116600p9();
        final boolean zHasIdealInfo = userM116600p9.hasIdealInfo();
        User userMo225055clone = userM116600p9.mo225055clone();
        Profile profile = userMo225055clone.profile;
        if (profile.extensions == null) {
            profile.extensions = new Extensions();
        }
        Extensions extensions = userMo225055clone.profile.extensions;
        if (extensions.basic == null) {
            extensions.basic = new ProfileExtensionBasic();
        }
        ArrayList arrayList = new ArrayList();
        Iterator<IdealTag> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().f39608id);
        }
        List arrayList2 = userMo225055clone.profile.extensions.basic.idealType;
        if (arrayList2 == null) {
            arrayList2 = new ArrayList();
        }
        List<String> listM147511h0 = jyb.m147511h0(arrayList, arrayList2);
        if (jyb.m147479J(listM147511h0)) {
            return C22421c.just(Boolean.FALSE);
        }
        if (arrayList2.size() > 0) {
            listM147511h0.addAll(arrayList2);
        }
        userMo225055clone.profile.extensions.basic.idealType = listM147511h0;
        User userSubtract = userMo225055clone.subtract(userM116600p9);
        return userSubtract == null ? C22421c.just(Boolean.FALSE) : m116620u9(userSubtract).map(new qcj() { // from class: l.bkb
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(!zHasIdealInfo);
            }
        }).doOnNext(new y20() { // from class: l.kcb
            @Override // p153l.y20
            public final void call(Object obj) {
                CoreModule.f18264c.f20381e0.m116527W9(CoreModule.m30929H().userId());
            }
        });
    }

    /* JADX INFO: renamed from: E7 */
    public C22421c<RealFeelInfo> m116456E7(String str) {
        final String str2 = "/business/real/feel/" + str;
        return this.f89102Q.scheduled("getRealFeelInfo" + str, 0, new pcj() { // from class: l.lcb
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return qi20.m176658e(new pcj() { // from class: l.ieb
                    @Override // p153l.pcj, java.util.concurrent.Callable
                    public final Object call() {
                        return C4879a.f20236P.auth().m209043q(C4879a.m32203G(str)).m209032f().m209028b();
                    }
                }).map(new qcj() { // from class: l.jeb
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return ((CoreData) ((Envelope) obj).getModuleData(CoreData.class)).realFeelInfo;
                    }
                });
            }
        }).compose(psd0.m173592C());
    }

    /* JADX INFO: renamed from: E8 */
    public final /* synthetic */ C22421c m116457E8(final String str, final String str2) {
        return new ti20(new pcj() { // from class: l.ceb
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4879a.f20236P.auth().m209043q(C4879a.m32249S0(str, str2)).m209032f().m209028b();
            }
        }).map(new qcj() { // from class: l.deb
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f87995a.m116453D8(str, (Envelope) obj);
            }
        }).compose(C4879a.m32255T2());
    }

    /* JADX INFO: renamed from: E9 */
    public C22421c<uxj0> m116458E9(User user) {
        return m116624v9(user, gta.m132210e().m132214d().mo34721Ln() ? "updateInterval" : null);
    }

    /* JADX INFO: renamed from: Ea */
    public void m116459Ea(final String str, final long j) {
        l51.m152919y(new Runnable() { // from class: l.vjb
            @Override // java.lang.Runnable
            public final void run() {
                this.f184368a.m116556e9(str, j);
            }
        });
    }

    /* JADX INFO: renamed from: F7 */
    public C22421c<uxj0> m116460F7() {
        return this.f89102Q.scheduled("getRealPictureAward", -1, new pcj() { // from class: l.ggb
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return qi20.m176654a(new pcj() { // from class: l.ngb
                    @Override // p153l.pcj, java.util.concurrent.Callable
                    public final Object call() {
                        return C4879a.f20236P.auth().m209043q(C4879a.m32203G("/real_pictures/privilege")).m209038l(z1d0.create(Network.JSON, "")).m209028b();
                    }
                }).map(new qcj() { // from class: l.ogb
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return uxj0.f181467a;
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: F8 */
    public final /* synthetic */ uxj0 m116461F8(Envelope envelope) {
        this.f89102Q.m32497y3(envelope, null, false, false, true);
        return uxj0.f181467a;
    }

    /* JADX INFO: renamed from: F9 */
    public C22421c<SettingGroups> m116462F9(double d, double d2) {
        final JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("latitude", d);
            jSONObject2.put("longitude", d2);
            jSONObject.put("momentRoamingLocation", jSONObject2);
        } catch (JSONException e) {
            CrashHelper.m82479c(e);
        }
        return m116504Q7(new pcj() { // from class: l.lib
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4879a.f20236P.auth().m209043q(C4879a.m32344q1()).m209038l(z1d0.create(Network.JSON, jSONObject.toString())).m209028b();
            }
        }, -1, "patch_vip_search_settings");
    }

    /* JADX INFO: renamed from: Fa */
    public void m116463Fa(String str, String str2) {
        Map<String, GPMemo> mapM116496O7 = m116496O7();
        if (mapM116496O7 == null) {
            mapM116496O7 = new HashMap<>();
        }
        GPMemo gPMemo = mapM116496O7.get(str);
        if (gPMemo == null) {
            GPMemo gPMemoNew_ = GPMemo.new_();
            gPMemoNew_.userId = str;
            gPMemoNew_.otherUserId = str;
            gPMemoNew_.memo = str2;
            mapM116496O7.put(str, gPMemoNew_);
        } else {
            gPMemo.memo = str2;
        }
        this.f89237g7.m159273A(mapM116496O7);
    }

    /* JADX INFO: renamed from: G7 */
    public C22421c<RealPicturesInfo> m116464G7() {
        return this.f89102Q.scheduled("getRealPictureTaskInfo", 0, new pcj() { // from class: l.cjb
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return qi20.m176654a(new pcj() { // from class: l.zcb
                    @Override // p153l.pcj, java.util.concurrent.Callable
                    public final Object call() {
                        return C4879a.f20236P.auth().m209043q(C4879a.m32203G("/real_pictures/info")).m209032f().m209028b();
                    }
                }).map(new qcj() { // from class: l.adb
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return ((CoreData) ((Envelope) obj).getModuleData(CoreData.class)).realPicturesInfo;
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: G8 */
    public final /* synthetic */ C22421c m116465G8(String str) {
        return m116316U9(str).map(new qcj() { // from class: l.njb
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f142284a.m116461F8((Envelope) obj);
            }
        }).compose(C4879a.m32255T2());
    }

    /* JADX INFO: renamed from: G9 */
    public C22421c<Envelope> m116466G9(@NonNull String str, final int i, String str2) {
        String string;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("url", str);
            jSONObject.put("scene", str2);
            string = jSONObject.toString();
        } catch (JSONException unused) {
            string = "";
        }
        final z1d0 z1d0VarCreate = z1d0.create(Network.JSON, string);
        return this.f89102Q.scheduled("photoModelChecking" + pzi0.m174454o(), -1, new pcj() { // from class: l.bfb
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return qi20.m176658e(new pcj() { // from class: l.vfb
                    @Override // p153l.pcj, java.util.concurrent.Callable
                    public final Object call() {
                        return C4879a.f20236P.auth().m209043q(C4879a.m32203G("/user/picture/" + i + "/sift")).m209038l(z1d0Var).m209028b();
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: Ga */
    public C22421c<uxj0> m116467Ga(final String str, final String str2) {
        String string;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("memo", str2);
            string = jSONObject.toString();
        } catch (JSONException e) {
            CrashHelper.m82479c(e);
            string = "";
        }
        final z1d0 z1d0VarCreate = z1d0.create(Network.JSON, string);
        return now("updateMemos_patch/" + str, qi20.m176654a(new pcj() { // from class: l.ijb
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4879a.f20236P.auth().m209043q(C4879a.m32194D2(CoreModule.m30929H().userId() + "/memos/" + str)).m209039m(z1d0VarCreate).m209028b();
            }
        }).map(new qcj() { // from class: l.jjb
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return uxj0.f181467a;
            }
        }).doOnNext(new y20() { // from class: l.kjb
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f127085a.m116560f9(str, str2, (uxj0) obj);
            }
        }), true);
    }

    /* JADX INFO: renamed from: H7 */
    public void m116468H7() {
        if (gta.m132210e().m132214d().mo34941vi()) {
            this.f89102Q.scheduled("/users/me/profile/avatar", 0, new pcj() { // from class: l.pjb
                @Override // p153l.pcj, java.util.concurrent.Callable
                public final Object call() {
                    return qi20.m176658e(new pcj() { // from class: l.vdb
                        @Override // p153l.pcj, java.util.concurrent.Callable
                        public final Object call() {
                            return C4879a.f20236P.auth().m209043q(C4879a.m32216J0("/profile/avatar")).m209032f().m209028b();
                        }
                    });
                }
            }).subscribe(new y20() { // from class: l.qjb
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f157949a.m116639z8((Envelope) obj);
                }
            }, new y20() { // from class: l.sjb
                @Override // p153l.y20
                public final void call(Object obj) {
                    dkb.m116368i3((Throwable) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: H8 */
    public final /* synthetic */ uxj0 m116469H8(Envelope envelope) {
        this.f89102Q.m32497y3(envelope, null, false, false, true);
        x95.INSTANCE.m209792k(null);
        return uxj0.f181467a;
    }

    /* JADX INFO: renamed from: H9 */
    public C22421c<uxj0> m116470H9() {
        return this.f89102Q.now(new ti20(new pcj() { // from class: l.qdb
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4879a.f20236P.auth().m209043q(C4879a.m32377y2(CoreModule.m30929H().userId())).m209032f().m209028b();
            }
        }).map(new qcj() { // from class: l.beb
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f76356a.m116485L8((Envelope) obj);
            }
        }).compose(C4879a.m32255T2()));
    }

    /* JADX INFO: renamed from: Ha */
    public C22421c<uxj0> m116471Ha(boolean z) {
        UserLiveSettings userLiveSettingsNew_ = UserLiveSettings.new_();
        userLiveSettingsNew_.hideDiamondTag = Boolean.valueOf(z);
        SettingGroups settingGroupsNew_ = SettingGroups.new_();
        settingGroupsNew_.live = userLiveSettingsNew_;
        final UserSettingPatch userSettingPatchNew_ = UserSettingPatch.new_();
        userSettingPatchNew_.settingGroups = settingGroupsNew_;
        userSettingPatchNew_.type = "default";
        return this.f89102Q.now(new ti20(new pcj() { // from class: l.dfb
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4879a.f20236P.auth().m209043q(C4879a.m32289c2()).m209037k(z1d0.create(Network.JSON, userSettingPatchNew_.toJson())).m209028b();
            }
        }).map(new qcj() { // from class: l.efb
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return uxj0.f181467a;
            }
        }).compose(C4879a.m32255T2()));
    }

    /* JADX INFO: renamed from: I7 */
    public Integer m116472I7() {
        return this.f89126T.get();
    }

    /* JADX INFO: renamed from: I8 */
    public final /* synthetic */ C22421c m116473I8(String str, String str2) {
        return m116523V9(str, str2).map(new qcj() { // from class: l.cib
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f81920a.m116469H8((Envelope) obj);
            }
        }).compose(C4879a.m32255T2());
    }

    /* JADX INFO: renamed from: I9 */
    public C22421c<Envelope> m116474I9(final String str, final String str2) {
        return this.f89102Q.scheduled("icebreakings/userId" + str + "/tipId" + str2, 0, new pcj() { // from class: l.feb
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return dkb.m116407r6(str, str2);
            }
        });
    }

    /* JADX INFO: renamed from: Ia */
    public C22421c<uxj0> m116475Ia() {
        return this.f89102Q.scheduled("uploadMarryEditProfileUnSave", -1, new pcj() { // from class: l.jcb
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return dkb.m116363g6();
            }
        });
    }

    /* JADX INFO: renamed from: J7 */
    public C22421c<SettingGroups> m116476J7() {
        return m116504Q7(new pcj() { // from class: l.ucb
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4879a.f20236P.auth().m209043q(C4879a.m32289c2() + "?type=default").m209032f().m209028b();
            }
        }, 0, "get_other_settings");
    }

    /* JADX INFO: renamed from: J8 */
    public final /* synthetic */ uxj0 m116477J8(Envelope envelope) {
        m116527W9(uqb0.f180396b0.f170324a.userId());
        if (!jyb.m147479J(((CoreData) envelope.getModuleData(CoreData.class)).settingGroups)) {
            this.f89110R.put(((CoreData) envelope.getModuleData(CoreData.class)).settingGroups.get(0));
        }
        return uxj0.f181467a;
    }

    /* JADX INFO: renamed from: J9 */
    public void m116478J9() {
        this.f89205c7.m137019l(uxj0.f181467a);
    }

    /* JADX INFO: renamed from: Ja */
    public void m116479Ja(final String str, final Picture picture) {
        new i1y(jyb.m147507f0(picture), 10000, 0, Bitmap.CompressFormat.JPEG, true).filter(new qcj() { // from class: l.shb
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return dkb.m116256F6((List) obj);
            }
        }).flatMap(new qcj() { // from class: l.thb
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return uqb0.f180397c0.mo105298Y1(picture);
            }
        }).compose(psd0.m173592C()).subscribe(psd0.m173597H(new y20() { // from class: l.uhb
            @Override // p153l.y20
            public final void call(Object obj) {
                dkb.m116255F5(str, (Picture) obj);
            }
        }, new y20() { // from class: l.vhb
            @Override // p153l.y20
            public final void call(Object obj) {
                dkb.m116336a5((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: K7 */
    public C22421c<SettingGroups> m116480K7() {
        return now("get_other_settings", new ti20((pcj<x1d0>) new pcj() { // from class: l.wcb
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4879a.f20236P.auth().m209043q(C4879a.m32289c2() + "?type=default").m209032f().m209028b();
            }
        }, true).compose(psd0.m173592C()).map(new qcj() { // from class: l.xcb
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f193286a.m116441A8((Envelope) obj);
            }
        }).doOnNext(new y20() { // from class: l.ycb
            @Override // p153l.y20
            public final void call(Object obj) {
                dkb.m116289O3((SettingGroups) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: K8 */
    public final /* synthetic */ C22421c m116481K8(UserSettingPatch userSettingPatch) {
        return m116510R9(userSettingPatch.toJson()).map(new qcj() { // from class: l.tjb
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f174568a.m116477J8((Envelope) obj);
            }
        }).compose(C4879a.m32255T2());
    }

    /* JADX INFO: renamed from: K9 */
    public C22421c<SettingGroups> m116482K9(String str, boolean z, int i, int i2) {
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
        return m116504Q7(new pcj() { // from class: l.djb
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4879a.f20236P.auth().m209043q(C4879a.m32340p1()).m209038l(z1d0.create(Network.JSON, userSettingPatch.toJson())).m209028b();
            }
        }, -1, "user_push_settings");
    }

    /* JADX INFO: renamed from: Ka */
    public C22421c<User> m116483Ka(final String str) {
        return uqb0.f180405k0.f184355d.uiGet(str).doOnNext(new y20() { // from class: l.qgb
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f157398a.m116564g9(str, (User) obj);
            }
        }).filter(new qcj() { // from class: l.dhb
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((User) obj) != null);
            }
        });
    }

    /* JADX INFO: renamed from: L7 */
    public C22421c<List<Relationship>> m116484L7(final String str) {
        return this.f89102Q.scheduled("onlineMatchGetUserById/" + str, 0, new pcj() { // from class: l.hhb
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return dkb.m116316U9(str).map(new qcj() { // from class: l.mcb
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return ((CoreData) ((Envelope) obj).getModuleData(CoreData.class)).relationships;
                    }
                }).compose(C4879a.m32255T2());
            }
        });
    }

    /* JADX INFO: renamed from: L8 */
    public final /* synthetic */ uxj0 m116485L8(Envelope envelope) {
        gta.m132210e().m132214d().mo34790Y7(envelope, Counter.TYPE);
        this.f89102Q.m32495w3(envelope, null);
        return uxj0.f181467a;
    }

    /* JADX INFO: renamed from: L9 */
    public void m116486L9(String str, List<LiteraturesComments> list) {
        if (jyb.m147479J(list)) {
            this.f89109Q6.put(str, new ArrayList());
            if (TextUtils.equals(str, CoreModule.m30929H().userId())) {
                m116521V6();
                return;
            }
            return;
        }
        List<LiteraturesComments> arrayList = new ArrayList<>();
        for (LiteraturesComments literaturesComments : list) {
            if (!NullChecker.m82486a(literaturesComments) || !NullChecker.m82486a(literaturesComments.localLiteratures) || TextUtils.isEmpty(literaturesComments.localLiteratures.f21175id) || arrayList.contains(literaturesComments)) {
                o1j0.m165639m("localLiteratures 数据异常 请联系开发");
            } else {
                arrayList.add(literaturesComments);
            }
        }
        this.f89109Q6.put(str, arrayList);
        if (TextUtils.equals(str, CoreModule.m30929H().userId())) {
            m116605qa();
        }
    }

    /* JADX INFO: renamed from: La */
    public C22421c<GPMemo> m116487La(final String str) {
        return this.f89237g7.m159274k().filter(new qcj() { // from class: l.ahb
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m82486a((Map) obj));
            }
        }).map(new qcj() { // from class: l.bhb
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return dkb.m116264H6(str, (Map) obj);
            }
        }).map(new qcj() { // from class: l.chb
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return dkb.m116419u6(str, (GPMemo) obj);
            }
        }).distinctUntilChanged(new qcj() { // from class: l.ehb
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((GPMemo) obj).memo;
            }
        }).observeOn(fo0.m126432a());
    }

    /* JADX INFO: renamed from: M7 */
    public User m116488M7(String str) {
        return l51.m152884D() ? m116503Pa(str) : m116506Q9(str);
    }

    /* JADX INFO: renamed from: M8 */
    public final /* synthetic */ uxj0 m116489M8(String str, Envelope envelope) {
        if (gta.m132210e().m132214d().mo34805b()) {
            CoreModule.m30934Q().putLiveState(((CommonData) envelope.getModuleData(CommonData.class)).users);
        }
        m116604q9(str, envelope);
        this.f89102Q.m32497y3(envelope, null, false, false, true);
        return uxj0.f181467a;
    }

    /* JADX INFO: renamed from: M9 */
    public void m116490M9(String str, Literatures literatures) {
        this.f89117R6.put(str, literatures);
    }

    /* JADX INFO: renamed from: Ma */
    public C22421c<User> m116491Ma(final String str) {
        return uqb0.f180405k0.f184355d.uiGet(str).doOnNext(new y20() { // from class: l.nhb
            @Override // p153l.y20
            public final void call(Object obj) {
                dkb.m116439z6(str, (User) obj);
            }
        });
    }

    /* JADX INFO: renamed from: N7 */
    public C22421c<Map<String, GPMemo>> m116492N7() {
        return this.f89237g7.m159274k();
    }

    /* JADX INFO: renamed from: N8 */
    public final /* synthetic */ C22421c m116493N8(final String str, boolean z, boolean z2) {
        return m116308S9(str, z, z2).map(new qcj() { // from class: l.yhb
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f199918a.m116489M8(str, (Envelope) obj);
            }
        }).compose(C4879a.m32255T2());
    }

    @Nullable
    /* JADX INFO: renamed from: N9 */
    public LiteraturesComments m116494N9(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return null;
        }
        List<LiteraturesComments> listM116562g7 = m116562g7(str);
        if (jyb.m147479J(listM116562g7)) {
            return null;
        }
        for (LiteraturesComments literaturesComments : listM116562g7) {
            if (TextUtils.equals(literaturesComments.literatureID, str2)) {
                return literaturesComments;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: Na */
    public C22421c<uxj0> m116495Na(final String str) {
        return this.f89102Q.scheduled("users/" + str + Passby.TYPE, 0, new pcj() { // from class: l.whb
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f189107a.m116572i9(str);
            }
        });
    }

    /* JADX INFO: renamed from: O7 */
    public Map<String, GPMemo> m116496O7() {
        Map<String, GPMemo> mapM159277n = this.f89237g7.m159277n();
        return mapM159277n == null ? new HashMap() : mapM159277n;
    }

    /* JADX INFO: renamed from: O8 */
    public final /* synthetic */ uxj0 m116497O8(Envelope envelope) {
        if (!jyb.m147479J(((CoreData) envelope.getModuleData(CoreData.class)).appealInfos)) {
            this.f89005C0.m137019l(((CoreData) envelope.getModuleData(CoreData.class)).appealInfos.get(0));
        }
        return uxj0.f181467a;
    }

    @NonNull
    /* JADX INFO: renamed from: O9 */
    public List<LiteraturesComments> m116498O9(String str, String str2) {
        ArrayList arrayList = new ArrayList();
        LiteraturesComments literaturesCommentsM116494N9 = m116494N9(str, str2);
        if (literaturesCommentsM116494N9 != null) {
            arrayList.add(literaturesCommentsM116494N9);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: Oa */
    public C22421c<uxj0> m116499Oa(final String str) {
        return this.f89102Q.scheduled("userWithRelationship/" + str, 0, new pcj() { // from class: l.hib
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f110003a.m116580k9(str);
            }
        });
    }

    /* JADX INFO: renamed from: P8 */
    public final /* synthetic */ C22421c m116501P8() {
        return qi20.m176654a(new pcj() { // from class: l.eib
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4879a.f20236P.auth().m209043q(C4879a.m32369w2("/me/appeal-info")).m209028b();
            }
        }).map(new qcj() { // from class: l.fib
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f99173a.m116497O8((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: P9 */
    public User m116502P9() {
        return uqb0.f180405k0.f184355d.query(this.f88999B1);
    }

    /* JADX INFO: renamed from: Pa */
    public User m116503Pa(String str) {
        return uqb0.f180405k0.f184355d.queryCache(str);
    }

    /* JADX INFO: renamed from: Q7 */
    public final C22421c<SettingGroups> m116504Q7(final pcj<x1d0> pcjVar, int i, String str) {
        return scheduled(str, i, new pcj() { // from class: l.zgb
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f204284a.m116449C8(pcjVar);
            }
        });
    }

    /* JADX INFO: renamed from: Q8 */
    public final /* synthetic */ uxj0 m116505Q8(Envelope envelope) {
        if (!jyb.m147479J(((CoreData) envelope.getModuleData(CoreData.class)).appealInfos)) {
            this.f89012D0.m137019l(((CoreData) envelope.getModuleData(CoreData.class)).appealInfos.get(0));
        }
        return uxj0.f181467a;
    }

    /* JADX INFO: renamed from: Q9 */
    public User m116506Q9(String str) {
        return uqb0.f180405k0.f184355d.query(str);
    }

    /* JADX INFO: renamed from: Qa */
    public C22421c<Meta> m116507Qa(final String str) {
        return this.f89102Q.now(qi20.m176654a(new pcj() { // from class: l.ldb
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4879a.f20236P.auth().m209043q(C4879a.m32278a("/qrcode/verify")).m209038l(z1d0.create(Network.JSON, "{\"clientId\":\"100032\",\"value\":\"" + str + "\"}")).m209028b();
            }
        }).map(new qcj() { // from class: l.mdb
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((Envelope) obj).meta;
            }
        }));
    }

    /* JADX INFO: renamed from: R7 */
    public C22421c<CurrencyTypeData> m116508R7() {
        return this.f89229f7.m159274k();
    }

    /* JADX INFO: renamed from: R8 */
    public final /* synthetic */ C22421c m116509R8() {
        return qi20.m176654a(new pcj() { // from class: l.rgb
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4879a.f20236P.auth().m209043q(C4879a.m32369w2("/me/appeal-fake-info")).m209028b();
            }
        }).map(new qcj() { // from class: l.sgb
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f167842a.m116505Q8((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: R9 */
    public final C22421c<Envelope> m116510R9(final String str) {
        return new ti20(new pcj() { // from class: l.edb
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4879a.f20236P.auth().m209043q(C4879a.m32340p1()).m209038l(z1d0.create(Network.JSON, str)).m209028b();
            }
        }).doOnError(new y20() { // from class: l.gdb
            @Override // p153l.y20
            public final void call(Object obj) {
                dkb.m116251E5((Throwable) obj);
            }
        });
    }

    /* JADX INFO: renamed from: Ra */
    public C22421c<WechatNotifySetting> m116511Ra() {
        return this.f89102Q.scheduled("wechat_setting_status", 0, new pcj() { // from class: l.mhb
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f136837a.m116588m9();
            }
        });
    }

    /* JADX INFO: renamed from: S6 */
    public void m116512S6(@NonNull ChatPartnerScene chatPartnerScene) {
        final String string = Uri.parse(C4879a.m32216J0("/chat-partners")).buildUpon().appendQueryParameter("scene", chatPartnerScene.getValue()).build().toString();
        final z1d0 z1d0VarCreate = z1d0.create(Network.JSON, "");
        this.f89102Q.scheduled("chatPartnersDialogShow" + CoreModule.m30929H().userId(), -1, new pcj() { // from class: l.wdb
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return qi20.m176658e(new pcj() { // from class: l.rfb
                    @Override // p153l.pcj, java.util.concurrent.Callable
                    public final Object call() {
                        return C4879a.f20236P.auth().m209043q(str).m209038l(z1d0Var).m209028b();
                    }
                }).compose(psd0.m173592C());
            }
        });
    }

    /* JADX INFO: renamed from: S7 */
    public C22421c<uxj0> m116513S7() {
        return this.f89102Q.now(qi20.m176654a(new pcj() { // from class: l.khb
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4879a.f20236P.auth().m209043q(C4879a.m32369w2("/me/sales")).m209038l(z1d0.create(Network.JSON, "")).m209028b();
            }
        }).map(new qcj() { // from class: l.lhb
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return uxj0.f181467a;
            }
        }).compose(psd0.m173592C()));
    }

    /* JADX INFO: renamed from: S8 */
    public final /* synthetic */ uxj0 m116514S8(Envelope envelope) {
        LoveLetterEntryInfo loveLetterEntryInfo = ((CoreData) envelope.getModuleData(CoreData.class)).loveLetter;
        if (loveLetterEntryInfo != null) {
            this.f89136U1.m137019l(loveLetterEntryInfo);
        }
        return uxj0.f181467a;
    }

    /* JADX INFO: renamed from: T6 */
    public C22421c<String> m116515T6() {
        return this.f89142V.onBackpressureLatest().observeOn(fo0.m126432a());
    }

    /* JADX INFO: renamed from: T7 */
    public boolean m116516T7(String str) {
        return !TextUtils.isEmpty(str) && NullChecker.m82486a(m116494N9(CoreModule.m30929H().userId(), str));
    }

    /* JADX INFO: renamed from: T8 */
    public final /* synthetic */ C22421c m116517T8() {
        return qi20.m176654a(new pcj() { // from class: l.egb
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4879a.f20236P.auth().m209043q(C4879a.m32203G("/love_letter/info")).m209032f().m209028b();
            }
        }).map(new qcj() { // from class: l.pgb
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f152252a.m116514S8((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: U6 */
    public void m116518U6() {
        this.f89182a0.put("");
    }

    /* JADX INFO: renamed from: U7 */
    public boolean m116519U7() {
        List<LiteraturesComments> listM116562g7 = m116562g7(CoreModule.m30929H().userId());
        boolean z = true;
        if (!jyb.m147479J(listM116562g7) && listM116562g7.size() >= this.f89102Q.f20424s1.f20824S.get().intValue()) {
            z = false;
        }
        if (!z) {
            o1j0.m165651y("您添加的作品数量已达上限");
        }
        return z;
    }

    /* JADX INFO: renamed from: U8 */
    public final /* synthetic */ C22421c m116520U8(String str, z1d0 z1d0Var) {
        return qi20.m176658e(new C16557d(str, z1d0Var)).observeOn(fo0.m126432a());
    }

    /* JADX INFO: renamed from: V6 */
    public final void m116521V6() {
        CoreModule.f18264c.f20381e0.f89248i2.put("");
    }

    /* JADX INFO: renamed from: V8 */
    public final /* synthetic */ void m116522V8(Boolean bool) {
        m116527W9(CoreModule.m30929H().userId());
    }

    /* JADX INFO: renamed from: V9 */
    public C22421c<Envelope> m116523V9(final String str, String str2) {
        final String strM32253T0;
        if (TextUtils.isEmpty(str2)) {
            strM32253T0 = C4879a.m32253T0();
        } else {
            strM32253T0 = C4879a.m32253T0() + "&with=" + str2;
        }
        return new ti20(new pcj() { // from class: l.mib
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4879a.f20236P.auth().m209043q(strM32253T0).m209038l(z1d0.create(Network.JSON, str)).m209028b();
            }
        }).doOnError(new y20() { // from class: l.nib
            @Override // p153l.y20
            public final void call(Object obj) {
                dkb.m116423v6((Throwable) obj);
            }
        });
    }

    /* JADX INFO: renamed from: W6 */
    public C22421c<uxj0> m116524W6(String str) {
        String string;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("kind", "exclusive");
            jSONObject.put("content", str);
            string = jSONObject.toString();
        } catch (JSONException e) {
            CrashHelper.m82479c(e);
            string = "";
        }
        final z1d0 z1d0VarCreate = z1d0.create(Network.JSON, string);
        return this.f89102Q.scheduled("icebreakings/post/" + CoreModule.m30929H().userId(), -1, new pcj() { // from class: l.cgb
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return qi20.m176658e(new pcj() { // from class: l.jgb
                    @Override // p153l.pcj, java.util.concurrent.Callable
                    public final Object call() {
                        return C4879a.f20236P.auth().m209043q(C4879a.m32216J0("/icebreakings")).m209038l(z1d0Var).m209028b();
                    }
                }).map(new qcj() { // from class: l.kgb
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return uxj0.f181467a;
                    }
                }).compose(psd0.m173592C());
            }
        });
    }

    /* JADX INFO: renamed from: W7 */
    public boolean m116525W7() {
        User userM116593na = m116593na();
        return NullChecker.m82486a(userM116593na) && !jyb.m147479J(userM116593na.status) && userM116593na.status.contains(UserStatus.get(UserStatus.RISK_TAG_FAKE_GENDER)) && !App.f16092i.get().equals(this.f89102Q.f20381e0.m116472I7());
    }

    /* JADX INFO: renamed from: W8 */
    public final /* synthetic */ FakeGuideData m116526W8(Envelope envelope) {
        FakeGuideData fakeGuideData = ((CoreData) envelope.getModuleData(CoreData.class)).fakeGuideData;
        this.f89149V6.m137019l(fakeGuideData);
        return fakeGuideData;
    }

    /* JADX INFO: renamed from: W9 */
    public C22421c<uxj0> m116527W9(String str) {
        return m116531X9(str, false);
    }

    /* JADX INFO: renamed from: X6 */
    public void m116528X6(String str, String str2, ConversationStatus conversationStatus) {
        m116532Y6(str, str2, conversationStatus, MatchFrom.get("unknown_"));
    }

    /* JADX INFO: renamed from: X7 */
    public C22507a<Boolean> m116529X7() {
        if (this.f89167Y0 == null) {
            this.f89167Y0 = C22507a.m222759c(Boolean.valueOf(bj30.m104592a() && (App.f16092i.get().intValue() <= 3 || this.f89102Q.f20381e0.f89159X0.get().booleanValue())));
        }
        return this.f89167Y0;
    }

    /* JADX INFO: renamed from: X8 */
    public final /* synthetic */ C22421c m116530X8() {
        return qi20.m176654a(new pcj() { // from class: l.uib
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4879a.f20236P.auth().m209043q(C4879a.m32203G("/antispam/guide-change-avatar")).m209032f().m209028b();
            }
        }).map(new qcj() { // from class: l.wib
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f189349a.m116526W8((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: X9 */
    public C22421c<uxj0> m116531X9(String str, boolean z) {
        return m116535Y9(str, z, false);
    }

    /* JADX INFO: renamed from: Y6 */
    public void m116532Y6(String str, String str2, ConversationStatus conversationStatus, MatchFrom matchFrom) {
        User userQuery = uqb0.f180405k0.f184355d.query(str);
        if (userQuery == null) {
            return;
        }
        if (userQuery.localRelationship == null) {
            Relationship relationshipNew_ = Relationship.new_();
            relationshipNew_.conversationStatus = conversationStatus;
            relationshipNew_.convType = str2;
            userQuery.localRelationship = relationshipNew_;
        } else {
            boolean zMo34811c = gta.m132210e().m132214d().mo34811c();
            boolean zEquals = "quickchat".equals(str2);
            if (!zMo34811c || (!zEquals && !TEnum.equals(conversationStatus, "blocked"))) {
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
        uqb0.f180405k0.f184355d.upsert(userQuery);
    }

    /* JADX INFO: renamed from: Y7 */
    public boolean m116533Y7() {
        User userM116593na = m116593na();
        return NullChecker.m82486a(userM116593na) && !jyb.m147479J(userM116593na.status) && userM116593na.status.contains(UserStatus.get(UserStatus.RISK_TAG_VIOLATION)) && !App.f16092i.get().equals(this.f89102Q.f20381e0.m116472I7());
    }

    /* JADX INFO: renamed from: Y8 */
    public final /* synthetic */ uxj0 m116534Y8(AppealPostData appealPostData, Envelope envelope) {
        if (!TextUtils.equals(appealPostData.appeal_type, "jailed")) {
            this.f89102Q.m32495w3(envelope, null);
        }
        return uxj0.f181467a;
    }

    /* JADX INFO: renamed from: Y9 */
    public C22421c<uxj0> m116535Y9(final String str, final boolean z, final boolean z2) {
        return this.f89102Q.scheduled("users/" + str, 0, new pcj() { // from class: l.gjb
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f104620a.m116493N8(str, z, z2);
            }
        });
    }

    /* JADX INFO: renamed from: Z6 */
    public C22421c<uxj0> m116536Z6(String str, String str2) {
        String string;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("tipId", str);
            jSONObject.put("content", str2);
            string = jSONObject.toString();
        } catch (JSONException e) {
            CrashHelper.m82479c(e);
            string = "";
        }
        final z1d0 z1d0VarCreate = z1d0.create(Network.JSON, string);
        return this.f89102Q.scheduled("icebreakings/put/" + CoreModule.m30929H().userId(), -1, new pcj() { // from class: l.wfb
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return qi20.m176658e(new pcj() { // from class: l.lgb
                    @Override // p153l.pcj, java.util.concurrent.Callable
                    public final Object call() {
                        return C4879a.f20236P.auth().m209043q(C4879a.m32216J0("/icebreakings")).m209039m(z1d0Var).m209028b();
                    }
                }).map(new qcj() { // from class: l.mgb
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return uxj0.f181467a;
                    }
                }).compose(psd0.m173592C());
            }
        });
    }

    /* JADX INFO: renamed from: Z7 */
    public boolean m116537Z7() {
        User userM116593na = m116593na();
        return NullChecker.m82486a(userM116593na) && !jyb.m147479J(userM116593na.status) && userM116593na.status.contains(UserStatus.get(UserStatus.RISK_TAG_UNREAL)) && !App.f16092i.get().equals(this.f89102Q.f20381e0.m116472I7());
    }

    /* JADX INFO: renamed from: Z8 */
    public final /* synthetic */ C22421c m116538Z8(final AppealPostData appealPostData, final AppealPostData appealPostData2) {
        return new ti20(new pcj() { // from class: l.sfb
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4879a.f20236P.auth().m209043q(C4879a.m32369w2("/me/appeal-material")).m209038l(z1d0.create(Network.JSON, appealPostData.toJson())).m209028b();
            }
        }).map(new qcj() { // from class: l.ufb
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f178746a.m116534Y8(appealPostData2, (Envelope) obj);
            }
        }).compose(psd0.m173592C());
    }

    /* JADX INFO: renamed from: Z9 */
    public C22421c<uxj0> m116539Z9() {
        return this.f89102Q.scheduled("me/appeal-info", 0, new pcj() { // from class: l.ckb
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f82273a.m116501P8();
            }
        });
    }

    /* JADX INFO: renamed from: a7 */
    public C22421c<UserFeedbackInfo> m116540a7(final String str) {
        final String str2 = "/quality/fake/picture/pop";
        return this.f89102Q.scheduled("/quality/fake/picture/pop" + str, -1, new pcj() { // from class: l.rib
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f163347a.m116583l8(str, str2);
            }
        });
    }

    /* JADX INFO: renamed from: a8 */
    public boolean m116541a8() {
        return TextUtils.equals(this.f89102Q.f20381e0.f89178Z3.get(), UserHomeMode.marryMode);
    }

    /* JADX INFO: renamed from: a9 */
    public final /* synthetic */ C22421c m116542a9(final AppealPostData appealPostData, final AppealPostData appealPostData2) {
        return this.f89102Q.scheduled("/me/appeal-material", -1, new pcj() { // from class: l.cfb
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f81495a.m116538Z8(appealPostData2, appealPostData);
            }
        });
    }

    /* JADX INFO: renamed from: aa */
    public C22421c<uxj0> m116543aa() {
        return this.f89102Q.scheduled("me/appeal-fake-info", 0, new pcj() { // from class: l.igb
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f114773a.m116509R8();
            }
        });
    }

    /* JADX INFO: renamed from: b7 */
    public C22421c<uxj0> m116544b7(String str, final String str2, final boolean z, final boolean z2) {
        final String str3 = "/quality/feedback/" + str + "/picture";
        return this.f89102Q.scheduled("picture_feed_back:" + str + z, -1, new pcj() { // from class: l.wjb
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return qi20.m176658e(new pcj() { // from class: l.qeb
                    @Override // p153l.pcj, java.util.concurrent.Callable
                    public final Object call() {
                        return dkb.m116279L5(str, z, z, str);
                    }
                }).map(new qcj() { // from class: l.reb
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return uxj0.f181467a;
                    }
                }).compose(psd0.m173592C());
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0041  */
    /* JADX INFO: renamed from: b8 */
    public boolean m116545b8(boolean z) {
        byte b;
        VerificationCenter verificationCenterM32615k4 = CoreModule.f18264c.f20294B0.m32615k4();
        byte b2 = -1;
        if (!NullChecker.m82486a(verificationCenterM32615k4) || !NullChecker.m82486a(verificationCenterM32615k4.picVerificationInfo)) {
            b = -1;
        } else if (TEnum.equals(verificationCenterM32615k4.picVerificationInfo.status, "verified")) {
            b = 1;
        } else if (TEnum.equals(verificationCenterM32615k4.picVerificationInfo.status, "pending") || TEnum.equals(verificationCenterM32615k4.picVerificationInfo.status, StudentVerificationStatus.prePending)) {
            b = 0;
        } else {
            b = -1;
        }
        if (NullChecker.m82486a(verificationCenterM32615k4) && NullChecker.m82486a(verificationCenterM32615k4.idCard)) {
            if (TEnum.equals(verificationCenterM32615k4.idCard.status, "verified")) {
                b2 = 1;
            } else if (TEnum.equals(verificationCenterM32615k4.idCard.status, "pending") || TEnum.equals(verificationCenterM32615k4.idCard.status, StudentVerificationStatus.prePending)) {
                b2 = 0;
            }
        }
        User userM116593na = m116593na();
        boolean z2 = NullChecker.m82486a(userM116593na) && NullChecker.m82486a(userM116593na.settings) && !(TextUtils.isEmpty(userM116593na.settings.phoneNumber.number) && TextUtils.isEmpty(userM116593na.settings.linkedPhoneNumber.number));
        boolean zEquals = TextUtils.equals(this.f89102Q.f20381e0.f89178Z3.get(), UserHomeMode.marryMode);
        if (!z) {
            zEquals = true;
        }
        return b == 1 && b2 == 1 && z2 && zEquals && !userM116593na.isFakeUser() && TextUtils.equals("passed", userM116593na.getUserInfoForMarryStatus());
    }

    /* JADX INFO: renamed from: b9 */
    public final /* synthetic */ C22421c m116546b9(final String str) {
        return qi20.m176658e(new pcj() { // from class: l.sib
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4879a.f20236P.auth().m209043q(C4879a.m32203G(str)).m209038l(z1d0.create(Network.JSON, "{\"source\":\"client\"}")).m209028b();
            }
        }).map(new C16554a()).compose(psd0.m173592C());
    }

    /* JADX INFO: renamed from: ba */
    public C22421c<uxj0> m116547ba() {
        return now(this.f89237g7.m159280q());
    }

    /* JADX INFO: renamed from: c7 */
    public C22421c<uxj0> m116548c7(final int i, final String str) {
        return this.f89102Q.scheduled("feedback_holiday_mask" + CoreModule.m30929H().userId(), -1, new pcj() { // from class: l.tgb
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return qi20.m176658e(new pcj() { // from class: l.ajb
                    @Override // p153l.pcj, java.util.concurrent.Callable
                    public final Object call() {
                        return C4879a.f20236P.auth().m209043q(C4879a.m32203G("/layer/" + str + "/" + i)).m209039m(z1d0.create(Network.JSON, "")).m209028b();
                    }
                }).map(new qcj() { // from class: l.bjb
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return uxj0.f181467a;
                    }
                }).compose(psd0.m173592C());
            }
        });
    }

    /* JADX INFO: renamed from: c8 */
    public boolean m116549c8() {
        List<UserStatus> list;
        User userM116593na = m116593na();
        return (userM116593na == null || (list = userM116593na.status) == null || !list.contains(UserStatus.get("hidden")) || App.f16092i.get().equals(this.f89102Q.f20381e0.m116472I7())) ? false : true;
    }

    /* JADX INFO: renamed from: c9 */
    public final /* synthetic */ void m116550c9(String str) {
        m116528X6(str, "default", ConversationStatus.get("blocked"));
    }

    /* JADX INFO: renamed from: ca */
    public C22421c<uxj0> m116551ca() {
        return this.f89229f7.m159280q();
    }

    /* JADX INFO: renamed from: d8 */
    public boolean m116552d8() {
        List<UserStatus> list;
        User userM116593na = m116593na();
        return (userM116593na == null || (list = userM116593na.status) == null || !list.contains(UserStatus.get("hidden"))) ? false : true;
    }

    /* JADX INFO: renamed from: d9 */
    public final /* synthetic */ void m116553d9(final String str) {
        this.f89102Q.f20351U.m128074a(new x20() { // from class: l.qcb
            @Override // p153l.x20
            public final void call() {
                this.f156569a.m116550c9(str);
            }
        });
    }

    /* JADX INFO: renamed from: da */
    public C22421c<uxj0> m116554da() {
        return this.f89102Q.scheduled("refreshLoveLetterEntry", 0, new pcj() { // from class: l.fdb
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f98332a.m116517T8();
            }
        });
    }

    /* JADX INFO: renamed from: e8 */
    public boolean m116555e8() {
        User userM116593na = m116593na();
        return userM116593na != null && userM116593na.isProfileJailed();
    }

    /* JADX INFO: renamed from: e9 */
    public final /* synthetic */ void m116556e9(final String str, final long j) {
        this.f89102Q.f20351U.m128074a(new x20() { // from class: l.aeb
            @Override // p153l.x20
            public final void call() {
                dkb.m116354e6(str, j);
            }
        });
    }

    /* JADX INFO: renamed from: ea */
    public C22421c<uxj0> m116557ea() {
        return this.f89221e7.m159280q();
    }

    /* JADX INFO: renamed from: f7 */
    public void m116558f7(String str, String str2, boolean z, String str3, String str4, String str5, String str6, String str7) {
        String string;
        if (TextUtils.isEmpty(str)) {
            str = CoreModule.m30929H().userId();
        }
        String strM32203G = C4879a.m32203G("/cards/feedback");
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
            CrashHelper.m82479c(e);
            string = "";
        }
        z1d0 z1d0VarCreate = z1d0.create(Network.JSON, string);
        this.f89102Q.scheduled(strM32203G + str, -1, new C16556c(strM32203G, z1d0VarCreate));
    }

    /* JADX INFO: renamed from: f8 */
    public boolean m116559f8() {
        User userM116593na = m116593na();
        return userM116593na != null && userM116593na.isSwipeJailed();
    }

    /* JADX INFO: renamed from: f9 */
    public final /* synthetic */ void m116560f9(String str, String str2, uxj0 uxj0Var) {
        m116463Fa(str, str2);
    }

    /* JADX INFO: renamed from: fa */
    public C22421c<RegionRule> m116561fa() {
        return this.f89221e7.m159274k();
    }

    /* JADX INFO: renamed from: g7 */
    public List<LiteraturesComments> m116562g7(String str) {
        return this.f89109Q6.get(str);
    }

    /* JADX INFO: renamed from: g8 */
    public boolean m116563g8() {
        VerificationCenter verificationCenterM32621q4 = this.f89102Q.f20294B0.m32621q4();
        return NullChecker.m82486a(verificationCenterM32621q4) && NullChecker.m82486a(verificationCenterM32621q4.picVerificationInfo) && TEnum.equals(verificationCenterM32621q4.picVerificationInfo.status, "verified") && this.f89102Q.f20381e0.m116593na().isOpenFilterVeriMsg();
    }

    /* JADX INFO: renamed from: g9 */
    public final /* synthetic */ void m116564g9(String str, User user) {
        if (user == null) {
            m116527W9(str);
        }
    }

    /* JADX INFO: renamed from: ga */
    public RegionRule m116565ga() {
        return this.f89221e7.m159277n();
    }

    /* JADX INFO: renamed from: h7 */
    public Literatures m116566h7(String str) {
        return this.f89117R6.get(str);
    }

    /* JADX INFO: renamed from: h8 */
    public boolean m116567h8(long j) {
        return ((double) pzi0.m174454o()) - m116593na().createdTime <= ((double) TimeUnit.MILLISECONDS.convert(j, TimeUnit.HOURS));
    }

    /* JADX INFO: renamed from: h9 */
    public final /* synthetic */ uxj0 m116568h9(Envelope envelope) {
        this.f89102Q.m32497y3(envelope, null, false, false, true);
        return uxj0.f181467a;
    }

    /* JADX INFO: renamed from: ha */
    public C22421c<uxj0> m116569ha(String str, Report report) {
        return this.f89102Q.f20360X.m174051h3(C4879a.m32369w2("/" + str + "/reports"), report);
    }

    /* JADX INFO: renamed from: i7 */
    public C22421c<CoreData> m116570i7(String str) {
        final String str2 = "/" + str + "/literatures";
        return this.f89102Q.scheduled("/users/me/profile/BookMoviesDramas/" + str, 0, new pcj() { // from class: l.scb
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return qi20.m176658e(new pcj() { // from class: l.teb
                    @Override // p153l.pcj, java.util.concurrent.Callable
                    public final Object call() {
                        return C4879a.f20236P.auth().m209043q(C4879a.m32369w2(str)).m209032f().m209028b();
                    }
                }).map(new qcj() { // from class: l.ueb
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return dkb.m116291O5((Envelope) obj);
                    }
                });
            }
        }).compose(psd0.m173592C());
    }

    /* JADX INFO: renamed from: i8 */
    public boolean m116571i8() {
        User userM116593na = m116593na();
        return NullChecker.m82486a(userM116593na) && !jyb.m147479J(userM116593na.status) && userM116593na.status.contains(UserStatus.get(UserStatus.RISK_TAG_GUIDE_CHANGE_AVATAR));
    }

    /* JADX INFO: renamed from: i9 */
    public final /* synthetic */ C22421c m116572i9(String str) {
        return m116312T9(str).map(new qcj() { // from class: l.hjb
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f110171a.m116568h9((Envelope) obj);
            }
        }).compose(C4879a.m32255T2());
    }

    /* JADX INFO: renamed from: ia */
    public C22421c<uxj0> m116573ia() {
        return this.f89102Q.scheduled("reportLoveLetterShown", -1, new pcj() { // from class: l.nfb
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return qi20.m176654a(new pcj() { // from class: l.dgb
                    @Override // p153l.pcj, java.util.concurrent.Callable
                    public final Object call() {
                        return C4879a.f20236P.auth().m209043q(C4879a.m32203G("/love_letter/boost")).m209038l(z1d0.create(Network.JSON, "")).m209028b();
                    }
                }).map(new qcj() { // from class: l.fgb
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return uxj0.f181467a;
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: j7 */
    public C22421c<List<BreakIce>> m116574j7(String str, String str2, final List<String> list) {
        return CoreModule.m30933P().m143412i().mo34517hm() ? CoreModule.f18264c.f20440x2.m112772n3(str, str2).map(new qcj() { // from class: l.veb
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f183716a.m116587m8(list, (Envelope) obj);
            }
        }) : m116606r7(str, str2).map(new qcj() { // from class: l.web
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f188681a.m116591n8(list, (Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: j8 */
    public boolean m116575j8(User user) {
        if (!NullChecker.m82486a(user) || user.isJailed()) {
            return false;
        }
        return !user.status.contains(UserStatus.get("hidden")) || App.f16092i.get().equals(this.f89102Q.f20381e0.m116472I7());
    }

    /* JADX INFO: renamed from: j9 */
    public final /* synthetic */ uxj0 m116576j9(Envelope envelope) {
        this.f89102Q.m32497y3(envelope, null, false, false, true);
        return uxj0.f181467a;
    }

    /* JADX INFO: renamed from: ja */
    public C22421c<uxj0> m116577ja(String str, String str2, String str3) {
        final JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("task", str);
            jSONObject.put("type", str2);
            jSONObject.put("scene", str3);
        } catch (Exception unused) {
        }
        return this.f89102Q.scheduled("report_task_bh" + str + str2 + str3, -1, new pcj() { // from class: l.meb
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return qi20.m176654a(new pcj() { // from class: l.ugb
                    @Override // p153l.pcj, java.util.concurrent.Callable
                    public final Object call() {
                        return C4879a.f20236P.auth().m209043q(C4879a.m32203G("/my-tab-task/report")).m209038l(z1d0.create(Network.JSON, jSONObject.toString())).m209028b();
                    }
                });
            }
        }).map(new C16562i());
    }

    /* JADX INFO: renamed from: k7 */
    public C22421c<Envelope> m116578k7(String str) {
        final String string;
        if (TextUtils.isEmpty(str)) {
            string = Uri.parse(C4879a.m32216J0("/chat-partners-signals?with=users&limit=20")).buildUpon().appendQueryParameter("until", Converter.dateToApiTimeString(pzi0.m174454o())).build().toString();
        } else {
            string = Uri.parse(C4879a.m32216J0("/chat-partners-signals?with=users&") + str).toString();
        }
        return this.f89102Q.scheduled("getChatPartnerHistory" + CoreModule.m30929H().userId(), 0, new pcj() { // from class: l.xib
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return qi20.m176658e(new pcj() { // from class: l.ydb
                    @Override // p153l.pcj, java.util.concurrent.Callable
                    public final Object call() {
                        return C4879a.f20236P.auth().m209043q(str).m209032f().m209028b();
                    }
                }).compose(psd0.m173592C());
            }
        });
    }

    /* JADX INFO: renamed from: k8 */
    public boolean m116579k8() {
        User userM116593na = m116593na();
        return NullChecker.m82486a(userM116593na) && !jyb.m147479J(userM116593na.status) && userM116593na.status.contains(UserStatus.get(UserStatus.RISK_TAG_UNREAL)) && userM116593na.status.contains(UserStatus.get(UserStatus.RISK_TAG_FAKE_YOUNGER_AGE)) && !App.f16092i.get().equals(this.f89102Q.f20381e0.m116472I7());
    }

    /* JADX INFO: renamed from: k9 */
    public final /* synthetic */ C22421c m116580k9(String str) {
        return m116316U9(str).map(new qcj() { // from class: l.pcb
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f151546a.m116576j9((Envelope) obj);
            }
        }).compose(C4879a.m32255T2());
    }

    /* JADX INFO: renamed from: ka */
    public void m116581ka(final String str, final boolean z, final boolean z2) {
        this.f89102Q.scheduled("report_task_bh" + str, -1, new pcj() { // from class: l.dib
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return qi20.m176654a(new pcj() { // from class: l.rcb
                    @Override // p153l.pcj, java.util.concurrent.Callable
                    public final Object call() {
                        return dkb.m116270J4(str, z, z);
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: l7 */
    public C22421c<Envelope> m116582l7(@NonNull ChatPartnerScene chatPartnerScene) {
        final String string = Uri.parse(C4879a.m32216J0("/chat-partners?with=users")).buildUpon().appendQueryParameter("scene", chatPartnerScene.getValue()).build().toString();
        return this.f89102Q.scheduled("getChatPartners" + CoreModule.m30929H().userId(), -1, new pcj() { // from class: l.ygb
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return qi20.m176658e(new pcj() { // from class: l.zib
                    @Override // p153l.pcj, java.util.concurrent.Callable
                    public final Object call() {
                        return C4879a.f20236P.auth().m209043q(str).m209032f().m209028b();
                    }
                }).compose(psd0.m173592C());
            }
        });
    }

    /* JADX INFO: renamed from: l8 */
    public final /* synthetic */ C22421c m116583l8(final String str, final String str2) {
        return qi20.m176658e(new pcj() { // from class: l.heb
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return dkb.m116271J5(str, str2);
            }
        }).map(new C16561h()).compose(psd0.m173592C()).map(new C16560g(str));
    }

    /* JADX INFO: renamed from: l9 */
    public final /* synthetic */ WechatNotifySetting m116584l9(Envelope envelope) {
        this.f89061K1.m137019l(Optional.fromNullable(((CoreData) envelope.getModuleData(CoreData.class)).wechat));
        return ((CoreData) envelope.getModuleData(CoreData.class)).wechat;
    }

    /* JADX INFO: renamed from: la */
    public C22421c<uxj0> m116585la() {
        return this.f89102Q.scheduled("wechat_dialog_show", 0, new pcj() { // from class: l.ncb
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return qi20.m176654a(new pcj() { // from class: l.hdb
                    @Override // p153l.pcj, java.util.concurrent.Callable
                    public final Object call() {
                        return C4879a.f20236P.auth().m209043q(C4879a.m32203G("/wechat/dialogpop")).m209032f().m209028b();
                    }
                }).map(new qcj() { // from class: l.idb
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return uxj0.f181467a;
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: m7 */
    public C22421c<Envelope> m116586m7() {
        String str = "/" + CoreModule.m30929H().userId() + "/popGuide";
        return this.f89102Q.scheduled(str, 0, new C16555b(str));
    }

    /* JADX INFO: renamed from: m9 */
    public final /* synthetic */ C22421c m116588m9() {
        return qi20.m176654a(new pcj() { // from class: l.zjb
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4879a.f20236P.auth().m209043q(C4879a.m32203G("/wechat/status")).m209032f().m209028b();
            }
        }).map(new qcj() { // from class: l.akb
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f71979a.m116584l9((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: ma */
    public User m116589ma() {
        User userM116593na = m116593na();
        return userM116593na.riskAuditUser(CoreModule.m30930K().getUserById("fake_risk_audit_default_" + userM116593na.f56859id));
    }

    /* JADX INFO: renamed from: n7 */
    public C22421c<uxj0> m116590n7() {
        return now("gpTopicCards", qi20.m176656c(new pcj() { // from class: l.zhb
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4879a.f20236P.auth().m209043q(C4879a.m32369w2("/" + CoreModule.m30929H().userId() + "/topic-cards")).m209032f().m209028b();
            }
        }, GPTopicCardEnvelop.JSON_ADAPTER).map(new qcj() { // from class: l.kib
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f126977a.m116595o8((GPTopicCardEnvelop) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: n9 */
    public C22421c<MarriageGuide> m116592n9() {
        final String str = this.f89050I4.get().booleanValue() ? "moment" : "quality,moment";
        return this.f89102Q.scheduled("marry_dlg_show_check_".concat(str), 0, new pcj() { // from class: l.fjb
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return qi20.m176658e(new pcj() { // from class: l.bdb
                    @Override // p153l.pcj, java.util.concurrent.Callable
                    public final Object call() {
                        return C4879a.f20236P.auth().m209043q(C4879a.m32216J0("/marriage-guide?conditions=" + str)).m209032f().m209028b();
                    }
                }).map(new qcj() { // from class: l.cdb
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return ((CoreData) ((Envelope) obj).getModuleData(CoreData.class)).marriageGuide;
                    }
                }).filter(new qcj() { // from class: l.ddb
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return Boolean.valueOf(NullChecker.m82486a((MarriageGuide) obj));
                    }
                }).observeOn(fo0.m126432a());
            }
        });
    }

    /* JADX INFO: renamed from: na */
    public User m116593na() {
        return l51.m152884D() ? m116600p9() : m116502P9();
    }

    /* JADX INFO: renamed from: o7 */
    public C22421c<uxj0> m116594o7(final String str) {
        return now("gpGetTopicUsers", qi20.m176656c(new pcj() { // from class: l.aib
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4879a.f20236P.auth().m209043q(C4879a.m32369w2("/" + CoreModule.m30929H().userId() + "/topic-cards/" + str)).m209032f().m209028b();
            }
        }, Envelope.JSON_ADAPTER).map(new qcj() { // from class: l.bib
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f76851a.m116599p8(str, (Envelope) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: o8 */
    public final /* synthetic */ uxj0 m116595o8(GPTopicCardEnvelop gPTopicCardEnvelop) {
        this.f89279m1.m137019l(gta.m132210e().m132214d().mo34888mk(gPTopicCardEnvelop.data.topicCards));
        return uxj0.f181467a;
    }

    /* JADX INFO: renamed from: o9 */
    public C22421c<User> m116596o9() {
        return m116483Ka(this.f88999B1);
    }

    /* JADX INFO: renamed from: oa */
    public User m116597oa(String str) {
        return l51.m152884D() ? m116503Pa(str) : m116506Q9(str);
    }

    /* JADX INFO: renamed from: p7 */
    public C22421c<Envelope> m116598p7() {
        return this.f89102Q.scheduled("icebreakings/get/" + CoreModule.m30929H().userId(), 0, new pcj() { // from class: l.yib
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return qi20.m176658e(new pcj() { // from class: l.xdb
                    @Override // p153l.pcj, java.util.concurrent.Callable
                    public final Object call() {
                        return C4879a.f20236P.auth().m209043q(C4879a.m32216J0("/icebreakings?source=matchGuide")).m209032f().m209028b();
                    }
                }).compose(psd0.m173592C());
            }
        });
    }

    /* JADX INFO: renamed from: p8 */
    public final /* synthetic */ uxj0 m116599p8(String str, Envelope envelope) {
        HashMap<String, List<User>> mapM222761e = this.f89287n1.m222761e();
        if (mapM222761e == null) {
            mapM222761e = new HashMap<>();
        }
        mapM222761e.put(str, ((CommonData) envelope.getModuleData(CommonData.class)).users);
        this.f89287n1.m137019l(mapM222761e);
        return uxj0.f181467a;
    }

    /* JADX INFO: renamed from: p9 */
    public User m116600p9() {
        if (this.f88999B1 == null) {
            StringBuilder sb = new StringBuilder("CoreUser me_ CoreModule.account().userId == null");
            if (CoreModule.m30929H().getAuthData().mo107143b() == null) {
                sb.append(", CoreModule.account().getAuthData().get == null");
            } else {
                sb.append(", CoreModule.account().getAuthData().get().userId" + CoreModule.m30929H().getAuthData().mo107143b().userId);
            }
            CrashHelper.m82479c(new NullPointerException(sb.toString()));
        }
        return uqb0.f180405k0.f184355d.queryCache(this.f88999B1);
    }

    /* JADX INFO: renamed from: pa */
    public void m116601pa(String str, CoreData coreData) {
        if (TextUtils.isEmpty(str) || coreData == null) {
            return;
        }
        List<Literatures> list = coreData.literatures;
        List<LiteraturesComments> list2 = coreData.literaturesComments;
        if (jyb.m147479J(list2)) {
            m116486L9(str, new ArrayList());
            return;
        }
        if (!jyb.m147479J(list)) {
            for (Literatures literatures : list) {
                if (NullChecker.m82486a(literatures) && !TextUtils.isEmpty(literatures.f21175id)) {
                    m116490M9(literatures.f21175id, literatures);
                }
            }
        }
        for (LiteraturesComments literaturesComments : list2) {
            if (literaturesComments != null) {
                Literatures literaturesM116566h7 = m116566h7(literaturesComments.literatureID);
                if (NullChecker.m82486a(literaturesM116566h7) && !TextUtils.isEmpty(literaturesM116566h7.f21175id)) {
                    literaturesComments.localLiteratures = literaturesM116566h7;
                }
            }
        }
        m116486L9(str, list2);
    }

    /* JADX INFO: renamed from: q7 */
    public C22421c<List<IceBreakQuestion>> m116602q7(final String str) {
        return this.f89102Q.scheduled("get_ice_break_qas" + str, 0, new pcj() { // from class: l.ujb
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return qi20.m176654a(new pcj() { // from class: l.neb
                    @Override // p153l.pcj, java.util.concurrent.Callable
                    public final Object call() {
                        return dkb.m116296P6(str);
                    }
                }).map(new qcj() { // from class: l.oeb
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return ((CoreData) ((Envelope) obj).getModuleData(CoreData.class)).iceBreakQuestions;
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: q8 */
    public final /* synthetic */ C22421c m116603q8(final String str) {
        return qi20.m176658e(new pcj() { // from class: l.afb
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4879a.f20236P.auth().m209043q(C4879a.m32203G(str)).m209032f().m209028b();
            }
        }).map(new C16559f()).compose(psd0.m173592C()).map(new C16558e());
    }

    /* JADX INFO: renamed from: q9 */
    public final void m116604q9(String str, Envelope envelope) {
        if (!gta.m132210e().m132214d().mo34684Er() || TextUtils.equals(str, CoreModule.m30929H().userId())) {
            return;
        }
        m116601pa(str, (CoreData) envelope.getModuleData(CoreData.class));
    }

    /* JADX INFO: renamed from: qa */
    public final void m116605qa() {
        List<LiteraturesComments> listM116562g7 = CoreModule.f18264c.f20381e0.m116562g7(CoreModule.m30929H().userId());
        if (listM116562g7 == null || listM116562g7.isEmpty()) {
            m116521V6();
            return;
        }
        CoreData coreDataNew_ = CoreData.new_();
        coreDataNew_.literaturesComments = listM116562g7;
        CoreModule.f18264c.f20381e0.f89248i2.put(coreDataNew_.toJson());
    }

    /* JADX INFO: renamed from: r7 */
    public C22421c<Envelope> m116606r7(final String str, final String str2) {
        return this.f89102Q.scheduled("icebreakings/" + str, 0, new pcj() { // from class: l.ocb
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return dkb.m116381l4(str, str2);
            }
        });
    }

    /* JADX INFO: renamed from: r8 */
    public final /* synthetic */ void m116607r8(String str, Envelope envelope) {
        if (NullChecker.m82486a(envelope)) {
            m116601pa(str, (CoreData) envelope.getModuleData(CoreData.class));
        }
    }

    /* JADX INFO: renamed from: r9 */
    public void m116608r9(boolean z) {
        this.f89150W.m137019l(Boolean.valueOf(z));
    }

    /* JADX INFO: renamed from: ra */
    public C22421c<Envelope> m116609ra(@NonNull String str, @NonNull List<String> list) {
        String string;
        final String strM32216J0 = C4879a.m32216J0("/chat-partners-signals");
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("userIds", new JSONArray((Collection) list));
            jSONObject.put("textId", str);
            string = jSONObject.toString();
        } catch (JSONException unused) {
            string = "";
        }
        final z1d0 z1d0VarCreate = z1d0.create(Network.JSON, string);
        return this.f89102Q.scheduled(strM32216J0 + str + jSONObject, -1, new pcj() { // from class: l.jdb
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f120120a.m116520U8(strM32216J0, z1d0VarCreate);
            }
        });
    }

    /* JADX INFO: renamed from: s7 */
    public C22421c<IdealInfo> m116610s7(final String str, final String str2) {
        return this.f89102Q.scheduled("ideal_match_info_" + str + str2, 0, new pcj() { // from class: l.oib
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return qi20.m176654a(new pcj() { // from class: l.seb
                    @Override // p153l.pcj, java.util.concurrent.Callable
                    public final Object call() {
                        return C4879a.f20236P.auth().m209043q(C4879a.m32203G("/dating/ideal-guide/" + str + "?scene=" + str)).m209032f().m209028b();
                    }
                });
            }
        }).map(new qcj() { // from class: l.pib
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((CoreData) ((Envelope) obj).getModuleData(CoreData.class)).idealInfo;
            }
        });
    }

    /* JADX INFO: renamed from: s8 */
    public final /* synthetic */ void m116611s8(String str, Throwable th) {
        CoreData coreData;
        try {
            String str2 = this.f89248i2.get();
            if (TextUtils.isEmpty(str2) || (coreData = CoreData.JSON_ADAPTER.parse(str2)) == null) {
                return;
            }
            m116601pa(str, coreData);
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: s9 */
    public C22421c<uxj0> m116612s9(final String str) {
        User userM116503Pa = m116503Pa(str);
        if (userM116503Pa == null) {
            return this.f89102Q.just();
        }
        final String str2 = userM116503Pa.profile.contactLookups.next;
        C4883c c4883c = this.f89102Q;
        if (str2 == null) {
            return c4883c.just();
        }
        return c4883c.scheduled("users/" + str + "/contacts/more", 0, new pcj() { // from class: l.ejb
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f94287a.m116457E8(str, str2);
            }
        });
    }

    /* JADX INFO: renamed from: sa */
    public C22421c<uxj0> m116613sa(final List<String> list) {
        return this.f89102Q.scheduled("set_ice_break_qas", -1, new pcj() { // from class: l.sdb
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return qi20.m176654a(new pcj() { // from class: l.pfb
                    @Override // p153l.pcj, java.util.concurrent.Callable
                    public final Object call() {
                        return dkb.m116349d6(list);
                    }
                }).map(new qcj() { // from class: l.qfb
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return uxj0.f181467a;
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: t7 */
    public C22421c<UserFeedbackInfo> m116614t7() {
        final String str = "/inform/pop/info";
        return this.f89102Q.scheduled("/inform/pop/info", 0, new pcj() { // from class: l.geb
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f103777a.m116603q8(str);
            }
        });
    }

    /* JADX INFO: renamed from: t8 */
    public final /* synthetic */ uxj0 m116615t8(Envelope envelope) {
        int i;
        List<MyTabTask> list = ((CoreData) envelope.getModuleData(CoreData.class)).myTabTasks;
        for (MyTabTask myTabTask : list) {
            if (TextUtils.equals(myTabTask.type, "verification")) {
                if (!NullChecker.m82486a(myTabTask.button) || (i = myTabTask.button.counter) == this.f89285m7.get().intValue()) {
                    break;
                    break;
                }
                this.f89285m7.put(Integer.valueOf(i));
                this.f89293n7.put(Boolean.FALSE);
                this.f89277l7.m137019l(uxj0.f181467a);
                break;
            }
        }
        this.f89253i7.m137019l(list);
        return uxj0.f181467a;
    }

    /* JADX INFO: renamed from: t9 */
    public C22421c<uxj0> m116616t9(final String str) {
        return this.f89102Q.scheduled("onlineMatchGetUser/" + str, 0, new pcj() { // from class: l.gib
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f104214a.m116465G8(str);
            }
        });
    }

    /* JADX INFO: renamed from: ta */
    public C22421c<Boolean> m116617ta(List<IdealTag> list) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        JSONObject jSONObject4 = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        User userM116593na = CoreModule.f18264c.f20381e0.m116593na();
        final boolean zHasIdealInfo = userM116593na.hasIdealInfo();
        ArrayList arrayListM147486Q = jyb.m147486Q(list, new qcj() { // from class: l.xfb
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((IdealTag) obj).f39608id;
            }
        });
        if (zHasIdealInfo) {
            final ArrayList arrayListM147486Q2 = jyb.m147486Q(userM116593na.profile.extensions.basic.ideal, new qcj() { // from class: l.yfb
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((IdealTag) obj).f39608id;
                }
            });
            jyb.m147478I(arrayListM147486Q, new Comparator() { // from class: l.zfb
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return dkb.m116401q4(arrayListM147486Q2, (String) obj, (String) obj2);
                }
            });
        }
        if (!jyb.m147479J(arrayListM147486Q)) {
            Iterator it = arrayListM147486Q.iterator();
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
        return m116628w9(jSONObject.toString()).map(new qcj() { // from class: l.agb
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(!zHasIdealInfo);
            }
        }).doOnNext(new y20() { // from class: l.bgb
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f76578a.m116522V8((Boolean) obj);
            }
        });
    }

    /* JADX INFO: renamed from: u7, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final List<BreakIce> m116591n8(Envelope envelope, List<String> list) {
        if (envelope.meta.code != 200) {
            return null;
        }
        if (NullChecker.m82486a(envelope.getModuleData(CoreData.class)) && !jyb.m147479J(((CoreData) envelope.getModuleData(CoreData.class)).iceBreakings)) {
            return ((CoreData) envelope.getModuleData(CoreData.class)).iceBreakings;
        }
        if (jyb.m147479J(list)) {
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
    public final /* synthetic */ C22421c m116619u8() {
        return qi20.m176654a(new pcj() { // from class: l.phb
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4879a.f20236P.auth().m209043q(C4879a.m32203G("/my-tab-task/list")).m209032f().m209028b();
            }
        }).map(new qcj() { // from class: l.qhb
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f157525a.m116615t8((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: u9 */
    public C22421c<uxj0> m116620u9(User user) {
        return m116624v9(user, null);
    }

    /* JADX INFO: renamed from: ua */
    public void m116621ua() {
        this.f89293n7.put(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: v7 */
    public C22421c<LoveLetterContent> m116622v7(final String str) {
        return this.f89102Q.scheduled("getLoveLetterMsgContent" + str, 0, new pcj() { // from class: l.zdb
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return qi20.m176654a(new pcj() { // from class: l.kfb
                    @Override // p153l.pcj, java.util.concurrent.Callable
                    public final Object call() {
                        return C4879a.f20236P.auth().m209043q(C4879a.m32203G("/love_letter/card/" + str)).m209032f().m209028b();
                    }
                }).map(new qcj() { // from class: l.lfb
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return ((CoreData) ((Envelope) obj).getModuleData(CoreData.class)).loveLetterContent;
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: v8 */
    public final /* synthetic */ uxj0 m116623v8(Envelope envelope) {
        List<MyTabTask> list = ((CoreData) envelope.getModuleData(CoreData.class)).myTabTasks;
        if (jyb.m147479J(list) || TextUtils.isEmpty(list.get(0).title)) {
            this.f89261j7.m137019l(MyTabTask.new_());
        } else {
            this.f89261j7.m137019l(list.get(0));
        }
        return uxj0.f181467a;
    }

    /* JADX INFO: renamed from: v9 */
    public C22421c<uxj0> m116624v9(User user, String str) {
        if (user == null) {
            return C22421c.just(uxj0.f181467a);
        }
        if (NullChecker.m82486a(user.profile) && !jyb.m147479J(user.profile.answers) && TextUtils.isEmpty(user.profile.answers.get(0).question) && TextUtils.isEmpty(user.profile.answers.get(0).value)) {
            CrashHelper.m82479c(new Exception("user question 异常问题"));
        }
        if (NullChecker.m82486a(user.profile) && NullChecker.m82486a(user.profile.extensions) && NullChecker.m82486a(user.profile.extensions.game) && !jyb.m147479J(user.profile.extensions.game.screenshot) && user.profile.extensions.game.screenshot.size() > 3) {
            CrashHelper.m82479c(new RuntimeException("game screenshot error：" + user.profile.extensions.game.screenshot.size()));
        }
        return m116632x9(user.toJson(), str);
    }

    /* JADX INFO: renamed from: va */
    public void m116625va(int i) {
        this.f89126T.put(Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: w7 */
    public C22421c<MatchInfo> m116626w7() {
        return this.f89102Q.scheduled("matchInfo/", 0, new pcj() { // from class: l.tib
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return new ti20(new pcj() { // from class: l.tcb
                    @Override // p153l.pcj, java.util.concurrent.Callable
                    public final Object call() {
                        return C4879a.f20236P.auth().m209043q(C4879a.m32216J0("/matchInfo")).m209032f().m209028b();
                    }
                }).map(new qcj() { // from class: l.vcb
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return ((CoreData) ((Envelope) obj).getModuleData(CoreData.class)).todayMatchInfo;
                    }
                }).compose(C4879a.m32255T2());
            }
        });
    }

    /* JADX INFO: renamed from: w8 */
    public final /* synthetic */ C22421c m116627w8() {
        return qi20.m176654a(new pcj() { // from class: l.ljb
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4879a.f20236P.auth().m209043q(C4879a.m32203G("/my-tab-task/list?scene=avatar")).m209032f().m209028b();
            }
        }).map(new qcj() { // from class: l.mjb
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f137067a.m116623v8((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: w9 */
    public C22421c<uxj0> m116628w9(String str) {
        return m116632x9(str, null);
    }

    /* JADX INFO: renamed from: wa */
    public C22421c<uxj0> m116629wa() {
        return this.f89205c7;
    }

    /* JADX INFO: renamed from: x7 */
    public void m116630x7() {
        final String strUserId = CoreModule.m30929H().userId();
        final String str = "/" + strUserId + "/literatures";
        CoreModule.f18264c.now(str, qi20.m176658e(new pcj() { // from class: l.vgb
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4879a.f20236P.auth().m209043q(C4879a.m32369w2(str)).m209032f().m209028b();
            }
        })).observeOn(fo0.m126432a()).subscribe(psd0.m173597H(new y20() { // from class: l.wgb
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f188927a.m116607r8(strUserId, (Envelope) obj);
            }
        }, new y20() { // from class: l.xgb
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f194166a.m116611s8(strUserId, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: x8 */
    public final /* synthetic */ uxj0 m116631x8(Envelope envelope) {
        List<MyTabTask> list = ((CoreData) envelope.getModuleData(CoreData.class)).myTabTasks;
        if (jyb.m147479J(list) || TextUtils.isEmpty(list.get(0).title)) {
            this.f89269k7.m137019l(MyTabTask.new_());
        } else {
            this.f89269k7.m137019l(list.get(0));
        }
        return uxj0.f181467a;
    }

    /* JADX INFO: renamed from: x9 */
    public C22421c<uxj0> m116632x9(final String str, final String str2) {
        return this.f89102Q.scheduled("patch user" + str2, -1, new pcj() { // from class: l.vib
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f184224a.m116473I8(str, str2);
            }
        });
    }

    /* JADX INFO: renamed from: xa */
    public C22421c<FakeGuideData> m116633xa() {
        return this.f89102Q.scheduled("antispam/guide-change-avatar", 0, new pcj() { // from class: l.xhb
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f194290a.m116530X8();
            }
        });
    }

    @NonNull
    /* JADX INFO: renamed from: y7 */
    public String m116634y7(String str) {
        Map<String, GPMemo> mapM116496O7;
        GPMemo gPMemo;
        return (TextUtils.isEmpty(str) || (mapM116496O7 = m116496O7()) == null || mapM116496O7.isEmpty() || (gPMemo = mapM116496O7.get(str)) == null || TextUtils.isEmpty(gPMemo.memo)) ? "" : gPMemo.memo;
    }

    /* JADX INFO: renamed from: y8 */
    public final /* synthetic */ C22421c m116635y8() {
        return qi20.m176654a(new pcj() { // from class: l.xjb
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4879a.f20236P.auth().m209043q(C4879a.m32203G("/my-tab-task/list?scene=editInformation")).m209032f().m209028b();
            }
        }).map(new qcj() { // from class: l.yjb
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f200283a.m116631x8((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: y9 */
    public C22421c<SettingGroups> m116636y9(UserPrivacySettings userPrivacySettings) {
        SettingGroups settingGroups = new SettingGroups();
        settingGroups.privacy = userPrivacySettings;
        final UserSettingPatch userSettingPatch = new UserSettingPatch();
        userSettingPatch.settingGroups = settingGroups;
        userSettingPatch.type = "default";
        return m116504Q7(new pcj() { // from class: l.tfb
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4879a.f20236P.auth().m209043q(C4879a.m32340p1()).m209038l(z1d0.create(Network.JSON, userSettingPatch.toJson())).m209028b();
            }
        }, -1, "path_privacy_settings");
    }

    /* JADX INFO: renamed from: ya */
    public C22421c<uxj0> m116637ya(final AppealPostData appealPostData, final List<Media> list) {
        pcj pcjVar = new pcj() { // from class: l.ndb
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C22421c.fromCallable(new Callable() { // from class: l.mfb
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return dkb.m116400q3(list, appealPostData);
                    }
                });
            }
        };
        final qcj qcjVar = new qcj() { // from class: l.odb
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return new i1y((List) obj, true).flatMap(new qcj() { // from class: l.yeb
                    @Override // p153l.qcj
                    public final Object call(Object obj2) {
                        return yb5.m214980I((List) obj2, "pic_verification");
                    }
                }).map(new qcj() { // from class: l.zeb
                    @Override // p153l.qcj
                    public final Object call(Object obj2) {
                        return dkb.m116293P3(appealPostData, (List) obj2);
                    }
                });
            }
        };
        return ((C22421c) pcjVar.call()).flatMap(new qcj() { // from class: l.rdb
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return dkb.m116406r5(qcjVar, list, (AppealPostData) obj);
            }
        }).compose(psd0.m173606Q()).flatMap(new qcj() { // from class: l.pdb
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f151727a.m116542a9(appealPostData, (AppealPostData) obj);
            }
        });
    }

    /* JADX INFO: renamed from: z7 */
    public boolean m116638z7() {
        return this.f89150W.m222761e().booleanValue();
    }

    /* JADX INFO: renamed from: z8 */
    public final /* synthetic */ void m116639z8(Envelope envelope) {
        jm5.f121641d.put(((CoreData) envelope.getModuleData(CoreData.class)).avatar);
        m116527W9(this.f88999B1);
    }

    /* JADX INFO: renamed from: z9 */
    public C22421c<SettingGroups> m116640z9(UserLiveSettings userLiveSettings) {
        SettingGroups settingGroups = new SettingGroups();
        settingGroups.live = userLiveSettings;
        final UserSettingPatch userSettingPatch = new UserSettingPatch();
        userSettingPatch.settingGroups = settingGroups;
        userSettingPatch.type = "default";
        return m116504Q7(new pcj() { // from class: l.rjb
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4879a.f20236P.auth().m209043q(C4879a.m32289c2()).m209037k(z1d0.create(Network.JSON, userSettingPatch.toJson())).m209028b();
            }
        }, -1, "patch_live_settings");
    }

    /* JADX INFO: renamed from: za */
    public C22421c<Boolean> m116641za(String str) {
        if (TextUtils.isEmpty(str)) {
            return C22421c.just(Boolean.FALSE);
        }
        final String str2 = "/users/" + this.f89102Q.f20381e0.m116600p9().f56859id + "/marriage-conversation/" + str;
        return this.f89102Q.scheduled(str2, -1, new pcj() { // from class: l.ihb
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f114883a.m116546b9(str2);
            }
        });
    }

    /* JADX INFO: renamed from: P7 */
    public final void m116500P7() {
    }
}
