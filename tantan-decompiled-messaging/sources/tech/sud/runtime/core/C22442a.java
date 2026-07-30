package tech.sud.runtime.core;

import android.content.Context;
import android.os.Build;
import android.view.View;
import android.widget.FrameLayout;
import com.tencent.liteav.TXLiteAVCode;
import tech.sud.runtime.component.p138a.C22403a;
import tech.sud.runtime.component.p140c.C22408b;
import tech.sud.runtime.component.p140c.C22413g;
import tech.sud.runtime.component.p140c.C22414h;
import tech.sud.runtime.component.p141d.C22417a;
import tech.sud.runtime.component.p142e.C22419b;
import tech.sud.runtime.component.p142e.C22421d;
import tech.sud.runtime.component.p145h.C22432c;
import tech.sud.runtime.component.p146i.C22437b;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: renamed from: tech.sud.runtime.core.a */
/* JADX INFO: loaded from: classes3.dex */
public class C22442a extends FrameLayout {

    /* JADX INFO: renamed from: a */
    private final C22450i f207846a;

    /* JADX INFO: renamed from: b */
    private final InterfaceC22444c f207847b;

    /* JADX INFO: renamed from: c */
    private final C22421d f207848c;

    /* JADX INFO: renamed from: d */
    private final C22419b f207849d;

    /* JADX INFO: renamed from: e */
    private boolean f207850e;

    /* JADX INFO: renamed from: f */
    private boolean f207851f;

    /* JADX INFO: renamed from: g */
    private boolean f207852g;

    /* JADX INFO: renamed from: h */
    private boolean f207853h;

    /* JADX INFO: renamed from: i */
    private int f207854i;

    /* JADX INFO: renamed from: j */
    private int f207855j;

    /* JADX INFO: renamed from: k */
    private int f207856k;

    /* JADX INFO: renamed from: l */
    private final C22437b f207857l;

    /* JADX INFO: renamed from: m */
    private final C22448g f207858m;

    /* JADX INFO: renamed from: n */
    private C22414h f207859n;

    /* JADX INFO: renamed from: o */
    private C22403a f207860o;

    public C22442a(Context context, int i, C22448g c22448g, boolean z, int i2, String str, C22417a c22417a, Integer num) {
        View view;
        super(context);
        this.f207850e = false;
        this.f207851f = false;
        this.f207852g = true;
        this.f207853h = false;
        this.f207854i = -1;
        this.f207855j = 0;
        this.f207856k = 0;
        this.f207859n = new C22414h();
        this.f207858m = c22448g;
        this.f207851f = (i & 16) != 0;
        int i3 = i & 2;
        this.f207852g = i3 != 0;
        this.f207853h = (i & 64) != 0;
        this.f207850e = (i & 128) != 0;
        C22450i c22450i = new C22450i(c22448g, context, new C22450i.a() { // from class: tech.sud.runtime.core.a.1
            @Override // tech.sud.runtime.core.C22450i.a
            /* JADX INFO: renamed from: a */
            public void mo221931a() {
                C22442a c22442a = C22442a.this;
                c22442a.m221917a(c22442a.getContext());
            }
        });
        this.f207846a = c22450i;
        this.f207857l = new C22437b(c22450i, c22448g);
        if (i3 != 0) {
            C22447f c22447f = new C22447f(c22448g, context);
            c22447f.setOpaque((i & 1) == 0);
            c22447f.setExternalInterface(c22417a);
            this.f207847b = c22447f;
            view = c22447f;
        } else {
            C22446e c22446e = new C22446e(c22448g, context, (i & 1) != 0);
            this.f207847b = c22446e;
            view = c22446e;
        }
        c22450i.m222022a(view);
        C22421d c22421d = new C22421d(context, c22448g);
        this.f207848c = c22421d;
        c22450i.addView(c22421d);
        c22450i.m222023a(c22421d);
        this.f207847b.mo221960a().m221973a(c22421d);
        this.f207860o = new C22403a(context, c22450i, i2, str, z);
        this.f207859n.m221722a(context, c22448g);
        m221921j();
        c22450i.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(c22450i);
        this.f207849d = new C22419b(c22450i, c22448g, num);
    }

    /* JADX INFO: renamed from: a */
    private void m221918a(Context context, boolean z) {
        if (this.f207850e) {
            return;
        }
        View decorView = C22432c.m221843a(context).getWindow().getDecorView();
        int systemUiVisibility = decorView.getSystemUiVisibility();
        boolean z2 = this.f207852g;
        int i = z2 ? TXLiteAVCode.EVT_SW_ENCODER_START_SUCC : 0;
        if (this.f207851f) {
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
    public void m221921j() {
        int i;
        int i2;
        Context context = getContext();
        m221917a(context);
        int i3 = Build.VERSION.SDK_INT;
        C22408b.a aVarM221618a = C22408b.m221618a();
        boolean z = this.f207853h;
        if (z && i3 >= 28 && aVarM221618a == C22408b.a.huawei && !C22413g.m221706d(context)) {
            z = false;
        }
        if (!z && this.f207854i < 0) {
            if (i3 == 26 || i3 == 27) {
                if (aVarM221618a == C22408b.a.oppo) {
                    if (C22413g.m221708f(context)) {
                        this.f207854i = C22413g.m221715m(context);
                    }
                } else if (aVarM221618a == C22408b.a.vivo) {
                    if (C22413g.m221709g(context)) {
                        this.f207854i = C22413g.m221715m(context);
                    }
                } else if (aVarM221618a == C22408b.a.smartisan && C22413g.m221710h(context)) {
                    this.f207854i = C22413g.m221702b();
                }
            } else if (i3 >= 28 && C22413g.m221703b(context)) {
                C22413g.m221716n(context);
            }
        }
        if (this.f207854i > 0 && this.f207856k > 0) {
            C22414h c22414h = this.f207859n;
            c22414h.m221722a(context, this.f207858m);
            if (C22414h.m221721b(context)) {
                if (this.f207856k == c22414h.f207654b) {
                    i2 = this.f207854i;
                    i = 0;
                } else {
                    i = 0;
                    i2 = 0;
                }
            } else if (this.f207855j != c22414h.f207654b || C22408b.m221619b()) {
                i = 0;
                i2 = 0;
            } else {
                i = this.f207854i;
                i2 = 0;
            }
            setPadding(i, i2, 0, 0);
        }
        if (!z) {
            this.f207858m.m221992a(false, 0, 0);
            return;
        }
        if (i3 == 26 || i3 == 27) {
            if (aVarM221618a == C22408b.a.xiaomi) {
                if (C22413g.m221700a() && C22413g.m221707e(context)) {
                    C22413g.m221718p(context);
                }
            } else if (aVarM221618a == C22408b.a.huawei && C22413g.m221705c(context) && C22413g.m221706d(context)) {
                C22413g.m221719q(context);
            }
        } else if (i3 >= 28) {
            C22413g.m221717o(context);
        }
        if (aVarM221618a == C22408b.a.smartisan && !C22414h.m221721b(context)) {
            this.f207858m.m221992a(false, 0, 0);
        } else if (!C22413g.m221701a(context)) {
            this.f207858m.m221992a(false, 0, 0);
        } else {
            int[] iArrM221711i = C22413g.m221711i(context);
            this.f207858m.m221992a(true, iArrM221711i[0], iArrM221711i[1]);
        }
    }

    /* JADX INFO: renamed from: b */
    public C22421d m221923b() {
        return this.f207848c;
    }

    /* JADX INFO: renamed from: c */
    public C22450i m221924c() {
        return this.f207846a;
    }

    /* JADX INFO: renamed from: d */
    public C22419b m221925d() {
        return this.f207849d;
    }

    /* JADX INFO: renamed from: e */
    public InterfaceC22444c m221926e() {
        return this.f207847b;
    }

    /* JADX INFO: renamed from: f */
    public void m221927f() {
        m221917a(getContext());
        this.f207847b.onResume();
    }

    /* JADX INFO: renamed from: g */
    public void m221928g() {
        this.f207847b.onPause();
    }

    /* JADX INFO: renamed from: h */
    public void m221929h() {
        this.f207847b.mo221960a().m221970a();
        this.f207857l.m221869a();
        this.f207846a.m222021a();
        C22403a c22403a = this.f207860o;
        if (c22403a != null) {
            c22403a.m221595a();
            this.f207860o = null;
        }
        this.f207848c.m221785a();
        this.f207849d.m221775a();
    }

    /* JADX INFO: renamed from: i */
    public C22403a m221930i() {
        return this.f207860o;
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        if (i == this.f207855j && i2 == this.f207856k) {
            return;
        }
        this.f207855j = i;
        this.f207856k = i2;
        post(new Runnable() { // from class: tech.sud.runtime.core.a.2
            @Override // java.lang.Runnable
            public void run() {
                C22442a.this.m221921j();
            }
        });
        super.onSizeChanged(i, i2, i3, i4);
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z) {
            m221917a(getContext());
        }
    }

    /* JADX INFO: renamed from: a */
    public C22437b m221922a() {
        return this.f207857l;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m221917a(Context context) {
        m221918a(context, false);
    }
}
