package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.annotation.RestrictTo;
import androidx.appcompat.R$string;
import com.google.android.gms.common.api.Api;
import p153l.C15967bc;
import p153l.a8f0;
import p153l.fig0;
import p153l.gic0;
import p153l.kfc0;
import p153l.s40;
import p153l.t0j0;
import p153l.t30;
import p153l.wac0;
import p153l.xdc0;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class ActivityChooserView extends ViewGroup {

    /* JADX INFO: renamed from: a */
    public final C0120f f583a;

    /* JADX INFO: renamed from: b */
    public final ViewOnClickListenerC0121g f584b;

    /* JADX INFO: renamed from: c */
    public final View f585c;

    /* JADX INFO: renamed from: d */
    public final Drawable f586d;

    /* JADX INFO: renamed from: e */
    public final FrameLayout f587e;

    /* JADX INFO: renamed from: f */
    public final ImageView f588f;

    /* JADX INFO: renamed from: g */
    public final FrameLayout f589g;

    /* JADX INFO: renamed from: h */
    public final ImageView f590h;

    /* JADX INFO: renamed from: i */
    public final int f591i;

    /* JADX INFO: renamed from: j */
    public t30 f592j;

    /* JADX INFO: renamed from: k */
    public final DataSetObserver f593k;

    /* JADX INFO: renamed from: l */
    public final ViewTreeObserver.OnGlobalLayoutListener f594l;

    /* JADX INFO: renamed from: m */
    public C0164b f595m;

    /* JADX INFO: renamed from: n */
    public PopupWindow.OnDismissListener f596n;

    /* JADX INFO: renamed from: o */
    public boolean f597o;

    /* JADX INFO: renamed from: p */
    public int f598p;

    /* JADX INFO: renamed from: q */
    public boolean f599q;

    /* JADX INFO: renamed from: r */
    public int f600r;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static class InnerLayout extends LinearLayout {

        /* JADX INFO: renamed from: a */
        public static final int[] f601a = {R.attr.background};

        public InnerLayout(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            t0j0 t0j0VarM188781t = t0j0.m188781t(context, attributeSet, f601a);
            setBackgroundDrawable(t0j0VarM188781t.m188789g(0));
            t0j0VarM188781t.m188801v();
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.ActivityChooserView$a */
    public class C0115a extends DataSetObserver {
        public C0115a() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            super.onChanged();
            ActivityChooserView.this.f583a.notifyDataSetChanged();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            super.onInvalidated();
            ActivityChooserView.this.f583a.notifyDataSetInvalidated();
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.ActivityChooserView$b */
    public class ViewTreeObserverOnGlobalLayoutListenerC0116b implements ViewTreeObserver.OnGlobalLayoutListener {
        public ViewTreeObserverOnGlobalLayoutListenerC0116b() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (ActivityChooserView.this.m530b()) {
                boolean zIsShown = ActivityChooserView.this.isShown();
                ActivityChooserView activityChooserView = ActivityChooserView.this;
                if (!zIsShown) {
                    activityChooserView.getListPopupWindow().dismiss();
                    return;
                }
                activityChooserView.getListPopupWindow().show();
                t30 t30Var = ActivityChooserView.this.f592j;
                if (t30Var != null) {
                    t30Var.m189012k(true);
                }
            }
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.ActivityChooserView$c */
    public class C0117c extends View.AccessibilityDelegate {
        public C0117c() {
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            C15967bc.m103355T0(accessibilityNodeInfo).m103425l0(true);
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.ActivityChooserView$d */
    public class C0118d extends AbstractViewOnTouchListenerC0163a {
        public C0118d(View view) {
            super(view);
        }

        @Override // androidx.appcompat.widget.AbstractViewOnTouchListenerC0163a
        /* JADX INFO: renamed from: b */
        public a8f0 mo373b() {
            return ActivityChooserView.this.getListPopupWindow();
        }

        @Override // androidx.appcompat.widget.AbstractViewOnTouchListenerC0163a
        /* JADX INFO: renamed from: c */
        public boolean mo374c() {
            ActivityChooserView.this.m531c();
            return true;
        }

        @Override // androidx.appcompat.widget.AbstractViewOnTouchListenerC0163a
        /* JADX INFO: renamed from: d */
        public boolean mo511d() {
            ActivityChooserView.this.m529a();
            return true;
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.ActivityChooserView$e */
    public class C0119e extends DataSetObserver {
        public C0119e() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            super.onChanged();
            ActivityChooserView.this.m533e();
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.ActivityChooserView$f */
    public class C0120f extends BaseAdapter {

        /* JADX INFO: renamed from: a */
        public int f607a = 4;

        /* JADX INFO: renamed from: b */
        public boolean f608b;

        /* JADX INFO: renamed from: c */
        public boolean f609c;

        /* JADX INFO: renamed from: d */
        public boolean f610d;

        public C0120f() {
        }

        /* JADX INFO: renamed from: a */
        public int m534a() {
            throw null;
        }

        /* JADX INFO: renamed from: b */
        public s40 m535b() {
            return null;
        }

        /* JADX INFO: renamed from: c */
        public ResolveInfo m536c() {
            throw null;
        }

        /* JADX INFO: renamed from: d */
        public int m537d() {
            throw null;
        }

        /* JADX INFO: renamed from: e */
        public boolean m538e() {
            return this.f608b;
        }

        /* JADX INFO: renamed from: f */
        public void m539f(s40 s40Var) {
            ActivityChooserView.this.f583a.m535b();
            notifyDataSetChanged();
        }

        @Override // android.widget.Adapter
        public int getCount() {
            throw null;
        }

        @Override // android.widget.Adapter
        public Object getItem(int i) {
            int itemViewType = getItemViewType(i);
            if (itemViewType == 0) {
                if (this.f608b) {
                    throw null;
                }
                throw null;
            }
            if (itemViewType == 1) {
                return null;
            }
            fig0.m125680a();
            return null;
        }

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            return i;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public int getItemViewType(int i) {
            return (this.f610d && i == getCount() - 1) ? 1 : 0;
        }

        @Override // android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            int itemViewType = getItemViewType(i);
            if (itemViewType != 0) {
                if (itemViewType != 1) {
                    fig0.m125680a();
                    return null;
                }
                if (view != null && view.getId() == 1) {
                    return view;
                }
                View viewInflate = LayoutInflater.from(ActivityChooserView.this.getContext()).inflate(kfc0.f126270f, viewGroup, false);
                viewInflate.setId(1);
                ((TextView) viewInflate.findViewById(xdc0.f193552S)).setText(ActivityChooserView.this.getContext().getString(R$string.f102b));
                return viewInflate;
            }
            if (view == null || view.getId() != xdc0.f193579x) {
                view = LayoutInflater.from(ActivityChooserView.this.getContext()).inflate(kfc0.f126270f, viewGroup, false);
            }
            PackageManager packageManager = ActivityChooserView.this.getContext().getPackageManager();
            ImageView imageView = (ImageView) view.findViewById(xdc0.f193577v);
            ResolveInfo resolveInfo = (ResolveInfo) getItem(i);
            imageView.setImageDrawable(resolveInfo.loadIcon(packageManager));
            ((TextView) view.findViewById(xdc0.f193552S)).setText(resolveInfo.loadLabel(packageManager));
            if (this.f608b && i == 0 && this.f609c) {
                view.setActivated(true);
                return view;
            }
            view.setActivated(false);
            return view;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public int getViewTypeCount() {
            return 3;
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.ActivityChooserView$g */
    public class ViewOnClickListenerC0121g implements AdapterView.OnItemClickListener, View.OnClickListener, View.OnLongClickListener, PopupWindow.OnDismissListener {
        public ViewOnClickListenerC0121g() {
        }

        /* JADX INFO: renamed from: a */
        public final void m540a() {
            PopupWindow.OnDismissListener onDismissListener = ActivityChooserView.this.f596n;
            if (onDismissListener != null) {
                onDismissListener.onDismiss();
            }
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ActivityChooserView activityChooserView = ActivityChooserView.this;
            if (view == activityChooserView.f589g) {
                activityChooserView.m529a();
                ActivityChooserView.this.f583a.m536c();
                ActivityChooserView.this.f583a.m535b();
                throw null;
            }
            if (view != activityChooserView.f587e) {
                fig0.m125680a();
            } else {
                activityChooserView.f597o = false;
                activityChooserView.m532d(activityChooserView.f598p);
            }
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            m540a();
            t30 t30Var = ActivityChooserView.this.f592j;
            if (t30Var != null) {
                t30Var.m189012k(false);
            }
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            int itemViewType = ((C0120f) adapterView.getAdapter()).getItemViewType(i);
            if (itemViewType != 0) {
                if (itemViewType == 1) {
                    ActivityChooserView.this.m532d(Api.BaseClientBuilder.API_PRIORITY_OTHER);
                    return;
                } else {
                    fig0.m125680a();
                    return;
                }
            }
            ActivityChooserView.this.m529a();
            ActivityChooserView activityChooserView = ActivityChooserView.this;
            if (!activityChooserView.f597o) {
                activityChooserView.f583a.m538e();
                ActivityChooserView.this.f583a.m535b();
                throw null;
            }
            if (i <= 0) {
                return;
            }
            activityChooserView.f583a.m535b();
            throw null;
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            ActivityChooserView activityChooserView = ActivityChooserView.this;
            if (view != activityChooserView.f589g) {
                fig0.m125680a();
                return false;
            }
            if (activityChooserView.f583a.getCount() > 0) {
                ActivityChooserView activityChooserView2 = ActivityChooserView.this;
                activityChooserView2.f597o = true;
                activityChooserView2.m532d(activityChooserView2.f598p);
            }
            return true;
        }
    }

    public ActivityChooserView(Context context, AttributeSet attributeSet, int i) {
        ActivityChooserView activityChooserView;
        Context context2;
        super(context, attributeSet, i);
        this.f593k = new C0115a();
        this.f594l = new ViewTreeObserverOnGlobalLayoutListenerC0116b();
        this.f598p = 4;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, gic0.f104234D, i, 0);
        if (Build.VERSION.SDK_INT >= 29) {
            activityChooserView = this;
            context2 = context;
            activityChooserView.saveAttributeDataForStyleable(context2, gic0.f104234D, attributeSet, typedArrayObtainStyledAttributes, i, 0);
        } else {
            activityChooserView = this;
            context2 = context;
        }
        activityChooserView.f598p = typedArrayObtainStyledAttributes.getInt(gic0.f104244F, 4);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(gic0.f104239E);
        typedArrayObtainStyledAttributes.recycle();
        LayoutInflater.from(activityChooserView.getContext()).inflate(kfc0.f126269e, (ViewGroup) activityChooserView, true);
        ViewOnClickListenerC0121g viewOnClickListenerC0121g = activityChooserView.new ViewOnClickListenerC0121g();
        activityChooserView.f584b = viewOnClickListenerC0121g;
        View viewFindViewById = activityChooserView.findViewById(xdc0.f193565j);
        activityChooserView.f585c = viewFindViewById;
        activityChooserView.f586d = viewFindViewById.getBackground();
        FrameLayout frameLayout = (FrameLayout) activityChooserView.findViewById(xdc0.f193573r);
        activityChooserView.f589g = frameLayout;
        frameLayout.setOnClickListener(viewOnClickListenerC0121g);
        frameLayout.setOnLongClickListener(viewOnClickListenerC0121g);
        activityChooserView.f590h = (ImageView) frameLayout.findViewById(xdc0.f193578w);
        FrameLayout frameLayout2 = (FrameLayout) activityChooserView.findViewById(xdc0.f193575t);
        frameLayout2.setOnClickListener(viewOnClickListenerC0121g);
        frameLayout2.setAccessibilityDelegate(activityChooserView.new C0117c());
        frameLayout2.setOnTouchListener(activityChooserView.new C0118d(frameLayout2));
        activityChooserView.f587e = frameLayout2;
        ImageView imageView = (ImageView) frameLayout2.findViewById(xdc0.f193578w);
        activityChooserView.f588f = imageView;
        imageView.setImageDrawable(drawable);
        C0120f c0120f = activityChooserView.new C0120f();
        activityChooserView.f583a = c0120f;
        c0120f.registerDataSetObserver(activityChooserView.new C0119e());
        Resources resources = context2.getResources();
        activityChooserView.f591i = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(wac0.f188107d));
    }

    /* JADX INFO: renamed from: a */
    public boolean m529a() {
        if (!m530b()) {
            return true;
        }
        getListPopupWindow().dismiss();
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (!viewTreeObserver.isAlive()) {
            return true;
        }
        viewTreeObserver.removeGlobalOnLayoutListener(this.f594l);
        return true;
    }

    /* JADX INFO: renamed from: b */
    public boolean m530b() {
        return getListPopupWindow().isShowing();
    }

    /* JADX INFO: renamed from: c */
    public boolean m531c() {
        if (m530b() || !this.f599q) {
            return false;
        }
        this.f597o = false;
        m532d(this.f598p);
        return true;
    }

    /* JADX INFO: renamed from: d */
    public void m532d(int i) {
        this.f583a.m535b();
        throw new IllegalStateException("No data model. Did you call #setDataModel?");
    }

    /* JADX INFO: renamed from: e */
    public void m533e() {
        int count = this.f583a.getCount();
        FrameLayout frameLayout = this.f587e;
        if (count > 0) {
            frameLayout.setEnabled(true);
        } else {
            frameLayout.setEnabled(false);
        }
        int iM534a = this.f583a.m534a();
        int iM537d = this.f583a.m537d();
        if (iM534a == 1 || (iM534a > 1 && iM537d > 0)) {
            this.f589g.setVisibility(0);
            ResolveInfo resolveInfoM536c = this.f583a.m536c();
            PackageManager packageManager = getContext().getPackageManager();
            this.f590h.setImageDrawable(resolveInfoM536c.loadIcon(packageManager));
            if (this.f600r != 0) {
                this.f589g.setContentDescription(getContext().getString(this.f600r, resolveInfoM536c.loadLabel(packageManager)));
            }
        } else {
            this.f589g.setVisibility(8);
        }
        int visibility = this.f589g.getVisibility();
        View view = this.f585c;
        if (visibility == 0) {
            view.setBackgroundDrawable(this.f586d);
        } else {
            view.setBackgroundDrawable(null);
        }
    }

    public s40 getDataModel() {
        this.f583a.m535b();
        return null;
    }

    public C0164b getListPopupWindow() {
        if (this.f595m == null) {
            C0164b c0164b = new C0164b(getContext());
            this.f595m = c0164b;
            c0164b.mo555l(this.f583a);
            this.f595m.m639v(this);
            this.f595m.m619B(true);
            this.f595m.m621D(this.f584b);
            this.f595m.m620C(this.f584b);
        }
        return this.f595m;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f583a.m535b();
        this.f599q = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f583a.m535b();
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.f594l);
        }
        if (m530b()) {
            m529a();
        }
        this.f599q = false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.f585c.layout(0, 0, i3 - i, i4 - i2);
        if (m530b()) {
            return;
        }
        m529a();
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        View view = this.f585c;
        if (this.f589g.getVisibility() != 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2), 1073741824);
        }
        measureChild(view, i, i2);
        setMeasuredDimension(view.getMeasuredWidth(), view.getMeasuredHeight());
    }

    public void setActivityChooserModel(s40 s40Var) {
        this.f583a.m539f(s40Var);
        if (m530b()) {
            m529a();
            m531c();
        }
    }

    public void setDefaultActionButtonContentDescription(int i) {
        this.f600r = i;
    }

    public void setExpandActivityOverflowButtonContentDescription(int i) {
        this.f588f.setContentDescription(getContext().getString(i));
    }

    public void setExpandActivityOverflowButtonDrawable(Drawable drawable) {
        this.f588f.setImageDrawable(drawable);
    }

    public void setInitialActivityCount(int i) {
        this.f598p = i;
    }

    public void setOnDismissListener(PopupWindow.OnDismissListener onDismissListener) {
        this.f596n = onDismissListener;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setProvider(t30 t30Var) {
        this.f592j = t30Var;
    }

    public ActivityChooserView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ActivityChooserView(Context context) {
        this(context, null);
    }
}
