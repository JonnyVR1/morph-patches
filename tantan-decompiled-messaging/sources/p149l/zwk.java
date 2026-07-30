package p149l;

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
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p046p1.mobile.putong.app.PutongFrag;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.api.C4729a0;
import com.p046p1.mobile.putong.core.api.CoreSuggested;
import com.p046p1.mobile.putong.core.data.CardInfoRenderFrom;
import com.p046p1.mobile.putong.core.data.Conversation;
import com.p046p1.mobile.putong.core.data.CoreMomentInfo;
import com.p046p1.mobile.putong.core.data.IntlInsertCardData;
import com.p046p1.mobile.putong.core.data.IntlMarketToken;
import com.p046p1.mobile.putong.core.data.LikeMindedItemStatusData;
import com.p046p1.mobile.putong.core.data.SamesCardData;
import com.p046p1.mobile.putong.core.data.SimilarInterestsItemSwipeData;
import com.p046p1.mobile.putong.core.data.SwipeDirection;
import com.p046p1.mobile.putong.core.newui.admob.NavigationBarAdmobHelper;
import com.p046p1.mobile.putong.core.newui.home.C7865a;
import com.p046p1.mobile.putong.core.newui.home.base.impl.cardbottom.opt.C7868b;
import com.p046p1.mobile.putong.core.newui.home.card.expanded.UserProfileExpandedCardRoot;
import com.p046p1.mobile.putong.core.newui.home.card.expanded.helper.ExpandedCardStyleHelper;
import com.p046p1.mobile.putong.core.newui.home.card.expanded.view.ExpandedCardInforLayout;
import com.p046p1.mobile.putong.core.newui.home.card.expanded.view.ExpandedImageSwitchView;
import com.p046p1.mobile.putong.core.newui.home.views.CardHeadLayoutV2;
import com.p046p1.mobile.putong.core.newui.home.views.CardIntlPictureViewOpt;
import com.p046p1.mobile.putong.core.newui.home.views.IntlCommercialCardBottomActionLayout;
import com.p046p1.mobile.putong.core.newui.main.NewMainAct;
import com.p046p1.mobile.putong.core.newui.view.LinearMeasureOrderLayout;
import com.p046p1.mobile.putong.core.p053ui.animalfacial.AnimalFacialCardView;
import com.p046p1.mobile.putong.core.p053ui.intloperation.regularsticker.RegularStickerCardTabView;
import com.p046p1.mobile.putong.core.p053ui.likeminded.LikeMindedCardTabView;
import com.p046p1.mobile.putong.core.p053ui.profile.ProfileAct;
import com.p046p1.mobile.putong.core.p053ui.profile.profilelist.imp.ProfileListFragExpandedImpl;
import com.p046p1.mobile.putong.core.p053ui.profile.views.VPager_SquaredRefactor;
import com.p046p1.mobile.putong.core.p053ui.verification.VerificationCenterAct;
import com.p046p1.mobile.putong.data.Extensions;
import com.p046p1.mobile.putong.data.MatchScData;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.UserLiveState;
import com.p046p1.mobile.putong.live.base.data.BLiveOperationTitleShowType;
import com.p046p1.mobile.putong.p049ab.IntlCountryCodeController;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.SVGAnimationView;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import p133rx.subjects.C22392a;
import p147v.VDraweeView;
import p147v.VFrame;
import p147v.VImage;
import p147v.VLinear;
import p147v.VText;

/* JADX INFO: loaded from: classes11.dex */
public class zwk extends p3l implements umf {

    /* JADX INFO: renamed from: A */
    public ViewStub f205179A;

    /* JADX INFO: renamed from: B */
    public LikeMindedCardTabView f205180B;

    /* JADX INFO: renamed from: C */
    public ViewStub f205181C;

    /* JADX INFO: renamed from: D */
    public VText f205182D;

    /* JADX INFO: renamed from: E */
    public ExpandedCardInforLayout f205183E;

    /* JADX INFO: renamed from: F */
    public View f205184F;

    /* JADX INFO: renamed from: G */
    public VFrame f205185G;

    /* JADX INFO: renamed from: H */
    public ViewStub f205186H;

    /* JADX INFO: renamed from: I */
    public ViewStub f205187I;

    /* JADX INFO: renamed from: J */
    public VImage f205188J;

    /* JADX INFO: renamed from: K */
    public LinearLayout f205189K;

    /* JADX INFO: renamed from: L */
    public SVGAnimationView f205190L;

    /* JADX INFO: renamed from: M */
    public LinearLayout f205191M;

    /* JADX INFO: renamed from: N */
    public VText f205192N;

    /* JADX INFO: renamed from: O */
    public VImage f205193O;

    /* JADX INFO: renamed from: P */
    public User f205194P;

    /* JADX INFO: renamed from: Q */
    public CoreSuggested.UserInfo f205195Q;

    /* JADX INFO: renamed from: R */
    public sfh0 f205196R;

    /* JADX INFO: renamed from: S */
    public c4g0 f205197S;

    /* JADX INFO: renamed from: T */
    public c4g0 f205198T;

    /* JADX INFO: renamed from: X */
    public VDraweeView f205202X;

    /* JADX INFO: renamed from: Z */
    public RegularStickerCardTabView f205204Z;

    /* JADX INFO: renamed from: a0 */
    public AnimalFacialCardView f205205a0;

    /* JADX INFO: renamed from: d0 */
    public IntlCommercialCardBottomActionLayout f205208d0;

    /* JADX INFO: renamed from: e0 */
    public boolean f205209e0;

    /* JADX INFO: renamed from: f */
    public CardHeadLayoutV2 f205210f;

    /* JADX INFO: renamed from: f0 */
    public boolean f205211f0;

    /* JADX INFO: renamed from: g */
    public VFrame f205212g;

    /* JADX INFO: renamed from: g0 */
    public String f205213g0;

    /* JADX INFO: renamed from: h */
    public CardIntlPictureViewOpt f205214h;

    /* JADX INFO: renamed from: i */
    public View f205216i;

    /* JADX INFO: renamed from: i0 */
    public String f205217i0;

    /* JADX INFO: renamed from: j */
    public VImage f205218j;

    /* JADX INFO: renamed from: k */
    public VFrame f205219k;

    /* JADX INFO: renamed from: l */
    public LinearMeasureOrderLayout f205220l;

    /* JADX INFO: renamed from: m */
    public VText f205221m;

    /* JADX INFO: renamed from: n */
    public VText f205222n;

    /* JADX INFO: renamed from: o */
    public VFrame f205223o;

    /* JADX INFO: renamed from: p */
    public SVGAnimationView f205224p;

    /* JADX INFO: renamed from: q */
    public VText f205225q;

    /* JADX INFO: renamed from: r */
    public ViewStub f205226r;

    /* JADX INFO: renamed from: s */
    public ViewStub f205227s;

    /* JADX INFO: renamed from: t */
    public VImage f205228t;

    /* JADX INFO: renamed from: u */
    public FrameLayout f205229u;

    /* JADX INFO: renamed from: v */
    public VImage f205230v;

    /* JADX INFO: renamed from: w */
    public VImage f205231w;

    /* JADX INFO: renamed from: x */
    public VLinear f205232x;

    /* JADX INFO: renamed from: y */
    public VText f205233y;

    /* JADX INFO: renamed from: z */
    public VImage f205234z;

    /* JADX INFO: renamed from: U */
    public long f205199U = 0;

    /* JADX INFO: renamed from: V */
    public boolean f205200V = false;

    /* JADX INFO: renamed from: W */
    public boolean f205201W = false;

    /* JADX INFO: renamed from: Y */
    public boolean f205203Y = false;

    /* JADX INFO: renamed from: b0 */
    public VImage f205206b0 = null;

    /* JADX INFO: renamed from: c0 */
    public VText f205207c0 = null;

    /* JADX INFO: renamed from: h0 */
    public boolean f205215h0 = false;

    /* JADX INFO: renamed from: l.zwk$a */
    public class RunnableC21794a implements Runnable {
        public RunnableC21794a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            xdl0.m208325C0(zwk.this.f205214h.f23624b, -1);
            zwk.this.f205214h.setCardStyleChangeProgress(ExpandedCardStyleHelper.m38090o().m38102r());
        }
    }

    /* JADX INFO: renamed from: G */
    public static /* synthetic */ Boolean m220600G(User user, ExpandedCardStyleHelper.C7951b c7951b) {
        User user2 = c7951b.f22420c;
        return Boolean.valueOf(user2 == null || TextUtils.equals(user.f56011id, user2.f56011id));
    }

    /* JADX INFO: renamed from: J */
    public static /* synthetic */ Unit m220603J() {
        CoreModule.f17545c.f19663m0.f19420i2.onNext(SwipeDirection.RIGHT);
        return null;
    }

    /* JADX INFO: renamed from: A0 */
    public final void m220615A0(CoreSuggested.UserInfo userInfo, final User user) {
        this.f205211f0 = false;
        xdl0.m208344M(this.f205189K, false);
        xdl0.m208344M(this.f205223o, false);
        if (qp8.m175817b() && qib0.f154713b0.f139232c.mo67212Bq()) {
            final String str = user.f56011id;
            final String str2 = userInfo.from;
            final UserLiveState userLiveStateMo67272lt = CoreModule.m29936Q().mo67272lt(str);
            this.f205189K.setOnClickListener(null);
            Conversation conversationM32856Xe = CoreModule.f17545c.f19642f0.m32856Xe(str);
            if (!(!TextUtils.isEmpty(CoreModule.f17545c.f19663m0.f19438o2) && TextUtils.equals(CoreModule.f17545c.f19663m0.f19438o2, str) && conversationM32856Xe == null) && NullChecker.m81303a(CoreModule.m29936Q().getUserLiveId(str))) {
                this.f205211f0 = true;
                LinearLayout linearLayout = this.f205189K;
                CardInfoRenderFrom cardInfoRenderFrom = userInfo.renderFrom;
                CardInfoRenderFrom cardInfoRenderFrom2 = CardInfoRenderFrom.PROFILE;
                xdl0.m208344M(linearLayout, cardInfoRenderFrom == cardInfoRenderFrom2 || ExpandedCardStyleHelper.m38090o().m38103s());
                xdl0.m208344M(this.f205223o, userInfo.renderFrom != cardInfoRenderFrom2);
                this.f205192N.setTypeface(Typeface.DEFAULT_BOLD);
                xdl0.m208329E0(this.f205189K, new View.OnClickListener() { // from class: l.qwk
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f156734a.m220652s0(user, str, str2, userLiveStateMo67272lt, view);
                    }
                });
                xdl0.m208329E0(this.f205223o, new View.OnClickListener() { // from class: l.rwk
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f161347a.m220653t0(user, userLiveStateMo67272lt, str2, view);
                    }
                });
                if (!TextUtils.equals(this.f205213g0, str)) {
                    this.f205213g0 = str;
                    zvf0.m220403y("e_live_room_enter", OMSDialogPositon.p_suggest_user_profile_info_view, m220633Z(user, userLiveStateMo67272lt, str2));
                }
                if (userLiveStateMo67272lt == null || TextUtils.isEmpty(userLiveStateMo67272lt.multiCallInfo.onGoingMultiCallId)) {
                    this.f205192N.setText(R$string.f18426ch);
                    this.f205225q.setText(R$string.f18426ch);
                } else {
                    this.f205192N.setText(R$string.f18457dh);
                    this.f205225q.setText(R$string.f18457dh);
                }
                if (!this.f205190L.isAnimating()) {
                    SVGALoader.with(m167252w()).from("https://auto.tancdn.com/v1/raw/b83d11f9-6b88-41a2-a0dd-c3617bde118510.so").into(this.f205190L);
                }
                if (userInfo.renderFrom != cardInfoRenderFrom2 && !this.f205224p.isAnimating()) {
                    SVGALoader.with(m167252w()).from("https://auto.tancdn.com/v1/raw/b83d11f9-6b88-41a2-a0dd-c3617bde118510.so").into(this.f205224p);
                }
                boolean z = this.f205201W;
                LinearLayout linearLayout2 = this.f205189K;
                if (z) {
                    xdl0.m208357U(linearLayout2, t100.m186890d(50.0f));
                } else {
                    xdl0.m208357U(linearLayout2, t100.m186890d(20.0f));
                }
            }
        }
    }

    @Override // p149l.p3l
    /* JADX INFO: renamed from: B */
    public void mo38150B(CoreSuggested.UserInfo userInfo, User user, int i, int i2, int i3) {
        m220620F0();
        this.f205194P = user;
        this.f205195Q = userInfo;
        this.f205214h.setParentHolder(this);
        this.f205210f.setRenderFrom(this.f205195Q.renderFrom);
        m220638e0(userInfo, user, i);
        m220658y0(userInfo, user, i);
        if (userInfo.renderFrom == CardInfoRenderFrom.PROFILE) {
            this.f205209e0 = true;
            m220624J0();
        } else {
            ExpandedCardStyleHelper.C7951b c7951bM38099n = ExpandedCardStyleHelper.m38090o().m38099n();
            this.f205209e0 = i == 0 && ExpandedCardStyleHelper.m38090o().m38103s() && NullChecker.m81303a(c7951bM38099n) && NullChecker.m81303a(c7951bM38099n.f22421d) && TextUtils.equals(user.f56011id, c7951bM38099n.f22421d.f19472id);
            m220623I0(userInfo, user, i);
        }
        m220615A0(userInfo, user);
        if (userInfo.renderFrom == CardInfoRenderFrom.CARD) {
            this.f205210f.setNextInfoExposureSizePx(t100.m186890d(100.0f));
            if (i == 0) {
                mo167255z(ExpandedCardStyleHelper.m38090o().m38102r());
            } else {
                mo167255z(0.0f);
            }
        }
        m220637d0(userInfo, user);
    }

    /* JADX INFO: renamed from: B0 */
    public void m220616B0(User user, int i) {
        boolean z = false;
        this.f205201W = false;
        if (user.isMe() || xp5.m210478r(user, this.f205195Q)) {
            return;
        }
        if (user.superLikedMe() || user.letter()) {
            this.f205201W = true;
            int i2 = (user.superLikedMe() && IntlCountryCodeController.m28126v()) ? x2c0.f189379H2 : x2c0.f189316F2;
            this.f205230v.setImageResource(i2);
            this.f205188J.setImageResource(IntlCountryCodeController.m28126v() ? x2c0.f189487Kh : x2c0.f189549Mh);
            VImage vImage = this.f205230v;
            if (i == 0 && this.f205214h.getCurrentItem() == 0) {
                z = true;
            }
            xdl0.m208344M(vImage, z);
        }
    }

    /* JADX INFO: renamed from: C0 */
    public final void m220617C0(User user) {
        if (!user.isNewHere() || this.f205200V || this.f205201W || this.f205203Y || xdl0.m208349O0(this.f205234z)) {
            xdl0.m208344M(this.f205182D, false);
        } else {
            xdl0.m208344M(this.f205182D, true);
        }
    }

    /* JADX INFO: renamed from: D0 */
    public void m220618D0(User user) {
        if (this.f205201W) {
            return;
        }
        q8p.Companion companion = q8p.INSTANCE;
        if (companion.m173439n(this.f205195Q, user) || companion.m173438m(this.f205195Q)) {
            this.f205200V = true;
            if (this.f205195Q.getRenderUser() != null && this.f205195Q.getRenderUser().isNonBinary()) {
                this.f205233y.setText(R$string.f19094yf);
            }
            xdl0.m208344M(this.f205232x, true);
        }
    }

    /* JADX INFO: renamed from: E0 */
    public final void m220619E0(CoreSuggested.UserInfo userInfo, User user) {
        String string;
        if (!userInfo.hasLikeMeSlideCardTop) {
            xdl0.m208344M(this.f205221m, false);
            xdl0.m208344M(this.f205222n, false);
            return;
        }
        q8p.Companion companion = q8p.INSTANCE;
        if (companion.m173439n(userInfo, user) || companion.m173438m(userInfo)) {
            xdl0.m208344M(this.f205222n, true);
            this.f205222n.setTypeface(eqh0.m117752c(3), 1);
            return;
        }
        xdl0.m208344M(this.f205222n, false);
        xdl0.m208344M(this.f205221m, true);
        this.f205221m.setTypeface(eqh0.m117752c(3), 1);
        VText vText = this.f205221m;
        if (user.isNonBinary()) {
            string = this.f205221m.getContext().getString(R$string.f19124zf);
        } else {
            boolean zIsFemale = user.isFemale();
            VText vText2 = this.f205221m;
            string = zIsFemale ? vText2.getContext().getString(R$string.f18149Tc) : vText2.getContext().getString(R$string.f18119Sc);
        }
        vText.setText(string);
    }

    /* JADX INFO: renamed from: F0 */
    public final void m220620F0() {
        CoreSuggested.UserInfo userInfo = this.f205195Q;
        if (userInfo != null && userInfo.renderFrom == CardInfoRenderFrom.CARD && ExpandedCardStyleHelper.m38090o().m38103s() && ExpandedCardStyleHelper.m38090o().m38099n() != null && ExpandedCardStyleHelper.m38090o().m38099n().f22421d != null && TextUtils.equals(this.f205195Q.f19472id, ExpandedCardStyleHelper.m38090o().m38099n().f22421d.f19472id)) {
            CardIntlPictureViewOpt cardIntlPictureViewOpt = this.f205214h;
            if (cardIntlPictureViewOpt != null) {
                cardIntlPictureViewOpt.m39004W(true);
                return;
            }
            return;
        }
        if (this.f205195Q != null) {
            this.f205183E.m38301n();
            this.f205214h.m39010c0();
            CardIntlPictureViewOpt cardIntlPictureViewOpt2 = this.f205214h;
            CardInfoRenderFrom cardInfoRenderFrom = this.f205195Q.renderFrom;
            CardInfoRenderFrom cardInfoRenderFrom2 = CardInfoRenderFrom.CARD;
            cardIntlPictureViewOpt2.m38982A(cardInfoRenderFrom == cardInfoRenderFrom2);
            if (this.f205195Q.renderFrom == cardInfoRenderFrom2) {
                xdl0.m208344M(this.f205219k, true);
                xdl0.m208344M(this.f205229u, true);
                xdl0.m208344M(this.f205185G, true);
                xdl0.m208344M(this.f205220l, true);
                this.f205216i.setAlpha(1.0f);
                xdl0.m208344M(this.f205180B, false);
                xdl0.m208344M(this.f205188J, false);
                xdl0.m208344M(this.f205230v, false);
                this.f205201W = false;
                this.f205203Y = false;
                this.f205215h0 = false;
                xdl0.m208344M(this.f205228t, false);
                m220636c0();
            }
        }
        CardIntlPictureViewOpt cardIntlPictureViewOpt3 = this.f205214h;
        if (cardIntlPictureViewOpt3 != null) {
            cardIntlPictureViewOpt3.m39004W(true);
            this.f205214h.m39009b0();
        }
        mkd0.m154992z(this.f205197S);
        mkd0.m154992z(this.f205198T);
    }

    /* JADX INFO: renamed from: G0 */
    public final void m220621G0(float f) {
        boolean z;
        View view = this.f205210f;
        if (this.f205195Q.renderFrom == CardInfoRenderFrom.CARD) {
            while (true) {
                if (!(view.getParent() instanceof ViewGroup)) {
                    z = false;
                    break;
                } else {
                    if (view.getParent() instanceof UserProfileExpandedCardRoot) {
                        view = (View) view.getParent();
                        z = true;
                        break;
                    }
                    view = (View) view.getParent();
                }
            }
            if (!z) {
                view = this.f205210f;
            }
        }
        view.setPivotX(view.getWidth() / 2.0f);
        view.setPivotY(view.getHeight() / 2.0f);
        bt0.m103741n(view, View.ROTATION_Y, 0.0f, f, 0.0f).setDuration(200L).start();
    }

    /* JADX INFO: renamed from: H0 */
    public final boolean m220622H0() {
        CardIntlPictureViewOpt cardIntlPictureViewOpt;
        User user = this.f205194P;
        return (user == null || user.isMe() || this.f205194P.isTeamAccount() || xp5.m210476p(this.f205194P) || !this.f205209e0 || (cardIntlPictureViewOpt = this.f205214h) == null || cardIntlPictureViewOpt.m38987F()) ? false : true;
    }

    /* JADX INFO: renamed from: I0 */
    public final void m220623I0(CoreSuggested.UserInfo userInfo, User user, int i) {
        xdl0.m208344M(this.f205216i, true);
        m220654u0(user, userInfo);
        this.f205216i.setAlpha(1.0f);
        this.f205183E.m38300m(user, this.f205195Q, i, this.f205210f, this.f205184F);
        m220618D0(user);
        m220616B0(user, 0);
        m220656w0(userInfo, i);
        m220619E0(userInfo, user);
        m220655v0(user, this.f205195Q, i);
        m220659z0(userInfo);
        m220657x0(userInfo, user.profile.extensions, t100.f167264m, this.f205214h.getCurrentItem() == 0);
        m220617C0(user);
    }

    /* JADX INFO: renamed from: J0 */
    public final void m220624J0() {
        this.f205216i.setAlpha(0.0f);
        this.f205210f.setShortCardStyle(true);
        xdl0.m208344M(this.f205183E, false);
        m220616B0(this.f205194P, 0);
        xdl0.m208344M(this.f205230v, false);
        xdl0.m208344M(this.f205188J, this.f205201W);
    }

    /* JADX INFO: renamed from: K0 */
    public final void m220625K0(String str) {
        if (str.equals(this.f205217i0)) {
            return;
        }
        zvf0.m220402x("e_special_card", "p_suggest_users_home_view");
        this.f205217i0 = str;
    }

    /* JADX INFO: renamed from: L0 */
    public final void m220626L0() {
        boolean z = this.f205215h0 && !this.f205209e0 && this.f205214h.getCurrentItem() == 0;
        xdl0.m208344M(this.f205228t, z);
        this.f205214h.setCertBtnShowing(z);
        this.f205183E.setHideCertIconForCardBtn(this.f205215h0);
    }

    /* JADX INFO: renamed from: M0 */
    public final void m220627M0() {
        if (this.f205218j == null || this.f205194P == null || this.f205214h == null) {
            return;
        }
        boolean zM220622H0 = m220622H0();
        xdl0.m208344M(this.f205218j, zM220622H0);
        if (!zM220622H0 || this.f205195Q == null) {
            return;
        }
        String strM107929a = co5.m107929a("profile_photo_compliment_btn");
        if (TextUtils.isEmpty(strM107929a)) {
            return;
        }
        co5.m107934f(m167250A(this.f205195Q), strM107929a);
    }

    /* JADX INFO: renamed from: N0 */
    public final void m220628N0(boolean z, boolean z2) {
        xdl0.m208344M(this.f205184F, z);
        xdl0.m208344M(this.f205183E.f22561d, z2);
    }

    /* JADX INFO: renamed from: V */
    public final void m220629V(View view) {
        axk.m99450a(this, view);
    }

    /* JADX INFO: renamed from: W */
    public final void m220630W(boolean z, boolean z2) {
        this.f205183E.m38294g(z);
        boolean z3 = true;
        m220628N0(!z, (IntlCountryCodeController.m28126v() || z) ? false : true);
        if (z) {
            xdl0.m208357U(this.f205184F, 0);
            xdl0.m208357U(this.f205183E.f22561d, 0);
            if (m167252w() instanceof NewMainAct) {
                ((NewMainAct) m167252w()).m39801Z5().m39982O();
            }
        } else {
            ExpandedCardInforLayout expandedCardInforLayout = this.f205183E;
            C7868b c7868b = expandedCardInforLayout.f22564g;
            if (c7868b != null) {
                expandedCardInforLayout.m38304q(c7868b.m37446v(), this.f205184F);
            }
        }
        this.f205214h.m39006Y();
        this.f205214h.m39017j0();
        this.f205214h.m38982A(!z);
        m220626L0();
        this.f205216i.setAlpha(z ? 0.0f : 1.0f);
        xdl0.m208344M(this.f205219k, !z);
        xdl0.m208344M(this.f205229u, !z);
        xdl0.m208344M(this.f205185G, !z);
        xdl0.m208344M(this.f205220l, !z);
        xdl0.m208344M(this.f205188J, z && this.f205201W);
        xdl0.m208344M(this.f205189K, z && this.f205211f0);
        xdl0.m208344M(this.f205223o, !z && this.f205211f0);
        m220627M0();
        if (z2 && !this.f205214h.m39001T() && z) {
            this.f205214h.m38985D();
        }
        if (z) {
            try {
                int i = (this.f205214h.getCurrentView() == null || !this.f205214h.getCurrentView().f28045I0.m221515e().booleanValue()) ? 1 : 0;
                boolean z4 = this.f205195Q.isUserLikeMe() || (CoreModule.f17557o.m195055b().mo33649wf() && this.f205195Q.hasLikeMeSlideCardTop);
                String str = z4 ? "upper_right" : "null";
                if (NullChecker.m81303a(this.f205183E.f22564g) && this.f205183E.f22564g.mo37440i()) {
                    str = "lower_left";
                    z4 = true;
                }
                CoreMomentInfo coreMomentInfoM220634a0 = m220634a0();
                o6j0.C18854a c18854aM162876f = o6j0.C18854a.m162876f("IsWhiteBlock", i);
                o6j0.C18854a c18854aM162879i = o6j0.C18854a.m162879i("moments_user_id", NullChecker.m81303a(this.f205194P.f56011id));
                o6j0.C18854a c18854aM162879i2 = o6j0.C18854a.m162879i("show_he_liked", z4);
                o6j0.C18854a c18854aM162878h = o6j0.C18854a.m162878h("show_he_liked_position", str);
                o6j0.C18854a c18854aM162879i3 = o6j0.C18854a.m162879i("is_first_picture", TextUtils.equals(nt30.f140336V0, this.f205194P.f56011id) && this.f205214h.getCurrentItem() == 0);
                o6j0.C18854a c18854aM162878h2 = o6j0.C18854a.m162878h("swipe_scene", "default");
                if (!NullChecker.m81303a(this.f205195Q) || !this.f205195Q.isThemeCard) {
                    z3 = false;
                }
                o6j0.C18854a c18854aM162879i4 = o6j0.C18854a.m162879i("theme_card_ornot", z3);
                String str2 = "1";
                o6j0.C18854a c18854aM162878h3 = o6j0.C18854a.m162878h("is_moment_card", m220644k0() ? "1" : "0");
                o6j0.C18854a c18854aM162878h4 = o6j0.C18854a.m162878h("moment_id", coreMomentInfoM220634a0 != null ? coreMomentInfoM220634a0.f56008id : "0");
                if (!upa.m194809r1() || !NullChecker.m81303a(this.f205195Q) || !this.f205195Q.meetAgain) {
                    str2 = "0";
                }
                o6j0.m162859c(MatchScData.ModuleId.mid_e_card, "p_suggest_users_home_view", (o6j0.C18854a[]) vwb.m200324f0(c18854aM162876f, c18854aM162879i, c18854aM162879i2, c18854aM162878h, c18854aM162879i3, c18854aM162878h2, c18854aM162879i4, c18854aM162878h3, c18854aM162878h4, o6j0.C18854a.m162878h("is_show_longtimenosee_tag", str2)).toArray(new o6j0.C18854a[0]));
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: renamed from: X */
    public final void m220631X() {
        if (mqi0.m155944o() - this.f205199U < 320) {
            return;
        }
        this.f205199U = mqi0.m155944o();
        CardInfoRenderFrom cardInfoRenderFrom = this.f205195Q.renderFrom;
        CardInfoRenderFrom cardInfoRenderFrom2 = CardInfoRenderFrom.CARD;
        if (!(cardInfoRenderFrom != cardInfoRenderFrom2 ? cardInfoRenderFrom == cardInfoRenderFrom2 : true)) {
            if (cardInfoRenderFrom == CardInfoRenderFrom.PROFILE) {
                m167252w().onBackPressed();
            }
        } else if (!ExpandedCardStyleHelper.m38090o().m38103s()) {
            ExpandedCardStyleHelper.m38090o().m38098m(this.f205194P, this.f205195Q);
        } else {
            lra0.m151149h("hotspot");
            ExpandedCardStyleHelper.m38090o().m38096k(this.f205194P, this.f205195Q, "card click back");
        }
    }

    /* JADX INFO: renamed from: Y */
    public final String m220632Y(@Nullable UserLiveState userLiveState) {
        return CoreModule.m29936Q().mo67214Dr(NullChecker.m81303a(userLiveState) ? userLiveState.multiCallInfo.onGoingMultiCallRole : "");
    }

    /* JADX INFO: renamed from: Z */
    public final HashMap<String, Object> m220633Z(User user, UserLiveState userLiveState, String str) {
        HashMap<String, Object> map = new HashMap<>();
        boolean z = (userLiveState == null || TextUtils.isEmpty(userLiveState.multiCallInfo.onGoingMultiCallId)) ? false : true;
        map.put("liveId", CoreModule.m29936Q().getUserLiveId(user.f56011id));
        map.put("anchorId", user.f56011id);
        map.put(FirebaseAnalytics.Param.INDEX, "NA");
        map.put("module", "e_profile_album");
        map.put("trace_id", "");
        map.put("live_status", (userLiveState == null || !userLiveState.isLiveOpened()) ? BLiveOperationTitleShowType.off : "on");
        map.put("right_recommend_type", "");
        if (!z) {
            userLiveState = null;
        }
        map.put("live_room_live_type", m220632Y(userLiveState));
        map.put("show_label", z ? "连线" : "");
        map.put("refer_pid", "home_card".equals(str) ? "home_card" : "");
        map.put("liveRecommendCategory", "NA");
        if (CoreModule.f17545c.f19663m0.m31020L6(user.f56011id) && "home_card".equals(str)) {
            map.put("live_enter_source", "suggest_live_card_profile");
            return map;
        }
        map.put("live_enter_source", "NA");
        return map;
    }

    /* JADX INFO: renamed from: a0 */
    public CoreMomentInfo m220634a0() {
        CoreSuggested.UserInfo userInfo;
        CoreMomentInfo coreMomentInfo;
        if ((!upa.m194647I0().enabled && !e900.m115330b().m115334f()) || (userInfo = this.f205195Q) == null || (coreMomentInfo = userInfo.coreMomentInfo) == null) {
            return null;
        }
        return coreMomentInfo;
    }

    @Override // p149l.umf
    /* JADX INFO: renamed from: b */
    public C22392a<Boolean> mo194344b() {
        if (this.f205214h.getCurrentView() != null) {
            return this.f205214h.getCurrentView().f28045I0;
        }
        return null;
    }

    /* JADX INFO: renamed from: b0 */
    public final void m220635b0(User user) {
        User userM169527p9 = CoreModule.f17545c.f19639e0.m169527p9();
        zvf0.m220396r("e_clone_card_avatar_verified_tag", "p_suggest_users_home_view");
        if (userM169527p9 == null || !userM169527p9.isPicVerificationVerified()) {
            m167252w().startActivity(VerificationCenterAct.m55992Y1(m167252w(), false, "card_verify_popup"));
        } else {
            new bj4(m167252w(), user).show();
        }
    }

    @Override // p149l.umf
    /* JADX INFO: renamed from: c */
    public C22392a<Boolean> mo194345c() {
        if (this.f205214h.getCurrentView() != null) {
            return this.f205214h.getCurrentView().f28047J0;
        }
        return null;
    }

    /* JADX INFO: renamed from: c0 */
    public final void m220636c0() {
        this.f205200V = false;
        xdl0.m208344M(this.f205232x, false);
    }

    @Override // p149l.umf
    /* JADX INFO: renamed from: d */
    public Media mo194346d() {
        if (this.f205214h.getCurrentView() != null) {
            return this.f205214h.getCurrentView().f28040G;
        }
        return null;
    }

    /* JADX INFO: renamed from: d0 */
    public final void m220637d0(CoreSuggested.UserInfo userInfo, final User user) {
        CardIntlPictureViewOpt cardIntlPictureViewOpt;
        VPager_SquaredRefactor vPager_SquaredRefactor;
        if (this.f205218j == null || (cardIntlPictureViewOpt = this.f205214h) == null || (vPager_SquaredRefactor = cardIntlPictureViewOpt.f23624b) == null) {
            return;
        }
        vPager_SquaredRefactor.m4185d(new C21796c());
        m220627M0();
        final boolean z = userInfo.renderFrom == CardInfoRenderFrom.PROFILE;
        xdl0.m208329E0(this.f205218j, new View.OnClickListener() { // from class: l.twk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f172397a.m220646m0(user, z, view);
            }
        });
    }

    /* JADX INFO: renamed from: e0 */
    public final void m220638e0(CoreSuggested.UserInfo userInfo, final User user, int i) {
        sfh0 sfh0Var = new sfh0(userInfo, user);
        this.f205196R = sfh0Var;
        m220641h0(sfh0Var);
        CardInfoRenderFrom cardInfoRenderFrom = userInfo.renderFrom;
        CardInfoRenderFrom cardInfoRenderFrom2 = CardInfoRenderFrom.CARD;
        if (cardInfoRenderFrom == cardInfoRenderFrom2) {
            boolean z = (ExpandedCardStyleHelper.m38090o().m38103s() && i == 0) ? false : true;
            m220628N0(z, !IntlCountryCodeController.m28126v() && z);
            if (i == 0 && userInfo.renderFrom == cardInfoRenderFrom2) {
                mkd0.m154992z(this.f205197S);
                this.f205197S = m209781k(m167252w(), ExpandedCardStyleHelper.m38090o().m38109y()).filter(new w9j() { // from class: l.uwk
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return zwk.m220600G(user, (ExpandedCardStyleHelper.C7951b) obj);
                    }
                }).subscribe(mkd0.m154955G(new e30() { // from class: l.vwk
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        this.f183352a.m220648o0((ExpandedCardStyleHelper.C7951b) obj);
                    }
                }));
                mkd0.m154992z(this.f205198T);
                this.f205198T = m209781k(m167252w(), NavigationBarAdmobHelper.INSTANCE.m36151l()).subscribe(mkd0.m154955G(new e30() { // from class: l.wwk
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        this.f188382a.m220649p0((Integer) obj);
                    }
                }));
            }
        }
    }

    /* JADX INFO: renamed from: f0 */
    public final void m220639f0(Extensions extensions, int i, boolean z) {
        try {
            LikeMindedItemStatusData likeMindedItemStatusDataM204890l = wp0.INSTANCE.m204890l(extensions);
            if (likeMindedItemStatusDataM204890l != null) {
                if (NullChecker.m81303a(this.f205205a0)) {
                    xdl0.m208344M(this.f205205a0, z);
                } else {
                    this.f205205a0 = (AnimalFacialCardView) this.f205181C.inflate();
                }
                xdl0.m208357U(this.f205205a0, i);
                this.f205205a0.m44323b(likeMindedItemStatusDataM204890l);
            }
        } catch (Exception unused) {
        }
    }

    @Override // p149l.xkf
    @SuppressLint({"ResourceType"})
    /* JADX INFO: renamed from: g */
    public void mo38153g(View view) {
        super.mo38153g(view);
        m220629V(view);
        xdl0.m208329E0(this.f205184F, new View.OnClickListener() { // from class: l.owk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f146066a.m220645l0(view2);
            }
        });
    }

    /* JADX INFO: renamed from: g0 */
    public final void m220640g0(CoreSuggested.UserInfo userInfo, boolean z, boolean z2) {
        try {
            if (NullChecker.m81303a(this.f205202X)) {
                xdl0.m208344M(this.f205202X, z);
            } else {
                this.f205202X = (VDraweeView) this.f205226r.inflate();
            }
            String str = z2 ? userInfo.samesCardData.tag_url : userInfo.samesCardData.icon_url;
            if (this.f205202X.getTag() != str) {
                this.f205202X.setTag(str);
                qib0.f154691G.m102337O0(this.f205202X, str, true, false, null, null);
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: h0 */
    public final void m220641h0(sfh0 sfh0Var) {
        this.f205214h.m39008a0(sfh0Var, this.f205194P, new C21795b());
    }

    /* JADX INFO: renamed from: i0 */
    public final void m220642i0() {
        xdl0.m208344M(this.f205180B, this.f205203Y && this.f205214h.getCurrentItem() == 0);
        if (NullChecker.m81303a(this.f205202X)) {
            xdl0.m208344M(this.f205202X, this.f205214h.getCurrentItem() == 0);
        }
        if (NullChecker.m81303a(this.f205204Z)) {
            xdl0.m208344M(this.f205204Z, this.f205214h.getCurrentItem() == 0);
        }
        if (NullChecker.m81303a(this.f205205a0)) {
            xdl0.m208344M(this.f205205a0, this.f205214h.getCurrentItem() == 0);
        }
    }

    @Override // p149l.xkf
    /* JADX INFO: renamed from: j */
    public boolean mo209780j(View view) {
        return view instanceof CardHeadLayoutV2;
    }

    /* JADX INFO: renamed from: j0 */
    public boolean m220643j0() {
        return NullChecker.m81303a(this.f205208d0) && xdl0.m208349O0(this.f205208d0) && xdl0.m208349O0(this.f205185G);
    }

    /* JADX INFO: renamed from: k0 */
    public final boolean m220644k0() {
        CoreSuggested.UserInfo userInfo = this.f205195Q;
        return (userInfo == null || userInfo.coreMomentInfo == null) ? false : true;
    }

    /* JADX INFO: renamed from: l0 */
    public final /* synthetic */ void m220645l0(View view) {
        User user = this.f205194P;
        if (user == null || !TextUtils.equals(user.f56011id, CoreModule.f17545c.f19663m0.m31137q6())) {
            return;
        }
        this.f205214h.m39021z();
    }

    /* JADX INFO: renamed from: m0 */
    public final /* synthetic */ void m220646m0(User user, final boolean z, View view) {
        if (user == null || jo5.m142416b(m167252w(), this.f205195Q, user, "profile_photo_compliment_btn")) {
            return;
        }
        bo5.m102903n(m167252w(), user, "profile_photo_compliment_btn", Integer.valueOf(this.f205214h.getCurrentPosition()), null, new Function1() { // from class: l.ywk
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return this.f200511a.m220647n0(z, (User) obj);
            }
        }, this.f205195Q.liveRoomInfo);
    }

    /* JADX INFO: renamed from: n0 */
    public final /* synthetic */ Unit m220647n0(boolean z, User user) {
        bo5.m102898i().invoke(user);
        if (z && (m167252w() instanceof ProfileAct)) {
            PutongFrag putongFragM50748C2 = ((ProfileAct) m167252w()).m50748C2();
            if (putongFragM50748C2 instanceof ProfileListFragExpandedImpl) {
                ((ProfileListFragExpandedImpl) putongFragM50748C2).m52413V4().m109227n1(SwipeDirection.REMOVE.getValue());
            } else {
                m167252w().m66873d2();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ void m220648o0(ExpandedCardStyleHelper.C7951b c7951b) {
        boolean zM38115e = c7951b.m38115e();
        this.f205209e0 = zM38115e;
        m220630W(zM38115e, true);
    }

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ void m220649p0(Integer num) {
        this.f205210f.m38957P();
        this.f205214h.post(new RunnableC21794a());
    }

    @Override // p149l.xkf
    /* JADX INFO: renamed from: q */
    public void mo38154q(boolean z) {
        CardIntlPictureViewOpt cardIntlPictureViewOpt;
        if (z || (cardIntlPictureViewOpt = this.f205214h) == null) {
            return;
        }
        cardIntlPictureViewOpt.m39004W(false);
    }

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ void m220650q0(User user, View view) {
        m220635b0(user);
    }

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ void m220651r0(boolean z, CoreSuggested.UserInfo userInfo, View view) {
        p9w p9wVar = p9w.INSTANCE;
        p9wVar.m167915N(z, "click");
        j8w.INSTANCE.m140473a().m140433W(m167252w(), userInfo.intlInsertCardData.buzzUser.buzzToken, userInfo.f19472id, p9wVar.m167962x(), new Function0() { // from class: l.pwk
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return zwk.m220603J();
            }
        }, null, null, true);
    }

    @Override // p149l.xkf
    /* JADX INFO: renamed from: s */
    public void mo106149s() {
        super.mo106149s();
        m220620F0();
    }

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ void m220652s0(User user, String str, String str2, UserLiveState userLiveState, View view) {
        if (user.isMe()) {
            CoreModule.m29936Q().mo67217F8(m167252w(), false, true, null);
        } else {
            CoreModule.m29936Q().startAudienceLive(m167252w(), CoreModule.m29936Q().getUserLiveId(str), "profile", null);
        }
        if (CoreModule.f17545c.f19663m0.m31020L6(str) && TextUtils.equals("home_card", str2)) {
            ttn.m190607a(OMSDialogPositon.p_suggest_user_profile_info_view, user);
        } else {
            zvf0.m220397s("e_live_room_enter", OMSDialogPositon.p_suggest_user_profile_info_view, m220633Z(user, userLiveState, str2));
        }
    }

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ void m220653t0(User user, UserLiveState userLiveState, String str, View view) {
        if (CoreModule.f17545c.f19663m0.m31020L6(user.f56011id)) {
            return;
        }
        CoreModule.m29936Q().startAudienceLive(m167252w(), CoreModule.m29936Q().getUserLiveId(user.f56011id), "suggest-card", null);
        zvf0.m220397s("e_live_room_enter", "p_suggest_users_home_view", m220633Z(user, userLiveState, str));
    }

    /* JADX INFO: renamed from: u0 */
    public final void m220654u0(final User user, CoreSuggested.UserInfo userInfo) {
        this.f205215h0 = !user.isMe() && user.isPicVerificationVerified();
        m220626L0();
        if (this.f205215h0) {
            zvf0.m220402x("e_clone_card_avatar_verified_tag", "p_suggest_users_home_view");
            xdl0.m208329E0(this.f205228t, new View.OnClickListener() { // from class: l.swk
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f166699a.m220650q0(user, view);
                }
            });
        }
    }

    @Override // p149l.xkf
    /* JADX INFO: renamed from: v */
    public void mo209789v() {
        super.mo209789v();
        CardIntlPictureViewOpt cardIntlPictureViewOpt = this.f205214h;
        if (cardIntlPictureViewOpt != null) {
            cardIntlPictureViewOpt.m39004W(false);
        }
    }

    /* JADX INFO: renamed from: v0 */
    public void m220655v0(User user, CoreSuggested.UserInfo userInfo, int i) {
        boolean zM173439n = q8p.INSTANCE.m173439n(userInfo, user);
        IntlCommercialCardBottomActionLayout intlCommercialCardBottomActionLayout = this.f205208d0;
        if (!zM173439n) {
            if (intlCommercialCardBottomActionLayout != null) {
                xdl0.m208344M(intlCommercialCardBottomActionLayout, false);
                return;
            }
            return;
        }
        if (intlCommercialCardBottomActionLayout == null) {
            this.f205208d0 = (IntlCommercialCardBottomActionLayout) this.f205187I.inflate();
        }
        boolean zM28126v = IntlCountryCodeController.m28126v();
        IntlCommercialCardBottomActionLayout intlCommercialCardBottomActionLayout2 = this.f205208d0;
        if (zM28126v) {
            xdl0.m208359W(intlCommercialCardBottomActionLayout2, t100.m186890d(80.0f));
            xdl0.m208357U(this.f205208d0, t100.m186890d(20.0f));
            this.f205183E.m38295h(t100.m186890d(90.0f));
        } else {
            xdl0.m208359W(intlCommercialCardBottomActionLayout2, 0);
            xdl0.m208357U(this.f205208d0, t100.m186890d(20.0f));
            this.f205183E.m38295h(t100.m186890d(90.0f));
        }
        xdl0.m208344M(this.f205208d0, true);
        this.f205208d0.m39184Y(m167252w(), user, userInfo, i);
        if (i == 0) {
            if (IntlCountryCodeController.m28126v()) {
                CoreModule.f17545c.f19663m0.f19432m2.onNext(roj0.f160388a);
            } else {
                CoreModule.f17545c.f19663m0.f19429l2.onNext("renderCommercialCardBottomActionLayout");
            }
        }
    }

    /* JADX INFO: renamed from: w0 */
    public final void m220656w0(final CoreSuggested.UserInfo userInfo, int i) {
        if (u59.m191823d0() && NullChecker.m81303a(userInfo.intlInsertCardData) && NullChecker.m81303a(userInfo.intlInsertCardData.buzzUser)) {
            IntlInsertCardData intlInsertCardData = userInfo.intlInsertCardData;
            if (intlInsertCardData.cardType == 10 && intlInsertCardData.showType == 1) {
                final boolean z = intlInsertCardData.buzzUser.isBlur;
                if (i == 0) {
                    CoreModule.f17545c.f19663m0.f19347J0.onNext(Boolean.TRUE);
                    p9w.INSTANCE.m167916O(z);
                }
                if (z) {
                    m220628N0(false, false);
                }
                if (NullChecker.m81303a(this.f205207c0)) {
                    xdl0.m208344M(this.f205207c0, i == 0);
                }
                if (NullChecker.m81303a(this.f205206b0) && xdl0.m208349O0(this.f205206b0)) {
                    return;
                }
                if (this.f205206b0 == null) {
                    this.f205206b0 = (VImage) this.f205227s.inflate();
                }
                if (this.f205207c0 == null) {
                    this.f205207c0 = (VText) this.f205186H.inflate();
                }
                xdl0.m208344M(this.f205206b0, true);
                xdl0.m208344M(this.f205207c0, i == 0);
                this.f205183E.m38295h(t100.m186890d(84.0f));
                this.f205206b0.setBackgroundResource(x2c0.f190230i9);
                xdl0.m208329E0(this.f205207c0, new View.OnClickListener() { // from class: l.xwk
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f194739a.m220651r0(z, userInfo, view);
                    }
                });
                return;
            }
        }
        if (NullChecker.m81303a(this.f205206b0)) {
            xdl0.m208344M(this.f205206b0, false);
        }
        if (NullChecker.m81303a(this.f205207c0)) {
            xdl0.m208344M(this.f205207c0, false);
        }
    }

    /* JADX INFO: renamed from: x0 */
    public final void m220657x0(CoreSuggested.UserInfo userInfo, Extensions extensions, int i, boolean z) {
        LikeMindedItemStatusData likeMindedItemStatusDataM135619d;
        SamesCardData samesCardData = userInfo.samesCardData;
        if (samesCardData == null) {
            if (C7865a.INSTANCE.m36989b() && wp0.INSTANCE.m204888j(extensions) && !this.f205201W && !this.f205200V) {
                m220639f0(extensions, i, z);
                return;
            }
            xdl0.m208344M(this.f205180B, false);
            if (NullChecker.m81303a(this.f205202X)) {
                xdl0.m208344M(this.f205202X, false);
            }
            this.f205203Y = false;
            if (NullChecker.m81303a(this.f205204Z)) {
                xdl0.m208344M(this.f205204Z, false);
            }
            if (NullChecker.m81303a(this.f205205a0)) {
                xdl0.m208344M(this.f205205a0, false);
                return;
            }
            return;
        }
        String str = samesCardData.type;
        C7865a.Companion aVar = C7865a.INSTANCE;
        if (aVar.m36995h()) {
            xdl0.m208344M(this.f205180B, false);
            this.f205203Y = false;
            if (IntlMarketToken.quiz.equals(str)) {
                m220640g0(userInfo, z, false);
                return;
            }
            if ((IntlMarketToken.regular.equals(str) || IntlMarketToken.flash.equals(str)) && !this.f205200V) {
                if (NullChecker.m81303a(this.f205204Z)) {
                    xdl0.m208344M(this.f205204Z, z);
                } else {
                    this.f205204Z = (RegularStickerCardTabView) this.f205179A.inflate();
                }
                xdl0.m208357U(this.f205204Z, i);
                Object tag = this.f205204Z.getTag();
                String str2 = userInfo.samesCardData.f20497id;
                if (tag != str2) {
                    this.f205204Z.setTag(str2);
                    this.f205204Z.m46344b(userInfo.samesCardData);
                    return;
                }
                return;
            }
            return;
        }
        if (aVar.m36990c()) {
            m220640g0(userInfo, z, true);
            return;
        }
        if (!aVar.m36994g() || this.f205200V) {
            if (this.f205200V || (likeMindedItemStatusDataM135619d = idr.INSTANCE.m135619d(str)) == null) {
                return;
            }
            xdl0.m208357U(this.f205180B, i);
            this.f205180B.m46878b(likeMindedItemStatusDataM135619d);
            xdl0.m208344M(this.f205180B, z);
            this.f205203Y = true;
            return;
        }
        qff0 qff0Var = qff0.INSTANCE;
        SimilarInterestsItemSwipeData similarInterestsItemSwipeDataM174299k = qff0Var.m174299k(str);
        if (similarInterestsItemSwipeDataM174299k != null) {
            xdl0.m208357U(this.f205180B, i);
            this.f205180B.m46879c(similarInterestsItemSwipeDataM174299k, qff0Var.m174293e());
            xdl0.m208344M(this.f205180B, z);
            this.f205203Y = true;
        }
    }

    @Override // p149l.p3l
    /* JADX INFO: renamed from: y */
    public void mo167254y() {
        super.mo167254y();
    }

    /* JADX INFO: renamed from: y0 */
    public final void m220658y0(CoreSuggested.UserInfo userInfo, User user, int i) {
        sfh0 sfh0Var;
        this.f205195Q = userInfo;
        if (this.f205214h == null || (sfh0Var = this.f205196R) == null || sfh0Var.m183924a() == null || this.f205196R.m183924a().isEmpty()) {
            return;
        }
        this.f205214h.setAutoPlayEnabled(true);
        this.f205214h.m39007Z(user, userInfo, this.f205196R, i, this.f146992e);
    }

    @Override // p149l.p3l
    /* JADX INFO: renamed from: z */
    public void mo167255z(float f) {
        super.mo167255z(f);
        this.f205210f.setCardStyleChangeProgress(f);
        this.f205216i.setAlpha(1.0f - f);
        this.f205214h.setCardStyleChangeProgress(f);
    }

    /* JADX INFO: renamed from: z0 */
    public void m220659z0(CoreSuggested.UserInfo userInfo) {
        int i;
        if (this.f205200V) {
            xdl0.m208344M(this.f205234z, false);
            return;
        }
        if (!userInfo.f19472id.equals(C4729a0.m31387j().f19525d.get())) {
            xdl0.m208344M(this.f205234z, false);
            return;
        }
        String language = Locale.getDefault().getLanguage();
        if ("in".equals(language) || "id".equals(language)) {
            i = x2c0.f189782U2;
        } else if ("ja".equals(language)) {
            i = x2c0.f189844W2;
        } else if ("ko".equals(language)) {
            i = x2c0.f189875X2;
        } else {
            i = "th".equals(language) ? x2c0.f189906Y2 : x2c0.f189813V2;
        }
        m220625K0(userInfo.f19472id);
        this.f205234z.setImageResource(i);
        xdl0.m208344M(this.f205234z, true);
    }

    /* JADX INFO: renamed from: l.zwk$c */
    public class C21796c implements ViewPager.InterfaceC0716j {
        public C21796c() {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0716j
        public void onPageSelected(int i) {
            zwk.this.m220627M0();
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0716j
        public void onPageScrollStateChanged(int i) {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0716j
        public void onPageScrolled(int i, float f, int i2) {
        }
    }

    /* JADX INFO: renamed from: l.zwk$b */
    public class C21795b implements ExpandedImageSwitchView.InterfaceC7967b {
        public C21795b() {
        }

        @Override // com.p046p1.mobile.putong.core.newui.home.card.expanded.view.ExpandedImageSwitchView.InterfaceC7967b
        /* JADX INFO: renamed from: b */
        public void mo38334b() {
            zwk.this.m220631X();
        }

        @Override // com.p046p1.mobile.putong.core.newui.home.card.expanded.view.ExpandedImageSwitchView.InterfaceC7967b
        /* JADX INFO: renamed from: c */
        public void mo38335c(boolean z) {
            zwk.this.m220621G0(z ? 1.5f : -1.5f);
        }

        @Override // com.p046p1.mobile.putong.core.newui.home.card.expanded.view.ExpandedImageSwitchView.InterfaceC7967b
        /* JADX INFO: renamed from: d */
        public void mo38336d(int i, Media media, boolean z) {
            zwk.this.f205183E.m38302o(i, true);
            zwk zwkVar = zwk.this;
            xdl0.m208344M(zwkVar.f205232x, zwkVar.f205200V);
            zwk.this.m220642i0();
            zwk.this.m220626L0();
        }

        @Override // com.p046p1.mobile.putong.core.newui.home.card.expanded.view.ExpandedImageSwitchView.InterfaceC7967b
        /* JADX INFO: renamed from: e */
        public boolean mo38337e(Media media) {
            try {
                return CoreModule.f17545c.f19663m0.f19408e2.m34219x3(zwk.this.f205195Q);
            } catch (Exception unused) {
            }
        }

        @Override // com.p046p1.mobile.putong.core.newui.home.card.expanded.view.ExpandedImageSwitchView.InterfaceC7967b
        /* JADX INFO: renamed from: f */
        public void mo38338f(int i, boolean z) {
        }
    }
}
