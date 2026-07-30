package com.p051p1.mobile.putong.feed.newui.topic.qatopic;

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
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.p051p1.mobile.putong.feed.FeedModule;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p151v.VFrame;
import p153l.bnl0;
import p153l.k9c0;
import p153l.l1i;
import p153l.lbc0;
import p153l.qa00;
import p153l.xsb0;

/* JADX INFO: loaded from: classes13.dex */
public class QATopicMultiOptionVoteView extends FeedQaTopicVoteListGroupView<FeedQaTopicItem> {

    /* JADX INFO: renamed from: c */
    public VFrame f43936c;

    /* JADX INFO: renamed from: d */
    public LinearLayout f43937d;

    /* JADX INFO: renamed from: e */
    public FeedQaTopicItem f43938e;

    /* JADX INFO: renamed from: f */
    public FeedQaTopicItem f43939f;

    /* JADX INFO: renamed from: g */
    public FeedQaTopicItem f43940g;

    /* JADX INFO: renamed from: h */
    public FeedQaTopicItem f43941h;

    /* JADX INFO: renamed from: i */
    public FeedQaTopicItem f43942i;

    /* JADX INFO: renamed from: j */
    public List<FeedQaTopicItem> f43943j;

    /* JADX INFO: renamed from: k */
    public List<View> f43944k;

    /* JADX INFO: renamed from: l */
    public int f43945l;

    /* JADX INFO: renamed from: m */
    public Drawable f43946m;

    /* JADX INFO: renamed from: n */
    public int f43947n;

    /* JADX INFO: renamed from: o */
    public int f43948o;

    /* JADX INFO: renamed from: p */
    public List<l1i> f43949p;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.topic.qatopic.QATopicMultiOptionVoteView$a */
    public class C11522a implements Animator.AnimatorListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ l1i f43950a;

        public C11522a(l1i l1iVar) {
            this.f43950a = l1iVar;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f43950a.m152494h()) {
                QATopicMultiOptionVoteView.this.m67152w(this.f43950a);
                Iterator it = QATopicMultiOptionVoteView.this.f43949p.iterator();
                while (it.hasNext()) {
                    QATopicMultiOptionVoteView.this.m67152w((l1i) it.next());
                }
                QATopicMultiOptionVoteView.this.f43949p.clear();
            }
            QATopicMultiOptionVoteView.this.f43948o = this.f43950a.m152491e();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            boolean zM152494h = this.f43950a.m152494h();
            QATopicMultiOptionVoteView qATopicMultiOptionVoteView = QATopicMultiOptionVoteView.this;
            if (zM152494h) {
                qATopicMultiOptionVoteView.f43946m.setAlpha(0);
                return;
            }
            qATopicMultiOptionVoteView.m67152w(this.f43950a);
            Iterator it = QATopicMultiOptionVoteView.this.f43949p.iterator();
            while (it.hasNext()) {
                QATopicMultiOptionVoteView.this.m67152w((l1i) it.next());
            }
            QATopicMultiOptionVoteView.this.f43949p.clear();
        }
    }

    public QATopicMultiOptionVoteView(Context context) {
        super(context);
        this.f43949p = new ArrayList();
    }

    /* JADX INFO: renamed from: a0 */
    private String m67167a0(int i, int i2) {
        double dM67168b0 = m67168b0(i, i2);
        return dM67168b0 == FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE ? "0%" : new DecimalFormat("##%").format(dM67168b0);
    }

    /* JADX INFO: renamed from: b0 */
    private double m67168b0(int i, int i2) {
        return i2 == 0 ? FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE : (((double) i) * 1.0d) / (((double) i2) * 1.0d);
    }

    /* JADX INFO: renamed from: c0 */
    private int m67169c0(int i, int i2) {
        return (int) Math.round(((double) this.f43945l) * m67170e0(i, i2));
    }

    /* JADX INFO: renamed from: e0 */
    private double m67170e0(int i, int i2) {
        double d = (((double) i) * 1.0d) / (((double) i2) * 1.0d);
        if (d <= 0.98d || d >= 1.0d) {
            return d;
        }
        return 0.98d;
    }

    @Override // com.p051p1.mobile.putong.feed.newui.topic.qatopic.FeedQaTopicVoteListGroupView
    /* JADX INFO: renamed from: C */
    public void mo67140C(l1i l1iVar) {
        FeedQaTopicItem feedQaTopicItemM67139B = m67139B(l1iVar);
        m67179k0(feedQaTopicItemM67139B, true);
        feedQaTopicItemM67139B.f43919c.setTextColor(FeedModule.f39700a.getResources().getColor(k9c0.f124521n));
        feedQaTopicItemM67139B.f43918b.setColor(FeedModule.f39700a.getResources().getColor(k9c0.f124483O));
        Drawable drawable = getResources().getDrawable(lbc0.f131011c4);
        this.f43946m = drawable;
        drawable.setAlpha(255);
        this.f43947n = this.f43946m.getMinimumWidth();
        Drawable drawable2 = this.f43946m;
        drawable2.setBounds(0, 0, drawable2.getMinimumWidth(), this.f43946m.getMinimumHeight());
        feedQaTopicItemM67139B.f43919c.setCompoundDrawables(this.f43946m, null, null, null);
        feedQaTopicItemM67139B.f43920d.setTextColor(FeedModule.f39700a.getResources().getColor(k9c0.f124521n));
    }

    @Override // com.p051p1.mobile.putong.feed.newui.topic.qatopic.FeedQaTopicVoteListGroupView
    /* JADX INFO: renamed from: E */
    public void mo67141E(l1i l1iVar) {
        FeedQaTopicItem feedQaTopicItemM67139B = m67139B(l1iVar);
        feedQaTopicItemM67139B.f43918b.setColor(FeedModule.f39700a.getResources().getColor(k9c0.f124476H));
        feedQaTopicItemM67139B.f43919c.setTextColor(FeedModule.f39700a.getResources().getColor(k9c0.f124484P));
        feedQaTopicItemM67139B.f43919c.setCompoundDrawables(null, null, null, null);
        feedQaTopicItemM67139B.f43920d.setTextColor(FeedModule.f39700a.getResources().getColor(k9c0.f124513j));
        m67179k0(feedQaTopicItemM67139B, false);
    }

    @Override // com.p051p1.mobile.putong.feed.newui.topic.qatopic.FeedQaTopicVoteListGroupView
    /* JADX INFO: renamed from: F */
    public void mo67142F(l1i l1iVar) {
        super.mo67142F(l1iVar);
        FeedQaTopicItem feedQaTopicItemM67139B = m67139B(l1iVar);
        bnl0.m105524M(feedQaTopicItemM67139B.f43920d, true);
        bnl0.m105524M(feedQaTopicItemM67139B.f43918b, true);
    }

    @Override // com.p051p1.mobile.putong.feed.newui.topic.qatopic.FeedQaTopicVoteListGroupView
    /* JADX INFO: renamed from: G */
    public void mo67143G(l1i l1iVar) {
        FeedQaTopicItem feedQaTopicItemM67139B = m67139B(l1iVar);
        feedQaTopicItemM67139B.f43919c.setTextColor(FeedModule.f39700a.getResources().getColor(k9c0.f124501d));
        feedQaTopicItemM67139B.f43919c.setCompoundDrawables(null, null, null, null);
        bnl0.m105524M(feedQaTopicItemM67139B.f43920d, false);
        bnl0.m105524M(feedQaTopicItemM67139B.f43918b, false);
        m67179k0(feedQaTopicItemM67139B, false);
        feedQaTopicItemM67139B.f43917a.setBackgroundResource(lbc0.f130926Q5);
    }

    @Override // com.p051p1.mobile.putong.feed.newui.topic.qatopic.FeedQaTopicVoteListGroupView
    /* JADX INFO: renamed from: K */
    public void mo67144K(Context context) {
        super.mo67144K(context);
        addView(m67171W(LayoutInflater.from(context), this));
        bnl0.m105554f0(this, qa00.m175859d(10.0f));
        Iterator<FeedQaTopicItem> it = getQaTopicVoteViewList().iterator();
        while (it.hasNext()) {
            bnl0.m105540X(it.next(), qa00.m175859d(6.0f));
        }
    }

    /* JADX INFO: renamed from: W */
    public View m67171W(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return xsb0.m212964b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: X */
    public void m67172X(l1i l1iVar, final FeedQaTopicItem feedQaTopicItem) {
        feedQaTopicItem.f43920d.setVisibility(8);
        ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(feedQaTopicItem.f43919c, "textColor", Color.parseColor(this.f43948o == l1iVar.m152489c() ? "#fe7e1d" : "#66000000"), Color.parseColor("#cc000000"));
        objectAnimatorOfInt.setDuration(800L);
        objectAnimatorOfInt.setEvaluator(new ArgbEvaluator());
        objectAnimatorOfInt.start();
        if (this.f43948o == l1iVar.m152489c()) {
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(872316445, 117440512);
            valueAnimatorOfInt.setDuration(200L);
            valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.wsb0
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    this.f190609a.m67176g0(feedQaTopicItem, valueAnimator);
                }
            });
            valueAnimatorOfInt.setEvaluator(new ArgbEvaluator());
            valueAnimatorOfInt.start();
        }
    }

    /* JADX INFO: renamed from: Y */
    public void m67173Y(l1i l1iVar, FeedQaTopicItem feedQaTopicItem, int i) {
        if (l1iVar.m152494h() && this.f43948o == l1iVar.m152489c()) {
            if (i == 0) {
                feedQaTopicItem.f43919c.setCompoundDrawables(null, null, null, null);
                return;
            }
            Drawable drawable = getResources().getDrawable(lbc0.f131011c4);
            drawable.setBounds(0, 0, (int) m67174Z(i), drawable.getMinimumWidth());
            feedQaTopicItem.f43919c.setCompoundDrawables(drawable, null, null, null);
        }
    }

    /* JADX INFO: renamed from: Z */
    public final double m67174Z(int i) {
        int i2 = this.f43947n;
        return ((i * 0.016949153f) * i2) - (i2 * 0.6666667f);
    }

    /* JADX INFO: renamed from: f0 */
    public final /* synthetic */ void m67175f0(l1i l1iVar, FeedQaTopicItem feedQaTopicItem, double d, ValueAnimator valueAnimator) {
        int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        m67173Y(l1iVar, feedQaTopicItem, iIntValue);
        feedQaTopicItem.f43918b.setLikedWidth((int) (((((double) iIntValue) * d) * ((double) this.f43945l)) / 100.0d));
        feedQaTopicItem.f43920d.setText(m67167a0((int) ((iIntValue / 100.0f) * l1iVar.m152488b()), l1iVar.m152487a()));
    }

    /* JADX INFO: renamed from: g0 */
    public final /* synthetic */ void m67176g0(FeedQaTopicItem feedQaTopicItem, ValueAnimator valueAnimator) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(getRadius());
        gradientDrawable.setColor(-1);
        gradientDrawable.setStroke(qa00.m175859d(3.0f), ((Integer) valueAnimator.getAnimatedValue()).intValue());
        feedQaTopicItem.f43917a.setBackground(gradientDrawable);
    }

    @Override // com.p051p1.mobile.putong.feed.newui.topic.qatopic.FeedQaTopicVoteListGroupView
    public int getAnimTime() {
        return 700;
    }

    @Override // com.p051p1.mobile.putong.feed.newui.topic.qatopic.FeedQaTopicVoteListGroupView
    public List<FeedQaTopicItem> getQaTopicVoteViewList() {
        if (this.f43943j == null) {
            ArrayList arrayList = new ArrayList();
            this.f43943j = arrayList;
            arrayList.add(this.f43938e);
            this.f43943j.add(this.f43939f);
            this.f43943j.add(this.f43940g);
            this.f43943j.add(this.f43941h);
            this.f43943j.add(this.f43942i);
        }
        return this.f43943j;
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
        return this.f43937d;
    }

    @Override // com.p051p1.mobile.putong.feed.newui.topic.qatopic.FeedQaTopicVoteListGroupView
    public List<View> getVoteViewContainerList() {
        if (this.f43944k == null) {
            ArrayList arrayList = new ArrayList();
            this.f43944k = arrayList;
            arrayList.add(this.f43938e);
            this.f43944k.add(this.f43939f);
            this.f43944k.add(this.f43940g);
            this.f43944k.add(this.f43941h);
            this.f43944k.add(this.f43942i);
        }
        return this.f43944k;
    }

    @Override // com.p051p1.mobile.putong.feed.newui.topic.qatopic.FeedQaTopicVoteListGroupView
    /* JADX INFO: renamed from: j0, reason: merged with bridge method [inline-methods] */
    public void mo67147N(FeedQaTopicItem feedQaTopicItem, FeedQaItemVoteStatus feedQaItemVoteStatus) {
    }

    /* JADX INFO: renamed from: k0 */
    public void m67179k0(FeedQaTopicItem feedQaTopicItem, boolean z) {
        ((RelativeLayout) feedQaTopicItem.f43918b.getParent()).setSelected(z);
    }

    /* JADX INFO: renamed from: l0, reason: merged with bridge method [inline-methods] */
    public void m67177h0(l1i l1iVar, FeedQaTopicItem feedQaTopicItem) {
        super.mo67153z(l1iVar);
        if (l1iVar.m152493g()) {
            return;
        }
        feedQaTopicItem.f43920d.setText(m67167a0(l1iVar.m152488b(), l1iVar.m152487a()));
        feedQaTopicItem.f43918b.setLikedWidth(m67169c0(l1iVar.m152488b(), l1iVar.m152487a()));
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.f43945l = View.MeasureSpec.getSize(i);
    }

    @Override // com.p051p1.mobile.putong.feed.newui.topic.qatopic.FeedQaTopicVoteListGroupView
    /* JADX INFO: renamed from: v */
    public void mo67151v(final l1i l1iVar) {
        final FeedQaTopicItem feedQaTopicItemM67139B = m67139B(l1iVar);
        if (l1iVar.m152488b() == 0) {
            feedQaTopicItemM67139B.f43920d.setText(m67167a0(l1iVar.m152488b(), 100));
            if (l1iVar.m152494h()) {
                this.f43949p.add(l1iVar);
                return;
            } else {
                m67152w(l1iVar);
                return;
            }
        }
        final double dM67170e0 = m67170e0(l1iVar.m152488b(), l1iVar.m152487a());
        ValueAnimator valueAnimatorOfInt = l1iVar.m152494h() ? ValueAnimator.ofInt(100, 0) : ValueAnimator.ofInt(0, 100);
        valueAnimatorOfInt.setInterpolator(new LinearInterpolator());
        valueAnimatorOfInt.setDuration(getAnimTime());
        valueAnimatorOfInt.addListener(new C11522a(l1iVar));
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.vsb0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f185588a.m67175f0(l1iVar, feedQaTopicItemM67139B, dM67170e0, valueAnimator);
            }
        });
        valueAnimatorOfInt.start();
        if (l1iVar.m152494h()) {
            m67172X(l1iVar, feedQaTopicItemM67139B);
        }
    }

    @Override // com.p051p1.mobile.putong.feed.newui.topic.qatopic.FeedQaTopicVoteListGroupView
    /* JADX INFO: renamed from: z */
    public void mo67153z(final l1i l1iVar) {
        final FeedQaTopicItem feedQaTopicItemM67139B = m67139B(l1iVar);
        if (this.f43945l == 0) {
            post(new Runnable() { // from class: l.usb0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f180762a.m67177h0(l1iVar, feedQaTopicItemM67139B);
                }
            });
        } else {
            m67177h0(l1iVar, feedQaTopicItemM67139B);
        }
        feedQaTopicItemM67139B.f43919c.setText(l1iVar.m152490d());
        if (l1iVar.m152493g()) {
            return;
        }
        this.f43948o = l1iVar.m152491e();
    }

    public QATopicMultiOptionVoteView(Context context, String str) {
        super(context, str);
        this.f43949p = new ArrayList();
    }

    public QATopicMultiOptionVoteView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f43949p = new ArrayList();
    }

    public QATopicMultiOptionVoteView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f43949p = new ArrayList();
    }
}
