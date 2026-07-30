package p007l;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p000p1.mobile.putong.data.OMSDialogPositon;
import com.p000p1.mobile.putong.data.User;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.R$string;
import com.p000p1.mobile.putong.feed.data.Moment;
import com.p000p1.mobile.putong.feed.newui.photoalbum.PhotoAlbumBottomView;
import com.p000p1.mobile.putong.feed.newui.photoalbum.feed.personfeedinprofile.FeedInsertCommentView;
import com.p000p1.mobile.putong.feed.newui.view.FeedAutoScrollTextView;
import com.p000p1.mobile.putong.feed.newui.view.FeedUserHeaderView;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core_api.api.serviceprovider.api.CoreService;
import com.tantan.library.svga.SVGAnimationView;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import l.j760;
import l.qib0;
import l.t100;
import l.xdl0;
import l.zvf0;
import v.VDraweeView;
import v.VFrame;
import v.VImage;
import v.VLinear;
import v.VRelative;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class zy60 extends AbstractC2520v4 {

    /* JADX INFO: renamed from: A */
    public VDraweeView f15905A;

    /* JADX INFO: renamed from: B */
    public FeedAutoScrollTextView f15906B;

    /* JADX INFO: renamed from: C */
    public SVGAnimationView f15907C;

    /* JADX INFO: renamed from: D */
    public VLinear f15908D;

    /* JADX INFO: renamed from: E */
    public VImage f15909E;

    /* JADX INFO: renamed from: F */
    public TextView f15910F;

    /* JADX INFO: renamed from: G */
    public VLinear f15911G;

    /* JADX INFO: renamed from: H */
    public VImage f15912H;

    /* JADX INFO: renamed from: I */
    public TextView f15913I;

    /* JADX INFO: renamed from: J */
    public VText f15914J;

    /* JADX INFO: renamed from: K */
    public VText f15915K;

    /* JADX INFO: renamed from: L */
    public ImageView f15916L;

    /* JADX INFO: renamed from: M */
    public VText f15917M;

    /* JADX INFO: renamed from: N */
    public ConstraintLayout f15918N;

    /* JADX INFO: renamed from: O */
    public VDraweeView f15919O;

    /* JADX INFO: renamed from: P */
    public VText f15920P;

    /* JADX INFO: renamed from: Q */
    public VImage f15921Q;

    /* JADX INFO: renamed from: R */
    public VText f15922R;

    /* JADX INFO: renamed from: S */
    public VLinear f15923S;

    /* JADX INFO: renamed from: T */
    public VText f15924T;

    /* JADX INFO: renamed from: U */
    public VDraweeView f15925U;

    /* JADX INFO: renamed from: V */
    public ImageView f15926V;

    /* JADX INFO: renamed from: W */
    public View f15927W;

    /* JADX INFO: renamed from: X */
    public FeedInsertCommentView f15928X;

    /* JADX INFO: renamed from: a */
    public PhotoAlbumBottomView f15929a;

    /* JADX INFO: renamed from: b */
    public VLinear f15930b;

    /* JADX INFO: renamed from: c */
    public ConstraintLayout f15931c;

    /* JADX INFO: renamed from: d */
    public VDraweeView f15932d;

    /* JADX INFO: renamed from: e */
    public VText f15933e;

    /* JADX INFO: renamed from: f */
    public VText f15934f;

    /* JADX INFO: renamed from: g */
    public LinearLayout f15935g;

    /* JADX INFO: renamed from: h */
    public VLinear f15936h;

    /* JADX INFO: renamed from: i */
    public VText f15937i;

    /* JADX INFO: renamed from: j */
    public VText f15938j;

    /* JADX INFO: renamed from: k */
    public VText f15939k;

    /* JADX INFO: renamed from: l */
    public VText f15940l;

    /* JADX INFO: renamed from: m */
    public VText f15941m;

    /* JADX INFO: renamed from: n */
    public VText f15942n;

    /* JADX INFO: renamed from: o */
    public VLinear f15943o;

    /* JADX INFO: renamed from: p */
    public FeedUserHeaderView f15944p;

    /* JADX INFO: renamed from: q */
    public VText f15945q;

    /* JADX INFO: renamed from: r */
    public VImage f15946r;

    /* JADX INFO: renamed from: s */
    public VText f15947s;

    /* JADX INFO: renamed from: t */
    public RelativeLayout f15948t;

    /* JADX INFO: renamed from: u */
    public VText f15949u;

    /* JADX INFO: renamed from: v */
    public ImageView f15950v;

    /* JADX INFO: renamed from: w */
    public RelativeLayout f15951w;

    /* JADX INFO: renamed from: x */
    public VRelative f15952x;

    /* JADX INFO: renamed from: y */
    public VFrame f15953y;

    /* JADX INFO: renamed from: z */
    public VImage f15954z;

    /* JADX INFO: renamed from: Q */
    public static /* synthetic */ void m17579Q(PhotoAlbumBottomView photoAlbumBottomView, View view) {
        zvf0.u("e_profile_moment_chat_input", OMSDialogPositon.p_suggest_user_profile_info_view, new j760[]{j760.a("moment_id", ((DbObject) photoAlbumBottomView.f2555K).id), j760.a("moment_type", zi60.m17436w().m17467y(photoAlbumBottomView.f2555K))});
        Act act = photoAlbumBottomView.act();
        CoreService coreServiceM1140H = FeedModule.m1140H();
        Act act2 = photoAlbumBottomView.act();
        Moment moment = photoAlbumBottomView.f2555K;
        act.startActivity(coreServiceM1140H.k9(act2, ((DbObject) moment).id, moment.owner, "from_moment"));
        photoAlbumBottomView.act().overridePendingTransition(0, 0);
    }

    /* JADX INFO: renamed from: R */
    public static /* synthetic */ void m17580R(PhotoAlbumBottomView photoAlbumBottomView, Moment moment, String str, View view) {
        photoAlbumBottomView.m4416C1(moment.live, photoAlbumBottomView.act(), kjb0.m11461m(moment.live, str));
        osg.m12852h(photoAlbumBottomView.act(), str, moment, photoAlbumBottomView.f2567U, photoAlbumBottomView.f2564R, photoAlbumBottomView.f2566T);
    }

    @Override // p007l.AbstractC2520v4
    /* JADX INFO: renamed from: A */
    public VImage mo15305A() {
        return this.f15954z;
    }

    @Override // p007l.AbstractC2520v4
    /* JADX INFO: renamed from: B */
    public VText mo15306B() {
        return this.f15941m;
    }

    @Override // p007l.AbstractC2520v4
    /* JADX INFO: renamed from: C */
    public VText mo15307C() {
        return this.f15942n;
    }

    @Override // p007l.AbstractC2520v4
    /* JADX INFO: renamed from: D */
    public VText mo15308D() {
        return this.f15917M;
    }

    @Override // p007l.AbstractC2520v4
    /* JADX INFO: renamed from: E */
    public VLinear mo15309E() {
        return this.f15923S;
    }

    @Override // p007l.AbstractC2520v4
    /* JADX INFO: renamed from: F */
    public ImageView mo15310F() {
        return this.f15916L;
    }

    @Override // p007l.AbstractC2520v4
    /* JADX INFO: renamed from: G */
    public VText mo15311G() {
        return this.f15938j;
    }

    @Override // p007l.AbstractC2520v4
    /* JADX INFO: renamed from: H */
    public VText mo15312H() {
        return this.f15937i;
    }

    @Override // p007l.AbstractC2520v4
    /* JADX INFO: renamed from: I */
    public VLinear mo15313I() {
        return this.f15936h;
    }

    @Override // p007l.AbstractC2520v4
    /* JADX INFO: renamed from: J */
    public VText mo15314J() {
        return this.f15939k;
    }

    @Override // p007l.AbstractC2520v4
    /* JADX INFO: renamed from: K */
    public VImage mo15315K() {
        return this.f15946r;
    }

    @Override // p007l.AbstractC2520v4
    /* JADX INFO: renamed from: L */
    public VText mo15316L() {
        return this.f15945q;
    }

    @Override // p007l.AbstractC2520v4
    /* JADX INFO: renamed from: M */
    public VLinear mo15317M() {
        return this.f15943o;
    }

    /* JADX INFO: renamed from: T */
    public final void m17582T(View view) {
        az60.m8625a(this, view);
    }

    /* JADX INFO: renamed from: U */
    public void m17583U(View view, boolean z) {
        if (NullChecker.a(view)) {
            xdl0.M(view, z);
        }
    }

    /* JADX INFO: renamed from: V */
    public final void m17584V() {
        this.f15930b.setPadding(t100.d(40.0f), t100.d(10.0f), t100.d(2.0f), 0);
        xdl0.X(this.f15937i, 0);
        xdl0.U((RelativeLayout) this.f15930b.getParent(), 0);
    }

    /* JADX INFO: renamed from: W */
    public void m17585W(final PhotoAlbumBottomView photoAlbumBottomView) {
        User userM16628e8 = FeedModule.f316d.m16628e8(photoAlbumBottomView.f2555K.owner);
        if ("from_profile_album".equals(photoAlbumBottomView.f2562P)) {
            Moment moment = photoAlbumBottomView.f2555K;
            if (!moment.isLive && !moment.isVoiceLive && !vqg.m15498V(moment) && !((DbObject) FeedModule.m1140H().me_()).id.equals(userM16628e8) && vqg.m15497U(FeedModule.m1140H().Zj(photoAlbumBottomView.f2555K.owner))) {
                if (this.f15928X == null) {
                    FeedInsertCommentView feedInsertCommentView = new FeedInsertCommentView((Context) photoAlbumBottomView.act(), false);
                    this.f15928X = feedInsertCommentView;
                    qib0.G.L0(feedInsertCommentView.f3178a, FeedModule.m1140H().me_().m1042fp().url);
                    this.f15930b.addView(this.f15928X);
                    VText vText = this.f15928X.f3179b;
                    StringBuilder sb = new StringBuilder(" ");
                    sb.append(FeedModule.f313a.getResources().getString(R$string.f476Z3, " " + userM16628e8.name));
                    vText.setHint(sb.toString());
                    xdl0.E0(this.f15928X.f3179b, new View.OnClickListener() { // from class: l.uy60
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            zy60.m17579Q(photoAlbumBottomView, view);
                        }
                    });
                    xdl0.W(this.f15928X, t100.d(16.0f));
                    xdl0.V(this.f15928X, t100.d(12.0f));
                    xdl0.U(this.f15928X, t100.d(21.0f));
                    xdl0.C0(this.f15928X, t100.d(46.0f));
                    photoAlbumBottomView.f2561O.put(((DbObject) photoAlbumBottomView.f2555K).id, Boolean.TRUE);
                    xdl0.E0(this.f15928X.f3181d, new View.OnClickListener() { // from class: l.vy60
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            this.f14329a.m17586X(photoAlbumBottomView, view);
                        }
                    });
                    xdl0.E0(this.f15928X.f3182e, new View.OnClickListener() { // from class: l.wy60
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            this.f14701a.m17587Y(photoAlbumBottomView, view);
                        }
                    });
                    xdl0.E0(this.f15928X.f3183f, new View.OnClickListener() { // from class: l.xy60
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            this.f15179a.m17588Z(photoAlbumBottomView, view);
                        }
                    });
                }
                zvf0.A("e_profile_moment_chat_input", OMSDialogPositon.p_suggest_user_profile_info_view, new j760[]{j760.a("moment_id", ((DbObject) photoAlbumBottomView.f2555K).id), j760.a("moment_type", zi60.m17436w().m17467y(photoAlbumBottomView.f2555K))});
                return;
            }
        }
        if (photoAlbumBottomView.f2561O.containsKey(((DbObject) photoAlbumBottomView.f2555K).id) && photoAlbumBottomView.f2561O.get(((DbObject) photoAlbumBottomView.f2555K).id).booleanValue()) {
            return;
        }
        this.f15930b.removeView(this.f15928X);
        photoAlbumBottomView.f2561O.put(((DbObject) photoAlbumBottomView.f2555K).id, Boolean.FALSE);
    }

    /* JADX INFO: renamed from: X */
    public final /* synthetic */ void m17586X(PhotoAlbumBottomView photoAlbumBottomView, View view) {
        zvf0.u("e_profile_moment_chat_send", OMSDialogPositon.p_suggest_user_profile_info_view, new j760[]{j760.a("moment_id", ((DbObject) photoAlbumBottomView.f2555K).id), j760.a("moment_chat_send_from", "profile_emoji"), j760.a("moment_type", zi60.m17436w().m17467y(photoAlbumBottomView.f2555K))});
        CoreService coreServiceM1140H = FeedModule.m1140H();
        Act act = photoAlbumBottomView.act();
        String string = this.f15928X.f3181d.getText().toString();
        Moment moment = photoAlbumBottomView.f2555K;
        coreServiceM1140H.hd(act, string, ((DbObject) moment).id, moment.owner);
    }

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ void m17587Y(PhotoAlbumBottomView photoAlbumBottomView, View view) {
        zvf0.u("e_profile_moment_chat_send", OMSDialogPositon.p_suggest_user_profile_info_view, new j760[]{j760.a("moment_id", ((DbObject) photoAlbumBottomView.f2555K).id), j760.a("moment_chat_send_from", "profile_emoji"), j760.a("moment_type", zi60.m17436w().m17467y(photoAlbumBottomView.f2555K))});
        CoreService coreServiceM1140H = FeedModule.m1140H();
        Act act = photoAlbumBottomView.act();
        String string = this.f15928X.f3182e.getText().toString();
        Moment moment = photoAlbumBottomView.f2555K;
        coreServiceM1140H.hd(act, string, ((DbObject) moment).id, moment.owner);
    }

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ void m17588Z(PhotoAlbumBottomView photoAlbumBottomView, View view) {
        zvf0.u("e_profile_moment_chat_send", OMSDialogPositon.p_suggest_user_profile_info_view, new j760[]{j760.a("moment_id", ((DbObject) photoAlbumBottomView.f2555K).id), j760.a("moment_chat_send_from", "profile_emoji"), j760.a("moment_type", zi60.m17436w().m17467y(photoAlbumBottomView.f2555K))});
        CoreService coreServiceM1140H = FeedModule.m1140H();
        Act act = photoAlbumBottomView.act();
        String string = this.f15928X.f3183f.getText().toString();
        Moment moment = photoAlbumBottomView.f2555K;
        coreServiceM1140H.hd(act, string, ((DbObject) moment).id, moment.owner);
    }

    /* JADX INFO: renamed from: a0 */
    public final boolean m17589a0(PhotoAlbumBottomView photoAlbumBottomView) {
        return !photoAlbumBottomView.m4413A1(photoAlbumBottomView.f2555K);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p007l.zll
    /* JADX INFO: renamed from: b0, reason: merged with bridge method [inline-methods] */
    public void mo17510c(PhotoAlbumBottomView photoAlbumBottomView) {
        m17582T(photoAlbumBottomView);
    }

    @Override // p007l.zll
    /* JADX INFO: renamed from: c0 */
    public boolean mo13795b(PhotoAlbumBottomView photoAlbumBottomView) {
        if (!u2h.m14719d()) {
            return false;
        }
        mo13798g0(photoAlbumBottomView);
        return false;
    }

    @Override // p007l.AbstractC2520v4
    /* JADX INFO: renamed from: d */
    public SVGAnimationView mo15318d() {
        return this.f15907C;
    }

    @Override // p007l.zll
    /* JADX INFO: renamed from: d0 */
    public boolean mo13794a(PhotoAlbumBottomView photoAlbumBottomView) {
        Moment moment = photoAlbumBottomView.f2555K;
        if (u2h.m14719d() && NullChecker.b(moment) && moment.isLive) {
            if (m17589a0(photoAlbumBottomView)) {
                m17583U(photoAlbumBottomView.f2572c, false);
                m17583U(this.f15926V, true);
                photoAlbumBottomView.f2570a = this.f15926V;
            } else {
                m17583U(this.f15926V, false);
                photoAlbumBottomView.f2570a = mo15310F();
            }
        }
        if (!moment.isLive) {
            photoAlbumBottomView.f2570a = this.f15916L;
        }
        if (photoAlbumBottomView.m4431L0()) {
            m17584V();
            m17594i0();
        } else {
            m17593h0();
        }
        m17585W(photoAlbumBottomView);
        m17592f0();
        return false;
    }

    @Override // p007l.AbstractC2520v4
    /* JADX INFO: renamed from: e */
    public ConstraintLayout mo15319e() {
        return this.f15918N;
    }

    /* JADX INFO: renamed from: e0 */
    public void m17591e0(Moment moment, PhotoAlbumBottomView photoAlbumBottomView) {
        if (NullChecker.a(moment) && moment.isVoiceLive) {
            photoAlbumBottomView.m4424H1((int) moment.voiceLive.messageCount);
            photoAlbumBottomView.m4434M1((int) moment.voiceLive.rewarderCount);
        }
    }

    @Override // p007l.AbstractC2520v4
    /* JADX INFO: renamed from: f */
    public VImage mo15320f() {
        return this.f15921Q;
    }

    /* JADX INFO: renamed from: f0 */
    public void m17592f0() {
        qib0.G.Y0(this.f15925U, f3c0.f7798f2);
        this.f15924T.setTypeface((Typeface) null, 1);
    }

    @Override // p007l.AbstractC2520v4
    /* JADX INFO: renamed from: g */
    public VDraweeView mo15321g() {
        return this.f15919O;
    }

    /* JADX INFO: renamed from: g0 */
    public void mo13798g0(final PhotoAlbumBottomView photoAlbumBottomView) {
        final Moment moment = photoAlbumBottomView.f2555K;
        m17583U(this.f15948t, false);
        final String str = photoAlbumBottomView.f2562P;
        if (moment.isLive) {
            m17583U(photoAlbumBottomView.f2573d, false);
            m17583U(photoAlbumBottomView.f2574e, false);
            TextUtils.equals(str, "from_discover_dating");
            m17583U(this.f15914J, true);
            m17583U(this.f15915K, false);
            xdl0.C0(this.f15951w, t100.B);
            xdl0.E0(this.f15914J, new View.OnClickListener() { // from class: l.yy60
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    zy60.m17580R(photoAlbumBottomView, moment, str, view);
                }
            });
            m17583U(this.f15947s, false);
            return;
        }
        this.f15929a.setOnClickListener((View.OnClickListener) null);
        m17583U(this.f15947s, false);
        m17583U(photoAlbumBottomView.f2573d, true);
        m17583U(this.f15914J, false);
        m17583U(this.f15915K, false);
        if (!nkg.m12255o() || TextUtils.equals("from_live_square_tab", photoAlbumBottomView.f2562P)) {
            m17583U(photoAlbumBottomView.f2574e, true);
        } else {
            m17583U(photoAlbumBottomView.f2574e, false);
            m17583U(this.f15911G, false);
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) mo15336w().getLayoutParams();
            layoutParams.addRule(11, -1);
            layoutParams.setMarginEnd(t100.d(12.0f));
        }
        m17591e0(moment, photoAlbumBottomView);
    }

    @Override // p007l.AbstractC2520v4
    /* JADX INFO: renamed from: h */
    public VText mo15322h() {
        return this.f15920P;
    }

    /* JADX INFO: renamed from: h0 */
    public final void m17593h0() {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f15927W.getLayoutParams();
        marginLayoutParams.leftMargin = t100.d(78.0f);
        marginLayoutParams.rightMargin = t100.d(16.0f);
        marginLayoutParams.height = t100.d(0.5f);
        this.f15927W.setBackgroundColor(Color.parseColor("#f2f2f2"));
        this.f15927W.setLayoutParams(marginLayoutParams);
    }

    @Override // p007l.AbstractC2520v4
    /* JADX INFO: renamed from: i */
    public VText mo15323i() {
        return this.f15922R;
    }

    /* JADX INFO: renamed from: i0 */
    public final void m17594i0() {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f15927W.getLayoutParams();
        marginLayoutParams.height = t100.d(0.5f);
        this.f15927W.setBackgroundColor(Color.parseColor("#f2f2f2"));
        this.f15927W.setLayoutParams(marginLayoutParams);
    }

    @Override // p007l.AbstractC2520v4
    /* JADX INFO: renamed from: j */
    public VLinear mo15324j() {
        return this.f15908D;
    }

    @Override // p007l.AbstractC2520v4
    /* JADX INFO: renamed from: k */
    public TextView mo15325k() {
        return this.f15910F;
    }

    @Override // p007l.AbstractC2520v4
    /* JADX INFO: renamed from: l */
    public VLinear mo15326l() {
        return this.f15930b;
    }

    @Override // p007l.AbstractC2520v4
    /* JADX INFO: renamed from: m */
    public VText mo15327m() {
        return this.f15940l;
    }

    @Override // p007l.AbstractC2520v4
    /* JADX INFO: renamed from: n */
    public View mo15328n() {
        return this.f15927W;
    }

    @Override // p007l.AbstractC2520v4
    /* JADX INFO: renamed from: o */
    public View mo13799o() {
        return this.f15914J;
    }

    @Override // p007l.AbstractC2520v4
    /* JADX INFO: renamed from: p */
    public LinearLayout mo15329p() {
        return this.f15935g;
    }

    @Override // p007l.AbstractC2520v4
    /* JADX INFO: renamed from: q */
    public FeedUserHeaderView mo15330q() {
        return this.f15944p;
    }

    @Override // p007l.AbstractC2520v4
    /* JADX INFO: renamed from: r */
    public VDraweeView mo15331r() {
        return this.f15932d;
    }

    @Override // p007l.AbstractC2520v4
    /* JADX INFO: renamed from: s */
    public VText mo15332s() {
        return this.f15934f;
    }

    @Override // p007l.AbstractC2520v4
    /* JADX INFO: renamed from: t */
    public VText mo15333t() {
        return this.f15933e;
    }

    @Override // p007l.AbstractC2520v4
    /* JADX INFO: renamed from: u */
    public ConstraintLayout mo15334u() {
        return this.f15931c;
    }

    @Override // p007l.AbstractC2520v4
    /* JADX INFO: renamed from: v */
    public RelativeLayout mo15335v() {
        return this.f15951w;
    }

    @Override // p007l.AbstractC2520v4
    /* JADX INFO: renamed from: w */
    public VRelative mo15336w() {
        return this.f15952x;
    }

    @Override // p007l.AbstractC2520v4
    /* JADX INFO: renamed from: x */
    public FeedAutoScrollTextView mo15337x() {
        return this.f15906B;
    }

    @Override // p007l.AbstractC2520v4
    /* JADX INFO: renamed from: y */
    public VDraweeView mo15338y() {
        return this.f15905A;
    }

    @Override // p007l.AbstractC2520v4
    /* JADX INFO: renamed from: z */
    public VFrame mo15339z() {
        return this.f15953y;
    }

    @Override // p007l.AbstractC2520v4
    /* JADX INFO: renamed from: N */
    public void mo13783N(boolean z) {
    }
}
