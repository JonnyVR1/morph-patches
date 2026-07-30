package com.p046p1.mobile.putong.core.p053ui.purchase.privilege;

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
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.data.LookingFor;
import com.p046p1.mobile.putong.data.Settings;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import p147v.AutoVDraweeView;
import p147v.VDraweeView;
import p147v.VImage;
import p149l.bt0;
import p149l.d3c0;
import p149l.j760;
import p149l.onf;
import p149l.qib0;
import p149l.t100;
import p149l.vwb;
import p149l.x2c;
import p149l.xdl0;

/* JADX INFO: loaded from: classes9.dex */
public class ExplodeLayout extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public ImageView f35005a;

    /* JADX INFO: renamed from: b */
    public ImageView f35006b;

    /* JADX INFO: renamed from: c */
    public ImageView f35007c;

    /* JADX INFO: renamed from: d */
    public ImageView f35008d;

    /* JADX INFO: renamed from: e */
    public FrameLayout f35009e;

    /* JADX INFO: renamed from: f */
    public AutoVDraweeView f35010f;

    /* JADX INFO: renamed from: g */
    public VImage f35011g;

    /* JADX INFO: renamed from: h */
    public FrameLayout f35012h;

    /* JADX INFO: renamed from: i */
    public AutoVDraweeView f35013i;

    /* JADX INFO: renamed from: j */
    public FrameLayout f35014j;

    /* JADX INFO: renamed from: k */
    public AutoVDraweeView f35015k;

    /* JADX INFO: renamed from: l */
    public FrameLayout f35016l;

    /* JADX INFO: renamed from: m */
    public AutoVDraweeView f35017m;

    /* JADX INFO: renamed from: n */
    public FrameLayout f35018n;

    /* JADX INFO: renamed from: o */
    public AutoVDraweeView f35019o;

    /* JADX INFO: renamed from: p */
    public ImageView[] f35020p;

    /* JADX INFO: renamed from: q */
    public View[] f35021q;

    /* JADX INFO: renamed from: r */
    public VDraweeView[] f35022r;

    /* JADX INFO: renamed from: s */
    public int[] f35023s;

    /* JADX INFO: renamed from: t */
    public List<j760<Integer, Integer>> f35024t;

    /* JADX INFO: renamed from: u */
    public boolean f35025u;

    /* JADX INFO: renamed from: v */
    public boolean f35026v;

    /* JADX INFO: renamed from: w */
    public boolean f35027w;

    /* JADX INFO: renamed from: x */
    public boolean f35028x;

    /* JADX INFO: renamed from: y */
    public float f35029y;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.purchase.privilege.ExplodeLayout$a */
    public class C8790a extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ View f35030a;

        public C8790a(View view) {
            this.f35030a = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            xdl0.m208345M0(this.f35030a, true);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.purchase.privilege.ExplodeLayout$b */
    public class C8791b extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.purchase.privilege.ExplodeLayout$b$a */
        public class a extends bt0.C15966j {
            public a() {
            }

            @Override // p149l.bt0.C15966j, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                ExplodeLayout.this.f35026v = false;
            }
        }

        public C8791b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            for (int i = 0; i < ExplodeLayout.this.f35020p.length; i++) {
                xdl0.m208345M0(ExplodeLayout.this.f35020p[i], true);
                ExplodeLayout.this.f35020p[i].animate().translationX(t100.m186890d(ExplodeLayout.this.f35023s[i])).translationY(t100.m186890d(ExplodeLayout.this.f35023s[i]) * ((Float) ExplodeLayout.this.f35020p[i].getTag()).floatValue()).setInterpolator(bt0.f77155b).setListener(new a()).setDuration(1000L).start();
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.purchase.privilege.ExplodeLayout$c */
    public class C8792c extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ AnimatorSet f35034a;

        public C8792c(AnimatorSet animatorSet) {
            this.f35034a = animatorSet;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            AnimatorSet animatorSet = this.f35034a;
            ExplodeLayout explodeLayout = ExplodeLayout.this;
            ObjectAnimator objectAnimatorM54222f = explodeLayout.m54222f(explodeLayout.f35012h, 150);
            ExplodeLayout explodeLayout2 = ExplodeLayout.this;
            ObjectAnimator objectAnimatorM54222f2 = explodeLayout2.m54222f(explodeLayout2.f35014j, 200);
            ExplodeLayout explodeLayout3 = ExplodeLayout.this;
            ObjectAnimator objectAnimatorM54222f3 = explodeLayout3.m54222f(explodeLayout3.f35016l, 50);
            ExplodeLayout explodeLayout4 = ExplodeLayout.this;
            animatorSet.playTogether(objectAnimatorM54222f, objectAnimatorM54222f2, objectAnimatorM54222f3, explodeLayout4.m54222f(explodeLayout4.f35018n, 100));
            this.f35034a.setStartDelay(150L);
            this.f35034a.start();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            xdl0.m208345M0(ExplodeLayout.this.f35009e, true);
        }
    }

    public ExplodeLayout(@NonNull Context context) {
        super(context);
        this.f35025u = false;
        this.f35026v = false;
        this.f35029y = 1.0f;
    }

    private int[] getSeeHazyResource() {
        Settings settings = CoreModule.f17545c.f19639e0.m169527p9().settings;
        LookingFor lookingFor = settings == null ? LookingFor.get("unknown_") : settings.getLookingFor();
        if (TEnum.equals(lookingFor, "female")) {
            return new int[]{d3c0.f83681Nb, d3c0.f83695Ob, d3c0.f83709Pb, d3c0.f83723Qb};
        }
        return TEnum.equals(lookingFor, "male") ? new int[]{d3c0.f83736Rb, d3c0.f83749Sb, d3c0.f83762Tb, d3c0.f83775Ub} : new int[]{d3c0.f83681Nb, d3c0.f83749Sb, d3c0.f83762Tb, d3c0.f83723Qb};
    }

    /* JADX INFO: renamed from: e */
    public final void m54221e(View view) {
        onf.m165180a(this, view);
    }

    /* JADX INFO: renamed from: f */
    public final ObjectAnimator m54222f(View view, int i) {
        ObjectAnimator duration = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat("alpha", 0.0f, 1.0f), PropertyValuesHolder.ofFloat("scaleX", 0.0f, 1.0f), PropertyValuesHolder.ofFloat("scaleY", 0.0f, 1.0f)).setDuration(500L);
        duration.setInterpolator(bt0.f77159f);
        duration.setStartDelay(i);
        duration.addListener(new C8790a(view));
        return duration;
    }

    /* JADX INFO: renamed from: g */
    public final void m54223g() {
        xdl0.m208345M0(this.f35009e, false);
        xdl0.m208345M0(this.f35012h, false);
        xdl0.m208345M0(this.f35014j, false);
        xdl0.m208345M0(this.f35016l, false);
        xdl0.m208345M0(this.f35018n, false);
        int i = 0;
        while (true) {
            ImageView[] imageViewArr = this.f35020p;
            if (i >= imageViewArr.length) {
                return;
            }
            xdl0.m208345M0(imageViewArr[i], false);
            this.f35020p[i].setTranslationX(0.0f);
            this.f35020p[i].setTranslationY(0.0f);
            i++;
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m54224h(ImageView imageView, View view, x2c x2cVar) {
        int left = imageView.getLeft() + (imageView.getMeasuredWidth() / 2);
        float fFloatValue = new BigDecimal((view.getTop() + (view.getMeasuredHeight() / 2)) - (imageView.getTop() + (imageView.getMeasuredHeight() / 2))).divide(new BigDecimal((view.getLeft() + (view.getMeasuredWidth() / 2)) - left), 2, 4).floatValue();
        x2cVar.m206850c(fFloatValue);
        imageView.setTag(Float.valueOf(fFloatValue));
    }

    /* JADX INFO: renamed from: i */
    public final void m54225i() {
        for (int i = 0; i < this.f35020p.length; i++) {
            x2c x2cVar = new x2c();
            if (xdl0.m208408w0() < 960) {
                x2cVar.m206849b(t100.m186890d(2.0f));
            }
            m54224h(this.f35020p[i], this.f35021q[i], x2cVar);
            this.f35020p[i].setImageDrawable(x2cVar);
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m54226j() {
        this.f35022r = new VDraweeView[]{this.f35013i, this.f35015k, this.f35017m, this.f35019o};
        this.f35020p = new ImageView[]{this.f35005a, this.f35006b, this.f35007c, this.f35008d};
        this.f35021q = new View[]{this.f35012h, this.f35014j, this.f35016l, this.f35018n};
        this.f35023s = new int[]{60, -60, 40, -50};
        ArrayList arrayList = new ArrayList(4);
        this.f35024t = arrayList;
        arrayList.add(vwb.m200311Y(89, -30));
        this.f35024t.add(vwb.m200311Y(-65, -13));
        this.f35024t.add(vwb.m200311Y(80, 76));
        this.f35024t.add(vwb.m200311Y(-40, 65));
        if (xdl0.m208408w0() < 960) {
            setScale(0.6f);
        }
    }

    /* JADX INFO: renamed from: k */
    public void m54227k() {
        m54228l(false);
    }

    /* JADX INFO: renamed from: l */
    public void m54228l(boolean z) {
        if (!this.f35027w) {
            this.f35028x = true;
            return;
        }
        if (this.f35026v) {
            return;
        }
        boolean z2 = this.f35025u;
        if (!z2 || z) {
            if (z2 && z) {
                m54223g();
            }
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.addListener(new C8791b());
            ObjectAnimator duration = ObjectAnimator.ofPropertyValuesHolder(this.f35009e, PropertyValuesHolder.ofFloat("alpha", 0.0f, 1.0f), PropertyValuesHolder.ofFloat("scaleX", 0.0f, 1.0f), PropertyValuesHolder.ofFloat("scaleY", 0.0f, 1.0f)).setDuration(500L);
            duration.setInterpolator(bt0.f77159f);
            duration.setStartDelay(100L);
            duration.addListener(new C8792c(animatorSet));
            duration.start();
            this.f35026v = true;
            this.f35025u = true;
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m54221e(this);
        String str = CoreModule.f17545c.f19639e0.m169527p9().picture(0).url;
        if (!TextUtils.isEmpty(str)) {
            this.f35010f.setImageUrl(str);
        }
        m54226j();
        setUpResource(getSeeHazyResource());
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        for (int i5 = 0; i5 < this.f35021q.length; i5++) {
            int left = this.f35009e.getLeft() + t100.m186890d(this.f35024t.get(i5).f116564a.intValue());
            int top = this.f35009e.getTop() + t100.m186890d(this.f35024t.get(i5).f116565b.intValue());
            View view = this.f35021q[i5];
            view.layout(left, top, view.getMeasuredWidth() + left, this.f35021q[i5].getMeasuredHeight() + top);
        }
        m54225i();
        this.f35027w = true;
        if (this.f35028x) {
            post(new Runnable() { // from class: l.nnf
                @Override // java.lang.Runnable
                public final void run() {
                    this.f139726a.m54227k();
                }
            });
            this.f35028x = false;
        }
    }

    public void setCenterAvatarBackgroundDrawable(@DrawableRes int i) {
        this.f35009e.setBackgroundResource(i);
    }

    public void setCenterIcon(@DrawableRes int i) {
        this.f35011g.setImageResource(i);
    }

    public void setScale(float f) {
        if (this.f35029y == f) {
            return;
        }
        this.f35029y = f;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f35009e.getLayoutParams();
        layoutParams.width = (int) (layoutParams.width * f);
        layoutParams.height = (int) (layoutParams.height * f);
        this.f35009e.setLayoutParams(layoutParams);
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.f35010f.getLayoutParams();
        layoutParams2.width = (int) (layoutParams2.width * f);
        layoutParams2.height = (int) (layoutParams2.height * f);
        this.f35010f.setLayoutParams(layoutParams2);
        AutoVDraweeView autoVDraweeView = this.f35010f;
        autoVDraweeView.setPadding((int) (autoVDraweeView.getPaddingLeft() * f), (int) (this.f35010f.getPaddingTop() * f), (int) (this.f35010f.getPaddingRight() * f), (int) (this.f35010f.getPaddingBottom() * f));
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) this.f35011g.getLayoutParams();
        layoutParams3.width = (int) (layoutParams3.width * f);
        layoutParams3.height = (int) (layoutParams3.height * f);
        layoutParams3.bottomMargin = (int) (layoutParams3.bottomMargin * f);
        this.f35011g.setLayoutParams(layoutParams3);
        for (int i = 0; i < 4; i++) {
            FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) this.f35021q[i].getLayoutParams();
            layoutParams4.width = (int) (layoutParams4.width * f);
            layoutParams4.height = (int) (layoutParams4.height * f);
            this.f35021q[i].setLayoutParams(layoutParams4);
            FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) this.f35022r[i].getLayoutParams();
            layoutParams5.width = (int) (layoutParams5.width * f);
            layoutParams5.height = (int) (layoutParams5.height * f);
            this.f35022r[i].setLayoutParams(layoutParams5);
            VDraweeView vDraweeView = this.f35022r[i];
            vDraweeView.setPadding((int) (vDraweeView.getPaddingLeft() * f), (int) (this.f35022r[i].getPaddingTop() * f), (int) (this.f35022r[i].getPaddingRight() * f), (int) (this.f35022r[i].getPaddingBottom() * f));
            FrameLayout.LayoutParams layoutParams6 = (FrameLayout.LayoutParams) this.f35020p[i].getLayoutParams();
            layoutParams6.width = (int) (layoutParams6.width * f);
            layoutParams6.height = (int) (layoutParams6.height * f);
            this.f35020p[i].setLayoutParams(layoutParams6);
            int[] iArr = this.f35023s;
            iArr[i] = (int) (iArr[i] * f);
            List<j760<Integer, Integer>> list = this.f35024t;
            list.set(i, vwb.m200311Y(Integer.valueOf((int) (list.get(i).f116564a.intValue() * f)), Integer.valueOf((int) (this.f35024t.get(i).f116565b.intValue() * f))));
        }
    }

    public void setUpResource(int[] iArr) {
        int i = 0;
        while (true) {
            VDraweeView[] vDraweeViewArr = this.f35022r;
            if (i >= vDraweeViewArr.length) {
                return;
            }
            qib0.f154691G.m102354Y0(vDraweeViewArr[i], iArr[i]);
            i++;
        }
    }

    public ExplodeLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f35025u = false;
        this.f35026v = false;
        this.f35029y = 1.0f;
    }

    public ExplodeLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f35025u = false;
        this.f35026v = false;
        this.f35029y = 1.0f;
    }
}
