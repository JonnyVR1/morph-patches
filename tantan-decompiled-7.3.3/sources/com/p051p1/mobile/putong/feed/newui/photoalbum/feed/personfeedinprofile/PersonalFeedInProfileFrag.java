package com.p051p1.mobile.putong.feed.newui.photoalbum.feed.personfeedinprofile;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.fragment.app.AbstractC0428k;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p051p1.mobile.putong.app.PutongFrag;
import com.p051p1.mobile.putong.data.Envelope;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.R$string;
import com.p051p1.mobile.putong.feed.data.FeedData;
import com.p051p1.mobile.putong.feed.data.TopicMoment;
import com.p051p1.mobile.putong.feed.newui.photoalbum.adapter.C11443a;
import com.p051p1.mobile.putong.feed.newui.photoalbum.adapter.MomentItem;
import com.p051p1.mobile.putong.feed.newui.photoalbum.basefrag.PhotoAlbumBaseFrag;
import com.p051p1.mobile.putong.feed.newui.photoalbum.feed.personfeedinprofile.PersonalFeedInProfileFrag;
import com.p051p1.mobile.putong.feed.newui.photoalbum.momentdetail.feedlist.FeedMaxHeightRecyclerView;
import com.p051p1.mobile.putong.feed.newui.photoalbum.view.FeedSendMomentEnterView;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p153l.bnl0;
import p153l.gv60;
import p153l.hdc0;
import p153l.n2m;
import p153l.n570;
import p153l.pf60;
import p153l.psd0;
import p153l.qa00;
import p153l.s2m;
import p153l.s8h;
import p153l.tt60;
import p153l.v0q;
import p153l.y20;
import p153l.y670;

/* JADX INFO: loaded from: classes13.dex */
public class PersonalFeedInProfileFrag extends PutongFrag implements s2m, n2m, v0q {

    /* JADX INFO: renamed from: A */
    public FeedWriterLevelInProfileView f42578A;

    /* JADX INFO: renamed from: B */
    public TopicListView f42579B;

    /* JADX INFO: renamed from: C */
    public FrameLayout f42580C;

    /* JADX INFO: renamed from: D */
    public PhotoAlbumBaseFrag f42581D;

    /* JADX INFO: renamed from: E */
    public tt60 f42582E;

    /* JADX INFO: renamed from: F */
    public String f42583F;

    /* JADX INFO: renamed from: G */
    public boolean f42584G;

    /* JADX INFO: renamed from: H */
    public s8h f42585H;

    /* JADX INFO: renamed from: I */
    public C11460a f42586I;

    /* JADX INFO: renamed from: L */
    public FeedSendMomentEnterView f42589L;

    /* JADX INFO: renamed from: M */
    public int f42590M;

    /* JADX INFO: renamed from: z */
    public LinearLayout f42592z;

    /* JADX INFO: renamed from: J */
    public float f42587J = 0.0f;

    /* JADX INFO: renamed from: K */
    public int f42588K = 0;

    /* JADX INFO: renamed from: N */
    public boolean f42591N = false;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.photoalbum.feed.personfeedinprofile.PersonalFeedInProfileFrag$a */
    public class C11458a extends RecyclerView.AbstractC0584t {
        public C11458a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0584t
        public void onScrolled(@NonNull RecyclerView recyclerView, int i, int i2) {
            super.onScrolled(recyclerView, i, i2);
            if (!PersonalFeedInProfileFrag.this.f42581D.f42302z.f197638b.canScrollVertically(-1)) {
                FeedModule.m61406H().mo31793kt();
            }
            if (((LinearLayoutManager) recyclerView.getLayoutManager()).findFirstCompletelyVisibleItemPosition() == 0) {
                FeedModule.m61406H().mo31793kt();
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.photoalbum.feed.personfeedinprofile.PersonalFeedInProfileFrag$b */
    public class C11459b implements RecyclerView.InterfaceC0583s {
        public C11459b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.InterfaceC0583s
        /* JADX INFO: renamed from: a */
        public void mo3425a(@NonNull RecyclerView recyclerView, @NonNull MotionEvent motionEvent) {
        }

        /* JADX WARN: Code duplicated, block: B:26:0x0086  */
        @Override // androidx.recyclerview.widget.RecyclerView.InterfaceC0583s
        /* JADX INFO: renamed from: c */
        public boolean mo3426c(@NonNull RecyclerView recyclerView, @NonNull MotionEvent motionEvent) {
            boolean z;
            PersonalFeedInProfileFrag personalFeedInProfileFrag;
            int action = motionEvent.getAction();
            if (action != 0) {
                if (action == 1) {
                    if (PersonalFeedInProfileFrag.this.f42581D.f42302z.f197638b.canScrollVertically(-1)) {
                        z = true;
                    } else {
                        FeedModule.m61406H().mo31793kt();
                        z = false;
                    }
                    if (((LinearLayoutManager) recyclerView.getLayoutManager()).findFirstCompletelyVisibleItemPosition() == 0) {
                        FeedModule.m61406H().mo31793kt();
                        z = false;
                    }
                } else if (action == 3 && PersonalFeedInProfileFrag.this.f42587J != 0.0f && !FeedModule.m61406H().mo31755cs()) {
                    if (PersonalFeedInProfileFrag.this.f42587J - motionEvent.getRawY() > PersonalFeedInProfileFrag.this.f42588K) {
                        FeedModule.m61406H().mo31768gc();
                    }
                }
                if (FeedModule.m61406H().mo31755cs()) {
                    personalFeedInProfileFrag = PersonalFeedInProfileFrag.this;
                    if (personalFeedInProfileFrag.f42591N && z) {
                        personalFeedInProfileFrag.f42581D.f42302z.f197638b.getParent().requestDisallowInterceptTouchEvent(true);
                    }
                }
                return false;
            }
            PersonalFeedInProfileFrag.this.f42587J = motionEvent.getRawY();
            z = true;
            if (FeedModule.m61406H().mo31755cs()) {
                personalFeedInProfileFrag = PersonalFeedInProfileFrag.this;
                if (personalFeedInProfileFrag.f42591N) {
                    personalFeedInProfileFrag.f42581D.f42302z.f197638b.getParent().requestDisallowInterceptTouchEvent(true);
                }
            }
            return false;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.InterfaceC0583s
        /* JADX INFO: renamed from: e */
        public void mo3427e(boolean z) {
        }
    }

    /* JADX INFO: renamed from: M4 */
    public static /* synthetic */ void m65665M4(Throwable th) {
    }

    @Override // p153l.s2m
    /* JADX INFO: renamed from: L0 */
    public n570 mo63211L0() {
        C11460a c11460a = new C11460a(this);
        this.f42586I = c11460a;
        return c11460a;
    }

    @Override // p153l.n2m
    /* JADX INFO: renamed from: N0 */
    public void mo63212N0() {
        this.f42584G = true;
    }

    @Override // p153l.n2m
    /* JADX INFO: renamed from: Q0 */
    public PhotoAlbumBaseFrag mo63214Q0() {
        return this.f42581D;
    }

    /* JADX INFO: renamed from: T4 */
    public View m65672T4(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return gv60.m132494b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: U4 */
    public final /* synthetic */ void m65673U4() {
        y670 y670Var;
        FeedMaxHeightRecyclerView feedMaxHeightRecyclerView;
        PhotoAlbumBaseFrag photoAlbumBaseFrag = this.f42581D;
        if (photoAlbumBaseFrag == null || (y670Var = photoAlbumBaseFrag.f42302z) == null || (feedMaxHeightRecyclerView = y670Var.f197638b) == null || this.f42580C == null) {
            this.f42591N = false;
        } else {
            this.f42591N = feedMaxHeightRecyclerView.getHeight() >= this.f42580C.getHeight();
        }
    }

    /* JADX INFO: renamed from: V4 */
    public final /* synthetic */ void m65674V4(Envelope envelope) {
        List<TopicMoment> list = ((FeedData) envelope.getModuleData(FeedData.class)).momentTopics;
        if (list.size() != 0) {
            this.f42579B.setVisibility(0);
            this.f42579B.m65680s(new C11461b.a().m65709b(qa00.m175859d(10.0f)).m65711d(this.f42586I).m65712e(list.subList(0, Math.min(30, list.size()))).m65710c(true).m65708a());
            return;
        }
        FeedSendMomentEnterView feedSendMomentEnterView = this.f42589L;
        if (feedSendMomentEnterView != null) {
            bnl0.m105554f0(feedSendMomentEnterView, qa00.m175859d(15.0f));
        } else {
            this.f42590M = qa00.m175859d(15.0f);
        }
        this.f42579B.setVisibility(8);
    }

    /* JADX INFO: renamed from: W4 */
    public final void m65675W4() {
        FeedModule.f39703d.m145658Zc(this.f42583F).subscribe(psd0.m173597H(new y20() { // from class: l.dv60
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f90911a.m65674V4((Envelope) obj);
            }
        }, new y20() { // from class: l.ev60
            @Override // p153l.y20
            public final void call(Object obj) {
                PersonalFeedInProfileFrag.m65665M4((Throwable) obj);
            }
        }));
    }

    @Override // p153l.s2m
    /* JADX INFO: renamed from: X0 */
    public s8h mo63215X0() {
        this.f42585H = new s8h(this.f42582E);
        LinearLayout linearLayout = new LinearLayout(act());
        linearLayout.setOrientation(1);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f42579B.getLayoutParams();
        layoutParams.topMargin = qa00.m175859d(18.0f);
        layoutParams.bottomMargin = qa00.m175859d(6.0f);
        if (FeedModule.m61406H().me_().f56859id.equals(this.f42583F)) {
            FeedSendMomentEnterView feedSendMomentEnterView = new FeedSendMomentEnterView(act());
            this.f42589L = feedSendMomentEnterView;
            feedSendMomentEnterView.setPageId(OMSDialogPositon.p_suggest_user_profile_info_view);
            linearLayout.addView(this.f42589L);
            int i = this.f42590M;
            if (i != 0) {
                bnl0.m105554f0(this.f42589L, i);
            }
            layoutParams.topMargin = qa00.m175859d(24.0f);
            layoutParams.bottomMargin = qa00.m175859d(24.0f);
        }
        this.f42579B.setLayoutParams(layoutParams);
        this.f42585H.m222265H(linearLayout);
        this.f42582E.m65113s0(1);
        return this.f42585H;
    }

    @Override // com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: g4 */
    public void mo21585g4(Bundle bundle) {
        super.mo21585g4(bundle);
        this.f42583F = getArguments().getString("user_id");
        PhotoAlbumBaseFrag photoAlbumBaseFrag = (PhotoAlbumBaseFrag) getChildFragmentManager().m2558i0("PhotoAlbumFeedBaseFrag");
        this.f42581D = photoAlbumBaseFrag;
        if (NullChecker.m82486a(photoAlbumBaseFrag)) {
            this.f42581D.m65213k5(true);
            this.f42581D.m65212j5(true);
            this.f42581D.m65210h5(this);
            return;
        }
        PhotoAlbumBaseFrag photoAlbumBaseFragM65187N4 = PhotoAlbumBaseFrag.m65187N4(false, this.f42583F, "from_profile_album", getArguments().getInt("selected_item_position"), getArguments().getString("target_moment_id"), 2, true);
        this.f42581D = photoAlbumBaseFragM65187N4;
        photoAlbumBaseFragM65187N4.m65213k5(true);
        this.f42581D.m65212j5(true);
        this.f42581D.m65210h5(this);
        AbstractC0428k abstractC0428kM2568m = getChildFragmentManager().m2568m();
        abstractC0428kM2568m.m2805c(hdc0.f108918g, this.f42581D, "PhotoAlbumFeedBaseFrag");
        abstractC0428kM2568m.mo2709j();
        m65675W4();
    }

    @Override // com.p051p1.mobile.android.app.Frag
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m65672T4(layoutInflater, viewGroup);
    }

    @Override // p153l.s2m
    /* JADX INFO: renamed from: n1 */
    public boolean mo63216n1(List<MomentItem> list, boolean z, User user, int i) {
        return false;
    }

    @Override // p153l.n2m
    /* JADX INFO: renamed from: o */
    public void mo63217o() {
        act().m45660g2();
    }

    @Override // com.p051p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
    }

    @Override // p153l.s2m
    /* JADX INFO: renamed from: p */
    public void mo63218p() {
    }

    @Override // p153l.s2m
    /* JADX INFO: renamed from: s0 */
    public C11443a mo63219s0() {
        PhotoAlbumBaseFrag photoAlbumBaseFrag = this.f42581D;
        tt60 tt60Var = new tt60(photoAlbumBaseFrag, this, photoAlbumBaseFrag.f42302z.f197638b, this.f42583F, "from_profile_album", 2, true);
        this.f42582E = tt60Var;
        tt60Var.m192656C0(R$string.f39997t1);
        this.f42588K = ViewConfiguration.get(act()).getScaledTouchSlop();
        this.f42581D.f42302z.f197638b.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        this.f42581D.f42302z.f197638b.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: l.fv60
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                this.f100989a.m65673U4();
            }
        });
        this.f42581D.f42302z.f197638b.addOnScrollListener(new C11458a());
        this.f42581D.f42302z.f197638b.addOnItemTouchListener(new C11459b());
        bnl0.m105548c0(this.f42581D.f42302z.f197638b, qa00.m175859d(110.0f));
        this.f42581D.f42302z.f197638b.setClipToPadding(false);
        return this.f42582E;
    }

    @Override // p153l.v0q
    /* JADX INFO: renamed from: w1 */
    public boolean mo63220w1() {
        return this.f42584G;
    }

    @Override // p153l.n2m
    /* JADX INFO: renamed from: B3 */
    public void mo63210B3(pf60<User, Boolean> pf60Var, boolean z) {
    }
}
