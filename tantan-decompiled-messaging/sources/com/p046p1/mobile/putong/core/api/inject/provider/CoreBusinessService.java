package com.p046p1.mobile.putong.core.api.inject.provider;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.C4317a;
import com.p046p1.mobile.android.app.Frag;
import com.p046p1.mobile.putong.app.PutongFrag;
import com.p046p1.mobile.putong.core.PutongCoreAct;
import com.p046p1.mobile.putong.core.api.CoreLikers;
import com.p046p1.mobile.putong.core.data.Active;
import com.p046p1.mobile.putong.core.data.CityCBanner;
import com.p046p1.mobile.putong.core.data.CityCData;
import com.p046p1.mobile.putong.core.data.FreeTrialOperateResult;
import com.p046p1.mobile.putong.core.data.HometownSuggest;
import com.p046p1.mobile.putong.core.data.LikedUser;
import com.p046p1.mobile.putong.core.data.LiteraturesComments;
import com.p046p1.mobile.putong.core.data.Merchandise;
import com.p046p1.mobile.putong.core.data.NewTags;
import com.p046p1.mobile.putong.core.data.Privilege;
import com.p046p1.mobile.putong.core.data.ProfileCompletionConfig;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.data.RoamedLocationData;
import com.p046p1.mobile.putong.core.data.SummarizedPrivilegePrice;
import com.p046p1.mobile.putong.core.data.SwitchConvNextConfig;
import com.p046p1.mobile.putong.core.data.VirtualCardType;
import com.p046p1.mobile.putong.core.newui.messages.business.BusinessEntranceStyle;
import com.p046p1.mobile.putong.data.Counter;
import com.p046p1.mobile.putong.data.GPSkuDetails;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.NavigationCardIntent;
import com.p046p1.mobile.putong.data.OmsTagUserCounts;
import com.p046p1.mobile.putong.data.Picture;
import com.p046p1.mobile.putong.data.QualificationType;
import com.p046p1.mobile.putong.data.Relationship;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.android.injecter.facade.template.IProvider;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p133rx.C22306c;
import p147v.VDraweeView;
import p147v.VFrame;
import p149l.cwf0;
import p149l.d30;
import p149l.e30;
import p149l.eyl;
import p149l.f5m;
import p149l.g30;
import p149l.j760;
import p149l.l5j0;
import p149l.lwl;
import p149l.n87;
import p149l.nx0;
import p149l.qed0;
import p149l.v9j;

/* JADX INFO: loaded from: classes9.dex */
public interface CoreBusinessService extends IProvider, n87 {
    /* JADX INFO: renamed from: A4 */
    void mo33280A4(Act act);

    /* JADX INFO: renamed from: A7 */
    Intent mo33281A7(Act act);

    /* JADX INFO: renamed from: A9 */
    void mo33282A9(Act act, String str);

    /* JADX INFO: renamed from: Ab */
    boolean mo33283Ab(PurchaseType purchaseType);

    /* JADX INFO: renamed from: Ad */
    void mo33284Ad(Act act, String str, View view, e30<Boolean> e30Var);

    /* JADX INFO: renamed from: Ak */
    boolean mo33285Ak(List<OmsTagUserCounts> list);

    /* JADX INFO: renamed from: Al */
    String mo33286Al(Media media);

    /* JADX INFO: renamed from: Ao */
    void mo33287Ao(boolean z, boolean z2, boolean z3, User user, Act act, String str, boolean z4);

    /* JADX INFO: renamed from: B7 */
    boolean mo33288B7();

    /* JADX INFO: renamed from: B9 */
    float mo33289B9();

    /* JADX INFO: renamed from: Bb */
    void mo33290Bb(Act act);

    /* JADX INFO: renamed from: Bc */
    CharSequence mo33291Bc(User user, Context context, int[] iArr);

    /* JADX INFO: renamed from: Be */
    void mo33292Be();

    /* JADX INFO: renamed from: Bn */
    long mo33293Bn();

    /* JADX INFO: renamed from: Bp */
    void mo33294Bp(PutongFrag putongFrag, int i);

    /* JADX INFO: renamed from: C7 */
    void mo33295C7(Act act, CityCBanner cityCBanner);

    /* JADX INFO: renamed from: C9 */
    void mo33296C9(View view, BusinessEntranceStyle businessEntranceStyle);

    /* JADX INFO: renamed from: Cc */
    Act.AbstractC4304w mo33297Cc(View view, e30<Boolean> e30Var);

    /* JADX INFO: renamed from: Cj */
    String mo33298Cj();

    /* JADX INFO: renamed from: Ck */
    int mo33299Ck();

    /* JADX INFO: renamed from: Cm */
    int mo33300Cm();

    /* JADX INFO: renamed from: Cs */
    CharSequence mo33301Cs(User user, User user2);

    /* JADX INFO: renamed from: D6 */
    String mo33302D6();

    /* JADX INFO: renamed from: Dc */
    C22306c<View> mo33303Dc(Act act, d30 d30Var);

    /* JADX INFO: renamed from: De */
    boolean mo33304De();

    /* JADX INFO: renamed from: Dl */
    void mo33305Dl(Act act, User user, String str, d30 d30Var);

    /* JADX INFO: renamed from: Dn */
    boolean mo33306Dn(QualificationType qualificationType);

    /* JADX INFO: renamed from: E5 */
    C22306c<View> mo33307E5(Act act);

    /* JADX INFO: renamed from: E9 */
    void mo33308E9();

    /* JADX INFO: renamed from: Eb */
    void mo33309Eb(Act act);

    /* JADX INFO: renamed from: Ef */
    void mo33310Ef(eyl eylVar, String str);

    /* JADX INFO: renamed from: En */
    boolean mo33311En();

    /* JADX INFO: renamed from: Eo */
    void mo33312Eo(Act act, PurchaseType purchaseType, boolean z, d30 d30Var, d30 d30Var2, String str);

    /* JADX INFO: renamed from: Eq */
    void mo33313Eq(Act act, String str, d30 d30Var, Privilege privilege, boolean z, User user);

    /* JADX INFO: renamed from: Es */
    boolean mo33314Es();

    /* JADX INFO: renamed from: F0 */
    String mo33315F0();

    /* JADX INFO: renamed from: F2 */
    String mo33316F2();

    /* JADX INFO: renamed from: F4 */
    boolean mo33317F4();

    /* JADX INFO: renamed from: F9 */
    boolean mo33318F9(List<String> list);

    /* JADX INFO: renamed from: Fe */
    void mo33319Fe(Act act);

    /* JADX INFO: renamed from: Fi */
    String mo33320Fi();

    /* JADX INFO: renamed from: G7 */
    boolean mo33321G7();

    /* JADX INFO: renamed from: G8 */
    String mo33322G8();

    /* JADX INFO: renamed from: Gd */
    void mo33323Gd(Act act, String str, Privilege privilege, PurchaseType purchaseType, e30<PurchaseType> e30Var, int i, d30 d30Var, d30 d30Var2, String str2, Object obj, boolean z);

    /* JADX INFO: renamed from: Gf */
    boolean mo33324Gf();

    /* JADX INFO: renamed from: Gg */
    int mo33325Gg();

    /* JADX INFO: renamed from: Gl */
    int mo33326Gl();

    /* JADX INFO: renamed from: Go */
    void mo33327Go(Act act, d30 d30Var, PurchaseType purchaseType, boolean z, boolean z2);

    /* JADX INFO: renamed from: Gq */
    void mo33328Gq(Act act);

    /* JADX INFO: renamed from: H8 */
    boolean mo33329H8(@NotNull Date date);

    /* JADX INFO: renamed from: H9 */
    String mo33330H9();

    /* JADX INFO: renamed from: Hc */
    void mo33331Hc(Act act, d30 d30Var, v9j<Boolean> v9jVar);

    /* JADX INFO: renamed from: Hd */
    boolean mo33332Hd();

    /* JADX INFO: renamed from: Hi */
    boolean mo33333Hi();

    /* JADX INFO: renamed from: Hk */
    Intent mo33334Hk(Act act);

    /* JADX INFO: renamed from: Hl */
    int mo33335Hl(String str);

    /* JADX INFO: renamed from: Ho */
    boolean mo33336Ho();

    /* JADX INFO: renamed from: Hr */
    boolean mo33337Hr();

    /* JADX INFO: renamed from: I9 */
    void mo33338I9(Frag frag, User user);

    /* JADX INFO: renamed from: Ie */
    String mo33339Ie();

    /* JADX INFO: renamed from: If */
    boolean mo33340If();

    /* JADX INFO: renamed from: Il */
    String mo33341Il();

    /* JADX INFO: renamed from: Im */
    void mo33342Im(int i, ImageView imageView, boolean z);

    /* JADX INFO: renamed from: Iq */
    String mo33343Iq();

    /* JADX INFO: renamed from: J6 */
    void mo33344J6(Context context);

    /* JADX INFO: renamed from: J7 */
    void mo33345J7(Act act, PurchaseType purchaseType, d30 d30Var, d30 d30Var2);

    /* JADX INFO: renamed from: Ja */
    SwitchConvNextConfig mo33346Ja();

    /* JADX INFO: renamed from: Jj */
    String mo33347Jj();

    /* JADX INFO: renamed from: Jl */
    void mo33348Jl(Act act);

    /* JADX INFO: renamed from: K4 */
    boolean mo33349K4();

    /* JADX INFO: renamed from: K6 */
    Intent mo33350K6(Context context);

    /* JADX INFO: renamed from: Kc */
    void mo33351Kc(Act act, int i, d30 d30Var);

    /* JADX INFO: renamed from: Kf */
    boolean mo33352Kf();

    /* JADX INFO: renamed from: Kj */
    boolean mo33353Kj();

    /* JADX INFO: renamed from: Kp */
    int mo33354Kp();

    /* JADX INFO: renamed from: Ks */
    boolean mo33355Ks(Privilege privilege);

    /* JADX INFO: renamed from: L6 */
    void mo33356L6(Act act, String str, Privilege privilege, User user);

    /* JADX INFO: renamed from: L8 */
    String mo33357L8();

    /* JADX INFO: renamed from: L9 */
    CharSequence mo33358L9(User user, View view, TextView textView);

    /* JADX INFO: renamed from: La */
    List<NewTags> mo33359La(List<String> list);

    /* JADX INFO: renamed from: Lb */
    String mo33360Lb();

    /* JADX INFO: renamed from: Ld */
    boolean mo33361Ld(@Nullable Counter counter);

    /* JADX INFO: renamed from: Lf */
    void mo33362Lf(Act act, String str, Privilege privilege, e30<PurchaseType> e30Var, e30<Boolean> e30Var2);

    /* JADX INFO: renamed from: Lm */
    Intent mo33363Lm(Act act, ArrayList<String> arrayList, int i, ArrayList<String> arrayList2);

    /* JADX INFO: renamed from: Lp */
    void mo33364Lp(SpannableString spannableString, String str, String str2, int i, int i2, int i3, int i4);

    /* JADX INFO: renamed from: Mb */
    boolean mo33365Mb();

    /* JADX INFO: renamed from: Mc */
    void mo33366Mc(Act act, String str);

    /* JADX INFO: renamed from: Me */
    void mo33367Me(Act act, User user, String str, d30 d30Var);

    /* JADX INFO: renamed from: Mf */
    boolean mo33368Mf();

    /* JADX INFO: renamed from: Mi */
    boolean mo33369Mi();

    /* JADX INFO: renamed from: Mj */
    f5m mo33370Mj(FrameLayout frameLayout, String str, RecyclerView.AbstractC0582t abstractC0582t);

    /* JADX INFO: renamed from: Mp */
    void mo33371Mp(Act act, User user, e30<String> e30Var, boolean z);

    /* JADX INFO: renamed from: Mr */
    void mo33372Mr(Act act, String str, d30 d30Var, d30 d30Var2, e30<PurchaseType> e30Var);

    /* JADX INFO: renamed from: N7 */
    int mo33373N7();

    /* JADX INFO: renamed from: N8 */
    boolean mo33374N8();

    /* JADX INFO: renamed from: Nf */
    int mo33375Nf();

    /* JADX INFO: renamed from: Nm */
    int mo33376Nm();

    /* JADX INFO: renamed from: Nn */
    void mo33377Nn(Act act, String str, View view, boolean z);

    /* JADX INFO: renamed from: No */
    boolean mo33378No();

    /* JADX INFO: renamed from: Np */
    boolean mo33379Np();

    /* JADX INFO: renamed from: O */
    boolean mo33380O();

    /* JADX INFO: renamed from: O1 */
    String mo33381O1();

    /* JADX INFO: renamed from: O7 */
    boolean mo33382O7();

    /* JADX INFO: renamed from: O8 */
    boolean mo33383O8();

    /* JADX INFO: renamed from: O9 */
    Intent mo33384O9(Act act, String str, boolean z, ResultReceiver resultReceiver);

    /* JADX INFO: renamed from: Ob */
    String mo33385Ob(int i, String str);

    /* JADX INFO: renamed from: Oo */
    boolean mo33386Oo();

    /* JADX INFO: renamed from: Op */
    boolean mo33387Op();

    /* JADX INFO: renamed from: P7 */
    boolean mo33388P7();

    /* JADX INFO: renamed from: P8 */
    int mo33389P8();

    /* JADX INFO: renamed from: Ph */
    boolean mo33390Ph();

    /* JADX INFO: renamed from: Pl */
    void mo33391Pl(boolean z, View view);

    /* JADX INFO: renamed from: Po */
    void mo33392Po(Act act);

    /* JADX INFO: renamed from: Q8 */
    void mo33393Q8(Act act, RoamedLocationData roamedLocationData);

    /* JADX INFO: renamed from: Qb */
    boolean mo33394Qb();

    /* JADX INFO: renamed from: Qp */
    void mo33395Qp(Activity activity);

    /* JADX INFO: renamed from: Qr */
    int mo33396Qr();

    /* JADX INFO: renamed from: R6 */
    String mo33397R6();

    /* JADX INFO: renamed from: Ri */
    void mo33398Ri(boolean z);

    /* JADX INFO: renamed from: Rj */
    Intent mo33399Rj(Act act, String str, LikedUser likedUser);

    /* JADX INFO: renamed from: Rl */
    String mo33400Rl(int i);

    /* JADX INFO: renamed from: Rm */
    void mo33401Rm(Act act, String str);

    /* JADX INFO: renamed from: Rn */
    boolean mo33402Rn();

    /* JADX INFO: renamed from: Rr */
    void mo33403Rr(long j);

    /* JADX INFO: renamed from: Sc */
    void mo33404Sc(Act act, String str, e30<PurchaseType> e30Var);

    /* JADX INFO: renamed from: Sh */
    void mo33405Sh();

    /* JADX INFO: renamed from: Sk */
    boolean mo33406Sk();

    /* JADX INFO: renamed from: Sl */
    void mo33407Sl(Act act, String str, Privilege privilege, d30 d30Var, Object obj);

    /* JADX INFO: renamed from: Sm */
    C22306c<Optional<List<GPSkuDetails>>> mo33408Sm(Context context, ArrayList<String> arrayList, boolean z, long j);

    /* JADX INFO: renamed from: Sn */
    void mo33409Sn(Context context, String str, int i, boolean z, String str2);

    /* JADX INFO: renamed from: So */
    void mo33410So(eyl eylVar);

    /* JADX INFO: renamed from: Sp */
    boolean mo33411Sp();

    /* JADX INFO: renamed from: Sq */
    Intent mo33412Sq(Act act, String str);

    /* JADX INFO: renamed from: T9 */
    void mo33413T9(Act act, PurchaseType purchaseType, d30 d30Var, d30 d30Var2, int i);

    /* JADX INFO: renamed from: Ta */
    void mo33414Ta(boolean z);

    /* JADX INFO: renamed from: Tb */
    int mo33415Tb(boolean z);

    /* JADX INFO: renamed from: Td */
    CharSequence mo33416Td(int i);

    /* JADX INFO: renamed from: Th */
    void mo33417Th(String str);

    /* JADX INFO: renamed from: Tj */
    void mo33418Tj(boolean z, User user, VFrame vFrame);

    /* JADX INFO: renamed from: Tl */
    int mo33419Tl(User user);

    /* JADX INFO: renamed from: Tm */
    int mo33420Tm();

    /* JADX INFO: renamed from: Tn */
    int mo33421Tn();

    /* JADX INFO: renamed from: Tq */
    long mo33422Tq();

    /* JADX INFO: renamed from: Tr */
    boolean mo33423Tr();

    /* JADX INFO: renamed from: Ts */
    List<String> mo33424Ts(List<String> list);

    /* JADX INFO: renamed from: U */
    boolean mo33425U();

    /* JADX INFO: renamed from: U7 */
    void mo33426U7(Act act, SummarizedPrivilegePrice summarizedPrivilegePrice, d30 d30Var, d30 d30Var2);

    /* JADX INFO: renamed from: Ub */
    String mo33427Ub(Media media);

    /* JADX INFO: renamed from: Ue */
    void mo33428Ue(Act act, boolean z);

    /* JADX INFO: renamed from: Uh */
    void mo33429Uh(Act act, String str);

    /* JADX INFO: renamed from: Un */
    String mo33430Un(VirtualCardType virtualCardType);

    /* JADX INFO: renamed from: Up */
    boolean mo33431Up();

    /* JADX INFO: renamed from: V7 */
    boolean mo33432V7(double d);

    /* JADX INFO: renamed from: Vf */
    boolean mo33433Vf();

    /* JADX INFO: renamed from: Vl */
    PurchaseType mo33434Vl();

    /* JADX INFO: renamed from: W9 */
    boolean mo33435W9();

    /* JADX INFO: renamed from: We */
    boolean mo33436We();

    /* JADX INFO: renamed from: Wf */
    Intent mo33437Wf(Context context, NavigationCardIntent navigationCardIntent, Map<String, String> map);

    /* JADX INFO: renamed from: Ws */
    void mo33438Ws(Act act, User user, boolean z, boolean z2, User user2);

    /* JADX INFO: renamed from: X5 */
    boolean mo33439X5();

    /* JADX INFO: renamed from: X6 */
    boolean mo33440X6();

    /* JADX INFO: renamed from: Xc */
    void mo33441Xc(Frag frag, String str, View view, e30<Boolean> e30Var);

    /* JADX INFO: renamed from: Xi */
    boolean mo33442Xi();

    /* JADX INFO: renamed from: Xn */
    boolean mo33443Xn();

    /* JADX INFO: renamed from: Xo */
    View mo33444Xo(Act act, ViewGroup viewGroup);

    /* JADX INFO: renamed from: Xq */
    int mo33445Xq();

    /* JADX INFO: renamed from: Xr */
    Intent mo33446Xr(Context context, String str);

    /* JADX INFO: renamed from: Y3 */
    String mo33447Y3();

    /* JADX INFO: renamed from: Y4 */
    int mo33448Y4();

    /* JADX INFO: renamed from: Y9 */
    boolean mo33449Y9();

    /* JADX INFO: renamed from: Yd */
    boolean mo33450Yd();

    /* JADX INFO: renamed from: Yf */
    qed0.C19470a mo33451Yf(int i, int i2);

    /* JADX INFO: renamed from: Yj */
    void mo33452Yj(Act act, User user, VDraweeView vDraweeView, LinearLayout linearLayout);

    /* JADX INFO: renamed from: Yo */
    void mo33453Yo(boolean z);

    /* JADX INFO: renamed from: Yp */
    boolean mo33454Yp();

    /* JADX INFO: renamed from: Z9 */
    int mo33455Z9();

    /* JADX INFO: renamed from: Za */
    void mo33456Za(Act act, String str, Object obj, String str2, boolean z);

    /* JADX INFO: renamed from: Zd */
    void mo33457Zd();

    /* JADX INFO: renamed from: Zh */
    void mo33458Zh(Act act, String str, ArrayList<String> arrayList, C4317a.a aVar);

    /* JADX INFO: renamed from: Zi */
    boolean mo33459Zi();

    /* JADX INFO: renamed from: Zp */
    boolean mo33460Zp();

    /* JADX INFO: renamed from: ad */
    boolean mo33461ad();

    /* JADX INFO: renamed from: ah */
    void mo33462ah(eyl eylVar);

    /* JADX INFO: renamed from: ai */
    List<NewTags> mo33463ai(List<OmsTagUserCounts> list);

    /* JADX INFO: renamed from: aj */
    Intent mo33464aj(Context context, String str);

    /* JADX INFO: renamed from: al */
    String mo33465al();

    /* JADX INFO: renamed from: an */
    void mo33466an(Frag frag, User user);

    /* JADX INFO: renamed from: ap */
    void mo33467ap(Act act, CityCData cityCData);

    /* JADX INFO: renamed from: b3 */
    int mo33468b3();

    /* JADX INFO: renamed from: b9 */
    boolean mo33469b9();

    /* JADX INFO: renamed from: bc */
    int mo33470bc();

    /* JADX INFO: renamed from: bd */
    l5j0 mo33471bd(Act act, String str, d30 d30Var, d30 d30Var2);

    /* JADX INFO: renamed from: bi */
    boolean mo33472bi(String str);

    /* JADX INFO: renamed from: bk */
    String mo33473bk();

    @DrawableRes
    /* JADX INFO: renamed from: c6 */
    int mo33474c6();

    /* JADX INFO: renamed from: c7 */
    String mo33475c7();

    /* JADX INFO: renamed from: ca */
    CharSequence mo33476ca(User user, View view, TextView textView, int i, int i2);

    /* JADX INFO: renamed from: cl */
    boolean mo33477cl(Activity activity);

    /* JADX INFO: renamed from: cm */
    void mo33478cm(Act act, boolean z);

    /* JADX INFO: renamed from: cn */
    boolean mo33479cn();

    /* JADX INFO: renamed from: cr */
    boolean mo33480cr();

    /* JADX INFO: renamed from: dc */
    void mo33481dc(SimpleDraweeView simpleDraweeView, Picture.ImageUri imageUri, int i);

    /* JADX INFO: renamed from: dd */
    boolean mo33482dd();

    /* JADX INFO: renamed from: de */
    int mo33483de();

    /* JADX INFO: renamed from: dj */
    boolean mo33484dj();

    /* JADX INFO: renamed from: dm */
    void mo33485dm(Act act, C4317a.a aVar);

    /* JADX INFO: renamed from: dn */
    Intent mo33486dn(Context context, boolean z, String str);

    /* JADX INFO: renamed from: dp */
    String mo33487dp(long j);

    /* JADX INFO: renamed from: ds */
    boolean mo33488ds();

    /* JADX INFO: renamed from: e2 */
    boolean mo33489e2();

    /* JADX INFO: renamed from: ea */
    void mo33490ea(Act act, PurchaseType purchaseType, d30 d30Var, d30 d30Var2);

    /* JADX INFO: renamed from: eg */
    boolean mo33491eg();

    /* JADX INFO: renamed from: eh */
    void mo33492eh(Act act);

    /* JADX INFO: renamed from: ei */
    void mo33493ei(String str);

    /* JADX INFO: renamed from: en */
    void mo33494en();

    /* JADX INFO: renamed from: eo */
    void mo33495eo(Act act, String str, d30 d30Var, d30 d30Var2);

    /* JADX INFO: renamed from: fb */
    CharSequence mo33496fb(User user);

    /* JADX INFO: renamed from: ff */
    boolean mo33497ff(String str);

    /* JADX INFO: renamed from: fg */
    void mo33498fg(Act act);

    /* JADX INFO: renamed from: fh */
    C22306c<View> mo33499fh(Act act);

    /* JADX INFO: renamed from: fl */
    void mo33500fl();

    /* JADX INFO: renamed from: fm */
    boolean mo33501fm();

    /* JADX INFO: renamed from: fo */
    int mo33502fo();

    /* JADX INFO: renamed from: fr */
    void mo33503fr(Act act, d30 d30Var, d30 d30Var2);

    /* JADX INFO: renamed from: g5 */
    C22306c<List<Merchandise>> mo33504g5(Context context, List<Merchandise> list);

    /* JADX INFO: renamed from: gd */
    boolean mo33505gd();

    /* JADX INFO: renamed from: gl */
    String mo33506gl();

    /* JADX INFO: renamed from: h5 */
    boolean mo33507h5();

    /* JADX INFO: renamed from: h7 */
    int mo33508h7();

    /* JADX INFO: renamed from: ha */
    void mo33509ha(Act act, CityCData cityCData);

    /* JADX INFO: renamed from: hc */
    String mo33510hc(Context context, User user);

    /* JADX INFO: renamed from: he */
    boolean mo33511he(Act act);

    /* JADX INFO: renamed from: hg */
    <T extends Act> Act.AbstractC4304w mo33512hg(T t);

    /* JADX INFO: renamed from: hl */
    boolean mo33513hl();

    /* JADX INFO: renamed from: hm */
    boolean mo33514hm();

    /* JADX INFO: renamed from: hn */
    int mo33515hn();

    /* JADX INFO: renamed from: ho */
    void mo33516ho(Act act, User user);

    /* JADX INFO: renamed from: hp */
    String mo33517hp();

    /* JADX INFO: renamed from: hq */
    boolean mo33518hq(View view);

    /* JADX INFO: renamed from: ht */
    boolean mo33519ht();

    /* JADX INFO: renamed from: i0 */
    C22306c<View> mo33520i0(Act act);

    /* JADX INFO: renamed from: i6 */
    void mo33521i6(Act act, String str, Privilege privilege);

    /* JADX INFO: renamed from: ij */
    boolean mo33522ij();

    /* JADX INFO: renamed from: in */
    void mo33523in(float f);

    /* JADX INFO: renamed from: j3 */
    boolean mo33524j3();

    /* JADX INFO: renamed from: jh */
    boolean mo33525jh();

    /* JADX INFO: renamed from: jj */
    boolean mo33526jj();

    /* JADX INFO: renamed from: jl */
    void mo33527jl(Context context, String str);

    /* JADX INFO: renamed from: jr */
    Intent mo33528jr(Context context, String str, String str2, boolean z);

    /* JADX INFO: renamed from: k */
    boolean mo33529k();

    /* JADX INFO: renamed from: k4 */
    boolean mo33530k4();

    /* JADX INFO: renamed from: kb */
    boolean mo33531kb();

    /* JADX INFO: renamed from: kh */
    LiteraturesComments mo33532kh(String str, String str2);

    /* JADX INFO: renamed from: kp */
    boolean mo33533kp(boolean z);

    /* JADX INFO: renamed from: l1 */
    void mo33534l1(Act act, String str);

    /* JADX INFO: renamed from: l6 */
    boolean mo33535l6();

    /* JADX INFO: renamed from: lc */
    boolean mo33536lc();

    /* JADX INFO: renamed from: lh */
    boolean mo33537lh();

    /* JADX INFO: renamed from: lq */
    String mo33538lq();

    /* JADX INFO: renamed from: lr */
    C22306c<View> mo33539lr(Act act);

    /* JADX INFO: renamed from: ls */
    double mo33540ls();

    /* JADX INFO: renamed from: m2 */
    boolean mo33541m2();

    /* JADX INFO: renamed from: m3 */
    boolean mo33542m3();

    /* JADX INFO: renamed from: m7 */
    boolean mo33543m7();

    /* JADX INFO: renamed from: m9 */
    int mo33544m9();

    /* JADX INFO: renamed from: mb */
    String mo33545mb();

    /* JADX INFO: renamed from: me */
    lwl mo33546me(Act act);

    /* JADX INFO: renamed from: mh */
    void mo33547mh(eyl eylVar, Active active);

    /* JADX INFO: renamed from: mi */
    String mo33548mi(int i);

    /* JADX INFO: renamed from: mo */
    boolean mo33549mo();

    /* JADX INFO: renamed from: mt */
    Intent mo33550mt(Act act, String str);

    /* JADX INFO: renamed from: n8 */
    Intent mo33551n8(Act act, ArrayList<String> arrayList, int i, ArrayList<String> arrayList2, String str);

    /* JADX INFO: renamed from: nk */
    Intent mo33552nk(Context context, String str, int i);

    /* JADX INFO: renamed from: nr */
    int mo33553nr();

    /* JADX INFO: renamed from: o6 */
    boolean mo33554o6();

    /* JADX INFO: renamed from: oc */
    String mo33555oc();

    /* JADX INFO: renamed from: og */
    void mo33556og();

    /* JADX INFO: renamed from: oi */
    j760<String, String> mo33557oi(int i);

    /* JADX INFO: renamed from: op */
    void mo33558op(@NotNull Act act, d30 d30Var);

    /* JADX INFO: renamed from: p0 */
    boolean mo33559p0();

    /* JADX INFO: renamed from: pf */
    boolean mo33560pf(Context context);

    /* JADX INFO: renamed from: pg */
    void mo33561pg(Act act, g30<PurchaseType, Act, String> g30Var, int i, String str);

    /* JADX INFO: renamed from: pi */
    String mo33562pi(int i);

    /* JADX INFO: renamed from: pl */
    void mo33563pl(Act act, String str, View view, boolean z);

    /* JADX INFO: renamed from: pp */
    void mo33564pp(Act act);

    /* JADX INFO: renamed from: pr */
    void mo33565pr(Act act, String str, Privilege privilege);

    /* JADX INFO: renamed from: q0 */
    boolean mo33566q0();

    /* JADX INFO: renamed from: q6 */
    void mo33567q6(Act act, String str, e30<PurchaseType> e30Var);

    /* JADX INFO: renamed from: qb */
    void mo33568qb(Act act, String str, View view);

    /* JADX INFO: renamed from: qd */
    void mo33569qd(Context context, String str, String str2);

    /* JADX INFO: renamed from: qj */
    String mo33570qj(User user);

    /* JADX INFO: renamed from: qk */
    void mo33571qk(Act act);

    /* JADX INFO: renamed from: qm */
    void mo33572qm(Act act, String str, Privilege privilege, e30<PurchaseType> e30Var);

    /* JADX INFO: renamed from: qt */
    boolean mo33573qt();

    /* JADX INFO: renamed from: r6 */
    void mo33574r6(Act act, String str, Privilege privilege, e30<PurchaseType> e30Var, d30 d30Var);

    /* JADX INFO: renamed from: rc */
    boolean mo33575rc();

    /* JADX INFO: renamed from: rd */
    void mo33576rd(eyl eylVar);

    /* JADX INFO: renamed from: re */
    int mo33577re();

    /* JADX INFO: renamed from: ri */
    boolean mo33578ri();

    /* JADX INFO: renamed from: rj */
    Intent mo33579rj(Act act, String str);

    /* JADX INFO: renamed from: rl */
    CharSequence mo33580rl(Merchandise merchandise, @ColorInt int i);

    /* JADX INFO: renamed from: rn */
    void mo33581rn(User user, Frag frag);

    /* JADX INFO: renamed from: s */
    boolean mo33582s();

    /* JADX INFO: renamed from: s3 */
    boolean mo33583s3();

    /* JADX INFO: renamed from: s6 */
    boolean mo33584s6();

    /* JADX INFO: renamed from: s7 */
    void mo33585s7(Act act, String str, View view, e30<Boolean> e30Var);

    /* JADX INFO: renamed from: s8 */
    boolean mo33586s8();

    /* JADX INFO: renamed from: sf */
    boolean mo33587sf();

    void showSeeDialog(Act act, d30 d30Var, String str);

    /* JADX INFO: renamed from: si */
    boolean mo33588si();

    /* JADX INFO: renamed from: sk */
    int mo33589sk(String str);

    /* JADX INFO: renamed from: sl */
    String mo33590sl();

    /* JADX INFO: renamed from: sp */
    void mo33591sp(Act act);

    /* JADX INFO: renamed from: ss */
    void mo33592ss(User user, VDraweeView vDraweeView, LinearLayout linearLayout, Act act);

    /* JADX INFO: renamed from: st */
    void mo33593st(Act act, String str, CharSequence charSequence, String str2, String str3, int i, int i2, int i3, boolean z, ViewOutlineProvider viewOutlineProvider, cwf0 cwf0Var, d30 d30Var, CompoundButton.OnCheckedChangeListener onCheckedChangeListener);

    /* JADX INFO: renamed from: ta */
    boolean mo33594ta();

    /* JADX INFO: renamed from: tc */
    String mo33595tc();

    /* JADX INFO: renamed from: tk */
    void mo33596tk(Act act);

    /* JADX INFO: renamed from: tn */
    String mo33597tn();

    /* JADX INFO: renamed from: ts */
    boolean mo33598ts(int i);

    /* JADX INFO: renamed from: tt */
    boolean mo33599tt();

    /* JADX INFO: renamed from: u5 */
    boolean mo33600u5();

    /* JADX INFO: renamed from: ug */
    void mo33601ug(Activity activity, Uri uri);

    /* JADX INFO: renamed from: uh */
    boolean mo33602uh();

    /* JADX INFO: renamed from: um */
    C22306c<String> mo33603um();

    /* JADX INFO: renamed from: un */
    boolean mo33604un();

    /* JADX INFO: renamed from: uo */
    void mo33605uo(Throwable th);

    /* JADX INFO: renamed from: v4 */
    boolean mo33606v4();

    /* JADX INFO: renamed from: v7 */
    void mo33607v7(Act act, User user, int i, boolean z);

    /* JADX INFO: renamed from: vb */
    boolean mo33608vb(User user, CoreLikers.C4719a c4719a);

    /* JADX INFO: renamed from: vc */
    int mo33609vc();

    /* JADX INFO: renamed from: vh */
    void mo33610vh(Act act);

    /* JADX INFO: renamed from: vl */
    nx0 mo33611vl(PutongCoreAct putongCoreAct);

    /* JADX INFO: renamed from: vo */
    String mo33612vo(String str);

    /* JADX INFO: renamed from: vs */
    void mo33613vs(eyl eylVar, String str, FreeTrialOperateResult freeTrialOperateResult);

    /* JADX INFO: renamed from: w */
    boolean mo33614w();

    /* JADX INFO: renamed from: w6 */
    boolean mo33615w6();

    /* JADX INFO: renamed from: wa */
    void mo33616wa(String str);

    /* JADX INFO: renamed from: we */
    C22306c<HometownSuggest> mo33617we();

    /* JADX INFO: renamed from: wh */
    void mo33618wh(Act act, String str, e30<PurchaseType> e30Var, d30 d30Var, d30 d30Var2, Privilege privilege);

    /* JADX INFO: renamed from: wi */
    void mo33619wi(Act act, boolean z);

    /* JADX INFO: renamed from: wk */
    void mo33620wk(User user);

    /* JADX INFO: renamed from: wp */
    String mo33621wp();

    /* JADX INFO: renamed from: wr */
    void mo33622wr(Act act, String str, Privilege privilege);

    /* JADX INFO: renamed from: ws */
    long mo33623ws();

    /* JADX INFO: renamed from: wt */
    void mo33624wt(Act act, String str, Act.AbstractC4304w abstractC4304w);

    /* JADX INFO: renamed from: x8 */
    C22306c<View> mo33625x8(Act act, d30 d30Var);

    /* JADX INFO: renamed from: xb */
    String mo33626xb();

    /* JADX INFO: renamed from: xg */
    void mo33627xg(Act act);

    /* JADX INFO: renamed from: xo */
    ProfileCompletionConfig mo33628xo();

    /* JADX INFO: renamed from: ye */
    void mo33629ye(Act act, g30<PurchaseType, Act, String> g30Var);

    /* JADX INFO: renamed from: yl */
    CharSequence mo33630yl(User user);

    /* JADX INFO: renamed from: z1 */
    boolean mo33631z1();

    /* JADX INFO: renamed from: z6 */
    int mo33632z6();

    /* JADX INFO: renamed from: z7 */
    boolean mo33633z7();

    /* JADX INFO: renamed from: z9 */
    boolean mo33634z9();

    /* JADX INFO: renamed from: za */
    qed0.C19470a mo33635za(int i, int i2);

    /* JADX INFO: renamed from: zc */
    int mo33636zc(Relationship relationship);

    /* JADX INFO: renamed from: zg */
    boolean mo33637zg();

    /* JADX INFO: renamed from: zi */
    boolean mo33638zi(Act act);

    /* JADX INFO: renamed from: zj */
    String mo33639zj(@NotNull User user);

    /* JADX INFO: renamed from: zq */
    void mo33640zq(Act act, boolean z);
}
