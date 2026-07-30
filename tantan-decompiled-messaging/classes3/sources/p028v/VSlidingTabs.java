package p028v;

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
import l.w660;
import l.yd5;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class VSlidingTabs extends VScroll_Horizontal {

    /* JADX INFO: renamed from: a */
    public int f12971a;

    /* JADX INFO: renamed from: b */
    public int f12972b;

    /* JADX INFO: renamed from: c */
    public int f12973c;

    /* JADX INFO: renamed from: d */
    public int f12974d;

    /* JADX INFO: renamed from: e */
    public int f12975e;

    /* JADX INFO: renamed from: f */
    public ViewPager f12976f;

    /* JADX INFO: renamed from: g */
    public ViewPager.j f12977g;

    /* JADX INFO: renamed from: h */
    public final VSlidingTabStrip f12978h;

    /* JADX INFO: renamed from: i */
    public boolean f12979i;

    /* JADX INFO: renamed from: j */
    public boolean f12980j;

    /* JADX INFO: renamed from: v.VSlidingTabs$a */
    public class C1364a implements ViewPager.j {

        /* JADX INFO: renamed from: a */
        public int f12981a;

        public C1364a() {
        }

        public void onPageScrollStateChanged(int i) {
            this.f12981a = i;
            if (VSlidingTabs.this.f12977g != null) {
                VSlidingTabs.this.f12977g.onPageScrollStateChanged(i);
            }
        }

        public void onPageScrolled(int i, float f, int i2) {
            int childCount = VSlidingTabs.this.f12978h.getChildCount();
            if (childCount == 0 || i < 0 || i >= childCount) {
                return;
            }
            VSlidingTabs.this.f12978h.m11692a(i, f);
            View childAt = VSlidingTabs.this.f12978h.getChildAt(i);
            VSlidingTabs.this.m11706k(i, f, childAt != null ? (int) (childAt.getWidth() * f) : 0);
            if (VSlidingTabs.this.f12977g != null) {
                VSlidingTabs.this.f12977g.onPageScrolled(i, f, i2);
            }
        }

        public void onPageSelected(int i) {
            if (this.f12981a == 0) {
                VSlidingTabs.this.f12978h.m11692a(i, 0.0f);
                VSlidingTabs.this.m11706k(i, 0.0f, 0);
            }
            if (VSlidingTabs.this.f12980j) {
                for (int i2 = 0; i2 < VSlidingTabs.this.f12978h.getChildCount(); i2++) {
                    TextView textView = (TextView) VSlidingTabs.this.f12978h.getChildAt(i2).findViewById(VSlidingTabs.this.f12975e);
                    VSlidingTabs vSlidingTabs = VSlidingTabs.this;
                    if (i2 == i) {
                        textView.setTextColor(vSlidingTabs.f12971a);
                    } else {
                        textView.setTextColor(vSlidingTabs.f12972b);
                    }
                }
            }
            if (VSlidingTabs.this.f12977g != null) {
                VSlidingTabs.this.f12977g.onPageSelected(i);
            }
        }
    }

    /* JADX INFO: renamed from: v.VSlidingTabs$b */
    public class ViewOnClickListenerC1365b implements View.OnClickListener {
        public ViewOnClickListenerC1365b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            for (int i = 0; i < VSlidingTabs.this.f12978h.getChildCount(); i++) {
                if (view == VSlidingTabs.this.f12978h.getChildAt(i)) {
                    VSlidingTabs.this.f12976f.setCurrentItem(i);
                    return;
                }
            }
        }
    }

    /* JADX INFO: renamed from: v.VSlidingTabs$c */
    public interface InterfaceC1366c {
        /* JADX INFO: renamed from: a */
        int mo11693a(int i);

        /* JADX INFO: renamed from: b */
        int mo11694b(int i);
    }

    public VSlidingTabs(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f12979i = false;
        this.f12980j = false;
        setHorizontalScrollBarEnabled(false);
        setFillViewport(true);
        this.f12973c = (int) (getResources().getDisplayMetrics().density * 24.0f);
        VSlidingTabStrip vSlidingTabStrip = new VSlidingTabStrip(context);
        this.f12978h = vSlidingTabStrip;
        addView(vSlidingTabStrip, -1, -2);
    }

    public VSlidingTabStrip getTabStrip() {
        return this.f12978h;
    }

    /* JADX INFO: renamed from: i */
    public TextView m11704i(Context context) {
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
    public final void m11705j() {
        View viewM11704i;
        TextView textView;
        w660 adapter = this.f12976f.getAdapter();
        ViewOnClickListenerC1365b viewOnClickListenerC1365b = new ViewOnClickListenerC1365b();
        int i = 0;
        while (i < adapter.getCount()) {
            if (this.f12974d != 0) {
                viewM11704i = LayoutInflater.from(getContext()).inflate(this.f12974d, (ViewGroup) this.f12978h, false);
                textView = (TextView) viewM11704i.findViewById(this.f12975e);
            } else {
                viewM11704i = null;
                textView = null;
            }
            if (viewM11704i == null) {
                viewM11704i = m11704i(getContext());
            }
            if (textView == null && TextView.class.isInstance(viewM11704i)) {
                textView = (TextView) viewM11704i;
            }
            textView.setTextColor(i == this.f12976f.getCurrentItem() ? this.f12971a : this.f12972b);
            textView.setText(adapter.getPageTitle(i));
            viewM11704i.setOnClickListener(viewOnClickListenerC1365b);
            this.f12978h.addView(viewM11704i);
            i++;
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m11706k(int i, float f, int i2) {
        int childCount = this.f12978h.getChildCount();
        if (childCount == 0 || i < 0 || i >= childCount) {
            return;
        }
        if (this.f12979i) {
            for (int i3 = 0; i3 < this.f12978h.getChildCount(); i3++) {
                TextView textView = (TextView) this.f12978h.getChildAt(i3).findViewById(this.f12975e);
                if (i3 == i) {
                    textView.setTextColor(yd5.a(this.f12971a, this.f12972b, 1.0f - f));
                } else if (i3 == i + 1) {
                    textView.setTextColor(yd5.a(this.f12971a, this.f12972b, f));
                } else {
                    textView.setTextColor(this.f12972b);
                }
            }
        }
        View childAt = this.f12978h.getChildAt(i);
        if (childAt != null) {
            int left = childAt.getLeft() + i2;
            if (i > 0 || i2 > 0) {
                left -= this.f12973c;
            }
            scrollTo(left, 0);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewPager viewPager = this.f12976f;
        if (viewPager != null) {
            m11706k(viewPager.getCurrentItem(), 0.0f, 0);
        }
    }

    public void setCustomTabColorizer(InterfaceC1366c interfaceC1366c) {
        this.f12978h.setCustomTabColorizer(interfaceC1366c);
    }

    public void setDividerColors(int... iArr) {
        this.f12978h.setDividerColors(iArr);
    }

    public void setOnPageChangeListener(ViewPager.j jVar) {
        this.f12977g = jVar;
    }

    public void setSelectedIndicatorColors(int... iArr) {
        this.f12978h.setSelectedIndicatorColors(iArr);
    }

    public void setViewPager(ViewPager viewPager) {
        this.f12978h.removeAllViews();
        this.f12976f = viewPager;
        if (viewPager != null) {
            viewPager.setOnPageChangeListener(new C1364a());
            m11705j();
        }
    }

    public VSlidingTabs(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public VSlidingTabs(Context context) {
        this(context, null);
    }
}
