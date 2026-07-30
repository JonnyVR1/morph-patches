package p149l;

import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class lhu0 extends kjs0 implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, yas0 {

    /* JADX INFO: renamed from: a */
    public View f128139a;

    /* JADX INFO: renamed from: b */
    public fgu0 f128140b;

    /* JADX INFO: renamed from: c */
    public ccu0 f128141c;

    /* JADX INFO: renamed from: d */
    public boolean f128142d = false;

    /* JADX INFO: renamed from: e */
    public boolean f128143e = false;

    public lhu0(ccu0 ccu0Var, ocu0 ocu0Var) {
        this.f128139a = ocu0Var.m163576S();
        this.f128140b = ocu0Var.m163580W();
        this.f128141c = ccu0Var;
        if (ocu0Var.m163595f0() != null) {
            ocu0Var.m163595f0().mo13707r0(this);
        }
    }

    /* JADX INFO: renamed from: o8 */
    public static final void m149854o8(ojs0 ojs0Var, int i) {
        try {
            ojs0Var.zze(i);
        } catch (RemoteException e) {
            x2t0.m206871i("#007 Could not call remote method.", e);
        }
    }

    private final void zzg() {
        View view;
        ccu0 ccu0Var = this.f128141c;
        if (ccu0Var == null || (view = this.f128139a) == null) {
            return;
        }
        Map map = Collections.EMPTY_MAP;
        ccu0Var.m106183i(view, map, map, ccu0.m106150E(view));
    }

    private final void zzh() {
        View view = this.f128139a;
        if (view == null) {
            return;
        }
        ViewParent parent = view.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.f128139a);
        }
    }

    @Override // p149l.ljs0
    /* JADX INFO: renamed from: U3 */
    public final void mo149855U3(uyl uylVar, ojs0 ojs0Var) throws RemoteException {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        if (this.f128142d) {
            x2t0.m206866d("Instream ad can not be shown after destroy().");
            m149854o8(ojs0Var, 2);
            return;
        }
        View view = this.f128139a;
        if (view == null || this.f128140b == null) {
            x2t0.m206866d("Instream internal error: ".concat(view == null ? "can not get video view." : "can not get video controller."));
            m149854o8(ojs0Var, 0);
            return;
        }
        if (this.f128143e) {
            x2t0.m206866d("Instream ad should not be used again.");
            m149854o8(ojs0Var, 1);
            return;
        }
        this.f128143e = true;
        zzh();
        ((ViewGroup) s050.m181847P2(uylVar)).addView(this.f128139a, new ViewGroup.LayoutParams(-1, -1));
        vny0.m199088z();
        f4t0.m119424a(this.f128139a, this);
        vny0.m199088z();
        f4t0.m119425b(this.f128139a, this);
        zzg();
        try {
            ojs0Var.zzf();
        } catch (RemoteException e) {
            x2t0.m206871i("#007 Could not call remote method.", e);
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        zzg();
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        zzg();
    }

    @Override // p149l.ljs0
    @Nullable
    public final fgu0 zzb() throws RemoteException {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        if (!this.f128142d) {
            return this.f128140b;
        }
        x2t0.m206866d("getVideoController: Instream ad should not be used after destroyed");
        return null;
    }

    @Override // p149l.ljs0
    @Nullable
    public final rbs0 zzc() {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        if (this.f128142d) {
            x2t0.m206866d("getVideoController: Instream ad should not be used after destroyed");
            return null;
        }
        ccu0 ccu0Var = this.f128141c;
        if (ccu0Var == null || ccu0Var.m106169O() == null) {
            return null;
        }
        return ccu0Var.m106169O().m115753a();
    }

    @Override // p149l.ljs0
    public final void zzd() throws RemoteException {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzh();
        ccu0 ccu0Var = this.f128141c;
        if (ccu0Var != null) {
            ccu0Var.mo106177b();
        }
        this.f128141c = null;
        this.f128139a = null;
        this.f128140b = null;
        this.f128142d = true;
    }

    @Override // p149l.ljs0
    public final void zze(uyl uylVar) throws RemoteException {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        mo149855U3(uylVar, new fhu0(this));
    }
}
