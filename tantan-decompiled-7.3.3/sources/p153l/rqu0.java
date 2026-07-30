package p153l;

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
public final class rqu0 extends qss0 implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, eks0 {

    /* JADX INFO: renamed from: a */
    public View f164520a;

    /* JADX INFO: renamed from: b */
    public lpu0 f164521b;

    /* JADX INFO: renamed from: c */
    public ilu0 f164522c;

    /* JADX INFO: renamed from: d */
    public boolean f164523d = false;

    /* JADX INFO: renamed from: e */
    public boolean f164524e = false;

    public rqu0(ilu0 ilu0Var, ulu0 ulu0Var) {
        this.f164520a = ulu0Var.m196583S();
        this.f164521b = ulu0Var.m196587W();
        this.f164522c = ilu0Var;
        if (ulu0Var.m196602f0() != null) {
            ulu0Var.m196602f0().mo13761r0(this);
        }
    }

    /* JADX INFO: renamed from: o8 */
    public static final void m182674o8(uss0 uss0Var, int i) {
        try {
            uss0Var.zze(i);
        } catch (RemoteException e) {
            dct0.m115300i("#007 Could not call remote method.", e);
        }
    }

    private final void zzg() {
        View view;
        ilu0 ilu0Var = this.f164522c;
        if (ilu0Var == null || (view = this.f164520a) == null) {
            return;
        }
        Map map = Collections.EMPTY_MAP;
        ilu0Var.m140704i(view, map, map, ilu0.m140672E(view));
    }

    private final void zzh() {
        View view = this.f164520a;
        if (view == null) {
            return;
        }
        ViewParent parent = view.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.f164520a);
        }
    }

    @Override // p153l.rss0
    /* JADX INFO: renamed from: U3 */
    public final void mo182675U3(p1m p1mVar, uss0 uss0Var) throws RemoteException {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        if (this.f164523d) {
            dct0.m115295d("Instream ad can not be shown after destroy().");
            m182674o8(uss0Var, 2);
            return;
        }
        View view = this.f164520a;
        if (view == null || this.f164521b == null) {
            dct0.m115295d("Instream internal error: ".concat(view == null ? "can not get video view." : "can not get video controller."));
            m182674o8(uss0Var, 0);
            return;
        }
        if (this.f164524e) {
            dct0.m115295d("Instream ad should not be used again.");
            m182674o8(uss0Var, 1);
            return;
        }
        this.f164524e = true;
        zzh();
        ((ViewGroup) h950.m134037P2(p1mVar)).addView(this.f164520a, new ViewGroup.LayoutParams(-1, -1));
        bxy0.m106942z();
        ldt0.m153789a(this.f164520a, this);
        bxy0.m106942z();
        ldt0.m153790b(this.f164520a, this);
        zzg();
        try {
            uss0Var.zzf();
        } catch (RemoteException e) {
            dct0.m115300i("#007 Could not call remote method.", e);
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

    @Override // p153l.rss0
    @Nullable
    public final lpu0 zzb() throws RemoteException {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        if (!this.f164523d) {
            return this.f164521b;
        }
        dct0.m115295d("getVideoController: Instream ad should not be used after destroyed");
        return null;
    }

    @Override // p153l.rss0
    @Nullable
    public final xks0 zzc() {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        if (this.f164523d) {
            dct0.m115295d("getVideoController: Instream ad should not be used after destroyed");
            return null;
        }
        ilu0 ilu0Var = this.f164522c;
        if (ilu0Var == null || ilu0Var.m140691O() == null) {
            return null;
        }
        return ilu0Var.m140691O().m150397a();
    }

    @Override // p153l.rss0
    public final void zzd() throws RemoteException {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzh();
        ilu0 ilu0Var = this.f164522c;
        if (ilu0Var != null) {
            ilu0Var.mo127848b();
        }
        this.f164522c = null;
        this.f164520a = null;
        this.f164521b = null;
        this.f164523d = true;
    }

    @Override // p153l.rss0
    public final void zze(p1m p1mVar) throws RemoteException {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        mo182675U3(p1mVar, new lqu0(this));
    }
}
