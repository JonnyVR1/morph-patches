package p153l;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core_api.api.serviceprovider.api.CoreService;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.R$string;
import com.p051p1.mobile.putong.feed.data.Moment;
import com.p051p1.mobile.putong.feed.newui.photoalbum.PhotoAlbumBottomView;
import com.p051p1.mobile.putong.feed.newui.photoalbum.feed.personfeedinprofile.FeedInsertCommentView;
import com.p051p1.mobile.putong.feed.newui.view.FeedAutoScrollTextView;
import com.p051p1.mobile.putong.feed.newui.view.FeedUserHeaderView;
import com.tantan.library.svga.SVGAnimationView;
import com.tantanapp.common.utils.NullChecker;
import p151v.VDraweeView;
import p151v.VFrame;
import p151v.VImage;
import p151v.VLinear;
import p151v.VRelative;
import p151v.VText;

/* JADX INFO: loaded from: classes13.dex */
public class f770 extends AbstractC20228t4 {

    /* JADX INFO: renamed from: A */
    public VDraweeView f97490A;

    /* JADX INFO: renamed from: B */
    public FeedAutoScrollTextView f97491B;

    /* JADX INFO: renamed from: C */
    public SVGAnimationView f97492C;

    /* JADX INFO: renamed from: D */
    public VLinear f97493D;

    /* JADX INFO: renamed from: E */
    public VImage f97494E;

    /* JADX INFO: renamed from: F */
    public TextView f97495F;

    /* JADX INFO: renamed from: G */
    public VLinear f97496G;

    /* JADX INFO: renamed from: H */
    public VImage f97497H;

    /* JADX INFO: renamed from: I */
    public TextView f97498I;

    /* JADX INFO: renamed from: J */
    public VText f97499J;

    /* JADX INFO: renamed from: K */
    public VText f97500K;

    /* JADX INFO: renamed from: L */
    public ImageView f97501L;

    /* JADX INFO: renamed from: M */
    public VText f97502M;

    /* JADX INFO: renamed from: N */
    public ConstraintLayout f97503N;

    /* JADX INFO: renamed from: O */
    public VDraweeView f97504O;

    /* JADX INFO: renamed from: P */
    public VText f97505P;

    /* JADX INFO: renamed from: Q */
    public VImage f97506Q;

    /* JADX INFO: renamed from: R */
    public VText f97507R;

    /* JADX INFO: renamed from: S */
    public VLinear f97508S;

    /* JADX INFO: renamed from: T */
    public VText f97509T;

    /* JADX INFO: renamed from: U */
    public VDraweeView f97510U;

    /* JADX INFO: renamed from: V */
    public ImageView f97511V;

    /* JADX INFO: renamed from: W */
    public View f97512W;

    /* JADX INFO: renamed from: X */
    public FeedInsertCommentView f97513X;

    /* JADX INFO: renamed from: a */
    public PhotoAlbumBottomView f97514a;

    /* JADX INFO: renamed from: b */
    public VLinear f97515b;

    /* JADX INFO: renamed from: c */
    public ConstraintLayout f97516c;

    /* JADX INFO: renamed from: d */
    public VDraweeView f97517d;

    /* JADX INFO: renamed from: e */
    public VText f97518e;

    /* JADX INFO: renamed from: f */
    public VText f97519f;

    /* JADX INFO: renamed from: g */
    public LinearLayout f97520g;

    /* JADX INFO: renamed from: h */
    public VLinear f97521h;

    /* JADX INFO: renamed from: i */
    public VText f97522i;

    /* JADX INFO: renamed from: j */
    public VText f97523j;

    /* JADX INFO: renamed from: k */
    public VText f97524k;

    /* JADX INFO: renamed from: l */
    public VText f97525l;

    /* JADX INFO: renamed from: m */
    public VText f97526m;

    /* JADX INFO: renamed from: n */
    public VText f97527n;

    /* JADX INFO: renamed from: o */
    public VLinear f97528o;

    /* JADX INFO: renamed from: p */
    public FeedUserHeaderView f97529p;

    /* JADX INFO: renamed from: q */
    public VText f97530q;

    /* JADX INFO: renamed from: r */
    public VImage f97531r;

    /* JADX INFO: renamed from: s */
    public VText f97532s;

    /* JADX INFO: renamed from: t */
    public RelativeLayout f97533t;

    /* JADX INFO: renamed from: u */
    public VText f97534u;

    /* JADX INFO: renamed from: v */
    public ImageView f97535v;

    /* JADX INFO: renamed from: w */
    public RelativeLayout f97536w;

    /* JADX INFO: renamed from: x */
    public VRelative f97537x;

    /* JADX INFO: renamed from: y */
    public VFrame f97538y;

    /* JADX INFO: renamed from: z */
    public VImage f97539z;

    /* JADX INFO: renamed from: Q */
    public static /* synthetic */ void m124374Q(PhotoAlbumBottomView photoAlbumBottomView, View view) {
        i4g0.m138523u("e_profile_moment_chat_input", OMSDialogPositon.p_suggest_user_profile_info_view, pf60.m172085a("moment_id", photoAlbumBottomView.f41942K.f56859id), pf60.m172085a("moment_type", er60.m122104w().m122135y(photoAlbumBottomView.f41942K)));
        Act act = photoAlbumBottomView.act();
        CoreService coreServiceM61406H = FeedModule.m61406H();
        Act act2 = photoAlbumBottomView.act();
        Moment moment = photoAlbumBottomView.f41942K;
        act.startActivity(coreServiceM61406H.mo31787k9(act2, moment.f56859id, moment.owner, "from_moment"));
        photoAlbumBottomView.act().overridePendingTransition(0, 0);
    }

    /* JADX INFO: renamed from: R */
    public static /* synthetic */ void m124375R(PhotoAlbumBottomView photoAlbumBottomView, Moment moment, String str, View view) {
        photoAlbumBottomView.m64582C1(moment.live, photoAlbumBottomView.act(), orb0.m168896m(moment.live, str));
        dug.m118142h(photoAlbumBottomView.act(), str, moment, photoAlbumBottomView.f41954U, photoAlbumBottomView.f41951R, photoAlbumBottomView.f41953T);
    }

    @Override // p153l.AbstractC20228t4
    /* JADX INFO: renamed from: A */
    public VImage mo124377A() {
        return this.f97539z;
    }

    @Override // p153l.AbstractC20228t4
    /* JADX INFO: renamed from: B */
    public VText mo124378B() {
        return this.f97526m;
    }

    @Override // p153l.AbstractC20228t4
    /* JADX INFO: renamed from: C */
    public VText mo124379C() {
        return this.f97527n;
    }

    @Override // p153l.AbstractC20228t4
    /* JADX INFO: renamed from: D */
    public VText mo124380D() {
        return this.f97502M;
    }

    @Override // p153l.AbstractC20228t4
    /* JADX INFO: renamed from: E */
    public VLinear mo124381E() {
        return this.f97508S;
    }

    @Override // p153l.AbstractC20228t4
    /* JADX INFO: renamed from: F */
    public ImageView mo124382F() {
        return this.f97501L;
    }

    @Override // p153l.AbstractC20228t4
    /* JADX INFO: renamed from: G */
    public VText mo124383G() {
        return this.f97523j;
    }

    @Override // p153l.AbstractC20228t4
    /* JADX INFO: renamed from: H */
    public VText mo124384H() {
        return this.f97522i;
    }

    @Override // p153l.AbstractC20228t4
    /* JADX INFO: renamed from: I */
    public VLinear mo124385I() {
        return this.f97521h;
    }

    @Override // p153l.AbstractC20228t4
    /* JADX INFO: renamed from: J */
    public VText mo124386J() {
        return this.f97524k;
    }

    @Override // p153l.AbstractC20228t4
    /* JADX INFO: renamed from: K */
    public VImage mo124387K() {
        return this.f97531r;
    }

    @Override // p153l.AbstractC20228t4
    /* JADX INFO: renamed from: L */
    public VText mo124388L() {
        return this.f97530q;
    }

    @Override // p153l.AbstractC20228t4
    /* JADX INFO: renamed from: M */
    public VLinear mo124389M() {
        return this.f97528o;
    }

    /* JADX INFO: renamed from: T */
    public final void m124391T(View view) {
        g770.m129307a(this, view);
    }

    /* JADX INFO: renamed from: U */
    public void m124392U(View view, boolean z) {
        if (NullChecker.m82486a(view)) {
            bnl0.m105524M(view, z);
        }
    }

    /* JADX INFO: renamed from: V */
    public final void m124393V() {
        this.f97515b.setPadding(qa00.m175859d(40.0f), qa00.m175859d(10.0f), qa00.m175859d(2.0f), 0);
        bnl0.m105540X(this.f97522i, 0);
        bnl0.m105537U((RelativeLayout) this.f97515b.getParent(), 0);
    }

    /* JADX INFO: renamed from: W */
    public void m124394W(final PhotoAlbumBottomView photoAlbumBottomView) {
        User userM145688e8 = FeedModule.f39703d.m145688e8(photoAlbumBottomView.f41942K.owner);
        if ("from_profile_album".equals(photoAlbumBottomView.f41949P)) {
            Moment moment = photoAlbumBottomView.f41942K;
            if (!moment.isLive && !moment.isVoiceLive && !ksg.m151187V(moment) && !FeedModule.m61406H().me_().f56859id.equals(userM145688e8) && ksg.m151186U(FeedModule.m61406H().mo31744Zj(photoAlbumBottomView.f41942K.owner))) {
                if (this.f97513X == null) {
                    FeedInsertCommentView feedInsertCommentView = new FeedInsertCommentView((Context) photoAlbumBottomView.act(), false);
                    this.f97513X = feedInsertCommentView;
                    uqb0.f180374G.m127115L0(feedInsertCommentView.f42565a, FeedModule.m61406H().me_().m61308fp().url);
                    this.f97515b.addView(this.f97513X);
                    VText vText = this.f97513X.f42566b;
                    StringBuilder sb = new StringBuilder(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
                    sb.append(FeedModule.f39700a.getResources().getString(R$string.f39863Z3, MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + userM145688e8.name));
                    vText.setHint(sb.toString());
                    bnl0.m105509E0(this.f97513X.f42566b, new View.OnClickListener() { // from class: l.a770
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            f770.m124374Q(photoAlbumBottomView, view);
                        }
                    });
                    bnl0.m105539W(this.f97513X, qa00.m175859d(16.0f));
                    bnl0.m105538V(this.f97513X, qa00.m175859d(12.0f));
                    bnl0.m105537U(this.f97513X, qa00.m175859d(21.0f));
                    bnl0.m105505C0(this.f97513X, qa00.m175859d(46.0f));
                    photoAlbumBottomView.f41948O.put(photoAlbumBottomView.f41942K.f56859id, Boolean.TRUE);
                    bnl0.m105509E0(this.f97513X.f42568d, new View.OnClickListener() { // from class: l.b770
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            this.f75259a.m124395X(photoAlbumBottomView, view);
                        }
                    });
                    bnl0.m105509E0(this.f97513X.f42569e, new View.OnClickListener() { // from class: l.c770
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            this.f80091a.m124396Y(photoAlbumBottomView, view);
                        }
                    });
                    bnl0.m105509E0(this.f97513X.f42570f, new View.OnClickListener() { // from class: l.d770
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            this.f85462a.m124397Z(photoAlbumBottomView, view);
                        }
                    });
                }
                i4g0.m138492A("e_profile_moment_chat_input", OMSDialogPositon.p_suggest_user_profile_info_view, pf60.m172085a("moment_id", photoAlbumBottomView.f41942K.f56859id), pf60.m172085a("moment_type", er60.m122104w().m122135y(photoAlbumBottomView.f41942K)));
                return;
            }
        }
        if (photoAlbumBottomView.f41948O.containsKey(photoAlbumBottomView.f41942K.f56859id) && photoAlbumBottomView.f41948O.get(photoAlbumBottomView.f41942K.f56859id).booleanValue()) {
            return;
        }
        this.f97515b.removeView(this.f97513X);
        photoAlbumBottomView.f41948O.put(photoAlbumBottomView.f41942K.f56859id, Boolean.FALSE);
    }

    /* JADX INFO: renamed from: X */
    public final /* synthetic */ void m124395X(PhotoAlbumBottomView photoAlbumBottomView, View view) {
        i4g0.m138523u("e_profile_moment_chat_send", OMSDialogPositon.p_suggest_user_profile_info_view, pf60.m172085a("moment_id", photoAlbumBottomView.f41942K.f56859id), pf60.m172085a("moment_chat_send_from", "profile_emoji"), pf60.m172085a("moment_type", er60.m122104w().m122135y(photoAlbumBottomView.f41942K)));
        CoreService coreServiceM61406H = FeedModule.m61406H();
        Act act = photoAlbumBottomView.act();
        String string = this.f97513X.f42568d.getText().toString();
        Moment moment = photoAlbumBottomView.f41942K;
        coreServiceM61406H.mo31771hd(act, string, moment.f56859id, moment.owner);
    }

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ void m124396Y(PhotoAlbumBottomView photoAlbumBottomView, View view) {
        i4g0.m138523u("e_profile_moment_chat_send", OMSDialogPositon.p_suggest_user_profile_info_view, pf60.m172085a("moment_id", photoAlbumBottomView.f41942K.f56859id), pf60.m172085a("moment_chat_send_from", "profile_emoji"), pf60.m172085a("moment_type", er60.m122104w().m122135y(photoAlbumBottomView.f41942K)));
        CoreService coreServiceM61406H = FeedModule.m61406H();
        Act act = photoAlbumBottomView.act();
        String string = this.f97513X.f42569e.getText().toString();
        Moment moment = photoAlbumBottomView.f41942K;
        coreServiceM61406H.mo31771hd(act, string, moment.f56859id, moment.owner);
    }

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ void m124397Z(PhotoAlbumBottomView photoAlbumBottomView, View view) {
        i4g0.m138523u("e_profile_moment_chat_send", OMSDialogPositon.p_suggest_user_profile_info_view, pf60.m172085a("moment_id", photoAlbumBottomView.f41942K.f56859id), pf60.m172085a("moment_chat_send_from", "profile_emoji"), pf60.m172085a("moment_type", er60.m122104w().m122135y(photoAlbumBottomView.f41942K)));
        CoreService coreServiceM61406H = FeedModule.m61406H();
        Act act = photoAlbumBottomView.act();
        String string = this.f97513X.f42570f.getText().toString();
        Moment moment = photoAlbumBottomView.f41942K;
        coreServiceM61406H.mo31771hd(act, string, moment.f56859id, moment.owner);
    }

    /* JADX INFO: renamed from: a0 */
    public final boolean m124399a0(PhotoAlbumBottomView photoAlbumBottomView) {
        return !photoAlbumBottomView.m64579A1(photoAlbumBottomView.f41942K);
    }

    @Override // p153l.lol
    /* JADX INFO: renamed from: b0, reason: merged with bridge method [inline-methods] */
    public void mo124402c(PhotoAlbumBottomView photoAlbumBottomView) {
        m124391T(photoAlbumBottomView);
    }

    @Override // p153l.lol
    /* JADX INFO: renamed from: c0 */
    public boolean mo124400b(PhotoAlbumBottomView photoAlbumBottomView) {
        if (!j4h.m143420d()) {
            return false;
        }
        mo124411g0(photoAlbumBottomView);
        return false;
    }

    @Override // p153l.AbstractC20228t4
    /* JADX INFO: renamed from: d */
    public SVGAnimationView mo124404d() {
        return this.f97492C;
    }

    @Override // p153l.lol
    /* JADX INFO: renamed from: d0 */
    public boolean mo124398a(PhotoAlbumBottomView photoAlbumBottomView) {
        Moment moment = photoAlbumBottomView.f41942K;
        if (j4h.m143420d() && NullChecker.m82487b(moment) && moment.isLive) {
            if (m124399a0(photoAlbumBottomView)) {
                m124392U(photoAlbumBottomView.f41959c, false);
                m124392U(this.f97511V, true);
                photoAlbumBottomView.f41957a = this.f97511V;
            } else {
                m124392U(this.f97511V, false);
                photoAlbumBottomView.f41957a = mo124382F();
            }
        }
        if (!moment.isLive) {
            photoAlbumBottomView.f41957a = this.f97501L;
        }
        if (photoAlbumBottomView.m64597L0()) {
            m124393V();
            m124415i0();
        } else {
            m124413h0();
        }
        m124394W(photoAlbumBottomView);
        m124409f0();
        return false;
    }

    @Override // p153l.AbstractC20228t4
    /* JADX INFO: renamed from: e */
    public ConstraintLayout mo124406e() {
        return this.f97503N;
    }

    /* JADX INFO: renamed from: e0 */
    public void m124407e0(Moment moment, PhotoAlbumBottomView photoAlbumBottomView) {
        if (NullChecker.m82486a(moment) && moment.isVoiceLive) {
            photoAlbumBottomView.m64590H1((int) moment.voiceLive.messageCount);
            photoAlbumBottomView.m64600M1((int) moment.voiceLive.rewarderCount);
        }
    }

    @Override // p153l.AbstractC20228t4
    /* JADX INFO: renamed from: f */
    public VImage mo124408f() {
        return this.f97506Q;
    }

    /* JADX INFO: renamed from: f0 */
    public void m124409f0() {
        uqb0.f180374G.m127138Y0(this.f97510U, lbc0.f131033f2);
        this.f97509T.setTypeface(null, 1);
    }

    @Override // p153l.AbstractC20228t4
    /* JADX INFO: renamed from: g */
    public VDraweeView mo124410g() {
        return this.f97504O;
    }

    /* JADX INFO: renamed from: g0 */
    public void mo124411g0(final PhotoAlbumBottomView photoAlbumBottomView) {
        final Moment moment = photoAlbumBottomView.f41942K;
        m124392U(this.f97533t, false);
        final String str = photoAlbumBottomView.f41949P;
        if (moment.isLive) {
            m124392U(photoAlbumBottomView.f41960d, false);
            m124392U(photoAlbumBottomView.f41961e, false);
            TextUtils.equals(str, "from_discover_dating");
            m124392U(this.f97499J, true);
            m124392U(this.f97500K, false);
            bnl0.m105505C0(this.f97536w, qa00.f156289B);
            bnl0.m105509E0(this.f97499J, new View.OnClickListener() { // from class: l.e770
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    f770.m124375R(photoAlbumBottomView, moment, str, view);
                }
            });
            m124392U(this.f97532s, false);
            return;
        }
        this.f97514a.setOnClickListener(null);
        m124392U(this.f97532s, false);
        m124392U(photoAlbumBottomView.f41960d, true);
        m124392U(this.f97499J, false);
        m124392U(this.f97500K, false);
        if (!cmg.m111225o() || TextUtils.equals("from_live_square_tab", photoAlbumBottomView.f41949P)) {
            m124392U(photoAlbumBottomView.f41961e, true);
        } else {
            m124392U(photoAlbumBottomView.f41961e, false);
            m124392U(this.f97496G, false);
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) mo124429w().getLayoutParams();
            layoutParams.addRule(11, -1);
            layoutParams.setMarginEnd(qa00.m175859d(12.0f));
        }
        m124407e0(moment, photoAlbumBottomView);
    }

    @Override // p153l.AbstractC20228t4
    /* JADX INFO: renamed from: h */
    public VText mo124412h() {
        return this.f97505P;
    }

    /* JADX INFO: renamed from: h0 */
    public final void m124413h0() {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f97512W.getLayoutParams();
        marginLayoutParams.leftMargin = qa00.m175859d(78.0f);
        marginLayoutParams.rightMargin = qa00.m175859d(16.0f);
        marginLayoutParams.height = qa00.m175859d(0.5f);
        this.f97512W.setBackgroundColor(Color.parseColor("#f2f2f2"));
        this.f97512W.setLayoutParams(marginLayoutParams);
    }

    @Override // p153l.AbstractC20228t4
    /* JADX INFO: renamed from: i */
    public VText mo124414i() {
        return this.f97507R;
    }

    /* JADX INFO: renamed from: i0 */
    public final void m124415i0() {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f97512W.getLayoutParams();
        marginLayoutParams.height = qa00.m175859d(0.5f);
        this.f97512W.setBackgroundColor(Color.parseColor("#f2f2f2"));
        this.f97512W.setLayoutParams(marginLayoutParams);
    }

    @Override // p153l.AbstractC20228t4
    /* JADX INFO: renamed from: j */
    public VLinear mo124416j() {
        return this.f97493D;
    }

    @Override // p153l.AbstractC20228t4
    /* JADX INFO: renamed from: k */
    public TextView mo124417k() {
        return this.f97495F;
    }

    @Override // p153l.AbstractC20228t4
    /* JADX INFO: renamed from: l */
    public VLinear mo124418l() {
        return this.f97515b;
    }

    @Override // p153l.AbstractC20228t4
    /* JADX INFO: renamed from: m */
    public VText mo124419m() {
        return this.f97525l;
    }

    @Override // p153l.AbstractC20228t4
    /* JADX INFO: renamed from: n */
    public View mo124420n() {
        return this.f97512W;
    }

    @Override // p153l.AbstractC20228t4
    /* JADX INFO: renamed from: o */
    public View mo124421o() {
        return this.f97499J;
    }

    @Override // p153l.AbstractC20228t4
    /* JADX INFO: renamed from: p */
    public LinearLayout mo124422p() {
        return this.f97520g;
    }

    @Override // p153l.AbstractC20228t4
    /* JADX INFO: renamed from: q */
    public FeedUserHeaderView mo124423q() {
        return this.f97529p;
    }

    @Override // p153l.AbstractC20228t4
    /* JADX INFO: renamed from: r */
    public VDraweeView mo124424r() {
        return this.f97517d;
    }

    @Override // p153l.AbstractC20228t4
    /* JADX INFO: renamed from: s */
    public VText mo124425s() {
        return this.f97519f;
    }

    @Override // p153l.AbstractC20228t4
    /* JADX INFO: renamed from: t */
    public VText mo124426t() {
        return this.f97518e;
    }

    @Override // p153l.AbstractC20228t4
    /* JADX INFO: renamed from: u */
    public ConstraintLayout mo124427u() {
        return this.f97516c;
    }

    @Override // p153l.AbstractC20228t4
    /* JADX INFO: renamed from: v */
    public RelativeLayout mo124428v() {
        return this.f97536w;
    }

    @Override // p153l.AbstractC20228t4
    /* JADX INFO: renamed from: w */
    public VRelative mo124429w() {
        return this.f97537x;
    }

    @Override // p153l.AbstractC20228t4
    /* JADX INFO: renamed from: x */
    public FeedAutoScrollTextView mo124430x() {
        return this.f97491B;
    }

    @Override // p153l.AbstractC20228t4
    /* JADX INFO: renamed from: y */
    public VDraweeView mo124431y() {
        return this.f97490A;
    }

    @Override // p153l.AbstractC20228t4
    /* JADX INFO: renamed from: z */
    public VFrame mo124432z() {
        return this.f97538y;
    }

    @Override // p153l.AbstractC20228t4
    /* JADX INFO: renamed from: N */
    public void mo124390N(boolean z) {
    }
}
