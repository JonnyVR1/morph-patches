package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import androidx.annotation.AttrRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import com.google.android.gms.common.api.Api;
import java.lang.reflect.Method;
import p149l.aac0;
import p149l.ed80;
import p149l.gbl0;
import p149l.lu0;
import p149l.n0c0;
import p149l.tze0;

/* JADX INFO: renamed from: androidx.appcompat.widget.b */
/* JADX INFO: loaded from: classes.dex */
public class C0163b implements tze0 {

    /* JADX INFO: renamed from: H */
    public static Method f760H;

    /* JADX INFO: renamed from: I */
    public static Method f761I;

    /* JADX INFO: renamed from: A */
    public final c f762A;

    /* JADX INFO: renamed from: B */
    public Runnable f763B;

    /* JADX INFO: renamed from: C */
    public final Handler f764C;

    /* JADX INFO: renamed from: D */
    public final Rect f765D;

    /* JADX INFO: renamed from: E */
    public Rect f766E;

    /* JADX INFO: renamed from: F */
    public boolean f767F;

    /* JADX INFO: renamed from: G */
    public PopupWindow f768G;

    /* JADX INFO: renamed from: a */
    public Context f769a;

    /* JADX INFO: renamed from: b */
    public ListAdapter f770b;

    /* JADX INFO: renamed from: c */
    public DropDownListView f771c;

    /* JADX INFO: renamed from: d */
    public int f772d;

    /* JADX INFO: renamed from: e */
    public int f773e;

    /* JADX INFO: renamed from: f */
    public int f774f;

    /* JADX INFO: renamed from: g */
    public int f775g;

    /* JADX INFO: renamed from: h */
    public int f776h;

    /* JADX INFO: renamed from: i */
    public boolean f777i;

    /* JADX INFO: renamed from: j */
    public boolean f778j;

    /* JADX INFO: renamed from: k */
    public boolean f779k;

    /* JADX INFO: renamed from: l */
    public boolean f780l;

    /* JADX INFO: renamed from: m */
    public int f781m;

    /* JADX INFO: renamed from: n */
    public boolean f782n;

    /* JADX INFO: renamed from: o */
    public boolean f783o;

    /* JADX INFO: renamed from: p */
    public int f784p;

    /* JADX INFO: renamed from: q */
    public View f785q;

    /* JADX INFO: renamed from: r */
    public int f786r;

    /* JADX INFO: renamed from: s */
    public DataSetObserver f787s;

    /* JADX INFO: renamed from: t */
    public View f788t;

    /* JADX INFO: renamed from: u */
    public Drawable f789u;

    /* JADX INFO: renamed from: v */
    public AdapterView.OnItemClickListener f790v;

    /* JADX INFO: renamed from: w */
    public AdapterView.OnItemSelectedListener f791w;

    /* JADX INFO: renamed from: x */
    public final g f792x;

    /* JADX INFO: renamed from: y */
    public final f f793y;

    /* JADX INFO: renamed from: z */
    public final e f794z;

    /* JADX INFO: renamed from: androidx.appcompat.widget.b$a */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            View viewM632p = C0163b.this.m632p();
            if (viewM632p == null || viewM632p.getWindowToken() == null) {
                return;
            }
            C0163b.this.show();
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.b$b */
    public class b implements AdapterView.OnItemSelectedListener {
        public b() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            DropDownListView dropDownListView;
            if (i == -1 || (dropDownListView = C0163b.this.f771c) == null) {
                return;
            }
            dropDownListView.setListSelectionHidden(false);
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.b$c */
    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C0163b.this.m631n();
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.b$d */
    public class d extends DataSetObserver {
        public d() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            if (C0163b.this.isShowing()) {
                C0163b.this.show();
            }
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            C0163b.this.dismiss();
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.b$e */
    public class e implements AbsListView.OnScrollListener {
        public e() {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScroll(AbsListView absListView, int i, int i2, int i3) {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScrollStateChanged(AbsListView absListView, int i) {
            if (i != 1 || C0163b.this.m635s() || C0163b.this.f768G.getContentView() == null) {
                return;
            }
            C0163b c0163b = C0163b.this;
            c0163b.f764C.removeCallbacks(c0163b.f792x);
            C0163b.this.f792x.run();
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.b$f */
    public class f implements View.OnTouchListener {
        public f() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            PopupWindow popupWindow;
            int action = motionEvent.getAction();
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (action == 0 && (popupWindow = C0163b.this.f768G) != null && popupWindow.isShowing() && x >= 0 && x < C0163b.this.f768G.getWidth() && y >= 0 && y < C0163b.this.f768G.getHeight()) {
                C0163b c0163b = C0163b.this;
                c0163b.f764C.postDelayed(c0163b.f792x, 250L);
                return false;
            }
            if (action != 1) {
                return false;
            }
            C0163b c0163b2 = C0163b.this;
            c0163b2.f764C.removeCallbacks(c0163b2.f792x);
            return false;
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.b$g */
    public class g implements Runnable {
        public g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            DropDownListView dropDownListView = C0163b.this.f771c;
            if (dropDownListView == null || !gbl0.m125170O(dropDownListView) || C0163b.this.f771c.getCount() <= C0163b.this.f771c.getChildCount()) {
                return;
            }
            int childCount = C0163b.this.f771c.getChildCount();
            C0163b c0163b = C0163b.this;
            if (childCount <= c0163b.f784p) {
                c0163b.f768G.setInputMethodMode(2);
                C0163b.this.show();
            }
        }
    }

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                f760H = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
            }
            try {
                f761I = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
            }
        }
    }

    public C0163b(@NonNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i, @StyleRes int i2) {
        this.f772d = -2;
        this.f773e = -2;
        this.f776h = 1002;
        this.f778j = true;
        this.f781m = 0;
        this.f782n = false;
        this.f783o = false;
        this.f784p = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.f786r = 0;
        this.f792x = new g();
        this.f793y = new f();
        this.f794z = new e();
        this.f762A = new c();
        this.f765D = new Rect();
        this.f769a = context;
        this.f764C = new Handler(context.getMainLooper());
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, aac0.f68495p1, i, i2);
        this.f774f = typedArrayObtainStyledAttributes.getDimensionPixelOffset(aac0.f68500q1, 0);
        int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(aac0.f68505r1, 0);
        this.f775g = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.f777i = true;
        }
        typedArrayObtainStyledAttributes.recycle();
        lu0 lu0Var = new lu0(context, attributeSet, i, i2);
        this.f768G = lu0Var;
        lu0Var.setInputMethodMode(1);
    }

    /* JADX INFO: renamed from: A */
    public void m617A(int i) {
        this.f768G.setInputMethodMode(i);
    }

    /* JADX INFO: renamed from: B */
    public void m618B(boolean z) {
        this.f767F = z;
        this.f768G.setFocusable(z);
    }

    /* JADX INFO: renamed from: C */
    public void m619C(@Nullable PopupWindow.OnDismissListener onDismissListener) {
        this.f768G.setOnDismissListener(onDismissListener);
    }

    /* JADX INFO: renamed from: D */
    public void m620D(@Nullable AdapterView.OnItemClickListener onItemClickListener) {
        this.f790v = onItemClickListener;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* JADX INFO: renamed from: E */
    public void m621E(boolean z) {
        this.f780l = true;
        this.f779k = z;
    }

    /* JADX INFO: renamed from: F */
    public final void m622F(boolean z) {
        if (Build.VERSION.SDK_INT > 28) {
            this.f768G.setIsClippedToScreen(z);
            return;
        }
        Method method = f760H;
        if (method != null) {
            try {
                method.invoke(this.f768G, Boolean.valueOf(z));
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: renamed from: G */
    public void m623G(int i) {
        this.f786r = i;
    }

    /* JADX INFO: renamed from: H */
    public void m624H(int i) {
        DropDownListView dropDownListView = this.f771c;
        if (!isShowing() || dropDownListView == null) {
            return;
        }
        dropDownListView.setListSelectionHidden(false);
        dropDownListView.setSelection(i);
        if (dropDownListView.getChoiceMode() != 0) {
            dropDownListView.setItemChecked(i, true);
        }
    }

    /* JADX INFO: renamed from: I */
    public void m625I(int i) {
        this.f773e = i;
    }

    /* JADX INFO: renamed from: b */
    public void m626b(int i) {
        this.f775g = i;
        this.f777i = true;
    }

    @Override // p149l.tze0
    public void dismiss() {
        this.f768G.dismiss();
        m637u();
        this.f768G.setContentView(null);
        this.f771c = null;
        this.f764C.removeCallbacks(this.f792x);
    }

    /* JADX INFO: renamed from: e */
    public int m627e() {
        if (this.f777i) {
            return this.f775g;
        }
        return 0;
    }

    @Override // p149l.tze0
    @Nullable
    /* JADX INFO: renamed from: g */
    public ListView mo404g() {
        return this.f771c;
    }

    @Nullable
    public Drawable getBackground() {
        return this.f768G.getBackground();
    }

    /* JADX INFO: renamed from: h */
    public int m628h() {
        return this.f774f;
    }

    /* JADX INFO: renamed from: i */
    public void m629i(int i) {
        this.f774f = i;
    }

    @Override // p149l.tze0
    public boolean isShowing() {
        return this.f768G.isShowing();
    }

    /* JADX INFO: renamed from: l */
    public void mo554l(@Nullable ListAdapter listAdapter) {
        DataSetObserver dataSetObserver = this.f787s;
        if (dataSetObserver == null) {
            this.f787s = new d();
        } else {
            ListAdapter listAdapter2 = this.f770b;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f770b = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f787s);
        }
        DropDownListView dropDownListView = this.f771c;
        if (dropDownListView != null) {
            dropDownListView.setAdapter(this.f770b);
        }
    }

    /* JADX INFO: renamed from: m */
    public final int m630m() {
        int measuredHeight;
        int i;
        int iMakeMeasureSpec;
        View view;
        int i2;
        if (this.f771c == null) {
            Context context = this.f769a;
            this.f763B = new a();
            DropDownListView dropDownListViewMo581o = mo581o(context, !this.f767F);
            this.f771c = dropDownListViewMo581o;
            Drawable drawable = this.f789u;
            if (drawable != null) {
                dropDownListViewMo581o.setSelector(drawable);
            }
            this.f771c.setAdapter(this.f770b);
            this.f771c.setOnItemClickListener(this.f790v);
            this.f771c.setFocusable(true);
            this.f771c.setFocusableInTouchMode(true);
            this.f771c.setOnItemSelectedListener(new b());
            this.f771c.setOnScrollListener(this.f794z);
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.f791w;
            if (onItemSelectedListener != null) {
                this.f771c.setOnItemSelectedListener(onItemSelectedListener);
            }
            DropDownListView dropDownListView = this.f771c;
            View view2 = this.f785q;
            if (view2 != null) {
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0, 1.0f);
                int i3 = this.f786r;
                if (i3 == 0) {
                    linearLayout.addView(view2);
                    linearLayout.addView(dropDownListView, layoutParams);
                } else if (i3 != 1) {
                    Log.e("ListPopupWindow", "Invalid hint position " + this.f786r);
                } else {
                    linearLayout.addView(dropDownListView, layoutParams);
                    linearLayout.addView(view2);
                }
                int i4 = this.f773e;
                if (i4 >= 0) {
                    i2 = Integer.MIN_VALUE;
                } else {
                    i4 = 0;
                    i2 = 0;
                }
                view2.measure(View.MeasureSpec.makeMeasureSpec(i4, i2), 0);
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) view2.getLayoutParams();
                measuredHeight = view2.getMeasuredHeight() + layoutParams2.topMargin + layoutParams2.bottomMargin;
                view = linearLayout;
            } else {
                measuredHeight = 0;
                view = dropDownListView;
            }
            this.f768G.setContentView(view);
        } else {
            View view3 = this.f785q;
            if (view3 != null) {
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) view3.getLayoutParams();
                measuredHeight = view3.getMeasuredHeight() + layoutParams3.topMargin + layoutParams3.bottomMargin;
            } else {
                measuredHeight = 0;
            }
        }
        Drawable background = this.f768G.getBackground();
        Rect rect = this.f765D;
        if (background != null) {
            background.getPadding(rect);
            Rect rect2 = this.f765D;
            int i5 = rect2.top;
            i = rect2.bottom + i5;
            if (!this.f777i) {
                this.f775g = -i5;
            }
        } else {
            rect.setEmpty();
            i = 0;
        }
        int iM633q = m633q(m632p(), this.f775g, this.f768G.getInputMethodMode() == 2);
        if (this.f782n || this.f772d == -1) {
            return iM633q + i;
        }
        int i6 = this.f773e;
        if (i6 == -2) {
            int i7 = this.f769a.getResources().getDisplayMetrics().widthPixels;
            Rect rect3 = this.f765D;
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i7 - (rect3.left + rect3.right), Integer.MIN_VALUE);
        } else if (i6 != -1) {
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i6, 1073741824);
        } else {
            int i8 = this.f769a.getResources().getDisplayMetrics().widthPixels;
            Rect rect4 = this.f765D;
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i8 - (rect4.left + rect4.right), 1073741824);
        }
        int iMo566d = this.f771c.mo566d(iMakeMeasureSpec, 0, -1, iM633q - measuredHeight, -1);
        if (iMo566d > 0) {
            measuredHeight += i + this.f771c.getPaddingTop() + this.f771c.getPaddingBottom();
        }
        return iMo566d + measuredHeight;
    }

    /* JADX INFO: renamed from: n */
    public void m631n() {
        DropDownListView dropDownListView = this.f771c;
        if (dropDownListView != null) {
            dropDownListView.setListSelectionHidden(true);
            dropDownListView.requestLayout();
        }
    }

    @NonNull
    /* JADX INFO: renamed from: o */
    public DropDownListView mo581o(Context context, boolean z) {
        return new DropDownListView(context, z);
    }

    @Nullable
    /* JADX INFO: renamed from: p */
    public View m632p() {
        return this.f788t;
    }

    /* JADX INFO: renamed from: q */
    public final int m633q(View view, int i, boolean z) {
        return this.f768G.getMaxAvailableHeight(view, i, z);
    }

    /* JADX INFO: renamed from: r */
    public int m634r() {
        return this.f773e;
    }

    /* JADX INFO: renamed from: s */
    public boolean m635s() {
        return this.f768G.getInputMethodMode() == 2;
    }

    public void setBackgroundDrawable(@Nullable Drawable drawable) {
        this.f768G.setBackgroundDrawable(drawable);
    }

    @Override // p149l.tze0
    public void show() {
        int iM630m = m630m();
        boolean zM635s = m635s();
        ed80.m115790b(this.f768G, this.f776h);
        if (this.f768G.isShowing()) {
            if (gbl0.m125170O(m632p())) {
                int width = this.f773e;
                if (width == -1) {
                    width = -1;
                } else if (width == -2) {
                    width = m632p().getWidth();
                }
                int i = this.f772d;
                if (i == -1) {
                    if (!zM635s) {
                        iM630m = -1;
                    }
                    PopupWindow popupWindow = this.f768G;
                    if (zM635s) {
                        popupWindow.setWidth(this.f773e == -1 ? -1 : 0);
                        this.f768G.setHeight(0);
                    } else {
                        popupWindow.setWidth(this.f773e == -1 ? -1 : 0);
                        this.f768G.setHeight(-1);
                    }
                } else if (i != -2) {
                    iM630m = i;
                }
                this.f768G.setOutsideTouchable((this.f783o || this.f782n) ? false : true);
                this.f768G.update(m632p(), this.f774f, this.f775g, width < 0 ? -1 : width, iM630m < 0 ? -1 : iM630m);
                return;
            }
            return;
        }
        int width2 = this.f773e;
        if (width2 == -1) {
            width2 = -1;
        } else if (width2 == -2) {
            width2 = m632p().getWidth();
        }
        int i2 = this.f772d;
        if (i2 == -1) {
            iM630m = -1;
        } else if (i2 != -2) {
            iM630m = i2;
        }
        this.f768G.setWidth(width2);
        this.f768G.setHeight(iM630m);
        m622F(true);
        this.f768G.setOutsideTouchable((this.f783o || this.f782n) ? false : true);
        this.f768G.setTouchInterceptor(this.f793y);
        if (this.f780l) {
            ed80.m115789a(this.f768G, this.f779k);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = f761I;
            if (method != null) {
                try {
                    method.invoke(this.f768G, this.f766E);
                } catch (Exception e2) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e2);
                }
            }
        } else {
            this.f768G.setEpicenterBounds(this.f766E);
        }
        ed80.m115791c(this.f768G, m632p(), this.f774f, this.f775g, this.f781m);
        this.f771c.setSelection(-1);
        if (!this.f767F || this.f771c.isInTouchMode()) {
            m631n();
        }
        if (this.f767F) {
            return;
        }
        this.f764C.post(this.f762A);
    }

    /* JADX INFO: renamed from: t */
    public boolean m636t() {
        return this.f767F;
    }

    /* JADX INFO: renamed from: u */
    public final void m637u() {
        View view = this.f785q;
        if (view != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.f785q);
            }
        }
    }

    /* JADX INFO: renamed from: v */
    public void m638v(@Nullable View view) {
        this.f788t = view;
    }

    /* JADX INFO: renamed from: w */
    public void m639w(@StyleRes int i) {
        this.f768G.setAnimationStyle(i);
    }

    /* JADX INFO: renamed from: x */
    public void m640x(int i) {
        Drawable background = this.f768G.getBackground();
        if (background == null) {
            m625I(i);
            return;
        }
        background.getPadding(this.f765D);
        Rect rect = this.f765D;
        this.f773e = rect.left + rect.right + i;
    }

    /* JADX INFO: renamed from: y */
    public void m641y(int i) {
        this.f781m = i;
    }

    /* JADX INFO: renamed from: z */
    public void m642z(@Nullable Rect rect) {
        this.f766E = rect != null ? new Rect(rect) : null;
    }

    public C0163b(@NonNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i) {
        this(context, attributeSet, i, 0);
    }

    public C0163b(@NonNull Context context) {
        this(context, null, n0c0.f136498G);
    }
}
