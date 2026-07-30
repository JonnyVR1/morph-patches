package p149l;

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
import com.google.android.gms.ads.internal.util.C2075b;
import com.google.android.gms.common.util.CollectionUtils;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public final class grs0 extends mrs0 {

    /* JADX INFO: renamed from: u */
    public static final Set f104087u = CollectionUtils.setOf("top-left", "top-right", "top-center", "center", "bottom-left", "bottom-right", "bottom-center");

    /* JADX INFO: renamed from: c */
    public String f104088c;

    /* JADX INFO: renamed from: d */
    public boolean f104089d;

    /* JADX INFO: renamed from: e */
    public int f104090e;

    /* JADX INFO: renamed from: f */
    public int f104091f;

    /* JADX INFO: renamed from: g */
    public int f104092g;

    /* JADX INFO: renamed from: h */
    public int f104093h;

    /* JADX INFO: renamed from: i */
    public int f104094i;

    /* JADX INFO: renamed from: j */
    public int f104095j;

    /* JADX INFO: renamed from: k */
    public final Object f104096k;

    /* JADX INFO: renamed from: l */
    public final q9t0 f104097l;

    /* JADX INFO: renamed from: m */
    public final Activity f104098m;

    /* JADX INFO: renamed from: n */
    public rbt0 f104099n;

    /* JADX INFO: renamed from: o */
    public ImageView f104100o;

    /* JADX INFO: renamed from: p */
    public LinearLayout f104101p;

    /* JADX INFO: renamed from: q */
    public final nrs0 f104102q;

    /* JADX INFO: renamed from: r */
    public PopupWindow f104103r;

    /* JADX INFO: renamed from: s */
    public RelativeLayout f104104s;

    /* JADX INFO: renamed from: t */
    public ViewGroup f104105t;

    public grs0(q9t0 q9t0Var, nrs0 nrs0Var) {
        super(q9t0Var, "resize");
        this.f104088c = "top-right";
        this.f104089d = true;
        this.f104090e = 0;
        this.f104091f = 0;
        this.f104092g = -1;
        this.f104093h = 0;
        this.f104094i = 0;
        this.f104095j = -1;
        this.f104096k = new Object();
        this.f104097l = q9t0Var;
        this.f104098m = q9t0Var.zzi();
        this.f104102q = nrs0Var;
    }

    /* JADX INFO: renamed from: h */
    public final void m127766h(final boolean z) {
        synchronized (this.f104096k) {
            try {
                if (this.f104103r != null) {
                    if (!((Boolean) d1s0.m109677c().m144697a(m7s0.f132362pa)).booleanValue() || Looper.getMainLooper().getThread() == Thread.currentThread()) {
                        m127768j(z);
                    } else {
                        i3t0.f111376e.mo122103a(new Runnable() { // from class: l.ers0
                            @Override // java.lang.Runnable
                            public final void run() {
                                this.f92965a.m127768j(z);
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
    public final void m127767i(Map map) {
        int i;
        int i2;
        int i3;
        int i4;
        synchronized (this.f104096k) {
            try {
                if (this.f104098m == null) {
                    m156080c("Not an activity context. Cannot resize.");
                    return;
                }
                if (this.f104097l.zzO() == null) {
                    m156080c("Webview is not yet available, size is not set.");
                    return;
                }
                if (this.f104097l.zzO().m178700i()) {
                    m156080c("Is interstitial. Cannot resize an interstitial.");
                    return;
                }
                if (this.f104097l.mo13676a0()) {
                    m156080c("Cannot resize an expanded banner.");
                    return;
                }
                if (!TextUtils.isEmpty((CharSequence) map.get("width"))) {
                    vny0.m199080r();
                    this.f104095j = C2075b.m12321n((String) map.get("width"));
                }
                if (!TextUtils.isEmpty((CharSequence) map.get("height"))) {
                    vny0.m199080r();
                    this.f104092g = C2075b.m12321n((String) map.get("height"));
                }
                if (!TextUtils.isEmpty((CharSequence) map.get("offsetX"))) {
                    vny0.m199080r();
                    this.f104093h = C2075b.m12321n((String) map.get("offsetX"));
                }
                if (!TextUtils.isEmpty((CharSequence) map.get("offsetY"))) {
                    vny0.m199080r();
                    this.f104094i = C2075b.m12321n((String) map.get("offsetY"));
                }
                if (!TextUtils.isEmpty((CharSequence) map.get("allowOffscreen"))) {
                    this.f104089d = Boolean.parseBoolean((String) map.get("allowOffscreen"));
                }
                String str = (String) map.get("customClosePosition");
                if (!TextUtils.isEmpty(str)) {
                    this.f104088c = str;
                }
                if (this.f104095j < 0 || this.f104092g < 0) {
                    m156080c("Invalid width and height options. Cannot resize.");
                    return;
                }
                Window window = this.f104098m.getWindow();
                if (window != null && window.getDecorView() != null) {
                    vny0.m199080r();
                    int[] iArrM12328u = C2075b.m12328u(this.f104098m);
                    vny0.m199080r();
                    int[] iArrM12324q = C2075b.m12324q(this.f104098m);
                    int i5 = iArrM12328u[0];
                    int i6 = iArrM12328u[1];
                    int i7 = this.f104095j;
                    int[] iArr = null;
                    if (i7 < 50 || i7 > i5) {
                        x2t0.m206869g("Width is too small or too large.");
                    } else {
                        int i8 = this.f104092g;
                        if (i8 < 50 || i8 > i6) {
                            x2t0.m206869g("Height is too small or too large.");
                        } else if (i8 == i6 && i7 == i5) {
                            x2t0.m206869g("Cannot resize to a full-screen ad.");
                        } else if (this.f104089d) {
                            switch (this.f104088c) {
                                case "center":
                                    i = ((this.f104090e + this.f104093h) + (i7 >> 1)) - 25;
                                    i3 = ((this.f104091f + this.f104094i) + (i8 >> 1)) - 25;
                                    break;
                                case "top-left":
                                    i = this.f104090e + this.f104093h;
                                    i2 = this.f104091f;
                                case "bottom-left":
                                    i = this.f104090e + this.f104093h;
                                    i4 = this.f104091f;
                                    i3 = ((i4 + this.f104094i) + i8) - 50;
                                    break;
                                case "bottom-right":
                                    i = ((this.f104090e + this.f104093h) + i7) - 50;
                                    i4 = this.f104091f;
                                    i3 = ((i4 + this.f104094i) + i8) - 50;
                                    break;
                                case "bottom-center":
                                    i = ((this.f104090e + this.f104093h) + (i7 >> 1)) - 25;
                                    i4 = this.f104091f;
                                    i3 = ((i4 + this.f104094i) + i8) - 50;
                                    break;
                                case "top-center":
                                    i = ((this.f104090e + this.f104093h) + (i7 >> 1)) - 25;
                                    i2 = this.f104091f;
                                default:
                                    i = ((this.f104090e + this.f104093h) + i7) - 50;
                                    i2 = this.f104091f;
                                    i3 = i2 + this.f104094i;
                                    break;
                            }
                            if (i >= 0 && i + 50 <= i5 && i3 >= iArrM12324q[0] && i3 + 50 <= iArrM12324q[1]) {
                                iArr = new int[]{this.f104090e + this.f104093h, this.f104091f + this.f104094i};
                            }
                        } else {
                            vny0.m199080r();
                            int[] iArrM12328u2 = C2075b.m12328u(this.f104098m);
                            vny0.m199080r();
                            int[] iArrM12324q2 = C2075b.m12324q(this.f104098m);
                            int i9 = iArrM12328u2[0];
                            int i10 = this.f104090e + this.f104093h;
                            int i11 = this.f104091f + this.f104094i;
                            if (i10 < 0) {
                                i10 = 0;
                            } else {
                                int i12 = this.f104095j;
                                if (i10 + i12 > i9) {
                                    i10 = i9 - i12;
                                }
                            }
                            int i13 = iArrM12324q2[0];
                            if (i11 < i13) {
                                i11 = i13;
                            } else {
                                int i14 = this.f104092g;
                                int i15 = i11 + i14;
                                int i16 = iArrM12324q2[1];
                                if (i15 > i16) {
                                    i11 = i16 - i14;
                                }
                            }
                            iArr = new int[]{i10, i11};
                        }
                    }
                    if (iArr == null) {
                        m156080c("Resize location out of screen or close button is not visible.");
                        return;
                    }
                    exr0.m118703b();
                    int iM134096z = i2t0.m134096z(this.f104098m, this.f104095j);
                    exr0.m118703b();
                    int iM134096z2 = i2t0.m134096z(this.f104098m, this.f104092g);
                    ViewParent parent = ((View) this.f104097l).getParent();
                    if (parent == null || !(parent instanceof ViewGroup)) {
                        m156080c("Webview is detached, probably in the middle of a resize or expand.");
                        return;
                    }
                    ViewGroup viewGroup = (ViewGroup) parent;
                    viewGroup.removeView((View) this.f104097l);
                    PopupWindow popupWindow = this.f104103r;
                    if (popupWindow == null) {
                        this.f104105t = viewGroup;
                        vny0.m199080r();
                        Object obj = this.f104097l;
                        ((View) obj).setDrawingCacheEnabled(true);
                        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(((View) obj).getDrawingCache());
                        ((View) obj).setDrawingCacheEnabled(false);
                        ImageView imageView = new ImageView(this.f104098m);
                        this.f104100o = imageView;
                        imageView.setImageBitmap(bitmapCreateBitmap);
                        this.f104099n = this.f104097l.zzO();
                        this.f104105t.addView(this.f104100o);
                    } else {
                        popupWindow.dismiss();
                    }
                    RelativeLayout relativeLayout = new RelativeLayout(this.f104098m);
                    this.f104104s = relativeLayout;
                    relativeLayout.setBackgroundColor(0);
                    this.f104104s.setLayoutParams(new ViewGroup.LayoutParams(iM134096z, iM134096z2));
                    vny0.m199080r();
                    PopupWindow popupWindow2 = new PopupWindow((View) this.f104104s, iM134096z, iM134096z2, false);
                    this.f104103r = popupWindow2;
                    popupWindow2.setOutsideTouchable(false);
                    this.f104103r.setTouchable(true);
                    this.f104103r.setClippingEnabled(!this.f104089d);
                    this.f104104s.addView((View) this.f104097l, -1, -1);
                    this.f104101p = new LinearLayout(this.f104098m);
                    exr0.m118703b();
                    int iM134096z3 = i2t0.m134096z(this.f104098m, 50);
                    exr0.m118703b();
                    RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(iM134096z3, i2t0.m134096z(this.f104098m, 50));
                    String str2 = this.f104088c;
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
                    this.f104101p.setOnClickListener(new frs0(this));
                    this.f104101p.setContentDescription("Close button");
                    this.f104104s.addView(this.f104101p, layoutParams);
                    try {
                        PopupWindow popupWindow3 = this.f104103r;
                        View decorView = window.getDecorView();
                        exr0.m118703b();
                        int iM134096z4 = i2t0.m134096z(this.f104098m, iArr[0]);
                        exr0.m118703b();
                        popupWindow3.showAtLocation(decorView, 0, iM134096z4, i2t0.m134096z(this.f104098m, iArr[1]));
                        int i17 = iArr[0];
                        int i18 = iArr[1];
                        nrs0 nrs0Var = this.f104102q;
                        if (nrs0Var != null) {
                            nrs0Var.mo112273a(i17, i18, this.f104095j, this.f104092g);
                        }
                        this.f104097l.mo13656G(rbt0.m178693b(iM134096z, iM134096z2));
                        int i19 = iArr[0];
                        int i20 = iArr[1];
                        vny0.m199080r();
                        m156083f(i19, i20 - C2075b.m12324q(this.f104098m)[0], this.f104095j, this.f104092g);
                        m156084g("resized");
                        return;
                    } catch (RuntimeException e) {
                        m156080c("Cannot show popup window: " + e.getMessage());
                        this.f104104s.removeView((View) this.f104097l);
                        ViewGroup viewGroup2 = this.f104105t;
                        if (viewGroup2 != null) {
                            viewGroup2.removeView(this.f104100o);
                            this.f104105t.addView((View) this.f104097l);
                            this.f104097l.mo13656G(this.f104099n);
                        }
                        return;
                    }
                }
                m156080c("Activity context is not ready, cannot get window or decor view.");
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m127769k(int i, int i2, boolean z) {
        synchronized (this.f104096k) {
            this.f104090e = i;
            this.f104091f = i2;
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m127770l(int i, int i2) {
        this.f104090e = i;
        this.f104091f = i2;
    }

    /* JADX INFO: renamed from: m */
    public final boolean m127771m() {
        boolean z;
        synchronized (this.f104096k) {
            z = this.f104103r != null;
        }
        return z;
    }

    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public final void m127768j(boolean z) {
        this.f104103r.dismiss();
        this.f104104s.removeView((View) this.f104097l);
        ViewGroup viewGroup = this.f104105t;
        if (viewGroup != null) {
            viewGroup.removeView(this.f104100o);
            this.f104105t.addView((View) this.f104097l);
            this.f104097l.mo13656G(this.f104099n);
        }
        if (z) {
            m156084g("default");
            nrs0 nrs0Var = this.f104102q;
            if (nrs0Var != null) {
                nrs0Var.zzb();
            }
        }
        this.f104103r = null;
        this.f104104s = null;
        this.f104105t = null;
        this.f104101p = null;
    }
}
