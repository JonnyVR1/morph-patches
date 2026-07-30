package com.p046p1.mobile.putong.feed.newui.photoalbum;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.data.Envelope;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.MessageLocation;
import com.p046p1.mobile.putong.data.PartialIdList;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.R$string;
import com.p046p1.mobile.putong.feed.data.FeedData;
import com.p046p1.mobile.putong.feed.data.Group;
import com.p046p1.mobile.putong.feed.data.GroupIdBox;
import com.p046p1.mobile.putong.feed.data.Moment;
import com.p046p1.mobile.putong.feed.data.MomentAdditionalData;
import com.p046p1.mobile.putong.feed.data.MomentShareInfo;
import com.p046p1.mobile.putong.feed.data.MomentViewerBox;
import com.p046p1.mobile.putong.feed.helper.exception.MomentDetailHeaderBottomViewNullException;
import com.p046p1.mobile.putong.feed.newui.group.groupdetail.FeedGroupDetailAct;
import com.p046p1.mobile.putong.feed.newui.photoalbum.MomentDetailHeaderBottomView;
import com.p046p1.mobile.putong.feed.newui.photoalbum.feedbottom.insert.FeedInteractiveView;
import com.p046p1.mobile.putong.feed.newui.photoalbum.feedcenter.FeedCenterForwardVideoView;
import com.p046p1.mobile.putong.feed.newui.photoalbum.feedcenter.FeedCenterVideoView;
import com.p046p1.mobile.putong.feed.newui.photoalbum.view.FeedSharelinkView;
import com.p046p1.mobile.putong.feed.newui.topic.qatopic.QATopicPhotoAlbumTagView;
import com.p046p1.mobile.putong.feed.newui.view.FeedAutoScrollTextView;
import com.p046p1.mobile.putong.feed.newui.view.FeedUserHeaderView;
import com.p046p1.mobile.putong.feed.p060ui.PlayerView;
import com.tantan.library.svga.AnimListener;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.SVGAnimationView;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import com.tencent.p101mm.opensdk.constants.ConstantsAPI;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import p147v.VDraweeView;
import p147v.VFrame;
import p147v.VImage;
import p147v.VLinear;
import p147v.VRelative;
import p147v.VText;
import p147v.VText_Expandable;
import p149l.bqg;
import p149l.bt0;
import p149l.c680;
import p149l.d30;
import p149l.dqg;
import p149l.e1c0;
import p149l.e30;
import p149l.e51;
import p149l.erl;
import p149l.f3c0;
import p149l.hx60;
import p149l.i0g0;
import p149l.ic00;
import p149l.ijb0;
import p149l.j2i;
import p149l.j760;
import p149l.kjb0;
import p149l.kyg;
import p149l.lsi0;
import p149l.mkd0;
import p149l.mqi0;
import p149l.n900;
import p149l.nkg;
import p149l.ovi;
import p149l.p6j0;
import p149l.q31;
import p149l.qib0;
import p149l.qmf0;
import p149l.s7i;
import p149l.t100;
import p149l.t2h;
import p149l.u2h;
import p149l.upg;
import p149l.vqg;
import p149l.vs0;
import p149l.vwb;
import p149l.vwi;
import p149l.wf00;
import p149l.xdl0;
import p149l.yih;
import p149l.zc00;
import p149l.zi60;
import p149l.zvf0;

/* JADX INFO: loaded from: classes12.dex */
public class MomentDetailHeaderBottomView extends RelativeLayout {

    /* JADX INFO: renamed from: e1 */
    public static String f40926e1 = " ";

    /* JADX INFO: renamed from: f1 */
    public static final int f40927f1 = t100.m186890d(8.0f);

    /* JADX INFO: renamed from: g1 */
    public static final int f40928g1 = t100.m186890d(6.0f);

    /* JADX INFO: renamed from: h1 */
    public static final int f40929h1 = t100.m186890d(8.0f);

    /* JADX INFO: renamed from: A */
    public TextView f40930A;

    /* JADX INFO: renamed from: B */
    public VLinear f40931B;

    /* JADX INFO: renamed from: C */
    public VImage f40932C;

    /* JADX INFO: renamed from: D */
    public VText f40933D;

    /* JADX INFO: renamed from: E */
    public ImageView f40934E;

    /* JADX INFO: renamed from: E0 */
    public VDraweeView f40935E0;

    /* JADX INFO: renamed from: F */
    public VText f40936F;

    /* JADX INFO: renamed from: F0 */
    public FeedAutoScrollTextView f40937F0;

    /* JADX INFO: renamed from: G */
    public ConstraintLayout f40938G;

    /* JADX INFO: renamed from: G0 */
    public VLinear f40939G0;

    /* JADX INFO: renamed from: H */
    public VDraweeView f40940H;

    /* JADX INFO: renamed from: H0 */
    public TextView f40941H0;

    /* JADX INFO: renamed from: I */
    public VText f40942I;

    /* JADX INFO: renamed from: I0 */
    public VText f40943I0;

    /* JADX INFO: renamed from: J */
    public VImage f40944J;

    /* JADX INFO: renamed from: J0 */
    public boolean f40945J0;

    /* JADX INFO: renamed from: K */
    public VText f40946K;

    /* JADX INFO: renamed from: K0 */
    public boolean f40947K0;

    /* JADX INFO: renamed from: L */
    public ConstraintLayout f40948L;

    /* JADX INFO: renamed from: L0 */
    public d30 f40949L0;

    /* JADX INFO: renamed from: M */
    public VRelative f40950M;

    /* JADX INFO: renamed from: M0 */
    public View f40951M0;

    /* JADX INFO: renamed from: N */
    public VText f40952N;

    /* JADX INFO: renamed from: N0 */
    public User f40953N0;

    /* JADX INFO: renamed from: O */
    public VText f40954O;

    /* JADX INFO: renamed from: O0 */
    public Moment f40955O0;

    /* JADX INFO: renamed from: P */
    public VImage f40956P;

    /* JADX INFO: renamed from: P0 */
    public String f40957P0;

    /* JADX INFO: renamed from: Q */
    public View f40958Q;

    /* JADX INFO: renamed from: Q0 */
    public hx60 f40959Q0;

    /* JADX INFO: renamed from: R */
    public TextView f40960R;

    /* JADX INFO: renamed from: R0 */
    public boolean f40961R0;

    /* JADX INFO: renamed from: S */
    public VText_Expandable f40962S;

    /* JADX INFO: renamed from: S0 */
    public d30 f40963S0;

    /* JADX INFO: renamed from: T */
    public VText f40964T;

    /* JADX INFO: renamed from: T0 */
    public boolean f40965T0;

    /* JADX INFO: renamed from: U */
    public VText f40966U;

    /* JADX INFO: renamed from: U0 */
    public int f40967U0;

    /* JADX INFO: renamed from: V */
    public VLinear f40968V;

    /* JADX INFO: renamed from: V0 */
    public View f40969V0;

    /* JADX INFO: renamed from: W */
    public RelativeLayout f40970W;

    /* JADX INFO: renamed from: W0 */
    public boolean f40971W0;

    /* JADX INFO: renamed from: X0 */
    public boolean f40972X0;

    /* JADX INFO: renamed from: Y0 */
    public FeedInteractiveView f40973Y0;

    /* JADX INFO: renamed from: Z0 */
    public boolean f40974Z0;

    /* JADX INFO: renamed from: a */
    public MomentDetailHeaderBottomView f40975a;

    /* JADX INFO: renamed from: a1 */
    public wf00 f40976a1;

    /* JADX INFO: renamed from: b */
    public LinearLayout f40977b;

    /* JADX INFO: renamed from: b1 */
    public boolean f40978b1;

    /* JADX INFO: renamed from: c */
    public VText_Expandable f40979c;

    /* JADX INFO: renamed from: c1 */
    public boolean f40980c1;

    /* JADX INFO: renamed from: d */
    public VText f40981d;

    /* JADX INFO: renamed from: d1 */
    public boolean f40982d1;

    /* JADX INFO: renamed from: e */
    public VText f40983e;

    /* JADX INFO: renamed from: f */
    public FeedSharelinkView f40984f;

    /* JADX INFO: renamed from: g */
    public VLinear f40985g;

    /* JADX INFO: renamed from: h */
    public FeedInteractiveView f40986h;

    /* JADX INFO: renamed from: i */
    public QATopicPhotoAlbumTagView f40987i;

    /* JADX INFO: renamed from: j */
    public VLinear f40988j;

    /* JADX INFO: renamed from: k */
    public VText f40989k;

    /* JADX INFO: renamed from: k0 */
    public VRelative f40990k0;

    /* JADX INFO: renamed from: l */
    public VText f40991l;

    /* JADX INFO: renamed from: m */
    public VText f40992m;

    /* JADX INFO: renamed from: n */
    public VText f40993n;

    /* JADX INFO: renamed from: o */
    public VLinear f40994o;

    /* JADX INFO: renamed from: p */
    public FeedUserHeaderView f40995p;

    /* JADX INFO: renamed from: p0 */
    public VImage f40996p0;

    /* JADX INFO: renamed from: q */
    public VText f40997q;

    /* JADX INFO: renamed from: r */
    public VImage f40998r;

    /* JADX INFO: renamed from: s */
    public RelativeLayout f40999s;

    /* JADX INFO: renamed from: t */
    public VRelative f41000t;

    /* JADX INFO: renamed from: u */
    public VFrame f41001u;

    /* JADX INFO: renamed from: v */
    public VImage f41002v;

    /* JADX INFO: renamed from: w */
    public VDraweeView f41003w;

    /* JADX INFO: renamed from: x */
    public FeedAutoScrollTextView f41004x;

    /* JADX INFO: renamed from: y */
    public VLinear f41005y;

    /* JADX INFO: renamed from: z */
    public VImage f41006z;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.photoalbum.MomentDetailHeaderBottomView$a */
    public class C11261a extends c680.C16085c {

        /* JADX INFO: renamed from: a */
        public boolean f41007a;

        public C11261a() {
        }

        @Override // p149l.c680.C16085c, p149l.c680.InterfaceC16084b
        /* JADX INFO: renamed from: d */
        public void mo44053d() {
            this.f41007a = true;
        }

        @Override // p149l.c680.C16085c, p149l.c680.InterfaceC16084b
        public void onComplete() {
            super.onComplete();
            p6j0.m167672f("e_video_play_over", "p_user_moment_interactions_details_view", p6j0.C19147a.m167678g("moment_id", MomentDetailHeaderBottomView.this.f40955O0.f56011id), p6j0.C19147a.m167678g("owner_id", MomentDetailHeaderBottomView.this.f40955O0.owner));
        }

        @Override // p149l.c680.C16085c, p149l.c680.InterfaceC16084b
        public void onResume() {
            if (this.f41007a) {
                p6j0.m167672f("e_video_play_start", "p_user_moment_interactions_details_view", p6j0.C19147a.m167678g("moment_id", MomentDetailHeaderBottomView.this.f40955O0.f56011id), p6j0.C19147a.m167678g("owner_id", MomentDetailHeaderBottomView.this.f40955O0.owner));
            }
            this.f41007a = false;
        }

        @Override // p149l.c680.C16085c, p149l.c680.InterfaceC16084b
        public void onStart() {
            p6j0.m167672f("e_video_play_start", "p_user_moment_interactions_details_view", p6j0.C19147a.m167678g("moment_id", MomentDetailHeaderBottomView.this.f40955O0.f56011id), p6j0.C19147a.m167678g("owner_id", MomentDetailHeaderBottomView.this.f40955O0.owner));
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.photoalbum.MomentDetailHeaderBottomView$b */
    public class ViewOnClickListenerC11262b implements View.OnClickListener {
        public ViewOnClickListenerC11262b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MomentDetailHeaderBottomView.m63169z(MomentDetailHeaderBottomView.this.f40955O0, MomentDetailHeaderBottomView.this.f40955O0.group);
            MomentDetailHeaderBottomView.this.m63216u().startActivity(new FeedGroupDetailAct.C11200a(MomentDetailHeaderBottomView.this.m63216u(), MomentDetailHeaderBottomView.this.f40955O0.group.f39223id).m61987a());
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.photoalbum.MomentDetailHeaderBottomView$c */
    public class C11263c extends AnimListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ImageView f41010a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ SVGAnimationView f41011b;

        public C11263c(ImageView imageView, SVGAnimationView sVGAnimationView) {
            this.f41010a = imageView;
            this.f41011b = sVGAnimationView;
        }

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ void m63222b(SVGAnimationView sVGAnimationView) {
            MomentDetailHeaderBottomView.this.f40990k0.setEnabled(true);
            sVGAnimationView.setVisibility(8);
            ((ViewGroup) MomentDetailHeaderBottomView.this.m63216u().findViewById(R.id.content)).removeView(sVGAnimationView);
        }

        @Override // com.tantan.library.svga.AnimListener
        public void onFinished() {
            super.onFinished();
            MomentDetailHeaderBottomView.this.f40972X0 = false;
            if (!xdl0.m208349O0(MomentDetailHeaderBottomView.this.f40935E0)) {
                this.f41010a.setVisibility(0);
            }
            Animator animatorM103743p = bt0.m103743p(this.f41011b, "alpha", 0L, 250L, new LinearInterpolator(), 1.0f, 0.0f);
            final SVGAnimationView sVGAnimationView = this.f41011b;
            bt0.m103733f(animatorM103743p, new Runnable() { // from class: l.yc00
                @Override // java.lang.Runnable
                public final void run() {
                    this.f197397a.m63222b(sVGAnimationView);
                }
            });
            animatorM103743p.start();
        }

        @Override // com.tantan.library.svga.AnimListener
        public void onStart() {
            super.onStart();
            MomentDetailHeaderBottomView.this.f40972X0 = true;
            this.f41010a.setVisibility(4);
        }
    }

    public MomentDetailHeaderBottomView(Context context) {
        super(context);
        this.f40965T0 = false;
        this.f40967U0 = 0;
        this.f40973Y0 = null;
        this.f40974Z0 = false;
        this.f40978b1 = false;
        this.f40980c1 = false;
    }

    /* JADX INFO: renamed from: E */
    public static void m63149E(Moment moment, GroupIdBox groupIdBox) {
        p6j0.m167671e("e_circle_tag", "p_user_moment_interactions_details_view", vwb.m200311Y("circle_id", groupIdBox.f39223id), vwb.m200311Y("moment_id", moment.f56011id));
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m63153d(Throwable th) {
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ boolean m63158i(View view, MotionEvent motionEvent) {
        return true;
    }

    private void setUserViewsHistoryVisitiby(boolean z) {
        xdl0.m208344M(this.f40997q, z);
        xdl0.m208344M(this.f40995p, z);
        xdl0.m208344M(this.f40994o, z);
    }

    /* JADX INFO: renamed from: z */
    public static void m63169z(Moment moment, GroupIdBox groupIdBox) {
        p6j0.m167669c("e_circle_tag", "p_user_moment_interactions_details_view", vwb.m200311Y("circle_id", groupIdBox.f39223id), vwb.m200311Y("moment_id", moment.f56011id));
    }

    /* JADX INFO: renamed from: A */
    public final void m63170A() {
        View viewM113062h = new dqg.C16433a(m63216u(), this.f40955O0.getTopicList(), this.f40985g).m113064j("p_user_moment_interactions_details_view").m113062h();
        this.f40951M0 = viewM113062h;
        if (NullChecker.m81303a(viewM113062h)) {
            xdl0.m208360X(this.f40951M0, (nkg.m159845C0() && NullChecker.m81303a(this.f40955O0) && !vwb.m200296J(this.f40955O0.mediaRepeatIndexList)) ? t100.m186890d(4.0f) : t100.m186890d(12.0f));
        }
        m63217v();
    }

    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public final void m63189U(final ImageView imageView, FeedAutoScrollTextView feedAutoScrollTextView, final boolean z) {
        this.f40959Q0.mo133311s(this.f40955O0).subscribe(mkd0.m154956H(new e30() { // from class: l.nc00
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f138084a.m63183O(z, (Envelope) obj);
            }
        }, new e30() { // from class: l.oc00
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f142996a.m63184P(z, imageView, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: C */
    public final void m63172C(Moment moment) {
        if (moment == null || TextUtils.isEmpty(moment.simpleActivity.name)) {
            return;
        }
        p6j0.m167671e("e_activity_moment", "p_user_moment_interactions_details_view", vwb.m200311Y(ConstantsAPI.WXWebPage.KEY_ACTIVITY_ID, moment.simpleActivity.f39235id), vwb.m200311Y("activity_name", moment.simpleActivity.name), vwb.m200311Y("moment_show_type", "text_and_url"), vwb.m200311Y("moments_user_id", moment.owner));
    }

    /* JADX INFO: renamed from: D */
    public final void m63173D(Moment moment) {
        if (moment == null || TextUtils.isEmpty(moment.simpleActivity.name)) {
            return;
        }
        p6j0.m167671e("e_activity_moment", "p_user_moment_interactions_details_view", vwb.m200311Y(ConstantsAPI.WXWebPage.KEY_ACTIVITY_ID, moment.simpleActivity.f39235id), vwb.m200311Y("activity_name", moment.simpleActivity.name), vwb.m200311Y("moment_show_type", "text_and_url"), vwb.m200311Y("moments_user_id", moment.owner));
    }

    /* JADX INFO: renamed from: F */
    public final void m63174F() {
        m63214t(this);
        this.f40962S = this.f40979c;
        this.f40964T = this.f40992m;
        this.f40970W = this.f40999s;
        this.f40990k0 = this.f41000t;
        this.f40996p0 = this.f41002v;
        this.f40935E0 = this.f41003w;
        FeedAutoScrollTextView feedAutoScrollTextView = this.f41004x;
        this.f40937F0 = feedAutoScrollTextView;
        this.f40939G0 = this.f41005y;
        this.f40941H0 = this.f40930A;
        this.f40943I0 = this.f40946K;
        this.f40966U = this.f40993n;
        if (NullChecker.m81303a(feedAutoScrollTextView)) {
            this.f40937F0.setTextColor(m63216u().getResources().getColor(e1c0.f88785g0));
            this.f40937F0.setTextSize(12.0f);
        }
        setLikeCommentRightMargin(f40927f1);
        this.f40996p0.setImageTintList(null);
        this.f40932C.setImageTintList(null);
        this.f41006z.setImageTintList(null);
        this.f40934E.setImageTintList(null);
    }

    /* JADX INFO: renamed from: G */
    public CharSequence m63175G(String str) {
        return !TextUtils.isEmpty(str) ? qmf0.m175568a(str) : this.f40955O0.value;
    }

    /* JADX INFO: renamed from: H */
    public void m63176H(Act act) {
        act.duringCreated(FeedModule.f38855d.m209242B7(this.f40955O0.group.f39223id)).subscribe(mkd0.m154956H(new e30() { // from class: l.tc00
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f169405a.m63185Q((Envelope) obj);
            }
        }, new e30() { // from class: l.uc00
            @Override // p149l.e30
            public final void call(Object obj) {
                MomentDetailHeaderBottomView.m63153d((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: I */
    public SVGAnimationView m63177I(View view, float f, float f2) {
        SVGAnimationView sVGAnimationView = new SVGAnimationView(m63216u());
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
    public String m63178J(Group group) {
        if (m63179K(group) == 0) {
            return "";
        }
        return vqg.m199567r(m63179K(group)) + group.state;
    }

    /* JADX INFO: renamed from: K */
    public int m63179K(Group group) {
        return group.userCounter;
    }

    /* JADX INFO: renamed from: L */
    public final void m63180L(int i) {
        xdl0.m208344M(this.f40990k0, true);
        this.f40937F0.clearAnimation();
        FeedAutoScrollTextView feedAutoScrollTextView = this.f40937F0;
        if (i > 0) {
            feedAutoScrollTextView.setText(i0g0.m133867h0(i));
        } else {
            feedAutoScrollTextView.setText(m63216u().getString(R$string.f39087k));
        }
        this.f40939G0.setVisibility(0);
        int i2 = this.f40955O0.messages.count;
        if (i2 == 0 || vqg.m199536b0(this.f40953N0)) {
            this.f40960R.setVisibility(8);
            xdl0.m208368c0(this.f40975a, t100.m186890d(10.0f));
        } else {
            this.f40960R.setVisibility(0);
            xdl0.m208368c0(this.f40975a, t100.m186890d(4.0f));
        }
        TextView textView = this.f40941H0;
        if (i2 > 0) {
            textView.setText(i0g0.m133867h0(i2));
        } else {
            textView.setText(R$string.f39038d);
        }
        m63205k0(this.f40955O0.haveLiked, this.f40996p0);
        this.f40990k0.setOnClickListener(new View.OnClickListener() { // from class: l.jc00
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f117242a.m63187S(view);
            }
        });
        xdl0.m208329E0(this.f40938G, new View.OnClickListener() { // from class: l.kc00
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f122281a.m63188T(view);
            }
        });
        this.f40939G0.setOnClickListener(new View.OnClickListener() { // from class: l.lc00
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f127364a.m63186R(view);
            }
        });
    }

    /* JADX INFO: renamed from: M */
    public final boolean m63181M(Moment moment) {
        MomentViewerBox momentViewerBox;
        int i;
        if (moment == null || (momentViewerBox = moment.momentViewer) == null) {
            return false;
        }
        try {
            i = momentViewerBox.count;
        } catch (Exception e) {
            CrashHelper.m81296c(e);
            i = -1;
        }
        return moment.views == i;
    }

    /* JADX INFO: renamed from: N */
    public boolean m63182N(Moment moment) {
        if (moment == null || !moment.shareMyVote || vwb.m200296J(moment.getTopicList()) || vwb.m200296J(moment.getTopicList().get(0).options)) {
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
    public final /* synthetic */ void m63183O(boolean z, Envelope envelope) {
        if (NullChecker.m81303a(this.f40949L0) && this.f40955O0.haveLiked) {
            this.f40949L0.call();
        }
        zi60.m218961w().m218979k(this.f40955O0, this.f40957P0, 201, z);
        this.f40955O0 = this.f40959Q0.mo133317y(this.f40955O0.f56011id);
        Object obj = this.f40959Q0;
        if (obj instanceof n900) {
            ((n900) obj).mo104988c();
        }
        if (this.f40955O0.haveLiked && m63212r0(this.f40957P0)) {
            m63211q0();
        }
    }

    /* JADX INFO: renamed from: P */
    public final /* synthetic */ void m63184P(boolean z, ImageView imageView, Throwable th) {
        zi60.m218961w().m218980l(this.f40955O0, this.f40957P0, th, z);
        t2h.m186976g(th);
        m63205k0(this.f40955O0.haveLiked, imageView);
        m63204j0(z);
    }

    /* JADX INFO: renamed from: Q */
    public final /* synthetic */ void m63185Q(Envelope envelope) {
        if (((FeedData) envelope.data.getModuleData(FeedData.class)).groups.size() == 0) {
            return;
        }
        m63202h0(((FeedData) envelope.data.getModuleData(FeedData.class)).groups.get(0));
    }

    /* JADX INFO: renamed from: R */
    public final /* synthetic */ void m63186R(View view) {
        if (this.f40961R0) {
            lsi0.m151578h(R$string.f39042d3);
        } else if (vqg.m199536b0(this.f40953N0)) {
            lsi0.m151578h(R$string.f39089k1);
        } else {
            j2i.m139462a(this.f40955O0, this.f40957P0);
            ((n900) this.f40959Q0).mo104990f();
        }
    }

    /* JADX INFO: renamed from: S */
    public final /* synthetic */ void m63187S(View view) {
        if (vqg.m199536b0(this.f40953N0)) {
            lsi0.m151580j("由于隐私设置，该动态不支持陌生人点赞");
        } else {
            m63197c0(this.f40955O0, this.f40996p0, this.f40937F0);
        }
    }

    /* JADX INFO: renamed from: T */
    public final /* synthetic */ void m63188T(View view) {
        this.f40931B.performClick();
    }

    /* JADX INFO: renamed from: V */
    public final /* synthetic */ void m63190V(SpannableStringBuilder spannableStringBuilder, URLSpan[] uRLSpanArr, View view) {
        m63216u().startActivity(kjb0.m146199j(m63216u(), spannableStringBuilder.toString(), uRLSpanArr[0].getURL()));
        m63172C(this.f40955O0);
        if (TextUtils.isEmpty(this.f40955O0.simpleActivity.name)) {
            p6j0.m167669c("e_campaign_quiz", "p_user_moment_interactions_details_view", vwb.m200311Y("moment_id", this.f40955O0.f56011id), vwb.m200311Y("moment_type", zi60.m218961w().m218992y(this.f40955O0)), vwb.m200311Y("actor_user_id", this.f40955O0.owner));
        }
    }

    /* JADX INFO: renamed from: W */
    public final /* synthetic */ void m63191W(View view) {
        Moment moment = this.f40955O0;
        if (moment.views == 0 || vwb.m200296J(moment.momentViewer.viewers) || this.f40955O0 == null) {
            return;
        }
        Act actM63216u = m63216u();
        Moment moment2 = this.f40955O0;
        kyg.m147869d(actM63216u, "p_user_moment_interactions_details_view", moment2.f56011id, this.f40957P0, m63181M(moment2));
    }

    /* JADX INFO: renamed from: X */
    public final /* synthetic */ void m63192X(View view) {
        view.setOnClickListener(new View.OnClickListener() { // from class: l.vc00
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f180900a.m63191W(view2);
            }
        });
    }

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ void m63193Y(View view) {
        Moment moment = this.f40955O0;
        hx60 hx60Var = this.f40959Q0;
        Objects.requireNonNull(hx60Var);
        vwi.m200385P(moment, new ic00(hx60Var), this.f40959Q0.mo133306m(this.f40955O0.owner), m63216u(), this.f40957P0, true);
    }

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ void m63194Z() {
        this.f40980c1 = true;
        this.f40982d1 = vqg.m199527U(FeedModule.m60222H().mo30741Zj(this.f40953N0.f56011id));
        this.f40953N0 = FeedModule.f38855d.m209447e8(this.f40953N0.f56011id);
        if (NullChecker.m81303a(this.f40955O0)) {
            this.f40982d1 = this.f40982d1 && !vs0.m199798d(this.f40955O0);
        }
        m63220y();
    }

    /* JADX INFO: renamed from: a0 */
    public final /* synthetic */ void m63195a0(Boolean bool) {
        e51.m114743H(m63216u(), new Runnable() { // from class: l.wc00
            @Override // java.lang.Runnable
            public final void run() {
                this.f185635a.m63194Z();
            }
        }, this.f40980c1 ? 1000L : 0L);
    }

    /* JADX INFO: renamed from: b0 */
    public final /* synthetic */ void m63196b0(View view) {
        boolean z = xdl0.m208349O0(this.f40938G) && TextUtils.equals(this.f40942I.getText().toString(), "通过动态打招呼，更容易得到回复");
        if (TextUtils.equals(this.f40933D.getText().toString(), m63216u().getString(R$string.f38958Q0))) {
            zi60.m218961w().m218987s(this.f40955O0, "p_user_moment_interactions_details_view", true, z);
            FeedModule.f38854c.m60724f3(m63216u(), this.f40953N0, this.f40955O0, "p_user_moment_interactions_details_view", this.f40947K0);
        } else {
            zi60.m218961w().m218987s(this.f40955O0, "p_user_moment_interactions_details_view", false, z);
            if (NullChecker.m81303a(this.f40953N0)) {
                m63216u().startActivity(kjb0.m146192c(m63216u(), this.f40953N0.f56011id, false, false));
            }
        }
    }

    /* JADX INFO: renamed from: c0 */
    public final void m63197c0(Moment moment, final ImageView imageView, final FeedAutoScrollTextView feedAutoScrollTextView) {
        final boolean z = moment.haveLiked;
        if (m63213s0(this.f40957P0, moment) && z) {
            q31.m172733a(m63216u(), "p_user_moment_interactions_details_view", moment, yih.m214909l().m214911f());
            return;
        }
        d30 d30Var = new d30() { // from class: l.mc00
            @Override // p149l.d30
            public final void call() {
                this.f133074a.m63189U(imageView, feedAutoScrollTextView, z);
            }
        };
        this.f40963S0 = d30Var;
        d30Var.call();
        PartialIdList partialIdList = moment.likes;
        int iMax = Math.max(partialIdList.count, partialIdList.ids.size());
        if (z) {
            FeedAutoScrollTextView feedAutoScrollTextView2 = this.f40937F0;
            if (iMax == 1) {
                feedAutoScrollTextView2.m66303h(m63216u().getString(R$string.f39087k), false);
            } else {
                feedAutoScrollTextView2.m66303h(i0g0.m133867h0(iMax - 1), false);
            }
        } else {
            SVGAnimationView sVGAnimationViewM63177I = m63177I(imageView, 0.0f, t100.m186890d(1.3f));
            this.f40990k0.setEnabled(false);
            sVGAnimationViewM63177I.setVisibility(0);
            SVGALoader.with(m63216u()).from("feed_like_newui.svga").autoPlay(true).repeatCount(1).animListener(new C11263c(imageView, sVGAnimationViewM63177I)).into(sVGAnimationViewM63177I);
            FeedAutoScrollTextView feedAutoScrollTextView3 = this.f40937F0;
            if (iMax == 0) {
                feedAutoScrollTextView3.m66303h("1", true);
            } else {
                feedAutoScrollTextView3.m66303h(i0g0.m133867h0(iMax + 1), true);
            }
        }
        m63205k0(!moment.haveLiked, imageView);
    }

    /* JADX INFO: renamed from: d0 */
    public void m63198d0() {
        erl centerVieoView = getCenterVieoView();
        if (centerVieoView != null) {
            centerVieoView.pause();
        }
    }

    /* JADX INFO: renamed from: e0 */
    public void m63199e0() {
        erl centerVieoView = getCenterVieoView();
        if (centerVieoView != null) {
            centerVieoView.play();
            centerVieoView.mute(true);
        }
    }

    /* JADX INFO: renamed from: f0 */
    public void m63200f0(hx60 hx60Var, Moment moment, String str, boolean z, boolean z2, d30 d30Var, boolean z3) {
        this.f40959Q0 = hx60Var;
        this.f40955O0 = moment;
        this.f40957P0 = str;
        this.f40961R0 = z;
        this.f40945J0 = z2;
        this.f40947K0 = z3;
        this.f40949L0 = d30Var;
        if (nkg.m159895n0() && !this.f40978b1 && m63182N(moment)) {
            this.f40978b1 = true;
            p6j0.m167671e("e_moment_post", "p_user_moment_interactions_details_view", new j760("topic_id", moment.getTopicList().get(0).f39247id));
        }
        m63201g0();
        if (NullChecker.m81303a(this.f40987i)) {
            xdl0.m208344M(this.f40987i, false);
        }
    }

    /* JADX INFO: renamed from: g0 */
    public void m63201g0() {
        MomentShareInfo momentShareInfo;
        xdl0.m208344M(this, this.f40955O0 != null);
        Moment moment = this.f40955O0;
        if (moment == null) {
            return;
        }
        if (this.f40962S == null) {
            MomentDetailHeaderBottomViewNullException.reportContentViewNull(moment);
            return;
        }
        this.f40953N0 = this.f40959Q0.mo133306m(moment.owner);
        m63175G(this.f40955O0.momentValue);
        if (!NullChecker.m81303a(this.f40953N0)) {
            CrashHelper.m81297d(new Exception("MomentDetailHeaderBottomView renderDetail user = null id:" + this.f40955O0.owner + ",from:" + this.f40957P0 + ",momentid:" + this.f40955O0.f56011id), 10000);
        } else if (TextUtils.isEmpty(this.f40955O0.value)) {
            this.f40962S.setVisibility(8);
        } else {
            String str = this.f40953N0.name;
            String str2 = str + "：" + this.f40955O0.value;
            SpannableString spannableString = new SpannableString(str2);
            spannableString.setSpan(new ForegroundColorSpan(getResources().getColor(e1c0.f88781e0)), 0, (str + "：").length(), 33);
            spannableString.setSpan(new ForegroundColorSpan(getResources().getColor(e1c0.f88777c0)), (str + "：").length(), str2.length(), 33);
            this.f40962S.setText(spannableString);
            this.f40962S.setVisibility(0);
        }
        if (NullChecker.m81303a(this.f40985g)) {
            this.f40985g.removeAllViews();
        }
        if (NullChecker.m81303a(this.f40976a1)) {
            this.f40962S.setVisibility(8);
            xdl0.m208344M(this.f40983e, false);
            xdl0.m208344M(this.f40984f, false);
            xdl0.m208374f0(this.f40985g, t100.m186890d(8.0f));
            this.f40981d.setVisibility(8);
            this.f40976a1.m202943f(this.f40957P0);
            this.f40976a1.mo96278c(this.f40985g, m63216u(), this.f40955O0);
        } else {
            boolean zIsEmpty = TextUtils.isEmpty(this.f40955O0.hyperlink);
            VText vText = this.f40983e;
            if (zIsEmpty) {
                xdl0.m208344M(vText, false);
            } else {
                xdl0.m208344M(vText, true);
                m63173D(this.f40955O0);
                Spanned spannedFromHtml = Html.fromHtml(this.f40955O0.hyperlink);
                final SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(spannedFromHtml);
                final URLSpan[] uRLSpanArr = (URLSpan[]) spannableStringBuilder.getSpans(0, spannedFromHtml.length(), URLSpan.class);
                this.f40983e.setText(spannableStringBuilder.toString());
                if (uRLSpanArr != null && uRLSpanArr.length > 0) {
                    xdl0.m208329E0(this.f40983e, new View.OnClickListener() { // from class: l.pc00
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            this.f148127a.m63190V(spannableStringBuilder, uRLSpanArr, view);
                        }
                    });
                }
            }
            MomentAdditionalData momentAdditionalData = this.f40955O0.additionalData;
            if (momentAdditionalData == null || (momentShareInfo = momentAdditionalData.share) == null || momentShareInfo.isMomentShareEmpty()) {
                xdl0.m208344M(this.f40984f, false);
            } else {
                xdl0.m208344M(this.f40984f, true);
                FeedSharelinkView feedSharelinkView = this.f40984f;
                Moment moment2 = this.f40955O0;
                feedSharelinkView.m65233f(moment2.additionalData.share, "p_user_moment_interactions_details_view", moment2.f56011id, moment2.owner);
            }
        }
        if (!nkg.m159895n0() || !NullChecker.m81303a(this.f40955O0) || !this.f40955O0.shareMyVote) {
            m63170A();
        }
        User user = this.f40953N0;
        if (user == null || !vqg.m199560n0(user)) {
            this.f40969V0 = m63218w();
        }
        if (NullChecker.m81303a(this.f40969V0)) {
            xdl0.m208360X(this.f40970W, t100.m186890d(9.0f));
        } else if (nkg.m159867X()) {
            xdl0.m208360X(this.f40970W, t100.m186890d(20.0f));
        }
        m63206l0();
        int childCount = this.f40985g.getChildCount();
        VLinear vLinear = this.f40985g;
        if (childCount == 0) {
            vLinear.setVisibility(8);
        } else {
            vLinear.setVisibility(0);
        }
        erl centerVieoView = getCenterVieoView();
        PlayerView playerView = centerVieoView != null ? centerVieoView.getPlayerView() : null;
        if (playerView != null) {
            playerView.m66579x(new C11261a());
        }
        if (NullChecker.m81303a(this.f40991l)) {
            this.f40991l.setText(m63219x(mqi0.m155932G(this.f40955O0.createdTime)));
        }
        m63207m0(this.f40955O0);
        vwb.m200354z(vwb.m200324f0(this.f40995p, this.f40997q, this.f40998r), new e30() { // from class: l.qc00
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f153719a.m63192X((View) obj);
            }
        });
        xdl0.m208344M(this.f40988j, xdl0.m208349O0(this.f40989k) || xdl0.m208349O0(this.f40991l) || xdl0.m208349O0(this.f40964T));
        if (NullChecker.m81303a(this.f40934E)) {
            this.f40934E.setVisibility(0);
            this.f40934E.setOnClickListener(new View.OnClickListener() { // from class: l.rc00
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f158701a.m63193Y(view);
                }
            });
            if (vqg.m199528V(this.f40955O0)) {
                this.f40934E.setVisibility(8);
            }
        }
        List<Media> list = this.f40955O0.media;
        if (list == null || list.size() == 0) {
            xdl0.m208344M(this.f40962S, false);
        }
        PartialIdList partialIdList = this.f40955O0.likes;
        m63180L(Math.max(partialIdList.count, partialIdList.ids.size()));
        if (NullChecker.m81304b(this.f40966U)) {
            this.f40966U.setVisibility(8);
        }
        if (NullChecker.m81304b(this.f40955O0)) {
            Moment moment3 = this.f40955O0;
            zi60.m218961w();
            moment3.setMomentShowFrom(zi60.m218960D(this.f40957P0));
        }
        if (NullChecker.m81303a(this.f40936F)) {
            xdl0.m208344M(this.f40936F, false);
        }
        if (!nkg.m159858O() || !NullChecker.m81303a(this.f40955O0) || this.f40955O0.isAnonymousMoment() || TextUtils.isEmpty(this.f40955O0.group.f39223id)) {
            xdl0.m208344M(this.f40948L, false);
        } else {
            xdl0.m208344M(this.f40948L, true);
            TextPaint paint = this.f40952N.getPaint();
            if (NullChecker.m81303a(paint)) {
                paint.setFakeBoldText(true);
            }
            this.f40952N.setText(this.f40955O0.group.name);
            m63203i0(m63216u());
            if (!this.f40965T0) {
                Moment moment4 = this.f40955O0;
                m63149E(moment4, moment4.group);
                this.f40965T0 = true;
            }
            xdl0.m208329E0(this.f40948L, new ViewOnClickListenerC11262b());
        }
        if (!u2h.m191492a()) {
            m63220y();
        } else if (NullChecker.m81303a(this.f40953N0)) {
            m63216u().duringCreated(ovi.m166195b(this.f40953N0.f56011id)).first().subscribe(mkd0.m154955G(new e30() { // from class: l.sc00
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f163691a.m63195a0((Boolean) obj);
                }
            }));
        }
        m63210p0();
    }

    public erl getCenterVieoView() {
        VLinear vLinear = this.f40985g;
        if (vLinear != null && vLinear.getChildCount() > 0) {
            View childAt = this.f40985g.getChildAt(0);
            if (NullChecker.m81303a(childAt) && (childAt instanceof FeedCenterVideoView)) {
                return (FeedCenterVideoView) childAt;
            }
            if (NullChecker.m81303a(childAt) && (childAt instanceof FeedCenterForwardVideoView)) {
                return (FeedCenterForwardVideoView) childAt;
            }
        }
        return null;
    }

    public wf00 getMomentHeaderInsertProxy() {
        return this.f40976a1;
    }

    /* JADX INFO: renamed from: h0 */
    public void m63202h0(Group group) {
        if (group == null) {
            return;
        }
        String strM63178J = m63178J(group);
        boolean zIsEmpty = TextUtils.isEmpty(strM63178J);
        VText vText = this.f40954O;
        if (zIsEmpty) {
            vText.setVisibility(8);
        } else {
            vText.setVisibility(0);
            this.f40954O.setText(strM63178J);
        }
    }

    /* JADX INFO: renamed from: i0 */
    public void m63203i0(Act act) {
        if (!NullChecker.m81303a(this.f40955O0) || TextUtils.isEmpty(this.f40955O0.group.f39223id)) {
            return;
        }
        Group groupM209558u7 = FeedModule.f38855d.m209558u7(this.f40955O0.group.f39223id);
        if (NullChecker.m81303a(groupM209558u7)) {
            m63202h0(groupM209558u7);
        } else {
            m63176H(act);
        }
    }

    /* JADX INFO: renamed from: j0 */
    public final void m63204j0(boolean z) {
        this.f40937F0.clearAnimation();
        FeedAutoScrollTextView feedAutoScrollTextView = this.f40937F0;
        if (z) {
            boolean zEquals = TextUtils.equals(feedAutoScrollTextView.getText(), m63216u().getString(R$string.f39087k));
            FeedAutoScrollTextView feedAutoScrollTextView2 = this.f40937F0;
            if (zEquals) {
                feedAutoScrollTextView2.m66303h("1", true);
                return;
            } else {
                feedAutoScrollTextView2.m66303h(i0g0.m133867h0(Integer.parseInt(feedAutoScrollTextView2.getText()) + 1), true);
                return;
            }
        }
        boolean zEquals2 = TextUtils.equals(feedAutoScrollTextView.getText(), "1");
        FeedAutoScrollTextView feedAutoScrollTextView3 = this.f40937F0;
        if (zEquals2) {
            feedAutoScrollTextView3.m66303h(m63216u().getString(R$string.f39087k), false);
        } else {
            feedAutoScrollTextView3.m66303h(i0g0.m133867h0(Integer.parseInt(feedAutoScrollTextView3.getText()) - 1), false);
        }
    }

    /* JADX INFO: renamed from: k0 */
    public final void m63205k0(boolean z, ImageView imageView) {
        int i;
        if (!z) {
            xdl0.m208344M(imageView, true);
            xdl0.m208344M(this.f40935E0, false);
            this.f40937F0.setTextColor(m63216u().getResources().getColor(e1c0.f88756K));
            imageView.setImageResource(f3c0.f94492c3);
            imageView.setImageTintList(null);
            return;
        }
        if (!m63213s0(this.f40957P0, this.f40955O0)) {
            if (!this.f40972X0) {
                xdl0.m208344M(imageView, true);
            }
            xdl0.m208344M(this.f40935E0, false);
            this.f40937F0.setTextColor(m63216u().getResources().getColor(e1c0.f88798n));
            imageView.setImageResource(f3c0.f94461Y2);
            imageView.setImageTintList(null);
            return;
        }
        String strM214915j = yih.m214909l().m214915j(this.f40955O0.attitudeId);
        if (!xdl0.m208349O0(imageView) && ((i = this.f40967U0) == this.f40955O0.attitudeId || i <= 0)) {
            xdl0.m208344M(imageView, false);
            xdl0.m208344M(this.f40935E0, true);
            if (!TextUtils.isEmpty(strM214915j)) {
                qib0.f154691G.m102331L0(this.f40935E0, strM214915j);
            }
            this.f40967U0 = this.f40955O0.attitudeId;
            return;
        }
        xdl0.m208344M(imageView, false);
        xdl0.m208344M(this.f40935E0, true);
        if (!TextUtils.isEmpty(strM214915j)) {
            qib0.f154691G.m102331L0(this.f40935E0, strM214915j);
            yih.m214909l().m214918n(this.f40935E0, this.f41001u);
        }
        this.f40967U0 = this.f40955O0.attitudeId;
    }

    /* JADX INFO: renamed from: l0 */
    public final void m63206l0() {
        MessageLocation messageLocation = this.f40955O0.location;
        if (messageLocation == null || TextUtils.isEmpty(messageLocation.name)) {
            this.f40964T.setVisibility(8);
            return;
        }
        zvf0.m220368A("e_moment_poi_tag", "p_user_moment_interactions_details_view", vwb.m200311Y("poiname", this.f40964T.getText()));
        this.f40964T.setVisibility(0);
        this.f40964T.setText(this.f40955O0.location.name);
    }

    /* JADX INFO: renamed from: m0 */
    public final void m63207m0(Moment moment) {
        if (!nkg.m159863T() || !ijb0.m136539C().f56011id.equals(moment.owner)) {
            xdl0.m208344M(this.f40998r, false);
            setUserViewsHistoryVisitiby(false);
            return;
        }
        xdl0.m208344M(this.f40989k, false);
        setUserViewsHistoryVisitiby(true);
        m63208n0();
        ArrayList arrayListM200324f0 = vwb.m200324f0(new String[0]);
        if (NullChecker.m81303a(moment) && NullChecker.m81303a(moment.momentViewer) && !vwb.m200296J(moment.momentViewer.viewers)) {
            int iMin = Math.min(3, moment.momentViewer.viewers.size());
            for (int i = 0; i < iMin; i++) {
                arrayListM200324f0.add(moment.momentViewer.viewers.get(i).userId);
            }
        }
        Collections.reverse(arrayListM200324f0);
        xdl0.m208358V(this.f40997q, vwb.m200296J(arrayListM200324f0) ? 0 : t100.m186890d(4.0f));
        this.f40995p.m66371n0(arrayListM200324f0, false);
    }

    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: n0 */
    public final void m63208n0() {
        Moment moment = this.f40955O0;
        if (moment == null || moment.views == 0) {
            xdl0.m208344M(this.f40998r, false);
            this.f40997q.setText("0浏览");
        }
        if (NullChecker.m81303a(this.f40955O0) && NullChecker.m81303a(this.f40955O0.momentViewer) && !vwb.m200296J(this.f40955O0.momentViewer.viewers)) {
            xdl0.m208344M(this.f40998r, true);
        } else {
            xdl0.m208344M(this.f40998r, false);
        }
        this.f40997q.setText(i0g0.m133868i0(this.f40955O0.views) + "浏览");
    }

    /* JADX INFO: renamed from: o0 */
    public void m63209o0() {
        if (this.f40982d1 && !vqg.m199560n0(this.f40953N0) && this.f40945J0) {
            zi60.m218961w().m218988t(this.f40955O0, "p_user_moment_interactions_details_view", false, false);
        } else {
            if (!this.f40945J0 || vqg.m199560n0(this.f40953N0)) {
                return;
            }
            zi60.m218961w().m218988t(this.f40955O0, "p_user_moment_interactions_details_view", true, false);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m63174F();
        if (NullChecker.m81303a(this.f40968V)) {
            this.f40968V.setVisibility(8);
        }
        this.f40970W.setVisibility(0);
        this.f40943I0.setOnTouchListener(new View.OnTouchListener() { // from class: l.hc00
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return MomentDetailHeaderBottomView.m63158i(view, motionEvent);
            }
        });
        this.f40991l.setVisibility(8);
    }

    /* JADX INFO: renamed from: p0 */
    public void m63210p0() {
        vqg.m199508G0(this.f40931B, new View.OnClickListener() { // from class: l.xc00
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f192169a.m63196b0(view);
            }
        });
    }

    /* JADX INFO: renamed from: q0 */
    public final void m63211q0() {
        int[] iArr = new int[2];
        this.f40941H0.getLocationOnScreen(iArr);
        Point point = new Point();
        int iM186890d = iArr[1] - t100.m186890d(125.0f);
        if (iM186890d < xdl0.m208331F0() + t100.m186890d(44.0f) + t100.m186890d(12.0f)) {
            iM186890d = iArr[1] - t100.m186890d(10.0f);
        }
        point.y = iM186890d;
        point.x = 0;
        new upg(m63216u(), point, this.f40955O0, "p_user_moment_interactions_details_view").m194876a(this.f40941H0);
    }

    /* JADX INFO: renamed from: r0 */
    public final boolean m63212r0(String str) {
        return nkg.m159867X() && TextUtils.equals(str, "from_discover_discussion");
    }

    /* JADX INFO: renamed from: s0 */
    public final boolean m63213s0(String str, Moment moment) {
        return nkg.m159867X() && TextUtils.equals(str, "from_discover_discussion") && moment.attitudeId > 0;
    }

    public void setLikeCommentRightMargin(int i) {
        if (this.f40970W.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f40970W.getLayoutParams();
            marginLayoutParams.rightMargin = i;
            this.f40970W.setLayoutParams(marginLayoutParams);
        }
    }

    public void setMomentHeaderInsertProxy(wf00 wf00Var) {
        this.f40976a1 = wf00Var;
    }

    /* JADX INFO: renamed from: t */
    public final void m63214t(View view) {
        zc00.m218009a(this, view);
    }

    /* JADX INFO: renamed from: t0 */
    public void m63215t0() {
        erl centerVieoView = getCenterVieoView();
        if (centerVieoView != null) {
            centerVieoView.stop();
        }
    }

    /* JADX INFO: renamed from: u */
    public final Act m63216u() {
        return (Act) getContext();
    }

    /* JADX INFO: renamed from: v */
    public final void m63217v() {
        if (this.f40973Y0 == null) {
            this.f40973Y0 = new FeedInteractiveView(this.f40985g.getContext());
        }
        this.f40973Y0.m64570P(m63216u(), this.f40955O0, "", "p_user_moment_interactions_details_view", false, t100.f167261j);
        this.f40985g.addView(this.f40973Y0);
        if (this.f40974Z0) {
            return;
        }
        this.f40974Z0 = true;
        this.f40973Y0.m64572R();
    }

    /* JADX INFO: renamed from: w */
    public View m63218w() {
        if (!m63212r0(this.f40957P0) || this.f40959Q0 == null) {
            return null;
        }
        if (!this.f40971W0) {
            p6j0.m167671e("e_attitude_guide", "p_user_moment_interactions_details_view", new j760[0]);
            this.f40971W0 = true;
        }
        return new bqg.C15943a(m63216u(), this.f40985g).m103379k(this.f40959Q0).m103377i(this.f40955O0).m103378j("p_user_moment_interactions_details_view").m103376h(true).m103375g();
    }

    /* JADX INFO: renamed from: x */
    public final String m63219x(String str) {
        return str + f40926e1;
    }

    /* JADX INFO: renamed from: y */
    public final void m63220y() {
        setLikeCommentRightMargin(f40927f1);
        xdl0.m208344M(this.f40931B, false);
        s7i.m182489c(this.f40939G0, this.f41006z, this.f40941H0);
        s7i.m182490d(this.f40990k0, this.f40939G0, this.f40996p0, null, this.f40937F0, this.f40957P0);
        s7i.m182491e(this.f40934E);
        if (u2h.m191497f() && NullChecker.m81303a(this.f40955O0) && !TextUtils.equals(this.f40955O0.owner, FeedModule.m60221F().userId())) {
            if (TextUtils.equals(this.f40957P0, "from_discover_dating") || TextUtils.equals(this.f40957P0, "from_like") || TextUtils.equals(this.f40957P0, "from_album") || TextUtils.equals(this.f40957P0, "from_nearby_falls_feed") || TextUtils.equals(this.f40957P0, "from_discover_discussion") || TextUtils.equals(this.f40957P0, "from_nearby_focus") || TextUtils.equals(this.f40957P0, "from_activity_tab_one") || TextUtils.equals(this.f40957P0, "from_activity_tab_two")) {
                this.f40934E.setImageResource(f3c0.f94449W4);
            }
        }
    }

    public MomentDetailHeaderBottomView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f40965T0 = false;
        this.f40967U0 = 0;
        this.f40973Y0 = null;
        this.f40974Z0 = false;
        this.f40978b1 = false;
        this.f40980c1 = false;
    }

    public MomentDetailHeaderBottomView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f40965T0 = false;
        this.f40967U0 = 0;
        this.f40973Y0 = null;
        this.f40974Z0 = false;
        this.f40978b1 = false;
        this.f40980c1 = false;
    }
}
