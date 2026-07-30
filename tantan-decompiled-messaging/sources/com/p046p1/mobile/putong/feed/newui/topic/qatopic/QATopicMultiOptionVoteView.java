package com.p046p1.mobile.putong.feed.newui.topic.qatopic;

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
import com.p046p1.mobile.putong.feed.FeedModule;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p147v.VFrame;
import p149l.e1c0;
import p149l.f3c0;
import p149l.t100;
import p149l.tkb0;
import p149l.wzh;
import p149l.xdl0;

/* JADX INFO: loaded from: classes12.dex */
public class QATopicMultiOptionVoteView extends FeedQaTopicVoteListGroupView<FeedQaTopicItem> {

    /* JADX INFO: renamed from: c */
    public VFrame f43088c;

    /* JADX INFO: renamed from: d */
    public LinearLayout f43089d;

    /* JADX INFO: renamed from: e */
    public FeedQaTopicItem f43090e;

    /* JADX INFO: renamed from: f */
    public FeedQaTopicItem f43091f;

    /* JADX INFO: renamed from: g */
    public FeedQaTopicItem f43092g;

    /* JADX INFO: renamed from: h */
    public FeedQaTopicItem f43093h;

    /* JADX INFO: renamed from: i */
    public FeedQaTopicItem f43094i;

    /* JADX INFO: renamed from: j */
    public List<FeedQaTopicItem> f43095j;

    /* JADX INFO: renamed from: k */
    public List<View> f43096k;

    /* JADX INFO: renamed from: l */
    public int f43097l;

    /* JADX INFO: renamed from: m */
    public Drawable f43098m;

    /* JADX INFO: renamed from: n */
    public int f43099n;

    /* JADX INFO: renamed from: o */
    public int f43100o;

    /* JADX INFO: renamed from: p */
    public List<wzh> f43101p;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.topic.qatopic.QATopicMultiOptionVoteView$a */
    public class C11359a implements Animator.AnimatorListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ wzh f43102a;

        public C11359a(wzh wzhVar) {
            this.f43102a = wzhVar;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f43102a.m206287h()) {
                QATopicMultiOptionVoteView.this.m65969w(this.f43102a);
                Iterator it = QATopicMultiOptionVoteView.this.f43101p.iterator();
                while (it.hasNext()) {
                    QATopicMultiOptionVoteView.this.m65969w((wzh) it.next());
                }
                QATopicMultiOptionVoteView.this.f43101p.clear();
            }
            QATopicMultiOptionVoteView.this.f43100o = this.f43102a.m206284e();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            boolean zM206287h = this.f43102a.m206287h();
            QATopicMultiOptionVoteView qATopicMultiOptionVoteView = QATopicMultiOptionVoteView.this;
            if (zM206287h) {
                qATopicMultiOptionVoteView.f43098m.setAlpha(0);
                return;
            }
            qATopicMultiOptionVoteView.m65969w(this.f43102a);
            Iterator it = QATopicMultiOptionVoteView.this.f43101p.iterator();
            while (it.hasNext()) {
                QATopicMultiOptionVoteView.this.m65969w((wzh) it.next());
            }
            QATopicMultiOptionVoteView.this.f43101p.clear();
        }
    }

    public QATopicMultiOptionVoteView(Context context) {
        super(context);
        this.f43101p = new ArrayList();
    }

    /* JADX INFO: renamed from: a0 */
    private String m65984a0(int i, int i2) {
        double dM65985b0 = m65985b0(i, i2);
        return dM65985b0 == FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE ? "0%" : new DecimalFormat("##%").format(dM65985b0);
    }

    /* JADX INFO: renamed from: b0 */
    private double m65985b0(int i, int i2) {
        return i2 == 0 ? FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE : (((double) i) * 1.0d) / (((double) i2) * 1.0d);
    }

    /* JADX INFO: renamed from: c0 */
    private int m65986c0(int i, int i2) {
        return (int) Math.round(((double) this.f43097l) * m65987e0(i, i2));
    }

    /* JADX INFO: renamed from: e0 */
    private double m65987e0(int i, int i2) {
        double d = (((double) i) * 1.0d) / (((double) i2) * 1.0d);
        if (d <= 0.98d || d >= 1.0d) {
            return d;
        }
        return 0.98d;
    }

    @Override // com.p046p1.mobile.putong.feed.newui.topic.qatopic.FeedQaTopicVoteListGroupView
    /* JADX INFO: renamed from: C */
    public void mo65957C(wzh wzhVar) {
        FeedQaTopicItem feedQaTopicItemM65956B = m65956B(wzhVar);
        m65996k0(feedQaTopicItemM65956B, true);
        feedQaTopicItemM65956B.f43071c.setTextColor(FeedModule.f38852a.getResources().getColor(e1c0.f88798n));
        feedQaTopicItemM65956B.f43070b.setColor(FeedModule.f38852a.getResources().getColor(e1c0.f88760O));
        Drawable drawable = getResources().getDrawable(f3c0.f94493c4);
        this.f43098m = drawable;
        drawable.setAlpha(255);
        this.f43099n = this.f43098m.getMinimumWidth();
        Drawable drawable2 = this.f43098m;
        drawable2.setBounds(0, 0, drawable2.getMinimumWidth(), this.f43098m.getMinimumHeight());
        feedQaTopicItemM65956B.f43071c.setCompoundDrawables(this.f43098m, null, null, null);
        feedQaTopicItemM65956B.f43072d.setTextColor(FeedModule.f38852a.getResources().getColor(e1c0.f88798n));
    }

    @Override // com.p046p1.mobile.putong.feed.newui.topic.qatopic.FeedQaTopicVoteListGroupView
    /* JADX INFO: renamed from: E */
    public void mo65958E(wzh wzhVar) {
        FeedQaTopicItem feedQaTopicItemM65956B = m65956B(wzhVar);
        feedQaTopicItemM65956B.f43070b.setColor(FeedModule.f38852a.getResources().getColor(e1c0.f88753H));
        feedQaTopicItemM65956B.f43071c.setTextColor(FeedModule.f38852a.getResources().getColor(e1c0.f88761P));
        feedQaTopicItemM65956B.f43071c.setCompoundDrawables(null, null, null, null);
        feedQaTopicItemM65956B.f43072d.setTextColor(FeedModule.f38852a.getResources().getColor(e1c0.f88790j));
        m65996k0(feedQaTopicItemM65956B, false);
    }

    @Override // com.p046p1.mobile.putong.feed.newui.topic.qatopic.FeedQaTopicVoteListGroupView
    /* JADX INFO: renamed from: F */
    public void mo65959F(wzh wzhVar) {
        super.mo65959F(wzhVar);
        FeedQaTopicItem feedQaTopicItemM65956B = m65956B(wzhVar);
        xdl0.m208344M(feedQaTopicItemM65956B.f43072d, true);
        xdl0.m208344M(feedQaTopicItemM65956B.f43070b, true);
    }

    @Override // com.p046p1.mobile.putong.feed.newui.topic.qatopic.FeedQaTopicVoteListGroupView
    /* JADX INFO: renamed from: G */
    public void mo65960G(wzh wzhVar) {
        FeedQaTopicItem feedQaTopicItemM65956B = m65956B(wzhVar);
        feedQaTopicItemM65956B.f43071c.setTextColor(FeedModule.f38852a.getResources().getColor(e1c0.f88778d));
        feedQaTopicItemM65956B.f43071c.setCompoundDrawables(null, null, null, null);
        xdl0.m208344M(feedQaTopicItemM65956B.f43072d, false);
        xdl0.m208344M(feedQaTopicItemM65956B.f43070b, false);
        m65996k0(feedQaTopicItemM65956B, false);
        feedQaTopicItemM65956B.f43069a.setBackgroundResource(f3c0.f94408Q5);
    }

    @Override // com.p046p1.mobile.putong.feed.newui.topic.qatopic.FeedQaTopicVoteListGroupView
    /* JADX INFO: renamed from: K */
    public void mo65961K(Context context) {
        super.mo65961K(context);
        addView(m65988W(LayoutInflater.from(context), this));
        xdl0.m208374f0(this, t100.m186890d(10.0f));
        Iterator<FeedQaTopicItem> it = getQaTopicVoteViewList().iterator();
        while (it.hasNext()) {
            xdl0.m208360X(it.next(), t100.m186890d(6.0f));
        }
    }

    /* JADX INFO: renamed from: W */
    public View m65988W(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return tkb0.m189469b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: X */
    public void m65989X(wzh wzhVar, final FeedQaTopicItem feedQaTopicItem) {
        feedQaTopicItem.f43072d.setVisibility(8);
        ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(feedQaTopicItem.f43071c, "textColor", Color.parseColor(this.f43100o == wzhVar.m206282c() ? "#fe7e1d" : "#66000000"), Color.parseColor("#cc000000"));
        objectAnimatorOfInt.setDuration(800L);
        objectAnimatorOfInt.setEvaluator(new ArgbEvaluator());
        objectAnimatorOfInt.start();
        if (this.f43100o == wzhVar.m206282c()) {
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(872316445, 117440512);
            valueAnimatorOfInt.setDuration(200L);
            valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.skb0
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    this.f164947a.m65993g0(feedQaTopicItem, valueAnimator);
                }
            });
            valueAnimatorOfInt.setEvaluator(new ArgbEvaluator());
            valueAnimatorOfInt.start();
        }
    }

    /* JADX INFO: renamed from: Y */
    public void m65990Y(wzh wzhVar, FeedQaTopicItem feedQaTopicItem, int i) {
        if (wzhVar.m206287h() && this.f43100o == wzhVar.m206282c()) {
            if (i == 0) {
                feedQaTopicItem.f43071c.setCompoundDrawables(null, null, null, null);
                return;
            }
            Drawable drawable = getResources().getDrawable(f3c0.f94493c4);
            drawable.setBounds(0, 0, (int) m65991Z(i), drawable.getMinimumWidth());
            feedQaTopicItem.f43071c.setCompoundDrawables(drawable, null, null, null);
        }
    }

    /* JADX INFO: renamed from: Z */
    public final double m65991Z(int i) {
        int i2 = this.f43099n;
        return ((i * 0.016949153f) * i2) - (i2 * 0.6666667f);
    }

    /* JADX INFO: renamed from: f0 */
    public final /* synthetic */ void m65992f0(wzh wzhVar, FeedQaTopicItem feedQaTopicItem, double d, ValueAnimator valueAnimator) {
        int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        m65990Y(wzhVar, feedQaTopicItem, iIntValue);
        feedQaTopicItem.f43070b.setLikedWidth((int) (((((double) iIntValue) * d) * ((double) this.f43097l)) / 100.0d));
        feedQaTopicItem.f43072d.setText(m65984a0((int) ((iIntValue / 100.0f) * wzhVar.m206281b()), wzhVar.m206280a()));
    }

    /* JADX INFO: renamed from: g0 */
    public final /* synthetic */ void m65993g0(FeedQaTopicItem feedQaTopicItem, ValueAnimator valueAnimator) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(getRadius());
        gradientDrawable.setColor(-1);
        gradientDrawable.setStroke(t100.m186890d(3.0f), ((Integer) valueAnimator.getAnimatedValue()).intValue());
        feedQaTopicItem.f43069a.setBackground(gradientDrawable);
    }

    @Override // com.p046p1.mobile.putong.feed.newui.topic.qatopic.FeedQaTopicVoteListGroupView
    public int getAnimTime() {
        return 700;
    }

    @Override // com.p046p1.mobile.putong.feed.newui.topic.qatopic.FeedQaTopicVoteListGroupView
    public List<FeedQaTopicItem> getQaTopicVoteViewList() {
        if (this.f43095j == null) {
            ArrayList arrayList = new ArrayList();
            this.f43095j = arrayList;
            arrayList.add(this.f43090e);
            this.f43095j.add(this.f43091f);
            this.f43095j.add(this.f43092g);
            this.f43095j.add(this.f43093h);
            this.f43095j.add(this.f43094i);
        }
        return this.f43095j;
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
        return this.f43089d;
    }

    @Override // com.p046p1.mobile.putong.feed.newui.topic.qatopic.FeedQaTopicVoteListGroupView
    public List<View> getVoteViewContainerList() {
        if (this.f43096k == null) {
            ArrayList arrayList = new ArrayList();
            this.f43096k = arrayList;
            arrayList.add(this.f43090e);
            this.f43096k.add(this.f43091f);
            this.f43096k.add(this.f43092g);
            this.f43096k.add(this.f43093h);
            this.f43096k.add(this.f43094i);
        }
        return this.f43096k;
    }

    @Override // com.p046p1.mobile.putong.feed.newui.topic.qatopic.FeedQaTopicVoteListGroupView
    /* JADX INFO: renamed from: j0, reason: merged with bridge method [inline-methods] */
    public void mo65964N(FeedQaTopicItem feedQaTopicItem, FeedQaItemVoteStatus feedQaItemVoteStatus) {
    }

    /* JADX INFO: renamed from: k0 */
    public void m65996k0(FeedQaTopicItem feedQaTopicItem, boolean z) {
        ((RelativeLayout) feedQaTopicItem.f43070b.getParent()).setSelected(z);
    }

    /* JADX INFO: renamed from: l0, reason: merged with bridge method [inline-methods] */
    public void m65994h0(wzh wzhVar, FeedQaTopicItem feedQaTopicItem) {
        super.mo65970z(wzhVar);
        if (wzhVar.m206286g()) {
            return;
        }
        feedQaTopicItem.f43072d.setText(m65984a0(wzhVar.m206281b(), wzhVar.m206280a()));
        feedQaTopicItem.f43070b.setLikedWidth(m65986c0(wzhVar.m206281b(), wzhVar.m206280a()));
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.f43097l = View.MeasureSpec.getSize(i);
    }

    @Override // com.p046p1.mobile.putong.feed.newui.topic.qatopic.FeedQaTopicVoteListGroupView
    /* JADX INFO: renamed from: v */
    public void mo65968v(final wzh wzhVar) {
        final FeedQaTopicItem feedQaTopicItemM65956B = m65956B(wzhVar);
        if (wzhVar.m206281b() == 0) {
            feedQaTopicItemM65956B.f43072d.setText(m65984a0(wzhVar.m206281b(), 100));
            if (wzhVar.m206287h()) {
                this.f43101p.add(wzhVar);
                return;
            } else {
                m65969w(wzhVar);
                return;
            }
        }
        final double dM65987e0 = m65987e0(wzhVar.m206281b(), wzhVar.m206280a());
        ValueAnimator valueAnimatorOfInt = wzhVar.m206287h() ? ValueAnimator.ofInt(100, 0) : ValueAnimator.ofInt(0, 100);
        valueAnimatorOfInt.setInterpolator(new LinearInterpolator());
        valueAnimatorOfInt.setDuration(getAnimTime());
        valueAnimatorOfInt.addListener(new C11359a(wzhVar));
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.rkb0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f159805a.m65992f0(wzhVar, feedQaTopicItemM65956B, dM65987e0, valueAnimator);
            }
        });
        valueAnimatorOfInt.start();
        if (wzhVar.m206287h()) {
            m65989X(wzhVar, feedQaTopicItemM65956B);
        }
    }

    @Override // com.p046p1.mobile.putong.feed.newui.topic.qatopic.FeedQaTopicVoteListGroupView
    /* JADX INFO: renamed from: z */
    public void mo65970z(final wzh wzhVar) {
        final FeedQaTopicItem feedQaTopicItemM65956B = m65956B(wzhVar);
        if (this.f43097l == 0) {
            post(new Runnable() { // from class: l.qkb0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f155094a.m65994h0(wzhVar, feedQaTopicItemM65956B);
                }
            });
        } else {
            m65994h0(wzhVar, feedQaTopicItemM65956B);
        }
        feedQaTopicItemM65956B.f43071c.setText(wzhVar.m206283d());
        if (wzhVar.m206286g()) {
            return;
        }
        this.f43100o = wzhVar.m206284e();
    }

    public QATopicMultiOptionVoteView(Context context, String str) {
        super(context, str);
        this.f43101p = new ArrayList();
    }

    public QATopicMultiOptionVoteView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f43101p = new ArrayList();
    }

    public QATopicMultiOptionVoteView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f43101p = new ArrayList();
    }
}
