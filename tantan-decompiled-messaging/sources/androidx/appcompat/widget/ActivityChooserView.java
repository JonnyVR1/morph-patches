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
import p149l.C17055gc;
import p149l.aac0;
import p149l.g7c0;
import p149l.p2c0;
import p149l.qri0;
import p149l.s5c0;
import p149l.tze0;
import p149l.x9g0;
import p149l.y40;
import p149l.z30;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class ActivityChooserView extends ViewGroup {

    /* JADX INFO: renamed from: a */
    public final C0119f f583a;

    /* JADX INFO: renamed from: b */
    public final ViewOnClickListenerC0120g f584b;

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
    public z30 f592j;

    /* JADX INFO: renamed from: k */
    public final DataSetObserver f593k;

    /* JADX INFO: renamed from: l */
    public final ViewTreeObserver.OnGlobalLayoutListener f594l;

    /* JADX INFO: renamed from: m */
    public C0163b f595m;

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
            qri0 qri0VarM175992t = qri0.m175992t(context, attributeSet, f601a);
            setBackgroundDrawable(qri0VarM175992t.m176000g(0));
            qri0VarM175992t.m176012v();
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.ActivityChooserView$a */
    public class C0114a extends DataSetObserver {
        public C0114a() {
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
    public class ViewTreeObserverOnGlobalLayoutListenerC0115b implements ViewTreeObserver.OnGlobalLayoutListener {
        public ViewTreeObserverOnGlobalLayoutListenerC0115b() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (ActivityChooserView.this.m529b()) {
                boolean zIsShown = ActivityChooserView.this.isShown();
                ActivityChooserView activityChooserView = ActivityChooserView.this;
                if (!zIsShown) {
                    activityChooserView.getListPopupWindow().dismiss();
                    return;
                }
                activityChooserView.getListPopupWindow().show();
                z30 z30Var = ActivityChooserView.this.f592j;
                if (z30Var != null) {
                    z30Var.m217005k(true);
                }
            }
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.ActivityChooserView$c */
    public class C0116c extends View.AccessibilityDelegate {
        public C0116c() {
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            C17055gc.m125351T0(accessibilityNodeInfo).m125421l0(true);
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.ActivityChooserView$d */
    public class C0117d extends AbstractViewOnTouchListenerC0162a {
        public C0117d(View view) {
            super(view);
        }

        @Override // androidx.appcompat.widget.AbstractViewOnTouchListenerC0162a
        /* JADX INFO: renamed from: b */
        public tze0 mo372b() {
            return ActivityChooserView.this.getListPopupWindow();
        }

        @Override // androidx.appcompat.widget.AbstractViewOnTouchListenerC0162a
        /* JADX INFO: renamed from: c */
        public boolean mo373c() {
            ActivityChooserView.this.m530c();
            return true;
        }

        @Override // androidx.appcompat.widget.AbstractViewOnTouchListenerC0162a
        /* JADX INFO: renamed from: d */
        public boolean mo510d() {
            ActivityChooserView.this.m528a();
            return true;
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.ActivityChooserView$e */
    public class C0118e extends DataSetObserver {
        public C0118e() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            super.onChanged();
            ActivityChooserView.this.m532e();
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.ActivityChooserView$f */
    public class C0119f extends BaseAdapter {

        /* JADX INFO: renamed from: a */
        public int f607a = 4;

        /* JADX INFO: renamed from: b */
        public boolean f608b;

        /* JADX INFO: renamed from: c */
        public boolean f609c;

        /* JADX INFO: renamed from: d */
        public boolean f610d;

        public C0119f() {
        }

        /* JADX INFO: renamed from: a */
        public int m533a() {
            throw null;
        }

        /* JADX INFO: renamed from: b */
        public y40 m534b() {
            return null;
        }

        /* JADX INFO: renamed from: c */
        public ResolveInfo m535c() {
            throw null;
        }

        /* JADX INFO: renamed from: d */
        public int m536d() {
            throw null;
        }

        /* JADX INFO: renamed from: e */
        public boolean m537e() {
            return this.f608b;
        }

        /* JADX INFO: renamed from: f */
        public void m538f(y40 y40Var) {
            ActivityChooserView.this.f583a.m534b();
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
            x9g0.m207497a();
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
                    x9g0.m207497a();
                    return null;
                }
                if (view != null && view.getId() == 1) {
                    return view;
                }
                View viewInflate = LayoutInflater.from(ActivityChooserView.this.getContext()).inflate(g7c0.f101358f, viewGroup, false);
                viewInflate.setId(1);
                ((TextView) viewInflate.findViewById(s5c0.f162513S)).setText(ActivityChooserView.this.getContext().getString(R$string.f102b));
                return viewInflate;
            }
            if (view == null || view.getId() != s5c0.f162540x) {
                view = LayoutInflater.from(ActivityChooserView.this.getContext()).inflate(g7c0.f101358f, viewGroup, false);
            }
            PackageManager packageManager = ActivityChooserView.this.getContext().getPackageManager();
            ImageView imageView = (ImageView) view.findViewById(s5c0.f162538v);
            ResolveInfo resolveInfo = (ResolveInfo) getItem(i);
            imageView.setImageDrawable(resolveInfo.loadIcon(packageManager));
            ((TextView) view.findViewById(s5c0.f162513S)).setText(resolveInfo.loadLabel(packageManager));
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
    public class ViewOnClickListenerC0120g implements AdapterView.OnItemClickListener, View.OnClickListener, View.OnLongClickListener, PopupWindow.OnDismissListener {
        public ViewOnClickListenerC0120g() {
        }

        /* JADX INFO: renamed from: a */
        public final void m539a() {
            PopupWindow.OnDismissListener onDismissListener = ActivityChooserView.this.f596n;
            if (onDismissListener != null) {
                onDismissListener.onDismiss();
            }
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ActivityChooserView activityChooserView = ActivityChooserView.this;
            if (view == activityChooserView.f589g) {
                activityChooserView.m528a();
                ActivityChooserView.this.f583a.m535c();
                ActivityChooserView.this.f583a.m534b();
                throw null;
            }
            if (view != activityChooserView.f587e) {
                x9g0.m207497a();
            } else {
                activityChooserView.f597o = false;
                activityChooserView.m531d(activityChooserView.f598p);
            }
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            m539a();
            z30 z30Var = ActivityChooserView.this.f592j;
            if (z30Var != null) {
                z30Var.m217005k(false);
            }
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            int itemViewType = ((C0119f) adapterView.getAdapter()).getItemViewType(i);
            if (itemViewType != 0) {
                if (itemViewType == 1) {
                    ActivityChooserView.this.m531d(Api.BaseClientBuilder.API_PRIORITY_OTHER);
                    return;
                } else {
                    x9g0.m207497a();
                    return;
                }
            }
            ActivityChooserView.this.m528a();
            ActivityChooserView activityChooserView = ActivityChooserView.this;
            if (!activityChooserView.f597o) {
                activityChooserView.f583a.m537e();
                ActivityChooserView.this.f583a.m534b();
                throw null;
            }
            if (i <= 0) {
                return;
            }
            activityChooserView.f583a.m534b();
            throw null;
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            ActivityChooserView activityChooserView = ActivityChooserView.this;
            if (view != activityChooserView.f589g) {
                x9g0.m207497a();
                return false;
            }
            if (activityChooserView.f583a.getCount() > 0) {
                ActivityChooserView activityChooserView2 = ActivityChooserView.this;
                activityChooserView2.f597o = true;
                activityChooserView2.m531d(activityChooserView2.f598p);
            }
            return true;
        }
    }

    public ActivityChooserView(Context context, AttributeSet attributeSet, int i) {
        ActivityChooserView activityChooserView;
        Context context2;
        super(context, attributeSet, i);
        this.f593k = new C0114a();
        this.f594l = new ViewTreeObserverOnGlobalLayoutListenerC0115b();
        this.f598p = 4;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, aac0.f68308D, i, 0);
        if (Build.VERSION.SDK_INT >= 29) {
            activityChooserView = this;
            context2 = context;
            activityChooserView.saveAttributeDataForStyleable(context2, aac0.f68308D, attributeSet, typedArrayObtainStyledAttributes, i, 0);
        } else {
            activityChooserView = this;
            context2 = context;
        }
        activityChooserView.f598p = typedArrayObtainStyledAttributes.getInt(aac0.f68318F, 4);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(aac0.f68313E);
        typedArrayObtainStyledAttributes.recycle();
        LayoutInflater.from(activityChooserView.getContext()).inflate(g7c0.f101357e, (ViewGroup) activityChooserView, true);
        ViewOnClickListenerC0120g viewOnClickListenerC0120g = activityChooserView.new ViewOnClickListenerC0120g();
        activityChooserView.f584b = viewOnClickListenerC0120g;
        View viewFindViewById = activityChooserView.findViewById(s5c0.f162526j);
        activityChooserView.f585c = viewFindViewById;
        activityChooserView.f586d = viewFindViewById.getBackground();
        FrameLayout frameLayout = (FrameLayout) activityChooserView.findViewById(s5c0.f162534r);
        activityChooserView.f589g = frameLayout;
        frameLayout.setOnClickListener(viewOnClickListenerC0120g);
        frameLayout.setOnLongClickListener(viewOnClickListenerC0120g);
        activityChooserView.f590h = (ImageView) frameLayout.findViewById(s5c0.f162539w);
        FrameLayout frameLayout2 = (FrameLayout) activityChooserView.findViewById(s5c0.f162536t);
        frameLayout2.setOnClickListener(viewOnClickListenerC0120g);
        frameLayout2.setAccessibilityDelegate(activityChooserView.new C0116c());
        frameLayout2.setOnTouchListener(activityChooserView.new C0117d(frameLayout2));
        activityChooserView.f587e = frameLayout2;
        ImageView imageView = (ImageView) frameLayout2.findViewById(s5c0.f162539w);
        activityChooserView.f588f = imageView;
        imageView.setImageDrawable(drawable);
        C0119f c0119f = activityChooserView.new C0119f();
        activityChooserView.f583a = c0119f;
        c0119f.registerDataSetObserver(activityChooserView.new C0118e());
        Resources resources = context2.getResources();
        activityChooserView.f591i = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(p2c0.f146835d));
    }

    /* JADX INFO: renamed from: a */
    public boolean m528a() {
        if (!m529b()) {
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
    public boolean m529b() {
        return getListPopupWindow().isShowing();
    }

    /* JADX INFO: renamed from: c */
    public boolean m530c() {
        if (m529b() || !this.f599q) {
            return false;
        }
        this.f597o = false;
        m531d(this.f598p);
        return true;
    }

    /* JADX INFO: renamed from: d */
    public void m531d(int i) {
        this.f583a.m534b();
        throw new IllegalStateException("No data model. Did you call #setDataModel?");
    }

    /* JADX INFO: renamed from: e */
    public void m532e() {
        int count = this.f583a.getCount();
        FrameLayout frameLayout = this.f587e;
        if (count > 0) {
            frameLayout.setEnabled(true);
        } else {
            frameLayout.setEnabled(false);
        }
        int iM533a = this.f583a.m533a();
        int iM536d = this.f583a.m536d();
        if (iM533a == 1 || (iM533a > 1 && iM536d > 0)) {
            this.f589g.setVisibility(0);
            ResolveInfo resolveInfoM535c = this.f583a.m535c();
            PackageManager packageManager = getContext().getPackageManager();
            this.f590h.setImageDrawable(resolveInfoM535c.loadIcon(packageManager));
            if (this.f600r != 0) {
                this.f589g.setContentDescription(getContext().getString(this.f600r, resolveInfoM535c.loadLabel(packageManager)));
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

    public y40 getDataModel() {
        this.f583a.m534b();
        return null;
    }

    public C0163b getListPopupWindow() {
        if (this.f595m == null) {
            C0163b c0163b = new C0163b(getContext());
            this.f595m = c0163b;
            c0163b.mo554l(this.f583a);
            this.f595m.m638v(this);
            this.f595m.m618B(true);
            this.f595m.m620D(this.f584b);
            this.f595m.m619C(this.f584b);
        }
        return this.f595m;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f583a.m534b();
        this.f599q = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f583a.m534b();
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.f594l);
        }
        if (m529b()) {
            m528a();
        }
        this.f599q = false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.f585c.layout(0, 0, i3 - i, i4 - i2);
        if (m529b()) {
            return;
        }
        m528a();
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

    public void setActivityChooserModel(y40 y40Var) {
        this.f583a.m538f(y40Var);
        if (m529b()) {
            m528a();
            m530c();
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
    public void setProvider(z30 z30Var) {
        this.f592j = z30Var;
    }

    public ActivityChooserView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ActivityChooserView(Context context) {
        this(context, null);
    }
}
