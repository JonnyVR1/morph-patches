package com.p051p1.mobile.putong.feed.newui.topic.qatopic;

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
import com.p051p1.mobile.putong.feed.FeedModule;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p151v.VFrame;
import p153l.aog;
import p153l.bnl0;
import p153l.bog;
import p153l.cog;
import p153l.k9c0;
import p153l.l1i;
import p153l.lbc0;
import p153l.oub0;
import p153l.qa00;
import p153l.qcj;

/* JADX INFO: loaded from: classes13.dex */
public class QATopicTowOptionVoteView extends FeedQaTopicVoteListGroupView<FeedQaTwoOptionTopicItem> {

    /* JADX INFO: renamed from: c */
    public VFrame f43981c;

    /* JADX INFO: renamed from: d */
    public FeedQaBgRelativeLayout f43982d;

    /* JADX INFO: renamed from: e */
    public View f43983e;

    /* JADX INFO: renamed from: f */
    public View f43984f;

    /* JADX INFO: renamed from: g */
    public FeedQaTwoOptionTopicItem f43985g;

    /* JADX INFO: renamed from: h */
    public FeedQaTwoOptionTopicItem f43986h;

    /* JADX INFO: renamed from: i */
    public LinearLayout f43987i;

    /* JADX INFO: renamed from: j */
    public FrameLayout f43988j;

    /* JADX INFO: renamed from: k */
    public FeedQaTwoOptionTopicItem f43989k;

    /* JADX INFO: renamed from: l */
    public View f43990l;

    /* JADX INFO: renamed from: m */
    public FrameLayout f43991m;

    /* JADX INFO: renamed from: n */
    public FeedQaTwoOptionTopicItem f43992n;

    /* JADX INFO: renamed from: o */
    public Map<Integer, aog[]> f43993o;

    /* JADX INFO: renamed from: p */
    public List<FeedQaTwoOptionTopicItem> f43994p;

    /* JADX INFO: renamed from: q */
    public List<View> f43995q;

    /* JADX INFO: renamed from: r */
    public int f43996r;

    /* JADX INFO: renamed from: s */
    public int f43997s;

    /* JADX INFO: renamed from: t */
    public int f43998t;

    /* JADX INFO: renamed from: u */
    public Map<View, FeedQaItemVoteStatus> f43999u;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.topic.qatopic.QATopicTowOptionVoteView$a */
    public class C11523a extends cog {

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ l1i f44000f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ FeedQaTwoOptionTopicItem f44001g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C11523a(int i, int i2, l1i l1iVar, FeedQaTwoOptionTopicItem feedQaTwoOptionTopicItem) {
            super(i, i2);
            this.f44000f = l1iVar;
            this.f44001g = feedQaTwoOptionTopicItem;
        }

        @Override // p153l.aog
        /* JADX INFO: renamed from: a */
        public void mo67252a(boolean z) {
            super.mo67252a(z);
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(m99074c(true), m99074c(false));
            valueAnimatorOfInt.setDuration(200L);
            valueAnimatorOfInt.addListener(this);
            final l1i l1iVar = this.f44000f;
            final FeedQaTwoOptionTopicItem feedQaTwoOptionTopicItem = this.f44001g;
            valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.iub0
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    this.f116915a.m67253i(l1iVar, feedQaTwoOptionTopicItem, valueAnimator);
                }
            });
            valueAnimatorOfInt.start();
        }

        /* JADX INFO: renamed from: i */
        public final /* synthetic */ void m67253i(l1i l1iVar, FeedQaTwoOptionTopicItem feedQaTwoOptionTopicItem, ValueAnimator valueAnimator) {
            QATopicTowOptionVoteView.this.m67249p0(l1iVar.m152489c(), ((Integer) valueAnimator.getAnimatedValue()).intValue(), feedQaTwoOptionTopicItem);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.topic.qatopic.QATopicTowOptionVoteView$b */
    public class C11524b extends cog {

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ l1i f44003f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C11524b(int i, int i2, l1i l1iVar) {
            super(i, i2);
            this.f44003f = l1iVar;
        }

        @Override // p153l.aog
        /* JADX INFO: renamed from: a */
        public void mo67252a(boolean z) {
            super.mo67252a(z);
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(m99074c(true), m99074c(false));
            valueAnimatorOfInt.setDuration(200L);
            valueAnimatorOfInt.addListener(this);
            valueAnimatorOfInt.setEvaluator(new ArgbEvaluator());
            final l1i l1iVar = this.f44003f;
            valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.jub0
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    this.f122698a.m67255i(l1iVar, valueAnimator);
                }
            });
            valueAnimatorOfInt.start();
        }

        /* JADX INFO: renamed from: i */
        public final /* synthetic */ void m67255i(l1i l1iVar, ValueAnimator valueAnimator) {
            float radius = QATopicTowOptionVoteView.this.getRadius();
            ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{radius, radius, radius, radius, radius, radius, radius, radius}, null, null));
            shapeDrawable.getPaint().setStyle(Paint.Style.FILL);
            shapeDrawable.getPaint().setColor(((Integer) valueAnimator.getAnimatedValue()).intValue());
            QATopicTowOptionVoteView.this.m67240Z(l1iVar.m152489c()).setBackground(shapeDrawable);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.topic.qatopic.QATopicTowOptionVoteView$c */
    public class C11525c extends cog {

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ FeedQaTwoOptionTopicItem f44005f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C11525c(int i, int i2, FeedQaTwoOptionTopicItem feedQaTwoOptionTopicItem) {
            super(i, i2);
            this.f44005f = feedQaTwoOptionTopicItem;
        }

        @Override // p153l.aog
        /* JADX INFO: renamed from: a */
        public void mo67252a(boolean z) {
            super.mo67252a(z);
            ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(this.f44005f.f43925b, "textColor", m99074c(true), m99074c(false));
            objectAnimatorOfInt.setDuration(200L);
            objectAnimatorOfInt.addListener(this);
            objectAnimatorOfInt.setEvaluator(new ArgbEvaluator());
            objectAnimatorOfInt.start();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.topic.qatopic.QATopicTowOptionVoteView$d */
    public class C11526d extends cog {

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ l1i f44007f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C11526d(int i, int i2, l1i l1iVar) {
            super(i, i2);
            this.f44007f = l1iVar;
        }

        @Override // p153l.aog
        /* JADX INFO: renamed from: a */
        public void mo67252a(boolean z) {
            super.mo67252a(z);
            if (m99074c(true) == 1) {
                QATopicTowOptionVoteView.this.m67241a0(this.f44007f.m152489c()).setVisibility(8);
            }
            onAnimationStart(null, false);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.topic.qatopic.QATopicTowOptionVoteView$e */
    public class C11527e extends cog {

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ FeedQaTwoOptionTopicItem f44009f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C11527e(int i, int i2, FeedQaTwoOptionTopicItem feedQaTwoOptionTopicItem) {
            super(i, i2);
            this.f44009f = feedQaTwoOptionTopicItem;
        }

        @Override // p153l.aog
        /* JADX INFO: renamed from: a */
        public void mo67252a(boolean z) {
            super.mo67252a(z);
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(m99074c(true), m99074c(false));
            valueAnimatorOfInt.setDuration(120L);
            valueAnimatorOfInt.addListener(this);
            final FeedQaTwoOptionTopicItem feedQaTwoOptionTopicItem = this.f44009f;
            valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.kub0
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    bnl0.m105507D0(((Integer) valueAnimator.getAnimatedValue()).intValue(), feedQaTwoOptionTopicItem.f43926c);
                }
            });
            valueAnimatorOfInt.start();
        }

        @Override // p153l.cog, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator, boolean z) {
            super.onAnimationStart(animator, z);
            if (m99074c(true) == 1) {
                this.f44009f.f43926c.setTranslationY(qa00.m175859d(24.0f));
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.topic.qatopic.QATopicTowOptionVoteView$f */
    public class C11528f extends bog {

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ FeedQaTwoOptionTopicItem f44011f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C11528f(int i, int i2, FeedQaTwoOptionTopicItem feedQaTwoOptionTopicItem) {
            super(i, i2);
            this.f44011f = feedQaTwoOptionTopicItem;
        }

        @Override // p153l.aog
        /* JADX INFO: renamed from: a */
        public void mo67252a(boolean z) {
            super.mo67252a(z);
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f44011f.f43926c, "alpha", m99074c(true), m99074c(false));
            objectAnimatorOfFloat.addListener(this);
            objectAnimatorOfFloat.setDuration(120L);
            objectAnimatorOfFloat.start();
        }

        @Override // p153l.bog, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator, boolean z) {
            if (m99074c(true) == 0) {
                super.onAnimationEnd(animator, z);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (m99074c(true) == 1) {
                m99073b();
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.topic.qatopic.QATopicTowOptionVoteView$g */
    public class C11529g extends cog {

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ FeedQaTwoOptionTopicItem f44013f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C11529g(int i, int i2, FeedQaTwoOptionTopicItem feedQaTwoOptionTopicItem) {
            super(i, i2);
            this.f44013f = feedQaTwoOptionTopicItem;
        }

        @Override // p153l.aog
        /* JADX INFO: renamed from: a */
        public void mo67252a(boolean z) {
            super.mo67252a(z);
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f44013f.f43926c, "translationY", m99074c(true), m99074c(false));
            objectAnimatorOfFloat.addListener(this);
            objectAnimatorOfFloat.setDuration(120L);
            objectAnimatorOfFloat.start();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.topic.qatopic.QATopicTowOptionVoteView$h */
    public class C11530h extends cog {

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ l1i f44015f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ FeedQaTwoOptionTopicItem f44016g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C11530h(int i, int i2, l1i l1iVar, FeedQaTwoOptionTopicItem feedQaTwoOptionTopicItem) {
            super(i, i2);
            this.f44015f = l1iVar;
            this.f44016g = feedQaTwoOptionTopicItem;
        }

        @Override // p153l.aog
        /* JADX INFO: renamed from: a */
        public void mo67252a(boolean z) {
            super.mo67252a(z);
            int iM99074c = m99074c(true);
            QATopicTowOptionVoteView qATopicTowOptionVoteView = QATopicTowOptionVoteView.this;
            if (iM99074c != 0) {
                qATopicTowOptionVoteView.m67238X(this.f44016g.f43924a, 8);
                onAnimationStart(null);
                return;
            }
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(qATopicTowOptionVoteView.m67241a0(this.f44015f.m152489c()), "alpha", m99074c(true), m99074c(false));
            objectAnimatorOfFloat.addListener(this);
            objectAnimatorOfFloat.setDuration(200L);
            QATopicTowOptionVoteView.this.m67238X(this.f44016g.f43924a, 0);
            objectAnimatorOfFloat.start();
        }

        @Override // p153l.cog, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator, boolean z) {
            super.onAnimationStart(animator, z);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.topic.qatopic.QATopicTowOptionVoteView$i */
    public class C11531i extends cog {

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ l1i f44018f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ FeedQaTwoOptionTopicItem f44019g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C11531i(int i, int i2, l1i l1iVar, FeedQaTwoOptionTopicItem feedQaTwoOptionTopicItem) {
            super(i, i2);
            this.f44018f = l1iVar;
            this.f44019g = feedQaTwoOptionTopicItem;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: i */
        public /* synthetic */ void m67258i(l1i l1iVar, FeedQaTwoOptionTopicItem feedQaTwoOptionTopicItem, ValueAnimator valueAnimator) {
            QATopicTowOptionVoteView.this.m67249p0(l1iVar.m152489c(), ((Integer) valueAnimator.getAnimatedValue()).intValue(), feedQaTwoOptionTopicItem);
        }

        @Override // p153l.aog
        /* JADX INFO: renamed from: a */
        public void mo67252a(boolean z) {
            super.mo67252a(z);
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(m99074c(true), m99074c(false));
            valueAnimatorOfInt.setDuration(200L);
            valueAnimatorOfInt.addListener(this);
            final l1i l1iVar = this.f44018f;
            final FeedQaTwoOptionTopicItem feedQaTwoOptionTopicItem = this.f44019g;
            valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.lub0
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    this.f133617a.m67258i(l1iVar, feedQaTwoOptionTopicItem, valueAnimator);
                }
            });
            valueAnimatorOfInt.start();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.topic.qatopic.QATopicTowOptionVoteView$j */
    public class C11532j extends cog {

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ l1i f44021f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C11532j(int i, int i2, l1i l1iVar) {
            super(i, i2);
            this.f44021f = l1iVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: i */
        public /* synthetic */ void m67260i(l1i l1iVar, ValueAnimator valueAnimator) {
            bnl0.m105507D0(((Integer) valueAnimator.getAnimatedValue()).intValue(), QATopicTowOptionVoteView.this.m67240Z(l1iVar.m152489c()));
        }

        @Override // p153l.aog
        /* JADX INFO: renamed from: a */
        public void mo67252a(boolean z) {
            super.mo67252a(z);
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(m99074c(true), m99074c(false));
            valueAnimatorOfInt.setDuration(200L);
            valueAnimatorOfInt.addListener(this);
            final l1i l1iVar = this.f44021f;
            valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.mub0
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    this.f138760a.m67260i(l1iVar, valueAnimator);
                }
            });
            valueAnimatorOfInt.start();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.topic.qatopic.QATopicTowOptionVoteView$k */
    public class C11533k extends cog {

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ FeedQaTwoOptionTopicItem f44023f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C11533k(int i, int i2, FeedQaTwoOptionTopicItem feedQaTwoOptionTopicItem) {
            super(i, i2);
            this.f44023f = feedQaTwoOptionTopicItem;
        }

        @Override // p153l.aog
        /* JADX INFO: renamed from: a */
        public void mo67252a(boolean z) {
            super.mo67252a(z);
            ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(this.f44023f.f43925b, "textColor", m99074c(true), m99074c(false));
            objectAnimatorOfInt.setDuration(200L);
            objectAnimatorOfInt.addListener(this);
            objectAnimatorOfInt.setEvaluator(new ArgbEvaluator());
            objectAnimatorOfInt.start();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.topic.qatopic.QATopicTowOptionVoteView$l */
    public class C11534l extends cog {

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ l1i f44025f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C11534l(int i, int i2, l1i l1iVar) {
            super(i, i2);
            this.f44025f = l1iVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: i */
        public /* synthetic */ void m67262i(l1i l1iVar, ValueAnimator valueAnimator) {
            bnl0.m105507D0(((Integer) valueAnimator.getAnimatedValue()).intValue(), QATopicTowOptionVoteView.this.m67240Z(l1iVar.m152489c()));
        }

        @Override // p153l.aog
        /* JADX INFO: renamed from: a */
        public void mo67252a(boolean z) {
            super.mo67252a(z);
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(m99074c(true), m99074c(false));
            valueAnimatorOfInt.setDuration(200L);
            valueAnimatorOfInt.addListener(this);
            final l1i l1iVar = this.f44025f;
            valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.nub0
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    this.f143692a.m67262i(l1iVar, valueAnimator);
                }
            });
            valueAnimatorOfInt.start();
        }
    }

    public QATopicTowOptionVoteView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f43993o = new HashMap();
        this.f43996r = -1;
        this.f43997s = qa00.m175859d(12.0f);
        this.f43998t = qa00.m175859d(12.0f) * 2;
        this.f43999u = new HashMap();
        mo67144K(context);
    }

    /* JADX INFO: renamed from: b0 */
    private String m67229b0(int i, int i2) {
        double dM67230c0 = m67230c0(i, i2);
        return dM67230c0 == FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE ? "0%" : new DecimalFormat("##%").format(dM67230c0);
    }

    /* JADX INFO: renamed from: c0 */
    private double m67230c0(int i, int i2) {
        return i2 == 0 ? FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE : (((double) i) * 1.0d) / (((double) i2) * 1.0d);
    }

    /* JADX INFO: renamed from: f0 */
    private int m67231f0(int i, int i2) {
        return (int) Math.round(((double) (this.f43996r - this.f43998t)) * m67232g0(i, i2));
    }

    /* JADX INFO: renamed from: g0 */
    private double m67232g0(int i, int i2) {
        return (((double) i) * 1.0d) / (((double) i2) * 1.0d);
    }

    @Override // com.p051p1.mobile.putong.feed.newui.topic.qatopic.FeedQaTopicVoteListGroupView
    /* JADX INFO: renamed from: C */
    public void mo67140C(l1i l1iVar) {
        FeedQaTwoOptionTopicItem feedQaTwoOptionTopicItem = (FeedQaTwoOptionTopicItem) m67139B(l1iVar);
        m67238X(feedQaTwoOptionTopicItem.f43924a, 8);
        feedQaTwoOptionTopicItem.f43925b.setTextColor(FeedModule.f39700a.getResources().getColor(k9c0.f124472D));
        m67240Z(l1iVar.m152489c()).setBackgroundResource(lbc0.f130987Z3);
        feedQaTwoOptionTopicItem.f43926c.setTextColor(FeedModule.f39700a.getResources().getColor(k9c0.f124472D));
        bnl0.m105507D0(m67231f0(l1iVar.m152488b(), l1iVar.m152487a()), m67240Z(l1iVar.m152489c()));
        feedQaTwoOptionTopicItem.f43926c.setText(m67229b0(l1iVar.m152488b(), l1iVar.m152487a()));
        bnl0.m105507D0(-2, feedQaTwoOptionTopicItem.f43926c);
        m67249p0(l1iVar.m152489c(), m67242e0(l1iVar), feedQaTwoOptionTopicItem);
    }

    @Override // com.p051p1.mobile.putong.feed.newui.topic.qatopic.FeedQaTopicVoteListGroupView
    /* JADX INFO: renamed from: E */
    public void mo67141E(l1i l1iVar) {
        FeedQaTwoOptionTopicItem feedQaTwoOptionTopicItem = (FeedQaTwoOptionTopicItem) m67139B(l1iVar);
        m67238X(feedQaTwoOptionTopicItem.f43924a, 8);
        feedQaTwoOptionTopicItem.f43926c.setText(m67229b0(l1iVar.m152488b(), l1iVar.m152487a()));
        feedQaTwoOptionTopicItem.f43925b.setTextColor(Color.parseColor("#66000000"));
        m67240Z(l1iVar.m152489c()).setBackgroundResource(0);
        feedQaTwoOptionTopicItem.f43926c.setTextColor(Color.parseColor("#66000000"));
        bnl0.m105507D0(m67231f0(l1iVar.m152488b(), l1iVar.m152487a()) + qa00.m175859d(36.0f), m67240Z(l1iVar.m152489c()));
        bnl0.m105507D0(-2, feedQaTwoOptionTopicItem.f43926c);
        m67240Z(l1iVar.m152489c()).setBackgroundResource(lbc0.f130973X3);
        m67249p0(l1iVar.m152489c(), m67242e0(l1iVar), feedQaTwoOptionTopicItem);
    }

    @Override // com.p051p1.mobile.putong.feed.newui.topic.qatopic.FeedQaTopicVoteListGroupView
    /* JADX INFO: renamed from: G */
    public void mo67143G(l1i l1iVar) {
        FeedQaTwoOptionTopicItem feedQaTwoOptionTopicItem = (FeedQaTwoOptionTopicItem) m67139B(l1iVar);
        m67240Z(l1iVar.m152489c()).setBackgroundResource(lbc0.f130973X3);
        bnl0.m105507D0(getNoVoteBgWidth(), m67240Z(l1iVar.m152489c()));
        this.f43987i.setBackgroundResource(0);
        bnl0.m105507D0(1, feedQaTwoOptionTopicItem.f43926c);
        feedQaTwoOptionTopicItem.f43925b.setTextColor(FeedModule.f39700a.getResources().getColor(k9c0.f124503e));
        m67238X(feedQaTwoOptionTopicItem.f43924a, 0);
        m67249p0(l1iVar.m152489c(), 0, feedQaTwoOptionTopicItem);
    }

    @Override // com.p051p1.mobile.putong.feed.newui.topic.qatopic.FeedQaTopicVoteListGroupView
    /* JADX INFO: renamed from: K */
    public void mo67144K(Context context) {
        super.mo67144K(context);
        addView(m67233R(LayoutInflater.from(context), this));
        this.f43982d.setIsViewIsSelect(new qcj() { // from class: l.gub0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f106481a.m67245k0((Integer) obj);
            }
        });
        m67243h0();
    }

    /* JADX INFO: renamed from: R */
    public View m67233R(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return oub0.m169284b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: S */
    public void m67234S(l1i l1iVar, FeedQaTwoOptionTopicItem feedQaTwoOptionTopicItem, aog aogVar) {
        m67139B(l1iVar).f43926c.measure(0, 0);
        C11527e c11527e = new C11527e(1, m67139B(l1iVar).f43926c.getMeasuredWidth(), feedQaTwoOptionTopicItem);
        C11528f c11528f = new C11528f(0, 1, feedQaTwoOptionTopicItem);
        C11529g c11529g = new C11529g(qa00.m175859d(24.0f), 0, feedQaTwoOptionTopicItem);
        aogVar.m99078g(c11527e).m99075d(c11528f).m99078g(c11529g).m99078g(new C11530h(1, 0, l1iVar, feedQaTwoOptionTopicItem));
    }

    /* JADX INFO: renamed from: T */
    public aog m67235T(l1i l1iVar, FeedQaTwoOptionTopicItem feedQaTwoOptionTopicItem, cog cogVar) {
        feedQaTwoOptionTopicItem.f43924a.setVisibility(8);
        return cogVar.m99078g(new C11533k(Color.parseColor("#cc000000"), Color.parseColor("#66000000"), feedQaTwoOptionTopicItem)).m99078g(new C11532j(getNoVoteBgWidth(), m67231f0(l1iVar.m152488b(), l1iVar.m152487a()) + qa00.m175859d(36.0f), l1iVar)).m99078g(new C11531i(0, m67242e0(l1iVar), l1iVar, feedQaTwoOptionTopicItem));
    }

    /* JADX INFO: renamed from: V */
    public aog m67236V(l1i l1iVar, FeedQaTwoOptionTopicItem feedQaTwoOptionTopicItem, boolean z, cog cogVar) {
        C11534l c11534l = new C11534l(getNoVoteBgWidth(), m67231f0(z ? l1iVar.m152488b() + 1 : l1iVar.m152488b(), z ? l1iVar.m152487a() + 1 : l1iVar.m152487a()), l1iVar);
        return cogVar.m99078g(c11534l).m99078g(new C11524b(Color.parseColor("#f7f7f8"), Color.parseColor("#ffe5d2"), l1iVar)).m99078g(new C11525c(Color.parseColor("#cc000000"), Color.parseColor("#fe7e1d"), feedQaTwoOptionTopicItem)).m99078g(new C11523a(0, m67242e0(l1iVar), l1iVar, feedQaTwoOptionTopicItem));
    }

    /* JADX INFO: renamed from: W */
    public void m67237W(l1i l1iVar, FeedQaTwoOptionTopicItem feedQaTwoOptionTopicItem) {
        feedQaTwoOptionTopicItem.f43926c.setText(m67229b0(l1iVar.m152488b(), l1iVar.m152487a()));
    }

    /* JADX INFO: renamed from: X */
    public void m67238X(View view, int i) {
        view.setVisibility(i);
        if (view == this.f43989k.f43924a) {
            this.f43985g.f43924a.setVisibility(i);
        } else {
            this.f43986h.f43924a.setVisibility(i);
        }
    }

    /* JADX INFO: renamed from: Y */
    public int m67239Y(l1i l1iVar, FeedQaTwoOptionTopicItem feedQaTwoOptionTopicItem, boolean z) {
        if (this.f43999u.get(feedQaTwoOptionTopicItem) == null) {
            return !l1iVar.m152495i() ? 1 : 0;
        }
        FeedQaItemVoteStatus feedQaItemVoteStatus = this.f43999u.get(feedQaTwoOptionTopicItem);
        FeedQaItemVoteStatus feedQaItemVoteStatus2 = FeedQaItemVoteStatus.NO_VOTE;
        if ((feedQaItemVoteStatus == feedQaItemVoteStatus2 && l1iVar.m152495i()) || (z && l1iVar.m152494h())) {
            return 0;
        }
        return (this.f43999u.get(feedQaTwoOptionTopicItem) == FeedQaItemVoteStatus.HAVE_VOTE_NOT_BE_VOTING || (this.f43999u.get(feedQaTwoOptionTopicItem) == feedQaItemVoteStatus2 && !l1iVar.m152495i())) ? 1 : 0;
    }

    /* JADX INFO: renamed from: Z */
    public View m67240Z(int i) {
        return i == 0 ? this.f43983e : this.f43984f;
    }

    /* JADX INFO: renamed from: a0 */
    public View m67241a0(int i) {
        return i == 0 ? this.f43985g.f43924a : this.f43986h.f43924a;
    }

    /* JADX INFO: renamed from: e0 */
    public int m67242e0(l1i l1iVar) {
        FeedQaTwoOptionTopicItem feedQaTwoOptionTopicItemM67139B = m67139B(l1iVar);
        ViewGroup viewGroup = (ViewGroup) feedQaTwoOptionTopicItemM67139B.getParent();
        feedQaTwoOptionTopicItemM67139B.measure(0, 0);
        int iM175859d = feedQaTwoOptionTopicItemM67139B.f43924a.getVisibility() == 0 ? qa00.m175859d(20.0f) : 0;
        if (feedQaTwoOptionTopicItemM67139B.f43926c.getWidth() == 1) {
            feedQaTwoOptionTopicItemM67139B.f43926c.measure(0, 0);
            iM175859d -= feedQaTwoOptionTopicItemM67139B.f43926c.getMeasuredWidth();
        }
        return Math.max(((viewGroup.getWidth() - feedQaTwoOptionTopicItemM67139B.getMeasuredWidth()) + iM175859d) / 2, 0);
    }

    @Override // com.p051p1.mobile.putong.feed.newui.topic.qatopic.FeedQaTopicVoteListGroupView
    public int getAnimTime() {
        return 400;
    }

    public int getNoVoteBgWidth() {
        return ((this.f43996r - this.f43997s) - this.f43998t) / 2;
    }

    @Override // com.p051p1.mobile.putong.feed.newui.topic.qatopic.FeedQaTopicVoteListGroupView
    public List<FeedQaTwoOptionTopicItem> getQaTopicVoteViewList() {
        if (this.f43994p == null) {
            ArrayList arrayList = new ArrayList();
            this.f43994p = arrayList;
            arrayList.add(this.f43989k);
            this.f43994p.add(this.f43992n);
        }
        return this.f43994p;
    }

    public int getRadius() {
        return qa00.m175859d(14.0f);
    }

    @Override // com.p051p1.mobile.putong.feed.newui.topic.qatopic.FeedQaTopicVoteListGroupView
    public View getView() {
        return this;
    }

    @Override // com.p051p1.mobile.putong.feed.newui.topic.qatopic.FeedQaTopicVoteListGroupView
    public View getVoteListContainer() {
        return this.f43987i;
    }

    @Override // com.p051p1.mobile.putong.feed.newui.topic.qatopic.FeedQaTopicVoteListGroupView
    public List<View> getVoteViewContainerList() {
        if (this.f43995q == null) {
            ArrayList arrayList = new ArrayList();
            this.f43995q = arrayList;
            arrayList.add(this.f43988j);
            this.f43995q.add(this.f43991m);
        }
        return this.f43995q;
    }

    /* JADX INFO: renamed from: h0 */
    public final void m67243h0() {
        m67238X(this.f43985g.f43924a, 8);
        m67238X(this.f43986h.f43924a, 8);
        this.f43985g.f43924a.setImageResource(lbc0.f131019d4);
        this.f43986h.f43924a.setImageResource(lbc0.f131027e4);
    }

    /* JADX INFO: renamed from: j0 */
    public final /* synthetic */ void m67244j0(l1i l1iVar) {
        super.mo67153z(l1iVar);
    }

    /* JADX INFO: renamed from: k0 */
    public final /* synthetic */ Boolean m67245k0(Integer num) {
        return Boolean.valueOf(this.f43999u.get(this.f43994p.get(num.intValue())) == FeedQaItemVoteStatus.HAVE_VOTE_BE_VOTING);
    }

    @Override // com.p051p1.mobile.putong.feed.newui.topic.qatopic.FeedQaTopicVoteListGroupView
    /* JADX INFO: renamed from: l0, reason: merged with bridge method [inline-methods] */
    public void mo67147N(FeedQaTwoOptionTopicItem feedQaTwoOptionTopicItem, FeedQaItemVoteStatus feedQaItemVoteStatus) {
        this.f43999u.put(feedQaTwoOptionTopicItem, feedQaItemVoteStatus);
    }

    /* JADX INFO: renamed from: m0 */
    public void m67247m0(l1i l1iVar, int i, aog[] aogVarArr, aog aogVar) {
        if (aogVarArr != null) {
            aogVarArr[i] = aogVar;
            this.f43993o.put(Integer.valueOf(l1iVar.m152489c()), aogVarArr);
        } else {
            aog[] aogVarArr2 = new aog[2];
            aogVarArr2[i] = aogVar;
            this.f43993o.put(Integer.valueOf(l1iVar.m152489c()), aogVarArr2);
        }
    }

    /* JADX INFO: renamed from: o0 */
    public final void m67248o0(l1i l1iVar) {
        if (l1iVar.m152489c() == 0) {
            this.f43985g.f43925b.setVisibility(4);
            this.f43985g.f43925b.setText(l1iVar.m152490d());
        } else {
            this.f43986h.f43925b.setVisibility(4);
            this.f43986h.f43925b.setText(l1iVar.m152490d());
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.f43996r = View.MeasureSpec.getSize(i);
    }

    /* JADX INFO: renamed from: p0 */
    public void m67249p0(int i, int i2, View view) {
        if (i == 0) {
            bnl0.m105539W(view, i2);
        } else {
            bnl0.m105538V(view, i2);
        }
    }

    /* JADX INFO: renamed from: q0 */
    public void m67250q0(l1i l1iVar, FeedQaTwoOptionTopicItem feedQaTwoOptionTopicItem) {
        if (l1iVar.m152495i()) {
            feedQaTwoOptionTopicItem.f43926c.setTextColor(Color.parseColor("#fe7e1d"));
        } else {
            feedQaTwoOptionTopicItem.f43926c.setTextColor(Color.parseColor("#66000000"));
        }
    }

    @Override // com.p051p1.mobile.putong.feed.newui.topic.qatopic.FeedQaTopicVoteListGroupView
    /* JADX INFO: renamed from: v */
    public void mo67151v(l1i l1iVar) {
        FeedQaTwoOptionTopicItem feedQaTwoOptionTopicItemM67139B = m67139B(l1iVar);
        m67237W(l1iVar, feedQaTwoOptionTopicItemM67139B);
        boolean z = this.f43999u.get(feedQaTwoOptionTopicItemM67139B) == FeedQaItemVoteStatus.HAVE_VOTE_BE_VOTING;
        int iM67239Y = m67239Y(l1iVar, feedQaTwoOptionTopicItemM67139B, z);
        aog[] aogVarArr = this.f43993o.get(Integer.valueOf(l1iVar.m152489c()));
        aog aogVar = (aogVarArr == null || aogVarArr.length <= iM67239Y) ? null : aogVarArr[iM67239Y];
        if (aogVar != null) {
            aogVar.m99076e(l1iVar.m152494h());
            return;
        }
        cog c11526d = new C11526d(1, 0, l1iVar);
        m67247m0(l1iVar, iM67239Y, aogVarArr, c11526d);
        m67234S(l1iVar, feedQaTwoOptionTopicItemM67139B, (l1iVar.m152495i() || z) ? m67236V(l1iVar, feedQaTwoOptionTopicItemM67139B, z, c11526d) : m67235T(l1iVar, feedQaTwoOptionTopicItemM67139B, c11526d));
        c11526d.m99076e(l1iVar.m152494h());
    }

    @Override // com.p051p1.mobile.putong.feed.newui.topic.qatopic.FeedQaTopicVoteListGroupView
    /* JADX INFO: renamed from: z */
    public void mo67153z(final l1i l1iVar) {
        if (this.f43996r == -1) {
            post(new Runnable() { // from class: l.hub0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f111632a.m67244j0(l1iVar);
                }
            });
        } else {
            super.mo67153z(l1iVar);
        }
        FeedQaTwoOptionTopicItem feedQaTwoOptionTopicItemM67139B = m67139B(l1iVar);
        feedQaTwoOptionTopicItemM67139B.f43925b.setText(l1iVar.m152490d());
        if (!l1iVar.m152494h()) {
            m67250q0(l1iVar, feedQaTwoOptionTopicItemM67139B);
        }
        m67248o0(l1iVar);
    }

    public QATopicTowOptionVoteView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f43993o = new HashMap();
        this.f43996r = -1;
        this.f43997s = qa00.m175859d(12.0f);
        this.f43998t = qa00.m175859d(12.0f) * 2;
        this.f43999u = new HashMap();
        mo67144K(context);
    }

    public QATopicTowOptionVoteView(Context context, String str) {
        super(context, str);
        this.f43993o = new HashMap();
        this.f43996r = -1;
        this.f43997s = qa00.m175859d(12.0f);
        this.f43998t = qa00.m175859d(12.0f) * 2;
        this.f43999u = new HashMap();
    }

    public QATopicTowOptionVoteView(Context context) {
        super(context);
        this.f43993o = new HashMap();
        this.f43996r = -1;
        this.f43997s = qa00.m175859d(12.0f);
        this.f43998t = qa00.m175859d(12.0f) * 2;
        this.f43999u = new HashMap();
    }
}
