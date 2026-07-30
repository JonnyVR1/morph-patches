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
import androidx.recyclerview.widget.C0613s;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.badge.BadgeDrawable;
import p149l.C17055gc;
import p149l.InterfaceC17741jc;
import p149l.gbl0;
import p149l.ig3;
import p149l.ohg0;
import p149l.pvf0;
import p149l.q8c0;
import p149l.qkq0;
import p149l.ywf;

/* JADX INFO: loaded from: classes.dex */
public final class ViewPager2 extends ViewGroup {

    /* JADX INFO: renamed from: u */
    public static boolean f3328u = true;

    /* JADX INFO: renamed from: a */
    public final Rect f3329a;

    /* JADX INFO: renamed from: b */
    public final Rect f3330b;

    /* JADX INFO: renamed from: c */
    public C0745a f3331c;

    /* JADX INFO: renamed from: d */
    public int f3332d;

    /* JADX INFO: renamed from: e */
    public boolean f3333e;

    /* JADX INFO: renamed from: f */
    public RecyclerView.AbstractC0571i f3334f;

    /* JADX INFO: renamed from: g */
    public LinearLayoutManager f3335g;

    /* JADX INFO: renamed from: h */
    public int f3336h;

    /* JADX INFO: renamed from: i */
    public Parcelable f3337i;

    /* JADX INFO: renamed from: j */
    public RecyclerView f3338j;

    /* JADX INFO: renamed from: k */
    public C0613s f3339k;

    /* JADX INFO: renamed from: l */
    public C0749e f3340l;

    /* JADX INFO: renamed from: m */
    public C0745a f3341m;

    /* JADX INFO: renamed from: n */
    public ywf f3342n;

    /* JADX INFO: renamed from: o */
    public C0748d f3343o;

    /* JADX INFO: renamed from: p */
    public RecyclerView.AbstractC0574l f3344p;

    /* JADX INFO: renamed from: q */
    public boolean f3345q;

    /* JADX INFO: renamed from: r */
    public boolean f3346r;

    /* JADX INFO: renamed from: s */
    public int f3347s;

    /* JADX INFO: renamed from: t */
    public AbstractC0736e f3348t;

    public class RecyclerViewImpl extends RecyclerView {
        public RecyclerViewImpl(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
        @RequiresApi(23)
        public CharSequence getAccessibilityClassName() {
            return ViewPager2.this.f3348t.mo4263d() ? ViewPager2.this.f3348t.mo4274o() : super.getAccessibilityClassName();
        }

        @Override // android.view.View
        public void onInitializeAccessibilityEvent(@NonNull AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setFromIndex(ViewPager2.this.f3332d);
            accessibilityEvent.setToIndex(ViewPager2.this.f3332d);
            ViewPager2.this.f3348t.mo4275p(accessibilityEvent);
        }

        @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            return ViewPager2.this.m4245e() && super.onInterceptTouchEvent(motionEvent);
        }

        @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
        @SuppressLint({"ClickableViewAccessibility"})
        public boolean onTouchEvent(MotionEvent motionEvent) {
            return ViewPager2.this.m4245e() && super.onTouchEvent(motionEvent);
        }
    }

    /* JADX INFO: renamed from: androidx.viewpager2.widget.ViewPager2$a */
    public class C0732a extends AbstractC0738g {
        public C0732a() {
            super(null);
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC0738g, androidx.recyclerview.widget.RecyclerView.AbstractC0571i
        public void onChanged() {
            ViewPager2 viewPager2 = ViewPager2.this;
            viewPager2.f3333e = true;
            viewPager2.f3340l.m4303l();
        }
    }

    /* JADX INFO: renamed from: androidx.viewpager2.widget.ViewPager2$b */
    public class C0733b extends AbstractC0740i {
        public C0733b() {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC0740i
        public void onPageScrollStateChanged(int i) {
            if (i == 0) {
                ViewPager2.this.m4255o();
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC0740i
        public void onPageSelected(int i) {
            ViewPager2 viewPager2 = ViewPager2.this;
            if (viewPager2.f3332d != i) {
                viewPager2.f3332d = i;
                viewPager2.f3348t.mo4277r();
            }
        }
    }

    /* JADX INFO: renamed from: androidx.viewpager2.widget.ViewPager2$c */
    public class C0734c extends AbstractC0740i {
        public C0734c() {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC0740i
        public void onPageSelected(int i) {
            ViewPager2.this.clearFocus();
            if (ViewPager2.this.hasFocus()) {
                ViewPager2.this.f3338j.requestFocus(2);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.viewpager2.widget.ViewPager2$d */
    public class C0735d implements RecyclerView.InterfaceC0579q {
        public C0735d() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.InterfaceC0579q
        /* JADX INFO: renamed from: b */
        public void mo3413b(@NonNull View view) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.InterfaceC0579q
        /* JADX INFO: renamed from: d */
        public void mo3414d(@NonNull View view) {
            RecyclerView.C0578p c0578p = (RecyclerView.C0578p) view.getLayoutParams();
            if (((ViewGroup.MarginLayoutParams) c0578p).width == -1 && ((ViewGroup.MarginLayoutParams) c0578p).height == -1) {
                return;
            }
            qkq0.m175383a("Pages must fill the whole ViewPager2 (use match_parent)");
        }
    }

    /* JADX INFO: renamed from: androidx.viewpager2.widget.ViewPager2$f */
    public class C0737f extends AbstractC0736e {
        public C0737f() {
            super(ViewPager2.this, null);
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC0736e
        /* JADX INFO: renamed from: b */
        public boolean mo4261b(int i) {
            return (i == 8192 || i == 4096) && !ViewPager2.this.m4245e();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC0736e
        /* JADX INFO: renamed from: d */
        public boolean mo4263d() {
            return true;
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC0736e
        /* JADX INFO: renamed from: j */
        public void mo4269j(@NonNull C17055gc c17055gc) {
            if (ViewPager2.this.m4245e()) {
                return;
            }
            c17055gc.m125410f0(C17055gc.a.f101963r);
            c17055gc.m125410f0(C17055gc.a.f101962q);
            c17055gc.m125378K0(false);
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC0736e
        /* JADX INFO: renamed from: l */
        public boolean mo4271l(int i) {
            if (mo4261b(i)) {
                return false;
            }
            ohg0.m164364a();
            return false;
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC0736e
        /* JADX INFO: renamed from: o */
        public CharSequence mo4274o() {
            if (mo4263d()) {
                return "androidx.viewpager.widget.ViewPager";
            }
            ohg0.m164364a();
            return null;
        }
    }

    /* JADX INFO: renamed from: androidx.viewpager2.widget.ViewPager2$h */
    public class C0739h extends LinearLayoutManager {
        public C0739h(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager
        public void calculateExtraLayoutSpace(@NonNull RecyclerView.C0588z c0588z, @NonNull int[] iArr) {
            int offscreenPageLimit = ViewPager2.this.getOffscreenPageLimit();
            if (offscreenPageLimit == -1) {
                super.calculateExtraLayoutSpace(c0588z, iArr);
                return;
            }
            int pageSize = ViewPager2.this.getPageSize() * offscreenPageLimit;
            iArr[0] = pageSize;
            iArr[1] = pageSize;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0577o
        public void onInitializeAccessibilityNodeInfo(@NonNull RecyclerView.C0584v c0584v, @NonNull RecyclerView.C0588z c0588z, @NonNull C17055gc c17055gc) {
            super.onInitializeAccessibilityNodeInfo(c0584v, c0588z, c17055gc);
            ViewPager2.this.f3348t.mo4269j(c17055gc);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0577o
        public void onInitializeAccessibilityNodeInfoForItem(@NonNull RecyclerView.C0584v c0584v, @NonNull RecyclerView.C0588z c0588z, @NonNull View view, @NonNull C17055gc c17055gc) {
            ViewPager2.this.f3348t.mo4270k(view, c17055gc);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0577o
        public boolean performAccessibilityAction(@NonNull RecyclerView.C0584v c0584v, @NonNull RecyclerView.C0588z c0588z, int i, @Nullable Bundle bundle) {
            return ViewPager2.this.f3348t.mo4261b(i) ? ViewPager2.this.f3348t.mo4271l(i) : super.performAccessibilityAction(c0584v, c0588z, i, bundle);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0577o
        public boolean requestChildRectangleOnScreen(@NonNull RecyclerView recyclerView, @NonNull View view, @NonNull Rect rect, boolean z, boolean z2) {
            return false;
        }
    }

    /* JADX INFO: renamed from: androidx.viewpager2.widget.ViewPager2$i */
    public static abstract class AbstractC0740i {
        public void onPageScrollStateChanged(int i) {
        }

        public void onPageScrolled(int i, float f, @Px int i2) {
        }

        public void onPageSelected(int i) {
        }
    }

    /* JADX INFO: renamed from: androidx.viewpager2.widget.ViewPager2$j */
    public class C0741j extends AbstractC0736e {

        /* JADX INFO: renamed from: b */
        public final InterfaceC17741jc f3357b;

        /* JADX INFO: renamed from: c */
        public final InterfaceC17741jc f3358c;

        /* JADX INFO: renamed from: d */
        public RecyclerView.AbstractC0571i f3359d;

        /* JADX INFO: renamed from: androidx.viewpager2.widget.ViewPager2$j$a */
        public class a implements InterfaceC17741jc {
            public a() {
            }

            @Override // p149l.InterfaceC17741jc
            public boolean perform(@NonNull View view, @Nullable InterfaceC17741jc.a aVar) {
                C0741j.this.m4283x(((ViewPager2) view).getCurrentItem() + 1);
                return true;
            }
        }

        /* JADX INFO: renamed from: androidx.viewpager2.widget.ViewPager2$j$b */
        public class b implements InterfaceC17741jc {
            public b() {
            }

            @Override // p149l.InterfaceC17741jc
            public boolean perform(@NonNull View view, @Nullable InterfaceC17741jc.a aVar) {
                C0741j.this.m4283x(((ViewPager2) view).getCurrentItem() - 1);
                return true;
            }
        }

        /* JADX INFO: renamed from: androidx.viewpager2.widget.ViewPager2$j$c */
        public class c extends AbstractC0738g {
            public c() {
                super(null);
            }

            @Override // androidx.viewpager2.widget.ViewPager2.AbstractC0738g, androidx.recyclerview.widget.RecyclerView.AbstractC0571i
            public void onChanged() {
                C0741j.this.m4284y();
            }
        }

        public C0741j() {
            super(ViewPager2.this, null);
            this.f3357b = new a();
            this.f3358c = new b();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC0736e
        /* JADX INFO: renamed from: a */
        public boolean mo4260a() {
            return true;
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC0736e
        /* JADX INFO: renamed from: c */
        public boolean mo4262c(int i, Bundle bundle) {
            return i == 8192 || i == 4096;
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC0736e
        /* JADX INFO: renamed from: e */
        public void mo4264e(@Nullable RecyclerView.Adapter<?> adapter) {
            m4284y();
            if (adapter != null) {
                adapter.registerAdapterDataObserver(this.f3359d);
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC0736e
        /* JADX INFO: renamed from: f */
        public void mo4265f(@Nullable RecyclerView.Adapter<?> adapter) {
            if (adapter != null) {
                adapter.unregisterAdapterDataObserver(this.f3359d);
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC0736e
        /* JADX INFO: renamed from: g */
        public String mo4266g() {
            if (mo4260a()) {
                return "androidx.viewpager.widget.ViewPager";
            }
            ohg0.m164364a();
            return null;
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC0736e
        /* JADX INFO: renamed from: h */
        public void mo4267h(@NonNull C0745a c0745a, @NonNull RecyclerView recyclerView) {
            gbl0.m125221t0(recyclerView, 2);
            this.f3359d = new c();
            if (gbl0.m125224v(ViewPager2.this) == 0) {
                gbl0.m125221t0(ViewPager2.this, 1);
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC0736e
        /* JADX INFO: renamed from: i */
        public void mo4268i(AccessibilityNodeInfo accessibilityNodeInfo) {
            C17055gc c17055gcM125351T0 = C17055gc.m125351T0(accessibilityNodeInfo);
            m4280u(c17055gcM125351T0);
            m4282w(c17055gcM125351T0);
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC0736e
        /* JADX INFO: renamed from: k */
        public void mo4270k(@NonNull View view, @NonNull C17055gc c17055gc) {
            m4281v(view, c17055gc);
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC0736e
        /* JADX INFO: renamed from: m */
        public boolean mo4272m(int i, Bundle bundle) {
            if (!mo4262c(i, bundle)) {
                ohg0.m164364a();
                return false;
            }
            ViewPager2 viewPager2 = ViewPager2.this;
            m4283x(i == 8192 ? viewPager2.getCurrentItem() - 1 : viewPager2.getCurrentItem() + 1);
            return true;
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC0736e
        /* JADX INFO: renamed from: n */
        public void mo4273n() {
            m4284y();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC0736e
        /* JADX INFO: renamed from: p */
        public void mo4275p(@NonNull AccessibilityEvent accessibilityEvent) {
            accessibilityEvent.setSource(ViewPager2.this);
            accessibilityEvent.setClassName(mo4266g());
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC0736e
        /* JADX INFO: renamed from: q */
        public void mo4276q() {
            m4284y();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC0736e
        /* JADX INFO: renamed from: r */
        public void mo4277r() {
            m4284y();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC0736e
        /* JADX INFO: renamed from: s */
        public void mo4278s() {
            m4284y();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC0736e
        /* JADX INFO: renamed from: t */
        public void mo4279t() {
            m4284y();
        }

        /* JADX INFO: renamed from: u */
        public final void m4280u(C17055gc c17055gc) {
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
            c17055gc.m125431q0(C17055gc.e.m125462b(itemCount2, itemCount, false, 0));
        }

        /* JADX INFO: renamed from: v */
        public final void m4281v(View view, C17055gc c17055gc) {
            c17055gc.m125432r0(C17055gc.f.m125463a(ViewPager2.this.getOrientation() == 1 ? ViewPager2.this.f3335g.getPosition(view) : 0, 1, ViewPager2.this.getOrientation() == 0 ? ViewPager2.this.f3335g.getPosition(view) : 0, 1, false, false));
        }

        /* JADX INFO: renamed from: w */
        public final void m4282w(C17055gc c17055gc) {
            int itemCount;
            RecyclerView.Adapter adapter = ViewPager2.this.getAdapter();
            if (adapter == null || (itemCount = adapter.getItemCount()) == 0 || !ViewPager2.this.m4245e()) {
                return;
            }
            if (ViewPager2.this.f3332d > 0) {
                c17055gc.m125402a(8192);
            }
            if (ViewPager2.this.f3332d < itemCount - 1) {
                c17055gc.m125402a(4096);
            }
            c17055gc.m125378K0(true);
        }

        /* JADX INFO: renamed from: x */
        public void m4283x(int i) {
            if (ViewPager2.this.m4245e()) {
                ViewPager2.this.m4251k(i, true);
            }
        }

        /* JADX INFO: renamed from: y */
        public void m4284y() {
            int itemCount;
            ViewPager2 viewPager2 = ViewPager2.this;
            int i = R.id.accessibilityActionPageLeft;
            gbl0.m125189d0(viewPager2, R.id.accessibilityActionPageLeft);
            gbl0.m125189d0(viewPager2, R.id.accessibilityActionPageRight);
            gbl0.m125189d0(viewPager2, R.id.accessibilityActionPageUp);
            gbl0.m125189d0(viewPager2, R.id.accessibilityActionPageDown);
            if (ViewPager2.this.getAdapter() == null || (itemCount = ViewPager2.this.getAdapter().getItemCount()) == 0 || !ViewPager2.this.m4245e()) {
                return;
            }
            int orientation = ViewPager2.this.getOrientation();
            ViewPager2 viewPager3 = ViewPager2.this;
            if (orientation != 0) {
                if (viewPager3.f3332d < itemCount - 1) {
                    gbl0.m125193f0(viewPager2, new C17055gc.a(R.id.accessibilityActionPageDown, null), null, this.f3357b);
                }
                if (ViewPager2.this.f3332d > 0) {
                    gbl0.m125193f0(viewPager2, new C17055gc.a(R.id.accessibilityActionPageUp, null), null, this.f3358c);
                    return;
                }
                return;
            }
            boolean zM4244d = viewPager3.m4244d();
            int i2 = zM4244d ? 16908360 : 16908361;
            if (zM4244d) {
                i = 16908361;
            }
            if (ViewPager2.this.f3332d < itemCount - 1) {
                gbl0.m125193f0(viewPager2, new C17055gc.a(i2, null), null, this.f3357b);
            }
            if (ViewPager2.this.f3332d > 0) {
                gbl0.m125193f0(viewPager2, new C17055gc.a(i, null), null, this.f3358c);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.viewpager2.widget.ViewPager2$k */
    public interface InterfaceC0742k {
        /* JADX INFO: renamed from: a */
        void mo4285a(@NonNull View view, float f);
    }

    /* JADX INFO: renamed from: androidx.viewpager2.widget.ViewPager2$l */
    public class C0743l extends C0613s {
        public C0743l() {
        }

        @Override // androidx.recyclerview.widget.C0613s, androidx.recyclerview.widget.AbstractC0617w
        @Nullable
        /* JADX INFO: renamed from: h */
        public View mo3811h(RecyclerView.AbstractC0577o abstractC0577o) {
            if (ViewPager2.this.m4243c()) {
                return null;
            }
            return super.mo3811h(abstractC0577o);
        }
    }

    /* JADX INFO: renamed from: androidx.viewpager2.widget.ViewPager2$m */
    public static class RunnableC0744m implements Runnable {

        /* JADX INFO: renamed from: a */
        public final int f3365a;

        /* JADX INFO: renamed from: b */
        public final RecyclerView f3366b;

        public RunnableC0744m(int i, RecyclerView recyclerView) {
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
        this.f3331c = new C0745a(3);
        this.f3333e = false;
        this.f3334f = new C0732a();
        this.f3336h = -1;
        this.f3344p = null;
        this.f3345q = false;
        this.f3346r = true;
        this.f3347s = -1;
        m4242b(context, null);
    }

    /* JADX INFO: renamed from: a */
    public final RecyclerView.InterfaceC0579q m4241a() {
        return new C0735d();
    }

    /* JADX INFO: renamed from: b */
    public final void m4242b(Context context, AttributeSet attributeSet) {
        this.f3348t = f3328u ? new C0741j() : new C0737f();
        RecyclerViewImpl recyclerViewImpl = new RecyclerViewImpl(context);
        this.f3338j = recyclerViewImpl;
        recyclerViewImpl.setId(gbl0.m125198i());
        this.f3338j.setDescendantFocusability(131072);
        C0739h c0739h = new C0739h(context);
        this.f3335g = c0739h;
        this.f3338j.setLayoutManager(c0739h);
        this.f3338j.setScrollingTouchSlop(1);
        m4252l(context, attributeSet);
        this.f3338j.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        this.f3338j.addOnChildAttachStateChangeListener(m4241a());
        C0749e c0749e = new C0749e(this);
        this.f3340l = c0749e;
        this.f3342n = new ywf(this, c0749e, this.f3338j);
        C0743l c0743l = new C0743l();
        this.f3339k = c0743l;
        c0743l.mo3857b(this.f3338j);
        this.f3338j.addOnScrollListener(this.f3340l);
        C0745a c0745a = new C0745a(3);
        this.f3341m = c0745a;
        this.f3340l.m4305p(c0745a);
        C0733b c0733b = new C0733b();
        C0734c c0734c = new C0734c();
        this.f3341m.m4286a(c0733b);
        this.f3341m.m4286a(c0734c);
        this.f3348t.mo4267h(this.f3341m, this.f3338j);
        this.f3341m.m4286a(this.f3331c);
        C0748d c0748d = new C0748d(this.f3335g);
        this.f3343o = c0748d;
        this.f3341m.m4286a(c0748d);
        RecyclerView recyclerView = this.f3338j;
        attachViewToParent(recyclerView, 0, recyclerView.getLayoutParams());
    }

    /* JADX INFO: renamed from: c */
    public boolean m4243c() {
        return this.f3342n.m216391a();
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
    public boolean m4244d() {
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
        m4249i();
    }

    /* JADX INFO: renamed from: e */
    public boolean m4245e() {
        return this.f3346r;
    }

    /* JADX INFO: renamed from: f */
    public final void m4246f(@Nullable RecyclerView.Adapter<?> adapter) {
        if (adapter != null) {
            adapter.registerAdapterDataObserver(this.f3334f);
        }
    }

    /* JADX INFO: renamed from: g */
    public void m4247g(@NonNull AbstractC0740i abstractC0740i) {
        this.f3331c.m4286a(abstractC0740i);
    }

    @Override // android.view.ViewGroup, android.view.View
    @RequiresApi(23)
    public CharSequence getAccessibilityClassName() {
        return this.f3348t.mo4260a() ? this.f3348t.mo4266g() : super.getAccessibilityClassName();
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
        return this.f3340l.m4299f();
    }

    /* JADX INFO: renamed from: h */
    public void m4248h() {
        if (this.f3343o.m4291a() == null) {
            return;
        }
        double dM4298e = this.f3340l.m4298e();
        int i = (int) dM4298e;
        float f = (float) (dM4298e - ((double) i));
        this.f3343o.onPageScrolled(i, f, Math.round(getPageSize() * f));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: i */
    public final void m4249i() {
        RecyclerView.Adapter adapter;
        if (this.f3336h == -1 || (adapter = getAdapter()) == 0) {
            return;
        }
        Parcelable parcelable = this.f3337i;
        if (parcelable != null) {
            if (adapter instanceof pvf0) {
                ((pvf0) adapter).mo4224p(parcelable);
            }
            this.f3337i = null;
        }
        int iMax = Math.max(0, Math.min(this.f3336h, adapter.getItemCount() - 1));
        this.f3332d = iMax;
        this.f3336h = -1;
        this.f3338j.scrollToPosition(iMax);
        this.f3348t.mo4273n();
    }

    /* JADX INFO: renamed from: j */
    public void m4250j(int i, boolean z) {
        if (m4243c()) {
            qkq0.m175383a("Cannot change current item when ViewPager2 is fake dragging");
        } else {
            m4251k(i, z);
        }
    }

    /* JADX INFO: renamed from: k */
    public void m4251k(int i, boolean z) {
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
        if (iMin == this.f3332d && this.f3340l.m4301j()) {
            return;
        }
        int i2 = this.f3332d;
        if (iMin == i2 && z) {
            return;
        }
        double dM4298e = i2;
        this.f3332d = iMin;
        this.f3348t.mo4277r();
        if (!this.f3340l.m4301j()) {
            dM4298e = this.f3340l.m4298e();
        }
        this.f3340l.m4304m(iMin, z);
        if (!z) {
            this.f3338j.scrollToPosition(iMin);
            return;
        }
        double d = iMin;
        double dAbs = Math.abs(d - dM4298e);
        RecyclerView recyclerView = this.f3338j;
        if (dAbs <= 3.0d) {
            recyclerView.smoothScrollToPosition(iMin);
            return;
        }
        recyclerView.scrollToPosition(d > dM4298e ? iMin - 3 : iMin + 3);
        RecyclerView recyclerView2 = this.f3338j;
        recyclerView2.post(new RunnableC0744m(iMin, recyclerView2));
    }

    /* JADX INFO: renamed from: l */
    public final void m4252l(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, q8c0.f153155a);
        gbl0.m125197h0(this, context, q8c0.f153155a, attributeSet, typedArrayObtainStyledAttributes, 0, 0);
        try {
            setOrientation(typedArrayObtainStyledAttributes.getInt(q8c0.f153156b, 0));
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m4253m(@Nullable RecyclerView.Adapter<?> adapter) {
        if (adapter != null) {
            adapter.unregisterAdapterDataObserver(this.f3334f);
        }
    }

    /* JADX INFO: renamed from: n */
    public void m4254n(@NonNull AbstractC0740i abstractC0740i) {
        this.f3331c.m4287b(abstractC0740i);
    }

    /* JADX INFO: renamed from: o */
    public void m4255o() {
        C0613s c0613s = this.f3339k;
        if (c0613s == null) {
            qkq0.m175383a("Design assumption violated.");
            return;
        }
        View viewMo3811h = c0613s.mo3811h(this.f3335g);
        if (viewMo3811h == null) {
            return;
        }
        int position = this.f3335g.getPosition(viewMo3811h);
        if (position != this.f3332d && getScrollState() == 0) {
            this.f3341m.onPageSelected(position);
        }
        this.f3333e = false;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        this.f3348t.mo4268i(accessibilityNodeInfo);
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
            m4255o();
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
        if (adapter instanceof pvf0) {
            savedState.mAdapterState = ((pvf0) adapter).mo4223a();
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
        return this.f3348t.mo4262c(i, bundle) ? this.f3348t.mo4272m(i, bundle) : super.performAccessibilityAction(i, bundle);
    }

    public void setAdapter(@Nullable RecyclerView.Adapter adapter) {
        RecyclerView.Adapter adapter2 = this.f3338j.getAdapter();
        this.f3348t.mo4265f(adapter2);
        m4253m(adapter2);
        this.f3338j.setAdapter(adapter);
        this.f3332d = 0;
        m4249i();
        this.f3348t.mo4264e(adapter);
        m4246f(adapter);
    }

    public void setCurrentItem(int i) {
        m4250j(i, true);
    }

    @Override // android.view.View
    @RequiresApi(17)
    public void setLayoutDirection(int i) {
        super.setLayoutDirection(i);
        this.f3348t.mo4276q();
    }

    public void setOffscreenPageLimit(int i) {
        if (i < 1 && i != -1) {
            ig3.m135964a("Offscreen page limit must be OFFSCREEN_PAGE_LIMIT_DEFAULT or a number > 0");
        } else {
            this.f3347s = i;
            this.f3338j.requestLayout();
        }
    }

    public void setOrientation(int i) {
        this.f3335g.setOrientation(i);
        this.f3348t.mo4278s();
    }

    public void setPageTransformer(@Nullable InterfaceC0742k interfaceC0742k) {
        boolean z = this.f3345q;
        if (interfaceC0742k != null) {
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
        if (interfaceC0742k == this.f3343o.m4291a()) {
            return;
        }
        this.f3343o.m4292b(interfaceC0742k);
        m4248h();
    }

    public void setUserInputEnabled(boolean z) {
        this.f3346r = z;
        this.f3348t.mo4279t();
    }

    /* JADX INFO: renamed from: androidx.viewpager2.widget.ViewPager2$g */
    public static abstract class AbstractC0738g extends RecyclerView.AbstractC0571i {
        public AbstractC0738g() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0571i
        public abstract void onChanged();

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0571i
        public final void onItemRangeChanged(int i, int i2) {
            onChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0571i
        public final void onItemRangeInserted(int i, int i2) {
            onChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0571i
        public final void onItemRangeMoved(int i, int i2, int i3) {
            onChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0571i
        public final void onItemRangeRemoved(int i, int i2) {
            onChanged();
        }

        public /* synthetic */ AbstractC0738g(C0732a c0732a) {
            this();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0571i
        public final void onItemRangeChanged(int i, int i2, @Nullable Object obj) {
            onChanged();
        }
    }

    /* JADX INFO: renamed from: androidx.viewpager2.widget.ViewPager2$e */
    public abstract class AbstractC0736e {
        public AbstractC0736e() {
        }

        /* JADX INFO: renamed from: a */
        public boolean mo4260a() {
            return false;
        }

        /* JADX INFO: renamed from: b */
        public boolean mo4261b(int i) {
            return false;
        }

        /* JADX INFO: renamed from: c */
        public boolean mo4262c(int i, Bundle bundle) {
            return false;
        }

        /* JADX INFO: renamed from: d */
        public boolean mo4263d() {
            return false;
        }

        /* JADX INFO: renamed from: e */
        public void mo4264e(@Nullable RecyclerView.Adapter<?> adapter) {
        }

        /* JADX INFO: renamed from: f */
        public void mo4265f(@Nullable RecyclerView.Adapter<?> adapter) {
        }

        /* JADX INFO: renamed from: g */
        public String mo4266g() {
            throw new IllegalStateException("Not implemented.");
        }

        /* JADX INFO: renamed from: h */
        public void mo4267h(@NonNull C0745a c0745a, @NonNull RecyclerView recyclerView) {
        }

        /* JADX INFO: renamed from: i */
        public void mo4268i(AccessibilityNodeInfo accessibilityNodeInfo) {
        }

        /* JADX INFO: renamed from: l */
        public boolean mo4271l(int i) {
            throw new IllegalStateException("Not implemented.");
        }

        /* JADX INFO: renamed from: m */
        public boolean mo4272m(int i, Bundle bundle) {
            throw new IllegalStateException("Not implemented.");
        }

        /* JADX INFO: renamed from: n */
        public void mo4273n() {
        }

        /* JADX INFO: renamed from: o */
        public CharSequence mo4274o() {
            throw new IllegalStateException("Not implemented.");
        }

        /* JADX INFO: renamed from: p */
        public void mo4275p(@NonNull AccessibilityEvent accessibilityEvent) {
        }

        /* JADX INFO: renamed from: q */
        public void mo4276q() {
        }

        /* JADX INFO: renamed from: r */
        public void mo4277r() {
        }

        /* JADX INFO: renamed from: s */
        public void mo4278s() {
        }

        /* JADX INFO: renamed from: t */
        public void mo4279t() {
        }

        public /* synthetic */ AbstractC0736e(ViewPager2 viewPager2, C0732a c0732a) {
            this();
        }

        /* JADX INFO: renamed from: j */
        public void mo4269j(@NonNull C17055gc c17055gc) {
        }

        /* JADX INFO: renamed from: k */
        public void mo4270k(@NonNull View view, @NonNull C17055gc c17055gc) {
        }
    }

    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C0731a();
        Parcelable mAdapterState;
        int mCurrentItem;
        int mRecyclerViewId;

        /* JADX INFO: renamed from: androidx.viewpager2.widget.ViewPager2$SavedState$a */
        public class C0731a implements Parcelable.ClassLoaderCreator<SavedState> {
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
            m4256a(parcel, classLoader);
        }

        /* JADX INFO: renamed from: a */
        public final void m4256a(Parcel parcel, ClassLoader classLoader) {
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
        this.f3331c = new C0745a(3);
        this.f3333e = false;
        this.f3334f = new C0732a();
        this.f3336h = -1;
        this.f3344p = null;
        this.f3345q = false;
        this.f3346r = true;
        this.f3347s = -1;
        m4242b(context, attributeSet);
    }

    public ViewPager2(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f3329a = new Rect();
        this.f3330b = new Rect();
        this.f3331c = new C0745a(3);
        this.f3333e = false;
        this.f3334f = new C0732a();
        this.f3336h = -1;
        this.f3344p = null;
        this.f3345q = false;
        this.f3346r = true;
        this.f3347s = -1;
        m4242b(context, attributeSet);
    }

    @RequiresApi(21)
    @SuppressLint({"ClassVerificationFailure"})
    public ViewPager2(@NonNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f3329a = new Rect();
        this.f3330b = new Rect();
        this.f3331c = new C0745a(3);
        this.f3333e = false;
        this.f3334f = new C0732a();
        this.f3336h = -1;
        this.f3344p = null;
        this.f3345q = false;
        this.f3346r = true;
        this.f3347s = -1;
        m4242b(context, attributeSet);
    }
}
