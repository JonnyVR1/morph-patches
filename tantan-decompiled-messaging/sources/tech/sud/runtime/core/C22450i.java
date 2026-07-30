package tech.sud.runtime.core;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.widget.FrameLayout;
import java.util.concurrent.atomic.AtomicInteger;
import tech.sud.runtime.component.p140c.C22414h;
import tech.sud.runtime.component.p142e.C22421d;
import tech.sud.runtime.component.p145h.C22432c;

/* JADX INFO: renamed from: tech.sud.runtime.core.i */
/* JADX INFO: loaded from: classes3.dex */
class C22450i extends FrameLayout {

    /* JADX INFO: renamed from: a */
    private View f207922a;

    /* JADX INFO: renamed from: b */
    private boolean f207923b;

    /* JADX INFO: renamed from: c */
    private int f207924c;

    /* JADX INFO: renamed from: d */
    private int f207925d;

    /* JADX INFO: renamed from: e */
    private int f207926e;

    /* JADX INFO: renamed from: f */
    private int f207927f;

    /* JADX INFO: renamed from: g */
    private final Window f207928g;

    /* JADX INFO: renamed from: h */
    private final View f207929h;

    /* JADX INFO: renamed from: i */
    private boolean f207930i;

    /* JADX INFO: renamed from: j */
    private int f207931j;

    /* JADX INFO: renamed from: k */
    private final AtomicInteger f207932k;

    /* JADX INFO: renamed from: l */
    private final C22448g f207933l;

    /* JADX INFO: renamed from: m */
    private C22421d f207934m;

    /* JADX INFO: renamed from: n */
    private final a f207935n;

    /* JADX INFO: renamed from: o */
    private final ViewTreeObserver.OnGlobalLayoutListener f207936o;

    /* JADX INFO: renamed from: tech.sud.runtime.core.i$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo221931a();
    }

    public C22450i(C22448g c22448g, Context context, a aVar) {
        super(context);
        this.f207923b = false;
        this.f207924c = 0;
        this.f207925d = 0;
        this.f207926e = 0;
        this.f207927f = 0;
        this.f207931j = 0;
        this.f207932k = new AtomicInteger(0);
        this.f207936o = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: tech.sud.runtime.core.i.2

            /* JADX INFO: renamed from: a */
            final Rect f207938a = new Rect();

            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                if ((C22450i.this.f207928g.getAttributes().flags & 512) != 0) {
                    return;
                }
                this.f207938a.setEmpty();
                C22450i.this.f207929h.getWindowVisibleDisplayFrame(this.f207938a);
                int iHeight = this.f207938a.height();
                int i = C22450i.this.f207931j;
                C22450i c22450i = C22450i.this;
                if (i == 0) {
                    c22450i.f207931j = iHeight;
                    C22450i c22450i2 = C22450i.this;
                    c22450i2.f207930i = C22414h.m221721b(c22450i2.getContext());
                    return;
                }
                if (c22450i.f207931j == iHeight) {
                    return;
                }
                boolean zM221721b = C22414h.m221721b(C22450i.this.getContext());
                boolean z = C22450i.this.f207930i;
                C22450i c22450i3 = C22450i.this;
                if (zM221721b != z) {
                    c22450i3.f207931j = iHeight;
                    C22450i.this.f207930i = zM221721b;
                    if (C22450i.this.f207934m != null) {
                        C22450i.this.f207934m.m221789b();
                    }
                    C22450i.this.m222007b(false);
                    return;
                }
                int i2 = c22450i3.f207931j - iHeight;
                C22450i c22450i4 = C22450i.this;
                if (i2 > 200) {
                    c22450i4.m222007b(true);
                } else if (iHeight - c22450i4.f207931j > 200) {
                    C22450i.this.m222007b(false);
                    C22450i.this.f207935n.mo221931a();
                }
                C22450i.this.f207931j = iHeight;
            }
        };
        this.f207933l = c22448g;
        Window window = C22432c.m221843a(context).getWindow();
        this.f207928g = window;
        this.f207929h = window.getDecorView();
        this.f207935n = aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public boolean m222010c() {
        return (this.f207923b || this.f207934m.m221790c() || this.f207932k.get() != 0) ? false : true;
    }

    /* JADX INFO: renamed from: d */
    private void m222012d() {
        if ((this.f207926e == this.f207924c && this.f207927f == this.f207925d) || this.f207922a == null) {
            return;
        }
        post(new Runnable() { // from class: tech.sud.runtime.core.i.1
            @Override // java.lang.Runnable
            public void run() {
                if (C22450i.this.m222010c()) {
                    if ((C22450i.this.f207926e == C22450i.this.f207924c && C22450i.this.f207927f == C22450i.this.f207925d) || C22450i.this.f207922a == null) {
                        return;
                    }
                    C22450i.this.f207922a.setLayoutParams(new FrameLayout.LayoutParams(C22450i.this.f207926e, C22450i.this.f207927f));
                    C22450i c22450i = C22450i.this;
                    c22450i.f207924c = c22450i.f207926e;
                    C22450i c22450i2 = C22450i.this;
                    c22450i2.f207925d = c22450i2.f207927f;
                }
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public void m222022a(View view) {
        this.f207922a = view;
        addView(view);
        getViewTreeObserver().addOnGlobalLayoutListener(this.f207936o);
    }

    /* JADX INFO: renamed from: b */
    public void m222025b() {
        if (m222010c()) {
            m222012d();
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        this.f207926e = i;
        this.f207927f = i2;
        m222025b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public void m222007b(boolean z) {
        this.f207923b = z;
        m222025b();
    }

    /* JADX INFO: renamed from: a */
    public void m222023a(C22421d c22421d) {
        this.f207934m = c22421d;
    }

    /* JADX INFO: renamed from: a */
    public void m222021a() {
        removeView(this.f207922a);
        this.f207922a = null;
    }

    /* JADX INFO: renamed from: a */
    public void m222024a(boolean z) {
        this.f207932k.addAndGet(z ? 1 : -1);
    }
}
