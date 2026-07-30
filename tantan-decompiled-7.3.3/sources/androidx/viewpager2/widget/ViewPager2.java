package androidx.viewpager2.widget;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.RequiresApi;
import androidx.recyclerview.widget.C0615s;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.badge.BadgeDrawable;
import p153l.C15967bc;
import p153l.InterfaceC16750ec;
import p153l.kkl0;
import p153l.myf;
import p153l.vgc0;
import p153l.wg3;
import p153l.wpg0;
import p153l.wtq0;
import p153l.y3g0;

/* JADX INFO: loaded from: classes.dex */
public final class ViewPager2 extends ViewGroup {

    /* JADX INFO: renamed from: u */
    public static boolean f3328u = true;

    /* JADX INFO: renamed from: a */
    public final Rect f3329a;

    /* JADX INFO: renamed from: b */
    public final Rect f3330b;

    /* JADX INFO: renamed from: c */
    public C0747a f3331c;

    /* JADX INFO: renamed from: d */
    public int f3332d;

    /* JADX INFO: renamed from: e */
    public boolean f3333e;

    /* JADX INFO: renamed from: f */
    public RecyclerView.AbstractC0573i f3334f;

    /* JADX INFO: renamed from: g */
    public LinearLayoutManager f3335g;

    /* JADX INFO: renamed from: h */
    public int f3336h;

    /* JADX INFO: renamed from: i */
    public Parcelable f3337i;

    /* JADX INFO: renamed from: j */
    public RecyclerView f3338j;

    /* JADX INFO: renamed from: k */
    public C0615s f3339k;

    /* JADX INFO: renamed from: l */
    public C0751e f3340l;

    /* JADX INFO: renamed from: m */
    public C0747a f3341m;

    /* JADX INFO: renamed from: n */
    public myf f3342n;

    /* JADX INFO: renamed from: o */
    public C0750d f3343o;

    /* JADX INFO: renamed from: p */
    public RecyclerView.AbstractC0576l f3344p;

    /* JADX INFO: renamed from: q */
    public boolean f3345q;

    /* JADX INFO: renamed from: r */
    public boolean f3346r;

    /* JADX INFO: renamed from: s */
    public int f3347s;

    /* JADX INFO: renamed from: t */
    public AbstractC0738e f3348t;

    public class RecyclerViewImpl extends RecyclerView {
        public RecyclerViewImpl(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
        @RequiresApi(23)
        public CharSequence getAccessibilityClassName() {
            return ViewPager2.this.f3348t.mo4265d() ? ViewPager2.this.f3348t.mo4276o() : super.getAccessibilityClassName();
        }

        @Override // android.view.View
        public void onInitializeAccessibilityEvent(@NonNull AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setFromIndex(ViewPager2.this.f3332d);
            accessibilityEvent.setToIndex(ViewPager2.this.f3332d);
            ViewPager2.this.f3348t.mo4277p(accessibilityEvent);
        }

        @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            return ViewPager2.this.m4247e() && super.onInterceptTouchEvent(motionEvent);
        }

        @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
        @SuppressLint({"ClickableViewAccessibility"})
        public boolean onTouchEvent(MotionEvent motionEvent) {
            return ViewPager2.this.m4247e() && super.onTouchEvent(motionEvent);
        }
    }

    /* JADX INFO: renamed from: androidx.viewpager2.widget.ViewPager2$a */
    public class C0734a extends AbstractC0740g {
        public C0734a() {
            super(null);
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC0740g, androidx.recyclerview.widget.RecyclerView.AbstractC0573i
        public void onChanged() {
            ViewPager2 viewPager2 = ViewPager2.this;
            viewPager2.f3333e = true;
            viewPager2.f3340l.m4305l();
        }
    }

    /* JADX INFO: renamed from: androidx.viewpager2.widget.ViewPager2$b */
    public class C0735b extends AbstractC0742i {
        public C0735b() {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC0742i
        public void onPageScrollStateChanged(int i) {
            if (i == 0) {
                ViewPager2.this.m4257o();
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC0742i
        public void onPageSelected(int i) {
            ViewPager2 viewPager2 = ViewPager2.this;
            if (viewPager2.f3332d != i) {
                viewPager2.f3332d = i;
                viewPager2.f3348t.mo4279r();
            }
        }
    }

    /* JADX INFO: renamed from: androidx.viewpager2.widget.ViewPager2$c */
    public class C0736c extends AbstractC0742i {
        public C0736c() {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC0742i
        public void onPageSelected(int i) {
            ViewPager2.this.clearFocus();
            if (ViewPager2.this.hasFocus()) {
                ViewPager2.this.f3338j.requestFocus(2);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.viewpager2.widget.ViewPager2$d */
    public class C0737d implements RecyclerView.InterfaceC0581q {
        public C0737d() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.InterfaceC0581q
        /* JADX INFO: renamed from: b */
        public void mo3422b(@NonNull View view) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.InterfaceC0581q
        /* JADX INFO: renamed from: d */
        public void mo3423d(@NonNull View view) {
            RecyclerView.C0580p c0580p = (RecyclerView.C0580p) view.getLayoutParams();
            if (((ViewGroup.MarginLayoutParams) c0580p).width == -1 && ((ViewGroup.MarginLayoutParams) c0580p).height == -1) {
                return;
            }
            wtq0.m207906a("Pages must fill the whole ViewPager2 (use match_parent)");
        }
    }

    /* JADX INFO: renamed from: androidx.viewpager2.widget.ViewPager2$f */
    public class C0739f extends AbstractC0738e {
        public C0739f() {
            super(ViewPager2.this, null);
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC0738e
        /* JADX INFO: renamed from: b */
        public boolean mo4263b(int i) {
            return (i == 8192 || i == 4096) && !ViewPager2.this.m4247e();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC0738e
        /* JADX INFO: renamed from: d */
        public boolean mo4265d() {
            return true;
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC0738e
        /* JADX INFO: renamed from: j */
        public void mo4271j(@NonNull C15967bc c15967bc) {
            if (ViewPager2.this.m4247e()) {
                return;
            }
            c15967bc.m103414f0(C15967bc.a.f76069r);
            c15967bc.m103414f0(C15967bc.a.f76068q);
            c15967bc.m103382K0(false);
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC0738e
        /* JADX INFO: renamed from: l */
        public boolean mo4273l(int i) {
            if (mo4263b(i)) {
                return false;
            }
            wpg0.m207458a();
            return false;
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC0738e
        /* JADX INFO: renamed from: o */
        public CharSequence mo4276o() {
            if (mo4265d()) {
                return "androidx.viewpager.widget.ViewPager";
            }
            wpg0.m207458a();
            return null;
        }
    }

    /* JADX INFO: renamed from: androidx.viewpager2.widget.ViewPager2$h */
    public class C0741h extends LinearLayoutManager {
        public C0741h(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager
        public void calculateExtraLayoutSpace(@NonNull RecyclerView.C0561a0 c0561a0, @NonNull int[] iArr) {
            int offscreenPageLimit = ViewPager2.this.getOffscreenPageLimit();
            if (offscreenPageLimit == -1) {
                super.calculateExtraLayoutSpace(c0561a0, iArr);
                return;
            }
            int pageSize = ViewPager2.this.getPageSize() * offscreenPageLimit;
            iArr[0] = pageSize;
            iArr[1] = pageSize;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0579o
        public void onInitializeAccessibilityNodeInfo(@NonNull RecyclerView.C0586v c0586v, @NonNull RecyclerView.C0561a0 c0561a0, @NonNull C15967bc c15967bc) {
            super.onInitializeAccessibilityNodeInfo(c0586v, c0561a0, c15967bc);
            ViewPager2.this.f3348t.mo4271j(c15967bc);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0579o
        public void onInitializeAccessibilityNodeInfoForItem(@NonNull RecyclerView.C0586v c0586v, @NonNull RecyclerView.C0561a0 c0561a0, @NonNull View view, @NonNull C15967bc c15967bc) {
            ViewPager2.this.f3348t.mo4272k(view, c15967bc);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0579o
        public boolean performAccessibilityAction(@NonNull RecyclerView.C0586v c0586v, @NonNull RecyclerView.C0561a0 c0561a0, int i, @Nullable Bundle bundle) {
            return ViewPager2.this.f3348t.mo4263b(i) ? ViewPager2.this.f3348t.mo4273l(i) : super.performAccessibilityAction(c0586v, c0561a0, i, bundle);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0579o
        public boolean requestChildRectangleOnScreen(@NonNull RecyclerView recyclerView, @NonNull View view, @NonNull Rect rect, boolean z, boolean z2) {
            return false;
        }
    }

    /* JADX INFO: renamed from: androidx.viewpager2.widget.ViewPager2$i */
    public static abstract class AbstractC0742i {
        public void onPageScrollStateChanged(int i) {
        }

        public void onPageScrolled(int i, float f, @Px int i2) {
        }

        public void onPageSelected(int i) {
        }
    }

    /* JADX INFO: renamed from: androidx.viewpager2.widget.ViewPager2$j */
    public class C0743j extends AbstractC0738e {

        /* JADX INFO: renamed from: b */
        public final InterfaceC16750ec f3357b;

        /* JADX INFO: renamed from: c */
        public final InterfaceC16750ec f3358c;

        /* JADX INFO: renamed from: d */
        public RecyclerView.AbstractC0573i f3359d;

        /* JADX INFO: renamed from: androidx.viewpager2.widget.ViewPager2$j$a */
        public class a implements InterfaceC16750ec {
            public a() {
            }

            @Override // p153l.InterfaceC16750ec
            public boolean perform(@NonNull View view, @Nullable InterfaceC16750ec.a aVar) {
                C0743j.this.m4285x(((ViewPager2) view).getCurrentItem() + 1);
                return true;
            }
        }

        /* JADX INFO: renamed from: androidx.viewpager2.widget.ViewPager2$j$b */
        public class b implements InterfaceC16750ec {
            public b() {
            }

            @Override // p153l.InterfaceC16750ec
            public boolean perform(@NonNull View view, @Nullable InterfaceC16750ec.a aVar) {
                C0743j.this.m4285x(((ViewPager2) view).getCurrentItem() - 1);
                return true;
            }
        }

        /* JADX INFO: renamed from: androidx.viewpager2.widget.ViewPager2$j$c */
        public class c extends AbstractC0740g {
            public c() {
                super(null);
            }

            @Override // androidx.viewpager2.widget.ViewPager2.AbstractC0740g, androidx.recyclerview.widget.RecyclerView.AbstractC0573i
            public void onChanged() {
                C0743j.this.m4286y();
            }
        }

        public C0743j() {
            super(ViewPager2.this, null);
            this.f3357b = new a();
            this.f3358c = new b();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC0738e
        /* JADX INFO: renamed from: a */
        public boolean mo4262a() {
            return true;
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC0738e
        /* JADX INFO: renamed from: c */
        public boolean mo4264c(int i, Bundle bundle) {
            return i == 8192 || i == 4096;
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC0738e
        /* JADX INFO: renamed from: e */
        public void mo4266e(@Nullable RecyclerView.Adapter<?> adapter) {
            m4286y();
            if (adapter != null) {
                adapter.registerAdapterDataObserver(this.f3359d);
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC0738e
        /* JADX INFO: renamed from: f */
        public void mo4267f(@Nullable RecyclerView.Adapter<?> adapter) {
            if (adapter != null) {
                adapter.unregisterAdapterDataObserver(this.f3359d);
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC0738e
        /* JADX INFO: renamed from: g */
        public String mo4268g() {
            if (mo4262a()) {
                return "androidx.viewpager.widget.ViewPager";
            }
            wpg0.m207458a();
            return null;
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC0738e
        /* JADX INFO: renamed from: h */
        public void mo4269h(@NonNull C0747a c0747a, @NonNull RecyclerView recyclerView) {
            kkl0.m150184t0(recyclerView, 2);
            this.f3359d = new c();
            if (kkl0.m150187v(ViewPager2.this) == 0) {
                kkl0.m150184t0(ViewPager2.this, 1);
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC0738e
        /* JADX INFO: renamed from: i */
        public void mo4270i(AccessibilityNodeInfo accessibilityNodeInfo) {
            C15967bc c15967bcM103355T0 = C15967bc.m103355T0(accessibilityNodeInfo);
            m4282u(c15967bcM103355T0);
            m4284w(c15967bcM103355T0);
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC0738e
        /* JADX INFO: renamed from: k */
        public void mo4272k(@NonNull View view, @NonNull C15967bc c15967bc) {
            m4283v(view, c15967bc);
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC0738e
        /* JADX INFO: renamed from: m */
        public boolean mo4274m(int i, Bundle bundle) {
            if (!mo4264c(i, bundle)) {
                wpg0.m207458a();
                return false;
            }
            ViewPager2 viewPager2 = ViewPager2.this;
            m4285x(i == 8192 ? viewPager2.getCurrentItem() - 1 : viewPager2.getCurrentItem() + 1);
            return true;
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC0738e
        /* JADX INFO: renamed from: n */
        public void mo4275n() {
            m4286y();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC0738e
        /* JADX INFO: renamed from: p */
        public void mo4277p(@NonNull AccessibilityEvent accessibilityEvent) {
            accessibilityEvent.setSource(ViewPager2.this);
            accessibilityEvent.setClassName(mo4268g());
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC0738e
        /* JADX INFO: renamed from: q */
        public void mo4278q() {
            m4286y();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC0738e
        /* JADX INFO: renamed from: r */
        public void mo4279r() {
            m4286y();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC0738e
        /* JADX INFO: renamed from: s */
        public void mo4280s() {
            m4286y();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC0738e
        /* JADX INFO: renamed from: t */
        public void mo4281t() {
            m4286y();
        }

        /* JADX INFO: renamed from: u */
        public final void m4282u(C15967bc c15967bc) {
            int itemCount;
            int itemCount2;
            if (ViewPager2.this.getAdapter() != null) {
                int orientation = ViewPager2.this.getOrientation();
                ViewPager2 viewPager2 = ViewPager2.this;
                itemCount2 = 1;
                if (orientation == 1) {
                    itemCount2 = viewPager2.getAdapter().getItemCount();
                    itemCount = 1;
                } else {
                    itemCount = viewPager2.getAdapter().getItemCount();
                }
            } else {
                itemCount = 0;
                itemCount2 = 0;
            }
            c15967bc.m103435q0(C15967bc.e.m103466b(itemCount2, itemCount, false, 0));
        }

        /* JADX INFO: renamed from: v */
        public final void m4283v(View view, C15967bc c15967bc) {
            c15967bc.m103436r0(C15967bc.f.m103467a(ViewPager2.this.getOrientation() == 1 ? ViewPager2.this.f3335g.getPosition(view) : 0, 1, ViewPager2.this.getOrientation() == 0 ? ViewPager2.this.f3335g.getPosition(view) : 0, 1, false, false));
        }

        /* JADX INFO: renamed from: w */
        public final void m4284w(C15967bc c15967bc) {
            int itemCount;
            RecyclerView.Adapter adapter = ViewPager2.this.getAdapter();
            if (adapter == null || (itemCount = adapter.getItemCount()) == 0 || !ViewPager2.this.m4247e()) {
                return;
            }
            if (ViewPager2.this.f3332d > 0) {
                c15967bc.m103406a(8192);
            }
            if (ViewPager2.this.f3332d < itemCount - 1) {
                c15967bc.m103406a(4096);
            }
            c15967bc.m103382K0(true);
        }

        /* JADX INFO: renamed from: x */
        public void m4285x(int i) {
            if (ViewPager2.this.m4247e()) {
                ViewPager2.this.m4253k(i, true);
            }
        }

        /* JADX INFO: renamed from: y */
        public void m4286y() {
            int itemCount;
            ViewPager2 viewPager2 = ViewPager2.this;
            int i = R.id.accessibilityActionPageLeft;
            kkl0.m150152d0(viewPager2, R.id.accessibilityActionPageLeft);
            kkl0.m150152d0(viewPager2, R.id.accessibilityActionPageRight);
            kkl0.m150152d0(viewPager2, R.id.accessibilityActionPageUp);
            kkl0.m150152d0(viewPager2, R.id.accessibilityActionPageDown);
            if (ViewPager2.this.getAdapter() == null || (itemCount = ViewPager2.this.getAdapter().getItemCount()) == 0 || !ViewPager2.this.m4247e()) {
                return;
            }
            int orientation = ViewPager2.this.getOrientation();
            ViewPager2 viewPager3 = ViewPager2.this;
            if (orientation != 0) {
                if (viewPager3.f3332d < itemCount - 1) {
                    kkl0.m150156f0(viewPager2, new C15967bc.a(R.id.accessibilityActionPageDown, null), null, this.f3357b);
                }
                if (ViewPager2.this.f3332d > 0) {
                    kkl0.m150156f0(viewPager2, new C15967bc.a(R.id.accessibilityActionPageUp, null), null, this.f3358c);
                    return;
                }
                return;
            }
            boolean zM4246d = viewPager3.m4246d();
            int i2 = zM4246d ? 16908360 : 16908361;
            if (zM4246d) {
                i = 16908361;
            }
            if (ViewPager2.this.f3332d < itemCount - 1) {
                kkl0.m150156f0(viewPager2, new C15967bc.a(i2, null), null, this.f3357b);
            }
            if (ViewPager2.this.f3332d > 0) {
                kkl0.m150156f0(viewPager2, new C15967bc.a(i, null), null, this.f3358c);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.viewpager2.widget.ViewPager2$k */
    public interface InterfaceC0744k {
        /* JADX INFO: renamed from: a */
        void mo4287a(@NonNull View view, float f);
    }

    /* JADX INFO: renamed from: androidx.viewpager2.widget.ViewPager2$l */
    public class C0745l extends C0615s {
        public C0745l() {
        }

        @Override // androidx.recyclerview.widget.C0615s, androidx.recyclerview.widget.AbstractC0619w
        @Nullable
        /* JADX INFO: renamed from: h */
        public View mo3812h(RecyclerView.AbstractC0579o abstractC0579o) {
            if (ViewPager2.this.m4245c()) {
                return null;
            }
            return super.mo3812h(abstractC0579o);
        }
    }

    /* JADX INFO: renamed from: androidx.viewpager2.widget.ViewPager2$m */
    public static class RunnableC0746m implements Runnable {

        /* JADX INFO: renamed from: a */
        public final int f3365a;

        /* JADX INFO: renamed from: b */
        public final RecyclerView f3366b;

        public RunnableC0746m(int i, RecyclerView recyclerView) {
            this.f3365a = i;
            this.f3366b = recyclerView;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f3366b.smoothScrollToPosition(this.f3365a);
        }
    }

    public ViewPager2(@NonNull Context context) {
        super(context);
        this.f3329a = new Rect();
        this.f3330b = new Rect();
        this.f3331c = new C0747a(3);
        this.f3333e = false;
        this.f3334f = new C0734a();
        this.f3336h = -1;
        this.f3344p = null;
        this.f3345q = false;
        this.f3346r = true;
        this.f3347s = -1;
        m4244b(context, null);
    }

    /* JADX INFO: renamed from: a */
    public final RecyclerView.InterfaceC0581q m4243a() {
        return new C0737d();
    }

    /* JADX INFO: renamed from: b */
    public final void m4244b(Context context, AttributeSet attributeSet) {
        this.f3348t = f3328u ? new C0743j() : new C0739f();
        RecyclerViewImpl recyclerViewImpl = new RecyclerViewImpl(context);
        this.f3338j = recyclerViewImpl;
        recyclerViewImpl.setId(kkl0.m150161i());
        this.f3338j.setDescendantFocusability(131072);
        C0741h c0741h = new C0741h(context);
        this.f3335g = c0741h;
        this.f3338j.setLayoutManager(c0741h);
        this.f3338j.setScrollingTouchSlop(1);
        m4254l(context, attributeSet);
        this.f3338j.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        this.f3338j.addOnChildAttachStateChangeListener(m4243a());
        C0751e c0751e = new C0751e(this);
        this.f3340l = c0751e;
        this.f3342n = new myf(this, c0751e, this.f3338j);
        C0745l c0745l = new C0745l();
        this.f3339k = c0745l;
        c0745l.mo3858b(this.f3338j);
        this.f3338j.addOnScrollListener(this.f3340l);
        C0747a c0747a = new C0747a(3);
        this.f3341m = c0747a;
        this.f3340l.m4307p(c0747a);
        C0735b c0735b = new C0735b();
        C0736c c0736c = new C0736c();
        this.f3341m.m4288a(c0735b);
        this.f3341m.m4288a(c0736c);
        this.f3348t.mo4269h(this.f3341m, this.f3338j);
        this.f3341m.m4288a(this.f3331c);
        C0750d c0750d = new C0750d(this.f3335g);
        this.f3343o = c0750d;
        this.f3341m.m4288a(c0750d);
        RecyclerView recyclerView = this.f3338j;
        attachViewToParent(recyclerView, 0, recyclerView.getLayoutParams());
    }

    /* JADX INFO: renamed from: c */
    public boolean m4245c() {
        return this.f3342n.m160791a();
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i) {
        return this.f3338j.canScrollHorizontally(i);
    }

    @Override // android.view.View
    public boolean canScrollVertically(int i) {
        return this.f3338j.canScrollVertically(i);
    }

    /* JADX INFO: renamed from: d */
    public boolean m4246d() {
        return this.f3335g.getLayoutDirection() == 1;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        Parcelable parcelable = sparseArray.get(getId());
        if (parcelable instanceof SavedState) {
            int i = ((SavedState) parcelable).mRecyclerViewId;
            sparseArray.put(this.f3338j.getId(), sparseArray.get(i));
            sparseArray.remove(i);
        }
        super.dispatchRestoreInstanceState(sparseArray);
        m4251i();
    }

    /* JADX INFO: renamed from: e */
    public boolean m4247e() {
        return this.f3346r;
    }

    /* JADX INFO: renamed from: f */
    public final void m4248f(@Nullable RecyclerView.Adapter<?> adapter) {
        if (adapter != null) {
            adapter.registerAdapterDataObserver(this.f3334f);
        }
    }

    /* JADX INFO: renamed from: g */
    public void m4249g(@NonNull AbstractC0742i abstractC0742i) {
        this.f3331c.m4288a(abstractC0742i);
    }

    @Override // android.view.ViewGroup, android.view.View
    @RequiresApi(23)
    public CharSequence getAccessibilityClassName() {
        return this.f3348t.mo4262a() ? this.f3348t.mo4268g() : super.getAccessibilityClassName();
    }

    @Nullable
    public RecyclerView.Adapter getAdapter() {
        return this.f3338j.getAdapter();
    }

    public int getCurrentItem() {
        return this.f3332d;
    }

    public int getItemDecorationCount() {
        return this.f3338j.getItemDecorationCount();
    }

    public int getOffscreenPageLimit() {
        return this.f3347s;
    }

    public int getOrientation() {
        return this.f3335g.getOrientation() == 1 ? 1 : 0;
    }

    public int getPageSize() {
        int height;
        int paddingBottom;
        RecyclerView recyclerView = this.f3338j;
        if (getOrientation() == 0) {
            height = recyclerView.getWidth() - recyclerView.getPaddingLeft();
            paddingBottom = recyclerView.getPaddingRight();
        } else {
            height = recyclerView.getHeight() - recyclerView.getPaddingTop();
            paddingBottom = recyclerView.getPaddingBottom();
        }
        return height - paddingBottom;
    }

    public int getScrollState() {
        return this.f3340l.m4301f();
    }

    /* JADX INFO: renamed from: h */
    public void m4250h() {
        if (this.f3343o.m4293a() == null) {
            return;
        }
        double dM4300e = this.f3340l.m4300e();
        int i = (int) dM4300e;
        float f = (float) (dM4300e - ((double) i));
        this.f3343o.onPageScrolled(i, f, Math.round(getPageSize() * f));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: i */
    public final void m4251i() {
        RecyclerView.Adapter adapter;
        if (this.f3336h == -1 || (adapter = getAdapter()) == 0) {
            return;
        }
        Parcelable parcelable = this.f3337i;
        if (parcelable != null) {
            if (adapter instanceof y3g0) {
                ((y3g0) adapter).mo4226p(parcelable);
            }
            this.f3337i = null;
        }
        int iMax = Math.max(0, Math.min(this.f3336h, adapter.getItemCount() - 1));
        this.f3332d = iMax;
        this.f3336h = -1;
        this.f3338j.scrollToPosition(iMax);
        this.f3348t.mo4275n();
    }

    /* JADX INFO: renamed from: j */
    public void m4252j(int i, boolean z) {
        if (m4245c()) {
            wtq0.m207906a("Cannot change current item when ViewPager2 is fake dragging");
        } else {
            m4253k(i, z);
        }
    }

    /* JADX INFO: renamed from: k */
    public void m4253k(int i, boolean z) {
        RecyclerView.Adapter adapter = getAdapter();
        if (adapter == null) {
            if (this.f3336h != -1) {
                this.f3336h = Math.max(i, 0);
                return;
            }
            return;
        }
        if (adapter.getItemCount() <= 0) {
            return;
        }
        int iMin = Math.min(Math.max(i, 0), adapter.getItemCount() - 1);
        if (iMin == this.f3332d && this.f3340l.m4303j()) {
            return;
        }
        int i2 = this.f3332d;
        if (iMin == i2 && z) {
            return;
        }
        double dM4300e = i2;
        this.f3332d = iMin;
        this.f3348t.mo4279r();
        if (!this.f3340l.m4303j()) {
            dM4300e = this.f3340l.m4300e();
        }
        this.f3340l.m4306m(iMin, z);
        if (!z) {
            this.f3338j.scrollToPosition(iMin);
            return;
        }
        double d = iMin;
        double dAbs = Math.abs(d - dM4300e);
        RecyclerView recyclerView = this.f3338j;
        if (dAbs <= 3.0d) {
            recyclerView.smoothScrollToPosition(iMin);
            return;
        }
        recyclerView.scrollToPosition(d > dM4300e ? iMin - 3 : iMin + 3);
        RecyclerView recyclerView2 = this.f3338j;
        recyclerView2.post(new RunnableC0746m(iMin, recyclerView2));
    }

    /* JADX INFO: renamed from: l */
    public final void m4254l(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, vgc0.f184014a);
        kkl0.m150160h0(this, context, vgc0.f184014a, attributeSet, typedArrayObtainStyledAttributes, 0, 0);
        try {
            setOrientation(typedArrayObtainStyledAttributes.getInt(vgc0.f184015b, 0));
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m4255m(@Nullable RecyclerView.Adapter<?> adapter) {
        if (adapter != null) {
            adapter.unregisterAdapterDataObserver(this.f3334f);
        }
    }

    /* JADX INFO: renamed from: n */
    public void m4256n(@NonNull AbstractC0742i abstractC0742i) {
        this.f3331c.m4289b(abstractC0742i);
    }

    /* JADX INFO: renamed from: o */
    public void m4257o() {
        C0615s c0615s = this.f3339k;
        if (c0615s == null) {
            wtq0.m207906a("Design assumption violated.");
            return;
        }
        View viewMo3812h = c0615s.mo3812h(this.f3335g);
        if (viewMo3812h == null) {
            return;
        }
        int position = this.f3335g.getPosition(viewMo3812h);
        if (position != this.f3332d && getScrollState() == 0) {
            this.f3341m.onPageSelected(position);
        }
        this.f3333e = false;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        this.f3348t.mo4270i(accessibilityNodeInfo);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredWidth = this.f3338j.getMeasuredWidth();
        int measuredHeight = this.f3338j.getMeasuredHeight();
        this.f3329a.left = getPaddingLeft();
        this.f3329a.right = (i3 - i) - getPaddingRight();
        this.f3329a.top = getPaddingTop();
        this.f3329a.bottom = (i4 - i2) - getPaddingBottom();
        Gravity.apply(BadgeDrawable.TOP_START, measuredWidth, measuredHeight, this.f3329a, this.f3330b);
        RecyclerView recyclerView = this.f3338j;
        Rect rect = this.f3330b;
        recyclerView.layout(rect.left, rect.top, rect.right, rect.bottom);
        if (this.f3333e) {
            m4257o();
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        measureChild(this.f3338j, i, i2);
        int measuredWidth = this.f3338j.getMeasuredWidth();
        int measuredHeight = this.f3338j.getMeasuredHeight();
        int measuredState = this.f3338j.getMeasuredState();
        int paddingLeft = measuredWidth + getPaddingLeft() + getPaddingRight();
        int paddingTop = measuredHeight + getPaddingTop() + getPaddingBottom();
        setMeasuredDimension(View.resolveSizeAndState(Math.max(paddingLeft, getSuggestedMinimumWidth()), i, measuredState), View.resolveSizeAndState(Math.max(paddingTop, getSuggestedMinimumHeight()), i2, measuredState << 16));
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.f3336h = savedState.mCurrentItem;
        this.f3337i = savedState.mAdapterState;
    }

    @Override // android.view.View
    @Nullable
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.mRecyclerViewId = this.f3338j.getId();
        int i = this.f3336h;
        if (i == -1) {
            i = this.f3332d;
        }
        savedState.mCurrentItem = i;
        Parcelable parcelable = this.f3337i;
        if (parcelable != null) {
            savedState.mAdapterState = parcelable;
            return savedState;
        }
        Object adapter = this.f3338j.getAdapter();
        if (adapter instanceof y3g0) {
            savedState.mAdapterState = ((y3g0) adapter).mo4225a();
        }
        return savedState;
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        throw new IllegalStateException(ViewPager2.class.getSimpleName().concat(" does not support direct child views"));
    }

    @Override // android.view.View
    @RequiresApi(16)
    public boolean performAccessibilityAction(int i, @Nullable Bundle bundle) {
        return this.f3348t.mo4264c(i, bundle) ? this.f3348t.mo4274m(i, bundle) : super.performAccessibilityAction(i, bundle);
    }

    public void setAdapter(@Nullable RecyclerView.Adapter adapter) {
        RecyclerView.Adapter adapter2 = this.f3338j.getAdapter();
        this.f3348t.mo4267f(adapter2);
        m4255m(adapter2);
        this.f3338j.setAdapter(adapter);
        this.f3332d = 0;
        m4251i();
        this.f3348t.mo4266e(adapter);
        m4248f(adapter);
    }

    public void setCurrentItem(int i) {
        m4252j(i, true);
    }

    @Override // android.view.View
    @RequiresApi(17)
    public void setLayoutDirection(int i) {
        super.setLayoutDirection(i);
        this.f3348t.mo4278q();
    }

    public void setOffscreenPageLimit(int i) {
        if (i < 1 && i != -1) {
            wg3.m206174a("Offscreen page limit must be OFFSCREEN_PAGE_LIMIT_DEFAULT or a number > 0");
        } else {
            this.f3347s = i;
            this.f3338j.requestLayout();
        }
    }

    public void setOrientation(int i) {
        this.f3335g.setOrientation(i);
        this.f3348t.mo4280s();
    }

    public void setPageTransformer(@Nullable InterfaceC0744k interfaceC0744k) {
        boolean z = this.f3345q;
        if (interfaceC0744k != null) {
            if (!z) {
                this.f3344p = this.f3338j.getItemAnimator();
                this.f3345q = true;
            }
            this.f3338j.setItemAnimator(null);
        } else if (z) {
            this.f3338j.setItemAnimator(this.f3344p);
            this.f3344p = null;
            this.f3345q = false;
        }
        if (interfaceC0744k == this.f3343o.m4293a()) {
            return;
        }
        this.f3343o.m4294b(interfaceC0744k);
        m4250h();
    }

    public void setUserInputEnabled(boolean z) {
        this.f3346r = z;
        this.f3348t.mo4281t();
    }

    /* JADX INFO: renamed from: androidx.viewpager2.widget.ViewPager2$g */
    public static abstract class AbstractC0740g extends RecyclerView.AbstractC0573i {
        public AbstractC0740g() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0573i
        public abstract void onChanged();

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0573i
        public final void onItemRangeChanged(int i, int i2) {
            onChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0573i
        public final void onItemRangeInserted(int i, int i2) {
            onChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0573i
        public final void onItemRangeMoved(int i, int i2, int i3) {
            onChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0573i
        public final void onItemRangeRemoved(int i, int i2) {
            onChanged();
        }

        public /* synthetic */ AbstractC0740g(C0734a c0734a) {
            this();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0573i
        public final void onItemRangeChanged(int i, int i2, @Nullable Object obj) {
            onChanged();
        }
    }

    /* JADX INFO: renamed from: androidx.viewpager2.widget.ViewPager2$e */
    public abstract class AbstractC0738e {
        public AbstractC0738e() {
        }

        /* JADX INFO: renamed from: a */
        public boolean mo4262a() {
            return false;
        }

        /* JADX INFO: renamed from: b */
        public boolean mo4263b(int i) {
            return false;
        }

        /* JADX INFO: renamed from: c */
        public boolean mo4264c(int i, Bundle bundle) {
            return false;
        }

        /* JADX INFO: renamed from: d */
        public boolean mo4265d() {
            return false;
        }

        /* JADX INFO: renamed from: e */
        public void mo4266e(@Nullable RecyclerView.Adapter<?> adapter) {
        }

        /* JADX INFO: renamed from: f */
        public void mo4267f(@Nullable RecyclerView.Adapter<?> adapter) {
        }

        /* JADX INFO: renamed from: g */
        public String mo4268g() {
            throw new IllegalStateException("Not implemented.");
        }

        /* JADX INFO: renamed from: h */
        public void mo4269h(@NonNull C0747a c0747a, @NonNull RecyclerView recyclerView) {
        }

        /* JADX INFO: renamed from: i */
        public void mo4270i(AccessibilityNodeInfo accessibilityNodeInfo) {
        }

        /* JADX INFO: renamed from: l */
        public boolean mo4273l(int i) {
            throw new IllegalStateException("Not implemented.");
        }

        /* JADX INFO: renamed from: m */
        public boolean mo4274m(int i, Bundle bundle) {
            throw new IllegalStateException("Not implemented.");
        }

        /* JADX INFO: renamed from: n */
        public void mo4275n() {
        }

        /* JADX INFO: renamed from: o */
        public CharSequence mo4276o() {
            throw new IllegalStateException("Not implemented.");
        }

        /* JADX INFO: renamed from: p */
        public void mo4277p(@NonNull AccessibilityEvent accessibilityEvent) {
        }

        /* JADX INFO: renamed from: q */
        public void mo4278q() {
        }

        /* JADX INFO: renamed from: r */
        public void mo4279r() {
        }

        /* JADX INFO: renamed from: s */
        public void mo4280s() {
        }

        /* JADX INFO: renamed from: t */
        public void mo4281t() {
        }

        public /* synthetic */ AbstractC0738e(ViewPager2 viewPager2, C0734a c0734a) {
            this();
        }

        /* JADX INFO: renamed from: j */
        public void mo4271j(@NonNull C15967bc c15967bc) {
        }

        /* JADX INFO: renamed from: k */
        public void mo4272k(@NonNull View view, @NonNull C15967bc c15967bc) {
        }
    }

    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C0733a();
        Parcelable mAdapterState;
        int mCurrentItem;
        int mRecyclerViewId;

        /* JADX INFO: renamed from: androidx.viewpager2.widget.ViewPager2$SavedState$a */
        public class C0733a implements Parcelable.ClassLoaderCreator<SavedState> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return createFromParcel(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        @RequiresApi(24)
        @SuppressLint({"ClassVerificationFailure"})
        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            m4258a(parcel, classLoader);
        }

        /* JADX INFO: renamed from: a */
        public final void m4258a(Parcel parcel, ClassLoader classLoader) {
            this.mRecyclerViewId = parcel.readInt();
            this.mCurrentItem = parcel.readInt();
            this.mAdapterState = parcel.readParcelable(classLoader);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.mRecyclerViewId);
            parcel.writeInt(this.mCurrentItem);
            parcel.writeParcelable(this.mAdapterState, i);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public ViewPager2(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3329a = new Rect();
        this.f3330b = new Rect();
        this.f3331c = new C0747a(3);
        this.f3333e = false;
        this.f3334f = new C0734a();
        this.f3336h = -1;
        this.f3344p = null;
        this.f3345q = false;
        this.f3346r = true;
        this.f3347s = -1;
        m4244b(context, attributeSet);
    }

    public ViewPager2(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f3329a = new Rect();
        this.f3330b = new Rect();
        this.f3331c = new C0747a(3);
        this.f3333e = false;
        this.f3334f = new C0734a();
        this.f3336h = -1;
        this.f3344p = null;
        this.f3345q = false;
        this.f3346r = true;
        this.f3347s = -1;
        m4244b(context, attributeSet);
    }

    @RequiresApi(21)
    @SuppressLint({"ClassVerificationFailure"})
    public ViewPager2(@NonNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f3329a = new Rect();
        this.f3330b = new Rect();
        this.f3331c = new C0747a(3);
        this.f3333e = false;
        this.f3334f = new C0734a();
        this.f3336h = -1;
        this.f3344p = null;
        this.f3345q = false;
        this.f3346r = true;
        this.f3347s = -1;
        m4244b(context, attributeSet);
    }
}
