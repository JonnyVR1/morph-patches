package com.p000p1.mobile.putong.feed.newui.topic.qatopic;

import android.animation.Animator;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.p000p1.mobile.putong.feed.FeedModule;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import l.t100;
import l.w9j;
import l.xdl0;
import p007l.e1c0;
import p007l.f3c0;
import p007l.kmb0;
import p007l.lmg;
import p007l.mmg;
import p007l.nmg;
import p007l.wzh;
import v.VFrame;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class QATopicTowOptionVoteView extends FeedQaTopicVoteListGroupView<FeedQaTwoOptionTopicItem> {

    /* JADX INFO: renamed from: c */
    public VFrame f4594c;

    /* JADX INFO: renamed from: d */
    public FeedQaBgRelativeLayout f4595d;

    /* JADX INFO: renamed from: e */
    public View f4596e;

    /* JADX INFO: renamed from: f */
    public View f4597f;

    /* JADX INFO: renamed from: g */
    public FeedQaTwoOptionTopicItem f4598g;

    /* JADX INFO: renamed from: h */
    public FeedQaTwoOptionTopicItem f4599h;

    /* JADX INFO: renamed from: i */
    public LinearLayout f4600i;

    /* JADX INFO: renamed from: j */
    public FrameLayout f4601j;

    /* JADX INFO: renamed from: k */
    public FeedQaTwoOptionTopicItem f4602k;

    /* JADX INFO: renamed from: l */
    public View f4603l;

    /* JADX INFO: renamed from: m */
    public FrameLayout f4604m;

    /* JADX INFO: renamed from: n */
    public FeedQaTwoOptionTopicItem f4605n;

    /* JADX INFO: renamed from: o */
    public Map<Integer, lmg[]> f4606o;

    /* JADX INFO: renamed from: p */
    public List<FeedQaTwoOptionTopicItem> f4607p;

    /* JADX INFO: renamed from: q */
    public List<View> f4608q;

    /* JADX INFO: renamed from: r */
    public int f4609r;

    /* JADX INFO: renamed from: s */
    public int f4610s;

    /* JADX INFO: renamed from: t */
    public int f4611t;

    /* JADX INFO: renamed from: u */
    public Map<View, FeedQaItemVoteStatus> f4612u;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.topic.qatopic.QATopicTowOptionVoteView$a */
    public class C2204a extends nmg {

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ wzh f4613f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ FeedQaTwoOptionTopicItem f4614g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2204a(int i, int i2, wzh wzhVar, FeedQaTwoOptionTopicItem feedQaTwoOptionTopicItem) {
            super(i, i2);
            this.f4613f = wzhVar;
            this.f4614g = feedQaTwoOptionTopicItem;
        }

        @Override // p007l.lmg
        /* JADX INFO: renamed from: a */
        public void mo7221a(boolean z) {
            super.mo7221a(z);
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(m11647c(true), m11647c(false));
            valueAnimatorOfInt.setDuration(200L);
            valueAnimatorOfInt.addListener(this);
            final wzh wzhVar = this.f4613f;
            final FeedQaTwoOptionTopicItem feedQaTwoOptionTopicItem = this.f4614g;
            valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.emb0
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    this.f7421a.m7222i(wzhVar, feedQaTwoOptionTopicItem, valueAnimator);
                }
            });
            valueAnimatorOfInt.start();
        }

        /* JADX INFO: renamed from: i */
        public final /* synthetic */ void m7222i(wzh wzhVar, FeedQaTwoOptionTopicItem feedQaTwoOptionTopicItem, ValueAnimator valueAnimator) {
            QATopicTowOptionVoteView.this.m7218p0(wzhVar.m15946c(), ((Integer) valueAnimator.getAnimatedValue()).intValue(), feedQaTwoOptionTopicItem);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.topic.qatopic.QATopicTowOptionVoteView$b */
    public class C2205b extends nmg {

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ wzh f4616f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2205b(int i, int i2, wzh wzhVar) {
            super(i, i2);
            this.f4616f = wzhVar;
        }

        @Override // p007l.lmg
        /* JADX INFO: renamed from: a */
        public void mo7221a(boolean z) {
            super.mo7221a(z);
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(m11647c(true), m11647c(false));
            valueAnimatorOfInt.setDuration(200L);
            valueAnimatorOfInt.addListener(this);
            valueAnimatorOfInt.setEvaluator(new ArgbEvaluator());
            final wzh wzhVar = this.f4616f;
            valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.fmb0
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    this.f8163a.m7224i(wzhVar, valueAnimator);
                }
            });
            valueAnimatorOfInt.start();
        }

        /* JADX INFO: renamed from: i */
        public final /* synthetic */ void m7224i(wzh wzhVar, ValueAnimator valueAnimator) {
            float radius = QATopicTowOptionVoteView.this.getRadius();
            ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{radius, radius, radius, radius, radius, radius, radius, radius}, null, null));
            shapeDrawable.getPaint().setStyle(Paint.Style.FILL);
            shapeDrawable.getPaint().setColor(((Integer) valueAnimator.getAnimatedValue()).intValue());
            QATopicTowOptionVoteView.this.m7209Z(wzhVar.m15946c()).setBackground(shapeDrawable);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.topic.qatopic.QATopicTowOptionVoteView$c */
    public class C2206c extends nmg {

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ FeedQaTwoOptionTopicItem f4618f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2206c(int i, int i2, FeedQaTwoOptionTopicItem feedQaTwoOptionTopicItem) {
            super(i, i2);
            this.f4618f = feedQaTwoOptionTopicItem;
        }

        @Override // p007l.lmg
        /* JADX INFO: renamed from: a */
        public void mo7221a(boolean z) {
            super.mo7221a(z);
            ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(this.f4618f.f4538b, "textColor", m11647c(true), m11647c(false));
            objectAnimatorOfInt.setDuration(200L);
            objectAnimatorOfInt.addListener(this);
            objectAnimatorOfInt.setEvaluator(new ArgbEvaluator());
            objectAnimatorOfInt.start();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.topic.qatopic.QATopicTowOptionVoteView$d */
    public class C2207d extends nmg {

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ wzh f4620f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2207d(int i, int i2, wzh wzhVar) {
            super(i, i2);
            this.f4620f = wzhVar;
        }

        @Override // p007l.lmg
        /* JADX INFO: renamed from: a */
        public void mo7221a(boolean z) {
            super.mo7221a(z);
            if (m11647c(true) == 1) {
                QATopicTowOptionVoteView.this.m7210a0(this.f4620f.m15946c()).setVisibility(8);
            }
            onAnimationStart(null, false);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.topic.qatopic.QATopicTowOptionVoteView$e */
    public class C2208e extends nmg {

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ FeedQaTwoOptionTopicItem f4622f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2208e(int i, int i2, FeedQaTwoOptionTopicItem feedQaTwoOptionTopicItem) {
            super(i, i2);
            this.f4622f = feedQaTwoOptionTopicItem;
        }

        @Override // p007l.lmg
        /* JADX INFO: renamed from: a */
        public void mo7221a(boolean z) {
            super.mo7221a(z);
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(m11647c(true), m11647c(false));
            valueAnimatorOfInt.setDuration(120L);
            valueAnimatorOfInt.addListener(this);
            final FeedQaTwoOptionTopicItem feedQaTwoOptionTopicItem = this.f4622f;
            valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.gmb0
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    xdl0.D0(((Integer) valueAnimator.getAnimatedValue()).intValue(), new View[]{feedQaTwoOptionTopicItem.f4539c});
                }
            });
            valueAnimatorOfInt.start();
        }

        @Override // p007l.nmg, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator, boolean z) {
            super.onAnimationStart(animator, z);
            if (m11647c(true) == 1) {
                this.f4622f.f4539c.setTranslationY(t100.d(24.0f));
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.topic.qatopic.QATopicTowOptionVoteView$f */
    public class C2209f extends mmg {

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ FeedQaTwoOptionTopicItem f4624f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2209f(int i, int i2, FeedQaTwoOptionTopicItem feedQaTwoOptionTopicItem) {
            super(i, i2);
            this.f4624f = feedQaTwoOptionTopicItem;
        }

        @Override // p007l.lmg
        /* JADX INFO: renamed from: a */
        public void mo7221a(boolean z) {
            super.mo7221a(z);
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f4624f.f4539c, "alpha", m11647c(true), m11647c(false));
            objectAnimatorOfFloat.addListener(this);
            objectAnimatorOfFloat.setDuration(120L);
            objectAnimatorOfFloat.start();
        }

        @Override // p007l.mmg, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator, boolean z) {
            if (m11647c(true) == 0) {
                super.onAnimationEnd(animator, z);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (m11647c(true) == 1) {
                m11646b();
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.topic.qatopic.QATopicTowOptionVoteView$g */
    public class C2210g extends nmg {

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ FeedQaTwoOptionTopicItem f4626f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2210g(int i, int i2, FeedQaTwoOptionTopicItem feedQaTwoOptionTopicItem) {
            super(i, i2);
            this.f4626f = feedQaTwoOptionTopicItem;
        }

        @Override // p007l.lmg
        /* JADX INFO: renamed from: a */
        public void mo7221a(boolean z) {
            super.mo7221a(z);
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f4626f.f4539c, "translationY", m11647c(true), m11647c(false));
            objectAnimatorOfFloat.addListener(this);
            objectAnimatorOfFloat.setDuration(120L);
            objectAnimatorOfFloat.start();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.topic.qatopic.QATopicTowOptionVoteView$h */
    public class C2211h extends nmg {

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ wzh f4628f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ FeedQaTwoOptionTopicItem f4629g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2211h(int i, int i2, wzh wzhVar, FeedQaTwoOptionTopicItem feedQaTwoOptionTopicItem) {
            super(i, i2);
            this.f4628f = wzhVar;
            this.f4629g = feedQaTwoOptionTopicItem;
        }

        @Override // p007l.lmg
        /* JADX INFO: renamed from: a */
        public void mo7221a(boolean z) {
            super.mo7221a(z);
            int iM11647c = m11647c(true);
            QATopicTowOptionVoteView qATopicTowOptionVoteView = QATopicTowOptionVoteView.this;
            if (iM11647c != 0) {
                qATopicTowOptionVoteView.m7207X(this.f4629g.f4537a, 8);
                onAnimationStart(null);
                return;
            }
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(qATopicTowOptionVoteView.m7210a0(this.f4628f.m15946c()), "alpha", m11647c(true), m11647c(false));
            objectAnimatorOfFloat.addListener(this);
            objectAnimatorOfFloat.setDuration(200L);
            QATopicTowOptionVoteView.this.m7207X(this.f4629g.f4537a, 0);
            objectAnimatorOfFloat.start();
        }

        @Override // p007l.nmg, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator, boolean z) {
            super.onAnimationStart(animator, z);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.topic.qatopic.QATopicTowOptionVoteView$i */
    public class C2212i extends nmg {

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ wzh f4631f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ FeedQaTwoOptionTopicItem f4632g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2212i(int i, int i2, wzh wzhVar, FeedQaTwoOptionTopicItem feedQaTwoOptionTopicItem) {
            super(i, i2);
            this.f4631f = wzhVar;
            this.f4632g = feedQaTwoOptionTopicItem;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: i */
        public /* synthetic */ void m7227i(wzh wzhVar, FeedQaTwoOptionTopicItem feedQaTwoOptionTopicItem, ValueAnimator valueAnimator) {
            QATopicTowOptionVoteView.this.m7218p0(wzhVar.m15946c(), ((Integer) valueAnimator.getAnimatedValue()).intValue(), feedQaTwoOptionTopicItem);
        }

        @Override // p007l.lmg
        /* JADX INFO: renamed from: a */
        public void mo7221a(boolean z) {
            super.mo7221a(z);
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(m11647c(true), m11647c(false));
            valueAnimatorOfInt.setDuration(200L);
            valueAnimatorOfInt.addListener(this);
            final wzh wzhVar = this.f4631f;
            final FeedQaTwoOptionTopicItem feedQaTwoOptionTopicItem = this.f4632g;
            valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.hmb0
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    this.f8770a.m7227i(wzhVar, feedQaTwoOptionTopicItem, valueAnimator);
                }
            });
            valueAnimatorOfInt.start();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.topic.qatopic.QATopicTowOptionVoteView$j */
    public class C2213j extends nmg {

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ wzh f4634f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2213j(int i, int i2, wzh wzhVar) {
            super(i, i2);
            this.f4634f = wzhVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: i */
        public /* synthetic */ void m7229i(wzh wzhVar, ValueAnimator valueAnimator) {
            xdl0.D0(((Integer) valueAnimator.getAnimatedValue()).intValue(), new View[]{QATopicTowOptionVoteView.this.m7209Z(wzhVar.m15946c())});
        }

        @Override // p007l.lmg
        /* JADX INFO: renamed from: a */
        public void mo7221a(boolean z) {
            super.mo7221a(z);
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(m11647c(true), m11647c(false));
            valueAnimatorOfInt.setDuration(200L);
            valueAnimatorOfInt.addListener(this);
            final wzh wzhVar = this.f4634f;
            valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.imb0
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    this.f9089a.m7229i(wzhVar, valueAnimator);
                }
            });
            valueAnimatorOfInt.start();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.topic.qatopic.QATopicTowOptionVoteView$k */
    public class C2214k extends nmg {

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ FeedQaTwoOptionTopicItem f4636f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2214k(int i, int i2, FeedQaTwoOptionTopicItem feedQaTwoOptionTopicItem) {
            super(i, i2);
            this.f4636f = feedQaTwoOptionTopicItem;
        }

        @Override // p007l.lmg
        /* JADX INFO: renamed from: a */
        public void mo7221a(boolean z) {
            super.mo7221a(z);
            ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(this.f4636f.f4538b, "textColor", m11647c(true), m11647c(false));
            objectAnimatorOfInt.setDuration(200L);
            objectAnimatorOfInt.addListener(this);
            objectAnimatorOfInt.setEvaluator(new ArgbEvaluator());
            objectAnimatorOfInt.start();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.topic.qatopic.QATopicTowOptionVoteView$l */
    public class C2215l extends nmg {

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ wzh f4638f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2215l(int i, int i2, wzh wzhVar) {
            super(i, i2);
            this.f4638f = wzhVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: i */
        public /* synthetic */ void m7231i(wzh wzhVar, ValueAnimator valueAnimator) {
            xdl0.D0(((Integer) valueAnimator.getAnimatedValue()).intValue(), new View[]{QATopicTowOptionVoteView.this.m7209Z(wzhVar.m15946c())});
        }

        @Override // p007l.lmg
        /* JADX INFO: renamed from: a */
        public void mo7221a(boolean z) {
            super.mo7221a(z);
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(m11647c(true), m11647c(false));
            valueAnimatorOfInt.setDuration(200L);
            valueAnimatorOfInt.addListener(this);
            final wzh wzhVar = this.f4638f;
            valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.jmb0
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    this.f9391a.m7231i(wzhVar, valueAnimator);
                }
            });
            valueAnimatorOfInt.start();
        }
    }

    public QATopicTowOptionVoteView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4606o = new HashMap();
        this.f4609r = -1;
        this.f4610s = t100.d(12.0f);
        this.f4611t = t100.d(12.0f) * 2;
        this.f4612u = new HashMap();
        mo7113K(context);
    }

    /* JADX INFO: renamed from: b0 */
    private String m7198b0(int i, int i2) {
        double dM7199c0 = m7199c0(i, i2);
        return dM7199c0 == 0.0d ? "0%" : new DecimalFormat("##%").format(dM7199c0);
    }

    /* JADX INFO: renamed from: c0 */
    private double m7199c0(int i, int i2) {
        if (i2 == 0) {
            return 0.0d;
        }
        return (((double) i) * 1.0d) / (((double) i2) * 1.0d);
    }

    /* JADX INFO: renamed from: f0 */
    private int m7200f0(int i, int i2) {
        return (int) Math.round(((double) (this.f4609r - this.f4611t)) * m7201g0(i, i2));
    }

    /* JADX INFO: renamed from: g0 */
    private double m7201g0(int i, int i2) {
        return (((double) i) * 1.0d) / (((double) i2) * 1.0d);
    }

    @Override // com.p000p1.mobile.putong.feed.newui.topic.qatopic.FeedQaTopicVoteListGroupView
    /* JADX INFO: renamed from: C */
    public void mo7109C(wzh wzhVar) {
        FeedQaTwoOptionTopicItem feedQaTwoOptionTopicItem = (FeedQaTwoOptionTopicItem) m7108B(wzhVar);
        m7207X(feedQaTwoOptionTopicItem.f4537a, 8);
        feedQaTwoOptionTopicItem.f4538b.setTextColor(FeedModule.f313a.getResources().getColor(e1c0.f7105D));
        m7209Z(wzhVar.m15946c()).setBackgroundResource(f3c0.f7752Z3);
        feedQaTwoOptionTopicItem.f4539c.setTextColor(FeedModule.f313a.getResources().getColor(e1c0.f7105D));
        xdl0.D0(m7200f0(wzhVar.m15945b(), wzhVar.m15944a()), new View[]{m7209Z(wzhVar.m15946c())});
        feedQaTwoOptionTopicItem.f4539c.setText(m7198b0(wzhVar.m15945b(), wzhVar.m15944a()));
        xdl0.D0(-2, new View[]{feedQaTwoOptionTopicItem.f4539c});
        m7218p0(wzhVar.m15946c(), m7211e0(wzhVar), feedQaTwoOptionTopicItem);
    }

    @Override // com.p000p1.mobile.putong.feed.newui.topic.qatopic.FeedQaTopicVoteListGroupView
    /* JADX INFO: renamed from: E */
    public void mo7110E(wzh wzhVar) {
        FeedQaTwoOptionTopicItem feedQaTwoOptionTopicItem = (FeedQaTwoOptionTopicItem) m7108B(wzhVar);
        m7207X(feedQaTwoOptionTopicItem.f4537a, 8);
        feedQaTwoOptionTopicItem.f4539c.setText(m7198b0(wzhVar.m15945b(), wzhVar.m15944a()));
        feedQaTwoOptionTopicItem.f4538b.setTextColor(Color.parseColor("#66000000"));
        m7209Z(wzhVar.m15946c()).setBackgroundResource(0);
        feedQaTwoOptionTopicItem.f4539c.setTextColor(Color.parseColor("#66000000"));
        xdl0.D0(m7200f0(wzhVar.m15945b(), wzhVar.m15944a()) + t100.d(36.0f), new View[]{m7209Z(wzhVar.m15946c())});
        xdl0.D0(-2, new View[]{feedQaTwoOptionTopicItem.f4539c});
        m7209Z(wzhVar.m15946c()).setBackgroundResource(f3c0.f7738X3);
        m7218p0(wzhVar.m15946c(), m7211e0(wzhVar), feedQaTwoOptionTopicItem);
    }

    @Override // com.p000p1.mobile.putong.feed.newui.topic.qatopic.FeedQaTopicVoteListGroupView
    /* JADX INFO: renamed from: G */
    public void mo7112G(wzh wzhVar) {
        FeedQaTwoOptionTopicItem feedQaTwoOptionTopicItem = (FeedQaTwoOptionTopicItem) m7108B(wzhVar);
        m7209Z(wzhVar.m15946c()).setBackgroundResource(f3c0.f7738X3);
        xdl0.D0(getNoVoteBgWidth(), new View[]{m7209Z(wzhVar.m15946c())});
        this.f4600i.setBackgroundResource(0);
        xdl0.D0(1, new View[]{feedQaTwoOptionTopicItem.f4539c});
        feedQaTwoOptionTopicItem.f4538b.setTextColor(FeedModule.f313a.getResources().getColor(e1c0.f7136e));
        m7207X(feedQaTwoOptionTopicItem.f4537a, 0);
        m7218p0(wzhVar.m15946c(), 0, feedQaTwoOptionTopicItem);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p000p1.mobile.putong.feed.newui.topic.qatopic.FeedQaTopicVoteListGroupView
    /* JADX INFO: renamed from: K */
    public void mo7113K(Context context) {
        super.mo7113K(context);
        addView(m7202R(LayoutInflater.from(context), this));
        this.f4595d.setIsViewIsSelect(new w9j() { // from class: l.cmb0
            public final Object call(Object obj) {
                return this.f6685a.m7214k0((Integer) obj);
            }
        });
        m7212h0();
    }

    /* JADX INFO: renamed from: R */
    public View m7202R(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return kmb0.m11502b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: S */
    public void m7203S(wzh wzhVar, FeedQaTwoOptionTopicItem feedQaTwoOptionTopicItem, lmg lmgVar) {
        m7108B(wzhVar).f4539c.measure(0, 0);
        C2208e c2208e = new C2208e(1, m7108B(wzhVar).f4539c.getMeasuredWidth(), feedQaTwoOptionTopicItem);
        C2209f c2209f = new C2209f(0, 1, feedQaTwoOptionTopicItem);
        C2210g c2210g = new C2210g(t100.d(24.0f), 0, feedQaTwoOptionTopicItem);
        lmgVar.m11651g(c2208e).m11648d(c2209f).m11651g(c2210g).m11651g(new C2211h(1, 0, wzhVar, feedQaTwoOptionTopicItem));
    }

    /* JADX INFO: renamed from: T */
    public lmg m7204T(wzh wzhVar, FeedQaTwoOptionTopicItem feedQaTwoOptionTopicItem, nmg nmgVar) {
        feedQaTwoOptionTopicItem.f4537a.setVisibility(8);
        return nmgVar.m11651g(new C2214k(Color.parseColor("#cc000000"), Color.parseColor("#66000000"), feedQaTwoOptionTopicItem)).m11651g(new C2213j(getNoVoteBgWidth(), m7200f0(wzhVar.m15945b(), wzhVar.m15944a()) + t100.d(36.0f), wzhVar)).m11651g(new C2212i(0, m7211e0(wzhVar), wzhVar, feedQaTwoOptionTopicItem));
    }

    /* JADX INFO: renamed from: V */
    public lmg m7205V(wzh wzhVar, FeedQaTwoOptionTopicItem feedQaTwoOptionTopicItem, boolean z, nmg nmgVar) {
        C2215l c2215l = new C2215l(getNoVoteBgWidth(), m7200f0(z ? wzhVar.m15945b() + 1 : wzhVar.m15945b(), z ? wzhVar.m15944a() + 1 : wzhVar.m15944a()), wzhVar);
        return nmgVar.m11651g(c2215l).m11651g(new C2205b(Color.parseColor("#f7f7f8"), Color.parseColor("#ffe5d2"), wzhVar)).m11651g(new C2206c(Color.parseColor("#cc000000"), Color.parseColor("#fe7e1d"), feedQaTwoOptionTopicItem)).m11651g(new C2204a(0, m7211e0(wzhVar), wzhVar, feedQaTwoOptionTopicItem));
    }

    /* JADX INFO: renamed from: W */
    public void m7206W(wzh wzhVar, FeedQaTwoOptionTopicItem feedQaTwoOptionTopicItem) {
        feedQaTwoOptionTopicItem.f4539c.setText(m7198b0(wzhVar.m15945b(), wzhVar.m15944a()));
    }

    /* JADX INFO: renamed from: X */
    public void m7207X(View view, int i) {
        view.setVisibility(i);
        if (view == this.f4602k.f4537a) {
            this.f4598g.f4537a.setVisibility(i);
        } else {
            this.f4599h.f4537a.setVisibility(i);
        }
    }

    /* JADX INFO: renamed from: Y */
    public int m7208Y(wzh wzhVar, FeedQaTwoOptionTopicItem feedQaTwoOptionTopicItem, boolean z) {
        if (this.f4612u.get(feedQaTwoOptionTopicItem) == null) {
            return !wzhVar.m15952i() ? 1 : 0;
        }
        FeedQaItemVoteStatus feedQaItemVoteStatus = this.f4612u.get(feedQaTwoOptionTopicItem);
        FeedQaItemVoteStatus feedQaItemVoteStatus2 = FeedQaItemVoteStatus.NO_VOTE;
        if ((feedQaItemVoteStatus == feedQaItemVoteStatus2 && wzhVar.m15952i()) || (z && wzhVar.m15951h())) {
            return 0;
        }
        return (this.f4612u.get(feedQaTwoOptionTopicItem) == FeedQaItemVoteStatus.HAVE_VOTE_NOT_BE_VOTING || (this.f4612u.get(feedQaTwoOptionTopicItem) == feedQaItemVoteStatus2 && !wzhVar.m15952i())) ? 1 : 0;
    }

    /* JADX INFO: renamed from: Z */
    public View m7209Z(int i) {
        return i == 0 ? this.f4596e : this.f4597f;
    }

    /* JADX INFO: renamed from: a0 */
    public View m7210a0(int i) {
        return i == 0 ? this.f4598g.f4537a : this.f4599h.f4537a;
    }

    /* JADX INFO: renamed from: e0 */
    public int m7211e0(wzh wzhVar) {
        FeedQaTwoOptionTopicItem feedQaTwoOptionTopicItemM7108B = m7108B(wzhVar);
        ViewGroup viewGroup = (ViewGroup) feedQaTwoOptionTopicItemM7108B.getParent();
        feedQaTwoOptionTopicItemM7108B.measure(0, 0);
        int iD = feedQaTwoOptionTopicItemM7108B.f4537a.getVisibility() == 0 ? t100.d(20.0f) : 0;
        if (feedQaTwoOptionTopicItemM7108B.f4539c.getWidth() == 1) {
            feedQaTwoOptionTopicItemM7108B.f4539c.measure(0, 0);
            iD -= feedQaTwoOptionTopicItemM7108B.f4539c.getMeasuredWidth();
        }
        return Math.max(((viewGroup.getWidth() - feedQaTwoOptionTopicItemM7108B.getMeasuredWidth()) + iD) / 2, 0);
    }

    @Override // com.p000p1.mobile.putong.feed.newui.topic.qatopic.FeedQaTopicVoteListGroupView
    public int getAnimTime() {
        return 400;
    }

    public int getNoVoteBgWidth() {
        return ((this.f4609r - this.f4610s) - this.f4611t) / 2;
    }

    @Override // com.p000p1.mobile.putong.feed.newui.topic.qatopic.FeedQaTopicVoteListGroupView
    public List<FeedQaTwoOptionTopicItem> getQaTopicVoteViewList() {
        if (this.f4607p == null) {
            ArrayList arrayList = new ArrayList();
            this.f4607p = arrayList;
            arrayList.add(this.f4602k);
            this.f4607p.add(this.f4605n);
        }
        return this.f4607p;
    }

    public int getRadius() {
        return t100.d(14.0f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p000p1.mobile.putong.feed.newui.topic.qatopic.FeedQaTopicVoteListGroupView
    public View getView() {
        return this;
    }

    @Override // com.p000p1.mobile.putong.feed.newui.topic.qatopic.FeedQaTopicVoteListGroupView
    public View getVoteListContainer() {
        return this.f4600i;
    }

    @Override // com.p000p1.mobile.putong.feed.newui.topic.qatopic.FeedQaTopicVoteListGroupView
    public List<View> getVoteViewContainerList() {
        if (this.f4608q == null) {
            ArrayList arrayList = new ArrayList();
            this.f4608q = arrayList;
            arrayList.add(this.f4601j);
            this.f4608q.add(this.f4604m);
        }
        return this.f4608q;
    }

    /* JADX INFO: renamed from: h0 */
    public final void m7212h0() {
        m7207X(this.f4598g.f4537a, 8);
        m7207X(this.f4599h.f4537a, 8);
        this.f4598g.f4537a.setImageResource(f3c0.f7784d4);
        this.f4599h.f4537a.setImageResource(f3c0.f7792e4);
    }

    /* JADX INFO: renamed from: j0 */
    public final /* synthetic */ void m7213j0(wzh wzhVar) {
        super.mo7122z(wzhVar);
    }

    /* JADX INFO: renamed from: k0 */
    public final /* synthetic */ Boolean m7214k0(Integer num) {
        return Boolean.valueOf(this.f4612u.get(this.f4607p.get(num.intValue())) == FeedQaItemVoteStatus.HAVE_VOTE_BE_VOTING);
    }

    @Override // com.p000p1.mobile.putong.feed.newui.topic.qatopic.FeedQaTopicVoteListGroupView
    /* JADX INFO: renamed from: l0, reason: merged with bridge method [inline-methods] */
    public void mo7116N(FeedQaTwoOptionTopicItem feedQaTwoOptionTopicItem, FeedQaItemVoteStatus feedQaItemVoteStatus) {
        this.f4612u.put(feedQaTwoOptionTopicItem, feedQaItemVoteStatus);
    }

    /* JADX INFO: renamed from: m0 */
    public void m7216m0(wzh wzhVar, int i, lmg[] lmgVarArr, lmg lmgVar) {
        if (lmgVarArr != null) {
            lmgVarArr[i] = lmgVar;
            this.f4606o.put(Integer.valueOf(wzhVar.m15946c()), lmgVarArr);
        } else {
            lmg[] lmgVarArr2 = new lmg[2];
            lmgVarArr2[i] = lmgVar;
            this.f4606o.put(Integer.valueOf(wzhVar.m15946c()), lmgVarArr2);
        }
    }

    /* JADX INFO: renamed from: o0 */
    public final void m7217o0(wzh wzhVar) {
        if (wzhVar.m15946c() == 0) {
            this.f4598g.f4538b.setVisibility(4);
            this.f4598g.f4538b.setText(wzhVar.m15947d());
        } else {
            this.f4599h.f4538b.setVisibility(4);
            this.f4599h.f4538b.setText(wzhVar.m15947d());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onMeasure(int i, int i2) {
        super/*android.view.View*/.onMeasure(i, i2);
        this.f4609r = View.MeasureSpec.getSize(i);
    }

    /* JADX INFO: renamed from: p0 */
    public void m7218p0(int i, int i2, View view) {
        if (i == 0) {
            xdl0.W(view, i2);
        } else {
            xdl0.V(view, i2);
        }
    }

    /* JADX INFO: renamed from: q0 */
    public void m7219q0(wzh wzhVar, FeedQaTwoOptionTopicItem feedQaTwoOptionTopicItem) {
        if (wzhVar.m15952i()) {
            feedQaTwoOptionTopicItem.f4539c.setTextColor(Color.parseColor("#fe7e1d"));
        } else {
            feedQaTwoOptionTopicItem.f4539c.setTextColor(Color.parseColor("#66000000"));
        }
    }

    @Override // com.p000p1.mobile.putong.feed.newui.topic.qatopic.FeedQaTopicVoteListGroupView
    /* JADX INFO: renamed from: v */
    public void mo7120v(wzh wzhVar) {
        FeedQaTwoOptionTopicItem feedQaTwoOptionTopicItemM7108B = m7108B(wzhVar);
        m7206W(wzhVar, feedQaTwoOptionTopicItemM7108B);
        boolean z = this.f4612u.get(feedQaTwoOptionTopicItemM7108B) == FeedQaItemVoteStatus.HAVE_VOTE_BE_VOTING;
        int iM7208Y = m7208Y(wzhVar, feedQaTwoOptionTopicItemM7108B, z);
        lmg[] lmgVarArr = this.f4606o.get(Integer.valueOf(wzhVar.m15946c()));
        lmg lmgVar = (lmgVarArr == null || lmgVarArr.length <= iM7208Y) ? null : lmgVarArr[iM7208Y];
        if (lmgVar != null) {
            lmgVar.m11649e(wzhVar.m15951h());
            return;
        }
        nmg c2207d = new C2207d(1, 0, wzhVar);
        m7216m0(wzhVar, iM7208Y, lmgVarArr, c2207d);
        m7203S(wzhVar, feedQaTwoOptionTopicItemM7108B, (wzhVar.m15952i() || z) ? m7205V(wzhVar, feedQaTwoOptionTopicItemM7108B, z, c2207d) : m7204T(wzhVar, feedQaTwoOptionTopicItemM7108B, c2207d));
        c2207d.m11649e(wzhVar.m15951h());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p000p1.mobile.putong.feed.newui.topic.qatopic.FeedQaTopicVoteListGroupView
    /* JADX INFO: renamed from: z */
    public void mo7122z(final wzh wzhVar) {
        if (this.f4609r == -1) {
            post(new Runnable() { // from class: l.dmb0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f6990a.m7213j0(wzhVar);
                }
            });
        } else {
            super.mo7122z(wzhVar);
        }
        FeedQaTwoOptionTopicItem feedQaTwoOptionTopicItem = (FeedQaTwoOptionTopicItem) m7108B(wzhVar);
        feedQaTwoOptionTopicItem.f4538b.setText(wzhVar.m15947d());
        if (!wzhVar.m15951h()) {
            m7219q0(wzhVar, feedQaTwoOptionTopicItem);
        }
        m7217o0(wzhVar);
    }

    public QATopicTowOptionVoteView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f4606o = new HashMap();
        this.f4609r = -1;
        this.f4610s = t100.d(12.0f);
        this.f4611t = t100.d(12.0f) * 2;
        this.f4612u = new HashMap();
        mo7113K(context);
    }

    public QATopicTowOptionVoteView(Context context, String str) {
        super(context, str);
        this.f4606o = new HashMap();
        this.f4609r = -1;
        this.f4610s = t100.d(12.0f);
        this.f4611t = t100.d(12.0f) * 2;
        this.f4612u = new HashMap();
    }

    public QATopicTowOptionVoteView(Context context) {
        super(context);
        this.f4606o = new HashMap();
        this.f4609r = -1;
        this.f4610s = t100.d(12.0f);
        this.f4611t = t100.d(12.0f) * 2;
        this.f4612u = new HashMap();
    }
}
