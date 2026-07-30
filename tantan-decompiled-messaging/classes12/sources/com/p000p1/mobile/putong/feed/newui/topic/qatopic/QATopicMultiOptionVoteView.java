package com.p000p1.mobile.putong.feed.newui.topic.qatopic;

import android.animation.Animator;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.p000p1.mobile.putong.feed.FeedModule;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l.t100;
import l.xdl0;
import p007l.e1c0;
import p007l.f3c0;
import p007l.tkb0;
import p007l.wzh;
import v.VFrame;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class QATopicMultiOptionVoteView extends FeedQaTopicVoteListGroupView<FeedQaTopicItem> {

    /* JADX INFO: renamed from: c */
    public VFrame f4549c;

    /* JADX INFO: renamed from: d */
    public LinearLayout f4550d;

    /* JADX INFO: renamed from: e */
    public FeedQaTopicItem f4551e;

    /* JADX INFO: renamed from: f */
    public FeedQaTopicItem f4552f;

    /* JADX INFO: renamed from: g */
    public FeedQaTopicItem f4553g;

    /* JADX INFO: renamed from: h */
    public FeedQaTopicItem f4554h;

    /* JADX INFO: renamed from: i */
    public FeedQaTopicItem f4555i;

    /* JADX INFO: renamed from: j */
    public List<FeedQaTopicItem> f4556j;

    /* JADX INFO: renamed from: k */
    public List<View> f4557k;

    /* JADX INFO: renamed from: l */
    public int f4558l;

    /* JADX INFO: renamed from: m */
    public Drawable f4559m;

    /* JADX INFO: renamed from: n */
    public int f4560n;

    /* JADX INFO: renamed from: o */
    public int f4561o;

    /* JADX INFO: renamed from: p */
    public List<wzh> f4562p;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.topic.qatopic.QATopicMultiOptionVoteView$a */
    public class C2203a implements Animator.AnimatorListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ wzh f4563a;

        public C2203a(wzh wzhVar) {
            this.f4563a = wzhVar;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f4563a.m15951h()) {
                QATopicMultiOptionVoteView.this.m7121w(this.f4563a);
                Iterator it = QATopicMultiOptionVoteView.this.f4562p.iterator();
                while (it.hasNext()) {
                    QATopicMultiOptionVoteView.this.m7121w((wzh) it.next());
                }
                QATopicMultiOptionVoteView.this.f4562p.clear();
            }
            QATopicMultiOptionVoteView.this.f4561o = this.f4563a.m15948e();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            boolean zM15951h = this.f4563a.m15951h();
            QATopicMultiOptionVoteView qATopicMultiOptionVoteView = QATopicMultiOptionVoteView.this;
            if (zM15951h) {
                qATopicMultiOptionVoteView.f4559m.setAlpha(0);
                return;
            }
            qATopicMultiOptionVoteView.m7121w(this.f4563a);
            Iterator it = QATopicMultiOptionVoteView.this.f4562p.iterator();
            while (it.hasNext()) {
                QATopicMultiOptionVoteView.this.m7121w((wzh) it.next());
            }
            QATopicMultiOptionVoteView.this.f4562p.clear();
        }
    }

    public QATopicMultiOptionVoteView(Context context) {
        super(context);
        this.f4562p = new ArrayList();
    }

    /* JADX INFO: renamed from: a0 */
    private String m7136a0(int i, int i2) {
        double dM7137b0 = m7137b0(i, i2);
        return dM7137b0 == 0.0d ? "0%" : new DecimalFormat("##%").format(dM7137b0);
    }

    /* JADX INFO: renamed from: b0 */
    private double m7137b0(int i, int i2) {
        if (i2 == 0) {
            return 0.0d;
        }
        return (((double) i) * 1.0d) / (((double) i2) * 1.0d);
    }

    /* JADX INFO: renamed from: c0 */
    private int m7138c0(int i, int i2) {
        return (int) Math.round(((double) this.f4558l) * m7139e0(i, i2));
    }

    /* JADX INFO: renamed from: e0 */
    private double m7139e0(int i, int i2) {
        double d = (((double) i) * 1.0d) / (((double) i2) * 1.0d);
        if (d <= 0.98d || d >= 1.0d) {
            return d;
        }
        return 0.98d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p000p1.mobile.putong.feed.newui.topic.qatopic.FeedQaTopicVoteListGroupView
    /* JADX INFO: renamed from: C */
    public void mo7109C(wzh wzhVar) {
        FeedQaTopicItem feedQaTopicItem = (FeedQaTopicItem) m7108B(wzhVar);
        m7148k0(feedQaTopicItem, true);
        feedQaTopicItem.f4532c.setTextColor(FeedModule.f313a.getResources().getColor(e1c0.f7154n));
        feedQaTopicItem.f4531b.setColor(FeedModule.f313a.getResources().getColor(e1c0.f7116O));
        Drawable drawable = getResources().getDrawable(f3c0.f7776c4);
        this.f4559m = drawable;
        drawable.setAlpha(255);
        this.f4560n = this.f4559m.getMinimumWidth();
        Drawable drawable2 = this.f4559m;
        drawable2.setBounds(0, 0, drawable2.getMinimumWidth(), this.f4559m.getMinimumHeight());
        feedQaTopicItem.f4532c.setCompoundDrawables(this.f4559m, null, null, null);
        feedQaTopicItem.f4533d.setTextColor(FeedModule.f313a.getResources().getColor(e1c0.f7154n));
    }

    @Override // com.p000p1.mobile.putong.feed.newui.topic.qatopic.FeedQaTopicVoteListGroupView
    /* JADX INFO: renamed from: E */
    public void mo7110E(wzh wzhVar) {
        FeedQaTopicItem feedQaTopicItemM7108B = m7108B(wzhVar);
        feedQaTopicItemM7108B.f4531b.setColor(FeedModule.f313a.getResources().getColor(e1c0.f7109H));
        feedQaTopicItemM7108B.f4532c.setTextColor(FeedModule.f313a.getResources().getColor(e1c0.f7117P));
        feedQaTopicItemM7108B.f4532c.setCompoundDrawables(null, null, null, null);
        feedQaTopicItemM7108B.f4533d.setTextColor(FeedModule.f313a.getResources().getColor(e1c0.f7146j));
        m7148k0(feedQaTopicItemM7108B, false);
    }

    @Override // com.p000p1.mobile.putong.feed.newui.topic.qatopic.FeedQaTopicVoteListGroupView
    /* JADX INFO: renamed from: F */
    public void mo7111F(wzh wzhVar) {
        super.mo7111F(wzhVar);
        FeedQaTopicItem feedQaTopicItemM7108B = m7108B(wzhVar);
        xdl0.M(feedQaTopicItemM7108B.f4533d, true);
        xdl0.M(feedQaTopicItemM7108B.f4531b, true);
    }

    @Override // com.p000p1.mobile.putong.feed.newui.topic.qatopic.FeedQaTopicVoteListGroupView
    /* JADX INFO: renamed from: G */
    public void mo7112G(wzh wzhVar) {
        FeedQaTopicItem feedQaTopicItemM7108B = m7108B(wzhVar);
        feedQaTopicItemM7108B.f4532c.setTextColor(FeedModule.f313a.getResources().getColor(e1c0.f7134d));
        feedQaTopicItemM7108B.f4532c.setCompoundDrawables(null, null, null, null);
        xdl0.M(feedQaTopicItemM7108B.f4533d, false);
        xdl0.M(feedQaTopicItemM7108B.f4531b, false);
        m7148k0(feedQaTopicItemM7108B, false);
        feedQaTopicItemM7108B.f4530a.setBackgroundResource(f3c0.f7691Q5);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p000p1.mobile.putong.feed.newui.topic.qatopic.FeedQaTopicVoteListGroupView
    /* JADX INFO: renamed from: K */
    public void mo7113K(Context context) {
        super.mo7113K(context);
        addView(m7140W(LayoutInflater.from(context), this));
        xdl0.f0(this, t100.d(10.0f));
        Iterator<FeedQaTopicItem> it = getQaTopicVoteViewList().iterator();
        while (it.hasNext()) {
            xdl0.X(it.next(), t100.d(6.0f));
        }
    }

    /* JADX INFO: renamed from: W */
    public View m7140W(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return tkb0.m14563b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: X */
    public void m7141X(wzh wzhVar, final FeedQaTopicItem feedQaTopicItem) {
        feedQaTopicItem.f4533d.setVisibility(8);
        ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(feedQaTopicItem.f4532c, "textColor", Color.parseColor(this.f4561o == wzhVar.m15946c() ? "#fe7e1d" : "#66000000"), Color.parseColor("#cc000000"));
        objectAnimatorOfInt.setDuration(800L);
        objectAnimatorOfInt.setEvaluator(new ArgbEvaluator());
        objectAnimatorOfInt.start();
        if (this.f4561o == wzhVar.m15946c()) {
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(872316445, 117440512);
            valueAnimatorOfInt.setDuration(200L);
            valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.skb0
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    this.f12973a.m7145g0(feedQaTopicItem, valueAnimator);
                }
            });
            valueAnimatorOfInt.setEvaluator(new ArgbEvaluator());
            valueAnimatorOfInt.start();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Y */
    public void m7142Y(wzh wzhVar, FeedQaTopicItem feedQaTopicItem, int i) {
        if (wzhVar.m15951h() && this.f4561o == wzhVar.m15946c()) {
            if (i == 0) {
                feedQaTopicItem.f4532c.setCompoundDrawables(null, null, null, null);
                return;
            }
            Drawable drawable = getResources().getDrawable(f3c0.f7776c4);
            drawable.setBounds(0, 0, (int) m7143Z(i), drawable.getMinimumWidth());
            feedQaTopicItem.f4532c.setCompoundDrawables(drawable, null, null, null);
        }
    }

    /* JADX INFO: renamed from: Z */
    public final double m7143Z(int i) {
        int i2 = this.f4560n;
        return ((i * 0.016949153f) * i2) - (i2 * 0.6666667f);
    }

    /* JADX INFO: renamed from: f0 */
    public final /* synthetic */ void m7144f0(wzh wzhVar, FeedQaTopicItem feedQaTopicItem, double d, ValueAnimator valueAnimator) {
        int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        m7142Y(wzhVar, feedQaTopicItem, iIntValue);
        feedQaTopicItem.f4531b.setLikedWidth((int) (((((double) iIntValue) * d) * ((double) this.f4558l)) / 100.0d));
        feedQaTopicItem.f4533d.setText(m7136a0((int) ((iIntValue / 100.0f) * wzhVar.m15945b()), wzhVar.m15944a()));
    }

    /* JADX INFO: renamed from: g0 */
    public final /* synthetic */ void m7145g0(FeedQaTopicItem feedQaTopicItem, ValueAnimator valueAnimator) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(getRadius());
        gradientDrawable.setColor(-1);
        gradientDrawable.setStroke(t100.d(3.0f), ((Integer) valueAnimator.getAnimatedValue()).intValue());
        feedQaTopicItem.f4530a.setBackground(gradientDrawable);
    }

    @Override // com.p000p1.mobile.putong.feed.newui.topic.qatopic.FeedQaTopicVoteListGroupView
    public int getAnimTime() {
        return 700;
    }

    @Override // com.p000p1.mobile.putong.feed.newui.topic.qatopic.FeedQaTopicVoteListGroupView
    public List<FeedQaTopicItem> getQaTopicVoteViewList() {
        if (this.f4556j == null) {
            ArrayList arrayList = new ArrayList();
            this.f4556j = arrayList;
            arrayList.add(this.f4551e);
            this.f4556j.add(this.f4552f);
            this.f4556j.add(this.f4553g);
            this.f4556j.add(this.f4554h);
            this.f4556j.add(this.f4555i);
        }
        return this.f4556j;
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
        return this.f4550d;
    }

    @Override // com.p000p1.mobile.putong.feed.newui.topic.qatopic.FeedQaTopicVoteListGroupView
    public List<View> getVoteViewContainerList() {
        if (this.f4557k == null) {
            ArrayList arrayList = new ArrayList();
            this.f4557k = arrayList;
            arrayList.add(this.f4551e);
            this.f4557k.add(this.f4552f);
            this.f4557k.add(this.f4553g);
            this.f4557k.add(this.f4554h);
            this.f4557k.add(this.f4555i);
        }
        return this.f4557k;
    }

    @Override // com.p000p1.mobile.putong.feed.newui.topic.qatopic.FeedQaTopicVoteListGroupView
    /* JADX INFO: renamed from: j0, reason: merged with bridge method [inline-methods] */
    public void mo7116N(FeedQaTopicItem feedQaTopicItem, FeedQaItemVoteStatus feedQaItemVoteStatus) {
    }

    /* JADX INFO: renamed from: k0 */
    public void m7148k0(FeedQaTopicItem feedQaTopicItem, boolean z) {
        ((RelativeLayout) feedQaTopicItem.f4531b.getParent()).setSelected(z);
    }

    /* JADX INFO: renamed from: l0, reason: merged with bridge method [inline-methods] */
    public void m7146h0(wzh wzhVar, FeedQaTopicItem feedQaTopicItem) {
        super.mo7122z(wzhVar);
        if (wzhVar.m15950g()) {
            return;
        }
        feedQaTopicItem.f4533d.setText(m7136a0(wzhVar.m15945b(), wzhVar.m15944a()));
        feedQaTopicItem.f4531b.setLikedWidth(m7138c0(wzhVar.m15945b(), wzhVar.m15944a()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onMeasure(int i, int i2) {
        super/*android.view.View*/.onMeasure(i, i2);
        this.f4558l = View.MeasureSpec.getSize(i);
    }

    @Override // com.p000p1.mobile.putong.feed.newui.topic.qatopic.FeedQaTopicVoteListGroupView
    /* JADX INFO: renamed from: v */
    public void mo7120v(final wzh wzhVar) {
        final FeedQaTopicItem feedQaTopicItemM7108B = m7108B(wzhVar);
        if (wzhVar.m15945b() == 0) {
            feedQaTopicItemM7108B.f4533d.setText(m7136a0(wzhVar.m15945b(), 100));
            if (wzhVar.m15951h()) {
                this.f4562p.add(wzhVar);
                return;
            } else {
                m7121w(wzhVar);
                return;
            }
        }
        final double dM7139e0 = m7139e0(wzhVar.m15945b(), wzhVar.m15944a());
        ValueAnimator valueAnimatorOfInt = wzhVar.m15951h() ? ValueAnimator.ofInt(100, 0) : ValueAnimator.ofInt(0, 100);
        valueAnimatorOfInt.setInterpolator(new LinearInterpolator());
        valueAnimatorOfInt.setDuration(getAnimTime());
        valueAnimatorOfInt.addListener(new C2203a(wzhVar));
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.rkb0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f12662a.m7144f0(wzhVar, feedQaTopicItemM7108B, dM7139e0, valueAnimator);
            }
        });
        valueAnimatorOfInt.start();
        if (wzhVar.m15951h()) {
            m7141X(wzhVar, feedQaTopicItemM7108B);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p000p1.mobile.putong.feed.newui.topic.qatopic.FeedQaTopicVoteListGroupView
    /* JADX INFO: renamed from: z */
    public void mo7122z(final wzh wzhVar) {
        final FeedQaTopicItem feedQaTopicItem = (FeedQaTopicItem) m7108B(wzhVar);
        if (this.f4558l == 0) {
            post(new Runnable() { // from class: l.qkb0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f12262a.m7146h0(wzhVar, feedQaTopicItem);
                }
            });
        } else {
            m7146h0(wzhVar, feedQaTopicItem);
        }
        feedQaTopicItem.f4532c.setText(wzhVar.m15947d());
        if (wzhVar.m15950g()) {
            return;
        }
        this.f4561o = wzhVar.m15948e();
    }

    public QATopicMultiOptionVoteView(Context context, String str) {
        super(context, str);
        this.f4562p = new ArrayList();
    }

    public QATopicMultiOptionVoteView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4562p = new ArrayList();
    }

    public QATopicMultiOptionVoteView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f4562p = new ArrayList();
    }
}
