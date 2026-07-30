package p153l;

import android.app.Activity;
import android.graphics.Bitmap;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import com.google.android.gms.ads.internal.util.C2098b;
import com.google.android.gms.common.util.CollectionUtils;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public final class m0t0 extends s0t0 {

    /* JADX INFO: renamed from: u */
    public static final Set f134334u = CollectionUtils.setOf("top-left", "top-right", "top-center", "center", "bottom-left", "bottom-right", "bottom-center");

    /* JADX INFO: renamed from: c */
    public String f134335c;

    /* JADX INFO: renamed from: d */
    public boolean f134336d;

    /* JADX INFO: renamed from: e */
    public int f134337e;

    /* JADX INFO: renamed from: f */
    public int f134338f;

    /* JADX INFO: renamed from: g */
    public int f134339g;

    /* JADX INFO: renamed from: h */
    public int f134340h;

    /* JADX INFO: renamed from: i */
    public int f134341i;

    /* JADX INFO: renamed from: j */
    public int f134342j;

    /* JADX INFO: renamed from: k */
    public final Object f134343k;

    /* JADX INFO: renamed from: l */
    public final wit0 f134344l;

    /* JADX INFO: renamed from: m */
    public final Activity f134345m;

    /* JADX INFO: renamed from: n */
    public xkt0 f134346n;

    /* JADX INFO: renamed from: o */
    public ImageView f134347o;

    /* JADX INFO: renamed from: p */
    public LinearLayout f134348p;

    /* JADX INFO: renamed from: q */
    public final t0t0 f134349q;

    /* JADX INFO: renamed from: r */
    public PopupWindow f134350r;

    /* JADX INFO: renamed from: s */
    public RelativeLayout f134351s;

    /* JADX INFO: renamed from: t */
    public ViewGroup f134352t;

    public m0t0(wit0 wit0Var, t0t0 t0t0Var) {
        super(wit0Var, "resize");
        this.f134335c = "top-right";
        this.f134336d = true;
        this.f134337e = 0;
        this.f134338f = 0;
        this.f134339g = -1;
        this.f134340h = 0;
        this.f134341i = 0;
        this.f134342j = -1;
        this.f134343k = new Object();
        this.f134344l = wit0Var;
        this.f134345m = wit0Var.zzi();
        this.f134349q = t0t0Var;
    }

    /* JADX INFO: renamed from: h */
    public final void m156534h(final boolean z) {
        synchronized (this.f134343k) {
            try {
                if (this.f134350r != null) {
                    if (!((Boolean) jas0.m144075c().m176505a(sgs0.f168433pa)).booleanValue() || Looper.getMainLooper().getThread() == Thread.currentThread()) {
                        m156536j(z);
                    } else {
                        oct0.f146737e.mo155970a(new Runnable() { // from class: l.k0t0
                            @Override // java.lang.Runnable
                            public final void run() {
                                this.f123426a.m156536j(z);
                            }
                        });
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:161:0x0384 A[Catch: all -> 0x0014, TryCatch #1 {all -> 0x0014, blocks: (B:4:0x0009, B:6:0x000d, B:7:0x0012, B:11:0x0017, B:13:0x001f, B:14:0x0024, B:16:0x0026, B:18:0x0032, B:19:0x0037, B:21:0x0039, B:23:0x0041, B:24:0x0046, B:26:0x0048, B:28:0x0056, B:29:0x0067, B:31:0x0075, B:32:0x0086, B:34:0x0094, B:35:0x00a5, B:37:0x00b3, B:38:0x00c4, B:40:0x00d2, B:41:0x00e0, B:43:0x00ee, B:44:0x00f0, B:46:0x00f4, B:48:0x00f8, B:50:0x0100, B:53:0x0108, B:57:0x012b, B:63:0x0137, B:122:0x0245, B:123:0x024a, B:125:0x024c, B:127:0x026c, B:129:0x0270, B:131:0x027d, B:133:0x02b9, B:139:0x0333, B:162:0x038a, B:163:0x03a2, B:164:0x03c1, B:166:0x03c9, B:167:0x03d0, B:168:0x03f5, B:171:0x03f8, B:173:0x0418, B:174:0x042d, B:143:0x0342, B:147:0x0351, B:151:0x0360, B:155:0x036f, B:160:0x0380, B:161:0x0384, B:132:0x02b6, B:176:0x042f, B:177:0x0434, B:64:0x013e, B:66:0x0142, B:71:0x0155, B:96:0x01d8, B:98:0x01dd, B:100:0x01e0, B:102:0x01e4, B:105:0x01ea, B:76:0x016d, B:82:0x0190, B:81:0x0186, B:86:0x019b, B:90:0x01ab, B:94:0x01bb, B:95:0x01ce, B:106:0x01f9, B:112:0x0223, B:118:0x0233, B:115:0x0229, B:117:0x0231, B:109:0x021b, B:111:0x0221, B:119:0x0238, B:120:0x023e, B:179:0x0436, B:180:0x043b, B:182:0x043d, B:183:0x0442), top: B:189:0x0009, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:95:0x01ce A[Catch: all -> 0x0014, TryCatch #1 {all -> 0x0014, blocks: (B:4:0x0009, B:6:0x000d, B:7:0x0012, B:11:0x0017, B:13:0x001f, B:14:0x0024, B:16:0x0026, B:18:0x0032, B:19:0x0037, B:21:0x0039, B:23:0x0041, B:24:0x0046, B:26:0x0048, B:28:0x0056, B:29:0x0067, B:31:0x0075, B:32:0x0086, B:34:0x0094, B:35:0x00a5, B:37:0x00b3, B:38:0x00c4, B:40:0x00d2, B:41:0x00e0, B:43:0x00ee, B:44:0x00f0, B:46:0x00f4, B:48:0x00f8, B:50:0x0100, B:53:0x0108, B:57:0x012b, B:63:0x0137, B:122:0x0245, B:123:0x024a, B:125:0x024c, B:127:0x026c, B:129:0x0270, B:131:0x027d, B:133:0x02b9, B:139:0x0333, B:162:0x038a, B:163:0x03a2, B:164:0x03c1, B:166:0x03c9, B:167:0x03d0, B:168:0x03f5, B:171:0x03f8, B:173:0x0418, B:174:0x042d, B:143:0x0342, B:147:0x0351, B:151:0x0360, B:155:0x036f, B:160:0x0380, B:161:0x0384, B:132:0x02b6, B:176:0x042f, B:177:0x0434, B:64:0x013e, B:66:0x0142, B:71:0x0155, B:96:0x01d8, B:98:0x01dd, B:100:0x01e0, B:102:0x01e4, B:105:0x01ea, B:76:0x016d, B:82:0x0190, B:81:0x0186, B:86:0x019b, B:90:0x01ab, B:94:0x01bb, B:95:0x01ce, B:106:0x01f9, B:112:0x0223, B:118:0x0233, B:115:0x0229, B:117:0x0231, B:109:0x021b, B:111:0x0221, B:119:0x0238, B:120:0x023e, B:179:0x0436, B:180:0x043b, B:182:0x043d, B:183:0x0442), top: B:189:0x0009, inners: #0 }] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: i */
    public final void m156535i(Map map) {
        int i;
        int i2;
        int i3;
        int i4;
        synchronized (this.f134343k) {
            try {
                if (this.f134345m == null) {
                    m183979c("Not an activity context. Cannot resize.");
                    return;
                }
                if (this.f134344l.zzO() == null) {
                    m183979c("Webview is not yet available, size is not set.");
                    return;
                }
                if (this.f134344l.zzO().m211423i()) {
                    m183979c("Is interstitial. Cannot resize an interstitial.");
                    return;
                }
                if (this.f134344l.mo13730a0()) {
                    m183979c("Cannot resize an expanded banner.");
                    return;
                }
                if (!TextUtils.isEmpty((CharSequence) map.get("width"))) {
                    bxy0.m106934r();
                    this.f134342j = C2098b.m12375n((String) map.get("width"));
                }
                if (!TextUtils.isEmpty((CharSequence) map.get("height"))) {
                    bxy0.m106934r();
                    this.f134339g = C2098b.m12375n((String) map.get("height"));
                }
                if (!TextUtils.isEmpty((CharSequence) map.get("offsetX"))) {
                    bxy0.m106934r();
                    this.f134340h = C2098b.m12375n((String) map.get("offsetX"));
                }
                if (!TextUtils.isEmpty((CharSequence) map.get("offsetY"))) {
                    bxy0.m106934r();
                    this.f134341i = C2098b.m12375n((String) map.get("offsetY"));
                }
                if (!TextUtils.isEmpty((CharSequence) map.get("allowOffscreen"))) {
                    this.f134336d = Boolean.parseBoolean((String) map.get("allowOffscreen"));
                }
                String str = (String) map.get("customClosePosition");
                if (!TextUtils.isEmpty(str)) {
                    this.f134335c = str;
                }
                if (this.f134342j < 0 || this.f134339g < 0) {
                    m183979c("Invalid width and height options. Cannot resize.");
                    return;
                }
                Window window = this.f134345m.getWindow();
                if (window != null && window.getDecorView() != null) {
                    bxy0.m106934r();
                    int[] iArrM12382u = C2098b.m12382u(this.f134345m);
                    bxy0.m106934r();
                    int[] iArrM12378q = C2098b.m12378q(this.f134345m);
                    int i5 = iArrM12382u[0];
                    int i6 = iArrM12382u[1];
                    int i7 = this.f134342j;
                    int[] iArr = null;
                    if (i7 < 50 || i7 > i5) {
                        dct0.m115298g("Width is too small or too large.");
                    } else {
                        int i8 = this.f134339g;
                        if (i8 < 50 || i8 > i6) {
                            dct0.m115298g("Height is too small or too large.");
                        } else if (i8 == i6 && i7 == i5) {
                            dct0.m115298g("Cannot resize to a full-screen ad.");
                        } else if (this.f134336d) {
                            switch (this.f134335c) {
                                case "center":
                                    i = ((this.f134337e + this.f134340h) + (i7 >> 1)) - 25;
                                    i3 = ((this.f134338f + this.f134341i) + (i8 >> 1)) - 25;
                                    break;
                                case "top-left":
                                    i = this.f134337e + this.f134340h;
                                    i2 = this.f134338f;
                                case "bottom-left":
                                    i = this.f134337e + this.f134340h;
                                    i4 = this.f134338f;
                                    i3 = ((i4 + this.f134341i) + i8) - 50;
                                    break;
                                case "bottom-right":
                                    i = ((this.f134337e + this.f134340h) + i7) - 50;
                                    i4 = this.f134338f;
                                    i3 = ((i4 + this.f134341i) + i8) - 50;
                                    break;
                                case "bottom-center":
                                    i = ((this.f134337e + this.f134340h) + (i7 >> 1)) - 25;
                                    i4 = this.f134338f;
                                    i3 = ((i4 + this.f134341i) + i8) - 50;
                                    break;
                                case "top-center":
                                    i = ((this.f134337e + this.f134340h) + (i7 >> 1)) - 25;
                                    i2 = this.f134338f;
                                default:
                                    i = ((this.f134337e + this.f134340h) + i7) - 50;
                                    i2 = this.f134338f;
                                    i3 = i2 + this.f134341i;
                                    break;
                            }
                            if (i >= 0 && i + 50 <= i5 && i3 >= iArrM12378q[0] && i3 + 50 <= iArrM12378q[1]) {
                                iArr = new int[]{this.f134337e + this.f134340h, this.f134338f + this.f134341i};
                            }
                        } else {
                            bxy0.m106934r();
                            int[] iArrM12382u2 = C2098b.m12382u(this.f134345m);
                            bxy0.m106934r();
                            int[] iArrM12378q2 = C2098b.m12378q(this.f134345m);
                            int i9 = iArrM12382u2[0];
                            int i10 = this.f134337e + this.f134340h;
                            int i11 = this.f134338f + this.f134341i;
                            if (i10 < 0) {
                                i10 = 0;
                            } else {
                                int i12 = this.f134342j;
                                if (i10 + i12 > i9) {
                                    i10 = i9 - i12;
                                }
                            }
                            int i13 = iArrM12378q2[0];
                            if (i11 < i13) {
                                i11 = i13;
                            } else {
                                int i14 = this.f134339g;
                                int i15 = i11 + i14;
                                int i16 = iArrM12378q2[1];
                                if (i15 > i16) {
                                    i11 = i16 - i14;
                                }
                            }
                            iArr = new int[]{i10, i11};
                        }
                    }
                    if (iArr == null) {
                        m183979c("Resize location out of screen or close button is not visible.");
                        return;
                    }
                    k6s0.m148569b();
                    int iM167049z = obt0.m167049z(this.f134345m, this.f134342j);
                    k6s0.m148569b();
                    int iM167049z2 = obt0.m167049z(this.f134345m, this.f134339g);
                    ViewParent parent = ((View) this.f134344l).getParent();
                    if (parent == null || !(parent instanceof ViewGroup)) {
                        m183979c("Webview is detached, probably in the middle of a resize or expand.");
                        return;
                    }
                    ViewGroup viewGroup = (ViewGroup) parent;
                    viewGroup.removeView((View) this.f134344l);
                    PopupWindow popupWindow = this.f134350r;
                    if (popupWindow == null) {
                        this.f134352t = viewGroup;
                        bxy0.m106934r();
                        Object obj = this.f134344l;
                        ((View) obj).setDrawingCacheEnabled(true);
                        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(((View) obj).getDrawingCache());
                        ((View) obj).setDrawingCacheEnabled(false);
                        ImageView imageView = new ImageView(this.f134345m);
                        this.f134347o = imageView;
                        imageView.setImageBitmap(bitmapCreateBitmap);
                        this.f134346n = this.f134344l.zzO();
                        this.f134352t.addView(this.f134347o);
                    } else {
                        popupWindow.dismiss();
                    }
                    RelativeLayout relativeLayout = new RelativeLayout(this.f134345m);
                    this.f134351s = relativeLayout;
                    relativeLayout.setBackgroundColor(0);
                    this.f134351s.setLayoutParams(new ViewGroup.LayoutParams(iM167049z, iM167049z2));
                    bxy0.m106934r();
                    PopupWindow popupWindow2 = new PopupWindow((View) this.f134351s, iM167049z, iM167049z2, false);
                    this.f134350r = popupWindow2;
                    popupWindow2.setOutsideTouchable(false);
                    this.f134350r.setTouchable(true);
                    this.f134350r.setClippingEnabled(!this.f134336d);
                    this.f134351s.addView((View) this.f134344l, -1, -1);
                    this.f134348p = new LinearLayout(this.f134345m);
                    k6s0.m148569b();
                    int iM167049z3 = obt0.m167049z(this.f134345m, 50);
                    k6s0.m148569b();
                    RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(iM167049z3, obt0.m167049z(this.f134345m, 50));
                    String str2 = this.f134335c;
                    switch (str2.hashCode()) {
                        case -1364013995:
                            if (!str2.equals("center")) {
                                layoutParams.addRule(10);
                                layoutParams.addRule(11);
                            } else {
                                layoutParams.addRule(13);
                            }
                            break;
                        case -1012429441:
                            if (!str2.equals("top-left")) {
                                layoutParams.addRule(10);
                                layoutParams.addRule(11);
                            } else {
                                layoutParams.addRule(10);
                                layoutParams.addRule(9);
                            }
                            break;
                        case -655373719:
                            if (!str2.equals("bottom-left")) {
                                layoutParams.addRule(10);
                                layoutParams.addRule(11);
                            } else {
                                layoutParams.addRule(12);
                                layoutParams.addRule(9);
                            }
                            break;
                        case 1163912186:
                            if (!str2.equals("bottom-right")) {
                                layoutParams.addRule(10);
                                layoutParams.addRule(11);
                            } else {
                                layoutParams.addRule(12);
                                layoutParams.addRule(11);
                            }
                            break;
                        case 1288627767:
                            if (!str2.equals("bottom-center")) {
                                layoutParams.addRule(10);
                                layoutParams.addRule(11);
                            } else {
                                layoutParams.addRule(12);
                                layoutParams.addRule(14);
                            }
                            break;
                        case 1755462605:
                            if (!str2.equals("top-center")) {
                                layoutParams.addRule(10);
                                layoutParams.addRule(11);
                            } else {
                                layoutParams.addRule(10);
                                layoutParams.addRule(14);
                            }
                            break;
                        default:
                            layoutParams.addRule(10);
                            layoutParams.addRule(11);
                            break;
                    }
                    this.f134348p.setOnClickListener(new l0t0(this));
                    this.f134348p.setContentDescription("Close button");
                    this.f134351s.addView(this.f134348p, layoutParams);
                    try {
                        PopupWindow popupWindow3 = this.f134350r;
                        View decorView = window.getDecorView();
                        k6s0.m148569b();
                        int iM167049z4 = obt0.m167049z(this.f134345m, iArr[0]);
                        k6s0.m148569b();
                        popupWindow3.showAtLocation(decorView, 0, iM167049z4, obt0.m167049z(this.f134345m, iArr[1]));
                        int i17 = iArr[0];
                        int i18 = iArr[1];
                        t0t0 t0t0Var = this.f134349q;
                        if (t0t0Var != null) {
                            t0t0Var.mo146919a(i17, i18, this.f134342j, this.f134339g);
                        }
                        this.f134344l.mo13710G(xkt0.m211416b(iM167049z, iM167049z2));
                        int i19 = iArr[0];
                        int i20 = iArr[1];
                        bxy0.m106934r();
                        m183982f(i19, i20 - C2098b.m12378q(this.f134345m)[0], this.f134342j, this.f134339g);
                        m183983g("resized");
                        return;
                    } catch (RuntimeException e) {
                        m183979c("Cannot show popup window: " + e.getMessage());
                        this.f134351s.removeView((View) this.f134344l);
                        ViewGroup viewGroup2 = this.f134352t;
                        if (viewGroup2 != null) {
                            viewGroup2.removeView(this.f134347o);
                            this.f134352t.addView((View) this.f134344l);
                            this.f134344l.mo13710G(this.f134346n);
                        }
                        return;
                    }
                }
                m183979c("Activity context is not ready, cannot get window or decor view.");
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m156537k(int i, int i2, boolean z) {
        synchronized (this.f134343k) {
            this.f134337e = i;
            this.f134338f = i2;
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m156538l(int i, int i2) {
        this.f134337e = i;
        this.f134338f = i2;
    }

    /* JADX INFO: renamed from: m */
    public final boolean m156539m() {
        boolean z;
        synchronized (this.f134343k) {
            z = this.f134350r != null;
        }
        return z;
    }

    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public final void m156536j(boolean z) {
        this.f134350r.dismiss();
        this.f134351s.removeView((View) this.f134344l);
        ViewGroup viewGroup = this.f134352t;
        if (viewGroup != null) {
            viewGroup.removeView(this.f134347o);
            this.f134352t.addView((View) this.f134344l);
            this.f134344l.mo13710G(this.f134346n);
        }
        if (z) {
            m183983g("default");
            t0t0 t0t0Var = this.f134349q;
            if (t0t0Var != null) {
                t0t0Var.zzb();
            }
        }
        this.f134350r = null;
        this.f134351s = null;
        this.f134352t = null;
        this.f134348p = null;
    }
}
