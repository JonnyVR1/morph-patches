package tech.sud.runtime.core;

import android.content.Context;
import android.os.Build;
import android.view.View;
import android.widget.FrameLayout;
import com.tencent.liteav.TXLiteAVCode;
import tech.sud.runtime.component.p142a.C22518a;
import tech.sud.runtime.component.p144c.C22523b;
import tech.sud.runtime.component.p144c.C22528g;
import tech.sud.runtime.component.p144c.C22529h;
import tech.sud.runtime.component.p145d.C22532a;
import tech.sud.runtime.component.p146e.C22534b;
import tech.sud.runtime.component.p146e.C22536d;
import tech.sud.runtime.component.p149h.C22547c;
import tech.sud.runtime.component.p150i.C22552b;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: renamed from: tech.sud.runtime.core.a */
/* JADX INFO: loaded from: classes3.dex */
public class C22557a extends FrameLayout {

    /* JADX INFO: renamed from: a */
    private final C22565i f208768a;

    /* JADX INFO: renamed from: b */
    private final InterfaceC22559c f208769b;

    /* JADX INFO: renamed from: c */
    private final C22536d f208770c;

    /* JADX INFO: renamed from: d */
    private final C22534b f208771d;

    /* JADX INFO: renamed from: e */
    private boolean f208772e;

    /* JADX INFO: renamed from: f */
    private boolean f208773f;

    /* JADX INFO: renamed from: g */
    private boolean f208774g;

    /* JADX INFO: renamed from: h */
    private boolean f208775h;

    /* JADX INFO: renamed from: i */
    private int f208776i;

    /* JADX INFO: renamed from: j */
    private int f208777j;

    /* JADX INFO: renamed from: k */
    private int f208778k;

    /* JADX INFO: renamed from: l */
    private final C22552b f208779l;

    /* JADX INFO: renamed from: m */
    private final C22563g f208780m;

    /* JADX INFO: renamed from: n */
    private C22529h f208781n;

    /* JADX INFO: renamed from: o */
    private C22518a f208782o;

    public C22557a(Context context, int i, C22563g c22563g, boolean z, int i2, String str, C22532a c22532a, Integer num) {
        View view;
        super(context);
        this.f208772e = false;
        this.f208773f = false;
        this.f208774g = true;
        this.f208775h = false;
        this.f208776i = -1;
        this.f208777j = 0;
        this.f208778k = 0;
        this.f208781n = new C22529h();
        this.f208780m = c22563g;
        this.f208773f = (i & 16) != 0;
        int i3 = i & 2;
        this.f208774g = i3 != 0;
        this.f208775h = (i & 64) != 0;
        this.f208772e = (i & 128) != 0;
        C22565i c22565i = new C22565i(c22563g, context, new C22565i.a() { // from class: tech.sud.runtime.core.a.1
            @Override // tech.sud.runtime.core.C22565i.a
            /* JADX INFO: renamed from: a */
            public void mo223177a() {
                C22557a c22557a = C22557a.this;
                c22557a.m223163a(c22557a.getContext());
            }
        });
        this.f208768a = c22565i;
        this.f208779l = new C22552b(c22565i, c22563g);
        if (i3 != 0) {
            C22562f c22562f = new C22562f(c22563g, context);
            c22562f.setOpaque((i & 1) == 0);
            c22562f.setExternalInterface(c22532a);
            this.f208769b = c22562f;
            view = c22562f;
        } else {
            C22561e c22561e = new C22561e(c22563g, context, (i & 1) != 0);
            this.f208769b = c22561e;
            view = c22561e;
        }
        c22565i.m223268a(view);
        C22536d c22536d = new C22536d(context, c22563g);
        this.f208770c = c22536d;
        c22565i.addView(c22536d);
        c22565i.m223269a(c22536d);
        this.f208769b.mo223206a().m223219a(c22536d);
        this.f208782o = new C22518a(context, c22565i, i2, str, z);
        this.f208781n.m222968a(context, c22563g);
        m223167j();
        c22565i.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(c22565i);
        this.f208771d = new C22534b(c22565i, c22563g, num);
    }

    /* JADX INFO: renamed from: a */
    private void m223164a(Context context, boolean z) {
        if (this.f208772e) {
            return;
        }
        View decorView = C22547c.m223089a(context).getWindow().getDecorView();
        int systemUiVisibility = decorView.getSystemUiVisibility();
        boolean z2 = this.f208774g;
        int i = z2 ? TXLiteAVCode.EVT_SW_ENCODER_START_SUCC : 0;
        if (this.f208773f) {
            i = z2 ? i | 4866 : i | 4098;
        }
        if (systemUiVisibility == i) {
            return;
        }
        decorView.setSystemUiVisibility(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:50:0x009e  */
    /* JADX INFO: renamed from: j */
    public void m223167j() {
        int i;
        int i2;
        Context context = getContext();
        m223163a(context);
        int i3 = Build.VERSION.SDK_INT;
        C22523b.a aVarM222864a = C22523b.m222864a();
        boolean z = this.f208775h;
        if (z && i3 >= 28 && aVarM222864a == C22523b.a.huawei && !C22528g.m222952d(context)) {
            z = false;
        }
        if (!z && this.f208776i < 0) {
            if (i3 == 26 || i3 == 27) {
                if (aVarM222864a == C22523b.a.oppo) {
                    if (C22528g.m222954f(context)) {
                        this.f208776i = C22528g.m222961m(context);
                    }
                } else if (aVarM222864a == C22523b.a.vivo) {
                    if (C22528g.m222955g(context)) {
                        this.f208776i = C22528g.m222961m(context);
                    }
                } else if (aVarM222864a == C22523b.a.smartisan && C22528g.m222956h(context)) {
                    this.f208776i = C22528g.m222948b();
                }
            } else if (i3 >= 28 && C22528g.m222949b(context)) {
                C22528g.m222962n(context);
            }
        }
        if (this.f208776i > 0 && this.f208778k > 0) {
            C22529h c22529h = this.f208781n;
            c22529h.m222968a(context, this.f208780m);
            if (C22529h.m222967b(context)) {
                if (this.f208778k == c22529h.f208576b) {
                    i2 = this.f208776i;
                    i = 0;
                } else {
                    i = 0;
                    i2 = 0;
                }
            } else if (this.f208777j != c22529h.f208576b || C22523b.m222865b()) {
                i = 0;
                i2 = 0;
            } else {
                i = this.f208776i;
                i2 = 0;
            }
            setPadding(i, i2, 0, 0);
        }
        if (!z) {
            this.f208780m.m223238a(false, 0, 0);
            return;
        }
        if (i3 == 26 || i3 == 27) {
            if (aVarM222864a == C22523b.a.xiaomi) {
                if (C22528g.m222946a() && C22528g.m222953e(context)) {
                    C22528g.m222964p(context);
                }
            } else if (aVarM222864a == C22523b.a.huawei && C22528g.m222951c(context) && C22528g.m222952d(context)) {
                C22528g.m222965q(context);
            }
        } else if (i3 >= 28) {
            C22528g.m222963o(context);
        }
        if (aVarM222864a == C22523b.a.smartisan && !C22529h.m222967b(context)) {
            this.f208780m.m223238a(false, 0, 0);
        } else if (!C22528g.m222947a(context)) {
            this.f208780m.m223238a(false, 0, 0);
        } else {
            int[] iArrM222957i = C22528g.m222957i(context);
            this.f208780m.m223238a(true, iArrM222957i[0], iArrM222957i[1]);
        }
    }

    /* JADX INFO: renamed from: b */
    public C22536d m223169b() {
        return this.f208770c;
    }

    /* JADX INFO: renamed from: c */
    public C22565i m223170c() {
        return this.f208768a;
    }

    /* JADX INFO: renamed from: d */
    public C22534b m223171d() {
        return this.f208771d;
    }

    /* JADX INFO: renamed from: e */
    public InterfaceC22559c m223172e() {
        return this.f208769b;
    }

    /* JADX INFO: renamed from: f */
    public void m223173f() {
        m223163a(getContext());
        this.f208769b.onResume();
    }

    /* JADX INFO: renamed from: g */
    public void m223174g() {
        this.f208769b.onPause();
    }

    /* JADX INFO: renamed from: h */
    public void m223175h() {
        this.f208769b.mo223206a().m223216a();
        this.f208779l.m223115a();
        this.f208768a.m223267a();
        C22518a c22518a = this.f208782o;
        if (c22518a != null) {
            c22518a.m222841a();
            this.f208782o = null;
        }
        this.f208770c.m223031a();
        this.f208771d.m223021a();
    }

    /* JADX INFO: renamed from: i */
    public C22518a m223176i() {
        return this.f208782o;
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        if (i == this.f208777j && i2 == this.f208778k) {
            return;
        }
        this.f208777j = i;
        this.f208778k = i2;
        post(new Runnable() { // from class: tech.sud.runtime.core.a.2
            @Override // java.lang.Runnable
            public void run() {
                C22557a.this.m223167j();
            }
        });
        super.onSizeChanged(i, i2, i3, i4);
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z) {
            m223163a(getContext());
        }
    }

    /* JADX INFO: renamed from: a */
    public C22552b m223168a() {
        return this.f208779l;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m223163a(Context context) {
        m223164a(context, false);
    }
}
