package p149l;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.api.api.TantanException;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.core.api.CoreInnerPush;
import com.p046p1.mobile.putong.core.data.ChallengeMsg;
import com.p046p1.mobile.putong.core.data.ChallengeMsgList;
import com.p046p1.mobile.putong.core.data.ChatGiftInfoExtra;
import com.p046p1.mobile.putong.core.data.Conversation;
import com.p046p1.mobile.putong.core.data.CoreGiftInfo;
import com.p046p1.mobile.putong.core.data.CoreSendGiftBody;
import com.p046p1.mobile.putong.core.data.Literatures;
import com.p046p1.mobile.putong.core.data.Message;
import com.p046p1.mobile.putong.core.data.NewTags;
import com.p046p1.mobile.putong.core.data.Privilege;
import com.p046p1.mobile.putong.core.data.ProductCategory;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.data.WarmingUpEmoResConfig;
import com.p046p1.mobile.putong.core.data.WarmingUpResConfig;
import com.p046p1.mobile.putong.core.data.WechatNotifyConfig;
import com.p046p1.mobile.putong.core.p053ui.onlinematch.OnlineMatchPushUser;
import com.p046p1.mobile.putong.data.Gender;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.MessageLocation;
import com.p046p1.mobile.putong.data.NavigationIntent;
import com.p046p1.mobile.putong.data.Picture;
import com.p046p1.mobile.putong.data.ProfileZodiac;
import com.p046p1.mobile.putong.data.User;
import java.util.Collection;
import java.util.List;
import p133rx.C22306c;
import p133rx.subjects.C22393b;

/* JADX INFO: loaded from: classes9.dex */
public interface n87 {
    /* JADX INFO: renamed from: A */
    void mo158199A(Act act);

    /* JADX INFO: renamed from: A0 */
    void mo158200A0(boolean z);

    /* JADX INFO: renamed from: A1 */
    boolean mo158201A1();

    /* JADX INFO: renamed from: A3 */
    int mo158202A3(int i);

    /* JADX INFO: renamed from: A5 */
    Intent mo158203A5(Context context, String str, String str2, boolean z, boolean z2, boolean z3);

    /* JADX INFO: renamed from: B */
    boolean mo158204B();

    /* JADX INFO: renamed from: B0 */
    List<NewTags> mo158205B0(List<String> list);

    /* JADX INFO: renamed from: B1 */
    void mo158206B1(Act act, User user);

    /* JADX INFO: renamed from: B2 */
    boolean mo158207B2(Act act);

    /* JADX INFO: renamed from: B3 */
    void mo158208B3(String str);

    /* JADX INFO: renamed from: B4 */
    int mo158209B4();

    /* JADX INFO: renamed from: C */
    boolean mo158210C(int i);

    /* JADX INFO: renamed from: C0 */
    void mo158211C0();

    /* JADX INFO: renamed from: C1 */
    void mo158212C1(Act act, String str);

    /* JADX INFO: renamed from: C2 */
    boolean mo158213C2();

    /* JADX INFO: renamed from: C4 */
    boolean mo158214C4();

    /* JADX INFO: renamed from: C5 */
    void mo158215C5(boolean z);

    /* JADX INFO: renamed from: D */
    boolean mo158216D();

    /* JADX INFO: renamed from: D0 */
    void mo158217D0(String str, String str2);

    /* JADX INFO: renamed from: D1 */
    void mo158218D1(Act act);

    /* JADX INFO: renamed from: D2 */
    String mo158219D2();

    /* JADX INFO: renamed from: D3 */
    void mo158220D3(String str, String str2);

    /* JADX INFO: renamed from: D4 */
    void mo158221D4(Act act, User user, int i);

    /* JADX INFO: renamed from: E */
    boolean mo158222E();

    /* JADX INFO: renamed from: E0 */
    void mo158223E0();

    /* JADX INFO: renamed from: E1 */
    void mo158224E1(Context context);

    /* JADX INFO: renamed from: E2 */
    xaj0<String, String, String> mo158225E2(String str);

    /* JADX INFO: renamed from: E3 */
    boolean mo158226E3();

    /* JADX INFO: renamed from: E4 */
    void mo158227E4(Act act, User user, d30 d30Var);

    /* JADX INFO: renamed from: F */
    boolean mo158228F();

    /* JADX INFO: renamed from: F1 */
    void mo158229F1(String str);

    /* JADX INFO: renamed from: F3 */
    void mo158230F3(Act act);

    /* JADX INFO: renamed from: F5 */
    boolean mo158231F5();

    /* JADX INFO: renamed from: G0 */
    boolean mo158232G0();

    /* JADX INFO: renamed from: G1 */
    boolean mo158233G1();

    /* JADX INFO: renamed from: G3 */
    String mo158234G3(int i);

    /* JADX INFO: renamed from: G4 */
    void mo158235G4();

    /* JADX INFO: renamed from: G5 */
    void mo158236G5(Act act);

    /* JADX INFO: renamed from: H */
    int mo158237H();

    /* JADX INFO: renamed from: H1 */
    void mo158238H1();

    /* JADX INFO: renamed from: H2 */
    void mo158239H2();

    /* JADX INFO: renamed from: H3 */
    C22306c<Integer> mo158240H3(String str);

    /* JADX INFO: renamed from: H4 */
    boolean mo158241H4();

    /* JADX INFO: renamed from: H5 */
    void mo158242H5(Context context, String str, String str2, String str3);

    /* JADX INFO: renamed from: I0 */
    boolean mo158243I0();

    /* JADX INFO: renamed from: I1 */
    boolean mo158244I1(User user);

    /* JADX INFO: renamed from: I2 */
    boolean mo158245I2(int i);

    /* JADX INFO: renamed from: I3 */
    void mo158246I3(String str);

    /* JADX INFO: renamed from: J */
    boolean mo158247J();

    /* JADX INFO: renamed from: J0 */
    void mo158248J0(Act act);

    /* JADX INFO: renamed from: J1 */
    boolean mo158249J1();

    /* JADX INFO: renamed from: J2 */
    boolean mo158250J2();

    /* JADX INFO: renamed from: J3 */
    void mo158251J3(boolean z, boolean z2, User user, Act act, Menu menu, String str, d30 d30Var, String str2);

    /* JADX INFO: renamed from: J4 */
    void mo158252J4(Act act, Message message, Media media);

    /* JADX INFO: renamed from: J5 */
    void mo158253J5(Act act, d30 d30Var);

    /* JADX INFO: renamed from: K */
    String mo158254K();

    /* JADX INFO: renamed from: K0 */
    void mo158255K0();

    /* JADX INFO: renamed from: K1 */
    String mo158256K1(String str);

    /* JADX INFO: renamed from: K2 */
    ChatGiftInfoExtra mo158257K2(Message message);

    /* JADX INFO: renamed from: K3 */
    void mo158258K3(Intent intent);

    /* JADX INFO: renamed from: K5 */
    int mo158259K5();

    /* JADX INFO: renamed from: L */
    void mo158260L(String str);

    /* JADX INFO: renamed from: L1 */
    boolean mo158261L1(TantanException.Client.TantanForbidden tantanForbidden);

    /* JADX INFO: renamed from: L2 */
    void mo158262L2(Menu menu, String str, Act act, boolean z, boolean z2, String str2, d30 d30Var, d30 d30Var2, boolean z3, boolean z4, String str3);

    /* JADX INFO: renamed from: L3 */
    void mo158263L3();

    /* JADX INFO: renamed from: L4 */
    void mo158264L4(Act act, int i);

    /* JADX INFO: renamed from: L5 */
    boolean mo158265L5();

    /* JADX INFO: renamed from: Lg */
    boolean mo36049Lg();

    /* JADX INFO: renamed from: M */
    boolean mo158266M();

    /* JADX INFO: renamed from: M0 */
    CharSequence mo158267M0(Message message, Conversation conversation);

    /* JADX INFO: renamed from: M1 */
    Intent mo158268M1(Context context, String str, String str2, boolean z);

    /* JADX INFO: renamed from: M3 */
    Intent mo158269M3(Context context, String str);

    /* JADX INFO: renamed from: M4 */
    boolean mo158270M4();

    /* JADX INFO: renamed from: M5 */
    List<knb0<String, Runnable, Integer, Void>> mo158271M5(Act act, Media media, Message message);

    /* JADX INFO: renamed from: N */
    boolean mo158272N();

    /* JADX INFO: renamed from: N0 */
    int mo158273N0();

    /* JADX INFO: renamed from: N1 */
    void mo158274N1(Act act, d30 d30Var, boolean z);

    /* JADX INFO: renamed from: N2 */
    int mo158275N2();

    /* JADX INFO: renamed from: N3 */
    boolean mo158276N3();

    /* JADX INFO: renamed from: N4 */
    List<NewTags> mo158277N4();

    /* JADX INFO: renamed from: N5 */
    void mo158278N5(String str);

    /* JADX INFO: renamed from: O2 */
    boolean mo158279O2();

    /* JADX INFO: renamed from: O3 */
    void mo158280O3(Act act, String str, g30<PurchaseType, Act, String> g30Var, d30 d30Var);

    /* JADX INFO: renamed from: O4 */
    void mo158281O4();

    /* JADX INFO: renamed from: O5 */
    Privilege mo158282O5(String str);

    /* JADX INFO: renamed from: P */
    void mo158283P();

    /* JADX INFO: renamed from: P0 */
    boolean mo158284P0();

    /* JADX INFO: renamed from: P2 */
    Intent mo158285P2(Context context, String str);

    /* JADX INFO: renamed from: P5 */
    String mo158286P5(Message message);

    /* JADX INFO: renamed from: Q */
    boolean mo158287Q();

    /* JADX INFO: renamed from: Q0 */
    int mo158288Q0();

    /* JADX INFO: renamed from: Q1 */
    String mo158289Q1(String str);

    /* JADX INFO: renamed from: Q3 */
    void mo158290Q3(Act act, User user, d30 d30Var, String str);

    /* JADX INFO: renamed from: Q4 */
    boolean mo158291Q4(String str);

    /* JADX INFO: renamed from: Q5 */
    void mo158292Q5(String str);

    /* JADX INFO: renamed from: R */
    boolean mo158293R();

    /* JADX INFO: renamed from: R1 */
    void mo158294R1();

    /* JADX INFO: renamed from: R2 */
    boolean mo158295R2(String str);

    /* JADX INFO: renamed from: R4 */
    boolean mo158296R4();

    /* JADX INFO: renamed from: R5 */
    int mo158297R5();

    /* JADX INFO: renamed from: R7 */
    void mo36050R7(String str, String str2);

    /* JADX INFO: renamed from: S */
    void mo158298S();

    /* JADX INFO: renamed from: S0 */
    boolean mo158299S0();

    /* JADX INFO: renamed from: S1 */
    int mo158300S1();

    /* JADX INFO: renamed from: S2 */
    void mo158301S2(Act act, Runnable runnable);

    /* JADX INFO: renamed from: S3 */
    void mo158302S3(Act act);

    /* JADX INFO: renamed from: S4 */
    void mo158303S4(boolean z);

    /* JADX INFO: renamed from: S5 */
    void mo158304S5(boolean z);

    /* JADX INFO: renamed from: T */
    void mo158305T();

    /* JADX INFO: renamed from: T0 */
    int mo158306T0();

    /* JADX INFO: renamed from: T1 */
    boolean mo158307T1(String str);

    /* JADX INFO: renamed from: T2 */
    void mo158308T2(Act act);

    /* JADX INFO: renamed from: T4 */
    int mo158309T4();

    /* JADX INFO: renamed from: T5 */
    boolean mo158310T5(String str);

    /* JADX INFO: renamed from: U0 */
    int mo158311U0();

    /* JADX INFO: renamed from: U1 */
    boolean mo158312U1(d30 d30Var, Activity activity);

    /* JADX INFO: renamed from: U2 */
    C22306c<PurchaseType> mo158313U2();

    /* JADX INFO: renamed from: U3 */
    boolean mo158314U3();

    /* JADX INFO: renamed from: U5 */
    boolean mo158315U5(Act act, d30 d30Var);

    /* JADX INFO: renamed from: V */
    void mo158316V(Act act, User user, d30 d30Var);

    /* JADX INFO: renamed from: V0 */
    boolean mo158317V0();

    /* JADX INFO: renamed from: V1 */
    void mo158318V1(Context context, String str, String str2);

    /* JADX INFO: renamed from: V2 */
    void mo158319V2(Act act, Message message);

    /* JADX INFO: renamed from: V3 */
    NewTags mo158320V3(String str);

    /* JADX INFO: renamed from: V4 */
    int mo158321V4();

    /* JADX INFO: renamed from: V5 */
    void mo158322V5(String str);

    /* JADX INFO: renamed from: W */
    long mo158323W(User user);

    /* JADX INFO: renamed from: W0 */
    void mo158324W0(Act act, OnlineMatchPushUser onlineMatchPushUser, boolean z, d30 d30Var, boolean z2, String str, boolean z3, e30<Boolean> e30Var);

    /* JADX INFO: renamed from: W1 */
    WarmingUpResConfig mo158325W1();

    /* JADX INFO: renamed from: W3 */
    String mo158326W3(String str);

    /* JADX INFO: renamed from: W4 */
    void mo158327W4(Act act, String str);

    /* JADX INFO: renamed from: W5 */
    void mo158328W5(boolean z, Menu menu, String str, Act act);

    /* JADX INFO: renamed from: X */
    boolean mo158329X();

    /* JADX INFO: renamed from: X0 */
    void mo158330X0(TextView textView, Gender gender, int i, boolean z, User user);

    /* JADX INFO: renamed from: X1 */
    void mo158331X1(String str);

    /* JADX INFO: renamed from: X2 */
    void mo158332X2(String str);

    /* JADX INFO: renamed from: X3 */
    WechatNotifyConfig mo158333X3();

    /* JADX INFO: renamed from: Y */
    void mo158334Y(Activity activity, Uri uri);

    /* JADX INFO: renamed from: Y0 */
    boolean mo158335Y0(String str);

    /* JADX INFO: renamed from: Y2 */
    void mo158336Y2();

    /* JADX INFO: renamed from: Y5 */
    void mo158337Y5(Act act, String str, String str2);

    /* JADX INFO: renamed from: Z */
    void mo158338Z(Act act, String str, long j);

    /* JADX INFO: renamed from: Z0 */
    boolean mo158339Z0();

    /* JADX INFO: renamed from: Z1 */
    C22306c<Boolean> mo158340Z1();

    /* JADX INFO: renamed from: Z2 */
    void mo158341Z2(Act act, boolean z);

    /* JADX INFO: renamed from: Z4 */
    boolean mo158342Z4(Act act, String str);

    /* JADX INFO: renamed from: a0 */
    void mo158343a0(Act act, String str, boolean z);

    /* JADX INFO: renamed from: a1 */
    boolean mo158344a1();

    /* JADX INFO: renamed from: a2 */
    boolean mo158345a2();

    /* JADX INFO: renamed from: a4 */
    void mo158346a4(Act act, String str, String str2);

    /* JADX INFO: renamed from: a5 */
    boolean mo158347a5();

    /* JADX INFO: renamed from: b */
    boolean mo158348b();

    /* JADX INFO: renamed from: b0 */
    boolean mo158349b0(User user);

    /* JADX INFO: renamed from: b1 */
    String mo158350b1(ProductCategory productCategory);

    /* JADX INFO: renamed from: b2 */
    void mo158351b2(CoreInnerPush.C4716a c4716a);

    /* JADX INFO: renamed from: b4 */
    boolean mo158352b4();

    /* JADX INFO: renamed from: b5 */
    boolean mo158353b5();

    /* JADX INFO: renamed from: c */
    boolean mo158354c();

    /* JADX INFO: renamed from: c0 */
    boolean mo158355c0(String str, String str2);

    /* JADX INFO: renamed from: c1 */
    void mo158356c1(Act act, Menu menu, String str);

    /* JADX INFO: renamed from: c3 */
    void mo158357c3(int i);

    /* JADX INFO: renamed from: c4 */
    boolean mo158358c4(Conversation conversation);

    /* JADX INFO: renamed from: c5 */
    String mo158359c5(String str);

    /* JADX INFO: renamed from: d */
    void mo158360d(Throwable th);

    /* JADX INFO: renamed from: d0 */
    void mo158361d0(String str);

    /* JADX INFO: renamed from: d1 */
    void mo158362d1(Act act);

    /* JADX INFO: renamed from: d3 */
    boolean mo158363d3();

    /* JADX INFO: renamed from: d5 */
    void mo158364d5(Act act, String str, String str2, String str3);

    /* JADX INFO: renamed from: e */
    boolean mo158365e();

    /* JADX INFO: renamed from: e0 */
    void mo158366e0(Act act, Message message);

    /* JADX INFO: renamed from: e1 */
    boolean mo158367e1(String str, String str2);

    /* JADX INFO: renamed from: e3 */
    void mo158368e3(String str);

    /* JADX INFO: renamed from: e4 */
    boolean mo158369e4();

    /* JADX INFO: renamed from: e5 */
    void mo158370e5(Act act, PurchaseType purchaseType, d30 d30Var, d30 d30Var2);

    /* JADX INFO: renamed from: f */
    boolean mo158371f();

    /* JADX INFO: renamed from: f0 */
    String mo158372f0(double d);

    /* JADX INFO: renamed from: f1 */
    Intent mo158373f1(Context context, MessageLocation messageLocation);

    /* JADX INFO: renamed from: f2 */
    void mo158374f2(Act act);

    /* JADX INFO: renamed from: f3 */
    int mo158375f3();

    /* JADX INFO: renamed from: f4 */
    boolean mo158376f4();

    /* JADX INFO: renamed from: f5 */
    Intent mo158377f5(Context context);

    /* JADX INFO: renamed from: g */
    boolean mo158378g();

    /* JADX INFO: renamed from: g0 */
    int mo158379g0();

    /* JADX INFO: renamed from: g1 */
    boolean mo158380g1();

    /* JADX INFO: renamed from: g2 */
    C22393b<roj0> mo158381g2();

    /* JADX INFO: renamed from: g3 */
    String mo158382g3(String str);

    Intent getMainWithNav(Context context, NavigationIntent navigationIntent);

    /* JADX INFO: renamed from: h */
    String mo158383h();

    /* JADX INFO: renamed from: h0 */
    boolean mo158384h0();

    /* JADX INFO: renamed from: h1 */
    boolean mo158385h1();

    /* JADX INFO: renamed from: h2 */
    boolean mo158386h2(RecyclerView recyclerView);

    /* JADX INFO: renamed from: h3 */
    boolean mo158387h3();

    /* JADX INFO: renamed from: h4 */
    void mo158388h4(Act act, String str, String str2, String str3, String str4);

    /* JADX INFO: renamed from: i */
    boolean mo158389i();

    /* JADX INFO: renamed from: i1 */
    int mo158390i1(String str);

    /* JADX INFO: renamed from: i2 */
    boolean mo158391i2(Throwable th);

    /* JADX INFO: renamed from: i3 */
    String mo158392i3(ProfileZodiac profileZodiac);

    /* JADX INFO: renamed from: i4 */
    void mo158393i4(String str);

    /* JADX INFO: renamed from: j */
    boolean mo158394j();

    /* JADX INFO: renamed from: j1 */
    Intent mo158395j1(Act act, String str, ResultReceiver resultReceiver);

    /* JADX INFO: renamed from: j2 */
    int mo158396j2();

    /* JADX INFO: renamed from: j4 */
    void mo158397j4(Act act, Message message, CoreGiftInfo coreGiftInfo, String str);

    /* JADX INFO: renamed from: j5 */
    boolean mo158398j5(Conversation conversation);

    /* JADX INFO: renamed from: k0 */
    boolean mo158399k0();

    /* JADX INFO: renamed from: k1 */
    boolean mo158400k1();

    /* JADX INFO: renamed from: k3 */
    boolean mo158401k3();

    /* JADX INFO: renamed from: k5 */
    boolean mo158402k5();

    /* JADX INFO: renamed from: l */
    boolean mo158403l();

    /* JADX INFO: renamed from: l0 */
    boolean mo158404l0();

    /* JADX INFO: renamed from: l2 */
    int mo158405l2();

    /* JADX INFO: renamed from: l4 */
    boolean mo158406l4(String str, String str2);

    /* JADX INFO: renamed from: m */
    String mo158407m(List<String> list, List<String> list2);

    /* JADX INFO: renamed from: m0 */
    WarmingUpEmoResConfig mo158408m0();

    /* JADX INFO: renamed from: m1 */
    String mo158409m1();

    /* JADX INFO: renamed from: m4 */
    void mo158410m4(Menu menu, String str, Act act, d30 d30Var);

    /* JADX INFO: renamed from: m5 */
    int mo158411m5();

    /* JADX INFO: renamed from: n0 */
    String mo158412n0(boolean z);

    /* JADX INFO: renamed from: n1 */
    void mo158413n1(Act act, Message message, Media media);

    /* JADX INFO: renamed from: n2 */
    BottomSheetDialog mo158414n2(Act act, String str, String str2, String str3, int i, String str4, String str5, String str6, List<String> list, String str7, f30<String, String> f30Var);

    /* JADX INFO: renamed from: n3 */
    String mo158415n3(boolean z);

    /* JADX INFO: renamed from: n4 */
    void mo158416n4(Act act, String str);

    /* JADX INFO: renamed from: n5 */
    boolean mo158417n5();

    /* JADX INFO: renamed from: o */
    boolean mo158418o();

    /* JADX INFO: renamed from: o0 */
    boolean mo158419o0();

    /* JADX INFO: renamed from: o1 */
    boolean mo158420o1(String str);

    /* JADX INFO: renamed from: o2 */
    void mo158421o2();

    /* JADX INFO: renamed from: o3 */
    void mo158422o3(Act act, String str, d30 d30Var, String str2);

    /* JADX INFO: renamed from: o4 */
    boolean mo158423o4(Conversation conversation);

    /* JADX INFO: renamed from: o5 */
    boolean mo158424o5();

    /* JADX INFO: renamed from: p */
    boolean mo158425p();

    /* JADX INFO: renamed from: p1 */
    boolean mo158426p1();

    /* JADX INFO: renamed from: p2 */
    void mo158427p2();

    /* JADX INFO: renamed from: p3 */
    boolean mo158428p3(String str);

    /* JADX INFO: renamed from: p4 */
    boolean mo158429p4();

    /* JADX INFO: renamed from: p5 */
    boolean mo158430p5();

    /* JADX INFO: renamed from: q */
    boolean mo158431q();

    /* JADX INFO: renamed from: q1 */
    boolean mo158432q1();

    /* JADX INFO: renamed from: q2 */
    tpd0 mo158433q2();

    /* JADX INFO: renamed from: q3 */
    void mo158434q3(PutongAct putongAct, CoreSendGiftBody coreSendGiftBody, e30<Boolean> e30Var, w9j<Throwable, Boolean> w9jVar);

    /* JADX INFO: renamed from: q5 */
    String mo158435q5(Literatures literatures);

    /* JADX INFO: renamed from: r0 */
    void mo158436r0(String str);

    /* JADX INFO: renamed from: r1 */
    void mo158437r1(Menu menu, String str, Act act, boolean z, boolean z2, String str2, d30 d30Var, d30 d30Var2, String str3);

    /* JADX INFO: renamed from: r2 */
    void mo158438r2(String str, String str2);

    /* JADX INFO: renamed from: r3 */
    boolean mo158439r3(String str, String str2);

    /* JADX INFO: renamed from: r4 */
    void mo158440r4(String str);

    /* JADX INFO: renamed from: r5 */
    j760<Integer, Integer> mo158441r5(int i);

    /* JADX INFO: renamed from: s1 */
    void mo158442s1(String str);

    /* JADX INFO: renamed from: s4 */
    boolean mo158443s4();

    /* JADX INFO: renamed from: s5 */
    boolean mo158444s5();

    void showProofAgeDlg(Act act, String str);

    /* JADX INFO: renamed from: t */
    boolean mo158445t();

    /* JADX INFO: renamed from: t0 */
    boolean mo158446t0();

    /* JADX INFO: renamed from: t1 */
    boolean mo158447t1();

    /* JADX INFO: renamed from: t3 */
    Collection<Integer> mo158448t3();

    /* JADX INFO: renamed from: t4 */
    boolean mo158449t4(Act act);

    /* JADX INFO: renamed from: u */
    boolean mo158450u();

    /* JADX INFO: renamed from: u1 */
    void mo158451u1(String str);

    /* JADX INFO: renamed from: u2 */
    void mo158452u2(String str, boolean z);

    /* JADX INFO: renamed from: u3 */
    void mo158453u3(int i);

    /* JADX INFO: renamed from: v */
    boolean mo158454v();

    /* JADX INFO: renamed from: v1 */
    boolean mo158455v1();

    /* JADX INFO: renamed from: v2 */
    String mo158456v2();

    /* JADX INFO: renamed from: v3 */
    Intent mo158457v3(Context context, String str);

    /* JADX INFO: renamed from: v5 */
    boolean mo158458v5();

    /* JADX INFO: renamed from: w0 */
    void mo158459w0(String str, String str2, boolean z);

    /* JADX INFO: renamed from: w1 */
    void mo158460w1(knb0<String, Integer, Integer, Integer> knb0Var);

    /* JADX INFO: renamed from: w2 */
    boolean mo158461w2();

    /* JADX INFO: renamed from: w3 */
    Drawable mo158462w3(Context context, String str);

    /* JADX INFO: renamed from: w4 */
    boolean mo158463w4();

    /* JADX INFO: renamed from: w5 */
    Intent mo158464w5(Context context, String str, String str2, boolean z, boolean z2);

    /* JADX INFO: renamed from: x */
    boolean mo158465x();

    /* JADX INFO: renamed from: x0 */
    void mo158466x0(String str, String str2);

    /* JADX INFO: renamed from: x1 */
    void mo158467x1(Act act, User user, String str, d30 d30Var, boolean z);

    /* JADX INFO: renamed from: x2 */
    boolean mo158468x2();

    /* JADX INFO: renamed from: x4 */
    String mo158469x4(String str);

    /* JADX INFO: renamed from: x5 */
    void mo158470x5(boolean z);

    /* JADX INFO: renamed from: y */
    boolean mo158471y();

    /* JADX INFO: renamed from: y0 */
    int mo158472y0();

    /* JADX INFO: renamed from: y1 */
    boolean mo158473y1();

    /* JADX INFO: renamed from: y2 */
    void mo158474y2(SimpleDraweeView simpleDraweeView, Picture.ImageUri imageUri, int i);

    /* JADX INFO: renamed from: y3 */
    void mo158475y3(Act act, String str);

    /* JADX INFO: renamed from: y4 */
    void mo158476y4(Act act, String str, Privilege privilege);

    /* JADX INFO: renamed from: y5 */
    ChallengeMsg mo158477y5(ChallengeMsgList challengeMsgList, Message message);

    /* JADX INFO: renamed from: z */
    boolean mo158478z(String str);

    /* JADX INFO: renamed from: z0 */
    boolean mo158479z0();

    /* JADX INFO: renamed from: z2 */
    void mo158480z2();

    /* JADX INFO: renamed from: z3 */
    int mo158481z3(Throwable th);

    /* JADX INFO: renamed from: z4 */
    void mo158482z4(String str);
}
