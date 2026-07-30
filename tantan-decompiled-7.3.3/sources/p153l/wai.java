package p153l;

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
import androidx.recyclerview.widget.AbstractC0618v;
import androidx.recyclerview.widget.RecyclerView;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.data.Live;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.data.Moment;
import com.p051p1.mobile.putong.feed.newui.videoflow.util.FeedPagerSnapLinearLayoutManger;
import com.p051p1.mobile.putong.feed.newui.videoflow.util.FeedVideoFlowRecycleView;
import java.util.List;
import p151v.VText;

/* JADX INFO: loaded from: classes13.dex */
public class wai implements iam<mai> {

    /* JADX INFO: renamed from: a */
    public ConstraintLayout f188123a;

    /* JADX INFO: renamed from: b */
    public FeedVideoFlowRecycleView f188124b;

    /* JADX INFO: renamed from: c */
    public RelativeLayout f188125c;

    /* JADX INFO: renamed from: d */
    public VText f188126d;

    /* JADX INFO: renamed from: e */
    public mai f188127e;

    /* JADX INFO: renamed from: f */
    public gai f188128f;

    /* JADX INFO: renamed from: g */
    public FeedPagerSnapLinearLayoutManger f188129g;

    /* JADX INFO: renamed from: h */
    public boolean f188130h;

    /* JADX INFO: renamed from: i */
    public boolean f188131i;

    /* JADX INFO: renamed from: j */
    public boolean f188132j;

    /* JADX INFO: renamed from: k */
    public wyd0 f188133k = new wyd0("FEED_VIDEO_FLOW_SHOW_COVER" + FeedModule.m61405F().userId(), "");

    /* JADX INFO: renamed from: l.wai$a */
    public class C21056a extends AnimatorListenerAdapter {
        public C21056a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            wai.this.f188125c.setVisibility(8);
        }
    }

    public wai(ner nerVar, boolean z, boolean z2) {
        this.f188131i = z;
        this.f188132j = z2;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ boolean m205637a(View view, MotionEvent motionEvent) {
        return true;
    }

    /* JADX INFO: renamed from: m */
    private void m205641m() {
        gai gaiVar = new gai(act(), this.f188127e.f135528g, act().getIntent().getBooleanExtra("isHideComment", false), this.f188131i, this.f188132j);
        this.f188128f = gaiVar;
        gaiVar.m129727V(new x20() { // from class: l.tai
            @Override // p153l.x20
            public final void call() {
                this.f172734a.m205651p();
            }
        });
        FeedPagerSnapLinearLayoutManger feedPagerSnapLinearLayoutManger = new FeedPagerSnapLinearLayoutManger(this.f188127e.f135522a);
        this.f188129g = feedPagerSnapLinearLayoutManger;
        feedPagerSnapLinearLayoutManger.setOrientation(1);
        this.f188129g.m67396h(new y20() { // from class: l.uai
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f178211a.m205655v(((Integer) obj).intValue());
            }
        });
        this.f188124b.setLayoutManager(this.f188129g);
        this.f188124b.setAdapter(this.f188128f);
    }

    /* JADX INFO: renamed from: x */
    private void m205642x() {
        this.f188127e.m157665p0();
    }

    /* JADX INFO: renamed from: y */
    private void m205643y() {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f188125c, "alpha", 0.0f, 1.0f);
        objectAnimatorOfFloat.setDuration(1000L);
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, bnl0.m105587w(220.0f), 0);
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.vai
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f183097a.m205653s(valueAnimator);
            }
        });
        valueAnimatorOfInt.addListener(new C21056a());
        valueAnimatorOfInt.setStartDelay(1000L);
        valueAnimatorOfInt.setDuration(2000L);
        valueAnimatorOfInt.setRepeatCount(1);
        valueAnimatorOfInt.setInterpolator(new xjg());
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.f188125c, "alpha", 1.0f, 0.0f);
        objectAnimatorOfFloat2.setDuration(300L);
        objectAnimatorOfFloat2.setStartDelay(Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(objectAnimatorOfFloat, valueAnimatorOfInt, objectAnimatorOfFloat2);
        animatorSet.start();
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f188127e.f135522a;
    }

    @Override // p153l.iam
    @Nullable
    public Act act() {
        return this.f188127e.f135522a;
    }

    /* JADX INFO: renamed from: e */
    public View m205644e(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return xai.m209854b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: f */
    public void m205645f(List<Moment> list) {
        m205649l().m129713G(list);
        m205648k();
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(mai maiVar) {
        this.f188127e = maiVar;
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM205644e = m205644e(layoutInflater, viewGroup);
        m205641m();
        m205656w();
        m205654u();
        this.f188128f.f102998o = this.f188127e.f135526e;
        m205650n();
        m205647j(this.f188124b);
        return viewM205644e;
    }

    /* JADX INFO: renamed from: j */
    public final void m205647j(RecyclerView recyclerView) {
        recyclerView.getItemAnimator().setAddDuration(0L);
        recyclerView.getItemAnimator().setChangeDuration(0L);
        recyclerView.getItemAnimator().setMoveDuration(0L);
        recyclerView.getItemAnimator().setRemoveDuration(0L);
        ((AbstractC0618v) recyclerView.getItemAnimator()).setSupportsChangeAnimations(false);
    }

    /* JADX INFO: renamed from: k */
    public void m205648k() {
        this.f188130h = false;
    }

    /* JADX INFO: renamed from: l */
    public gai m205649l() {
        return this.f188128f;
    }

    /* JADX INFO: renamed from: n */
    public final void m205650n() {
        if (TextUtils.isEmpty(this.f188133k.get())) {
            this.f188125c.setVisibility(0);
            this.f188125c.setOnTouchListener(new View.OnTouchListener() { // from class: l.sai
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    return wai.m205637a(view, motionEvent);
                }
            });
            this.f188133k.put("show");
            m205643y();
        }
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m205651p() {
        int iMo29823C = this.f188128f.mo29823C() - 1;
        int i = this.f188128f.f102991h;
        if (iMo29823C > i) {
            this.f188124b.smoothScrollToPosition(i + 1);
        }
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m205652q(Integer num) {
        if (num.intValue() < this.f188127e.m157659j0().size() - 4 || this.f188130h) {
            return;
        }
        this.f188130h = true;
        m205642x();
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m205653s(ValueAnimator valueAnimator) {
        this.f188129g.scrollToPositionWithOffset(0, -((Integer) valueAnimator.getAnimatedValue()).intValue());
    }

    /* JADX INFO: renamed from: u */
    public final void m205654u() {
        this.f188128f.m129728W(new y20() { // from class: l.rai
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f161934a.m205652q((Integer) obj);
            }
        });
    }

    /* JADX INFO: renamed from: v */
    public void m205655v(int i) {
        act().hideInput();
        this.f188128f.m129724S(i);
    }

    /* JADX INFO: renamed from: w */
    public final void m205656w() {
        this.f188127e.m157660k0(act().getIntent().getStringExtra("VIDEO_FLOW_MOMENT_ID"));
    }

    /* JADX INFO: renamed from: z */
    public void m205657z(List<Live> list) {
        gai gaiVar = this.f188128f;
        if (gaiVar != null) {
            gaiVar.m129730Y(list);
        }
    }

    @Override // p153l.iam
    public void destroy() {
    }
}
