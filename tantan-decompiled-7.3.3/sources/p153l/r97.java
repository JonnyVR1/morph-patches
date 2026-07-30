package p153l;

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
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.api.api.TantanException;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.core.api.CoreInnerPush;
import com.p051p1.mobile.putong.core.data.ChallengeMsg;
import com.p051p1.mobile.putong.core.data.ChallengeMsgList;
import com.p051p1.mobile.putong.core.data.ChatGiftInfoExtra;
import com.p051p1.mobile.putong.core.data.Conversation;
import com.p051p1.mobile.putong.core.data.CoreGiftInfo;
import com.p051p1.mobile.putong.core.data.CoreSendGiftBody;
import com.p051p1.mobile.putong.core.data.Literatures;
import com.p051p1.mobile.putong.core.data.Message;
import com.p051p1.mobile.putong.core.data.NewTags;
import com.p051p1.mobile.putong.core.data.Privilege;
import com.p051p1.mobile.putong.core.data.ProductCategory;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.data.WarmingUpEmoResConfig;
import com.p051p1.mobile.putong.core.data.WarmingUpResConfig;
import com.p051p1.mobile.putong.core.data.WechatNotifyConfig;
import com.p051p1.mobile.putong.core.p058ui.onlinematch.OnlineMatchPushUser;
import com.p051p1.mobile.putong.data.Gender;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.MessageLocation;
import com.p051p1.mobile.putong.data.NavigationIntent;
import com.p051p1.mobile.putong.data.Picture;
import com.p051p1.mobile.putong.data.ProfileZodiac;
import com.p051p1.mobile.putong.data.User;
import java.util.Collection;
import java.util.List;
import p137rx.C22421c;
import p137rx.subjects.C22508b;

/* JADX INFO: loaded from: classes9.dex */
public interface r97 {
    /* JADX INFO: renamed from: A */
    void mo180291A(Act act);

    /* JADX INFO: renamed from: A0 */
    void mo180292A0(boolean z);

    /* JADX INFO: renamed from: A1 */
    boolean mo180293A1();

    /* JADX INFO: renamed from: A3 */
    int mo180294A3(int i);

    /* JADX INFO: renamed from: A5 */
    Intent mo180295A5(Context context, String str, String str2, boolean z, boolean z2, boolean z3);

    /* JADX INFO: renamed from: B */
    boolean mo180296B();

    /* JADX INFO: renamed from: B0 */
    List<NewTags> mo180297B0(List<String> list);

    /* JADX INFO: renamed from: B1 */
    void mo180298B1(Act act, User user);

    /* JADX INFO: renamed from: B2 */
    boolean mo180299B2(Act act);

    /* JADX INFO: renamed from: B3 */
    void mo180300B3(String str);

    /* JADX INFO: renamed from: B4 */
    int mo180301B4();

    /* JADX INFO: renamed from: C */
    boolean mo180302C(int i);

    /* JADX INFO: renamed from: C0 */
    void mo180303C0();

    /* JADX INFO: renamed from: C1 */
    void mo180304C1(Act act, String str);

    /* JADX INFO: renamed from: C2 */
    boolean mo180305C2();

    /* JADX INFO: renamed from: C4 */
    boolean mo180306C4();

    /* JADX INFO: renamed from: C5 */
    void mo180307C5(boolean z);

    /* JADX INFO: renamed from: D */
    boolean mo180308D();

    /* JADX INFO: renamed from: D0 */
    void mo180309D0(String str, String str2);

    /* JADX INFO: renamed from: D1 */
    void mo180310D1(Act act);

    /* JADX INFO: renamed from: D2 */
    String mo180311D2();

    /* JADX INFO: renamed from: D3 */
    void mo180312D3(String str, String str2);

    /* JADX INFO: renamed from: D4 */
    void mo180313D4(Act act, User user, int i);

    /* JADX INFO: renamed from: E */
    boolean mo180314E();

    /* JADX INFO: renamed from: E0 */
    void mo180315E0();

    /* JADX INFO: renamed from: E1 */
    void mo180316E1(Context context);

    /* JADX INFO: renamed from: E2 */
    bkj0<String, String, String> mo180317E2(String str);

    /* JADX INFO: renamed from: E3 */
    boolean mo180318E3();

    /* JADX INFO: renamed from: E4 */
    void mo180319E4(Act act, User user, x20 x20Var);

    /* JADX INFO: renamed from: F */
    boolean mo180320F();

    /* JADX INFO: renamed from: F1 */
    void mo180321F1(String str);

    /* JADX INFO: renamed from: F3 */
    void mo180322F3(Act act);

    /* JADX INFO: renamed from: F5 */
    boolean mo180323F5();

    /* JADX INFO: renamed from: G0 */
    boolean mo180324G0();

    /* JADX INFO: renamed from: G1 */
    boolean mo180325G1();

    /* JADX INFO: renamed from: G3 */
    String mo180326G3(int i);

    /* JADX INFO: renamed from: G4 */
    void mo180327G4();

    /* JADX INFO: renamed from: G5 */
    void mo180328G5(Act act);

    /* JADX INFO: renamed from: H */
    int mo180329H();

    /* JADX INFO: renamed from: H1 */
    void mo180330H1();

    /* JADX INFO: renamed from: H2 */
    void mo180331H2();

    /* JADX INFO: renamed from: H3 */
    C22421c<Integer> mo180332H3(String str);

    /* JADX INFO: renamed from: H4 */
    boolean mo180333H4();

    /* JADX INFO: renamed from: H5 */
    void mo180334H5(Context context, String str, String str2, String str3);

    /* JADX INFO: renamed from: I0 */
    boolean mo180335I0();

    /* JADX INFO: renamed from: I1 */
    boolean mo180336I1(User user);

    /* JADX INFO: renamed from: I2 */
    boolean mo180337I2(int i);

    /* JADX INFO: renamed from: I3 */
    void mo180338I3(String str);

    /* JADX INFO: renamed from: J */
    boolean mo180339J();

    /* JADX INFO: renamed from: J0 */
    void mo180340J0(Act act);

    /* JADX INFO: renamed from: J1 */
    boolean mo180341J1();

    /* JADX INFO: renamed from: J2 */
    boolean mo180342J2();

    /* JADX INFO: renamed from: J3 */
    void mo180343J3(boolean z, boolean z2, User user, Act act, Menu menu, String str, x20 x20Var, String str2);

    /* JADX INFO: renamed from: J4 */
    void mo180344J4(Act act, Message message, Media media);

    /* JADX INFO: renamed from: J5 */
    void mo180345J5(Act act, x20 x20Var);

    /* JADX INFO: renamed from: K */
    String mo180346K();

    /* JADX INFO: renamed from: K0 */
    void mo180347K0();

    /* JADX INFO: renamed from: K1 */
    String mo180348K1(String str);

    /* JADX INFO: renamed from: K2 */
    ChatGiftInfoExtra mo180349K2(Message message);

    /* JADX INFO: renamed from: K3 */
    void mo180350K3(Intent intent);

    /* JADX INFO: renamed from: K5 */
    int mo180351K5();

    /* JADX INFO: renamed from: L */
    void mo180352L(String str);

    /* JADX INFO: renamed from: L1 */
    boolean mo180353L1(TantanException.Client.TantanForbidden tantanForbidden);

    /* JADX INFO: renamed from: L2 */
    void mo180354L2(Menu menu, String str, Act act, boolean z, boolean z2, String str2, x20 x20Var, x20 x20Var2, boolean z3, boolean z4, String str3);

    /* JADX INFO: renamed from: L3 */
    void mo180355L3();

    /* JADX INFO: renamed from: L4 */
    void mo180356L4(Act act, int i);

    /* JADX INFO: renamed from: L5 */
    boolean mo180357L5();

    /* JADX INFO: renamed from: Lg */
    boolean mo37052Lg();

    /* JADX INFO: renamed from: M */
    boolean mo180358M();

    /* JADX INFO: renamed from: M0 */
    CharSequence mo180359M0(Message message, Conversation conversation);

    /* JADX INFO: renamed from: M1 */
    Intent mo180360M1(Context context, String str, String str2, boolean z);

    /* JADX INFO: renamed from: M3 */
    Intent mo180361M3(Context context, String str);

    /* JADX INFO: renamed from: M4 */
    boolean mo180362M4();

    /* JADX INFO: renamed from: M5 */
    List<ovb0<String, Runnable, Integer, Void>> mo180363M5(Act act, Media media, Message message);

    /* JADX INFO: renamed from: N */
    boolean mo180364N();

    /* JADX INFO: renamed from: N0 */
    int mo180365N0();

    /* JADX INFO: renamed from: N1 */
    void mo180366N1(Act act, x20 x20Var, boolean z);

    /* JADX INFO: renamed from: N2 */
    int mo180367N2();

    /* JADX INFO: renamed from: N3 */
    boolean mo180368N3();

    /* JADX INFO: renamed from: N4 */
    List<NewTags> mo180369N4();

    /* JADX INFO: renamed from: N5 */
    void mo180370N5(String str);

    /* JADX INFO: renamed from: O2 */
    boolean mo180371O2();

    /* JADX INFO: renamed from: O3 */
    void mo180372O3(Act act, String str, a30<PurchaseType, Act, String> a30Var, x20 x20Var);

    /* JADX INFO: renamed from: O4 */
    void mo180373O4();

    /* JADX INFO: renamed from: O5 */
    Privilege mo180374O5(String str);

    /* JADX INFO: renamed from: P */
    void mo180375P();

    /* JADX INFO: renamed from: P0 */
    boolean mo180376P0();

    /* JADX INFO: renamed from: P2 */
    Intent mo180377P2(Context context, String str);

    /* JADX INFO: renamed from: P5 */
    String mo180378P5(Message message);

    /* JADX INFO: renamed from: Q */
    boolean mo180379Q();

    /* JADX INFO: renamed from: Q0 */
    int mo180380Q0();

    /* JADX INFO: renamed from: Q1 */
    String mo180381Q1(String str);

    /* JADX INFO: renamed from: Q3 */
    void mo180382Q3(Act act, User user, x20 x20Var, String str);

    /* JADX INFO: renamed from: Q4 */
    boolean mo180383Q4(String str);

    /* JADX INFO: renamed from: Q5 */
    void mo180384Q5(String str);

    /* JADX INFO: renamed from: R */
    boolean mo180385R();

    /* JADX INFO: renamed from: R1 */
    void mo180386R1();

    /* JADX INFO: renamed from: R2 */
    boolean mo180387R2(String str);

    /* JADX INFO: renamed from: R4 */
    boolean mo180388R4();

    /* JADX INFO: renamed from: R5 */
    int mo180389R5();

    /* JADX INFO: renamed from: R7 */
    void mo37053R7(String str, String str2);

    /* JADX INFO: renamed from: S */
    void mo180390S();

    /* JADX INFO: renamed from: S0 */
    boolean mo180391S0();

    /* JADX INFO: renamed from: S1 */
    int mo180392S1();

    /* JADX INFO: renamed from: S2 */
    void mo180393S2(Act act, Runnable runnable);

    /* JADX INFO: renamed from: S3 */
    void mo180394S3(Act act);

    /* JADX INFO: renamed from: S4 */
    void mo180395S4(boolean z);

    /* JADX INFO: renamed from: S5 */
    void mo180396S5(boolean z);

    /* JADX INFO: renamed from: T */
    void mo180397T();

    /* JADX INFO: renamed from: T0 */
    int mo180398T0();

    /* JADX INFO: renamed from: T1 */
    boolean mo180399T1(String str);

    /* JADX INFO: renamed from: T2 */
    void mo180400T2(Act act);

    /* JADX INFO: renamed from: T4 */
    int mo180401T4();

    /* JADX INFO: renamed from: T5 */
    boolean mo180402T5(String str);

    /* JADX INFO: renamed from: U0 */
    int mo180403U0();

    /* JADX INFO: renamed from: U1 */
    boolean mo180404U1(x20 x20Var, Activity activity);

    /* JADX INFO: renamed from: U2 */
    C22421c<PurchaseType> mo180405U2();

    /* JADX INFO: renamed from: U3 */
    boolean mo180406U3();

    /* JADX INFO: renamed from: U5 */
    boolean mo180407U5(Act act, x20 x20Var);

    /* JADX INFO: renamed from: V */
    void mo180408V(Act act, User user, x20 x20Var);

    /* JADX INFO: renamed from: V0 */
    boolean mo180409V0();

    /* JADX INFO: renamed from: V1 */
    void mo180410V1(Context context, String str, String str2);

    /* JADX INFO: renamed from: V2 */
    void mo180411V2(Act act, Message message);

    /* JADX INFO: renamed from: V3 */
    NewTags mo180412V3(String str);

    /* JADX INFO: renamed from: V4 */
    int mo180413V4();

    /* JADX INFO: renamed from: V5 */
    void mo180414V5(String str);

    /* JADX INFO: renamed from: W */
    long mo180415W(User user);

    /* JADX INFO: renamed from: W0 */
    void mo180416W0(Act act, OnlineMatchPushUser onlineMatchPushUser, boolean z, x20 x20Var, boolean z2, String str, boolean z3, y20<Boolean> y20Var);

    /* JADX INFO: renamed from: W1 */
    WarmingUpResConfig mo180417W1();

    /* JADX INFO: renamed from: W3 */
    String mo180418W3(String str);

    /* JADX INFO: renamed from: W4 */
    void mo180419W4(Act act, String str);

    /* JADX INFO: renamed from: W5 */
    void mo180420W5(boolean z, Menu menu, String str, Act act);

    /* JADX INFO: renamed from: X */
    boolean mo180421X();

    /* JADX INFO: renamed from: X0 */
    void mo180422X0(TextView textView, Gender gender, int i, boolean z, User user);

    /* JADX INFO: renamed from: X1 */
    void mo180423X1(String str);

    /* JADX INFO: renamed from: X2 */
    void mo180424X2(String str);

    /* JADX INFO: renamed from: X3 */
    WechatNotifyConfig mo180425X3();

    /* JADX INFO: renamed from: Y */
    void mo180426Y(Activity activity, Uri uri);

    /* JADX INFO: renamed from: Y0 */
    boolean mo180427Y0(String str);

    /* JADX INFO: renamed from: Y2 */
    void mo180428Y2();

    /* JADX INFO: renamed from: Y5 */
    void mo180429Y5(Act act, String str, String str2);

    /* JADX INFO: renamed from: Z */
    void mo180430Z(Act act, String str, long j);

    /* JADX INFO: renamed from: Z0 */
    boolean mo180431Z0();

    /* JADX INFO: renamed from: Z1 */
    C22421c<Boolean> mo180432Z1();

    /* JADX INFO: renamed from: Z2 */
    void mo180433Z2(Act act, boolean z);

    /* JADX INFO: renamed from: Z4 */
    boolean mo180434Z4(Act act, String str);

    /* JADX INFO: renamed from: a0 */
    void mo180435a0(Act act, String str, boolean z);

    /* JADX INFO: renamed from: a1 */
    boolean mo180436a1();

    /* JADX INFO: renamed from: a2 */
    boolean mo180437a2();

    /* JADX INFO: renamed from: a4 */
    void mo180438a4(Act act, String str, String str2);

    /* JADX INFO: renamed from: a5 */
    boolean mo180439a5();

    /* JADX INFO: renamed from: b */
    boolean mo180440b();

    /* JADX INFO: renamed from: b0 */
    boolean mo180441b0(User user);

    /* JADX INFO: renamed from: b1 */
    String mo180442b1(ProductCategory productCategory);

    /* JADX INFO: renamed from: b2 */
    void mo180443b2(CoreInnerPush.C4867a c4867a);

    /* JADX INFO: renamed from: b4 */
    boolean mo180444b4();

    /* JADX INFO: renamed from: b5 */
    boolean mo180445b5();

    /* JADX INFO: renamed from: c */
    boolean mo180446c();

    /* JADX INFO: renamed from: c0 */
    boolean mo180447c0(String str, String str2);

    /* JADX INFO: renamed from: c1 */
    void mo180448c1(Act act, Menu menu, String str);

    /* JADX INFO: renamed from: c3 */
    void mo180449c3(int i);

    /* JADX INFO: renamed from: c4 */
    boolean mo180450c4(Conversation conversation);

    /* JADX INFO: renamed from: c5 */
    String mo180451c5(String str);

    /* JADX INFO: renamed from: d */
    void mo180452d(Throwable th);

    /* JADX INFO: renamed from: d0 */
    void mo180453d0(String str);

    /* JADX INFO: renamed from: d1 */
    void mo180454d1(Act act);

    /* JADX INFO: renamed from: d3 */
    boolean mo180455d3();

    /* JADX INFO: renamed from: d5 */
    void mo180456d5(Act act, String str, String str2, String str3);

    /* JADX INFO: renamed from: e */
    boolean mo180457e();

    /* JADX INFO: renamed from: e0 */
    void mo180458e0(Act act, Message message);

    /* JADX INFO: renamed from: e1 */
    boolean mo180459e1(String str, String str2);

    /* JADX INFO: renamed from: e3 */
    void mo180460e3(String str);

    /* JADX INFO: renamed from: e4 */
    boolean mo180461e4();

    /* JADX INFO: renamed from: e5 */
    void mo180462e5(Act act, PurchaseType purchaseType, x20 x20Var, x20 x20Var2);

    /* JADX INFO: renamed from: f */
    boolean mo180463f();

    /* JADX INFO: renamed from: f0 */
    String mo180464f0(double d);

    /* JADX INFO: renamed from: f1 */
    Intent mo180465f1(Context context, MessageLocation messageLocation);

    /* JADX INFO: renamed from: f2 */
    void mo180466f2(Act act);

    /* JADX INFO: renamed from: f3 */
    int mo180467f3();

    /* JADX INFO: renamed from: f4 */
    boolean mo180468f4();

    /* JADX INFO: renamed from: f5 */
    Intent mo180469f5(Context context);

    /* JADX INFO: renamed from: g */
    boolean mo180470g();

    /* JADX INFO: renamed from: g0 */
    int mo180471g0();

    /* JADX INFO: renamed from: g1 */
    boolean mo180472g1();

    /* JADX INFO: renamed from: g2 */
    C22508b<uxj0> mo180473g2();

    /* JADX INFO: renamed from: g3 */
    String mo180474g3(String str);

    Intent getMainWithNav(Context context, NavigationIntent navigationIntent);

    /* JADX INFO: renamed from: h */
    String mo180475h();

    /* JADX INFO: renamed from: h0 */
    boolean mo180476h0();

    /* JADX INFO: renamed from: h1 */
    boolean mo180477h1();

    /* JADX INFO: renamed from: h2 */
    boolean mo180478h2(RecyclerView recyclerView);

    /* JADX INFO: renamed from: h3 */
    boolean mo180479h3();

    /* JADX INFO: renamed from: h4 */
    void mo180480h4(Act act, String str, String str2, String str3, String str4);

    /* JADX INFO: renamed from: i */
    boolean mo180481i();

    /* JADX INFO: renamed from: i1 */
    int mo180482i1(String str);

    /* JADX INFO: renamed from: i2 */
    boolean mo180483i2(Throwable th);

    /* JADX INFO: renamed from: i3 */
    String mo180484i3(ProfileZodiac profileZodiac);

    /* JADX INFO: renamed from: i4 */
    void mo180485i4(String str);

    /* JADX INFO: renamed from: j */
    boolean mo180486j();

    /* JADX INFO: renamed from: j1 */
    Intent mo180487j1(Act act, String str, ResultReceiver resultReceiver);

    /* JADX INFO: renamed from: j2 */
    int mo180488j2();

    /* JADX INFO: renamed from: j4 */
    void mo180489j4(Act act, Message message, CoreGiftInfo coreGiftInfo, String str);

    /* JADX INFO: renamed from: j5 */
    boolean mo180490j5(Conversation conversation);

    /* JADX INFO: renamed from: k0 */
    boolean mo180491k0();

    /* JADX INFO: renamed from: k1 */
    boolean mo180492k1();

    /* JADX INFO: renamed from: k3 */
    boolean mo180493k3();

    /* JADX INFO: renamed from: k5 */
    boolean mo180494k5();

    /* JADX INFO: renamed from: l */
    boolean mo180495l();

    /* JADX INFO: renamed from: l0 */
    boolean mo180496l0();

    /* JADX INFO: renamed from: l2 */
    int mo180497l2();

    /* JADX INFO: renamed from: l4 */
    boolean mo180498l4(String str, String str2);

    /* JADX INFO: renamed from: m */
    String mo180499m(List<String> list, List<String> list2);

    /* JADX INFO: renamed from: m0 */
    WarmingUpEmoResConfig mo180500m0();

    /* JADX INFO: renamed from: m1 */
    String mo180501m1();

    /* JADX INFO: renamed from: m4 */
    void mo180502m4(Menu menu, String str, Act act, x20 x20Var);

    /* JADX INFO: renamed from: m5 */
    int mo180503m5();

    /* JADX INFO: renamed from: n0 */
    String mo180504n0(boolean z);

    /* JADX INFO: renamed from: n1 */
    void mo180505n1(Act act, Message message, Media media);

    /* JADX INFO: renamed from: n2 */
    BottomSheetDialog mo180506n2(Act act, String str, String str2, String str3, int i, String str4, String str5, String str6, List<String> list, String str7, z20<String, String> z20Var);

    /* JADX INFO: renamed from: n3 */
    String mo180507n3(boolean z);

    /* JADX INFO: renamed from: n4 */
    void mo180508n4(Act act, String str);

    /* JADX INFO: renamed from: n5 */
    boolean mo180509n5();

    /* JADX INFO: renamed from: o */
    boolean mo180510o();

    /* JADX INFO: renamed from: o0 */
    boolean mo180511o0();

    /* JADX INFO: renamed from: o1 */
    boolean mo180512o1(String str);

    /* JADX INFO: renamed from: o2 */
    void mo180513o2();

    /* JADX INFO: renamed from: o3 */
    void mo180514o3(Act act, String str, x20 x20Var, String str2);

    /* JADX INFO: renamed from: o4 */
    boolean mo180515o4(Conversation conversation);

    /* JADX INFO: renamed from: o5 */
    boolean mo180516o5();

    /* JADX INFO: renamed from: p */
    boolean mo180517p();

    /* JADX INFO: renamed from: p1 */
    boolean mo180518p1();

    /* JADX INFO: renamed from: p2 */
    void mo180519p2();

    /* JADX INFO: renamed from: p3 */
    boolean mo180520p3(String str);

    /* JADX INFO: renamed from: p4 */
    boolean mo180521p4();

    /* JADX INFO: renamed from: p5 */
    boolean mo180522p5();

    /* JADX INFO: renamed from: q */
    boolean mo180523q();

    /* JADX INFO: renamed from: q1 */
    boolean mo180524q1();

    /* JADX INFO: renamed from: q2 */
    vxd0 mo180525q2();

    /* JADX INFO: renamed from: q3 */
    void mo180526q3(PutongAct putongAct, CoreSendGiftBody coreSendGiftBody, y20<Boolean> y20Var, qcj<Throwable, Boolean> qcjVar);

    /* JADX INFO: renamed from: q5 */
    String mo180527q5(Literatures literatures);

    /* JADX INFO: renamed from: r0 */
    void mo180528r0(String str);

    /* JADX INFO: renamed from: r1 */
    void mo180529r1(Menu menu, String str, Act act, boolean z, boolean z2, String str2, x20 x20Var, x20 x20Var2, String str3);

    /* JADX INFO: renamed from: r2 */
    void mo180530r2(String str, String str2);

    /* JADX INFO: renamed from: r3 */
    boolean mo180531r3(String str, String str2);

    /* JADX INFO: renamed from: r4 */
    void mo180532r4(String str);

    /* JADX INFO: renamed from: r5 */
    pf60<Integer, Integer> mo180533r5(int i);

    /* JADX INFO: renamed from: s1 */
    void mo180534s1(String str);

    /* JADX INFO: renamed from: s4 */
    boolean mo180535s4();

    /* JADX INFO: renamed from: s5 */
    boolean mo180536s5();

    void showProofAgeDlg(Act act, String str);

    /* JADX INFO: renamed from: t */
    boolean mo180537t();

    /* JADX INFO: renamed from: t0 */
    boolean mo180538t0();

    /* JADX INFO: renamed from: t1 */
    boolean mo180539t1();

    /* JADX INFO: renamed from: t3 */
    Collection<Integer> mo180540t3();

    /* JADX INFO: renamed from: t4 */
    boolean mo180541t4(Act act);

    /* JADX INFO: renamed from: u */
    boolean mo180542u();

    /* JADX INFO: renamed from: u1 */
    void mo180543u1(String str);

    /* JADX INFO: renamed from: u2 */
    void mo180544u2(String str, boolean z);

    /* JADX INFO: renamed from: u3 */
    void mo180545u3(int i);

    /* JADX INFO: renamed from: v */
    boolean mo180546v();

    /* JADX INFO: renamed from: v1 */
    boolean mo180547v1();

    /* JADX INFO: renamed from: v2 */
    String mo180548v2();

    /* JADX INFO: renamed from: v3 */
    Intent mo180549v3(Context context, String str);

    /* JADX INFO: renamed from: v5 */
    boolean mo180550v5();

    /* JADX INFO: renamed from: w0 */
    void mo180551w0(String str, String str2, boolean z);

    /* JADX INFO: renamed from: w1 */
    void mo180552w1(ovb0<String, Integer, Integer, Integer> ovb0Var);

    /* JADX INFO: renamed from: w2 */
    boolean mo180553w2();

    /* JADX INFO: renamed from: w3 */
    Drawable mo180554w3(Context context, String str);

    /* JADX INFO: renamed from: w4 */
    boolean mo180555w4();

    /* JADX INFO: renamed from: w5 */
    Intent mo180556w5(Context context, String str, String str2, boolean z, boolean z2);

    /* JADX INFO: renamed from: x */
    boolean mo180557x();

    /* JADX INFO: renamed from: x0 */
    void mo180558x0(String str, String str2);

    /* JADX INFO: renamed from: x1 */
    void mo180559x1(Act act, User user, String str, x20 x20Var, boolean z);

    /* JADX INFO: renamed from: x2 */
    boolean mo180560x2();

    /* JADX INFO: renamed from: x4 */
    String mo180561x4(String str);

    /* JADX INFO: renamed from: x5 */
    void mo180562x5(boolean z);

    /* JADX INFO: renamed from: y */
    boolean mo180563y();

    /* JADX INFO: renamed from: y0 */
    int mo180564y0();

    /* JADX INFO: renamed from: y1 */
    boolean mo180565y1();

    /* JADX INFO: renamed from: y2 */
    void mo180566y2(SimpleDraweeView simpleDraweeView, Picture.ImageUri imageUri, int i);

    /* JADX INFO: renamed from: y3 */
    void mo180567y3(Act act, String str);

    /* JADX INFO: renamed from: y4 */
    void mo180568y4(Act act, String str, Privilege privilege);

    /* JADX INFO: renamed from: y5 */
    ChallengeMsg mo180569y5(ChallengeMsgList challengeMsgList, Message message);

    /* JADX INFO: renamed from: z */
    boolean mo180570z(String str);

    /* JADX INFO: renamed from: z0 */
    boolean mo180571z0();

    /* JADX INFO: renamed from: z2 */
    void mo180572z2();

    /* JADX INFO: renamed from: z3 */
    int mo180573z3(Throwable th);

    /* JADX INFO: renamed from: z4 */
    void mo180574z4(String str);
}
