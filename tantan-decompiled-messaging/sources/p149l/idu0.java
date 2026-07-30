package p149l;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.ViewOnAttachStateChangeListenerC2272w;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class idu0 extends ccs0 implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, qeu0 {

    /* JADX INFO: renamed from: a */
    public final WeakReference f112683a;

    /* JADX INFO: renamed from: b */
    public final Map f112684b = new HashMap();

    /* JADX INFO: renamed from: c */
    public final Map f112685c = new HashMap();

    /* JADX INFO: renamed from: d */
    public final Map f112686d = new HashMap();

    /* JADX INFO: renamed from: e */
    public ccu0 f112687e;

    /* JADX INFO: renamed from: f */
    public ViewOnAttachStateChangeListenerC2272w f112688f;

    public idu0(View view, HashMap map, HashMap map2) {
        view.setOnTouchListener(this);
        view.setOnClickListener(this);
        vny0.m199088z();
        f4t0.m119424a(view, this);
        vny0.m199088z();
        f4t0.m119425b(view, this);
        this.f112683a = new WeakReference(view);
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            View view2 = (View) entry.getValue();
            if (view2 != null) {
                this.f112684b.put(str, new WeakReference(view2));
                if (!"1098".equals(str) && !"3011".equals(str)) {
                    view2.setOnTouchListener(this);
                    view2.setClickable(true);
                    view2.setOnClickListener(this);
                }
            }
        }
        this.f112686d.putAll(this.f112684b);
        for (Map.Entry entry2 : map2.entrySet()) {
            View view3 = (View) entry2.getValue();
            if (view3 != null) {
                this.f112685c.put((String) entry2.getKey(), new WeakReference(view3));
                view3.setOnTouchListener(this);
                view3.setClickable(false);
            }
        }
        this.f112686d.putAll(this.f112685c);
        this.f112688f = new ViewOnAttachStateChangeListenerC2272w(view.getContext(), view);
    }

    @Override // p149l.qeu0
    @Nullable
    /* JADX INFO: renamed from: B */
    public final synchronized View mo135627B(String str) {
        WeakReference weakReference = (WeakReference) this.f112686d.get(str);
        if (weakReference == null) {
            return null;
        }
        return (View) weakReference.get();
    }

    @Override // p149l.dcs0
    /* JADX INFO: renamed from: R */
    public final synchronized void mo110874R(uyl uylVar) {
        Object objM181847P2 = s050.m181847P2(uylVar);
        if (!(objM181847P2 instanceof ccu0)) {
            x2t0.m206869g("Not an instance of InternalNativeAd. This is most likely a transient error");
            return;
        }
        ccu0 ccu0Var = this.f112687e;
        if (ccu0Var != null) {
            ccu0Var.m106200z(this);
        }
        ccu0 ccu0Var2 = (ccu0) objM181847P2;
        if (!ccu0Var2.m106156A()) {
            x2t0.m206866d("Your account must be enabled to use this feature. Talk to your account manager to request this feature for your account.");
            return;
        }
        this.f112687e = ccu0Var2;
        ccu0Var2.m106199y(this);
        this.f112687e.m106191q(zzf());
    }

    @Override // p149l.qeu0
    /* JADX INFO: renamed from: Y2 */
    public final synchronized void mo135628Y2(String str, View view, boolean z) {
        this.f112686d.put(str, new WeakReference(view));
        if (!"1098".equals(str) && !"3011".equals(str)) {
            this.f112684b.put(str, new WeakReference(view));
            view.setClickable(true);
            view.setOnClickListener(this);
            view.setOnTouchListener(this);
        }
    }

    @Override // p149l.dcs0
    /* JADX INFO: renamed from: j2 */
    public final synchronized void mo110875j2(uyl uylVar) {
        try {
            if (this.f112687e != null) {
                Object objM181847P2 = s050.m181847P2(uylVar);
                if (!(objM181847P2 instanceof View)) {
                    x2t0.m206869g("Calling NativeAdViewHolderNonagonDelegate.setClickConfirmingView with wrong wrapped object");
                }
                this.f112687e.m106194t((View) objM181847P2);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.view.View.OnClickListener
    public final synchronized void onClick(View view) {
        ccu0 ccu0Var = this.f112687e;
        if (ccu0Var != null) {
            ccu0Var.m106185k(view, zzf(), zzl(), zzm(), true);
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final synchronized void onGlobalLayout() {
        ccu0 ccu0Var = this.f112687e;
        if (ccu0Var != null) {
            ccu0Var.m106183i(zzf(), zzl(), zzm(), ccu0.m106150E(zzf()));
        }
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final synchronized void onScrollChanged() {
        ccu0 ccu0Var = this.f112687e;
        if (ccu0Var != null) {
            ccu0Var.m106183i(zzf(), zzl(), zzm(), ccu0.m106150E(zzf()));
        }
    }

    @Override // android.view.View.OnTouchListener
    public final synchronized boolean onTouch(View view, MotionEvent motionEvent) {
        ccu0 ccu0Var = this.f112687e;
        if (ccu0Var != null) {
            ccu0Var.m106192r(view, motionEvent, zzf());
        }
        return false;
    }

    @Override // p149l.dcs0
    public final synchronized void zzd() {
        ccu0 ccu0Var = this.f112687e;
        if (ccu0Var != null) {
            ccu0Var.m106200z(this);
            this.f112687e = null;
        }
    }

    @Override // p149l.qeu0
    @Nullable
    public final View zzf() {
        return (View) this.f112683a.get();
    }

    @Override // p149l.qeu0
    @Nullable
    public final FrameLayout zzh() {
        return null;
    }

    @Override // p149l.qeu0
    public final ViewOnAttachStateChangeListenerC2272w zzi() {
        return this.f112688f;
    }

    @Override // p149l.qeu0
    @Nullable
    public final synchronized uyl zzj() {
        return null;
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @Override // p149l.qeu0
    public final synchronized String zzk() {
        return "1007";
    }

    @Override // p149l.qeu0
    public final synchronized Map zzl() {
        return this.f112686d;
    }

    @Override // p149l.qeu0
    public final synchronized Map zzm() {
        return this.f112684b;
    }

    @Override // p149l.qeu0
    @Nullable
    public final synchronized Map zzn() {
        return this.f112685c;
    }

    @Override // p149l.qeu0
    @Nullable
    public final synchronized JSONObject zzo() {
        return null;
    }

    @Override // p149l.qeu0
    @Nullable
    public final synchronized JSONObject zzp() {
        ccu0 ccu0Var = this.f112687e;
        if (ccu0Var == null) {
            return null;
        }
        return ccu0Var.m106173V(zzf(), zzl(), zzm());
    }
}
