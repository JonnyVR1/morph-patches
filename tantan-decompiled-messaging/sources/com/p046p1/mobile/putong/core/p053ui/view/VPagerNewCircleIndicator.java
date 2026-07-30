package com.p046p1.mobile.putong.core.p053ui.view;

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
import com.tencent.p101mm.opensdk.constants.Build;
import java.util.ArrayList;
import java.util.List;
import p149l.qkq0;
import p149l.t100;

/* JADX INFO: loaded from: classes9.dex */
public class VPagerNewCircleIndicator extends LinearLayout implements ViewPager.InterfaceC0716j {

    /* JADX INFO: renamed from: p */
    public static final int f36877p = t100.m186890d(7.0f);

    /* JADX INFO: renamed from: q */
    public static final int f36878q = t100.m186890d(8.0f);

    /* JADX INFO: renamed from: r */
    public static float[][] f36879r = {new float[]{0.0f, 0.5f}, new float[]{0.5f, 0.75f}, new float[]{0.75f, 1.0f}, new float[]{1.0f, 0.75f}, new float[]{0.75f, 0.5f}, new float[]{0.5f, 0.0f}};

    /* JADX INFO: renamed from: a */
    public final List<View> f36880a;

    /* JADX INFO: renamed from: b */
    public int f36881b;

    /* JADX INFO: renamed from: c */
    public int f36882c;

    /* JADX INFO: renamed from: d */
    public View f36883d;

    /* JADX INFO: renamed from: e */
    public ViewPager f36884e;

    /* JADX INFO: renamed from: f */
    public int f36885f;

    /* JADX INFO: renamed from: g */
    public final int f36886g;

    /* JADX INFO: renamed from: h */
    public final int f36887h;

    /* JADX INFO: renamed from: i */
    public final int f36888i;

    /* JADX INFO: renamed from: j */
    public int f36889j;

    /* JADX INFO: renamed from: k */
    public int f36890k;

    /* JADX INFO: renamed from: l */
    public AnimatorSet f36891l;

    /* JADX INFO: renamed from: m */
    public LinearLayout f36892m;

    /* JADX INFO: renamed from: n */
    public boolean f36893n;

    /* JADX INFO: renamed from: o */
    public DataSetObserver f36894o;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.view.VPagerNewCircleIndicator$a */
    public class C8931a extends AnimatorListenerAdapter {
        public C8931a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            VPagerNewCircleIndicator.this.f36892m.setTranslationX(0.0f);
            VPagerNewCircleIndicator vPagerNewCircleIndicator = VPagerNewCircleIndicator.this;
            vPagerNewCircleIndicator.setColorByPosition(vPagerNewCircleIndicator.f36882c + 1);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.view.VPagerNewCircleIndicator$b */
    public class C8932b extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ boolean f36896a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ View f36897b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ int f36898c;

        public C8932b(boolean z, View view, int i) {
            this.f36896a = z;
            this.f36897b = view;
            this.f36898c = i;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f36896a) {
                this.f36897b.setScaleX(VPagerNewCircleIndicator.f36879r[this.f36898c][0]);
                this.f36897b.setScaleY(VPagerNewCircleIndicator.f36879r[this.f36898c][0]);
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.view.VPagerNewCircleIndicator$c */
    public class C8933c extends DataSetObserver {
        public C8933c() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            VPagerNewCircleIndicator.this.m56176h();
        }
    }

    public VPagerNewCircleIndicator(Context context) {
        super(context);
        this.f36880a = new ArrayList();
        this.f36881b = 0;
        this.f36882c = 0;
        this.f36883d = null;
        this.f36885f = 0;
        this.f36886g = -1;
        this.f36887h = 0;
        this.f36888i = 1;
        this.f36889j = Build.SUPPORT_SEND_MUSIC_VIDEO_MESSAGE;
        this.f36890k = -27861;
        this.f36893n = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public void m56176h() {
        setClipChildren(true);
        removeAllViews();
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams == null && !this.f36893n) {
            post(new Runnable() { // from class: l.tpk0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f171490a.m56177j();
                }
            });
            return;
        }
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(-2, -2);
        }
        int i = f36877p;
        int i2 = f36878q;
        layoutParams.width = (i * 7) + (i2 * 6);
        setLayoutParams(layoutParams);
        LinearLayout linearLayout = new LinearLayout(getContext());
        this.f36892m = linearLayout;
        linearLayout.setClipChildren(true);
        this.f36892m.setOrientation(0);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.width = (i * 9) + (i2 * 8);
        layoutParams2.gravity = 17;
        layoutParams2.leftMargin = (-i) - i2;
        this.f36892m.setLayoutParams(layoutParams2);
        for (int i3 = 0; i3 < 9; i3++) {
            View view = new View(getContext());
            m56180k(view, this.f36889j);
            int i4 = f36877p;
            LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(i4, i4);
            layoutParams3.rightMargin = f36878q;
            this.f36892m.addView(view, layoutParams3);
            this.f36880a.add(view);
        }
        addView(this.f36892m, layoutParams2);
        m56179i();
        setColorByPosition(1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public /* synthetic */ void m56177j() {
        this.f36893n = true;
        m56176h();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setColorByPosition(int i) {
        View view = this.f36883d;
        if (view != null) {
            m56180k(view, this.f36889j);
        }
        View view2 = this.f36880a.get(i);
        this.f36883d = view2;
        m56180k(view2, this.f36890k);
    }

    /* JADX INFO: renamed from: g */
    public final Animator m56178g(View view, int i, boolean z, boolean z2) {
        float[] fArr = z2 ? new float[]{view.getScaleX(), f36879r[i][1]} : f36879r[i];
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat("scaleX", fArr), PropertyValuesHolder.ofFloat("scaleY", fArr));
        objectAnimatorOfPropertyValuesHolder.addListener(new C8932b(z, view, i));
        objectAnimatorOfPropertyValuesHolder.setDuration(200L);
        return objectAnimatorOfPropertyValuesHolder;
    }

    public int getCount() {
        int size = this.f36880a.size() - 2;
        if (size < 0) {
            return 0;
        }
        return size;
    }

    /* JADX INFO: renamed from: i */
    public final void m56179i() {
        this.f36885f = 0;
        if (this.f36884e.getAdapter().getCount() - 7 >= 1) {
            List<View> list = this.f36880a;
            list.get(list.size() - 2).setScaleX(f36879r[1][0]);
            List<View> list2 = this.f36880a;
            list2.get(list2.size() - 2).setScaleY(f36879r[1][0]);
            List<View> list3 = this.f36880a;
            list3.get(list3.size() - 3).setScaleX(f36879r[2][0]);
            List<View> list4 = this.f36880a;
            list4.get(list4.size() - 3).setScaleY(f36879r[2][0]);
        }
        this.f36880a.get(1).setScaleX(f36879r[3][0]);
        this.f36880a.get(1).setScaleY(f36879r[3][0]);
        this.f36880a.get(2).setScaleX(f36879r[3][0]);
        this.f36880a.get(2).setScaleY(f36879r[3][0]);
    }

    /* JADX INFO: renamed from: k */
    public final void m56180k(View view, int i) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(t100.m186890d(7.0f));
        gradientDrawable.setColor(i);
        view.setBackground(gradientDrawable);
    }

    /* JADX INFO: renamed from: l */
    public final void m56181l(boolean z, Animator.AnimatorListener animatorListener) {
        ArrayList arrayList = new ArrayList();
        AnimatorSet animatorSet = this.f36891l;
        if (animatorSet != null && animatorSet.isRunning()) {
            this.f36891l.cancel();
        }
        this.f36891l = new AnimatorSet();
        int i = z ? 2 : 0;
        if (this.f36884e.getAdapter().getCount() - (this.f36885f + 7) >= 1) {
            int i2 = i & 2;
            List<View> list = this.f36880a;
            if (i2 == 2) {
                arrayList.add(m56178g(list.get(list.size() - 2), 5, true, true));
                List<View> list2 = this.f36880a;
                arrayList.add(m56178g(list2.get(list2.size() - 3), 4, true, true));
                List<View> list3 = this.f36880a;
                arrayList.add(m56178g(list3.get(list3.size() - 4), 3, true, true));
            } else {
                arrayList.add(m56178g(list.get(list.size() - 1), 0, true, false));
                List<View> list4 = this.f36880a;
                arrayList.add(m56178g(list4.get(list4.size() - 2), 1, true, false));
                List<View> list5 = this.f36880a;
                arrayList.add(m56178g(list5.get(list5.size() - 3), 2, true, false));
            }
        } else if (this.f36884e.getAdapter().getCount() - (this.f36885f + 7) == 0) {
            List<View> list6 = this.f36880a;
            arrayList.add(m56178g(list6.get(list6.size() - 1), 2, false, true));
            List<View> list7 = this.f36880a;
            arrayList.add(m56178g(list7.get(list7.size() - 2), 2, false, true));
            List<View> list8 = this.f36880a;
            arrayList.add(m56178g(list8.get(list8.size() - 3), 2, false, true));
            i |= 4;
        }
        int i3 = this.f36885f;
        if (i3 == 1) {
            int i4 = i & 2;
            List<View> list9 = this.f36880a;
            if (i4 == 2) {
                arrayList.add(m56178g(list9.get(0), 0, true, false));
                arrayList.add(m56178g(this.f36880a.get(1), 1, true, false));
                arrayList.add(m56178g(this.f36880a.get(2), 2, true, false));
            } else {
                arrayList.add(m56178g(list9.get(1), 5, true, true));
                arrayList.add(m56178g(this.f36880a.get(2), 4, true, true));
                arrayList.add(m56178g(this.f36880a.get(3), 3, true, true));
            }
        } else if (i3 > 1) {
            int i5 = i & 2;
            List<View> list10 = this.f36880a;
            if (i5 == 2) {
                arrayList.add(m56178g(list10.get(0), 0, true, false));
                arrayList.add(m56178g(this.f36880a.get(1), 1, true, false));
                arrayList.add(m56178g(this.f36880a.get(2), 2, true, false));
            } else {
                arrayList.add(m56178g(list10.get(1), 5, true, false));
                arrayList.add(m56178g(this.f36880a.get(2), 4, true, false));
                arrayList.add(m56178g(this.f36880a.get(3), 3, true, false));
            }
        } else if (i3 == 0) {
            arrayList.add(m56178g(this.f36880a.get(1), 2, false, true));
            arrayList.add(m56178g(this.f36880a.get(2), 2, false, true));
            arrayList.add(m56178g(this.f36880a.get(3), 2, false, true));
            i |= 4;
        }
        int i6 = f36877p + f36878q;
        if ((i & 2) == 0) {
            i6 *= -1;
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f36892m, "translationX", 0.0f, i6);
        objectAnimatorOfFloat.addListener(animatorListener);
        arrayList.add(objectAnimatorOfFloat);
        this.f36891l.setDuration(200L);
        this.f36891l.playTogether(arrayList);
        this.f36891l.start();
    }

    @Override // androidx.viewpager.widget.ViewPager.InterfaceC0716j
    public void onPageScrollStateChanged(int i) {
    }

    @Override // androidx.viewpager.widget.ViewPager.InterfaceC0716j
    public void onPageScrolled(int i, float f, int i2) {
    }

    /* JADX WARN: Code duplicated, block: B:24:0x005a  */
    /* JADX WARN: Code duplicated, block: B:26:0x005e  */
    /* JADX WARN: Code duplicated, block: B:27:0x0060  */
    /* JADX WARN: Code duplicated, block: B:31:0x0068  */
    /* JADX WARN: Code duplicated, block: B:34:0x0072  */
    @Override // androidx.viewpager.widget.ViewPager.InterfaceC0716j
    public void onPageSelected(int i) {
        byte b;
        int i2;
        int i3;
        int count = getCount();
        if (i != 0 || Math.abs(this.f36881b) - i <= 1) {
            int i4 = this.f36881b;
            if (i4 < i) {
                int i5 = count - 3;
                if (this.f36882c != i5 || i >= this.f36884e.getAdapter().getCount() - 2) {
                    this.f36882c++;
                } else {
                    this.f36882c = i5;
                    this.f36885f++;
                    b = 1;
                }
            } else if (i4 > i) {
                int i6 = this.f36882c;
                if (i6 != 2 || i < 2) {
                    this.f36882c = i6 - 1;
                } else {
                    this.f36882c = 2;
                    this.f36885f--;
                    b = -1;
                }
            }
            this.f36881b = i;
            if (b != 0) {
                setColorByPosition(this.f36882c + 1);
                return;
            }
            i2 = this.f36882c;
            if (b == -1) {
                i3 = i2 - 1;
            } else {
                i3 = i2 + 1;
            }
            setColorByPosition(i3 + 1);
            m56181l(b == -1, new C8931a());
        }
        this.f36882c = 0;
        this.f36885f = 0;
        m56179i();
        b = 0;
        this.f36881b = i;
        if (b != 0) {
            setColorByPosition(this.f36882c + 1);
            return;
        }
        i2 = this.f36882c;
        if (b == -1) {
            i3 = i2 - 1;
        } else {
            i3 = i2 + 1;
        }
        setColorByPosition(i3 + 1);
        m56181l(b == -1, new C8931a());
    }

    public void setNormalColor(int i) {
        this.f36889j = i;
    }

    public void setSelectedColor(int i) {
        this.f36890k = i;
    }

    public void setViewPager(ViewPager viewPager) {
        ViewPager viewPager2 = this.f36884e;
        if (viewPager2 == viewPager) {
            return;
        }
        if (viewPager2 != null) {
            viewPager2.m4175P(this);
        }
        if (viewPager.getAdapter() == null) {
            qkq0.m175383a("ViewPager does not have adapter instance.");
            return;
        }
        this.f36884e = viewPager;
        if (this.f36894o == null) {
            this.f36894o = new C8933c();
        } else {
            viewPager.getAdapter().unregisterDataSetObserver(this.f36894o);
        }
        this.f36884e.getAdapter().registerDataSetObserver(this.f36894o);
        this.f36884e.m4185d(this);
        invalidate();
    }

    public VPagerNewCircleIndicator(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f36880a = new ArrayList();
        this.f36881b = 0;
        this.f36882c = 0;
        this.f36883d = null;
        this.f36885f = 0;
        this.f36886g = -1;
        this.f36887h = 0;
        this.f36888i = 1;
        this.f36889j = Build.SUPPORT_SEND_MUSIC_VIDEO_MESSAGE;
        this.f36890k = -27861;
        this.f36893n = false;
    }

    public VPagerNewCircleIndicator(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f36880a = new ArrayList();
        this.f36881b = 0;
        this.f36882c = 0;
        this.f36883d = null;
        this.f36885f = 0;
        this.f36886g = -1;
        this.f36887h = 0;
        this.f36888i = 1;
        this.f36889j = Build.SUPPORT_SEND_MUSIC_VIDEO_MESSAGE;
        this.f36890k = -27861;
        this.f36893n = false;
    }
}
