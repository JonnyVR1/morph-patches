package com.p051p1.mobile.putong.feed.newui.photoalbum;

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
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.App;
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.android.p053ui.bubble.C4496a;
import com.p051p1.mobile.android.p053ui.bubble.C4499d;
import com.p051p1.mobile.putong.app.PutongFrag;
import com.p051p1.mobile.putong.core_api.api.serviceprovider.api.CoreService;
import com.p051p1.mobile.putong.data.Channel;
import com.p051p1.mobile.putong.data.DetectCategoryType;
import com.p051p1.mobile.putong.data.Envelope;
import com.p051p1.mobile.putong.data.Live;
import com.p051p1.mobile.putong.data.MessageLocation;
import com.p051p1.mobile.putong.data.Owner;
import com.p051p1.mobile.putong.data.PartialIdList;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.R$string;
import com.p051p1.mobile.putong.feed.data.InteractionReason;
import com.p051p1.mobile.putong.feed.data.LiveMultiCallInfo;
import com.p051p1.mobile.putong.feed.data.Moment;
import com.p051p1.mobile.putong.feed.data.MomentAdditionalData;
import com.p051p1.mobile.putong.feed.data.MomentMessage;
import com.p051p1.mobile.putong.feed.data.MomentSendFrom;
import com.p051p1.mobile.putong.feed.data.MomentViewerBox;
import com.p051p1.mobile.putong.feed.data.RawFeed;
import com.p051p1.mobile.putong.feed.newui.photoalbum.PhotoAlbumBottomView;
import com.p051p1.mobile.putong.feed.newui.photoalbum.adapter.MomentItem;
import com.p051p1.mobile.putong.feed.newui.photoalbum.basefrag.PhotoAlbumFeedBaseFrag;
import com.p051p1.mobile.putong.feed.newui.photoalbum.feed.PhotoAlbumFeedAct;
import com.p051p1.mobile.putong.feed.newui.photoalbum.feed.PhotoAlbumFeedFrag;
import com.p051p1.mobile.putong.feed.newui.photoalbum.momentdetail.MomentDetailAct;
import com.p051p1.mobile.putong.feed.newui.topic.qatopic.QATopicAggregationActivity;
import com.p051p1.mobile.putong.feed.newui.view.FeedAutoScrollTextView;
import com.p051p1.mobile.putong.feed.newui.view.FeedUserHeaderView;
import com.tantan.library.svga.AnimListener;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.SVGAnimationView;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import p151v.VDraweeView;
import p151v.VEditText;
import p151v.VFrame;
import p151v.VImage;
import p151v.VLinear;
import p151v.VRelative;
import p151v.VText;
import p153l.AbstractC20228t4;
import p153l.a30;
import p153l.at0;
import p153l.bnl0;
import p153l.byd0;
import p153l.cmg;
import p153l.er60;
import p153l.fgc0;
import p153l.ftn0;
import p153l.gch;
import p153l.gt0;
import p153l.hdc0;
import p153l.i4g0;
import p153l.i4h;
import p153l.jrg;
import p153l.jyb;
import p153l.k3h;
import p153l.k9c0;
import p153l.ksg;
import p153l.lbc0;
import p153l.mrb0;
import p153l.n570;
import p153l.nkh;
import p153l.o1j0;
import p153l.orb0;
import p153l.owi;
import p153l.p6i;
import p153l.pf60;
import p153l.psd0;
import p153l.pzi0;
import p153l.q8g0;
import p153l.qa00;
import p153l.qcj;
import p153l.qvm;
import p153l.r1j0;
import p153l.rk00;
import p153l.rzi;
import p153l.skh;
import p153l.tec0;
import p153l.tfj0;
import p153l.uqb0;
import p153l.w770;
import p153l.x20;
import p153l.x31;
import p153l.y20;
import p153l.zzg;

/* JADX INFO: loaded from: classes13.dex */
public class PhotoAlbumBottomView extends VFrame {

    /* JADX INFO: renamed from: M0 */
    public static String f41922M0 = " ";

    /* JADX INFO: renamed from: N0 */
    public static final int f41923N0 = qa00.m175859d(52.0f);

    /* JADX INFO: renamed from: O0 */
    public static final int f41924O0 = qa00.m175859d(6.0f);

    /* JADX INFO: renamed from: P0 */
    public static final Property<View, Integer> f41925P0 = new C11429b(Integer.TYPE, "viewHeight");

    /* JADX INFO: renamed from: A */
    public ConstraintLayout f41926A;

    /* JADX INFO: renamed from: B */
    public VDraweeView f41927B;

    /* JADX INFO: renamed from: C */
    public VText f41928C;

    /* JADX INFO: renamed from: D */
    public VText f41929D;

    /* JADX INFO: renamed from: E */
    public FeedUserHeaderView f41930E;

    /* JADX INFO: renamed from: E0 */
    public String f41931E0;

    /* JADX INFO: renamed from: F */
    public VText f41932F;

    /* JADX INFO: renamed from: F0 */
    public boolean f41933F0;

    /* JADX INFO: renamed from: G */
    public VImage f41934G;

    /* JADX INFO: renamed from: G0 */
    public BottomSheetDialog f41935G0;

    /* JADX INFO: renamed from: H */
    public LinearLayout f41936H;

    /* JADX INFO: renamed from: H0 */
    public y20<pf60<String, Boolean>> f41937H0;

    /* JADX INFO: renamed from: I */
    public PutongFrag f41938I;

    /* JADX INFO: renamed from: I0 */
    public BottomSheetDialog f41939I0;

    /* JADX INFO: renamed from: J */
    public boolean f41940J;

    /* JADX INFO: renamed from: J0 */
    public boolean f41941J0;

    /* JADX INFO: renamed from: K */
    public Moment f41942K;

    /* JADX INFO: renamed from: K0 */
    public boolean f41943K0;

    /* JADX INFO: renamed from: L */
    public RawFeed f41944L;

    /* JADX INFO: renamed from: L0 */
    public String f41945L0;

    /* JADX INFO: renamed from: M */
    public int f41946M;

    /* JADX INFO: renamed from: N */
    public MomentItem f41947N;

    /* JADX INFO: renamed from: O */
    public HashMap<String, Boolean> f41948O;

    /* JADX INFO: renamed from: P */
    public String f41949P;

    /* JADX INFO: renamed from: Q */
    public int f41950Q;

    /* JADX INFO: renamed from: R */
    public boolean f41951R;

    /* JADX INFO: renamed from: S */
    public boolean f41952S;

    /* JADX INFO: renamed from: T */
    public n570 f41953T;

    /* JADX INFO: renamed from: U */
    public int f41954U;

    /* JADX INFO: renamed from: V */
    public AbstractC20228t4 f41955V;

    /* JADX INFO: renamed from: W */
    public x20 f41956W;

    /* JADX INFO: renamed from: a */
    public ImageView f41957a;

    /* JADX INFO: renamed from: b */
    public VLinear f41958b;

    /* JADX INFO: renamed from: c */
    public RelativeLayout f41959c;

    /* JADX INFO: renamed from: d */
    public VRelative f41960d;

    /* JADX INFO: renamed from: e */
    public VLinear f41961e;

    /* JADX INFO: renamed from: f */
    public VText f41962f;

    /* JADX INFO: renamed from: g */
    public VText f41963g;

    /* JADX INFO: renamed from: h */
    public VText f41964h;

    /* JADX INFO: renamed from: i */
    public VLinear f41965i;

    /* JADX INFO: renamed from: j */
    public VText f41966j;

    /* JADX INFO: renamed from: k */
    public FeedAutoScrollTextView f41967k;

    /* JADX INFO: renamed from: k0 */
    public String f41968k0;

    /* JADX INFO: renamed from: l */
    public VFrame f41969l;

    /* JADX INFO: renamed from: m */
    public VImage f41970m;

    /* JADX INFO: renamed from: n */
    public VDraweeView f41971n;

    /* JADX INFO: renamed from: o */
    public TextView f41972o;

    /* JADX INFO: renamed from: p */
    public VText f41973p;

    /* JADX INFO: renamed from: p0 */
    public int f41974p0;

    /* JADX INFO: renamed from: q */
    public View f41975q;

    /* JADX INFO: renamed from: r */
    public VText f41976r;

    /* JADX INFO: renamed from: s */
    public ConstraintLayout f41977s;

    /* JADX INFO: renamed from: t */
    public VDraweeView f41978t;

    /* JADX INFO: renamed from: u */
    public VImage f41979u;

    /* JADX INFO: renamed from: v */
    public VText f41980v;

    /* JADX INFO: renamed from: w */
    public VText f41981w;

    /* JADX INFO: renamed from: x */
    public SVGAnimationView f41982x;

    /* JADX INFO: renamed from: y */
    public View f41983y;

    /* JADX INFO: renamed from: z */
    public VText f41984z;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.photoalbum.PhotoAlbumBottomView$a */
    public class C11428a extends AnimListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ImageView f41985a;

        public C11428a(ImageView imageView) {
            this.f41985a = imageView;
        }

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ void m64665b() {
            PhotoAlbumBottomView.this.f41960d.setEnabled(true);
            PhotoAlbumBottomView.this.f41982x.setVisibility(8);
            PhotoAlbumBottomView.this.f41982x.setAlpha(1.0f);
        }

        @Override // com.tantan.library.svga.AnimListener
        public void onFinished() {
            super.onFinished();
            PhotoAlbumBottomView.this.f41940J = false;
            if (!bnl0.m105529O0(PhotoAlbumBottomView.this.f41971n)) {
                this.f41985a.setVisibility(0);
            }
            Animator animatorM132170p = gt0.m132170p(PhotoAlbumBottomView.this.f41982x, "alpha", 0L, 250L, new LinearInterpolator(), 1.0f, 0.0f);
            gt0.m132160f(animatorM132170p, new Runnable() { // from class: l.h970
                @Override // java.lang.Runnable
                public final void run() {
                    this.f108323a.m64665b();
                }
            });
            animatorM132170p.start();
        }

        @Override // com.tantan.library.svga.AnimListener
        public void onStart() {
            super.onStart();
            PhotoAlbumBottomView.this.f41940J = true;
            this.f41985a.setVisibility(4);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.photoalbum.PhotoAlbumBottomView$b */
    public class C11429b extends Property<View, Integer> {
        public C11429b(Class cls, String str) {
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
        this.f41942K = null;
        this.f41944L = null;
        this.f41946M = -1;
        this.f41947N = null;
        this.f41949P = "";
        this.f41952S = false;
        this.f41974p0 = 0;
        this.f41933F0 = false;
        this.f41937H0 = new y20() { // from class: l.x770
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f192676a.m64628d1((pf60) obj);
            }
        };
    }

    /* JADX INFO: renamed from: L */
    public static /* synthetic */ void m64545L(VEditText vEditText, TextView textView, CharSequence charSequence) {
        Editable text = vEditText.getText();
        textView.setEnabled((text == null || text.toString().trim().isEmpty()) ? false : true);
    }

    /* JADX INFO: renamed from: Y */
    public static /* synthetic */ void m64557Y(Throwable th) {
    }

    /* JADX INFO: renamed from: b0 */
    public static /* synthetic */ void m64560b0(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h1 */
    public /* synthetic */ void m64566h1(View view) {
        String strM151174K = ksg.m151174K(this.f41949P, false);
        Moment moment = this.f41942K;
        i4g0.m138523u("e_greet_guidance", strM151174K, jyb.m147494Y("moments_user_id", moment == null ? "" : moment.owner));
        if (this.f41942K == null) {
            return;
        }
        FeedModule.m61406H().mo31733Vk(act(), this.f41928C.getText().toString(), this.f41942K.owner, null, null, Channel.get(Channel.greeting_guide), new y20() { // from class: l.a870
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f68888a.m64631f1((Boolean) obj);
            }
        });
    }

    /* JADX INFO: renamed from: s */
    public static /* synthetic */ void m64572s(Throwable th) {
    }

    /* JADX INFO: renamed from: y0 */
    private void m64576y0(final String str) {
        uqb0.f180394Z.m95960Q(str, "p_user_passive_show_nearby").subscribe(psd0.m173597H(new y20() { // from class: l.j870
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f118756a.m64618X0(str, (Boolean) obj);
            }
        }, new y20() { // from class: l.k870
            @Override // p153l.y20
            public final void call(Object obj) {
                PhotoAlbumBottomView.m64560b0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: A0 */
    public final void m64578A0(final BottomSheetDialog bottomSheetDialog, boolean z) {
        Animator animatorM132170p = gt0.m132170p(this.f41977s, "alpha", 0L, 300L, new LinearInterpolator(), 1.0f, 0.0f);
        gt0.m132160f(animatorM132170p, new Runnable() { // from class: l.h870
            @Override // java.lang.Runnable
            public final void run() {
                this.f108211a.m64620Y0(bottomSheetDialog);
            }
        });
        animatorM132170p.start();
    }

    /* JADX INFO: renamed from: A1 */
    public boolean m64579A1(Moment moment) {
        if (moment.isLive) {
            return orb0.m168901r(moment);
        }
        return false;
    }

    /* JADX INFO: renamed from: B0 */
    public void m64580B0() {
        bnl0.m105524M(this.f41926A, false);
        this.f41926A.setAlpha(1.0f);
        if (NullChecker.m82486a(this.f41938I) && NullChecker.m82486a(this.f41942K)) {
            ((PhotoAlbumFeedBaseFrag) this.f41938I).f42305F.remove(this.f41942K.f56859id);
            Moment moment = this.f41942K;
            moment.showGreetView = false;
            Moment momentM145813w7 = FeedModule.f39703d.m145813w7(moment.f56859id);
            if (NullChecker.m82486a(momentM145813w7)) {
                momentM145813w7.showGreetView = false;
            }
        }
    }

    /* JADX INFO: renamed from: B1 */
    public final void m64581B1(final Moment moment, final ImageView imageView, final FeedAutoScrollTextView feedAutoScrollTextView, final String str, final boolean z) {
        final boolean z2 = moment.haveLiked;
        if (m64629d2(str, moment) && z2) {
            x31.m209182a(act(), ksg.m151174K(str, z), moment, nkh.m163608l().m163610f());
            return;
        }
        PartialIdList partialIdList = moment.likes;
        int iMax = Math.max(partialIdList.count, partialIdList.ids.size());
        x20 x20Var = new x20() { // from class: l.v870
            @Override // p153l.x20
            public final void call() {
                this.f182853a.m64635j1(moment, imageView, feedAutoScrollTextView, str, z, z2);
            }
        };
        this.f41956W = x20Var;
        x20Var.call();
        if (moment.haveLiked) {
            FeedAutoScrollTextView feedAutoScrollTextView2 = this.f41967k;
            if (iMax == 1) {
                feedAutoScrollTextView2.m67486h(act().getString(R$string.f39935k), false);
            } else {
                feedAutoScrollTextView2.m67486h(q8g0.m175802h0(iMax - 1), false);
            }
        } else {
            if (this.f41943K0) {
                qvm.m178365d().m178367e(act(), this.f41938I, str, moment, "like", this.f41944L);
            }
            this.f41960d.setEnabled(false);
            this.f41982x.setVisibility(0);
            SVGALoader.with(act()).from(cmg.m111191S() ? "https://auto.tancdn.com/v1/raw/66db6975-8b2a-4fc6-be4b-454a6b5024c512.pdf" : "feed_like_newui.svga").autoPlay(true).repeatCount(1).animListener(new C11428a(imageView)).into(this.f41982x);
            FeedAutoScrollTextView feedAutoScrollTextView3 = this.f41967k;
            if (iMax == 0) {
                feedAutoScrollTextView3.m67486h("1", true);
            } else {
                feedAutoScrollTextView3.m67486h(q8g0.m175802h0(iMax + 1), true);
            }
        }
        m64598L1(!moment.haveLiked, imageView);
    }

    /* JADX INFO: renamed from: C1 */
    public void m64582C1(Live live, Act act, String str) {
        if (NullChecker.m82487b(live)) {
            orb0.m168878G(act, live, str, live.recommendInfo.category);
        }
    }

    /* JADX INFO: renamed from: D0 */
    public final void m64583D0(int i) {
        m64600M1(i);
        if (NullChecker.m82486a(this.f41942K.messages)) {
            m64590H1(this.f41942K.messages.count);
        }
        m64598L1(this.f41942K.haveLiked, this.f41970m);
        this.f41960d.setOnClickListener(new View.OnClickListener() { // from class: l.n870
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f140656a.m64622Z0(view);
            }
        });
        this.f41961e.setOnClickListener(new View.OnClickListener() { // from class: l.o870
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f145361a.m64624a1(view);
            }
        });
    }

    /* JADX INFO: renamed from: E0 */
    public final boolean m64584E0() {
        if (bnl0.m105529O0(this.f41966j) || !cmg.m111192T()) {
            return false;
        }
        if (TextUtils.equals(this.f41949P, "from_mine_tab_album")) {
            return true;
        }
        return TextUtils.equals(this.f41949P, "from_album") && mrb0.m159625C().f56859id.equals(this.f41942K.owner);
    }

    /* JADX INFO: renamed from: E1 */
    public boolean m64585E1() {
        return TextUtils.equals(this.f41949P, "from_discover_dating") || TextUtils.equals(this.f41949P, "from_nearby_focus") || TextUtils.equals(this.f41949P, "from_like");
    }

    /* JADX INFO: renamed from: F1 */
    public boolean m64586F1(boolean z, final n570 n570Var, MomentItem momentItem, HashMap<String, Boolean> map, final String str, final boolean z2, int i, int i2, RawFeed rawFeed, int i3, boolean z3, boolean z4, boolean z5) {
        this.f41947N = momentItem;
        this.f41948O = map;
        final Moment moment = momentItem.f42199d;
        this.f41944L = rawFeed;
        this.f41946M = i3;
        m64660x0(this.f41960d, !moment.isLive);
        m64660x0(this.f41961e, !moment.isLive);
        m64660x0(this.f41976r, false);
        this.f41949P = str;
        this.f41950Q = i;
        this.f41952S = z;
        this.f41951R = z2;
        this.f41953T = n570Var;
        this.f41954U = i2;
        this.f41941J0 = z4;
        this.f41943K0 = z5;
        boolean z6 = (this.f41942K == null && NullChecker.m82487b(moment) && !moment.f56859id.startsWith("fake_id_")) || (NullChecker.m82486a(this.f41942K) && NullChecker.m82487b(moment) && !this.f41942K.f56859id.equals(moment.f56859id) && !moment.f56859id.startsWith("fake_id_"));
        if (NullChecker.m82486a(this.f41982x) && bnl0.m105529O0(this.f41982x) && this.f41982x.isAnimating() && NullChecker.m82486a(this.f41942K) && NullChecker.m82486a(moment) && !TextUtils.equals(this.f41942K.f56859id, moment.f56859id)) {
            this.f41982x.stopAnimation(false);
        }
        this.f41942K = moment;
        this.f41933F0 = z3;
        this.f41955V.mo124398a(this);
        boolean zM64595K0 = m64595K0();
        AbstractC20228t4 abstractC20228t4 = this.f41955V;
        if (zM64595K0) {
            abstractC20228t4.mo124418l().setVisibility(8);
        } else {
            abstractC20228t4.mo124418l().setVisibility(0);
        }
        boolean zM64589H0 = m64589H0();
        RelativeLayout relativeLayout = this.f41959c;
        if (zM64589H0) {
            m64660x0(relativeLayout, false);
        } else {
            m64660x0(relativeLayout, true);
        }
        m64608R1(moment);
        if (NullChecker.m82487b(this.f41966j)) {
            m64588G1(this.f41966j);
        }
        m64592I1(this.f41963g);
        m64603O1(this.f41964h, moment);
        m64610S1(moment);
        jyb.m147537z(jyb.m147507f0(this.f41930E, this.f41932F, this.f41934G), new y20() { // from class: l.b870
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f75399a.m64638l1(moment, str, z2, (View) obj);
            }
        });
        m64605P1(moment);
        if (NullChecker.m82486a(this.f41957a)) {
            if (moment.isLive && FeedModule.m61405F().userId().equals(moment.live.anchor.f39651id)) {
                m64660x0(this.f41957a, false);
            } else {
                this.f41957a.setVisibility(0);
                this.f41957a.setOnClickListener(new View.OnClickListener() { // from class: l.c870
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f80181a.m64640m1(moment, n570Var, str, view);
                    }
                });
            }
            if (ksg.m151187V(moment)) {
                this.f41957a.setVisibility(8);
            }
        }
        PartialIdList partialIdList = moment.likes;
        m64583D0(Math.max(partialIdList.count, partialIdList.ids.size()));
        this.f41955V.mo124400b(this);
        if (NullChecker.m82487b(this.f41942K)) {
            Moment moment2 = this.f41942K;
            er60.m122104w();
            moment2.setMomentShowFrom(er60.m122103D(str));
        }
        if (i == 2) {
            bnl0.m105548c0(this, qa00.m175859d(3.0f));
        }
        if ((TextUtils.isEmpty(this.f41973p.getText()) || this.f41973p.getVisibility() != 0) && ((TextUtils.isEmpty(this.f41963g.getText()) || this.f41963g.getVisibility() != 0) && ((TextUtils.isEmpty(this.f41962f.getText()) || this.f41962f.getVisibility() != 0) && !((!TextUtils.isEmpty(this.f41964h.getText()) && this.f41964h.getVisibility() == 0) || this.f41966j.getVisibility() == 0 || m64601N0(this.f41984z))))) {
            this.f41965i.setVisibility(8);
        } else {
            this.f41965i.setVisibility(0);
        }
        if (cmg.m111183K() && TextUtils.equals("from_like", str) && NullChecker.m82486a(rawFeed)) {
            bnl0.m105524M(this.f41981w, !rawFeed.showLikeSplitLine && rawFeed.showUnreadSplitLine);
        }
        m64594J1();
        if (User.isWisdomStar(moment.owner)) {
            this.f41965i.setVisibility(8);
            bnl0.m105554f0(this.f41958b, 0);
            bnl0.m105540X(this.f41955V.mo124428v(), 0);
            bnl0.m105537U(this.f41955V.mo124428v(), 0);
        }
        return z6;
    }

    /* JADX INFO: renamed from: G0 */
    public final boolean m64587G0(Moment moment) {
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

    /* JADX INFO: renamed from: G1 */
    public final void m64588G1(View view) {
        if (ksg.m151209i0(this.f41950Q)) {
            bnl0.m105524M(view, false);
        } else if (owi.m169567c() && TEnum.equals(this.f41942K.settings.visibility, "selfOnly")) {
            bnl0.m105524M(view, true);
        } else {
            bnl0.m105524M(view, false);
        }
    }

    /* JADX INFO: renamed from: H0 */
    public final boolean m64589H0() {
        LiveMultiCallInfo liveMultiCallInfo;
        Moment moment = this.f41942K;
        return moment != null && (liveMultiCallInfo = moment.multiCallInfo) != null && liveMultiCallInfo.onGoing && TextUtils.equals(moment.liveState, "onMultiCall");
    }

    /* JADX INFO: renamed from: H1 */
    public void m64590H1(int i) {
        TextView textView = this.f41972o;
        if (i > 0) {
            textView.setText(q8g0.m175802h0(i));
        } else {
            textView.setText(R$string.f39886d);
        }
    }

    /* JADX INFO: renamed from: I0 */
    public final boolean m64591I0() {
        return "from_mine_tab_album".equals(this.f41949P) || "from_profile_album".equals(this.f41949P) || this.f41951R;
    }

    /* JADX INFO: renamed from: I1 */
    public final void m64592I1(VText vText) {
        if (ksg.m151209i0(this.f41950Q) || m64591I0()) {
            bnl0.m105524M(vText, false);
            return;
        }
        bnl0.m105524M(vText, true);
        if (NullChecker.m82486a(vText)) {
            Moment moment = this.f41942K;
            if (moment.isLive) {
                vText.setText(p6i.m170908q(moment.live.startTime));
                return;
            }
            if (moment.isVoiceLive) {
                vText.setText(p6i.m170908q(moment.voiceLive.startTime));
                return;
            }
            if (!"qa_recommend".equals(this.f41949P) || !skh.m186450b()) {
                vText.setText(m64642o0(p6i.m170908q(this.f41942K.createdTime)));
            } else if (pzi0.m174454o() < this.f41942K.getRecommendTime()) {
                vText.setText("1秒以前推荐");
            } else {
                vText.setText(ksg.m151159C0(this.f41942K.getRecommendTime()));
            }
        }
    }

    /* JADX INFO: renamed from: J0 */
    public final boolean m64593J0(boolean z, boolean z2) {
        return z && z2;
    }

    /* JADX INFO: renamed from: J1 */
    public void m64594J1() {
        InteractionReason interactionReason;
        RawFeed rawFeed = this.f41944L;
        if (rawFeed == null || (interactionReason = rawFeed.interaction) == null || !interactionReason.haveMoreInteraction) {
            bnl0.m105524M(this.f41955V.mo124381E(), false);
        } else {
            bnl0.m105524M(this.f41955V.mo124381E(), true);
            bnl0.m105509E0(this.f41955V.mo124381E(), new View.OnClickListener() { // from class: l.q870
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) throws Throwable {
                    this.f156079a.m64641n1(view);
                }
            });
        }
    }

    /* JADX INFO: renamed from: K0 */
    public final boolean m64595K0() {
        Moment moment = this.f41942K;
        return m64593J0(moment.isVoiceLive, moment.momentVoiceLiveInfos != null);
    }

    /* JADX INFO: renamed from: K1 */
    public final void m64596K1(boolean z) {
        this.f41967k.clearAnimation();
        FeedAutoScrollTextView feedAutoScrollTextView = this.f41967k;
        if (z) {
            boolean zEquals = TextUtils.equals(feedAutoScrollTextView.getText(), act().getString(R$string.f39935k));
            FeedAutoScrollTextView feedAutoScrollTextView2 = this.f41967k;
            if (zEquals) {
                feedAutoScrollTextView2.m67486h("1", true);
                return;
            } else {
                feedAutoScrollTextView2.m67486h(q8g0.m175802h0(Integer.parseInt(feedAutoScrollTextView2.getText()) + 1), true);
                return;
            }
        }
        boolean zEquals2 = TextUtils.equals(feedAutoScrollTextView.getText(), "1");
        FeedAutoScrollTextView feedAutoScrollTextView3 = this.f41967k;
        if (zEquals2) {
            feedAutoScrollTextView3.m67486h(act().getString(R$string.f39935k), false);
        } else {
            feedAutoScrollTextView3.m67486h(q8g0.m175802h0(Integer.parseInt(feedAutoScrollTextView3.getText()) - 1), false);
        }
    }

    /* JADX INFO: renamed from: L0 */
    public boolean m64597L0() {
        return act() instanceof QATopicAggregationActivity;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0062  */
    /* JADX INFO: renamed from: L1 */
    public final void m64598L1(boolean z, ImageView imageView) {
        boolean z2;
        if (!z) {
            bnl0.m105524M(imageView, true);
            bnl0.m105524M(this.f41971n, false);
            this.f41967k.setTextColor(act().getResources().getColor(k9c0.f124479K));
            imageView.setImageResource(lbc0.f131010c3);
            imageView.setImageTintList(null);
            return;
        }
        if (!m64629d2(this.f41949P, this.f41942K)) {
            if (!this.f41940J) {
                bnl0.m105524M(imageView, true);
            }
            bnl0.m105524M(this.f41971n, false);
            this.f41967k.setTextColor(act().getResources().getColor(k9c0.f124521n));
            imageView.setImageResource(lbc0.f130979Y2);
            imageView.setImageTintList(null);
            return;
        }
        boolean z3 = bnl0.m105529O0(imageView) && this.f41974p0 == 0 && TextUtils.equals(this.f41931E0, this.f41942K.f56859id);
        int i = this.f41974p0;
        if (i > 0) {
            Moment moment = this.f41942K;
            if (i == moment.attitudeId || !TextUtils.equals(this.f41931E0, moment.f56859id)) {
                z2 = false;
            } else {
                z2 = true;
            }
        } else {
            z2 = false;
        }
        bnl0.m105524M(imageView, false);
        bnl0.m105524M(this.f41971n, true);
        String strM163614j = nkh.m163608l().m163614j(this.f41942K.attitudeId);
        if (!TextUtils.isEmpty(strM163614j)) {
            uqb0.f180374G.m127115L0(this.f41971n, strM163614j);
        }
        if (z3 || z2) {
            nkh.m163608l().m163617n(this.f41971n, this.f41969l);
        }
        Moment moment2 = this.f41942K;
        this.f41974p0 = moment2.attitudeId;
        this.f41931E0 = moment2.f56859id;
    }

    /* JADX INFO: renamed from: M0 */
    public boolean m64599M0() {
        Moment moment = this.f41942K;
        if (moment == null || jyb.m147479J(moment.mTopicList)) {
            return false;
        }
        return this.f41942K.mTopicList.get(0).isTopicVoteType();
    }

    /* JADX INFO: renamed from: M1 */
    public void m64600M1(int i) {
        this.f41967k.clearAnimation();
        FeedAutoScrollTextView feedAutoScrollTextView = this.f41967k;
        if (i > 0) {
            feedAutoScrollTextView.setText(q8g0.m175802h0(i));
        } else {
            feedAutoScrollTextView.setText(act().getString(R$string.f39935k));
        }
    }

    /* JADX INFO: renamed from: N0 */
    public final boolean m64601N0(View view) {
        return view != null && view.getVisibility() == 0;
    }

    /* JADX INFO: renamed from: O0 */
    public final /* synthetic */ void m64602O0(VEditText vEditText, DialogInterface dialogInterface) {
        vEditText.requestFocus();
        act().showInput(vEditText, 2);
    }

    /* JADX INFO: renamed from: O1 */
    public final void m64603O1(VText vText, Moment moment) {
        if (m64584E0()) {
            m64660x0(vText, false);
            return;
        }
        if (NullChecker.m82486a(vText)) {
            if ((act() instanceof PhotoAlbumFeedAct) || "from_profile_album".equals(this.f41949P) || "from_mine_tab_album".equals(this.f41949P)) {
                if (NullChecker.m82486a(moment.location)) {
                    String strM151234v = ksg.m151234v(moment.location);
                    vText.setText(TextUtils.isEmpty(strM151234v) ? "" : m64642o0(strM151234v));
                }
                User userMo137270m = this.f41953T.mo137270m(moment.owner);
                if (moment.isLive && NullChecker.m82486a(userMo137270m) && NullChecker.m82486a(userMo137270m.location)) {
                    vText.setText(m64642o0(q8g0.m175811p(userMo137270m.location.distance, true)));
                    m64660x0(vText, true);
                } else {
                    m64660x0(vText, false);
                }
                if (moment.isLive) {
                    return;
                }
                m64660x0(vText, moment.location != null);
            }
        }
    }

    /* JADX INFO: renamed from: P0 */
    public final /* synthetic */ void m64604P0(MomentMessage momentMessage) {
        m64614U1(momentMessage, false);
    }

    /* JADX INFO: renamed from: P1 */
    public final void m64605P1(Moment moment) {
        MomentSendFrom momentSendFrom;
        MomentAdditionalData momentAdditionalData = moment.additionalData;
        if (momentAdditionalData == null || (momentSendFrom = momentAdditionalData.sendFrom) == null || TextUtils.isEmpty(momentSendFrom.name)) {
            bnl0.m105524M(this.f41984z, false);
            return;
        }
        bnl0.m105524M(this.f41984z, true);
        this.f41984z.setText(m64642o0("来自" + moment.additionalData.sendFrom.name));
    }

    /* JADX INFO: renamed from: Q0 */
    public final /* synthetic */ void m64606Q0(VEditText vEditText, BottomSheetDialog bottomSheetDialog, View view) {
        act().hideInput(vEditText);
        final MomentMessage momentMessage = new MomentMessage();
        momentMessage.value = vEditText.getText().toString();
        momentMessage.moment = this.f41942K.f56859id;
        momentMessage.owner = FeedModule.m61405F().userId();
        er60.m122104w();
        momentMessage.momentShowFromType = er60.m122103D(this.f41949P);
        String strTrim = vEditText.getText().toString().trim();
        if (uqb0.f180394Z.m95954K(strTrim)) {
            k3h.m148027A0(act(), new x20() { // from class: l.f870
                @Override // p153l.x20
                public final void call() {
                    this.f97703a.m64604P0(momentMessage);
                }
            }, false);
        } else {
            m64614U1(momentMessage, false);
            m64576y0(strTrim);
        }
        m64662z0(bottomSheetDialog);
    }

    /* JADX INFO: renamed from: R0 */
    public final /* synthetic */ Boolean m64607R0(String str) {
        return Boolean.valueOf(TextUtils.equals(str, this.f41942K.owner));
    }

    /* JADX INFO: renamed from: R1 */
    public final void m64608R1(Moment moment) {
        MessageLocation messageLocation = moment.location;
        if (messageLocation == null || TextUtils.isEmpty(messageLocation.name) || m64599M0() || m64597L0()) {
            this.f41962f.setVisibility(8);
        } else {
            this.f41962f.setVisibility(0);
            this.f41962f.setText(moment.location.name);
        }
    }

    /* JADX INFO: renamed from: S0 */
    public final /* synthetic */ void m64609S0(boolean z, Boolean bool) {
        m64630e2(bool.booleanValue(), z);
        if (bool.booleanValue()) {
            return;
        }
        ksg.f128568i.add(this.f41942K.owner);
        if (bnl0.m105529O0(this.f41926A)) {
            m64580B0();
        }
    }

    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: S1 */
    public final void m64610S1(Moment moment) {
        if (!mrb0.m159625C().f56859id.equals(moment.owner)) {
            m64660x0(this.f41973p, false);
            m64619X1();
            return;
        }
        if (m64584E0()) {
            m64660x0(this.f41973p, false);
            m64612T1();
            ArrayList arrayListM147507f0 = jyb.m147507f0(new String[0]);
            if (NullChecker.m82486a(moment) && NullChecker.m82486a(moment.momentViewer) && !jyb.m147479J(moment.momentViewer.viewers)) {
                int iMin = Math.min(3, moment.momentViewer.viewers.size());
                for (int i = 0; i < iMin; i++) {
                    arrayListM147507f0.add(moment.momentViewer.viewers.get(i).userId);
                }
            }
            Collections.reverse(arrayListM147507f0);
            m64660x0(this.f41932F, true);
            m64660x0(this.f41930E, true);
            m64660x0(this.f41955V.mo124389M(), true);
            bnl0.m105524M(this.f41934G, true ^ jyb.m147479J(arrayListM147507f0));
            bnl0.m105538V(this.f41932F, jyb.m147479J(arrayListM147507f0) ? 0 : qa00.m175859d(4.0f));
            this.f41930E.m67552k0();
            this.f41930E.m67554n0(arrayListM147507f0, false);
            return;
        }
        if (!(cmg.m111247z() && moment.views == 0) && moment.views <= 0) {
            m64660x0(this.f41973p, false);
            m64619X1();
            return;
        }
        m64619X1();
        m64660x0(this.f41973p, true);
        int i2 = moment.views;
        VText vText = this.f41973p;
        if (i2 > 1) {
            vText.setText(m64642o0(String.format(act().getString(R$string.f39958n1), q8g0.m175803i0(moment.views))));
        } else {
            vText.setText(m64642o0(String.format(act().getString(R$string.f39965o1), q8g0.m175803i0(moment.views))));
        }
        if (cmg.m111192T()) {
            if (cmg.m111247z()) {
                this.f41973p.setText(q8g0.m175803i0(moment.views) + "浏览");
            } else {
                int i3 = moment.views;
                VText vText2 = this.f41973p;
                if (i3 == 0) {
                    vText2.setText("");
                } else {
                    vText2.setText(q8g0.m175803i0(moment.views) + "浏览");
                }
            }
        }
        m64619X1();
    }

    /* JADX INFO: renamed from: T0 */
    public final /* synthetic */ void m64611T0(DialogInterface dialogInterface) {
        act().alwaysHideInput();
    }

    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: T1 */
    public final void m64612T1() {
        Moment moment = this.f41942K;
        if (moment == null || moment.views == 0) {
            bnl0.m105524M(this.f41934G, false);
            this.f41932F.setText("0浏览");
            return;
        }
        this.f41932F.setText(q8g0.m175803i0(this.f41942K.views) + "浏览");
    }

    /* JADX INFO: renamed from: U0 */
    public final /* synthetic */ void m64613U0(Moment moment, String str, boolean z, boolean z2, Envelope envelope) {
        if (cmg.m111191S() && NullChecker.m82486a(envelope)) {
            int i = envelope.meta.code;
            Objects.requireNonNull(FeedModule.f39703d);
            if (i == 20101) {
                m64637k2();
                if (!TextUtils.isEmpty(moment.owner)) {
                    User userM145688e8 = FeedModule.f39703d.m145688e8(moment.owner);
                    if (NullChecker.m82486a(userM145688e8) && User.isMatched(userM145688e8)) {
                        FeedModule.m61406H().mo31675Ap(act(), userM145688e8, false, userM145688e8.localRelationship);
                    }
                }
            }
        }
        er60.m122104w().m122118g(moment, str, z, 201, z2, this.f41946M);
        if (m64646q0() && moment.haveLiked) {
            m64625a2("like_click");
        }
        Moment momentMo137272y = this.f41953T.mo137272y(moment.f56859id);
        if (NullChecker.m82486a(momentMo137272y) && momentMo137272y.haveLiked && m64623Z1(str) && momentMo137272y.attitudes.count > nkh.m163608l().m163612h()) {
            m64621Y1();
        }
    }

    /* JADX INFO: renamed from: U1 */
    public final void m64614U1(final MomentMessage momentMessage, final boolean z) {
        ksg.m151220o(act(), momentMessage.value, DetectCategoryType.get("comment"), "comment", ksg.m151174K(this.f41949P, this.f41951R), new x20() { // from class: l.m870
            @Override // p153l.x20
            public final void call() {
                this.f135152a.m64649r1(momentMessage, z);
            }
        });
    }

    /* JADX INFO: renamed from: V0 */
    public final /* synthetic */ void m64615V0(Moment moment, ImageView imageView, String str, boolean z, boolean z2, Throwable th) {
        i4h.m138538g(th);
        m64598L1(moment.haveLiked, imageView);
        er60.m122104w().m122120i(moment, str, z, th, z2, this.f41946M);
        m64596K1(z2);
    }

    /* JADX INFO: renamed from: V1 */
    public final void m64616V1(MomentMessage momentMessage, boolean z, Throwable th) {
        tfj0.m190943f("e_comment_send", ksg.m151174K(this.f41949P, this.f41951R), tfj0.C20302a.m190949g("moment_id", this.f41942K.f56859id), tfj0.C20302a.m190949g("owner_id", this.f41942K.owner), tfj0.C20302a.m190949g("comment_user_id", FeedModule.m61405F().userId()), tfj0.C20302a.m190949g("comment_state", z ? "success" : "fail"), tfj0.C20302a.m190949g("comment_detail", "comment"), tfj0.C20302a.m190949g("trigger_time", this.f41968k0), th == null ? null : tfj0.C20302a.m190949g("error", th.toString()));
    }

    /* JADX INFO: renamed from: W0 */
    public final /* synthetic */ void m64617W0(MomentMessage momentMessage, Boolean bool) {
        m64614U1(momentMessage, bool.booleanValue());
    }

    /* JADX INFO: renamed from: X0 */
    public final /* synthetic */ void m64618X0(String str, Boolean bool) {
        if (bool.booleanValue()) {
            k3h.m148045J0(act(), str);
        }
    }

    /* JADX INFO: renamed from: X1 */
    public final void m64619X1() {
        m64660x0(this.f41932F, false);
        m64660x0(this.f41930E, false);
        m64660x0(this.f41934G, false);
        bnl0.m105524M(this.f41955V.mo124389M(), false);
    }

    /* JADX INFO: renamed from: Y0 */
    public final /* synthetic */ void m64620Y0(BottomSheetDialog bottomSheetDialog) {
        bnl0.m105524M(this.f41977s, false);
        this.f41977s.setAlpha(1.0f);
        if (NullChecker.m82486a(this.f41938I) && NullChecker.m82486a(this.f41942K)) {
            ((PhotoAlbumFeedBaseFrag) this.f41938I).f42303D.remove(this.f41942K.f56859id);
        }
        if (NullChecker.m82486a(bottomSheetDialog)) {
            bottomSheetDialog.dismiss();
        }
    }

    /* JADX INFO: renamed from: Y1 */
    public final void m64621Y1() {
        int[] iArr = new int[2];
        this.f41972o.getLocationOnScreen(iArr);
        Point point = new Point();
        int iM175859d = iArr[1] - qa00.m175859d(116.0f);
        if (iM175859d < bnl0.m105511F0() + qa00.m175859d(44.0f) + qa00.m175859d(12.0f)) {
            iM175859d = iArr[1];
        }
        point.y = iM175859d;
        point.x = qa00.m175859d(52.0f);
        new jrg(act(), point, this.f41942K, ksg.m151174K(this.f41949P, this.f41951R)).m146735a(this.f41972o);
    }

    /* JADX INFO: renamed from: Z0 */
    public final /* synthetic */ void m64622Z0(View view) {
        boolean zM64579A1 = m64579A1(this.f41942K);
        Moment moment = this.f41942K;
        if (zM64579A1) {
            m64582C1(moment.live, act(), orb0.m168896m(this.f41942K.live, this.f41949P));
            return;
        }
        if (!moment.isVoiceLive) {
            m64581B1(moment, this.f41970m, this.f41967k, this.f41949P, this.f41951R);
            return;
        }
        ftn0 ftn0VarMo68412M6 = FeedModule.m61407M().mo68412M6();
        Act act = act();
        Moment moment2 = this.f41942K;
        ftn0VarMo68412M6.mo127345p(act, moment2.voiceLive.f40098id, moment2.owner, orb0.m168897n("", this.f41949P), "");
    }

    /* JADX INFO: renamed from: Z1 */
    public boolean m64623Z1(String str) {
        return cmg.m111196X() && TextUtils.equals(str, "from_discover_discussion");
    }

    /* JADX INFO: renamed from: a1 */
    public final /* synthetic */ void m64624a1(View view) {
        boolean zM64579A1 = m64579A1(this.f41942K);
        Moment moment = this.f41942K;
        if (zM64579A1) {
            m64582C1(moment.live, act(), orb0.m168896m(this.f41942K.live, this.f41949P));
        } else if (moment.isVoiceLive) {
            ftn0 ftn0VarMo68412M6 = FeedModule.m61407M().mo68412M6();
            Act act = act();
            Moment moment2 = this.f41942K;
            ftn0VarMo68412M6.mo127345p(act, moment2.voiceLive.f40098id, moment2.owner, orb0.m168897n("", this.f41949P), "");
        } else {
            m64648r0();
        }
        String strM151174K = ksg.m151174K(this.f41949P, this.f41951R);
        if (!TextUtils.isEmpty(strM151174K)) {
            m64656v0(strM151174K);
        }
        if (this.f41943K0) {
            qvm.m178365d().m178367e(act(), this.f41938I, this.f41949P, this.f41942K, "click", this.f41944L);
        }
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0015  */
    /* JADX INFO: renamed from: a2 */
    public void m64625a2(String str) {
        boolean z;
        if (NullChecker.m82486a(this.f41942K)) {
            Moment moment = this.f41942K;
            if (moment.isLive || moment.isVoiceLive) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        if ((NullChecker.m82486a(this.f41942K) && !jyb.m147479J(this.f41942K.mTopicList) && this.f41942K.mTopicList.get(0).isTopicVoteType()) || bnl0.m105529O0(this.f41977s) || z || !gch.m129869a()) {
            return;
        }
        if (cmg.m111180H() && this.f41942K.showGreetView) {
            return;
        }
        this.f41968k0 = str;
        tfj0.m190942e("e_quick_comment", ksg.m151174K(this.f41949P, this.f41951R), pf60.m172085a("trigger_time", str));
        if (NullChecker.m82486a(this.f41938I)) {
            PutongFrag putongFrag = this.f41938I;
            if (putongFrag instanceof PhotoAlbumFeedBaseFrag) {
                PhotoAlbumFeedBaseFrag photoAlbumFeedBaseFrag = (PhotoAlbumFeedBaseFrag) putongFrag;
                if (photoAlbumFeedBaseFrag.f42303D == null) {
                    photoAlbumFeedBaseFrag.f42303D = new HashMap<>();
                }
                if (NullChecker.m82486a(this.f41942K)) {
                    photoAlbumFeedBaseFrag.f42303D.put(this.f41942K.f56859id, Boolean.TRUE);
                    m64626b2();
                }
            }
        }
    }

    public Act act() {
        return (Act) getContext();
    }

    /* JADX INFO: renamed from: b2 */
    public final void m64626b2() {
        bnl0.m105505C0(this.f41977s, 0);
        this.f41978t.setAlpha(0.0f);
        this.f41980v.setAlpha(0.0f);
        bnl0.m105524M(this.f41977s, true);
        bnl0.m105524M(this.f41979u, cmg.m111247z());
        if (cmg.m111247z()) {
            this.f41979u.setAlpha(0.0f);
        }
        ConstraintLayout constraintLayout = this.f41977s;
        Property<View, Integer> property = f41925P0;
        Animator animatorM132169o = gt0.m132169o(constraintLayout, property, 0, qa00.m175859d(48.0f));
        animatorM132169o.setDuration(200L);
        Animator animatorM132170p = gt0.m132170p(this.f41978t, "alpha", 0L, 200L, new LinearInterpolator(), 0.0f, 1.0f);
        Animator animatorM132167m = gt0.m132167m(this.f41978t, property, 0L, 200L, new LinearInterpolator(), 0, qa00.m175859d(24.0f));
        Animator animatorM132170p2 = gt0.m132170p(this.f41979u, "alpha", 0L, 200L, new LinearInterpolator(), 0.0f, 1.0f);
        Animator animatorM132167m2 = gt0.m132167m(this.f41979u, property, 0L, 200L, new LinearInterpolator(), 0, qa00.m175859d(21.0f));
        Animator animatorM132170p3 = gt0.m132170p(this.f41980v, "alpha", 0L, 200L, new LinearInterpolator(), 0.0f, 1.0f);
        final AnimatorSet animatorSet = new AnimatorSet();
        AnimatorSet.Builder builderPlay = animatorSet.play(animatorM132170p);
        builderPlay.with(animatorM132170p3).with(animatorM132167m);
        if (cmg.m111247z()) {
            builderPlay.with(animatorM132170p2).with(animatorM132167m2);
        }
        gt0.m132160f(animatorM132169o, new Runnable() { // from class: l.g870
            @Override // java.lang.Runnable
            public final void run() {
                this.f102647a.m64651s1(animatorSet);
            }
        });
        animatorM132169o.start();
    }

    /* JADX INFO: renamed from: c2 */
    public final void m64627c2() {
        act().duringCreated(PhotoAlbumFeedFrag.f42472E).subscribe(psd0.m173597H(new y20() { // from class: l.y770
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f197748a.m64653t1((pf60) obj);
            }
        }, new y20() { // from class: l.z770
            @Override // p153l.y20
            public final void call(Object obj) {
                PhotoAlbumBottomView.m64557Y((Throwable) obj);
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: d1 */
    public final /* synthetic */ void m64628d1(pf60 pf60Var) {
        if (cmg.m111247z()) {
            m64652t0((String) pf60Var.f152156a, ((Boolean) pf60Var.f152157b).booleanValue());
        } else {
            m64650s0((String) pf60Var.f152156a);
        }
    }

    /* JADX INFO: renamed from: d2 */
    public final boolean m64629d2(String str, Moment moment) {
        return cmg.m111196X() && TextUtils.equals(str, "from_discover_discussion") && moment.attitudeId > 0;
    }

    /* JADX INFO: renamed from: e2 */
    public final void m64630e2(boolean z, boolean z2) {
        this.f41939I0 = FeedModule.m61406H().mo31769gi(ksg.m151174K(this.f41949P, false), this.f41942K.owner, z, tec0.f173631b2, act(), fgc0.f98901d, z2, new a30() { // from class: l.e870
            @Override // p153l.a30
            /* JADX INFO: renamed from: a */
            public final void mo37058a(Object obj, Object obj2, Object obj3) {
                this.f92524a.m64657v1((String) obj, (List) obj2, (Boolean) obj3);
            }
        });
    }

    /* JADX INFO: renamed from: f1 */
    public final /* synthetic */ void m64631f1(Boolean bool) {
        if (act() != null) {
            Act act = act();
            Objects.requireNonNull(act);
            if (act.isDestroyed()) {
                return;
            }
            Act act2 = act();
            Objects.requireNonNull(act2);
            if (!act2.isFinishing() && bool.booleanValue()) {
                if (NullChecker.m82486a(this.f41942K)) {
                    this.f41942K.showGreetView = false;
                }
                r1j0.m179420g("发送成功");
                m64580B0();
                ksg.f128568i.add(this.f41942K.owner);
            }
        }
    }

    /* JADX INFO: renamed from: g2 */
    public void m64632g2() {
        if (NullChecker.m82486a(this.f41938I)) {
            PhotoAlbumFeedBaseFrag photoAlbumFeedBaseFrag = (PhotoAlbumFeedBaseFrag) this.f41938I;
            if (!NullChecker.m82486a(this.f41942K) || this.f41977s.getVisibility() == 0) {
                return;
            }
            photoAlbumFeedBaseFrag.f42305F.add(this.f41942K.f56859id);
            this.f41942K.showGreetView = true;
            m64633h2();
            Moment momentM145813w7 = FeedModule.f39703d.m145813w7(this.f41942K.f56859id);
            if (NullChecker.m82486a(momentM145813w7)) {
                momentM145813w7.showGreetView = true;
            }
        }
    }

    public n570 getController() {
        return this.f41953T;
    }

    /* JADX INFO: renamed from: h2 */
    public final void m64633h2() {
        if (bnl0.m105529O0(this.f41926A)) {
            return;
        }
        String strM151174K = ksg.m151174K(this.f41949P, false);
        Moment moment = this.f41942K;
        i4g0.m138492A("e_greet_guidance", strM151174K, jyb.m147494Y("moments_user_id", moment == null ? "" : moment.owner));
        this.f41928C.setText(ksg.m151238x());
        at0.m100011e(this.f41942K, this.f41927B, FeedModule.m61406H().me_());
        bnl0.m105505C0(this.f41926A, 0);
        this.f41927B.setAlpha(0.0f);
        this.f41928C.setAlpha(0.0f);
        bnl0.m105524M(this.f41926A, true);
        ConstraintLayout constraintLayout = this.f41926A;
        Property<View, Integer> property = f41925P0;
        Animator animatorM132169o = gt0.m132169o(constraintLayout, property, 0, qa00.m175859d(80.0f));
        animatorM132169o.setDuration(200L);
        Animator animatorM132170p = gt0.m132170p(this.f41927B, "alpha", 0L, 200L, new LinearInterpolator(), 0.0f, 1.0f);
        Animator animatorM132167m = gt0.m132167m(this.f41927B, property, 0L, 200L, new LinearInterpolator(), 0, qa00.m175859d(24.0f));
        Animator animatorM132170p2 = gt0.m132170p(this.f41928C, "alpha", 0L, 200L, new LinearInterpolator(), 0.0f, 1.0f);
        final AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(animatorM132170p).with(animatorM132170p2).with(animatorM132167m);
        gt0.m132160f(animatorM132169o, new Runnable() { // from class: l.d870
            @Override // java.lang.Runnable
            public final void run() {
                this.f85581a.m64659w1(animatorSet);
            }
        });
        animatorM132169o.start();
    }

    /* JADX INFO: renamed from: i2 */
    public final void m64634i2() {
        act().duringCreated(PhotoAlbumFeedFrag.f42474G).subscribe(psd0.m173597H(new y20() { // from class: l.d970
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f85717a.m64661y1((pf60) obj);
            }
        }, new y20() { // from class: l.e970
            @Override // p153l.y20
            public final void call(Object obj) {
                PhotoAlbumBottomView.m64572s((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: k1 */
    public final /* synthetic */ void m64636k1(Moment moment, String str, boolean z, View view) {
        if (moment.views == 0 || jyb.m147479J(moment.momentViewer.viewers)) {
            return;
        }
        zzg.m222252d(act(), ksg.m151174K(str, z), moment.f56859id, str, m64587G0(moment));
    }

    /* JADX INFO: renamed from: k2 */
    public void m64637k2() {
        if (FeedModule.f39703d.f121327T.get().longValue() > 2) {
            return;
        }
        act().duringCreated(act().lifecycle()).subscribe(psd0.m173596G(new y20() { // from class: l.z870
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f203324a.m64663z1((C4470c) obj);
            }
        }));
        byd0 byd0Var = FeedModule.f39703d.f121327T;
        byd0Var.put(Long.valueOf(byd0Var.get().longValue() + 1));
        this.f41945L0 = C4499d.m21895l().m21907t(new C4496a(act()).m21848D("点赞后自动喜欢，配对率提升5倍").m21869k(act().getResources().getColor(k9c0.f124521n)).m21854J(13.0f).m21883z(qa00.m175859d(10.0f)).m21849E(true).m21882y(true).m21874q(C4496a.f16402Q).m21860b(3000L).m21881x(qa00.m175859d(6.0f)).m21878u(-qa00.m175859d(20.0f)), this.f41960d);
    }

    /* JADX INFO: renamed from: l1 */
    public final /* synthetic */ void m64638l1(final Moment moment, final String str, final boolean z, View view) {
        view.setOnClickListener(new View.OnClickListener() { // from class: l.l870
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f130418a.m64636k1(moment, str, z, view2);
            }
        });
    }

    /* JADX INFO: renamed from: l2 */
    public void m64639l2(boolean z, int i) {
        if (z) {
            this.f41975q.setPadding(0, 0, 0, 0);
        }
        m64660x0(this.f41975q, z);
    }

    /* JADX INFO: renamed from: m1 */
    public final /* synthetic */ void m64640m1(Moment moment, n570 n570Var, String str, View view) {
        Objects.requireNonNull(n570Var);
        rzi.m183769P(moment, new rk00(n570Var), n570Var.mo137270m(moment.owner), act(), str, false);
    }

    /* JADX INFO: renamed from: n1 */
    public final /* synthetic */ void m64641n1(View view) throws Throwable {
        qvm.m178365d().m178368f(this.f41938I, this.f41942K.f56859id, this.f41949P);
        this.f41944L.interaction.haveMoreInteraction = false;
        bnl0.m105524M(this.f41955V.mo124381E(), false);
        er60.m122104w();
        tfj0.m190940c("e_view_more", er60.m122103D(this.f41949P), jyb.m147494Y("moment_id", this.f41942K.f56859id), jyb.m147494Y("recommend_reason", this.f41944L.interaction.type));
    }

    /* JADX INFO: renamed from: o0 */
    public final String m64642o0(String str) {
        return str + f41922M0;
    }

    /* JADX INFO: renamed from: o1 */
    public final /* synthetic */ void m64643o1(Boolean bool) {
        if (act() != null) {
            Act act = act();
            Objects.requireNonNull(act);
            if (act.isDestroyed()) {
                return;
            }
            Act act2 = act();
            Objects.requireNonNull(act2);
            if (!act2.isFinishing() && bool.booleanValue()) {
                if (NullChecker.m82486a(this.f41942K)) {
                    this.f41942K.showGreetView = false;
                }
                r1j0.m179420g("发送成功");
                m64580B0();
                ksg.f128568i.add(this.f41942K.owner);
            }
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        w770 w770Var = new w770();
        this.f41955V = w770Var;
        w770Var.mo124402c(this);
        this.f41957a = this.f41955V.mo124382F();
        this.f41958b = this.f41955V.mo124418l();
        this.f41959c = this.f41955V.mo124428v();
        this.f41960d = this.f41955V.mo124429w();
        this.f41961e = this.f41955V.mo124416j();
        this.f41962f = this.f41955V.mo124378B();
        this.f41963g = this.f41955V.mo124386J();
        this.f41964h = this.f41955V.mo124419m();
        this.f41965i = this.f41955V.mo124385I();
        this.f41966j = this.f41955V.mo124384H();
        this.f41967k = this.f41955V.mo124430x();
        this.f41969l = this.f41955V.mo124432z();
        this.f41970m = this.f41955V.mo124377A();
        this.f41971n = this.f41955V.mo124431y();
        this.f41972o = this.f41955V.mo124417k();
        this.f41973p = this.f41955V.mo124383G();
        this.f41975q = this.f41955V.mo124420n();
        this.f41976r = this.f41955V.mo124380D();
        this.f41977s = this.f41955V.mo124406e();
        this.f41978t = this.f41955V.mo124410g();
        this.f41979u = this.f41955V.mo124408f();
        this.f41980v = this.f41955V.mo124412h();
        this.f41981w = this.f41955V.mo124414i();
        this.f41982x = this.f41955V.mo124404d();
        this.f41983y = this.f41955V.mo124421o();
        this.f41984z = this.f41955V.mo124379C();
        this.f41926A = this.f41955V.mo124427u();
        this.f41927B = this.f41955V.mo124424r();
        this.f41928C = this.f41955V.mo124426t();
        this.f41929D = this.f41955V.mo124425s();
        this.f41932F = this.f41955V.mo124388L();
        this.f41930E = this.f41955V.mo124423q();
        this.f41934G = this.f41955V.mo124387K();
        this.f41936H = this.f41955V.mo124422p();
        this.f41958b.setPadding(f41923N0, qa00.m175859d(0.0f), f41924O0, 0);
        if (NullChecker.m82486a(this.f41967k)) {
            this.f41967k.setTextColor(act().getResources().getColor(k9c0.f124479K));
            this.f41967k.setTextSize(12.0f);
        }
        this.f41959c.setVisibility(0);
        m64627c2();
        if (cmg.m111180H()) {
            m64634i2();
            bnl0.m105509E0(this.f41929D, new View.OnClickListener() { // from class: l.i870
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f113325a.m64566h1(view);
                }
            });
        }
    }

    /* JADX INFO: renamed from: p0 */
    public boolean m64644p0() {
        if (NullChecker.m82486a(this.f41942K)) {
            Moment moment = this.f41942K;
            if (moment.isLive || moment.isVoiceLive) {
                return false;
            }
        }
        return ksg.m151213k0(this.f41950Q) && !cmg.m111225o();
    }

    /* JADX INFO: renamed from: p1 */
    public final /* synthetic */ void m64645p1(boolean z, MomentMessage momentMessage, MomentMessage momentMessage2) {
        if (z) {
            CoreService coreServiceM61406H = FeedModule.m61406H();
            Act act = act();
            String str = momentMessage.value;
            Moment moment = this.f41942K;
            String str2 = moment.owner;
            coreServiceM61406H.mo31733Vk(act, str, str2, moment.f56859id, str2, Channel.get(Channel.greeting_guide), new y20() { // from class: l.w870
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f187833a.m64643o1((Boolean) obj);
                }
            });
        }
        o1j0.m165649w(R$string.f39767J3);
        PhotoAlbumFeedFrag.m65545d5(this.f41950Q);
        if (NullChecker.m82487b(this.f41942K)) {
            m64616V1(momentMessage, true, null);
        }
    }

    /* JADX INFO: renamed from: q0 */
    public boolean m64646q0() {
        return ksg.m151213k0(this.f41950Q);
    }

    /* JADX INFO: renamed from: q1 */
    public final /* synthetic */ void m64647q1(MomentMessage momentMessage, Throwable th) {
        if (NullChecker.m82487b(this.f41942K)) {
            m64616V1(momentMessage, false, th);
        }
        App.f16087d.m21432k(th);
        i4h.m138536e(th);
    }

    /* JADX INFO: renamed from: r0 */
    public final void m64648r0() {
        Intent intentM66018b = MomentDetailAct.C11469a.m66017a(getContext()).m66022f(this.f41949P).m66029m(this.f41942K.f56859id).m66030n(this.f41942K.owner).m66036t(true).m66024h(act().getClass().getName().contains("NewMainAct")).m66031o(this.f41942K.momentValue).m66037u(true).m66035s(this.f41944L).m66018b();
        if (intentM66018b == null) {
            return;
        }
        getContext().startActivity(intentM66018b);
    }

    /* JADX INFO: renamed from: r1 */
    public final /* synthetic */ void m64649r1(final MomentMessage momentMessage, final boolean z) {
        act().duringCreated(FeedModule.f39703d.m145568N6(this.f41942K.owner, momentMessage)).subscribe(psd0.m173597H(new y20() { // from class: l.r870
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f161670a.m64645p1(z, momentMessage, (MomentMessage) obj);
            }
        }, new y20() { // from class: l.s870
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f166744a.m64647q1(momentMessage, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: s0 */
    public final void m64650s0(String str) {
        Moment moment = this.f41942K;
        if (moment == null || !moment.f56859id.equals(str)) {
            return;
        }
        this.f41935G0 = new BottomSheetDialog(act(), fgc0.f98900c);
        View viewInflate = LayoutInflater.from(act()).inflate(tec0.f173685j0, (ViewGroup) null);
        this.f41935G0.setContentView(viewInflate);
        this.f41935G0.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.t870
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f172498a.m64611T0(dialogInterface);
            }
        });
        final VEditText vEditText = (VEditText) viewInflate.findViewById(hdc0.f108866Q1);
        final TextView textView = (TextView) viewInflate.findViewById(hdc0.f108830E1);
        vEditText.setHint(R$string.f39727D);
        act().duringCreated(vEditText.mo29617i(true)).subscribe(psd0.m173596G(new y20() { // from class: l.a970
            @Override // p153l.y20
            public final void call(Object obj) {
                PhotoAlbumBottomView.m64545L(vEditText, textView, (CharSequence) obj);
            }
        }));
        this.f41935G0.setOnShowListener(new DialogInterface.OnShowListener() { // from class: l.b970
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                this.f75522a.m64602O0(vEditText, dialogInterface);
            }
        });
        final BottomSheetDialog bottomSheetDialog = this.f41935G0;
        textView.setOnClickListener(new View.OnClickListener() { // from class: l.c970
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f80304a.m64606Q0(vEditText, bottomSheetDialog, view);
            }
        });
        this.f41935G0.show();
    }

    /* JADX INFO: renamed from: s1 */
    public final /* synthetic */ void m64651s1(AnimatorSet animatorSet) {
        bnl0.m105505C0(this.f41977s, qa00.m175859d(48.0f));
        animatorSet.start();
    }

    public void setCurrentFrag(PutongFrag putongFrag) {
        this.f41938I = putongFrag;
    }

    public void setRawFeedsCanGreeting(boolean z) {
        if (NullChecker.m82486a(this.f41955V)) {
            this.f41955V.mo124390N(z);
        }
    }

    /* JADX INFO: renamed from: t0 */
    public final void m64652t0(String str, final boolean z) {
        Moment moment = this.f41942K;
        if (moment == null || !moment.f56859id.equals(str)) {
            return;
        }
        if (!cmg.m111179G()) {
            m64630e2(false, z);
        } else if (NullChecker.m82486a(jyb.m147529r(ksg.f128568i, new qcj() { // from class: l.f970
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f97832a.m64607R0((String) obj);
            }
        }))) {
            m64630e2(false, z);
        } else {
            ksg.m151156B(act(), this.f41942K.owner, new y20() { // from class: l.g970
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f102765a.m64609S0(z, (Boolean) obj);
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: t1 */
    public final /* synthetic */ void m64653t1(pf60 pf60Var) {
        if (NullChecker.m82486a(this.f41942K) && this.f41942K.f56859id.equals(pf60Var.f152156a) && this.f41950Q == ((Integer) pf60Var.f152157b).intValue()) {
            m64625a2("preview_exit");
        }
    }

    /* JADX INFO: renamed from: u0, reason: merged with bridge method [inline-methods] */
    public final void m64635j1(final Moment moment, final ImageView imageView, FeedAutoScrollTextView feedAutoScrollTextView, final String str, final boolean z, final boolean z2) {
        act().duringCreated(this.f41953T.mo137271s(moment)).subscribe(psd0.m173597H(new y20() { // from class: l.x870
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f192795a.m64613U0(moment, str, z, z2, (Envelope) obj);
            }
        }, new y20() { // from class: l.y870
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f197946a.m64615V0(moment, imageView, str, z, z2, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: v0 */
    public final void m64656v0(String str) {
        Owner owner;
        ArrayList arrayList = new ArrayList();
        Live live = this.f41942K.live;
        arrayList.add(pf60.m172085a("anchorId", (live == null || (owner = live.anchor) == null) ? "" : owner.f39651id));
        Live live2 = this.f41942K.live;
        arrayList.add(pf60.m172085a("liveId", live2 != null ? live2.f39615id : ""));
        arrayList.add(pf60.m172085a("moment_id", this.f41942K.f56859id));
        arrayList.add(pf60.m172085a("owner_id", this.f41942K.owner));
        er60.m122104w();
        arrayList.add(pf60.m172085a("moment_showfrom", er60.m122103D(this.f41949P)));
        arrayList.add(pf60.m172085a("moment_type", er60.m122104w().m122135y(this.f41942K)));
        arrayList.add(pf60.m172085a("comment_detail", "comment"));
        arrayList.add(pf60.m172085a("moment_distance", Long.valueOf(ksg.m151166G(this.f41942K))));
        arrayList.add(pf60.m172085a("moment_create_time", Long.valueOf(ksg.m151164F(this.f41942K))));
        arrayList.add(pf60.m172085a("owner_active_time", Long.valueOf(ksg.m151184S(FeedModule.f39703d.m145688e8(this.f41942K.owner)))));
        arrayList.add(pf60.m172085a("order", Integer.valueOf(this.f41946M)));
        i4g0.m138523u("e_comment", str, ksg.m151208i(this.f41949P, (pf60[]) arrayList.toArray(new pf60[0])));
    }

    /* JADX INFO: renamed from: v1 */
    public final /* synthetic */ void m64657v1(final String str, final List list, final Boolean bool) {
        if (!cmg.m111244x0()) {
            m64655u1(str, list, bool);
        } else {
            zzg.m222253e(act(), "p_fake_nearby_comments_popup", this.f41953T.mo137270m(this.f41942K.owner), new x20() { // from class: l.p870
                @Override // p153l.x20
                public final void call() {
                    this.f150987a.m64655u1(str, list, bool);
                }
            });
        }
    }

    /* JADX INFO: renamed from: w0, reason: merged with bridge method [inline-methods] */
    public final void m64655u1(String str, List<String> list, final Boolean bool) {
        final MomentMessage momentMessage = new MomentMessage();
        momentMessage.value = str;
        momentMessage.moment = this.f41942K.f56859id;
        momentMessage.owner = FeedModule.m61405F().userId();
        er60.m122104w();
        momentMessage.momentShowFromType = er60.m122103D(this.f41949P);
        String strTrim = str.trim();
        if (!jyb.m147479J(list)) {
            for (int i = 0; i < list.size(); i++) {
                strTrim = strTrim.replace(list.get(i), "");
            }
        }
        if (uqb0.f180394Z.m95954K(strTrim)) {
            k3h.m148027A0(act(), new x20() { // from class: l.u870
                @Override // p153l.x20
                public final void call() {
                    this.f177983a.m64617W0(momentMessage, bool);
                }
            }, false);
        } else {
            m64614U1(momentMessage, bool.booleanValue());
            m64576y0(strTrim);
        }
        m64662z0(this.f41939I0);
    }

    /* JADX INFO: renamed from: w1 */
    public final /* synthetic */ void m64659w1(AnimatorSet animatorSet) {
        bnl0.m105505C0(this.f41926A, qa00.m175859d(42.0f));
        animatorSet.start();
    }

    /* JADX INFO: renamed from: x0 */
    public final void m64660x0(View view, boolean z) {
        if (NullChecker.m82486a(view)) {
            bnl0.m105524M(view, z);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: y1 */
    public final /* synthetic */ void m64661y1(pf60 pf60Var) {
        if (m64585E1() && NullChecker.m82486a(this.f41942K) && this.f41942K.owner.equals(pf60Var.f152156a) && m64585E1()) {
            if (((Boolean) pf60Var.f152157b).booleanValue()) {
                m64632g2();
            } else {
                m64580B0();
            }
        }
    }

    /* JADX INFO: renamed from: z0 */
    public final void m64662z0(BottomSheetDialog bottomSheetDialog) {
        m64578A0(bottomSheetDialog, true);
    }

    /* JADX INFO: renamed from: z1 */
    public final /* synthetic */ void m64663z1(C4470c c4470c) {
        if (c4470c == C4470c.f16268j && NullChecker.m82486a(this.f41945L0)) {
            C4499d.m21895l().m21899k(this.f41945L0);
            this.f41945L0 = null;
        }
    }

    public PhotoAlbumBottomView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f41942K = null;
        this.f41944L = null;
        this.f41946M = -1;
        this.f41947N = null;
        this.f41949P = "";
        this.f41952S = false;
        this.f41974p0 = 0;
        this.f41933F0 = false;
        this.f41937H0 = new y20() { // from class: l.x770
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f192676a.m64628d1((pf60) obj);
            }
        };
    }

    public PhotoAlbumBottomView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f41942K = null;
        this.f41944L = null;
        this.f41946M = -1;
        this.f41947N = null;
        this.f41949P = "";
        this.f41952S = false;
        this.f41974p0 = 0;
        this.f41933F0 = false;
        this.f41937H0 = new y20() { // from class: l.x770
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f192676a.m64628d1((pf60) obj);
            }
        };
    }
}
