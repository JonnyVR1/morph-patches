package androidx.viewpager2.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Locale;
import p149l.qkq0;
import p149l.yp0;

/* JADX INFO: renamed from: androidx.viewpager2.widget.e */
/* JADX INFO: loaded from: classes.dex */
public final class C0749e extends RecyclerView.AbstractC0582t {

    /* JADX INFO: renamed from: a */
    public ViewPager2.AbstractC0740i f3372a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final ViewPager2 f3373b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final RecyclerView f3374c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final LinearLayoutManager f3375d;

    /* JADX INFO: renamed from: e */
    public int f3376e;

    /* JADX INFO: renamed from: f */
    public int f3377f;

    /* JADX INFO: renamed from: g */
    public a f3378g;

    /* JADX INFO: renamed from: h */
    public int f3379h;

    /* JADX INFO: renamed from: i */
    public int f3380i;

    /* JADX INFO: renamed from: j */
    public boolean f3381j;

    /* JADX INFO: renamed from: k */
    public boolean f3382k;

    /* JADX INFO: renamed from: l */
    public boolean f3383l;

    /* JADX INFO: renamed from: m */
    public boolean f3384m;

    /* JADX INFO: renamed from: androidx.viewpager2.widget.e$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public int f3385a;

        /* JADX INFO: renamed from: b */
        public float f3386b;

        /* JADX INFO: renamed from: c */
        public int f3387c;

        /* JADX INFO: renamed from: a */
        public void m4308a() {
            this.f3385a = -1;
            this.f3386b = 0.0f;
            this.f3387c = 0;
        }
    }

    public C0749e(@NonNull ViewPager2 viewPager2) {
        this.f3373b = viewPager2;
        RecyclerView recyclerView = viewPager2.f3338j;
        this.f3374c = recyclerView;
        this.f3375d = (LinearLayoutManager) recyclerView.getLayoutManager();
        this.f3378g = new a();
        m4294n();
    }

    /* JADX INFO: renamed from: d */
    private int m4293d() {
        return this.f3375d.findFirstVisibleItemPosition();
    }

    /* JADX INFO: renamed from: n */
    private void m4294n() {
        this.f3376e = 0;
        this.f3377f = 0;
        this.f3378g.m4308a();
        this.f3379h = -1;
        this.f3380i = -1;
        this.f3381j = false;
        this.f3382k = false;
        this.f3384m = false;
        this.f3383l = false;
    }

    /* JADX INFO: renamed from: a */
    public final void m4295a(int i, float f, int i2) {
        ViewPager2.AbstractC0740i abstractC0740i = this.f3372a;
        if (abstractC0740i != null) {
            abstractC0740i.onPageScrolled(i, f, i2);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m4296b(int i) {
        ViewPager2.AbstractC0740i abstractC0740i = this.f3372a;
        if (abstractC0740i != null) {
            abstractC0740i.onPageSelected(i);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m4297c(int i) {
        if ((this.f3376e == 3 && this.f3377f == 0) || this.f3377f == i) {
            return;
        }
        this.f3377f = i;
        ViewPager2.AbstractC0740i abstractC0740i = this.f3372a;
        if (abstractC0740i != null) {
            abstractC0740i.onPageScrollStateChanged(i);
        }
    }

    /* JADX INFO: renamed from: e */
    public double m4298e() {
        m4307s();
        a aVar = this.f3378g;
        return ((double) aVar.f3385a) + ((double) aVar.f3386b);
    }

    /* JADX INFO: renamed from: f */
    public int m4299f() {
        return this.f3377f;
    }

    /* JADX INFO: renamed from: i */
    public boolean m4300i() {
        return this.f3384m;
    }

    /* JADX INFO: renamed from: j */
    public boolean m4301j() {
        return this.f3377f == 0;
    }

    /* JADX INFO: renamed from: k */
    public final boolean m4302k() {
        int i = this.f3376e;
        return i == 1 || i == 4;
    }

    /* JADX INFO: renamed from: l */
    public void m4303l() {
        this.f3383l = true;
    }

    /* JADX INFO: renamed from: m */
    public void m4304m(int i, boolean z) {
        this.f3376e = z ? 2 : 3;
        this.f3384m = false;
        boolean z2 = this.f3380i != i;
        this.f3380i = i;
        m4297c(2);
        if (z2) {
            m4296b(i);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0582t
    public void onScrollStateChanged(@NonNull RecyclerView recyclerView, int i) {
        if (!(this.f3376e == 1 && this.f3377f == 1) && i == 1) {
            m4306q(false);
            return;
        }
        if (m4302k() && i == 2) {
            if (this.f3382k) {
                m4297c(2);
                this.f3381j = true;
                return;
            }
            return;
        }
        if (m4302k() && i == 0) {
            m4307s();
            boolean z = this.f3382k;
            a aVar = this.f3378g;
            if (!z) {
                int i2 = aVar.f3385a;
                if (i2 != -1) {
                    m4295a(i2, 0.0f, 0);
                }
            } else if (aVar.f3387c == 0) {
                int i3 = this.f3379h;
                int i4 = aVar.f3385a;
                if (i3 != i4) {
                    m4296b(i4);
                }
            }
            m4297c(0);
            m4294n();
        }
        if (this.f3376e == 2 && i == 0 && this.f3383l) {
            m4307s();
            a aVar2 = this.f3378g;
            if (aVar2.f3387c == 0) {
                int i5 = this.f3380i;
                int i6 = aVar2.f3385a;
                if (i5 != i6) {
                    if (i6 == -1) {
                        i6 = 0;
                    }
                    m4296b(i6);
                }
                m4297c(0);
                m4294n();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x001f  */
    /* JADX WARN: Code duplicated, block: B:14:0x0025  */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0582t
    public void onScrolled(@NonNull RecyclerView recyclerView, int i, int i2) {
        a aVar;
        int i3;
        this.f3382k = true;
        m4307s();
        if (this.f3381j) {
            this.f3381j = false;
            if (i2 > 0) {
                aVar = this.f3378g;
                if (aVar.f3387c != 0) {
                    i3 = aVar.f3385a + 1;
                } else {
                    i3 = this.f3378g.f3385a;
                }
            } else {
                if (i2 == 0) {
                    if ((i < 0) == this.f3373b.m4244d()) {
                        aVar = this.f3378g;
                        if (aVar.f3387c != 0) {
                            i3 = aVar.f3385a + 1;
                        }
                    }
                }
                i3 = this.f3378g.f3385a;
            }
            this.f3380i = i3;
            if (this.f3379h != i3) {
                m4296b(i3);
            }
        } else if (this.f3376e == 0) {
            int i4 = this.f3378g.f3385a;
            if (i4 == -1) {
                i4 = 0;
            }
            m4296b(i4);
        }
        a aVar2 = this.f3378g;
        int i5 = aVar2.f3385a;
        if (i5 == -1) {
            i5 = 0;
        }
        m4295a(i5, aVar2.f3386b, aVar2.f3387c);
        a aVar3 = this.f3378g;
        int i6 = aVar3.f3385a;
        int i7 = this.f3380i;
        if ((i6 == i7 || i7 == -1) && aVar3.f3387c == 0 && this.f3377f != 1) {
            m4297c(0);
            m4294n();
        }
    }

    /* JADX INFO: renamed from: p */
    public void m4305p(ViewPager2.AbstractC0740i abstractC0740i) {
        this.f3372a = abstractC0740i;
    }

    /* JADX INFO: renamed from: q */
    public final void m4306q(boolean z) {
        this.f3384m = z;
        this.f3376e = z ? 4 : 1;
        int i = this.f3380i;
        if (i != -1) {
            this.f3379h = i;
            this.f3380i = -1;
        } else if (this.f3379h == -1) {
            this.f3379h = m4293d();
        }
        m4297c(1);
    }

    /* JADX INFO: renamed from: s */
    public final void m4307s() {
        int top;
        a aVar = this.f3378g;
        int iFindFirstVisibleItemPosition = this.f3375d.findFirstVisibleItemPosition();
        aVar.f3385a = iFindFirstVisibleItemPosition;
        if (iFindFirstVisibleItemPosition == -1) {
            aVar.m4308a();
            return;
        }
        View viewFindViewByPosition = this.f3375d.findViewByPosition(iFindFirstVisibleItemPosition);
        if (viewFindViewByPosition == null) {
            aVar.m4308a();
            return;
        }
        int leftDecorationWidth = this.f3375d.getLeftDecorationWidth(viewFindViewByPosition);
        int rightDecorationWidth = this.f3375d.getRightDecorationWidth(viewFindViewByPosition);
        int topDecorationHeight = this.f3375d.getTopDecorationHeight(viewFindViewByPosition);
        int bottomDecorationHeight = this.f3375d.getBottomDecorationHeight(viewFindViewByPosition);
        ViewGroup.LayoutParams layoutParams = viewFindViewByPosition.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            leftDecorationWidth += marginLayoutParams.leftMargin;
            rightDecorationWidth += marginLayoutParams.rightMargin;
            topDecorationHeight += marginLayoutParams.topMargin;
            bottomDecorationHeight += marginLayoutParams.bottomMargin;
        }
        int height = viewFindViewByPosition.getHeight() + topDecorationHeight + bottomDecorationHeight;
        int width = viewFindViewByPosition.getWidth() + leftDecorationWidth + rightDecorationWidth;
        if (this.f3375d.getOrientation() == 0) {
            top = (viewFindViewByPosition.getLeft() - leftDecorationWidth) - this.f3374c.getPaddingLeft();
            if (this.f3373b.m4244d()) {
                top = -top;
            }
            height = width;
        } else {
            top = (viewFindViewByPosition.getTop() - topDecorationHeight) - this.f3374c.getPaddingTop();
        }
        int i = -top;
        aVar.f3387c = i;
        if (i >= 0) {
            aVar.f3386b = height == 0 ? 0.0f : i / height;
        } else if (new yp0(this.f3375d).m215564d()) {
            qkq0.m175383a("Page(s) contain a ViewGroup with a LayoutTransition (or animateLayoutChanges=\"true\"), which interferes with the scrolling animation. Make sure to call getLayoutTransition().setAnimateParentHierarchy(false) on all ViewGroups with a LayoutTransition before an animation is started.");
        } else {
            qkq0.m175383a(String.format(Locale.US, "Page can only be offset by a positive amount, not by %d", Integer.valueOf(aVar.f3387c)));
        }
    }
}
