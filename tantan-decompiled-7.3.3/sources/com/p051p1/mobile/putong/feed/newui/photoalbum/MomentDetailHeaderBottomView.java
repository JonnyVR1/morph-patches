package com.p051p1.mobile.putong.feed.newui.photoalbum;

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
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.data.Envelope;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.MessageLocation;
import com.p051p1.mobile.putong.data.PartialIdList;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.R$string;
import com.p051p1.mobile.putong.feed.data.FeedData;
import com.p051p1.mobile.putong.feed.data.Group;
import com.p051p1.mobile.putong.feed.data.GroupIdBox;
import com.p051p1.mobile.putong.feed.data.Moment;
import com.p051p1.mobile.putong.feed.data.MomentAdditionalData;
import com.p051p1.mobile.putong.feed.data.MomentShareInfo;
import com.p051p1.mobile.putong.feed.data.MomentViewerBox;
import com.p051p1.mobile.putong.feed.helper.exception.MomentDetailHeaderBottomViewNullException;
import com.p051p1.mobile.putong.feed.newui.group.groupdetail.FeedGroupDetailAct;
import com.p051p1.mobile.putong.feed.newui.photoalbum.MomentDetailHeaderBottomView;
import com.p051p1.mobile.putong.feed.newui.photoalbum.feedbottom.insert.FeedInteractiveView;
import com.p051p1.mobile.putong.feed.newui.photoalbum.feedcenter.FeedCenterForwardVideoView;
import com.p051p1.mobile.putong.feed.newui.photoalbum.feedcenter.FeedCenterVideoView;
import com.p051p1.mobile.putong.feed.newui.photoalbum.view.FeedSharelinkView;
import com.p051p1.mobile.putong.feed.newui.topic.qatopic.QATopicPhotoAlbumTagView;
import com.p051p1.mobile.putong.feed.newui.view.FeedAutoScrollTextView;
import com.p051p1.mobile.putong.feed.newui.view.FeedUserHeaderView;
import com.p051p1.mobile.putong.feed.p065ui.PlayerView;
import com.tantan.library.svga.AnimListener;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.SVGAnimationView;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import com.tencent.p106mm.opensdk.constants.ConstantsAPI;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import p151v.VDraweeView;
import p151v.VFrame;
import p151v.VImage;
import p151v.VLinear;
import p151v.VRelative;
import p151v.VText;
import p151v.VText_Expandable;
import p153l.at0;
import p153l.bnl0;
import p153l.cmg;
import p153l.er60;
import p153l.fo00;
import p153l.gt0;
import p153l.h9i;
import p153l.i4g0;
import p153l.i4h;
import p153l.ie80;
import p153l.il00;
import p153l.j4h;
import p153l.jrg;
import p153l.jyb;
import p153l.k9c0;
import p153l.ksg;
import p153l.kyi;
import p153l.l51;
import p153l.lbc0;
import p153l.mrb0;
import p153l.n570;
import p153l.nkh;
import p153l.o1j0;
import p153l.orb0;
import p153l.pf60;
import p153l.psd0;
import p153l.pzi0;
import p153l.q8g0;
import p153l.qa00;
import p153l.qrg;
import p153l.rk00;
import p153l.rzi;
import p153l.srg;
import p153l.stl;
import p153l.tfj0;
import p153l.uqb0;
import p153l.wh00;
import p153l.x20;
import p153l.x31;
import p153l.y20;
import p153l.y3i;
import p153l.zuf0;
import p153l.zzg;

/* JADX INFO: loaded from: classes13.dex */
public class MomentDetailHeaderBottomView extends RelativeLayout {

    /* JADX INFO: renamed from: e1 */
    public static String f41774e1 = " ";

    /* JADX INFO: renamed from: f1 */
    public static final int f41775f1 = qa00.m175859d(8.0f);

    /* JADX INFO: renamed from: g1 */
    public static final int f41776g1 = qa00.m175859d(6.0f);

    /* JADX INFO: renamed from: h1 */
    public static final int f41777h1 = qa00.m175859d(8.0f);

    /* JADX INFO: renamed from: A */
    public TextView f41778A;

    /* JADX INFO: renamed from: B */
    public VLinear f41779B;

    /* JADX INFO: renamed from: C */
    public VImage f41780C;

    /* JADX INFO: renamed from: D */
    public VText f41781D;

    /* JADX INFO: renamed from: E */
    public ImageView f41782E;

    /* JADX INFO: renamed from: E0 */
    public VDraweeView f41783E0;

    /* JADX INFO: renamed from: F */
    public VText f41784F;

    /* JADX INFO: renamed from: F0 */
    public FeedAutoScrollTextView f41785F0;

    /* JADX INFO: renamed from: G */
    public ConstraintLayout f41786G;

    /* JADX INFO: renamed from: G0 */
    public VLinear f41787G0;

    /* JADX INFO: renamed from: H */
    public VDraweeView f41788H;

    /* JADX INFO: renamed from: H0 */
    public TextView f41789H0;

    /* JADX INFO: renamed from: I */
    public VText f41790I;

    /* JADX INFO: renamed from: I0 */
    public VText f41791I0;

    /* JADX INFO: renamed from: J */
    public VImage f41792J;

    /* JADX INFO: renamed from: J0 */
    public boolean f41793J0;

    /* JADX INFO: renamed from: K */
    public VText f41794K;

    /* JADX INFO: renamed from: K0 */
    public boolean f41795K0;

    /* JADX INFO: renamed from: L */
    public ConstraintLayout f41796L;

    /* JADX INFO: renamed from: L0 */
    public x20 f41797L0;

    /* JADX INFO: renamed from: M */
    public VRelative f41798M;

    /* JADX INFO: renamed from: M0 */
    public View f41799M0;

    /* JADX INFO: renamed from: N */
    public VText f41800N;

    /* JADX INFO: renamed from: N0 */
    public User f41801N0;

    /* JADX INFO: renamed from: O */
    public VText f41802O;

    /* JADX INFO: renamed from: O0 */
    public Moment f41803O0;

    /* JADX INFO: renamed from: P */
    public VImage f41804P;

    /* JADX INFO: renamed from: P0 */
    public String f41805P0;

    /* JADX INFO: renamed from: Q */
    public View f41806Q;

    /* JADX INFO: renamed from: Q0 */
    public n570 f41807Q0;

    /* JADX INFO: renamed from: R */
    public TextView f41808R;

    /* JADX INFO: renamed from: R0 */
    public boolean f41809R0;

    /* JADX INFO: renamed from: S */
    public VText_Expandable f41810S;

    /* JADX INFO: renamed from: S0 */
    public x20 f41811S0;

    /* JADX INFO: renamed from: T */
    public VText f41812T;

    /* JADX INFO: renamed from: T0 */
    public boolean f41813T0;

    /* JADX INFO: renamed from: U */
    public VText f41814U;

    /* JADX INFO: renamed from: U0 */
    public int f41815U0;

    /* JADX INFO: renamed from: V */
    public VLinear f41816V;

    /* JADX INFO: renamed from: V0 */
    public View f41817V0;

    /* JADX INFO: renamed from: W */
    public RelativeLayout f41818W;

    /* JADX INFO: renamed from: W0 */
    public boolean f41819W0;

    /* JADX INFO: renamed from: X0 */
    public boolean f41820X0;

    /* JADX INFO: renamed from: Y0 */
    public FeedInteractiveView f41821Y0;

    /* JADX INFO: renamed from: Z0 */
    public boolean f41822Z0;

    /* JADX INFO: renamed from: a */
    public MomentDetailHeaderBottomView f41823a;

    /* JADX INFO: renamed from: a1 */
    public fo00 f41824a1;

    /* JADX INFO: renamed from: b */
    public LinearLayout f41825b;

    /* JADX INFO: renamed from: b1 */
    public boolean f41826b1;

    /* JADX INFO: renamed from: c */
    public VText_Expandable f41827c;

    /* JADX INFO: renamed from: c1 */
    public boolean f41828c1;

    /* JADX INFO: renamed from: d */
    public VText f41829d;

    /* JADX INFO: renamed from: d1 */
    public boolean f41830d1;

    /* JADX INFO: renamed from: e */
    public VText f41831e;

    /* JADX INFO: renamed from: f */
    public FeedSharelinkView f41832f;

    /* JADX INFO: renamed from: g */
    public VLinear f41833g;

    /* JADX INFO: renamed from: h */
    public FeedInteractiveView f41834h;

    /* JADX INFO: renamed from: i */
    public QATopicPhotoAlbumTagView f41835i;

    /* JADX INFO: renamed from: j */
    public VLinear f41836j;

    /* JADX INFO: renamed from: k */
    public VText f41837k;

    /* JADX INFO: renamed from: k0 */
    public VRelative f41838k0;

    /* JADX INFO: renamed from: l */
    public VText f41839l;

    /* JADX INFO: renamed from: m */
    public VText f41840m;

    /* JADX INFO: renamed from: n */
    public VText f41841n;

    /* JADX INFO: renamed from: o */
    public VLinear f41842o;

    /* JADX INFO: renamed from: p */
    public FeedUserHeaderView f41843p;

    /* JADX INFO: renamed from: p0 */
    public VImage f41844p0;

    /* JADX INFO: renamed from: q */
    public VText f41845q;

    /* JADX INFO: renamed from: r */
    public VImage f41846r;

    /* JADX INFO: renamed from: s */
    public RelativeLayout f41847s;

    /* JADX INFO: renamed from: t */
    public VRelative f41848t;

    /* JADX INFO: renamed from: u */
    public VFrame f41849u;

    /* JADX INFO: renamed from: v */
    public VImage f41850v;

    /* JADX INFO: renamed from: w */
    public VDraweeView f41851w;

    /* JADX INFO: renamed from: x */
    public FeedAutoScrollTextView f41852x;

    /* JADX INFO: renamed from: y */
    public VLinear f41853y;

    /* JADX INFO: renamed from: z */
    public VImage f41854z;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.photoalbum.MomentDetailHeaderBottomView$a */
    public class C11424a extends ie80.C17711c {

        /* JADX INFO: renamed from: a */
        public boolean f41855a;

        public C11424a() {
        }

        @Override // p153l.ie80.C17711c, p153l.ie80.InterfaceC17710b
        /* JADX INFO: renamed from: d */
        public void mo45236d() {
            this.f41855a = true;
        }

        @Override // p153l.ie80.C17711c, p153l.ie80.InterfaceC17710b
        public void onComplete() {
            super.onComplete();
            tfj0.m190943f("e_video_play_over", "p_user_moment_interactions_details_view", tfj0.C20302a.m190949g("moment_id", MomentDetailHeaderBottomView.this.f41803O0.f56859id), tfj0.C20302a.m190949g("owner_id", MomentDetailHeaderBottomView.this.f41803O0.owner));
        }

        @Override // p153l.ie80.C17711c, p153l.ie80.InterfaceC17710b
        public void onResume() {
            if (this.f41855a) {
                tfj0.m190943f("e_video_play_start", "p_user_moment_interactions_details_view", tfj0.C20302a.m190949g("moment_id", MomentDetailHeaderBottomView.this.f41803O0.f56859id), tfj0.C20302a.m190949g("owner_id", MomentDetailHeaderBottomView.this.f41803O0.owner));
            }
            this.f41855a = false;
        }

        @Override // p153l.ie80.C17711c, p153l.ie80.InterfaceC17710b
        public void onStart() {
            tfj0.m190943f("e_video_play_start", "p_user_moment_interactions_details_view", tfj0.C20302a.m190949g("moment_id", MomentDetailHeaderBottomView.this.f41803O0.f56859id), tfj0.C20302a.m190949g("owner_id", MomentDetailHeaderBottomView.this.f41803O0.owner));
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.photoalbum.MomentDetailHeaderBottomView$b */
    public class ViewOnClickListenerC11425b implements View.OnClickListener {
        public ViewOnClickListenerC11425b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MomentDetailHeaderBottomView.m64352z(MomentDetailHeaderBottomView.this.f41803O0, MomentDetailHeaderBottomView.this.f41803O0.group);
            MomentDetailHeaderBottomView.this.m64399u().startActivity(new FeedGroupDetailAct.C11363a(MomentDetailHeaderBottomView.this.m64399u(), MomentDetailHeaderBottomView.this.f41803O0.group.f40071id).m63170a());
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.photoalbum.MomentDetailHeaderBottomView$c */
    public class C11426c extends AnimListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ImageView f41858a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ SVGAnimationView f41859b;

        public C11426c(ImageView imageView, SVGAnimationView sVGAnimationView) {
            this.f41858a = imageView;
            this.f41859b = sVGAnimationView;
        }

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ void m64405b(SVGAnimationView sVGAnimationView) {
            MomentDetailHeaderBottomView.this.f41838k0.setEnabled(true);
            sVGAnimationView.setVisibility(8);
            ((ViewGroup) MomentDetailHeaderBottomView.this.m64399u().findViewById(R.id.content)).removeView(sVGAnimationView);
        }

        @Override // com.tantan.library.svga.AnimListener
        public void onFinished() {
            super.onFinished();
            MomentDetailHeaderBottomView.this.f41820X0 = false;
            if (!bnl0.m105529O0(MomentDetailHeaderBottomView.this.f41783E0)) {
                this.f41858a.setVisibility(0);
            }
            Animator animatorM132170p = gt0.m132170p(this.f41859b, "alpha", 0L, 250L, new LinearInterpolator(), 1.0f, 0.0f);
            final SVGAnimationView sVGAnimationView = this.f41859b;
            gt0.m132160f(animatorM132170p, new Runnable() { // from class: l.hl00
                @Override // java.lang.Runnable
                public final void run() {
                    this.f110470a.m64405b(sVGAnimationView);
                }
            });
            animatorM132170p.start();
        }

        @Override // com.tantan.library.svga.AnimListener
        public void onStart() {
            super.onStart();
            MomentDetailHeaderBottomView.this.f41820X0 = true;
            this.f41858a.setVisibility(4);
        }
    }

    public MomentDetailHeaderBottomView(Context context) {
        super(context);
        this.f41813T0 = false;
        this.f41815U0 = 0;
        this.f41821Y0 = null;
        this.f41822Z0 = false;
        this.f41826b1 = false;
        this.f41828c1 = false;
    }

    /* JADX INFO: renamed from: E */
    public static void m64332E(Moment moment, GroupIdBox groupIdBox) {
        tfj0.m190942e("e_circle_tag", "p_user_moment_interactions_details_view", jyb.m147494Y("circle_id", groupIdBox.f40071id), jyb.m147494Y("moment_id", moment.f56859id));
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m64336d(Throwable th) {
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ boolean m64341i(View view, MotionEvent motionEvent) {
        return true;
    }

    private void setUserViewsHistoryVisitiby(boolean z) {
        bnl0.m105524M(this.f41845q, z);
        bnl0.m105524M(this.f41843p, z);
        bnl0.m105524M(this.f41842o, z);
    }

    /* JADX INFO: renamed from: z */
    public static void m64352z(Moment moment, GroupIdBox groupIdBox) {
        tfj0.m190940c("e_circle_tag", "p_user_moment_interactions_details_view", jyb.m147494Y("circle_id", groupIdBox.f40071id), jyb.m147494Y("moment_id", moment.f56859id));
    }

    /* JADX INFO: renamed from: A */
    public final void m64353A() {
        View viewM187611h = new srg.C20137a(m64399u(), this.f41803O0.getTopicList(), this.f41833g).m187613j("p_user_moment_interactions_details_view").m187611h();
        this.f41799M0 = viewM187611h;
        if (NullChecker.m82486a(viewM187611h)) {
            bnl0.m105540X(this.f41799M0, (cmg.m111174C0() && NullChecker.m82486a(this.f41803O0) && !jyb.m147479J(this.f41803O0.mediaRepeatIndexList)) ? qa00.m175859d(4.0f) : qa00.m175859d(12.0f));
        }
        m64400v();
    }

    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public final void m64372U(final ImageView imageView, FeedAutoScrollTextView feedAutoScrollTextView, final boolean z) {
        this.f41807Q0.mo137271s(this.f41803O0).subscribe(psd0.m173597H(new y20() { // from class: l.wk00
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f189518a.m64366O(z, (Envelope) obj);
            }
        }, new y20() { // from class: l.xk00
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f194660a.m64367P(z, imageView, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: C */
    public final void m64355C(Moment moment) {
        if (moment == null || TextUtils.isEmpty(moment.simpleActivity.name)) {
            return;
        }
        tfj0.m190942e("e_activity_moment", "p_user_moment_interactions_details_view", jyb.m147494Y(ConstantsAPI.WXWebPage.KEY_ACTIVITY_ID, moment.simpleActivity.f40083id), jyb.m147494Y("activity_name", moment.simpleActivity.name), jyb.m147494Y("moment_show_type", "text_and_url"), jyb.m147494Y("moments_user_id", moment.owner));
    }

    /* JADX INFO: renamed from: D */
    public final void m64356D(Moment moment) {
        if (moment == null || TextUtils.isEmpty(moment.simpleActivity.name)) {
            return;
        }
        tfj0.m190942e("e_activity_moment", "p_user_moment_interactions_details_view", jyb.m147494Y(ConstantsAPI.WXWebPage.KEY_ACTIVITY_ID, moment.simpleActivity.f40083id), jyb.m147494Y("activity_name", moment.simpleActivity.name), jyb.m147494Y("moment_show_type", "text_and_url"), jyb.m147494Y("moments_user_id", moment.owner));
    }

    /* JADX INFO: renamed from: F */
    public final void m64357F() {
        m64397t(this);
        this.f41810S = this.f41827c;
        this.f41812T = this.f41840m;
        this.f41818W = this.f41847s;
        this.f41838k0 = this.f41848t;
        this.f41844p0 = this.f41850v;
        this.f41783E0 = this.f41851w;
        FeedAutoScrollTextView feedAutoScrollTextView = this.f41852x;
        this.f41785F0 = feedAutoScrollTextView;
        this.f41787G0 = this.f41853y;
        this.f41789H0 = this.f41778A;
        this.f41791I0 = this.f41794K;
        this.f41814U = this.f41841n;
        if (NullChecker.m82486a(feedAutoScrollTextView)) {
            this.f41785F0.setTextColor(m64399u().getResources().getColor(k9c0.f124508g0));
            this.f41785F0.setTextSize(12.0f);
        }
        setLikeCommentRightMargin(f41775f1);
        this.f41844p0.setImageTintList(null);
        this.f41780C.setImageTintList(null);
        this.f41854z.setImageTintList(null);
        this.f41782E.setImageTintList(null);
    }

    /* JADX INFO: renamed from: G */
    public CharSequence m64358G(String str) {
        return !TextUtils.isEmpty(str) ? zuf0.m221643a(str) : this.f41803O0.value;
    }

    /* JADX INFO: renamed from: H */
    public void m64359H(Act act) {
        act.duringCreated(FeedModule.f39703d.m145483B7(this.f41803O0.group.f40071id)).subscribe(psd0.m173597H(new y20() { // from class: l.cl00
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f82334a.m64368Q((Envelope) obj);
            }
        }, new y20() { // from class: l.dl00
            @Override // p153l.y20
            public final void call(Object obj) {
                MomentDetailHeaderBottomView.m64336d((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: I */
    public SVGAnimationView m64360I(View view, float f, float f2) {
        SVGAnimationView sVGAnimationView = new SVGAnimationView(m64399u());
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
    public String m64361J(Group group) {
        if (m64362K(group) == 0) {
            return "";
        }
        return ksg.m151226r(m64362K(group)) + group.state;
    }

    /* JADX INFO: renamed from: K */
    public int m64362K(Group group) {
        return group.userCounter;
    }

    /* JADX INFO: renamed from: L */
    public final void m64363L(int i) {
        bnl0.m105524M(this.f41838k0, true);
        this.f41785F0.clearAnimation();
        FeedAutoScrollTextView feedAutoScrollTextView = this.f41785F0;
        if (i > 0) {
            feedAutoScrollTextView.setText(q8g0.m175802h0(i));
        } else {
            feedAutoScrollTextView.setText(m64399u().getString(R$string.f39935k));
        }
        this.f41787G0.setVisibility(0);
        int i2 = this.f41803O0.messages.count;
        if (i2 == 0 || ksg.m151195b0(this.f41801N0)) {
            this.f41808R.setVisibility(8);
            bnl0.m105548c0(this.f41823a, qa00.m175859d(10.0f));
        } else {
            this.f41808R.setVisibility(0);
            bnl0.m105548c0(this.f41823a, qa00.m175859d(4.0f));
        }
        TextView textView = this.f41789H0;
        if (i2 > 0) {
            textView.setText(q8g0.m175802h0(i2));
        } else {
            textView.setText(R$string.f39886d);
        }
        m64388k0(this.f41803O0.haveLiked, this.f41844p0);
        this.f41838k0.setOnClickListener(new View.OnClickListener() { // from class: l.sk00
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f169224a.m64370S(view);
            }
        });
        bnl0.m105509E0(this.f41786G, new View.OnClickListener() { // from class: l.tk00
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f174639a.m64371T(view);
            }
        });
        this.f41787G0.setOnClickListener(new View.OnClickListener() { // from class: l.uk00
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f179353a.m64369R(view);
            }
        });
    }

    /* JADX INFO: renamed from: M */
    public final boolean m64364M(Moment moment) {
        MomentViewerBox momentViewerBox;
        int i;
        if (moment == null || (momentViewerBox = moment.momentViewer) == null) {
            return false;
        }
        try {
            i = momentViewerBox.count;
        } catch (Exception e) {
            CrashHelper.m82479c(e);
            i = -1;
        }
        return moment.views == i;
    }

    /* JADX INFO: renamed from: N */
    public boolean m64365N(Moment moment) {
        if (moment == null || !moment.shareMyVote || jyb.m147479J(moment.getTopicList()) || jyb.m147479J(moment.getTopicList().get(0).options)) {
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
    public final /* synthetic */ void m64366O(boolean z, Envelope envelope) {
        if (NullChecker.m82486a(this.f41797L0) && this.f41803O0.haveLiked) {
            this.f41797L0.call();
        }
        er60.m122104w().m122122k(this.f41803O0, this.f41805P0, 201, z);
        this.f41803O0 = this.f41807Q0.mo137272y(this.f41803O0.f56859id);
        Object obj = this.f41807Q0;
        if (obj instanceof wh00) {
            ((wh00) obj).mo139299c();
        }
        if (this.f41803O0.haveLiked && m64395r0(this.f41805P0)) {
            m64394q0();
        }
    }

    /* JADX INFO: renamed from: P */
    public final /* synthetic */ void m64367P(boolean z, ImageView imageView, Throwable th) {
        er60.m122104w().m122123l(this.f41803O0, this.f41805P0, th, z);
        i4h.m138538g(th);
        m64388k0(this.f41803O0.haveLiked, imageView);
        m64387j0(z);
    }

    /* JADX INFO: renamed from: Q */
    public final /* synthetic */ void m64368Q(Envelope envelope) {
        if (((FeedData) envelope.data.getModuleData(FeedData.class)).groups.size() == 0) {
            return;
        }
        m64385h0(((FeedData) envelope.data.getModuleData(FeedData.class)).groups.get(0));
    }

    /* JADX INFO: renamed from: R */
    public final /* synthetic */ void m64369R(View view) {
        if (this.f41809R0) {
            o1j0.m165634h(R$string.f39890d3);
        } else if (ksg.m151195b0(this.f41801N0)) {
            o1j0.m165634h(R$string.f39937k1);
        } else {
            y3i.m214147a(this.f41803O0, this.f41805P0);
            ((wh00) this.f41807Q0).mo139301f();
        }
    }

    /* JADX INFO: renamed from: S */
    public final /* synthetic */ void m64370S(View view) {
        if (ksg.m151195b0(this.f41801N0)) {
            o1j0.m165636j("由于隐私设置，该动态不支持陌生人点赞");
        } else {
            m64380c0(this.f41803O0, this.f41844p0, this.f41785F0);
        }
    }

    /* JADX INFO: renamed from: T */
    public final /* synthetic */ void m64371T(View view) {
        this.f41779B.performClick();
    }

    /* JADX INFO: renamed from: V */
    public final /* synthetic */ void m64373V(SpannableStringBuilder spannableStringBuilder, URLSpan[] uRLSpanArr, View view) {
        m64399u().startActivity(orb0.m168893j(m64399u(), spannableStringBuilder.toString(), uRLSpanArr[0].getURL()));
        m64355C(this.f41803O0);
        if (TextUtils.isEmpty(this.f41803O0.simpleActivity.name)) {
            tfj0.m190940c("e_campaign_quiz", "p_user_moment_interactions_details_view", jyb.m147494Y("moment_id", this.f41803O0.f56859id), jyb.m147494Y("moment_type", er60.m122104w().m122135y(this.f41803O0)), jyb.m147494Y("actor_user_id", this.f41803O0.owner));
        }
    }

    /* JADX INFO: renamed from: W */
    public final /* synthetic */ void m64374W(View view) {
        Moment moment = this.f41803O0;
        if (moment.views == 0 || jyb.m147479J(moment.momentViewer.viewers) || this.f41803O0 == null) {
            return;
        }
        Act actM64399u = m64399u();
        Moment moment2 = this.f41803O0;
        zzg.m222252d(actM64399u, "p_user_moment_interactions_details_view", moment2.f56859id, this.f41805P0, m64364M(moment2));
    }

    /* JADX INFO: renamed from: X */
    public final /* synthetic */ void m64375X(View view) {
        view.setOnClickListener(new View.OnClickListener() { // from class: l.el00
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f94467a.m64374W(view2);
            }
        });
    }

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ void m64376Y(View view) {
        Moment moment = this.f41803O0;
        n570 n570Var = this.f41807Q0;
        Objects.requireNonNull(n570Var);
        rzi.m183769P(moment, new rk00(n570Var), this.f41807Q0.mo137270m(this.f41803O0.owner), m64399u(), this.f41805P0, true);
    }

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ void m64377Z() {
        this.f41828c1 = true;
        this.f41830d1 = ksg.m151186U(FeedModule.m61406H().mo31744Zj(this.f41801N0.f56859id));
        this.f41801N0 = FeedModule.f39703d.m145688e8(this.f41801N0.f56859id);
        if (NullChecker.m82486a(this.f41803O0)) {
            this.f41830d1 = this.f41830d1 && !at0.m100010d(this.f41803O0);
        }
        m64403y();
    }

    /* JADX INFO: renamed from: a0 */
    public final /* synthetic */ void m64378a0(Boolean bool) {
        l51.m152888H(m64399u(), new Runnable() { // from class: l.fl00
            @Override // java.lang.Runnable
            public final void run() {
                this.f99579a.m64377Z();
            }
        }, this.f41828c1 ? 1000L : 0L);
    }

    /* JADX INFO: renamed from: b0 */
    public final /* synthetic */ void m64379b0(View view) {
        boolean z = bnl0.m105529O0(this.f41786G) && TextUtils.equals(this.f41790I.getText().toString(), "通过动态打招呼，更容易得到回复");
        if (TextUtils.equals(this.f41781D.getText().toString(), m64399u().getString(R$string.f39806Q0))) {
            er60.m122104w().m122130s(this.f41803O0, "p_user_moment_interactions_details_view", true, z);
            FeedModule.f39702c.m61908f3(m64399u(), this.f41801N0, this.f41803O0, "p_user_moment_interactions_details_view", this.f41795K0);
        } else {
            er60.m122104w().m122130s(this.f41803O0, "p_user_moment_interactions_details_view", false, z);
            if (NullChecker.m82486a(this.f41801N0)) {
                m64399u().startActivity(orb0.m168886c(m64399u(), this.f41801N0.f56859id, false, false));
            }
        }
    }

    /* JADX INFO: renamed from: c0 */
    public final void m64380c0(Moment moment, final ImageView imageView, final FeedAutoScrollTextView feedAutoScrollTextView) {
        final boolean z = moment.haveLiked;
        if (m64396s0(this.f41805P0, moment) && z) {
            x31.m209182a(m64399u(), "p_user_moment_interactions_details_view", moment, nkh.m163608l().m163610f());
            return;
        }
        x20 x20Var = new x20() { // from class: l.vk00
            @Override // p153l.x20
            public final void call() {
                this.f184451a.m64372U(imageView, feedAutoScrollTextView, z);
            }
        };
        this.f41811S0 = x20Var;
        x20Var.call();
        PartialIdList partialIdList = moment.likes;
        int iMax = Math.max(partialIdList.count, partialIdList.ids.size());
        if (z) {
            FeedAutoScrollTextView feedAutoScrollTextView2 = this.f41785F0;
            if (iMax == 1) {
                feedAutoScrollTextView2.m67486h(m64399u().getString(R$string.f39935k), false);
            } else {
                feedAutoScrollTextView2.m67486h(q8g0.m175802h0(iMax - 1), false);
            }
        } else {
            SVGAnimationView sVGAnimationViewM64360I = m64360I(imageView, 0.0f, qa00.m175859d(1.3f));
            this.f41838k0.setEnabled(false);
            sVGAnimationViewM64360I.setVisibility(0);
            SVGALoader.with(m64399u()).from("feed_like_newui.svga").autoPlay(true).repeatCount(1).animListener(new C11426c(imageView, sVGAnimationViewM64360I)).into(sVGAnimationViewM64360I);
            FeedAutoScrollTextView feedAutoScrollTextView3 = this.f41785F0;
            if (iMax == 0) {
                feedAutoScrollTextView3.m67486h("1", true);
            } else {
                feedAutoScrollTextView3.m67486h(q8g0.m175802h0(iMax + 1), true);
            }
        }
        m64388k0(!moment.haveLiked, imageView);
    }

    /* JADX INFO: renamed from: d0 */
    public void m64381d0() {
        stl centerVieoView = getCenterVieoView();
        if (centerVieoView != null) {
            centerVieoView.pause();
        }
    }

    /* JADX INFO: renamed from: e0 */
    public void m64382e0() {
        stl centerVieoView = getCenterVieoView();
        if (centerVieoView != null) {
            centerVieoView.play();
            centerVieoView.mute(true);
        }
    }

    /* JADX INFO: renamed from: f0 */
    public void m64383f0(n570 n570Var, Moment moment, String str, boolean z, boolean z2, x20 x20Var, boolean z3) {
        this.f41807Q0 = n570Var;
        this.f41803O0 = moment;
        this.f41805P0 = str;
        this.f41809R0 = z;
        this.f41793J0 = z2;
        this.f41795K0 = z3;
        this.f41797L0 = x20Var;
        if (cmg.m111224n0() && !this.f41826b1 && m64365N(moment)) {
            this.f41826b1 = true;
            tfj0.m190942e("e_moment_post", "p_user_moment_interactions_details_view", new pf60("topic_id", moment.getTopicList().get(0).f40095id));
        }
        m64384g0();
        if (NullChecker.m82486a(this.f41835i)) {
            bnl0.m105524M(this.f41835i, false);
        }
    }

    /* JADX INFO: renamed from: g0 */
    public void m64384g0() {
        MomentShareInfo momentShareInfo;
        bnl0.m105524M(this, this.f41803O0 != null);
        Moment moment = this.f41803O0;
        if (moment == null) {
            return;
        }
        if (this.f41810S == null) {
            MomentDetailHeaderBottomViewNullException.reportContentViewNull(moment);
            return;
        }
        this.f41801N0 = this.f41807Q0.mo137270m(moment.owner);
        m64358G(this.f41803O0.momentValue);
        if (!NullChecker.m82486a(this.f41801N0)) {
            CrashHelper.m82480d(new Exception("MomentDetailHeaderBottomView renderDetail user = null id:" + this.f41803O0.owner + ",from:" + this.f41805P0 + ",momentid:" + this.f41803O0.f56859id), 10000);
        } else if (TextUtils.isEmpty(this.f41803O0.value)) {
            this.f41810S.setVisibility(8);
        } else {
            String str = this.f41801N0.name;
            String str2 = str + "：" + this.f41803O0.value;
            SpannableString spannableString = new SpannableString(str2);
            spannableString.setSpan(new ForegroundColorSpan(getResources().getColor(k9c0.f124504e0)), 0, (str + "：").length(), 33);
            spannableString.setSpan(new ForegroundColorSpan(getResources().getColor(k9c0.f124500c0)), (str + "：").length(), str2.length(), 33);
            this.f41810S.setText(spannableString);
            this.f41810S.setVisibility(0);
        }
        if (NullChecker.m82486a(this.f41833g)) {
            this.f41833g.removeAllViews();
        }
        if (NullChecker.m82486a(this.f41824a1)) {
            this.f41810S.setVisibility(8);
            bnl0.m105524M(this.f41831e, false);
            bnl0.m105524M(this.f41832f, false);
            bnl0.m105554f0(this.f41833g, qa00.m175859d(8.0f));
            this.f41829d.setVisibility(8);
            this.f41824a1.m126437f(this.f41805P0);
            this.f41824a1.mo99052c(this.f41833g, m64399u(), this.f41803O0);
        } else {
            boolean zIsEmpty = TextUtils.isEmpty(this.f41803O0.hyperlink);
            VText vText = this.f41831e;
            if (zIsEmpty) {
                bnl0.m105524M(vText, false);
            } else {
                bnl0.m105524M(vText, true);
                m64356D(this.f41803O0);
                Spanned spannedFromHtml = Html.fromHtml(this.f41803O0.hyperlink);
                final SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(spannedFromHtml);
                final URLSpan[] uRLSpanArr = (URLSpan[]) spannableStringBuilder.getSpans(0, spannedFromHtml.length(), URLSpan.class);
                this.f41831e.setText(spannableStringBuilder.toString());
                if (uRLSpanArr != null && uRLSpanArr.length > 0) {
                    bnl0.m105509E0(this.f41831e, new View.OnClickListener() { // from class: l.yk00
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            this.f200364a.m64373V(spannableStringBuilder, uRLSpanArr, view);
                        }
                    });
                }
            }
            MomentAdditionalData momentAdditionalData = this.f41803O0.additionalData;
            if (momentAdditionalData == null || (momentShareInfo = momentAdditionalData.share) == null || momentShareInfo.isMomentShareEmpty()) {
                bnl0.m105524M(this.f41832f, false);
            } else {
                bnl0.m105524M(this.f41832f, true);
                FeedSharelinkView feedSharelinkView = this.f41832f;
                Moment moment2 = this.f41803O0;
                feedSharelinkView.m66416f(moment2.additionalData.share, "p_user_moment_interactions_details_view", moment2.f56859id, moment2.owner);
            }
        }
        if (!cmg.m111224n0() || !NullChecker.m82486a(this.f41803O0) || !this.f41803O0.shareMyVote) {
            m64353A();
        }
        User user = this.f41801N0;
        if (user == null || !ksg.m151219n0(user)) {
            this.f41817V0 = m64401w();
        }
        if (NullChecker.m82486a(this.f41817V0)) {
            bnl0.m105540X(this.f41818W, qa00.m175859d(9.0f));
        } else if (cmg.m111196X()) {
            bnl0.m105540X(this.f41818W, qa00.m175859d(20.0f));
        }
        m64389l0();
        int childCount = this.f41833g.getChildCount();
        VLinear vLinear = this.f41833g;
        if (childCount == 0) {
            vLinear.setVisibility(8);
        } else {
            vLinear.setVisibility(0);
        }
        stl centerVieoView = getCenterVieoView();
        PlayerView playerView = centerVieoView != null ? centerVieoView.getPlayerView() : null;
        if (playerView != null) {
            playerView.m67762x(new C11424a());
        }
        if (NullChecker.m82486a(this.f41839l)) {
            this.f41839l.setText(m64402x(pzi0.m174442G(this.f41803O0.createdTime)));
        }
        m64390m0(this.f41803O0);
        jyb.m147537z(jyb.m147507f0(this.f41843p, this.f41845q, this.f41846r), new y20() { // from class: l.zk00
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f204721a.m64375X((View) obj);
            }
        });
        bnl0.m105524M(this.f41836j, bnl0.m105529O0(this.f41837k) || bnl0.m105529O0(this.f41839l) || bnl0.m105529O0(this.f41812T));
        if (NullChecker.m82486a(this.f41782E)) {
            this.f41782E.setVisibility(0);
            this.f41782E.setOnClickListener(new View.OnClickListener() { // from class: l.al00
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f72064a.m64376Y(view);
                }
            });
            if (ksg.m151187V(this.f41803O0)) {
                this.f41782E.setVisibility(8);
            }
        }
        List<Media> list = this.f41803O0.media;
        if (list == null || list.size() == 0) {
            bnl0.m105524M(this.f41810S, false);
        }
        PartialIdList partialIdList = this.f41803O0.likes;
        m64363L(Math.max(partialIdList.count, partialIdList.ids.size()));
        if (NullChecker.m82487b(this.f41814U)) {
            this.f41814U.setVisibility(8);
        }
        if (NullChecker.m82487b(this.f41803O0)) {
            Moment moment3 = this.f41803O0;
            er60.m122104w();
            moment3.setMomentShowFrom(er60.m122103D(this.f41805P0));
        }
        if (NullChecker.m82486a(this.f41784F)) {
            bnl0.m105524M(this.f41784F, false);
        }
        if (!cmg.m111187O() || !NullChecker.m82486a(this.f41803O0) || this.f41803O0.isAnonymousMoment() || TextUtils.isEmpty(this.f41803O0.group.f40071id)) {
            bnl0.m105524M(this.f41796L, false);
        } else {
            bnl0.m105524M(this.f41796L, true);
            TextPaint paint = this.f41800N.getPaint();
            if (NullChecker.m82486a(paint)) {
                paint.setFakeBoldText(true);
            }
            this.f41800N.setText(this.f41803O0.group.name);
            m64386i0(m64399u());
            if (!this.f41813T0) {
                Moment moment4 = this.f41803O0;
                m64332E(moment4, moment4.group);
                this.f41813T0 = true;
            }
            bnl0.m105509E0(this.f41796L, new ViewOnClickListenerC11425b());
        }
        if (!j4h.m143417a()) {
            m64403y();
        } else if (NullChecker.m82486a(this.f41801N0)) {
            m64399u().duringCreated(kyi.m151973b(this.f41801N0.f56859id)).first().subscribe(psd0.m173596G(new y20() { // from class: l.bl00
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f77137a.m64378a0((Boolean) obj);
                }
            }));
        }
        m64393p0();
    }

    public stl getCenterVieoView() {
        VLinear vLinear = this.f41833g;
        if (vLinear != null && vLinear.getChildCount() > 0) {
            View childAt = this.f41833g.getChildAt(0);
            if (NullChecker.m82486a(childAt) && (childAt instanceof FeedCenterVideoView)) {
                return (FeedCenterVideoView) childAt;
            }
            if (NullChecker.m82486a(childAt) && (childAt instanceof FeedCenterForwardVideoView)) {
                return (FeedCenterForwardVideoView) childAt;
            }
        }
        return null;
    }

    public fo00 getMomentHeaderInsertProxy() {
        return this.f41824a1;
    }

    /* JADX INFO: renamed from: h0 */
    public void m64385h0(Group group) {
        if (group == null) {
            return;
        }
        String strM64361J = m64361J(group);
        boolean zIsEmpty = TextUtils.isEmpty(strM64361J);
        VText vText = this.f41802O;
        if (zIsEmpty) {
            vText.setVisibility(8);
        } else {
            vText.setVisibility(0);
            this.f41802O.setText(strM64361J);
        }
    }

    /* JADX INFO: renamed from: i0 */
    public void m64386i0(Act act) {
        if (!NullChecker.m82486a(this.f41803O0) || TextUtils.isEmpty(this.f41803O0.group.f40071id)) {
            return;
        }
        Group groupM145799u7 = FeedModule.f39703d.m145799u7(this.f41803O0.group.f40071id);
        if (NullChecker.m82486a(groupM145799u7)) {
            m64385h0(groupM145799u7);
        } else {
            m64359H(act);
        }
    }

    /* JADX INFO: renamed from: j0 */
    public final void m64387j0(boolean z) {
        this.f41785F0.clearAnimation();
        FeedAutoScrollTextView feedAutoScrollTextView = this.f41785F0;
        if (z) {
            boolean zEquals = TextUtils.equals(feedAutoScrollTextView.getText(), m64399u().getString(R$string.f39935k));
            FeedAutoScrollTextView feedAutoScrollTextView2 = this.f41785F0;
            if (zEquals) {
                feedAutoScrollTextView2.m67486h("1", true);
                return;
            } else {
                feedAutoScrollTextView2.m67486h(q8g0.m175802h0(Integer.parseInt(feedAutoScrollTextView2.getText()) + 1), true);
                return;
            }
        }
        boolean zEquals2 = TextUtils.equals(feedAutoScrollTextView.getText(), "1");
        FeedAutoScrollTextView feedAutoScrollTextView3 = this.f41785F0;
        if (zEquals2) {
            feedAutoScrollTextView3.m67486h(m64399u().getString(R$string.f39935k), false);
        } else {
            feedAutoScrollTextView3.m67486h(q8g0.m175802h0(Integer.parseInt(feedAutoScrollTextView3.getText()) - 1), false);
        }
    }

    /* JADX INFO: renamed from: k0 */
    public final void m64388k0(boolean z, ImageView imageView) {
        int i;
        if (!z) {
            bnl0.m105524M(imageView, true);
            bnl0.m105524M(this.f41783E0, false);
            this.f41785F0.setTextColor(m64399u().getResources().getColor(k9c0.f124479K));
            imageView.setImageResource(lbc0.f131010c3);
            imageView.setImageTintList(null);
            return;
        }
        if (!m64396s0(this.f41805P0, this.f41803O0)) {
            if (!this.f41820X0) {
                bnl0.m105524M(imageView, true);
            }
            bnl0.m105524M(this.f41783E0, false);
            this.f41785F0.setTextColor(m64399u().getResources().getColor(k9c0.f124521n));
            imageView.setImageResource(lbc0.f130979Y2);
            imageView.setImageTintList(null);
            return;
        }
        String strM163614j = nkh.m163608l().m163614j(this.f41803O0.attitudeId);
        if (!bnl0.m105529O0(imageView) && ((i = this.f41815U0) == this.f41803O0.attitudeId || i <= 0)) {
            bnl0.m105524M(imageView, false);
            bnl0.m105524M(this.f41783E0, true);
            if (!TextUtils.isEmpty(strM163614j)) {
                uqb0.f180374G.m127115L0(this.f41783E0, strM163614j);
            }
            this.f41815U0 = this.f41803O0.attitudeId;
            return;
        }
        bnl0.m105524M(imageView, false);
        bnl0.m105524M(this.f41783E0, true);
        if (!TextUtils.isEmpty(strM163614j)) {
            uqb0.f180374G.m127115L0(this.f41783E0, strM163614j);
            nkh.m163608l().m163617n(this.f41783E0, this.f41849u);
        }
        this.f41815U0 = this.f41803O0.attitudeId;
    }

    /* JADX INFO: renamed from: l0 */
    public final void m64389l0() {
        MessageLocation messageLocation = this.f41803O0.location;
        if (messageLocation == null || TextUtils.isEmpty(messageLocation.name)) {
            this.f41812T.setVisibility(8);
            return;
        }
        i4g0.m138492A("e_moment_poi_tag", "p_user_moment_interactions_details_view", jyb.m147494Y("poiname", this.f41812T.getText()));
        this.f41812T.setVisibility(0);
        this.f41812T.setText(this.f41803O0.location.name);
    }

    /* JADX INFO: renamed from: m0 */
    public final void m64390m0(Moment moment) {
        if (!cmg.m111192T() || !mrb0.m159625C().f56859id.equals(moment.owner)) {
            bnl0.m105524M(this.f41846r, false);
            setUserViewsHistoryVisitiby(false);
            return;
        }
        bnl0.m105524M(this.f41837k, false);
        setUserViewsHistoryVisitiby(true);
        m64391n0();
        ArrayList arrayListM147507f0 = jyb.m147507f0(new String[0]);
        if (NullChecker.m82486a(moment) && NullChecker.m82486a(moment.momentViewer) && !jyb.m147479J(moment.momentViewer.viewers)) {
            int iMin = Math.min(3, moment.momentViewer.viewers.size());
            for (int i = 0; i < iMin; i++) {
                arrayListM147507f0.add(moment.momentViewer.viewers.get(i).userId);
            }
        }
        Collections.reverse(arrayListM147507f0);
        bnl0.m105538V(this.f41845q, jyb.m147479J(arrayListM147507f0) ? 0 : qa00.m175859d(4.0f));
        this.f41843p.m67554n0(arrayListM147507f0, false);
    }

    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: n0 */
    public final void m64391n0() {
        Moment moment = this.f41803O0;
        if (moment == null || moment.views == 0) {
            bnl0.m105524M(this.f41846r, false);
            this.f41845q.setText("0浏览");
        }
        if (NullChecker.m82486a(this.f41803O0) && NullChecker.m82486a(this.f41803O0.momentViewer) && !jyb.m147479J(this.f41803O0.momentViewer.viewers)) {
            bnl0.m105524M(this.f41846r, true);
        } else {
            bnl0.m105524M(this.f41846r, false);
        }
        this.f41845q.setText(q8g0.m175803i0(this.f41803O0.views) + "浏览");
    }

    /* JADX INFO: renamed from: o0 */
    public void m64392o0() {
        if (this.f41830d1 && !ksg.m151219n0(this.f41801N0) && this.f41793J0) {
            er60.m122104w().m122131t(this.f41803O0, "p_user_moment_interactions_details_view", false, false);
        } else {
            if (!this.f41793J0 || ksg.m151219n0(this.f41801N0)) {
                return;
            }
            er60.m122104w().m122131t(this.f41803O0, "p_user_moment_interactions_details_view", true, false);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m64357F();
        if (NullChecker.m82486a(this.f41816V)) {
            this.f41816V.setVisibility(8);
        }
        this.f41818W.setVisibility(0);
        this.f41791I0.setOnTouchListener(new View.OnTouchListener() { // from class: l.qk00
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return MomentDetailHeaderBottomView.m64341i(view, motionEvent);
            }
        });
        this.f41839l.setVisibility(8);
    }

    /* JADX INFO: renamed from: p0 */
    public void m64393p0() {
        ksg.m151167G0(this.f41779B, new View.OnClickListener() { // from class: l.gl00
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f104789a.m64379b0(view);
            }
        });
    }

    /* JADX INFO: renamed from: q0 */
    public final void m64394q0() {
        int[] iArr = new int[2];
        this.f41789H0.getLocationOnScreen(iArr);
        Point point = new Point();
        int iM175859d = iArr[1] - qa00.m175859d(125.0f);
        if (iM175859d < bnl0.m105511F0() + qa00.m175859d(44.0f) + qa00.m175859d(12.0f)) {
            iM175859d = iArr[1] - qa00.m175859d(10.0f);
        }
        point.y = iM175859d;
        point.x = 0;
        new jrg(m64399u(), point, this.f41803O0, "p_user_moment_interactions_details_view").m146735a(this.f41789H0);
    }

    /* JADX INFO: renamed from: r0 */
    public final boolean m64395r0(String str) {
        return cmg.m111196X() && TextUtils.equals(str, "from_discover_discussion");
    }

    /* JADX INFO: renamed from: s0 */
    public final boolean m64396s0(String str, Moment moment) {
        return cmg.m111196X() && TextUtils.equals(str, "from_discover_discussion") && moment.attitudeId > 0;
    }

    public void setLikeCommentRightMargin(int i) {
        if (this.f41818W.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f41818W.getLayoutParams();
            marginLayoutParams.rightMargin = i;
            this.f41818W.setLayoutParams(marginLayoutParams);
        }
    }

    public void setMomentHeaderInsertProxy(fo00 fo00Var) {
        this.f41824a1 = fo00Var;
    }

    /* JADX INFO: renamed from: t */
    public final void m64397t(View view) {
        il00.m140522a(this, view);
    }

    /* JADX INFO: renamed from: t0 */
    public void m64398t0() {
        stl centerVieoView = getCenterVieoView();
        if (centerVieoView != null) {
            centerVieoView.stop();
        }
    }

    /* JADX INFO: renamed from: u */
    public final Act m64399u() {
        return (Act) getContext();
    }

    /* JADX INFO: renamed from: v */
    public final void m64400v() {
        if (this.f41821Y0 == null) {
            this.f41821Y0 = new FeedInteractiveView(this.f41833g.getContext());
        }
        this.f41821Y0.m65753P(m64399u(), this.f41803O0, "", "p_user_moment_interactions_details_view", false, qa00.f156323j);
        this.f41833g.addView(this.f41821Y0);
        if (this.f41822Z0) {
            return;
        }
        this.f41822Z0 = true;
        this.f41821Y0.m65755R();
    }

    /* JADX INFO: renamed from: w */
    public View m64401w() {
        if (!m64395r0(this.f41805P0) || this.f41807Q0 == null) {
            return null;
        }
        if (!this.f41819W0) {
            tfj0.m190942e("e_attitude_guide", "p_user_moment_interactions_details_view", new pf60[0]);
            this.f41819W0 = true;
        }
        return new qrg.C19633a(m64399u(), this.f41833g).m177557k(this.f41807Q0).m177555i(this.f41803O0).m177556j("p_user_moment_interactions_details_view").m177554h(true).m177553g();
    }

    /* JADX INFO: renamed from: x */
    public final String m64402x(String str) {
        return str + f41774e1;
    }

    /* JADX INFO: renamed from: y */
    public final void m64403y() {
        setLikeCommentRightMargin(f41775f1);
        bnl0.m105524M(this.f41779B, false);
        h9i.m134062c(this.f41787G0, this.f41854z, this.f41789H0);
        h9i.m134063d(this.f41838k0, this.f41787G0, this.f41844p0, null, this.f41785F0, this.f41805P0);
        h9i.m134064e(this.f41782E);
        if (j4h.m143422f() && NullChecker.m82486a(this.f41803O0) && !TextUtils.equals(this.f41803O0.owner, FeedModule.m61405F().userId())) {
            if (TextUtils.equals(this.f41805P0, "from_discover_dating") || TextUtils.equals(this.f41805P0, "from_like") || TextUtils.equals(this.f41805P0, "from_album") || TextUtils.equals(this.f41805P0, "from_nearby_falls_feed") || TextUtils.equals(this.f41805P0, "from_discover_discussion") || TextUtils.equals(this.f41805P0, "from_nearby_focus") || TextUtils.equals(this.f41805P0, "from_activity_tab_one") || TextUtils.equals(this.f41805P0, "from_activity_tab_two")) {
                this.f41782E.setImageResource(lbc0.f130967W4);
            }
        }
    }

    public MomentDetailHeaderBottomView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f41813T0 = false;
        this.f41815U0 = 0;
        this.f41821Y0 = null;
        this.f41822Z0 = false;
        this.f41826b1 = false;
        this.f41828c1 = false;
    }

    public MomentDetailHeaderBottomView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f41813T0 = false;
        this.f41815U0 = 0;
        this.f41821Y0 = null;
        this.f41822Z0 = false;
        this.f41826b1 = false;
        this.f41828c1 = false;
    }
}
