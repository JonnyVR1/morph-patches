package com.p051p1.mobile.putong.core.p058ui.view;

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
import com.tencent.p106mm.opensdk.constants.Build;
import java.util.ArrayList;
import java.util.List;
import p153l.qa00;
import p153l.wtq0;

/* JADX INFO: loaded from: classes12.dex */
public class VPagerNewCircleIndicator extends LinearLayout implements ViewPager.InterfaceC0718j {

    /* JADX INFO: renamed from: p */
    public static final int f37725p = qa00.m175859d(7.0f);

    /* JADX INFO: renamed from: q */
    public static final int f37726q = qa00.m175859d(8.0f);

    /* JADX INFO: renamed from: r */
    public static float[][] f37727r = {new float[]{0.0f, 0.5f}, new float[]{0.5f, 0.75f}, new float[]{0.75f, 1.0f}, new float[]{1.0f, 0.75f}, new float[]{0.75f, 0.5f}, new float[]{0.5f, 0.0f}};

    /* JADX INFO: renamed from: a */
    public final List<View> f37728a;

    /* JADX INFO: renamed from: b */
    public int f37729b;

    /* JADX INFO: renamed from: c */
    public int f37730c;

    /* JADX INFO: renamed from: d */
    public View f37731d;

    /* JADX INFO: renamed from: e */
    public ViewPager f37732e;

    /* JADX INFO: renamed from: f */
    public int f37733f;

    /* JADX INFO: renamed from: g */
    public final int f37734g;

    /* JADX INFO: renamed from: h */
    public final int f37735h;

    /* JADX INFO: renamed from: i */
    public final int f37736i;

    /* JADX INFO: renamed from: j */
    public int f37737j;

    /* JADX INFO: renamed from: k */
    public int f37738k;

    /* JADX INFO: renamed from: l */
    public AnimatorSet f37739l;

    /* JADX INFO: renamed from: m */
    public LinearLayout f37740m;

    /* JADX INFO: renamed from: n */
    public boolean f37741n;

    /* JADX INFO: renamed from: o */
    public DataSetObserver f37742o;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.view.VPagerNewCircleIndicator$a */
    public class C9094a extends AnimatorListenerAdapter {
        public C9094a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            VPagerNewCircleIndicator.this.f37740m.setTranslationX(0.0f);
            VPagerNewCircleIndicator vPagerNewCircleIndicator = VPagerNewCircleIndicator.this;
            vPagerNewCircleIndicator.setColorByPosition(vPagerNewCircleIndicator.f37730c + 1);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.view.VPagerNewCircleIndicator$b */
    public class C9095b extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ boolean f37744a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ View f37745b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ int f37746c;

        public C9095b(boolean z, View view, int i) {
            this.f37744a = z;
            this.f37745b = view;
            this.f37746c = i;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f37744a) {
                this.f37745b.setScaleX(VPagerNewCircleIndicator.f37727r[this.f37746c][0]);
                this.f37745b.setScaleY(VPagerNewCircleIndicator.f37727r[this.f37746c][0]);
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.view.VPagerNewCircleIndicator$c */
    public class C9096c extends DataSetObserver {
        public C9096c() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            VPagerNewCircleIndicator.this.m57359h();
        }
    }

    public VPagerNewCircleIndicator(Context context) {
        super(context);
        this.f37728a = new ArrayList();
        this.f37729b = 0;
        this.f37730c = 0;
        this.f37731d = null;
        this.f37733f = 0;
        this.f37734g = -1;
        this.f37735h = 0;
        this.f37736i = 1;
        this.f37737j = Build.SUPPORT_SEND_MUSIC_VIDEO_MESSAGE;
        this.f37738k = -27861;
        this.f37741n = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public void m57359h() {
        setClipChildren(true);
        removeAllViews();
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams == null && !this.f37741n) {
            post(new Runnable() { // from class: l.zyk0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f206615a.m57360j();
                }
            });
            return;
        }
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(-2, -2);
        }
        int i = f37725p;
        int i2 = f37726q;
        layoutParams.width = (i * 7) + (i2 * 6);
        setLayoutParams(layoutParams);
        LinearLayout linearLayout = new LinearLayout(getContext());
        this.f37740m = linearLayout;
        linearLayout.setClipChildren(true);
        this.f37740m.setOrientation(0);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.width = (i * 9) + (i2 * 8);
        layoutParams2.gravity = 17;
        layoutParams2.leftMargin = (-i) - i2;
        this.f37740m.setLayoutParams(layoutParams2);
        for (int i3 = 0; i3 < 9; i3++) {
            View view = new View(getContext());
            m57363k(view, this.f37737j);
            int i4 = f37725p;
            LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(i4, i4);
            layoutParams3.rightMargin = f37726q;
            this.f37740m.addView(view, layoutParams3);
            this.f37728a.add(view);
        }
        addView(this.f37740m, layoutParams2);
        m57362i();
        setColorByPosition(1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public /* synthetic */ void m57360j() {
        this.f37741n = true;
        m57359h();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setColorByPosition(int i) {
        View view = this.f37731d;
        if (view != null) {
            m57363k(view, this.f37737j);
        }
        View view2 = this.f37728a.get(i);
        this.f37731d = view2;
        m57363k(view2, this.f37738k);
    }

    /* JADX INFO: renamed from: g */
    public final Animator m57361g(View view, int i, boolean z, boolean z2) {
        float[] fArr = z2 ? new float[]{view.getScaleX(), f37727r[i][1]} : f37727r[i];
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat("scaleX", fArr), PropertyValuesHolder.ofFloat("scaleY", fArr));
        objectAnimatorOfPropertyValuesHolder.addListener(new C9095b(z, view, i));
        objectAnimatorOfPropertyValuesHolder.setDuration(200L);
        return objectAnimatorOfPropertyValuesHolder;
    }

    public int getCount() {
        int size = this.f37728a.size() - 2;
        if (size < 0) {
            return 0;
        }
        return size;
    }

    /* JADX INFO: renamed from: i */
    public final void m57362i() {
        this.f37733f = 0;
        if (this.f37732e.getAdapter().getCount() - 7 >= 1) {
            List<View> list = this.f37728a;
            list.get(list.size() - 2).setScaleX(f37727r[1][0]);
            List<View> list2 = this.f37728a;
            list2.get(list2.size() - 2).setScaleY(f37727r[1][0]);
            List<View> list3 = this.f37728a;
            list3.get(list3.size() - 3).setScaleX(f37727r[2][0]);
            List<View> list4 = this.f37728a;
            list4.get(list4.size() - 3).setScaleY(f37727r[2][0]);
        }
        this.f37728a.get(1).setScaleX(f37727r[3][0]);
        this.f37728a.get(1).setScaleY(f37727r[3][0]);
        this.f37728a.get(2).setScaleX(f37727r[3][0]);
        this.f37728a.get(2).setScaleY(f37727r[3][0]);
    }

    /* JADX INFO: renamed from: k */
    public final void m57363k(View view, int i) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(qa00.m175859d(7.0f));
        gradientDrawable.setColor(i);
        view.setBackground(gradientDrawable);
    }

    /* JADX INFO: renamed from: l */
    public final void m57364l(boolean z, Animator.AnimatorListener animatorListener) {
        ArrayList arrayList = new ArrayList();
        AnimatorSet animatorSet = this.f37739l;
        if (animatorSet != null && animatorSet.isRunning()) {
            this.f37739l.cancel();
        }
        this.f37739l = new AnimatorSet();
        int i = z ? 2 : 0;
        if (this.f37732e.getAdapter().getCount() - (this.f37733f + 7) >= 1) {
            int i2 = i & 2;
            List<View> list = this.f37728a;
            if (i2 == 2) {
                arrayList.add(m57361g(list.get(list.size() - 2), 5, true, true));
                List<View> list2 = this.f37728a;
                arrayList.add(m57361g(list2.get(list2.size() - 3), 4, true, true));
                List<View> list3 = this.f37728a;
                arrayList.add(m57361g(list3.get(list3.size() - 4), 3, true, true));
            } else {
                arrayList.add(m57361g(list.get(list.size() - 1), 0, true, false));
                List<View> list4 = this.f37728a;
                arrayList.add(m57361g(list4.get(list4.size() - 2), 1, true, false));
                List<View> list5 = this.f37728a;
                arrayList.add(m57361g(list5.get(list5.size() - 3), 2, true, false));
            }
        } else if (this.f37732e.getAdapter().getCount() - (this.f37733f + 7) == 0) {
            List<View> list6 = this.f37728a;
            arrayList.add(m57361g(list6.get(list6.size() - 1), 2, false, true));
            List<View> list7 = this.f37728a;
            arrayList.add(m57361g(list7.get(list7.size() - 2), 2, false, true));
            List<View> list8 = this.f37728a;
            arrayList.add(m57361g(list8.get(list8.size() - 3), 2, false, true));
            i |= 4;
        }
        int i3 = this.f37733f;
        if (i3 == 1) {
            int i4 = i & 2;
            List<View> list9 = this.f37728a;
            if (i4 == 2) {
                arrayList.add(m57361g(list9.get(0), 0, true, false));
                arrayList.add(m57361g(this.f37728a.get(1), 1, true, false));
                arrayList.add(m57361g(this.f37728a.get(2), 2, true, false));
            } else {
                arrayList.add(m57361g(list9.get(1), 5, true, true));
                arrayList.add(m57361g(this.f37728a.get(2), 4, true, true));
                arrayList.add(m57361g(this.f37728a.get(3), 3, true, true));
            }
        } else if (i3 > 1) {
            int i5 = i & 2;
            List<View> list10 = this.f37728a;
            if (i5 == 2) {
                arrayList.add(m57361g(list10.get(0), 0, true, false));
                arrayList.add(m57361g(this.f37728a.get(1), 1, true, false));
                arrayList.add(m57361g(this.f37728a.get(2), 2, true, false));
            } else {
                arrayList.add(m57361g(list10.get(1), 5, true, false));
                arrayList.add(m57361g(this.f37728a.get(2), 4, true, false));
                arrayList.add(m57361g(this.f37728a.get(3), 3, true, false));
            }
        } else if (i3 == 0) {
            arrayList.add(m57361g(this.f37728a.get(1), 2, false, true));
            arrayList.add(m57361g(this.f37728a.get(2), 2, false, true));
            arrayList.add(m57361g(this.f37728a.get(3), 2, false, true));
            i |= 4;
        }
        int i6 = f37725p + f37726q;
        if ((i & 2) == 0) {
            i6 *= -1;
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f37740m, "translationX", 0.0f, i6);
        objectAnimatorOfFloat.addListener(animatorListener);
        arrayList.add(objectAnimatorOfFloat);
        this.f37739l.setDuration(200L);
        this.f37739l.playTogether(arrayList);
        this.f37739l.start();
    }

    @Override // androidx.viewpager.widget.ViewPager.InterfaceC0718j
    public void onPageScrollStateChanged(int i) {
    }

    @Override // androidx.viewpager.widget.ViewPager.InterfaceC0718j
    public void onPageScrolled(int i, float f, int i2) {
    }

    /* JADX WARN: Code duplicated, block: B:24:0x005a  */
    /* JADX WARN: Code duplicated, block: B:26:0x005e  */
    /* JADX WARN: Code duplicated, block: B:27:0x0060  */
    /* JADX WARN: Code duplicated, block: B:31:0x0068  */
    /* JADX WARN: Code duplicated, block: B:34:0x0072  */
    @Override // androidx.viewpager.widget.ViewPager.InterfaceC0718j
    public void onPageSelected(int i) {
        byte b;
        int i2;
        int i3;
        int count = getCount();
        if (i != 0 || Math.abs(this.f37729b) - i <= 1) {
            int i4 = this.f37729b;
            if (i4 < i) {
                int i5 = count - 3;
                if (this.f37730c != i5 || i >= this.f37732e.getAdapter().getCount() - 2) {
                    this.f37730c++;
                } else {
                    this.f37730c = i5;
                    this.f37733f++;
                    b = 1;
                }
            } else if (i4 > i) {
                int i6 = this.f37730c;
                if (i6 != 2 || i < 2) {
                    this.f37730c = i6 - 1;
                } else {
                    this.f37730c = 2;
                    this.f37733f--;
                    b = -1;
                }
            }
            this.f37729b = i;
            if (b != 0) {
                setColorByPosition(this.f37730c + 1);
                return;
            }
            i2 = this.f37730c;
            if (b == -1) {
                i3 = i2 - 1;
            } else {
                i3 = i2 + 1;
            }
            setColorByPosition(i3 + 1);
            m57364l(b == -1, new C9094a());
        }
        this.f37730c = 0;
        this.f37733f = 0;
        m57362i();
        b = 0;
        this.f37729b = i;
        if (b != 0) {
            setColorByPosition(this.f37730c + 1);
            return;
        }
        i2 = this.f37730c;
        if (b == -1) {
            i3 = i2 - 1;
        } else {
            i3 = i2 + 1;
        }
        setColorByPosition(i3 + 1);
        m57364l(b == -1, new C9094a());
    }

    public void setNormalColor(int i) {
        this.f37737j = i;
    }

    public void setSelectedColor(int i) {
        this.f37738k = i;
    }

    public void setViewPager(ViewPager viewPager) {
        ViewPager viewPager2 = this.f37732e;
        if (viewPager2 == viewPager) {
            return;
        }
        if (viewPager2 != null) {
            viewPager2.m4177P(this);
        }
        if (viewPager.getAdapter() == null) {
            wtq0.m207906a("ViewPager does not have adapter instance.");
            return;
        }
        this.f37732e = viewPager;
        if (this.f37742o == null) {
            this.f37742o = new C9096c();
        } else {
            viewPager.getAdapter().unregisterDataSetObserver(this.f37742o);
        }
        this.f37732e.getAdapter().registerDataSetObserver(this.f37742o);
        this.f37732e.m4187d(this);
        invalidate();
    }

    public VPagerNewCircleIndicator(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f37728a = new ArrayList();
        this.f37729b = 0;
        this.f37730c = 0;
        this.f37731d = null;
        this.f37733f = 0;
        this.f37734g = -1;
        this.f37735h = 0;
        this.f37736i = 1;
        this.f37737j = Build.SUPPORT_SEND_MUSIC_VIDEO_MESSAGE;
        this.f37738k = -27861;
        this.f37741n = false;
    }

    public VPagerNewCircleIndicator(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f37728a = new ArrayList();
        this.f37729b = 0;
        this.f37730c = 0;
        this.f37731d = null;
        this.f37733f = 0;
        this.f37734g = -1;
        this.f37735h = 0;
        this.f37736i = 1;
        this.f37737j = Build.SUPPORT_SEND_MUSIC_VIDEO_MESSAGE;
        this.f37738k = -27861;
        this.f37741n = false;
    }
}
