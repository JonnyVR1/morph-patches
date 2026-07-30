package com.p051p1.mobile.putong.feed.newui.photoalbum.feed.personfeedinminetab;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.AbstractC0428k;
import androidx.recyclerview.widget.RecyclerView;
import com.p051p1.mobile.android.app.App;
import com.p051p1.mobile.android.p053ui.bubble.C4496a;
import com.p051p1.mobile.android.p053ui.bubble.C4499d;
import com.p051p1.mobile.putong.app.PutongFrag;
import com.p051p1.mobile.putong.core.data.ProfileLikeModuleType;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.R$string;
import com.p051p1.mobile.putong.feed.data.Moment;
import com.p051p1.mobile.putong.feed.data.MyTabPostGuide;
import com.p051p1.mobile.putong.feed.data.TopicMoment;
import com.p051p1.mobile.putong.feed.data.TopicOperations;
import com.p051p1.mobile.putong.feed.newui.photoalbum.adapter.C11443a;
import com.p051p1.mobile.putong.feed.newui.photoalbum.adapter.MomentItem;
import com.p051p1.mobile.putong.feed.newui.photoalbum.basefrag.PhotoAlbumBaseFrag;
import com.p051p1.mobile.putong.feed.newui.photoalbum.feed.personfeedinminetab.PersonalFeedInMineFrag;
import com.p051p1.mobile.putong.feed.newui.photoalbum.postguide.FeedPostGuideOneView;
import com.p051p1.mobile.putong.feed.newui.photoalbum.postguide.FeedPostGuideThreeView;
import com.p051p1.mobile.putong.feed.newui.photoalbum.postguide.FeedPostGuideTwoView;
import com.p051p1.mobile.putong.feed.newui.photoalbum.view.FeedMineTabSendMomentEnterView;
import com.p051p1.mobile.putong.newui.view.NestedUseAgencyScrollView;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p151v.VLinear;
import p151v.VRelative;
import p151v.VText;
import p153l.bkj0;
import p153l.bnl0;
import p153l.byd0;
import p153l.cfh;
import p153l.cmg;
import p153l.cn40;
import p153l.hdc0;
import p153l.hu60;
import p153l.i4g0;
import p153l.jyb;
import p153l.k9c0;
import p153l.l51;
import p153l.mch;
import p153l.n2m;
import p153l.n570;
import p153l.p6i;
import p153l.pf60;
import p153l.psd0;
import p153l.pzi0;
import p153l.qa00;
import p153l.qcj;
import p153l.s2m;
import p153l.s8h;
import p153l.tec0;
import p153l.tfj0;
import p153l.ut60;
import p153l.uu60;
import p153l.uxj0;
import p153l.v0q;
import p153l.y20;
import p153l.zvk;

/* JADX INFO: loaded from: classes13.dex */
public class PersonalFeedInMineFrag extends PutongFrag implements s2m, n2m, v0q, mch {

    /* JADX INFO: renamed from: A */
    public FrameLayout f42540A;

    /* JADX INFO: renamed from: B */
    public PhotoAlbumBaseFrag f42541B;

    /* JADX INFO: renamed from: C */
    public String f42542C;

    /* JADX INFO: renamed from: D */
    public boolean f42543D;

    /* JADX INFO: renamed from: E */
    public ut60 f42544E;

    /* JADX INFO: renamed from: F */
    public s8h f42545F;

    /* JADX INFO: renamed from: G */
    public FeedMineTabSendMomentEnterView f42546G;

    /* JADX INFO: renamed from: H */
    public View f42547H;

    /* JADX INFO: renamed from: I */
    public boolean f42548I;

    /* JADX INFO: renamed from: J */
    public VRelative f42549J;

    /* JADX INFO: renamed from: K */
    public boolean f42550K;

    /* JADX INFO: renamed from: L */
    public NestedUseAgencyScrollView f42551L;

    /* JADX INFO: renamed from: M */
    public hu60 f42552M;

    /* JADX INFO: renamed from: N */
    public bkj0<List<TopicOperations>, List<TopicMoment>, List<Moment>> f42553N;

    /* JADX INFO: renamed from: O */
    public boolean f42554O;

    /* JADX INFO: renamed from: P */
    public boolean f42555P;

    /* JADX INFO: renamed from: Q */
    public byd0 f42556Q = new byd0("mine_tab_show_album_post_guide_time_" + FeedModule.m61405F().userId(), 0L);

    /* JADX INFO: renamed from: R */
    public FeedPostGuideOneView f42557R;

    /* JADX INFO: renamed from: S */
    public FeedPostGuideTwoView f42558S;

    /* JADX INFO: renamed from: T */
    public FeedPostGuideThreeView f42559T;

    /* JADX INFO: renamed from: U */
    public VLinear f42560U;

    /* JADX INFO: renamed from: V */
    public TextView f42561V;

    /* JADX INFO: renamed from: W */
    public View f42562W;

    /* JADX INFO: renamed from: z */
    public LinearLayout f42563z;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.photoalbum.feed.personfeedinminetab.PersonalFeedInMineFrag$a */
    public class C11457a extends s8h {
        public C11457a(RecyclerView.Adapter adapter) {
            super(adapter);
        }

        @Override // p153l.s8h, p153l.zzk, p153l.vrc0, androidx.recyclerview.widget.RecyclerView.Adapter
        public RecyclerView.AbstractC0569e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
            if (i == -2 && NullChecker.m82486a(PersonalFeedInMineFrag.this.f42547H)) {
                View viewM65643e5 = PersonalFeedInMineFrag.this.m65643e5();
                viewM65643e5.setVisibility(PersonalFeedInMineFrag.this.f42547H.getVisibility());
                m222262E(viewM65643e5);
                PersonalFeedInMineFrag.this.f42547H = viewM65643e5;
            }
            return super.onCreateViewHolder(viewGroup, i);
        }
    }

    /* JADX INFO: renamed from: W4 */
    public static /* synthetic */ void m65626W4(Throwable th) {
    }

    /* JADX INFO: renamed from: X4 */
    public static /* synthetic */ void m65627X4(Throwable th) {
    }

    /* JADX INFO: renamed from: d5 */
    public static PersonalFeedInMineFrag m65631d5(String str) {
        PersonalFeedInMineFrag personalFeedInMineFrag = new PersonalFeedInMineFrag();
        Bundle bundle = new Bundle();
        bundle.putString("user_id", str);
        personalFeedInMineFrag.setArguments(bundle);
        return personalFeedInMineFrag;
    }

    /* JADX INFO: renamed from: l5 */
    private boolean m65632l5() {
        return !p6i.m170903l(this.f42556Q.get().longValue(), pzi0.m174454o());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n5 */
    public /* synthetic */ void m65633n5() {
        this.f42552M.mo65689A();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o5 */
    public /* synthetic */ void m65634o5(uxj0 uxj0Var) {
        l51.m152888H(act(), new Runnable() { // from class: l.qu60
            @Override // java.lang.Runnable
            public final void run() {
                this.f159528a.m65633n5();
            }
        }, 1000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p5 */
    public /* synthetic */ void m65635p5(Boolean bool) {
        boolean zBooleanValue = bool.booleanValue();
        VLinear vLinear = this.f42560U;
        if (zBooleanValue) {
            if (NullChecker.m82486a(vLinear)) {
                bnl0.m105524M(this.f42560U, true);
            }
        } else if (NullChecker.m82486a(vLinear) && bnl0.m105529O0(this.f42560U)) {
            bnl0.m105524M(this.f42560U, false);
        }
    }

    /* JADX INFO: renamed from: y5 */
    private void m65636y5() {
        act().duringCreated(FeedModule.f39703d.m145748mc(ProfileLikeModuleType.album)).subscribe(psd0.m173597H(new y20() { // from class: l.tu60
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f176168a.m65656u5((bkj0) obj);
            }
        }, new y20() { // from class: l.ju60
            @Override // p153l.y20
            public final void call(Object obj) {
                PersonalFeedInMineFrag.m65626W4((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: A5 */
    public void m65637A5(bkj0<List<TopicOperations>, List<TopicMoment>, List<Moment>> bkj0Var, boolean z) {
        if (this.f42561V == null) {
            return;
        }
        if (NullChecker.m82486a(bkj0Var) && !jyb.m147479J(bkj0Var.f77081a)) {
            TopicOperations topicOperations = (TopicOperations) jyb.m147529r(bkj0Var.f77081a, new qcj() { // from class: l.ou60
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(TEnum.equals(((TopicOperations) obj).operationType, "bubble"));
                }
            });
            if (NullChecker.m82486a(topicOperations) && m65632l5()) {
                this.f42561V.setVisibility(0);
                m65659x5(z ? topicOperations.postGuide.title : act().getString(R$string.f39751H), this.f42561V);
                this.f42556Q.put(Long.valueOf(pzi0.m174454o()));
                return;
            }
        }
        if (this.f42555P) {
            return;
        }
        this.f42555P = true;
        tfj0.m190942e("e_moment_post", OMSDialogPositon.p_navigation_view, pf60.m172085a("post_bubble", "0"));
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag
    /* JADX INFO: renamed from: B4 */
    public boolean mo30630B4() {
        return false;
    }

    /* JADX INFO: renamed from: B5 */
    public void m65638B5() {
        this.f42541B.f42302z.f197638b.setTag("feed_moments");
        this.f42541B.f42302z.f197638b.setNestedScrollingEnabled(true);
        this.f42541B.f42302z.f197638b.setOverScrollMode(2);
        this.f42541B.f42302z.f197638b.requestDisallowInterceptTouchEvent(false);
        bnl0.m105548c0(this.f42541B.f42302z.f197638b, qa00.m175859d(44.0f));
        this.f42541B.f42302z.f197638b.setClipToPadding(false);
    }

    /* JADX INFO: renamed from: C5 */
    public void m65639C5() {
        if (FeedModule.m61406H().me_().isJailedOrRestrict()) {
            FeedModule.m61406H().startJailedDialogLikeAct();
        } else {
            cn40.m111396k0(act(), jyb.m147507f0(new Media[0]), true, "mine");
        }
    }

    @Override // p153l.s2m
    /* JADX INFO: renamed from: L0 */
    public n570 mo63211L0() {
        hu60 hu60Var = new hu60(this, false, this);
        this.f42552M = hu60Var;
        hu60Var.m137128Q(this);
        return this.f42552M;
    }

    @Override // p153l.n2m
    /* JADX INFO: renamed from: N0 */
    public void mo63212N0() {
        this.f42543D = true;
    }

    @Override // p153l.n2m
    /* JADX INFO: renamed from: Q0 */
    public PhotoAlbumBaseFrag mo63214Q0() {
        return this.f42541B;
    }

    @Override // p153l.mch
    /* JADX INFO: renamed from: U3 */
    public void mo65640U3() {
        this.f42547H.setVisibility(0);
    }

    @Override // p153l.s2m
    /* JADX INFO: renamed from: X0 */
    public s8h mo63215X0() {
        this.f42545F = new C11457a(this.f42544E);
        LinearLayout linearLayout = new LinearLayout(act());
        linearLayout.setOrientation(1);
        linearLayout.addView(m65650k5());
        if (!cmg.m111195W()) {
            linearLayout.addView(m65648i5());
            bnl0.m105540X(this.f42546G, qa00.m175859d(16.0f));
        }
        this.f42545F.m222265H(linearLayout);
        this.f42544E.m65113s0(1);
        m65649j5();
        m65638B5();
        return this.f42545F;
    }

    /* JADX INFO: renamed from: b5 */
    public View m65641b5(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return uu60.m198172b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: c5 */
    public void m65642c5() {
        if (this.f42549J != null) {
            return;
        }
        VRelative vRelative = (VRelative) m65644f5(this.f42563z, VRelative.class, "moment_outer");
        this.f42549J = vRelative;
        if (vRelative != null) {
            View viewM65647h5 = m65647h5();
            this.f42562W = viewM65647h5;
            this.f42561V = (TextView) viewM65647h5.findViewById(hdc0.f108940l1);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, qa00.m175859d(48.0f));
            layoutParams.addRule(12);
            layoutParams.addRule(11);
            layoutParams.bottomMargin = qa00.m175859d(7.0f);
            layoutParams.rightMargin = qa00.m175859d(8.0f);
            this.f42562W.setLayoutParams(layoutParams);
            this.f42562W.setOnClickListener(new View.OnClickListener() { // from class: l.ru60
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f164903a.m65651m5(view);
                }
            });
            this.f42549J.addView(this.f42562W);
        }
    }

    /* JADX INFO: renamed from: e5 */
    public final View m65643e5() {
        View viewMo31714Ng = FeedModule.m61406H().mo31714Ng(act(), OMSDialogPositon.p_navigation_view);
        viewMo31714Ng.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        return viewMo31714Ng;
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: f4 */
    public void mo21584f4() {
        super.mo21584f4();
        duringCreated(FeedModule.m61406H().mo31827u8()).subscribe(psd0.m173596G(new y20() { // from class: l.mu60
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f138750a.m65634o5((uxj0) obj);
            }
        }));
        duringCreated(FeedModule.f39703d.f121384v1).distinctUntilChanged().subscribe(psd0.m173596G(new y20() { // from class: l.nu60
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f143680a.m65635p5((Boolean) obj);
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: f5 */
    public <T extends View> T m65644f5(View view, Class<T> cls, String str) {
        if (view.getClass().getName().equals(cls.getName()) && str.equals(view.getTag())) {
            return view;
        }
        if (view.getParent() instanceof View) {
            return (T) m65644f5((View) view.getParent(), cls, str);
        }
        return null;
    }

    @Override // p153l.mch
    /* JADX INFO: renamed from: g0 */
    public void mo65645g0() {
        this.f42548I = true;
        this.f42547H.setVisibility(0);
        bnl0.m105540X(this.f42547H, qa00.m175859d(20.0f));
        l51.m152887G(new Runnable() { // from class: l.su60
            @Override // java.lang.Runnable
            public final void run() {
                this.f170652a.m65652q5();
            }
        });
        bnl0.m105548c0(this.f42541B.f42302z.f197638b, 0);
        NestedUseAgencyScrollView nestedUseAgencyScrollView = this.f42551L;
        if (nestedUseAgencyScrollView != null) {
            bnl0.m105505C0(nestedUseAgencyScrollView.getChildAt(0), -2);
        }
    }

    @Override // com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: g4 */
    public void mo21585g4(Bundle bundle) {
        super.mo21585g4(bundle);
        this.f42542C = getArguments().getString("user_id");
        this.f42541B = (PhotoAlbumBaseFrag) getChildFragmentManager().m2558i0("PhotoAlbumFeedBaseFrag");
        this.f42542C = getArguments().getString("user_id");
        if (NullChecker.m82486a(this.f42541B)) {
            this.f42541B.m65213k5(true);
            this.f42541B.m65212j5(true);
            this.f42541B.m65210h5(this);
            return;
        }
        PhotoAlbumBaseFrag photoAlbumBaseFragM65187N4 = PhotoAlbumBaseFrag.m65187N4(false, this.f42542C, "from_profile_album", getArguments().getInt("selected_item_position"), getArguments().getString("target_moment_id"), 2, true);
        this.f42541B = photoAlbumBaseFragM65187N4;
        photoAlbumBaseFragM65187N4.m65213k5(true);
        this.f42541B.m65212j5(true);
        this.f42541B.m65210h5(this);
        AbstractC0428k abstractC0428kM2568m = getChildFragmentManager().m2568m();
        abstractC0428kM2568m.m2805c(hdc0.f108918g, this.f42541B, "PhotoAlbumFeedBaseFrag");
        abstractC0428kM2568m.mo2709j();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: g5 */
    public <T extends View> T m65646g5(View view) {
        if (view instanceof NestedUseAgencyScrollView) {
            return view;
        }
        if (view.getParent() instanceof View) {
            return (T) m65646g5((View) view.getParent());
        }
        return null;
    }

    /* JADX INFO: renamed from: h5 */
    public final View m65647h5() {
        return act().inflater().inflate(tec0.f173785x2, (ViewGroup) null);
    }

    @NotNull
    /* JADX INFO: renamed from: i5 */
    public FeedMineTabSendMomentEnterView m65648i5() {
        FeedMineTabSendMomentEnterView feedMineTabSendMomentEnterView = new FeedMineTabSendMomentEnterView(act());
        this.f42546G = feedMineTabSendMomentEnterView;
        feedMineTabSendMomentEnterView.setPageId(OMSDialogPositon.p_navigation_view);
        m65636y5();
        return this.f42546G;
    }

    @Override // com.p051p1.mobile.android.app.Frag
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m65641b5(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: j5 */
    public void m65649j5() {
        View viewM65643e5 = m65643e5();
        this.f42547H = viewM65643e5;
        this.f42545F.m222263F(viewM65643e5);
        this.f42547H.setVisibility(8);
    }

    @NotNull
    /* JADX INFO: renamed from: k5 */
    public RelativeLayout m65650k5() {
        VText vText = new VText(act());
        vText.setText(R$string.f39968o4);
        vText.setTextColor(getResources().getColor(k9c0.f124469A));
        vText.setTextSize(15.0f);
        vText.getPaint().setFakeBoldText(true);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(15);
        vText.setLayoutParams(layoutParams);
        vText.setId(hdc0.f108970v1);
        RelativeLayout relativeLayout = new RelativeLayout(act());
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.leftMargin = qa00.m175859d(12.0f);
        layoutParams2.topMargin = qa00.m175859d(24.0f);
        relativeLayout.setLayoutParams(layoutParams2);
        relativeLayout.addView(vText);
        return relativeLayout;
    }

    /* JADX INFO: renamed from: m5 */
    public final /* synthetic */ void m65651m5(View view) {
        i4g0.m138523u("e_moment_post", OMSDialogPositon.p_navigation_view, pf60.m172085a("post_bubble", this.f42554O ? "1" : "0"));
        m65639C5();
    }

    @Override // p153l.s2m
    /* JADX INFO: renamed from: n1 */
    public boolean mo63216n1(List<MomentItem> list, boolean z, User user, int i) {
        if (NullChecker.m82486a(this.f42544E) && NullChecker.m82486a(this.f42546G)) {
            this.f42546G.m66332W(this.f42553N, list.size() > 0);
        }
        return false;
    }

    @Override // p153l.n2m
    /* JADX INFO: renamed from: o */
    public void mo63217o() {
        act().m48999H2();
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean z) {
        super.onHiddenChanged(z);
        if (this.f42550K) {
            m65657v5();
        }
        boolean z2 = this.f42550K;
        if (z && !z2 && NullChecker.m82486a(this.f42557R)) {
            this.f42557R.m66223Z();
        }
        this.f42550K = true;
    }

    @Override // com.p051p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (cmg.m111195W()) {
            m65642c5();
            duringCreated(FeedModule.f39703d.m145748mc(ProfileLikeModuleType.album)).subscribe(psd0.m173597H(new y20() { // from class: l.iu60
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f116901a.m65653r5((bkj0) obj);
                }
            }, new y20() { // from class: l.lu60
                @Override // p153l.y20
                public final void call(Object obj) {
                    PersonalFeedInMineFrag.m65627X4((Throwable) obj);
                }
            }));
        }
        m65658w5();
        if (cmg.m111195W()) {
            return;
        }
        m65657v5();
    }

    @Override // com.p051p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
    }

    @Override // p153l.s2m
    /* JADX INFO: renamed from: p */
    public void mo63218p() {
    }

    /* JADX INFO: renamed from: q5 */
    public final /* synthetic */ void m65652q5() {
        bnl0.m105505C0(this.f42541B.f42302z.f197638b, -2);
    }

    /* JADX INFO: renamed from: r5 */
    public final /* synthetic */ void m65653r5(bkj0 bkj0Var) {
        m65637A5(bkj0Var, this.f42544E.getPageCount() >= 2);
    }

    @Override // p153l.s2m
    /* JADX INFO: renamed from: s0 */
    public C11443a mo63219s0() {
        PhotoAlbumBaseFrag photoAlbumBaseFrag = this.f42541B;
        ut60 ut60Var = new ut60(photoAlbumBaseFrag, this, photoAlbumBaseFrag.f42302z.f197638b, this.f42542C, "from_mine_tab_album", 2, true);
        this.f42544E = ut60Var;
        ut60Var.m197961D0(this);
        return this.f42544E;
    }

    /* JADX INFO: renamed from: s5 */
    public final /* synthetic */ void m65654s5() {
        boolean z = this.f42548I;
        PhotoAlbumBaseFrag photoAlbumBaseFrag = this.f42541B;
        if (z) {
            bnl0.m105505C0(photoAlbumBaseFrag.f42302z.f197638b, -2);
            return;
        }
        if (photoAlbumBaseFrag.f42302z.f197638b == null) {
            return;
        }
        if (this.f42551L.getHeight() == 0 || act() == null) {
            bnl0.m105505C0(this.f42541B.f42302z.f197638b, (bnl0.m105590x0(act() == null ? App.f16088e : act()) - qa00.m175859d(80.0f)) - bnl0.m105511F0());
        } else {
            bnl0.m105505C0(this.f42541B.f42302z.f197638b, this.f42551L.getHeight());
        }
    }

    /* JADX INFO: renamed from: t5 */
    public final /* synthetic */ void m65655t5(String str) {
        i4g0.m138523u("e_moment_post", OMSDialogPositon.p_navigation_view, pf60.m172085a("post_bubble", "1"));
        m65639C5();
    }

    /* JADX INFO: renamed from: u5 */
    public final /* synthetic */ void m65656u5(bkj0 bkj0Var) {
        this.f42553N = bkj0Var;
    }

    /* JADX INFO: renamed from: v5 */
    public void m65657v5() {
        if (cmg.m111195W()) {
            tfj0.m190942e("e_moment_post", OMSDialogPositon.p_navigation_view, pf60.m172085a("post_bubble", this.f42554O ? "1" : "0"));
        } else {
            tfj0.m190942e("e_moment_post", OMSDialogPositon.p_navigation_view, new pf60[0]);
        }
    }

    @Override // p153l.v0q
    /* JADX INFO: renamed from: w1 */
    public boolean mo63220w1() {
        return this.f42543D;
    }

    /* JADX INFO: renamed from: w5 */
    public void m65658w5() {
        if (this.f42551L != null) {
            return;
        }
        NestedUseAgencyScrollView nestedUseAgencyScrollView = (NestedUseAgencyScrollView) m65646g5(this.f42541B.f42302z.f197638b);
        this.f42551L = nestedUseAgencyScrollView;
        if (nestedUseAgencyScrollView == null) {
            return;
        }
        nestedUseAgencyScrollView.m80341T(new cfh(this.f42541B.f42302z.f197638b, nestedUseAgencyScrollView));
        this.f42551L.post(new Runnable() { // from class: l.pu60
            @Override // java.lang.Runnable
            public final void run() {
                this.f154151a.m65654s5();
            }
        });
    }

    /* JADX INFO: renamed from: x5 */
    public void m65659x5(String str, View view) {
        C4496a c4496a = new C4496a(act());
        c4496a.m21848D(str).m21870l(qa00.m175859d(9.0f)).m21869k(act().getResources().getColor(k9c0.f124521n)).m21854J(13.0f).m21849E(true).m21881x(-qa00.m175859d(20.0f)).m21878u(qa00.m175859d(5.0f)).m21860b(4000L).m21857M(true).m21882y(true).m21862d(new C4496a.b() { // from class: l.ku60
            @Override // com.p051p1.mobile.android.p053ui.bubble.C4496a.b
            /* JADX INFO: renamed from: a */
            public final void mo21884a(String str2) {
                this.f128819a.m65655t5(str2);
            }
        }).m21872o(zvk.f206226C, qa00.m175859d(10.0f)).m21874q(C4496a.f16402Q | C4496a.f16401P);
        C4499d.m21895l().m21908u(c4496a, view, "SHARE_TIP_POST_MOMENT");
        this.f42554O = true;
        tfj0.m190942e("e_moment_post", OMSDialogPositon.p_navigation_view, pf60.m172085a("post_bubble", "1"));
    }

    /* JADX INFO: renamed from: z5 */
    public void m65660z5(MyTabPostGuide myTabPostGuide) {
        if (this.f42560U == null || NullChecker.m82486a(this.f42558S) || NullChecker.m82486a(this.f42559T) || NullChecker.m82486a(this.f42557R)) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(bnl0.m105592y0(), -2);
        if (NullChecker.m82486a(myTabPostGuide)) {
            int i = myTabPostGuide.style;
            if (i == 2) {
                FeedPostGuideTwoView feedPostGuideTwoView = new FeedPostGuideTwoView(act());
                this.f42558S = feedPostGuideTwoView;
                this.f42560U.addView(feedPostGuideTwoView, layoutParams);
                this.f42558S.m66233T(myTabPostGuide, OMSDialogPositon.p_navigation_view);
                bnl0.m105524M(this.f42558S, true);
            } else if (i == 3) {
                FeedPostGuideThreeView feedPostGuideThreeView = new FeedPostGuideThreeView(act());
                this.f42559T = feedPostGuideThreeView;
                this.f42560U.addView(feedPostGuideThreeView, layoutParams);
                this.f42559T.m66228T(myTabPostGuide, OMSDialogPositon.p_navigation_view);
                bnl0.m105524M(this.f42559T, true);
            } else {
                FeedPostGuideOneView feedPostGuideOneView = new FeedPostGuideOneView(act());
                this.f42557R = feedPostGuideOneView;
                this.f42560U.addView(feedPostGuideOneView, layoutParams);
                this.f42557R.m66222Y(myTabPostGuide, OMSDialogPositon.p_navigation_view);
                bnl0.m105524M(this.f42557R, true);
            }
        } else {
            MyTabPostGuide myTabPostGuideNew_ = MyTabPostGuide.new_();
            myTabPostGuideNew_.title = "发布动态认识更多新朋友";
            myTabPostGuideNew_.style = 1;
            FeedPostGuideOneView feedPostGuideOneView2 = new FeedPostGuideOneView(act());
            this.f42557R = feedPostGuideOneView2;
            this.f42560U.addView(feedPostGuideOneView2, layoutParams);
            this.f42557R.m66222Y(myTabPostGuideNew_, OMSDialogPositon.p_navigation_view);
            bnl0.m105524M(this.f42557R, true);
        }
        isResumed();
    }

    @Override // p153l.n2m
    /* JADX INFO: renamed from: B3 */
    public void mo63210B3(pf60<User, Boolean> pf60Var, boolean z) {
    }
}
