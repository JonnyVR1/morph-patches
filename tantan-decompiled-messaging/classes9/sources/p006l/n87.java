package p006l;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.ResultReceiver;
import android.view.Menu;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.drawee.view.SimpleDraweeView;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.p000p1.mobile.putong.api.api.TantanException;
import com.p000p1.mobile.putong.app.PutongAct;
import com.p000p1.mobile.putong.core.api.CoreInnerPush;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.data.ChallengeMsg;
import com.p1.mobile.putong.core.data.ChallengeMsgList;
import com.p1.mobile.putong.core.data.ChatGiftInfoExtra;
import com.p1.mobile.putong.core.data.Conversation;
import com.p1.mobile.putong.core.data.CoreGiftInfo;
import com.p1.mobile.putong.core.data.CoreSendGiftBody;
import com.p1.mobile.putong.core.data.Literatures;
import com.p1.mobile.putong.core.data.Message;
import com.p1.mobile.putong.core.data.NewTags;
import com.p1.mobile.putong.core.data.Privilege;
import com.p1.mobile.putong.core.data.ProductCategory;
import com.p1.mobile.putong.core.data.PurchaseType;
import com.p1.mobile.putong.core.data.WarmingUpEmoResConfig;
import com.p1.mobile.putong.core.data.WarmingUpResConfig;
import com.p1.mobile.putong.core.data.WechatNotifyConfig;
import com.p1.mobile.putong.core.ui.onlinematch.OnlineMatchPushUser;
import com.p1.mobile.putong.data.Gender;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.MessageLocation;
import com.p1.mobile.putong.data.NavigationIntent;
import com.p1.mobile.putong.data.Picture;
import com.p1.mobile.putong.data.ProfileZodiac;
import com.p1.mobile.putong.data.User;
import java.util.Collection;
import java.util.List;
import l.d30;
import l.e30;
import l.f30;
import l.g30;
import l.j760;
import l.knb0;
import l.roj0;
import l.tpd0;
import l.w9j;
import l.xaj0;
import rx.c;
import rx.subjects.b;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public interface n87 {
    /* JADX INFO: renamed from: A */
    void m19705A(Act act);

    /* JADX INFO: renamed from: A0 */
    void m19706A0(boolean z);

    /* JADX INFO: renamed from: A1 */
    boolean m19707A1();

    /* JADX INFO: renamed from: A3 */
    int m19708A3(int i);

    /* JADX INFO: renamed from: A5 */
    Intent m19709A5(Context context, String str, String str2, boolean z, boolean z2, boolean z3);

    /* JADX INFO: renamed from: B */
    boolean m19710B();

    /* JADX INFO: renamed from: B0 */
    List<NewTags> m19711B0(List<String> list);

    /* JADX INFO: renamed from: B1 */
    void m19712B1(Act act, User user);

    /* JADX INFO: renamed from: B2 */
    boolean m19713B2(Act act);

    /* JADX INFO: renamed from: B3 */
    void m19714B3(String str);

    /* JADX INFO: renamed from: B4 */
    int m19715B4();

    /* JADX INFO: renamed from: C */
    boolean m19716C(int i);

    /* JADX INFO: renamed from: C0 */
    void m19717C0();

    /* JADX INFO: renamed from: C1 */
    void m19718C1(Act act, String str);

    /* JADX INFO: renamed from: C2 */
    boolean m19719C2();

    /* JADX INFO: renamed from: C4 */
    boolean m19720C4();

    /* JADX INFO: renamed from: C5 */
    void m19721C5(boolean z);

    /* JADX INFO: renamed from: D */
    boolean m19722D();

    /* JADX INFO: renamed from: D0 */
    void m19723D0(String str, String str2);

    /* JADX INFO: renamed from: D1 */
    void m19724D1(Act act);

    /* JADX INFO: renamed from: D2 */
    String m19725D2();

    /* JADX INFO: renamed from: D3 */
    void m19726D3(String str, String str2);

    /* JADX INFO: renamed from: D4 */
    void m19727D4(Act act, User user, int i);

    /* JADX INFO: renamed from: E */
    boolean m19728E();

    /* JADX INFO: renamed from: E0 */
    void m19729E0();

    /* JADX INFO: renamed from: E1 */
    void m19730E1(Context context);

    /* JADX INFO: renamed from: E2 */
    xaj0<String, String, String> m19731E2(String str);

    /* JADX INFO: renamed from: E3 */
    boolean m19732E3();

    /* JADX INFO: renamed from: E4 */
    void m19733E4(Act act, User user, d30 d30Var);

    /* JADX INFO: renamed from: F */
    boolean m19734F();

    /* JADX INFO: renamed from: F1 */
    void m19735F1(String str);

    /* JADX INFO: renamed from: F3 */
    void m19736F3(Act act);

    /* JADX INFO: renamed from: F5 */
    boolean m19737F5();

    /* JADX INFO: renamed from: G0 */
    boolean m19738G0();

    /* JADX INFO: renamed from: G1 */
    boolean m19739G1();

    /* JADX INFO: renamed from: G3 */
    String m19740G3(int i);

    /* JADX INFO: renamed from: G4 */
    void m19741G4();

    /* JADX INFO: renamed from: G5 */
    void m19742G5(Act act);

    /* JADX INFO: renamed from: H */
    int m19743H();

    /* JADX INFO: renamed from: H1 */
    void m19744H1();

    /* JADX INFO: renamed from: H2 */
    void m19745H2();

    /* JADX INFO: renamed from: H3 */
    c<Integer> m19746H3(String str);

    /* JADX INFO: renamed from: H4 */
    boolean m19747H4();

    /* JADX INFO: renamed from: H5 */
    void m19748H5(Context context, String str, String str2, String str3);

    /* JADX INFO: renamed from: I0 */
    boolean m19749I0();

    /* JADX INFO: renamed from: I1 */
    boolean m19750I1(User user);

    /* JADX INFO: renamed from: I2 */
    boolean m19751I2(int i);

    /* JADX INFO: renamed from: I3 */
    void m19752I3(String str);

    /* JADX INFO: renamed from: J */
    boolean m19753J();

    /* JADX INFO: renamed from: J0 */
    void m19754J0(Act act);

    /* JADX INFO: renamed from: J1 */
    boolean m19755J1();

    /* JADX INFO: renamed from: J2 */
    boolean m19756J2();

    /* JADX INFO: renamed from: J3 */
    void m19757J3(boolean z, boolean z2, User user, Act act, Menu menu, String str, d30 d30Var, String str2);

    /* JADX INFO: renamed from: J4 */
    void m19758J4(Act act, Message message, Media media);

    /* JADX INFO: renamed from: J5 */
    void m19759J5(Act act, d30 d30Var);

    /* JADX INFO: renamed from: K */
    String m19760K();

    /* JADX INFO: renamed from: K0 */
    void m19761K0();

    /* JADX INFO: renamed from: K1 */
    String m19762K1(String str);

    /* JADX INFO: renamed from: K2 */
    ChatGiftInfoExtra m19763K2(Message message);

    /* JADX INFO: renamed from: K3 */
    void m19764K3(Intent intent);

    /* JADX INFO: renamed from: K5 */
    int m19765K5();

    /* JADX INFO: renamed from: L */
    void m19766L(String str);

    /* JADX INFO: renamed from: L1 */
    boolean m19767L1(TantanException.Client.TantanForbidden tantanForbidden);

    /* JADX INFO: renamed from: L2 */
    void m19768L2(Menu menu, String str, Act act, boolean z, boolean z2, String str2, d30 d30Var, d30 d30Var2, boolean z3, boolean z4, String str3);

    /* JADX INFO: renamed from: L3 */
    void m19769L3();

    /* JADX INFO: renamed from: L4 */
    void m19770L4(Act act, int i);

    /* JADX INFO: renamed from: L5 */
    boolean m19771L5();

    /* JADX INFO: renamed from: Lg */
    boolean m19772Lg();

    /* JADX INFO: renamed from: M */
    boolean m19773M();

    /* JADX INFO: renamed from: M0 */
    CharSequence m19774M0(Message message, Conversation conversation);

    /* JADX INFO: renamed from: M1 */
    Intent m19775M1(Context context, String str, String str2, boolean z);

    /* JADX INFO: renamed from: M3 */
    Intent m19776M3(Context context, String str);

    /* JADX INFO: renamed from: M4 */
    boolean m19777M4();

    /* JADX INFO: renamed from: M5 */
    List<knb0<String, Runnable, Integer, Void>> m19778M5(Act act, Media media, Message message);

    /* JADX INFO: renamed from: N */
    boolean m19779N();

    /* JADX INFO: renamed from: N0 */
    int m19780N0();

    /* JADX INFO: renamed from: N1 */
    void m19781N1(Act act, d30 d30Var, boolean z);

    /* JADX INFO: renamed from: N2 */
    int m19782N2();

    /* JADX INFO: renamed from: N3 */
    boolean m19783N3();

    /* JADX INFO: renamed from: N4 */
    List<NewTags> m19784N4();

    /* JADX INFO: renamed from: N5 */
    void m19785N5(String str);

    /* JADX INFO: renamed from: O2 */
    boolean m19786O2();

    /* JADX INFO: renamed from: O3 */
    void m19787O3(Act act, String str, g30<PurchaseType, Act, String> g30Var, d30 d30Var);

    /* JADX INFO: renamed from: O4 */
    void m19788O4();

    /* JADX INFO: renamed from: O5 */
    Privilege m19789O5(String str);

    /* JADX INFO: renamed from: P */
    void m19790P();

    /* JADX INFO: renamed from: P0 */
    boolean m19791P0();

    /* JADX INFO: renamed from: P2 */
    Intent m19792P2(Context context, String str);

    /* JADX INFO: renamed from: P5 */
    String m19793P5(Message message);

    /* JADX INFO: renamed from: Q */
    boolean m19794Q();

    /* JADX INFO: renamed from: Q0 */
    int m19795Q0();

    /* JADX INFO: renamed from: Q1 */
    String m19796Q1(String str);

    /* JADX INFO: renamed from: Q3 */
    void m19797Q3(Act act, User user, d30 d30Var, String str);

    /* JADX INFO: renamed from: Q4 */
    boolean m19798Q4(String str);

    /* JADX INFO: renamed from: Q5 */
    void m19799Q5(String str);

    /* JADX INFO: renamed from: R */
    boolean m19800R();

    /* JADX INFO: renamed from: R1 */
    void m19801R1();

    /* JADX INFO: renamed from: R2 */
    boolean m19802R2(String str);

    /* JADX INFO: renamed from: R4 */
    boolean m19803R4();

    /* JADX INFO: renamed from: R5 */
    int m19804R5();

    /* JADX INFO: renamed from: R7 */
    void m19805R7(String str, String str2);

    /* JADX INFO: renamed from: S */
    void m19806S();

    /* JADX INFO: renamed from: S0 */
    boolean m19807S0();

    /* JADX INFO: renamed from: S1 */
    int m19808S1();

    /* JADX INFO: renamed from: S2 */
    void m19809S2(Act act, Runnable runnable);

    /* JADX INFO: renamed from: S3 */
    void m19810S3(Act act);

    /* JADX INFO: renamed from: S4 */
    void m19811S4(boolean z);

    /* JADX INFO: renamed from: S5 */
    void m19812S5(boolean z);

    /* JADX INFO: renamed from: T */
    void m19813T();

    /* JADX INFO: renamed from: T0 */
    int m19814T0();

    /* JADX INFO: renamed from: T1 */
    boolean m19815T1(String str);

    /* JADX INFO: renamed from: T2 */
    void m19816T2(Act act);

    /* JADX INFO: renamed from: T4 */
    int m19817T4();

    /* JADX INFO: renamed from: T5 */
    boolean m19818T5(String str);

    /* JADX INFO: renamed from: U0 */
    int m19819U0();

    /* JADX INFO: renamed from: U1 */
    boolean m19820U1(d30 d30Var, Activity activity);

    /* JADX INFO: renamed from: U2 */
    c<PurchaseType> m19821U2();

    /* JADX INFO: renamed from: U3 */
    boolean m19822U3();

    /* JADX INFO: renamed from: U5 */
    boolean m19823U5(Act act, d30 d30Var);

    /* JADX INFO: renamed from: V */
    void m19824V(Act act, User user, d30 d30Var);

    /* JADX INFO: renamed from: V0 */
    boolean m19825V0();

    /* JADX INFO: renamed from: V1 */
    void m19826V1(Context context, String str, String str2);

    /* JADX INFO: renamed from: V2 */
    void m19827V2(Act act, Message message);

    /* JADX INFO: renamed from: V3 */
    NewTags m19828V3(String str);

    /* JADX INFO: renamed from: V4 */
    int m19829V4();

    /* JADX INFO: renamed from: V5 */
    void m19830V5(String str);

    /* JADX INFO: renamed from: W */
    long m19831W(User user);

    /* JADX INFO: renamed from: W0 */
    void m19832W0(Act act, OnlineMatchPushUser onlineMatchPushUser, boolean z, d30 d30Var, boolean z2, String str, boolean z3, e30<Boolean> e30Var);

    /* JADX INFO: renamed from: W1 */
    WarmingUpResConfig m19833W1();

    /* JADX INFO: renamed from: W3 */
    String m19834W3(String str);

    /* JADX INFO: renamed from: W4 */
    void m19835W4(Act act, String str);

    /* JADX INFO: renamed from: W5 */
    void m19836W5(boolean z, Menu menu, String str, Act act);

    /* JADX INFO: renamed from: X */
    boolean m19837X();

    /* JADX INFO: renamed from: X0 */
    void m19838X0(TextView textView, Gender gender, int i, boolean z, User user);

    /* JADX INFO: renamed from: X1 */
    void m19839X1(String str);

    /* JADX INFO: renamed from: X2 */
    void m19840X2(String str);

    /* JADX INFO: renamed from: X3 */
    WechatNotifyConfig m19841X3();

    /* JADX INFO: renamed from: Y */
    void m19842Y(Activity activity, Uri uri);

    /* JADX INFO: renamed from: Y0 */
    boolean m19843Y0(String str);

    /* JADX INFO: renamed from: Y2 */
    void m19844Y2();

    /* JADX INFO: renamed from: Y5 */
    void m19845Y5(Act act, String str, String str2);

    /* JADX INFO: renamed from: Z */
    void m19846Z(Act act, String str, long j);

    /* JADX INFO: renamed from: Z0 */
    boolean m19847Z0();

    /* JADX INFO: renamed from: Z1 */
    c<Boolean> m19848Z1();

    /* JADX INFO: renamed from: Z2 */
    void m19849Z2(Act act, boolean z);

    /* JADX INFO: renamed from: Z4 */
    boolean m19850Z4(Act act, String str);

    /* JADX INFO: renamed from: a0 */
    void m19851a0(Act act, String str, boolean z);

    /* JADX INFO: renamed from: a1 */
    boolean m19852a1();

    /* JADX INFO: renamed from: a2 */
    boolean m19853a2();

    /* JADX INFO: renamed from: a4 */
    void m19854a4(Act act, String str, String str2);

    /* JADX INFO: renamed from: a5 */
    boolean m19855a5();

    /* JADX INFO: renamed from: b */
    boolean m19856b();

    /* JADX INFO: renamed from: b0 */
    boolean m19857b0(User user);

    /* JADX INFO: renamed from: b1 */
    String m19858b1(ProductCategory productCategory);

    /* JADX INFO: renamed from: b2 */
    void m19859b2(CoreInnerPush.C0142a c0142a);

    /* JADX INFO: renamed from: b4 */
    boolean m19860b4();

    /* JADX INFO: renamed from: b5 */
    boolean m19861b5();

    /* JADX INFO: renamed from: c */
    boolean m19862c();

    /* JADX INFO: renamed from: c0 */
    boolean m19863c0(String str, String str2);

    /* JADX INFO: renamed from: c1 */
    void m19864c1(Act act, Menu menu, String str);

    /* JADX INFO: renamed from: c3 */
    void m19865c3(int i);

    /* JADX INFO: renamed from: c4 */
    boolean m19866c4(Conversation conversation);

    /* JADX INFO: renamed from: c5 */
    String m19867c5(String str);

    /* JADX INFO: renamed from: d */
    void m19868d(Throwable th);

    /* JADX INFO: renamed from: d0 */
    void m19869d0(String str);

    /* JADX INFO: renamed from: d1 */
    void m19870d1(Act act);

    /* JADX INFO: renamed from: d3 */
    boolean m19871d3();

    /* JADX INFO: renamed from: d5 */
    void m19872d5(Act act, String str, String str2, String str3);

    /* JADX INFO: renamed from: e */
    boolean m19873e();

    /* JADX INFO: renamed from: e0 */
    void m19874e0(Act act, Message message);

    /* JADX INFO: renamed from: e1 */
    boolean m19875e1(String str, String str2);

    /* JADX INFO: renamed from: e3 */
    void m19876e3(String str);

    /* JADX INFO: renamed from: e4 */
    boolean m19877e4();

    /* JADX INFO: renamed from: e5 */
    void m19878e5(Act act, PurchaseType purchaseType, d30 d30Var, d30 d30Var2);

    /* JADX INFO: renamed from: f */
    boolean m19879f();

    /* JADX INFO: renamed from: f0 */
    String m19880f0(double d);

    /* JADX INFO: renamed from: f1 */
    Intent m19881f1(Context context, MessageLocation messageLocation);

    /* JADX INFO: renamed from: f2 */
    void m19882f2(Act act);

    /* JADX INFO: renamed from: f3 */
    int m19883f3();

    /* JADX INFO: renamed from: f4 */
    boolean m19884f4();

    /* JADX INFO: renamed from: f5 */
    Intent m19885f5(Context context);

    /* JADX INFO: renamed from: g */
    boolean m19886g();

    /* JADX INFO: renamed from: g0 */
    int m19887g0();

    /* JADX INFO: renamed from: g1 */
    boolean m19888g1();

    /* JADX INFO: renamed from: g2 */
    b<roj0> m19889g2();

    /* JADX INFO: renamed from: g3 */
    String m19890g3(String str);

    Intent getMainWithNav(Context context, NavigationIntent navigationIntent);

    /* JADX INFO: renamed from: h */
    String m19891h();

    /* JADX INFO: renamed from: h0 */
    boolean m19892h0();

    /* JADX INFO: renamed from: h1 */
    boolean m19893h1();

    /* JADX INFO: renamed from: h2 */
    boolean m19894h2(RecyclerView recyclerView);

    /* JADX INFO: renamed from: h3 */
    boolean m19895h3();

    /* JADX INFO: renamed from: h4 */
    void m19896h4(Act act, String str, String str2, String str3, String str4);

    /* JADX INFO: renamed from: i */
    boolean m19897i();

    /* JADX INFO: renamed from: i1 */
    int m19898i1(String str);

    /* JADX INFO: renamed from: i2 */
    boolean m19899i2(Throwable th);

    /* JADX INFO: renamed from: i3 */
    String m19900i3(ProfileZodiac profileZodiac);

    /* JADX INFO: renamed from: i4 */
    void m19901i4(String str);

    /* JADX INFO: renamed from: j */
    boolean m19902j();

    /* JADX INFO: renamed from: j1 */
    Intent m19903j1(Act act, String str, ResultReceiver resultReceiver);

    /* JADX INFO: renamed from: j2 */
    int m19904j2();

    /* JADX INFO: renamed from: j4 */
    void m19905j4(Act act, Message message, CoreGiftInfo coreGiftInfo, String str);

    /* JADX INFO: renamed from: j5 */
    boolean m19906j5(Conversation conversation);

    /* JADX INFO: renamed from: k0 */
    boolean m19907k0();

    /* JADX INFO: renamed from: k1 */
    boolean m19908k1();

    /* JADX INFO: renamed from: k3 */
    boolean m19909k3();

    /* JADX INFO: renamed from: k5 */
    boolean m19910k5();

    /* JADX INFO: renamed from: l */
    boolean m19911l();

    /* JADX INFO: renamed from: l0 */
    boolean m19912l0();

    /* JADX INFO: renamed from: l2 */
    int m19913l2();

    /* JADX INFO: renamed from: l4 */
    boolean m19914l4(String str, String str2);

    /* JADX INFO: renamed from: m */
    String m19915m(List<String> list, List<String> list2);

    /* JADX INFO: renamed from: m0 */
    WarmingUpEmoResConfig m19916m0();

    /* JADX INFO: renamed from: m1 */
    String m19917m1();

    /* JADX INFO: renamed from: m4 */
    void m19918m4(Menu menu, String str, Act act, d30 d30Var);

    /* JADX INFO: renamed from: m5 */
    int m19919m5();

    /* JADX INFO: renamed from: n0 */
    String m19920n0(boolean z);

    /* JADX INFO: renamed from: n1 */
    void m19921n1(Act act, Message message, Media media);

    /* JADX INFO: renamed from: n2 */
    BottomSheetDialog m19922n2(Act act, String str, String str2, String str3, int i, String str4, String str5, String str6, List<String> list, String str7, f30<String, String> f30Var);

    /* JADX INFO: renamed from: n3 */
    String m19923n3(boolean z);

    /* JADX INFO: renamed from: n4 */
    void m19924n4(Act act, String str);

    /* JADX INFO: renamed from: n5 */
    boolean m19925n5();

    /* JADX INFO: renamed from: o */
    boolean m19926o();

    /* JADX INFO: renamed from: o0 */
    boolean m19927o0();

    /* JADX INFO: renamed from: o1 */
    boolean m19928o1(String str);

    /* JADX INFO: renamed from: o2 */
    void m19929o2();

    /* JADX INFO: renamed from: o3 */
    void m19930o3(Act act, String str, d30 d30Var, String str2);

    /* JADX INFO: renamed from: o4 */
    boolean m19931o4(Conversation conversation);

    /* JADX INFO: renamed from: o5 */
    boolean m19932o5();

    /* JADX INFO: renamed from: p */
    boolean m19933p();

    /* JADX INFO: renamed from: p1 */
    boolean m19934p1();

    /* JADX INFO: renamed from: p2 */
    void m19935p2();

    /* JADX INFO: renamed from: p3 */
    boolean m19936p3(String str);

    /* JADX INFO: renamed from: p4 */
    boolean m19937p4();

    /* JADX INFO: renamed from: p5 */
    boolean m19938p5();

    /* JADX INFO: renamed from: q */
    boolean m19939q();

    /* JADX INFO: renamed from: q1 */
    boolean m19940q1();

    /* JADX INFO: renamed from: q2 */
    tpd0 m19941q2();

    /* JADX INFO: renamed from: q3 */
    void m19942q3(PutongAct putongAct, CoreSendGiftBody coreSendGiftBody, e30<Boolean> e30Var, w9j<Throwable, Boolean> w9jVar);

    /* JADX INFO: renamed from: q5 */
    String m19943q5(Literatures literatures);

    /* JADX INFO: renamed from: r0 */
    void m19944r0(String str);

    /* JADX INFO: renamed from: r1 */
    void m19945r1(Menu menu, String str, Act act, boolean z, boolean z2, String str2, d30 d30Var, d30 d30Var2, String str3);

    /* JADX INFO: renamed from: r2 */
    void m19946r2(String str, String str2);

    /* JADX INFO: renamed from: r3 */
    boolean m19947r3(String str, String str2);

    /* JADX INFO: renamed from: r4 */
    void m19948r4(String str);

    /* JADX INFO: renamed from: r5 */
    j760<Integer, Integer> m19949r5(int i);

    /* JADX INFO: renamed from: s1 */
    void m19950s1(String str);

    /* JADX INFO: renamed from: s4 */
    boolean m19951s4();

    /* JADX INFO: renamed from: s5 */
    boolean m19952s5();

    void showProofAgeDlg(Act act, String str);

    /* JADX INFO: renamed from: t */
    boolean m19953t();

    /* JADX INFO: renamed from: t0 */
    boolean m19954t0();

    /* JADX INFO: renamed from: t1 */
    boolean m19955t1();

    /* JADX INFO: renamed from: t3 */
    Collection<Integer> m19956t3();

    /* JADX INFO: renamed from: t4 */
    boolean m19957t4(Act act);

    /* JADX INFO: renamed from: u */
    boolean m19958u();

    /* JADX INFO: renamed from: u1 */
    void m19959u1(String str);

    /* JADX INFO: renamed from: u2 */
    void m19960u2(String str, boolean z);

    /* JADX INFO: renamed from: u3 */
    void m19961u3(int i);

    /* JADX INFO: renamed from: v */
    boolean m19962v();

    /* JADX INFO: renamed from: v1 */
    boolean m19963v1();

    /* JADX INFO: renamed from: v2 */
    String m19964v2();

    /* JADX INFO: renamed from: v3 */
    Intent m19965v3(Context context, String str);

    /* JADX INFO: renamed from: v5 */
    boolean m19966v5();

    /* JADX INFO: renamed from: w0 */
    void m19967w0(String str, String str2, boolean z);

    /* JADX INFO: renamed from: w1 */
    void m19968w1(knb0<String, Integer, Integer, Integer> knb0Var);

    /* JADX INFO: renamed from: w2 */
    boolean m19969w2();

    /* JADX INFO: renamed from: w3 */
    Drawable m19970w3(Context context, String str);

    /* JADX INFO: renamed from: w4 */
    boolean m19971w4();

    /* JADX INFO: renamed from: w5 */
    Intent m19972w5(Context context, String str, String str2, boolean z, boolean z2);

    /* JADX INFO: renamed from: x */
    boolean m19973x();

    /* JADX INFO: renamed from: x0 */
    void m19974x0(String str, String str2);

    /* JADX INFO: renamed from: x1 */
    void m19975x1(Act act, User user, String str, d30 d30Var, boolean z);

    /* JADX INFO: renamed from: x2 */
    boolean m19976x2();

    /* JADX INFO: renamed from: x4 */
    String m19977x4(String str);

    /* JADX INFO: renamed from: x5 */
    void m19978x5(boolean z);

    /* JADX INFO: renamed from: y */
    boolean m19979y();

    /* JADX INFO: renamed from: y0 */
    int m19980y0();

    /* JADX INFO: renamed from: y1 */
    boolean m19981y1();

    /* JADX INFO: renamed from: y2 */
    void m19982y2(SimpleDraweeView simpleDraweeView, Picture.ImageUri imageUri, int i);

    /* JADX INFO: renamed from: y3 */
    void m19983y3(Act act, String str);

    /* JADX INFO: renamed from: y4 */
    void m19984y4(Act act, String str, Privilege privilege);

    /* JADX INFO: renamed from: y5 */
    ChallengeMsg m19985y5(ChallengeMsgList challengeMsgList, Message message);

    /* JADX INFO: renamed from: z */
    boolean m19986z(String str);

    /* JADX INFO: renamed from: z0 */
    boolean m19987z0();

    /* JADX INFO: renamed from: z2 */
    void m19988z2();

    /* JADX INFO: renamed from: z3 */
    int m19989z3(Throwable th);

    /* JADX INFO: renamed from: z4 */
    void m19990z4(String str);
}
