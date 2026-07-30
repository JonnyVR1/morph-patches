package com.p051p1.mobile.putong.core.p058ui.purchase.privilege;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.data.LookingFor;
import com.p051p1.mobile.putong.data.Settings;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import p151v.AutoVDraweeView;
import p151v.VDraweeView;
import p151v.VImage;
import p153l.bnl0;
import p153l.g4c;
import p153l.gt0;
import p153l.jbc0;
import p153l.jyb;
import p153l.pf60;
import p153l.qa00;
import p153l.uqb0;
import p153l.vof;

/* JADX INFO: loaded from: classes12.dex */
public class ExplodeLayout extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public ImageView f35853a;

    /* JADX INFO: renamed from: b */
    public ImageView f35854b;

    /* JADX INFO: renamed from: c */
    public ImageView f35855c;

    /* JADX INFO: renamed from: d */
    public ImageView f35856d;

    /* JADX INFO: renamed from: e */
    public FrameLayout f35857e;

    /* JADX INFO: renamed from: f */
    public AutoVDraweeView f35858f;

    /* JADX INFO: renamed from: g */
    public VImage f35859g;

    /* JADX INFO: renamed from: h */
    public FrameLayout f35860h;

    /* JADX INFO: renamed from: i */
    public AutoVDraweeView f35861i;

    /* JADX INFO: renamed from: j */
    public FrameLayout f35862j;

    /* JADX INFO: renamed from: k */
    public AutoVDraweeView f35863k;

    /* JADX INFO: renamed from: l */
    public FrameLayout f35864l;

    /* JADX INFO: renamed from: m */
    public AutoVDraweeView f35865m;

    /* JADX INFO: renamed from: n */
    public FrameLayout f35866n;

    /* JADX INFO: renamed from: o */
    public AutoVDraweeView f35867o;

    /* JADX INFO: renamed from: p */
    public ImageView[] f35868p;

    /* JADX INFO: renamed from: q */
    public View[] f35869q;

    /* JADX INFO: renamed from: r */
    public VDraweeView[] f35870r;

    /* JADX INFO: renamed from: s */
    public int[] f35871s;

    /* JADX INFO: renamed from: t */
    public List<pf60<Integer, Integer>> f35872t;

    /* JADX INFO: renamed from: u */
    public boolean f35873u;

    /* JADX INFO: renamed from: v */
    public boolean f35874v;

    /* JADX INFO: renamed from: w */
    public boolean f35875w;

    /* JADX INFO: renamed from: x */
    public boolean f35876x;

    /* JADX INFO: renamed from: y */
    public float f35877y;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.purchase.privilege.ExplodeLayout$a */
    public class C8953a extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ View f35878a;

        public C8953a(View view) {
            this.f35878a = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            bnl0.m105525M0(this.f35878a, true);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.purchase.privilege.ExplodeLayout$b */
    public class C8954b extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.purchase.privilege.ExplodeLayout$b$a */
        public class a extends gt0.C17308j {
            public a() {
            }

            @Override // p153l.gt0.C17308j, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                ExplodeLayout.this.f35874v = false;
            }
        }

        public C8954b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            for (int i = 0; i < ExplodeLayout.this.f35868p.length; i++) {
                bnl0.m105525M0(ExplodeLayout.this.f35868p[i], true);
                ExplodeLayout.this.f35868p[i].animate().translationX(qa00.m175859d(ExplodeLayout.this.f35871s[i])).translationY(qa00.m175859d(ExplodeLayout.this.f35871s[i]) * ((Float) ExplodeLayout.this.f35868p[i].getTag()).floatValue()).setInterpolator(gt0.f106347b).setListener(new a()).setDuration(1000L).start();
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.purchase.privilege.ExplodeLayout$c */
    public class C8955c extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ AnimatorSet f35882a;

        public C8955c(AnimatorSet animatorSet) {
            this.f35882a = animatorSet;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            AnimatorSet animatorSet = this.f35882a;
            ExplodeLayout explodeLayout = ExplodeLayout.this;
            ObjectAnimator objectAnimatorM55405f = explodeLayout.m55405f(explodeLayout.f35860h, 150);
            ExplodeLayout explodeLayout2 = ExplodeLayout.this;
            ObjectAnimator objectAnimatorM55405f2 = explodeLayout2.m55405f(explodeLayout2.f35862j, 200);
            ExplodeLayout explodeLayout3 = ExplodeLayout.this;
            ObjectAnimator objectAnimatorM55405f3 = explodeLayout3.m55405f(explodeLayout3.f35864l, 50);
            ExplodeLayout explodeLayout4 = ExplodeLayout.this;
            animatorSet.playTogether(objectAnimatorM55405f, objectAnimatorM55405f2, objectAnimatorM55405f3, explodeLayout4.m55405f(explodeLayout4.f35866n, 100));
            this.f35882a.setStartDelay(150L);
            this.f35882a.start();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            bnl0.m105525M0(ExplodeLayout.this.f35857e, true);
        }
    }

    public ExplodeLayout(@NonNull Context context) {
        super(context);
        this.f35873u = false;
        this.f35874v = false;
        this.f35877y = 1.0f;
    }

    private int[] getSeeHazyResource() {
        Settings settings = CoreModule.f18264c.f20381e0.m116600p9().settings;
        LookingFor lookingFor = settings == null ? LookingFor.get("unknown_") : settings.getLookingFor();
        if (TEnum.equals(lookingFor, "female")) {
            return new int[]{jbc0.f119336Nb, jbc0.f119350Ob, jbc0.f119364Pb, jbc0.f119378Qb};
        }
        return TEnum.equals(lookingFor, "male") ? new int[]{jbc0.f119391Rb, jbc0.f119404Sb, jbc0.f119417Tb, jbc0.f119430Ub} : new int[]{jbc0.f119336Nb, jbc0.f119404Sb, jbc0.f119417Tb, jbc0.f119378Qb};
    }

    /* JADX INFO: renamed from: e */
    public final void m55404e(View view) {
        vof.m202117a(this, view);
    }

    /* JADX INFO: renamed from: f */
    public final ObjectAnimator m55405f(View view, int i) {
        ObjectAnimator duration = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat("alpha", 0.0f, 1.0f), PropertyValuesHolder.ofFloat("scaleX", 0.0f, 1.0f), PropertyValuesHolder.ofFloat("scaleY", 0.0f, 1.0f)).setDuration(500L);
        duration.setInterpolator(gt0.f106351f);
        duration.setStartDelay(i);
        duration.addListener(new C8953a(view));
        return duration;
    }

    /* JADX INFO: renamed from: g */
    public final void m55406g() {
        bnl0.m105525M0(this.f35857e, false);
        bnl0.m105525M0(this.f35860h, false);
        bnl0.m105525M0(this.f35862j, false);
        bnl0.m105525M0(this.f35864l, false);
        bnl0.m105525M0(this.f35866n, false);
        int i = 0;
        while (true) {
            ImageView[] imageViewArr = this.f35868p;
            if (i >= imageViewArr.length) {
                return;
            }
            bnl0.m105525M0(imageViewArr[i], false);
            this.f35868p[i].setTranslationX(0.0f);
            this.f35868p[i].setTranslationY(0.0f);
            i++;
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m55407h(ImageView imageView, View view, g4c g4cVar) {
        int left = imageView.getLeft() + (imageView.getMeasuredWidth() / 2);
        float fFloatValue = new BigDecimal((view.getTop() + (view.getMeasuredHeight() / 2)) - (imageView.getTop() + (imageView.getMeasuredHeight() / 2))).divide(new BigDecimal((view.getLeft() + (view.getMeasuredWidth() / 2)) - left), 2, 4).floatValue();
        g4cVar.m128864c(fFloatValue);
        imageView.setTag(Float.valueOf(fFloatValue));
    }

    /* JADX INFO: renamed from: i */
    public final void m55408i() {
        for (int i = 0; i < this.f35868p.length; i++) {
            g4c g4cVar = new g4c();
            if (bnl0.m105588w0() < 960) {
                g4cVar.m128863b(qa00.m175859d(2.0f));
            }
            m55407h(this.f35868p[i], this.f35869q[i], g4cVar);
            this.f35868p[i].setImageDrawable(g4cVar);
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m55409j() {
        this.f35870r = new VDraweeView[]{this.f35861i, this.f35863k, this.f35865m, this.f35867o};
        this.f35868p = new ImageView[]{this.f35853a, this.f35854b, this.f35855c, this.f35856d};
        this.f35869q = new View[]{this.f35860h, this.f35862j, this.f35864l, this.f35866n};
        this.f35871s = new int[]{60, -60, 40, -50};
        ArrayList arrayList = new ArrayList(4);
        this.f35872t = arrayList;
        arrayList.add(jyb.m147494Y(89, -30));
        this.f35872t.add(jyb.m147494Y(-65, -13));
        this.f35872t.add(jyb.m147494Y(80, 76));
        this.f35872t.add(jyb.m147494Y(-40, 65));
        if (bnl0.m105588w0() < 960) {
            setScale(0.6f);
        }
    }

    /* JADX INFO: renamed from: k */
    public void m55410k() {
        m55411l(false);
    }

    /* JADX INFO: renamed from: l */
    public void m55411l(boolean z) {
        if (!this.f35875w) {
            this.f35876x = true;
            return;
        }
        if (this.f35874v) {
            return;
        }
        boolean z2 = this.f35873u;
        if (!z2 || z) {
            if (z2 && z) {
                m55406g();
            }
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.addListener(new C8954b());
            ObjectAnimator duration = ObjectAnimator.ofPropertyValuesHolder(this.f35857e, PropertyValuesHolder.ofFloat("alpha", 0.0f, 1.0f), PropertyValuesHolder.ofFloat("scaleX", 0.0f, 1.0f), PropertyValuesHolder.ofFloat("scaleY", 0.0f, 1.0f)).setDuration(500L);
            duration.setInterpolator(gt0.f106351f);
            duration.setStartDelay(100L);
            duration.addListener(new C8955c(animatorSet));
            duration.start();
            this.f35874v = true;
            this.f35873u = true;
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m55404e(this);
        String str = CoreModule.f18264c.f20381e0.m116600p9().picture(0).url;
        if (!TextUtils.isEmpty(str)) {
            this.f35858f.setImageUrl(str);
        }
        m55409j();
        setUpResource(getSeeHazyResource());
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        for (int i5 = 0; i5 < this.f35869q.length; i5++) {
            int left = this.f35857e.getLeft() + qa00.m175859d(this.f35872t.get(i5).f152156a.intValue());
            int top = this.f35857e.getTop() + qa00.m175859d(this.f35872t.get(i5).f152157b.intValue());
            View view = this.f35869q[i5];
            view.layout(left, top, view.getMeasuredWidth() + left, this.f35869q[i5].getMeasuredHeight() + top);
        }
        m55408i();
        this.f35875w = true;
        if (this.f35876x) {
            post(new Runnable() { // from class: l.uof
                @Override // java.lang.Runnable
                public final void run() {
                    this.f180079a.m55410k();
                }
            });
            this.f35876x = false;
        }
    }

    public void setCenterAvatarBackgroundDrawable(@DrawableRes int i) {
        this.f35857e.setBackgroundResource(i);
    }

    public void setCenterIcon(@DrawableRes int i) {
        this.f35859g.setImageResource(i);
    }

    public void setScale(float f) {
        if (this.f35877y == f) {
            return;
        }
        this.f35877y = f;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f35857e.getLayoutParams();
        layoutParams.width = (int) (layoutParams.width * f);
        layoutParams.height = (int) (layoutParams.height * f);
        this.f35857e.setLayoutParams(layoutParams);
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.f35858f.getLayoutParams();
        layoutParams2.width = (int) (layoutParams2.width * f);
        layoutParams2.height = (int) (layoutParams2.height * f);
        this.f35858f.setLayoutParams(layoutParams2);
        AutoVDraweeView autoVDraweeView = this.f35858f;
        autoVDraweeView.setPadding((int) (autoVDraweeView.getPaddingLeft() * f), (int) (this.f35858f.getPaddingTop() * f), (int) (this.f35858f.getPaddingRight() * f), (int) (this.f35858f.getPaddingBottom() * f));
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) this.f35859g.getLayoutParams();
        layoutParams3.width = (int) (layoutParams3.width * f);
        layoutParams3.height = (int) (layoutParams3.height * f);
        layoutParams3.bottomMargin = (int) (layoutParams3.bottomMargin * f);
        this.f35859g.setLayoutParams(layoutParams3);
        for (int i = 0; i < 4; i++) {
            FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) this.f35869q[i].getLayoutParams();
            layoutParams4.width = (int) (layoutParams4.width * f);
            layoutParams4.height = (int) (layoutParams4.height * f);
            this.f35869q[i].setLayoutParams(layoutParams4);
            FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) this.f35870r[i].getLayoutParams();
            layoutParams5.width = (int) (layoutParams5.width * f);
            layoutParams5.height = (int) (layoutParams5.height * f);
            this.f35870r[i].setLayoutParams(layoutParams5);
            VDraweeView vDraweeView = this.f35870r[i];
            vDraweeView.setPadding((int) (vDraweeView.getPaddingLeft() * f), (int) (this.f35870r[i].getPaddingTop() * f), (int) (this.f35870r[i].getPaddingRight() * f), (int) (this.f35870r[i].getPaddingBottom() * f));
            FrameLayout.LayoutParams layoutParams6 = (FrameLayout.LayoutParams) this.f35868p[i].getLayoutParams();
            layoutParams6.width = (int) (layoutParams6.width * f);
            layoutParams6.height = (int) (layoutParams6.height * f);
            this.f35868p[i].setLayoutParams(layoutParams6);
            int[] iArr = this.f35871s;
            iArr[i] = (int) (iArr[i] * f);
            List<pf60<Integer, Integer>> list = this.f35872t;
            list.set(i, jyb.m147494Y(Integer.valueOf((int) (list.get(i).f152156a.intValue() * f)), Integer.valueOf((int) (this.f35872t.get(i).f152157b.intValue() * f))));
        }
    }

    public void setUpResource(int[] iArr) {
        int i = 0;
        while (true) {
            VDraweeView[] vDraweeViewArr = this.f35870r;
            if (i >= vDraweeViewArr.length) {
                return;
            }
            uqb0.f180374G.m127138Y0(vDraweeViewArr[i], iArr[i]);
            i++;
        }
    }

    public ExplodeLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f35873u = false;
        this.f35874v = false;
        this.f35877y = 1.0f;
    }

    public ExplodeLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f35873u = false;
        this.f35874v = false;
        this.f35877y = 1.0f;
    }
}
