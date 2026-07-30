package com.p046p1.mobile.putong.core.api.inject.provider;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.util.Pair;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.Frag;
import com.p046p1.mobile.putong.api.api.TantanException;
import com.p046p1.mobile.putong.app.C4699a;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.core.api.CoreInnerPush;
import com.p046p1.mobile.putong.core.api.CoreSuggested;
import com.p046p1.mobile.putong.core.data.AppealInfo;
import com.p046p1.mobile.putong.core.data.CategorySuggestions;
import com.p046p1.mobile.putong.core.data.Conversation;
import com.p046p1.mobile.putong.core.data.CoreGiftInfo;
import com.p046p1.mobile.putong.core.data.GPTopicCard;
import com.p046p1.mobile.putong.core.data.HeartbeatPushInfo;
import com.p046p1.mobile.putong.core.data.HometownSuggest;
import com.p046p1.mobile.putong.core.data.IPRegion;
import com.p046p1.mobile.putong.core.data.InsertConversationsList;
import com.p046p1.mobile.putong.core.data.Merchandise;
import com.p046p1.mobile.putong.core.data.Message;
import com.p046p1.mobile.putong.core.data.NewTags;
import com.p046p1.mobile.putong.core.data.Privilege;
import com.p046p1.mobile.putong.core.data.UrlTag;
import com.p046p1.mobile.putong.core.data.Voice;
import com.p046p1.mobile.putong.core.p053ui.profile.loop.base.LoopSelectFillData;
import com.p046p1.mobile.putong.data.CounterConversations;
import com.p046p1.mobile.putong.data.Envelope;
import com.p046p1.mobile.putong.data.Live;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.Picture;
import com.p046p1.mobile.putong.data.Profile;
import com.p046p1.mobile.putong.data.Purpose;
import com.p046p1.mobile.putong.data.QualificationType;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.android.injecter.facade.template.IProvider;
import com.tantanapp.common.data.ValueObject;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import p133rx.C22306c;
import p133rx.subjects.C22392a;
import p149l.d30;
import p149l.e30;
import p149l.mcr;
import p149l.uqd0;

/* JADX INFO: loaded from: classes9.dex */
public interface CoreProviderInterface extends IProvider {
    /* JADX INFO: renamed from: A */
    void mo33651A(Act act);

    /* JADX INFO: renamed from: A8 */
    void mo33652A8(Act act, String str, String str2, String str3);

    /* JADX INFO: renamed from: Aa */
    boolean mo33653Aa(TantanException.Client.TantanForbidden tantanForbidden);

    /* JADX INFO: renamed from: Ac */
    CharSequence mo33654Ac(Message message);

    /* JADX INFO: renamed from: Ae */
    boolean mo33655Ae(CoreSuggested.UserInfo userInfo);

    /* JADX INFO: renamed from: Aj */
    boolean mo33656Aj(Conversation conversation);

    /* JADX INFO: renamed from: As */
    boolean mo33657As();

    /* JADX INFO: renamed from: B */
    boolean mo33658B();

    /* JADX INFO: renamed from: B8 */
    uqd0 mo33659B8();

    /* JADX INFO: renamed from: Bf */
    void mo33660Bf(String str, HashMap<String, String> map, HashMap<String, IPRegion> map2);

    /* JADX INFO: renamed from: Bm */
    void mo33661Bm(AppealInfo appealInfo);

    /* JADX INFO: renamed from: Bo */
    void mo33662Bo(Act act);

    /* JADX INFO: renamed from: Bt */
    boolean mo33663Bt();

    /* JADX INFO: renamed from: C */
    boolean mo33664C(int i);

    /* JADX INFO: renamed from: Ce */
    boolean mo33665Ce(Activity activity);

    /* JADX INFO: renamed from: Cf */
    void mo33666Cf(List<UrlTag> list);

    /* JADX INFO: renamed from: Cn */
    boolean mo33667Cn();

    /* JADX INFO: renamed from: Cq */
    int mo33668Cq();

    /* JADX INFO: renamed from: Ct */
    boolean mo33669Ct(TantanException.Client.TantanForbidden tantanForbidden);

    /* JADX INFO: renamed from: D */
    boolean mo33670D();

    /* JADX INFO: renamed from: Db */
    void mo33671Db(boolean z);

    /* JADX INFO: renamed from: Df */
    boolean mo33672Df(User user);

    /* JADX INFO: renamed from: Dg */
    void mo33673Dg(String str);

    /* JADX INFO: renamed from: Di */
    Picture mo33674Di(User user);

    /* JADX INFO: renamed from: Dt */
    int mo33675Dt();

    /* JADX INFO: renamed from: E */
    boolean mo33676E();

    /* JADX INFO: renamed from: E7 */
    int mo33677E7(CounterConversations counterConversations);

    /* JADX INFO: renamed from: E8 */
    void mo33678E8(HashMap<String, Integer> map);

    /* JADX INFO: renamed from: Eg */
    void mo33679Eg(Act act);

    /* JADX INFO: renamed from: El */
    String mo33680El(int i);

    /* JADX INFO: renamed from: Er */
    boolean mo33681Er();

    /* JADX INFO: renamed from: F4 */
    boolean mo33682F4();

    /* JADX INFO: renamed from: F6 */
    boolean mo33683F6();

    /* JADX INFO: renamed from: F7 */
    boolean mo33684F7();

    /* JADX INFO: renamed from: Fa */
    void mo33685Fa(Act act, String str);

    /* JADX INFO: renamed from: Fk */
    void mo33686Fk();

    /* JADX INFO: renamed from: Fl */
    boolean mo33687Fl();

    /* JADX INFO: renamed from: G */
    C4699a mo33688G(PutongAct putongAct);

    /* JADX INFO: renamed from: Ga */
    void mo33689Ga(String str);

    /* JADX INFO: renamed from: Ge */
    Intent mo33690Ge(Act act);

    /* JADX INFO: renamed from: Gh */
    NewTags mo33691Gh(String str);

    /* JADX INFO: renamed from: Gi */
    boolean mo33692Gi();

    /* JADX INFO: renamed from: Gp */
    ArrayList<LoopSelectFillData> mo33693Gp(User user);

    /* JADX INFO: renamed from: H6 */
    boolean mo33694H6(Activity activity);

    /* JADX INFO: renamed from: Hb */
    void mo33695Hb(Act act, boolean z, String str, d30 d30Var);

    /* JADX INFO: renamed from: Hf */
    boolean mo33696Hf();

    /* JADX INFO: renamed from: Hg */
    boolean mo33697Hg();

    /* JADX INFO: renamed from: Hq */
    void mo33698Hq(String str, ValueObject valueObject, ValueObject valueObject2);

    /* JADX INFO: renamed from: I4 */
    boolean mo33699I4();

    /* JADX INFO: renamed from: I5 */
    boolean mo33700I5();

    /* JADX INFO: renamed from: Ih */
    int mo33701Ih();

    /* JADX INFO: renamed from: Ik */
    QualificationType mo33702Ik(String str);

    /* JADX INFO: renamed from: Ip */
    void mo33703Ip(Act act, boolean z, String str, String str2);

    /* JADX INFO: renamed from: Is */
    boolean mo33704Is();

    /* JADX INFO: renamed from: J8 */
    int mo33705J8();

    /* JADX INFO: renamed from: J9 */
    int mo33706J9();

    /* JADX INFO: renamed from: Jc */
    int mo33707Jc(Act act);

    /* JADX INFO: renamed from: Jd */
    String mo33708Jd();

    /* JADX INFO: renamed from: Je */
    boolean mo33709Je();

    /* JADX INFO: renamed from: Ji */
    boolean mo33710Ji(TantanException.Client.TantanForbidden tantanForbidden);

    /* JADX INFO: renamed from: Jk */
    void mo33711Jk(Act act, User user);

    /* JADX INFO: renamed from: Jo */
    void mo33712Jo(Act act, @Nullable d30 d30Var);

    /* JADX INFO: renamed from: K4 */
    boolean mo33713K4();

    /* JADX INFO: renamed from: Kl */
    boolean mo33714Kl();

    /* JADX INFO: renamed from: Kq */
    boolean mo33715Kq(User user);

    /* JADX INFO: renamed from: Lc */
    boolean mo33716Lc();

    /* JADX INFO: renamed from: Li */
    boolean mo33717Li();

    /* JADX INFO: renamed from: Ln */
    boolean mo33718Ln();

    /* JADX INFO: renamed from: Mg */
    int mo33719Mg();

    /* JADX INFO: renamed from: Mk */
    CategorySuggestions mo33720Mk();

    /* JADX INFO: renamed from: Mm */
    boolean mo33721Mm(Act act);

    /* JADX INFO: renamed from: Mo */
    boolean mo33722Mo();

    /* JADX INFO: renamed from: N6 */
    HometownSuggest mo33723N6();

    /* JADX INFO: renamed from: Na */
    boolean mo33724Na();

    /* JADX INFO: renamed from: Nb */
    String mo33725Nb(Profile profile);

    /* JADX INFO: renamed from: Nc */
    void mo33726Nc(String str);

    /* JADX INFO: renamed from: Nd */
    boolean mo33727Nd(Conversation conversation);

    /* JADX INFO: renamed from: Nl */
    boolean mo33728Nl(User user);

    /* JADX INFO: renamed from: Nq */
    void mo33729Nq(boolean z);

    /* JADX INFO: renamed from: O */
    boolean mo33730O();

    /* JADX INFO: renamed from: Oc */
    boolean mo33731Oc();

    /* JADX INFO: renamed from: Od */
    boolean mo33732Od();

    /* JADX INFO: renamed from: Oe */
    void mo33733Oe(Envelope envelope, String str, boolean z);

    /* JADX INFO: renamed from: Oi */
    boolean mo33734Oi();

    /* JADX INFO: renamed from: Oq */
    boolean mo33735Oq();

    /* JADX INFO: renamed from: Or */
    boolean mo33736Or();

    /* JADX INFO: renamed from: Os */
    List<String> mo33737Os(String str);

    /* JADX INFO: renamed from: Pa */
    void mo33738Pa(Context context);

    /* JADX INFO: renamed from: Pi */
    List<String> mo33739Pi(String str);

    /* JADX INFO: renamed from: Q6 */
    C22392a<List<Merchandise>> mo33740Q6();

    /* JADX INFO: renamed from: Qg */
    void mo33741Qg(Act act, boolean z, d30 d30Var);

    /* JADX INFO: renamed from: Qi */
    boolean mo33742Qi();

    /* JADX INFO: renamed from: Ql */
    boolean mo33743Ql(String str);

    /* JADX INFO: renamed from: Qq */
    boolean mo33744Qq();

    /* JADX INFO: renamed from: R8 */
    boolean mo33745R8();

    /* JADX INFO: renamed from: Rg */
    String mo33746Rg(String str, String str2);

    /* JADX INFO: renamed from: Rk */
    boolean mo33747Rk();

    /* JADX INFO: renamed from: Ro */
    int mo33748Ro();

    /* JADX INFO: renamed from: Rq */
    boolean mo33749Rq(Act act);

    /* JADX INFO: renamed from: Si */
    void mo33750Si(Act act);

    /* JADX INFO: renamed from: T8 */
    Pair<List<String>, List<String>> mo33751T8(String str);

    /* JADX INFO: renamed from: Te */
    boolean mo33752Te(TantanException.Client.TantanForbidden tantanForbidden);

    /* JADX INFO: renamed from: U */
    boolean mo33753U();

    /* JADX INFO: renamed from: U8 */
    void mo33754U8(Act act);

    /* JADX INFO: renamed from: U9 */
    boolean mo33755U9();

    /* JADX INFO: renamed from: Ua */
    boolean mo33756Ua();

    /* JADX INFO: renamed from: Uc */
    User mo33757Uc();

    /* JADX INFO: renamed from: Ud */
    void mo33758Ud(Act act);

    /* JADX INFO: renamed from: Uj */
    void mo33759Uj(Act act, e30<Media> e30Var);

    /* JADX INFO: renamed from: Ul */
    C22392a<InsertConversationsList> mo33760Ul();

    /* JADX INFO: renamed from: Uo */
    boolean mo33761Uo(String str);

    /* JADX INFO: renamed from: V6 */
    boolean mo33762V6();

    /* JADX INFO: renamed from: V8 */
    boolean mo33763V8(TantanException.Client.TantanForbidden tantanForbidden);

    /* JADX INFO: renamed from: Vb */
    boolean mo33764Vb();

    /* JADX INFO: renamed from: Vc */
    void mo33765Vc();

    /* JADX INFO: renamed from: Vd */
    boolean mo33766Vd();

    /* JADX INFO: renamed from: Ve */
    boolean mo33767Ve();

    /* JADX INFO: renamed from: Vi */
    void mo33768Vi(Act act, int i, Runnable runnable, Runnable runnable2, d30 d30Var);

    /* JADX INFO: renamed from: Vj */
    Intent mo33769Vj(Context context, String str);

    /* JADX INFO: renamed from: Vn */
    void mo33770Vn(mcr mcrVar, d30 d30Var);

    /* JADX INFO: renamed from: Vq */
    boolean mo33771Vq(String str);

    /* JADX INFO: renamed from: W7 */
    String mo33772W7();

    /* JADX INFO: renamed from: W8 */
    boolean mo33773W8();

    /* JADX INFO: renamed from: Wb */
    void mo33774Wb(Act act);

    /* JADX INFO: renamed from: Wc */
    boolean mo33775Wc(CoreSuggested.UserInfo userInfo);

    /* JADX INFO: renamed from: Wg */
    int mo33776Wg();

    /* JADX INFO: renamed from: Wj */
    String mo33777Wj();

    /* JADX INFO: renamed from: Wk */
    int mo33778Wk();

    /* JADX INFO: renamed from: X5 */
    boolean mo33779X5();

    /* JADX INFO: renamed from: X9 */
    boolean mo33780X9();

    /* JADX INFO: renamed from: Xb */
    void mo33781Xb(int i);

    /* JADX INFO: renamed from: Xf */
    Picture.ImageUri mo33782Xf(Media media);

    /* JADX INFO: renamed from: Xj */
    void mo33783Xj(String str);

    /* JADX INFO: renamed from: Xk */
    boolean mo33784Xk();

    /* JADX INFO: renamed from: Xl */
    boolean mo33785Xl(int i);

    /* JADX INFO: renamed from: Xs */
    void mo33786Xs(Act act, Throwable th, d30 d30Var);

    /* JADX INFO: renamed from: Y7 */
    void mo33787Y7(Envelope envelope, String str);

    /* JADX INFO: renamed from: Ye */
    int mo33788Ye();

    /* JADX INFO: renamed from: Yh */
    boolean mo33789Yh();

    /* JADX INFO: renamed from: Ym */
    String mo33790Ym(Profile profile);

    /* JADX INFO: renamed from: Z5 */
    boolean mo33791Z5(User user);

    /* JADX INFO: renamed from: Zc */
    void mo33792Zc(Act act, String str);

    /* JADX INFO: renamed from: Ze */
    boolean mo33793Ze();

    /* JADX INFO: renamed from: Zg */
    List<String> mo33794Zg();

    /* JADX INFO: renamed from: ac */
    String mo33795ac(Activity activity);

    /* JADX INFO: renamed from: af */
    String mo33796af();

    /* JADX INFO: renamed from: ag */
    void mo33797ag(Activity activity);

    /* JADX INFO: renamed from: ak */
    boolean mo33798ak();

    /* JADX INFO: renamed from: am */
    boolean mo33799am();

    /* JADX INFO: renamed from: aq */
    boolean mo33800aq();

    /* JADX INFO: renamed from: ar */
    boolean mo33801ar();

    /* JADX INFO: renamed from: b */
    boolean mo33802b();

    /* JADX INFO: renamed from: bh */
    void mo33803bh(HeartbeatPushInfo heartbeatPushInfo);

    /* JADX INFO: renamed from: bm */
    boolean mo33804bm();

    /* JADX INFO: renamed from: bn */
    boolean mo33805bn();

    /* JADX INFO: renamed from: bp */
    void mo33806bp(Act act, String str, String str2);

    /* JADX INFO: renamed from: bq */
    boolean mo33807bq();

    /* JADX INFO: renamed from: c */
    boolean mo33808c();

    /* JADX INFO: renamed from: cp */
    void mo33809cp();

    /* JADX INFO: renamed from: ct */
    Integer mo33810ct();

    /* JADX INFO: renamed from: d */
    void mo33811d(Throwable th);

    /* JADX INFO: renamed from: d4 */
    boolean mo33812d4();

    /* JADX INFO: renamed from: d7 */
    boolean mo33813d7();

    /* JADX INFO: renamed from: da */
    CoreInnerPush.C4716a mo33814da(User user, Message message);

    /* JADX INFO: renamed from: df */
    boolean mo33815df();

    /* JADX INFO: renamed from: dq */
    int mo33816dq();

    /* JADX INFO: renamed from: e */
    boolean mo33817e();

    /* JADX INFO: renamed from: ed */
    boolean mo33818ed();

    /* JADX INFO: renamed from: ee */
    boolean mo33819ee(Act act);

    /* JADX INFO: renamed from: ep */
    boolean mo33820ep();

    /* JADX INFO: renamed from: er */
    boolean mo33821er();

    /* JADX INFO: renamed from: f */
    boolean mo33822f();

    /* JADX INFO: renamed from: f7 */
    void mo33823f7();

    /* JADX INFO: renamed from: f8 */
    boolean mo33824f8();

    /* JADX INFO: renamed from: fa */
    List<String> mo33825fa(String str);

    /* JADX INFO: renamed from: fd */
    int mo33826fd();

    /* JADX INFO: renamed from: fi */
    String mo33827fi();

    /* JADX INFO: renamed from: g */
    boolean mo33828g();

    /* JADX INFO: renamed from: g5 */
    C22306c<List<Merchandise>> mo33829g5(@NonNull Context context, @NonNull List<Merchandise> list);

    /* JADX INFO: renamed from: g7 */
    ArrayList<LoopSelectFillData> mo33830g7(User user);

    /* JADX INFO: renamed from: g8 */
    boolean mo33831g8();

    /* JADX INFO: renamed from: gb */
    boolean mo33832gb();

    Intent getMainActIntent(Context context);

    /* JADX INFO: renamed from: gf */
    ArrayList<LoopSelectFillData> mo33833gf(User user);

    /* JADX INFO: renamed from: gm */
    AtomicBoolean mo33834gm();

    /* JADX INFO: renamed from: gn */
    boolean mo33835gn();

    /* JADX INFO: renamed from: go */
    Double mo33836go();

    /* JADX INFO: renamed from: gq */
    boolean mo33837gq();

    /* JADX INFO: renamed from: gs */
    void mo33838gs();

    /* JADX INFO: renamed from: gt */
    ArrayList<LoopSelectFillData> mo33839gt(User user);

    /* JADX INFO: renamed from: h */
    String mo33840h();

    /* JADX INFO: renamed from: h5 */
    boolean mo33841h5();

    /* JADX INFO: renamed from: h6 */
    void mo33842h6(String str);

    /* JADX INFO: renamed from: hf */
    boolean mo33843hf(String str);

    /* JADX INFO: renamed from: hh */
    void mo33844hh(List<CoreSuggested.UserInfo> list);

    /* JADX INFO: renamed from: hi */
    boolean mo33845hi(Act act);

    /* JADX INFO: renamed from: hs */
    Intent mo33846hs(Context context);

    /* JADX INFO: renamed from: i */
    boolean mo33847i();

    /* JADX INFO: renamed from: ib */
    boolean mo33848ib();

    /* JADX INFO: renamed from: ic */
    boolean mo33849ic();

    /* JADX INFO: renamed from: id */
    void mo33850id(Act act);

    /* JADX INFO: renamed from: ig */
    boolean mo33851ig();

    /* JADX INFO: renamed from: ip */
    void mo33852ip(Act act, String str, Privilege privilege);

    /* JADX INFO: renamed from: iq */
    boolean mo33853iq();

    /* JADX INFO: renamed from: ir */
    boolean mo33854ir();

    /* JADX INFO: renamed from: is */
    boolean mo33855is();

    /* JADX INFO: renamed from: j */
    boolean mo33856j();

    /* JADX INFO: renamed from: j3 */
    boolean mo33857j3();

    /* JADX INFO: renamed from: j6 */
    Intent mo33858j6(Act act, String str);

    /* JADX INFO: renamed from: jd */
    void mo33859jd(int i);

    /* JADX INFO: renamed from: jf */
    void mo33860jf(Act act, int i, Runnable runnable, Runnable runnable2, d30 d30Var);

    /* JADX INFO: renamed from: jm */
    int mo33861jm();

    /* JADX INFO: renamed from: jo */
    void mo33862jo(List<CoreSuggested.UserInfo> list);

    /* JADX INFO: renamed from: jq */
    void mo33863jq(boolean z);

    /* JADX INFO: renamed from: js */
    boolean mo33864js();

    /* JADX INFO: renamed from: jt */
    int mo33865jt(Long l2);

    /* JADX INFO: renamed from: k */
    boolean mo33866k();

    /* JADX INFO: renamed from: k6 */
    boolean mo33867k6();

    /* JADX INFO: renamed from: k8 */
    boolean mo33868k8();

    /* JADX INFO: renamed from: ka */
    boolean mo33869ka();

    /* JADX INFO: renamed from: kc */
    boolean mo33870kc();

    /* JADX INFO: renamed from: kd */
    Throwable mo33871kd(Throwable th);

    /* JADX INFO: renamed from: kf */
    boolean mo33872kf(List<String> list, List<String> list2);

    /* JADX INFO: renamed from: kl */
    boolean mo33873kl();

    /* JADX INFO: renamed from: km */
    boolean mo33874km();

    /* JADX INFO: renamed from: l */
    boolean mo33875l();

    /* JADX INFO: renamed from: l7 */
    void mo33876l7(Act act, String str);

    /* JADX INFO: renamed from: lb */
    void mo33877lb();

    /* JADX INFO: renamed from: lj */
    void mo33878lj(long j);

    /* JADX INFO: renamed from: lk */
    boolean mo33879lk();

    /* JADX INFO: renamed from: ll */
    void mo33880ll(List<CoreSuggested.UserInfo> list);

    /* JADX INFO: renamed from: m */
    String mo33881m(List<String> list, List<String> list2);

    /* JADX INFO: renamed from: m3 */
    boolean mo33882m3();

    /* JADX INFO: renamed from: md */
    Intent mo33883md(Context context, String str, String str2, boolean z, boolean z2, boolean z3);

    /* JADX INFO: renamed from: mj */
    boolean mo33884mj();

    /* JADX INFO: renamed from: mk */
    List<GPTopicCard> mo33885mk(List<GPTopicCard> list);

    Intent newMainActClearStack(Context context, boolean z);

    /* JADX INFO: renamed from: nj */
    void mo33886nj(List<CoreSuggested.UserInfo> list, List<Live> list2);

    /* JADX INFO: renamed from: nn */
    List<Purpose> mo33887nn(String str);

    /* JADX INFO: renamed from: no */
    void mo33888no(boolean z);

    /* JADX INFO: renamed from: np */
    void mo33889np(Act act, e30<Media> e30Var);

    /* JADX INFO: renamed from: o */
    boolean mo33890o();

    /* JADX INFO: renamed from: o8 */
    CoreInnerPush.C4716a mo33891o8(User user, Message message);

    /* JADX INFO: renamed from: o9 */
    boolean mo33892o9();

    /* JADX INFO: renamed from: ob */
    String mo33893ob(String str);

    /* JADX INFO: renamed from: oe */
    boolean mo33894oe();

    /* JADX INFO: renamed from: ol */
    String mo33895ol();

    /* JADX INFO: renamed from: oq */
    boolean mo33896oq();

    /* JADX INFO: renamed from: os */
    double mo33897os();

    /* JADX INFO: renamed from: p */
    boolean mo33898p();

    /* JADX INFO: renamed from: p0 */
    boolean mo33899p0();

    /* JADX INFO: renamed from: pb */
    boolean mo33900pb();

    /* JADX INFO: renamed from: ph */
    String mo33901ph(Act.C4299r c4299r);

    /* JADX INFO: renamed from: pn */
    boolean mo33902pn();

    /* JADX INFO: renamed from: q */
    boolean mo33903q();

    /* JADX INFO: renamed from: q0 */
    boolean mo33904q0();

    /* JADX INFO: renamed from: qa */
    void mo33905qa(Act act, String str);

    /* JADX INFO: renamed from: qc */
    String mo33906qc(String str);

    /* JADX INFO: renamed from: qe */
    boolean mo33907qe();

    /* JADX INFO: renamed from: qf */
    boolean mo33908qf();

    /* JADX INFO: renamed from: qi */
    int mo33909qi();

    /* JADX INFO: renamed from: qq */
    boolean mo33910qq();

    /* JADX INFO: renamed from: qr */
    boolean mo33911qr(String str);

    /* JADX INFO: renamed from: r */
    void mo33912r(Act act);

    /* JADX INFO: renamed from: r7 */
    void mo33913r7(Act act);

    /* JADX INFO: renamed from: rf */
    Intent mo33914rf(Context context, String str);

    /* JADX INFO: renamed from: rm */
    void mo33915rm(Act act, String str);

    /* JADX INFO: renamed from: rs */
    int mo33916rs();

    /* JADX INFO: renamed from: rt */
    boolean mo33917rt();

    /* JADX INFO: renamed from: s */
    boolean mo33918s();

    /* JADX INFO: renamed from: s3 */
    boolean mo33919s3();

    /* JADX INFO: renamed from: sa */
    boolean mo33920sa();

    /* JADX INFO: renamed from: sn */
    boolean mo33921sn();

    /* JADX INFO: renamed from: t */
    boolean mo33922t();

    /* JADX INFO: renamed from: t8 */
    boolean mo33923t8();

    /* JADX INFO: renamed from: t9 */
    boolean mo33924t9();

    /* JADX INFO: renamed from: tb */
    void mo33925tb(List<CoreGiftInfo> list);

    /* JADX INFO: renamed from: th */
    Intent mo33926th(Act act);

    /* JADX INFO: renamed from: ti */
    boolean mo33927ti(String str);

    /* JADX INFO: renamed from: tl */
    boolean mo33928tl();

    /* JADX INFO: renamed from: tm */
    ArrayList<LoopSelectFillData> mo33929tm(User user);

    /* JADX INFO: renamed from: tp */
    boolean mo33930tp();

    /* JADX INFO: renamed from: u */
    boolean mo33931u();

    /* JADX INFO: renamed from: uc */
    int mo33932uc();

    /* JADX INFO: renamed from: ui */
    boolean mo33933ui();

    /* JADX INFO: renamed from: uj */
    String mo33934uj();

    /* JADX INFO: renamed from: v */
    boolean mo33935v();

    /* JADX INFO: renamed from: vd */
    boolean mo33936vd(Frag frag);

    /* JADX INFO: renamed from: ve */
    boolean mo33937ve(User user);

    /* JADX INFO: renamed from: vi */
    boolean mo33938vi();

    /* JADX INFO: renamed from: vp */
    boolean mo33939vp();

    /* JADX INFO: renamed from: w */
    boolean mo33940w();

    /* JADX INFO: renamed from: wl */
    String mo33941wl();

    /* JADX INFO: renamed from: x */
    boolean mo33942x();

    /* JADX INFO: renamed from: x3 */
    boolean mo33943x3();

    /* JADX INFO: renamed from: xc */
    void mo33944xc(User user);

    /* JADX INFO: renamed from: xd */
    void mo33945xd(boolean z);

    /* JADX INFO: renamed from: xe */
    void mo33946xe();

    /* JADX INFO: renamed from: xh */
    boolean mo33947xh();

    /* JADX INFO: renamed from: xi */
    boolean mo33948xi();

    /* JADX INFO: renamed from: xq */
    Intent mo33949xq(Context context, String str, String str2, String str3, String str4, String str5);

    /* JADX INFO: renamed from: xr */
    Class mo33950xr();

    /* JADX INFO: renamed from: y */
    boolean mo33951y();

    /* JADX INFO: renamed from: y6 */
    int mo33952y6();

    /* JADX INFO: renamed from: yg */
    boolean mo33953yg();

    /* JADX INFO: renamed from: yh */
    boolean mo33954yh();

    /* JADX INFO: renamed from: ym */
    boolean mo33955ym();

    /* JADX INFO: renamed from: ys */
    boolean mo33956ys();

    /* JADX INFO: renamed from: yt */
    boolean mo33957yt();

    /* JADX INFO: renamed from: z */
    boolean mo33958z(String str);

    /* JADX INFO: renamed from: z1 */
    boolean mo33959z1();

    /* JADX INFO: renamed from: zk */
    void mo33960zk();

    /* JADX INFO: renamed from: zm */
    Intent mo33961zm(Context context, boolean z, boolean z2);

    /* JADX INFO: renamed from: zs */
    void mo33962zs(List<CoreSuggested.UserInfo> list, List<Voice> list2);

    /* JADX INFO: renamed from: zt */
    String mo33963zt();
}
