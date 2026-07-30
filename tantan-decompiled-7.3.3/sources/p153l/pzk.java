package p153l;

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
import com.p051p1.mobile.putong.app.PutongFrag;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.api.C4880a0;
import com.p051p1.mobile.putong.core.api.CoreSuggested;
import com.p051p1.mobile.putong.core.data.CardInfoRenderFrom;
import com.p051p1.mobile.putong.core.data.Conversation;
import com.p051p1.mobile.putong.core.data.CoreMomentInfo;
import com.p051p1.mobile.putong.core.data.IntlInsertCardData;
import com.p051p1.mobile.putong.core.data.IntlMarketToken;
import com.p051p1.mobile.putong.core.data.LikeMindedItemStatusData;
import com.p051p1.mobile.putong.core.data.SamesCardData;
import com.p051p1.mobile.putong.core.data.SimilarInterestsItemSwipeData;
import com.p051p1.mobile.putong.core.data.SwipeDirection;
import com.p051p1.mobile.putong.core.newui.admob.NavigationBarAdmobHelper;
import com.p051p1.mobile.putong.core.newui.home.C8016a;
import com.p051p1.mobile.putong.core.newui.home.base.impl.cardbottom.opt.C8019b;
import com.p051p1.mobile.putong.core.newui.home.card.expanded.UserProfileExpandedCardRoot;
import com.p051p1.mobile.putong.core.newui.home.card.expanded.helper.ExpandedCardStyleHelper;
import com.p051p1.mobile.putong.core.newui.home.card.expanded.view.ExpandedCardInforLayout;
import com.p051p1.mobile.putong.core.newui.home.card.expanded.view.ExpandedImageSwitchView;
import com.p051p1.mobile.putong.core.newui.home.views.CardHeadLayoutV2;
import com.p051p1.mobile.putong.core.newui.home.views.CardIntlPictureViewOpt;
import com.p051p1.mobile.putong.core.newui.home.views.IntlCommercialCardBottomActionLayout;
import com.p051p1.mobile.putong.core.newui.main.NewMainAct;
import com.p051p1.mobile.putong.core.newui.view.LinearMeasureOrderLayout;
import com.p051p1.mobile.putong.core.p058ui.animalfacial.AnimalFacialCardView;
import com.p051p1.mobile.putong.core.p058ui.intloperation.regularsticker.RegularStickerCardTabView;
import com.p051p1.mobile.putong.core.p058ui.likeminded.LikeMindedCardTabView;
import com.p051p1.mobile.putong.core.p058ui.profile.ProfileAct;
import com.p051p1.mobile.putong.core.p058ui.profile.profilelist.imp.ProfileListFragExpandedImpl;
import com.p051p1.mobile.putong.core.p058ui.profile.views.VPager_SquaredRefactor;
import com.p051p1.mobile.putong.core.p058ui.verification.VerificationCenterAct;
import com.p051p1.mobile.putong.data.Extensions;
import com.p051p1.mobile.putong.data.MatchScData;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.UserLiveState;
import com.p051p1.mobile.putong.live.base.data.BLiveOperationTitleShowType;
import com.p051p1.mobile.putong.p054ab.IntlCountryCodeController;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.SVGAnimationView;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import p137rx.subjects.C22507a;
import p151v.VDraweeView;
import p151v.VFrame;
import p151v.VImage;
import p151v.VLinear;
import p151v.VText;

/* JADX INFO: loaded from: classes11.dex */
public class pzk extends f6l implements aof {

    /* JADX INFO: renamed from: A */
    public ViewStub f154875A;

    /* JADX INFO: renamed from: B */
    public LikeMindedCardTabView f154876B;

    /* JADX INFO: renamed from: C */
    public ViewStub f154877C;

    /* JADX INFO: renamed from: D */
    public VText f154878D;

    /* JADX INFO: renamed from: E */
    public ExpandedCardInforLayout f154879E;

    /* JADX INFO: renamed from: F */
    public View f154880F;

    /* JADX INFO: renamed from: G */
    public VFrame f154881G;

    /* JADX INFO: renamed from: H */
    public ViewStub f154882H;

    /* JADX INFO: renamed from: I */
    public ViewStub f154883I;

    /* JADX INFO: renamed from: J */
    public VImage f154884J;

    /* JADX INFO: renamed from: K */
    public LinearLayout f154885K;

    /* JADX INFO: renamed from: L */
    public SVGAnimationView f154886L;

    /* JADX INFO: renamed from: M */
    public LinearLayout f154887M;

    /* JADX INFO: renamed from: N */
    public VText f154888N;

    /* JADX INFO: renamed from: O */
    public VImage f154889O;

    /* JADX INFO: renamed from: P */
    public User f154890P;

    /* JADX INFO: renamed from: Q */
    public CoreSuggested.UserInfo f154891Q;

    /* JADX INFO: renamed from: R */
    public aoh0 f154892R;

    /* JADX INFO: renamed from: S */
    public kcg0 f154893S;

    /* JADX INFO: renamed from: T */
    public kcg0 f154894T;

    /* JADX INFO: renamed from: X */
    public VDraweeView f154898X;

    /* JADX INFO: renamed from: Z */
    public RegularStickerCardTabView f154900Z;

    /* JADX INFO: renamed from: a0 */
    public AnimalFacialCardView f154901a0;

    /* JADX INFO: renamed from: d0 */
    public IntlCommercialCardBottomActionLayout f154904d0;

    /* JADX INFO: renamed from: e0 */
    public boolean f154905e0;

    /* JADX INFO: renamed from: f */
    public CardHeadLayoutV2 f154906f;

    /* JADX INFO: renamed from: f0 */
    public boolean f154907f0;

    /* JADX INFO: renamed from: g */
    public VFrame f154908g;

    /* JADX INFO: renamed from: g0 */
    public String f154909g0;

    /* JADX INFO: renamed from: h */
    public CardIntlPictureViewOpt f154910h;

    /* JADX INFO: renamed from: i */
    public View f154912i;

    /* JADX INFO: renamed from: i0 */
    public String f154913i0;

    /* JADX INFO: renamed from: j */
    public VImage f154914j;

    /* JADX INFO: renamed from: k */
    public VFrame f154915k;

    /* JADX INFO: renamed from: l */
    public LinearMeasureOrderLayout f154916l;

    /* JADX INFO: renamed from: m */
    public VText f154917m;

    /* JADX INFO: renamed from: n */
    public VText f154918n;

    /* JADX INFO: renamed from: o */
    public VFrame f154919o;

    /* JADX INFO: renamed from: p */
    public SVGAnimationView f154920p;

    /* JADX INFO: renamed from: q */
    public VText f154921q;

    /* JADX INFO: renamed from: r */
    public ViewStub f154922r;

    /* JADX INFO: renamed from: s */
    public ViewStub f154923s;

    /* JADX INFO: renamed from: t */
    public VImage f154924t;

    /* JADX INFO: renamed from: u */
    public FrameLayout f154925u;

    /* JADX INFO: renamed from: v */
    public VImage f154926v;

    /* JADX INFO: renamed from: w */
    public VImage f154927w;

    /* JADX INFO: renamed from: x */
    public VLinear f154928x;

    /* JADX INFO: renamed from: y */
    public VText f154929y;

    /* JADX INFO: renamed from: z */
    public VImage f154930z;

    /* JADX INFO: renamed from: U */
    public long f154895U = 0;

    /* JADX INFO: renamed from: V */
    public boolean f154896V = false;

    /* JADX INFO: renamed from: W */
    public boolean f154897W = false;

    /* JADX INFO: renamed from: Y */
    public boolean f154899Y = false;

    /* JADX INFO: renamed from: b0 */
    public VImage f154902b0 = null;

    /* JADX INFO: renamed from: c0 */
    public VText f154903c0 = null;

    /* JADX INFO: renamed from: h0 */
    public boolean f154911h0 = false;

    /* JADX INFO: renamed from: l.pzk$a */
    public class RunnableC19471a implements Runnable {
        public RunnableC19471a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            bnl0.m105505C0(pzk.this.f154910h.f24366b, -1);
            pzk.this.f154910h.setCardStyleChangeProgress(ExpandedCardStyleHelper.m39093o().m39105r());
        }
    }

    /* JADX INFO: renamed from: G */
    public static /* synthetic */ Boolean m174469G(User user, ExpandedCardStyleHelper.C8102b c8102b) {
        User user2 = c8102b.f23162c;
        return Boolean.valueOf(user2 == null || TextUtils.equals(user.f56859id, user2.f56859id));
    }

    /* JADX INFO: renamed from: J */
    public static /* synthetic */ Unit m174472J() {
        CoreModule.f18264c.f20405m0.f20162i2.onNext(SwipeDirection.RIGHT);
        return null;
    }

    /* JADX INFO: renamed from: A0 */
    public final void m174484A0(CoreSuggested.UserInfo userInfo, final User user) {
        this.f154907f0 = false;
        bnl0.m105524M(this.f154885K, false);
        bnl0.m105524M(this.f154919o, false);
        if (vq8.m202358b() && uqb0.f180396b0.f170326c.mo68395Bq()) {
            final String str = user.f56859id;
            final String str2 = userInfo.from;
            final UserLiveState userLiveStateMo68455lt = CoreModule.m30934Q().mo68455lt(str);
            this.f154885K.setOnClickListener(null);
            Conversation conversationM33859Xe = CoreModule.f18264c.f20384f0.m33859Xe(str);
            if (!(!TextUtils.isEmpty(CoreModule.f18264c.f20405m0.f20180o2) && TextUtils.equals(CoreModule.f18264c.f20405m0.f20180o2, str) && conversationM33859Xe == null) && NullChecker.m82486a(CoreModule.m30934Q().getUserLiveId(str))) {
                this.f154907f0 = true;
                LinearLayout linearLayout = this.f154885K;
                CardInfoRenderFrom cardInfoRenderFrom = userInfo.renderFrom;
                CardInfoRenderFrom cardInfoRenderFrom2 = CardInfoRenderFrom.PROFILE;
                bnl0.m105524M(linearLayout, cardInfoRenderFrom == cardInfoRenderFrom2 || ExpandedCardStyleHelper.m39093o().m39106s());
                bnl0.m105524M(this.f154919o, userInfo.renderFrom != cardInfoRenderFrom2);
                this.f154888N.setTypeface(Typeface.DEFAULT_BOLD);
                bnl0.m105509E0(this.f154885K, new View.OnClickListener() { // from class: l.gzk
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f107211a.m174521s0(user, str, str2, userLiveStateMo68455lt, view);
                    }
                });
                bnl0.m105509E0(this.f154919o, new View.OnClickListener() { // from class: l.hzk
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f112260a.m174522t0(user, userLiveStateMo68455lt, str2, view);
                    }
                });
                if (!TextUtils.equals(this.f154909g0, str)) {
                    this.f154909g0 = str;
                    i4g0.m138527y("e_live_room_enter", OMSDialogPositon.p_suggest_user_profile_info_view, m174502Z(user, userLiveStateMo68455lt, str2));
                }
                if (userLiveStateMo68455lt == null || TextUtils.isEmpty(userLiveStateMo68455lt.multiCallInfo.onGoingMultiCallId)) {
                    this.f154888N.setText(R$string.f19804xh);
                    this.f154921q.setText(R$string.f19804xh);
                } else {
                    this.f154888N.setText(R$string.f19835yh);
                    this.f154921q.setText(R$string.f19835yh);
                }
                if (!this.f154886L.isAnimating()) {
                    SVGALoader.with(m124283w()).from("https://auto.tancdn.com/v1/raw/b83d11f9-6b88-41a2-a0dd-c3617bde118510.so").into(this.f154886L);
                }
                if (userInfo.renderFrom != cardInfoRenderFrom2 && !this.f154920p.isAnimating()) {
                    SVGALoader.with(m124283w()).from("https://auto.tancdn.com/v1/raw/b83d11f9-6b88-41a2-a0dd-c3617bde118510.so").into(this.f154920p);
                }
                boolean z = this.f154897W;
                LinearLayout linearLayout2 = this.f154885K;
                if (z) {
                    bnl0.m105537U(linearLayout2, qa00.m175859d(50.0f));
                } else {
                    bnl0.m105537U(linearLayout2, qa00.m175859d(20.0f));
                }
            }
        }
    }

    @Override // p153l.f6l
    /* JADX INFO: renamed from: B */
    public void mo39153B(CoreSuggested.UserInfo userInfo, User user, int i, int i2, int i3) {
        m174489F0();
        this.f154890P = user;
        this.f154891Q = userInfo;
        this.f154910h.setParentHolder(this);
        this.f154906f.setRenderFrom(this.f154891Q.renderFrom);
        m174507e0(userInfo, user, i);
        m174527y0(userInfo, user, i);
        if (userInfo.renderFrom == CardInfoRenderFrom.PROFILE) {
            this.f154905e0 = true;
            m174493J0();
        } else {
            ExpandedCardStyleHelper.C8102b c8102bM39102n = ExpandedCardStyleHelper.m39093o().m39102n();
            this.f154905e0 = i == 0 && ExpandedCardStyleHelper.m39093o().m39106s() && NullChecker.m82486a(c8102bM39102n) && NullChecker.m82486a(c8102bM39102n.f23163d) && TextUtils.equals(user.f56859id, c8102bM39102n.f23163d.f20214id);
            m174492I0(userInfo, user, i);
        }
        m174484A0(userInfo, user);
        if (userInfo.renderFrom == CardInfoRenderFrom.CARD) {
            this.f154906f.setNextInfoExposureSizePx(qa00.m175859d(100.0f));
            if (i == 0) {
                mo124286z(ExpandedCardStyleHelper.m39093o().m39105r());
            } else {
                mo124286z(0.0f);
            }
        }
        m174506d0(userInfo, user);
    }

    /* JADX INFO: renamed from: B0 */
    public void m174485B0(User user, int i) {
        boolean z = false;
        this.f154897W = false;
        if (user.isMe() || br5.m106047r(user, this.f154891Q)) {
            return;
        }
        if (user.superLikedMe() || user.letter()) {
            this.f154897W = true;
            int i2 = (user.superLikedMe() && IntlCountryCodeController.m29125v()) ? dbc0.f86235I2 : dbc0.f86171G2;
            this.f154926v.setImageResource(i2);
            this.f154884J.setImageResource(IntlCountryCodeController.m29125v() ? dbc0.f87612yi : dbc0.f85995Ai);
            VImage vImage = this.f154926v;
            if (i == 0 && this.f154910h.getCurrentItem() == 0) {
                z = true;
            }
            bnl0.m105524M(vImage, z);
        }
    }

    /* JADX INFO: renamed from: C0 */
    public final void m174486C0(User user) {
        if (!user.isNewHere() || this.f154896V || this.f154897W || this.f154899Y || bnl0.m105529O0(this.f154930z)) {
            bnl0.m105524M(this.f154878D, false);
        } else {
            bnl0.m105524M(this.f154878D, true);
        }
    }

    /* JADX INFO: renamed from: D0 */
    public void m174487D0(User user) {
        if (this.f154897W) {
            return;
        }
        qap.Companion companion = qap.INSTANCE;
        if (companion.m175976n(this.f154891Q, user) || companion.m175975m(this.f154891Q)) {
            this.f154896V = true;
            if (this.f154891Q.getRenderUser() != null && this.f154891Q.getRenderUser().isNonBinary()) {
                this.f154929y.setText(R$string.f18792Qf);
            }
            bnl0.m105524M(this.f154928x, true);
        }
    }

    /* JADX INFO: renamed from: E0 */
    public final void m174488E0(CoreSuggested.UserInfo userInfo, User user) {
        String string;
        if (!userInfo.hasLikeMeSlideCardTop) {
            bnl0.m105524M(this.f154917m, false);
            bnl0.m105524M(this.f154918n, false);
            return;
        }
        qap.Companion companion = qap.INSTANCE;
        if (companion.m175976n(userInfo, user) || companion.m175975m(userInfo)) {
            bnl0.m105524M(this.f154918n, true);
            this.f154918n.setTypeface(lyh0.m156283c(3), 1);
            return;
        }
        bnl0.m105524M(this.f154918n, false);
        bnl0.m105524M(this.f154917m, true);
        this.f154917m.setTypeface(lyh0.m156283c(3), 1);
        VText vText = this.f154917m;
        if (user.isNonBinary()) {
            string = this.f154917m.getContext().getString(R$string.f18822Rf);
        } else {
            boolean zIsFemale = user.isFemale();
            VText vText2 = this.f154917m;
            string = zIsFemale ? vText2.getContext().getString(R$string.f19428ld) : vText2.getContext().getString(R$string.f19397kd);
        }
        vText.setText(string);
    }

    /* JADX INFO: renamed from: F0 */
    public final void m174489F0() {
        CoreSuggested.UserInfo userInfo = this.f154891Q;
        if (userInfo != null && userInfo.renderFrom == CardInfoRenderFrom.CARD && ExpandedCardStyleHelper.m39093o().m39106s() && ExpandedCardStyleHelper.m39093o().m39102n() != null && ExpandedCardStyleHelper.m39093o().m39102n().f23163d != null && TextUtils.equals(this.f154891Q.f20214id, ExpandedCardStyleHelper.m39093o().m39102n().f23163d.f20214id)) {
            CardIntlPictureViewOpt cardIntlPictureViewOpt = this.f154910h;
            if (cardIntlPictureViewOpt != null) {
                cardIntlPictureViewOpt.m40007W(true);
                return;
            }
            return;
        }
        if (this.f154891Q != null) {
            this.f154879E.m39304n();
            this.f154910h.m40013c0();
            CardIntlPictureViewOpt cardIntlPictureViewOpt2 = this.f154910h;
            CardInfoRenderFrom cardInfoRenderFrom = this.f154891Q.renderFrom;
            CardInfoRenderFrom cardInfoRenderFrom2 = CardInfoRenderFrom.CARD;
            cardIntlPictureViewOpt2.m39985A(cardInfoRenderFrom == cardInfoRenderFrom2);
            if (this.f154891Q.renderFrom == cardInfoRenderFrom2) {
                bnl0.m105524M(this.f154915k, true);
                bnl0.m105524M(this.f154925u, true);
                bnl0.m105524M(this.f154881G, true);
                bnl0.m105524M(this.f154916l, true);
                this.f154912i.setAlpha(1.0f);
                bnl0.m105524M(this.f154876B, false);
                bnl0.m105524M(this.f154884J, false);
                bnl0.m105524M(this.f154926v, false);
                this.f154897W = false;
                this.f154899Y = false;
                this.f154911h0 = false;
                bnl0.m105524M(this.f154924t, false);
                m174505c0();
            }
        }
        CardIntlPictureViewOpt cardIntlPictureViewOpt3 = this.f154910h;
        if (cardIntlPictureViewOpt3 != null) {
            cardIntlPictureViewOpt3.m40007W(true);
            this.f154910h.m40012b0();
        }
        psd0.m173633z(this.f154893S);
        psd0.m173633z(this.f154894T);
    }

    /* JADX INFO: renamed from: G0 */
    public final void m174490G0(float f) {
        boolean z;
        View view = this.f154906f;
        if (this.f154891Q.renderFrom == CardInfoRenderFrom.CARD) {
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
                view = this.f154906f;
            }
        }
        view.setPivotX(view.getWidth() / 2.0f);
        view.setPivotY(view.getHeight() / 2.0f);
        gt0.m132168n(view, View.ROTATION_Y, 0.0f, f, 0.0f).setDuration(200L).start();
    }

    /* JADX INFO: renamed from: H0 */
    public final boolean m174491H0() {
        CardIntlPictureViewOpt cardIntlPictureViewOpt;
        User user = this.f154890P;
        return (user == null || user.isMe() || this.f154890P.isTeamAccount() || br5.m106045p(this.f154890P) || !this.f154905e0 || (cardIntlPictureViewOpt = this.f154910h) == null || cardIntlPictureViewOpt.m39990F()) ? false : true;
    }

    /* JADX INFO: renamed from: I0 */
    public final void m174492I0(CoreSuggested.UserInfo userInfo, User user, int i) {
        bnl0.m105524M(this.f154912i, true);
        m174523u0(user, userInfo);
        this.f154912i.setAlpha(1.0f);
        this.f154879E.m39303m(user, this.f154891Q, i, this.f154906f, this.f154880F);
        m174487D0(user);
        m174485B0(user, 0);
        m174525w0(userInfo, i);
        m174488E0(userInfo, user);
        m174524v0(user, this.f154891Q, i);
        m174528z0(userInfo);
        m174526x0(userInfo, user.profile.extensions, qa00.f156326m, this.f154910h.getCurrentItem() == 0);
        m174486C0(user);
    }

    /* JADX INFO: renamed from: J0 */
    public final void m174493J0() {
        this.f154912i.setAlpha(0.0f);
        this.f154906f.setShortCardStyle(true);
        bnl0.m105524M(this.f154879E, false);
        m174485B0(this.f154890P, 0);
        bnl0.m105524M(this.f154926v, false);
        bnl0.m105524M(this.f154884J, this.f154897W);
    }

    /* JADX INFO: renamed from: K0 */
    public final void m174494K0(String str) {
        if (str.equals(this.f154913i0)) {
            return;
        }
        i4g0.m138526x("e_special_card", "p_suggest_users_home_view");
        this.f154913i0 = str;
    }

    /* JADX INFO: renamed from: L0 */
    public final void m174495L0() {
        boolean z = this.f154911h0 && !this.f154905e0 && this.f154910h.getCurrentItem() == 0;
        bnl0.m105524M(this.f154924t, z);
        this.f154910h.setCertBtnShowing(z);
        this.f154879E.setHideCertIconForCardBtn(this.f154911h0);
    }

    /* JADX INFO: renamed from: M0 */
    public final void m174496M0() {
        if (this.f154914j == null || this.f154890P == null || this.f154910h == null) {
            return;
        }
        boolean zM174491H0 = m174491H0();
        bnl0.m105524M(this.f154914j, zM174491H0);
        if (!zM174491H0 || this.f154891Q == null) {
            return;
        }
        String strM131227a = gp5.m131227a("profile_photo_compliment_btn");
        if (TextUtils.isEmpty(strM131227a)) {
            return;
        }
        gp5.m131232f(m124281A(this.f154891Q), strM131227a);
    }

    /* JADX INFO: renamed from: N0 */
    public final void m174497N0(boolean z, boolean z2) {
        bnl0.m105524M(this.f154880F, z);
        bnl0.m105524M(this.f154879E.f23303d, z2);
    }

    /* JADX INFO: renamed from: V */
    public final void m174498V(View view) {
        qzk.m178807a(this, view);
    }

    /* JADX INFO: renamed from: W */
    public final void m174499W(boolean z, boolean z2) {
        this.f154879E.m39297g(z);
        boolean z3 = true;
        m174497N0(!z, (IntlCountryCodeController.m29125v() || z) ? false : true);
        if (z) {
            bnl0.m105537U(this.f154880F, 0);
            bnl0.m105537U(this.f154879E.f23303d, 0);
            if (m124283w() instanceof NewMainAct) {
                ((NewMainAct) m124283w()).m40810d6().m40989O();
            }
        } else {
            ExpandedCardInforLayout expandedCardInforLayout = this.f154879E;
            C8019b c8019b = expandedCardInforLayout.f23306g;
            if (c8019b != null) {
                expandedCardInforLayout.m39307q(c8019b.m38449v(), this.f154880F);
            }
        }
        this.f154910h.m40009Y();
        this.f154910h.m40020j0();
        this.f154910h.m39985A(!z);
        m174495L0();
        this.f154912i.setAlpha(z ? 0.0f : 1.0f);
        bnl0.m105524M(this.f154915k, !z);
        bnl0.m105524M(this.f154925u, !z);
        bnl0.m105524M(this.f154881G, !z);
        bnl0.m105524M(this.f154916l, !z);
        bnl0.m105524M(this.f154884J, z && this.f154897W);
        bnl0.m105524M(this.f154885K, z && this.f154907f0);
        bnl0.m105524M(this.f154919o, !z && this.f154907f0);
        m174496M0();
        if (z2 && !this.f154910h.m40004T() && z) {
            this.f154910h.m39988D();
        }
        if (z) {
            try {
                int i = (this.f154910h.getCurrentView() == null || !this.f154910h.getCurrentView().f28893I0.m222761e().booleanValue()) ? 1 : 0;
                boolean z4 = this.f154891Q.isUserLikeMe() || (CoreModule.f18276o.m132212b().mo34652wf() && this.f154891Q.hasLikeMeSlideCardTop);
                String str = z4 ? "upper_right" : "null";
                if (NullChecker.m82486a(this.f154879E.f23306g) && this.f154879E.f23306g.mo38443i()) {
                    str = "lower_left";
                    z4 = true;
                }
                CoreMomentInfo coreMomentInfoM174503a0 = m174503a0();
                sfj0.C20032a c20032aM185613f = sfj0.C20032a.m185613f("IsWhiteBlock", i);
                sfj0.C20032a c20032aM185616i = sfj0.C20032a.m185616i("moments_user_id", NullChecker.m82486a(this.f154890P.f56859id));
                sfj0.C20032a c20032aM185616i2 = sfj0.C20032a.m185616i("show_he_liked", z4);
                sfj0.C20032a c20032aM185615h = sfj0.C20032a.m185615h("show_he_liked_position", str);
                sfj0.C20032a c20032aM185616i3 = sfj0.C20032a.m185616i("is_first_picture", TextUtils.equals(b240.f74488V0, this.f154890P.f56859id) && this.f154910h.getCurrentItem() == 0);
                sfj0.C20032a c20032aM185615h2 = sfj0.C20032a.m185615h("swipe_scene", "default");
                if (!NullChecker.m82486a(this.f154891Q) || !this.f154891Q.isThemeCard) {
                    z3 = false;
                }
                sfj0.C20032a c20032aM185616i4 = sfj0.C20032a.m185616i("theme_card_ornot", z3);
                String str2 = "1";
                sfj0.C20032a c20032aM185615h3 = sfj0.C20032a.m185615h("is_moment_card", m174513k0() ? "1" : "0");
                sfj0.C20032a c20032aM185615h4 = sfj0.C20032a.m185615h("moment_id", coreMomentInfoM174503a0 != null ? coreMomentInfoM174503a0.f56856id : "0");
                if (!gra.m131740r1() || !NullChecker.m82486a(this.f154891Q) || !this.f154891Q.meetAgain) {
                    str2 = "0";
                }
                sfj0.m185596c(MatchScData.ModuleId.mid_e_card, "p_suggest_users_home_view", (sfj0.C20032a[]) jyb.m147507f0(c20032aM185613f, c20032aM185616i, c20032aM185616i2, c20032aM185615h, c20032aM185616i3, c20032aM185615h2, c20032aM185616i4, c20032aM185615h3, c20032aM185615h4, sfj0.C20032a.m185615h("is_show_longtimenosee_tag", str2)).toArray(new sfj0.C20032a[0]));
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: renamed from: X */
    public final void m174500X() {
        if (pzi0.m174454o() - this.f154895U < 320) {
            return;
        }
        this.f154895U = pzi0.m174454o();
        CardInfoRenderFrom cardInfoRenderFrom = this.f154891Q.renderFrom;
        CardInfoRenderFrom cardInfoRenderFrom2 = CardInfoRenderFrom.CARD;
        if (!(cardInfoRenderFrom != cardInfoRenderFrom2 ? cardInfoRenderFrom == cardInfoRenderFrom2 : true)) {
            if (cardInfoRenderFrom == CardInfoRenderFrom.PROFILE) {
                m124283w().onBackPressed();
            }
        } else if (!ExpandedCardStyleHelper.m39093o().m39106s()) {
            ExpandedCardStyleHelper.m39093o().m39101m(this.f154890P, this.f154891Q);
        } else {
            pza0.m174356h("hotspot");
            ExpandedCardStyleHelper.m39093o().m39099k(this.f154890P, this.f154891Q, "card click back");
        }
    }

    /* JADX INFO: renamed from: Y */
    public final String m174501Y(@Nullable UserLiveState userLiveState) {
        return CoreModule.m30934Q().mo68397Dr(NullChecker.m82486a(userLiveState) ? userLiveState.multiCallInfo.onGoingMultiCallRole : "");
    }

    /* JADX INFO: renamed from: Z */
    public final HashMap<String, Object> m174502Z(User user, UserLiveState userLiveState, String str) {
        HashMap<String, Object> map = new HashMap<>();
        boolean z = (userLiveState == null || TextUtils.isEmpty(userLiveState.multiCallInfo.onGoingMultiCallId)) ? false : true;
        map.put("liveId", CoreModule.m30934Q().getUserLiveId(user.f56859id));
        map.put("anchorId", user.f56859id);
        map.put(FirebaseAnalytics.Param.INDEX, "NA");
        map.put("module", "e_profile_album");
        map.put("trace_id", "");
        map.put("live_status", (userLiveState == null || !userLiveState.isLiveOpened()) ? BLiveOperationTitleShowType.off : "on");
        map.put("right_recommend_type", "");
        if (!z) {
            userLiveState = null;
        }
        map.put("live_room_live_type", m174501Y(userLiveState));
        map.put("show_label", z ? "连线" : "");
        map.put("refer_pid", "home_card".equals(str) ? "home_card" : "");
        map.put("liveRecommendCategory", "NA");
        if (CoreModule.f18264c.f20405m0.m32023L6(user.f56859id) && "home_card".equals(str)) {
            map.put("live_enter_source", "suggest_live_card_profile");
            return map;
        }
        map.put("live_enter_source", "NA");
        return map;
    }

    /* JADX INFO: renamed from: a0 */
    public CoreMomentInfo m174503a0() {
        CoreSuggested.UserInfo userInfo;
        CoreMomentInfo coreMomentInfo;
        if ((!gra.m131578I0().enabled && !nh00.m163018b().m163022f()) || (userInfo = this.f154891Q) == null || (coreMomentInfo = userInfo.coreMomentInfo) == null) {
            return null;
        }
        return coreMomentInfo;
    }

    @Override // p153l.aof
    /* JADX INFO: renamed from: b */
    public C22507a<Boolean> mo99070b() {
        if (this.f154910h.getCurrentView() != null) {
            return this.f154910h.getCurrentView().f28893I0;
        }
        return null;
    }

    /* JADX INFO: renamed from: b0 */
    public final void m174504b0(User user) {
        User userM116600p9 = CoreModule.f18264c.f20381e0.m116600p9();
        i4g0.m138520r("e_clone_card_avatar_verified_tag", "p_suggest_users_home_view");
        if (userM116600p9 == null || !userM116600p9.isPicVerificationVerified()) {
            m124283w().startActivity(VerificationCenterAct.m57175Z1(m124283w(), false, "card_verify_popup"));
        } else {
            new ak4(m124283w(), user).show();
        }
    }

    @Override // p153l.aof
    /* JADX INFO: renamed from: c */
    public C22507a<Boolean> mo99071c() {
        if (this.f154910h.getCurrentView() != null) {
            return this.f154910h.getCurrentView().f28895J0;
        }
        return null;
    }

    /* JADX INFO: renamed from: c0 */
    public final void m174505c0() {
        this.f154896V = false;
        bnl0.m105524M(this.f154928x, false);
    }

    @Override // p153l.aof
    /* JADX INFO: renamed from: d */
    public Media mo99072d() {
        if (this.f154910h.getCurrentView() != null) {
            return this.f154910h.getCurrentView().f28888G;
        }
        return null;
    }

    /* JADX INFO: renamed from: d0 */
    public final void m174506d0(CoreSuggested.UserInfo userInfo, final User user) {
        CardIntlPictureViewOpt cardIntlPictureViewOpt;
        VPager_SquaredRefactor vPager_SquaredRefactor;
        if (this.f154914j == null || (cardIntlPictureViewOpt = this.f154910h) == null || (vPager_SquaredRefactor = cardIntlPictureViewOpt.f24366b) == null) {
            return;
        }
        vPager_SquaredRefactor.m4187d(new C19473c());
        m174496M0();
        final boolean z = userInfo.renderFrom == CardInfoRenderFrom.PROFILE;
        bnl0.m105509E0(this.f154914j, new View.OnClickListener() { // from class: l.jzk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f123267a.m174515m0(user, z, view);
            }
        });
    }

    /* JADX INFO: renamed from: e0 */
    public final void m174507e0(CoreSuggested.UserInfo userInfo, final User user, int i) {
        aoh0 aoh0Var = new aoh0(userInfo, user);
        this.f154892R = aoh0Var;
        m174510h0(aoh0Var);
        CardInfoRenderFrom cardInfoRenderFrom = userInfo.renderFrom;
        CardInfoRenderFrom cardInfoRenderFrom2 = CardInfoRenderFrom.CARD;
        if (cardInfoRenderFrom == cardInfoRenderFrom2) {
            boolean z = (ExpandedCardStyleHelper.m39093o().m39106s() && i == 0) ? false : true;
            m174497N0(z, !IntlCountryCodeController.m29125v() && z);
            if (i == 0 && userInfo.renderFrom == cardInfoRenderFrom2) {
                psd0.m173633z(this.f154893S);
                this.f154893S = m116950k(m124283w(), ExpandedCardStyleHelper.m39093o().m39112y()).filter(new qcj() { // from class: l.kzk
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return pzk.m174469G(user, (ExpandedCardStyleHelper.C8102b) obj);
                    }
                }).subscribe(psd0.m173596G(new y20() { // from class: l.lzk
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        this.f134234a.m174517o0((ExpandedCardStyleHelper.C8102b) obj);
                    }
                }));
                psd0.m173633z(this.f154894T);
                this.f154894T = m116950k(m124283w(), NavigationBarAdmobHelper.INSTANCE.m37154l()).subscribe(psd0.m173596G(new y20() { // from class: l.mzk
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        this.f139530a.m174518p0((Integer) obj);
                    }
                }));
            }
        }
    }

    /* JADX INFO: renamed from: f0 */
    public final void m174508f0(Extensions extensions, int i, boolean z) {
        try {
            LikeMindedItemStatusData likeMindedItemStatusDataM187298l = sp0.INSTANCE.m187298l(extensions);
            if (likeMindedItemStatusDataM187298l != null) {
                if (NullChecker.m82486a(this.f154901a0)) {
                    bnl0.m105524M(this.f154901a0, z);
                } else {
                    this.f154901a0 = (AnimalFacialCardView) this.f154877C.inflate();
                }
                bnl0.m105537U(this.f154901a0, i);
                this.f154901a0.m45506b(likeMindedItemStatusDataM187298l);
            }
        } catch (Exception unused) {
        }
    }

    @Override // p153l.dmf
    @SuppressLint({"ResourceType"})
    /* JADX INFO: renamed from: g */
    public void mo39156g(View view) {
        super.mo39156g(view);
        m174498V(view);
        bnl0.m105509E0(this.f154880F, new View.OnClickListener() { // from class: l.ezk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f96605a.m174514l0(view2);
            }
        });
    }

    /* JADX INFO: renamed from: g0 */
    public final void m174509g0(CoreSuggested.UserInfo userInfo, boolean z, boolean z2) {
        try {
            if (NullChecker.m82486a(this.f154898X)) {
                bnl0.m105524M(this.f154898X, z);
            } else {
                this.f154898X = (VDraweeView) this.f154922r.inflate();
            }
            String str = z2 ? userInfo.samesCardData.tag_url : userInfo.samesCardData.icon_url;
            if (this.f154898X.getTag() != str) {
                this.f154898X.setTag(str);
                uqb0.f180374G.m127121O0(this.f154898X, str, true, false, null, null);
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: h0 */
    public final void m174510h0(aoh0 aoh0Var) {
        this.f154910h.m40011a0(aoh0Var, this.f154890P, new C19472b());
    }

    /* JADX INFO: renamed from: i0 */
    public final void m174511i0() {
        bnl0.m105524M(this.f154876B, this.f154899Y && this.f154910h.getCurrentItem() == 0);
        if (NullChecker.m82486a(this.f154898X)) {
            bnl0.m105524M(this.f154898X, this.f154910h.getCurrentItem() == 0);
        }
        if (NullChecker.m82486a(this.f154900Z)) {
            bnl0.m105524M(this.f154900Z, this.f154910h.getCurrentItem() == 0);
        }
        if (NullChecker.m82486a(this.f154901a0)) {
            bnl0.m105524M(this.f154901a0, this.f154910h.getCurrentItem() == 0);
        }
    }

    @Override // p153l.dmf
    /* JADX INFO: renamed from: j */
    public boolean mo116949j(View view) {
        return view instanceof CardHeadLayoutV2;
    }

    /* JADX INFO: renamed from: j0 */
    public boolean m174512j0() {
        return NullChecker.m82486a(this.f154904d0) && bnl0.m105529O0(this.f154904d0) && bnl0.m105529O0(this.f154881G);
    }

    /* JADX INFO: renamed from: k0 */
    public final boolean m174513k0() {
        CoreSuggested.UserInfo userInfo = this.f154891Q;
        return (userInfo == null || userInfo.coreMomentInfo == null) ? false : true;
    }

    /* JADX INFO: renamed from: l0 */
    public final /* synthetic */ void m174514l0(View view) {
        User user = this.f154890P;
        if (user == null || !TextUtils.equals(user.f56859id, CoreModule.f18264c.f20405m0.m32140q6())) {
            return;
        }
        this.f154910h.m40024z();
    }

    /* JADX INFO: renamed from: m0 */
    public final /* synthetic */ void m174515m0(User user, final boolean z, View view) {
        if (user == null || np5.m164215b(m124283w(), this.f154891Q, user, "profile_photo_compliment_btn")) {
            return;
        }
        fp5.m126532n(m124283w(), user, "profile_photo_compliment_btn", Integer.valueOf(this.f154910h.getCurrentPosition()), null, new Function1() { // from class: l.ozk
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return this.f149932a.m174516n0(z, (User) obj);
            }
        }, this.f154891Q.liveRoomInfo);
    }

    /* JADX INFO: renamed from: n0 */
    public final /* synthetic */ Unit m174516n0(boolean z, User user) {
        fp5.m126527i().invoke(user);
        if (z && (m124283w() instanceof ProfileAct)) {
            PutongFrag putongFragM51931D2 = ((ProfileAct) m124283w()).m51931D2();
            if (putongFragM51931D2 instanceof ProfileListFragExpandedImpl) {
                ((ProfileListFragExpandedImpl) putongFragM51931D2).m53596V4().m129190n1(SwipeDirection.REMOVE.getValue());
            } else {
                m124283w().m68056e2();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ void m174517o0(ExpandedCardStyleHelper.C8102b c8102b) {
        boolean zM39118e = c8102b.m39118e();
        this.f154905e0 = zM39118e;
        m174499W(zM39118e, true);
    }

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ void m174518p0(Integer num) {
        this.f154906f.m39960P();
        this.f154910h.post(new RunnableC19471a());
    }

    @Override // p153l.dmf
    /* JADX INFO: renamed from: q */
    public void mo39157q(boolean z) {
        CardIntlPictureViewOpt cardIntlPictureViewOpt;
        if (z || (cardIntlPictureViewOpt = this.f154910h) == null) {
            return;
        }
        cardIntlPictureViewOpt.m40007W(false);
    }

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ void m174519q0(User user, View view) {
        m174504b0(user);
    }

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ void m174520r0(boolean z, CoreSuggested.UserInfo userInfo, View view) {
        nbw nbwVar = nbw.INSTANCE;
        nbwVar.m162219N(z, "click");
        haw.INSTANCE.m134320a().m134280W(m124283w(), userInfo.intlInsertCardData.buzzUser.buzzToken, userInfo.f20214id, nbwVar.m162266x(), new Function0() { // from class: l.fzk
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return pzk.m174472J();
            }
        }, null, null, true);
    }

    @Override // p153l.dmf
    /* JADX INFO: renamed from: s */
    public void mo115468s() {
        super.mo115468s();
        m174489F0();
    }

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ void m174521s0(User user, String str, String str2, UserLiveState userLiveState, View view) {
        if (user.isMe()) {
            CoreModule.m30934Q().mo68400F8(m124283w(), false, true, null);
        } else {
            CoreModule.m30934Q().startAudienceLive(m124283w(), CoreModule.m30934Q().getUserLiveId(str), "profile", null);
        }
        if (CoreModule.f18264c.f20405m0.m32023L6(str) && TextUtils.equals("home_card", str2)) {
            tvn.m192813a(OMSDialogPositon.p_suggest_user_profile_info_view, user);
        } else {
            i4g0.m138521s("e_live_room_enter", OMSDialogPositon.p_suggest_user_profile_info_view, m174502Z(user, userLiveState, str2));
        }
    }

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ void m174522t0(User user, UserLiveState userLiveState, String str, View view) {
        if (CoreModule.f18264c.f20405m0.m32023L6(user.f56859id)) {
            return;
        }
        CoreModule.m30934Q().startAudienceLive(m124283w(), CoreModule.m30934Q().getUserLiveId(user.f56859id), "suggest-card", null);
        i4g0.m138521s("e_live_room_enter", "p_suggest_users_home_view", m174502Z(user, userLiveState, str));
    }

    /* JADX INFO: renamed from: u0 */
    public final void m174523u0(final User user, CoreSuggested.UserInfo userInfo) {
        this.f154911h0 = !user.isMe() && user.isPicVerificationVerified();
        m174495L0();
        if (this.f154911h0) {
            i4g0.m138526x("e_clone_card_avatar_verified_tag", "p_suggest_users_home_view");
            bnl0.m105509E0(this.f154924t, new View.OnClickListener() { // from class: l.izk
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f117717a.m174519q0(user, view);
                }
            });
        }
    }

    @Override // p153l.dmf
    /* JADX INFO: renamed from: v */
    public void mo116958v() {
        super.mo116958v();
        CardIntlPictureViewOpt cardIntlPictureViewOpt = this.f154910h;
        if (cardIntlPictureViewOpt != null) {
            cardIntlPictureViewOpt.m40007W(false);
        }
    }

    /* JADX INFO: renamed from: v0 */
    public void m174524v0(User user, CoreSuggested.UserInfo userInfo, int i) {
        boolean zM175976n = qap.INSTANCE.m175976n(userInfo, user);
        IntlCommercialCardBottomActionLayout intlCommercialCardBottomActionLayout = this.f154904d0;
        if (!zM175976n) {
            if (intlCommercialCardBottomActionLayout != null) {
                bnl0.m105524M(intlCommercialCardBottomActionLayout, false);
                return;
            }
            return;
        }
        if (intlCommercialCardBottomActionLayout == null) {
            this.f154904d0 = (IntlCommercialCardBottomActionLayout) this.f154883I.inflate();
        }
        boolean zM29125v = IntlCountryCodeController.m29125v();
        IntlCommercialCardBottomActionLayout intlCommercialCardBottomActionLayout2 = this.f154904d0;
        if (zM29125v) {
            bnl0.m105539W(intlCommercialCardBottomActionLayout2, qa00.m175859d(80.0f));
            bnl0.m105537U(this.f154904d0, qa00.m175859d(20.0f));
            this.f154879E.m39298h(qa00.m175859d(90.0f));
        } else {
            bnl0.m105539W(intlCommercialCardBottomActionLayout2, 0);
            bnl0.m105537U(this.f154904d0, qa00.m175859d(20.0f));
            this.f154879E.m39298h(qa00.m175859d(90.0f));
        }
        bnl0.m105524M(this.f154904d0, true);
        this.f154904d0.m40187Y(m124283w(), user, userInfo, i);
        if (i == 0) {
            if (IntlCountryCodeController.m29125v()) {
                CoreModule.f18264c.f20405m0.f20174m2.onNext(uxj0.f181467a);
            } else {
                CoreModule.f18264c.f20405m0.f20171l2.onNext("renderCommercialCardBottomActionLayout");
            }
        }
    }

    /* JADX INFO: renamed from: w0 */
    public final void m174525w0(final CoreSuggested.UserInfo userInfo, int i) {
        if (d79.m114675e0() && NullChecker.m82486a(userInfo.intlInsertCardData) && NullChecker.m82486a(userInfo.intlInsertCardData.buzzUser)) {
            IntlInsertCardData intlInsertCardData = userInfo.intlInsertCardData;
            if (intlInsertCardData.cardType == 10 && intlInsertCardData.showType == 1) {
                final boolean z = intlInsertCardData.buzzUser.isBlur;
                if (i == 0) {
                    CoreModule.f18264c.f20405m0.f20089J0.onNext(Boolean.TRUE);
                    nbw.INSTANCE.m162220O(z);
                }
                if (z) {
                    m174497N0(false, false);
                }
                if (NullChecker.m82486a(this.f154903c0)) {
                    bnl0.m105524M(this.f154903c0, i == 0);
                }
                if (NullChecker.m82486a(this.f154902b0) && bnl0.m105529O0(this.f154902b0)) {
                    return;
                }
                if (this.f154902b0 == null) {
                    this.f154902b0 = (VImage) this.f154923s.inflate();
                }
                if (this.f154903c0 == null) {
                    this.f154903c0 = (VText) this.f154882H.inflate();
                }
                bnl0.m105524M(this.f154902b0, true);
                bnl0.m105524M(this.f154903c0, i == 0);
                this.f154879E.m39298h(qa00.m175859d(84.0f));
                this.f154902b0.setBackgroundResource(dbc0.f87112j9);
                bnl0.m105509E0(this.f154903c0, new View.OnClickListener() { // from class: l.nzk
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f144449a.m174520r0(z, userInfo, view);
                    }
                });
                return;
            }
        }
        if (NullChecker.m82486a(this.f154902b0)) {
            bnl0.m105524M(this.f154902b0, false);
        }
        if (NullChecker.m82486a(this.f154903c0)) {
            bnl0.m105524M(this.f154903c0, false);
        }
    }

    /* JADX INFO: renamed from: x0 */
    public final void m174526x0(CoreSuggested.UserInfo userInfo, Extensions extensions, int i, boolean z) {
        LikeMindedItemStatusData likeMindedItemStatusDataM144706d;
        SamesCardData samesCardData = userInfo.samesCardData;
        if (samesCardData == null) {
            if (C8016a.INSTANCE.m37992b() && sp0.INSTANCE.m187296j(extensions) && !this.f154897W && !this.f154896V) {
                m174508f0(extensions, i, z);
                return;
            }
            bnl0.m105524M(this.f154876B, false);
            if (NullChecker.m82486a(this.f154898X)) {
                bnl0.m105524M(this.f154898X, false);
            }
            this.f154899Y = false;
            if (NullChecker.m82486a(this.f154900Z)) {
                bnl0.m105524M(this.f154900Z, false);
            }
            if (NullChecker.m82486a(this.f154901a0)) {
                bnl0.m105524M(this.f154901a0, false);
                return;
            }
            return;
        }
        String str = samesCardData.type;
        C8016a.Companion aVar = C8016a.INSTANCE;
        if (aVar.m37998h()) {
            bnl0.m105524M(this.f154876B, false);
            this.f154899Y = false;
            if (IntlMarketToken.quiz.equals(str)) {
                m174509g0(userInfo, z, false);
                return;
            }
            if ((IntlMarketToken.regular.equals(str) || IntlMarketToken.flash.equals(str)) && !this.f154896V) {
                if (NullChecker.m82486a(this.f154900Z)) {
                    bnl0.m105524M(this.f154900Z, z);
                } else {
                    this.f154900Z = (RegularStickerCardTabView) this.f154875A.inflate();
                }
                bnl0.m105537U(this.f154900Z, i);
                Object tag = this.f154900Z.getTag();
                String str2 = userInfo.samesCardData.f21239id;
                if (tag != str2) {
                    this.f154900Z.setTag(str2);
                    this.f154900Z.m47527b(userInfo.samesCardData);
                    return;
                }
                return;
            }
            return;
        }
        if (aVar.m37993c()) {
            m174509g0(userInfo, z, true);
            return;
        }
        if (!aVar.m37997g() || this.f154896V) {
            if (this.f154896V || (likeMindedItemStatusDataM144706d = jfr.INSTANCE.m144706d(str)) == null) {
                return;
            }
            bnl0.m105537U(this.f154876B, i);
            this.f154876B.m48061b(likeMindedItemStatusDataM144706d);
            bnl0.m105524M(this.f154876B, z);
            this.f154899Y = true;
            return;
        }
        xnf0 xnf0Var = xnf0.INSTANCE;
        SimilarInterestsItemSwipeData similarInterestsItemSwipeDataM212193k = xnf0Var.m212193k(str);
        if (similarInterestsItemSwipeDataM212193k != null) {
            bnl0.m105537U(this.f154876B, i);
            this.f154876B.m48062c(similarInterestsItemSwipeDataM212193k, xnf0Var.m212187e());
            bnl0.m105524M(this.f154876B, z);
            this.f154899Y = true;
        }
    }

    @Override // p153l.f6l
    /* JADX INFO: renamed from: y */
    public void mo124285y() {
        super.mo124285y();
    }

    /* JADX INFO: renamed from: y0 */
    public final void m174527y0(CoreSuggested.UserInfo userInfo, User user, int i) {
        aoh0 aoh0Var;
        this.f154891Q = userInfo;
        if (this.f154910h == null || (aoh0Var = this.f154892R) == null || aoh0Var.m99080a() == null || this.f154892R.m99080a().isEmpty()) {
            return;
        }
        this.f154910h.setAutoPlayEnabled(true);
        this.f154910h.m40010Z(user, userInfo, this.f154892R, i, this.f97411e);
    }

    @Override // p153l.f6l
    /* JADX INFO: renamed from: z */
    public void mo124286z(float f) {
        super.mo124286z(f);
        this.f154906f.setCardStyleChangeProgress(f);
        this.f154912i.setAlpha(1.0f - f);
        this.f154910h.setCardStyleChangeProgress(f);
    }

    /* JADX INFO: renamed from: z0 */
    public void m174528z0(CoreSuggested.UserInfo userInfo) {
        int i;
        if (this.f154896V) {
            bnl0.m105524M(this.f154930z, false);
            return;
        }
        if (!userInfo.f20214id.equals(C4880a0.m32390j().f20267d.get())) {
            bnl0.m105524M(this.f154930z, false);
            return;
        }
        String language = Locale.getDefault().getLanguage();
        if ("in".equals(language) || "id".equals(language)) {
            i = dbc0.f86651V2;
        } else if ("ja".equals(language)) {
            i = dbc0.f86715X2;
        } else if ("ko".equals(language)) {
            i = dbc0.f86747Y2;
        } else {
            i = "th".equals(language) ? dbc0.f86779Z2 : dbc0.f86683W2;
        }
        m174494K0(userInfo.f20214id);
        this.f154930z.setImageResource(i);
        bnl0.m105524M(this.f154930z, true);
    }

    /* JADX INFO: renamed from: l.pzk$c */
    public class C19473c implements ViewPager.InterfaceC0718j {
        public C19473c() {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0718j
        public void onPageSelected(int i) {
            pzk.this.m174496M0();
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0718j
        public void onPageScrollStateChanged(int i) {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0718j
        public void onPageScrolled(int i, float f, int i2) {
        }
    }

    /* JADX INFO: renamed from: l.pzk$b */
    public class C19472b implements ExpandedImageSwitchView.InterfaceC8118b {
        public C19472b() {
        }

        @Override // com.p051p1.mobile.putong.core.newui.home.card.expanded.view.ExpandedImageSwitchView.InterfaceC8118b
        /* JADX INFO: renamed from: b */
        public void mo39337b() {
            pzk.this.m174500X();
        }

        @Override // com.p051p1.mobile.putong.core.newui.home.card.expanded.view.ExpandedImageSwitchView.InterfaceC8118b
        /* JADX INFO: renamed from: c */
        public void mo39338c(boolean z) {
            pzk.this.m174490G0(z ? 1.5f : -1.5f);
        }

        @Override // com.p051p1.mobile.putong.core.newui.home.card.expanded.view.ExpandedImageSwitchView.InterfaceC8118b
        /* JADX INFO: renamed from: d */
        public void mo39339d(int i, Media media, boolean z) {
            pzk.this.f154879E.m39305o(i, true);
            pzk pzkVar = pzk.this;
            bnl0.m105524M(pzkVar.f154928x, pzkVar.f154896V);
            pzk.this.m174511i0();
            pzk.this.m174495L0();
        }

        @Override // com.p051p1.mobile.putong.core.newui.home.card.expanded.view.ExpandedImageSwitchView.InterfaceC8118b
        /* JADX INFO: renamed from: e */
        public boolean mo39340e(Media media) {
            try {
                return CoreModule.f18264c.f20405m0.f20150e2.m35222x3(pzk.this.f154891Q);
            } catch (Exception unused) {
            }
        }

        @Override // com.p051p1.mobile.putong.core.newui.home.card.expanded.view.ExpandedImageSwitchView.InterfaceC8118b
        /* JADX INFO: renamed from: f */
        public void mo39341f(int i, boolean z) {
        }
    }
}
