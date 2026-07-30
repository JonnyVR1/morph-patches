package p149l;

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
import com.p046p1.mobile.putong.live.base.data.BLiveBottomPopupStyleTypeEnum;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public abstract class idl0<T extends View, Z> extends hr2<Z> {

    /* JADX INFO: renamed from: g */
    private static boolean f112651g;

    /* JADX INFO: renamed from: h */
    private static int f112652h = b4c0.f73341a;

    /* JADX INFO: renamed from: b */
    protected final T f112653b;

    /* JADX INFO: renamed from: c */
    private final C17529a f112654c;

    /* JADX INFO: renamed from: d */
    @Nullable
    private View.OnAttachStateChangeListener f112655d;

    /* JADX INFO: renamed from: e */
    private boolean f112656e;

    /* JADX INFO: renamed from: f */
    private boolean f112657f;

    /* JADX INFO: renamed from: l.idl0$a */
    @VisibleForTesting
    public static final class C17529a {

        /* JADX INFO: renamed from: e */
        @Nullable
        @VisibleForTesting
        static Integer f112658e;

        /* JADX INFO: renamed from: a */
        private final View f112659a;

        /* JADX INFO: renamed from: b */
        private final List<yif0> f112660b = new ArrayList();

        /* JADX INFO: renamed from: c */
        boolean f112661c;

        /* JADX INFO: renamed from: d */
        @Nullable
        private a f112662d;

        /* JADX INFO: renamed from: l.idl0$a$a */
        public static final class a implements ViewTreeObserver.OnPreDrawListener {

            /* JADX INFO: renamed from: a */
            private final WeakReference<C17529a> f112663a;

            public a(@NonNull C17529a c17529a) {
                this.f112663a = new WeakReference<>(c17529a);
            }

            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public boolean onPreDraw() {
                Log.isLoggable("ViewTarget", 2);
                C17529a c17529a = this.f112663a.get();
                if (c17529a == null) {
                    return true;
                }
                c17529a.m135609a();
                return true;
            }
        }

        public C17529a(@NonNull View view) {
            this.f112659a = view;
        }

        /* JADX INFO: renamed from: c */
        private static int m135602c(@NonNull Context context) {
            if (f112658e == null) {
                Display defaultDisplay = ((WindowManager) qf80.m174276d((WindowManager) context.getSystemService(BLiveBottomPopupStyleTypeEnum.window))).getDefaultDisplay();
                Point point = new Point();
                defaultDisplay.getSize(point);
                f112658e = Integer.valueOf(Math.max(point.x, point.y));
            }
            return f112658e.intValue();
        }

        /* JADX INFO: renamed from: e */
        private int m135603e(int i, int i2, int i3) {
            int i4 = i2 - i3;
            if (i4 > 0) {
                return i4;
            }
            if (this.f112661c && this.f112659a.isLayoutRequested()) {
                return 0;
            }
            int i5 = i - i3;
            if (i5 > 0) {
                return i5;
            }
            if (this.f112659a.isLayoutRequested() || i2 != -2) {
                return 0;
            }
            Log.isLoggable("ViewTarget", 4);
            return m135602c(this.f112659a.getContext());
        }

        /* JADX INFO: renamed from: f */
        private int m135604f() {
            int paddingTop = this.f112659a.getPaddingTop() + this.f112659a.getPaddingBottom();
            ViewGroup.LayoutParams layoutParams = this.f112659a.getLayoutParams();
            return m135603e(this.f112659a.getHeight(), layoutParams != null ? layoutParams.height : 0, paddingTop);
        }

        /* JADX INFO: renamed from: g */
        private int m135605g() {
            int paddingLeft = this.f112659a.getPaddingLeft() + this.f112659a.getPaddingRight();
            ViewGroup.LayoutParams layoutParams = this.f112659a.getLayoutParams();
            return m135603e(this.f112659a.getWidth(), layoutParams != null ? layoutParams.width : 0, paddingLeft);
        }

        /* JADX INFO: renamed from: h */
        private boolean m135606h(int i) {
            return i > 0 || i == Integer.MIN_VALUE;
        }

        /* JADX INFO: renamed from: i */
        private boolean m135607i(int i, int i2) {
            return m135606h(i) && m135606h(i2);
        }

        /* JADX INFO: renamed from: j */
        private void m135608j(int i, int i2) {
            Iterator it = new ArrayList(this.f112660b).iterator();
            while (it.hasNext()) {
                ((yif0) it.next()).mo5641d(i, i2);
            }
        }

        /* JADX INFO: renamed from: a */
        public void m135609a() {
            if (this.f112660b.isEmpty()) {
                return;
            }
            int iM135605g = m135605g();
            int iM135604f = m135604f();
            if (m135607i(iM135605g, iM135604f)) {
                m135608j(iM135605g, iM135604f);
                m135610b();
            }
        }

        /* JADX INFO: renamed from: b */
        public void m135610b() {
            ViewTreeObserver viewTreeObserver = this.f112659a.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnPreDrawListener(this.f112662d);
            }
            this.f112662d = null;
            this.f112660b.clear();
        }

        /* JADX INFO: renamed from: d */
        public void m135611d(@NonNull yif0 yif0Var) {
            int iM135605g = m135605g();
            int iM135604f = m135604f();
            if (m135607i(iM135605g, iM135604f)) {
                yif0Var.mo5641d(iM135605g, iM135604f);
                return;
            }
            if (!this.f112660b.contains(yif0Var)) {
                this.f112660b.add(yif0Var);
            }
            if (this.f112662d == null) {
                ViewTreeObserver viewTreeObserver = this.f112659a.getViewTreeObserver();
                a aVar = new a(this);
                this.f112662d = aVar;
                viewTreeObserver.addOnPreDrawListener(aVar);
            }
        }

        /* JADX INFO: renamed from: k */
        public void m135612k(@NonNull yif0 yif0Var) {
            this.f112660b.remove(yif0Var);
        }
    }

    public idl0(@NonNull T t) {
        this.f112653b = (T) qf80.m174276d(t);
        this.f112654c = new C17529a(t);
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    private Object m135598b() {
        return this.f112653b.getTag(f112652h);
    }

    /* JADX INFO: renamed from: f */
    private void m135599f() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.f112655d;
        if (onAttachStateChangeListener == null || this.f112657f) {
            return;
        }
        this.f112653b.addOnAttachStateChangeListener(onAttachStateChangeListener);
        this.f112657f = true;
    }

    /* JADX INFO: renamed from: h */
    private void m135600h() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.f112655d;
        if (onAttachStateChangeListener == null || !this.f112657f) {
            return;
        }
        this.f112653b.removeOnAttachStateChangeListener(onAttachStateChangeListener);
        this.f112657f = false;
    }

    /* JADX INFO: renamed from: m */
    private void m135601m(@Nullable Object obj) {
        f112651g = true;
        this.f112653b.setTag(f112652h, obj);
    }

    @Override // p149l.cci0
    @CallSuper
    /* JADX INFO: renamed from: a */
    public void mo103907a(@NonNull yif0 yif0Var) {
        this.f112654c.m135612k(yif0Var);
    }

    @Override // p149l.hr2, p149l.cci0
    @Nullable
    /* JADX INFO: renamed from: c */
    public ttc0 mo103909c() {
        Object objM135598b = m135598b();
        if (objM135598b != null) {
            if (objM135598b instanceof ttc0) {
                return (ttc0) objM135598b;
            }
            ig3.m135964a("You must not call setTag() on a view Glide is targeting");
        }
        return null;
    }

    @Override // p149l.hr2, p149l.cci0
    @CallSuper
    /* JADX INFO: renamed from: e */
    public void mo103910e(@Nullable Drawable drawable) {
        super.mo103910e(drawable);
        this.f112654c.m135610b();
        if (this.f112656e) {
            return;
        }
        m135600h();
    }

    @Override // p149l.hr2, p149l.cci0
    /* JADX INFO: renamed from: g */
    public void mo103912g(@Nullable ttc0 ttc0Var) {
        m135601m(ttc0Var);
    }

    @Override // p149l.hr2, p149l.cci0
    @CallSuper
    /* JADX INFO: renamed from: j */
    public void mo103914j(@Nullable Drawable drawable) {
        super.mo103914j(drawable);
        m135599f();
    }

    @Override // p149l.cci0
    @CallSuper
    /* JADX INFO: renamed from: k */
    public void mo103915k(@NonNull yif0 yif0Var) {
        this.f112654c.m135611d(yif0Var);
    }

    public String toString() {
        return "Target for: " + this.f112653b;
    }
}
