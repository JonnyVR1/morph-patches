package p153l;

import android.content.Context;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.p051p1.mobile.putong.live.base.data.BLiveBottomPopupStyleTypeEnum;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public abstract class mml0<T extends View, Z> extends xr2<Z> {

    /* JADX INFO: renamed from: g */
    private static boolean f137607g;

    /* JADX INFO: renamed from: h */
    private static int f137608h = hcc0.f108686a;

    /* JADX INFO: renamed from: b */
    protected final T f137609b;

    /* JADX INFO: renamed from: c */
    private final C18657a f137610c;

    /* JADX INFO: renamed from: d */
    @Nullable
    private View.OnAttachStateChangeListener f137611d;

    /* JADX INFO: renamed from: e */
    private boolean f137612e;

    /* JADX INFO: renamed from: f */
    private boolean f137613f;

    /* JADX INFO: renamed from: l.mml0$a */
    @VisibleForTesting
    public static final class C18657a {

        /* JADX INFO: renamed from: e */
        @Nullable
        @VisibleForTesting
        static Integer f137614e;

        /* JADX INFO: renamed from: a */
        private final View f137615a;

        /* JADX INFO: renamed from: b */
        private final List<hrf0> f137616b = new ArrayList();

        /* JADX INFO: renamed from: c */
        boolean f137617c;

        /* JADX INFO: renamed from: d */
        @Nullable
        private a f137618d;

        /* JADX INFO: renamed from: l.mml0$a$a */
        public static final class a implements ViewTreeObserver.OnPreDrawListener {

            /* JADX INFO: renamed from: a */
            private final WeakReference<C18657a> f137619a;

            public a(@NonNull C18657a c18657a) {
                this.f137619a = new WeakReference<>(c18657a);
            }

            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public boolean onPreDraw() {
                Log.isLoggable("ViewTarget", 2);
                C18657a c18657a = this.f137619a.get();
                if (c18657a == null) {
                    return true;
                }
                c18657a.m159087a();
                return true;
            }
        }

        public C18657a(@NonNull View view) {
            this.f137615a = view;
        }

        /* JADX INFO: renamed from: c */
        private static int m159080c(@NonNull Context context) {
            if (f137614e == null) {
                Display defaultDisplay = ((WindowManager) vn80.m201944d((WindowManager) context.getSystemService(BLiveBottomPopupStyleTypeEnum.window))).getDefaultDisplay();
                Point point = new Point();
                defaultDisplay.getSize(point);
                f137614e = Integer.valueOf(Math.max(point.x, point.y));
            }
            return f137614e.intValue();
        }

        /* JADX INFO: renamed from: e */
        private int m159081e(int i, int i2, int i3) {
            int i4 = i2 - i3;
            if (i4 > 0) {
                return i4;
            }
            if (this.f137617c && this.f137615a.isLayoutRequested()) {
                return 0;
            }
            int i5 = i - i3;
            if (i5 > 0) {
                return i5;
            }
            if (this.f137615a.isLayoutRequested() || i2 != -2) {
                return 0;
            }
            Log.isLoggable("ViewTarget", 4);
            return m159080c(this.f137615a.getContext());
        }

        /* JADX INFO: renamed from: f */
        private int m159082f() {
            int paddingTop = this.f137615a.getPaddingTop() + this.f137615a.getPaddingBottom();
            ViewGroup.LayoutParams layoutParams = this.f137615a.getLayoutParams();
            return m159081e(this.f137615a.getHeight(), layoutParams != null ? layoutParams.height : 0, paddingTop);
        }

        /* JADX INFO: renamed from: g */
        private int m159083g() {
            int paddingLeft = this.f137615a.getPaddingLeft() + this.f137615a.getPaddingRight();
            ViewGroup.LayoutParams layoutParams = this.f137615a.getLayoutParams();
            return m159081e(this.f137615a.getWidth(), layoutParams != null ? layoutParams.width : 0, paddingLeft);
        }

        /* JADX INFO: renamed from: h */
        private boolean m159084h(int i) {
            return i > 0 || i == Integer.MIN_VALUE;
        }

        /* JADX INFO: renamed from: i */
        private boolean m159085i(int i, int i2) {
            return m159084h(i) && m159084h(i2);
        }

        /* JADX INFO: renamed from: j */
        private void m159086j(int i, int i2) {
            Iterator it = new ArrayList(this.f137616b).iterator();
            while (it.hasNext()) {
                ((hrf0) it.next()).mo5695d(i, i2);
            }
        }

        /* JADX INFO: renamed from: a */
        public void m159087a() {
            if (this.f137616b.isEmpty()) {
                return;
            }
            int iM159083g = m159083g();
            int iM159082f = m159082f();
            if (m159085i(iM159083g, iM159082f)) {
                m159086j(iM159083g, iM159082f);
                m159088b();
            }
        }

        /* JADX INFO: renamed from: b */
        public void m159088b() {
            ViewTreeObserver viewTreeObserver = this.f137615a.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnPreDrawListener(this.f137618d);
            }
            this.f137618d = null;
            this.f137616b.clear();
        }

        /* JADX INFO: renamed from: d */
        public void m159089d(@NonNull hrf0 hrf0Var) {
            int iM159083g = m159083g();
            int iM159082f = m159082f();
            if (m159085i(iM159083g, iM159082f)) {
                hrf0Var.mo5695d(iM159083g, iM159082f);
                return;
            }
            if (!this.f137616b.contains(hrf0Var)) {
                this.f137616b.add(hrf0Var);
            }
            if (this.f137618d == null) {
                ViewTreeObserver viewTreeObserver = this.f137615a.getViewTreeObserver();
                a aVar = new a(this);
                this.f137618d = aVar;
                viewTreeObserver.addOnPreDrawListener(aVar);
            }
        }

        /* JADX INFO: renamed from: k */
        public void m159090k(@NonNull hrf0 hrf0Var) {
            this.f137616b.remove(hrf0Var);
        }
    }

    public mml0(@NonNull T t) {
        this.f137609b = (T) vn80.m201944d(t);
        this.f137610c = new C18657a(t);
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    private Object m159076b() {
        return this.f137609b.getTag(f137608h);
    }

    /* JADX INFO: renamed from: f */
    private void m159077f() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.f137611d;
        if (onAttachStateChangeListener == null || this.f137613f) {
            return;
        }
        this.f137609b.addOnAttachStateChangeListener(onAttachStateChangeListener);
        this.f137613f = true;
    }

    /* JADX INFO: renamed from: h */
    private void m159078h() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.f137611d;
        if (onAttachStateChangeListener == null || !this.f137613f) {
            return;
        }
        this.f137609b.removeOnAttachStateChangeListener(onAttachStateChangeListener);
        this.f137613f = false;
    }

    /* JADX INFO: renamed from: m */
    private void m159079m(@Nullable Object obj) {
        f137607g = true;
        this.f137609b.setTag(f137608h, obj);
    }

    @Override // p153l.cli0
    @CallSuper
    /* JADX INFO: renamed from: a */
    public void mo95326a(@NonNull hrf0 hrf0Var) {
        this.f137610c.m159090k(hrf0Var);
    }

    @Override // p153l.xr2, p153l.cli0
    @Nullable
    /* JADX INFO: renamed from: c */
    public y1d0 mo95327c() {
        Object objM159076b = m159076b();
        if (objM159076b != null) {
            if (objM159076b instanceof y1d0) {
                return (y1d0) objM159076b;
            }
            wg3.m206174a("You must not call setTag() on a view Glide is targeting");
        }
        return null;
    }

    @Override // p153l.xr2, p153l.cli0
    @CallSuper
    /* JADX INFO: renamed from: e */
    public void mo104923e(@Nullable Drawable drawable) {
        super.mo104923e(drawable);
        this.f137610c.m159088b();
        if (this.f137612e) {
            return;
        }
        m159078h();
    }

    @Override // p153l.xr2, p153l.cli0
    /* JADX INFO: renamed from: g */
    public void mo95328g(@Nullable y1d0 y1d0Var) {
        m159079m(y1d0Var);
    }

    @Override // p153l.xr2, p153l.cli0
    @CallSuper
    /* JADX INFO: renamed from: j */
    public void mo95329j(@Nullable Drawable drawable) {
        super.mo95329j(drawable);
        m159077f();
    }

    @Override // p153l.cli0
    @CallSuper
    /* JADX INFO: renamed from: k */
    public void mo95330k(@NonNull hrf0 hrf0Var) {
        this.f137610c.m159089d(hrf0Var);
    }

    public String toString() {
        return "Target for: " + this.f137609b;
    }
}
