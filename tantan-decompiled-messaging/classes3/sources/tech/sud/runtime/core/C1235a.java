package tech.sud.runtime.core;

import android.content.Context;
import android.os.Build;
import android.view.View;
import android.widget.FrameLayout;
import tech.sud.runtime.component.p019a.C1196a;
import tech.sud.runtime.component.p021c.C1201b;
import tech.sud.runtime.component.p021c.C1206g;
import tech.sud.runtime.component.p021c.C1207h;
import tech.sud.runtime.component.p022d.C1210a;
import tech.sud.runtime.component.p023e.C1212b;
import tech.sud.runtime.component.p023e.C1214d;
import tech.sud.runtime.component.p026h.C1225c;
import tech.sud.runtime.component.p027i.C1230b;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: renamed from: tech.sud.runtime.core.a */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class C1235a extends FrameLayout {

    /* JADX INFO: renamed from: a */
    private final C1243i f11471a;

    /* JADX INFO: renamed from: b */
    private final InterfaceC1237c f11472b;

    /* JADX INFO: renamed from: c */
    private final C1214d f11473c;

    /* JADX INFO: renamed from: d */
    private final C1212b f11474d;

    /* JADX INFO: renamed from: e */
    private boolean f11475e;

    /* JADX INFO: renamed from: f */
    private boolean f11476f;

    /* JADX INFO: renamed from: g */
    private boolean f11477g;

    /* JADX INFO: renamed from: h */
    private boolean f11478h;

    /* JADX INFO: renamed from: i */
    private int f11479i;

    /* JADX INFO: renamed from: j */
    private int f11480j;

    /* JADX INFO: renamed from: k */
    private int f11481k;

    /* JADX INFO: renamed from: l */
    private final C1230b f11482l;

    /* JADX INFO: renamed from: m */
    private final C1241g f11483m;

    /* JADX INFO: renamed from: n */
    private C1207h f11484n;

    /* JADX INFO: renamed from: o */
    private C1196a f11485o;

    public C1235a(Context context, int i, C1241g c1241g, boolean z, int i2, String str, C1210a c1210a, Integer num) {
        View view;
        super(context);
        this.f11475e = false;
        this.f11476f = false;
        this.f11477g = true;
        this.f11478h = false;
        this.f11479i = -1;
        this.f11480j = 0;
        this.f11481k = 0;
        this.f11484n = new C1207h();
        this.f11483m = c1241g;
        this.f11476f = (i & 16) != 0;
        int i3 = i & 2;
        this.f11477g = i3 != 0;
        this.f11478h = (i & 64) != 0;
        this.f11475e = (i & 128) != 0;
        C1243i c1243i = new C1243i(c1241g, context, new C1243i.a() { // from class: tech.sud.runtime.core.a.1
            @Override // tech.sud.runtime.core.C1243i.a
            /* JADX INFO: renamed from: a */
            public void mo10402a() {
                C1235a c1235a = C1235a.this;
                c1235a.m10388a(c1235a.getContext());
            }
        });
        this.f11471a = c1243i;
        this.f11482l = new C1230b(c1243i, c1241g);
        if (i3 != 0) {
            C1240f c1240f = new C1240f(c1241g, context);
            c1240f.setOpaque((i & 1) == 0);
            c1240f.setExternalInterface(c1210a);
            this.f11472b = c1240f;
            view = c1240f;
        } else {
            C1239e c1239e = new C1239e(c1241g, context, (i & 1) != 0);
            this.f11472b = c1239e;
            view = c1239e;
        }
        c1243i.m10493a(view);
        C1214d c1214d = new C1214d(context, c1241g);
        this.f11473c = c1214d;
        c1243i.addView(c1214d);
        c1243i.m10494a(c1214d);
        this.f11472b.mo10431a().m10444a(c1214d);
        this.f11485o = new C1196a(context, c1243i, i2, str, z);
        this.f11484n.m10193a(context, c1241g);
        m10392j();
        c1243i.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(c1243i);
        this.f11474d = new C1212b(c1243i, c1241g, num);
    }

    /* JADX INFO: renamed from: a */
    private void m10389a(Context context, boolean z) {
        if (this.f11475e) {
            return;
        }
        View decorView = C1225c.m10314a(context).getWindow().getDecorView();
        int systemUiVisibility = decorView.getSystemUiVisibility();
        boolean z2 = this.f11477g;
        int i = z2 ? 1028 : 0;
        if (this.f11476f) {
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
    public void m10392j() {
        int i;
        int i2;
        Context context = getContext();
        m10388a(context);
        int i3 = Build.VERSION.SDK_INT;
        C1201b.a aVarM10089a = C1201b.m10089a();
        boolean z = this.f11478h;
        if (z && i3 >= 28 && aVarM10089a == C1201b.a.huawei && !C1206g.m10177d(context)) {
            z = false;
        }
        if (!z && this.f11479i < 0) {
            if (i3 == 26 || i3 == 27) {
                if (aVarM10089a == C1201b.a.oppo) {
                    if (C1206g.m10179f(context)) {
                        this.f11479i = C1206g.m10186m(context);
                    }
                } else if (aVarM10089a == C1201b.a.vivo) {
                    if (C1206g.m10180g(context)) {
                        this.f11479i = C1206g.m10186m(context);
                    }
                } else if (aVarM10089a == C1201b.a.smartisan && C1206g.m10181h(context)) {
                    this.f11479i = C1206g.m10173b();
                }
            } else if (i3 >= 28 && C1206g.m10174b(context)) {
                C1206g.m10187n(context);
            }
        }
        if (this.f11479i > 0 && this.f11481k > 0) {
            C1207h c1207h = this.f11484n;
            c1207h.m10193a(context, this.f11483m);
            if (C1207h.m10192b(context)) {
                if (this.f11481k == c1207h.f11279b) {
                    i2 = this.f11479i;
                    i = 0;
                } else {
                    i = 0;
                    i2 = 0;
                }
            } else if (this.f11480j != c1207h.f11279b || C1201b.m10090b()) {
                i = 0;
                i2 = 0;
            } else {
                i = this.f11479i;
                i2 = 0;
            }
            setPadding(i, i2, 0, 0);
        }
        if (!z) {
            this.f11483m.m10463a(false, 0, 0);
            return;
        }
        if (i3 == 26 || i3 == 27) {
            if (aVarM10089a == C1201b.a.xiaomi) {
                if (C1206g.m10171a() && C1206g.m10178e(context)) {
                    C1206g.m10189p(context);
                }
            } else if (aVarM10089a == C1201b.a.huawei && C1206g.m10176c(context) && C1206g.m10177d(context)) {
                C1206g.m10190q(context);
            }
        } else if (i3 >= 28) {
            C1206g.m10188o(context);
        }
        if (aVarM10089a == C1201b.a.smartisan && !C1207h.m10192b(context)) {
            this.f11483m.m10463a(false, 0, 0);
        } else if (!C1206g.m10172a(context)) {
            this.f11483m.m10463a(false, 0, 0);
        } else {
            int[] iArrM10182i = C1206g.m10182i(context);
            this.f11483m.m10463a(true, iArrM10182i[0], iArrM10182i[1]);
        }
    }

    /* JADX INFO: renamed from: b */
    public C1214d m10394b() {
        return this.f11473c;
    }

    /* JADX INFO: renamed from: c */
    public C1243i m10395c() {
        return this.f11471a;
    }

    /* JADX INFO: renamed from: d */
    public C1212b m10396d() {
        return this.f11474d;
    }

    /* JADX INFO: renamed from: e */
    public InterfaceC1237c m10397e() {
        return this.f11472b;
    }

    /* JADX INFO: renamed from: f */
    public void m10398f() {
        m10388a(getContext());
        this.f11472b.onResume();
    }

    /* JADX INFO: renamed from: g */
    public void m10399g() {
        this.f11472b.onPause();
    }

    /* JADX INFO: renamed from: h */
    public void m10400h() {
        this.f11472b.mo10431a().m10441a();
        this.f11482l.m10340a();
        this.f11471a.m10492a();
        C1196a c1196a = this.f11485o;
        if (c1196a != null) {
            c1196a.m10066a();
            this.f11485o = null;
        }
        this.f11473c.m10256a();
        this.f11474d.m10246a();
    }

    /* JADX INFO: renamed from: i */
    public C1196a m10401i() {
        return this.f11485o;
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        if (i == this.f11480j && i2 == this.f11481k) {
            return;
        }
        this.f11480j = i;
        this.f11481k = i2;
        post(new Runnable() { // from class: tech.sud.runtime.core.a.2
            @Override // java.lang.Runnable
            public void run() {
                C1235a.this.m10392j();
            }
        });
        super.onSizeChanged(i, i2, i3, i4);
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z) {
            m10388a(getContext());
        }
    }

    /* JADX INFO: renamed from: a */
    public C1230b m10393a() {
        return this.f11482l;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m10388a(Context context) {
        m10389a(context, false);
    }
}
