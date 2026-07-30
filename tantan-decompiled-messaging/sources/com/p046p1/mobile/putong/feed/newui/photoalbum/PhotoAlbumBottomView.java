package com.p046p1.mobile.putong.feed.newui.photoalbum;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.App;
import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.android.p048ui.bubble.C4345a;
import com.p046p1.mobile.android.p048ui.bubble.C4348d;
import com.p046p1.mobile.putong.app.PutongFrag;
import com.p046p1.mobile.putong.core_api.api.serviceprovider.api.CoreService;
import com.p046p1.mobile.putong.data.Channel;
import com.p046p1.mobile.putong.data.DetectCategoryType;
import com.p046p1.mobile.putong.data.Envelope;
import com.p046p1.mobile.putong.data.Live;
import com.p046p1.mobile.putong.data.MessageLocation;
import com.p046p1.mobile.putong.data.Owner;
import com.p046p1.mobile.putong.data.PartialIdList;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.R$string;
import com.p046p1.mobile.putong.feed.data.InteractionReason;
import com.p046p1.mobile.putong.feed.data.LiveMultiCallInfo;
import com.p046p1.mobile.putong.feed.data.Moment;
import com.p046p1.mobile.putong.feed.data.MomentAdditionalData;
import com.p046p1.mobile.putong.feed.data.MomentMessage;
import com.p046p1.mobile.putong.feed.data.MomentSendFrom;
import com.p046p1.mobile.putong.feed.data.MomentViewerBox;
import com.p046p1.mobile.putong.feed.data.RawFeed;
import com.p046p1.mobile.putong.feed.newui.photoalbum.PhotoAlbumBottomView;
import com.p046p1.mobile.putong.feed.newui.photoalbum.adapter.MomentItem;
import com.p046p1.mobile.putong.feed.newui.photoalbum.basefrag.PhotoAlbumFeedBaseFrag;
import com.p046p1.mobile.putong.feed.newui.photoalbum.feed.PhotoAlbumFeedAct;
import com.p046p1.mobile.putong.feed.newui.photoalbum.feed.PhotoAlbumFeedFrag;
import com.p046p1.mobile.putong.feed.newui.photoalbum.momentdetail.MomentDetailAct;
import com.p046p1.mobile.putong.feed.newui.topic.qatopic.QATopicAggregationActivity;
import com.p046p1.mobile.putong.feed.newui.view.FeedAutoScrollTextView;
import com.p046p1.mobile.putong.feed.newui.view.FeedUserHeaderView;
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
import p147v.VDraweeView;
import p147v.VEditText;
import p147v.VFrame;
import p147v.VImage;
import p147v.VLinear;
import p147v.VRelative;
import p147v.VText;
import p149l.AbstractC20577v4;
import p149l.a5i;
import p149l.a8c0;
import p149l.b5c0;
import p149l.bkn0;
import p149l.bt0;
import p149l.d30;
import p149l.djh;
import p149l.e1c0;
import p149l.e30;
import p149l.f3c0;
import p149l.g30;
import p149l.hx60;
import p149l.i0g0;
import p149l.ic00;
import p149l.ijb0;
import p149l.j760;
import p149l.kjb0;
import p149l.kyg;
import p149l.lsi0;
import p149l.mkd0;
import p149l.mqi0;
import p149l.nkg;
import p149l.o6c0;
import p149l.osi0;
import p149l.p6j0;
import p149l.ptm;
import p149l.q31;
import p149l.qib0;
import p149l.qz60;
import p149l.rah;
import p149l.sti;
import p149l.t100;
import p149l.t2h;
import p149l.upg;
import p149l.v1h;
import p149l.vqg;
import p149l.vs0;
import p149l.vwb;
import p149l.vwi;
import p149l.w9j;
import p149l.xdl0;
import p149l.yih;
import p149l.zi60;
import p149l.zpd0;
import p149l.zvf0;

/* JADX INFO: loaded from: classes12.dex */
public class PhotoAlbumBottomView extends VFrame {

    /* JADX INFO: renamed from: M0 */
    public static String f41074M0 = " ";

    /* JADX INFO: renamed from: N0 */
    public static final int f41075N0 = t100.m186890d(52.0f);

    /* JADX INFO: renamed from: O0 */
    public static final int f41076O0 = t100.m186890d(6.0f);

    /* JADX INFO: renamed from: P0 */
    public static final Property<View, Integer> f41077P0 = new C11266b(Integer.TYPE, "viewHeight");

    /* JADX INFO: renamed from: A */
    public ConstraintLayout f41078A;

    /* JADX INFO: renamed from: B */
    public VDraweeView f41079B;

    /* JADX INFO: renamed from: C */
    public VText f41080C;

    /* JADX INFO: renamed from: D */
    public VText f41081D;

    /* JADX INFO: renamed from: E */
    public FeedUserHeaderView f41082E;

    /* JADX INFO: renamed from: E0 */
    public String f41083E0;

    /* JADX INFO: renamed from: F */
    public VText f41084F;

    /* JADX INFO: renamed from: F0 */
    public boolean f41085F0;

    /* JADX INFO: renamed from: G */
    public VImage f41086G;

    /* JADX INFO: renamed from: G0 */
    public BottomSheetDialog f41087G0;

    /* JADX INFO: renamed from: H */
    public LinearLayout f41088H;

    /* JADX INFO: renamed from: H0 */
    public e30<j760<String, Boolean>> f41089H0;

    /* JADX INFO: renamed from: I */
    public PutongFrag f41090I;

    /* JADX INFO: renamed from: I0 */
    public BottomSheetDialog f41091I0;

    /* JADX INFO: renamed from: J */
    public boolean f41092J;

    /* JADX INFO: renamed from: J0 */
    public boolean f41093J0;

    /* JADX INFO: renamed from: K */
    public Moment f41094K;

    /* JADX INFO: renamed from: K0 */
    public boolean f41095K0;

    /* JADX INFO: renamed from: L */
    public RawFeed f41096L;

    /* JADX INFO: renamed from: L0 */
    public String f41097L0;

    /* JADX INFO: renamed from: M */
    public int f41098M;

    /* JADX INFO: renamed from: N */
    public MomentItem f41099N;

    /* JADX INFO: renamed from: O */
    public HashMap<String, Boolean> f41100O;

    /* JADX INFO: renamed from: P */
    public String f41101P;

    /* JADX INFO: renamed from: Q */
    public int f41102Q;

    /* JADX INFO: renamed from: R */
    public boolean f41103R;

    /* JADX INFO: renamed from: S */
    public boolean f41104S;

    /* JADX INFO: renamed from: T */
    public hx60 f41105T;

    /* JADX INFO: renamed from: U */
    public int f41106U;

    /* JADX INFO: renamed from: V */
    public AbstractC20577v4 f41107V;

    /* JADX INFO: renamed from: W */
    public d30 f41108W;

    /* JADX INFO: renamed from: a */
    public ImageView f41109a;

    /* JADX INFO: renamed from: b */
    public VLinear f41110b;

    /* JADX INFO: renamed from: c */
    public RelativeLayout f41111c;

    /* JADX INFO: renamed from: d */
    public VRelative f41112d;

    /* JADX INFO: renamed from: e */
    public VLinear f41113e;

    /* JADX INFO: renamed from: f */
    public VText f41114f;

    /* JADX INFO: renamed from: g */
    public VText f41115g;

    /* JADX INFO: renamed from: h */
    public VText f41116h;

    /* JADX INFO: renamed from: i */
    public VLinear f41117i;

    /* JADX INFO: renamed from: j */
    public VText f41118j;

    /* JADX INFO: renamed from: k */
    public FeedAutoScrollTextView f41119k;

    /* JADX INFO: renamed from: k0 */
    public String f41120k0;

    /* JADX INFO: renamed from: l */
    public VFrame f41121l;

    /* JADX INFO: renamed from: m */
    public VImage f41122m;

    /* JADX INFO: renamed from: n */
    public VDraweeView f41123n;

    /* JADX INFO: renamed from: o */
    public TextView f41124o;

    /* JADX INFO: renamed from: p */
    public VText f41125p;

    /* JADX INFO: renamed from: p0 */
    public int f41126p0;

    /* JADX INFO: renamed from: q */
    public View f41127q;

    /* JADX INFO: renamed from: r */
    public VText f41128r;

    /* JADX INFO: renamed from: s */
    public ConstraintLayout f41129s;

    /* JADX INFO: renamed from: t */
    public VDraweeView f41130t;

    /* JADX INFO: renamed from: u */
    public VImage f41131u;

    /* JADX INFO: renamed from: v */
    public VText f41132v;

    /* JADX INFO: renamed from: w */
    public VText f41133w;

    /* JADX INFO: renamed from: x */
    public SVGAnimationView f41134x;

    /* JADX INFO: renamed from: y */
    public View f41135y;

    /* JADX INFO: renamed from: z */
    public VText f41136z;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.photoalbum.PhotoAlbumBottomView$a */
    public class C11265a extends AnimListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ImageView f41137a;

        public C11265a(ImageView imageView) {
            this.f41137a = imageView;
        }

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ void m63482b() {
            PhotoAlbumBottomView.this.f41112d.setEnabled(true);
            PhotoAlbumBottomView.this.f41134x.setVisibility(8);
            PhotoAlbumBottomView.this.f41134x.setAlpha(1.0f);
        }

        @Override // com.tantan.library.svga.AnimListener
        public void onFinished() {
            super.onFinished();
            PhotoAlbumBottomView.this.f41092J = false;
            if (!xdl0.m208349O0(PhotoAlbumBottomView.this.f41123n)) {
                this.f41137a.setVisibility(0);
            }
            Animator animatorM103743p = bt0.m103743p(PhotoAlbumBottomView.this.f41134x, "alpha", 0L, 250L, new LinearInterpolator(), 1.0f, 0.0f);
            bt0.m103733f(animatorM103743p, new Runnable() { // from class: l.b170
                @Override // java.lang.Runnable
                public final void run() {
                    this.f72495a.m63482b();
                }
            });
            animatorM103743p.start();
        }

        @Override // com.tantan.library.svga.AnimListener
        public void onStart() {
            super.onStart();
            PhotoAlbumBottomView.this.f41092J = true;
            this.f41137a.setVisibility(4);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.photoalbum.PhotoAlbumBottomView$b */
    public class C11266b extends Property<View, Integer> {
        public C11266b(Class cls, String str) {
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
        this.f41094K = null;
        this.f41096L = null;
        this.f41098M = -1;
        this.f41099N = null;
        this.f41101P = "";
        this.f41104S = false;
        this.f41126p0 = 0;
        this.f41085F0 = false;
        this.f41089H0 = new e30() { // from class: l.rz60
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f161609a.m63445d1((j760) obj);
            }
        };
    }

    /* JADX INFO: renamed from: L */
    public static /* synthetic */ void m63362L(VEditText vEditText, TextView textView, CharSequence charSequence) {
        Editable text = vEditText.getText();
        textView.setEnabled((text == null || text.toString().trim().isEmpty()) ? false : true);
    }

    /* JADX INFO: renamed from: Y */
    public static /* synthetic */ void m63374Y(Throwable th) {
    }

    /* JADX INFO: renamed from: b0 */
    public static /* synthetic */ void m63377b0(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h1 */
    public /* synthetic */ void m63383h1(View view) {
        String strM199515K = vqg.m199515K(this.f41101P, false);
        Moment moment = this.f41094K;
        zvf0.m220399u("e_greet_guidance", strM199515K, vwb.m200311Y("moments_user_id", moment == null ? "" : moment.owner));
        if (this.f41094K == null) {
            return;
        }
        FeedModule.m60222H().mo30730Vk(act(), this.f41080C.getText().toString(), this.f41094K.owner, null, null, Channel.get(Channel.greeting_guide), new e30() { // from class: l.uz60
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f178960a.m63448f1((Boolean) obj);
            }
        });
    }

    /* JADX INFO: renamed from: s */
    public static /* synthetic */ void m63389s(Throwable th) {
    }

    /* JADX INFO: renamed from: y0 */
    private void m63393y0(final String str) {
        qib0.f154711Z.m119131Q(str, "p_user_passive_show_nearby").subscribe(mkd0.m154956H(new e30() { // from class: l.d070
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f83152a.m63435X0(str, (Boolean) obj);
            }
        }, new e30() { // from class: l.e070
            @Override // p149l.e30
            public final void call(Object obj) {
                PhotoAlbumBottomView.m63377b0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: A0 */
    public final void m63395A0(final BottomSheetDialog bottomSheetDialog, boolean z) {
        Animator animatorM103743p = bt0.m103743p(this.f41129s, "alpha", 0L, 300L, new LinearInterpolator(), 1.0f, 0.0f);
        bt0.m103733f(animatorM103743p, new Runnable() { // from class: l.b070
            @Override // java.lang.Runnable
            public final void run() {
                this.f72411a.m63437Y0(bottomSheetDialog);
            }
        });
        animatorM103743p.start();
    }

    /* JADX INFO: renamed from: A1 */
    public boolean m63396A1(Moment moment) {
        if (moment.isLive) {
            return kjb0.m146207r(moment);
        }
        return false;
    }

    /* JADX INFO: renamed from: B0 */
    public void m63397B0() {
        xdl0.m208344M(this.f41078A, false);
        this.f41078A.setAlpha(1.0f);
        if (NullChecker.m81303a(this.f41090I) && NullChecker.m81303a(this.f41094K)) {
            ((PhotoAlbumFeedBaseFrag) this.f41090I).f41457F.remove(this.f41094K.f56011id);
            Moment moment = this.f41094K;
            moment.showGreetView = false;
            Moment momentM209572w7 = FeedModule.f38855d.m209572w7(moment.f56011id);
            if (NullChecker.m81303a(momentM209572w7)) {
                momentM209572w7.showGreetView = false;
            }
        }
    }

    /* JADX INFO: renamed from: B1 */
    public final void m63398B1(final Moment moment, final ImageView imageView, final FeedAutoScrollTextView feedAutoScrollTextView, final String str, final boolean z) {
        final boolean z2 = moment.haveLiked;
        if (m63446d2(str, moment) && z2) {
            q31.m172733a(act(), vqg.m199515K(str, z), moment, yih.m214909l().m214911f());
            return;
        }
        PartialIdList partialIdList = moment.likes;
        int iMax = Math.max(partialIdList.count, partialIdList.ids.size());
        d30 d30Var = new d30() { // from class: l.p070
            @Override // p149l.d30
            public final void call() {
                this.f146556a.m63452j1(moment, imageView, feedAutoScrollTextView, str, z, z2);
            }
        };
        this.f41108W = d30Var;
        d30Var.call();
        if (moment.haveLiked) {
            FeedAutoScrollTextView feedAutoScrollTextView2 = this.f41119k;
            if (iMax == 1) {
                feedAutoScrollTextView2.m66303h(act().getString(R$string.f39087k), false);
            } else {
                feedAutoScrollTextView2.m66303h(i0g0.m133867h0(iMax - 1), false);
            }
        } else {
            if (this.f41095K0) {
                ptm.m171352d().m171354e(act(), this.f41090I, str, moment, "like", this.f41096L);
            }
            this.f41112d.setEnabled(false);
            this.f41134x.setVisibility(0);
            SVGALoader.with(act()).from(nkg.m159862S() ? "https://auto.tancdn.com/v1/raw/66db6975-8b2a-4fc6-be4b-454a6b5024c512.pdf" : "feed_like_newui.svga").autoPlay(true).repeatCount(1).animListener(new C11265a(imageView)).into(this.f41134x);
            FeedAutoScrollTextView feedAutoScrollTextView3 = this.f41119k;
            if (iMax == 0) {
                feedAutoScrollTextView3.m66303h("1", true);
            } else {
                feedAutoScrollTextView3.m66303h(i0g0.m133867h0(iMax + 1), true);
            }
        }
        m63415L1(!moment.haveLiked, imageView);
    }

    /* JADX INFO: renamed from: C1 */
    public void m63399C1(Live live, Act act, String str) {
        if (NullChecker.m81304b(live)) {
            kjb0.m146184G(act, live, str, live.recommendInfo.category);
        }
    }

    /* JADX INFO: renamed from: D0 */
    public final void m63400D0(int i) {
        m63417M1(i);
        if (NullChecker.m81303a(this.f41094K.messages)) {
            m63407H1(this.f41094K.messages.count);
        }
        m63415L1(this.f41094K.haveLiked, this.f41122m);
        this.f41112d.setOnClickListener(new View.OnClickListener() { // from class: l.h070
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f105202a.m63439Z0(view);
            }
        });
        this.f41113e.setOnClickListener(new View.OnClickListener() { // from class: l.i070
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f110259a.m63441a1(view);
            }
        });
    }

    /* JADX INFO: renamed from: E0 */
    public final boolean m63401E0() {
        if (xdl0.m208349O0(this.f41118j) || !nkg.m159863T()) {
            return false;
        }
        if (TextUtils.equals(this.f41101P, "from_mine_tab_album")) {
            return true;
        }
        return TextUtils.equals(this.f41101P, "from_album") && ijb0.m136539C().f56011id.equals(this.f41094K.owner);
    }

    /* JADX INFO: renamed from: E1 */
    public boolean m63402E1() {
        return TextUtils.equals(this.f41101P, "from_discover_dating") || TextUtils.equals(this.f41101P, "from_nearby_focus") || TextUtils.equals(this.f41101P, "from_like");
    }

    /* JADX INFO: renamed from: F1 */
    public boolean m63403F1(boolean z, final hx60 hx60Var, MomentItem momentItem, HashMap<String, Boolean> map, final String str, final boolean z2, int i, int i2, RawFeed rawFeed, int i3, boolean z3, boolean z4, boolean z5) {
        this.f41099N = momentItem;
        this.f41100O = map;
        final Moment moment = momentItem.f41351d;
        this.f41096L = rawFeed;
        this.f41098M = i3;
        m63477x0(this.f41112d, !moment.isLive);
        m63477x0(this.f41113e, !moment.isLive);
        m63477x0(this.f41128r, false);
        this.f41101P = str;
        this.f41102Q = i;
        this.f41104S = z;
        this.f41103R = z2;
        this.f41105T = hx60Var;
        this.f41106U = i2;
        this.f41093J0 = z4;
        this.f41095K0 = z5;
        boolean z6 = (this.f41094K == null && NullChecker.m81304b(moment) && !moment.f56011id.startsWith("fake_id_")) || (NullChecker.m81303a(this.f41094K) && NullChecker.m81304b(moment) && !this.f41094K.f56011id.equals(moment.f56011id) && !moment.f56011id.startsWith("fake_id_"));
        if (NullChecker.m81303a(this.f41134x) && xdl0.m208349O0(this.f41134x) && this.f41134x.isAnimating() && NullChecker.m81303a(this.f41094K) && NullChecker.m81303a(moment) && !TextUtils.equals(this.f41094K.f56011id, moment.f56011id)) {
            this.f41134x.stopAnimation(false);
        }
        this.f41094K = moment;
        this.f41085F0 = z3;
        this.f41107V.mo177162a(this);
        boolean zM63412K0 = m63412K0();
        AbstractC20577v4 abstractC20577v4 = this.f41107V;
        if (zM63412K0) {
            abstractC20577v4.mo196919l().setVisibility(8);
        } else {
            abstractC20577v4.mo196919l().setVisibility(0);
        }
        boolean zM63406H0 = m63406H0();
        RelativeLayout relativeLayout = this.f41111c;
        if (zM63406H0) {
            m63477x0(relativeLayout, false);
        } else {
            m63477x0(relativeLayout, true);
        }
        m63425R1(moment);
        if (NullChecker.m81304b(this.f41118j)) {
            m63405G1(this.f41118j);
        }
        m63409I1(this.f41115g);
        m63420O1(this.f41116h, moment);
        m63427S1(moment);
        vwb.m200354z(vwb.m200324f0(this.f41082E, this.f41084F, this.f41086G), new e30() { // from class: l.vz60
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f183585a.m63455l1(moment, str, z2, (View) obj);
            }
        });
        m63422P1(moment);
        if (NullChecker.m81303a(this.f41109a)) {
            if (moment.isLive && FeedModule.m60221F().userId().equals(moment.live.anchor.f38803id)) {
                m63477x0(this.f41109a, false);
            } else {
                this.f41109a.setVisibility(0);
                this.f41109a.setOnClickListener(new View.OnClickListener() { // from class: l.wz60
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f188705a.m63457m1(moment, hx60Var, str, view);
                    }
                });
            }
            if (vqg.m199528V(moment)) {
                this.f41109a.setVisibility(8);
            }
        }
        PartialIdList partialIdList = moment.likes;
        m63400D0(Math.max(partialIdList.count, partialIdList.ids.size()));
        this.f41107V.mo177163b(this);
        if (NullChecker.m81304b(this.f41094K)) {
            Moment moment2 = this.f41094K;
            zi60.m218961w();
            moment2.setMomentShowFrom(zi60.m218960D(str));
        }
        if (i == 2) {
            xdl0.m208368c0(this, t100.m186890d(3.0f));
        }
        if ((TextUtils.isEmpty(this.f41125p.getText()) || this.f41125p.getVisibility() != 0) && ((TextUtils.isEmpty(this.f41115g.getText()) || this.f41115g.getVisibility() != 0) && ((TextUtils.isEmpty(this.f41114f.getText()) || this.f41114f.getVisibility() != 0) && !((!TextUtils.isEmpty(this.f41116h.getText()) && this.f41116h.getVisibility() == 0) || this.f41118j.getVisibility() == 0 || m63418N0(this.f41136z))))) {
            this.f41117i.setVisibility(8);
        } else {
            this.f41117i.setVisibility(0);
        }
        if (nkg.m159854K() && TextUtils.equals("from_like", str) && NullChecker.m81303a(rawFeed)) {
            xdl0.m208344M(this.f41133w, !rawFeed.showLikeSplitLine && rawFeed.showUnreadSplitLine);
        }
        m63411J1();
        if (User.isWisdomStar(moment.owner)) {
            this.f41117i.setVisibility(8);
            xdl0.m208374f0(this.f41110b, 0);
            xdl0.m208360X(this.f41107V.mo196928v(), 0);
            xdl0.m208357U(this.f41107V.mo196928v(), 0);
        }
        return z6;
    }

    /* JADX INFO: renamed from: G0 */
    public final boolean m63404G0(Moment moment) {
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

    /* JADX INFO: renamed from: G1 */
    public final void m63405G1(View view) {
        if (vqg.m199550i0(this.f41102Q)) {
            xdl0.m208344M(view, false);
        } else if (sti.m185957c() && TEnum.equals(this.f41094K.settings.visibility, "selfOnly")) {
            xdl0.m208344M(view, true);
        } else {
            xdl0.m208344M(view, false);
        }
    }

    /* JADX INFO: renamed from: H0 */
    public final boolean m63406H0() {
        LiveMultiCallInfo liveMultiCallInfo;
        Moment moment = this.f41094K;
        return moment != null && (liveMultiCallInfo = moment.multiCallInfo) != null && liveMultiCallInfo.onGoing && TextUtils.equals(moment.liveState, "onMultiCall");
    }

    /* JADX INFO: renamed from: H1 */
    public void m63407H1(int i) {
        TextView textView = this.f41124o;
        if (i > 0) {
            textView.setText(i0g0.m133867h0(i));
        } else {
            textView.setText(R$string.f39038d);
        }
    }

    /* JADX INFO: renamed from: I0 */
    public final boolean m63408I0() {
        return "from_mine_tab_album".equals(this.f41101P) || "from_profile_album".equals(this.f41101P) || this.f41103R;
    }

    /* JADX INFO: renamed from: I1 */
    public final void m63409I1(VText vText) {
        if (vqg.m199550i0(this.f41102Q) || m63408I0()) {
            xdl0.m208344M(vText, false);
            return;
        }
        xdl0.m208344M(vText, true);
        if (NullChecker.m81303a(vText)) {
            Moment moment = this.f41094K;
            if (moment.isLive) {
                vText.setText(a5i.m95041q(moment.live.startTime));
                return;
            }
            if (moment.isVoiceLive) {
                vText.setText(a5i.m95041q(moment.voiceLive.startTime));
                return;
            }
            if (!"qa_recommend".equals(this.f41101P) || !djh.m112037b()) {
                vText.setText(m63459o0(a5i.m95041q(this.f41094K.createdTime)));
            } else if (mqi0.m155944o() < this.f41094K.getRecommendTime()) {
                vText.setText("1秒以前推荐");
            } else {
                vText.setText(vqg.m199500C0(this.f41094K.getRecommendTime()));
            }
        }
    }

    /* JADX INFO: renamed from: J0 */
    public final boolean m63410J0(boolean z, boolean z2) {
        return z && z2;
    }

    /* JADX INFO: renamed from: J1 */
    public void m63411J1() {
        InteractionReason interactionReason;
        RawFeed rawFeed = this.f41096L;
        if (rawFeed == null || (interactionReason = rawFeed.interaction) == null || !interactionReason.haveMoreInteraction) {
            xdl0.m208344M(this.f41107V.mo196902E(), false);
        } else {
            xdl0.m208344M(this.f41107V.mo196902E(), true);
            xdl0.m208329E0(this.f41107V.mo196902E(), new View.OnClickListener() { // from class: l.k070
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) throws Throwable {
                    this.f120456a.m63458n1(view);
                }
            });
        }
    }

    /* JADX INFO: renamed from: K0 */
    public final boolean m63412K0() {
        Moment moment = this.f41094K;
        return m63410J0(moment.isVoiceLive, moment.momentVoiceLiveInfos != null);
    }

    /* JADX INFO: renamed from: K1 */
    public final void m63413K1(boolean z) {
        this.f41119k.clearAnimation();
        FeedAutoScrollTextView feedAutoScrollTextView = this.f41119k;
        if (z) {
            boolean zEquals = TextUtils.equals(feedAutoScrollTextView.getText(), act().getString(R$string.f39087k));
            FeedAutoScrollTextView feedAutoScrollTextView2 = this.f41119k;
            if (zEquals) {
                feedAutoScrollTextView2.m66303h("1", true);
                return;
            } else {
                feedAutoScrollTextView2.m66303h(i0g0.m133867h0(Integer.parseInt(feedAutoScrollTextView2.getText()) + 1), true);
                return;
            }
        }
        boolean zEquals2 = TextUtils.equals(feedAutoScrollTextView.getText(), "1");
        FeedAutoScrollTextView feedAutoScrollTextView3 = this.f41119k;
        if (zEquals2) {
            feedAutoScrollTextView3.m66303h(act().getString(R$string.f39087k), false);
        } else {
            feedAutoScrollTextView3.m66303h(i0g0.m133867h0(Integer.parseInt(feedAutoScrollTextView3.getText()) - 1), false);
        }
    }

    /* JADX INFO: renamed from: L0 */
    public boolean m63414L0() {
        return act() instanceof QATopicAggregationActivity;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0062  */
    /* JADX INFO: renamed from: L1 */
    public final void m63415L1(boolean z, ImageView imageView) {
        boolean z2;
        if (!z) {
            xdl0.m208344M(imageView, true);
            xdl0.m208344M(this.f41123n, false);
            this.f41119k.setTextColor(act().getResources().getColor(e1c0.f88756K));
            imageView.setImageResource(f3c0.f94492c3);
            imageView.setImageTintList(null);
            return;
        }
        if (!m63446d2(this.f41101P, this.f41094K)) {
            if (!this.f41092J) {
                xdl0.m208344M(imageView, true);
            }
            xdl0.m208344M(this.f41123n, false);
            this.f41119k.setTextColor(act().getResources().getColor(e1c0.f88798n));
            imageView.setImageResource(f3c0.f94461Y2);
            imageView.setImageTintList(null);
            return;
        }
        boolean z3 = xdl0.m208349O0(imageView) && this.f41126p0 == 0 && TextUtils.equals(this.f41083E0, this.f41094K.f56011id);
        int i = this.f41126p0;
        if (i > 0) {
            Moment moment = this.f41094K;
            if (i == moment.attitudeId || !TextUtils.equals(this.f41083E0, moment.f56011id)) {
                z2 = false;
            } else {
                z2 = true;
            }
        } else {
            z2 = false;
        }
        xdl0.m208344M(imageView, false);
        xdl0.m208344M(this.f41123n, true);
        String strM214915j = yih.m214909l().m214915j(this.f41094K.attitudeId);
        if (!TextUtils.isEmpty(strM214915j)) {
            qib0.f154691G.m102331L0(this.f41123n, strM214915j);
        }
        if (z3 || z2) {
            yih.m214909l().m214918n(this.f41123n, this.f41121l);
        }
        Moment moment2 = this.f41094K;
        this.f41126p0 = moment2.attitudeId;
        this.f41083E0 = moment2.f56011id;
    }

    /* JADX INFO: renamed from: M0 */
    public boolean m63416M0() {
        Moment moment = this.f41094K;
        if (moment == null || vwb.m200296J(moment.mTopicList)) {
            return false;
        }
        return this.f41094K.mTopicList.get(0).isTopicVoteType();
    }

    /* JADX INFO: renamed from: M1 */
    public void m63417M1(int i) {
        this.f41119k.clearAnimation();
        FeedAutoScrollTextView feedAutoScrollTextView = this.f41119k;
        if (i > 0) {
            feedAutoScrollTextView.setText(i0g0.m133867h0(i));
        } else {
            feedAutoScrollTextView.setText(act().getString(R$string.f39087k));
        }
    }

    /* JADX INFO: renamed from: N0 */
    public final boolean m63418N0(View view) {
        return view != null && view.getVisibility() == 0;
    }

    /* JADX INFO: renamed from: O0 */
    public final /* synthetic */ void m63419O0(VEditText vEditText, DialogInterface dialogInterface) {
        vEditText.requestFocus();
        act().showInput(vEditText, 2);
    }

    /* JADX INFO: renamed from: O1 */
    public final void m63420O1(VText vText, Moment moment) {
        if (m63401E0()) {
            m63477x0(vText, false);
            return;
        }
        if (NullChecker.m81303a(vText)) {
            if ((act() instanceof PhotoAlbumFeedAct) || "from_profile_album".equals(this.f41101P) || "from_mine_tab_album".equals(this.f41101P)) {
                if (NullChecker.m81303a(moment.location)) {
                    String strM199575v = vqg.m199575v(moment.location);
                    vText.setText(TextUtils.isEmpty(strM199575v) ? "" : m63459o0(strM199575v));
                }
                User userMo133306m = this.f41105T.mo133306m(moment.owner);
                if (moment.isLive && NullChecker.m81303a(userMo133306m) && NullChecker.m81303a(userMo133306m.location)) {
                    vText.setText(m63459o0(i0g0.m133876p(userMo133306m.location.distance, true)));
                    m63477x0(vText, true);
                } else {
                    m63477x0(vText, false);
                }
                if (moment.isLive) {
                    return;
                }
                m63477x0(vText, moment.location != null);
            }
        }
    }

    /* JADX INFO: renamed from: P0 */
    public final /* synthetic */ void m63421P0(MomentMessage momentMessage) {
        m63431U1(momentMessage, false);
    }

    /* JADX INFO: renamed from: P1 */
    public final void m63422P1(Moment moment) {
        MomentSendFrom momentSendFrom;
        MomentAdditionalData momentAdditionalData = moment.additionalData;
        if (momentAdditionalData == null || (momentSendFrom = momentAdditionalData.sendFrom) == null || TextUtils.isEmpty(momentSendFrom.name)) {
            xdl0.m208344M(this.f41136z, false);
            return;
        }
        xdl0.m208344M(this.f41136z, true);
        this.f41136z.setText(m63459o0("来自" + moment.additionalData.sendFrom.name));
    }

    /* JADX INFO: renamed from: Q0 */
    public final /* synthetic */ void m63423Q0(VEditText vEditText, BottomSheetDialog bottomSheetDialog, View view) {
        act().hideInput(vEditText);
        final MomentMessage momentMessage = new MomentMessage();
        momentMessage.value = vEditText.getText().toString();
        momentMessage.moment = this.f41094K.f56011id;
        momentMessage.owner = FeedModule.m60221F().userId();
        zi60.m218961w();
        momentMessage.momentShowFromType = zi60.m218960D(this.f41101P);
        String strTrim = vEditText.getText().toString().trim();
        if (qib0.f154711Z.m119125K(strTrim)) {
            v1h.m196550A0(act(), new d30() { // from class: l.zz60
                @Override // p149l.d30
                public final void call() {
                    this.f205781a.m63421P0(momentMessage);
                }
            }, false);
        } else {
            m63431U1(momentMessage, false);
            m63393y0(strTrim);
        }
        m63479z0(bottomSheetDialog);
    }

    /* JADX INFO: renamed from: R0 */
    public final /* synthetic */ Boolean m63424R0(String str) {
        return Boolean.valueOf(TextUtils.equals(str, this.f41094K.owner));
    }

    /* JADX INFO: renamed from: R1 */
    public final void m63425R1(Moment moment) {
        MessageLocation messageLocation = moment.location;
        if (messageLocation == null || TextUtils.isEmpty(messageLocation.name) || m63416M0() || m63414L0()) {
            this.f41114f.setVisibility(8);
        } else {
            this.f41114f.setVisibility(0);
            this.f41114f.setText(moment.location.name);
        }
    }

    /* JADX INFO: renamed from: S0 */
    public final /* synthetic */ void m63426S0(boolean z, Boolean bool) {
        m63447e2(bool.booleanValue(), z);
        if (bool.booleanValue()) {
            return;
        }
        vqg.f182645i.add(this.f41094K.owner);
        if (xdl0.m208349O0(this.f41078A)) {
            m63397B0();
        }
    }

    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: S1 */
    public final void m63427S1(Moment moment) {
        if (!ijb0.m136539C().f56011id.equals(moment.owner)) {
            m63477x0(this.f41125p, false);
            m63436X1();
            return;
        }
        if (m63401E0()) {
            m63477x0(this.f41125p, false);
            m63429T1();
            ArrayList arrayListM200324f0 = vwb.m200324f0(new String[0]);
            if (NullChecker.m81303a(moment) && NullChecker.m81303a(moment.momentViewer) && !vwb.m200296J(moment.momentViewer.viewers)) {
                int iMin = Math.min(3, moment.momentViewer.viewers.size());
                for (int i = 0; i < iMin; i++) {
                    arrayListM200324f0.add(moment.momentViewer.viewers.get(i).userId);
                }
            }
            Collections.reverse(arrayListM200324f0);
            m63477x0(this.f41084F, true);
            m63477x0(this.f41082E, true);
            m63477x0(this.f41107V.mo196910M(), true);
            xdl0.m208344M(this.f41086G, true ^ vwb.m200296J(arrayListM200324f0));
            xdl0.m208358V(this.f41084F, vwb.m200296J(arrayListM200324f0) ? 0 : t100.m186890d(4.0f));
            this.f41082E.m66369k0();
            this.f41082E.m66371n0(arrayListM200324f0, false);
            return;
        }
        if (!(nkg.m159918z() && moment.views == 0) && moment.views <= 0) {
            m63477x0(this.f41125p, false);
            m63436X1();
            return;
        }
        m63436X1();
        m63477x0(this.f41125p, true);
        int i2 = moment.views;
        VText vText = this.f41125p;
        if (i2 > 1) {
            vText.setText(m63459o0(String.format(act().getString(R$string.f39110n1), i0g0.m133868i0(moment.views))));
        } else {
            vText.setText(m63459o0(String.format(act().getString(R$string.f39117o1), i0g0.m133868i0(moment.views))));
        }
        if (nkg.m159863T()) {
            if (nkg.m159918z()) {
                this.f41125p.setText(i0g0.m133868i0(moment.views) + "浏览");
            } else {
                int i3 = moment.views;
                VText vText2 = this.f41125p;
                if (i3 == 0) {
                    vText2.setText("");
                } else {
                    vText2.setText(i0g0.m133868i0(moment.views) + "浏览");
                }
            }
        }
        m63436X1();
    }

    /* JADX INFO: renamed from: T0 */
    public final /* synthetic */ void m63428T0(DialogInterface dialogInterface) {
        act().alwaysHideInput();
    }

    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: T1 */
    public final void m63429T1() {
        Moment moment = this.f41094K;
        if (moment == null || moment.views == 0) {
            xdl0.m208344M(this.f41086G, false);
            this.f41084F.setText("0浏览");
            return;
        }
        this.f41084F.setText(i0g0.m133868i0(this.f41094K.views) + "浏览");
    }

    /* JADX INFO: renamed from: U0 */
    public final /* synthetic */ void m63430U0(Moment moment, String str, boolean z, boolean z2, Envelope envelope) {
        if (nkg.m159862S() && NullChecker.m81303a(envelope)) {
            int i = envelope.meta.code;
            Objects.requireNonNull(FeedModule.f38855d);
            if (i == 20101) {
                m63454k2();
                if (!TextUtils.isEmpty(moment.owner)) {
                    User userM209447e8 = FeedModule.f38855d.m209447e8(moment.owner);
                    if (NullChecker.m81303a(userM209447e8) && User.isMatched(userM209447e8)) {
                        FeedModule.m60222H().mo30672Ap(act(), userM209447e8, false, userM209447e8.localRelationship);
                    }
                }
            }
        }
        zi60.m218961w().m218975g(moment, str, z, 201, z2, this.f41098M);
        if (m63463q0() && moment.haveLiked) {
            m63442a2("like_click");
        }
        Moment momentMo133317y = this.f41105T.mo133317y(moment.f56011id);
        if (NullChecker.m81303a(momentMo133317y) && momentMo133317y.haveLiked && m63440Z1(str) && momentMo133317y.attitudes.count > yih.m214909l().m214913h()) {
            m63438Y1();
        }
    }

    /* JADX INFO: renamed from: U1 */
    public final void m63431U1(final MomentMessage momentMessage, final boolean z) {
        vqg.m199561o(act(), momentMessage.value, DetectCategoryType.get("comment"), "comment", vqg.m199515K(this.f41101P, this.f41103R), new d30() { // from class: l.g070
            @Override // p149l.d30
            public final void call() {
                this.f100025a.m63466r1(momentMessage, z);
            }
        });
    }

    /* JADX INFO: renamed from: V0 */
    public final /* synthetic */ void m63432V0(Moment moment, ImageView imageView, String str, boolean z, boolean z2, Throwable th) {
        t2h.m186976g(th);
        m63415L1(moment.haveLiked, imageView);
        zi60.m218961w().m218977i(moment, str, z, th, z2, this.f41098M);
        m63413K1(z2);
    }

    /* JADX INFO: renamed from: V1 */
    public final void m63433V1(MomentMessage momentMessage, boolean z, Throwable th) {
        p6j0.m167672f("e_comment_send", vqg.m199515K(this.f41101P, this.f41103R), p6j0.C19147a.m167678g("moment_id", this.f41094K.f56011id), p6j0.C19147a.m167678g("owner_id", this.f41094K.owner), p6j0.C19147a.m167678g("comment_user_id", FeedModule.m60221F().userId()), p6j0.C19147a.m167678g("comment_state", z ? "success" : "fail"), p6j0.C19147a.m167678g("comment_detail", "comment"), p6j0.C19147a.m167678g("trigger_time", this.f41120k0), th == null ? null : p6j0.C19147a.m167678g("error", th.toString()));
    }

    /* JADX INFO: renamed from: W0 */
    public final /* synthetic */ void m63434W0(MomentMessage momentMessage, Boolean bool) {
        m63431U1(momentMessage, bool.booleanValue());
    }

    /* JADX INFO: renamed from: X0 */
    public final /* synthetic */ void m63435X0(String str, Boolean bool) {
        if (bool.booleanValue()) {
            v1h.m196568J0(act(), str);
        }
    }

    /* JADX INFO: renamed from: X1 */
    public final void m63436X1() {
        m63477x0(this.f41084F, false);
        m63477x0(this.f41082E, false);
        m63477x0(this.f41086G, false);
        xdl0.m208344M(this.f41107V.mo196910M(), false);
    }

    /* JADX INFO: renamed from: Y0 */
    public final /* synthetic */ void m63437Y0(BottomSheetDialog bottomSheetDialog) {
        xdl0.m208344M(this.f41129s, false);
        this.f41129s.setAlpha(1.0f);
        if (NullChecker.m81303a(this.f41090I) && NullChecker.m81303a(this.f41094K)) {
            ((PhotoAlbumFeedBaseFrag) this.f41090I).f41455D.remove(this.f41094K.f56011id);
        }
        if (NullChecker.m81303a(bottomSheetDialog)) {
            bottomSheetDialog.dismiss();
        }
    }

    /* JADX INFO: renamed from: Y1 */
    public final void m63438Y1() {
        int[] iArr = new int[2];
        this.f41124o.getLocationOnScreen(iArr);
        Point point = new Point();
        int iM186890d = iArr[1] - t100.m186890d(116.0f);
        if (iM186890d < xdl0.m208331F0() + t100.m186890d(44.0f) + t100.m186890d(12.0f)) {
            iM186890d = iArr[1];
        }
        point.y = iM186890d;
        point.x = t100.m186890d(52.0f);
        new upg(act(), point, this.f41094K, vqg.m199515K(this.f41101P, this.f41103R)).m194876a(this.f41124o);
    }

    /* JADX INFO: renamed from: Z0 */
    public final /* synthetic */ void m63439Z0(View view) {
        boolean zM63396A1 = m63396A1(this.f41094K);
        Moment moment = this.f41094K;
        if (zM63396A1) {
            m63399C1(moment.live, act(), kjb0.m146202m(this.f41094K.live, this.f41101P));
            return;
        }
        if (!moment.isVoiceLive) {
            m63398B1(moment, this.f41122m, this.f41119k, this.f41101P, this.f41103R);
            return;
        }
        bkn0 bkn0VarMo67229M6 = FeedModule.m60223M().mo67229M6();
        Act act = act();
        Moment moment2 = this.f41094K;
        bkn0VarMo67229M6.mo102431p(act, moment2.voiceLive.f39250id, moment2.owner, kjb0.m146203n("", this.f41101P), "");
    }

    /* JADX INFO: renamed from: Z1 */
    public boolean m63440Z1(String str) {
        return nkg.m159867X() && TextUtils.equals(str, "from_discover_discussion");
    }

    /* JADX INFO: renamed from: a1 */
    public final /* synthetic */ void m63441a1(View view) {
        boolean zM63396A1 = m63396A1(this.f41094K);
        Moment moment = this.f41094K;
        if (zM63396A1) {
            m63399C1(moment.live, act(), kjb0.m146202m(this.f41094K.live, this.f41101P));
        } else if (moment.isVoiceLive) {
            bkn0 bkn0VarMo67229M6 = FeedModule.m60223M().mo67229M6();
            Act act = act();
            Moment moment2 = this.f41094K;
            bkn0VarMo67229M6.mo102431p(act, moment2.voiceLive.f39250id, moment2.owner, kjb0.m146203n("", this.f41101P), "");
        } else {
            m63465r0();
        }
        String strM199515K = vqg.m199515K(this.f41101P, this.f41103R);
        if (!TextUtils.isEmpty(strM199515K)) {
            m63473v0(strM199515K);
        }
        if (this.f41095K0) {
            ptm.m171352d().m171354e(act(), this.f41090I, this.f41101P, this.f41094K, "click", this.f41096L);
        }
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0015  */
    /* JADX INFO: renamed from: a2 */
    public void m63442a2(String str) {
        boolean z;
        if (NullChecker.m81303a(this.f41094K)) {
            Moment moment = this.f41094K;
            if (moment.isLive || moment.isVoiceLive) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        if ((NullChecker.m81303a(this.f41094K) && !vwb.m200296J(this.f41094K.mTopicList) && this.f41094K.mTopicList.get(0).isTopicVoteType()) || xdl0.m208349O0(this.f41129s) || z || !rah.m178493a()) {
            return;
        }
        if (nkg.m159851H() && this.f41094K.showGreetView) {
            return;
        }
        this.f41120k0 = str;
        p6j0.m167671e("e_quick_comment", vqg.m199515K(this.f41101P, this.f41103R), j760.m140076a("trigger_time", str));
        if (NullChecker.m81303a(this.f41090I)) {
            PutongFrag putongFrag = this.f41090I;
            if (putongFrag instanceof PhotoAlbumFeedBaseFrag) {
                PhotoAlbumFeedBaseFrag photoAlbumFeedBaseFrag = (PhotoAlbumFeedBaseFrag) putongFrag;
                if (photoAlbumFeedBaseFrag.f41455D == null) {
                    photoAlbumFeedBaseFrag.f41455D = new HashMap<>();
                }
                if (NullChecker.m81303a(this.f41094K)) {
                    photoAlbumFeedBaseFrag.f41455D.put(this.f41094K.f56011id, Boolean.TRUE);
                    m63443b2();
                }
            }
        }
    }

    public Act act() {
        return (Act) getContext();
    }

    /* JADX INFO: renamed from: b2 */
    public final void m63443b2() {
        xdl0.m208325C0(this.f41129s, 0);
        this.f41130t.setAlpha(0.0f);
        this.f41132v.setAlpha(0.0f);
        xdl0.m208344M(this.f41129s, true);
        xdl0.m208344M(this.f41131u, nkg.m159918z());
        if (nkg.m159918z()) {
            this.f41131u.setAlpha(0.0f);
        }
        ConstraintLayout constraintLayout = this.f41129s;
        Property<View, Integer> property = f41077P0;
        Animator animatorM103742o = bt0.m103742o(constraintLayout, property, 0, t100.m186890d(48.0f));
        animatorM103742o.setDuration(200L);
        Animator animatorM103743p = bt0.m103743p(this.f41130t, "alpha", 0L, 200L, new LinearInterpolator(), 0.0f, 1.0f);
        Animator animatorM103740m = bt0.m103740m(this.f41130t, property, 0L, 200L, new LinearInterpolator(), 0, t100.m186890d(24.0f));
        Animator animatorM103743p2 = bt0.m103743p(this.f41131u, "alpha", 0L, 200L, new LinearInterpolator(), 0.0f, 1.0f);
        Animator animatorM103740m2 = bt0.m103740m(this.f41131u, property, 0L, 200L, new LinearInterpolator(), 0, t100.m186890d(21.0f));
        Animator animatorM103743p3 = bt0.m103743p(this.f41132v, "alpha", 0L, 200L, new LinearInterpolator(), 0.0f, 1.0f);
        final AnimatorSet animatorSet = new AnimatorSet();
        AnimatorSet.Builder builderPlay = animatorSet.play(animatorM103743p);
        builderPlay.with(animatorM103743p3).with(animatorM103740m);
        if (nkg.m159918z()) {
            builderPlay.with(animatorM103743p2).with(animatorM103740m2);
        }
        bt0.m103733f(animatorM103742o, new Runnable() { // from class: l.a070
            @Override // java.lang.Runnable
            public final void run() {
                this.f67007a.m63468s1(animatorSet);
            }
        });
        animatorM103742o.start();
    }

    /* JADX INFO: renamed from: c2 */
    public final void m63444c2() {
        act().duringCreated(PhotoAlbumFeedFrag.f41624E).subscribe(mkd0.m154956H(new e30() { // from class: l.sz60
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f167019a.m63470t1((j760) obj);
            }
        }, new e30() { // from class: l.tz60
            @Override // p149l.e30
            public final void call(Object obj) {
                PhotoAlbumBottomView.m63374Y((Throwable) obj);
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: d1 */
    public final /* synthetic */ void m63445d1(j760 j760Var) {
        if (nkg.m159918z()) {
            m63469t0((String) j760Var.f116564a, ((Boolean) j760Var.f116565b).booleanValue());
        } else {
            m63467s0((String) j760Var.f116564a);
        }
    }

    /* JADX INFO: renamed from: d2 */
    public final boolean m63446d2(String str, Moment moment) {
        return nkg.m159867X() && TextUtils.equals(str, "from_discover_discussion") && moment.attitudeId > 0;
    }

    /* JADX INFO: renamed from: e2 */
    public final void m63447e2(boolean z, boolean z2) {
        this.f41091I0 = FeedModule.m60222H().mo30766gi(vqg.m199515K(this.f41101P, false), this.f41094K.owner, z, o6c0.f142162b2, act(), a8c0.f68015d, z2, new g30() { // from class: l.yz60
            @Override // p149l.g30
            /* JADX INFO: renamed from: a */
            public final void mo36055a(Object obj, Object obj2, Object obj3) {
                this.f200850a.m63474v1((String) obj, (List) obj2, (Boolean) obj3);
            }
        });
    }

    /* JADX INFO: renamed from: f1 */
    public final /* synthetic */ void m63448f1(Boolean bool) {
        if (act() != null) {
            Act act = act();
            Objects.requireNonNull(act);
            if (act.isDestroyed()) {
                return;
            }
            Act act2 = act();
            Objects.requireNonNull(act2);
            if (!act2.isFinishing() && bool.booleanValue()) {
                if (NullChecker.m81303a(this.f41094K)) {
                    this.f41094K.showGreetView = false;
                }
                osi0.m165783g("发送成功");
                m63397B0();
                vqg.f182645i.add(this.f41094K.owner);
            }
        }
    }

    /* JADX INFO: renamed from: g2 */
    public void m63449g2() {
        if (NullChecker.m81303a(this.f41090I)) {
            PhotoAlbumFeedBaseFrag photoAlbumFeedBaseFrag = (PhotoAlbumFeedBaseFrag) this.f41090I;
            if (!NullChecker.m81303a(this.f41094K) || this.f41129s.getVisibility() == 0) {
                return;
            }
            photoAlbumFeedBaseFrag.f41457F.add(this.f41094K.f56011id);
            this.f41094K.showGreetView = true;
            m63450h2();
            Moment momentM209572w7 = FeedModule.f38855d.m209572w7(this.f41094K.f56011id);
            if (NullChecker.m81303a(momentM209572w7)) {
                momentM209572w7.showGreetView = true;
            }
        }
    }

    public hx60 getController() {
        return this.f41105T;
    }

    /* JADX INFO: renamed from: h2 */
    public final void m63450h2() {
        if (xdl0.m208349O0(this.f41078A)) {
            return;
        }
        String strM199515K = vqg.m199515K(this.f41101P, false);
        Moment moment = this.f41094K;
        zvf0.m220368A("e_greet_guidance", strM199515K, vwb.m200311Y("moments_user_id", moment == null ? "" : moment.owner));
        this.f41080C.setText(vqg.m199579x());
        vs0.m199799e(this.f41094K, this.f41079B, FeedModule.m60222H().me_());
        xdl0.m208325C0(this.f41078A, 0);
        this.f41079B.setAlpha(0.0f);
        this.f41080C.setAlpha(0.0f);
        xdl0.m208344M(this.f41078A, true);
        ConstraintLayout constraintLayout = this.f41078A;
        Property<View, Integer> property = f41077P0;
        Animator animatorM103742o = bt0.m103742o(constraintLayout, property, 0, t100.m186890d(80.0f));
        animatorM103742o.setDuration(200L);
        Animator animatorM103743p = bt0.m103743p(this.f41079B, "alpha", 0L, 200L, new LinearInterpolator(), 0.0f, 1.0f);
        Animator animatorM103740m = bt0.m103740m(this.f41079B, property, 0L, 200L, new LinearInterpolator(), 0, t100.m186890d(24.0f));
        Animator animatorM103743p2 = bt0.m103743p(this.f41080C, "alpha", 0L, 200L, new LinearInterpolator(), 0.0f, 1.0f);
        final AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(animatorM103743p).with(animatorM103743p2).with(animatorM103740m);
        bt0.m103733f(animatorM103742o, new Runnable() { // from class: l.xz60
            @Override // java.lang.Runnable
            public final void run() {
                this.f195166a.m63476w1(animatorSet);
            }
        });
        animatorM103742o.start();
    }

    /* JADX INFO: renamed from: i2 */
    public final void m63451i2() {
        act().duringCreated(PhotoAlbumFeedFrag.f41626G).subscribe(mkd0.m154956H(new e30() { // from class: l.x070
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f188935a.m63478y1((j760) obj);
            }
        }, new e30() { // from class: l.y070
            @Override // p149l.e30
            public final void call(Object obj) {
                PhotoAlbumBottomView.m63389s((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: k1 */
    public final /* synthetic */ void m63453k1(Moment moment, String str, boolean z, View view) {
        if (moment.views == 0 || vwb.m200296J(moment.momentViewer.viewers)) {
            return;
        }
        kyg.m147869d(act(), vqg.m199515K(str, z), moment.f56011id, str, m63404G0(moment));
    }

    /* JADX INFO: renamed from: k2 */
    public void m63454k2() {
        if (FeedModule.f38855d.f193017T.get().longValue() > 2) {
            return;
        }
        act().duringCreated(act().lifecycle()).subscribe(mkd0.m154955G(new e30() { // from class: l.t070
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f167114a.m63480z1((C4319c) obj);
            }
        }));
        zpd0 zpd0Var = FeedModule.f38855d.f193017T;
        zpd0Var.put(Long.valueOf(zpd0Var.get().longValue() + 1));
        this.f41097L0 = C4348d.m20896l().m20908t(new C4345a(act()).m20849D("点赞后自动喜欢，配对率提升5倍").m20870k(act().getResources().getColor(e1c0.f88798n)).m20855J(13.0f).m20884z(t100.m186890d(10.0f)).m20850E(true).m20883y(true).m20875q(C4345a.f15683Q).m20861b(3000L).m20882x(t100.m186890d(6.0f)).m20879u(-t100.m186890d(20.0f)), this.f41112d);
    }

    /* JADX INFO: renamed from: l1 */
    public final /* synthetic */ void m63455l1(final Moment moment, final String str, final boolean z, View view) {
        view.setOnClickListener(new View.OnClickListener() { // from class: l.f070
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f93958a.m63453k1(moment, str, z, view2);
            }
        });
    }

    /* JADX INFO: renamed from: l2 */
    public void m63456l2(boolean z, int i) {
        if (z) {
            this.f41127q.setPadding(0, 0, 0, 0);
        }
        m63477x0(this.f41127q, z);
    }

    /* JADX INFO: renamed from: m1 */
    public final /* synthetic */ void m63457m1(Moment moment, hx60 hx60Var, String str, View view) {
        Objects.requireNonNull(hx60Var);
        vwi.m200385P(moment, new ic00(hx60Var), hx60Var.mo133306m(moment.owner), act(), str, false);
    }

    /* JADX INFO: renamed from: n1 */
    public final /* synthetic */ void m63458n1(View view) throws Throwable {
        ptm.m171352d().m171355f(this.f41090I, this.f41094K.f56011id, this.f41101P);
        this.f41096L.interaction.haveMoreInteraction = false;
        xdl0.m208344M(this.f41107V.mo196902E(), false);
        zi60.m218961w();
        p6j0.m167669c("e_view_more", zi60.m218960D(this.f41101P), vwb.m200311Y("moment_id", this.f41094K.f56011id), vwb.m200311Y("recommend_reason", this.f41096L.interaction.type));
    }

    /* JADX INFO: renamed from: o0 */
    public final String m63459o0(String str) {
        return str + f41074M0;
    }

    /* JADX INFO: renamed from: o1 */
    public final /* synthetic */ void m63460o1(Boolean bool) {
        if (act() != null) {
            Act act = act();
            Objects.requireNonNull(act);
            if (act.isDestroyed()) {
                return;
            }
            Act act2 = act();
            Objects.requireNonNull(act2);
            if (!act2.isFinishing() && bool.booleanValue()) {
                if (NullChecker.m81303a(this.f41094K)) {
                    this.f41094K.showGreetView = false;
                }
                osi0.m165783g("发送成功");
                m63397B0();
                vqg.f182645i.add(this.f41094K.owner);
            }
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        qz60 qz60Var = new qz60();
        this.f41107V = qz60Var;
        qz60Var.mo219282c(this);
        this.f41109a = this.f41107V.mo196903F();
        this.f41110b = this.f41107V.mo196919l();
        this.f41111c = this.f41107V.mo196928v();
        this.f41112d = this.f41107V.mo196929w();
        this.f41113e = this.f41107V.mo196917j();
        this.f41114f = this.f41107V.mo196899B();
        this.f41115g = this.f41107V.mo196907J();
        this.f41116h = this.f41107V.mo196920m();
        this.f41117i = this.f41107V.mo196906I();
        this.f41118j = this.f41107V.mo196905H();
        this.f41119k = this.f41107V.mo196930x();
        this.f41121l = this.f41107V.mo196932z();
        this.f41122m = this.f41107V.mo196898A();
        this.f41123n = this.f41107V.mo196931y();
        this.f41124o = this.f41107V.mo196918k();
        this.f41125p = this.f41107V.mo196904G();
        this.f41127q = this.f41107V.mo196921n();
        this.f41128r = this.f41107V.mo196901D();
        this.f41129s = this.f41107V.mo196912e();
        this.f41130t = this.f41107V.mo196914g();
        this.f41131u = this.f41107V.mo196913f();
        this.f41132v = this.f41107V.mo196915h();
        this.f41133w = this.f41107V.mo196916i();
        this.f41134x = this.f41107V.mo196911d();
        this.f41135y = this.f41107V.mo177167o();
        this.f41136z = this.f41107V.mo196900C();
        this.f41078A = this.f41107V.mo196927u();
        this.f41079B = this.f41107V.mo196924r();
        this.f41080C = this.f41107V.mo196926t();
        this.f41081D = this.f41107V.mo196925s();
        this.f41084F = this.f41107V.mo196909L();
        this.f41082E = this.f41107V.mo196923q();
        this.f41086G = this.f41107V.mo196908K();
        this.f41088H = this.f41107V.mo196922p();
        this.f41110b.setPadding(f41075N0, t100.m186890d(0.0f), f41076O0, 0);
        if (NullChecker.m81303a(this.f41119k)) {
            this.f41119k.setTextColor(act().getResources().getColor(e1c0.f88756K));
            this.f41119k.setTextSize(12.0f);
        }
        this.f41111c.setVisibility(0);
        m63444c2();
        if (nkg.m159851H()) {
            m63451i2();
            xdl0.m208329E0(this.f41081D, new View.OnClickListener() { // from class: l.c070
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f78118a.m63383h1(view);
                }
            });
        }
    }

    /* JADX INFO: renamed from: p0 */
    public boolean m63461p0() {
        if (NullChecker.m81303a(this.f41094K)) {
            Moment moment = this.f41094K;
            if (moment.isLive || moment.isVoiceLive) {
                return false;
            }
        }
        return vqg.m199554k0(this.f41102Q) && !nkg.m159896o();
    }

    /* JADX INFO: renamed from: p1 */
    public final /* synthetic */ void m63462p1(boolean z, MomentMessage momentMessage, MomentMessage momentMessage2) {
        if (z) {
            CoreService coreServiceM60222H = FeedModule.m60222H();
            Act act = act();
            String str = momentMessage.value;
            Moment moment = this.f41094K;
            String str2 = moment.owner;
            coreServiceM60222H.mo30730Vk(act, str, str2, moment.f56011id, str2, Channel.get(Channel.greeting_guide), new e30() { // from class: l.q070
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f152017a.m63460o1((Boolean) obj);
                }
            });
        }
        lsi0.m151593w(R$string.f38919J3);
        PhotoAlbumFeedFrag.m64362d5(this.f41102Q);
        if (NullChecker.m81304b(this.f41094K)) {
            m63433V1(momentMessage, true, null);
        }
    }

    /* JADX INFO: renamed from: q0 */
    public boolean m63463q0() {
        return vqg.m199554k0(this.f41102Q);
    }

    /* JADX INFO: renamed from: q1 */
    public final /* synthetic */ void m63464q1(MomentMessage momentMessage, Throwable th) {
        if (NullChecker.m81304b(this.f41094K)) {
            m63433V1(momentMessage, false, th);
        }
        App.f15368d.m20433k(th);
        t2h.m186974e(th);
    }

    /* JADX INFO: renamed from: r0 */
    public final void m63465r0() {
        Intent intentM64835b = MomentDetailAct.C11306a.m64834a(getContext()).m64839f(this.f41101P).m64846m(this.f41094K.f56011id).m64847n(this.f41094K.owner).m64853t(true).m64841h(act().getClass().getName().contains("NewMainAct")).m64848o(this.f41094K.momentValue).m64854u(true).m64852s(this.f41096L).m64835b();
        if (intentM64835b == null) {
            return;
        }
        getContext().startActivity(intentM64835b);
    }

    /* JADX INFO: renamed from: r1 */
    public final /* synthetic */ void m63466r1(final MomentMessage momentMessage, final boolean z) {
        act().duringCreated(FeedModule.f38855d.m209327N6(this.f41094K.owner, momentMessage)).subscribe(mkd0.m154956H(new e30() { // from class: l.l070
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f125472a.m63462p1(z, momentMessage, (MomentMessage) obj);
            }
        }, new e30() { // from class: l.m070
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f130713a.m63464q1(momentMessage, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: s0 */
    public final void m63467s0(String str) {
        Moment moment = this.f41094K;
        if (moment == null || !moment.f56011id.equals(str)) {
            return;
        }
        this.f41087G0 = new BottomSheetDialog(act(), a8c0.f68014c);
        View viewInflate = LayoutInflater.from(act()).inflate(o6c0.f142216j0, (ViewGroup) null);
        this.f41087G0.setContentView(viewInflate);
        this.f41087G0.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.n070
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f136475a.m63428T0(dialogInterface);
            }
        });
        final VEditText vEditText = (VEditText) viewInflate.findViewById(b5c0.f73513Q1);
        final TextView textView = (TextView) viewInflate.findViewById(b5c0.f73477E1);
        vEditText.setHint(R$string.f38879D);
        act().duringCreated(vEditText.mo28618i(true)).subscribe(mkd0.m154955G(new e30() { // from class: l.u070
            @Override // p149l.e30
            public final void call(Object obj) {
                PhotoAlbumBottomView.m63362L(vEditText, textView, (CharSequence) obj);
            }
        }));
        this.f41087G0.setOnShowListener(new DialogInterface.OnShowListener() { // from class: l.v070
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                this.f179073a.m63419O0(vEditText, dialogInterface);
            }
        });
        final BottomSheetDialog bottomSheetDialog = this.f41087G0;
        textView.setOnClickListener(new View.OnClickListener() { // from class: l.w070
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f183726a.m63423Q0(vEditText, bottomSheetDialog, view);
            }
        });
        this.f41087G0.show();
    }

    /* JADX INFO: renamed from: s1 */
    public final /* synthetic */ void m63468s1(AnimatorSet animatorSet) {
        xdl0.m208325C0(this.f41129s, t100.m186890d(48.0f));
        animatorSet.start();
    }

    public void setCurrentFrag(PutongFrag putongFrag) {
        this.f41090I = putongFrag;
    }

    public void setRawFeedsCanGreeting(boolean z) {
        if (NullChecker.m81303a(this.f41107V)) {
            this.f41107V.mo177151N(z);
        }
    }

    /* JADX INFO: renamed from: t0 */
    public final void m63469t0(String str, final boolean z) {
        Moment moment = this.f41094K;
        if (moment == null || !moment.f56011id.equals(str)) {
            return;
        }
        if (!nkg.m159850G()) {
            m63447e2(false, z);
        } else if (NullChecker.m81303a(vwb.m200346r(vqg.f182645i, new w9j() { // from class: l.z070
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f200940a.m63424R0((String) obj);
            }
        }))) {
            m63447e2(false, z);
        } else {
            vqg.m199497B(act(), this.f41094K.owner, new e30() { // from class: l.a170
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f67102a.m63426S0(z, (Boolean) obj);
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: t1 */
    public final /* synthetic */ void m63470t1(j760 j760Var) {
        if (NullChecker.m81303a(this.f41094K) && this.f41094K.f56011id.equals(j760Var.f116564a) && this.f41102Q == ((Integer) j760Var.f116565b).intValue()) {
            m63442a2("preview_exit");
        }
    }

    /* JADX INFO: renamed from: u0, reason: merged with bridge method [inline-methods] */
    public final void m63452j1(final Moment moment, final ImageView imageView, FeedAutoScrollTextView feedAutoScrollTextView, final String str, final boolean z, final boolean z2) {
        act().duringCreated(this.f41105T.mo133311s(moment)).subscribe(mkd0.m154956H(new e30() { // from class: l.r070
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f157146a.m63430U0(moment, str, z, z2, (Envelope) obj);
            }
        }, new e30() { // from class: l.s070
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f161749a.m63432V0(moment, imageView, str, z, z2, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: v0 */
    public final void m63473v0(String str) {
        Owner owner;
        ArrayList arrayList = new ArrayList();
        Live live = this.f41094K.live;
        arrayList.add(j760.m140076a("anchorId", (live == null || (owner = live.anchor) == null) ? "" : owner.f38803id));
        Live live2 = this.f41094K.live;
        arrayList.add(j760.m140076a("liveId", live2 != null ? live2.f38767id : ""));
        arrayList.add(j760.m140076a("moment_id", this.f41094K.f56011id));
        arrayList.add(j760.m140076a("owner_id", this.f41094K.owner));
        zi60.m218961w();
        arrayList.add(j760.m140076a("moment_showfrom", zi60.m218960D(this.f41101P)));
        arrayList.add(j760.m140076a("moment_type", zi60.m218961w().m218992y(this.f41094K)));
        arrayList.add(j760.m140076a("comment_detail", "comment"));
        arrayList.add(j760.m140076a("moment_distance", Long.valueOf(vqg.m199507G(this.f41094K))));
        arrayList.add(j760.m140076a("moment_create_time", Long.valueOf(vqg.m199505F(this.f41094K))));
        arrayList.add(j760.m140076a("owner_active_time", Long.valueOf(vqg.m199525S(FeedModule.f38855d.m209447e8(this.f41094K.owner)))));
        arrayList.add(j760.m140076a("order", Integer.valueOf(this.f41098M)));
        zvf0.m220399u("e_comment", str, vqg.m199549i(this.f41101P, (j760[]) arrayList.toArray(new j760[0])));
    }

    /* JADX INFO: renamed from: v1 */
    public final /* synthetic */ void m63474v1(final String str, final List list, final Boolean bool) {
        if (!nkg.m159915x0()) {
            m63472u1(str, list, bool);
        } else {
            kyg.m147870e(act(), "p_fake_nearby_comments_popup", this.f41105T.mo133306m(this.f41094K.owner), new d30() { // from class: l.j070
                @Override // p149l.d30
                public final void call() {
                    this.f115641a.m63472u1(str, list, bool);
                }
            });
        }
    }

    /* JADX INFO: renamed from: w0, reason: merged with bridge method [inline-methods] */
    public final void m63472u1(String str, List<String> list, final Boolean bool) {
        final MomentMessage momentMessage = new MomentMessage();
        momentMessage.value = str;
        momentMessage.moment = this.f41094K.f56011id;
        momentMessage.owner = FeedModule.m60221F().userId();
        zi60.m218961w();
        momentMessage.momentShowFromType = zi60.m218960D(this.f41101P);
        String strTrim = str.trim();
        if (!vwb.m200296J(list)) {
            for (int i = 0; i < list.size(); i++) {
                strTrim = strTrim.replace(list.get(i), "");
            }
        }
        if (qib0.f154711Z.m119125K(strTrim)) {
            v1h.m196550A0(act(), new d30() { // from class: l.o070
                @Override // p149l.d30
                public final void call() {
                    this.f141296a.m63434W0(momentMessage, bool);
                }
            }, false);
        } else {
            m63431U1(momentMessage, bool.booleanValue());
            m63393y0(strTrim);
        }
        m63479z0(this.f41091I0);
    }

    /* JADX INFO: renamed from: w1 */
    public final /* synthetic */ void m63476w1(AnimatorSet animatorSet) {
        xdl0.m208325C0(this.f41078A, t100.m186890d(42.0f));
        animatorSet.start();
    }

    /* JADX INFO: renamed from: x0 */
    public final void m63477x0(View view, boolean z) {
        if (NullChecker.m81303a(view)) {
            xdl0.m208344M(view, z);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: y1 */
    public final /* synthetic */ void m63478y1(j760 j760Var) {
        if (m63402E1() && NullChecker.m81303a(this.f41094K) && this.f41094K.owner.equals(j760Var.f116564a) && m63402E1()) {
            if (((Boolean) j760Var.f116565b).booleanValue()) {
                m63449g2();
            } else {
                m63397B0();
            }
        }
    }

    /* JADX INFO: renamed from: z0 */
    public final void m63479z0(BottomSheetDialog bottomSheetDialog) {
        m63395A0(bottomSheetDialog, true);
    }

    /* JADX INFO: renamed from: z1 */
    public final /* synthetic */ void m63480z1(C4319c c4319c) {
        if (c4319c == C4319c.f15549j && NullChecker.m81303a(this.f41097L0)) {
            C4348d.m20896l().m20900k(this.f41097L0);
            this.f41097L0 = null;
        }
    }

    public PhotoAlbumBottomView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f41094K = null;
        this.f41096L = null;
        this.f41098M = -1;
        this.f41099N = null;
        this.f41101P = "";
        this.f41104S = false;
        this.f41126p0 = 0;
        this.f41085F0 = false;
        this.f41089H0 = new e30() { // from class: l.rz60
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f161609a.m63445d1((j760) obj);
            }
        };
    }

    public PhotoAlbumBottomView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f41094K = null;
        this.f41096L = null;
        this.f41098M = -1;
        this.f41099N = null;
        this.f41101P = "";
        this.f41104S = false;
        this.f41126p0 = 0;
        this.f41085F0 = false;
        this.f41089H0 = new e30() { // from class: l.rz60
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f161609a.m63445d1((j760) obj);
            }
        };
    }
}
