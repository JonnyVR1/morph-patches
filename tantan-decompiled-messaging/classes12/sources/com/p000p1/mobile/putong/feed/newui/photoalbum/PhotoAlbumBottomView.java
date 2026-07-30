package com.p000p1.mobile.putong.feed.newui.photoalbum;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Point;
import android.text.Editable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Property;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.p000p1.mobile.putong.data.Channel;
import com.p000p1.mobile.putong.data.DetectCategoryType;
import com.p000p1.mobile.putong.data.Envelope;
import com.p000p1.mobile.putong.data.Live;
import com.p000p1.mobile.putong.data.MessageLocation;
import com.p000p1.mobile.putong.data.Order;
import com.p000p1.mobile.putong.data.Owner;
import com.p000p1.mobile.putong.data.PartialIdList;
import com.p000p1.mobile.putong.data.User;
import com.p000p1.mobile.putong.data.UserLiveLabel;
import com.p000p1.mobile.putong.data.tenum.TEnum;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.R$string;
import com.p000p1.mobile.putong.feed.data.InteractionReason;
import com.p000p1.mobile.putong.feed.data.LiveMultiCallInfo;
import com.p000p1.mobile.putong.feed.data.Moment;
import com.p000p1.mobile.putong.feed.data.MomentAdditionalData;
import com.p000p1.mobile.putong.feed.data.MomentMessage;
import com.p000p1.mobile.putong.feed.data.MomentSendFrom;
import com.p000p1.mobile.putong.feed.data.MomentViewerBox;
import com.p000p1.mobile.putong.feed.data.RawFeed;
import com.p000p1.mobile.putong.feed.newui.photoalbum.PhotoAlbumBottomView;
import com.p000p1.mobile.putong.feed.newui.photoalbum.adapter.MomentItem;
import com.p000p1.mobile.putong.feed.newui.photoalbum.basefrag.PhotoAlbumFeedBaseFrag;
import com.p000p1.mobile.putong.feed.newui.photoalbum.feed.PhotoAlbumFeedAct;
import com.p000p1.mobile.putong.feed.newui.photoalbum.feed.PhotoAlbumFeedFrag;
import com.p000p1.mobile.putong.feed.newui.photoalbum.momentdetail.MomentDetailAct;
import com.p000p1.mobile.putong.feed.newui.topic.qatopic.QATopicAggregationActivity;
import com.p000p1.mobile.putong.feed.newui.view.FeedAutoScrollTextView;
import com.p000p1.mobile.putong.feed.newui.view.FeedUserHeaderView;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.App;
import com.p1.mobile.android.app.c;
import com.p1.mobile.android.ui.bubble.a;
import com.p1.mobile.android.ui.bubble.d;
import com.p1.mobile.putong.app.PutongFrag;
import com.p1.mobile.putong.core_api.api.serviceprovider.api.CoreService;
import com.tantan.library.svga.AnimListener;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.SVGAnimationView;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import l.bkn0;
import l.bt0;
import l.d30;
import l.e30;
import l.g30;
import l.i0g0;
import l.j760;
import l.lsi0;
import l.mkd0;
import l.mqi0;
import l.osi0;
import l.qib0;
import l.t100;
import l.vwb;
import l.w9j;
import l.xdl0;
import l.zpd0;
import l.zvf0;
import p007l.AbstractC2520v4;
import p007l.a5i;
import p007l.a8c0;
import p007l.b5c0;
import p007l.djh;
import p007l.e1c0;
import p007l.f3c0;
import p007l.hx60;
import p007l.ic00;
import p007l.ijb0;
import p007l.kjb0;
import p007l.kyg;
import p007l.nkg;
import p007l.o6c0;
import p007l.p6j0;
import p007l.ptm;
import p007l.q31;
import p007l.qz60;
import p007l.rah;
import p007l.sti;
import p007l.t2h;
import p007l.upg;
import p007l.v1h;
import p007l.vqg;
import p007l.vs0;
import p007l.vwi;
import p007l.yih;
import p007l.zi60;
import v.VDraweeView;
import v.VEditText;
import v.VFrame;
import v.VImage;
import v.VLinear;
import v.VRelative;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class PhotoAlbumBottomView extends VFrame {

    /* JADX INFO: renamed from: M0 */
    public static String f2535M0 = " ";

    /* JADX INFO: renamed from: N0 */
    public static final int f2536N0 = t100.d(52.0f);

    /* JADX INFO: renamed from: O0 */
    public static final int f2537O0 = t100.d(6.0f);

    /* JADX INFO: renamed from: P0 */
    public static final Property<View, Integer> f2538P0 = new C2110b(Integer.TYPE, "viewHeight");

    /* JADX INFO: renamed from: A */
    public ConstraintLayout f2539A;

    /* JADX INFO: renamed from: B */
    public VDraweeView f2540B;

    /* JADX INFO: renamed from: C */
    public VText f2541C;

    /* JADX INFO: renamed from: D */
    public VText f2542D;

    /* JADX INFO: renamed from: E */
    public FeedUserHeaderView f2543E;

    /* JADX INFO: renamed from: E0 */
    public String f2544E0;

    /* JADX INFO: renamed from: F */
    public VText f2545F;

    /* JADX INFO: renamed from: F0 */
    public boolean f2546F0;

    /* JADX INFO: renamed from: G */
    public VImage f2547G;

    /* JADX INFO: renamed from: G0 */
    public BottomSheetDialog f2548G0;

    /* JADX INFO: renamed from: H */
    public LinearLayout f2549H;

    /* JADX INFO: renamed from: H0 */
    public e30<j760<String, Boolean>> f2550H0;

    /* JADX INFO: renamed from: I */
    public PutongFrag f2551I;

    /* JADX INFO: renamed from: I0 */
    public BottomSheetDialog f2552I0;

    /* JADX INFO: renamed from: J */
    public boolean f2553J;

    /* JADX INFO: renamed from: J0 */
    public boolean f2554J0;

    /* JADX INFO: renamed from: K */
    public Moment f2555K;

    /* JADX INFO: renamed from: K0 */
    public boolean f2556K0;

    /* JADX INFO: renamed from: L */
    public RawFeed f2557L;

    /* JADX INFO: renamed from: L0 */
    public String f2558L0;

    /* JADX INFO: renamed from: M */
    public int f2559M;

    /* JADX INFO: renamed from: N */
    public MomentItem f2560N;

    /* JADX INFO: renamed from: O */
    public HashMap<String, Boolean> f2561O;

    /* JADX INFO: renamed from: P */
    public String f2562P;

    /* JADX INFO: renamed from: Q */
    public int f2563Q;

    /* JADX INFO: renamed from: R */
    public boolean f2564R;

    /* JADX INFO: renamed from: S */
    public boolean f2565S;

    /* JADX INFO: renamed from: T */
    public hx60 f2566T;

    /* JADX INFO: renamed from: U */
    public int f2567U;

    /* JADX INFO: renamed from: V */
    public AbstractC2520v4 f2568V;

    /* JADX INFO: renamed from: W */
    public d30 f2569W;

    /* JADX INFO: renamed from: a */
    public ImageView f2570a;

    /* JADX INFO: renamed from: b */
    public VLinear f2571b;

    /* JADX INFO: renamed from: c */
    public RelativeLayout f2572c;

    /* JADX INFO: renamed from: d */
    public VRelative f2573d;

    /* JADX INFO: renamed from: e */
    public VLinear f2574e;

    /* JADX INFO: renamed from: f */
    public VText f2575f;

    /* JADX INFO: renamed from: g */
    public VText f2576g;

    /* JADX INFO: renamed from: h */
    public VText f2577h;

    /* JADX INFO: renamed from: i */
    public VLinear f2578i;

    /* JADX INFO: renamed from: j */
    public VText f2579j;

    /* JADX INFO: renamed from: k */
    public FeedAutoScrollTextView f2580k;

    /* JADX INFO: renamed from: k0 */
    public String f2581k0;

    /* JADX INFO: renamed from: l */
    public VFrame f2582l;

    /* JADX INFO: renamed from: m */
    public VImage f2583m;

    /* JADX INFO: renamed from: n */
    public VDraweeView f2584n;

    /* JADX INFO: renamed from: o */
    public TextView f2585o;

    /* JADX INFO: renamed from: p */
    public VText f2586p;

    /* JADX INFO: renamed from: p0 */
    public int f2587p0;

    /* JADX INFO: renamed from: q */
    public View f2588q;

    /* JADX INFO: renamed from: r */
    public VText f2589r;

    /* JADX INFO: renamed from: s */
    public ConstraintLayout f2590s;

    /* JADX INFO: renamed from: t */
    public VDraweeView f2591t;

    /* JADX INFO: renamed from: u */
    public VImage f2592u;

    /* JADX INFO: renamed from: v */
    public VText f2593v;

    /* JADX INFO: renamed from: w */
    public VText f2594w;

    /* JADX INFO: renamed from: x */
    public SVGAnimationView f2595x;

    /* JADX INFO: renamed from: y */
    public View f2596y;

    /* JADX INFO: renamed from: z */
    public VText f2597z;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.photoalbum.PhotoAlbumBottomView$a */
    public class C2109a extends AnimListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ImageView f2598a;

        public C2109a(ImageView imageView) {
            this.f2598a = imageView;
        }

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ void m4499b() {
            PhotoAlbumBottomView.this.f2573d.setEnabled(true);
            PhotoAlbumBottomView.this.f2595x.setVisibility(8);
            PhotoAlbumBottomView.this.f2595x.setAlpha(1.0f);
        }

        public void onFinished() {
            super.onFinished();
            PhotoAlbumBottomView.this.f2553J = false;
            if (!xdl0.O0(PhotoAlbumBottomView.this.f2584n)) {
                this.f2598a.setVisibility(0);
            }
            Animator animatorP = bt0.p(PhotoAlbumBottomView.this.f2595x, "alpha", 0L, 250L, new LinearInterpolator(), new float[]{1.0f, 0.0f});
            bt0.f(animatorP, new Runnable() { // from class: l.b170
                @Override // java.lang.Runnable
                public final void run() {
                    this.f5885a.m4499b();
                }
            });
            animatorP.start();
        }

        public void onStart() {
            super.onStart();
            PhotoAlbumBottomView.this.f2553J = true;
            this.f2598a.setVisibility(4);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.photoalbum.PhotoAlbumBottomView$b */
    public class C2110b extends Property<View, Integer> {
        public C2110b(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer get(View view) {
            return Integer.valueOf(view.getLayoutParams().height);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, Integer num) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.height = num.intValue();
            view.setLayoutParams(layoutParams);
        }
    }

    public PhotoAlbumBottomView(Context context) {
        super(context);
        this.f2555K = null;
        this.f2557L = null;
        this.f2559M = -1;
        this.f2560N = null;
        this.f2562P = "";
        this.f2565S = false;
        this.f2587p0 = 0;
        this.f2546F0 = false;
        this.f2550H0 = new e30() { // from class: l.rz60
            public final void call(Object obj) {
                this.f12761a.m4462d1((j760) obj);
            }
        };
    }

    /* JADX INFO: renamed from: L */
    public static /* synthetic */ void m4379L(VEditText vEditText, TextView textView, CharSequence charSequence) {
        Editable text = vEditText.getText();
        textView.setEnabled((text == null || text.toString().trim().isEmpty()) ? false : true);
    }

    /* JADX INFO: renamed from: Y */
    public static /* synthetic */ void m4391Y(Throwable th) {
    }

    /* JADX INFO: renamed from: b0 */
    public static /* synthetic */ void m4394b0(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h1 */
    public /* synthetic */ void m4400h1(View view) {
        String strM15485K = vqg.m15485K(this.f2562P, false);
        Moment moment = this.f2555K;
        zvf0.u("e_greet_guidance", strM15485K, new j760[]{vwb.Y("moments_user_id", moment == null ? "" : moment.owner)});
        if (this.f2555K == null) {
            return;
        }
        FeedModule.m1140H().Vk(act(), this.f2541C.getText().toString(), this.f2555K.owner, (String) null, (String) null, Channel.get(Channel.greeting_guide), new e30() { // from class: l.uz60
            public final void call(Object obj) {
                this.f13986a.m4465f1((Boolean) obj);
            }
        });
    }

    /* JADX INFO: renamed from: s */
    public static /* synthetic */ void m4406s(Throwable th) {
    }

    /* JADX INFO: renamed from: y0 */
    private void m4410y0(final String str) {
        qib0.Z.Q(str, "p_user_passive_show_nearby").subscribe(mkd0.H(new e30() { // from class: l.d070
            public final void call(Object obj) {
                this.f6764a.m4452X0(str, (Boolean) obj);
            }
        }, new e30() { // from class: l.e070
            public final void call(Object obj) {
                PhotoAlbumBottomView.m4394b0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: A0 */
    public final void m4412A0(final BottomSheetDialog bottomSheetDialog, boolean z) {
        Animator animatorP = bt0.p(this.f2590s, "alpha", 0L, 300L, new LinearInterpolator(), new float[]{1.0f, 0.0f});
        bt0.f(animatorP, new Runnable() { // from class: l.b070
            @Override // java.lang.Runnable
            public final void run() {
                this.f5879a.m4454Y0(bottomSheetDialog);
            }
        });
        animatorP.start();
    }

    /* JADX INFO: renamed from: A1 */
    public boolean m4413A1(Moment moment) {
        if (moment.isLive) {
            return kjb0.m11466r(moment);
        }
        return false;
    }

    /* JADX INFO: renamed from: B0 */
    public void m4414B0() {
        xdl0.M(this.f2539A, false);
        this.f2539A.setAlpha(1.0f);
        if (NullChecker.a(this.f2551I) && NullChecker.a(this.f2555K)) {
            ((PhotoAlbumFeedBaseFrag) this.f2551I).f2918F.remove(((DbObject) this.f2555K).id);
            Moment moment = this.f2555K;
            moment.showGreetView = false;
            Moment momentM16753w7 = FeedModule.f316d.m16753w7(((DbObject) moment).id);
            if (NullChecker.a(momentM16753w7)) {
                momentM16753w7.showGreetView = false;
            }
        }
    }

    /* JADX INFO: renamed from: B1 */
    public final void m4415B1(final Moment moment, final ImageView imageView, final FeedAutoScrollTextView feedAutoScrollTextView, final String str, final boolean z) {
        final boolean z2 = moment.haveLiked;
        if (m4463d2(str, moment) && z2) {
            q31.m13372a(act(), vqg.m15485K(str, z), moment, yih.m17138l().m17140f());
            return;
        }
        PartialIdList partialIdList = moment.likes;
        int iMax = Math.max(partialIdList.count, partialIdList.ids.size());
        d30 d30Var = new d30() { // from class: l.p070
            public final void call() {
                this.f11657a.m4469j1(moment, imageView, feedAutoScrollTextView, str, z, z2);
            }
        };
        this.f2569W = d30Var;
        d30Var.call();
        if (moment.haveLiked) {
            FeedAutoScrollTextView feedAutoScrollTextView2 = this.f2580k;
            if (iMax == 1) {
                feedAutoScrollTextView2.m7465h(act().getString(R$string.f548k), false);
            } else {
                feedAutoScrollTextView2.m7465h(i0g0.h0(iMax - 1), false);
            }
        } else {
            if (this.f2556K0) {
                ptm.m13221d().m13223e(act(), this.f2551I, str, moment, "like", this.f2557L);
            }
            this.f2573d.setEnabled(false);
            this.f2595x.setVisibility(0);
            SVGALoader.with(act()).from(nkg.m12221S() ? "https://auto.tancdn.com/v1/raw/66db6975-8b2a-4fc6-be4b-454a6b5024c512.pdf" : "feed_like_newui.svga").autoPlay(true).repeatCount(1).animListener(new C2109a(imageView)).into(this.f2595x);
            FeedAutoScrollTextView feedAutoScrollTextView3 = this.f2580k;
            if (iMax == 0) {
                feedAutoScrollTextView3.m7465h("1", true);
            } else {
                feedAutoScrollTextView3.m7465h(i0g0.h0(iMax + 1), true);
            }
        }
        m4432L1(!moment.haveLiked, imageView);
    }

    /* JADX INFO: renamed from: C1 */
    public void m4416C1(Live live, Act act, String str) {
        if (NullChecker.b(live)) {
            kjb0.m11443G(act, live, str, live.recommendInfo.category);
        }
    }

    /* JADX INFO: renamed from: D0 */
    public final void m4417D0(int i) {
        m4434M1(i);
        if (NullChecker.a(this.f2555K.messages)) {
            m4424H1(this.f2555K.messages.count);
        }
        m4432L1(this.f2555K.haveLiked, this.f2583m);
        this.f2573d.setOnClickListener(new View.OnClickListener() { // from class: l.h070
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f8544a.m4456Z0(view);
            }
        });
        this.f2574e.setOnClickListener(new View.OnClickListener() { // from class: l.i070
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f8852a.m4458a1(view);
            }
        });
    }

    /* JADX INFO: renamed from: E0 */
    public final boolean m4418E0() {
        if (xdl0.O0(this.f2579j) || !nkg.m12222T()) {
            return false;
        }
        if (TextUtils.equals(this.f2562P, "from_mine_tab_album")) {
            return true;
        }
        return TextUtils.equals(this.f2562P, "from_album") && ((DbObject) ijb0.m10892C()).id.equals(this.f2555K.owner);
    }

    /* JADX INFO: renamed from: E1 */
    public boolean m4419E1() {
        return TextUtils.equals(this.f2562P, "from_discover_dating") || TextUtils.equals(this.f2562P, "from_nearby_focus") || TextUtils.equals(this.f2562P, "from_like");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: F1 */
    public boolean m4420F1(boolean z, final hx60 hx60Var, MomentItem momentItem, HashMap<String, Boolean> map, final String str, final boolean z2, int i, int i2, RawFeed rawFeed, int i3, boolean z3, boolean z4, boolean z5) {
        this.f2560N = momentItem;
        this.f2561O = map;
        final Moment moment = momentItem.f2812d;
        this.f2557L = rawFeed;
        this.f2559M = i3;
        m4494x0(this.f2573d, !moment.isLive);
        m4494x0(this.f2574e, !moment.isLive);
        m4494x0(this.f2589r, false);
        this.f2562P = str;
        this.f2563Q = i;
        this.f2565S = z;
        this.f2564R = z2;
        this.f2566T = hx60Var;
        this.f2567U = i2;
        this.f2554J0 = z4;
        this.f2556K0 = z5;
        boolean z6 = (this.f2555K == null && NullChecker.b(moment) && !((DbObject) moment).id.startsWith("fake_id_")) || (NullChecker.a(this.f2555K) && NullChecker.b(moment) && !((DbObject) this.f2555K).id.equals(((DbObject) moment).id) && !((DbObject) moment).id.startsWith("fake_id_"));
        if (NullChecker.a(this.f2595x) && xdl0.O0(this.f2595x) && this.f2595x.isAnimating() && NullChecker.a(this.f2555K) && NullChecker.a(moment) && !TextUtils.equals(((DbObject) this.f2555K).id, ((DbObject) moment).id)) {
            this.f2595x.stopAnimation(false);
        }
        this.f2555K = moment;
        this.f2546F0 = z3;
        this.f2568V.mo13794a(this);
        boolean zM4429K0 = m4429K0();
        AbstractC2520v4 abstractC2520v4 = this.f2568V;
        if (zM4429K0) {
            abstractC2520v4.mo15326l().setVisibility(8);
        } else {
            abstractC2520v4.mo15326l().setVisibility(0);
        }
        boolean zM4423H0 = m4423H0();
        RelativeLayout relativeLayout = this.f2572c;
        if (zM4423H0) {
            m4494x0(relativeLayout, false);
        } else {
            m4494x0(relativeLayout, true);
        }
        m4442R1(moment);
        if (NullChecker.b(this.f2579j)) {
            m4422G1(this.f2579j);
        }
        m4426I1(this.f2576g);
        m4437O1(this.f2577h, moment);
        m4444S1(moment);
        vwb.z(vwb.f0(new View[]{this.f2543E, this.f2545F, this.f2547G}), new e30() { // from class: l.vz60
            public final void call(Object obj) {
                this.f14336a.m4472l1(moment, str, z2, (View) obj);
            }
        });
        m4439P1(moment);
        if (NullChecker.a(this.f2570a)) {
            if (moment.isLive && FeedModule.m1139F().userId().equals(moment.live.anchor.f264id)) {
                m4494x0(this.f2570a, false);
            } else {
                this.f2570a.setVisibility(0);
                this.f2570a.setOnClickListener(new View.OnClickListener() { // from class: l.wz60
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f14708a.m4474m1(moment, hx60Var, str, view);
                    }
                });
            }
            if (vqg.m15498V(moment)) {
                this.f2570a.setVisibility(8);
            }
        }
        PartialIdList partialIdList = moment.likes;
        m4417D0(Math.max(partialIdList.count, partialIdList.ids.size()));
        this.f2568V.mo13795b(this);
        if (NullChecker.b(this.f2555K)) {
            Moment moment2 = this.f2555K;
            zi60.m17436w();
            moment2.setMomentShowFrom(zi60.m17435D(str));
        }
        if (i == 2) {
            xdl0.c0(this, t100.d(3.0f));
        }
        if ((TextUtils.isEmpty(this.f2586p.getText()) || this.f2586p.getVisibility() != 0) && ((TextUtils.isEmpty(this.f2576g.getText()) || this.f2576g.getVisibility() != 0) && ((TextUtils.isEmpty(this.f2575f.getText()) || this.f2575f.getVisibility() != 0) && !((!TextUtils.isEmpty(this.f2577h.getText()) && this.f2577h.getVisibility() == 0) || this.f2579j.getVisibility() == 0 || m4435N0(this.f2597z))))) {
            this.f2578i.setVisibility(8);
        } else {
            this.f2578i.setVisibility(0);
        }
        if (nkg.m12213K() && TextUtils.equals("from_like", str) && NullChecker.a(rawFeed)) {
            xdl0.M(this.f2594w, !rawFeed.showLikeSplitLine && rawFeed.showUnreadSplitLine);
        }
        m4428J1();
        if (User.isWisdomStar(moment.owner)) {
            this.f2578i.setVisibility(8);
            xdl0.f0(this.f2571b, 0);
            xdl0.X(this.f2568V.mo15335v(), 0);
            xdl0.U(this.f2568V.mo15335v(), 0);
        }
        return z6;
    }

    /* JADX INFO: renamed from: G0 */
    public final boolean m4421G0(Moment moment) {
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

    /* JADX INFO: renamed from: G1 */
    public final void m4422G1(View view) {
        if (vqg.m15520i0(this.f2563Q)) {
            xdl0.M(view, false);
        } else if (sti.m14317c() && TEnum.equals(this.f2555K.settings.visibility, "selfOnly")) {
            xdl0.M(view, true);
        } else {
            xdl0.M(view, false);
        }
    }

    /* JADX INFO: renamed from: H0 */
    public final boolean m4423H0() {
        LiveMultiCallInfo liveMultiCallInfo;
        Moment moment = this.f2555K;
        return moment != null && (liveMultiCallInfo = moment.multiCallInfo) != null && liveMultiCallInfo.onGoing && TextUtils.equals(moment.liveState, UserLiveLabel.LIVE_MULTI_CALL);
    }

    /* JADX INFO: renamed from: H1 */
    public void m4424H1(int i) {
        TextView textView = this.f2585o;
        if (i > 0) {
            textView.setText(i0g0.h0(i));
        } else {
            textView.setText(R$string.f499d);
        }
    }

    /* JADX INFO: renamed from: I0 */
    public final boolean m4425I0() {
        return "from_mine_tab_album".equals(this.f2562P) || "from_profile_album".equals(this.f2562P) || this.f2564R;
    }

    /* JADX INFO: renamed from: I1 */
    public final void m4426I1(VText vText) {
        if (vqg.m15520i0(this.f2563Q) || m4425I0()) {
            xdl0.M(vText, false);
            return;
        }
        xdl0.M(vText, true);
        if (NullChecker.a(vText)) {
            Moment moment = this.f2555K;
            if (moment.isLive) {
                vText.setText(a5i.m8417q(moment.live.startTime));
                return;
            }
            if (moment.isVoiceLive) {
                vText.setText(a5i.m8417q(moment.voiceLive.startTime));
                return;
            }
            if (!"qa_recommend".equals(this.f2562P) || !djh.m9420b()) {
                vText.setText(m4476o0(a5i.m8417q(this.f2555K.createdTime)));
            } else if (mqi0.o() < this.f2555K.getRecommendTime()) {
                vText.setText("1秒以前推荐");
            } else {
                vText.setText(vqg.m15470C0(this.f2555K.getRecommendTime()));
            }
        }
    }

    /* JADX INFO: renamed from: J0 */
    public final boolean m4427J0(boolean z, boolean z2) {
        return z && z2;
    }

    /* JADX INFO: renamed from: J1 */
    public void m4428J1() {
        InteractionReason interactionReason;
        RawFeed rawFeed = this.f2557L;
        if (rawFeed == null || (interactionReason = rawFeed.interaction) == null || !interactionReason.haveMoreInteraction) {
            xdl0.M(this.f2568V.mo15309E(), false);
        } else {
            xdl0.M(this.f2568V.mo15309E(), true);
            xdl0.E0(this.f2568V.mo15309E(), new View.OnClickListener() { // from class: l.k070
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) throws Throwable {
                    this.f9560a.m4475n1(view);
                }
            });
        }
    }

    /* JADX INFO: renamed from: K0 */
    public final boolean m4429K0() {
        Moment moment = this.f2555K;
        return m4427J0(moment.isVoiceLive, moment.momentVoiceLiveInfos != null);
    }

    /* JADX INFO: renamed from: K1 */
    public final void m4430K1(boolean z) {
        this.f2580k.clearAnimation();
        FeedAutoScrollTextView feedAutoScrollTextView = this.f2580k;
        if (z) {
            boolean zEquals = TextUtils.equals(feedAutoScrollTextView.getText(), act().getString(R$string.f548k));
            FeedAutoScrollTextView feedAutoScrollTextView2 = this.f2580k;
            if (zEquals) {
                feedAutoScrollTextView2.m7465h("1", true);
                return;
            } else {
                feedAutoScrollTextView2.m7465h(i0g0.h0(Integer.parseInt(feedAutoScrollTextView2.getText()) + 1), true);
                return;
            }
        }
        boolean zEquals2 = TextUtils.equals(feedAutoScrollTextView.getText(), "1");
        FeedAutoScrollTextView feedAutoScrollTextView3 = this.f2580k;
        if (zEquals2) {
            feedAutoScrollTextView3.m7465h(act().getString(R$string.f548k), false);
        } else {
            feedAutoScrollTextView3.m7465h(i0g0.h0(Integer.parseInt(feedAutoScrollTextView3.getText()) - 1), false);
        }
    }

    /* JADX INFO: renamed from: L0 */
    public boolean m4431L0() {
        return act() instanceof QATopicAggregationActivity;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0062  */
    /* JADX INFO: renamed from: L1 */
    public final void m4432L1(boolean z, ImageView imageView) {
        boolean z2;
        if (!z) {
            xdl0.M(imageView, true);
            xdl0.M(this.f2584n, false);
            this.f2580k.setTextColor(act().getResources().getColor(e1c0.f7112K));
            imageView.setImageResource(f3c0.f7775c3);
            imageView.setImageTintList(null);
            return;
        }
        if (!m4463d2(this.f2562P, this.f2555K)) {
            if (!this.f2553J) {
                xdl0.M(imageView, true);
            }
            xdl0.M(this.f2584n, false);
            this.f2580k.setTextColor(act().getResources().getColor(e1c0.f7154n));
            imageView.setImageResource(f3c0.f7744Y2);
            imageView.setImageTintList(null);
            return;
        }
        boolean z3 = xdl0.O0(imageView) && this.f2587p0 == 0 && TextUtils.equals(this.f2544E0, ((DbObject) this.f2555K).id);
        int i = this.f2587p0;
        if (i > 0) {
            Moment moment = this.f2555K;
            if (i == moment.attitudeId || !TextUtils.equals(this.f2544E0, ((DbObject) moment).id)) {
                z2 = false;
            } else {
                z2 = true;
            }
        } else {
            z2 = false;
        }
        xdl0.M(imageView, false);
        xdl0.M(this.f2584n, true);
        String strM17144j = yih.m17138l().m17144j(this.f2555K.attitudeId);
        if (!TextUtils.isEmpty(strM17144j)) {
            qib0.G.L0(this.f2584n, strM17144j);
        }
        if (z3 || z2) {
            yih.m17138l().m17147n(this.f2584n, this.f2582l);
        }
        Moment moment2 = this.f2555K;
        this.f2587p0 = moment2.attitudeId;
        this.f2544E0 = ((DbObject) moment2).id;
    }

    /* JADX INFO: renamed from: M0 */
    public boolean m4433M0() {
        Moment moment = this.f2555K;
        if (moment == null || vwb.J(moment.mTopicList)) {
            return false;
        }
        return this.f2555K.mTopicList.get(0).isTopicVoteType();
    }

    /* JADX INFO: renamed from: M1 */
    public void m4434M1(int i) {
        this.f2580k.clearAnimation();
        FeedAutoScrollTextView feedAutoScrollTextView = this.f2580k;
        if (i > 0) {
            feedAutoScrollTextView.setText(i0g0.h0(i));
        } else {
            feedAutoScrollTextView.setText(act().getString(R$string.f548k));
        }
    }

    /* JADX INFO: renamed from: N0 */
    public final boolean m4435N0(View view) {
        return view != null && view.getVisibility() == 0;
    }

    /* JADX INFO: renamed from: O0 */
    public final /* synthetic */ void m4436O0(VEditText vEditText, DialogInterface dialogInterface) {
        vEditText.requestFocus();
        act().showInput(vEditText, 2);
    }

    /* JADX INFO: renamed from: O1 */
    public final void m4437O1(VText vText, Moment moment) {
        if (m4418E0()) {
            m4494x0(vText, false);
            return;
        }
        if (NullChecker.a(vText)) {
            if ((act() instanceof PhotoAlbumFeedAct) || "from_profile_album".equals(this.f2562P) || "from_mine_tab_album".equals(this.f2562P)) {
                if (NullChecker.a(moment.location)) {
                    String strM15545v = vqg.m15545v(moment.location);
                    vText.setText(TextUtils.isEmpty(strM15545v) ? "" : m4476o0(strM15545v));
                }
                User userMo10741m = this.f2566T.mo10741m(moment.owner);
                if (moment.isLive && NullChecker.a(userMo10741m) && NullChecker.a(userMo10741m.location)) {
                    vText.setText(m4476o0(i0g0.p(userMo10741m.location.distance, true)));
                    m4494x0(vText, true);
                } else {
                    m4494x0(vText, false);
                }
                if (moment.isLive) {
                    return;
                }
                m4494x0(vText, moment.location != null);
            }
        }
    }

    /* JADX INFO: renamed from: P0 */
    public final /* synthetic */ void m4438P0(MomentMessage momentMessage) {
        m4448U1(momentMessage, false);
    }

    /* JADX INFO: renamed from: P1 */
    public final void m4439P1(Moment moment) {
        MomentSendFrom momentSendFrom;
        MomentAdditionalData momentAdditionalData = moment.additionalData;
        if (momentAdditionalData == null || (momentSendFrom = momentAdditionalData.sendFrom) == null || TextUtils.isEmpty(momentSendFrom.name)) {
            xdl0.M(this.f2597z, false);
            return;
        }
        xdl0.M(this.f2597z, true);
        this.f2597z.setText(m4476o0("来自" + moment.additionalData.sendFrom.name));
    }

    /* JADX INFO: renamed from: Q0 */
    public final /* synthetic */ void m4440Q0(VEditText vEditText, BottomSheetDialog bottomSheetDialog, View view) {
        act().hideInput(vEditText);
        final MomentMessage momentMessage = new MomentMessage();
        momentMessage.value = vEditText.getText().toString();
        momentMessage.moment = ((DbObject) this.f2555K).id;
        momentMessage.owner = FeedModule.m1139F().userId();
        zi60.m17436w();
        momentMessage.momentShowFromType = zi60.m17435D(this.f2562P);
        String strTrim = vEditText.getText().toString().trim();
        if (qib0.Z.K(strTrim)) {
            v1h.m15189A0(act(), new d30() { // from class: l.zz60
                public final void call() {
                    this.f15968a.m4438P0(momentMessage);
                }
            }, false);
        } else {
            m4448U1(momentMessage, false);
            m4410y0(strTrim);
        }
        m4496z0(bottomSheetDialog);
    }

    /* JADX INFO: renamed from: R0 */
    public final /* synthetic */ Boolean m4441R0(String str) {
        return Boolean.valueOf(TextUtils.equals(str, this.f2555K.owner));
    }

    /* JADX INFO: renamed from: R1 */
    public final void m4442R1(Moment moment) {
        MessageLocation messageLocation = moment.location;
        if (messageLocation == null || TextUtils.isEmpty(messageLocation.name) || m4433M0() || m4431L0()) {
            this.f2575f.setVisibility(8);
        } else {
            this.f2575f.setVisibility(0);
            this.f2575f.setText(moment.location.name);
        }
    }

    /* JADX INFO: renamed from: S0 */
    public final /* synthetic */ void m4443S0(boolean z, Boolean bool) {
        m4464e2(bool.booleanValue(), z);
        if (bool.booleanValue()) {
            return;
        }
        vqg.f14276i.add(this.f2555K.owner);
        if (xdl0.O0(this.f2539A)) {
            m4414B0();
        }
    }

    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: S1 */
    public final void m4444S1(Moment moment) {
        if (!((DbObject) ijb0.m10892C()).id.equals(moment.owner)) {
            m4494x0(this.f2586p, false);
            m4453X1();
            return;
        }
        if (m4418E0()) {
            m4494x0(this.f2586p, false);
            m4446T1();
            ArrayList arrayListF0 = vwb.f0(new String[0]);
            if (NullChecker.a(moment) && NullChecker.a(moment.momentViewer) && !vwb.J(moment.momentViewer.viewers)) {
                int iMin = Math.min(3, moment.momentViewer.viewers.size());
                for (int i = 0; i < iMin; i++) {
                    arrayListF0.add(moment.momentViewer.viewers.get(i).userId);
                }
            }
            Collections.reverse(arrayListF0);
            m4494x0(this.f2545F, true);
            m4494x0(this.f2543E, true);
            m4494x0(this.f2568V.mo15317M(), true);
            xdl0.M(this.f2547G, true ^ vwb.J(arrayListF0));
            xdl0.V(this.f2545F, vwb.J(arrayListF0) ? 0 : t100.d(4.0f));
            this.f2543E.m7534k0();
            this.f2543E.m7536n0(arrayListF0, false);
            return;
        }
        if (!(nkg.m12277z() && moment.views == 0) && moment.views <= 0) {
            m4494x0(this.f2586p, false);
            m4453X1();
            return;
        }
        m4453X1();
        m4494x0(this.f2586p, true);
        int i2 = moment.views;
        VText vText = this.f2586p;
        if (i2 > 1) {
            vText.setText(m4476o0(String.format(act().getString(R$string.f571n1), i0g0.i0(moment.views))));
        } else {
            vText.setText(m4476o0(String.format(act().getString(R$string.f578o1), i0g0.i0(moment.views))));
        }
        if (nkg.m12222T()) {
            if (nkg.m12277z()) {
                this.f2586p.setText(i0g0.i0(moment.views) + "浏览");
            } else {
                int i3 = moment.views;
                VText vText2 = this.f2586p;
                if (i3 == 0) {
                    vText2.setText("");
                } else {
                    vText2.setText(i0g0.i0(moment.views) + "浏览");
                }
            }
        }
        m4453X1();
    }

    /* JADX INFO: renamed from: T0 */
    public final /* synthetic */ void m4445T0(DialogInterface dialogInterface) {
        act().alwaysHideInput();
    }

    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: T1 */
    public final void m4446T1() {
        Moment moment = this.f2555K;
        if (moment == null || moment.views == 0) {
            xdl0.M(this.f2547G, false);
            this.f2545F.setText("0浏览");
            return;
        }
        this.f2545F.setText(i0g0.i0(this.f2555K.views) + "浏览");
    }

    /* JADX INFO: renamed from: U0 */
    public final /* synthetic */ void m4447U0(Moment moment, String str, boolean z, boolean z2, Envelope envelope) {
        if (nkg.m12221S() && NullChecker.a(envelope)) {
            int i = envelope.meta.code;
            Objects.requireNonNull(FeedModule.f316d);
            if (i == 20101) {
                m4471k2();
                if (!TextUtils.isEmpty(moment.owner)) {
                    User userM16628e8 = FeedModule.f316d.m16628e8(moment.owner);
                    if (NullChecker.a(userM16628e8) && User.isMatched(userM16628e8)) {
                        FeedModule.m1140H().Ap(act(), userM16628e8, false, userM16628e8.localRelationship);
                    }
                }
            }
        }
        zi60.m17436w().m17450g(moment, str, z, 201, z2, this.f2559M);
        if (m4480q0() && moment.haveLiked) {
            m4459a2("like_click");
        }
        Moment momentMo10752y = this.f2566T.mo10752y(((DbObject) moment).id);
        if (NullChecker.a(momentMo10752y) && momentMo10752y.haveLiked && m4457Z1(str) && momentMo10752y.attitudes.count > yih.m17138l().m17142h()) {
            m4455Y1();
        }
    }

    /* JADX INFO: renamed from: U1 */
    public final void m4448U1(final MomentMessage momentMessage, final boolean z) {
        vqg.m15531o(act(), momentMessage.value, DetectCategoryType.get("comment"), "comment", vqg.m15485K(this.f2562P, this.f2564R), new d30() { // from class: l.g070
            public final void call() {
                this.f8289a.m4483r1(momentMessage, z);
            }
        });
    }

    /* JADX INFO: renamed from: V0 */
    public final /* synthetic */ void m4449V0(Moment moment, ImageView imageView, String str, boolean z, boolean z2, Throwable th) {
        t2h.m14427g(th);
        m4432L1(moment.haveLiked, imageView);
        zi60.m17436w().m17452i(moment, str, z, th, z2, this.f2559M);
        m4430K1(z2);
    }

    /* JADX INFO: renamed from: V1 */
    public final void m4450V1(MomentMessage momentMessage, boolean z, Throwable th) {
        p6j0.m12916f("e_comment_send", vqg.m15485K(this.f2562P, this.f2564R), p6j0.C2456a.m12922g("moment_id", ((DbObject) this.f2555K).id), p6j0.C2456a.m12922g("owner_id", this.f2555K.owner), p6j0.C2456a.m12922g("comment_user_id", FeedModule.m1139F().userId()), p6j0.C2456a.m12922g("comment_state", z ? "success" : "fail"), p6j0.C2456a.m12922g("comment_detail", "comment"), p6j0.C2456a.m12922g("trigger_time", this.f2581k0), th == null ? null : p6j0.C2456a.m12922g("error", th.toString()));
    }

    /* JADX INFO: renamed from: W0 */
    public final /* synthetic */ void m4451W0(MomentMessage momentMessage, Boolean bool) {
        m4448U1(momentMessage, bool.booleanValue());
    }

    /* JADX INFO: renamed from: X0 */
    public final /* synthetic */ void m4452X0(String str, Boolean bool) {
        if (bool.booleanValue()) {
            v1h.m15207J0(act(), str);
        }
    }

    /* JADX INFO: renamed from: X1 */
    public final void m4453X1() {
        m4494x0(this.f2545F, false);
        m4494x0(this.f2543E, false);
        m4494x0(this.f2547G, false);
        xdl0.M(this.f2568V.mo15317M(), false);
    }

    /* JADX INFO: renamed from: Y0 */
    public final /* synthetic */ void m4454Y0(BottomSheetDialog bottomSheetDialog) {
        xdl0.M(this.f2590s, false);
        this.f2590s.setAlpha(1.0f);
        if (NullChecker.a(this.f2551I) && NullChecker.a(this.f2555K)) {
            ((PhotoAlbumFeedBaseFrag) this.f2551I).f2916D.remove(((DbObject) this.f2555K).id);
        }
        if (NullChecker.a(bottomSheetDialog)) {
            bottomSheetDialog.dismiss();
        }
    }

    /* JADX INFO: renamed from: Y1 */
    public final void m4455Y1() {
        int[] iArr = new int[2];
        this.f2585o.getLocationOnScreen(iArr);
        Point point = new Point();
        int iD = iArr[1] - t100.d(116.0f);
        if (iD < xdl0.F0() + t100.d(44.0f) + t100.d(12.0f)) {
            iD = iArr[1];
        }
        point.y = iD;
        point.x = t100.d(52.0f);
        new upg(act(), point, this.f2555K, vqg.m15485K(this.f2562P, this.f2564R)).m15128a(this.f2585o);
    }

    /* JADX INFO: renamed from: Z0 */
    public final /* synthetic */ void m4456Z0(View view) {
        boolean zM4413A1 = m4413A1(this.f2555K);
        Moment moment = this.f2555K;
        if (zM4413A1) {
            m4416C1(moment.live, act(), kjb0.m11461m(this.f2555K.live, this.f2562P));
            return;
        }
        if (!moment.isVoiceLive) {
            m4415B1(moment, this.f2583m, this.f2580k, this.f2562P, this.f2564R);
            return;
        }
        bkn0 bkn0VarM6 = FeedModule.m1141M().M6();
        Act act = act();
        Moment moment2 = this.f2555K;
        bkn0VarM6.p(act, moment2.voiceLive.f711id, moment2.owner, kjb0.m11462n("", this.f2562P), "");
    }

    /* JADX INFO: renamed from: Z1 */
    public boolean m4457Z1(String str) {
        return nkg.m12226X() && TextUtils.equals(str, "from_discover_discussion");
    }

    /* JADX INFO: renamed from: a1 */
    public final /* synthetic */ void m4458a1(View view) {
        boolean zM4413A1 = m4413A1(this.f2555K);
        Moment moment = this.f2555K;
        if (zM4413A1) {
            m4416C1(moment.live, act(), kjb0.m11461m(this.f2555K.live, this.f2562P));
        } else if (moment.isVoiceLive) {
            bkn0 bkn0VarM6 = FeedModule.m1141M().M6();
            Act act = act();
            Moment moment2 = this.f2555K;
            bkn0VarM6.p(act, moment2.voiceLive.f711id, moment2.owner, kjb0.m11462n("", this.f2562P), "");
        } else {
            m4482r0();
        }
        String strM15485K = vqg.m15485K(this.f2562P, this.f2564R);
        if (!TextUtils.isEmpty(strM15485K)) {
            m4490v0(strM15485K);
        }
        if (this.f2556K0) {
            ptm.m13221d().m13223e(act(), this.f2551I, this.f2562P, this.f2555K, "click", this.f2557L);
        }
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0015  */
    /* JADX INFO: renamed from: a2 */
    public void m4459a2(String str) {
        boolean z;
        if (NullChecker.a(this.f2555K)) {
            Moment moment = this.f2555K;
            if (moment.isLive || moment.isVoiceLive) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        if ((NullChecker.a(this.f2555K) && !vwb.J(this.f2555K.mTopicList) && this.f2555K.mTopicList.get(0).isTopicVoteType()) || xdl0.O0(this.f2590s) || z || !rah.m13889a()) {
            return;
        }
        if (nkg.m12210H() && this.f2555K.showGreetView) {
            return;
        }
        this.f2581k0 = str;
        p6j0.m12915e("e_quick_comment", vqg.m15485K(this.f2562P, this.f2564R), j760.a("trigger_time", str));
        if (NullChecker.a(this.f2551I)) {
            PutongFrag putongFrag = this.f2551I;
            if (putongFrag instanceof PhotoAlbumFeedBaseFrag) {
                PhotoAlbumFeedBaseFrag photoAlbumFeedBaseFrag = (PhotoAlbumFeedBaseFrag) putongFrag;
                if (photoAlbumFeedBaseFrag.f2916D == null) {
                    photoAlbumFeedBaseFrag.f2916D = new HashMap<>();
                }
                if (NullChecker.a(this.f2555K)) {
                    photoAlbumFeedBaseFrag.f2916D.put(((DbObject) this.f2555K).id, Boolean.TRUE);
                    m4460b2();
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Act act() {
        return getContext();
    }

    /* JADX INFO: renamed from: b2 */
    public final void m4460b2() {
        xdl0.C0(this.f2590s, 0);
        this.f2591t.setAlpha(0.0f);
        this.f2593v.setAlpha(0.0f);
        xdl0.M(this.f2590s, true);
        xdl0.M(this.f2592u, nkg.m12277z());
        if (nkg.m12277z()) {
            this.f2592u.setAlpha(0.0f);
        }
        ConstraintLayout constraintLayout = this.f2590s;
        Property<View, Integer> property = f2538P0;
        Animator animatorO = bt0.o(constraintLayout, property, new int[]{0, t100.d(48.0f)});
        animatorO.setDuration(200L);
        Animator animatorP = bt0.p(this.f2591t, "alpha", 0L, 200L, new LinearInterpolator(), new float[]{0.0f, 1.0f});
        Animator animatorM = bt0.m(this.f2591t, property, 0L, 200L, new LinearInterpolator(), new int[]{0, t100.d(24.0f)});
        Animator animatorP2 = bt0.p(this.f2592u, "alpha", 0L, 200L, new LinearInterpolator(), new float[]{0.0f, 1.0f});
        Animator animatorM2 = bt0.m(this.f2592u, property, 0L, 200L, new LinearInterpolator(), new int[]{0, t100.d(21.0f)});
        Animator animatorP3 = bt0.p(this.f2593v, "alpha", 0L, 200L, new LinearInterpolator(), new float[]{0.0f, 1.0f});
        final AnimatorSet animatorSet = new AnimatorSet();
        AnimatorSet.Builder builderPlay = animatorSet.play(animatorP);
        builderPlay.with(animatorP3).with(animatorM);
        if (nkg.m12277z()) {
            builderPlay.with(animatorP2).with(animatorM2);
        }
        bt0.f(animatorO, new Runnable() { // from class: l.a070
            @Override // java.lang.Runnable
            public final void run() {
                this.f5540a.m4485s1(animatorSet);
            }
        });
        animatorO.start();
    }

    /* JADX INFO: renamed from: c2 */
    public final void m4461c2() {
        act().duringCreated(PhotoAlbumFeedFrag.f3085E).subscribe(mkd0.H(new e30() { // from class: l.sz60
            public final void call(Object obj) {
                this.f13135a.m4487t1((j760) obj);
            }
        }, new e30() { // from class: l.tz60
            public final void call(Object obj) {
                PhotoAlbumBottomView.m4391Y((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: d1 */
    public final /* synthetic */ void m4462d1(j760 j760Var) {
        if (nkg.m12277z()) {
            m4486t0((String) j760Var.a, ((Boolean) j760Var.b).booleanValue());
        } else {
            m4484s0((String) j760Var.a);
        }
    }

    /* JADX INFO: renamed from: d2 */
    public final boolean m4463d2(String str, Moment moment) {
        return nkg.m12226X() && TextUtils.equals(str, "from_discover_discussion") && moment.attitudeId > 0;
    }

    /* JADX INFO: renamed from: e2 */
    public final void m4464e2(boolean z, boolean z2) {
        this.f2552I0 = FeedModule.m1140H().gi(vqg.m15485K(this.f2562P, false), this.f2555K.owner, z, o6c0.f11181b2, act(), a8c0.f5635d, z2, new g30() { // from class: l.yz60
            /* JADX INFO: renamed from: a */
            public final void m17202a(Object obj, Object obj2, Object obj3) {
                this.f15534a.m4491v1((String) obj, (List) obj2, (Boolean) obj3);
            }
        });
    }

    /* JADX INFO: renamed from: f1 */
    public final /* synthetic */ void m4465f1(Boolean bool) {
        if (act() != null) {
            Act act = act();
            Objects.requireNonNull(act);
            if (act.isDestroyed()) {
                return;
            }
            Act act2 = act();
            Objects.requireNonNull(act2);
            if (!act2.isFinishing() && bool.booleanValue()) {
                if (NullChecker.a(this.f2555K)) {
                    this.f2555K.showGreetView = false;
                }
                osi0.g("发送成功");
                m4414B0();
                vqg.f14276i.add(this.f2555K.owner);
            }
        }
    }

    /* JADX INFO: renamed from: g2 */
    public void m4466g2() {
        if (NullChecker.a(this.f2551I)) {
            PhotoAlbumFeedBaseFrag photoAlbumFeedBaseFrag = (PhotoAlbumFeedBaseFrag) this.f2551I;
            if (!NullChecker.a(this.f2555K) || this.f2590s.getVisibility() == 0) {
                return;
            }
            photoAlbumFeedBaseFrag.f2918F.add(((DbObject) this.f2555K).id);
            this.f2555K.showGreetView = true;
            m4467h2();
            Moment momentM16753w7 = FeedModule.f316d.m16753w7(((DbObject) this.f2555K).id);
            if (NullChecker.a(momentM16753w7)) {
                momentM16753w7.showGreetView = true;
            }
        }
    }

    public hx60 getController() {
        return this.f2566T;
    }

    /* JADX INFO: renamed from: h2 */
    public final void m4467h2() {
        if (xdl0.O0(this.f2539A)) {
            return;
        }
        String strM15485K = vqg.m15485K(this.f2562P, false);
        Moment moment = this.f2555K;
        zvf0.A("e_greet_guidance", strM15485K, new j760[]{vwb.Y("moments_user_id", moment == null ? "" : moment.owner)});
        this.f2541C.setText(vqg.m15549x());
        vs0.m15567e(this.f2555K, this.f2540B, FeedModule.m1140H().me_());
        xdl0.C0(this.f2539A, 0);
        this.f2540B.setAlpha(0.0f);
        this.f2541C.setAlpha(0.0f);
        xdl0.M(this.f2539A, true);
        ConstraintLayout constraintLayout = this.f2539A;
        Property<View, Integer> property = f2538P0;
        Animator animatorO = bt0.o(constraintLayout, property, new int[]{0, t100.d(80.0f)});
        animatorO.setDuration(200L);
        Animator animatorP = bt0.p(this.f2540B, "alpha", 0L, 200L, new LinearInterpolator(), new float[]{0.0f, 1.0f});
        Animator animatorM = bt0.m(this.f2540B, property, 0L, 200L, new LinearInterpolator(), new int[]{0, t100.d(24.0f)});
        Animator animatorP2 = bt0.p(this.f2541C, "alpha", 0L, 200L, new LinearInterpolator(), new float[]{0.0f, 1.0f});
        final AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(animatorP).with(animatorP2).with(animatorM);
        bt0.f(animatorO, new Runnable() { // from class: l.xz60
            @Override // java.lang.Runnable
            public final void run() {
                this.f15184a.m4493w1(animatorSet);
            }
        });
        animatorO.start();
    }

    /* JADX INFO: renamed from: i2 */
    public final void m4468i2() {
        act().duringCreated(PhotoAlbumFeedFrag.f3087G).subscribe(mkd0.H(new e30() { // from class: l.x070
            public final void call(Object obj) {
                this.f14724a.m4495y1((j760) obj);
            }
        }, new e30() { // from class: l.y070
            public final void call(Object obj) {
                PhotoAlbumBottomView.m4406s((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: k1 */
    public final /* synthetic */ void m4470k1(Moment moment, String str, boolean z, View view) {
        if (moment.views == 0 || vwb.J(moment.momentViewer.viewers)) {
            return;
        }
        kyg.m11535d(act(), vqg.m15485K(str, z), ((DbObject) moment).id, str, m4421G0(moment));
    }

    /* JADX INFO: renamed from: k2 */
    public void m4471k2() {
        if (((Long) FeedModule.f316d.f14952T.get()).longValue() > 2) {
            return;
        }
        act().duringCreated(act().lifecycle()).subscribe(mkd0.G(new e30() { // from class: l.t070
            public final void call(Object obj) {
                this.f13141a.m4497z1((c) obj);
            }
        }));
        zpd0 zpd0Var = FeedModule.f316d.f14952T;
        zpd0Var.put(Long.valueOf(((Long) zpd0Var.get()).longValue() + 1));
        this.f2558L0 = d.l().t(new a(act()).D("点赞后自动喜欢，配对率提升5倍").k(new int[]{act().getResources().getColor(e1c0.f7154n)}).J(13.0f).z(t100.d(10.0f)).E(true).y(true).q(a.Q).b(3000L).x(t100.d(6.0f)).u(-t100.d(20.0f)), this.f2573d);
    }

    /* JADX INFO: renamed from: l1 */
    public final /* synthetic */ void m4472l1(final Moment moment, final String str, final boolean z, View view) {
        view.setOnClickListener(new View.OnClickListener() { // from class: l.f070
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f7507a.m4470k1(moment, str, z, view2);
            }
        });
    }

    /* JADX INFO: renamed from: l2 */
    public void m4473l2(boolean z, int i) {
        if (z) {
            this.f2588q.setPadding(0, 0, 0, 0);
        }
        m4494x0(this.f2588q, z);
    }

    /* JADX INFO: renamed from: m1 */
    public final /* synthetic */ void m4474m1(Moment moment, hx60 hx60Var, String str, View view) {
        Objects.requireNonNull(hx60Var);
        vwi.m15601P(moment, new ic00(hx60Var), hx60Var.mo10741m(moment.owner), act(), str, false);
    }

    /* JADX INFO: renamed from: n1 */
    public final /* synthetic */ void m4475n1(View view) throws Throwable {
        ptm.m13221d().m13224f(this.f2551I, ((DbObject) this.f2555K).id, this.f2562P);
        this.f2557L.interaction.haveMoreInteraction = false;
        xdl0.M(this.f2568V.mo15309E(), false);
        zi60.m17436w();
        p6j0.m12913c("e_view_more", zi60.m17435D(this.f2562P), vwb.Y("moment_id", ((DbObject) this.f2555K).id), vwb.Y("recommend_reason", this.f2557L.interaction.type));
    }

    /* JADX INFO: renamed from: o0 */
    public final String m4476o0(String str) {
        return str + f2535M0;
    }

    /* JADX INFO: renamed from: o1 */
    public final /* synthetic */ void m4477o1(Boolean bool) {
        if (act() != null) {
            Act act = act();
            Objects.requireNonNull(act);
            if (act.isDestroyed()) {
                return;
            }
            Act act2 = act();
            Objects.requireNonNull(act2);
            if (!act2.isFinishing() && bool.booleanValue()) {
                if (NullChecker.a(this.f2555K)) {
                    this.f2555K.showGreetView = false;
                }
                osi0.g("发送成功");
                m4414B0();
                vqg.f14276i.add(this.f2555K.owner);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        qz60 qz60Var = new qz60();
        this.f2568V = qz60Var;
        qz60Var.mo17510c(this);
        this.f2570a = this.f2568V.mo15310F();
        this.f2571b = this.f2568V.mo15326l();
        this.f2572c = this.f2568V.mo15335v();
        this.f2573d = this.f2568V.mo15336w();
        this.f2574e = this.f2568V.mo15324j();
        this.f2575f = this.f2568V.mo15306B();
        this.f2576g = this.f2568V.mo15314J();
        this.f2577h = this.f2568V.mo15327m();
        this.f2578i = this.f2568V.mo15313I();
        this.f2579j = this.f2568V.mo15312H();
        this.f2580k = this.f2568V.mo15337x();
        this.f2582l = this.f2568V.mo15339z();
        this.f2583m = this.f2568V.mo15305A();
        this.f2584n = this.f2568V.mo15338y();
        this.f2585o = this.f2568V.mo15325k();
        this.f2586p = this.f2568V.mo15311G();
        this.f2588q = this.f2568V.mo15328n();
        this.f2589r = this.f2568V.mo15308D();
        this.f2590s = this.f2568V.mo15319e();
        this.f2591t = this.f2568V.mo15321g();
        this.f2592u = this.f2568V.mo15320f();
        this.f2593v = this.f2568V.mo15322h();
        this.f2594w = this.f2568V.mo15323i();
        this.f2595x = this.f2568V.mo15318d();
        this.f2596y = this.f2568V.mo13799o();
        this.f2597z = this.f2568V.mo15307C();
        this.f2539A = this.f2568V.mo15334u();
        this.f2540B = this.f2568V.mo15331r();
        this.f2541C = this.f2568V.mo15333t();
        this.f2542D = this.f2568V.mo15332s();
        this.f2545F = this.f2568V.mo15316L();
        this.f2543E = this.f2568V.mo15330q();
        this.f2547G = this.f2568V.mo15315K();
        this.f2549H = this.f2568V.mo15329p();
        this.f2571b.setPadding(f2536N0, t100.d(0.0f), f2537O0, 0);
        if (NullChecker.a(this.f2580k)) {
            this.f2580k.setTextColor(act().getResources().getColor(e1c0.f7112K));
            this.f2580k.setTextSize(12.0f);
        }
        this.f2572c.setVisibility(0);
        m4461c2();
        if (nkg.m12210H()) {
            m4468i2();
            xdl0.E0(this.f2542D, new View.OnClickListener() { // from class: l.c070
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f6480a.m4400h1(view);
                }
            });
        }
    }

    /* JADX INFO: renamed from: p0 */
    public boolean m4478p0() {
        if (NullChecker.a(this.f2555K)) {
            Moment moment = this.f2555K;
            if (moment.isLive || moment.isVoiceLive) {
                return false;
            }
        }
        return vqg.m15524k0(this.f2563Q) && !nkg.m12255o();
    }

    /* JADX INFO: renamed from: p1 */
    public final /* synthetic */ void m4479p1(boolean z, MomentMessage momentMessage, MomentMessage momentMessage2) {
        if (z) {
            CoreService coreServiceM1140H = FeedModule.m1140H();
            Act act = act();
            String str = momentMessage.value;
            Moment moment = this.f2555K;
            String str2 = moment.owner;
            coreServiceM1140H.Vk(act, str, str2, ((DbObject) moment).id, str2, Channel.get(Channel.greeting_guide), new e30() { // from class: l.q070
                public final void call(Object obj) {
                    this.f12041a.m4477o1((Boolean) obj);
                }
            });
        }
        lsi0.w(R$string.f380J3);
        PhotoAlbumFeedFrag.m5436d5(this.f2563Q);
        if (NullChecker.b(this.f2555K)) {
            m4450V1(momentMessage, true, null);
        }
    }

    /* JADX INFO: renamed from: q0 */
    public boolean m4480q0() {
        return vqg.m15524k0(this.f2563Q);
    }

    /* JADX INFO: renamed from: q1 */
    public final /* synthetic */ void m4481q1(MomentMessage momentMessage, Throwable th) {
        if (NullChecker.b(this.f2555K)) {
            m4450V1(momentMessage, false, th);
        }
        App.d.k(th);
        t2h.m14425e(th);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: r0 */
    public final void m4482r0() {
        Intent intentM5932b = MomentDetailAct.C2150a.m5931a(getContext()).m5936f(this.f2562P).m5943m(((DbObject) this.f2555K).id).m5944n(this.f2555K.owner).m5950t(true).m5938h(act().getClass().getName().contains("NewMainAct")).m5945o(this.f2555K.momentValue).m5951u(true).m5949s(this.f2557L).m5932b();
        if (intentM5932b == null) {
            return;
        }
        getContext().startActivity(intentM5932b);
    }

    /* JADX INFO: renamed from: r1 */
    public final /* synthetic */ void m4483r1(final MomentMessage momentMessage, final boolean z) {
        act().duringCreated(FeedModule.f316d.m16508N6(this.f2555K.owner, momentMessage)).subscribe(mkd0.H(new e30() { // from class: l.l070
            public final void call(Object obj) {
                this.f9832a.m4479p1(z, momentMessage, (MomentMessage) obj);
            }
        }, new e30() { // from class: l.m070
            public final void call(Object obj) {
                this.f10172a.m4481q1(momentMessage, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: s0 */
    public final void m4484s0(String str) {
        Moment moment = this.f2555K;
        if (moment == null || !((DbObject) moment).id.equals(str)) {
            return;
        }
        this.f2548G0 = new BottomSheetDialog(act(), a8c0.f5634c);
        View viewInflate = LayoutInflater.from(act()).inflate(o6c0.f11235j0, (ViewGroup) null);
        this.f2548G0.setContentView(viewInflate);
        this.f2548G0.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.n070
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f10609a.m4445T0(dialogInterface);
            }
        });
        final VEditText vEditTextFindViewById = viewInflate.findViewById(b5c0.f5994Q1);
        final TextView textView = (TextView) viewInflate.findViewById(b5c0.f5958E1);
        vEditTextFindViewById.setHint(R$string.f340D);
        act().duringCreated(vEditTextFindViewById.i(true)).subscribe(mkd0.G(new e30() { // from class: l.u070
            public final void call(Object obj) {
                PhotoAlbumBottomView.m4379L(vEditTextFindViewById, textView, (CharSequence) obj);
            }
        }));
        this.f2548G0.setOnShowListener(new DialogInterface.OnShowListener() { // from class: l.v070
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                this.f14006a.m4436O0(vEditTextFindViewById, dialogInterface);
            }
        });
        final BottomSheetDialog bottomSheetDialog = this.f2548G0;
        textView.setOnClickListener(new View.OnClickListener() { // from class: l.w070
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f14351a.m4440Q0(vEditTextFindViewById, bottomSheetDialog, view);
            }
        });
        this.f2548G0.show();
    }

    /* JADX INFO: renamed from: s1 */
    public final /* synthetic */ void m4485s1(AnimatorSet animatorSet) {
        xdl0.C0(this.f2590s, t100.d(48.0f));
        animatorSet.start();
    }

    public void setCurrentFrag(PutongFrag putongFrag) {
        this.f2551I = putongFrag;
    }

    public void setRawFeedsCanGreeting(boolean z) {
        if (NullChecker.a(this.f2568V)) {
            this.f2568V.mo13783N(z);
        }
    }

    /* JADX INFO: renamed from: t0 */
    public final void m4486t0(String str, final boolean z) {
        Moment moment = this.f2555K;
        if (moment == null || !((DbObject) moment).id.equals(str)) {
            return;
        }
        if (!nkg.m12209G()) {
            m4464e2(false, z);
        } else if (NullChecker.a(vwb.r(vqg.f14276i, new w9j() { // from class: l.z070
            public final Object call(Object obj) {
                return this.f15548a.m4441R0((String) obj);
            }
        }))) {
            m4464e2(false, z);
        } else {
            vqg.m15467B(act(), this.f2555K.owner, new e30() { // from class: l.a170
                public final void call(Object obj) {
                    this.f5548a.m4443S0(z, (Boolean) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: t1 */
    public final /* synthetic */ void m4487t1(j760 j760Var) {
        if (NullChecker.a(this.f2555K) && ((DbObject) this.f2555K).id.equals(j760Var.a) && this.f2563Q == ((Integer) j760Var.b).intValue()) {
            m4459a2("preview_exit");
        }
    }

    /* JADX INFO: renamed from: u0, reason: merged with bridge method [inline-methods] */
    public final void m4469j1(final Moment moment, final ImageView imageView, FeedAutoScrollTextView feedAutoScrollTextView, final String str, final boolean z, final boolean z2) {
        act().duringCreated(this.f2566T.mo10746s(moment)).subscribe(mkd0.H(new e30() { // from class: l.r070
            public final void call(Object obj) {
                this.f12441a.m4447U0(moment, str, z, z2, (Envelope) obj);
            }
        }, new e30() { // from class: l.s070
            public final void call(Object obj) {
                this.f12767a.m4449V0(moment, imageView, str, z, z2, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: v0 */
    public final void m4490v0(String str) {
        Owner owner;
        ArrayList arrayList = new ArrayList();
        Live live = this.f2555K.live;
        arrayList.add(j760.a("anchorId", (live == null || (owner = live.anchor) == null) ? "" : owner.f264id));
        Live live2 = this.f2555K.live;
        arrayList.add(j760.a("liveId", live2 != null ? live2.f228id : ""));
        arrayList.add(j760.a("moment_id", ((DbObject) this.f2555K).id));
        arrayList.add(j760.a("owner_id", this.f2555K.owner));
        zi60.m17436w();
        arrayList.add(j760.a("moment_showfrom", zi60.m17435D(this.f2562P)));
        arrayList.add(j760.a("moment_type", zi60.m17436w().m17467y(this.f2555K)));
        arrayList.add(j760.a("comment_detail", "comment"));
        arrayList.add(j760.a("moment_distance", Long.valueOf(vqg.m15477G(this.f2555K))));
        arrayList.add(j760.a("moment_create_time", Long.valueOf(vqg.m15475F(this.f2555K))));
        arrayList.add(j760.a("owner_active_time", Long.valueOf(vqg.m15495S(FeedModule.f316d.m16628e8(this.f2555K.owner)))));
        arrayList.add(j760.a(Order.TYPE, Integer.valueOf(this.f2559M)));
        zvf0.u("e_comment", str, vqg.m15519i(this.f2562P, (j760[]) arrayList.toArray(new j760[0])));
    }

    /* JADX INFO: renamed from: v1 */
    public final /* synthetic */ void m4491v1(final String str, final List list, final Boolean bool) {
        if (!nkg.m12274x0()) {
            m4489u1(str, list, bool);
        } else {
            kyg.m11536e(act(), "p_fake_nearby_comments_popup", this.f2566T.mo10741m(this.f2555K.owner), new d30() { // from class: l.j070
                public final void call() {
                    this.f9170a.m4489u1(str, list, bool);
                }
            });
        }
    }

    /* JADX INFO: renamed from: w0, reason: merged with bridge method [inline-methods] */
    public final void m4489u1(String str, List<String> list, final Boolean bool) {
        final MomentMessage momentMessage = new MomentMessage();
        momentMessage.value = str;
        momentMessage.moment = ((DbObject) this.f2555K).id;
        momentMessage.owner = FeedModule.m1139F().userId();
        zi60.m17436w();
        momentMessage.momentShowFromType = zi60.m17435D(this.f2562P);
        String strTrim = str.trim();
        if (!vwb.J(list)) {
            for (int i = 0; i < list.size(); i++) {
                strTrim = strTrim.replace(list.get(i), "");
            }
        }
        if (qib0.Z.K(strTrim)) {
            v1h.m15189A0(act(), new d30() { // from class: l.o070
                public final void call() {
                    this.f10963a.m4451W0(momentMessage, bool);
                }
            }, false);
        } else {
            m4448U1(momentMessage, bool.booleanValue());
            m4410y0(strTrim);
        }
        m4496z0(this.f2552I0);
    }

    /* JADX INFO: renamed from: w1 */
    public final /* synthetic */ void m4493w1(AnimatorSet animatorSet) {
        xdl0.C0(this.f2539A, t100.d(42.0f));
        animatorSet.start();
    }

    /* JADX INFO: renamed from: x0 */
    public final void m4494x0(View view, boolean z) {
        if (NullChecker.a(view)) {
            xdl0.M(view, z);
        }
    }

    /* JADX INFO: renamed from: y1 */
    public final /* synthetic */ void m4495y1(j760 j760Var) {
        if (m4419E1() && NullChecker.a(this.f2555K) && this.f2555K.owner.equals(j760Var.a) && m4419E1()) {
            if (((Boolean) j760Var.b).booleanValue()) {
                m4466g2();
            } else {
                m4414B0();
            }
        }
    }

    /* JADX INFO: renamed from: z0 */
    public final void m4496z0(BottomSheetDialog bottomSheetDialog) {
        m4412A0(bottomSheetDialog, true);
    }

    /* JADX INFO: renamed from: z1 */
    public final /* synthetic */ void m4497z1(c cVar) {
        if (cVar == c.j && NullChecker.a(this.f2558L0)) {
            d.l().k(this.f2558L0);
            this.f2558L0 = null;
        }
    }

    public PhotoAlbumBottomView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2555K = null;
        this.f2557L = null;
        this.f2559M = -1;
        this.f2560N = null;
        this.f2562P = "";
        this.f2565S = false;
        this.f2587p0 = 0;
        this.f2546F0 = false;
        this.f2550H0 = new e30() { // from class: l.rz60
            public final void call(Object obj) {
                this.f12761a.m4462d1((j760) obj);
            }
        };
    }

    public PhotoAlbumBottomView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2555K = null;
        this.f2557L = null;
        this.f2559M = -1;
        this.f2560N = null;
        this.f2562P = "";
        this.f2565S = false;
        this.f2587p0 = 0;
        this.f2546F0 = false;
        this.f2550H0 = new e30() { // from class: l.rz60
            public final void call(Object obj) {
                this.f12761a.m4462d1((j760) obj);
            }
        };
    }
}
