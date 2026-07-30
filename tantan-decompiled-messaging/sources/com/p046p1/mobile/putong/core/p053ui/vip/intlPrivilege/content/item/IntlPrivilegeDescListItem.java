package com.p046p1.mobile.putong.core.p053ui.vip.intlPrivilege.content.item;

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
import com.p046p1.mobile.putong.app.PutongFrag;
import com.p046p1.mobile.putong.core.data.Privilege;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.p053ui.vip.intlPrivilege.content.item.IntlPrivilegeDescListItem;
import com.tantanapp.common.utils.NullChecker;
import p147v.VIcon;
import p147v.VLinear;
import p147v.VText;
import p149l.sab0;
import p149l.t100;
import p149l.txo;
import p149l.uxo;
import p149l.x2c0;
import p149l.xdl0;

/* JADX INFO: loaded from: classes9.dex */
public class IntlPrivilegeDescListItem extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public VIcon f37151a;

    /* JADX INFO: renamed from: b */
    public VLinear f37152b;

    /* JADX INFO: renamed from: c */
    public VText f37153c;

    /* JADX INFO: renamed from: d */
    public VText f37154d;

    /* JADX INFO: renamed from: e */
    public Integer f37155e;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.intlPrivilege.content.item.IntlPrivilegeDescListItem$a */
    public class C8952a extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ VText f37156a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f37157b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ Runnable f37158c;

        public C8952a(VText vText, int i, Runnable runnable) {
            this.f37156a = vText;
            this.f37157b = i;
            this.f37158c = runnable;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ViewGroup.LayoutParams layoutParams = this.f37156a.getLayoutParams();
            if (layoutParams != null) {
                int i = this.f37157b;
                if (i == -2 || i == -1) {
                    layoutParams.height = i;
                } else {
                    layoutParams.height = -2;
                }
                this.f37156a.setLayoutParams(layoutParams);
            }
            this.f37156a.setVisibility(0);
            this.f37156a.setAlpha(1.0f);
            Runnable runnable = this.f37158c;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public IntlPrivilegeDescListItem(Context context) {
        super(context);
        this.f37155e = null;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m56490b(VText vText, ValueAnimator valueAnimator) {
        int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        ViewGroup.LayoutParams layoutParams = vText.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = iIntValue;
            vText.setLayoutParams(layoutParams);
        }
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m56492d(C8953b c8953b, View view) {
        C8953b.a aVar = c8953b.f37162c;
        if (aVar != null) {
            aVar.mo56483a(view, c8953b.f37163d);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m56493e(View view) {
        uxo.m196185a(this, view);
    }

    /* JADX INFO: renamed from: f */
    public void m56494f(final VText vText, final Runnable runnable) {
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
                this.f146227a.m56496h(vText, viewGroup, runnable);
            }
        });
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m56495g(int i, final VText vText, int i2, Runnable runnable) {
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, i);
        valueAnimatorOfInt.setDuration(500L);
        valueAnimatorOfInt.setInterpolator(new AccelerateDecelerateInterpolator());
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.rxo
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                IntlPrivilegeDescListItem.m56490b(vText, valueAnimator);
            }
        });
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(vText, "alpha", 0.0f, 1.0f);
        objectAnimatorOfFloat.setDuration(500L);
        objectAnimatorOfFloat.setInterpolator(new AccelerateDecelerateInterpolator());
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(valueAnimatorOfInt, objectAnimatorOfFloat);
        animatorSet.addListener(new C8952a(vText, i2, runnable));
        animatorSet.start();
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m56496h(final VText vText, ViewGroup viewGroup, final Runnable runnable) {
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
                this.f156853a.m56495g(measuredHeight, vText, i, runnable);
            }
        });
    }

    /* JADX INFO: renamed from: i */
    public void m56497i(final C8953b c8953b, PutongFrag putongFrag) {
        int i;
        boolean z = c8953b.f37165f;
        if (sab0.m182904v(c8953b.f37164e)) {
            i = x2c0.f190485qa;
        } else {
            i = z ? x2c0.f190421oa : x2c0.f190453pa;
        }
        this.f37151a.setImageResource(i);
        Integer num = this.f37155e;
        if (num != null) {
            this.f37153c.setTextColor(num.intValue());
            this.f37154d.setTextColor(this.f37155e.intValue());
        }
        this.f37153c.setText(c8953b.f37160a);
        if (z && NullChecker.m81303a(c8953b.f37161b) && !TextUtils.isEmpty(c8953b.f37161b)) {
            this.f37154d.setText(c8953b.f37161b);
            xdl0.m208344M(this.f37154d, true);
        } else {
            xdl0.m208344M(this.f37154d, false);
        }
        this.f37153c.setTypeface(this.f37154d.getTypeface(), 1);
        xdl0.m208360X(this.f37153c, 0);
        xdl0.m208358V(this.f37152b, t100.f167262k);
        setOnClickListener(new View.OnClickListener() { // from class: l.mxo
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                IntlPrivilegeDescListItem.m56492d(c8953b, view);
            }
        });
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m56493e(this);
    }

    public void setPrivilegeTextColor(int i) {
        this.f37155e = Integer.valueOf(i);
    }

    public IntlPrivilegeDescListItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f37155e = null;
    }

    public IntlPrivilegeDescListItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f37155e = null;
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.intlPrivilege.content.item.IntlPrivilegeDescListItem$b */
    public static class C8953b implements txo {

        /* JADX INFO: renamed from: a */
        public String f37160a;

        /* JADX INFO: renamed from: b */
        public String f37161b;

        /* JADX INFO: renamed from: c */
        public a f37162c;

        /* JADX INFO: renamed from: d */
        public Privilege f37163d;

        /* JADX INFO: renamed from: e */
        public PurchaseType f37164e;

        /* JADX INFO: renamed from: f */
        public boolean f37165f;

        /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.intlPrivilege.content.item.IntlPrivilegeDescListItem$b$a */
        public interface a {
            /* JADX INFO: renamed from: a */
            void mo56483a(View view, Privilege privilege);
        }

        public C8953b(String str, Privilege privilege, PurchaseType purchaseType, a aVar) {
            this.f37165f = true;
            this.f37160a = str;
            this.f37163d = privilege;
            this.f37162c = aVar;
            this.f37164e = purchaseType;
        }

        @Override // p149l.txo
        public int getItemType() {
            return 0;
        }

        public C8953b(String str, Privilege privilege, PurchaseType purchaseType) {
            this(str, privilege, purchaseType, null);
        }
    }
}
