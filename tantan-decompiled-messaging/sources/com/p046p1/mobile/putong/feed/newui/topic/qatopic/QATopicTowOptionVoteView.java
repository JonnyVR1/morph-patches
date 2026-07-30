package com.p046p1.mobile.putong.feed.newui.topic.qatopic;

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
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.p046p1.mobile.putong.feed.FeedModule;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p147v.VFrame;
import p149l.e1c0;
import p149l.f3c0;
import p149l.kmb0;
import p149l.lmg;
import p149l.mmg;
import p149l.nmg;
import p149l.t100;
import p149l.w9j;
import p149l.wzh;
import p149l.xdl0;

/* JADX INFO: loaded from: classes12.dex */
public class QATopicTowOptionVoteView extends FeedQaTopicVoteListGroupView<FeedQaTwoOptionTopicItem> {

    /* JADX INFO: renamed from: c */
    public VFrame f43133c;

    /* JADX INFO: renamed from: d */
    public FeedQaBgRelativeLayout f43134d;

    /* JADX INFO: renamed from: e */
    public View f43135e;

    /* JADX INFO: renamed from: f */
    public View f43136f;

    /* JADX INFO: renamed from: g */
    public FeedQaTwoOptionTopicItem f43137g;

    /* JADX INFO: renamed from: h */
    public FeedQaTwoOptionTopicItem f43138h;

    /* JADX INFO: renamed from: i */
    public LinearLayout f43139i;

    /* JADX INFO: renamed from: j */
    public FrameLayout f43140j;

    /* JADX INFO: renamed from: k */
    public FeedQaTwoOptionTopicItem f43141k;

    /* JADX INFO: renamed from: l */
    public View f43142l;

    /* JADX INFO: renamed from: m */
    public FrameLayout f43143m;

    /* JADX INFO: renamed from: n */
    public FeedQaTwoOptionTopicItem f43144n;

    /* JADX INFO: renamed from: o */
    public Map<Integer, lmg[]> f43145o;

    /* JADX INFO: renamed from: p */
    public List<FeedQaTwoOptionTopicItem> f43146p;

    /* JADX INFO: renamed from: q */
    public List<View> f43147q;

    /* JADX INFO: renamed from: r */
    public int f43148r;

    /* JADX INFO: renamed from: s */
    public int f43149s;

    /* JADX INFO: renamed from: t */
    public int f43150t;

    /* JADX INFO: renamed from: u */
    public Map<View, FeedQaItemVoteStatus> f43151u;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.topic.qatopic.QATopicTowOptionVoteView$a */
    public class C11360a extends nmg {

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ wzh f43152f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ FeedQaTwoOptionTopicItem f43153g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C11360a(int i, int i2, wzh wzhVar, FeedQaTwoOptionTopicItem feedQaTwoOptionTopicItem) {
            super(i, i2);
            this.f43152f = wzhVar;
            this.f43153g = feedQaTwoOptionTopicItem;
        }

        @Override // p149l.lmg
        /* JADX INFO: renamed from: a */
        public void mo66069a(boolean z) {
            super.mo66069a(z);
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(m150583c(true), m150583c(false));
            valueAnimatorOfInt.setDuration(200L);
            valueAnimatorOfInt.addListener(this);
            final wzh wzhVar = this.f43152f;
            final FeedQaTwoOptionTopicItem feedQaTwoOptionTopicItem = this.f43153g;
            valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.emb0
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    this.f92193a.m66070i(wzhVar, feedQaTwoOptionTopicItem, valueAnimator);
                }
            });
            valueAnimatorOfInt.start();
        }

        /* JADX INFO: renamed from: i */
        public final /* synthetic */ void m66070i(wzh wzhVar, FeedQaTwoOptionTopicItem feedQaTwoOptionTopicItem, ValueAnimator valueAnimator) {
            QATopicTowOptionVoteView.this.m66066p0(wzhVar.m206282c(), ((Integer) valueAnimator.getAnimatedValue()).intValue(), feedQaTwoOptionTopicItem);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.topic.qatopic.QATopicTowOptionVoteView$b */
    public class C11361b extends nmg {

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ wzh f43155f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C11361b(int i, int i2, wzh wzhVar) {
            super(i, i2);
            this.f43155f = wzhVar;
        }

        @Override // p149l.lmg
        /* JADX INFO: renamed from: a */
        public void mo66069a(boolean z) {
            super.mo66069a(z);
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(m150583c(true), m150583c(false));
            valueAnimatorOfInt.setDuration(200L);
            valueAnimatorOfInt.addListener(this);
            valueAnimatorOfInt.setEvaluator(new ArgbEvaluator());
            final wzh wzhVar = this.f43155f;
            valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.fmb0
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    this.f98285a.m66072i(wzhVar, valueAnimator);
                }
            });
            valueAnimatorOfInt.start();
        }

        /* JADX INFO: renamed from: i */
        public final /* synthetic */ void m66072i(wzh wzhVar, ValueAnimator valueAnimator) {
            float radius = QATopicTowOptionVoteView.this.getRadius();
            ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{radius, radius, radius, radius, radius, radius, radius, radius}, null, null));
            shapeDrawable.getPaint().setStyle(Paint.Style.FILL);
            shapeDrawable.getPaint().setColor(((Integer) valueAnimator.getAnimatedValue()).intValue());
            QATopicTowOptionVoteView.this.m66057Z(wzhVar.m206282c()).setBackground(shapeDrawable);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.topic.qatopic.QATopicTowOptionVoteView$c */
    public class C11362c extends nmg {

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ FeedQaTwoOptionTopicItem f43157f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C11362c(int i, int i2, FeedQaTwoOptionTopicItem feedQaTwoOptionTopicItem) {
            super(i, i2);
            this.f43157f = feedQaTwoOptionTopicItem;
        }

        @Override // p149l.lmg
        /* JADX INFO: renamed from: a */
        public void mo66069a(boolean z) {
            super.mo66069a(z);
            ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(this.f43157f.f43077b, "textColor", m150583c(true), m150583c(false));
            objectAnimatorOfInt.setDuration(200L);
            objectAnimatorOfInt.addListener(this);
            objectAnimatorOfInt.setEvaluator(new ArgbEvaluator());
            objectAnimatorOfInt.start();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.topic.qatopic.QATopicTowOptionVoteView$d */
    public class C11363d extends nmg {

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ wzh f43159f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C11363d(int i, int i2, wzh wzhVar) {
            super(i, i2);
            this.f43159f = wzhVar;
        }

        @Override // p149l.lmg
        /* JADX INFO: renamed from: a */
        public void mo66069a(boolean z) {
            super.mo66069a(z);
            if (m150583c(true) == 1) {
                QATopicTowOptionVoteView.this.m66058a0(this.f43159f.m206282c()).setVisibility(8);
            }
            onAnimationStart(null, false);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.topic.qatopic.QATopicTowOptionVoteView$e */
    public class C11364e extends nmg {

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ FeedQaTwoOptionTopicItem f43161f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C11364e(int i, int i2, FeedQaTwoOptionTopicItem feedQaTwoOptionTopicItem) {
            super(i, i2);
            this.f43161f = feedQaTwoOptionTopicItem;
        }

        @Override // p149l.lmg
        /* JADX INFO: renamed from: a */
        public void mo66069a(boolean z) {
            super.mo66069a(z);
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(m150583c(true), m150583c(false));
            valueAnimatorOfInt.setDuration(120L);
            valueAnimatorOfInt.addListener(this);
            final FeedQaTwoOptionTopicItem feedQaTwoOptionTopicItem = this.f43161f;
            valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.gmb0
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    xdl0.m208327D0(((Integer) valueAnimator.getAnimatedValue()).intValue(), feedQaTwoOptionTopicItem.f43078c);
                }
            });
            valueAnimatorOfInt.start();
        }

        @Override // p149l.nmg, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator, boolean z) {
            super.onAnimationStart(animator, z);
            if (m150583c(true) == 1) {
                this.f43161f.f43078c.setTranslationY(t100.m186890d(24.0f));
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.topic.qatopic.QATopicTowOptionVoteView$f */
    public class C11365f extends mmg {

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ FeedQaTwoOptionTopicItem f43163f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C11365f(int i, int i2, FeedQaTwoOptionTopicItem feedQaTwoOptionTopicItem) {
            super(i, i2);
            this.f43163f = feedQaTwoOptionTopicItem;
        }

        @Override // p149l.lmg
        /* JADX INFO: renamed from: a */
        public void mo66069a(boolean z) {
            super.mo66069a(z);
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f43163f.f43078c, "alpha", m150583c(true), m150583c(false));
            objectAnimatorOfFloat.addListener(this);
            objectAnimatorOfFloat.setDuration(120L);
            objectAnimatorOfFloat.start();
        }

        @Override // p149l.mmg, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator, boolean z) {
            if (m150583c(true) == 0) {
                super.onAnimationEnd(animator, z);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (m150583c(true) == 1) {
                m150582b();
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.topic.qatopic.QATopicTowOptionVoteView$g */
    public class C11366g extends nmg {

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ FeedQaTwoOptionTopicItem f43165f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C11366g(int i, int i2, FeedQaTwoOptionTopicItem feedQaTwoOptionTopicItem) {
            super(i, i2);
            this.f43165f = feedQaTwoOptionTopicItem;
        }

        @Override // p149l.lmg
        /* JADX INFO: renamed from: a */
        public void mo66069a(boolean z) {
            super.mo66069a(z);
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f43165f.f43078c, "translationY", m150583c(true), m150583c(false));
            objectAnimatorOfFloat.addListener(this);
            objectAnimatorOfFloat.setDuration(120L);
            objectAnimatorOfFloat.start();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.topic.qatopic.QATopicTowOptionVoteView$h */
    public class C11367h extends nmg {

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ wzh f43167f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ FeedQaTwoOptionTopicItem f43168g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C11367h(int i, int i2, wzh wzhVar, FeedQaTwoOptionTopicItem feedQaTwoOptionTopicItem) {
            super(i, i2);
            this.f43167f = wzhVar;
            this.f43168g = feedQaTwoOptionTopicItem;
        }

        @Override // p149l.lmg
        /* JADX INFO: renamed from: a */
        public void mo66069a(boolean z) {
            super.mo66069a(z);
            int iM150583c = m150583c(true);
            QATopicTowOptionVoteView qATopicTowOptionVoteView = QATopicTowOptionVoteView.this;
            if (iM150583c != 0) {
                qATopicTowOptionVoteView.m66055X(this.f43168g.f43076a, 8);
                onAnimationStart(null);
                return;
            }
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(qATopicTowOptionVoteView.m66058a0(this.f43167f.m206282c()), "alpha", m150583c(true), m150583c(false));
            objectAnimatorOfFloat.addListener(this);
            objectAnimatorOfFloat.setDuration(200L);
            QATopicTowOptionVoteView.this.m66055X(this.f43168g.f43076a, 0);
            objectAnimatorOfFloat.start();
        }

        @Override // p149l.nmg, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator, boolean z) {
            super.onAnimationStart(animator, z);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.topic.qatopic.QATopicTowOptionVoteView$i */
    public class C11368i extends nmg {

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ wzh f43170f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ FeedQaTwoOptionTopicItem f43171g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C11368i(int i, int i2, wzh wzhVar, FeedQaTwoOptionTopicItem feedQaTwoOptionTopicItem) {
            super(i, i2);
            this.f43170f = wzhVar;
            this.f43171g = feedQaTwoOptionTopicItem;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: i */
        public /* synthetic */ void m66075i(wzh wzhVar, FeedQaTwoOptionTopicItem feedQaTwoOptionTopicItem, ValueAnimator valueAnimator) {
            QATopicTowOptionVoteView.this.m66066p0(wzhVar.m206282c(), ((Integer) valueAnimator.getAnimatedValue()).intValue(), feedQaTwoOptionTopicItem);
        }

        @Override // p149l.lmg
        /* JADX INFO: renamed from: a */
        public void mo66069a(boolean z) {
            super.mo66069a(z);
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(m150583c(true), m150583c(false));
            valueAnimatorOfInt.setDuration(200L);
            valueAnimatorOfInt.addListener(this);
            final wzh wzhVar = this.f43170f;
            final FeedQaTwoOptionTopicItem feedQaTwoOptionTopicItem = this.f43171g;
            valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.hmb0
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    this.f108409a.m66075i(wzhVar, feedQaTwoOptionTopicItem, valueAnimator);
                }
            });
            valueAnimatorOfInt.start();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.topic.qatopic.QATopicTowOptionVoteView$j */
    public class C11369j extends nmg {

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ wzh f43173f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C11369j(int i, int i2, wzh wzhVar) {
            super(i, i2);
            this.f43173f = wzhVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: i */
        public /* synthetic */ void m66077i(wzh wzhVar, ValueAnimator valueAnimator) {
            xdl0.m208327D0(((Integer) valueAnimator.getAnimatedValue()).intValue(), QATopicTowOptionVoteView.this.m66057Z(wzhVar.m206282c()));
        }

        @Override // p149l.lmg
        /* JADX INFO: renamed from: a */
        public void mo66069a(boolean z) {
            super.mo66069a(z);
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(m150583c(true), m150583c(false));
            valueAnimatorOfInt.setDuration(200L);
            valueAnimatorOfInt.addListener(this);
            final wzh wzhVar = this.f43173f;
            valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.imb0
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    this.f113907a.m66077i(wzhVar, valueAnimator);
                }
            });
            valueAnimatorOfInt.start();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.topic.qatopic.QATopicTowOptionVoteView$k */
    public class C11370k extends nmg {

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ FeedQaTwoOptionTopicItem f43175f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C11370k(int i, int i2, FeedQaTwoOptionTopicItem feedQaTwoOptionTopicItem) {
            super(i, i2);
            this.f43175f = feedQaTwoOptionTopicItem;
        }

        @Override // p149l.lmg
        /* JADX INFO: renamed from: a */
        public void mo66069a(boolean z) {
            super.mo66069a(z);
            ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(this.f43175f.f43077b, "textColor", m150583c(true), m150583c(false));
            objectAnimatorOfInt.setDuration(200L);
            objectAnimatorOfInt.addListener(this);
            objectAnimatorOfInt.setEvaluator(new ArgbEvaluator());
            objectAnimatorOfInt.start();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.topic.qatopic.QATopicTowOptionVoteView$l */
    public class C11371l extends nmg {

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ wzh f43177f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C11371l(int i, int i2, wzh wzhVar) {
            super(i, i2);
            this.f43177f = wzhVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: i */
        public /* synthetic */ void m66079i(wzh wzhVar, ValueAnimator valueAnimator) {
            xdl0.m208327D0(((Integer) valueAnimator.getAnimatedValue()).intValue(), QATopicTowOptionVoteView.this.m66057Z(wzhVar.m206282c()));
        }

        @Override // p149l.lmg
        /* JADX INFO: renamed from: a */
        public void mo66069a(boolean z) {
            super.mo66069a(z);
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(m150583c(true), m150583c(false));
            valueAnimatorOfInt.setDuration(200L);
            valueAnimatorOfInt.addListener(this);
            final wzh wzhVar = this.f43177f;
            valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.jmb0
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    this.f118624a.m66079i(wzhVar, valueAnimator);
                }
            });
            valueAnimatorOfInt.start();
        }
    }

    public QATopicTowOptionVoteView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f43145o = new HashMap();
        this.f43148r = -1;
        this.f43149s = t100.m186890d(12.0f);
        this.f43150t = t100.m186890d(12.0f) * 2;
        this.f43151u = new HashMap();
        mo65961K(context);
    }

    /* JADX INFO: renamed from: b0 */
    private String m66046b0(int i, int i2) {
        double dM66047c0 = m66047c0(i, i2);
        return dM66047c0 == FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE ? "0%" : new DecimalFormat("##%").format(dM66047c0);
    }

    /* JADX INFO: renamed from: c0 */
    private double m66047c0(int i, int i2) {
        return i2 == 0 ? FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE : (((double) i) * 1.0d) / (((double) i2) * 1.0d);
    }

    /* JADX INFO: renamed from: f0 */
    private int m66048f0(int i, int i2) {
        return (int) Math.round(((double) (this.f43148r - this.f43150t)) * m66049g0(i, i2));
    }

    /* JADX INFO: renamed from: g0 */
    private double m66049g0(int i, int i2) {
        return (((double) i) * 1.0d) / (((double) i2) * 1.0d);
    }

    @Override // com.p046p1.mobile.putong.feed.newui.topic.qatopic.FeedQaTopicVoteListGroupView
    /* JADX INFO: renamed from: C */
    public void mo65957C(wzh wzhVar) {
        FeedQaTwoOptionTopicItem feedQaTwoOptionTopicItem = (FeedQaTwoOptionTopicItem) m65956B(wzhVar);
        m66055X(feedQaTwoOptionTopicItem.f43076a, 8);
        feedQaTwoOptionTopicItem.f43077b.setTextColor(FeedModule.f38852a.getResources().getColor(e1c0.f88749D));
        m66057Z(wzhVar.m206282c()).setBackgroundResource(f3c0.f94469Z3);
        feedQaTwoOptionTopicItem.f43078c.setTextColor(FeedModule.f38852a.getResources().getColor(e1c0.f88749D));
        xdl0.m208327D0(m66048f0(wzhVar.m206281b(), wzhVar.m206280a()), m66057Z(wzhVar.m206282c()));
        feedQaTwoOptionTopicItem.f43078c.setText(m66046b0(wzhVar.m206281b(), wzhVar.m206280a()));
        xdl0.m208327D0(-2, feedQaTwoOptionTopicItem.f43078c);
        m66066p0(wzhVar.m206282c(), m66059e0(wzhVar), feedQaTwoOptionTopicItem);
    }

    @Override // com.p046p1.mobile.putong.feed.newui.topic.qatopic.FeedQaTopicVoteListGroupView
    /* JADX INFO: renamed from: E */
    public void mo65958E(wzh wzhVar) {
        FeedQaTwoOptionTopicItem feedQaTwoOptionTopicItem = (FeedQaTwoOptionTopicItem) m65956B(wzhVar);
        m66055X(feedQaTwoOptionTopicItem.f43076a, 8);
        feedQaTwoOptionTopicItem.f43078c.setText(m66046b0(wzhVar.m206281b(), wzhVar.m206280a()));
        feedQaTwoOptionTopicItem.f43077b.setTextColor(Color.parseColor("#66000000"));
        m66057Z(wzhVar.m206282c()).setBackgroundResource(0);
        feedQaTwoOptionTopicItem.f43078c.setTextColor(Color.parseColor("#66000000"));
        xdl0.m208327D0(m66048f0(wzhVar.m206281b(), wzhVar.m206280a()) + t100.m186890d(36.0f), m66057Z(wzhVar.m206282c()));
        xdl0.m208327D0(-2, feedQaTwoOptionTopicItem.f43078c);
        m66057Z(wzhVar.m206282c()).setBackgroundResource(f3c0.f94455X3);
        m66066p0(wzhVar.m206282c(), m66059e0(wzhVar), feedQaTwoOptionTopicItem);
    }

    @Override // com.p046p1.mobile.putong.feed.newui.topic.qatopic.FeedQaTopicVoteListGroupView
    /* JADX INFO: renamed from: G */
    public void mo65960G(wzh wzhVar) {
        FeedQaTwoOptionTopicItem feedQaTwoOptionTopicItem = (FeedQaTwoOptionTopicItem) m65956B(wzhVar);
        m66057Z(wzhVar.m206282c()).setBackgroundResource(f3c0.f94455X3);
        xdl0.m208327D0(getNoVoteBgWidth(), m66057Z(wzhVar.m206282c()));
        this.f43139i.setBackgroundResource(0);
        xdl0.m208327D0(1, feedQaTwoOptionTopicItem.f43078c);
        feedQaTwoOptionTopicItem.f43077b.setTextColor(FeedModule.f38852a.getResources().getColor(e1c0.f88780e));
        m66055X(feedQaTwoOptionTopicItem.f43076a, 0);
        m66066p0(wzhVar.m206282c(), 0, feedQaTwoOptionTopicItem);
    }

    @Override // com.p046p1.mobile.putong.feed.newui.topic.qatopic.FeedQaTopicVoteListGroupView
    /* JADX INFO: renamed from: K */
    public void mo65961K(Context context) {
        super.mo65961K(context);
        addView(m66050R(LayoutInflater.from(context), this));
        this.f43134d.setIsViewIsSelect(new w9j() { // from class: l.cmb0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f81521a.m66062k0((Integer) obj);
            }
        });
        m66060h0();
    }

    /* JADX INFO: renamed from: R */
    public View m66050R(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return kmb0.m146490b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: S */
    public void m66051S(wzh wzhVar, FeedQaTwoOptionTopicItem feedQaTwoOptionTopicItem, lmg lmgVar) {
        m65956B(wzhVar).f43078c.measure(0, 0);
        C11364e c11364e = new C11364e(1, m65956B(wzhVar).f43078c.getMeasuredWidth(), feedQaTwoOptionTopicItem);
        C11365f c11365f = new C11365f(0, 1, feedQaTwoOptionTopicItem);
        C11366g c11366g = new C11366g(t100.m186890d(24.0f), 0, feedQaTwoOptionTopicItem);
        lmgVar.m150587g(c11364e).m150584d(c11365f).m150587g(c11366g).m150587g(new C11367h(1, 0, wzhVar, feedQaTwoOptionTopicItem));
    }

    /* JADX INFO: renamed from: T */
    public lmg m66052T(wzh wzhVar, FeedQaTwoOptionTopicItem feedQaTwoOptionTopicItem, nmg nmgVar) {
        feedQaTwoOptionTopicItem.f43076a.setVisibility(8);
        return nmgVar.m150587g(new C11370k(Color.parseColor("#cc000000"), Color.parseColor("#66000000"), feedQaTwoOptionTopicItem)).m150587g(new C11369j(getNoVoteBgWidth(), m66048f0(wzhVar.m206281b(), wzhVar.m206280a()) + t100.m186890d(36.0f), wzhVar)).m150587g(new C11368i(0, m66059e0(wzhVar), wzhVar, feedQaTwoOptionTopicItem));
    }

    /* JADX INFO: renamed from: V */
    public lmg m66053V(wzh wzhVar, FeedQaTwoOptionTopicItem feedQaTwoOptionTopicItem, boolean z, nmg nmgVar) {
        C11371l c11371l = new C11371l(getNoVoteBgWidth(), m66048f0(z ? wzhVar.m206281b() + 1 : wzhVar.m206281b(), z ? wzhVar.m206280a() + 1 : wzhVar.m206280a()), wzhVar);
        return nmgVar.m150587g(c11371l).m150587g(new C11361b(Color.parseColor("#f7f7f8"), Color.parseColor("#ffe5d2"), wzhVar)).m150587g(new C11362c(Color.parseColor("#cc000000"), Color.parseColor("#fe7e1d"), feedQaTwoOptionTopicItem)).m150587g(new C11360a(0, m66059e0(wzhVar), wzhVar, feedQaTwoOptionTopicItem));
    }

    /* JADX INFO: renamed from: W */
    public void m66054W(wzh wzhVar, FeedQaTwoOptionTopicItem feedQaTwoOptionTopicItem) {
        feedQaTwoOptionTopicItem.f43078c.setText(m66046b0(wzhVar.m206281b(), wzhVar.m206280a()));
    }

    /* JADX INFO: renamed from: X */
    public void m66055X(View view, int i) {
        view.setVisibility(i);
        if (view == this.f43141k.f43076a) {
            this.f43137g.f43076a.setVisibility(i);
        } else {
            this.f43138h.f43076a.setVisibility(i);
        }
    }

    /* JADX INFO: renamed from: Y */
    public int m66056Y(wzh wzhVar, FeedQaTwoOptionTopicItem feedQaTwoOptionTopicItem, boolean z) {
        if (this.f43151u.get(feedQaTwoOptionTopicItem) == null) {
            return !wzhVar.m206288i() ? 1 : 0;
        }
        FeedQaItemVoteStatus feedQaItemVoteStatus = this.f43151u.get(feedQaTwoOptionTopicItem);
        FeedQaItemVoteStatus feedQaItemVoteStatus2 = FeedQaItemVoteStatus.NO_VOTE;
        if ((feedQaItemVoteStatus == feedQaItemVoteStatus2 && wzhVar.m206288i()) || (z && wzhVar.m206287h())) {
            return 0;
        }
        return (this.f43151u.get(feedQaTwoOptionTopicItem) == FeedQaItemVoteStatus.HAVE_VOTE_NOT_BE_VOTING || (this.f43151u.get(feedQaTwoOptionTopicItem) == feedQaItemVoteStatus2 && !wzhVar.m206288i())) ? 1 : 0;
    }

    /* JADX INFO: renamed from: Z */
    public View m66057Z(int i) {
        return i == 0 ? this.f43135e : this.f43136f;
    }

    /* JADX INFO: renamed from: a0 */
    public View m66058a0(int i) {
        return i == 0 ? this.f43137g.f43076a : this.f43138h.f43076a;
    }

    /* JADX INFO: renamed from: e0 */
    public int m66059e0(wzh wzhVar) {
        FeedQaTwoOptionTopicItem feedQaTwoOptionTopicItemM65956B = m65956B(wzhVar);
        ViewGroup viewGroup = (ViewGroup) feedQaTwoOptionTopicItemM65956B.getParent();
        feedQaTwoOptionTopicItemM65956B.measure(0, 0);
        int iM186890d = feedQaTwoOptionTopicItemM65956B.f43076a.getVisibility() == 0 ? t100.m186890d(20.0f) : 0;
        if (feedQaTwoOptionTopicItemM65956B.f43078c.getWidth() == 1) {
            feedQaTwoOptionTopicItemM65956B.f43078c.measure(0, 0);
            iM186890d -= feedQaTwoOptionTopicItemM65956B.f43078c.getMeasuredWidth();
        }
        return Math.max(((viewGroup.getWidth() - feedQaTwoOptionTopicItemM65956B.getMeasuredWidth()) + iM186890d) / 2, 0);
    }

    @Override // com.p046p1.mobile.putong.feed.newui.topic.qatopic.FeedQaTopicVoteListGroupView
    public int getAnimTime() {
        return 400;
    }

    public int getNoVoteBgWidth() {
        return ((this.f43148r - this.f43149s) - this.f43150t) / 2;
    }

    @Override // com.p046p1.mobile.putong.feed.newui.topic.qatopic.FeedQaTopicVoteListGroupView
    public List<FeedQaTwoOptionTopicItem> getQaTopicVoteViewList() {
        if (this.f43146p == null) {
            ArrayList arrayList = new ArrayList();
            this.f43146p = arrayList;
            arrayList.add(this.f43141k);
            this.f43146p.add(this.f43144n);
        }
        return this.f43146p;
    }

    public int getRadius() {
        return t100.m186890d(14.0f);
    }

    @Override // com.p046p1.mobile.putong.feed.newui.topic.qatopic.FeedQaTopicVoteListGroupView
    public View getView() {
        return this;
    }

    @Override // com.p046p1.mobile.putong.feed.newui.topic.qatopic.FeedQaTopicVoteListGroupView
    public View getVoteListContainer() {
        return this.f43139i;
    }

    @Override // com.p046p1.mobile.putong.feed.newui.topic.qatopic.FeedQaTopicVoteListGroupView
    public List<View> getVoteViewContainerList() {
        if (this.f43147q == null) {
            ArrayList arrayList = new ArrayList();
            this.f43147q = arrayList;
            arrayList.add(this.f43140j);
            this.f43147q.add(this.f43143m);
        }
        return this.f43147q;
    }

    /* JADX INFO: renamed from: h0 */
    public final void m66060h0() {
        m66055X(this.f43137g.f43076a, 8);
        m66055X(this.f43138h.f43076a, 8);
        this.f43137g.f43076a.setImageResource(f3c0.f94501d4);
        this.f43138h.f43076a.setImageResource(f3c0.f94509e4);
    }

    /* JADX INFO: renamed from: j0 */
    public final /* synthetic */ void m66061j0(wzh wzhVar) {
        super.mo65970z(wzhVar);
    }

    /* JADX INFO: renamed from: k0 */
    public final /* synthetic */ Boolean m66062k0(Integer num) {
        return Boolean.valueOf(this.f43151u.get(this.f43146p.get(num.intValue())) == FeedQaItemVoteStatus.HAVE_VOTE_BE_VOTING);
    }

    @Override // com.p046p1.mobile.putong.feed.newui.topic.qatopic.FeedQaTopicVoteListGroupView
    /* JADX INFO: renamed from: l0, reason: merged with bridge method [inline-methods] */
    public void mo65964N(FeedQaTwoOptionTopicItem feedQaTwoOptionTopicItem, FeedQaItemVoteStatus feedQaItemVoteStatus) {
        this.f43151u.put(feedQaTwoOptionTopicItem, feedQaItemVoteStatus);
    }

    /* JADX INFO: renamed from: m0 */
    public void m66064m0(wzh wzhVar, int i, lmg[] lmgVarArr, lmg lmgVar) {
        if (lmgVarArr != null) {
            lmgVarArr[i] = lmgVar;
            this.f43145o.put(Integer.valueOf(wzhVar.m206282c()), lmgVarArr);
        } else {
            lmg[] lmgVarArr2 = new lmg[2];
            lmgVarArr2[i] = lmgVar;
            this.f43145o.put(Integer.valueOf(wzhVar.m206282c()), lmgVarArr2);
        }
    }

    /* JADX INFO: renamed from: o0 */
    public final void m66065o0(wzh wzhVar) {
        if (wzhVar.m206282c() == 0) {
            this.f43137g.f43077b.setVisibility(4);
            this.f43137g.f43077b.setText(wzhVar.m206283d());
        } else {
            this.f43138h.f43077b.setVisibility(4);
            this.f43138h.f43077b.setText(wzhVar.m206283d());
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.f43148r = View.MeasureSpec.getSize(i);
    }

    /* JADX INFO: renamed from: p0 */
    public void m66066p0(int i, int i2, View view) {
        if (i == 0) {
            xdl0.m208359W(view, i2);
        } else {
            xdl0.m208358V(view, i2);
        }
    }

    /* JADX INFO: renamed from: q0 */
    public void m66067q0(wzh wzhVar, FeedQaTwoOptionTopicItem feedQaTwoOptionTopicItem) {
        if (wzhVar.m206288i()) {
            feedQaTwoOptionTopicItem.f43078c.setTextColor(Color.parseColor("#fe7e1d"));
        } else {
            feedQaTwoOptionTopicItem.f43078c.setTextColor(Color.parseColor("#66000000"));
        }
    }

    @Override // com.p046p1.mobile.putong.feed.newui.topic.qatopic.FeedQaTopicVoteListGroupView
    /* JADX INFO: renamed from: v */
    public void mo65968v(wzh wzhVar) {
        FeedQaTwoOptionTopicItem feedQaTwoOptionTopicItemM65956B = m65956B(wzhVar);
        m66054W(wzhVar, feedQaTwoOptionTopicItemM65956B);
        boolean z = this.f43151u.get(feedQaTwoOptionTopicItemM65956B) == FeedQaItemVoteStatus.HAVE_VOTE_BE_VOTING;
        int iM66056Y = m66056Y(wzhVar, feedQaTwoOptionTopicItemM65956B, z);
        lmg[] lmgVarArr = this.f43145o.get(Integer.valueOf(wzhVar.m206282c()));
        lmg lmgVar = (lmgVarArr == null || lmgVarArr.length <= iM66056Y) ? null : lmgVarArr[iM66056Y];
        if (lmgVar != null) {
            lmgVar.m150585e(wzhVar.m206287h());
            return;
        }
        nmg c11363d = new C11363d(1, 0, wzhVar);
        m66064m0(wzhVar, iM66056Y, lmgVarArr, c11363d);
        m66051S(wzhVar, feedQaTwoOptionTopicItemM65956B, (wzhVar.m206288i() || z) ? m66053V(wzhVar, feedQaTwoOptionTopicItemM65956B, z, c11363d) : m66052T(wzhVar, feedQaTwoOptionTopicItemM65956B, c11363d));
        c11363d.m150585e(wzhVar.m206287h());
    }

    @Override // com.p046p1.mobile.putong.feed.newui.topic.qatopic.FeedQaTopicVoteListGroupView
    /* JADX INFO: renamed from: z */
    public void mo65970z(final wzh wzhVar) {
        if (this.f43148r == -1) {
            post(new Runnable() { // from class: l.dmb0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f86913a.m66061j0(wzhVar);
                }
            });
        } else {
            super.mo65970z(wzhVar);
        }
        FeedQaTwoOptionTopicItem feedQaTwoOptionTopicItemM65956B = m65956B(wzhVar);
        feedQaTwoOptionTopicItemM65956B.f43077b.setText(wzhVar.m206283d());
        if (!wzhVar.m206287h()) {
            m66067q0(wzhVar, feedQaTwoOptionTopicItemM65956B);
        }
        m66065o0(wzhVar);
    }

    public QATopicTowOptionVoteView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f43145o = new HashMap();
        this.f43148r = -1;
        this.f43149s = t100.m186890d(12.0f);
        this.f43150t = t100.m186890d(12.0f) * 2;
        this.f43151u = new HashMap();
        mo65961K(context);
    }

    public QATopicTowOptionVoteView(Context context, String str) {
        super(context, str);
        this.f43145o = new HashMap();
        this.f43148r = -1;
        this.f43149s = t100.m186890d(12.0f);
        this.f43150t = t100.m186890d(12.0f) * 2;
        this.f43151u = new HashMap();
    }

    public QATopicTowOptionVoteView(Context context) {
        super(context);
        this.f43145o = new HashMap();
        this.f43148r = -1;
        this.f43149s = t100.m186890d(12.0f);
        this.f43150t = t100.m186890d(12.0f) * 2;
        this.f43151u = new HashMap();
    }
}
