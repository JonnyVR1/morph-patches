package p147v;

import android.R;
import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.viewpager.widget.ViewPager;
import p149l.w660;
import p149l.yd5;

/* JADX INFO: loaded from: classes3.dex */
public class VSlidingTabs extends VScroll_Horizontal {

    /* JADX INFO: renamed from: a */
    public int f209346a;

    /* JADX INFO: renamed from: b */
    public int f209347b;

    /* JADX INFO: renamed from: c */
    public int f209348c;

    /* JADX INFO: renamed from: d */
    public int f209349d;

    /* JADX INFO: renamed from: e */
    public int f209350e;

    /* JADX INFO: renamed from: f */
    public ViewPager f209351f;

    /* JADX INFO: renamed from: g */
    public ViewPager.InterfaceC0716j f209352g;

    /* JADX INFO: renamed from: h */
    public final VSlidingTabStrip f209353h;

    /* JADX INFO: renamed from: i */
    public boolean f209354i;

    /* JADX INFO: renamed from: j */
    public boolean f209355j;

    /* JADX INFO: renamed from: v.VSlidingTabs$a */
    public class C22571a implements ViewPager.InterfaceC0716j {

        /* JADX INFO: renamed from: a */
        public int f209356a;

        public C22571a() {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0716j
        public void onPageScrollStateChanged(int i) {
            this.f209356a = i;
            if (VSlidingTabs.this.f209352g != null) {
                VSlidingTabs.this.f209352g.onPageScrollStateChanged(i);
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0716j
        public void onPageScrolled(int i, float f, int i2) {
            int childCount = VSlidingTabs.this.f209353h.getChildCount();
            if (childCount == 0 || i < 0 || i >= childCount) {
                return;
            }
            VSlidingTabs.this.f209353h.m223206a(i, f);
            View childAt = VSlidingTabs.this.f209353h.getChildAt(i);
            VSlidingTabs.this.m223220k(i, f, childAt != null ? (int) (childAt.getWidth() * f) : 0);
            if (VSlidingTabs.this.f209352g != null) {
                VSlidingTabs.this.f209352g.onPageScrolled(i, f, i2);
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0716j
        public void onPageSelected(int i) {
            if (this.f209356a == 0) {
                VSlidingTabs.this.f209353h.m223206a(i, 0.0f);
                VSlidingTabs.this.m223220k(i, 0.0f, 0);
            }
            if (VSlidingTabs.this.f209355j) {
                for (int i2 = 0; i2 < VSlidingTabs.this.f209353h.getChildCount(); i2++) {
                    TextView textView = (TextView) VSlidingTabs.this.f209353h.getChildAt(i2).findViewById(VSlidingTabs.this.f209350e);
                    VSlidingTabs vSlidingTabs = VSlidingTabs.this;
                    if (i2 == i) {
                        textView.setTextColor(vSlidingTabs.f209346a);
                    } else {
                        textView.setTextColor(vSlidingTabs.f209347b);
                    }
                }
            }
            if (VSlidingTabs.this.f209352g != null) {
                VSlidingTabs.this.f209352g.onPageSelected(i);
            }
        }
    }

    /* JADX INFO: renamed from: v.VSlidingTabs$b */
    public class ViewOnClickListenerC22572b implements View.OnClickListener {
        public ViewOnClickListenerC22572b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            for (int i = 0; i < VSlidingTabs.this.f209353h.getChildCount(); i++) {
                if (view == VSlidingTabs.this.f209353h.getChildAt(i)) {
                    VSlidingTabs.this.f209351f.setCurrentItem(i);
                    return;
                }
            }
        }
    }

    /* JADX INFO: renamed from: v.VSlidingTabs$c */
    public interface InterfaceC22573c {
        /* JADX INFO: renamed from: a */
        int mo223207a(int i);

        /* JADX INFO: renamed from: b */
        int mo223208b(int i);
    }

    public VSlidingTabs(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f209354i = false;
        this.f209355j = false;
        setHorizontalScrollBarEnabled(false);
        setFillViewport(true);
        this.f209348c = (int) (getResources().getDisplayMetrics().density * 24.0f);
        VSlidingTabStrip vSlidingTabStrip = new VSlidingTabStrip(context);
        this.f209353h = vSlidingTabStrip;
        addView(vSlidingTabStrip, -1, -2);
    }

    public VSlidingTabStrip getTabStrip() {
        return this.f209353h;
    }

    /* JADX INFO: renamed from: i */
    public TextView m223218i(Context context) {
        TextView textView = new TextView(context);
        textView.setGravity(17);
        textView.setTextSize(2, 12.0f);
        textView.setTypeface(Typeface.DEFAULT_BOLD);
        TypedValue typedValue = new TypedValue();
        getContext().getTheme().resolveAttribute(R.attr.selectableItemBackground, typedValue, true);
        textView.setBackgroundResource(typedValue.resourceId);
        textView.setAllCaps(true);
        int i = (int) (getResources().getDisplayMetrics().density * 16.0f);
        textView.setPadding(i, i, i, i);
        return textView;
    }

    /* JADX INFO: renamed from: j */
    public final void m223219j() {
        View viewM223218i;
        TextView textView;
        w660 adapter = this.f209351f.getAdapter();
        ViewOnClickListenerC22572b viewOnClickListenerC22572b = new ViewOnClickListenerC22572b();
        int i = 0;
        while (i < adapter.getCount()) {
            if (this.f209349d != 0) {
                viewM223218i = LayoutInflater.from(getContext()).inflate(this.f209349d, (ViewGroup) this.f209353h, false);
                textView = (TextView) viewM223218i.findViewById(this.f209350e);
            } else {
                viewM223218i = null;
                textView = null;
            }
            if (viewM223218i == null) {
                viewM223218i = m223218i(getContext());
            }
            if (textView == null && TextView.class.isInstance(viewM223218i)) {
                textView = (TextView) viewM223218i;
            }
            textView.setTextColor(i == this.f209351f.getCurrentItem() ? this.f209346a : this.f209347b);
            textView.setText(adapter.getPageTitle(i));
            viewM223218i.setOnClickListener(viewOnClickListenerC22572b);
            this.f209353h.addView(viewM223218i);
            i++;
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m223220k(int i, float f, int i2) {
        int childCount = this.f209353h.getChildCount();
        if (childCount == 0 || i < 0 || i >= childCount) {
            return;
        }
        if (this.f209354i) {
            for (int i3 = 0; i3 < this.f209353h.getChildCount(); i3++) {
                TextView textView = (TextView) this.f209353h.getChildAt(i3).findViewById(this.f209350e);
                if (i3 == i) {
                    textView.setTextColor(yd5.m214214a(this.f209346a, this.f209347b, 1.0f - f));
                } else if (i3 == i + 1) {
                    textView.setTextColor(yd5.m214214a(this.f209346a, this.f209347b, f));
                } else {
                    textView.setTextColor(this.f209347b);
                }
            }
        }
        View childAt = this.f209353h.getChildAt(i);
        if (childAt != null) {
            int left = childAt.getLeft() + i2;
            if (i > 0 || i2 > 0) {
                left -= this.f209348c;
            }
            scrollTo(left, 0);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewPager viewPager = this.f209351f;
        if (viewPager != null) {
            m223220k(viewPager.getCurrentItem(), 0.0f, 0);
        }
    }

    public void setCustomTabColorizer(InterfaceC22573c interfaceC22573c) {
        this.f209353h.setCustomTabColorizer(interfaceC22573c);
    }

    public void setDividerColors(int... iArr) {
        this.f209353h.setDividerColors(iArr);
    }

    public void setOnPageChangeListener(ViewPager.InterfaceC0716j interfaceC0716j) {
        this.f209352g = interfaceC0716j;
    }

    public void setSelectedIndicatorColors(int... iArr) {
        this.f209353h.setSelectedIndicatorColors(iArr);
    }

    public void setViewPager(ViewPager viewPager) {
        this.f209353h.removeAllViews();
        this.f209351f = viewPager;
        if (viewPager != null) {
            viewPager.setOnPageChangeListener(new C22571a());
            m223219j();
        }
    }

    public VSlidingTabs(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public VSlidingTabs(Context context) {
        this(context, null);
    }
}
