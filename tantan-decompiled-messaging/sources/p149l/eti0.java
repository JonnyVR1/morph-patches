package p149l;

import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityManager;
import androidx.annotation.RestrictTo;
import com.google.android.gms.common.api.Api;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class eti0 implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: j */
    public static eti0 f93143j;

    /* JADX INFO: renamed from: k */
    public static eti0 f93144k;

    /* JADX INFO: renamed from: a */
    public final View f93145a;

    /* JADX INFO: renamed from: b */
    public final CharSequence f93146b;

    /* JADX INFO: renamed from: c */
    public final int f93147c;

    /* JADX INFO: renamed from: d */
    public final Runnable f93148d = new RunnableC16678a();

    /* JADX INFO: renamed from: e */
    public final Runnable f93149e = new RunnableC16679b();

    /* JADX INFO: renamed from: f */
    public int f93150f;

    /* JADX INFO: renamed from: g */
    public int f93151g;

    /* JADX INFO: renamed from: h */
    public fti0 f93152h;

    /* JADX INFO: renamed from: i */
    public boolean f93153i;

    /* JADX INFO: renamed from: l.eti0$a */
    public class RunnableC16678a implements Runnable {
        public RunnableC16678a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            eti0.this.m118124g(false);
        }
    }

    /* JADX INFO: renamed from: l.eti0$b */
    public class RunnableC16679b implements Runnable {
        public RunnableC16679b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            eti0.this.m118122c();
        }
    }

    public eti0(View view, CharSequence charSequence) {
        this.f93145a = view;
        this.f93146b = charSequence;
        this.f93147c = jbl0.m140790g(ViewConfiguration.get(view.getContext()));
        m118121b();
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    /* JADX INFO: renamed from: e */
    public static void m118118e(eti0 eti0Var) {
        eti0 eti0Var2 = f93143j;
        if (eti0Var2 != null) {
            eti0Var2.m118120a();
        }
        f93143j = eti0Var;
        if (eti0Var != null) {
            eti0Var.m118123d();
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m118119f(View view, CharSequence charSequence) {
        eti0 eti0Var = f93143j;
        if (eti0Var != null && eti0Var.f93145a == view) {
            m118118e(null);
        }
        if (!TextUtils.isEmpty(charSequence)) {
            new eti0(view, charSequence);
            return;
        }
        eti0 eti0Var2 = f93144k;
        if (eti0Var2 != null && eti0Var2.f93145a == view) {
            eti0Var2.m118122c();
        }
        view.setOnLongClickListener(null);
        view.setLongClickable(false);
        view.setOnHoverListener(null);
    }

    /* JADX INFO: renamed from: a */
    public final void m118120a() {
        this.f93145a.removeCallbacks(this.f93148d);
    }

    /* JADX INFO: renamed from: b */
    public final void m118121b() {
        this.f93150f = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.f93151g = Api.BaseClientBuilder.API_PRIORITY_OTHER;
    }

    /* JADX INFO: renamed from: c */
    public void m118122c() {
        if (f93144k == this) {
            f93144k = null;
            fti0 fti0Var = this.f93152h;
            if (fti0Var != null) {
                fti0Var.m123053c();
                this.f93152h = null;
                m118121b();
                this.f93145a.removeOnAttachStateChangeListener(this);
            } else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (f93143j == this) {
            m118118e(null);
        }
        this.f93145a.removeCallbacks(this.f93149e);
    }

    /* JADX INFO: renamed from: d */
    public final void m118123d() {
        this.f93145a.postDelayed(this.f93148d, ViewConfiguration.getLongPressTimeout());
    }

    /* JADX INFO: renamed from: g */
    public void m118124g(boolean z) {
        long longPressTimeout;
        long j;
        long j2;
        if (gbl0.m125170O(this.f93145a)) {
            m118118e(null);
            eti0 eti0Var = f93144k;
            if (eti0Var != null) {
                eti0Var.m118122c();
            }
            f93144k = this;
            this.f93153i = z;
            fti0 fti0Var = new fti0(this.f93145a.getContext());
            this.f93152h = fti0Var;
            fti0Var.m123055e(this.f93145a, this.f93150f, this.f93151g, this.f93153i, this.f93146b);
            this.f93145a.addOnAttachStateChangeListener(this);
            if (this.f93153i) {
                j2 = 2500;
            } else {
                if ((gbl0.m125163I(this.f93145a) & 1) == 1) {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j = 3000;
                } else {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j = 15000;
                }
                j2 = j - longPressTimeout;
            }
            this.f93145a.removeCallbacks(this.f93149e);
            this.f93145a.postDelayed(this.f93149e, j2);
        }
    }

    /* JADX INFO: renamed from: h */
    public final boolean m118125h(MotionEvent motionEvent) {
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        if (Math.abs(x - this.f93150f) <= this.f93147c && Math.abs(y - this.f93151g) <= this.f93147c) {
            return false;
        }
        this.f93150f = x;
        this.f93151g = y;
        return true;
    }

    @Override // android.view.View.OnHoverListener
    public boolean onHover(View view, MotionEvent motionEvent) {
        if (this.f93152h != null && this.f93153i) {
            return false;
        }
        AccessibilityManager accessibilityManager = (AccessibilityManager) this.f93145a.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 7) {
            if (action == 10) {
                m118121b();
                m118122c();
            }
        } else if (this.f93145a.isEnabled() && this.f93152h == null && m118125h(motionEvent)) {
            m118118e(this);
        }
        return false;
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(View view) {
        this.f93150f = view.getWidth() / 2;
        this.f93151g = view.getHeight() / 2;
        m118124g(true);
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        m118122c();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
    }
}
