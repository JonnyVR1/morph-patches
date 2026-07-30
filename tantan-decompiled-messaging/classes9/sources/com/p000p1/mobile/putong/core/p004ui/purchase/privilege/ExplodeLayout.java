package com.p000p1.mobile.putong.core.p004ui.purchase.privilege;

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
import com.facebook.drawee.view.SimpleDraweeView;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.data.LookingFor;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.Settings;
import com.p1.mobile.putong.data.tenum.TEnum;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import l.bt0;
import l.d3c0;
import l.j760;
import l.onf;
import l.t100;
import l.vwb;
import l.xdl0;
import p006l.qib0;
import p006l.x2c;
import v.AutoVDraweeView;
import v.VDraweeView;
import v.VImage;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class ExplodeLayout extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public ImageView f4786a;

    /* JADX INFO: renamed from: b */
    public ImageView f4787b;

    /* JADX INFO: renamed from: c */
    public ImageView f4788c;

    /* JADX INFO: renamed from: d */
    public ImageView f4789d;

    /* JADX INFO: renamed from: e */
    public FrameLayout f4790e;

    /* JADX INFO: renamed from: f */
    public AutoVDraweeView f4791f;

    /* JADX INFO: renamed from: g */
    public VImage f4792g;

    /* JADX INFO: renamed from: h */
    public FrameLayout f4793h;

    /* JADX INFO: renamed from: i */
    public AutoVDraweeView f4794i;

    /* JADX INFO: renamed from: j */
    public FrameLayout f4795j;

    /* JADX INFO: renamed from: k */
    public AutoVDraweeView f4796k;

    /* JADX INFO: renamed from: l */
    public FrameLayout f4797l;

    /* JADX INFO: renamed from: m */
    public AutoVDraweeView f4798m;

    /* JADX INFO: renamed from: n */
    public FrameLayout f4799n;

    /* JADX INFO: renamed from: o */
    public AutoVDraweeView f4800o;

    /* JADX INFO: renamed from: p */
    public ImageView[] f4801p;

    /* JADX INFO: renamed from: q */
    public View[] f4802q;

    /* JADX INFO: renamed from: r */
    public VDraweeView[] f4803r;

    /* JADX INFO: renamed from: s */
    public int[] f4804s;

    /* JADX INFO: renamed from: t */
    public List<j760<Integer, Integer>> f4805t;

    /* JADX INFO: renamed from: u */
    public boolean f4806u;

    /* JADX INFO: renamed from: v */
    public boolean f4807v;

    /* JADX INFO: renamed from: w */
    public boolean f4808w;

    /* JADX INFO: renamed from: x */
    public boolean f4809x;

    /* JADX INFO: renamed from: y */
    public float f4810y;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.purchase.privilege.ExplodeLayout$a */
    public class C0226a extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ View f4811a;

        public C0226a(View view) {
            this.f4811a = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            xdl0.M0(this.f4811a, true);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.purchase.privilege.ExplodeLayout$b */
    public class C0227b extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.purchase.privilege.ExplodeLayout$b$a */
        public class a extends bt0.j {
            public a() {
            }

            public void onAnimationEnd(Animator animator) {
                ExplodeLayout.this.f4807v = false;
            }
        }

        public C0227b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            for (int i = 0; i < ExplodeLayout.this.f4801p.length; i++) {
                xdl0.M0(ExplodeLayout.this.f4801p[i], true);
                ExplodeLayout.this.f4801p[i].animate().translationX(t100.d(ExplodeLayout.this.f4804s[i])).translationY(t100.d(ExplodeLayout.this.f4804s[i]) * ((Float) ExplodeLayout.this.f4801p[i].getTag()).floatValue()).setInterpolator(bt0.b).setListener(new a()).setDuration(1000L).start();
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.purchase.privilege.ExplodeLayout$c */
    public class C0228c extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ AnimatorSet f4815a;

        public C0228c(AnimatorSet animatorSet) {
            this.f4815a = animatorSet;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            AnimatorSet animatorSet = this.f4815a;
            ExplodeLayout explodeLayout = ExplodeLayout.this;
            ObjectAnimator objectAnimatorM7557f = explodeLayout.m7557f(explodeLayout.f4793h, 150);
            ExplodeLayout explodeLayout2 = ExplodeLayout.this;
            ObjectAnimator objectAnimatorM7557f2 = explodeLayout2.m7557f(explodeLayout2.f4795j, 200);
            ExplodeLayout explodeLayout3 = ExplodeLayout.this;
            ObjectAnimator objectAnimatorM7557f3 = explodeLayout3.m7557f(explodeLayout3.f4797l, 50);
            ExplodeLayout explodeLayout4 = ExplodeLayout.this;
            animatorSet.playTogether(objectAnimatorM7557f, objectAnimatorM7557f2, objectAnimatorM7557f3, explodeLayout4.m7557f(explodeLayout4.f4799n, 100));
            this.f4815a.setStartDelay(150L);
            this.f4815a.start();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            xdl0.M0(ExplodeLayout.this.f4790e, true);
        }
    }

    public ExplodeLayout(@NonNull Context context) {
        super(context);
        this.f4806u = false;
        this.f4807v = false;
        this.f4810y = 1.0f;
    }

    private int[] getSeeHazyResource() {
        Settings settings = CoreModule.f1534c.f3628e0.m21490p9().settings;
        LookingFor lookingFor = settings == null ? LookingFor.get("unknown_") : settings.getLookingFor();
        if (TEnum.equals(lookingFor, "female")) {
            return new int[]{d3c0.Nb, d3c0.Ob, d3c0.Pb, d3c0.Qb};
        }
        return TEnum.equals(lookingFor, "male") ? new int[]{d3c0.Rb, d3c0.Sb, d3c0.Tb, d3c0.Ub} : new int[]{d3c0.Nb, d3c0.Sb, d3c0.Tb, d3c0.Qb};
    }

    /* JADX INFO: renamed from: e */
    public final void m7556e(View view) {
        onf.a(this, view);
    }

    /* JADX INFO: renamed from: f */
    public final ObjectAnimator m7557f(View view, int i) {
        ObjectAnimator duration = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat("alpha", 0.0f, 1.0f), PropertyValuesHolder.ofFloat("scaleX", 0.0f, 1.0f), PropertyValuesHolder.ofFloat("scaleY", 0.0f, 1.0f)).setDuration(500L);
        duration.setInterpolator(bt0.f);
        duration.setStartDelay(i);
        duration.addListener(new C0226a(view));
        return duration;
    }

    /* JADX INFO: renamed from: g */
    public final void m7558g() {
        xdl0.M0(this.f4790e, false);
        xdl0.M0(this.f4793h, false);
        xdl0.M0(this.f4795j, false);
        xdl0.M0(this.f4797l, false);
        xdl0.M0(this.f4799n, false);
        int i = 0;
        while (true) {
            ImageView[] imageViewArr = this.f4801p;
            if (i >= imageViewArr.length) {
                return;
            }
            xdl0.M0(imageViewArr[i], false);
            this.f4801p[i].setTranslationX(0.0f);
            this.f4801p[i].setTranslationY(0.0f);
            i++;
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m7559h(ImageView imageView, View view, x2c x2cVar) {
        int left = imageView.getLeft() + (imageView.getMeasuredWidth() / 2);
        float fFloatValue = new BigDecimal((view.getTop() + (view.getMeasuredHeight() / 2)) - (imageView.getTop() + (imageView.getMeasuredHeight() / 2))).divide(new BigDecimal((view.getLeft() + (view.getMeasuredWidth() / 2)) - left), 2, 4).floatValue();
        x2cVar.m27151c(fFloatValue);
        imageView.setTag(Float.valueOf(fFloatValue));
    }

    /* JADX INFO: renamed from: i */
    public final void m7560i() {
        for (int i = 0; i < this.f4801p.length; i++) {
            x2c x2cVar = new x2c();
            if (xdl0.w0() < 960) {
                x2cVar.m27150b(t100.d(2.0f));
            }
            m7559h(this.f4801p[i], this.f4802q[i], x2cVar);
            this.f4801p[i].setImageDrawable(x2cVar);
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m7561j() {
        this.f4803r = new VDraweeView[]{this.f4794i, this.f4796k, this.f4798m, this.f4800o};
        this.f4801p = new ImageView[]{this.f4786a, this.f4787b, this.f4788c, this.f4789d};
        this.f4802q = new View[]{this.f4793h, this.f4795j, this.f4797l, this.f4799n};
        this.f4804s = new int[]{60, -60, 40, -50};
        ArrayList arrayList = new ArrayList(4);
        this.f4805t = arrayList;
        arrayList.add(vwb.Y(89, -30));
        this.f4805t.add(vwb.Y(-65, -13));
        this.f4805t.add(vwb.Y(80, 76));
        this.f4805t.add(vwb.Y(-40, 65));
        if (xdl0.w0() < 960) {
            setScale(0.6f);
        }
    }

    /* JADX INFO: renamed from: k */
    public void m7562k() {
        m7563l(false);
    }

    /* JADX INFO: renamed from: l */
    public void m7563l(boolean z) {
        if (!this.f4808w) {
            this.f4809x = true;
            return;
        }
        if (this.f4807v) {
            return;
        }
        boolean z2 = this.f4806u;
        if (!z2 || z) {
            if (z2 && z) {
                m7558g();
            }
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.addListener(new C0227b());
            ObjectAnimator duration = ObjectAnimator.ofPropertyValuesHolder(this.f4790e, PropertyValuesHolder.ofFloat("alpha", 0.0f, 1.0f), PropertyValuesHolder.ofFloat("scaleX", 0.0f, 1.0f), PropertyValuesHolder.ofFloat("scaleY", 0.0f, 1.0f)).setDuration(500L);
            duration.setInterpolator(bt0.f);
            duration.setStartDelay(100L);
            duration.addListener(new C0228c(animatorSet));
            duration.start();
            this.f4807v = true;
            this.f4806u = true;
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m7556e(this);
        String str = ((Media) CoreModule.f1534c.f3628e0.m21490p9().picture(0)).url;
        if (!TextUtils.isEmpty(str)) {
            this.f4791f.setImageUrl(str);
        }
        m7561j();
        setUpResource(getSeeHazyResource());
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        for (int i5 = 0; i5 < this.f4802q.length; i5++) {
            int left = this.f4790e.getLeft() + t100.d(((Integer) this.f4805t.get(i5).a).intValue());
            int top = this.f4790e.getTop() + t100.d(((Integer) this.f4805t.get(i5).b).intValue());
            View view = this.f4802q[i5];
            view.layout(left, top, view.getMeasuredWidth() + left, this.f4802q[i5].getMeasuredHeight() + top);
        }
        m7560i();
        this.f4808w = true;
        if (this.f4809x) {
            post(new Runnable() { // from class: l.nnf
                @Override // java.lang.Runnable
                public final void run() {
                    this.f17755a.m7562k();
                }
            });
            this.f4809x = false;
        }
    }

    public void setCenterAvatarBackgroundDrawable(@DrawableRes int i) {
        this.f4790e.setBackgroundResource(i);
    }

    public void setCenterIcon(@DrawableRes int i) {
        this.f4792g.setImageResource(i);
    }

    public void setScale(float f) {
        if (this.f4810y == f) {
            return;
        }
        this.f4810y = f;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f4790e.getLayoutParams();
        layoutParams.width = (int) (layoutParams.width * f);
        layoutParams.height = (int) (layoutParams.height * f);
        this.f4790e.setLayoutParams(layoutParams);
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.f4791f.getLayoutParams();
        layoutParams2.width = (int) (layoutParams2.width * f);
        layoutParams2.height = (int) (layoutParams2.height * f);
        this.f4791f.setLayoutParams(layoutParams2);
        AutoVDraweeView autoVDraweeView = this.f4791f;
        autoVDraweeView.setPadding((int) (autoVDraweeView.getPaddingLeft() * f), (int) (this.f4791f.getPaddingTop() * f), (int) (this.f4791f.getPaddingRight() * f), (int) (this.f4791f.getPaddingBottom() * f));
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) this.f4792g.getLayoutParams();
        layoutParams3.width = (int) (layoutParams3.width * f);
        layoutParams3.height = (int) (layoutParams3.height * f);
        layoutParams3.bottomMargin = (int) (layoutParams3.bottomMargin * f);
        this.f4792g.setLayoutParams(layoutParams3);
        for (int i = 0; i < 4; i++) {
            FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) this.f4802q[i].getLayoutParams();
            layoutParams4.width = (int) (layoutParams4.width * f);
            layoutParams4.height = (int) (layoutParams4.height * f);
            this.f4802q[i].setLayoutParams(layoutParams4);
            FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) this.f4803r[i].getLayoutParams();
            layoutParams5.width = (int) (layoutParams5.width * f);
            layoutParams5.height = (int) (layoutParams5.height * f);
            this.f4803r[i].setLayoutParams(layoutParams5);
            View view = this.f4803r[i];
            view.setPadding((int) (view.getPaddingLeft() * f), (int) (this.f4803r[i].getPaddingTop() * f), (int) (this.f4803r[i].getPaddingRight() * f), (int) (this.f4803r[i].getPaddingBottom() * f));
            FrameLayout.LayoutParams layoutParams6 = (FrameLayout.LayoutParams) this.f4801p[i].getLayoutParams();
            layoutParams6.width = (int) (layoutParams6.width * f);
            layoutParams6.height = (int) (layoutParams6.height * f);
            this.f4801p[i].setLayoutParams(layoutParams6);
            int[] iArr = this.f4804s;
            iArr[i] = (int) (iArr[i] * f);
            List<j760<Integer, Integer>> list = this.f4805t;
            list.set(i, vwb.Y(Integer.valueOf((int) (((Integer) list.get(i).a).intValue() * f)), Integer.valueOf((int) (((Integer) this.f4805t.get(i).b).intValue() * f))));
        }
    }

    public void setUpResource(int[] iArr) {
        int i = 0;
        while (true) {
            SimpleDraweeView[] simpleDraweeViewArr = this.f4803r;
            if (i >= simpleDraweeViewArr.length) {
                return;
            }
            qib0.f19782G.m12767Y0(simpleDraweeViewArr[i], iArr[i]);
            i++;
        }
    }

    public ExplodeLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4806u = false;
        this.f4807v = false;
        this.f4810y = 1.0f;
    }

    public ExplodeLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f4806u = false;
        this.f4807v = false;
        this.f4810y = 1.0f;
    }
}
