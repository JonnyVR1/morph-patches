package com.p000p1.mobile.putong.feed.newui.photoalbum;

import android.R;
import android.animation.Animator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.text.Html;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.text.style.URLSpan;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p000p1.mobile.putong.data.Envelope;
import com.p000p1.mobile.putong.data.Media;
import com.p000p1.mobile.putong.data.MessageLocation;
import com.p000p1.mobile.putong.data.PartialIdList;
import com.p000p1.mobile.putong.data.User;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.R$string;
import com.p000p1.mobile.putong.feed.data.FeedData;
import com.p000p1.mobile.putong.feed.data.Group;
import com.p000p1.mobile.putong.feed.data.GroupIdBox;
import com.p000p1.mobile.putong.feed.data.Moment;
import com.p000p1.mobile.putong.feed.data.MomentAdditionalData;
import com.p000p1.mobile.putong.feed.data.MomentShareInfo;
import com.p000p1.mobile.putong.feed.data.MomentViewerBox;
import com.p000p1.mobile.putong.feed.helper.exception.MomentDetailHeaderBottomViewNullException;
import com.p000p1.mobile.putong.feed.newui.group.groupdetail.FeedGroupDetailAct;
import com.p000p1.mobile.putong.feed.newui.photoalbum.MomentDetailHeaderBottomView;
import com.p000p1.mobile.putong.feed.newui.photoalbum.feedbottom.insert.FeedInteractiveView;
import com.p000p1.mobile.putong.feed.newui.photoalbum.feedcenter.FeedCenterForwardVideoView;
import com.p000p1.mobile.putong.feed.newui.photoalbum.feedcenter.FeedCenterVideoView;
import com.p000p1.mobile.putong.feed.newui.photoalbum.view.FeedSharelinkView;
import com.p000p1.mobile.putong.feed.newui.topic.qatopic.QATopicPhotoAlbumTagView;
import com.p000p1.mobile.putong.feed.newui.view.FeedAutoScrollTextView;
import com.p000p1.mobile.putong.feed.newui.view.FeedUserHeaderView;
import com.p000p1.mobile.putong.feed.p005ui.PlayerView;
import com.p1.mobile.android.app.Act;
import com.tantan.library.svga.AnimListener;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.SVGAnimationView;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import l.bt0;
import l.c680;
import l.d30;
import l.e30;
import l.e51;
import l.i0g0;
import l.j760;
import l.lsi0;
import l.mkd0;
import l.mqi0;
import l.qib0;
import l.t100;
import l.vwb;
import l.xdl0;
import l.zvf0;
import p007l.bqg;
import p007l.dqg;
import p007l.e1c0;
import p007l.erl;
import p007l.f3c0;
import p007l.hx60;
import p007l.ic00;
import p007l.ijb0;
import p007l.j2i;
import p007l.kjb0;
import p007l.kyg;
import p007l.n900;
import p007l.nkg;
import p007l.ovi;
import p007l.p6j0;
import p007l.q31;
import p007l.qmf0;
import p007l.s7i;
import p007l.t2h;
import p007l.u2h;
import p007l.upg;
import p007l.vqg;
import p007l.vs0;
import p007l.vwi;
import p007l.wf00;
import p007l.yih;
import p007l.zc00;
import p007l.zi60;
import v.VDraweeView;
import v.VFrame;
import v.VImage;
import v.VLinear;
import v.VRelative;
import v.VText;
import v.VText_Expandable;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class MomentDetailHeaderBottomView extends RelativeLayout {

    /* JADX INFO: renamed from: e1 */
    public static String f2387e1 = " ";

    /* JADX INFO: renamed from: f1 */
    public static final int f2388f1 = t100.d(8.0f);

    /* JADX INFO: renamed from: g1 */
    public static final int f2389g1 = t100.d(6.0f);

    /* JADX INFO: renamed from: h1 */
    public static final int f2390h1 = t100.d(8.0f);

    /* JADX INFO: renamed from: A */
    public TextView f2391A;

    /* JADX INFO: renamed from: B */
    public VLinear f2392B;

    /* JADX INFO: renamed from: C */
    public VImage f2393C;

    /* JADX INFO: renamed from: D */
    public VText f2394D;

    /* JADX INFO: renamed from: E */
    public ImageView f2395E;

    /* JADX INFO: renamed from: E0 */
    public VDraweeView f2396E0;

    /* JADX INFO: renamed from: F */
    public VText f2397F;

    /* JADX INFO: renamed from: F0 */
    public FeedAutoScrollTextView f2398F0;

    /* JADX INFO: renamed from: G */
    public ConstraintLayout f2399G;

    /* JADX INFO: renamed from: G0 */
    public VLinear f2400G0;

    /* JADX INFO: renamed from: H */
    public VDraweeView f2401H;

    /* JADX INFO: renamed from: H0 */
    public TextView f2402H0;

    /* JADX INFO: renamed from: I */
    public VText f2403I;

    /* JADX INFO: renamed from: I0 */
    public VText f2404I0;

    /* JADX INFO: renamed from: J */
    public VImage f2405J;

    /* JADX INFO: renamed from: J0 */
    public boolean f2406J0;

    /* JADX INFO: renamed from: K */
    public VText f2407K;

    /* JADX INFO: renamed from: K0 */
    public boolean f2408K0;

    /* JADX INFO: renamed from: L */
    public ConstraintLayout f2409L;

    /* JADX INFO: renamed from: L0 */
    public d30 f2410L0;

    /* JADX INFO: renamed from: M */
    public VRelative f2411M;

    /* JADX INFO: renamed from: M0 */
    public View f2412M0;

    /* JADX INFO: renamed from: N */
    public VText f2413N;

    /* JADX INFO: renamed from: N0 */
    public User f2414N0;

    /* JADX INFO: renamed from: O */
    public VText f2415O;

    /* JADX INFO: renamed from: O0 */
    public Moment f2416O0;

    /* JADX INFO: renamed from: P */
    public VImage f2417P;

    /* JADX INFO: renamed from: P0 */
    public String f2418P0;

    /* JADX INFO: renamed from: Q */
    public View f2419Q;

    /* JADX INFO: renamed from: Q0 */
    public hx60 f2420Q0;

    /* JADX INFO: renamed from: R */
    public TextView f2421R;

    /* JADX INFO: renamed from: R0 */
    public boolean f2422R0;

    /* JADX INFO: renamed from: S */
    public VText_Expandable f2423S;

    /* JADX INFO: renamed from: S0 */
    public d30 f2424S0;

    /* JADX INFO: renamed from: T */
    public VText f2425T;

    /* JADX INFO: renamed from: T0 */
    public boolean f2426T0;

    /* JADX INFO: renamed from: U */
    public VText f2427U;

    /* JADX INFO: renamed from: U0 */
    public int f2428U0;

    /* JADX INFO: renamed from: V */
    public VLinear f2429V;

    /* JADX INFO: renamed from: V0 */
    public View f2430V0;

    /* JADX INFO: renamed from: W */
    public RelativeLayout f2431W;

    /* JADX INFO: renamed from: W0 */
    public boolean f2432W0;

    /* JADX INFO: renamed from: X0 */
    public boolean f2433X0;

    /* JADX INFO: renamed from: Y0 */
    public FeedInteractiveView f2434Y0;

    /* JADX INFO: renamed from: Z0 */
    public boolean f2435Z0;

    /* JADX INFO: renamed from: a */
    public MomentDetailHeaderBottomView f2436a;

    /* JADX INFO: renamed from: a1 */
    public wf00 f2437a1;

    /* JADX INFO: renamed from: b */
    public LinearLayout f2438b;

    /* JADX INFO: renamed from: b1 */
    public boolean f2439b1;

    /* JADX INFO: renamed from: c */
    public VText_Expandable f2440c;

    /* JADX INFO: renamed from: c1 */
    public boolean f2441c1;

    /* JADX INFO: renamed from: d */
    public VText f2442d;

    /* JADX INFO: renamed from: d1 */
    public boolean f2443d1;

    /* JADX INFO: renamed from: e */
    public VText f2444e;

    /* JADX INFO: renamed from: f */
    public FeedSharelinkView f2445f;

    /* JADX INFO: renamed from: g */
    public VLinear f2446g;

    /* JADX INFO: renamed from: h */
    public FeedInteractiveView f2447h;

    /* JADX INFO: renamed from: i */
    public QATopicPhotoAlbumTagView f2448i;

    /* JADX INFO: renamed from: j */
    public VLinear f2449j;

    /* JADX INFO: renamed from: k */
    public VText f2450k;

    /* JADX INFO: renamed from: k0 */
    public VRelative f2451k0;

    /* JADX INFO: renamed from: l */
    public VText f2452l;

    /* JADX INFO: renamed from: m */
    public VText f2453m;

    /* JADX INFO: renamed from: n */
    public VText f2454n;

    /* JADX INFO: renamed from: o */
    public VLinear f2455o;

    /* JADX INFO: renamed from: p */
    public FeedUserHeaderView f2456p;

    /* JADX INFO: renamed from: p0 */
    public VImage f2457p0;

    /* JADX INFO: renamed from: q */
    public VText f2458q;

    /* JADX INFO: renamed from: r */
    public VImage f2459r;

    /* JADX INFO: renamed from: s */
    public RelativeLayout f2460s;

    /* JADX INFO: renamed from: t */
    public VRelative f2461t;

    /* JADX INFO: renamed from: u */
    public VFrame f2462u;

    /* JADX INFO: renamed from: v */
    public VImage f2463v;

    /* JADX INFO: renamed from: w */
    public VDraweeView f2464w;

    /* JADX INFO: renamed from: x */
    public FeedAutoScrollTextView f2465x;

    /* JADX INFO: renamed from: y */
    public VLinear f2466y;

    /* JADX INFO: renamed from: z */
    public VImage f2467z;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.photoalbum.MomentDetailHeaderBottomView$a */
    public class C2105a extends c680.c {

        /* JADX INFO: renamed from: a */
        public boolean f2468a;

        public C2105a() {
        }

        /* JADX INFO: renamed from: d */
        public void m4237d() {
            this.f2468a = true;
        }

        public void onComplete() {
            super.onComplete();
            p6j0.m12916f("e_video_play_over", "p_user_moment_interactions_details_view", p6j0.C2456a.m12922g("moment_id", ((DbObject) MomentDetailHeaderBottomView.this.f2416O0).id), p6j0.C2456a.m12922g("owner_id", MomentDetailHeaderBottomView.this.f2416O0.owner));
        }

        public void onResume() {
            if (this.f2468a) {
                p6j0.m12916f("e_video_play_start", "p_user_moment_interactions_details_view", p6j0.C2456a.m12922g("moment_id", ((DbObject) MomentDetailHeaderBottomView.this.f2416O0).id), p6j0.C2456a.m12922g("owner_id", MomentDetailHeaderBottomView.this.f2416O0.owner));
            }
            this.f2468a = false;
        }

        public void onStart() {
            p6j0.m12916f("e_video_play_start", "p_user_moment_interactions_details_view", p6j0.C2456a.m12922g("moment_id", ((DbObject) MomentDetailHeaderBottomView.this.f2416O0).id), p6j0.C2456a.m12922g("owner_id", MomentDetailHeaderBottomView.this.f2416O0.owner));
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.photoalbum.MomentDetailHeaderBottomView$b */
    public class ViewOnClickListenerC2106b implements View.OnClickListener {
        public ViewOnClickListenerC2106b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MomentDetailHeaderBottomView.m4185z(MomentDetailHeaderBottomView.this.f2416O0, MomentDetailHeaderBottomView.this.f2416O0.group);
            MomentDetailHeaderBottomView.this.m4232u().startActivity(new FeedGroupDetailAct.C2044a(MomentDetailHeaderBottomView.this.m4232u(), MomentDetailHeaderBottomView.this.f2416O0.group.f684id).m2961a());
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.photoalbum.MomentDetailHeaderBottomView$c */
    public class C2107c extends AnimListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ImageView f2471a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ SVGAnimationView f2472b;

        public C2107c(ImageView imageView, SVGAnimationView sVGAnimationView) {
            this.f2471a = imageView;
            this.f2472b = sVGAnimationView;
        }

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ void m4239b(SVGAnimationView sVGAnimationView) {
            MomentDetailHeaderBottomView.this.f2451k0.setEnabled(true);
            sVGAnimationView.setVisibility(8);
            ((ViewGroup) MomentDetailHeaderBottomView.this.m4232u().findViewById(R.id.content)).removeView(sVGAnimationView);
        }

        public void onFinished() {
            super.onFinished();
            MomentDetailHeaderBottomView.this.f2433X0 = false;
            if (!xdl0.O0(MomentDetailHeaderBottomView.this.f2396E0)) {
                this.f2471a.setVisibility(0);
            }
            Animator animatorP = bt0.p(this.f2472b, "alpha", 0L, 250L, new LinearInterpolator(), new float[]{1.0f, 0.0f});
            final SVGAnimationView sVGAnimationView = this.f2472b;
            bt0.f(animatorP, new Runnable() { // from class: l.yc00
                @Override // java.lang.Runnable
                public final void run() {
                    this.f15396a.m4239b(sVGAnimationView);
                }
            });
            animatorP.start();
        }

        public void onStart() {
            super.onStart();
            MomentDetailHeaderBottomView.this.f2433X0 = true;
            this.f2471a.setVisibility(4);
        }
    }

    public MomentDetailHeaderBottomView(Context context) {
        super(context);
        this.f2426T0 = false;
        this.f2428U0 = 0;
        this.f2434Y0 = null;
        this.f2435Z0 = false;
        this.f2439b1 = false;
        this.f2441c1 = false;
    }

    /* JADX INFO: renamed from: E */
    public static void m4165E(Moment moment, GroupIdBox groupIdBox) {
        p6j0.m12915e("e_circle_tag", "p_user_moment_interactions_details_view", vwb.Y("circle_id", groupIdBox.f684id), vwb.Y("moment_id", ((DbObject) moment).id));
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m4169d(Throwable th) {
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ boolean m4174i(View view, MotionEvent motionEvent) {
        return true;
    }

    private void setUserViewsHistoryVisitiby(boolean z) {
        xdl0.M(this.f2458q, z);
        xdl0.M(this.f2456p, z);
        xdl0.M(this.f2455o, z);
    }

    /* JADX INFO: renamed from: z */
    public static void m4185z(Moment moment, GroupIdBox groupIdBox) {
        p6j0.m12913c("e_circle_tag", "p_user_moment_interactions_details_view", vwb.Y("circle_id", groupIdBox.f684id), vwb.Y("moment_id", ((DbObject) moment).id));
    }

    /* JADX INFO: renamed from: A */
    public final void m4186A() {
        View viewM9560h = new dqg.C2364a(m4232u(), this.f2416O0.getTopicList(), this.f2446g).m9562j("p_user_moment_interactions_details_view").m9560h();
        this.f2412M0 = viewM9560h;
        if (NullChecker.a(viewM9560h)) {
            xdl0.X(this.f2412M0, (nkg.m12204C0() && NullChecker.a(this.f2416O0) && !vwb.J(this.f2416O0.mediaRepeatIndexList)) ? t100.d(4.0f) : t100.d(12.0f));
        }
        m4233v();
    }

    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public final void m4205U(final ImageView imageView, FeedAutoScrollTextView feedAutoScrollTextView, final boolean z) {
        this.f2420Q0.mo10746s(this.f2416O0).subscribe(mkd0.H(new e30() { // from class: l.nc00
            public final void call(Object obj) {
                this.f10736a.m4199O(z, (Envelope) obj);
            }
        }, new e30() { // from class: l.oc00
            public final void call(Object obj) {
                this.f11418a.m4200P(z, imageView, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: C */
    public final void m4188C(Moment moment) {
        if (moment == null || TextUtils.isEmpty(moment.simpleActivity.name)) {
            return;
        }
        p6j0.m12915e("e_activity_moment", "p_user_moment_interactions_details_view", vwb.Y("activity_id", moment.simpleActivity.f696id), vwb.Y("activity_name", moment.simpleActivity.name), vwb.Y("moment_show_type", "text_and_url"), vwb.Y("moments_user_id", moment.owner));
    }

    /* JADX INFO: renamed from: D */
    public final void m4189D(Moment moment) {
        if (moment == null || TextUtils.isEmpty(moment.simpleActivity.name)) {
            return;
        }
        p6j0.m12915e("e_activity_moment", "p_user_moment_interactions_details_view", vwb.Y("activity_id", moment.simpleActivity.f696id), vwb.Y("activity_name", moment.simpleActivity.name), vwb.Y("moment_show_type", "text_and_url"), vwb.Y("moments_user_id", moment.owner));
    }

    /* JADX INFO: renamed from: F */
    public final void m4190F() {
        m4230t(this);
        this.f2423S = this.f2440c;
        this.f2425T = this.f2453m;
        this.f2431W = this.f2460s;
        this.f2451k0 = this.f2461t;
        this.f2457p0 = this.f2463v;
        this.f2396E0 = this.f2464w;
        FeedAutoScrollTextView feedAutoScrollTextView = this.f2465x;
        this.f2398F0 = feedAutoScrollTextView;
        this.f2400G0 = this.f2466y;
        this.f2402H0 = this.f2391A;
        this.f2404I0 = this.f2407K;
        this.f2427U = this.f2454n;
        if (NullChecker.a(feedAutoScrollTextView)) {
            this.f2398F0.setTextColor(m4232u().getResources().getColor(e1c0.f7141g0));
            this.f2398F0.setTextSize(12.0f);
        }
        setLikeCommentRightMargin(f2388f1);
        this.f2457p0.setImageTintList(null);
        this.f2393C.setImageTintList(null);
        this.f2467z.setImageTintList(null);
        this.f2395E.setImageTintList(null);
    }

    /* JADX INFO: renamed from: G */
    public CharSequence m4191G(String str) {
        return !TextUtils.isEmpty(str) ? qmf0.m13586a(str) : this.f2416O0.value;
    }

    /* JADX INFO: renamed from: H */
    public void m4192H(Act act) {
        act.duringCreated(FeedModule.f316d.m16423B7(this.f2416O0.group.f684id)).subscribe(mkd0.H(new e30() { // from class: l.tc00
            public final void call(Object obj) {
                this.f13254a.m4201Q((Envelope) obj);
            }
        }, new e30() { // from class: l.uc00
            public final void call(Object obj) {
                MomentDetailHeaderBottomView.m4169d((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: I */
    public SVGAnimationView m4193I(View view, float f, float f2) {
        View sVGAnimationView = new SVGAnimationView(m4232u());
        Rect rect = new Rect();
        Rect rect2 = new Rect();
        view.getGlobalVisibleRect(rect);
        getGlobalVisibleRect(rect2);
        addView(sVGAnimationView);
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) sVGAnimationView.getLayoutParams();
        int width = view.getWidth() * 2;
        int height = view.getHeight() * 2;
        layoutParams.width = width;
        layoutParams.height = height;
        sVGAnimationView.setLayoutParams(layoutParams);
        sVGAnimationView.setY((((rect.top - rect2.top) + ((getHeight() + rect2.top) - rect2.bottom)) - ((view.getHeight() + rect.top) - rect.bottom)) + ((view.getHeight() - height) / 2) + f2);
        sVGAnimationView.setX(rect.left + ((view.getWidth() - width) / 2) + f);
        return sVGAnimationView;
    }

    /* JADX INFO: renamed from: J */
    public String m4194J(Group group) {
        if (m4195K(group) == 0) {
            return "";
        }
        return vqg.m15537r(m4195K(group)) + group.state;
    }

    /* JADX INFO: renamed from: K */
    public int m4195K(Group group) {
        return group.userCounter;
    }

    /* JADX INFO: renamed from: L */
    public final void m4196L(int i) {
        xdl0.M(this.f2451k0, true);
        this.f2398F0.clearAnimation();
        FeedAutoScrollTextView feedAutoScrollTextView = this.f2398F0;
        if (i > 0) {
            feedAutoScrollTextView.setText(i0g0.h0(i));
        } else {
            feedAutoScrollTextView.setText(m4232u().getString(R$string.f548k));
        }
        this.f2400G0.setVisibility(0);
        int i2 = this.f2416O0.messages.count;
        if (i2 == 0 || vqg.m15506b0(this.f2414N0)) {
            this.f2421R.setVisibility(8);
            xdl0.c0(this.f2436a, t100.d(10.0f));
        } else {
            this.f2421R.setVisibility(0);
            xdl0.c0(this.f2436a, t100.d(4.0f));
        }
        TextView textView = this.f2402H0;
        if (i2 > 0) {
            textView.setText(i0g0.h0(i2));
        } else {
            textView.setText(R$string.f499d);
        }
        m4221k0(this.f2416O0.haveLiked, this.f2457p0);
        this.f2451k0.setOnClickListener(new View.OnClickListener() { // from class: l.jc00
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f9309a.m4203S(view);
            }
        });
        xdl0.E0(this.f2399G, new View.OnClickListener() { // from class: l.kc00
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f9671a.m4204T(view);
            }
        });
        this.f2400G0.setOnClickListener(new View.OnClickListener() { // from class: l.lc00
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f10001a.m4202R(view);
            }
        });
    }

    /* JADX INFO: renamed from: M */
    public final boolean m4197M(Moment moment) {
        MomentViewerBox momentViewerBox;
        int i;
        if (moment == null || (momentViewerBox = moment.momentViewer) == null) {
            return false;
        }
        try {
            i = momentViewerBox.count;
        } catch (Exception e) {
            CrashHelper.c(e);
            i = -1;
        }
        return moment.views == i;
    }

    /* JADX INFO: renamed from: N */
    public boolean m4198N(Moment moment) {
        if (moment == null || !moment.shareMyVote || vwb.J(moment.getTopicList()) || vwb.J(moment.getTopicList().get(0).options)) {
            return false;
        }
        for (int i = 0; i < moment.getTopicList().get(0).options.size(); i++) {
            if (moment.getTopicList().get(0).options.get(i).haveliked) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: O */
    public final /* synthetic */ void m4199O(boolean z, Envelope envelope) {
        if (NullChecker.a(this.f2410L0) && this.f2416O0.haveLiked) {
            this.f2410L0.call();
        }
        zi60.m17436w().m17454k(this.f2416O0, this.f2418P0, 201, z);
        this.f2416O0 = this.f2420Q0.mo10752y(((DbObject) this.f2416O0).id);
        Object obj = this.f2420Q0;
        if (obj instanceof n900) {
            ((n900) obj).mo9081c();
        }
        if (this.f2416O0.haveLiked && m4228r0(this.f2418P0)) {
            m4227q0();
        }
    }

    /* JADX INFO: renamed from: P */
    public final /* synthetic */ void m4200P(boolean z, ImageView imageView, Throwable th) {
        zi60.m17436w().m17455l(this.f2416O0, this.f2418P0, th, z);
        t2h.m14427g(th);
        m4221k0(this.f2416O0.haveLiked, imageView);
        m4220j0(z);
    }

    /* JADX INFO: renamed from: Q */
    public final /* synthetic */ void m4201Q(Envelope envelope) {
        if (((FeedData) envelope.data.getModuleData(FeedData.class)).groups.size() == 0) {
            return;
        }
        m4218h0(((FeedData) envelope.data.getModuleData(FeedData.class)).groups.get(0));
    }

    /* JADX INFO: renamed from: R */
    public final /* synthetic */ void m4202R(View view) {
        if (this.f2422R0) {
            lsi0.h(R$string.f503d3);
        } else if (vqg.m15506b0(this.f2414N0)) {
            lsi0.h(R$string.f550k1);
        } else {
            j2i.m11067a(this.f2416O0, this.f2418P0);
            ((n900) this.f2420Q0).mo9083f();
        }
    }

    /* JADX INFO: renamed from: S */
    public final /* synthetic */ void m4203S(View view) {
        if (vqg.m15506b0(this.f2414N0)) {
            lsi0.j("由于隐私设置，该动态不支持陌生人点赞");
        } else {
            m4213c0(this.f2416O0, this.f2457p0, this.f2398F0);
        }
    }

    /* JADX INFO: renamed from: T */
    public final /* synthetic */ void m4204T(View view) {
        this.f2392B.performClick();
    }

    /* JADX INFO: renamed from: V */
    public final /* synthetic */ void m4206V(SpannableStringBuilder spannableStringBuilder, URLSpan[] uRLSpanArr, View view) {
        m4232u().startActivity(kjb0.m11458j(m4232u(), spannableStringBuilder.toString(), uRLSpanArr[0].getURL()));
        m4188C(this.f2416O0);
        if (TextUtils.isEmpty(this.f2416O0.simpleActivity.name)) {
            p6j0.m12913c("e_campaign_quiz", "p_user_moment_interactions_details_view", vwb.Y("moment_id", ((DbObject) this.f2416O0).id), vwb.Y("moment_type", zi60.m17436w().m17467y(this.f2416O0)), vwb.Y("actor_user_id", this.f2416O0.owner));
        }
    }

    /* JADX INFO: renamed from: W */
    public final /* synthetic */ void m4207W(View view) {
        Moment moment = this.f2416O0;
        if (moment.views == 0 || vwb.J(moment.momentViewer.viewers) || this.f2416O0 == null) {
            return;
        }
        Act actM4232u = m4232u();
        Moment moment2 = this.f2416O0;
        kyg.m11535d(actM4232u, "p_user_moment_interactions_details_view", ((DbObject) moment2).id, this.f2418P0, m4197M(moment2));
    }

    /* JADX INFO: renamed from: X */
    public final /* synthetic */ void m4208X(View view) {
        view.setOnClickListener(new View.OnClickListener() { // from class: l.vc00
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f14142a.m4207W(view2);
            }
        });
    }

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ void m4209Y(View view) {
        Moment moment = this.f2416O0;
        hx60 hx60Var = this.f2420Q0;
        Objects.requireNonNull(hx60Var);
        vwi.m15601P(moment, new ic00(hx60Var), this.f2420Q0.mo10741m(this.f2416O0.owner), m4232u(), this.f2418P0, true);
    }

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ void m4210Z() {
        this.f2441c1 = true;
        this.f2443d1 = vqg.m15497U(FeedModule.m1140H().Zj(((DbObject) this.f2414N0).id));
        this.f2414N0 = FeedModule.f316d.m16628e8(((DbObject) this.f2414N0).id);
        if (NullChecker.a(this.f2416O0)) {
            this.f2443d1 = this.f2443d1 && !vs0.m15566d(this.f2416O0);
        }
        m4236y();
    }

    /* JADX INFO: renamed from: a0 */
    public final /* synthetic */ void m4211a0(Boolean bool) {
        e51.H(m4232u(), new Runnable() { // from class: l.wc00
            @Override // java.lang.Runnable
            public final void run() {
                this.f14501a.m4210Z();
            }
        }, this.f2441c1 ? 1000L : 0L);
    }

    /* JADX INFO: renamed from: b0 */
    public final /* synthetic */ void m4212b0(View view) {
        boolean z = xdl0.O0(this.f2399G) && TextUtils.equals(this.f2403I.getText().toString(), "通过动态打招呼，更容易得到回复");
        if (TextUtils.equals(this.f2394D.getText().toString(), m4232u().getString(R$string.f419Q0))) {
            zi60.m17436w().m17462s(this.f2416O0, "p_user_moment_interactions_details_view", true, z);
            FeedModule.f315c.m1650f3(m4232u(), this.f2414N0, this.f2416O0, "p_user_moment_interactions_details_view", this.f2408K0);
        } else {
            zi60.m17436w().m17462s(this.f2416O0, "p_user_moment_interactions_details_view", false, z);
            if (NullChecker.a(this.f2414N0)) {
                m4232u().startActivity(kjb0.m11451c(m4232u(), ((DbObject) this.f2414N0).id, false, false));
            }
        }
    }

    /* JADX INFO: renamed from: c0 */
    public final void m4213c0(Moment moment, final ImageView imageView, final FeedAutoScrollTextView feedAutoScrollTextView) {
        final boolean z = moment.haveLiked;
        if (m4229s0(this.f2418P0, moment) && z) {
            q31.m13372a(m4232u(), "p_user_moment_interactions_details_view", moment, yih.m17138l().m17140f());
            return;
        }
        d30 d30Var = new d30() { // from class: l.mc00
            public final void call() {
                this.f10422a.m4205U(imageView, feedAutoScrollTextView, z);
            }
        };
        this.f2424S0 = d30Var;
        d30Var.call();
        PartialIdList partialIdList = moment.likes;
        int iMax = Math.max(partialIdList.count, partialIdList.ids.size());
        if (z) {
            FeedAutoScrollTextView feedAutoScrollTextView2 = this.f2398F0;
            if (iMax == 1) {
                feedAutoScrollTextView2.m7465h(m4232u().getString(R$string.f548k), false);
            } else {
                feedAutoScrollTextView2.m7465h(i0g0.h0(iMax - 1), false);
            }
        } else {
            SVGAnimationView sVGAnimationViewM4193I = m4193I(imageView, 0.0f, t100.d(1.3f));
            this.f2451k0.setEnabled(false);
            sVGAnimationViewM4193I.setVisibility(0);
            SVGALoader.with(m4232u()).from("feed_like_newui.svga").autoPlay(true).repeatCount(1).animListener(new C2107c(imageView, sVGAnimationViewM4193I)).into(sVGAnimationViewM4193I);
            FeedAutoScrollTextView feedAutoScrollTextView3 = this.f2398F0;
            if (iMax == 0) {
                feedAutoScrollTextView3.m7465h("1", true);
            } else {
                feedAutoScrollTextView3.m7465h(i0g0.h0(iMax + 1), true);
            }
        }
        m4221k0(!moment.haveLiked, imageView);
    }

    /* JADX INFO: renamed from: d0 */
    public void m4214d0() {
        erl centerVieoView = getCenterVieoView();
        if (centerVieoView != null) {
            centerVieoView.pause();
        }
    }

    /* JADX INFO: renamed from: e0 */
    public void m4215e0() {
        erl centerVieoView = getCenterVieoView();
        if (centerVieoView != null) {
            centerVieoView.play();
            centerVieoView.mute(true);
        }
    }

    /* JADX INFO: renamed from: f0 */
    public void m4216f0(hx60 hx60Var, Moment moment, String str, boolean z, boolean z2, d30 d30Var, boolean z3) {
        this.f2420Q0 = hx60Var;
        this.f2416O0 = moment;
        this.f2418P0 = str;
        this.f2422R0 = z;
        this.f2406J0 = z2;
        this.f2408K0 = z3;
        this.f2410L0 = d30Var;
        if (nkg.m12254n0() && !this.f2439b1 && m4198N(moment)) {
            this.f2439b1 = true;
            p6j0.m12915e("e_moment_post", "p_user_moment_interactions_details_view", new j760("topic_id", moment.getTopicList().get(0).f708id));
        }
        m4217g0();
        if (NullChecker.a(this.f2448i)) {
            xdl0.M(this.f2448i, false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: g0 */
    public void m4217g0() {
        MomentShareInfo momentShareInfo;
        xdl0.M(this, this.f2416O0 != null);
        Moment moment = this.f2416O0;
        if (moment == null) {
            return;
        }
        if (this.f2423S == null) {
            MomentDetailHeaderBottomViewNullException.reportContentViewNull(moment);
            return;
        }
        this.f2414N0 = this.f2420Q0.mo10741m(moment.owner);
        m4191G(this.f2416O0.momentValue);
        if (!NullChecker.a(this.f2414N0)) {
            CrashHelper.d(new Exception("MomentDetailHeaderBottomView renderDetail user = null id:" + this.f2416O0.owner + ",from:" + this.f2418P0 + ",momentid:" + ((DbObject) this.f2416O0).id), 10000);
        } else if (TextUtils.isEmpty(this.f2416O0.value)) {
            this.f2423S.setVisibility(8);
        } else {
            String str = this.f2414N0.name;
            String str2 = str + "：" + this.f2416O0.value;
            SpannableString spannableString = new SpannableString(str2);
            spannableString.setSpan(new ForegroundColorSpan(getResources().getColor(e1c0.f7137e0)), 0, (str + "：").length(), 33);
            spannableString.setSpan(new ForegroundColorSpan(getResources().getColor(e1c0.f7133c0)), (str + "：").length(), str2.length(), 33);
            this.f2423S.setText(spannableString);
            this.f2423S.setVisibility(0);
        }
        if (NullChecker.a(this.f2446g)) {
            this.f2446g.removeAllViews();
        }
        if (NullChecker.a(this.f2437a1)) {
            this.f2423S.setVisibility(8);
            xdl0.M(this.f2444e, false);
            xdl0.M(this.f2445f, false);
            xdl0.f0(this.f2446g, t100.d(8.0f));
            this.f2442d.setVisibility(8);
            this.f2437a1.m15811f(this.f2418P0);
            this.f2437a1.mo8538c(this.f2446g, m4232u(), this.f2416O0);
        } else {
            boolean zIsEmpty = TextUtils.isEmpty(this.f2416O0.hyperlink);
            VText vText = this.f2444e;
            if (zIsEmpty) {
                xdl0.M(vText, false);
            } else {
                xdl0.M(vText, true);
                m4189D(this.f2416O0);
                Spanned spannedFromHtml = Html.fromHtml(this.f2416O0.hyperlink);
                final SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(spannedFromHtml);
                final URLSpan[] uRLSpanArr = (URLSpan[]) spannableStringBuilder.getSpans(0, spannedFromHtml.length(), URLSpan.class);
                this.f2444e.setText(spannableStringBuilder.toString());
                if (uRLSpanArr != null && uRLSpanArr.length > 0) {
                    xdl0.E0(this.f2444e, new View.OnClickListener() { // from class: l.pc00
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            this.f11786a.m4206V(spannableStringBuilder, uRLSpanArr, view);
                        }
                    });
                }
            }
            MomentAdditionalData momentAdditionalData = this.f2416O0.additionalData;
            if (momentAdditionalData == null || (momentShareInfo = momentAdditionalData.share) == null || momentShareInfo.isMomentShareEmpty()) {
                xdl0.M(this.f2445f, false);
            } else {
                xdl0.M(this.f2445f, true);
                FeedSharelinkView feedSharelinkView = this.f2445f;
                Moment moment2 = this.f2416O0;
                feedSharelinkView.m6334f(moment2.additionalData.share, "p_user_moment_interactions_details_view", ((DbObject) moment2).id, moment2.owner);
            }
        }
        if (!nkg.m12254n0() || !NullChecker.a(this.f2416O0) || !this.f2416O0.shareMyVote) {
            m4186A();
        }
        User user = this.f2414N0;
        if (user == null || !vqg.m15530n0(user)) {
            this.f2430V0 = m4234w();
        }
        if (NullChecker.a(this.f2430V0)) {
            xdl0.X(this.f2431W, t100.d(9.0f));
        } else if (nkg.m12226X()) {
            xdl0.X(this.f2431W, t100.d(20.0f));
        }
        m4222l0();
        int childCount = this.f2446g.getChildCount();
        VLinear vLinear = this.f2446g;
        if (childCount == 0) {
            vLinear.setVisibility(8);
        } else {
            vLinear.setVisibility(0);
        }
        erl centerVieoView = getCenterVieoView();
        PlayerView playerView = centerVieoView != null ? centerVieoView.getPlayerView() : null;
        if (playerView != null) {
            playerView.m7763x(new C2105a());
        }
        if (NullChecker.a(this.f2452l)) {
            this.f2452l.setText(m4235x(mqi0.G(this.f2416O0.createdTime)));
        }
        m4223m0(this.f2416O0);
        vwb.z(vwb.f0(new View[]{this.f2456p, this.f2458q, this.f2459r}), new e30() { // from class: l.qc00
            public final void call(Object obj) {
                this.f12204a.m4208X((View) obj);
            }
        });
        xdl0.M(this.f2449j, xdl0.O0(this.f2450k) || xdl0.O0(this.f2452l) || xdl0.O0(this.f2425T));
        if (NullChecker.a(this.f2395E)) {
            this.f2395E.setVisibility(0);
            this.f2395E.setOnClickListener(new View.OnClickListener() { // from class: l.rc00
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f12588a.m4209Y(view);
                }
            });
            if (vqg.m15498V(this.f2416O0)) {
                this.f2395E.setVisibility(8);
            }
        }
        List<Media> list = this.f2416O0.media;
        if (list == null || list.size() == 0) {
            xdl0.M(this.f2423S, false);
        }
        PartialIdList partialIdList = this.f2416O0.likes;
        m4196L(Math.max(partialIdList.count, partialIdList.ids.size()));
        if (NullChecker.b(this.f2427U)) {
            this.f2427U.setVisibility(8);
        }
        if (NullChecker.b(this.f2416O0)) {
            Moment moment3 = this.f2416O0;
            zi60.m17436w();
            moment3.setMomentShowFrom(zi60.m17435D(this.f2418P0));
        }
        if (NullChecker.a(this.f2397F)) {
            xdl0.M(this.f2397F, false);
        }
        if (!nkg.m12217O() || !NullChecker.a(this.f2416O0) || this.f2416O0.isAnonymousMoment() || TextUtils.isEmpty(this.f2416O0.group.f684id)) {
            xdl0.M(this.f2409L, false);
        } else {
            xdl0.M(this.f2409L, true);
            TextPaint paint = this.f2413N.getPaint();
            if (NullChecker.a(paint)) {
                paint.setFakeBoldText(true);
            }
            this.f2413N.setText(this.f2416O0.group.name);
            m4219i0(m4232u());
            if (!this.f2426T0) {
                Moment moment4 = this.f2416O0;
                m4165E(moment4, moment4.group);
                this.f2426T0 = true;
            }
            xdl0.E0(this.f2409L, new ViewOnClickListenerC2106b());
        }
        if (!u2h.m14716a()) {
            m4236y();
        } else if (NullChecker.a(this.f2414N0)) {
            m4232u().duringCreated(ovi.m12869b(((DbObject) this.f2414N0).id)).first().subscribe(mkd0.G(new e30() { // from class: l.sc00
                public final void call(Object obj) {
                    this.f12881a.m4211a0((Boolean) obj);
                }
            }));
        }
        m4226p0();
    }

    public erl getCenterVieoView() {
        VLinear vLinear = this.f2446g;
        if (vLinear != null && vLinear.getChildCount() > 0) {
            Object childAt = this.f2446g.getChildAt(0);
            if (NullChecker.a(childAt) && (childAt instanceof FeedCenterVideoView)) {
                return (FeedCenterVideoView) childAt;
            }
            if (NullChecker.a(childAt) && (childAt instanceof FeedCenterForwardVideoView)) {
                return (FeedCenterForwardVideoView) childAt;
            }
        }
        return null;
    }

    public wf00 getMomentHeaderInsertProxy() {
        return this.f2437a1;
    }

    /* JADX INFO: renamed from: h0 */
    public void m4218h0(Group group) {
        if (group == null) {
            return;
        }
        String strM4194J = m4194J(group);
        boolean zIsEmpty = TextUtils.isEmpty(strM4194J);
        VText vText = this.f2415O;
        if (zIsEmpty) {
            vText.setVisibility(8);
        } else {
            vText.setVisibility(0);
            this.f2415O.setText(strM4194J);
        }
    }

    /* JADX INFO: renamed from: i0 */
    public void m4219i0(Act act) {
        if (!NullChecker.a(this.f2416O0) || TextUtils.isEmpty(this.f2416O0.group.f684id)) {
            return;
        }
        Group groupM16739u7 = FeedModule.f316d.m16739u7(this.f2416O0.group.f684id);
        if (NullChecker.a(groupM16739u7)) {
            m4218h0(groupM16739u7);
        } else {
            m4192H(act);
        }
    }

    /* JADX INFO: renamed from: j0 */
    public final void m4220j0(boolean z) {
        this.f2398F0.clearAnimation();
        FeedAutoScrollTextView feedAutoScrollTextView = this.f2398F0;
        if (z) {
            boolean zEquals = TextUtils.equals(feedAutoScrollTextView.getText(), m4232u().getString(R$string.f548k));
            FeedAutoScrollTextView feedAutoScrollTextView2 = this.f2398F0;
            if (zEquals) {
                feedAutoScrollTextView2.m7465h("1", true);
                return;
            } else {
                feedAutoScrollTextView2.m7465h(i0g0.h0(Integer.parseInt(feedAutoScrollTextView2.getText()) + 1), true);
                return;
            }
        }
        boolean zEquals2 = TextUtils.equals(feedAutoScrollTextView.getText(), "1");
        FeedAutoScrollTextView feedAutoScrollTextView3 = this.f2398F0;
        if (zEquals2) {
            feedAutoScrollTextView3.m7465h(m4232u().getString(R$string.f548k), false);
        } else {
            feedAutoScrollTextView3.m7465h(i0g0.h0(Integer.parseInt(feedAutoScrollTextView3.getText()) - 1), false);
        }
    }

    /* JADX INFO: renamed from: k0 */
    public final void m4221k0(boolean z, ImageView imageView) {
        int i;
        if (!z) {
            xdl0.M(imageView, true);
            xdl0.M(this.f2396E0, false);
            this.f2398F0.setTextColor(m4232u().getResources().getColor(e1c0.f7112K));
            imageView.setImageResource(f3c0.f7775c3);
            imageView.setImageTintList(null);
            return;
        }
        if (!m4229s0(this.f2418P0, this.f2416O0)) {
            if (!this.f2433X0) {
                xdl0.M(imageView, true);
            }
            xdl0.M(this.f2396E0, false);
            this.f2398F0.setTextColor(m4232u().getResources().getColor(e1c0.f7154n));
            imageView.setImageResource(f3c0.f7744Y2);
            imageView.setImageTintList(null);
            return;
        }
        String strM17144j = yih.m17138l().m17144j(this.f2416O0.attitudeId);
        if (!xdl0.O0(imageView) && ((i = this.f2428U0) == this.f2416O0.attitudeId || i <= 0)) {
            xdl0.M(imageView, false);
            xdl0.M(this.f2396E0, true);
            if (!TextUtils.isEmpty(strM17144j)) {
                qib0.G.L0(this.f2396E0, strM17144j);
            }
            this.f2428U0 = this.f2416O0.attitudeId;
            return;
        }
        xdl0.M(imageView, false);
        xdl0.M(this.f2396E0, true);
        if (!TextUtils.isEmpty(strM17144j)) {
            qib0.G.L0(this.f2396E0, strM17144j);
            yih.m17138l().m17147n(this.f2396E0, this.f2462u);
        }
        this.f2428U0 = this.f2416O0.attitudeId;
    }

    /* JADX INFO: renamed from: l0 */
    public final void m4222l0() {
        MessageLocation messageLocation = this.f2416O0.location;
        if (messageLocation == null || TextUtils.isEmpty(messageLocation.name)) {
            this.f2425T.setVisibility(8);
            return;
        }
        zvf0.A("e_moment_poi_tag", "p_user_moment_interactions_details_view", new j760[]{vwb.Y("poiname", this.f2425T.getText())});
        this.f2425T.setVisibility(0);
        this.f2425T.setText(this.f2416O0.location.name);
    }

    /* JADX INFO: renamed from: m0 */
    public final void m4223m0(Moment moment) {
        if (!nkg.m12222T() || !((DbObject) ijb0.m10892C()).id.equals(moment.owner)) {
            xdl0.M(this.f2459r, false);
            setUserViewsHistoryVisitiby(false);
            return;
        }
        xdl0.M(this.f2450k, false);
        setUserViewsHistoryVisitiby(true);
        m4224n0();
        ArrayList arrayListF0 = vwb.f0(new String[0]);
        if (NullChecker.a(moment) && NullChecker.a(moment.momentViewer) && !vwb.J(moment.momentViewer.viewers)) {
            int iMin = Math.min(3, moment.momentViewer.viewers.size());
            for (int i = 0; i < iMin; i++) {
                arrayListF0.add(moment.momentViewer.viewers.get(i).userId);
            }
        }
        Collections.reverse(arrayListF0);
        xdl0.V(this.f2458q, vwb.J(arrayListF0) ? 0 : t100.d(4.0f));
        this.f2456p.m7536n0(arrayListF0, false);
    }

    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: n0 */
    public final void m4224n0() {
        Moment moment = this.f2416O0;
        if (moment == null || moment.views == 0) {
            xdl0.M(this.f2459r, false);
            this.f2458q.setText("0浏览");
        }
        if (NullChecker.a(this.f2416O0) && NullChecker.a(this.f2416O0.momentViewer) && !vwb.J(this.f2416O0.momentViewer.viewers)) {
            xdl0.M(this.f2459r, true);
        } else {
            xdl0.M(this.f2459r, false);
        }
        this.f2458q.setText(i0g0.i0(this.f2416O0.views) + "浏览");
    }

    /* JADX INFO: renamed from: o0 */
    public void m4225o0() {
        if (this.f2443d1 && !vqg.m15530n0(this.f2414N0) && this.f2406J0) {
            zi60.m17436w().m17463t(this.f2416O0, "p_user_moment_interactions_details_view", false, false);
        } else {
            if (!this.f2406J0 || vqg.m15530n0(this.f2414N0)) {
                return;
            }
            zi60.m17436w().m17463t(this.f2416O0, "p_user_moment_interactions_details_view", true, false);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m4190F();
        if (NullChecker.a(this.f2429V)) {
            this.f2429V.setVisibility(8);
        }
        this.f2431W.setVisibility(0);
        this.f2404I0.setOnTouchListener(new View.OnTouchListener() { // from class: l.hc00
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return MomentDetailHeaderBottomView.m4174i(view, motionEvent);
            }
        });
        this.f2452l.setVisibility(8);
    }

    /* JADX INFO: renamed from: p0 */
    public void m4226p0() {
        vqg.m15478G0(this.f2392B, new View.OnClickListener() { // from class: l.xc00
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f14861a.m4212b0(view);
            }
        });
    }

    /* JADX INFO: renamed from: q0 */
    public final void m4227q0() {
        int[] iArr = new int[2];
        this.f2402H0.getLocationOnScreen(iArr);
        Point point = new Point();
        int iD = iArr[1] - t100.d(125.0f);
        if (iD < xdl0.F0() + t100.d(44.0f) + t100.d(12.0f)) {
            iD = iArr[1] - t100.d(10.0f);
        }
        point.y = iD;
        point.x = 0;
        new upg(m4232u(), point, this.f2416O0, "p_user_moment_interactions_details_view").m15128a(this.f2402H0);
    }

    /* JADX INFO: renamed from: r0 */
    public final boolean m4228r0(String str) {
        return nkg.m12226X() && TextUtils.equals(str, "from_discover_discussion");
    }

    /* JADX INFO: renamed from: s0 */
    public final boolean m4229s0(String str, Moment moment) {
        return nkg.m12226X() && TextUtils.equals(str, "from_discover_discussion") && moment.attitudeId > 0;
    }

    public void setLikeCommentRightMargin(int i) {
        if (this.f2431W.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f2431W.getLayoutParams();
            marginLayoutParams.rightMargin = i;
            this.f2431W.setLayoutParams(marginLayoutParams);
        }
    }

    public void setMomentHeaderInsertProxy(wf00 wf00Var) {
        this.f2437a1 = wf00Var;
    }

    /* JADX INFO: renamed from: t */
    public final void m4230t(View view) {
        zc00.m17301a(this, view);
    }

    /* JADX INFO: renamed from: t0 */
    public void m4231t0() {
        erl centerVieoView = getCenterVieoView();
        if (centerVieoView != null) {
            centerVieoView.stop();
        }
    }

    /* JADX INFO: renamed from: u */
    public final Act m4232u() {
        return getContext();
    }

    /* JADX INFO: renamed from: v */
    public final void m4233v() {
        if (this.f2434Y0 == null) {
            this.f2434Y0 = new FeedInteractiveView(this.f2446g.getContext());
        }
        this.f2434Y0.m5664P(m4232u(), this.f2416O0, "", "p_user_moment_interactions_details_view", false, t100.j);
        this.f2446g.addView(this.f2434Y0);
        if (this.f2435Z0) {
            return;
        }
        this.f2435Z0 = true;
        this.f2434Y0.m5666R();
    }

    /* JADX INFO: renamed from: w */
    public View m4234w() {
        if (!m4228r0(this.f2418P0) || this.f2420Q0 == null) {
            return null;
        }
        if (!this.f2432W0) {
            p6j0.m12915e("e_attitude_guide", "p_user_moment_interactions_details_view", new j760[0]);
            this.f2432W0 = true;
        }
        return new bqg.C2345a(m4232u(), this.f2446g).m9021k(this.f2420Q0).m9019i(this.f2416O0).m9020j("p_user_moment_interactions_details_view").m9018h(true).m9017g();
    }

    /* JADX INFO: renamed from: x */
    public final String m4235x(String str) {
        return str + f2387e1;
    }

    /* JADX INFO: renamed from: y */
    public final void m4236y() {
        setLikeCommentRightMargin(f2388f1);
        xdl0.M(this.f2392B, false);
        s7i.m14037c(this.f2400G0, this.f2467z, this.f2402H0);
        s7i.m14038d(this.f2451k0, this.f2400G0, this.f2457p0, null, this.f2398F0, this.f2418P0);
        s7i.m14039e(this.f2395E);
        if (u2h.m14721f() && NullChecker.a(this.f2416O0) && !TextUtils.equals(this.f2416O0.owner, FeedModule.m1139F().userId())) {
            if (TextUtils.equals(this.f2418P0, "from_discover_dating") || TextUtils.equals(this.f2418P0, "from_like") || TextUtils.equals(this.f2418P0, "from_album") || TextUtils.equals(this.f2418P0, "from_nearby_falls_feed") || TextUtils.equals(this.f2418P0, "from_discover_discussion") || TextUtils.equals(this.f2418P0, "from_nearby_focus") || TextUtils.equals(this.f2418P0, "from_activity_tab_one") || TextUtils.equals(this.f2418P0, "from_activity_tab_two")) {
                this.f2395E.setImageResource(f3c0.f7732W4);
            }
        }
    }

    public MomentDetailHeaderBottomView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2426T0 = false;
        this.f2428U0 = 0;
        this.f2434Y0 = null;
        this.f2435Z0 = false;
        this.f2439b1 = false;
        this.f2441c1 = false;
    }

    public MomentDetailHeaderBottomView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2426T0 = false;
        this.f2428U0 = 0;
        this.f2434Y0 = null;
        this.f2435Z0 = false;
        this.f2439b1 = false;
        this.f2441c1 = false;
    }
}
