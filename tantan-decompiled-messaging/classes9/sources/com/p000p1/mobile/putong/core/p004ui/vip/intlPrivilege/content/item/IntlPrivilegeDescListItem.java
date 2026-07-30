package com.p000p1.mobile.putong.core.p004ui.vip.intlPrivilege.content.item;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.LinearLayout;
import com.p000p1.mobile.putong.app.PutongFrag;
import com.p000p1.mobile.putong.core.p004ui.vip.intlPrivilege.content.item.IntlPrivilegeDescListItem;
import com.p1.mobile.putong.core.data.Privilege;
import com.p1.mobile.putong.core.data.PurchaseType;
import com.tantanapp.common.utils.NullChecker;
import l.sab0;
import l.t100;
import l.uxo;
import l.xdl0;
import p006l.txo;
import p006l.x2c0;
import v.VIcon;
import v.VLinear;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class IntlPrivilegeDescListItem extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public VIcon f6932a;

    /* JADX INFO: renamed from: b */
    public VLinear f6933b;

    /* JADX INFO: renamed from: c */
    public VText f6934c;

    /* JADX INFO: renamed from: d */
    public VText f6935d;

    /* JADX INFO: renamed from: e */
    public Integer f6936e;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.intlPrivilege.content.item.IntlPrivilegeDescListItem$a */
    public class C0388a extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ VText f6937a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f6938b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ Runnable f6939c;

        public C0388a(VText vText, int i, Runnable runnable) {
            this.f6937a = vText;
            this.f6938b = i;
            this.f6939c = runnable;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ViewGroup.LayoutParams layoutParams = this.f6937a.getLayoutParams();
            if (layoutParams != null) {
                int i = this.f6938b;
                if (i == -2 || i == -1) {
                    layoutParams.height = i;
                } else {
                    layoutParams.height = -2;
                }
                this.f6937a.setLayoutParams(layoutParams);
            }
            this.f6937a.setVisibility(0);
            this.f6937a.setAlpha(1.0f);
            Runnable runnable = this.f6939c;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public IntlPrivilegeDescListItem(Context context) {
        super(context);
        this.f6936e = null;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m9931b(VText vText, ValueAnimator valueAnimator) {
        int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        ViewGroup.LayoutParams layoutParams = vText.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = iIntValue;
            vText.setLayoutParams(layoutParams);
        }
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m9933d(C0389b c0389b, View view) {
        C0389b.a aVar = c0389b.f6943c;
        if (aVar != null) {
            aVar.mo9921a(view, c0389b.f6944d);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m9934e(View view) {
        uxo.a(this, view);
    }

    /* JADX INFO: renamed from: f */
    public void m9935f(final VText vText, final Runnable runnable) {
        if (vText == null) {
            return;
        }
        vText.setAlpha(0.0f);
        final ViewGroup viewGroup = (ViewGroup) vText.getParent();
        if (viewGroup != null) {
            viewGroup.setClipChildren(false);
        }
        vText.post(new Runnable() { // from class: l.oxo
            @Override // java.lang.Runnable
            public final void run() {
                this.f18479a.m9937h(vText, viewGroup, runnable);
            }
        });
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m9936g(int i, final VText vText, int i2, Runnable runnable) {
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, i);
        valueAnimatorOfInt.setDuration(500L);
        valueAnimatorOfInt.setInterpolator(new AccelerateDecelerateInterpolator());
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.rxo
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                IntlPrivilegeDescListItem.m9931b(vText, valueAnimator);
            }
        });
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(vText, "alpha", 0.0f, 1.0f);
        objectAnimatorOfFloat.setDuration(500L);
        objectAnimatorOfFloat.setInterpolator(new AccelerateDecelerateInterpolator());
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(valueAnimatorOfInt, objectAnimatorOfFloat);
        animatorSet.addListener(new C0388a(vText, i2, runnable));
        animatorSet.start();
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m9937h(final VText vText, ViewGroup viewGroup, final Runnable runnable) {
        int width;
        if (vText.getWidth() > 0) {
            width = vText.getWidth();
        } else {
            width = viewGroup != null ? viewGroup.getWidth() : 0;
        }
        vText.measure(View.MeasureSpec.makeMeasureSpec(width, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
        final int measuredHeight = vText.getMeasuredHeight();
        if (measuredHeight <= 0) {
            vText.setAlpha(1.0f);
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        ViewGroup.LayoutParams layoutParams = vText.getLayoutParams();
        final int i = layoutParams.height;
        vText.setVisibility(0);
        layoutParams.height = 0;
        vText.setLayoutParams(layoutParams);
        vText.requestLayout();
        vText.post(new Runnable() { // from class: l.qxo
            @Override // java.lang.Runnable
            public final void run() {
                this.f20145a.m9936g(measuredHeight, vText, i, runnable);
            }
        });
    }

    /* JADX INFO: renamed from: i */
    public void m9938i(final C0389b c0389b, PutongFrag putongFrag) {
        int i;
        boolean z = c0389b.f6946f;
        if (sab0.v(c0389b.f6945e)) {
            i = x2c0.f27021qa;
        } else {
            i = z ? x2c0.f26957oa : x2c0.f26989pa;
        }
        this.f6932a.setImageResource(i);
        Integer num = this.f6936e;
        if (num != null) {
            this.f6934c.setTextColor(num.intValue());
            this.f6935d.setTextColor(this.f6936e.intValue());
        }
        this.f6934c.setText(c0389b.f6941a);
        if (z && NullChecker.a(c0389b.f6942b) && !TextUtils.isEmpty(c0389b.f6942b)) {
            this.f6935d.setText(c0389b.f6942b);
            xdl0.M(this.f6935d, true);
        } else {
            xdl0.M(this.f6935d, false);
        }
        this.f6934c.setTypeface(this.f6935d.getTypeface(), 1);
        xdl0.X(this.f6934c, 0);
        xdl0.V(this.f6933b, t100.k);
        setOnClickListener(new View.OnClickListener() { // from class: l.mxo
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                IntlPrivilegeDescListItem.m9933d(c0389b, view);
            }
        });
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m9934e(this);
    }

    public void setPrivilegeTextColor(int i) {
        this.f6936e = Integer.valueOf(i);
    }

    public IntlPrivilegeDescListItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6936e = null;
    }

    public IntlPrivilegeDescListItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f6936e = null;
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.intlPrivilege.content.item.IntlPrivilegeDescListItem$b */
    public static class C0389b implements txo {

        /* JADX INFO: renamed from: a */
        public String f6941a;

        /* JADX INFO: renamed from: b */
        public String f6942b;

        /* JADX INFO: renamed from: c */
        public a f6943c;

        /* JADX INFO: renamed from: d */
        public Privilege f6944d;

        /* JADX INFO: renamed from: e */
        public PurchaseType f6945e;

        /* JADX INFO: renamed from: f */
        public boolean f6946f;

        /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.intlPrivilege.content.item.IntlPrivilegeDescListItem$b$a */
        public interface a {
            /* JADX INFO: renamed from: a */
            void mo9921a(View view, Privilege privilege);
        }

        public C0389b(String str, Privilege privilege, PurchaseType purchaseType, a aVar) {
            this.f6946f = true;
            this.f6941a = str;
            this.f6944d = privilege;
            this.f6943c = aVar;
            this.f6945e = purchaseType;
        }

        @Override // p006l.txo
        public int getItemType() {
            return 0;
        }

        public C0389b(String str, Privilege privilege, PurchaseType purchaseType) {
            this(str, privilege, purchaseType, null);
        }
    }
}
