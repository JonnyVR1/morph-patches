package p149l;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.AbstractC0616v;
import androidx.recyclerview.widget.RecyclerView;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.data.Live;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.data.Moment;
import com.p046p1.mobile.putong.feed.newui.videoflow.util.FeedPagerSnapLinearLayoutManger;
import com.p046p1.mobile.putong.feed.newui.videoflow.util.FeedVideoFlowRecycleView;
import java.util.List;
import p147v.VText;

/* JADX INFO: loaded from: classes12.dex */
public class h9i implements s7m<x8i> {

    /* JADX INFO: renamed from: a */
    public ConstraintLayout f106589a;

    /* JADX INFO: renamed from: b */
    public FeedVideoFlowRecycleView f106590b;

    /* JADX INFO: renamed from: c */
    public RelativeLayout f106591c;

    /* JADX INFO: renamed from: d */
    public VText f106592d;

    /* JADX INFO: renamed from: e */
    public x8i f106593e;

    /* JADX INFO: renamed from: f */
    public r8i f106594f;

    /* JADX INFO: renamed from: g */
    public FeedPagerSnapLinearLayoutManger f106595g;

    /* JADX INFO: renamed from: h */
    public boolean f106596h;

    /* JADX INFO: renamed from: i */
    public boolean f106597i;

    /* JADX INFO: renamed from: j */
    public boolean f106598j;

    /* JADX INFO: renamed from: k */
    public uqd0 f106599k = new uqd0("FEED_VIDEO_FLOW_SHOW_COVER" + FeedModule.m60221F().userId(), "");

    /* JADX INFO: renamed from: l.h9i$a */
    public class C17248a extends AnimatorListenerAdapter {
        public C17248a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            h9i.this.f106591c.setVisibility(8);
        }
    }

    public h9i(mcr mcrVar, boolean z, boolean z2) {
        this.f106597i = z;
        this.f106598j = z2;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ boolean m130006a(View view, MotionEvent motionEvent) {
        return true;
    }

    /* JADX INFO: renamed from: m */
    private void m130010m() {
        r8i r8iVar = new r8i(act(), this.f106593e.f191521g, act().getIntent().getBooleanExtra("isHideComment", false), this.f106597i, this.f106598j);
        this.f106594f = r8iVar;
        r8iVar.m178275V(new d30() { // from class: l.e9i
            @Override // p149l.d30
            public final void call() {
                this.f90103a.m130020p();
            }
        });
        FeedPagerSnapLinearLayoutManger feedPagerSnapLinearLayoutManger = new FeedPagerSnapLinearLayoutManger(this.f106593e.f191515a);
        this.f106595g = feedPagerSnapLinearLayoutManger;
        feedPagerSnapLinearLayoutManger.setOrientation(1);
        this.f106595g.m66213h(new e30() { // from class: l.f9i
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f96485a.m130024v(((Integer) obj).intValue());
            }
        });
        this.f106590b.setLayoutManager(this.f106595g);
        this.f106590b.setAdapter(this.f106594f);
    }

    /* JADX INFO: renamed from: x */
    private void m130011x() {
        this.f106593e.m207412p0();
    }

    /* JADX INFO: renamed from: y */
    private void m130012y() {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f106591c, "alpha", 0.0f, 1.0f);
        objectAnimatorOfFloat.setDuration(1000L);
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, xdl0.m208407w(220.0f), 0);
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.g9i
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f101566a.m130022s(valueAnimator);
            }
        });
        valueAnimatorOfInt.addListener(new C17248a());
        valueAnimatorOfInt.setStartDelay(1000L);
        valueAnimatorOfInt.setDuration(2000L);
        valueAnimatorOfInt.setRepeatCount(1);
        valueAnimatorOfInt.setInterpolator(new jig());
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.f106591c, "alpha", 1.0f, 0.0f);
        objectAnimatorOfFloat2.setDuration(300L);
        objectAnimatorOfFloat2.setStartDelay(Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(objectAnimatorOfFloat, valueAnimatorOfInt, objectAnimatorOfFloat2);
        animatorSet.start();
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f106593e.f191515a;
    }

    @Override // p149l.s7m
    @Nullable
    public Act act() {
        return this.f106593e.f191515a;
    }

    /* JADX INFO: renamed from: e */
    public View m130013e(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return i9i.m135055b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: f */
    public void m130014f(List<Moment> list) {
        m130018l().m178261G(list);
        m130017k();
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(x8i x8iVar) {
        this.f106593e = x8iVar;
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM130013e = m130013e(layoutInflater, viewGroup);
        m130010m();
        m130025w();
        m130023u();
        this.f106594f.f158233o = this.f106593e.f191519e;
        m130019n();
        m130016j(this.f106590b);
        return viewM130013e;
    }

    /* JADX INFO: renamed from: j */
    public final void m130016j(RecyclerView recyclerView) {
        recyclerView.getItemAnimator().setAddDuration(0L);
        recyclerView.getItemAnimator().setChangeDuration(0L);
        recyclerView.getItemAnimator().setMoveDuration(0L);
        recyclerView.getItemAnimator().setRemoveDuration(0L);
        ((AbstractC0616v) recyclerView.getItemAnimator()).setSupportsChangeAnimations(false);
    }

    /* JADX INFO: renamed from: k */
    public void m130017k() {
        this.f106596h = false;
    }

    /* JADX INFO: renamed from: l */
    public r8i m130018l() {
        return this.f106594f;
    }

    /* JADX INFO: renamed from: n */
    public final void m130019n() {
        if (TextUtils.isEmpty(this.f106599k.get())) {
            this.f106591c.setVisibility(0);
            this.f106591c.setOnTouchListener(new View.OnTouchListener() { // from class: l.d9i
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    return h9i.m130006a(view, motionEvent);
                }
            });
            this.f106599k.put("show");
            m130012y();
        }
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m130020p() {
        int iMo28824C = this.f106594f.mo28824C() - 1;
        int i = this.f106594f.f158226h;
        if (iMo28824C > i) {
            this.f106590b.smoothScrollToPosition(i + 1);
        }
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m130021q(Integer num) {
        if (num.intValue() < this.f106593e.m207406j0().size() - 4 || this.f106596h) {
            return;
        }
        this.f106596h = true;
        m130011x();
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m130022s(ValueAnimator valueAnimator) {
        this.f106595g.scrollToPositionWithOffset(0, -((Integer) valueAnimator.getAnimatedValue()).intValue());
    }

    /* JADX INFO: renamed from: u */
    public final void m130023u() {
        this.f106594f.m178276W(new e30() { // from class: l.c9i
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f79938a.m130021q((Integer) obj);
            }
        });
    }

    /* JADX INFO: renamed from: v */
    public void m130024v(int i) {
        act().hideInput();
        this.f106594f.m178272S(i);
    }

    /* JADX INFO: renamed from: w */
    public final void m130025w() {
        this.f106593e.m207407k0(act().getIntent().getStringExtra("VIDEO_FLOW_MOMENT_ID"));
    }

    /* JADX INFO: renamed from: z */
    public void m130026z(List<Live> list) {
        r8i r8iVar = this.f106594f;
        if (r8iVar != null) {
            r8iVar.m178278Y(list);
        }
    }

    @Override // p149l.s7m
    public void destroy() {
    }
}
