package p151v;

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
import p153l.cf60;
import p153l.ye5;

/* JADX INFO: loaded from: classes3.dex */
public class VSlidingTabs extends VScroll_Horizontal {

    /* JADX INFO: renamed from: a */
    public int f210268a;

    /* JADX INFO: renamed from: b */
    public int f210269b;

    /* JADX INFO: renamed from: c */
    public int f210270c;

    /* JADX INFO: renamed from: d */
    public int f210271d;

    /* JADX INFO: renamed from: e */
    public int f210272e;

    /* JADX INFO: renamed from: f */
    public ViewPager f210273f;

    /* JADX INFO: renamed from: g */
    public ViewPager.InterfaceC0718j f210274g;

    /* JADX INFO: renamed from: h */
    public final VSlidingTabStrip f210275h;

    /* JADX INFO: renamed from: i */
    public boolean f210276i;

    /* JADX INFO: renamed from: j */
    public boolean f210277j;

    /* JADX INFO: renamed from: v.VSlidingTabs$a */
    public class C22686a implements ViewPager.InterfaceC0718j {

        /* JADX INFO: renamed from: a */
        public int f210278a;

        public C22686a() {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0718j
        public void onPageScrollStateChanged(int i) {
            this.f210278a = i;
            if (VSlidingTabs.this.f210274g != null) {
                VSlidingTabs.this.f210274g.onPageScrollStateChanged(i);
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0718j
        public void onPageScrolled(int i, float f, int i2) {
            int childCount = VSlidingTabs.this.f210275h.getChildCount();
            if (childCount == 0 || i < 0 || i >= childCount) {
                return;
            }
            VSlidingTabs.this.f210275h.m224452a(i, f);
            View childAt = VSlidingTabs.this.f210275h.getChildAt(i);
            VSlidingTabs.this.m224466k(i, f, childAt != null ? (int) (childAt.getWidth() * f) : 0);
            if (VSlidingTabs.this.f210274g != null) {
                VSlidingTabs.this.f210274g.onPageScrolled(i, f, i2);
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0718j
        public void onPageSelected(int i) {
            if (this.f210278a == 0) {
                VSlidingTabs.this.f210275h.m224452a(i, 0.0f);
                VSlidingTabs.this.m224466k(i, 0.0f, 0);
            }
            if (VSlidingTabs.this.f210277j) {
                for (int i2 = 0; i2 < VSlidingTabs.this.f210275h.getChildCount(); i2++) {
                    TextView textView = (TextView) VSlidingTabs.this.f210275h.getChildAt(i2).findViewById(VSlidingTabs.this.f210272e);
                    VSlidingTabs vSlidingTabs = VSlidingTabs.this;
                    if (i2 == i) {
                        textView.setTextColor(vSlidingTabs.f210268a);
                    } else {
                        textView.setTextColor(vSlidingTabs.f210269b);
                    }
                }
            }
            if (VSlidingTabs.this.f210274g != null) {
                VSlidingTabs.this.f210274g.onPageSelected(i);
            }
        }
    }

    /* JADX INFO: renamed from: v.VSlidingTabs$b */
    public class ViewOnClickListenerC22687b implements View.OnClickListener {
        public ViewOnClickListenerC22687b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            for (int i = 0; i < VSlidingTabs.this.f210275h.getChildCount(); i++) {
                if (view == VSlidingTabs.this.f210275h.getChildAt(i)) {
                    VSlidingTabs.this.f210273f.setCurrentItem(i);
                    return;
                }
            }
        }
    }

    /* JADX INFO: renamed from: v.VSlidingTabs$c */
    public interface InterfaceC22688c {
        /* JADX INFO: renamed from: a */
        int mo224453a(int i);

        /* JADX INFO: renamed from: b */
        int mo224454b(int i);
    }

    public VSlidingTabs(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f210276i = false;
        this.f210277j = false;
        setHorizontalScrollBarEnabled(false);
        setFillViewport(true);
        this.f210270c = (int) (getResources().getDisplayMetrics().density * 24.0f);
        VSlidingTabStrip vSlidingTabStrip = new VSlidingTabStrip(context);
        this.f210275h = vSlidingTabStrip;
        addView(vSlidingTabStrip, -1, -2);
    }

    public VSlidingTabStrip getTabStrip() {
        return this.f210275h;
    }

    /* JADX INFO: renamed from: i */
    public TextView m224464i(Context context) {
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
    public final void m224465j() {
        View viewM224464i;
        TextView textView;
        cf60 adapter = this.f210273f.getAdapter();
        ViewOnClickListenerC22687b viewOnClickListenerC22687b = new ViewOnClickListenerC22687b();
        int i = 0;
        while (i < adapter.getCount()) {
            if (this.f210271d != 0) {
                viewM224464i = LayoutInflater.from(getContext()).inflate(this.f210271d, (ViewGroup) this.f210275h, false);
                textView = (TextView) viewM224464i.findViewById(this.f210272e);
            } else {
                viewM224464i = null;
                textView = null;
            }
            if (viewM224464i == null) {
                viewM224464i = m224464i(getContext());
            }
            if (textView == null && TextView.class.isInstance(viewM224464i)) {
                textView = (TextView) viewM224464i;
            }
            textView.setTextColor(i == this.f210273f.getCurrentItem() ? this.f210268a : this.f210269b);
            textView.setText(adapter.getPageTitle(i));
            viewM224464i.setOnClickListener(viewOnClickListenerC22687b);
            this.f210275h.addView(viewM224464i);
            i++;
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m224466k(int i, float f, int i2) {
        int childCount = this.f210275h.getChildCount();
        if (childCount == 0 || i < 0 || i >= childCount) {
            return;
        }
        if (this.f210276i) {
            for (int i3 = 0; i3 < this.f210275h.getChildCount(); i3++) {
                TextView textView = (TextView) this.f210275h.getChildAt(i3).findViewById(this.f210272e);
                if (i3 == i) {
                    textView.setTextColor(ye5.m215395a(this.f210268a, this.f210269b, 1.0f - f));
                } else if (i3 == i + 1) {
                    textView.setTextColor(ye5.m215395a(this.f210268a, this.f210269b, f));
                } else {
                    textView.setTextColor(this.f210269b);
                }
            }
        }
        View childAt = this.f210275h.getChildAt(i);
        if (childAt != null) {
            int left = childAt.getLeft() + i2;
            if (i > 0 || i2 > 0) {
                left -= this.f210270c;
            }
            scrollTo(left, 0);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewPager viewPager = this.f210273f;
        if (viewPager != null) {
            m224466k(viewPager.getCurrentItem(), 0.0f, 0);
        }
    }

    public void setCustomTabColorizer(InterfaceC22688c interfaceC22688c) {
        this.f210275h.setCustomTabColorizer(interfaceC22688c);
    }

    public void setDividerColors(int... iArr) {
        this.f210275h.setDividerColors(iArr);
    }

    public void setOnPageChangeListener(ViewPager.InterfaceC0718j interfaceC0718j) {
        this.f210274g = interfaceC0718j;
    }

    public void setSelectedIndicatorColors(int... iArr) {
        this.f210275h.setSelectedIndicatorColors(iArr);
    }

    public void setViewPager(ViewPager viewPager) {
        this.f210275h.removeAllViews();
        this.f210273f = viewPager;
        if (viewPager != null) {
            viewPager.setOnPageChangeListener(new C22686a());
            m224465j();
        }
    }

    public VSlidingTabs(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public VSlidingTabs(Context context) {
        this(context, null);
    }
}
