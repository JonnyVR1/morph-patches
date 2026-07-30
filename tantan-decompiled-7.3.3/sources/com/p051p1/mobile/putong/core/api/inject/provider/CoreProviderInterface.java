package com.p051p1.mobile.putong.core.api.inject.provider;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.util.Pair;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.Frag;
import com.p051p1.mobile.putong.api.api.TantanException;
import com.p051p1.mobile.putong.app.C4850a;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.core.api.CoreInnerPush;
import com.p051p1.mobile.putong.core.api.CoreSuggested;
import com.p051p1.mobile.putong.core.data.AppealInfo;
import com.p051p1.mobile.putong.core.data.CategorySuggestions;
import com.p051p1.mobile.putong.core.data.Conversation;
import com.p051p1.mobile.putong.core.data.CoreGiftInfo;
import com.p051p1.mobile.putong.core.data.GPTopicCard;
import com.p051p1.mobile.putong.core.data.HeartbeatPushInfo;
import com.p051p1.mobile.putong.core.data.HometownSuggest;
import com.p051p1.mobile.putong.core.data.IPRegion;
import com.p051p1.mobile.putong.core.data.InsertConversationsList;
import com.p051p1.mobile.putong.core.data.Merchandise;
import com.p051p1.mobile.putong.core.data.Message;
import com.p051p1.mobile.putong.core.data.NewTags;
import com.p051p1.mobile.putong.core.data.Privilege;
import com.p051p1.mobile.putong.core.data.UrlTag;
import com.p051p1.mobile.putong.core.data.Voice;
import com.p051p1.mobile.putong.core.p058ui.profile.loop.base.LoopSelectFillData;
import com.p051p1.mobile.putong.data.CounterConversations;
import com.p051p1.mobile.putong.data.Envelope;
import com.p051p1.mobile.putong.data.Live;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.Picture;
import com.p051p1.mobile.putong.data.Profile;
import com.p051p1.mobile.putong.data.Purpose;
import com.p051p1.mobile.putong.data.QualificationType;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.android.injecter.facade.template.IProvider;
import com.tantanapp.common.data.ValueObject;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import p137rx.C22421c;
import p137rx.subjects.C22507a;
import p153l.ner;
import p153l.wyd0;
import p153l.x20;
import p153l.y20;

/* JADX INFO: loaded from: classes9.dex */
public interface CoreProviderInterface extends IProvider {
    /* JADX INFO: renamed from: A */
    void mo34654A(Act act);

    /* JADX INFO: renamed from: A8 */
    void mo34655A8(Act act, String str, String str2, String str3);

    /* JADX INFO: renamed from: Aa */
    boolean mo34656Aa(TantanException.Client.TantanForbidden tantanForbidden);

    /* JADX INFO: renamed from: Ac */
    CharSequence mo34657Ac(Message message);

    /* JADX INFO: renamed from: Ae */
    boolean mo34658Ae(CoreSuggested.UserInfo userInfo);

    /* JADX INFO: renamed from: Aj */
    boolean mo34659Aj(Conversation conversation);

    /* JADX INFO: renamed from: As */
    boolean mo34660As();

    /* JADX INFO: renamed from: B */
    boolean mo34661B();

    /* JADX INFO: renamed from: B8 */
    wyd0 mo34662B8();

    /* JADX INFO: renamed from: Bf */
    void mo34663Bf(String str, HashMap<String, String> map, HashMap<String, IPRegion> map2);

    /* JADX INFO: renamed from: Bm */
    void mo34664Bm(AppealInfo appealInfo);

    /* JADX INFO: renamed from: Bo */
    void mo34665Bo(Act act);

    /* JADX INFO: renamed from: Bt */
    boolean mo34666Bt();

    /* JADX INFO: renamed from: C */
    boolean mo34667C(int i);

    /* JADX INFO: renamed from: Ce */
    boolean mo34668Ce(Activity activity);

    /* JADX INFO: renamed from: Cf */
    void mo34669Cf(List<UrlTag> list);

    /* JADX INFO: renamed from: Cn */
    boolean mo34670Cn();

    /* JADX INFO: renamed from: Cq */
    int mo34671Cq();

    /* JADX INFO: renamed from: Ct */
    boolean mo34672Ct(TantanException.Client.TantanForbidden tantanForbidden);

    /* JADX INFO: renamed from: D */
    boolean mo34673D();

    /* JADX INFO: renamed from: Db */
    void mo34674Db(boolean z);

    /* JADX INFO: renamed from: Df */
    boolean mo34675Df(User user);

    /* JADX INFO: renamed from: Dg */
    void mo34676Dg(String str);

    /* JADX INFO: renamed from: Di */
    Picture mo34677Di(User user);

    /* JADX INFO: renamed from: Dt */
    int mo34678Dt();

    /* JADX INFO: renamed from: E */
    boolean mo34679E();

    /* JADX INFO: renamed from: E7 */
    int mo34680E7(CounterConversations counterConversations);

    /* JADX INFO: renamed from: E8 */
    void mo34681E8(HashMap<String, Integer> map);

    /* JADX INFO: renamed from: Eg */
    void mo34682Eg(Act act);

    /* JADX INFO: renamed from: El */
    String mo34683El(int i);

    /* JADX INFO: renamed from: Er */
    boolean mo34684Er();

    /* JADX INFO: renamed from: F4 */
    boolean mo34685F4();

    /* JADX INFO: renamed from: F6 */
    boolean mo34686F6();

    /* JADX INFO: renamed from: F7 */
    boolean mo34687F7();

    /* JADX INFO: renamed from: Fa */
    void mo34688Fa(Act act, String str);

    /* JADX INFO: renamed from: Fk */
    void mo34689Fk();

    /* JADX INFO: renamed from: Fl */
    boolean mo34690Fl();

    /* JADX INFO: renamed from: G */
    C4850a mo34691G(PutongAct putongAct);

    /* JADX INFO: renamed from: Ga */
    void mo34692Ga(String str);

    /* JADX INFO: renamed from: Ge */
    Intent mo34693Ge(Act act);

    /* JADX INFO: renamed from: Gh */
    NewTags mo34694Gh(String str);

    /* JADX INFO: renamed from: Gi */
    boolean mo34695Gi();

    /* JADX INFO: renamed from: Gp */
    ArrayList<LoopSelectFillData> mo34696Gp(User user);

    /* JADX INFO: renamed from: H6 */
    boolean mo34697H6(Activity activity);

    /* JADX INFO: renamed from: Hb */
    void mo34698Hb(Act act, boolean z, String str, x20 x20Var);

    /* JADX INFO: renamed from: Hf */
    boolean mo34699Hf();

    /* JADX INFO: renamed from: Hg */
    boolean mo34700Hg();

    /* JADX INFO: renamed from: Hq */
    void mo34701Hq(String str, ValueObject valueObject, ValueObject valueObject2);

    /* JADX INFO: renamed from: I4 */
    boolean mo34702I4();

    /* JADX INFO: renamed from: I5 */
    boolean mo34703I5();

    /* JADX INFO: renamed from: Ih */
    int mo34704Ih();

    /* JADX INFO: renamed from: Ik */
    QualificationType mo34705Ik(String str);

    /* JADX INFO: renamed from: Ip */
    void mo34706Ip(Act act, boolean z, String str, String str2);

    /* JADX INFO: renamed from: Is */
    boolean mo34707Is();

    /* JADX INFO: renamed from: J8 */
    int mo34708J8();

    /* JADX INFO: renamed from: J9 */
    int mo34709J9();

    /* JADX INFO: renamed from: Jc */
    int mo34710Jc(Act act);

    /* JADX INFO: renamed from: Jd */
    String mo34711Jd();

    /* JADX INFO: renamed from: Je */
    boolean mo34712Je();

    /* JADX INFO: renamed from: Ji */
    boolean mo34713Ji(TantanException.Client.TantanForbidden tantanForbidden);

    /* JADX INFO: renamed from: Jk */
    void mo34714Jk(Act act, User user);

    /* JADX INFO: renamed from: Jo */
    void mo34715Jo(Act act, @Nullable x20 x20Var);

    /* JADX INFO: renamed from: K4 */
    boolean mo34716K4();

    /* JADX INFO: renamed from: Kl */
    boolean mo34717Kl();

    /* JADX INFO: renamed from: Kq */
    boolean mo34718Kq(User user);

    /* JADX INFO: renamed from: Lc */
    boolean mo34719Lc();

    /* JADX INFO: renamed from: Li */
    boolean mo34720Li();

    /* JADX INFO: renamed from: Ln */
    boolean mo34721Ln();

    /* JADX INFO: renamed from: Mg */
    int mo34722Mg();

    /* JADX INFO: renamed from: Mk */
    CategorySuggestions mo34723Mk();

    /* JADX INFO: renamed from: Mm */
    boolean mo34724Mm(Act act);

    /* JADX INFO: renamed from: Mo */
    boolean mo34725Mo();

    /* JADX INFO: renamed from: N6 */
    HometownSuggest mo34726N6();

    /* JADX INFO: renamed from: Na */
    boolean mo34727Na();

    /* JADX INFO: renamed from: Nb */
    String mo34728Nb(Profile profile);

    /* JADX INFO: renamed from: Nc */
    void mo34729Nc(String str);

    /* JADX INFO: renamed from: Nd */
    boolean mo34730Nd(Conversation conversation);

    /* JADX INFO: renamed from: Nl */
    boolean mo34731Nl(User user);

    /* JADX INFO: renamed from: Nq */
    void mo34732Nq(boolean z);

    /* JADX INFO: renamed from: O */
    boolean mo34733O();

    /* JADX INFO: renamed from: Oc */
    boolean mo34734Oc();

    /* JADX INFO: renamed from: Od */
    boolean mo34735Od();

    /* JADX INFO: renamed from: Oe */
    void mo34736Oe(Envelope envelope, String str, boolean z);

    /* JADX INFO: renamed from: Oi */
    boolean mo34737Oi();

    /* JADX INFO: renamed from: Oq */
    boolean mo34738Oq();

    /* JADX INFO: renamed from: Or */
    boolean mo34739Or();

    /* JADX INFO: renamed from: Os */
    List<String> mo34740Os(String str);

    /* JADX INFO: renamed from: Pa */
    void mo34741Pa(Context context);

    /* JADX INFO: renamed from: Pi */
    List<String> mo34742Pi(String str);

    /* JADX INFO: renamed from: Q6 */
    C22507a<List<Merchandise>> mo34743Q6();

    /* JADX INFO: renamed from: Qg */
    void mo34744Qg(Act act, boolean z, x20 x20Var);

    /* JADX INFO: renamed from: Qi */
    boolean mo34745Qi();

    /* JADX INFO: renamed from: Ql */
    boolean mo34746Ql(String str);

    /* JADX INFO: renamed from: Qq */
    boolean mo34747Qq();

    /* JADX INFO: renamed from: R8 */
    boolean mo34748R8();

    /* JADX INFO: renamed from: Rg */
    String mo34749Rg(String str, String str2);

    /* JADX INFO: renamed from: Rk */
    boolean mo34750Rk();

    /* JADX INFO: renamed from: Ro */
    int mo34751Ro();

    /* JADX INFO: renamed from: Rq */
    boolean mo34752Rq(Act act);

    /* JADX INFO: renamed from: Si */
    void mo34753Si(Act act);

    /* JADX INFO: renamed from: T8 */
    Pair<List<String>, List<String>> mo34754T8(String str);

    /* JADX INFO: renamed from: Te */
    boolean mo34755Te(TantanException.Client.TantanForbidden tantanForbidden);

    /* JADX INFO: renamed from: U */
    boolean mo34756U();

    /* JADX INFO: renamed from: U8 */
    void mo34757U8(Act act);

    /* JADX INFO: renamed from: U9 */
    boolean mo34758U9();

    /* JADX INFO: renamed from: Ua */
    boolean mo34759Ua();

    /* JADX INFO: renamed from: Uc */
    User mo34760Uc();

    /* JADX INFO: renamed from: Ud */
    void mo34761Ud(Act act);

    /* JADX INFO: renamed from: Uj */
    void mo34762Uj(Act act, y20<Media> y20Var);

    /* JADX INFO: renamed from: Ul */
    C22507a<InsertConversationsList> mo34763Ul();

    /* JADX INFO: renamed from: Uo */
    boolean mo34764Uo(String str);

    /* JADX INFO: renamed from: V6 */
    boolean mo34765V6();

    /* JADX INFO: renamed from: V8 */
    boolean mo34766V8(TantanException.Client.TantanForbidden tantanForbidden);

    /* JADX INFO: renamed from: Vb */
    boolean mo34767Vb();

    /* JADX INFO: renamed from: Vc */
    void mo34768Vc();

    /* JADX INFO: renamed from: Vd */
    boolean mo34769Vd();

    /* JADX INFO: renamed from: Ve */
    boolean mo34770Ve();

    /* JADX INFO: renamed from: Vi */
    void mo34771Vi(Act act, int i, Runnable runnable, Runnable runnable2, x20 x20Var);

    /* JADX INFO: renamed from: Vj */
    Intent mo34772Vj(Context context, String str);

    /* JADX INFO: renamed from: Vn */
    void mo34773Vn(ner nerVar, x20 x20Var);

    /* JADX INFO: renamed from: Vq */
    boolean mo34774Vq(String str);

    /* JADX INFO: renamed from: W7 */
    String mo34775W7();

    /* JADX INFO: renamed from: W8 */
    boolean mo34776W8();

    /* JADX INFO: renamed from: Wb */
    void mo34777Wb(Act act);

    /* JADX INFO: renamed from: Wc */
    boolean mo34778Wc(CoreSuggested.UserInfo userInfo);

    /* JADX INFO: renamed from: Wg */
    int mo34779Wg();

    /* JADX INFO: renamed from: Wj */
    String mo34780Wj();

    /* JADX INFO: renamed from: Wk */
    int mo34781Wk();

    /* JADX INFO: renamed from: X5 */
    boolean mo34782X5();

    /* JADX INFO: renamed from: X9 */
    boolean mo34783X9();

    /* JADX INFO: renamed from: Xb */
    void mo34784Xb(int i);

    /* JADX INFO: renamed from: Xf */
    Picture.ImageUri mo34785Xf(Media media);

    /* JADX INFO: renamed from: Xj */
    void mo34786Xj(String str);

    /* JADX INFO: renamed from: Xk */
    boolean mo34787Xk();

    /* JADX INFO: renamed from: Xl */
    boolean mo34788Xl(int i);

    /* JADX INFO: renamed from: Xs */
    void mo34789Xs(Act act, Throwable th, x20 x20Var);

    /* JADX INFO: renamed from: Y7 */
    void mo34790Y7(Envelope envelope, String str);

    /* JADX INFO: renamed from: Ye */
    int mo34791Ye();

    /* JADX INFO: renamed from: Yh */
    boolean mo34792Yh();

    /* JADX INFO: renamed from: Ym */
    String mo34793Ym(Profile profile);

    /* JADX INFO: renamed from: Z5 */
    boolean mo34794Z5(User user);

    /* JADX INFO: renamed from: Zc */
    void mo34795Zc(Act act, String str);

    /* JADX INFO: renamed from: Ze */
    boolean mo34796Ze();

    /* JADX INFO: renamed from: Zg */
    List<String> mo34797Zg();

    /* JADX INFO: renamed from: ac */
    String mo34798ac(Activity activity);

    /* JADX INFO: renamed from: af */
    String mo34799af();

    /* JADX INFO: renamed from: ag */
    void mo34800ag(Activity activity);

    /* JADX INFO: renamed from: ak */
    boolean mo34801ak();

    /* JADX INFO: renamed from: am */
    boolean mo34802am();

    /* JADX INFO: renamed from: aq */
    boolean mo34803aq();

    /* JADX INFO: renamed from: ar */
    boolean mo34804ar();

    /* JADX INFO: renamed from: b */
    boolean mo34805b();

    /* JADX INFO: renamed from: bh */
    void mo34806bh(HeartbeatPushInfo heartbeatPushInfo);

    /* JADX INFO: renamed from: bm */
    boolean mo34807bm();

    /* JADX INFO: renamed from: bn */
    boolean mo34808bn();

    /* JADX INFO: renamed from: bp */
    void mo34809bp(Act act, String str, String str2);

    /* JADX INFO: renamed from: bq */
    boolean mo34810bq();

    /* JADX INFO: renamed from: c */
    boolean mo34811c();

    /* JADX INFO: renamed from: cp */
    void mo34812cp();

    /* JADX INFO: renamed from: ct */
    Integer mo34813ct();

    /* JADX INFO: renamed from: d */
    void mo34814d(Throwable th);

    /* JADX INFO: renamed from: d4 */
    boolean mo34815d4();

    /* JADX INFO: renamed from: d7 */
    boolean mo34816d7();

    /* JADX INFO: renamed from: da */
    CoreInnerPush.C4867a mo34817da(User user, Message message);

    /* JADX INFO: renamed from: df */
    boolean mo34818df();

    /* JADX INFO: renamed from: dq */
    int mo34819dq();

    /* JADX INFO: renamed from: e */
    boolean mo34820e();

    /* JADX INFO: renamed from: ed */
    boolean mo34821ed();

    /* JADX INFO: renamed from: ee */
    boolean mo34822ee(Act act);

    /* JADX INFO: renamed from: ep */
    boolean mo34823ep();

    /* JADX INFO: renamed from: er */
    boolean mo34824er();

    /* JADX INFO: renamed from: f */
    boolean mo34825f();

    /* JADX INFO: renamed from: f7 */
    void mo34826f7();

    /* JADX INFO: renamed from: f8 */
    boolean mo34827f8();

    /* JADX INFO: renamed from: fa */
    List<String> mo34828fa(String str);

    /* JADX INFO: renamed from: fd */
    int mo34829fd();

    /* JADX INFO: renamed from: fi */
    String mo34830fi();

    /* JADX INFO: renamed from: g */
    boolean mo34831g();

    /* JADX INFO: renamed from: g5 */
    C22421c<List<Merchandise>> mo34832g5(@NonNull Context context, @NonNull List<Merchandise> list);

    /* JADX INFO: renamed from: g7 */
    ArrayList<LoopSelectFillData> mo34833g7(User user);

    /* JADX INFO: renamed from: g8 */
    boolean mo34834g8();

    /* JADX INFO: renamed from: gb */
    boolean mo34835gb();

    Intent getMainActIntent(Context context);

    /* JADX INFO: renamed from: gf */
    ArrayList<LoopSelectFillData> mo34836gf(User user);

    /* JADX INFO: renamed from: gm */
    AtomicBoolean mo34837gm();

    /* JADX INFO: renamed from: gn */
    boolean mo34838gn();

    /* JADX INFO: renamed from: go */
    Double mo34839go();

    /* JADX INFO: renamed from: gq */
    boolean mo34840gq();

    /* JADX INFO: renamed from: gs */
    void mo34841gs();

    /* JADX INFO: renamed from: gt */
    ArrayList<LoopSelectFillData> mo34842gt(User user);

    /* JADX INFO: renamed from: h */
    String mo34843h();

    /* JADX INFO: renamed from: h5 */
    boolean mo34844h5();

    /* JADX INFO: renamed from: h6 */
    void mo34845h6(String str);

    /* JADX INFO: renamed from: hf */
    boolean mo34846hf(String str);

    /* JADX INFO: renamed from: hh */
    void mo34847hh(List<CoreSuggested.UserInfo> list);

    /* JADX INFO: renamed from: hi */
    boolean mo34848hi(Act act);

    /* JADX INFO: renamed from: hs */
    Intent mo34849hs(Context context);

    /* JADX INFO: renamed from: i */
    boolean mo34850i();

    /* JADX INFO: renamed from: ib */
    boolean mo34851ib();

    /* JADX INFO: renamed from: ic */
    boolean mo34852ic();

    /* JADX INFO: renamed from: id */
    void mo34853id(Act act);

    /* JADX INFO: renamed from: ig */
    boolean mo34854ig();

    /* JADX INFO: renamed from: ip */
    void mo34855ip(Act act, String str, Privilege privilege);

    /* JADX INFO: renamed from: iq */
    boolean mo34856iq();

    /* JADX INFO: renamed from: ir */
    boolean mo34857ir();

    /* JADX INFO: renamed from: is */
    boolean mo34858is();

    /* JADX INFO: renamed from: j */
    boolean mo34859j();

    /* JADX INFO: renamed from: j3 */
    boolean mo34860j3();

    /* JADX INFO: renamed from: j6 */
    Intent mo34861j6(Act act, String str);

    /* JADX INFO: renamed from: jd */
    void mo34862jd(int i);

    /* JADX INFO: renamed from: jf */
    void mo34863jf(Act act, int i, Runnable runnable, Runnable runnable2, x20 x20Var);

    /* JADX INFO: renamed from: jm */
    int mo34864jm();

    /* JADX INFO: renamed from: jo */
    void mo34865jo(List<CoreSuggested.UserInfo> list);

    /* JADX INFO: renamed from: jq */
    void mo34866jq(boolean z);

    /* JADX INFO: renamed from: js */
    boolean mo34867js();

    /* JADX INFO: renamed from: jt */
    int mo34868jt(Long l2);

    /* JADX INFO: renamed from: k */
    boolean mo34869k();

    /* JADX INFO: renamed from: k6 */
    boolean mo34870k6();

    /* JADX INFO: renamed from: k8 */
    boolean mo34871k8();

    /* JADX INFO: renamed from: ka */
    boolean mo34872ka();

    /* JADX INFO: renamed from: kc */
    boolean mo34873kc();

    /* JADX INFO: renamed from: kd */
    Throwable mo34874kd(Throwable th);

    /* JADX INFO: renamed from: kf */
    boolean mo34875kf(List<String> list, List<String> list2);

    /* JADX INFO: renamed from: kl */
    boolean mo34876kl();

    /* JADX INFO: renamed from: km */
    boolean mo34877km();

    /* JADX INFO: renamed from: l */
    boolean mo34878l();

    /* JADX INFO: renamed from: l7 */
    void mo34879l7(Act act, String str);

    /* JADX INFO: renamed from: lb */
    void mo34880lb();

    /* JADX INFO: renamed from: lj */
    void mo34881lj(long j);

    /* JADX INFO: renamed from: lk */
    boolean mo34882lk();

    /* JADX INFO: renamed from: ll */
    void mo34883ll(List<CoreSuggested.UserInfo> list);

    /* JADX INFO: renamed from: m */
    String mo34884m(List<String> list, List<String> list2);

    /* JADX INFO: renamed from: m3 */
    boolean mo34885m3();

    /* JADX INFO: renamed from: md */
    Intent mo34886md(Context context, String str, String str2, boolean z, boolean z2, boolean z3);

    /* JADX INFO: renamed from: mj */
    boolean mo34887mj();

    /* JADX INFO: renamed from: mk */
    List<GPTopicCard> mo34888mk(List<GPTopicCard> list);

    Intent newMainActClearStack(Context context, boolean z);

    /* JADX INFO: renamed from: nj */
    void mo34889nj(List<CoreSuggested.UserInfo> list, List<Live> list2);

    /* JADX INFO: renamed from: nn */
    List<Purpose> mo34890nn(String str);

    /* JADX INFO: renamed from: no */
    void mo34891no(boolean z);

    /* JADX INFO: renamed from: np */
    void mo34892np(Act act, y20<Media> y20Var);

    /* JADX INFO: renamed from: o */
    boolean mo34893o();

    /* JADX INFO: renamed from: o8 */
    CoreInnerPush.C4867a mo34894o8(User user, Message message);

    /* JADX INFO: renamed from: o9 */
    boolean mo34895o9();

    /* JADX INFO: renamed from: ob */
    String mo34896ob(String str);

    /* JADX INFO: renamed from: oe */
    boolean mo34897oe();

    /* JADX INFO: renamed from: ol */
    String mo34898ol();

    /* JADX INFO: renamed from: oq */
    boolean mo34899oq();

    /* JADX INFO: renamed from: os */
    double mo34900os();

    /* JADX INFO: renamed from: p */
    boolean mo34901p();

    /* JADX INFO: renamed from: p0 */
    boolean mo34902p0();

    /* JADX INFO: renamed from: pb */
    boolean mo34903pb();

    /* JADX INFO: renamed from: ph */
    String mo34904ph(Act.C4450r c4450r);

    /* JADX INFO: renamed from: pn */
    boolean mo34905pn();

    /* JADX INFO: renamed from: q */
    boolean mo34906q();

    /* JADX INFO: renamed from: q0 */
    boolean mo34907q0();

    /* JADX INFO: renamed from: qa */
    void mo34908qa(Act act, String str);

    /* JADX INFO: renamed from: qc */
    String mo34909qc(String str);

    /* JADX INFO: renamed from: qe */
    boolean mo34910qe();

    /* JADX INFO: renamed from: qf */
    boolean mo34911qf();

    /* JADX INFO: renamed from: qi */
    int mo34912qi();

    /* JADX INFO: renamed from: qq */
    boolean mo34913qq();

    /* JADX INFO: renamed from: qr */
    boolean mo34914qr(String str);

    /* JADX INFO: renamed from: r */
    void mo34915r(Act act);

    /* JADX INFO: renamed from: r7 */
    void mo34916r7(Act act);

    /* JADX INFO: renamed from: rf */
    Intent mo34917rf(Context context, String str);

    /* JADX INFO: renamed from: rm */
    void mo34918rm(Act act, String str);

    /* JADX INFO: renamed from: rs */
    int mo34919rs();

    /* JADX INFO: renamed from: rt */
    boolean mo34920rt();

    /* JADX INFO: renamed from: s */
    boolean mo34921s();

    /* JADX INFO: renamed from: s3 */
    boolean mo34922s3();

    /* JADX INFO: renamed from: sa */
    boolean mo34923sa();

    /* JADX INFO: renamed from: sn */
    boolean mo34924sn();

    /* JADX INFO: renamed from: t */
    boolean mo34925t();

    /* JADX INFO: renamed from: t8 */
    boolean mo34926t8();

    /* JADX INFO: renamed from: t9 */
    boolean mo34927t9();

    /* JADX INFO: renamed from: tb */
    void mo34928tb(List<CoreGiftInfo> list);

    /* JADX INFO: renamed from: th */
    Intent mo34929th(Act act);

    /* JADX INFO: renamed from: ti */
    boolean mo34930ti(String str);

    /* JADX INFO: renamed from: tl */
    boolean mo34931tl();

    /* JADX INFO: renamed from: tm */
    ArrayList<LoopSelectFillData> mo34932tm(User user);

    /* JADX INFO: renamed from: tp */
    boolean mo34933tp();

    /* JADX INFO: renamed from: u */
    boolean mo34934u();

    /* JADX INFO: renamed from: uc */
    int mo34935uc();

    /* JADX INFO: renamed from: ui */
    boolean mo34936ui();

    /* JADX INFO: renamed from: uj */
    String mo34937uj();

    /* JADX INFO: renamed from: v */
    boolean mo34938v();

    /* JADX INFO: renamed from: vd */
    boolean mo34939vd(Frag frag);

    /* JADX INFO: renamed from: ve */
    boolean mo34940ve(User user);

    /* JADX INFO: renamed from: vi */
    boolean mo34941vi();

    /* JADX INFO: renamed from: vp */
    boolean mo34942vp();

    /* JADX INFO: renamed from: w */
    boolean mo34943w();

    /* JADX INFO: renamed from: wl */
    String mo34944wl();

    /* JADX INFO: renamed from: x */
    boolean mo34945x();

    /* JADX INFO: renamed from: x3 */
    boolean mo34946x3();

    /* JADX INFO: renamed from: xc */
    void mo34947xc(User user);

    /* JADX INFO: renamed from: xd */
    void mo34948xd(boolean z);

    /* JADX INFO: renamed from: xe */
    void mo34949xe();

    /* JADX INFO: renamed from: xh */
    boolean mo34950xh();

    /* JADX INFO: renamed from: xi */
    boolean mo34951xi();

    /* JADX INFO: renamed from: xq */
    Intent mo34952xq(Context context, String str, String str2, String str3, String str4, String str5);

    /* JADX INFO: renamed from: xr */
    Class mo34953xr();

    /* JADX INFO: renamed from: y */
    boolean mo34954y();

    /* JADX INFO: renamed from: y6 */
    int mo34955y6();

    /* JADX INFO: renamed from: yg */
    boolean mo34956yg();

    /* JADX INFO: renamed from: yh */
    boolean mo34957yh();

    /* JADX INFO: renamed from: ym */
    boolean mo34958ym();

    /* JADX INFO: renamed from: ys */
    boolean mo34959ys();

    /* JADX INFO: renamed from: yt */
    boolean mo34960yt();

    /* JADX INFO: renamed from: z */
    boolean mo34961z(String str);

    /* JADX INFO: renamed from: z1 */
    boolean mo34962z1();

    /* JADX INFO: renamed from: zk */
    void mo34963zk();

    /* JADX INFO: renamed from: zm */
    Intent mo34964zm(Context context, boolean z, boolean z2);

    /* JADX INFO: renamed from: zs */
    void mo34965zs(List<CoreSuggested.UserInfo> list, List<Voice> list2);

    /* JADX INFO: renamed from: zt */
    String mo34966zt();
}
