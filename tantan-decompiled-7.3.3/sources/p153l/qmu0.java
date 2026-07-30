package p153l;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.text.TextUtils;
import android.util.Base64;
import android.util.DisplayMetrics;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.ViewOnAttachStateChangeListenerC2295w;
import com.google.android.gms.internal.ads.zzgaa;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class qmu0 extends dls0 implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, wnu0 {

    /* JADX INFO: renamed from: o */
    public static final zzgaa f158420o = zzgaa.zzo("2011", "1009", "3010");

    /* JADX INFO: renamed from: a */
    public final String f158421a;

    /* JADX INFO: renamed from: c */
    public FrameLayout f158423c;

    /* JADX INFO: renamed from: d */
    public FrameLayout f158424d;

    /* JADX INFO: renamed from: e */
    public final xvw0 f158425e;

    /* JADX INFO: renamed from: f */
    public View f158426f;

    /* JADX INFO: renamed from: h */
    public ilu0 f158428h;

    /* JADX INFO: renamed from: i */
    public ViewOnAttachStateChangeListenerC2295w f158429i;

    /* JADX INFO: renamed from: k */
    public xks0 f158431k;

    /* JADX INFO: renamed from: l */
    public boolean f158432l;

    /* JADX INFO: renamed from: n */
    public GestureDetector f158434n;

    /* JADX INFO: renamed from: b */
    public Map f158422b = new HashMap();

    /* JADX INFO: renamed from: j */
    public p1m f158430j = null;

    /* JADX INFO: renamed from: m */
    public boolean f158433m = false;

    /* JADX INFO: renamed from: g */
    public final int f158427g = 240304000;

    public qmu0(FrameLayout frameLayout, FrameLayout frameLayout2, int i) {
        String str;
        this.f158423c = frameLayout;
        this.f158424d = frameLayout2;
        String canonicalName = frameLayout.getClass().getCanonicalName();
        if ("com.google.android.gms.ads.formats.NativeContentAdView".equals(canonicalName)) {
            str = "1007";
        } else if ("com.google.android.gms.ads.formats.NativeAppInstallAdView".equals(canonicalName)) {
            str = "2009";
        } else {
            "com.google.android.gms.ads.formats.UnifiedNativeAdView".equals(canonicalName);
            str = "3012";
        }
        this.f158421a = str;
        bxy0.m106942z();
        ldt0.m153789a(frameLayout, this);
        bxy0.m106942z();
        ldt0.m153790b(frameLayout, this);
        this.f158425e = oct0.f146737e;
        this.f158429i = new ViewOnAttachStateChangeListenerC2295w(this.f158423c.getContext(), this.f158423c);
        frameLayout.setOnTouchListener(this);
        frameLayout.setOnClickListener(this);
    }

    /* JADX INFO: renamed from: b */
    private final synchronized void m177147b() {
        if (!((Boolean) jas0.m144075c().m176505a(sgs0.f168166Ua)).booleanValue() || this.f158428h.m140685I() == 0) {
            return;
        }
        this.f158434n = new GestureDetector(this.f158423c.getContext(), new cnu0(this.f158428h, this));
    }

    /* JADX INFO: renamed from: p6 */
    private final synchronized void m177148p6(String str) {
        DisplayMetrics displayMetrics;
        try {
            View frameLayout = new FrameLayout(this.f158424d.getContext());
            frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            Context context = this.f158424d.getContext();
            frameLayout.setClickable(false);
            frameLayout.setFocusable(false);
            if (!TextUtils.isEmpty(str)) {
                if (context.getApplicationContext() != null) {
                    context = context.getApplicationContext();
                }
                Resources resources = context.getResources();
                if (resources != null && (displayMetrics = resources.getDisplayMetrics()) != null) {
                    try {
                        byte[] bArrDecode = Base64.decode(str, 0);
                        BitmapDrawable bitmapDrawable = new BitmapDrawable(BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length));
                        bitmapDrawable.setTargetDensity(displayMetrics.densityDpi);
                        Shader.TileMode tileMode = Shader.TileMode.REPEAT;
                        bitmapDrawable.setTileModeXY(tileMode, tileMode);
                        frameLayout.setBackground(bitmapDrawable);
                    } catch (IllegalArgumentException e) {
                        dct0.m115299h("Encountered invalid base64 watermark.", e);
                    }
                }
            }
            this.f158424d.addView(frameLayout);
        } catch (Throwable th) {
            throw th;
        }
    }

    private final synchronized void zzu() {
        this.f158425e.execute(new Runnable() { // from class: l.pmu0
            @Override // java.lang.Runnable
            public final void run() {
                this.f153234a.m177150q8();
            }
        });
    }

    @Override // p153l.wnu0
    @Nullable
    /* JADX INFO: renamed from: B */
    public final synchronized View mo168282B(String str) {
        WeakReference weakReference;
        if (!this.f158433m && (weakReference = (WeakReference) this.f158422b.get(str)) != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // p153l.els0
    /* JADX INFO: renamed from: B7 */
    public final synchronized void mo110698B7(String str, p1m p1mVar) {
        mo168283Y2(str, (View) h950.m134037P2(p1mVar), true);
    }

    @Override // p153l.els0
    /* JADX INFO: renamed from: I6 */
    public final synchronized void mo110699I6(p1m p1mVar) {
        if (this.f158433m) {
            return;
        }
        this.f158430j = p1mVar;
    }

    @Override // p153l.els0
    /* JADX INFO: renamed from: R7 */
    public final synchronized void mo110700R7(p1m p1mVar) {
        if (this.f158433m) {
            return;
        }
        Object objM134037P2 = h950.m134037P2(p1mVar);
        if (!(objM134037P2 instanceof ilu0)) {
            dct0.m115298g("Not an instance of native engine. This is most likely a transient error");
            return;
        }
        ilu0 ilu0Var = this.f158428h;
        if (ilu0Var != null) {
            ilu0Var.m140721z(this);
        }
        zzu();
        ilu0 ilu0Var2 = (ilu0) objM134037P2;
        this.f158428h = ilu0Var2;
        ilu0Var2.m140720y(this);
        this.f158428h.m140712q(this.f158423c);
        this.f158428h.m140696Y(this.f158424d);
        if (this.f158432l) {
            this.f158428h.m140691O().m150398b(this.f158431k);
        }
        if (((Boolean) jas0.m144075c().m176505a(sgs0.f168087O3)).booleanValue() && !TextUtils.isEmpty(this.f158428h.m140693S())) {
            m177148p6(this.f158428h.m140693S());
        }
        m177147b();
    }

    @Override // p153l.wnu0
    /* JADX INFO: renamed from: Y2 */
    public final synchronized void mo168283Y2(String str, View view, boolean z) {
        if (!this.f158433m) {
            Map map = this.f158422b;
            if (view == null) {
                map.remove(str);
                return;
            }
            map.put(str, new WeakReference(view));
            if (!"1098".equals(str) && !"3011".equals(str)) {
                if (d4t0.m114243i(this.f158427g)) {
                    view.setOnTouchListener(this);
                }
                view.setClickable(true);
                view.setOnClickListener(this);
            }
        }
    }

    @Override // p153l.els0
    /* JADX INFO: renamed from: b7 */
    public final synchronized void mo110701b7(p1m p1mVar, int i) {
    }

    @Override // p153l.els0
    /* JADX INFO: renamed from: d1 */
    public final synchronized void mo110702d1(xks0 xks0Var) {
        if (!this.f158433m) {
            this.f158432l = true;
            this.f158431k = xks0Var;
            ilu0 ilu0Var = this.f158428h;
            if (ilu0Var != null) {
                ilu0Var.m140691O().m150398b(xks0Var);
            }
        }
    }

    @Override // p153l.els0
    /* JADX INFO: renamed from: i7 */
    public final synchronized void mo110703i7(p1m p1mVar) {
        this.f158428h.m140715t((View) h950.m134037P2(p1mVar));
    }

    @Override // android.view.View.OnClickListener
    public final synchronized void onClick(View view) {
        ilu0 ilu0Var = this.f158428h;
        if (ilu0Var == null || !ilu0Var.m140679B()) {
            return;
        }
        this.f158428h.m140697Z();
        this.f158428h.m140706k(view, this.f158423c, zzl(), zzm(), false);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final synchronized void onGlobalLayout() {
        ilu0 ilu0Var = this.f158428h;
        if (ilu0Var != null) {
            FrameLayout frameLayout = this.f158423c;
            ilu0Var.m140704i(frameLayout, zzl(), zzm(), ilu0.m140672E(frameLayout));
        }
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final synchronized void onScrollChanged() {
        ilu0 ilu0Var = this.f158428h;
        if (ilu0Var != null) {
            FrameLayout frameLayout = this.f158423c;
            ilu0Var.m140704i(frameLayout, zzl(), zzm(), ilu0.m140672E(frameLayout));
        }
    }

    @Override // android.view.View.OnTouchListener
    public final synchronized boolean onTouch(View view, MotionEvent motionEvent) {
        ilu0 ilu0Var = this.f158428h;
        if (ilu0Var != null) {
            ilu0Var.m140713r(view, motionEvent, this.f158423c);
            if (((Boolean) jas0.m144075c().m176505a(sgs0.f168166Ua)).booleanValue() && this.f158434n != null && this.f158428h.m140685I() != 0) {
                this.f158434n.onTouchEvent(motionEvent);
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: p8 */
    public final FrameLayout m177149p8() {
        return this.f158423c;
    }

    /* JADX INFO: renamed from: q8 */
    public final /* synthetic */ void m177150q8() {
        if (this.f158426f == null) {
            View view = new View(this.f158423c.getContext());
            this.f158426f = view;
            view.setLayoutParams(new FrameLayout.LayoutParams(-1, 0));
        }
        if (this.f158423c != this.f158426f.getParent()) {
            this.f158423c.addView(this.f158426f);
        }
    }

    @Override // p153l.els0
    /* JADX INFO: renamed from: x */
    public final void mo110704x(p1m p1mVar) {
        onTouch(this.f158423c, (MotionEvent) h950.m134037P2(p1mVar));
    }

    @Override // p153l.els0
    public final synchronized p1m zzb(String str) {
        return h950.m134038Y2(mo168282B(str));
    }

    @Override // p153l.els0
    public final synchronized void zzc() {
        try {
            if (this.f158433m) {
                return;
            }
            ilu0 ilu0Var = this.f158428h;
            if (ilu0Var != null) {
                ilu0Var.m140721z(this);
                this.f158428h = null;
            }
            this.f158422b.clear();
            this.f158423c.removeAllViews();
            this.f158424d.removeAllViews();
            this.f158422b = null;
            this.f158423c = null;
            this.f158424d = null;
            this.f158426f = null;
            this.f158429i = null;
            this.f158433m = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // p153l.wnu0
    public final /* synthetic */ View zzf() {
        return this.f158423c;
    }

    @Override // p153l.wnu0
    public final FrameLayout zzh() {
        return this.f158424d;
    }

    @Override // p153l.wnu0
    public final ViewOnAttachStateChangeListenerC2295w zzi() {
        return this.f158429i;
    }

    @Override // p153l.wnu0
    @Nullable
    public final p1m zzj() {
        return this.f158430j;
    }

    @Override // p153l.wnu0
    public final synchronized String zzk() {
        return this.f158421a;
    }

    @Override // p153l.wnu0
    public final synchronized Map zzl() {
        return this.f158422b;
    }

    @Override // p153l.wnu0
    public final synchronized Map zzm() {
        return this.f158422b;
    }

    @Override // p153l.wnu0
    @Nullable
    public final synchronized Map zzn() {
        return null;
    }

    @Override // p153l.wnu0
    @Nullable
    public final synchronized JSONObject zzo() {
        ilu0 ilu0Var = this.f158428h;
        if (ilu0Var == null) {
            return null;
        }
        return ilu0Var.m140694U(this.f158423c, zzl(), zzm());
    }

    @Override // p153l.wnu0
    @Nullable
    public final synchronized JSONObject zzp() {
        ilu0 ilu0Var = this.f158428h;
        if (ilu0Var == null) {
            return null;
        }
        return ilu0Var.m140695V(this.f158423c, zzl(), zzm());
    }
}
