package p153l;

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
public class i2j0 implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: j */
    public static i2j0 f112637j;

    /* JADX INFO: renamed from: k */
    public static i2j0 f112638k;

    /* JADX INFO: renamed from: a */
    public final View f112639a;

    /* JADX INFO: renamed from: b */
    public final CharSequence f112640b;

    /* JADX INFO: renamed from: c */
    public final int f112641c;

    /* JADX INFO: renamed from: d */
    public final Runnable f112642d = new RunnableC17624a();

    /* JADX INFO: renamed from: e */
    public final Runnable f112643e = new RunnableC17625b();

    /* JADX INFO: renamed from: f */
    public int f112644f;

    /* JADX INFO: renamed from: g */
    public int f112645g;

    /* JADX INFO: renamed from: h */
    public j2j0 f112646h;

    /* JADX INFO: renamed from: i */
    public boolean f112647i;

    /* JADX INFO: renamed from: l.i2j0$a */
    public class RunnableC17624a implements Runnable {
        public RunnableC17624a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            i2j0.this.m138225g(false);
        }
    }

    /* JADX INFO: renamed from: l.i2j0$b */
    public class RunnableC17625b implements Runnable {
        public RunnableC17625b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            i2j0.this.m138223c();
        }
    }

    public i2j0(View view, CharSequence charSequence) {
        this.f112639a = view;
        this.f112640b = charSequence;
        this.f112641c = nkl0.m163645g(ViewConfiguration.get(view.getContext()));
        m138222b();
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    /* JADX INFO: renamed from: e */
    public static void m138219e(i2j0 i2j0Var) {
        i2j0 i2j0Var2 = f112637j;
        if (i2j0Var2 != null) {
            i2j0Var2.m138221a();
        }
        f112637j = i2j0Var;
        if (i2j0Var != null) {
            i2j0Var.m138224d();
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m138220f(View view, CharSequence charSequence) {
        i2j0 i2j0Var = f112637j;
        if (i2j0Var != null && i2j0Var.f112639a == view) {
            m138219e(null);
        }
        if (!TextUtils.isEmpty(charSequence)) {
            new i2j0(view, charSequence);
            return;
        }
        i2j0 i2j0Var2 = f112638k;
        if (i2j0Var2 != null && i2j0Var2.f112639a == view) {
            i2j0Var2.m138223c();
        }
        view.setOnLongClickListener(null);
        view.setLongClickable(false);
        view.setOnHoverListener(null);
    }

    /* JADX INFO: renamed from: a */
    public final void m138221a() {
        this.f112639a.removeCallbacks(this.f112642d);
    }

    /* JADX INFO: renamed from: b */
    public final void m138222b() {
        this.f112644f = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.f112645g = Api.BaseClientBuilder.API_PRIORITY_OTHER;
    }

    /* JADX INFO: renamed from: c */
    public void m138223c() {
        if (f112638k == this) {
            f112638k = null;
            j2j0 j2j0Var = this.f112646h;
            if (j2j0Var != null) {
                j2j0Var.m143220c();
                this.f112646h = null;
                m138222b();
                this.f112639a.removeOnAttachStateChangeListener(this);
            } else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (f112637j == this) {
            m138219e(null);
        }
        this.f112639a.removeCallbacks(this.f112643e);
    }

    /* JADX INFO: renamed from: d */
    public final void m138224d() {
        this.f112639a.postDelayed(this.f112642d, ViewConfiguration.getLongPressTimeout());
    }

    /* JADX INFO: renamed from: g */
    public void m138225g(boolean z) {
        long longPressTimeout;
        long j;
        long j2;
        if (kkl0.m150133O(this.f112639a)) {
            m138219e(null);
            i2j0 i2j0Var = f112638k;
            if (i2j0Var != null) {
                i2j0Var.m138223c();
            }
            f112638k = this;
            this.f112647i = z;
            j2j0 j2j0Var = new j2j0(this.f112639a.getContext());
            this.f112646h = j2j0Var;
            j2j0Var.m143222e(this.f112639a, this.f112644f, this.f112645g, this.f112647i, this.f112640b);
            this.f112639a.addOnAttachStateChangeListener(this);
            if (this.f112647i) {
                j2 = 2500;
            } else {
                if ((kkl0.m150126I(this.f112639a) & 1) == 1) {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j = 3000;
                } else {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j = 15000;
                }
                j2 = j - longPressTimeout;
            }
            this.f112639a.removeCallbacks(this.f112643e);
            this.f112639a.postDelayed(this.f112643e, j2);
        }
    }

    /* JADX INFO: renamed from: h */
    public final boolean m138226h(MotionEvent motionEvent) {
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        if (Math.abs(x - this.f112644f) <= this.f112641c && Math.abs(y - this.f112645g) <= this.f112641c) {
            return false;
        }
        this.f112644f = x;
        this.f112645g = y;
        return true;
    }

    @Override // android.view.View.OnHoverListener
    public boolean onHover(View view, MotionEvent motionEvent) {
        if (this.f112646h != null && this.f112647i) {
            return false;
        }
        AccessibilityManager accessibilityManager = (AccessibilityManager) this.f112639a.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 7) {
            if (action == 10) {
                m138222b();
                m138223c();
            }
        } else if (this.f112639a.isEnabled() && this.f112646h == null && m138226h(motionEvent)) {
            m138219e(this);
        }
        return false;
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(View view) {
        this.f112644f = view.getWidth() / 2;
        this.f112645g = view.getHeight() / 2;
        m138225g(true);
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        m138223c();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
    }
}
