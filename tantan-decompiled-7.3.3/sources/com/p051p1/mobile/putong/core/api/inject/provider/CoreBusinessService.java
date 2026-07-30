package com.p051p1.mobile.putong.core.api.inject.provider;

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
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.C4468a;
import com.p051p1.mobile.android.app.Frag;
import com.p051p1.mobile.putong.app.PutongFrag;
import com.p051p1.mobile.putong.core.PutongCoreAct;
import com.p051p1.mobile.putong.core.api.CoreLikers;
import com.p051p1.mobile.putong.core.data.Active;
import com.p051p1.mobile.putong.core.data.CityCBanner;
import com.p051p1.mobile.putong.core.data.CityCData;
import com.p051p1.mobile.putong.core.data.FreeTrialOperateResult;
import com.p051p1.mobile.putong.core.data.HometownSuggest;
import com.p051p1.mobile.putong.core.data.LikedUser;
import com.p051p1.mobile.putong.core.data.LiteraturesComments;
import com.p051p1.mobile.putong.core.data.Merchandise;
import com.p051p1.mobile.putong.core.data.NewTags;
import com.p051p1.mobile.putong.core.data.Privilege;
import com.p051p1.mobile.putong.core.data.ProfileCompletionConfig;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.data.RoamedLocationData;
import com.p051p1.mobile.putong.core.data.SummarizedPrivilegePrice;
import com.p051p1.mobile.putong.core.data.SwitchConvNextConfig;
import com.p051p1.mobile.putong.core.data.VirtualCardType;
import com.p051p1.mobile.putong.core.newui.messages.business.BusinessEntranceStyle;
import com.p051p1.mobile.putong.data.Counter;
import com.p051p1.mobile.putong.data.GPSkuDetails;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.NavigationCardIntent;
import com.p051p1.mobile.putong.data.OmsTagUserCounts;
import com.p051p1.mobile.putong.data.Picture;
import com.p051p1.mobile.putong.data.QualificationType;
import com.p051p1.mobile.putong.data.Relationship;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.android.injecter.facade.template.IProvider;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p137rx.C22421c;
import p151v.VDraweeView;
import p151v.VFrame;
import p153l.a30;
import p153l.dzl;
import p153l.l4g0;
import p153l.pcj;
import p153l.pej0;
import p153l.pf60;
import p153l.r97;
import p153l.smd0;
import p153l.ux0;
import p153l.v7m;
import p153l.x0m;
import p153l.x20;
import p153l.y20;

/* JADX INFO: loaded from: classes9.dex */
public interface CoreBusinessService extends IProvider, r97 {
    /* JADX INFO: renamed from: A4 */
    void mo34283A4(Act act);

    /* JADX INFO: renamed from: A7 */
    Intent mo34284A7(Act act);

    /* JADX INFO: renamed from: A9 */
    void mo34285A9(Act act, String str);

    /* JADX INFO: renamed from: Ab */
    boolean mo34286Ab(PurchaseType purchaseType);

    /* JADX INFO: renamed from: Ad */
    void mo34287Ad(Act act, String str, View view, y20<Boolean> y20Var);

    /* JADX INFO: renamed from: Ak */
    boolean mo34288Ak(List<OmsTagUserCounts> list);

    /* JADX INFO: renamed from: Al */
    String mo34289Al(Media media);

    /* JADX INFO: renamed from: Ao */
    void mo34290Ao(boolean z, boolean z2, boolean z3, User user, Act act, String str, boolean z4);

    /* JADX INFO: renamed from: B7 */
    boolean mo34291B7();

    /* JADX INFO: renamed from: B9 */
    float mo34292B9();

    /* JADX INFO: renamed from: Bb */
    void mo34293Bb(Act act);

    /* JADX INFO: renamed from: Bc */
    CharSequence mo34294Bc(User user, Context context, int[] iArr);

    /* JADX INFO: renamed from: Be */
    void mo34295Be();

    /* JADX INFO: renamed from: Bn */
    long mo34296Bn();

    /* JADX INFO: renamed from: Bp */
    void mo34297Bp(PutongFrag putongFrag, int i);

    /* JADX INFO: renamed from: C7 */
    void mo34298C7(Act act, CityCBanner cityCBanner);

    /* JADX INFO: renamed from: C9 */
    void mo34299C9(View view, BusinessEntranceStyle businessEntranceStyle);

    /* JADX INFO: renamed from: Cc */
    Act.AbstractC4455w mo34300Cc(View view, y20<Boolean> y20Var);

    /* JADX INFO: renamed from: Cj */
    String mo34301Cj();

    /* JADX INFO: renamed from: Ck */
    int mo34302Ck();

    /* JADX INFO: renamed from: Cm */
    int mo34303Cm();

    /* JADX INFO: renamed from: Cs */
    CharSequence mo34304Cs(User user, User user2);

    /* JADX INFO: renamed from: D6 */
    String mo34305D6();

    /* JADX INFO: renamed from: Dc */
    C22421c<View> mo34306Dc(Act act, x20 x20Var);

    /* JADX INFO: renamed from: De */
    boolean mo34307De();

    /* JADX INFO: renamed from: Dl */
    void mo34308Dl(Act act, User user, String str, x20 x20Var);

    /* JADX INFO: renamed from: Dn */
    boolean mo34309Dn(QualificationType qualificationType);

    /* JADX INFO: renamed from: E5 */
    C22421c<View> mo34310E5(Act act);

    /* JADX INFO: renamed from: E9 */
    void mo34311E9();

    /* JADX INFO: renamed from: Eb */
    void mo34312Eb(Act act);

    /* JADX INFO: renamed from: Ef */
    void mo34313Ef(x0m x0mVar, String str);

    /* JADX INFO: renamed from: En */
    boolean mo34314En();

    /* JADX INFO: renamed from: Eo */
    void mo34315Eo(Act act, PurchaseType purchaseType, boolean z, x20 x20Var, x20 x20Var2, String str);

    /* JADX INFO: renamed from: Eq */
    void mo34316Eq(Act act, String str, x20 x20Var, Privilege privilege, boolean z, User user);

    /* JADX INFO: renamed from: Es */
    boolean mo34317Es();

    /* JADX INFO: renamed from: F0 */
    String mo34318F0();

    /* JADX INFO: renamed from: F2 */
    String mo34319F2();

    /* JADX INFO: renamed from: F4 */
    boolean mo34320F4();

    /* JADX INFO: renamed from: F9 */
    boolean mo34321F9(List<String> list);

    /* JADX INFO: renamed from: Fe */
    void mo34322Fe(Act act);

    /* JADX INFO: renamed from: Fi */
    String mo34323Fi();

    /* JADX INFO: renamed from: G7 */
    boolean mo34324G7();

    /* JADX INFO: renamed from: G8 */
    String mo34325G8();

    /* JADX INFO: renamed from: Gd */
    void mo34326Gd(Act act, String str, Privilege privilege, PurchaseType purchaseType, y20<PurchaseType> y20Var, int i, x20 x20Var, x20 x20Var2, String str2, Object obj, boolean z);

    /* JADX INFO: renamed from: Gf */
    boolean mo34327Gf();

    /* JADX INFO: renamed from: Gg */
    int mo34328Gg();

    /* JADX INFO: renamed from: Gl */
    int mo34329Gl();

    /* JADX INFO: renamed from: Go */
    void mo34330Go(Act act, x20 x20Var, PurchaseType purchaseType, boolean z, boolean z2);

    /* JADX INFO: renamed from: Gq */
    void mo34331Gq(Act act);

    /* JADX INFO: renamed from: H8 */
    boolean mo34332H8(@NotNull Date date);

    /* JADX INFO: renamed from: H9 */
    String mo34333H9();

    /* JADX INFO: renamed from: Hc */
    void mo34334Hc(Act act, x20 x20Var, pcj<Boolean> pcjVar);

    /* JADX INFO: renamed from: Hd */
    boolean mo34335Hd();

    /* JADX INFO: renamed from: Hi */
    boolean mo34336Hi();

    /* JADX INFO: renamed from: Hk */
    Intent mo34337Hk(Act act);

    /* JADX INFO: renamed from: Hl */
    int mo34338Hl(String str);

    /* JADX INFO: renamed from: Ho */
    boolean mo34339Ho();

    /* JADX INFO: renamed from: Hr */
    boolean mo34340Hr();

    /* JADX INFO: renamed from: I9 */
    void mo34341I9(Frag frag, User user);

    /* JADX INFO: renamed from: Ie */
    String mo34342Ie();

    /* JADX INFO: renamed from: If */
    boolean mo34343If();

    /* JADX INFO: renamed from: Il */
    String mo34344Il();

    /* JADX INFO: renamed from: Im */
    void mo34345Im(int i, ImageView imageView, boolean z);

    /* JADX INFO: renamed from: Iq */
    String mo34346Iq();

    /* JADX INFO: renamed from: J6 */
    void mo34347J6(Context context);

    /* JADX INFO: renamed from: J7 */
    void mo34348J7(Act act, PurchaseType purchaseType, x20 x20Var, x20 x20Var2);

    /* JADX INFO: renamed from: Ja */
    SwitchConvNextConfig mo34349Ja();

    /* JADX INFO: renamed from: Jj */
    String mo34350Jj();

    /* JADX INFO: renamed from: Jl */
    void mo34351Jl(Act act);

    /* JADX INFO: renamed from: K4 */
    boolean mo34352K4();

    /* JADX INFO: renamed from: K6 */
    Intent mo34353K6(Context context);

    /* JADX INFO: renamed from: Kc */
    void mo34354Kc(Act act, int i, x20 x20Var);

    /* JADX INFO: renamed from: Kf */
    boolean mo34355Kf();

    /* JADX INFO: renamed from: Kj */
    boolean mo34356Kj();

    /* JADX INFO: renamed from: Kp */
    int mo34357Kp();

    /* JADX INFO: renamed from: Ks */
    boolean mo34358Ks(Privilege privilege);

    /* JADX INFO: renamed from: L6 */
    void mo34359L6(Act act, String str, Privilege privilege, User user);

    /* JADX INFO: renamed from: L8 */
    String mo34360L8();

    /* JADX INFO: renamed from: L9 */
    CharSequence mo34361L9(User user, View view, TextView textView);

    /* JADX INFO: renamed from: La */
    List<NewTags> mo34362La(List<String> list);

    /* JADX INFO: renamed from: Lb */
    String mo34363Lb();

    /* JADX INFO: renamed from: Ld */
    boolean mo34364Ld(@Nullable Counter counter);

    /* JADX INFO: renamed from: Lf */
    void mo34365Lf(Act act, String str, Privilege privilege, y20<PurchaseType> y20Var, y20<Boolean> y20Var2);

    /* JADX INFO: renamed from: Lm */
    Intent mo34366Lm(Act act, ArrayList<String> arrayList, int i, ArrayList<String> arrayList2);

    /* JADX INFO: renamed from: Lp */
    void mo34367Lp(SpannableString spannableString, String str, String str2, int i, int i2, int i3, int i4);

    /* JADX INFO: renamed from: Mb */
    boolean mo34368Mb();

    /* JADX INFO: renamed from: Mc */
    void mo34369Mc(Act act, String str);

    /* JADX INFO: renamed from: Me */
    void mo34370Me(Act act, User user, String str, x20 x20Var);

    /* JADX INFO: renamed from: Mf */
    boolean mo34371Mf();

    /* JADX INFO: renamed from: Mi */
    boolean mo34372Mi();

    /* JADX INFO: renamed from: Mj */
    v7m mo34373Mj(FrameLayout frameLayout, String str, RecyclerView.AbstractC0584t abstractC0584t);

    /* JADX INFO: renamed from: Mp */
    void mo34374Mp(Act act, User user, y20<String> y20Var, boolean z);

    /* JADX INFO: renamed from: Mr */
    void mo34375Mr(Act act, String str, x20 x20Var, x20 x20Var2, y20<PurchaseType> y20Var);

    /* JADX INFO: renamed from: N7 */
    int mo34376N7();

    /* JADX INFO: renamed from: N8 */
    boolean mo34377N8();

    /* JADX INFO: renamed from: Nf */
    int mo34378Nf();

    /* JADX INFO: renamed from: Nm */
    int mo34379Nm();

    /* JADX INFO: renamed from: Nn */
    void mo34380Nn(Act act, String str, View view, boolean z);

    /* JADX INFO: renamed from: No */
    boolean mo34381No();

    /* JADX INFO: renamed from: Np */
    boolean mo34382Np();

    /* JADX INFO: renamed from: O */
    boolean mo34383O();

    /* JADX INFO: renamed from: O1 */
    String mo34384O1();

    /* JADX INFO: renamed from: O7 */
    boolean mo34385O7();

    /* JADX INFO: renamed from: O8 */
    boolean mo34386O8();

    /* JADX INFO: renamed from: O9 */
    Intent mo34387O9(Act act, String str, boolean z, ResultReceiver resultReceiver);

    /* JADX INFO: renamed from: Ob */
    String mo34388Ob(int i, String str);

    /* JADX INFO: renamed from: Oo */
    boolean mo34389Oo();

    /* JADX INFO: renamed from: Op */
    boolean mo34390Op();

    /* JADX INFO: renamed from: P7 */
    boolean mo34391P7();

    /* JADX INFO: renamed from: P8 */
    int mo34392P8();

    /* JADX INFO: renamed from: Ph */
    boolean mo34393Ph();

    /* JADX INFO: renamed from: Pl */
    void mo34394Pl(boolean z, View view);

    /* JADX INFO: renamed from: Po */
    void mo34395Po(Act act);

    /* JADX INFO: renamed from: Q8 */
    void mo34396Q8(Act act, RoamedLocationData roamedLocationData);

    /* JADX INFO: renamed from: Qb */
    boolean mo34397Qb();

    /* JADX INFO: renamed from: Qp */
    void mo34398Qp(Activity activity);

    /* JADX INFO: renamed from: Qr */
    int mo34399Qr();

    /* JADX INFO: renamed from: R6 */
    String mo34400R6();

    /* JADX INFO: renamed from: Ri */
    void mo34401Ri(boolean z);

    /* JADX INFO: renamed from: Rj */
    Intent mo34402Rj(Act act, String str, LikedUser likedUser);

    /* JADX INFO: renamed from: Rl */
    String mo34403Rl(int i);

    /* JADX INFO: renamed from: Rm */
    void mo34404Rm(Act act, String str);

    /* JADX INFO: renamed from: Rn */
    boolean mo34405Rn();

    /* JADX INFO: renamed from: Rr */
    void mo34406Rr(long j);

    /* JADX INFO: renamed from: Sc */
    void mo34407Sc(Act act, String str, y20<PurchaseType> y20Var);

    /* JADX INFO: renamed from: Sh */
    void mo34408Sh();

    /* JADX INFO: renamed from: Sk */
    boolean mo34409Sk();

    /* JADX INFO: renamed from: Sl */
    void mo34410Sl(Act act, String str, Privilege privilege, x20 x20Var, Object obj);

    /* JADX INFO: renamed from: Sm */
    C22421c<Optional<List<GPSkuDetails>>> mo34411Sm(Context context, ArrayList<String> arrayList, boolean z, long j);

    /* JADX INFO: renamed from: Sn */
    void mo34412Sn(Context context, String str, int i, boolean z, String str2);

    /* JADX INFO: renamed from: So */
    void mo34413So(x0m x0mVar);

    /* JADX INFO: renamed from: Sp */
    boolean mo34414Sp();

    /* JADX INFO: renamed from: Sq */
    Intent mo34415Sq(Act act, String str);

    /* JADX INFO: renamed from: T9 */
    void mo34416T9(Act act, PurchaseType purchaseType, x20 x20Var, x20 x20Var2, int i);

    /* JADX INFO: renamed from: Ta */
    void mo34417Ta(boolean z);

    /* JADX INFO: renamed from: Tb */
    int mo34418Tb(boolean z);

    /* JADX INFO: renamed from: Td */
    CharSequence mo34419Td(int i);

    /* JADX INFO: renamed from: Th */
    void mo34420Th(String str);

    /* JADX INFO: renamed from: Tj */
    void mo34421Tj(boolean z, User user, VFrame vFrame);

    /* JADX INFO: renamed from: Tl */
    int mo34422Tl(User user);

    /* JADX INFO: renamed from: Tm */
    int mo34423Tm();

    /* JADX INFO: renamed from: Tn */
    int mo34424Tn();

    /* JADX INFO: renamed from: Tq */
    long mo34425Tq();

    /* JADX INFO: renamed from: Tr */
    boolean mo34426Tr();

    /* JADX INFO: renamed from: Ts */
    List<String> mo34427Ts(List<String> list);

    /* JADX INFO: renamed from: U */
    boolean mo34428U();

    /* JADX INFO: renamed from: U7 */
    void mo34429U7(Act act, SummarizedPrivilegePrice summarizedPrivilegePrice, x20 x20Var, x20 x20Var2);

    /* JADX INFO: renamed from: Ub */
    String mo34430Ub(Media media);

    /* JADX INFO: renamed from: Ue */
    void mo34431Ue(Act act, boolean z);

    /* JADX INFO: renamed from: Uh */
    void mo34432Uh(Act act, String str);

    /* JADX INFO: renamed from: Un */
    String mo34433Un(VirtualCardType virtualCardType);

    /* JADX INFO: renamed from: Up */
    boolean mo34434Up();

    /* JADX INFO: renamed from: V7 */
    boolean mo34435V7(double d);

    /* JADX INFO: renamed from: Vf */
    boolean mo34436Vf();

    /* JADX INFO: renamed from: Vl */
    PurchaseType mo34437Vl();

    /* JADX INFO: renamed from: W9 */
    boolean mo34438W9();

    /* JADX INFO: renamed from: We */
    boolean mo34439We();

    /* JADX INFO: renamed from: Wf */
    Intent mo34440Wf(Context context, NavigationCardIntent navigationCardIntent, Map<String, String> map);

    /* JADX INFO: renamed from: Ws */
    void mo34441Ws(Act act, User user, boolean z, boolean z2, User user2);

    /* JADX INFO: renamed from: X5 */
    boolean mo34442X5();

    /* JADX INFO: renamed from: X6 */
    boolean mo34443X6();

    /* JADX INFO: renamed from: Xc */
    void mo34444Xc(Frag frag, String str, View view, y20<Boolean> y20Var);

    /* JADX INFO: renamed from: Xi */
    boolean mo34445Xi();

    /* JADX INFO: renamed from: Xn */
    boolean mo34446Xn();

    /* JADX INFO: renamed from: Xo */
    View mo34447Xo(Act act, ViewGroup viewGroup);

    /* JADX INFO: renamed from: Xq */
    int mo34448Xq();

    /* JADX INFO: renamed from: Xr */
    Intent mo34449Xr(Context context, String str);

    /* JADX INFO: renamed from: Y3 */
    String mo34450Y3();

    /* JADX INFO: renamed from: Y4 */
    int mo34451Y4();

    /* JADX INFO: renamed from: Y9 */
    boolean mo34452Y9();

    /* JADX INFO: renamed from: Yd */
    boolean mo34453Yd();

    /* JADX INFO: renamed from: Yf */
    smd0.C20104a mo34454Yf(int i, int i2);

    /* JADX INFO: renamed from: Yj */
    void mo34455Yj(Act act, User user, VDraweeView vDraweeView, LinearLayout linearLayout);

    /* JADX INFO: renamed from: Yo */
    void mo34456Yo(boolean z);

    /* JADX INFO: renamed from: Yp */
    boolean mo34457Yp();

    /* JADX INFO: renamed from: Z9 */
    int mo34458Z9();

    /* JADX INFO: renamed from: Za */
    void mo34459Za(Act act, String str, Object obj, String str2, boolean z);

    /* JADX INFO: renamed from: Zd */
    void mo34460Zd();

    /* JADX INFO: renamed from: Zh */
    void mo34461Zh(Act act, String str, ArrayList<String> arrayList, C4468a.a aVar);

    /* JADX INFO: renamed from: Zi */
    boolean mo34462Zi();

    /* JADX INFO: renamed from: Zp */
    boolean mo34463Zp();

    /* JADX INFO: renamed from: ad */
    boolean mo34464ad();

    /* JADX INFO: renamed from: ah */
    void mo34465ah(x0m x0mVar);

    /* JADX INFO: renamed from: ai */
    List<NewTags> mo34466ai(List<OmsTagUserCounts> list);

    /* JADX INFO: renamed from: aj */
    Intent mo34467aj(Context context, String str);

    /* JADX INFO: renamed from: al */
    String mo34468al();

    /* JADX INFO: renamed from: an */
    void mo34469an(Frag frag, User user);

    /* JADX INFO: renamed from: ap */
    void mo34470ap(Act act, CityCData cityCData);

    /* JADX INFO: renamed from: b3 */
    int mo34471b3();

    /* JADX INFO: renamed from: b9 */
    boolean mo34472b9();

    /* JADX INFO: renamed from: bc */
    int mo34473bc();

    /* JADX INFO: renamed from: bd */
    pej0 mo34474bd(Act act, String str, x20 x20Var, x20 x20Var2);

    /* JADX INFO: renamed from: bi */
    boolean mo34475bi(String str);

    /* JADX INFO: renamed from: bk */
    String mo34476bk();

    @DrawableRes
    /* JADX INFO: renamed from: c6 */
    int mo34477c6();

    /* JADX INFO: renamed from: c7 */
    String mo34478c7();

    /* JADX INFO: renamed from: ca */
    CharSequence mo34479ca(User user, View view, TextView textView, int i, int i2);

    /* JADX INFO: renamed from: cl */
    boolean mo34480cl(Activity activity);

    /* JADX INFO: renamed from: cm */
    void mo34481cm(Act act, boolean z);

    /* JADX INFO: renamed from: cn */
    boolean mo34482cn();

    /* JADX INFO: renamed from: cr */
    boolean mo34483cr();

    /* JADX INFO: renamed from: dc */
    void mo34484dc(SimpleDraweeView simpleDraweeView, Picture.ImageUri imageUri, int i);

    /* JADX INFO: renamed from: dd */
    boolean mo34485dd();

    /* JADX INFO: renamed from: de */
    int mo34486de();

    /* JADX INFO: renamed from: dj */
    boolean mo34487dj();

    /* JADX INFO: renamed from: dm */
    void mo34488dm(Act act, C4468a.a aVar);

    /* JADX INFO: renamed from: dn */
    Intent mo34489dn(Context context, boolean z, String str);

    /* JADX INFO: renamed from: dp */
    String mo34490dp(long j);

    /* JADX INFO: renamed from: ds */
    boolean mo34491ds();

    /* JADX INFO: renamed from: e2 */
    boolean mo34492e2();

    /* JADX INFO: renamed from: ea */
    void mo34493ea(Act act, PurchaseType purchaseType, x20 x20Var, x20 x20Var2);

    /* JADX INFO: renamed from: eg */
    boolean mo34494eg();

    /* JADX INFO: renamed from: eh */
    void mo34495eh(Act act);

    /* JADX INFO: renamed from: ei */
    void mo34496ei(String str);

    /* JADX INFO: renamed from: en */
    void mo34497en();

    /* JADX INFO: renamed from: eo */
    void mo34498eo(Act act, String str, x20 x20Var, x20 x20Var2);

    /* JADX INFO: renamed from: fb */
    CharSequence mo34499fb(User user);

    /* JADX INFO: renamed from: ff */
    boolean mo34500ff(String str);

    /* JADX INFO: renamed from: fg */
    void mo34501fg(Act act);

    /* JADX INFO: renamed from: fh */
    C22421c<View> mo34502fh(Act act);

    /* JADX INFO: renamed from: fl */
    void mo34503fl();

    /* JADX INFO: renamed from: fm */
    boolean mo34504fm();

    /* JADX INFO: renamed from: fo */
    int mo34505fo();

    /* JADX INFO: renamed from: fr */
    void mo34506fr(Act act, x20 x20Var, x20 x20Var2);

    /* JADX INFO: renamed from: g5 */
    C22421c<List<Merchandise>> mo34507g5(Context context, List<Merchandise> list);

    /* JADX INFO: renamed from: gd */
    boolean mo34508gd();

    /* JADX INFO: renamed from: gl */
    String mo34509gl();

    /* JADX INFO: renamed from: h5 */
    boolean mo34510h5();

    /* JADX INFO: renamed from: h7 */
    int mo34511h7();

    /* JADX INFO: renamed from: ha */
    void mo34512ha(Act act, CityCData cityCData);

    /* JADX INFO: renamed from: hc */
    String mo34513hc(Context context, User user);

    /* JADX INFO: renamed from: he */
    boolean mo34514he(Act act);

    /* JADX INFO: renamed from: hg */
    <T extends Act> Act.AbstractC4455w mo34515hg(T t);

    /* JADX INFO: renamed from: hl */
    boolean mo34516hl();

    /* JADX INFO: renamed from: hm */
    boolean mo34517hm();

    /* JADX INFO: renamed from: hn */
    int mo34518hn();

    /* JADX INFO: renamed from: ho */
    void mo34519ho(Act act, User user);

    /* JADX INFO: renamed from: hp */
    String mo34520hp();

    /* JADX INFO: renamed from: hq */
    boolean mo34521hq(View view);

    /* JADX INFO: renamed from: ht */
    boolean mo34522ht();

    /* JADX INFO: renamed from: i0 */
    C22421c<View> mo34523i0(Act act);

    /* JADX INFO: renamed from: i6 */
    void mo34524i6(Act act, String str, Privilege privilege);

    /* JADX INFO: renamed from: ij */
    boolean mo34525ij();

    /* JADX INFO: renamed from: in */
    void mo34526in(float f);

    /* JADX INFO: renamed from: j3 */
    boolean mo34527j3();

    /* JADX INFO: renamed from: jh */
    boolean mo34528jh();

    /* JADX INFO: renamed from: jj */
    boolean mo34529jj();

    /* JADX INFO: renamed from: jl */
    void mo34530jl(Context context, String str);

    /* JADX INFO: renamed from: jr */
    Intent mo34531jr(Context context, String str, String str2, boolean z);

    /* JADX INFO: renamed from: k */
    boolean mo34532k();

    /* JADX INFO: renamed from: k4 */
    boolean mo34533k4();

    /* JADX INFO: renamed from: kb */
    boolean mo34534kb();

    /* JADX INFO: renamed from: kh */
    LiteraturesComments mo34535kh(String str, String str2);

    /* JADX INFO: renamed from: kp */
    boolean mo34536kp(boolean z);

    /* JADX INFO: renamed from: l1 */
    void mo34537l1(Act act, String str);

    /* JADX INFO: renamed from: l6 */
    boolean mo34538l6();

    /* JADX INFO: renamed from: lc */
    boolean mo34539lc();

    /* JADX INFO: renamed from: lh */
    boolean mo34540lh();

    /* JADX INFO: renamed from: lq */
    String mo34541lq();

    /* JADX INFO: renamed from: lr */
    C22421c<View> mo34542lr(Act act);

    /* JADX INFO: renamed from: ls */
    double mo34543ls();

    /* JADX INFO: renamed from: m2 */
    boolean mo34544m2();

    /* JADX INFO: renamed from: m3 */
    boolean mo34545m3();

    /* JADX INFO: renamed from: m7 */
    boolean mo34546m7();

    /* JADX INFO: renamed from: m9 */
    int mo34547m9();

    /* JADX INFO: renamed from: mb */
    String mo34548mb();

    /* JADX INFO: renamed from: me */
    dzl mo34549me(Act act);

    /* JADX INFO: renamed from: mh */
    void mo34550mh(x0m x0mVar, Active active);

    /* JADX INFO: renamed from: mi */
    String mo34551mi(int i);

    /* JADX INFO: renamed from: mo */
    boolean mo34552mo();

    /* JADX INFO: renamed from: mt */
    Intent mo34553mt(Act act, String str);

    /* JADX INFO: renamed from: n8 */
    Intent mo34554n8(Act act, ArrayList<String> arrayList, int i, ArrayList<String> arrayList2, String str);

    /* JADX INFO: renamed from: nk */
    Intent mo34555nk(Context context, String str, int i);

    /* JADX INFO: renamed from: nr */
    int mo34556nr();

    /* JADX INFO: renamed from: o6 */
    boolean mo34557o6();

    /* JADX INFO: renamed from: oc */
    String mo34558oc();

    /* JADX INFO: renamed from: og */
    void mo34559og();

    /* JADX INFO: renamed from: oi */
    pf60<String, String> mo34560oi(int i);

    /* JADX INFO: renamed from: op */
    void mo34561op(@NotNull Act act, x20 x20Var);

    /* JADX INFO: renamed from: p0 */
    boolean mo34562p0();

    /* JADX INFO: renamed from: pf */
    boolean mo34563pf(Context context);

    /* JADX INFO: renamed from: pg */
    void mo34564pg(Act act, a30<PurchaseType, Act, String> a30Var, int i, String str);

    /* JADX INFO: renamed from: pi */
    String mo34565pi(int i);

    /* JADX INFO: renamed from: pl */
    void mo34566pl(Act act, String str, View view, boolean z);

    /* JADX INFO: renamed from: pp */
    void mo34567pp(Act act);

    /* JADX INFO: renamed from: pr */
    void mo34568pr(Act act, String str, Privilege privilege);

    /* JADX INFO: renamed from: q0 */
    boolean mo34569q0();

    /* JADX INFO: renamed from: q6 */
    void mo34570q6(Act act, String str, y20<PurchaseType> y20Var);

    /* JADX INFO: renamed from: qb */
    void mo34571qb(Act act, String str, View view);

    /* JADX INFO: renamed from: qd */
    void mo34572qd(Context context, String str, String str2);

    /* JADX INFO: renamed from: qj */
    String mo34573qj(User user);

    /* JADX INFO: renamed from: qk */
    void mo34574qk(Act act);

    /* JADX INFO: renamed from: qm */
    void mo34575qm(Act act, String str, Privilege privilege, y20<PurchaseType> y20Var);

    /* JADX INFO: renamed from: qt */
    boolean mo34576qt();

    /* JADX INFO: renamed from: r6 */
    void mo34577r6(Act act, String str, Privilege privilege, y20<PurchaseType> y20Var, x20 x20Var);

    /* JADX INFO: renamed from: rc */
    boolean mo34578rc();

    /* JADX INFO: renamed from: rd */
    void mo34579rd(x0m x0mVar);

    /* JADX INFO: renamed from: re */
    int mo34580re();

    /* JADX INFO: renamed from: ri */
    boolean mo34581ri();

    /* JADX INFO: renamed from: rj */
    Intent mo34582rj(Act act, String str);

    /* JADX INFO: renamed from: rl */
    CharSequence mo34583rl(Merchandise merchandise, @ColorInt int i);

    /* JADX INFO: renamed from: rn */
    void mo34584rn(User user, Frag frag);

    /* JADX INFO: renamed from: s */
    boolean mo34585s();

    /* JADX INFO: renamed from: s3 */
    boolean mo34586s3();

    /* JADX INFO: renamed from: s6 */
    boolean mo34587s6();

    /* JADX INFO: renamed from: s7 */
    void mo34588s7(Act act, String str, View view, y20<Boolean> y20Var);

    /* JADX INFO: renamed from: s8 */
    boolean mo34589s8();

    /* JADX INFO: renamed from: sf */
    boolean mo34590sf();

    void showSeeDialog(Act act, x20 x20Var, String str);

    /* JADX INFO: renamed from: si */
    boolean mo34591si();

    /* JADX INFO: renamed from: sk */
    int mo34592sk(String str);

    /* JADX INFO: renamed from: sl */
    String mo34593sl();

    /* JADX INFO: renamed from: sp */
    void mo34594sp(Act act);

    /* JADX INFO: renamed from: ss */
    void mo34595ss(User user, VDraweeView vDraweeView, LinearLayout linearLayout, Act act);

    /* JADX INFO: renamed from: st */
    void mo34596st(Act act, String str, CharSequence charSequence, String str2, String str3, int i, int i2, int i3, boolean z, ViewOutlineProvider viewOutlineProvider, l4g0 l4g0Var, x20 x20Var, CompoundButton.OnCheckedChangeListener onCheckedChangeListener);

    /* JADX INFO: renamed from: ta */
    boolean mo34597ta();

    /* JADX INFO: renamed from: tc */
    String mo34598tc();

    /* JADX INFO: renamed from: tk */
    void mo34599tk(Act act);

    /* JADX INFO: renamed from: tn */
    String mo34600tn();

    /* JADX INFO: renamed from: ts */
    boolean mo34601ts(int i);

    /* JADX INFO: renamed from: tt */
    boolean mo34602tt();

    /* JADX INFO: renamed from: u5 */
    boolean mo34603u5();

    /* JADX INFO: renamed from: ug */
    void mo34604ug(Activity activity, Uri uri);

    /* JADX INFO: renamed from: uh */
    boolean mo34605uh();

    /* JADX INFO: renamed from: um */
    C22421c<String> mo34606um();

    /* JADX INFO: renamed from: un */
    boolean mo34607un();

    /* JADX INFO: renamed from: uo */
    void mo34608uo(Throwable th);

    /* JADX INFO: renamed from: v4 */
    boolean mo34609v4();

    /* JADX INFO: renamed from: v7 */
    void mo34610v7(Act act, User user, int i, boolean z);

    /* JADX INFO: renamed from: vb */
    boolean mo34611vb(User user, CoreLikers.C4870a c4870a);

    /* JADX INFO: renamed from: vc */
    int mo34612vc();

    /* JADX INFO: renamed from: vh */
    void mo34613vh(Act act);

    /* JADX INFO: renamed from: vl */
    ux0 mo34614vl(PutongCoreAct putongCoreAct);

    /* JADX INFO: renamed from: vo */
    String mo34615vo(String str);

    /* JADX INFO: renamed from: vs */
    void mo34616vs(x0m x0mVar, String str, FreeTrialOperateResult freeTrialOperateResult);

    /* JADX INFO: renamed from: w */
    boolean mo34617w();

    /* JADX INFO: renamed from: w6 */
    boolean mo34618w6();

    /* JADX INFO: renamed from: wa */
    void mo34619wa(String str);

    /* JADX INFO: renamed from: we */
    C22421c<HometownSuggest> mo34620we();

    /* JADX INFO: renamed from: wh */
    void mo34621wh(Act act, String str, y20<PurchaseType> y20Var, x20 x20Var, x20 x20Var2, Privilege privilege);

    /* JADX INFO: renamed from: wi */
    void mo34622wi(Act act, boolean z);

    /* JADX INFO: renamed from: wk */
    void mo34623wk(User user);

    /* JADX INFO: renamed from: wp */
    String mo34624wp();

    /* JADX INFO: renamed from: wr */
    void mo34625wr(Act act, String str, Privilege privilege);

    /* JADX INFO: renamed from: ws */
    long mo34626ws();

    /* JADX INFO: renamed from: wt */
    void mo34627wt(Act act, String str, Act.AbstractC4455w abstractC4455w);

    /* JADX INFO: renamed from: x8 */
    C22421c<View> mo34628x8(Act act, x20 x20Var);

    /* JADX INFO: renamed from: xb */
    String mo34629xb();

    /* JADX INFO: renamed from: xg */
    void mo34630xg(Act act);

    /* JADX INFO: renamed from: xo */
    ProfileCompletionConfig mo34631xo();

    /* JADX INFO: renamed from: ye */
    void mo34632ye(Act act, a30<PurchaseType, Act, String> a30Var);

    /* JADX INFO: renamed from: yl */
    CharSequence mo34633yl(User user);

    /* JADX INFO: renamed from: z1 */
    boolean mo34634z1();

    /* JADX INFO: renamed from: z6 */
    int mo34635z6();

    /* JADX INFO: renamed from: z7 */
    boolean mo34636z7();

    /* JADX INFO: renamed from: z9 */
    boolean mo34637z9();

    /* JADX INFO: renamed from: za */
    smd0.C20104a mo34638za(int i, int i2);

    /* JADX INFO: renamed from: zc */
    int mo34639zc(Relationship relationship);

    /* JADX INFO: renamed from: zg */
    boolean mo34640zg();

    /* JADX INFO: renamed from: zi */
    boolean mo34641zi(Act act);

    /* JADX INFO: renamed from: zj */
    String mo34642zj(@NotNull User user);

    /* JADX INFO: renamed from: zq */
    void mo34643zq(Act act, boolean z);
}
