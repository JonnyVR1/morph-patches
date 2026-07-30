package com.p000p1.mobile.putong.core.api.inject.provider;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.util.Pair;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.api.api.TantanException;
import com.p000p1.mobile.putong.app.C0125a;
import com.p000p1.mobile.putong.app.PutongAct;
import com.p000p1.mobile.putong.core.api.CoreInnerPush;
import com.p000p1.mobile.putong.core.api.CoreSuggested;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.Frag;
import com.p1.mobile.putong.core.data.AppealInfo;
import com.p1.mobile.putong.core.data.CategorySuggestions;
import com.p1.mobile.putong.core.data.Conversation;
import com.p1.mobile.putong.core.data.CoreGiftInfo;
import com.p1.mobile.putong.core.data.GPTopicCard;
import com.p1.mobile.putong.core.data.HeartbeatPushInfo;
import com.p1.mobile.putong.core.data.HometownSuggest;
import com.p1.mobile.putong.core.data.IPRegion;
import com.p1.mobile.putong.core.data.InsertConversationsList;
import com.p1.mobile.putong.core.data.Merchandise;
import com.p1.mobile.putong.core.data.Message;
import com.p1.mobile.putong.core.data.NewTags;
import com.p1.mobile.putong.core.data.Privilege;
import com.p1.mobile.putong.core.data.UrlTag;
import com.p1.mobile.putong.core.data.Voice;
import com.p1.mobile.putong.core.ui.profile.loop.base.LoopSelectFillData;
import com.p1.mobile.putong.data.CounterConversations;
import com.p1.mobile.putong.data.Envelope;
import com.p1.mobile.putong.data.Live;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.Picture;
import com.p1.mobile.putong.data.Profile;
import com.p1.mobile.putong.data.Purpose;
import com.p1.mobile.putong.data.QualificationType;
import com.p1.mobile.putong.data.User;
import com.tantanapp.android.injecter.facade.template.IProvider;
import com.tantanapp.common.data.ValueObject;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import l.d30;
import l.e30;
import l.mcr;
import l.uqd0;
import rx.c;
import rx.subjects.a;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public interface CoreProviderInterface extends IProvider {
    /* JADX INFO: renamed from: A */
    void m5588A(Act act);

    /* JADX INFO: renamed from: A8 */
    void m5589A8(Act act, String str, String str2, String str3);

    /* JADX INFO: renamed from: Aa */
    boolean m5590Aa(TantanException.Client.TantanForbidden tantanForbidden);

    /* JADX INFO: renamed from: Ac */
    CharSequence m5591Ac(Message message);

    /* JADX INFO: renamed from: Ae */
    boolean m5592Ae(CoreSuggested.UserInfo userInfo);

    /* JADX INFO: renamed from: Aj */
    boolean m5593Aj(Conversation conversation);

    /* JADX INFO: renamed from: As */
    boolean m5594As();

    /* JADX INFO: renamed from: B */
    boolean m5595B();

    /* JADX INFO: renamed from: B8 */
    uqd0 m5596B8();

    /* JADX INFO: renamed from: Bf */
    void m5597Bf(String str, HashMap<String, String> map, HashMap<String, IPRegion> map2);

    /* JADX INFO: renamed from: Bm */
    void m5598Bm(AppealInfo appealInfo);

    /* JADX INFO: renamed from: Bo */
    void m5599Bo(Act act);

    /* JADX INFO: renamed from: Bt */
    boolean m5600Bt();

    /* JADX INFO: renamed from: C */
    boolean m5601C(int i);

    /* JADX INFO: renamed from: Ce */
    boolean m5602Ce(Activity activity);

    /* JADX INFO: renamed from: Cf */
    void m5603Cf(List<UrlTag> list);

    /* JADX INFO: renamed from: Cn */
    boolean m5604Cn();

    /* JADX INFO: renamed from: Cq */
    int m5605Cq();

    /* JADX INFO: renamed from: Ct */
    boolean m5606Ct(TantanException.Client.TantanForbidden tantanForbidden);

    /* JADX INFO: renamed from: D */
    boolean m5607D();

    /* JADX INFO: renamed from: Db */
    void m5608Db(boolean z);

    /* JADX INFO: renamed from: Df */
    boolean m5609Df(User user);

    /* JADX INFO: renamed from: Dg */
    void m5610Dg(String str);

    /* JADX INFO: renamed from: Di */
    Picture m5611Di(User user);

    /* JADX INFO: renamed from: Dt */
    int m5612Dt();

    /* JADX INFO: renamed from: E */
    boolean m5613E();

    /* JADX INFO: renamed from: E7 */
    int m5614E7(CounterConversations counterConversations);

    /* JADX INFO: renamed from: E8 */
    void m5615E8(HashMap<String, Integer> map);

    /* JADX INFO: renamed from: Eg */
    void m5616Eg(Act act);

    /* JADX INFO: renamed from: El */
    String m5617El(int i);

    /* JADX INFO: renamed from: Er */
    boolean m5618Er();

    /* JADX INFO: renamed from: F4 */
    boolean m5619F4();

    /* JADX INFO: renamed from: F6 */
    boolean m5620F6();

    /* JADX INFO: renamed from: F7 */
    boolean m5621F7();

    /* JADX INFO: renamed from: Fa */
    void m5622Fa(Act act, String str);

    /* JADX INFO: renamed from: Fk */
    void m5623Fk();

    /* JADX INFO: renamed from: Fl */
    boolean m5624Fl();

    /* JADX INFO: renamed from: G */
    C0125a m5625G(PutongAct putongAct);

    /* JADX INFO: renamed from: Ga */
    void m5626Ga(String str);

    /* JADX INFO: renamed from: Ge */
    Intent m5627Ge(Act act);

    /* JADX INFO: renamed from: Gh */
    NewTags m5628Gh(String str);

    /* JADX INFO: renamed from: Gi */
    boolean m5629Gi();

    /* JADX INFO: renamed from: Gp */
    ArrayList<LoopSelectFillData> m5630Gp(User user);

    /* JADX INFO: renamed from: H6 */
    boolean m5631H6(Activity activity);

    /* JADX INFO: renamed from: Hb */
    void m5632Hb(Act act, boolean z, String str, d30 d30Var);

    /* JADX INFO: renamed from: Hf */
    boolean m5633Hf();

    /* JADX INFO: renamed from: Hg */
    boolean m5634Hg();

    /* JADX INFO: renamed from: Hq */
    void m5635Hq(String str, ValueObject valueObject, ValueObject valueObject2);

    /* JADX INFO: renamed from: I4 */
    boolean m5636I4();

    /* JADX INFO: renamed from: I5 */
    boolean m5637I5();

    /* JADX INFO: renamed from: Ih */
    int m5638Ih();

    /* JADX INFO: renamed from: Ik */
    QualificationType m5639Ik(String str);

    /* JADX INFO: renamed from: Ip */
    void m5640Ip(Act act, boolean z, String str, String str2);

    /* JADX INFO: renamed from: Is */
    boolean m5641Is();

    /* JADX INFO: renamed from: J8 */
    int m5642J8();

    /* JADX INFO: renamed from: J9 */
    int m5643J9();

    /* JADX INFO: renamed from: Jc */
    int m5644Jc(Act act);

    /* JADX INFO: renamed from: Jd */
    String m5645Jd();

    /* JADX INFO: renamed from: Je */
    boolean m5646Je();

    /* JADX INFO: renamed from: Ji */
    boolean m5647Ji(TantanException.Client.TantanForbidden tantanForbidden);

    /* JADX INFO: renamed from: Jk */
    void m5648Jk(Act act, User user);

    /* JADX INFO: renamed from: Jo */
    void m5649Jo(Act act, @Nullable d30 d30Var);

    /* JADX INFO: renamed from: K4 */
    boolean m5650K4();

    /* JADX INFO: renamed from: Kl */
    boolean m5651Kl();

    /* JADX INFO: renamed from: Kq */
    boolean m5652Kq(User user);

    /* JADX INFO: renamed from: Lc */
    boolean m5653Lc();

    /* JADX INFO: renamed from: Li */
    boolean m5654Li();

    /* JADX INFO: renamed from: Ln */
    boolean m5655Ln();

    /* JADX INFO: renamed from: Mg */
    int m5656Mg();

    /* JADX INFO: renamed from: Mk */
    CategorySuggestions m5657Mk();

    /* JADX INFO: renamed from: Mm */
    boolean m5658Mm(Act act);

    /* JADX INFO: renamed from: Mo */
    boolean m5659Mo();

    /* JADX INFO: renamed from: N6 */
    HometownSuggest m5660N6();

    /* JADX INFO: renamed from: Na */
    boolean m5661Na();

    /* JADX INFO: renamed from: Nb */
    String m5662Nb(Profile profile);

    /* JADX INFO: renamed from: Nc */
    void m5663Nc(String str);

    /* JADX INFO: renamed from: Nd */
    boolean m5664Nd(Conversation conversation);

    /* JADX INFO: renamed from: Nl */
    boolean m5665Nl(User user);

    /* JADX INFO: renamed from: Nq */
    void m5666Nq(boolean z);

    /* JADX INFO: renamed from: O */
    boolean m5667O();

    /* JADX INFO: renamed from: Oc */
    boolean m5668Oc();

    /* JADX INFO: renamed from: Od */
    boolean m5669Od();

    /* JADX INFO: renamed from: Oe */
    void m5670Oe(Envelope envelope, String str, boolean z);

    /* JADX INFO: renamed from: Oi */
    boolean m5671Oi();

    /* JADX INFO: renamed from: Oq */
    boolean m5672Oq();

    /* JADX INFO: renamed from: Or */
    boolean m5673Or();

    /* JADX INFO: renamed from: Os */
    List<String> m5674Os(String str);

    /* JADX INFO: renamed from: Pa */
    void m5675Pa(Context context);

    /* JADX INFO: renamed from: Pi */
    List<String> m5676Pi(String str);

    /* JADX INFO: renamed from: Q6 */
    a<List<Merchandise>> m5677Q6();

    /* JADX INFO: renamed from: Qg */
    void m5678Qg(Act act, boolean z, d30 d30Var);

    /* JADX INFO: renamed from: Qi */
    boolean m5679Qi();

    /* JADX INFO: renamed from: Ql */
    boolean m5680Ql(String str);

    /* JADX INFO: renamed from: Qq */
    boolean m5681Qq();

    /* JADX INFO: renamed from: R8 */
    boolean m5682R8();

    /* JADX INFO: renamed from: Rg */
    String m5683Rg(String str, String str2);

    /* JADX INFO: renamed from: Rk */
    boolean m5684Rk();

    /* JADX INFO: renamed from: Ro */
    int m5685Ro();

    /* JADX INFO: renamed from: Rq */
    boolean m5686Rq(Act act);

    /* JADX INFO: renamed from: Si */
    void m5687Si(Act act);

    /* JADX INFO: renamed from: T8 */
    Pair<List<String>, List<String>> m5688T8(String str);

    /* JADX INFO: renamed from: Te */
    boolean m5689Te(TantanException.Client.TantanForbidden tantanForbidden);

    /* JADX INFO: renamed from: U */
    boolean m5690U();

    /* JADX INFO: renamed from: U8 */
    void m5691U8(Act act);

    /* JADX INFO: renamed from: U9 */
    boolean m5692U9();

    /* JADX INFO: renamed from: Ua */
    boolean m5693Ua();

    /* JADX INFO: renamed from: Uc */
    User m5694Uc();

    /* JADX INFO: renamed from: Ud */
    void m5695Ud(Act act);

    /* JADX INFO: renamed from: Uj */
    void m5696Uj(Act act, e30<Media> e30Var);

    /* JADX INFO: renamed from: Ul */
    a<InsertConversationsList> m5697Ul();

    /* JADX INFO: renamed from: Uo */
    boolean m5698Uo(String str);

    /* JADX INFO: renamed from: V6 */
    boolean m5699V6();

    /* JADX INFO: renamed from: V8 */
    boolean m5700V8(TantanException.Client.TantanForbidden tantanForbidden);

    /* JADX INFO: renamed from: Vb */
    boolean m5701Vb();

    /* JADX INFO: renamed from: Vc */
    void m5702Vc();

    /* JADX INFO: renamed from: Vd */
    boolean m5703Vd();

    /* JADX INFO: renamed from: Ve */
    boolean m5704Ve();

    /* JADX INFO: renamed from: Vi */
    void m5705Vi(Act act, int i, Runnable runnable, Runnable runnable2, d30 d30Var);

    /* JADX INFO: renamed from: Vj */
    Intent m5706Vj(Context context, String str);

    /* JADX INFO: renamed from: Vn */
    void m5707Vn(mcr mcrVar, d30 d30Var);

    /* JADX INFO: renamed from: Vq */
    boolean m5708Vq(String str);

    /* JADX INFO: renamed from: W7 */
    String m5709W7();

    /* JADX INFO: renamed from: W8 */
    boolean m5710W8();

    /* JADX INFO: renamed from: Wb */
    void m5711Wb(Act act);

    /* JADX INFO: renamed from: Wc */
    boolean m5712Wc(CoreSuggested.UserInfo userInfo);

    /* JADX INFO: renamed from: Wg */
    int m5713Wg();

    /* JADX INFO: renamed from: Wj */
    String m5714Wj();

    /* JADX INFO: renamed from: Wk */
    int m5715Wk();

    /* JADX INFO: renamed from: X5 */
    boolean m5716X5();

    /* JADX INFO: renamed from: X9 */
    boolean m5717X9();

    /* JADX INFO: renamed from: Xb */
    void m5718Xb(int i);

    /* JADX INFO: renamed from: Xf */
    Picture.ImageUri m5719Xf(Media media);

    /* JADX INFO: renamed from: Xj */
    void m5720Xj(String str);

    /* JADX INFO: renamed from: Xk */
    boolean m5721Xk();

    /* JADX INFO: renamed from: Xl */
    boolean m5722Xl(int i);

    /* JADX INFO: renamed from: Xs */
    void m5723Xs(Act act, Throwable th, d30 d30Var);

    /* JADX INFO: renamed from: Y7 */
    void m5724Y7(Envelope envelope, String str);

    /* JADX INFO: renamed from: Ye */
    int m5725Ye();

    /* JADX INFO: renamed from: Yh */
    boolean m5726Yh();

    /* JADX INFO: renamed from: Ym */
    String m5727Ym(Profile profile);

    /* JADX INFO: renamed from: Z5 */
    boolean m5728Z5(User user);

    /* JADX INFO: renamed from: Zc */
    void m5729Zc(Act act, String str);

    /* JADX INFO: renamed from: Ze */
    boolean m5730Ze();

    /* JADX INFO: renamed from: Zg */
    List<String> m5731Zg();

    /* JADX INFO: renamed from: ac */
    String m5732ac(Activity activity);

    /* JADX INFO: renamed from: af */
    String m5733af();

    /* JADX INFO: renamed from: ag */
    void m5734ag(Activity activity);

    /* JADX INFO: renamed from: ak */
    boolean m5735ak();

    /* JADX INFO: renamed from: am */
    boolean m5736am();

    /* JADX INFO: renamed from: aq */
    boolean m5737aq();

    /* JADX INFO: renamed from: ar */
    boolean m5738ar();

    /* JADX INFO: renamed from: b */
    boolean m5739b();

    /* JADX INFO: renamed from: bh */
    void m5740bh(HeartbeatPushInfo heartbeatPushInfo);

    /* JADX INFO: renamed from: bm */
    boolean m5741bm();

    /* JADX INFO: renamed from: bn */
    boolean m5742bn();

    /* JADX INFO: renamed from: bp */
    void m5743bp(Act act, String str, String str2);

    /* JADX INFO: renamed from: bq */
    boolean m5744bq();

    /* JADX INFO: renamed from: c */
    boolean m5745c();

    /* JADX INFO: renamed from: cp */
    void m5746cp();

    /* JADX INFO: renamed from: ct */
    Integer m5747ct();

    /* JADX INFO: renamed from: d */
    void m5748d(Throwable th);

    /* JADX INFO: renamed from: d4 */
    boolean m5749d4();

    /* JADX INFO: renamed from: d7 */
    boolean m5750d7();

    /* JADX INFO: renamed from: da */
    CoreInnerPush.C0142a m5751da(User user, Message message);

    /* JADX INFO: renamed from: df */
    boolean m5752df();

    /* JADX INFO: renamed from: dq */
    int m5753dq();

    /* JADX INFO: renamed from: e */
    boolean m5754e();

    /* JADX INFO: renamed from: ed */
    boolean m5755ed();

    /* JADX INFO: renamed from: ee */
    boolean m5756ee(Act act);

    /* JADX INFO: renamed from: ep */
    boolean m5757ep();

    /* JADX INFO: renamed from: er */
    boolean m5758er();

    /* JADX INFO: renamed from: f */
    boolean m5759f();

    /* JADX INFO: renamed from: f7 */
    void m5760f7();

    /* JADX INFO: renamed from: f8 */
    boolean m5761f8();

    /* JADX INFO: renamed from: fa */
    List<String> m5762fa(String str);

    /* JADX INFO: renamed from: fd */
    int m5763fd();

    /* JADX INFO: renamed from: fi */
    String m5764fi();

    /* JADX INFO: renamed from: g */
    boolean m5765g();

    /* JADX INFO: renamed from: g5 */
    c<List<Merchandise>> m5766g5(@NonNull Context context, @NonNull List<Merchandise> list);

    /* JADX INFO: renamed from: g7 */
    ArrayList<LoopSelectFillData> m5767g7(User user);

    /* JADX INFO: renamed from: g8 */
    boolean m5768g8();

    /* JADX INFO: renamed from: gb */
    boolean m5769gb();

    Intent getMainActIntent(Context context);

    /* JADX INFO: renamed from: gf */
    ArrayList<LoopSelectFillData> m5770gf(User user);

    /* JADX INFO: renamed from: gm */
    AtomicBoolean m5771gm();

    /* JADX INFO: renamed from: gn */
    boolean m5772gn();

    /* JADX INFO: renamed from: go */
    Double m5773go();

    /* JADX INFO: renamed from: gq */
    boolean m5774gq();

    /* JADX INFO: renamed from: gs */
    void m5775gs();

    /* JADX INFO: renamed from: gt */
    ArrayList<LoopSelectFillData> m5776gt(User user);

    /* JADX INFO: renamed from: h */
    String m5777h();

    /* JADX INFO: renamed from: h5 */
    boolean m5778h5();

    /* JADX INFO: renamed from: h6 */
    void m5779h6(String str);

    /* JADX INFO: renamed from: hf */
    boolean m5780hf(String str);

    /* JADX INFO: renamed from: hh */
    void m5781hh(List<CoreSuggested.UserInfo> list);

    /* JADX INFO: renamed from: hi */
    boolean m5782hi(Act act);

    /* JADX INFO: renamed from: hs */
    Intent m5783hs(Context context);

    /* JADX INFO: renamed from: i */
    boolean m5784i();

    /* JADX INFO: renamed from: ib */
    boolean m5785ib();

    /* JADX INFO: renamed from: ic */
    boolean m5786ic();

    /* JADX INFO: renamed from: id */
    void m5787id(Act act);

    /* JADX INFO: renamed from: ig */
    boolean m5788ig();

    /* JADX INFO: renamed from: ip */
    void m5789ip(Act act, String str, Privilege privilege);

    /* JADX INFO: renamed from: iq */
    boolean m5790iq();

    /* JADX INFO: renamed from: ir */
    boolean m5791ir();

    /* JADX INFO: renamed from: is */
    boolean m5792is();

    /* JADX INFO: renamed from: j */
    boolean m5793j();

    /* JADX INFO: renamed from: j3 */
    boolean m5794j3();

    /* JADX INFO: renamed from: j6 */
    Intent m5795j6(Act act, String str);

    /* JADX INFO: renamed from: jd */
    void m5796jd(int i);

    /* JADX INFO: renamed from: jf */
    void m5797jf(Act act, int i, Runnable runnable, Runnable runnable2, d30 d30Var);

    /* JADX INFO: renamed from: jm */
    int m5798jm();

    /* JADX INFO: renamed from: jo */
    void m5799jo(List<CoreSuggested.UserInfo> list);

    /* JADX INFO: renamed from: jq */
    void m5800jq(boolean z);

    /* JADX INFO: renamed from: js */
    boolean m5801js();

    /* JADX INFO: renamed from: jt */
    int m5802jt(Long l2);

    /* JADX INFO: renamed from: k */
    boolean m5803k();

    /* JADX INFO: renamed from: k6 */
    boolean m5804k6();

    /* JADX INFO: renamed from: k8 */
    boolean m5805k8();

    /* JADX INFO: renamed from: ka */
    boolean m5806ka();

    /* JADX INFO: renamed from: kc */
    boolean m5807kc();

    /* JADX INFO: renamed from: kd */
    Throwable m5808kd(Throwable th);

    /* JADX INFO: renamed from: kf */
    boolean m5809kf(List<String> list, List<String> list2);

    /* JADX INFO: renamed from: kl */
    boolean m5810kl();

    /* JADX INFO: renamed from: km */
    boolean m5811km();

    /* JADX INFO: renamed from: l */
    boolean m5812l();

    /* JADX INFO: renamed from: l7 */
    void m5813l7(Act act, String str);

    /* JADX INFO: renamed from: lb */
    void m5814lb();

    /* JADX INFO: renamed from: lj */
    void m5815lj(long j);

    /* JADX INFO: renamed from: lk */
    boolean m5816lk();

    /* JADX INFO: renamed from: ll */
    void m5817ll(List<CoreSuggested.UserInfo> list);

    /* JADX INFO: renamed from: m */
    String m5818m(List<String> list, List<String> list2);

    /* JADX INFO: renamed from: m3 */
    boolean m5819m3();

    /* JADX INFO: renamed from: md */
    Intent m5820md(Context context, String str, String str2, boolean z, boolean z2, boolean z3);

    /* JADX INFO: renamed from: mj */
    boolean m5821mj();

    /* JADX INFO: renamed from: mk */
    List<GPTopicCard> m5822mk(List<GPTopicCard> list);

    Intent newMainActClearStack(Context context, boolean z);

    /* JADX INFO: renamed from: nj */
    void m5823nj(List<CoreSuggested.UserInfo> list, List<Live> list2);

    /* JADX INFO: renamed from: nn */
    List<Purpose> m5824nn(String str);

    /* JADX INFO: renamed from: no */
    void m5825no(boolean z);

    /* JADX INFO: renamed from: np */
    void m5826np(Act act, e30<Media> e30Var);

    /* JADX INFO: renamed from: o */
    boolean m5827o();

    /* JADX INFO: renamed from: o8 */
    CoreInnerPush.C0142a m5828o8(User user, Message message);

    /* JADX INFO: renamed from: o9 */
    boolean m5829o9();

    /* JADX INFO: renamed from: ob */
    String m5830ob(String str);

    /* JADX INFO: renamed from: oe */
    boolean m5831oe();

    /* JADX INFO: renamed from: ol */
    String m5832ol();

    /* JADX INFO: renamed from: oq */
    boolean m5833oq();

    /* JADX INFO: renamed from: os */
    double m5834os();

    /* JADX INFO: renamed from: p */
    boolean m5835p();

    /* JADX INFO: renamed from: p0 */
    boolean m5836p0();

    /* JADX INFO: renamed from: pb */
    boolean m5837pb();

    /* JADX INFO: renamed from: ph */
    String m5838ph(Act.r rVar);

    /* JADX INFO: renamed from: pn */
    boolean m5839pn();

    /* JADX INFO: renamed from: q */
    boolean m5840q();

    /* JADX INFO: renamed from: q0 */
    boolean m5841q0();

    /* JADX INFO: renamed from: qa */
    void m5842qa(Act act, String str);

    /* JADX INFO: renamed from: qc */
    String m5843qc(String str);

    /* JADX INFO: renamed from: qe */
    boolean m5844qe();

    /* JADX INFO: renamed from: qf */
    boolean m5845qf();

    /* JADX INFO: renamed from: qi */
    int m5846qi();

    /* JADX INFO: renamed from: qq */
    boolean m5847qq();

    /* JADX INFO: renamed from: qr */
    boolean m5848qr(String str);

    /* JADX INFO: renamed from: r */
    void m5849r(Act act);

    /* JADX INFO: renamed from: r7 */
    void m5850r7(Act act);

    /* JADX INFO: renamed from: rf */
    Intent m5851rf(Context context, String str);

    /* JADX INFO: renamed from: rm */
    void m5852rm(Act act, String str);

    /* JADX INFO: renamed from: rs */
    int m5853rs();

    /* JADX INFO: renamed from: rt */
    boolean m5854rt();

    /* JADX INFO: renamed from: s */
    boolean m5855s();

    /* JADX INFO: renamed from: s3 */
    boolean m5856s3();

    /* JADX INFO: renamed from: sa */
    boolean m5857sa();

    /* JADX INFO: renamed from: sn */
    boolean m5858sn();

    /* JADX INFO: renamed from: t */
    boolean m5859t();

    /* JADX INFO: renamed from: t8 */
    boolean m5860t8();

    /* JADX INFO: renamed from: t9 */
    boolean m5861t9();

    /* JADX INFO: renamed from: tb */
    void m5862tb(List<CoreGiftInfo> list);

    /* JADX INFO: renamed from: th */
    Intent m5863th(Act act);

    /* JADX INFO: renamed from: ti */
    boolean m5864ti(String str);

    /* JADX INFO: renamed from: tl */
    boolean m5865tl();

    /* JADX INFO: renamed from: tm */
    ArrayList<LoopSelectFillData> m5866tm(User user);

    /* JADX INFO: renamed from: tp */
    boolean m5867tp();

    /* JADX INFO: renamed from: u */
    boolean m5868u();

    /* JADX INFO: renamed from: uc */
    int m5869uc();

    /* JADX INFO: renamed from: ui */
    boolean m5870ui();

    /* JADX INFO: renamed from: uj */
    String m5871uj();

    /* JADX INFO: renamed from: v */
    boolean m5872v();

    /* JADX INFO: renamed from: vd */
    boolean m5873vd(Frag frag);

    /* JADX INFO: renamed from: ve */
    boolean m5874ve(User user);

    /* JADX INFO: renamed from: vi */
    boolean m5875vi();

    /* JADX INFO: renamed from: vp */
    boolean m5876vp();

    /* JADX INFO: renamed from: w */
    boolean m5877w();

    /* JADX INFO: renamed from: wl */
    String m5878wl();

    /* JADX INFO: renamed from: x */
    boolean m5879x();

    /* JADX INFO: renamed from: x3 */
    boolean m5880x3();

    /* JADX INFO: renamed from: xc */
    void m5881xc(User user);

    /* JADX INFO: renamed from: xd */
    void m5882xd(boolean z);

    /* JADX INFO: renamed from: xe */
    void m5883xe();

    /* JADX INFO: renamed from: xh */
    boolean m5884xh();

    /* JADX INFO: renamed from: xi */
    boolean m5885xi();

    /* JADX INFO: renamed from: xq */
    Intent m5886xq(Context context, String str, String str2, String str3, String str4, String str5);

    /* JADX INFO: renamed from: xr */
    Class m5887xr();

    /* JADX INFO: renamed from: y */
    boolean m5888y();

    /* JADX INFO: renamed from: y6 */
    int m5889y6();

    /* JADX INFO: renamed from: yg */
    boolean m5890yg();

    /* JADX INFO: renamed from: yh */
    boolean m5891yh();

    /* JADX INFO: renamed from: ym */
    boolean m5892ym();

    /* JADX INFO: renamed from: ys */
    boolean m5893ys();

    /* JADX INFO: renamed from: yt */
    boolean m5894yt();

    /* JADX INFO: renamed from: z */
    boolean m5895z(String str);

    /* JADX INFO: renamed from: z1 */
    boolean m5896z1();

    /* JADX INFO: renamed from: zk */
    void m5897zk();

    /* JADX INFO: renamed from: zm */
    Intent m5898zm(Context context, boolean z, boolean z2);

    /* JADX INFO: renamed from: zs */
    void m5899zs(List<CoreSuggested.UserInfo> list, List<Voice> list2);

    /* JADX INFO: renamed from: zt */
    String m5900zt();
}
