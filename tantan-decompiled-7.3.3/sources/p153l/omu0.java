package p153l;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.ViewOnAttachStateChangeListenerC2295w;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class omu0 extends ils0 implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, wnu0 {

    /* JADX INFO: renamed from: a */
    public final WeakReference f147996a;

    /* JADX INFO: renamed from: b */
    public final Map f147997b = new HashMap();

    /* JADX INFO: renamed from: c */
    public final Map f147998c = new HashMap();

    /* JADX INFO: renamed from: d */
    public final Map f147999d = new HashMap();

    /* JADX INFO: renamed from: e */
    public ilu0 f148000e;

    /* JADX INFO: renamed from: f */
    public ViewOnAttachStateChangeListenerC2295w f148001f;

    public omu0(View view, HashMap map, HashMap map2) {
        view.setOnTouchListener(this);
        view.setOnClickListener(this);
        bxy0.m106942z();
        ldt0.m153789a(view, this);
        bxy0.m106942z();
        ldt0.m153790b(view, this);
        this.f147996a = new WeakReference(view);
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            View view2 = (View) entry.getValue();
            if (view2 != null) {
                this.f147997b.put(str, new WeakReference(view2));
                if (!"1098".equals(str) && !"3011".equals(str)) {
                    view2.setOnTouchListener(this);
                    view2.setClickable(true);
                    view2.setOnClickListener(this);
                }
            }
        }
        this.f147999d.putAll(this.f147997b);
        for (Map.Entry entry2 : map2.entrySet()) {
            View view3 = (View) entry2.getValue();
            if (view3 != null) {
                this.f147998c.put((String) entry2.getKey(), new WeakReference(view3));
                view3.setOnTouchListener(this);
                view3.setClickable(false);
            }
        }
        this.f147999d.putAll(this.f147998c);
        this.f148001f = new ViewOnAttachStateChangeListenerC2295w(view.getContext(), view);
    }

    @Override // p153l.wnu0
    @Nullable
    /* JADX INFO: renamed from: B */
    public final synchronized View mo168282B(String str) {
        WeakReference weakReference = (WeakReference) this.f147999d.get(str);
        if (weakReference == null) {
            return null;
        }
        return (View) weakReference.get();
    }

    @Override // p153l.jls0
    /* JADX INFO: renamed from: R */
    public final synchronized void mo146103R(p1m p1mVar) {
        Object objM134037P2 = h950.m134037P2(p1mVar);
        if (!(objM134037P2 instanceof ilu0)) {
            dct0.m115298g("Not an instance of InternalNativeAd. This is most likely a transient error");
            return;
        }
        ilu0 ilu0Var = this.f148000e;
        if (ilu0Var != null) {
            ilu0Var.m140721z(this);
        }
        ilu0 ilu0Var2 = (ilu0) objM134037P2;
        if (!ilu0Var2.m140678A()) {
            dct0.m115295d("Your account must be enabled to use this feature. Talk to your account manager to request this feature for your account.");
            return;
        }
        this.f148000e = ilu0Var2;
        ilu0Var2.m140720y(this);
        this.f148000e.m140712q(zzf());
    }

    @Override // p153l.wnu0
    /* JADX INFO: renamed from: Y2 */
    public final synchronized void mo168283Y2(String str, View view, boolean z) {
        this.f147999d.put(str, new WeakReference(view));
        if (!"1098".equals(str) && !"3011".equals(str)) {
            this.f147997b.put(str, new WeakReference(view));
            view.setClickable(true);
            view.setOnClickListener(this);
            view.setOnTouchListener(this);
        }
    }

    @Override // p153l.jls0
    /* JADX INFO: renamed from: j2 */
    public final synchronized void mo146104j2(p1m p1mVar) {
        try {
            if (this.f148000e != null) {
                Object objM134037P2 = h950.m134037P2(p1mVar);
                if (!(objM134037P2 instanceof View)) {
                    dct0.m115298g("Calling NativeAdViewHolderNonagonDelegate.setClickConfirmingView with wrong wrapped object");
                }
                this.f148000e.m140715t((View) objM134037P2);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.view.View.OnClickListener
    public final synchronized void onClick(View view) {
        ilu0 ilu0Var = this.f148000e;
        if (ilu0Var != null) {
            ilu0Var.m140706k(view, zzf(), zzl(), zzm(), true);
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final synchronized void onGlobalLayout() {
        ilu0 ilu0Var = this.f148000e;
        if (ilu0Var != null) {
            ilu0Var.m140704i(zzf(), zzl(), zzm(), ilu0.m140672E(zzf()));
        }
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final synchronized void onScrollChanged() {
        ilu0 ilu0Var = this.f148000e;
        if (ilu0Var != null) {
            ilu0Var.m140704i(zzf(), zzl(), zzm(), ilu0.m140672E(zzf()));
        }
    }

    @Override // android.view.View.OnTouchListener
    public final synchronized boolean onTouch(View view, MotionEvent motionEvent) {
        ilu0 ilu0Var = this.f148000e;
        if (ilu0Var != null) {
            ilu0Var.m140713r(view, motionEvent, zzf());
        }
        return false;
    }

    @Override // p153l.jls0
    public final synchronized void zzd() {
        ilu0 ilu0Var = this.f148000e;
        if (ilu0Var != null) {
            ilu0Var.m140721z(this);
            this.f148000e = null;
        }
    }

    @Override // p153l.wnu0
    @Nullable
    public final View zzf() {
        return (View) this.f147996a.get();
    }

    @Override // p153l.wnu0
    @Nullable
    public final FrameLayout zzh() {
        return null;
    }

    @Override // p153l.wnu0
    public final ViewOnAttachStateChangeListenerC2295w zzi() {
        return this.f148001f;
    }

    @Override // p153l.wnu0
    @Nullable
    public final synchronized p1m zzj() {
        return null;
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @Override // p153l.wnu0
    public final synchronized String zzk() {
        return "1007";
    }

    @Override // p153l.wnu0
    public final synchronized Map zzl() {
        return this.f147999d;
    }

    @Override // p153l.wnu0
    public final synchronized Map zzm() {
        return this.f147997b;
    }

    @Override // p153l.wnu0
    @Nullable
    public final synchronized Map zzn() {
        return this.f147998c;
    }

    @Override // p153l.wnu0
    @Nullable
    public final synchronized JSONObject zzo() {
        return null;
    }

    @Override // p153l.wnu0
    @Nullable
    public final synchronized JSONObject zzp() {
        ilu0 ilu0Var = this.f148000e;
        if (ilu0Var == null) {
            return null;
        }
        return ilu0Var.m140695V(zzf(), zzl(), zzm());
    }
}
