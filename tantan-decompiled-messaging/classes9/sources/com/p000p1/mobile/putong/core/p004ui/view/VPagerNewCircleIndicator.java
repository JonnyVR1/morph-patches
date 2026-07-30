package com.p000p1.mobile.putong.core.p004ui.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.database.DataSetObserver;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import androidx.viewpager.widget.ViewPager;
import java.util.ArrayList;
import java.util.List;
import l.qkq0;
import l.t100;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class VPagerNewCircleIndicator extends LinearLayout implements ViewPager.j {

    /* JADX INFO: renamed from: p */
    public static final int f6658p = t100.d(7.0f);

    /* JADX INFO: renamed from: q */
    public static final int f6659q = t100.d(8.0f);

    /* JADX INFO: renamed from: r */
    public static float[][] f6660r = {new float[]{0.0f, 0.5f}, new float[]{0.5f, 0.75f}, new float[]{0.75f, 1.0f}, new float[]{1.0f, 0.75f}, new float[]{0.75f, 0.5f}, new float[]{0.5f, 0.0f}};

    /* JADX INFO: renamed from: a */
    public final List<View> f6661a;

    /* JADX INFO: renamed from: b */
    public int f6662b;

    /* JADX INFO: renamed from: c */
    public int f6663c;

    /* JADX INFO: renamed from: d */
    public View f6664d;

    /* JADX INFO: renamed from: e */
    public ViewPager f6665e;

    /* JADX INFO: renamed from: f */
    public int f6666f;

    /* JADX INFO: renamed from: g */
    public final int f6667g;

    /* JADX INFO: renamed from: h */
    public final int f6668h;

    /* JADX INFO: renamed from: i */
    public final int f6669i;

    /* JADX INFO: renamed from: j */
    public int f6670j;

    /* JADX INFO: renamed from: k */
    public int f6671k;

    /* JADX INFO: renamed from: l */
    public AnimatorSet f6672l;

    /* JADX INFO: renamed from: m */
    public LinearLayout f6673m;

    /* JADX INFO: renamed from: n */
    public boolean f6674n;

    /* JADX INFO: renamed from: o */
    public DataSetObserver f6675o;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.view.VPagerNewCircleIndicator$a */
    public class C0367a extends AnimatorListenerAdapter {
        public C0367a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            VPagerNewCircleIndicator.this.f6673m.setTranslationX(0.0f);
            VPagerNewCircleIndicator vPagerNewCircleIndicator = VPagerNewCircleIndicator.this;
            vPagerNewCircleIndicator.setColorByPosition(vPagerNewCircleIndicator.f6663c + 1);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.view.VPagerNewCircleIndicator$b */
    public class C0368b extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ boolean f6677a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ View f6678b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ int f6679c;

        public C0368b(boolean z, View view, int i) {
            this.f6677a = z;
            this.f6678b = view;
            this.f6679c = i;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f6677a) {
                this.f6678b.setScaleX(VPagerNewCircleIndicator.f6660r[this.f6679c][0]);
                this.f6678b.setScaleY(VPagerNewCircleIndicator.f6660r[this.f6679c][0]);
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.view.VPagerNewCircleIndicator$c */
    public class C0369c extends DataSetObserver {
        public C0369c() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            VPagerNewCircleIndicator.this.m9603h();
        }
    }

    public VPagerNewCircleIndicator(Context context) {
        super(context);
        this.f6661a = new ArrayList();
        this.f6662b = 0;
        this.f6663c = 0;
        this.f6664d = null;
        this.f6666f = 0;
        this.f6667g = -1;
        this.f6668h = 0;
        this.f6669i = 1;
        this.f6670j = 671088640;
        this.f6671k = -27861;
        this.f6674n = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public void m9603h() {
        setClipChildren(true);
        removeAllViews();
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams == null && !this.f6674n) {
            post(new Runnable() { // from class: l.tpk0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f22229a.m9604j();
                }
            });
            return;
        }
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(-2, -2);
        }
        int i = f6658p;
        int i2 = f6659q;
        layoutParams.width = (i * 7) + (i2 * 6);
        setLayoutParams(layoutParams);
        LinearLayout linearLayout = new LinearLayout(getContext());
        this.f6673m = linearLayout;
        linearLayout.setClipChildren(true);
        this.f6673m.setOrientation(0);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.width = (i * 9) + (i2 * 8);
        layoutParams2.gravity = 17;
        layoutParams2.leftMargin = (-i) - i2;
        this.f6673m.setLayoutParams(layoutParams2);
        for (int i3 = 0; i3 < 9; i3++) {
            View view = new View(getContext());
            m9607k(view, this.f6670j);
            int i4 = f6658p;
            LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(i4, i4);
            layoutParams3.rightMargin = f6659q;
            this.f6673m.addView(view, layoutParams3);
            this.f6661a.add(view);
        }
        addView(this.f6673m, layoutParams2);
        m9606i();
        setColorByPosition(1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public /* synthetic */ void m9604j() {
        this.f6674n = true;
        m9603h();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setColorByPosition(int i) {
        View view = this.f6664d;
        if (view != null) {
            m9607k(view, this.f6670j);
        }
        View view2 = this.f6661a.get(i);
        this.f6664d = view2;
        m9607k(view2, this.f6671k);
    }

    /* JADX INFO: renamed from: g */
    public final Animator m9605g(View view, int i, boolean z, boolean z2) {
        float[] fArr = z2 ? new float[]{view.getScaleX(), f6660r[i][1]} : f6660r[i];
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat("scaleX", fArr), PropertyValuesHolder.ofFloat("scaleY", fArr));
        objectAnimatorOfPropertyValuesHolder.addListener(new C0368b(z, view, i));
        objectAnimatorOfPropertyValuesHolder.setDuration(200L);
        return objectAnimatorOfPropertyValuesHolder;
    }

    public int getCount() {
        int size = this.f6661a.size() - 2;
        if (size < 0) {
            return 0;
        }
        return size;
    }

    /* JADX INFO: renamed from: i */
    public final void m9606i() {
        this.f6666f = 0;
        if (this.f6665e.getAdapter().getCount() - 7 >= 1) {
            List<View> list = this.f6661a;
            list.get(list.size() - 2).setScaleX(f6660r[1][0]);
            List<View> list2 = this.f6661a;
            list2.get(list2.size() - 2).setScaleY(f6660r[1][0]);
            List<View> list3 = this.f6661a;
            list3.get(list3.size() - 3).setScaleX(f6660r[2][0]);
            List<View> list4 = this.f6661a;
            list4.get(list4.size() - 3).setScaleY(f6660r[2][0]);
        }
        this.f6661a.get(1).setScaleX(f6660r[3][0]);
        this.f6661a.get(1).setScaleY(f6660r[3][0]);
        this.f6661a.get(2).setScaleX(f6660r[3][0]);
        this.f6661a.get(2).setScaleY(f6660r[3][0]);
    }

    /* JADX INFO: renamed from: k */
    public final void m9607k(View view, int i) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(t100.d(7.0f));
        gradientDrawable.setColor(i);
        view.setBackground(gradientDrawable);
    }

    /* JADX INFO: renamed from: l */
    public final void m9608l(boolean z, Animator.AnimatorListener animatorListener) {
        ArrayList arrayList = new ArrayList();
        AnimatorSet animatorSet = this.f6672l;
        if (animatorSet != null && animatorSet.isRunning()) {
            this.f6672l.cancel();
        }
        this.f6672l = new AnimatorSet();
        int i = z ? 2 : 0;
        if (this.f6665e.getAdapter().getCount() - (this.f6666f + 7) >= 1) {
            int i2 = i & 2;
            List<View> list = this.f6661a;
            if (i2 == 2) {
                arrayList.add(m9605g(list.get(list.size() - 2), 5, true, true));
                List<View> list2 = this.f6661a;
                arrayList.add(m9605g(list2.get(list2.size() - 3), 4, true, true));
                List<View> list3 = this.f6661a;
                arrayList.add(m9605g(list3.get(list3.size() - 4), 3, true, true));
            } else {
                arrayList.add(m9605g(list.get(list.size() - 1), 0, true, false));
                List<View> list4 = this.f6661a;
                arrayList.add(m9605g(list4.get(list4.size() - 2), 1, true, false));
                List<View> list5 = this.f6661a;
                arrayList.add(m9605g(list5.get(list5.size() - 3), 2, true, false));
            }
        } else if (this.f6665e.getAdapter().getCount() - (this.f6666f + 7) == 0) {
            List<View> list6 = this.f6661a;
            arrayList.add(m9605g(list6.get(list6.size() - 1), 2, false, true));
            List<View> list7 = this.f6661a;
            arrayList.add(m9605g(list7.get(list7.size() - 2), 2, false, true));
            List<View> list8 = this.f6661a;
            arrayList.add(m9605g(list8.get(list8.size() - 3), 2, false, true));
            i |= 4;
        }
        int i3 = this.f6666f;
        if (i3 == 1) {
            int i4 = i & 2;
            List<View> list9 = this.f6661a;
            if (i4 == 2) {
                arrayList.add(m9605g(list9.get(0), 0, true, false));
                arrayList.add(m9605g(this.f6661a.get(1), 1, true, false));
                arrayList.add(m9605g(this.f6661a.get(2), 2, true, false));
            } else {
                arrayList.add(m9605g(list9.get(1), 5, true, true));
                arrayList.add(m9605g(this.f6661a.get(2), 4, true, true));
                arrayList.add(m9605g(this.f6661a.get(3), 3, true, true));
            }
        } else if (i3 > 1) {
            int i5 = i & 2;
            List<View> list10 = this.f6661a;
            if (i5 == 2) {
                arrayList.add(m9605g(list10.get(0), 0, true, false));
                arrayList.add(m9605g(this.f6661a.get(1), 1, true, false));
                arrayList.add(m9605g(this.f6661a.get(2), 2, true, false));
            } else {
                arrayList.add(m9605g(list10.get(1), 5, true, false));
                arrayList.add(m9605g(this.f6661a.get(2), 4, true, false));
                arrayList.add(m9605g(this.f6661a.get(3), 3, true, false));
            }
        } else if (i3 == 0) {
            arrayList.add(m9605g(this.f6661a.get(1), 2, false, true));
            arrayList.add(m9605g(this.f6661a.get(2), 2, false, true));
            arrayList.add(m9605g(this.f6661a.get(3), 2, false, true));
            i |= 4;
        }
        int i6 = f6658p + f6659q;
        if ((i & 2) == 0) {
            i6 *= -1;
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f6673m, "translationX", 0.0f, i6);
        objectAnimatorOfFloat.addListener(animatorListener);
        arrayList.add(objectAnimatorOfFloat);
        this.f6672l.setDuration(200L);
        this.f6672l.playTogether(arrayList);
        this.f6672l.start();
    }

    public void onPageScrollStateChanged(int i) {
    }

    public void onPageScrolled(int i, float f, int i2) {
    }

    /* JADX WARN: Code duplicated, block: B:24:0x005a  */
    /* JADX WARN: Code duplicated, block: B:26:0x005e  */
    /* JADX WARN: Code duplicated, block: B:27:0x0060  */
    /* JADX WARN: Code duplicated, block: B:31:0x0068  */
    /* JADX WARN: Code duplicated, block: B:34:0x0072  */
    public void onPageSelected(int i) {
        byte b;
        int i2;
        int i3;
        int count = getCount();
        if (i != 0 || Math.abs(this.f6662b) - i <= 1) {
            int i4 = this.f6662b;
            if (i4 < i) {
                int i5 = count - 3;
                if (this.f6663c != i5 || i >= this.f6665e.getAdapter().getCount() - 2) {
                    this.f6663c++;
                } else {
                    this.f6663c = i5;
                    this.f6666f++;
                    b = 1;
                }
            } else if (i4 > i) {
                int i6 = this.f6663c;
                if (i6 != 2 || i < 2) {
                    this.f6663c = i6 - 1;
                } else {
                    this.f6663c = 2;
                    this.f6666f--;
                    b = -1;
                }
            }
            this.f6662b = i;
            if (b != 0) {
                setColorByPosition(this.f6663c + 1);
                return;
            }
            i2 = this.f6663c;
            if (b == -1) {
                i3 = i2 - 1;
            } else {
                i3 = i2 + 1;
            }
            setColorByPosition(i3 + 1);
            m9608l(b == -1, new C0367a());
        }
        this.f6663c = 0;
        this.f6666f = 0;
        m9606i();
        b = 0;
        this.f6662b = i;
        if (b != 0) {
            setColorByPosition(this.f6663c + 1);
            return;
        }
        i2 = this.f6663c;
        if (b == -1) {
            i3 = i2 - 1;
        } else {
            i3 = i2 + 1;
        }
        setColorByPosition(i3 + 1);
        m9608l(b == -1, new C0367a());
    }

    public void setNormalColor(int i) {
        this.f6670j = i;
    }

    public void setSelectedColor(int i) {
        this.f6671k = i;
    }

    public void setViewPager(ViewPager viewPager) {
        ViewPager viewPager2 = this.f6665e;
        if (viewPager2 == viewPager) {
            return;
        }
        if (viewPager2 != null) {
            viewPager2.P(this);
        }
        if (viewPager.getAdapter() == null) {
            qkq0.a("ViewPager does not have adapter instance.");
            return;
        }
        this.f6665e = viewPager;
        if (this.f6675o == null) {
            this.f6675o = new C0369c();
        } else {
            viewPager.getAdapter().unregisterDataSetObserver(this.f6675o);
        }
        this.f6665e.getAdapter().registerDataSetObserver(this.f6675o);
        this.f6665e.d(this);
        invalidate();
    }

    public VPagerNewCircleIndicator(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6661a = new ArrayList();
        this.f6662b = 0;
        this.f6663c = 0;
        this.f6664d = null;
        this.f6666f = 0;
        this.f6667g = -1;
        this.f6668h = 0;
        this.f6669i = 1;
        this.f6670j = 671088640;
        this.f6671k = -27861;
        this.f6674n = false;
    }

    public VPagerNewCircleIndicator(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f6661a = new ArrayList();
        this.f6662b = 0;
        this.f6663c = 0;
        this.f6664d = null;
        this.f6666f = 0;
        this.f6667g = -1;
        this.f6668h = 0;
        this.f6669i = 1;
        this.f6670j = 671088640;
        this.f6671k = -27861;
        this.f6674n = false;
    }
}
