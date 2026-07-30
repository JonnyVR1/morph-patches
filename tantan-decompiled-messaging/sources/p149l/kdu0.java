package p149l;

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
import com.google.android.gms.internal.ads.ViewOnAttachStateChangeListenerC2272w;
import com.google.android.gms.internal.ads.zzgaa;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class kdu0 extends xbs0 implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, qeu0 {

    /* JADX INFO: renamed from: o */
    public static final zzgaa f122622o = zzgaa.zzo("2011", "1009", "3010");

    /* JADX INFO: renamed from: a */
    public final String f122623a;

    /* JADX INFO: renamed from: c */
    public FrameLayout f122625c;

    /* JADX INFO: renamed from: d */
    public FrameLayout f122626d;

    /* JADX INFO: renamed from: e */
    public final rmw0 f122627e;

    /* JADX INFO: renamed from: f */
    public View f122628f;

    /* JADX INFO: renamed from: h */
    public ccu0 f122630h;

    /* JADX INFO: renamed from: i */
    public ViewOnAttachStateChangeListenerC2272w f122631i;

    /* JADX INFO: renamed from: k */
    public rbs0 f122633k;

    /* JADX INFO: renamed from: l */
    public boolean f122634l;

    /* JADX INFO: renamed from: n */
    public GestureDetector f122636n;

    /* JADX INFO: renamed from: b */
    public Map f122624b = new HashMap();

    /* JADX INFO: renamed from: j */
    public uyl f122632j = null;

    /* JADX INFO: renamed from: m */
    public boolean f122635m = false;

    /* JADX INFO: renamed from: g */
    public final int f122629g = 240304000;

    public kdu0(FrameLayout frameLayout, FrameLayout frameLayout2, int i) {
        String str;
        this.f122625c = frameLayout;
        this.f122626d = frameLayout2;
        String canonicalName = frameLayout.getClass().getCanonicalName();
        if ("com.google.android.gms.ads.formats.NativeContentAdView".equals(canonicalName)) {
            str = "1007";
        } else if ("com.google.android.gms.ads.formats.NativeAppInstallAdView".equals(canonicalName)) {
            str = "2009";
        } else {
            "com.google.android.gms.ads.formats.UnifiedNativeAdView".equals(canonicalName);
            str = "3012";
        }
        this.f122623a = str;
        vny0.m199088z();
        f4t0.m119424a(frameLayout, this);
        vny0.m199088z();
        f4t0.m119425b(frameLayout, this);
        this.f122627e = i3t0.f111376e;
        this.f122631i = new ViewOnAttachStateChangeListenerC2272w(this.f122625c.getContext(), this.f122625c);
        frameLayout.setOnTouchListener(this);
        frameLayout.setOnClickListener(this);
    }

    /* JADX INFO: renamed from: b */
    private final synchronized void m145681b() {
        if (!((Boolean) d1s0.m109677c().m144697a(m7s0.f132095Ua)).booleanValue() || this.f122630h.m106163I() == 0) {
            return;
        }
        this.f122636n = new GestureDetector(this.f122625c.getContext(), new wdu0(this.f122630h, this));
    }

    /* JADX INFO: renamed from: p6 */
    private final synchronized void m145682p6(String str) {
        DisplayMetrics displayMetrics;
        try {
            View frameLayout = new FrameLayout(this.f122626d.getContext());
            frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            Context context = this.f122626d.getContext();
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
                        x2t0.m206870h("Encountered invalid base64 watermark.", e);
                    }
                }
            }
            this.f122626d.addView(frameLayout);
        } catch (Throwable th) {
            throw th;
        }
    }

    private final synchronized void zzu() {
        this.f122627e.execute(new Runnable() { // from class: l.jdu0
            @Override // java.lang.Runnable
            public final void run() {
                this.f117441a.m145690q8();
            }
        });
    }

    @Override // p149l.qeu0
    @Nullable
    /* JADX INFO: renamed from: B */
    public final synchronized View mo135627B(String str) {
        WeakReference weakReference;
        if (!this.f122635m && (weakReference = (WeakReference) this.f122624b.get(str)) != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // p149l.ybs0
    /* JADX INFO: renamed from: B7 */
    public final synchronized void mo145683B7(String str, uyl uylVar) {
        mo135628Y2(str, (View) s050.m181847P2(uylVar), true);
    }

    @Override // p149l.ybs0
    /* JADX INFO: renamed from: I6 */
    public final synchronized void mo145684I6(uyl uylVar) {
        if (this.f122635m) {
            return;
        }
        this.f122632j = uylVar;
    }

    @Override // p149l.ybs0
    /* JADX INFO: renamed from: R7 */
    public final synchronized void mo145685R7(uyl uylVar) {
        if (this.f122635m) {
            return;
        }
        Object objM181847P2 = s050.m181847P2(uylVar);
        if (!(objM181847P2 instanceof ccu0)) {
            x2t0.m206869g("Not an instance of native engine. This is most likely a transient error");
            return;
        }
        ccu0 ccu0Var = this.f122630h;
        if (ccu0Var != null) {
            ccu0Var.m106200z(this);
        }
        zzu();
        ccu0 ccu0Var2 = (ccu0) objM181847P2;
        this.f122630h = ccu0Var2;
        ccu0Var2.m106199y(this);
        this.f122630h.m106191q(this.f122625c);
        this.f122630h.m106174Y(this.f122626d);
        if (this.f122634l) {
            this.f122630h.m106169O().m115754b(this.f122633k);
        }
        if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132016O3)).booleanValue() && !TextUtils.isEmpty(this.f122630h.m106171S())) {
            m145682p6(this.f122630h.m106171S());
        }
        m145681b();
    }

    @Override // p149l.qeu0
    /* JADX INFO: renamed from: Y2 */
    public final synchronized void mo135628Y2(String str, View view, boolean z) {
        if (!this.f122635m) {
            Map map = this.f122624b;
            if (view == null) {
                map.remove(str);
                return;
            }
            map.put(str, new WeakReference(view));
            if (!"1098".equals(str) && !"3011".equals(str)) {
                if (xus0.m211192i(this.f122629g)) {
                    view.setOnTouchListener(this);
                }
                view.setClickable(true);
                view.setOnClickListener(this);
            }
        }
    }

    @Override // p149l.ybs0
    /* JADX INFO: renamed from: b7 */
    public final synchronized void mo145686b7(uyl uylVar, int i) {
    }

    @Override // p149l.ybs0
    /* JADX INFO: renamed from: d1 */
    public final synchronized void mo145687d1(rbs0 rbs0Var) {
        if (!this.f122635m) {
            this.f122634l = true;
            this.f122633k = rbs0Var;
            ccu0 ccu0Var = this.f122630h;
            if (ccu0Var != null) {
                ccu0Var.m106169O().m115754b(rbs0Var);
            }
        }
    }

    @Override // p149l.ybs0
    /* JADX INFO: renamed from: i7 */
    public final synchronized void mo145688i7(uyl uylVar) {
        this.f122630h.m106194t((View) s050.m181847P2(uylVar));
    }

    @Override // android.view.View.OnClickListener
    public final synchronized void onClick(View view) {
        ccu0 ccu0Var = this.f122630h;
        if (ccu0Var == null || !ccu0Var.m106157B()) {
            return;
        }
        this.f122630h.m106175Z();
        this.f122630h.m106185k(view, this.f122625c, zzl(), zzm(), false);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final synchronized void onGlobalLayout() {
        ccu0 ccu0Var = this.f122630h;
        if (ccu0Var != null) {
            FrameLayout frameLayout = this.f122625c;
            ccu0Var.m106183i(frameLayout, zzl(), zzm(), ccu0.m106150E(frameLayout));
        }
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final synchronized void onScrollChanged() {
        ccu0 ccu0Var = this.f122630h;
        if (ccu0Var != null) {
            FrameLayout frameLayout = this.f122625c;
            ccu0Var.m106183i(frameLayout, zzl(), zzm(), ccu0.m106150E(frameLayout));
        }
    }

    @Override // android.view.View.OnTouchListener
    public final synchronized boolean onTouch(View view, MotionEvent motionEvent) {
        ccu0 ccu0Var = this.f122630h;
        if (ccu0Var != null) {
            ccu0Var.m106192r(view, motionEvent, this.f122625c);
            if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132095Ua)).booleanValue() && this.f122636n != null && this.f122630h.m106163I() != 0) {
                this.f122636n.onTouchEvent(motionEvent);
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: p8 */
    public final FrameLayout m145689p8() {
        return this.f122625c;
    }

    /* JADX INFO: renamed from: q8 */
    public final /* synthetic */ void m145690q8() {
        if (this.f122628f == null) {
            View view = new View(this.f122625c.getContext());
            this.f122628f = view;
            view.setLayoutParams(new FrameLayout.LayoutParams(-1, 0));
        }
        if (this.f122625c != this.f122628f.getParent()) {
            this.f122625c.addView(this.f122628f);
        }
    }

    @Override // p149l.ybs0
    /* JADX INFO: renamed from: x */
    public final void mo145691x(uyl uylVar) {
        onTouch(this.f122625c, (MotionEvent) s050.m181847P2(uylVar));
    }

    @Override // p149l.ybs0
    public final synchronized uyl zzb(String str) {
        return s050.m181848Y2(mo135627B(str));
    }

    @Override // p149l.ybs0
    public final synchronized void zzc() {
        try {
            if (this.f122635m) {
                return;
            }
            ccu0 ccu0Var = this.f122630h;
            if (ccu0Var != null) {
                ccu0Var.m106200z(this);
                this.f122630h = null;
            }
            this.f122624b.clear();
            this.f122625c.removeAllViews();
            this.f122626d.removeAllViews();
            this.f122624b = null;
            this.f122625c = null;
            this.f122626d = null;
            this.f122628f = null;
            this.f122631i = null;
            this.f122635m = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // p149l.qeu0
    public final /* synthetic */ View zzf() {
        return this.f122625c;
    }

    @Override // p149l.qeu0
    public final FrameLayout zzh() {
        return this.f122626d;
    }

    @Override // p149l.qeu0
    public final ViewOnAttachStateChangeListenerC2272w zzi() {
        return this.f122631i;
    }

    @Override // p149l.qeu0
    @Nullable
    public final uyl zzj() {
        return this.f122632j;
    }

    @Override // p149l.qeu0
    public final synchronized String zzk() {
        return this.f122623a;
    }

    @Override // p149l.qeu0
    public final synchronized Map zzl() {
        return this.f122624b;
    }

    @Override // p149l.qeu0
    public final synchronized Map zzm() {
        return this.f122624b;
    }

    @Override // p149l.qeu0
    @Nullable
    public final synchronized Map zzn() {
        return null;
    }

    @Override // p149l.qeu0
    @Nullable
    public final synchronized JSONObject zzo() {
        ccu0 ccu0Var = this.f122630h;
        if (ccu0Var == null) {
            return null;
        }
        return ccu0Var.m106172U(this.f122625c, zzl(), zzm());
    }

    @Override // p149l.qeu0
    @Nullable
    public final synchronized JSONObject zzp() {
        ccu0 ccu0Var = this.f122630h;
        if (ccu0Var == null) {
            return null;
        }
        return ccu0Var.m106173V(this.f122625c, zzl(), zzm());
    }
}
