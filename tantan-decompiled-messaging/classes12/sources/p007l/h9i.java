package p007l;

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
import androidx.recyclerview.widget.RecyclerView;
import com.p000p1.mobile.putong.data.Live;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.data.Moment;
import com.p000p1.mobile.putong.feed.newui.videoflow.util.FeedPagerSnapLinearLayoutManger;
import com.p000p1.mobile.putong.feed.newui.videoflow.util.FeedVideoFlowRecycleView;
import com.p1.mobile.android.app.Act;
import java.util.List;
import l.d30;
import l.e30;
import l.jig;
import l.mcr;
import l.s7m;
import l.uqd0;
import l.xdl0;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class h9i implements s7m<x8i> {

    /* JADX INFO: renamed from: a */
    public ConstraintLayout f8640a;

    /* JADX INFO: renamed from: b */
    public FeedVideoFlowRecycleView f8641b;

    /* JADX INFO: renamed from: c */
    public RelativeLayout f8642c;

    /* JADX INFO: renamed from: d */
    public VText f8643d;

    /* JADX INFO: renamed from: e */
    public x8i f8644e;

    /* JADX INFO: renamed from: f */
    public r8i f8645f;

    /* JADX INFO: renamed from: g */
    public FeedPagerSnapLinearLayoutManger f8646g;

    /* JADX INFO: renamed from: h */
    public boolean f8647h;

    /* JADX INFO: renamed from: i */
    public boolean f8648i;

    /* JADX INFO: renamed from: j */
    public boolean f8649j;

    /* JADX INFO: renamed from: k */
    public uqd0 f8650k = new uqd0("FEED_VIDEO_FLOW_SHOW_COVER" + FeedModule.m1139F().userId(), "");

    /* JADX INFO: renamed from: l.h9i$a */
    public class C2391a extends AnimatorListenerAdapter {
        public C2391a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            h9i.this.f8642c.setVisibility(8);
        }
    }

    public h9i(mcr mcrVar, boolean z, boolean z2) {
        this.f8648i = z;
        this.f8649j = z2;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ boolean m10566a(View view, MotionEvent motionEvent) {
        return true;
    }

    /* JADX INFO: renamed from: m */
    private void m10570m() {
        r8i r8iVar = new r8i(act(), this.f8644e.f14807g, act().getIntent().getBooleanExtra("isHideComment", false), this.f8648i, this.f8649j);
        this.f8645f = r8iVar;
        r8iVar.m13881V(new d30() { // from class: l.e9i
            public final void call() {
                this.f7261a.m10582p();
            }
        });
        FeedPagerSnapLinearLayoutManger feedPagerSnapLinearLayoutManger = new FeedPagerSnapLinearLayoutManger(this.f8644e.f14801a);
        this.f8646g = feedPagerSnapLinearLayoutManger;
        feedPagerSnapLinearLayoutManger.setOrientation(1);
        this.f8646g.m7371h(new e30() { // from class: l.f9i
            public final void call(Object obj) {
                this.f8043a.m10586v(((Integer) obj).intValue());
            }
        });
        this.f8641b.setLayoutManager(this.f8646g);
        this.f8641b.setAdapter(this.f8645f);
    }

    /* JADX INFO: renamed from: x */
    private void m10571x() {
        this.f8644e.m16055p0();
    }

    /* JADX INFO: renamed from: y */
    private void m10572y() {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f8642c, "alpha", 0.0f, 1.0f);
        objectAnimatorOfFloat.setDuration(1000L);
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, xdl0.w(220.0f), 0);
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.g9i
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f8399a.m10584s(valueAnimator);
            }
        });
        valueAnimatorOfInt.addListener(new C2391a());
        valueAnimatorOfInt.setStartDelay(1000L);
        valueAnimatorOfInt.setDuration(2000L);
        valueAnimatorOfInt.setRepeatCount(1);
        valueAnimatorOfInt.setInterpolator(new jig());
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.f8642c, "alpha", 1.0f, 0.0f);
        objectAnimatorOfFloat2.setDuration(300L);
        objectAnimatorOfFloat2.setStartDelay(5000L);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(objectAnimatorOfFloat, valueAnimatorOfInt, objectAnimatorOfFloat2);
        animatorSet.start();
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m10573C0() {
        return this.f8644e.f14801a;
    }

    @Nullable
    public Act act() {
        return this.f8644e.f14801a;
    }

    /* JADX INFO: renamed from: e */
    public View m10574e(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return i9i.m10845b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: f */
    public void m10575f(List<Moment> list) {
        m10580l().m13867G(list);
        m10579k();
    }

    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public void m10577i1(x8i x8iVar) {
        this.f8644e = x8iVar;
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM10574e = m10574e(layoutInflater, viewGroup);
        m10570m();
        m10587w();
        m10585u();
        this.f8645f.f12558o = this.f8644e.f14805e;
        m10581n();
        m10578j(this.f8641b);
        return viewM10574e;
    }

    /* JADX INFO: renamed from: j */
    public final void m10578j(RecyclerView recyclerView) {
        recyclerView.getItemAnimator().setAddDuration(0L);
        recyclerView.getItemAnimator().setChangeDuration(0L);
        recyclerView.getItemAnimator().setMoveDuration(0L);
        recyclerView.getItemAnimator().setRemoveDuration(0L);
        recyclerView.getItemAnimator().setSupportsChangeAnimations(false);
    }

    /* JADX INFO: renamed from: k */
    public void m10579k() {
        this.f8647h = false;
    }

    /* JADX INFO: renamed from: l */
    public r8i m10580l() {
        return this.f8645f;
    }

    /* JADX INFO: renamed from: n */
    public final void m10581n() {
        if (TextUtils.isEmpty((CharSequence) this.f8650k.get())) {
            this.f8642c.setVisibility(0);
            this.f8642c.setOnTouchListener(new View.OnTouchListener() { // from class: l.d9i
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    return h9i.m10566a(view, motionEvent);
                }
            });
            this.f8650k.put("show");
            m10572y();
        }
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m10582p() {
        int iM13864C = this.f8645f.m13864C() - 1;
        int i = this.f8645f.f12551h;
        if (iM13864C > i) {
            this.f8641b.smoothScrollToPosition(i + 1);
        }
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m10583q(Integer num) {
        if (num.intValue() < this.f8644e.m16049j0().size() - 4 || this.f8647h) {
            return;
        }
        this.f8647h = true;
        m10571x();
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m10584s(ValueAnimator valueAnimator) {
        this.f8646g.scrollToPositionWithOffset(0, -((Integer) valueAnimator.getAnimatedValue()).intValue());
    }

    /* JADX INFO: renamed from: u */
    public final void m10585u() {
        this.f8645f.m13882W(new e30() { // from class: l.c9i
            public final void call(Object obj) {
                this.f6577a.m10583q((Integer) obj);
            }
        });
    }

    /* JADX INFO: renamed from: v */
    public void m10586v(int i) {
        act().hideInput();
        this.f8645f.m13878S(i);
    }

    /* JADX INFO: renamed from: w */
    public final void m10587w() {
        this.f8644e.m16050k0(act().getIntent().getStringExtra("VIDEO_FLOW_MOMENT_ID"));
    }

    /* JADX INFO: renamed from: z */
    public void m10588z(List<Live> list) {
        r8i r8iVar = this.f8645f;
        if (r8iVar != null) {
            r8iVar.m13884Y(list);
        }
    }

    public void destroy() {
    }
}
