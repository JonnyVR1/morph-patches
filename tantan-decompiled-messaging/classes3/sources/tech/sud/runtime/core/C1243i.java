package tech.sud.runtime.core;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.widget.FrameLayout;
import java.util.concurrent.atomic.AtomicInteger;
import tech.sud.runtime.component.p021c.C1207h;
import tech.sud.runtime.component.p023e.C1214d;
import tech.sud.runtime.component.p026h.C1225c;

/* JADX INFO: renamed from: tech.sud.runtime.core.i */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
class C1243i extends FrameLayout {

    /* JADX INFO: renamed from: a */
    private View f11547a;

    /* JADX INFO: renamed from: b */
    private boolean f11548b;

    /* JADX INFO: renamed from: c */
    private int f11549c;

    /* JADX INFO: renamed from: d */
    private int f11550d;

    /* JADX INFO: renamed from: e */
    private int f11551e;

    /* JADX INFO: renamed from: f */
    private int f11552f;

    /* JADX INFO: renamed from: g */
    private final Window f11553g;

    /* JADX INFO: renamed from: h */
    private final View f11554h;

    /* JADX INFO: renamed from: i */
    private boolean f11555i;

    /* JADX INFO: renamed from: j */
    private int f11556j;

    /* JADX INFO: renamed from: k */
    private final AtomicInteger f11557k;

    /* JADX INFO: renamed from: l */
    private final C1241g f11558l;

    /* JADX INFO: renamed from: m */
    private C1214d f11559m;

    /* JADX INFO: renamed from: n */
    private final a f11560n;

    /* JADX INFO: renamed from: o */
    private final ViewTreeObserver.OnGlobalLayoutListener f11561o;

    /* JADX INFO: renamed from: tech.sud.runtime.core.i$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo10402a();
    }

    public C1243i(C1241g c1241g, Context context, a aVar) {
        super(context);
        this.f11548b = false;
        this.f11549c = 0;
        this.f11550d = 0;
        this.f11551e = 0;
        this.f11552f = 0;
        this.f11556j = 0;
        this.f11557k = new AtomicInteger(0);
        this.f11561o = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: tech.sud.runtime.core.i.2

            /* JADX INFO: renamed from: a */
            final Rect f11563a = new Rect();

            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                if ((C1243i.this.f11553g.getAttributes().flags & 512) != 0) {
                    return;
                }
                this.f11563a.setEmpty();
                C1243i.this.f11554h.getWindowVisibleDisplayFrame(this.f11563a);
                int iHeight = this.f11563a.height();
                int i = C1243i.this.f11556j;
                C1243i c1243i = C1243i.this;
                if (i == 0) {
                    c1243i.f11556j = iHeight;
                    C1243i c1243i2 = C1243i.this;
                    c1243i2.f11555i = C1207h.m10192b(c1243i2.getContext());
                    return;
                }
                if (c1243i.f11556j == iHeight) {
                    return;
                }
                boolean zM10192b = C1207h.m10192b(C1243i.this.getContext());
                boolean z = C1243i.this.f11555i;
                C1243i c1243i3 = C1243i.this;
                if (zM10192b != z) {
                    c1243i3.f11556j = iHeight;
                    C1243i.this.f11555i = zM10192b;
                    if (C1243i.this.f11559m != null) {
                        C1243i.this.f11559m.m10260b();
                    }
                    C1243i.this.m10478b(false);
                    return;
                }
                int i2 = c1243i3.f11556j - iHeight;
                C1243i c1243i4 = C1243i.this;
                if (i2 > 200) {
                    c1243i4.m10478b(true);
                } else if (iHeight - c1243i4.f11556j > 200) {
                    C1243i.this.m10478b(false);
                    C1243i.this.f11560n.mo10402a();
                }
                C1243i.this.f11556j = iHeight;
            }
        };
        this.f11558l = c1241g;
        Window window = C1225c.m10314a(context).getWindow();
        this.f11553g = window;
        this.f11554h = window.getDecorView();
        this.f11560n = aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public boolean m10481c() {
        return (this.f11548b || this.f11559m.m10261c() || this.f11557k.get() != 0) ? false : true;
    }

    /* JADX INFO: renamed from: d */
    private void m10483d() {
        if ((this.f11551e == this.f11549c && this.f11552f == this.f11550d) || this.f11547a == null) {
            return;
        }
        post(new Runnable() { // from class: tech.sud.runtime.core.i.1
            @Override // java.lang.Runnable
            public void run() {
                if (C1243i.this.m10481c()) {
                    if ((C1243i.this.f11551e == C1243i.this.f11549c && C1243i.this.f11552f == C1243i.this.f11550d) || C1243i.this.f11547a == null) {
                        return;
                    }
                    C1243i.this.f11547a.setLayoutParams(new FrameLayout.LayoutParams(C1243i.this.f11551e, C1243i.this.f11552f));
                    C1243i c1243i = C1243i.this;
                    c1243i.f11549c = c1243i.f11551e;
                    C1243i c1243i2 = C1243i.this;
                    c1243i2.f11550d = c1243i2.f11552f;
                }
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public void m10493a(View view) {
        this.f11547a = view;
        addView(view);
        getViewTreeObserver().addOnGlobalLayoutListener(this.f11561o);
    }

    /* JADX INFO: renamed from: b */
    public void m10496b() {
        if (m10481c()) {
            m10483d();
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        this.f11551e = i;
        this.f11552f = i2;
        m10496b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public void m10478b(boolean z) {
        this.f11548b = z;
        m10496b();
    }

    /* JADX INFO: renamed from: a */
    public void m10494a(C1214d c1214d) {
        this.f11559m = c1214d;
    }

    /* JADX INFO: renamed from: a */
    public void m10492a() {
        removeView(this.f11547a);
        this.f11547a = null;
    }

    /* JADX INFO: renamed from: a */
    public void m10495a(boolean z) {
        this.f11557k.addAndGet(z ? 1 : -1);
    }
}
