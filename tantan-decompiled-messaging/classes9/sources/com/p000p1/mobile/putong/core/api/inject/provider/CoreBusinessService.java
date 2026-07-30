package com.p000p1.mobile.putong.core.api.inject.provider;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.ResultReceiver;
import android.text.SpannableString;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.annotation.DrawableRes;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.drawee.view.SimpleDraweeView;
import com.google.common.base.Optional;
import com.p000p1.mobile.putong.app.PutongFrag;
import com.p000p1.mobile.putong.core.PutongCoreAct;
import com.p000p1.mobile.putong.core.api.CoreLikers;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.Frag;
import com.p1.mobile.android.app.a;
import com.p1.mobile.putong.core.data.Active;
import com.p1.mobile.putong.core.data.CityCBanner;
import com.p1.mobile.putong.core.data.CityCData;
import com.p1.mobile.putong.core.data.FreeTrialOperateResult;
import com.p1.mobile.putong.core.data.HometownSuggest;
import com.p1.mobile.putong.core.data.LikedUser;
import com.p1.mobile.putong.core.data.LiteraturesComments;
import com.p1.mobile.putong.core.data.Merchandise;
import com.p1.mobile.putong.core.data.NewTags;
import com.p1.mobile.putong.core.data.Privilege;
import com.p1.mobile.putong.core.data.ProfileCompletionConfig;
import com.p1.mobile.putong.core.data.PurchaseType;
import com.p1.mobile.putong.core.data.RoamedLocationData;
import com.p1.mobile.putong.core.data.SummarizedPrivilegePrice;
import com.p1.mobile.putong.core.data.SwitchConvNextConfig;
import com.p1.mobile.putong.core.data.VirtualCardType;
import com.p1.mobile.putong.core.newui.messages.business.BusinessEntranceStyle;
import com.p1.mobile.putong.data.Counter;
import com.p1.mobile.putong.data.GPSkuDetails;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.NavigationCardIntent;
import com.p1.mobile.putong.data.OmsTagUserCounts;
import com.p1.mobile.putong.data.Picture;
import com.p1.mobile.putong.data.QualificationType;
import com.p1.mobile.putong.data.Relationship;
import com.p1.mobile.putong.data.User;
import com.tantanapp.android.injecter.facade.template.IProvider;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import l.cwf0;
import l.d30;
import l.e30;
import l.eyl;
import l.f5m;
import l.g30;
import l.j760;
import l.l5j0;
import l.lwl;
import l.nx0;
import l.qed0;
import l.v9j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p006l.n87;
import rx.c;
import v.VDraweeView;
import v.VFrame;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public interface CoreBusinessService extends IProvider, n87 {
    /* JADX INFO: renamed from: A4 */
    void m5217A4(Act act);

    /* JADX INFO: renamed from: A7 */
    Intent m5218A7(Act act);

    /* JADX INFO: renamed from: A9 */
    void m5219A9(Act act, String str);

    /* JADX INFO: renamed from: Ab */
    boolean m5220Ab(PurchaseType purchaseType);

    /* JADX INFO: renamed from: Ad */
    void m5221Ad(Act act, String str, View view, e30<Boolean> e30Var);

    /* JADX INFO: renamed from: Ak */
    boolean m5222Ak(List<OmsTagUserCounts> list);

    /* JADX INFO: renamed from: Al */
    String m5223Al(Media media);

    /* JADX INFO: renamed from: Ao */
    void m5224Ao(boolean z, boolean z2, boolean z3, User user, Act act, String str, boolean z4);

    /* JADX INFO: renamed from: B7 */
    boolean m5225B7();

    /* JADX INFO: renamed from: B9 */
    float m5226B9();

    /* JADX INFO: renamed from: Bb */
    void m5227Bb(Act act);

    /* JADX INFO: renamed from: Bc */
    CharSequence m5228Bc(User user, Context context, int[] iArr);

    /* JADX INFO: renamed from: Be */
    void m5229Be();

    /* JADX INFO: renamed from: Bn */
    long m5230Bn();

    /* JADX INFO: renamed from: Bp */
    void m5231Bp(PutongFrag putongFrag, int i);

    /* JADX INFO: renamed from: C7 */
    void m5232C7(Act act, CityCBanner cityCBanner);

    /* JADX INFO: renamed from: C9 */
    void m5233C9(View view, BusinessEntranceStyle businessEntranceStyle);

    /* JADX INFO: renamed from: Cc */
    Act.w m5234Cc(View view, e30<Boolean> e30Var);

    /* JADX INFO: renamed from: Cj */
    String m5235Cj();

    /* JADX INFO: renamed from: Ck */
    int m5236Ck();

    /* JADX INFO: renamed from: Cm */
    int m5237Cm();

    /* JADX INFO: renamed from: Cs */
    CharSequence m5238Cs(User user, User user2);

    /* JADX INFO: renamed from: D6 */
    String m5239D6();

    /* JADX INFO: renamed from: Dc */
    c<View> m5240Dc(Act act, d30 d30Var);

    /* JADX INFO: renamed from: De */
    boolean m5241De();

    /* JADX INFO: renamed from: Dl */
    void m5242Dl(Act act, User user, String str, d30 d30Var);

    /* JADX INFO: renamed from: Dn */
    boolean m5243Dn(QualificationType qualificationType);

    /* JADX INFO: renamed from: E5 */
    c<View> m5244E5(Act act);

    /* JADX INFO: renamed from: E9 */
    void m5245E9();

    /* JADX INFO: renamed from: Eb */
    void m5246Eb(Act act);

    /* JADX INFO: renamed from: Ef */
    void m5247Ef(eyl eylVar, String str);

    /* JADX INFO: renamed from: En */
    boolean m5248En();

    /* JADX INFO: renamed from: Eo */
    void m5249Eo(Act act, PurchaseType purchaseType, boolean z, d30 d30Var, d30 d30Var2, String str);

    /* JADX INFO: renamed from: Eq */
    void m5250Eq(Act act, String str, d30 d30Var, Privilege privilege, boolean z, User user);

    /* JADX INFO: renamed from: Es */
    boolean m5251Es();

    /* JADX INFO: renamed from: F0 */
    String m5252F0();

    /* JADX INFO: renamed from: F2 */
    String m5253F2();

    /* JADX INFO: renamed from: F4 */
    boolean m5254F4();

    /* JADX INFO: renamed from: F9 */
    boolean m5255F9(List<String> list);

    /* JADX INFO: renamed from: Fe */
    void m5256Fe(Act act);

    /* JADX INFO: renamed from: Fi */
    String m5257Fi();

    /* JADX INFO: renamed from: G7 */
    boolean m5258G7();

    /* JADX INFO: renamed from: G8 */
    String m5259G8();

    /* JADX INFO: renamed from: Gd */
    void m5260Gd(Act act, String str, Privilege privilege, PurchaseType purchaseType, e30<PurchaseType> e30Var, int i, d30 d30Var, d30 d30Var2, String str2, Object obj, boolean z);

    /* JADX INFO: renamed from: Gf */
    boolean m5261Gf();

    /* JADX INFO: renamed from: Gg */
    int m5262Gg();

    /* JADX INFO: renamed from: Gl */
    int m5263Gl();

    /* JADX INFO: renamed from: Go */
    void m5264Go(Act act, d30 d30Var, PurchaseType purchaseType, boolean z, boolean z2);

    /* JADX INFO: renamed from: Gq */
    void m5265Gq(Act act);

    /* JADX INFO: renamed from: H8 */
    boolean m5266H8(@NotNull Date date);

    /* JADX INFO: renamed from: H9 */
    String m5267H9();

    /* JADX INFO: renamed from: Hc */
    void m5268Hc(Act act, d30 d30Var, v9j<Boolean> v9jVar);

    /* JADX INFO: renamed from: Hd */
    boolean m5269Hd();

    /* JADX INFO: renamed from: Hi */
    boolean m5270Hi();

    /* JADX INFO: renamed from: Hk */
    Intent m5271Hk(Act act);

    /* JADX INFO: renamed from: Hl */
    int m5272Hl(String str);

    /* JADX INFO: renamed from: Ho */
    boolean m5273Ho();

    /* JADX INFO: renamed from: Hr */
    boolean m5274Hr();

    /* JADX INFO: renamed from: I9 */
    void m5275I9(Frag frag, User user);

    /* JADX INFO: renamed from: Ie */
    String m5276Ie();

    /* JADX INFO: renamed from: If */
    boolean m5277If();

    /* JADX INFO: renamed from: Il */
    String m5278Il();

    /* JADX INFO: renamed from: Im */
    void m5279Im(int i, ImageView imageView, boolean z);

    /* JADX INFO: renamed from: Iq */
    String m5280Iq();

    /* JADX INFO: renamed from: J6 */
    void m5281J6(Context context);

    /* JADX INFO: renamed from: J7 */
    void m5282J7(Act act, PurchaseType purchaseType, d30 d30Var, d30 d30Var2);

    /* JADX INFO: renamed from: Ja */
    SwitchConvNextConfig m5283Ja();

    /* JADX INFO: renamed from: Jj */
    String m5284Jj();

    /* JADX INFO: renamed from: Jl */
    void m5285Jl(Act act);

    /* JADX INFO: renamed from: K4 */
    boolean m5286K4();

    /* JADX INFO: renamed from: K6 */
    Intent m5287K6(Context context);

    /* JADX INFO: renamed from: Kc */
    void m5288Kc(Act act, int i, d30 d30Var);

    /* JADX INFO: renamed from: Kf */
    boolean m5289Kf();

    /* JADX INFO: renamed from: Kj */
    boolean m5290Kj();

    /* JADX INFO: renamed from: Kp */
    int m5291Kp();

    /* JADX INFO: renamed from: Ks */
    boolean m5292Ks(Privilege privilege);

    /* JADX INFO: renamed from: L6 */
    void m5293L6(Act act, String str, Privilege privilege, User user);

    /* JADX INFO: renamed from: L8 */
    String m5294L8();

    /* JADX INFO: renamed from: L9 */
    CharSequence m5295L9(User user, View view, TextView textView);

    /* JADX INFO: renamed from: La */
    List<NewTags> m5296La(List<String> list);

    /* JADX INFO: renamed from: Lb */
    String m5297Lb();

    /* JADX INFO: renamed from: Ld */
    boolean m5298Ld(@Nullable Counter counter);

    /* JADX INFO: renamed from: Lf */
    void m5299Lf(Act act, String str, Privilege privilege, e30<PurchaseType> e30Var, e30<Boolean> e30Var2);

    /* JADX INFO: renamed from: Lm */
    Intent m5300Lm(Act act, ArrayList<String> arrayList, int i, ArrayList<String> arrayList2);

    /* JADX INFO: renamed from: Lp */
    void m5301Lp(SpannableString spannableString, String str, String str2, int i, int i2, int i3, int i4);

    /* JADX INFO: renamed from: Mb */
    boolean m5302Mb();

    /* JADX INFO: renamed from: Mc */
    void m5303Mc(Act act, String str);

    /* JADX INFO: renamed from: Me */
    void m5304Me(Act act, User user, String str, d30 d30Var);

    /* JADX INFO: renamed from: Mf */
    boolean m5305Mf();

    /* JADX INFO: renamed from: Mi */
    boolean m5306Mi();

    /* JADX INFO: renamed from: Mj */
    f5m m5307Mj(FrameLayout frameLayout, String str, RecyclerView.t tVar);

    /* JADX INFO: renamed from: Mp */
    void m5308Mp(Act act, User user, e30<String> e30Var, boolean z);

    /* JADX INFO: renamed from: Mr */
    void m5309Mr(Act act, String str, d30 d30Var, d30 d30Var2, e30<PurchaseType> e30Var);

    /* JADX INFO: renamed from: N7 */
    int m5310N7();

    /* JADX INFO: renamed from: N8 */
    boolean m5311N8();

    /* JADX INFO: renamed from: Nf */
    int m5312Nf();

    /* JADX INFO: renamed from: Nm */
    int m5313Nm();

    /* JADX INFO: renamed from: Nn */
    void m5314Nn(Act act, String str, View view, boolean z);

    /* JADX INFO: renamed from: No */
    boolean m5315No();

    /* JADX INFO: renamed from: Np */
    boolean m5316Np();

    /* JADX INFO: renamed from: O */
    boolean m5317O();

    /* JADX INFO: renamed from: O1 */
    String m5318O1();

    /* JADX INFO: renamed from: O7 */
    boolean m5319O7();

    /* JADX INFO: renamed from: O8 */
    boolean m5320O8();

    /* JADX INFO: renamed from: O9 */
    Intent m5321O9(Act act, String str, boolean z, ResultReceiver resultReceiver);

    /* JADX INFO: renamed from: Ob */
    String m5322Ob(int i, String str);

    /* JADX INFO: renamed from: Oo */
    boolean m5323Oo();

    /* JADX INFO: renamed from: Op */
    boolean m5324Op();

    /* JADX INFO: renamed from: P7 */
    boolean m5325P7();

    /* JADX INFO: renamed from: P8 */
    int m5326P8();

    /* JADX INFO: renamed from: Ph */
    boolean m5327Ph();

    /* JADX INFO: renamed from: Pl */
    void m5328Pl(boolean z, View view);

    /* JADX INFO: renamed from: Po */
    void m5329Po(Act act);

    /* JADX INFO: renamed from: Q8 */
    void m5330Q8(Act act, RoamedLocationData roamedLocationData);

    /* JADX INFO: renamed from: Qb */
    boolean m5331Qb();

    /* JADX INFO: renamed from: Qp */
    void m5332Qp(Activity activity);

    /* JADX INFO: renamed from: Qr */
    int m5333Qr();

    /* JADX INFO: renamed from: R6 */
    String m5334R6();

    /* JADX INFO: renamed from: Ri */
    void m5335Ri(boolean z);

    /* JADX INFO: renamed from: Rj */
    Intent m5336Rj(Act act, String str, LikedUser likedUser);

    /* JADX INFO: renamed from: Rl */
    String m5337Rl(int i);

    /* JADX INFO: renamed from: Rm */
    void m5338Rm(Act act, String str);

    /* JADX INFO: renamed from: Rn */
    boolean m5339Rn();

    /* JADX INFO: renamed from: Rr */
    void m5340Rr(long j);

    /* JADX INFO: renamed from: Sc */
    void m5341Sc(Act act, String str, e30<PurchaseType> e30Var);

    /* JADX INFO: renamed from: Sh */
    void m5342Sh();

    /* JADX INFO: renamed from: Sk */
    boolean m5343Sk();

    /* JADX INFO: renamed from: Sl */
    void m5344Sl(Act act, String str, Privilege privilege, d30 d30Var, Object obj);

    /* JADX INFO: renamed from: Sm */
    c<Optional<List<GPSkuDetails>>> m5345Sm(Context context, ArrayList<String> arrayList, boolean z, long j);

    /* JADX INFO: renamed from: Sn */
    void m5346Sn(Context context, String str, int i, boolean z, String str2);

    /* JADX INFO: renamed from: So */
    void m5347So(eyl eylVar);

    /* JADX INFO: renamed from: Sp */
    boolean m5348Sp();

    /* JADX INFO: renamed from: Sq */
    Intent m5349Sq(Act act, String str);

    /* JADX INFO: renamed from: T9 */
    void m5350T9(Act act, PurchaseType purchaseType, d30 d30Var, d30 d30Var2, int i);

    /* JADX INFO: renamed from: Ta */
    void m5351Ta(boolean z);

    /* JADX INFO: renamed from: Tb */
    int m5352Tb(boolean z);

    /* JADX INFO: renamed from: Td */
    CharSequence m5353Td(int i);

    /* JADX INFO: renamed from: Th */
    void m5354Th(String str);

    /* JADX INFO: renamed from: Tj */
    void m5355Tj(boolean z, User user, VFrame vFrame);

    /* JADX INFO: renamed from: Tl */
    int m5356Tl(User user);

    /* JADX INFO: renamed from: Tm */
    int m5357Tm();

    /* JADX INFO: renamed from: Tn */
    int m5358Tn();

    /* JADX INFO: renamed from: Tq */
    long m5359Tq();

    /* JADX INFO: renamed from: Tr */
    boolean m5360Tr();

    /* JADX INFO: renamed from: Ts */
    List<String> m5361Ts(List<String> list);

    /* JADX INFO: renamed from: U */
    boolean m5362U();

    /* JADX INFO: renamed from: U7 */
    void m5363U7(Act act, SummarizedPrivilegePrice summarizedPrivilegePrice, d30 d30Var, d30 d30Var2);

    /* JADX INFO: renamed from: Ub */
    String m5364Ub(Media media);

    /* JADX INFO: renamed from: Ue */
    void m5365Ue(Act act, boolean z);

    /* JADX INFO: renamed from: Uh */
    void m5366Uh(Act act, String str);

    /* JADX INFO: renamed from: Un */
    String m5367Un(VirtualCardType virtualCardType);

    /* JADX INFO: renamed from: Up */
    boolean m5368Up();

    /* JADX INFO: renamed from: V7 */
    boolean m5369V7(double d);

    /* JADX INFO: renamed from: Vf */
    boolean m5370Vf();

    /* JADX INFO: renamed from: Vl */
    PurchaseType m5371Vl();

    /* JADX INFO: renamed from: W9 */
    boolean m5372W9();

    /* JADX INFO: renamed from: We */
    boolean m5373We();

    /* JADX INFO: renamed from: Wf */
    Intent m5374Wf(Context context, NavigationCardIntent navigationCardIntent, Map<String, String> map);

    /* JADX INFO: renamed from: Ws */
    void m5375Ws(Act act, User user, boolean z, boolean z2, User user2);

    /* JADX INFO: renamed from: X5 */
    boolean m5376X5();

    /* JADX INFO: renamed from: X6 */
    boolean m5377X6();

    /* JADX INFO: renamed from: Xc */
    void m5378Xc(Frag frag, String str, View view, e30<Boolean> e30Var);

    /* JADX INFO: renamed from: Xi */
    boolean m5379Xi();

    /* JADX INFO: renamed from: Xn */
    boolean m5380Xn();

    /* JADX INFO: renamed from: Xo */
    View m5381Xo(Act act, ViewGroup viewGroup);

    /* JADX INFO: renamed from: Xq */
    int m5382Xq();

    /* JADX INFO: renamed from: Xr */
    Intent m5383Xr(Context context, String str);

    /* JADX INFO: renamed from: Y3 */
    String m5384Y3();

    /* JADX INFO: renamed from: Y4 */
    int m5385Y4();

    /* JADX INFO: renamed from: Y9 */
    boolean m5386Y9();

    /* JADX INFO: renamed from: Yd */
    boolean m5387Yd();

    /* JADX INFO: renamed from: Yf */
    qed0.a m5388Yf(int i, int i2);

    /* JADX INFO: renamed from: Yj */
    void m5389Yj(Act act, User user, VDraweeView vDraweeView, LinearLayout linearLayout);

    /* JADX INFO: renamed from: Yo */
    void m5390Yo(boolean z);

    /* JADX INFO: renamed from: Yp */
    boolean m5391Yp();

    /* JADX INFO: renamed from: Z9 */
    int m5392Z9();

    /* JADX INFO: renamed from: Za */
    void m5393Za(Act act, String str, Object obj, String str2, boolean z);

    /* JADX INFO: renamed from: Zd */
    void m5394Zd();

    /* JADX INFO: renamed from: Zh */
    void m5395Zh(Act act, String str, ArrayList<String> arrayList, a.a aVar);

    /* JADX INFO: renamed from: Zi */
    boolean m5396Zi();

    /* JADX INFO: renamed from: Zp */
    boolean m5397Zp();

    /* JADX INFO: renamed from: ad */
    boolean m5398ad();

    /* JADX INFO: renamed from: ah */
    void m5399ah(eyl eylVar);

    /* JADX INFO: renamed from: ai */
    List<NewTags> m5400ai(List<OmsTagUserCounts> list);

    /* JADX INFO: renamed from: aj */
    Intent m5401aj(Context context, String str);

    /* JADX INFO: renamed from: al */
    String m5402al();

    /* JADX INFO: renamed from: an */
    void m5403an(Frag frag, User user);

    /* JADX INFO: renamed from: ap */
    void m5404ap(Act act, CityCData cityCData);

    /* JADX INFO: renamed from: b3 */
    int m5405b3();

    /* JADX INFO: renamed from: b9 */
    boolean m5406b9();

    /* JADX INFO: renamed from: bc */
    int m5407bc();

    /* JADX INFO: renamed from: bd */
    l5j0 m5408bd(Act act, String str, d30 d30Var, d30 d30Var2);

    /* JADX INFO: renamed from: bi */
    boolean m5409bi(String str);

    /* JADX INFO: renamed from: bk */
    String m5410bk();

    @DrawableRes
    /* JADX INFO: renamed from: c6 */
    int m5411c6();

    /* JADX INFO: renamed from: c7 */
    String m5412c7();

    /* JADX INFO: renamed from: ca */
    CharSequence m5413ca(User user, View view, TextView textView, int i, int i2);

    /* JADX INFO: renamed from: cl */
    boolean m5414cl(Activity activity);

    /* JADX INFO: renamed from: cm */
    void m5415cm(Act act, boolean z);

    /* JADX INFO: renamed from: cn */
    boolean m5416cn();

    /* JADX INFO: renamed from: cr */
    boolean m5417cr();

    /* JADX INFO: renamed from: dc */
    void m5418dc(SimpleDraweeView simpleDraweeView, Picture.ImageUri imageUri, int i);

    /* JADX INFO: renamed from: dd */
    boolean m5419dd();

    /* JADX INFO: renamed from: de */
    int m5420de();

    /* JADX INFO: renamed from: dj */
    boolean m5421dj();

    /* JADX INFO: renamed from: dm */
    void m5422dm(Act act, a.a aVar);

    /* JADX INFO: renamed from: dn */
    Intent m5423dn(Context context, boolean z, String str);

    /* JADX INFO: renamed from: dp */
    String m5424dp(long j);

    /* JADX INFO: renamed from: ds */
    boolean m5425ds();

    /* JADX INFO: renamed from: e2 */
    boolean m5426e2();

    /* JADX INFO: renamed from: ea */
    void m5427ea(Act act, PurchaseType purchaseType, d30 d30Var, d30 d30Var2);

    /* JADX INFO: renamed from: eg */
    boolean m5428eg();

    /* JADX INFO: renamed from: eh */
    void m5429eh(Act act);

    /* JADX INFO: renamed from: ei */
    void m5430ei(String str);

    /* JADX INFO: renamed from: en */
    void m5431en();

    /* JADX INFO: renamed from: eo */
    void m5432eo(Act act, String str, d30 d30Var, d30 d30Var2);

    /* JADX INFO: renamed from: fb */
    CharSequence m5433fb(User user);

    /* JADX INFO: renamed from: ff */
    boolean m5434ff(String str);

    /* JADX INFO: renamed from: fg */
    void m5435fg(Act act);

    /* JADX INFO: renamed from: fh */
    c<View> m5436fh(Act act);

    /* JADX INFO: renamed from: fl */
    void m5437fl();

    /* JADX INFO: renamed from: fm */
    boolean m5438fm();

    /* JADX INFO: renamed from: fo */
    int m5439fo();

    /* JADX INFO: renamed from: fr */
    void m5440fr(Act act, d30 d30Var, d30 d30Var2);

    /* JADX INFO: renamed from: g5 */
    c<List<Merchandise>> m5441g5(Context context, List<Merchandise> list);

    /* JADX INFO: renamed from: gd */
    boolean m5442gd();

    /* JADX INFO: renamed from: gl */
    String m5443gl();

    /* JADX INFO: renamed from: h5 */
    boolean m5444h5();

    /* JADX INFO: renamed from: h7 */
    int m5445h7();

    /* JADX INFO: renamed from: ha */
    void m5446ha(Act act, CityCData cityCData);

    /* JADX INFO: renamed from: hc */
    String m5447hc(Context context, User user);

    /* JADX INFO: renamed from: he */
    boolean m5448he(Act act);

    /* JADX INFO: renamed from: hg */
    <T extends Act> Act.w m5449hg(T t);

    /* JADX INFO: renamed from: hl */
    boolean m5450hl();

    /* JADX INFO: renamed from: hm */
    boolean m5451hm();

    /* JADX INFO: renamed from: hn */
    int m5452hn();

    /* JADX INFO: renamed from: ho */
    void m5453ho(Act act, User user);

    /* JADX INFO: renamed from: hp */
    String m5454hp();

    /* JADX INFO: renamed from: hq */
    boolean m5455hq(View view);

    /* JADX INFO: renamed from: ht */
    boolean m5456ht();

    /* JADX INFO: renamed from: i0 */
    c<View> m5457i0(Act act);

    /* JADX INFO: renamed from: i6 */
    void m5458i6(Act act, String str, Privilege privilege);

    /* JADX INFO: renamed from: ij */
    boolean m5459ij();

    /* JADX INFO: renamed from: in */
    void m5460in(float f);

    /* JADX INFO: renamed from: j3 */
    boolean m5461j3();

    /* JADX INFO: renamed from: jh */
    boolean m5462jh();

    /* JADX INFO: renamed from: jj */
    boolean m5463jj();

    /* JADX INFO: renamed from: jl */
    void m5464jl(Context context, String str);

    /* JADX INFO: renamed from: jr */
    Intent m5465jr(Context context, String str, String str2, boolean z);

    /* JADX INFO: renamed from: k */
    boolean m5466k();

    /* JADX INFO: renamed from: k4 */
    boolean m5467k4();

    /* JADX INFO: renamed from: kb */
    boolean m5468kb();

    /* JADX INFO: renamed from: kh */
    LiteraturesComments m5469kh(String str, String str2);

    /* JADX INFO: renamed from: kp */
    boolean m5470kp(boolean z);

    /* JADX INFO: renamed from: l1 */
    void m5471l1(Act act, String str);

    /* JADX INFO: renamed from: l6 */
    boolean m5472l6();

    /* JADX INFO: renamed from: lc */
    boolean m5473lc();

    /* JADX INFO: renamed from: lh */
    boolean m5474lh();

    /* JADX INFO: renamed from: lq */
    String m5475lq();

    /* JADX INFO: renamed from: lr */
    c<View> m5476lr(Act act);

    /* JADX INFO: renamed from: ls */
    double m5477ls();

    /* JADX INFO: renamed from: m2 */
    boolean m5478m2();

    /* JADX INFO: renamed from: m3 */
    boolean m5479m3();

    /* JADX INFO: renamed from: m7 */
    boolean m5480m7();

    /* JADX INFO: renamed from: m9 */
    int m5481m9();

    /* JADX INFO: renamed from: mb */
    String m5482mb();

    /* JADX INFO: renamed from: me */
    lwl m5483me(Act act);

    /* JADX INFO: renamed from: mh */
    void m5484mh(eyl eylVar, Active active);

    /* JADX INFO: renamed from: mi */
    String m5485mi(int i);

    /* JADX INFO: renamed from: mo */
    boolean m5486mo();

    /* JADX INFO: renamed from: mt */
    Intent m5487mt(Act act, String str);

    /* JADX INFO: renamed from: n8 */
    Intent m5488n8(Act act, ArrayList<String> arrayList, int i, ArrayList<String> arrayList2, String str);

    /* JADX INFO: renamed from: nk */
    Intent m5489nk(Context context, String str, int i);

    /* JADX INFO: renamed from: nr */
    int m5490nr();

    /* JADX INFO: renamed from: o6 */
    boolean m5491o6();

    /* JADX INFO: renamed from: oc */
    String m5492oc();

    /* JADX INFO: renamed from: og */
    void m5493og();

    /* JADX INFO: renamed from: oi */
    j760<String, String> m5494oi(int i);

    /* JADX INFO: renamed from: op */
    void m5495op(@NotNull Act act, d30 d30Var);

    /* JADX INFO: renamed from: p0 */
    boolean m5496p0();

    /* JADX INFO: renamed from: pf */
    boolean m5497pf(Context context);

    /* JADX INFO: renamed from: pg */
    void m5498pg(Act act, g30<PurchaseType, Act, String> g30Var, int i, String str);

    /* JADX INFO: renamed from: pi */
    String m5499pi(int i);

    /* JADX INFO: renamed from: pl */
    void m5500pl(Act act, String str, View view, boolean z);

    /* JADX INFO: renamed from: pp */
    void m5501pp(Act act);

    /* JADX INFO: renamed from: pr */
    void m5502pr(Act act, String str, Privilege privilege);

    /* JADX INFO: renamed from: q0 */
    boolean m5503q0();

    /* JADX INFO: renamed from: q6 */
    void m5504q6(Act act, String str, e30<PurchaseType> e30Var);

    /* JADX INFO: renamed from: qb */
    void m5505qb(Act act, String str, View view);

    /* JADX INFO: renamed from: qd */
    void m5506qd(Context context, String str, String str2);

    /* JADX INFO: renamed from: qj */
    String m5507qj(User user);

    /* JADX INFO: renamed from: qk */
    void m5508qk(Act act);

    /* JADX INFO: renamed from: qm */
    void m5509qm(Act act, String str, Privilege privilege, e30<PurchaseType> e30Var);

    /* JADX INFO: renamed from: qt */
    boolean m5510qt();

    /* JADX INFO: renamed from: r6 */
    void m5511r6(Act act, String str, Privilege privilege, e30<PurchaseType> e30Var, d30 d30Var);

    /* JADX INFO: renamed from: rc */
    boolean m5512rc();

    /* JADX INFO: renamed from: rd */
    void m5513rd(eyl eylVar);

    /* JADX INFO: renamed from: re */
    int m5514re();

    /* JADX INFO: renamed from: ri */
    boolean m5515ri();

    /* JADX INFO: renamed from: rj */
    Intent m5516rj(Act act, String str);

    /* JADX INFO: renamed from: rl */
    CharSequence m5517rl(Merchandise merchandise, @ColorInt int i);

    /* JADX INFO: renamed from: rn */
    void m5518rn(User user, Frag frag);

    /* JADX INFO: renamed from: s */
    boolean m5519s();

    /* JADX INFO: renamed from: s3 */
    boolean m5520s3();

    /* JADX INFO: renamed from: s6 */
    boolean m5521s6();

    /* JADX INFO: renamed from: s7 */
    void m5522s7(Act act, String str, View view, e30<Boolean> e30Var);

    /* JADX INFO: renamed from: s8 */
    boolean m5523s8();

    /* JADX INFO: renamed from: sf */
    boolean m5524sf();

    void showSeeDialog(Act act, d30 d30Var, String str);

    /* JADX INFO: renamed from: si */
    boolean m5525si();

    /* JADX INFO: renamed from: sk */
    int m5526sk(String str);

    /* JADX INFO: renamed from: sl */
    String m5527sl();

    /* JADX INFO: renamed from: sp */
    void m5528sp(Act act);

    /* JADX INFO: renamed from: ss */
    void m5529ss(User user, VDraweeView vDraweeView, LinearLayout linearLayout, Act act);

    /* JADX INFO: renamed from: st */
    void m5530st(Act act, String str, CharSequence charSequence, String str2, String str3, int i, int i2, int i3, boolean z, ViewOutlineProvider viewOutlineProvider, cwf0 cwf0Var, d30 d30Var, CompoundButton.OnCheckedChangeListener onCheckedChangeListener);

    /* JADX INFO: renamed from: ta */
    boolean m5531ta();

    /* JADX INFO: renamed from: tc */
    String m5532tc();

    /* JADX INFO: renamed from: tk */
    void m5533tk(Act act);

    /* JADX INFO: renamed from: tn */
    String m5534tn();

    /* JADX INFO: renamed from: ts */
    boolean m5535ts(int i);

    /* JADX INFO: renamed from: tt */
    boolean m5536tt();

    /* JADX INFO: renamed from: u5 */
    boolean m5537u5();

    /* JADX INFO: renamed from: ug */
    void m5538ug(Activity activity, Uri uri);

    /* JADX INFO: renamed from: uh */
    boolean m5539uh();

    /* JADX INFO: renamed from: um */
    c<String> m5540um();

    /* JADX INFO: renamed from: un */
    boolean m5541un();

    /* JADX INFO: renamed from: uo */
    void m5542uo(Throwable th);

    /* JADX INFO: renamed from: v4 */
    boolean m5543v4();

    /* JADX INFO: renamed from: v7 */
    void m5544v7(Act act, User user, int i, boolean z);

    /* JADX INFO: renamed from: vb */
    boolean m5545vb(User user, CoreLikers.C0145a c0145a);

    /* JADX INFO: renamed from: vc */
    int m5546vc();

    /* JADX INFO: renamed from: vh */
    void m5547vh(Act act);

    /* JADX INFO: renamed from: vl */
    nx0 m5548vl(PutongCoreAct putongCoreAct);

    /* JADX INFO: renamed from: vo */
    String m5549vo(String str);

    /* JADX INFO: renamed from: vs */
    void m5550vs(eyl eylVar, String str, FreeTrialOperateResult freeTrialOperateResult);

    /* JADX INFO: renamed from: w */
    boolean m5551w();

    /* JADX INFO: renamed from: w6 */
    boolean m5552w6();

    /* JADX INFO: renamed from: wa */
    void m5553wa(String str);

    /* JADX INFO: renamed from: we */
    c<HometownSuggest> m5554we();

    /* JADX INFO: renamed from: wh */
    void m5555wh(Act act, String str, e30<PurchaseType> e30Var, d30 d30Var, d30 d30Var2, Privilege privilege);

    /* JADX INFO: renamed from: wi */
    void m5556wi(Act act, boolean z);

    /* JADX INFO: renamed from: wk */
    void m5557wk(User user);

    /* JADX INFO: renamed from: wp */
    String m5558wp();

    /* JADX INFO: renamed from: wr */
    void m5559wr(Act act, String str, Privilege privilege);

    /* JADX INFO: renamed from: ws */
    long m5560ws();

    /* JADX INFO: renamed from: wt */
    void m5561wt(Act act, String str, Act.w wVar);

    /* JADX INFO: renamed from: x8 */
    c<View> m5562x8(Act act, d30 d30Var);

    /* JADX INFO: renamed from: xb */
    String m5563xb();

    /* JADX INFO: renamed from: xg */
    void m5564xg(Act act);

    /* JADX INFO: renamed from: xo */
    ProfileCompletionConfig m5565xo();

    /* JADX INFO: renamed from: ye */
    void m5566ye(Act act, g30<PurchaseType, Act, String> g30Var);

    /* JADX INFO: renamed from: yl */
    CharSequence m5567yl(User user);

    /* JADX INFO: renamed from: z1 */
    boolean m5568z1();

    /* JADX INFO: renamed from: z6 */
    int m5569z6();

    /* JADX INFO: renamed from: z7 */
    boolean m5570z7();

    /* JADX INFO: renamed from: z9 */
    boolean m5571z9();

    /* JADX INFO: renamed from: za */
    qed0.a m5572za(int i, int i2);

    /* JADX INFO: renamed from: zc */
    int m5573zc(Relationship relationship);

    /* JADX INFO: renamed from: zg */
    boolean m5574zg();

    /* JADX INFO: renamed from: zi */
    boolean m5575zi(Act act);

    /* JADX INFO: renamed from: zj */
    String m5576zj(@NotNull User user);

    /* JADX INFO: renamed from: zq */
    void m5577zq(Act act, boolean z);
}
