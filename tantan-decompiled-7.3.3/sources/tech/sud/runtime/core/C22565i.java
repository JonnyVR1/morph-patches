package tech.sud.runtime.core;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.widget.FrameLayout;
import java.util.concurrent.atomic.AtomicInteger;
import tech.sud.runtime.component.p144c.C22529h;
import tech.sud.runtime.component.p146e.C22536d;
import tech.sud.runtime.component.p149h.C22547c;

/* JADX INFO: renamed from: tech.sud.runtime.core.i */
/* JADX INFO: loaded from: classes3.dex */
class C22565i extends FrameLayout {

    /* JADX INFO: renamed from: a */
    private View f208844a;

    /* JADX INFO: renamed from: b */
    private boolean f208845b;

    /* JADX INFO: renamed from: c */
    private int f208846c;

    /* JADX INFO: renamed from: d */
    private int f208847d;

    /* JADX INFO: renamed from: e */
    private int f208848e;

    /* JADX INFO: renamed from: f */
    private int f208849f;

    /* JADX INFO: renamed from: g */
    private final Window f208850g;

    /* JADX INFO: renamed from: h */
    private final View f208851h;

    /* JADX INFO: renamed from: i */
    private boolean f208852i;

    /* JADX INFO: renamed from: j */
    private int f208853j;

    /* JADX INFO: renamed from: k */
    private final AtomicInteger f208854k;

    /* JADX INFO: renamed from: l */
    private final C22563g f208855l;

    /* JADX INFO: renamed from: m */
    private C22536d f208856m;

    /* JADX INFO: renamed from: n */
    private final a f208857n;

    /* JADX INFO: renamed from: o */
    private final ViewTreeObserver.OnGlobalLayoutListener f208858o;

    /* JADX INFO: renamed from: tech.sud.runtime.core.i$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo223177a();
    }

    public C22565i(C22563g c22563g, Context context, a aVar) {
        super(context);
        this.f208845b = false;
        this.f208846c = 0;
        this.f208847d = 0;
        this.f208848e = 0;
        this.f208849f = 0;
        this.f208853j = 0;
        this.f208854k = new AtomicInteger(0);
        this.f208858o = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: tech.sud.runtime.core.i.2

            /* JADX INFO: renamed from: a */
            final Rect f208860a = new Rect();

            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                if ((C22565i.this.f208850g.getAttributes().flags & 512) != 0) {
                    return;
                }
                this.f208860a.setEmpty();
                C22565i.this.f208851h.getWindowVisibleDisplayFrame(this.f208860a);
                int iHeight = this.f208860a.height();
                int i = C22565i.this.f208853j;
                C22565i c22565i = C22565i.this;
                if (i == 0) {
                    c22565i.f208853j = iHeight;
                    C22565i c22565i2 = C22565i.this;
                    c22565i2.f208852i = C22529h.m222967b(c22565i2.getContext());
                    return;
                }
                if (c22565i.f208853j == iHeight) {
                    return;
                }
                boolean zM222967b = C22529h.m222967b(C22565i.this.getContext());
                boolean z = C22565i.this.f208852i;
                C22565i c22565i3 = C22565i.this;
                if (zM222967b != z) {
                    c22565i3.f208853j = iHeight;
                    C22565i.this.f208852i = zM222967b;
                    if (C22565i.this.f208856m != null) {
                        C22565i.this.f208856m.m223035b();
                    }
                    C22565i.this.m223253b(false);
                    return;
                }
                int i2 = c22565i3.f208853j - iHeight;
                C22565i c22565i4 = C22565i.this;
                if (i2 > 200) {
                    c22565i4.m223253b(true);
                } else if (iHeight - c22565i4.f208853j > 200) {
                    C22565i.this.m223253b(false);
                    C22565i.this.f208857n.mo223177a();
                }
                C22565i.this.f208853j = iHeight;
            }
        };
        this.f208855l = c22563g;
        Window window = C22547c.m223089a(context).getWindow();
        this.f208850g = window;
        this.f208851h = window.getDecorView();
        this.f208857n = aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public boolean m223256c() {
        return (this.f208845b || this.f208856m.m223036c() || this.f208854k.get() != 0) ? false : true;
    }

    /* JADX INFO: renamed from: d */
    private void m223258d() {
        if ((this.f208848e == this.f208846c && this.f208849f == this.f208847d) || this.f208844a == null) {
            return;
        }
        post(new Runnable() { // from class: tech.sud.runtime.core.i.1
            @Override // java.lang.Runnable
            public void run() {
                if (C22565i.this.m223256c()) {
                    if ((C22565i.this.f208848e == C22565i.this.f208846c && C22565i.this.f208849f == C22565i.this.f208847d) || C22565i.this.f208844a == null) {
                        return;
                    }
                    C22565i.this.f208844a.setLayoutParams(new FrameLayout.LayoutParams(C22565i.this.f208848e, C22565i.this.f208849f));
                    C22565i c22565i = C22565i.this;
                    c22565i.f208846c = c22565i.f208848e;
                    C22565i c22565i2 = C22565i.this;
                    c22565i2.f208847d = c22565i2.f208849f;
                }
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public void m223268a(View view) {
        this.f208844a = view;
        addView(view);
        getViewTreeObserver().addOnGlobalLayoutListener(this.f208858o);
    }

    /* JADX INFO: renamed from: b */
    public void m223271b() {
        if (m223256c()) {
            m223258d();
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        this.f208848e = i;
        this.f208849f = i2;
        m223271b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public void m223253b(boolean z) {
        this.f208845b = z;
        m223271b();
    }

    /* JADX INFO: renamed from: a */
    public void m223269a(C22536d c22536d) {
        this.f208856m = c22536d;
    }

    /* JADX INFO: renamed from: a */
    public void m223267a() {
        removeView(this.f208844a);
        this.f208844a = null;
    }

    /* JADX INFO: renamed from: a */
    public void m223270a(boolean z) {
        this.f208854k.addAndGet(z ? 1 : -1);
    }
}
