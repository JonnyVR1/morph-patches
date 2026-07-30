package com.p000p1.mobile.putong.feed.newui.photoalbum.feed.personfeedinminetab;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.k;
import androidx.recyclerview.widget.RecyclerView;
import com.p000p1.mobile.putong.data.Media;
import com.p000p1.mobile.putong.data.OMSDialogPositon;
import com.p000p1.mobile.putong.data.User;
import com.p000p1.mobile.putong.data.tenum.TEnum;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.R$string;
import com.p000p1.mobile.putong.feed.data.Moment;
import com.p000p1.mobile.putong.feed.data.MyTabPostGuide;
import com.p000p1.mobile.putong.feed.data.TopicMoment;
import com.p000p1.mobile.putong.feed.data.TopicOperations;
import com.p000p1.mobile.putong.feed.newui.photoalbum.adapter.C2124a;
import com.p000p1.mobile.putong.feed.newui.photoalbum.adapter.MomentItem;
import com.p000p1.mobile.putong.feed.newui.photoalbum.basefrag.PhotoAlbumBaseFrag;
import com.p000p1.mobile.putong.feed.newui.photoalbum.feed.personfeedinminetab.PersonalFeedInMineFrag;
import com.p000p1.mobile.putong.feed.newui.photoalbum.postguide.FeedPostGuideOneView;
import com.p000p1.mobile.putong.feed.newui.photoalbum.postguide.FeedPostGuideThreeView;
import com.p000p1.mobile.putong.feed.newui.photoalbum.postguide.FeedPostGuideTwoView;
import com.p000p1.mobile.putong.feed.newui.photoalbum.view.FeedMineTabSendMomentEnterView;
import com.p1.mobile.android.app.App;
import com.p1.mobile.android.ui.bubble.a;
import com.p1.mobile.android.ui.bubble.d;
import com.p1.mobile.putong.app.PutongFrag;
import com.p1.mobile.putong.newui.view.NestedUseAgencyScrollView;
import com.tantanapp.common.utils.NullChecker;
import java.util.Collection;
import java.util.List;
import l.e30;
import l.e51;
import l.j760;
import l.jtk;
import l.mkd0;
import l.mqi0;
import l.roj0;
import l.t100;
import l.vwb;
import l.w9j;
import l.xaj0;
import l.xdl0;
import l.zpd0;
import l.zvf0;
import org.jetbrains.annotations.NotNull;
import p007l.a5i;
import p007l.b5c0;
import p007l.bm60;
import p007l.d7h;
import p007l.e1c0;
import p007l.hx60;
import p007l.ndh;
import p007l.nkg;
import p007l.o6c0;
import p007l.oe40;
import p007l.ol60;
import p007l.om60;
import p007l.p6j0;
import p007l.tzl;
import p007l.vyp;
import p007l.xah;
import p007l.yzl;
import v.VLinear;
import v.VRelative;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class PersonalFeedInMineFrag extends PutongFrag implements yzl, tzl, vyp, xah {

    /* JADX INFO: renamed from: A */
    public FrameLayout f3153A;

    /* JADX INFO: renamed from: B */
    public PhotoAlbumBaseFrag f3154B;

    /* JADX INFO: renamed from: C */
    public String f3155C;

    /* JADX INFO: renamed from: D */
    public boolean f3156D;

    /* JADX INFO: renamed from: E */
    public ol60 f3157E;

    /* JADX INFO: renamed from: F */
    public d7h f3158F;

    /* JADX INFO: renamed from: G */
    public FeedMineTabSendMomentEnterView f3159G;

    /* JADX INFO: renamed from: H */
    public View f3160H;

    /* JADX INFO: renamed from: I */
    public boolean f3161I;

    /* JADX INFO: renamed from: J */
    public VRelative f3162J;

    /* JADX INFO: renamed from: K */
    public boolean f3163K;

    /* JADX INFO: renamed from: L */
    public NestedUseAgencyScrollView f3164L;

    /* JADX INFO: renamed from: M */
    public bm60 f3165M;

    /* JADX INFO: renamed from: N */
    public xaj0<List<TopicOperations>, List<TopicMoment>, List<Moment>> f3166N;

    /* JADX INFO: renamed from: O */
    public boolean f3167O;

    /* JADX INFO: renamed from: P */
    public boolean f3168P;

    /* JADX INFO: renamed from: Q */
    public zpd0 f3169Q = new zpd0("mine_tab_show_album_post_guide_time_" + FeedModule.m1139F().userId(), 0L);

    /* JADX INFO: renamed from: R */
    public FeedPostGuideOneView f3170R;

    /* JADX INFO: renamed from: S */
    public FeedPostGuideTwoView f3171S;

    /* JADX INFO: renamed from: T */
    public FeedPostGuideThreeView f3172T;

    /* JADX INFO: renamed from: U */
    public VLinear f3173U;

    /* JADX INFO: renamed from: V */
    public TextView f3174V;

    /* JADX INFO: renamed from: W */
    public View f3175W;

    /* JADX INFO: renamed from: z */
    public LinearLayout f3176z;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.photoalbum.feed.personfeedinminetab.PersonalFeedInMineFrag$a */
    public class C2138a extends d7h {
        public C2138a(RecyclerView.Adapter adapter) {
            super(adapter);
        }

        @Override // p007l.d7h
        public RecyclerView.d0 onCreateViewHolder(ViewGroup viewGroup, int i) {
            if (i == -2 && NullChecker.a(PersonalFeedInMineFrag.this.f3160H)) {
                View viewM5545e5 = PersonalFeedInMineFrag.this.m5545e5();
                viewM5545e5.setVisibility(PersonalFeedInMineFrag.this.f3160H.getVisibility());
                E(viewM5545e5);
                PersonalFeedInMineFrag.this.f3160H = viewM5545e5;
            }
            return super.onCreateViewHolder(viewGroup, i);
        }
    }

    /* JADX INFO: renamed from: W4 */
    public static /* synthetic */ void m5527W4(Throwable th) {
    }

    /* JADX INFO: renamed from: X4 */
    public static /* synthetic */ void m5528X4(Throwable th) {
    }

    /* JADX INFO: renamed from: d5 */
    public static PersonalFeedInMineFrag m5532d5(String str) {
        PersonalFeedInMineFrag personalFeedInMineFrag = new PersonalFeedInMineFrag();
        Bundle bundle = new Bundle();
        bundle.putString("user_id", str);
        personalFeedInMineFrag.setArguments(bundle);
        return personalFeedInMineFrag;
    }

    /* JADX INFO: renamed from: l5 */
    private boolean m5533l5() {
        return !a5i.m8412l(((Long) this.f3169Q.get()).longValue(), mqi0.o());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n5 */
    public /* synthetic */ void m5534n5() {
        this.f3165M.mo5597A();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o5 */
    public /* synthetic */ void m5535o5(roj0 roj0Var) {
        e51.H(act(), new Runnable() { // from class: l.km60
            @Override // java.lang.Runnable
            public final void run() {
                this.f9745a.m5534n5();
            }
        }, 1000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p5 */
    public /* synthetic */ void m5536p5(Boolean bool) {
        boolean zBooleanValue = bool.booleanValue();
        VLinear vLinear = this.f3173U;
        if (zBooleanValue) {
            if (NullChecker.a(vLinear)) {
                xdl0.M(this.f3173U, true);
            }
        } else if (NullChecker.a(vLinear) && xdl0.O0(this.f3173U)) {
            xdl0.M(this.f3173U, false);
        }
    }

    /* JADX INFO: renamed from: y5 */
    private void m5537y5() {
        act().duringCreated(FeedModule.f316d.m16688mc("album")).subscribe(mkd0.H(new e30() { // from class: l.nm60
            public final void call(Object obj) {
                this.f10833a.m5560u5((xaj0) obj);
            }
        }, new e30() { // from class: l.dm60
            public final void call(Object obj) {
                PersonalFeedInMineFrag.m5527W4((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: A5 */
    public void m5538A5(xaj0<List<TopicOperations>, List<TopicMoment>, List<Moment>> xaj0Var, boolean z) {
        if (this.f3174V == null) {
            return;
        }
        if (NullChecker.a(xaj0Var) && !vwb.J((Collection) xaj0Var.a)) {
            TopicOperations topicOperations = (TopicOperations) vwb.r((Collection) xaj0Var.a, new w9j() { // from class: l.im60
                public final Object call(Object obj) {
                    return Boolean.valueOf(TEnum.equals(((TopicOperations) obj).operationType, "bubble"));
                }
            });
            if (NullChecker.a(topicOperations) && m5533l5()) {
                this.f3174V.setVisibility(0);
                m5563x5(z ? topicOperations.postGuide.title : act().getString(R$string.f364H), this.f3174V);
                this.f3169Q.put(Long.valueOf(mqi0.o()));
                return;
            }
        }
        if (this.f3168P) {
            return;
        }
        this.f3168P = true;
        p6j0.m12915e("e_moment_post", OMSDialogPositon.p_navigation_view, j760.a("post_bubble", "0"));
    }

    /* JADX INFO: renamed from: B4 */
    public boolean m5539B4() {
        return false;
    }

    /* JADX INFO: renamed from: B5 */
    public void m5540B5() {
        this.f3154B.f2915z.f13114b.setTag("feed_moments");
        this.f3154B.f2915z.f13114b.setNestedScrollingEnabled(true);
        this.f3154B.f2915z.f13114b.setOverScrollMode(2);
        this.f3154B.f2915z.f13114b.requestDisallowInterceptTouchEvent(false);
        xdl0.c0(this.f3154B.f2915z.f13114b, t100.d(44.0f));
        this.f3154B.f2915z.f13114b.setClipToPadding(false);
    }

    /* JADX INFO: renamed from: C5 */
    public void m5541C5() {
        if (FeedModule.m1140H().me_().isJailedOrRestrict()) {
            FeedModule.m1140H().startJailedDialogLikeAct();
        } else {
            oe40.m12583k0(act(), vwb.f0(new Media[0]), true, "mine");
        }
    }

    @Override // p007l.yzl
    /* JADX INFO: renamed from: L0 */
    public hx60 mo3004L0() {
        bm60 bm60Var = new bm60(this, false, this);
        this.f3165M = bm60Var;
        bm60Var.m8928Q(this);
        return this.f3165M;
    }

    @Override // p007l.tzl
    /* JADX INFO: renamed from: N0 */
    public void mo3005N0() {
        this.f3156D = true;
    }

    @Override // p007l.tzl
    /* JADX INFO: renamed from: Q0 */
    public PhotoAlbumBaseFrag mo3007Q0() {
        return this.f3154B;
    }

    @Override // p007l.xah
    /* JADX INFO: renamed from: U3 */
    public void mo5542U3() {
        this.f3160H.setVisibility(0);
    }

    @Override // p007l.yzl
    /* JADX INFO: renamed from: X0 */
    public d7h mo3008X0() {
        this.f3158F = new C2138a(this.f3157E);
        LinearLayout linearLayout = new LinearLayout(act());
        linearLayout.setOrientation(1);
        linearLayout.addView(m5554k5());
        if (!nkg.m12225W()) {
            linearLayout.addView(m5552i5());
            xdl0.X(this.f3159G, t100.d(16.0f));
        }
        this.f3158F.H(linearLayout);
        this.f3157E.m4968s0(1);
        m5553j5();
        m5540B5();
        return this.f3158F;
    }

    /* JADX INFO: renamed from: b5 */
    public View m5543b5(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return om60.m12656b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: c5 */
    public void m5544c5() {
        if (this.f3162J != null) {
            return;
        }
        VRelative vRelativeM5547f5 = m5547f5(this.f3176z, VRelative.class, "moment_outer");
        this.f3162J = vRelativeM5547f5;
        if (vRelativeM5547f5 != null) {
            View viewM5551h5 = m5551h5();
            this.f3175W = viewM5551h5;
            this.f3174V = (TextView) viewM5551h5.findViewById(b5c0.f6068l1);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, t100.d(48.0f));
            layoutParams.addRule(12);
            layoutParams.addRule(11);
            layoutParams.bottomMargin = t100.d(7.0f);
            layoutParams.rightMargin = t100.d(8.0f);
            this.f3175W.setLayoutParams(layoutParams);
            this.f3175W.setOnClickListener(new View.OnClickListener() { // from class: l.lm60
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f10062a.m5555m5(view);
                }
            });
            this.f3162J.addView(this.f3175W);
        }
    }

    /* JADX INFO: renamed from: e5 */
    public final View m5545e5() {
        View viewNg = FeedModule.m1140H().Ng(act(), OMSDialogPositon.p_navigation_view);
        viewNg.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        return viewNg;
    }

    /* JADX INFO: renamed from: f4 */
    public void m5546f4() {
        super.f4();
        duringCreated(FeedModule.m1140H().u8()).subscribe(mkd0.G(new e30() { // from class: l.gm60
            public final void call(Object obj) {
                this.f8479a.m5535o5((roj0) obj);
            }
        }));
        duringCreated(FeedModule.f316d.f15009v1).distinctUntilChanged().subscribe(mkd0.G(new e30() { // from class: l.hm60
            public final void call(Object obj) {
                this.f8769a.m5536p5((Boolean) obj);
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: f5 */
    public <T extends View> T m5547f5(View view, Class<T> cls, String str) {
        if (view.getClass().getName().equals(cls.getName()) && str.equals(view.getTag())) {
            return view;
        }
        if (view.getParent() instanceof View) {
            return (T) m5547f5((View) view.getParent(), cls, str);
        }
        return null;
    }

    @Override // p007l.xah
    /* JADX INFO: renamed from: g0 */
    public void mo5548g0() {
        this.f3161I = true;
        this.f3160H.setVisibility(0);
        xdl0.X(this.f3160H, t100.d(20.0f));
        e51.G(new Runnable() { // from class: l.mm60
            @Override // java.lang.Runnable
            public final void run() {
                this.f10513a.m5556q5();
            }
        });
        xdl0.c0(this.f3154B.f2915z.f13114b, 0);
        NestedUseAgencyScrollView nestedUseAgencyScrollView = this.f3164L;
        if (nestedUseAgencyScrollView != null) {
            xdl0.C0(nestedUseAgencyScrollView.getChildAt(0), -2);
        }
    }

    /* JADX INFO: renamed from: g4 */
    public void m5549g4(Bundle bundle) {
        super/*com.p1.mobile.android.app.Frag*/.g4(bundle);
        this.f3155C = getArguments().getString("user_id");
        this.f3154B = getChildFragmentManager().i0("PhotoAlbumFeedBaseFrag");
        this.f3155C = getArguments().getString("user_id");
        if (NullChecker.a(this.f3154B)) {
            this.f3154B.m5075k5(true);
            this.f3154B.m5074j5(true);
            this.f3154B.m5072h5(this);
            return;
        }
        PhotoAlbumBaseFrag photoAlbumBaseFragM5047N4 = PhotoAlbumBaseFrag.m5047N4(false, this.f3155C, "from_profile_album", getArguments().getInt("selected_item_position"), getArguments().getString("target_moment_id"), 2, true);
        this.f3154B = photoAlbumBaseFragM5047N4;
        photoAlbumBaseFragM5047N4.m5075k5(true);
        this.f3154B.m5074j5(true);
        this.f3154B.m5072h5(this);
        k kVarM = getChildFragmentManager().m();
        kVarM.c(b5c0.f6046g, this.f3154B, "PhotoAlbumFeedBaseFrag");
        kVarM.j();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: g5 */
    public <T extends View> T m5550g5(View view) {
        if (view instanceof NestedUseAgencyScrollView) {
            return view;
        }
        if (view.getParent() instanceof View) {
            return (T) m5550g5((View) view.getParent());
        }
        return null;
    }

    /* JADX INFO: renamed from: h5 */
    public final View m5551h5() {
        return act().inflater().inflate(o6c0.f11335x2, (ViewGroup) null);
    }

    @NotNull
    /* JADX INFO: renamed from: i5 */
    public FeedMineTabSendMomentEnterView m5552i5() {
        FeedMineTabSendMomentEnterView feedMineTabSendMomentEnterView = new FeedMineTabSendMomentEnterView(act());
        this.f3159G = feedMineTabSendMomentEnterView;
        feedMineTabSendMomentEnterView.setPageId(OMSDialogPositon.p_navigation_view);
        m5537y5();
        return this.f3159G;
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m5543b5(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: j5 */
    public void m5553j5() {
        View viewM5545e5 = m5545e5();
        this.f3160H = viewM5545e5;
        this.f3158F.F(viewM5545e5);
        this.f3160H.setVisibility(8);
    }

    @NotNull
    /* JADX INFO: renamed from: k5 */
    public RelativeLayout m5554k5() {
        VText vText = new VText(act());
        vText.setText(R$string.f581o4);
        vText.setTextColor(getResources().getColor(e1c0.f7102A));
        vText.setTextSize(15.0f);
        vText.getPaint().setFakeBoldText(true);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(15);
        vText.setLayoutParams(layoutParams);
        vText.setId(b5c0.f6098v1);
        RelativeLayout relativeLayout = new RelativeLayout(act());
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.leftMargin = t100.d(12.0f);
        layoutParams2.topMargin = t100.d(24.0f);
        relativeLayout.setLayoutParams(layoutParams2);
        relativeLayout.addView(vText);
        return relativeLayout;
    }

    /* JADX INFO: renamed from: m5 */
    public final /* synthetic */ void m5555m5(View view) {
        zvf0.u("e_moment_post", OMSDialogPositon.p_navigation_view, new j760[]{j760.a("post_bubble", this.f3167O ? "1" : "0")});
        m5541C5();
    }

    @Override // p007l.yzl
    /* JADX INFO: renamed from: n1 */
    public boolean mo3011n1(List<MomentItem> list, boolean z, User user, int i) {
        if (NullChecker.a(this.f3157E) && NullChecker.a(this.f3159G)) {
            this.f3159G.m6250W(this.f3166N, list.size() > 0);
        }
        return false;
    }

    @Override // p007l.tzl
    /* JADX INFO: renamed from: o */
    public void mo3012o() {
        act().finish();
    }

    public void onHiddenChanged(boolean z) {
        super.onHiddenChanged(z);
        if (this.f3163K) {
            m5561v5();
        }
        boolean z2 = this.f3163K;
        if (z && !z2 && NullChecker.a(this.f3170R)) {
            this.f3170R.m6141Z();
        }
        this.f3163K = true;
    }

    public void onResume() {
        super/*com.p1.mobile.android.app.Frag*/.onResume();
        if (nkg.m12225W()) {
            m5544c5();
            duringCreated(FeedModule.f316d.m16688mc("album")).subscribe(mkd0.H(new e30() { // from class: l.cm60
                public final void call(Object obj) {
                    this.f6684a.m5557r5((xaj0) obj);
                }
            }, new e30() { // from class: l.fm60
                public final void call(Object obj) {
                    PersonalFeedInMineFrag.m5528X4((Throwable) obj);
                }
            }));
        }
        m5562w5();
        if (nkg.m12225W()) {
            return;
        }
        m5561v5();
    }

    public void onStop() {
        super/*com.p1.mobile.android.app.Frag*/.onStop();
    }

    @Override // p007l.yzl
    /* JADX INFO: renamed from: q */
    public void mo3013q() {
    }

    /* JADX INFO: renamed from: q5 */
    public final /* synthetic */ void m5556q5() {
        xdl0.C0(this.f3154B.f2915z.f13114b, -2);
    }

    /* JADX INFO: renamed from: r5 */
    public final /* synthetic */ void m5557r5(xaj0 xaj0Var) {
        m5538A5(xaj0Var, this.f3157E.m4939C() >= 2);
    }

    @Override // p007l.yzl
    /* JADX INFO: renamed from: s0 */
    public C2124a mo3014s0() {
        PhotoAlbumBaseFrag photoAlbumBaseFrag = this.f3154B;
        ol60 ol60Var = new ol60(photoAlbumBaseFrag, this, photoAlbumBaseFrag.f2915z.f13114b, this.f3155C, "from_mine_tab_album", 2, true);
        this.f3157E = ol60Var;
        ol60Var.m12654D0(this);
        return this.f3157E;
    }

    /* JADX INFO: renamed from: s5 */
    public final /* synthetic */ void m5558s5() {
        boolean z = this.f3161I;
        PhotoAlbumBaseFrag photoAlbumBaseFrag = this.f3154B;
        if (z) {
            xdl0.C0(photoAlbumBaseFrag.f2915z.f13114b, -2);
            return;
        }
        if (photoAlbumBaseFrag.f2915z.f13114b == null) {
            return;
        }
        if (this.f3164L.getHeight() == 0 || act() == null) {
            xdl0.C0(this.f3154B.f2915z.f13114b, (xdl0.x0(act() == null ? App.e : act()) - t100.d(80.0f)) - xdl0.F0());
        } else {
            xdl0.C0(this.f3154B.f2915z.f13114b, this.f3164L.getHeight());
        }
    }

    /* JADX INFO: renamed from: t5 */
    public final /* synthetic */ void m5559t5(String str) {
        zvf0.u("e_moment_post", OMSDialogPositon.p_navigation_view, new j760[]{j760.a("post_bubble", "1")});
        m5541C5();
    }

    /* JADX INFO: renamed from: u5 */
    public final /* synthetic */ void m5560u5(xaj0 xaj0Var) {
        this.f3166N = xaj0Var;
    }

    /* JADX INFO: renamed from: v5 */
    public void m5561v5() {
        if (nkg.m12225W()) {
            p6j0.m12915e("e_moment_post", OMSDialogPositon.p_navigation_view, j760.a("post_bubble", this.f3167O ? "1" : "0"));
        } else {
            p6j0.m12915e("e_moment_post", OMSDialogPositon.p_navigation_view, new j760[0]);
        }
    }

    @Override // p007l.vyp
    /* JADX INFO: renamed from: w1 */
    public boolean mo3015w1() {
        return this.f3156D;
    }

    /* JADX INFO: renamed from: w5 */
    public void m5562w5() {
        if (this.f3164L != null) {
            return;
        }
        NestedUseAgencyScrollView nestedUseAgencyScrollViewM5550g5 = m5550g5(this.f3154B.f2915z.f13114b);
        this.f3164L = nestedUseAgencyScrollViewM5550g5;
        if (nestedUseAgencyScrollViewM5550g5 == null) {
            return;
        }
        nestedUseAgencyScrollViewM5550g5.T(new ndh(this.f3154B.f2915z.f13114b, nestedUseAgencyScrollViewM5550g5));
        this.f3164L.post(new Runnable() { // from class: l.jm60
            @Override // java.lang.Runnable
            public final void run() {
                this.f9390a.m5558s5();
            }
        });
    }

    /* JADX INFO: renamed from: x5 */
    public void m5563x5(String str, View view) {
        a aVar = new a(act());
        aVar.D(str).l(t100.d(9.0f)).k(new int[]{act().getResources().getColor(e1c0.f7154n)}).J(13.0f).E(true).x(-t100.d(20.0f)).u(t100.d(5.0f)).b(4000L).M(true).y(true).d(new a.b() { // from class: l.em60
            /* JADX INFO: renamed from: a */
            public final void m9932a(String str2) {
                this.f7420a.m5559t5(str2);
            }
        }).o(jtk.C, t100.d(10.0f)).q(a.Q | a.P);
        d.l().u(aVar, view, "SHARE_TIP_POST_MOMENT");
        this.f3167O = true;
        p6j0.m12915e("e_moment_post", OMSDialogPositon.p_navigation_view, j760.a("post_bubble", "1"));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [android.view.View, com.p1.mobile.putong.feed.newui.photoalbum.postguide.FeedPostGuideOneView] */
    /* JADX WARN: Type inference failed for: r1v5, types: [android.view.View, com.p1.mobile.putong.feed.newui.photoalbum.postguide.FeedPostGuideOneView] */
    /* JADX WARN: Type inference failed for: r1v6, types: [android.view.View, com.p1.mobile.putong.feed.newui.photoalbum.postguide.FeedPostGuideThreeView] */
    /* JADX WARN: Type inference failed for: r1v7, types: [android.view.View, com.p1.mobile.putong.feed.newui.photoalbum.postguide.FeedPostGuideTwoView] */
    /* JADX INFO: renamed from: z5 */
    public void m5564z5(MyTabPostGuide myTabPostGuide) {
        if (this.f3173U == null || NullChecker.a(this.f3171S) || NullChecker.a(this.f3172T) || NullChecker.a(this.f3170R)) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(xdl0.y0(), -2);
        if (NullChecker.a(myTabPostGuide)) {
            int i = myTabPostGuide.style;
            if (i == 2) {
                ?? feedPostGuideTwoView = new FeedPostGuideTwoView(act());
                this.f3171S = feedPostGuideTwoView;
                this.f3173U.addView(feedPostGuideTwoView, layoutParams);
                this.f3171S.m6151T(myTabPostGuide, OMSDialogPositon.p_navigation_view);
                xdl0.M(this.f3171S, true);
            } else if (i == 3) {
                ?? feedPostGuideThreeView = new FeedPostGuideThreeView(act());
                this.f3172T = feedPostGuideThreeView;
                this.f3173U.addView(feedPostGuideThreeView, layoutParams);
                this.f3172T.m6146T(myTabPostGuide, OMSDialogPositon.p_navigation_view);
                xdl0.M(this.f3172T, true);
            } else {
                ?? feedPostGuideOneView = new FeedPostGuideOneView(act());
                this.f3170R = feedPostGuideOneView;
                this.f3173U.addView(feedPostGuideOneView, layoutParams);
                this.f3170R.m6140Y(myTabPostGuide, OMSDialogPositon.p_navigation_view);
                xdl0.M(this.f3170R, true);
            }
        } else {
            MyTabPostGuide myTabPostGuideNew_ = MyTabPostGuide.new_();
            myTabPostGuideNew_.title = "发布动态认识更多新朋友";
            myTabPostGuideNew_.style = 1;
            ?? feedPostGuideOneView2 = new FeedPostGuideOneView(act());
            this.f3170R = feedPostGuideOneView2;
            this.f3173U.addView(feedPostGuideOneView2, layoutParams);
            this.f3170R.m6140Y(myTabPostGuideNew_, OMSDialogPositon.p_navigation_view);
            xdl0.M(this.f3170R, true);
        }
        isResumed();
    }

    @Override // p007l.tzl
    /* JADX INFO: renamed from: B3 */
    public void mo3002B3(j760<User, Boolean> j760Var, boolean z) {
    }
}
