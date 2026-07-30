package com.p051p1.mobile.putong.core.p058ui.vip.intlPrivilege.content.item;

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
import com.p051p1.mobile.putong.app.PutongFrag;
import com.p051p1.mobile.putong.core.data.Privilege;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.p058ui.vip.intlPrivilege.content.item.IntlPrivilegeDescListItem;
import com.tantanapp.common.utils.NullChecker;
import p151v.VIcon;
import p151v.VLinear;
import p151v.VText;
import p153l.bnl0;
import p153l.dbc0;
import p153l.qa00;
import p153l.tzo;
import p153l.uzo;
import p153l.wib0;

/* JADX INFO: loaded from: classes12.dex */
public class IntlPrivilegeDescListItem extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public VIcon f37999a;

    /* JADX INFO: renamed from: b */
    public VLinear f38000b;

    /* JADX INFO: renamed from: c */
    public VText f38001c;

    /* JADX INFO: renamed from: d */
    public VText f38002d;

    /* JADX INFO: renamed from: e */
    public Integer f38003e;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.intlPrivilege.content.item.IntlPrivilegeDescListItem$a */
    public class C9115a extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ VText f38004a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f38005b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ Runnable f38006c;

        public C9115a(VText vText, int i, Runnable runnable) {
            this.f38004a = vText;
            this.f38005b = i;
            this.f38006c = runnable;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ViewGroup.LayoutParams layoutParams = this.f38004a.getLayoutParams();
            if (layoutParams != null) {
                int i = this.f38005b;
                if (i == -2 || i == -1) {
                    layoutParams.height = i;
                } else {
                    layoutParams.height = -2;
                }
                this.f38004a.setLayoutParams(layoutParams);
            }
            this.f38004a.setVisibility(0);
            this.f38004a.setAlpha(1.0f);
            Runnable runnable = this.f38006c;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public IntlPrivilegeDescListItem(Context context) {
        super(context);
        this.f38003e = null;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m57673b(VText vText, ValueAnimator valueAnimator) {
        int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        ViewGroup.LayoutParams layoutParams = vText.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = iIntValue;
            vText.setLayoutParams(layoutParams);
        }
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m57675d(C9116b c9116b, View view) {
        C9116b.a aVar = c9116b.f38010c;
        if (aVar != null) {
            aVar.mo57666a(view, c9116b.f38011d);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m57676e(View view) {
        uzo.m198844a(this, view);
    }

    /* JADX INFO: renamed from: f */
    public void m57677f(final VText vText, final Runnable runnable) {
        if (vText == null) {
            return;
        }
        vText.setAlpha(0.0f);
        final ViewGroup viewGroup = (ViewGroup) vText.getParent();
        if (viewGroup != null) {
            viewGroup.setClipChildren(false);
        }
        vText.post(new Runnable() { // from class: l.ozo
            @Override // java.lang.Runnable
            public final void run() {
                this.f149935a.m57679h(vText, viewGroup, runnable);
            }
        });
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m57678g(int i, final VText vText, int i2, Runnable runnable) {
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, i);
        valueAnimatorOfInt.setDuration(500L);
        valueAnimatorOfInt.setInterpolator(new AccelerateDecelerateInterpolator());
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.rzo
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                IntlPrivilegeDescListItem.m57673b(vText, valueAnimator);
            }
        });
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(vText, "alpha", 0.0f, 1.0f);
        objectAnimatorOfFloat.setDuration(500L);
        objectAnimatorOfFloat.setInterpolator(new AccelerateDecelerateInterpolator());
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(valueAnimatorOfInt, objectAnimatorOfFloat);
        animatorSet.addListener(new C9115a(vText, i2, runnable));
        animatorSet.start();
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m57679h(final VText vText, ViewGroup viewGroup, final Runnable runnable) {
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
        vText.post(new Runnable() { // from class: l.qzo
            @Override // java.lang.Runnable
            public final void run() {
                this.f160285a.m57678g(measuredHeight, vText, i, runnable);
            }
        });
    }

    /* JADX INFO: renamed from: i */
    public void m57680i(final C9116b c9116b, PutongFrag putongFrag) {
        int i;
        boolean z = c9116b.f38013f;
        if (wib0.m206578v(c9116b.f38012e)) {
            i = dbc0.f87377ra;
        } else {
            i = z ? dbc0.f87311pa : dbc0.f87344qa;
        }
        this.f37999a.setImageResource(i);
        Integer num = this.f38003e;
        if (num != null) {
            this.f38001c.setTextColor(num.intValue());
            this.f38002d.setTextColor(this.f38003e.intValue());
        }
        this.f38001c.setText(c9116b.f38008a);
        if (z && NullChecker.m82486a(c9116b.f38009b) && !TextUtils.isEmpty(c9116b.f38009b)) {
            this.f38002d.setText(c9116b.f38009b);
            bnl0.m105524M(this.f38002d, true);
        } else {
            bnl0.m105524M(this.f38002d, false);
        }
        this.f38001c.setTypeface(this.f38002d.getTypeface(), 1);
        bnl0.m105540X(this.f38001c, 0);
        bnl0.m105538V(this.f38000b, qa00.f156324k);
        setOnClickListener(new View.OnClickListener() { // from class: l.mzo
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                IntlPrivilegeDescListItem.m57675d(c9116b, view);
            }
        });
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m57676e(this);
    }

    public void setPrivilegeTextColor(int i) {
        this.f38003e = Integer.valueOf(i);
    }

    public IntlPrivilegeDescListItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f38003e = null;
    }

    public IntlPrivilegeDescListItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f38003e = null;
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.intlPrivilege.content.item.IntlPrivilegeDescListItem$b */
    public static class C9116b implements tzo {

        /* JADX INFO: renamed from: a */
        public String f38008a;

        /* JADX INFO: renamed from: b */
        public String f38009b;

        /* JADX INFO: renamed from: c */
        public a f38010c;

        /* JADX INFO: renamed from: d */
        public Privilege f38011d;

        /* JADX INFO: renamed from: e */
        public PurchaseType f38012e;

        /* JADX INFO: renamed from: f */
        public boolean f38013f;

        /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.intlPrivilege.content.item.IntlPrivilegeDescListItem$b$a */
        public interface a {
            /* JADX INFO: renamed from: a */
            void mo57666a(View view, Privilege privilege);
        }

        public C9116b(String str, Privilege privilege, PurchaseType purchaseType, a aVar) {
            this.f38013f = true;
            this.f38008a = str;
            this.f38011d = privilege;
            this.f38010c = aVar;
            this.f38012e = purchaseType;
        }

        @Override // p153l.tzo
        public int getItemType() {
            return 0;
        }

        public C9116b(String str, Privilege privilege, PurchaseType purchaseType) {
            this(str, privilege, purchaseType, null);
        }
    }
}
