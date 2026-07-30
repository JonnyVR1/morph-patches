package com.p000p1.mobile.putong.feed.newui.photoalbum.feed.personfeedinprofile;

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
import androidx.fragment.app.k;
import androidx.recyclerview.widget.RecyclerView;
import com.p000p1.mobile.putong.data.Envelope;
import com.p000p1.mobile.putong.data.OMSDialogPositon;
import com.p000p1.mobile.putong.data.User;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.R$string;
import com.p000p1.mobile.putong.feed.data.FeedData;
import com.p000p1.mobile.putong.feed.data.TopicMoment;
import com.p000p1.mobile.putong.feed.newui.photoalbum.adapter.C2124a;
import com.p000p1.mobile.putong.feed.newui.photoalbum.adapter.MomentItem;
import com.p000p1.mobile.putong.feed.newui.photoalbum.basefrag.PhotoAlbumBaseFrag;
import com.p000p1.mobile.putong.feed.newui.photoalbum.feed.personfeedinprofile.PersonalFeedInProfileFrag;
import com.p000p1.mobile.putong.feed.newui.photoalbum.view.FeedSendMomentEnterView;
import com.p1.mobile.putong.app.PutongFrag;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import l.e30;
import l.j760;
import l.mkd0;
import l.t100;
import l.xdl0;
import p007l.an60;
import p007l.b5c0;
import p007l.d7h;
import p007l.hx60;
import p007l.nl60;
import p007l.sy60;
import p007l.tzl;
import p007l.vyp;
import p007l.yzl;
import v.VLinear;
import v.VRecyclerView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class PersonalFeedInProfileFrag extends PutongFrag implements yzl, tzl, vyp {

    /* JADX INFO: renamed from: A */
    public FeedWriterLevelInProfileView f3191A;

    /* JADX INFO: renamed from: B */
    public TopicListView f3192B;

    /* JADX INFO: renamed from: C */
    public FrameLayout f3193C;

    /* JADX INFO: renamed from: D */
    public PhotoAlbumBaseFrag f3194D;

    /* JADX INFO: renamed from: E */
    public nl60 f3195E;

    /* JADX INFO: renamed from: F */
    public String f3196F;

    /* JADX INFO: renamed from: G */
    public boolean f3197G;

    /* JADX INFO: renamed from: H */
    public d7h f3198H;

    /* JADX INFO: renamed from: I */
    public C2141a f3199I;

    /* JADX INFO: renamed from: L */
    public FeedSendMomentEnterView f3202L;

    /* JADX INFO: renamed from: M */
    public int f3203M;

    /* JADX INFO: renamed from: z */
    public LinearLayout f3205z;

    /* JADX INFO: renamed from: J */
    public float f3200J = 0.0f;

    /* JADX INFO: renamed from: K */
    public int f3201K = 0;

    /* JADX INFO: renamed from: N */
    public boolean f3204N = false;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.photoalbum.feed.personfeedinprofile.PersonalFeedInProfileFrag$a */
    public class C2139a extends RecyclerView.t {
        public C2139a() {
        }

        public void onScrolled(@NonNull RecyclerView recyclerView, int i, int i2) {
            super.onScrolled(recyclerView, i, i2);
            if (!PersonalFeedInProfileFrag.this.f3194D.f2915z.f13114b.canScrollVertically(-1)) {
                FeedModule.m1140H().kt();
            }
            if (recyclerView.getLayoutManager().findFirstCompletelyVisibleItemPosition() == 0) {
                FeedModule.m1140H().kt();
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.photoalbum.feed.personfeedinprofile.PersonalFeedInProfileFrag$b */
    public class C2140b implements RecyclerView.s {
        public C2140b() {
        }

        /* JADX INFO: renamed from: a */
        public void m5581a(@NonNull RecyclerView recyclerView, @NonNull MotionEvent motionEvent) {
        }

        /* JADX WARN: Code duplicated, block: B:26:0x0086  */
        /* JADX INFO: renamed from: c */
        public boolean m5582c(@NonNull RecyclerView recyclerView, @NonNull MotionEvent motionEvent) {
            boolean z;
            PersonalFeedInProfileFrag personalFeedInProfileFrag;
            int action = motionEvent.getAction();
            if (action != 0) {
                if (action == 1) {
                    if (PersonalFeedInProfileFrag.this.f3194D.f2915z.f13114b.canScrollVertically(-1)) {
                        z = true;
                    } else {
                        FeedModule.m1140H().kt();
                        z = false;
                    }
                    if (recyclerView.getLayoutManager().findFirstCompletelyVisibleItemPosition() == 0) {
                        FeedModule.m1140H().kt();
                        z = false;
                    }
                } else if (action == 3 && PersonalFeedInProfileFrag.this.f3200J != 0.0f && !FeedModule.m1140H().cs()) {
                    if (PersonalFeedInProfileFrag.this.f3200J - motionEvent.getRawY() > PersonalFeedInProfileFrag.this.f3201K) {
                        FeedModule.m1140H().gc();
                    }
                }
                if (FeedModule.m1140H().cs()) {
                    personalFeedInProfileFrag = PersonalFeedInProfileFrag.this;
                    if (personalFeedInProfileFrag.f3204N && z) {
                        personalFeedInProfileFrag.f3194D.f2915z.f13114b.getParent().requestDisallowInterceptTouchEvent(true);
                    }
                }
                return false;
            }
            PersonalFeedInProfileFrag.this.f3200J = motionEvent.getRawY();
            z = true;
            if (FeedModule.m1140H().cs()) {
                personalFeedInProfileFrag = PersonalFeedInProfileFrag.this;
                if (personalFeedInProfileFrag.f3204N) {
                    personalFeedInProfileFrag.f3194D.f2915z.f13114b.getParent().requestDisallowInterceptTouchEvent(true);
                }
            }
            return false;
        }

        /* JADX INFO: renamed from: e */
        public void m5583e(boolean z) {
        }
    }

    /* JADX INFO: renamed from: M4 */
    public static /* synthetic */ void m5569M4(Throwable th) {
    }

    @Override // p007l.yzl
    /* JADX INFO: renamed from: L0 */
    public hx60 mo3004L0() {
        C2141a c2141a = new C2141a(this);
        this.f3199I = c2141a;
        return c2141a;
    }

    @Override // p007l.tzl
    /* JADX INFO: renamed from: N0 */
    public void mo3005N0() {
        this.f3197G = true;
    }

    @Override // p007l.tzl
    /* JADX INFO: renamed from: Q0 */
    public PhotoAlbumBaseFrag mo3007Q0() {
        return this.f3194D;
    }

    /* JADX INFO: renamed from: T4 */
    public View m5576T4(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return an60.m8584b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: U4 */
    public final /* synthetic */ void m5577U4() {
        sy60 sy60Var;
        VRecyclerView vRecyclerView;
        PhotoAlbumBaseFrag photoAlbumBaseFrag = this.f3194D;
        if (photoAlbumBaseFrag == null || (sy60Var = photoAlbumBaseFrag.f2915z) == null || (vRecyclerView = sy60Var.f13114b) == null || this.f3193C == null) {
            this.f3204N = false;
        } else {
            this.f3204N = vRecyclerView.getHeight() >= this.f3193C.getHeight();
        }
    }

    /* JADX INFO: renamed from: V4 */
    public final /* synthetic */ void m5578V4(Envelope envelope) {
        List<TopicMoment> list = ((FeedData) envelope.getModuleData(FeedData.class)).momentTopics;
        if (list.size() != 0) {
            this.f3192B.setVisibility(0);
            this.f3192B.m5588s(new C2142b.a().m5617b(t100.d(10.0f)).m5619d(this.f3199I).m5620e(list.subList(0, Math.min(30, list.size()))).m5618c(true).m5616a());
            return;
        }
        VLinear vLinear = this.f3202L;
        if (vLinear != null) {
            xdl0.f0(vLinear, t100.d(15.0f));
        } else {
            this.f3203M = t100.d(15.0f);
        }
        this.f3192B.setVisibility(8);
    }

    /* JADX INFO: renamed from: W4 */
    public final void m5579W4() {
        FeedModule.f316d.m16598Zc(this.f3196F).subscribe(mkd0.H(new e30() { // from class: l.xm60
            public final void call(Object obj) {
                this.f15043a.m5578V4((Envelope) obj);
            }
        }, new e30() { // from class: l.ym60
            public final void call(Object obj) {
                PersonalFeedInProfileFrag.m5569M4((Throwable) obj);
            }
        }));
    }

    @Override // p007l.yzl
    /* JADX INFO: renamed from: X0 */
    public d7h mo3008X0() {
        this.f3198H = new d7h(this.f3195E);
        LinearLayout linearLayout = new LinearLayout(act());
        linearLayout.setOrientation(1);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f3192B.getLayoutParams();
        layoutParams.topMargin = t100.d(18.0f);
        layoutParams.bottomMargin = t100.d(6.0f);
        if (((DbObject) FeedModule.m1140H().me_()).id.equals(this.f3196F)) {
            FeedSendMomentEnterView feedSendMomentEnterView = new FeedSendMomentEnterView(act());
            this.f3202L = feedSendMomentEnterView;
            feedSendMomentEnterView.setPageId(OMSDialogPositon.p_suggest_user_profile_info_view);
            linearLayout.addView(this.f3202L);
            int i = this.f3203M;
            if (i != 0) {
                xdl0.f0(this.f3202L, i);
            }
            layoutParams.topMargin = t100.d(24.0f);
            layoutParams.bottomMargin = t100.d(24.0f);
        }
        this.f3192B.setLayoutParams(layoutParams);
        this.f3198H.H(linearLayout);
        this.f3195E.m4968s0(1);
        return this.f3198H;
    }

    /* JADX INFO: renamed from: g4 */
    public void m5580g4(Bundle bundle) {
        super/*com.p1.mobile.android.app.Frag*/.g4(bundle);
        this.f3196F = getArguments().getString("user_id");
        PhotoAlbumBaseFrag photoAlbumBaseFragI0 = getChildFragmentManager().i0("PhotoAlbumFeedBaseFrag");
        this.f3194D = photoAlbumBaseFragI0;
        if (NullChecker.a(photoAlbumBaseFragI0)) {
            this.f3194D.m5075k5(true);
            this.f3194D.m5074j5(true);
            this.f3194D.m5072h5(this);
            return;
        }
        PhotoAlbumBaseFrag photoAlbumBaseFragM5047N4 = PhotoAlbumBaseFrag.m5047N4(false, this.f3196F, "from_profile_album", getArguments().getInt("selected_item_position"), getArguments().getString("target_moment_id"), 2, true);
        this.f3194D = photoAlbumBaseFragM5047N4;
        photoAlbumBaseFragM5047N4.m5075k5(true);
        this.f3194D.m5074j5(true);
        this.f3194D.m5072h5(this);
        k kVarM = getChildFragmentManager().m();
        kVarM.c(b5c0.f6046g, this.f3194D, "PhotoAlbumFeedBaseFrag");
        kVarM.j();
        m5579W4();
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m5576T4(layoutInflater, viewGroup);
    }

    @Override // p007l.yzl
    /* JADX INFO: renamed from: n1 */
    public boolean mo3011n1(List<MomentItem> list, boolean z, User user, int i) {
        return false;
    }

    @Override // p007l.tzl
    /* JADX INFO: renamed from: o */
    public void mo3012o() {
        act().finish();
    }

    public void onStop() {
        super/*com.p1.mobile.android.app.Frag*/.onStop();
    }

    @Override // p007l.yzl
    /* JADX INFO: renamed from: q */
    public void mo3013q() {
    }

    @Override // p007l.yzl
    /* JADX INFO: renamed from: s0 */
    public C2124a mo3014s0() {
        PhotoAlbumBaseFrag photoAlbumBaseFrag = this.f3194D;
        nl60 nl60Var = new nl60(photoAlbumBaseFrag, this, photoAlbumBaseFrag.f2915z.f13114b, this.f3196F, "from_profile_album", 2, true);
        this.f3195E = nl60Var;
        nl60Var.m12285C0(R$string.f610t1);
        this.f3201K = ViewConfiguration.get(act()).getScaledTouchSlop();
        this.f3194D.f2915z.f13114b.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        this.f3194D.f2915z.f13114b.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: l.zm60
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                this.f15803a.m5577U4();
            }
        });
        this.f3194D.f2915z.f13114b.addOnScrollListener(new C2139a());
        this.f3194D.f2915z.f13114b.addOnItemTouchListener(new C2140b());
        xdl0.c0(this.f3194D.f2915z.f13114b, t100.d(110.0f));
        this.f3194D.f2915z.f13114b.setClipToPadding(false);
        return this.f3195E;
    }

    @Override // p007l.vyp
    /* JADX INFO: renamed from: w1 */
    public boolean mo3015w1() {
        return this.f3197G;
    }

    @Override // p007l.tzl
    /* JADX INFO: renamed from: B3 */
    public void mo3002B3(j760<User, Boolean> j760Var, boolean z) {
    }
}
