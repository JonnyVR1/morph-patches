package com.p046p1.mobile.putong.feed.newui.photoalbum.feed.personfeedinprofile;

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
import androidx.fragment.app.AbstractC0427k;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p046p1.mobile.putong.app.PutongFrag;
import com.p046p1.mobile.putong.data.Envelope;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.R$string;
import com.p046p1.mobile.putong.feed.data.FeedData;
import com.p046p1.mobile.putong.feed.data.TopicMoment;
import com.p046p1.mobile.putong.feed.newui.photoalbum.adapter.C11280a;
import com.p046p1.mobile.putong.feed.newui.photoalbum.adapter.MomentItem;
import com.p046p1.mobile.putong.feed.newui.photoalbum.basefrag.PhotoAlbumBaseFrag;
import com.p046p1.mobile.putong.feed.newui.photoalbum.feed.personfeedinprofile.PersonalFeedInProfileFrag;
import com.p046p1.mobile.putong.feed.newui.photoalbum.momentdetail.feedlist.FeedMaxHeightRecyclerView;
import com.p046p1.mobile.putong.feed.newui.photoalbum.view.FeedSendMomentEnterView;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p149l.an60;
import p149l.b5c0;
import p149l.d7h;
import p149l.e30;
import p149l.hx60;
import p149l.j760;
import p149l.mkd0;
import p149l.nl60;
import p149l.sy60;
import p149l.t100;
import p149l.tzl;
import p149l.vyp;
import p149l.xdl0;
import p149l.yzl;

/* JADX INFO: loaded from: classes12.dex */
public class PersonalFeedInProfileFrag extends PutongFrag implements yzl, tzl, vyp {

    /* JADX INFO: renamed from: A */
    public FeedWriterLevelInProfileView f41730A;

    /* JADX INFO: renamed from: B */
    public TopicListView f41731B;

    /* JADX INFO: renamed from: C */
    public FrameLayout f41732C;

    /* JADX INFO: renamed from: D */
    public PhotoAlbumBaseFrag f41733D;

    /* JADX INFO: renamed from: E */
    public nl60 f41734E;

    /* JADX INFO: renamed from: F */
    public String f41735F;

    /* JADX INFO: renamed from: G */
    public boolean f41736G;

    /* JADX INFO: renamed from: H */
    public d7h f41737H;

    /* JADX INFO: renamed from: I */
    public C11297a f41738I;

    /* JADX INFO: renamed from: L */
    public FeedSendMomentEnterView f41741L;

    /* JADX INFO: renamed from: M */
    public int f41742M;

    /* JADX INFO: renamed from: z */
    public LinearLayout f41744z;

    /* JADX INFO: renamed from: J */
    public float f41739J = 0.0f;

    /* JADX INFO: renamed from: K */
    public int f41740K = 0;

    /* JADX INFO: renamed from: N */
    public boolean f41743N = false;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.photoalbum.feed.personfeedinprofile.PersonalFeedInProfileFrag$a */
    public class C11295a extends RecyclerView.AbstractC0582t {
        public C11295a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0582t
        public void onScrolled(@NonNull RecyclerView recyclerView, int i, int i2) {
            super.onScrolled(recyclerView, i, i2);
            if (!PersonalFeedInProfileFrag.this.f41733D.f41454z.f166899b.canScrollVertically(-1)) {
                FeedModule.m60222H().mo30790kt();
            }
            if (((LinearLayoutManager) recyclerView.getLayoutManager()).findFirstCompletelyVisibleItemPosition() == 0) {
                FeedModule.m60222H().mo30790kt();
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.photoalbum.feed.personfeedinprofile.PersonalFeedInProfileFrag$b */
    public class C11296b implements RecyclerView.InterfaceC0581s {
        public C11296b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.InterfaceC0581s
        /* JADX INFO: renamed from: a */
        public void mo3416a(@NonNull RecyclerView recyclerView, @NonNull MotionEvent motionEvent) {
        }

        /* JADX WARN: Code duplicated, block: B:26:0x0086  */
        @Override // androidx.recyclerview.widget.RecyclerView.InterfaceC0581s
        /* JADX INFO: renamed from: c */
        public boolean mo3417c(@NonNull RecyclerView recyclerView, @NonNull MotionEvent motionEvent) {
            boolean z;
            PersonalFeedInProfileFrag personalFeedInProfileFrag;
            int action = motionEvent.getAction();
            if (action != 0) {
                if (action == 1) {
                    if (PersonalFeedInProfileFrag.this.f41733D.f41454z.f166899b.canScrollVertically(-1)) {
                        z = true;
                    } else {
                        FeedModule.m60222H().mo30790kt();
                        z = false;
                    }
                    if (((LinearLayoutManager) recyclerView.getLayoutManager()).findFirstCompletelyVisibleItemPosition() == 0) {
                        FeedModule.m60222H().mo30790kt();
                        z = false;
                    }
                } else if (action == 3 && PersonalFeedInProfileFrag.this.f41739J != 0.0f && !FeedModule.m60222H().mo30752cs()) {
                    if (PersonalFeedInProfileFrag.this.f41739J - motionEvent.getRawY() > PersonalFeedInProfileFrag.this.f41740K) {
                        FeedModule.m60222H().mo30765gc();
                    }
                }
                if (FeedModule.m60222H().mo30752cs()) {
                    personalFeedInProfileFrag = PersonalFeedInProfileFrag.this;
                    if (personalFeedInProfileFrag.f41743N && z) {
                        personalFeedInProfileFrag.f41733D.f41454z.f166899b.getParent().requestDisallowInterceptTouchEvent(true);
                    }
                }
                return false;
            }
            PersonalFeedInProfileFrag.this.f41739J = motionEvent.getRawY();
            z = true;
            if (FeedModule.m60222H().mo30752cs()) {
                personalFeedInProfileFrag = PersonalFeedInProfileFrag.this;
                if (personalFeedInProfileFrag.f41743N) {
                    personalFeedInProfileFrag.f41733D.f41454z.f166899b.getParent().requestDisallowInterceptTouchEvent(true);
                }
            }
            return false;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.InterfaceC0581s
        /* JADX INFO: renamed from: e */
        public void mo3418e(boolean z) {
        }
    }

    /* JADX INFO: renamed from: M4 */
    public static /* synthetic */ void m64482M4(Throwable th) {
    }

    @Override // p149l.yzl
    /* JADX INFO: renamed from: L0 */
    public hx60 mo62028L0() {
        C11297a c11297a = new C11297a(this);
        this.f41738I = c11297a;
        return c11297a;
    }

    @Override // p149l.tzl
    /* JADX INFO: renamed from: N0 */
    public void mo62029N0() {
        this.f41736G = true;
    }

    @Override // p149l.tzl
    /* JADX INFO: renamed from: Q0 */
    public PhotoAlbumBaseFrag mo62031Q0() {
        return this.f41733D;
    }

    /* JADX INFO: renamed from: T4 */
    public View m64489T4(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return an60.m97717b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: U4 */
    public final /* synthetic */ void m64490U4() {
        sy60 sy60Var;
        FeedMaxHeightRecyclerView feedMaxHeightRecyclerView;
        PhotoAlbumBaseFrag photoAlbumBaseFrag = this.f41733D;
        if (photoAlbumBaseFrag == null || (sy60Var = photoAlbumBaseFrag.f41454z) == null || (feedMaxHeightRecyclerView = sy60Var.f166899b) == null || this.f41732C == null) {
            this.f41743N = false;
        } else {
            this.f41743N = feedMaxHeightRecyclerView.getHeight() >= this.f41732C.getHeight();
        }
    }

    /* JADX INFO: renamed from: V4 */
    public final /* synthetic */ void m64491V4(Envelope envelope) {
        List<TopicMoment> list = ((FeedData) envelope.getModuleData(FeedData.class)).momentTopics;
        if (list.size() != 0) {
            this.f41731B.setVisibility(0);
            this.f41731B.m64497s(new C11298b.a().m64526b(t100.m186890d(10.0f)).m64528d(this.f41738I).m64529e(list.subList(0, Math.min(30, list.size()))).m64527c(true).m64525a());
            return;
        }
        FeedSendMomentEnterView feedSendMomentEnterView = this.f41741L;
        if (feedSendMomentEnterView != null) {
            xdl0.m208374f0(feedSendMomentEnterView, t100.m186890d(15.0f));
        } else {
            this.f41742M = t100.m186890d(15.0f);
        }
        this.f41731B.setVisibility(8);
    }

    /* JADX INFO: renamed from: W4 */
    public final void m64492W4() {
        FeedModule.f38855d.m209417Zc(this.f41735F).subscribe(mkd0.m154956H(new e30() { // from class: l.xm60
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f193533a.m64491V4((Envelope) obj);
            }
        }, new e30() { // from class: l.ym60
            @Override // p149l.e30
            public final void call(Object obj) {
                PersonalFeedInProfileFrag.m64482M4((Throwable) obj);
            }
        }));
    }

    @Override // p149l.yzl
    /* JADX INFO: renamed from: X0 */
    public d7h mo62032X0() {
        this.f41737H = new d7h(this.f41734E);
        LinearLayout linearLayout = new LinearLayout(act());
        linearLayout.setOrientation(1);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f41731B.getLayoutParams();
        layoutParams.topMargin = t100.m186890d(18.0f);
        layoutParams.bottomMargin = t100.m186890d(6.0f);
        if (FeedModule.m60222H().me_().f56011id.equals(this.f41735F)) {
            FeedSendMomentEnterView feedSendMomentEnterView = new FeedSendMomentEnterView(act());
            this.f41741L = feedSendMomentEnterView;
            feedSendMomentEnterView.setPageId(OMSDialogPositon.p_suggest_user_profile_info_view);
            linearLayout.addView(this.f41741L);
            int i = this.f41742M;
            if (i != 0) {
                xdl0.m208374f0(this.f41741L, i);
            }
            layoutParams.topMargin = t100.m186890d(24.0f);
            layoutParams.bottomMargin = t100.m186890d(24.0f);
        }
        this.f41731B.setLayoutParams(layoutParams);
        this.f41737H.m143815H(linearLayout);
        this.f41734E.m63930s0(1);
        return this.f41737H;
    }

    @Override // com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: g4 */
    public void mo20586g4(Bundle bundle) {
        super.mo20586g4(bundle);
        this.f41735F = getArguments().getString("user_id");
        PhotoAlbumBaseFrag photoAlbumBaseFrag = (PhotoAlbumBaseFrag) getChildFragmentManager().m2557i0("PhotoAlbumFeedBaseFrag");
        this.f41733D = photoAlbumBaseFrag;
        if (NullChecker.m81303a(photoAlbumBaseFrag)) {
            this.f41733D.m64030k5(true);
            this.f41733D.m64029j5(true);
            this.f41733D.m64027h5(this);
            return;
        }
        PhotoAlbumBaseFrag photoAlbumBaseFragM64004N4 = PhotoAlbumBaseFrag.m64004N4(false, this.f41735F, "from_profile_album", getArguments().getInt("selected_item_position"), getArguments().getString("target_moment_id"), 2, true);
        this.f41733D = photoAlbumBaseFragM64004N4;
        photoAlbumBaseFragM64004N4.m64030k5(true);
        this.f41733D.m64029j5(true);
        this.f41733D.m64027h5(this);
        AbstractC0427k abstractC0427kM2567m = getChildFragmentManager().m2567m();
        abstractC0427kM2567m.m2804c(b5c0.f73565g, this.f41733D, "PhotoAlbumFeedBaseFrag");
        abstractC0427kM2567m.mo2708j();
        m64492W4();
    }

    @Override // com.p046p1.mobile.android.app.Frag
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m64489T4(layoutInflater, viewGroup);
    }

    @Override // p149l.yzl
    /* JADX INFO: renamed from: n1 */
    public boolean mo62033n1(List<MomentItem> list, boolean z, User user, int i) {
        return false;
    }

    @Override // p149l.tzl
    /* JADX INFO: renamed from: o */
    public void mo62034o() {
        act().m44477e2();
    }

    @Override // com.p046p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
    }

    @Override // p149l.yzl
    /* JADX INFO: renamed from: q */
    public void mo62035q() {
    }

    @Override // p149l.yzl
    /* JADX INFO: renamed from: s0 */
    public C11280a mo62036s0() {
        PhotoAlbumBaseFrag photoAlbumBaseFrag = this.f41733D;
        nl60 nl60Var = new nl60(photoAlbumBaseFrag, this, photoAlbumBaseFrag.f41454z.f166899b, this.f41735F, "from_profile_album", 2, true);
        this.f41734E = nl60Var;
        nl60Var.m160016C0(R$string.f39149t1);
        this.f41740K = ViewConfiguration.get(act()).getScaledTouchSlop();
        this.f41733D.f41454z.f166899b.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        this.f41733D.f41454z.f166899b.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: l.zm60
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                this.f203699a.m64490U4();
            }
        });
        this.f41733D.f41454z.f166899b.addOnScrollListener(new C11295a());
        this.f41733D.f41454z.f166899b.addOnItemTouchListener(new C11296b());
        xdl0.m208368c0(this.f41733D.f41454z.f166899b, t100.m186890d(110.0f));
        this.f41733D.f41454z.f166899b.setClipToPadding(false);
        return this.f41734E;
    }

    @Override // p149l.vyp
    /* JADX INFO: renamed from: w1 */
    public boolean mo62037w1() {
        return this.f41736G;
    }

    @Override // p149l.tzl
    /* JADX INFO: renamed from: B3 */
    public void mo62027B3(j760<User, Boolean> j760Var, boolean z) {
    }
}
