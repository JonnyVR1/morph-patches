package p009l;

import android.annotation.SuppressLint;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import androidx.viewpager.widget.ViewPager;
import com.p000p1.mobile.putong.core.newui.admob.NavigationBarAdmobHelper;
import com.p000p1.mobile.putong.core.newui.home.C0029a;
import com.p000p1.mobile.putong.core.newui.home.base.impl.cardbottom.opt.C0032b;
import com.p000p1.mobile.putong.core.newui.home.card.expanded.UserProfileExpandedCardRoot;
import com.p000p1.mobile.putong.core.newui.home.card.expanded.helper.ExpandedCardStyleHelper;
import com.p000p1.mobile.putong.core.newui.home.card.expanded.view.ExpandedCardInforLayout;
import com.p000p1.mobile.putong.core.newui.home.card.expanded.view.ExpandedImageSwitchView;
import com.p000p1.mobile.putong.core.newui.home.views.CardHeadLayoutV2;
import com.p000p1.mobile.putong.core.newui.home.views.CardIntlPictureViewOpt;
import com.p000p1.mobile.putong.core.newui.home.views.IntlCommercialCardBottomActionLayout;
import com.p000p1.mobile.putong.core.newui.main.NewMainAct;
import com.p000p1.mobile.putong.core.newui.view.LinearMeasureOrderLayout;
import com.p1.mobile.putong.ab.IntlCountryCodeController;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.R;
import com.p1.mobile.putong.core.api.CoreSuggested;
import com.p1.mobile.putong.core.api.a0;
import com.p1.mobile.putong.core.data.CardInfoRenderFrom;
import com.p1.mobile.putong.core.data.Conversation;
import com.p1.mobile.putong.core.data.CoreMomentInfo;
import com.p1.mobile.putong.core.data.IntlInsertCardData;
import com.p1.mobile.putong.core.data.LikeMindedItemStatusData;
import com.p1.mobile.putong.core.data.SamesCardData;
import com.p1.mobile.putong.core.data.SimilarInterestsItemSwipeData;
import com.p1.mobile.putong.core.data.SwipeDirection;
import com.p1.mobile.putong.core.ui.animalfacial.AnimalFacialCardView;
import com.p1.mobile.putong.core.ui.intloperation.regularsticker.RegularStickerCardTabView;
import com.p1.mobile.putong.core.ui.likeminded.LikeMindedCardTabView;
import com.p1.mobile.putong.core.ui.profile.ProfileAct;
import com.p1.mobile.putong.core.ui.profile.profilelist.imp.ProfileListFragExpandedImpl;
import com.p1.mobile.putong.core.ui.profile.views.VPager_SquaredRefactor;
import com.p1.mobile.putong.core.ui.verification.VerificationCenterAct;
import com.p1.mobile.putong.data.Extensions;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.UserLiveState;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.SVGAnimationView;
import com.tantanapp.common.data.CopyObject;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import l.axk;
import l.bj4;
import l.bo5;
import l.bt0;
import l.c4g0;
import l.co5;
import l.d30;
import l.e30;
import l.e900;
import l.eqh0;
import l.idr;
import l.j8w;
import l.jo5;
import l.mkd0;
import l.nvc0;
import l.o6j0;
import l.p9w;
import l.q8p;
import l.qib0;
import l.qp8;
import l.roj0;
import l.t100;
import l.u59;
import l.upa;
import l.vwb;
import l.w9j;
import l.wp0;
import l.x2c0;
import l.xdl0;
import l.xp5;
import l.ym2;
import l.zvf0;
import rx.subjects.a;
import v.VDraweeView;
import v.VFrame;
import v.VImage;
import v.VLinear;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class zwk extends p3l implements umf {

    /* JADX INFO: renamed from: A */
    public ViewStub f23952A;

    /* JADX INFO: renamed from: B */
    public LikeMindedCardTabView f23953B;

    /* JADX INFO: renamed from: C */
    public ViewStub f23954C;

    /* JADX INFO: renamed from: D */
    public VText f23955D;

    /* JADX INFO: renamed from: E */
    public ExpandedCardInforLayout f23956E;

    /* JADX INFO: renamed from: F */
    public View f23957F;

    /* JADX INFO: renamed from: G */
    public VFrame f23958G;

    /* JADX INFO: renamed from: H */
    public ViewStub f23959H;

    /* JADX INFO: renamed from: I */
    public ViewStub f23960I;

    /* JADX INFO: renamed from: J */
    public VImage f23961J;

    /* JADX INFO: renamed from: K */
    public LinearLayout f23962K;

    /* JADX INFO: renamed from: L */
    public SVGAnimationView f23963L;

    /* JADX INFO: renamed from: M */
    public LinearLayout f23964M;

    /* JADX INFO: renamed from: N */
    public VText f23965N;

    /* JADX INFO: renamed from: O */
    public VImage f23966O;

    /* JADX INFO: renamed from: P */
    public User f23967P;

    /* JADX INFO: renamed from: Q */
    public CoreSuggested.UserInfo f23968Q;

    /* JADX INFO: renamed from: R */
    public sfh0 f23969R;

    /* JADX INFO: renamed from: S */
    public c4g0 f23970S;

    /* JADX INFO: renamed from: T */
    public c4g0 f23971T;

    /* JADX INFO: renamed from: X */
    public VDraweeView f23975X;

    /* JADX INFO: renamed from: Z */
    public RegularStickerCardTabView f23977Z;

    /* JADX INFO: renamed from: a0 */
    public AnimalFacialCardView f23978a0;

    /* JADX INFO: renamed from: d0 */
    public IntlCommercialCardBottomActionLayout f23981d0;

    /* JADX INFO: renamed from: e0 */
    public boolean f23982e0;

    /* JADX INFO: renamed from: f */
    public CardHeadLayoutV2 f23983f;

    /* JADX INFO: renamed from: f0 */
    public boolean f23984f0;

    /* JADX INFO: renamed from: g */
    public VFrame f23985g;

    /* JADX INFO: renamed from: g0 */
    public String f23986g0;

    /* JADX INFO: renamed from: h */
    public CardIntlPictureViewOpt f23987h;

    /* JADX INFO: renamed from: i */
    public View f23989i;

    /* JADX INFO: renamed from: i0 */
    public String f23990i0;

    /* JADX INFO: renamed from: j */
    public VImage f23991j;

    /* JADX INFO: renamed from: k */
    public VFrame f23992k;

    /* JADX INFO: renamed from: l */
    public LinearMeasureOrderLayout f23993l;

    /* JADX INFO: renamed from: m */
    public VText f23994m;

    /* JADX INFO: renamed from: n */
    public VText f23995n;

    /* JADX INFO: renamed from: o */
    public VFrame f23996o;

    /* JADX INFO: renamed from: p */
    public SVGAnimationView f23997p;

    /* JADX INFO: renamed from: q */
    public VText f23998q;

    /* JADX INFO: renamed from: r */
    public ViewStub f23999r;

    /* JADX INFO: renamed from: s */
    public ViewStub f24000s;

    /* JADX INFO: renamed from: t */
    public VImage f24001t;

    /* JADX INFO: renamed from: u */
    public FrameLayout f24002u;

    /* JADX INFO: renamed from: v */
    public VImage f24003v;

    /* JADX INFO: renamed from: w */
    public VImage f24004w;

    /* JADX INFO: renamed from: x */
    public VLinear f24005x;

    /* JADX INFO: renamed from: y */
    public VText f24006y;

    /* JADX INFO: renamed from: z */
    public VImage f24007z;

    /* JADX INFO: renamed from: U */
    public long f23972U = 0;

    /* JADX INFO: renamed from: V */
    public boolean f23973V = false;

    /* JADX INFO: renamed from: W */
    public boolean f23974W = false;

    /* JADX INFO: renamed from: Y */
    public boolean f23976Y = false;

    /* JADX INFO: renamed from: b0 */
    public VImage f23979b0 = null;

    /* JADX INFO: renamed from: c0 */
    public VText f23980c0 = null;

    /* JADX INFO: renamed from: h0 */
    public boolean f23988h0 = false;

    /* JADX INFO: renamed from: l.zwk$a */
    public class RunnableC1375a implements Runnable {
        public RunnableC1375a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            xdl0.C0(zwk.this.f23987h.f2402b, -1);
            zwk.this.f23987h.setCardStyleChangeProgress(ExpandedCardStyleHelper.m2064o().m2076r());
        }
    }

    /* JADX INFO: renamed from: G */
    public static /* synthetic */ Boolean m26045G(User user, ExpandedCardStyleHelper.C0115b c0115b) {
        User user2 = c0115b.f1198c;
        return Boolean.valueOf(user2 == null || TextUtils.equals(((DbObject) user).id, ((DbObject) user2).id));
    }

    /* JADX INFO: renamed from: J */
    public static /* synthetic */ Unit m26048J() {
        CoreModule.c.m0.i2.onNext(SwipeDirection.RIGHT);
        return null;
    }

    /* JADX INFO: renamed from: A0 */
    public final void m26060A0(CoreSuggested.UserInfo userInfo, final User user) {
        this.f23984f0 = false;
        xdl0.M(this.f23962K, false);
        xdl0.M(this.f23996o, false);
        if (qp8.b() && qib0.b0.c.m9002Bq()) {
            final String str = ((DbObject) user).id;
            final String str2 = userInfo.from;
            final UserLiveState userLiveStateM9057lt = CoreModule.Q().m9057lt(str);
            this.f23962K.setOnClickListener(null);
            Conversation conversationXe = CoreModule.c.f0.Xe(str);
            if (!(!TextUtils.isEmpty(CoreModule.c.m0.o2) && TextUtils.equals(CoreModule.c.m0.o2, str) && conversationXe == null) && NullChecker.a(CoreModule.Q().getUserLiveId(str))) {
                this.f23984f0 = true;
                LinearLayout linearLayout = this.f23962K;
                CardInfoRenderFrom cardInfoRenderFrom = userInfo.renderFrom;
                CardInfoRenderFrom cardInfoRenderFrom2 = CardInfoRenderFrom.PROFILE;
                xdl0.M(linearLayout, cardInfoRenderFrom == cardInfoRenderFrom2 || ExpandedCardStyleHelper.m2064o().m2077s());
                xdl0.M(this.f23996o, userInfo.renderFrom != cardInfoRenderFrom2);
                this.f23965N.setTypeface(Typeface.DEFAULT_BOLD);
                xdl0.E0(this.f23962K, new View.OnClickListener() { // from class: l.qwk
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f19563a.m26097s0(user, str, str2, userLiveStateM9057lt, view);
                    }
                });
                xdl0.E0(this.f23996o, new View.OnClickListener() { // from class: l.rwk
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f20006a.m26098t0(user, userLiveStateM9057lt, str2, view);
                    }
                });
                if (!TextUtils.equals(this.f23986g0, str)) {
                    this.f23986g0 = str;
                    zvf0.y("e_live_room_enter", "p_suggest_user_profile_info_view", m26078Z(user, userLiveStateM9057lt, str2));
                }
                if (userLiveStateM9057lt == null || TextUtils.isEmpty(userLiveStateM9057lt.multiCallInfo.onGoingMultiCallId)) {
                    this.f23965N.setText(R.string.ch);
                    this.f23998q.setText(R.string.ch);
                } else {
                    this.f23965N.setText(R.string.dh);
                    this.f23998q.setText(R.string.dh);
                }
                if (!this.f23963L.isAnimating()) {
                    SVGALoader.with(m20098w()).from("https://auto.tancdn.com/v1/raw/b83d11f9-6b88-41a2-a0dd-c3617bde118510.so").into(this.f23963L);
                }
                if (userInfo.renderFrom != cardInfoRenderFrom2 && !this.f23997p.isAnimating()) {
                    SVGALoader.with(m20098w()).from("https://auto.tancdn.com/v1/raw/b83d11f9-6b88-41a2-a0dd-c3617bde118510.so").into(this.f23997p);
                }
                boolean z = this.f23974W;
                LinearLayout linearLayout2 = this.f23962K;
                if (z) {
                    xdl0.U(linearLayout2, t100.d(50.0f));
                } else {
                    xdl0.U(linearLayout2, t100.d(20.0f));
                }
            }
        }
    }

    @Override // p009l.p3l
    /* JADX INFO: renamed from: B */
    public void mo2124B(CoreSuggested.UserInfo userInfo, User user, int i, int i2, int i3) {
        m26065F0();
        this.f23967P = user;
        this.f23968Q = userInfo;
        this.f23987h.setParentHolder(this);
        this.f23983f.setRenderFrom(this.f23968Q.renderFrom);
        m26083e0(userInfo, user, i);
        m26103y0(userInfo, user, i);
        if (userInfo.renderFrom == CardInfoRenderFrom.PROFILE) {
            this.f23982e0 = true;
            m26069J0();
        } else {
            ExpandedCardStyleHelper.C0115b c0115bM2073n = ExpandedCardStyleHelper.m2064o().m2073n();
            this.f23982e0 = i == 0 && ExpandedCardStyleHelper.m2064o().m2077s() && NullChecker.a(c0115bM2073n) && NullChecker.a(c0115bM2073n.f1199d) && TextUtils.equals(((DbObject) user).id, c0115bM2073n.f1199d.id);
            m26068I0(userInfo, user, i);
        }
        m26060A0(userInfo, user);
        if (userInfo.renderFrom == CardInfoRenderFrom.CARD) {
            this.f23983f.setNextInfoExposureSizePx(t100.d(100.0f));
            if (i == 0) {
                mo20101z(ExpandedCardStyleHelper.m2064o().m2076r());
            } else {
                mo20101z(0.0f);
            }
        }
        m26082d0(userInfo, user);
    }

    /* JADX INFO: renamed from: B0 */
    public void m26061B0(User user, int i) {
        boolean z = false;
        this.f23974W = false;
        if (user.isMe() || xp5.r(user, this.f23968Q)) {
            return;
        }
        if (user.superLikedMe() || user.letter()) {
            this.f23974W = true;
            int i2 = (user.superLikedMe() && IntlCountryCodeController.v()) ? x2c0.H2 : x2c0.F2;
            this.f24003v.setImageResource(i2);
            this.f23961J.setImageResource(IntlCountryCodeController.v() ? x2c0.Kh : x2c0.Mh);
            VImage vImage = this.f24003v;
            if (i == 0 && this.f23987h.getCurrentItem() == 0) {
                z = true;
            }
            xdl0.M(vImage, z);
        }
    }

    /* JADX INFO: renamed from: C0 */
    public final void m26062C0(User user) {
        if (!user.isNewHere() || this.f23973V || this.f23974W || this.f23976Y || xdl0.O0(this.f24007z)) {
            xdl0.M(this.f23955D, false);
        } else {
            xdl0.M(this.f23955D, true);
        }
    }

    /* JADX INFO: renamed from: D0 */
    public void m26063D0(User user) {
        if (this.f23974W) {
            return;
        }
        q8p.a aVar = q8p.Companion;
        if (aVar.n(this.f23968Q, user) || aVar.m(this.f23968Q)) {
            this.f23973V = true;
            if (this.f23968Q.getRenderUser() != null && this.f23968Q.getRenderUser().isNonBinary()) {
                this.f24006y.setText(R.string.yf);
            }
            xdl0.M(this.f24005x, true);
        }
    }

    /* JADX INFO: renamed from: E0 */
    public final void m26064E0(CoreSuggested.UserInfo userInfo, User user) {
        String string;
        if (!userInfo.hasLikeMeSlideCardTop) {
            xdl0.M(this.f23994m, false);
            xdl0.M(this.f23995n, false);
            return;
        }
        q8p.a aVar = q8p.Companion;
        if (aVar.n(userInfo, user) || aVar.m(userInfo)) {
            xdl0.M(this.f23995n, true);
            this.f23995n.setTypeface(eqh0.c(3), 1);
            return;
        }
        xdl0.M(this.f23995n, false);
        xdl0.M(this.f23994m, true);
        this.f23994m.setTypeface(eqh0.c(3), 1);
        VText vText = this.f23994m;
        if (user.isNonBinary()) {
            string = this.f23994m.getContext().getString(R.string.zf);
        } else {
            boolean zIsFemale = user.isFemale();
            VText vText2 = this.f23994m;
            string = zIsFemale ? vText2.getContext().getString(R.string.Tc) : vText2.getContext().getString(R.string.Sc);
        }
        vText.setText(string);
    }

    /* JADX INFO: renamed from: F0 */
    public final void m26065F0() {
        CoreSuggested.UserInfo userInfo = this.f23968Q;
        if (userInfo != null && userInfo.renderFrom == CardInfoRenderFrom.CARD && ExpandedCardStyleHelper.m2064o().m2077s() && ExpandedCardStyleHelper.m2064o().m2073n() != null && ExpandedCardStyleHelper.m2064o().m2073n().f1199d != null && TextUtils.equals(this.f23968Q.id, ExpandedCardStyleHelper.m2064o().m2073n().f1199d.id)) {
            CardIntlPictureViewOpt cardIntlPictureViewOpt = this.f23987h;
            if (cardIntlPictureViewOpt != null) {
                cardIntlPictureViewOpt.m3011W(true);
                return;
            }
            return;
        }
        if (this.f23968Q != null) {
            this.f23956E.m2279n();
            this.f23987h.m3017c0();
            CardIntlPictureViewOpt cardIntlPictureViewOpt2 = this.f23987h;
            CardInfoRenderFrom cardInfoRenderFrom = this.f23968Q.renderFrom;
            CardInfoRenderFrom cardInfoRenderFrom2 = CardInfoRenderFrom.CARD;
            cardIntlPictureViewOpt2.m2989A(cardInfoRenderFrom == cardInfoRenderFrom2);
            if (this.f23968Q.renderFrom == cardInfoRenderFrom2) {
                xdl0.M(this.f23992k, true);
                xdl0.M(this.f24002u, true);
                xdl0.M(this.f23958G, true);
                xdl0.M(this.f23993l, true);
                this.f23989i.setAlpha(1.0f);
                xdl0.M(this.f23953B, false);
                xdl0.M(this.f23961J, false);
                xdl0.M(this.f24003v, false);
                this.f23974W = false;
                this.f23976Y = false;
                this.f23988h0 = false;
                xdl0.M(this.f24001t, false);
                m26081c0();
            }
        }
        CardIntlPictureViewOpt cardIntlPictureViewOpt3 = this.f23987h;
        if (cardIntlPictureViewOpt3 != null) {
            cardIntlPictureViewOpt3.m3011W(true);
            this.f23987h.m3016b0();
        }
        mkd0.z(this.f23970S);
        mkd0.z(this.f23971T);
    }

    /* JADX INFO: renamed from: G0 */
    public final void m26066G0(float f) {
        boolean z;
        VLinear vLinear = this.f23983f;
        if (this.f23968Q.renderFrom == CardInfoRenderFrom.CARD) {
            while (true) {
                if (!(vLinear.getParent() instanceof ViewGroup)) {
                    z = false;
                    break;
                } else {
                    if (vLinear.getParent() instanceof UserProfileExpandedCardRoot) {
                        vLinear = (View) vLinear.getParent();
                        z = true;
                        break;
                    }
                    vLinear = (View) vLinear.getParent();
                }
            }
            if (!z) {
                vLinear = this.f23983f;
            }
        }
        vLinear.setPivotX(vLinear.getWidth() / 2.0f);
        vLinear.setPivotY(vLinear.getHeight() / 2.0f);
        bt0.n(vLinear, View.ROTATION_Y, new float[]{0.0f, f, 0.0f}).setDuration(200L).start();
    }

    /* JADX INFO: renamed from: H0 */
    public final boolean m26067H0() {
        CardIntlPictureViewOpt cardIntlPictureViewOpt;
        User user = this.f23967P;
        return (user == null || user.isMe() || this.f23967P.isTeamAccount() || xp5.p(this.f23967P) || !this.f23982e0 || (cardIntlPictureViewOpt = this.f23987h) == null || cardIntlPictureViewOpt.m2994F()) ? false : true;
    }

    /* JADX INFO: renamed from: I0 */
    public final void m26068I0(CoreSuggested.UserInfo userInfo, User user, int i) {
        xdl0.M(this.f23989i, true);
        m26099u0(user, userInfo);
        this.f23989i.setAlpha(1.0f);
        this.f23956E.m2278m(user, this.f23968Q, i, this.f23983f, this.f23957F);
        m26063D0(user);
        m26061B0(user, 0);
        m26101w0(userInfo, i);
        m26064E0(userInfo, user);
        m26100v0(user, this.f23968Q, i);
        m26104z0(userInfo);
        m26102x0(userInfo, user.profile.extensions, t100.m, this.f23987h.getCurrentItem() == 0);
        m26062C0(user);
    }

    /* JADX INFO: renamed from: J0 */
    public final void m26069J0() {
        this.f23989i.setAlpha(0.0f);
        this.f23983f.setShortCardStyle(true);
        xdl0.M(this.f23956E, false);
        m26061B0(this.f23967P, 0);
        xdl0.M(this.f24003v, false);
        xdl0.M(this.f23961J, this.f23974W);
    }

    /* JADX INFO: renamed from: K0 */
    public final void m26070K0(String str) {
        if (str.equals(this.f23990i0)) {
            return;
        }
        zvf0.x("e_special_card", "p_suggest_users_home_view");
        this.f23990i0 = str;
    }

    /* JADX INFO: renamed from: L0 */
    public final void m26071L0() {
        boolean z = this.f23988h0 && !this.f23982e0 && this.f23987h.getCurrentItem() == 0;
        xdl0.M(this.f24001t, z);
        this.f23987h.setCertBtnShowing(z);
        this.f23956E.setHideCertIconForCardBtn(this.f23988h0);
    }

    /* JADX INFO: renamed from: M0 */
    public final void m26072M0() {
        if (this.f23991j == null || this.f23967P == null || this.f23987h == null) {
            return;
        }
        boolean zM26067H0 = m26067H0();
        xdl0.M(this.f23991j, zM26067H0);
        if (!zM26067H0 || this.f23968Q == null) {
            return;
        }
        String strA = co5.a("profile_photo_compliment_btn");
        if (TextUtils.isEmpty(strA)) {
            return;
        }
        co5.f(m20096A(this.f23968Q), strA);
    }

    /* JADX INFO: renamed from: N0 */
    public final void m26073N0(boolean z, boolean z2) {
        xdl0.M(this.f23957F, z);
        xdl0.M(this.f23956E.f1339d, z2);
    }

    /* JADX INFO: renamed from: V */
    public final void m26074V(View view) {
        axk.a(this, view);
    }

    /* JADX INFO: renamed from: W */
    public final void m26075W(boolean z, boolean z2) {
        this.f23956E.m2272g(z);
        boolean z3 = true;
        m26073N0(!z, (IntlCountryCodeController.v() || z) ? false : true);
        if (z) {
            xdl0.U(this.f23957F, 0);
            xdl0.U(this.f23956E.f1339d, 0);
            if (m20098w() instanceof NewMainAct) {
                m20098w().m3877Z5().m4060O();
            }
        } else {
            ExpandedCardInforLayout expandedCardInforLayout = this.f23956E;
            C0032b c0032b = expandedCardInforLayout.f1342g;
            if (c0032b != null) {
                expandedCardInforLayout.m2282q(c0032b.m1417v(), this.f23957F);
            }
        }
        this.f23987h.m3013Y();
        this.f23987h.m3024j0();
        this.f23987h.m2989A(!z);
        m26071L0();
        this.f23989i.setAlpha(z ? 0.0f : 1.0f);
        xdl0.M(this.f23992k, !z);
        xdl0.M(this.f24002u, !z);
        xdl0.M(this.f23958G, !z);
        xdl0.M(this.f23993l, !z);
        xdl0.M(this.f23961J, z && this.f23974W);
        xdl0.M(this.f23962K, z && this.f23984f0);
        xdl0.M(this.f23996o, !z && this.f23984f0);
        m26072M0();
        if (z2 && !this.f23987h.m3008T() && z) {
            this.f23987h.m2992D();
        }
        if (z) {
            try {
                int i = (this.f23987h.getCurrentView() == null || !((Boolean) this.f23987h.getCurrentView().I0.e()).booleanValue()) ? 1 : 0;
                boolean z4 = this.f23968Q.isUserLikeMe() || (CoreModule.o.b().wf() && this.f23968Q.hasLikeMeSlideCardTop);
                String str = z4 ? "upper_right" : "null";
                if (NullChecker.a(this.f23956E.f1342g) && this.f23956E.f1342g.mo1411i()) {
                    str = "lower_left";
                    z4 = true;
                }
                CoreMomentInfo coreMomentInfoM26079a0 = m26079a0();
                o6j0.a aVarF = o6j0.a.f("IsWhiteBlock", i);
                o6j0.a aVarI = o6j0.a.i("moments_user_id", NullChecker.a(((DbObject) this.f23967P).id));
                o6j0.a aVarI2 = o6j0.a.i("show_he_liked", z4);
                o6j0.a aVarH = o6j0.a.h("show_he_liked_position", str);
                o6j0.a aVarI3 = o6j0.a.i("is_first_picture", TextUtils.equals(nt30.f17646V0, ((DbObject) this.f23967P).id) && this.f23987h.getCurrentItem() == 0);
                o6j0.a aVarH2 = o6j0.a.h("swipe_scene", "default");
                if (!NullChecker.a(this.f23968Q) || !this.f23968Q.isThemeCard) {
                    z3 = false;
                }
                o6j0.a aVarI4 = o6j0.a.i("theme_card_ornot", z3);
                String str2 = "1";
                o6j0.a aVarH3 = o6j0.a.h("is_moment_card", m26089k0() ? "1" : "0");
                o6j0.a aVarH4 = o6j0.a.h("moment_id", coreMomentInfoM26079a0 != null ? ((CopyObject) coreMomentInfoM26079a0).id : "0");
                if (!upa.r1() || !NullChecker.a(this.f23968Q) || !this.f23968Q.meetAgain) {
                    str2 = "0";
                }
                o6j0.c("e_card", "p_suggest_users_home_view", (o6j0.a[]) vwb.f0(new o6j0.a[]{aVarF, aVarI, aVarI2, aVarH, aVarI3, aVarH2, aVarI4, aVarH3, aVarH4, o6j0.a.h("is_show_longtimenosee_tag", str2)}).toArray(new o6j0.a[0]));
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: renamed from: X */
    public final void m26076X() {
        if (mqi0.m18550o() - this.f23972U < 320) {
            return;
        }
        this.f23972U = mqi0.m18550o();
        CardInfoRenderFrom cardInfoRenderFrom = this.f23968Q.renderFrom;
        CardInfoRenderFrom cardInfoRenderFrom2 = CardInfoRenderFrom.CARD;
        if (!(cardInfoRenderFrom != cardInfoRenderFrom2 ? cardInfoRenderFrom == cardInfoRenderFrom2 : true)) {
            if (cardInfoRenderFrom == CardInfoRenderFrom.PROFILE) {
                m20098w().onBackPressed();
            }
        } else if (!ExpandedCardStyleHelper.m2064o().m2077s()) {
            ExpandedCardStyleHelper.m2064o().m2072m(this.f23967P, this.f23968Q);
        } else {
            lra0.m17994h("hotspot");
            ExpandedCardStyleHelper.m2064o().m2070k(this.f23967P, this.f23968Q, "card click back");
        }
    }

    /* JADX INFO: renamed from: Y */
    public final String m26077Y(@Nullable UserLiveState userLiveState) {
        return CoreModule.Q().m9004Dr(NullChecker.a(userLiveState) ? userLiveState.multiCallInfo.onGoingMultiCallRole : "");
    }

    /* JADX INFO: renamed from: Z */
    public final HashMap<String, Object> m26078Z(User user, UserLiveState userLiveState, String str) {
        HashMap<String, Object> map = new HashMap<>();
        boolean z = (userLiveState == null || TextUtils.isEmpty(userLiveState.multiCallInfo.onGoingMultiCallId)) ? false : true;
        map.put("liveId", CoreModule.Q().getUserLiveId(((DbObject) user).id));
        map.put("anchorId", ((DbObject) user).id);
        map.put("index", "NA");
        map.put("module", "e_profile_album");
        map.put("trace_id", "");
        map.put("live_status", (userLiveState == null || !userLiveState.isLiveOpened()) ? "off" : "on");
        map.put("right_recommend_type", "");
        if (!z) {
            userLiveState = null;
        }
        map.put("live_room_live_type", m26077Y(userLiveState));
        map.put("show_label", z ? "连线" : "");
        map.put("refer_pid", "home_card".equals(str) ? "home_card" : "");
        map.put("liveRecommendCategory", "NA");
        if (CoreModule.c.m0.L6(((DbObject) user).id) && "home_card".equals(str)) {
            map.put("live_enter_source", "suggest_live_card_profile");
            return map;
        }
        map.put("live_enter_source", "NA");
        return map;
    }

    /* JADX INFO: renamed from: a0 */
    public CoreMomentInfo m26079a0() {
        CoreSuggested.UserInfo userInfo;
        CoreMomentInfo coreMomentInfo;
        if ((!upa.I0().enabled && !e900.b().f()) || (userInfo = this.f23968Q) == null || (coreMomentInfo = userInfo.coreMomentInfo) == null) {
            return null;
        }
        return coreMomentInfo;
    }

    @Override // p009l.umf
    /* JADX INFO: renamed from: b */
    public a<Boolean> mo23067b() {
        if (this.f23987h.getCurrentView() != null) {
            return this.f23987h.getCurrentView().I0;
        }
        return null;
    }

    /* JADX INFO: renamed from: b0 */
    public final void m26080b0(User user) {
        User userP9 = CoreModule.c.e0.p9();
        zvf0.r("e_clone_card_avatar_verified_tag", "p_suggest_users_home_view");
        if (userP9 == null || !userP9.isPicVerificationVerified()) {
            m20098w().startActivity(VerificationCenterAct.Y1(m20098w(), false, "card_verify_popup"));
        } else {
            new bj4(m20098w(), user).show();
        }
    }

    @Override // p009l.umf
    /* JADX INFO: renamed from: c */
    public a<Boolean> mo23068c() {
        if (this.f23987h.getCurrentView() != null) {
            return this.f23987h.getCurrentView().J0;
        }
        return null;
    }

    /* JADX INFO: renamed from: c0 */
    public final void m26081c0() {
        this.f23973V = false;
        xdl0.M(this.f24005x, false);
    }

    @Override // p009l.umf
    /* JADX INFO: renamed from: d */
    public Media mo23069d() {
        if (this.f23987h.getCurrentView() != null) {
            return this.f23987h.getCurrentView().G;
        }
        return null;
    }

    /* JADX INFO: renamed from: d0 */
    public final void m26082d0(CoreSuggested.UserInfo userInfo, final User user) {
        CardIntlPictureViewOpt cardIntlPictureViewOpt;
        VPager_SquaredRefactor vPager_SquaredRefactor;
        if (this.f23991j == null || (cardIntlPictureViewOpt = this.f23987h) == null || (vPager_SquaredRefactor = cardIntlPictureViewOpt.f2402b) == null) {
            return;
        }
        vPager_SquaredRefactor.d(new C1377c());
        m26072M0();
        final boolean z = userInfo.renderFrom == CardInfoRenderFrom.PROFILE;
        xdl0.E0(this.f23991j, new View.OnClickListener() { // from class: l.twk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f20890a.m26091m0(user, z, view);
            }
        });
    }

    /* JADX INFO: renamed from: e0 */
    public final void m26083e0(CoreSuggested.UserInfo userInfo, final User user, int i) {
        sfh0 sfh0Var = new sfh0(userInfo, user);
        this.f23969R = sfh0Var;
        m26086h0(sfh0Var);
        CardInfoRenderFrom cardInfoRenderFrom = userInfo.renderFrom;
        CardInfoRenderFrom cardInfoRenderFrom2 = CardInfoRenderFrom.CARD;
        if (cardInfoRenderFrom == cardInfoRenderFrom2) {
            boolean z = (ExpandedCardStyleHelper.m2064o().m2077s() && i == 0) ? false : true;
            m26073N0(z, !IntlCountryCodeController.v() && z);
            if (i == 0 && userInfo.renderFrom == cardInfoRenderFrom2) {
                mkd0.z(this.f23970S);
                this.f23970S = m24919k(m20098w(), ExpandedCardStyleHelper.m2064o().m2083y()).filter(new w9j() { // from class: l.uwk
                    public final Object call(Object obj) {
                        return zwk.m26045G(user, (ExpandedCardStyleHelper.C0115b) obj);
                    }
                }).subscribe(mkd0.G(new e30() { // from class: l.vwk
                    public final void call(Object obj) {
                        this.f21808a.m26093o0((ExpandedCardStyleHelper.C0115b) obj);
                    }
                }));
                mkd0.z(this.f23971T);
                this.f23971T = m24919k(m20098w(), NavigationBarAdmobHelper.INSTANCE.m48l()).subscribe(mkd0.G(new e30() { // from class: l.wwk
                    public final void call(Object obj) {
                        this.f22348a.m26094p0((Integer) obj);
                    }
                }));
            }
        }
    }

    /* JADX INFO: renamed from: f0 */
    public final void m26084f0(Extensions extensions, int i, boolean z) {
        try {
            LikeMindedItemStatusData likeMindedItemStatusDataL = wp0.INSTANCE.l(extensions);
            if (likeMindedItemStatusDataL != null) {
                if (NullChecker.a(this.f23978a0)) {
                    xdl0.M(this.f23978a0, z);
                } else {
                    this.f23978a0 = this.f23954C.inflate();
                }
                xdl0.U(this.f23978a0, i);
                this.f23978a0.b(likeMindedItemStatusDataL);
            }
        } catch (Exception unused) {
        }
    }

    @Override // p009l.xkf
    @SuppressLint({"ResourceType"})
    /* JADX INFO: renamed from: g */
    public void mo2127g(View view) {
        super.mo2127g(view);
        m26074V(view);
        xdl0.E0(this.f23957F, new View.OnClickListener() { // from class: l.owk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f18266a.m26090l0(view2);
            }
        });
    }

    /* JADX INFO: renamed from: g0 */
    public final void m26085g0(CoreSuggested.UserInfo userInfo, boolean z, boolean z2) {
        try {
            if (NullChecker.a(this.f23975X)) {
                xdl0.M(this.f23975X, z);
            } else {
                this.f23975X = this.f23999r.inflate();
            }
            String str = z2 ? userInfo.samesCardData.tag_url : userInfo.samesCardData.icon_url;
            if (this.f23975X.getTag() != str) {
                this.f23975X.setTag(str);
                qib0.G.O0(this.f23975X, str, true, false, (nvc0) null, (ym2) null);
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: h0 */
    public final void m26086h0(sfh0 sfh0Var) {
        this.f23987h.m3015a0(sfh0Var, this.f23967P, new C1376b());
    }

    /* JADX INFO: renamed from: i0 */
    public final void m26087i0() {
        xdl0.M(this.f23953B, this.f23976Y && this.f23987h.getCurrentItem() == 0);
        if (NullChecker.a(this.f23975X)) {
            xdl0.M(this.f23975X, this.f23987h.getCurrentItem() == 0);
        }
        if (NullChecker.a(this.f23977Z)) {
            xdl0.M(this.f23977Z, this.f23987h.getCurrentItem() == 0);
        }
        if (NullChecker.a(this.f23978a0)) {
            xdl0.M(this.f23978a0, this.f23987h.getCurrentItem() == 0);
        }
    }

    @Override // p009l.xkf
    /* JADX INFO: renamed from: j */
    public boolean mo24918j(View view) {
        return view instanceof CardHeadLayoutV2;
    }

    /* JADX INFO: renamed from: j0 */
    public boolean m26088j0() {
        return NullChecker.a(this.f23981d0) && xdl0.O0(this.f23981d0) && xdl0.O0(this.f23958G);
    }

    /* JADX INFO: renamed from: k0 */
    public final boolean m26089k0() {
        CoreSuggested.UserInfo userInfo = this.f23968Q;
        return (userInfo == null || userInfo.coreMomentInfo == null) ? false : true;
    }

    /* JADX INFO: renamed from: l0 */
    public final /* synthetic */ void m26090l0(View view) {
        User user = this.f23967P;
        if (user == null || !TextUtils.equals(((DbObject) user).id, CoreModule.c.m0.q6())) {
            return;
        }
        this.f23987h.m3028z();
    }

    /* JADX INFO: renamed from: m0 */
    public final /* synthetic */ void m26091m0(User user, final boolean z, View view) {
        if (user == null || jo5.b(m20098w(), this.f23968Q, user, "profile_photo_compliment_btn")) {
            return;
        }
        bo5.n(m20098w(), user, "profile_photo_compliment_btn", Integer.valueOf(this.f23987h.getCurrentPosition()), (d30) null, new Function1() { // from class: l.ywk
            public final Object invoke(Object obj) {
                return this.f23257a.m26092n0(z, (User) obj);
            }
        }, this.f23968Q.liveRoomInfo);
    }

    /* JADX INFO: renamed from: n0 */
    public final /* synthetic */ Unit m26092n0(boolean z, User user) {
        bo5.i().invoke(user);
        if (z && (m20098w() instanceof ProfileAct)) {
            ProfileListFragExpandedImpl profileListFragExpandedImplC2 = m20098w().C2();
            if (profileListFragExpandedImplC2 instanceof ProfileListFragExpandedImpl) {
                profileListFragExpandedImplC2.V4().n1(SwipeDirection.REMOVE.getValue());
            } else {
                m20098w().finish();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ void m26093o0(ExpandedCardStyleHelper.C0115b c0115b) {
        boolean zM2089e = c0115b.m2089e();
        this.f23982e0 = zM2089e;
        m26075W(zM2089e, true);
    }

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ void m26094p0(Integer num) {
        this.f23983f.m2964P();
        this.f23987h.post(new RunnableC1375a());
    }

    @Override // p009l.xkf
    /* JADX INFO: renamed from: q */
    public void mo2128q(boolean z) {
        CardIntlPictureViewOpt cardIntlPictureViewOpt;
        if (z || (cardIntlPictureViewOpt = this.f23987h) == null) {
            return;
        }
        cardIntlPictureViewOpt.m3011W(false);
    }

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ void m26095q0(User user, View view) {
        m26080b0(user);
    }

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ void m26096r0(boolean z, CoreSuggested.UserInfo userInfo, View view) {
        p9w p9wVar = p9w.INSTANCE;
        p9wVar.N(z, "click");
        j8w.Companion.a().W(m20098w(), userInfo.intlInsertCardData.buzzUser.buzzToken, userInfo.id, p9wVar.x(), new Function0() { // from class: l.pwk
            public final Object invoke() {
                return zwk.m26048J();
            }
        }, (Function0) null, (Function0) null, true);
    }

    @Override // p009l.xkf
    /* JADX INFO: renamed from: s */
    public void mo12510s() {
        super.mo12510s();
        m26065F0();
    }

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ void m26097s0(User user, String str, String str2, UserLiveState userLiveState, View view) {
        if (user.isMe()) {
            CoreModule.Q().m9007F8(m20098w(), false, true, null);
        } else {
            CoreModule.Q().startAudienceLive(m20098w(), CoreModule.Q().getUserLiveId(str), "profile", null);
        }
        if (CoreModule.c.m0.L6(str) && TextUtils.equals("home_card", str2)) {
            ttn.m22660a("p_suggest_user_profile_info_view", user);
        } else {
            zvf0.s("e_live_room_enter", "p_suggest_user_profile_info_view", m26078Z(user, userLiveState, str2));
        }
    }

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ void m26098t0(User user, UserLiveState userLiveState, String str, View view) {
        if (CoreModule.c.m0.L6(((DbObject) user).id)) {
            return;
        }
        CoreModule.Q().startAudienceLive(m20098w(), CoreModule.Q().getUserLiveId(((DbObject) user).id), "suggest-card", null);
        zvf0.s("e_live_room_enter", "p_suggest_users_home_view", m26078Z(user, userLiveState, str));
    }

    /* JADX INFO: renamed from: u0 */
    public final void m26099u0(final User user, CoreSuggested.UserInfo userInfo) {
        this.f23988h0 = !user.isMe() && user.isPicVerificationVerified();
        m26071L0();
        if (this.f23988h0) {
            zvf0.x("e_clone_card_avatar_verified_tag", "p_suggest_users_home_view");
            xdl0.E0(this.f24001t, new View.OnClickListener() { // from class: l.swk
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f20486a.m26095q0(user, view);
                }
            });
        }
    }

    @Override // p009l.xkf
    /* JADX INFO: renamed from: v */
    public void mo24927v() {
        super.mo24927v();
        CardIntlPictureViewOpt cardIntlPictureViewOpt = this.f23987h;
        if (cardIntlPictureViewOpt != null) {
            cardIntlPictureViewOpt.m3011W(false);
        }
    }

    /* JADX INFO: renamed from: v0 */
    public void m26100v0(User user, CoreSuggested.UserInfo userInfo, int i) {
        boolean zN = q8p.Companion.n(userInfo, user);
        VLinear vLinear = this.f23981d0;
        if (!zN) {
            if (vLinear != null) {
                xdl0.M(vLinear, false);
                return;
            }
            return;
        }
        if (vLinear == null) {
            this.f23981d0 = (IntlCommercialCardBottomActionLayout) this.f23960I.inflate();
        }
        boolean zV = IntlCountryCodeController.v();
        VLinear vLinear2 = this.f23981d0;
        if (zV) {
            xdl0.W(vLinear2, t100.d(80.0f));
            xdl0.U(this.f23981d0, t100.d(20.0f));
            this.f23956E.m2273h(t100.d(90.0f));
        } else {
            xdl0.W(vLinear2, 0);
            xdl0.U(this.f23981d0, t100.d(20.0f));
            this.f23956E.m2273h(t100.d(90.0f));
        }
        xdl0.M(this.f23981d0, true);
        this.f23981d0.m3202Y(m20098w(), user, userInfo, i);
        if (i == 0) {
            if (IntlCountryCodeController.v()) {
                CoreModule.c.m0.m2.onNext(roj0.a);
            } else {
                CoreModule.c.m0.l2.onNext("renderCommercialCardBottomActionLayout");
            }
        }
    }

    /* JADX INFO: renamed from: w0 */
    public final void m26101w0(final CoreSuggested.UserInfo userInfo, int i) {
        if (u59.d0() && NullChecker.a(userInfo.intlInsertCardData) && NullChecker.a(userInfo.intlInsertCardData.buzzUser)) {
            IntlInsertCardData intlInsertCardData = userInfo.intlInsertCardData;
            if (intlInsertCardData.cardType == 10 && intlInsertCardData.showType == 1) {
                final boolean z = intlInsertCardData.buzzUser.isBlur;
                if (i == 0) {
                    CoreModule.c.m0.J0.onNext(Boolean.TRUE);
                    p9w.INSTANCE.O(z);
                }
                if (z) {
                    m26073N0(false, false);
                }
                if (NullChecker.a(this.f23980c0)) {
                    xdl0.M(this.f23980c0, i == 0);
                }
                if (NullChecker.a(this.f23979b0) && xdl0.O0(this.f23979b0)) {
                    return;
                }
                if (this.f23979b0 == null) {
                    this.f23979b0 = this.f24000s.inflate();
                }
                if (this.f23980c0 == null) {
                    this.f23980c0 = this.f23959H.inflate();
                }
                xdl0.M(this.f23979b0, true);
                xdl0.M(this.f23980c0, i == 0);
                this.f23956E.m2273h(t100.d(84.0f));
                this.f23979b0.setBackgroundResource(x2c0.i9);
                xdl0.E0(this.f23980c0, new View.OnClickListener() { // from class: l.xwk
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f22745a.m26096r0(z, userInfo, view);
                    }
                });
                return;
            }
        }
        if (NullChecker.a(this.f23979b0)) {
            xdl0.M(this.f23979b0, false);
        }
        if (NullChecker.a(this.f23980c0)) {
            xdl0.M(this.f23980c0, false);
        }
    }

    /* JADX INFO: renamed from: x0 */
    public final void m26102x0(CoreSuggested.UserInfo userInfo, Extensions extensions, int i, boolean z) {
        LikeMindedItemStatusData likeMindedItemStatusDataD;
        SamesCardData samesCardData = userInfo.samesCardData;
        if (samesCardData == null) {
            if (C0029a.INSTANCE.m956b() && wp0.INSTANCE.j(extensions) && !this.f23974W && !this.f23973V) {
                m26084f0(extensions, i, z);
                return;
            }
            xdl0.M(this.f23953B, false);
            if (NullChecker.a(this.f23975X)) {
                xdl0.M(this.f23975X, false);
            }
            this.f23976Y = false;
            if (NullChecker.a(this.f23977Z)) {
                xdl0.M(this.f23977Z, false);
            }
            if (NullChecker.a(this.f23978a0)) {
                xdl0.M(this.f23978a0, false);
                return;
            }
            return;
        }
        String str = samesCardData.type;
        C0029a.Companion companion = C0029a.INSTANCE;
        if (companion.m962h()) {
            xdl0.M(this.f23953B, false);
            this.f23976Y = false;
            if ("quiz".equals(str)) {
                m26085g0(userInfo, z, false);
                return;
            }
            if (("regular".equals(str) || "flash".equals(str)) && !this.f23973V) {
                if (NullChecker.a(this.f23977Z)) {
                    xdl0.M(this.f23977Z, z);
                } else {
                    this.f23977Z = this.f23952A.inflate();
                }
                xdl0.U(this.f23977Z, i);
                Object tag = this.f23977Z.getTag();
                String str2 = userInfo.samesCardData.id;
                if (tag != str2) {
                    this.f23977Z.setTag(str2);
                    this.f23977Z.b(userInfo.samesCardData);
                    return;
                }
                return;
            }
            return;
        }
        if (companion.m957c()) {
            m26085g0(userInfo, z, true);
            return;
        }
        if (!companion.m961g() || this.f23973V) {
            if (this.f23973V || (likeMindedItemStatusDataD = idr.INSTANCE.d(str)) == null) {
                return;
            }
            xdl0.U(this.f23953B, i);
            this.f23953B.b(likeMindedItemStatusDataD);
            xdl0.M(this.f23953B, z);
            this.f23976Y = true;
            return;
        }
        qff0 qff0Var = qff0.INSTANCE;
        SimilarInterestsItemSwipeData similarInterestsItemSwipeDataM20946k = qff0Var.m20946k(str);
        if (similarInterestsItemSwipeDataM20946k != null) {
            xdl0.U(this.f23953B, i);
            this.f23953B.c(similarInterestsItemSwipeDataM20946k, qff0Var.m20940e());
            xdl0.M(this.f23953B, z);
            this.f23976Y = true;
        }
    }

    @Override // p009l.p3l
    /* JADX INFO: renamed from: y */
    public void mo20100y() {
        super.mo20100y();
    }

    /* JADX INFO: renamed from: y0 */
    public final void m26103y0(CoreSuggested.UserInfo userInfo, User user, int i) {
        sfh0 sfh0Var;
        this.f23968Q = userInfo;
        if (this.f23987h == null || (sfh0Var = this.f23969R) == null || sfh0Var.m22132a() == null || this.f23969R.m22132a().isEmpty()) {
            return;
        }
        this.f23987h.setAutoPlayEnabled(true);
        this.f23987h.m3014Z(user, userInfo, this.f23969R, i, this.f18373e);
    }

    @Override // p009l.p3l
    /* JADX INFO: renamed from: z */
    public void mo20101z(float f) {
        super.mo20101z(f);
        this.f23983f.setCardStyleChangeProgress(f);
        this.f23989i.setAlpha(1.0f - f);
        this.f23987h.setCardStyleChangeProgress(f);
    }

    /* JADX INFO: renamed from: z0 */
    public void m26104z0(CoreSuggested.UserInfo userInfo) {
        int i;
        if (this.f23973V) {
            xdl0.M(this.f24007z, false);
            return;
        }
        if (!userInfo.id.equals(a0.j().d.get())) {
            xdl0.M(this.f24007z, false);
            return;
        }
        String language = Locale.getDefault().getLanguage();
        if ("in".equals(language) || "id".equals(language)) {
            i = x2c0.U2;
        } else if ("ja".equals(language)) {
            i = x2c0.W2;
        } else if ("ko".equals(language)) {
            i = x2c0.X2;
        } else {
            i = "th".equals(language) ? x2c0.Y2 : x2c0.V2;
        }
        m26070K0(userInfo.id);
        this.f24007z.setImageResource(i);
        xdl0.M(this.f24007z, true);
    }

    /* JADX INFO: renamed from: l.zwk$c */
    public class C1377c implements ViewPager.j {
        public C1377c() {
        }

        public void onPageSelected(int i) {
            zwk.this.m26072M0();
        }

        public void onPageScrollStateChanged(int i) {
        }

        public void onPageScrolled(int i, float f, int i2) {
        }
    }

    /* JADX INFO: renamed from: l.zwk$b */
    public class C1376b implements ExpandedImageSwitchView.InterfaceC0131b {
        public C1376b() {
        }

        @Override // com.p000p1.mobile.putong.core.newui.home.card.expanded.view.ExpandedImageSwitchView.InterfaceC0131b
        /* JADX INFO: renamed from: b */
        public void mo2312b() {
            zwk.this.m26076X();
        }

        @Override // com.p000p1.mobile.putong.core.newui.home.card.expanded.view.ExpandedImageSwitchView.InterfaceC0131b
        /* JADX INFO: renamed from: c */
        public void mo2313c(boolean z) {
            zwk.this.m26066G0(z ? 1.5f : -1.5f);
        }

        @Override // com.p000p1.mobile.putong.core.newui.home.card.expanded.view.ExpandedImageSwitchView.InterfaceC0131b
        /* JADX INFO: renamed from: d */
        public void mo2314d(int i, Media media, boolean z) {
            zwk.this.f23956E.m2280o(i, true);
            zwk zwkVar = zwk.this;
            xdl0.M(zwkVar.f24005x, zwkVar.f23973V);
            zwk.this.m26087i0();
            zwk.this.m26071L0();
        }

        @Override // com.p000p1.mobile.putong.core.newui.home.card.expanded.view.ExpandedImageSwitchView.InterfaceC0131b
        /* JADX INFO: renamed from: e */
        public boolean mo2315e(Media media) {
            try {
                return CoreModule.c.m0.e2.x3(zwk.this.f23968Q);
            } catch (Exception unused) {
            }
        }

        @Override // com.p000p1.mobile.putong.core.newui.home.card.expanded.view.ExpandedImageSwitchView.InterfaceC0131b
        /* JADX INFO: renamed from: f */
        public void mo2316f(int i, boolean z) {
        }
    }
}
