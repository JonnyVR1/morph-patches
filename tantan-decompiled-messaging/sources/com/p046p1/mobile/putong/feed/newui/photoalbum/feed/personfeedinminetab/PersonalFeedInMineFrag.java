package com.p046p1.mobile.putong.feed.newui.photoalbum.feed.personfeedinminetab;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.AbstractC0427k;
import androidx.recyclerview.widget.RecyclerView;
import com.p046p1.mobile.android.app.App;
import com.p046p1.mobile.android.p048ui.bubble.C4345a;
import com.p046p1.mobile.android.p048ui.bubble.C4348d;
import com.p046p1.mobile.putong.app.PutongFrag;
import com.p046p1.mobile.putong.core.data.ProfileLikeModuleType;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.R$string;
import com.p046p1.mobile.putong.feed.data.Moment;
import com.p046p1.mobile.putong.feed.data.MyTabPostGuide;
import com.p046p1.mobile.putong.feed.data.TopicMoment;
import com.p046p1.mobile.putong.feed.data.TopicOperations;
import com.p046p1.mobile.putong.feed.newui.photoalbum.adapter.C11280a;
import com.p046p1.mobile.putong.feed.newui.photoalbum.adapter.MomentItem;
import com.p046p1.mobile.putong.feed.newui.photoalbum.basefrag.PhotoAlbumBaseFrag;
import com.p046p1.mobile.putong.feed.newui.photoalbum.feed.personfeedinminetab.PersonalFeedInMineFrag;
import com.p046p1.mobile.putong.feed.newui.photoalbum.postguide.FeedPostGuideOneView;
import com.p046p1.mobile.putong.feed.newui.photoalbum.postguide.FeedPostGuideThreeView;
import com.p046p1.mobile.putong.feed.newui.photoalbum.postguide.FeedPostGuideTwoView;
import com.p046p1.mobile.putong.feed.newui.photoalbum.view.FeedMineTabSendMomentEnterView;
import com.p046p1.mobile.putong.newui.view.NestedUseAgencyScrollView;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p147v.VLinear;
import p147v.VRelative;
import p147v.VText;
import p149l.a5i;
import p149l.b5c0;
import p149l.bm60;
import p149l.d7h;
import p149l.e1c0;
import p149l.e30;
import p149l.e51;
import p149l.hx60;
import p149l.j760;
import p149l.jtk;
import p149l.mkd0;
import p149l.mqi0;
import p149l.ndh;
import p149l.nkg;
import p149l.o6c0;
import p149l.oe40;
import p149l.ol60;
import p149l.om60;
import p149l.p6j0;
import p149l.roj0;
import p149l.t100;
import p149l.tzl;
import p149l.vwb;
import p149l.vyp;
import p149l.w9j;
import p149l.xah;
import p149l.xaj0;
import p149l.xdl0;
import p149l.yzl;
import p149l.zpd0;
import p149l.zvf0;

/* JADX INFO: loaded from: classes12.dex */
public class PersonalFeedInMineFrag extends PutongFrag implements yzl, tzl, vyp, xah {

    /* JADX INFO: renamed from: A */
    public FrameLayout f41692A;

    /* JADX INFO: renamed from: B */
    public PhotoAlbumBaseFrag f41693B;

    /* JADX INFO: renamed from: C */
    public String f41694C;

    /* JADX INFO: renamed from: D */
    public boolean f41695D;

    /* JADX INFO: renamed from: E */
    public ol60 f41696E;

    /* JADX INFO: renamed from: F */
    public d7h f41697F;

    /* JADX INFO: renamed from: G */
    public FeedMineTabSendMomentEnterView f41698G;

    /* JADX INFO: renamed from: H */
    public View f41699H;

    /* JADX INFO: renamed from: I */
    public boolean f41700I;

    /* JADX INFO: renamed from: J */
    public VRelative f41701J;

    /* JADX INFO: renamed from: K */
    public boolean f41702K;

    /* JADX INFO: renamed from: L */
    public NestedUseAgencyScrollView f41703L;

    /* JADX INFO: renamed from: M */
    public bm60 f41704M;

    /* JADX INFO: renamed from: N */
    public xaj0<List<TopicOperations>, List<TopicMoment>, List<Moment>> f41705N;

    /* JADX INFO: renamed from: O */
    public boolean f41706O;

    /* JADX INFO: renamed from: P */
    public boolean f41707P;

    /* JADX INFO: renamed from: Q */
    public zpd0 f41708Q = new zpd0("mine_tab_show_album_post_guide_time_" + FeedModule.m60221F().userId(), 0L);

    /* JADX INFO: renamed from: R */
    public FeedPostGuideOneView f41709R;

    /* JADX INFO: renamed from: S */
    public FeedPostGuideTwoView f41710S;

    /* JADX INFO: renamed from: T */
    public FeedPostGuideThreeView f41711T;

    /* JADX INFO: renamed from: U */
    public VLinear f41712U;

    /* JADX INFO: renamed from: V */
    public TextView f41713V;

    /* JADX INFO: renamed from: W */
    public View f41714W;

    /* JADX INFO: renamed from: z */
    public LinearLayout f41715z;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.photoalbum.feed.personfeedinminetab.PersonalFeedInMineFrag$a */
    public class C11294a extends d7h {
        public C11294a(RecyclerView.Adapter adapter) {
            super(adapter);
        }

        @Override // p149l.d7h, p149l.jxk, p149l.ojc0, androidx.recyclerview.widget.RecyclerView.Adapter
        public RecyclerView.AbstractC0566d0 onCreateViewHolder(ViewGroup viewGroup, int i) {
            if (i == -2 && NullChecker.m81303a(PersonalFeedInMineFrag.this.f41699H)) {
                View viewM64460e5 = PersonalFeedInMineFrag.this.m64460e5();
                viewM64460e5.setVisibility(PersonalFeedInMineFrag.this.f41699H.getVisibility());
                m143812E(viewM64460e5);
                PersonalFeedInMineFrag.this.f41699H = viewM64460e5;
            }
            return super.onCreateViewHolder(viewGroup, i);
        }
    }

    /* JADX INFO: renamed from: W4 */
    public static /* synthetic */ void m64443W4(Throwable th) {
    }

    /* JADX INFO: renamed from: X4 */
    public static /* synthetic */ void m64444X4(Throwable th) {
    }

    /* JADX INFO: renamed from: d5 */
    public static PersonalFeedInMineFrag m64448d5(String str) {
        PersonalFeedInMineFrag personalFeedInMineFrag = new PersonalFeedInMineFrag();
        Bundle bundle = new Bundle();
        bundle.putString("user_id", str);
        personalFeedInMineFrag.setArguments(bundle);
        return personalFeedInMineFrag;
    }

    /* JADX INFO: renamed from: l5 */
    private boolean m64449l5() {
        return !a5i.m95036l(this.f41708Q.get().longValue(), mqi0.m155944o());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n5 */
    public /* synthetic */ void m64450n5() {
        this.f41704M.mo64506A();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o5 */
    public /* synthetic */ void m64451o5(roj0 roj0Var) {
        e51.m114743H(act(), new Runnable() { // from class: l.km60
            @Override // java.lang.Runnable
            public final void run() {
                this.f123738a.m64450n5();
            }
        }, 1000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p5 */
    public /* synthetic */ void m64452p5(Boolean bool) {
        boolean zBooleanValue = bool.booleanValue();
        VLinear vLinear = this.f41712U;
        if (zBooleanValue) {
            if (NullChecker.m81303a(vLinear)) {
                xdl0.m208344M(this.f41712U, true);
            }
        } else if (NullChecker.m81303a(vLinear) && xdl0.m208349O0(this.f41712U)) {
            xdl0.m208344M(this.f41712U, false);
        }
    }

    /* JADX INFO: renamed from: y5 */
    private void m64453y5() {
        act().duringCreated(FeedModule.f38855d.m209507mc(ProfileLikeModuleType.album)).subscribe(mkd0.m154956H(new e30() { // from class: l.nm60
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f139614a.m64473u5((xaj0) obj);
            }
        }, new e30() { // from class: l.dm60
            @Override // p149l.e30
            public final void call(Object obj) {
                PersonalFeedInMineFrag.m64443W4((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: A5 */
    public void m64454A5(xaj0<List<TopicOperations>, List<TopicMoment>, List<Moment>> xaj0Var, boolean z) {
        if (this.f41713V == null) {
            return;
        }
        if (NullChecker.m81303a(xaj0Var) && !vwb.m200296J(xaj0Var.f191751a)) {
            TopicOperations topicOperations = (TopicOperations) vwb.m200346r(xaj0Var.f191751a, new w9j() { // from class: l.im60
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(TEnum.equals(((TopicOperations) obj).operationType, "bubble"));
                }
            });
            if (NullChecker.m81303a(topicOperations) && m64449l5()) {
                this.f41713V.setVisibility(0);
                m64476x5(z ? topicOperations.postGuide.title : act().getString(R$string.f38903H), this.f41713V);
                this.f41708Q.put(Long.valueOf(mqi0.m155944o()));
                return;
            }
        }
        if (this.f41707P) {
            return;
        }
        this.f41707P = true;
        p6j0.m167671e("e_moment_post", OMSDialogPositon.p_navigation_view, j760.m140076a("post_bubble", "0"));
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag
    /* JADX INFO: renamed from: B4 */
    public boolean mo29632B4() {
        return false;
    }

    /* JADX INFO: renamed from: B5 */
    public void m64455B5() {
        this.f41693B.f41454z.f166899b.setTag("feed_moments");
        this.f41693B.f41454z.f166899b.setNestedScrollingEnabled(true);
        this.f41693B.f41454z.f166899b.setOverScrollMode(2);
        this.f41693B.f41454z.f166899b.requestDisallowInterceptTouchEvent(false);
        xdl0.m208368c0(this.f41693B.f41454z.f166899b, t100.m186890d(44.0f));
        this.f41693B.f41454z.f166899b.setClipToPadding(false);
    }

    /* JADX INFO: renamed from: C5 */
    public void m64456C5() {
        if (FeedModule.m60222H().me_().isJailedOrRestrict()) {
            FeedModule.m60222H().startJailedDialogLikeAct();
        } else {
            oe40.m163846k0(act(), vwb.m200324f0(new Media[0]), true, "mine");
        }
    }

    @Override // p149l.yzl
    /* JADX INFO: renamed from: L0 */
    public hx60 mo62028L0() {
        bm60 bm60Var = new bm60(this, false, this);
        this.f41704M = bm60Var;
        bm60Var.m102592Q(this);
        return this.f41704M;
    }

    @Override // p149l.tzl
    /* JADX INFO: renamed from: N0 */
    public void mo62029N0() {
        this.f41695D = true;
    }

    @Override // p149l.tzl
    /* JADX INFO: renamed from: Q0 */
    public PhotoAlbumBaseFrag mo62031Q0() {
        return this.f41693B;
    }

    @Override // p149l.xah
    /* JADX INFO: renamed from: U3 */
    public void mo64457U3() {
        this.f41699H.setVisibility(0);
    }

    @Override // p149l.yzl
    /* JADX INFO: renamed from: X0 */
    public d7h mo62032X0() {
        this.f41697F = new C11294a(this.f41696E);
        LinearLayout linearLayout = new LinearLayout(act());
        linearLayout.setOrientation(1);
        linearLayout.addView(m64467k5());
        if (!nkg.m159866W()) {
            linearLayout.addView(m64465i5());
            xdl0.m208360X(this.f41698G, t100.m186890d(16.0f));
        }
        this.f41697F.m143815H(linearLayout);
        this.f41696E.m63930s0(1);
        m64466j5();
        m64455B5();
        return this.f41697F;
    }

    /* JADX INFO: renamed from: b5 */
    public View m64458b5(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return om60.m165010b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: c5 */
    public void m64459c5() {
        if (this.f41701J != null) {
            return;
        }
        VRelative vRelative = (VRelative) m64461f5(this.f41715z, VRelative.class, "moment_outer");
        this.f41701J = vRelative;
        if (vRelative != null) {
            View viewM64464h5 = m64464h5();
            this.f41714W = viewM64464h5;
            this.f41713V = (TextView) viewM64464h5.findViewById(b5c0.f73587l1);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, t100.m186890d(48.0f));
            layoutParams.addRule(12);
            layoutParams.addRule(11);
            layoutParams.bottomMargin = t100.m186890d(7.0f);
            layoutParams.rightMargin = t100.m186890d(8.0f);
            this.f41714W.setLayoutParams(layoutParams);
            this.f41714W.setOnClickListener(new View.OnClickListener() { // from class: l.lm60
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f128773a.m64468m5(view);
                }
            });
            this.f41701J.addView(this.f41714W);
        }
    }

    /* JADX INFO: renamed from: e5 */
    public final View m64460e5() {
        View viewMo30711Ng = FeedModule.m60222H().mo30711Ng(act(), OMSDialogPositon.p_navigation_view);
        viewMo30711Ng.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        return viewMo30711Ng;
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: f4 */
    public void mo20585f4() {
        super.mo20585f4();
        duringCreated(FeedModule.m60222H().mo30824u8()).subscribe(mkd0.m154955G(new e30() { // from class: l.gm60
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f103425a.m64451o5((roj0) obj);
            }
        }));
        duringCreated(FeedModule.f38855d.f193074v1).distinctUntilChanged().subscribe(mkd0.m154955G(new e30() { // from class: l.hm60
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f108395a.m64452p5((Boolean) obj);
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: f5 */
    public <T extends View> T m64461f5(View view, Class<T> cls, String str) {
        if (view.getClass().getName().equals(cls.getName()) && str.equals(view.getTag())) {
            return view;
        }
        if (view.getParent() instanceof View) {
            return (T) m64461f5((View) view.getParent(), cls, str);
        }
        return null;
    }

    @Override // p149l.xah
    /* JADX INFO: renamed from: g0 */
    public void mo64462g0() {
        this.f41700I = true;
        this.f41699H.setVisibility(0);
        xdl0.m208360X(this.f41699H, t100.m186890d(20.0f));
        e51.m114742G(new Runnable() { // from class: l.mm60
            @Override // java.lang.Runnable
            public final void run() {
                this.f134554a.m64469q5();
            }
        });
        xdl0.m208368c0(this.f41693B.f41454z.f166899b, 0);
        NestedUseAgencyScrollView nestedUseAgencyScrollView = this.f41703L;
        if (nestedUseAgencyScrollView != null) {
            xdl0.m208325C0(nestedUseAgencyScrollView.getChildAt(0), -2);
        }
    }

    @Override // com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: g4 */
    public void mo20586g4(Bundle bundle) {
        super.mo20586g4(bundle);
        this.f41694C = getArguments().getString("user_id");
        this.f41693B = (PhotoAlbumBaseFrag) getChildFragmentManager().m2557i0("PhotoAlbumFeedBaseFrag");
        this.f41694C = getArguments().getString("user_id");
        if (NullChecker.m81303a(this.f41693B)) {
            this.f41693B.m64030k5(true);
            this.f41693B.m64029j5(true);
            this.f41693B.m64027h5(this);
            return;
        }
        PhotoAlbumBaseFrag photoAlbumBaseFragM64004N4 = PhotoAlbumBaseFrag.m64004N4(false, this.f41694C, "from_profile_album", getArguments().getInt("selected_item_position"), getArguments().getString("target_moment_id"), 2, true);
        this.f41693B = photoAlbumBaseFragM64004N4;
        photoAlbumBaseFragM64004N4.m64030k5(true);
        this.f41693B.m64029j5(true);
        this.f41693B.m64027h5(this);
        AbstractC0427k abstractC0427kM2567m = getChildFragmentManager().m2567m();
        abstractC0427kM2567m.m2804c(b5c0.f73565g, this.f41693B, "PhotoAlbumFeedBaseFrag");
        abstractC0427kM2567m.mo2708j();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: g5 */
    public <T extends View> T m64463g5(View view) {
        if (view instanceof NestedUseAgencyScrollView) {
            return view;
        }
        if (view.getParent() instanceof View) {
            return (T) m64463g5((View) view.getParent());
        }
        return null;
    }

    /* JADX INFO: renamed from: h5 */
    public final View m64464h5() {
        return act().inflater().inflate(o6c0.f142316x2, (ViewGroup) null);
    }

    @NotNull
    /* JADX INFO: renamed from: i5 */
    public FeedMineTabSendMomentEnterView m64465i5() {
        FeedMineTabSendMomentEnterView feedMineTabSendMomentEnterView = new FeedMineTabSendMomentEnterView(act());
        this.f41698G = feedMineTabSendMomentEnterView;
        feedMineTabSendMomentEnterView.setPageId(OMSDialogPositon.p_navigation_view);
        m64453y5();
        return this.f41698G;
    }

    @Override // com.p046p1.mobile.android.app.Frag
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m64458b5(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: j5 */
    public void m64466j5() {
        View viewM64460e5 = m64460e5();
        this.f41699H = viewM64460e5;
        this.f41697F.m143813F(viewM64460e5);
        this.f41699H.setVisibility(8);
    }

    @NotNull
    /* JADX INFO: renamed from: k5 */
    public RelativeLayout m64467k5() {
        VText vText = new VText(act());
        vText.setText(R$string.f39120o4);
        vText.setTextColor(getResources().getColor(e1c0.f88746A));
        vText.setTextSize(15.0f);
        vText.getPaint().setFakeBoldText(true);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(15);
        vText.setLayoutParams(layoutParams);
        vText.setId(b5c0.f73617v1);
        RelativeLayout relativeLayout = new RelativeLayout(act());
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.leftMargin = t100.m186890d(12.0f);
        layoutParams2.topMargin = t100.m186890d(24.0f);
        relativeLayout.setLayoutParams(layoutParams2);
        relativeLayout.addView(vText);
        return relativeLayout;
    }

    /* JADX INFO: renamed from: m5 */
    public final /* synthetic */ void m64468m5(View view) {
        zvf0.m220399u("e_moment_post", OMSDialogPositon.p_navigation_view, j760.m140076a("post_bubble", this.f41706O ? "1" : "0"));
        m64456C5();
    }

    @Override // p149l.yzl
    /* JADX INFO: renamed from: n1 */
    public boolean mo62033n1(List<MomentItem> list, boolean z, User user, int i) {
        if (NullChecker.m81303a(this.f41696E) && NullChecker.m81303a(this.f41698G)) {
            this.f41698G.m65149W(this.f41705N, list.size() > 0);
        }
        return false;
    }

    @Override // p149l.tzl
    /* JADX INFO: renamed from: o */
    public void mo62034o() {
        act().m50458m2();
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean z) {
        super.onHiddenChanged(z);
        if (this.f41702K) {
            m64474v5();
        }
        boolean z2 = this.f41702K;
        if (z && !z2 && NullChecker.m81303a(this.f41709R)) {
            this.f41709R.m65040Z();
        }
        this.f41702K = true;
    }

    @Override // com.p046p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (nkg.m159866W()) {
            m64459c5();
            duringCreated(FeedModule.f38855d.m209507mc(ProfileLikeModuleType.album)).subscribe(mkd0.m154956H(new e30() { // from class: l.cm60
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f81514a.m64470r5((xaj0) obj);
                }
            }, new e30() { // from class: l.fm60
                @Override // p149l.e30
                public final void call(Object obj) {
                    PersonalFeedInMineFrag.m64444X4((Throwable) obj);
                }
            }));
        }
        m64475w5();
        if (nkg.m159866W()) {
            return;
        }
        m64474v5();
    }

    @Override // com.p046p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
    }

    @Override // p149l.yzl
    /* JADX INFO: renamed from: q */
    public void mo62035q() {
    }

    /* JADX INFO: renamed from: q5 */
    public final /* synthetic */ void m64469q5() {
        xdl0.m208325C0(this.f41693B.f41454z.f166899b, -2);
    }

    /* JADX INFO: renamed from: r5 */
    public final /* synthetic */ void m64470r5(xaj0 xaj0Var) {
        m64454A5(xaj0Var, this.f41696E.getPageCount() >= 2);
    }

    @Override // p149l.yzl
    /* JADX INFO: renamed from: s0 */
    public C11280a mo62036s0() {
        PhotoAlbumBaseFrag photoAlbumBaseFrag = this.f41693B;
        ol60 ol60Var = new ol60(photoAlbumBaseFrag, this, photoAlbumBaseFrag.f41454z.f166899b, this.f41694C, "from_mine_tab_album", 2, true);
        this.f41696E = ol60Var;
        ol60Var.m164924D0(this);
        return this.f41696E;
    }

    /* JADX INFO: renamed from: s5 */
    public final /* synthetic */ void m64471s5() {
        boolean z = this.f41700I;
        PhotoAlbumBaseFrag photoAlbumBaseFrag = this.f41693B;
        if (z) {
            xdl0.m208325C0(photoAlbumBaseFrag.f41454z.f166899b, -2);
            return;
        }
        if (photoAlbumBaseFrag.f41454z.f166899b == null) {
            return;
        }
        if (this.f41703L.getHeight() == 0 || act() == null) {
            xdl0.m208325C0(this.f41693B.f41454z.f166899b, (xdl0.m208410x0(act() == null ? App.f15369e : act()) - t100.m186890d(80.0f)) - xdl0.m208331F0());
        } else {
            xdl0.m208325C0(this.f41693B.f41454z.f166899b, this.f41703L.getHeight());
        }
    }

    /* JADX INFO: renamed from: t5 */
    public final /* synthetic */ void m64472t5(String str) {
        zvf0.m220399u("e_moment_post", OMSDialogPositon.p_navigation_view, j760.m140076a("post_bubble", "1"));
        m64456C5();
    }

    /* JADX INFO: renamed from: u5 */
    public final /* synthetic */ void m64473u5(xaj0 xaj0Var) {
        this.f41705N = xaj0Var;
    }

    /* JADX INFO: renamed from: v5 */
    public void m64474v5() {
        if (nkg.m159866W()) {
            p6j0.m167671e("e_moment_post", OMSDialogPositon.p_navigation_view, j760.m140076a("post_bubble", this.f41706O ? "1" : "0"));
        } else {
            p6j0.m167671e("e_moment_post", OMSDialogPositon.p_navigation_view, new j760[0]);
        }
    }

    @Override // p149l.vyp
    /* JADX INFO: renamed from: w1 */
    public boolean mo62037w1() {
        return this.f41695D;
    }

    /* JADX INFO: renamed from: w5 */
    public void m64475w5() {
        if (this.f41703L != null) {
            return;
        }
        NestedUseAgencyScrollView nestedUseAgencyScrollView = (NestedUseAgencyScrollView) m64463g5(this.f41693B.f41454z.f166899b);
        this.f41703L = nestedUseAgencyScrollView;
        if (nestedUseAgencyScrollView == null) {
            return;
        }
        nestedUseAgencyScrollView.m79158T(new ndh(this.f41693B.f41454z.f166899b, nestedUseAgencyScrollView));
        this.f41703L.post(new Runnable() { // from class: l.jm60
            @Override // java.lang.Runnable
            public final void run() {
                this.f118615a.m64471s5();
            }
        });
    }

    /* JADX INFO: renamed from: x5 */
    public void m64476x5(String str, View view) {
        C4345a c4345a = new C4345a(act());
        c4345a.m20849D(str).m20871l(t100.m186890d(9.0f)).m20870k(act().getResources().getColor(e1c0.f88798n)).m20855J(13.0f).m20850E(true).m20882x(-t100.m186890d(20.0f)).m20879u(t100.m186890d(5.0f)).m20861b(4000L).m20858M(true).m20883y(true).m20863d(new C4345a.b() { // from class: l.em60
            @Override // com.p046p1.mobile.android.p048ui.bubble.C4345a.b
            /* JADX INFO: renamed from: a */
            public final void mo20885a(String str2) {
                this.f92186a.m64472t5(str2);
            }
        }).m20873o(jtk.f119616C, t100.m186890d(10.0f)).m20875q(C4345a.f15683Q | C4345a.f15682P);
        C4348d.m20896l().m20909u(c4345a, view, "SHARE_TIP_POST_MOMENT");
        this.f41706O = true;
        p6j0.m167671e("e_moment_post", OMSDialogPositon.p_navigation_view, j760.m140076a("post_bubble", "1"));
    }

    /* JADX INFO: renamed from: z5 */
    public void m64477z5(MyTabPostGuide myTabPostGuide) {
        if (this.f41712U == null || NullChecker.m81303a(this.f41710S) || NullChecker.m81303a(this.f41711T) || NullChecker.m81303a(this.f41709R)) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(xdl0.m208412y0(), -2);
        if (NullChecker.m81303a(myTabPostGuide)) {
            int i = myTabPostGuide.style;
            if (i == 2) {
                FeedPostGuideTwoView feedPostGuideTwoView = new FeedPostGuideTwoView(act());
                this.f41710S = feedPostGuideTwoView;
                this.f41712U.addView(feedPostGuideTwoView, layoutParams);
                this.f41710S.m65050T(myTabPostGuide, OMSDialogPositon.p_navigation_view);
                xdl0.m208344M(this.f41710S, true);
            } else if (i == 3) {
                FeedPostGuideThreeView feedPostGuideThreeView = new FeedPostGuideThreeView(act());
                this.f41711T = feedPostGuideThreeView;
                this.f41712U.addView(feedPostGuideThreeView, layoutParams);
                this.f41711T.m65045T(myTabPostGuide, OMSDialogPositon.p_navigation_view);
                xdl0.m208344M(this.f41711T, true);
            } else {
                FeedPostGuideOneView feedPostGuideOneView = new FeedPostGuideOneView(act());
                this.f41709R = feedPostGuideOneView;
                this.f41712U.addView(feedPostGuideOneView, layoutParams);
                this.f41709R.m65039Y(myTabPostGuide, OMSDialogPositon.p_navigation_view);
                xdl0.m208344M(this.f41709R, true);
            }
        } else {
            MyTabPostGuide myTabPostGuideNew_ = MyTabPostGuide.new_();
            myTabPostGuideNew_.title = "发布动态认识更多新朋友";
            myTabPostGuideNew_.style = 1;
            FeedPostGuideOneView feedPostGuideOneView2 = new FeedPostGuideOneView(act());
            this.f41709R = feedPostGuideOneView2;
            this.f41712U.addView(feedPostGuideOneView2, layoutParams);
            this.f41709R.m65039Y(myTabPostGuideNew_, OMSDialogPositon.p_navigation_view);
            xdl0.m208344M(this.f41709R, true);
        }
        isResumed();
    }

    @Override // p149l.tzl
    /* JADX INFO: renamed from: B3 */
    public void mo62027B3(j760<User, Boolean> j760Var, boolean z) {
    }
}
